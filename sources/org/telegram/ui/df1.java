package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class df1 extends org.telegram.ui.Components.rl0 {
    public final gf1 f33630c;

    public df1(gf1 gf1Var) {
        this.f33630c = gf1Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5788f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        gf1 gf1Var = this.f33630c;
        if (gf1Var.f34603i0) {
            return 0;
        }
        return gf1Var.f34602h0;
    }

    @Override
    public final int j(int i10) {
        gf1 gf1Var = this.f33630c;
        if (i10 != gf1Var.f34599e0 && i10 != gf1Var.f34596b0) {
            if (i10 >= gf1Var.f34597c0 && i10 < gf1Var.f34598d0) {
                return 2;
            }
            if (i10 >= gf1Var.f34600f0 && i10 < gf1Var.f34601g0) {
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
        View view = l1Var.f5785a;
        gf1 gf1Var = this.f33630c;
        kf1 kf1Var = gf1Var.f34610q0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == gf1Var.f34596b0) {
                u3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == gf1Var.f34599e0) {
                u3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z10 = false;
        if (j(i10) == 2) {
            org.telegram.ui.Cells.oa oaVar = (org.telegram.ui.Cells.oa) view;
            oaVar.setTopic((TLRPC.TL_forumTopic) gf1Var.W.get(i10 - gf1Var.f34597c0));
            if (i10 != gf1Var.f34598d0 - 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            oaVar.d = z4;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) gf1Var.f34595a0.get(i10 - gf1Var.f34600f0);
            hf1 hf1Var = (hf1) view;
            if (i10 != gf1Var.f34601g0 - 1) {
                z10 = true;
            }
            hf1Var.T4 = z10;
            i11 = ((org.telegram.ui.ActionBar.p2) kf1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = kf1Var.f35701s.findTopic(kf1Var.f35668a, topicId);
            if (findTopic == null) {
                FileLog.d("cant find topic " + topicId);
                return;
            }
            hf1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
            hf1Var.setTopicIcon(findTopic);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z4;
        kf1 kf1Var = this.f33630c.f34610q0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? hf1Var = new hf1(kf1Var, viewGroup.getContext(), true);
                    z4 = ((org.telegram.ui.ActionBar.p2) kf1Var).inPreviewMode;
                    hf1Var.f21654h0 = z4;
                    frameLayout = hf1Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.oa(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new f2.w0(-1, -2));
        return new f2.l1(frameLayout);
    }
}
