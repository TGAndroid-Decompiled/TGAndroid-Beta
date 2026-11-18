package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class n3 extends FrameLayout {
    public final TextView f50070a;
    public final TextView f50071b;
    public boolean f50072c;
    public final boolean d;

    public n3(g4 g4Var, Context context, boolean z10) {
        super(context);
        int i7;
        this.d = z10;
        setTag(90);
        TextView textView = new TextView(context);
        this.f50070a = textView;
        if (z10) {
            i7 = 2131746723;
        } else {
            i7 = 2131746724;
        }
        org.telegram.messenger.n10.l(12.0f, i7, 1, textView, null);
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        addView(textView, c8.ma.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f50071b = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setGravity(19);
        textView2.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        addView(textView2, c8.ma.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
    }
}
