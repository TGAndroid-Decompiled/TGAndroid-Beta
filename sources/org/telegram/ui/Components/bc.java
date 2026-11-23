package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;
public class bc extends db {
    public final p9 f33733a;
    public final TextView f33734b;
    public final TextView f33735c;

    public bc(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        int i7 = org.telegram.ui.ActionBar.n6.yj;
        getThemedColor(i7);
        p9 p9Var = new p9(context);
        this.f33733a = p9Var;
        addView(p9Var, c8.na.i(29.0f, 29.0f, 8388627, 12.0f, 12.0f, 12.0f, 12.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.na.i(-2.0f, -2.0f, 8388627, 54.0f, 8.0f, 12.0f, 8.0f));
        TextView textView = new TextView(context);
        this.f33734b = textView;
        textView.setSingleLine();
        org.telegram.messenger.f3.l(textView, i7, i6Var, 1, 14.0f);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.f33735c = textView2;
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
        return ((Object) this.f33734b.getText()) + ".\n" + ((Object) this.f33735c.getText());
    }
}
