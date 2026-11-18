package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class zp extends FrameLayout {
    public final View f42926a;
    public final TextView f42927b;

    public zp(Context context) {
        super(context);
        View view = new View(context);
        this.f42926a = view;
        int L = org.telegram.messenger.g0.L(4.0f);
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        int v02 = org.telegram.ui.ActionBar.n6.v0(i7);
        int i10 = org.telegram.ui.ActionBar.n6.Hi;
        int v03 = org.telegram.ui.ActionBar.n6.v0(i10);
        Drawable k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, v02, v03, v03);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i10);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(view, k02, M, M2, null);
        addView(view, c8.ma.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView = new TextView(context);
        this.f42927b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.Ji, null, 1, 14.0f);
        addView(textView, c8.ma.e(-2, -2, 17));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
    }

    public void setText(CharSequence charSequence) {
        this.f42927b.setText(charSequence);
    }
}
