package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class n3 extends FrameLayout {
    public final TextView f48102a;
    public final TextView f48103b;
    public boolean f48104c;
    public final boolean d;

    public n3(g4 g4Var, Context context, boolean z9) {
        super(context);
        int i7;
        this.d = z9;
        setTag(90);
        TextView textView = new TextView(context);
        this.f48102a = textView;
        if (z9) {
            i7 = 2131746916;
        } else {
            i7 = 2131746917;
        }
        textView.setText(org.telegram.messenger.id.M0(i7, null));
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        addView(textView, c8.ha.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f48103b = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setGravity(19);
        textView2.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        addView(textView2, c8.ha.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
    }
}
