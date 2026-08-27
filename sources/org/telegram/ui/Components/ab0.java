package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.style.CharacterStyle;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public final class ab0 extends FrameLayout {
    public final fb0 A;
    public final FrameLayout B;
    public final fb0 C;
    public final fb0 D;
    public final int E;
    public final ChatMessageSharedResources F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public AnimatorSet L;
    public final Rect M;
    public int N;
    public float O;
    public int P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public boolean U;
    public final gb0 V;

    public final int f26712a;

    public final gh.q4 f26713b;

    public final ag.y1 f26714c;
    public final org.telegram.ui.Cells.v9 d;

    public final sa0 f26715e;

    public final ta0 f26716f;
    public final va0 h;

    public final za0 f26717n;

    public MessagePreviewParams.Messages f26718r;

    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f26719s;
    public final ra0 v;

    public final ra0 f26720w;

    public final org.telegram.ui.ActionBar.f1 f26721x;

    public final org.telegram.ui.ActionBar.f1 f26722y;

    public ab0(gb0 gb0Var, Context context, int i10) {
        MessagePreviewParams messagePreviewParams;
        final ab0 ab0Var;
        int i11;
        Context context2;
        ab0 ab0Var2;
        boolean z10;
        fb0 fb0Var;
        fb0 fb0Var2;
        ab0 ab0Var3;
        MessagePreviewParams.Messages messages;
        int i12;
        View view;
        MessagePreviewParams messagePreviewParams2;
        boolean z11;
        Context context3 = context;
        this.V = gb0Var;
        super(context3);
        int i13 = 1;
        this.G = true;
        this.H = -1;
        this.I = -1;
        final int i14 = 0;
        this.J = false;
        this.M = new Rect();
        this.Q = false;
        this.U = true;
        this.F = new ChatMessageSharedResources(context3);
        this.f26712a = i10;
        int i15 = 3;
        setOnTouchListener(new jr(this, i15));
        gh.q4 q4Var = new gh.q4(this, context3, 2);
        this.f26713b = q4Var;
        cb0 cb0Var = gb0Var.B;
        boolean z12 = gb0Var.f28581b;
        MessagePreviewParams messagePreviewParams3 = gb0Var.d;
        Drawable drawableD = ((org.telegram.ui.pn) cb0Var).d();
        if (((org.telegram.ui.pn) cb0Var).f41395f == null) {
            int i16 = org.telegram.ui.ActionBar.g6.f22993a;
        }
        q4Var.V(drawableD);
        q4Var.setOccupyStatusBar(false);
        q4Var.setOutlineProvider(new lg.b(this, i15));
        q4Var.setClipToOutline(true);
        q4Var.setElevation(AndroidUtilities.dp(4.0f));
        ag.y1 y1Var = new ag.y1(context3, 13, cb0Var);
        this.f26714c = y1Var;
        y1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23322s8, cb0Var));
        sa0 sa0Var = new sa0(this);
        this.f26715e = sa0Var;
        sa0Var.D = new jh.h2(this, i15);
        ta0 ta0Var = new ta0(this, context3, cb0Var);
        this.f26716f = ta0Var;
        va0 va0Var = new va0(this, ta0Var, cb0Var);
        this.h = va0Var;
        ta0Var.setItemAnimator(va0Var);
        ta0Var.setOnScrollListener(new xm(this, 7));
        ta0Var.setOnItemClickListener(new wa0(this));
        za0 za0Var = new za0(this);
        this.f26717n = za0Var;
        ta0Var.setAdapter(za0Var);
        ta0Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        oa0 oa0Var = new oa0(this);
        oa0Var.O = new pa0(this);
        ta0Var.setClipToPadding(false);
        ta0Var.setLayoutManager(oa0Var);
        ta0Var.i(new qa0());
        q4Var.addView(ta0Var);
        addView(q4Var, h7.z5.d(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
        q4Var.addView(y1Var, h7.z5.c(-2.0f, -1));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, getContext(), cb0Var);
        this.f26719s = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setOnForegroundOpenFinished(new na0(this, i13));
        lg.d dVarC = gb0Var.C.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        dVarC.n(ng.c.j(cb0Var));
        dVarC.o(AndroidUtilities.dp(8.0f));
        dVarC.h.f15583e = true;
        dVarC.p(AndroidUtilities.dp(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(dVarC);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout, h7.z5.c(-2.0f, -2));
        if (i10 != 0 || (messages = messagePreviewParams3.replyMessage) == null) {
            messagePreviewParams = messagePreviewParams3;
            if (i10 != 1 || messagePreviewParams.forwardMessages == null) {
                ab0Var = this;
                ab0Var2 = ab0Var;
                if (i10 == 2 && messagePreviewParams.linkMessage != null) {
                    fb0 fb0Var3 = new fb0(context, R.raw.position_below, LocaleController.getString(R.string.LinkAbove), R.raw.position_above, LocaleController.getString(R.string.LinkBelow), gb0Var.B);
                    ab0Var.A = fb0Var3;
                    fb0Var3.a(!messagePreviewParams.webpageTop, false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(fb0Var3, h7.z5.n(-1, 48));
                    FrameLayout frameLayout = new FrameLayout(context);
                    ab0Var.B = frameLayout;
                    frameLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, cb0Var), 0, 0));
                    fb0 fb0Var4 = new fb0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), gb0Var.B);
                    ab0Var.C = fb0Var4;
                    fb0Var4.setBackground(null);
                    if (messagePreviewParams.isVideo) {
                        ab0Var2 = ab0Var;
                        i11 = 4;
                    } else {
                        ab0Var2 = ab0Var;
                        i11 = 0;
                    }
                    fb0Var4.setVisibility(i11);
                    frameLayout.addView(fb0Var4, h7.z5.n(-1, 48));
                    fb0 fb0Var5 = new fb0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkVideoLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkVideoSmaller), gb0Var.B);
                    ab0Var.D = fb0Var5;
                    fb0Var5.setBackground(null);
                    fb0Var5.setVisibility(!messagePreviewParams.isVideo ? 4 : 0);
                    frameLayout.setAlpha(messagePreviewParams.hasMedia ? 1.0f : 0.5f);
                    frameLayout.addView(fb0Var5, h7.z5.n(-1, 48));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, h7.z5.n(-1, 48));
                    frameLayout.setVisibility((!messagePreviewParams.singleLink || messagePreviewParams.hasMedia) ? 0 : 8);
                    fb0Var4.a(messagePreviewParams.webpageSmall, false);
                    fb0Var5.a(messagePreviewParams.webpageSmall, false);
                    org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(context, cb0Var);
                    k1Var.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, cb0Var)));
                    k1Var.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var, h7.z5.n(-1, 8));
                    org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(1, context, gb0Var.B, false, false);
                    f1Var.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                    final int i17 = 10;
                    f1Var.setOnClickListener(new View.OnClickListener(ab0Var) {

                        public final ab0 f30051b;

                        {
                            this.f30051b = ab0Var;
                        }

                        @Override
                        public final void onClick(View view2) {
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i17) {
                                case 0:
                                    ab0 ab0Var4 = this.f30051b;
                                    ab0Var4.V.d.quote = null;
                                    ab0Var4.f26715e.f(false);
                                    ab0Var4.g(false, false);
                                    ab0Var4.f26719s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ab0 ab0Var5 = this.f30051b;
                                    sa0 sa0Var2 = ab0Var5.f26715e;
                                    gb0 gb0Var2 = ab0Var5.V;
                                    if (ab0Var5.c(null) != null) {
                                        if (sa0Var2.v - sa0Var2.f25895u <= MessagesController.getInstance(gb0Var2.f28588w).quoteLengthMax) {
                                            org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                            MessageObject messageObjectC = ab0Var5.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                            int i18 = sa0Var2.f25895u;
                                            messagePreviewParams4.quoteStart = i18;
                                            int i19 = sa0Var2.v;
                                            messagePreviewParams4.quoteEnd = i19;
                                            messagePreviewParams4.quote = org.telegram.ui.hn.b(i18, i19, messageObjectC);
                                            gb0Var2.b();
                                            gb0Var2.a(true);
                                        } else {
                                            ab0Var5.f();
                                        }
                                    }
                                    break;
                                case 2:
                                    ab0 ab0Var6 = this.f30051b;
                                    sa0 sa0Var3 = ab0Var6.f26715e;
                                    gb0 gb0Var3 = ab0Var6.V;
                                    MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                    int i20 = gb0Var3.f28588w;
                                    boolean z13 = gb0Var3.f28581b;
                                    if (messagePreviewParams5.quote != null && !z13) {
                                        messagePreviewParams5.quote = null;
                                        sa0Var3.f(false);
                                        ab0Var6.g(false, true);
                                        ab0Var6.k(true);
                                    } else if (sa0Var3.v - sa0Var3.f25895u <= MessagesController.getInstance(i20).quoteLengthMax) {
                                        MessageObject messageObjectC2 = ab0Var6.c(null);
                                        if (messageObjectC2 != null) {
                                            if (!sa0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int iMin = Math.min(MessagesController.getInstance(i20).quoteLengthMax, messageObjectC2.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = iMin;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, iMin, messageObjectC2);
                                                View viewD = ab0Var6.d();
                                                if (viewD instanceof org.telegram.ui.Cells.s1) {
                                                    sa0Var3.a0((org.telegram.ui.Cells.s1) viewD, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z13) {
                                                    ab0Var6.f26719s.getSwipeBack().e(ab0Var6.E);
                                                }
                                                ab0Var6.g(true, true);
                                            } else {
                                                messagePreviewParams5.quoteStart = sa0Var3.f25895u;
                                                messagePreviewParams5.quoteEnd = sa0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var6.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                                gb0Var3.b();
                                                gb0Var3.a(true);
                                            }
                                        }
                                    } else {
                                        ab0Var6.f();
                                    }
                                    break;
                                case 3:
                                    this.f30051b.V.c(false);
                                    break;
                                case 4:
                                    this.f30051b.V.c(false);
                                    break;
                                case 5:
                                    this.f30051b.V.a(true);
                                    break;
                                case 6:
                                    gb0 gb0Var4 = this.f30051b.V;
                                    if (!gb0Var4.f28581b) {
                                        org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                        ykVar.a(true);
                                        org.telegram.ui.rn rnVar = ykVar.D;
                                        rnVar.f42095j5 = null;
                                        rnVar.f42069h5 = null;
                                        rnVar.f41992b5.updateReply(null, null, rnVar.P5, null);
                                        rnVar.j8();
                                    } else {
                                        org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                        ykVar2.a(true);
                                        org.telegram.ui.rn rnVar2 = ykVar2.D;
                                        rnVar2.f42069h5 = null;
                                        rnVar2.Bb(rnVar2.f42095j5);
                                    }
                                    break;
                                case 7:
                                    this.f30051b.V.c(true);
                                    break;
                                case 8:
                                    this.f30051b.V.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.f30051b.V;
                                    ykVar3.a(true);
                                    org.telegram.ui.rn rnVar3 = ykVar3.D;
                                    rnVar3.f41992b5.updateForward(null, rnVar3.P5);
                                    rnVar3.j8();
                                    break;
                                case 10:
                                    this.f30051b.V.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.f30051b.V;
                                    ykVar4.a(true);
                                    org.telegram.ui.rn rnVar4 = ykVar4.D;
                                    rnVar4.C5 = null;
                                    org.telegram.ui.ck ckVar = rnVar4.U;
                                    if (ckVar != null) {
                                        ckVar.S2 = null;
                                        ckVar.T2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = rnVar4.f41992b5;
                                    if (messagePreviewParams6 != null) {
                                        int i21 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                        MessageObject messageObject = rnVar4.f42095j5;
                                        messagePreviewParams6.updateLink(i21, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.f42069h5, rnVar4.f42119l5);
                                    }
                                    rnVar4.j8();
                                    break;
                                case 12:
                                    ab0 ab0Var7 = this.f30051b;
                                    MessagePreviewParams messagePreviewParams7 = ab0Var7.V.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        ab0Var7.C.a(z14, true);
                                        ab0Var7.D.a(messagePreviewParams7.webpageSmall, true);
                                        if (ab0Var7.f26718r.messages.size() > 0 && (message2 = ab0Var7.f26718r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (ab0Var7.f26718r.previewMessages.size() > 0 && (message = ab0Var7.f26718r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        ab0Var7.h();
                                        ab0Var7.Q = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ab0 ab0Var8 = this.f30051b;
                                    MessagePreviewParams messagePreviewParams8 = ab0Var8.V.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    ab0Var8.A.a(z17, true);
                                    if (ab0Var8.f26718r.messages.size() > 0 && (message4 = ab0Var8.f26718r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (ab0Var8.f26718r.previewMessages.size() > 0 && (message3 = ab0Var8.f26718r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    ab0Var8.h();
                                    ab0Var8.Q = true;
                                    break;
                            }
                        }
                    });
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var, h7.z5.n(-1, 48));
                    org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(1, context, gb0Var.B, false, true);
                    context2 = context;
                    f1Var2.g(LocaleController.getString(R.string.DoNotLinkPreview), R.drawable.msg_delete, null);
                    int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, cb0Var);
                    int i18 = org.telegram.ui.ActionBar.g6.f23269p7;
                    f1Var2.c(iV0, org.telegram.ui.ActionBar.g6.v0(i18, cb0Var));
                    final int i19 = 11;
                    f1Var2.setOnClickListener(new View.OnClickListener(ab0Var) {

                        public final ab0 f30051b;

                        {
                            this.f30051b = ab0Var;
                        }

                        @Override
                        public final void onClick(View view2) {
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i19) {
                                case 0:
                                    ab0 ab0Var4 = this.f30051b;
                                    ab0Var4.V.d.quote = null;
                                    ab0Var4.f26715e.f(false);
                                    ab0Var4.g(false, false);
                                    ab0Var4.f26719s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ab0 ab0Var5 = this.f30051b;
                                    sa0 sa0Var2 = ab0Var5.f26715e;
                                    gb0 gb0Var2 = ab0Var5.V;
                                    if (ab0Var5.c(null) != null) {
                                        if (sa0Var2.v - sa0Var2.f25895u <= MessagesController.getInstance(gb0Var2.f28588w).quoteLengthMax) {
                                            org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                            MessageObject messageObjectC = ab0Var5.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                            int i110 = sa0Var2.f25895u;
                                            messagePreviewParams4.quoteStart = i110;
                                            int i111 = sa0Var2.v;
                                            messagePreviewParams4.quoteEnd = i111;
                                            messagePreviewParams4.quote = org.telegram.ui.hn.b(i110, i111, messageObjectC);
                                            gb0Var2.b();
                                            gb0Var2.a(true);
                                        } else {
                                            ab0Var5.f();
                                        }
                                    }
                                    break;
                                case 2:
                                    ab0 ab0Var6 = this.f30051b;
                                    sa0 sa0Var3 = ab0Var6.f26715e;
                                    gb0 gb0Var3 = ab0Var6.V;
                                    MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                    int i20 = gb0Var3.f28588w;
                                    boolean z13 = gb0Var3.f28581b;
                                    if (messagePreviewParams5.quote != null && !z13) {
                                        messagePreviewParams5.quote = null;
                                        sa0Var3.f(false);
                                        ab0Var6.g(false, true);
                                        ab0Var6.k(true);
                                    } else if (sa0Var3.v - sa0Var3.f25895u <= MessagesController.getInstance(i20).quoteLengthMax) {
                                        MessageObject messageObjectC2 = ab0Var6.c(null);
                                        if (messageObjectC2 != null) {
                                            if (!sa0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int iMin = Math.min(MessagesController.getInstance(i20).quoteLengthMax, messageObjectC2.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = iMin;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, iMin, messageObjectC2);
                                                View viewD = ab0Var6.d();
                                                if (viewD instanceof org.telegram.ui.Cells.s1) {
                                                    sa0Var3.a0((org.telegram.ui.Cells.s1) viewD, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z13) {
                                                    ab0Var6.f26719s.getSwipeBack().e(ab0Var6.E);
                                                }
                                                ab0Var6.g(true, true);
                                            } else {
                                                messagePreviewParams5.quoteStart = sa0Var3.f25895u;
                                                messagePreviewParams5.quoteEnd = sa0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var6.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                                gb0Var3.b();
                                                gb0Var3.a(true);
                                            }
                                        }
                                    } else {
                                        ab0Var6.f();
                                    }
                                    break;
                                case 3:
                                    this.f30051b.V.c(false);
                                    break;
                                case 4:
                                    this.f30051b.V.c(false);
                                    break;
                                case 5:
                                    this.f30051b.V.a(true);
                                    break;
                                case 6:
                                    gb0 gb0Var4 = this.f30051b.V;
                                    if (!gb0Var4.f28581b) {
                                        org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                        ykVar.a(true);
                                        org.telegram.ui.rn rnVar = ykVar.D;
                                        rnVar.f42095j5 = null;
                                        rnVar.f42069h5 = null;
                                        rnVar.f41992b5.updateReply(null, null, rnVar.P5, null);
                                        rnVar.j8();
                                    } else {
                                        org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                        ykVar2.a(true);
                                        org.telegram.ui.rn rnVar2 = ykVar2.D;
                                        rnVar2.f42069h5 = null;
                                        rnVar2.Bb(rnVar2.f42095j5);
                                    }
                                    break;
                                case 7:
                                    this.f30051b.V.c(true);
                                    break;
                                case 8:
                                    this.f30051b.V.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.f30051b.V;
                                    ykVar3.a(true);
                                    org.telegram.ui.rn rnVar3 = ykVar3.D;
                                    rnVar3.f41992b5.updateForward(null, rnVar3.P5);
                                    rnVar3.j8();
                                    break;
                                case 10:
                                    this.f30051b.V.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.f30051b.V;
                                    ykVar4.a(true);
                                    org.telegram.ui.rn rnVar4 = ykVar4.D;
                                    rnVar4.C5 = null;
                                    org.telegram.ui.ck ckVar = rnVar4.U;
                                    if (ckVar != null) {
                                        ckVar.S2 = null;
                                        ckVar.T2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = rnVar4.f41992b5;
                                    if (messagePreviewParams6 != null) {
                                        int i21 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                        MessageObject messageObject = rnVar4.f42095j5;
                                        messagePreviewParams6.updateLink(i21, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.f42069h5, rnVar4.f42119l5);
                                    }
                                    rnVar4.j8();
                                    break;
                                case 12:
                                    ab0 ab0Var7 = this.f30051b;
                                    MessagePreviewParams messagePreviewParams7 = ab0Var7.V.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        ab0Var7.C.a(z14, true);
                                        ab0Var7.D.a(messagePreviewParams7.webpageSmall, true);
                                        if (ab0Var7.f26718r.messages.size() > 0 && (message2 = ab0Var7.f26718r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (ab0Var7.f26718r.previewMessages.size() > 0 && (message = ab0Var7.f26718r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        ab0Var7.h();
                                        ab0Var7.Q = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ab0 ab0Var8 = this.f30051b;
                                    MessagePreviewParams messagePreviewParams8 = ab0Var8.V.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    ab0Var8.A.a(z17, true);
                                    if (ab0Var8.f26718r.messages.size() > 0 && (message4 = ab0Var8.f26718r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (ab0Var8.f26718r.previewMessages.size() > 0 && (message3 = ab0Var8.f26718r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    ab0Var8.h();
                                    ab0Var8.Q = true;
                                    break;
                            }
                        }
                    });
                    f1Var2.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(null, i18, false)));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var2, h7.z5.n(-1, 48));
                    final int i20 = 12;
                    frameLayout.setOnClickListener(new View.OnClickListener(ab0Var) {

                        public final ab0 f30051b;

                        {
                            this.f30051b = ab0Var;
                        }

                        @Override
                        public final void onClick(View view2) {
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i20) {
                                case 0:
                                    ab0 ab0Var4 = this.f30051b;
                                    ab0Var4.V.d.quote = null;
                                    ab0Var4.f26715e.f(false);
                                    ab0Var4.g(false, false);
                                    ab0Var4.f26719s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ab0 ab0Var5 = this.f30051b;
                                    sa0 sa0Var2 = ab0Var5.f26715e;
                                    gb0 gb0Var2 = ab0Var5.V;
                                    if (ab0Var5.c(null) != null) {
                                        if (sa0Var2.v - sa0Var2.f25895u <= MessagesController.getInstance(gb0Var2.f28588w).quoteLengthMax) {
                                            org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                            MessageObject messageObjectC = ab0Var5.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                            int i110 = sa0Var2.f25895u;
                                            messagePreviewParams4.quoteStart = i110;
                                            int i111 = sa0Var2.v;
                                            messagePreviewParams4.quoteEnd = i111;
                                            messagePreviewParams4.quote = org.telegram.ui.hn.b(i110, i111, messageObjectC);
                                            gb0Var2.b();
                                            gb0Var2.a(true);
                                        } else {
                                            ab0Var5.f();
                                        }
                                    }
                                    break;
                                case 2:
                                    ab0 ab0Var6 = this.f30051b;
                                    sa0 sa0Var3 = ab0Var6.f26715e;
                                    gb0 gb0Var3 = ab0Var6.V;
                                    MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                    int i21 = gb0Var3.f28588w;
                                    boolean z13 = gb0Var3.f28581b;
                                    if (messagePreviewParams5.quote != null && !z13) {
                                        messagePreviewParams5.quote = null;
                                        sa0Var3.f(false);
                                        ab0Var6.g(false, true);
                                        ab0Var6.k(true);
                                    } else if (sa0Var3.v - sa0Var3.f25895u <= MessagesController.getInstance(i21).quoteLengthMax) {
                                        MessageObject messageObjectC2 = ab0Var6.c(null);
                                        if (messageObjectC2 != null) {
                                            if (!sa0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int iMin = Math.min(MessagesController.getInstance(i21).quoteLengthMax, messageObjectC2.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = iMin;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, iMin, messageObjectC2);
                                                View viewD = ab0Var6.d();
                                                if (viewD instanceof org.telegram.ui.Cells.s1) {
                                                    sa0Var3.a0((org.telegram.ui.Cells.s1) viewD, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z13) {
                                                    ab0Var6.f26719s.getSwipeBack().e(ab0Var6.E);
                                                }
                                                ab0Var6.g(true, true);
                                            } else {
                                                messagePreviewParams5.quoteStart = sa0Var3.f25895u;
                                                messagePreviewParams5.quoteEnd = sa0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var6.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                                gb0Var3.b();
                                                gb0Var3.a(true);
                                            }
                                        }
                                    } else {
                                        ab0Var6.f();
                                    }
                                    break;
                                case 3:
                                    this.f30051b.V.c(false);
                                    break;
                                case 4:
                                    this.f30051b.V.c(false);
                                    break;
                                case 5:
                                    this.f30051b.V.a(true);
                                    break;
                                case 6:
                                    gb0 gb0Var4 = this.f30051b.V;
                                    if (!gb0Var4.f28581b) {
                                        org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                        ykVar.a(true);
                                        org.telegram.ui.rn rnVar = ykVar.D;
                                        rnVar.f42095j5 = null;
                                        rnVar.f42069h5 = null;
                                        rnVar.f41992b5.updateReply(null, null, rnVar.P5, null);
                                        rnVar.j8();
                                    } else {
                                        org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                        ykVar2.a(true);
                                        org.telegram.ui.rn rnVar2 = ykVar2.D;
                                        rnVar2.f42069h5 = null;
                                        rnVar2.Bb(rnVar2.f42095j5);
                                    }
                                    break;
                                case 7:
                                    this.f30051b.V.c(true);
                                    break;
                                case 8:
                                    this.f30051b.V.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.f30051b.V;
                                    ykVar3.a(true);
                                    org.telegram.ui.rn rnVar3 = ykVar3.D;
                                    rnVar3.f41992b5.updateForward(null, rnVar3.P5);
                                    rnVar3.j8();
                                    break;
                                case 10:
                                    this.f30051b.V.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.f30051b.V;
                                    ykVar4.a(true);
                                    org.telegram.ui.rn rnVar4 = ykVar4.D;
                                    rnVar4.C5 = null;
                                    org.telegram.ui.ck ckVar = rnVar4.U;
                                    if (ckVar != null) {
                                        ckVar.S2 = null;
                                        ckVar.T2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = rnVar4.f41992b5;
                                    if (messagePreviewParams6 != null) {
                                        int i22 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                        MessageObject messageObject = rnVar4.f42095j5;
                                        messagePreviewParams6.updateLink(i22, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.f42069h5, rnVar4.f42119l5);
                                    }
                                    rnVar4.j8();
                                    break;
                                case 12:
                                    ab0 ab0Var7 = this.f30051b;
                                    MessagePreviewParams messagePreviewParams7 = ab0Var7.V.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        ab0Var7.C.a(z14, true);
                                        ab0Var7.D.a(messagePreviewParams7.webpageSmall, true);
                                        if (ab0Var7.f26718r.messages.size() > 0 && (message2 = ab0Var7.f26718r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (ab0Var7.f26718r.previewMessages.size() > 0 && (message = ab0Var7.f26718r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        ab0Var7.h();
                                        ab0Var7.Q = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ab0 ab0Var8 = this.f30051b;
                                    MessagePreviewParams messagePreviewParams8 = ab0Var8.V.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    ab0Var8.A.a(z17, true);
                                    if (ab0Var8.f26718r.messages.size() > 0 && (message4 = ab0Var8.f26718r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (ab0Var8.f26718r.previewMessages.size() > 0 && (message3 = ab0Var8.f26718r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    ab0Var8.h();
                                    ab0Var8.Q = true;
                                    break;
                            }
                        }
                    });
                    final int i21 = 13;
                    fb0Var3.setOnClickListener(new View.OnClickListener(ab0Var) {

                        public final ab0 f30051b;

                        {
                            this.f30051b = ab0Var;
                        }

                        @Override
                        public final void onClick(View view2) {
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i21) {
                                case 0:
                                    ab0 ab0Var4 = this.f30051b;
                                    ab0Var4.V.d.quote = null;
                                    ab0Var4.f26715e.f(false);
                                    ab0Var4.g(false, false);
                                    ab0Var4.f26719s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ab0 ab0Var5 = this.f30051b;
                                    sa0 sa0Var2 = ab0Var5.f26715e;
                                    gb0 gb0Var2 = ab0Var5.V;
                                    if (ab0Var5.c(null) != null) {
                                        if (sa0Var2.v - sa0Var2.f25895u <= MessagesController.getInstance(gb0Var2.f28588w).quoteLengthMax) {
                                            org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                            MessageObject messageObjectC = ab0Var5.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                            int i110 = sa0Var2.f25895u;
                                            messagePreviewParams4.quoteStart = i110;
                                            int i111 = sa0Var2.v;
                                            messagePreviewParams4.quoteEnd = i111;
                                            messagePreviewParams4.quote = org.telegram.ui.hn.b(i110, i111, messageObjectC);
                                            gb0Var2.b();
                                            gb0Var2.a(true);
                                        } else {
                                            ab0Var5.f();
                                        }
                                    }
                                    break;
                                case 2:
                                    ab0 ab0Var6 = this.f30051b;
                                    sa0 sa0Var3 = ab0Var6.f26715e;
                                    gb0 gb0Var3 = ab0Var6.V;
                                    MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                    int i22 = gb0Var3.f28588w;
                                    boolean z13 = gb0Var3.f28581b;
                                    if (messagePreviewParams5.quote != null && !z13) {
                                        messagePreviewParams5.quote = null;
                                        sa0Var3.f(false);
                                        ab0Var6.g(false, true);
                                        ab0Var6.k(true);
                                    } else if (sa0Var3.v - sa0Var3.f25895u <= MessagesController.getInstance(i22).quoteLengthMax) {
                                        MessageObject messageObjectC2 = ab0Var6.c(null);
                                        if (messageObjectC2 != null) {
                                            if (!sa0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int iMin = Math.min(MessagesController.getInstance(i22).quoteLengthMax, messageObjectC2.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = iMin;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, iMin, messageObjectC2);
                                                View viewD = ab0Var6.d();
                                                if (viewD instanceof org.telegram.ui.Cells.s1) {
                                                    sa0Var3.a0((org.telegram.ui.Cells.s1) viewD, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z13) {
                                                    ab0Var6.f26719s.getSwipeBack().e(ab0Var6.E);
                                                }
                                                ab0Var6.g(true, true);
                                            } else {
                                                messagePreviewParams5.quoteStart = sa0Var3.f25895u;
                                                messagePreviewParams5.quoteEnd = sa0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var6.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                                gb0Var3.b();
                                                gb0Var3.a(true);
                                            }
                                        }
                                    } else {
                                        ab0Var6.f();
                                    }
                                    break;
                                case 3:
                                    this.f30051b.V.c(false);
                                    break;
                                case 4:
                                    this.f30051b.V.c(false);
                                    break;
                                case 5:
                                    this.f30051b.V.a(true);
                                    break;
                                case 6:
                                    gb0 gb0Var4 = this.f30051b.V;
                                    if (!gb0Var4.f28581b) {
                                        org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                        ykVar.a(true);
                                        org.telegram.ui.rn rnVar = ykVar.D;
                                        rnVar.f42095j5 = null;
                                        rnVar.f42069h5 = null;
                                        rnVar.f41992b5.updateReply(null, null, rnVar.P5, null);
                                        rnVar.j8();
                                    } else {
                                        org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                        ykVar2.a(true);
                                        org.telegram.ui.rn rnVar2 = ykVar2.D;
                                        rnVar2.f42069h5 = null;
                                        rnVar2.Bb(rnVar2.f42095j5);
                                    }
                                    break;
                                case 7:
                                    this.f30051b.V.c(true);
                                    break;
                                case 8:
                                    this.f30051b.V.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.f30051b.V;
                                    ykVar3.a(true);
                                    org.telegram.ui.rn rnVar3 = ykVar3.D;
                                    rnVar3.f41992b5.updateForward(null, rnVar3.P5);
                                    rnVar3.j8();
                                    break;
                                case 10:
                                    this.f30051b.V.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.f30051b.V;
                                    ykVar4.a(true);
                                    org.telegram.ui.rn rnVar4 = ykVar4.D;
                                    rnVar4.C5 = null;
                                    org.telegram.ui.ck ckVar = rnVar4.U;
                                    if (ckVar != null) {
                                        ckVar.S2 = null;
                                        ckVar.T2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = rnVar4.f41992b5;
                                    if (messagePreviewParams6 != null) {
                                        int i23 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                        MessageObject messageObject = rnVar4.f42095j5;
                                        messagePreviewParams6.updateLink(i23, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.f42069h5, rnVar4.f42119l5);
                                    }
                                    rnVar4.j8();
                                    break;
                                case 12:
                                    ab0 ab0Var7 = this.f30051b;
                                    MessagePreviewParams messagePreviewParams7 = ab0Var7.V.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        ab0Var7.C.a(z14, true);
                                        ab0Var7.D.a(messagePreviewParams7.webpageSmall, true);
                                        if (ab0Var7.f26718r.messages.size() > 0 && (message2 = ab0Var7.f26718r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (ab0Var7.f26718r.previewMessages.size() > 0 && (message = ab0Var7.f26718r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        ab0Var7.h();
                                        ab0Var7.Q = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ab0 ab0Var8 = this.f30051b;
                                    MessagePreviewParams messagePreviewParams8 = ab0Var8.V.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    ab0Var8.A.a(z17, true);
                                    if (ab0Var8.f26718r.messages.size() > 0 && (message4 = ab0Var8.f26718r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (ab0Var8.f26718r.previewMessages.size() > 0 && (message3 = ab0Var8.f26718r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    ab0Var8.h();
                                    ab0Var8.Q = true;
                                    break;
                            }
                        }
                    });
                    ab0Var3 = ab0Var;
                }
            } else {
                if (!UserConfig.getInstance(gb0Var.f28588w).isPremium()) {
                    int i22 = 0;
                    while (true) {
                        if (i22 >= messagePreviewParams.forwardMessages.messages.size()) {
                            z10 = true;
                            break;
                        } else {
                            if (messagePreviewParams.forwardMessages.messages.get(i22).type == 36) {
                                z10 = false;
                                break;
                            }
                            i22++;
                        }
                    }
                } else {
                    z10 = true;
                    break;
                }
                fb0 fb0Var6 = new fb0(context, R.raw.name_hide, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.ShowSenderNames : R.string.ShowSendersName), R.raw.name_show, LocaleController.getString(messagePreviewParams.multipleUsers ? R.string.HideSenderNames : R.string.HideSendersName), gb0Var.B);
                this.f26719s.a(fb0Var6, h7.z5.n(-1, 48));
                if (messagePreviewParams.hasCaption) {
                    fb0Var = fb0Var6;
                    fb0 fb0Var7 = new fb0(context, R.raw.caption_hide, LocaleController.getString(R.string.ShowCaption), R.raw.caption_show, LocaleController.getString(R.string.HideCaption), gb0Var.B);
                    fb0Var7.a(messagePreviewParams.hideCaption, false);
                    this.f26719s.a(fb0Var7, h7.z5.n(-1, 48));
                    fb0Var2 = fb0Var7;
                } else {
                    fb0Var = fb0Var6;
                    fb0Var2 = null;
                }
                org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(0, context, gb0Var.B, true, false);
                final int i23 = 7;
                f1Var3.setOnClickListener(new View.OnClickListener(this) {

                    public final ab0 f30051b;

                    {
                        this.f30051b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i23) {
                            case 0:
                                ab0 ab0Var4 = this.f30051b;
                                ab0Var4.V.d.quote = null;
                                ab0Var4.f26715e.f(false);
                                ab0Var4.g(false, false);
                                ab0Var4.f26719s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ab0 ab0Var5 = this.f30051b;
                                sa0 sa0Var2 = ab0Var5.f26715e;
                                gb0 gb0Var2 = ab0Var5.V;
                                if (ab0Var5.c(null) != null) {
                                    if (sa0Var2.v - sa0Var2.f25895u <= MessagesController.getInstance(gb0Var2.f28588w).quoteLengthMax) {
                                        org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                        MessageObject messageObjectC = ab0Var5.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                        int i110 = sa0Var2.f25895u;
                                        messagePreviewParams4.quoteStart = i110;
                                        int i111 = sa0Var2.v;
                                        messagePreviewParams4.quoteEnd = i111;
                                        messagePreviewParams4.quote = org.telegram.ui.hn.b(i110, i111, messageObjectC);
                                        gb0Var2.b();
                                        gb0Var2.a(true);
                                    } else {
                                        ab0Var5.f();
                                    }
                                }
                                break;
                            case 2:
                                ab0 ab0Var6 = this.f30051b;
                                sa0 sa0Var3 = ab0Var6.f26715e;
                                gb0 gb0Var3 = ab0Var6.V;
                                MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                int i24 = gb0Var3.f28588w;
                                boolean z13 = gb0Var3.f28581b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    sa0Var3.f(false);
                                    ab0Var6.g(false, true);
                                    ab0Var6.k(true);
                                } else if (sa0Var3.v - sa0Var3.f25895u <= MessagesController.getInstance(i24).quoteLengthMax) {
                                    MessageObject messageObjectC2 = ab0Var6.c(null);
                                    if (messageObjectC2 != null) {
                                        if (!sa0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int iMin = Math.min(MessagesController.getInstance(i24).quoteLengthMax, messageObjectC2.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = iMin;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, iMin, messageObjectC2);
                                            View viewD = ab0Var6.d();
                                            if (viewD instanceof org.telegram.ui.Cells.s1) {
                                                sa0Var3.a0((org.telegram.ui.Cells.s1) viewD, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                ab0Var6.f26719s.getSwipeBack().e(ab0Var6.E);
                                            }
                                            ab0Var6.g(true, true);
                                        } else {
                                            messagePreviewParams5.quoteStart = sa0Var3.f25895u;
                                            messagePreviewParams5.quoteEnd = sa0Var3.v;
                                            org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var6.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                            gb0Var3.b();
                                            gb0Var3.a(true);
                                        }
                                    }
                                } else {
                                    ab0Var6.f();
                                }
                                break;
                            case 3:
                                this.f30051b.V.c(false);
                                break;
                            case 4:
                                this.f30051b.V.c(false);
                                break;
                            case 5:
                                this.f30051b.V.a(true);
                                break;
                            case 6:
                                gb0 gb0Var4 = this.f30051b.V;
                                if (!gb0Var4.f28581b) {
                                    org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                    ykVar.a(true);
                                    org.telegram.ui.rn rnVar = ykVar.D;
                                    rnVar.f42095j5 = null;
                                    rnVar.f42069h5 = null;
                                    rnVar.f41992b5.updateReply(null, null, rnVar.P5, null);
                                    rnVar.j8();
                                } else {
                                    org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                    ykVar2.a(true);
                                    org.telegram.ui.rn rnVar2 = ykVar2.D;
                                    rnVar2.f42069h5 = null;
                                    rnVar2.Bb(rnVar2.f42095j5);
                                }
                                break;
                            case 7:
                                this.f30051b.V.c(true);
                                break;
                            case 8:
                                this.f30051b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.f30051b.V;
                                ykVar3.a(true);
                                org.telegram.ui.rn rnVar3 = ykVar3.D;
                                rnVar3.f41992b5.updateForward(null, rnVar3.P5);
                                rnVar3.j8();
                                break;
                            case 10:
                                this.f30051b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.f30051b.V;
                                ykVar4.a(true);
                                org.telegram.ui.rn rnVar4 = ykVar4.D;
                                rnVar4.C5 = null;
                                org.telegram.ui.ck ckVar = rnVar4.U;
                                if (ckVar != null) {
                                    ckVar.S2 = null;
                                    ckVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = rnVar4.f41992b5;
                                if (messagePreviewParams6 != null) {
                                    int i25 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                    MessageObject messageObject = rnVar4.f42095j5;
                                    messagePreviewParams6.updateLink(i25, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.f42069h5, rnVar4.f42119l5);
                                }
                                rnVar4.j8();
                                break;
                            case 12:
                                ab0 ab0Var7 = this.f30051b;
                                MessagePreviewParams messagePreviewParams7 = ab0Var7.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    ab0Var7.C.a(z14, true);
                                    ab0Var7.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (ab0Var7.f26718r.messages.size() > 0 && (message2 = ab0Var7.f26718r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (ab0Var7.f26718r.previewMessages.size() > 0 && (message = ab0Var7.f26718r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    ab0Var7.h();
                                    ab0Var7.Q = true;
                                    break;
                                }
                                break;
                            default:
                                ab0 ab0Var8 = this.f30051b;
                                MessagePreviewParams messagePreviewParams8 = ab0Var8.V.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                ab0Var8.A.a(z17, true);
                                if (ab0Var8.f26718r.messages.size() > 0 && (message4 = ab0Var8.f26718r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (ab0Var8.f26718r.previewMessages.size() > 0 && (message3 = ab0Var8.f26718r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                ab0Var8.h();
                                ab0Var8.Q = true;
                                break;
                        }
                    }
                });
                f1Var3.g(LocaleController.getString(R.string.ChangeRecipient), R.drawable.msg_forward_replace, null);
                this.f26719s.a(f1Var3, h7.z5.n(-1, 48));
                org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(context, cb0Var);
                k1Var2.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, cb0Var)));
                k1Var2.setTag(R.id.fit_width_tag, 1);
                final int i24 = 8;
                this.f26719s.a(k1Var2, h7.z5.n(-1, 8));
                org.telegram.ui.ActionBar.f1 f1Var4 = new org.telegram.ui.ActionBar.f1(1, context, gb0Var.B, false, false);
                f1Var4.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
                f1Var4.setOnClickListener(new View.OnClickListener(this) {

                    public final ab0 f30051b;

                    {
                        this.f30051b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i24) {
                            case 0:
                                ab0 ab0Var4 = this.f30051b;
                                ab0Var4.V.d.quote = null;
                                ab0Var4.f26715e.f(false);
                                ab0Var4.g(false, false);
                                ab0Var4.f26719s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ab0 ab0Var5 = this.f30051b;
                                sa0 sa0Var2 = ab0Var5.f26715e;
                                gb0 gb0Var2 = ab0Var5.V;
                                if (ab0Var5.c(null) != null) {
                                    if (sa0Var2.v - sa0Var2.f25895u <= MessagesController.getInstance(gb0Var2.f28588w).quoteLengthMax) {
                                        org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                        MessageObject messageObjectC = ab0Var5.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                        int i110 = sa0Var2.f25895u;
                                        messagePreviewParams4.quoteStart = i110;
                                        int i111 = sa0Var2.v;
                                        messagePreviewParams4.quoteEnd = i111;
                                        messagePreviewParams4.quote = org.telegram.ui.hn.b(i110, i111, messageObjectC);
                                        gb0Var2.b();
                                        gb0Var2.a(true);
                                    } else {
                                        ab0Var5.f();
                                    }
                                }
                                break;
                            case 2:
                                ab0 ab0Var6 = this.f30051b;
                                sa0 sa0Var3 = ab0Var6.f26715e;
                                gb0 gb0Var3 = ab0Var6.V;
                                MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                int i25 = gb0Var3.f28588w;
                                boolean z13 = gb0Var3.f28581b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    sa0Var3.f(false);
                                    ab0Var6.g(false, true);
                                    ab0Var6.k(true);
                                } else if (sa0Var3.v - sa0Var3.f25895u <= MessagesController.getInstance(i25).quoteLengthMax) {
                                    MessageObject messageObjectC2 = ab0Var6.c(null);
                                    if (messageObjectC2 != null) {
                                        if (!sa0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int iMin = Math.min(MessagesController.getInstance(i25).quoteLengthMax, messageObjectC2.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = iMin;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, iMin, messageObjectC2);
                                            View viewD = ab0Var6.d();
                                            if (viewD instanceof org.telegram.ui.Cells.s1) {
                                                sa0Var3.a0((org.telegram.ui.Cells.s1) viewD, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                ab0Var6.f26719s.getSwipeBack().e(ab0Var6.E);
                                            }
                                            ab0Var6.g(true, true);
                                        } else {
                                            messagePreviewParams5.quoteStart = sa0Var3.f25895u;
                                            messagePreviewParams5.quoteEnd = sa0Var3.v;
                                            org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var6.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                            gb0Var3.b();
                                            gb0Var3.a(true);
                                        }
                                    }
                                } else {
                                    ab0Var6.f();
                                }
                                break;
                            case 3:
                                this.f30051b.V.c(false);
                                break;
                            case 4:
                                this.f30051b.V.c(false);
                                break;
                            case 5:
                                this.f30051b.V.a(true);
                                break;
                            case 6:
                                gb0 gb0Var4 = this.f30051b.V;
                                if (!gb0Var4.f28581b) {
                                    org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                    ykVar.a(true);
                                    org.telegram.ui.rn rnVar = ykVar.D;
                                    rnVar.f42095j5 = null;
                                    rnVar.f42069h5 = null;
                                    rnVar.f41992b5.updateReply(null, null, rnVar.P5, null);
                                    rnVar.j8();
                                } else {
                                    org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                    ykVar2.a(true);
                                    org.telegram.ui.rn rnVar2 = ykVar2.D;
                                    rnVar2.f42069h5 = null;
                                    rnVar2.Bb(rnVar2.f42095j5);
                                }
                                break;
                            case 7:
                                this.f30051b.V.c(true);
                                break;
                            case 8:
                                this.f30051b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.f30051b.V;
                                ykVar3.a(true);
                                org.telegram.ui.rn rnVar3 = ykVar3.D;
                                rnVar3.f41992b5.updateForward(null, rnVar3.P5);
                                rnVar3.j8();
                                break;
                            case 10:
                                this.f30051b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.f30051b.V;
                                ykVar4.a(true);
                                org.telegram.ui.rn rnVar4 = ykVar4.D;
                                rnVar4.C5 = null;
                                org.telegram.ui.ck ckVar = rnVar4.U;
                                if (ckVar != null) {
                                    ckVar.S2 = null;
                                    ckVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = rnVar4.f41992b5;
                                if (messagePreviewParams6 != null) {
                                    int i26 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                    MessageObject messageObject = rnVar4.f42095j5;
                                    messagePreviewParams6.updateLink(i26, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.f42069h5, rnVar4.f42119l5);
                                }
                                rnVar4.j8();
                                break;
                            case 12:
                                ab0 ab0Var7 = this.f30051b;
                                MessagePreviewParams messagePreviewParams7 = ab0Var7.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    ab0Var7.C.a(z14, true);
                                    ab0Var7.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (ab0Var7.f26718r.messages.size() > 0 && (message2 = ab0Var7.f26718r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (ab0Var7.f26718r.previewMessages.size() > 0 && (message = ab0Var7.f26718r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    ab0Var7.h();
                                    ab0Var7.Q = true;
                                    break;
                                }
                                break;
                            default:
                                ab0 ab0Var8 = this.f30051b;
                                MessagePreviewParams messagePreviewParams8 = ab0Var8.V.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                ab0Var8.A.a(z17, true);
                                if (ab0Var8.f26718r.messages.size() > 0 && (message4 = ab0Var8.f26718r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (ab0Var8.f26718r.previewMessages.size() > 0 && (message3 = ab0Var8.f26718r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                ab0Var8.h();
                                ab0Var8.Q = true;
                                break;
                        }
                    }
                });
                this.f26719s.a(f1Var4, h7.z5.n(-1, 48));
                org.telegram.ui.ActionBar.f1 f1Var5 = new org.telegram.ui.ActionBar.f1(1, context, gb0Var.B, false, true);
                f1Var5.g(LocaleController.getString(R.string.DoNotForward), R.drawable.msg_delete, null);
                int iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, cb0Var);
                int i25 = org.telegram.ui.ActionBar.g6.f23269p7;
                f1Var5.c(iV1, org.telegram.ui.ActionBar.g6.v0(i25, cb0Var));
                final int i26 = 9;
                f1Var5.setOnClickListener(new View.OnClickListener(this) {

                    public final ab0 f30051b;

                    {
                        this.f30051b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i26) {
                            case 0:
                                ab0 ab0Var4 = this.f30051b;
                                ab0Var4.V.d.quote = null;
                                ab0Var4.f26715e.f(false);
                                ab0Var4.g(false, false);
                                ab0Var4.f26719s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ab0 ab0Var5 = this.f30051b;
                                sa0 sa0Var2 = ab0Var5.f26715e;
                                gb0 gb0Var2 = ab0Var5.V;
                                if (ab0Var5.c(null) != null) {
                                    if (sa0Var2.v - sa0Var2.f25895u <= MessagesController.getInstance(gb0Var2.f28588w).quoteLengthMax) {
                                        org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                        MessageObject messageObjectC = ab0Var5.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                        int i110 = sa0Var2.f25895u;
                                        messagePreviewParams4.quoteStart = i110;
                                        int i111 = sa0Var2.v;
                                        messagePreviewParams4.quoteEnd = i111;
                                        messagePreviewParams4.quote = org.telegram.ui.hn.b(i110, i111, messageObjectC);
                                        gb0Var2.b();
                                        gb0Var2.a(true);
                                    } else {
                                        ab0Var5.f();
                                    }
                                }
                                break;
                            case 2:
                                ab0 ab0Var6 = this.f30051b;
                                sa0 sa0Var3 = ab0Var6.f26715e;
                                gb0 gb0Var3 = ab0Var6.V;
                                MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                int i27 = gb0Var3.f28588w;
                                boolean z13 = gb0Var3.f28581b;
                                if (messagePreviewParams5.quote != null && !z13) {
                                    messagePreviewParams5.quote = null;
                                    sa0Var3.f(false);
                                    ab0Var6.g(false, true);
                                    ab0Var6.k(true);
                                } else if (sa0Var3.v - sa0Var3.f25895u <= MessagesController.getInstance(i27).quoteLengthMax) {
                                    MessageObject messageObjectC2 = ab0Var6.c(null);
                                    if (messageObjectC2 != null) {
                                        if (!sa0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int iMin = Math.min(MessagesController.getInstance(i27).quoteLengthMax, messageObjectC2.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = iMin;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, iMin, messageObjectC2);
                                            View viewD = ab0Var6.d();
                                            if (viewD instanceof org.telegram.ui.Cells.s1) {
                                                sa0Var3.a0((org.telegram.ui.Cells.s1) viewD, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z13) {
                                                ab0Var6.f26719s.getSwipeBack().e(ab0Var6.E);
                                            }
                                            ab0Var6.g(true, true);
                                        } else {
                                            messagePreviewParams5.quoteStart = sa0Var3.f25895u;
                                            messagePreviewParams5.quoteEnd = sa0Var3.v;
                                            org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var6.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                            gb0Var3.b();
                                            gb0Var3.a(true);
                                        }
                                    }
                                } else {
                                    ab0Var6.f();
                                }
                                break;
                            case 3:
                                this.f30051b.V.c(false);
                                break;
                            case 4:
                                this.f30051b.V.c(false);
                                break;
                            case 5:
                                this.f30051b.V.a(true);
                                break;
                            case 6:
                                gb0 gb0Var4 = this.f30051b.V;
                                if (!gb0Var4.f28581b) {
                                    org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                    ykVar.a(true);
                                    org.telegram.ui.rn rnVar = ykVar.D;
                                    rnVar.f42095j5 = null;
                                    rnVar.f42069h5 = null;
                                    rnVar.f41992b5.updateReply(null, null, rnVar.P5, null);
                                    rnVar.j8();
                                } else {
                                    org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                    ykVar2.a(true);
                                    org.telegram.ui.rn rnVar2 = ykVar2.D;
                                    rnVar2.f42069h5 = null;
                                    rnVar2.Bb(rnVar2.f42095j5);
                                }
                                break;
                            case 7:
                                this.f30051b.V.c(true);
                                break;
                            case 8:
                                this.f30051b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.f30051b.V;
                                ykVar3.a(true);
                                org.telegram.ui.rn rnVar3 = ykVar3.D;
                                rnVar3.f41992b5.updateForward(null, rnVar3.P5);
                                rnVar3.j8();
                                break;
                            case 10:
                                this.f30051b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.f30051b.V;
                                ykVar4.a(true);
                                org.telegram.ui.rn rnVar4 = ykVar4.D;
                                rnVar4.C5 = null;
                                org.telegram.ui.ck ckVar = rnVar4.U;
                                if (ckVar != null) {
                                    ckVar.S2 = null;
                                    ckVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = rnVar4.f41992b5;
                                if (messagePreviewParams6 != null) {
                                    int i28 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                    MessageObject messageObject = rnVar4.f42095j5;
                                    messagePreviewParams6.updateLink(i28, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.f42069h5, rnVar4.f42119l5);
                                }
                                rnVar4.j8();
                                break;
                            case 12:
                                ab0 ab0Var7 = this.f30051b;
                                MessagePreviewParams messagePreviewParams7 = ab0Var7.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z14 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z14;
                                    ab0Var7.C.a(z14, true);
                                    ab0Var7.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (ab0Var7.f26718r.messages.size() > 0 && (message2 = ab0Var7.f26718r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z15 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z15;
                                        messageMedia2.force_large_media = !z15;
                                    }
                                    if (ab0Var7.f26718r.previewMessages.size() > 0 && (message = ab0Var7.f26718r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z16;
                                        messageMedia.force_large_media = !z16;
                                    }
                                    ab0Var7.h();
                                    ab0Var7.Q = true;
                                    break;
                                }
                                break;
                            default:
                                ab0 ab0Var8 = this.f30051b;
                                MessagePreviewParams messagePreviewParams8 = ab0Var8.V.d;
                                boolean z17 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z17;
                                ab0Var8.A.a(z17, true);
                                if (ab0Var8.f26718r.messages.size() > 0 && (message4 = ab0Var8.f26718r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (ab0Var8.f26718r.previewMessages.size() > 0 && (message3 = ab0Var8.f26718r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                ab0Var8.h();
                                ab0Var8.Q = true;
                                break;
                        }
                    }
                });
                f1Var5.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(null, i25, false)));
                this.f26719s.a(f1Var5, h7.z5.n(-1, 48));
                fb0 fb0Var8 = fb0Var;
                fb0Var8.a(messagePreviewParams.hideForwardSendersName, false);
                fb0 fb0Var9 = fb0Var2;
                ab0 ab0Var4 = this;
                fb0Var8.setOnClickListener(new gh.e3(this, z10, context, fb0Var9, fb0Var8, 1));
                ab0Var2 = ab0Var4;
                if (fb0Var9 != null) {
                    fb0Var9.setOnClickListener(new gg.f(ab0Var4, fb0Var9, fb0Var8, 29));
                    ab0Var2 = ab0Var4;
                }
            }
            ab0Var2 = ab0Var;
            context2 = context;
            ab0Var3 = ab0Var2;
        } else {
            if (!messages.hasText || messagePreviewParams3.isSecret) {
                messagePreviewParams = messagePreviewParams3;
            } else {
                LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context3, 1);
                if (z12) {
                    view = linearLayoutG;
                    messagePreviewParams2 = messagePreviewParams3;
                    z11 = true;
                } else {
                    ViewGroup viewGroup = linearLayoutG;
                    messagePreviewParams2 = messagePreviewParams3;
                    org.telegram.ui.ActionBar.f1 f1Var6 = new org.telegram.ui.ActionBar.f1(0, context3, gb0Var.B, true, false);
                    f1Var6.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                    f1Var6.setOnClickListener(new View.OnClickListener(this) {

                        public final ab0 f30051b;

                        {
                            this.f30051b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (i14) {
                                case 0:
                                    ab0 ab0Var5 = this.f30051b;
                                    ab0Var5.V.d.quote = null;
                                    ab0Var5.f26715e.f(false);
                                    ab0Var5.g(false, false);
                                    ab0Var5.f26719s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ab0 ab0Var6 = this.f30051b;
                                    sa0 sa0Var2 = ab0Var6.f26715e;
                                    gb0 gb0Var2 = ab0Var6.V;
                                    if (ab0Var6.c(null) != null) {
                                        if (sa0Var2.v - sa0Var2.f25895u <= MessagesController.getInstance(gb0Var2.f28588w).quoteLengthMax) {
                                            org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                            MessageObject messageObjectC = ab0Var6.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                            int i110 = sa0Var2.f25895u;
                                            messagePreviewParams4.quoteStart = i110;
                                            int i111 = sa0Var2.v;
                                            messagePreviewParams4.quoteEnd = i111;
                                            messagePreviewParams4.quote = org.telegram.ui.hn.b(i110, i111, messageObjectC);
                                            gb0Var2.b();
                                            gb0Var2.a(true);
                                        } else {
                                            ab0Var6.f();
                                        }
                                    }
                                    break;
                                case 2:
                                    ab0 ab0Var7 = this.f30051b;
                                    sa0 sa0Var3 = ab0Var7.f26715e;
                                    gb0 gb0Var3 = ab0Var7.V;
                                    MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                    int i27 = gb0Var3.f28588w;
                                    boolean z13 = gb0Var3.f28581b;
                                    if (messagePreviewParams5.quote != null && !z13) {
                                        messagePreviewParams5.quote = null;
                                        sa0Var3.f(false);
                                        ab0Var7.g(false, true);
                                        ab0Var7.k(true);
                                    } else if (sa0Var3.v - sa0Var3.f25895u <= MessagesController.getInstance(i27).quoteLengthMax) {
                                        MessageObject messageObjectC2 = ab0Var7.c(null);
                                        if (messageObjectC2 != null) {
                                            if (!sa0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int iMin = Math.min(MessagesController.getInstance(i27).quoteLengthMax, messageObjectC2.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = iMin;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, iMin, messageObjectC2);
                                                View viewD = ab0Var7.d();
                                                if (viewD instanceof org.telegram.ui.Cells.s1) {
                                                    sa0Var3.a0((org.telegram.ui.Cells.s1) viewD, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z13) {
                                                    ab0Var7.f26719s.getSwipeBack().e(ab0Var7.E);
                                                }
                                                ab0Var7.g(true, true);
                                            } else {
                                                messagePreviewParams5.quoteStart = sa0Var3.f25895u;
                                                messagePreviewParams5.quoteEnd = sa0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var7.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                                gb0Var3.b();
                                                gb0Var3.a(true);
                                            }
                                        }
                                    } else {
                                        ab0Var7.f();
                                    }
                                    break;
                                case 3:
                                    this.f30051b.V.c(false);
                                    break;
                                case 4:
                                    this.f30051b.V.c(false);
                                    break;
                                case 5:
                                    this.f30051b.V.a(true);
                                    break;
                                case 6:
                                    gb0 gb0Var4 = this.f30051b.V;
                                    if (!gb0Var4.f28581b) {
                                        org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                        ykVar.a(true);
                                        org.telegram.ui.rn rnVar = ykVar.D;
                                        rnVar.f42095j5 = null;
                                        rnVar.f42069h5 = null;
                                        rnVar.f41992b5.updateReply(null, null, rnVar.P5, null);
                                        rnVar.j8();
                                    } else {
                                        org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                        ykVar2.a(true);
                                        org.telegram.ui.rn rnVar2 = ykVar2.D;
                                        rnVar2.f42069h5 = null;
                                        rnVar2.Bb(rnVar2.f42095j5);
                                    }
                                    break;
                                case 7:
                                    this.f30051b.V.c(true);
                                    break;
                                case 8:
                                    this.f30051b.V.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.f30051b.V;
                                    ykVar3.a(true);
                                    org.telegram.ui.rn rnVar3 = ykVar3.D;
                                    rnVar3.f41992b5.updateForward(null, rnVar3.P5);
                                    rnVar3.j8();
                                    break;
                                case 10:
                                    this.f30051b.V.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.f30051b.V;
                                    ykVar4.a(true);
                                    org.telegram.ui.rn rnVar4 = ykVar4.D;
                                    rnVar4.C5 = null;
                                    org.telegram.ui.ck ckVar = rnVar4.U;
                                    if (ckVar != null) {
                                        ckVar.S2 = null;
                                        ckVar.T2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = rnVar4.f41992b5;
                                    if (messagePreviewParams6 != null) {
                                        int i28 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                        MessageObject messageObject = rnVar4.f42095j5;
                                        messagePreviewParams6.updateLink(i28, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.f42069h5, rnVar4.f42119l5);
                                    }
                                    rnVar4.j8();
                                    break;
                                case 12:
                                    ab0 ab0Var8 = this.f30051b;
                                    MessagePreviewParams messagePreviewParams7 = ab0Var8.V.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z14 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z14;
                                        ab0Var8.C.a(z14, true);
                                        ab0Var8.D.a(messagePreviewParams7.webpageSmall, true);
                                        if (ab0Var8.f26718r.messages.size() > 0 && (message2 = ab0Var8.f26718r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z15 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z15;
                                            messageMedia2.force_large_media = !z15;
                                        }
                                        if (ab0Var8.f26718r.previewMessages.size() > 0 && (message = ab0Var8.f26718r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z16;
                                            messageMedia.force_large_media = !z16;
                                        }
                                        ab0Var8.h();
                                        ab0Var8.Q = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ab0 ab0Var9 = this.f30051b;
                                    MessagePreviewParams messagePreviewParams8 = ab0Var9.V.d;
                                    boolean z17 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z17;
                                    ab0Var9.A.a(z17, true);
                                    if (ab0Var9.f26718r.messages.size() > 0 && (message4 = ab0Var9.f26718r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (ab0Var9.f26718r.previewMessages.size() > 0 && (message3 = ab0Var9.f26718r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    ab0Var9.h();
                                    ab0Var9.Q = true;
                                    break;
                            }
                        }
                    });
                    viewGroup.addView(f1Var6, h7.z5.n(-1, 48));
                    org.telegram.ui.ActionBar.k1 k1Var3 = new org.telegram.ui.ActionBar.k1(context3, cb0Var);
                    k1Var3.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, cb0Var)));
                    k1Var3.setTag(R.id.fit_width_tag, 1);
                    viewGroup.addView(k1Var3, h7.z5.n(-1, 8));
                    org.telegram.ui.ActionBar.f1 f1Var7 = new org.telegram.ui.ActionBar.f1(0, context3, gb0Var.B, false, true);
                    f1Var7.g(LocaleController.getString(R.string.QuoteSelectedPart), R.drawable.menu_quote_specific, null);
                    z11 = true;
                    final boolean z13 = true ? 1 : 0;
                    f1Var7.setOnClickListener(new View.OnClickListener(this) {

                        public final ab0 f30051b;

                        {
                            this.f30051b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            switch (z13) {
                                case 0:
                                    ab0 ab0Var5 = this.f30051b;
                                    ab0Var5.V.d.quote = null;
                                    ab0Var5.f26715e.f(false);
                                    ab0Var5.g(false, false);
                                    ab0Var5.f26719s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    ab0 ab0Var6 = this.f30051b;
                                    sa0 sa0Var2 = ab0Var6.f26715e;
                                    gb0 gb0Var2 = ab0Var6.V;
                                    if (ab0Var6.c(null) != null) {
                                        if (sa0Var2.v - sa0Var2.f25895u <= MessagesController.getInstance(gb0Var2.f28588w).quoteLengthMax) {
                                            org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                            MessageObject messageObjectC = ab0Var6.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                            MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                            int i110 = sa0Var2.f25895u;
                                            messagePreviewParams4.quoteStart = i110;
                                            int i111 = sa0Var2.v;
                                            messagePreviewParams4.quoteEnd = i111;
                                            messagePreviewParams4.quote = org.telegram.ui.hn.b(i110, i111, messageObjectC);
                                            gb0Var2.b();
                                            gb0Var2.a(true);
                                        } else {
                                            ab0Var6.f();
                                        }
                                    }
                                    break;
                                case 2:
                                    ab0 ab0Var7 = this.f30051b;
                                    sa0 sa0Var3 = ab0Var7.f26715e;
                                    gb0 gb0Var3 = ab0Var7.V;
                                    MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                    int i27 = gb0Var3.f28588w;
                                    boolean z14 = gb0Var3.f28581b;
                                    if (messagePreviewParams5.quote != null && !z14) {
                                        messagePreviewParams5.quote = null;
                                        sa0Var3.f(false);
                                        ab0Var7.g(false, true);
                                        ab0Var7.k(true);
                                    } else if (sa0Var3.v - sa0Var3.f25895u <= MessagesController.getInstance(i27).quoteLengthMax) {
                                        MessageObject messageObjectC2 = ab0Var7.c(null);
                                        if (messageObjectC2 != null) {
                                            if (!sa0Var3.y()) {
                                                messagePreviewParams5.quoteStart = 0;
                                                int iMin = Math.min(MessagesController.getInstance(i27).quoteLengthMax, messageObjectC2.messageOwner.message.length());
                                                messagePreviewParams5.quoteEnd = iMin;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, iMin, messageObjectC2);
                                                View viewD = ab0Var7.d();
                                                if (viewD instanceof org.telegram.ui.Cells.s1) {
                                                    sa0Var3.a0((org.telegram.ui.Cells.s1) viewD, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                                }
                                                if (!z14) {
                                                    ab0Var7.f26719s.getSwipeBack().e(ab0Var7.E);
                                                }
                                                ab0Var7.g(true, true);
                                            } else {
                                                messagePreviewParams5.quoteStart = sa0Var3.f25895u;
                                                messagePreviewParams5.quoteEnd = sa0Var3.v;
                                                org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                                messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var7.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                                gb0Var3.b();
                                                gb0Var3.a(true);
                                            }
                                        }
                                    } else {
                                        ab0Var7.f();
                                    }
                                    break;
                                case 3:
                                    this.f30051b.V.c(false);
                                    break;
                                case 4:
                                    this.f30051b.V.c(false);
                                    break;
                                case 5:
                                    this.f30051b.V.a(true);
                                    break;
                                case 6:
                                    gb0 gb0Var4 = this.f30051b.V;
                                    if (!gb0Var4.f28581b) {
                                        org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                        ykVar.a(true);
                                        org.telegram.ui.rn rnVar = ykVar.D;
                                        rnVar.f42095j5 = null;
                                        rnVar.f42069h5 = null;
                                        rnVar.f41992b5.updateReply(null, null, rnVar.P5, null);
                                        rnVar.j8();
                                    } else {
                                        org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                        ykVar2.a(true);
                                        org.telegram.ui.rn rnVar2 = ykVar2.D;
                                        rnVar2.f42069h5 = null;
                                        rnVar2.Bb(rnVar2.f42095j5);
                                    }
                                    break;
                                case 7:
                                    this.f30051b.V.c(true);
                                    break;
                                case 8:
                                    this.f30051b.V.a(true);
                                    break;
                                case 9:
                                    org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.f30051b.V;
                                    ykVar3.a(true);
                                    org.telegram.ui.rn rnVar3 = ykVar3.D;
                                    rnVar3.f41992b5.updateForward(null, rnVar3.P5);
                                    rnVar3.j8();
                                    break;
                                case 10:
                                    this.f30051b.V.a(true);
                                    break;
                                case 11:
                                    org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.f30051b.V;
                                    ykVar4.a(true);
                                    org.telegram.ui.rn rnVar4 = ykVar4.D;
                                    rnVar4.C5 = null;
                                    org.telegram.ui.ck ckVar = rnVar4.U;
                                    if (ckVar != null) {
                                        ckVar.S2 = null;
                                        ckVar.T2 = false;
                                    }
                                    MessagePreviewParams messagePreviewParams6 = rnVar4.f41992b5;
                                    if (messagePreviewParams6 != null) {
                                        int i28 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                        MessageObject messageObject = rnVar4.f42095j5;
                                        messagePreviewParams6.updateLink(i28, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.f42069h5, rnVar4.f42119l5);
                                    }
                                    rnVar4.j8();
                                    break;
                                case 12:
                                    ab0 ab0Var8 = this.f30051b;
                                    MessagePreviewParams messagePreviewParams7 = ab0Var8.V.d;
                                    if (messagePreviewParams7.hasMedia) {
                                        boolean z15 = !messagePreviewParams7.webpageSmall;
                                        messagePreviewParams7.webpageSmall = z15;
                                        ab0Var8.C.a(z15, true);
                                        ab0Var8.D.a(messagePreviewParams7.webpageSmall, true);
                                        if (ab0Var8.f26718r.messages.size() > 0 && (message2 = ab0Var8.f26718r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z16 = messagePreviewParams7.webpageSmall;
                                            messageMedia2.force_small_media = z16;
                                            messageMedia2.force_large_media = !z16;
                                        }
                                        if (ab0Var8.f26718r.previewMessages.size() > 0 && (message = ab0Var8.f26718r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                            boolean z17 = messagePreviewParams7.webpageSmall;
                                            messageMedia.force_small_media = z17;
                                            messageMedia.force_large_media = !z17;
                                        }
                                        ab0Var8.h();
                                        ab0Var8.Q = true;
                                        break;
                                    }
                                    break;
                                default:
                                    ab0 ab0Var9 = this.f30051b;
                                    MessagePreviewParams messagePreviewParams8 = ab0Var9.V.d;
                                    boolean z18 = messagePreviewParams8.webpageTop;
                                    messagePreviewParams8.webpageTop = !z18;
                                    ab0Var9.A.a(z18, true);
                                    if (ab0Var9.f26718r.messages.size() > 0 && (message4 = ab0Var9.f26718r.messages.get(0).messageOwner) != null) {
                                        message4.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    if (ab0Var9.f26718r.previewMessages.size() > 0 && (message3 = ab0Var9.f26718r.previewMessages.get(0).messageOwner) != null) {
                                        message3.invert_media = messagePreviewParams8.webpageTop;
                                    }
                                    ab0Var9.h();
                                    ab0Var9.Q = true;
                                    break;
                            }
                        }
                    });
                    viewGroup.addView(f1Var7, h7.z5.n(-1, 48));
                    view = viewGroup;
                }
                this.E = actionBarPopupWindow$ActionBarPopupWindowLayout.b(view);
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setStickToRight(z11);
                FrameLayout frameLayout2 = new FrameLayout(context3);
                ra0 ra0Var = new ra0(1, 0, context, gb0Var.B, true, false);
                this.v = ra0Var;
                ra0Var.g(LocaleController.getString(z12 ? R.string.QuoteSelectedPart : R.string.SelectSpecificQuote), R.drawable.menu_select_quote, null);
                ra0 ra0Var2 = new ra0(1, 1, context, gb0Var.B, true, false);
                context3 = context;
                this.f26720w = ra0Var2;
                ra0Var2.g(LocaleController.getString(R.string.ClearQuote), R.drawable.menu_quote_delete, null);
                frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, cb0Var), 6, 0));
                final int i27 = 2;
                frameLayout2.setOnClickListener(new View.OnClickListener(this) {

                    public final ab0 f30051b;

                    {
                        this.f30051b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i27) {
                            case 0:
                                ab0 ab0Var5 = this.f30051b;
                                ab0Var5.V.d.quote = null;
                                ab0Var5.f26715e.f(false);
                                ab0Var5.g(false, false);
                                ab0Var5.f26719s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ab0 ab0Var6 = this.f30051b;
                                sa0 sa0Var2 = ab0Var6.f26715e;
                                gb0 gb0Var2 = ab0Var6.V;
                                if (ab0Var6.c(null) != null) {
                                    if (sa0Var2.v - sa0Var2.f25895u <= MessagesController.getInstance(gb0Var2.f28588w).quoteLengthMax) {
                                        org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                        MessageObject messageObjectC = ab0Var6.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                        int i110 = sa0Var2.f25895u;
                                        messagePreviewParams4.quoteStart = i110;
                                        int i111 = sa0Var2.v;
                                        messagePreviewParams4.quoteEnd = i111;
                                        messagePreviewParams4.quote = org.telegram.ui.hn.b(i110, i111, messageObjectC);
                                        gb0Var2.b();
                                        gb0Var2.a(true);
                                    } else {
                                        ab0Var6.f();
                                    }
                                }
                                break;
                            case 2:
                                ab0 ab0Var7 = this.f30051b;
                                sa0 sa0Var3 = ab0Var7.f26715e;
                                gb0 gb0Var3 = ab0Var7.V;
                                MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                int i28 = gb0Var3.f28588w;
                                boolean z14 = gb0Var3.f28581b;
                                if (messagePreviewParams5.quote != null && !z14) {
                                    messagePreviewParams5.quote = null;
                                    sa0Var3.f(false);
                                    ab0Var7.g(false, true);
                                    ab0Var7.k(true);
                                } else if (sa0Var3.v - sa0Var3.f25895u <= MessagesController.getInstance(i28).quoteLengthMax) {
                                    MessageObject messageObjectC2 = ab0Var7.c(null);
                                    if (messageObjectC2 != null) {
                                        if (!sa0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int iMin = Math.min(MessagesController.getInstance(i28).quoteLengthMax, messageObjectC2.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = iMin;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, iMin, messageObjectC2);
                                            View viewD = ab0Var7.d();
                                            if (viewD instanceof org.telegram.ui.Cells.s1) {
                                                sa0Var3.a0((org.telegram.ui.Cells.s1) viewD, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z14) {
                                                ab0Var7.f26719s.getSwipeBack().e(ab0Var7.E);
                                            }
                                            ab0Var7.g(true, true);
                                        } else {
                                            messagePreviewParams5.quoteStart = sa0Var3.f25895u;
                                            messagePreviewParams5.quoteEnd = sa0Var3.v;
                                            org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var7.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                            gb0Var3.b();
                                            gb0Var3.a(true);
                                        }
                                    }
                                } else {
                                    ab0Var7.f();
                                }
                                break;
                            case 3:
                                this.f30051b.V.c(false);
                                break;
                            case 4:
                                this.f30051b.V.c(false);
                                break;
                            case 5:
                                this.f30051b.V.a(true);
                                break;
                            case 6:
                                gb0 gb0Var4 = this.f30051b.V;
                                if (!gb0Var4.f28581b) {
                                    org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                    ykVar.a(true);
                                    org.telegram.ui.rn rnVar = ykVar.D;
                                    rnVar.f42095j5 = null;
                                    rnVar.f42069h5 = null;
                                    rnVar.f41992b5.updateReply(null, null, rnVar.P5, null);
                                    rnVar.j8();
                                } else {
                                    org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                    ykVar2.a(true);
                                    org.telegram.ui.rn rnVar2 = ykVar2.D;
                                    rnVar2.f42069h5 = null;
                                    rnVar2.Bb(rnVar2.f42095j5);
                                }
                                break;
                            case 7:
                                this.f30051b.V.c(true);
                                break;
                            case 8:
                                this.f30051b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.f30051b.V;
                                ykVar3.a(true);
                                org.telegram.ui.rn rnVar3 = ykVar3.D;
                                rnVar3.f41992b5.updateForward(null, rnVar3.P5);
                                rnVar3.j8();
                                break;
                            case 10:
                                this.f30051b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.f30051b.V;
                                ykVar4.a(true);
                                org.telegram.ui.rn rnVar4 = ykVar4.D;
                                rnVar4.C5 = null;
                                org.telegram.ui.ck ckVar = rnVar4.U;
                                if (ckVar != null) {
                                    ckVar.S2 = null;
                                    ckVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = rnVar4.f41992b5;
                                if (messagePreviewParams6 != null) {
                                    int i29 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                    MessageObject messageObject = rnVar4.f42095j5;
                                    messagePreviewParams6.updateLink(i29, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.f42069h5, rnVar4.f42119l5);
                                }
                                rnVar4.j8();
                                break;
                            case 12:
                                ab0 ab0Var8 = this.f30051b;
                                MessagePreviewParams messagePreviewParams7 = ab0Var8.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z15 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z15;
                                    ab0Var8.C.a(z15, true);
                                    ab0Var8.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (ab0Var8.f26718r.messages.size() > 0 && (message2 = ab0Var8.f26718r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (ab0Var8.f26718r.previewMessages.size() > 0 && (message = ab0Var8.f26718r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    ab0Var8.h();
                                    ab0Var8.Q = true;
                                    break;
                                }
                                break;
                            default:
                                ab0 ab0Var9 = this.f30051b;
                                MessagePreviewParams messagePreviewParams8 = ab0Var9.V.d;
                                boolean z18 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z18;
                                ab0Var9.A.a(z18, true);
                                if (ab0Var9.f26718r.messages.size() > 0 && (message4 = ab0Var9.f26718r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (ab0Var9.f26718r.previewMessages.size() > 0 && (message3 = ab0Var9.f26718r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                ab0Var9.h();
                                ab0Var9.Q = true;
                                break;
                        }
                    }
                });
                frameLayout2.addView(ra0Var, h7.z5.c(48.0f, -1));
                frameLayout2.addView(ra0Var2, h7.z5.c(48.0f, -1));
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, h7.z5.n(-1, 48));
                messagePreviewParams = messagePreviewParams2;
            }
            if (messagePreviewParams.monoforum || messagePreviewParams.noforwards || messagePreviewParams.hasSecretMessages) {
                i12 = 48;
            } else {
                FrameLayout frameLayout3 = new FrameLayout(context3);
                org.telegram.ui.ActionBar.f1 f1Var8 = new org.telegram.ui.ActionBar.f1(1, context3, gb0Var.B, false, false);
                this.f26721x = f1Var8;
                f1Var8.g(LocaleController.getString(R.string.ReplyToAnotherChat), R.drawable.msg_forward_replace, null);
                final int i28 = 3;
                f1Var8.setOnClickListener(new View.OnClickListener(this) {

                    public final ab0 f30051b;

                    {
                        this.f30051b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i28) {
                            case 0:
                                ab0 ab0Var5 = this.f30051b;
                                ab0Var5.V.d.quote = null;
                                ab0Var5.f26715e.f(false);
                                ab0Var5.g(false, false);
                                ab0Var5.f26719s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ab0 ab0Var6 = this.f30051b;
                                sa0 sa0Var2 = ab0Var6.f26715e;
                                gb0 gb0Var2 = ab0Var6.V;
                                if (ab0Var6.c(null) != null) {
                                    if (sa0Var2.v - sa0Var2.f25895u <= MessagesController.getInstance(gb0Var2.f28588w).quoteLengthMax) {
                                        org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                        MessageObject messageObjectC = ab0Var6.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                        int i110 = sa0Var2.f25895u;
                                        messagePreviewParams4.quoteStart = i110;
                                        int i111 = sa0Var2.v;
                                        messagePreviewParams4.quoteEnd = i111;
                                        messagePreviewParams4.quote = org.telegram.ui.hn.b(i110, i111, messageObjectC);
                                        gb0Var2.b();
                                        gb0Var2.a(true);
                                    } else {
                                        ab0Var6.f();
                                    }
                                }
                                break;
                            case 2:
                                ab0 ab0Var7 = this.f30051b;
                                sa0 sa0Var3 = ab0Var7.f26715e;
                                gb0 gb0Var3 = ab0Var7.V;
                                MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                int i29 = gb0Var3.f28588w;
                                boolean z14 = gb0Var3.f28581b;
                                if (messagePreviewParams5.quote != null && !z14) {
                                    messagePreviewParams5.quote = null;
                                    sa0Var3.f(false);
                                    ab0Var7.g(false, true);
                                    ab0Var7.k(true);
                                } else if (sa0Var3.v - sa0Var3.f25895u <= MessagesController.getInstance(i29).quoteLengthMax) {
                                    MessageObject messageObjectC2 = ab0Var7.c(null);
                                    if (messageObjectC2 != null) {
                                        if (!sa0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int iMin = Math.min(MessagesController.getInstance(i29).quoteLengthMax, messageObjectC2.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = iMin;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, iMin, messageObjectC2);
                                            View viewD = ab0Var7.d();
                                            if (viewD instanceof org.telegram.ui.Cells.s1) {
                                                sa0Var3.a0((org.telegram.ui.Cells.s1) viewD, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z14) {
                                                ab0Var7.f26719s.getSwipeBack().e(ab0Var7.E);
                                            }
                                            ab0Var7.g(true, true);
                                        } else {
                                            messagePreviewParams5.quoteStart = sa0Var3.f25895u;
                                            messagePreviewParams5.quoteEnd = sa0Var3.v;
                                            org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var7.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                            gb0Var3.b();
                                            gb0Var3.a(true);
                                        }
                                    }
                                } else {
                                    ab0Var7.f();
                                }
                                break;
                            case 3:
                                this.f30051b.V.c(false);
                                break;
                            case 4:
                                this.f30051b.V.c(false);
                                break;
                            case 5:
                                this.f30051b.V.a(true);
                                break;
                            case 6:
                                gb0 gb0Var4 = this.f30051b.V;
                                if (!gb0Var4.f28581b) {
                                    org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                    ykVar.a(true);
                                    org.telegram.ui.rn rnVar = ykVar.D;
                                    rnVar.f42095j5 = null;
                                    rnVar.f42069h5 = null;
                                    rnVar.f41992b5.updateReply(null, null, rnVar.P5, null);
                                    rnVar.j8();
                                } else {
                                    org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                    ykVar2.a(true);
                                    org.telegram.ui.rn rnVar2 = ykVar2.D;
                                    rnVar2.f42069h5 = null;
                                    rnVar2.Bb(rnVar2.f42095j5);
                                }
                                break;
                            case 7:
                                this.f30051b.V.c(true);
                                break;
                            case 8:
                                this.f30051b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.f30051b.V;
                                ykVar3.a(true);
                                org.telegram.ui.rn rnVar3 = ykVar3.D;
                                rnVar3.f41992b5.updateForward(null, rnVar3.P5);
                                rnVar3.j8();
                                break;
                            case 10:
                                this.f30051b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.f30051b.V;
                                ykVar4.a(true);
                                org.telegram.ui.rn rnVar4 = ykVar4.D;
                                rnVar4.C5 = null;
                                org.telegram.ui.ck ckVar = rnVar4.U;
                                if (ckVar != null) {
                                    ckVar.S2 = null;
                                    ckVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = rnVar4.f41992b5;
                                if (messagePreviewParams6 != null) {
                                    int i210 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                    MessageObject messageObject = rnVar4.f42095j5;
                                    messagePreviewParams6.updateLink(i210, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.f42069h5, rnVar4.f42119l5);
                                }
                                rnVar4.j8();
                                break;
                            case 12:
                                ab0 ab0Var8 = this.f30051b;
                                MessagePreviewParams messagePreviewParams7 = ab0Var8.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z15 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z15;
                                    ab0Var8.C.a(z15, true);
                                    ab0Var8.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (ab0Var8.f26718r.messages.size() > 0 && (message2 = ab0Var8.f26718r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (ab0Var8.f26718r.previewMessages.size() > 0 && (message = ab0Var8.f26718r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    ab0Var8.h();
                                    ab0Var8.Q = true;
                                    break;
                                }
                                break;
                            default:
                                ab0 ab0Var9 = this.f30051b;
                                MessagePreviewParams messagePreviewParams8 = ab0Var9.V.d;
                                boolean z18 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z18;
                                ab0Var9.A.a(z18, true);
                                if (ab0Var9.f26718r.messages.size() > 0 && (message4 = ab0Var9.f26718r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (ab0Var9.f26718r.previewMessages.size() > 0 && (message3 = ab0Var9.f26718r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                ab0Var9.h();
                                ab0Var9.Q = true;
                                break;
                        }
                    }
                });
                context3 = context;
                org.telegram.ui.ActionBar.f1 f1Var9 = new org.telegram.ui.ActionBar.f1(1, context3, gb0Var.B, false, false);
                this.f26722y = f1Var9;
                f1Var9.g(LocaleController.getString(R.string.QuoteToAnotherChat), R.drawable.msg_forward_replace, null);
                final int i29 = 4;
                f1Var9.setOnClickListener(new View.OnClickListener(this) {

                    public final ab0 f30051b;

                    {
                        this.f30051b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        switch (i29) {
                            case 0:
                                ab0 ab0Var5 = this.f30051b;
                                ab0Var5.V.d.quote = null;
                                ab0Var5.f26715e.f(false);
                                ab0Var5.g(false, false);
                                ab0Var5.f26719s.getSwipeBack().b(true);
                                break;
                            case 1:
                                ab0 ab0Var6 = this.f30051b;
                                sa0 sa0Var2 = ab0Var6.f26715e;
                                gb0 gb0Var2 = ab0Var6.V;
                                if (ab0Var6.c(null) != null) {
                                    if (sa0Var2.v - sa0Var2.f25895u <= MessagesController.getInstance(gb0Var2.f28588w).quoteLengthMax) {
                                        org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                        MessageObject messageObjectC = ab0Var6.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                        MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                        int i110 = sa0Var2.f25895u;
                                        messagePreviewParams4.quoteStart = i110;
                                        int i111 = sa0Var2.v;
                                        messagePreviewParams4.quoteEnd = i111;
                                        messagePreviewParams4.quote = org.telegram.ui.hn.b(i110, i111, messageObjectC);
                                        gb0Var2.b();
                                        gb0Var2.a(true);
                                    } else {
                                        ab0Var6.f();
                                    }
                                }
                                break;
                            case 2:
                                ab0 ab0Var7 = this.f30051b;
                                sa0 sa0Var3 = ab0Var7.f26715e;
                                gb0 gb0Var3 = ab0Var7.V;
                                MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                                int i210 = gb0Var3.f28588w;
                                boolean z14 = gb0Var3.f28581b;
                                if (messagePreviewParams5.quote != null && !z14) {
                                    messagePreviewParams5.quote = null;
                                    sa0Var3.f(false);
                                    ab0Var7.g(false, true);
                                    ab0Var7.k(true);
                                } else if (sa0Var3.v - sa0Var3.f25895u <= MessagesController.getInstance(i210).quoteLengthMax) {
                                    MessageObject messageObjectC2 = ab0Var7.c(null);
                                    if (messageObjectC2 != null) {
                                        if (!sa0Var3.y()) {
                                            messagePreviewParams5.quoteStart = 0;
                                            int iMin = Math.min(MessagesController.getInstance(i210).quoteLengthMax, messageObjectC2.messageOwner.message.length());
                                            messagePreviewParams5.quoteEnd = iMin;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, iMin, messageObjectC2);
                                            View viewD = ab0Var7.d();
                                            if (viewD instanceof org.telegram.ui.Cells.s1) {
                                                sa0Var3.a0((org.telegram.ui.Cells.s1) viewD, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                            }
                                            if (!z14) {
                                                ab0Var7.f26719s.getSwipeBack().e(ab0Var7.E);
                                            }
                                            ab0Var7.g(true, true);
                                        } else {
                                            messagePreviewParams5.quoteStart = sa0Var3.f25895u;
                                            messagePreviewParams5.quoteEnd = sa0Var3.v;
                                            org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                            messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var7.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                            gb0Var3.b();
                                            gb0Var3.a(true);
                                        }
                                    }
                                } else {
                                    ab0Var7.f();
                                }
                                break;
                            case 3:
                                this.f30051b.V.c(false);
                                break;
                            case 4:
                                this.f30051b.V.c(false);
                                break;
                            case 5:
                                this.f30051b.V.a(true);
                                break;
                            case 6:
                                gb0 gb0Var4 = this.f30051b.V;
                                if (!gb0Var4.f28581b) {
                                    org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                    ykVar.a(true);
                                    org.telegram.ui.rn rnVar = ykVar.D;
                                    rnVar.f42095j5 = null;
                                    rnVar.f42069h5 = null;
                                    rnVar.f41992b5.updateReply(null, null, rnVar.P5, null);
                                    rnVar.j8();
                                } else {
                                    org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                    ykVar2.a(true);
                                    org.telegram.ui.rn rnVar2 = ykVar2.D;
                                    rnVar2.f42069h5 = null;
                                    rnVar2.Bb(rnVar2.f42095j5);
                                }
                                break;
                            case 7:
                                this.f30051b.V.c(true);
                                break;
                            case 8:
                                this.f30051b.V.a(true);
                                break;
                            case 9:
                                org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.f30051b.V;
                                ykVar3.a(true);
                                org.telegram.ui.rn rnVar3 = ykVar3.D;
                                rnVar3.f41992b5.updateForward(null, rnVar3.P5);
                                rnVar3.j8();
                                break;
                            case 10:
                                this.f30051b.V.a(true);
                                break;
                            case 11:
                                org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.f30051b.V;
                                ykVar4.a(true);
                                org.telegram.ui.rn rnVar4 = ykVar4.D;
                                rnVar4.C5 = null;
                                org.telegram.ui.ck ckVar = rnVar4.U;
                                if (ckVar != null) {
                                    ckVar.S2 = null;
                                    ckVar.T2 = false;
                                }
                                MessagePreviewParams messagePreviewParams6 = rnVar4.f41992b5;
                                if (messagePreviewParams6 != null) {
                                    int i211 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                    MessageObject messageObject = rnVar4.f42095j5;
                                    messagePreviewParams6.updateLink(i211, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.f42069h5, rnVar4.f42119l5);
                                }
                                rnVar4.j8();
                                break;
                            case 12:
                                ab0 ab0Var8 = this.f30051b;
                                MessagePreviewParams messagePreviewParams7 = ab0Var8.V.d;
                                if (messagePreviewParams7.hasMedia) {
                                    boolean z15 = !messagePreviewParams7.webpageSmall;
                                    messagePreviewParams7.webpageSmall = z15;
                                    ab0Var8.C.a(z15, true);
                                    ab0Var8.D.a(messagePreviewParams7.webpageSmall, true);
                                    if (ab0Var8.f26718r.messages.size() > 0 && (message2 = ab0Var8.f26718r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z16 = messagePreviewParams7.webpageSmall;
                                        messageMedia2.force_small_media = z16;
                                        messageMedia2.force_large_media = !z16;
                                    }
                                    if (ab0Var8.f26718r.previewMessages.size() > 0 && (message = ab0Var8.f26718r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                        boolean z17 = messagePreviewParams7.webpageSmall;
                                        messageMedia.force_small_media = z17;
                                        messageMedia.force_large_media = !z17;
                                    }
                                    ab0Var8.h();
                                    ab0Var8.Q = true;
                                    break;
                                }
                                break;
                            default:
                                ab0 ab0Var9 = this.f30051b;
                                MessagePreviewParams messagePreviewParams8 = ab0Var9.V.d;
                                boolean z18 = messagePreviewParams8.webpageTop;
                                messagePreviewParams8.webpageTop = !z18;
                                ab0Var9.A.a(z18, true);
                                if (ab0Var9.f26718r.messages.size() > 0 && (message4 = ab0Var9.f26718r.messages.get(0).messageOwner) != null) {
                                    message4.invert_media = messagePreviewParams8.webpageTop;
                                }
                                if (ab0Var9.f26718r.previewMessages.size() > 0 && (message3 = ab0Var9.f26718r.previewMessages.get(0).messageOwner) != null) {
                                    message3.invert_media = messagePreviewParams8.webpageTop;
                                }
                                ab0Var9.h();
                                ab0Var9.Q = true;
                                break;
                        }
                    }
                });
                frameLayout3.addView(f1Var9, h7.z5.c(48.0f, -1));
                frameLayout3.addView(f1Var8, h7.z5.c(48.0f, -1));
                i12 = 48;
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout3, h7.z5.n(-1, 48));
            }
            if (!messagePreviewParams.noforwards && !messagePreviewParams.hasSecretMessages) {
                org.telegram.ui.ActionBar.k1 k1Var4 = new org.telegram.ui.ActionBar.k1(context3, cb0Var);
                k1Var4.setColor(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, cb0Var)));
                k1Var4.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var4, h7.z5.n(-1, 8));
            }
            g(messagePreviewParams.quote != null, false);
            org.telegram.ui.ActionBar.f1 f1Var10 = new org.telegram.ui.ActionBar.f1(1, context3, gb0Var.B, false, false);
            f1Var10.g(LocaleController.getString(R.string.ApplyChanges), R.drawable.msg_select, null);
            final int i30 = 5;
            f1Var10.setOnClickListener(new View.OnClickListener(this) {

                public final ab0 f30051b;

                {
                    this.f30051b = this;
                }

                @Override
                public final void onClick(View view2) {
                    TLRPC.Message message;
                    TLRPC.MessageMedia messageMedia;
                    TLRPC.Message message2;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Message message3;
                    TLRPC.Message message4;
                    switch (i30) {
                        case 0:
                            ab0 ab0Var5 = this.f30051b;
                            ab0Var5.V.d.quote = null;
                            ab0Var5.f26715e.f(false);
                            ab0Var5.g(false, false);
                            ab0Var5.f26719s.getSwipeBack().b(true);
                            break;
                        case 1:
                            ab0 ab0Var6 = this.f30051b;
                            sa0 sa0Var2 = ab0Var6.f26715e;
                            gb0 gb0Var2 = ab0Var6.V;
                            if (ab0Var6.c(null) != null) {
                                if (sa0Var2.v - sa0Var2.f25895u <= MessagesController.getInstance(gb0Var2.f28588w).quoteLengthMax) {
                                    org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                    MessageObject messageObjectC = ab0Var6.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                    int i110 = sa0Var2.f25895u;
                                    messagePreviewParams4.quoteStart = i110;
                                    int i111 = sa0Var2.v;
                                    messagePreviewParams4.quoteEnd = i111;
                                    messagePreviewParams4.quote = org.telegram.ui.hn.b(i110, i111, messageObjectC);
                                    gb0Var2.b();
                                    gb0Var2.a(true);
                                } else {
                                    ab0Var6.f();
                                }
                            }
                            break;
                        case 2:
                            ab0 ab0Var7 = this.f30051b;
                            sa0 sa0Var3 = ab0Var7.f26715e;
                            gb0 gb0Var3 = ab0Var7.V;
                            MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                            int i210 = gb0Var3.f28588w;
                            boolean z14 = gb0Var3.f28581b;
                            if (messagePreviewParams5.quote != null && !z14) {
                                messagePreviewParams5.quote = null;
                                sa0Var3.f(false);
                                ab0Var7.g(false, true);
                                ab0Var7.k(true);
                            } else if (sa0Var3.v - sa0Var3.f25895u <= MessagesController.getInstance(i210).quoteLengthMax) {
                                MessageObject messageObjectC2 = ab0Var7.c(null);
                                if (messageObjectC2 != null) {
                                    if (!sa0Var3.y()) {
                                        messagePreviewParams5.quoteStart = 0;
                                        int iMin = Math.min(MessagesController.getInstance(i210).quoteLengthMax, messageObjectC2.messageOwner.message.length());
                                        messagePreviewParams5.quoteEnd = iMin;
                                        messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, iMin, messageObjectC2);
                                        View viewD = ab0Var7.d();
                                        if (viewD instanceof org.telegram.ui.Cells.s1) {
                                            sa0Var3.a0((org.telegram.ui.Cells.s1) viewD, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        }
                                        if (!z14) {
                                            ab0Var7.f26719s.getSwipeBack().e(ab0Var7.E);
                                        }
                                        ab0Var7.g(true, true);
                                    } else {
                                        messagePreviewParams5.quoteStart = sa0Var3.f25895u;
                                        messagePreviewParams5.quoteEnd = sa0Var3.v;
                                        org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                        messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var7.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                        gb0Var3.b();
                                        gb0Var3.a(true);
                                    }
                                }
                            } else {
                                ab0Var7.f();
                            }
                            break;
                        case 3:
                            this.f30051b.V.c(false);
                            break;
                        case 4:
                            this.f30051b.V.c(false);
                            break;
                        case 5:
                            this.f30051b.V.a(true);
                            break;
                        case 6:
                            gb0 gb0Var4 = this.f30051b.V;
                            if (!gb0Var4.f28581b) {
                                org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                ykVar.a(true);
                                org.telegram.ui.rn rnVar = ykVar.D;
                                rnVar.f42095j5 = null;
                                rnVar.f42069h5 = null;
                                rnVar.f41992b5.updateReply(null, null, rnVar.P5, null);
                                rnVar.j8();
                            } else {
                                org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                ykVar2.a(true);
                                org.telegram.ui.rn rnVar2 = ykVar2.D;
                                rnVar2.f42069h5 = null;
                                rnVar2.Bb(rnVar2.f42095j5);
                            }
                            break;
                        case 7:
                            this.f30051b.V.c(true);
                            break;
                        case 8:
                            this.f30051b.V.a(true);
                            break;
                        case 9:
                            org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.f30051b.V;
                            ykVar3.a(true);
                            org.telegram.ui.rn rnVar3 = ykVar3.D;
                            rnVar3.f41992b5.updateForward(null, rnVar3.P5);
                            rnVar3.j8();
                            break;
                        case 10:
                            this.f30051b.V.a(true);
                            break;
                        case 11:
                            org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.f30051b.V;
                            ykVar4.a(true);
                            org.telegram.ui.rn rnVar4 = ykVar4.D;
                            rnVar4.C5 = null;
                            org.telegram.ui.ck ckVar = rnVar4.U;
                            if (ckVar != null) {
                                ckVar.S2 = null;
                                ckVar.T2 = false;
                            }
                            MessagePreviewParams messagePreviewParams6 = rnVar4.f41992b5;
                            if (messagePreviewParams6 != null) {
                                int i211 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                MessageObject messageObject = rnVar4.f42095j5;
                                messagePreviewParams6.updateLink(i211, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.f42069h5, rnVar4.f42119l5);
                            }
                            rnVar4.j8();
                            break;
                        case 12:
                            ab0 ab0Var8 = this.f30051b;
                            MessagePreviewParams messagePreviewParams7 = ab0Var8.V.d;
                            if (messagePreviewParams7.hasMedia) {
                                boolean z15 = !messagePreviewParams7.webpageSmall;
                                messagePreviewParams7.webpageSmall = z15;
                                ab0Var8.C.a(z15, true);
                                ab0Var8.D.a(messagePreviewParams7.webpageSmall, true);
                                if (ab0Var8.f26718r.messages.size() > 0 && (message2 = ab0Var8.f26718r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z16 = messagePreviewParams7.webpageSmall;
                                    messageMedia2.force_small_media = z16;
                                    messageMedia2.force_large_media = !z16;
                                }
                                if (ab0Var8.f26718r.previewMessages.size() > 0 && (message = ab0Var8.f26718r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z17 = messagePreviewParams7.webpageSmall;
                                    messageMedia.force_small_media = z17;
                                    messageMedia.force_large_media = !z17;
                                }
                                ab0Var8.h();
                                ab0Var8.Q = true;
                                break;
                            }
                            break;
                        default:
                            ab0 ab0Var9 = this.f30051b;
                            MessagePreviewParams messagePreviewParams8 = ab0Var9.V.d;
                            boolean z18 = messagePreviewParams8.webpageTop;
                            messagePreviewParams8.webpageTop = !z18;
                            ab0Var9.A.a(z18, true);
                            if (ab0Var9.f26718r.messages.size() > 0 && (message4 = ab0Var9.f26718r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams8.webpageTop;
                            }
                            if (ab0Var9.f26718r.previewMessages.size() > 0 && (message3 = ab0Var9.f26718r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams8.webpageTop;
                            }
                            ab0Var9.h();
                            ab0Var9.Q = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var10, h7.z5.n(-1, i12));
            org.telegram.ui.ActionBar.f1 f1Var11 = new org.telegram.ui.ActionBar.f1(1, context, gb0Var.B, false, true);
            f1Var11.g(LocaleController.getString(z12 ? R.string.DoNotQuote : R.string.DoNotReply), R.drawable.msg_delete, null);
            int iV2 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, cb0Var);
            int i31 = org.telegram.ui.ActionBar.g6.f23269p7;
            f1Var11.c(iV2, org.telegram.ui.ActionBar.g6.v0(i31, cb0Var));
            f1Var11.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(null, i31, false)));
            final int i32 = 6;
            f1Var11.setOnClickListener(new View.OnClickListener(this) {

                public final ab0 f30051b;

                {
                    this.f30051b = this;
                }

                @Override
                public final void onClick(View view2) {
                    TLRPC.Message message;
                    TLRPC.MessageMedia messageMedia;
                    TLRPC.Message message2;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Message message3;
                    TLRPC.Message message4;
                    switch (i32) {
                        case 0:
                            ab0 ab0Var5 = this.f30051b;
                            ab0Var5.V.d.quote = null;
                            ab0Var5.f26715e.f(false);
                            ab0Var5.g(false, false);
                            ab0Var5.f26719s.getSwipeBack().b(true);
                            break;
                        case 1:
                            ab0 ab0Var6 = this.f30051b;
                            sa0 sa0Var2 = ab0Var6.f26715e;
                            gb0 gb0Var2 = ab0Var6.V;
                            if (ab0Var6.c(null) != null) {
                                if (sa0Var2.v - sa0Var2.f25895u <= MessagesController.getInstance(gb0Var2.f28588w).quoteLengthMax) {
                                    org.telegram.ui.Cells.r9 r9Var = sa0Var2.W;
                                    MessageObject messageObjectC = ab0Var6.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                                    MessagePreviewParams messagePreviewParams4 = gb0Var2.d;
                                    int i110 = sa0Var2.f25895u;
                                    messagePreviewParams4.quoteStart = i110;
                                    int i111 = sa0Var2.v;
                                    messagePreviewParams4.quoteEnd = i111;
                                    messagePreviewParams4.quote = org.telegram.ui.hn.b(i110, i111, messageObjectC);
                                    gb0Var2.b();
                                    gb0Var2.a(true);
                                } else {
                                    ab0Var6.f();
                                }
                            }
                            break;
                        case 2:
                            ab0 ab0Var7 = this.f30051b;
                            sa0 sa0Var3 = ab0Var7.f26715e;
                            gb0 gb0Var3 = ab0Var7.V;
                            MessagePreviewParams messagePreviewParams5 = gb0Var3.d;
                            int i210 = gb0Var3.f28588w;
                            boolean z14 = gb0Var3.f28581b;
                            if (messagePreviewParams5.quote != null && !z14) {
                                messagePreviewParams5.quote = null;
                                sa0Var3.f(false);
                                ab0Var7.g(false, true);
                                ab0Var7.k(true);
                            } else if (sa0Var3.v - sa0Var3.f25895u <= MessagesController.getInstance(i210).quoteLengthMax) {
                                MessageObject messageObjectC2 = ab0Var7.c(null);
                                if (messageObjectC2 != null) {
                                    if (!sa0Var3.y()) {
                                        messagePreviewParams5.quoteStart = 0;
                                        int iMin = Math.min(MessagesController.getInstance(i210).quoteLengthMax, messageObjectC2.messageOwner.message.length());
                                        messagePreviewParams5.quoteEnd = iMin;
                                        messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, iMin, messageObjectC2);
                                        View viewD = ab0Var7.d();
                                        if (viewD instanceof org.telegram.ui.Cells.s1) {
                                            sa0Var3.a0((org.telegram.ui.Cells.s1) viewD, messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd);
                                        }
                                        if (!z14) {
                                            ab0Var7.f26719s.getSwipeBack().e(ab0Var7.E);
                                        }
                                        ab0Var7.g(true, true);
                                    } else {
                                        messagePreviewParams5.quoteStart = sa0Var3.f25895u;
                                        messagePreviewParams5.quoteEnd = sa0Var3.v;
                                        org.telegram.ui.Cells.r9 r9Var2 = sa0Var3.W;
                                        messagePreviewParams5.quote = org.telegram.ui.hn.b(messagePreviewParams5.quoteStart, messagePreviewParams5.quoteEnd, ab0Var7.c(r9Var2 != null ? ((org.telegram.ui.Cells.s1) r9Var2).getMessageObject() : null));
                                        gb0Var3.b();
                                        gb0Var3.a(true);
                                    }
                                }
                            } else {
                                ab0Var7.f();
                            }
                            break;
                        case 3:
                            this.f30051b.V.c(false);
                            break;
                        case 4:
                            this.f30051b.V.c(false);
                            break;
                        case 5:
                            this.f30051b.V.a(true);
                            break;
                        case 6:
                            gb0 gb0Var4 = this.f30051b.V;
                            if (!gb0Var4.f28581b) {
                                org.telegram.ui.yk ykVar = (org.telegram.ui.yk) gb0Var4;
                                ykVar.a(true);
                                org.telegram.ui.rn rnVar = ykVar.D;
                                rnVar.f42095j5 = null;
                                rnVar.f42069h5 = null;
                                rnVar.f41992b5.updateReply(null, null, rnVar.P5, null);
                                rnVar.j8();
                            } else {
                                org.telegram.ui.yk ykVar2 = (org.telegram.ui.yk) gb0Var4;
                                ykVar2.a(true);
                                org.telegram.ui.rn rnVar2 = ykVar2.D;
                                rnVar2.f42069h5 = null;
                                rnVar2.Bb(rnVar2.f42095j5);
                            }
                            break;
                        case 7:
                            this.f30051b.V.c(true);
                            break;
                        case 8:
                            this.f30051b.V.a(true);
                            break;
                        case 9:
                            org.telegram.ui.yk ykVar3 = (org.telegram.ui.yk) this.f30051b.V;
                            ykVar3.a(true);
                            org.telegram.ui.rn rnVar3 = ykVar3.D;
                            rnVar3.f41992b5.updateForward(null, rnVar3.P5);
                            rnVar3.j8();
                            break;
                        case 10:
                            this.f30051b.V.a(true);
                            break;
                        case 11:
                            org.telegram.ui.yk ykVar4 = (org.telegram.ui.yk) this.f30051b.V;
                            ykVar4.a(true);
                            org.telegram.ui.rn rnVar4 = ykVar4.D;
                            rnVar4.C5 = null;
                            org.telegram.ui.ck ckVar = rnVar4.U;
                            if (ckVar != null) {
                                ckVar.S2 = null;
                                ckVar.T2 = false;
                            }
                            MessagePreviewParams messagePreviewParams6 = rnVar4.f41992b5;
                            if (messagePreviewParams6 != null) {
                                int i211 = ((org.telegram.ui.ActionBar.n2) rnVar4).currentAccount;
                                MessageObject messageObject = rnVar4.f42095j5;
                                messagePreviewParams6.updateLink(i211, null, null, messageObject == rnVar4.T3 ? null : messageObject, rnVar4.f42069h5, rnVar4.f42119l5);
                            }
                            rnVar4.j8();
                            break;
                        case 12:
                            ab0 ab0Var8 = this.f30051b;
                            MessagePreviewParams messagePreviewParams7 = ab0Var8.V.d;
                            if (messagePreviewParams7.hasMedia) {
                                boolean z15 = !messagePreviewParams7.webpageSmall;
                                messagePreviewParams7.webpageSmall = z15;
                                ab0Var8.C.a(z15, true);
                                ab0Var8.D.a(messagePreviewParams7.webpageSmall, true);
                                if (ab0Var8.f26718r.messages.size() > 0 && (message2 = ab0Var8.f26718r.messages.get(0).messageOwner) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z16 = messagePreviewParams7.webpageSmall;
                                    messageMedia2.force_small_media = z16;
                                    messageMedia2.force_large_media = !z16;
                                }
                                if (ab0Var8.f26718r.previewMessages.size() > 0 && (message = ab0Var8.f26718r.previewMessages.get(0).messageOwner) != null && (messageMedia = message.media) != null) {
                                    boolean z17 = messagePreviewParams7.webpageSmall;
                                    messageMedia.force_small_media = z17;
                                    messageMedia.force_large_media = !z17;
                                }
                                ab0Var8.h();
                                ab0Var8.Q = true;
                                break;
                            }
                            break;
                        default:
                            ab0 ab0Var9 = this.f30051b;
                            MessagePreviewParams messagePreviewParams8 = ab0Var9.V.d;
                            boolean z18 = messagePreviewParams8.webpageTop;
                            messagePreviewParams8.webpageTop = !z18;
                            ab0Var9.A.a(z18, true);
                            if (ab0Var9.f26718r.messages.size() > 0 && (message4 = ab0Var9.f26718r.messages.get(0).messageOwner) != null) {
                                message4.invert_media = messagePreviewParams8.webpageTop;
                            }
                            if (ab0Var9.f26718r.previewMessages.size() > 0 && (message3 = ab0Var9.f26718r.previewMessages.get(0).messageOwner) != null) {
                                message3.invert_media = messagePreviewParams8.webpageTop;
                            }
                            ab0Var9.h();
                            ab0Var9.Q = true;
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var11, h7.z5.n(-1, i12));
            context2 = context;
            ab0Var3 = this;
        }
        int i33 = ab0Var3.f26712a;
        if (i33 == 1) {
            ab0Var3.f26718r = messagePreviewParams.forwardMessages;
        } else if (i33 == 0) {
            ab0Var3.f26718r = messagePreviewParams.replyMessage;
        } else if (i33 == 2) {
            ab0Var3.f26718r = messagePreviewParams.linkMessage;
        }
        org.telegram.ui.Cells.v9 v9VarO = ab0Var3.f26715e.o(context2);
        ab0Var3.d = v9VarO;
        v9VarO.setElevation(AndroidUtilities.dp(8.0f));
        v9VarO.setOutlineProvider(null);
        if (v9VarO.getParent() instanceof ViewGroup) {
            ((ViewGroup) v9VarO.getParent()).removeView(v9VarO);
        }
        ab0Var3.addView(v9VarO, h7.z5.d(-1, -1.0f, 51, 0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 0.0f, 0.0f));
        ab0Var3.f26715e.T(ab0Var3.f26716f);
    }

    public static MessageObject.GroupedMessages a(ab0 ab0Var, MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = ab0Var.f26718r.groupedMessagesMap.get(messageObject.getGroupId());
        if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
            return groupedMessages;
        }
        return null;
    }

    public static void b(ab0 ab0Var, org.telegram.ui.Cells.s1 s1Var) {
        CharacterStyle characterStyle;
        TLRPC.WebPage webPage;
        if (ab0Var.f26712a == 2) {
            MessagePreviewParams messagePreviewParams = ab0Var.V.d;
            if (!messagePreviewParams.singleLink && (characterStyle = messagePreviewParams.currentLink) != null && (webPage = messagePreviewParams.webpage) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                s1Var.P3(characterStyle);
                return;
            }
        }
        s1Var.P3(null);
    }

    public final MessageObject c(MessageObject messageObject) {
        MessageObject.GroupedMessages groupedMessagesValueAt;
        gb0 gb0Var = this.V;
        MessagePreviewParams.Messages messages = gb0Var.d.replyMessage;
        if (messages == null) {
            return null;
        }
        LongSparseArray<MessageObject.GroupedMessages> longSparseArray = messages.groupedMessagesMap;
        if (longSparseArray == null || longSparseArray.size() <= 0 || (groupedMessagesValueAt = gb0Var.d.replyMessage.groupedMessagesMap.valueAt(0)) == null) {
            return gb0Var.d.replyMessage.messages.get(0);
        }
        if (groupedMessagesValueAt.isDocuments) {
            if (messageObject != null) {
                return messageObject;
            }
            org.telegram.ui.hn hnVar = gb0Var.d.quote;
            if (hnVar != null) {
                return hnVar.f38861a;
            }
        }
        return groupedMessagesValueAt.captionMessage;
    }

    public final View d() {
        MessageObject messageObjectC = c(null);
        if (messageObjectC != null) {
            int i10 = 0;
            while (true) {
                ta0 ta0Var = this.f26716f;
                if (i10 >= ta0Var.getChildCount()) {
                    break;
                }
                View childAt = ta0Var.getChildAt(i10);
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) childAt;
                if (l4Var.getMessageObject() != null && (l4Var.getMessageObject() == messageObjectC || l4Var.getMessageObject().getId() == messageObjectC.getId())) {
                    return childAt;
                }
                i10++;
            }
        }
        return null;
    }

    public final void e(float f10, int i10) {
        boolean z10 = this.V.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f26719s;
        ag.y1 y1Var = this.f26714c;
        gh.q4 q4Var = this.f26713b;
        if (z10) {
            y1Var.setTranslationY(0.0f);
            q4Var.invalidateOutline();
            q4Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            y1Var.setTranslationY(i10);
            q4Var.invalidateOutline();
            q4Var.setTranslationY(f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f10 + q4Var.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        }
        float x8 = q4Var.getX();
        org.telegram.ui.Cells.v9 v9Var = this.d;
        v9Var.setTranslationX(x8);
        v9Var.setTranslationY(q4Var.getY());
    }

    public final void f() {
        gb0 gb0Var = this.V;
        new mc(gb0Var, gb0Var.B).M(LocaleController.getString(R.string.QuoteMaxError), LocaleController.getString(R.string.QuoteMaxErrorMessage), R.raw.error).j();
    }

    public final void g(boolean z10, boolean z11) {
        if (this.V.f28581b) {
            z10 = false;
        }
        if (z11 && this.K == z10) {
            return;
        }
        this.K = z10;
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.L = null;
        }
        org.telegram.ui.ActionBar.f1 f1Var = this.f26722y;
        org.telegram.ui.ActionBar.f1 f1Var2 = this.f26721x;
        ra0 ra0Var = this.f26720w;
        ra0 ra0Var2 = this.v;
        if (!z11) {
            if (ra0Var2 != null) {
                ra0Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                ra0Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (ra0Var != null) {
                ra0Var.setAlpha(z10 ? 1.0f : 0.0f);
                ra0Var.setVisibility(z10 ? 0 : 4);
            }
            if (f1Var2 != null) {
                f1Var2.setAlpha(!z10 ? 1.0f : 0.0f);
                f1Var2.setVisibility(!z10 ? 0 : 4);
            }
            if (f1Var != null) {
                f1Var.setAlpha(z10 ? 1.0f : 0.0f);
                f1Var.setVisibility(z10 ? 0 : 4);
                return;
            }
            return;
        }
        this.L = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        if (ra0Var2 != null) {
            ra0Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(ra0Var2, (Property<ra0, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (ra0Var != null) {
            ra0Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(ra0Var, (Property<ra0, Float>) property, z10 ? 1.0f : 0.0f));
        }
        if (f1Var2 != null) {
            f1Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(f1Var2, (Property<org.telegram.ui.ActionBar.f1, Float>) property, !z10 ? 1.0f : 0.0f));
        }
        if (f1Var != null) {
            f1Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(f1Var, (Property<org.telegram.ui.ActionBar.f1, Float>) property, z10 ? 1.0f : 0.0f));
        }
        this.L.playTogether(arrayList);
        this.L.setDuration(360L);
        this.L.setInterpolator(er.h);
        this.L.addListener(new org.telegram.ui.go(16, this, z10));
        this.L.start();
    }

    public final void h() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        gb0 gb0Var = this.V;
        MessagePreviewParams messagePreviewParams = gb0Var.d;
        va0 va0Var = this.h;
        if (va0Var.k()) {
            this.R = true;
            return;
        }
        for (int i10 = 0; i10 < this.f26718r.previewMessages.size(); i10++) {
            MessageObject messageObject = this.f26718r.previewMessages.get(i10);
            messageObject.forceUpdate = true;
            messageObject.sendAsPeer = gb0Var.f28580a;
            if (messagePreviewParams.hideForwardSendersName) {
                messageObject.messageOwner.flags &= -5;
                messageObject.hideSendersName = true;
            } else {
                messageObject.messageOwner.flags |= 4;
                messageObject.hideSendersName = false;
            }
            if (this.f26712a == 2) {
                TLRPC.WebPage webPage = messagePreviewParams.webpage;
                if (webPage != null && ((messageMedia = (message = messageObject.messageOwner).media) == null || messageMedia.webpage != webPage)) {
                    message.flags |= 512;
                    message.media = new TLRPC.TL_messageMediaWebPage();
                    TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
                    messageMedia2.webpage = messagePreviewParams.webpage;
                    boolean z10 = messagePreviewParams.webpageSmall;
                    messageMedia2.force_large_media = !z10;
                    messageMedia2.force_small_media = z10;
                    messageMedia2.manual = true;
                    messageObject.linkDescription = null;
                    messageObject.generateLinkDescription();
                    messageObject.photoThumbs = null;
                    messageObject.photoThumbs2 = null;
                    messageObject.photoThumbsObject = null;
                    messageObject.photoThumbsObject2 = null;
                    messageObject.generateThumbs(true);
                    messageObject.checkMediaExistance();
                } else if (webPage == null) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    message2.flags &= -513;
                    message2.media = null;
                }
            }
            if (messagePreviewParams.hideCaption) {
                messageObject.caption = null;
            } else {
                messageObject.generateCaption();
            }
            if (messageObject.isPoll()) {
                MessagePreviewParams.PreviewMediaPoll previewMediaPoll = (MessagePreviewParams.PreviewMediaPoll) messageObject.messageOwner.media;
                previewMediaPoll.results.total_voters = messagePreviewParams.hideCaption ? 0 : previewMediaPoll.totalVotersCached;
            }
        }
        for (int i11 = 0; i11 < this.f26718r.pollChosenAnswers.size(); i11++) {
            this.f26718r.pollChosenAnswers.get(i11).chosen = !messagePreviewParams.hideForwardSendersName;
        }
        for (int i12 = 0; i12 < this.f26718r.groupedMessagesMap.size(); i12++) {
            va0Var.V(this.f26718r.groupedMessagesMap.valueAt(i12));
        }
        this.f26717n.q(0, this.f26718r.previewMessages.size());
    }

    public final void i() {
        int i10 = this.N;
        float f10 = this.O;
        gb0 gb0Var = this.V;
        boolean z10 = gb0Var.v;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f26719s;
        ta0 ta0Var = this.f26716f;
        if (z10) {
            this.O = 0.0f;
            this.N = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(AndroidUtilities.dp(8.0f) + ta0Var.getMeasuredWidth());
        } else {
            int measuredHeight = ta0Var.getMeasuredHeight();
            int i11 = 0;
            for (int i12 = 0; i12 < ta0Var.getChildCount(); i12++) {
                View childAt = ta0Var.getChildAt(i12);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i11++;
                }
            }
            MessagePreviewParams.Messages messages = this.f26718r;
            if (messages == null || i11 == 0 || i11 > messages.previewMessages.size()) {
                this.N = 0;
            } else {
                int iD = i0.a.d(4.0f, measuredHeight, 0);
                this.N = iD;
                this.N = Math.min(((ta0Var.getMeasuredHeight() - this.N) + iD) - ((int) ((((AndroidUtilities.displaySize.y - (Build.VERSION.SDK_INT >= 35 ? AndroidUtilities.navigationBarHeight : 0)) * 0.8f) - this.S) - AndroidUtilities.dp(8.0f))), this.N);
            }
            float fA = com.google.android.recaptcha.internal.a.A(getMeasuredHeight() - AndroidUtilities.dp(16.0f), (this.f26713b.getMeasuredHeight() - this.N) + (this.S - AndroidUtilities.dp(8.0f)), 2.0f, AndroidUtilities.dp(8.0f)) - this.N;
            this.O = fA;
            if (fA > AndroidUtilities.dp(8.0f)) {
                this.O = AndroidUtilities.dp(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        }
        boolean z11 = this.G;
        if (z11 || (this.N == i10 && this.O == f10)) {
            if (z11) {
                float f11 = this.O;
                int i13 = this.N;
                this.P = i13;
                e(f11, i13);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = gb0Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        gb0Var.h = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new nj(this, i10, f10, 1));
        gb0Var.h.setDuration(250L);
        gb0Var.h.setInterpolator(sh.m.V);
        gb0Var.h.addListener(new sz(this, 6));
        AndroidUtilities.runOnUIThread(gb0Var.f28590y, 50L);
        this.P = i10;
        e(f10, i10);
    }

    public final void j() {
        MessageObject messageObject;
        gb0 gb0Var = this.V;
        MessagePreviewParams messagePreviewParams = gb0Var.d;
        if (this.f26712a == 0) {
            sa0 sa0Var = this.f26715e;
            if (sa0Var.v - sa0Var.f25895u > MessagesController.getInstance(gb0Var.f28588w).quoteLengthMax) {
                return;
            }
            org.telegram.ui.Cells.r9 r9Var = sa0Var.W;
            MessageObject messageObjectC = c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
            if (messagePreviewParams.quote != null && sa0Var.y()) {
                messagePreviewParams.quoteStart = sa0Var.f25895u;
                messagePreviewParams.quoteEnd = sa0Var.v;
                if (messageObjectC != null && ((messageObject = messagePreviewParams.quote.f38861a) == null || messageObject.getId() != messageObjectC.getId())) {
                    messagePreviewParams.quote = org.telegram.ui.hn.b(messagePreviewParams.quoteStart, messagePreviewParams.quoteEnd, messageObjectC);
                    gb0Var.b();
                }
            }
            sa0Var.f(false);
        }
    }

    public final void k(boolean z10) {
        String string;
        gb0 gb0Var = this.V;
        TLRPC.User user = gb0Var.f28585n;
        MessagePreviewParams messagePreviewParams = gb0Var.d;
        TLRPC.Chat chat = gb0Var.f28586r;
        ag.y1 y1Var = this.f26714c;
        int i10 = this.f26712a;
        if (i10 != 1) {
            if (i10 != 0) {
                if (i10 == 2) {
                    y1Var.d(LocaleController.getString(R.string.MessageOptionsLinkTitle), z10);
                    y1Var.c(LocaleController.getString(R.string.MessageOptionsLinkSubtitle), z10);
                    return;
                }
                return;
            }
            if (messagePreviewParams.quote == null || !messagePreviewParams.replyMessage.hasText) {
                y1Var.d(LocaleController.getString(R.string.MessageOptionsReplyTitle), z10);
                y1Var.c(messagePreviewParams.replyMessage.hasText ? LocaleController.getString(R.string.MessageOptionsReplySubtitle) : "", z10);
                return;
            } else {
                y1Var.d(LocaleController.getString(R.string.PreviewQuoteUpdate), z10);
                y1Var.c(LocaleController.getString(R.string.PreviewQuoteUpdateSubtitle), z10);
                return;
            }
        }
        MessagePreviewParams.Messages messages = messagePreviewParams.forwardMessages;
        y1Var.d(LocaleController.formatPluralString("PreviewForwardMessagesCount", messages == null ? 0 : messages.selectedIds.size(), new Object[0]), z10);
        if (messagePreviewParams.hasSenders) {
            if (messagePreviewParams.hideForwardSendersName) {
                if (user != null) {
                    string = LocaleController.formatString("ForwardPreviewSendersNameHidden", R.string.ForwardPreviewSendersNameHidden, ContactsController.formatName(user.first_name, user.last_name));
                } else {
                    string = (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel);
                }
            } else if (user != null) {
                string = LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name));
            } else {
                string = (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel);
            }
        } else if (messagePreviewParams.willSeeSenders) {
            if (user != null) {
                string = LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name));
            } else {
                string = (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameVisibleChannel);
            }
        } else if (user != null) {
            string = LocaleController.formatString("ForwardPreviewSendersNameVisible", R.string.ForwardPreviewSendersNameVisible, ContactsController.formatName(user.first_name, user.last_name));
        } else {
            string = (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenGroup) : LocaleController.getString(R.string.ForwardPreviewSendersNameHiddenChannel);
        }
        y1Var.c(string, z10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f26712a == 0) {
            AndroidUtilities.forEachViews((RecyclerView) this.f26716f, (d5.d) new la0(this, 0));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
        this.U = true;
        this.G = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        i();
        this.G = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10 = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        gb0 gb0Var = this.V;
        gb0Var.v = z10;
        this.S = 0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f26719s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i10, iMakeMeasureSpec);
        int i12 = this.S;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.M;
        this.S = Math.max(i12, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f26716f.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        boolean z11 = gb0Var.v;
        gh.q4 q4Var = this.f26713b;
        if (z11) {
            q4Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) q4Var.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f);
            ((ViewGroup.MarginLayoutParams) q4Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            q4Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i10), Math.max(AndroidUtilities.dp(340.0f), View.MeasureSpec.getSize(i10) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) q4Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) q4Var.getLayoutParams()).bottomMargin = 0;
            q4Var.getLayoutParams().height = (View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(6.0f)) - this.S;
            if (q4Var.getLayoutParams().height < View.MeasureSpec.getSize(i11) * 0.5f) {
                q4Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i11) * 0.5f);
            }
            q4Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i11) - q4Var.getLayoutParams().height;
        }
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.T != size) {
            for (int i13 = 0; i13 < this.f26718r.previewMessages.size(); i13++) {
                MessageObject messageObject = this.f26718r.previewMessages.get(i13);
                messageObject.parentWidth = gb0Var.v ? q4Var.getLayoutParams().width : View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(16.0f);
                messageObject.resetLayout();
                messageObject.forceUpdate = true;
                za0 za0Var = this.f26717n;
                if (za0Var != null) {
                    za0Var.l();
                }
            }
            this.G = true;
        }
        this.T = size;
        super.onMeasure(i10, i11);
    }
}
