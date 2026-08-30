package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class r10 extends w7 {
    public final Context B;
    public final FragmentContextView C;
    public final int f28360y;

    public r10(FragmentContextView fragmentContextView, Context context, Context context2, int i10) {
        super(context);
        this.f28360y = i10;
        this.C = fragmentContextView;
        this.B = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f28360y) {
            case 0:
                TextView textView = new TextView(this.B);
                textView.setMaxLines(1);
                textView.setLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextSize(1, 15.0f);
                textView.setGravity(19);
                FragmentContextView fragmentContextView = this.C;
                int i10 = fragmentContextView.Q;
                if (i10 != 0 && i10 != 2) {
                    if (i10 == 4) {
                        textView.setGravity(51);
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20191t7, fragmentContextView.m0));
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                    } else if (i10 == 1 || i10 == 3) {
                        textView.setGravity(19);
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A7, fragmentContextView.m0));
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
                TextView textView2 = new TextView(this.B);
                textView2.setMaxLines(1);
                textView2.setLines(1);
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity(3);
                textView2.setTextSize(1, 13.0f);
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20264x7, this.C.m0));
                return textView2;
        }
    }
}
