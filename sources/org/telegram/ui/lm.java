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
public final class lm extends org.telegram.ui.Components.wk0 {
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
    public final zn N;
    public final Context h;
    public final boolean f35801n;
    public int f35802r;
    public int f35803s;
    public int v;
    public int f35804w;
    public int f35805x;
    public int f35806y;

    public lm(zn znVar, Context context) {
        boolean z4;
        this.N = znVar;
        this.e = new ArrayList();
        this.f30306f = new ArrayList();
        this.f35803s = -5;
        this.v = -5;
        this.f35804w = -5;
        this.f35805x = -5;
        this.f35806y = -5;
        this.B = -5;
        this.C = -5;
        this.D = -5;
        this.E = -5;
        this.F = -5;
        this.J = new ArrayList();
        this.M = new ArrayList();
        this.h = context;
        TLRPC.User user = znVar.f40575f;
        if (user != null && user.bot) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f35801n = z4;
        C(true);
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    public final void K(boolean z4) {
        zn znVar = this.N;
        if (UserObject.isBotForum(znVar.f40575f)) {
            if (z4) {
                znVar.f40649kc = true;
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
        return this.N.f40730r6;
    }

    public final void M(MessageObject messageObject) {
        zn znVar = this.N;
        int childCount = znVar.f40759u0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = znVar.f40759u0.getChildAt(i10);
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
        zn znVar = this.N;
        if (UserObject.isBotForumWithEditableTopics(znVar.f40575f) && znVar.d() == 0 && !znVar.f40649kc && znVar.O3 == 0) {
            return true;
        }
        return false;
    }

    public final void O(boolean z4) {
        boolean z10;
        boolean z11;
        zn znVar = this.N;
        ArrayList arrayList = znVar.f40730r6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify data set changed fragmentOpened=" + znVar.L5);
        }
        if (z4 && znVar.L5) {
            f2.t0 itemAnimator = znVar.f40759u0.getItemAnimator();
            uj ujVar = znVar.f40772v0;
            if (itemAnimator != ujVar) {
                znVar.f40759u0.setItemAnimator(ujVar);
            }
        } else {
            znVar.f40759u0.setItemAnimator(null);
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
                        z10 = true;
                    }
                }
            }
        }
        z10 = false;
        boolean[] zArr = znVar.f40832z6;
        if ((zArr[0] && (znVar.I6 == 0 || zArr[1])) || z10) {
            z11 = ((org.telegram.ui.ActionBar.p2) znVar).fragmentBeginToShow;
            znVar.L6(z11);
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
            ai.v(str, sb);
        }
        zn znVar = this.N;
        z10 = ((org.telegram.ui.ActionBar.p2) znVar).fragmentBeginToShow;
        if (!z10) {
            znVar.f40759u0.setItemAnimator(null);
        } else {
            f2.t0 itemAnimator = znVar.f40759u0.getItemAnimator();
            uj ujVar = znVar.f40772v0;
            if (itemAnimator != ujVar) {
                znVar.f40759u0.setItemAnimator(ujVar);
            }
        }
        if (z4 && znVar.f40772v0 != null) {
            f2.t0 itemAnimator2 = znVar.f40759u0.getItemAnimator();
            uj ujVar2 = znVar.f40772v0;
            if (itemAnimator2 == ujVar2) {
                f2.l1 K = znVar.f40759u0.K(i10);
                if (K == null) {
                    ujVar2.getClass();
                } else {
                    ujVar2.S.add(K);
                    View view = K.f5774a;
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
        zn znVar = this.N;
        ArrayList arrayList = znVar.f40730r6;
        if (znVar.f40786w0 != null && !this.I && !this.K) {
            int i12 = 0;
            if (!znVar.A4 && znVar.G7 != null) {
                int childCount = znVar.f40759u0.getChildCount();
                int i13 = 0;
                while (true) {
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = znVar.f40759u0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                        MessageObject messageObject2 = znVar.G7;
                        if (messageObject == messageObject2) {
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                i11 = arrayList.indexOf(znVar.G7) + this.G;
                                i12 = znVar.L8(childAt);
                            }
                        }
                    }
                    i13++;
                }
            }
            i11 = -1;
            m(i10);
            if (i11 != -1) {
                znVar.f40786w0.h1(i11, i12);
            }
        }
    }

