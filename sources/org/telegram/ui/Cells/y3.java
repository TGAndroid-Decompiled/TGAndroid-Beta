package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.lr;
public final class y3 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public static final int h = 0;
    public final org.telegram.ui.Components.w5 f32455a;
    public final x3 f32456b;
    public final FrameLayout.LayoutParams f32457c;
    public final org.telegram.ui.ActionBar.i6 d;
    public int f32458e;
    public boolean f32459f;

    public y3(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        this(16, context, i6Var);
    }

    public final void a(CharSequence charSequence, View.OnClickListener onClickListener) {
        x3 x3Var = this.f32456b;
        x3Var.c(charSequence, true, true);
        x3Var.setOnClickListener(onClickListener);
        x3Var.setVisibility(0);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.f32455a.setText(charSequence);
        x3 x3Var = this.f32456b;
        x3Var.c(charSequence2, false, true);
        x3Var.setOnClickListener(onClickListener);
        x3Var.setVisibility(0);
    }

    public CharSequence getText() {
        return this.f32455a.getText();
    }

    public TextView getTextView() {
        return this.f32455a;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f32458e), 1073741824));
    }

    public void setLayerHeight(int i7) {
        this.f32458e = i7;
        requestLayout();
    }

    public void setNoBackground(boolean z10) {
        this.f32459f = z10;
        updateColors();
    }

    public void setRightText(CharSequence charSequence) {
        x3 x3Var = this.f32456b;
        x3Var.c(charSequence, true, true);
        x3Var.setVisibility(0);
    }

    public void setRightTextMargin(int i7) {
        float f10 = i7;
        int L = org.telegram.messenger.g0.L(f10);
        FrameLayout.LayoutParams layoutParams = this.f32457c;
        layoutParams.leftMargin = L;
        layoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
        this.f32456b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.f32455a.setText(charSequence);
        x3 x3Var = this.f32456b;
        x3Var.setVisibility(8);
        x3Var.setOnClickListener(null);
    }

    public void setTextColor(int i7) {
        org.telegram.ui.Components.w5 w5Var = this.f32455a;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        org.telegram.ui.ActionBar.u6.U(w5Var, i7, i6Var);
        org.telegram.ui.ActionBar.u6.Y(this.f32456b, i7, i6Var);
    }

    @Override
    public final void updateColors() {
        int w02;
        boolean z10 = this.f32459f;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        if (z10) {
            w02 = 0;
        } else {
            w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29414e7, i6Var);
        }
        setBackgroundColor(w02);
        int i7 = org.telegram.ui.ActionBar.n6.f29433f7;
        this.f32455a.setTextColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        this.f32456b.setTextColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
    }

    public y3(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f32458e = 32;
        this.d = i6Var;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29414e7, this, i6Var);
        org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5(getContext());
        this.f32455a = w5Var;
        w5Var.setTextSize(1, 14.0f);
        w5Var.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.n6.f29433f7;
        org.telegram.ui.ActionBar.u6.U(w5Var, i10, i6Var);
        w5Var.setGravity((gd.f24213a0 ? 5 : 3) | 16);
        float f10 = i7;
        addView(w5Var, c8.ma.d(-1, -1.0f, (gd.f24213a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        x3 x3Var = new x3(getContext(), true, true, true, 0);
        this.f32456b = x3Var;
        x3Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        x3Var.b(0.9f, 420L, lr.h);
        x3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.u6.Y(x3Var, i10, i6Var);
        x3Var.setGravity(gd.f24213a0 ? 3 : 5);
        FrameLayout.LayoutParams d = c8.ma.d(-2, -1.0f, (gd.f24213a0 ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f);
        this.f32457c = d;
        addView(x3Var, d);
        WeakHashMap weakHashMap = r0.i0.f56244a;
        new r0.v(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
