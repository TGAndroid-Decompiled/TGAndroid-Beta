package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class pf1 extends org.telegram.ui.Components.wl0 {
    public final sf1 f36515c;

    public pf1(sf1 sf1Var) {
        this.f36515c = sf1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42962f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        sf1 sf1Var = this.f36515c;
        if (sf1Var.f37745l0) {
            return 0;
        }
        return sf1Var.f37744k0;
    }

    @Override
    public final int j(int i10) {
        sf1 sf1Var = this.f36515c;
        if (i10 != sf1Var.f37741h0 && i10 != sf1Var.f37738e0) {
            if (i10 >= sf1Var.f37739f0 && i10 < sf1Var.f37740g0) {
                return 2;
            }
            if (i10 >= sf1Var.f37742i0 && i10 < sf1Var.f37743j0) {
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
        View view = c1Var.f42959a;
        sf1 sf1Var = this.f36515c;
        wf1 wf1Var = sf1Var.f37752t0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i10 == sf1Var.f37738e0) {
                v3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == sf1Var.f37741h0) {
                v3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z11 = false;
        if (j(i10) == 2) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            saVar.setTopic((TLRPC.TL_forumTopic) sf1Var.f37736c0.get(i10 - sf1Var.f37739f0));
            if (i10 != sf1Var.f37740g0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            saVar.d = z10;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) sf1Var.f37737d0.get(i10 - sf1Var.f37742i0);
            tf1 tf1Var = (tf1) view;
            if (i10 != sf1Var.f37743j0 - 1) {
                z11 = true;
            }
            tf1Var.W4 = z11;
            i11 = ((org.telegram.ui.ActionBar.m2) wf1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = wf1Var.f39342s.findTopic(wf1Var.f39307a, topicId);
            if (findTopic == null) {
                FileLog.d("cant find topic " + topicId);
                return;
            }
            tf1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
            tf1Var.setTopicIcon(findTopic);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        wf1 wf1Var = this.f36515c.f37752t0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? tf1Var = new tf1(wf1Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.m2) wf1Var).inPreviewMode;
                    tf1Var.f20970k0 = z10;
                    frameLayout = tf1Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.sa(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(frameLayout);
    }
}
