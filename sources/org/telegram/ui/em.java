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
public final class em extends org.telegram.ui.Components.mk0 {
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
    public final tn M;
    public final Context h;
    public final boolean f37863n;
    public int f37864r;
    public int f37865s;
    public int v;
    public int f37866w;
    public int f37867x;
    public int f37868y;

    public em(tn tnVar, Context context) {
        boolean z10;
        this.M = tnVar;
        this.f30719e = new ArrayList();
        this.f30720f = new ArrayList();
        this.f37865s = -5;
        this.v = -5;
        this.f37866w = -5;
        this.f37867x = -5;
        this.f37868y = -5;
        this.A = -5;
        this.B = -5;
        this.C = -5;
        this.D = -5;
        this.E = -5;
        this.I = new ArrayList();
        this.L = new ArrayList();
        this.h = context;
        TLRPC.User user = tnVar.f42801f;
        if (user != null && user.bot) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37863n = z10;
        C(true);
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    public final void K(boolean z10) {
        tn tnVar = this.M;
        if (UserObject.isBotForum(tnVar.f42801f)) {
            if (z10) {
                tnVar.f42863jc = true;
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
        return this.M.q6;
    }

    public final void M(MessageObject messageObject) {
        tn tnVar = this.M;
        int childCount = tnVar.f42973t0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = tnVar.f42973t0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                if (s1Var.getMessageObject() == messageObject) {
                    s1Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean N() {
        tn tnVar = this.M;
        if (UserObject.isBotForumWithEditableTopics(tnVar.f42801f) && tnVar.b() == 0 && !tnVar.f42863jc && tnVar.N3 == 0) {
            return true;
        }
        return false;
    }

    public final void O(boolean z10) {
        boolean z11;
        boolean z12;
        tn tnVar = this.M;
        ArrayList arrayList = tnVar.q6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify data set changed fragmentOpened=" + tnVar.K5);
        }
        if (z10 && tnVar.K5) {
            f2.u0 itemAnimator = tnVar.f42973t0.getItemAnimator();
            nj njVar = tnVar.f42986u0;
            if (itemAnimator != njVar) {
                tnVar.f42973t0.setItemAnimator(njVar);
            }
        } else {
            tnVar.f42973t0.setItemAnimator(null);
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
        boolean[] zArr = tnVar.f43044y6;
        if ((zArr[0] && (tnVar.H6 == 0 || zArr[1])) || z11) {
            z12 = ((org.telegram.ui.ActionBar.o2) tnVar).fragmentBeginToShow;
            tnVar.L6(z12);
        }
    }

    public final void P(int i10, boolean z10) {
        boolean z11;
        MessageObject messageObject;
        String str;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("notify item removed ");
            sb2.append(i10);
            if (z10) {
                str = " with thanos effect";
            } else {
                str = "";
            }
            th.v(str, sb2);
        }
        tn tnVar = this.M;
        z11 = ((org.telegram.ui.ActionBar.o2) tnVar).fragmentBeginToShow;
        if (!z11) {
            tnVar.f42973t0.setItemAnimator(null);
        } else {
            f2.u0 itemAnimator = tnVar.f42973t0.getItemAnimator();
            nj njVar = tnVar.f42986u0;
            if (itemAnimator != njVar) {
                tnVar.f42973t0.setItemAnimator(njVar);
            }
        }
        if (z10 && tnVar.f42986u0 != null) {
            f2.u0 itemAnimator2 = tnVar.f42973t0.getItemAnimator();
            nj njVar2 = tnVar.f42986u0;
            if (itemAnimator2 == njVar2) {
                f2.n1 K = tnVar.f42973t0.K(i10);
                if (K == null) {
                    njVar2.getClass();
                } else {
                    njVar2.S.add(K);
                    View view = K.f6432a;
                    if ((view instanceof org.telegram.ui.Cells.s1) && (messageObject = ((org.telegram.ui.Cells.s1) view).getMessageObject()) != null) {
                        messageObject.deletedByThanos = true;
                    }
                }
            }
        }
        S();
        try {
            super.u(i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void Q(int i10) {
        int i11;
        tn tnVar = this.M;
        ArrayList arrayList = tnVar.q6;
        if (tnVar.f42999v0 != null && !this.H && !this.J) {
            int i12 = 0;
            if (!tnVar.f43054z4 && tnVar.F7 != null) {
                int childCount = tnVar.f42973t0.getChildCount();
                int i13 = 0;
                while (true) {
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = tnVar.f42973t0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                        MessageObject messageObject2 = tnVar.F7;
                        if (messageObject == messageObject2) {
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                i11 = arrayList.indexOf(tnVar.F7) + this.F;
                                i12 = tnVar.L8(childAt);
                            }
                        }
                    }
                    i13++;
                }
            }
            i11 = -1;
            m(i10);
            if (i11 != -1) {
                tnVar.f42999v0.h1(i11, i12);
            }
        }
    }

    public final org.telegram.ui.Cells.s1 R(MessageObject messageObject, boolean z10, boolean z11) {
        ArrayList arrayList;
        tn tnVar = this.M;
        if (z10) {
            int childCount = tnVar.f42973t0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = tnVar.f42973t0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.getMessageObject() == messageObject && TextUtils.equals(s1Var.f25286b7, s1Var.f25556u7.messageOwner.post_author)) {
                        s1Var.X3(messageObject, s1Var.getCurrentMessagesGroup(), s1Var.m3(), s1Var.n3(), s1Var.h3(), s1Var.j3());
                        return s1Var;
                    }
                }
                i10++;
                messageObject = messageObject;
            }
        }
        MessageObject messageObject2 = messageObject;
        if (this.H) {
            arrayList = this.I;
        } else if (this.J) {
            arrayList = this.L;
        } else {
            arrayList = tnVar.q6;
        }
        int indexOf = arrayList.indexOf(messageObject2);
        if (indexOf == -1) {
            return null;
        }
        if (z11) {
            int i11 = tn.Fc;
            tn.Fc = i11 + 1;
            messageObject2.stableId = i11;
            O(true);
            return null;
        }
        Q(this.F + indexOf);
        return null;
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.em.S():void");
    }

    public final void T() {
        int i10 = this.f37864r;
        int i11 = this.f37866w;
        int i12 = this.f37868y;
        int i13 = this.f37865s;
        int i14 = this.v;
        int i15 = this.A;
        int i16 = this.B;
        int i17 = this.F;
        int i18 = this.G;
        int i19 = this.C;
        int i20 = this.D;
        int i21 = this.E;
        S();
        if (i10 == this.f37864r && i11 == this.f37866w && i15 == this.A && i16 == this.B && i17 == this.F && i18 == this.G && i13 == this.f37865s && i14 == this.v && i12 == this.f37868y && i19 == this.C && i20 == this.D && i21 == this.E) {
            return;
        }
        O(false);
    }

    @Override
    public final int h() {
        this.f37867x = -5;
        tn tnVar = this.M;
        a0.h hVar = tnVar.Z7;
        if (tnVar.I5.get(tnVar.Z3, 0) != 0) {
            TLRPC.User user = tnVar.f42801f;
            if (user == null || !user.bot || tnVar.N3 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(tnVar.f42801f.f22539id)).description == null && ((TL_bots.BotInfo) hVar.f(tnVar.f42801f.f22539id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(tnVar.f42801f.f22539id)).description_document == null)) && !UserObject.isReplyUser(tnVar.f42801f) && !UserObject.isBotForum(tnVar.f42801f))) {
                return 0;
            }
            this.f37867x = 0;
            return 1;
        }
        return this.f37864r;
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList;
        tn tnVar = this.M;
        if (tnVar.I5.get(tnVar.Z3, 0) == 0 || i10 != this.f37867x) {
            if (this.H) {
                arrayList = this.I;
            } else if (this.J) {
                arrayList = this.L;
            } else {
                arrayList = tnVar.q6;
            }
            int i11 = this.F;
            if (i10 >= i11 && i10 < this.G) {
                return ((MessageObject) arrayList.get(i10 - i11)).stableId;
            }
            if (i10 != this.f37866w && i10 != this.f37867x) {
                if (i10 == this.A) {
                    return 2L;
                }
                if (i10 == this.B) {
                    return 3L;
                }
                if (i10 == this.f37865s) {
                    return 4L;
                }
                if (i10 == this.f37868y) {
                    return 6L;
                }
                if (i10 == this.C) {
                    return 7L;
                }
                if (i10 == this.D) {
                    return 8L;
                }
                if (i10 == this.E) {
                    return 9L;
                }
                if (i10 == this.v) {
                    return 10L;
                }
                return 5L;
            }
            return 1L;
        }
        return 1L;
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList;
        tn tnVar = this.M;
        if (tnVar.I5.get(tnVar.Z3, 0) == 0 || i10 != this.f37867x) {
            if (i10 != this.f37865s && i10 != this.v) {
                int i11 = this.F;
                if (i10 >= i11 && i10 < this.G) {
                    if (this.H) {
                        arrayList = this.I;
                    } else if (this.J) {
                        arrayList = this.L;
                    } else {
                        arrayList = tnVar.q6;
                    }
                    return ((MessageObject) arrayList.get(i10 - i11)).contentType;
                } else if (i10 == this.f37866w) {
                    return 3;
                } else {
                    if (i10 == this.f37868y) {
                        return 6;
                    }
                    if (i10 != this.D && i10 != this.C) {
                        if (i10 == this.E) {
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
    public final void m(int i10) {
        boolean z10;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item changed " + i10);
        }
        tn tnVar = this.M;
        z10 = ((org.telegram.ui.ActionBar.o2) tnVar).fragmentBeginToShow;
        if (z10 && !tnVar.J0) {
            f2.u0 itemAnimator = tnVar.f42973t0.getItemAnimator();
            nj njVar = tnVar.f42986u0;
            if (itemAnimator != njVar) {
                tnVar.f42973t0.setItemAnimator(njVar);
            }
        } else {
            tnVar.f42973t0.setItemAnimator(null);
        }
        S();
        try {
            super.m(i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void o(int i10) {
        boolean z10;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item inserted " + i10);
        }
        tn tnVar = this.M;
        z10 = ((org.telegram.ui.ActionBar.o2) tnVar).fragmentBeginToShow;
        if (!z10) {
            tnVar.f42973t0.setItemAnimator(null);
        } else {
            f2.u0 itemAnimator = tnVar.f42973t0.getItemAnimator();
            nj njVar = tnVar.f42986u0;
            if (itemAnimator != njVar) {
                tnVar.f42973t0.setItemAnimator(njVar);
            }
        }
        S();
        try {
            super.o(i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void p(int i10, int i11) {
        boolean z10;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item moved" + i10 + ":" + i11);
        }
        tn tnVar = this.M;
        z10 = ((org.telegram.ui.ActionBar.o2) tnVar).fragmentBeginToShow;
        if (!z10) {
            tnVar.f42973t0.setItemAnimator(null);
        } else {
            f2.u0 itemAnimator = tnVar.f42973t0.getItemAnimator();
            nj njVar = tnVar.f42986u0;
            if (itemAnimator != njVar) {
                tnVar.f42973t0.setItemAnimator(njVar);
            }
        }
        S();
        try {
            super.p(i10, i11);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void q(int i10, int i11) {
        boolean z10;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range changed " + i10 + ":" + i11);
        }
        tn tnVar = this.M;
        z10 = ((org.telegram.ui.ActionBar.o2) tnVar).fragmentBeginToShow;
        if (!z10) {
            tnVar.f42973t0.setItemAnimator(null);
        } else {
            f2.u0 itemAnimator = tnVar.f42973t0.getItemAnimator();
            nj njVar = tnVar.f42986u0;
            if (itemAnimator != njVar) {
                tnVar.f42973t0.setItemAnimator(njVar);
            }
        }
        S();
        try {
            super.q(i10, i11);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void s(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        tn tnVar = this.M;
        ArrayList arrayList = tnVar.q6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range inserted " + i10 + ":" + i11);
        }
        z10 = ((org.telegram.ui.ActionBar.o2) tnVar).fragmentBeginToShow;
        if (!z10) {
            tnVar.f42973t0.setItemAnimator(null);
        } else {
            f2.u0 itemAnimator = tnVar.f42973t0.getItemAnimator();
            nj njVar = tnVar.f42986u0;
            if (itemAnimator != njVar) {
                tnVar.f42973t0.setItemAnimator(njVar);
            }
        }
        S();
        if (i10 == 1 && i11 > 0 && (i12 = i10 + i11) >= (i13 = this.F) && i12 < this.G) {
            MessageObject messageObject = (MessageObject) arrayList.get(i12 - i13);
            MessageObject messageObject2 = (MessageObject) arrayList.get((i12 - this.F) - 1);
            if ((tnVar.f42787e != null && messageObject.getFromChatId() == messageObject2.getFromChatId()) || (tnVar.f42801f != null && messageObject.isOutOwner() == messageObject2.isOutOwner())) {
                m(i10);
            }
        }
        try {
            super.s(i10, i11);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void t(int i10, int i11) {
        boolean z10;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range removed" + i10 + ":" + i11);
        }
        tn tnVar = this.M;
        z10 = ((org.telegram.ui.ActionBar.o2) tnVar).fragmentBeginToShow;
        if (!z10) {
            tnVar.f42973t0.setItemAnimator(null);
        } else {
            f2.u0 itemAnimator = tnVar.f42973t0.getItemAnimator();
            nj njVar = tnVar.f42986u0;
            if (itemAnimator != njVar) {
                tnVar.f42973t0.setItemAnimator(njVar);
            }
        }
        S();
        try {
            super.t(i10, i11);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void u(int i10) {
        boolean z10;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item removed " + i10);
        }
        tn tnVar = this.M;
        z10 = ((org.telegram.ui.ActionBar.o2) tnVar).fragmentBeginToShow;
        if (!z10) {
            tnVar.f42973t0.setItemAnimator(null);
        } else {
            f2.u0 itemAnimator = tnVar.f42973t0.getItemAnimator();
            nj njVar = tnVar.f42986u0;
            if (itemAnimator != njVar) {
                tnVar.f42973t0.setItemAnimator(njVar);
            }
        }
        S();
        try {
            super.u(i10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void v(f2.n1 r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.em.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s1 s1Var;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.Cells.s1 s1Var2;
        int i14;
        tn tnVar = this.M;
        if (i10 == 0) {
            i14 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            s1Var = new org.telegram.ui.Cells.s1(this.h, i14, true, tnVar.xa, tnVar.f42746aa);
            s1Var.setResourcesProvider(tnVar.f42746aa);
            if (tnVar.lc == null) {
                tnVar.lc = new fn(tnVar);
            }
            s1Var.setDelegate(tnVar.lc);
            s1Var.Ld = tnVar.Lb;
            if (tnVar.h == null) {
                s1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i10 == 1) {
                ?? v0Var = new org.telegram.ui.Cells.v0(context, tnVar.f42746aa, true);
                v0Var.setInvalidateColors(true);
                v0Var.setDelegate(new vl(this));
                s1Var = v0Var;
            } else {
                if (i10 == 2) {
                    s1Var2 = new org.telegram.ui.Cells.u1(context, tnVar.f42746aa);
                } else if (i10 == 3) {
                    i13 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    ?? wlVar = new wl(this, context, i13, tnVar.f42746aa);
                    wlVar.setDelegate(new c1(this, 20));
                    s1Var2 = wlVar;
                } else if (i10 == 4) {
                    s1Var2 = new org.telegram.ui.Cells.y0(context, tnVar.f42746aa);
                } else if (i10 == 6) {
                    i12 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    s1Var2 = new org.telegram.ui.Cells.ua(context, i12, tnVar.f42746aa);
                } else if (i10 == 7) {
                    s1Var2 = new org.telegram.ui.Cells.v0(context, tnVar.f42746aa, false);
                } else if (i10 == 8) {
                    i11 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    s1Var2 = new xl(this, context, i11, tnVar.f42746aa);
                } else if (i10 == 10) {
                    ?? t1Var = new org.telegram.ui.Cells.t1(context, tnVar.f42746aa);
                    if (tnVar.lc == null) {
                        tnVar.lc = new fn(tnVar);
                    }
                    t1Var.setDelegate(tnVar.lc);
                    s1Var2 = t1Var;
                } else {
                    s1Var = null;
                }
                s1Var = s1Var2;
            }
        }
        return th.m(s1Var, s1Var, -1, -2);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        ArrayList arrayList;
        TLRPC.Message message;
        boolean z10;
        boolean z11;
        long j10;
        org.telegram.ui.ActionBar.l lVar;
        boolean z12;
        int i10;
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
        View view = n1Var.f6432a;
        boolean z20 = view instanceof org.telegram.ui.Cells.s1;
        tn tnVar = this.M;
        if (z20 || (view instanceof org.telegram.ui.Cells.v0)) {
            tnVar.r9();
        }
        boolean z21 = view instanceof org.telegram.ui.Cells.s1;
        if (z21) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            MessageObject messageObject = s1Var.getMessageObject();
            s1Var.A8 = tnVar.t9();
            s1Var.B8 = tnVar.C9();
            s1Var.C8 = tnVar.B9();
            s1Var.D8 = tnVar.Q8();
            s1Var.E8 = tnVar.R8();
            s1Var.g4(-1, true, false);
            MessageObject messageObject2 = tnVar.C3;
            if (messageObject2 != null && messageObject2.equals(messageObject)) {
                s1Var.g4(tnVar.D3, false, false);
            }
            if (messageObject.isAnimatedEmoji() && (stickerEmoji = messageObject.getStickerEmoji()) != null && (emojiSound = tnVar.getMessagesController().emojiSounds.get(stickerEmoji.replace("️", ""))) != null) {
                tnVar.getMediaController().playEmojiSound(tnVar.getAccountInstance(), stickerEmoji, emojiSound, true);
            }
            if (messageObject.updateTranslation(false)) {
                s1Var.X3(messageObject, s1Var.getCurrentMessagesGroup(), s1Var.m3(), s1Var.n3(), s1Var.h3(), s1Var.j3());
            } else {
                MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
                if (currentMessagesGroup != null) {
                    for (int i11 = 0; i11 < currentMessagesGroup.messages.size(); i11++) {
                        currentMessagesGroup.messages.get(i11).updateTranslation();
                    }
                }
            }
            lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
            if (!lVar.s() && !tnVar.A9()) {
                s1Var.setDrawSelectionBackground(false);
                s1Var.L3(false, false, false);
                s1Var.J3(false, false);
                z13 = false;
                z14 = false;
            } else {
                tnVar.J7 = false;
                tnVar.K7 = 0L;
                tnVar.L7 = null;
                ArrayList arrayList2 = tnVar.W3;
                if (arrayList2 != null && arrayList2.contains(messageObject)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                s1Var.J3(z12, false);
                if (messageObject.getDialogId() == tnVar.P5) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if (tnVar.S5[i10].indexOfKey(messageObject.getId()) >= 0) {
                    tnVar.hb(messageObject, s1Var, i10, false);
                    z13 = true;
                } else {
                    s1Var.setDrawSelectionBackground(false);
                    s1Var.L3(false, false, false);
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
            s1Var.K3(z22, z15);
            if (tnVar.N3 == 7 && tnVar.f42940q3 != null && (str = tnVar.f42927p3) != null) {
                s1Var.S3(str);
            } else {
                hk hkVar = tnVar.N2;
                if (hkVar != null && hkVar.getVisibility() == 0) {
                    MediaDataController mediaDataController = tnVar.getMediaDataController();
                    int id2 = messageObject.getId();
                    if (messageObject.getDialogId() == tnVar.H6) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (mediaDataController.isMessageFound(id2, z16) && tnVar.getMediaDataController().getLastSearchQuery() != null) {
                        s1Var.S3(tnVar.getMediaDataController().getLastSearchQuery());
                    }
                }
                s1Var.S3(null);
            }
            z17 = ((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode;
            if (!z17 || !s1Var.f25287b8) {
                if (tnVar.H7 != Integer.MAX_VALUE && ((s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == tnVar.H7) || (s1Var.getCurrentMessagesGroup() != null && s1Var.getCurrentMessagesGroup().contains(tnVar.H7)))) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                s1Var.setHighlighted(z18);
                boolean z23 = s1Var.f25287b8;
                if (z23 && tnVar.L7 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String str2 = tnVar.L7;
                    int i12 = tnVar.O7;
                    if (!tnVar.J7 && currentTimeMillis - tnVar.K7 >= 200) {
                        z19 = false;
                    } else {
                        z19 = true;
                    }
                    if (!s1Var.T3(str2, true, z19, i12) && tnVar.I7) {
                        org.telegram.ui.Components.tc.a0(tnVar).Q(R.raw.error, 36, LocaleController.getString(R.string.QuoteNotFound)).k(true);
                    }
                    tnVar.I7 = false;
                    if (tnVar.J7) {
                        tnVar.K7 = currentTimeMillis;
                    }
                    tnVar.J7 = false;
                } else if (z23 && (num = tnVar.M7) != null) {
                    s1Var.R3(num.intValue());
                } else if (z23 && (bArr = tnVar.N7) != null) {
                    s1Var.P3(bArr);
                }
                if (tnVar.H7 != Integer.MAX_VALUE) {
                    tnVar.Zb();
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            v0Var.f25758a0 = tnVar.t9();
            v0Var.f25769e0 = tnVar.C9();
            tnVar.B9();
            tnVar.Q8();
            v0Var.f25773f0 = tnVar.R8();
        } else if (view instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).getTextView().setTranslationX(tnVar.R8() / 2.0f);
        }
        int b10 = n1Var.b();
        int i13 = this.F;
        if (b10 >= i13 && b10 < this.G) {
            if (this.H) {
                arrayList = this.I;
            } else if (this.J) {
                arrayList = this.L;
            } else {
                arrayList = tnVar.q6;
            }
            MessageObject messageObject3 = (MessageObject) arrayList.get(b10 - i13);
            if (messageObject3 != null && (message = messageObject3.messageOwner) != null && message.media_unread && message.mentioned) {
                z10 = ((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode;
                if (!z10 && tnVar.N3 == 0 && !messageObject3.isVoice() && !messageObject3.isRoundVideo()) {
                    int i14 = tnVar.f42832h6 - 1;
                    tnVar.f42832h6 = i14;
                    if (i14 <= 0) {
                        tnVar.f42832h6 = 0;
                        tnVar.f42844i6 = true;
                        tnVar.Kb(false);
                    } else {
                        tnVar.f42803f1.c(2, i14, true);
                    }
                    MessagesController messagesController = tnVar.getMessagesController();
                    int id3 = messageObject3.getId();
                    if (ChatObject.isChannel(tnVar.f42787e)) {
                        j10 = tnVar.f42787e.f22392id;
                    } else {
                        j10 = 0;
                    }
                    messagesController.markMentionMessageAsRead(id3, j10, tnVar.P5);
                    messageObject3.setContentIsRead();
                }
                if (z21) {
                    org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view;
                    z11 = ((org.telegram.ui.ActionBar.o2) tnVar).inPreviewMode;
                    if (z11) {
                        s1Var2.setHighlighted(true);
                    } else {
                        s1Var2.O3();
                    }
                }
            }
        }
    }
}
