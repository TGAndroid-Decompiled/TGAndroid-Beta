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
public final class jm extends org.telegram.ui.Components.xk0 {
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
    public final wn Q;
    public final Context h;
    public final boolean f34813n;
    public int f34814r;
    public int f34815s;
    public int v;
    public int f34816w;
    public int f34817x;
    public int f34818y;

    public jm(wn wnVar, Context context) {
        boolean z10;
        this.Q = wnVar;
        this.e = new ArrayList();
        this.f30347f = new ArrayList();
        this.f34815s = -5;
        this.v = -5;
        this.f34816w = -5;
        this.f34817x = -5;
        this.f34818y = -5;
        this.E = -5;
        this.F = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.h = context;
        TLRPC.User user = wnVar.f39456f;
        if (user != null && user.bot) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34813n = z10;
        C(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void K(boolean z10) {
        wn wnVar = this.Q;
        if (UserObject.isBotForum(wnVar.f39456f)) {
            if (z10) {
                wnVar.f39552mc = true;
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
        return this.Q.f39647u6;
    }

    public final void M(MessageObject messageObject) {
        wn wnVar = this.Q;
        int childCount = wnVar.f39680x0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = wnVar.f39680x0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                if (u1Var.getMessageObject() == messageObject) {
                    u1Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean N() {
        wn wnVar = this.Q;
        if (UserObject.isBotForumWithEditableTopics(wnVar.f39456f) && wnVar.d() == 0 && !wnVar.f39552mc && wnVar.R3 == 0) {
            return true;
        }
        return false;
    }

    public final void O(boolean z10) {
        boolean z11;
        boolean z12;
        wn wnVar = this.Q;
        ArrayList arrayList = wnVar.f39647u6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify data set changed fragmentOpened=" + wnVar.O5);
        }
        if (z10 && wnVar.O5) {
            s4.m0 itemAnimator = wnVar.f39680x0.getItemAnimator();
            tj tjVar = wnVar.f39693y0;
            if (itemAnimator != tjVar) {
                wnVar.f39680x0.setItemAnimator(tjVar);
            }
        } else {
            wnVar.f39680x0.setItemAnimator(null);
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
        boolean[] zArr = wnVar.C6;
        if ((zArr[0] && (wnVar.L6 == 0 || zArr[1])) || z11) {
            z12 = ((org.telegram.ui.ActionBar.m2) wnVar).fragmentBeginToShow;
            wnVar.L6(z12);
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
        wn wnVar = this.Q;
        z11 = ((org.telegram.ui.ActionBar.m2) wnVar).fragmentBeginToShow;
        if (!z11) {
            wnVar.f39680x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = wnVar.f39680x0.getItemAnimator();
            tj tjVar = wnVar.f39693y0;
            if (itemAnimator != tjVar) {
                wnVar.f39680x0.setItemAnimator(tjVar);
            }
        }
        if (z10 && wnVar.f39693y0 != null) {
            s4.m0 itemAnimator2 = wnVar.f39680x0.getItemAnimator();
            tj tjVar2 = wnVar.f39693y0;
            if (itemAnimator2 == tjVar2) {
                s4.c1 K = wnVar.f39680x0.K(i10);
                if (K == null) {
                    tjVar2.getClass();
                } else {
                    tjVar2.S.add(K);
                    View view = K.f42946a;
                    if ((view instanceof org.telegram.ui.Cells.u1) && (messageObject = ((org.telegram.ui.Cells.u1) view).getMessageObject()) != null) {
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
        wn wnVar = this.Q;
        ArrayList arrayList = wnVar.f39647u6;
        if (wnVar.f39705z0 != null && !this.L && !this.N) {
            int i12 = 0;
            if (!wnVar.D4 && wnVar.J7 != null) {
                int childCount = wnVar.f39680x0.getChildCount();
                int i13 = 0;
                while (true) {
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = wnVar.f39680x0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
                        MessageObject messageObject2 = wnVar.J7;
                        if (messageObject == messageObject2) {
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                i11 = arrayList.indexOf(wnVar.J7) + this.J;
                                i12 = wnVar.L8(childAt);
                            }
                        }
                    }
                    i13++;
                }
            }
            i11 = -1;
            m(i10);
            if (i11 != -1) {
                wnVar.f39705z0.h1(i11, i12);
            }
        }
    }

    public final org.telegram.ui.Cells.u1 R(MessageObject messageObject, boolean z10, boolean z11) {
        ArrayList arrayList;
        wn wnVar = this.Q;
        if (z10) {
            int childCount = wnVar.f39680x0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = wnVar.f39680x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var.getMessageObject() == messageObject && TextUtils.equals(u1Var.f7, u1Var.f21593y7.messageOwner.post_author)) {
                        u1Var.X3(messageObject, u1Var.getCurrentMessagesGroup(), u1Var.m3(), u1Var.n3(), u1Var.h3(), u1Var.j3());
                        return u1Var;
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
            arrayList = wnVar.f39647u6;
        }
        int indexOf = arrayList.indexOf(messageObject2);
        if (indexOf == -1) {
            return null;
        }
        if (z11) {
            int i11 = wn.Ic;
            wn.Ic = i11 + 1;
            messageObject2.stableId = i11;
            O(true);
            return null;
        }
        Q(this.J + indexOf);
        return null;
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jm.S():void");
    }

    public final void T() {
        int i10 = this.f34814r;
        int i11 = this.f34816w;
        int i12 = this.f34818y;
        int i13 = this.f34815s;
        int i14 = this.v;
        int i15 = this.E;
        int i16 = this.F;
        int i17 = this.J;
        int i18 = this.K;
        int i19 = this.G;
        int i20 = this.H;
        int i21 = this.I;
        S();
        if (i10 == this.f34814r && i11 == this.f34816w && i15 == this.E && i16 == this.F && i17 == this.J && i18 == this.K && i13 == this.f34815s && i14 == this.v && i12 == this.f34818y && i19 == this.G && i20 == this.H && i21 == this.I) {
            return;
        }
        O(false);
    }

    @Override
    public final int h() {
        this.f34817x = -5;
        wn wnVar = this.Q;
        a0.i iVar = wnVar.f39440d8;
        if (wnVar.M5.get(wnVar.f39436d4, 0) != 0) {
            TLRPC.User user = wnVar.f39456f;
            if (user == null || !user.bot || wnVar.R3 != 0 || ((iVar.m() <= 0 || (((TL_bots.BotInfo) iVar.f(wnVar.f39456f.f18468id)).description == null && ((TL_bots.BotInfo) iVar.f(wnVar.f39456f.f18468id)).description_photo == null && ((TL_bots.BotInfo) iVar.f(wnVar.f39456f.f18468id)).description_document == null)) && !UserObject.isReplyUser(wnVar.f39456f) && !UserObject.isBotForum(wnVar.f39456f))) {
                return 0;
            }
            this.f34817x = 0;
            return 1;
        }
        return this.f34814r;
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList;
        wn wnVar = this.Q;
        if (wnVar.M5.get(wnVar.f39436d4, 0) == 0 || i10 != this.f34817x) {
            if (this.L) {
                arrayList = this.M;
            } else if (this.N) {
                arrayList = this.P;
            } else {
                arrayList = wnVar.f39647u6;
            }
            int i11 = this.J;
            if (i10 >= i11 && i10 < this.K) {
                return ((MessageObject) arrayList.get(i10 - i11)).stableId;
            }
            if (i10 != this.f34816w && i10 != this.f34817x) {
                if (i10 == this.E) {
                    return 2L;
                }
                if (i10 == this.F) {
                    return 3L;
                }
                if (i10 == this.f34815s) {
                    return 4L;
                }
                if (i10 == this.f34818y) {
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
        wn wnVar = this.Q;
        if (wnVar.M5.get(wnVar.f39436d4, 0) == 0 || i10 != this.f34817x) {
            if (i10 != this.f34815s && i10 != this.v) {
                int i11 = this.J;
                if (i10 >= i11 && i10 < this.K) {
                    if (this.L) {
                        arrayList = this.M;
                    } else if (this.N) {
                        arrayList = this.P;
                    } else {
                        arrayList = wnVar.f39647u6;
                    }
                    return ((MessageObject) arrayList.get(i10 - i11)).contentType;
                } else if (i10 == this.f34816w) {
                    return 3;
                } else {
                    if (i10 == this.f34818y) {
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
        wn wnVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.m2) wnVar).fragmentBeginToShow;
        if (z10 && !wnVar.N0) {
            s4.m0 itemAnimator = wnVar.f39680x0.getItemAnimator();
            tj tjVar = wnVar.f39693y0;
            if (itemAnimator != tjVar) {
                wnVar.f39680x0.setItemAnimator(tjVar);
            }
        } else {
            wnVar.f39680x0.setItemAnimator(null);
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
        wn wnVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.m2) wnVar).fragmentBeginToShow;
        if (!z10) {
            wnVar.f39680x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = wnVar.f39680x0.getItemAnimator();
            tj tjVar = wnVar.f39693y0;
            if (itemAnimator != tjVar) {
                wnVar.f39680x0.setItemAnimator(tjVar);
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
        wn wnVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.m2) wnVar).fragmentBeginToShow;
        if (!z10) {
            wnVar.f39680x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = wnVar.f39680x0.getItemAnimator();
            tj tjVar = wnVar.f39693y0;
            if (itemAnimator != tjVar) {
                wnVar.f39680x0.setItemAnimator(tjVar);
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
        wn wnVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.m2) wnVar).fragmentBeginToShow;
        if (!z10) {
            wnVar.f39680x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = wnVar.f39680x0.getItemAnimator();
            tj tjVar = wnVar.f39693y0;
            if (itemAnimator != tjVar) {
                wnVar.f39680x0.setItemAnimator(tjVar);
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
        wn wnVar = this.Q;
        ArrayList arrayList = wnVar.f39647u6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range inserted " + i10 + ":" + i11);
        }
        z10 = ((org.telegram.ui.ActionBar.m2) wnVar).fragmentBeginToShow;
        if (!z10) {
            wnVar.f39680x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = wnVar.f39680x0.getItemAnimator();
            tj tjVar = wnVar.f39693y0;
            if (itemAnimator != tjVar) {
                wnVar.f39680x0.setItemAnimator(tjVar);
            }
        }
        S();
        if (i10 == 1 && i11 > 0 && (i12 = i10 + i11) >= (i13 = this.J) && i12 < this.K) {
            MessageObject messageObject = (MessageObject) arrayList.get(i12 - i13);
            MessageObject messageObject2 = (MessageObject) arrayList.get((i12 - this.J) - 1);
            if ((wnVar.e != null && messageObject.getFromChatId() == messageObject2.getFromChatId()) || (wnVar.f39456f != null && messageObject.isOutOwner() == messageObject2.isOutOwner())) {
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
        wn wnVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.m2) wnVar).fragmentBeginToShow;
        if (!z10) {
            wnVar.f39680x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = wnVar.f39680x0.getItemAnimator();
            tj tjVar = wnVar.f39693y0;
            if (itemAnimator != tjVar) {
                wnVar.f39680x0.setItemAnimator(tjVar);
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
        wn wnVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.m2) wnVar).fragmentBeginToShow;
        if (!z10) {
            wnVar.f39680x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = wnVar.f39680x0.getItemAnimator();
            tj tjVar = wnVar.f39693y0;
            if (itemAnimator != tjVar) {
                wnVar.f39680x0.setItemAnimator(tjVar);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jm.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u1 u1Var;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.Cells.u1 u1Var2;
        int i14;
        wn wnVar = this.Q;
        if (i10 == 0) {
            i14 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            u1Var = new org.telegram.ui.Cells.u1(this.h, i14, true, wnVar.Ba, wnVar.f39454ea);
            u1Var.setResourcesProvider(wnVar.f39454ea);
            if (wnVar.f39576oc == null) {
                wnVar.f39576oc = new in(wnVar);
            }
            u1Var.setDelegate(wnVar.f39576oc);
            u1Var.Pd = wnVar.Ob;
            if (wnVar.h == null) {
                u1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i10 == 1) {
                ?? w0Var = new org.telegram.ui.Cells.w0(context, wnVar.f39454ea, true);
                w0Var.setInvalidateColors(true);
                w0Var.setDelegate(new am(this));
                u1Var = w0Var;
            } else {
                if (i10 == 2) {
                    u1Var2 = new org.telegram.ui.Cells.w1(context, wnVar.f39454ea);
                } else if (i10 == 3) {
                    i13 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    ?? bmVar = new bm(this, context, i13, wnVar.f39454ea);
                    bmVar.setDelegate(new z0(this, 20));
                    u1Var2 = bmVar;
                } else if (i10 == 4) {
                    u1Var2 = new org.telegram.ui.Cells.z0(context, wnVar.f39454ea);
                } else if (i10 == 6) {
                    i12 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    u1Var2 = new org.telegram.ui.Cells.bb(context, i12, wnVar.f39454ea);
                } else if (i10 == 7) {
                    u1Var2 = new org.telegram.ui.Cells.w0(context, wnVar.f39454ea, false);
                } else if (i10 == 8) {
                    i11 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    u1Var2 = new cm(this, context, i11, wnVar.f39454ea);
                } else if (i10 == 10) {
                    ?? v1Var = new org.telegram.ui.Cells.v1(context, wnVar.f39454ea);
                    if (wnVar.f39576oc == null) {
                        wnVar.f39576oc = new in(wnVar);
                    }
                    v1Var.setDelegate(wnVar.f39576oc);
                    u1Var2 = v1Var;
                } else {
                    u1Var = null;
                }
                u1Var = u1Var2;
            }
        }
        return com.google.android.gms.internal.vision.e2.k(u1Var, u1Var, -1, -2);
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
        View view = c1Var.f42946a;
        boolean z20 = view instanceof org.telegram.ui.Cells.u1;
        wn wnVar = this.Q;
        if (z20 || (view instanceof org.telegram.ui.Cells.w0)) {
            wnVar.r9();
        }
        boolean z21 = view instanceof org.telegram.ui.Cells.u1;
        if (z21) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            MessageObject messageObject = u1Var.getMessageObject();
            u1Var.E8 = wnVar.t9();
            u1Var.F8 = wnVar.C9();
            u1Var.G8 = wnVar.B9();
            u1Var.H8 = wnVar.Q8();
            u1Var.I8 = wnVar.R8();
            u1Var.g4(-1, true, false);
            MessageObject messageObject2 = wnVar.G3;
            if (messageObject2 != null && messageObject2.equals(messageObject)) {
                u1Var.g4(wnVar.H3, false, false);
            }
            if (messageObject.isAnimatedEmoji() && (stickerEmoji = messageObject.getStickerEmoji()) != null && (emojiSound = wnVar.getMessagesController().emojiSounds.get(stickerEmoji.replace("️", ""))) != null) {
                wnVar.getMediaController().playEmojiSound(wnVar.getAccountInstance(), stickerEmoji, emojiSound, true);
            }
            if (messageObject.updateTranslation(false)) {
                u1Var.X3(messageObject, u1Var.getCurrentMessagesGroup(), u1Var.m3(), u1Var.n3(), u1Var.h3(), u1Var.j3());
            } else {
                MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
                if (currentMessagesGroup != null) {
                    for (int i11 = 0; i11 < currentMessagesGroup.messages.size(); i11++) {
                        currentMessagesGroup.messages.get(i11).updateTranslation();
                    }
                }
            }
            kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
            if (!kVar.s() && !wnVar.A9()) {
                u1Var.setDrawSelectionBackground(false);
                u1Var.L3(false, false, false);
                u1Var.J3(false, false);
                z13 = false;
                z14 = false;
            } else {
                wnVar.N7 = false;
                wnVar.O7 = 0L;
                wnVar.P7 = null;
                ArrayList arrayList2 = wnVar.f39396a4;
                if (arrayList2 != null && arrayList2.contains(messageObject)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                u1Var.J3(z12, false);
                if (messageObject.getDialogId() == wnVar.T5) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if (wnVar.W5[i10].indexOfKey(messageObject.getId()) >= 0) {
                    wnVar.hb(messageObject, u1Var, i10, false);
                    z13 = true;
                } else {
                    u1Var.setDrawSelectionBackground(false);
                    u1Var.L3(false, false, false);
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
            u1Var.K3(z22, z15);
            if (wnVar.R3 == 7 && wnVar.f39644u3 != null && (str = wnVar.f39632t3) != null) {
                u1Var.S3(str);
            } else {
                nk nkVar = wnVar.R2;
                if (nkVar != null && nkVar.getVisibility() == 0) {
                    MediaDataController mediaDataController = wnVar.getMediaDataController();
                    int id2 = messageObject.getId();
                    if (messageObject.getDialogId() == wnVar.L6) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (mediaDataController.isMessageFound(id2, z16) && wnVar.getMediaDataController().getLastSearchQuery() != null) {
                        u1Var.S3(wnVar.getMediaDataController().getLastSearchQuery());
                    }
                }
                u1Var.S3(null);
            }
            z17 = ((org.telegram.ui.ActionBar.m2) wnVar).inPreviewMode;
            if (!z17 || !u1Var.f21322f8) {
                if (wnVar.L7 != Integer.MAX_VALUE && ((u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == wnVar.L7) || (u1Var.getCurrentMessagesGroup() != null && u1Var.getCurrentMessagesGroup().contains(wnVar.L7)))) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                u1Var.setHighlighted(z18);
                boolean z23 = u1Var.f21322f8;
                if (z23 && wnVar.P7 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String str2 = wnVar.P7;
                    int i12 = wnVar.S7;
                    if (!wnVar.N7 && currentTimeMillis - wnVar.O7 >= 200) {
                        z19 = false;
                    } else {
                        z19 = true;
                    }
                    if (!u1Var.T3(str2, true, z19, i12) && wnVar.M7) {
                        org.telegram.ui.Components.yc.a0(wnVar).Q(R.raw.error, 36, LocaleController.getString(R.string.QuoteNotFound)).k(true);
                    }
                    wnVar.M7 = false;
                    if (wnVar.N7) {
                        wnVar.O7 = currentTimeMillis;
                    }
                    wnVar.N7 = false;
                } else if (z23 && (num = wnVar.Q7) != null) {
                    u1Var.R3(num.intValue());
                } else if (z23 && (bArr = wnVar.R7) != null) {
                    u1Var.P3(bArr);
                }
                if (wnVar.L7 != Integer.MAX_VALUE) {
                    wnVar.Zb();
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
            w0Var.f21715e0 = wnVar.t9();
            w0Var.f21728i0 = wnVar.C9();
            wnVar.B9();
            wnVar.Q8();
            w0Var.f21731j0 = wnVar.R8();
        } else if (view instanceof org.telegram.ui.Cells.w1) {
            ((org.telegram.ui.Cells.w1) view).getTextView().setTranslationX(wnVar.R8() / 2.0f);
        }
        int b10 = c1Var.b();
        int i13 = this.J;
        if (b10 >= i13 && b10 < this.K) {
            if (this.L) {
                arrayList = this.M;
            } else if (this.N) {
                arrayList = this.P;
            } else {
                arrayList = wnVar.f39647u6;
            }
            MessageObject messageObject3 = (MessageObject) arrayList.get(b10 - i13);
            if (messageObject3 != null && (message = messageObject3.messageOwner) != null && message.media_unread && message.mentioned) {
                z10 = ((org.telegram.ui.ActionBar.m2) wnVar).inPreviewMode;
                if (!z10 && wnVar.R3 == 0 && !messageObject3.isVoice() && !messageObject3.isRoundVideo()) {
                    int i14 = wnVar.f39534l6 - 1;
                    wnVar.f39534l6 = i14;
                    if (i14 <= 0) {
                        wnVar.f39534l6 = 0;
                        wnVar.f39546m6 = true;
                        wnVar.Kb(false);
                    } else {
                        wnVar.f39506j1.c(2, i14, true);
                    }
                    MessagesController messagesController = wnVar.getMessagesController();
                    int id3 = messageObject3.getId();
                    if (ChatObject.isChannel(wnVar.e)) {
                        j3 = wnVar.e.f18321id;
                    } else {
                        j3 = 0;
                    }
                    messagesController.markMentionMessageAsRead(id3, j3, wnVar.T5);
                    messageObject3.setContentIsRead();
                }
                if (z21) {
                    org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) view;
                    z11 = ((org.telegram.ui.ActionBar.m2) wnVar).inPreviewMode;
                    if (z11) {
                        u1Var2.setHighlighted(true);
                    } else {
                        u1Var2.O3();
                    }
                }
            }
        }
    }
}
