package org.telegram.ui.Cells;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.ui.Components.RadioButton;
public final class r5 extends FrameLayout {
    public final TextView f30266a;
    public final LinearLayout f30267b;
    public View.OnClickListener f30268c;
    public int d;
    public final int[] f30269e;

    public r5(Context context) {
        super(context);
        this.f30269e = new int[]{0, -45747, -753630, -13056, -8269183, -9321002, -16747844, -10080879};
        TextView textView = new TextView(context);
        this.f30266a = textView;
        textView.setGravity(5);
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, mf.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f30267b = linearLayout;
        linearLayout.setOrientation(0);
        for (int i3 = 0; i3 < this.f30269e.length; i3++) {
            RadioButton radioButton = new RadioButton(context);
            radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
            radioButton.setTag(Integer.valueOf(i3));
            this.f30267b.addView(radioButton, mf.l(1.0f / this.f30269e.length, 0, -1));
            radioButton.setOnClickListener(new a(this, 8));
        }
        addView(this.f30267b, mf.d(-1, 40.0f, 51, 96.0f, 0.0f, 24.0f, 0.0f));
    }

    public final void a(int i3, String str) {
        this.d = i3;
        this.f30266a.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        b(false);
    }

    public final void b(boolean z10) {
        boolean z11;
        int i3;
        LinearLayout linearLayout = this.f30267b;
        int childCount = linearLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = linearLayout.getChildAt(i10);
            if (childAt instanceof RadioButton) {
                RadioButton radioButton = (RadioButton) childAt;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                int[] iArr = this.f30269e;
                if (this.d == iArr[intValue]) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                radioButton.a(z11, z10);
                int i11 = -1;
                if (intValue == 0) {
                    i3 = -1;
                } else {
                    i3 = iArr[intValue];
                }
                if (intValue != 0) {
                    i11 = iArr[intValue];
                }
                radioButton.b(i3, i11);
            }
        }
    }

    public int getCurrentColor() {
        return this.d;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f30268c = onClickListener;
    }
}
