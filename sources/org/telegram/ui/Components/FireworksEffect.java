package org.telegram.ui.Components;

import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public final class FireworksEffect {
    public long lastAnimationTime;
    public final Paint particlePaint;
    public final ArrayList particles = new ArrayList();
    public final ArrayList freeParticles = new ArrayList();

    public final class Particle {
        public float alpha;
        public int color;
        public float currentTime;
        public float lifeTime;
        public float scale;
        public float velocity;
        public float vx;
        public float vy;
        public float x;
        public float y;

        public Particle() {
        }
    }

    public FireworksEffect() {
        Paint paint = new Paint(1);
        this.particlePaint = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint.setColor(Theme.getColor(null, Theme.key_actionBarDefaultTitle, false) & (-1644826));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        for (int i = 0; i < 20; i++) {
            this.freeParticles.add(new Particle());
        }
    }
}
