package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class et implements Utilities.Callback {
    public final int f37446a;
    public final Object f37447b;
    public final Object f37448c;

    public et(int i10, Object obj, Object obj2) {
        this.f37446a = i10;
        this.f37447b = obj;
        this.f37448c = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        TLRPC.Document document;
        s4.d1 K;
        int i11 = this.f37446a;
        float f7 = -0.04f;
        float f10 = 0.25f;
        int i12 = 0;
        Object obj2 = this.f37448c;
        Object obj3 = this.f37447b;
        switch (i11) {
            case 0:
                qt qtVar = (qt) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                Long l4 = (Long) obj;
                qtVar.getClass();
                Bundle bundle = new Bundle();
                if (l4.longValue() >= 0) {
                    bundle.putLong("user_id", l4.longValue());
                } else {
                    bundle.putLong("chat_id", -l4.longValue());
                }
                m2Var.presentFragment(new ProfileActivity(bundle, null));
                qtVar.p();
                return;
            case 1:
                mt mtVar = (mt) obj3;
                Boolean bool = (Boolean) obj;
                mtVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    mtVar.f40073a.p();
                    return;
                }
                return;
            case 2:
                sy syVar = (sy) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    syVar.showDialog(new fk0(activity, !org.telegram.ui.Components.gf0.a(), new ew(activity, 0)));
                    return;
                }
                return;
            case 3:
                wp0 wp0Var = (wp0) obj2;
                Integer num = (Integer) obj;
                e10 e10Var = ((b10) obj3).f36237e;
                if (!e10Var.getUserConfig().isPremium()) {
                    e10Var.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) e10Var, 35, true));
                    return;
                }
                int intValue = num.intValue();
                e10Var.E = intValue;
                wp0Var.a(intValue, true);
                s00 s00Var = e10Var.I;
                if (s00Var != null) {
                    if (!e10Var.getUserConfig().isPremium()) {
                        i10 = -1;
                    } else {
                        i10 = e10Var.E;
                    }
                    s00Var.d(i10, true);
                }
                e10Var.i0(true);
                return;
            case 4:
                p50 p50Var = (p50) obj3;
                q50 q50Var = (q50) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (q50Var != null) {
                    p50Var.getClass();
                    q50Var.setVisibility(0);
                }
                p50Var.f40751c = bitmap;
                Paint paint = new Paint(1);
                p50Var.d = paint;
                Bitmap bitmap2 = p50Var.f40751c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                p50Var.f40752e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f10 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f10);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f7 = -0.02f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f7);
                p50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 5:
                dc0 dc0Var = (dc0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                dc0Var.c();
                if (user != null) {
                    long j3 = userArr[0].f20179id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.f20179id);
                    dc0Var.u(new cc0(bundle2, user, userArr, j3), false);
                    return;
                }
                return;
            case 6:
                rj0 rj0Var = (rj0) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = rj0Var.f41457f0;
                arrayList.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.f20179id)) && rj0Var.S(user2)) {
                            arrayList.add(user2);
                            hashSet.add(Long.valueOf(user2.f20179id));
                        }
                    }
                }
                Boolean bool2 = rj0Var.f41468r0;
                if (bool2 != null && bool2.booleanValue()) {
                    et etVar = new et(7, rj0Var, hashSet);
                    MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    if (str != null && !str.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f20078q = str;
                        tL_contacts_search.limit = 50;
                        i12 = connectionsManager.sendRequest(tL_contacts_search, new cj1(3, messagesController, etVar));
                    } else {
                        AndroidUtilities.runOnUIThread(new rg.x1(etVar, 9));
                    }
                    rj0Var.m0 = i12;
                    return;
                }
                rj0Var.V(true, true);
                return;
            case 7:
                rj0 rj0Var2 = (rj0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.f20179id)) && rj0Var2.S(user3)) {
                            rj0Var2.f41457f0.add(user3);
                            hashSet2.add(Long.valueOf(user3.f20179id));
                        }
                    }
                }
                rj0Var2.V(true, true);
                return;
            case 8:
                ck0 ck0Var = (ck0) obj3;
                String str2 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    ck0Var.R.setImageDrawable(null);
                    ck0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new uf0(7, ck0Var, str2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = ck0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(ck0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21118v6), PorterDuff.Mode.SRC_IN));
                    ck0Var.R.setImageDrawable(mutate);
                    if (user4.contact) {
                        ck0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new uf0(8, ck0Var, user4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        ck0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                ck0Var.y(false);
                return;
            case 9:
                ArrayList arrayList2 = (ArrayList) obj3;
                org.telegram.ui.Components.y9[] y9VarArr = (org.telegram.ui.Components.y9[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        String str3 = (String) arrayList2.get(i13);
                        int i14 = 0;
                        while (true) {
                            if (i14 < tL_messages_stickerSet.packs.size()) {
                                if (!tL_messages_stickerSet.packs.get(i14).documents.isEmpty() && TextUtils.equals(tL_messages_stickerSet.packs.get(i14).emoticon, str3)) {
                                    long longValue = tL_messages_stickerSet.packs.get(i14).documents.get(0).longValue();
                                    for (int i15 = 0; i15 < tL_messages_stickerSet.documents.size(); i15++) {
                                        if (tL_messages_stickerSet.documents.get(i15).f20038id == longValue) {
                                            document = tL_messages_stickerSet.documents.get(i15);
                                        }
                                    }
                                } else {
                                    i14++;
                                }
                            }
                        }
                        document = null;
                        if (document != null) {
                            y9VarArr[i13].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str3), null);
                        }
                    }
                    return;
                }
                return;
            case 10:
                ((String[]) obj3)[0] = (String) obj;
                ((il0) obj2).run();
                return;
            case 11:
                lw0 lw0Var = (lw0) obj3;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj2;
                Long l10 = (Long) obj;
                lw0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle3.putLong("user_id", l10.longValue());
                } else {
                    bundle3.putLong("chat_id", -l10.longValue());
                }
                m2Var2.presentFragment(new ProfileActivity(bundle3, null));
                lw0Var.c(false);
                return;
            case 12:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                TL_account.TL_birthday tL_birthday2 = userFull.birthday;
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                profileActivity.getMessagesController().invalidateContentSettings();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new ms0(profileActivity, userFull, tL_birthday2, 3), 1024);
                return;
            case 13:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                ((org.telegram.ui.ActionBar.a2) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ci.lc D = ci.lc.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a2 = profileActivity2.a();
                    D.N = a2;
                    ci.bc bcVar = D.f5466c1;
                    if (bcVar != null) {
                        bcVar.setDialogId(a2);
                    }
                    D.Q(null);
                    return;
                }
                return;
            case 14:
                l11 l11Var = (l11) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = j71.k(str4, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder w10 = a1.g.w("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = o11.f40381s;
                    FileLog.e(w10.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver();
                l11Var.f39482c = imageReceiver;
                l11Var.f39483e.add(imageReceiver);
                int f11 = ez.f();
                l11Var.f39482c.setAutoRepeat(0);
                n11 n11Var = l11Var.f39482c;
                String str5 = f11 + "_" + f11 + "_precache";
                mz0 mz0Var = new mz0(l11Var, 5);
                n11Var.getClass();
                n11Var.setDelegate(new m11(new Runnable[]{mz0Var}));
                n11Var.setImage(ImageLocation.getForDocument(k10), str5, null, null, tL_messages_stickerSet2, 0);
                l11Var.f39482c.onAttachedToWindow();
                l11Var.f39485g[1] = true;
                l11Var.a();
                return;
            case 15:
                Runnable runnable = (Runnable) obj;
                ((ai.i) obj3).run((HashSet) obj2);
                return;
            case 16:
                j51 j51Var = (j51) obj3;
                View view = (View) obj2;
                Bitmap bitmap3 = (Bitmap) obj;
                if (view != null) {
                    j51Var.getClass();
                    view.setVisibility(0);
                }
                j51Var.f38850f = bitmap3;
                Paint paint2 = new Paint(1);
                j51Var.f38851n = paint2;
                Bitmap bitmap4 = j51Var.f38850f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                j51Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f10 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f10);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f7 = -0.02f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f7);
                j51Var.f38851n.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                j51Var.f38852r = new Matrix();
                return;
            case 17:
                Boolean bool3 = (Boolean) obj;
                h91.X((h91) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            case 18:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.N0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    org.telegram.ui.Components.sm0 sm0Var = themeActivity.f34559b;
                    if (sm0Var != null && sm0Var.G && (K = sm0Var.K(themeActivity.M)) != null) {
                        themeActivity.f34557a.v(K, themeActivity.M);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                m31 m31Var = (m31) obj2;
                if (((Boolean) obj).booleanValue()) {
                    m31Var.run();
                    return;
                } else {
                    org.telegram.ui.Components.ad.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
            case 20:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj3;
                org.telegram.ui.Wallet.j7 j7Var = (org.telegram.ui.Wallet.j7) obj2;
                String str6 = (String) obj;
                if (str6 != null) {
                    org.telegram.ui.Wallet.l0.i("disableBackupWithoutUpdatingPhrase: ".concat(str6));
                    j7Var.run(str6);
                    return;
                }
                org.telegram.ui.Wallet.l0.E("sending disableBackup to server");
                org.telegram.ui.Wallet.s2.a(l0Var.f35185a, new ei.c(9), null, null, null, new ai.q0(3, l0Var, j7Var), true, true, new hb0((Object) null, 1));
                return;
            case 21:
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj3;
                try {
                    ((Utilities.Callback) obj2).run((String) obj);
                    if (i0Var != null) {
                        return;
                    }
                    return;
                } finally {
                    if (i0Var != null) {
                        i0Var.close();
                    }
                }
            case 22:
                ((org.telegram.ui.Wallet.i0) obj3).close();
                ((org.telegram.ui.Wallet.d7) obj2).run((String) obj);
                return;
            case 23:
                org.telegram.ui.Wallet.g0 g0Var = (org.telegram.ui.Wallet.g0) obj3;
                org.telegram.ui.Wallet.f7 f7Var = (org.telegram.ui.Wallet.f7) obj2;
                String str7 = (String) obj;
                if (str7 != null) {
                    g0Var.close();
                    org.telegram.ui.Wallet.l0.i("prepare disable backup, failed to save secret phrase to local storage: ".concat(str7));
                    f7Var.run(null, str7);
                    return;
                }
                org.telegram.ui.Wallet.l0.E("prepare disable backup: done!");
                f7Var.run(g0Var, null);
                return;
            case 24:
                ((org.telegram.ui.Wallet.f2) obj3).h = false;
                ((org.telegram.messenger.jh) obj2).run(null, (String) obj);
                return;
            case 25:
                ((org.telegram.ui.Wallet.i0) obj3).close();
                ((org.telegram.ui.Wallet.q) obj2).run((String) obj);
                return;
            case 26:
                ((org.telegram.ui.Wallet.i0) obj3).close();
                ((org.telegram.ui.Wallet.q) obj2).run((String) obj);
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.m(7, (org.telegram.ui.Wallet.a2) obj3, (org.telegram.ui.Wallet.l) obj2, (String) obj));
                return;
            case 28:
                ((org.telegram.ui.Wallet.i0) obj3).close();
                ((et) obj2).run((String) obj);
                return;
            default:
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) obj3;
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) obj2;
                String str8 = (String) obj;
                c5Var.f34770y0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str8)) {
                    org.telegram.ui.Wallet.c7 c7Var = new org.telegram.ui.Wallet.c7();
                    c7Var.f34780s = l0Var2.w();
                    c5Var.presentFragment(c7Var);
                    return;
                } else if (str8 != null) {
                    org.telegram.ui.Components.ad.a0(c5Var).e0(str8, false);
                    return;
                } else {
                    c5Var.presentFragment(new org.telegram.ui.Wallet.u8());
                    return;
                }
        }
    }

    public et(org.telegram.ui.Wallet.l0 l0Var, org.telegram.ui.Wallet.g0 g0Var, org.telegram.ui.Wallet.f7 f7Var) {
        this.f37446a = 23;
        this.f37447b = g0Var;
        this.f37448c = f7Var;
    }
}
