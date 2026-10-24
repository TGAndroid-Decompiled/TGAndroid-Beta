package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class pe1 extends org.telegram.ui.Components.km0 {
    public final se1 f40520c;

    public pe1(se1 se1Var) {
        this.f40520c = se1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46345f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        se1 se1Var = this.f40520c;
        if (se1Var.f41377l0) {
            return 0;
        }
        return se1Var.f41376k0;
    }

    @Override
    public final int j(int i10) {
        se1 se1Var = this.f40520c;
        if (i10 != se1Var.f41373h0 && i10 != se1Var.f41370e0) {
            if (i10 >= se1Var.f41371f0 && i10 < se1Var.f41372g0) {
                return 2;
            }
            if (i10 >= se1Var.f41374i0 && i10 < se1Var.f41375j0) {
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
        View view = b1Var.f46342a;
        se1 se1Var = this.f40520c;
        xe1 xe1Var = se1Var.f41384t0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == se1Var.f41370e0) {
                u3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == se1Var.f41373h0) {
                u3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z11 = false;
        if (j(i10) == 2) {
            org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) view;
            qaVar.setTopic((TLRPC.TL_forumTopic) se1Var.f41368c0.get(i10 - se1Var.f41371f0));
            if (i10 != se1Var.f41372g0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            qaVar.d = z10;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) se1Var.f41369d0.get(i10 - se1Var.f41374i0);
            te1 te1Var = (te1) view;
            if (i10 != se1Var.f41375j0 - 1) {
                z11 = true;
            }
            te1Var.f42025a5 = z11;
            i11 = ((org.telegram.ui.ActionBar.o2) xe1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = xe1Var.f43583s.findTopic(xe1Var.f43545a, topicId);
            if (findTopic == null) {
                FileLog.d("cant find topic " + topicId);
                return;
            }
            te1Var.X(findTopic, messageObject.getDialogId(), messageObject, false, false);
            te1Var.setTopicIcon(findTopic);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        xe1 xe1Var = this.f40520c.f41384t0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? te1Var = new te1(xe1Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.o2) xe1Var).inPreviewMode;
                    te1Var.f22969k0 = z10;
                    frameLayout = te1Var;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.qa(viewGroup.getContext());
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.u3(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(frameLayout);
    }
}
