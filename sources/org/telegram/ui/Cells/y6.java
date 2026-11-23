package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.s41;
public abstract class y6 extends LinearLayout {
    public TextView f32467a;
    public m80 f32468b;
    public TextView f32469c;
    public TextView d;
    public int f32470e;
    public int f32471f;

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setType(int i7) {
        int i10 = this.f32471f;
        TextView textView = this.f32469c;
        m80 m80Var = this.f32468b;
        TextView textView2 = this.f32467a;
        TextView textView3 = this.d;
        this.f32470e = i7;
        if (i7 == 0) {
            textView2.setText(hd.a0(null, null, 2131752144, o10.h(new StringBuilder("+"), np.u1(i10).c2(Long.valueOf(k10.i(i10).f24951n)).phone, pf.b.c())));
            String N0 = hd.N0(2131752143, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
            int indexOf = N0.indexOf("**");
            int lastIndexOf = N0.lastIndexOf("**");
            if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                try {
                    spannableStringBuilder.setSpan(new s41(hd.N0(2131752142, null), (fz0) null), indexOf, lastIndexOf - 2, 33);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            m80Var.setText(spannableStringBuilder);
            textView.setText(hd.N0(2131752140, null));
            textView3.setVisibility(0);
            textView3.setText(hd.N0(2131752141, null));
        } else if (i7 == 1) {
            textView2.setText(hd.N0(2131742539, null));
            m80Var.setText(hd.N0(2131742538, null));
            textView.setText(hd.N0(2131742536, null));
            textView3.setVisibility(0);
            textView3.setText(hd.N0(2131742537, null));
        } else if (i7 == 2) {
            textView2.setText(hd.N0(2131749350, null));
            m80Var.setText(hd.N0(2131749351, null));
            textView.setText(hd.N0(2131749352, null));
            textView3.setVisibility(8);
        }
    }
}
