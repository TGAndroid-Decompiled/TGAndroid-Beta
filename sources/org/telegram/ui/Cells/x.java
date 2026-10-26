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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.zp;
public final class x extends FrameLayout {
    public final org.telegram.ui.ActionBar.b6 f25676a;
    public final org.telegram.ui.Components.y9 f25677b;
    public final Switch f25678c;
    public final zp d;
    public final View e;
    public TLRPC.TL_availableReaction f25679f;
    public final boolean h;
    public boolean f25680n;

    public x(Context context, boolean z10, boolean z11) {
        super(context);
        this.h = z11;
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.f25676a = b6Var;
        NotificationCenter.listenEmojiLoading(b6Var);
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.G6, null);
        b6Var.setTextSize(16);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setMaxLines(1);
        b6Var.setMaxLines(1);
        b6Var.setGravity(16 | gb1.E());
        addView(b6Var, gb1.m(-2.0f, -2.0f, 8388627, 81.0f, 0.0f, 61.0f, 0.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f25677b = y9Var;
        y9Var.setAspectFit(true);
        y9Var.setLayerNum(1);
        addView(y9Var, gb1.m(32.0f, 32.0f, 8388627, 23.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            zp zpVar = new zp(context, 26, null);
            this.d = zpVar;
            zpVar.setDrawUnchecked(false);
            zpVar.b(-1, -1, org.telegram.ui.ActionBar.y6.f23429h7);
            zpVar.setDrawBackgroundAsArc(-1);
            addView(zpVar, gb1.m(26.0f, 26.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        } else {
            Switch r14 = new Switch(context, null);
            this.f25678c = r14;
            r14.d(org.telegram.ui.ActionBar.y6.M6, org.telegram.ui.ActionBar.y6.N6, org.telegram.ui.ActionBar.y6.Q6, org.telegram.ui.ActionBar.y6.R6);
            addView(r14, gb1.m(37.0f, 20.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        }
        View view = new View(context);
        this.e = view;
        view.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
        addView(view, gb1.g(-1.0f, -1));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_availableReaction tL_availableReaction, boolean z10, int i10) {
        boolean z11;
        TLRPC.TL_availableReaction tL_availableReaction2 = this.f25679f;
        boolean z12 = true;
        if (tL_availableReaction2 != null && tL_availableReaction.reaction.equals(tL_availableReaction2.reaction)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f25679f = tL_availableReaction;
        String str = tL_availableReaction.title;
        org.telegram.ui.ActionBar.b6 b6Var = this.f25676a;
        b6Var.l(Emoji.replaceEmoji(str, b6Var.getPaint().getFontMetricsInt(), false), false);
        this.f25677b.i(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "30_30_pcache", "tgs", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.y6.f23299a7, 1.0f), tL_availableReaction);
        if (!this.h || !tL_availableReaction.premium || UserConfig.getInstance(i10).isPremium()) {
            z12 = false;
        }
        this.f25680n = z12;
        if (z12) {
            Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
            org.telegram.ui.ActionBar.f7.y(this, drawable, org.telegram.ui.ActionBar.y6.Uh, null, PorterDuff.Mode.MULTIPLY);
            b6Var.i(drawable);
        } else {
            b6Var.i(null);
        }
        Switch r02 = this.f25678c;
        if (r02 != null) {
            r02.c(z10, z11);
        }
        zp zpVar = this.d;
        if (zpVar != null) {
            zpVar.a(z10, z11);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float strokeWidth = org.telegram.ui.ActionBar.y6.f23478k0.getStrokeWidth();
        int dp = AndroidUtilities.dp(81.0f);
        int i10 = 0;
        if (LocaleController.isRTL) {
            i10 = dp;
            dp = 0;
        }
        canvas.drawLine(getPaddingLeft() + dp, getHeight() - strokeWidth, (getWidth() - getPaddingRight()) - i10, getHeight() - strokeWidth, org.telegram.ui.ActionBar.y6.f23478k0);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(true);
        boolean z10 = false;
        zp zpVar = this.d;
        Switch r32 = this.f25678c;
        if (r32 != null) {
            accessibilityNodeInfo.setCheckable(true);
            if (r32 != null) {
                z10 = r32.h;
            } else if (zpVar != null) {
                z10 = zpVar.f35382a.f26089q;
            }
            accessibilityNodeInfo.setChecked(z10);
            accessibilityNodeInfo.setClassName("android.widget.Switch");
        } else {
            if (r32 != null) {
                z10 = r32.h;
            } else if (zpVar != null) {
                z10 = zpVar.f35382a.f26089q;
            }
            if (z10) {
                accessibilityNodeInfo.setSelected(true);
            }
        }
        accessibilityNodeInfo.setContentDescription(this.f25676a.getText());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (org.telegram.ui.ActionBar.y6.f23478k0.getStrokeWidth() + AndroidUtilities.dp(58.0f)), 1073741824));
    }

    public void setChecked(boolean z10) {
        Switch r12 = this.f25678c;
        if (r12 != null) {
            r12.c(z10, false);
        }
        zp zpVar = this.d;
        if (zpVar != null) {
            zpVar.a(z10, false);
        }
    }
}
