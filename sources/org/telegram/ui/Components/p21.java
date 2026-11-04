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
public final class p21 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f37039a;
    public boolean f37040b;
    public final m21 f37041c;
    public final TextView d;
    public final FrameLayout.LayoutParams f37042e;
    public final n21 f37043f;
    public boolean h;
    public final ImageView f37044n;
    public int f37045r;
    public final u5 f37046s;

    public p21(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f37045r = -1;
        this.f37046s = new u5(this, 0L, 320L, xq.h);
        this.f37039a = e6Var;
        setClipToPadding(false);
        setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
        m21 m21Var = new m21(this, context);
        this.f37041c = m21Var;
        org.telegram.messenger.hs.i(m21Var);
        m21Var.setTextSize(1, 16.0f);
        m21Var.setMaxLines(1);
        m21Var.setSingleLine();
        m21Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(m21Var, b8.mf.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setText(org.telegram.messenger.bd.M0(2131751462, null));
        textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView.setGravity(17);
        b8.pf.a(textView);
        addView(textView, b8.mf.d(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        ?? lVar = new yh.l(context);
        this.f37043f = lVar;
        org.telegram.messenger.hs.i(lVar);
        lVar.setTextSize(1, 16.0f);
        lVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams c2 = b8.mf.c(-2.0f, -1);
        this.f37042e = c2;
        addView((View) lVar, c2);
        ImageView imageView = new ImageView(context);
        this.f37044n = imageView;
        imageView.setImageResource(2131232103);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.bd.M0(2131751767, null));
        b8.pf.a(imageView);
        addView(imageView, b8.mf.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ig));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27998jg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f37046s.e(false, this.f37045r));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        View view;
        super.onDraw(canvas);
        if (this.f37040b) {
            if (this.h) {
                view = this.f37041c;
            } else {
                view = this.f37043f;
            }
            Paint W0 = org.telegram.ui.ActionBar.k6.W0("paintDivider", this.f37039a);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.k6.f28002k0;
            }
            Paint paint = W0;
            if (org.telegram.messenger.bd.f21784a0) {
                canvas.drawRect(0.0f, getMeasuredHeight() - 1, view.getRight(), getMeasuredHeight(), paint);
            } else {
                canvas.drawRect(view.getLeft(), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), paint);
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        this.f37045r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.f37042e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i10);
        if (this.f37044n.getVisibility() == 0) {
            Layout layout = this.f37043f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - org.telegram.messenger.g0.L(42.0f)) {
                layoutParams.bottomMargin = org.telegram.messenger.g0.L(26.0f);
                super.onMeasure(makeMeasureSpec, i10);
            }
        }
        if (getMeasuredHeight() > this.f37045r && !this.h) {
            this.f37045r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f37045r = measuredHeight;
        this.f37046s.e(true, measuredHeight);
    }

    public void setHandlesColor(int i3) {
        n21 n21Var = this.f37043f;
        if (Build.VERSION.SDK_INT >= 29 && !org.telegram.messenger.sr.i()) {
            try {
                Drawable textSelectHandleLeft = n21Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i3, mode);
                n21Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = n21Var.getTextSelectHandle();
                textSelectHandle.setColorFilter(i3, mode);
                n21Var.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = n21Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i3, mode);
                n21Var.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void updateColors() {
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f37039a;
        this.f37041c.setTextColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        int i10 = org.telegram.ui.ActionBar.k6.L6;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
        TextView textView = this.d;
        textView.setTextColor(w02);
        textView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(9.0f), org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i10, e6Var))));
        int w03 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        n21 n21Var = this.f37043f;
        n21Var.setTextColor(w03);
        n21Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        n21Var.setHighlightColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ig, e6Var));
        setHandlesColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27998jg, e6Var));
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f37044n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i11, e6Var)), 1, -1));
    }
}
