package org.telegram.ui.Stars;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarsController;

public class ProfileGiftsView extends View implements NotificationCenter.NotificationCenterDelegate {
    private float actionBarProgress;
    public final AnimatedFloat animatedCount;
    private final View avatarContainer;
    private final ProfileActivity.AvatarImageView avatarImage;
    private final int currentAccount;
    private float cy;
    private final long dialogId;
    private float expandProgress;
    private float expandRight;
    private boolean expandRightPad;
    private final AnimatedFloat expandRightPadAnimated;
    private float expandY;
    public final HashSet giftIds;
    public final ArrayList gifts;
    private float left;
    private StarsController.GiftsList list;
    public int maxCount;
    public final ArrayList oldGifts;
    private Gift pressedGift;
    private float progressToInsets;
    private final Theme.ResourcesProvider resourcesProvider;
    private float right;
    private final AnimatedFloat rightAnimated;

    public ProfileGiftsView(Context context, int i, long j, View view, ProfileActivity.AvatarImageView avatarImageView, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.expandRightPadAnimated = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.rightAnimated = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.progressToInsets = 1.0f;
        this.oldGifts = new ArrayList();
        this.gifts = new ArrayList();
        this.giftIds = new HashSet();
        this.animatedCount = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
        this.currentAccount = i;
        this.dialogId = j;
        this.avatarContainer = view;
        this.avatarImage = avatarImageView;
        this.resourcesProvider = resourcesProvider;
    }

    public void setExpandProgress(float f) {
        if (this.expandProgress != f) {
            this.expandProgress = f;
            invalidate();
        }
    }

    public void setActionBarActionMode(float f) {
        this.actionBarProgress = f;
        invalidate();
    }

    public void setBounds(float f, float f2, float f3, boolean z) {
        boolean z2 = Math.abs(f - this.left) > 0.1f || Math.abs(f2 - this.right) > 0.1f || Math.abs(f3 - this.cy) > 0.1f;
        this.left = f;
        this.right = f2;
        if (!z) {
            this.rightAnimated.set(f2, true);
        }
        this.cy = f3;
        if (z2) {
            invalidate();
        }
    }

    public void setExpandCoords(float f, boolean z, float f2) {
        this.expandRight = f;
        this.expandRightPad = z;
        this.expandY = f2;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f) {
        if (this.progressToInsets == f) {
            return;
        }
        this.progressToInsets = f;
        invalidate();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        Iterator it = this.gifts.iterator();
        while (it.hasNext()) {
            ((Gift) it.next()).emojiDrawable.addView(this);
        }
        update();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        Iterator it = this.gifts.iterator();
        while (it.hasNext()) {
            ((Gift) it.next()).emojiDrawable.removeView(this);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == this.dialogId) {
            update();
        }
    }

    public final class Gift {
        public AnimatedFloat animatedFloat;
        public final ButtonBounce bounce;
        public final int color;
        public final TLRPC.Document document;
        public final long documentId;
        public AnimatedEmojiDrawable emojiDrawable;
        public RadialGradient gradient;
        public Paint gradientPaint;
        public final long id;
        public final String slug;
        public final Matrix gradientMatrix = new Matrix();
        public final RectF bounds = new RectF();

