package org.telegram.ui.Components.Reactions;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
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
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$TL_availableReaction;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.EmojiAnimationsOverlay;

public class AnimatedEmojiEffect {
    private static int currentIndex;
    public AnimatedEmojiDrawable animatedEmojiDrawable;
    int currentAccount;
    ImageReceiver effectImageReceiver;
    long lastGenerateTime;
    boolean longAnimation;
    View parentView;
    boolean showGeneric;
    Rect bounds = new Rect();
    ArrayList<Particle> particles = new ArrayList<>();
    boolean firsDraw = true;
    int animationIndex = -1;
    long startTime = System.currentTimeMillis();

    private AnimatedEmojiEffect(AnimatedEmojiDrawable animatedEmojiDrawable, int i, boolean z, boolean z2) {
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

    public static AnimatedEmojiEffect createFrom(AnimatedEmojiDrawable animatedEmojiDrawable, boolean z, boolean z2) {
        return new AnimatedEmojiEffect(animatedEmojiDrawable, UserConfig.selectedAccount, z, z2);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        this.bounds.set(i, i2, i3, i4);
        ImageReceiver imageReceiver = this.effectImageReceiver;
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(this.bounds);
        }
    }

    public void draw(Canvas canvas) {
        if (!this.longAnimation) {
            if (this.firsDraw) {
                for (int i = 0; i < 7; i++) {
                    Particle particle = new Particle();
                    particle.generate();
                    this.particles.add(particle);
                }
            }
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.particles.size() < 12) {
                long j = this.startTime;
                if (currentTimeMillis - j < 1500 && currentTimeMillis - j > 200 && currentTimeMillis - this.lastGenerateTime > 50 && Utilities.fastRandom.nextInt() % 6 == 0) {
                    Particle particle2 = new Particle();
                    particle2.generate();
                    this.particles.add(particle2);
                    this.lastGenerateTime = currentTimeMillis;
                }
            }
        }
        ImageReceiver imageReceiver = this.effectImageReceiver;
        if (imageReceiver != null && this.showGeneric) {
            if (!(imageReceiver.getLottieAnimation() != null && this.effectImageReceiver.getLottieAnimation().isLastFrame())) {
                if (this.longAnimation) {
                    canvas.save();
                    canvas.translate(this.bounds.width() / 3.0f, 0.0f);
                    this.effectImageReceiver.draw(canvas);
                    canvas.restore();
                } else {
                    this.effectImageReceiver.draw(canvas);
                }
            }
        }
        canvas.save();
        Rect rect = this.bounds;
        canvas.translate(rect.left, rect.top);
        int i2 = 0;
        while (i2 < this.particles.size()) {
            this.particles.get(i2).draw(canvas);
            if (this.particles.get(i2).progress >= 1.0f) {
                this.particles.remove(i2);
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

    public boolean isDone() {
        return System.currentTimeMillis() - this.startTime > 2500;
    }

    public void setView(View view) {
        boolean z;
        TLRPC$TL_availableReaction tLRPC$TL_availableReaction;
        TLRPC$Document tLRPC$Document;
        this.animatedEmojiDrawable.addView(view);
        this.parentView = view;
        ImageReceiver imageReceiver = this.effectImageReceiver;
        if (imageReceiver == null || !this.showGeneric) {
            return;
        }
        imageReceiver.onAttachedToWindow();
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = null;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(this.animatedEmojiDrawable.getDocument(), null);
        if (findAnimatedEmojiEmoticon == null || (tLRPC$TL_availableReaction = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get(findAnimatedEmojiEmoticon)) == null || (tLRPC$Document = tLRPC$TL_availableReaction.around_animation) == null) {
            z = false;
        } else {
            if (this.longAnimation) {
                ImageReceiver imageReceiver2 = this.effectImageReceiver;
                StringBuilder sb = new StringBuilder();
                int i = currentIndex;
                currentIndex = i + 1;
                sb.append(i);
                sb.append(" ");
                imageReceiver2.setUniqKeyPrefix(sb.toString());
                int filterWidth = EmojiAnimationsOverlay.getFilterWidth();
                this.effectImageReceiver.setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.around_animation), filterWidth + "_" + filterWidth + "_pcache_compress", null, null, tLRPC$TL_availableReaction.around_animation, 0);
            } else {
                this.effectImageReceiver.setImage(ImageLocation.getForDocument(tLRPC$Document), ReactionsEffectOverlay.getFilterForAroundAnimation(), null, null, tLRPC$TL_availableReaction.around_animation, 0);
            }
            z = true;
        }
        if (!z) {
            String str = UserConfig.getInstance(this.currentAccount).genericAnimationsStickerPack;
            if (str != null && (tLRPC$TL_messages_stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSetByName(str)) == null) {
                tLRPC$TL_messages_stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSetByEmojiOrName(str);
            }
            if (tLRPC$TL_messages_stickerSet != null) {
                if (this.animationIndex < 0) {
                    this.animationIndex = Math.abs(Utilities.fastRandom.nextInt() % tLRPC$TL_messages_stickerSet.documents.size());
                }
                if (this.longAnimation) {
                    ImageReceiver imageReceiver3 = this.effectImageReceiver;
                    StringBuilder sb2 = new StringBuilder();
                    int i2 = currentIndex;
                    currentIndex = i2 + 1;
                    sb2.append(i2);
                    sb2.append(" ");
                    imageReceiver3.setUniqKeyPrefix(sb2.toString());
                    int filterWidth2 = EmojiAnimationsOverlay.getFilterWidth();
                    this.effectImageReceiver.setImage(ImageLocation.getForDocument(tLRPC$TL_messages_stickerSet.documents.get(this.animationIndex)), filterWidth2 + "_" + filterWidth2 + "_pcache_compress", null, null, tLRPC$TL_messages_stickerSet.documents.get(this.animationIndex), 0);
                } else {
                    this.effectImageReceiver.setImage(ImageLocation.getForDocument(tLRPC$TL_messages_stickerSet.documents.get(this.animationIndex)), "60_60", null, null, tLRPC$TL_messages_stickerSet.documents.get(this.animationIndex), 0);
                }
                z = true;
            }
        }
        if (z) {
            if (this.effectImageReceiver.getLottieAnimation() != null) {
                this.effectImageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
            }
            this.effectImageReceiver.setAutoRepeat(0);
        } else {
            int i3 = R.raw.custom_emoji_reaction;
            this.effectImageReceiver.setImageBitmap(new RLottieDrawable(i3, "" + i3, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null));
        }
    }

