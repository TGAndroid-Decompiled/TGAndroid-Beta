package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.id;
import org.telegram.ui.Components.xq;
public final class x3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final int h = 0;
    public final org.telegram.ui.Components.q5 f30880a;
    public final w3 f30881b;
    public final FrameLayout.LayoutParams f30882c;
    public final org.telegram.ui.ActionBar.g6 d;
    public int f30883e;
    public boolean f30884f;

    public x3(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this(16, context, g6Var);
    }

    public final void a(CharSequence charSequence, View.OnClickListener onClickListener) {
        w3 w3Var = this.f30881b;
        w3Var.c(charSequence, true, true);
        w3Var.setOnClickListener(onClickListener);
        w3Var.setVisibility(0);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.f30880a.setText(charSequence);
        w3 w3Var = this.f30881b;
        w3Var.c(charSequence2, false, true);
        w3Var.setOnClickListener(onClickListener);
        w3Var.setVisibility(0);
    }

    public CharSequence getText() {
        return this.f30880a.getText();
    }

    public TextView getTextView() {
        return this.f30880a;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f30883e), 1073741824));
    }

    public void setLayerHeight(int i7) {
        this.f30883e = i7;
        requestLayout();
    }

    public void setNoBackground(boolean z9) {
        this.f30884f = z9;
        updateColors();
    }

    public void setRightText(CharSequence charSequence) {
        w3 w3Var = this.f30881b;
        w3Var.c(charSequence, true, true);
        w3Var.setVisibility(0);
    }

    public void setRightTextMargin(int i7) {
        float f10 = i7;
        int L = org.telegram.messenger.g0.L(f10);
        FrameLayout.LayoutParams layoutParams = this.f30882c;
        layoutParams.leftMargin = L;
        layoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
        this.f30881b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.f30880a.setText(charSequence);
        w3 w3Var = this.f30881b;
        w3Var.setVisibility(8);
        w3Var.setOnClickListener(null);
    }

    public void setTextColor(int i7) {
        org.telegram.ui.Components.q5 q5Var = this.f30880a;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        org.telegram.ui.ActionBar.s6.U(q5Var, i7, g6Var);
        org.telegram.ui.ActionBar.s6.Y(this.f30881b, i7, g6Var);
    }

    @Override
    public final void updateColors() {
        int w02;
        boolean z9 = this.f30884f;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        if (z9) {
            w02 = 0;
        } else {
            w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27885e7, g6Var);
        }
        setBackgroundColor(w02);
        int i7 = org.telegram.ui.ActionBar.l6.f27904f7;
        this.f30880a.setTextColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        this.f30881b.setTextColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
    }

    public x3(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f30883e = 32;
        this.d = g6Var;
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27885e7, this, g6Var);
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(getContext());
        this.f30880a = q5Var;
        q5Var.setTextSize(1, 14.0f);
        q5Var.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.l6.f27904f7;
        org.telegram.ui.ActionBar.s6.U(q5Var, i10, g6Var);
        q5Var.setGravity((id.f23157a0 ? 5 : 3) | 16);
        float f10 = i7;
        addView(q5Var, c8.ha.d(-1, -1.0f, (id.f23157a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        w3 w3Var = new w3(getContext(), true, true, true, 0);
        this.f30881b = w3Var;
        w3Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        w3Var.b(0.9f, 420L, xq.h);
        w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.s6.Y(w3Var, i10, g6Var);
        w3Var.setGravity(id.f23157a0 ? 3 : 5);
        FrameLayout.LayoutParams d = c8.ha.d(-2, -1.0f, (id.f23157a0 ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f);
        this.f30882c = d;
        addView(w3Var, d);
        WeakHashMap weakHashMap = r0.i0.f54203a;
        new r0.v(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
