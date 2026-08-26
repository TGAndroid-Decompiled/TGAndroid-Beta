package org.telegram.ui.Components.blur3;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import me.vkryl.core.reference.ReferenceList;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableRenderNode;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.StoriesViewPager;

public final class BlurredBackgroundDrawableViewFactory {
    public boolean isLiquidGlassEffectAllowed;
    public ReferenceList linkedDrawables;
    public ReferenceList linkedViews;
    public ViewGroup parent;
    public final BlurredBackgroundSource source;
    public ViewPositionWatcher viewPositionWatcher;

    public BlurredBackgroundDrawableViewFactory(BlurredBackgroundSource blurredBackgroundSource) {
        this.source = blurredBackgroundSource;
    }

    public final BlurredBackgroundDrawable create(View view) {
        return create(view, null, false);
    }

    public final void invalidateAllLinkedViews() {
        ReferenceList referenceList = this.linkedViews;
        if (referenceList != null) {
            Iterator it = referenceList.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void setLinkedViewsRef(ReferenceList referenceList) {
        this.linkedViews = referenceList;
    }

    public final void setSourceRootView(ViewPositionWatcher viewPositionWatcher, ViewGroup viewGroup) {
        this.viewPositionWatcher = viewPositionWatcher;
        this.parent = viewGroup;
    }

    public final BlurredBackgroundDrawable create(View view, BlurredBackgroundColorProvider blurredBackgroundColorProvider) {
        return create(view, blurredBackgroundColorProvider, false);
    }

    public BlurredBackgroundDrawableViewFactory(ViewPositionWatcher viewPositionWatcher, StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1, BlurredBackgroundSource blurredBackgroundSource) {
        this.source = blurredBackgroundSource;
        this.viewPositionWatcher = viewPositionWatcher;
        this.parent = anonymousClass1;
    }

    public final BlurredBackgroundDrawable create(View view, BlurredBackgroundColorProvider blurredBackgroundColorProvider, boolean z) {
        ViewGroup viewGroup;
        BlurredBackgroundDrawable blurredBackgroundDrawableCreateDrawable = this.source.createDrawable();
        if (this.isLiquidGlassEffectAllowed && Build.VERSION.SDK_INT >= 33 && (blurredBackgroundDrawableCreateDrawable instanceof BlurredBackgroundDrawableRenderNode)) {
            BlurredBackgroundDrawableRenderNode blurredBackgroundDrawableRenderNode = (BlurredBackgroundDrawableRenderNode) blurredBackgroundDrawableCreateDrawable;
            blurredBackgroundDrawableRenderNode.liquidGlassEffect = new LiquidGlassEffect(blurredBackgroundDrawableRenderNode.renderNodeFill);
        }
        blurredBackgroundDrawableCreateDrawable.setColorProvider(blurredBackgroundColorProvider);
        ReferenceList referenceList = this.linkedViews;
        if (referenceList != null && view != null) {
            referenceList.add(view);
        }
        ViewPositionWatcher viewPositionWatcher = this.viewPositionWatcher;
        if (viewPositionWatcher != null && (viewGroup = this.parent) != null && view != null) {
            viewPositionWatcher.subscribe(view, viewGroup, new RateCallLayout$$ExternalSyntheticLambda1(9, blurredBackgroundDrawableCreateDrawable, view), z);
        }
        ReferenceList referenceList2 = this.linkedDrawables;
        if (referenceList2 != null) {
            referenceList2.add(blurredBackgroundDrawableCreateDrawable);
        }
        return blurredBackgroundDrawableCreateDrawable;
    }
}
