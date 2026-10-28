package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
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
public final class hm extends org.telegram.ui.Components.ol0 {
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
    public final boolean f39931n;
    public int f39932r;
    public int f39933s;
    public int v;
    public int f39934w;
    public int f39935x;
    public int f39936y;

    public hm(wn wnVar, Context context) {
        boolean z10;
        this.Q = wnVar;
        this.e = new ArrayList();
        this.f31341f = new ArrayList();
        this.f39933s = -5;
        this.v = -5;
        this.f39934w = -5;
        this.f39935x = -5;
        this.f39936y = -5;
        this.E = -5;
        this.F = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.h = context;
        TLRPC.User user = wnVar.f45113f;
        if (user != null && user.bot) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f39931n = z10;
        C(true);
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    public final void K(boolean z10) {
        wn wnVar = this.Q;
        if (UserObject.isBotForum(wnVar.f45113f)) {
            if (z10) {
                wnVar.Nc = true;
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
        return this.Q.K6;
    }

    public final void M(MessageObject messageObject) {
        wn wnVar = this.Q;
        int childCount = wnVar.f45339x0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = wnVar.f45339x0.getChildAt(i10);
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
        wn wnVar = this.Q;
        if (UserObject.isBotForumWithEditableTopics(wnVar.f45113f) && wnVar.b() == 0 && !wnVar.Nc && wnVar.f45091d4 == 0) {
            return true;
        }
        return false;
    }

    public final void O(boolean z10) {
        boolean z11;
        boolean z12;
        wn wnVar = this.Q;
        ArrayList arrayList = wnVar.K6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify data set changed fragmentOpened=" + wnVar.f45107e6);
        }
        if (z10 && wnVar.f45107e6) {
            s4.m0 itemAnimator = wnVar.f45339x0.getItemAnimator();
            tj tjVar = wnVar.f45352y0;
            if (itemAnimator != tjVar) {
                wnVar.f45339x0.setItemAnimator(tjVar);
            }
        } else {
            wnVar.f45339x0.setItemAnimator(null);
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
        boolean[] zArr = wnVar.S6;
        if ((zArr[0] && (wnVar.f45065b7 == 0 || zArr[1])) || z11) {
            z12 = ((org.telegram.ui.ActionBar.r2) wnVar).fragmentBeginToShow;
            wnVar.U6(z12);
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
            ic.a.w(str, sb2);
        }
        wn wnVar = this.Q;
        z11 = ((org.telegram.ui.ActionBar.r2) wnVar).fragmentBeginToShow;
        if (!z11) {
            wnVar.f45339x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = wnVar.f45339x0.getItemAnimator();
            tj tjVar = wnVar.f45352y0;
            if (itemAnimator != tjVar) {
                wnVar.f45339x0.setItemAnimator(tjVar);
            }
        }
        if (z10 && wnVar.f45352y0 != null) {
            s4.m0 itemAnimator2 = wnVar.f45339x0.getItemAnimator();
            tj tjVar2 = wnVar.f45352y0;
            if (itemAnimator2 == tjVar2) {
                s4.e1 K = wnVar.f45339x0.K(i10);
                if (K == null) {
                    tjVar2.getClass();
                } else {
                    tjVar2.S.add(K);
                    View view = K.f47773a;
                    if ((view instanceof org.telegram.ui.Cells.s1) && (messageObject = ((org.telegram.ui.Cells.s1) view).getMessageObject()) != null) {
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
        ArrayList arrayList = wnVar.K6;
        if (wnVar.f45364z0 != null && !this.L && !this.N) {
            int i12 = 0;
            if (!wnVar.P4 && wnVar.Z7 != null) {
                int childCount = wnVar.f45339x0.getChildCount();
                int i13 = 0;
                while (true) {
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = wnVar.f45339x0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                        MessageObject messageObject2 = wnVar.Z7;
                        if (messageObject == messageObject2) {
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                i11 = arrayList.indexOf(wnVar.Z7) + this.J;
                                i12 = wnVar.Y8(childAt);
                            }
                        }
                    }
                    i13++;
                }
            }
            i11 = -1;
            m(i10);
            if (i11 != -1) {
                wnVar.f45364z0.h1(i11, i12);
            }
        }
    }

    public final org.telegram.ui.Cells.s1 R(MessageObject messageObject, boolean z10, boolean z11) {
        ArrayList arrayList;
        wn wnVar = this.Q;
        if (z10) {
            int childCount = wnVar.f45339x0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = wnVar.f45339x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.getMessageObject() == messageObject && TextUtils.equals(s1Var.f7, s1Var.f25367y7.messageOwner.post_author)) {
                        s1Var.Z3(messageObject, s1Var.getCurrentMessagesGroup(), s1Var.m3(), s1Var.n3(), s1Var.h3(), s1Var.j3());
                        return s1Var;
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
            arrayList = wnVar.K6;
        }
        int indexOf = arrayList.indexOf(messageObject2);
        if (indexOf == -1) {
            return null;
        }
        if (z11) {
            int i11 = wn.f45037hd;
            wn.f45037hd = i11 + 1;
            messageObject2.stableId = i11;
            O(true);
            return null;
        }
        Q(this.J + indexOf);
        return null;
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hm.S():void");
    }

    public final void T() {
        int i10 = this.f39932r;
        int i11 = this.f39934w;
        int i12 = this.f39936y;
        int i13 = this.f39933s;
        int i14 = this.v;
        int i15 = this.E;
        int i16 = this.F;
        int i17 = this.J;
        int i18 = this.K;
        int i19 = this.G;
        int i20 = this.H;
        int i21 = this.I;
        S();
        if (i10 == this.f39932r && i11 == this.f39934w && i15 == this.E && i16 == this.F && i17 == this.J && i18 == this.K && i13 == this.f39933s && i14 == this.v && i12 == this.f39936y && i19 == this.G && i20 == this.H && i21 == this.I) {
            return;
        }
        O(false);
    }

    @Override
    public final int h() {
        this.f39935x = -5;
        wn wnVar = this.Q;
        a0.h hVar = wnVar.f45294t8;
        if (wnVar.f45079c6.get(wnVar.f45241p4, 0) != 0) {
            TLRPC.User user = wnVar.f45113f;
            if (user == null || !user.bot || wnVar.f45091d4 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(wnVar.f45113f.f22177id)).description == null && ((TL_bots.BotInfo) hVar.f(wnVar.f45113f.f22177id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(wnVar.f45113f.f22177id)).description_document == null)) && !UserObject.isReplyUser(wnVar.f45113f) && !UserObject.isBotForum(wnVar.f45113f))) {
                return 0;
            }
            this.f39935x = 0;
            return 1;
        }
        return this.f39932r;
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList;
        wn wnVar = this.Q;
        if (wnVar.f45079c6.get(wnVar.f45241p4, 0) == 0 || i10 != this.f39935x) {
            if (this.L) {
                arrayList = this.M;
            } else if (this.N) {
                arrayList = this.P;
            } else {
                arrayList = wnVar.K6;
            }
            int i11 = this.J;
            if (i10 >= i11 && i10 < this.K) {
                return ((MessageObject) arrayList.get(i10 - i11)).stableId;
            }
            if (i10 != this.f39934w && i10 != this.f39935x) {
                if (i10 == this.E) {
                    return 2L;
                }
                if (i10 == this.F) {
                    return 3L;
                }
                if (i10 == this.f39933s) {
                    return 4L;
                }
                if (i10 == this.f39936y) {
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
        if (wnVar.f45079c6.get(wnVar.f45241p4, 0) == 0 || i10 != this.f39935x) {
            if (i10 != this.f39933s && i10 != this.v) {
                int i11 = this.J;
                if (i10 >= i11 && i10 < this.K) {
                    if (this.L) {
                        arrayList = this.M;
                    } else if (this.N) {
                        arrayList = this.P;
                    } else {
                        arrayList = wnVar.K6;
                    }
                    return ((MessageObject) arrayList.get(i10 - i11)).contentType;
                } else if (i10 == this.f39934w) {
                    return 3;
                } else {
                    if (i10 == this.f39936y) {
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
        z10 = ((org.telegram.ui.ActionBar.r2) wnVar).fragmentBeginToShow;
        if (z10 && !wnVar.Z0) {
            s4.m0 itemAnimator = wnVar.f45339x0.getItemAnimator();
            tj tjVar = wnVar.f45352y0;
            if (itemAnimator != tjVar) {
                wnVar.f45339x0.setItemAnimator(tjVar);
            }
        } else {
            wnVar.f45339x0.setItemAnimator(null);
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
        z10 = ((org.telegram.ui.ActionBar.r2) wnVar).fragmentBeginToShow;
        if (!z10) {
            wnVar.f45339x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = wnVar.f45339x0.getItemAnimator();
            tj tjVar = wnVar.f45352y0;
            if (itemAnimator != tjVar) {
                wnVar.f45339x0.setItemAnimator(tjVar);
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
        z10 = ((org.telegram.ui.ActionBar.r2) wnVar).fragmentBeginToShow;
        if (!z10) {
            wnVar.f45339x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = wnVar.f45339x0.getItemAnimator();
            tj tjVar = wnVar.f45352y0;
            if (itemAnimator != tjVar) {
                wnVar.f45339x0.setItemAnimator(tjVar);
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
        z10 = ((org.telegram.ui.ActionBar.r2) wnVar).fragmentBeginToShow;
        if (!z10) {
            wnVar.f45339x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = wnVar.f45339x0.getItemAnimator();
            tj tjVar = wnVar.f45352y0;
            if (itemAnimator != tjVar) {
                wnVar.f45339x0.setItemAnimator(tjVar);
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
        ArrayList arrayList = wnVar.K6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range inserted " + i10 + ":" + i11);
        }
        z10 = ((org.telegram.ui.ActionBar.r2) wnVar).fragmentBeginToShow;
        if (!z10) {
            wnVar.f45339x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = wnVar.f45339x0.getItemAnimator();
            tj tjVar = wnVar.f45352y0;
            if (itemAnimator != tjVar) {
                wnVar.f45339x0.setItemAnimator(tjVar);
            }
        }
        S();
        if (i10 == 1 && i11 > 0 && (i12 = i10 + i11) >= (i13 = this.J) && i12 < this.K) {
            MessageObject messageObject = (MessageObject) arrayList.get(i12 - i13);
            MessageObject messageObject2 = (MessageObject) arrayList.get((i12 - this.J) - 1);
            if ((wnVar.e != null && messageObject.getFromChatId() == messageObject2.getFromChatId()) || (wnVar.f45113f != null && messageObject.isOutOwner() == messageObject2.isOutOwner())) {
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
        z10 = ((org.telegram.ui.ActionBar.r2) wnVar).fragmentBeginToShow;
        if (!z10) {
            wnVar.f45339x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = wnVar.f45339x0.getItemAnimator();
            tj tjVar = wnVar.f45352y0;
            if (itemAnimator != tjVar) {
                wnVar.f45339x0.setItemAnimator(tjVar);
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
        z10 = ((org.telegram.ui.ActionBar.r2) wnVar).fragmentBeginToShow;
        if (!z10) {
            wnVar.f45339x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = wnVar.f45339x0.getItemAnimator();
            tj tjVar = wnVar.f45352y0;
            if (itemAnimator != tjVar) {
                wnVar.f45339x0.setItemAnimator(tjVar);
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
    public final void v(s4.e1 r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hm.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s1 s1Var;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.Cells.s1 s1Var2;
        int i14;
        wn wnVar = this.Q;
        if (i10 == 0) {
            i14 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            s1Var = new org.telegram.ui.Cells.s1(this.h, i14, true, wnVar.Sa, wnVar.f45309ua);
            s1Var.setResourcesProvider(wnVar.f45309ua);
            if (wnVar.Pc == null) {
                wnVar.Pc = new hn(wnVar);
            }
            s1Var.setDelegate(wnVar.Pc);
            s1Var.Pd = wnVar.pc;
            if (wnVar.h == null) {
                s1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i10 == 1) {
                ?? v0Var = new org.telegram.ui.Cells.v0(context, wnVar.f45309ua, true);
                v0Var.setInvalidateColors(true);
                v0Var.setDelegate(new yl(this));
                s1Var = v0Var;
            } else {
                if (i10 == 2) {
                    ?? u1Var = new org.telegram.ui.Cells.u1(context, wnVar.f45309ua);
                    org.telegram.ui.ActionBar.f7.V(u1Var.getTextView(), org.telegram.ui.ActionBar.y6.Ee, wnVar.f45309ua);
                    Drawable background = u1Var.getBackgroundLayout().getBackground();
                    s1Var2 = u1Var;
                    if (background != null) {
                        org.telegram.ui.ActionBar.f7.y(u1Var.getBackgroundLayout(), u1Var.getBackgroundLayout().getBackground(), org.telegram.ui.ActionBar.y6.Fe, wnVar.f45309ua, PorterDuff.Mode.MULTIPLY);
                        s1Var2 = u1Var;
                    }
                } else if (i10 == 3) {
                    i13 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    ?? zlVar = new zl(this, context, i13, wnVar.f45309ua);
                    zlVar.setDelegate(new y0(this, 22));
                    s1Var2 = zlVar;
                } else if (i10 == 4) {
                    s1Var2 = new org.telegram.ui.Cells.y0(context, wnVar.f45309ua);
                } else if (i10 == 6) {
                    i12 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    s1Var2 = new org.telegram.ui.Cells.cb(context, i12, wnVar.f45309ua);
                } else if (i10 == 7) {
                    s1Var2 = new org.telegram.ui.Cells.v0(context, wnVar.f45309ua, false);
                } else if (i10 == 8) {
                    i11 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    s1Var2 = new am(this, context, i11, wnVar.f45309ua);
                } else if (i10 == 10) {
                    ?? t1Var = new org.telegram.ui.Cells.t1(context, wnVar.f45309ua);
                    if (wnVar.Pc == null) {
                        wnVar.Pc = new hn(wnVar);
                    }
                    t1Var.setDelegate(wnVar.Pc);
                    s1Var2 = t1Var;
                } else {
                    s1Var = null;
                }
                s1Var = s1Var2;
            }
        }
        return ic.a.n(s1Var, s1Var, -1, -2);
    }

    @Override
    public final void y(s4.e1 e1Var) {
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
        View view = e1Var.f47773a;
        boolean z20 = view instanceof org.telegram.ui.Cells.s1;
        wn wnVar = this.Q;
        if (z20 || (view instanceof org.telegram.ui.Cells.v0)) {
            wnVar.C9();
        }
        boolean z21 = view instanceof org.telegram.ui.Cells.s1;
        if (z21) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            MessageObject messageObject = s1Var.getMessageObject();
            s1Var.E8 = wnVar.E9();
            s1Var.F8 = wnVar.O9();
            s1Var.G8 = wnVar.N9();
            s1Var.H8 = wnVar.d9();
            s1Var.I8 = wnVar.e9();
            s1Var.i4(-1, true, false);
            MessageObject messageObject2 = wnVar.S3;
            if (messageObject2 != null && messageObject2.equals(messageObject)) {
                s1Var.i4(wnVar.T3, false, false);
            }
            if (messageObject.isAnimatedEmoji() && (stickerEmoji = messageObject.getStickerEmoji()) != null && (emojiSound = wnVar.getMessagesController().emojiSounds.get(stickerEmoji.replace("️", ""))) != null) {
                wnVar.getMediaController().playEmojiSound(wnVar.getAccountInstance(), stickerEmoji, emojiSound, true);
            }
            if (messageObject.updateTranslation(false)) {
                s1Var.Z3(messageObject, s1Var.getCurrentMessagesGroup(), s1Var.m3(), s1Var.n3(), s1Var.h3(), s1Var.j3());
            } else {
                MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
                if (currentMessagesGroup != null) {
                    for (int i11 = 0; i11 < currentMessagesGroup.messages.size(); i11++) {
                        currentMessagesGroup.messages.get(i11).updateTranslation();
                    }
                }
            }
            kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
            if (!kVar.q() && !wnVar.M9()) {
                s1Var.setDrawSelectionBackground(false);
                s1Var.N3(false, false, false);
                s1Var.L3(false, false);
                z13 = false;
                z14 = false;
            } else {
                wnVar.f45095d8 = false;
                wnVar.f45109e8 = 0L;
                wnVar.f45121f8 = null;
                ArrayList arrayList2 = wnVar.f45201m4;
                if (arrayList2 != null && arrayList2.contains(messageObject)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                s1Var.L3(z12, false);
                if (messageObject.getDialogId() == wnVar.f45168j6) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if (wnVar.f45203m6[i10].indexOfKey(messageObject.getId()) >= 0) {
                    wnVar.wb(messageObject, s1Var, i10, false);
                    z13 = true;
                } else {
                    s1Var.setDrawSelectionBackground(false);
                    s1Var.N3(false, false, false);
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
            s1Var.M3(z22, z15);
            if (wnVar.f45091d4 == 7 && wnVar.G3 != null && (str = wnVar.F3) != null) {
                s1Var.U3(str);
            } else {
                mk mkVar = wnVar.f45090d3;
                if (mkVar != null && mkVar.getVisibility() == 0) {
                    MediaDataController mediaDataController = wnVar.getMediaDataController();
                    int id2 = messageObject.getId();
                    if (messageObject.getDialogId() == wnVar.f45065b7) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (mediaDataController.isMessageFound(id2, z16) && wnVar.getMediaDataController().getLastSearchQuery() != null) {
                        s1Var.U3(wnVar.getMediaDataController().getLastSearchQuery());
                    }
                }
                s1Var.U3(null);
            }
            z17 = ((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode;
            if (!z17 || !s1Var.f25095f8) {
                if (wnVar.f45066b8 != Integer.MAX_VALUE && ((s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == wnVar.f45066b8) || (s1Var.getCurrentMessagesGroup() != null && s1Var.getCurrentMessagesGroup().contains(wnVar.f45066b8)))) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                s1Var.setHighlighted(z18);
                boolean z23 = s1Var.f25095f8;
                if (z23 && wnVar.f45121f8 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String str2 = wnVar.f45121f8;
                    int i12 = wnVar.f45158i8;
                    if (!wnVar.f45095d8 && currentTimeMillis - wnVar.f45109e8 >= 200) {
                        z19 = false;
                    } else {
                        z19 = true;
                    }
                    if (!s1Var.V3(str2, true, z19, i12) && wnVar.f45081c8) {
                        org.telegram.ui.Components.wc.b0(wnVar).R(R.raw.error, 36, LocaleController.getString(R.string.QuoteNotFound)).k(true);
                    }
                    wnVar.f45081c8 = false;
                    if (wnVar.f45095d8) {
                        wnVar.f45109e8 = currentTimeMillis;
                    }
                    wnVar.f45095d8 = false;
                } else if (z23 && (num = wnVar.f45133g8) != null) {
                    s1Var.T3(num.intValue());
                } else if (z23 && (bArr = wnVar.f45145h8) != null) {
                    s1Var.R3(bArr);
                }
                if (wnVar.f45066b8 != Integer.MAX_VALUE) {
                    wnVar.pc();
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            v0Var.f25513e0 = wnVar.E9();
            v0Var.f25526i0 = wnVar.O9();
            wnVar.N9();
            wnVar.d9();
            v0Var.f25529j0 = wnVar.e9();
        } else if (view instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).getTextView().setTranslationX(wnVar.e9() / 2.0f);
        }
        int b10 = e1Var.b();
        int i13 = this.J;
        if (b10 >= i13 && b10 < this.K) {
            if (this.L) {
                arrayList = this.M;
            } else if (this.N) {
                arrayList = this.P;
            } else {
                arrayList = wnVar.K6;
            }
            MessageObject messageObject3 = (MessageObject) arrayList.get(b10 - i13);
            if (messageObject3 != null && (message = messageObject3.messageOwner) != null && message.media_unread && message.mentioned) {
                z10 = ((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode;
                if (!z10 && wnVar.f45091d4 == 0 && !messageObject3.isVoice() && !messageObject3.isRoundVideo()) {
                    int i14 = wnVar.B6 - 1;
                    wnVar.B6 = i14;
                    if (i14 <= 0) {
                        wnVar.B6 = 0;
                        wnVar.C6 = true;
                        wnVar.ac(false);
                    } else {
                        wnVar.f45313v1.c(2, i14, true);
                    }
                    MessagesController messagesController = wnVar.getMessagesController();
                    int id3 = messageObject3.getId();
                    if (ChatObject.isChannel(wnVar.e)) {
                        j10 = wnVar.e.f22028id;
                    } else {
                        j10 = 0;
                    }
                    messagesController.markMentionMessageAsRead(id3, j10, wnVar.f45168j6);
                    messageObject3.setContentIsRead();
                }
                if (z21) {
                    org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view;
                    z11 = ((org.telegram.ui.ActionBar.r2) wnVar).inPreviewMode;
                    if (z11) {
                        s1Var2.setHighlighted(true);
                    } else {
                        s1Var2.Q3();
                    }
                }
            }
        }
    }
}
