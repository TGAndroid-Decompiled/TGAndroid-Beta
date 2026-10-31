package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.yz0;
public abstract class b7 extends LinearLayout {
    public TextView f21731a;
    public p80 f21732b;
    public TextView f21733c;
    public TextView d;
    public int e;
    public int f21734f;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setType(int i10) {
        int i11 = this.f21734f;
        TextView textView = this.f21733c;
        p80 p80Var = this.f21732b;
        TextView textView2 = this.f21731a;
        TextView textView3 = this.d;
        this.e = i10;
        if (i10 == 0) {
            textView2.setText(cd.a0(null, null, 2131752156, org.telegram.messenger.m5.h(new StringBuilder("+"), vp.r1(i11).Z1(Long.valueOf(d20.i(i11).f15165n)).phone, af.b.c())));
            String L0 = cd.L0(2131752155, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L0);
            int indexOf = L0.indexOf("**");
            int lastIndexOf = L0.lastIndexOf("**");
            if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                try {
                    spannableStringBuilder.setSpan(new e51(cd.L0(2131752154, null), (yz0) null), indexOf, lastIndexOf - 2, 33);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
            p80Var.setText(spannableStringBuilder);
            textView.setText(cd.L0(2131752152, null));
            textView3.setVisibility(0);
            textView3.setText(cd.L0(2131752153, null));
        } else if (i10 == 1) {
            textView2.setText(cd.L0(2131742828, null));
            p80Var.setText(cd.L0(2131742827, null));
            textView.setText(cd.L0(2131742825, null));
            textView3.setVisibility(0);
            textView3.setText(cd.L0(2131742826, null));
        } else if (i10 == 2) {
            textView2.setText(cd.L0(2131749535, null));
            p80Var.setText(cd.L0(2131749536, null));
            textView.setText(cd.L0(2131749537, null));
            textView3.setVisibility(8);
        }
    }
}
