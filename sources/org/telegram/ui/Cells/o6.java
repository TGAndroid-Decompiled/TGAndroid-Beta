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
import org.telegram.ui.Components.ix0;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.zr;
public class o6 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final uc0 H;
    public static final uc0 I;
    public static final uc0 J;
    public static final uc0 K;
    public final m6 E;
    public float F;
    public ValueAnimator G;
    public boolean f22844a;
    public final int f22845b;
    public final n6 f22846c;
    public final ci.k4 d;
    public final org.telegram.ui.ActionBar.n5 e;
    public final org.telegram.ui.Components.u9 f22847f;
    public final org.telegram.ui.Components.u9 h;
    public int f22848n;
    public final org.telegram.ui.Components.f9 f22849r;
    public final View f22850s;
    public final ix0 v;
    public final org.telegram.ui.ActionBar.g6 f22851w;
    public final int f22852x;
    public long f22853y;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.k6.f21572y6;
        H = new uc0(i10, i11);
        uc0 uc0Var = new uc0(R.drawable.msg_reactions, i11);
        uc0Var.f31095g = 16;
        uc0Var.h = 16;
        uc0Var.f31096i = 5.66f;
        I = uc0Var;
        int i12 = R.drawable.mini_repost_story;
        int i13 = org.telegram.ui.ActionBar.k6.hk;
        J = new uc0(i12, i13);
        K = new uc0(R.drawable.mini_forward_story, i13);
    }

    public o6(int i10, int i11, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, boolean z11) {
        super(context);
        int i12;
        float f7;
        float f10;
        float f11;
        float f12;
        this.f22849r = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
        this.F = 1.0f;
        this.f22852x = i10;
        this.f22845b = i11;
        this.f22851w = g6Var;
        this.E = new m6(this, g6Var);
        setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(50.0f)));
        if (i10 == 1) {
            i12 = 48;
        } else {
            i12 = 34;
        }
        n6 n6Var = new n6(this, context, i10);
        this.f22846c = n6Var;
        float f13 = i12;
        n6Var.setRoundRadius(AndroidUtilities.dp(f13));
        addView(n6Var, w7.z5.i(f13, f13, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 1) {
            setClipChildren(false);
        }
        ci.k4 k4Var = new ci.k4(context, 2);
        this.d = k4Var;
        NotificationCenter.listenEmojiLoading(k4Var);
        k4Var.setTextSize(16);
        org.telegram.ui.ActionBar.r6.Z(k4Var, org.telegram.ui.ActionBar.k6.E8, g6Var);
        k4Var.setEllipsizeByGradient(true);
        k4Var.setImportantForAccessibility(2);
        k4Var.setRightPadding(AndroidUtilities.dp(30.0f));
        if (LocaleController.isRTL) {
            f7 = AndroidUtilities.dp(30.0f);
        } else {
            f7 = 0.0f;
        }
        k4Var.setTranslationX(f7);
        k4Var.setRightDrawableOutside(true);
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
        addView(k4Var, w7.z5.i(-1.0f, -2.0f, 55, f15, f14, 12.0f, 0.0f));
        ix0 ix0Var = new ix0(this);
        this.v = ix0Var;
        k4Var.setDrawablePadding(AndroidUtilities.dp(3.0f));
        k4Var.i(ix0Var.f27510a);
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.e = n5Var;
        n5Var.setTextSize(13);
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.f21572y6, g6Var);
        n5Var.setEllipsizeByGradient(true);
        n5Var.setImportantForAccessibility(2);
        n5Var.setTranslationX(LocaleController.isRTL ? AndroidUtilities.dp(30.0f) : 0.0f);
        if (i10 == 1) {
            f12 = 24.0f;
        } else {
            f12 = 19.0f;
        }
        addView(n5Var, w7.z5.i(-1.0f, -2.0f, 55, f15, f12, 20.0f, 0.0f));
        if (z11) {
            org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
            this.f22847f = u9Var;
            addView(u9Var, w7.z5.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.u9 u9Var2 = new org.telegram.ui.Components.u9(context);
            this.h = u9Var2;
            addView(u9Var2, w7.z5.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z10) {
            View view = new View(context);
            this.f22850s = view;
            view.setBackground(org.telegram.ui.ActionBar.k6.M0(false));
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
            this.G.setInterpolator(zr.h);
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
        if (this.f22844a) {
            if (this.f22852x == 1) {
                f7 = 73.0f;
            } else {
                f7 = 55.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            boolean z11 = LocaleController.isRTL;
            org.telegram.ui.ActionBar.g6 g6Var = this.f22851w;
            if (z11) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.V0("paintDivider", g6Var));
            } else {
                canvas.drawLine(dp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.V0("paintDivider", g6Var));
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.F;
    }

    public org.telegram.ui.ActionBar.g6 getResourcesProvider() {
        return this.f22851w;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v.f27510a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v.f27510a.b();
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
        if (this.f22852x == 0) {
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
        int i11 = this.f22845b;
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
        ix0 ix0Var = this.v;
        if (ix0Var != null) {
            try {
                org.telegram.ui.Components.n5 n5Var = ix0Var.f27510a;
                if (n5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && n5Var.F != null) {
                    if (this.f22852x == 1) {
                        i10 = org.telegram.ui.ActionBar.k6.G6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f21592z9;
                    }
                    n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i10, this.f22851w)));
                    ci.k4 k4Var = this.d;
                    if (k4Var != null) {
                        k4Var.invalidate();
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
