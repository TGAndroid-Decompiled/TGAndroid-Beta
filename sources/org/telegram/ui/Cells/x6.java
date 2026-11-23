package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.r41;
public abstract class x6 extends LinearLayout {
    public TextView f32416a;
    public j80 f32417b;
    public TextView f32418c;
    public TextView d;
    public int f32419e;
    public int f32420f;

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setType(int i7) {
        int i10 = this.f32420f;
        TextView textView = this.f32418c;
        j80 j80Var = this.f32417b;
        TextView textView2 = this.f32416a;
        TextView textView3 = this.d;
        this.f32419e = i7;
        if (i7 == 0) {
            textView2.setText(gd.a0(null, null, 2131752144, m10.h(new StringBuilder("+"), mp.u1(i10).c2(Long.valueOf(i10.i(i10).f24656n)).phone, pf.b.c())));
            String N0 = gd.N0(2131752143, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
            int indexOf = N0.indexOf("**");
            int lastIndexOf = N0.lastIndexOf("**");
            if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                try {
                    spannableStringBuilder.setSpan(new r41(gd.N0(2131752142, null), (ez0) null), indexOf, lastIndexOf - 2, 33);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            j80Var.setText(spannableStringBuilder);
            textView.setText(gd.N0(2131752140, null));
            textView3.setVisibility(0);
            textView3.setText(gd.N0(2131752141, null));
        } else if (i7 == 1) {
            textView2.setText(gd.N0(2131742532, null));
            j80Var.setText(gd.N0(2131742531, null));
            textView.setText(gd.N0(2131742529, null));
            textView3.setVisibility(0);
            textView3.setText(gd.N0(2131742530, null));
        } else if (i7 == 2) {
            textView2.setText(gd.N0(2131749350, null));
            j80Var.setText(gd.N0(2131749351, null));
            textView.setText(gd.N0(2131749352, null));
            textView3.setVisibility(8);
        }
    }
}
