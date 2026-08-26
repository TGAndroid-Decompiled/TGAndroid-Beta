package org.telegram.ui.Stories;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;

public final class StoryLinesDrawable {
    public float bufferingProgress;
    public boolean incrementBuffering;
    public int lastPosition;
    public final PeerStoriesView.SharedResources sharedResources;
    public final StaticLayout zoomHintLayout;
    public final float zoomHintLayoutLeft;
    public final float zoomHintLayoutWidth;
    public final TextPaint zoomHintPaint;
    public final AnimatedFloat zoomT;

    public StoryLinesDrawable(StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1, PeerStoriesView.SharedResources sharedResources) {
        this.sharedResources = sharedResources;
        this.zoomT = new AnimatedFloat(anonymousClass1, 0L, 360L, CubicBezierInterpolator.EASE_OUT_QUINT);
        TextPaint textPaint = new TextPaint(1);
        this.zoomHintPaint = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 805306368);
        StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.StorySeekHelp), textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.zoomHintLayout = staticLayout;
        this.zoomHintLayoutLeft = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.zoomHintLayoutWidth = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
