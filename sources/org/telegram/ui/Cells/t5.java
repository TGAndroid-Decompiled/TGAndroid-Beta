package org.telegram.ui.Cells;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.RadioButton;
public final class t5 extends FrameLayout {
    public final TextView f31831a;
    public final LinearLayout f31832b;
    public View.OnClickListener f31833c;
    public int d;
    public final int[] f31834e;

    public t5(Context context) {
        super(context);
        this.f31834e = new int[]{0, -45747, -753630, -13056, -8269183, -9321002, -16747844, -10080879};
        TextView textView = new TextView(context);
        this.f31831a = textView;
        textView.setGravity(5);
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.ma.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f31832b = linearLayout;
        linearLayout.setOrientation(0);
        for (int i7 = 0; i7 < this.f31834e.length; i7++) {
            RadioButton radioButton = new RadioButton(context);
            radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
            radioButton.setTag(Integer.valueOf(i7));
            this.f31832b.addView(radioButton, c8.ma.l(1.0f / this.f31834e.length, 0, -1));
            radioButton.setOnClickListener(new a(this, 8));
        }
        addView(this.f31832b, c8.ma.d(-1, 40.0f, 51, 96.0f, 0.0f, 24.0f, 0.0f));
    }

    public final void a(int i7, String str) {
        this.d = i7;
        this.f31831a.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        b(false);
    }

    public final void b(boolean z10) {
        boolean z11;
        int i7;
        LinearLayout linearLayout = this.f31832b;
        int childCount = linearLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = linearLayout.getChildAt(i10);
            if (childAt instanceof RadioButton) {
                RadioButton radioButton = (RadioButton) childAt;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                int[] iArr = this.f31834e;
                if (this.d == iArr[intValue]) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                radioButton.a(z11, z10);
                int i11 = -1;
                if (intValue == 0) {
                    i7 = -1;
                } else {
                    i7 = iArr[intValue];
                }
                if (intValue != 0) {
                    i11 = iArr[intValue];
                }
                radioButton.b(i7, i11);
            }
        }
    }

    public int getCurrentColor() {
        return this.d;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f31833c = onClickListener;
    }
}
