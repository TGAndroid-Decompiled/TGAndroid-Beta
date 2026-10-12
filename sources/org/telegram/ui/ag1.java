package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
public final class ag1 extends pg.b {
    public final lg1 d;

    public ag1(lg1 lg1Var) {
        this.d = lg1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 != 0 && i10 != 3) {
            return false;
        }
        return true;
    }

    public final ArrayList F() {
        lg1 lg1Var = this.d;
        lg1Var.getClass();
        return lg1Var.f37960b;
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
        return ((cg1) this.d.f37960b.get(i10)).f43203a;
    }

    @Override
    public final void l() {
        this.d.f37963c = h();
        super.l();
    }

    @Override
    public final void v(s4.b1 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ag1.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        lg1 lg1Var = this.d;
        if (i10 != 0 && i10 != 3) {
            if (i10 == 2) {
                zf1 zf1Var = new zf1(this, lg1Var.getParentActivity());
                lg1Var.E0 = zf1Var;
                return new s4.b1(zf1Var);
            }
            org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(viewGroup.getContext(), null);
            f10Var.setViewType(24);
            f10Var.setIsSingleCell(true);
            f10Var.f24856w = true;
            return new s4.b1(f10Var);
        }
        ig1 ig1Var = new ig1(lg1Var, viewGroup.getContext(), false);
        if (i10 == 3) {
            i11 = ((org.telegram.ui.ActionBar.m2) lg1Var).currentAccount;
            boolean isBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(i11, -lg1Var.f37957a);
            ig1Var.setForumIcon(og.d.d(og.a.f16639k[0], ""));
            if (!isBotForumWithEditableTopics) {
                i12 = R.string.BotForumAskForStartOffNewChatTitle;
            } else {
                i12 = R.string.BotForumAskForStartNewChatTitle;
            }
            ig1Var.setTitleOverride(LocaleController.getString(i12));
            if (!isBotForumWithEditableTopics) {
                i13 = R.string.BotForumAskForStartOffNewChatForward;
            } else {
                i13 = R.string.BotForumAskForStartNewChatForward;
            }
            ig1Var.setCustomMessage(LocaleController.getString(i13));
        }
        z10 = ((org.telegram.ui.ActionBar.m2) lg1Var).inPreviewMode;
        ig1Var.f21853k0 = z10;
        ig1Var.setArchivedPullAnimation(lg1Var.f37997w);
        return new s4.b1(ig1Var);
    }
}
