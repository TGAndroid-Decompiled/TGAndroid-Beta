package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class me1 extends org.telegram.ui.Components.hm0 {
    public final pe1 f39197c;

    public me1(pe1 pe1Var) {
        this.f39197c = pe1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45961f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        pe1 pe1Var = this.f39197c;
        if (pe1Var.f40132l0) {
            return 0;
        }
        return pe1Var.f40131k0;
    }

    @Override
    public final int j(int i10) {
        pe1 pe1Var = this.f39197c;
        if (i10 != pe1Var.f40128h0 && i10 != pe1Var.f40125e0) {
            if (i10 >= pe1Var.f40126f0 && i10 < pe1Var.f40127g0) {
                return 2;
            }
            if (i10 >= pe1Var.f40129i0 && i10 < pe1Var.f40130j0) {
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
        View view = b1Var.f45958a;
        pe1 pe1Var = this.f39197c;
        te1 te1Var = pe1Var.f40139t0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == pe1Var.f40125e0) {
                u3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == pe1Var.f40128h0) {
                u3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z11 = false;
        if (j(i10) == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            paVar.setTopic((TLRPC.TL_forumTopic) pe1Var.f40123c0.get(i10 - pe1Var.f40126f0));
            if (i10 != pe1Var.f40127g0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            paVar.d = z10;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) pe1Var.f40124d0.get(i10 - pe1Var.f40129i0);
            qe1 qe1Var = (qe1) view;
            if (i10 != pe1Var.f40130j0 - 1) {
                z11 = true;
            }
            qe1Var.f40408a5 = z11;
            i11 = ((org.telegram.ui.ActionBar.n2) te1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = te1Var.f41740s.findTopic(te1Var.f41705a, topicId);
            if (findTopic == null) {
                FileLog.d("cant find topic " + topicId);
                return;
            }
            qe1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
            qe1Var.setTopicIcon(findTopic);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        te1 te1Var = this.f39197c.f40139t0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? qe1Var = new qe1(te1Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.n2) te1Var).inPreviewMode;
                    qe1Var.f22858k0 = z10;
                    frameLayout = qe1Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.pa(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(frameLayout);
    }
}
