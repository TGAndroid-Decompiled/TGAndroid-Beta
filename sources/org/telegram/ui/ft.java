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
public final class ft implements Utilities.Callback {
    public final int f37683a;
    public final Object f37684b;
    public final Object f37685c;

    public ft(int i10, Object obj, Object obj2) {
        this.f37683a = i10;
        this.f37684b = obj;
        this.f37685c = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        TLRPC.Document document;
        s4.d1 K;
        int i11 = this.f37683a;
        float f7 = -0.04f;
        float f10 = 0.25f;
        int i12 = 0;
        Object obj2 = this.f37685c;
        Object obj3 = this.f37684b;
        switch (i11) {
            case 0:
                rt rtVar = (rt) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                Long l4 = (Long) obj;
                rtVar.getClass();
                Bundle bundle = new Bundle();
                if (l4.longValue() >= 0) {
                    bundle.putLong("user_id", l4.longValue());
                } else {
                    bundle.putLong("chat_id", -l4.longValue());
                }
                n2Var.presentFragment(new ProfileActivity(bundle, null));
                rtVar.p();
                return;
            case 1:
                nt ntVar = (nt) obj3;
                Boolean bool = (Boolean) obj;
                ntVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    ntVar.f40360a.p();
                    return;
                }
                return;
            case 2:
                ty tyVar = (ty) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    tyVar.showDialog(new gk0(activity, !org.telegram.ui.Components.ef0.a(), new fw(activity, 0)));
                    return;
                }
                return;
            case 3:
                xp0 xp0Var = (xp0) obj2;
                Integer num = (Integer) obj;
                f10 f10Var = ((c10) obj3).f36491e;
                if (!f10Var.getUserConfig().isPremium()) {
                    f10Var.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) f10Var, 35, true));
                    return;
                }
                int intValue = num.intValue();
                f10Var.E = intValue;
                xp0Var.a(intValue, true);
                t00 t00Var = f10Var.I;
                if (t00Var != null) {
                    if (!f10Var.getUserConfig().isPremium()) {
                        i10 = -1;
                    } else {
                        i10 = f10Var.E;
                    }
                    t00Var.d(i10, true);
                }
                f10Var.i0(true);
                return;
            case 4:
                p50 p50Var = (p50) obj3;
                q50 q50Var = (q50) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (q50Var != null) {
                    p50Var.getClass();
                    q50Var.setVisibility(0);
                }
                p50Var.f40669c = bitmap;
                Paint paint = new Paint(1);
                p50Var.d = paint;
                Bitmap bitmap2 = p50Var.f40669c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                p50Var.f40670e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f10 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f10);
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f7 = -0.02f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f7);
                p50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 5:
                ec0 ec0Var = (ec0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ec0Var.c();
                if (user != null) {
                    long j3 = userArr[0].f20185id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.f20185id);
                    ec0Var.u(new dc0(bundle2, user, userArr, j3), false);
                    return;
                }
                return;
            case 6:
                sj0 sj0Var = (sj0) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = sj0Var.f41712f0;
                arrayList.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.f20185id)) && sj0Var.S(user2)) {
                            arrayList.add(user2);
                            hashSet.add(Long.valueOf(user2.f20185id));
                        }
                    }
                }
                Boolean bool2 = sj0Var.f41723r0;
                if (bool2 != null && bool2.booleanValue()) {
                    ft ftVar = new ft(7, sj0Var, hashSet);
                    MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    if (str != null && !str.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f20084q = str;
                        tL_contacts_search.limit = 50;
                        i12 = connectionsManager.sendRequest(tL_contacts_search, new ej1(3, messagesController, ftVar));
                    } else {
                        AndroidUtilities.runOnUIThread(new rg.x1(ftVar, 9));
                    }
                    sj0Var.m0 = i12;
                    return;
                }
                sj0Var.V(true, true);
                return;
            case 7:
                sj0 sj0Var2 = (sj0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.f20185id)) && sj0Var2.S(user3)) {
                            sj0Var2.f41712f0.add(user3);
                            hashSet2.add(Long.valueOf(user3.f20185id));
                        }
                    }
                }
                sj0Var2.V(true, true);
                return;
            case 8:
                dk0 dk0Var = (dk0) obj3;
                String str2 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    dk0Var.R.setImageDrawable(null);
                    dk0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new tf0(8, dk0Var, str2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = dk0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(dk0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21128v6), PorterDuff.Mode.SRC_IN));
                    dk0Var.R.setImageDrawable(mutate);
                    if (user4.contact) {
                        dk0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new tf0(9, dk0Var, user4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        dk0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                dk0Var.y(false);
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
                                        if (tL_messages_stickerSet.documents.get(i15).f20044id == longValue) {
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
                ((jl0) obj2).run();
                return;
            case 11:
                mw0 mw0Var = (mw0) obj3;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                Long l10 = (Long) obj;
                mw0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle3.putLong("user_id", l10.longValue());
                } else {
                    bundle3.putLong("chat_id", -l10.longValue());
                }
                n2Var2.presentFragment(new ProfileActivity(bundle3, null));
                mw0Var.c(false);
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
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new ns0(profileActivity, userFull, tL_birthday2, 3), 1024);
                return;
            case 13:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                ((org.telegram.ui.ActionBar.b2) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ci.lc D = ci.lc.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a2 = profileActivity2.a();
                    D.N = a2;
                    ci.bc bcVar = D.f5467c1;
                    if (bcVar != null) {
                        bcVar.setDialogId(a2);
                    }
                    D.Q(null);
                    return;
                }
                return;
            case 14:
                m11 m11Var = (m11) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = k71.k(str4, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder w10 = a1.g.w("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = p11.f40627s;
                    FileLog.e(w10.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver();
                m11Var.f39736c = imageReceiver;
                m11Var.f39737e.add(imageReceiver);
                int f11 = fz.f();
                m11Var.f39736c.setAutoRepeat(0);
                o11 o11Var = m11Var.f39736c;
                String str5 = f11 + "_" + f11 + "_precache";
                nz0 nz0Var = new nz0(m11Var, 5);
                o11Var.getClass();
                o11Var.setDelegate(new n11(new Runnable[]{nz0Var}));
                o11Var.setImage(ImageLocation.getForDocument(k10), str5, null, null, tL_messages_stickerSet2, 0);
                m11Var.f39736c.onAttachedToWindow();
                m11Var.f39739g[1] = true;
                m11Var.a();
                return;
            case 15:
                Runnable runnable = (Runnable) obj;
                ((ai.i) obj3).run((HashSet) obj2);
                return;
            case 16:
                k51 k51Var = (k51) obj3;
                View view = (View) obj2;
                Bitmap bitmap3 = (Bitmap) obj;
                if (view != null) {
                    k51Var.getClass();
                    view.setVisibility(0);
                }
                k51Var.f39094f = bitmap3;
                Paint paint2 = new Paint(1);
                k51Var.f39095n = paint2;
                Bitmap bitmap4 = k51Var.f39094f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                k51Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f10 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f10);
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f7 = -0.02f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f7);
                k51Var.f39095n.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                k51Var.f39096r = new Matrix();
                return;
            case 17:
                Boolean bool3 = (Boolean) obj;
                i91.X((i91) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            case 18:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.N0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    org.telegram.ui.Components.qm0 qm0Var = themeActivity.f34531b;
                    if (qm0Var != null && qm0Var.G && (K = qm0Var.K(themeActivity.M)) != null) {
                        themeActivity.f34529a.v(K, themeActivity.M);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                n31 n31Var = (n31) obj2;
                if (((Boolean) obj).booleanValue()) {
                    n31Var.run();
                    return;
                } else {
                    org.telegram.ui.Components.ad.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
            case 20:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj3;
                org.telegram.ui.Wallet.g7 g7Var = (org.telegram.ui.Wallet.g7) obj2;
                String str6 = (String) obj;
                if (str6 != null) {
                    org.telegram.ui.Wallet.k0.i("disableBackupWithoutUpdatingPhrase: ".concat(str6));
                    g7Var.run(str6);
                    return;
                }
                org.telegram.ui.Wallet.k0.E("sending disableBackup to server");
                org.telegram.ui.Wallet.q2.a(k0Var.f35093a, new ei.c(9), null, null, null, new ai.q0(3, k0Var, g7Var), true, true, new ib0((Object) null, 1));
                return;
            case 21:
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj3;
                try {
                    ((Utilities.Callback) obj2).run((String) obj);
                    if (h0Var != null) {
                        return;
                    }
                    return;
                } finally {
                    if (h0Var != null) {
                        h0Var.close();
                    }
                }
            case 22:
                ((org.telegram.ui.Wallet.h0) obj3).close();
                ((org.telegram.ui.Wallet.a7) obj2).run((String) obj);
                return;
            case 23:
                org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) obj3;
                org.telegram.ui.Wallet.c7 c7Var = (org.telegram.ui.Wallet.c7) obj2;
                String str7 = (String) obj;
                if (str7 != null) {
                    f0Var.close();
                    org.telegram.ui.Wallet.k0.i("prepare disable backup, failed to save secret phrase to local storage: ".concat(str7));
                    c7Var.run(null, str7);
                    return;
                }
                org.telegram.ui.Wallet.k0.E("prepare disable backup: done!");
                c7Var.run(f0Var, null);
                return;
            case 24:
                ((org.telegram.ui.Wallet.d2) obj3).h = false;
                ((org.telegram.messenger.jh) obj2).run(null, (String) obj);
                return;
            case 25:
                ((org.telegram.ui.Wallet.h0) obj3).close();
                ((org.telegram.ui.Wallet.o) obj2).run((String) obj);
                return;
            case 26:
                ((org.telegram.ui.Wallet.h0) obj3).close();
                ((org.telegram.ui.Wallet.o) obj2).run((String) obj);
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.k(7, (org.telegram.ui.Wallet.y1) obj3, (org.telegram.ui.Wallet.j) obj2, (String) obj));
                return;
            case 28:
                ((org.telegram.ui.Wallet.h0) obj3).close();
                ((ft) obj2).run((String) obj);
                return;
            default:
                org.telegram.ui.Wallet.z4 z4Var = (org.telegram.ui.Wallet.z4) obj3;
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) obj2;
                String str8 = (String) obj;
                z4Var.f35744y0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str8)) {
                    org.telegram.ui.Wallet.z6 z6Var = new org.telegram.ui.Wallet.z6();
                    z6Var.f35754s = k0Var2.w();
                    z4Var.presentFragment(z6Var);
                    return;
                } else if (str8 != null) {
                    org.telegram.ui.Components.ad.a0(z4Var).e0(str8, false);
                    return;
                } else {
                    z4Var.presentFragment(new org.telegram.ui.Wallet.r8());
                    return;
                }
        }
    }

    public ft(org.telegram.ui.Wallet.k0 k0Var, org.telegram.ui.Wallet.f0 f0Var, org.telegram.ui.Wallet.c7 c7Var) {
        this.f37683a = 23;
        this.f37684b = f0Var;
        this.f37685c = c7Var;
    }
}
