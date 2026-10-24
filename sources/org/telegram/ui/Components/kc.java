package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;
public class kc extends lb {
    public final u9 f28000a;
    public final TextView f28001b;
    public final TextView f28002c;

    public kc(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        int i10 = org.telegram.ui.ActionBar.k6.Hi;
        getThemedColor(i10);
        u9 u9Var = new u9(context);
        this.f28000a = u9Var;
        addView(u9Var, w7.z5.i(29.0f, 29.0f, 8388627, 12.0f, 12.0f, 12.0f, 12.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.i(-2.0f, -2.0f, 8388627, 54.0f, 8.0f, 12.0f, 8.0f));
        TextView textView = new TextView(context);
        this.f28001b = textView;
        textView.setSingleLine();
        org.telegram.messenger.v0.q(textView, i10, g6Var, 1, 14.0f);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f28002c = textView2;
        textView2.setMaxLines(2);
        org.telegram.ui.ActionBar.r6.W(textView2, i10, g6Var);
        org.telegram.ui.ActionBar.r6.I(textView2, org.telegram.ui.ActionBar.k6.Gi, g6Var);
        textView2.setMovementMethod(new LinkMovementMethod());
        textView2.setTypeface(Typeface.SANS_SERIF);
        textView2.setTextSize(1, 13.0f);
        linearLayout.addView(textView2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f28001b.getText()) + ".\n" + ((Object) this.f28002c.getText());
    }
}
