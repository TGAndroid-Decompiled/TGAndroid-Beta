package org.telegram.ui.bots;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.microsoft.appcenter.utils.crypto.CryptoAesHandler$$ExternalSyntheticApiModelOutline5;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.BotStorage;

public class BotStorage {
    public final int account;
    public final long bot_id;
    public final Context context;
    public final boolean secured;
    public String storage_id;
    public final long user_id;

    public static class StorageConfig {
        long created_at;
        long edited_at;
        String storage_id;
        long user_id;
        String user_name;
    }

    public static boolean isSecuredSupported() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static File getDir() {
        try {
            File filesDir = ApplicationLoader.applicationContext.getFilesDir();
            if (filesDir != null) {
                File file = new File(filesDir, "apps_storage/");
                file.mkdirs();
                if (filesDir.exists() || filesDir.mkdirs()) {
                    if (filesDir.canWrite()) {
                        return file;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return new File("");
    }

    public BotStorage(Context context, int i, long j, long j2, boolean z) {
        this.context = context;
        this.account = i;
        this.bot_id = j2;
        this.user_id = j;
        this.secured = z;
    }

    private File getFile(String str) {
        File dir = getDir();
        StringBuilder sb = new StringBuilder();
        Object obj = str;
        if (!this.secured) {
            obj = Long.valueOf(this.user_id);
        }
        sb.append(obj);
        sb.append("_");
        sb.append(this.bot_id);
        sb.append(this.secured ? "_s" : "");
        File file = new File(dir, sb.toString());
        File dir2 = getDir();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.bot_id);
        sb2.append(this.secured ? "_s" : "");
        File file2 = new File(dir2, sb2.toString());
        if (!file.exists() && file2.exists()) {
            file2.renameTo(file);
        } else if (this.secured) {
            File file3 = new File(getDir(), this.user_id + "_" + this.bot_id + "_s");
            if (!file.exists() && file3.exists()) {
                file3.renameTo(file);
            }
        }
        return file;
    }

    public File getFile() {
        if (this.secured && TextUtils.isEmpty(this.storage_id)) {
            HashMap readConfig = readConfig();
            Iterator it = readConfig.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((StorageConfig) entry.getValue()).user_id == this.user_id) {
                    this.storage_id = (String) entry.getKey();
                    break;
                }
            }
            if (TextUtils.isEmpty(this.storage_id)) {
                this.storage_id = UUID.randomUUID().toString();
                StorageConfig storageConfig = new StorageConfig();
                storageConfig.storage_id = this.storage_id;
                storageConfig.user_id = this.user_id;
                storageConfig.user_name = DialogObject.getName(UserConfig.getInstance(this.account).getCurrentUser());
                long currentTimeMillis = System.currentTimeMillis();
                storageConfig.edited_at = currentTimeMillis;
                storageConfig.created_at = currentTimeMillis;
                readConfig.put(this.storage_id, storageConfig);
                saveConfig(readConfig);
            }
        }
        return getFile(this.storage_id);
    }

    private File getConfigFile() {
        return new File(getDir(), "secure_config.json");
    }

    private SecretKey getSecretKey() {
        KeyGenParameterSpec.Builder blockModes;
        KeyGenParameterSpec.Builder encryptionPaddings;
        KeyGenParameterSpec.Builder userAuthenticationRequired;
        KeyGenParameterSpec build;
        if (Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias("MiniAppsKey")) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            blockModes = CryptoAesHandler$$ExternalSyntheticApiModelOutline5.m("MiniAppsKey", 3).setBlockModes("GCM");
            encryptionPaddings = blockModes.setEncryptionPaddings("NoPadding");
            userAuthenticationRequired = encryptionPaddings.setUserAuthenticationRequired(false);
            build = userAuthenticationRequired.build();
            keyGenerator.init(build);
            keyGenerator.generateKey();
        }
        return (SecretKey) keyStore.getKey("MiniAppsKey", null);
    }

