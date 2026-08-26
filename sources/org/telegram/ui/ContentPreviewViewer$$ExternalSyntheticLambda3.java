package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ReactionsContainerLayout;

public final class ContentPreviewViewer$$ExternalSyntheticLambda3 implements OnApplyWindowInsetsListener, ReactionsContainerLayout.ReactionsContainerDelegate {
    public final ContentPreviewViewer f$0;

    public ContentPreviewViewer$$ExternalSyntheticLambda3(ContentPreviewViewer contentPreviewViewer) {
        this.f$0 = contentPreviewViewer;
    }

    @Override
    public boolean allowLongPress() {
        return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$allowLongPress(this);
    }

    @Override
    public boolean drawBackground() {
        return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$drawBackground(this);
    }

    @Override
    public void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
        ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$drawRoundRect(this, canvas, rectF, f, f2, f3, i, z);
    }

    @Override
    public void hideMenu() {
        ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$hideMenu(this);
    }

    @Override
    public boolean needEnterText() {
        return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$needEnterText(this);
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return this.f$0.lambda$setParentActivity$11(view, windowInsetsCompat);
    }

    @Override
    public void onEmojiWindowDismissed() {
        ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$onEmojiWindowDismissed(this);
    }

    @Override
    public void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
        this.f$0.lambda$showEmojiSelectorForStickers$5(view, visibleReaction, z, z2);
    }
}
