package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.wp;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.zz0;
public abstract class b7 extends LinearLayout {
    public TextView f21732a;
    public p80 f21733b;
    public TextView f21734c;
    public TextView d;
    public int e;
    public int f21735f;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setType(int i10) {
        int i11 = this.f21735f;
        TextView textView = this.f21734c;
        p80 p80Var = this.f21733b;
        TextView textView2 = this.f21732a;
        TextView textView3 = this.d;
        this.e = i10;
        if (i10 == 0) {
            textView2.setText(dd.a0(null, null, 2131752156, org.telegram.messenger.m5.h(new StringBuilder("+"), wp.r1(i11).Z1(Long.valueOf(e20.i(i11).f15524n)).phone, af.b.c())));
            String L0 = dd.L0(2131752155, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L0);
            int indexOf = L0.indexOf("**");
            int lastIndexOf = L0.lastIndexOf("**");
            if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                try {
                    spannableStringBuilder.setSpan(new f51(dd.L0(2131752154, null), (zz0) null), indexOf, lastIndexOf - 2, 33);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
            p80Var.setText(spannableStringBuilder);
            textView.setText(dd.L0(2131752152, null));
            textView3.setVisibility(0);
            textView3.setText(dd.L0(2131752153, null));
        } else if (i10 == 1) {
            textView2.setText(dd.L0(2131742828, null));
            p80Var.setText(dd.L0(2131742827, null));
            textView.setText(dd.L0(2131742825, null));
            textView3.setVisibility(0);
            textView3.setText(dd.L0(2131742826, null));
        } else if (i10 == 2) {
            textView2.setText(dd.L0(2131749535, null));
            p80Var.setText(dd.L0(2131749536, null));
            textView.setText(dd.L0(2131749537, null));
            textView3.setVisibility(8);
        }
    }
}
