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
public final class lg implements Runnable {
    public final int f37120a;
    public final Object f37121b;

    public lg(Object obj, int i7) {
        this.f37120a = i7;
        this.f37121b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i7 = this.f37120a;
        Object obj = this.f37121b;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((pg) obj).Q0;
                if (!MediaController.B().K()) {
                    org.telegram.messenger.mp.g1().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f32596g5) {
                    chatActivityEnterView.f32717x4 = true;
                }
                MediaController.B().D0(chatActivityEnterView.P);
                chatActivityEnterView.N3.a1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.Y1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                lc lcVar = (lc) obj;
                new ug.z0(42, lcVar.X(), lcVar.f37093c).show();
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
                SparseArray sparseArray = o5.f37962r;
                ((o5) obj).u();
                return;
            case 5:
                k5 k5Var = (k5) obj;
                ArrayList arrayList = new ArrayList(k5Var.f36680c);
                k5Var.f36680c.clear();
                org.telegram.messenger.tr.a0(k5Var.f36681e).f27052a.c(new h5(k5Var, arrayList, 0));
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
                CharSequence charSequence = n6Var.f37739f;
                if (charSequence != null) {
                    n6Var.c(charSequence, n6Var.h, true);
                    n6Var.f37739f = null;
                    n6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((f8) obj).f35022n.f35408s1.setVisibility(8);
                return;
            case 10:
                ((k8) ((org.telegram.messenger.pe) obj).d).d1();
                return;
            case 11:
                aa aaVar = (aa) obj;
                aaVar.f33313o = true;
                aaVar.d.invalidate();
                return;
            case 12:
                z9 z9Var = (z9) obj;
                if (!z9Var.f42825a) {
                    aa aaVar2 = z9Var.d;
                    Bitmap[] bitmapArr = aaVar2.f33306g;
                    Canvas[] canvasArr = aaVar2.h;
                    aaVar2.f33306g = aaVar2.f33305f;
                    aaVar2.h = aaVar2.f33307i;
                    aaVar2.f33305f = bitmapArr;
                    aaVar2.f33307i = canvasArr;
                    aaVar2.f33309k = false;
                    hi.m5 m5Var = aaVar2.d;
                    if (m5Var != null) {
                        m5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ca caVar = ((ha) obj).f35843t;
                if (caVar != null) {
                    caVar.d();
                    return;
                }
                return;
            case 14:
                ca caVar2 = (ca) obj;
                caVar2.f33953o = (Bitmap) caVar2.f33952n.f13731c;
                caVar2.d();
                return;
            case 15:
                gc gcVar = ((ab) obj).f33324b;
                lb lbVar = gcVar.f35457e;
                lbVar.transitionRunningEnter = false;
                lbVar.onEnterTransitionEnd();
                if (gcVar.f35472u) {
                    gcVar.i(true);
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
                if (ycVar.f42463o1) {
                    ycVar.f42463o1 = false;
                    ycVar.invalidate();
                    return;
                }
                return;
            case 18:
                int i10 = ChatActivityEnterView.f32538n7;
                ((hd) obj).a(Boolean.FALSE, 0, 0);
                return;
            case 19:
                int i11 = ChatActivityEnterView.f32538n7;
                org.telegram.messenger.g0.O3((Activity) obj);
                return;
            case 20:
                ((Dialog) obj).dismiss();
                return;
            case 21:
                ChatActivityEnterView chatActivityEnterView2 = ((jf) obj).f36427f;
                int i12 = ChatActivityEnterView.f32538n7;
                chatActivityEnterView2.Q1();
                return;
            case 22:
                org.telegram.messenger.g0.E2((ji.n) obj);
                return;
            case 23:
                ((yg) obj).f42486s = null;
                return;
            case 24:
                ((fi) obj).f35104l0.f39741y3.f();
                return;
            case 25:
                kk kkVar = (kk) ((androidx.mediarouter.app.f) obj).f2668b;
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((am) obj).f33364b;
                boolean z10 = ChatAttachAlertPhotoLayout.f32762r1;
                chatAttachAlertPhotoLayout2.s0(-1, true);
                return;
            case 27:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((yl) obj).f42518c;
                em emVar = chatAttachAlertPhotoLayout3.Q;
                if (emVar != null && !chatAttachAlertPhotoLayout3.f36766b.J) {
                    emVar.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 28:
                pm pmVar = (pm) obj;
                si siVar = pmVar.f36766b;
                if (pmVar.R && (chatAttachAlertPhotoLayout = siVar.f39670e2) != null) {
                    org.telegram.ui.ActionBar.z0 z0Var = chatAttachAlertPhotoLayout.f32774d1;
                    z0Var.setIcon(2131231240);
                    z0Var.setText(org.telegram.messenger.gd.M0(2131753754, null));
                    z0Var.setRightIcon(0);
                    return;
                }
                return;
            default:
                rn rnVar = (rn) obj;
                rnVar.f39230m1 = -1;
                rnVar.l1 = null;
                return;
        }
    }
}
