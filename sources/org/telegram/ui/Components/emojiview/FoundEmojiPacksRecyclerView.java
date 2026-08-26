package org.telegram.ui.Components.emojiview;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda19;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.iv.RichTextCell$2$$ExternalSyntheticLambda1;

public abstract class FoundEmojiPacksRecyclerView extends UniversalRecyclerView {
    private static final int SCROLL_MARGIN = 92;

    public FoundEmojiPacksRecyclerView(Context context, int i, int i2, boolean z, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, Theme.ResourcesProvider resourcesProvider, int i3, int i4) {
        super(context, i, i2, z, callback2, callback5, callback5Return, resourcesProvider, i3, i4);
        setAdaptiveOverScroll();
    }

    public final void lambda$scrollOnSelect$0(int i) {
        smoothScrollBy(i, 0);
    }

    public final void lambda$scrollOnSelect$1(View view, int i) {
        view.postOnAnimation(new Theme$$ExternalSyntheticLambda19(this, i, 15));
    }

    public void scrollOnSelect(View view) {
        int i;
        if (view == null) {
            return;
        }
        float fDp = AndroidUtilities.dp(92.0f);
        float width = getWidth() - fDp;
        float x = view.getX();
        float width2 = view.getWidth() + x;
        if (x < fDp) {
            i = (int) (x - fDp);
        } else {
            i = width2 > width ? (int) (width2 - width) : 0;
        }
        if (i != 0) {
            AndroidUtilities.doOnLayout(this, new RichTextCell$2$$ExternalSyntheticLambda1(this, view, i, 11));
        }
    }
}
