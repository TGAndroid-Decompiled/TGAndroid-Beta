package org.telegram.ui.Components.Premium;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$TL_availableReaction;
import org.telegram.ui.Components.Premium.CarouselView;
import org.telegram.ui.Components.Reactions.ReactionsEffectOverlay;

public class UnlockPremiumReactionsWindow$ReactionDrawingObject extends CarouselView.DrawingObject {
    private View parentView;
    TLRPC$TL_availableReaction reaction;
    private boolean selected;
    private float selectedProgress;
    ImageReceiver imageReceiver = new ImageReceiver();
    ImageReceiver actionReceiver = new ImageReceiver();
    ImageReceiver effectImageReceiver = new ImageReceiver();
    Rect rect = new Rect();

    public UnlockPremiumReactionsWindow$ReactionDrawingObject(int i) {
    }

    @Override
    public void onAttachToWindow(View view, int i) {
        this.parentView = view;
        if (i == 0) {
            this.imageReceiver.setParentView(view);
            this.imageReceiver.onAttachedToWindow();
            this.imageReceiver.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
            this.imageReceiver.setImage(ImageLocation.getForDocument(this.reaction.appear_animation), "60_60_nolimit", null, null, DocumentObject.getSvgThumb(this.reaction.activate_animation, "windowBackgroundGray", 0.5f), 0L, "tgs", this.reaction, 0);
            this.imageReceiver.setAutoRepeat(0);
            if (this.imageReceiver.getLottieAnimation() != null) {
                this.imageReceiver.getLottieAnimation().setCurrentFrame(0, false);
            }
            this.imageReceiver.startAnimation();
            return;
        }
        this.effectImageReceiver.setParentView(view);
        this.effectImageReceiver.onAttachedToWindow();
        this.effectImageReceiver.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        this.actionReceiver.setParentView(view);
        this.actionReceiver.onAttachedToWindow();
        this.actionReceiver.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        this.effectImageReceiver.setAllowStartLottieAnimation(false);
        int sizeForBigReaction = ReactionsEffectOverlay.sizeForBigReaction();
        ImageReceiver imageReceiver = this.effectImageReceiver;
        ImageLocation forDocument = ImageLocation.getForDocument(this.reaction.around_animation);
        imageReceiver.setImage(forDocument, sizeForBigReaction + "_" + sizeForBigReaction + "_pcache", null, null, null, 0L, "tgs", this.reaction, 0);
        this.effectImageReceiver.setAutoRepeat(0);
        if (this.effectImageReceiver.getLottieAnimation() != null) {
            this.effectImageReceiver.getLottieAnimation().setCurrentFrame(0, false);
            this.effectImageReceiver.getLottieAnimation().stop();
        }
        this.actionReceiver.setAllowStartLottieAnimation(false);
        this.actionReceiver.setImage(ImageLocation.getForDocument(this.reaction.activate_animation), "60_60_nolimit", null, null, null, 0L, "tgs", this.reaction, 0);
        this.actionReceiver.setAutoRepeat(0);
        if (this.actionReceiver.getLottieAnimation() != null) {
            this.actionReceiver.getLottieAnimation().setCurrentFrame(0, false);
            this.actionReceiver.getLottieAnimation().stop();
        }
    }

    @Override
    public void onDetachFromWindow() {
        this.imageReceiver.onDetachedFromWindow();
        this.imageReceiver.setParentView(null);
        this.effectImageReceiver.onDetachedFromWindow();
        this.effectImageReceiver.setParentView(null);
        this.actionReceiver.onDetachedFromWindow();
        this.actionReceiver.setParentView(null);
    }

    @Override
    public void draw(Canvas canvas, float f, float f2, float f3) {
        int dp = (int) (AndroidUtilities.dp(350.0f) * f3);
        float dp2 = (int) (AndroidUtilities.dp(120.0f) * f3);
        float f4 = dp2 / 2.0f;
        float f5 = f - f4;
        float f6 = f2 - f4;
        this.rect.set((int) f5, (int) f6, (int) (f + f4), (int) (f4 + f2));
        this.imageReceiver.setImageCoords(f5, f6, dp2, dp2);
        this.actionReceiver.setImageCoords(f5, f6, dp2, dp2);
        if (this.selected || this.selectedProgress != 0.0f) {
            float f7 = dp;
            float f8 = f7 / 2.0f;
            this.effectImageReceiver.setImageCoords(f - f8, f2 - f8, f7, f7);
            this.effectImageReceiver.setAlpha(this.selectedProgress);
            float f9 = this.selectedProgress;
            if (f9 != 1.0f) {
                float f10 = (f9 * 0.3f) + 0.7f;
                canvas.save();
                canvas.scale(f10, f10, f, f2);
                this.effectImageReceiver.draw(canvas);
                canvas.restore();
            } else {
                this.effectImageReceiver.draw(canvas);
            }
            if (this.selected && this.effectImageReceiver.getLottieAnimation() != null && !this.effectImageReceiver.getLottieAnimation().isRunning() && !this.effectImageReceiver.getLottieAnimation().isLastFrame()) {
                this.effectImageReceiver.getLottieAnimation().start();
            }
            if (this.selected && this.effectImageReceiver.getLottieAnimation() != null && !this.effectImageReceiver.getLottieAnimation().isRunning() && this.effectImageReceiver.getLottieAnimation().isLastFrame()) {
                this.selected = false;
            }
            boolean z = this.selected;
            if (z) {
                float f11 = this.selectedProgress;
                if (f11 != 1.0f) {
                    float f12 = f11 + 0.08f;
                    this.selectedProgress = f12;
                    if (f12 > 1.0f) {
                        this.selectedProgress = 1.0f;
                    }
                }
            }
            if (!z) {
                float f13 = this.selectedProgress - 0.08f;
                this.selectedProgress = f13;
                if (f13 < 0.0f) {
                    this.selectedProgress = 0.0f;
                }
            }
        }
        if (this.actionReceiver.getLottieAnimation() == null || !this.actionReceiver.getLottieAnimation().hasBitmap()) {
            this.imageReceiver.draw(canvas);
            return;
        }
        this.actionReceiver.draw(canvas);
        if (this.actionReceiver.getLottieAnimation() != null && this.actionReceiver.getLottieAnimation().isLastFrame()) {
            this.selected = false;
        } else if (this.selected && this.actionReceiver.getLottieAnimation() != null && !this.actionReceiver.getLottieAnimation().isRunning()) {
            this.actionReceiver.getLottieAnimation().start();
        }
    }

    @Override
    public boolean checkTap(float f, float f2) {
        if (!this.rect.contains((int) f, (int) f2)) {
            return false;
        }
        select();
        return true;
    }

    @Override
    public void select() {
        if (!this.selected) {
            this.selected = true;
            if (this.selectedProgress == 0.0f) {
                this.selectedProgress = 1.0f;
            }
            System.currentTimeMillis();
            if (this.effectImageReceiver.getLottieAnimation() != null) {
                this.effectImageReceiver.getLottieAnimation().setCurrentFrame(0, false);
                this.effectImageReceiver.getLottieAnimation().start();
            }
            if (this.actionReceiver.getLottieAnimation() != null) {
                this.actionReceiver.getLottieAnimation().setCurrentFrame(0, false);
                this.actionReceiver.getLottieAnimation().start();
            }
            this.parentView.invalidate();
        }
    }

    @Override
    public void hideAnimation() {
        super.hideAnimation();
        this.selected = false;
    }

    public void set(TLRPC$TL_availableReaction tLRPC$TL_availableReaction) {
        this.reaction = tLRPC$TL_availableReaction;
    }
}
