package org.telegram.ui.Cells;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadioButton;
public final class u5 extends FrameLayout {
    public final TextView f25744a;
    public final LinearLayout f25745b;
    public View.OnClickListener f25746c;
    public int d;
    public final int[] f25747e;

    public u5(Context context) {
        super(context);
        this.f25747e = new int[]{0, -45747, -753630, -13056, -8269183, -9321002, -16747844, -10080879};
        TextView textView = new TextView(context);
        this.f25744a = textView;
        textView.setGravity(5);
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, g7.e6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f25745b = linearLayout;
        linearLayout.setOrientation(0);
        for (int i9 = 0; i9 < this.f25747e.length; i9++) {
            RadioButton radioButton = new RadioButton(context);
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.setTag(Integer.valueOf(i9));
            this.f25745b.addView(radioButton, g7.e6.l(1.0f / this.f25747e.length, 0, -1));
            radioButton.setOnClickListener(new a(this, 8));
        }
        addView(this.f25745b, g7.e6.d(-1, 40.0f, 51, 96.0f, 0.0f, 24.0f, 0.0f));
    }

    public final void a(int i9, String str) {
        this.d = i9;
        this.f25744a.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        b(false);
    }

    public final void b(boolean z10) {
        boolean z11;
        int i9;
        LinearLayout linearLayout = this.f25745b;
        int childCount = linearLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = linearLayout.getChildAt(i10);
            if (childAt instanceof RadioButton) {
                RadioButton radioButton = (RadioButton) childAt;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                int[] iArr = this.f25747e;
                if (this.d == iArr[intValue]) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                radioButton.a(z11, z10);
                int i11 = -1;
                if (intValue == 0) {
                    i9 = -1;
                } else {
                    i9 = iArr[intValue];
                }
                if (intValue != 0) {
                    i11 = iArr[intValue];
                }
                radioButton.b(i9, i11);
            }
        }
    }

    public int getCurrentColor() {
        return this.d;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f25746c = onClickListener;
    }
}