    private byte[] getBytes(File file) {
        byte[] bArr;
        FileInputStream fileInputStream = new FileInputStream(file);
        int length = (int) file.length();
        if (this.secured) {
            int read = fileInputStream.read();
            bArr = new byte[read];
            length = (length - 1) - read;
            fileInputStream.read(bArr);
        } else {
            bArr = null;
        }
        try {
            byte[] bArr2 = new byte[length];
            fileInputStream.read(bArr2);
            fileInputStream.close();
            if (!this.secured) {
                return bArr2;
            }
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, getSecretKey(), new GCMParameterSpec(128, bArr));
                return cipher.doFinal(bArr2);
            } catch (Exception e) {
                FileLog.e(e);
                setBytes(file, "{}".getBytes());
                throw new RuntimeException("UNKNOWN_ERROR");
            }
        } catch (OutOfMemoryError e2) {
            FileLog.e(e2);
            throw new RuntimeException("QUOTA_EXCEEDED");
        }
    }

    private void setBytes(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        if (this.secured) {
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, getSecretKey());
                byte[] iv = cipher.getIV();
                fileOutputStream.write(iv.length);
                fileOutputStream.write(iv);
                bArr = cipher.doFinal(bArr);
            } catch (Exception e) {
                FileLog.e(e);
                throw new RuntimeException("UNKNOWN_ERROR");
            }
        }
        fileOutputStream.write(bArr);
        fileOutputStream.close();
    }

    private JSONObject getJSON() {
        return getJSON(getFile());
    }

    private JSONObject getJSON(File file) {
        if (!file.exists() || file.length() > 5242880) {
            return new JSONObject();
        }
        try {
            return new JSONObject(new String(getBytes(file)));
        } catch (Exception e) {
            FileLog.e(e);
            return new JSONObject();
        }
    }

    private void setJSON(JSONObject jSONObject) {
        try {
            byte[] bytes = jSONObject.toString().getBytes();
            if (bytes.length > 5242880) {
                throw new RuntimeException("QUOTA_EXCEEDED");
            }
            try {
                setBytes(getFile(), bytes);
            } catch (Exception e) {
                FileLog.e(e);
                throw new RuntimeException("UNKNOWN_ERROR");
            }
        } catch (Exception e2) {
            FileLog.e(e2);
            throw new RuntimeException("UNKNOWN_ERROR");
        } catch (OutOfMemoryError e3) {
            FileLog.e(e3);
            throw new RuntimeException("QUOTA_EXCEEDED");
        }
    }

    public void setKey(String str, String str2) {
        if (this.secured && !isSecuredSupported()) {
            throw new RuntimeException("UNSUPPORTED");
        }
        if (str.length() + str2.length() > 5242880) {
            throw new RuntimeException("QUOTA_EXCEEDED");
        }
        JSONObject json = getJSON();
        try {
            json.put(str, str2);
            if (json.length() > 10 && this.secured) {
                throw new RuntimeException("QUOTA_EXCEEDED");
            }
            setJSON(json);
            if (this.secured) {
                try {
                    HashMap readConfig = readConfig();
                    StorageConfig storageConfig = (StorageConfig) readConfig.get(this.storage_id);
                    if (storageConfig != null) {
                        storageConfig.edited_at = System.currentTimeMillis();
                        saveConfig(readConfig);
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
            throw new RuntimeException("UNKNOWN_ERROR");
        }
    }

    public Pair getKey(String str) {
        JSONObject json;
        if (this.secured && !isSecuredSupported()) {
            throw new RuntimeException("UNSUPPORTED");
        }
        JSONObject json2 = getJSON();
        String optString = json2.optString(str);
        boolean z = false;
        if (this.secured && optString == null && !json2.keys().hasNext()) {
            final HashSet hashSet = new HashSet();
            for (int i = 0; i < 4; i++) {
                UserConfig userConfig = UserConfig.getInstance(i);
                if (userConfig.isClientActivated()) {
                    hashSet.add(Long.valueOf(userConfig.getClientUserId()));
                }
            }
            Iterator it = ((Set) Collection.EL.stream(readConfig().values()).filter(new Predicate() {
                public Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                public Predicate negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override
                public final boolean test(Object obj) {
                    boolean lambda$getKey$0;
                    lambda$getKey$0 = BotStorage.lambda$getKey$0(hashSet, (BotStorage.StorageConfig) obj);
                    return lambda$getKey$0;
                }
            }).collect(Collectors.toSet())).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    File file = getFile(((StorageConfig) it.next()).storage_id);
                    if (file.exists() && (json = getJSON(file)) != null && json.has(str)) {
                        z = true;
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        return new Pair(optString, Boolean.valueOf(z));
    }

    public static boolean lambda$getKey$0(HashSet hashSet, StorageConfig storageConfig) {
        return !hashSet.contains(Long.valueOf(storageConfig.user_id));
    }

    public List getStoragesWithKey(String str) {
        JSONObject json;
        if (this.secured && !isSecuredSupported()) {
            throw new RuntimeException("UNSUPPORTED");
        }
        if (getJSON().keys().hasNext()) {
            throw new RuntimeException("STORAGE_NOT_EMPTY");
        }
        ArrayList arrayList = new ArrayList();
        final HashSet hashSet = new HashSet();
        for (int i = 0; i < 4; i++) {
            UserConfig userConfig = UserConfig.getInstance(i);
            if (userConfig.isClientActivated()) {
                hashSet.add(Long.valueOf(userConfig.getClientUserId()));
            }
        }
        for (StorageConfig storageConfig : (Set) Collection.EL.stream(readConfig().values()).filter(new Predicate() {
            public Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override
            public final boolean test(Object obj) {
                boolean lambda$getStoragesWithKey$1;
                lambda$getStoragesWithKey$1 = BotStorage.lambda$getStoragesWithKey$1(hashSet, (BotStorage.StorageConfig) obj);
                return lambda$getStoragesWithKey$1;
            }
        }).collect(Collectors.toSet())) {
            try {
                File file = getFile(storageConfig.storage_id);
                if (file.exists() && (json = getJSON(file)) != null && json.has(str)) {
                    arrayList.add(storageConfig);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return arrayList;
    }

    public static boolean lambda$getStoragesWithKey$1(HashSet hashSet, StorageConfig storageConfig) {
        return !hashSet.contains(Long.valueOf(storageConfig.user_id));
    }

    public void restoreFrom(String str) {
        if (this.secured && !isSecuredSupported()) {
            throw new RuntimeException("UNSUPPORTED");
        }
        if (getJSON().keys().hasNext()) {
            throw new RuntimeException("STORAGE_NOT_EMPTY");
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 4; i++) {
            UserConfig userConfig = UserConfig.getInstance(i);
            if (userConfig.isClientActivated()) {
                hashSet.add(Long.valueOf(userConfig.getClientUserId()));
            }
        }
        HashMap readConfig = readConfig();
        StorageConfig storageConfig = (StorageConfig) readConfig.get(str);
        if (storageConfig == null) {
            throw new RuntimeException("STORAGE_NOT_FOUND");
        }
        storageConfig.user_id = this.user_id;
        storageConfig.user_name = DialogObject.getName(UserConfig.getInstance(this.account).getCurrentUser());
        storageConfig.edited_at = System.currentTimeMillis();
        saveConfig(readConfig);
        this.storage_id = storageConfig.storage_id;
    }

    public void clear() {
        setJSON(new JSONObject());
    }

    private byte[] getRawBytes(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[(int) file.length()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            return bArr;
        } catch (OutOfMemoryError e) {
            FileLog.e(e);
            throw new RuntimeException("QUOTA_EXCEEDED");
        }
    }

    private void saveRawBytes(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(bArr);
        fileOutputStream.close();
    }

    private HashMap readConfig() {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(new String(getRawBytes(getConfigFile())));
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                StorageConfig storageConfig = new StorageConfig();
                storageConfig.storage_id = next;
                storageConfig.user_id = jSONObject2.getLong("user_id");
                storageConfig.user_name = jSONObject2.getString("user_name");
                storageConfig.created_at = jSONObject2.getLong("created_at");
                storageConfig.edited_at = jSONObject2.getLong("edited_at");
                hashMap.put(next, storageConfig);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return hashMap;
    }

    private void saveConfig(HashMap hashMap) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("user_id", ((StorageConfig) entry.getValue()).user_id);
                jSONObject2.put("user_name", ((StorageConfig) entry.getValue()).user_name);
                jSONObject2.put("created_at", ((StorageConfig) entry.getValue()).created_at);
                jSONObject2.put("edited_at", ((StorageConfig) entry.getValue()).edited_at);
                jSONObject.put((String) entry.getKey(), jSONObject2);
            }
            saveRawBytes(getConfigFile(), jSONObject.toString().getBytes());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void showChooseStorage(Context context, List list, final Utilities.Callback callback) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        Theme.ResourcesProvider resourceProvider = safeLastFragment != null ? safeLastFragment.getResourceProvider() : null;
        final String[] strArr = new String[1];
        final boolean[] zArr = new boolean[1];
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourceProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        BackupImageView backupImageView = new BackupImageView(context);
        TLRPC.User user = MessagesController.getInstance(this.account).getUser(Long.valueOf(this.bot_id));
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setInfo(user);
        backupImageView.setForUserOrChat(user, avatarDrawable);
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(80, 80, 49, 0, 21, 0, 13));
        int i = Theme.key_windowBackgroundWhiteBlackText;
        TextView makeTextView = TextHelper.makeTextView(context, 20.0f, i, true);
        makeTextView.setText(LocaleController.getString(R.string.BotRestoreStorageTitle));
        makeTextView.setGravity(17);
        linearLayout.addView(makeTextView, LayoutHelper.createLinear(-1, -2, 7, 32, 0, 32, 10));
        TextView makeTextView2 = TextHelper.makeTextView(context, 14.0f, i, false);
        makeTextView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotRestoreStorageText, DialogObject.getDialogTitle(user))));
        makeTextView2.setGravity(17);
        linearLayout.addView(makeTextView2, LayoutHelper.createLinear(-1, -2, 7, 32, 0, 32, 19));
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, resourceProvider);
        textInfoPrivacyCell.setBackground(new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray, resourceProvider)), Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow, resourceProvider)));
        textInfoPrivacyCell.setFixedSize(12);
        linearLayout.addView(textInfoPrivacyCell, LayoutHelper.createLinear(-1, 12, 7, 0, 0, 0, 0));
        HeaderCell headerCell = new HeaderCell(context, resourceProvider);
        headerCell.setText(LocaleController.getString(R.string.BotRestoreStorageHeader));
        linearLayout.addView(headerCell, LayoutHelper.createLinear(-1, -2, 7, 0, 0, 0, 0));
        final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourceProvider);
        final ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < list.size()) {
            final StorageConfig storageConfig = (StorageConfig) list.get(i2);
            C1StorageCell c1StorageCell = new C1StorageCell(storageConfig, i2 < list.size() + (-1), context);
            c1StorageCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourceProvider), 2));
            c1StorageCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    BotStorage.lambda$showChooseStorage$2(strArr, storageConfig, arrayList, buttonWithCounterView, view);
                }
            });
            linearLayout.addView(c1StorageCell, LayoutHelper.createLinear(-1, 56));
            arrayList.add(c1StorageCell);
            i2++;
        }
        buttonWithCounterView.setText(LocaleController.getString(R.string.BotRestoreStorageButton), false);
        buttonWithCounterView.setEnabled(strArr[0] != null);
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 7, 8, 8, 8, 4));
        builder.setCustomView(linearLayout);
        final BottomSheet create = builder.create();
        create.fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, resourceProvider));
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                BotStorage.lambda$showChooseStorage$3(zArr, callback, strArr, create, view);
            }
        });
        create.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                BotStorage.lambda$showChooseStorage$4(zArr, callback, dialogInterface);
            }
        });
        create.show();
    }

    public class C1StorageCell extends FrameLayout {
        private final String id;
        private final boolean needDivider;
        private final RadioButton radioButton;
        final Context val$context;

        public C1StorageCell(StorageConfig storageConfig, boolean z, Context context) {
            super(context);
            this.val$context = context;
            this.id = storageConfig.storage_id;
            RadioButton radioButton = new RadioButton(context);
            this.radioButton = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.setColor(Theme.getColor(Theme.key_dialogRadioBackground), Theme.getColor(Theme.key_dialogRadioBackgroundChecked));
            addView(radioButton, LayoutHelper.createFrame(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
            TextView makeTextView = TextHelper.makeTextView(context, 16.0f, Theme.key_windowBackgroundWhiteBlackText, true);
            makeTextView.setText(storageConfig.user_name);
            addView(makeTextView, LayoutHelper.createLinear(-1, -2, 7, 62, 9, 8, 0));
            TextView makeTextView2 = TextHelper.makeTextView(context, 14.0f, Theme.key_windowBackgroundWhiteGrayText, false);
            makeTextView2.setText(LocaleController.formatString(R.string.BotRestoreStorageCreatedAt, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.formatSmallDateChat(storageConfig.created_at / 1000), LocaleController.getInstance().getFormatterDay().format(new Date(storageConfig.created_at / 1000)))));
            addView(makeTextView2, LayoutHelper.createLinear(-1, -2, 7, 62, 32, 8, 0));
            this.needDivider = z;
            setWillNotDraw(!z);
        }

        public void setChecked(boolean z) {
            this.radioButton.setChecked(z, true);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.needDivider) {
                canvas.drawLine(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }
    }

    public static void lambda$showChooseStorage$2(String[] strArr, StorageConfig storageConfig, ArrayList arrayList, ButtonWithCounterView buttonWithCounterView, View view) {
        strArr[0] = storageConfig.storage_id;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1StorageCell c1StorageCell = (C1StorageCell) it.next();
            c1StorageCell.setChecked(TextUtils.equals(c1StorageCell.id, strArr[0]));
        }
        buttonWithCounterView.setEnabled(strArr[0] != null);
    }

    public static void lambda$showChooseStorage$3(boolean[] zArr, Utilities.Callback callback, String[] strArr, BottomSheet bottomSheet, View view) {
        if (!zArr[0] && callback != null) {
            zArr[0] = true;
            callback.run(strArr[0]);
        }
        bottomSheet.lambda$new$0();
    }

    public static void lambda$showChooseStorage$4(boolean[] zArr, Utilities.Callback callback, DialogInterface dialogInterface) {
        if (zArr[0] || callback == null) {
            return;
        }
        zArr[0] = true;
        callback.run(null);
    }
}
