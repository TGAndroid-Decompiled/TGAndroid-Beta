package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class fj0 extends FrameLayout {
    public final Paint f28447a;
    public final RectF f28448b;
    public final float f28449c;
    public final o9 d;
    public final ImageView f28450e;
    public final TextView f28451f;
    public final View h;
    public float f28452n;
    public final Drawable f28453r;
    public int f28454s;
    public hg.r0 v;

    public fj0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f28447a = new Paint(1);
        new Path();
        this.f28448b = new RectF();
        this.f28449c = AndroidUtilities.dp(32.0f);
        View view = new View(context);
        this.h = view;
        addView(view, g7.e6.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f28450e = imageView;
        Drawable mutate = context.getDrawable(R.drawable.msg_reactions_filled).mutate();
        this.f28453r = mutate;
        imageView.setImageDrawable(mutate);
        addView(imageView, g7.e6.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        o9 o9Var = new o9(context);
        this.d = o9Var;
        addView(o9Var, g7.e6.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f28451f = textView;
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23181n8, false));
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, g7.e6.i(-1.0f, -2.0f, 8388627, 40.0f, 0.0f, 8.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        setWillNotDraw(false);
        setOutlineProgress(this.f28452n);
    }

    public final void a(int i9, TLRPC.ReactionCount reactionCount) {
        int i10 = reactionCount.count;
        this.f28454s = i10;
        String formatShortNumber = LocaleController.formatShortNumber(i10, null);
        this.f28451f.setText(formatShortNumber);
        hg.r0 d = hg.r0.d(reactionCount.reaction);
        this.v = d;
        String str = d.f10717f;
        ImageView imageView = this.f28450e;
        o9 o9Var = this.d;
        if (str != null) {
            for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(i9).getReactionsList()) {
                if (tL_availableReaction.reaction.equals(this.v.f10717f)) {
                    o9Var.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.f6.f22947a7, 1.0f), tL_availableReaction);
                    o9Var.setVisibility(0);
                    imageView.setVisibility(8);
                    return;
                }
            }
            return;
        }
        o9Var.setAnimatedEmojiDrawable(new k5(0, i9, this.v.f10718g));
        o9Var.setVisibility(0);
        imageView.setVisibility(8);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f28448b;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float f10 = this.f28449c;
        canvas.drawRoundRect(rectF, f10, f10, this.f28447a);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        if (this.f28452n > 0.5d) {
            accessibilityNodeInfo.setSelected(true);
        }
        hg.r0 r0Var = this.v;
        if (r0Var != null) {
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrNumberOfPeopleReactions", this.f28454s, r0Var));
        } else {
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("ReactionsCount", this.f28454s, new Object[0]));
        }
    }

    public void setCounter(int i9) {
        this.f28454s = i9;
        String formatShortNumber = LocaleController.formatShortNumber(i9, null);
        this.f28451f.setText(formatShortNumber);
        this.f28450e.setVisibility(0);
        this.d.setVisibility(8);
    }

    public void setOutlineProgress(float f10) {
        this.f28452n = f10;
        int i9 = org.telegram.ui.ActionBar.f6.Cj;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, i9, false), 16);
        int i10 = org.telegram.ui.ActionBar.f6.Fj;
        int d = i0.a.d(f10, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ej, false), org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.f28447a.setColor(i0.a.d(f10, k10, w02));
        this.f28451f.setTextColor(d);
        this.f28453r.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.MULTIPLY));
        float f11 = this.f28449c;
        View view = this.h;
        if (f10 == 1.0f) {
            int i11 = (int) f11;
            int k11 = i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, i10, false), 76);
            view.setBackground(org.telegram.ui.ActionBar.f6.i0(i11, i11, i11, i11, 0, k11, k11));
        } else if (f10 == 0.0f) {
            int i12 = (int) f11;
            int k12 = i0.a.k(w02, 76);
            view.setBackground(org.telegram.ui.ActionBar.f6.i0(i12, i12, i12, i12, 0, k12, k12));
        }
        invalidate();
    }
}
