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
public final class fm extends org.telegram.ui.Components.nl0 {
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
    public final un Q;
    public final Context h;
    public final boolean f39413n;
    public int f39414r;
    public int f39415s;
    public int v;
    public int f39416w;
    public int f39417x;
    public int f39418y;

    public fm(un unVar, Context context) {
        boolean z10;
        this.Q = unVar;
        this.e = new ArrayList();
        this.f31038f = new ArrayList();
        this.f39415s = -5;
        this.v = -5;
        this.f39416w = -5;
        this.f39417x = -5;
        this.f39418y = -5;
        this.E = -5;
        this.F = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.h = context;
        TLRPC.User user = unVar.f44242f;
        if (user != null && user.bot) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f39413n = z10;
        C(true);
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    public final void K(boolean z10) {
        un unVar = this.Q;
        if (UserObject.isBotForum(unVar.f44242f)) {
            if (z10) {
                unVar.Jc = true;
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
        return this.Q.G6;
    }

    public final void M(MessageObject messageObject) {
        un unVar = this.Q;
        int childCount = unVar.f44468x0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = unVar.f44468x0.getChildAt(i10);
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
        un unVar = this.Q;
        if (UserObject.isBotForumWithEditableTopics(unVar.f44242f) && unVar.b() == 0 && !unVar.Jc && unVar.f44221d4 == 0) {
            return true;
        }
        return false;
    }

    public final void O(boolean z10) {
        boolean z11;
        boolean z12;
        un unVar = this.Q;
        ArrayList arrayList = unVar.G6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify data set changed fragmentOpened=" + unVar.f44182a6);
        }
        if (z10 && unVar.f44182a6) {
            s4.m0 itemAnimator = unVar.f44468x0.getItemAnimator();
            qj qjVar = unVar.f44481y0;
            if (itemAnimator != qjVar) {
                unVar.f44468x0.setItemAnimator(qjVar);
            }
        } else {
            unVar.f44468x0.setItemAnimator(null);
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
        boolean[] zArr = unVar.O6;
        if ((zArr[0] && (unVar.X6 == 0 || zArr[1])) || z11) {
            z12 = ((org.telegram.ui.ActionBar.r2) unVar).fragmentBeginToShow;
            unVar.S6(z12);
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
        un unVar = this.Q;
        z11 = ((org.telegram.ui.ActionBar.r2) unVar).fragmentBeginToShow;
        if (!z11) {
            unVar.f44468x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = unVar.f44468x0.getItemAnimator();
            qj qjVar = unVar.f44481y0;
            if (itemAnimator != qjVar) {
                unVar.f44468x0.setItemAnimator(qjVar);
            }
        }
        if (z10 && unVar.f44481y0 != null) {
            s4.m0 itemAnimator2 = unVar.f44468x0.getItemAnimator();
            qj qjVar2 = unVar.f44481y0;
            if (itemAnimator2 == qjVar2) {
                s4.e1 K = unVar.f44468x0.K(i10);
                if (K == null) {
                    qjVar2.getClass();
                } else {
                    qjVar2.S.add(K);
                    View view = K.f47735a;
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
        un unVar = this.Q;
        ArrayList arrayList = unVar.G6;
        if (unVar.f44493z0 != null && !this.L && !this.N) {
            int i12 = 0;
            if (!unVar.P4 && unVar.V7 != null) {
                int childCount = unVar.f44468x0.getChildCount();
                int i13 = 0;
                while (true) {
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = unVar.f44468x0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                        MessageObject messageObject2 = unVar.V7;
                        if (messageObject == messageObject2) {
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                i11 = arrayList.indexOf(unVar.V7) + this.J;
                                i12 = unVar.V8(childAt);
                            }
                        }
                    }
                    i13++;
                }
            }
            i11 = -1;
            m(i10);
            if (i11 != -1) {
                unVar.f44493z0.h1(i11, i12);
            }
        }
    }

    public final org.telegram.ui.Cells.s1 R(MessageObject messageObject, boolean z10, boolean z11) {
        ArrayList arrayList;
        un unVar = this.Q;
        if (z10) {
            int childCount = unVar.f44468x0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = unVar.f44468x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.getMessageObject() == messageObject && TextUtils.equals(s1Var.f7, s1Var.f25363y7.messageOwner.post_author)) {
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
            arrayList = unVar.G6;
        }
        int indexOf = arrayList.indexOf(messageObject2);
        if (indexOf == -1) {
            return null;
        }
        if (z11) {
            int i11 = un.f44170dd;
            un.f44170dd = i11 + 1;
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
        int i10 = this.f39414r;
        int i11 = this.f39416w;
        int i12 = this.f39418y;
        int i13 = this.f39415s;
        int i14 = this.v;
        int i15 = this.E;
        int i16 = this.F;
        int i17 = this.J;
        int i18 = this.K;
        int i19 = this.G;
        int i20 = this.H;
        int i21 = this.I;
        S();
        if (i10 == this.f39414r && i11 == this.f39416w && i15 == this.E && i16 == this.F && i17 == this.J && i18 == this.K && i13 == this.f39415s && i14 == this.v && i12 == this.f39418y && i19 == this.G && i20 == this.H && i21 == this.I) {
            return;
        }
        O(false);
    }

    @Override
    public final int h() {
        this.f39417x = -5;
        un unVar = this.Q;
        a0.h hVar = unVar.f44374p8;
        if (unVar.Y5.get(unVar.f44370p4, 0) != 0) {
            TLRPC.User user = unVar.f44242f;
            if (user == null || !user.bot || unVar.f44221d4 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(unVar.f44242f.f22174id)).description == null && ((TL_bots.BotInfo) hVar.f(unVar.f44242f.f22174id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(unVar.f44242f.f22174id)).description_document == null)) && !UserObject.isReplyUser(unVar.f44242f) && !UserObject.isBotForum(unVar.f44242f))) {
                return 0;
            }
            this.f39417x = 0;
            return 1;
        }
        return this.f39414r;
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList;
        un unVar = this.Q;
        if (unVar.Y5.get(unVar.f44370p4, 0) == 0 || i10 != this.f39417x) {
            if (this.L) {
                arrayList = this.M;
            } else if (this.N) {
                arrayList = this.P;
            } else {
                arrayList = unVar.G6;
            }
            int i11 = this.J;
            if (i10 >= i11 && i10 < this.K) {
                return ((MessageObject) arrayList.get(i10 - i11)).stableId;
            }
            if (i10 != this.f39416w && i10 != this.f39417x) {
                if (i10 == this.E) {
                    return 2L;
                }
                if (i10 == this.F) {
                    return 3L;
                }
                if (i10 == this.f39415s) {
                    return 4L;
                }
                if (i10 == this.f39418y) {
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
        un unVar = this.Q;
        if (unVar.Y5.get(unVar.f44370p4, 0) == 0 || i10 != this.f39417x) {
            if (i10 != this.f39415s && i10 != this.v) {
                int i11 = this.J;
                if (i10 >= i11 && i10 < this.K) {
                    if (this.L) {
                        arrayList = this.M;
                    } else if (this.N) {
                        arrayList = this.P;
                    } else {
                        arrayList = unVar.G6;
                    }
                    return ((MessageObject) arrayList.get(i10 - i11)).contentType;
                } else if (i10 == this.f39416w) {
                    return 3;
                } else {
                    if (i10 == this.f39418y) {
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
        un unVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.r2) unVar).fragmentBeginToShow;
        if (z10 && !unVar.Z0) {
            s4.m0 itemAnimator = unVar.f44468x0.getItemAnimator();
            qj qjVar = unVar.f44481y0;
            if (itemAnimator != qjVar) {
                unVar.f44468x0.setItemAnimator(qjVar);
            }
        } else {
            unVar.f44468x0.setItemAnimator(null);
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
        un unVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.r2) unVar).fragmentBeginToShow;
        if (!z10) {
            unVar.f44468x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = unVar.f44468x0.getItemAnimator();
            qj qjVar = unVar.f44481y0;
            if (itemAnimator != qjVar) {
                unVar.f44468x0.setItemAnimator(qjVar);
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
        un unVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.r2) unVar).fragmentBeginToShow;
        if (!z10) {
            unVar.f44468x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = unVar.f44468x0.getItemAnimator();
            qj qjVar = unVar.f44481y0;
            if (itemAnimator != qjVar) {
                unVar.f44468x0.setItemAnimator(qjVar);
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
        un unVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.r2) unVar).fragmentBeginToShow;
        if (!z10) {
            unVar.f44468x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = unVar.f44468x0.getItemAnimator();
            qj qjVar = unVar.f44481y0;
            if (itemAnimator != qjVar) {
                unVar.f44468x0.setItemAnimator(qjVar);
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
        un unVar = this.Q;
        ArrayList arrayList = unVar.G6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range inserted " + i10 + ":" + i11);
        }
        z10 = ((org.telegram.ui.ActionBar.r2) unVar).fragmentBeginToShow;
        if (!z10) {
            unVar.f44468x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = unVar.f44468x0.getItemAnimator();
            qj qjVar = unVar.f44481y0;
            if (itemAnimator != qjVar) {
                unVar.f44468x0.setItemAnimator(qjVar);
            }
        }
        S();
        if (i10 == 1 && i11 > 0 && (i12 = i10 + i11) >= (i13 = this.J) && i12 < this.K) {
            MessageObject messageObject = (MessageObject) arrayList.get(i12 - i13);
            MessageObject messageObject2 = (MessageObject) arrayList.get((i12 - this.J) - 1);
            if ((unVar.e != null && messageObject.getFromChatId() == messageObject2.getFromChatId()) || (unVar.f44242f != null && messageObject.isOutOwner() == messageObject2.isOutOwner())) {
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
        un unVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.r2) unVar).fragmentBeginToShow;
        if (!z10) {
            unVar.f44468x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = unVar.f44468x0.getItemAnimator();
            qj qjVar = unVar.f44481y0;
            if (itemAnimator != qjVar) {
                unVar.f44468x0.setItemAnimator(qjVar);
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
        un unVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.r2) unVar).fragmentBeginToShow;
        if (!z10) {
            unVar.f44468x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = unVar.f44468x0.getItemAnimator();
            qj qjVar = unVar.f44481y0;
            if (itemAnimator != qjVar) {
                unVar.f44468x0.setItemAnimator(qjVar);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fm.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s1 s1Var;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.Cells.s1 s1Var2;
        int i14;
        un unVar = this.Q;
        if (i10 == 0) {
            i14 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            s1Var = new org.telegram.ui.Cells.s1(this.h, i14, true, unVar.Oa, unVar.f44385qa);
            s1Var.setResourcesProvider(unVar.f44385qa);
            if (unVar.Lc == null) {
                unVar.Lc = new fn(unVar);
            }
            s1Var.setDelegate(unVar.Lc);
            s1Var.Pd = unVar.f44326lc;
            if (unVar.h == null) {
                s1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i10 == 1) {
                ?? v0Var = new org.telegram.ui.Cells.v0(context, unVar.f44385qa, true);
                v0Var.setInvalidateColors(true);
                v0Var.setDelegate(new wl(this));
                s1Var = v0Var;
            } else {
                if (i10 == 2) {
                    ?? u1Var = new org.telegram.ui.Cells.u1(context, unVar.f44385qa);
                    org.telegram.ui.ActionBar.f7.V(u1Var.getTextView(), org.telegram.ui.ActionBar.y6.Ee, unVar.f44385qa);
                    Drawable background = u1Var.getBackgroundLayout().getBackground();
                    s1Var2 = u1Var;
                    if (background != null) {
                        org.telegram.ui.ActionBar.f7.y(u1Var.getBackgroundLayout(), u1Var.getBackgroundLayout().getBackground(), org.telegram.ui.ActionBar.y6.Fe, unVar.f44385qa, PorterDuff.Mode.MULTIPLY);
                        s1Var2 = u1Var;
                    }
                } else if (i10 == 3) {
                    i13 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    ?? xlVar = new xl(this, context, i13, unVar.f44385qa);
                    xlVar.setDelegate(new y0(this, 22));
                    s1Var2 = xlVar;
                } else if (i10 == 4) {
                    s1Var2 = new org.telegram.ui.Cells.y0(context, unVar.f44385qa);
                } else if (i10 == 6) {
                    i12 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    s1Var2 = new org.telegram.ui.Cells.cb(context, i12, unVar.f44385qa);
                } else if (i10 == 7) {
                    s1Var2 = new org.telegram.ui.Cells.v0(context, unVar.f44385qa, false);
                } else if (i10 == 8) {
                    i11 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    s1Var2 = new yl(this, context, i11, unVar.f44385qa);
                } else if (i10 == 10) {
                    ?? t1Var = new org.telegram.ui.Cells.t1(context, unVar.f44385qa);
                    if (unVar.Lc == null) {
                        unVar.Lc = new fn(unVar);
                    }
                    t1Var.setDelegate(unVar.Lc);
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
        View view = e1Var.f47735a;
        boolean z20 = view instanceof org.telegram.ui.Cells.s1;
        un unVar = this.Q;
        if (z20 || (view instanceof org.telegram.ui.Cells.v0)) {
            unVar.z9();
        }
        boolean z21 = view instanceof org.telegram.ui.Cells.s1;
        if (z21) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            MessageObject messageObject = s1Var.getMessageObject();
            s1Var.E8 = unVar.B9();
            s1Var.F8 = unVar.L9();
            s1Var.G8 = unVar.K9();
            s1Var.H8 = unVar.a9();
            s1Var.I8 = unVar.b9();
            s1Var.i4(-1, true, false);
            MessageObject messageObject2 = unVar.S3;
            if (messageObject2 != null && messageObject2.equals(messageObject)) {
                s1Var.i4(unVar.T3, false, false);
            }
            if (messageObject.isAnimatedEmoji() && (stickerEmoji = messageObject.getStickerEmoji()) != null && (emojiSound = unVar.getMessagesController().emojiSounds.get(stickerEmoji.replace("️", ""))) != null) {
                unVar.getMediaController().playEmojiSound(unVar.getAccountInstance(), stickerEmoji, emojiSound, true);
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
            kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
            if (!kVar.q() && !unVar.J9()) {
                s1Var.setDrawSelectionBackground(false);
                s1Var.N3(false, false, false);
                s1Var.L3(false, false);
                z13 = false;
                z14 = false;
            } else {
                unVar.Z7 = false;
                unVar.f44184a8 = 0L;
                unVar.f44198b8 = null;
                ArrayList arrayList2 = unVar.f44330m4;
                if (arrayList2 != null && arrayList2.contains(messageObject)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                s1Var.L3(z12, false);
                if (messageObject.getDialogId() == unVar.f44249f6) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if (unVar.f44285i6[i10].indexOfKey(messageObject.getId()) >= 0) {
                    unVar.sb(messageObject, s1Var, i10, false);
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
            if (unVar.f44221d4 == 7 && unVar.G3 != null && (str = unVar.F3) != null) {
                s1Var.U3(str);
            } else {
                kk kkVar = unVar.f44220d3;
                if (kkVar != null && kkVar.getVisibility() == 0) {
                    MediaDataController mediaDataController = unVar.getMediaDataController();
                    int id2 = messageObject.getId();
                    if (messageObject.getDialogId() == unVar.X6) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (mediaDataController.isMessageFound(id2, z16) && unVar.getMediaDataController().getLastSearchQuery() != null) {
                        s1Var.U3(unVar.getMediaDataController().getLastSearchQuery());
                    }
                }
                s1Var.U3(null);
            }
            z17 = ((org.telegram.ui.ActionBar.r2) unVar).inPreviewMode;
            if (!z17 || !s1Var.f25091f8) {
                if (unVar.X7 != Integer.MAX_VALUE && ((s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == unVar.X7) || (s1Var.getCurrentMessagesGroup() != null && s1Var.getCurrentMessagesGroup().contains(unVar.X7)))) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                s1Var.setHighlighted(z18);
                boolean z23 = s1Var.f25091f8;
                if (z23 && unVar.f44198b8 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String str2 = unVar.f44198b8;
                    int i12 = unVar.f44238e8;
                    if (!unVar.Z7 && currentTimeMillis - unVar.f44184a8 >= 200) {
                        z19 = false;
                    } else {
                        z19 = true;
                    }
                    if (!s1Var.V3(str2, true, z19, i12) && unVar.Y7) {
                        org.telegram.ui.Components.wc.b0(unVar).R(R.raw.error, 36, LocaleController.getString(R.string.QuoteNotFound)).k(true);
                    }
                    unVar.Y7 = false;
                    if (unVar.Z7) {
                        unVar.f44184a8 = currentTimeMillis;
                    }
                    unVar.Z7 = false;
                } else if (z23 && (num = unVar.f44212c8) != null) {
                    s1Var.T3(num.intValue());
                } else if (z23 && (bArr = unVar.f44225d8) != null) {
                    s1Var.R3(bArr);
                }
                if (unVar.X7 != Integer.MAX_VALUE) {
                    unVar.lc();
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            v0Var.f25509e0 = unVar.B9();
            v0Var.f25522i0 = unVar.L9();
            unVar.K9();
            unVar.a9();
            v0Var.f25525j0 = unVar.b9();
        } else if (view instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).getTextView().setTranslationX(unVar.b9() / 2.0f);
        }
        int b10 = e1Var.b();
        int i13 = this.J;
        if (b10 >= i13 && b10 < this.K) {
            if (this.L) {
                arrayList = this.M;
            } else if (this.N) {
                arrayList = this.P;
            } else {
                arrayList = unVar.G6;
            }
            MessageObject messageObject3 = (MessageObject) arrayList.get(b10 - i13);
            if (messageObject3 != null && (message = messageObject3.messageOwner) != null && message.media_unread && message.mentioned) {
                z10 = ((org.telegram.ui.ActionBar.r2) unVar).inPreviewMode;
                if (!z10 && unVar.f44221d4 == 0 && !messageObject3.isVoice() && !messageObject3.isRoundVideo()) {
                    int i14 = unVar.f44474x6 - 1;
                    unVar.f44474x6 = i14;
                    if (i14 <= 0) {
                        unVar.f44474x6 = 0;
                        unVar.f44486y6 = true;
                        unVar.Wb(false);
                    } else {
                        unVar.f44442v1.c(2, i14, true);
                    }
                    MessagesController messagesController = unVar.getMessagesController();
                    int id3 = messageObject3.getId();
                    if (ChatObject.isChannel(unVar.e)) {
                        j10 = unVar.e.f22027id;
                    } else {
                        j10 = 0;
                    }
                    messagesController.markMentionMessageAsRead(id3, j10, unVar.f44249f6);
                    messageObject3.setContentIsRead();
                }
                if (z21) {
                    org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view;
                    z11 = ((org.telegram.ui.ActionBar.r2) unVar).inPreviewMode;
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
