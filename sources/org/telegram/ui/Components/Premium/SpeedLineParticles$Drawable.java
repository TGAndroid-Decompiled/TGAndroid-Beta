package org.telegram.ui.Components.Premium;

import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class SpeedLineParticles$Drawable {
    public int lastColor;
    public final RectF rect = new RectF();
    public final RectF screenRect = new RectF();
    public final Paint paint = new Paint();
    public final ArrayList particles = new ArrayList();
    public float speedScale = 1.0f;
    public final long minLifeTime = 2000;
    public final float dt = 1000.0f / AndroidUtilities.screenRefreshRate;
    public final int count = 200;
    public final float[] lines = new float[800];

    public final class Particle {
        public float inProgress;
        public long lifeTime;
        public float vecX;
        public float vecY;
        public float x;
        public float y;

        public Particle() {
        }

        public final void genPosition(long j, boolean z) {
            SpeedLineParticles$Drawable speedLineParticles$Drawable = SpeedLineParticles$Drawable.this;
            this.lifeTime = j + speedLineParticles$Drawable.minLifeTime + ((long) Utilities.fastRandom.nextInt(1000));
            RectF rectF = speedLineParticles$Drawable.rect;
            RectF rectF2 = z ? speedLineParticles$Drawable.screenRect : rectF;
            float fAbs = Math.abs(Utilities.fastRandom.nextInt() % rectF2.width()) + rectF2.left;
            float fAbs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF2.height()) + rectF2.top;
            this.x = fAbs;
            this.y = fAbs2;
            double dAtan2 = Math.atan2(fAbs - rectF.centerX(), this.y - rectF.centerY());
            this.vecX = (float) Math.sin(dAtan2);
            this.vecY = (float) Math.cos(dAtan2);
            Utilities.fastRandom.nextInt(50);
            this.inProgress = 0.0f;
        }
    }
}
