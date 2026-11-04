package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class zp extends LinearLayout {
    public final k9 f41085a;

    public zp(Context context) {
        super(context);
        setOrientation(1);
        k9 k9Var = new k9(context);
        this.f41085a = k9Var;
        k9Var.setImageDrawable(new y70(k9Var, "m418 282.6c13.4-21.1 20.2-44.9 20.2-70.8 0-88.3-79.8-175.3-178.9-175.3-100.1 0-178.9 88-178.9 175.3 0 46.6 16.9 73.1 29.1 86.1-19.3 23.4-30.9 52.3-34.6 86.1-2.5 22.7 3.2 41.4 17.4 57.3 14.3 16 51.7 35 148.1 35 41.2 0 119.9-5.3 156.7-18.3 49.5-17.4 59.2-41.1 59.2-76.2 0-41.5-12.9-74.8-38.3-99.2z", org.telegram.messenger.g0.L(110.0f), org.telegram.messenger.g0.L(110.0f)));
        if (!org.telegram.messenger.g0.Q1()) {
            addView(k9Var, b8.mf.r(110, 110, 49));
        }
        TextView g7 = org.telegram.messenger.k5.g(context, 1, 20.0f);
        org.telegram.ui.ActionBar.r6.V(g7, org.telegram.ui.ActionBar.k6.G6, null);
        g7.setGravity(1);
        g7.setText(org.telegram.messenger.bd.M0(2131748227, null));
        g7.setTypeface(org.telegram.messenger.g0.o());
        addView(g7, b8.mf.t(-2, -2, 49, 0, 15, 0, 7));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27862c7, null);
        textView.setGravity(1);
        textView.setText(org.telegram.messenger.bd.M0(2131748226, null));
        textView.setMaxWidth(org.telegram.messenger.g0.L(260.0f));
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView, b8.mf.t(-2, -2, 49, 0, 0, 0, 19));
        gi.d dVar = new gi.d(context, null, true);
        dVar.setUseWrapContent(true);
        dVar.f();
        dVar.setPadding(org.telegram.messenger.g0.L(28.0f), 0, org.telegram.messenger.g0.L(28.0f), 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new wp(2131231132, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.bd.M0(2131748291, null));
        dVar.i(spannableStringBuilder, false, true);
        addView(dVar, b8.mf.r(-2, 44, 49));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41085a.setImageDrawable(new ch0(2131624319, org.telegram.messenger.g0.L(110.0f), org.telegram.messenger.g0.L(110.0f)));
    }
}
