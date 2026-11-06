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
public final class t21 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f38200a;
    public boolean f38201b;
    public final q21 f38202c;
    public final TextView d;
    public final FrameLayout.LayoutParams f38203e;
    public final r21 f38204f;
    public boolean h;
    public final ImageView f38205n;
    public int f38206r;
    public final w5 f38207s;

    public t21(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f38206r = -1;
        this.f38207s = new w5(this, 0L, 320L, xq.h);
        this.f38200a = f6Var;
        setClipToPadding(false);
        setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
        q21 q21Var = new q21(this, context);
        this.f38202c = q21Var;
        org.telegram.messenger.qs.i(q21Var);
        q21Var.setTextSize(1, 16.0f);
        q21Var.setMaxLines(1);
        q21Var.setSingleLine();
        q21Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(q21Var, c8.ha.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setText(org.telegram.messenger.hd.M0(2131751462, null));
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView.setGravity(17);
        c8.ka.a(textView);
        addView(textView, c8.ha.d(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        ?? lVar = new xh.l(context);
        this.f38204f = lVar;
        org.telegram.messenger.qs.i(lVar);
        lVar.setTextSize(1, 16.0f);
        lVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams c10 = c8.ha.c(-2.0f, -1);
        this.f38203e = c10;
        addView((View) lVar, c10);
        ImageView imageView = new ImageView(context);
        this.f38205n = imageView;
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
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f38207s.e(false, this.f38206r));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        View view;
        super.onDraw(canvas);
        if (this.f38201b) {
            if (this.h) {
                view = this.f38202c;
            } else {
                view = this.f38204f;
            }
            Paint W0 = org.telegram.ui.ActionBar.k6.W0("paintDivider", this.f38200a);
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
        this.f38206r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.f38203e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i10);
        if (this.f38205n.getVisibility() == 0) {
            Layout layout = this.f38204f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - org.telegram.messenger.g0.L(42.0f)) {
                layoutParams.bottomMargin = org.telegram.messenger.g0.L(26.0f);
                super.onMeasure(makeMeasureSpec, i10);
            }
        }
        if (getMeasuredHeight() > this.f38206r && !this.h) {
            this.f38206r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f38206r = measuredHeight;
        this.f38207s.e(true, measuredHeight);
    }

    public void setHandlesColor(int i7) {
        r21 r21Var = this.f38204f;
        if (Build.VERSION.SDK_INT >= 29 && !org.telegram.messenger.as.i()) {
            try {
                Drawable textSelectHandleLeft = r21Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i7, mode);
                r21Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = r21Var.getTextSelectHandle();
                textSelectHandle.setColorFilter(i7, mode);
                r21Var.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = r21Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i7, mode);
                r21Var.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f38200a;
        this.f38202c.setTextColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        int i10 = org.telegram.ui.ActionBar.k6.L6;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
        TextView textView = this.d;
        textView.setTextColor(w02);
        textView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(9.0f), org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i10, f6Var))));
        int w03 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        r21 r21Var = this.f38204f;
        r21Var.setTextColor(w03);
        r21Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        r21Var.setHighlightColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27948ig, f6Var));
        setHandlesColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27967jg, f6Var));
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i11, f6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f38205n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i11, f6Var)), 1, -1));
    }
}
