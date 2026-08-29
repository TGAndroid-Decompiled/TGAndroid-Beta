package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public final class ne1 extends zf.b {
    public final ze1 d;

    public ne1(ze1 ze1Var) {
        this.d = ze1Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 0 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        ze1 ze1Var = this.d;
        ze1Var.getClass();
        return ze1Var.f45158b;
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
        return ((pe1) this.d.f45158b.get(i10)).f50845a;
    }

    @Override
    public final void l() {
        this.d.f45161c = h();
        super.l();
    }

    @Override
    public final void v(f2.n1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ne1.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        ze1 ze1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                me1 me1Var = new me1(this, ze1Var.getParentActivity());
                ze1Var.A0 = me1Var;
                return new f2.n1(me1Var);
            }
            org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(viewGroup.getContext(), null);
            p00Var.setViewType(24);
            p00Var.setIsSingleCell(true);
            p00Var.f31529w = true;
            return new f2.n1(p00Var);
        }
        we1 we1Var = new we1(ze1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.o2) ze1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -ze1Var.f45155a);
            we1Var.setForumIcon(yf.d.d(yf.b.f50526k[0], ""));
            if (!isBotForumWithEditableTopics) {
                i12 = R.string.BotForumAskForStartOffNewChatTitle;
            } else {
                i12 = R.string.BotForumAskForStartNewChatTitle;
            }
            we1Var.setTitleOverride(LocaleController.getString(i12));
            if (!isBotForumWithEditableTopics) {
                i13 = R.string.BotForumAskForStartOffNewChatForward;
            } else {
                i13 = R.string.BotForumAskForStartNewChatForward;
            }
            we1Var.setCustomMessage(LocaleController.getString(i13));
        }
        z10 = ((org.telegram.ui.ActionBar.o2) ze1Var).inPreviewMode;
        we1Var.f24857g0 = z10;
        we1Var.setArchivedPullAnimation(ze1Var.f45193w);
        return new f2.n1(we1Var);
    }
}
