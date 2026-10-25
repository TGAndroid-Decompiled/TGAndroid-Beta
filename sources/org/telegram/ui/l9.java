package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l9 extends FrameLayout {
    public static final int e = 0;
    public final TextView f41187a;
    public final TextView f41188b;
    public final View f41189c;
    public final org.telegram.ui.Components.ak0 d;

    public l9(o9 o9Var, Context context, org.telegram.ui.Components.c10 c10Var) {
        super(context);
        addView(c10Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.f41189c = c10Var;
        ?? imageView = new ImageView(context);
        this.d = imageView;
        imageView.f(R.raw.utyan_call, 110, 110, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, org.telegram.ui.Components.gb1.h(110, 110.0f, 17, 52.0f, 17.0f, 52.0f, 60.0f));
        imageView.setOnClickListener(new a(this, 9));
        TextView textView = new TextView(context);
        this.f41187a = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
        textView.setText(LocaleController.getString(R.string.MakeYourFirstCall));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 17, 17.0f, 40.0f, 17.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f41188b = textView2;
        String formatString = LocaleController.formatString(R.string.MakeYourFirstCallHint, Integer.valueOf(o9Var.getMessagesController().conferenceCallSizeLimit));
        if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
            formatString = formatString.replace('\n', ' ');
        }
        textView2.setText(formatString);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23336c7, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, org.telegram.ui.Components.gb1.h(-1, -2.0f, 17, 17.0f, 80.0f, 17.0f, 0.0f));
        c10Var.setAlpha(0.0f);
        imageView.setAlpha(0.0f);
        textView.setAlpha(0.0f);
        textView2.setAlpha(0.0f);
        setOnTouchListener(new ei.d(4));
    }

    public final void a() {
        this.d.animate().alpha(0.0f).setDuration(150L).start();
        this.f41187a.animate().alpha(0.0f).setDuration(150L).start();
        this.f41188b.animate().alpha(0.0f).setDuration(150L).start();
        this.f41189c.animate().alpha(1.0f).setDuration(150L).start();
    }

    public final void b() {
        org.telegram.ui.Components.ak0 ak0Var = this.d;
        ak0Var.animate().alpha(1.0f).setDuration(150L).start();
        this.f41187a.animate().alpha(1.0f).setDuration(150L).start();
        this.f41188b.animate().alpha(1.0f).setDuration(150L).start();
        this.f41189c.animate().alpha(0.0f).setDuration(150L).start();
        ak0Var.d();
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
