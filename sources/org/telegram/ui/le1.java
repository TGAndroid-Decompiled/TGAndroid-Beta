package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public final class le1 extends pg.b {
    public final xe1 d;

    public le1(xe1 xe1Var) {
        this.d = xe1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46345f;
        if (i10 != 0 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        xe1 xe1Var = this.d;
        xe1Var.getClass();
        return xe1Var.f43548b;
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
        return ((ne1) this.d.f43548b.get(i10)).f44712a;
    }

    @Override
    public final void l() {
        this.d.f43551c = h();
        super.l();
    }

    @Override
    public final void v(s4.b1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.le1.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        xe1 xe1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                ke1 ke1Var = new ke1(this, xe1Var.getParentActivity());
                xe1Var.E0 = ke1Var;
                return new s4.b1(ke1Var);
            }
            org.telegram.ui.Components.z00 z00Var = new org.telegram.ui.Components.z00(viewGroup.getContext(), null);
            z00Var.setViewType(24);
            z00Var.setIsSingleCell(true);
            z00Var.f33104w = true;
            return new s4.b1(z00Var);
        }
        te1 te1Var = new te1(xe1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.o2) xe1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -xe1Var.f43545a);
            te1Var.setForumIcon(og.d.d(og.a.f17793k[0], ""));
            if (!isBotForumWithEditableTopics) {
                i12 = R.string.BotForumAskForStartOffNewChatTitle;
            } else {
                i12 = R.string.BotForumAskForStartNewChatTitle;
            }
            te1Var.setTitleOverride(LocaleController.getString(i12));
            if (!isBotForumWithEditableTopics) {
                i13 = R.string.BotForumAskForStartOffNewChatForward;
            } else {
                i13 = R.string.BotForumAskForStartNewChatForward;
            }
            te1Var.setCustomMessage(LocaleController.getString(i13));
        }
        z10 = ((org.telegram.ui.ActionBar.o2) xe1Var).inPreviewMode;
        te1Var.f22969k0 = z10;
        te1Var.setArchivedPullAnimation(xe1Var.f43588w);
        return new s4.b1(te1Var);
    }
}
