package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class o3 extends FrameLayout {
    public final TextView f48175a;
    public final TextView f48176b;
    public boolean f48177c;
    public final boolean d;

    public o3(i4 i4Var, Context context, boolean z10) {
        super(context);
        int i3;
        this.d = z10;
        setTag(90);
        TextView textView = new TextView(context);
        this.f48175a = textView;
        if (z10) {
            i3 = 2131746924;
        } else {
            i3 = 2131746925;
        }
        textView.setText(org.telegram.messenger.bd.M0(i3, null));
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        addView(textView, b8.mf.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f48176b = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setGravity(19);
        textView2.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        addView(textView2, b8.mf.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
    }
}