        public Gift(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
            this.bounce = new ButtonBounce(ProfileGiftsView.this);
            this.id = tL_starGiftUnique.id;
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            this.document = document;
            this.documentId = document == null ? 0L : document.id;
            this.color = ((TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
            this.slug = tL_starGiftUnique.slug;
        }

        public boolean equals(Gift gift) {
            return gift != null && gift.id == this.id;
        }

        public void copy(Gift gift) {
            this.gradient = gift.gradient;
            this.emojiDrawable = gift.emojiDrawable;
            this.gradientPaint = gift.gradientPaint;
            this.animatedFloat = gift.animatedFloat;
        }

        public void draw(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6) {
            if (f5 <= 0.0f) {
                return;
            }
            float dp = AndroidUtilities.dp(45.0f);
            float f7 = dp / 2.0f;
            this.bounds.set(f - f7, f2 - f7, f + f7, f2 + f7);
            canvas.save();
            canvas.translate(f, f2);
            canvas.rotate(f4);
            float scale = this.bounce.getScale(0.1f) * f3;
            canvas.scale(scale, scale);
            Paint paint = this.gradientPaint;
            if (paint != null) {
                paint.setAlpha((int) (f5 * 255.0f * f6));
                float f8 = (-dp) / 2.0f;
                canvas.drawRect(f8, f8, f7, f7, this.gradientPaint);
            }
            if (this.emojiDrawable != null) {
                int dp2 = AndroidUtilities.dp(24.0f);
                int i = (-dp2) / 2;
                int i2 = dp2 / 2;
                this.emojiDrawable.setBounds(i, i, i2, i2);
                this.emojiDrawable.setAlpha((int) (f5 * 255.0f));
                this.emojiDrawable.draw(canvas);
            }
            canvas.restore();
        }
    }

    public void update() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.ProfileGiftsView.update():void");
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        if (this.gifts.isEmpty()) {
            return;
        }
        float f3 = 1.0f;
        if (this.expandProgress >= 1.0f) {
            return;
        }
        float x = this.avatarContainer.getX();
        float y = this.avatarContainer.getY();
        float width = this.avatarContainer.getWidth() * this.avatarContainer.getScaleX();
        float height = this.avatarContainer.getHeight() * this.avatarContainer.getScaleY();
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.expandY);
        float f4 = x + (width / 2.0f);
        float min = Math.min(f4, AndroidUtilities.dp(48.0f));
        float f5 = y + (height / 2.0f);
        float min2 = (Math.min(width, height) / 2.0f) + AndroidUtilities.dp(6.0f);
        float width2 = getWidth() / 2.0f;
        float clamp01 = Utilities.clamp01((this.expandY - (AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight())) / AndroidUtilities.dp(50.0f));
        int i = 0;
        while (i < this.gifts.size()) {
            Gift gift = (Gift) this.gifts.get(i);
            float f6 = gift.animatedFloat.set(f3);
            float lerp = AndroidUtilities.lerp(0.5f, f3, f6);
            if (i == 0) {
                float f7 = f5;
                double d = min2;
                f = min2;
                f2 = f7;
                gift.draw(canvas, (float) (f4 + (Math.cos(-1.1344639929903682d) * d)), (float) (f7 + (d * Math.sin(-1.1344639929903682d))), lerp, 25.0f, (1.0f - this.expandProgress) * f6, AndroidUtilities.lerp(0.9f, 0.25f, this.actionBarProgress));
                width2 = width2;
            } else {
                f = min2;
                float f8 = width2;
                f2 = f5;
                if (i == 1) {
                    width2 = f8;
                    gift.draw(canvas, AndroidUtilities.lerp(Math.min(getWidth() * 0.27f, AndroidUtilities.dp(62.0f)) + min, width2, this.actionBarProgress * 0.5f), f2 - AndroidUtilities.dp(52.0f), lerp, -4.0f, f6 * f6 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * clamp01, 1.0f);
                } else {
                    width2 = f8;
                    if (i == 2) {
                        gift.draw(canvas, AndroidUtilities.lerp(Math.min(getWidth() * 0.46f, AndroidUtilities.dp(105.0f)) + min, width2, this.actionBarProgress * 0.5f), f2 - AndroidUtilities.dp(72.0f), lerp, 8.0f, f6 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * clamp01, 1.0f);
                    } else if (i == 3) {
                        gift.draw(canvas, AndroidUtilities.lerp(Math.min(getWidth() * 0.6f, AndroidUtilities.dp(136.0f)) + min, width2, this.actionBarProgress * 0.5f), f2 - AndroidUtilities.dp(46.0f), lerp, 3.0f, f6 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * clamp01, 1.0f);
                    } else if (i == 4) {
                        gift.draw(canvas, AndroidUtilities.lerp(Math.min(getWidth() * 0.08f, AndroidUtilities.dp(21.6f)) + min, width2, this.actionBarProgress * 0.5f), f2 - AndroidUtilities.dp(82.0f), lerp, -3.0f, f6 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * clamp01, 1.0f);
                    } else if (i == 5) {
                        gift.draw(canvas, AndroidUtilities.lerp(Math.min(getWidth() * 0.745f, AndroidUtilities.dp(186.0f)) + min, width2, this.actionBarProgress * 0.5f), f2 - AndroidUtilities.dp(39.0f), lerp, 2.0f, f6 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * clamp01, 1.0f);
                    } else if (i == 6) {
                        gift.draw(canvas, min + Math.min(getWidth() * 0.38f, AndroidUtilities.dp(102.0f)), this.expandY - AndroidUtilities.dp(12.0f), lerp, 0.0f, f6 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * clamp01, 1.0f);
                    } else if (i == 7) {
                        gift.draw(canvas, min + Math.min(getWidth() * 0.135f, AndroidUtilities.dp(36.0f)), this.expandY - AndroidUtilities.dp(17.6f), lerp, -5.0f, f6 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * clamp01, 1.0f);
                    } else if (i == 8) {
                        gift.draw(canvas, min + Math.min(getWidth() * 0.76f, AndroidUtilities.dp(178.0f)), this.expandY - AndroidUtilities.dp(21.66f), lerp, 5.0f, f6 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * clamp01, 1.0f);
                        i++;
                        f5 = f2;
                        min2 = f;
                        f3 = 1.0f;
                    }
                }
            }
            i++;
            f5 = f2;
            min2 = f;
            f3 = 1.0f;
        }
        canvas.restore();
    }

    public Gift getGiftUnder(float f, float f2) {
        for (int i = 0; i < this.gifts.size(); i++) {
            if (((Gift) this.gifts.get(i)).bounds.contains(f, f2)) {
                return (Gift) this.gifts.get(i);
            }
        }
        return null;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Gift gift;
        Gift giftUnder = getGiftUnder(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            this.pressedGift = giftUnder;
            if (giftUnder != null) {
                giftUnder.bounce.setPressed(true);
            }
        } else if (motionEvent.getAction() == 2) {
            Gift gift2 = this.pressedGift;
            if (gift2 != giftUnder && gift2 != null) {
                gift2.bounce.setPressed(false);
                this.pressedGift = null;
            }
        } else if (motionEvent.getAction() == 1) {
            Gift gift3 = this.pressedGift;
            if (gift3 != null) {
                onGiftClick(gift3);
                this.pressedGift.bounce.setPressed(false);
                this.pressedGift = null;
            }
        } else if (motionEvent.getAction() == 3 && (gift = this.pressedGift) != null) {
            gift.bounce.setPressed(false);
            this.pressedGift = null;
        }
        return this.pressedGift != null;
    }

    public void onGiftClick(Gift gift) {
        Browser.openUrl(getContext(), "https://t.me/nft/" + gift.slug);
    }
}
