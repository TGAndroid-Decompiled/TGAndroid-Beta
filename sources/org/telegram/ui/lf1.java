package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public final class lf1 extends og.b {
    public final wf1 d;

    public lf1(wf1 wf1Var) {
        this.d = wf1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42964f;
        if (i10 != 0 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        wf1 wf1Var = this.d;
        wf1Var.getClass();
        return wf1Var.f39312b;
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
        return ((nf1) this.d.f39312b.get(i10)).f15715a;
    }

    @Override
    public final void l() {
        this.d.f39315c = h();
        super.l();
    }

    @Override
    public final void v(s4.c1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lf1.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        wf1 wf1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                kf1 kf1Var = new kf1(this, wf1Var.getParentActivity());
                wf1Var.E0 = kf1Var;
                return new s4.c1(kf1Var);
            }
            org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(viewGroup.getContext(), null);
            u00Var.setViewType(24);
            u00Var.setIsSingleCell(true);
            u00Var.f28662w = true;
            return new s4.c1(u00Var);
        }
        tf1 tf1Var = new tf1(wf1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.m2) wf1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -wf1Var.f39309a);
            tf1Var.setForumIcon(ng.d.d(ng.a.f15444k[0], ""));
            if (!isBotForumWithEditableTopics) {
                i12 = R.string.BotForumAskForStartOffNewChatTitle;
            } else {
                i12 = R.string.BotForumAskForStartNewChatTitle;
            }
            tf1Var.setTitleOverride(LocaleController.getString(i12));
            if (!isBotForumWithEditableTopics) {
                i13 = R.string.BotForumAskForStartOffNewChatForward;
            } else {
                i13 = R.string.BotForumAskForStartNewChatForward;
            }
            tf1Var.setCustomMessage(LocaleController.getString(i13));
        }
        z10 = ((org.telegram.ui.ActionBar.m2) wf1Var).inPreviewMode;
        tf1Var.f20971k0 = z10;
        tf1Var.setArchivedPullAnimation(wf1Var.f39349w);
        return new s4.c1(tf1Var);
    }
}
