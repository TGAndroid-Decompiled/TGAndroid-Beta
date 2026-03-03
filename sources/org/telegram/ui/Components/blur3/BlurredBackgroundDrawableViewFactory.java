package org.telegram.ui.Components.blur3;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import me.vkryl.core.reference.ReferenceList;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableRenderNode;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.chat.ViewPositionWatcher;

public class BlurredBackgroundDrawableViewFactory {
    private boolean isLiquidGlassEffectAllowed;
    private ReferenceList linkedViews;
    private ViewGroup parent;
    private final BlurredBackgroundSource source;
    private ViewPositionWatcher viewPositionWatcher;

    public BlurredBackgroundDrawableViewFactory(BlurredBackgroundSource blurredBackgroundSource) {
        this.source = blurredBackgroundSource;
    }

    public BlurredBackgroundDrawableViewFactory(ViewPositionWatcher viewPositionWatcher, ViewGroup viewGroup, BlurredBackgroundSource blurredBackgroundSource) {
        this(blurredBackgroundSource);
        setSourceRootView(viewPositionWatcher, viewGroup);
    }

    public void setSourceRootView(ViewPositionWatcher viewPositionWatcher, ViewGroup viewGroup) {
        this.viewPositionWatcher = viewPositionWatcher;
        this.parent = viewGroup;
    }

    public void setLinkedViewsRef(ReferenceList referenceList) {
        this.linkedViews = referenceList;
    }

    public void setLiquidGlassEffectAllowed(boolean z) {
        this.isLiquidGlassEffectAllowed = z;
    }

    public BlurredBackgroundDrawable create(View view) {
        return create(view, (BlurredBackgroundColorProvider) null);
    }

    public BlurredBackgroundDrawable create(View view, boolean z) {
        return create(view, null, z);
    }

    public BlurredBackgroundDrawable create(View view, BlurredBackgroundColorProvider blurredBackgroundColorProvider) {
        return create(view, blurredBackgroundColorProvider, false);
    }

    public BlurredBackgroundDrawable create(final View view, BlurredBackgroundColorProvider blurredBackgroundColorProvider, boolean z) {
        ViewGroup viewGroup;
        final BlurredBackgroundDrawable blurredBackgroundDrawableCreateDrawable = this.source.createDrawable();
        if (this.isLiquidGlassEffectAllowed && Build.VERSION.SDK_INT >= 33 && (blurredBackgroundDrawableCreateDrawable instanceof BlurredBackgroundDrawableRenderNode)) {
            ((BlurredBackgroundDrawableRenderNode) blurredBackgroundDrawableCreateDrawable).setLiquidGlassEffectAllowed();
        }
        blurredBackgroundDrawableCreateDrawable.setColorProvider(blurredBackgroundColorProvider);
        ReferenceList referenceList = this.linkedViews;
        if (referenceList != null && view != null) {
            referenceList.add(view);
        }
        ViewPositionWatcher viewPositionWatcher = this.viewPositionWatcher;
        if (viewPositionWatcher != null && (viewGroup = this.parent) != null && view != null) {
            viewPositionWatcher.subscribe(view, viewGroup, new ViewPositionWatcher.OnChangedListener() {
                @Override
                public final void onPositionChanged(View view2, RectF rectF) {
                    BlurredBackgroundDrawableViewFactory.lambda$create$0(blurredBackgroundDrawableCreateDrawable, view, view2, rectF);
                }
            }, z);
        }
        return blurredBackgroundDrawableCreateDrawable;
    }

    public static void lambda$create$0(BlurredBackgroundDrawable blurredBackgroundDrawable, View view, View view2, RectF rectF) {
        blurredBackgroundDrawable.setSourceOffset(rectF.left, rectF.top);
        view.invalidate();
    }
}
