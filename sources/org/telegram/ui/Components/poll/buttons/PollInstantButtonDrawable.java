package org.telegram.ui.Components.poll.buttons;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;

public class PollInstantButtonDrawable extends PollButtonDrawableBase {
    private final AnimatedTextView.AnimatedTextDrawable buttonTextAnimatedDrawable;
    private float offsetY;

    public PollInstantButtonDrawable(Theme.ResourcesProvider resourcesProvider) {
        super(resourcesProvider);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, false, false);
        this.buttonTextAnimatedDrawable = animatedTextDrawable;
        animatedTextDrawable.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(13.0f));
        animatedTextDrawable.setGravity(17);
        setSelectorsColor(Theme.getColor(Theme.key_listSelector, resourcesProvider));
    }

    public void setButtonText(CharSequence charSequence, boolean z) {
        this.buttonTextAnimatedDrawable.setText(charSequence, z);
    }

    public void setButtonTextColor(int i) {
        this.buttonTextAnimatedDrawable.setTextColor(i);
    }

    public void setTextOffsetY(float f) {
        if (this.offsetY != f) {
            this.offsetY = f;
            checkBounds(getBounds());
        }
    }

    @Override
    public void draw(Canvas canvas) {
        this.buttonTextAnimatedDrawable.draw(canvas);
    }

    @Override
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        checkBounds(getBounds());
    }

    private void checkBounds(Rect rect) {
        int i = (int) this.offsetY;
        this.buttonTextAnimatedDrawable.setBounds(rect.left, rect.top + i, rect.right, rect.bottom + i);
    }

    @Override
    public void setupCallbacks(Drawable.Callback callback) {
        super.setupCallbacks(callback);
        this.buttonTextAnimatedDrawable.setCallback(callback);
    }

    @Override
    protected void onAlphaChanged(int i) {
        super.onAlphaChanged(i);
        this.buttonTextAnimatedDrawable.setAlpha(i);
    }
}
