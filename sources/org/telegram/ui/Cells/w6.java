package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.z70;
public abstract class w6 extends LinearLayout {
    public TextView f31884a;
    public z70 f31885b;
    public TextView f31886c;
    public TextView d;
    public int f31887e;
    public int f31888f;

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setType(int i7) {
        int i10 = this.f31888f;
        TextView textView = this.f31886c;
        z70 z70Var = this.f31885b;
        TextView textView2 = this.f31884a;
        TextView textView3 = this.d;
        this.f31887e = i7;
        if (i7 == 0) {
            textView2.setText(hd.a0(null, null, 2131752156, org.telegram.messenger.k5.h(new StringBuilder("+"), np.s1(i10).a2(Long.valueOf(m10.i(i10).f24953n)).phone, pf.b.c())));
            String M0 = hd.M0(2131752155, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
            int indexOf = M0.indexOf("**");
            int lastIndexOf = M0.lastIndexOf("**");
            if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                try {
                    spannableStringBuilder.setSpan(new f41(hd.M0(2131752154, null), (wy0) null), indexOf, lastIndexOf - 2, 33);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            z70Var.setText(spannableStringBuilder);
            textView.setText(hd.M0(2131752152, null));
            textView3.setVisibility(0);
            textView3.setText(hd.M0(2131752153, null));
        } else if (i7 == 1) {
            textView2.setText(hd.M0(2131742803, null));
            z70Var.setText(hd.M0(2131742802, null));
            textView.setText(hd.M0(2131742800, null));
            textView3.setVisibility(0);
            textView3.setText(hd.M0(2131742801, null));
        } else if (i7 == 2) {
            textView2.setText(hd.M0(2131749526, null));
            z70Var.setText(hd.M0(2131749527, null));
            textView.setText(hd.M0(2131749528, null));
            textView3.setVisibility(8);
        }
    }
}
