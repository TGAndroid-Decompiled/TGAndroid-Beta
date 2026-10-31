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
public final class w31 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f31979a;
    public boolean f31980b;
    public final t31 f31981c;
    public final TextView d;
    public final FrameLayout.LayoutParams e;
    public final u31 f31982f;
    public boolean h;
    public final ImageView f31983n;
    public int f31984r;
    public final t5 f31985s;

    public w31(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f31984r = -1;
        this.f31985s = new t5(this, 0L, 320L, gr.h);
        this.f31979a = p6Var;
        setClipToPadding(false);
        setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(16.0f));
        t31 t31Var = new t31(this, context);
        this.f31981c = t31Var;
        org.telegram.messenger.zs.i(t31Var);
        t31Var.setTextSize(1, 16.0f);
        t31Var.setMaxLines(1);
        t31Var.setSingleLine();
        t31Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(t31Var, w7.b6.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setText(org.telegram.messenger.cd.L0(2131751462, null));
        textView.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        textView.setGravity(17);
        w7.e6.a(textView);
        addView(textView, w7.b6.d(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        ?? pVar = new nh.p(context);
        this.f31982f = pVar;
        org.telegram.messenger.zs.i(pVar);
        pVar.setTextSize(1, 16.0f);
        pVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams c10 = w7.b6.c(-2.0f, -1);
        this.e = c10;
        addView((View) pVar, c10);
        ImageView imageView = new ImageView(context);
        this.f31983n = imageView;
        imageView.setImageResource(2131232102);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.cd.L0(2131751767, null));
        w7.e6.a(imageView);
        addView(imageView, w7.b6.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21028ig));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21048jg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f31985s.e(false, this.f31984r));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        View view;
        super.onDraw(canvas);
        if (this.f31980b) {
            if (this.h) {
                view = this.f31981c;
            } else {
                view = this.f31982f;
            }
            Paint W0 = org.telegram.ui.ActionBar.t6.W0("paintDivider", this.f31979a);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.t6.f21052k0;
            }
            Paint paint = W0;
            if (org.telegram.messenger.cd.X) {
                canvas.drawRect(0.0f, getMeasuredHeight() - 1, view.getRight(), getMeasuredHeight(), paint);
            } else {
                canvas.drawRect(view.getLeft(), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), paint);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f31984r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i11);
        if (this.f31983n.getVisibility() == 0) {
            Layout layout = this.f31982f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - org.telegram.messenger.i0.L(42.0f)) {
                layoutParams.bottomMargin = org.telegram.messenger.i0.L(26.0f);
                super.onMeasure(makeMeasureSpec, i11);
            }
        }
        if (getMeasuredHeight() > this.f31984r && !this.h) {
            this.f31984r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f31984r = measuredHeight;
        this.f31985s.e(true, measuredHeight);
    }

    public void setHandlesColor(int i10) {
        u31 u31Var = this.f31982f;
        if (Build.VERSION.SDK_INT >= 29 && !org.telegram.messenger.d6.i()) {
            try {
                Drawable textSelectHandleLeft = u31Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i10, mode);
                u31Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = u31Var.getTextSelectHandle();
                textSelectHandle.setColorFilter(i10, mode);
                u31Var.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = u31Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i10, mode);
                u31Var.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.f31979a;
        this.f31981c.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        int i11 = org.telegram.ui.ActionBar.t6.L6;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        TextView textView = this.d;
        textView.setTextColor(w02);
        textView.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(9.0f), org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i11, p6Var))));
        int w03 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        u31 u31Var = this.f31982f;
        u31Var.setTextColor(w03);
        u31Var.setLinkTextColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        u31Var.setHighlightColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21028ig, p6Var));
        setHandlesColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21048jg, p6Var));
        int i12 = org.telegram.ui.ActionBar.t6.Ci;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f31983n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i12, p6Var)), 1, -1));
    }
}
