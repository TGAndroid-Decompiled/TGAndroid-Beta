package org.telegram.ui.Stars;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
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

        public boolean equals(Gift gift) {
            return gift != null && gift.id == this.id;
        }
    }

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

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == this.dialogId) {
            update();
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float min;
        float dp;
        float f4;
        float f5;
        float f6;
        Canvas canvas2;
        if (this.gifts.isEmpty()) {
            return;
        }
        float f7 = 1.0f;
        if (this.expandProgress >= 1.0f) {
            return;
        }
        float x = this.avatarContainer.getX();
        float y = this.avatarContainer.getY();
        float width = this.avatarContainer.getWidth() * this.avatarContainer.getScaleX();
        float height = this.avatarContainer.getHeight() * this.avatarContainer.getScaleY();
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.expandY);
        float f8 = x + (width / 2.0f);
        float min2 = Math.min(f8, AndroidUtilities.dp(48.0f));
        float f9 = y + (height / 2.0f);
        float min3 = (Math.min(width, height) / 2.0f) + AndroidUtilities.dp(6.0f);
        float clamp01 = Utilities.clamp01((this.expandY - (AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight())) / AndroidUtilities.dp(50.0f));
        int i = 0;
        while (i < this.gifts.size()) {
            Gift gift = (Gift) this.gifts.get(i);
            float f10 = gift.animatedFloat.set(f7);
            float lerp = AndroidUtilities.lerp(0.5f, f7, f10);
            if (i == 0) {
                double d = f8;
                float f11 = f9;
                double d2 = min3;
                double cos = Math.cos(-1.1344639929903682d);
                Double.isNaN(d2);
                Double.isNaN(d);
                min = (float) (d + (cos * d2));
                f2 = clamp01;
                f = min3;
                double d3 = f11;
                double sin = Math.sin(-1.1344639929903682d);
                Double.isNaN(d2);
                Double.isNaN(d3);
                dp = (float) (d3 + (d2 * sin));
                float f12 = (1.0f - this.expandProgress) * f10;
                f6 = AndroidUtilities.lerp(0.9f, 0.25f, this.actionBarProgress);
                canvas2 = canvas;
                f3 = f11;
                f5 = 25.0f;
                f4 = f12;
            } else {
                f = min3;
                f2 = clamp01;
                f3 = f9;
                if (i == 1) {
                    min = min2 + Math.min(getWidth() * 0.33f, AndroidUtilities.dp(74.0f));
                    dp = f3 - AndroidUtilities.dp(52.0f);
                    f4 = f10 * f10 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * f2;
                    f5 = -12.0f;
                } else if (i == 2) {
                    min = min2 + Math.min(getWidth() * 0.81f, AndroidUtilities.dp(183.0f));
                    dp = f3 - AndroidUtilities.dp(72.0f);
                    f4 = f10 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * f2;
                    f5 = 8.0f;
                } else if (i == 3) {
                    min = min2 + Math.min(getWidth() * 0.6f, AndroidUtilities.dp(136.0f));
                    dp = f3 - AndroidUtilities.dp(46.0f);
                    f4 = f10 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * f2;
                    f5 = 3.0f;
                } else if (i == 4) {
                    min = min2 + Math.min(getWidth() * 0.08f, AndroidUtilities.dp(21.6f));
                    dp = f3 - AndroidUtilities.dp(82.0f);
                    f4 = f10 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * f2;
                    f5 = -3.0f;
                } else if (i == 5) {
                    min = min2 + Math.min(getWidth() * 0.89f, AndroidUtilities.dp(237.0f));
                    dp = f3 - AndroidUtilities.dp(42.33f);
                    f4 = f10 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * f2;
                    f5 = 2.0f;
                } else if (i == 6) {
                    min = min2 + Math.min(getWidth() * 0.38f, AndroidUtilities.dp(102.0f));
                    dp = this.expandY - AndroidUtilities.dp(12.0f);
                    f4 = f10 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * f2;
                    f5 = 0.0f;
                } else if (i == 7) {
                    min = min2 + Math.min(getWidth() * 0.135f, AndroidUtilities.dp(36.0f));
                    dp = this.expandY - AndroidUtilities.dp(17.6f);
                    f4 = f10 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * f2;
                    f5 = -5.0f;
                } else {
                    if (i == 8) {
                        gift.draw(canvas, min2 + Math.min(getWidth() * 0.76f, AndroidUtilities.dp(178.0f)), this.expandY - AndroidUtilities.dp(21.66f), lerp, 5.0f, f10 * (1.0f - this.expandProgress) * (1.0f - this.actionBarProgress) * f2, 1.0f);
                        i++;
                        f9 = f3;
                        min3 = f;
                        clamp01 = f2;
                        f7 = 1.0f;
                    }
                    i++;
                    f9 = f3;
                    min3 = f;
                    clamp01 = f2;
                    f7 = 1.0f;
                }
                f6 = 1.0f;
                canvas2 = canvas;
            }
            gift.draw(canvas2, min, dp, lerp, f5, f4, f6);
            i++;
            f9 = f3;
            min3 = f;
            clamp01 = f2;
            f7 = 1.0f;
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

    public void onGiftClick(Gift gift) {
        Browser.openUrl(getContext(), "https://t.me/nft/" + gift.slug);
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.ProfileGiftsView.onTouchEvent(android.view.MotionEvent):boolean");
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

    public void setExpandProgress(float f) {
        if (this.expandProgress != f) {
            this.expandProgress = f;
            invalidate();
        }
    }

    public void setProgressToStoriesInsets(float f) {
        if (this.progressToInsets == f) {
            return;
        }
        this.progressToInsets = f;
        invalidate();
    }

    public void update() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stars.ProfileGiftsView.update():void");
    }
}
