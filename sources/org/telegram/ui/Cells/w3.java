package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.yl0;
public final class w3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.x5 f21801a;
    public final v3 f21802b;
    public final FrameLayout.LayoutParams f21803c;
    public final org.telegram.ui.ActionBar.f6 d;
    public int e;
    public boolean f21804f;

    public w3(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, 16, f6Var);
    }

    public static void a(ArrayList arrayList, yl0 yl0Var) {
        int i10 = org.telegram.ui.ActionBar.j6.f7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(yl0Var, 0, new Class[]{w3.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(yl0Var, 0, new Class[]{w3.class}, new String[]{"rightTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(yl0Var, 16, new Class[]{w3.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
    }

    public final void b(CharSequence charSequence, View.OnClickListener onClickListener) {
        v3 v3Var = this.f21802b;
        v3Var.c(charSequence, true, true);
        v3Var.setOnClickListener(onClickListener);
        v3Var.setVisibility(0);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.f21801a.setText(charSequence);
        v3 v3Var = this.f21802b;
        v3Var.c(charSequence2, false, true);
        v3Var.setOnClickListener(onClickListener);
        v3Var.setVisibility(0);
    }

    @Override
    public final void e() {
        int v02;
        boolean z10 = this.f21804f;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (z10) {
            v02 = 0;
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.e7, f6Var);
        }
        setBackgroundColor(v02);
        int i10 = org.telegram.ui.ActionBar.j6.f7;
        this.f21801a.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.f21802b.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
    }

    public int[] getColorKeys() {
        return null;
    }

    public CharSequence getText() {
        return this.f21801a.getText();
    }

    public TextView getTextView() {
        return this.f21801a;
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
        this.f21804f = z10;
        e();
    }

    public void setRightText(CharSequence charSequence) {
        v3 v3Var = this.f21802b;
        v3Var.c(charSequence, true, true);
        v3Var.setVisibility(0);
    }

    public void setRightTextMargin(int i10) {
        float f7 = i10;
        int dp = AndroidUtilities.dp(f7);
        FrameLayout.LayoutParams layoutParams = this.f21803c;
        layoutParams.leftMargin = dp;
        layoutParams.rightMargin = AndroidUtilities.dp(f7);
        this.f21802b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.f21801a.setText(charSequence);
        v3 v3Var = this.f21802b;
        v3Var.setVisibility(8);
        v3Var.setOnClickListener(null);
    }

    public void setTextColor(int i10) {
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.d);
        this.f21801a.setTextColor(v02);
        this.f21802b.setTextColor(v02);
    }

    public w3(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = 32;
        this.d = f6Var;
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.e7, f6Var));
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(getContext());
        this.f21801a = x5Var;
        x5Var.setTextSize(1, 14.0f);
        x5Var.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.j6.f7;
        x5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        x5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        float f7 = i10;
        addView(x5Var, w7.y5.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f7, 0.0f, f7, 0.0f));
        v3 v3Var = new v3(getContext(), true, true, true, 0);
        this.f21802b = v3Var;
        v3Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        v3Var.b(0.9f, 420L, qr.h);
        v3Var.setTextSize(AndroidUtilities.dp(14.0f));
        v3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        v3Var.setGravity(LocaleController.isRTL ? 3 : 5);
        FrameLayout.LayoutParams d = w7.y5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f7, 0.0f, f7, 0.0f);
        this.f21803c = d;
        addView(v3Var, d);
        WeakHashMap weakHashMap = r0.i0.f42163a;
        new r0.w(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }
}
