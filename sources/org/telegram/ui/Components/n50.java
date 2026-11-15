package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class n50 extends org.telegram.ui.Cells.pa {
    public final TextView f37455c0;
    public final TextView f37456d0;

    public n50(Context context) {
        super(context, 6, 0, true);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        TextView textView = new TextView(context);
        this.f37455c0 = textView;
        org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.G6, null, 1, 16.0f);
        f10.addView(textView, c8.ja.r(-2, -2, 5));
        TextView textView2 = new TextView(context);
        this.f37456d0 = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29260z6, null);
        textView2.setTextSize(1, 13.0f);
        f10.addView(textView2, c8.ja.t(-2, -2, 5, 0, 1, 0, 0));
        addView(f10, c8.ja.d(-2, -2.0f, (org.telegram.messenger.hd.f24101a0 ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
    }
}
