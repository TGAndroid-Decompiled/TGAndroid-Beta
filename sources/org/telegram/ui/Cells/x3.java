package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.er;
public final class x3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final int h = 0;
    public final org.telegram.ui.Components.o5 f32025a;
    public final w3 f32026b;
    public final FrameLayout.LayoutParams f32027c;
    public final org.telegram.ui.ActionBar.e6 d;
    public int f32028e;
    public boolean f32029f;

    public x3(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(16, context, e6Var);
    }

    public final void a(CharSequence charSequence, View.OnClickListener onClickListener) {
        w3 w3Var = this.f32026b;
        w3Var.c(charSequence, true, true);
        w3Var.setOnClickListener(onClickListener);
        w3Var.setVisibility(0);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.f32025a.setText(charSequence);
        w3 w3Var = this.f32026b;
        w3Var.c(charSequence2, false, true);
        w3Var.setOnClickListener(onClickListener);
        w3Var.setVisibility(0);
    }

    public CharSequence getText() {
        return this.f32025a.getText();
    }

    public TextView getTextView() {
        return this.f32025a;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f32028e), 1073741824));
    }

    public void setLayerHeight(int i7) {
        this.f32028e = i7;
        requestLayout();
    }

    public void setNoBackground(boolean z10) {
        this.f32029f = z10;
        updateColors();
    }

    public void setRightText(CharSequence charSequence) {
        w3 w3Var = this.f32026b;
        w3Var.c(charSequence, true, true);
        w3Var.setVisibility(0);
    }

    public void setRightTextMargin(int i7) {
        float f10 = i7;
        int L = org.telegram.messenger.g0.L(f10);
        FrameLayout.LayoutParams layoutParams = this.f32027c;
        layoutParams.leftMargin = L;
        layoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
        this.f32026b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.f32025a.setText(charSequence);
        w3 w3Var = this.f32026b;
        w3Var.setVisibility(8);
        w3Var.setOnClickListener(null);
    }

    public void setTextColor(int i7) {
        org.telegram.ui.Components.o5 o5Var = this.f32025a;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        org.telegram.ui.ActionBar.q6.U(o5Var, i7, e6Var);
        org.telegram.ui.ActionBar.q6.Y(this.f32026b, i7, e6Var);
    }

    @Override
    public final void updateColors() {
        int w02;
        boolean z10 = this.f32029f;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (z10) {
            w02 = 0;
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28869e7, e6Var);
        }
        setBackgroundColor(w02);
        int i7 = org.telegram.ui.ActionBar.j6.f28888f7;
        this.f32025a.setTextColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        this.f32026b.setTextColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
    }

    public x3(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f32028e = 32;
        this.d = e6Var;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28869e7, this, e6Var);
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(getContext());
        this.f32025a = o5Var;
        o5Var.setTextSize(1, 14.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.j6.f28888f7;
        org.telegram.ui.ActionBar.q6.U(o5Var, i10, e6Var);
        o5Var.setGravity((hd.f24101a0 ? 5 : 3) | 16);
        float f10 = i7;
        addView(o5Var, c8.ja.d(-1, -1.0f, (hd.f24101a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        w3 w3Var = new w3(getContext(), true, true, true, 0);
        this.f32026b = w3Var;
        w3Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        w3Var.b(0.9f, 420L, er.h);
        w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.q6.Y(w3Var, i10, e6Var);
        w3Var.setGravity(hd.f24101a0 ? 3 : 5);
        FrameLayout.LayoutParams d = c8.ja.d(-2, -1.0f, (hd.f24101a0 ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f);
        this.f32027c = d;
        addView(w3Var, d);
        WeakHashMap weakHashMap = r0.i0.f55671a;
        new r0.v(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
