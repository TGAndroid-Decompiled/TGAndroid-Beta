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
import java.util.Calendar;
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
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
public final class ft implements Utilities.Callback {
    public final int f36385a;
    public final Object f36386b;
    public final Object f36387c;

    public ft(int i10, Object obj, Object obj2) {
        this.f36385a = i10;
        this.f36386b = obj;
        this.f36387c = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        TLRPC.Document document;
        s4.c1 K;
        int i11 = this.f36385a;
        float f7 = -0.04f;
        float f10 = 0.25f;
        int i12 = 0;
        Object obj2 = this.f36387c;
        Object obj3 = this.f36386b;
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
                    ntVar.f39037a.p();
                    return;
                }
                return;
            case 2:
                uy uyVar = (uy) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    uyVar.showDialog(new dk0(activity, !org.telegram.ui.Components.pe0.c(), new gw(activity, 0)));
                    return;
                }
                return;
            case 3:
                tp0 tp0Var = (tp0) obj2;
                Integer num = (Integer) obj;
                f10 f10Var = ((c10) obj3).f35245e;
                if (!f10Var.getUserConfig().isPremium()) {
                    f10Var.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) f10Var, 35, true));
                    return;
                }
                int intValue = num.intValue();
                f10Var.E = intValue;
                tp0Var.a(intValue, true);
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
                r50 r50Var = (r50) obj3;
                n20 n20Var = (n20) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (n20Var != null) {
                    r50Var.getClass();
                    n20Var.setVisibility(0);
                }
                r50Var.f39921c = bitmap;
                Paint paint = new Paint(1);
                r50Var.d = paint;
                Bitmap bitmap2 = r50Var.f39921c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                r50Var.f39922e = bitmapShader;
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
                r50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 5:
                dc0 dc0Var = (dc0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                dc0Var.a();
                if (user != null) {
                    long j3 = userArr[0].f20185id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.f20185id);
                    dc0Var.n(new cc0(bundle2, user, userArr, j3), false);
                    return;
                }
                return;
            case 6:
                oj0 oj0Var = (oj0) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = oj0Var.f39211f0;
                arrayList.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.f20185id)) && oj0Var.P(user2)) {
                            arrayList.add(user2);
                            hashSet.add(Long.valueOf(user2.f20185id));
                        }
                    }
                }
                Boolean bool2 = oj0Var.f39222r0;
                if (bool2 != null && bool2.booleanValue()) {
                    ft ftVar = new ft(7, oj0Var, hashSet);
                    MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    if (str != null && !str.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f20084q = str;
                        tL_contacts_search.limit = 50;
                        i12 = connectionsManager.sendRequest(tL_contacts_search, new ui1(3, messagesController, ftVar));
                    } else {
                        AndroidUtilities.runOnUIThread(new rg.s1(ftVar, 6));
                    }
                    oj0Var.m0 = i12;
                    return;
                }
                oj0Var.S(true, true);
                return;
            case 7:
                oj0 oj0Var2 = (oj0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.f20185id)) && oj0Var2.P(user3)) {
                            oj0Var2.f39211f0.add(user3);
                            hashSet2.add(Long.valueOf(user3.f20185id));
                        }
                    }
                }
                oj0Var2.S(true, true);
                return;
            case 8:
                ak0 ak0Var = (ak0) obj3;
                String str2 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    ak0Var.R.setImageDrawable(null);
                    ak0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new h90(28, ak0Var, str2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = ak0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(ak0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21153v6), PorterDuff.Mode.SRC_IN));
                    ak0Var.R.setImageDrawable(mutate);
                    if (user4.contact) {
                        ak0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new h90(29, ak0Var, user4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        ak0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                ak0Var.w(false);
                return;
            case 9:
                ArrayList arrayList2 = (ArrayList) obj3;
                org.telegram.ui.Components.w9[] w9VarArr = (org.telegram.ui.Components.w9[]) obj2;
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
                            w9VarArr[i13].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str3), null);
                        }
                    }
                    return;
                }
                return;
            case 10:
                ((String[]) obj3)[0] = (String) obj;
                ((el0) obj2).run();
                return;
            case 11:
                gw0 gw0Var = (gw0) obj3;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                Long l10 = (Long) obj;
                gw0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle3.putLong("user_id", l10.longValue());
                } else {
                    bundle3.putLong("chat_id", -l10.longValue());
                }
                n2Var2.presentFragment(new ProfileActivity(bundle3, null));
                gw0Var.c(false);
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
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new is0(profileActivity, userFull, tL_birthday2, 3), 1024);
                return;
            case 13:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                ((org.telegram.ui.ActionBar.b2) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ci.kc E = ci.kc.E(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a2 = profileActivity2.a();
                    E.N = a2;
                    ci.ac acVar = E.f5382c1;
                    if (acVar != null) {
                        acVar.setDialogId(a2);
                    }
                    E.R(null);
                    return;
                }
                return;
            case 14:
                g11 g11Var = (g11) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = c71.k(str4, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder v = a4.a.v("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = j11.f37549s;
                    FileLog.e(v.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver();
                g11Var.f36468c = imageReceiver;
                g11Var.f36469e.add(imageReceiver);
                int f11 = gz.f();
                g11Var.f36468c.setAutoRepeat(0);
                i11 i11Var = g11Var.f36468c;
                hz0 hz0Var = new hz0(g11Var, 5);
                i11Var.getClass();
                i11Var.setDelegate(new h11(new Runnable[]{hz0Var}));
                i11Var.setImage(ImageLocation.getForDocument(k10), f11 + "_" + f11 + "_precache", null, null, tL_messages_stickerSet2, 0);
                g11Var.f36468c.onAttachedToWindow();
                g11Var.f36471g[1] = true;
                g11Var.a();
                return;
            case 15:
                Runnable runnable = (Runnable) obj;
                ((ai.i) obj3).run((HashSet) obj2);
                return;
            case 16:
                e51 e51Var = (e51) obj3;
                View view = (View) obj2;
                Bitmap bitmap3 = (Bitmap) obj;
                if (view != null) {
                    e51Var.getClass();
                    view.setVisibility(0);
                }
                e51Var.f35922f = bitmap3;
                Paint paint2 = new Paint(1);
                e51Var.f35923n = paint2;
                Bitmap bitmap4 = e51Var.f35922f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                e51Var.h = bitmapShader2;
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
                e51Var.f35923n.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                e51Var.f35924r = new Matrix();
                return;
            case 17:
                Boolean bool3 = (Boolean) obj;
                a91.W((a91) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            case 18:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.N0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    org.telegram.ui.Components.zl0 zl0Var = themeActivity.f34522b;
                    if (zl0Var != null && zl0Var.G && (K = zl0Var.K(themeActivity.M)) != null) {
                        themeActivity.f34520a.v(K, themeActivity.M);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                g91 g91Var = (g91) obj2;
                if (((Boolean) obj).booleanValue()) {
                    g91Var.run();
                    return;
                } else {
                    org.telegram.ui.Components.yc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
            case 20:
                org.telegram.ui.web.a2 a2Var = (org.telegram.ui.web.a2) obj3;
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj;
                a2Var.getClass();
                ((org.telegram.ui.web.h1[]) obj2)[0].finishFragment();
                Utilities.Callback callback = a2Var.f42098f;
                if (callback != null) {
                    a2Var.finishFragment();
                    callback.run(d1Var);
                    return;
                }
                nf.f.s(a2Var.getParentActivity(), d1Var.f42166c);
                return;
            case 21:
                org.telegram.ui.web.j2 j2Var = (org.telegram.ui.web.j2) obj3;
                j2Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.in0(j2Var, (org.telegram.ui.web.i2) obj2, (Bitmap) obj, 23));
                return;
            case 22:
                xh.q1 q1Var = (xh.q1) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj2;
                Boolean bool4 = (Boolean) obj;
                q1Var.getClass();
                if (callback2 != null) {
                    callback2.run(bool4);
                }
                if (bool4.booleanValue()) {
                    q1Var.skipDismissAnimation();
                }
                q1Var.dismiss();
                return;
            case 23:
                org.telegram.messenger.voip.f fVar = (org.telegram.messenger.voip.f) obj2;
                if (((Object[]) obj)[1] == ((yh.k5) obj3)) {
                    fVar.run();
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Components.fs0 fs0Var = (org.telegram.ui.Components.fs0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str5 = (String) obj;
                yh.j5 j5Var = fs0Var.f50220e;
                int i16 = tL_starGiftCollection.collection_id;
                j5Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i17 = j5Var.f51474a;
                updatestargiftcollection.peer = MessagesController.getInstance(i17).getInputPeer(j5Var.f51475b);
                updatestargiftcollection.collection_id = i16;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str5;
                ConnectionsManager.getInstance(i17).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str5;
                fs0Var.f(true);
                return;
            case 25:
                xh.z4 z4Var = (xh.z4) obj3;
                TLRPC.User user5 = (TLRPC.User) obj2;
                Void r12 = (Void) obj;
                long j10 = z4Var.Z;
                Runnable runnable2 = z4Var.f50334g0;
                if (runnable2 != null) {
                    runnable2.run();
                }
                z4Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new xh.q4(0, user5), 250L);
                MessagesController.getInstance(z4Var.Y).getMainSettings().edit().putBoolean("show_gift_for_" + j10, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                return;
            case 26:
                yh.x3 x3Var = (yh.x3) obj3;
                String str6 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                yh.u3 u3Var = x3Var.f52215e0;
                ei.l[] lVarArr = x3Var.f52239s0;
                ci.d dVar = x3Var.f52225j0;
                if (stargiftupgradepreview != null) {
                    u3Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    x3Var.q2(1, false, null);
                    u3Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str6), null);
                    lVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    lVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    lVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    x3Var.f52241u0.setVisibility(8);
                    x3Var.f52240t0.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), false, true);
                    dVar.f(null, false);
                    dVar.setOnClickListener(new yh.u0(x3Var, 4));
                    x3Var.show();
                    return;
                }
                return;
            case 27:
                yh.x3.m0((yh.x3) obj3, (org.telegram.ui.ActionBar.b2) obj2, (TL_stars.SavedStarGift) obj);
                return;
            case 28:
                yh.x2 x2Var = (yh.x2) obj3;
                x2Var.getClass();
                ((yh.v2) obj2).a((TL_stars.StarGift) obj, true);
                x2Var.d(true);
                return;
            default:
                yh.c3 c3Var = (yh.c3) obj3;
                zf.b bVar = (zf.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                nf.e eVar = c3Var.f51161n;
                if (eVar != null && bVar == c3Var.f51164q) {
                    eVar.c(false);
                }
                c3Var.f51163p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    c3Var.f51162o.put(bVar, new yh.a3(bVar, tL_payments_paymentFormStarGift));
                    c3Var.a(true);
                    return;
                }
                return;
        }
    }
}
