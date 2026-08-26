package org.telegram.ui.Cells;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

public final class LetterSectionCell extends FrameLayout {
    public final TextView textView;

    public LetterSectionCell(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(64.0f)));
        TextView textView = new TextView(getContext());
        this.textView = textView;
        zzkb.m(22.0f, 1, textView);
        textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText4, false));
        textView.setGravity(17);
        addView(textView, LayoutHelper.createFrame(-1, -1.0f, 119, 12.0f, 0.0f, 0.0f, 0.0f));
    }

    public void setCellHeight(int i) {
        setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(54.0f), i));
    }

    public void setLetter(String str) {
        this.textView.setText(str.toUpperCase());
    }
}
