package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class nq extends LinearLayout {
    public final q9 f37842a;

    public nq(Context context) {
        super(context);
        setOrientation(1);
        q9 q9Var = new q9(context);
        this.f37842a = q9Var;
        q9Var.setImageDrawable(new q80(q9Var, "m418 282.6c13.4-21.1 20.2-44.9 20.2-70.8 0-88.3-79.8-175.3-178.9-175.3-100.1 0-178.9 88-178.9 175.3 0 46.6 16.9 73.1 29.1 86.1-19.3 23.4-30.9 52.3-34.6 86.1-2.5 22.7 3.2 41.4 17.4 57.3 14.3 16 51.7 35 148.1 35 41.2 0 119.9-5.3 156.7-18.3 49.5-17.4 59.2-41.1 59.2-76.2 0-41.5-12.9-74.8-38.3-99.2z", org.telegram.messenger.g0.L(110.0f), org.telegram.messenger.g0.L(110.0f)));
        if (!org.telegram.messenger.g0.Q1()) {
            addView(q9Var, c8.ma.r(110, 110, 49));
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, null);
        textView.setGravity(1);
        textView.setText(org.telegram.messenger.gd.M0(2131748027, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, c8.ma.t(-2, -2, 49, 0, 15, 0, 7));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29379c7, null);
        textView2.setGravity(1);
        textView2.setText(org.telegram.messenger.gd.M0(2131748026, null));
        textView2.setMaxWidth(org.telegram.messenger.g0.L(260.0f));
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView2, c8.ma.t(-2, -2, 49, 0, 0, 0, 19));
        hi.d dVar = new hi.d(context, null, true);
        dVar.setUseWrapContent(true);
        dVar.f();
        dVar.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new lq(2131231132, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.gd.M0(2131748091, null));
        dVar.i(spannableStringBuilder, false, true);
        addView(dVar, c8.ma.r(-2, 44, 49));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37842a.setImageDrawable(new mh0(2131624320, org.telegram.messenger.g0.L(110.0f), org.telegram.messenger.g0.L(110.0f)));
    }
}
