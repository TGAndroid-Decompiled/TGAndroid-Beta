package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pr;
public final class u3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.y5 f23343a;
    public final t3 f23344b;
    public final FrameLayout.LayoutParams f23345c;
    public final org.telegram.ui.ActionBar.f6 d;
    public int f23346e;
    public boolean f23347f;

    public u3(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, 16, f6Var);
    }

    public static void a(ArrayList arrayList, ll0 ll0Var) {
        int i10 = org.telegram.ui.ActionBar.j6.f7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ll0Var, 0, new Class[]{u3.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ll0Var, 0, new Class[]{u3.class}, new String[]{"rightTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ll0Var, 16, new Class[]{u3.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
    }

    public final void b(CharSequence charSequence, View.OnClickListener onClickListener) {
        t3 t3Var = this.f23344b;
        t3Var.c(charSequence, true, true);
        t3Var.setOnClickListener(onClickListener);
        t3Var.setVisibility(0);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.f23343a.setText(charSequence);
        t3 t3Var = this.f23344b;
        t3Var.c(charSequence2, false, true);
        t3Var.setOnClickListener(onClickListener);
        t3Var.setVisibility(0);
    }

    @Override
    public final void d() {
        int v02;
        boolean z10 = this.f23347f;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (z10) {
            v02 = 0;
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.e7, f6Var);
        }
        setBackgroundColor(v02);
        int i10 = org.telegram.ui.ActionBar.j6.f7;
        this.f23343a.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.f23344b.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
    }

    public int[] getColorKeys() {
        return null;
    }

    public CharSequence getText() {
        return this.f23343a.getText();
    }

    public TextView getTextView() {
        return this.f23343a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f23346e), 1073741824));
    }

    public void setLayerHeight(int i10) {
        this.f23346e = i10;
        requestLayout();
    }

    public void setNoBackground(boolean z10) {
        this.f23347f = z10;
        d();
    }

    public void setRightText(CharSequence charSequence) {
        t3 t3Var = this.f23344b;
        t3Var.c(charSequence, true, true);
        t3Var.setVisibility(0);
    }

    public void setRightTextMargin(int i10) {
        float f7 = i10;
        int dp = AndroidUtilities.dp(f7);
        FrameLayout.LayoutParams layoutParams = this.f23345c;
        layoutParams.leftMargin = dp;
        layoutParams.rightMargin = AndroidUtilities.dp(f7);
        this.f23344b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.f23343a.setText(charSequence);
        t3 t3Var = this.f23344b;
        t3Var.setVisibility(8);
        t3Var.setOnClickListener(null);
    }

    public void setTextColor(int i10) {
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.d);
        this.f23343a.setTextColor(v02);
        this.f23344b.setTextColor(v02);
    }

    public u3(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f23346e = 32;
        this.d = f6Var;
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.e7, f6Var));
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(getContext());
        this.f23343a = y5Var;
        y5Var.setTextSize(1, 14.0f);
        y5Var.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.j6.f7;
        y5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        y5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        float f7 = i10;
        addView(y5Var, w7.x5.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f7, 0.0f, f7, 0.0f));
        t3 t3Var = new t3(getContext(), true, true, true, 0);
        this.f23344b = t3Var;
        t3Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        t3Var.b(0.9f, 420L, pr.h);
        t3Var.setTextSize(AndroidUtilities.dp(14.0f));
        t3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        t3Var.setGravity(LocaleController.isRTL ? 3 : 5);
        FrameLayout.LayoutParams d = w7.x5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f7, 0.0f, f7, 0.0f);
        this.f23345c = d;
        addView(t3Var, d);
        WeakHashMap weakHashMap = r0.i0.f44725a;
        new r0.w(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }
}
