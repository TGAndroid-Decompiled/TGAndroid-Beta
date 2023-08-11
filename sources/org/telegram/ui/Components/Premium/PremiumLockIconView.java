package org.telegram.ui.Components.Premium;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
public class PremiumLockIconView extends ImageView {
    public static int TYPE_REACTIONS = 0;
    public static int TYPE_STICKERS_PREMIUM_LOCKED = 1;
    boolean attachedToWindow;
    CellFlickerDrawable cellFlickerDrawable;
    int color1;
    int color2;
    private float[] colorFloat;
    boolean colorRetrieved;
    int currentColor;
    ImageReceiver imageReceiver;
    private boolean locked;
    Paint oldShaderPaint;
    Paint paint;
    Path path;
    private Theme.ResourcesProvider resourcesProvider;
    Shader shader;
    float shaderCrossfadeProgress;
    StarParticlesView.Drawable starParticles;
    private final int type;
    boolean waitingImage;
    boolean wasDrawn;

    public PremiumLockIconView(Context context, int i) {
        this(context, i, null);
    }

    public PremiumLockIconView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.colorFloat = new float[3];
        this.colorRetrieved = false;
        this.currentColor = -1;
        this.shader = null;
        this.path = new Path();
        this.paint = new Paint(1);
        this.shaderCrossfadeProgress = 1.0f;
        this.type = i;
        this.resourcesProvider = resourcesProvider;
        setImageResource(i == TYPE_REACTIONS ? R.drawable.msg_premium_lock2 : R.drawable.msg_mini_premiumlock);
        if (i == TYPE_REACTIONS) {
            StarParticlesView.Drawable drawable = new StarParticlesView.Drawable(5);
            this.starParticles = drawable;
            drawable.updateColors();
            StarParticlesView.Drawable drawable2 = this.starParticles;
            drawable2.roundEffect = false;
            drawable2.size2 = 4;
            drawable2.size3 = 4;
            drawable2.size1 = 2;
            drawable2.speedScale = 0.1f;
            drawable2.init();
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.type == TYPE_REACTIONS) {
            this.path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, Path.Direction.CW);
            rectF.set((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(2.5f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dpf2(5.7f), getMeasuredWidth() - AndroidUtilities.dpf2(0.2f), getMeasuredHeight());
            this.path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Path.Direction.CW);
            this.path.close();
            this.starParticles.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.starParticles.rect.inset(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
            return;
        }
        updateGradient();
    }

