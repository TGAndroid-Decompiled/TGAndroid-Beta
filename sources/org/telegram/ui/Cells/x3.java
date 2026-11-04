package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.xq;
public final class x3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final int h = 0;
    public final org.telegram.ui.Components.o5 f30949a;
    public final w3 f30950b;
    public final FrameLayout.LayoutParams f30951c;
    public final org.telegram.ui.ActionBar.e6 d;
    public int f30952e;
    public boolean f30953f;

    public x3(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(16, context, e6Var);
    }

    public final void a(CharSequence charSequence, View.OnClickListener onClickListener) {
        w3 w3Var = this.f30950b;
        w3Var.c(charSequence, true, true);
        w3Var.setOnClickListener(onClickListener);
        w3Var.setVisibility(0);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.f30949a.setText(charSequence);
        w3 w3Var = this.f30950b;
        w3Var.c(charSequence2, false, true);
        w3Var.setOnClickListener(onClickListener);
        w3Var.setVisibility(0);
    }

    public CharSequence getText() {
        return this.f30949a.getText();
    }

    public TextView getTextView() {
        return this.f30949a;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f30952e), 1073741824));
    }

    public void setLayerHeight(int i3) {
        this.f30952e = i3;
        requestLayout();
    }

    public void setNoBackground(boolean z10) {
        this.f30953f = z10;
        updateColors();
    }

    public void setRightText(CharSequence charSequence) {
        w3 w3Var = this.f30950b;
        w3Var.c(charSequence, true, true);
        w3Var.setVisibility(0);
    }

    public void setRightTextMargin(int i3) {
        float f10 = i3;
        int L = org.telegram.messenger.g0.L(f10);
        FrameLayout.LayoutParams layoutParams = this.f30951c;
        layoutParams.leftMargin = L;
        layoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
        this.f30950b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.f30949a.setText(charSequence);
        w3 w3Var = this.f30950b;
        w3Var.setVisibility(8);
        w3Var.setOnClickListener(null);
    }

    public void setTextColor(int i3) {
        org.telegram.ui.Components.o5 o5Var = this.f30949a;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        org.telegram.ui.ActionBar.r6.V(o5Var, i3, e6Var);
        org.telegram.ui.ActionBar.r6.Z(this.f30950b, i3, e6Var);
    }

    @Override
    public final void updateColors() {
        int w02;
        boolean z10 = this.f30953f;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (z10) {
            w02 = 0;
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27899e7, e6Var);
        }
        setBackgroundColor(w02);
        int i3 = org.telegram.ui.ActionBar.k6.f27918f7;
        this.f30949a.setTextColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        this.f30950b.setTextColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
    }

    public x3(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f30952e = 32;
        this.d = e6Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27899e7, this, e6Var);
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(getContext());
        this.f30949a = o5Var;
        o5Var.setTextSize(1, 14.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.k6.f27918f7;
        org.telegram.ui.ActionBar.r6.V(o5Var, i10, e6Var);
        o5Var.setGravity((bd.f21784a0 ? 5 : 3) | 16);
        float f10 = i3;
        addView(o5Var, mf.d(-1, -1.0f, (bd.f21784a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        w3 w3Var = new w3(getContext(), true, true, true, 0);
        this.f30950b = w3Var;
        w3Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        w3Var.b(0.9f, 420L, xq.h);
        w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.r6.Z(w3Var, i10, e6Var);
        w3Var.setGravity(bd.f21784a0 ? 3 : 5);
        FrameLayout.LayoutParams d = mf.d(-2, -1.0f, (bd.f21784a0 ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f);
        this.f30951c = d;
        addView(w3Var, d);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        new r0.v(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
