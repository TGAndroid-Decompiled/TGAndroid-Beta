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
public final class nm extends org.telegram.ui.Components.mk0 {
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
    public final bo Q;
    public final Context h;
    public final boolean f36005n;
    public int f36006r;
    public int f36007s;
    public int v;
    public int f36008w;
    public int f36009x;
    public int f36010y;

    public nm(bo boVar, Context context) {
        boolean z10;
        this.Q = boVar;
        this.e = new ArrayList();
        this.f26174f = new ArrayList();
        this.f36007s = -5;
        this.v = -5;
        this.f36008w = -5;
        this.f36009x = -5;
        this.f36010y = -5;
        this.E = -5;
        this.F = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.h = context;
        TLRPC.User user = boVar.f32299f;
        if (user != null && user.bot) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36005n = z10;
        C(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void K(boolean z10) {
        bo boVar = this.Q;
        if (UserObject.isBotForum(boVar.f32299f)) {
            if (z10) {
                boVar.nc = true;
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
        return this.Q.f32491u6;
    }

    public final void M(MessageObject messageObject) {
        bo boVar = this.Q;
        int childCount = boVar.f32524x0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = boVar.f32524x0.getChildAt(i10);
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
        bo boVar = this.Q;
        if (UserObject.isBotForumWithEditableTopics(boVar.f32299f) && boVar.d() == 0 && !boVar.nc && boVar.R3 == 0) {
            return true;
        }
        return false;
    }

    public final void O(boolean z10) {
        boolean z11;
        boolean z12;
        bo boVar = this.Q;
        ArrayList arrayList = boVar.f32491u6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify data set changed fragmentOpened=" + boVar.O5);
        }
        if (z10 && boVar.O5) {
            s4.m0 itemAnimator = boVar.f32524x0.getItemAnimator();
            wj wjVar = boVar.f32537y0;
            if (itemAnimator != wjVar) {
                boVar.f32524x0.setItemAnimator(wjVar);
            }
        } else {
            boVar.f32524x0.setItemAnimator(null);
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
        boolean[] zArr = boVar.C6;
        if ((zArr[0] && (boVar.L6 == 0 || zArr[1])) || z11) {
            z12 = ((org.telegram.ui.ActionBar.n2) boVar).fragmentBeginToShow;
            boVar.L6(z12);
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
        bo boVar = this.Q;
        z11 = ((org.telegram.ui.ActionBar.n2) boVar).fragmentBeginToShow;
        if (!z11) {
            boVar.f32524x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = boVar.f32524x0.getItemAnimator();
            wj wjVar = boVar.f32537y0;
            if (itemAnimator != wjVar) {
                boVar.f32524x0.setItemAnimator(wjVar);
            }
        }
        if (z10 && boVar.f32537y0 != null) {
            s4.m0 itemAnimator2 = boVar.f32524x0.getItemAnimator();
            wj wjVar2 = boVar.f32537y0;
            if (itemAnimator2 == wjVar2) {
                s4.c1 K = boVar.f32524x0.K(i10);
                if (K == null) {
                    wjVar2.getClass();
                } else {
                    wjVar2.S.add(K);
                    View view = K.f42675a;
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
        bo boVar = this.Q;
        ArrayList arrayList = boVar.f32491u6;
        if (boVar.f32549z0 != null && !this.L && !this.N) {
            int i12 = 0;
            if (!boVar.D4 && boVar.J7 != null) {
                int childCount = boVar.f32524x0.getChildCount();
                int i13 = 0;
                while (true) {
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = boVar.f32524x0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                        MessageObject messageObject2 = boVar.J7;
                        if (messageObject == messageObject2) {
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                i11 = arrayList.indexOf(boVar.J7) + this.J;
                                i12 = boVar.L8(childAt);
                            }
                        }
                    }
                    i13++;
                }
            }
            i11 = -1;
            m(i10);
            if (i11 != -1) {
                boVar.f32549z0.h1(i11, i12);
            }
        }
    }

    public final org.telegram.ui.Cells.t1 R(MessageObject messageObject, boolean z10, boolean z11) {
        ArrayList arrayList;
        bo boVar = this.Q;
        if (z10) {
            int childCount = boVar.f32524x0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = boVar.f32524x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject() == messageObject && TextUtils.equals(t1Var.f7, t1Var.f21322y7.messageOwner.post_author)) {
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
            arrayList = boVar.f32491u6;
        }
        int indexOf = arrayList.indexOf(messageObject2);
        if (indexOf == -1) {
            return null;
        }
        if (z11) {
            int i11 = bo.Jc;
            bo.Jc = i11 + 1;
            messageObject2.stableId = i11;
            O(true);
            return null;
        }
        Q(this.J + indexOf);
        return null;
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nm.S():void");
    }

    public final void T() {
        int i10 = this.f36006r;
        int i11 = this.f36008w;
        int i12 = this.f36010y;
        int i13 = this.f36007s;
        int i14 = this.v;
        int i15 = this.E;
        int i16 = this.F;
        int i17 = this.J;
        int i18 = this.K;
        int i19 = this.G;
        int i20 = this.H;
        int i21 = this.I;
        S();
        if (i10 == this.f36006r && i11 == this.f36008w && i15 == this.E && i16 == this.F && i17 == this.J && i18 == this.K && i13 == this.f36007s && i14 == this.v && i12 == this.f36010y && i19 == this.G && i20 == this.H && i21 == this.I) {
            return;
        }
        O(false);
    }

    @Override
    public final int h() {
        this.f36009x = -5;
        bo boVar = this.Q;
        a0.i iVar = boVar.f32283d8;
        if (boVar.M5.get(boVar.f32279d4, 0) != 0) {
            TLRPC.User user = boVar.f32299f;
            if (user == null || !user.bot || boVar.R3 != 0 || ((iVar.m() <= 0 || (((TL_bots.BotInfo) iVar.f(boVar.f32299f.f18259id)).description == null && ((TL_bots.BotInfo) iVar.f(boVar.f32299f.f18259id)).description_photo == null && ((TL_bots.BotInfo) iVar.f(boVar.f32299f.f18259id)).description_document == null)) && !UserObject.isReplyUser(boVar.f32299f) && !UserObject.isBotForum(boVar.f32299f))) {
                return 0;
            }
            this.f36009x = 0;
            return 1;
        }
        return this.f36006r;
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList;
        bo boVar = this.Q;
        if (boVar.M5.get(boVar.f32279d4, 0) == 0 || i10 != this.f36009x) {
            if (this.L) {
                arrayList = this.M;
            } else if (this.N) {
                arrayList = this.P;
            } else {
                arrayList = boVar.f32491u6;
            }
            int i11 = this.J;
            if (i10 >= i11 && i10 < this.K) {
                return ((MessageObject) arrayList.get(i10 - i11)).stableId;
            }
            if (i10 != this.f36008w && i10 != this.f36009x) {
                if (i10 == this.E) {
                    return 2L;
                }
                if (i10 == this.F) {
                    return 3L;
                }
                if (i10 == this.f36007s) {
                    return 4L;
                }
                if (i10 == this.f36010y) {
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
        bo boVar = this.Q;
        if (boVar.M5.get(boVar.f32279d4, 0) == 0 || i10 != this.f36009x) {
            if (i10 != this.f36007s && i10 != this.v) {
                int i11 = this.J;
                if (i10 >= i11 && i10 < this.K) {
                    if (this.L) {
                        arrayList = this.M;
                    } else if (this.N) {
                        arrayList = this.P;
                    } else {
                        arrayList = boVar.f32491u6;
                    }
                    return ((MessageObject) arrayList.get(i10 - i11)).contentType;
                } else if (i10 == this.f36008w) {
                    return 3;
                } else {
                    if (i10 == this.f36010y) {
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
        bo boVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) boVar).fragmentBeginToShow;
        if (z10 && !boVar.N0) {
            s4.m0 itemAnimator = boVar.f32524x0.getItemAnimator();
            wj wjVar = boVar.f32537y0;
            if (itemAnimator != wjVar) {
                boVar.f32524x0.setItemAnimator(wjVar);
            }
        } else {
            boVar.f32524x0.setItemAnimator(null);
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
        bo boVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) boVar).fragmentBeginToShow;
        if (!z10) {
            boVar.f32524x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = boVar.f32524x0.getItemAnimator();
            wj wjVar = boVar.f32537y0;
            if (itemAnimator != wjVar) {
                boVar.f32524x0.setItemAnimator(wjVar);
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
        bo boVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) boVar).fragmentBeginToShow;
        if (!z10) {
            boVar.f32524x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = boVar.f32524x0.getItemAnimator();
            wj wjVar = boVar.f32537y0;
            if (itemAnimator != wjVar) {
                boVar.f32524x0.setItemAnimator(wjVar);
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
        bo boVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) boVar).fragmentBeginToShow;
        if (!z10) {
            boVar.f32524x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = boVar.f32524x0.getItemAnimator();
            wj wjVar = boVar.f32537y0;
            if (itemAnimator != wjVar) {
                boVar.f32524x0.setItemAnimator(wjVar);
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
        bo boVar = this.Q;
        ArrayList arrayList = boVar.f32491u6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range inserted " + i10 + ":" + i11);
        }
        z10 = ((org.telegram.ui.ActionBar.n2) boVar).fragmentBeginToShow;
        if (!z10) {
            boVar.f32524x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = boVar.f32524x0.getItemAnimator();
            wj wjVar = boVar.f32537y0;
            if (itemAnimator != wjVar) {
                boVar.f32524x0.setItemAnimator(wjVar);
            }
        }
        S();
        if (i10 == 1 && i11 > 0 && (i12 = i10 + i11) >= (i13 = this.J) && i12 < this.K) {
            MessageObject messageObject = (MessageObject) arrayList.get(i12 - i13);
            MessageObject messageObject2 = (MessageObject) arrayList.get((i12 - this.J) - 1);
            if ((boVar.e != null && messageObject.getFromChatId() == messageObject2.getFromChatId()) || (boVar.f32299f != null && messageObject.isOutOwner() == messageObject2.isOutOwner())) {
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
        bo boVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) boVar).fragmentBeginToShow;
        if (!z10) {
            boVar.f32524x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = boVar.f32524x0.getItemAnimator();
            wj wjVar = boVar.f32537y0;
            if (itemAnimator != wjVar) {
                boVar.f32524x0.setItemAnimator(wjVar);
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
        bo boVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) boVar).fragmentBeginToShow;
        if (!z10) {
            boVar.f32524x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = boVar.f32524x0.getItemAnimator();
            wj wjVar = boVar.f32537y0;
            if (itemAnimator != wjVar) {
                boVar.f32524x0.setItemAnimator(wjVar);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nm.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.t1 t1Var;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.Cells.t1 t1Var2;
        int i14;
        bo boVar = this.Q;
        if (i10 == 0) {
            i14 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
            t1Var = new org.telegram.ui.Cells.t1(this.h, i14, true, boVar.Ba, boVar.f32297ea);
            t1Var.setResourcesProvider(boVar.f32297ea);
            if (boVar.f32432pc == null) {
                boVar.f32432pc = new nn(boVar);
            }
            t1Var.setDelegate(boVar.f32432pc);
            t1Var.Pd = boVar.Pb;
            if (boVar.h == null) {
                t1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i10 == 1) {
                ?? w0Var = new org.telegram.ui.Cells.w0(context, boVar.f32297ea, true);
                w0Var.setInvalidateColors(true);
                w0Var.setDelegate(new em(this));
                t1Var = w0Var;
            } else {
                if (i10 == 2) {
                    t1Var2 = new org.telegram.ui.Cells.v1(context, boVar.f32297ea);
                } else if (i10 == 3) {
                    i13 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                    ?? fmVar = new fm(this, context, i13, boVar.f32297ea);
                    fmVar.setDelegate(new y0(this, 20));
                    t1Var2 = fmVar;
                } else if (i10 == 4) {
                    t1Var2 = new org.telegram.ui.Cells.z0(context, boVar.f32297ea);
                } else if (i10 == 6) {
                    i12 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                    t1Var2 = new org.telegram.ui.Cells.cb(context, i12, boVar.f32297ea);
                } else if (i10 == 7) {
                    t1Var2 = new org.telegram.ui.Cells.w0(context, boVar.f32297ea, false);
                } else if (i10 == 8) {
                    i11 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                    t1Var2 = new gm(this, context, i11, boVar.f32297ea);
                } else if (i10 == 10) {
                    ?? u1Var = new org.telegram.ui.Cells.u1(context, boVar.f32297ea);
                    if (boVar.f32432pc == null) {
                        boVar.f32432pc = new nn(boVar);
                    }
                    u1Var.setDelegate(boVar.f32432pc);
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
        View view = c1Var.f42675a;
        boolean z20 = view instanceof org.telegram.ui.Cells.t1;
        bo boVar = this.Q;
        if (z20 || (view instanceof org.telegram.ui.Cells.w0)) {
            boVar.r9();
        }
        boolean z21 = view instanceof org.telegram.ui.Cells.t1;
        if (z21) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            MessageObject messageObject = t1Var.getMessageObject();
            t1Var.E8 = boVar.t9();
            t1Var.F8 = boVar.C9();
            t1Var.G8 = boVar.B9();
            t1Var.H8 = boVar.Q8();
            t1Var.I8 = boVar.R8();
            t1Var.g4(-1, true, false);
            MessageObject messageObject2 = boVar.G3;
            if (messageObject2 != null && messageObject2.equals(messageObject)) {
                t1Var.g4(boVar.H3, false, false);
            }
            if (messageObject.isAnimatedEmoji() && (stickerEmoji = messageObject.getStickerEmoji()) != null && (emojiSound = boVar.getMessagesController().emojiSounds.get(stickerEmoji.replace("️", ""))) != null) {
                boVar.getMediaController().playEmojiSound(boVar.getAccountInstance(), stickerEmoji, emojiSound, true);
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
            kVar = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
            if (!kVar.s() && !boVar.A9()) {
                t1Var.setDrawSelectionBackground(false);
                t1Var.L3(false, false, false);
                t1Var.J3(false, false);
                z13 = false;
                z14 = false;
            } else {
                boVar.N7 = false;
                boVar.O7 = 0L;
                boVar.P7 = null;
                ArrayList arrayList2 = boVar.f32239a4;
                if (arrayList2 != null && arrayList2.contains(messageObject)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                t1Var.J3(z12, false);
                if (messageObject.getDialogId() == boVar.T5) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if (boVar.W5[i10].indexOfKey(messageObject.getId()) >= 0) {
                    boVar.hb(messageObject, t1Var, i10, false);
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
            if (boVar.R3 == 7 && boVar.f32488u3 != null && (str = boVar.f32476t3) != null) {
                t1Var.S3(str);
            } else {
                qk qkVar = boVar.R2;
                if (qkVar != null && qkVar.getVisibility() == 0) {
                    MediaDataController mediaDataController = boVar.getMediaDataController();
                    int id2 = messageObject.getId();
                    if (messageObject.getDialogId() == boVar.L6) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (mediaDataController.isMessageFound(id2, z16) && boVar.getMediaDataController().getLastSearchQuery() != null) {
                        t1Var.S3(boVar.getMediaDataController().getLastSearchQuery());
                    }
                }
                t1Var.S3(null);
            }
            z17 = ((org.telegram.ui.ActionBar.n2) boVar).inPreviewMode;
            if (!z17 || !t1Var.f21050f8) {
                if (boVar.L7 != Integer.MAX_VALUE && ((t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == boVar.L7) || (t1Var.getCurrentMessagesGroup() != null && t1Var.getCurrentMessagesGroup().contains(boVar.L7)))) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                t1Var.setHighlighted(z18);
                boolean z23 = t1Var.f21050f8;
                if (z23 && boVar.P7 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String str2 = boVar.P7;
                    int i12 = boVar.S7;
                    if (!boVar.N7 && currentTimeMillis - boVar.O7 >= 200) {
                        z19 = false;
                    } else {
                        z19 = true;
                    }
                    if (!t1Var.T3(str2, true, z19, i12) && boVar.M7) {
                        org.telegram.ui.Components.vc.a0(boVar).Q(R.raw.error, 36, LocaleController.getString(R.string.QuoteNotFound)).k(true);
                    }
                    boVar.M7 = false;
                    if (boVar.N7) {
                        boVar.O7 = currentTimeMillis;
                    }
                    boVar.N7 = false;
                } else if (z23 && (num = boVar.Q7) != null) {
                    t1Var.R3(num.intValue());
                } else if (z23 && (bArr = boVar.R7) != null) {
                    t1Var.P3(bArr);
                }
                if (boVar.L7 != Integer.MAX_VALUE) {
                    boVar.Zb();
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
            w0Var.f21510e0 = boVar.t9();
            w0Var.f21523i0 = boVar.C9();
            boVar.B9();
            boVar.Q8();
            w0Var.f21526j0 = boVar.R8();
        } else if (view instanceof org.telegram.ui.Cells.v1) {
            ((org.telegram.ui.Cells.v1) view).getTextView().setTranslationX(boVar.R8() / 2.0f);
        }
        int b10 = c1Var.b();
        int i13 = this.J;
        if (b10 >= i13 && b10 < this.K) {
            if (this.L) {
                arrayList = this.M;
            } else if (this.N) {
                arrayList = this.P;
            } else {
                arrayList = boVar.f32491u6;
            }
            MessageObject messageObject3 = (MessageObject) arrayList.get(b10 - i13);
            if (messageObject3 != null && (message = messageObject3.messageOwner) != null && message.media_unread && message.mentioned) {
                z10 = ((org.telegram.ui.ActionBar.n2) boVar).inPreviewMode;
                if (!z10 && boVar.R3 == 0 && !messageObject3.isVoice() && !messageObject3.isRoundVideo()) {
                    int i14 = boVar.f32378l6 - 1;
                    boVar.f32378l6 = i14;
                    if (i14 <= 0) {
                        boVar.f32378l6 = 0;
                        boVar.f32390m6 = true;
                        boVar.Kb(false);
                    } else {
                        boVar.f32350j1.c(2, i14, true);
                    }
                    MessagesController messagesController = boVar.getMessagesController();
                    int id3 = messageObject3.getId();
                    if (ChatObject.isChannel(boVar.e)) {
                        j3 = boVar.e.f18112id;
                    } else {
                        j3 = 0;
                    }
                    messagesController.markMentionMessageAsRead(id3, j3, boVar.T5);
                    messageObject3.setContentIsRead();
                }
                if (z21) {
                    org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
                    z11 = ((org.telegram.ui.ActionBar.n2) boVar).inPreviewMode;
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
