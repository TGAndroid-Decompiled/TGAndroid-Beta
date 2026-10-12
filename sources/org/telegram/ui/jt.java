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
public final class jt implements Utilities.Callback {
    public final int f39276a;
    public final Object f39277b;
    public final Object f39278c;

    public jt(int i10, Object obj, Object obj2) {
        this.f39276a = i10;
        this.f39277b = obj;
        this.f39278c = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        TLRPC.Document document;
        s4.d1 K;
        int i11 = this.f39276a;
        float f7 = -0.02f;
        float f10 = 0.25f;
        int i12 = 0;
        Object obj2 = this.f39278c;
        Object obj3 = this.f39277b;
        switch (i11) {
            case 0:
                ut utVar = (ut) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                Long l4 = (Long) obj;
                utVar.getClass();
                Bundle bundle = new Bundle();
                if (l4.longValue() >= 0) {
                    bundle.putLong("user_id", l4.longValue());
                } else {
                    bundle.putLong("chat_id", -l4.longValue());
                }
                m2Var.presentFragment(new ProfileActivity(bundle, null));
                utVar.p();
                return;
            case 1:
                qt qtVar = (qt) obj3;
                Boolean bool = (Boolean) obj;
                qtVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    qtVar.f41429a.p();
                    return;
                }
                return;
            case 2:
                vy vyVar = (vy) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    vyVar.showDialog(new hk0(activity, !org.telegram.ui.Components.if0.a(), new hw(activity, 0)));
                    return;
                }
                return;
            case 3:
                zp0 zp0Var = (zp0) obj2;
                Integer num = (Integer) obj;
                h10 h10Var = ((e10) obj3).f36956e;
                if (!h10Var.getUserConfig().isPremium()) {
                    h10Var.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) h10Var, 35, true));
                    return;
                }
                int intValue = num.intValue();
                h10Var.E = intValue;
                zp0Var.a(intValue, true);
                v00 v00Var = h10Var.I;
                if (v00Var != null) {
                    if (!h10Var.getUserConfig().isPremium()) {
                        i10 = -1;
                    } else {
                        i10 = h10Var.E;
                    }
                    v00Var.d(i10, true);
                }
                h10Var.i0(true);
                return;
            case 4:
                r50 r50Var = (r50) obj3;
                s50 s50Var = (s50) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (s50Var != null) {
                    r50Var.getClass();
                    s50Var.setVisibility(0);
                }
                r50Var.f41507c = bitmap;
                Paint paint = new Paint(1);
                r50Var.d = paint;
                Bitmap bitmap2 = r50Var.f41507c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                r50Var.f41508e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f10 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f10);
                if (!org.telegram.ui.ActionBar.h6.I.q()) {
                    f7 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f7);
                r50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 5:
                fc0 fc0Var = (fc0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                fc0Var.c();
                if (user != null) {
                    long j3 = userArr[0].f19949id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.f19949id);
                    fc0Var.u(new ec0(bundle2, user, userArr, j3), false);
                    return;
                }
                return;
            case 6:
                tj0 tj0Var = (tj0) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = tj0Var.f42219f0;
                arrayList.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.f19949id)) && tj0Var.S(user2)) {
                            arrayList.add(user2);
                            hashSet.add(Long.valueOf(user2.f19949id));
                        }
                    }
                }
                Boolean bool2 = tj0Var.f42230r0;
                if (bool2 != null && bool2.booleanValue()) {
                    jt jtVar = new jt(7, tj0Var, hashSet);
                    MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    if (str != null && !str.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f19848q = str;
                        tL_contacts_search.limit = 50;
                        i12 = connectionsManager.sendRequest(tL_contacts_search, new fj1(3, messagesController, jtVar));
                    } else {
                        AndroidUtilities.runOnUIThread(new rg.x1(jtVar, 9));
                    }
                    tj0Var.m0 = i12;
                    return;
                }
                tj0Var.V(true, true);
                return;
            case 7:
                tj0 tj0Var2 = (tj0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.f19949id)) && tj0Var2.S(user3)) {
                            tj0Var2.f42219f0.add(user3);
                            hashSet2.add(Long.valueOf(user3.f19949id));
                        }
                    }
                }
                tj0Var2.V(true, true);
                return;
            case 8:
                ek0 ek0Var = (ek0) obj3;
                String str2 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    ek0Var.R.setImageDrawable(null);
                    ek0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new og0(5, ek0Var, str2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = ek0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(ek0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20892v6), PorterDuff.Mode.SRC_IN));
                    ek0Var.R.setImageDrawable(mutate);
                    if (user4.contact) {
                        ek0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new og0(6, ek0Var, user4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        ek0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                ek0Var.y(false);
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
                                        if (tL_messages_stickerSet.documents.get(i15).f19808id == longValue) {
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
                ((kl0) obj2).run();
                return;
            case 11:
                ow0 ow0Var = (ow0) obj3;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj2;
                Long l10 = (Long) obj;
                ow0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle3.putLong("user_id", l10.longValue());
                } else {
                    bundle3.putLong("chat_id", -l10.longValue());
                }
                m2Var2.presentFragment(new ProfileActivity(bundle3, null));
                ow0Var.c(false);
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
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new ps0(profileActivity, userFull, tL_birthday2, 3), 1024);
                return;
            case 13:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                ((org.telegram.ui.ActionBar.a2) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ci.lc D = ci.lc.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a2 = profileActivity2.a();
                    D.N = a2;
                    ci.bc bcVar = D.f5465c1;
                    if (bcVar != null) {
                        bcVar.setDialogId(a2);
                    }
                    D.Q(null);
                    return;
                }
                return;
            case 14:
                o11 o11Var = (o11) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = n71.k(str4, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder w10 = a1.g.w("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = r11.f41466s;
                    FileLog.e(w10.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver();
                o11Var.f40534c = imageReceiver;
                o11Var.f40535e.add(imageReceiver);
                int f11 = hz.f();
                o11Var.f40534c.setAutoRepeat(0);
                q11 q11Var = o11Var.f40534c;
                String str5 = f11 + "_" + f11 + "_precache";
                pz0 pz0Var = new pz0(o11Var, 5);
                q11Var.getClass();
                q11Var.setDelegate(new p11(new Runnable[]{pz0Var}));
                q11Var.setImage(ImageLocation.getForDocument(k10), str5, null, null, tL_messages_stickerSet2, 0);
                o11Var.f40534c.onAttachedToWindow();
                o11Var.f40537g[1] = true;
                o11Var.a();
                return;
            case 15:
                Runnable runnable = (Runnable) obj;
                ((ai.i) obj3).run((HashSet) obj2);
                return;
            case 16:
                n51 n51Var = (n51) obj3;
                View view = (View) obj2;
                Bitmap bitmap3 = (Bitmap) obj;
                if (view != null) {
                    n51Var.getClass();
                    view.setVisibility(0);
                }
                n51Var.f40225f = bitmap3;
                Paint paint2 = new Paint(1);
                n51Var.f40226n = paint2;
                Bitmap bitmap4 = n51Var.f40225f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                n51Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f10 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f10);
                if (!org.telegram.ui.ActionBar.h6.I.q()) {
                    f7 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f7);
                n51Var.f40226n.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                n51Var.f40227r = new Matrix();
                return;
            case 17:
                Boolean bool3 = (Boolean) obj;
                k91.X((k91) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            case 18:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.N0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    org.telegram.ui.Components.wm0 wm0Var = themeActivity.f34368b;
                    if (wm0Var != null && wm0Var.G && (K = wm0Var.K(themeActivity.M)) != null) {
                        themeActivity.f34366a.v(K, themeActivity.M);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                w31 w31Var = (w31) obj2;
                if (((Boolean) obj).booleanValue()) {
                    w31Var.run();
                    return;
                } else {
                    org.telegram.ui.Components.zc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
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
                org.telegram.ui.Wallet.s2.a(l0Var.f34994a, new ei.c(9), null, null, null, new ai.q0(3, l0Var, j7Var), true, true, new jb0((Object) null, 1));
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
                ((org.telegram.messenger.mh) obj2).run(null, (String) obj);
                return;
            case 25:
                ((org.telegram.ui.Wallet.i0) obj3).close();
                ((org.telegram.ui.Wallet.p) obj2).run((String) obj);
                return;
            case 26:
                ((org.telegram.ui.Wallet.i0) obj3).close();
                ((org.telegram.ui.Wallet.p) obj2).run((String) obj);
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.l(7, (org.telegram.ui.Wallet.a2) obj3, (org.telegram.ui.Wallet.k) obj2, (String) obj));
                return;
            case 28:
                ((org.telegram.ui.Wallet.i0) obj3).close();
                ((jt) obj2).run((String) obj);
                return;
            default:
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) obj3;
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) obj2;
                String str8 = (String) obj;
                c5Var.f34579y0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str8)) {
                    org.telegram.ui.Wallet.c7 c7Var = new org.telegram.ui.Wallet.c7();
                    c7Var.f34589s = l0Var2.w();
                    c5Var.presentFragment(c7Var);
                    return;
                } else if (str8 != null) {
                    org.telegram.ui.Components.zc.a0(c5Var).e0(str8, false);
                    return;
                } else {
                    c5Var.presentFragment(new org.telegram.ui.Wallet.u8());
                    return;
                }
        }
    }

    public jt(org.telegram.ui.Wallet.l0 l0Var, org.telegram.ui.Wallet.g0 g0Var, org.telegram.ui.Wallet.f7 f7Var) {
        this.f39276a = 23;
        this.f39277b = g0Var;
        this.f39278c = f7Var;
    }
}
