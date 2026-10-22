package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public final class ge1 extends pg.b {
    public final re1 d;

    public ge1(re1 re1Var) {
        this.d = re1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45923f;
        if (i10 != 0 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        re1 re1Var = this.d;
        re1Var.getClass();
        return re1Var.f41154b;
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
        return ((ie1) this.d.f41154b.get(i10)).f44299a;
    }

    @Override
    public final void l() {
        this.d.f41157c = h();
        super.l();
    }

    @Override
    public final void v(s4.b1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ge1.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        re1 re1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                fe1 fe1Var = new fe1(this, re1Var.getParentActivity());
                re1Var.E0 = fe1Var;
                return new s4.b1(fe1Var);
            }
            org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(viewGroup.getContext(), null);
            b10Var.setViewType(24);
            b10Var.setIsSingleCell(true);
            b10Var.f24777w = true;
            return new s4.b1(b10Var);
        }
        oe1 oe1Var = new oe1(re1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) re1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -re1Var.f41151a);
            oe1Var.setForumIcon(og.d.d(og.a.f17730k[0], ""));
            if (!isBotForumWithEditableTopics) {
                i12 = R.string.BotForumAskForStartOffNewChatTitle;
            } else {
                i12 = R.string.BotForumAskForStartNewChatTitle;
            }
            oe1Var.setTitleOverride(LocaleController.getString(i12));
            if (!isBotForumWithEditableTopics) {
                i13 = R.string.BotForumAskForStartOffNewChatForward;
            } else {
                i13 = R.string.BotForumAskForStartNewChatForward;
            }
            oe1Var.setCustomMessage(LocaleController.getString(i13));
        }
        z10 = ((org.telegram.ui.ActionBar.n2) re1Var).inPreviewMode;
        oe1Var.f22858k0 = z10;
        oe1Var.setArchivedPullAnimation(re1Var.f41191w);
        return new s4.b1(oe1Var);
    }
}
