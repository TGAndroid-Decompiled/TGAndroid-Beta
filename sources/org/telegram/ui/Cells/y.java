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
import org.telegram.ui.Components.np;
public final class y extends FrameLayout {
    public final org.telegram.ui.ActionBar.l5 f24425a;
    public final org.telegram.ui.Components.p9 f24426b;
    public final Switch f24427c;
    public final np d;
    public TLRPC.TL_availableReaction f24428e;
    public final boolean f24429f;
    public boolean h;

    public y(Context context, boolean z4, boolean z10) {
        super(context);
        this.f24429f = z10;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f24425a = l5Var;
        NotificationCenter.listenEmojiLoading(l5Var);
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        l5Var.setTextSize(16);
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setMaxLines(1);
        l5Var.setMaxLines(1);
        l5Var.setGravity(16 | k7.c6.y());
        addView(l5Var, k7.c6.i(-2.0f, -2.0f, 8388627, 81.0f, 0.0f, 61.0f, 0.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f24426b = p9Var;
        p9Var.setAspectFit(true);
        p9Var.setLayerNum(1);
        addView(p9Var, k7.c6.i(32.0f, 32.0f, 8388627, 23.0f, 0.0f, 0.0f, 0.0f));
        if (z4) {
            np npVar = new np(context, 26, null);
            this.d = npVar;
            npVar.setDrawUnchecked(false);
            npVar.b(-1, -1, org.telegram.ui.ActionBar.k6.f21735h7);
            npVar.setDrawBackgroundAsArc(-1);
            addView(npVar, k7.c6.i(26.0f, 26.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        } else {
            Switch r14 = new Switch(context, null);
            this.f24427c = r14;
            r14.d(org.telegram.ui.ActionBar.k6.M6, org.telegram.ui.ActionBar.k6.N6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
            addView(r14, k7.c6.i(37.0f, 20.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        }
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
        addView(view, k7.c6.c(-1.0f, -1));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_availableReaction tL_availableReaction, boolean z4, int i10) {
        boolean z10;
        TLRPC.TL_availableReaction tL_availableReaction2 = this.f24428e;
        boolean z11 = true;
        if (tL_availableReaction2 != null && tL_availableReaction.reaction.equals(tL_availableReaction2.reaction)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24428e = tL_availableReaction;
        String str = tL_availableReaction.title;
        org.telegram.ui.ActionBar.l5 l5Var = this.f24425a;
        l5Var.l(Emoji.replaceEmoji(str, l5Var.getPaint().getFontMetricsInt(), false), false);
        this.f24426b.i(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "30_30_pcache", "tgs", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.k6.f21607a7, 1.0f), tL_availableReaction);
        z11 = (this.f24429f && tL_availableReaction.premium && !UserConfig.getInstance(i10).isPremium()) ? false : false;
        this.h = z11;
        if (z11) {
            Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Uh, false), PorterDuff.Mode.MULTIPLY));
            l5Var.i(drawable);
        } else {
            l5Var.i(null);
        }
        Switch r02 = this.f24427c;
        if (r02 != null) {
            r02.c(z4, z10);
        }
        np npVar = this.d;
        if (npVar != null) {
            npVar.a(z4, z10);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = 0;
        canvas.drawColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
        float strokeWidth = org.telegram.ui.ActionBar.k6.f21781k0.getStrokeWidth();
        int dp = AndroidUtilities.dp(81.0f);
        if (!LocaleController.isRTL) {
            i10 = dp;
            dp = 0;
        }
        canvas.drawLine(getPaddingLeft() + i10, getHeight() - strokeWidth, (getWidth() - getPaddingRight()) - dp, getHeight() - strokeWidth, org.telegram.ui.ActionBar.k6.f21781k0);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(true);
        boolean z4 = false;
        np npVar = this.d;
        Switch r32 = this.f24427c;
        if (r32 != null) {
            accessibilityNodeInfo.setCheckable(true);
            if (r32 != null) {
                z4 = r32.h;
            } else if (npVar != null) {
                z4 = npVar.f29560a.f24811q;
            }
            accessibilityNodeInfo.setChecked(z4);
            accessibilityNodeInfo.setClassName("android.widget.Switch");
        } else {
            if (r32 != null) {
                z4 = r32.h;
            } else if (npVar != null) {
                z4 = npVar.f29560a.f24811q;
            }
            if (z4) {
                accessibilityNodeInfo.setSelected(true);
            }
        }
        accessibilityNodeInfo.setContentDescription(this.f24425a.getText());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (org.telegram.ui.ActionBar.k6.f21781k0.getStrokeWidth() + AndroidUtilities.dp(58.0f)), 1073741824));
    }

    public void setChecked(boolean z4) {
        Switch r12 = this.f24427c;
        if (r12 != null) {
            r12.c(z4, false);
        }
        np npVar = this.d;
        if (npVar != null) {
            npVar.a(z4, false);
        }
    }
}
