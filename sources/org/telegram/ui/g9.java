package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class g9 extends FrameLayout {

    public static final int f38340e = 0;

    public final TextView f38341a;

    public final TextView f38342b;

    public final View f38343c;
    public final org.telegram.ui.Components.ri0 d;

    public g9(j9 j9Var, Context context, org.telegram.ui.Components.h00 h00Var) {
        super(context);
        addView(h00Var, h7.z5.c(-1.0f, -1));
        this.f38343c = h00Var;
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        this.d = ri0Var;
        ri0Var.f(R.raw.utyan_call, 110, 110, null);
        ri0Var.setAutoRepeat(false);
        addView(ri0Var, h7.z5.d(110, 110.0f, 17, 52.0f, 17.0f, 52.0f, 60.0f));
        ri0Var.setOnClickListener(new a(this, 10));
        TextView textView = new TextView(context);
        this.f38341a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        textView.setText(LocaleController.getString(R.string.MakeYourFirstCall));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        addView(textView, h7.z5.d(-1, -2.0f, 17, 17.0f, 40.0f, 17.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f38342b = textView2;
        String string = LocaleController.formatString(R.string.MakeYourFirstCallHint, Integer.valueOf(j9Var.getMessagesController().conferenceCallSizeLimit));
        if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
            string = string.replace('\n', ' ');
        }
        textView2.setText(string);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23037c7, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, h7.z5.d(-1, -2.0f, 17, 17.0f, 80.0f, 17.0f, 0.0f));
        h00Var.setAlpha(0.0f);
        ri0Var.setAlpha(0.0f);
        textView.setAlpha(0.0f);
        textView2.setAlpha(0.0f);
        setOnTouchListener(new kh.e(4));
    }

    public final void a() {
        this.d.animate().alpha(0.0f).setDuration(150L).start();
        this.f38341a.animate().alpha(0.0f).setDuration(150L).start();
        this.f38342b.animate().alpha(0.0f).setDuration(150L).start();
        this.f38343c.animate().alpha(1.0f).setDuration(150L).start();
    }

    public final void b() {
        org.telegram.ui.Components.ri0 ri0Var = this.d;
        ri0Var.animate().alpha(1.0f).setDuration(150L).start();
        this.f38341a.animate().alpha(1.0f).setDuration(150L).start();
        this.f38342b.animate().alpha(1.0f).setDuration(150L).start();
        this.f38343c.animate().alpha(0.0f).setDuration(150L).start();
        ri0Var.d();
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
