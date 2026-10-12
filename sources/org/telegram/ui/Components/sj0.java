package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
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
import org.telegram.messenger.ChatObject;
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
public final class sj0 implements Runnable {
    public final int f30579a;
    public final Object f30580b;
    public final Object f30581c;

    public sj0(int i10, Object obj, Object obj2) {
        this.f30579a = i10;
        this.f30580b = obj;
        this.f30581c = obj2;
    }

    @Override
    public final void run() {
        int indexOf;
        int L;
        int i10;
        long j3;
        int i11;
        String str;
        int i12 = 2;
        ArrayList arrayList = null;
        switch (this.f30579a) {
            case 0:
                ViewParent viewParent = (ViewParent) this.f30581c;
                ((org.telegram.ui.Cells.u1) this.f30580b).invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                    return;
                }
                return;
            case 1:
                RLottieNative rLottieNative = (RLottieNative) this.f30580b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f30581c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 2:
                nk0 nk0Var = (nk0) this.f30580b;
                ArrayList arrayList2 = (ArrayList) this.f30581c;
                ArrayList arrayList3 = nk0Var.f28815r;
                nk0Var.f28814n.addAll(arrayList2);
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList2.get(i13);
                    i13++;
                    mk0 mk0Var = (mk0) obj;
                    int i14 = 0;
                    while (true) {
                        if (i14 < arrayList3.size()) {
                            if (MessageObject.getObjectPeerId(((mk0) arrayList3.get(i14)).f28597a) == MessageObject.getObjectPeerId(mk0Var.f28597a)) {
                                if (mk0Var.f28599c > 0) {
                                    ((mk0) arrayList3.get(i14)).f28599c = mk0Var.f28599c;
                                }
                            } else {
                                i14++;
                            }
                        } else {
                            arrayList3.add(mk0Var);
                        }
                    }
                }
                q0.a aVar = nk0Var.f28817w;
                if (aVar != null) {
                    aVar.accept(arrayList2);
                }
                nk0Var.a();
                return;
            case 3:
                cp0 cp0Var = (cp0) this.f30580b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f30581c;
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
            case 4:
                ((cp0) this.f30580b).T();
                zc.a0((org.telegram.ui.vy) this.f30581c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 5:
                ((np0) this.f30580b).sendAccessibilityEvent((View) this.f30581c, 4);
                return;
            case 6:
                kf kfVar = (kf) this.f30580b;
                org.telegram.ui.eo eoVar = (org.telegram.ui.eo) this.f30581c;
                if (eoVar != null) {
                    eoVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    kfVar.dismiss();
                    return;
                }
                return;
            case 7:
                ((WindowManager) this.f30581c).removeView(((kf) this.f30580b).B);
                return;
            case 8:
                sr0 sr0Var = (sr0) this.f30580b;
                TLObject tLObject = (TLObject) this.f30581c;
                if (tLObject != null) {
                    sr0Var.f30644k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    sr0Var.a1();
                    if (sr0Var.m0) {
                        sr0Var.N0();
                    }
                }
                sr0Var.f30645l0 = false;
                return;
            case 9:
                av0 av0Var = (av0) this.f30580b;
                zr0 zr0Var = (zr0) this.f30581c;
                av0Var.G = null;
                av0Var.H = null;
                zr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new zd0(zr0Var, 14)).start();
                return;
            case 10:
                ai.f9 f9Var = (ai.f9) this.f30581c;
                ct0 ct0Var = ((hw0) this.f30580b).W;
                if (ct0Var != null) {
                    int i15 = f9Var.f1031a;
                    ct0Var.f36306n.d(i15, ct0Var.f36308s.i(i15));
                    return;
                }
                return;
            case 11:
                zc.a0(((qu0) this.f30580b).f29936f.f26972v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f30581c).title)).k(true);
                return;
            case 12:
                dv0 dv0Var = (dv0) this.f30580b;
                String str2 = (String) this.f30581c;
                if (!dv0Var.v.f26968t1[dv0Var.f25471r].f32553a.isEmpty() && ((i10 = dv0Var.f25471r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.c.h(1, dv0Var.v.f26968t1[i10].f32553a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    hw0 hw0Var = dv0Var.v;
                    if (hw0Var.f26947j1 == hw0Var.f26972v1.getUserConfig().getClientUserId()) {
                        j3 = messageObject.getSavedDialogId();
                    } else {
                        j3 = 0;
                    }
                    dv0Var.F(id2, str2, dialogId, j3);
                } else if (dv0Var.f25471r == 3) {
                    hw0 hw0Var2 = dv0Var.v;
                    dv0Var.F(0, str2, hw0Var2.f26947j1, hw0Var2.F);
                }
                int i16 = dv0Var.f25471r;
                if (i16 == 1 || i16 == 4) {
                    ArrayList arrayList5 = new ArrayList(dv0Var.v.f26968t1[dv0Var.f25471r].f32553a);
                    dv0Var.f25472s++;
                    Utilities.searchQueue.postRunnable(new mh0(dv0Var, str2, arrayList5, 9));
                    return;
                }
                return;
            case 13:
                dv0 dv0Var2 = (dv0) this.f30580b;
                ArrayList arrayList6 = (ArrayList) this.f30581c;
                hw0 hw0Var3 = dv0Var2.v;
                boolean z10 = hw0Var3.V0;
                av0[] av0VarArr = hw0Var3.f26948k0;
                if (z10) {
                    dv0Var2.f25472s--;
                    int h = dv0Var2.h();
                    dv0Var2.d = arrayList6;
                    int h10 = dv0Var2.h();
                    if (dv0Var2.f25472s == 0 || h10 != 0) {
                        hw0Var3.m1(false);
                    }
                    for (int i17 = 0; i17 < av0VarArr.length; i17++) {
                        av0 av0Var2 = av0VarArr[i17];
                        if (av0Var2.F == dv0Var2.f25471r) {
                            if (dv0Var2.f25472s == 0 && h10 == 0) {
                                av0Var2.f24502w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                av0VarArr[i17].f24502w.f26558f.setVisibility(8);
                                av0VarArr[i17].f24502w.e(false, true);
                            } else if (h == 0) {
                                hw0Var3.z(av0Var2.h, 0, null);
                            }
                        }
                    }
                    dv0Var2.l();
                    return;
                }
                return;
            case 14:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i18 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i18, bool, (TLObject) this.f30580b, (TLRPC.Document) this.f30581c, null, bool);
                return;
            case 15:
                MessagesController.getInstance(((pz0) this.f30580b).f29627a.f31293a).updateEmojiStatus((TLRPC.EmojiStatus) this.f30581c);
                return;
            case 16:
                h41 h41Var = (h41) this.f30580b;
                MessagesController.getInstance(h41Var.f26636b).getTopicsController().deleteTopics(-h41Var.f26638c, (ArrayList) this.f30581c);
                int i19 = h41.f26633f0;
                return;
            case 17:
                h41 h41Var2 = (h41) this.f30580b;
                h41Var2.getClass();
                MessagesController.getInstance(h41Var2.f26636b).loadFullChat(((TLRPC.Updates) this.f30581c).chats.get(0).f19802id, 0, true);
                return;
            case 18:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f30580b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f30581c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    l1Var.e0(i12);
                    return;
                }
                return;
            case 19:
                g51.q((g51) this.f30580b, (TLObject) this.f30581c);
                return;
            case 20:
                org.telegram.ui.el elVar = (org.telegram.ui.el) this.f30580b;
                ((org.telegram.ui.ActionBar.m1) this.f30581c).d(true);
                x51.a(elVar.getContext(), elVar.d);
                return;
            case 21:
                ((TranslateController) this.f30581c).setHideTranslateDialog(((org.telegram.ui.el) this.f30580b).f32658b, false);
                return;
            case 22:
                UndoView undoView = (UndoView) this.f30580b;
                TLObject tLObject2 = (TLObject) this.f30581c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.f24159s.presentFragment(new org.telegram.ui.xo0((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                int i20 = UndoView.f24147e0;
                undoView.getClass();
                return;
            case 23:
                ((u61) this.f30580b).D.onClick((org.telegram.ui.Cells.v8) this.f30581c);
                return;
            case 24:
                q81 q81Var = (q81) this.f30580b;
                b2.u0 u0Var = (b2.u0) this.f30581c;
                Throwable cause = u0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = q81.f29777l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList7 = q81Var.N;
                    if (arrayList7 != null) {
                        int i21 = 0;
                        while (i21 < arrayList7.size()) {
                            m81 m81Var = (m81) arrayList7.get(i21);
                            int i22 = 0;
                            while (true) {
                                ArrayList arrayList8 = m81Var.d;
                                if (i22 < arrayList8.size()) {
                                    o81 o81Var = (o81) arrayList8.get(i22);
                                    if (!TextUtils.isEmpty(o81Var.f29097m) && !q81.Y(o81Var.f29097m)) {
                                        arrayList8.remove(i22);
                                        i22--;
                                    }
                                    i22++;
                                } else {
                                    if (arrayList8.isEmpty()) {
                                        arrayList7.remove(i21);
                                        i21--;
                                    }
                                    i21++;
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
                TextureView textureView = q81Var.f29792n;
                if (textureView != null && ((!q81Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                    q81Var.E = true;
                    if (q81Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(q81Var.f29792n);
                            viewGroup.removeView(q81Var.f29792n);
                            viewGroup.addView(q81Var.f29792n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = q81Var.f29780b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new d81(q81Var, 1));
                            return;
                        }
                        i2.f0 f0Var = q81Var.d;
                        TextureView textureView2 = q81Var.f29792n;
                        f0Var.D1();
                        if (textureView2 != null && textureView2 == f0Var.V) {
                            f0Var.D1();
                            f0Var.q1();
                            f0Var.v1(null);
                            f0Var.o1(0, 0);
                        }
                        q81Var.d.x1(q81Var.f29792n);
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
            case 25:
                ((p81) this.f30580b).f29446f.K.onVisualizerUpdate(true, true, (float[]) this.f30581c);
                return;
            case 26:
                y81 y81Var = (y81) this.f30580b;
                Bitmap bitmap = (Bitmap) this.f30581c;
                if (bitmap != null) {
                    if (y81Var.f32998w != null) {
                        Bitmap bitmap2 = y81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        y81Var.v = y81Var.f32998w;
                    }
                    y81Var.f32998w = bitmap;
                    Bitmap bitmap3 = y81Var.f32998w;
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
                y81Var.f32992f = null;
                return;
            case 27:
                final la1 la1Var = (la1) this.f30580b;
                la1Var.f28149e.f28505b.evaluateJavascript((String) this.f30581c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj2) {
                        String str3 = (String) obj2;
                        la1 la1Var2 = la1.this;
                        String[] strArr = la1Var2.f28148c;
                        String str4 = strArr[0];
                        String str5 = la1Var2.d;
                        strArr[0] = str4.replace(str5, "/signature/" + str3.substring(1, str3.length() - 1));
                        la1Var2.f28147b.countDown();
                    }
                });
                return;
            case 28:
                ((org.telegram.ui.Components.voip.k) this.f30580b).f31750a.setOnClickListener((View.OnClickListener) this.f30581c);
                return;
            default:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.f30580b;
                Bitmap bitmap4 = (Bitmap) this.f30581c;
                HashMap<String, Bitmap> hashMap2 = uVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = uVar.f32024w;
                boolean z11 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                if (z11) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap2.put(str, bitmap4);
                return;
        }
    }

    public sj0(Object obj, Object obj2, Object obj3, int i10) {
        this.f30579a = i10;
        this.f30580b = obj;
        this.f30581c = obj2;
    }
}
