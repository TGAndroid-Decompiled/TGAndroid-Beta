package org.telegram.ui.Components.emojiview;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.UniversalRecyclerView;

public abstract class FoundEmojiPacksRecyclerView extends UniversalRecyclerView {
    public FoundEmojiPacksRecyclerView(Context context, int i, int i2, boolean z, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, Theme.ResourcesProvider resourcesProvider, int i3, int i4) {
        super(context, i, i2, z, callback2, callback5, callback5Return, resourcesProvider, i3, i4);
        setAdaptiveOverScroll();
    }

    public void scrollOnSelect(final View view) {
        if (view == null) {
            return;
        }
        float fDp = AndroidUtilities.dp(92.0f);
        float width = getWidth() - fDp;
        float x = view.getX();
        float width2 = view.getWidth() + x;
        final int i = x < fDp ? (int) (x - fDp) : width2 > width ? (int) (width2 - width) : 0;
        if (i != 0) {
            AndroidUtilities.doOnLayout(this, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$scrollOnSelect$1(view, i);
                }
            });
        }
    }

    public void lambda$scrollOnSelect$1(View view, final int i) {
        view.postOnAnimation(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$scrollOnSelect$0(i);
            }
        });
    }

    public void lambda$scrollOnSelect$0(int i) {
        smoothScrollBy(i, 0);
    }
}
