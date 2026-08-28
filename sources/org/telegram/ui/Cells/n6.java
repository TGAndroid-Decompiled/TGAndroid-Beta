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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.sv0;
public class n6 extends FrameLayout {
    public static final hb0 C;
    public static final hb0 D;
    public static final hb0 E;
    public static final hb0 F;
    public float A;
    public ValueAnimator B;
    public boolean f24761a;
    public final int f24762b;
    public final m6 f24763c;
    public final dg.c d;
    public final org.telegram.ui.ActionBar.h5 f24764e;
    public final org.telegram.ui.Components.o9 f24765f;
    public final org.telegram.ui.Components.o9 h;
    public int f24766n;
    public final org.telegram.ui.Components.z8 f24767r;
    public final sv0 f24768s;
    public final org.telegram.ui.ActionBar.b6 v;
    public final int f24769w;
    public long f24770x;
    public final l6 f24771y;

    static {
        int i9 = R.drawable.msg_mini_checks;
        int i10 = org.telegram.ui.ActionBar.f6.f23369y6;
        C = new hb0(i9, i10);
        hb0 hb0Var = new hb0(R.drawable.msg_reactions, i10);
        hb0Var.f29031g = 16;
        hb0Var.h = 16;
        hb0Var.f29032i = 5.66f;
        D = hb0Var;
        int i11 = R.drawable.mini_repost_story;
        int i12 = org.telegram.ui.ActionBar.f6.hk;
        E = new hb0(i11, i12);
        F = new hb0(R.drawable.mini_forward_story, i12);
    }

    public n6(int i9, int i10, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, boolean z11) {
        super(context);
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        this.f24767r = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        this.A = 1.0f;
        this.f24769w = i9;
        this.f24762b = i10;
        this.v = b6Var;
        this.f24771y = new l6(this, b6Var);
        setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(50.0f)));
        if (i9 == 1) {
            i11 = 48;
        } else {
            i11 = 34;
        }
        m6 m6Var = new m6(this, context, i9);
        this.f24763c = m6Var;
        float f14 = i11;
        m6Var.setRoundRadius(AndroidUtilities.dp(f14));
        addView(m6Var, g7.e6.i(f14, f14, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i9 == 1) {
            setClipChildren(false);
        }
        dg.c cVar = new dg.c(context, 3);
        this.d = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextSize(16);
        cVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var));
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
        if (i9 == 1) {
            f11 = 7.66f;
        } else {
            f11 = 5.33f;
        }
        if (i9 == 1) {
            f12 = 73.0f;
        } else {
            f12 = 55.0f;
        }
        addView(cVar, g7.e6.i(-1.0f, -2.0f, 55, f12, f11, 12.0f, 0.0f));
        sv0 sv0Var = new sv0(this);
        this.f24768s = sv0Var;
        cVar.setDrawablePadding(AndroidUtilities.dp(3.0f));
        cVar.i(sv0Var.f32559a);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24764e = h5Var;
        h5Var.setTextSize(13);
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23369y6, b6Var));
        h5Var.setEllipsizeByGradient(true);
        h5Var.setImportantForAccessibility(2);
        h5Var.setTranslationX(LocaleController.isRTL ? AndroidUtilities.dp(30.0f) : 0.0f);
        if (i9 == 1) {
            f13 = 24.0f;
        } else {
            f13 = 19.0f;
        }
        addView(h5Var, g7.e6.i(-1.0f, -2.0f, 55, f12, f13, 20.0f, 0.0f));
        if (z11) {
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
            this.f24765f = o9Var;
            addView(o9Var, g7.e6.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.o9 o9Var2 = new org.telegram.ui.Components.o9(context);
            this.h = o9Var2;
            addView(o9Var2, g7.e6.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z10) {
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
            addView(view, g7.e6.c(-1.0f, -1));
        }
    }

    public final void a(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B = null;
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.A, f10);
            this.B = ofFloat;
            ofFloat.addUpdateListener(new r(this, 4));
            this.B.addListener(new org.telegram.ui.ActionBar.a1(this, f10, 2));
            this.B.setInterpolator(gr.h);
            this.B.setDuration(420L);
            this.B.start();
            return;
        }
        this.A = f10;
        invalidate();
    }

    public final void c(org.telegram.tgnet.TLRPC.User r21, org.telegram.tgnet.TLRPC.Chat r22, org.telegram.tgnet.TLRPC.Reaction r23, boolean r24, long r25, org.telegram.tgnet.tl.TL_stories.StoryItem r27, boolean r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n6.c(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$Reaction, boolean, long, org.telegram.tgnet.tl.TL_stories$StoryItem, boolean, boolean, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f10;
        if (this.A < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (this.A * 255.0f), 31);
            z10 = true;
        } else {
            z10 = false;
        }
        super.dispatchDraw(canvas);
        if (this.f24761a) {
            if (this.f24769w == 1) {
                f10 = 73.0f;
            } else {
                f10 = 55.0f;
            }
            float dp = AndroidUtilities.dp(f10);
            boolean z11 = LocaleController.isRTL;
            org.telegram.ui.ActionBar.b6 b6Var = this.v;
            if (z11) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.T0("paintDivider", b6Var));
            } else {
                canvas.drawLine(dp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.T0("paintDivider", b6Var));
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.A;
    }

    public org.telegram.ui.ActionBar.b6 getResourcesProvider() {
        return this.v;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24768s.f32559a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24768s.f32559a.b();
        this.f24771y.g();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        if (this.f24769w == 0) {
            i11 = 50;
        } else {
            i11 = 58;
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i11), 1073741824));
    }

    public void setUserReaction(TLRPC.MessagePeerReaction messagePeerReaction) {
        TLRPC.User user;
        if (messagePeerReaction == null) {
            return;
        }
        long peerId = MessageObject.getPeerId(messagePeerReaction.peer_id);
        int i9 = this.f24762b;
        TLRPC.Chat chat = null;
        if (peerId > 0) {
            user = MessagesController.getInstance(i9).getUser(Long.valueOf(peerId));
        } else {
            user = null;
            chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-peerId));
        }
        c(user, chat, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    public void b(long j10) {
    }
}
