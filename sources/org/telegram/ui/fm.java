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
public final class fm extends org.telegram.ui.Components.jl0 {
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
    public final sn Q;
    public final Context h;
    public final boolean f36950n;
    public int f36951r;
    public int f36952s;
    public int v;
    public int f36953w;
    public int f36954x;
    public int f36955y;

    public fm(sn snVar, Context context) {
        boolean z10;
        this.Q = snVar;
        this.e = new ArrayList();
        this.f27555f = new ArrayList();
        this.f36952s = -5;
        this.v = -5;
        this.f36953w = -5;
        this.f36954x = -5;
        this.f36955y = -5;
        this.E = -5;
        this.F = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.h = context;
        TLRPC.User user = snVar.f41208f;
        if (user != null && user.bot) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36950n = z10;
        C(true);
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    public final void K(boolean z10) {
        sn snVar = this.Q;
        if (UserObject.isBotForum(snVar.f41208f)) {
            if (z10) {
                snVar.f41318nc = true;
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
        return this.Q.f41400u6;
    }

    public final void M(MessageObject messageObject) {
        sn snVar = this.Q;
        int childCount = snVar.f41433x0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = snVar.f41433x0.getChildAt(i10);
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
        sn snVar = this.Q;
        if (UserObject.isBotForumWithEditableTopics(snVar.f41208f) && snVar.d() == 0 && !snVar.f41318nc && snVar.R3 == 0) {
            return true;
        }
        return false;
    }

    public final void O(boolean z10) {
        boolean z11;
        boolean z12;
        sn snVar = this.Q;
        ArrayList arrayList = snVar.f41400u6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify data set changed fragmentOpened=" + snVar.O5);
        }
        if (z10 && snVar.O5) {
            s4.l0 itemAnimator = snVar.f41433x0.getItemAnimator();
            rj rjVar = snVar.f41447y0;
            if (itemAnimator != rjVar) {
                snVar.f41433x0.setItemAnimator(rjVar);
            }
        } else {
            snVar.f41433x0.setItemAnimator(null);
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
        boolean[] zArr = snVar.C6;
        if ((zArr[0] && (snVar.L6 == 0 || zArr[1])) || z11) {
            z12 = ((org.telegram.ui.ActionBar.n2) snVar).fragmentBeginToShow;
            snVar.O6(z12);
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
            i0.a.v(str, sb2);
        }
        sn snVar = this.Q;
        z11 = ((org.telegram.ui.ActionBar.n2) snVar).fragmentBeginToShow;
        if (!z11) {
            snVar.f41433x0.setItemAnimator(null);
        } else {
            s4.l0 itemAnimator = snVar.f41433x0.getItemAnimator();
            rj rjVar = snVar.f41447y0;
            if (itemAnimator != rjVar) {
                snVar.f41433x0.setItemAnimator(rjVar);
            }
        }
        if (z10 && snVar.f41447y0 != null) {
            s4.l0 itemAnimator2 = snVar.f41433x0.getItemAnimator();
            rj rjVar2 = snVar.f41447y0;
            if (itemAnimator2 == rjVar2) {
                s4.b1 K = snVar.f41433x0.K(i10);
                if (K == null) {
                    rjVar2.getClass();
                } else {
                    rjVar2.S.add(K);
                    View view = K.f45938a;
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
        sn snVar = this.Q;
        ArrayList arrayList = snVar.f41400u6;
        if (snVar.f41458z0 != null && !this.L && !this.N) {
            int i12 = 0;
            if (!snVar.D4 && snVar.J7 != null) {
                int childCount = snVar.f41433x0.getChildCount();
                int i13 = 0;
                while (true) {
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = snVar.f41433x0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
                        MessageObject messageObject2 = snVar.J7;
                        if (messageObject == messageObject2) {
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                i11 = arrayList.indexOf(snVar.J7) + this.J;
                                i12 = snVar.Q8(childAt);
                            }
                        }
                    }
                    i13++;
                }
            }
            i11 = -1;
            m(i10);
            if (i11 != -1) {
                snVar.f41458z0.h1(i11, i12);
            }
        }
    }

    public final org.telegram.ui.Cells.u1 R(MessageObject messageObject, boolean z10, boolean z11) {
        ArrayList arrayList;
        sn snVar = this.Q;
        if (z10) {
            int childCount = snVar.f41433x0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = snVar.f41433x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var.getMessageObject() == messageObject && TextUtils.equals(u1Var.f7, u1Var.f23561y7.messageOwner.post_author)) {
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
            arrayList = snVar.f41400u6;
        }
        int indexOf = arrayList.indexOf(messageObject2);
        if (indexOf == -1) {
            return null;
        }
        if (z11) {
            int i11 = sn.Jc;
            sn.Jc = i11 + 1;
            messageObject2.stableId = i11;
            O(true);
            return null;
        }
        Q(this.J + indexOf);
        return null;
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fm.S():void");
    }

    public final void T() {
        int i10 = this.f36951r;
        int i11 = this.f36953w;
        int i12 = this.f36955y;
        int i13 = this.f36952s;
        int i14 = this.v;
        int i15 = this.E;
        int i16 = this.F;
        int i17 = this.J;
        int i18 = this.K;
        int i19 = this.G;
        int i20 = this.H;
        int i21 = this.I;
        S();
        if (i10 == this.f36951r && i11 == this.f36953w && i15 == this.E && i16 == this.F && i17 == this.J && i18 == this.K && i13 == this.f36952s && i14 == this.v && i12 == this.f36955y && i19 == this.G && i20 == this.H && i21 == this.I) {
            return;
        }
        O(false);
    }

    @Override
    public final int h() {
        this.f36954x = -5;
        sn snVar = this.Q;
        a0.h hVar = snVar.f41192d8;
        if (snVar.M5.get(snVar.f41188d4, 0) != 0) {
            TLRPC.User user = snVar.f41208f;
            if (user == null || !user.bot || snVar.R3 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(snVar.f41208f.f20419id)).description == null && ((TL_bots.BotInfo) hVar.f(snVar.f41208f.f20419id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(snVar.f41208f.f20419id)).description_document == null)) && !UserObject.isReplyUser(snVar.f41208f) && !UserObject.isBotForum(snVar.f41208f))) {
                return 0;
            }
            this.f36954x = 0;
            return 1;
        }
        return this.f36951r;
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList;
        sn snVar = this.Q;
        if (snVar.M5.get(snVar.f41188d4, 0) == 0 || i10 != this.f36954x) {
            if (this.L) {
                arrayList = this.M;
            } else if (this.N) {
                arrayList = this.P;
            } else {
                arrayList = snVar.f41400u6;
            }
            int i11 = this.J;
            if (i10 >= i11 && i10 < this.K) {
                return ((MessageObject) arrayList.get(i10 - i11)).stableId;
            }
            if (i10 != this.f36953w && i10 != this.f36954x) {
                if (i10 == this.E) {
                    return 2L;
                }
                if (i10 == this.F) {
                    return 3L;
                }
                if (i10 == this.f36952s) {
                    return 4L;
                }
                if (i10 == this.f36955y) {
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
        sn snVar = this.Q;
        if (snVar.M5.get(snVar.f41188d4, 0) == 0 || i10 != this.f36954x) {
            if (i10 != this.f36952s && i10 != this.v) {
                int i11 = this.J;
                if (i10 >= i11 && i10 < this.K) {
                    if (this.L) {
                        arrayList = this.M;
                    } else if (this.N) {
                        arrayList = this.P;
                    } else {
                        arrayList = snVar.f41400u6;
                    }
                    return ((MessageObject) arrayList.get(i10 - i11)).contentType;
                } else if (i10 == this.f36953w) {
                    return 3;
                } else {
                    if (i10 == this.f36955y) {
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
        sn snVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) snVar).fragmentBeginToShow;
        if (z10 && !snVar.N0) {
            s4.l0 itemAnimator = snVar.f41433x0.getItemAnimator();
            rj rjVar = snVar.f41447y0;
            if (itemAnimator != rjVar) {
                snVar.f41433x0.setItemAnimator(rjVar);
            }
        } else {
            snVar.f41433x0.setItemAnimator(null);
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
        sn snVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) snVar).fragmentBeginToShow;
        if (!z10) {
            snVar.f41433x0.setItemAnimator(null);
        } else {
            s4.l0 itemAnimator = snVar.f41433x0.getItemAnimator();
            rj rjVar = snVar.f41447y0;
            if (itemAnimator != rjVar) {
                snVar.f41433x0.setItemAnimator(rjVar);
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
        sn snVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) snVar).fragmentBeginToShow;
        if (!z10) {
            snVar.f41433x0.setItemAnimator(null);
        } else {
            s4.l0 itemAnimator = snVar.f41433x0.getItemAnimator();
            rj rjVar = snVar.f41447y0;
            if (itemAnimator != rjVar) {
                snVar.f41433x0.setItemAnimator(rjVar);
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
        sn snVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) snVar).fragmentBeginToShow;
        if (!z10) {
            snVar.f41433x0.setItemAnimator(null);
        } else {
            s4.l0 itemAnimator = snVar.f41433x0.getItemAnimator();
            rj rjVar = snVar.f41447y0;
            if (itemAnimator != rjVar) {
                snVar.f41433x0.setItemAnimator(rjVar);
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
        sn snVar = this.Q;
        ArrayList arrayList = snVar.f41400u6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range inserted " + i10 + ":" + i11);
        }
        z10 = ((org.telegram.ui.ActionBar.n2) snVar).fragmentBeginToShow;
        if (!z10) {
            snVar.f41433x0.setItemAnimator(null);
        } else {
            s4.l0 itemAnimator = snVar.f41433x0.getItemAnimator();
            rj rjVar = snVar.f41447y0;
            if (itemAnimator != rjVar) {
                snVar.f41433x0.setItemAnimator(rjVar);
            }
        }
        S();
        if (i10 == 1 && i11 > 0 && (i12 = i10 + i11) >= (i13 = this.J) && i12 < this.K) {
            MessageObject messageObject = (MessageObject) arrayList.get(i12 - i13);
            MessageObject messageObject2 = (MessageObject) arrayList.get((i12 - this.J) - 1);
            if ((snVar.e != null && messageObject.getFromChatId() == messageObject2.getFromChatId()) || (snVar.f41208f != null && messageObject.isOutOwner() == messageObject2.isOutOwner())) {
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
        sn snVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) snVar).fragmentBeginToShow;
        if (!z10) {
            snVar.f41433x0.setItemAnimator(null);
        } else {
            s4.l0 itemAnimator = snVar.f41433x0.getItemAnimator();
            rj rjVar = snVar.f41447y0;
            if (itemAnimator != rjVar) {
                snVar.f41433x0.setItemAnimator(rjVar);
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
        sn snVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) snVar).fragmentBeginToShow;
        if (!z10) {
            snVar.f41433x0.setItemAnimator(null);
        } else {
            s4.l0 itemAnimator = snVar.f41433x0.getItemAnimator();
            rj rjVar = snVar.f41447y0;
            if (itemAnimator != rjVar) {
                snVar.f41433x0.setItemAnimator(rjVar);
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
    public final void v(s4.b1 r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fm.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u1 u1Var;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.Cells.u1 u1Var2;
        int i14;
        sn snVar = this.Q;
        if (i10 == 0) {
            i14 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
            u1Var = new org.telegram.ui.Cells.u1(this.h, i14, true, snVar.Ca, snVar.f41205ea);
            u1Var.setResourcesProvider(snVar.f41205ea);
            if (snVar.f41340pc == null) {
                snVar.f41340pc = new en(snVar);
            }
            u1Var.setDelegate(snVar.f41340pc);
            u1Var.Pd = snVar.Pb;
            if (snVar.h == null) {
                u1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i10 == 1) {
                ?? x0Var = new org.telegram.ui.Cells.x0(context, snVar.f41205ea, true);
                x0Var.setInvalidateColors(true);
                x0Var.setDelegate(new wl(this));
                u1Var = x0Var;
            } else {
                if (i10 == 2) {
                    u1Var2 = new org.telegram.ui.Cells.w1(context, snVar.f41205ea);
                } else if (i10 == 3) {
                    i13 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                    ?? xlVar = new xl(this, context, i13, snVar.f41205ea);
                    xlVar.setDelegate(new b1(this, 20));
                    u1Var2 = xlVar;
                } else if (i10 == 4) {
                    u1Var2 = new org.telegram.ui.Cells.a1(context, snVar.f41205ea);
                } else if (i10 == 6) {
                    i12 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                    u1Var2 = new org.telegram.ui.Cells.xa(context, i12, snVar.f41205ea);
                } else if (i10 == 7) {
                    u1Var2 = new org.telegram.ui.Cells.x0(context, snVar.f41205ea, false);
                } else if (i10 == 8) {
                    i11 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                    u1Var2 = new yl(this, context, i11, snVar.f41205ea);
                } else if (i10 == 10) {
                    ?? v1Var = new org.telegram.ui.Cells.v1(context, snVar.f41205ea);
                    if (snVar.f41340pc == null) {
                        snVar.f41340pc = new en(snVar);
                    }
                    v1Var.setDelegate(snVar.f41340pc);
                    u1Var2 = v1Var;
                } else {
                    u1Var = null;
                }
                u1Var = u1Var2;
            }
        }
        return com.google.android.gms.internal.cast.a6.l(u1Var, u1Var, -1, -2);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        ArrayList arrayList;
        TLRPC.Message message;
        boolean z10;
        boolean z11;
        long j10;
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
        View view = b1Var.f45938a;
        boolean z20 = view instanceof org.telegram.ui.Cells.u1;
        sn snVar = this.Q;
        if (z20 || (view instanceof org.telegram.ui.Cells.x0)) {
            snVar.w9();
        }
        boolean z21 = view instanceof org.telegram.ui.Cells.u1;
        if (z21) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            MessageObject messageObject = u1Var.getMessageObject();
            u1Var.E8 = snVar.y9();
            u1Var.F8 = snVar.H9();
            u1Var.G8 = snVar.G9();
            u1Var.H8 = snVar.V8();
            u1Var.I8 = snVar.W8();
            u1Var.g4(-1, true, false);
            MessageObject messageObject2 = snVar.G3;
            if (messageObject2 != null && messageObject2.equals(messageObject)) {
                u1Var.g4(snVar.H3, false, false);
            }
            if (messageObject.isAnimatedEmoji() && (stickerEmoji = messageObject.getStickerEmoji()) != null && (emojiSound = snVar.getMessagesController().emojiSounds.get(stickerEmoji.replace("️", ""))) != null) {
                snVar.getMediaController().playEmojiSound(snVar.getAccountInstance(), stickerEmoji, emojiSound, true);
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
            kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
            if (!kVar.s() && !snVar.F9()) {
                u1Var.setDrawSelectionBackground(false);
                u1Var.L3(false, false, false);
                u1Var.J3(false, false);
                z13 = false;
                z14 = false;
            } else {
                snVar.N7 = false;
                snVar.O7 = 0L;
                snVar.P7 = null;
                ArrayList arrayList2 = snVar.f41147a4;
                if (arrayList2 != null && arrayList2.contains(messageObject)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                u1Var.J3(z12, false);
                if (messageObject.getDialogId() == snVar.T5) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if (snVar.W5[i10].indexOfKey(messageObject.getId()) >= 0) {
                    snVar.lb(messageObject, u1Var, i10, false);
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
            if (snVar.R3 == 7 && snVar.f41397u3 != null && (str = snVar.f41384t3) != null) {
                u1Var.S3(str);
            } else {
                kk kkVar = snVar.R2;
                if (kkVar != null && kkVar.getVisibility() == 0) {
                    MediaDataController mediaDataController = snVar.getMediaDataController();
                    int id2 = messageObject.getId();
                    if (messageObject.getDialogId() == snVar.L6) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (mediaDataController.isMessageFound(id2, z16) && snVar.getMediaDataController().getLastSearchQuery() != null) {
                        u1Var.S3(snVar.getMediaDataController().getLastSearchQuery());
                    }
                }
                u1Var.S3(null);
            }
            z17 = ((org.telegram.ui.ActionBar.n2) snVar).inPreviewMode;
            if (!z17 || !u1Var.f23289f8) {
                if (snVar.L7 != Integer.MAX_VALUE && ((u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == snVar.L7) || (u1Var.getCurrentMessagesGroup() != null && u1Var.getCurrentMessagesGroup().contains(snVar.L7)))) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                u1Var.setHighlighted(z18);
                boolean z23 = u1Var.f23289f8;
                if (z23 && snVar.P7 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String str2 = snVar.P7;
                    int i12 = snVar.S7;
                    if (!snVar.N7 && currentTimeMillis - snVar.O7 >= 200) {
                        z19 = false;
                    } else {
                        z19 = true;
                    }
                    if (!u1Var.T3(str2, true, z19, i12) && snVar.M7) {
                        org.telegram.ui.Components.xc.a0(snVar).Q(R.raw.error, 36, LocaleController.getString(R.string.QuoteNotFound)).k(true);
                    }
                    snVar.M7 = false;
                    if (snVar.N7) {
                        snVar.O7 = currentTimeMillis;
                    }
                    snVar.N7 = false;
                } else if (z23 && (num = snVar.Q7) != null) {
                    u1Var.R3(num.intValue());
                } else if (z23 && (bArr = snVar.R7) != null) {
                    u1Var.P3(bArr);
                }
                if (snVar.L7 != Integer.MAX_VALUE) {
                    snVar.dc();
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.x0) {
            org.telegram.ui.Cells.x0 x0Var = (org.telegram.ui.Cells.x0) view;
            x0Var.f23724e0 = snVar.y9();
            x0Var.f23737i0 = snVar.H9();
            snVar.G9();
            snVar.V8();
            x0Var.f23740j0 = snVar.W8();
        } else if (view instanceof org.telegram.ui.Cells.w1) {
            ((org.telegram.ui.Cells.w1) view).getTextView().setTranslationX(snVar.W8() / 2.0f);
        }
        int b10 = b1Var.b();
        int i13 = this.J;
        if (b10 >= i13 && b10 < this.K) {
            if (this.L) {
                arrayList = this.M;
            } else if (this.N) {
                arrayList = this.P;
            } else {
                arrayList = snVar.f41400u6;
            }
            MessageObject messageObject3 = (MessageObject) arrayList.get(b10 - i13);
            if (messageObject3 != null && (message = messageObject3.messageOwner) != null && message.media_unread && message.mentioned) {
                z10 = ((org.telegram.ui.ActionBar.n2) snVar).inPreviewMode;
                if (!z10 && snVar.R3 == 0 && !messageObject3.isVoice() && !messageObject3.isRoundVideo()) {
                    int i14 = snVar.f41286l6 - 1;
                    snVar.f41286l6 = i14;
                    if (i14 <= 0) {
                        snVar.f41286l6 = 0;
                        snVar.f41298m6 = true;
                        snVar.Ob(false);
                    } else {
                        snVar.f41257j1.c(2, i14, true);
                    }
                    MessagesController messagesController = snVar.getMessagesController();
                    int id3 = messageObject3.getId();
                    if (ChatObject.isChannel(snVar.e)) {
                        j10 = snVar.e.f20272id;
                    } else {
                        j10 = 0;
                    }
                    messagesController.markMentionMessageAsRead(id3, j10, snVar.T5);
                    messageObject3.setContentIsRead();
                }
                if (z21) {
                    org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) view;
                    z11 = ((org.telegram.ui.ActionBar.n2) snVar).inPreviewMode;
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
