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
public final class qj0 extends FrameLayout {
    public final Paint f31967a;
    public final RectF f31968b;
    public final float f31969c;
    public final t9 d;
    public final ImageView f31970e;
    public final TextView f31971f;
    public final View h;
    public float f31972n;
    public final Drawable f31973r;
    public int f31974s;
    public kg.q0 v;

    public qj0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f31967a = new Paint(1);
        new Path();
        this.f31968b = new RectF();
        this.f31969c = AndroidUtilities.dp(32.0f);
        View view = new View(context);
        this.h = view;
        addView(view, i7.f6.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f31970e = imageView;
        Drawable mutate = context.getDrawable(R.drawable.msg_reactions_filled).mutate();
        this.f31973r = mutate;
        imageView.setImageDrawable(mutate);
        addView(imageView, i7.f6.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        t9 t9Var = new t9(context);
        this.d = t9Var;
        addView(t9Var, i7.f6.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f31971f = textView;
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23243n8, false));
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, i7.f6.i(-1.0f, -2.0f, 8388627, 40.0f, 0.0f, 8.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        setWillNotDraw(false);
        setOutlineProgress(this.f31972n);
    }

    public final void a(int i10, TLRPC.ReactionCount reactionCount) {
        int i11 = reactionCount.count;
        this.f31974s = i11;
        String formatShortNumber = LocaleController.formatShortNumber(i11, null);
        this.f31971f.setText(formatShortNumber);
        kg.q0 d = kg.q0.d(reactionCount.reaction);
        this.v = d;
        String str = d.f13825f;
        ImageView imageView = this.f31970e;
        t9 t9Var = this.d;
        if (str != null) {
            for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(i10).getReactionsList()) {
                if (tL_availableReaction.reaction.equals(this.v.f13825f)) {
                    t9Var.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.g6.f23009a7, 1.0f), tL_availableReaction);
                    t9Var.setVisibility(0);
                    imageView.setVisibility(8);
                    return;
                }
            }
            return;
        }
        t9Var.setAnimatedEmojiDrawable(new p5(0, i10, this.v.f13826g));
        t9Var.setVisibility(0);
        imageView.setVisibility(8);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f31968b;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float f9 = this.f31969c;
        canvas.drawRoundRect(rectF, f9, f9, this.f31967a);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        if (this.f31972n > 0.5d) {
            accessibilityNodeInfo.setSelected(true);
        }
        kg.q0 q0Var = this.v;
        if (q0Var != null) {
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrNumberOfPeopleReactions", this.f31974s, q0Var));
        } else {
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("ReactionsCount", this.f31974s, new Object[0]));
        }
    }

    public void setCounter(int i10) {
        this.f31974s = i10;
        String formatShortNumber = LocaleController.formatShortNumber(i10, null);
        this.f31971f.setText(formatShortNumber);
        this.f31970e.setVisibility(0);
        this.d.setVisibility(8);
    }

    public void setOutlineProgress(float f9) {
        this.f31972n = f9;
        int i10 = org.telegram.ui.ActionBar.g6.Cj;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        int k9 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i10, false), 16);
        int i11 = org.telegram.ui.ActionBar.g6.Fj;
        int d = i0.a.d(f9, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ej, false), org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.f31967a.setColor(i0.a.d(f9, k9, w02));
        this.f31971f.setTextColor(d);
        this.f31973r.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.MULTIPLY));
        float f10 = this.f31969c;
        View view = this.h;
        if (f9 == 1.0f) {
            int i12 = (int) f10;
            int k10 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i11, false), 76);
            view.setBackground(org.telegram.ui.ActionBar.g6.i0(i12, i12, i12, i12, 0, k10, k10));
        } else if (f9 == 0.0f) {
            int i13 = (int) f10;
            int k11 = i0.a.k(w02, 76);
            view.setBackground(org.telegram.ui.ActionBar.g6.i0(i13, i13, i13, i13, 0, k11, k11));
        }
        invalidate();
    }
}
