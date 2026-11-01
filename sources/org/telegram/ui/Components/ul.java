package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
public final class ul extends s4.s0 {
    public final int f31033a;
    public boolean f31034b;
    public final Object f31035c;

    public ul(int i10, FrameLayout frameLayout) {
        this.f31033a = i10;
        this.f31035c = frameLayout;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        dk0 dk0Var;
        int topScrollOffset;
        int topScrollOffset2;
        int i12 = this.f31033a;
        boolean z10 = false;
        Object obj = this.f31035c;
        switch (i12) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                pl plVar = chatAttachAlertPhotoLayout.E;
                bi biVar = chatAttachAlertPhotoLayout.f30964b;
                if (i10 == 0) {
                    int L = org.telegram.messenger.i0.L(13.0f);
                    org.telegram.ui.ActionBar.t0 t0Var = biVar.U2;
                    if (t0Var != null) {
                        i11 = org.telegram.messenger.i0.L(t0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i13 = L + i11;
                    int i14 = biVar.f21615s0;
                    if (((biVar.V3[0] - i14) - i13) + i14 < (biVar.I2.getAlpha() * biVar.I2.getMeasuredHeight()) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (dk0Var = (dk0) plVar.K(0)) != null) {
                        View view = dk0Var.f47909a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            plVar.w0(0, top2 - topScrollOffset2, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (i10 == 0 && this.f31034b) {
                    this.f31034b = false;
                    ((org.telegram.ui.Wallet.x5) obj).f();
                    return;
                }
                return;
            default:
                vh.r6 r6Var = (vh.r6) obj;
                uk0 uk0Var = r6Var.f51874f;
                if (i10 == 1) {
                    vh.w6 w6Var = r6Var.W;
                    int i15 = vh.w6.U1;
                    if (w6Var.d && r6Var.f51880y != null) {
                        w6Var.M0();
                    }
                }
                if (i10 == 0) {
                    r6Var.S = !uk0Var.canScrollVertically(-1);
                    uk0Var.canScrollVertically(1);
                }
                if (i10 != 0) {
                    z10 = true;
                }
                r6Var.M = z10;
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12 = this.f31033a;
        Object obj = this.f31035c;
        switch (i12) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                bi biVar = chatAttachAlertPhotoLayout.f30964b;
                pl plVar = chatAttachAlertPhotoLayout.E;
                if (plVar.getChildCount() > 0) {
                    biVar.L1(chatAttachAlertPhotoLayout, i11);
                    float f7 = 0.0f;
                    if (chatAttachAlertPhotoLayout.G.b() > 30) {
                        boolean z10 = this.f31034b;
                        boolean z11 = biVar.I1;
                        if (z10 != z11) {
                            this.f31034b = z11;
                            ViewPropertyAnimator animate = plVar.getFastScroll().animate();
                            if (this.f31034b) {
                                f7 = 1.0f;
                            }
                            org.telegram.messenger.a30.l(animate, f7, 100L);
                        }
                    } else {
                        plVar.getFastScroll().setAlpha(0.0f);
                    }
                    if (i11 != 0) {
                        chatAttachAlertPhotoLayout.W();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (i10 != 0 || i11 != 0) {
                    this.f31034b = true;
                    return;
                }
                return;
            default:
                vh.r6 r6Var = (vh.r6) obj;
                vh.w6 w6Var = r6Var.W;
                uk0 uk0Var = r6Var.f51874f;
                boolean canScrollVertically = uk0Var.canScrollVertically(1);
                if (canScrollVertically != this.f31034b) {
                    r6Var.f51876r.invalidate();
                    this.f31034b = canScrollVertically;
                }
                r6Var.e.invalidate();
                int i13 = vh.w6.U1;
                w6Var.f21587b.invalidate();
                if (r6Var.f51871a == 6 && uk0Var.getChildCount() > 0 && RecyclerView.R(uk0Var.getChildAt(0)) >= org.telegram.messenger.wp.r1(w6Var.f21584a).O1().L.size()) {
                    org.telegram.messenger.wp.r1(w6Var.f21584a).O1().S();
                    return;
                }
                return;
        }
    }

    public ul(org.telegram.ui.Wallet.x5 x5Var) {
        this.f31033a = 1;
        this.f31035c = x5Var;
        this.f31034b = false;
    }
}
