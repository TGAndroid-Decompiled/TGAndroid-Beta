package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class eg1 extends org.telegram.ui.Components.lm0 {
    public final hg1 f35570c;

    public eg1(hg1 hg1Var) {
        this.f35570c = hg1Var;
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
        hg1 hg1Var = this.f35570c;
        if (hg1Var.f36807l0) {
            return 0;
        }
        return hg1Var.f36806k0;
    }

    @Override
    public final int j(int i10) {
        hg1 hg1Var = this.f35570c;
        if (i10 != hg1Var.f36803h0 && i10 != hg1Var.f36800e0) {
            if (i10 >= hg1Var.f36801f0 && i10 < hg1Var.f36802g0) {
                return 2;
            }
            if (i10 >= hg1Var.f36804i0 && i10 < hg1Var.f36805j0) {
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
        hg1 hg1Var = this.f35570c;
        lg1 lg1Var = hg1Var.f36814t0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (i10 == hg1Var.f36800e0) {
                v3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == hg1Var.f36803h0) {
                v3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z11 = false;
        if (j(i10) == 2) {
            org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) view;
            qaVar.setTopic((TLRPC.TL_forumTopic) hg1Var.f36798c0.get(i10 - hg1Var.f36801f0));
            if (i10 != hg1Var.f36802g0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            qaVar.d = z10;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) hg1Var.f36799d0.get(i10 - hg1Var.f36804i0);
            ig1 ig1Var = (ig1) view;
            if (i10 != hg1Var.f36805j0 - 1) {
                z11 = true;
            }
            ig1Var.f37117a5 = z11;
            i11 = ((org.telegram.ui.ActionBar.m2) lg1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = lg1Var.f37992s.findTopic(lg1Var.f37957a, topicId);
            if (findTopic == null) {
                FileLog.d("cant find topic " + topicId);
                return;
            }
            ig1Var.Y(findTopic, messageObject.getDialogId(), messageObject, false, false);
            ig1Var.setTopicIcon(findTopic);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        lg1 lg1Var = this.f35570c.f36814t0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? ig1Var = new ig1(lg1Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.m2) lg1Var).inPreviewMode;
                    ig1Var.f21853k0 = z10;
                    frameLayout = ig1Var;
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
