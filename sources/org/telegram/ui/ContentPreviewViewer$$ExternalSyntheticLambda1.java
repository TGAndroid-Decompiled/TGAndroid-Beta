package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ReactionsContainerLayout;

public final class ContentPreviewViewer$$ExternalSyntheticLambda1 implements OnApplyWindowInsetsListener, ReactionsContainerLayout.ReactionsContainerDelegate {
    public final ContentPreviewViewer f$0;

    public ContentPreviewViewer$$ExternalSyntheticLambda1(ContentPreviewViewer contentPreviewViewer) {
        this.f$0 = contentPreviewViewer;
    }

    @Override
    public boolean allowLongPress() {
        return true;
    }

    @Override
    public boolean drawBackground() {
        return false;
    }

    @Override
    public void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }

    @Override
    public boolean needEnterText() {
        return false;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        ContentPreviewViewer contentPreviewViewer = this.f$0;
        contentPreviewViewer.getClass();
        contentPreviewViewer.lastInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        return windowInsetsCompat;
    }

    @Override
    public void onEmojiWindowDismissed() {
    }

    @Override
    public void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
        ContentPreviewViewer contentPreviewViewer = this.f$0;
        if (visibleReaction == null) {
            contentPreviewViewer.getClass();
            return;
        }
        CustomEmojiReactionsWindow reactionsWindow = contentPreviewViewer.reactionsLayout.getReactionsWindow();
        if (!contentPreviewViewer.selectedEmojis.contains(visibleReaction.emojicon)) {
            contentPreviewViewer.selectedEmojis.add(visibleReaction.emojicon);
            if (contentPreviewViewer.selectedEmojis.size() > 7) {
                contentPreviewViewer.selectedEmojis.remove(0);
            }
        } else if (contentPreviewViewer.selectedEmojis.size() <= 1) {
            return;
        } else {
            contentPreviewViewer.selectedEmojis.remove(visibleReaction.emojicon);
        }
        contentPreviewViewer.reactionsLayout.setSelectedEmojis(contentPreviewViewer.selectedEmojis);
        if (reactionsWindow != null) {
            contentPreviewViewer.reactionsLayout.setMessage(null, null, false);
            CustomEmojiReactionsWindow.AnonymousClass2 anonymousClass2 = reactionsWindow.selectAnimatedEmojiDialog;
            if (anonymousClass2 != null) {
                anonymousClass2.setSelectedReactions(contentPreviewViewer.selectedEmojis);
                anonymousClass2.setRecentReactions(contentPreviewViewer.reactionsLayout.allReactionsList);
            }
            reactionsWindow.dismiss();
        }
    }
}
