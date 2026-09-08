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
public final class om extends org.telegram.ui.Components.mk0 {
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
    public final co Q;
    public final Context h;
    public final boolean f39303n;
    public int f39304r;
    public int f39305s;
    public int v;
    public int f39306w;
    public int f39307x;
    public int f39308y;

    public om(co coVar, Context context) {
        boolean z10;
        this.Q = coVar;
        this.f28490e = new ArrayList();
        this.f28491f = new ArrayList();
        this.f39305s = -5;
        this.v = -5;
        this.f39306w = -5;
        this.f39307x = -5;
        this.f39308y = -5;
        this.E = -5;
        this.F = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.h = context;
        TLRPC.User user = coVar.f35276f;
        if (user != null && user.bot) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f39303n = z10;
        C(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void K(boolean z10) {
        co coVar = this.Q;
        if (UserObject.isBotForum(coVar.f35276f)) {
            if (z10) {
                coVar.nc = true;
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
        return this.Q.f35467u6;
    }

    public final void M(MessageObject messageObject) {
        co coVar = this.Q;
        int childCount = coVar.f35500x0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = coVar.f35500x0.getChildAt(i10);
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
        co coVar = this.Q;
        if (UserObject.isBotForumWithEditableTopics(coVar.f35276f) && coVar.d() == 0 && !coVar.nc && coVar.R3 == 0) {
            return true;
        }
        return false;
    }

    public final void O(boolean z10) {
        boolean z11;
        boolean z12;
        co coVar = this.Q;
        ArrayList arrayList = coVar.f35467u6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify data set changed fragmentOpened=" + coVar.O5);
        }
        if (z10 && coVar.O5) {
            s4.m0 itemAnimator = coVar.f35500x0.getItemAnimator();
            wj wjVar = coVar.f35513y0;
            if (itemAnimator != wjVar) {
                coVar.f35500x0.setItemAnimator(wjVar);
            }
        } else {
            coVar.f35500x0.setItemAnimator(null);
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
        boolean[] zArr = coVar.C6;
        if ((zArr[0] && (coVar.L6 == 0 || zArr[1])) || z11) {
            z12 = ((org.telegram.ui.ActionBar.n2) coVar).fragmentBeginToShow;
            coVar.L6(z12);
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
        co coVar = this.Q;
        z11 = ((org.telegram.ui.ActionBar.n2) coVar).fragmentBeginToShow;
        if (!z11) {
            coVar.f35500x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = coVar.f35500x0.getItemAnimator();
            wj wjVar = coVar.f35513y0;
            if (itemAnimator != wjVar) {
                coVar.f35500x0.setItemAnimator(wjVar);
            }
        }
        if (z10 && coVar.f35513y0 != null) {
            s4.m0 itemAnimator2 = coVar.f35500x0.getItemAnimator();
            wj wjVar2 = coVar.f35513y0;
            if (itemAnimator2 == wjVar2) {
                s4.c1 K = coVar.f35500x0.K(i10);
                if (K == null) {
                    wjVar2.getClass();
                } else {
                    wjVar2.S.add(K);
                    View view = K.f45766a;
                    if ((view instanceof org.telegram.ui.Cells.t1) && (messageObject = ((org.telegram.ui.Cells.t1) view).getMessageObject()) != null) {
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
        co coVar = this.Q;
        ArrayList arrayList = coVar.f35467u6;
        if (coVar.f35525z0 != null && !this.L && !this.N) {
            int i12 = 0;
            if (!coVar.D4 && coVar.J7 != null) {
                int childCount = coVar.f35500x0.getChildCount();
                int i13 = 0;
                while (true) {
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = coVar.f35500x0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                        MessageObject messageObject2 = coVar.J7;
                        if (messageObject == messageObject2) {
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                i11 = arrayList.indexOf(coVar.J7) + this.J;
                                i12 = coVar.L8(childAt);
                            }
                        }
                    }
                    i13++;
                }
            }
            i11 = -1;
            m(i10);
            if (i11 != -1) {
                coVar.f35525z0.h1(i11, i12);
            }
        }
    }

    public final org.telegram.ui.Cells.t1 R(MessageObject messageObject, boolean z10, boolean z11) {
        ArrayList arrayList;
        co coVar = this.Q;
        if (z10) {
            int childCount = coVar.f35500x0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = coVar.f35500x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject() == messageObject && TextUtils.equals(t1Var.f7, t1Var.f23232y7.messageOwner.post_author)) {
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
            arrayList = coVar.f35467u6;
        }
        int indexOf = arrayList.indexOf(messageObject2);
        if (indexOf == -1) {
            return null;
        }
        if (z11) {
            int i11 = co.Jc;
            co.Jc = i11 + 1;
            messageObject2.stableId = i11;
            O(true);
            return null;
        }
        Q(this.J + indexOf);
        return null;
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.om.S():void");
    }

    public final void T() {
        int i10 = this.f39304r;
        int i11 = this.f39306w;
        int i12 = this.f39308y;
        int i13 = this.f39305s;
        int i14 = this.v;
        int i15 = this.E;
        int i16 = this.F;
        int i17 = this.J;
        int i18 = this.K;
        int i19 = this.G;
        int i20 = this.H;
        int i21 = this.I;
        S();
        if (i10 == this.f39304r && i11 == this.f39306w && i15 == this.E && i16 == this.F && i17 == this.J && i18 == this.K && i13 == this.f39305s && i14 == this.v && i12 == this.f39308y && i19 == this.G && i20 == this.H && i21 == this.I) {
            return;
        }
        O(false);
    }

    @Override
    public final int h() {
        this.f39307x = -5;
        co coVar = this.Q;
        a0.i iVar = coVar.f35259d8;
        if (coVar.M5.get(coVar.f35255d4, 0) != 0) {
            TLRPC.User user = coVar.f35276f;
            if (user == null || !user.bot || coVar.R3 != 0 || ((iVar.m() <= 0 || (((TL_bots.BotInfo) iVar.f(coVar.f35276f.f20043id)).description == null && ((TL_bots.BotInfo) iVar.f(coVar.f35276f.f20043id)).description_photo == null && ((TL_bots.BotInfo) iVar.f(coVar.f35276f.f20043id)).description_document == null)) && !UserObject.isReplyUser(coVar.f35276f) && !UserObject.isBotForum(coVar.f35276f))) {
                return 0;
            }
            this.f39307x = 0;
            return 1;
        }
        return this.f39304r;
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList;
        co coVar = this.Q;
        if (coVar.M5.get(coVar.f35255d4, 0) == 0 || i10 != this.f39307x) {
            if (this.L) {
                arrayList = this.M;
            } else if (this.N) {
                arrayList = this.P;
            } else {
                arrayList = coVar.f35467u6;
            }
            int i11 = this.J;
            if (i10 >= i11 && i10 < this.K) {
                return ((MessageObject) arrayList.get(i10 - i11)).stableId;
            }
            if (i10 != this.f39306w && i10 != this.f39307x) {
                if (i10 == this.E) {
                    return 2L;
                }
                if (i10 == this.F) {
                    return 3L;
                }
                if (i10 == this.f39305s) {
                    return 4L;
                }
                if (i10 == this.f39308y) {
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
        co coVar = this.Q;
        if (coVar.M5.get(coVar.f35255d4, 0) == 0 || i10 != this.f39307x) {
            if (i10 != this.f39305s && i10 != this.v) {
                int i11 = this.J;
                if (i10 >= i11 && i10 < this.K) {
                    if (this.L) {
                        arrayList = this.M;
                    } else if (this.N) {
                        arrayList = this.P;
                    } else {
                        arrayList = coVar.f35467u6;
                    }
                    return ((MessageObject) arrayList.get(i10 - i11)).contentType;
                } else if (i10 == this.f39306w) {
                    return 3;
                } else {
                    if (i10 == this.f39308y) {
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
        co coVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) coVar).fragmentBeginToShow;
        if (z10 && !coVar.N0) {
            s4.m0 itemAnimator = coVar.f35500x0.getItemAnimator();
            wj wjVar = coVar.f35513y0;
            if (itemAnimator != wjVar) {
                coVar.f35500x0.setItemAnimator(wjVar);
            }
        } else {
            coVar.f35500x0.setItemAnimator(null);
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
        co coVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) coVar).fragmentBeginToShow;
        if (!z10) {
            coVar.f35500x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = coVar.f35500x0.getItemAnimator();
            wj wjVar = coVar.f35513y0;
            if (itemAnimator != wjVar) {
                coVar.f35500x0.setItemAnimator(wjVar);
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
        co coVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) coVar).fragmentBeginToShow;
        if (!z10) {
            coVar.f35500x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = coVar.f35500x0.getItemAnimator();
            wj wjVar = coVar.f35513y0;
            if (itemAnimator != wjVar) {
                coVar.f35500x0.setItemAnimator(wjVar);
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
        co coVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) coVar).fragmentBeginToShow;
        if (!z10) {
            coVar.f35500x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = coVar.f35500x0.getItemAnimator();
            wj wjVar = coVar.f35513y0;
            if (itemAnimator != wjVar) {
                coVar.f35500x0.setItemAnimator(wjVar);
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
        co coVar = this.Q;
        ArrayList arrayList = coVar.f35467u6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range inserted " + i10 + ":" + i11);
        }
        z10 = ((org.telegram.ui.ActionBar.n2) coVar).fragmentBeginToShow;
        if (!z10) {
            coVar.f35500x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = coVar.f35500x0.getItemAnimator();
            wj wjVar = coVar.f35513y0;
            if (itemAnimator != wjVar) {
                coVar.f35500x0.setItemAnimator(wjVar);
            }
        }
        S();
        if (i10 == 1 && i11 > 0 && (i12 = i10 + i11) >= (i13 = this.J) && i12 < this.K) {
            MessageObject messageObject = (MessageObject) arrayList.get(i12 - i13);
            MessageObject messageObject2 = (MessageObject) arrayList.get((i12 - this.J) - 1);
            if ((coVar.f35264e != null && messageObject.getFromChatId() == messageObject2.getFromChatId()) || (coVar.f35276f != null && messageObject.isOutOwner() == messageObject2.isOutOwner())) {
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
        co coVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) coVar).fragmentBeginToShow;
        if (!z10) {
            coVar.f35500x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = coVar.f35500x0.getItemAnimator();
            wj wjVar = coVar.f35513y0;
            if (itemAnimator != wjVar) {
                coVar.f35500x0.setItemAnimator(wjVar);
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
        co coVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) coVar).fragmentBeginToShow;
        if (!z10) {
            coVar.f35500x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = coVar.f35500x0.getItemAnimator();
            wj wjVar = coVar.f35513y0;
            if (itemAnimator != wjVar) {
                coVar.f35500x0.setItemAnimator(wjVar);
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
    public final void v(s4.c1 r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.om.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.t1 t1Var;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.Cells.t1 t1Var2;
        int i14;
        co coVar = this.Q;
        if (i10 == 0) {
            i14 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
            t1Var = new org.telegram.ui.Cells.t1(this.h, i14, true, coVar.Ba, coVar.f35274ea);
            t1Var.setResourcesProvider(coVar.f35274ea);
            if (coVar.f35408pc == null) {
                coVar.f35408pc = new on(coVar);
            }
            t1Var.setDelegate(coVar.f35408pc);
            t1Var.Pd = coVar.Pb;
            if (coVar.h == null) {
                t1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i10 == 1) {
                ?? w0Var = new org.telegram.ui.Cells.w0(context, coVar.f35274ea, true);
                w0Var.setInvalidateColors(true);
                w0Var.setDelegate(new fm(this));
                t1Var = w0Var;
            } else {
                if (i10 == 2) {
                    t1Var2 = new org.telegram.ui.Cells.v1(context, coVar.f35274ea);
                } else if (i10 == 3) {
                    i13 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    ?? gmVar = new gm(this, context, i13, coVar.f35274ea);
                    gmVar.setDelegate(new z0(this, 20));
                    t1Var2 = gmVar;
                } else if (i10 == 4) {
                    t1Var2 = new org.telegram.ui.Cells.z0(context, coVar.f35274ea);
                } else if (i10 == 6) {
                    i12 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    t1Var2 = new org.telegram.ui.Cells.bb(context, i12, coVar.f35274ea);
                } else if (i10 == 7) {
                    t1Var2 = new org.telegram.ui.Cells.w0(context, coVar.f35274ea, false);
                } else if (i10 == 8) {
                    i11 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    t1Var2 = new hm(this, context, i11, coVar.f35274ea);
                } else if (i10 == 10) {
                    ?? u1Var = new org.telegram.ui.Cells.u1(context, coVar.f35274ea);
                    if (coVar.f35408pc == null) {
                        coVar.f35408pc = new on(coVar);
                    }
                    u1Var.setDelegate(coVar.f35408pc);
                    t1Var2 = u1Var;
                } else {
                    t1Var = null;
                }
                t1Var = t1Var2;
            }
        }
        return com.google.android.gms.internal.vision.e2.l(t1Var, t1Var, -1, -2);
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
        View view = c1Var.f45766a;
        boolean z20 = view instanceof org.telegram.ui.Cells.t1;
        co coVar = this.Q;
        if (z20 || (view instanceof org.telegram.ui.Cells.w0)) {
            coVar.r9();
        }
        boolean z21 = view instanceof org.telegram.ui.Cells.t1;
        if (z21) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            MessageObject messageObject = t1Var.getMessageObject();
            t1Var.E8 = coVar.t9();
            t1Var.F8 = coVar.C9();
            t1Var.G8 = coVar.B9();
            t1Var.H8 = coVar.Q8();
            t1Var.I8 = coVar.R8();
            t1Var.g4(-1, true, false);
            MessageObject messageObject2 = coVar.G3;
            if (messageObject2 != null && messageObject2.equals(messageObject)) {
                t1Var.g4(coVar.H3, false, false);
            }
            if (messageObject.isAnimatedEmoji() && (stickerEmoji = messageObject.getStickerEmoji()) != null && (emojiSound = coVar.getMessagesController().emojiSounds.get(stickerEmoji.replace("️", ""))) != null) {
                coVar.getMediaController().playEmojiSound(coVar.getAccountInstance(), stickerEmoji, emojiSound, true);
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
            kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
            if (!kVar.s() && !coVar.A9()) {
                t1Var.setDrawSelectionBackground(false);
                t1Var.L3(false, false, false);
                t1Var.J3(false, false);
                z13 = false;
                z14 = false;
            } else {
                coVar.N7 = false;
                coVar.O7 = 0L;
                coVar.P7 = null;
                ArrayList arrayList2 = coVar.f35215a4;
                if (arrayList2 != null && arrayList2.contains(messageObject)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                t1Var.J3(z12, false);
                if (messageObject.getDialogId() == coVar.T5) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if (coVar.W5[i10].indexOfKey(messageObject.getId()) >= 0) {
                    coVar.hb(messageObject, t1Var, i10, false);
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
            if (coVar.R3 == 7 && coVar.f35464u3 != null && (str = coVar.f35452t3) != null) {
                t1Var.S3(str);
            } else {
                qk qkVar = coVar.R2;
                if (qkVar != null && qkVar.getVisibility() == 0) {
                    MediaDataController mediaDataController = coVar.getMediaDataController();
                    int id2 = messageObject.getId();
                    if (messageObject.getDialogId() == coVar.L6) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (mediaDataController.isMessageFound(id2, z16) && coVar.getMediaDataController().getLastSearchQuery() != null) {
                        t1Var.S3(coVar.getMediaDataController().getLastSearchQuery());
                    }
                }
                t1Var.S3(null);
            }
            z17 = ((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode;
            if (!z17 || !t1Var.f22961f8) {
                if (coVar.L7 != Integer.MAX_VALUE && ((t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == coVar.L7) || (t1Var.getCurrentMessagesGroup() != null && t1Var.getCurrentMessagesGroup().contains(coVar.L7)))) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                t1Var.setHighlighted(z18);
                boolean z23 = t1Var.f22961f8;
                if (z23 && coVar.P7 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String str2 = coVar.P7;
                    int i12 = coVar.S7;
                    if (!coVar.N7 && currentTimeMillis - coVar.O7 >= 200) {
                        z19 = false;
                    } else {
                        z19 = true;
                    }
                    if (!t1Var.T3(str2, true, z19, i12) && coVar.M7) {
                        org.telegram.ui.Components.yc.a0(coVar).Q(R.raw.error, 36, LocaleController.getString(R.string.QuoteNotFound)).k(true);
                    }
                    coVar.M7 = false;
                    if (coVar.N7) {
                        coVar.O7 = currentTimeMillis;
                    }
                    coVar.N7 = false;
                } else if (z23 && (num = coVar.Q7) != null) {
                    t1Var.R3(num.intValue());
                } else if (z23 && (bArr = coVar.R7) != null) {
                    t1Var.P3(bArr);
                }
                if (coVar.L7 != Integer.MAX_VALUE) {
                    coVar.Zb();
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
            w0Var.f23437e0 = coVar.t9();
            w0Var.f23450i0 = coVar.C9();
            coVar.B9();
            coVar.Q8();
            w0Var.f23453j0 = coVar.R8();
        } else if (view instanceof org.telegram.ui.Cells.v1) {
            ((org.telegram.ui.Cells.v1) view).getTextView().setTranslationX(coVar.R8() / 2.0f);
        }
        int b10 = c1Var.b();
        int i13 = this.J;
        if (b10 >= i13 && b10 < this.K) {
            if (this.L) {
                arrayList = this.M;
            } else if (this.N) {
                arrayList = this.P;
            } else {
                arrayList = coVar.f35467u6;
            }
            MessageObject messageObject3 = (MessageObject) arrayList.get(b10 - i13);
            if (messageObject3 != null && (message = messageObject3.messageOwner) != null && message.media_unread && message.mentioned) {
                z10 = ((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode;
                if (!z10 && coVar.R3 == 0 && !messageObject3.isVoice() && !messageObject3.isRoundVideo()) {
                    int i14 = coVar.f35354l6 - 1;
                    coVar.f35354l6 = i14;
                    if (i14 <= 0) {
                        coVar.f35354l6 = 0;
                        coVar.f35366m6 = true;
                        coVar.Kb(false);
                    } else {
                        coVar.f35326j1.c(2, i14, true);
                    }
                    MessagesController messagesController = coVar.getMessagesController();
                    int id3 = messageObject3.getId();
                    if (ChatObject.isChannel(coVar.f35264e)) {
                        j3 = coVar.f35264e.f19896id;
                    } else {
                        j3 = 0;
                    }
                    messagesController.markMentionMessageAsRead(id3, j3, coVar.T5);
                    messageObject3.setContentIsRead();
                }
                if (z21) {
                    org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
                    z11 = ((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode;
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
