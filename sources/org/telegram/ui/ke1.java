package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public final class ke1 extends wf.b {
    public final we1 d;

    public ke1(we1 we1Var) {
        this.d = we1Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 0 && i9 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        we1 we1Var = this.d;
        we1Var.getClass();
        return we1Var.f43744b;
    }

    @Override
    public final int h() {
        return F().size() + 1;
    }

    @Override
    public final int j(int i9) {
        if (i9 == h() - 1) {
            return 2;
        }
        return ((me1) this.d.f43744b.get(i9)).f48814a;
    }

    @Override
    public final void l() {
        this.d.f43747c = h();
        super.l();
    }

    @Override
    public final void v(f2.q1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ke1.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        we1 we1Var = this.d;
        if (i9 != 0 && i9 != 3) {
            if (i9 == 2) {
                je1 je1Var = new je1(this, we1Var.getParentActivity());
                we1Var.A0 = je1Var;
                return new f2.q1(je1Var);
            }
            org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(viewGroup.getContext(), null);
            e00Var.setViewType(24);
            e00Var.setIsSingleCell(true);
            e00Var.f27885w = true;
            return new f2.q1(e00Var);
        }
        se1 se1Var = new se1(we1Var, viewGroup.getContext(), false);
        if (i9 == 3) {
            i10 = ((org.telegram.ui.ActionBar.o2) we1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i10, -we1Var.f43741a);
            se1Var.setForumIcon(vf.c.d(vf.a.f48390k[0], ""));
            if (!isBotForumWithEditableTopics) {
                i11 = R.string.BotForumAskForStartOffNewChatTitle;
            } else {
                i11 = R.string.BotForumAskForStartNewChatTitle;
            }
            se1Var.setTitleOverride(LocaleController.getString(i11));
            if (!isBotForumWithEditableTopics) {
                i12 = R.string.BotForumAskForStartOffNewChatForward;
            } else {
                i12 = R.string.BotForumAskForStartNewChatForward;
            }
            se1Var.setCustomMessage(LocaleController.getString(i12));
        }
        z10 = ((org.telegram.ui.ActionBar.o2) we1Var).inPreviewMode;
        se1Var.f24983g0 = z10;
        se1Var.setArchivedPullAnimation(we1Var.f43779w);
        return new f2.q1(se1Var);
    }
}
