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
public final class vf implements Runnable {
    public final int f39090a;
    public final Object f39091b;

    public vf(Object obj, int i3) {
        this.f39090a = i3;
        this.f39091b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i3 = this.f39090a;
        Object obj = this.f39091b;
        switch (i3) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((yf) obj).f40698c0;
                if (!MediaController.B().K()) {
                    org.telegram.messenger.hp.e1().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f31202t4) {
                    chatActivityEnterView.K3 = true;
                }
                MediaController.B().D0(chatActivityEnterView.P);
                chatActivityEnterView.f31087a3.M0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f31152l1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                fc fcVar = (fc) obj;
                new vg.v0(42, fcVar.W(), fcVar.f33774c).show();
                return;
            case 2:
                s4 s4Var = (s4) obj;
                s4Var.requestFocus();
                org.telegram.messenger.g0.K3(s4Var);
                return;
            case 3:
                org.telegram.messenger.g0.K3((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = g5.f33957r;
                ((g5) obj).u();
                return;
            case 5:
                c5 c5Var = (c5) obj;
                ArrayList arrayList = new ArrayList(c5Var.f32563c);
                c5Var.f32563c.clear();
                org.telegram.messenger.qr.a0(c5Var.f32564e).f24934a.c(new z4(c5Var, arrayList, 0));
                c5Var.d = null;
                return;
            case 6:
                ((e5) obj).invalidate();
                return;
            case 7:
                ((q1.g) obj).h();
                return;
            case 8:
                h6 h6Var = (h6) obj;
                CharSequence charSequence = h6Var.f34309f;
                if (charSequence != null) {
                    h6Var.c(charSequence, h6Var.h, true);
                    h6Var.f34309f = null;
                    h6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((y7) obj).f40642n.f40958p1.setVisibility(8);
                return;
            case 10:
                ((d8) ((o4.m0) obj).f20755c).g1();
                return;
            case 11:
                v9 v9Var = (v9) obj;
                v9Var.f39045o = true;
                v9Var.d.invalidate();
                return;
            case 12:
                u9 u9Var = (u9) obj;
                if (!u9Var.f38701a) {
                    v9 v9Var2 = u9Var.d;
                    Bitmap[] bitmapArr = v9Var2.f39038g;
                    Canvas[] canvasArr = v9Var2.h;
                    v9Var2.f39038g = v9Var2.f39037f;
                    v9Var2.h = v9Var2.f39039i;
                    v9Var2.f39037f = bitmapArr;
                    v9Var2.f39039i = canvasArr;
                    v9Var2.f39041k = false;
                    gi.n5 n5Var = v9Var2.d;
                    if (n5Var != null) {
                        n5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                x9 x9Var = ((ca) obj).f32638t;
                if (x9Var != null) {
                    x9Var.d();
                    return;
                }
                return;
            case 14:
                x9 x9Var2 = (x9) obj;
                x9Var2.f40283o = (Bitmap) x9Var2.f40282n.f11820c;
                x9Var2.d();
                return;
            case 15:
                ac acVar = ((ua) obj).f38706b;
                fb fbVar = acVar.f31788e;
                fbVar.transitionRunningEnter = false;
                fbVar.onEnterTransitionEnd();
                if (acVar.f31803u) {
                    acVar.i(true);
                    return;
                }
                return;
            case 16:
                qc qcVar = (qc) obj;
                qcVar.getClass();
                if (org.telegram.messenger.lc.e(512)) {
                    qcVar.invalidateSelf();
                    return;
                }
                return;
            case 17:
                sc scVar = (sc) obj;
                if (scVar.f37978o1) {
                    scVar.f37978o1 = false;
                    scVar.invalidate();
                    return;
                }
                return;
            case 18:
                int i10 = ChatActivityEnterView.f31082t5;
                org.telegram.messenger.g0.Q3((Activity) obj);
                return;
            case 19:
                ((Dialog) obj).dismiss();
                return;
            case 20:
                ChatActivityEnterView chatActivityEnterView2 = ((xe) obj).f40327f;
                int i11 = ChatActivityEnterView.f31082t5;
                chatActivityEnterView2.p1();
                return;
            case 21:
                ((hg) obj).f34382s = null;
                return;
            case 22:
                ((oh) obj).f36835l0.f32284v3.f();
                return;
            case 23:
                uj ujVar = (uj) ((androidx.mediarouter.app.f) obj).f2149b;
                try {
                    File file = ujVar.P;
                    if (file == null) {
                        ujVar.S();
                    } else {
                        ujVar.R(file);
                    }
                    ujVar.a0();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 24:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((ll) obj).f35787b;
                boolean z10 = ChatAttachAlertPhotoLayout.f31258r1;
                chatAttachAlertPhotoLayout2.s0(-1, true);
                return;
            case 25:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((jl) obj).f35100c;
                pl plVar = chatAttachAlertPhotoLayout3.Q;
                if (plVar != null && !chatAttachAlertPhotoLayout3.f38416b.J) {
                    plVar.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 26:
                am amVar = (am) obj;
                bi biVar = amVar.f38416b;
                if (amVar.R && (chatAttachAlertPhotoLayout = biVar.f32215b2) != null) {
                    org.telegram.ui.ActionBar.y0 y0Var = chatAttachAlertPhotoLayout.f31270d1;
                    y0Var.setIcon(2131231240);
                    y0Var.setText(org.telegram.messenger.bd.M0(2131753756, null));
                    y0Var.setRightIcon(0);
                    return;
                }
                return;
            case 27:
                an anVar = (an) obj;
                anVar.m1 = -1;
                anVar.f31926l1 = null;
                return;
            case 28:
                ((wn) obj).q();
                return;
            default:
                ((yn) obj).setVisibility(8);
                return;
        }
    }
}
