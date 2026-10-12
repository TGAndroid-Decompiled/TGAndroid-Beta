package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ag1 extends org.telegram.ui.Components.vm0 {
    public final dg1 f35798c;

    public ag1(dg1 dg1Var) {
        this.f35798c = dg1Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47893f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        dg1 dg1Var = this.f35798c;
        if (dg1Var.f36816l0) {
            return 0;
        }
        return dg1Var.f36815k0;
    }

    @Override
    public final int j(int i10) {
        dg1 dg1Var = this.f35798c;
        if (i10 != dg1Var.f36812h0 && i10 != dg1Var.f36809e0) {
            if (i10 >= dg1Var.f36810f0 && i10 < dg1Var.f36811g0) {
                return 2;
            }
            if (i10 >= dg1Var.f36813i0 && i10 < dg1Var.f36814j0) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        boolean z10;
        View view = d1Var.f47889a;
        dg1 dg1Var = this.f35798c;
        hg1 hg1Var = dg1Var.f36823t0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i10 == dg1Var.f36809e0) {
                v3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == dg1Var.f36812h0) {
                v3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z11 = false;
        if (j(i10) == 2) {
            org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) view;
            qaVar.setTopic((TLRPC.TL_forumTopic) dg1Var.f36807c0.get(i10 - dg1Var.f36810f0));
            if (i10 != dg1Var.f36811g0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            qaVar.d = z10;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) dg1Var.f36808d0.get(i10 - dg1Var.f36813i0);
            eg1 eg1Var = (eg1) view;
            if (i10 != dg1Var.f36814j0 - 1) {
                z11 = true;
            }
            eg1Var.f37090a5 = z11;
            i11 = ((org.telegram.ui.ActionBar.m2) hg1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = hg1Var.f38412s.findTopic(hg1Var.f38376a, topicId);
            if (findTopic == null) {
                FileLog.d("cant find topic " + topicId);
                return;
            }
            eg1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
            eg1Var.setTopicIcon(findTopic);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        hg1 hg1Var = this.f35798c.f36823t0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? eg1Var = new eg1(hg1Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.m2) hg1Var).inPreviewMode;
                    eg1Var.f22578k0 = z10;
                    frameLayout = eg1Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.qa(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.v3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(frameLayout);
    }
}
