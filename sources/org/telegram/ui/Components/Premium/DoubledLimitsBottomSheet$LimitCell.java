package org.telegram.ui.Components.Premium;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

public final class DoubledLimitsBottomSheet$LimitCell extends LinearLayout {
    public final LimitPreviewView previewView;
    public final TextView subtitle;
    public final TextView title;

    public DoubledLimitsBottomSheet$LimitCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        TextView textView = new TextView(context);
        this.title = textView;
        zzkb.m(15.0f, 1, textView);
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        addView(textView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.subtitle = textView2;
        OKLCH.m(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider, textView2, 14.0f);
        addView(textView2, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, 20, 0.5f, resourcesProvider);
        this.previewView = limitPreviewView;
        addView(limitPreviewView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }
}
