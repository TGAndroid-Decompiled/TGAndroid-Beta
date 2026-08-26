package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import com.google.android.gms.internal.mlkit_vision_common.zzkr;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;

public final class PickerBottomLayout extends FrameLayout {
    public final TextView cancelButton;
    public final LinearLayout doneButton;
    public final TextView doneButtonBadgeTextView;
    public final TextView doneButtonTextView;

    public PickerBottomLayout(Context context) {
        super(context);
        setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        TextView textView = new TextView(context);
        this.cancelButton = textView;
        textView.setTextSize(1, 14.0f);
        int i = Theme.key_picker_enabledButton;
        zzkr.m(i, textView, 17);
        textView.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, i, false) & 268435455, 0, -1));
        textView.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, LayoutHelper.createFrame(-2, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.doneButton = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(Theme.createSelectorDrawable(268435455 & Theme.getColor(null, i, false), 0, -1));
        linearLayout.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        addView(linearLayout, LayoutHelper.createFrame(-2, -1, 53));
        TextView textView2 = new TextView(context);
        this.doneButtonBadgeTextView = textView2;
        zzkh.m(13.0f, textView2);
        zzkr.m(Theme.key_picker_badgeText, textView2, 17);
        textView2.setBackgroundDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(11.0f), Theme.getColor(null, Theme.key_picker_badge, false)));
        textView2.setMinWidth(AndroidUtilities.dp(23.0f));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
        TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayout, textView2, LayoutHelper.createLinear(-2, 23, 16, 0, 0, 10, 0), context);
        this.doneButtonTextView = textViewM;
        textViewM.setTextSize(1, 14.0f);
        textViewM.setTextColor(Theme.getColor(null, i, false));
        textViewM.setGravity(17);
        textViewM.setCompoundDrawablePadding(AndroidUtilities.dp(8.0f));
        textViewM.setText(LocaleController.getString(R.string.Send).toUpperCase());
        textViewM.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textViewM, LayoutHelper.createLinear(-2, -2, 16));
    }
}
