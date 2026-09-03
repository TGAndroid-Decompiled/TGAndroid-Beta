package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rl0;
public final class t3 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.Components.t5 f22320a;
    public final s3 f22321b;
    public final FrameLayout.LayoutParams f22322c;
    public final org.telegram.ui.ActionBar.f6 d;
    public int e;
    public boolean f22323f;

    public t3(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, 16, f6Var);
    }

    public static void a(ArrayList arrayList, rl0 rl0Var) {
        int i10 = org.telegram.ui.ActionBar.j6.f19918f7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(rl0Var, 0, new Class[]{t3.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rl0Var, 0, new Class[]{t3.class}, new String[]{"rightTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rl0Var, 16, new Class[]{t3.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19899e7));
    }

    public final void b(CharSequence charSequence, View.OnClickListener onClickListener) {
        s3 s3Var = this.f22321b;
        s3Var.c(charSequence, true, true);
        s3Var.setOnClickListener(onClickListener);
        s3Var.setVisibility(0);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.f22320a.setText(charSequence);
        s3 s3Var = this.f22321b;
        s3Var.c(charSequence2, false, true);
        s3Var.setOnClickListener(onClickListener);
        s3Var.setVisibility(0);
    }

    @Override
    public final void e() {
        int v02;
        boolean z4 = this.f22323f;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (z4) {
            v02 = 0;
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19899e7, f6Var);
        }
        setBackgroundColor(v02);
        int i10 = org.telegram.ui.ActionBar.j6.f19918f7;
        this.f22320a.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.f22321b.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
    }

    public int[] getColorKeys() {
        return null;
    }

    public CharSequence getText() {
        return this.f22320a.getText();
    }

    public TextView getTextView() {
        return this.f22320a;
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
        this.f22323f = z4;
        e();
    }

    public void setRightText(CharSequence charSequence) {
        s3 s3Var = this.f22321b;
        s3Var.c(charSequence, true, true);
        s3Var.setVisibility(0);
    }

    public void setRightTextMargin(int i10) {
        float f10 = i10;
        int dp = AndroidUtilities.dp(f10);
        FrameLayout.LayoutParams layoutParams = this.f22322c;
        layoutParams.leftMargin = dp;
        layoutParams.rightMargin = AndroidUtilities.dp(f10);
        this.f22321b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.f22320a.setText(charSequence);
        s3 s3Var = this.f22321b;
        s3Var.setVisibility(8);
        s3Var.setOnClickListener(null);
    }

    public void setTextColor(int i10) {
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.d);
        this.f22320a.setTextColor(v02);
        this.f22321b.setTextColor(v02);
    }

    public t3(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = 32;
        this.d = f6Var;
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19899e7, f6Var));
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(getContext());
        this.f22320a = t5Var;
        t5Var.setTextSize(1, 14.0f);
        t5Var.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.j6.f19918f7;
        t5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        t5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        float f10 = i10;
        addView(t5Var, k7.b6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        s3 s3Var = new s3(getContext(), true, true, true, 0);
        this.f22321b = s3Var;
        s3Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        s3Var.b(0.9f, 420L, mr.h);
        s3Var.setTextSize(AndroidUtilities.dp(14.0f));
        s3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        s3Var.setGravity(LocaleController.isRTL ? 3 : 5);
        FrameLayout.LayoutParams d = k7.b6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f);
        this.f22322c = d;
        addView(s3Var, d);
        WeakHashMap weakHashMap = r0.j0.f43142a;
        new r0.x(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }
}
