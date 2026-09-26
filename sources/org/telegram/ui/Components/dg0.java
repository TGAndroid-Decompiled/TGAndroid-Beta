package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dg0 extends FrameLayout {
    public final TextView f23695a;
    public final TextView f23696b;
    public final TextView f23697c;
    public final boolean d;

    public dg0(Context context) {
        super(context);
        this.d = true;
        setBackgroundColor(-15066598);
        TextView textView = new TextView(context);
        this.f23695a = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setBackground(org.telegram.ui.ActionBar.h6.f0(-12763843, 0, -1));
        textView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, w7.y5.e(-2, -1, 51));
        TextView textView2 = new TextView(context);
        this.f23696b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(-1);
        textView2.setGravity(17);
        textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.f0(-12763843, 0, -1));
        textView2.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        textView2.setText(LocaleController.getString(R.string.Send).toUpperCase());
        textView2.setTypeface(AndroidUtilities.bold());
        addView(textView2, w7.y5.e(-2, -1, 53));
        TextView textView3 = new TextView(context);
        this.f23697c = textView3;
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        textView3.setBackgroundResource(R.drawable.photobadge);
        textView3.setMinWidth(AndroidUtilities.dp(23.0f));
        textView3.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
        addView(textView3, w7.y5.d(-2, 23.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
    }

    public final void a() {
        int i10;
        this.f23697c.setVisibility(8);
        if (this.d) {
            i10 = -1;
        } else {
            i10 = -15095832;
        }
        this.f23696b.setTextColor(i10);
    }
}
