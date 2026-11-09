package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.x70;
public abstract class x6 extends LinearLayout {
    public TextView f30895a;
    public x70 f30896b;
    public TextView f30897c;
    public TextView d;
    public int f30898e;
    public int f30899f;

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setType(int i7) {
        int i10 = this.f30899f;
        TextView textView = this.f30897c;
        x70 x70Var = this.f30896b;
        TextView textView2 = this.f30895a;
        TextView textView3 = this.d;
        this.f30898e = i7;
        if (i7 == 0) {
            textView2.setText(id.a0(null, null, 2131752156, org.telegram.messenger.k5.i(new StringBuilder("+"), qp.s1(i10).a2(Long.valueOf(p10.i(i10).f24489n)).phone, pf.b.c())));
            String M0 = id.M0(2131752155, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
            int indexOf = M0.indexOf("**");
            int lastIndexOf = M0.lastIndexOf("**");
            if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                try {
                    spannableStringBuilder.setSpan(new c41(id.M0(2131752154, null), (vy0) null), indexOf, lastIndexOf - 2, 33);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            x70Var.setText(spannableStringBuilder);
            textView.setText(id.M0(2131752152, null));
            textView3.setVisibility(0);
            textView3.setText(id.M0(2131752153, null));
        } else if (i7 == 1) {
            textView2.setText(id.M0(2131742803, null));
            x70Var.setText(id.M0(2131742802, null));
            textView.setText(id.M0(2131742800, null));
            textView3.setVisibility(0);
            textView3.setText(id.M0(2131742801, null));
        } else if (i7 == 2) {
            textView2.setText(id.M0(2131749526, null));
            x70Var.setText(id.M0(2131749527, null));
            textView.setText(id.M0(2131749528, null));
            textView3.setVisibility(8);
        }
    }
}
