package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rq extends LinearLayout {
    public final x9 f30072a;

    public rq(Context context) {
        super(context);
        setOrientation(1);
        x9 x9Var = new x9(context);
        this.f30072a = x9Var;
        x9Var.setImageDrawable(new j90(x9Var, "m418 282.6c13.4-21.1 20.2-44.9 20.2-70.8 0-88.3-79.8-175.3-178.9-175.3-100.1 0-178.9 88-178.9 175.3 0 46.6 16.9 73.1 29.1 86.1-19.3 23.4-30.9 52.3-34.6 86.1-2.5 22.7 3.2 41.4 17.4 57.3 14.3 16 51.7 35 148.1 35 41.2 0 119.9-5.3 156.7-18.3 49.5-17.4 59.2-41.1 59.2-76.2 0-41.5-12.9-74.8-38.3-99.2z", AndroidUtilities.dp(110.0f), AndroidUtilities.dp(110.0f)));
        if (!AndroidUtilities.isTablet()) {
            addView(x9Var, w7.x5.q(110, 110, 49));
        }
        TextView g10 = org.telegram.messenger.w1.g(context, 1, 20.0f);
        com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.G6, null, false, g10, 1);
        g10.setText(LocaleController.getString(R.string.NoContactsYet3));
        g10.setTypeface(AndroidUtilities.bold());
        addView(g10, w7.x5.t(-2, -2, 49, 0, 15, 0, 7));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.f20646c7, null, false, textView, 1);
        textView.setText(LocaleController.getString(R.string.NoContactsYet3Sub));
        textView.setMaxWidth(AndroidUtilities.dp(260.0f));
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, w7.x5.t(-2, -2, 49, 0, 0, 0, 19));
        di.d dVar = new di.d(context, null, true);
        dVar.setUseWrapContent(true);
        dVar.e();
        dVar.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new nq(R.drawable.filled_new_contact_24, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.NewContact));
        dVar.g(spannableStringBuilder, false, true);
        addView(dVar, w7.x5.q(-2, 44, 49));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30072a.setImageDrawable(new xi0(R.raw.utyan_empty, AndroidUtilities.dp(110.0f), AndroidUtilities.dp(110.0f)));
    }
}
