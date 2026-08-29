package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class vp extends FrameLayout {
    public final View f34162a;
    public final TextView f34163b;

    public vp(Context context) {
        super(context);
        View view = new View(context);
        this.f34162a = view;
        int dp = AndroidUtilities.dp(4.0f);
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
        int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        view.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, w02, w03, w03));
        addView(view, i7.f6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView = new TextView(context);
        this.f34163b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        org.telegram.messenger.x3.t(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false), 1, 14.0f);
        addView(textView, i7.f6.e(-2, -2, 17));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    public void setText(CharSequence charSequence) {
        this.f34163b.setText(charSequence);
    }
}
