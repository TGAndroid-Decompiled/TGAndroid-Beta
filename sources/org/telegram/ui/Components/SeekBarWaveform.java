package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.Cells.ChatMessageCell;

public final class SeekBarWaveform {
    public static Paint paintInner;
    public static Paint paintOuter;
    public Path alphaPath;
    public ChatMessageCell delegate;
    public float explodeProgress;
    public float explosionRate;
    public float[] fromHeights;
    public int fromWidth;
    public int height;
    public float[] heights;
    public int innerColor;
    public boolean isUnread;
    public boolean loading;
    public Paint loadingPaint;
    public int loadingPaintColor1;
    public int loadingPaintColor2;
    public float loadingPaintWidth;
    public long loadingStart;
    public MessageObject messageObject;
    public int outerColor;
    public ChatMessageCell parentView;
    public Particles particles;
    public Path path;
    public float progress;
    public boolean selected;
    public int selectedColor;
    public float startX;
    public float[] toHeights;
    public int toWidth;
    public byte[] waveformBytes;
    public int width;
    public int thumbX = 0;
    public int thumbDX = 0;
    public boolean startDraging = false;
    public boolean pressed = false;
    public float alpha = 1.0f;
    public float clearProgress = 1.0f;
    public final AnimatedFloat appearFloat = new AnimatedFloat(125, 600, CubicBezierInterpolator.EASE_OUT_QUINT);
    public final float waveScaling = 1.0f;
    public final AnimatedFloat loadingFloat = new AnimatedFloat(150, CubicBezierInterpolator.DEFAULT);
    public boolean exploding = false;

    public final class Particles {
        public final int count;
        public RectF emitArea;
        public final SeekBarView$$ExternalSyntheticLambda1 invalidate;
        public long lastTime;
        public final Paint paint;
        public final ArrayList particles = new ArrayList(50);
        public final ArrayList deadParticles = new ArrayList(50);

        public final class Particle {
            public float d;
            public float t;
            public float v;
            public float vx;
            public float vy;
            public float x;
            public float y;
        }

        public Particles(SeekBarView$$ExternalSyntheticLambda1 seekBarView$$ExternalSyntheticLambda1) {
            Paint paint = new Paint(1);
            this.paint = paint;
            this.count = 250;
            this.invalidate = seekBarView$$ExternalSyntheticLambda1;
            paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
        }
    }

    public SeekBarWaveform() {
        if (paintInner == null) {
            paintInner = new Paint(1);
            paintOuter = new Paint(1);
            Paint paint = paintInner;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            paintOuter.setStyle(style);
        }
    }

    public final void addBar(Path path, float f, float f2) {
        float fDpf2 = AndroidUtilities.dpf2(2.0f);
        int iM$2 = OKLCH.m$2(14.0f, this.height, 2);
        float f3 = f2 * this.waveScaling;
        RectF rectF = AndroidUtilities.rectTmp;
        float f4 = fDpf2 / 2.0f;
        rectF.set((AndroidUtilities.dpf2(1.0f) + f) - f4, ((-f3) - f4) + AndroidUtilities.dp(7.0f) + iM$2, AndroidUtilities.dpf2(1.0f) + f + f4, f3 + f4 + AndroidUtilities.dp(7.0f) + iM$2);
        path.addRoundRect(rectF, fDpf2, fDpf2, Path.Direction.CW);
    }

