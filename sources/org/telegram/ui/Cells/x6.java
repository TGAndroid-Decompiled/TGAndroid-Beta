package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.w70;
public abstract class x6 extends LinearLayout {
    public TextView f30890a;
    public w70 f30891b;
    public TextView f30892c;
    public TextView d;
    public int f30893e;
    public int f30894f;

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setType(int i7) {
        int i10 = this.f30894f;
        TextView textView = this.f30892c;
        w70 w70Var = this.f30891b;
        TextView textView2 = this.f30890a;
        TextView textView3 = this.d;
        this.f30893e = i7;
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
                    spannableStringBuilder.setSpan(new b41(id.M0(2131752154, null), (uy0) null), indexOf, lastIndexOf - 2, 33);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            w70Var.setText(spannableStringBuilder);
            textView.setText(id.M0(2131752152, null));
            textView3.setVisibility(0);
            textView3.setText(id.M0(2131752153, null));
        } else if (i7 == 1) {
            textView2.setText(id.M0(2131742806, null));
            w70Var.setText(id.M0(2131742805, null));
            textView.setText(id.M0(2131742803, null));
            textView3.setVisibility(0);
            textView3.setText(id.M0(2131742804, null));
        } else if (i7 == 2) {
            textView2.setText(id.M0(2131749527, null));
            w70Var.setText(id.M0(2131749528, null));
            textView.setText(id.M0(2131749529, null));
            textView3.setVisibility(8);
        }
    }
}
