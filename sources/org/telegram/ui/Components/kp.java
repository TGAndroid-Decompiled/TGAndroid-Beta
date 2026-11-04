package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class kp extends FrameLayout {
    public final View f35458a;
    public final TextView f35459b;

    public kp(Context context) {
        super(context);
        View view = new View(context);
        this.f35458a = view;
        int L = org.telegram.messenger.g0.L(4.0f);
        int i3 = org.telegram.ui.ActionBar.k6.Ci;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i3);
        int i10 = org.telegram.ui.ActionBar.k6.Ei;
        int v03 = org.telegram.ui.ActionBar.k6.v0(i10);
        Drawable k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, v02, v03, v03);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i10);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(view, k02, N, N2, null);
        addView(view, b8.mf.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView = new TextView(context);
        this.f35459b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.Gi, null, 1, 14.0f);
        addView(textView, b8.mf.e(-2, -2, 17));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
    }

    public void setText(CharSequence charSequence) {
        this.f35459b.setText(charSequence);
    }
}
