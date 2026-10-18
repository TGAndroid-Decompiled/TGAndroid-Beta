package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public final class ie1 extends pg.b {
    public final te1 d;

    public ie1(te1 te1Var) {
        this.d = te1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45913f;
        if (i10 != 0 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        te1 te1Var = this.d;
        te1Var.getClass();
        return te1Var.f41673b;
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
        return ((ke1) this.d.f41673b.get(i10)).f44291a;
    }

    @Override
    public final void l() {
        this.d.f41676c = h();
        super.l();
    }

    @Override
    public final void v(s4.b1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ie1.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        te1 te1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                he1 he1Var = new he1(this, te1Var.getParentActivity());
                te1Var.E0 = he1Var;
                return new s4.b1(he1Var);
            }
            org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(viewGroup.getContext(), null);
            b10Var.setViewType(24);
            b10Var.setIsSingleCell(true);
            b10Var.f24767w = true;
            return new s4.b1(b10Var);
        }
        qe1 qe1Var = new qe1(te1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) te1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -te1Var.f41670a);
            qe1Var.setForumIcon(og.d.d(og.a.f17729k[0], ""));
            if (!isBotForumWithEditableTopics) {
                i12 = R.string.BotForumAskForStartOffNewChatTitle;
            } else {
                i12 = R.string.BotForumAskForStartNewChatTitle;
            }
            qe1Var.setTitleOverride(LocaleController.getString(i12));
            if (!isBotForumWithEditableTopics) {
                i13 = R.string.BotForumAskForStartOffNewChatForward;
            } else {
                i13 = R.string.BotForumAskForStartNewChatForward;
            }
            qe1Var.setCustomMessage(LocaleController.getString(i13));
        }
        z10 = ((org.telegram.ui.ActionBar.n2) te1Var).inPreviewMode;
        qe1Var.f22851k0 = z10;
        qe1Var.setArchivedPullAnimation(te1Var.f41710w);
        return new s4.b1(qe1Var);
    }
}
