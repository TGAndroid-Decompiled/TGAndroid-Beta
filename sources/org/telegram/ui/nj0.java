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
public final class nj0 implements Utilities.Callback {
    public final int f35290a;
    public final Object f35291b;
    public final Object f35292c;

    public nj0(int i10, Object obj, Object obj2) {
        this.f35290a = i10;
        this.f35291b = obj;
        this.f35292c = obj2;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.Document document;
        float f7;
        float f10;
        s4.c1 K;
        int i10 = this.f35290a;
        Object obj2 = this.f35292c;
        Object obj3 = this.f35291b;
        switch (i10) {
            case 0:
                sj0 sj0Var = (sj0) obj3;
                HashSet hashSet = (HashSet) obj2;
                List<TLRPC.User> list = (List) obj;
                if (list != null) {
                    for (TLRPC.User user : list) {
                        if (user != null && !hashSet.contains(Long.valueOf(user.f17342id)) && sj0Var.R(user)) {
                            sj0Var.f36699f0.add(user);
                            hashSet.add(Long.valueOf(user.f17342id));
                        }
                    }
                }
                sj0Var.U(true, true);
                return;
            case 1:
                ek0 ek0Var = (ek0) obj3;
                String str = (String) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (user2 == null) {
                    ek0Var.R.setImageDrawable(null);
                    ek0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new h90(28, ek0Var, str)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = ek0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(ek0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18254v6), PorterDuff.Mode.SRC_IN));
                    ek0Var.R.setImageDrawable(mutate);
                    if (user2.contact) {
                        ek0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new h90(29, ek0Var, user2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        ek0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                ek0Var.w(false);
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj3;
                org.telegram.ui.Components.w9[] w9VarArr = (org.telegram.ui.Components.w9[]) obj2;
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
                                        if (tL_messages_stickerSet.documents.get(i13).f17201id == longValue) {
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
                            w9VarArr[i11].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str2), null);
                        }
                    }
                    return;
                }
                return;
            case 3:
                ((String[]) obj3)[0] = (String) obj;
                ((il0) obj2).run();
                return;
            case 4:
                ow0 ow0Var = (ow0) obj3;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                Long l4 = (Long) obj;
                ow0Var.getClass();
                Bundle bundle = new Bundle();
                if (l4.longValue() >= 0) {
                    bundle.putLong("user_id", l4.longValue());
                } else {
                    bundle.putLong("chat_id", -l4.longValue());
                }
                p2Var.presentFragment(new ProfileActivity(bundle, null));
                ow0Var.c(false);
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
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new ms0(profileActivity, userFull, tL_birthday2, 3), 1024);
                return;
            case 6:
                t11 t11Var = (t11) obj3;
                String str3 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = l71.k(str3, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder v = a4.a.v("couldn't find ", str3, " sticker in EmojiAnimations");
                    String[] strArr = w11.f37670s;
                    FileLog.e(v.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver();
                t11Var.f36815c = imageReceiver;
                t11Var.e.add(imageReceiver);
                int f11 = iz.f();
                t11Var.f36815c.setAutoRepeat(0);
                v11 v11Var = t11Var.f36815c;
                String str4 = f11 + "_" + f11 + "_precache";
                k01 k01Var = new k01(t11Var, 4);
                v11Var.getClass();
                v11Var.setDelegate(new u11(new Runnable[]{k01Var}));
                v11Var.setImage(ImageLocation.getForDocument(k10), str4, null, null, tL_messages_stickerSet2, 0);
                t11Var.f36815c.onAttachedToWindow();
                t11Var.f36817g[1] = true;
                t11Var.a();
                return;
            case 7:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.l3) obj3).run((HashSet) obj2);
                return;
            case 8:
                n51 n51Var = (n51) obj3;
                View view = (View) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view != null) {
                    n51Var.getClass();
                    view.setVisibility(0);
                }
                n51Var.f35128f = bitmap;
                Paint paint = new Paint(1);
                n51Var.f35129n = paint;
                Bitmap bitmap2 = n51Var.f35128f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                n51Var.h = bitmapShader;
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
                n51Var.f35129n.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                n51Var.f35130r = new Matrix();
                return;
            case 9:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.N0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    org.telegram.ui.Components.vl0 vl0Var = themeActivity.f30663b;
                    if (vl0Var != null && vl0Var.G && (K = vl0Var.K(themeActivity.M)) != null) {
                        themeActivity.f30661a.v(K, themeActivity.M);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                r91 r91Var = (r91) obj2;
                if (((Boolean) obj).booleanValue()) {
                    r91Var.run();
                    return;
                } else {
                    org.telegram.ui.Components.wc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
            case 11:
                org.telegram.ui.web.b2 b2Var = (org.telegram.ui.web.b2) obj3;
                org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) obj;
                b2Var.getClass();
                ((org.telegram.ui.web.h1[]) obj2)[0].finishFragment();
                Utilities.Callback callback = b2Var.e;
                if (callback != null) {
                    b2Var.finishFragment();
                    callback.run(e1Var);
                    return;
                }
                nf.f.s(b2Var.getParentActivity(), e1Var.f37928c);
                return;
            case 12:
                org.telegram.ui.web.k2 k2Var = (org.telegram.ui.web.k2) obj3;
                k2Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sx0((Object) k2Var, (Object) ((org.telegram.ui.web.j2) obj2), (Object) ((Bitmap) obj), 12));
                return;
            case 13:
                wh.p1 p1Var = (wh.p1) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj2;
                Boolean bool = (Boolean) obj;
                p1Var.getClass();
                if (callback2 != null) {
                    callback2.run(bool);
                }
                if (bool.booleanValue()) {
                    p1Var.skipDismissAnimation();
                }
                p1Var.dismiss();
                return;
            case 14:
                org.telegram.messenger.voip.g gVar = (org.telegram.messenger.voip.g) obj2;
                if (((Object[]) obj)[1] == ((xh.n5) obj3)) {
                    gVar.run();
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.wr0 wr0Var = (org.telegram.ui.Components.wr0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str5 = (String) obj;
                xh.l5 l5Var = wr0Var.e;
                int i14 = tL_starGiftCollection.collection_id;
                l5Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i15 = l5Var.f45662a;
                updatestargiftcollection.peer = MessagesController.getInstance(i15).getInputPeer(l5Var.f45663b);
                updatestargiftcollection.collection_id = i14;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str5;
                ConnectionsManager.getInstance(i15).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str5;
                wr0Var.f(true);
                return;
            case 16:
                wh.y4 y4Var = (wh.y4) obj3;
                TLRPC.User user3 = (TLRPC.User) obj2;
                Void r15 = (Void) obj;
                long j3 = y4Var.Z;
                Runnable runnable2 = y4Var.f44446g0;
                if (runnable2 != null) {
                    runnable2.run();
                }
                y4Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new wh.p4(0, user3), 250L);
                MessagesController.getInstance(y4Var.Y).getMainSettings().edit().putBoolean("show_gift_for_" + j3, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j3, true).apply();
                return;
            case 17:
                xh.x3 x3Var = (xh.x3) obj3;
                String str6 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                xh.u3 u3Var = x3Var.f46275e0;
                di.l[] lVarArr = x3Var.f46299s0;
                bi.d dVar = x3Var.f46285j0;
                if (stargiftupgradepreview != null) {
                    u3Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    x3Var.q2(1, false, null);
                    u3Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str6), null);
                    lVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    lVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    lVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    x3Var.f46301u0.setVisibility(8);
                    x3Var.f46300t0.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), false, true);
                    dVar.f(null, false);
                    dVar.setOnClickListener(new xh.u0(x3Var, 4));
                    x3Var.show();
                    return;
                }
                return;
            case 18:
                xh.x3.n0((xh.x3) obj3, (org.telegram.ui.ActionBar.d2) obj2, (TL_stars.SavedStarGift) obj);
                return;
            case 19:
                xh.x2 x2Var = (xh.x2) obj3;
                x2Var.getClass();
                ((xh.v2) obj2).a((TL_stars.StarGift) obj, true);
                x2Var.d(true);
                return;
            case 20:
                xh.c3 c3Var = (xh.c3) obj3;
                yf.b bVar = (yf.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                nf.e eVar = c3Var.f45309n;
                if (eVar != null && bVar == c3Var.f45312q) {
                    eVar.c(false);
                }
                c3Var.f45311p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    c3Var.f45310o.put(bVar, new xh.a3(bVar, tL_payments_paymentFormStarGift));
                    c3Var.a(true);
                    return;
                }
                return;
            default:
                ((Utilities.Callback2) obj3).run((yf.a) obj, new xh.x((xh.i0[]) obj2, 11));
                return;
        }
    }
}
