package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i9 extends FrameLayout {
    public static final int e = 0;
    public final TextView f35045a;
    public final TextView f35046b;
    public final View f35047c;
    public final org.telegram.ui.Components.jj0 d;

    public i9(l9 l9Var, Context context, org.telegram.ui.Components.t00 t00Var) {
        super(context);
        addView(t00Var, k7.b6.c(-1.0f, -1));
        this.f35047c = t00Var;
        ?? imageView = new ImageView(context);
        this.d = imageView;
        imageView.f(R.raw.utyan_call, 110, 110, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, k7.b6.d(110, 110.0f, 17, 52.0f, 17.0f, 52.0f, 60.0f));
        imageView.setOnClickListener(new a(this, 10));
        TextView textView = new TextView(context);
        this.f35045a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        textView.setText(LocaleController.getString(R.string.MakeYourFirstCall));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        addView(textView, k7.b6.d(-1, -2.0f, 17, 17.0f, 40.0f, 17.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f35046b = textView2;
        String formatString = LocaleController.formatString(R.string.MakeYourFirstCallHint, Integer.valueOf(l9Var.getMessagesController().conferenceCallSizeLimit));
        if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
            formatString = formatString.replace('\n', ' ');
        }
        textView2.setText(formatString);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19889c7, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, k7.b6.d(-1, -2.0f, 17, 17.0f, 80.0f, 17.0f, 0.0f));
        t00Var.setAlpha(0.0f);
        imageView.setAlpha(0.0f);
        textView.setAlpha(0.0f);
        textView2.setAlpha(0.0f);
        setOnTouchListener(new oh.d(4));
    }

    public final void a() {
        this.d.animate().alpha(0.0f).setDuration(150L).start();
        this.f35045a.animate().alpha(0.0f).setDuration(150L).start();
        this.f35046b.animate().alpha(0.0f).setDuration(150L).start();
        this.f35047c.animate().alpha(1.0f).setDuration(150L).start();
    }

    public final void b() {
        org.telegram.ui.Components.jj0 jj0Var = this.d;
        jj0Var.animate().alpha(1.0f).setDuration(150L).start();
        this.f35045a.animate().alpha(1.0f).setDuration(150L).start();
        this.f35046b.animate().alpha(1.0f).setDuration(150L).start();
        this.f35047c.animate().alpha(0.0f).setDuration(150L).start();
        jj0Var.d();
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
