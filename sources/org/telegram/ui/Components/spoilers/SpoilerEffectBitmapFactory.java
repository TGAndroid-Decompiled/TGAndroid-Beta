package org.telegram.ui.Components.spoilers;

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
    boolean isRunning;
    long lastUpdateTime;
    private Bitmap shaderBitmap;
    Canvas shaderCanvas;
    Paint shaderPaint;
    ArrayList shaderSpoilerEffects;
    int size;
    final DispatchQueue dispatchQueue = new DispatchQueue("SpoilerEffectBitmapFactory", true, 3);
    Matrix localMatrix = new Matrix();

    private SpoilerEffectBitmapFactory() {
        int dp = AndroidUtilities.dp(SharedConfig.getDevicePerformanceClass() == 2 ? 150.0f : 100.0f);
        Point point = AndroidUtilities.displaySize;
        int min = (int) Math.min(Math.min(point.x, point.y) * 0.5f, dp);
        this.size = min;
        if (min < AndroidUtilities.dp(80.0f)) {
            this.size = AndroidUtilities.dp(80.0f);
        }
    }

    public static SpoilerEffectBitmapFactory getInstance() {
        if (factory == null) {
            factory = new SpoilerEffectBitmapFactory();
        }
        return factory;
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

    public void lambda$checkUpdate$1(final Bitmap bitmap) {
        if (bitmap == null) {
            int i = this.size;
            bitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ALPHA_8);
        }
        Bitmap bitmap2 = this.backgroundBitmap;
        if (bitmap2 == null) {
            int i2 = this.size;
            this.backgroundBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ALPHA_8);
        } else {
            bitmap2.eraseColor(0);
        }
        Canvas canvas = new Canvas(bitmap);
        Canvas canvas2 = new Canvas(this.backgroundBitmap);
        for (int i3 = 0; i3 < 10; i3++) {
            for (int i4 = 0; i4 < 10; i4++) {
                ((SpoilerEffect) this.shaderSpoilerEffects.get((i3 * 10) + i4)).draw(canvas2);
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

    public Paint getPaint() {
        if (this.shaderBitmap == null) {
            int i = this.size;
            this.shaderBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ALPHA_8);
            this.shaderCanvas = new Canvas(this.shaderBitmap);
            this.shaderPaint = new Paint();
            this.shaderSpoilerEffects = new ArrayList(100);
            Paint paint = this.shaderPaint;
            Bitmap bitmap = this.shaderBitmap;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            float f = this.size;
            int i2 = (int) (f / 10.0f);
            int dp = (int) ((f / AndroidUtilities.dp(200.0f)) * 60.0f);
            for (int i3 = 0; i3 < 10; i3++) {
                for (int i4 = 0; i4 < 10; i4++) {
                    SpoilerEffect spoilerEffect = new SpoilerEffect();
                    spoilerEffect.setSize(this.size);
                    int i5 = i2 * i3;
                    int i6 = i2 * i4;
                    spoilerEffect.setBounds(i5, i6 - AndroidUtilities.dp(5.0f), i5 + i2 + AndroidUtilities.dp(3.0f), i6 + i2 + AndroidUtilities.dp(5.0f));
                    spoilerEffect.drawPoints = true;
                    spoilerEffect.particlePoints = (float[][]) Array.newInstance((Class<?>) Float.TYPE, SpoilerEffect.ALPHAS.length, dp * 2);
                    spoilerEffect.setMaxParticlesCount(dp);
                    spoilerEffect.setColor(-1);
                    this.shaderSpoilerEffects.add(spoilerEffect);
                }
            }
            for (int i7 = 0; i7 < 10; i7++) {
                for (int i8 = 0; i8 < 10; i8++) {
                    ((SpoilerEffect) this.shaderSpoilerEffects.get((i7 * 10) + i8)).draw(this.shaderCanvas);
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
}
