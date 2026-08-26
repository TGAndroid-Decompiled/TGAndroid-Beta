package org.telegram.ui.Components.Premium;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import com.google.android.gms.internal.mlkit_vision_label.zzcw;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.ChatActionCell;

public final class HelloParticles$Drawable$Particle {
    public int alpha;
    public Bitmap bitmap;
    public long duration;
    public int h;
    public float inProgress;
    public int l;
    public float scale;
    public boolean set;
    public StaticLayout staticLayout;
    public final ChatActionCell.TextLayout this$0;
    public int w;
    public float x;
    public float y;

    public HelloParticles$Drawable$Particle(ChatActionCell.TextLayout textLayout) {
        this.this$0 = textLayout;
    }

    public final void genPosition(int i, boolean z) {
        RectF rectF;
        this.duration = Math.abs(Utilities.fastRandom.nextLong() % 2250) + 2250;
        this.scale = (Math.abs(Utilities.fastRandom.nextFloat()) * 0.45f) + 0.6f;
        String str = HelloParticles.hellos[zzcw.m(Utilities.fastRandom, 49)];
        if (str.length() > 7) {
            this.scale *= 0.6f;
        } else if (str.length() > 5) {
            this.scale *= 0.75f;
        }
        ChatActionCell.TextLayout textLayout = this.this$0;
        StaticLayout staticLayout = new StaticLayout(str, textLayout.paint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.staticLayout = staticLayout;
        if (staticLayout.getLineCount() <= 0) {
            this.h = 0;
            this.w = 0;
            this.l = 0;
        } else {
            this.l = (int) this.staticLayout.getLineLeft(0);
            this.w = (int) this.staticLayout.getLineWidth(0);
            this.h = this.staticLayout.getHeight();
        }
        HashMap map = (HashMap) textLayout.layout;
        Bitmap bitmap = (Bitmap) map.get(str);
        this.bitmap = bitmap;
        if (bitmap == null) {
            this.bitmap = Bitmap.createBitmap(Math.max(1, this.w - Math.max(0, this.l)), Math.max(1, this.h), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.bitmap);
            canvas.translate(-this.l, 0.0f);
            this.staticLayout.draw(canvas);
            map.put(str, this.bitmap);
        }
        RectF rectF2 = (RectF) textLayout.patchedLayout;
        float f = rectF2.left;
        float f2 = this.w / 4.0f;
        float fCenterX = f + f2;
        float fCenterX2 = rectF2.right - f2;
        if (i % 2 == 0) {
            fCenterX2 = rectF2.centerX() - (this.w / 2.0f);
        } else {
            fCenterX = rectF2.centerX() + (this.w / 2.0f);
        }
        float f3 = fCenterX2 - fCenterX;
        float fAbs = Math.abs(Utilities.fastRandom.nextInt() % f3) + fCenterX;
        float fAbs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF2.height()) + rectF2.top;
        int i2 = 0;
        float f4 = 0.0f;
        while (i2 < 10) {
            float fAbs3 = Math.abs(Utilities.fastRandom.nextInt() % f3) + fCenterX;
            float fAbs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF2.height()) + rectF2.top;
            float f5 = 2.1474836E9f;
            int i3 = 0;
            while (true) {
                ArrayList arrayList = textLayout.spoilers;
                if (i3 >= arrayList.size()) {
                    break;
                }
                HelloParticles$Drawable$Particle helloParticles$Drawable$Particle = (HelloParticles$Drawable$Particle) arrayList.get(i3);
                if (helloParticles$Drawable$Particle.set) {
                    rectF = rectF2;
                    float fMin = Math.min(Math.abs(((((this.scale / textLayout.x) * helloParticles$Drawable$Particle.w) * 1.1f) + helloParticles$Drawable$Particle.x) - fAbs3), Math.abs(helloParticles$Drawable$Particle.x - fAbs3));
                    float f6 = helloParticles$Drawable$Particle.y - fAbs4;
                    float f7 = (f6 * f6) + (fMin * fMin);
                    if (f7 < f5) {
                        f5 = f7;
                    }
                } else {
                    rectF = rectF2;
                }
                i3++;
                rectF2 = rectF;
            }
            RectF rectF3 = rectF2;
            if (f5 > f4) {
                fAbs = fAbs3;
                f4 = f5;
                fAbs2 = fAbs4;
            }
            i2++;
            rectF2 = rectF3;
        }
        RectF rectF4 = rectF2;
        this.x = fAbs;
        this.y = fAbs2;
        double dAtan2 = Math.atan2(fAbs - rectF4.centerX(), this.y - rectF4.centerY());
        Math.sin(dAtan2);
        Math.cos(dAtan2);
        this.alpha = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        this.inProgress = z ? Math.abs((Utilities.fastRandom.nextFloat() % 1.0f) * 0.9f) : 0.0f;
        this.set = true;
    }
}
