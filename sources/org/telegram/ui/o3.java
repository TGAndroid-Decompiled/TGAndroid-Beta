package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class o3 extends FrameLayout {
    public final TextView f40123a;
    public final TextView f40124b;
    public boolean f40125c;
    public final boolean d;

    public o3(h4 h4Var, Context context, boolean z10) {
        super(context);
        int i10;
        this.d = z10;
        setTag(90);
        TextView textView = new TextView(context);
        this.f40123a = textView;
        if (z10) {
            i10 = 2131746931;
        } else {
            i10 = 2131746932;
        }
        textView.setText(org.telegram.messenger.cd.L0(i10, null));
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        addView(textView, w7.b6.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f40124b = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setGravity(19);
        textView2.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        addView(textView2, w7.b6.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(44.0f), 1073741824));
    }
}
