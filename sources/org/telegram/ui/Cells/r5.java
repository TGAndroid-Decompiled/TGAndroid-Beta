package org.telegram.ui.Cells;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadioButton;

public final class r5 extends FrameLayout {

    public final TextView f25216a;

    public final LinearLayout f25217b;

    public View.OnClickListener f25218c;
    public int d;

    public final int[] f25219e;

    public r5(Context context) {
        super(context);
        this.f25219e = new int[]{0, -45747, -753630, -13056, -8269183, -9321002, -16747844, -10080879};
        TextView textView = new TextView(context);
        this.f25216a = textView;
        textView.setGravity(5);
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, h7.z5.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f25217b = linearLayout;
        linearLayout.setOrientation(0);
        for (int i10 = 0; i10 < this.f25219e.length; i10++) {
            RadioButton radioButton = new RadioButton(context);
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.setTag(Integer.valueOf(i10));
            this.f25217b.addView(radioButton, h7.z5.l(1.0f / this.f25219e.length, 0, -1));
            radioButton.setOnClickListener(new a(this, 8));
        }
        addView(this.f25217b, h7.z5.d(-1, 40.0f, 51, 96.0f, 0.0f, 24.0f, 0.0f));
    }

    public final void a(int i10, String str) {
        this.d = i10;
        this.f25216a.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        b(false);
    }

    public final void b(boolean z10) {
        LinearLayout linearLayout = this.f25217b;
        int childCount = linearLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = linearLayout.getChildAt(i10);
            if (childAt instanceof RadioButton) {
                RadioButton radioButton = (RadioButton) childAt;
                int iIntValue = ((Integer) radioButton.getTag()).intValue();
                int[] iArr = this.f25219e;
                radioButton.a(this.d == iArr[iIntValue], z10);
                radioButton.b(iIntValue == 0 ? -1 : iArr[iIntValue], iIntValue != 0 ? iArr[iIntValue] : -1);
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
        this.f25218c = onClickListener;
    }
}
