package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.IntroActivity;

public final class ChatLoadingCell extends FrameLayout {
    public int backgroundHeight;
    public final IntroActivity.AnonymousClass1 frameLayout;
    public final Theme.ResourcesProvider resourcesProvider;
    public float viewTop;

    public ChatLoadingCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        IntroActivity.AnonymousClass1 anonymousClass1 = new IntroActivity.AnonymousClass1(this, context);
        this.frameLayout = anonymousClass1;
        anonymousClass1.setWillNotDraw(false);
        addView(anonymousClass1, LayoutHelper.createFrame(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, resourcesProvider);
        radialProgressView.setSize(AndroidUtilities.dp(28.0f));
        radialProgressView.setProgressColor(Theme.getColor(Theme.key_chat_serviceText, resourcesProvider));
        anonymousClass1.addView(radialProgressView, LayoutHelper.createFrame(32, 32, 17));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
    }

    public void setProgressVisible(boolean z) {
        this.frameLayout.setVisibility(z ? 0 : 4);
    }

    public final void setVisiblePart(float f, int i) {
        if (this.viewTop != f) {
            invalidate();
        }
        this.viewTop = f;
        this.backgroundHeight = i;
    }
}
