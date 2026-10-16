package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class dg1 extends org.telegram.ui.Components.lm0 {
    public final gg1 f35014c;

    public dg1(gg1 gg1Var) {
        this.f35014c = gg1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        gg1 gg1Var = this.f35014c;
        if (gg1Var.f36207l0) {
            return 0;
        }
        return gg1Var.f36206k0;
    }

    @Override
    public final int j(int i10) {
        gg1 gg1Var = this.f35014c;
        if (i10 != gg1Var.f36203h0 && i10 != gg1Var.f36200e0) {
            if (i10 >= gg1Var.f36201f0 && i10 < gg1Var.f36202g0) {
                return 2;
            }
            if (i10 >= gg1Var.f36204i0 && i10 < gg1Var.f36205j0) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        boolean z10;
        View view = b1Var.f44838a;
        gg1 gg1Var = this.f35014c;
        kg1 kg1Var = gg1Var.f36214t0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i10 == gg1Var.f36200e0) {
                v3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == gg1Var.f36203h0) {
                v3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z11 = false;
        if (j(i10) == 2) {
            org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) view;
            qaVar.setTopic((TLRPC.TL_forumTopic) gg1Var.f36198c0.get(i10 - gg1Var.f36201f0));
            if (i10 != gg1Var.f36202g0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            qaVar.d = z10;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) gg1Var.f36199d0.get(i10 - gg1Var.f36204i0);
            hg1 hg1Var = (hg1) view;
            if (i10 != gg1Var.f36205j0 - 1) {
                z11 = true;
            }
            hg1Var.f36548a5 = z11;
            i11 = ((org.telegram.ui.ActionBar.m2) kg1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = kg1Var.f37415s.findTopic(kg1Var.f37380a, topicId);
            if (findTopic == null) {
                FileLog.d("cant find topic " + topicId);
                return;
            }
            hg1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
            hg1Var.setTopicIcon(findTopic);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        kg1 kg1Var = this.f35014c.f36214t0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? hg1Var = new hg1(kg1Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.m2) kg1Var).inPreviewMode;
                    hg1Var.f21550k0 = z10;
                    frameLayout = hg1Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.qa(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(frameLayout);
    }
}
