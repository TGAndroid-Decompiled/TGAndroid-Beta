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
public final class bk0 extends FrameLayout {
    public final Paint f25620a;
    public final RectF f25621b;
    public final float f25622c;
    public final p9 d;
    public final ImageView f25623e;
    public final TextView f25624f;
    public final View h;
    public float f25625n;
    public final Drawable f25626r;
    public int f25627s;
    public ng.q0 v;

    public bk0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f25620a = new Paint(1);
        new Path();
        this.f25621b = new RectF();
        this.f25622c = AndroidUtilities.dp(32.0f);
        View view = new View(context);
        this.h = view;
        addView(view, k7.c6.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f25623e = imageView;
        Drawable mutate = context.getDrawable(R.drawable.msg_reactions_filled).mutate();
        this.f25626r = mutate;
        imageView.setImageDrawable(mutate);
        addView(imageView, k7.c6.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        p9 p9Var = new p9(context);
        this.d = p9Var;
        addView(p9Var, k7.c6.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f25624f = textView;
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21841n8, false));
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, k7.c6.i(-1.0f, -2.0f, 8388627, 40.0f, 0.0f, 8.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        setWillNotDraw(false);
        setOutlineProgress(this.f25625n);
    }

    public final void a(int i10, TLRPC.ReactionCount reactionCount) {
        int i11 = reactionCount.count;
        this.f25627s = i11;
        String formatShortNumber = LocaleController.formatShortNumber(i11, null);
        this.f25624f.setText(formatShortNumber);
        ng.q0 d = ng.q0.d(reactionCount.reaction);
        this.v = d;
        String str = d.f16178f;
        ImageView imageView = this.f25623e;
        p9 p9Var = this.d;
        if (str != null) {
            for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(i10).getReactionsList()) {
                if (tL_availableReaction.reaction.equals(this.v.f16178f)) {
                    p9Var.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.k6.f21605a7, 1.0f), tL_availableReaction);
                    p9Var.setVisibility(0);
                    imageView.setVisibility(8);
                    return;
                }
            }
            return;
        }
        p9Var.setAnimatedEmojiDrawable(new l5(0, i10, this.v.f16179g));
        p9Var.setVisibility(0);
        imageView.setVisibility(8);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f25621b;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float f10 = this.f25622c;
        canvas.drawRoundRect(rectF, f10, f10, this.f25620a);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        if (this.f25625n > 0.5d) {
            accessibilityNodeInfo.setSelected(true);
        }
        ng.q0 q0Var = this.v;
        if (q0Var != null) {
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrNumberOfPeopleReactions", this.f25627s, q0Var));
        } else {
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("ReactionsCount", this.f25627s, new Object[0]));
        }
    }

    public void setCounter(int i10) {
        this.f25627s = i10;
        String formatShortNumber = LocaleController.formatShortNumber(i10, null);
        this.f25624f.setText(formatShortNumber);
        this.f25623e.setVisibility(0);
        this.d.setVisibility(8);
    }

    public void setOutlineProgress(float f10) {
        this.f25625n = f10;
        int i10 = org.telegram.ui.ActionBar.k6.Cj;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, i10, false), 16);
        int i11 = org.telegram.ui.ActionBar.k6.Fj;
        int d = i0.a.d(f10, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ej, false), org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        this.f25620a.setColor(i0.a.d(f10, k10, w02));
        this.f25624f.setTextColor(d);
        this.f25626r.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.MULTIPLY));
        float f11 = this.f25622c;
        View view = this.h;
        if (f10 == 1.0f) {
            int i12 = (int) f11;
            int k11 = i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, i11, false), 76);
            view.setBackground(org.telegram.ui.ActionBar.k6.i0(i12, i12, i12, i12, 0, k11, k11));
        } else if (f10 == 0.0f) {
            int i13 = (int) f11;
            int k12 = i0.a.k(w02, 76);
            view.setBackground(org.telegram.ui.ActionBar.k6.i0(i13, i13, i13, i13, 0, k12, k12));
        }
        invalidate();
    }
}
