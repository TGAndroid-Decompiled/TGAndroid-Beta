package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ke1 extends org.telegram.ui.Components.im0 {
    public final ne1 f38592c;

    public ke1(ne1 ne1Var) {
        this.f38592c = ne1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45920f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        ne1 ne1Var = this.f38592c;
        if (ne1Var.f39574l0) {
            return 0;
        }
        return ne1Var.f39573k0;
    }

    @Override
    public final int j(int i10) {
        ne1 ne1Var = this.f38592c;
        if (i10 != ne1Var.f39570h0 && i10 != ne1Var.f39567e0) {
            if (i10 >= ne1Var.f39568f0 && i10 < ne1Var.f39569g0) {
                return 2;
            }
            if (i10 >= ne1Var.f39571i0 && i10 < ne1Var.f39572j0) {
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
        View view = b1Var.f45917a;
        ne1 ne1Var = this.f38592c;
        re1 re1Var = ne1Var.f39581t0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == ne1Var.f39567e0) {
                u3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == ne1Var.f39570h0) {
                u3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z11 = false;
        if (j(i10) == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            paVar.setTopic((TLRPC.TL_forumTopic) ne1Var.f39565c0.get(i10 - ne1Var.f39568f0));
            if (i10 != ne1Var.f39569g0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            paVar.d = z10;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) ne1Var.f39566d0.get(i10 - ne1Var.f39571i0);
            oe1 oe1Var = (oe1) view;
            if (i10 != ne1Var.f39572j0 - 1) {
                z11 = true;
            }
            oe1Var.f39863a5 = z11;
            i11 = ((org.telegram.ui.ActionBar.n2) re1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = re1Var.f41183s.findTopic(re1Var.f41148a, topicId);
            if (findTopic == null) {
                FileLog.d("cant find topic " + topicId);
                return;
            }
            oe1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
            oe1Var.setTopicIcon(findTopic);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        re1 re1Var = this.f38592c.f39581t0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? oe1Var = new oe1(re1Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.n2) re1Var).inPreviewMode;
                    oe1Var.f22855k0 = z10;
                    frameLayout = oe1Var;
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
