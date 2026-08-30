package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sl0;
public final class u3 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.Components.t5 f22386a;
    public final t3 f22387b;
    public final FrameLayout.LayoutParams f22388c;
    public final org.telegram.ui.ActionBar.f6 d;
    public int e;
    public boolean f22389f;

    public u3(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, 16, f6Var);
    }

    public static void a(ArrayList arrayList, sl0 sl0Var) {
        int i10 = org.telegram.ui.ActionBar.j6.f19943f7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{u3.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, new Class[]{u3.class}, new String[]{"rightTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 16, new Class[]{u3.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19924e7));
    }

    public final void b(CharSequence charSequence, View.OnClickListener onClickListener) {
        t3 t3Var = this.f22387b;
        t3Var.c(charSequence, true, true);
        t3Var.setOnClickListener(onClickListener);
        t3Var.setVisibility(0);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.f22386a.setText(charSequence);
        t3 t3Var = this.f22387b;
        t3Var.c(charSequence2, false, true);
        t3Var.setOnClickListener(onClickListener);
        t3Var.setVisibility(0);
    }

    @Override
    public final void e() {
        int v02;
        boolean z4 = this.f22389f;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (z4) {
            v02 = 0;
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19924e7, f6Var);
        }
        setBackgroundColor(v02);
        int i10 = org.telegram.ui.ActionBar.j6.f19943f7;
        this.f22386a.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.f22387b.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
    }

    public int[] getColorKeys() {
        return null;
    }

    public CharSequence getText() {
        return this.f22386a.getText();
    }

    public TextView getTextView() {
        return this.f22386a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.e), 1073741824));
    }

    public void setLayerHeight(int i10) {
        this.e = i10;
        requestLayout();
    }

    public void setNoBackground(boolean z4) {
        this.f22389f = z4;
        e();
    }

    public void setRightText(CharSequence charSequence) {
        t3 t3Var = this.f22387b;
        t3Var.c(charSequence, true, true);
        t3Var.setVisibility(0);
    }

    public void setRightTextMargin(int i10) {
        float f10 = i10;
        int dp = AndroidUtilities.dp(f10);
        FrameLayout.LayoutParams layoutParams = this.f22388c;
        layoutParams.leftMargin = dp;
        layoutParams.rightMargin = AndroidUtilities.dp(f10);
        this.f22387b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.f22386a.setText(charSequence);
        t3 t3Var = this.f22387b;
        t3Var.setVisibility(8);
        t3Var.setOnClickListener(null);
    }

    public void setTextColor(int i10) {
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.d);
        this.f22386a.setTextColor(v02);
        this.f22387b.setTextColor(v02);
    }

    public u3(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = 32;
        this.d = f6Var;
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19924e7, f6Var));
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(getContext());
        this.f22386a = t5Var;
        t5Var.setTextSize(1, 14.0f);
        t5Var.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.j6.f19943f7;
        t5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        t5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        float f10 = i10;
        addView(t5Var, k7.b6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        t3 t3Var = new t3(getContext(), true, true, true, 0);
        this.f22387b = t3Var;
        t3Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        t3Var.b(0.9f, 420L, nr.h);
        t3Var.setTextSize(AndroidUtilities.dp(14.0f));
        t3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        t3Var.setGravity(LocaleController.isRTL ? 3 : 5);
        FrameLayout.LayoutParams d = k7.b6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f);
        this.f22388c = d;
        addView(t3Var, d);
        WeakHashMap weakHashMap = r0.j0.f43118a;
        new r0.x(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }
}
