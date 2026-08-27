package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;

public final class d60 extends org.telegram.ui.Cells.sa {
    public final TextView T;
    public final TextView U;

    public d60(Context context) {
        super(context, 6, 0, true);
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        TextView textView = new TextView(context);
        this.T = textView;
        org.telegram.messenger.y1.s(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f);
        linearLayoutG.addView(textView, h7.z5.q(-2, -2, 5));
        TextView textView2 = new TextView(context);
        this.U = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23441z6, false));
        textView2.setTextSize(1, 13.0f);
        linearLayoutG.addView(textView2, h7.z5.t(-2, -2, 5, 0, 1, 0, 0));
        addView(linearLayoutG, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
    }
}
