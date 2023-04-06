package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.SeekBar;
public class SeekBarWaveform {
    private static Paint paintInner;
    private static Paint paintOuter;
    private Path alphaPath;
    private ArrayList<Float> animatedValues;
    private SeekBar.SeekBarDelegate delegate;
    private float[] fromHeights;
    private int fromWidth;
    private int height;
    private float[] heights;
    private int innerColor;
    private boolean isUnread;
    private boolean loading;
    private Paint loadingPaint;
    private int loadingPaintColor1;
    private int loadingPaintColor2;
    private float loadingPaintWidth;
    private long loadingStart;
    private MessageObject messageObject;
    private int outerColor;
    private View parentView;
    private Path path;
    private float progress;
    private boolean selected;
    private int selectedColor;
    private float startX;
    private float[] toHeights;
    private int toWidth;
    private byte[] waveformBytes;
    private int width;
    private int thumbX = 0;
    private int thumbDX = 0;
    private boolean startDraging = false;
    private boolean pressed = false;
    private float alpha = 1.0f;
    private float clearProgress = 1.0f;
    private AnimatedFloat appearFloat = new AnimatedFloat(125, 600, CubicBezierInterpolator.EASE_OUT_QUINT);
    private float waveScaling = 1.0f;
    private AnimatedFloat loadingFloat = new AnimatedFloat(150, CubicBezierInterpolator.DEFAULT);

    public SeekBarWaveform(Context context) {
        if (paintInner == null) {
            paintInner = new Paint(1);
            paintOuter = new Paint(1);
            paintInner.setStyle(Paint.Style.FILL);
            paintOuter.setStyle(Paint.Style.FILL);
        }
    }

    public void setDelegate(SeekBar.SeekBarDelegate seekBarDelegate) {
        this.delegate = seekBarDelegate;
    }

    public void setColors(int i, int i2, int i3) {
        this.innerColor = i;
        this.outerColor = i2;
        this.selectedColor = i3;
    }

    public void setWaveform(byte[] bArr) {
        this.waveformBytes = bArr;
        this.heights = calculateHeights((int) (this.width / AndroidUtilities.dpf2(3.0f)));
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }

    public void setMessageObject(MessageObject messageObject) {
        MessageObject messageObject2;
        if (this.animatedValues != null && (messageObject2 = this.messageObject) != null && messageObject != null && messageObject2.getId() != messageObject.getId()) {
            this.animatedValues.clear();
        }
        this.messageObject = messageObject;
    }

    public void setAlpha(float f) {
        this.alpha = f;
    }

    public void setParentView(View view) {
        this.parentView = view;
        this.loadingFloat.setParent(view);
        this.appearFloat.setParent(view);
    }

    public boolean isStartDraging() {
        return this.startDraging;
    }

