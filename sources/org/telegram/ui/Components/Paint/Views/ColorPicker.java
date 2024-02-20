package org.telegram.ui.Components.Paint.Views;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Keep;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Paint.Swatch;
public class ColorPicker extends FrameLayout {
    private static final int[] COLORS = {-1431751, -2409774, -13610525, -11942419, -8337308, -205211, -223667, -16777216, -1};
    private static final float[] LOCATIONS = {0.0f, 0.14f, 0.24f, 0.39f, 0.49f, 0.62f, 0.73f, 0.85f, 1.0f};
    private Paint backgroundPaint;
    private boolean changingWeight;
    private ColorPickerDelegate delegate;
    private boolean dragging;
    private float draggingFactor;
    private Paint gradientPaint;
    private boolean interacting;
    private OvershootInterpolator interpolator;
    private float location;
    private RectF rectF;
    public ImageView settingsButton;
    private Drawable shadowDrawable;
    private Paint swatchPaint;
    private Paint swatchStrokePaint;
    private ImageView undoButton;
    private boolean wasChangingWeight;
    private float weight;

    public interface ColorPickerDelegate {
        void onBeganColorPicking();

        void onColorValueChanged();

        void onFinishedColorPicking();
    }

    public void setUndoEnabled(boolean z) {
        this.undoButton.setAlpha(z ? 1.0f : 0.3f);
        this.undoButton.setEnabled(z);
    }

    public void setDelegate(ColorPickerDelegate colorPickerDelegate) {
        this.delegate = colorPickerDelegate;
    }

    public View getSettingsButton() {
        return this.settingsButton;
    }

    public void setSettingsButtonImage(int i) {
        this.settingsButton.setImageResource(i);
    }

    public Swatch getSwatch() {
        return new Swatch(colorForLocation(this.location), this.location, this.weight);
    }

    public void setSwatch(Swatch swatch) {
        setLocation(swatch.colorLocation);
        setWeight(swatch.brushWeight);
    }

    public int colorForLocation(float f) {
        float[] fArr;
        int i;
        if (f <= 0.0f) {
            return COLORS[0];
        }
        int i2 = 1;
        if (f >= 1.0f) {
            int[] iArr = COLORS;
            return iArr[iArr.length - 1];
        }
        while (true) {
            fArr = LOCATIONS;
            i = -1;
            if (i2 >= fArr.length) {
                i2 = -1;
                break;
            } else if (fArr[i2] >= f) {
                i = i2 - 1;
                break;
            } else {
                i2++;
            }
        }
        float f2 = fArr[i];
        int[] iArr2 = COLORS;
        return interpolateColors(iArr2[i], iArr2[i2], (f - f2) / (fArr[i2] - f2));
    }

    private int interpolateColors(int i, int i2, float f) {
        float min = Math.min(Math.max(f, 0.0f), 1.0f);
        int red = Color.red(i);
        int red2 = Color.red(i2);
        int green = Color.green(i);
        int green2 = Color.green(i2);
        int blue = Color.blue(i);
        return Color.argb(255, Math.min(255, (int) (red + ((red2 - red) * min))), Math.min(255, (int) (green + ((green2 - green) * min))), Math.min(255, (int) (blue + ((Color.blue(i2) - blue) * min))));
    }

    public void setLocation(float f) {
        this.location = f;
        int colorForLocation = colorForLocation(f);
        this.swatchPaint.setColor(colorForLocation);
        float[] fArr = new float[3];
        Color.colorToHSV(colorForLocation, fArr);
        if (fArr[0] < 0.001d && fArr[1] < 0.001d && fArr[2] > 0.92f) {
            int i = (int) ((1.0f - (((fArr[2] - 0.92f) / 0.08f) * 0.22f)) * 255.0f);
            this.swatchStrokePaint.setColor(Color.rgb(i, i, i));
        } else {
            this.swatchStrokePaint.setColor(colorForLocation);
        }
        invalidate();
    }

