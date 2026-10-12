package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
public final class gi0 implements Runnable {
    public final int f26438a;
    public final Object f26439b;
    public final Object f26440c;

    public gi0(int i10, Object obj, Object obj2) {
        this.f26438a = i10;
        this.f26439b = obj;
        this.f26440c = obj2;
    }

    @Override
    public final void run() {
        int indexOf;
        int L;
        int i10;
        long j3;
        int i11;
        int i12 = 2;
        ArrayList arrayList = null;
        switch (this.f26438a) {
            case 0:
                ii0 ii0Var = (ii0) this.f26440c;
                ki0 ki0Var = ((li0) this.f26439b).F;
                int i13 = ii0Var.f27150a;
                RectF rectF = ii0Var.d;
                ProfileActivity.Y(((org.telegram.ui.ly0) ki0Var).f39871b, i13, rectF.left, rectF.top);
                return;
            case 1:
                ViewParent viewParent = (ViewParent) this.f26440c;
                ((org.telegram.ui.Cells.u1) this.f26439b).invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                    return;
                }
                return;
            case 2:
                RLottieNative rLottieNative = (RLottieNative) this.f26439b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f26440c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 3:
                nk0 nk0Var = (nk0) this.f26439b;
                ArrayList arrayList2 = (ArrayList) this.f26440c;
                ArrayList arrayList3 = nk0Var.f28819r;
                nk0Var.f28818n.addAll(arrayList2);
                int size = arrayList2.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList2.get(i14);
                    i14++;
                    mk0 mk0Var = (mk0) obj;
                    int i15 = 0;
                    while (true) {
                        if (i15 < arrayList3.size()) {
                            if (MessageObject.getObjectPeerId(((mk0) arrayList3.get(i15)).f28587a) == MessageObject.getObjectPeerId(mk0Var.f28587a)) {
                                if (mk0Var.f28589c > 0) {
                                    ((mk0) arrayList3.get(i15)).f28589c = mk0Var.f28589c;
                                }
                            } else {
                                i15++;
                            }
                        } else {
                            arrayList3.add(mk0Var);
                        }
                    }
                }
                q0.a aVar = nk0Var.f28821w;
                if (aVar != null) {
                    aVar.accept(arrayList2);
                }
                nk0Var.a();
                return;
            case 4:
                cp0 cp0Var = (cp0) this.f26439b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f26440c;
                ArrayList arrayList4 = cp0Var.K;
                if (!arrayList4.isEmpty() && (indexOf = arrayList4.indexOf(tL_sponsoredPeer)) >= 0 && (L = cp0Var.L()) < cp0Var.h()) {
                    arrayList4.remove(indexOf);
                    cp0Var.u(L + 1 + indexOf);
                    int size2 = cp0Var.f10625j0.f10533e.size();
                    int size3 = arrayList4.size();
                    if (cp0Var.G0) {
                        size2 = Math.min(3, size2);
                    }
                    if (size3 + size2 <= 0) {
                        cp0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((cp0) this.f26439b).T();
                zc.a0((org.telegram.ui.vy) this.f26440c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 6:
                ((np0) this.f26439b).sendAccessibilityEvent((View) this.f26440c, 4);
                return;
            case 7:
                kf kfVar = (kf) this.f26439b;
                org.telegram.ui.eo eoVar = (org.telegram.ui.eo) this.f26440c;
                if (eoVar != null) {
                    eoVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    kfVar.dismiss();
                    return;
                }
                return;
            case 8:
                ((WindowManager) this.f26440c).removeView(((kf) this.f26439b).B);
                return;
            case 9:
                sr0 sr0Var = (sr0) this.f26439b;
                TLObject tLObject = (TLObject) this.f26440c;
                if (tLObject != null) {
                    sr0Var.f30646k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    sr0Var.a1();
                    if (sr0Var.m0) {
                        sr0Var.N0();
                    }
                }
                sr0Var.f30647l0 = false;
                return;
            case 10:
                av0 av0Var = (av0) this.f26439b;
                zr0 zr0Var = (zr0) this.f26440c;
                av0Var.G = null;
                av0Var.H = null;
                zr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new zd0(zr0Var, 14)).start();
                return;
            case 11:
                ai.f9 f9Var = (ai.f9) this.f26440c;
                ct0 ct0Var = ((hw0) this.f26439b).W;
                if (ct0Var != null) {
                    int i16 = f9Var.f1031a;
                    ct0Var.f36308n.d(i16, ct0Var.f36310s.i(i16));
                    return;
                }
                return;
            case 12:
                zc.a0(((qu0) this.f26439b).f29937f.f26957v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f26440c).title)).k(true);
                return;
            case 13:
                dv0 dv0Var = (dv0) this.f26439b;
                String str = (String) this.f26440c;
                if (!dv0Var.v.f26953t1[dv0Var.f25476r].f32552a.isEmpty() && ((i10 = dv0Var.f25476r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.c.h(1, dv0Var.v.f26953t1[i10].f32552a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    hw0 hw0Var = dv0Var.v;
                    if (hw0Var.f26932j1 == hw0Var.f26957v1.getUserConfig().getClientUserId()) {
                        j3 = messageObject.getSavedDialogId();
                    } else {
                        j3 = 0;
                    }
                    dv0Var.F(id2, str, dialogId, j3);
                } else if (dv0Var.f25476r == 3) {
                    hw0 hw0Var2 = dv0Var.v;
                    dv0Var.F(0, str, hw0Var2.f26932j1, hw0Var2.F);
                }
                int i17 = dv0Var.f25476r;
                if (i17 == 1 || i17 == 4) {
                    ArrayList arrayList5 = new ArrayList(dv0Var.v.f26953t1[dv0Var.f25476r].f32552a);
                    dv0Var.f25477s++;
                    Utilities.searchQueue.postRunnable(new mh0(dv0Var, str, arrayList5, 9));
                    return;
                }
                return;
            case 14:
                dv0 dv0Var2 = (dv0) this.f26439b;
                ArrayList arrayList6 = (ArrayList) this.f26440c;
                hw0 hw0Var3 = dv0Var2.v;
                boolean z10 = hw0Var3.V0;
                av0[] av0VarArr = hw0Var3.f26933k0;
                if (z10) {
                    dv0Var2.f25477s--;
                    int h = dv0Var2.h();
                    dv0Var2.d = arrayList6;
                    int h10 = dv0Var2.h();
                    if (dv0Var2.f25477s == 0 || h10 != 0) {
                        hw0Var3.m1(false);
                    }
                    for (int i18 = 0; i18 < av0VarArr.length; i18++) {
                        av0 av0Var2 = av0VarArr[i18];
                        if (av0Var2.F == dv0Var2.f25476r) {
                            if (dv0Var2.f25477s == 0 && h10 == 0) {
                                av0Var2.f24490w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                av0VarArr[i18].f24490w.f26562f.setVisibility(8);
                                av0VarArr[i18].f24490w.e(false, true);
                            } else if (h == 0) {
                                hw0Var3.z(av0Var2.h, 0, null);
                            }
                        }
                    }
                    dv0Var2.l();
                    return;
                }
                return;
            case 15:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i19 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i19, bool, (TLObject) this.f26439b, (TLRPC.Document) this.f26440c, null, bool);
                return;
            case 16:
                MessagesController.getInstance(((pz0) this.f26439b).f29605a.f31293a).updateEmojiStatus((TLRPC.EmojiStatus) this.f26440c);
                return;
            case 17:
                h41 h41Var = (h41) this.f26439b;
                MessagesController.getInstance(h41Var.f26640b).getTopicsController().deleteTopics(-h41Var.f26642c, (ArrayList) this.f26440c);
                int i20 = h41.f26637f0;
                return;
            case 18:
                h41 h41Var2 = (h41) this.f26439b;
                h41Var2.getClass();
                MessagesController.getInstance(h41Var2.f26640b).loadFullChat(((TLRPC.Updates) this.f26440c).chats.get(0).f19803id, 0, true);
                return;
            case 19:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f26439b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f26440c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    l1Var.e0(i12);
                    return;
                }
                return;
            case 20:
                g51.q((g51) this.f26439b, (TLObject) this.f26440c);
                return;
            case 21:
                org.telegram.ui.el elVar = (org.telegram.ui.el) this.f26439b;
                ((org.telegram.ui.ActionBar.m1) this.f26440c).d(true);
                x51.a(elVar.getContext(), elVar.d);
                return;
            case 22:
                ((TranslateController) this.f26440c).setHideTranslateDialog(((org.telegram.ui.el) this.f26439b).f32657b, false);
                return;
            case 23:
                UndoView undoView = (UndoView) this.f26439b;
                TLObject tLObject2 = (TLObject) this.f26440c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.f24160s.presentFragment(new org.telegram.ui.xo0((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                int i21 = UndoView.f24148e0;
                undoView.getClass();
                return;
            case 24:
                ((u61) this.f26439b).D.onClick((org.telegram.ui.Cells.v8) this.f26440c);
                return;
            case 25:
                q81 q81Var = (q81) this.f26439b;
                b2.u0 u0Var = (b2.u0) this.f26440c;
                Throwable cause = u0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = q81.f29755l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList7 = q81Var.N;
                    if (arrayList7 != null) {
                        int i22 = 0;
                        while (i22 < arrayList7.size()) {
                            m81 m81Var = (m81) arrayList7.get(i22);
                            int i23 = 0;
                            while (true) {
                                ArrayList arrayList8 = m81Var.d;
                                if (i23 < arrayList8.size()) {
                                    o81 o81Var = (o81) arrayList8.get(i23);
                                    if (!TextUtils.isEmpty(o81Var.f29101m) && !q81.Y(o81Var.f29101m)) {
                                        arrayList8.remove(i23);
                                        i23--;
                                    }
                                    i23++;
                                } else {
                                    if (arrayList8.isEmpty()) {
                                        arrayList7.remove(i22);
                                        i22--;
                                    }
                                    i22++;
                                }
                            }
                        }
                        arrayList = arrayList7;
                    }
                    q81Var.N = arrayList;
                    if (arrayList != null) {
                        q81Var.F(arrayList, q81Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = q81Var.f29770n;
                if (textureView != null && ((!q81Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    q81Var.E = true;
                    if (q81Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(q81Var.f29770n);
                            viewGroup.removeView(q81Var.f29770n);
                            viewGroup.addView(q81Var.f29770n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = q81Var.f29758b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new d81(q81Var, 1));
                            return;
                        }
                        i2.f0 f0Var = q81Var.d;
                        TextureView textureView2 = q81Var.f29770n;
                        f0Var.D1();
                        if (textureView2 != null && textureView2 == f0Var.V) {
                            f0Var.D1();
                            f0Var.q1();
                            f0Var.v1(null);
                            f0Var.o1(0, 0);
                        }
                        q81Var.d.x1(q81Var.f29770n);
                        ArrayList arrayList9 = q81Var.N;
                        if (arrayList9 != null) {
                            q81Var.F(arrayList9, q81Var.O);
                        } else if (q81Var.U) {
                            q81Var.G(q81Var.Q, q81Var.S, q81Var.R, q81Var.T);
                        } else {
                            q81Var.D(q81Var.Q, q81Var.S);
                        }
                        q81Var.C();
                        return;
                    }
                    return;
                }
                q81Var.J.onError(q81Var, u0Var);
                return;
            case 26:
                ((p81) this.f26439b).f29449f.K.onVisualizerUpdate(true, true, (float[]) this.f26440c);
                return;
            case 27:
                y81 y81Var = (y81) this.f26439b;
                Bitmap bitmap = (Bitmap) this.f26440c;
                if (bitmap != null) {
                    if (y81Var.f32991w != null) {
                        Bitmap bitmap2 = y81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        y81Var.v = y81Var.f32991w;
                    }
                    y81Var.f32991w = bitmap;
                    Bitmap bitmap3 = y81Var.f32991w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    y81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(y81Var.L);
                    y81Var.J.setShader(y81Var.G);
                    y81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = y81Var.getLayoutParams();
                    if (y81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        y81Var.setVisibility(0);
                        y81Var.requestLayout();
                    }
                }
                y81Var.f32985f = null;
                return;
            case 28:
                final la1 la1Var = (la1) this.f26439b;
                la1Var.f28134e.f28500b.evaluateJavascript((String) this.f26440c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj2) {
                        String str2 = (String) obj2;
                        la1 la1Var2 = la1.this;
                        String[] strArr = la1Var2.f28133c;
                        String str3 = strArr[0];
                        String str4 = la1Var2.d;
                        strArr[0] = str3.replace(str4, "/signature/" + str2.substring(1, str2.length() - 1));
                        la1Var2.f28132b.countDown();
                    }
                });
                return;
            default:
                ((org.telegram.ui.Components.voip.k) this.f26439b).f31735a.setOnClickListener((View.OnClickListener) this.f26440c);
                return;
        }
    }

    public gi0(Object obj, Object obj2, Object obj3, int i10) {
        this.f26438a = i10;
        this.f26439b = obj;
        this.f26440c = obj2;
    }
}
