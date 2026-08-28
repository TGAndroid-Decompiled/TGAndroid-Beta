package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class oe1 extends org.telegram.ui.Components.vk0 {
    public final re1 f41131c;

    public oe1(re1 re1Var) {
        this.f41131c = re1Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 3 && i9 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        re1 re1Var = this.f41131c;
        if (re1Var.f42400h0) {
            return 0;
        }
        return re1Var.f42399g0;
    }

    @Override
    public final int j(int i9) {
        re1 re1Var = this.f41131c;
        if (i9 != re1Var.f42396d0 && i9 != re1Var.f42393a0) {
            if (i9 >= re1Var.f42394b0 && i9 < re1Var.f42395c0) {
                return 2;
            }
            if (i9 >= re1Var.f42397e0 && i9 < re1Var.f42398f0) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        boolean z10;
        View view = q1Var.f5501a;
        re1 re1Var = this.f41131c;
        we1 we1Var = re1Var.f42407p0;
        if (j(i9) == 1) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i9 == re1Var.f42393a0) {
                v3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i9 == re1Var.f42396d0) {
                v3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z11 = false;
        if (j(i9) == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            paVar.setTopic((TLRPC.TL_forumTopic) re1Var.V.get(i9 - re1Var.f42394b0));
            if (i9 != re1Var.f42395c0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            paVar.d = z10;
        }
        if (j(i9) == 3) {
            MessageObject messageObject = (MessageObject) re1Var.W.get(i9 - re1Var.f42397e0);
            se1 se1Var = (se1) view;
            if (i9 != re1Var.f42398f0 - 1) {
                z11 = true;
            }
            se1Var.S4 = z11;
            i10 = ((org.telegram.ui.ActionBar.o2) we1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i10, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = we1Var.f43774s.findTopic(we1Var.f43741a, topicId);
            if (findTopic == null) {
                FileLog.d("cant find topic " + topicId);
                return;
            }
            se1Var.X(findTopic, messageObject.getDialogId(), messageObject, false, false);
            se1Var.setTopicIcon(findTopic);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout frameLayout;
        boolean z10;
        we1 we1Var = this.f41131c.f42407p0;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    ?? se1Var = new se1(we1Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.o2) we1Var).inPreviewMode;
                    se1Var.f24983g0 = z10;
                    frameLayout = se1Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.pa(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new f2.a1(-1, -2));
        return new f2.q1(frameLayout);
    }
}
