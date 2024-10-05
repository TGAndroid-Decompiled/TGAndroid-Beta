package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

public class RLottieImageView extends ImageView {
    private boolean attachedToWindow;
    private boolean autoRepeat;
    public boolean cached;
    private RLottieDrawable drawable;
    private ImageReceiver imageReceiver;
    private HashMap layerColors;
    private Integer layerNum;
    private boolean onlyLastFrame;
    private boolean playing;
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

    protected void onLoaded() {
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

    public void setAnimation(int i, int i2, int i3, int[] iArr) {
        setAnimation(new RLottieDrawable(i, "" + i, AndroidUtilities.dp(i2), AndroidUtilities.dp(i3), false, iArr));
    }

    public void setAnimation(org.telegram.tgnet.TLRPC$Document r20, final int r21, final int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.RLottieImageView.setAnimation(org.telegram.tgnet.TLRPC$Document, int, int):void");
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
            for (Map.Entry entry : this.layerColors.entrySet()) {
                this.drawable.setLayerColor((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
            }
            this.drawable.commitApplyLayerColors();
        }
        this.drawable.setAllowDecodeSingleFrame(true);
        setImageDrawable(this.drawable);
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
            this.layerColors = new HashMap();
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
}
