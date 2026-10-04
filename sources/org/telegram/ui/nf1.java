package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public final class nf1 extends og.b {
    public final yf1 d;

    public nf1(yf1 yf1Var) {
        this.d = yf1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f46527f;
        if (i10 != 0 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        yf1 yf1Var = this.d;
        yf1Var.getClass();
        return yf1Var.f43165b;
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
        return ((pf1) this.d.f43165b.get(i10)).f17182a;
    }

    @Override
    public final void l() {
        this.d.f43168c = h();
        super.l();
    }

    @Override
    public final void v(s4.c1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nf1.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        yf1 yf1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                mf1 mf1Var = new mf1(this, yf1Var.getParentActivity());
                yf1Var.E0 = mf1Var;
                return new s4.c1(mf1Var);
            }
            org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(viewGroup.getContext(), null);
            w00Var.setViewType(24);
            w00Var.setIsSingleCell(true);
            w00Var.f32416w = true;
            return new s4.c1(w00Var);
        }
        vf1 vf1Var = new vf1(yf1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.n2) yf1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -yf1Var.f43162a);
            vf1Var.setForumIcon(ng.d.d(ng.a.f16884k[0], ""));
            if (!isBotForumWithEditableTopics) {
                i12 = R.string.BotForumAskForStartOffNewChatTitle;
            } else {
                i12 = R.string.BotForumAskForStartNewChatTitle;
            }
            vf1Var.setTitleOverride(LocaleController.getString(i12));
            if (!isBotForumWithEditableTopics) {
                i13 = R.string.BotForumAskForStartOffNewChatForward;
            } else {
                i13 = R.string.BotForumAskForStartNewChatForward;
            }
            vf1Var.setCustomMessage(LocaleController.getString(i13));
        }
        z10 = ((org.telegram.ui.ActionBar.n2) yf1Var).inPreviewMode;
        vf1Var.f22818k0 = z10;
        vf1Var.setArchivedPullAnimation(yf1Var.f43203w);
        return new s4.c1(vf1Var);
    }
}
