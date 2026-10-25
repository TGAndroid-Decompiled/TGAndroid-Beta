package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public final class pe1 extends qg.b {
    public final af1 d;

    public pe1(af1 af1Var) {
        this.d = af1Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47738f;
        if (i10 != 0 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        af1 af1Var = this.d;
        af1Var.getClass();
        return af1Var.f37734b;
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
        return ((re1) this.d.f37734b.get(i10)).f47037a;
    }

    @Override
    public final void l() {
        this.d.f37737c = h();
        super.l();
    }

    @Override
    public final void v(s4.e1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pe1.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        af1 af1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                oe1 oe1Var = new oe1(this, af1Var.getParentActivity());
                af1Var.E0 = oe1Var;
                return new s4.e1(oe1Var);
            }
            org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(viewGroup.getContext(), null);
            c10Var.setViewType(24);
            c10Var.setIsSingleCell(true);
            c10Var.f27029w = true;
            return new s4.e1(c10Var);
        }
        xe1 xe1Var = new xe1(af1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.r2) af1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -af1Var.f37731a);
            xe1Var.setForumIcon(pg.d.d(pg.a.f46839k[0], ""));
            if (!isBotForumWithEditableTopics) {
                i12 = R.string.BotForumAskForStartOffNewChatTitle;
            } else {
                i12 = R.string.BotForumAskForStartNewChatTitle;
            }
            xe1Var.setTitleOverride(LocaleController.getString(i12));
            if (!isBotForumWithEditableTopics) {
                i13 = R.string.BotForumAskForStartOffNewChatForward;
            } else {
                i13 = R.string.BotForumAskForStartNewChatForward;
            }
            xe1Var.setCustomMessage(LocaleController.getString(i13));
        }
        z10 = ((org.telegram.ui.ActionBar.r2) af1Var).inPreviewMode;
        xe1Var.f24677k0 = z10;
        xe1Var.setArchivedPullAnimation(af1Var.f37774w);
        return new s4.e1(xe1Var);
    }
}
