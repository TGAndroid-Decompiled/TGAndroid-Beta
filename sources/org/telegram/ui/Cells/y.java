package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.ui.Components.tp;
public final class y extends FrameLayout {
    public final org.telegram.ui.ActionBar.l5 f20736a;
    public final org.telegram.ui.Components.w9 f20737b;
    public final Switch f20738c;
    public final tp d;
    public TLRPC.TL_availableReaction e;
    public final boolean f20739f;
    public boolean h;

    public y(Context context, boolean z10, boolean z11) {
        super(context);
        this.f20739f = z11;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f20736a = l5Var;
        NotificationCenter.listenEmojiLoading(l5Var);
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        l5Var.setTextSize(16);
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setMaxLines(1);
        l5Var.setMaxLines(1);
        l5Var.setGravity(16 | w7.a6.y());
        addView(l5Var, w7.a6.i(-2.0f, -2.0f, 8388627, 81.0f, 0.0f, 61.0f, 0.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f20737b = w9Var;
        w9Var.setAspectFit(true);
        w9Var.setLayerNum(1);
        addView(w9Var, w7.a6.i(32.0f, 32.0f, 8388627, 23.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            tp tpVar = new tp(context, 26, null);
            this.d = tpVar;
            tpVar.setDrawUnchecked(false);
            tpVar.b(-1, -1, org.telegram.ui.ActionBar.j6.f18000h7);
            tpVar.setDrawBackgroundAsArc(-1);
            addView(tpVar, w7.a6.i(26.0f, 26.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        } else {
            Switch r14 = new Switch(context, null);
            this.f20738c = r14;
            r14.d(org.telegram.ui.ActionBar.j6.M6, org.telegram.ui.ActionBar.j6.N6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
            addView(r14, w7.a6.i(37.0f, 20.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        }
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
        addView(view, w7.a6.c(-1.0f, -1));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_availableReaction tL_availableReaction, boolean z10, int i10) {
        boolean z11;
        TLRPC.TL_availableReaction tL_availableReaction2 = this.e;
        boolean z12 = true;
        if (tL_availableReaction2 != null && tL_availableReaction.reaction.equals(tL_availableReaction2.reaction)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.e = tL_availableReaction;
        String str = tL_availableReaction.title;
        org.telegram.ui.ActionBar.l5 l5Var = this.f20736a;
        l5Var.l(Emoji.replaceEmoji(str, l5Var.getPaint().getFontMetricsInt(), false), false);
        this.f20737b.i(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "30_30_pcache", "tgs", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.j6.f17872a7, 1.0f), tL_availableReaction);
        z12 = (this.f20739f && tL_availableReaction.premium && !UserConfig.getInstance(i10).isPremium()) ? false : false;
        this.h = z12;
        if (z12) {
            Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Uh, false), PorterDuff.Mode.MULTIPLY));
            l5Var.i(drawable);
        } else {
            l5Var.i(null);
        }
        Switch r02 = this.f20738c;
        if (r02 != null) {
            r02.c(z10, z11);
        }
        tp tpVar = this.d;
        if (tpVar != null) {
            tpVar.a(z10, z11);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = 0;
        canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
        float strokeWidth = org.telegram.ui.ActionBar.j6.f18049k0.getStrokeWidth();
        int dp = AndroidUtilities.dp(81.0f);
        if (!LocaleController.isRTL) {
            i10 = dp;
            dp = 0;
        }
        canvas.drawLine(getPaddingLeft() + i10, getHeight() - strokeWidth, (getWidth() - getPaddingRight()) - dp, getHeight() - strokeWidth, org.telegram.ui.ActionBar.j6.f18049k0);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(true);
        boolean z10 = false;
        tp tpVar = this.d;
        Switch r32 = this.f20738c;
        if (r32 != null) {
            accessibilityNodeInfo.setCheckable(true);
            if (r32 != null) {
                z10 = r32.h;
            } else if (tpVar != null) {
                z10 = tpVar.f27462a.f21057q;
            }
            accessibilityNodeInfo.setChecked(z10);
            accessibilityNodeInfo.setClassName("android.widget.Switch");
        } else {
            if (r32 != null) {
                z10 = r32.h;
            } else if (tpVar != null) {
                z10 = tpVar.f27462a.f21057q;
            }
            if (z10) {
                accessibilityNodeInfo.setSelected(true);
            }
        }
        accessibilityNodeInfo.setContentDescription(this.f20736a.getText());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (org.telegram.ui.ActionBar.j6.f18049k0.getStrokeWidth() + AndroidUtilities.dp(58.0f)), 1073741824));
    }

    public void setChecked(boolean z10) {
        Switch r12 = this.f20738c;
        if (r12 != null) {
            r12.c(z10, false);
        }
        tp tpVar = this.d;
        if (tpVar != null) {
            tpVar.a(z10, false);
        }
    }
}
