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
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
public final class eb0 implements Utilities.Callback {
    public final int f37891a;
    public final Object f37892b;
    public final Object f37893c;

    public eb0(int i9, Object obj, Object obj2) {
        this.f37891a = i9;
        this.f37892b = obj;
        this.f37893c = obj2;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.Document document;
        float f10;
        float f11;
        f2.q1 K;
        String str;
        qh.r a2;
        int i9 = this.f37891a;
        int i10 = 0;
        Object obj2 = this.f37893c;
        Object obj3 = this.f37892b;
        switch (i9) {
            case 0:
                kb0 kb0Var = (kb0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                kb0Var.a();
                if (user != null) {
                    long j10 = userArr[0].f22527id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f22527id);
                    kb0Var.n(new jb0(bundle, user, userArr, j10), false);
                    return;
                }
                return;
            case 1:
                bj0 bj0Var = (bj0) obj3;
                String str2 = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = bj0Var.f36880b0;
                arrayList.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.f22527id)) && bj0Var.Q(user2)) {
                            arrayList.add(user2);
                            hashSet.add(Long.valueOf(user2.f22527id));
                        }
                    }
                }
                Boolean bool = bj0Var.f36891n0;
                if (bool != null && bool.booleanValue()) {
                    eb0 eb0Var = new eb0(2, bj0Var, hashSet);
                    MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    if (str2 != null && !str2.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f22426q = str2;
                        tL_contacts_search.limit = 50;
                        i10 = connectionsManager.sendRequest(tL_contacts_search, new bg.j0(1, messagesController, eb0Var));
                    } else {
                        AndroidUtilities.runOnUIThread(new af.e(eb0Var, 10));
                    }
                    bj0Var.f36887i0 = i10;
                    return;
                }
                bj0Var.T(true, true);
                return;
            case 2:
                bj0 bj0Var2 = (bj0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.f22527id)) && bj0Var2.Q(user3)) {
                            bj0Var2.f36880b0.add(user3);
                            hashSet2.add(Long.valueOf(user3.f22527id));
                        }
                    }
                }
                bj0Var2.T(true, true);
                return;
            case 3:
                nj0 nj0Var = (nj0) obj3;
                String str3 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    nj0Var.N.setImageDrawable(null);
                    nj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new cf0(7, nj0Var, str3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = nj0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(nj0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23319v6), PorterDuff.Mode.SRC_IN));
                    nj0Var.N.setImageDrawable(mutate);
                    if (user4.contact) {
                        nj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new cf0(8, nj0Var, user4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        nj0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                nj0Var.w(false);
                return;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj3;
                org.telegram.ui.Components.o9[] o9VarArr = (org.telegram.ui.Components.o9[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        String str4 = (String) arrayList2.get(i11);
                        int i12 = 0;
                        while (true) {
                            if (i12 < tL_messages_stickerSet.packs.size()) {
                                if (!tL_messages_stickerSet.packs.get(i12).documents.isEmpty() && TextUtils.equals(tL_messages_stickerSet.packs.get(i12).emoticon, str4)) {
                                    long longValue = tL_messages_stickerSet.packs.get(i12).documents.get(0).longValue();
                                    for (int i13 = 0; i13 < tL_messages_stickerSet.documents.size(); i13++) {
                                        if (tL_messages_stickerSet.documents.get(i13).f22386id == longValue) {
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
                            o9VarArr[i11].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str4), null);
                        }
                    }
                    return;
                }
                return;
            case 5:
                ((String[]) obj3)[0] = (String) obj;
                ((rk0) obj2).run();
                return;
            case 6:
                zo0 zo0Var = (zo0) obj3;
                zo0Var.f45197n = false;
                ((uo0) obj2).f43286f.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    zo0Var.u0();
                    zo0Var.finishFragment();
                    zo0Var.x0();
                    return;
                }
                return;
            case 7:
                iv0 iv0Var = (iv0) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                Long l10 = (Long) obj;
                iv0Var.getClass();
                Bundle bundle2 = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle2.putLong("user_id", l10.longValue());
                } else {
                    bundle2.putLong("chat_id", -l10.longValue());
                }
                o2Var.presentFragment(new ProfileActivity(bundle2, null));
                iv0Var.c(false);
                return;
            case 8:
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
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new kr0(profileActivity, userFull, tL_birthday2, 3), 1024);
                return;
            case 9:
                j01 j01Var = (j01) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = b61.k(str5, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder t10 = aa.d.t("couldn't find ", str5, " sticker in EmojiAnimations");
                    String[] strArr = m01.f40276s;
                    FileLog.e(t10.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver();
                j01Var.f39331c = imageReceiver;
                j01Var.f39332e.add(imageReceiver);
                int f12 = py.f();
                j01Var.f39331c.setAutoRepeat(0);
                l01 l01Var = j01Var.f39331c;
                String str6 = f12 + "_" + f12 + "_precache";
                ky0 ky0Var = new ky0(j01Var, 5);
                l01Var.getClass();
                l01Var.setDelegate(new k01(new Runnable[]{ky0Var}));
                l01Var.setImage(ImageLocation.getForDocument(k10), str6, null, null, tL_messages_stickerSet2, 0);
                j01Var.f39331c.onAttachedToWindow();
                j01Var.f39334g[1] = true;
                j01Var.a();
                return;
            case 10:
                Runnable runnable = (Runnable) obj;
                ((bg.k) obj3).run((HashSet) obj2);
                return;
            case 11:
                d41 d41Var = (d41) obj3;
                View view = (View) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view != null) {
                    d41Var.getClass();
                    view.setVisibility(0);
                }
                d41Var.f37408f = bitmap;
                Paint paint = new Paint(1);
                d41Var.f37409n = paint;
                Bitmap bitmap2 = d41Var.f37408f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                d41Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    f10 = 0.05f;
                } else {
                    f10 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f10);
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    f11 = -0.02f;
                } else {
                    f11 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f11);
                d41Var.f37409n.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                d41Var.f37410r = new Matrix();
                return;
            case 12:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.J0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    org.telegram.ui.Components.wk0 wk0Var = themeActivity.f36227b;
                    if (wk0Var != null && wk0Var.C && (K = wk0Var.K(themeActivity.I)) != null) {
                        themeActivity.f36225a.v(K, themeActivity.I);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                n21 n21Var = (n21) obj2;
                if (((Boolean) obj).booleanValue()) {
                    n21Var.run();
                    return;
                } else {
                    org.telegram.ui.Components.oc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
            case 14:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj3;
                String str7 = (String) obj2;
                Boolean bool2 = (Boolean) obj;
                y0Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (bool2.booleanValue()) {
                        if (TextUtils.isEmpty(str7)) {
                            str = "removed";
                        } else {
                            str = "updated";
                        }
                    } else {
                        str = "failed";
                    }
                    jSONObject.put("status", str);
                    y0Var.v("biometry_token_updated", jSONObject);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 15:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) obj3;
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj;
                u1Var.getClass();
                ((org.telegram.ui.web.c1[]) obj2)[0].finishFragment();
                Utilities.Callback callback = u1Var.f44030e;
                if (callback != null) {
                    u1Var.finishFragment();
                    callback.run(z0Var);
                    return;
                }
                ve.e.s(u1Var.getParentActivity(), z0Var.f44114c);
                return;
            case 16:
                org.telegram.ui.web.d2 d2Var = (org.telegram.ui.web.d2) obj3;
                d2Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ue0(d2Var, (org.telegram.ui.web.c2) obj2, (Bitmap) obj, 26));
                return;
            case 17:
                View view2 = (View) obj3;
                pf.o oVar = (pf.o) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (view2 != null) {
                    view2.requestFocus();
                }
                AndroidUtilities.hideKeyboard(oVar);
                AndroidUtilities.runOnUIThread(runnable2, 80L);
                return;
            case 18:
                pf.q1 q1Var = (pf.q1) obj2;
                Long l11 = (Long) obj;
                pf.r1 f13 = pf.r1.f(UserConfig.selectedAccount);
                org.telegram.ui.Components.ki kiVar = ((pf.e0) obj3).f27493b;
                long n12 = kiVar.n1();
                int i14 = f13.f45765a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                TLRPC.InputPeer inputPeer = MessagesController.getInstance(i14).getInputPeer(n12);
                tL_messages_sendQuickReplyMessages.peer = inputPeer;
                if (inputPeer != null) {
                    tL_messages_sendQuickReplyMessages.shortcut_id = q1Var.f45756a;
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                    messagesStorage.getStorageQueue().postRunnable(new ir0(f13, messagesStorage, q1Var, tL_messages_sendQuickReplyMessages, 22));
                }
                kiVar.dismiss();
                return;
            case 19:
                pf.y0.V((pf.y0) obj3, (View) obj2, (String) obj);
                return;
            case 20:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str8 = (String) obj;
                qh.o3 o3Var = ((qh.p) obj3).f46606r;
                if (pageblockmath != null) {
                    pageblockmath.source = str8;
                    o3Var.U2.N(false);
                    return;
                }
                TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                pageblockmath2.source = str8;
                o3Var.R1(pageblockmath2);
                return;
            case 21:
                qh.d1 d1Var = (qh.d1) obj3;
                qh.r rVar = (qh.r) obj2;
                String str9 = (String) obj;
                d1Var.getClass();
                if (!TextUtils.isEmpty(str9)) {
                    Editable text = d1Var.getText();
                    int spanStart = text.getSpanStart(rVar);
                    int spanEnd = text.getSpanEnd(rVar);
                    if (spanStart >= 0 && spanEnd >= 0 && (a2 = qh.r.a(str9, d1Var.getCurrentTextColor(), AndroidUtilities.dp(SharedConfig.fontSize + 4))) != null) {
                        boolean z10 = d1Var.v;
                        if (z10) {
                            d1Var.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        int max = Math.max(0, Math.min(spanStart, d1Var.length()));
                        text.replace(max, Math.max(max, Math.min(spanEnd, d1Var.length())), spannableString);
                        d1Var.setSelection(Math.min(max + 1, d1Var.length()));
                        if (z10) {
                            d1Var.setLocked(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 22:
                qh.x1 x1Var = (qh.x1) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str10 = (String) obj;
                x1Var.getClass();
                if (pageblockmath3 != null) {
                    pageblockmath3.source = str10;
                    x1Var.L.U2.N(false);
                    return;
                }
                TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                pageblockmath4.source = str10;
                x1Var.L.R1(pageblockmath4);
                return;
            default:
                qh.o3 o3Var2 = (qh.o3) obj3;
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                String str11 = (String) obj;
                o3Var2.getClass();
                if (!TextUtils.equals(str11, pageblockmath5.source)) {
                    qh.b2 b2Var = o3Var2.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    pageblockmath5.source = str11;
                    o3Var2.U2.N(false);
                    qh.b2 b2Var2 = o3Var2.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    o3Var2.f46565d3.onContentChanged();
                    return;
                }
                return;
        }
    }
}
