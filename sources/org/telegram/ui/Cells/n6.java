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
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.pr;
public class n6 extends FrameLayout {
    public static final dc0 D;
    public static final dc0 E;
    public static final dc0 F;
    public static final dc0 G;
    public float B;
    public ValueAnimator C;
    public boolean f23220a;
    public final int f23221b;
    public final m6 f23222c;
    public final jg.c d;
    public final org.telegram.ui.ActionBar.l5 f23223e;
    public final org.telegram.ui.Components.p9 f23224f;
    public final org.telegram.ui.Components.p9 h;
    public int f23225n;
    public final org.telegram.ui.Components.z8 f23226r;
    public final mw0 f23227s;
    public final org.telegram.ui.ActionBar.g6 v;
    public final int f23228w;
    public long f23229x;
    public final l6 f23230y;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.k6.f22036y6;
        D = new dc0(i10, i11);
        dc0 dc0Var = new dc0(R.drawable.msg_reactions, i11);
        dc0Var.f26254g = 16;
        dc0Var.h = 16;
        dc0Var.f26255i = 5.66f;
        E = dc0Var;
        int i12 = R.drawable.mini_repost_story;
        int i13 = org.telegram.ui.ActionBar.k6.hk;
        F = new dc0(i12, i13);
        G = new dc0(R.drawable.mini_forward_story, i13);
    }

    public n6(int i10, int i11, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, boolean z10) {
        super(context);
        int i12;
        float f10;
        float f11;
        float f12;
        float f13;
        this.f23226r = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        this.B = 1.0f;
        this.f23228w = i10;
        this.f23221b = i11;
        this.v = g6Var;
        this.f23230y = new l6(this, g6Var);
        setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(50.0f)));
        if (i10 == 1) {
            i12 = 48;
        } else {
            i12 = 34;
        }
        m6 m6Var = new m6(this, context, i10);
        this.f23222c = m6Var;
        float f14 = i12;
        m6Var.setRoundRadius(AndroidUtilities.dp(f14));
        addView(m6Var, k7.c6.i(f14, f14, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 1) {
            setClipChildren(false);
        }
        jg.c cVar = new jg.c(context, 3);
        this.d = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextSize(16);
        cVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, g6Var));
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
        addView(cVar, k7.c6.i(-1.0f, -2.0f, 55, f12, f11, 12.0f, 0.0f));
        mw0 mw0Var = new mw0(this);
        this.f23227s = mw0Var;
        cVar.setDrawablePadding(AndroidUtilities.dp(3.0f));
        cVar.i(mw0Var.f29258a);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f23223e = l5Var;
        l5Var.setTextSize(13);
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22036y6, g6Var));
        l5Var.setEllipsizeByGradient(true);
        l5Var.setImportantForAccessibility(2);
        l5Var.setTranslationX(LocaleController.isRTL ? AndroidUtilities.dp(30.0f) : 0.0f);
        if (i10 == 1) {
            f13 = 24.0f;
        } else {
            f13 = 19.0f;
        }
        addView(l5Var, k7.c6.i(-1.0f, -2.0f, 55, f12, f13, 20.0f, 0.0f));
        if (z10) {
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
            this.f23224f = p9Var;
            addView(p9Var, k7.c6.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context);
            this.h = p9Var2;
            addView(p9Var2, k7.c6.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z4) {
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
            addView(view, k7.c6.c(-1.0f, -1));
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
            this.C.setInterpolator(pr.h);
            this.C.setDuration(420L);
            this.C.start();
            return;
        }
        this.B = f10;
        invalidate();
    }

    public final void c(org.telegram.tgnet.TLRPC.User r21, org.telegram.tgnet.TLRPC.Chat r22, org.telegram.tgnet.TLRPC.Reaction r23, boolean r24, long r25, org.telegram.tgnet.tl.TL_stories.StoryItem r27, boolean r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n6.c(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$Reaction, boolean, long, org.telegram.tgnet.tl.TL_stories$StoryItem, boolean, boolean, boolean):void");
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
        if (this.f23220a) {
            if (this.f23228w == 1) {
                f10 = 73.0f;
            } else {
                f10 = 55.0f;
            }
            float dp = AndroidUtilities.dp(f10);
            boolean z10 = LocaleController.isRTL;
            org.telegram.ui.ActionBar.g6 g6Var = this.v;
            if (z10) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.T0("paintDivider", g6Var));
            } else {
                canvas.drawLine(dp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.T0("paintDivider", g6Var));
            }
        }
        if (z4) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.B;
    }

    public org.telegram.ui.ActionBar.g6 getResourcesProvider() {
        return this.v;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23227s.f29258a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23227s.f29258a.b();
        this.f23230y.g();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f23228w == 0) {
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
        int i10 = this.f23221b;
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
