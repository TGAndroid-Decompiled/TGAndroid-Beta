package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class bg1 extends org.telegram.ui.Components.ul0 {
    public final eg1 f31259c;

    public bg1(eg1 eg1Var) {
        this.f31259c = eg1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        eg1 eg1Var = this.f31259c;
        if (eg1Var.f32198l0) {
            return 0;
        }
        return eg1Var.f32197k0;
    }

    @Override
    public final int j(int i10) {
        eg1 eg1Var = this.f31259c;
        if (i10 != eg1Var.f32194h0 && i10 != eg1Var.f32191e0) {
            if (i10 >= eg1Var.f32192f0 && i10 < eg1Var.f32193g0) {
                return 2;
            }
            if (i10 >= eg1Var.f32195i0 && i10 < eg1Var.f32196j0) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        View view = c1Var.f41610a;
        eg1 eg1Var = this.f31259c;
        ig1 ig1Var = eg1Var.f32205t0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == eg1Var.f32191e0) {
                u3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == eg1Var.f32194h0) {
                u3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z11 = false;
        if (j(i10) == 2) {
            org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
            uaVar.setTopic((TLRPC.TL_forumTopic) eg1Var.f32189c0.get(i10 - eg1Var.f32192f0));
            if (i10 != eg1Var.f32193g0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            uaVar.d = z10;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) eg1Var.f32190d0.get(i10 - eg1Var.f32195i0);
            fg1 fg1Var = (fg1) view;
            if (i10 != eg1Var.f32196j0 - 1) {
                z11 = true;
            }
            fg1Var.W4 = z11;
            i11 = ((org.telegram.ui.ActionBar.p2) ig1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = ig1Var.f33716s.findTopic(ig1Var.f33681a, topicId);
            if (findTopic == null) {
                FileLog.d("cant find topic " + topicId);
                return;
            }
            fg1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
            fg1Var.setTopicIcon(findTopic);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        ig1 ig1Var = this.f31259c.f32205t0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? fg1Var = new fg1(ig1Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.p2) ig1Var).inPreviewMode;
                    fg1Var.f19802k0 = z10;
                    frameLayout = fg1Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.ua(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(frameLayout);
    }
}
