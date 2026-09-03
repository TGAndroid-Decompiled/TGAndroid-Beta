package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class lf1 extends org.telegram.ui.Components.rl0 {
    public final of1 f38631c;

    public lf1(of1 of1Var) {
        this.f38631c = of1Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        of1 of1Var = this.f38631c;
        if (of1Var.f39699i0) {
            return 0;
        }
        return of1Var.f39698h0;
    }

    @Override
    public final int j(int i10) {
        of1 of1Var = this.f38631c;
        if (i10 != of1Var.f39695e0 && i10 != of1Var.f39692b0) {
            if (i10 >= of1Var.f39693c0 && i10 < of1Var.f39694d0) {
                return 2;
            }
            if (i10 >= of1Var.f39696f0 && i10 < of1Var.f39697g0) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        boolean z4;
        View view = m1Var.f5875a;
        of1 of1Var = this.f38631c;
        sf1 sf1Var = of1Var.f39706q0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == of1Var.f39692b0) {
                u3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == of1Var.f39695e0) {
                u3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z10 = false;
        if (j(i10) == 2) {
            org.telegram.ui.Cells.oa oaVar = (org.telegram.ui.Cells.oa) view;
            oaVar.setTopic((TLRPC.TL_forumTopic) of1Var.W.get(i10 - of1Var.f39693c0));
            if (i10 != of1Var.f39694d0 - 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            oaVar.d = z4;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) of1Var.f39691a0.get(i10 - of1Var.f39696f0);
            pf1 pf1Var = (pf1) view;
            if (i10 != of1Var.f39697g0 - 1) {
                z10 = true;
            }
            pf1Var.T4 = z10;
            i11 = ((org.telegram.ui.ActionBar.p2) sf1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = sf1Var.f41222s.findTopic(sf1Var.f41188a, topicId);
            if (findTopic == null) {
                FileLog.d("cant find topic " + topicId);
                return;
            }
            pf1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
            pf1Var.setTopicIcon(findTopic);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z4;
        sf1 sf1Var = this.f38631c.f39706q0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? pf1Var = new pf1(sf1Var, viewGroup.getContext(), true);
                    z4 = ((org.telegram.ui.ActionBar.p2) sf1Var).inPreviewMode;
                    pf1Var.f23447h0 = z4;
                    frameLayout = pf1Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.oa(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new f2.x0(-1, -2));
        return new f2.m1(frameLayout);
    }
}
