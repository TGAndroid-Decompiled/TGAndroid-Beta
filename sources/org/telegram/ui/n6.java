package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class n6 extends f2.z0 {
    public final int f36391a;
    public boolean f36392b;
    public final NotificationCenter.NotificationCenterDelegate f36393c;

    public n6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f36391a = i10;
        this.f36393c = notificationCenterDelegate;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        int i11;
        org.telegram.ui.Components.dl0 dl0Var;
        int topScrollOffset;
        int topScrollOffset2;
        boolean z4;
        switch (this.f36391a) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f36393c;
                org.telegram.ui.Components.ol olVar = chatAttachAlertPhotoLayout.B;
                org.telegram.ui.Components.li liVar = chatAttachAlertPhotoLayout.f24282b;
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
                    if (((liVar.Y1[0] - backgroundPaddingTop) - i12) + backgroundPaddingTop < (liVar.L0.getAlpha() * liVar.L0.getMeasuredHeight()) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (dl0Var = (org.telegram.ui.Components.dl0) olVar.K(0)) != null) {
                        View view = dl0Var.f5774a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            olVar.v0(0, top2 - topScrollOffset2, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ph.y7 y7Var = (ph.y7) this.f36393c;
                org.telegram.ui.Components.rl0 rl0Var = y7Var.f42661f;
                ph.e8 e8Var = y7Var.T;
                boolean z10 = true;
                if (i10 == 1) {
                    z4 = ((org.telegram.ui.ActionBar.g3) e8Var).keyboardVisible;
                    if (z4 && y7Var.f42666x != null) {
                        e8Var.f1();
                    }
                }
                if (i10 == 0) {
                    y7Var.P = !rl0Var.canScrollVertically(-1);
                    rl0Var.canScrollVertically(1);
                }
                if (i10 == 0) {
                    z10 = false;
                }
                y7Var.J = z10;
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
        switch (this.f36391a) {
            case 0:
                d7 d7Var = (d7) this.f36393c;
                if (d7Var.f33351c.L0() <= 0 && !d7.a0(d7Var).s()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                d7.b0(d7Var, z4);
                if (this.f36392b != d7Var.S.Z()) {
                    this.f36392b = d7Var.S.Z();
                    d7Var.S.invalidate();
                    return;
                }
                return;
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f36393c;
                org.telegram.ui.Components.li liVar = chatAttachAlertPhotoLayout.f24282b;
                org.telegram.ui.Components.ol olVar = chatAttachAlertPhotoLayout.B;
                if (olVar.getChildCount() > 0) {
                    liVar.X1(chatAttachAlertPhotoLayout, i11);
                    float f10 = 0.0f;
                    if (chatAttachAlertPhotoLayout.D.h() > 30) {
                        boolean z10 = this.f36392b;
                        boolean z11 = liVar.O;
                        if (z10 != z11) {
                            this.f36392b = z11;
                            ViewPropertyAnimator animate = olVar.getFastScroll().animate();
                            if (this.f36392b) {
                                f10 = 1.0f;
                            }
                            animate.alpha(f10).setDuration(100L).start();
                        }
                    } else {
                        olVar.getFastScroll().setAlpha(0.0f);
                    }
                    if (i11 != 0) {
                        chatAttachAlertPhotoLayout.V();
                        return;
                    }
                    return;
                }
                return;
            default:
                ph.y7 y7Var = (ph.y7) this.f36393c;
                ph.e8 e8Var = y7Var.T;
                org.telegram.ui.Components.rl0 rl0Var = y7Var.f42661f;
                boolean canScrollVertically = rl0Var.canScrollVertically(1);
                if (canScrollVertically != this.f36392b) {
                    y7Var.f42663r.invalidate();
                    this.f36392b = canScrollVertically;
                }
                y7Var.e.invalidate();
                viewGroup = ((org.telegram.ui.ActionBar.g3) e8Var).containerView;
                viewGroup.invalidate();
                if (y7Var.f42658a == 6 && rl0Var.getChildCount() > 0) {
                    int R = RecyclerView.R(rl0Var.getChildAt(0));
                    i12 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                    if (R >= MessagesController.getInstance(i12).getStoriesController().L.size()) {
                        i13 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                        MessagesController.getInstance(i13).getStoriesController().P();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
