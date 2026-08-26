package org.telegram.ui.Components.Premium;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.SparseArray;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.PhotoViewer;

public class PremiumLockIconView extends ImageView {
    public static final int $r8$clinit = 0;
    public boolean attachedToWindow;
    public Integer blendColor;
    public CellFlickerDrawable cellFlickerDrawable;
    public int color1;
    public int color2;
    public final float[] colorFloat;
    public boolean colorRetrieved;
    public int currentColor;
    public AnimatedEmojiDrawable emojiDrawable;
    public final float iconScale;
    public ImageReceiver imageReceiver;
    public Paint oldShaderPaint;
    public Paint paint;
    public final Path path;
    public final Theme.ResourcesProvider resourcesProvider;
    public LinearGradient shader;
    public float shaderCrossfadeProgress;
    public final StarParticlesView.Drawable starParticles;
    public final int type;
    public boolean waitingImage;
    public boolean wasDrawn;

    public PremiumLockIconView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.colorFloat = new float[3];
        this.iconScale = 1.0f;
        this.colorRetrieved = false;
        this.currentColor = -1;
        this.shader = null;
        this.path = new Path();
        this.paint = new Paint(1);
        this.shaderCrossfadeProgress = 1.0f;
        this.type = i;
        this.resourcesProvider = resourcesProvider;
        setImageResource(i == 0 ? R.drawable.msg_premium_lock2 : R.drawable.msg_mini_premiumlock);
        if (i == 0) {
            StarParticlesView.Drawable drawable = new StarParticlesView.Drawable(5);
            this.starParticles = drawable;
            int color = Theme.getColor(drawable.colorKey, drawable.resourcesProvider);
            if (drawable.lastColor != color) {
                drawable.lastColor = color;
                drawable.generateBitmaps();
            }
            drawable.roundEffect = false;
            drawable.size2 = 4;
            drawable.size3 = 4;
            drawable.size1 = 2;
            drawable.speedScale = 0.1f;
            drawable.init();
            return;
        }
        if (i == 2) {
            this.iconScale = 0.8f;
            this.paint.setColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        } else if (i == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_archive_hide);
        } else if (i == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_limit_pin);
        }
    }

    public ImageReceiver getImageReceiver() {
        return this.imageReceiver;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        if (this.type != 0) {
            updateGradient();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        Paint paint = this.paint;
        if (paint != null && this.type != 2) {
            paint.setShader(null);
            this.paint = null;
        }
        this.shader = null;
        this.wasDrawn = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int iIntValue;
        PhotoViewer.AnonymousClass11 anonymousClass11;
        if (this.waitingImage) {
            ImageReceiver imageReceiver = this.imageReceiver;
            if (imageReceiver == null || imageReceiver.getBitmap() == null) {
                AnimatedEmojiDrawable animatedEmojiDrawable = this.emojiDrawable;
                if (animatedEmojiDrawable != null) {
                    SparseArray sparseArray = AnimatedEmojiDrawable.globalEmojiCache;
                    long documentId = animatedEmojiDrawable.getDocumentId();
                    if (documentId != 0) {
                        if (AnimatedEmojiDrawable.dominantColors == null) {
                            AnimatedEmojiDrawable.dominantColors = new HashMap();
                        }
                        Integer num = (Integer) AnimatedEmojiDrawable.dominantColors.get(Long.valueOf(documentId));
                        if (num == null && (anonymousClass11 = animatedEmojiDrawable.imageReceiver) != null && anonymousClass11.getBitmap() != null) {
                            HashMap map = AnimatedEmojiDrawable.dominantColors;
                            Long lValueOf = Long.valueOf(documentId);
                            Integer numValueOf = Integer.valueOf(AndroidUtilities.getDominantColor(animatedEmojiDrawable.imageReceiver.getBitmap()));
                            map.put(lValueOf, numValueOf);
                            num = numValueOf;
                        }
                        if (num == null) {
                            iIntValue = 0;
                        } else {
                            iIntValue = num.intValue();
                        }
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue != 0) {
                        this.waitingImage = false;
                        setColor(iIntValue);
                    } else {
                        invalidate();
                    }
                } else {
                    invalidate();
                }
            } else {
                this.waitingImage = false;
                setColor(AndroidUtilities.getDominantColor(this.imageReceiver.getBitmap()));
            }
        }
        Paint paint = this.paint;
        if (paint != null) {
            int i = this.type;
            if (i == 2) {
                float measuredWidth = getMeasuredWidth() / 2.0f;
                canvas.drawCircle(measuredWidth, getMeasuredHeight() / 2.0f, measuredWidth, this.paint);
            } else if (i == 0) {
                int i2 = this.currentColor;
                Path path = this.path;
                if (i2 != 0) {
                    canvas.drawPath(path, paint);
                } else {
                    PremiumGradient.getInstance().mainGradient.gradientMatrix(0, -AndroidUtilities.dp(24.0f), 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                    canvas.drawPath(path, PremiumGradient.getInstance().getMainGradientPaint());
                }
                if (this.cellFlickerDrawable == null) {
                    this.cellFlickerDrawable = new CellFlickerDrawable(64, 204, 160);
                }
                this.cellFlickerDrawable.parentWidth = getMeasuredWidth() / 2;
                CellFlickerDrawable cellFlickerDrawable = this.cellFlickerDrawable;
                cellFlickerDrawable.drawFrame = false;
                cellFlickerDrawable.update(this);
                canvas.drawPath(path, cellFlickerDrawable.paint);
                if (cellFlickerDrawable.drawFrame) {
                    canvas.drawPath(path, cellFlickerDrawable.paintOutline);
                }
                canvas.save();
                canvas.clipPath(path);
                this.starParticles.onDraw(canvas, 1.0f);
                canvas.restore();
                invalidate();
            } else {
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                if (this.oldShaderPaint == null) {
                    this.shaderCrossfadeProgress = 1.0f;
                }
                float f = this.shaderCrossfadeProgress;
                if (f != 1.0f) {
                    this.paint.setAlpha((int) (f * 255.0f));
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.oldShaderPaint);
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.paint);
                    float f2 = this.shaderCrossfadeProgress + 0.10666667f;
                    this.shaderCrossfadeProgress = f2;
                    if (f2 > 1.0f) {
                        this.shaderCrossfadeProgress = 1.0f;
                        this.oldShaderPaint = null;
                    }
                    invalidate();
                    this.paint.setAlpha(255);
                } else {
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.paint);
                }
            }
        }
        float f3 = this.iconScale;
        boolean z = f3 != 1.0f;
        if (z) {
            canvas.save();
            canvas.scale(f3, f3, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        super.onDraw(canvas);
        if (z) {
            canvas.restore();
        }
        this.wasDrawn = true;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.type != 0) {
            updateGradient();
            return;
        }
        Path path = this.path;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float fWidth = rectF.width() / 2.0f;
        float fCenterY = rectF.centerY();
        float fWidth2 = rectF.width() / 2.0f;
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(fWidth, fCenterY, fWidth2, direction);
        rectF.set((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(2.5f), AndroidUtilities.dpf2(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dpf2(0.2f), getMeasuredHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), direction);
        path.close();
        StarParticlesView.Drawable drawable = this.starParticles;
        drawable.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        drawable.rect.inset(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
    }

    public void setAnimatedEmojiDrawable(AnimatedEmojiDrawable animatedEmojiDrawable) {
        this.emojiDrawable = animatedEmojiDrawable;
        if (animatedEmojiDrawable != null) {
            this.waitingImage = true;
            invalidate();
        }
    }

    public void setBlendWithColor(Integer num) {
        this.blendColor = num;
    }

    public void setColor(int i) {
        this.colorRetrieved = true;
        Integer num = this.blendColor;
        if (num != null) {
            i = Theme.blendOver(i, num.intValue());
        }
        if (this.currentColor != i) {
            this.currentColor = i;
            int i2 = this.type;
            if (i2 == 0 || i2 == 2) {
                Paint paint = this.paint;
                if (paint != null) {
                    paint.setColor(i);
                }
            } else {
                updateGradient();
            }
            invalidate();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        this.imageReceiver = imageReceiver;
        if (imageReceiver != null) {
            this.waitingImage = true;
            invalidate();
        }
    }

    public void setLocked(boolean z) {
        if (this.type != 0) {
            setImageResource(z ? R.drawable.msg_mini_premiumlock : R.drawable.msg_mini_stickerstar);
        }
    }

    public final void updateGradient() {
        if (!this.attachedToWindow || getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            return;
        }
        int i = this.currentColor;
        float[] fArr = this.colorFloat;
        Color.colorToHSV(i, fArr);
        fArr[1] = fArr[1] * 1.0f;
        if (fArr[2] > 0.7f) {
            fArr[2] = 0.7f;
        }
        int iHSVToColor = Color.HSVToColor(fArr);
        int i2 = Theme.key_windowBackgroundWhite;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int iBlendARGB = ColorUtils.blendARGB(0.5f, iHSVToColor, Theme.getColor(i2, resourcesProvider));
        int iBlendARGB2 = ColorUtils.blendARGB(0.4f, iHSVToColor, Theme.getColor(i2, resourcesProvider));
        if (this.shader != null && this.color1 == iBlendARGB2 && this.color2 == iBlendARGB) {
            return;
        }
        if (this.wasDrawn) {
            Paint paint = this.paint;
            this.oldShaderPaint = paint;
            paint.setAlpha(255);
            this.shaderCrossfadeProgress = 0.0f;
        }
        this.paint = new Paint(1);
        float measuredHeight = getMeasuredHeight();
        this.color1 = iBlendARGB2;
        this.color2 = iBlendARGB;
        LinearGradient linearGradient = new LinearGradient(0.0f, measuredHeight, 0.0f, 0.0f, new int[]{iBlendARGB2, iBlendARGB}, (float[]) null, Shader.TileMode.CLAMP);
        this.shader = linearGradient;
        this.paint.setShader(linearGradient);
        invalidate();
    }
}
