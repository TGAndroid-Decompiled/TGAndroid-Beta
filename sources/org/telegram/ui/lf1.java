package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class lf1 extends org.telegram.ui.Components.ql0 {
    public final of1 f35759c;

    public lf1(of1 of1Var) {
        this.f35759c = of1Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        of1 of1Var = this.f35759c;
        if (of1Var.f36785i0) {
            return 0;
        }
        return of1Var.f36784h0;
    }

    @Override
    public final int j(int i10) {
        of1 of1Var = this.f35759c;
        if (i10 != of1Var.f36781e0 && i10 != of1Var.f36778b0) {
            if (i10 >= of1Var.f36779c0 && i10 < of1Var.f36780d0) {
                return 2;
            }
            if (i10 >= of1Var.f36782f0 && i10 < of1Var.f36783g0) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        boolean z4;
        View view = l1Var.f5774a;
        of1 of1Var = this.f35759c;
        sf1 sf1Var = of1Var.f36792q0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) view;
            if (i10 == of1Var.f36778b0) {
                t3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == of1Var.f36781e0) {
                t3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z10 = false;
        if (j(i10) == 2) {
            org.telegram.ui.Cells.na naVar = (org.telegram.ui.Cells.na) view;
            naVar.setTopic((TLRPC.TL_forumTopic) of1Var.W.get(i10 - of1Var.f36779c0));
            if (i10 != of1Var.f36780d0 - 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            naVar.d = z4;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) of1Var.f36777a0.get(i10 - of1Var.f36782f0);
            pf1 pf1Var = (pf1) view;
            if (i10 != of1Var.f36783g0 - 1) {
                z10 = true;
            }
            pf1Var.T4 = z10;
            i11 = ((org.telegram.ui.ActionBar.p2) sf1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = sf1Var.f38208s.findTopic(sf1Var.f38175a, topicId);
            if (findTopic == null) {
                FileLog.d("cant find topic " + topicId);
                return;
            }
            pf1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
            pf1Var.setTopicIcon(findTopic);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z4;
        sf1 sf1Var = this.f35759c.f36792q0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? pf1Var = new pf1(sf1Var, viewGroup.getContext(), true);
                    z4 = ((org.telegram.ui.ActionBar.p2) sf1Var).inPreviewMode;
                    pf1Var.f21587h0 = z4;
                    frameLayout = pf1Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.na(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.t3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new f2.w0(-1, -2));
        return new f2.l1(frameLayout);
    }
}