    public void setColor(int i) {
        this.colorRetrieved = true;
        if (this.currentColor != i) {
            this.currentColor = i;
            if (this.type == TYPE_REACTIONS) {
                this.paint.setColor(i);
            } else {
                updateGradient();
            }
            invalidate();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.waitingImage) {
            ImageReceiver imageReceiver = this.imageReceiver;
            if (imageReceiver != null && imageReceiver.getBitmap() != null) {
                this.waitingImage = false;
                setColor(AndroidUtilities.getDominantColor(this.imageReceiver.getBitmap()));
            } else {
                invalidate();
            }
        }
        if (this.type == TYPE_REACTIONS) {
            if (this.currentColor != 0) {
                canvas.drawPath(this.path, this.paint);
            } else {
                PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, getMeasuredWidth(), getMeasuredHeight(), -AndroidUtilities.dp(24.0f), 0.0f);
                canvas.drawPath(this.path, PremiumGradient.getInstance().getMainGradientPaint());
            }
            if (this.cellFlickerDrawable == null) {
                this.cellFlickerDrawable = new CellFlickerDrawable();
            }
            this.cellFlickerDrawable.setParentWidth(getMeasuredWidth() / 2);
            CellFlickerDrawable cellFlickerDrawable = this.cellFlickerDrawable;
            cellFlickerDrawable.drawFrame = false;
            cellFlickerDrawable.draw(canvas, this.path, this);
            canvas.save();
            canvas.clipPath(this.path);
            this.starParticles.onDraw(canvas);
            canvas.restore();
            invalidate();
        } else {
            float measuredWidth = getMeasuredWidth() / 2.0f;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            if (this.oldShaderPaint == null) {
                this.shaderCrossfadeProgress = 1.0f;
            }
            float f = this.shaderCrossfadeProgress;
            if (f != 1.0f) {
                this.paint.setAlpha((int) (f * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth, this.oldShaderPaint);
                canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth, this.paint);
                float f2 = this.shaderCrossfadeProgress + 0.10666667f;
                this.shaderCrossfadeProgress = f2;
                if (f2 > 1.0f) {
                    this.shaderCrossfadeProgress = 1.0f;
                    this.oldShaderPaint = null;
                }
                invalidate();
                this.paint.setAlpha(255);
            } else {
                canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth, this.paint);
            }
        }
        super.onDraw(canvas);
        this.wasDrawn = true;
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        this.imageReceiver = imageReceiver;
        if (imageReceiver != null) {
            this.waitingImage = true;
            invalidate();
        }
    }

    public ImageReceiver getImageReceiver() {
        return this.imageReceiver;
    }

    private void updateGradient() {
        if (!this.attachedToWindow || getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            return;
        }
        Color.colorToHSV(this.currentColor, this.colorFloat);
        float[] fArr = this.colorFloat;
        fArr[1] = fArr[1] * (this.locked ? 2.0f : 1.0f);
        if (fArr[2] > 0.7f) {
            fArr[2] = 0.7f;
        }
        int HSVToColor = Color.HSVToColor(fArr);
        int i = Theme.key_windowBackgroundWhite;
        int blendARGB = ColorUtils.blendARGB(HSVToColor, Theme.getColor(i, this.resourcesProvider), 0.5f);
        int blendARGB2 = ColorUtils.blendARGB(HSVToColor, Theme.getColor(i, this.resourcesProvider), 0.4f);
        if (this.shader != null && this.color1 == blendARGB2 && this.color2 == blendARGB) {
            return;
        }
        if (this.wasDrawn) {
            Paint paint = this.paint;
            this.oldShaderPaint = paint;
            paint.setAlpha(255);
            this.shaderCrossfadeProgress = 0.0f;
        }
        this.paint = new Paint(1);
        this.color1 = blendARGB2;
        this.color2 = blendARGB;
        LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), 0.0f, 0.0f, new int[]{blendARGB2, blendARGB}, (float[]) null, Shader.TileMode.CLAMP);
        this.shader = linearGradient;
        this.paint.setShader(linearGradient);
        invalidate();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        if (this.type != TYPE_REACTIONS) {
            updateGradient();
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        Paint paint = this.paint;
        if (paint != null) {
            paint.setShader(null);
            this.paint = null;
        }
        this.shader = null;
        this.wasDrawn = false;
    }

    public void setWaitingImage() {
        this.waitingImage = true;
        this.wasDrawn = false;
        invalidate();
    }

    public boolean ready() {
        return this.colorRetrieved;
    }

    public void play(int i) {
        CellFlickerDrawable cellFlickerDrawable = this.cellFlickerDrawable;
        if (cellFlickerDrawable != null) {
            cellFlickerDrawable.progress = 0.0f;
            cellFlickerDrawable.repeatEnabled = false;
        }
        invalidate();
        animate().scaleX(1.1f).scaleY(1.1f).setStartDelay(i).setInterpolator(AndroidUtilities.overshootInterpolator).setDuration(300L);
    }

    public void resetAnimation() {
        setScaleX(0.0f);
        setScaleY(0.0f);
    }

    public void setLocked(boolean z) {
        if (this.type != TYPE_REACTIONS) {
            setImageResource(z ? R.drawable.msg_mini_premiumlock : R.drawable.msg_mini_stickerstar);
        }
    }
}
