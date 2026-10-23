package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class qe1 extends org.telegram.ui.Components.lm0 {
    public final te1 f40792c;

    public qe1(te1 te1Var) {
        this.f40792c = te1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46346f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        te1 te1Var = this.f40792c;
        if (te1Var.f41985l0) {
            return 0;
        }
        return te1Var.f41984k0;
    }

    @Override
    public final int j(int i10) {
        te1 te1Var = this.f40792c;
        if (i10 != te1Var.f41981h0 && i10 != te1Var.f41978e0) {
            if (i10 >= te1Var.f41979f0 && i10 < te1Var.f41980g0) {
                return 2;
            }
            if (i10 >= te1Var.f41982i0 && i10 < te1Var.f41983j0) {
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
        View view = b1Var.f46343a;
        te1 te1Var = this.f40792c;
        ye1 ye1Var = te1Var.f41992t0;
        if (j(i10) == 1) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == te1Var.f41978e0) {
                u3Var.setText(LocaleController.getString(R.string.Topics));
            }
            if (i10 == te1Var.f41981h0) {
                u3Var.setText(LocaleController.getString(R.string.SearchMessages));
            }
        }
        boolean z11 = false;
        if (j(i10) == 2) {
            org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) view;
            qaVar.setTopic((TLRPC.TL_forumTopic) te1Var.f41976c0.get(i10 - te1Var.f41979f0));
            if (i10 != te1Var.f41980g0 - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            qaVar.d = z10;
        }
        if (j(i10) == 3) {
            MessageObject messageObject = (MessageObject) te1Var.f41977d0.get(i10 - te1Var.f41982i0);
            ue1 ue1Var = (ue1) view;
            if (i10 != te1Var.f41983j0 - 1) {
                z11 = true;
            }
            ue1Var.f42403a5 = z11;
            i11 = ((org.telegram.ui.ActionBar.o2) ye1Var).currentAccount;
            long topicId = MessageObject.getTopicId(i11, messageObject.messageOwner, true);
            if (topicId == 0) {
                topicId = 1;
            }
            TLRPC.TL_forumTopic findTopic = ye1Var.f43830s.findTopic(ye1Var.f43792a, topicId);
            if (findTopic == null) {
                FileLog.d("cant find topic " + topicId);
                return;
            }
            ue1Var.X(findTopic, messageObject.getDialogId(), messageObject, false, false);
            ue1Var.setTopicIcon(findTopic);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        boolean z10;
        ye1 ye1Var = this.f40792c.f41992t0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    ?? ue1Var = new ue1(ye1Var, viewGroup.getContext(), true);
                    z10 = ((org.telegram.ui.ActionBar.o2) ye1Var).inPreviewMode;
                    ue1Var.f22968k0 = z10;
                    frameLayout = ue1Var;
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
