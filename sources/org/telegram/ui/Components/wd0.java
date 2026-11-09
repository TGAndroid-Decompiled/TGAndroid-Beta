package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class wd0 extends LinearLayout {
    public final int f40035a = 0;
    public final LinearLayout f40036b;
    public final LinearLayout f40037c;

    public wd0(Context context) {
        super(context);
        setOrientation(0);
        setGravity(17);
        setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        LinearLayout a10 = a(2131232331, org.telegram.messenger.id.M0(2131746271, null));
        this.f40037c = a10;
        addView(a10, c8.ha.o(-2, -1));
        LinearLayout a11 = a(2131231728, org.telegram.messenger.id.M0(2131751335, null));
        this.f40036b = a11;
        addView(a11, c8.ha.o(-2, -1));
    }

    public LinearLayout a(int i7, String str) {
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding(org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(7.0f));
        linearLayout.addView(org.telegram.messenger.camera.q.e(context, i7), c8.ha.k(0.0f, 0.0f, 8.0f, 0.0f, 24, 24));
        TextView textView = new TextView(context);
        textView.setGravity(16);
        textView.setText(str);
        textView.setTextSize(2, 14.0f);
        textView.setSingleLine(true);
        textView.setTextColor(-1);
        linearLayout.addView(textView, c8.ha.o(-2, -2));
        c8.ka.a(linearLayout);
        return linearLayout;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f40035a) {
            case 0:
                LinearLayout linearLayout = this.f40036b;
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                int paddingTop = getPaddingTop();
                int max = Math.max(0, size - paddingRight);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - (getPaddingBottom() + paddingTop)), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
                linearLayout.measure(makeMeasureSpec2, makeMeasureSpec);
                LinearLayout linearLayout2 = this.f40037c;
                linearLayout2.measure(makeMeasureSpec2, makeMeasureSpec);
                int min = Math.min(Math.max(linearLayout.getMeasuredWidth(), linearLayout2.getMeasuredWidth()), max / 2);
                layoutParams2.width = min;
                layoutParams.width = min;
                super.onMeasure(i7, i10);
                return;
            default:
                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), Integer.MIN_VALUE);
                int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
                LinearLayout linearLayout3 = this.f40036b;
                linearLayout3.measure(makeMeasureSpec3, makeMeasureSpec4);
                LinearLayout linearLayout4 = this.f40037c;
                if (linearLayout4 != null) {
                    linearLayout4.measure(View.MeasureSpec.makeMeasureSpec(linearLayout3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    setMeasuredDimension(linearLayout3.getMeasuredWidth(), linearLayout4.getMeasuredHeight() + linearLayout3.getMeasuredHeight());
                    return;
                }
                setMeasuredDimension(linearLayout3.getMeasuredWidth(), linearLayout3.getMeasuredHeight());
                return;
        }
    }

    public wd0(Context context, LinearLayout linearLayout, LinearLayout linearLayout2) {
        super(context);
        this.f40036b = linearLayout;
        this.f40037c = linearLayout2;
    }
}
