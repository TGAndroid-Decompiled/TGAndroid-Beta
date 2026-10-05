package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
public final class d70 extends org.telegram.ui.Cells.za {
    public final TextView f25697a0;
    public final TextView f25698b0;

    public d70(Context context) {
        super(context, 6, 0, true);
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        TextView textView = new TextView(context);
        this.f25697a0 = textView;
        org.telegram.messenger.q.q(textView, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false), 1, 16.0f);
        e7.addView(textView, w7.z5.q(-2, -2, 5));
        TextView textView2 = new TextView(context);
        this.f25698b0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21233z6, false));
        textView2.setTextSize(1, 13.0f);
        e7.addView(textView2, w7.z5.t(-2, -2, 5, 0, 1, 0, 0));
        addView(e7, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
    }
}
