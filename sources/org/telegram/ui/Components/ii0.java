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
public final class ii0 implements Runnable {
    public final int f29394a;
    public final Object f29395b;
    public final Object f29396c;

    public ii0(int i10, Object obj, Object obj2) {
        this.f29394a = i10;
        this.f29395b = obj;
        this.f29396c = obj2;
    }

    @Override
    public final void run() {
        int indexOf;
        int L;
        int i10;
        long j10;
        int i11;
        int i12 = 2;
        ArrayList arrayList = null;
        switch (this.f29394a) {
            case 0:
                ViewParent viewParent = (ViewParent) this.f29396c;
                ((org.telegram.ui.Cells.s1) this.f29395b).invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                    return;
                }
                return;
            case 1:
                RLottieNative rLottieNative = (RLottieNative) this.f29395b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f29396c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 2:
                fj0 fj0Var = (fj0) this.f29395b;
                ArrayList arrayList2 = (ArrayList) this.f29396c;
                ArrayList arrayList3 = fj0Var.f28417r;
                fj0Var.f28416n.addAll(arrayList2);
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList2.get(i13);
                    i13++;
                    ej0 ej0Var = (ej0) obj;
                    int i14 = 0;
                    while (true) {
                        if (i14 < arrayList3.size()) {
                            if (MessageObject.getObjectPeerId(((ej0) arrayList3.get(i14)).f28093a) == MessageObject.getObjectPeerId(ej0Var.f28093a)) {
                                if (ej0Var.f28095c > 0) {
                                    ((ej0) arrayList3.get(i14)).f28095c = ej0Var.f28095c;
                                }
                            } else {
                                i14++;
                            }
                        } else {
                            arrayList3.add(ej0Var);
                        }
                    }
                }
                q0.a aVar = fj0Var.f28419w;
                if (aVar != null) {
                    aVar.accept(arrayList2);
                }
                fj0Var.a();
                return;
            case 3:
                mn0 mn0Var = (mn0) this.f29395b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f29396c;
                ArrayList arrayList4 = mn0Var.G;
                if (!arrayList4.isEmpty() && (indexOf = arrayList4.indexOf(tL_sponsoredPeer)) >= 0 && (L = mn0Var.L()) < mn0Var.h()) {
                    arrayList4.remove(indexOf);
                    mn0Var.u(L + 1 + indexOf);
                    int size2 = mn0Var.f47146f0.f47280e.size();
                    int size3 = arrayList4.size();
                    if (mn0Var.C0) {
                        size2 = Math.min(3, size2);
                    }
                    if (size3 + size2 <= 0) {
                        mn0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((mn0) this.f29395b).T();
                tc.a0((org.telegram.ui.fy) this.f29396c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 5:
                ((xn0) this.f29395b).sendAccessibilityEvent((View) this.f29396c, 4);
                return;
            case 6:
                ye yeVar = (ye) this.f29395b;
                org.telegram.ui.tn tnVar = (org.telegram.ui.tn) this.f29396c;
                if (tnVar != null) {
                    tnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    yeVar.dismiss();
                    return;
                }
                return;
            case 7:
                ((WindowManager) this.f29396c).removeView(((ye) this.f29395b).B);
                return;
            case 8:
                dq0 dq0Var = (dq0) this.f29395b;
                TLObject tLObject = (TLObject) this.f29396c;
                if (tLObject != null) {
                    dq0Var.f27837g0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    dq0Var.Z0();
                    if (dq0Var.f27839i0) {
                        dq0Var.M0();
                    }
                }
                dq0Var.f27838h0 = false;
                return;
            case 9:
                it0 it0Var = (it0) this.f29395b;
                kq0 kq0Var = (kq0) this.f29396c;
                it0Var.C = null;
                it0Var.D = null;
                kq0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new zz(kq0Var, 21)).start();
                return;
            case 10:
                lh.l6 l6Var = (lh.l6) this.f29396c;
                kr0 kr0Var = ((qu0) this.f29395b).S;
                if (kr0Var != null) {
                    int i15 = l6Var.f15893a;
                    kr0Var.f44686n.d(i15, kr0Var.f44688s.i(i15));
                    return;
                }
                return;
            case 11:
                tc.a0(((ys0) this.f29395b).f35129f.f32093r1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f29396c).title)).k(true);
                return;
            case 12:
                lt0 lt0Var = (lt0) this.f29395b;
                String str = (String) this.f29396c;
                if (!lt0Var.v.f32088p1[lt0Var.f30431r].f28534a.isEmpty() && ((i10 = lt0Var.f30431r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) j7.l1.i(1, lt0Var.v.f32088p1[i10].f28534a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    qu0 qu0Var = lt0Var.v;
                    if (qu0Var.f32069f1 == qu0Var.f32093r1.getUserConfig().getClientUserId()) {
                        j10 = messageObject.getSavedDialogId();
                    } else {
                        j10 = 0;
                    }
                    lt0Var.F(id2, str, dialogId, j10);
                } else if (lt0Var.f30431r == 3) {
                    qu0 qu0Var2 = lt0Var.v;
                    lt0Var.F(0, str, qu0Var2.f32069f1, qu0Var2.B);
                }
                int i16 = lt0Var.f30431r;
                if (i16 == 1 || i16 == 4) {
                    ArrayList arrayList5 = new ArrayList(lt0Var.v.f32088p1[lt0Var.f30431r].f28534a);
                    lt0Var.f30432s++;
                    Utilities.searchQueue.postRunnable(new g(lt0Var, str, arrayList5, 29));
                    return;
                }
                return;
            case 13:
                lt0 lt0Var2 = (lt0) this.f29395b;
                ArrayList arrayList6 = (ArrayList) this.f29396c;
                qu0 qu0Var3 = lt0Var2.v;
                boolean z10 = qu0Var3.R0;
                it0[] it0VarArr = qu0Var3.f32070g0;
                if (z10) {
                    lt0Var2.f30432s--;
                    int h = lt0Var2.h();
                    lt0Var2.d = arrayList6;
                    int h10 = lt0Var2.h();
                    if (lt0Var2.f30432s == 0 || h10 != 0) {
                        qu0Var3.m1(false);
                    }
                    for (int i17 = 0; i17 < it0VarArr.length; i17++) {
                        it0 it0Var2 = it0VarArr[i17];
                        if (it0Var2.B == lt0Var2.f30431r) {
                            if (lt0Var2.f30432s == 0 && h10 == 0) {
                                it0Var2.f29471w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                it0VarArr[i17].f29471w.f32123f.setVisibility(8);
                                it0VarArr[i17].f29471w.e(false, true);
                            } else if (h == 0) {
                                qu0Var3.z(it0Var2.h, 0, null);
                            }
                        }
                    }
                    lt0Var2.l();
                    return;
                }
                return;
            case 14:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i18 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i18, bool, (TLObject) this.f29395b, (TLRPC.Document) this.f29396c, null, bool);
                return;
            case 15:
                MessagesController.getInstance(((ay0) this.f29395b).f26912a.f28563a).updateEmojiStatus((TLRPC.EmojiStatus) this.f29396c);
                return;
            case 16:
                m21 m21Var = (m21) this.f29395b;
                MessagesController.getInstance(m21Var.f30552b).getTopicsController().deleteTopics(-m21Var.f30553c, (ArrayList) this.f29396c);
                int i19 = m21.f30549b0;
                return;
            case 17:
                m21 m21Var2 = (m21) this.f29395b;
                m21Var2.getClass();
                MessagesController.getInstance(m21Var2.f30552b).loadFullChat(((TLRPC.Updates) this.f29396c).chats.get(0).f22392id, 0, true);
                return;
            case 18:
                org.telegram.ui.Cells.j1 j1Var = (org.telegram.ui.Cells.j1) this.f29395b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f29396c;
                if (j1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i12 = 1;
                    }
                    j1Var.c0(i12);
                    return;
                }
                return;
            case 19:
                k31.o((k31) this.f29395b, (TLObject) this.f29396c);
                return;
            case 20:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f29395b;
                String str2 = (String) this.f29396c;
                if (callback2 != null) {
                    callback2.run(str2, Boolean.FALSE);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.qk qkVar = (org.telegram.ui.qk) this.f29395b;
                ((org.telegram.ui.ActionBar.o1) this.f29396c).d(true);
                a41.a(qkVar.getContext(), qkVar.d);
                return;
            case 22:
                ((TranslateController) this.f29396c).setHideTranslateDialog(((org.telegram.ui.qk) this.f29395b).f26659b, false);
                return;
            case 23:
                UndoView undoView = (UndoView) this.f29395b;
                TLObject tLObject2 = (TLObject) this.f29396c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.f26594s.presentFragment(new org.telegram.ui.bo0((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                int i20 = UndoView.f26586a0;
                undoView.getClass();
                return;
            case 24:
                ((w41) this.f29395b).D.onClick((org.telegram.ui.Cells.p8) this.f29396c);
                return;
            case 25:
                x61 x61Var = (x61) this.f29395b;
                j3.v1 v1Var = (j3.v1) this.f29396c;
                Throwable cause = v1Var.getCause();
                if ((cause instanceof a4.o) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(v1Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = x61.f34627h0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList7 = x61Var.J;
                    if (arrayList7 != null) {
                        int i21 = 0;
                        while (i21 < arrayList7.size()) {
                            t61 t61Var = (t61) arrayList7.get(i21);
                            int i22 = 0;
                            while (true) {
                                ArrayList arrayList8 = t61Var.d;
                                if (i22 < arrayList8.size()) {
                                    v61 v61Var = (v61) arrayList8.get(i22);
                                    if (!TextUtils.isEmpty(v61Var.f33482m) && !x61.Y(v61Var.f33482m)) {
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
                    x61Var.J = arrayList;
                    if (arrayList != null) {
                        x61Var.G(arrayList, x61Var.K);
                        return;
                    }
                    return;
                }
                TextureView textureView = x61Var.f34638n;
                if (textureView != null && ((!x61Var.A && (cause instanceof a4.s)) || (cause instanceof g5.m))) {
                    x61Var.A = true;
                    if (x61Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(x61Var.f34638n);
                            viewGroup.removeView(x61Var.f34638n);
                            viewGroup.addView(x61Var.f34638n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = x61Var.f34630b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new o61(x61Var, 0));
                            return;
                        }
                        j3.k0 k0Var = x61Var.d;
                        TextureView textureView2 = x61Var.f34638n;
                        k0Var.q0();
                        if (textureView2 != null && textureView2 == k0Var.V) {
                            k0Var.q0();
                            k0Var.b0();
                            k0Var.g0(null);
                            k0Var.a0(0, 0);
                        }
                        x61Var.d.j0(x61Var.f34638n);
                        ArrayList arrayList9 = x61Var.J;
                        if (arrayList9 != null) {
                            x61Var.G(arrayList9, x61Var.K);
                        } else if (x61Var.Q) {
                            x61Var.H(x61Var.M, x61Var.O, x61Var.N, x61Var.P);
                        } else {
                            x61Var.E(x61Var.M, x61Var.O);
                        }
                        x61Var.D();
                        return;
                    }
                    return;
                }
                x61Var.F.onError(x61Var, v1Var);
                return;
            case 26:
                ((w61) this.f29395b).f34340f.G.onVisualizerUpdate(true, true, (float[]) this.f29396c);
                return;
            case 27:
                d71 d71Var = (d71) this.f29395b;
                Bitmap bitmap = (Bitmap) this.f29396c;
                if (bitmap != null) {
                    if (d71Var.f27697w != null) {
                        Bitmap bitmap2 = d71Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        d71Var.v = d71Var.f27697w;
                    }
                    d71Var.f27697w = bitmap;
                    Bitmap bitmap3 = d71Var.f27697w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    d71Var.C = bitmapShader;
                    bitmapShader.setLocalMatrix(d71Var.H);
                    d71Var.F.setShader(d71Var.C);
                    d71Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = d71Var.getLayoutParams();
                    if (d71Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        d71Var.setVisibility(0);
                        d71Var.requestLayout();
                    }
                }
                d71Var.f27693f = null;
                return;
            case 28:
                final r81 r81Var = (r81) this.f29395b;
                r81Var.f32245e.f32571b.evaluateJavascript((String) this.f29396c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj2) {
                        String str3 = (String) obj2;
                        r81 r81Var2 = r81.this;
                        String[] strArr = r81Var2.f32244c;
                        String str4 = strArr[0];
                        String str5 = r81Var2.d;
                        strArr[0] = str4.replace(str5, "/signature/" + str3.substring(1, str3.length() - 1));
                        r81Var2.f32243b.countDown();
                    }
                });
                return;
            default:
                ((org.telegram.ui.Components.voip.k) this.f29395b).f33782a.setOnClickListener((View.OnClickListener) this.f29396c);
                return;
        }
    }

    public ii0(Object obj, Object obj2, Object obj3, int i10) {
        this.f29394a = i10;
        this.f29395b = obj;
        this.f29396c = obj2;
    }
}
