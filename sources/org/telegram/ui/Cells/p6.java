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
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.wr;
public class p6 extends FrameLayout {
    public static final jc0 G;
    public static final jc0 H;
    public static final jc0 I;
    public static final jc0 J;
    public float E;
    public ValueAnimator F;
    public boolean f19676a;
    public final int f19677b;
    public final o6 f19678c;
    public final f4 d;
    public final org.telegram.ui.ActionBar.l5 e;
    public final org.telegram.ui.Components.w9 f19679f;
    public final org.telegram.ui.Components.w9 h;
    public int f19680n;
    public final org.telegram.ui.Components.g9 f19681r;
    public final vw0 f19682s;
    public final org.telegram.ui.ActionBar.f6 v;
    public final int f19683w;
    public long f19684x;
    public final n6 f19685y;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.j6.f18306y6;
        G = new jc0(i10, i11);
        jc0 jc0Var = new jc0(R.drawable.msg_reactions, i11);
        jc0Var.f24348g = 16;
        jc0Var.h = 16;
        jc0Var.f24349i = 5.66f;
        H = jc0Var;
        int i12 = R.drawable.mini_repost_story;
        int i13 = org.telegram.ui.ActionBar.j6.hk;
        I = new jc0(i12, i13);
        J = new jc0(R.drawable.mini_forward_story, i13);
    }

    public p6(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11) {
        super(context);
        int i12;
        float f7;
        float f10;
        float f11;
        float f12;
        this.f19681r = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        this.E = 1.0f;
        this.f19683w = i10;
        this.f19677b = i11;
        this.v = f6Var;
        this.f19685y = new n6(this, f6Var);
        setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(50.0f)));
        if (i10 == 1) {
            i12 = 48;
        } else {
            i12 = 34;
        }
        o6 o6Var = new o6(this, context, i10);
        this.f19678c = o6Var;
        float f13 = i12;
        o6Var.setRoundRadius(AndroidUtilities.dp(f13));
        addView(o6Var, w7.a6.i(f13, f13, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 1) {
            setClipChildren(false);
        }
        f4 f4Var = new f4(context, 1);
        this.d = f4Var;
        NotificationCenter.listenEmojiLoading(f4Var);
        f4Var.setTextSize(16);
        f4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var));
        f4Var.setEllipsizeByGradient(true);
        f4Var.setImportantForAccessibility(2);
        f4Var.setRightPadding(AndroidUtilities.dp(30.0f));
        if (LocaleController.isRTL) {
            f7 = AndroidUtilities.dp(30.0f);
        } else {
            f7 = 0.0f;
        }
        f4Var.setTranslationX(f7);
        f4Var.setRightDrawableOutside(true);
        if (i10 == 1) {
            f10 = 7.66f;
        } else {
            f10 = 5.33f;
        }
        if (i10 == 1) {
            f11 = 73.0f;
        } else {
            f11 = 55.0f;
        }
        addView(f4Var, w7.a6.i(-1.0f, -2.0f, 55, f11, f10, 12.0f, 0.0f));
        vw0 vw0Var = new vw0(this);
        this.f19682s = vw0Var;
        f4Var.setDrawablePadding(AndroidUtilities.dp(3.0f));
        f4Var.i(vw0Var.f28604a);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.e = l5Var;
        l5Var.setTextSize(13);
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18306y6, f6Var));
        l5Var.setEllipsizeByGradient(true);
        l5Var.setImportantForAccessibility(2);
        l5Var.setTranslationX(LocaleController.isRTL ? AndroidUtilities.dp(30.0f) : 0.0f);
        if (i10 == 1) {
            f12 = 24.0f;
        } else {
            f12 = 19.0f;
        }
        addView(l5Var, w7.a6.i(-1.0f, -2.0f, 55, f11, f12, 20.0f, 0.0f));
        if (z11) {
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
            this.f19679f = w9Var;
            addView(w9Var, w7.a6.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(context);
            this.h = w9Var2;
            addView(w9Var2, w7.a6.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z10) {
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            addView(view, w7.a6.c(-1.0f, -1));
        }
    }

    public final void a(float f7, boolean z10) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, f7);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new r(this, 4));
            this.F.addListener(new org.telegram.ui.ActionBar.a1(this, f7, 2));
            this.F.setInterpolator(wr.h);
            this.F.setDuration(420L);
            this.F.start();
            return;
        }
        this.E = f7;
        invalidate();
    }

    public final void c(org.telegram.tgnet.TLRPC.User r21, org.telegram.tgnet.TLRPC.Chat r22, org.telegram.tgnet.TLRPC.Reaction r23, boolean r24, long r25, org.telegram.tgnet.tl.TL_stories.StoryItem r27, boolean r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p6.c(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$Reaction, boolean, long, org.telegram.tgnet.tl.TL_stories$StoryItem, boolean, boolean, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f7;
        if (this.E < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (this.E * 255.0f), 31);
            z10 = true;
        } else {
            z10 = false;
        }
        super.dispatchDraw(canvas);
        if (this.f19676a) {
            if (this.f19683w == 1) {
                f7 = 73.0f;
            } else {
                f7 = 55.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            boolean z11 = LocaleController.isRTL;
            org.telegram.ui.ActionBar.f6 f6Var = this.v;
            if (z11) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.T0("paintDivider", f6Var));
            } else {
                canvas.drawLine(dp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.T0("paintDivider", f6Var));
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.E;
    }

    public org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        return this.v;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19682s.f28604a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19682s.f28604a.b();
        this.f19685y.g();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f19683w == 0) {
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
        int i10 = this.f19677b;
        TLRPC.Chat chat = null;
        if (peerId > 0) {
            user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerId));
        } else {
            user = null;
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerId));
        }
        c(user, chat, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    public void b(long j3) {
    }
}
