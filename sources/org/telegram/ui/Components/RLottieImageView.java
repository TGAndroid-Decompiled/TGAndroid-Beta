package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;

public class RLottieImageView extends ImageView {
    private boolean attachedToWindow;
    private boolean autoRepeat;
    public boolean cached;
    private RLottieDrawable drawable;
    private ImageReceiver imageReceiver;
    private HashMap<String, Integer> layerColors;
    private Integer layerNum;
    private boolean onlyLastFrame;
    private boolean playing;
    private boolean reverse;
    private boolean startOnAttach;

    public RLottieImageView(Context context) {
        super(context);
    }

    public void clearAnimationDrawable() {
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.stop();
        }
        ImageReceiver imageReceiver = this.imageReceiver;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
            this.imageReceiver = null;
        }
        this.drawable = null;
        setImageDrawable(null);
    }

    public void clearLayerColors() {
        this.layerColors.clear();
    }

    public RLottieDrawable getAnimatedDrawable() {
        return this.drawable;
    }

    public ImageReceiver getImageReceiver() {
        return this.imageReceiver;
    }

    public boolean isPlaying() {
        RLottieDrawable rLottieDrawable = this.drawable;
        return rLottieDrawable != null && rLottieDrawable.isRunning();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        ImageReceiver imageReceiver = this.imageReceiver;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
            if (this.playing) {
                this.imageReceiver.startAnimation();
            }
        }
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(this);
            if (this.playing) {
                this.drawable.start();
            }
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.stop();
        }
        ImageReceiver imageReceiver = this.imageReceiver;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }

    public void onLoaded() {
    }

    public void playAnimation() {
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable == null && this.imageReceiver == null) {
            return;
        }
        this.playing = true;
        if (!this.attachedToWindow) {
            this.startOnAttach = true;
            return;
        }
        if (rLottieDrawable != null) {
            rLottieDrawable.start();
        }
        ImageReceiver imageReceiver = this.imageReceiver;
        if (imageReceiver != null) {
            imageReceiver.startAnimation();
        }
    }

    public void replaceColors(int[] iArr) {
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.replaceColors(iArr);
        }
    }

    public void setAnimation(int i, int i2, int i3) {
        setAnimation(i, i2, i3, null);
    }

    public void setAutoRepeat(boolean z) {
        this.autoRepeat = z;
    }

    @Override
    public void setImageResource(int i) {
        super.setImageResource(i);
        this.drawable = null;
    }

    public void setLayerColor(String str, int i) {
        if (this.layerColors == null) {
            this.layerColors = new HashMap<>();
        }
        this.layerColors.put(str, Integer.valueOf(i));
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.setLayerColor(str, i);
        }
    }

    public void setLayerNum(Integer num) {
        this.layerNum = num;
        ImageReceiver imageReceiver = this.imageReceiver;
        if (imageReceiver != null) {
            imageReceiver.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.setOnAnimationEndListener(runnable);
        }
    }

    public void setOnlyLastFrame(boolean z) {
        this.onlyLastFrame = z;
    }

    public void setProgress(float f) {
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.setProgress(f);
        }
    }

    public void setReverse() {
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
            RLottieDrawable rLottieDrawable2 = this.drawable;
            rLottieDrawable2.setCurrentFrame(rLottieDrawable2.getFramesCount());
            this.drawable.setCustomEndFrame(0);
        }
    }

    public void stopAnimation() {
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable == null && this.imageReceiver == null) {
            return;
        }
        this.playing = false;
        if (!this.attachedToWindow) {
            this.startOnAttach = false;
            return;
        }
        if (rLottieDrawable != null) {
            rLottieDrawable.stop();
        }
        ImageReceiver imageReceiver = this.imageReceiver;
        if (imageReceiver != null) {
            imageReceiver.stopAnimation();
        }
    }

    public void setAnimation(int i, int i2, int i3, int[] iArr) {
        setAnimation(new RLottieDrawable(i, DiffUtil.m(i, ""), AndroidUtilities.dp(i2), AndroidUtilities.dp(i3), false, iArr));
    }

    public void setAnimation(RLottieDrawable rLottieDrawable) {
        if (this.drawable == rLottieDrawable) {
            return;
        }
        ImageReceiver imageReceiver = this.imageReceiver;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
            this.imageReceiver = null;
        }
        this.drawable = rLottieDrawable;
        rLottieDrawable.setMasterParent(this);
        if (this.autoRepeat) {
            this.drawable.setAutoRepeat(1);
        }
        if (this.layerColors != null) {
            this.drawable.beginApplyLayerColors();
            for (Map.Entry<String, Integer> entry : this.layerColors.entrySet()) {
                this.drawable.setLayerColor(entry.getKey(), entry.getValue().intValue());
            }
            this.drawable.commitApplyLayerColors();
        }
        this.drawable.setAllowDecodeSingleFrame(true);
        setImageDrawable(this.drawable);
    }

    public void setAnimation(TLRPC.Document document, final int i, final int i2) {
        ImageLocation forDocument;
        String strM;
        ImageReceiver imageReceiver = this.imageReceiver;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
            this.imageReceiver = null;
        }
        if (document == null) {
            return;
        }
        ImageReceiver imageReceiver2 = new ImageReceiver() {
            @Override
            public boolean setImageBitmapByKey(Drawable drawable, String str, int i3, boolean z, int i4) {
                if (drawable != null) {
                    RLottieImageView.this.onLoaded();
                }
                return super.setImageBitmapByKey(drawable, str, i3, z, i4);
            }
        };
        this.imageReceiver = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        String str = document.localThumbPath;
        if (str != null) {
            ImageLocation forPath = ImageLocation.getForPath(str);
            strM = DiffUtil.m(i, i2, "_");
            forDocument = forPath;
        } else {
            forDocument = null;
            strM = null;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
        if (this.onlyLastFrame) {
            this.imageReceiver.setImage(ImageLocation.getForDocument(document), i + "_" + i2 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), DiffUtil.m(i, i2, "_"), forDocument, strM, null, 0L, null, document, 1);
        } else {
            if ("video/webm".equals(document.mime_type)) {
                ImageReceiver imageReceiver3 = this.imageReceiver;
                ImageLocation forDocument2 = ImageLocation.getForDocument(document);
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("_");
                sb.append(i2);
                String strM2 = MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(sb, this.cached ? "_pcache" : "", "_g");
                if (forDocument == null) {
                    forDocument = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                }
                imageReceiver3.setImage(forDocument2, strM2, forDocument, strM, null, document.size, null, document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                ImageReceiver imageReceiver4 = this.imageReceiver;
                ImageLocation forDocument3 = ImageLocation.getForDocument(document);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i);
                sb2.append("_");
                sb2.append(i2);
                sb2.append(this.cached ? "_pcache" : "");
                imageReceiver4.setImage(forDocument3, sb2.toString(), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), DiffUtil.m(i, i2, "_"), forDocument, strM, svgThumb, 0L, null, document, 1);
            }
        }
        this.imageReceiver.setAspectFit(true);
        this.imageReceiver.setParentView(this);
        if (this.autoRepeat) {
            this.imageReceiver.setAutoRepeat(1);
            this.imageReceiver.setAllowStartLottieAnimation(true);
            this.imageReceiver.setAllowStartAnimation(true);
        } else {
            this.imageReceiver.setAutoRepeat(0);
        }
        ImageReceiver imageReceiver5 = this.imageReceiver;
        Integer num = this.layerNum;
        imageReceiver5.setLayerNum(num != null ? num.intValue() : 7);
        this.imageReceiver.clip = false;
        setImageDrawable(new Drawable() {
            @Override
            public void draw(Canvas canvas) {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - (AndroidUtilities.dp(i) / 2), getBounds().centerY() - (AndroidUtilities.dp(i2) / 2), (AndroidUtilities.dp(i) / 2) + getBounds().centerX(), (AndroidUtilities.dp(i2) / 2) + getBounds().centerY());
                RLottieImageView.this.imageReceiver.setImageCoords(rect);
                RLottieImageView.this.imageReceiver.draw(canvas);
            }

            @Override
            public int getOpacity() {
                return -2;
            }

            @Override
            public void setAlpha(int i3) {
                RLottieImageView.this.imageReceiver.setAlpha(i3 / 255.0f);
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
                RLottieImageView.this.imageReceiver.setColorFilter(colorFilter);
            }
        });
        if (this.attachedToWindow) {
            this.imageReceiver.onAttachedToWindow();
        }
    }
}
