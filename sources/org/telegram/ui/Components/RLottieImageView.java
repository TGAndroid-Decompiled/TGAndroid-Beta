package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$PhotoSize;
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

    protected void onLoaded() {
    }

    public RLottieImageView(Context context) {
        super(context);
    }

    public void clearLayerColors() {
        this.layerColors.clear();
    }

    public void setLayerNum(Integer num) {
        this.layerNum = num;
        ImageReceiver imageReceiver = this.imageReceiver;
        if (imageReceiver != null) {
            imageReceiver.setLayerNum(num.intValue());
        }
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

    public void replaceColors(int[] iArr) {
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.replaceColors(iArr);
        }
    }

    public void setAnimation(int i, int i2, int i3) {
        setAnimation(i, i2, i3, null);
    }

    public void setAnimation(int i, int i2, int i3, int[] iArr) {
        setAnimation(new RLottieDrawable(i, "" + i, AndroidUtilities.dp(i2), AndroidUtilities.dp(i3), false, iArr));
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.setOnAnimationEndListener(runnable);
        }
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

    public void setOnlyLastFrame(boolean z) {
        this.onlyLastFrame = z;
    }

    public void setAnimation(TLRPC$Document tLRPC$Document, final int i, final int i2) {
        ImageLocation imageLocation;
        String str;
        ImageReceiver imageReceiver = this.imageReceiver;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
            this.imageReceiver = null;
        }
        if (tLRPC$Document == null) {
            return;
        }
        ImageReceiver imageReceiver2 = new ImageReceiver() {
            @Override
            public boolean setImageBitmapByKey(Drawable drawable, String str2, int i3, boolean z, int i4) {
                if (drawable != null) {
                    RLottieImageView.this.onLoaded();
                }
                return super.setImageBitmapByKey(drawable, str2, i3, z, i4);
            }
        };
        this.imageReceiver = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        String str2 = tLRPC$Document.localThumbPath;
        if (str2 != null) {
            imageLocation = ImageLocation.getForPath(str2);
            str = i + "_" + i2;
        } else {
            imageLocation = null;
            str = null;
        }
        if (this.onlyLastFrame) {
            this.imageReceiver.setImage(ImageLocation.getForDocument(tLRPC$Document), i + "_" + i2 + "_lastframe", null, null, imageLocation, str, null, 0L, null, tLRPC$Document, 1);
        } else {
            if ("video/webm".equals(tLRPC$Document.mime_type)) {
                TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 90);
                ImageReceiver imageReceiver3 = this.imageReceiver;
                ImageLocation forDocument = ImageLocation.getForDocument(tLRPC$Document);
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("_");
                sb.append(i2);
                sb.append(this.cached ? "_pcache" : "");
                sb.append("_");
                sb.append(ImageLoader.AUTOPLAY_FILTER);
                imageReceiver3.setImage(forDocument, sb.toString(), imageLocation != null ? imageLocation : ImageLocation.getForDocument(closestPhotoSizeWithSize, tLRPC$Document), str, null, tLRPC$Document.size, null, tLRPC$Document, 1);
            } else {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tLRPC$Document.thumbs, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(LiteMode.FLAG_CALLS_ANIMATIONS, LiteMode.FLAG_CALLS_ANIMATIONS);
                }
                TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 90);
                ImageReceiver imageReceiver4 = this.imageReceiver;
                ImageLocation forDocument2 = ImageLocation.getForDocument(tLRPC$Document);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i);
                sb2.append("_");
                sb2.append(i2);
                sb2.append(this.cached ? "_pcache" : "");
                imageReceiver4.setImage(forDocument2, sb2.toString(), ImageLocation.getForDocument(closestPhotoSizeWithSize2, tLRPC$Document), null, imageLocation, str, svgThumb, 0L, null, tLRPC$Document, 1);
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
            public int getOpacity() {
                return -2;
            }

            @Override
            public void draw(Canvas canvas) {
                android.graphics.Rect rect = AndroidUtilities.rectTmp2;
                rect.set(getBounds().centerX() - (AndroidUtilities.dp(i) / 2), getBounds().centerY() - (AndroidUtilities.dp(i2) / 2), getBounds().centerX() + (AndroidUtilities.dp(i) / 2), getBounds().centerY() + (AndroidUtilities.dp(i2) / 2));
                RLottieImageView.this.imageReceiver.setImageCoords(rect);
                RLottieImageView.this.imageReceiver.draw(canvas);
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

    @Override
    protected void onAttachedToWindow() {
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
    protected void onDetachedFromWindow() {
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

    public boolean isPlaying() {
        RLottieDrawable rLottieDrawable = this.drawable;
        return rLottieDrawable != null && rLottieDrawable.isRunning();
    }

    public void setAutoRepeat(boolean z) {
        this.autoRepeat = z;
    }

    public void setProgress(float f) {
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.setProgress(f);
        }
    }

    public ImageReceiver getImageReceiver() {
        return this.imageReceiver;
    }

    @Override
    public void setImageResource(int i) {
        super.setImageResource(i);
        this.drawable = null;
    }

    public void playAnimation() {
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable == null && this.imageReceiver == null) {
            return;
        }
        this.playing = true;
        if (this.attachedToWindow) {
            if (rLottieDrawable != null) {
                rLottieDrawable.start();
            }
            ImageReceiver imageReceiver = this.imageReceiver;
            if (imageReceiver != null) {
                imageReceiver.startAnimation();
            }
        }
    }

    public void stopAnimation() {
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable == null && this.imageReceiver == null) {
            return;
        }
        this.playing = false;
        if (this.attachedToWindow) {
            if (rLottieDrawable != null) {
                rLottieDrawable.stop();
            }
            ImageReceiver imageReceiver = this.imageReceiver;
            if (imageReceiver != null) {
                imageReceiver.stopAnimation();
            }
        }
    }

    public RLottieDrawable getAnimatedDrawable() {
        return this.drawable;
    }
}
