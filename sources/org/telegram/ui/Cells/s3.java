package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
public final class s3 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.Components.x5 f25638a;
    public final r3 f25639b;
    public final FrameLayout.LayoutParams f25640c;
    public final org.telegram.ui.ActionBar.c6 d;
    public int f25641e;
    public boolean f25642f;

    public s3(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, 16, c6Var);
    }

    public static void a(ArrayList arrayList, jl0 jl0Var) {
        int i10 = org.telegram.ui.ActionBar.g6.f23100f7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{s3.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{s3.class}, new String[]{"rightTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 16, new Class[]{s3.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23081e7));
    }

    public final void b(CharSequence charSequence, View.OnClickListener onClickListener) {
        r3 r3Var = this.f25639b;
        r3Var.c(charSequence, true, true);
        r3Var.setOnClickListener(onClickListener);
        r3Var.setVisibility(0);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.f25638a.setText(charSequence);
        r3 r3Var = this.f25639b;
        r3Var.c(charSequence2, false, true);
        r3Var.setOnClickListener(onClickListener);
        r3Var.setVisibility(0);
    }

    @Override
    public final void e() {
        int v02;
        boolean z10 = this.f25642f;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (z10) {
            v02 = 0;
        } else {
            v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23081e7, c6Var);
        }
        setBackgroundColor(v02);
        int i10 = org.telegram.ui.ActionBar.g6.f23100f7;
        this.f25638a.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        this.f25639b.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
    }

    public int[] getColorKeys() {
        return null;
    }

    public CharSequence getText() {
        return this.f25638a.getText();
    }

    public TextView getTextView() {
        return this.f25638a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f25641e), 1073741824));
    }

    public void setLayerHeight(int i10) {
        this.f25641e = i10;
        requestLayout();
    }

    public void setNoBackground(boolean z10) {
        this.f25642f = z10;
        e();
    }

    public void setRightText(CharSequence charSequence) {
        r3 r3Var = this.f25639b;
        r3Var.c(charSequence, true, true);
        r3Var.setVisibility(0);
    }

    public void setRightTextMargin(int i10) {
        float f9 = i10;
        int dp = AndroidUtilities.dp(f9);
        FrameLayout.LayoutParams layoutParams = this.f25640c;
        layoutParams.leftMargin = dp;
        layoutParams.rightMargin = AndroidUtilities.dp(f9);
        this.f25639b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.f25638a.setText(charSequence);
        r3 r3Var = this.f25639b;
        r3Var.setVisibility(8);
        r3Var.setOnClickListener(null);
    }

    public void setTextColor(int i10) {
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, this.d);
        this.f25638a.setTextColor(v02);
        this.f25639b.setTextColor(v02);
    }

    public s3(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f25641e = 32;
        this.d = c6Var;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23081e7, c6Var));
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(getContext());
        this.f25638a = x5Var;
        x5Var.setTextSize(1, 14.0f);
        x5Var.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.f23100f7;
        x5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        x5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        float f9 = i10;
        addView(x5Var, i7.f6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f9, 0.0f, f9, 0.0f));
        r3 r3Var = new r3(getContext(), true, true, true, 0);
        this.f25639b = r3Var;
        r3Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        r3Var.b(0.9f, 420L, jr.h);
        r3Var.setTextSize(AndroidUtilities.dp(14.0f));
        r3Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        r3Var.setGravity(LocaleController.isRTL ? 3 : 5);
        FrameLayout.LayoutParams d = i7.f6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f9, 0.0f, f9, 0.0f);
        this.f25640c = d;
        addView(r3Var, d);
        WeakHashMap weakHashMap = r0.j0.f46829a;
        new r0.x(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }
}
