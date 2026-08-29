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
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.wb0;
public class l6 extends FrameLayout {
    public static final wb0 C;
    public static final wb0 D;
    public static final wb0 E;
    public static final wb0 F;
    public float A;
    public ValueAnimator B;
    public boolean f24638a;
    public final int f24639b;
    public final k6 f24640c;
    public final gg.c d;
    public final org.telegram.ui.ActionBar.h5 f24641e;
    public final org.telegram.ui.Components.t9 f24642f;
    public final org.telegram.ui.Components.t9 h;
    public int f24643n;
    public final org.telegram.ui.Components.e9 f24644r;
    public final cw0 f24645s;
    public final org.telegram.ui.ActionBar.c6 v;
    public final int f24646w;
    public long f24647x;
    public final j6 f24648y;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.g6.f23433y6;
        C = new wb0(i10, i11);
        wb0 wb0Var = new wb0(R.drawable.msg_reactions, i11);
        wb0Var.f34368g = 16;
        wb0Var.h = 16;
        wb0Var.f34369i = 5.66f;
        D = wb0Var;
        int i12 = R.drawable.mini_repost_story;
        int i13 = org.telegram.ui.ActionBar.g6.hk;
        E = new wb0(i12, i13);
        F = new wb0(R.drawable.mini_forward_story, i13);
    }

    public l6(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context);
        int i12;
        float f9;
        float f10;
        float f11;
        float f12;
        this.f24644r = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        this.A = 1.0f;
        this.f24646w = i10;
        this.f24639b = i11;
        this.v = c6Var;
        this.f24648y = new j6(this, c6Var);
        setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(50.0f)));
        if (i10 == 1) {
            i12 = 48;
        } else {
            i12 = 34;
        }
        k6 k6Var = new k6(this, context, i10);
        this.f24640c = k6Var;
        float f13 = i12;
        k6Var.setRoundRadius(AndroidUtilities.dp(f13));
        addView(k6Var, i7.f6.i(f13, f13, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 1) {
            setClipChildren(false);
        }
        gg.c cVar = new gg.c(context, 3);
        this.d = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextSize(16);
        cVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var));
        cVar.setEllipsizeByGradient(true);
        cVar.setImportantForAccessibility(2);
        cVar.setRightPadding(AndroidUtilities.dp(30.0f));
        if (LocaleController.isRTL) {
            f9 = AndroidUtilities.dp(30.0f);
        } else {
            f9 = 0.0f;
        }
        cVar.setTranslationX(f9);
        cVar.setRightDrawableOutside(true);
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
        addView(cVar, i7.f6.i(-1.0f, -2.0f, 55, f11, f10, 12.0f, 0.0f));
        cw0 cw0Var = new cw0(this);
        this.f24645s = cw0Var;
        cVar.setDrawablePadding(AndroidUtilities.dp(3.0f));
        cVar.i(cw0Var.f27580a);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24641e = h5Var;
        h5Var.setTextSize(13);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23433y6, c6Var));
        h5Var.setEllipsizeByGradient(true);
        h5Var.setImportantForAccessibility(2);
        h5Var.setTranslationX(LocaleController.isRTL ? AndroidUtilities.dp(30.0f) : 0.0f);
        if (i10 == 1) {
            f12 = 24.0f;
        } else {
            f12 = 19.0f;
        }
        addView(h5Var, i7.f6.i(-1.0f, -2.0f, 55, f11, f12, 20.0f, 0.0f));
        if (z11) {
            org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
            this.f24642f = t9Var;
            addView(t9Var, i7.f6.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.t9 t9Var2 = new org.telegram.ui.Components.t9(context);
            this.h = t9Var2;
            addView(t9Var2, i7.f6.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z10) {
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            addView(view, i7.f6.c(-1.0f, -1));
        }
    }

    public final void a(float f9, boolean z10) {
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B = null;
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.A, f9);
            this.B = ofFloat;
            ofFloat.addUpdateListener(new r(this, 4));
            this.B.addListener(new org.telegram.ui.ActionBar.a1(this, f9, 2));
            this.B.setInterpolator(jr.h);
            this.B.setDuration(420L);
            this.B.start();
            return;
        }
        this.A = f9;
        invalidate();
    }

    public final void c(org.telegram.tgnet.TLRPC.User r21, org.telegram.tgnet.TLRPC.Chat r22, org.telegram.tgnet.TLRPC.Reaction r23, boolean r24, long r25, org.telegram.tgnet.tl.TL_stories.StoryItem r27, boolean r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l6.c(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$Reaction, boolean, long, org.telegram.tgnet.tl.TL_stories$StoryItem, boolean, boolean, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f9;
        if (this.A < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (this.A * 255.0f), 31);
            z10 = true;
        } else {
            z10 = false;
        }
        super.dispatchDraw(canvas);
        if (this.f24638a) {
            if (this.f24646w == 1) {
                f9 = 73.0f;
            } else {
                f9 = 55.0f;
            }
            float dp = AndroidUtilities.dp(f9);
            boolean z11 = LocaleController.isRTL;
            org.telegram.ui.ActionBar.c6 c6Var = this.v;
            if (z11) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.T0("paintDivider", c6Var));
            } else {
                canvas.drawLine(dp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.T0("paintDivider", c6Var));
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.A;
    }

    public org.telegram.ui.ActionBar.c6 getResourcesProvider() {
        return this.v;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24645s.f27580a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24645s.f27580a.b();
        this.f24648y.g();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f24646w == 0) {
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
        int i10 = this.f24639b;
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
