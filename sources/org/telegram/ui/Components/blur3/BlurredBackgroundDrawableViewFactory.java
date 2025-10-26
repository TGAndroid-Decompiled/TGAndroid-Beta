package org.telegram.ui.Components.blur3;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.chat.ViewPositionWatcher;

public class BlurredBackgroundDrawableViewFactory {
    private final ViewGroup parent;
    private final BlurredBackgroundSource source;
    private final ViewPositionWatcher viewPositionWatcher;

    public BlurredBackgroundDrawableViewFactory(ViewPositionWatcher viewPositionWatcher, ViewGroup viewGroup, BlurredBackgroundSource blurredBackgroundSource) {
        this.viewPositionWatcher = viewPositionWatcher;
        this.source = blurredBackgroundSource;
        this.parent = viewGroup;
    }

    public BlurredBackgroundDrawable create(final View view, BlurredBackgroundColorProvider blurredBackgroundColorProvider) {
        final BlurredBackgroundDrawable createDrawable = this.source.createDrawable();
        createDrawable.setColorProvider(blurredBackgroundColorProvider);
        this.viewPositionWatcher.subscribe(view, this.parent, new ViewPositionWatcher.OnChangedListener() {
            @Override
            public final void onPositionChanged(View view2, RectF rectF) {
                BlurredBackgroundDrawableViewFactory.lambda$create$0(BlurredBackgroundDrawable.this, view, view2, rectF);
            }
        });
        return createDrawable;
    }

    public static void lambda$create$0(BlurredBackgroundDrawable blurredBackgroundDrawable, View view, View view2, RectF rectF) {
        blurredBackgroundDrawable.setSourceOffset(rectF.left, rectF.top);
        view.invalidate();
    }
}
