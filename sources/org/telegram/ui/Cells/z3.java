package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.gr;
public final class z3 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public static final int h = 0;
    public final org.telegram.ui.Components.n5 f23638a;
    public final y3 f23639b;
    public final FrameLayout.LayoutParams f23640c;
    public final org.telegram.ui.ActionBar.p6 d;
    public int e;
    public boolean f23641f;

    public z3(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this(16, context, p6Var);
    }

    public final void a(CharSequence charSequence, View.OnClickListener onClickListener) {
        y3 y3Var = this.f23639b;
        y3Var.c(charSequence, true, true);
        y3Var.setOnClickListener(onClickListener);
        y3Var.setVisibility(0);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.f23638a.setText(charSequence);
        y3 y3Var = this.f23639b;
        y3Var.c(charSequence2, false, true);
        y3Var.setOnClickListener(onClickListener);
        y3Var.setVisibility(0);
    }

    public CharSequence getText() {
        return this.f23638a.getText();
    }

    public TextView getTextView() {
        return this.f23638a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.e), 1073741824));
    }

    public void setLayerHeight(int i10) {
        this.e = i10;
        requestLayout();
    }

    public void setNoBackground(boolean z10) {
        this.f23641f = z10;
        updateColors();
    }

    public void setRightText(CharSequence charSequence) {
        y3 y3Var = this.f23639b;
        y3Var.c(charSequence, true, true);
        y3Var.setVisibility(0);
    }

    public void setRightTextMargin(int i10) {
        float f7 = i10;
        int L = org.telegram.messenger.i0.L(f7);
        FrameLayout.LayoutParams layoutParams = this.f23640c;
        layoutParams.leftMargin = L;
        layoutParams.rightMargin = org.telegram.messenger.i0.L(f7);
        this.f23639b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.f23638a.setText(charSequence);
        y3 y3Var = this.f23639b;
        y3Var.setVisibility(8);
        y3Var.setOnClickListener(null);
    }

    public void setTextColor(int i10) {
        org.telegram.ui.Components.n5 n5Var = this.f23638a;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        org.telegram.ui.ActionBar.a7.V(n5Var, i10, p6Var);
        org.telegram.ui.ActionBar.a7.Z(this.f23639b, i10, p6Var);
    }

    @Override
    public final void updateColors() {
        int w02;
        boolean z10 = this.f23641f;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        if (z10) {
            w02 = 0;
        } else {
            w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.e7, p6Var);
        }
        setBackgroundColor(w02);
        int i10 = org.telegram.ui.ActionBar.t6.f7;
        this.f23638a.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.f23639b.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
    }

    public z3(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.e = 32;
        this.d = p6Var;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.e7, this, p6Var);
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(getContext());
        this.f23638a = n5Var;
        n5Var.setTextSize(1, 14.0f);
        n5Var.setTypeface(org.telegram.messenger.i0.o());
        int i11 = org.telegram.ui.ActionBar.t6.f7;
        org.telegram.ui.ActionBar.a7.V(n5Var, i11, p6Var);
        n5Var.setGravity((cd.X ? 5 : 3) | 16);
        float f7 = i10;
        addView(n5Var, w7.b6.d(-1, -1.0f, (cd.X ? 5 : 3) | 48, f7, 0.0f, f7, 0.0f));
        y3 y3Var = new y3(getContext(), true, true, true, 0);
        this.f23639b = y3Var;
        y3Var.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        y3Var.b(0.9f, 420L, gr.h);
        y3Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        org.telegram.ui.ActionBar.a7.Z(y3Var, i11, p6Var);
        y3Var.setGravity(cd.X ? 3 : 5);
        FrameLayout.LayoutParams d = w7.b6.d(-2, -1.0f, (cd.X ? 3 : 5) | 48, f7, 0.0f, f7, 0.0f);
        this.f23640c = d;
        addView(y3Var, d);
        WeakHashMap weakHashMap = r0.h0.f46123a;
        new r0.v(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