    public void removeView(View view) {
        this.animatedEmojiDrawable.removeView(view);
        ImageReceiver imageReceiver = this.effectImageReceiver;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
            this.effectImageReceiver.clearImage();
        }
    }

    public class Particle {
        long duration;
        float fromSize;
        float fromX;
        float fromY;
        boolean mirror;
        float progress;
        float randomRotation;
        float toSize;
        float toX;
        float toY1;
        float toY2;

        private Particle() {
        }

        public void generate() {
            float f = 0.0f;
            this.progress = 0.0f;
            float randX = randX();
            float randY = randY();
            for (int i = 0; i < 20; i++) {
                float randX2 = randX();
                float randY2 = randY();
                float f2 = 2.1474836E9f;
                for (int i2 = 0; i2 < AnimatedEmojiEffect.this.particles.size(); i2++) {
                    float f3 = AnimatedEmojiEffect.this.particles.get(i2).toX - randX2;
                    float f4 = AnimatedEmojiEffect.this.particles.get(i2).toY1 - randY2;
                    float f5 = (f3 * f3) + (f4 * f4);
                    if (f5 < f2) {
                        f2 = f5;
                    }
                }
                if (f2 > f) {
                    randX = randX2;
                    randY = randY2;
                    f = f2;
                }
            }
            float f6 = AnimatedEmojiEffect.this.longAnimation ? 0.8f : 0.5f;
            this.toX = randX;
            if (randX > r0.bounds.width() * f6) {
                this.fromX = AnimatedEmojiEffect.this.bounds.width() * f6;
            } else {
                float width = AnimatedEmojiEffect.this.bounds.width() * f6;
                this.fromX = width;
                if (this.toX > width) {
                    this.toX = width - 0.1f;
                }
            }
            this.fromY = (AnimatedEmojiEffect.this.bounds.height() * 0.45f) + (AnimatedEmojiEffect.this.bounds.height() * 0.1f * (Math.abs(Utilities.fastRandom.nextInt() % 100) / 100.0f));
            if (AnimatedEmojiEffect.this.longAnimation) {
                float width2 = (r0.bounds.width() * 0.05f) + (AnimatedEmojiEffect.this.bounds.width() * 0.1f * (Math.abs(Utilities.fastRandom.nextInt() % 100) / 100.0f));
                this.fromSize = width2;
                this.toSize = width2 * (((Math.abs(Utilities.fastRandom.nextInt() % 100) / 100.0f) * 1.5f) + 1.5f);
                this.toY1 = (this.fromSize / 2.0f) + (AnimatedEmojiEffect.this.bounds.height() * 0.1f * (Math.abs(Utilities.fastRandom.nextInt() % 100) / 100.0f));
                this.toY2 = AnimatedEmojiEffect.this.bounds.height() + this.fromSize;
                this.duration = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
            } else {
                float width3 = (r0.bounds.width() * 0.05f) + (AnimatedEmojiEffect.this.bounds.width() * 0.1f * (Math.abs(Utilities.fastRandom.nextInt() % 100) / 100.0f));
                this.fromSize = width3;
                this.toSize = width3 * (((Math.abs(Utilities.fastRandom.nextInt() % 100) / 100.0f) * 0.5f) + 1.5f);
                this.toY1 = randY;
                this.toY2 = randY + AnimatedEmojiEffect.this.bounds.height();
                this.duration = 1800L;
            }
            this.duration = ((float) this.duration) / 1.75f;
            this.mirror = Utilities.fastRandom.nextBoolean();
            this.randomRotation = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
        }

        private float randY() {
            return AnimatedEmojiEffect.this.bounds.height() * 0.5f * (Math.abs(Utilities.fastRandom.nextInt() % 100) / 100.0f);
        }

        private float randX() {
            if (AnimatedEmojiEffect.this.longAnimation) {
                return (r0.bounds.width() * (-0.25f)) + (AnimatedEmojiEffect.this.bounds.width() * 1.5f * (Math.abs(Utilities.fastRandom.nextInt() % 100) / 100.0f));
            }
            return r0.bounds.width() * (Math.abs(Utilities.fastRandom.nextInt() % 100) / 100.0f);
        }

        public void draw(android.graphics.Canvas r11) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Reactions.AnimatedEmojiEffect.Particle.draw(android.graphics.Canvas):void");
        }
    }
}
