package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ChatActivity$126$$ExternalSyntheticLambda0;

public final class PacmanAnimation {
    public boolean currentGhostWalk;
    public final Paint edgePaint;
    public ChatActivity$126$$ExternalSyntheticLambda0 finishRunnable;
    public Path ghostPath;
    public float ghostProgress;
    public boolean ghostWalk;
    public long lastUpdateTime;
    public final Paint paint = new Paint(1);
    public final View parentView;
    public float progress;
    public final RectF rect;
    public float translationProgress;

    public PacmanAnimation(View view) {
        Paint paint = new Paint(1);
        this.edgePaint = paint;
        this.lastUpdateTime = 0L;
        this.rect = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.parentView = view;
    }
}
