package org.telegram.ui.Components.poll.buttons;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatMessageCell;

public abstract class PollButtonDrawableBase extends Drawable {
    public int alpha = 255;
    public final BaseCell.RippleDrawableSafe selectorDrawable;
    public int selectorDrawableColor;

    public PollButtonDrawableBase(Theme.ResourcesProvider resourcesProvider) {
        int color = Theme.getColor(Theme.key_listSelector, resourcesProvider);
        this.selectorDrawableColor = color;
        this.selectorDrawable = Theme.createRadSelectorDrawable(color, 0, 0);
    }

    @Override
    public final int getAlpha() {
        return this.alpha;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public abstract void onAlphaChanged(int i);

    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.selectorDrawable.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i) {
        if (this.alpha != i) {
            this.alpha = i;
            onAlphaChanged(i);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public void setupCallbacks(ChatMessageCell chatMessageCell) {
        setCallback(chatMessageCell);
        this.selectorDrawable.setCallback(chatMessageCell);
    }
}
