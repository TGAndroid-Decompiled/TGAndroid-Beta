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
public final class pm extends org.telegram.ui.Components.wk0 {
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
    public final boolean f35865n;
    public int f35866r;
    public int f35867s;
    public int v;
    public int f35868w;
    public int f35869x;
    public int f35870y;

    public pm(eo eoVar, Context context) {
        boolean z10;
        this.Q = eoVar;
        this.e = new ArrayList();
        this.f28787f = new ArrayList();
        this.f35867s = -5;
        this.v = -5;
        this.f35868w = -5;
        this.f35869x = -5;
        this.f35870y = -5;
        this.E = -5;
        this.F = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.h = context;
        TLRPC.User user = eoVar.f32318f;
        if (user != null && user.bot) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35865n = z10;
        C(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void K(boolean z10) {
        eo eoVar = this.Q;
        if (UserObject.isBotForum(eoVar.f32318f)) {
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
        return this.Q.f32509u6;
    }

    public final void M(MessageObject messageObject) {
        eo eoVar = this.Q;
        int childCount = eoVar.f32542x0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = eoVar.f32542x0.getChildAt(i10);
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
        eo eoVar = this.Q;
        if (UserObject.isBotForumWithEditableTopics(eoVar.f32318f) && eoVar.d() == 0 && !eoVar.nc && eoVar.R3 == 0) {
            return true;
        }
        return false;
    }

    public final void O(boolean z10) {
        boolean z11;
        boolean z12;
        eo eoVar = this.Q;
        ArrayList arrayList = eoVar.f32509u6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify data set changed fragmentOpened=" + eoVar.O5);
        }
        if (z10 && eoVar.O5) {
            s4.m0 itemAnimator = eoVar.f32542x0.getItemAnimator();
            yj yjVar = eoVar.f32555y0;
            if (itemAnimator != yjVar) {
                eoVar.f32542x0.setItemAnimator(yjVar);
            }
        } else {
            eoVar.f32542x0.setItemAnimator(null);
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
        boolean[] zArr = eoVar.C6;
        if ((zArr[0] && (eoVar.L6 == 0 || zArr[1])) || z11) {
            z12 = ((org.telegram.ui.ActionBar.p2) eoVar).fragmentBeginToShow;
            eoVar.L6(z12);
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
            hc.b.v(str, sb2);
        }
        eo eoVar = this.Q;
        z11 = ((org.telegram.ui.ActionBar.p2) eoVar).fragmentBeginToShow;
        if (!z11) {
            eoVar.f32542x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = eoVar.f32542x0.getItemAnimator();
            yj yjVar = eoVar.f32555y0;
            if (itemAnimator != yjVar) {
                eoVar.f32542x0.setItemAnimator(yjVar);
            }
        }
        if (z10 && eoVar.f32555y0 != null) {
            s4.m0 itemAnimator2 = eoVar.f32542x0.getItemAnimator();
            yj yjVar2 = eoVar.f32555y0;
            if (itemAnimator2 == yjVar2) {
                s4.c1 K = eoVar.f32542x0.K(i10);
                if (K == null) {
                    yjVar2.getClass();
                } else {
                    yjVar2.S.add(K);
                    View view = K.f41610a;
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
        eo eoVar = this.Q;
        ArrayList arrayList = eoVar.f32509u6;
        if (eoVar.f32567z0 != null && !this.L && !this.N) {
            int i12 = 0;
            if (!eoVar.D4 && eoVar.J7 != null) {
                int childCount = eoVar.f32542x0.getChildCount();
                int i13 = 0;
                while (true) {
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = eoVar.f32542x0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                        MessageObject messageObject2 = eoVar.J7;
                        if (messageObject == messageObject2) {
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                i11 = arrayList.indexOf(eoVar.J7) + this.J;
                                i12 = eoVar.L8(childAt);
                            }
                        }
                    }
                    i13++;
                }
            }
            i11 = -1;
            m(i10);
            if (i11 != -1) {
                eoVar.f32567z0.h1(i11, i12);
            }
        }
    }

    public final org.telegram.ui.Cells.t1 R(MessageObject messageObject, boolean z10, boolean z11) {
        ArrayList arrayList;
        eo eoVar = this.Q;
        if (z10) {
            int childCount = eoVar.f32542x0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = eoVar.f32542x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject() == messageObject && TextUtils.equals(t1Var.f7, t1Var.f20403y7.messageOwner.post_author)) {
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
            arrayList = eoVar.f32509u6;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pm.S():void");
    }

    public final void T() {
        int i10 = this.f35866r;
        int i11 = this.f35868w;
        int i12 = this.f35870y;
        int i13 = this.f35867s;
        int i14 = this.v;
        int i15 = this.E;
        int i16 = this.F;
        int i17 = this.J;
        int i18 = this.K;
        int i19 = this.G;
        int i20 = this.H;
        int i21 = this.I;
        S();
        if (i10 == this.f35866r && i11 == this.f35868w && i15 == this.E && i16 == this.F && i17 == this.J && i18 == this.K && i13 == this.f35867s && i14 == this.v && i12 == this.f35870y && i19 == this.G && i20 == this.H && i21 == this.I) {
            return;
        }
        O(false);
    }

    @Override
    public final int h() {
        this.f35869x = -5;
        eo eoVar = this.Q;
        a0.i iVar = eoVar.f32302d8;
        if (eoVar.M5.get(eoVar.f32298d4, 0) != 0) {
            TLRPC.User user = eoVar.f32318f;
            if (user == null || !user.bot || eoVar.R3 != 0 || ((iVar.m() <= 0 || (((TL_bots.BotInfo) iVar.f(eoVar.f32318f.f17342id)).description == null && ((TL_bots.BotInfo) iVar.f(eoVar.f32318f.f17342id)).description_photo == null && ((TL_bots.BotInfo) iVar.f(eoVar.f32318f.f17342id)).description_document == null)) && !UserObject.isReplyUser(eoVar.f32318f) && !UserObject.isBotForum(eoVar.f32318f))) {
                return 0;
            }
            this.f35869x = 0;
            return 1;
        }
        return this.f35866r;
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList;
        eo eoVar = this.Q;
        if (eoVar.M5.get(eoVar.f32298d4, 0) == 0 || i10 != this.f35869x) {
            if (this.L) {
                arrayList = this.M;
            } else if (this.N) {
                arrayList = this.P;
            } else {
                arrayList = eoVar.f32509u6;
            }
            int i11 = this.J;
            if (i10 >= i11 && i10 < this.K) {
                return ((MessageObject) arrayList.get(i10 - i11)).stableId;
            }
            if (i10 != this.f35868w && i10 != this.f35869x) {
                if (i10 == this.E) {
                    return 2L;
                }
                if (i10 == this.F) {
                    return 3L;
                }
                if (i10 == this.f35867s) {
                    return 4L;
                }
                if (i10 == this.f35870y) {
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
        if (eoVar.M5.get(eoVar.f32298d4, 0) == 0 || i10 != this.f35869x) {
            if (i10 != this.f35867s && i10 != this.v) {
                int i11 = this.J;
                if (i10 >= i11 && i10 < this.K) {
                    if (this.L) {
                        arrayList = this.M;
                    } else if (this.N) {
                        arrayList = this.P;
                    } else {
                        arrayList = eoVar.f32509u6;
                    }
                    return ((MessageObject) arrayList.get(i10 - i11)).contentType;
                } else if (i10 == this.f35868w) {
                    return 3;
                } else {
                    if (i10 == this.f35870y) {
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
        z10 = ((org.telegram.ui.ActionBar.p2) eoVar).fragmentBeginToShow;
        if (z10 && !eoVar.N0) {
            s4.m0 itemAnimator = eoVar.f32542x0.getItemAnimator();
            yj yjVar = eoVar.f32555y0;
            if (itemAnimator != yjVar) {
                eoVar.f32542x0.setItemAnimator(yjVar);
            }
        } else {
            eoVar.f32542x0.setItemAnimator(null);
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
        eo eoVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.p2) eoVar).fragmentBeginToShow;
        if (!z10) {
            eoVar.f32542x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = eoVar.f32542x0.getItemAnimator();
            yj yjVar = eoVar.f32555y0;
            if (itemAnimator != yjVar) {
                eoVar.f32542x0.setItemAnimator(yjVar);
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
        eo eoVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.p2) eoVar).fragmentBeginToShow;
        if (!z10) {
            eoVar.f32542x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = eoVar.f32542x0.getItemAnimator();
            yj yjVar = eoVar.f32555y0;
            if (itemAnimator != yjVar) {
                eoVar.f32542x0.setItemAnimator(yjVar);
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
        eo eoVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.p2) eoVar).fragmentBeginToShow;
        if (!z10) {
            eoVar.f32542x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = eoVar.f32542x0.getItemAnimator();
            yj yjVar = eoVar.f32555y0;
            if (itemAnimator != yjVar) {
                eoVar.f32542x0.setItemAnimator(yjVar);
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
        eo eoVar = this.Q;
        ArrayList arrayList = eoVar.f32509u6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range inserted " + i10 + ":" + i11);
        }
        z10 = ((org.telegram.ui.ActionBar.p2) eoVar).fragmentBeginToShow;
        if (!z10) {
            eoVar.f32542x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = eoVar.f32542x0.getItemAnimator();
            yj yjVar = eoVar.f32555y0;
            if (itemAnimator != yjVar) {
                eoVar.f32542x0.setItemAnimator(yjVar);
            }
        }
        S();
        if (i10 == 1 && i11 > 0 && (i12 = i10 + i11) >= (i13 = this.J) && i12 < this.K) {
            MessageObject messageObject = (MessageObject) arrayList.get(i12 - i13);
            MessageObject messageObject2 = (MessageObject) arrayList.get((i12 - this.J) - 1);
            if ((eoVar.e != null && messageObject.getFromChatId() == messageObject2.getFromChatId()) || (eoVar.f32318f != null && messageObject.isOutOwner() == messageObject2.isOutOwner())) {
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
        eo eoVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.p2) eoVar).fragmentBeginToShow;
        if (!z10) {
            eoVar.f32542x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = eoVar.f32542x0.getItemAnimator();
            yj yjVar = eoVar.f32555y0;
            if (itemAnimator != yjVar) {
                eoVar.f32542x0.setItemAnimator(yjVar);
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
        eo eoVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.p2) eoVar).fragmentBeginToShow;
        if (!z10) {
            eoVar.f32542x0.setItemAnimator(null);
        } else {
            s4.m0 itemAnimator = eoVar.f32542x0.getItemAnimator();
            yj yjVar = eoVar.f32555y0;
            if (itemAnimator != yjVar) {
                eoVar.f32542x0.setItemAnimator(yjVar);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pm.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.t1 t1Var;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.Cells.t1 t1Var2;
        int i14;
        eo eoVar = this.Q;
        if (i10 == 0) {
            i14 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            t1Var = new org.telegram.ui.Cells.t1(this.h, i14, true, eoVar.Ba, eoVar.f32316ea);
            t1Var.setResourcesProvider(eoVar.f32316ea);
            if (eoVar.f32450pc == null) {
                eoVar.f32450pc = new pn(eoVar);
            }
            t1Var.setDelegate(eoVar.f32450pc);
            t1Var.Pd = eoVar.Pb;
            if (eoVar.h == null) {
                t1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i10 == 1) {
                ?? w0Var = new org.telegram.ui.Cells.w0(context, eoVar.f32316ea, true);
                w0Var.setInvalidateColors(true);
                w0Var.setDelegate(new gm(this));
                t1Var = w0Var;
            } else {
                if (i10 == 2) {
                    t1Var2 = new org.telegram.ui.Cells.v1(context, eoVar.f32316ea);
                } else if (i10 == 3) {
                    i13 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    ?? hmVar = new hm(this, context, i13, eoVar.f32316ea);
                    hmVar.setDelegate(new a1(this, 20));
                    t1Var2 = hmVar;
                } else if (i10 == 4) {
                    t1Var2 = new org.telegram.ui.Cells.z0(context, eoVar.f32316ea);
                } else if (i10 == 6) {
                    i12 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    t1Var2 = new org.telegram.ui.Cells.db(context, i12, eoVar.f32316ea);
                } else if (i10 == 7) {
                    t1Var2 = new org.telegram.ui.Cells.w0(context, eoVar.f32316ea, false);
                } else if (i10 == 8) {
                    i11 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    t1Var2 = new im(this, context, i11, eoVar.f32316ea);
                } else if (i10 == 10) {
                    ?? u1Var = new org.telegram.ui.Cells.u1(context, eoVar.f32316ea);
                    if (eoVar.f32450pc == null) {
                        eoVar.f32450pc = new pn(eoVar);
                    }
                    u1Var.setDelegate(eoVar.f32450pc);
                    t1Var2 = u1Var;
                } else {
                    t1Var = null;
                }
                t1Var = t1Var2;
            }
        }
        return com.google.android.gms.internal.vision.e2.j(t1Var, t1Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        ArrayList arrayList;
        TLRPC.Message message;
        boolean z10;
        boolean z11;
        long j3;
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
        View view = c1Var.f41610a;
        boolean z20 = view instanceof org.telegram.ui.Cells.t1;
        eo eoVar = this.Q;
        if (z20 || (view instanceof org.telegram.ui.Cells.w0)) {
            eoVar.r9();
        }
        boolean z21 = view instanceof org.telegram.ui.Cells.t1;
        if (z21) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            MessageObject messageObject = t1Var.getMessageObject();
            t1Var.E8 = eoVar.t9();
            t1Var.F8 = eoVar.C9();
            t1Var.G8 = eoVar.B9();
            t1Var.H8 = eoVar.Q8();
            t1Var.I8 = eoVar.R8();
            t1Var.g4(-1, true, false);
            MessageObject messageObject2 = eoVar.G3;
            if (messageObject2 != null && messageObject2.equals(messageObject)) {
                t1Var.g4(eoVar.H3, false, false);
            }
            if (messageObject.isAnimatedEmoji() && (stickerEmoji = messageObject.getStickerEmoji()) != null && (emojiSound = eoVar.getMessagesController().emojiSounds.get(stickerEmoji.replace("️", ""))) != null) {
                eoVar.getMediaController().playEmojiSound(eoVar.getAccountInstance(), stickerEmoji, emojiSound, true);
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
            lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
            if (!lVar.s() && !eoVar.A9()) {
                t1Var.setDrawSelectionBackground(false);
                t1Var.L3(false, false, false);
                t1Var.J3(false, false);
                z13 = false;
                z14 = false;
            } else {
                eoVar.N7 = false;
                eoVar.O7 = 0L;
                eoVar.P7 = null;
                ArrayList arrayList2 = eoVar.f32258a4;
                if (arrayList2 != null && arrayList2.contains(messageObject)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                t1Var.J3(z12, false);
                if (messageObject.getDialogId() == eoVar.T5) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if (eoVar.W5[i10].indexOfKey(messageObject.getId()) >= 0) {
                    eoVar.hb(messageObject, t1Var, i10, false);
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
            if (eoVar.R3 == 7 && eoVar.f32506u3 != null && (str = eoVar.f32494t3) != null) {
                t1Var.S3(str);
            } else {
                sk skVar = eoVar.R2;
                if (skVar != null && skVar.getVisibility() == 0) {
                    MediaDataController mediaDataController = eoVar.getMediaDataController();
                    int id2 = messageObject.getId();
                    if (messageObject.getDialogId() == eoVar.L6) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (mediaDataController.isMessageFound(id2, z16) && eoVar.getMediaDataController().getLastSearchQuery() != null) {
                        t1Var.S3(eoVar.getMediaDataController().getLastSearchQuery());
                    }
                }
                t1Var.S3(null);
            }
            z17 = ((org.telegram.ui.ActionBar.p2) eoVar).inPreviewMode;
            if (!z17 || !t1Var.f20132f8) {
                if (eoVar.L7 != Integer.MAX_VALUE && ((t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == eoVar.L7) || (t1Var.getCurrentMessagesGroup() != null && t1Var.getCurrentMessagesGroup().contains(eoVar.L7)))) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                t1Var.setHighlighted(z18);
                boolean z23 = t1Var.f20132f8;
                if (z23 && eoVar.P7 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String str2 = eoVar.P7;
                    int i12 = eoVar.S7;
                    if (!eoVar.N7 && currentTimeMillis - eoVar.O7 >= 200) {
                        z19 = false;
                    } else {
                        z19 = true;
                    }
                    if (!t1Var.T3(str2, true, z19, i12) && eoVar.M7) {
                        org.telegram.ui.Components.wc.a0(eoVar).Q(R.raw.error, 36, LocaleController.getString(R.string.QuoteNotFound)).k(true);
                    }
                    eoVar.M7 = false;
                    if (eoVar.N7) {
                        eoVar.O7 = currentTimeMillis;
                    }
                    eoVar.N7 = false;
                } else if (z23 && (num = eoVar.Q7) != null) {
                    t1Var.R3(num.intValue());
                } else if (z23 && (bArr = eoVar.R7) != null) {
                    t1Var.P3(bArr);
                }
                if (eoVar.L7 != Integer.MAX_VALUE) {
                    eoVar.Zb();
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
            w0Var.f20595e0 = eoVar.t9();
            w0Var.f20608i0 = eoVar.C9();
            eoVar.B9();
            eoVar.Q8();
            w0Var.f20611j0 = eoVar.R8();
        } else if (view instanceof org.telegram.ui.Cells.v1) {
            ((org.telegram.ui.Cells.v1) view).getTextView().setTranslationX(eoVar.R8() / 2.0f);
        }
        int b10 = c1Var.b();
        int i13 = this.J;
        if (b10 >= i13 && b10 < this.K) {
            if (this.L) {
                arrayList = this.M;
            } else if (this.N) {
                arrayList = this.P;
            } else {
                arrayList = eoVar.f32509u6;
            }
            MessageObject messageObject3 = (MessageObject) arrayList.get(b10 - i13);
            if (messageObject3 != null && (message = messageObject3.messageOwner) != null && message.media_unread && message.mentioned) {
                z10 = ((org.telegram.ui.ActionBar.p2) eoVar).inPreviewMode;
                if (!z10 && eoVar.R3 == 0 && !messageObject3.isVoice() && !messageObject3.isRoundVideo()) {
                    int i14 = eoVar.f32396l6 - 1;
                    eoVar.f32396l6 = i14;
                    if (i14 <= 0) {
                        eoVar.f32396l6 = 0;
                        eoVar.f32408m6 = true;
                        eoVar.Kb(false);
                    } else {
                        eoVar.f32368j1.c(2, i14, true);
                    }
                    MessagesController messagesController = eoVar.getMessagesController();
                    int id3 = messageObject3.getId();
                    if (ChatObject.isChannel(eoVar.e)) {
                        j3 = eoVar.e.f17195id;
                    } else {
                        j3 = 0;
                    }
                    messagesController.markMentionMessageAsRead(id3, j3, eoVar.T5);
                    messageObject3.setContentIsRead();
                }
                if (z21) {
                    org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
                    z11 = ((org.telegram.ui.ActionBar.p2) eoVar).inPreviewMode;
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
