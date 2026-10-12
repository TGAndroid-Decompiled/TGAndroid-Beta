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
public final class mt implements Utilities.Callback {
    public final int f38339a;
    public final Object f38340b;
    public final Object f38341c;

    public mt(int i10, Object obj, Object obj2) {
        this.f38339a = i10;
        this.f38340b = obj;
        this.f38341c = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        TLRPC.Document document;
        s4.b1 K;
        int i11 = this.f38339a;
        float f7 = -0.04f;
        float f10 = 0.25f;
        int i12 = 0;
        Object obj2 = this.f38341c;
        Object obj3 = this.f38340b;
        switch (i11) {
            case 0:
                xt xtVar = (xt) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                Long l4 = (Long) obj;
                xtVar.getClass();
                Bundle bundle = new Bundle();
                if (l4.longValue() >= 0) {
                    bundle.putLong("user_id", l4.longValue());
                } else {
                    bundle.putLong("chat_id", -l4.longValue());
                }
                m2Var.presentFragment(new ProfileActivity(bundle, null));
                xtVar.p();
                return;
            case 1:
                tt ttVar = (tt) obj3;
                Boolean bool = (Boolean) obj;
                ttVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    ttVar.f40483a.p();
                    return;
                }
                return;
            case 2:
                yy yyVar = (yy) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    yyVar.showDialog(new lk0(activity, !org.telegram.ui.Components.cf0.a(), new lw(activity, 0)));
                    return;
                }
                return;
            case 3:
                dq0 dq0Var = (dq0) obj2;
                Integer num = (Integer) obj;
                l10 l10Var = ((i10) obj3).e;
                if (!l10Var.getUserConfig().isPremium()) {
                    l10Var.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) l10Var, 35, true));
                    return;
                }
                int intValue = num.intValue();
                l10Var.E = intValue;
                dq0Var.a(intValue, true);
                z00 z00Var = l10Var.I;
                if (z00Var != null) {
                    if (!l10Var.getUserConfig().isPremium()) {
                        i10 = -1;
                    } else {
                        i10 = l10Var.E;
                    }
                    z00Var.d(i10, true);
                }
                l10Var.i0(true);
                return;
            case 4:
                w50 w50Var = (w50) obj3;
                x50 x50Var = (x50) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (x50Var != null) {
                    w50Var.getClass();
                    x50Var.setVisibility(0);
                }
                w50Var.f41156c = bitmap;
                Paint paint = new Paint(1);
                w50Var.d = paint;
                Bitmap bitmap2 = w50Var.f41156c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                w50Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f10 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f10);
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f7 = -0.02f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f7);
                w50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 5:
                jc0 jc0Var = (jc0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                jc0Var.c();
                if (user != null) {
                    long j10 = userArr[0].f19363id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.f19363id);
                    jc0Var.u(new ic0(bundle2, user, userArr, j10), false);
                    return;
                }
                return;
            case 6:
                xj0 xj0Var = (xj0) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = xj0Var.f41875f0;
                arrayList.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.f19363id)) && xj0Var.S(user2)) {
                            arrayList.add(user2);
                            hashSet.add(Long.valueOf(user2.f19363id));
                        }
                    }
                }
                Boolean bool2 = xj0Var.f41886r0;
                if (bool2 != null && bool2.booleanValue()) {
                    mt mtVar = new mt(7, xj0Var, hashSet);
                    MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    if (str != null && !str.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f19262q = str;
                        tL_contacts_search.limit = 50;
                        i12 = connectionsManager.sendRequest(tL_contacts_search, new lj1(3, messagesController, mtVar));
                    } else {
                        AndroidUtilities.runOnUIThread(new rh.j(mtVar, 15));
                    }
                    xj0Var.m0 = i12;
                    return;
                }
                xj0Var.V(true, true);
                return;
            case 7:
                xj0 xj0Var2 = (xj0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.f19363id)) && xj0Var2.S(user3)) {
                            xj0Var2.f41875f0.add(user3);
                            hashSet2.add(Long.valueOf(user3.f19363id));
                        }
                    }
                }
                xj0Var2.V(true, true);
                return;
            case 8:
                ik0 ik0Var = (ik0) obj3;
                String str2 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    ik0Var.R.setImageDrawable(null);
                    ik0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new wc0(19, ik0Var, str2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = ik0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(ik0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f20233v6), PorterDuff.Mode.SRC_IN));
                    ik0Var.R.setImageDrawable(mutate);
                    if (user4.contact) {
                        ik0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new wc0(20, ik0Var, user4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        ik0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                ik0Var.y(false);
                return;
            case 9:
                ArrayList arrayList2 = (ArrayList) obj3;
                org.telegram.ui.Components.z9[] z9VarArr = (org.telegram.ui.Components.z9[]) obj2;
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
                                        if (tL_messages_stickerSet.documents.get(i15).f19222id == longValue) {
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
                            z9VarArr[i13].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str3), null);
                        }
                    }
                    return;
                }
                return;
            case 10:
                ((String[]) obj3)[0] = (String) obj;
                ((ol0) obj2).run();
                return;
            case 11:
                sw0 sw0Var = (sw0) obj3;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj2;
                Long l10 = (Long) obj;
                sw0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle3.putLong("user_id", l10.longValue());
                } else {
                    bundle3.putLong("chat_id", -l10.longValue());
                }
                m2Var2.presentFragment(new ProfileActivity(bundle3, null));
                sw0Var.c(false);
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
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new us0(profileActivity, userFull, tL_birthday2, 3), 1024);
                return;
            case 13:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                ((org.telegram.ui.ActionBar.a2) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    di.kc D = di.kc.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a2 = profileActivity2.a();
                    D.N = a2;
                    di.ac acVar = D.f7243c1;
                    if (acVar != null) {
                        acVar.setDialogId(a2);
                    }
                    D.Q(null);
                    return;
                }
                return;
            case 14:
                t11 t11Var = (t11) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = r71.k(str4, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder v = a1.g.v("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = w11.f41126s;
                    FileLog.e(v.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver();
                t11Var.f40269c = imageReceiver;
                t11Var.e.add(imageReceiver);
                int f11 = kz.f();
                t11Var.f40269c.setAutoRepeat(0);
                v11 v11Var = t11Var.f40269c;
                String str5 = f11 + "_" + f11 + "_precache";
                uz0 uz0Var = new uz0(t11Var, 5);
                v11Var.getClass();
                v11Var.setDelegate(new u11(new Runnable[]{uz0Var}));
                v11Var.setImage(ImageLocation.getForDocument(k10), str5, null, null, tL_messages_stickerSet2, 0);
                t11Var.f40269c.onAttachedToWindow();
                t11Var.f40271g[1] = true;
                t11Var.a();
                return;
            case 15:
                Runnable runnable = (Runnable) obj;
                ((bi.f) obj3).run((HashSet) obj2);
                return;
            case 16:
                r51 r51Var = (r51) obj3;
                View view = (View) obj2;
                Bitmap bitmap3 = (Bitmap) obj;
                if (view != null) {
                    r51Var.getClass();
                    view.setVisibility(0);
                }
                r51Var.f39604f = bitmap3;
                Paint paint2 = new Paint(1);
                r51Var.f39605n = paint2;
                Bitmap bitmap4 = r51Var.f39604f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                r51Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f10 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f10);
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f7 = -0.02f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f7);
                r51Var.f39605n.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                r51Var.f39606r = new Matrix();
                return;
            case 17:
                Boolean bool3 = (Boolean) obj;
                o91.X((o91) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            case 18:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.N0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    org.telegram.ui.Components.mm0 mm0Var = themeActivity.f32842b;
                    if (mm0Var != null && mm0Var.G && (K = mm0Var.K(themeActivity.M)) != null) {
                        themeActivity.f32840a.v(K, themeActivity.M);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                hz0 hz0Var = (hz0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    hz0Var.run();
                    return;
                } else {
                    org.telegram.ui.Components.zc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
            case 20:
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) obj3;
                org.telegram.ui.Wallet.g7 g7Var = (org.telegram.ui.Wallet.g7) obj2;
                String str6 = (String) obj;
                if (str6 != null) {
                    org.telegram.ui.Wallet.j0.i("disableBackupWithoutUpdatingPhrase: ".concat(str6));
                    g7Var.run(str6);
                    return;
                }
                org.telegram.ui.Wallet.j0.E("sending disableBackup to server");
                org.telegram.ui.Wallet.q2.a(j0Var.f33319a, new fi.c(9), null, null, null, new bi.j0(3, j0Var, g7Var), true, true, new nb0((Object) null, 1));
                return;
            case 21:
                org.telegram.ui.Wallet.g0 g0Var = (org.telegram.ui.Wallet.g0) obj3;
                try {
                    ((Utilities.Callback) obj2).run((String) obj);
                    if (g0Var != null) {
                        return;
                    }
                    return;
                } finally {
                    if (g0Var != null) {
                        g0Var.close();
                    }
                }
            case 22:
                ((org.telegram.ui.Wallet.g0) obj3).close();
                ((org.telegram.ui.Wallet.a7) obj2).run((String) obj);
                return;
            case 23:
                org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) obj3;
                org.telegram.ui.Wallet.c7 c7Var = (org.telegram.ui.Wallet.c7) obj2;
                String str7 = (String) obj;
                if (str7 != null) {
                    e0Var.close();
                    org.telegram.ui.Wallet.j0.i("prepare disable backup, failed to save secret phrase to local storage: ".concat(str7));
                    c7Var.run(null, str7);
                    return;
                }
                org.telegram.ui.Wallet.j0.E("prepare disable backup: done!");
                c7Var.run(e0Var, null);
                return;
            case 24:
                ((org.telegram.ui.Wallet.d2) obj3).h = false;
                ((org.telegram.messenger.mh) obj2).run(null, (String) obj);
                return;
            case 25:
                ((org.telegram.ui.Wallet.g0) obj3).close();
                ((org.telegram.ui.Wallet.o) obj2).run((String) obj);
                return;
            case 26:
                ((org.telegram.ui.Wallet.g0) obj3).close();
                ((org.telegram.ui.Wallet.o) obj2).run((String) obj);
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.k(7, (org.telegram.ui.Wallet.y1) obj3, (org.telegram.ui.Wallet.j) obj2, (String) obj));
                return;
            case 28:
                ((org.telegram.ui.Wallet.g0) obj3).close();
                ((mt) obj2).run((String) obj);
                return;
            default:
                org.telegram.ui.Wallet.z4 z4Var = (org.telegram.ui.Wallet.z4) obj3;
                org.telegram.ui.Wallet.j0 j0Var2 = (org.telegram.ui.Wallet.j0) obj2;
                String str8 = (String) obj;
                z4Var.f33949y0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str8)) {
                    org.telegram.ui.Wallet.z6 z6Var = new org.telegram.ui.Wallet.z6();
                    z6Var.f33958s = j0Var2.w();
                    z4Var.presentFragment(z6Var);
                    return;
                } else if (str8 != null) {
                    org.telegram.ui.Components.zc.a0(z4Var).e0(str8, false);
                    return;
                } else {
                    z4Var.presentFragment(new org.telegram.ui.Wallet.r8());
                    return;
                }
        }
    }

    public mt(org.telegram.ui.Wallet.j0 j0Var, org.telegram.ui.Wallet.e0 e0Var, org.telegram.ui.Wallet.c7 c7Var) {
        this.f38339a = 23;
        this.f38340b = e0Var;
        this.f38341c = c7Var;
    }
}
