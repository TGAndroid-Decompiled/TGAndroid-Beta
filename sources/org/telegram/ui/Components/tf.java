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
public final class tf implements Runnable {
    public final int f30633a;
    public final Object f30634b;

    public tf(Object obj, int i10) {
        this.f30633a = i10;
        this.f30634b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i10 = this.f30633a;
        Object obj = this.f30634b;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((wf) obj).f32228b0;
                if (!MediaController.B().K()) {
                    org.telegram.messenger.wp.d1().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f23788s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.B().D0(chatActivityEnterView.O);
                chatActivityEnterView.Z2.G0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23738k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                cc ccVar = (cc) obj;
                new kg.i1(42, ccVar.W(), ccVar.f25078c).show();
                return;
            case 2:
                r4 r4Var = (r4) obj;
                r4Var.requestFocus();
                org.telegram.messenger.i0.J3(r4Var);
                return;
            case 3:
                org.telegram.messenger.i0.J3((EditText) obj);
                return;
            case 4:
                org.telegram.messenger.i0.E2((vh.p2) obj);
                return;
            case 5:
                SparseArray sparseArray = f5.f26057r;
                ((f5) obj).u();
                return;
            case 6:
                b5 b5Var = (b5) obj;
                ArrayList arrayList = new ArrayList(b5Var.f24633c);
                b5Var.f24633c.clear();
                org.telegram.messenger.is.a0(b5Var.e).f16331a.c(new y4(b5Var, arrayList, 0));
                b5Var.d = null;
                return;
            case 7:
                ((d5) obj).invalidate();
                return;
            case 8:
                ((o1.j) obj).h();
                return;
            case 9:
                f6 f6Var = (f6) obj;
                CharSequence charSequence = f6Var.f26083f;
                if (charSequence != null) {
                    f6Var.c(charSequence, f6Var.h, true);
                    f6Var.f26083f = null;
                    f6Var.h = false;
                    return;
                }
                return;
            case 10:
                ((v7) obj).f31219n.f32110o1.setVisibility(8);
                return;
            case 11:
                ((a8) ((m4.n0) obj).f12866c).t1();
                return;
            case 12:
                q9 q9Var = (q9) obj;
                q9Var.f29692o = true;
                q9Var.d.invalidate();
                return;
            case 13:
                p9 p9Var = (p9) obj;
                if (!p9Var.f29385a) {
                    q9 q9Var2 = p9Var.d;
                    Bitmap[] bitmapArr = q9Var2.f29685g;
                    Canvas[] canvasArr = q9Var2.h;
                    q9Var2.f29685g = q9Var2.f29684f;
                    q9Var2.h = q9Var2.f29686i;
                    q9Var2.f29684f = bitmapArr;
                    q9Var2.f29686i = canvasArr;
                    q9Var2.f29688k = false;
                    kg.f0 f0Var = q9Var2.d;
                    if (f0Var != null) {
                        f0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                s9 s9Var = ((x9) obj).f32524t;
                if (s9Var != null) {
                    s9Var.d();
                    return;
                }
                return;
            case 15:
                s9 s9Var2 = (s9) obj;
                s9Var2.f30250o = (Bitmap) s9Var2.f30249n.f6118c;
                s9Var2.d();
                return;
            case 16:
                wb wbVar = ((pa) obj).f29392b;
                bb bbVar = wbVar.e;
                bbVar.transitionRunningEnter = false;
                bbVar.onEnterTransitionEnd();
                if (wbVar.f32212u) {
                    wbVar.i(true);
                    return;
                }
                return;
            case 17:
                lc lcVar = (lc) obj;
                lcVar.getClass();
                if (org.telegram.messenger.tc.e(512)) {
                    lcVar.invalidateSelf();
                    return;
                }
                return;
            case 18:
                nc ncVar = (nc) obj;
                if (ncVar.f28784n1) {
                    ncVar.f28784n1 = false;
                    ncVar.invalidate();
                    return;
                }
                return;
            case 19:
                int i11 = ChatActivityEnterView.f23673s5;
                org.telegram.messenger.i0.P3((Activity) obj);
                return;
            case 20:
                ((Dialog) obj).dismiss();
                return;
            case 21:
                ChatActivityEnterView chatActivityEnterView2 = ((ue) obj).f30945f;
                int i12 = ChatActivityEnterView.f23673s5;
                chatActivityEnterView2.o1();
                return;
            case 22:
                ((fg) obj).f26154s = null;
                return;
            case 23:
                ((ph) obj).f29428k0.f24821u3.f();
                return;
            case 24:
                xj xjVar = (xj) ((androidx.mediarouter.app.f) obj).f1774b;
                try {
                    File file = xjVar.O;
                    if (file == null) {
                        xjVar.R();
                    } else {
                        xjVar.Q(file);
                    }
                    xjVar.Y();
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 25:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((sl) obj).f30329b;
                boolean z10 = ChatAttachAlertPhotoLayout.f23846q1;
                chatAttachAlertPhotoLayout2.q0(-1, true);
                return;
            case 26:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((ql) obj).f29750c;
                yl ylVar = chatAttachAlertPhotoLayout3.P;
                if (ylVar != null && !chatAttachAlertPhotoLayout3.f30964b.I) {
                    ylVar.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 27:
                jm jmVar = (jm) obj;
                bi biVar = jmVar.f30964b;
                if (jmVar.Q && (chatAttachAlertPhotoLayout = biVar.a2) != null) {
                    org.telegram.ui.ActionBar.b1 b1Var = chatAttachAlertPhotoLayout.f23856c1;
                    b1Var.setIcon(2131231241);
                    b1Var.setText(org.telegram.messenger.dd.L0(2131753756, null));
                    b1Var.setRightIcon(0);
                    return;
                }
                return;
            case 28:
                jn jnVar = (jn) obj;
                jnVar.l1 = -1;
                jnVar.f27497k1 = null;
                return;
            default:
                ((fo) obj).s();
                return;
        }
    }
}
