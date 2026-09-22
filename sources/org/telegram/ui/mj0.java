package org.telegram.ui;

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
public final class mj0 implements Utilities.Callback {
    public final int f35761a;
    public final Object f35762b;
    public final Object f35763c;

    public mj0(int i10, Object obj, Object obj2) {
        this.f35761a = i10;
        this.f35762b = obj;
        this.f35763c = obj2;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.Document document;
        float f7;
        float f10;
        s4.c1 K;
        int i10 = this.f35761a;
        Object obj2 = this.f35763c;
        Object obj3 = this.f35762b;
        switch (i10) {
            case 0:
                rj0 rj0Var = (rj0) obj3;
                HashSet hashSet = (HashSet) obj2;
                List<TLRPC.User> list = (List) obj;
                if (list != null) {
                    for (TLRPC.User user : list) {
                        if (user != null && !hashSet.contains(Long.valueOf(user.f18256id)) && rj0Var.R(user)) {
                            rj0Var.f37149f0.add(user);
                            hashSet.add(Long.valueOf(user.f18256id));
                        }
                    }
                }
                rj0Var.U(true, true);
                return;
            case 1:
                ck0 ck0Var = (ck0) obj3;
                String str = (String) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (user2 == null) {
                    ck0Var.R.setImageDrawable(null);
                    ck0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new ma0(25, ck0Var, str)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = ck0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(ck0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19163v6), PorterDuff.Mode.SRC_IN));
                    ck0Var.R.setImageDrawable(mutate);
                    if (user2.contact) {
                        ck0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new ma0(26, ck0Var, user2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        ck0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                ck0Var.w(false);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj3;
                org.telegram.ui.Components.u9[] u9VarArr = (org.telegram.ui.Components.u9[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        String str2 = (String) arrayList.get(i11);
                        int i12 = 0;
                        while (true) {
                            if (i12 < tL_messages_stickerSet.packs.size()) {
                                if (!tL_messages_stickerSet.packs.get(i12).documents.isEmpty() && TextUtils.equals(tL_messages_stickerSet.packs.get(i12).emoticon, str2)) {
                                    long longValue = tL_messages_stickerSet.packs.get(i12).documents.get(0).longValue();
                                    for (int i13 = 0; i13 < tL_messages_stickerSet.documents.size(); i13++) {
                                        if (tL_messages_stickerSet.documents.get(i13).f18115id == longValue) {
                                            document = tL_messages_stickerSet.documents.get(i13);
                                        }
                                    }
                                } else {
                                    i12++;
                                }
                            }
                        }
                        document = null;
                        if (document != null) {
                            u9VarArr[i11].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str2), null);
                        }
                    }
                    return;
                }
                return;
            case 3:
                ((String[]) obj3)[0] = (String) obj;
                ((gl0) obj2).run();
                return;
            case 4:
                mw0 mw0Var = (mw0) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                Long l4 = (Long) obj;
                mw0Var.getClass();
                Bundle bundle = new Bundle();
                if (l4.longValue() >= 0) {
                    bundle.putLong("user_id", l4.longValue());
                } else {
                    bundle.putLong("chat_id", -l4.longValue());
                }
                n2Var.presentFragment(new ProfileActivity(bundle, null));
                mw0Var.c(false);
                return;
            case 5:
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
            case 6:
                o11 o11Var = (o11) obj3;
                String str3 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = h71.k(str3, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder w10 = a4.a.w("couldn't find ", str3, " sticker in EmojiAnimations");
                    String[] strArr = r11.f36991s;
                    FileLog.e(w10.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver();
                o11Var.f36092c = imageReceiver;
                o11Var.e.add(imageReceiver);
                int f11 = gz.f();
                o11Var.f36092c.setAutoRepeat(0);
                q11 q11Var = o11Var.f36092c;
                String str4 = f11 + "_" + f11 + "_precache";
                f01 f01Var = new f01(o11Var, 4);
                q11Var.getClass();
                q11Var.setDelegate(new p11(new Runnable[]{f01Var}));
                q11Var.setImage(ImageLocation.getForDocument(k10), str4, null, null, tL_messages_stickerSet2, 0);
                o11Var.f36092c.onAttachedToWindow();
                o11Var.f36094g[1] = true;
                o11Var.a();
                return;
            case 7:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.j3) obj3).run((HashSet) obj2);
                return;
            case 8:
                i51 i51Var = (i51) obj3;
                View view = (View) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view != null) {
                    i51Var.getClass();
                    view.setVisibility(0);
                }
                i51Var.f34420f = bitmap;
                Paint paint = new Paint(1);
                i51Var.f34421n = paint;
                Bitmap bitmap2 = i51Var.f34420f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                i51Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f7 = 0.05f;
                } else {
                    f7 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                i51Var.f34421n.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                i51Var.f34422r = new Matrix();
                return;
            case 9:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.N0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    org.telegram.ui.Components.ll0 ll0Var = themeActivity.f31548b;
                    if (ll0Var != null && ll0Var.G && (K = ll0Var.K(themeActivity.M)) != null) {
                        themeActivity.f31546a.v(K, themeActivity.M);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                iy0 iy0Var = (iy0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    iy0Var.run();
                    return;
                } else {
                    org.telegram.ui.Components.vc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
            case 11:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) obj3;
                org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) obj;
                z1Var.getClass();
                ((org.telegram.ui.web.h1[]) obj2)[0].finishFragment();
                Utilities.Callback callback = z1Var.e;
                if (callback != null) {
                    z1Var.finishFragment();
                    callback.run(e1Var);
                    return;
                }
                nf.f.s(z1Var.getParentActivity(), e1Var.f38944c);
                return;
            case 12:
                org.telegram.ui.web.i2 i2Var = (org.telegram.ui.web.i2) obj3;
                i2Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fr0(i2Var, (org.telegram.ui.web.h2) obj2, (Bitmap) obj, 20));
                return;
            case 13:
                xh.q1 q1Var = (xh.q1) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj2;
                Boolean bool = (Boolean) obj;
                q1Var.getClass();
                if (callback2 != null) {
                    callback2.run(bool);
                }
                if (bool.booleanValue()) {
                    q1Var.skipDismissAnimation();
                }
                q1Var.dismiss();
                return;
            case 14:
                org.telegram.messenger.voip.f fVar = (org.telegram.messenger.voip.f) obj2;
                if (((Object[]) obj)[1] == ((yh.m5) obj3)) {
                    fVar.run();
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.nr0 nr0Var = (org.telegram.ui.Components.nr0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str5 = (String) obj;
                yh.l5 l5Var = nr0Var.e;
                int i14 = tL_starGiftCollection.collection_id;
                l5Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i15 = l5Var.f47361a;
                updatestargiftcollection.peer = MessagesController.getInstance(i15).getInputPeer(l5Var.f47362b);
                updatestargiftcollection.collection_id = i14;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str5;
                ConnectionsManager.getInstance(i15).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str5;
                nr0Var.f(true);
                return;
            case 16:
                xh.y4 y4Var = (xh.y4) obj3;
                TLRPC.User user3 = (TLRPC.User) obj2;
                Void r15 = (Void) obj;
                long j3 = y4Var.Z;
                Runnable runnable2 = y4Var.f46214g0;
                if (runnable2 != null) {
                    runnable2.run();
                }
                y4Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new xh.p4(0, user3), 250L);
                MessagesController.getInstance(y4Var.Y).getMainSettings().edit().putBoolean("show_gift_for_" + j3, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j3, true).apply();
                return;
            case 17:
                yh.z3 z3Var = (yh.z3) obj3;
                String str6 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                yh.w3 w3Var = z3Var.f48019e0;
                ei.k[] kVarArr = z3Var.f48043s0;
                ci.d dVar = z3Var.f48029j0;
                if (stargiftupgradepreview != null) {
                    w3Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    z3Var.q2(1, false, null);
                    w3Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str6), null);
                    kVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    kVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    kVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    z3Var.f48045u0.setVisibility(8);
                    z3Var.f48044t0.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), false, true);
                    dVar.f(null, false);
                    dVar.setOnClickListener(new yh.u0(z3Var, 4));
                    z3Var.show();
                    return;
                }
                return;
            case 18:
                yh.z3.n0((yh.z3) obj3, (org.telegram.ui.ActionBar.b2) obj2, (TL_stars.SavedStarGift) obj);
                return;
            case 19:
                yh.z2 z2Var = (yh.z2) obj3;
                z2Var.getClass();
                ((yh.w2) obj2).a((TL_stars.StarGift) obj, true);
                z2Var.d(true);
                return;
            case 20:
                yh.e3 e3Var = (yh.e3) obj3;
                zf.b bVar = (zf.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                nf.e eVar = e3Var.f47054n;
                if (eVar != null && bVar == e3Var.f47057q) {
                    eVar.c(false);
                }
                e3Var.f47056p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    e3Var.f47055o.put(bVar, new yh.c3(bVar, tL_payments_paymentFormStarGift));
                    e3Var.a(true);
                    return;
                }
                return;
            default:
                ((Utilities.Callback2) obj3).run((zf.a) obj, new yh.x2((yh.i0[]) obj2, 4));
                return;
        }
    }
}
