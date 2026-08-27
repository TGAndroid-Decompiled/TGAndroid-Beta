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
import org.telegram.ui.Components.bp;

public final class y extends FrameLayout {

    public final org.telegram.ui.ActionBar.h5 f25967a;

    public final org.telegram.ui.Components.n9 f25968b;

    public final Switch f25969c;
    public final bp d;

    public TLRPC.TL_availableReaction f25970e;

    public final boolean f25971f;
    public boolean h;

    public y(Context context, boolean z10, boolean z11) {
        super(context);
        this.f25971f = z11;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f25967a = h5Var;
        NotificationCenter.listenEmojiLoading(h5Var);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        h5Var.setTextSize(16);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setMaxLines(1);
        h5Var.setMaxLines(1);
        h5Var.setGravity(16 | h7.z5.y());
        addView(h5Var, h7.z5.i(-2.0f, -2.0f, 8388627, 81.0f, 0.0f, 61.0f, 0.0f));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f25968b = n9Var;
        n9Var.setAspectFit(true);
        n9Var.setLayerNum(1);
        addView(n9Var, h7.z5.i(32.0f, 32.0f, 8388627, 23.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            bp bpVar = new bp(context, 26, null);
            this.d = bpVar;
            bpVar.setDrawUnchecked(false);
            bpVar.b(-1, -1, org.telegram.ui.ActionBar.g6.f23126h7);
            bpVar.setDrawBackgroundAsArc(-1);
            addView(bpVar, h7.z5.i(26.0f, 26.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        } else {
            Switch r14 = new Switch(context, null);
            this.f25969c = r14;
            r14.d(org.telegram.ui.ActionBar.g6.M6, org.telegram.ui.ActionBar.g6.N6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
            addView(r14, h7.z5.i(37.0f, 20.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        }
        View view = new View(context);
        view.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
        addView(view, h7.z5.c(-1.0f, -1));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_availableReaction tL_availableReaction, boolean z10, int i10) {
        TLRPC.TL_availableReaction tL_availableReaction2 = this.f25970e;
        boolean z11 = tL_availableReaction2 != null && tL_availableReaction.reaction.equals(tL_availableReaction2.reaction);
        this.f25970e = tL_availableReaction;
        String str = tL_availableReaction.title;
        org.telegram.ui.ActionBar.h5 h5Var = this.f25967a;
        h5Var.l(Emoji.replaceEmoji(str, h5Var.getPaint().getFontMetricsInt(), false), false);
        this.f25968b.i(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "30_30_pcache", "tgs", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.g6.f22999a7, 1.0f), tL_availableReaction);
        boolean z12 = this.f25971f && tL_availableReaction.premium && !UserConfig.getInstance(i10).isPremium();
        this.h = z12;
        if (z12) {
            Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Uh, false), PorterDuff.Mode.MULTIPLY));
            h5Var.i(drawable);
        } else {
            h5Var.i(null);
        }
        Switch r10 = this.f25969c;
        if (r10 != null) {
            r10.c(z10, z11);
        }
        bp bpVar = this.d;
        if (bpVar != null) {
            bpVar.a(z10, z11);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = 0;
        canvas.drawColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        float strokeWidth = org.telegram.ui.ActionBar.g6.f23175k0.getStrokeWidth();
        int iDp = AndroidUtilities.dp(81.0f);
        if (!LocaleController.isRTL) {
            i10 = iDp;
            iDp = 0;
        }
        canvas.drawLine(getPaddingLeft() + i10, getHeight() - strokeWidth, (getWidth() - getPaddingRight()) - iDp, getHeight() - strokeWidth, org.telegram.ui.ActionBar.g6.f23175k0);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(true);
        boolean z10 = false;
        bp bpVar = this.d;
        Switch r10 = this.f25969c;
        if (r10 != null) {
            accessibilityNodeInfo.setCheckable(true);
            if (r10 != null) {
                z10 = r10.h;
            } else if (bpVar != null) {
                z10 = bpVar.f27188a.f26309q;
            }
            accessibilityNodeInfo.setChecked(z10);
            accessibilityNodeInfo.setClassName("android.widget.Switch");
        } else {
            if (r10 != null) {
                z10 = r10.h;
            } else if (bpVar != null) {
                z10 = bpVar.f27188a.f26309q;
            }
            if (z10) {
                accessibilityNodeInfo.setSelected(true);
            }
        }
        accessibilityNodeInfo.setContentDescription(this.f25967a.getText());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (org.telegram.ui.ActionBar.g6.f23175k0.getStrokeWidth() + AndroidUtilities.dp(58.0f)), 1073741824));
    }

    public void setChecked(boolean z10) {
        Switch r10 = this.f25969c;
        if (r10 != null) {
            r10.c(z10, false);
        }
        bp bpVar = this.d;
        if (bpVar != null) {
            bpVar.a(z10, false);
        }
    }
}
