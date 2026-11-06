package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.xq;
public final class x3 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public static final int h = 0;
    public final org.telegram.ui.Components.q5 f30871a;
    public final w3 f30872b;
    public final FrameLayout.LayoutParams f30873c;
    public final org.telegram.ui.ActionBar.f6 d;
    public int f30874e;
    public boolean f30875f;

    public x3(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(16, context, f6Var);
    }

    public final void a(CharSequence charSequence, View.OnClickListener onClickListener) {
        w3 w3Var = this.f30872b;
        w3Var.c(charSequence, true, true);
        w3Var.setOnClickListener(onClickListener);
        w3Var.setVisibility(0);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.f30871a.setText(charSequence);
        w3 w3Var = this.f30872b;
        w3Var.c(charSequence2, false, true);
        w3Var.setOnClickListener(onClickListener);
        w3Var.setVisibility(0);
    }

    public CharSequence getText() {
        return this.f30871a.getText();
    }

    public TextView getTextView() {
        return this.f30871a;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f30874e), 1073741824));
    }

    public void setLayerHeight(int i7) {
        this.f30874e = i7;
        requestLayout();
    }

    public void setNoBackground(boolean z9) {
        this.f30875f = z9;
        updateColors();
    }

    public void setRightText(CharSequence charSequence) {
        w3 w3Var = this.f30872b;
        w3Var.c(charSequence, true, true);
        w3Var.setVisibility(0);
    }

    public void setRightTextMargin(int i7) {
        float f10 = i7;
        int L = org.telegram.messenger.g0.L(f10);
        FrameLayout.LayoutParams layoutParams = this.f30873c;
        layoutParams.leftMargin = L;
        layoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
        this.f30872b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.f30871a.setText(charSequence);
        w3 w3Var = this.f30872b;
        w3Var.setVisibility(8);
        w3Var.setOnClickListener(null);
    }

    public void setTextColor(int i7) {
        org.telegram.ui.Components.q5 q5Var = this.f30871a;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        org.telegram.ui.ActionBar.r6.V(q5Var, i7, f6Var);
        org.telegram.ui.ActionBar.r6.Z(this.f30872b, i7, f6Var);
    }

    @Override
    public final void updateColors() {
        int w02;
        boolean z9 = this.f30875f;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (z9) {
            w02 = 0;
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27868e7, f6Var);
        }
        setBackgroundColor(w02);
        int i7 = org.telegram.ui.ActionBar.k6.f27887f7;
        this.f30871a.setTextColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        this.f30872b.setTextColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
    }

    public x3(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f30874e = 32;
        this.d = f6Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27868e7, this, f6Var);
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(getContext());
        this.f30871a = q5Var;
        q5Var.setTextSize(1, 14.0f);
        q5Var.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.k6.f27887f7;
        org.telegram.ui.ActionBar.r6.V(q5Var, i10, f6Var);
        q5Var.setGravity((hd.f22871a0 ? 5 : 3) | 16);
        float f10 = i7;
        addView(q5Var, c8.ha.d(-1, -1.0f, (hd.f22871a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        w3 w3Var = new w3(getContext(), true, true, true, 0);
        this.f30872b = w3Var;
        w3Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        w3Var.b(0.9f, 420L, xq.h);
        w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.r6.Z(w3Var, i10, f6Var);
        w3Var.setGravity(hd.f22871a0 ? 3 : 5);
        FrameLayout.LayoutParams d = c8.ha.d(-2, -1.0f, (hd.f22871a0 ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f);
        this.f30873c = d;
        addView(w3Var, d);
        WeakHashMap weakHashMap = r0.i0.f54098a;
        new r0.v(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
