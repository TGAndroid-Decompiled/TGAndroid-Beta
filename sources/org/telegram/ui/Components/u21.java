package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class u21 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 f38496a;
    public boolean f38497b;
    public final r21 f38498c;
    public final TextView d;
    public final FrameLayout.LayoutParams f38499e;
    public final s21 f38500f;
    public boolean h;
    public final ImageView f38501n;
    public int f38502r;
    public final v5 f38503s;

    public u21(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f38502r = -1;
        this.f38503s = new v5(this, 0L, 320L, wq.h);
        this.f38496a = h6Var;
        setClipToPadding(false);
        setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
        r21 r21Var = new r21(this, context);
        this.f38498c = r21Var;
        org.telegram.messenger.qs.i(r21Var);
        r21Var.setTextSize(1, 16.0f);
        r21Var.setMaxLines(1);
        r21Var.setSingleLine();
        r21Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(r21Var, c8.ha.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setText(org.telegram.messenger.id.M0(2131751461, null));
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView.setGravity(17);
        c8.ka.a(textView);
        addView(textView, c8.ha.d(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        ?? lVar = new xh.l(context);
        this.f38500f = lVar;
        org.telegram.messenger.qs.i(lVar);
        lVar.setTextSize(1, 16.0f);
        lVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams c10 = c8.ha.c(-2.0f, -1);
        this.f38499e = c10;
        addView((View) lVar, c10);
        ImageView imageView = new ImageView(context);
        this.f38501n = imageView;
        imageView.setImageResource(2131232103);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.id.M0(2131751767, null));
        c8.ka.a(imageView);
        addView(imageView, c8.ha.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27990ig));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28009jg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ci));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f38503s.e(false, this.f38502r));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        View view;
        super.onDraw(canvas);
        if (this.f38497b) {
            if (this.h) {
                view = this.f38498c;
            } else {
                view = this.f38500f;
            }
            Paint W0 = org.telegram.ui.ActionBar.m6.W0("paintDivider", this.f38496a);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.m6.f28013k0;
            }
            Paint paint = W0;
            if (org.telegram.messenger.id.f23161a0) {
                canvas.drawRect(0.0f, getMeasuredHeight() - 1, view.getRight(), getMeasuredHeight(), paint);
            } else {
                canvas.drawRect(view.getLeft(), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), paint);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f38502r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.f38499e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i10);
        if (this.f38501n.getVisibility() == 0) {
            Layout layout = this.f38500f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - org.telegram.messenger.g0.L(42.0f)) {
                layoutParams.bottomMargin = org.telegram.messenger.g0.L(26.0f);
                super.onMeasure(makeMeasureSpec, i10);
            }
        }
        if (getMeasuredHeight() > this.f38502r && !this.h) {
            this.f38502r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f38502r = measuredHeight;
        this.f38503s.e(true, measuredHeight);
    }

    public void setHandlesColor(int i7) {
        s21 s21Var = this.f38500f;
        if (Build.VERSION.SDK_INT >= 29 && !org.telegram.messenger.as.i()) {
            try {
                Drawable textSelectHandleLeft = s21Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i7, mode);
                s21Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = s21Var.getTextSelectHandle();
                textSelectHandle.setColorFilter(i7, mode);
                s21Var.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = s21Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i7, mode);
                s21Var.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f38496a;
        this.f38498c.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        int i10 = org.telegram.ui.ActionBar.m6.L6;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        TextView textView = this.d;
        textView.setTextColor(w02);
        textView.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(9.0f), org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i10, h6Var))));
        int w03 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        s21 s21Var = this.f38500f;
        s21Var.setTextColor(w03);
        s21Var.setLinkTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        s21Var.setHighlightColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27990ig, h6Var));
        setHandlesColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28009jg, h6Var));
        int i11 = org.telegram.ui.ActionBar.m6.Ci;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f38501n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i11, h6Var)), 1, -1));
    }
}
