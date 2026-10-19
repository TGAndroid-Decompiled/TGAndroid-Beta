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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.uc0;
public class n6 extends FrameLayout {
    public static final uc0 H;
    public static final uc0 I;
    public static final uc0 J;
    public static final uc0 K;
    public final l6 E;
    public float F;
    public ValueAnimator G;
    public boolean f22637a;
    public final int f22638b;
    public final m6 f22639c;
    public final ci.l4 d;
    public final org.telegram.ui.ActionBar.j5 e;
    public final org.telegram.ui.Components.w9 f22640f;
    public final org.telegram.ui.Components.w9 h;
    public int f22641n;
    public final org.telegram.ui.Components.h9 f22642r;
    public final View f22643s;
    public final fx0 v;
    public final org.telegram.ui.ActionBar.d6 f22644w;
    public final int f22645x;
    public long f22646y;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.h6.f21375y6;
        H = new uc0(i10, i11);
        uc0 uc0Var = new uc0(R.drawable.msg_reactions, i11);
        uc0Var.f30931g = 16;
        uc0Var.h = 16;
        uc0Var.f30932i = 5.66f;
        I = uc0Var;
        int i12 = R.drawable.mini_repost_story;
        int i13 = org.telegram.ui.ActionBar.h6.hk;
        J = new uc0(i12, i13);
        K = new uc0(R.drawable.mini_forward_story, i13);
    }

    public n6(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(context);
        int i12;
        float f7;
        float f10;
        float f11;
        float f12;
        this.f22642r = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.F = 1.0f;
        this.f22645x = i10;
        this.f22638b = i11;
        this.f22644w = d6Var;
        this.E = new l6(this, d6Var);
        setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(50.0f)));
        if (i10 == 1) {
            i12 = 48;
        } else {
            i12 = 34;
        }
        m6 m6Var = new m6(this, context, i10);
        this.f22639c = m6Var;
        float f13 = i12;
        m6Var.setRoundRadius(AndroidUtilities.dp(f13));
        addView(m6Var, w7.z5.i(f13, f13, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 1) {
            setClipChildren(false);
        }
        ci.l4 l4Var = new ci.l4(context, 2);
        this.d = l4Var;
        NotificationCenter.listenEmojiLoading(l4Var);
        l4Var.setTextSize(16);
        l4Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var));
        l4Var.setEllipsizeByGradient(true);
        l4Var.setImportantForAccessibility(2);
        l4Var.setRightPadding(AndroidUtilities.dp(30.0f));
        if (LocaleController.isRTL) {
            f7 = AndroidUtilities.dp(30.0f);
        } else {
            f7 = 0.0f;
        }
        l4Var.setTranslationX(f7);
        l4Var.setRightDrawableOutside(true);
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
        addView(l4Var, w7.z5.i(-1.0f, -2.0f, 55, f15, f14, 12.0f, 0.0f));
        fx0 fx0Var = new fx0(this);
        this.v = fx0Var;
        l4Var.setDrawablePadding(AndroidUtilities.dp(3.0f));
        l4Var.i(fx0Var.f26391a);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.e = j5Var;
        j5Var.setTextSize(13);
        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21375y6, d6Var));
        j5Var.setEllipsizeByGradient(true);
        j5Var.setImportantForAccessibility(2);
        j5Var.setTranslationX(LocaleController.isRTL ? AndroidUtilities.dp(30.0f) : 0.0f);
        if (i10 == 1) {
            f12 = 24.0f;
        } else {
            f12 = 19.0f;
        }
        addView(j5Var, w7.z5.i(-1.0f, -2.0f, 55, f15, f12, 20.0f, 0.0f));
        if (z11) {
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
            this.f22640f = w9Var;
            addView(w9Var, w7.z5.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(context);
            this.h = w9Var2;
            addView(w9Var2, w7.z5.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z10) {
            View view = new View(context);
            this.f22643s = view;
            view.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
            addView(view, w7.z5.c(-1.0f, -1));
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
            this.G.setInterpolator(bs.h);
            this.G.setDuration(420L);
            this.G.start();
            return;
        }
        this.F = f7;
        invalidate();
    }

    public final void c(org.telegram.tgnet.TLRPC.User r21, org.telegram.tgnet.TLRPC.Chat r22, org.telegram.tgnet.TLRPC.Reaction r23, boolean r24, long r25, org.telegram.tgnet.tl.TL_stories.StoryItem r27, boolean r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n6.c(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$Reaction, boolean, long, org.telegram.tgnet.tl.TL_stories$StoryItem, boolean, boolean, boolean):void");
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
        if (this.f22637a) {
            if (this.f22645x == 1) {
                f7 = 73.0f;
            } else {
                f7 = 55.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            boolean z11 = LocaleController.isRTL;
            org.telegram.ui.ActionBar.d6 d6Var = this.f22644w;
            if (z11) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.U0("paintDivider", d6Var));
            } else {
                canvas.drawLine(dp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.U0("paintDivider", d6Var));
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.F;
    }

    public org.telegram.ui.ActionBar.d6 getResourcesProvider() {
        return this.f22644w;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v.f26391a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v.f26391a.b();
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
        if (this.f22645x == 0) {
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
        int i11 = this.f22638b;
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
