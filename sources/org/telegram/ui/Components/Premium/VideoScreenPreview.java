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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$TL_help_premiumPromo;
import org.telegram.tgnet.TLRPC$TL_photoStrippedSize;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.PremiumPreviewFragment;

public class VideoScreenPreview extends View implements PagerHeaderView {
    boolean attached;
    CellFlickerDrawable.DrawableInterface cellFlickerDrawable;
    int currentAccount;
    boolean play;
    private float roundRadius;
    RoundedBitmapDrawable roundedBitmapDrawable;
    int type;
    boolean visible;
    Paint phoneFrame1 = new Paint(1);
    Paint phoneFrame2 = new Paint(1);
    boolean fromTop = false;
    ImageReceiver imageReceiver = new ImageReceiver(this);

    public VideoScreenPreview(Context context, int i, int i2) {
        super(context);
        new Path();
        this.currentAccount = i;
        this.type = i2;
        this.phoneFrame1.setColor(-16777216);
        this.phoneFrame2.setColor(ColorUtils.blendARGB(Theme.getColor("premiumGradient2"), -16777216, 0.5f));
        this.imageReceiver.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        setVideo();
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
                        this.cellFlickerDrawable = new CellFlickerDrawable().getDrawableInterface(this);
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
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredHeight = (int) (getMeasuredHeight() * 0.9f);
        float measuredWidth = (getMeasuredWidth() - (0.671f * measuredHeight)) / 2.0f;
        float f = 0.0671f * measuredHeight;
        this.roundRadius = f;
        if (this.fromTop) {
            AndroidUtilities.rectTmp.set(measuredWidth, -f, getMeasuredWidth() - measuredWidth, measuredHeight);
        } else {
            AndroidUtilities.rectTmp.set(measuredWidth, getMeasuredHeight() - measuredHeight, getMeasuredWidth() - measuredWidth, getMeasuredHeight() + this.roundRadius);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
        rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
        canvas.drawRoundRect(rectF, this.roundRadius + AndroidUtilities.dp(3.0f), this.roundRadius + AndroidUtilities.dp(3.0f), this.phoneFrame2);
        rectF.inset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        float f2 = this.roundRadius;
        canvas.drawRoundRect(rectF, f2, f2, this.phoneFrame1);
        if (this.fromTop) {
            rectF.set(measuredWidth, 0.0f, getMeasuredWidth() - measuredWidth, measuredHeight);
        } else {
            rectF.set(measuredWidth, getMeasuredHeight() - measuredHeight, getMeasuredWidth() - measuredWidth, getMeasuredHeight());
        }
        float dp = this.roundRadius - AndroidUtilities.dp(3.0f);
        this.roundRadius = dp;
        this.roundedBitmapDrawable.setCornerRadius(dp);
        CellFlickerDrawable.DrawableInterface drawableInterface = this.cellFlickerDrawable;
        float f3 = this.roundRadius;
        drawableInterface.radius = f3;
        if (this.fromTop) {
            this.imageReceiver.setRoundRadius(0, 0, (int) f3, (int) f3);
        } else {
            this.imageReceiver.setRoundRadius((int) f3, (int) f3, 0, 0);
        }
        this.imageReceiver.setImageCoords(rectF.left, rectF.top, rectF.width(), rectF.height());
        this.imageReceiver.draw(canvas);
        if (!this.fromTop) {
            canvas.drawCircle(this.imageReceiver.getCenterX(), this.imageReceiver.getImageY() + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), this.phoneFrame1);
        }
    }

    @Override
    public void setOffset(float r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.VideoScreenPreview.setOffset(float):void");
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
