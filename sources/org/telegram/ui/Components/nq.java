package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class nq extends FrameLayout {
    public final View f31060a;
    public final TextView f31061b;

    public nq(Context context) {
        super(context);
        View view = new View(context);
        this.f31060a = view;
        int dp = AndroidUtilities.dp(4.0f);
        int i10 = org.telegram.ui.ActionBar.y6.Oh;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.y6.Qh;
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
        Drawable j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, x02, x03, x03);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i11);
        view.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(view, j02, N, N2, null);
        addView(view, gb1.h(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView = new TextView(context);
        this.f31061b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.Sh, null, 1, 14.0f);
        addView(textView, gb1.i(-2, -2, 17));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    public void setText(CharSequence charSequence) {
        this.f31061b.setText(charSequence);
    }
}
