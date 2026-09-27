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
public final class et implements Utilities.Callback {
    public final int f33316a;
    public final Object f33317b;
    public final Object f33318c;

    public et(int i10, Object obj, Object obj2) {
        this.f33316a = i10;
        this.f33317b = obj;
        this.f33318c = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        TLRPC.Document document;
        s4.c1 L;
        int i11 = this.f33316a;
        float f7 = -0.04f;
        float f10 = 0.25f;
        int i12 = 0;
        Object obj2 = this.f33318c;
        Object obj3 = this.f33317b;
        switch (i11) {
            case 0:
                qt qtVar = (qt) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                Long l4 = (Long) obj;
                qtVar.getClass();
                Bundle bundle = new Bundle();
                if (l4.longValue() >= 0) {
                    bundle.putLong("user_id", l4.longValue());
                } else {
                    bundle.putLong("chat_id", -l4.longValue());
                }
                o2Var.presentFragment(new ProfileActivity(bundle, null));
                qtVar.p();
                return;
            case 1:
                mt mtVar = (mt) obj3;
                Boolean bool = (Boolean) obj;
                mtVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    mtVar.f35750a.p();
                    return;
                }
                return;
            case 2:
                ty tyVar = (ty) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    tyVar.showDialog(new bk0(activity, !org.telegram.ui.Components.ne0.c(), new fw(activity, 0)));
                    return;
                }
                return;
            case 3:
                tp0 tp0Var = (tp0) obj2;
                Integer num = (Integer) obj;
                e10 e10Var = ((b10) obj3).e;
                if (!e10Var.getUserConfig().isPremium()) {
                    e10Var.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) e10Var, 35, true));
                    return;
                }
                int intValue = num.intValue();
                e10Var.E = intValue;
                tp0Var.a(intValue, true);
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
                p50Var.f36330c = bitmap;
                Paint paint = new Paint(1);
                p50Var.d = paint;
                Bitmap bitmap2 = p50Var.f36330c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                p50Var.e = bitmapShader;
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
                cc0 cc0Var = (cc0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                cc0Var.a();
                if (user != null) {
                    long j3 = userArr[0].f18476id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.f18476id);
                    cc0Var.n(new bc0(bundle2, user, userArr, j3), false);
                    return;
                }
                return;
            case 6:
                nj0 nj0Var = (nj0) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = nj0Var.f36028f0;
                arrayList.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.f18476id)) && nj0Var.R(user2)) {
                            arrayList.add(user2);
                            hashSet.add(Long.valueOf(user2.f18476id));
                        }
                    }
                }
                Boolean bool2 = nj0Var.f36039r0;
                if (bool2 != null && bool2.booleanValue()) {
                    et etVar = new et(7, nj0Var, hashSet);
                    MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    if (str != null && !str.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f18375q = str;
                        tL_contacts_search.limit = 50;
                        i12 = connectionsManager.sendRequest(tL_contacts_search, new si1(3, messagesController, etVar));
                    } else {
                        AndroidUtilities.runOnUIThread(new rg.q1(etVar, 6));
                    }
                    nj0Var.m0 = i12;
                    return;
                }
                nj0Var.U(true, true);
                return;
            case 7:
                nj0 nj0Var2 = (nj0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.f18476id)) && nj0Var2.R(user3)) {
                            nj0Var2.f36028f0.add(user3);
                            hashSet2.add(Long.valueOf(user3.f18476id));
                        }
                    }
                }
                nj0Var2.U(true, true);
                return;
            case 8:
                yj0 yj0Var = (yj0) obj3;
                String str2 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    yj0Var.R.setImageDrawable(null);
                    yj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new ea0(26, yj0Var, str2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = yj0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(yj0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19390v6), PorterDuff.Mode.SRC_IN));
                    yj0Var.R.setImageDrawable(mutate);
                    if (user4.contact) {
                        yj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new ea0(27, yj0Var, user4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        yj0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                yj0Var.w(false);
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
                                        if (tL_messages_stickerSet.documents.get(i15).f18335id == longValue) {
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
                ((dl0) obj2).run();
                return;
            case 11:
                gw0 gw0Var = (gw0) obj3;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                Long l10 = (Long) obj;
                gw0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle3.putLong("user_id", l10.longValue());
                } else {
                    bundle3.putLong("chat_id", -l10.longValue());
                }
                o2Var2.presentFragment(new ProfileActivity(bundle3, null));
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
                ((org.telegram.ui.ActionBar.c2) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ci.kc E = ci.kc.E(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a2 = profileActivity2.a();
                    E.N = a2;
                    ci.ac acVar = E.f4991c1;
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
                    String[] strArr = j11.f34558s;
                    FileLog.e(v.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver();
                g11Var.f33701c = imageReceiver;
                g11Var.e.add(imageReceiver);
                int f11 = fz.f();
                g11Var.f33701c.setAutoRepeat(0);
                i11 i11Var = g11Var.f33701c;
                String str5 = f11 + "_" + f11 + "_precache";
                xz0 xz0Var = new xz0(g11Var, 4);
                i11Var.getClass();
                i11Var.setDelegate(new h11(new Runnable[]{xz0Var}));
                i11Var.setImage(ImageLocation.getForDocument(k10), str5, null, null, tL_messages_stickerSet2, 0);
                g11Var.f33701c.onAttachedToWindow();
                g11Var.f33703g[1] = true;
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
                e51Var.f33144f = bitmap3;
                Paint paint2 = new Paint(1);
                e51Var.f33145n = paint2;
                Bitmap bitmap4 = e51Var.f33144f;
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
                e51Var.f33145n.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                e51Var.f33146r = new Matrix();
                return;
            case 17:
                Boolean bool3 = (Boolean) obj;
                a91.a0((a91) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            case 18:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.N0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    org.telegram.ui.Components.yl0 yl0Var = themeActivity.f31839b;
                    if (yl0Var != null && yl0Var.G && (L = yl0Var.L(themeActivity.M)) != null) {
                        themeActivity.f31837a.v(L, themeActivity.M);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                fb1 fb1Var = (fb1) obj2;
                if (((Boolean) obj).booleanValue()) {
                    fb1Var.run();
                    return;
                } else {
                    org.telegram.ui.Components.xc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
            case 20:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) obj3;
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj;
                z1Var.getClass();
                ((org.telegram.ui.web.h1[]) obj2)[0].finishFragment();
                Utilities.Callback callback = z1Var.f39251f;
                if (callback != null) {
                    z1Var.finishFragment();
                    callback.run(d1Var);
                    return;
                }
                nf.f.s(z1Var.getParentActivity(), d1Var.f38997c);
                return;
            case 21:
                org.telegram.ui.web.j2 j2Var = (org.telegram.ui.web.j2) obj3;
                j2Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.en0(j2Var, (org.telegram.ui.web.i2) obj2, (Bitmap) obj, 23));
                return;
            case 22:
                xh.r1 r1Var = (xh.r1) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj2;
                Boolean bool4 = (Boolean) obj;
                r1Var.getClass();
                if (callback2 != null) {
                    callback2.run(bool4);
                }
                if (bool4.booleanValue()) {
                    r1Var.skipDismissAnimation();
                }
                r1Var.dismiss();
                return;
            case 23:
                org.telegram.messenger.voip.f fVar = (org.telegram.messenger.voip.f) obj2;
                if (((Object[]) obj)[1] == ((yh.k5) obj3)) {
                    fVar.run();
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Components.bs0 bs0Var = (org.telegram.ui.Components.bs0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str6 = (String) obj;
                yh.j5 j5Var = bs0Var.e;
                int i16 = tL_starGiftCollection.collection_id;
                j5Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i17 = j5Var.f47620a;
                updatestargiftcollection.peer = MessagesController.getInstance(i17).getInputPeer(j5Var.f47621b);
                updatestargiftcollection.collection_id = i16;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str6;
                ConnectionsManager.getInstance(i17).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str6;
                bs0Var.f(true);
                return;
            case 25:
                xh.a5 a5Var = (xh.a5) obj3;
                TLRPC.User user5 = (TLRPC.User) obj2;
                Void r12 = (Void) obj;
                long j10 = a5Var.Z;
                Runnable runnable2 = a5Var.f46125g0;
                if (runnable2 != null) {
                    runnable2.run();
                }
                a5Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new xh.r4(0, user5), 250L);
                MessagesController.getInstance(a5Var.Y).getMainSettings().edit().putBoolean("show_gift_for_" + j10, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                return;
            case 26:
                yh.x3 x3Var = (yh.x3) obj3;
                String str7 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                yh.u3 u3Var = x3Var.f48285e0;
                ei.k[] kVarArr = x3Var.f48309s0;
                ci.d dVar = x3Var.f48295j0;
                if (stargiftupgradepreview != null) {
                    u3Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    x3Var.q2(1, false, null);
                    u3Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str7), null);
                    kVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    kVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    kVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    x3Var.f48311u0.setVisibility(8);
                    x3Var.f48310t0.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), false, true);
                    dVar.f(null, false);
                    dVar.setOnClickListener(new yh.u0(x3Var, 4));
                    x3Var.show();
                    return;
                }
                return;
            case 27:
                yh.x3.m0((yh.x3) obj3, (org.telegram.ui.ActionBar.c2) obj2, (TL_stars.SavedStarGift) obj);
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
                nf.e eVar = c3Var.f47315n;
                if (eVar != null && bVar == c3Var.f47318q) {
                    eVar.c(false);
                }
                c3Var.f47317p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    c3Var.f47316o.put(bVar, new yh.a3(bVar, tL_payments_paymentFormStarGift));
                    c3Var.a(true);
                    return;
                }
                return;
        }
    }
}
