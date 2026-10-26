package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.sc0;
public class s6 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public static final sc0 H;
    public static final sc0 I;
    public static final sc0 J;
    public static final sc0 K;
    public final q6 E;
    public float F;
    public ValueAnimator G;
    public boolean f25392a;
    public final int f25393b;
    public final r6 f25394c;
    public final di.l4 d;
    public final org.telegram.ui.ActionBar.b6 e;
    public final org.telegram.ui.Components.y9 f25395f;
    public final org.telegram.ui.Components.y9 h;
    public int f25396n;
    public final org.telegram.ui.Components.j9 f25397r;
    public final View f25398s;
    public final qx0 v;
    public final org.telegram.ui.ActionBar.u6 f25399w;
    public final int f25400x;
    public long f25401y;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.y6.f23748y6;
        H = new sc0(i10, i11);
        sc0 sc0Var = new sc0(R.drawable.msg_reactions, i11);
        sc0Var.f32516g = 16;
        sc0Var.h = 16;
        sc0Var.f32517i = 5.66f;
        I = sc0Var;
        int i12 = R.drawable.mini_repost_story;
        int i13 = org.telegram.ui.ActionBar.y6.hk;
        J = new sc0(i12, i13);
        K = new sc0(R.drawable.mini_forward_story, i13);
    }

    public s6(int i10, int i11, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, boolean z11) {
        super(context);
        int i12;
        float f7;
        float f10;
        float f11;
        float f12;
        this.f25397r = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        this.F = 1.0f;
        this.f25400x = i10;
        this.f25393b = i11;
        this.f25399w = u6Var;
        this.E = new q6(this, u6Var);
        setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(50.0f)));
        if (i10 == 1) {
            i12 = 48;
        } else {
            i12 = 34;
        }
        r6 r6Var = new r6(this, context, i10);
        this.f25394c = r6Var;
        float f13 = i12;
        r6Var.setRoundRadius(AndroidUtilities.dp(f13));
        addView(r6Var, gb1.m(f13, f13, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 1) {
            setClipChildren(false);
        }
        di.l4 l4Var = new di.l4(context, 2);
        this.d = l4Var;
        NotificationCenter.listenEmojiLoading(l4Var);
        l4Var.setTextSize(16);
        org.telegram.ui.ActionBar.f7.Y(l4Var, org.telegram.ui.ActionBar.y6.E8, u6Var);
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
        addView(l4Var, gb1.m(-1.0f, -2.0f, 55, f15, f14, 12.0f, 0.0f));
        qx0 qx0Var = new qx0(this);
        this.v = qx0Var;
        l4Var.setDrawablePadding(AndroidUtilities.dp(3.0f));
        l4Var.i(qx0Var.f32057a);
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.e = b6Var;
        b6Var.setTextSize(13);
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.f23748y6, u6Var);
        b6Var.setEllipsizeByGradient(true);
        b6Var.setImportantForAccessibility(2);
        b6Var.setTranslationX(LocaleController.isRTL ? AndroidUtilities.dp(30.0f) : 0.0f);
        if (i10 == 1) {
            f12 = 24.0f;
        } else {
            f12 = 19.0f;
        }
        addView(b6Var, gb1.m(-1.0f, -2.0f, 55, f15, f12, 20.0f, 0.0f));
        if (z11) {
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
            this.f25395f = y9Var;
            addView(y9Var, gb1.m(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
            this.h = y9Var2;
            addView(y9Var2, gb1.m(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z10) {
            View view = new View(context);
            this.f25398s = view;
            view.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
            addView(view, gb1.g(-1.0f, -1));
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
            ofFloat.addUpdateListener(new r(this, 5));
            this.G.addListener(new org.telegram.ui.ActionBar.a1(this, f7, 2));
            this.G.setInterpolator(ds.h);
            this.G.setDuration(420L);
            this.G.start();
            return;
        }
        this.F = f7;
        invalidate();
    }

    public final void c(org.telegram.tgnet.TLRPC.User r21, org.telegram.tgnet.TLRPC.Chat r22, org.telegram.tgnet.TLRPC.Reaction r23, boolean r24, long r25, org.telegram.tgnet.tl.TL_stories.StoryItem r27, boolean r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s6.c(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$Reaction, boolean, long, org.telegram.tgnet.tl.TL_stories$StoryItem, boolean, boolean, boolean):void");
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
        if (this.f25392a) {
            if (this.f25400x == 1) {
                f7 = 73.0f;
            } else {
                f7 = 55.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            boolean z11 = LocaleController.isRTL;
            org.telegram.ui.ActionBar.u6 u6Var = this.f25399w;
            if (z11) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.V0("paintDivider", u6Var));
            } else {
                canvas.drawLine(dp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.V0("paintDivider", u6Var));
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.F;
    }

    public org.telegram.ui.ActionBar.u6 getResourcesProvider() {
        return this.f25399w;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v.f32057a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v.f32057a.b();
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
        if (this.f25400x == 0) {
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
        int i11 = this.f25393b;
        TLRPC.Chat chat = null;
        if (i10 > 0) {
            user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
        } else {
            user = null;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
        }
        c(user, chat, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    @Override
    public final void updateColors() {
        boolean z10;
        int i10;
        qx0 qx0Var = this.v;
        if (qx0Var != null) {
            try {
                org.telegram.ui.Components.r5 r5Var = qx0Var.f32057a;
                if (r5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && r5Var.F != null) {
                    if (this.f25400x == 1) {
                        i10 = org.telegram.ui.ActionBar.y6.G6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.y6.f23770z9;
                    }
                    r5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(i10, this.f25399w)));
                    di.l4 l4Var = this.d;
                    if (l4Var != null) {
                        l4Var.invalidate();
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(long j10) {
    }
}
