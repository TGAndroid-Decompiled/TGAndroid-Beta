package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

public final class dm extends org.telegram.ui.Components.dk0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final ArrayList I;
    public boolean J;
    public boolean K;
    public final ArrayList L;
    public final rn M;
    public final Context h;

    public final boolean f37439n;

    public int f37440r;

    public int f37441s;
    public int v;

    public int f37442w;

    public int f37443x;

    public int f37444y;

    public dm(rn rnVar, Context context) {
        this.M = rnVar;
        this.f27787e = new ArrayList();
        this.f27788f = new ArrayList();
        this.f37441s = -5;
        this.v = -5;
        this.f37442w = -5;
        this.f37443x = -5;
        this.f37444y = -5;
        this.A = -5;
        this.B = -5;
        this.C = -5;
        this.D = -5;
        this.E = -5;
        this.I = new ArrayList();
        this.L = new ArrayList();
        this.h = context;
        TLRPC.User user = rnVar.f42039f;
        this.f37439n = user != null && user.bot;
        C(true);
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    public final void K(boolean z10) {
        rn rnVar = this.M;
        if (UserObject.isBotForum(rnVar.f42039f)) {
            if (z10) {
                rnVar.f42102jc = true;
            }
            if (this.E < 0 || N()) {
                return;
            }
            super.u(this.E);
            S();
        }
    }

    public final ArrayList L() {
        if (this.H) {
            return this.I;
        }
        return this.J ? this.L : this.M.q6;
    }

    public final void M(MessageObject messageObject) {
        rn rnVar = this.M;
        int childCount = rnVar.f42213t0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = rnVar.f42213t0.getChildAt(i10);
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
        rn rnVar = this.M;
        return UserObject.isBotForumWithEditableTopics(rnVar.f42039f) && rnVar.b() == 0 && !rnVar.f42102jc && rnVar.N3 == 0;
    }

    public final void O(boolean z10) {
        int size;
        boolean z11;
        rn rnVar = this.M;
        ArrayList arrayList = rnVar.q6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify data set changed fragmentOpened=" + rnVar.K5);
        }
        if (z10 && rnVar.K5) {
            f2.v0 itemAnimator = rnVar.f42213t0.getItemAnimator();
            mj mjVar = rnVar.f42226u0;
            if (itemAnimator != mjVar) {
                rnVar.f42213t0.setItemAnimator(mjVar);
            }
        } else {
            rnVar.f42213t0.setItemAnimator(null);
        }
        S();
        try {
            super.l();
            while (true) {
                if (size >= 0) {
                    MessageObject messageObject = (MessageObject) arrayList.get(size);
                    if (!messageObject.isDateObject) {
                        TLRPC.Message message = messageObject.messageOwner;
                        if (message != null) {
                            TLRPC.MessageAction messageAction = message.action;
                            if ((messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionChannelCreate)) {
                                z11 = true;
                                break;
                            }
                        }
                    } else {
                        size--;
                    }
                }
                z11 = false;
                break;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        size = arrayList.size() - 1;
        boolean[] zArr = rnVar.f42283y6;
        if ((zArr[0] && (rnVar.H6 == 0 || zArr[1])) || z11) {
            rnVar.L6(((org.telegram.ui.ActionBar.n2) rnVar).fragmentBeginToShow);
        }
    }

    public final void P(int i10, boolean z10) {
        MessageObject messageObject;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("notify item removed ");
            sb2.append(i10);
            org.telegram.ui.Cells.pa.v(z10 ? " with thanos effect" : "", sb2);
        }
        rn rnVar = this.M;
        if (((org.telegram.ui.ActionBar.n2) rnVar).fragmentBeginToShow) {
            f2.v0 itemAnimator = rnVar.f42213t0.getItemAnimator();
            mj mjVar = rnVar.f42226u0;
            if (itemAnimator != mjVar) {
                rnVar.f42213t0.setItemAnimator(mjVar);
            }
        } else {
            rnVar.f42213t0.setItemAnimator(null);
        }
        if (z10 && rnVar.f42226u0 != null) {
            f2.v0 itemAnimator2 = rnVar.f42213t0.getItemAnimator();
            mj mjVar2 = rnVar.f42226u0;
            if (itemAnimator2 == mjVar2) {
                f2.o1 o1VarK = rnVar.f42213t0.K(i10);
                if (o1VarK == null) {
                    mjVar2.getClass();
                } else {
                    mjVar2.S.add(o1VarK);
                    View view = o1VarK.f5789a;
                    if ((view instanceof org.telegram.ui.Cells.s1) && (messageObject = ((org.telegram.ui.Cells.s1) view).getMessageObject()) != null) {
                        messageObject.deletedByThanos = true;
                    }
                }
            }
        }
        S();
        try {
            super.u(i10);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final void Q(int i10) {
        int iIndexOf;
        rn rnVar = this.M;
        ArrayList arrayList = rnVar.q6;
        if (rnVar.f42239v0 == null || this.H || this.J) {
            return;
        }
        int iL8 = 0;
        if (!rnVar.f42294z4 && rnVar.F7 != null) {
            int childCount = rnVar.f42213t0.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 < childCount) {
                    View childAt = rnVar.f42213t0.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                        MessageObject messageObject2 = rnVar.F7;
                        if (messageObject == messageObject2) {
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                iIndexOf = arrayList.indexOf(rnVar.F7) + this.F;
                                iL8 = rnVar.L8(childAt);
                                break;
                            }
                        }
                    }
                    i11++;
                }
                iIndexOf = -1;
                break;
            }
        } else {
            iIndexOf = -1;
            break;
        }
        m(i10);
        if (iIndexOf != -1) {
            rnVar.f42239v0.h1(iIndexOf, iL8);
        }
    }

    public final org.telegram.ui.Cells.s1 R(MessageObject messageObject, boolean z10, boolean z11) {
        ArrayList arrayList;
        rn rnVar = this.M;
        if (z10) {
            int childCount = rnVar.f42213t0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = rnVar.f42213t0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.getMessageObject() == messageObject && TextUtils.equals(s1Var.f25273b7, s1Var.f25546u7.messageOwner.post_author)) {
                        s1Var.W3(messageObject, s1Var.getCurrentMessagesGroup(), s1Var.l3(), s1Var.m3(), s1Var.g3(), s1Var.i3());
                        return s1Var;
                    }
                }
                i10++;
                messageObject = messageObject;
            }
        }
        MessageObject messageObject2 = messageObject;
        if (this.H) {
            arrayList = this.I;
        } else {
            arrayList = this.J ? this.L : rnVar.q6;
        }
        int iIndexOf = arrayList.indexOf(messageObject2);
        if (iIndexOf == -1) {
            return null;
        }
        if (!z11) {
            Q(this.F + iIndexOf);
            return null;
        }
        int i11 = rn.Fc;
        rn.Fc = i11 + 1;
        messageObject2.stableId = i11;
        O(true);
        return null;
    }

    public final void S() {
        ArrayList arrayList;
        TLRPC.User user;
        TLRPC.User user2;
        int i10;
        rn rnVar = this.M;
        boolean[] zArr = rnVar.f42283y6;
        this.f37440r = 0;
        if (this.H) {
            arrayList = this.I;
        } else {
            arrayList = this.J ? this.L : rnVar.q6;
        }
        if (rnVar.N3 == 3 && rnVar.Ka) {
            this.f37440r = 1;
            this.f37441s = 0;
        } else {
            this.f37441s = -5;
        }
        this.v = -5;
        this.f37442w = -5;
        this.f37444y = -5;
        this.C = -5;
        this.D = -5;
        this.E = -5;
        if (N()) {
            int i11 = this.f37440r;
            this.f37440r = i11 + 1;
            this.E = i11;
        }
        if (arrayList.isEmpty()) {
            this.A = -5;
            this.B = -5;
            this.F = 0;
            this.G = 0;
            TLRPC.User user3 = rnVar.f42039f;
            if (user3 != null && !UserObject.isBot(user3) && !UserObject.isReplyUser(rnVar.f42039f)) {
                TLRPC.PeerSettings peerSettings = rnVar.getMessagesController().getPeerSettings(rnVar.f42039f.f22527id);
                int i12 = org.telegram.ui.Cells.ua.K;
                if (peerSettings != null && ((peerSettings.phone_country != null || peerSettings.registration_month != null) && !MessagesController.isSupportUser(rnVar.f42039f) && rnVar.N3 == 0)) {
                    int i13 = this.f37440r;
                    this.f37440r = i13 + 1;
                    this.f37444y = i13;
                    return;
                }
            }
            if (UserObject.isReplyUser(rnVar.f42039f) || ((user = rnVar.f42039f) != null && user.bot && !MessagesController.isSupportUser(user) && rnVar.N3 == 0)) {
                int i14 = this.f37440r;
                this.f37440r = i14 + 1;
                this.f37442w = i14;
                return;
            }
            return;
        }
        if (this.J) {
            this.B = -5;
        } else {
            boolean[] zArr2 = rnVar.A6;
            if ((zArr2[0] && (rnVar.H6 == 0 || zArr2[1])) || rnVar.B6) {
                this.B = -5;
            } else {
                int i15 = this.f37440r;
                this.f37440r = i15 + 1;
                this.B = i15;
            }
        }
        int i16 = this.f37440r;
        this.F = i16;
        int size = arrayList.size() + i16;
        this.f37440r = size;
        this.G = size;
        TLRPC.User user4 = rnVar.f42039f;
        if (user4 != null && !UserObject.isBot(user4) && !UserObject.isReplyUser(rnVar.f42039f)) {
            TLRPC.PeerSettings peerSettings2 = rnVar.getMessagesController().getPeerSettings(rnVar.f42039f.f22527id);
            int i17 = org.telegram.ui.Cells.ua.K;
            if (peerSettings2 != null && ((peerSettings2.phone_country != null || peerSettings2.registration_month != null) && !MessagesController.isSupportUser(rnVar.f42039f) && rnVar.N3 == 0 && zArr[0])) {
                TLRPC.PeerSettings peerSettings3 = rnVar.getMessagesController().getPeerSettings(rnVar.f42039f.f22527id);
                int i18 = peerSettings3.name_change_date;
                if (i18 == 0 || (i10 = peerSettings3.photo_change_date) == 0) {
                    if (i18 != 0) {
                        int i19 = this.f37440r;
                        this.f37440r = i19 + 1;
                        this.D = i19;
                    }
                    if (peerSettings3.photo_change_date != 0) {
                        int i20 = this.f37440r;
                        this.f37440r = i20 + 1;
                        this.C = i20;
                    }
                } else if (i18 < i10) {
                    int i21 = this.f37440r;
                    this.D = i21;
                    this.f37440r = i21 + 2;
                    this.C = i21 + 1;
                } else {
                    int i22 = this.f37440r;
                    this.C = i22;
                    this.f37440r = i22 + 2;
                    this.D = i22 + 1;
                }
                int i23 = this.f37440r;
                this.f37440r = i23 + 1;
                this.f37444y = i23;
            } else if (UserObject.isReplyUser(rnVar.f42039f)) {
                int i24 = this.f37440r;
                this.f37440r = i24 + 1;
                this.f37442w = i24;
            } else {
                int i25 = this.f37440r;
                this.f37440r = i25 + 1;
                this.f37442w = i25;
            }
        } else if ((UserObject.isReplyUser(rnVar.f42039f) || ((user2 = rnVar.f42039f) != null && user2.bot && !MessagesController.isSupportUser(user2) && rnVar.N3 == 0)) && zArr[0]) {
            int i26 = this.f37440r;
            this.f37440r = i26 + 1;
            this.f37442w = i26;
        }
        int i27 = rnVar.N3;
        if (i27 == 9) {
            int i28 = this.f37440r;
            this.f37441s = i28;
            this.f37440r = i28 + 2;
            this.v = i28 + 1;
        }
        if (i27 == 5 && !qf.q1.g(rnVar.M3)) {
            int i29 = this.f37440r;
            this.f37440r = i29 + 1;
            this.f37441s = i29;
        }
        if (!this.J ? !(zArr[0] && (rnVar.H6 == 0 || zArr[1])) && (AndroidUtilities.isTablet() || rnVar.f42005c4 || rnVar.f42039f != null) : !this.K) {
            this.A = -5;
            return;
        }
        int i30 = this.f37440r;
        this.f37440r = i30 + 1;
        this.A = i30;
    }

    public final void T() {
        int i10 = this.f37440r;
        int i11 = this.f37442w;
        int i12 = this.f37444y;
        int i13 = this.f37441s;
        int i14 = this.v;
        int i15 = this.A;
        int i16 = this.B;
        int i17 = this.F;
        int i18 = this.G;
        int i19 = this.C;
        int i20 = this.D;
        int i21 = this.E;
        S();
        if (i10 == this.f37440r && i11 == this.f37442w && i15 == this.A && i16 == this.B && i17 == this.F && i18 == this.G && i13 == this.f37441s && i14 == this.v && i12 == this.f37444y && i19 == this.C && i20 == this.D && i21 == this.E) {
            return;
        }
        O(false);
    }

    @Override
    public final int h() {
        this.f37443x = -5;
        rn rnVar = this.M;
        a0.h hVar = rnVar.Z7;
        if (rnVar.I5.get(rnVar.Z3, 0) == 0) {
            return this.f37440r;
        }
        TLRPC.User user = rnVar.f42039f;
        if (user == null || !user.bot || rnVar.N3 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(rnVar.f42039f.f22527id)).description == null && ((TL_bots.BotInfo) hVar.f(rnVar.f42039f.f22527id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(rnVar.f42039f.f22527id)).description_document == null)) && !UserObject.isReplyUser(rnVar.f42039f) && !UserObject.isBotForum(rnVar.f42039f))) {
            return 0;
        }
        this.f37443x = 0;
        return 1;
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList;
        rn rnVar = this.M;
        if (rnVar.I5.get(rnVar.Z3, 0) != 0 && i10 == this.f37443x) {
            return 1L;
        }
        if (this.H) {
            arrayList = this.I;
        } else {
            arrayList = this.J ? this.L : rnVar.q6;
        }
        int i11 = this.F;
        if (i10 >= i11 && i10 < this.G) {
            return ((MessageObject) arrayList.get(i10 - i11)).stableId;
        }
        if (i10 == this.f37442w || i10 == this.f37443x) {
            return 1L;
        }
        if (i10 == this.A) {
            return 2L;
        }
        if (i10 == this.B) {
            return 3L;
        }
        if (i10 == this.f37441s) {
            return 4L;
        }
        if (i10 == this.f37444y) {
            return 6L;
        }
        if (i10 == this.C) {
            return 7L;
        }
        if (i10 == this.D) {
            return 8L;
        }
        if (i10 == this.E) {
            return 9L;
        }
        return i10 == this.v ? 10L : 5L;
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList;
        rn rnVar = this.M;
        if (rnVar.I5.get(rnVar.Z3, 0) != 0 && i10 == this.f37443x) {
            return 3;
        }
        if (i10 == this.f37441s || i10 == this.v) {
            return 1;
        }
        int i11 = this.F;
        if (i10 >= i11 && i10 < this.G) {
            if (this.H) {
                arrayList = this.I;
            } else {
                arrayList = this.J ? this.L : rnVar.q6;
            }
            return ((MessageObject) arrayList.get(i10 - i11)).contentType;
        }
        if (i10 == this.f37442w) {
            return 3;
        }
        if (i10 == this.f37444y) {
            return 6;
        }
        if (i10 == this.D || i10 == this.C) {
            return 7;
        }
        return i10 == this.E ? 8 : 4;
    }

    @Override
    public final void l() {
        O(false);
    }

    @Override
    public final void m(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item changed " + i10);
        }
        rn rnVar = this.M;
        if (!((org.telegram.ui.ActionBar.n2) rnVar).fragmentBeginToShow || rnVar.J0) {
            rnVar.f42213t0.setItemAnimator(null);
        } else {
            f2.v0 itemAnimator = rnVar.f42213t0.getItemAnimator();
            mj mjVar = rnVar.f42226u0;
            if (itemAnimator != mjVar) {
                rnVar.f42213t0.setItemAnimator(mjVar);
            }
        }
        S();
        try {
            super.m(i10);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void o(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item inserted " + i10);
        }
        rn rnVar = this.M;
        if (((org.telegram.ui.ActionBar.n2) rnVar).fragmentBeginToShow) {
            f2.v0 itemAnimator = rnVar.f42213t0.getItemAnimator();
            mj mjVar = rnVar.f42226u0;
            if (itemAnimator != mjVar) {
                rnVar.f42213t0.setItemAnimator(mjVar);
            }
        } else {
            rnVar.f42213t0.setItemAnimator(null);
        }
        S();
        try {
            super.o(i10);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void p(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item moved" + i10 + ":" + i11);
        }
        rn rnVar = this.M;
        if (((org.telegram.ui.ActionBar.n2) rnVar).fragmentBeginToShow) {
            f2.v0 itemAnimator = rnVar.f42213t0.getItemAnimator();
            mj mjVar = rnVar.f42226u0;
            if (itemAnimator != mjVar) {
                rnVar.f42213t0.setItemAnimator(mjVar);
            }
        } else {
            rnVar.f42213t0.setItemAnimator(null);
        }
        S();
        try {
            super.p(i10, i11);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void q(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range changed " + i10 + ":" + i11);
        }
        rn rnVar = this.M;
        if (((org.telegram.ui.ActionBar.n2) rnVar).fragmentBeginToShow) {
            f2.v0 itemAnimator = rnVar.f42213t0.getItemAnimator();
            mj mjVar = rnVar.f42226u0;
            if (itemAnimator != mjVar) {
                rnVar.f42213t0.setItemAnimator(mjVar);
            }
        } else {
            rnVar.f42213t0.setItemAnimator(null);
        }
        S();
        try {
            super.q(i10, i11);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void s(int i10, int i11) {
        int i12;
        int i13;
        rn rnVar = this.M;
        ArrayList arrayList = rnVar.q6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range inserted " + i10 + ":" + i11);
        }
        if (((org.telegram.ui.ActionBar.n2) rnVar).fragmentBeginToShow) {
            f2.v0 itemAnimator = rnVar.f42213t0.getItemAnimator();
            mj mjVar = rnVar.f42226u0;
            if (itemAnimator != mjVar) {
                rnVar.f42213t0.setItemAnimator(mjVar);
            }
        } else {
            rnVar.f42213t0.setItemAnimator(null);
        }
        S();
        if (i10 == 1 && i11 > 0 && (i12 = i10 + i11) >= (i13 = this.F) && i12 < this.G) {
            MessageObject messageObject = (MessageObject) arrayList.get(i12 - i13);
            MessageObject messageObject2 = (MessageObject) arrayList.get((i12 - this.F) - 1);
            if ((rnVar.f42026e != null && messageObject.getFromChatId() == messageObject2.getFromChatId()) || (rnVar.f42039f != null && messageObject.isOutOwner() == messageObject2.isOutOwner())) {
                m(i10);
            }
        }
        try {
            super.s(i10, i11);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void t(int i10, int i11) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range removed" + i10 + ":" + i11);
        }
        rn rnVar = this.M;
        if (((org.telegram.ui.ActionBar.n2) rnVar).fragmentBeginToShow) {
            f2.v0 itemAnimator = rnVar.f42213t0.getItemAnimator();
            mj mjVar = rnVar.f42226u0;
            if (itemAnimator != mjVar) {
                rnVar.f42213t0.setItemAnimator(mjVar);
            }
        } else {
            rnVar.f42213t0.setItemAnimator(null);
        }
        S();
        try {
            super.t(i10, i11);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void u(int i10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item removed " + i10);
        }
        rn rnVar = this.M;
        if (((org.telegram.ui.ActionBar.n2) rnVar).fragmentBeginToShow) {
            f2.v0 itemAnimator = rnVar.f42213t0.getItemAnimator();
            mj mjVar = rnVar.f42226u0;
            if (itemAnimator != mjVar) {
                rnVar.f42213t0.setItemAnimator(mjVar);
            }
        } else {
            rnVar.f42213t0.setItemAnimator(null);
        }
        S();
        try {
            super.u(i10);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        TLRPC.UserFull userFull;
        TLObject tLObject;
        ArrayList arrayList;
        int i11;
        int i12;
        MessageObject messageObject;
        boolean z10;
        boolean z11;
        int iIndexOf;
        int i13;
        boolean zEquals;
        boolean z12;
        boolean z13;
        int i14;
        ArrayList arrayList2;
        boolean z14;
        boolean zEquals2;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        String str;
        byte[] bArr;
        Integer num;
        int iIndexOf2;
        ?? r10;
        MessageObject.SendAnimationData sendAnimationData;
        ck ckVar;
        int currentHeight;
        int i15;
        ck ckVar2;
        Runnable runnable;
        boolean z21;
        wk wkVar;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        String str2;
        boolean z22;
        long topicId;
        String str3;
        boolean z23;
        boolean z24;
        int iIndexOf3;
        TLRPC.ChatFull chatFull;
        View view = o1Var.f5789a;
        rn rnVar = this.M;
        a0.h hVar = rnVar.Z7;
        ArrayList arrayList3 = rnVar.f42178q4;
        HashMap map = rnVar.f42190r4;
        boolean z25 = false;
        if (i10 == this.f37442w || i10 == this.f37443x) {
            org.telegram.ui.Cells.h0 h0Var = (org.telegram.ui.Cells.h0) view;
            if (UserObject.isReplyUser(rnVar.f42039f)) {
                h0Var.b(false, 0L, LocaleController.getString(R.string.RepliesChatInfo), null, null, null);
            } else {
                TLRPC.User user = rnVar.f42039f;
                if (user == null || user.f22527id != 489000) {
                    TL_bots.BotInfo botInfo = hVar.m() != 0 ? (TL_bots.BotInfo) hVar.f(rnVar.f42039f.f22527id) : null;
                    boolean z26 = (botInfo == null || (TextUtils.isEmpty(botInfo.description) && botInfo.description_photo == null && botInfo.description_document == null)) && UserObject.isBot(rnVar.f42039f) && (userFull = rnVar.W7) != null && userFull.bot_manager_id != 0 && rnVar.f42039f.bot_can_edit;
                    TLRPC.User user2 = rnVar.f42039f;
                    long j10 = user2 == null ? 0L : user2.f22527id;
                    String str4 = botInfo != null ? botInfo.description : null;
                    if (botInfo != null) {
                        TLObject tLObject2 = botInfo.description_document;
                        if (tLObject2 == null) {
                            tLObject2 = botInfo.description_photo;
                        }
                        tLObject = tLObject2;
                    } else {
                        tLObject = null;
                    }
                    h0Var.b(true, j10, str4, tLObject, botInfo, z26 ? DialogObject.getName(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, rnVar.W7.bot_manager_id) : null);
                } else {
                    h0Var.b(false, 0L, LocaleController.getString(R.string.VerifyChatInfo), null, null, null);
                }
            }
            rn.b4(rnVar, h0Var);
            return;
        }
        if (i10 == this.E) {
            ((org.telegram.ui.Cells.b0) view).setDialogId(rnVar.a());
            return;
        }
        if (i10 == this.f37444y) {
            org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
            TLRPC.EncryptedChat encryptedChat = rnVar.h;
            long jA = encryptedChat != null ? encryptedChat.user_id : rnVar.a();
            uaVar.b(jA, rnVar.getMessagesController().getPeerSettings(jA));
            return;
        }
        if (i10 == this.B || i10 == this.A) {
            ((org.telegram.ui.Cells.y0) view).setProgressVisible(rnVar.F6 > 1);
            return;
        }
        if (i10 == this.D) {
            TLRPC.PeerSettings peerSettings = rnVar.getMessagesController().getPeerSettings(rnVar.a());
            if (peerSettings == null) {
                return;
            }
            ((org.telegram.ui.Cells.v0) view).setCustomText(LocaleController.formatString(R.string.ContactInfoUserUpdatedName, LocaleController.formatRelativeDate(rnVar.getConnectionsManager().getCurrentTime() - peerSettings.name_change_date)));
            return;
        }
        if (i10 == this.C) {
            TLRPC.PeerSettings peerSettings2 = rnVar.getMessagesController().getPeerSettings(rnVar.a());
            if (peerSettings2 == null) {
                return;
            }
            ((org.telegram.ui.Cells.v0) view).setCustomText(LocaleController.formatString(R.string.ContactInfoUserUpdatedPhoto, LocaleController.formatRelativeDate(rnVar.getConnectionsManager().getCurrentTime() - peerSettings2.photo_change_date)));
            return;
        }
        if (i10 == this.f37441s) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            rn.d4(rnVar);
            v0Var.setMessageObject(rnVar.E3);
            int i16 = rnVar.N3;
            if (i16 == 3) {
                v0Var.setCustomText(LocaleController.getString(R.string.SavedMessagesProfileHint));
            } else if (i16 == 5) {
                v0Var.setCustomText(LocaleController.getString(R.string.BusinessRepliesHint));
            } else if (i16 == 9) {
                v0Var.setCustomText(LocaleController.getString(R.string.WelcomeMessageHint2));
            }
            v0Var.setAlpha(1.0f);
            v0Var.setSpoilersSuppressed(rnVar.f42213t0.getScrollState() != 0);
            return;
        }
        if (i10 == this.v) {
            org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) view;
            rn.e4(rnVar);
            v0Var2.setMessageObject(rnVar.F3);
            v0Var2.setCustomText(LocaleController.getString(R.string.WelcomeMessageHint));
            v0Var2.setAlpha(1.0f);
            v0Var2.setSpoilersSuppressed(rnVar.f42213t0.getScrollState() != 0);
            return;
        }
        int i17 = this.F;
        if (i10 < i17 || i10 >= this.G) {
            return;
        }
        if (this.H) {
            arrayList = this.I;
        } else {
            arrayList = this.J ? this.L : rnVar.q6;
        }
        MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - i17);
        if (!(view instanceof org.telegram.ui.Cells.s1)) {
            if (!(view instanceof org.telegram.ui.Cells.v0)) {
                if (view instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    u1Var.setText(LocaleController.getString(R.string.UnreadMessages));
                    u1Var.getTextView().setTranslationX(rnVar.R8() / 2.0f);
                    if (rnVar.f42297z7 != 0) {
                        rnVar.f42297z7 = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            if ((messageObject2 == null || !messageObject2.isDateObject) && (i12 = (i11 = i10 + 1) - this.F) >= 0 && i12 < arrayList.size()) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i11 - this.F);
                if (messageObject3 == null || !messageObject3.isDateObject) {
                    messageObject = messageObject3;
                } else {
                    int i18 = i10 + 2;
                    int i19 = i18 - this.F;
                    messageObject = (i19 < 0 || i19 >= arrayList.size()) ? null : (MessageObject) arrayList.get(i18 - this.F);
                }
                z10 = messageObject == null || !(messageObject2 == null || messageObject.getTopicId() == messageObject2.getTopicId());
            } else {
                z10 = false;
            }
            org.telegram.ui.Cells.v0 v0Var3 = (org.telegram.ui.Cells.v0) view;
            v0Var3.f25728a0 = rnVar.t9();
            v0Var3.f25739e0 = rnVar.C9();
            rnVar.B9();
            rnVar.Q8();
            v0Var3.f25743f0 = rnVar.R8();
            v0Var3.f25730b0 = ChatObject.isForum(rnVar.f42026e);
            v0Var3.f25733c0 = ChatObject.isMonoForum(rnVar.f42026e);
            v0Var3.f25736d0 = UserObject.isBotForum(rnVar.f42039f);
            boolean z27 = v0Var3.f25745g0 != z10;
            v0Var3.f25745g0 = z10;
            v0Var3.U(messageObject2, z27);
            v0Var3.setAlpha(1.0f);
            v0Var3.setShowTopic(true);
            v0Var3.setSpoilersSuppressed(rnVar.f42213t0.getScrollState() != 0);
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
        MessageObject.GroupedMessages groupedMessagesX8 = rnVar.X8(messageObject2);
        s1Var.J7 = rnVar.f42026e != null || UserObject.isUserSelf(rnVar.f42039f) || UserObject.isReplyUser(rnVar.f42039f) || rnVar.N3 == 7;
        s1Var.f25596y.a(false, false);
        s1Var.K7 = UserObject.isBotForum(rnVar.f42039f);
        s1Var.W7 = rnVar.A9();
        int i20 = rnVar.N3;
        s1Var.L7 = i20 == 3;
        s1Var.M7 = i20 == 3 && rnVar.Ka;
        TLRPC.User user3 = rnVar.f42039f;
        s1Var.N7 = user3 != null && user3.bot;
        s1Var.O7 = ChatObject.isChannel(rnVar.f42026e) && rnVar.f42026e.megagroup;
        s1Var.P7 = ChatObject.isForum(rnVar.f42026e);
        s1Var.Q7 = ChatObject.isMonoForum(rnVar.f42026e);
        s1Var.R7 = ChatObject.isForum(rnVar.f42026e) && rnVar.f42017d4 && rnVar.b() == 1;
        s1Var.S7 = (rnVar.Z3 != 0 || (s1Var.P7 && rnVar.f42017d4)) && !s1Var.Q7;
        int i21 = rnVar.N3;
        if (i21 == 1 || i21 == 9 || !ChatObject.isChannel(rnVar.f42026e)) {
            z11 = false;
        } else {
            TLRPC.Chat chat = rnVar.f42026e;
            if (!chat.has_link || chat.megagroup) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        s1Var.T7 = z11;
        s1Var.U7 = rnVar.N3 == 0 && (rnVar.F4.containsKey(Integer.valueOf(messageObject2.getId())) || !(groupedMessagesX8 == null || groupedMessagesX8.messages.isEmpty() || !rnVar.F4.containsKey(Integer.valueOf(groupedMessagesX8.messages.get(0).getId()))));
        int i22 = rnVar.N3;
        s1Var.X7 = (i22 == 1 || i22 == 9 || (chatFull = rnVar.V7) == null) ? 0L : chatFull.linked_chat_id;
        if (i22 == 7 && rnVar.K3 == 1) {
            s1Var.Y7 = UserObject.isReplyUser(messageObject2.getDialogId());
        } else {
            s1Var.Y7 = UserObject.isReplyUser(rnVar.f42039f);
        }
        s1Var.Z7 = rnVar.N3 == 2;
        s1Var.A8 = rnVar.t9();
        s1Var.B8 = rnVar.C9();
        s1Var.C8 = rnVar.B9();
        s1Var.D8 = rnVar.Q8();
        s1Var.E8 = rnVar.R8();
        if (messageObject2.isSponsored()) {
            AndroidUtilities.doOnPreDraw(s1Var, new ag.l3(22));
        }
        int i23 = i10 + 2;
        if (groupedMessagesX8 != null) {
            MessageObject.GroupedMessagePosition position = groupedMessagesX8.getPosition(messageObject2);
            if (position != null) {
                if (groupedMessagesX8.isDocuments) {
                    iIndexOf = groupedMessagesX8.posArray.indexOf(position) + i10 + 1;
                    iIndexOf3 = groupedMessagesX8.posArray.indexOf(position) + (i10 - groupedMessagesX8.posArray.size());
                    z23 = false;
                    zEquals = false;
                    z24 = false;
                } else {
                    if ((position.flags & 4) != 0) {
                        iIndexOf = groupedMessagesX8.reversed ? groupedMessagesX8.posArray.indexOf(position) + (i10 - groupedMessagesX8.posArray.size()) : groupedMessagesX8.posArray.indexOf(position) + i10 + 1;
                        z23 = false;
                        z24 = false;
                    } else {
                        z23 = true;
                        iIndexOf = -100;
                        z24 = true;
                    }
                    if ((position.flags & 8) != 0) {
                        iIndexOf3 = groupedMessagesX8.reversed ? groupedMessagesX8.posArray.indexOf(position) + i10 + 1 : groupedMessagesX8.posArray.indexOf(position) + (i10 - groupedMessagesX8.posArray.size());
                        zEquals = false;
                        z25 = false;
                    } else {
                        zEquals = true;
                        z25 = true;
                    }
                }
                z12 = z23;
                i13 = iIndexOf3;
                z13 = z24;
            } else {
                z23 = false;
                zEquals = false;
                iIndexOf = -100;
                z25 = false;
                z24 = false;
            }
            iIndexOf3 = -100;
            z12 = z23;
            i13 = iIndexOf3;
            z13 = z24;
        } else {
            iIndexOf = i10 + 1;
            i13 = i10 - 1;
            zEquals = false;
            z12 = false;
            z25 = false;
            z13 = false;
        }
        int iJ = j(i13);
        int i24 = i13;
        int iJ2 = j(iIndexOf);
        j(i23);
        if ((messageObject2.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) || iJ != o1Var.f5793f) {
            i14 = iIndexOf;
            arrayList2 = arrayList;
        } else {
            MessageObject messageObject4 = (MessageObject) arrayList.get(i24 - this.F);
            zEquals = messageObject4.isOutOwner() == messageObject2.isOutOwner() && (Math.abs(messageObject4.messageOwner.date - messageObject2.messageOwner.date) <= 300 || rnVar.N3 == 9);
            if (zEquals) {
                TLRPC.Message message2 = messageObject4.messageOwner;
                boolean z28 = zEquals;
                i14 = iIndexOf;
                if (message2 != null && message2.paid_message_stars > 0) {
                    zEquals = false;
                } else if (!messageObject2.isImportedForward() && !messageObject4.isImportedForward()) {
                    if (rnVar.f42026e != null) {
                        long fromChatId = messageObject4.getFromChatId();
                        z28 = fromChatId == messageObject2.getFromChatId();
                        if (!z25 && z28 && fromChatId < 0 && rnVar.f42026e.megagroup && rnVar.N3 != 9) {
                            z28 = false;
                        }
                    } else if (UserObject.isUserSelf(rnVar.f42039f) || UserObject.isReplyUser(rnVar.f42039f)) {
                        if (messageObject2.isPrivateForward() || messageObject4.isPrivateForward() || messageObject4.getSenderId() != messageObject2.getSenderId()) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                    } else if (rnVar.N3 == 7) {
                        if (MessageObject.getPeerId(messageObject2.messageOwner.peer_id) == MessageObject.getPeerId(messageObject4.messageOwner.peer_id)) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    }
                    zEquals = z28;
                } else if (messageObject2.isImportedForward() && messageObject4.isImportedForward() && Math.abs(messageObject4.messageOwner.fwd_from.date - messageObject2.messageOwner.fwd_from.date) <= 300) {
                    TLRPC.MessageFwdHeader messageFwdHeader2 = messageObject4.messageOwner.fwd_from;
                    String str5 = messageFwdHeader2.from_name;
                    if (str5 == null || (str3 = messageObject2.messageOwner.fwd_from.from_name) == null) {
                        TLRPC.Peer peer = messageFwdHeader2.from_id;
                        if (peer == null || messageObject2.messageOwner.fwd_from.from_id == null || MessageObject.getPeerId(peer) != MessageObject.getPeerId(messageObject2.messageOwner.fwd_from.from_id)) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                    } else {
                        zEquals = str5.equals(str3);
                    }
                } else {
                    zEquals = false;
                }
                arrayList2 = arrayList;
                if (DialogObject.getPeerDialogId(messageObject4.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                    zEquals = false;
                }
            } else {
                i14 = iIndexOf;
                arrayList2 = arrayList;
            }
        }
        int i25 = i14 - this.F;
        if (i25 < 0 || i25 >= arrayList2.size()) {
            z14 = true;
        } else {
            MessageObject messageObject5 = (MessageObject) arrayList2.get(i14 - this.F);
            if (messageObject5 != null && messageObject5.isDateObject) {
                int i26 = i14 + 1;
                int i27 = i26 - this.F;
                messageObject5 = (i27 < 0 || i27 >= arrayList2.size()) ? null : (MessageObject) arrayList2.get(i26 - this.F);
            }
            z14 = messageObject5 == null || messageObject5.getTopicId() != messageObject2.getTopicId();
        }
        int i28 = this.F;
        boolean z29 = i10 == i28;
        if (iJ2 == o1Var.f5793f) {
            MessageObject messageObject6 = (MessageObject) arrayList2.get(i14 - i28);
            zEquals2 = !(messageObject6.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && messageObject6.isOutOwner() == messageObject2.isOutOwner() && (Math.abs(messageObject6.messageOwner.date - messageObject2.messageOwner.date) <= 300 || rnVar.N3 == 9);
            if (zEquals2) {
                if (messageObject2.isImportedForward() || messageObject6.isImportedForward()) {
                    if (messageObject2.isImportedForward() && messageObject6.isImportedForward() && Math.abs(messageObject2.messageOwner.fwd_from.date - messageObject6.messageOwner.fwd_from.date) <= 300) {
                        TLRPC.MessageFwdHeader messageFwdHeader3 = messageObject6.messageOwner.fwd_from;
                        String str6 = messageFwdHeader3.from_name;
                        if (str6 == null || (str2 = messageObject2.messageOwner.fwd_from.from_name) == null) {
                            TLRPC.Peer peer2 = messageFwdHeader3.from_id;
                            if (peer2 == null || messageObject2.messageOwner.fwd_from.from_id == null || MessageObject.getPeerId(peer2) != MessageObject.getPeerId(messageObject2.messageOwner.fwd_from.from_id)) {
                                zEquals2 = false;
                            } else {
                                zEquals2 = true;
                            }
                        } else {
                            zEquals2 = str6.equals(str2);
                        }
                    } else {
                        zEquals2 = false;
                    }
                } else if (rnVar.f42026e != null) {
                    long fromChatId2 = messageObject6.getFromChatId();
                    boolean z30 = (fromChatId2 != messageObject2.getFromChatId() || messageObject2.isImportedForward() || messageObject6.isImportedForward()) ? false : true;
                    if (!z13 && z30 && fromChatId2 < 0 && rnVar.f42026e.megagroup && rnVar.N3 != 9) {
                        z30 = false;
                    }
                    if (z30 && rnVar.v9()) {
                        TLRPC.TL_forumTopic tL_forumTopic = messageObject2.replyToForumTopic;
                        if (tL_forumTopic == null) {
                            z22 = true;
                            topicId = MessageObject.getTopicId(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, messageObject2.messageOwner, true);
                        } else {
                            z22 = true;
                            topicId = tL_forumTopic.f22432id;
                        }
                        TLRPC.TL_forumTopic tL_forumTopic2 = messageObject6.replyToForumTopic;
                        if (topicId != (tL_forumTopic2 == null ? MessageObject.getTopicId(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, messageObject6.messageOwner, z22) : tL_forumTopic2.f22432id)) {
                            z30 = false;
                        }
                    }
                    zEquals2 = z30;
                } else if (UserObject.isUserSelf(rnVar.f42039f) || UserObject.isReplyUser(rnVar.f42039f)) {
                    if (messageObject2.isPrivateForward() || messageObject6.isPrivateForward() || messageObject6.getSenderId() != messageObject2.getSenderId()) {
                        zEquals2 = false;
                    } else {
                        zEquals2 = true;
                    }
                } else if (rnVar.N3 == 7) {
                    if (MessageObject.getPeerId(messageObject2.messageOwner.peer_id) == MessageObject.getPeerId(messageObject6.messageOwner.peer_id)) {
                        zEquals2 = true;
                    } else {
                        zEquals2 = false;
                    }
                }
                if (DialogObject.getPeerDialogId(messageObject6.messageOwner.guestchat_via_from) != DialogObject.getPeerDialogId(messageObject2.messageOwner.guestchat_via_from)) {
                    zEquals2 = false;
                }
            }
        } else {
            zEquals2 = z12;
        }
        if (ChatObject.isChannel(rnVar.f42026e) && rnVar.f42026e.megagroup && messageObject2.getFromChatId() <= 0 && (messageFwdHeader = messageObject2.messageOwner.fwd_from) != null && (messageFwdHeader.saved_from_peer instanceof TLRPC.TL_peerChannel)) {
            if (!z13) {
                zEquals2 = false;
            }
            if (!z25) {
                zEquals = false;
            }
        }
        if (!z13 && (message = messageObject2.messageOwner) != null && message.paid_message_stars > 0) {
            zEquals2 = false;
        }
        boolean z31 = false;
        messageObject2.updateTranslation(false);
        if (groupedMessagesX8 != null) {
            int i29 = 0;
            while (i29 < groupedMessagesX8.messages.size()) {
                groupedMessagesX8.messages.get(i29).updateTranslation(z31);
                i29++;
                z31 = false;
            }
        }
        if (rnVar.La) {
            if (groupedMessagesX8 != null) {
                z17 = true;
                z16 = false;
                z15 = false;
            } else {
                z16 = zEquals2;
                z15 = zEquals;
            }
            s1Var.setShowTopic(z17);
            s1Var.W3(messageObject2, groupedMessagesX8, z16, z15, z14, z29);
            if (rnVar.f42213t0.getScrollState() != 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            s1Var.setSpoilersSuppressed(z18);
            if (rnVar.H7 == Integer.MAX_VALUE && messageObject2.getId() == rnVar.H7) {
                z19 = true;
            } else {
                z19 = false;
            }
            s1Var.setHighlighted(z19);
            z20 = s1Var.f25274b8;
            if (!z20 && rnVar.L7 != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                s1Var.S3(rnVar.L7, true, rnVar.J7 || jCurrentTimeMillis - rnVar.K7 < 200, rnVar.O7);
                if (rnVar.J7) {
                    rnVar.K7 = jCurrentTimeMillis;
                }
                rnVar.J7 = false;
            } else if (!z20 && (num = rnVar.M7) != null) {
                s1Var.Q3(num.intValue());
            } else if (!z20 && (bArr = rnVar.N7) != null) {
                s1Var.O3(bArr);
            } else if (rnVar.N3 == 7 && rnVar.f42177q3 != null && (str = rnVar.f42167p3) != null) {
                s1Var.R3(str);
            }
            if (rnVar.H7 != Integer.MAX_VALUE) {
                rnVar.Zb();
            }
            iIndexOf2 = arrayList3.indexOf(messageObject2);
            if (iIndexOf2 != -1) {
                if (messageObject2.type != 5 && (wkVar = rnVar.X2) != null && wkVar.getTextureView() != null) {
                    ge geVar = rnVar.f42132m7;
                    if (geVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(geVar);
                        rnVar.f42132m7 = null;
                    }
                    s1Var.getViewTreeObserver().addOnPreDrawListener(new dh.f(1, this, s1Var));
                } else if ((messageObject2.isAnyKindOfSticker() || messageObject2.isAnimatedEmojiStickers()) && ((sendAnimationData = messageObject2.sendAnimationData) == null || !sendAnimationData.fromPreview)) {
                    if (rnVar.f42226u0 == null) {
                    }
                } else if (!messageObject2.sendAnimationData.fromPreview || (ckVar = rnVar.U) == null || ckVar.H0 == null) {
                    s1Var.getViewTreeObserver().addOnPreDrawListener(new cm(this, s1Var));
                } else {
                    if (((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getVisibility() == 0) {
                        int measuredHeight = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getMeasuredHeight() + ((int) ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getTranslationY());
                        ok okVar = rnVar.f42104k1;
                        int currentHeight2 = measuredHeight + (okVar != null ? okVar.getCurrentHeight() : 0);
                        ak akVar = rnVar.l1;
                        currentHeight = (((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode ? AndroidUtilities.statusBarHeight : 0) + currentHeight2 + (akVar != null ? akVar.getCurrentHeight() : 0);
                    } else {
                        currentHeight = 0;
                    }
                    float f10 = currentHeight + rnVar.p9;
                    View view2 = rnVar.fragmentView;
                    float height = view2 == null ? 0.0f : view2.getHeight();
                    org.telegram.ui.Components.ye yeVar = rnVar.U.H0;
                    Rect rect = yeVar.f40861q0;
                    if (!yeVar.m0) {
                        yeVar.f40864s = true;
                        yeVar.m0 = true;
                        ai0 ai0Var = yeVar.T;
                        if (ai0Var != null) {
                            ai0Var.invalidate();
                        }
                        org.telegram.ui.Components.hg hgVar = yeVar.S;
                        if (hgVar != null) {
                            hgVar.invalidate();
                        }
                        if (yeVar.M != null) {
                            yeVar.f40858n0 = s1Var;
                            s1Var.setVisibility(4);
                            yeVar.f40859o0 = f10;
                            yeVar.f40860p0 = height;
                            org.telegram.ui.Cells.s1 s1Var2 = yeVar.M;
                            org.telegram.ui.Cells.s1 s1Var3 = yeVar.f40858n0;
                            s1Var2.J7 = s1Var3.J7;
                            s1Var2.S7 = s1Var3.S7;
                            s1Var2.L7 = s1Var3.L7;
                            s1Var2.N7 = s1Var3.N7;
                            s1Var2.P7 = s1Var3.P7;
                            s1Var2.R7 = s1Var3.R7;
                            s1Var2.W3(s1Var.getMessageObject(), null, s1Var.l3(), s1Var.m3(), s1Var.g3(), false);
                            org.telegram.ui.Cells.r1 transitionParams = yeVar.M.getTransitionParams();
                            transitionParams.f25118g = yeVar.M.getTransitionParams().f();
                            Rect rect2 = transitionParams.D0;
                            transitionParams.K1 = 0.0f;
                            if (yeVar.M.getTransitionParams().D0.left == yeVar.M.getBackgroundDrawableLeft() && rect2.top == yeVar.M.getBackgroundDrawableTop() && rect2.bottom == yeVar.M.getBackgroundDrawableBottom()) {
                                i15 = 1;
                            } else {
                                rect.bottom = -(yeVar.M.getBackgroundDrawableBottom() - rect2.bottom);
                                rect.top = -(yeVar.M.getBackgroundDrawableTop() - rect2.top);
                                if (s1Var.getMessageObject().isOutOwner()) {
                                    rect.left = -(yeVar.M.getBackgroundDrawableLeft() - rect2.left);
                                    rect.right = 0;
                                } else {
                                    rect.left = 0;
                                    rect.right = yeVar.M.getBackgroundDrawableRight() - rect2.right;
                                }
                                i15 = 1;
                                transitionParams.f25186w0 = true;
                            }
                            int i30 = yeVar.M.Ud;
                        } else {
                            i15 = 1;
                        }
                        yeVar.e(new sh0(yeVar, i15), false);
                        yeVar.B.invalidate();
                        yeVar.c();
                    }
                    rnVar.U.H0 = null;
                }
                arrayList3.remove(iIndexOf2);
                ckVar2 = rnVar.U;
                runnable = ckVar2.f26077b0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    z21 = true;
                    ckVar2.f26084c0 = true;
                    ckVar2.f26077b0.run();
                    ckVar2.f26077b0 = null;
                } else {
                    z21 = true;
                }
                rnVar.U.q0(z21);
            }
            if (map.isEmpty() && map.containsKey(messageObject2.getDocument())) {
                map.remove(messageObject2.getDocument());
                mj mjVar = rnVar.f42226u0;
                if (mjVar != null) {
                    org.telegram.ui.Components.wn wnVar = rnVar.O0;
                    mjVar.O = o1Var;
                    mjVar.P = wnVar;
                    r10 = 0;
                    mjVar.N = false;
                } else {
                    r10 = 0;
                }
            } else {
                r10 = 0;
            }
            if (s1Var.f25279bd) {
                s1Var.f25279bd = r10;
                s1Var.setVisibility(r10);
            }
            rnVar.ub(s1Var);
        }
        z15 = zEquals2;
        z16 = zEquals;
        z17 = true;
        s1Var.setShowTopic(z17);
        s1Var.W3(messageObject2, groupedMessagesX8, z16, z15, z14, z29);
        if (rnVar.f42213t0.getScrollState() != 0) {
            z18 = true;
        } else {
            z18 = false;
        }
        s1Var.setSpoilersSuppressed(z18);
        if (rnVar.H7 == Integer.MAX_VALUE) {
            z19 = false;
        } else {
            z19 = false;
        }
        s1Var.setHighlighted(z19);
        z20 = s1Var.f25274b8;
        if (!z20) {
            if (!z20) {
                if (!z20) {
                    if (rnVar.N3 == 7) {
                        s1Var.R3(str);
                    }
                } else if (rnVar.N3 == 7) {
                    s1Var.R3(str);
                }
            } else if (!z20) {
                if (rnVar.N3 == 7) {
                    s1Var.R3(str);
                }
            } else if (rnVar.N3 == 7) {
                s1Var.R3(str);
            }
        } else if (!z20) {
            if (!z20) {
                if (rnVar.N3 == 7) {
                    s1Var.R3(str);
                }
            } else if (rnVar.N3 == 7) {
                s1Var.R3(str);
            }
        } else if (!z20) {
            if (rnVar.N3 == 7) {
                s1Var.R3(str);
            }
        } else if (rnVar.N3 == 7) {
            s1Var.R3(str);
        }
        if (rnVar.H7 != Integer.MAX_VALUE) {
            rnVar.Zb();
        }
        iIndexOf2 = arrayList3.indexOf(messageObject2);
        if (iIndexOf2 != -1) {
            if (messageObject2.type != 5) {
                if (messageObject2.isAnyKindOfSticker()) {
                    if (rnVar.f42226u0 == null) {
                        arrayList3.remove(iIndexOf2);
                        ckVar2 = rnVar.U;
                        runnable = ckVar2.f26077b0;
                        if (runnable != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable);
                            z21 = true;
                            ckVar2.f26084c0 = true;
                            ckVar2.f26077b0.run();
                            ckVar2.f26077b0 = null;
                        } else {
                            z21 = true;
                        }
                        rnVar.U.q0(z21);
                    }
                } else if (rnVar.f42226u0 == null) {
                    arrayList3.remove(iIndexOf2);
                    ckVar2 = rnVar.U;
                    runnable = ckVar2.f26077b0;
                    if (runnable != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable);
                        z21 = true;
                        ckVar2.f26084c0 = true;
                        ckVar2.f26077b0.run();
                        ckVar2.f26077b0 = null;
                    } else {
                        z21 = true;
                    }
                    rnVar.U.q0(z21);
                }
            } else if (messageObject2.isAnyKindOfSticker()) {
                if (rnVar.f42226u0 == null) {
                    arrayList3.remove(iIndexOf2);
                    ckVar2 = rnVar.U;
                    runnable = ckVar2.f26077b0;
                    if (runnable != null) {
                        AndroidUtilities.cancelRunOnUIThread(runnable);
                        z21 = true;
                        ckVar2.f26084c0 = true;
                        ckVar2.f26077b0.run();
                        ckVar2.f26077b0 = null;
                    } else {
                        z21 = true;
                    }
                    rnVar.U.q0(z21);
                }
            } else if (rnVar.f42226u0 == null) {
                arrayList3.remove(iIndexOf2);
                ckVar2 = rnVar.U;
                runnable = ckVar2.f26077b0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    z21 = true;
                    ckVar2.f26084c0 = true;
                    ckVar2.f26077b0.run();
                    ckVar2.f26077b0 = null;
                } else {
                    z21 = true;
                }
                rnVar.U.q0(z21);
            }
        }
        if (map.isEmpty()) {
            r10 = 0;
        } else {
            r10 = 0;
        }
        if (s1Var.f25279bd) {
            s1Var.f25279bd = r10;
            s1Var.setVisibility(r10);
        }
        rnVar.ub(s1Var);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        View wlVar;
        rn rnVar = this.M;
        if (i10 == 0) {
            org.telegram.ui.Cells.s1 s1Var = new org.telegram.ui.Cells.s1(this.h, ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, true, rnVar.f42273xa, rnVar.f41983aa);
            s1Var.setResourcesProvider(rnVar.f41983aa);
            if (rnVar.f42125lc == null) {
                rnVar.f42125lc = new dn(rnVar);
            }
            s1Var.setDelegate(rnVar.f42125lc);
            s1Var.Ld = rnVar.Lb;
            view = s1Var;
            if (rnVar.h == null) {
                s1Var.setAllowAssistant(true);
                view = s1Var;
            }
        } else {
            Context context = this.h;
            if (i10 == 1) {
                sl slVar = new sl(context, rnVar.f41983aa, true);
                slVar.setInvalidateColors(true);
                slVar.setDelegate(new ul(this));
                view = slVar;
            } else {
                if (i10 == 2) {
                    wlVar = new org.telegram.ui.Cells.u1(context, rnVar.f41983aa);
                } else if (i10 == 3) {
                    vl vlVar = new vl(this, context, ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, rnVar.f41983aa);
                    vlVar.setDelegate(new c1(this, 20));
                    wlVar = vlVar;
                } else if (i10 == 4) {
                    wlVar = new org.telegram.ui.Cells.y0(context, rnVar.f41983aa);
                } else if (i10 == 6) {
                    wlVar = new org.telegram.ui.Cells.ua(context, ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, rnVar.f41983aa);
                } else if (i10 == 7) {
                    wlVar = new org.telegram.ui.Cells.v0(context, rnVar.f41983aa, false);
                } else if (i10 == 8) {
                    wlVar = new wl(this, context, ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, rnVar.f41983aa);
                } else if (i10 == 10) {
                    org.telegram.ui.Cells.t1 t1Var = new org.telegram.ui.Cells.t1(context, rnVar.f41983aa);
                    if (rnVar.f42125lc == null) {
                        rnVar.f42125lc = new dn(rnVar);
                    }
                    t1Var.setDelegate(rnVar.f42125lc);
                    wlVar = t1Var;
                } else {
                    view = null;
                }
                view = wlVar;
            }
        }
        return org.telegram.ui.Cells.pa.l(view, view, -1, -2);
    }

    @Override
    public final void y(f2.o1 o1Var) {
        TLRPC.Message message;
        boolean z10;
        boolean z11;
        byte[] bArr;
        Integer num;
        String str;
        String stickerEmoji;
        MessagesController.EmojiSound emojiSound;
        View view = o1Var.f5789a;
        boolean z12 = view instanceof org.telegram.ui.Cells.s1;
        rn rnVar = this.M;
        if (z12 || (view instanceof org.telegram.ui.Cells.v0)) {
            rnVar.r9();
        }
        boolean z13 = view instanceof org.telegram.ui.Cells.s1;
        if (z13) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            MessageObject messageObject = s1Var.getMessageObject();
            s1Var.A8 = rnVar.t9();
            s1Var.B8 = rnVar.C9();
            s1Var.C8 = rnVar.B9();
            s1Var.D8 = rnVar.Q8();
            s1Var.E8 = rnVar.R8();
            s1Var.f4(-1, true, false);
            MessageObject messageObject2 = rnVar.C3;
            if (messageObject2 != null && messageObject2.equals(messageObject)) {
                s1Var.f4(rnVar.D3, false, false);
            }
            if (messageObject.isAnimatedEmoji() && (stickerEmoji = messageObject.getStickerEmoji()) != null && (emojiSound = rnVar.getMessagesController().emojiSounds.get(stickerEmoji.replace("️", ""))) != null) {
                rnVar.getMediaController().playEmojiSound(rnVar.getAccountInstance(), stickerEmoji, emojiSound, true);
            }
            if (messageObject.updateTranslation(false)) {
                s1Var.W3(messageObject, s1Var.getCurrentMessagesGroup(), s1Var.l3(), s1Var.m3(), s1Var.g3(), s1Var.i3());
            } else {
                MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
                if (currentMessagesGroup != null) {
                    for (int i10 = 0; i10 < currentMessagesGroup.messages.size(); i10++) {
                        currentMessagesGroup.messages.get(i10).updateTranslation();
                    }
                }
            }
            if (((org.telegram.ui.ActionBar.n2) rnVar).actionBar.t() || rnVar.A9()) {
                rnVar.J7 = false;
                rnVar.K7 = 0L;
                rnVar.L7 = null;
                ArrayList arrayList = rnVar.W3;
                s1Var.I3(arrayList == null || !arrayList.contains(messageObject), false);
                int i11 = messageObject.getDialogId() == rnVar.P5 ? 0 : 1;
                if (rnVar.S5[i11].indexOfKey(messageObject.getId()) >= 0) {
                    rnVar.hb(messageObject, s1Var, i11, false);
                    z10 = true;
                } else {
                    s1Var.setDrawSelectionBackground(false);
                    s1Var.K3(false, false, false);
                    z10 = false;
                }
                z11 = true;
            } else {
                s1Var.setDrawSelectionBackground(false);
                s1Var.K3(false, false, false);
                s1Var.I3(false, false);
                z10 = false;
                z11 = false;
            }
            s1Var.J3(!z11, z11 && z10);
            if (rnVar.N3 != 7 || rnVar.f42177q3 == null || (str = rnVar.f42167p3) == null) {
                gk gkVar = rnVar.N2;
                if (gkVar == null || gkVar.getVisibility() != 0) {
                    s1Var.R3(null);
                } else if (!rnVar.getMediaDataController().isMessageFound(messageObject.getId(), messageObject.getDialogId() == rnVar.H6) || rnVar.getMediaDataController().getLastSearchQuery() == null) {
                    s1Var.R3(null);
                } else {
                    s1Var.R3(rnVar.getMediaDataController().getLastSearchQuery());
                }
            } else {
                s1Var.R3(str);
            }
            if (!((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode || !s1Var.f25274b8) {
                s1Var.setHighlighted(rnVar.H7 != Integer.MAX_VALUE && ((s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == rnVar.H7) || (s1Var.getCurrentMessagesGroup() != null && s1Var.getCurrentMessagesGroup().contains(rnVar.H7))));
                boolean z14 = s1Var.f25274b8;
                if (z14 && rnVar.L7 != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (!s1Var.S3(rnVar.L7, true, rnVar.J7 || jCurrentTimeMillis - rnVar.K7 < 200, rnVar.O7) && rnVar.I7) {
                        org.telegram.ui.Components.mc.a0(rnVar).Q(R.raw.error, 36, LocaleController.getString(R.string.QuoteNotFound)).k(true);
                    }
                    rnVar.I7 = false;
                    if (rnVar.J7) {
                        rnVar.K7 = jCurrentTimeMillis;
                    }
                    rnVar.J7 = false;
                } else if (z14 && (num = rnVar.M7) != null) {
                    s1Var.Q3(num.intValue());
                } else if (z14 && (bArr = rnVar.N7) != null) {
                    s1Var.O3(bArr);
                }
                if (rnVar.H7 != Integer.MAX_VALUE) {
                    rnVar.Zb();
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            v0Var.f25728a0 = rnVar.t9();
            v0Var.f25739e0 = rnVar.C9();
            rnVar.B9();
            rnVar.Q8();
            v0Var.f25743f0 = rnVar.R8();
        } else if (view instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).getTextView().setTranslationX(rnVar.R8() / 2.0f);
        }
        int iB = o1Var.b();
        int i12 = this.F;
        if (iB < i12 || iB >= this.G) {
            return;
        }
        MessageObject messageObject3 = (MessageObject) (this.H ? this.I : this.J ? this.L : rnVar.q6).get(iB - i12);
        if (messageObject3 == null || (message = messageObject3.messageOwner) == null || !message.media_unread || !message.mentioned) {
            return;
        }
        if (!((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode && rnVar.N3 == 0 && !messageObject3.isVoice() && !messageObject3.isRoundVideo()) {
            int i13 = rnVar.f42070h6 - 1;
            rnVar.f42070h6 = i13;
            if (i13 <= 0) {
                rnVar.f42070h6 = 0;
                rnVar.f42083i6 = true;
                rnVar.Kb(false);
            } else {
                rnVar.f42041f1.c(2, i13, true);
            }
            rnVar.getMessagesController().markMentionMessageAsRead(messageObject3.getId(), ChatObject.isChannel(rnVar.f42026e) ? rnVar.f42026e.f22380id : 0L, rnVar.P5);
            messageObject3.setContentIsRead();
        }
        if (z13) {
            org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view;
            if (((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode) {
                s1Var2.setHighlighted(true);
            } else {
                s1Var2.N3();
            }
        }
    }
}
