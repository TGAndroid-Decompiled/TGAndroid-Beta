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
public final class z21 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f42221a;
    public boolean f42222b;
    public final w21 f42223c;
    public final TextView d;
    public final FrameLayout.LayoutParams f42224e;
    public final x21 f42225f;
    public boolean h;
    public final ImageView f42226n;
    public int f42227r;
    public final u5 f42228s;

    public z21(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f42227r = -1;
        this.f42228s = new u5(this, 0L, 320L, er.h);
        this.f42221a = e6Var;
        setClipToPadding(false);
        setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
        w21 w21Var = new w21(this, context);
        this.f42223c = w21Var;
        org.telegram.messenger.ns.i(w21Var);
        w21Var.setTextSize(1, 16.0f);
        w21Var.setMaxLines(1);
        w21Var.setSingleLine();
        w21Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(w21Var, c8.ja.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setText(org.telegram.messenger.hd.M0(2131751461, null));
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView.setGravity(17);
        c8.na.a(textView);
        addView(textView, c8.ja.d(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        ?? lVar = new xh.l(context);
        this.f42225f = lVar;
        org.telegram.messenger.ns.i(lVar);
        lVar.setTextSize(1, 16.0f);
        lVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams c10 = c8.ja.c(-2.0f, -1);
        this.f42224e = c10;
        addView((View) lVar, c10);
        ImageView imageView = new ImageView(context);
        this.f42226n = imageView;
        imageView.setImageResource(2131232104);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131751767, null));
        c8.na.a(imageView);
        addView(imageView, c8.ja.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29005lg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29022mg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Fi));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f42228s.e(false, this.f42227r));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        View view;
        super.onDraw(canvas);
        if (this.f42222b) {
            if (this.h) {
                view = this.f42223c;
            } else {
                view = this.f42225f;
            }
            Paint W0 = org.telegram.ui.ActionBar.j6.W0("paintDivider", this.f42221a);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.j6.f28972k0;
            }
            Paint paint = W0;
            if (org.telegram.messenger.hd.f24104a0) {
                canvas.drawRect(0.0f, getMeasuredHeight() - 1, view.getRight(), getMeasuredHeight(), paint);
            } else {
                canvas.drawRect(view.getLeft(), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), paint);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f42227r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.f42224e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i10);
        if (this.f42226n.getVisibility() == 0) {
            Layout layout = this.f42225f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - org.telegram.messenger.g0.L(42.0f)) {
                layoutParams.bottomMargin = org.telegram.messenger.g0.L(26.0f);
                super.onMeasure(makeMeasureSpec, i10);
            }
        }
        if (getMeasuredHeight() > this.f42227r && !this.h) {
            this.f42227r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f42227r = measuredHeight;
        this.f42228s.e(true, measuredHeight);
    }

    public void setHandlesColor(int i7) {
        x21 x21Var = this.f42225f;
        if (Build.VERSION.SDK_INT >= 29 && !org.telegram.messenger.b6.i()) {
            try {
                Drawable textSelectHandleLeft = x21Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i7, mode);
                x21Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = x21Var.getTextSelectHandle();
                textSelectHandle.setColorFilter(i7, mode);
                x21Var.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = x21Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i7, mode);
                x21Var.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f42221a;
        this.f42223c.setTextColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        int i10 = org.telegram.ui.ActionBar.j6.L6;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
        TextView textView = this.d;
        textView.setTextColor(w02);
        textView.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(9.0f), org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(i10, e6Var))));
        int w03 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        x21 x21Var = this.f42225f;
        x21Var.setTextColor(w03);
        x21Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        x21Var.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29005lg, e6Var));
        setHandlesColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29022mg, e6Var));
        int i11 = org.telegram.ui.ActionBar.j6.Fi;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(i11, e6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f42226n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(i11, e6Var)), 1, -1));
    }
}
