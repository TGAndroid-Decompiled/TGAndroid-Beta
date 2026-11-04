package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;
public class wb extends ya {
    public final k9 f39978a;
    public final TextView f39979b;
    public final TextView f39980c;

    public wb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int i3 = org.telegram.ui.ActionBar.k6.vj;
        getThemedColor(i3);
        k9 k9Var = new k9(context);
        this.f39978a = k9Var;
        addView(k9Var, b8.mf.i(29.0f, 29.0f, 8388627, 12.0f, 12.0f, 12.0f, 12.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, b8.mf.i(-2.0f, -2.0f, 8388627, 54.0f, 8.0f, 12.0f, 8.0f));
        TextView textView = new TextView(context);
        this.f39979b = textView;
        textView.setSingleLine();
        org.telegram.messenger.k5.n(textView, i3, e6Var, 1, 14.0f);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f39980c = textView2;
        textView2.setMaxLines(2);
        org.telegram.ui.ActionBar.r6.V(textView2, i3, e6Var);
        org.telegram.ui.ActionBar.r6.H(textView2, org.telegram.ui.ActionBar.k6.uj, e6Var);
        textView2.setMovementMethod(new LinkMovementMethod());
        textView2.setTypeface(Typeface.SANS_SERIF);
        textView2.setTextSize(1, 13.0f);
        linearLayout.addView(textView2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f39979b.getText()) + ".\n" + ((Object) this.f39980c.getText());
    }
}
