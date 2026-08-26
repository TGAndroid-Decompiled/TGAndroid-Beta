package org.telegram.ui.Components.emojiview;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.utils.GradientProtectionDrawable;
import org.telegram.ui.ActionBar.Theme;

public final class FoundStickerPackButtonContainer extends FrameLayout {
    public final GradientProtectionDrawable gradientProtectionDrawable;
    public final Theme.ResourcesProvider resourcesProvider;

    public FoundStickerPackButtonContainer(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.gradientProtectionDrawable = new GradientProtectionDrawable(8);
        this.resourcesProvider = resourcesProvider;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int iMultAlpha = Theme.multAlpha(0.65f, Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
        GradientProtectionDrawable gradientProtectionDrawable = this.gradientProtectionDrawable;
        gradientProtectionDrawable.setColor(iMultAlpha);
        gradientProtectionDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        GradientProtectionDrawable gradientProtectionDrawable = this.gradientProtectionDrawable;
        gradientProtectionDrawable.setBounds(0, 0, i, i2);
        gradientProtectionDrawable.setInsets(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
    }
}
