package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class b20 extends g8 {
    public final Context E;
    public final FragmentContextView F;
    public final int f26711y;

    public b20(FragmentContextView fragmentContextView, Context context, Context context2, int i10) {
        super(context);
        this.f26711y = i10;
        this.F = fragmentContextView;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f26711y) {
            case 0:
                TextView textView = new TextView(this.E);
                textView.setMaxLines(1);
                textView.setLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextSize(1, 15.0f);
                textView.setGravity(19);
                FragmentContextView fragmentContextView = this.F;
                int i10 = fragmentContextView.U;
                if (i10 != 0 && i10 != 2) {
                    if (i10 == 4) {
                        textView.setGravity(51);
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23656t7, fragmentContextView.f26172q0);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                    } else if (i10 == 1 || i10 == 3) {
                        textView.setGravity(19);
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.A7, fragmentContextView.f26172q0);
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
                TextView textView2 = new TextView(this.E);
                textView2.setMaxLines(1);
                textView2.setLines(1);
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity(3);
                textView2.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23733x7, this.F.f26172q0);
                return textView2;
        }
    }
}
