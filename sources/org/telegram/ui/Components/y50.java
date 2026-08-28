package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
public final class y50 extends org.telegram.ui.Cells.va {
    public final TextView T;
    public final TextView U;

    public y50(Context context) {
        super(context, 6, 0, true);
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        TextView textView = new TextView(context);
        this.T = textView;
        org.telegram.messenger.l0.q(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), 1, 16.0f);
        f10.addView(textView, g7.e6.q(-2, -2, 5));
        TextView textView2 = new TextView(context);
        this.U = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23386z6, false));
        textView2.setTextSize(1, 13.0f);
        f10.addView(textView2, g7.e6.t(-2, -2, 5, 0, 1, 0, 0));
        addView(f10, g7.e6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
    }
}
