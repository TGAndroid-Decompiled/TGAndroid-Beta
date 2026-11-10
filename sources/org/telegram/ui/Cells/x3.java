package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.id;
import org.telegram.ui.Components.wq;
public final class x3 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public static final int h = 0;
    public final org.telegram.ui.Components.p5 f30891a;
    public final w3 f30892b;
    public final FrameLayout.LayoutParams f30893c;
    public final org.telegram.ui.ActionBar.h6 d;
    public int f30894e;
    public boolean f30895f;

    public x3(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this(16, context, h6Var);
    }

    public final void a(CharSequence charSequence, View.OnClickListener onClickListener) {
        w3 w3Var = this.f30892b;
        w3Var.c(charSequence, true, true);
        w3Var.setOnClickListener(onClickListener);
        w3Var.setVisibility(0);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.f30891a.setText(charSequence);
        w3 w3Var = this.f30892b;
        w3Var.c(charSequence2, false, true);
        w3Var.setOnClickListener(onClickListener);
        w3Var.setVisibility(0);
    }

    public CharSequence getText() {
        return this.f30891a.getText();
    }

    public TextView getTextView() {
        return this.f30891a;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f30894e), 1073741824));
    }

    public void setLayerHeight(int i7) {
        this.f30894e = i7;
        requestLayout();
    }

    public void setNoBackground(boolean z9) {
        this.f30895f = z9;
        updateColors();
    }

    public void setRightText(CharSequence charSequence) {
        w3 w3Var = this.f30892b;
        w3Var.c(charSequence, true, true);
        w3Var.setVisibility(0);
    }

    public void setRightTextMargin(int i7) {
        float f10 = i7;
        int L = org.telegram.messenger.g0.L(f10);
        FrameLayout.LayoutParams layoutParams = this.f30893c;
        layoutParams.leftMargin = L;
        layoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
        this.f30892b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.f30891a.setText(charSequence);
        w3 w3Var = this.f30892b;
        w3Var.setVisibility(8);
        w3Var.setOnClickListener(null);
    }

    public void setTextColor(int i7) {
        org.telegram.ui.Components.p5 p5Var = this.f30891a;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        org.telegram.ui.ActionBar.t6.U(p5Var, i7, h6Var);
        org.telegram.ui.ActionBar.t6.Y(this.f30892b, i7, h6Var);
    }

    @Override
    public final void updateColors() {
        int w02;
        boolean z9 = this.f30895f;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        if (z9) {
            w02 = 0;
        } else {
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27910e7, h6Var);
        }
        setBackgroundColor(w02);
        int i7 = org.telegram.ui.ActionBar.m6.f27929f7;
        this.f30891a.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        this.f30892b.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
    }

    public x3(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f30894e = 32;
        this.d = h6Var;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27910e7, this, h6Var);
        org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(getContext());
        this.f30891a = p5Var;
        p5Var.setTextSize(1, 14.0f);
        p5Var.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.m6.f27929f7;
        org.telegram.ui.ActionBar.t6.U(p5Var, i10, h6Var);
        p5Var.setGravity((id.f23161a0 ? 5 : 3) | 16);
        float f10 = i7;
        addView(p5Var, c8.ha.d(-1, -1.0f, (id.f23161a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        w3 w3Var = new w3(getContext(), true, true, true, 0);
        this.f30892b = w3Var;
        w3Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        w3Var.b(0.9f, 420L, wq.h);
        w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.t6.Y(w3Var, i10, h6Var);
        w3Var.setGravity(id.f23161a0 ? 3 : 5);
        FrameLayout.LayoutParams d = c8.ha.d(-2, -1.0f, (id.f23161a0 ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f);
        this.f30893c = d;
        addView(w3Var, d);
        WeakHashMap weakHashMap = r0.i0.f54202a;
        new r0.v(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
