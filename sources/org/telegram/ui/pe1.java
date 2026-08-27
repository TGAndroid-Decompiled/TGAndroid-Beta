package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class pe1 extends org.telegram.ui.Components.yk0 {

    public final se1 f41337c;

    public pe1(se1 se1Var) {
        this.f41337c = se1Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return i10 == 3 || i10 == 2;
    }

    @Override
    public final int h() {
        se1 se1Var = this.f41337c;
        if (se1Var.f42614h0) {
            return 0;
        }
        return se1Var.f42613g0;
    }

    @Override
    public final int j(int i10) {
        se1 se1Var = this.f41337c;
        if (i10 == se1Var.f42610d0 || i10 == se1Var.f42607a0) {
            return 1;
        }
        if (i10 < se1Var.f42608b0 || i10 >= se1Var.f42609c0) {
            return (i10 < se1Var.f42611e0 || i10 >= se1Var.f42612f0) ? 0 : 3;
        }
        return 2;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        View view = o1Var.f5789a;
        se1 se1Var = this.f41337c;
        we1 we1Var = se1Var.f42621p0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
            if (i10 == se1Var.f42607a0) {
                s3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == se1Var.f42610d0) {
                s3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        if (j(i10) == 2) {
            org.telegram.ui.Cells.la laVar = (org.telegram.ui.Cells.la) view;
            laVar.setTopic((TLRPC.TL_forumTopic) se1Var.V.get(i10 - se1Var.f42608b0));
            laVar.d = i10 != se1Var.f42609c0 - 1;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) se1Var.W.get(i10 - se1Var.f42611e0);
            te1 te1Var = (te1) view;
            te1Var.S4 = i10 != se1Var.f42612f0 - 1;
            long topicId = MessageObject.getTopicId(((org.telegram.ui.ActionBar.n2) we1Var).currentAccount, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic tL_forumTopicFindTopic = we1Var.f43752s.findTopic(we1Var.f43719a, topicId);
            if (tL_forumTopicFindTopic != null) {
                te1Var.Y(tL_forumTopicFindTopic, messageObject.getDialogId(), messageObject, false, false);
                te1Var.setTopicIcon(tL_forumTopicFindTopic);
            } else {
                FileLog.d("cant find topic " + topicId);
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View s3Var;
        we1 we1Var = this.f41337c.f42621p0;
        if (i10 == 1) {
            s3Var = new org.telegram.ui.Cells.s3(viewGroup.getContext(), null);
        } else if (i10 == 2) {
            s3Var = new org.telegram.ui.Cells.la(viewGroup.getContext());
        } else {
            if (i10 != 3) {
                throw new RuntimeException("unsupported view type");
            }
            te1 te1Var = new te1(we1Var, viewGroup.getContext(), true);
            te1Var.f24866g0 = ((org.telegram.ui.ActionBar.n2) we1Var).inPreviewMode;
            s3Var = te1Var;
        }
        s3Var.setLayoutParams(new f2.y0(-1, -2));
        return new org.telegram.ui.Components.lk0(s3Var);
    }
}
