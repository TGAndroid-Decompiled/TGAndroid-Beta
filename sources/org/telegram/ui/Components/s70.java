package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
public final class s70 extends org.telegram.ui.Cells.xa {
    public final TextView f30658a0;
    public final TextView f30659b0;

    public s70(Context context) {
        super(6, 0, context, true);
        LinearLayout e7 = org.telegram.messenger.ai.e(context, 1);
        TextView textView = new TextView(context);
        this.f30658a0 = textView;
        org.telegram.messenger.q.m(16.0f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false), 1, textView);
        e7.addView(textView, w7.x5.q(-2, -2, 5));
        TextView textView2 = new TextView(context);
        this.f30659b0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21189z6, false));
        textView2.setTextSize(1, 13.0f);
        e7.addView(textView2, w7.x5.t(-2, -2, 5, 0, 1, 0, 0));
        addView(e7, w7.x5.a(-2.0f, 18.0f, 0.0f, 18.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 16));
    }
}
