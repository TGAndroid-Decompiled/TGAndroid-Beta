package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class hq extends LinearLayout {
    public final g9 f26903a;

    public hq(Context context) {
        super(context);
        setOrientation(1);
        g9 g9Var = new g9(context);
        this.f26903a = g9Var;
        g9Var.setImageDrawable(new v80(g9Var, "m418 282.6c13.4-21.1 20.2-44.9 20.2-70.8 0-88.3-79.8-175.3-178.9-175.3-100.1 0-178.9 88-178.9 175.3 0 46.6 16.9 73.1 29.1 86.1-19.3 23.4-30.9 52.3-34.6 86.1-2.5 22.7 3.2 41.4 17.4 57.3 14.3 16 51.7 35 148.1 35 41.2 0 119.9-5.3 156.7-18.3 49.5-17.4 59.2-41.1 59.2-76.2 0-41.5-12.9-74.8-38.3-99.2z", org.telegram.messenger.i0.L(110.0f), org.telegram.messenger.i0.L(110.0f)));
        if (!org.telegram.messenger.i0.Q1()) {
            addView(g9Var, w7.b6.r(110, 110, 49));
        }
        TextView g10 = org.telegram.messenger.m5.g(context, 1, 20.0f);
        org.telegram.ui.ActionBar.a7.V(g10, org.telegram.ui.ActionBar.t6.G6, null);
        g10.setGravity(1);
        g10.setText(org.telegram.messenger.dd.L0(2131748236, null));
        g10.setTypeface(org.telegram.messenger.i0.o());
        addView(g10, w7.b6.t(-2, -2, 49, 0, 15, 0, 7));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f20912c7, null);
        textView.setGravity(1);
        textView.setText(org.telegram.messenger.dd.L0(2131748235, null));
        textView.setMaxWidth(org.telegram.messenger.i0.L(260.0f));
        textView.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        addView(textView, w7.b6.t(-2, -2, 49, 0, 0, 0, 19));
        vh.d dVar = new vh.d(context, null, true);
        dVar.setUseWrapContent(true);
        dVar.f();
        dVar.setPadding(org.telegram.messenger.i0.L(28.0f), 0, org.telegram.messenger.i0.L(28.0f), 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new dq(2131231132, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.dd.L0(2131748297, null));
        dVar.i(spannableStringBuilder, false, true);
        addView(dVar, w7.b6.r(-2, 44, 49));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26903a.setImageDrawable(new ci0(2131624317, org.telegram.messenger.i0.L(110.0f), org.telegram.messenger.i0.L(110.0f)));
    }
}
