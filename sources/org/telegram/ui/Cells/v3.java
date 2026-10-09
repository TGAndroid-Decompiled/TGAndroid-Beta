package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.qm0;
public final class v3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.a6 f23536a;
    public final u3 f23537b;
    public final FrameLayout.LayoutParams f23538c;
    public final org.telegram.ui.ActionBar.e6 d;
    public int f23539e;
    public boolean f23540f;

    public v3(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, 16, e6Var);
    }

    public static void a(ArrayList arrayList, qm0 qm0Var) {
        int i10 = org.telegram.ui.ActionBar.i6.f7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, new Class[]{v3.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, new Class[]{v3.class}, new String[]{"rightTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 16, new Class[]{v3.class}, null, null, null, org.telegram.ui.ActionBar.i6.e7));
    }

    public final void b(CharSequence charSequence, View.OnClickListener onClickListener) {
        u3 u3Var = this.f23537b;
        u3Var.c(charSequence, true, true);
        u3Var.setOnClickListener(onClickListener);
        u3Var.setVisibility(0);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.f23536a.setText(charSequence);
        u3 u3Var = this.f23537b;
        u3Var.c(charSequence2, false, true);
        u3Var.setOnClickListener(onClickListener);
        u3Var.setVisibility(0);
    }

    @Override
    public final void e() {
        int w02;
        boolean z10 = this.f23540f;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (z10) {
            w02 = 0;
        } else {
            w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.e7, e6Var);
        }
        setBackgroundColor(w02);
        int i10 = org.telegram.ui.ActionBar.i6.f7;
        this.f23536a.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        this.f23537b.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
    }

    public int[] getColorKeys() {
        return null;
    }

    public CharSequence getText() {
        return this.f23536a.getText();
    }

    public TextView getTextView() {
        return this.f23536a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f23539e), 1073741824));
    }

    public void setLayerHeight(int i10) {
        this.f23539e = i10;
        requestLayout();
    }

    public void setNoBackground(boolean z10) {
        this.f23540f = z10;
        e();
    }

    public void setRightText(CharSequence charSequence) {
        u3 u3Var = this.f23537b;
        u3Var.c(charSequence, true, true);
        u3Var.setVisibility(0);
    }

    public void setRightTextMargin(int i10) {
        float f7 = i10;
        int dp = AndroidUtilities.dp(f7);
        FrameLayout.LayoutParams layoutParams = this.f23538c;
        layoutParams.leftMargin = dp;
        layoutParams.rightMargin = AndroidUtilities.dp(f7);
        this.f23537b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.f23536a.setText(charSequence);
        u3 u3Var = this.f23537b;
        u3Var.setVisibility(8);
        u3Var.setOnClickListener(null);
    }

    public void setTextColor(int i10) {
        int w02 = org.telegram.ui.ActionBar.i6.w0(i10, this.d);
        this.f23536a.setTextColor(w02);
        this.f23537b.setTextColor(w02);
    }

    public v3(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f23539e = 32;
        this.d = e6Var;
        setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.e7, e6Var));
        org.telegram.ui.Components.a6 a6Var = new org.telegram.ui.Components.a6(getContext());
        this.f23536a = a6Var;
        a6Var.setTextSize(1, 14.0f);
        a6Var.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.i6.f7;
        a6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        a6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        float f7 = i10;
        addView(a6Var, w7.x5.a(-1.0f, f7, 0.0f, f7, 0.0f, -1, (LocaleController.isRTL ? 5 : 3) | 48));
        u3 u3Var = new u3(getContext(), true, true, true, 0);
        this.f23537b = u3Var;
        u3Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        u3Var.b(0.9f, 420L, hs.h);
        u3Var.setTextSize(AndroidUtilities.dp(14.0f));
        u3Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        u3Var.setGravity(LocaleController.isRTL ? 3 : 5);
        FrameLayout.LayoutParams a2 = w7.x5.a(-1.0f, f7, 0.0f, f7, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48);
        this.f23538c = a2;
        addView(u3Var, a2);
        WeakHashMap weakHashMap = r0.i0.f46766a;
        new r0.w(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }
}
