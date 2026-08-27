package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

public final class le1 extends xf.b {
    public final we1 d;

    public le1(we1 we1Var) {
        this.d = we1Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return i10 == 0 || i10 == 3;
    }

    public final ArrayList F() {
        we1 we1Var = this.d;
        we1Var.getClass();
        return we1Var.f43722b;
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
        return ((ne1) this.d.f43722b.get(i10)).f49413a;
    }

    @Override
    public final void l() {
        this.d.f43725c = h();
        super.l();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        boolean z10;
        boolean z11;
        we1 we1Var = this.d;
        ArrayList arrayList = we1Var.f43722b;
        long j10 = we1Var.f43719a;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 != 0) {
            boolean z12 = true;
            if (i11 == 3) {
                te1 te1Var = (te1) view;
                te1Var.setCurrentDialogId(-j10);
                if (i10 == arrayList.size() - 1 && !we1Var.J.S0()) {
                    z12 = false;
                }
                te1Var.S4 = z12;
                te1Var.T4 = i10;
                return;
            }
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((ne1) F().get(i10)).f40813c;
        int i12 = i10 + 1;
        TLRPC.TL_forumTopic tL_forumTopic2 = i12 < F().size() ? ((ne1) F().get(i12)).f40813c : null;
        te1 te1Var2 = (te1) view;
        TLRPC.Message message = tL_forumTopic.topMessage;
        TLRPC.TL_forumTopic tL_forumTopic3 = te1Var2.J;
        int i13 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.f22432id;
        int i14 = tL_forumTopic.f22432id;
        boolean z13 = i13 == i14 && te1Var2.T4 == i10 && we1Var.C;
        if (message != null) {
            MessageObject messageObject = new MessageObject(((org.telegram.ui.ActionBar.n2) we1Var).currentAccount, message, false, false);
            if (we1Var.getMessagesController().isMonoForum(-j10)) {
                te1Var2.m0 = true;
                te1Var2.f24952x = true;
                te1Var2.J = tL_forumTopic;
                te1Var2.E = 72;
                te1Var2.Q = 42.0f;
                te1Var2.F = 72;
                te1Var2.G = 78;
                te1Var2.W(DialogObject.getPeerDialogId(tL_forumTopic.from_id), messageObject, message.date, false, false);
                te1Var2.f24905o0 = true;
                te1Var2.f24907o2 = i12 < h();
            } else {
                TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                te1Var2 = te1Var2;
                i14 = i14;
                boolean z14 = z13;
                te1Var2.Y(tL_forumTopic, -j10, messageObject, we1Var.isInPreviewMode(), z14);
                z10 = z14;
                te1Var2.S4 = i10 != arrayList.size() - 1 || we1Var.J.S0();
                boolean z15 = tL_forumTopic.pinned;
                te1Var2.f24912p2 = z15 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                te1Var2.setPinForced(z15 && !tL_forumTopic.hidden);
                te1Var2.T4 = i10;
            }
            if (!we1Var.getMessagesController().isMonoForum(-j10)) {
                te1Var2.setTopicIcon(tL_forumTopic);
            }
            te1Var2.V(we1Var.W.contains(Integer.valueOf(i14)), z10);
            if (we1Var.M0 == i14) {
                z11 = true;
            } else {
                z11 = false;
            }
            te1Var2.setDialogSelected(z11);
            te1Var2.T(we1Var.X, true);
        }
        z10 = z13;
        if (!we1Var.getMessagesController().isMonoForum(-j10)) {
            te1Var2.setTopicIcon(tL_forumTopic);
        }
        te1Var2.V(we1Var.W.contains(Integer.valueOf(i14)), z10);
        if (we1Var.M0 == i14) {
            z11 = true;
        } else {
            z11 = false;
        }
        te1Var2.setDialogSelected(z11);
        te1Var2.T(we1Var.X, true);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        we1 we1Var = this.d;
        if (i10 == 0 || i10 == 3) {
            te1 te1Var = new te1(we1Var, viewGroup.getContext(), false);
            if (i10 == 3) {
                boolean zIsBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(((org.telegram.ui.ActionBar.n2) we1Var).currentAccount, -we1Var.f43719a);
                te1Var.setForumIcon(wf.c.d(wf.a.f49301k[0], ""));
                te1Var.setTitleOverride(LocaleController.getString(!zIsBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatTitle : R.string.BotForumAskForStartNewChatTitle));
                te1Var.setCustomMessage(LocaleController.getString(!zIsBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatForward : R.string.BotForumAskForStartNewChatForward));
            }
            te1Var.f24866g0 = ((org.telegram.ui.ActionBar.n2) we1Var).inPreviewMode;
            te1Var.setArchivedPullAnimation(we1Var.f43757w);
            return new org.telegram.ui.Components.lk0(te1Var);
        }
        if (i10 == 2) {
            ke1 ke1Var = new ke1(this, we1Var.getParentActivity());
            we1Var.A0 = ke1Var;
            return new org.telegram.ui.Components.lk0(ke1Var);
        }
        org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(viewGroup.getContext(), null);
        h00Var.setViewType(24);
        h00Var.setIsSingleCell(true);
        h00Var.f28887w = true;
        return new org.telegram.ui.Components.lk0(h00Var);
    }
}
