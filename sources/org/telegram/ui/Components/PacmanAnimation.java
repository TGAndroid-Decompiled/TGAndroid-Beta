package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;

public class PacmanAnimation {
    private boolean currentGhostWalk;
    private Runnable finishRunnable;
    private Path ghostPath;
    private float ghostProgress;
    private boolean ghostWalk;
    private View parentView;
    private float progress;
    private float translationProgress;
    private Paint paint = new Paint(1);
    private Paint edgePaint = new Paint(1);
    private long lastUpdateTime = 0;
    private RectF rect = new RectF();

    public PacmanAnimation(View view) {
        this.edgePaint.setStyle(Paint.Style.STROKE);
        this.edgePaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.parentView = view;
    }

    private void drawGhost(Canvas canvas, int i) {
        float f;
        float f2;
        Path path = this.ghostPath;
        if (path == null || this.ghostWalk != this.currentGhostWalk) {
            if (path == null) {
                this.ghostPath = new Path();
            }
            this.ghostPath.reset();
            boolean z = this.ghostWalk;
            this.currentGhostWalk = z;
            if (z) {
                f = 35.0f;
                this.ghostPath.moveTo(0.0f, AndroidUtilities.dp(50.0f));
                this.ghostPath.lineTo(0.0f, AndroidUtilities.dp(24.0f));
                f2 = 28.0f;
                this.rect.set(0.0f, 0.0f, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(24.0f));
                this.ghostPath.arcTo(this.rect, 180.0f, 180.0f, false);
                this.ghostPath.lineTo(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(50.0f));
                this.ghostPath.lineTo(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(43.0f));
                this.ghostPath.lineTo(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(50.0f));
                this.ghostPath.lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(43.0f));
                this.ghostPath.lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(50.0f));
                this.ghostPath.lineTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(43.0f));
            } else {
                f = 35.0f;
                f2 = 28.0f;
                this.ghostPath.moveTo(0.0f, AndroidUtilities.dp(43.0f));
                this.ghostPath.lineTo(0.0f, AndroidUtilities.dp(24.0f));
                this.rect.set(0.0f, 0.0f, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(24.0f));
                this.ghostPath.arcTo(this.rect, 180.0f, 180.0f, false);
                this.ghostPath.lineTo(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(43.0f));
                this.ghostPath.lineTo(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(50.0f));
                this.ghostPath.lineTo(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(43.0f));
                this.ghostPath.lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(50.0f));
                this.ghostPath.lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(43.0f));
                this.ghostPath.lineTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f));
            }
            this.ghostPath.close();
        } else {
            f = 35.0f;
            f2 = 28.0f;
        }
        canvas.drawPath(this.ghostPath, this.edgePaint);
        if (i == 0) {
            this.paint.setColor(-90112);
        } else if (i == 1) {
            this.paint.setColor(-85326);
        } else {
            this.paint.setColor(-16720161);
        }
        canvas.drawPath(this.ghostPath, this.paint);
        this.paint.setColor(-1);
        this.rect.set(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(f2));
        canvas.drawOval(this.rect, this.paint);
        this.rect.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(f2));
        canvas.drawOval(this.rect, this.paint);
        this.paint.setColor(-16777216);
        this.rect.set(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f));
        canvas.drawOval(this.rect, this.paint);
        this.rect.set(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f), AndroidUtilities.dp(24.0f));
        canvas.drawOval(this.rect, this.paint);
    }

    private void update() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.lastUpdateTime;
        this.lastUpdateTime = jCurrentTimeMillis;
        if (j > 17) {
            j = 17;
        }
        if (this.progress >= 1.0f) {
            this.progress = 0.0f;
        }
        float f = j;
        float f2 = (f / 400.0f) + this.progress;
        this.progress = f2;
        if (f2 > 1.0f) {
            this.progress = 1.0f;
        }
        float f3 = (f / 2000.0f) + this.translationProgress;
        this.translationProgress = f3;
        if (f3 > 1.0f) {
            this.translationProgress = 1.0f;
        }
        float f4 = (f / 200.0f) + this.ghostProgress;
        this.ghostProgress = f4;
        if (f4 >= 1.0f) {
            this.ghostWalk = !this.ghostWalk;
            this.ghostProgress = 0.0f;
        }
        this.parentView.invalidate();
    }

    public void draw(Canvas canvas, int i) {
        int iDp = AndroidUtilities.dp(110.0f);
        int iDp2 = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f);
        int iM = RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(62.0f, 3, iDp);
        float measuredWidth = ((this.parentView.getMeasuredWidth() + iM) * this.translationProgress) - iM;
        int i2 = iDp / 2;
        int i3 = i - i2;
        this.paint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        int i4 = iDp2 / 2;
        float f = measuredWidth + i2;
        canvas.drawRect(0.0f, i - i4, f, i + i4 + 1, this.paint);
        this.paint.setColor(-69120);
        float f2 = measuredWidth + iDp;
        this.rect.set(measuredWidth, i3, f2, i3 + iDp);
        float f3 = this.progress;
        int iM$1 = (int) (f3 < 0.5f ? OKLCH.m$1(f3, 0.5f, 1.0f, 35.0f) : ((f3 - 0.5f) * 35.0f) / 0.5f);
        float f4 = iM$1;
        float f5 = 360 - (iM$1 * 2);
        canvas.drawArc(this.rect, f4, f5, true, this.edgePaint);
        canvas.drawArc(this.rect, f4, f5, true, this.paint);
        this.paint.setColor(-16777216);
        canvas.drawCircle(f - AndroidUtilities.dp(8.0f), (iDp / 4) + i3, AndroidUtilities.dp(8.0f), this.paint);
        canvas.save();
        canvas.translate(f2 + AndroidUtilities.dp(20.0f), i - AndroidUtilities.dp(25.0f));
        for (int i5 = 0; i5 < 3; i5++) {
            drawGhost(canvas, i5);
            canvas.translate(AndroidUtilities.dp(62.0f), 0.0f);
        }
        canvas.restore();
        if (this.translationProgress >= 1.0f) {
            this.finishRunnable.run();
        }
        update();
    }

    public void setFinishRunnable(Runnable runnable) {
        this.finishRunnable = runnable;
    }

    public void start() {
        this.translationProgress = 0.0f;
        this.progress = 0.0f;
        this.lastUpdateTime = System.currentTimeMillis();
        this.parentView.invalidate();
    }
}
