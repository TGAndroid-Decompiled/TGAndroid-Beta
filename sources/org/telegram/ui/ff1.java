package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ff1 extends org.telegram.ui.Components.sl0 {
    public final if1 f36872c;

    public ff1(if1 if1Var) {
        this.f36872c = if1Var;
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
        if1 if1Var = this.f36872c;
        if (if1Var.f37842i0) {
            return 0;
        }
        return if1Var.f37841h0;
    }

    @Override
    public final int j(int i10) {
        if1 if1Var = this.f36872c;
        if (i10 != if1Var.f37838e0 && i10 != if1Var.f37835b0) {
            if (i10 >= if1Var.f37836c0 && i10 < if1Var.f37837d0) {
                return 2;
            }
            if (i10 >= if1Var.f37839f0 && i10 < if1Var.f37840g0) {
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
        if1 if1Var = this.f36872c;
        mf1 mf1Var = if1Var.f37849q0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == if1Var.f37835b0) {
                u3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == if1Var.f37838e0) {
                u3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z10 = false;
        if (j(i10) == 2) {
            org.telegram.ui.Cells.oa oaVar = (org.telegram.ui.Cells.oa) view;
            oaVar.setTopic((TLRPC.TL_forumTopic) if1Var.W.get(i10 - if1Var.f37836c0));
            if (i10 != if1Var.f37837d0 - 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            oaVar.d = z4;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) if1Var.f37834a0.get(i10 - if1Var.f37839f0);
            jf1 jf1Var = (jf1) view;
            if (i10 != if1Var.f37840g0 - 1) {
                z10 = true;
            }
            jf1Var.T4 = z10;
            i11 = ((org.telegram.ui.ActionBar.p2) mf1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = mf1Var.f39136s.findTopic(mf1Var.f39102a, topicId);
            if (findTopic == null) {
                FileLog.d("cant find topic " + topicId);
                return;
            }
            jf1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
            jf1Var.setTopicIcon(findTopic);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z4;
        mf1 mf1Var = this.f36872c.f37849q0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? jf1Var = new jf1(mf1Var, viewGroup.getContext(), true);
                    z4 = ((org.telegram.ui.ActionBar.p2) mf1Var).inPreviewMode;
                    jf1Var.f23445h0 = z4;
                    frameLayout = jf1Var;
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
