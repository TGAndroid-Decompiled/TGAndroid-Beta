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
    public final TextView f22399a;
    public final LinearLayout f22400b;
    public View.OnClickListener f22401c;
    public int d;
    public final int[] e;

    public u5(Context context) {
        super(context);
        this.e = new int[]{0, -45747, -753630, -13056, -8269183, -9321002, -16747844, -10080879};
        TextView textView = new TextView(context);
        this.f22399a = textView;
        textView.setGravity(5);
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, k7.b6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f22400b = linearLayout;
        linearLayout.setOrientation(0);
        for (int i10 = 0; i10 < this.e.length; i10++) {
            RadioButton radioButton = new RadioButton(context);
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.setTag(Integer.valueOf(i10));
            this.f22400b.addView(radioButton, k7.b6.l(1.0f / this.e.length, 0, -1));
            radioButton.setOnClickListener(new a(this, 8));
        }
        addView(this.f22400b, k7.b6.d(-1, 40.0f, 51, 96.0f, 0.0f, 24.0f, 0.0f));
    }

    public final void a(int i10, String str) {
        this.d = i10;
        this.f22399a.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        b(false);
    }

    public final void b(boolean z4) {
        boolean z10;
        int i10;
        LinearLayout linearLayout = this.f22400b;
        int childCount = linearLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayout.getChildAt(i11);
            if (childAt instanceof RadioButton) {
                RadioButton radioButton = (RadioButton) childAt;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                int[] iArr = this.e;
                if (this.d == iArr[intValue]) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                radioButton.a(z10, z4);
                int i12 = -1;
                if (intValue == 0) {
                    i10 = -1;
                } else {
                    i10 = iArr[intValue];
                }
                if (intValue != 0) {
                    i12 = iArr[intValue];
                }
                radioButton.b(i10, i12);
            }
        }
    }

    public int getCurrentColor() {
        return this.d;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f22401c = onClickListener;
    }
}
