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
    public final int f40247a;
    public final Object f40248b;

    public xf(Object obj, int i7) {
        this.f40247a = i7;
        this.f40248b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i7 = this.f40247a;
        Object obj = this.f40248b;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((ag) obj).f31792b0;
                if (!MediaController.B().K()) {
                    org.telegram.messenger.qp.e1().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f31122s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.B().D0(chatActivityEnterView.O);
                chatActivityEnterView.Z2.R0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f31072k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                hc hcVar = (hc) obj;
                new ug.w0(42, hcVar.W(), hcVar.f34289c).show();
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
                SparseArray sparseArray = i5.f34491r;
                ((i5) obj).u();
                return;
            case 5:
                e5 e5Var = (e5) obj;
                ArrayList arrayList = new ArrayList(e5Var.f33139c);
                e5Var.f33139c.clear();
                org.telegram.messenger.yr.a0(e5Var.f33140e).f26688a.c(new b5(e5Var, arrayList, 0));
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
                CharSequence charSequence = j6Var.f34892f;
                if (charSequence != null) {
                    j6Var.c(charSequence, j6Var.h, true);
                    j6Var.f34892f = null;
                    j6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((a8) obj).f31713n.f32051o1.setVisibility(8);
                return;
            case 10:
                ((f8) ((org.telegram.messenger.re) obj).d).i1();
                return;
            case 11:
                w9 w9Var = (w9) obj;
                w9Var.f39927o = true;
                w9Var.d.invalidate();
                return;
            case 12:
                v9 v9Var = (v9) obj;
                if (!v9Var.f38897a) {
                    w9 w9Var2 = v9Var.d;
                    Bitmap[] bitmapArr = w9Var2.f39920g;
                    Canvas[] canvasArr = w9Var2.h;
                    w9Var2.f39920g = w9Var2.f39919f;
                    w9Var2.h = w9Var2.f39921i;
                    w9Var2.f39919f = bitmapArr;
                    w9Var2.f39921i = canvasArr;
                    w9Var2.f39923k = false;
                    fi.p5 p5Var = w9Var2.d;
                    if (p5Var != null) {
                        p5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                y9 y9Var = ((da) obj).f32804t;
                if (y9Var != null) {
                    y9Var.d();
                    return;
                }
                return;
            case 14:
                y9 y9Var2 = (y9) obj;
                y9Var2.f40580o = (Bitmap) y9Var2.f40579n.f14059c;
                y9Var2.d();
                return;
            case 15:
                cc ccVar = ((va) obj).f38901b;
                gb gbVar = ccVar.f32519e;
                gbVar.transitionRunningEnter = false;
                gbVar.onEnterTransitionEnd();
                if (ccVar.f32534u) {
                    ccVar.i(true);
                    return;
                }
                return;
            case 16:
                sc scVar = (sc) obj;
                scVar.getClass();
                if (org.telegram.messenger.rc.e(512)) {
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
                ChatActivityEnterView chatActivityEnterView2 = ((ze) obj).f40897f;
                int i11 = ChatActivityEnterView.s5;
                chatActivityEnterView2.q1();
                return;
            case 21:
                ((jg) obj).f34965s = null;
                return;
            case 22:
                ((qh) obj).f37416k0.f32951u3.f();
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((ml) obj).f36015b;
                boolean z9 = ChatAttachAlertPhotoLayout.f31183q1;
                chatAttachAlertPhotoLayout2.s0(-1, true);
                return;
            case 25:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((kl) obj).f35333c;
                ql qlVar = chatAttachAlertPhotoLayout3.P;
                if (qlVar != null && !chatAttachAlertPhotoLayout3.f38951b.I) {
                    qlVar.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 26:
                bm bmVar = (bm) obj;
                di diVar = bmVar.f38951b;
                if (bmVar.Q && (chatAttachAlertPhotoLayout = diVar.f32882a2) != null) {
                    org.telegram.ui.ActionBar.z0 z0Var = chatAttachAlertPhotoLayout.f31193c1;
                    z0Var.setIcon(2131231240);
                    z0Var.setText(org.telegram.messenger.hd.M0(2131753756, null));
                    z0Var.setRightIcon(0);
                    return;
                }
                return;
            case 27:
                bn bnVar = (bn) obj;
                bnVar.l1 = -1;
                bnVar.f32198k1 = null;
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