    public final org.telegram.ui.Cells.s1 R(MessageObject messageObject, boolean z4, boolean z10) {
        ArrayList arrayList;
        zn znVar = this.N;
        if (z4) {
            int childCount = znVar.f40759u0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = znVar.f40759u0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.getMessageObject() == messageObject && TextUtils.equals(s1Var.f21939c7, s1Var.f22210v7.messageOwner.post_author)) {
                        s1Var.X3(messageObject, s1Var.getCurrentMessagesGroup(), s1Var.m3(), s1Var.n3(), s1Var.h3(), s1Var.j3());
                        return s1Var;
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
            arrayList = znVar.f40730r6;
        }
        int indexOf = arrayList.indexOf(messageObject2);
        if (indexOf == -1) {
            return null;
        }
        if (z10) {
            int i11 = zn.Gc;
            zn.Gc = i11 + 1;
            messageObject2.stableId = i11;
            O(true);
            return null;
        }
        Q(this.G + indexOf);
        return null;
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lm.S():void");
    }

    public final void T() {
        int i10 = this.f35802r;
        int i11 = this.f35804w;
        int i12 = this.f35806y;
        int i13 = this.f35803s;
        int i14 = this.v;
        int i15 = this.B;
        int i16 = this.C;
        int i17 = this.G;
        int i18 = this.H;
        int i19 = this.D;
        int i20 = this.E;
        int i21 = this.F;
        S();
        if (i10 == this.f35802r && i11 == this.f35804w && i15 == this.B && i16 == this.C && i17 == this.G && i18 == this.H && i13 == this.f35803s && i14 == this.v && i12 == this.f35806y && i19 == this.D && i20 == this.E && i21 == this.F) {
            return;
        }
        O(false);
    }

