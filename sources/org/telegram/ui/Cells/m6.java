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
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.mr;
public class m6 extends FrameLayout {
    public static final cc0 D;
    public static final cc0 E;
    public static final cc0 F;
    public static final cc0 G;
    public float B;
    public ValueAnimator C;
    public boolean f21362a;
    public final int f21363b;
    public final l6 f21364c;
    public final ig.c d;
    public final org.telegram.ui.ActionBar.k5 e;
    public final org.telegram.ui.Components.p9 f21365f;
    public final org.telegram.ui.Components.p9 h;
    public int f21366n;
    public final org.telegram.ui.Components.z8 f21367r;
    public final lw0 f21368s;
    public final org.telegram.ui.ActionBar.f6 v;
    public final int f21369w;
    public long f21370x;
    public final k6 f21371y;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.j6.f20256y6;
        D = new cc0(i10, i11);
        cc0 cc0Var = new cc0(R.drawable.msg_reactions, i11);
        cc0Var.f23927g = 16;
        cc0Var.h = 16;
        cc0Var.f23928i = 5.66f;
        E = cc0Var;
        int i12 = R.drawable.mini_repost_story;
        int i13 = org.telegram.ui.ActionBar.j6.hk;
        F = new cc0(i12, i13);
        G = new cc0(R.drawable.mini_forward_story, i13);
    }

    public m6(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10) {
        super(context);
        int i12;
        float f10;
        float f11;
        float f12;
        float f13;
        this.f21367r = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        this.B = 1.0f;
        this.f21369w = i10;
        this.f21363b = i11;
        this.v = f6Var;
        this.f21371y = new k6(this, f6Var);
        setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(50.0f)));
        if (i10 == 1) {
            i12 = 48;
        } else {
            i12 = 34;
        }
        l6 l6Var = new l6(this, context, i10);
        this.f21364c = l6Var;
        float f14 = i12;
        l6Var.setRoundRadius(AndroidUtilities.dp(f14));
        addView(l6Var, k7.b6.i(f14, f14, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 1) {
            setClipChildren(false);
        }
        ig.c cVar = new ig.c(context, 3);
        this.d = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextSize(16);
        cVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, f6Var));
        cVar.setEllipsizeByGradient(true);
        cVar.setImportantForAccessibility(2);
        cVar.setRightPadding(AndroidUtilities.dp(30.0f));
        if (LocaleController.isRTL) {
            f10 = AndroidUtilities.dp(30.0f);
        } else {
            f10 = 0.0f;
        }
        cVar.setTranslationX(f10);
        cVar.setRightDrawableOutside(true);
        if (i10 == 1) {
            f11 = 7.66f;
        } else {
            f11 = 5.33f;
        }
        if (i10 == 1) {
            f12 = 73.0f;
        } else {
            f12 = 55.0f;
        }
        addView(cVar, k7.b6.i(-1.0f, -2.0f, 55, f12, f11, 12.0f, 0.0f));
        lw0 lw0Var = new lw0(this);
        this.f21368s = lw0Var;
        cVar.setDrawablePadding(AndroidUtilities.dp(3.0f));
        cVar.i(lw0Var.f26889a);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.e = k5Var;
        k5Var.setTextSize(13);
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20256y6, f6Var));
        k5Var.setEllipsizeByGradient(true);
        k5Var.setImportantForAccessibility(2);
        k5Var.setTranslationX(LocaleController.isRTL ? AndroidUtilities.dp(30.0f) : 0.0f);
        if (i10 == 1) {
            f13 = 24.0f;
        } else {
            f13 = 19.0f;
        }
        addView(k5Var, k7.b6.i(-1.0f, -2.0f, 55, f12, f13, 20.0f, 0.0f));
        if (z10) {
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
            this.f21365f = p9Var;
            addView(p9Var, k7.b6.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context);
            this.h = p9Var2;
            addView(p9Var2, k7.b6.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z4) {
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
            addView(view, k7.b6.c(-1.0f, -1));
        }
    }

    public final void a(float f10, boolean z4) {
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.C = null;
        }
        if (z4) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.B, f10);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new r(this, 4));
            this.C.addListener(new org.telegram.ui.ActionBar.a1(this, f10, 2));
            this.C.setInterpolator(mr.h);
            this.C.setDuration(420L);
            this.C.start();
            return;
        }
        this.B = f10;
        invalidate();
    }

    public final void c(org.telegram.tgnet.TLRPC.User r21, org.telegram.tgnet.TLRPC.Chat r22, org.telegram.tgnet.TLRPC.Reaction r23, boolean r24, long r25, org.telegram.tgnet.tl.TL_stories.StoryItem r27, boolean r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.m6.c(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$Reaction, boolean, long, org.telegram.tgnet.tl.TL_stories$StoryItem, boolean, boolean, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        float f10;
        if (this.B < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (this.B * 255.0f), 31);
            z4 = true;
        } else {
            z4 = false;
        }
        super.dispatchDraw(canvas);
        if (this.f21362a) {
            if (this.f21369w == 1) {
                f10 = 73.0f;
            } else {
                f10 = 55.0f;
            }
            float dp = AndroidUtilities.dp(f10);
            boolean z10 = LocaleController.isRTL;
            org.telegram.ui.ActionBar.f6 f6Var = this.v;
            if (z10) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.T0("paintDivider", f6Var));
            } else {
                canvas.drawLine(dp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.T0("paintDivider", f6Var));
            }
        }
        if (z4) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.B;
    }

    public org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        return this.v;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21368s.f26889a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21368s.f26889a.b();
        this.f21371y.g();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f21369w == 0) {
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
        int i10 = this.f21363b;
        TLRPC.Chat chat = null;
        if (peerId > 0) {
            user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerId));
        } else {
            user = null;
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerId));
        }
        c(user, chat, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    public void b(long j10) {
    }
}
