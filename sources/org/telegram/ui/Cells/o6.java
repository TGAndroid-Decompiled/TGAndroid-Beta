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
import org.telegram.ui.Components.gx0;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.tr;
public class o6 extends FrameLayout {
    public static final oc0 G;
    public static final oc0 H;
    public static final oc0 I;
    public static final oc0 J;
    public float E;
    public ValueAnimator F;
    public boolean f22595a;
    public final int f22596b;
    public final n6 f22597c;
    public final ai.z5 d;
    public final org.telegram.ui.ActionBar.i5 f22598e;
    public final org.telegram.ui.Components.w9 f22599f;
    public final org.telegram.ui.Components.w9 h;
    public int f22600n;
    public final org.telegram.ui.Components.h9 f22601r;
    public final gx0 f22602s;
    public final org.telegram.ui.ActionBar.d6 v;
    public final int f22603w;
    public long f22604x;
    public final m6 f22605y;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.i6.f21204y6;
        G = new oc0(i10, i11);
        oc0 oc0Var = new oc0(R.drawable.msg_reactions, i11);
        oc0Var.f29336g = 16;
        oc0Var.h = 16;
        oc0Var.f29337i = 5.66f;
        H = oc0Var;
        int i12 = R.drawable.mini_repost_story;
        int i13 = org.telegram.ui.ActionBar.i6.hk;
        I = new oc0(i12, i13);
        J = new oc0(R.drawable.mini_forward_story, i13);
    }

    public o6(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(context);
        int i12;
        float f7;
        float f10;
        float f11;
        float f12;
        this.f22601r = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.E = 1.0f;
        this.f22603w = i10;
        this.f22596b = i11;
        this.v = d6Var;
        this.f22605y = new m6(this, d6Var);
        setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(50.0f)));
        if (i10 == 1) {
            i12 = 48;
        } else {
            i12 = 34;
        }
        n6 n6Var = new n6(this, context, i10);
        this.f22597c = n6Var;
        float f13 = i12;
        n6Var.setRoundRadius(AndroidUtilities.dp(f13));
        addView(n6Var, w7.z5.i(f13, f13, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 1) {
            setClipChildren(false);
        }
        ai.z5 z5Var = new ai.z5(context, 2);
        this.d = z5Var;
        NotificationCenter.listenEmojiLoading(z5Var);
        z5Var.setTextSize(16);
        z5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, d6Var));
        z5Var.setEllipsizeByGradient(true);
        z5Var.setImportantForAccessibility(2);
        z5Var.setRightPadding(AndroidUtilities.dp(30.0f));
        if (LocaleController.isRTL) {
            f7 = AndroidUtilities.dp(30.0f);
        } else {
            f7 = 0.0f;
        }
        z5Var.setTranslationX(f7);
        z5Var.setRightDrawableOutside(true);
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
        addView(z5Var, w7.z5.i(-1.0f, -2.0f, 55, f11, f10, 12.0f, 0.0f));
        gx0 gx0Var = new gx0(this);
        this.f22602s = gx0Var;
        z5Var.setDrawablePadding(AndroidUtilities.dp(3.0f));
        z5Var.i(gx0Var.f26942a);
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.f22598e = i5Var;
        i5Var.setTextSize(13);
        i5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21204y6, d6Var));
        i5Var.setEllipsizeByGradient(true);
        i5Var.setImportantForAccessibility(2);
        i5Var.setTranslationX(LocaleController.isRTL ? AndroidUtilities.dp(30.0f) : 0.0f);
        if (i10 == 1) {
            f12 = 24.0f;
        } else {
            f12 = 19.0f;
        }
        addView(i5Var, w7.z5.i(-1.0f, -2.0f, 55, f11, f12, 20.0f, 0.0f));
        if (z11) {
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
            this.f22599f = w9Var;
            addView(w9Var, w7.z5.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(context);
            this.h = w9Var2;
            addView(w9Var2, w7.z5.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z10) {
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.i6.K0(false));
            addView(view, w7.z5.c(-1.0f, -1));
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
            this.F.setInterpolator(tr.h);
            this.F.setDuration(420L);
            this.F.start();
            return;
        }
        this.E = f7;
        invalidate();
    }

    public final void c(org.telegram.tgnet.TLRPC.User r21, org.telegram.tgnet.TLRPC.Chat r22, org.telegram.tgnet.TLRPC.Reaction r23, boolean r24, long r25, org.telegram.tgnet.tl.TL_stories.StoryItem r27, boolean r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o6.c(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$Reaction, boolean, long, org.telegram.tgnet.tl.TL_stories$StoryItem, boolean, boolean, boolean):void");
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
        if (this.f22595a) {
            if (this.f22603w == 1) {
                f7 = 73.0f;
            } else {
                f7 = 55.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            boolean z11 = LocaleController.isRTL;
            org.telegram.ui.ActionBar.d6 d6Var = this.v;
            if (z11) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.T0("paintDivider", d6Var));
            } else {
                canvas.drawLine(dp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.T0("paintDivider", d6Var));
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.E;
    }

    public org.telegram.ui.ActionBar.d6 getResourcesProvider() {
        return this.v;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22602s.f26942a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22602s.f26942a.b();
        this.f22605y.g();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f22603w == 0) {
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
        int i10 = this.f22596b;
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