    public final float[] calculateHeights(int i) {
        byte[] bArr = this.waveformBytes;
        if (bArr == null || i <= 0) {
            return null;
        }
        float[] fArr = new float[i];
        int i2 = 5;
        int length = (bArr.length * 8) / 5;
        float f = length / i;
        int i3 = 0;
        int i4 = 0;
        float f2 = 0.0f;
        int i5 = 0;
        loop0: while (i3 < length) {
            if (i3 == i4) {
                int i6 = i4;
                int i7 = 0;
                while (i4 == i6) {
                    f2 += f;
                    i6 = (int) f2;
                    i7++;
                }
                int i8 = i3 * 5;
                int i9 = i8 / 8;
                int i10 = i8 - (i9 * 8);
                int i11 = 8 - i10;
                int i12 = 5 - i11;
                byte bMin = (byte) ((this.waveformBytes[i9] >> i10) & ((2 << (Math.min(i2, i11) - 1)) - 1));
                if (i12 > 0) {
                    int i13 = i9 + 1;
                    byte[] bArr2 = this.waveformBytes;
                    if (i13 < bArr2.length) {
                        bMin = (byte) (((byte) (bMin << i12)) | (bArr2[i13] & ((2 << (4 - i11)) - 1)));
                    }
                }
                int i14 = 0;
                while (i14 < i7) {
                    if (i5 >= i) {
                        break loop0;
                    }
                    fArr[i5] = Math.max(0.0f, (bMin * 7) / 31.0f);
                    i14++;
                    i5++;
                }
                i4 = i6;
            }
            i3++;
            i2 = 5;
        }
        return fArr;
    }

