package org.telegram.ui.Components.Premium;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$TL_help_premiumPromo;
import org.telegram.tgnet.TLRPC$TL_photoStrippedSize;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.PremiumPreviewFragment;

public class VideoScreenPreview extends View implements PagerHeaderView {
    private static final float[] speedScaleVideoTimestamps = {0.02f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.02f};
    boolean allowPlay;
    boolean attached;
    CellFlickerDrawable.DrawableInterface cellFlickerDrawable;
    int currentAccount;
    boolean fromTop;
    private MatrixParticlesDrawable matrixParticlesDrawable;
    boolean play;
    float progress;
    private float roundRadius;
    RoundedBitmapDrawable roundedBitmapDrawable;
    int size;
    SpeedLineParticles$Drawable speedLinesDrawable;
    StarParticlesView.Drawable starDrawable;
    private final SvgHelper.SvgDrawable svgIcon;
    int type;
    boolean visible;
    Paint phoneFrame1 = new Paint(1);
    Paint phoneFrame2 = new Paint(1);
    ImageReceiver imageReceiver = new ImageReceiver(this);

    public VideoScreenPreview(Context context, SvgHelper.SvgDrawable svgDrawable, int i, int i2) {
        super(context);
        this.fromTop = false;
        new Path();
        this.currentAccount = i;
        this.type = i2;
        this.svgIcon = svgDrawable;
        this.phoneFrame1.setColor(-16777216);
        this.phoneFrame2.setColor(ColorUtils.blendARGB(Theme.getColor("premiumGradient2"), -16777216, 0.5f));
        this.imageReceiver.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        setVideo();
        if (i2 == 1) {
            MatrixParticlesDrawable matrixParticlesDrawable = new MatrixParticlesDrawable();
            this.matrixParticlesDrawable = matrixParticlesDrawable;
            matrixParticlesDrawable.init();
        } else if (i2 == 6) {
            StarParticlesView.Drawable drawable = new StarParticlesView.Drawable(30);
            this.starDrawable = drawable;
            drawable.speedScale = 3.0f;
            drawable.useProfileBadge = true;
            drawable.init();
        } else if (i2 == 2) {
            SpeedLineParticles$Drawable speedLineParticles$Drawable = new SpeedLineParticles$Drawable(200);
            this.speedLinesDrawable = speedLineParticles$Drawable;
            speedLineParticles$Drawable.init();
        } else {
            int i3 = 100;
            if (SharedConfig.getDevicePerformanceClass() == 2) {
                i3 = 800;
            } else if (SharedConfig.getDevicePerformanceClass() == 1) {
                i3 = 400;
            }
            StarParticlesView.Drawable drawable2 = new StarParticlesView.Drawable(i3);
            this.starDrawable = drawable2;
            drawable2.size1 = 8;
            drawable2.size1 = 6;
            drawable2.size1 = 4;
            drawable2.k3 = 0.98f;
            drawable2.k2 = 0.98f;
            drawable2.k1 = 0.98f;
            drawable2.useRotate = true;
            setLayerType(2, null);
            StarParticlesView.Drawable drawable3 = this.starDrawable;
            drawable3.speedScale = 4.0f;
            drawable3.checkBounds = true;
            drawable3.checkTime = true;
            drawable3.useBlur = true;
            drawable3.roundEffect = false;
            drawable3.init();
        }
        if (i2 == 1 || i2 == 3) {
            this.fromTop = true;
        }
    }

