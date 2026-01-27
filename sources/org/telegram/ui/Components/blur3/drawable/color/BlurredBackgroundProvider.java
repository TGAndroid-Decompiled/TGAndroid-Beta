package org.telegram.ui.Components.blur3.drawable.color;

public interface BlurredBackgroundProvider extends BlurredBackgroundColorProvider {
    float getShadowDx();

    float getShadowDy();

    float getShadowRadius();

    float getStrokeWidthBottom();

    float getStrokeWidthTop();
}
