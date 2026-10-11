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
import org.telegram.ui.Components.dq;
public final class y extends FrameLayout {
    public final org.telegram.ui.ActionBar.h5 f23739a;
    public final org.telegram.ui.Components.y9 f23740b;
    public final Switch f23741c;
    public final dq d;
    public final View f23742e;
    public TLRPC.TL_availableReaction f23743f;
    public final boolean h;
    public boolean f23744n;

    public y(Context context, boolean z10, boolean z11) {
        super(context);
        this.h = z11;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f23739a = h5Var;
        NotificationCenter.listenEmojiLoading(h5Var);
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        h5Var.setTextSize(16);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setMaxLines(1);
        h5Var.setMaxLines(1);
        h5Var.setGravity(16 | w7.x5.y());
        addView(h5Var, w7.x5.i(-2.0f, -2.0f, 8388627, 81.0f, 0.0f, 61.0f, 0.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f23740b = y9Var;
        y9Var.setAspectFit(true);
        y9Var.setLayerNum(1);
        addView(y9Var, w7.x5.i(32.0f, 32.0f, 8388627, 23.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            dq dqVar = new dq(context, 26, null);
            this.d = dqVar;
            dqVar.setDrawUnchecked(false);
            dqVar.b(-1, -1, org.telegram.ui.ActionBar.h6.f20859h7);
            dqVar.setDrawBackgroundAsArc(-1);
            addView(dqVar, w7.x5.i(26.0f, 26.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        } else {
            Switch r14 = new Switch(context, null);
            this.f23741c = r14;
            r14.d(org.telegram.ui.ActionBar.h6.M6, org.telegram.ui.ActionBar.h6.N6, org.telegram.ui.ActionBar.h6.Q6, org.telegram.ui.ActionBar.h6.R6);
            addView(r14, w7.x5.i(37.0f, 20.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        }
        View view = new View(context);
        this.f23742e = view;
        view.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
        addView(view, w7.x5.d(-1.0f, -1));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_availableReaction tL_availableReaction, boolean z10, int i10) {
        boolean z11;
        TLRPC.TL_availableReaction tL_availableReaction2 = this.f23743f;
        boolean z12 = true;
        if (tL_availableReaction2 != null && tL_availableReaction.reaction.equals(tL_availableReaction2.reaction)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f23743f = tL_availableReaction;
        String str = tL_availableReaction.title;
        org.telegram.ui.ActionBar.h5 h5Var = this.f23739a;
        h5Var.l(Emoji.replaceEmoji(str, h5Var.getPaint().getFontMetricsInt(), false), false);
        this.f23740b.i(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "30_30_pcache", "tgs", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.h6.f20730a7, 1.0f), tL_availableReaction);
        if (!this.h || !tL_availableReaction.premium || UserConfig.getInstance(i10).isPremium()) {
            z12 = false;
        }
        this.f23744n = z12;
        if (z12) {
            Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Uh, false), PorterDuff.Mode.MULTIPLY));
            h5Var.i(drawable);
        } else {
            h5Var.i(null);
        }
        Switch r02 = this.f23741c;
        if (r02 != null) {
            r02.c(z10, z11);
        }
        dq dqVar = this.d;
        if (dqVar != null) {
            dqVar.a(z10, z11);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = 0;
        canvas.drawColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false));
        float strokeWidth = org.telegram.ui.ActionBar.h6.f20908k0.getStrokeWidth();
        int dp = AndroidUtilities.dp(81.0f);
        if (!LocaleController.isRTL) {
            i10 = dp;
            dp = 0;
        }
        canvas.drawLine(getPaddingLeft() + i10, getHeight() - strokeWidth, (getWidth() - getPaddingRight()) - dp, getHeight() - strokeWidth, org.telegram.ui.ActionBar.h6.f20908k0);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(true);
        boolean z10 = false;
        dq dqVar = this.d;
        Switch r32 = this.f23741c;
        if (r32 != null) {
            accessibilityNodeInfo.setCheckable(true);
            if (r32 != null) {
                z10 = r32.h;
            } else if (dqVar != null) {
                z10 = dqVar.f25656a.f24089q;
            }
            accessibilityNodeInfo.setChecked(z10);
            accessibilityNodeInfo.setClassName("android.widget.Switch");
        } else {
            if (r32 != null) {
                z10 = r32.h;
            } else if (dqVar != null) {
                z10 = dqVar.f25656a.f24089q;
            }
            if (z10) {
                accessibilityNodeInfo.setSelected(true);
            }
        }
        accessibilityNodeInfo.setContentDescription(this.f23739a.getText());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (org.telegram.ui.ActionBar.h6.f20908k0.getStrokeWidth() + AndroidUtilities.dp(58.0f)), 1073741824));
    }

    public void setChecked(boolean z10) {
        Switch r12 = this.f23741c;
        if (r12 != null) {
            r12.c(z10, false);
        }
        dq dqVar = this.d;
        if (dqVar != null) {
            dqVar.a(z10, false);
        }
    }
}
