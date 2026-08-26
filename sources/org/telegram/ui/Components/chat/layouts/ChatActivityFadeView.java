package org.telegram.ui.Components.chat.layouts;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.BlurredBackgroundWithFadeDrawable;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;

public final class ChatActivityFadeView extends View implements Theme.Colorable {
    public int colorKey;
    public BlurredBackgroundWithFadeDrawable fadeDrawableBottom;
    public BlurredBackgroundWithFadeDrawable fadeDrawableTop;
    public int fadeZoneBottom;
    public int fadeZoneTop;
    public BlurredBackgroundSourceColor sourceColor;

    public ChatActivityFadeView(Context context) {
        super(context);
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.fadeDrawableTop.draw(canvas);
        this.fadeDrawableBottom.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.fadeDrawableTop.setBounds(0, 0, getMeasuredWidth(), this.fadeZoneTop);
        this.fadeDrawableBottom.setBounds(0, getMeasuredHeight() - this.fadeZoneBottom, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setFadeHeightBottom(int i) {
        this.fadeDrawableBottom.setFadeHeight(i, true);
    }

    public void setFadeHeightTop(int i) {
        this.fadeDrawableTop.setFadeHeight(-i, true);
    }

    public void setFadeTopAlpha(int i) {
        BlurredBackgroundWithFadeDrawable blurredBackgroundWithFadeDrawable = this.fadeDrawableTop;
        if (blurredBackgroundWithFadeDrawable.alpha != i) {
            blurredBackgroundWithFadeDrawable.alpha = i;
            invalidate();
        }
    }

    public void setFadeZoneBottom(int i) {
        if (this.fadeZoneBottom != i) {
            this.fadeZoneBottom = i;
            this.fadeDrawableTop.setBounds(0, 0, getMeasuredWidth(), this.fadeZoneTop);
            this.fadeDrawableBottom.setBounds(0, getMeasuredHeight() - this.fadeZoneBottom, getMeasuredWidth(), getMeasuredHeight());
            invalidate();
        }
    }

    public void setFadeZoneTop(int i) {
        if (this.fadeZoneTop != i) {
            this.fadeZoneTop = i;
            this.fadeDrawableTop.setBounds(0, 0, getMeasuredWidth(), this.fadeZoneTop);
            this.fadeDrawableBottom.setBounds(0, getMeasuredHeight() - this.fadeZoneBottom, getMeasuredWidth(), getMeasuredHeight());
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z) {
        this.fadeDrawableTop.ignoreFastWay = z;
        this.fadeDrawableBottom.ignoreFastWay = z;
    }

    public void setup(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        setup(blurredBackgroundDrawableViewFactory, null);
    }

    public void setupColorKey(int i) {
        this.colorKey = i;
        if (this.sourceColor == null) {
            BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
            this.sourceColor = blurredBackgroundSourceColor;
            blurredBackgroundSourceColor.paint.setColor(Theme.getColor(null, i, false));
            setup(new BlurredBackgroundDrawableViewFactory(this.sourceColor));
        }
    }

    @Override
    public final void updateColors() {
        int i;
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = this.sourceColor;
        if (blurredBackgroundSourceColor == null || (i = this.colorKey) == -1) {
            return;
        }
        blurredBackgroundSourceColor.paint.setColor(Theme.getColor(null, i, false));
        invalidate();
    }

    public final void setup(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory, BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder) {
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(this, null, false);
        blurredBackgroundDrawableCreate.setColorProvider(blurredBackgroundProviderBuilder);
        BlurredBackgroundWithFadeDrawable blurredBackgroundWithFadeDrawable = new BlurredBackgroundWithFadeDrawable(blurredBackgroundDrawableCreate);
        this.fadeDrawableTop = blurredBackgroundWithFadeDrawable;
        blurredBackgroundWithFadeDrawable.setFadeHeight(-AndroidUtilities.dp(30.0f), true);
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate2 = blurredBackgroundDrawableViewFactory.create(this, null, false);
        blurredBackgroundDrawableCreate2.setColorProvider(blurredBackgroundProviderBuilder);
        BlurredBackgroundWithFadeDrawable blurredBackgroundWithFadeDrawable2 = new BlurredBackgroundWithFadeDrawable(blurredBackgroundDrawableCreate2);
        this.fadeDrawableBottom = blurredBackgroundWithFadeDrawable2;
        blurredBackgroundWithFadeDrawable2.setFadeHeight(AndroidUtilities.dp(30.0f), true);
    }
}
