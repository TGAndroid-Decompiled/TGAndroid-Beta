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
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public final ArrayList J;
    public boolean K;
    public boolean L;
    public final ArrayList M;
    public final xn N;
    public final Context h;
    public final boolean f38076n;
    public int f38077r;
    public int f38078s;
    public int v;
    public int f38079w;
    public int f38080x;
    public int f38081y;

    public jm(xn xnVar, Context context) {
        boolean z4;
        this.N = xnVar;
        this.f33124e = new ArrayList();
        this.f33125f = new ArrayList();
        this.f38078s = -5;
        this.v = -5;
        this.f38079w = -5;
        this.f38080x = -5;
        this.f38081y = -5;
        this.B = -5;
        this.C = -5;
        this.D = -5;
        this.E = -5;
        this.F = -5;
        this.J = new ArrayList();
        this.M = new ArrayList();
        this.h = context;
        TLRPC.User user = xnVar.f43156f;
        if (user != null && user.bot) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f38076n = z4;
        C(true);
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    public final void K(boolean z4) {
        xn xnVar = this.N;
        if (UserObject.isBotForum(xnVar.f43156f)) {
            if (z4) {
                xnVar.f43230kc = true;
            }
            if (this.F >= 0 && !N()) {
                super.u(this.F);
                S();
            }
        }
    }

    public final ArrayList L() {
        if (this.I) {
            return this.J;
        }
        if (this.K) {
            return this.M;
        }
        return this.N.f43311r6;
    }

    public final void M(MessageObject messageObject) {
        xn xnVar = this.N;
        int childCount = xnVar.f43340u0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = xnVar.f43340u0.getChildAt(i10);
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
        xn xnVar = this.N;
        if (UserObject.isBotForumWithEditableTopics(xnVar.f43156f) && xnVar.b() == 0 && !xnVar.f43230kc && xnVar.O3 == 0) {
            return true;
        }
        return false;
    }

    public final void O(boolean z4) {
        boolean z10;
        boolean z11;
        xn xnVar = this.N;
        ArrayList arrayList = xnVar.f43311r6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify data set changed fragmentOpened=" + xnVar.L5);
        }
        if (z4 && xnVar.L5) {
            f2.u0 itemAnimator = xnVar.f43340u0.getItemAnimator();
            sj sjVar = xnVar.f43353v0;
            if (itemAnimator != sjVar) {
                xnVar.f43340u0.setItemAnimator(sjVar);
            }
        } else {
            xnVar.f43340u0.setItemAnimator(null);
        }
        S();
        try {
            super.l();
        } catch (Exception e6) {
            FileLog.e(e6);
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
                        z10 = true;
                    }
                }
            }
        }
        z10 = false;
        boolean[] zArr = xnVar.f43413z6;
        if ((zArr[0] && (xnVar.I6 == 0 || zArr[1])) || z10) {
            z11 = ((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow;
            xnVar.L6(z11);
        }
    }

    public final void P(int i10, boolean z4) {
        boolean z10;
        MessageObject messageObject;
        String str;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder("notify item removed ");
            sb.append(i10);
            if (z4) {
                str = " with thanos effect";
            } else {
                str = "";
            }
            yh.v(str, sb);
        }
        xn xnVar = this.N;
        z10 = ((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow;
        if (!z10) {
            xnVar.f43340u0.setItemAnimator(null);
        } else {
            f2.u0 itemAnimator = xnVar.f43340u0.getItemAnimator();
            sj sjVar = xnVar.f43353v0;
            if (itemAnimator != sjVar) {
                xnVar.f43340u0.setItemAnimator(sjVar);
            }
        }
        if (z4 && xnVar.f43353v0 != null) {
            f2.u0 itemAnimator2 = xnVar.f43340u0.getItemAnimator();
            sj sjVar2 = xnVar.f43353v0;
            if (itemAnimator2 == sjVar2) {
                f2.m1 K = xnVar.f43340u0.K(i10);
                if (K == null) {
                    sjVar2.getClass();
                } else {
                    sjVar2.S.add(K);
                    View view = K.f5875a;
                    if ((view instanceof org.telegram.ui.Cells.t1) && (messageObject = ((org.telegram.ui.Cells.t1) view).getMessageObject()) != null) {
                        messageObject.deletedByThanos = true;
                    }
                }
            }
        }
        S();
        try {
            super.u(i10);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final void Q(int i10) {
        int i11;
        xn xnVar = this.N;
        ArrayList arrayList = xnVar.f43311r6;
        if (xnVar.f43367w0 != null && !this.I && !this.K) {
            int i12 = 0;
            if (!xnVar.A4 && xnVar.G7 != null) {
                int childCount = xnVar.f43340u0.getChildCount();
                int i13 = 0;
                while (true) {
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = xnVar.f43340u0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                        MessageObject messageObject2 = xnVar.G7;
                        if (messageObject == messageObject2) {
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                i11 = arrayList.indexOf(xnVar.G7) + this.G;
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
                xnVar.f43367w0.h1(i11, i12);
            }
        }
    }

    public final org.telegram.ui.Cells.t1 R(MessageObject messageObject, boolean z4, boolean z10) {
        ArrayList arrayList;
        xn xnVar = this.N;
        if (z4) {
            int childCount = xnVar.f43340u0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = xnVar.f43340u0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject() == messageObject && TextUtils.equals(t1Var.f23804c7, t1Var.f24075v7.messageOwner.post_author)) {
                        t1Var.X3(messageObject, t1Var.getCurrentMessagesGroup(), t1Var.m3(), t1Var.n3(), t1Var.h3(), t1Var.j3());
                        return t1Var;
                    }
                }
                i10++;
                messageObject = messageObject;
            }
        }
        MessageObject messageObject2 = messageObject;
        if (this.I) {
            arrayList = this.J;
        } else if (this.K) {
            arrayList = this.M;
        } else {
            arrayList = xnVar.f43311r6;
        }
        int indexOf = arrayList.indexOf(messageObject2);
        if (indexOf == -1) {
            return null;
        }
        if (z10) {
            int i11 = xn.Gc;
            xn.Gc = i11 + 1;
            messageObject2.stableId = i11;
            O(true);
            return null;
        }
        Q(this.G + indexOf);
        return null;
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jm.S():void");
    }

    public final void T() {
        int i10 = this.f38077r;
        int i11 = this.f38079w;
        int i12 = this.f38081y;
        int i13 = this.f38078s;
        int i14 = this.v;
        int i15 = this.B;
        int i16 = this.C;
        int i17 = this.G;
        int i18 = this.H;
        int i19 = this.D;
        int i20 = this.E;
        int i21 = this.F;
        S();
        if (i10 == this.f38077r && i11 == this.f38079w && i15 == this.B && i16 == this.C && i17 == this.G && i18 == this.H && i13 == this.f38078s && i14 == this.v && i12 == this.f38081y && i19 == this.D && i20 == this.E && i21 == this.F) {
            return;
        }
        O(false);
    }

    @Override
    public final int h() {
        this.f38080x = -5;
        xn xnVar = this.N;
        a0.h hVar = xnVar.f43098a8;
        if (xnVar.J5.get(xnVar.f43094a4, 0) != 0) {
            TLRPC.User user = xnVar.f43156f;
            if (user == null || !user.bot || xnVar.O3 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(xnVar.f43156f.f20992id)).description == null && ((TL_bots.BotInfo) hVar.f(xnVar.f43156f.f20992id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(xnVar.f43156f.f20992id)).description_document == null)) && !UserObject.isReplyUser(xnVar.f43156f) && !UserObject.isBotForum(xnVar.f43156f))) {
                return 0;
            }
            this.f38080x = 0;
            return 1;
        }
        return this.f38077r;
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList;
        xn xnVar = this.N;
        if (xnVar.J5.get(xnVar.f43094a4, 0) == 0 || i10 != this.f38080x) {
            if (this.I) {
                arrayList = this.J;
            } else if (this.K) {
                arrayList = this.M;
            } else {
                arrayList = xnVar.f43311r6;
            }
            int i11 = this.G;
            if (i10 >= i11 && i10 < this.H) {
                return ((MessageObject) arrayList.get(i10 - i11)).stableId;
            }
            if (i10 != this.f38079w && i10 != this.f38080x) {
                if (i10 == this.B) {
                    return 2L;
                }
                if (i10 == this.C) {
                    return 3L;
                }
                if (i10 == this.f38078s) {
                    return 4L;
                }
                if (i10 == this.f38081y) {
                    return 6L;
                }
                if (i10 == this.D) {
                    return 7L;
                }
                if (i10 == this.E) {
                    return 8L;
                }
                if (i10 == this.F) {
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
        xn xnVar = this.N;
        if (xnVar.J5.get(xnVar.f43094a4, 0) == 0 || i10 != this.f38080x) {
            if (i10 != this.f38078s && i10 != this.v) {
                int i11 = this.G;
                if (i10 >= i11 && i10 < this.H) {
                    if (this.I) {
                        arrayList = this.J;
                    } else if (this.K) {
                        arrayList = this.M;
                    } else {
                        arrayList = xnVar.f43311r6;
                    }
                    return ((MessageObject) arrayList.get(i10 - i11)).contentType;
                } else if (i10 == this.f38079w) {
                    return 3;
                } else {
                    if (i10 == this.f38081y) {
                        return 6;
                    }
                    if (i10 != this.E && i10 != this.D) {
                        if (i10 == this.F) {
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
        boolean z4;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item changed " + i10);
        }
        xn xnVar = this.N;
        z4 = ((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow;
        if (z4 && !xnVar.K0) {
            f2.u0 itemAnimator = xnVar.f43340u0.getItemAnimator();
            sj sjVar = xnVar.f43353v0;
            if (itemAnimator != sjVar) {
                xnVar.f43340u0.setItemAnimator(sjVar);
            }
        } else {
            xnVar.f43340u0.setItemAnimator(null);
        }
        S();
        try {
            super.m(i10);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void o(int i10) {
        boolean z4;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item inserted " + i10);
        }
        xn xnVar = this.N;
        z4 = ((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow;
        if (!z4) {
            xnVar.f43340u0.setItemAnimator(null);
        } else {
            f2.u0 itemAnimator = xnVar.f43340u0.getItemAnimator();
            sj sjVar = xnVar.f43353v0;
            if (itemAnimator != sjVar) {
                xnVar.f43340u0.setItemAnimator(sjVar);
            }
        }
        S();
        try {
            super.o(i10);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void p(int i10, int i11) {
        boolean z4;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item moved" + i10 + ":" + i11);
        }
        xn xnVar = this.N;
        z4 = ((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow;
        if (!z4) {
            xnVar.f43340u0.setItemAnimator(null);
        } else {
            f2.u0 itemAnimator = xnVar.f43340u0.getItemAnimator();
            sj sjVar = xnVar.f43353v0;
            if (itemAnimator != sjVar) {
                xnVar.f43340u0.setItemAnimator(sjVar);
            }
        }
        S();
        try {
            super.p(i10, i11);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void q(int i10, int i11) {
        boolean z4;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range changed " + i10 + ":" + i11);
        }
        xn xnVar = this.N;
        z4 = ((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow;
        if (!z4) {
            xnVar.f43340u0.setItemAnimator(null);
        } else {
            f2.u0 itemAnimator = xnVar.f43340u0.getItemAnimator();
            sj sjVar = xnVar.f43353v0;
            if (itemAnimator != sjVar) {
                xnVar.f43340u0.setItemAnimator(sjVar);
            }
        }
        S();
        try {
            super.q(i10, i11);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void s(int i10, int i11) {
        boolean z4;
        int i12;
        int i13;
        xn xnVar = this.N;
        ArrayList arrayList = xnVar.f43311r6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range inserted " + i10 + ":" + i11);
        }
        z4 = ((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow;
        if (!z4) {
            xnVar.f43340u0.setItemAnimator(null);
        } else {
            f2.u0 itemAnimator = xnVar.f43340u0.getItemAnimator();
            sj sjVar = xnVar.f43353v0;
            if (itemAnimator != sjVar) {
                xnVar.f43340u0.setItemAnimator(sjVar);
            }
        }
        S();
        if (i10 == 1 && i11 > 0 && (i12 = i10 + i11) >= (i13 = this.G) && i12 < this.H) {
            MessageObject messageObject = (MessageObject) arrayList.get(i12 - i13);
            MessageObject messageObject2 = (MessageObject) arrayList.get((i12 - this.G) - 1);
            if ((xnVar.f43143e != null && messageObject.getFromChatId() == messageObject2.getFromChatId()) || (xnVar.f43156f != null && messageObject.isOutOwner() == messageObject2.isOutOwner())) {
                m(i10);
            }
        }
        try {
            super.s(i10, i11);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void t(int i10, int i11) {
        boolean z4;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range removed" + i10 + ":" + i11);
        }
        xn xnVar = this.N;
        z4 = ((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow;
        if (!z4) {
            xnVar.f43340u0.setItemAnimator(null);
        } else {
            f2.u0 itemAnimator = xnVar.f43340u0.getItemAnimator();
            sj sjVar = xnVar.f43353v0;
            if (itemAnimator != sjVar) {
                xnVar.f43340u0.setItemAnimator(sjVar);
            }
        }
        S();
        try {
            super.t(i10, i11);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void u(int i10) {
        boolean z4;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item removed " + i10);
        }
        xn xnVar = this.N;
        z4 = ((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow;
        if (!z4) {
            xnVar.f43340u0.setItemAnimator(null);
        } else {
            f2.u0 itemAnimator = xnVar.f43340u0.getItemAnimator();
            sj sjVar = xnVar.f43353v0;
            if (itemAnimator != sjVar) {
                xnVar.f43340u0.setItemAnimator(sjVar);
            }
        }
        S();
        try {
            super.u(i10);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void v(f2.m1 r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jm.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.t1 t1Var;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.Cells.t1 t1Var2;
        int i14;
        xn xnVar = this.N;
        if (i10 == 0) {
            i14 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            t1Var = new org.telegram.ui.Cells.t1(this.h, i14, true, xnVar.f43405ya, xnVar.f43114ba);
            t1Var.setResourcesProvider(xnVar.f43114ba);
            if (xnVar.f43253mc == null) {
                xnVar.f43253mc = new jn(xnVar);
            }
            t1Var.setDelegate(xnVar.f43253mc);
            t1Var.Md = xnVar.Mb;
            if (xnVar.h == null) {
                t1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i10 == 1) {
                ?? v0Var = new org.telegram.ui.Cells.v0(context, xnVar.f43114ba, true);
                v0Var.setInvalidateColors(true);
                v0Var.setDelegate(new bm(this));
                t1Var = v0Var;
            } else {
                if (i10 == 2) {
                    t1Var2 = new org.telegram.ui.Cells.v1(context, xnVar.f43114ba);
                } else if (i10 == 3) {
                    i13 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    ?? cmVar = new cm(this, context, i13, xnVar.f43114ba);
                    cmVar.setDelegate(new a1(this, 20));
                    t1Var2 = cmVar;
                } else if (i10 == 4) {
                    t1Var2 = new org.telegram.ui.Cells.y0(context, xnVar.f43114ba);
                } else if (i10 == 6) {
                    i12 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    t1Var2 = new org.telegram.ui.Cells.xa(context, i12, xnVar.f43114ba);
                } else if (i10 == 7) {
                    t1Var2 = new org.telegram.ui.Cells.v0(context, xnVar.f43114ba, false);
                } else if (i10 == 8) {
                    i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    t1Var2 = new dm(this, context, i11, xnVar.f43114ba);
                } else if (i10 == 10) {
                    ?? u1Var = new org.telegram.ui.Cells.u1(context, xnVar.f43114ba);
                    if (xnVar.f43253mc == null) {
                        xnVar.f43253mc = new jn(xnVar);
                    }
                    u1Var.setDelegate(xnVar.f43253mc);
                    t1Var2 = u1Var;
                } else {
                    t1Var = null;
                }
                t1Var = t1Var2;
            }
        }
        return yh.o(t1Var, t1Var, -1, -2);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        ArrayList arrayList;
        TLRPC.Message message;
        boolean z4;
        boolean z10;
        long j10;
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        byte[] bArr;
        Integer num;
        boolean z18;
        String str;
        String stickerEmoji;
        MessagesController.EmojiSound emojiSound;
        View view = m1Var.f5875a;
        boolean z19 = view instanceof org.telegram.ui.Cells.t1;
        xn xnVar = this.N;
        if (z19 || (view instanceof org.telegram.ui.Cells.v0)) {
            xnVar.r9();
        }
        boolean z20 = view instanceof org.telegram.ui.Cells.t1;
        if (z20) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            MessageObject messageObject = t1Var.getMessageObject();
            t1Var.B8 = xnVar.t9();
            t1Var.C8 = xnVar.C9();
            t1Var.D8 = xnVar.B9();
            t1Var.E8 = xnVar.Q8();
            t1Var.F8 = xnVar.R8();
            t1Var.g4(-1, true, false);
            MessageObject messageObject2 = xnVar.D3;
            if (messageObject2 != null && messageObject2.equals(messageObject)) {
                t1Var.g4(xnVar.E3, false, false);
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
            kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
            if (!kVar.s() && !xnVar.A9()) {
                t1Var.setDrawSelectionBackground(false);
                t1Var.L3(false, false, false);
                t1Var.J3(false, false);
                z12 = false;
                z13 = false;
            } else {
                xnVar.K7 = false;
                xnVar.L7 = 0L;
                xnVar.M7 = null;
                ArrayList arrayList2 = xnVar.X3;
                if (arrayList2 != null && arrayList2.contains(messageObject)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                t1Var.J3(z11, false);
                if (messageObject.getDialogId() == xnVar.Q5) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if (xnVar.T5[i10].indexOfKey(messageObject.getId()) >= 0) {
                    xnVar.hb(messageObject, t1Var, i10, false);
                    z12 = true;
                } else {
                    t1Var.setDrawSelectionBackground(false);
                    t1Var.L3(false, false, false);
                    z12 = false;
                }
                z13 = true;
            }
            boolean z21 = !z13;
            if (z13 && z12) {
                z14 = true;
            } else {
                z14 = false;
            }
            t1Var.K3(z21, z14);
            if (xnVar.O3 == 7 && xnVar.f43308r3 != null && (str = xnVar.f43295q3) != null) {
                t1Var.S3(str);
            } else {
                nk nkVar = xnVar.O2;
                if (nkVar != null && nkVar.getVisibility() == 0) {
                    MediaDataController mediaDataController = xnVar.getMediaDataController();
                    int id2 = messageObject.getId();
                    if (messageObject.getDialogId() == xnVar.I6) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (mediaDataController.isMessageFound(id2, z15) && xnVar.getMediaDataController().getLastSearchQuery() != null) {
                        t1Var.S3(xnVar.getMediaDataController().getLastSearchQuery());
                    }
                }
                t1Var.S3(null);
            }
            z16 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
            if (!z16 || !t1Var.f23805c8) {
                if (xnVar.I7 != Integer.MAX_VALUE && ((t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == xnVar.I7) || (t1Var.getCurrentMessagesGroup() != null && t1Var.getCurrentMessagesGroup().contains(xnVar.I7)))) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                t1Var.setHighlighted(z17);
                boolean z22 = t1Var.f23805c8;
                if (z22 && xnVar.M7 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String str2 = xnVar.M7;
                    int i12 = xnVar.P7;
                    if (!xnVar.K7 && currentTimeMillis - xnVar.L7 >= 200) {
                        z18 = false;
                    } else {
                        z18 = true;
                    }
                    if (!t1Var.T3(str2, true, z18, i12) && xnVar.J7) {
                        org.telegram.ui.Components.qc.a0(xnVar).Q(R.raw.error, 36, LocaleController.getString(R.string.QuoteNotFound)).k(true);
                    }
                    xnVar.J7 = false;
                    if (xnVar.K7) {
                        xnVar.L7 = currentTimeMillis;
                    }
                    xnVar.K7 = false;
                } else if (z22 && (num = xnVar.N7) != null) {
                    t1Var.R3(num.intValue());
                } else if (z22 && (bArr = xnVar.O7) != null) {
                    t1Var.P3(bArr);
                }
                if (xnVar.I7 != Integer.MAX_VALUE) {
                    xnVar.Zb();
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            v0Var.f24242b0 = xnVar.t9();
            v0Var.f24255f0 = xnVar.C9();
            xnVar.B9();
            xnVar.Q8();
            v0Var.f24258g0 = xnVar.R8();
        } else if (view instanceof org.telegram.ui.Cells.v1) {
            ((org.telegram.ui.Cells.v1) view).getTextView().setTranslationX(xnVar.R8() / 2.0f);
        }
        int b10 = m1Var.b();
        int i13 = this.G;
        if (b10 >= i13 && b10 < this.H) {
            if (this.I) {
                arrayList = this.J;
            } else if (this.K) {
                arrayList = this.M;
            } else {
                arrayList = xnVar.f43311r6;
            }
            MessageObject messageObject3 = (MessageObject) arrayList.get(b10 - i13);
            if (messageObject3 != null && (message = messageObject3.messageOwner) != null && message.media_unread && message.mentioned) {
                z4 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
                if (!z4 && xnVar.O3 == 0 && !messageObject3.isVoice() && !messageObject3.isRoundVideo()) {
                    int i14 = xnVar.f43200i6 - 1;
                    xnVar.f43200i6 = i14;
                    if (i14 <= 0) {
                        xnVar.f43200i6 = 0;
                        xnVar.f43212j6 = true;
                        xnVar.Kb(false);
                    } else {
                        xnVar.f43170g1.c(2, i14, true);
                    }
                    MessagesController messagesController = xnVar.getMessagesController();
                    int id3 = messageObject3.getId();
                    if (ChatObject.isChannel(xnVar.f43143e)) {
                        j10 = xnVar.f43143e.f20845id;
                    } else {
                        j10 = 0;
                    }
                    messagesController.markMentionMessageAsRead(id3, j10, xnVar.Q5);
                    messageObject3.setContentIsRead();
                }
                if (z20) {
                    org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
                    z10 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
                    if (z10) {
                        t1Var2.setHighlighted(true);
                    } else {
                        t1Var2.O3();
                    }
                }
            }
        }
    }
}
