package org.telegram.ui.Cells;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.RadioButton;
public final class r5 extends FrameLayout {
    public final TextView f30185a;
    public final LinearLayout f30186b;
    public View.OnClickListener f30187c;
    public int d;
    public final int[] f30188e;

    public r5(Context context) {
        super(context);
        this.f30188e = new int[]{0, -45747, -753630, -13056, -8269183, -9321002, -16747844, -10080879};
        TextView textView = new TextView(context);
        this.f30185a = textView;
        textView.setGravity(5);
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.ha.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f30186b = linearLayout;
        linearLayout.setOrientation(0);
        for (int i7 = 0; i7 < this.f30188e.length; i7++) {
            RadioButton radioButton = new RadioButton(context);
            radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
            radioButton.setTag(Integer.valueOf(i7));
            this.f30186b.addView(radioButton, c8.ha.l(1.0f / this.f30188e.length, 0, -1));
            radioButton.setOnClickListener(new a(this, 8));
        }
        addView(this.f30186b, c8.ha.d(-1, 40.0f, 51, 96.0f, 0.0f, 24.0f, 0.0f));
    }

    public final void a(int i7, String str) {
        this.d = i7;
        this.f30185a.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        b(false);
    }

    public final void b(boolean z9) {
        boolean z10;
        int i7;
        LinearLayout linearLayout = this.f30186b;
        int childCount = linearLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = linearLayout.getChildAt(i10);
            if (childAt instanceof RadioButton) {
                RadioButton radioButton = (RadioButton) childAt;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                int[] iArr = this.f30188e;
                if (this.d == iArr[intValue]) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                radioButton.a(z10, z9);
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
        this.f30187c = onClickListener;
    }
}
