package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class l6 extends f2.z0 {
    public final int f35963a;
    public boolean f35964b;
    public final NotificationCenter.NotificationCenterDelegate f35965c;

    public l6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f35963a = i10;
        this.f35965c = notificationCenterDelegate;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        org.telegram.ui.Components.el0 el0Var;
        int topScrollOffset;
        int topScrollOffset2;
        boolean z4;
        switch (this.f35963a) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f35965c;
                org.telegram.ui.Components.pl plVar = chatAttachAlertPhotoLayout.B;
                org.telegram.ui.Components.li liVar = chatAttachAlertPhotoLayout.f24278b;
                if (i10 == 0) {
                    int dp = AndroidUtilities.dp(13.0f);
                    org.telegram.ui.ActionBar.w0 w0Var = liVar.X0;
                    if (w0Var != null) {
                        i11 = AndroidUtilities.dp(w0Var.getAlpha() * 26.0f);
                    } else {
                        i11 = 0;
                    }
                    int i12 = dp + i11;
                    int backgroundPaddingTop = liVar.getBackgroundPaddingTop();
                    if (((liVar.Y1[0] - backgroundPaddingTop) - i12) + backgroundPaddingTop < (liVar.L0.getAlpha() * liVar.L0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (el0Var = (org.telegram.ui.Components.el0) plVar.K(0)) != null) {
                        View view = el0Var.f5785a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            plVar.v0(0, top2 - topScrollOffset2, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ph.z7 z7Var = (ph.z7) this.f35965c;
                org.telegram.ui.Components.sl0 sl0Var = z7Var.f42663f;
                ph.f8 f8Var = z7Var.T;
                boolean z10 = true;
                if (i10 == 1) {
                    z4 = ((org.telegram.ui.ActionBar.g3) f8Var).keyboardVisible;
                    if (z4 && z7Var.f42668x != null) {
                        f8Var.f1();
                    }
                }
                if (i10 == 0) {
                    z7Var.P = !sl0Var.canScrollVertically(-1);
                    sl0Var.canScrollVertically(1);
                }
                if (i10 == 0) {
                    z10 = false;
                }
                z7Var.J = z10;
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
        switch (this.f35963a) {
            case 0:
                b7 b7Var = (b7) this.f35965c;
                if (b7Var.f32815c.L0() <= 0 && !b7.a0(b7Var).s()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                b7.b0(b7Var, z4);
                if (this.f35964b != b7Var.S.Z()) {
                    this.f35964b = b7Var.S.Z();
                    b7Var.S.invalidate();
                    return;
                }
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f35965c;
                org.telegram.ui.Components.li liVar = chatAttachAlertPhotoLayout.f24278b;
                org.telegram.ui.Components.pl plVar = chatAttachAlertPhotoLayout.B;
                if (plVar.getChildCount() > 0) {
                    liVar.X1(chatAttachAlertPhotoLayout, i11);
                    float f10 = 0.0f;
                    if (chatAttachAlertPhotoLayout.D.h() > 30) {
                        boolean z10 = this.f35964b;
                        boolean z11 = liVar.O;
                        if (z10 != z11) {
                            this.f35964b = z11;
                            ViewPropertyAnimator animate = plVar.getFastScroll().animate();
                            if (this.f35964b) {
                                f10 = 1.0f;
                            }
                            animate.alpha(f10).setDuration(100L).start();
                        }
                    } else {
                        plVar.getFastScroll().setAlpha(0.0f);
                    }
                    if (i11 != 0) {
                        chatAttachAlertPhotoLayout.V();
                        return;
                    }
                    return;
                }
                return;
            default:
                ph.z7 z7Var = (ph.z7) this.f35965c;
                ph.f8 f8Var = z7Var.T;
                org.telegram.ui.Components.sl0 sl0Var = z7Var.f42663f;
                boolean canScrollVertically = sl0Var.canScrollVertically(1);
                if (canScrollVertically != this.f35964b) {
                    z7Var.f42665r.invalidate();
                    this.f35964b = canScrollVertically;
                }
                z7Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.g3) f8Var).containerView;
                viewGroup.invalidate();
                if (z7Var.f42660a == 6 && sl0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(sl0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.g3) f8Var).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.g3) f8Var).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
