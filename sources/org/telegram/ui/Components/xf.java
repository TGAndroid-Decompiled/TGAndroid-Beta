package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.SparseArray;
import android.widget.EditText;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class xf implements Runnable {
    public final int f40372a;
    public final Object f40373b;

    public xf(Object obj, int i7) {
        this.f40372a = i7;
        this.f40373b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i7 = this.f40372a;
        Object obj = this.f40373b;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((ag) obj).f31793b0;
                if (!MediaController.B().K()) {
                    org.telegram.messenger.qp.e1().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f31132s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.B().D0(chatActivityEnterView.O);
                chatActivityEnterView.Z2.R0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f31082k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                hc hcVar = (hc) obj;
                new ug.w0(42, hcVar.W(), hcVar.f34273c).show();
                return;
            case 2:
                u4 u4Var = (u4) obj;
                u4Var.requestFocus();
                org.telegram.messenger.g0.K3(u4Var);
                return;
            case 3:
                org.telegram.messenger.g0.K3((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = i5.f34554r;
                ((i5) obj).u();
                return;
            case 5:
                e5 e5Var = (e5) obj;
                ArrayList arrayList = new ArrayList(e5Var.f33294c);
                e5Var.f33294c.clear();
                org.telegram.messenger.yr.a0(e5Var.f33295e).f26719a.c(new b5(e5Var, arrayList, 0));
                e5Var.d = null;
                return;
            case 6:
                ((g5) obj).invalidate();
                return;
            case 7:
                ((r1.g) obj).h();
                return;
            case 8:
                j6 j6Var = (j6) obj;
                CharSequence charSequence = j6Var.f34936f;
                if (charSequence != null) {
                    j6Var.c(charSequence, j6Var.h, true);
                    j6Var.f34936f = null;
                    j6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((a8) obj).f31750n.f32142o1.setVisibility(8);
                return;
            case 10:
                ((f8) ((org.telegram.messenger.re) obj).d).i1();
                return;
            case 11:
                w9 w9Var = (w9) obj;
                w9Var.f40007o = true;
                w9Var.d.invalidate();
                return;
            case 12:
                v9 v9Var = (v9) obj;
                if (!v9Var.f39014a) {
                    w9 w9Var2 = v9Var.d;
                    Bitmap[] bitmapArr = w9Var2.f40000g;
                    Canvas[] canvasArr = w9Var2.h;
                    w9Var2.f40000g = w9Var2.f39999f;
                    w9Var2.h = w9Var2.f40001i;
                    w9Var2.f39999f = bitmapArr;
                    w9Var2.f40001i = canvasArr;
                    w9Var2.f40003k = false;
                    fi.p5 p5Var = w9Var2.d;
                    if (p5Var != null) {
                        p5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                y9 y9Var = ((da) obj).f32913t;
                if (y9Var != null) {
                    y9Var.d();
                    return;
                }
                return;
            case 14:
                y9 y9Var2 = (y9) obj;
                y9Var2.f40683o = (Bitmap) y9Var2.f40682n.f14059c;
                y9Var2.d();
                return;
            case 15:
                cc ccVar = ((va) obj).f39018b;
                gb gbVar = ccVar.f32623e;
                gbVar.transitionRunningEnter = false;
                gbVar.onEnterTransitionEnd();
                if (ccVar.f32638u) {
                    ccVar.i(true);
                    return;
                }
                return;
            case 16:
                sc scVar = (sc) obj;
                scVar.getClass();
                if (org.telegram.messenger.sc.e(512)) {
                    scVar.invalidateSelf();
                    return;
                }
                return;
            case 17:
                uc ucVar = (uc) obj;
                if (ucVar.n1) {
                    ucVar.n1 = false;
                    ucVar.invalidate();
                    return;
                }
                return;
            case 18:
                int i10 = ChatActivityEnterView.s5;
                org.telegram.messenger.g0.Q3((Activity) obj);
                return;
            case 19:
                ((Dialog) obj).dismiss();
                return;
            case 20:
                ChatActivityEnterView chatActivityEnterView2 = ((ze) obj).f40969f;
                int i11 = ChatActivityEnterView.s5;
                chatActivityEnterView2.q1();
                return;
            case 21:
                ((jg) obj).f35007s = null;
                return;
            case 22:
                ((qh) obj).f37336k0.f33056u3.f();
                return;
            case 23:
                vj vjVar = (vj) ((androidx.mediarouter.app.f) obj).f2720b;
                try {
                    File file = vjVar.O;
                    if (file == null) {
                        vjVar.S();
                    } else {
                        vjVar.R(file);
                    }
                    vjVar.a0();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((ml) obj).f36106b;
                boolean z9 = ChatAttachAlertPhotoLayout.f31193q1;
                chatAttachAlertPhotoLayout2.s0(-1, true);
                return;
            case 25:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((kl) obj).f35372c;
                ql qlVar = chatAttachAlertPhotoLayout3.P;
                if (qlVar != null && !chatAttachAlertPhotoLayout3.f39071b.I) {
                    qlVar.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 26:
                bm bmVar = (bm) obj;
                di diVar = bmVar.f39071b;
                if (bmVar.Q && (chatAttachAlertPhotoLayout = diVar.f32987a2) != null) {
                    org.telegram.ui.ActionBar.z0 z0Var = chatAttachAlertPhotoLayout.f31203c1;
                    z0Var.setIcon(2131231240);
                    z0Var.setText(org.telegram.messenger.id.M0(2131753756, null));
                    z0Var.setRightIcon(0);
                    return;
                }
                return;
            case 27:
                bn bnVar = (bn) obj;
                bnVar.l1 = -1;
                bnVar.f32306k1 = null;
                return;
            case 28:
                ((xn) obj).p();
                return;
            default:
                ((zn) obj).setVisibility(8);
                return;
        }
    }
}
