package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k9 extends FrameLayout {
    public static final int e = 0;
    public final TextView f37608a;
    public final TextView f37609b;
    public final View f37610c;
    public final org.telegram.ui.Components.bk0 d;

    public k9(n9 n9Var, Context context, org.telegram.ui.Components.f10 f10Var) {
        super(context);
        addView(f10Var, w7.a6.d(-1.0f, -1));
        this.f37610c = f10Var;
        ?? imageView = new ImageView(context);
        this.d = imageView;
        imageView.f(R.raw.utyan_call, 110, 110, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, w7.a6.a(110.0f, 52.0f, 17.0f, 52.0f, 60.0f, 110, 17));
        imageView.setOnClickListener(new a(this, 10));
        TextView textView = new TextView(context);
        this.f37608a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        textView.setText(LocaleController.getString(R.string.MakeYourFirstCall));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        addView(textView, w7.a6.a(-2.0f, 17.0f, 40.0f, 17.0f, 0.0f, -1, 17));
        TextView textView2 = new TextView(context);
        this.f37609b = textView2;
        String formatString = LocaleController.formatString(R.string.MakeYourFirstCallHint, Integer.valueOf(n9Var.getMessagesController().conferenceCallSizeLimit));
        if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
            formatString = formatString.replace('\n', ' ');
        }
        textView2.setText(formatString);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19883c7, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, w7.a6.a(-2.0f, 17.0f, 80.0f, 17.0f, 0.0f, -1, 17));
        f10Var.setAlpha(0.0f);
        imageView.setAlpha(0.0f);
        textView.setAlpha(0.0f);
        textView2.setAlpha(0.0f);
        setOnTouchListener(new ci.d(4));
    }

    public final void a() {
        this.d.animate().alpha(0.0f).setDuration(150L).start();
        this.f37608a.animate().alpha(0.0f).setDuration(150L).start();
        this.f37609b.animate().alpha(0.0f).setDuration(150L).start();
        this.f37610c.animate().alpha(1.0f).setDuration(150L).start();
    }

    public final void b() {
        org.telegram.ui.Components.bk0 bk0Var = this.d;
        bk0Var.animate().alpha(1.0f).setDuration(150L).start();
        this.f37608a.animate().alpha(1.0f).setDuration(150L).start();
        this.f37609b.animate().alpha(1.0f).setDuration(150L).start();
        this.f37610c.animate().alpha(0.0f).setDuration(150L).start();
        bk0Var.d();
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
