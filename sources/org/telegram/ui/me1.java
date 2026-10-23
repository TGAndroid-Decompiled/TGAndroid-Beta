package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public final class me1 extends pg.b {
    public final ye1 d;

    public me1(ye1 ye1Var) {
        this.d = ye1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46346f;
        if (i10 != 0 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        ye1 ye1Var = this.d;
        ye1Var.getClass();
        return ye1Var.f43795b;
    }

    @Override
    public final int h() {
        return F().size() + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == h() - 1) {
            return 2;
        }
        return ((oe1) this.d.f43795b.get(i10)).f44713a;
    }

    @Override
    public final void l() {
        this.d.f43798c = h();
        super.l();
    }

    @Override
    public final void v(s4.b1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.me1.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        ye1 ye1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                le1 le1Var = new le1(this, ye1Var.getParentActivity());
                ye1Var.E0 = le1Var;
                return new s4.b1(le1Var);
            }
            org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(viewGroup.getContext(), null);
            b10Var.setViewType(24);
            b10Var.setIsSingleCell(true);
            b10Var.f24923w = true;
            return new s4.b1(b10Var);
        }
        ue1 ue1Var = new ue1(ye1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.o2) ye1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -ye1Var.f43792a);
            ue1Var.setForumIcon(og.d.d(og.a.f17793k[0], ""));
            if (!isBotForumWithEditableTopics) {
                i12 = R.string.BotForumAskForStartOffNewChatTitle;
            } else {
                i12 = R.string.BotForumAskForStartNewChatTitle;
            }
            ue1Var.setTitleOverride(LocaleController.getString(i12));
            if (!isBotForumWithEditableTopics) {
                i13 = R.string.BotForumAskForStartOffNewChatForward;
            } else {
                i13 = R.string.BotForumAskForStartNewChatForward;
            }
            ue1Var.setCustomMessage(LocaleController.getString(i13));
        }
        z10 = ((org.telegram.ui.ActionBar.o2) ye1Var).inPreviewMode;
        ue1Var.f22968k0 = z10;
        ue1Var.setArchivedPullAnimation(ye1Var.f43835w);
        return new s4.b1(ue1Var);
    }
}
