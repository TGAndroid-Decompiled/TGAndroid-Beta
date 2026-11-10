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
public final class wf implements Runnable {
    public final int f39957a;
    public final Object f39958b;

    public wf(Object obj, int i7) {
        this.f39957a = i7;
        this.f39958b = obj;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        int i7 = this.f39957a;
        Object obj = this.f39958b;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = ((zf) obj).f40935b0;
                if (!MediaController.B().K()) {
                    org.telegram.messenger.qp.e1().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView.f31143s4) {
                    chatActivityEnterView.J3 = true;
                }
                MediaController.B().D0(chatActivityEnterView.O);
                chatActivityEnterView.Z2.R0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f31093k1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    return;
                }
                return;
            case 1:
                gc gcVar = (gc) obj;
                new ug.w0(42, gcVar.W(), gcVar.f33873c).show();
                return;
            case 2:
                t4 t4Var = (t4) obj;
                t4Var.requestFocus();
                org.telegram.messenger.g0.K3(t4Var);
                return;
            case 3:
                org.telegram.messenger.g0.K3((EditText) obj);
                return;
            case 4:
                SparseArray sparseArray = h5.f34162r;
                ((h5) obj).u();
                return;
            case 5:
                d5 d5Var = (d5) obj;
                ArrayList arrayList = new ArrayList(d5Var.f32889c);
                d5Var.f32889c.clear();
                org.telegram.messenger.yr.a0(d5Var.f32890e).f26723a.c(new a5(d5Var, arrayList, 0));
                d5Var.d = null;
                return;
            case 6:
                ((f5) obj).invalidate();
                return;
            case 7:
                ((r1.g) obj).h();
                return;
            case 8:
                i6 i6Var = (i6) obj;
                CharSequence charSequence = i6Var.f34545f;
                if (charSequence != null) {
                    i6Var.c(charSequence, i6Var.h, true);
                    i6Var.f34545f = null;
                    i6Var.h = false;
                    return;
                }
                return;
            case 9:
                ((z7) obj).f40892n.f31754r1.setVisibility(8);
                return;
            case 10:
                ((e8) ((org.telegram.messenger.re) obj).d).i1();
                return;
            case 11:
                v9 v9Var = (v9) obj;
                v9Var.f38958o = true;
                v9Var.d.invalidate();
                return;
            case 12:
                u9 u9Var = (u9) obj;
                if (!u9Var.f38599a) {
                    v9 v9Var2 = u9Var.d;
                    Bitmap[] bitmapArr = v9Var2.f38951g;
                    Canvas[] canvasArr = v9Var2.h;
                    v9Var2.f38951g = v9Var2.f38950f;
                    v9Var2.h = v9Var2.f38952i;
                    v9Var2.f38950f = bitmapArr;
                    v9Var2.f38952i = canvasArr;
                    v9Var2.f38954k = false;
                    fi.p5 p5Var = v9Var2.d;
                    if (p5Var != null) {
                        p5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                x9 x9Var = ((ca) obj).f32517t;
                if (x9Var != null) {
                    x9Var.d();
                    return;
                }
                return;
            case 14:
                x9 x9Var2 = (x9) obj;
                x9Var2.f40270o = (Bitmap) x9Var2.f40269n.f14061c;
                x9Var2.d();
                return;
            case 15:
                bc bcVar = ((ua) obj).f38603b;
                fb fbVar = bcVar.f32199e;
                fbVar.transitionRunningEnter = false;
                fbVar.onEnterTransitionEnd();
                if (bcVar.f32214u) {
                    bcVar.i(true);
                    return;
                }
                return;
            case 16:
                rc rcVar = (rc) obj;
                rcVar.getClass();
                if (org.telegram.messenger.sc.e(512)) {
                    rcVar.invalidateSelf();
                    return;
                }
                return;
            case 17:
                tc tcVar = (tc) obj;
                if (tcVar.n1) {
                    tcVar.n1 = false;
                    tcVar.invalidate();
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
                ChatActivityEnterView chatActivityEnterView2 = ((ye) obj).f40565f;
                int i11 = ChatActivityEnterView.s5;
                chatActivityEnterView2.q1();
                return;
            case 21:
                ((ig) obj).f34616s = null;
                return;
            case 22:
                ((ph) obj).f36935k0.f32669x3.f();
                return;
            case 23:
                uj ujVar = (uj) ((androidx.mediarouter.app.f) obj).f2720b;
                try {
                    File file = ujVar.O;
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
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((ll) obj).f35690b;
                boolean z9 = ChatAttachAlertPhotoLayout.f31204q1;
                chatAttachAlertPhotoLayout2.s0(-1, true);
                return;
            case 25:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((jl) obj).f34963c;
                pl plVar = chatAttachAlertPhotoLayout3.P;
                if (plVar != null && !chatAttachAlertPhotoLayout3.f38656b.I) {
                    plVar.setSystemUiVisibility(1028);
                    return;
                }
                return;
            case 26:
                am amVar = (am) obj;
                ci ciVar = amVar.f38656b;
                if (amVar.Q && (chatAttachAlertPhotoLayout = ciVar.d2) != null) {
                    org.telegram.ui.ActionBar.z0 z0Var = chatAttachAlertPhotoLayout.f31214c1;
                    z0Var.setIcon(2131231240);
                    z0Var.setText(org.telegram.messenger.id.M0(2131753756, null));
                    z0Var.setRightIcon(0);
                    return;
                }
                return;
            case 27:
                an anVar = (an) obj;
                anVar.l1 = -1;
                anVar.f31909k1 = null;
                return;
            case 28:
                ((wn) obj).p();
                return;
            default:
                ((yn) obj).setVisibility(8);
                return;
        }
    }
}