    public void setWeight(float f) {
        this.weight = f;
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ColorPickerDelegate colorPickerDelegate;
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        float x = motionEvent.getX() - this.rectF.left;
        float y = motionEvent.getY() - this.rectF.top;
        if (this.interacting || y >= (-AndroidUtilities.dp(10.0f))) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 3 || actionMasked == 1 || actionMasked == 6) {
                if (this.interacting && (colorPickerDelegate = this.delegate) != null) {
                    colorPickerDelegate.onFinishedColorPicking();
                    SharedPreferences.Editor edit = getContext().getSharedPreferences("paint", 0).edit();
                    edit.putFloat("last_color_location", this.location);
                    edit.putFloat("last_color_weight", this.weight);
                    edit.commit();
                }
                this.interacting = false;
                this.wasChangingWeight = this.changingWeight;
                this.changingWeight = false;
                setDragging(false, true);
            } else if (actionMasked == 0 || actionMasked == 2) {
                if (!this.interacting) {
                    this.interacting = true;
                    ColorPickerDelegate colorPickerDelegate2 = this.delegate;
                    if (colorPickerDelegate2 != null) {
                        colorPickerDelegate2.onBeganColorPicking();
                    }
                }
                setLocation(Math.max(0.0f, Math.min(1.0f, x / this.rectF.width())));
                setDragging(true, true);
                if (y < (-AndroidUtilities.dp(10.0f))) {
                    this.changingWeight = true;
                    setWeight(Math.max(0.0f, Math.min(1.0f, ((-y) - AndroidUtilities.dp(10.0f)) / AndroidUtilities.dp(190.0f))));
                }
                ColorPickerDelegate colorPickerDelegate3 = this.delegate;
                if (colorPickerDelegate3 != null) {
                    colorPickerDelegate3.onColorValueChanged();
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    @SuppressLint({"DrawAllocation"})
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.gradientPaint.setShader(new LinearGradient(AndroidUtilities.dp(56.0f), 0.0f, i5 - AndroidUtilities.dp(56.0f), 0.0f, COLORS, LOCATIONS, Shader.TileMode.REPEAT));
        int dp = i6 - AndroidUtilities.dp(32.0f);
        this.rectF.set(AndroidUtilities.dp(56.0f), dp, i5 - AndroidUtilities.dp(56.0f), dp + AndroidUtilities.dp(12.0f));
        ImageView imageView = this.settingsButton;
        imageView.layout(i5 - imageView.getMeasuredWidth(), i6 - AndroidUtilities.dp(52.0f), i5, i6);
        this.undoButton.layout(0, i6 - AndroidUtilities.dp(52.0f), this.settingsButton.getMeasuredWidth(), i6);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.gradientPaint);
        RectF rectF = this.rectF;
        int width = (int) (rectF.left + (rectF.width() * this.location));
        int centerY = (int) ((this.rectF.centerY() + (this.draggingFactor * (-AndroidUtilities.dp(70.0f)))) - (this.changingWeight ? this.weight * AndroidUtilities.dp(190.0f) : 0.0f));
        int dp = (int) (AndroidUtilities.dp(24.0f) * (this.draggingFactor + 1.0f) * 0.5f);
        this.shadowDrawable.setBounds(width - dp, centerY - dp, width + dp, dp + centerY);
        this.shadowDrawable.draw(canvas);
        float floor = (((int) Math.floor(AndroidUtilities.dp(4.0f) + ((AndroidUtilities.dp(19.0f) - AndroidUtilities.dp(4.0f)) * this.weight))) * (this.draggingFactor + 1.0f)) / 2.0f;
        float f = width;
        float f2 = centerY;
        canvas.drawCircle(f, f2, (AndroidUtilities.dp(22.0f) / 2) * (this.draggingFactor + 1.0f), this.backgroundPaint);
        canvas.drawCircle(f, f2, floor, this.swatchPaint);
        canvas.drawCircle(f, f2, floor - AndroidUtilities.dp(0.5f), this.swatchStrokePaint);
    }

    @Keep
    private void setDraggingFactor(float f) {
        this.draggingFactor = f;
        invalidate();
    }

    @Keep
    public float getDraggingFactor() {
        return this.draggingFactor;
    }

    private void setDragging(boolean z, boolean z2) {
        if (this.dragging == z) {
            return;
        }
        this.dragging = z;
        float f = z ? 1.0f : 0.0f;
        if (z2) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "draggingFactor", this.draggingFactor, f);
            ofFloat.setInterpolator(this.interpolator);
            ofFloat.setDuration(this.wasChangingWeight ? (int) (300 + (this.weight * 75.0f)) : 300);
            ofFloat.start();
            return;
        }
        setDraggingFactor(f);
    }
}
