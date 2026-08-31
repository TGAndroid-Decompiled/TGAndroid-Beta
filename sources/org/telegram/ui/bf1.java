package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public final class bf1 extends cg.c {
    public final mf1 d;

    public bf1(mf1 mf1Var) {
        this.d = mf1Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 0 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        mf1 mf1Var = this.d;
        mf1Var.getClass();
        return mf1Var.f39105b;
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
        return ((df1) this.d.f39105b.get(i10)).f2505a;
    }

    @Override
    public final void l() {
        this.d.f39108c = h();
        super.l();
    }

    @Override
    public final void v(f2.m1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bf1.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        boolean z4;
        int i11;
        int i12;
        int i13;
        mf1 mf1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                af1 af1Var = new af1(this, mf1Var.getParentActivity());
                mf1Var.B0 = af1Var;
                return new f2.m1(af1Var);
            }
            org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(viewGroup.getContext(), null);
            u00Var.setViewType(24);
            u00Var.setIsSingleCell(true);
            u00Var.f31509w = true;
            return new f2.m1(u00Var);
        }
        jf1 jf1Var = new jf1(mf1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.p2) mf1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -mf1Var.f39102a);
            jf1Var.setForumIcon(bg.e.d(bg.b.f1966k[0], ""));
            if (!isBotForumWithEditableTopics) {
                i12 = R.string.BotForumAskForStartOffNewChatTitle;
            } else {
                i12 = R.string.BotForumAskForStartNewChatTitle;
            }
            jf1Var.setTitleOverride(LocaleController.getString(i12));
            if (!isBotForumWithEditableTopics) {
                i13 = R.string.BotForumAskForStartOffNewChatForward;
            } else {
                i13 = R.string.BotForumAskForStartNewChatForward;
            }
            jf1Var.setCustomMessage(LocaleController.getString(i13));
        }
        z4 = ((org.telegram.ui.ActionBar.p2) mf1Var).inPreviewMode;
        jf1Var.f23445h0 = z4;
        jf1Var.setArchivedPullAnimation(mf1Var.f39141w);
        return new f2.m1(jf1Var);
    }
}
