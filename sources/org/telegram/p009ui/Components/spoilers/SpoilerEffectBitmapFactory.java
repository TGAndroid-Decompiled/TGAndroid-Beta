package org.telegram.p009ui.Components.spoilers;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Shader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.SharedConfig;

public class SpoilerEffectBitmapFactory {
    private static SpoilerEffectBitmapFactory factory;
    Bitmap backgroundBitmap;
    Bitmap bufferBitmap;
    final DispatchQueue dispatchQueue = new DispatchQueue("SpoilerEffectBitmapFactory");
    boolean isRunning;
    long lastUpdateTime;
    private Bitmap shaderBitmap;
    Canvas shaderCanvas;
    Paint shaderPaint;
    ArrayList<SpoilerEffect> shaderSpoilerEffects;
    int size;

    public static SpoilerEffectBitmapFactory getInstance() {
        if (factory == null) {
            factory = new SpoilerEffectBitmapFactory();
        }
        return factory;
    }

    private SpoilerEffectBitmapFactory() {
        new Matrix();
        int m36dp = AndroidUtilities.m36dp(SharedConfig.getDevicePerformanceClass() == 2 ? 200.0f : 150.0f);
        Point point = AndroidUtilities.displaySize;
        int min = (int) Math.min(Math.min(point.x, point.y) * 0.5f, m36dp);
        this.size = min;
        if (min < AndroidUtilities.m36dp(100.0f)) {
            this.size = AndroidUtilities.m36dp(100.0f);
        }
    }

    public Paint getPaint() {
        if (this.shaderBitmap == null) {
            int i = this.size;
            this.shaderBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            this.shaderCanvas = new Canvas(this.shaderBitmap);
            this.shaderPaint = new Paint();
            this.shaderSpoilerEffects = new ArrayList<>(100);
            Paint paint = this.shaderPaint;
            Bitmap bitmap = this.shaderBitmap;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            int i2 = this.size;
            int i3 = (int) (i2 / 10.0f);
            int m36dp = (int) ((i2 / AndroidUtilities.m36dp(200.0f)) * 60.0f);
            for (int i4 = 0; i4 < 10; i4++) {
                for (int i5 = 0; i5 < 10; i5++) {
                    SpoilerEffect spoilerEffect = new SpoilerEffect();
                    int i6 = i3 * i4;
                    int i7 = i3 * i5;
                    spoilerEffect.setBounds(i6, i7 - AndroidUtilities.m36dp(5.0f), i6 + i3 + AndroidUtilities.m36dp(3.0f), i7 + i3 + AndroidUtilities.m36dp(5.0f));
                    spoilerEffect.drawPoints = true;
                    spoilerEffect.particlePoints = (float[][]) Array.newInstance(float.class, SpoilerEffect.ALPHAS.length, m36dp * 2);
                    spoilerEffect.setMaxParticlesCount(m36dp);
                    spoilerEffect.setColor(-1);
                    this.shaderSpoilerEffects.add(spoilerEffect);
                }
            }
            for (int i8 = 0; i8 < 10; i8++) {
                for (int i9 = 0; i9 < 10; i9++) {
                    this.shaderSpoilerEffects.get((i8 * 10) + i9).draw(this.shaderCanvas);
                }
            }
            Paint paint2 = this.shaderPaint;
            Bitmap bitmap2 = this.shaderBitmap;
            Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
            paint2.setShader(new BitmapShader(bitmap2, tileMode2, tileMode2));
            this.lastUpdateTime = System.currentTimeMillis();
        }
        return this.shaderPaint;
    }

    public void checkUpdate() {
        if (System.currentTimeMillis() - this.lastUpdateTime <= 32 || this.isRunning) {
            return;
        }
        this.lastUpdateTime = System.currentTimeMillis();
        this.isRunning = true;
        final Bitmap bitmap = this.bufferBitmap;
        this.dispatchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                SpoilerEffectBitmapFactory.this.lambda$checkUpdate$1(bitmap);
            }
        });
    }

    public void lambda$checkUpdate$1(final Bitmap bitmap) {
        if (bitmap == null) {
            int i = this.size;
            bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = this.backgroundBitmap;
        if (bitmap2 == null) {
            int i2 = this.size;
            this.backgroundBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        } else {
            bitmap2.eraseColor(0);
        }
        Canvas canvas = new Canvas(bitmap);
        Canvas canvas2 = new Canvas(this.backgroundBitmap);
        for (int i3 = 0; i3 < 10; i3++) {
            for (int i4 = 0; i4 < 10; i4++) {
                this.shaderSpoilerEffects.get((i3 * 10) + i4).draw(canvas2);
            }
        }
        bitmap.eraseColor(0);
        canvas.drawBitmap(this.backgroundBitmap, 0.0f, 0.0f, (Paint) null);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SpoilerEffectBitmapFactory.this.lambda$checkUpdate$0(bitmap);
            }
        });
    }

    public void lambda$checkUpdate$0(Bitmap bitmap) {
        this.bufferBitmap = this.shaderBitmap;
        this.shaderBitmap = bitmap;
        Paint paint = this.shaderPaint;
        Bitmap bitmap2 = this.shaderBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        paint.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
        this.isRunning = false;
    }
}
