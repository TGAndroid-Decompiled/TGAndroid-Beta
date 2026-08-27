package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class mb extends f2.q0 {

    public final Context f40425c;
    public int d;

    public int f40426e;

    public int f40427f;
    public int h;

    public final qb f40428n;

    public mb(qb qbVar, Context context) {
        this.f40428n = qbVar;
        new ArrayList();
        new ArrayList();
        this.f40425c = context;
        C(true);
    }

    public final void D(boolean z10) {
        this.d = 0;
        qb qbVar = this.f40428n;
        ArrayList arrayList = qbVar.f41609o0;
        if (arrayList.isEmpty()) {
            this.f40426e = -1;
            this.f40427f = -1;
            this.h = -1;
            return;
        }
        if (qbVar.f41611q0) {
            this.f40426e = -1;
        } else {
            int i10 = this.d;
            this.d = i10 + 1;
            this.f40426e = i10;
        }
        int i11 = this.d;
        this.f40427f = i11;
        int size = arrayList.size() + i11;
        this.d = size;
        this.h = size;
    }

    @Override
    public final int h() {
        return this.d;
    }

    @Override
    public final long i(int i10) {
        if (i10 < this.f40427f || i10 >= this.h) {
            return i10 == this.f40426e ? 2L : 5L;
        }
        ArrayList arrayList = this.f40428n.f41609o0;
        return ((MessageObject) arrayList.get((arrayList.size() - (i10 - this.f40427f)) - 1)).stableId;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.f40427f || i10 >= this.h) {
            return 4;
        }
        ArrayList arrayList = this.f40428n.f41609o0;
        return ((MessageObject) arrayList.get((arrayList.size() - (i10 - this.f40427f)) - 1)).contentType;
    }

    @Override
    public final void l() {
        D(true);
        try {
            super.l();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void m(int i10) {
        D(false);
        try {
            super.m(i10);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void p(int i10, int i11) {
        D(false);
        try {
            super.p(i10, i11);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void q(int i10, int i11) {
        D(false);
        try {
            super.q(i10, i11);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void s(int i10, int i11) {
        D(false);
        try {
            super.s(i10, i11);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void t(int i10, int i11) {
        D(false);
        try {
            super.t(i10, i11);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        boolean z10;
        boolean z11;
        MessageObject messageObject;
        boolean z12;
        TLRPC.TL_forumTopic tL_forumTopic;
        boolean z13;
        long topicId;
        TLRPC.TL_forumTopic tL_forumTopic2;
        long topicId2;
        View view = o1Var.f5789a;
        qb qbVar = this.f40428n;
        ArrayList arrayList = qbVar.f41609o0;
        if (i10 == this.f40426e) {
            ((org.telegram.ui.Cells.y0) view).setProgressVisible(true);
            return;
        }
        if (i10 < this.f40427f || i10 >= this.h) {
            return;
        }
        MessageObject messageObject2 = (MessageObject) arrayList.get((arrayList.size() - (i10 - this.f40427f)) - 1);
        if (!(view instanceof org.telegram.ui.Cells.s1)) {
            if (view instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                v0Var.setMessageObject(messageObject2);
                v0Var.setAlpha(1.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
        s1Var.J7 = true;
        int i11 = i10 + 1;
        int iJ = j(i11);
        int iJ2 = j(i10 - 1);
        if (!(messageObject2.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && iJ == o1Var.f5793f) {
            MessageObject messageObject3 = (MessageObject) arrayList.get((arrayList.size() - (i11 - this.f40427f)) - 1);
            z10 = messageObject3.isOutOwner() == messageObject2.isOutOwner() && messageObject3.getFromChatId() == messageObject2.getFromChatId() && Math.abs(messageObject3.messageOwner.date - messageObject2.messageOwner.date) <= 300;
            if (z10) {
                TLRPC.TL_forumTopic tL_forumTopic3 = messageObject2.replyToForumTopic;
                long topicId3 = tL_forumTopic3 == null ? MessageObject.getTopicId(((org.telegram.ui.ActionBar.n2) qbVar).currentAccount, messageObject2.messageOwner, true) : tL_forumTopic3.f22432id;
                TLRPC.TL_forumTopic tL_forumTopic4 = messageObject3.replyToForumTopic;
                if (topicId3 != (tL_forumTopic4 == null ? MessageObject.getTopicId(((org.telegram.ui.ActionBar.n2) qbVar).currentAccount, messageObject3.messageOwner, true) : tL_forumTopic4.f22432id)) {
                }
            } else {
                s1Var = s1Var;
            }
            if (iJ2 == o1Var.f5793f) {
                messageObject = (MessageObject) arrayList.get(arrayList.size() - (i10 - this.f40427f));
                if ((messageObject.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && messageObject.isOutOwner() == messageObject2.isOutOwner() && messageObject.getFromChatId() == messageObject2.getFromChatId() && Math.abs(messageObject.messageOwner.date - messageObject2.messageOwner.date) <= 300) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    tL_forumTopic = messageObject2.replyToForumTopic;
                    if (tL_forumTopic == null) {
                        z13 = true;
                        topicId = MessageObject.getTopicId(((org.telegram.ui.ActionBar.n2) qbVar).currentAccount, messageObject2.messageOwner, true);
                    } else {
                        z13 = true;
                        topicId = tL_forumTopic.f22432id;
                    }
                    tL_forumTopic2 = messageObject.replyToForumTopic;
                    if (tL_forumTopic2 == null) {
                        topicId2 = MessageObject.getTopicId(((org.telegram.ui.ActionBar.n2) qbVar).currentAccount, messageObject.messageOwner, z13);
                    } else {
                        topicId2 = tL_forumTopic2.f22432id;
                    }
                    if (topicId != topicId2) {
                        z12 = false;
                    }
                }
                z11 = z12;
            } else {
                z11 = false;
            }
            org.telegram.ui.Cells.s1 s1Var2 = s1Var;
            s1Var2.W3(messageObject2, null, z10, z11, false, false);
            s1Var2.setHighlighted(false);
            s1Var2.R3(qbVar.f41618v0);
        }
        s1Var = s1Var;
        z10 = false;
        if (iJ2 == o1Var.f5793f) {
            messageObject = (MessageObject) arrayList.get(arrayList.size() - (i10 - this.f40427f));
            if (messageObject.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) {
                z12 = false;
            } else {
                z12 = false;
            }
            if (z12) {
                tL_forumTopic = messageObject2.replyToForumTopic;
                if (tL_forumTopic == null) {
                    z13 = true;
                    topicId = MessageObject.getTopicId(((org.telegram.ui.ActionBar.n2) qbVar).currentAccount, messageObject2.messageOwner, true);
                } else {
                    z13 = true;
                    topicId = tL_forumTopic.f22432id;
                }
                tL_forumTopic2 = messageObject.replyToForumTopic;
                if (tL_forumTopic2 == null) {
                    topicId2 = MessageObject.getTopicId(((org.telegram.ui.ActionBar.n2) qbVar).currentAccount, messageObject.messageOwner, z13);
                } else {
                    topicId2 = tL_forumTopic2.f22432id;
                }
                if (topicId != topicId2) {
                    z12 = false;
                }
            }
            z11 = z12;
        } else {
            z11 = false;
        }
        org.telegram.ui.Cells.s1 s1Var3 = s1Var;
        s1Var3.W3(messageObject2, null, z10, z11, false, false);
        s1Var3.setHighlighted(false);
        s1Var3.R3(qbVar.f41618v0);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View y0Var;
        View s1Var;
        qb qbVar = this.f40428n;
        ArrayList arrayList = qbVar.v;
        Context context = this.f40425c;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                s1Var = new org.telegram.ui.Cells.s1(context, ((org.telegram.ui.ActionBar.n2) qbVar).currentAccount);
            } else {
                View view = (View) arrayList.get(0);
                arrayList.remove(0);
                s1Var = view;
            }
            org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) s1Var;
            s1Var2.setDelegate(new hb(this));
            s1Var2.setAllowAssistant(true);
            y0Var = s1Var;
        } else if (i10 == 1) {
            ib ibVar = new ib(context);
            ibVar.setDelegate(new kb(this));
            y0Var = ibVar;
        } else if (i10 == 2) {
            y0Var = new org.telegram.ui.Cells.u1(context, null);
        } else if (i10 == 10) {
            org.telegram.ui.Cells.t1 t1Var = new org.telegram.ui.Cells.t1(context, ((org.telegram.ui.ActionBar.n2) qbVar).resourceProvider);
            t1Var.setDelegate(new g(this, 10));
            y0Var = t1Var;
        } else {
            y0Var = new org.telegram.ui.Cells.y0(context, null);
        }
        return org.telegram.ui.Cells.pa.l(y0Var, y0Var, -1, -2);
    }

    @Override
    public final void y(f2.o1 o1Var) {
        View view = o1Var.f5789a;
        if ((view instanceof org.telegram.ui.Cells.s1) || (view instanceof org.telegram.ui.Cells.v0)) {
            view.getViewTreeObserver().addOnPreDrawListener(new lb(this, view, o1Var));
        }
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            s1Var.getMessageObject();
            s1Var.setBackgroundDrawable(null);
            s1Var.J3(true, false);
            s1Var.setHighlighted(false);
        }
    }
}
