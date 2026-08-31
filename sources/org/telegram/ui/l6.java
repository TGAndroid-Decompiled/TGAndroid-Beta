package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class l6 extends f2.a1 {
    public final int f38650a;
    public boolean f38651b;
    public final NotificationCenter.NotificationCenterDelegate f38652c;

    public l6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f38650a = i10;
        this.f38652c = notificationCenterDelegate;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        org.telegram.ui.Components.fl0 fl0Var;
        int topScrollOffset;
        int topScrollOffset2;
        boolean z4;
        switch (this.f38650a) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f38652c;
                org.telegram.ui.Components.ql qlVar = chatAttachAlertPhotoLayout.B;
                org.telegram.ui.Components.mi miVar = chatAttachAlertPhotoLayout.f26546b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = miVar.X0;
                    if (w0Var != null) {
                        i11 = AndroidUtilities.dp(w0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i12 = dp + i11;
                    int backgroundPaddingTop = miVar.getBackgroundPaddingTop();
                    if (((miVar.Y1[0] - backgroundPaddingTop) - i12) + backgroundPaddingTop < (miVar.L0.getAlpha() * miVar.L0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (fl0Var = (org.telegram.ui.Components.fl0) qlVar.K(0)) != null) {
                        View view = fl0Var.f5875a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            qlVar.v0(0, top2 - topScrollOffset2, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                qh.x7 x7Var = (qh.x7) this.f38652c;
                org.telegram.ui.Components.tl0 tl0Var = x7Var.f46293f;
                qh.d8 d8Var = x7Var.T;
                boolean z10 = true;
                if (i10 == 1) {
                    z4 = ((org.telegram.ui.ActionBar.h3) d8Var).keyboardVisible;
                    if (z4 && x7Var.f46298x != null) {
                        d8Var.f1();
                    }
                }
                if (i10 == 0) {
                    x7Var.P = !tl0Var.canScrollVertically(-1);
                    tl0Var.canScrollVertically(1);
                }
                if (i10 == 0) {
                    z10 = false;
                }
                x7Var.J = z10;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z4;
        ViewGroup viewGroup;
        int i12;
        int i13;
        switch (this.f38650a) {
            case 0:
                b7 b7Var = (b7) this.f38652c;
                if (b7Var.f35356c.L0() <= 0 && !b7.a0(b7Var).s()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                b7.b0(b7Var, z4);
                if (this.f38651b != b7Var.S.Z()) {
                    this.f38651b = b7Var.S.Z();
                    b7Var.S.invalidate();
                    return;
                }
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f38652c;
                org.telegram.ui.Components.mi miVar = chatAttachAlertPhotoLayout.f26546b;
                org.telegram.ui.Components.ql qlVar = chatAttachAlertPhotoLayout.B;
                if (qlVar.getChildCount() > 0) {
                    miVar.X1(chatAttachAlertPhotoLayout, i11);
                    float f10 = 0.0f;
                    if (chatAttachAlertPhotoLayout.D.h() > 30) {
                        boolean z10 = this.f38651b;
                        boolean z11 = miVar.O;
                        if (z10 != z11) {
                            this.f38651b = z11;
                            ViewPropertyAnimator animate = qlVar.getFastScroll().animate();
                            if (this.f38651b) {
                                f10 = 1.0f;
                            }
                            animate.alpha(f10).setDuration(100L).start();
                        }
                    } else {
                        qlVar.getFastScroll().setAlpha(0.0f);
                    }
                    if (i11 != 0) {
                        chatAttachAlertPhotoLayout.V();
                        return;
                    }
                    return;
                }
                return;
            default:
                qh.x7 x7Var = (qh.x7) this.f38652c;
                qh.d8 d8Var = x7Var.T;
                org.telegram.ui.Components.tl0 tl0Var = x7Var.f46293f;
                boolean canScrollVertically = tl0Var.canScrollVertically(1);
                if (canScrollVertically != this.f38651b) {
                    x7Var.f46295r.invalidate();
                    this.f38651b = canScrollVertically;
                }
                x7Var.f46292e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.h3) d8Var).containerView;
                viewGroup.invalidate();
                if (x7Var.f46289a == 6 && tl0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(tl0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
