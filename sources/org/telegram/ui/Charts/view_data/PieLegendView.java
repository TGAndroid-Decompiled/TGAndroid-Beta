package org.telegram.ui.Charts.view_data;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public final class PieLegendView extends LegendSignatureView {
    public final TextView signature;
    public final TextView value;

    public PieLegendView(Context context) {
        super(context, null);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        TextView textView = new TextView(getContext());
        this.signature = textView;
        linearLayout.addView(textView);
        textView.getLayoutParams().width = AndroidUtilities.dp(96.0f);
        TextView textView2 = new TextView(getContext());
        this.value = textView2;
        linearLayout.addView(textView2);
        addView(linearLayout);
        textView2.setTypeface(Typeface.create("sans-serif-medium", 0));
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.chevron.setVisibility(8);
        this.zoomEnabled = false;
    }

    @Override
    public final void recolor() {
        TextView textView = this.signature;
        if (textView == null) {
            return;
        }
        super.recolor();
        textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
    }

    @Override
    public void setSize(int i) {
    }
}
