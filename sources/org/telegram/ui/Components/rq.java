package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class rq extends FrameLayout {
    public final View f30515a;
    public final TextView f30516b;

    public rq(Context context) {
        super(context);
        View view = new View(context);
        this.f30515a = view;
        int dp = AndroidUtilities.dp(4.0f);
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false);
        int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Qh, false);
        view.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, x02, x03, x03));
        addView(view, w7.x5.a(-1.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 0));
        TextView textView = new TextView(context);
        this.f30516b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        org.telegram.messenger.q.m(14.0f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false), 1, textView);
        addView(textView, w7.x5.e(-2, -2, 17));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    public void setText(CharSequence charSequence) {
        this.f30516b.setText(charSequence);
    }
}
