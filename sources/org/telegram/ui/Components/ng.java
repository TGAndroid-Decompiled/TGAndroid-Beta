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
public final class ng implements Runnable {
    public final int f37782a;
    public final Object f37783b;

    public ng(Object obj, int i7) {
        this.f37782a = i7;
        this.f37783b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i7 = this.f37782a;
        Object obj = this.f37783b;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((qg) obj).Q0;
                if (!MediaController.B().K()) {
                    org.telegram.messenger.mp.g1().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f32706i5) {
                    chatActivityEnterView.f32832z4 = true;
                }
                MediaController.B().D0(chatActivityEnterView.P);
                chatActivityEnterView.P3.U0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f32637a2;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                kc kcVar = (kc) obj;
                new ug.y0(42, kcVar.X(), kcVar.f36700c).show();
                return;
            case 2:
                a5 a5Var = (a5) obj;
                a5Var.requestFocus();
                org.telegram.messenger.g0.I3(a5Var);
                return;
            case 3:
                org.telegram.messenger.g0.I3((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = o5.f38014r;
                ((o5) obj).u();
                return;
            case 5:
                k5 k5Var = (k5) obj;
                ArrayList arrayList = new ArrayList(k5Var.f36649c);
                k5Var.f36649c.clear();
                org.telegram.messenger.tr.a0(k5Var.f36650e).f27149a.c(new h5(k5Var, arrayList, 0));
                k5Var.d = null;
                return;
            case 6:
                ((m5) obj).invalidate();
                return;
            case 7:
                ((r1.g) obj).h();
                return;
            case 8:
                n6 n6Var = (n6) obj;
                CharSequence charSequence = n6Var.f37684f;
                if (charSequence != null) {
                    n6Var.c(charSequence, n6Var.h, true);
                    n6Var.f37684f = null;
                    n6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((d8) obj).f34233n.f34614s1.setVisibility(8);
                return;
            case 10:
                ((i8) ((org.telegram.messenger.pe) obj).d).X0();
                return;
            case 11:
                z9 z9Var = (z9) obj;
                z9Var.f42769o = true;
                z9Var.d.invalidate();
                return;
            case 12:
                y9 y9Var = (y9) obj;
                if (!y9Var.f42380a) {
                    z9 z9Var2 = y9Var.d;
                    Bitmap[] bitmapArr = z9Var2.f42762g;
                    Canvas[] canvasArr = z9Var2.h;
                    z9Var2.f42762g = z9Var2.f42761f;
                    z9Var2.h = z9Var2.f42763i;
                    z9Var2.f42761f = bitmapArr;
                    z9Var2.f42763i = canvasArr;
                    z9Var2.f42765k = false;
                    hi.w5 w5Var = z9Var2.d;
                    if (w5Var != null) {
                        w5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ba baVar = ((ga) obj).f35392t;
                if (baVar != null) {
                    baVar.d();
                    return;
                }
                return;
            case 14:
                ba baVar2 = (ba) obj;
                baVar2.f33719o = (Bitmap) baVar2.f33718n.f13726c;
                baVar2.d();
                return;
            case 15:
                fc fcVar = ((za) obj).f42780b;
                kb kbVar = fcVar.f35087e;
                kbVar.transitionRunningEnter = false;
                kbVar.onEnterTransitionEnd();
                if (fcVar.f35102u) {
                    fcVar.i(true);
                    return;
                }
                return;
            case 16:
                wc wcVar = (wc) obj;
                wcVar.getClass();
                if (org.telegram.messenger.pc.e(512)) {
                    wcVar.invalidateSelf();
                    return;
                }
                return;
            case 17:
                yc ycVar = (yc) obj;
                if (ycVar.f42421o1) {
                    ycVar.f42421o1 = false;
                    ycVar.invalidate();
                    return;
                }
                return;
            case 18:
                int i10 = ChatActivityEnterView.f32633s7;
                ((hd) obj).a(Boolean.FALSE, 0, 0);
                return;
            case 19:
                int i11 = ChatActivityEnterView.f32633s7;
                org.telegram.messenger.g0.O3((Activity) obj);
                return;
            case 20:
                ((Dialog) obj).dismiss();
                return;
            case 21:
                ChatActivityEnterView chatActivityEnterView2 = ((kf) obj).f36735f;
                int i12 = ChatActivityEnterView.f32633s7;
                chatActivityEnterView2.W1();
                return;
            case 22:
                org.telegram.messenger.g0.E2((ji.o) obj);
                return;
            case 23:
                ((zg) obj).f42848s = null;
                return;
            case 24:
                ((gi) obj).f35439l0.f40038y3.f();
                return;
            case 25:
                kk kkVar = (kk) ((androidx.mediarouter.app.f) obj).f2639b;
                try {
                    File file = kkVar.P;
                    if (file == null) {
                        kkVar.T();
                    } else {
                        kkVar.S(file);
                    }
                    kkVar.a0();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 26:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((am) obj).f33495b;
                boolean z10 = ChatAttachAlertPhotoLayout.f32862r1;
                chatAttachAlertPhotoLayout2.s0(-1, true);
                return;
            case 27:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((yl) obj).f42515c;
                em emVar = chatAttachAlertPhotoLayout3.Q;
                if (emVar != null && !chatAttachAlertPhotoLayout3.f37135b.J) {
                    emVar.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 28:
                pm pmVar = (pm) obj;
                ti tiVar = pmVar.f37135b;
                if (pmVar.R && (chatAttachAlertPhotoLayout = tiVar.f39967e2) != null) {
                    org.telegram.ui.ActionBar.y0 y0Var = chatAttachAlertPhotoLayout.f32874d1;
                    y0Var.setIcon(2131231243);
                    y0Var.setText(org.telegram.messenger.gd.N0(2131753753, null));
                    y0Var.setRightIcon(0);
                    return;
                }
                return;
            default:
                qn qnVar = (qn) obj;
                qnVar.f38932m1 = -1;
                qnVar.l1 = null;
                return;
        }
    }
}
