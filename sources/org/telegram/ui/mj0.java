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
                        if (user != null && !hashSet.contains(Long.valueOf(user.f18259id)) && rj0Var.R(user)) {
                            rj0Var.f37131f0.add(user);
                            hashSet.add(Long.valueOf(user.f18259id));
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
                    mutate.setColorFilter(new PorterDuffColorFilter(ck0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19166v6), PorterDuff.Mode.SRC_IN));
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
                                        if (tL_messages_stickerSet.documents.get(i13).f18118id == longValue) {
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
                n11 n11Var = (n11) obj3;
                String str3 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = g71.k(str3, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder v = a4.a.v("couldn't find ", str3, " sticker in EmojiAnimations");
                    String[] strArr = q11.f36730s;
                    FileLog.e(v.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver();
                n11Var.f35865c = imageReceiver;
                n11Var.e.add(imageReceiver);
                int f11 = gz.f();
                n11Var.f35865c.setAutoRepeat(0);
                p11 p11Var = n11Var.f35865c;
                String str4 = f11 + "_" + f11 + "_precache";
                e01 e01Var = new e01(n11Var, 4);
                p11Var.getClass();
                p11Var.setDelegate(new o11(new Runnable[]{e01Var}));
                p11Var.setImage(ImageLocation.getForDocument(k10), str4, null, null, tL_messages_stickerSet2, 0);
                n11Var.f35865c.onAttachedToWindow();
                n11Var.f35867g[1] = true;
                n11Var.a();
                return;
            case 7:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.j3) obj3).run((HashSet) obj2);
                return;
            case 8:
                h51 h51Var = (h51) obj3;
                View view = (View) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view != null) {
                    h51Var.getClass();
                    view.setVisibility(0);
                }
                h51Var.f34167f = bitmap;
                Paint paint = new Paint(1);
                h51Var.f34168n = paint;
                Bitmap bitmap2 = h51Var.f34167f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                h51Var.h = bitmapShader;
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
                h51Var.f34168n.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                h51Var.f34169r = new Matrix();
                return;
            case 9:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.N0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    org.telegram.ui.Components.ll0 ll0Var = themeActivity.f31551b;
                    if (ll0Var != null && ll0Var.G && (K = ll0Var.K(themeActivity.M)) != null) {
                        themeActivity.f31549a.v(K, themeActivity.M);
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
                Utilities.Callback callback = z1Var.f39176f;
                if (callback != null) {
                    z1Var.finishFragment();
                    callback.run(e1Var);
                    return;
                }
                nf.f.s(z1Var.getParentActivity(), e1Var.f38938c);
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
                if (((Object[]) obj)[1] == ((yh.n5) obj3)) {
                    fVar.run();
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.nr0 nr0Var = (org.telegram.ui.Components.nr0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str5 = (String) obj;
                yh.m5 m5Var = nr0Var.e;
                int i14 = tL_starGiftCollection.collection_id;
                m5Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i15 = m5Var.f47457a;
                updatestargiftcollection.peer = MessagesController.getInstance(i15).getInputPeer(m5Var.f47458b);
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
                Runnable runnable2 = y4Var.f46218g0;
                if (runnable2 != null) {
                    runnable2.run();
                }
                y4Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new xh.p4(0, user3), 250L);
                MessagesController.getInstance(y4Var.Y).getMainSettings().edit().putBoolean("show_gift_for_" + j3, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j3, true).apply();
                return;
            case 17:
                yh.a4 a4Var = (yh.a4) obj3;
                String str6 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                yh.x3 x3Var = a4Var.f46953e0;
                ei.k[] kVarArr = a4Var.f46977s0;
                ci.d dVar = a4Var.f46963j0;
                if (stargiftupgradepreview != null) {
                    x3Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    a4Var.q2(1, false, null);
                    x3Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str6), null);
                    kVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    kVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    kVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    a4Var.f46979u0.setVisibility(8);
                    a4Var.f46978t0.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), false, true);
                    dVar.f(null, false);
                    dVar.setOnClickListener(new yh.u0(a4Var, 4));
                    a4Var.show();
                    return;
                }
                return;
            case 18:
                yh.a4.n0((yh.a4) obj3, (org.telegram.ui.ActionBar.b2) obj2, (TL_stars.SavedStarGift) obj);
                return;
            case 19:
                yh.a3 a3Var = (yh.a3) obj3;
                a3Var.getClass();
                ((yh.x2) obj2).a((TL_stars.StarGift) obj, true);
                a3Var.d(true);
                return;
            case 20:
                yh.f3 f3Var = (yh.f3) obj3;
                zf.b bVar = (zf.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                nf.e eVar = f3Var.f47156n;
                if (eVar != null && bVar == f3Var.f47159q) {
                    eVar.c(false);
                }
                f3Var.f47158p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    f3Var.f47157o.put(bVar, new yh.d3(bVar, tL_payments_paymentFormStarGift));
                    f3Var.a(true);
                    return;
                }
                return;
            default:
                ((Utilities.Callback2) obj3).run((zf.a) obj, new yh.y2((yh.i0[]) obj2, 4));
                return;
        }
    }
}
