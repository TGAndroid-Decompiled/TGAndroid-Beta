package org.telegram.ui.Components.spoilers;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Shader;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

public class SpoilerEffectBitmapFactory {
    private static SpoilerEffectBitmapFactory factory;
    private Bitmap backgroundBitmap;
    private Canvas backgroundCanvas;
    private boolean invalidated;
    private boolean isDrawnWithClipRegion;
    private boolean isRunning;
    private long lastUpdateTime;
    private Paint shaderPaint;
    private ArrayList shaderSpoilerEffects;
    final int size;
    private final DispatchQueue dispatchQueue = new DispatchQueue("SpoilerEffectBitmapFactory", true, 3);
    private final PointsBuffer[] buffers = new PointsBuffer[SpoilerEffect.ALPHAS.length];
    private final Buffer[] bitmapBuffers = new Buffer[2];
    private int currentBitmapBuffer = 0;
    private final Rect clipRegion = new Rect();
    private final Choreographer.FrameCallback postFrameCallback = new Choreographer.FrameCallback() {
        @Override
        public final void doFrame(long j) {
            this.f$0.lambda$new$0(j);
        }
    };
    private final Rect clipRegionDump = new Rect();

    public static SpoilerEffectBitmapFactory getInstance() {
        if (factory == null) {
            factory = new SpoilerEffectBitmapFactory();
        }
        return factory;
    }

    private SpoilerEffectBitmapFactory() {
        int i = 0;
        int iDp = AndroidUtilities.dp(SharedConfig.getDevicePerformanceClass() == 2 ? 150.0f : 100.0f);
        Point point = AndroidUtilities.displaySize;
        int iMin = (int) Math.min(Math.min(point.x, point.y) * 0.5f, iDp);
        this.size = iMin < AndroidUtilities.dp(80.0f) ? AndroidUtilities.dp(80.0f) : iMin;
        while (true) {
            PointsBuffer[] pointsBufferArr = this.buffers;
            if (i >= pointsBufferArr.length) {
                return;
            }
            pointsBufferArr[i] = new PointsBuffer();
            i++;
        }
    }

    Paint getPaint() {
        Buffer[] bufferArr = this.bitmapBuffers;
        if (bufferArr[0] == null) {
            bufferArr[0] = new Buffer(this.size);
            this.shaderPaint = new Paint();
            this.shaderSpoilerEffects = new ArrayList(100);
            float f = this.size;
            int i = (int) (f / 10.0f);
            int iDp = (int) ((f / AndroidUtilities.dp(200.0f)) * 60.0f);
            for (int i2 = 0; i2 < 10; i2++) {
                for (int i3 = 0; i3 < 10; i3++) {
                    SpoilerEffect spoilerEffect = new SpoilerEffect();
                    spoilerEffect.setSize(this.size);
                    int i4 = i * i2;
                    int i5 = i * i3;
                    spoilerEffect.setBounds(i4, i5 - AndroidUtilities.dp(5.0f), i4 + i + AndroidUtilities.dp(3.0f), i5 + i + AndroidUtilities.dp(5.0f));
                    spoilerEffect.setMaxParticlesCount(Math.min(SpoilerEffect.MAX_PARTICLES_PER_ENTITY * 5, iDp));
                    spoilerEffect.setColor(-1);
                    this.shaderSpoilerEffects.add(spoilerEffect);
                }
            }
            Canvas canvas = new Canvas(this.bitmapBuffers[0].bitmap);
            int i6 = this.size;
            doDraw(canvas, new Rect(0, 0, i6, i6));
            this.shaderPaint.setShader(this.bitmapBuffers[0].shader);
            this.lastUpdateTime = System.currentTimeMillis();
        } else if (this.isDrawnWithClipRegion && !LiteMode.isEnabled(128)) {
            this.currentBitmapBuffer = 0;
            Canvas canvas2 = new Canvas(this.bitmapBuffers[0].bitmap);
            int i7 = this.size;
            doDraw(canvas2, new Rect(0, 0, i7, i7));
            this.shaderPaint.setShader(this.bitmapBuffers[0].shader);
            this.lastUpdateTime = System.currentTimeMillis();
            this.isDrawnWithClipRegion = false;
        }
        return this.shaderPaint;
    }

