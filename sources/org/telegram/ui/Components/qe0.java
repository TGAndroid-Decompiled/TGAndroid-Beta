package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class qe0 extends LinearLayout {
    public final int f29721a = 0;
    public final LinearLayout f29722b;
    public final LinearLayout f29723c;

    public qe0(Context context) {
        super(context);
        setOrientation(0);
        setGravity(17);
        setPadding(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f));
        LinearLayout a2 = a(2131232330, org.telegram.messenger.dd.L0(2131746286, null));
        this.f29723c = a2;
        addView(a2, w7.b6.o(-2, -1));
        LinearLayout a10 = a(2131231727, org.telegram.messenger.dd.L0(2131751336, null));
        this.f29722b = a10;
        addView(a10, w7.b6.o(-2, -1));
    }

    public LinearLayout a(int i10, String str) {
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding(org.telegram.messenger.i0.L(25.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(25.0f), org.telegram.messenger.i0.L(7.0f));
        linearLayout.addView(org.telegram.messenger.a30.e(context, i10), w7.b6.k(0.0f, 0.0f, 8.0f, 0.0f, 24, 24));
        TextView textView = new TextView(context);
        textView.setGravity(16);
        textView.setText(str);
        textView.setTextSize(2, 14.0f);
        textView.setSingleLine(true);
        textView.setTextColor(-1);
        linearLayout.addView(textView, w7.b6.o(-2, -2));
        w7.e6.a(linearLayout);
        return linearLayout;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f29721a) {
            case 0:
                LinearLayout linearLayout = this.f29722b;
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                int paddingTop = getPaddingTop();
                int max = Math.max(0, size - paddingRight);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - (getPaddingBottom() + paddingTop)), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
                linearLayout.measure(makeMeasureSpec2, makeMeasureSpec);
                LinearLayout linearLayout2 = this.f29723c;
                linearLayout2.measure(makeMeasureSpec2, makeMeasureSpec);
                int min = Math.min(Math.max(linearLayout.getMeasuredWidth(), linearLayout2.getMeasuredWidth()), max / 2);
                layoutParams2.width = min;
                layoutParams.width = min;
                super.onMeasure(i10, i11);
                return;
            default:
                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE);
                int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
                LinearLayout linearLayout3 = this.f29722b;
                linearLayout3.measure(makeMeasureSpec3, makeMeasureSpec4);
                LinearLayout linearLayout4 = this.f29723c;
                if (linearLayout4 != null) {
                    linearLayout4.measure(View.MeasureSpec.makeMeasureSpec(linearLayout3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    setMeasuredDimension(linearLayout3.getMeasuredWidth(), linearLayout4.getMeasuredHeight() + linearLayout3.getMeasuredHeight());
                    return;
                }
                setMeasuredDimension(linearLayout3.getMeasuredWidth(), linearLayout3.getMeasuredHeight());
                return;
        }
    }

    public qe0(Context context, LinearLayout linearLayout, LinearLayout linearLayout2) {
        super(context);
        this.f29722b = linearLayout;
        this.f29723c = linearLayout2;
    }
}
