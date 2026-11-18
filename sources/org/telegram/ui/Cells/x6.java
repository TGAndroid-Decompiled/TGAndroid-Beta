package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.p41;
public abstract class x6 extends LinearLayout {
    public TextView f32423a;
    public k80 f32424b;
    public TextView f32425c;
    public TextView d;
    public int f32426e;
    public int f32427f;

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setType(int i7) {
        int i10 = this.f32427f;
        TextView textView = this.f32425c;
        k80 k80Var = this.f32424b;
        TextView textView2 = this.f32423a;
        TextView textView3 = this.d;
        this.f32426e = i7;
        if (i7 == 0) {
            textView2.setText(gd.a0(null, null, 2131752145, n10.h(new StringBuilder("+"), mp.u1(i10).c2(Long.valueOf(j10.i(i10).f24792n)).phone, pf.b.c())));
            String M0 = gd.M0(2131752144, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
            int indexOf = M0.indexOf("**");
            int lastIndexOf = M0.lastIndexOf("**");
            if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
                try {
                    spannableStringBuilder.setSpan(new p41(gd.M0(2131752143, null), (dz0) null), indexOf, lastIndexOf - 2, 33);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            k80Var.setText(spannableStringBuilder);
            textView.setText(gd.M0(2131752141, null));
            textView3.setVisibility(0);
            textView3.setText(gd.M0(2131752142, null));
        } else if (i7 == 1) {
            textView2.setText(gd.M0(2131742545, null));
            k80Var.setText(gd.M0(2131742544, null));
            textView.setText(gd.M0(2131742542, null));
            textView3.setVisibility(0);
            textView3.setText(gd.M0(2131742543, null));
        } else if (i7 == 2) {
            textView2.setText(gd.M0(2131749351, null));
            k80Var.setText(gd.M0(2131749352, null));
            textView.setText(gd.M0(2131749353, null));
            textView3.setVisibility(8);
        }
    }
}