    public final void draw(Canvas canvas, ChatMessageCell chatMessageCell) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        RectF rectF;
        ArrayList arrayList;
        ArrayList arrayList2;
        float[] fArr;
        float[] fArr2;
        MessageObject messageObject;
        if (this.waveformBytes == null || (i = this.width) == 0 || this.alpha <= 0.0f) {
            return;
        }
        float fDpf2 = i / AndroidUtilities.dpf2(3.0f);
        if (fDpf2 <= 0.1f) {
            return;
        }
        float f5 = this.clearProgress;
        if (f5 != 1.0f) {
            float f6 = f5 + 0.10666667f;
            this.clearProgress = f6;
            if (f6 > 1.0f) {
                this.clearProgress = 1.0f;
            } else {
                chatMessageCell.invalidate();
            }
        }
        float f7 = this.appearFloat.set(1.0f, false);
        Path path = this.path;
        if (path == null) {
            this.path = new Path();
        } else {
            path.reset();
        }
        Path path2 = this.alphaPath;
        if (path2 == null) {
            this.alphaPath = new Path();
        } else {
            path2.reset();
        }
        ChatMessageCell chatMessageCell2 = this.delegate;
        boolean z = (chatMessageCell2 == null || (messageObject = chatMessageCell2.currentMessageObject) == null || !messageObject.isVoiceOnce()) ? false : true;
        float[] fArr3 = this.fromHeights;
        if (fArr3 == null || (fArr2 = this.toHeights) == null) {
            f = fDpf2;
            f2 = 3.0f;
            if (this.heights != null) {
                int i2 = 0;
                while (true) {
                    float f8 = i2;
                    if (f8 >= f || i2 >= this.heights.length) {
                        break;
                    }
                    float fDpf3 = AndroidUtilities.dpf2(3.0f) * f8;
                    float fClamp = MathUtils.clamp((f7 * f) - f8, 0.0f, 1.0f);
                    float[] fArr4 = this.heights;
                    addBar(this.path, fDpf3, BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, fClamp, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(fArr4[z ? (fArr4.length - 1) - i2 : i2]) * fClamp));
                    i2++;
                }
            }
            f3 = 0.0f;
        } else {
            int i3 = this.width;
            int i4 = this.fromWidth;
            float f9 = (i3 - i4) / (this.toWidth - i4);
            int iMax = Math.max(fArr3.length, fArr2.length);
            int iMin = Math.min(this.fromHeights.length, this.toHeights.length);
            float[] fArr5 = this.fromHeights;
            int length = fArr5.length;
            float[] fArr6 = this.toHeights;
            f2 = 3.0f;
            float[] fArr7 = length < fArr6.length ? fArr5 : fArr6;
            float[] fArr8 = fArr5.length < fArr6.length ? fArr6 : fArr5;
            if (fArr5.length >= fArr6.length) {
                f9 = 1.0f - f9;
            }
            int i5 = -1;
            int i6 = 0;
            f3 = 0.0f;
            while (i6 < iMax) {
                float f10 = i6;
                float f11 = fDpf2;
                int iClamp = MathUtils.clamp((int) Math.floor((f10 / iMax) * iMin), 0, iMin - 1);
                if (i5 < iClamp) {
                    addBar(this.path, AndroidUtilities.dpf2(3.0f) * AndroidUtilities.lerp(iClamp, f10, f9), AndroidUtilities.dpf2(AndroidUtilities.lerp(fArr7[z ? (fArr7.length - 1) - iClamp : iClamp], fArr8[z ? (fArr8.length - 1) - i6 : i6], f9)));
                    i5 = iClamp;
                } else {
                    float fDpf4 = AndroidUtilities.dpf2(3.0f) * AndroidUtilities.lerp(iClamp, f10, f9);
                    if (z) {
                        iClamp = (fArr7.length - 1) - iClamp;
                    }
                    addBar(this.alphaPath, fDpf4, AndroidUtilities.dpf2(AndroidUtilities.lerp(fArr7[iClamp], fArr8[z ? (fArr8.length - 1) - i6 : i6], f9)));
                    f3 = f9;
                }
                i6++;
                fDpf2 = f11;
            }
            f = fDpf2;
        }
        if (this.exploding || this.explosionRate > 0.0f) {
            canvas.save();
            f4 = 0.0f;
            canvas.clipRect(0.0f, 0.0f, (1.0f - (this.explodeProgress * this.explosionRate)) * AndroidUtilities.dpf2(f2) * f, this.height);
        } else {
            f4 = 0.0f;
        }
        if (f3 > f4) {
            canvas.save();
            canvas.clipPath(this.alphaPath);
            drawFill(canvas, f3 * this.alpha);
            canvas.restore();
        }
        canvas.save();
        canvas.clipPath(this.path);
        drawFill(canvas, this.alpha);
        canvas.restore();
        if (this.exploding || this.explosionRate > 0.0f) {
            canvas.restore();
            if (this.particles == null) {
                this.particles = new Particles(new SeekBarView$$ExternalSyntheticLambda1(this, 11));
            }
            float f12 = this.explodeProgress;
            if (f12 >= 0.99f || (fArr = this.heights) == null) {
                rectF = null;
            } else {
                int i7 = (int) ((1.0f - f12) * f);
                if (z) {
                    i7 = (int) ((f - 1.0f) - i7);
                }
                if (i7 < 0 || i7 >= fArr.length) {
                    rectF = null;
                } else {
                    float fDpf5 = AndroidUtilities.dpf2(this.heights[i7]) * MathUtils.clamp((f7 * f) - i7, 0.0f, 1.0f);
                    rectF = AndroidUtilities.rectTmp;
                    float fDpf6 = AndroidUtilities.dpf2(f2) * (1.0f - this.explodeProgress) * f;
                    float fDpf7 = AndroidUtilities.dpf2(2.0f);
                    int iM$2 = OKLCH.m$2(14.0f, this.height, 2);
                    float f13 = fDpf5 * this.waveScaling;
                    float f14 = fDpf7 / 2.0f;
                    rectF.set((AndroidUtilities.dpf2(1.0f) + fDpf6) - f14, ((-f13) - f14) + AndroidUtilities.dp(7.0f) + iM$2, AndroidUtilities.dpf2(1.0f) + fDpf6 + f14, f13 + f14 + AndroidUtilities.dp(7.0f) + iM$2);
                }
            }
            Particles particles = this.particles;
            particles.paint.setColor(this.outerColor);
            particles.emitArea = rectF;
            float f15 = this.explosionRate;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMin = Math.min(20L, jCurrentTimeMillis - particles.lastTime);
            particles.lastTime = jCurrentTimeMillis;
            int i8 = 0;
            while (true) {
                arrayList = particles.particles;
                int size = arrayList.size();
                arrayList2 = particles.deadParticles;
                if (i8 >= size) {
                    break;
                }
                Particles.Particle particle = (Particles.Particle) arrayList.get(i8);
                float f16 = jMin;
                float f17 = particle.t - (f16 / particle.d);
                particle.t = f17;
                if (f17 < 0.0f) {
                    arrayList2.add(particle);
                    arrayList.remove(i8);
                    i8--;
                } else {
                    float f18 = particle.x;
                    float f19 = particle.vx;
                    float f20 = particle.v;
                    particle.x = (((f19 * f20) * f16) / 500.0f) + f18;
                    float f21 = particle.y;
                    float f22 = particle.vy;
                    particle.y = (((f20 * f22) * f16) / 500.0f) + f21;
                    particle.vy = f22 - ((((long) AndroidUtilities.dp(0.33f)) * jMin) / 500.0f);
                }
                i8++;
            }
            if (particles.emitArea != null) {
                int iMin2 = Math.min(4, particles.count - arrayList.size());
                for (int i9 = 0; i9 < iMin2; i9++) {
                    Particles.Particle particle2 = arrayList2.isEmpty() ? new Particles.Particle() : (Particles.Particle) arrayList2.remove(0);
                    RectF rectF2 = particles.emitArea;
                    particle2.x = (Utilities.random.nextFloat() * rectF2.width()) + rectF2.left;
                    RectF rectF3 = particles.emitArea;
                    particle2.y = (Utilities.random.nextFloat() * rectF3.height()) + rectF3.top;
                    double dNextInt = ((double) (Utilities.random.nextInt(200) - 125)) * 0.017453292519943295d;
                    particle2.vx = ((float) (Math.cos(dNextInt) - Math.sin(dNextInt))) * 0.8f;
                    particle2.vy = ((float) (Math.cos(dNextInt) + Math.sin(dNextInt))) - 0.2f;
                    particle2.t = 1.0f;
                    particle2.v = AndroidUtilities.dp((Utilities.random.nextFloat() * 7.0f) + 10.0f);
                    particle2.d = AndroidUtilities.lerp(420, 550, Utilities.random.nextFloat());
                    arrayList.add(particle2);
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Particles.Particle particle3 = (Particles.Particle) arrayList.get(i10);
                Paint paint = particles.paint;
                paint.setAlpha((int) (255.0f * f15 * particle3.t));
                canvas.drawPoint(particle3.x, particle3.y, paint);
            }
            SeekBarView$$ExternalSyntheticLambda1 seekBarView$$ExternalSyntheticLambda1 = particles.invalidate;
            if (seekBarView$$ExternalSyntheticLambda1 != null) {
                seekBarView$$ExternalSyntheticLambda1.run();
            }
        }
    }

    public final void drawFill(Canvas canvas, float f) {
        int i;
        float fDpf2 = AndroidUtilities.dpf2(2.0f);
        MessageObject messageObject = this.messageObject;
        boolean z = messageObject != null && messageObject.isContentUnread() && !this.messageObject.isOut() && this.progress <= 0.0f;
        this.isUnread = z;
        Paint paint = paintInner;
        if (z) {
            i = this.outerColor;
        } else {
            i = this.selected ? this.selectedColor : this.innerColor;
        }
        paint.setColor(i);
        paintOuter.setColor(this.outerColor);
        ChatMessageCell chatMessageCell = this.parentView;
        AnimatedFloat animatedFloat = this.loadingFloat;
        animatedFloat.parent = chatMessageCell;
        float f2 = animatedFloat.set((!this.loading || MediaController.getInstance().isPlayingMessage(this.messageObject)) ? 0.0f : 1.0f, false);
        Paint paint2 = paintInner;
        paint2.setColor(ColorUtils.blendARGB(f2, paint2.getColor(), this.innerColor));
        Paint paint3 = paintOuter;
        float f3 = 1.0f - f2;
        paint3.setAlpha((int) (paint3.getAlpha() * f3 * f));
        Paint paint4 = paintInner;
        paint4.setAlpha((int) (paint4.getAlpha() * f));
        canvas.drawRect(0.0f, 0.0f, this.width + fDpf2, this.height, paintInner);
        if (f2 < 1.0f) {
            canvas.drawRect(0.0f, 0.0f, (this.width + fDpf2) * this.progress * f3, this.height, paintOuter);
        }
        if (f2 > 0.0f) {
            if (this.loadingPaint == null || Math.abs(this.loadingPaintWidth - this.width) > AndroidUtilities.dp(8.0f) || this.loadingPaintColor1 != this.innerColor || this.loadingPaintColor2 != this.outerColor) {
                if (this.loadingPaint == null) {
                    this.loadingPaint = new Paint(1);
                }
                this.loadingPaintColor1 = this.innerColor;
                this.loadingPaintColor2 = this.outerColor;
                Paint paint5 = this.loadingPaint;
                float f4 = this.width;
                this.loadingPaintWidth = f4;
                int i2 = this.loadingPaintColor1;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, f4, 0.0f, new int[]{i2, this.loadingPaintColor2, i2}, new float[]{0.0f, 0.2f, 0.4f}, Shader.TileMode.CLAMP));
            }
            this.loadingPaint.setAlpha((int) (f2 * 255.0f * f));
            canvas.save();
            float fPow = ((((float) Math.pow((SystemClock.elapsedRealtime() - this.loadingStart) / 270.0f, 0.75d)) % 1.6f) - 0.6f) * this.loadingPaintWidth;
            canvas.translate(fPow, 0.0f);
            canvas.drawRect(-fPow, 0.0f, (this.width + 5) - fPow, this.height, this.loadingPaint);
            canvas.restore();
            ChatMessageCell chatMessageCell2 = this.parentView;
            if (chatMessageCell2 != null) {
                chatMessageCell2.invalidate();
            }
        }
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final void setProgress() {
        setProgress(0.0f, false);
    }

    public final void setSize(int i, int i2, int i3, int i4) {
        this.width = i;
        this.height = i2;
        float[] fArr = this.heights;
        if (fArr == null || fArr.length != ((int) (i / AndroidUtilities.dpf2(3.0f)))) {
            this.heights = calculateHeights((int) (this.width / AndroidUtilities.dpf2(3.0f)));
        }
        if (i3 == i4 || (this.fromWidth == i3 && this.toWidth == i4)) {
            if (i3 == i4) {
                this.toHeights = null;
                this.fromHeights = null;
                return;
            }
            return;
        }
        this.fromWidth = i3;
        this.toWidth = i4;
        this.fromHeights = calculateHeights((int) (i3 / AndroidUtilities.dpf2(3.0f)));
        this.toHeights = calculateHeights((int) (this.toWidth / AndroidUtilities.dpf2(3.0f)));
    }

    public final void setProgress(float f, boolean z) {
        MessageObject messageObject = this.delegate.currentMessageObject;
        if (!(messageObject == null || !messageObject.isVoiceOnce())) {
            this.progress = 1.0f;
            return;
        }
        boolean z2 = this.isUnread;
        this.progress = z2 ? 1.0f : f;
        int i = z2 ? this.width : this.thumbX;
        if (z && i != 0 && f == 0.0f) {
            this.clearProgress = 0.0f;
        } else if (!z) {
            this.clearProgress = 1.0f;
        }
        int iCeil = (int) Math.ceil(this.width * f);
        this.thumbX = iCeil;
        if (iCeil < 0) {
            this.thumbX = 0;
            return;
        }
        int i2 = this.width;
        if (iCeil > i2) {
            this.thumbX = i2;
        }
    }
}