    private void setVideo() {
        TLRPC$TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(this.currentAccount).getPremiumPromo();
        String featureTypeToServerString = PremiumPreviewFragment.featureTypeToServerString(this.type);
        if (premiumPromo != null) {
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= premiumPromo.video_sections.size()) {
                    break;
                } else if (premiumPromo.video_sections.get(i2).equals(featureTypeToServerString)) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            if (i >= 0) {
                TLRPC$Document tLRPC$Document = premiumPromo.videos.get(i);
                CombinedDrawable combinedDrawable = null;
                for (int i3 = 0; i3 < tLRPC$Document.thumbs.size(); i3++) {
                    if (tLRPC$Document.thumbs.get(i3) instanceof TLRPC$TL_photoStrippedSize) {
                        this.roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), ImageLoader.getStrippedPhotoBitmap(tLRPC$Document.thumbs.get(i3).bytes, "b"));
                        CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable();
                        cellFlickerDrawable.repeatProgress = 4.0f;
                        cellFlickerDrawable.progress = 3.5f;
                        this.cellFlickerDrawable = cellFlickerDrawable.getDrawableInterface(this, this.svgIcon);
                        CombinedDrawable combinedDrawable2 = new CombinedDrawable(this.roundedBitmapDrawable, this.cellFlickerDrawable) {
                            @Override
                            public void setBounds(int i4, int i5, int i6, int i7) {
                                VideoScreenPreview videoScreenPreview = VideoScreenPreview.this;
                                if (videoScreenPreview.fromTop) {
                                    super.setBounds(i4, (int) (i5 - videoScreenPreview.roundRadius), i6, i7);
                                } else {
                                    super.setBounds(i4, i5, i6, (int) (i7 + videoScreenPreview.roundRadius));
                                }
                            }
                        };
                        combinedDrawable2.setFullsize(true);
                        combinedDrawable = combinedDrawable2;
                    }
                }
                this.imageReceiver.setImage(ImageLocation.getForDocument(tLRPC$Document), ImageLoader.AUTOPLAY_FILTER, combinedDrawable, null, null, 1);
            }
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
        float measuredHeight = (int) (getMeasuredHeight() * 0.9f);
        float measuredWidth2 = (getMeasuredWidth() - (0.671f * measuredHeight)) / 2.0f;
        if (this.fromTop) {
            AndroidUtilities.rectTmp.set(measuredWidth2, -this.roundRadius, getMeasuredWidth() - measuredWidth2, measuredHeight);
        } else {
            AndroidUtilities.rectTmp.set(measuredWidth2, getMeasuredHeight() - measuredHeight, getMeasuredWidth() - measuredWidth2, getMeasuredHeight() + this.roundRadius);
        }
        if (this.size != measuredWidth) {
            this.size = measuredWidth;
            MatrixParticlesDrawable matrixParticlesDrawable = this.matrixParticlesDrawable;
            if (matrixParticlesDrawable != null) {
                matrixParticlesDrawable.drawingRect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.matrixParticlesDrawable.excludeRect.set(AndroidUtilities.rectTmp);
                this.matrixParticlesDrawable.excludeRect.inset(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            }
            StarParticlesView.Drawable drawable = this.starDrawable;
            if (drawable != null) {
                if (this.type == 6) {
                    drawable.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    this.starDrawable.rect.inset(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
                } else {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float width = (int) (rectF.width() * 0.4f);
                    this.starDrawable.rect.set(rectF.centerX() - width, rectF.centerY() - width, rectF.centerX() + width, rectF.centerY() + width);
                    this.starDrawable.rect2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                this.starDrawable.resetPositions();
                this.starDrawable.excludeRect.set(AndroidUtilities.rectTmp);
                this.starDrawable.excludeRect.inset(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            }
            SpeedLineParticles$Drawable speedLineParticles$Drawable = this.speedLinesDrawable;
            if (speedLineParticles$Drawable != null) {
                speedLineParticles$Drawable.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                this.speedLinesDrawable.screenRect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                this.speedLinesDrawable.rect.inset(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
                this.speedLinesDrawable.rect.offset(0.0f, getMeasuredHeight() * 0.1f);
                this.speedLinesDrawable.resetPositions();
            }
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (!(this.starDrawable == null && this.speedLinesDrawable == null && this.matrixParticlesDrawable == null)) {
            if (this.progress < 0.5f) {
                float pow = (float) Math.pow(1.0f - f, 2.0d);
                canvas.save();
                canvas.scale(pow, pow, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                MatrixParticlesDrawable matrixParticlesDrawable = this.matrixParticlesDrawable;
                if (matrixParticlesDrawable != null) {
                    matrixParticlesDrawable.onDraw(canvas);
                } else {
                    StarParticlesView.Drawable drawable = this.starDrawable;
                    if (drawable != null) {
                        drawable.onDraw(canvas);
                    } else if (this.speedLinesDrawable != null) {
                        float f2 = 0.2f;
                        if (this.imageReceiver.getAnimation() != null) {
                            float clamp = Utilities.clamp(((float) this.imageReceiver.getAnimation().getLastFrameTimestamp()) / this.imageReceiver.getAnimation().getDurationMs(), 1.0f, 0.0f);
                            float[] fArr = speedScaleVideoTimestamps;
                            float length = 1.0f / (fArr.length - 1);
                            int i = (int) (clamp / length);
                            int i2 = i + 1;
                            float f3 = (clamp - (i * length)) / length;
                            if (i2 < fArr.length) {
                                f2 = (fArr[i] * (1.0f - f3)) + (fArr[i2] * f3);
                            } else {
                                f2 = fArr[i];
                            }
                        }
                        SpeedLineParticles$Drawable speedLineParticles$Drawable = this.speedLinesDrawable;
                        speedLineParticles$Drawable.speedScale = (((1.0f - Utilities.clamp(this.progress / 0.1f, 1.0f, 0.0f)) * 0.9f) + 0.1f) * 150.0f * f2;
                        speedLineParticles$Drawable.onDraw(canvas);
                    }
                }
                canvas.restore();
                invalidate();
            }
        }
        float measuredHeight = (int) (getMeasuredHeight() * 0.9f);
        float measuredWidth = (getMeasuredWidth() - (0.671f * measuredHeight)) / 2.0f;
        float f4 = 0.0671f * measuredHeight;
        this.roundRadius = f4;
        if (this.fromTop) {
            AndroidUtilities.rectTmp.set(measuredWidth, -f4, getMeasuredWidth() - measuredWidth, measuredHeight);
        } else {
            AndroidUtilities.rectTmp.set(measuredWidth, getMeasuredHeight() - measuredHeight, getMeasuredWidth() - measuredWidth, getMeasuredHeight() + this.roundRadius);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
        rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
        canvas.drawRoundRect(rectF, this.roundRadius + AndroidUtilities.dp(3.0f), this.roundRadius + AndroidUtilities.dp(3.0f), this.phoneFrame2);
        rectF.inset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        float f5 = this.roundRadius;
        canvas.drawRoundRect(rectF, f5, f5, this.phoneFrame1);
        if (this.fromTop) {
            rectF.set(measuredWidth, 0.0f, getMeasuredWidth() - measuredWidth, measuredHeight);
        } else {
            rectF.set(measuredWidth, getMeasuredHeight() - measuredHeight, getMeasuredWidth() - measuredWidth, getMeasuredHeight());
        }
        float dp = this.roundRadius - AndroidUtilities.dp(3.0f);
        this.roundRadius = dp;
        RoundedBitmapDrawable roundedBitmapDrawable = this.roundedBitmapDrawable;
        if (roundedBitmapDrawable != null) {
            roundedBitmapDrawable.setCornerRadius(dp);
        }
        CellFlickerDrawable.DrawableInterface drawableInterface = this.cellFlickerDrawable;
        if (drawableInterface != null) {
            drawableInterface.radius = this.roundRadius;
        }
        if (this.fromTop) {
            ImageReceiver imageReceiver = this.imageReceiver;
            float f6 = this.roundRadius;
            imageReceiver.setRoundRadius(0, 0, (int) f6, (int) f6);
        } else {
            ImageReceiver imageReceiver2 = this.imageReceiver;
            float f7 = this.roundRadius;
            imageReceiver2.setRoundRadius((int) f7, (int) f7, 0, 0);
        }
        this.imageReceiver.setImageCoords(rectF.left, rectF.top, rectF.width(), rectF.height());
        this.imageReceiver.draw(canvas);
        if (!this.fromTop) {
            canvas.drawCircle(this.imageReceiver.getCenterX(), this.imageReceiver.getImageY() + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), this.phoneFrame1);
        }
    }

    @Override
    public void setOffset(float f) {
        boolean z;
        boolean z2 = true;
        if (f < 0.0f) {
            float measuredWidth = (-f) / getMeasuredWidth();
            setAlpha((Utilities.clamp(1.0f - measuredWidth, 1.0f, 0.0f) * 0.5f) + 0.5f);
            setRotationY(50.0f * measuredWidth);
            invalidate();
            if (this.fromTop) {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth);
            } else {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth);
            }
            this.progress = Math.abs(measuredWidth);
            z = measuredWidth < 1.0f;
            if (measuredWidth >= 0.1f) {
                z2 = false;
            }
        } else {
            float measuredWidth2 = (-f) / getMeasuredWidth();
            Utilities.clamp(measuredWidth2 + 1.0f, 1.0f, 0.0f);
            invalidate();
            setRotationY(50.0f * measuredWidth2);
            if (this.fromTop) {
                setTranslationY(getMeasuredHeight() * 0.3f * measuredWidth2);
            } else {
                setTranslationY((-getMeasuredHeight()) * 0.3f * measuredWidth2);
            }
            z = measuredWidth2 > -1.0f;
            if (measuredWidth2 <= -0.1f) {
                z2 = false;
            }
            this.progress = Math.abs(measuredWidth2);
        }
        if (z != this.visible) {
            this.visible = z;
            updateAttachState();
        }
        if (z2 != this.allowPlay) {
            this.allowPlay = z2;
            this.imageReceiver.setAllowStartAnimation(z2);
            if (this.allowPlay) {
                this.imageReceiver.startAnimation();
            } else {
                this.imageReceiver.stopAnimation();
            }
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        updateAttachState();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        updateAttachState();
    }

    private void updateAttachState() {
        boolean z = this.visible && this.attached;
        if (this.play != z) {
            this.play = z;
            if (z) {
                this.imageReceiver.onAttachedToWindow();
                return;
            }
            if (this.imageReceiver.getAnimation() != null) {
                this.imageReceiver.getAnimation().seekTo(0L, true);
            }
            this.imageReceiver.onDetachedFromWindow();
        }
    }
}
