package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class c10 extends w7 {
    public final Context A;
    public final FragmentContextView B;
    public final int f27335y;

    public c10(FragmentContextView fragmentContextView, Context context, Context context2, int i9) {
        super(context);
        this.f27335y = i9;
        this.B = fragmentContextView;
        this.A = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f27335y) {
            case 0:
                TextView textView = new TextView(this.A);
                textView.setMaxLines(1);
                textView.setLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextSize(1, 15.0f);
                textView.setGravity(19);
                FragmentContextView fragmentContextView = this.B;
                int i9 = fragmentContextView.P;
                if (i9 != 0 && i9 != 2) {
                    if (i9 == 4) {
                        textView.setGravity(51);
                        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23286t7, fragmentContextView.f26390l0));
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                    } else if (i9 == 1 || i9 == 3) {
                        textView.setGravity(19);
                        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A7, fragmentContextView.f26390l0));
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 14.0f);
                    }
                } else {
                    textView.setGravity(19);
                    textView.setTypeface(Typeface.DEFAULT);
                    textView.setTextSize(1, 15.0f);
                }
                return textView;
            default:
                TextView textView2 = new TextView(this.A);
                textView2.setMaxLines(1);
                textView2.setLines(1);
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity(3);
                textView2.setTextSize(1, 13.0f);
                textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23352x7, this.B.f26390l0));
                return textView2;
        }
    }
}
