package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.xp;
public final class x extends FrameLayout {
    public final org.telegram.ui.ActionBar.n5 f23935a;
    public final org.telegram.ui.Components.w9 f23936b;
    public final Switch f23937c;
    public final xp d;
    public final View e;
    public TLRPC.TL_availableReaction f23938f;
    public final boolean h;
    public boolean f23939n;

    public x(Context context, boolean z10, boolean z11) {
        super(context);
        this.h = z11;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f23935a = n5Var;
        NotificationCenter.listenEmojiLoading(n5Var);
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.G6, null);
        n5Var.setTextSize(16);
        n5Var.setTypeface(AndroidUtilities.bold());
        n5Var.setMaxLines(1);
        n5Var.setMaxLines(1);
        n5Var.setGravity(16 | w7.z5.y());
        addView(n5Var, w7.z5.i(-2.0f, -2.0f, 8388627, 81.0f, 0.0f, 61.0f, 0.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f23936b = w9Var;
        w9Var.setAspectFit(true);
        w9Var.setLayerNum(1);
        addView(w9Var, w7.z5.i(32.0f, 32.0f, 8388627, 23.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            xp xpVar = new xp(context, 26, null);
            this.d = xpVar;
            xpVar.setDrawUnchecked(false);
            xpVar.b(-1, -1, org.telegram.ui.ActionBar.k6.f21256h7);
            xpVar.setDrawBackgroundAsArc(-1);
            addView(xpVar, w7.z5.i(26.0f, 26.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        } else {
            Switch r14 = new Switch(context, null);
            this.f23937c = r14;
            r14.d(org.telegram.ui.ActionBar.k6.M6, org.telegram.ui.ActionBar.k6.N6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
            addView(r14, w7.z5.i(37.0f, 20.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        }
        View view = new View(context);
        this.e = view;
        view.setBackground(org.telegram.ui.ActionBar.k6.M0(false));
        addView(view, w7.z5.c(-1.0f, -1));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_availableReaction tL_availableReaction, boolean z10, int i10) {
        boolean z11;
        TLRPC.TL_availableReaction tL_availableReaction2 = this.f23938f;
        boolean z12 = true;
        if (tL_availableReaction2 != null && tL_availableReaction.reaction.equals(tL_availableReaction2.reaction)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23938f = tL_availableReaction;
        String str = tL_availableReaction.title;
        org.telegram.ui.ActionBar.n5 n5Var = this.f23935a;
        n5Var.l(Emoji.replaceEmoji(str, n5Var.getPaint().getFontMetricsInt(), false), false);
        this.f23936b.i(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "30_30_pcache", "tgs", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.k6.f21125a7, 1.0f), tL_availableReaction);
        if (!this.h || !tL_availableReaction.premium || UserConfig.getInstance(i10).isPremium()) {
            z12 = false;
        }
        this.f23939n = z12;
        if (z12) {
            Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
            org.telegram.ui.ActionBar.r6.z(this, drawable, org.telegram.ui.ActionBar.k6.Uh, null, PorterDuff.Mode.MULTIPLY);
            n5Var.i(drawable);
        } else {
            n5Var.i(null);
        }
        Switch r02 = this.f23937c;
        if (r02 != null) {
            r02.c(z10, z11);
        }
        xp xpVar = this.d;
        if (xpVar != null) {
            xpVar.a(z10, z11);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = 0;
        canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false));
        float strokeWidth = org.telegram.ui.ActionBar.k6.f21304k0.getStrokeWidth();
        int dp = AndroidUtilities.dp(81.0f);
        if (!LocaleController.isRTL) {
            i10 = dp;
            dp = 0;
        }
        canvas.drawLine(getPaddingLeft() + i10, getHeight() - strokeWidth, (getWidth() - getPaddingRight()) - dp, getHeight() - strokeWidth, org.telegram.ui.ActionBar.k6.f21304k0);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(true);
        boolean z10 = false;
        xp xpVar = this.d;
        Switch r32 = this.f23937c;
        if (r32 != null) {
            accessibilityNodeInfo.setCheckable(true);
            if (r32 != null) {
                z10 = r32.h;
            } else if (xpVar != null) {
                z10 = xpVar.f32618a.f24296q;
            }
            accessibilityNodeInfo.setChecked(z10);
            accessibilityNodeInfo.setClassName("android.widget.Switch");
        } else {
            if (r32 != null) {
                z10 = r32.h;
            } else if (xpVar != null) {
                z10 = xpVar.f32618a.f24296q;
            }
            if (z10) {
                accessibilityNodeInfo.setSelected(true);
            }
        }
        accessibilityNodeInfo.setContentDescription(this.f23935a.getText());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (org.telegram.ui.ActionBar.k6.f21304k0.getStrokeWidth() + AndroidUtilities.dp(58.0f)), 1073741824));
    }

    public void setChecked(boolean z10) {
        Switch r12 = this.f23937c;
        if (r12 != null) {
            r12.c(z10, false);
        }
        xp xpVar = this.d;
        if (xpVar != null) {
            xpVar.a(z10, false);
        }
    }
}
