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
public final class og implements Runnable {
    public final int f38194a;
    public final Object f38195b;

    public og(Object obj, int i7) {
        this.f38194a = i7;
        this.f38195b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i7 = this.f38194a;
        Object obj = this.f38195b;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((rg) obj).Q0;
                if (!MediaController.B().K()) {
                    org.telegram.messenger.mp.g1().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f32639i5) {
                    chatActivityEnterView.f32765z4 = true;
                }
                MediaController.B().D0(chatActivityEnterView.P);
                chatActivityEnterView.P3.a1(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f32570a2;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                lc lcVar = (lc) obj;
                new ug.y0(42, lcVar.X(), lcVar.f37157c).show();
                return;
            case 2:
                b5 b5Var = (b5) obj;
                b5Var.requestFocus();
                org.telegram.messenger.g0.I3(b5Var);
                return;
            case 3:
                org.telegram.messenger.g0.I3((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = p5.f38487r;
                ((p5) obj).u();
                return;
            case 5:
                l5 l5Var = (l5) obj;
                ArrayList arrayList = new ArrayList(l5Var.f37104c);
                l5Var.f37104c.clear();
                org.telegram.messenger.tr.a0(l5Var.f37105e).f27080a.c(new i5(l5Var, arrayList, 0));
                l5Var.d = null;
                return;
            case 6:
                ((n5) obj).invalidate();
                return;
            case 7:
                ((r1.g) obj).h();
                return;
            case 8:
                o6 o6Var = (o6) obj;
                CharSequence charSequence = o6Var.f38124f;
                if (charSequence != null) {
                    o6Var.c(charSequence, o6Var.h, true);
                    o6Var.f38124f = null;
                    o6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((e8) obj).f34700n.f35131s1.setVisibility(8);
                return;
            case 10:
                ((j8) ((org.telegram.messenger.pe) obj).d).d1();
                return;
            case 11:
                aa aaVar = (aa) obj;
                aaVar.f33443o = true;
                aaVar.d.invalidate();
                return;
            case 12:
                z9 z9Var = (z9) obj;
                if (!z9Var.f42735a) {
                    aa aaVar2 = z9Var.d;
                    Bitmap[] bitmapArr = aaVar2.f33436g;
                    Canvas[] canvasArr = aaVar2.h;
                    aaVar2.f33436g = aaVar2.f33435f;
                    aaVar2.h = aaVar2.f33437i;
                    aaVar2.f33435f = bitmapArr;
                    aaVar2.f33437i = canvasArr;
                    aaVar2.f33439k = false;
                    hi.l5 l5Var2 = aaVar2.d;
                    if (l5Var2 != null) {
                        l5Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ca caVar = ((ha) obj).f35863t;
                if (caVar != null) {
                    caVar.d();
                    return;
                }
                return;
            case 14:
                ca caVar2 = (ca) obj;
                caVar2.f34143o = (Bitmap) caVar2.f34142n.f13760c;
                caVar2.d();
                return;
            case 15:
                gc gcVar = ((ab) obj).f33465b;
                lb lbVar = gcVar.f35504e;
                lbVar.transitionRunningEnter = false;
                lbVar.onEnterTransitionEnd();
                if (gcVar.f35519u) {
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
                if (ycVar.f42406o1) {
                    ycVar.f42406o1 = false;
                    ycVar.invalidate();
                    return;
                }
                return;
            case 18:
                int i10 = ChatActivityEnterView.f32566s7;
                ((hd) obj).a(Boolean.FALSE, 0, 0);
                return;
            case 19:
                int i11 = ChatActivityEnterView.f32566s7;
                org.telegram.messenger.g0.O3((Activity) obj);
                return;
            case 20:
                ((Dialog) obj).dismiss();
                return;
            case 21:
                ChatActivityEnterView chatActivityEnterView2 = ((jf) obj).f36493f;
                int i12 = ChatActivityEnterView.f32566s7;
                chatActivityEnterView2.U1();
                return;
            case 22:
                org.telegram.messenger.g0.E2((ji.p) obj);
                return;
            case 23:
                ((ah) obj).f33505s = null;
                return;
            case 24:
                ((hi) obj).f35911l0.f40457y3.f();
                return;
            case 25:
                mk mkVar = (mk) ((androidx.mediarouter.app.f) obj).f2680b;
                try {
                    File file = mkVar.P;
                    if (file == null) {
                        mkVar.T();
                    } else {
                        mkVar.S(file);
                    }
                    mkVar.a0();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 26:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((cm) obj).f34223b;
                boolean z10 = ChatAttachAlertPhotoLayout.f32795r1;
                chatAttachAlertPhotoLayout2.s0(-1, true);
                return;
            case 27:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((am) obj).f33537c;
                gm gmVar = chatAttachAlertPhotoLayout3.Q;
                if (gmVar != null && !chatAttachAlertPhotoLayout3.f37521b.J) {
                    gmVar.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 28:
                rm rmVar = (rm) obj;
                ui uiVar = rmVar.f37521b;
                if (rmVar.R && (chatAttachAlertPhotoLayout = uiVar.f40386e2) != null) {
                    org.telegram.ui.ActionBar.y0 y0Var = chatAttachAlertPhotoLayout.f32807d1;
                    y0Var.setIcon(2131231240);
                    y0Var.setText(org.telegram.messenger.gd.N0(2131753753, null));
                    y0Var.setRightIcon(0);
                    return;
                }
                return;
            default:
                tn tnVar = (tn) obj;
                tnVar.f39979m1 = -1;
                tnVar.l1 = null;
                return;
        }
    }
}
