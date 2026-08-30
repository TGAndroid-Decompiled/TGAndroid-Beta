package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
public final class q60 extends org.telegram.ui.Cells.va {
    public final TextView U;
    public final TextView V;

    public q60(Context context) {
        super(context, 6, 0, true);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        TextView textView = new TextView(context);
        this.U = textView;
        org.telegram.messenger.y3.t(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f);
        f10.addView(textView, k7.b6.q(-2, -2, 5));
        TextView textView2 = new TextView(context);
        this.V = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20298z6, false));
        textView2.setTextSize(1, 13.0f);
        f10.addView(textView2, k7.b6.t(-2, -2, 5, 0, 1, 0, 0));
        addView(f10, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
    }
}
