package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public final class hf1 extends bg.c {
    public final sf1 d;

    public hf1(sf1 sf1Var) {
        this.d = sf1Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if (i10 != 0 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        sf1 sf1Var = this.d;
        sf1Var.getClass();
        return sf1Var.f38178b;
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
        return ((jf1) this.d.f38178b.get(i10)).f1830a;
    }

    @Override
    public final void l() {
        this.d.f38181c = h();
        super.l();
    }

    @Override
    public final void v(f2.l1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hf1.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        boolean z4;
        int i11;
        int i12;
        int i13;
        sf1 sf1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                gf1 gf1Var = new gf1(this, sf1Var.getParentActivity());
                sf1Var.B0 = gf1Var;
                return new f2.l1(gf1Var);
            }
            org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(viewGroup.getContext(), null);
            u00Var.setViewType(24);
            u00Var.setIsSingleCell(true);
            u00Var.f29071w = true;
            return new f2.l1(u00Var);
        }
        pf1 pf1Var = new pf1(sf1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.p2) sf1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -sf1Var.f38175a);
            pf1Var.setForumIcon(ag.f.d(ag.b.f187k[0], ""));
            if (!isBotForumWithEditableTopics) {
                i12 = R.string.BotForumAskForStartOffNewChatTitle;
            } else {
                i12 = R.string.BotForumAskForStartNewChatTitle;
            }
            pf1Var.setTitleOverride(LocaleController.getString(i12));
            if (!isBotForumWithEditableTopics) {
                i13 = R.string.BotForumAskForStartOffNewChatForward;
            } else {
                i13 = R.string.BotForumAskForStartNewChatForward;
            }
            pf1Var.setCustomMessage(LocaleController.getString(i13));
        }
        z4 = ((org.telegram.ui.ActionBar.p2) sf1Var).inPreviewMode;
        pf1Var.f21587h0 = z4;
        pf1Var.setArchivedPullAnimation(sf1Var.f38213w);
        return new f2.l1(pf1Var);
    }
}
