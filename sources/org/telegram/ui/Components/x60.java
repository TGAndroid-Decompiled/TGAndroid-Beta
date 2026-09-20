package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
public final class x60 extends org.telegram.ui.Cells.ab {
    public final TextView f30178a0;
    public final TextView f30179b0;

    public x60(Context context) {
        super(context, 6, 0, true);
        LinearLayout f7 = org.telegram.messenger.rk.f(context, 1);
        TextView textView = new TextView(context);
        this.f30178a0 = textView;
        org.telegram.messenger.l0.p(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f);
        f7.addView(textView, w7.y5.q(-2, -2, 5));
        TextView textView2 = new TextView(context);
        this.f30179b0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19496z6, false));
        textView2.setTextSize(1, 13.0f);
        f7.addView(textView2, w7.y5.t(-2, -2, 5, 0, 1, 0, 0));
        addView(f7, w7.y5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
    }
}
