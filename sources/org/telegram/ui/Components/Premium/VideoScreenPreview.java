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
    boolean attached;
    CellFlickerDrawable.DrawableInterface cellFlickerDrawable;
    int currentAccount;
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
    boolean fromTop = false;
    ImageReceiver imageReceiver = new ImageReceiver(this);

    public VideoScreenPreview(Context context, SvgHelper.SvgDrawable svgDrawable, int i, int i2) {
        super(context);
        new Path();
        this.currentAccount = i;
        this.type = i2;
        this.svgIcon = svgDrawable;
        this.phoneFrame1.setColor(-16777216);
        this.phoneFrame2.setColor(ColorUtils.blendARGB(Theme.getColor("premiumGradient2"), -16777216, 0.5f));
        this.imageReceiver.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        setVideo();
        if (i2 == 6) {
            StarParticlesView.Drawable drawable = new StarParticlesView.Drawable(30);
            this.starDrawable = drawable;
            drawable.speedScale = 3.0f;
            drawable.init();
        } else if (i2 == 2) {
            SpeedLineParticles$Drawable speedLineParticles$Drawable = new SpeedLineParticles$Drawable(200);
            this.speedLinesDrawable = speedLineParticles$Drawable;
            speedLineParticles$Drawable.init();
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
                        this.cellFlickerDrawable = new CellFlickerDrawable().getDrawableInterface(this, this.svgIcon);
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
        if (this.size != measuredWidth) {
            this.size = measuredWidth;
            StarParticlesView.Drawable drawable = this.starDrawable;
            if (drawable != null) {
                drawable.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                this.starDrawable.rect.inset(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
                this.starDrawable.resetPositions();
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
        super.onDraw(canvas);
        if (!(this.starDrawable == null && this.speedLinesDrawable == null)) {
            float pow = (float) Math.pow(1.0f - this.progress, 2.0d);
            canvas.save();
            canvas.scale(pow, pow, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            StarParticlesView.Drawable drawable = this.starDrawable;
            if (drawable != null) {
                drawable.onDraw(canvas);
            } else if (this.speedLinesDrawable != null) {
                float f = 0.2f;
                if (this.imageReceiver.getAnimation() != null) {
                    float clamp = Utilities.clamp(((float) this.imageReceiver.getAnimation().getLastFrameTimestamp()) / this.imageReceiver.getAnimation().getDurationMs(), 1.0f, 0.0f);
                    float[] fArr = speedScaleVideoTimestamps;
                    float length = 1.0f / (fArr.length - 1);
                    int i = (int) (clamp / length);
                    int i2 = i + 1;
                    float f2 = (clamp - (i * length)) / length;
                    if (i2 < fArr.length) {
                        f = (fArr[i] * (1.0f - f2)) + (fArr[i2] * f2);
                    } else {
                        f = fArr[i];
                    }
                }
                SpeedLineParticles$Drawable speedLineParticles$Drawable = this.speedLinesDrawable;
                speedLineParticles$Drawable.speedScale = (((1.0f - Utilities.clamp(this.progress / 0.1f, 1.0f, 0.0f)) * 0.9f) + 0.1f) * 150.0f * f;
                speedLineParticles$Drawable.onDraw(canvas);
            }
            canvas.restore();
            invalidate();
        }
        float measuredHeight = (int) (getMeasuredHeight() * 0.9f);
        float measuredWidth = (getMeasuredWidth() - (0.671f * measuredHeight)) / 2.0f;
        float f3 = 0.0671f * measuredHeight;
        this.roundRadius = f3;
        if (this.fromTop) {
            AndroidUtilities.rectTmp.set(measuredWidth, -f3, getMeasuredWidth() - measuredWidth, measuredHeight);
        } else {
            AndroidUtilities.rectTmp.set(measuredWidth, getMeasuredHeight() - measuredHeight, getMeasuredWidth() - measuredWidth, getMeasuredHeight() + this.roundRadius);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
        rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
        canvas.drawRoundRect(rectF, this.roundRadius + AndroidUtilities.dp(3.0f), this.roundRadius + AndroidUtilities.dp(3.0f), this.phoneFrame2);
        rectF.inset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        float f4 = this.roundRadius;
        canvas.drawRoundRect(rectF, f4, f4, this.phoneFrame1);
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
            float f5 = this.roundRadius;
            imageReceiver.setRoundRadius(0, 0, (int) f5, (int) f5);
        } else {
            ImageReceiver imageReceiver2 = this.imageReceiver;
            float f6 = this.roundRadius;
            imageReceiver2.setRoundRadius((int) f6, (int) f6, 0, 0);
        }
        this.imageReceiver.setImageCoords(rectF.left, rectF.top, rectF.width(), rectF.height());
        this.imageReceiver.draw(canvas);
        if (!this.fromTop) {
            canvas.drawCircle(this.imageReceiver.getCenterX(), this.imageReceiver.getImageY() + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), this.phoneFrame1);
        }
    }

    @Override
    public void setOffset(float f) {
        boolean z = true;
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
            if (measuredWidth >= 1.0f) {
                z = false;
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
            if (measuredWidth2 <= -1.0f) {
                z = false;
            }
            this.progress = Math.abs(measuredWidth2);
        }
        if (z != this.visible) {
            this.visible = z;
            updateAttachState();
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
            } else {
                this.imageReceiver.onDetachedFromWindow();
            }
        }
    }
}
