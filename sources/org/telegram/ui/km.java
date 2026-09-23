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
public final class km extends org.telegram.ui.Components.nk0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final ArrayList M;
    public boolean N;
    public boolean O;
    public final ArrayList P;
    public final xn Q;
    public final Context h;
    public final boolean f34746n;
    public int f34747r;
    public int f34748s;
    public int v;
    public int f34749w;
    public int f34750x;
    public int f34751y;

    public km(xn xnVar, Context context) {
        boolean z10;
        this.Q = xnVar;
        this.e = new ArrayList();
        this.f26437f = new ArrayList();
        this.f34748s = -5;
        this.v = -5;
        this.f34749w = -5;
        this.f34750x = -5;
        this.f34751y = -5;
        this.E = -5;
        this.F = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.h = context;
        TLRPC.User user = xnVar.f39372f;
        if (user != null && user.bot) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34746n = z10;
        C(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void K(boolean z10) {
        xn xnVar = this.Q;
        if (UserObject.isBotForum(xnVar.f39372f)) {
            if (z10) {
                xnVar.f39468mc = true;
            }
            if (this.I >= 0 && !N()) {
                super.u(this.I);
                S();
            }
        }
    }

    public final ArrayList L() {
        if (this.L) {
            return this.M;
        }
        if (this.N) {
            return this.P;
        }
        return this.Q.f39563u6;
    }

    public final void M(MessageObject messageObject) {
        xn xnVar = this.Q;
        int childCount = xnVar.f39596x0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = xnVar.f39596x0.getChildAt(i10);
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
        xn xnVar = this.Q;
        if (UserObject.isBotForumWithEditableTopics(xnVar.f39372f) && xnVar.d() == 0 && !xnVar.f39468mc && xnVar.R3 == 0) {
            return true;
        }
        return false;
    }

    public final void O(boolean z10) {
        boolean z11;
        boolean z12;
        xn xnVar = this.Q;
        ArrayList arrayList = xnVar.f39563u6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify data set changed fragmentOpened=" + xnVar.O5);
        }
        if (z10 && xnVar.O5) {
            s4.m0 itemAnimator = xnVar.f39596x0.getItemAnimator();
            tj tjVar = xnVar.f39609y0;
            if (itemAnimator != tjVar) {
                xnVar.f39596x0.setItemAnimator(tjVar);
            }
        } else {
            xnVar.f39596x0.setItemAnimator(null);
        }
        S();
        try {
            super.l();
        } catch (Exception e) {
            FileLog.e(e);
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
        boolean[] zArr = xnVar.C6;
        if ((zArr[0] && (xnVar.L6 == 0 || zArr[1])) || z11) {
            z12 = ((org.telegram.ui.ActionBar.n2) xnVar).fragmentBeginToShow;
            xnVar.L6(z12);
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
            com.google.android.gms.internal.vision.e2.t(str, sb2);
        }
        xn xnVar = this.Q;
        z11 = ((org.telegram.ui.ActionBar.n2) xnVar).fragmentBeginToShow;
        if (!z11) {
            xnVar.f39596x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = xnVar.f39596x0.getItemAnimator();
            tj tjVar = xnVar.f39609y0;
            if (itemAnimator != tjVar) {
                xnVar.f39596x0.setItemAnimator(tjVar);
            }
        }
        if (z10 && xnVar.f39609y0 != null) {
            s4.m0 itemAnimator2 = xnVar.f39596x0.getItemAnimator();
            tj tjVar2 = xnVar.f39609y0;
            if (itemAnimator2 == tjVar2) {
                s4.c1 K = xnVar.f39596x0.K(i10);
                if (K == null) {
                    tjVar2.getClass();
                } else {
                    tjVar2.S.add(K);
                    View view = K.f42627a;
                    if ((view instanceof org.telegram.ui.Cells.t1) && (messageObject = ((org.telegram.ui.Cells.t1) view).getMessageObject()) != null) {
                        messageObject.deletedByThanos = true;
                    }
                }
            }
        }
        S();
        try {
            super.u(i10);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void Q(int i10) {
        int i11;
        xn xnVar = this.Q;
        ArrayList arrayList = xnVar.f39563u6;
        if (xnVar.f39621z0 != null && !this.L && !this.N) {
            int i12 = 0;
            if (!xnVar.D4 && xnVar.J7 != null) {
                int childCount = xnVar.f39596x0.getChildCount();
                int i13 = 0;
                while (true) {
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = xnVar.f39596x0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                        MessageObject messageObject2 = xnVar.J7;
                        if (messageObject == messageObject2) {
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                i11 = arrayList.indexOf(xnVar.J7) + this.J;
                                i12 = xnVar.L8(childAt);
                            }
                        }
                    }
                    i13++;
                }
            }
            i11 = -1;
            m(i10);
            if (i11 != -1) {
                xnVar.f39621z0.h1(i11, i12);
            }
        }
    }

    public final org.telegram.ui.Cells.t1 R(MessageObject messageObject, boolean z10, boolean z11) {
        ArrayList arrayList;
        xn xnVar = this.Q;
        if (z10) {
            int childCount = xnVar.f39596x0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = xnVar.f39596x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject() == messageObject && TextUtils.equals(t1Var.f7, t1Var.f21292y7.messageOwner.post_author)) {
                        t1Var.X3(messageObject, t1Var.getCurrentMessagesGroup(), t1Var.m3(), t1Var.n3(), t1Var.h3(), t1Var.j3());
                        return t1Var;
                    }
                }
                i10++;
                messageObject = messageObject;
            }
        }
        MessageObject messageObject2 = messageObject;
        if (this.L) {
            arrayList = this.M;
        } else if (this.N) {
            arrayList = this.P;
        } else {
            arrayList = xnVar.f39563u6;
        }
        int indexOf = arrayList.indexOf(messageObject2);
        if (indexOf == -1) {
            return null;
        }
        if (z11) {
            int i11 = xn.Ic;
            xn.Ic = i11 + 1;
            messageObject2.stableId = i11;
            O(true);
            return null;
        }
        Q(this.J + indexOf);
        return null;
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.km.S():void");
    }

    public final void T() {
        int i10 = this.f34747r;
        int i11 = this.f34749w;
        int i12 = this.f34751y;
        int i13 = this.f34748s;
        int i14 = this.v;
        int i15 = this.E;
        int i16 = this.F;
        int i17 = this.J;
        int i18 = this.K;
        int i19 = this.G;
        int i20 = this.H;
        int i21 = this.I;
        S();
        if (i10 == this.f34747r && i11 == this.f34749w && i15 == this.E && i16 == this.F && i17 == this.J && i18 == this.K && i13 == this.f34748s && i14 == this.v && i12 == this.f34751y && i19 == this.G && i20 == this.H && i21 == this.I) {
            return;
        }
        O(false);
    }

    @Override
    public final int h() {
        this.f34750x = -5;
        xn xnVar = this.Q;
        a0.i iVar = xnVar.f39356d8;
        if (xnVar.M5.get(xnVar.f39352d4, 0) != 0) {
            TLRPC.User user = xnVar.f39372f;
            if (user == null || !user.bot || xnVar.R3 != 0 || ((iVar.m() <= 0 || (((TL_bots.BotInfo) iVar.f(xnVar.f39372f.f18230id)).description == null && ((TL_bots.BotInfo) iVar.f(xnVar.f39372f.f18230id)).description_photo == null && ((TL_bots.BotInfo) iVar.f(xnVar.f39372f.f18230id)).description_document == null)) && !UserObject.isReplyUser(xnVar.f39372f) && !UserObject.isBotForum(xnVar.f39372f))) {
                return 0;
            }
            this.f34750x = 0;
            return 1;
        }
        return this.f34747r;
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList;
        xn xnVar = this.Q;
        if (xnVar.M5.get(xnVar.f39352d4, 0) == 0 || i10 != this.f34750x) {
            if (this.L) {
                arrayList = this.M;
            } else if (this.N) {
                arrayList = this.P;
            } else {
                arrayList = xnVar.f39563u6;
            }
            int i11 = this.J;
            if (i10 >= i11 && i10 < this.K) {
                return ((MessageObject) arrayList.get(i10 - i11)).stableId;
            }
            if (i10 != this.f34749w && i10 != this.f34750x) {
                if (i10 == this.E) {
                    return 2L;
                }
                if (i10 == this.F) {
                    return 3L;
                }
                if (i10 == this.f34748s) {
                    return 4L;
                }
                if (i10 == this.f34751y) {
                    return 6L;
                }
                if (i10 == this.G) {
                    return 7L;
                }
                if (i10 == this.H) {
                    return 8L;
                }
                if (i10 == this.I) {
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
        xn xnVar = this.Q;
        if (xnVar.M5.get(xnVar.f39352d4, 0) == 0 || i10 != this.f34750x) {
            if (i10 != this.f34748s && i10 != this.v) {
                int i11 = this.J;
                if (i10 >= i11 && i10 < this.K) {
                    if (this.L) {
                        arrayList = this.M;
                    } else if (this.N) {
                        arrayList = this.P;
                    } else {
                        arrayList = xnVar.f39563u6;
                    }
                    return ((MessageObject) arrayList.get(i10 - i11)).contentType;
                } else if (i10 == this.f34749w) {
                    return 3;
                } else {
                    if (i10 == this.f34751y) {
                        return 6;
                    }
                    if (i10 != this.H && i10 != this.G) {
                        if (i10 == this.I) {
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
        xn xnVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) xnVar).fragmentBeginToShow;
        if (z10 && !xnVar.N0) {
            s4.m0 itemAnimator = xnVar.f39596x0.getItemAnimator();
            tj tjVar = xnVar.f39609y0;
            if (itemAnimator != tjVar) {
                xnVar.f39596x0.setItemAnimator(tjVar);
            }
        } else {
            xnVar.f39596x0.setItemAnimator(null);
        }
        S();
        try {
            super.m(i10);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void o(int i10) {
        boolean z10;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item inserted " + i10);
        }
        xn xnVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) xnVar).fragmentBeginToShow;
        if (!z10) {
            xnVar.f39596x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = xnVar.f39596x0.getItemAnimator();
            tj tjVar = xnVar.f39609y0;
            if (itemAnimator != tjVar) {
                xnVar.f39596x0.setItemAnimator(tjVar);
            }
        }
        S();
        try {
            super.o(i10);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void p(int i10, int i11) {
        boolean z10;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item moved" + i10 + ":" + i11);
        }
        xn xnVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) xnVar).fragmentBeginToShow;
        if (!z10) {
            xnVar.f39596x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = xnVar.f39596x0.getItemAnimator();
            tj tjVar = xnVar.f39609y0;
            if (itemAnimator != tjVar) {
                xnVar.f39596x0.setItemAnimator(tjVar);
            }
        }
        S();
        try {
            super.p(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void q(int i10, int i11) {
        boolean z10;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range changed " + i10 + ":" + i11);
        }
        xn xnVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) xnVar).fragmentBeginToShow;
        if (!z10) {
            xnVar.f39596x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = xnVar.f39596x0.getItemAnimator();
            tj tjVar = xnVar.f39609y0;
            if (itemAnimator != tjVar) {
                xnVar.f39596x0.setItemAnimator(tjVar);
            }
        }
        S();
        try {
            super.q(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void s(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        xn xnVar = this.Q;
        ArrayList arrayList = xnVar.f39563u6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range inserted " + i10 + ":" + i11);
        }
        z10 = ((org.telegram.ui.ActionBar.n2) xnVar).fragmentBeginToShow;
        if (!z10) {
            xnVar.f39596x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = xnVar.f39596x0.getItemAnimator();
            tj tjVar = xnVar.f39609y0;
            if (itemAnimator != tjVar) {
                xnVar.f39596x0.setItemAnimator(tjVar);
            }
        }
        S();
        if (i10 == 1 && i11 > 0 && (i12 = i10 + i11) >= (i13 = this.J) && i12 < this.K) {
            MessageObject messageObject = (MessageObject) arrayList.get(i12 - i13);
            MessageObject messageObject2 = (MessageObject) arrayList.get((i12 - this.J) - 1);
            if ((xnVar.e != null && messageObject.getFromChatId() == messageObject2.getFromChatId()) || (xnVar.f39372f != null && messageObject.isOutOwner() == messageObject2.isOutOwner())) {
                m(i10);
            }
        }
        try {
            super.s(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void t(int i10, int i11) {
        boolean z10;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range removed" + i10 + ":" + i11);
        }
        xn xnVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) xnVar).fragmentBeginToShow;
        if (!z10) {
            xnVar.f39596x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = xnVar.f39596x0.getItemAnimator();
            tj tjVar = xnVar.f39609y0;
            if (itemAnimator != tjVar) {
                xnVar.f39596x0.setItemAnimator(tjVar);
            }
        }
        S();
        try {
            super.t(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void u(int i10) {
        boolean z10;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item removed " + i10);
        }
        xn xnVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) xnVar).fragmentBeginToShow;
        if (!z10) {
            xnVar.f39596x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = xnVar.f39596x0.getItemAnimator();
            tj tjVar = xnVar.f39609y0;
            if (itemAnimator != tjVar) {
                xnVar.f39596x0.setItemAnimator(tjVar);
            }
        }
        S();
        try {
            super.u(i10);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void v(s4.c1 r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.km.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.t1 t1Var;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.Cells.t1 t1Var2;
        int i14;
        xn xnVar = this.Q;
        if (i10 == 0) {
            i14 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
            t1Var = new org.telegram.ui.Cells.t1(this.h, i14, true, xnVar.Ba, xnVar.f39370ea);
            t1Var.setResourcesProvider(xnVar.f39370ea);
            if (xnVar.f39492oc == null) {
                xnVar.f39492oc = new jn(xnVar);
            }
            t1Var.setDelegate(xnVar.f39492oc);
            t1Var.Pd = xnVar.Ob;
            if (xnVar.h == null) {
                t1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i10 == 1) {
                ?? w0Var = new org.telegram.ui.Cells.w0(context, xnVar.f39370ea, true);
                w0Var.setInvalidateColors(true);
                w0Var.setDelegate(new bm(this));
                t1Var = w0Var;
            } else {
                if (i10 == 2) {
                    t1Var2 = new org.telegram.ui.Cells.v1(context, xnVar.f39370ea);
                } else if (i10 == 3) {
                    i13 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                    ?? cmVar = new cm(this, context, i13, xnVar.f39370ea);
                    cmVar.setDelegate(new z0(this, 20));
                    t1Var2 = cmVar;
                } else if (i10 == 4) {
                    t1Var2 = new org.telegram.ui.Cells.z0(context, xnVar.f39370ea);
                } else if (i10 == 6) {
                    i12 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                    t1Var2 = new org.telegram.ui.Cells.db(context, i12, xnVar.f39370ea);
                } else if (i10 == 7) {
                    t1Var2 = new org.telegram.ui.Cells.w0(context, xnVar.f39370ea, false);
                } else if (i10 == 8) {
                    i11 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                    t1Var2 = new dm(this, context, i11, xnVar.f39370ea);
                } else if (i10 == 10) {
                    ?? u1Var = new org.telegram.ui.Cells.u1(context, xnVar.f39370ea);
                    if (xnVar.f39492oc == null) {
                        xnVar.f39492oc = new jn(xnVar);
                    }
                    u1Var.setDelegate(xnVar.f39492oc);
                    t1Var2 = u1Var;
                } else {
                    t1Var = null;
                }
                t1Var = t1Var2;
            }
        }
        return com.google.android.gms.internal.vision.e2.k(t1Var, t1Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        ArrayList arrayList;
        TLRPC.Message message;
        boolean z10;
        boolean z11;
        long j3;
        org.telegram.ui.ActionBar.k kVar;
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
        View view = c1Var.f42627a;
        boolean z20 = view instanceof org.telegram.ui.Cells.t1;
        xn xnVar = this.Q;
        if (z20 || (view instanceof org.telegram.ui.Cells.w0)) {
            xnVar.r9();
        }
        boolean z21 = view instanceof org.telegram.ui.Cells.t1;
        if (z21) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            MessageObject messageObject = t1Var.getMessageObject();
            t1Var.E8 = xnVar.t9();
            t1Var.F8 = xnVar.C9();
            t1Var.G8 = xnVar.B9();
            t1Var.H8 = xnVar.Q8();
            t1Var.I8 = xnVar.R8();
            t1Var.g4(-1, true, false);
            MessageObject messageObject2 = xnVar.G3;
            if (messageObject2 != null && messageObject2.equals(messageObject)) {
                t1Var.g4(xnVar.H3, false, false);
            }
            if (messageObject.isAnimatedEmoji() && (stickerEmoji = messageObject.getStickerEmoji()) != null && (emojiSound = xnVar.getMessagesController().emojiSounds.get(stickerEmoji.replace("️", ""))) != null) {
                xnVar.getMediaController().playEmojiSound(xnVar.getAccountInstance(), stickerEmoji, emojiSound, true);
            }
            if (messageObject.updateTranslation(false)) {
                t1Var.X3(messageObject, t1Var.getCurrentMessagesGroup(), t1Var.m3(), t1Var.n3(), t1Var.h3(), t1Var.j3());
            } else {
                MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
                if (currentMessagesGroup != null) {
                    for (int i11 = 0; i11 < currentMessagesGroup.messages.size(); i11++) {
                        currentMessagesGroup.messages.get(i11).updateTranslation();
                    }
                }
            }
            kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
            if (!kVar.s() && !xnVar.A9()) {
                t1Var.setDrawSelectionBackground(false);
                t1Var.L3(false, false, false);
                t1Var.J3(false, false);
                z13 = false;
                z14 = false;
            } else {
                xnVar.N7 = false;
                xnVar.O7 = 0L;
                xnVar.P7 = null;
                ArrayList arrayList2 = xnVar.f39312a4;
                if (arrayList2 != null && arrayList2.contains(messageObject)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                t1Var.J3(z12, false);
                if (messageObject.getDialogId() == xnVar.T5) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if (xnVar.W5[i10].indexOfKey(messageObject.getId()) >= 0) {
                    xnVar.hb(messageObject, t1Var, i10, false);
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
            if (xnVar.R3 == 7 && xnVar.f39560u3 != null && (str = xnVar.f39548t3) != null) {
                t1Var.S3(str);
            } else {
                nk nkVar = xnVar.R2;
                if (nkVar != null && nkVar.getVisibility() == 0) {
                    MediaDataController mediaDataController = xnVar.getMediaDataController();
                    int id2 = messageObject.getId();
                    if (messageObject.getDialogId() == xnVar.L6) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (mediaDataController.isMessageFound(id2, z16) && xnVar.getMediaDataController().getLastSearchQuery() != null) {
                        t1Var.S3(xnVar.getMediaDataController().getLastSearchQuery());
                    }
                }
                t1Var.S3(null);
            }
            z17 = ((org.telegram.ui.ActionBar.n2) xnVar).inPreviewMode;
            if (!z17 || !t1Var.f21021f8) {
                if (xnVar.L7 != Integer.MAX_VALUE && ((t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == xnVar.L7) || (t1Var.getCurrentMessagesGroup() != null && t1Var.getCurrentMessagesGroup().contains(xnVar.L7)))) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                t1Var.setHighlighted(z18);
                boolean z23 = t1Var.f21021f8;
                if (z23 && xnVar.P7 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String str2 = xnVar.P7;
                    int i12 = xnVar.S7;
                    if (!xnVar.N7 && currentTimeMillis - xnVar.O7 >= 200) {
                        z19 = false;
                    } else {
                        z19 = true;
                    }
                    if (!t1Var.T3(str2, true, z19, i12) && xnVar.M7) {
                        org.telegram.ui.Components.xc.a0(xnVar).Q(R.raw.error, 36, LocaleController.getString(R.string.QuoteNotFound)).k(true);
                    }
                    xnVar.M7 = false;
                    if (xnVar.N7) {
                        xnVar.O7 = currentTimeMillis;
                    }
                    xnVar.N7 = false;
                } else if (z23 && (num = xnVar.Q7) != null) {
                    t1Var.R3(num.intValue());
                } else if (z23 && (bArr = xnVar.R7) != null) {
                    t1Var.P3(bArr);
                }
                if (xnVar.L7 != Integer.MAX_VALUE) {
                    xnVar.Zb();
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
            w0Var.f21480e0 = xnVar.t9();
            w0Var.f21493i0 = xnVar.C9();
            xnVar.B9();
            xnVar.Q8();
            w0Var.f21496j0 = xnVar.R8();
        } else if (view instanceof org.telegram.ui.Cells.v1) {
            ((org.telegram.ui.Cells.v1) view).getTextView().setTranslationX(xnVar.R8() / 2.0f);
        }
        int b10 = c1Var.b();
        int i13 = this.J;
        if (b10 >= i13 && b10 < this.K) {
            if (this.L) {
                arrayList = this.M;
            } else if (this.N) {
                arrayList = this.P;
            } else {
                arrayList = xnVar.f39563u6;
            }
            MessageObject messageObject3 = (MessageObject) arrayList.get(b10 - i13);
            if (messageObject3 != null && (message = messageObject3.messageOwner) != null && message.media_unread && message.mentioned) {
                z10 = ((org.telegram.ui.ActionBar.n2) xnVar).inPreviewMode;
                if (!z10 && xnVar.R3 == 0 && !messageObject3.isVoice() && !messageObject3.isRoundVideo()) {
                    int i14 = xnVar.f39450l6 - 1;
                    xnVar.f39450l6 = i14;
                    if (i14 <= 0) {
                        xnVar.f39450l6 = 0;
                        xnVar.f39462m6 = true;
                        xnVar.Kb(false);
                    } else {
                        xnVar.f39422j1.c(2, i14, true);
                    }
                    MessagesController messagesController = xnVar.getMessagesController();
                    int id3 = messageObject3.getId();
                    if (ChatObject.isChannel(xnVar.e)) {
                        j3 = xnVar.e.f18083id;
                    } else {
                        j3 = 0;
                    }
                    messagesController.markMentionMessageAsRead(id3, j3, xnVar.T5);
                    messageObject3.setContentIsRead();
                }
                if (z21) {
                    org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
                    z11 = ((org.telegram.ui.ActionBar.n2) xnVar).inPreviewMode;
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
