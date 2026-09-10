package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class h9 extends FrameLayout {
    public static final int e = 0;
    public final TextView f33326a;
    public final TextView f33327b;
    public final View f33328c;
    public final org.telegram.ui.Components.kj0 d;

    public h9(k9 k9Var, Context context, org.telegram.ui.Components.a10 a10Var) {
        super(context);
        addView(a10Var, w7.a6.c(-1.0f, -1));
        this.f33328c = a10Var;
        ?? imageView = new ImageView(context);
        this.d = imageView;
        imageView.f(R.raw.utyan_call, 110, 110, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, w7.a6.d(110, 110.0f, 17, 52.0f, 17.0f, 52.0f, 60.0f));
        imageView.setOnClickListener(new a(this, 10));
        TextView textView = new TextView(context);
        this.f33326a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        textView.setText(LocaleController.getString(R.string.MakeYourFirstCall));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        addView(textView, w7.a6.d(-1, -2.0f, 17, 17.0f, 40.0f, 17.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f33327b = textView2;
        String formatString = LocaleController.formatString(R.string.MakeYourFirstCallHint, Integer.valueOf(k9Var.getMessagesController().conferenceCallSizeLimit));
        if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
            formatString = formatString.replace('\n', ' ');
        }
        textView2.setText(formatString);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17911c7, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, w7.a6.d(-1, -2.0f, 17, 17.0f, 80.0f, 17.0f, 0.0f));
        a10Var.setAlpha(0.0f);
        imageView.setAlpha(0.0f);
        textView.setAlpha(0.0f);
        textView2.setAlpha(0.0f);
        setOnTouchListener(new ai.h(4));
    }

    public final void a() {
        this.d.animate().alpha(0.0f).setDuration(150L).start();
        this.f33326a.animate().alpha(0.0f).setDuration(150L).start();
        this.f33327b.animate().alpha(0.0f).setDuration(150L).start();
        this.f33328c.animate().alpha(1.0f).setDuration(150L).start();
    }

    public final void b() {
        org.telegram.ui.Components.kj0 kj0Var = this.d;
        kj0Var.animate().alpha(1.0f).setDuration(150L).start();
        this.f33326a.animate().alpha(1.0f).setDuration(150L).start();
        this.f33327b.animate().alpha(1.0f).setDuration(150L).start();
        this.f33328c.animate().alpha(0.0f).setDuration(150L).start();
        kj0Var.d();
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
