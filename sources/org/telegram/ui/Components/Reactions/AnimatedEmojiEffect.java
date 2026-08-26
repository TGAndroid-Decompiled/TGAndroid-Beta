package org.telegram.ui.Components.Reactions;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import com.google.android.gms.internal.mlkit_vision_label.zzcw;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.EmojiAnimationsOverlay;

public final class AnimatedEmojiEffect {
    public static int currentIndex;
    public final AnimatedEmojiDrawable animatedEmojiDrawable;
    public final int currentAccount;
    public final ImageReceiver effectImageReceiver;
    public long lastGenerateTime;
    public final boolean longAnimation;
    public View parentView;
    public final boolean showGeneric;
    public final Rect bounds = new Rect();
    public final ArrayList particles = new ArrayList();
    public boolean firsDraw = true;
    public int animationIndex = -1;
    public final long startTime = System.currentTimeMillis();

    public final class Particle {
        public long duration;
        public float fromSize;
        public float fromX;
        public float fromY;
        public boolean mirror;
        public float progress;
        public float randomRotation;
        public float toSize;
        public float toX;
        public float toY1;
        public float toY2;

        public Particle() {
        }

        public final void generate() {
            float f = 0.0f;
            this.progress = 0.0f;
            float fRandX = randX();
            AnimatedEmojiEffect animatedEmojiEffect = AnimatedEmojiEffect.this;
            float fM = (zzcw.m(Utilities.fastRandom, 100) / 100.0f) * animatedEmojiEffect.bounds.height() * 0.5f;
            for (int i = 0; i < 20; i++) {
                float fRandX2 = randX();
                float fM2 = (zzcw.m(Utilities.fastRandom, 100) / 100.0f) * animatedEmojiEffect.bounds.height() * 0.5f;
                float f2 = 2.1474836E9f;
                for (int i2 = 0; i2 < animatedEmojiEffect.particles.size(); i2++) {
                    float f3 = ((Particle) animatedEmojiEffect.particles.get(i2)).toX - fRandX2;
                    float f4 = ((Particle) animatedEmojiEffect.particles.get(i2)).toY1 - fM2;
                    float f5 = (f4 * f4) + (f3 * f3);
                    if (f5 < f2) {
                        f2 = f5;
                    }
                }
                if (f2 > f) {
                    fRandX = fRandX2;
                    f = f2;
                    fM = fM2;
                }
            }
            float f6 = animatedEmojiEffect.longAnimation ? 0.8f : 0.5f;
            this.toX = fRandX;
            if (fRandX > animatedEmojiEffect.bounds.width() * f6) {
                this.fromX = animatedEmojiEffect.bounds.width() * f6;
            } else {
                float fWidth = animatedEmojiEffect.bounds.width() * f6;
                this.fromX = fWidth;
                if (this.toX > fWidth) {
                    this.toX = fWidth - 0.1f;
                }
            }
            this.fromY = zzjd.m(zzcw.m(Utilities.fastRandom, 100), 100.0f, animatedEmojiEffect.bounds.height() * 0.1f, animatedEmojiEffect.bounds.height() * 0.45f);
            boolean z = animatedEmojiEffect.longAnimation;
            Rect rect = animatedEmojiEffect.bounds;
            if (z) {
                float fM3 = zzjd.m(zzcw.m(Utilities.fastRandom, 100), 100.0f, animatedEmojiEffect.bounds.width() * 0.1f, rect.width() * 0.05f);
                this.fromSize = fM3;
                this.toSize = (((zzcw.m(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * fM3;
                this.toY1 = zzjd.m(zzcw.m(Utilities.fastRandom, 100), 100.0f, animatedEmojiEffect.bounds.height() * 0.1f, this.fromSize / 2.0f);
                this.toY2 = animatedEmojiEffect.bounds.height() + this.fromSize;
                this.duration = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
            } else {
                float fM4 = zzjd.m(zzcw.m(Utilities.fastRandom, 100), 100.0f, animatedEmojiEffect.bounds.width() * 0.1f, rect.width() * 0.05f);
                this.fromSize = fM4;
                this.toSize = (((zzcw.m(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * fM4;
                this.toY1 = fM;
                this.toY2 = fM + animatedEmojiEffect.bounds.height();
                this.duration = 1800L;
            }
            this.duration = (long) (this.duration / 1.75f);
            this.mirror = Utilities.fastRandom.nextBoolean();
            this.randomRotation = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
        }

        public final float randX() {
            AnimatedEmojiEffect animatedEmojiEffect = AnimatedEmojiEffect.this;
            boolean z = animatedEmojiEffect.longAnimation;
            Rect rect = animatedEmojiEffect.bounds;
            if (!z) {
                return (zzcw.m(Utilities.fastRandom, 100) / 100.0f) * rect.width();
            }
            return zzjd.m(zzcw.m(Utilities.fastRandom, 100), 100.0f, animatedEmojiEffect.bounds.width() * 1.5f, rect.width() * (-0.25f));
        }
    }

    public AnimatedEmojiEffect(AnimatedEmojiDrawable animatedEmojiDrawable, int i, boolean z, boolean z2) {
        this.animatedEmojiDrawable = animatedEmojiDrawable;
        this.longAnimation = z;
        this.currentAccount = i;
        this.showGeneric = z2;
        if (z2 && LiteMode.isEnabled(4112)) {
            ImageReceiver imageReceiver = new ImageReceiver();
            this.effectImageReceiver = imageReceiver;
            if (z) {
                imageReceiver.setAllowDrawWhileCacheGenerating(true);
            }
        }
    }

    public final void draw(Canvas canvas) {
        float fClamp;
        ArrayList arrayList = this.particles;
        boolean z = this.longAnimation;
        if (z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (arrayList.size() < 12) {
                long j = jCurrentTimeMillis - this.startTime;
                if (j < 1500 && j > 200 && jCurrentTimeMillis - this.lastGenerateTime > 50 && Utilities.fastRandom.nextInt() % 6 == 0) {
                    Particle particle = new Particle();
                    particle.generate();
                    arrayList.add(particle);
                    this.lastGenerateTime = jCurrentTimeMillis;
                }
            }
        } else if (this.firsDraw) {
            for (int i = 0; i < 7; i++) {
                Particle particle2 = new Particle();
                particle2.generate();
                arrayList.add(particle2);
            }
        }
        ImageReceiver imageReceiver = this.effectImageReceiver;
        Rect rect = this.bounds;
        if (imageReceiver != null && this.showGeneric && (imageReceiver.getLottieAnimation() == null || !imageReceiver.getLottieAnimation().isLastFrame())) {
            if (z) {
                canvas.save();
                canvas.translate(rect.width() / 3.0f, 0.0f);
                imageReceiver.draw(canvas);
                canvas.restore();
            } else {
                imageReceiver.draw(canvas);
            }
        }
        canvas.save();
        canvas.translate(rect.left, rect.top);
        int i2 = 0;
        while (i2 < arrayList.size()) {
            Particle particle3 = (Particle) arrayList.get(i2);
            float fMin = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / particle3.duration) + particle3.progress;
            particle3.progress = fMin;
            float fClamp2 = Utilities.clamp(fMin, 1.0f, 0.0f);
            particle3.progress = fClamp2;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
            float interpolation = cubicBezierInterpolator.getInterpolation(fClamp2);
            float fLerp = AndroidUtilities.lerp(particle3.fromX, particle3.toX, interpolation);
            AnimatedEmojiEffect animatedEmojiEffect = AnimatedEmojiEffect.this;
            boolean z2 = animatedEmojiEffect.longAnimation;
            float f = particle3.progress;
            float fLerp2 = f < 0.3f ? AndroidUtilities.lerp(particle3.fromY, particle3.toY1, cubicBezierInterpolator.getInterpolation(f / 0.3f)) : AndroidUtilities.lerp(particle3.toY1, particle3.toY2, CubicBezierInterpolator.EASE_IN.getInterpolation((f - 0.3f) / 0.7f));
            float fLerp3 = AndroidUtilities.lerp(particle3.fromSize, particle3.toSize, interpolation);
            if (animatedEmojiEffect.longAnimation) {
                fClamp = 1.0f;
            } else {
                float fHeight = animatedEmojiEffect.bounds.height() * 0.8f;
                if (fLerp2 > fHeight) {
                    fClamp = 1.0f - Utilities.clamp((fLerp2 - fHeight) / AndroidUtilities.dp(16.0f), 1.0f, 0.0f);
                } else {
                    fClamp = 1.0f;
                }
            }
            float f2 = (fLerp3 / 2.0f) * fClamp;
            canvas.save();
            if (particle3.mirror) {
                canvas.scale(-1.0f, 1.0f, fLerp, fLerp2);
            }
            canvas.rotate(particle3.randomRotation, fLerp, fLerp2);
            float fClamp3 = Utilities.clamp(particle3.progress / 0.2f, 1.0f, 0.0f);
            AnimatedEmojiDrawable animatedEmojiDrawable = animatedEmojiEffect.animatedEmojiDrawable;
            animatedEmojiDrawable.setAlpha((int) (fClamp3 * fClamp * 255.0f));
            animatedEmojiDrawable.setBounds((int) (fLerp - f2), (int) (fLerp2 - f2), (int) (fLerp + f2), (int) (fLerp2 + f2));
            animatedEmojiDrawable.draw(canvas);
            animatedEmojiDrawable.setAlpha(255);
            canvas.restore();
            if (((Particle) arrayList.get(i2)).progress >= 1.0f) {
                arrayList.remove(i2);
                i2--;
            }
            i2++;
        }
        canvas.restore();
        View view = this.parentView;
        if (view != null) {
            view.invalidate();
        }
        this.firsDraw = false;
    }

    public final void removeView(View view) {
        this.animatedEmojiDrawable.removeView(view);
        ImageReceiver imageReceiver = this.effectImageReceiver;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
            imageReceiver.clearImage();
        }
    }

    public final void setView(View view) {
        boolean z;
        boolean z2;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
        animatedEmojiDrawable.addView(view);
        this.parentView = view;
        ImageReceiver imageReceiver = this.effectImageReceiver;
        if (imageReceiver == null || !this.showGeneric) {
            return;
        }
        imageReceiver.onAttachedToWindow();
        TLRPC.Document document2 = animatedEmojiDrawable.document;
        TLRPC.TL_messages_stickerSet stickerSetByName = null;
        String strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document2, null);
        boolean z3 = this.longAnimation;
        int i = this.currentAccount;
        if (strFindAnimatedEmojiEmoticon == null || (tL_availableReaction = MediaDataController.getInstance(i).getReactionsMap().get(strFindAnimatedEmojiEmoticon)) == null || (document = tL_availableReaction.around_animation) == null) {
            z = true;
            z2 = false;
        } else {
            if (z3) {
                StringBuilder sb = new StringBuilder();
                int i2 = currentIndex;
                currentIndex = i2 + 1;
                sb.append(i2);
                sb.append(" ");
                imageReceiver.setUniqKeyPrefix(sb.toString());
                int filterWidth = EmojiAnimationsOverlay.getFilterWidth();
                TLRPC.Document document3 = tL_availableReaction.around_animation;
                z = true;
                imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), filterWidth + "_" + filterWidth + "_pcache_compress", null, null, document3, 0);
            } else {
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                String filterForAroundAnimation = ReactionsEffectOverlay.getFilterForAroundAnimation();
                TLRPC.Document document4 = tL_availableReaction.around_animation;
                z = true;
                imageReceiver.setImage(forDocument, filterForAroundAnimation, null, null, document4, 0);
            }
            z2 = true;
        }
        if (!z2) {
            String str = UserConfig.getInstance(i).genericAnimationsStickerPack;
            if (str != null && (stickerSetByName = MediaDataController.getInstance(i).getStickerSetByName(str)) == null) {
                stickerSetByName = MediaDataController.getInstance(i).getStickerSetByEmojiOrName(str);
            }
            if (stickerSetByName != null) {
                if (this.animationIndex < 0) {
                    this.animationIndex = Math.abs(Utilities.fastRandom.nextInt() % stickerSetByName.documents.size());
                }
                if (z3) {
                    StringBuilder sb2 = new StringBuilder();
                    int i3 = currentIndex;
                    currentIndex = i3 + 1;
                    sb2.append(i3);
                    sb2.append(" ");
                    imageReceiver.setUniqKeyPrefix(sb2.toString());
                    int filterWidth2 = EmojiAnimationsOverlay.getFilterWidth();
                    imageReceiver.setImage(ImageLocation.getForDocument(stickerSetByName.documents.get(this.animationIndex)), filterWidth2 + "_" + filterWidth2 + "_pcache_compress", null, null, stickerSetByName.documents.get(this.animationIndex), 0);
                } else {
                    imageReceiver.setImage(ImageLocation.getForDocument(stickerSetByName.documents.get(this.animationIndex)), "60_60", null, null, stickerSetByName.documents.get(this.animationIndex), 0);
                }
                z2 = true;
            }
        }
        if (!z2) {
            int i4 = R.raw.custom_emoji_reaction;
            imageReceiver.setImageBitmap(new RLottieDrawable(i4, SurfaceContainer$$ExternalSyntheticOutline0.m(i4, ""), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null));
        } else {
            if (imageReceiver.getLottieAnimation() != null) {
                imageReceiver.getLottieAnimation().setCurrentFrame(0, false, z);
            }
            imageReceiver.setAutoRepeat(0);
        }
    }
}