    @Override
    public final int h() {
        this.f35805x = -5;
        zn znVar = this.N;
        a0.h hVar = znVar.f40518a8;
        if (znVar.J5.get(znVar.f40514a4, 0) != 0) {
            TLRPC.User user = znVar.f40575f;
            if (user == null || !user.bot || znVar.O3 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(znVar.f40575f.f19306id)).description == null && ((TL_bots.BotInfo) hVar.f(znVar.f40575f.f19306id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(znVar.f40575f.f19306id)).description_document == null)) && !UserObject.isReplyUser(znVar.f40575f) && !UserObject.isBotForum(znVar.f40575f))) {
                return 0;
            }
            this.f35805x = 0;
            return 1;
        }
        return this.f35802r;
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList;
        zn znVar = this.N;
        if (znVar.J5.get(znVar.f40514a4, 0) == 0 || i10 != this.f35805x) {
            if (this.I) {
                arrayList = this.J;
            } else if (this.K) {
                arrayList = this.M;
            } else {
                arrayList = znVar.f40730r6;
            }
            int i11 = this.G;
            if (i10 >= i11 && i10 < this.H) {
                return ((MessageObject) arrayList.get(i10 - i11)).stableId;
            }
            if (i10 != this.f35804w && i10 != this.f35805x) {
                if (i10 == this.B) {
                    return 2L;
                }
                if (i10 == this.C) {
                    return 3L;
                }
                if (i10 == this.f35803s) {
                    return 4L;
                }
                if (i10 == this.f35806y) {
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
        zn znVar = this.N;
        if (znVar.J5.get(znVar.f40514a4, 0) == 0 || i10 != this.f35805x) {
            if (i10 != this.f35803s && i10 != this.v) {
                int i11 = this.G;
                if (i10 >= i11 && i10 < this.H) {
                    if (this.I) {
                        arrayList = this.J;
                    } else if (this.K) {
                        arrayList = this.M;
                    } else {
                        arrayList = znVar.f40730r6;
                    }
                    return ((MessageObject) arrayList.get(i10 - i11)).contentType;
                } else if (i10 == this.f35804w) {
                    return 3;
                } else {
                    if (i10 == this.f35806y) {
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
        zn znVar = this.N;
        z4 = ((org.telegram.ui.ActionBar.p2) znVar).fragmentBeginToShow;
        if (z4 && !znVar.K0) {
            f2.t0 itemAnimator = znVar.f40759u0.getItemAnimator();
            uj ujVar = znVar.f40772v0;
            if (itemAnimator != ujVar) {
                znVar.f40759u0.setItemAnimator(ujVar);
            }
        } else {
            znVar.f40759u0.setItemAnimator(null);
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
        boolean z4;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item inserted " + i10);
        }
        zn znVar = this.N;
        z4 = ((org.telegram.ui.ActionBar.p2) znVar).fragmentBeginToShow;
        if (!z4) {
            znVar.f40759u0.setItemAnimator(null);
        } else {
            f2.t0 itemAnimator = znVar.f40759u0.getItemAnimator();
            uj ujVar = znVar.f40772v0;
            if (itemAnimator != ujVar) {
                znVar.f40759u0.setItemAnimator(ujVar);
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
        boolean z4;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item moved" + i10 + ":" + i11);
        }
        zn znVar = this.N;
        z4 = ((org.telegram.ui.ActionBar.p2) znVar).fragmentBeginToShow;
        if (!z4) {
            znVar.f40759u0.setItemAnimator(null);
        } else {
            f2.t0 itemAnimator = znVar.f40759u0.getItemAnimator();
            uj ujVar = znVar.f40772v0;
            if (itemAnimator != ujVar) {
                znVar.f40759u0.setItemAnimator(ujVar);
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
        boolean z4;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range changed " + i10 + ":" + i11);
        }
        zn znVar = this.N;
        z4 = ((org.telegram.ui.ActionBar.p2) znVar).fragmentBeginToShow;
        if (!z4) {
            znVar.f40759u0.setItemAnimator(null);
        } else {
            f2.t0 itemAnimator = znVar.f40759u0.getItemAnimator();
            uj ujVar = znVar.f40772v0;
            if (itemAnimator != ujVar) {
                znVar.f40759u0.setItemAnimator(ujVar);
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
        boolean z4;
        int i12;
        int i13;
        zn znVar = this.N;
        ArrayList arrayList = znVar.f40730r6;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range inserted " + i10 + ":" + i11);
        }
        z4 = ((org.telegram.ui.ActionBar.p2) znVar).fragmentBeginToShow;
        if (!z4) {
            znVar.f40759u0.setItemAnimator(null);
        } else {
            f2.t0 itemAnimator = znVar.f40759u0.getItemAnimator();
            uj ujVar = znVar.f40772v0;
            if (itemAnimator != ujVar) {
                znVar.f40759u0.setItemAnimator(ujVar);
            }
        }
        S();
        if (i10 == 1 && i11 > 0 && (i12 = i10 + i11) >= (i13 = this.G) && i12 < this.H) {
            MessageObject messageObject = (MessageObject) arrayList.get(i12 - i13);
            MessageObject messageObject2 = (MessageObject) arrayList.get((i12 - this.G) - 1);
            if ((znVar.e != null && messageObject.getFromChatId() == messageObject2.getFromChatId()) || (znVar.f40575f != null && messageObject.isOutOwner() == messageObject2.isOutOwner())) {
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
        boolean z4;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item range removed" + i10 + ":" + i11);
        }
        zn znVar = this.N;
        z4 = ((org.telegram.ui.ActionBar.p2) znVar).fragmentBeginToShow;
        if (!z4) {
            znVar.f40759u0.setItemAnimator(null);
        } else {
            f2.t0 itemAnimator = znVar.f40759u0.getItemAnimator();
            uj ujVar = znVar.f40772v0;
            if (itemAnimator != ujVar) {
                znVar.f40759u0.setItemAnimator(ujVar);
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
        boolean z4;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("notify item removed " + i10);
        }
        zn znVar = this.N;
        z4 = ((org.telegram.ui.ActionBar.p2) znVar).fragmentBeginToShow;
        if (!z4) {
            znVar.f40759u0.setItemAnimator(null);
        } else {
            f2.t0 itemAnimator = znVar.f40759u0.getItemAnimator();
            uj ujVar = znVar.f40772v0;
            if (itemAnimator != ujVar) {
                znVar.f40759u0.setItemAnimator(ujVar);
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
    public final void v(f2.l1 r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lm.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s1 s1Var;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.Cells.s1 s1Var2;
        int i14;
        zn znVar = this.N;
        if (i10 == 0) {
            i14 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            s1Var = new org.telegram.ui.Cells.s1(this.h, i14, true, znVar.f40824ya, znVar.f40534ba);
            s1Var.setResourcesProvider(znVar.f40534ba);
            if (znVar.f40672mc == null) {
                znVar.f40672mc = new ln(znVar);
            }
            s1Var.setDelegate(znVar.f40672mc);
            s1Var.Md = znVar.Mb;
            if (znVar.h == null) {
                s1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i10 == 1) {
                ?? v0Var = new org.telegram.ui.Cells.v0(context, znVar.f40534ba, true);
                v0Var.setInvalidateColors(true);
                v0Var.setDelegate(new dm(this));
                s1Var = v0Var;
            } else {
                if (i10 == 2) {
                    s1Var2 = new org.telegram.ui.Cells.u1(context, znVar.f40534ba);
                } else if (i10 == 3) {
                    i13 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    ?? emVar = new em(this, context, i13, znVar.f40534ba);
                    emVar.setDelegate(new c1(this, 20));
                    s1Var2 = emVar;
                } else if (i10 == 4) {
                    s1Var2 = new org.telegram.ui.Cells.y0(context, znVar.f40534ba);
                } else if (i10 == 6) {
                    i12 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    s1Var2 = new org.telegram.ui.Cells.wa(context, i12, znVar.f40534ba);
                } else if (i10 == 7) {
                    s1Var2 = new org.telegram.ui.Cells.v0(context, znVar.f40534ba, false);
                } else if (i10 == 8) {
                    i11 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    s1Var2 = new fm(this, context, i11, znVar.f40534ba);
                } else if (i10 == 10) {
                    ?? t1Var = new org.telegram.ui.Cells.t1(context, znVar.f40534ba);
                    if (znVar.f40672mc == null) {
                        znVar.f40672mc = new ln(znVar);
                    }
                    t1Var.setDelegate(znVar.f40672mc);
                    s1Var2 = t1Var;
                } else {
                    s1Var = null;
                }
                s1Var = s1Var2;
            }
        }
        return ai.n(s1Var, s1Var, -1, -2);
    }

    @Override
    public final void y(f2.l1 l1Var) {
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
        View view = l1Var.f5774a;
        boolean z19 = view instanceof org.telegram.ui.Cells.s1;
        zn znVar = this.N;
        if (z19 || (view instanceof org.telegram.ui.Cells.v0)) {
            znVar.r9();
        }
        boolean z20 = view instanceof org.telegram.ui.Cells.s1;
        if (z20) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            MessageObject messageObject = s1Var.getMessageObject();
            s1Var.B8 = znVar.t9();
            s1Var.C8 = znVar.C9();
            s1Var.D8 = znVar.B9();
            s1Var.E8 = znVar.Q8();
            s1Var.F8 = znVar.R8();
            s1Var.g4(-1, true, false);
            MessageObject messageObject2 = znVar.D3;
            if (messageObject2 != null && messageObject2.equals(messageObject)) {
                s1Var.g4(znVar.E3, false, false);
            }
            if (messageObject.isAnimatedEmoji() && (stickerEmoji = messageObject.getStickerEmoji()) != null && (emojiSound = znVar.getMessagesController().emojiSounds.get(stickerEmoji.replace("️", ""))) != null) {
                znVar.getMediaController().playEmojiSound(znVar.getAccountInstance(), stickerEmoji, emojiSound, true);
            }
            if (messageObject.updateTranslation(false)) {
                s1Var.X3(messageObject, s1Var.getCurrentMessagesGroup(), s1Var.m3(), s1Var.n3(), s1Var.h3(), s1Var.j3());
            } else {
                MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
                if (currentMessagesGroup != null) {
                    for (int i11 = 0; i11 < currentMessagesGroup.messages.size(); i11++) {
                        currentMessagesGroup.messages.get(i11).updateTranslation();
                    }
                }
            }
            kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
            if (!kVar.s() && !znVar.A9()) {
                s1Var.setDrawSelectionBackground(false);
                s1Var.L3(false, false, false);
                s1Var.J3(false, false);
                z12 = false;
                z13 = false;
            } else {
                znVar.K7 = false;
                znVar.L7 = 0L;
                znVar.M7 = null;
                ArrayList arrayList2 = znVar.X3;
                if (arrayList2 != null && arrayList2.contains(messageObject)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                s1Var.J3(z11, false);
                if (messageObject.getDialogId() == znVar.Q5) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                if (znVar.T5[i10].indexOfKey(messageObject.getId()) >= 0) {
                    znVar.hb(messageObject, s1Var, i10, false);
                    z12 = true;
                } else {
                    s1Var.setDrawSelectionBackground(false);
                    s1Var.L3(false, false, false);
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
            s1Var.K3(z21, z14);
            if (znVar.O3 == 7 && znVar.f40727r3 != null && (str = znVar.f40714q3) != null) {
                s1Var.S3(str);
            } else {
                pk pkVar = znVar.O2;
                if (pkVar != null && pkVar.getVisibility() == 0) {
                    MediaDataController mediaDataController = znVar.getMediaDataController();
                    int id2 = messageObject.getId();
                    if (messageObject.getDialogId() == znVar.I6) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (mediaDataController.isMessageFound(id2, z15) && znVar.getMediaDataController().getLastSearchQuery() != null) {
                        s1Var.S3(znVar.getMediaDataController().getLastSearchQuery());
                    }
                }
                s1Var.S3(null);
            }
            z16 = ((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode;
            if (!z16 || !s1Var.f21940c8) {
                if (znVar.I7 != Integer.MAX_VALUE && ((s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == znVar.I7) || (s1Var.getCurrentMessagesGroup() != null && s1Var.getCurrentMessagesGroup().contains(znVar.I7)))) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                s1Var.setHighlighted(z17);
                boolean z22 = s1Var.f21940c8;
                if (z22 && znVar.M7 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String str2 = znVar.M7;
                    int i12 = znVar.P7;
                    if (!znVar.K7 && currentTimeMillis - znVar.L7 >= 200) {
                        z18 = false;
                    } else {
                        z18 = true;
                    }
                    if (!s1Var.T3(str2, true, z18, i12) && znVar.J7) {
                        org.telegram.ui.Components.qc.a0(znVar).Q(R.raw.error, 36, LocaleController.getString(R.string.QuoteNotFound)).k(true);
                    }
                    znVar.J7 = false;
                    if (znVar.K7) {
                        znVar.L7 = currentTimeMillis;
                    }
                    znVar.K7 = false;
                } else if (z22 && (num = znVar.N7) != null) {
                    s1Var.R3(num.intValue());
                } else if (z22 && (bArr = znVar.O7) != null) {
                    s1Var.P3(bArr);
                }
                if (znVar.I7 != Integer.MAX_VALUE) {
                    znVar.Zb();
                }
            }
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
            v0Var.f22396b0 = znVar.t9();
            v0Var.f22409f0 = znVar.C9();
            znVar.B9();
            znVar.Q8();
            v0Var.f22412g0 = znVar.R8();
        } else if (view instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).getTextView().setTranslationX(znVar.R8() / 2.0f);
        }
        int b10 = l1Var.b();
        int i13 = this.G;
        if (b10 >= i13 && b10 < this.H) {
            if (this.I) {
                arrayList = this.J;
            } else if (this.K) {
                arrayList = this.M;
            } else {
                arrayList = znVar.f40730r6;
            }
            MessageObject messageObject3 = (MessageObject) arrayList.get(b10 - i13);
            if (messageObject3 != null && (message = messageObject3.messageOwner) != null && message.media_unread && message.mentioned) {
                z4 = ((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode;
                if (!z4 && znVar.O3 == 0 && !messageObject3.isVoice() && !messageObject3.isRoundVideo()) {
                    int i14 = znVar.f40619i6 - 1;
                    znVar.f40619i6 = i14;
                    if (i14 <= 0) {
                        znVar.f40619i6 = 0;
                        znVar.f40631j6 = true;
                        znVar.Kb(false);
                    } else {
                        znVar.f40589g1.c(2, i14, true);
                    }
                    MessagesController messagesController = znVar.getMessagesController();
                    int id3 = messageObject3.getId();
                    if (ChatObject.isChannel(znVar.e)) {
                        j10 = znVar.e.f19159id;
                    } else {
                        j10 = 0;
                    }
                    messagesController.markMentionMessageAsRead(id3, j10, znVar.Q5);
                    messageObject3.setContentIsRead();
                }
                if (z20) {
                    org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view;
                    z10 = ((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode;
                    if (z10) {
                        s1Var2.setHighlighted(true);
                    } else {
                        s1Var2.O3();
                    }
                }
            }
        }
    }
}
