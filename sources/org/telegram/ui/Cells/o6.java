package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.jx0;
public class o6 extends FrameLayout {
    public static final bd0 H;
    public static final bd0 I;
    public static final bd0 J;
    public static final bd0 K;
    public final m6 E;
    public float F;
    public ValueAnimator G;
    public boolean f21337a;
    public final int f21338b;
    public final n6 f21339c;
    public final bi.l5 d;
    public final org.telegram.ui.ActionBar.h5 e;
    public final org.telegram.ui.Components.z9 f21340f;
    public final org.telegram.ui.Components.z9 h;
    public int f21341n;
    public final org.telegram.ui.Components.k9 f21342r;
    public final View f21343s;
    public final jx0 v;
    public final org.telegram.ui.ActionBar.c6 f21344w;
    public final int f21345x;
    public long f21346y;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.g6.f19988y6;
        H = new bd0(i10, i11);
        bd0 bd0Var = new bd0(R.drawable.msg_reactions, i11);
        bd0Var.f23439g = 16;
        bd0Var.h = 16;
        bd0Var.f23440i = 5.66f;
        I = bd0Var;
        int i12 = R.drawable.mini_repost_story;
        int i13 = org.telegram.ui.ActionBar.g6.hk;
        J = new bd0(i12, i13);
        K = new bd0(R.drawable.mini_forward_story, i13);
    }

    public o6(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context);
        int i12;
        float f7;
        float f10;
        float f11;
        float f12;
        this.f21342r = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        this.F = 1.0f;
        this.f21345x = i10;
        this.f21338b = i11;
        this.f21344w = c6Var;
        this.E = new m6(this, c6Var);
        setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(50.0f)));
        if (i10 == 1) {
            i12 = 48;
        } else {
            i12 = 34;
        }
        n6 n6Var = new n6(this, context, i10);
        this.f21339c = n6Var;
        float f13 = i12;
        n6Var.setRoundRadius(AndroidUtilities.dp(f13));
        addView(n6Var, w7.z5.i(f13, f13, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 1) {
            setClipChildren(false);
        }
        bi.l5 l5Var = new bi.l5(context, 2);
        this.d = l5Var;
        NotificationCenter.listenEmojiLoading(l5Var);
        l5Var.setTextSize(16);
        l5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, c6Var));
        l5Var.setEllipsizeByGradient(true);
        l5Var.setImportantForAccessibility(2);
        l5Var.setRightPadding(AndroidUtilities.dp(30.0f));
        if (LocaleController.isRTL) {
            f7 = AndroidUtilities.dp(30.0f);
        } else {
            f7 = 0.0f;
        }
        l5Var.setTranslationX(f7);
        l5Var.setRightDrawableOutside(true);
        if (i10 == 1) {
            f10 = 7.66f;
        } else {
            f10 = 5.33f;
        }
        float f14 = f10;
        if (i10 == 1) {
            f11 = 73.0f;
        } else {
            f11 = 55.0f;
        }
        float f15 = f11;
        addView(l5Var, w7.z5.i(-1.0f, -2.0f, 55, f15, f14, 12.0f, 0.0f));
        jx0 jx0Var = new jx0(this);
        this.v = jx0Var;
        l5Var.setDrawablePadding(AndroidUtilities.dp(3.0f));
        l5Var.i(jx0Var.f26148a);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.e = h5Var;
        h5Var.setTextSize(13);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19988y6, c6Var));
        h5Var.setEllipsizeByGradient(true);
        h5Var.setImportantForAccessibility(2);
        h5Var.setTranslationX(LocaleController.isRTL ? AndroidUtilities.dp(30.0f) : 0.0f);
        if (i10 == 1) {
            f12 = 24.0f;
        } else {
            f12 = 19.0f;
        }
        addView(h5Var, w7.z5.i(-1.0f, -2.0f, 55, f15, f12, 20.0f, 0.0f));
        if (z11) {
            org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
            this.f21340f = z9Var;
            addView(z9Var, w7.z5.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.z9 z9Var2 = new org.telegram.ui.Components.z9(context);
            this.h = z9Var2;
            addView(z9Var2, w7.z5.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z10) {
            View view = new View(context);
            this.f21343s = view;
            view.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
            addView(view, w7.z5.d(-1.0f, -1));
        }
    }

    public final void a(float f7, boolean z10) {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, f7);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new r(this, 4));
            this.G.addListener(new org.telegram.ui.ActionBar.y0(this, f7, 2));
            this.G.setInterpolator(es.h);
            this.G.setDuration(420L);
            this.G.start();
            return;
        }
        this.F = f7;
        invalidate();
    }

    public final void c(org.telegram.tgnet.TLRPC.User r21, org.telegram.tgnet.TLRPC.Chat r22, org.telegram.tgnet.TLRPC.Reaction r23, boolean r24, long r25, org.telegram.tgnet.tl.TL_stories.StoryItem r27, boolean r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o6.c(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$Reaction, boolean, long, org.telegram.tgnet.tl.TL_stories$StoryItem, boolean, boolean, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f7;
        if (this.F < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (this.F * 255.0f), 31);
            z10 = true;
        } else {
            z10 = false;
        }
        super.dispatchDraw(canvas);
        if (this.f21337a) {
            if (this.f21345x == 1) {
                f7 = 73.0f;
            } else {
                f7 = 55.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            boolean z11 = LocaleController.isRTL;
            org.telegram.ui.ActionBar.c6 c6Var = this.f21344w;
            if (z11) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.U0("paintDivider", c6Var));
            } else {
                canvas.drawLine(dp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.U0("paintDivider", c6Var));
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.F;
    }

    public org.telegram.ui.ActionBar.c6 getResourcesProvider() {
        return this.f21344w;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v.f26148a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v.f26148a.b();
        this.E.g();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f21345x == 0) {
            i12 = 50;
        } else {
            i12 = 58;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12), 1073741824));
    }

    public void setUserReaction(TLRPC.MessagePeerReaction messagePeerReaction) {
        TLRPC.User user;
        if (messagePeerReaction == null) {
            return;
        }
        long peerId = MessageObject.getPeerId(messagePeerReaction.peer_id);
        int i10 = (peerId > 0L ? 1 : (peerId == 0L ? 0 : -1));
        int i11 = this.f21338b;
        TLRPC.Chat chat = null;
        if (i10 > 0) {
            user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
        } else {
            user = null;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
        }
        c(user, chat, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    public void b(long j10) {
    }
}
