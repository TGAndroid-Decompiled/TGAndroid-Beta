package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;
public class cc extends eb {
    public final q9 f33963a;
    public final TextView f33964b;
    public final TextView f33965c;

    public cc(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        int i7 = org.telegram.ui.ActionBar.n6.yj;
        getThemedColor(i7);
        q9 q9Var = new q9(context);
        this.f33963a = q9Var;
        addView(q9Var, c8.ma.i(29.0f, 29.0f, 8388627, 12.0f, 12.0f, 12.0f, 12.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ma.i(-2.0f, -2.0f, 8388627, 54.0f, 8.0f, 12.0f, 8.0f));
        TextView textView = new TextView(context);
        this.f33964b = textView;
        textView.setSingleLine();
        org.telegram.messenger.f3.l(textView, i7, i6Var, 1, 14.0f);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f33965c = textView2;
        textView2.setMaxLines(2);
        org.telegram.ui.ActionBar.u6.U(textView2, i7, i6Var);
        org.telegram.ui.ActionBar.u6.G(textView2, org.telegram.ui.ActionBar.n6.xj, i6Var);
        textView2.setMovementMethod(new LinkMovementMethod());
        textView2.setTypeface(Typeface.SANS_SERIF);
        textView2.setTextSize(1, 13.0f);
        linearLayout.addView(textView2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f33964b.getText()) + ".\n" + ((Object) this.f33965c.getText());
    }
}
