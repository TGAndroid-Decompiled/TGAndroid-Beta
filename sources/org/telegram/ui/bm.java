package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class bm extends org.telegram.ui.Components.bk0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final ArrayList I;
    public boolean J;
    public boolean K;
    public final ArrayList L;
    public final qn M;
    public final Context h;
    public final boolean f36903n;
    public int f36904r;
    public int f36905s;
    public int v;
    public int f36906w;
    public int f36907x;
    public int f36908y;

    public bm(qn qnVar, Context context) {
        boolean z10;
        this.M = qnVar;
        this.f27231e = new ArrayList();
        this.f27232f = new ArrayList();
        this.f36905s = -5;
        this.v = -5;
        this.f36906w = -5;
        this.f36907x = -5;
        this.f36908y = -5;
        this.A = -5;
        this.B = -5;
        this.C = -5;
        this.D = -5;
        this.E = -5;
        this.I = new ArrayList();
        this.L = new ArrayList();
        this.h = context;
        TLRPC.User user = qnVar.f41903f;
        if (user != null && user.bot) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36903n = z10;
        C(true);
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    public final void K(boolean z10) {
        qn qnVar = this.M;
        if (UserObject.isBotForum(qnVar.f41903f)) {
            if (z10) {
                qnVar.jc = true;
            }
            if (this.E >= 0 && !N()) {
                super.u(this.E);
                S();
            }
        }
    }

    public final ArrayList L() {
        if (this.H) {
            return this.I;
        }
        if (this.J) {
            return this.L;
        }
        return this.M.f42042q6;
    }

    public final void M(MessageObject messageObject) {
        qn qnVar = this.M;
        int childCount = qnVar.f42077t0.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = qnVar.f42077t0.getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                if (t1Var.getMessageObject() == messageObject) {
                    t1Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean N() {
        qn qnVar = this.M;
        if (UserObject.isBotForumWithEditableTopics(qnVar.f41903f) && qnVar.b() == 0 && !qnVar.jc && qnVar.N3 == 0) {
            return true;
        }
        return false;
    }

    public final void O(boolean z10) {
        boolean z11;
        boolean z12;
        qn qnVar = this.M;
        ArrayList arrayList = qnVar.f42042q6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify data set changed fragmentOpened=" + qnVar.K5);
        }
        if (z10 && qnVar.K5) {
            f2.w0 itemAnimator = qnVar.f42077t0.getItemAnimator();
            kj kjVar = qnVar.f42090u0;
            if (itemAnimator != kjVar) {
                qnVar.f42077t0.setItemAnimator(kjVar);
            }
        } else {
            qnVar.f42077t0.setItemAnimator(null);
        }
        S();
        try {
            super.l();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(size);
            if (messageObject.isDateObject) {
                size--;
            } else {
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionChannelCreate)) {
                        z11 = true;
                    }
                }
            }
        }
        z11 = false;
        boolean[] zArr = qnVar.f42147y6;
        if ((zArr[0] && (qnVar.H6 == 0 || zArr[1])) || z11) {
            z12 = ((org.telegram.ui.ActionBar.o2) qnVar).fragmentBeginToShow;
            qnVar.L6(z12);
        }
    }

    public final void P(int i9, boolean z10) {
        boolean z11;
        MessageObject messageObject;
        String str;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("notify item removed ");
            sb2.append(i9);
            if (z10) {
                str = " with thanos effect";
            } else {
                str = "";
            }
            j3.r0.x(str, sb2);
        }
        qn qnVar = this.M;
        z11 = ((org.telegram.ui.ActionBar.o2) qnVar).fragmentBeginToShow;
        if (!z11) {
            qnVar.f42077t0.setItemAnimator(null);
        } else {
            f2.w0 itemAnimator = qnVar.f42077t0.getItemAnimator();
            kj kjVar = qnVar.f42090u0;
            if (itemAnimator != kjVar) {
                qnVar.f42077t0.setItemAnimator(kjVar);
            }
        }
        if (z10 && qnVar.f42090u0 != null) {
            f2.w0 itemAnimator2 = qnVar.f42077t0.getItemAnimator();
            kj kjVar2 = qnVar.f42090u0;
            if (itemAnimator2 == kjVar2) {
                f2.q1 K = qnVar.f42077t0.K(i9);
                if (K == null) {
                    kjVar2.getClass();
                } else {
                    kjVar2.S.add(K);
                    View view = K.f5501a;
                    if ((view instanceof org.telegram.ui.Cells.t1) && (messageObject = ((org.telegram.ui.Cells.t1) view).getMessageObject()) != null) {
                        messageObject.deletedByThanos = true;
                    }
                }
            }
        }
        S();
        try {
            super.u(i9);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void Q(int i9) {
        int i10;
        qn qnVar = this.M;
        ArrayList arrayList = qnVar.f42042q6;
        if (qnVar.f42103v0 != null && !this.H && !this.J) {
            int i11 = 0;
            if (!qnVar.f42157z4 && qnVar.F7 != null) {
                int childCount = qnVar.f42077t0.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt = qnVar.f42077t0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                        MessageObject messageObject2 = qnVar.F7;
                        if (messageObject == messageObject2) {
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                i10 = arrayList.indexOf(qnVar.F7) + this.F;
                                i11 = qnVar.L8(childAt);
                            }
                        }
                    }
                    i12++;
                }
            }
            i10 = -1;
            m(i9);
            if (i10 != -1) {
                qnVar.f42103v0.h1(i10, i11);
            }
        }
    }

    public final org.telegram.ui.Cells.t1 R(MessageObject messageObject, boolean z10, boolean z11) {
        ArrayList arrayList;
        qn qnVar = this.M;
        if (z10) {
            int childCount = qnVar.f42077t0.getChildCount();
            int i9 = 0;
            while (i9 < childCount) {
                View childAt = qnVar.f42077t0.getChildAt(i9);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject() == messageObject && TextUtils.equals(t1Var.f25321b7, t1Var.f25593u7.messageOwner.post_author)) {
                        t1Var.X3(messageObject, t1Var.getCurrentMessagesGroup(), t1Var.m3(), t1Var.n3(), t1Var.h3(), t1Var.j3());
                        return t1Var;
                    }
                }
                i9++;
                messageObject = messageObject;
            }
        }
        MessageObject messageObject2 = messageObject;
        if (this.H) {
            arrayList = this.I;
        } else if (this.J) {
            arrayList = this.L;
        } else {
            arrayList = qnVar.f42042q6;
        }
        int indexOf = arrayList.indexOf(messageObject2);
        if (indexOf == -1) {
            return null;
        }
        if (z11) {
            int i10 = qn.Fc;
            qn.Fc = i10 + 1;
            messageObject2.stableId = i10;
            O(true);
            return null;
        }
        Q(this.F + indexOf);
        return null;
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bm.S():void");
    }

    public final void T() {
        int i9 = this.f36904r;
        int i10 = this.f36906w;
        int i11 = this.f36908y;
        int i12 = this.f36905s;
        int i13 = this.v;
        int i14 = this.A;
        int i15 = this.B;
        int i16 = this.F;
        int i17 = this.G;
        int i18 = this.C;
        int i19 = this.D;
        int i20 = this.E;
        S();
        if (i9 == this.f36904r && i10 == this.f36906w && i14 == this.A && i15 == this.B && i16 == this.F && i17 == this.G && i12 == this.f36905s && i13 == this.v && i11 == this.f36908y && i18 == this.C && i19 == this.D && i20 == this.E) {
            return;
        }
        O(false);
    }

    @Override
    public final int h() {
        this.f36907x = -5;
        qn qnVar = this.M;
        a0.h hVar = qnVar.Z7;
        if (qnVar.I5.get(qnVar.Z3, 0) != 0) {
            TLRPC.User user = qnVar.f41903f;
            if (user == null || !user.bot || qnVar.N3 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(qnVar.f41903f.f22527id)).description == null && ((TL_bots.BotInfo) hVar.f(qnVar.f41903f.f22527id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(qnVar.f41903f.f22527id)).description_document == null)) && !UserObject.isReplyUser(qnVar.f41903f) && !UserObject.isBotForum(qnVar.f41903f))) {
                return 0;
            }
            this.f36907x = 0;
            return 1;
        }
        return this.f36904r;
    }

    @Override
    public final long i(int i9) {
        ArrayList arrayList;
        qn qnVar = this.M;
        if (qnVar.I5.get(qnVar.Z3, 0) == 0 || i9 != this.f36907x) {
            if (this.H) {
                arrayList = this.I;
            } else if (this.J) {
                arrayList = this.L;
            } else {
                arrayList = qnVar.f42042q6;
            }
            int i10 = this.F;
            if (i9 >= i10 && i9 < this.G) {
                return ((MessageObject) arrayList.get(i9 - i10)).stableId;
            }
            if (i9 != this.f36906w && i9 != this.f36907x) {
                if (i9 == this.A) {
                    return 2L;
                }
                if (i9 == this.B) {
                    return 3L;
                }
                if (i9 == this.f36905s) {
                    return 4L;
                }
                if (i9 == this.f36908y) {
                    return 6L;
                }
                if (i9 == this.C) {
                    return 7L;
                }
                if (i9 == this.D) {
                    return 8L;
                }
                if (i9 == this.E) {
                    return 9L;
                }
                if (i9 == this.v) {
                    return 10L;
                }
                return 5L;
            }
            return 1L;
        }
        return 1L;
    }

    @Override
    public final int j(int i9) {
        ArrayList arrayList;
        qn qnVar = this.M;
        if (qnVar.I5.get(qnVar.Z3, 0) == 0 || i9 != this.f36907x) {
            if (i9 != this.f36905s && i9 != this.v) {
                int i10 = this.F;
                if (i9 >= i10 && i9 < this.G) {
                    if (this.H) {
                        arrayList = this.I;
                    } else if (this.J) {
                        arrayList = this.L;
                    } else {
                        arrayList = qnVar.f42042q6;
                    }
                    return ((MessageObject) arrayList.get(i9 - i10)).contentType;
                } else if (i9 == this.f36906w) {
                    return 3;
                } else {
                    if (i9 == this.f36908y) {
                        return 6;
                    }
                    if (i9 != this.D && i9 != this.C) {
                        if (i9 == this.E) {
                            return 8;
                        }
                        return 4;
                    }
                    return 7;
                }
            }
            return 1;
        }
        return 3;
    }

    @Override
    public final void l() {
        O(false);
    }

    @Override
    public final void m(int i9) {
        boolean z10;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item changed " + i9);
        }
        qn qnVar = this.M;
        z10 = ((org.telegram.ui.ActionBar.o2) qnVar).fragmentBeginToShow;
        if (z10 && !qnVar.J0) {
            f2.w0 itemAnimator = qnVar.f42077t0.getItemAnimator();
            kj kjVar = qnVar.f42090u0;
            if (itemAnimator != kjVar) {
                qnVar.f42077t0.setItemAnimator(kjVar);
            }
        } else {
            qnVar.f42077t0.setItemAnimator(null);
        }
        S();
        try {
            super.m(i9);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void o(int i9) {
        boolean z10;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item inserted " + i9);
        }
        qn qnVar = this.M;
        z10 = ((org.telegram.ui.ActionBar.o2) qnVar).fragmentBeginToShow;
        if (!z10) {
            qnVar.f42077t0.setItemAnimator(null);
        } else {
            f2.w0 itemAnimator = qnVar.f42077t0.getItemAnimator();
            kj kjVar = qnVar.f42090u0;
            if (itemAnimator != kjVar) {
                qnVar.f42077t0.setItemAnimator(kjVar);
            }
        }
        S();
        try {
            super.o(i9);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void p(int i9, int i10) {
        boolean z10;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item moved" + i9 + ":" + i10);
        }
        qn qnVar = this.M;
        z10 = ((org.telegram.ui.ActionBar.o2) qnVar).fragmentBeginToShow;
        if (!z10) {
            qnVar.f42077t0.setItemAnimator(null);
        } else {
            f2.w0 itemAnimator = qnVar.f42077t0.getItemAnimator();
            kj kjVar = qnVar.f42090u0;
            if (itemAnimator != kjVar) {
                qnVar.f42077t0.setItemAnimator(kjVar);
            }
        }
        S();
        try {
            super.p(i9, i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void q(int i9, int i10) {
        boolean z10;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range changed " + i9 + ":" + i10);
        }
        qn qnVar = this.M;
        z10 = ((org.telegram.ui.ActionBar.o2) qnVar).fragmentBeginToShow;
        if (!z10) {
            qnVar.f42077t0.setItemAnimator(null);
        } else {
            f2.w0 itemAnimator = qnVar.f42077t0.getItemAnimator();
            kj kjVar = qnVar.f42090u0;
            if (itemAnimator != kjVar) {
                qnVar.f42077t0.setItemAnimator(kjVar);
            }
        }
        S();
        try {
            super.q(i9, i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void s(int i9, int i10) {
        boolean z10;
        int i11;
        int i12;
        qn qnVar = this.M;
        ArrayList arrayList = qnVar.f42042q6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range inserted " + i9 + ":" + i10);
        }
        z10 = ((org.telegram.ui.ActionBar.o2) qnVar).fragmentBeginToShow;
        if (!z10) {
            qnVar.f42077t0.setItemAnimator(null);
        } else {
            f2.w0 itemAnimator = qnVar.f42077t0.getItemAnimator();
            kj kjVar = qnVar.f42090u0;
            if (itemAnimator != kjVar) {
                qnVar.f42077t0.setItemAnimator(kjVar);
            }
        }
        S();
        if (i9 == 1 && i10 > 0 && (i11 = i9 + i10) >= (i12 = this.F) && i11 < this.G) {
            MessageObject messageObject = (MessageObject) arrayList.get(i11 - i12);
            MessageObject messageObject2 = (MessageObject) arrayList.get((i11 - this.F) - 1);
            if ((qnVar.f41890e != null && messageObject.getFromChatId() == messageObject2.getFromChatId()) || (qnVar.f41903f != null && messageObject.isOutOwner() == messageObject2.isOutOwner())) {
                m(i9);
            }
        }
        try {
            super.s(i9, i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void t(int i9, int i10) {
        boolean z10;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range removed" + i9 + ":" + i10);
        }
        qn qnVar = this.M;
        z10 = ((org.telegram.ui.ActionBar.o2) qnVar).fragmentBeginToShow;
        if (!z10) {
            qnVar.f42077t0.setItemAnimator(null);
        } else {
            f2.w0 itemAnimator = qnVar.f42077t0.getItemAnimator();
            kj kjVar = qnVar.f42090u0;
            if (itemAnimator != kjVar) {
                qnVar.f42077t0.setItemAnimator(kjVar);
            }
        }
        S();
        try {
            super.t(i9, i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void u(int i9) {
        boolean z10;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item removed " + i9);
        }
        qn qnVar = this.M;
        z10 = ((org.telegram.ui.ActionBar.o2) qnVar).fragmentBeginToShow;
        if (!z10) {
            qnVar.f42077t0.setItemAnimator(null);
        } else {
            f2.w0 itemAnimator = qnVar.f42077t0.getItemAnimator();
            kj kjVar = qnVar.f42090u0;
            if (itemAnimator != kjVar) {
                qnVar.f42077t0.setItemAnimator(kjVar);
            }
        }
        S();
        try {
            super.u(i9);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void v(f2.q1 r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bm.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.t1 t1Var;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.Cells.t1 t1Var2;
        int i13;
        qn qnVar = this.M;
        if (i9 == 0) {
            i13 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            t1Var = new org.telegram.ui.Cells.t1(this.h, i13, true, qnVar.f42137xa, qnVar.f41848aa);
            t1Var.setResourcesProvider(qnVar.f41848aa);
            if (qnVar.f41989lc == null) {
                qnVar.f41989lc = new cn(qnVar);
            }
            t1Var.setDelegate(qnVar.f41989lc);
            t1Var.Ld = qnVar.Lb;
            if (qnVar.h == null) {
                t1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i9 == 1) {
                ?? w0Var = new org.telegram.ui.Cells.w0(context, qnVar.f41848aa, true);
                w0Var.setInvalidateColors(true);
                w0Var.setDelegate(new tl(this));
                t1Var = w0Var;
            } else {
                if (i9 == 2) {
                    t1Var2 = new org.telegram.ui.Cells.v1(context, qnVar.f41848aa);
                } else if (i9 == 3) {
                    i12 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    ?? ulVar = new ul(this, context, i12, qnVar.f41848aa);
                    ulVar.setDelegate(new b1(this, 20));
                    t1Var2 = ulVar;
                } else if (i9 == 4) {
                    t1Var2 = new org.telegram.ui.Cells.z0(context, qnVar.f41848aa);
                } else if (i9 == 6) {
                    i11 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    t1Var2 = new org.telegram.ui.Cells.xa(context, i11, qnVar.f41848aa);
                } else if (i9 == 7) {
                    t1Var2 = new org.telegram.ui.Cells.w0(context, qnVar.f41848aa, false);
                } else if (i9 == 8) {
                    i10 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    t1Var2 = new vl(this, context, i10, qnVar.f41848aa);
                } else if (i9 == 10) {
                    ?? u1Var = new org.telegram.ui.Cells.u1(context, qnVar.f41848aa);
                    if (qnVar.f41989lc == null) {
                        qnVar.f41989lc = new cn(qnVar);
                    }
                    u1Var.setDelegate(qnVar.f41989lc);
                    t1Var2 = u1Var;
                } else {
                    t1Var = null;
                }
                t1Var = t1Var2;
            }
        }
        return j3.r0.s(t1Var, t1Var, -1, -2);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        ArrayList arrayList;
        TLRPC.Message message;
        boolean z10;
        boolean z11;
        long j10;
        org.telegram.ui.ActionBar.k kVar;
        boolean z12;
        int i9;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        byte[] bArr;
        Integer num;
        boolean z19;
        String str;
        String stickerEmoji;
        MessagesController.EmojiSound emojiSound;
        View view = q1Var.f5501a;
        boolean z20 = view instanceof org.telegram.ui.Cells.t1;
        qn qnVar = this.M;
        if (z20 || (view instanceof org.telegram.ui.Cells.w0)) {
            qnVar.r9();
        }
        boolean z21 = view instanceof org.telegram.ui.Cells.t1;
        if (z21) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            MessageObject messageObject = t1Var.getMessageObject();
            t1Var.A8 = qnVar.t9();
            t1Var.B8 = qnVar.C9();
            t1Var.C8 = qnVar.B9();
            t1Var.D8 = qnVar.Q8();
            t1Var.E8 = qnVar.R8();
            t1Var.g4(-1, true, false);
            MessageObject messageObject2 = qnVar.C3;
            if (messageObject2 != null && messageObject2.equals(messageObject)) {
                t1Var.g4(qnVar.D3, false, false);
            }
            if (messageObject.isAnimatedEmoji() && (stickerEmoji = messageObject.getStickerEmoji()) != null && (emojiSound = qnVar.getMessagesController().emojiSounds.get(stickerEmoji.replace("️", ""))) != null) {
                qnVar.getMediaController().playEmojiSound(qnVar.getAccountInstance(), stickerEmoji, emojiSound, true);
            }
            if (messageObject.updateTranslation(false)) {
                t1Var.X3(messageObject, t1Var.getCurrentMessagesGroup(), t1Var.m3(), t1Var.n3(), t1Var.h3(), t1Var.j3());
            } else {
                MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
                if (currentMessagesGroup != null) {
                    for (int i10 = 0; i10 < currentMessagesGroup.messages.size(); i10++) {
                        currentMessagesGroup.messages.get(i10).updateTranslation();
                    }
                }
            }
            kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
            if (!kVar.s() && !qnVar.A9()) {
                t1Var.setDrawSelectionBackground(false);
                t1Var.L3(false, false, false);
                t1Var.J3(false, false);
                z13 = false;
                z14 = false;
            } else {
                qnVar.J7 = false;
                qnVar.K7 = 0L;
                qnVar.L7 = null;
                ArrayList arrayList2 = qnVar.W3;
                if (arrayList2 != null && arrayList2.contains(messageObject)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                t1Var.J3(z12, false);
                if (messageObject.getDialogId() == qnVar.P5) {
                    i9 = 0;
                } else {
                    i9 = 1;
                }
                if (qnVar.S5[i9].indexOfKey(messageObject.getId()) >= 0) {
                    qnVar.hb(messageObject, t1Var, i9, false);
                    z13 = true;
                } else {
                    t1Var.setDrawSelectionBackground(false);
                    t1Var.L3(false, false, false);
                    z13 = false;
                }
                z14 = true;
            }
            boolean z22 = !z14;
            if (z14 && z13) {
                z15 = true;
            } else {
                z15 = false;
            }
            t1Var.K3(z22, z15);
            if (qnVar.N3 == 7 && qnVar.f42039q3 != null && (str = qnVar.f42028p3) != null) {
                t1Var.S3(str);
            } else {
                ek ekVar = qnVar.N2;
                if (ekVar != null && ekVar.getVisibility() == 0) {
                    MediaDataController mediaDataController = qnVar.getMediaDataController();
                    int id2 = messageObject.getId();
                    if (messageObject.getDialogId() == qnVar.H6) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (mediaDataController.isMessageFound(id2, z16) && qnVar.getMediaDataController().getLastSearchQuery() != null) {
                        t1Var.S3(qnVar.getMediaDataController().getLastSearchQuery());
                    }
                }
                t1Var.S3(null);
            }
            z17 = ((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode;
            if (!z17 || !t1Var.f25322b8) {
                if (qnVar.H7 != Integer.MAX_VALUE && ((t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == qnVar.H7) || (t1Var.getCurrentMessagesGroup() != null && t1Var.getCurrentMessagesGroup().contains(qnVar.H7)))) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                t1Var.setHighlighted(z18);
                boolean z23 = t1Var.f25322b8;
                if (z23 && qnVar.L7 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String str2 = qnVar.L7;
                    int i11 = qnVar.O7;
                    if (!qnVar.J7 && currentTimeMillis - qnVar.K7 >= 200) {
                        z19 = false;
                    } else {
                        z19 = true;
                    }
                    if (!t1Var.T3(str2, true, z19, i11) && qnVar.I7) {
                        org.telegram.ui.Components.oc.a0(qnVar).Q(R.raw.error, 36, LocaleController.getString(R.string.QuoteNotFound)).k(true);
                    }
                    qnVar.I7 = false;
                    if (qnVar.J7) {
                        qnVar.K7 = currentTimeMillis;
                    }
                    qnVar.J7 = false;
                } else if (z23 && (num = qnVar.M7) != null) {
                    t1Var.R3(num.intValue());
                } else if (z23 && (bArr = qnVar.N7) != null) {
                    t1Var.P3(bArr);
                }
                if (qnVar.H7 != Integer.MAX_VALUE) {
                    qnVar.Zb();
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
            w0Var.f25825a0 = qnVar.t9();
            w0Var.f25836e0 = qnVar.C9();
            qnVar.B9();
            qnVar.Q8();
            w0Var.f25840f0 = qnVar.R8();
        } else if (view instanceof org.telegram.ui.Cells.v1) {
            ((org.telegram.ui.Cells.v1) view).getTextView().setTranslationX(qnVar.R8() / 2.0f);
        }
        int b10 = q1Var.b();
        int i12 = this.F;
        if (b10 >= i12 && b10 < this.G) {
            if (this.H) {
                arrayList = this.I;
            } else if (this.J) {
                arrayList = this.L;
            } else {
                arrayList = qnVar.f42042q6;
            }
            MessageObject messageObject3 = (MessageObject) arrayList.get(b10 - i12);
            if (messageObject3 != null && (message = messageObject3.messageOwner) != null && message.media_unread && message.mentioned) {
                z10 = ((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode;
                if (!z10 && qnVar.N3 == 0 && !messageObject3.isVoice() && !messageObject3.isRoundVideo()) {
                    int i13 = qnVar.f41935h6 - 1;
                    qnVar.f41935h6 = i13;
                    if (i13 <= 0) {
                        qnVar.f41935h6 = 0;
                        qnVar.f41948i6 = true;
                        qnVar.Kb(false);
                    } else {
                        qnVar.f41905f1.c(2, i13, true);
                    }
                    MessagesController messagesController = qnVar.getMessagesController();
                    int id3 = messageObject3.getId();
                    if (ChatObject.isChannel(qnVar.f41890e)) {
                        j10 = qnVar.f41890e.f22380id;
                    } else {
                        j10 = 0;
                    }
                    messagesController.markMentionMessageAsRead(id3, j10, qnVar.P5);
                    messageObject3.setContentIsRead();
                }
                if (z21) {
                    org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
                    z11 = ((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode;
                    if (z11) {
                        t1Var2.setHighlighted(true);
                    } else {
                        t1Var2.O3();
                    }
                }
            }
        }
    }
}
