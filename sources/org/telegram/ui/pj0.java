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
public final class pj0 implements Utilities.Callback {
    public final int f36578a;
    public final Object f36579b;
    public final Object f36580c;

    public pj0(int i10, Object obj, Object obj2) {
        this.f36578a = i10;
        this.f36579b = obj;
        this.f36580c = obj2;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.Document document;
        float f7;
        float f10;
        s4.c1 L;
        int i10 = this.f36578a;
        Object obj2 = this.f36580c;
        Object obj3 = this.f36579b;
        switch (i10) {
            case 0:
                uj0 uj0Var = (uj0) obj3;
                HashSet hashSet = (HashSet) obj2;
                List<TLRPC.User> list = (List) obj;
                if (list != null) {
                    for (TLRPC.User user : list) {
                        if (user != null && !hashSet.contains(Long.valueOf(user.f18475id)) && uj0Var.R(user)) {
                            uj0Var.f38119f0.add(user);
                            hashSet.add(Long.valueOf(user.f18475id));
                        }
                    }
                }
                uj0Var.U(true, true);
                return;
            case 1:
                fk0 fk0Var = (fk0) obj3;
                String str = (String) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (user2 == null) {
                    fk0Var.R.setImageDrawable(null);
                    fk0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new fj0(1, fk0Var, str)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = fk0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(fk0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19425v6), PorterDuff.Mode.SRC_IN));
                    fk0Var.R.setImageDrawable(mutate);
                    if (user2.contact) {
                        fk0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new fj0(2, fk0Var, user2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        fk0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                fk0Var.w(false);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj3;
                org.telegram.ui.Components.v9[] v9VarArr = (org.telegram.ui.Components.v9[]) obj2;
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
                                        if (tL_messages_stickerSet.documents.get(i13).f18334id == longValue) {
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
                            v9VarArr[i11].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str2), null);
                        }
                    }
                    return;
                }
                return;
            case 3:
                ((String[]) obj3)[0] = (String) obj;
                ((jl0) obj2).run();
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
                TLRPC.Document k10 = j71.k(str3, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder v = a4.a.v("couldn't find ", str3, " sticker in EmojiAnimations");
                    String[] strArr = q11.f36736s;
                    FileLog.e(v.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver();
                n11Var.f35875c = imageReceiver;
                n11Var.e.add(imageReceiver);
                int f11 = gz.f();
                n11Var.f35875c.setAutoRepeat(0);
                p11 p11Var = n11Var.f35875c;
                String str4 = f11 + "_" + f11 + "_precache";
                e01 e01Var = new e01(n11Var, 4);
                p11Var.getClass();
                p11Var.setDelegate(new o11(new Runnable[]{e01Var}));
                p11Var.setImage(ImageLocation.getForDocument(k10), str4, null, null, tL_messages_stickerSet2, 0);
                n11Var.f35875c.onAttachedToWindow();
                n11Var.f35877g[1] = true;
                n11Var.a();
                return;
            case 7:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.j3) obj3).run((HashSet) obj2);
                return;
            case 8:
                l51 l51Var = (l51) obj3;
                View view = (View) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view != null) {
                    l51Var.getClass();
                    view.setVisibility(0);
                }
                l51Var.f35315f = bitmap;
                Paint paint = new Paint(1);
                l51Var.f35316n = paint;
                Bitmap bitmap2 = l51Var.f35315f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                l51Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f7 = 0.05f;
                } else {
                    f7 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                l51Var.f35316n.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                l51Var.f35317r = new Matrix();
                return;
            case 9:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.N0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    org.telegram.ui.Components.vl0 vl0Var = themeActivity.f31835b;
                    if (vl0Var != null && vl0Var.G && (L = vl0Var.L(themeActivity.M)) != null) {
                        themeActivity.f31833a.v(L, themeActivity.M);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                w81 w81Var = (w81) obj2;
                if (((Boolean) obj).booleanValue()) {
                    w81Var.run();
                    return;
                } else {
                    org.telegram.ui.Components.xc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
            case 11:
                org.telegram.ui.web.a2 a2Var = (org.telegram.ui.web.a2) obj3;
                org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) obj;
                a2Var.getClass();
                ((org.telegram.ui.web.i1[]) obj2)[0].finishFragment();
                Utilities.Callback callback = a2Var.f38824f;
                if (callback != null) {
                    a2Var.finishFragment();
                    callback.run(e1Var);
                    return;
                }
                nf.f.s(a2Var.getParentActivity(), e1Var.f38893c);
                return;
            case 12:
                org.telegram.ui.web.j2 j2Var = (org.telegram.ui.web.j2) obj3;
                j2Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.cn0(j2Var, (org.telegram.ui.web.i2) obj2, (Bitmap) obj, 23));
                return;
            case 13:
                xh.r1 r1Var = (xh.r1) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj2;
                Boolean bool = (Boolean) obj;
                r1Var.getClass();
                if (callback2 != null) {
                    callback2.run(bool);
                }
                if (bool.booleanValue()) {
                    r1Var.skipDismissAnimation();
                }
                r1Var.dismiss();
                return;
            case 14:
                org.telegram.messenger.voip.f fVar = (org.telegram.messenger.voip.f) obj2;
                if (((Object[]) obj)[1] == ((yh.l5) obj3)) {
                    fVar.run();
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.yr0 yr0Var = (org.telegram.ui.Components.yr0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str5 = (String) obj;
                yh.k5 k5Var = yr0Var.e;
                int i14 = tL_starGiftCollection.collection_id;
                k5Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i15 = k5Var.f47645a;
                updatestargiftcollection.peer = MessagesController.getInstance(i15).getInputPeer(k5Var.f47646b);
                updatestargiftcollection.collection_id = i14;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str5;
                ConnectionsManager.getInstance(i15).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str5;
                yr0Var.f(true);
                return;
            case 16:
                xh.z4 z4Var = (xh.z4) obj3;
                TLRPC.User user3 = (TLRPC.User) obj2;
                Void r12 = (Void) obj;
                long j3 = z4Var.Z;
                Runnable runnable2 = z4Var.f46532g0;
                if (runnable2 != null) {
                    runnable2.run();
                }
                z4Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new xh.q4(0, user3), 250L);
                MessagesController.getInstance(z4Var.Y).getMainSettings().edit().putBoolean("show_gift_for_" + j3, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j3, true).apply();
                return;
            case 17:
                yh.y3 y3Var = (yh.y3) obj3;
                String str6 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                yh.v3 v3Var = y3Var.f48307e0;
                ei.k[] kVarArr = y3Var.f48331s0;
                ci.d dVar = y3Var.f48317j0;
                if (stargiftupgradepreview != null) {
                    v3Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    y3Var.q2(1, false, null);
                    v3Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str6), null);
                    kVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    kVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    kVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    y3Var.f48333u0.setVisibility(8);
                    y3Var.f48332t0.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), false, true);
                    dVar.f(null, false);
                    dVar.setOnClickListener(new yh.u0(y3Var, 4));
                    y3Var.show();
                    return;
                }
                return;
            case 18:
                yh.y3.n0((yh.y3) obj3, (org.telegram.ui.ActionBar.b2) obj2, (TL_stars.SavedStarGift) obj);
                return;
            case 19:
                yh.y2 y2Var = (yh.y2) obj3;
                y2Var.getClass();
                ((yh.w2) obj2).a((TL_stars.StarGift) obj, true);
                y2Var.d(true);
                return;
            case 20:
                yh.d3 d3Var = (yh.d3) obj3;
                zf.b bVar = (zf.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                nf.e eVar = d3Var.f47334n;
                if (eVar != null && bVar == d3Var.f47337q) {
                    eVar.c(false);
                }
                d3Var.f47336p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    d3Var.f47335o.put(bVar, new yh.b3(bVar, tL_payments_paymentFormStarGift));
                    d3Var.a(true);
                    return;
                }
                return;
            default:
                ((Utilities.Callback2) obj3).run((zf.a) obj, new yh.s2((yh.i0[]) obj2, 5));
                return;
        }
    }
}
