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
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.pr;
public class n6 extends FrameLayout {
    public static final bc0 G;
    public static final bc0 H;
    public static final bc0 I;
    public static final bc0 J;
    public float E;
    public ValueAnimator F;
    public boolean f22333a;
    public final int f22334b;
    public final m6 f22335c;
    public final bi.j5 d;
    public final org.telegram.ui.ActionBar.j5 f22336e;
    public final org.telegram.ui.Components.x9 f22337f;
    public final org.telegram.ui.Components.x9 h;
    public int f22338n;
    public final org.telegram.ui.Components.i9 f22339r;
    public final jw0 f22340s;
    public final org.telegram.ui.ActionBar.f6 v;
    public final int f22341w;
    public long f22342x;
    public final l6 f22343y;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.j6.f21042y6;
        G = new bc0(i10, i11);
        bc0 bc0Var = new bc0(R.drawable.msg_reactions, i11);
        bc0Var.f24665g = 16;
        bc0Var.h = 16;
        bc0Var.f24666i = 5.66f;
        H = bc0Var;
        int i12 = R.drawable.mini_repost_story;
        int i13 = org.telegram.ui.ActionBar.j6.hk;
        I = new bc0(i12, i13);
        J = new bc0(R.drawable.mini_forward_story, i13);
    }

    public n6(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11) {
        super(context);
        int i12;
        float f7;
        float f10;
        float f11;
        float f12;
        this.f22339r = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        this.E = 1.0f;
        this.f22341w = i10;
        this.f22334b = i11;
        this.v = f6Var;
        this.f22343y = new l6(this, f6Var);
        setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(50.0f)));
        if (i10 == 1) {
            i12 = 48;
        } else {
            i12 = 34;
        }
        m6 m6Var = new m6(this, context, i10);
        this.f22335c = m6Var;
        float f13 = i12;
        m6Var.setRoundRadius(AndroidUtilities.dp(f13));
        addView(m6Var, w7.x5.i(f13, f13, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 1) {
            setClipChildren(false);
        }
        bi.j5 j5Var = new bi.j5(context, 2);
        this.d = j5Var;
        NotificationCenter.listenEmojiLoading(j5Var);
        j5Var.setTextSize(16);
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var));
        j5Var.setEllipsizeByGradient(true);
        j5Var.setImportantForAccessibility(2);
        j5Var.setRightPadding(AndroidUtilities.dp(30.0f));
        if (LocaleController.isRTL) {
            f7 = AndroidUtilities.dp(30.0f);
        } else {
            f7 = 0.0f;
        }
        j5Var.setTranslationX(f7);
        j5Var.setRightDrawableOutside(true);
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
        addView(j5Var, w7.x5.i(-1.0f, -2.0f, 55, f11, f10, 12.0f, 0.0f));
        jw0 jw0Var = new jw0(this);
        this.f22340s = jw0Var;
        j5Var.setDrawablePadding(AndroidUtilities.dp(3.0f));
        j5Var.i(jw0Var.f27580a);
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.f22336e = j5Var2;
        j5Var2.setTextSize(13);
        j5Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21042y6, f6Var));
        j5Var2.setEllipsizeByGradient(true);
        j5Var2.setImportantForAccessibility(2);
        j5Var2.setTranslationX(LocaleController.isRTL ? AndroidUtilities.dp(30.0f) : 0.0f);
        if (i10 == 1) {
            f12 = 24.0f;
        } else {
            f12 = 19.0f;
        }
        addView(j5Var2, w7.x5.i(-1.0f, -2.0f, 55, f11, f12, 20.0f, 0.0f));
        if (z11) {
            org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
            this.f22337f = x9Var;
            addView(x9Var, w7.x5.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.x9 x9Var2 = new org.telegram.ui.Components.x9(context);
            this.h = x9Var2;
            addView(x9Var2, w7.x5.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z10) {
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            addView(view, w7.x5.c(-1.0f, -1));
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
            this.F.addListener(new org.telegram.ui.ActionBar.z0(this, f7, 2));
            this.F.setInterpolator(pr.h);
            this.F.setDuration(420L);
            this.F.start();
            return;
        }
        this.E = f7;
        invalidate();
    }

    public final void c(org.telegram.tgnet.TLRPC.User r21, org.telegram.tgnet.TLRPC.Chat r22, org.telegram.tgnet.TLRPC.Reaction r23, boolean r24, long r25, org.telegram.tgnet.tl.TL_stories.StoryItem r27, boolean r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n6.c(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$Reaction, boolean, long, org.telegram.tgnet.tl.TL_stories$StoryItem, boolean, boolean, boolean):void");
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
        if (this.f22333a) {
            if (this.f22341w == 1) {
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
        this.f22340s.f27580a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22340s.f27580a.b();
        this.f22343y.g();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f22341w == 0) {
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
        int i10 = this.f22334b;
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
