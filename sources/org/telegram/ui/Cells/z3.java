package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
public final class z3 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public static final int h = 0;
    public final org.telegram.ui.Components.b6 f25779a;
    public final y3 f25780b;
    public final FrameLayout.LayoutParams f25781c;
    public final org.telegram.ui.ActionBar.u6 d;
    public int e;
    public boolean f25782f;

    public z3(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        this(context, 16, u6Var);
    }

    public final void a(CharSequence charSequence, View.OnClickListener onClickListener) {
        y3 y3Var = this.f25780b;
        y3Var.c(charSequence, true, true);
        y3Var.setOnClickListener(onClickListener);
        y3Var.setVisibility(0);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.f25779a.setText(charSequence);
        y3 y3Var = this.f25780b;
        y3Var.c(charSequence2, false, true);
        y3Var.setOnClickListener(onClickListener);
        y3Var.setVisibility(0);
    }

    public CharSequence getText() {
        return this.f25779a.getText();
    }

    public TextView getTextView() {
        return this.f25779a;
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
        this.f25782f = z10;
        updateColors();
    }

    public void setRightText(CharSequence charSequence) {
        y3 y3Var = this.f25780b;
        y3Var.c(charSequence, true, true);
        y3Var.setVisibility(0);
    }

    public void setRightTextMargin(int i10) {
        float f7 = i10;
        int dp = AndroidUtilities.dp(f7);
        FrameLayout.LayoutParams layoutParams = this.f25781c;
        layoutParams.leftMargin = dp;
        layoutParams.rightMargin = AndroidUtilities.dp(f7);
        this.f25780b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.f25779a.setText(charSequence);
        y3 y3Var = this.f25780b;
        y3Var.setVisibility(8);
        y3Var.setOnClickListener(null);
    }

    public void setTextColor(int i10) {
        org.telegram.ui.Components.b6 b6Var = this.f25779a;
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        org.telegram.ui.ActionBar.f7.V(b6Var, i10, u6Var);
        org.telegram.ui.ActionBar.f7.Z(this.f25780b, i10, u6Var);
    }

    @Override
    public final void updateColors() {
        int w02;
        boolean z10 = this.f25782f;
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        if (z10) {
            w02 = 0;
        } else {
            w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23374e7, u6Var);
        }
        setBackgroundColor(w02);
        int i10 = org.telegram.ui.ActionBar.y6.f7;
        this.f25779a.setTextColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        this.f25780b.setTextColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
    }

    public z3(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.e = 32;
        this.d = u6Var;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23374e7, this, u6Var);
        org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(getContext());
        this.f25779a = b6Var;
        b6Var.setTextSize(1, 14.0f);
        b6Var.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.y6.f7;
        org.telegram.ui.ActionBar.f7.V(b6Var, i11, u6Var);
        b6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        float f7 = i10;
        addView(b6Var, gb1.h(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f7, 0.0f, f7, 0.0f));
        y3 y3Var = new y3(getContext(), true, true, true, 0);
        this.f25780b = y3Var;
        y3Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        y3Var.b(0.9f, 420L, ds.h);
        y3Var.setTextSize(AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.f7.Z(y3Var, i11, u6Var);
        y3Var.setGravity(LocaleController.isRTL ? 3 : 5);
        FrameLayout.LayoutParams h10 = gb1.h(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f7, 0.0f, f7, 0.0f);
        this.f25781c = h10;
        addView(y3Var, h10);
        WeakHashMap weakHashMap = r0.i0.f47105a;
        new r0.w(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
