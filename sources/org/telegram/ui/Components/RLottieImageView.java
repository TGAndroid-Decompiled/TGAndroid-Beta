package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.recyclerview.widget.DiffUtil;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;

public class RLottieImageView extends ImageView {
    public boolean attachedToWindow;
    public boolean autoRepeat;
    public RLottieDrawable drawable;
    public AnonymousClass1 imageReceiver;
    public HashMap layerColors;
    public Integer layerNum;
    public boolean onlyLastFrame;
    public boolean playing;

    public RLottieImageView(Context context) {
        super(context);
    }

    public final void clearAnimationDrawable() {
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.isRunning = false;
            rLottieDrawable.checkChoreographer$1();
        }
        AnonymousClass1 anonymousClass1 = this.imageReceiver;
        if (anonymousClass1 != null) {
            anonymousClass1.onDetachedFromWindow();
            this.imageReceiver = null;
        }
        this.drawable = null;
        setImageDrawable(null);
    }

    public RLottieDrawable getAnimatedDrawable() {
        return this.drawable;
    }

    public ImageReceiver getImageReceiver() {
        return this.imageReceiver;
    }

    public final boolean isPlaying() {
        RLottieDrawable rLottieDrawable = this.drawable;
        return rLottieDrawable != null && rLottieDrawable.isRunning;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        AnonymousClass1 anonymousClass1 = this.imageReceiver;
        if (anonymousClass1 != null) {
            anonymousClass1.onAttachedToWindow();
            if (this.playing) {
                startAnimation();
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
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.isRunning = false;
            rLottieDrawable.checkChoreographer$1();
        }
        AnonymousClass1 anonymousClass1 = this.imageReceiver;
        if (anonymousClass1 != null) {
            anonymousClass1.onDetachedFromWindow();
        }
    }

    public void onLoaded() {
    }

    public final void playAnimation() {
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable == null && this.imageReceiver == null) {
            return;
        }
        this.playing = true;
        if (this.attachedToWindow) {
            if (rLottieDrawable != null) {
                rLottieDrawable.start();
            }
            AnonymousClass1 anonymousClass1 = this.imageReceiver;
            if (anonymousClass1 != null) {
                anonymousClass1.startAnimation();
            }
        }
    }

    public final void setAnimation(int i, int i2, int i3) {
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

    public final void setLayerColor(int i, String str) {
        if (this.layerColors == null) {
            this.layerColors = new HashMap();
        }
        this.layerColors.put(str, Integer.valueOf(i));
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable != null) {
            OKLCH.m(i, rLottieDrawable.newColorUpdates, str, rLottieDrawable);
        }
    }

    public void setLayerNum(Integer num) {
        this.layerNum = num;
        AnonymousClass1 anonymousClass1 = this.imageReceiver;
        if (anonymousClass1 != null) {
            anonymousClass1.setLayerNum(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.onAnimationEndListener = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z) {
        this.onlyLastFrame = z;
    }

    public void setProgress(float f) {
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.setProgress(f, true);
        }
    }

    public final void stopAnimation() {
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable == null && this.imageReceiver == null) {
            return;
        }
        this.playing = false;
        if (this.attachedToWindow) {
            if (rLottieDrawable != null) {
                rLottieDrawable.isRunning = false;
                rLottieDrawable.checkChoreographer$1();
            }
            AnonymousClass1 anonymousClass1 = this.imageReceiver;
            if (anonymousClass1 != null) {
                anonymousClass1.stopAnimation();
            }
        }
    }

    public final void setAnimation(int i, int i2, int i3, int[] iArr) {
        setAnimation(new RLottieDrawable(i, DiffUtil.m(i, ""), AndroidUtilities.dp(i2), AndroidUtilities.dp(i3), false, iArr));
    }

    public void setAnimation(RLottieDrawable rLottieDrawable) {
        if (this.drawable == rLottieDrawable) {
            return;
        }
        AnonymousClass1 anonymousClass1 = this.imageReceiver;
        if (anonymousClass1 != null) {
            anonymousClass1.onDetachedFromWindow();
            this.imageReceiver = null;
        }
        this.drawable = rLottieDrawable;
        rLottieDrawable.masterParent = this;
        if (this.autoRepeat) {
            rLottieDrawable.setAutoRepeat(1);
        }
        HashMap map = this.layerColors;
        if (map != null) {
            this.drawable.applyingLayerColors = true;
            for (Map.Entry entry : map.entrySet()) {
                RLottieDrawable rLottieDrawable2 = this.drawable;
                String str = (String) entry.getKey();
                Integer num = (Integer) entry.getValue();
                num.getClass();
                rLottieDrawable2.newColorUpdates.put(str, num);
                rLottieDrawable2.requestRedrawColors();
            }
            this.drawable.commitApplyLayerColors();
        }
        RLottieDrawable rLottieDrawable3 = this.drawable;
        rLottieDrawable3.decodeSingleFrame = true;
        rLottieDrawable3.scheduleNextGetFrame();
        setImageDrawable(this.drawable);
    }

    public final void setAnimation(final int i, final int i2, TLRPC.Document document) {
        ImageLocation forDocument;
        String strM;
        AnonymousClass1 anonymousClass1 = this.imageReceiver;
        if (anonymousClass1 != null) {
            anonymousClass1.onDetachedFromWindow();
            this.imageReceiver = null;
        }
        if (document == null) {
            return;
        }
        ?? r3 = new ImageReceiver() {
            @Override
            public final boolean setImageBitmapByKey(Drawable drawable, String str, int i3, boolean z, int i4) {
                if (drawable != null) {
                    RLottieImageView.this.onLoaded();
                }
                return super.setImageBitmapByKey(drawable, str, i3, z, i4);
            }
        };
        this.imageReceiver = r3;
        r3.setAllowLoadingOnAttachedOnly(true);
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
            setImage(ImageLocation.getForDocument(document), i + "_" + i2 + "_lastframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), DiffUtil.m(i, i2, "_"), forDocument, strM, null, 0L, null, document, 1);
        } else if ("video/webm".equals(document.mime_type)) {
            AnonymousClass1 anonymousClass2 = this.imageReceiver;
            ImageLocation forDocument2 = ImageLocation.getForDocument(document);
            String str2 = i + "_" + i2 + "_g";
            if (forDocument == null) {
                forDocument = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
            }
            anonymousClass2.setImage(forDocument2, str2, forDocument, strM, null, document.size, null, document, 1);
        } else {
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f);
            if (svgThumb != null) {
                svgThumb.overrideWidthAndHeight(512, 512);
            }
            setImage(ImageLocation.getForDocument(document), i + "_" + i2 + "", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), DiffUtil.m(i, i2, "_"), forDocument, strM, svgThumb, 0L, null, document, 1);
        }
        setAspectFit(true);
        setParentView(this);
        if (this.autoRepeat) {
            setAutoRepeat(1);
            setAllowStartLottieAnimation(true);
            setAllowStartAnimation(true);
        } else {
            setAutoRepeat(0);
        }
        AnonymousClass1 anonymousClass3 = this.imageReceiver;
        Integer num = this.layerNum;
        anonymousClass3.setLayerNum(num != null ? num.intValue() : 7);
        this.imageReceiver.clip = false;
        setImageDrawable(new Drawable() {
            @Override
            public final void draw(Canvas canvas) {
                Rect rect = AndroidUtilities.rectTmp2;
                int iCenterX = getBounds().centerX();
                float f = i;
                int iDp = iCenterX - (AndroidUtilities.dp(f) / 2);
                int iCenterY = getBounds().centerY();
                float f2 = i2;
                rect.set(iDp, iCenterY - (AndroidUtilities.dp(f2) / 2), (AndroidUtilities.dp(f) / 2) + getBounds().centerX(), (AndroidUtilities.dp(f2) / 2) + getBounds().centerY());
                RLottieImageView rLottieImageView = RLottieImageView.this;
                rLottieImageView.imageReceiver.setImageCoords(rect);
                rLottieImageView.imageReceiver.draw(canvas);
            }

            @Override
            public final int getOpacity() {
                return -2;
            }

            @Override
            public final void setAlpha(int i3) {
                setAlpha(i3 / 255.0f);
            }

            @Override
            public final void setColorFilter(ColorFilter colorFilter) {
                setColorFilter(colorFilter);
            }
        });
        if (this.attachedToWindow) {
            onAttachedToWindow();
        }
    }
}
