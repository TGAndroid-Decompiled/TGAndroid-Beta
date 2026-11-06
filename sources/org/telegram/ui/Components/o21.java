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
public final class o21 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f36576a;
    public boolean f36577b;
    public final l21 f36578c;
    public final TextView d;
    public final FrameLayout.LayoutParams f36579e;
    public final m21 f36580f;
    public boolean h;
    public final ImageView f36581n;
    public int f36582r;
    public final w5 f36583s;

    public o21(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f36582r = -1;
        this.f36583s = new w5(this, 0L, 320L, xq.h);
        this.f36576a = f6Var;
        setClipToPadding(false);
        setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
        l21 l21Var = new l21(this, context);
        this.f36578c = l21Var;
        org.telegram.messenger.qs.i(l21Var);
        l21Var.setTextSize(1, 16.0f);
        l21Var.setMaxLines(1);
        l21Var.setSingleLine();
        l21Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(l21Var, c8.ha.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setText(org.telegram.messenger.hd.M0(2131751462, null));
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView.setGravity(17);
        c8.ka.a(textView);
        addView(textView, c8.ha.d(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        ?? lVar = new xh.l(context);
        this.f36580f = lVar;
        org.telegram.messenger.qs.i(lVar);
        lVar.setTextSize(1, 16.0f);
        lVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams c10 = c8.ha.c(-2.0f, -1);
        this.f36579e = c10;
        addView((View) lVar, c10);
        ImageView imageView = new ImageView(context);
        this.f36581n = imageView;
        imageView.setImageResource(2131232103);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131751767, null));
        c8.ka.a(imageView);
        addView(imageView, c8.ha.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27948ig));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27967jg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f36583s.e(false, this.f36582r));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        View view;
        super.onDraw(canvas);
        if (this.f36577b) {
            if (this.h) {
                view = this.f36578c;
            } else {
                view = this.f36580f;
            }
            Paint W0 = org.telegram.ui.ActionBar.k6.W0("paintDivider", this.f36576a);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.k6.f27971k0;
            }
            Paint paint = W0;
            if (org.telegram.messenger.hd.f22871a0) {
                canvas.drawRect(0.0f, getMeasuredHeight() - 1, view.getRight(), getMeasuredHeight(), paint);
            } else {
                canvas.drawRect(view.getLeft(), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), paint);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f36582r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.f36579e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i10);
        if (this.f36581n.getVisibility() == 0) {
            Layout layout = this.f36580f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - org.telegram.messenger.g0.L(42.0f)) {
                layoutParams.bottomMargin = org.telegram.messenger.g0.L(26.0f);
                super.onMeasure(makeMeasureSpec, i10);
            }
        }
        if (getMeasuredHeight() > this.f36582r && !this.h) {
            this.f36582r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f36582r = measuredHeight;
        this.f36583s.e(true, measuredHeight);
    }

    public void setHandlesColor(int i7) {
        m21 m21Var = this.f36580f;
        if (Build.VERSION.SDK_INT >= 29 && !org.telegram.messenger.as.i()) {
            try {
                Drawable textSelectHandleLeft = m21Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i7, mode);
                m21Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = m21Var.getTextSelectHandle();
                textSelectHandle.setColorFilter(i7, mode);
                m21Var.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = m21Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i7, mode);
                m21Var.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f36576a;
        this.f36578c.setTextColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        int i10 = org.telegram.ui.ActionBar.k6.L6;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
        TextView textView = this.d;
        textView.setTextColor(w02);
        textView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(9.0f), org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i10, f6Var))));
        int w03 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        m21 m21Var = this.f36580f;
        m21Var.setTextColor(w03);
        m21Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        m21Var.setHighlightColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27948ig, f6Var));
        setHandlesColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27967jg, f6Var));
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i11, f6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f36581n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i11, f6Var)), 1, -1));
    }
}
