package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.bs;
public final class u3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final int h = 0;
    public final org.telegram.ui.Components.z5 f23727a;
    public final t3 f23728b;
    public final FrameLayout.LayoutParams f23729c;
    public final org.telegram.ui.ActionBar.g6 d;
    public int e;
    public boolean f23730f;

    public u3(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, 16, g6Var);
    }

    public final void a(CharSequence charSequence, View.OnClickListener onClickListener) {
        t3 t3Var = this.f23728b;
        t3Var.c(charSequence, true, true);
        t3Var.setOnClickListener(onClickListener);
        t3Var.setVisibility(0);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.f23727a.setText(charSequence);
        t3 t3Var = this.f23728b;
        t3Var.c(charSequence2, false, true);
        t3Var.setOnClickListener(onClickListener);
        t3Var.setVisibility(0);
    }

    public CharSequence getText() {
        return this.f23727a.getText();
    }

    public TextView getTextView() {
        return this.f23727a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.e), 1073741824));
    }

    public void setLayerHeight(int i10) {
        this.e = i10;
        requestLayout();
    }

    public void setNoBackground(boolean z10) {
        this.f23730f = z10;
        updateColors();
    }

    public void setRightText(CharSequence charSequence) {
        t3 t3Var = this.f23728b;
        t3Var.c(charSequence, true, true);
        t3Var.setVisibility(0);
    }

    public void setRightTextMargin(int i10) {
        float f7 = i10;
        int dp = AndroidUtilities.dp(f7);
        FrameLayout.LayoutParams layoutParams = this.f23729c;
        layoutParams.leftMargin = dp;
        layoutParams.rightMargin = AndroidUtilities.dp(f7);
        this.f23728b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.f23727a.setText(charSequence);
        t3 t3Var = this.f23728b;
        t3Var.setVisibility(8);
        t3Var.setOnClickListener(null);
    }

    public void setTextColor(int i10) {
        org.telegram.ui.Components.z5 z5Var = this.f23727a;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        org.telegram.ui.ActionBar.r6.W(z5Var, i10, g6Var);
        org.telegram.ui.ActionBar.r6.a0(this.f23728b, i10, g6Var);
    }

    @Override
    public final void updateColors() {
        int w02;
        boolean z10 = this.f23730f;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        if (z10) {
            w02 = 0;
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.e7, g6Var);
        }
        setBackgroundColor(w02);
        int i10 = org.telegram.ui.ActionBar.k6.f7;
        this.f23727a.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        this.f23728b.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
    }

    public u3(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.e = 32;
        this.d = g6Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.e7, this, g6Var);
        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(getContext());
        this.f23727a = z5Var;
        z5Var.setTextSize(1, 14.0f);
        z5Var.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.k6.f7;
        org.telegram.ui.ActionBar.r6.W(z5Var, i11, g6Var);
        z5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        float f7 = i10;
        addView(z5Var, w7.z5.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f7, 0.0f, f7, 0.0f));
        t3 t3Var = new t3(getContext(), true, true, true, 0);
        this.f23728b = t3Var;
        t3Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        t3Var.b(0.9f, 420L, bs.h);
        t3Var.setTextSize(AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.r6.a0(t3Var, i11, g6Var);
        t3Var.setGravity(LocaleController.isRTL ? 3 : 5);
        FrameLayout.LayoutParams d = w7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f7, 0.0f, f7, 0.0f);
        this.f23729c = d;
        addView(t3Var, d);
        WeakHashMap weakHashMap = r0.i0.f45242a;
        new r0.w(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
