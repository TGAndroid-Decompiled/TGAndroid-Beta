package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
public final class k70 extends org.telegram.ui.Cells.wa {
    public final TextView f27902b0;
    public final TextView f27903c0;

    public k70(Context context) {
        super(context, 6, 0, true);
        LinearLayout e = org.telegram.messenger.sl.e(context, 1);
        TextView textView = new TextView(context);
        this.f27902b0 = textView;
        org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.G6, null, 1, 16.0f);
        e.addView(textView, w7.z5.q(-2, -2, 5));
        TextView textView2 = new TextView(context);
        this.f27903c0 = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21588z6, null);
        textView2.setTextSize(1, 13.0f);
        e.addView(textView2, w7.z5.t(-2, -2, 5, 0, 1, 0, 0));
        addView(e, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
    }
}