    private void doDraw(Canvas canvas, Rect rect) {
        for (PointsBuffer pointsBuffer : this.buffers) {
            pointsBuffer.reset();
        }
        for (int i = 0; i < 100; i++) {
            SpoilerEffect spoilerEffect = (SpoilerEffect) this.shaderSpoilerEffects.get(i);
            if (Rect.intersects(spoilerEffect.getBounds(), rect)) {
                spoilerEffect.addPoints(this.buffers, rect);
            }
        }
        ((SpoilerEffect) this.shaderSpoilerEffects.get(0)).drawPoints(canvas, this.buffers);
    }

    public void checkUpdate(Rect rect) {
        applyClip(rect);
        if (this.invalidated || this.clipRegion.isEmpty()) {
            return;
        }
        this.invalidated = true;
        Choreographer.getInstance().postFrameCallback(this.postFrameCallback);
    }

    private void applyClip(Rect rect) {
        int i = rect.left;
        int i2 = this.size;
        int i3 = ((i % i2) + i2) % i2;
        int i4 = ((rect.top % i2) + i2) % i2;
        int iMin = Math.min(rect.width(), this.size) + i3;
        int iMin2 = Math.min(rect.height(), this.size) + i4;
        this.clipRegion.union(i3, i4, Math.min(iMin, this.size), Math.min(iMin2, this.size));
        int i5 = this.size;
        if (iMin > i5) {
            this.clipRegion.union(0, i4, iMin - i5, Math.min(iMin2, i5));
        }
        int i6 = this.size;
        if (iMin2 > i6) {
            this.clipRegion.union(i3, 0, Math.min(iMin, i6), iMin2 - this.size);
        }
        int i7 = this.size;
        if (iMin <= i7 || iMin2 <= i7) {
            return;
        }
        this.clipRegion.union(0, 0, iMin - i7, iMin2 - i7);
    }

    public void lambda$new$0(long j) {
        checkUpdateImpl();
        this.clipRegion.set(0, 0, 0, 0);
        this.invalidated = false;
    }

    private void checkUpdateImpl() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastUpdateTime <= 32 || this.isRunning || this.clipRegion.isEmpty()) {
            return;
        }
        this.lastUpdateTime = jCurrentTimeMillis;
        this.isRunning = true;
        this.clipRegionDump.set(this.clipRegion);
        final int i = (this.currentBitmapBuffer + 1) % 2;
        this.dispatchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkUpdateImpl$2(i);
            }
        });
    }

    public void lambda$checkUpdateImpl$2(final int i) {
        Buffer[] bufferArr = this.bitmapBuffers;
        if (bufferArr[i] == null) {
            bufferArr[i] = new Buffer(this.size);
        }
        Bitmap bitmap = this.backgroundBitmap;
        if (bitmap == null) {
            int i2 = this.size;
            this.backgroundBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ALPHA_8);
            this.backgroundCanvas = new Canvas(this.backgroundBitmap);
        } else {
            bitmap.eraseColor(0);
        }
        doDraw(this.backgroundCanvas, this.clipRegionDump);
        Utilities.copyBitmaps(this.backgroundBitmap, this.bitmapBuffers[i].bitmap);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkUpdateImpl$1(i);
            }
        });
    }

    public void lambda$checkUpdateImpl$1(int i) {
        this.currentBitmapBuffer = i;
        this.shaderPaint.setShader(this.bitmapBuffers[i].shader);
        this.isRunning = false;
        this.isDrawnWithClipRegion = true;
    }

    private static class Buffer {
        private final Bitmap bitmap;
        private final BitmapShader shader;

        public Buffer(int i) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ALPHA_8);
            this.bitmap = bitmapCreateBitmap;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.shader = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
        }
    }

    public static class PointsBuffer {
        private float[] buffer;
        private int length;

        public PointsBuffer(int i) {
            this.buffer = new float[Math.max(i, 2)];
            this.length = 0;
        }

        public PointsBuffer() {
            this(64);
        }

        public void reset() {
            this.length = 0;
        }

        public void addPoints(float[] fArr, int i, int i2) {
            ensureCapacity(this.length + i2);
            System.arraycopy(fArr, i, this.buffer, this.length, i2);
            this.length += i2;
        }

        public void draw(Canvas canvas, Paint paint) {
            int i = this.length;
            if (i > 0) {
                canvas.drawPoints(this.buffer, 0, i, paint);
            }
        }

        private void ensureCapacity(int i) {
            float[] fArr = this.buffer;
            if (i <= fArr.length) {
                return;
            }
            this.buffer = Arrays.copyOf(this.buffer, Math.max(i, fArr.length * 2));
        }
    }
}
