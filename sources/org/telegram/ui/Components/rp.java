package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class rp extends FrameLayout {
    public final View f29992a;
    public final TextView f29993b;

    public rp(Context context) {
        super(context);
        View view = new View(context);
        this.f29992a = view;
        int L = org.telegram.messenger.i0.L(4.0f);
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        int v02 = org.telegram.ui.ActionBar.t6.v0(i10);
        int i11 = org.telegram.ui.ActionBar.t6.Ei;
        int v03 = org.telegram.ui.ActionBar.t6.v0(i11);
        Drawable k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, v02, v03, v03);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i11);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(view, k02, N, N2, null);
        addView(view, w7.b6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView = new TextView(context);
        this.f29993b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.Gi, null, 1, 14.0f);
        addView(textView, w7.b6.e(-2, -2, 17));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(80.0f), 1073741824));
    }

    public void setText(CharSequence charSequence) {
        this.f29993b.setText(charSequence);
    }
}
