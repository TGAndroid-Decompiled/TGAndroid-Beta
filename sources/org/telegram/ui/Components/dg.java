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
public final class dg implements Runnable {
    public final int f33943a;
    public final Object f33944b;

    public dg(Object obj, int i7) {
        this.f33943a = i7;
        this.f33944b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i7 = this.f33943a;
        Object obj = this.f33944b;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((gg) obj).Q0;
                if (!MediaController.B().K()) {
                    org.telegram.messenger.np.e1().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f32159a5) {
                    chatActivityEnterView.f32277r4 = true;
                }
                MediaController.B().D0(chatActivityEnterView.P);
                chatActivityEnterView.H3.a1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.S1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                cc ccVar = (cc) obj;
                new ug.x0(42, ccVar.W(), ccVar.f33534c).show();
                return;
            case 2:
                s4 s4Var = (s4) obj;
                s4Var.requestFocus();
                org.telegram.messenger.g0.J3(s4Var);
                return;
            case 3:
                org.telegram.messenger.g0.J3((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = g5.f34795r;
                ((g5) obj).u();
                return;
            case 5:
                c5 c5Var = (c5) obj;
                ArrayList arrayList = new ArrayList(c5Var.f33504c);
                c5Var.f33504c.clear();
                org.telegram.messenger.vr.a0(c5Var.f33505e).f27220a.c(new z4(c5Var, arrayList, 0));
                c5Var.d = null;
                return;
            case 6:
                ((e5) obj).invalidate();
                return;
            case 7:
                ((r1.g) obj).h();
                return;
            case 8:
                h6 h6Var = (h6) obj;
                CharSequence charSequence = h6Var.f35177f;
                if (charSequence != null) {
                    h6Var.c(charSequence, h6Var.h, true);
                    h6Var.f35177f = null;
                    h6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((x7) obj).f41611n.f41916s1.setVisibility(8);
                return;
            case 10:
                ((c8) ((org.telegram.messenger.qe) obj).d).g1();
                return;
            case 11:
                s9 s9Var = (s9) obj;
                s9Var.f39251o = true;
                s9Var.d.invalidate();
                return;
            case 12:
                r9 r9Var = (r9) obj;
                if (!r9Var.f38904a) {
                    s9 s9Var2 = r9Var.d;
                    Bitmap[] bitmapArr = s9Var2.f39244g;
                    Canvas[] canvasArr = s9Var2.h;
                    s9Var2.f39244g = s9Var2.f39243f;
                    s9Var2.h = s9Var2.f39245i;
                    s9Var2.f39243f = bitmapArr;
                    s9Var2.f39245i = canvasArr;
                    s9Var2.f39247k = false;
                    hi.n5 n5Var = s9Var2.d;
                    if (n5Var != null) {
                        n5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                u9 u9Var = ((z9) obj).f42325t;
                if (u9Var != null) {
                    u9Var.d();
                    return;
                }
                return;
            case 14:
                u9 u9Var2 = (u9) obj;
                u9Var2.f39979o = (Bitmap) u9Var2.f39978n.f13419c;
                u9Var2.d();
                return;
            case 15:
                xb xbVar = ((ra) obj).f38911b;
                cb cbVar = xbVar.f41639e;
                cbVar.transitionRunningEnter = false;
                cbVar.onEnterTransitionEnd();
                if (xbVar.f41654u) {
                    xbVar.i(true);
                    return;
                }
                return;
            case 16:
                nc ncVar = (nc) obj;
                ncVar.getClass();
                if (org.telegram.messenger.qc.e(512)) {
                    ncVar.invalidateSelf();
                    return;
                }
                return;
            case 17:
                pc pcVar = (pc) obj;
                if (pcVar.f38276o1) {
                    pcVar.f38276o1 = false;
                    pcVar.invalidate();
                    return;
                }
                return;
            case 18:
                int i10 = ChatActivityEnterView.N6;
                ((yc) obj).a(Boolean.FALSE, 0, 0);
                return;
            case 19:
                int i11 = ChatActivityEnterView.N6;
                org.telegram.messenger.g0.P3((Activity) obj);
                return;
            case 20:
                ((Dialog) obj).dismiss();
                return;
            case 21:
                ChatActivityEnterView chatActivityEnterView2 = ((ze) obj).f42347f;
                int i12 = ChatActivityEnterView.N6;
                chatActivityEnterView2.I1();
                return;
            case 22:
                org.telegram.messenger.g0.E2((ji.n) obj);
                return;
            case 23:
                ((pg) obj).f38297s = null;
                return;
            case 24:
                ((xh) obj).f41700l0.f36518y3.f();
                return;
            case 25:
                dk dkVar = (dk) ((androidx.mediarouter.app.f) obj).f2673b;
                try {
                    File file = dkVar.P;
                    if (file == null) {
                        dkVar.T();
                    } else {
                        dkVar.S(file);
                    }
                    dkVar.a0();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 26:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((tl) obj).f39714b;
                boolean z10 = ChatAttachAlertPhotoLayout.f32365r1;
                chatAttachAlertPhotoLayout2.s0(-1, true);
                return;
            case 27:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((rl) obj).f38997c;
                xl xlVar = chatAttachAlertPhotoLayout3.Q;
                if (xlVar != null && !chatAttachAlertPhotoLayout3.f33607b.J) {
                    xlVar.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 28:
                im imVar = (im) obj;
                ki kiVar = imVar.f33607b;
                if (imVar.R && (chatAttachAlertPhotoLayout = kiVar.f36447e2) != null) {
                    org.telegram.ui.ActionBar.z0 z0Var = chatAttachAlertPhotoLayout.f32377d1;
                    z0Var.setIcon(2131231240);
                    z0Var.setText(org.telegram.messenger.hd.M0(2131753756, null));
                    z0Var.setRightIcon(0);
                    return;
                }
                return;
            default:
                jn jnVar = (jn) obj;
                jnVar.f36095m1 = -1;
                jnVar.l1 = null;
                return;
        }
    }
}
