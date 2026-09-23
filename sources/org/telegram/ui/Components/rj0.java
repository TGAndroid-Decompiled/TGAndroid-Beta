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
public final class rj0 extends FrameLayout {
    public final Paint f27648a;
    public final RectF f27649b;
    public final float f27650c;
    public final w9 d;
    public final ImageView e;
    public final TextView f27651f;
    public final View h;
    public float f27652n;
    public final Drawable f27653r;
    public int f27654s;
    public zg.p0 v;

    public rj0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f27648a = new Paint(1);
        new Path();
        this.f27649b = new RectF();
        this.f27650c = AndroidUtilities.dp(32.0f);
        View view = new View(context);
        this.h = view;
        addView(view, w7.x5.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        Drawable mutate = context.getDrawable(R.drawable.msg_reactions_filled).mutate();
        this.f27653r = mutate;
        imageView.setImageDrawable(mutate);
        addView(imageView, w7.x5.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        w9 w9Var = new w9(context);
        this.d = w9Var;
        addView(w9Var, w7.x5.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f27651f = textView;
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18975n8, false));
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, w7.x5.i(-1.0f, -2.0f, 8388627, 40.0f, 0.0f, 8.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        setWillNotDraw(false);
        setOutlineProgress(this.f27652n);
    }

    public final void a(int i10, TLRPC.ReactionCount reactionCount) {
        int i11 = reactionCount.count;
        this.f27654s = i11;
        String formatShortNumber = LocaleController.formatShortNumber(i11, null);
        this.f27651f.setText(formatShortNumber);
        zg.p0 d = zg.p0.d(reactionCount.reaction);
        this.v = d;
        String str = d.f49071f;
        ImageView imageView = this.e;
        w9 w9Var = this.d;
        if (str != null) {
            for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(i10).getReactionsList()) {
                if (tL_availableReaction.reaction.equals(this.v.f49071f)) {
                    w9Var.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.h6.f18733a7, 1.0f), tL_availableReaction);
                    w9Var.setVisibility(0);
                    imageView.setVisibility(8);
                    return;
                }
            }
            return;
        }
        w9Var.setAnimatedEmojiDrawable(new q5(0, i10, this.v.f49072g));
        w9Var.setVisibility(0);
        imageView.setVisibility(8);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f27649b;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float f7 = this.f27650c;
        canvas.drawRoundRect(rectF, f7, f7, this.f27648a);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        if (this.f27652n > 0.5d) {
            accessibilityNodeInfo.setSelected(true);
        }
        zg.p0 p0Var = this.v;
        if (p0Var != null) {
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrNumberOfPeopleReactions", this.f27654s, p0Var));
        } else {
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("ReactionsCount", this.f27654s, new Object[0]));
        }
    }

    public void setCounter(int i10) {
        this.f27654s = i10;
        String formatShortNumber = LocaleController.formatShortNumber(i10, null);
        this.f27651f.setText(formatShortNumber);
        this.e.setVisibility(0);
        this.d.setVisibility(8);
    }

    public void setOutlineProgress(float f7) {
        this.f27652n = f7;
        int i10 = org.telegram.ui.ActionBar.h6.Cj;
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, i10, false), 16);
        int i11 = org.telegram.ui.ActionBar.h6.Fj;
        int d = i0.a.d(f7, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ej, false), org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        this.f27648a.setColor(i0.a.d(f7, k10, w02));
        this.f27651f.setTextColor(d);
        this.f27653r.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.MULTIPLY));
        float f10 = this.f27650c;
        View view = this.h;
        if (f7 == 1.0f) {
            int i12 = (int) f10;
            int k11 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, i11, false), 76);
            view.setBackground(org.telegram.ui.ActionBar.h6.i0(i12, i12, i12, i12, 0, k11, k11));
        } else if (f7 == 0.0f) {
            int i13 = (int) f10;
            int k12 = i0.a.k(w02, 76);
            view.setBackground(org.telegram.ui.ActionBar.h6.i0(i13, i13, i13, i13, 0, k12, k12));
        }
        invalidate();
    }
}
