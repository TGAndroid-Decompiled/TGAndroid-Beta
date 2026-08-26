package org.telegram.ui.Components.Premium.boosts.cells;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

public final class DurationCell extends BaseCell {
    public TLObject code;
    public final SimpleTextView totalTextView;

    public DurationCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        this.imageView.setVisibility(8);
        SimpleTextView simpleTextView = this.subtitleTextView;
        int i = Theme.key_windowBackgroundWhiteGrayText4;
        simpleTextView.setTextColor(Theme.getColor(i, resourcesProvider));
        SimpleTextView simpleTextView2 = new SimpleTextView(context);
        this.totalTextView = simpleTextView2;
        simpleTextView2.setTextSize(16);
        simpleTextView2.setTextColor(Theme.getColor(i, resourcesProvider));
        simpleTextView2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(simpleTextView2);
        boolean z = LocaleController.isRTL;
        simpleTextView2.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, (z ? 3 : 5) | 16, z ? 20.0f : 0.0f, 0.0f, z ? 0.0f : 20.0f, 0.0f));
    }

    public Object getGifCode() {
        return this.code;
    }

    @Override
    public final boolean needCheck() {
        return true;
    }
}
