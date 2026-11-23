package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.nr;
public final class y3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final int h = 0;
    public final org.telegram.ui.Components.x5 f32486a;
    public final x3 f32487b;
    public final FrameLayout.LayoutParams f32488c;
    public final org.telegram.ui.ActionBar.h6 d;
    public int f32489e;
    public boolean f32490f;

    public y3(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this(16, context, h6Var);
    }

    public final void a(CharSequence charSequence, View.OnClickListener onClickListener) {
        x3 x3Var = this.f32487b;
        x3Var.c(charSequence, true, true);
        x3Var.setOnClickListener(onClickListener);
        x3Var.setVisibility(0);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.f32486a.setText(charSequence);
        x3 x3Var = this.f32487b;
        x3Var.c(charSequence2, false, true);
        x3Var.setOnClickListener(onClickListener);
        x3Var.setVisibility(0);
    }

    public CharSequence getText() {
        return this.f32486a.getText();
    }

    public TextView getTextView() {
        return this.f32486a;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f32489e), 1073741824));
    }

    public void setLayerHeight(int i7) {
        this.f32489e = i7;
        requestLayout();
    }

    public void setNoBackground(boolean z10) {
        this.f32490f = z10;
        updateColors();
    }

    public void setRightText(CharSequence charSequence) {
        x3 x3Var = this.f32487b;
        x3Var.c(charSequence, true, true);
        x3Var.setVisibility(0);
    }

    public void setRightTextMargin(int i7) {
        float f10 = i7;
        int L = org.telegram.messenger.g0.L(f10);
        FrameLayout.LayoutParams layoutParams = this.f32488c;
        layoutParams.leftMargin = L;
        layoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
        this.f32487b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.f32486a.setText(charSequence);
        x3 x3Var = this.f32487b;
        x3Var.setVisibility(8);
        x3Var.setOnClickListener(null);
    }

    public void setTextColor(int i7) {
        org.telegram.ui.Components.x5 x5Var = this.f32486a;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        org.telegram.ui.ActionBar.t6.U(x5Var, i7, h6Var);
        org.telegram.ui.ActionBar.t6.Y(this.f32487b, i7, h6Var);
    }

    @Override
    public final void updateColors() {
        int w02;
        boolean z10 = this.f32490f;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        if (z10) {
            w02 = 0;
        } else {
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29401e7, h6Var);
        }
        setBackgroundColor(w02);
        int i7 = org.telegram.ui.ActionBar.m6.f29420f7;
        this.f32486a.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        this.f32487b.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
    }

    public y3(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f32489e = 32;
        this.d = h6Var;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29401e7, this, h6Var);
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(getContext());
        this.f32486a = x5Var;
        x5Var.setTextSize(1, 14.0f);
        x5Var.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.m6.f29420f7;
        org.telegram.ui.ActionBar.t6.U(x5Var, i10, h6Var);
        x5Var.setGravity((hd.f24444a0 ? 5 : 3) | 16);
        float f10 = i7;
        addView(x5Var, c8.ma.d(-1, -1.0f, (hd.f24444a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        x3 x3Var = new x3(getContext(), true, true, true, 0);
        this.f32487b = x3Var;
        x3Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        x3Var.b(0.9f, 420L, nr.h);
        x3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.t6.Y(x3Var, i10, h6Var);
        x3Var.setGravity(hd.f24444a0 ? 3 : 5);
        FrameLayout.LayoutParams d = c8.ma.d(-2, -1.0f, (hd.f24444a0 ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f);
        this.f32488c = d;
        addView(x3Var, d);
        WeakHashMap weakHashMap = r0.i0.f56289a;
        new r0.v(2131296686, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