    public boolean onTouch(int i, float f, float f2) {
        SeekBar.SeekBarDelegate seekBarDelegate;
        if (i == 0) {
            if (0.0f <= f && f <= this.width && f2 >= 0.0f && f2 <= this.height) {
                this.startX = f;
                this.pressed = true;
                this.thumbDX = (int) (f - this.thumbX);
                this.startDraging = false;
                this.delegate.onSeekBarPressed();
                return true;
            }
        } else if (i == 1 || i == 3) {
            if (this.pressed) {
                if (i == 1 && (seekBarDelegate = this.delegate) != null) {
                    seekBarDelegate.onSeekBarDrag(this.thumbX / this.width);
                }
                this.pressed = false;
                this.delegate.onSeekBarReleased();
                return true;
            }
        } else if (i == 2 && this.pressed) {
            if (this.startDraging) {
                int i2 = (int) (f - this.thumbDX);
                this.thumbX = i2;
                if (i2 < 0) {
                    this.thumbX = 0;
                } else {
                    int i3 = this.width;
                    if (i2 > i3) {
                        this.thumbX = i3;
                    }
                }
                this.progress = this.thumbX / this.width;
            }
            float f3 = this.startX;
            if (f3 != -1.0f && Math.abs(f - f3) > AndroidUtilities.getPixelsInCM(0.2f, true)) {
                View view = this.parentView;
                if (view != null && view.getParent() != null) {
                    this.parentView.getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.startDraging = true;
                this.startX = -1.0f;
            }
            return true;
        }
        return false;
    }

    public float getProgress() {
        return this.thumbX / this.width;
    }

    public void setProgress(float f) {
        setProgress(f, false);
    }

    public void setProgress(float f, boolean z) {
        boolean z2 = this.isUnread;
        this.progress = z2 ? 1.0f : f;
        int i = z2 ? this.width : this.thumbX;
        if (z && i != 0 && f == 0.0f) {
            this.clearProgress = 0.0f;
        } else if (!z) {
            this.clearProgress = 1.0f;
        }
        int ceil = (int) Math.ceil(this.width * f);
        this.thumbX = ceil;
        if (ceil < 0) {
            this.thumbX = 0;
            return;
        }
        int i2 = this.width;
        if (ceil > i2) {
            this.thumbX = i2;
        }
    }

    public boolean isDragging() {
        return this.pressed;
    }

    public void setSize(int i, int i2) {
        setSize(i, i2, i, i);
    }

    public void setSize(int i, int i2, int i3, int i4) {
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

    public void setSent() {
        this.appearFloat.set(0.0f, true);
        View view = this.parentView;
        if (view != null) {
            view.invalidate();
        }
    }

    private float[] calculateHeights(int i) {
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
        while (i3 < length) {
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
                byte min = (byte) ((this.waveformBytes[i9] >> i10) & ((2 << (Math.min(i2, i11) - 1)) - 1));
                if (i12 > 0) {
                    int i13 = i9 + 1;
                    byte[] bArr2 = this.waveformBytes;
                    if (i13 < bArr2.length) {
                        min = (byte) (((byte) (min << i12)) | (bArr2[i13] & ((2 << (i12 - 1)) - 1)));
                    }
                }
                int i14 = 0;
                while (i14 < i7) {
                    if (i5 >= i) {
                        return fArr;
                    }
                    fArr[i5] = Math.max(0.0f, (min * 7) / 31.0f);
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

    public void draw(Canvas canvas, View view) {
        int i;
        float f;
        float[] fArr;
        if (this.waveformBytes == null || (i = this.width) == 0 || this.alpha <= 0.0f) {
            return;
        }
        float dpf2 = i / AndroidUtilities.dpf2(3.0f);
        if (dpf2 <= 0.1f) {
            return;
        }
        float f2 = this.clearProgress;
        if (f2 != 1.0f) {
            float f3 = f2 + 0.10666667f;
            this.clearProgress = f3;
            if (f3 > 1.0f) {
                this.clearProgress = 1.0f;
            } else {
                view.invalidate();
            }
        }
        float f4 = this.appearFloat.set(1.0f);
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
        float[] fArr2 = this.fromHeights;
        int i2 = 0;
        if (fArr2 != null && (fArr = this.toHeights) != null) {
            int i3 = this.width;
            int i4 = this.fromWidth;
            float f5 = (i3 - i4) / (this.toWidth - i4);
            int max = Math.max(fArr2.length, fArr.length);
            int min = Math.min(this.fromHeights.length, this.toHeights.length);
            float[] fArr3 = this.fromHeights;
            int length = fArr3.length;
            float[] fArr4 = this.toHeights;
            float[] fArr5 = length < fArr4.length ? fArr3 : fArr4;
            float[] fArr6 = fArr3.length < fArr4.length ? fArr4 : fArr3;
            if (fArr3.length >= fArr4.length) {
                f5 = 1.0f - f5;
            }
            int i5 = -1;
            f = 0.0f;
            for (int i6 = 0; i6 < max; i6++) {
                float f6 = i6;
                int clamp = MathUtils.clamp((int) Math.floor((f6 / max) * min), 0, min - 1);
                if (i5 < clamp) {
                    addBar(this.path, AndroidUtilities.lerp(clamp, f6, f5) * AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(AndroidUtilities.lerp(fArr5[clamp], fArr6[i6], f5)));
                    i5 = clamp;
                } else {
                    addBar(this.alphaPath, AndroidUtilities.lerp(clamp, f6, f5) * AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(AndroidUtilities.lerp(fArr5[clamp], fArr6[i6], f5)));
                    f = f5;
                }
            }
        } else {
            if (this.heights != null) {
                while (true) {
                    float f7 = i2;
                    if (f7 >= dpf2 || i2 >= this.heights.length) {
                        break;
                    }
                    float dpf22 = AndroidUtilities.dpf2(3.0f) * f7;
                    float clamp2 = MathUtils.clamp((f4 * dpf2) - f7, 0.0f, 1.0f);
                    addBar(this.path, dpf22, (AndroidUtilities.dpf2(this.heights[i2]) * clamp2) - (AndroidUtilities.dpf2(1.0f) * (1.0f - clamp2)));
                    i2++;
                }
            }
            f = 0.0f;
        }
        if (f > 0.0f) {
            canvas.save();
            canvas.clipPath(this.alphaPath);
            drawFill(canvas, f * this.alpha);
            canvas.restore();
        }
        canvas.save();
        canvas.clipPath(this.path);
        drawFill(canvas, this.alpha);
        canvas.restore();
    }

    private void drawFill(Canvas canvas, float f) {
        Paint paint;
        Paint paint2;
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        MessageObject messageObject = this.messageObject;
        boolean z = messageObject != null && messageObject.isContentUnread() && !this.messageObject.isOut() && this.progress <= 0.0f;
        this.isUnread = z;
        paintInner.setColor(z ? this.outerColor : this.selected ? this.selectedColor : this.innerColor);
        paintOuter.setColor(this.outerColor);
        this.loadingFloat.setParent(this.parentView);
        float f2 = this.loadingFloat.set((!this.loading || MediaController.getInstance().isPlayingMessage(this.messageObject)) ? 0.0f : 1.0f);
        Paint paint3 = paintInner;
        paint3.setColor(ColorUtils.blendARGB(paint3.getColor(), this.innerColor, f2));
        float f3 = 1.0f - f2;
        paintOuter.setAlpha((int) (paint.getAlpha() * f3 * f));
        paintInner.setAlpha((int) (paint2.getAlpha() * f));
        canvas.drawRect(0.0f, 0.0f, this.width + dpf2, this.height, paintInner);
        if (f2 < 1.0f) {
            canvas.drawRect(0.0f, 0.0f, this.progress * (this.width + dpf2) * f3, this.height, paintOuter);
        }
        if (f2 > 0.0f) {
            if (this.loadingPaint == null || Math.abs(this.loadingPaintWidth - this.width) > AndroidUtilities.dp(8.0f) || this.loadingPaintColor1 != this.innerColor || this.loadingPaintColor2 != this.outerColor) {
                if (this.loadingPaint == null) {
                    this.loadingPaint = new Paint(1);
                }
                this.loadingPaintColor1 = this.innerColor;
                this.loadingPaintColor2 = this.outerColor;
                Paint paint4 = this.loadingPaint;
                float f4 = this.width;
                this.loadingPaintWidth = f4;
                int i = this.loadingPaintColor1;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, f4, 0.0f, new int[]{i, this.loadingPaintColor2, i}, new float[]{0.0f, 0.2f, 0.4f}, Shader.TileMode.CLAMP));
            }
            this.loadingPaint.setAlpha((int) (f2 * 255.0f * f));
            canvas.save();
            float pow = ((((float) Math.pow(((float) (SystemClock.elapsedRealtime() - this.loadingStart)) / 270.0f, 0.75d)) % 1.6f) - 0.6f) * this.loadingPaintWidth;
            canvas.translate(pow, 0.0f);
            canvas.drawRect(-pow, 0.0f, (this.width + 5) - pow, this.height, this.loadingPaint);
            canvas.restore();
            View view = this.parentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    private void addBar(Path path, float f, float f2) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        int dp = (this.height - AndroidUtilities.dp(14.0f)) / 2;
        float f3 = f2 * this.waveScaling;
        RectF rectF = AndroidUtilities.rectTmp;
        float f4 = dpf2 / 2.0f;
        rectF.set((AndroidUtilities.dpf2(1.0f) + f) - f4, AndroidUtilities.dp(7.0f) + dp + ((-f3) - f4), f + AndroidUtilities.dpf2(1.0f) + f4, dp + AndroidUtilities.dp(7.0f) + f3 + f4);
        path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
    }

    public void setWaveScaling(float f) {
        this.waveScaling = f;
    }

    public void setLoading(boolean z) {
        if (!this.loading && z && this.loadingFloat.get() <= 0.0f) {
            this.loadingStart = SystemClock.elapsedRealtime();
        }
        this.loading = z;
        View view = this.parentView;
        if (view != null) {
            view.invalidate();
        }
    }
}
