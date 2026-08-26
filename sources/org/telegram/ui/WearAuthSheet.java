package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.internal.clearcut.zze;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import com.google.android.gms.internal.safetynet.zzi;
import com.google.android.gms.wearable.internal.zzfp;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class WearAuthSheet {
    private static final int AES_GCM_IV_LEN = 12;
    private static final int DH_PUBKEY_LEN = 256;
    private static final int NONCE_LEN = 16;
    private static final String PATH_ANSWER = "/tg-wear-auth/answer";
    private static final String PATH_TOKEN = "/tg-wear-auth/token";
    private static final int SESSION_ID_LEN = 16;
    private static AuthSession currentSession;
    private static BottomSheet currentSheet;
    private static final BigInteger DH_P = new BigInteger("FFFFFFFFFFFFFFFFC90FDAA22168C234C4C6628B80DC1CD129024E088A67CC74020BBEA63B139B22514A08798E3404DDEF9519B3CD3A431B302B0A6DF25F14374FE1356D6D51C245E485B576625E7EC6F44C42E9A637ED6B0BFF5CB6F406B7EDEE386BFB5A899FA5AE9F24117C4B1FE649286651ECE45B3DC2007CB8A163BF0598DA48361C55D39A69163FA8FD24CF5F83655D23DCA3AD961C62F356208552BB9ED529077096966D670C354E4ABC9804F1746C08CA18217C32905E462E36CE3BE39E772C180E86039B2783A2EC07A28FB5C55DF06F4C52C9DE2BCBF6955817183995497CEA956AE515D2261898FA051015728E5A8AACAA68FFFFFFFFFFFFFFFF", 16);
    private static final BigInteger DH_G = BigInteger.valueOf(2);

    public static class AuthSession {
        List<String> emojis;
        byte[] noncePhone;
        final String originNodeId;
        final byte[] peerPub;
        BigInteger privateExponent;
        final byte[] sessionId;
        byte[] sharedKey;

        public AuthSession(byte[] bArr, byte[] bArr2, String str) {
            this.sessionId = bArr;
            this.peerPub = bArr2;
            this.originNodeId = str;
        }

        public byte[] acceptAndBuildAnswer() {
            SecureRandom secureRandom = new SecureRandom();
            BigInteger bigInteger = new BigInteger(2048, secureRandom);
            BigInteger bigIntegerModPow = WearAuthSheet.DH_G.modPow(bigInteger, WearAuthSheet.DH_P);
            if (!WearAuthSheet.isValidPub(bigIntegerModPow)) {
                throw new IllegalStateException("our pubkey invalid (extremely unlikely)");
            }
            byte[] bArrEncode256 = WearAuthSheet.encode256(bigIntegerModPow);
            BigInteger bigInteger2 = new BigInteger(1, this.peerPub);
            if (!WearAuthSheet.isValidPub(bigInteger2)) {
                throw new IllegalArgumentException("peer pubkey out of range");
            }
            byte[] bArrEncode257 = WearAuthSheet.encode256(bigInteger2.modPow(bigInteger, WearAuthSheet.DH_P));
            byte[] bArr = new byte[16];
            secureRandom.nextBytes(bArr);
            byte[] bArrSha256 = WearAuthSheet.sha256(bArrEncode257, this.sessionId, bArr);
            byte[] bArrSha257 = WearAuthSheet.sha256(bArrEncode257, this.peerPub);
            this.privateExponent = bigInteger;
            this.sharedKey = bArrSha256;
            this.noncePhone = bArr;
            this.emojis = WearAuthSheet.emojify(bArrSha257, 4);
            FileLog.d("wear-auth: built answer; session " + WearAuthSheet.hex(this.sessionId) + " emojis=" + this.emojis);
            byte[] bArr2 = new byte[288];
            System.arraycopy(this.sessionId, 0, bArr2, 0, 16);
            System.arraycopy(bArr, 0, bArr2, 16, 16);
            System.arraycopy(bArrEncode256, 0, bArr2, 32, 256);
            return bArr2;
        }
    }

    private static byte[] aeadEncrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, new SecretKeySpec(bArr, "AES"), new GCMParameterSpec(128, bArr2));
        if (bArr3 != null && bArr3.length > 0) {
            cipher.updateAAD(bArr3);
        }
        return cipher.doFinal(bArr4);
    }

    private static byte[] buildEncryptedTokenWire(AuthSession authSession, String str, int i, boolean z) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 9);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.putInt(bytes.length);
        byteBufferAllocate.put(bytes);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        byte[] bArrAeadEncrypt = aeadEncrypt(authSession.sharedKey, bArr, null, bArrArray);
        byte[] bArr2 = new byte[bArrAeadEncrypt.length + 28];
        System.arraycopy(authSession.sessionId, 0, bArr2, 0, 16);
        System.arraycopy(bArr, 0, bArr2, 16, 12);
        System.arraycopy(bArrAeadEncrypt, 0, bArr2, 28, bArrAeadEncrypt.length);
        return bArr2;
    }

    private static long bytesToLong(byte[] bArr, int i) {
        return (((long) bArr[i + 7]) & 255) | ((((long) bArr[i]) & 127) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
    }

    public static void cancel() {
        BottomSheet bottomSheet = currentSheet;
        if (bottomSheet != null) {
            bottomSheet.lambda$showGiftOfferSheet$15();
            currentSheet = null;
        }
    }

    public static List<String> emojify(byte[] bArr, int i) {
        String[] emojis = getEmojis();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(emojis[(int) (bytesToLong(bArr, i2 * 8) % ((long) emojis.length))]);
        }
        return arrayList;
    }

    public static byte[] encode256(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == 256) {
            return byteArray;
        }
        if (byteArray.length == 257 && byteArray[0] == 0) {
            return Arrays.copyOfRange(byteArray, 1, byteArray.length);
        }
        if (byteArray.length < 256) {
            byte[] bArr = new byte[256];
            System.arraycopy(byteArray, 0, bArr, 256 - byteArray.length, byteArray.length);
            return bArr;
        }
        throw new IllegalStateException("unexpected DH value size " + byteArray.length);
    }

    private static String[] getEmojis() {
        return new String[]{"👋", "👍", "👎", "👌", "👊", "🤟", "🫵", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "🪩", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "\u1fa8f", "⚖", "🧪", "🚪", "🫧", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "\u1fac6", "🧠", "💋"};
    }

    public static String hex(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    public static boolean isValidPub(BigInteger bigInteger) {
        BigInteger bigInteger2 = BigInteger.ONE;
        return bigInteger.compareTo(bigInteger2) > 0 && bigInteger.compareTo(DH_P.subtract(bigInteger2)) < 0;
    }

    public static int lambda$show$0(Integer num, Integer num2) {
        long j = UserConfig.getInstance(num.intValue()).loginTime;
        long j2 = UserConfig.getInstance(num2.intValue()).loginTime;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    public static void lambda$show$1(int[] iArr, int i, AvatarDrawable avatarDrawable, TLRPC.User user, BackupImageView backupImageView) {
        iArr[0] = i;
        avatarDrawable.setInfo(user);
        backupImageView.setForUserOrChat(user, avatarDrawable);
    }

    public static void lambda$show$2(BottomSheet bottomSheet, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, AvatarDrawable avatarDrawable, BackupImageView backupImageView, View view) {
        int[] iArr2;
        AvatarDrawable avatarDrawable2;
        BackupImageView backupImageView2;
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(bottomSheet.container, bottomSheet.getResourcesProvider(), frameLayout);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            int iIntValue = ((Integer) obj).intValue();
            TLRPC.User currentUser = UserConfig.getInstance(iIntValue).getCurrentUser();
            if (currentUser == null) {
                iArr2 = iArr;
                avatarDrawable2 = avatarDrawable;
                backupImageView2 = backupImageView;
            } else {
                iArr2 = iArr;
                avatarDrawable2 = avatarDrawable;
                backupImageView2 = backupImageView;
                itemOptionsMakeOptions.addAccount(iIntValue, iArr[0] == iIntValue, new WearAuthSheet$$ExternalSyntheticLambda0(iArr2, iIntValue, avatarDrawable2, currentUser, backupImageView2, 0));
            }
            iArr = iArr2;
            avatarDrawable = avatarDrawable2;
            backupImageView = backupImageView2;
        }
        itemOptionsMakeOptions.setDrawScrim(false).setOnTopOfScrim().setDimAlpha(0).setGravity(3).translate(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f)).show();
    }

    public static void lambda$show$3(AuthSession authSession, ButtonWithCounterView buttonWithCounterView, int[] iArr, Integer num) {
        FileLog.d("wear-auth: /answer delivered to " + authSession.originNodeId);
        buttonWithCounterView.setLoading(false);
        showEmojis(iArr[0], authSession.emojis);
    }

    public static void lambda$show$4(ButtonWithCounterView buttonWithCounterView, Exception exc) {
        FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
        buttonWithCounterView.setLoading(false);
    }

    public static void lambda$show$5(ButtonWithCounterView buttonWithCounterView, int[] iArr, View view) {
        AuthSession authSession;
        if (buttonWithCounterView.isLoading() || (authSession = currentSession) == null) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        Context applicationContext = view.getContext().getApplicationContext();
        try {
            byte[] bArrAcceptAndBuildAnswer = authSession.acceptAndBuildAnswer();
            zze zzeVar = new zze(applicationContext, GoogleApi.Settings.DEFAULT_SETTINGS);
            String str = authSession.originNodeId;
            zabv zabvVar = zzeVar.zai;
            zzi zziVar = new zzi(zabvVar, str, "/tg-wear-auth/answer", bArrAcceptAndBuildAnswer);
            zabvVar.zaa.zad(0, zziVar);
            zzah.toTask(zziVar, zzfp.zza).addOnSuccessListener(new WearAuthSheet$$ExternalSyntheticLambda5(authSession, buttonWithCounterView, iArr, 0)).addOnFailureListener(new WearAuthSheet$$ExternalSyntheticLambda4(buttonWithCounterView, 1));
        } catch (Exception e) {
            FileLog.e(e);
            buttonWithCounterView.setLoading(false);
        }
    }

    public static void lambda$showEmojis$6(AuthSession authSession, ButtonWithCounterView buttonWithCounterView, Integer num) {
        FileLog.d("wear-auth: /token delivered to " + authSession.originNodeId);
        buttonWithCounterView.setLoading(false);
        currentSession = null;
        cancel();
    }

    public static void lambda$showEmojis$7(ButtonWithCounterView buttonWithCounterView, Exception exc) {
        FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
        buttonWithCounterView.setLoading(false);
    }

    public static void lambda$showEmojis$8(ButtonWithCounterView buttonWithCounterView, BottomSheet bottomSheet, int i, View view, AuthSession authSession, TLRPC.UrlAuthResult urlAuthResult, TLRPC.TL_error tL_error) {
        buttonWithCounterView.setLoading(false);
        if (!(urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted)) {
            if (tL_error != null) {
                BulletinFactory.of(bottomSheet.topBulletinContainer, bottomSheet.getResourcesProvider()).showForError(tL_error);
                return;
            } else {
                BulletinFactory.of(bottomSheet.topBulletinContainer, bottomSheet.getResourcesProvider()).showForError("NO_TOKEN");
                return;
            }
        }
        String queryParameter = Uri.parse("?" + Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url).getFragment()).getQueryParameter("tgWebAuthToken");
        if (queryParameter == null) {
            BulletinFactory.of(bottomSheet.topBulletinContainer, bottomSheet.getResourcesProvider()).showForError("NO_TOKEN");
            return;
        }
        int currentDatacenterId = ConnectionsManager.getInstance(i).getCurrentDatacenterId();
        boolean zIsTestBackend = ConnectionsManager.getInstance(i).isTestBackend();
        StringBuilder sbM = DiffUtil.m("wear-auth: sending /token account=", i, " dcId=", currentDatacenterId, " isTest=");
        sbM.append(zIsTestBackend);
        FileLog.d(sbM.toString());
        Context applicationContext = view.getContext().getApplicationContext();
        try {
            byte[] bArrBuildEncryptedTokenWire = buildEncryptedTokenWire(authSession, queryParameter, currentDatacenterId, zIsTestBackend);
            zze zzeVar = new zze(applicationContext, GoogleApi.Settings.DEFAULT_SETTINGS);
            String str = authSession.originNodeId;
            zabv zabvVar = zzeVar.zai;
            zzi zziVar = new zzi(zabvVar, str, "/tg-wear-auth/token", bArrBuildEncryptedTokenWire);
            zabvVar.zaa.zad(0, zziVar);
            zzah.toTask(zziVar, zzfp.zza).addOnSuccessListener(new WearAuthSheet$$ExternalSyntheticLambda3(0, authSession, buttonWithCounterView)).addOnFailureListener(new WearAuthSheet$$ExternalSyntheticLambda4(buttonWithCounterView, 0));
            bottomSheet.lambda$showGiftOfferSheet$15();
        } catch (Exception e) {
            FileLog.e(e);
            BulletinFactory.of(bottomSheet.topBulletinContainer, bottomSheet.getResourcesProvider()).showForError(e.getMessage());
        }
    }

    public static void lambda$showEmojis$9(final ButtonWithCounterView buttonWithCounterView, final int i, final BottomSheet bottomSheet, final View view) {
        if (buttonWithCounterView.isLoading()) {
            return;
        }
        final AuthSession authSession = currentSession;
        if (authSession == null || authSession.sharedKey == null) {
            FileLog.d("wear-auth: login pressed with no session/key");
            return;
        }
        buttonWithCounterView.setLoading(true);
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
        tL_messages_requestUrlAuth.flags |= 4;
        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
        ConnectionsManager.getInstance(i).sendRequestTyped(tL_messages_requestUrlAuth, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                ButtonWithCounterView buttonWithCounterView2 = buttonWithCounterView;
                WearAuthSheet.AuthSession authSession2 = authSession;
                WearAuthSheet.lambda$showEmojis$8(buttonWithCounterView2, bottomSheet, i, view, authSession2, (TLRPC.UrlAuthResult) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void onCancelReceived() {
        FileLog.d("wear-auth: cancel received; dropping session and dismissing sheet");
        currentSession = null;
        cancel();
    }

    public static void onOfferReceived(byte[] bArr, String str) {
        if (bArr == null || bArr.length != 272) {
            StringBuilder sb = new StringBuilder("wear-auth: malformed offer (");
            sb.append(bArr == null ? -1 : bArr.length);
            sb.append(")");
            FileLog.d(sb.toString());
            return;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        AuthSession authSession = currentSession;
        if (authSession != null && Arrays.equals(authSession.sessionId, bArrCopyOfRange)) {
            FileLog.d("wear-auth: duplicate offer (same sessionId) — ignoring");
            return;
        }
        FileLog.d("wear-auth: new session " + hex(bArrCopyOfRange) + " from " + str);
        currentSession = new AuthSession(bArrCopyOfRange, bArrCopyOfRange2, str);
        show();
    }

    public static byte[] sha256(byte[]... bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (byte[] bArr2 : bArr) {
                messageDigest.update(bArr2);
            }
            return messageDigest.digest();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void show() {
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context == null) {
            return;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        Theme.ResourcesProvider resourceProvider = safeLastFragment != null ? safeLastFragment.getResourceProvider() : null;
        cancel();
        final BottomSheet bottomSheet = new BottomSheet(context, false, false, resourceProvider);
        bottomSheet.fixNavigationBar();
        FrameLayout frameLayout = new FrameLayout(context);
        bottomSheet.customView = frameLayout;
        int i = UserConfig.selectedAccount;
        final ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i2 = 0; i2 < 4; i2++) {
            if (UserConfig.getInstance(i2).isClientActivated()) {
                if (!ConnectionsManager.getInstance(i2).isTestBackend()) {
                    i = i2;
                }
                arrayList.add(Integer.valueOf(i2));
            }
        }
        Collections.sort(arrayList, new OAuthSheet$$ExternalSyntheticLambda10(20));
        if (arrayList.isEmpty()) {
            return;
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        final FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(14.0f), Theme.getColor(Theme.key_dialogBackgroundGray, resourceProvider)));
        final BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(14.0f));
        backupImageView.getImageReceiver().setCrossfadeWithOldImage(true);
        final AvatarDrawable avatarDrawable = new AvatarDrawable();
        final int[] iArr = {UserConfig.selectedAccount};
        TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
        avatarDrawable.setInfo(currentUser);
        backupImageView.setForUserOrChat(currentUser, avatarDrawable);
        frameLayout3.addView(backupImageView, LayoutHelper.createFrame(28, 28, 115));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogTextGray3, resourceProvider), PorterDuff.Mode.SRC_IN));
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, LayoutHelper.createFrame(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout2.addView(frameLayout3, LayoutHelper.createFrame(52, 28, 17));
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        frameLayout.addView(frameLayout2, LayoutHelper.createLinear(-2, -2, 0.0f, 51, 6, 4, 6, 0));
        ScaleStateListAnimator.apply(frameLayout2);
        if (arrayList.size() <= 1) {
            frameLayout2.setVisibility(8);
        }
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        frameLayout.addView(linearLayoutM, LayoutHelper.createFrame(-1, -1, 119));
        BackupImageView backupImageView2 = new BackupImageView(context);
        linearLayoutM.addView(backupImageView2, LayoutHelper.createLinear(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
        MediaDataController.getInstance(i).setPlaceholderImage(backupImageView2, "Utya3D", "😎", "130_130");
        int i3 = Theme.key_dialogTextBlack;
        TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, i3, true, resourceProvider);
        textViewMakeTextView.setGravity(17);
        textViewMakeTextView.setText(LocaleController.getString(R.string.WearAuthTitle));
        linearLayoutM.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
        TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, i3, false);
        textViewMakeTextView2.setGravity(17);
        textViewMakeTextView2.setText(LocaleController.getString(R.string.WearAuthText));
        linearLayoutM.addView(textViewMakeTextView2, LayoutHelper.createLinear(-1, -2, 49, 32, 0, 32, 24));
        ButtonWithCounterView buttonWithCounterViewM = zzkg.m(context, resourceProvider, true);
        buttonWithCounterViewM.setText(LocaleController.getString(R.string.Next));
        linearLayoutM.addView(buttonWithCounterViewM, LayoutHelper.createLinear(-1, 48, 7, 12, 12, 12, 8));
        int i4 = Theme.key_windowBackgroundGray;
        bottomSheet.setBackgroundColor(Theme.getColor(i4, resourceProvider));
        bottomSheet.fixNavigationBar(Theme.getColor(i4, resourceProvider));
        frameLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                WearAuthSheet.lambda$show$2(bottomSheet, frameLayout3, arrayList, iArr, avatarDrawable, backupImageView, view);
            }
        });
        buttonWithCounterViewM.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda40(1, buttonWithCounterViewM, iArr));
        currentSheet = bottomSheet;
        bottomSheet.show();
    }

    public static void showEmojis(int i, List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context == null) {
            return;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        Theme.ResourcesProvider resourceProvider = safeLastFragment != null ? safeLastFragment.getResourceProvider() : null;
        cancel();
        int i2 = 0;
        BottomSheet bottomSheet = new BottomSheet(context, false, false, resourceProvider);
        bottomSheet.fixNavigationBar();
        FrameLayout frameLayout = new FrameLayout(context);
        bottomSheet.customView = frameLayout;
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        frameLayout.addView(linearLayoutM, LayoutHelper.createFrame(-1, -1, 119));
        TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, Theme.key_dialogTextBlack, true, resourceProvider);
        textViewMakeTextView.setGravity(17);
        textViewMakeTextView.setText(LocaleController.getString(R.string.WearAuthEmojis));
        linearLayoutM.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        while (i2 < list.size()) {
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(list.get(i2));
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(emojiBigDrawable);
            NotificationCenter.listenEmojiLoading(imageView);
            imageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.multAlpha(0.15f, Theme.getColor(Theme.key_featuredStickers_addButton, resourceProvider))));
            linearLayout.addView(imageView, LayoutHelper.createLinear(80, 80, i2 == 0 ? 0.0f : 5.0f, 0.0f, 0.0f, 0.0f));
            i2++;
        }
        linearLayoutM.addView(linearLayout, LayoutHelper.createLinear(-2, -2, 49, 32, 12, 32, 12));
        ButtonWithCounterView buttonWithCounterViewM = zzkg.m(context, resourceProvider, true);
        buttonWithCounterViewM.setText(LocaleController.getString(R.string.WearAuthEmojisLogIn));
        linearLayoutM.addView(buttonWithCounterViewM, LayoutHelper.createLinear(-1, 48, 7, 12, 12, 12, 8));
        int i3 = Theme.key_windowBackgroundGray;
        bottomSheet.setBackgroundColor(Theme.getColor(i3, resourceProvider));
        bottomSheet.fixNavigationBar(Theme.getColor(i3, resourceProvider));
        currentSheet = bottomSheet;
        bottomSheet.show();
        buttonWithCounterViewM.setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda1(buttonWithCounterViewM, i, bottomSheet, 0));
    }
}
