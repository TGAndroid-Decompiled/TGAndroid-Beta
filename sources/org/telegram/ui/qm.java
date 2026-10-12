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
public final class qm extends org.telegram.ui.Components.xl0 {
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
    public final eo Q;
    public final Context h;
    public final boolean f41352n;
    public int f41353r;
    public int f41354s;
    public int v;
    public int f41355w;
    public int f41356x;
    public int f41357y;

    public qm(eo eoVar, Context context) {
        boolean z10;
        this.Q = eoVar;
        this.f32799e = new ArrayList();
        this.f32800f = new ArrayList();
        this.f41354s = -5;
        this.v = -5;
        this.f41355w = -5;
        this.f41356x = -5;
        this.f41357y = -5;
        this.E = -5;
        this.F = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.h = context;
        TLRPC.User user = eoVar.f37258f;
        if (user != null && user.bot) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41352n = z10;
        C(true);
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    public final void K(boolean z10) {
        eo eoVar = this.Q;
        if (UserObject.isBotForum(eoVar.f37258f)) {
            if (z10) {
                eoVar.nc = true;
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
        return this.Q.f37449u6;
    }

    public final void M(MessageObject messageObject) {
        eo eoVar = this.Q;
        int childCount = eoVar.f37483x0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = eoVar.f37483x0.getChildAt(i10);
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
        eo eoVar = this.Q;
        if (UserObject.isBotForumWithEditableTopics(eoVar.f37258f) && eoVar.d() == 0 && !eoVar.nc && eoVar.R3 == 0) {
            return true;
        }
        return false;
    }

    public final void O(boolean z10) {
        boolean z11;
        boolean z12;
        eo eoVar = this.Q;
        ArrayList arrayList = eoVar.f37449u6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify data set changed fragmentOpened=" + eoVar.O5);
        }
        if (z10 && eoVar.O5) {
            s4.n0 itemAnimator = eoVar.f37483x0.getItemAnimator();
            ck ckVar = eoVar.f37496y0;
            if (itemAnimator != ckVar) {
                eoVar.f37483x0.setItemAnimator(ckVar);
            }
        } else {
            eoVar.f37483x0.setItemAnimator(null);
        }
        S();
        try {
            super.l();
        } catch (Exception e7) {
            FileLog.e(e7);
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
        boolean[] zArr = eoVar.C6;
        if ((zArr[0] && (eoVar.L6 == 0 || zArr[1])) || z11) {
            z12 = ((org.telegram.ui.ActionBar.m2) eoVar).fragmentBeginToShow;
            eoVar.O6(z12);
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
            hg.c.v(str, sb2);
        }
        eo eoVar = this.Q;
        z11 = ((org.telegram.ui.ActionBar.m2) eoVar).fragmentBeginToShow;
        if (!z11) {
            eoVar.f37483x0.setItemAnimator(null);
        } else {
            s4.n0 itemAnimator = eoVar.f37483x0.getItemAnimator();
            ck ckVar = eoVar.f37496y0;
            if (itemAnimator != ckVar) {
                eoVar.f37483x0.setItemAnimator(ckVar);
            }
        }
        if (z10 && eoVar.f37496y0 != null) {
            s4.n0 itemAnimator2 = eoVar.f37483x0.getItemAnimator();
            ck ckVar2 = eoVar.f37496y0;
            if (itemAnimator2 == ckVar2) {
                s4.d1 K = eoVar.f37483x0.K(i10);
                if (K == null) {
                    ckVar2.getClass();
                } else {
                    ckVar2.S.add(K);
                    View view = K.f47897a;
                    if ((view instanceof org.telegram.ui.Cells.u1) && (messageObject = ((org.telegram.ui.Cells.u1) view).getMessageObject()) != null) {
                        messageObject.deletedByThanos = true;
                    }
                }
            }
        }
        S();
        try {
            super.u(i10);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void Q(int i10) {
        int i11;
        eo eoVar = this.Q;
        ArrayList arrayList = eoVar.f37449u6;
        if (eoVar.f37507z0 != null && !this.L && !this.N) {
            int i12 = 0;
            if (!eoVar.D4 && eoVar.J7 != null) {
                int childCount = eoVar.f37483x0.getChildCount();
                int i13 = 0;
                while (true) {
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = eoVar.f37483x0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
                        MessageObject messageObject2 = eoVar.J7;
                        if (messageObject == messageObject2) {
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                i11 = arrayList.indexOf(eoVar.J7) + this.J;
                                i12 = eoVar.Q8(childAt);
                            }
                        }
                    }
                    i13++;
                }
            }
            i11 = -1;
            m(i10);
            if (i11 != -1) {
                eoVar.f37507z0.h1(i11, i12);
            }
        }
    }

    public final org.telegram.ui.Cells.u1 R(MessageObject messageObject, boolean z10, boolean z11) {
        ArrayList arrayList;
        eo eoVar = this.Q;
        if (z10) {
            int childCount = eoVar.f37483x0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = eoVar.f37483x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var.getMessageObject() == messageObject && TextUtils.equals(u1Var.f7, u1Var.f23231y7.messageOwner.post_author)) {
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
            arrayList = eoVar.f37449u6;
        }
        int indexOf = arrayList.indexOf(messageObject2);
        if (indexOf == -1) {
            return null;
        }
        if (z11) {
            int i11 = eo.Jc;
            eo.Jc = i11 + 1;
            messageObject2.stableId = i11;
            O(true);
            return null;
        }
        Q(this.J + indexOf);
        return null;
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qm.S():void");
    }

    public final void T() {
        int i10 = this.f41353r;
        int i11 = this.f41355w;
        int i12 = this.f41357y;
        int i13 = this.f41354s;
        int i14 = this.v;
        int i15 = this.E;
        int i16 = this.F;
        int i17 = this.J;
        int i18 = this.K;
        int i19 = this.G;
        int i20 = this.H;
        int i21 = this.I;
        S();
        if (i10 == this.f41353r && i11 == this.f41355w && i15 == this.E && i16 == this.F && i17 == this.J && i18 == this.K && i13 == this.f41354s && i14 == this.v && i12 == this.f41357y && i19 == this.G && i20 == this.H && i21 == this.I) {
            return;
        }
        O(false);
    }

    @Override
    public final int h() {
        this.f41356x = -5;
        eo eoVar = this.Q;
        a0.i iVar = eoVar.f37241d8;
        if (eoVar.M5.get(eoVar.f37237d4, 0) != 0) {
            TLRPC.User user = eoVar.f37258f;
            if (user == null || !user.bot || eoVar.R3 != 0 || ((iVar.m() <= 0 || (((TL_bots.BotInfo) iVar.f(eoVar.f37258f.f19950id)).description == null && ((TL_bots.BotInfo) iVar.f(eoVar.f37258f.f19950id)).description_photo == null && ((TL_bots.BotInfo) iVar.f(eoVar.f37258f.f19950id)).description_document == null)) && !UserObject.isReplyUser(eoVar.f37258f) && !UserObject.isBotForum(eoVar.f37258f))) {
                return 0;
            }
            this.f41356x = 0;
            return 1;
        }
        return this.f41353r;
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList;
        eo eoVar = this.Q;
        if (eoVar.M5.get(eoVar.f37237d4, 0) == 0 || i10 != this.f41356x) {
            if (this.L) {
                arrayList = this.M;
            } else if (this.N) {
                arrayList = this.P;
            } else {
                arrayList = eoVar.f37449u6;
            }
            int i11 = this.J;
            if (i10 >= i11 && i10 < this.K) {
                return ((MessageObject) arrayList.get(i10 - i11)).stableId;
            }
            if (i10 != this.f41355w && i10 != this.f41356x) {
                if (i10 == this.E) {
                    return 2L;
                }
                if (i10 == this.F) {
                    return 3L;
                }
                if (i10 == this.f41354s) {
                    return 4L;
                }
                if (i10 == this.f41357y) {
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
        eo eoVar = this.Q;
        if (eoVar.M5.get(eoVar.f37237d4, 0) == 0 || i10 != this.f41356x) {
            if (i10 != this.f41354s && i10 != this.v) {
                int i11 = this.J;
                if (i10 >= i11 && i10 < this.K) {
                    if (this.L) {
                        arrayList = this.M;
                    } else if (this.N) {
                        arrayList = this.P;
                    } else {
                        arrayList = eoVar.f37449u6;
                    }
                    return ((MessageObject) arrayList.get(i10 - i11)).contentType;
                } else if (i10 == this.f41355w) {
                    return 3;
                } else {
                    if (i10 == this.f41357y) {
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
        eo eoVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.m2) eoVar).fragmentBeginToShow;
        if (z10 && !eoVar.N0) {
            s4.n0 itemAnimator = eoVar.f37483x0.getItemAnimator();
            ck ckVar = eoVar.f37496y0;
            if (itemAnimator != ckVar) {
                eoVar.f37483x0.setItemAnimator(ckVar);
            }
        } else {
            eoVar.f37483x0.setItemAnimator(null);
        }
        S();
        try {
            super.m(i10);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void o(int i10) {
        boolean z10;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item inserted " + i10);
        }
        eo eoVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.m2) eoVar).fragmentBeginToShow;
        if (!z10) {
            eoVar.f37483x0.setItemAnimator(null);
        } else {
            s4.n0 itemAnimator = eoVar.f37483x0.getItemAnimator();
            ck ckVar = eoVar.f37496y0;
            if (itemAnimator != ckVar) {
                eoVar.f37483x0.setItemAnimator(ckVar);
            }
        }
        S();
        try {
            super.o(i10);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void p(int i10, int i11) {
        boolean z10;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item moved" + i10 + ":" + i11);
        }
        eo eoVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.m2) eoVar).fragmentBeginToShow;
        if (!z10) {
            eoVar.f37483x0.setItemAnimator(null);
        } else {
            s4.n0 itemAnimator = eoVar.f37483x0.getItemAnimator();
            ck ckVar = eoVar.f37496y0;
            if (itemAnimator != ckVar) {
                eoVar.f37483x0.setItemAnimator(ckVar);
            }
        }
        S();
        try {
            super.p(i10, i11);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void q(int i10, int i11) {
        boolean z10;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range changed " + i10 + ":" + i11);
        }
        eo eoVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.m2) eoVar).fragmentBeginToShow;
        if (!z10) {
            eoVar.f37483x0.setItemAnimator(null);
        } else {
            s4.n0 itemAnimator = eoVar.f37483x0.getItemAnimator();
            ck ckVar = eoVar.f37496y0;
            if (itemAnimator != ckVar) {
                eoVar.f37483x0.setItemAnimator(ckVar);
            }
        }
        S();
        try {
            super.q(i10, i11);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void s(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        eo eoVar = this.Q;
        ArrayList arrayList = eoVar.f37449u6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range inserted " + i10 + ":" + i11);
        }
        z10 = ((org.telegram.ui.ActionBar.m2) eoVar).fragmentBeginToShow;
        if (!z10) {
            eoVar.f37483x0.setItemAnimator(null);
        } else {
            s4.n0 itemAnimator = eoVar.f37483x0.getItemAnimator();
            ck ckVar = eoVar.f37496y0;
            if (itemAnimator != ckVar) {
                eoVar.f37483x0.setItemAnimator(ckVar);
            }
        }
        S();
        if (i10 == 1 && i11 > 0 && (i12 = i10 + i11) >= (i13 = this.J) && i12 < this.K) {
            MessageObject messageObject = (MessageObject) arrayList.get(i12 - i13);
            MessageObject messageObject2 = (MessageObject) arrayList.get((i12 - this.J) - 1);
            if ((eoVar.f37246e != null && messageObject.getFromChatId() == messageObject2.getFromChatId()) || (eoVar.f37258f != null && messageObject.isOutOwner() == messageObject2.isOutOwner())) {
                m(i10);
            }
        }
        try {
            super.s(i10, i11);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void t(int i10, int i11) {
        boolean z10;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range removed" + i10 + ":" + i11);
        }
        eo eoVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.m2) eoVar).fragmentBeginToShow;
        if (!z10) {
            eoVar.f37483x0.setItemAnimator(null);
        } else {
            s4.n0 itemAnimator = eoVar.f37483x0.getItemAnimator();
            ck ckVar = eoVar.f37496y0;
            if (itemAnimator != ckVar) {
                eoVar.f37483x0.setItemAnimator(ckVar);
            }
        }
        S();
        try {
            super.t(i10, i11);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void u(int i10) {
        boolean z10;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item removed " + i10);
        }
        eo eoVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.m2) eoVar).fragmentBeginToShow;
        if (!z10) {
            eoVar.f37483x0.setItemAnimator(null);
        } else {
            s4.n0 itemAnimator = eoVar.f37483x0.getItemAnimator();
            ck ckVar = eoVar.f37496y0;
            if (itemAnimator != ckVar) {
                eoVar.f37483x0.setItemAnimator(ckVar);
            }
        }
        S();
        try {
            super.u(i10);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void v(s4.d1 r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qm.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u1 u1Var;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.Cells.u1 u1Var2;
        int i14;
        eo eoVar = this.Q;
        if (i10 == 0) {
            i14 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
            u1Var = new org.telegram.ui.Cells.u1(this.h, i14, true, eoVar.Ca, eoVar.f37256ea);
            u1Var.setResourcesProvider(eoVar.f37256ea);
            if (eoVar.f37390pc == null) {
                eoVar.f37390pc = new pn(eoVar);
            }
            u1Var.setDelegate(eoVar.f37390pc);
            u1Var.Pd = eoVar.Pb;
            if (eoVar.h == null) {
                u1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i10 == 1) {
                ?? w0Var = new org.telegram.ui.Cells.w0(context, eoVar.f37256ea, true);
                w0Var.setInvalidateColors(true);
                w0Var.setDelegate(new hm(this));
                u1Var = w0Var;
            } else {
                if (i10 == 2) {
                    u1Var2 = new org.telegram.ui.Cells.w1(context, eoVar.f37256ea);
                } else if (i10 == 3) {
                    i13 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
                    ?? imVar = new im(this, context, i13, eoVar.f37256ea);
                    imVar.setDelegate(new z0(this, 20));
                    u1Var2 = imVar;
                } else if (i10 == 4) {
                    u1Var2 = new org.telegram.ui.Cells.z0(context, eoVar.f37256ea);
                } else if (i10 == 6) {
                    i12 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
                    u1Var2 = new org.telegram.ui.Cells.za(context, i12, eoVar.f37256ea);
                } else if (i10 == 7) {
                    u1Var2 = new org.telegram.ui.Cells.w0(context, eoVar.f37256ea, false);
                } else if (i10 == 8) {
                    i11 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
                    u1Var2 = new jm(this, context, i11, eoVar.f37256ea);
                } else if (i10 == 10) {
                    ?? v1Var = new org.telegram.ui.Cells.v1(context, eoVar.f37256ea);
                    if (eoVar.f37390pc == null) {
                        eoVar.f37390pc = new pn(eoVar);
                    }
                    v1Var.setDelegate(eoVar.f37390pc);
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
    public final void y(s4.d1 d1Var) {
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
        View view = d1Var.f47897a;
        boolean z20 = view instanceof org.telegram.ui.Cells.u1;
        eo eoVar = this.Q;
        if (z20 || (view instanceof org.telegram.ui.Cells.w0)) {
            eoVar.w9();
        }
        boolean z21 = view instanceof org.telegram.ui.Cells.u1;
        if (z21) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            MessageObject messageObject = u1Var.getMessageObject();
            u1Var.E8 = eoVar.y9();
            u1Var.F8 = eoVar.H9();
            u1Var.G8 = eoVar.G9();
            u1Var.H8 = eoVar.V8();
            u1Var.I8 = eoVar.W8();
            u1Var.g4(-1, true, false);
            MessageObject messageObject2 = eoVar.G3;
            if (messageObject2 != null && messageObject2.equals(messageObject)) {
                u1Var.g4(eoVar.H3, false, false);
            }
            if (messageObject.isAnimatedEmoji() && (stickerEmoji = messageObject.getStickerEmoji()) != null && (emojiSound = eoVar.getMessagesController().emojiSounds.get(stickerEmoji.replace("️", ""))) != null) {
                eoVar.getMediaController().playEmojiSound(eoVar.getAccountInstance(), stickerEmoji, emojiSound, true);
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
            kVar = ((org.telegram.ui.ActionBar.m2) eoVar).actionBar;
            if (!kVar.u() && !eoVar.F9()) {
                u1Var.setDrawSelectionBackground(false);
                u1Var.L3(false, false, false);
                u1Var.J3(false, false);
                z13 = false;
                z14 = false;
            } else {
                eoVar.N7 = false;
                eoVar.O7 = 0L;
                eoVar.P7 = null;
                ArrayList arrayList2 = eoVar.f37197a4;
                if (arrayList2 != null && arrayList2.contains(messageObject)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                u1Var.J3(z12, false);
                if (messageObject.getDialogId() == eoVar.T5) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if (eoVar.W5[i10].indexOfKey(messageObject.getId()) >= 0) {
                    eoVar.lb(messageObject, u1Var, i10, false);
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
            if (eoVar.R3 == 7 && eoVar.f37446u3 != null && (str = eoVar.f37434t3) != null) {
                u1Var.S3(str);
            } else {
                vk vkVar = eoVar.R2;
                if (vkVar != null && vkVar.getVisibility() == 0) {
                    MediaDataController mediaDataController = eoVar.getMediaDataController();
                    int id2 = messageObject.getId();
                    if (messageObject.getDialogId() == eoVar.L6) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (mediaDataController.isMessageFound(id2, z16) && eoVar.getMediaDataController().getLastSearchQuery() != null) {
                        u1Var.S3(eoVar.getMediaDataController().getLastSearchQuery());
                    }
                }
                u1Var.S3(null);
            }
            z17 = ((org.telegram.ui.ActionBar.m2) eoVar).inPreviewMode;
            if (!z17 || !u1Var.f22960f8) {
                if (eoVar.L7 != Integer.MAX_VALUE && ((u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == eoVar.L7) || (u1Var.getCurrentMessagesGroup() != null && u1Var.getCurrentMessagesGroup().contains(eoVar.L7)))) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                u1Var.setHighlighted(z18);
                boolean z23 = u1Var.f22960f8;
                if (z23 && eoVar.P7 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String str2 = eoVar.P7;
                    int i12 = eoVar.S7;
                    if (!eoVar.N7 && currentTimeMillis - eoVar.O7 >= 200) {
                        z19 = false;
                    } else {
                        z19 = true;
                    }
                    if (!u1Var.T3(str2, true, z19, i12) && eoVar.M7) {
                        org.telegram.ui.Components.zc.a0(eoVar).Q(R.raw.error, 36, LocaleController.getString(R.string.QuoteNotFound)).k(true);
                    }
                    eoVar.M7 = false;
                    if (eoVar.N7) {
                        eoVar.O7 = currentTimeMillis;
                    }
                    eoVar.N7 = false;
                } else if (z23 && (num = eoVar.Q7) != null) {
                    u1Var.R3(num.intValue());
                } else if (z23 && (bArr = eoVar.R7) != null) {
                    u1Var.P3(bArr);
                }
                if (eoVar.L7 != Integer.MAX_VALUE) {
                    eoVar.dc();
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
            w0Var.f23354e0 = eoVar.y9();
            w0Var.f23367i0 = eoVar.H9();
            eoVar.G9();
            eoVar.V8();
            w0Var.f23370j0 = eoVar.W8();
        } else if (view instanceof org.telegram.ui.Cells.w1) {
            ((org.telegram.ui.Cells.w1) view).getTextView().setTranslationX(eoVar.W8() / 2.0f);
        }
        int b10 = d1Var.b();
        int i13 = this.J;
        if (b10 >= i13 && b10 < this.K) {
            if (this.L) {
                arrayList = this.M;
            } else if (this.N) {
                arrayList = this.P;
            } else {
                arrayList = eoVar.f37449u6;
            }
            MessageObject messageObject3 = (MessageObject) arrayList.get(b10 - i13);
            if (messageObject3 != null && (message = messageObject3.messageOwner) != null && message.media_unread && message.mentioned) {
                z10 = ((org.telegram.ui.ActionBar.m2) eoVar).inPreviewMode;
                if (!z10 && eoVar.R3 == 0 && !messageObject3.isVoice() && !messageObject3.isRoundVideo()) {
                    int i14 = eoVar.f37336l6 - 1;
                    eoVar.f37336l6 = i14;
                    if (i14 <= 0) {
                        eoVar.f37336l6 = 0;
                        eoVar.f37348m6 = true;
                        eoVar.Ob(false);
                    } else {
                        eoVar.f37308j1.e(2, i14, true);
                    }
                    MessagesController messagesController = eoVar.getMessagesController();
                    int id3 = messageObject3.getId();
                    if (ChatObject.isChannel(eoVar.f37246e)) {
                        j3 = eoVar.f37246e.f19803id;
                    } else {
                        j3 = 0;
                    }
                    messagesController.markMentionMessageAsRead(id3, j3, eoVar.T5);
                    messageObject3.setContentIsRead();
                }
                if (z21) {
                    org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) view;
                    z11 = ((org.telegram.ui.ActionBar.m2) eoVar).inPreviewMode;
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
