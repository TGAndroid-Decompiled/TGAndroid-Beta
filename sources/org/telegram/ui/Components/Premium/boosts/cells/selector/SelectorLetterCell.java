package org.telegram.ui.Components.Premium.boosts.cells.selector;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

public final class SelectorLetterCell extends FrameLayout {
    public final Theme.ResourcesProvider resourcesProvider;
    public final TextView textView;

    public SelectorLetterCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        setBackgroundColor(Theme.getColor(Theme.key_graySection, resourcesProvider));
        TextView textView = new TextView(getContext());
        this.textView = textView;
        zzkk.m(14.0f, 1, textView);
        textView.setTextColor(Theme.getColor(Theme.key_graySectionText, resourcesProvider));
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(textView, LayoutHelper.createFrame(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public void setLetter(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public void setTextColor(int i) {
        this.textView.setTextColor(Theme.getColor(i, this.resourcesProvider));
    }
}
