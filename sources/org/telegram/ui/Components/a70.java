package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
public final class a70 extends org.telegram.ui.Cells.za {
    public final TextView f22594a0;
    public final TextView f22595b0;

    public a70(Context context) {
        super(context, 6, 0, true);
        LinearLayout f7 = org.telegram.messenger.ok.f(context, 1);
        TextView textView = new TextView(context);
        this.f22594a0 = textView;
        org.telegram.messenger.f0.q(textView, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false), 1, 16.0f);
        f7.addView(textView, w7.y5.q(-2, -2, 5));
        TextView textView2 = new TextView(context);
        this.f22595b0 = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19447z6, false));
        textView2.setTextSize(1, 13.0f);
        f7.addView(textView2, w7.y5.t(-2, -2, 5, 0, 1, 0, 0));
        addView(f7, w7.y5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
    }
}
