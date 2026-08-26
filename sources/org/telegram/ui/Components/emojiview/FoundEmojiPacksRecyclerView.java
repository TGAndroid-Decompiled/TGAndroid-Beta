package org.telegram.ui.Components.emojiview;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda17;

public abstract class FoundEmojiPacksRecyclerView extends UniversalRecyclerView {
    public FoundEmojiPacksRecyclerView(Context context, int i, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Theme.ResourcesProvider resourcesProvider) {
        super(context, i, -1, false, callback2, callback5, null, resourcesProvider, -1, 0);
        this.adaptiveOverScroll = true;
        setOverScrollMode(2);
    }

    public final void scrollOnSelect(View view) {
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
            AndroidUtilities.doOnLayout(this, new PollItemMenu$$ExternalSyntheticLambda17(this, view, i, 16));
        }
    }
}
