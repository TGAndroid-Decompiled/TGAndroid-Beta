package org.telegram.ui.Stars;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
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

public class ProfileGiftsView extends View implements NotificationCenter.NotificationCenterDelegate {
    private float actionBarProgress;
    private boolean active;
    private final View avatarContainer;
    private final ProfileActivity.AvatarImageView avatarImage;
    public float collapseProgress;
    private final int currentAccount;
    private float cy;
    private final long dialogId;
    public float expandProgress;
    private float expandY;
    private final TimeInterpolator giftCollapseXInterpolator;
    private final TimeInterpolator giftCollapseYInterpolator;
    public final HashSet giftIds;
    public final ArrayList gifts;
    public boolean isOpening;
    private float left;
    private StarsController.GiftsList list;
    public int maxCount;
    private float maxExpandY;
    public final ArrayList oldGifts;
    private Gift pressedGift;
    private float progressToInsets;
    private final Theme.ResourcesProvider resourcesProvider;
    private float right;
    private final AnimatedFloat rightAnimated;

    public void setActive(boolean z) {
        this.active = z;
    }

    public ProfileGiftsView(Context context, int i, long j, View view, ProfileActivity.AvatarImageView avatarImageView, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.active = true;
        this.rightAnimated = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.progressToInsets = 1.0f;
        this.oldGifts = new ArrayList();
        this.gifts = new ArrayList();
        this.giftIds = new HashSet();
        this.giftCollapseXInterpolator = new DecelerateInterpolator();
        this.giftCollapseYInterpolator = new LinearInterpolator();
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

    public void setCollapseProgress(float f, boolean z) {
        this.isOpening = z;
        float fClamp01 = Utilities.clamp01((f - 0.3f) / 0.7f);
        if (this.collapseProgress != fClamp01) {
            this.collapseProgress = fClamp01;
            invalidate();
        }
    }

    public void setActionBarActionMode(float f) {
        this.actionBarProgress = f;
        invalidate();
    }

    public void setBounds(float f, float f2, float f3, boolean z, int i) {
        boolean z2 = Math.abs(f - this.left) > 0.1f || Math.abs(f2 - this.right) > 0.1f || Math.abs(f3 - this.cy) > 0.1f;
        this.left = f;
        this.right = f2;
        if (!z) {
            this.rightAnimated.set(f2, true);
        }
        this.cy = f3;
        this.maxExpandY = i + f3;
        if (z2) {
            invalidate();
        }
    }

    public void setExpandCoords(float f) {
        this.expandY = f;
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
        private StarsReactionsSheet.Particles particles;
        public final String slug;
        public int position = -1;
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
            initParticles();
        }

        private void initParticles() {
            this.particles = new StarsReactionsSheet.Particles(1, 6);
            float fDp = AndroidUtilities.dp(36.0f);
            float f = (-fDp) / 2.0f;
            float f2 = fDp / 2.0f;
            this.particles.bounds.set(f, f, f2, f2);
        }

        public boolean equals(Gift gift) {
            return gift != null && gift.id == this.id;
        }

        public void copy(Gift gift) {
            this.gradient = gift.gradient;
            this.emojiDrawable = gift.emojiDrawable;
            this.gradientPaint = gift.gradientPaint;
            this.animatedFloat = gift.animatedFloat;
            this.particles = gift.particles;
            this.position = gift.position;
        }

        public void draw(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6) {
            if (f5 <= 0.0f) {
                return;
            }
            float fDp = AndroidUtilities.dp(45.0f);
            float f7 = fDp / 2.0f;
            this.bounds.set(f - f7, f2 - f7, f + f7, f2 + f7);
            canvas.save();
            canvas.translate(f, f2);
            canvas.rotate(f4);
            float scale = this.bounce.getScale(0.1f) * f3;
            canvas.scale(scale, scale);
            this.particles.process();
            this.particles.draw(canvas, this.color, f5);
            Paint paint = this.gradientPaint;
            if (paint != null) {
                paint.setAlpha((int) (f5 * 255.0f * f6));
                float f8 = (-fDp) / 2.0f;
                canvas.drawRect(f8, f8, f7, f7, this.gradientPaint);
            }
            if (this.emojiDrawable != null) {
                int iDp = AndroidUtilities.dp(24.0f);
                int i = (-iDp) / 2;
                int i2 = iDp / 2;
                this.emojiDrawable.setBounds(i, i, i2, i2);
                this.emojiDrawable.setAlpha((int) (f5 * 255.0f));
                this.emojiDrawable.draw(canvas);
            }
            canvas.restore();
        }
    }

    public void update() {
        TLRPC.EmojiStatus emojiStatus;
        boolean z;
        Gift gift;
        Gift gift2;
        if (MessagesController.getInstance(this.currentAccount).enableGiftsInProfile) {
            this.maxCount = MessagesController.getInstance(this.currentAccount).stargiftsPinnedToTopLimit;
            this.oldGifts.clear();
            this.oldGifts.addAll(this.gifts);
            this.gifts.clear();
            this.giftIds.clear();
            if (this.dialogId >= 0) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
                if (user == null) {
                    emojiStatus = null;
                } else {
                    emojiStatus = user.emoji_status;
                }
            } else {
                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(-this.dialogId));
                if (user2 == null) {
                    emojiStatus = null;
                } else {
                    emojiStatus = user2.emoji_status;
                }
            }
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                this.giftIds.add(Long.valueOf(((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id));
            }
            StarsController.GiftsList profileGiftsList = StarsController.getInstance(this.currentAccount).getProfileGiftsList(this.dialogId);
            this.list = profileGiftsList;
            if (profileGiftsList != null) {
                for (int i = 0; i < this.list.gifts.size(); i++) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.list.gifts.get(i);
                    if (!savedStarGift.unsaved && savedStarGift.pinned_to_top) {
                        TL_stars.StarGift starGift = savedStarGift.gift;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            Gift gift3 = new Gift((TL_stars.TL_starGiftUnique) starGift);
                            if (!this.giftIds.contains(Long.valueOf(gift3.id))) {
                                this.gifts.add(gift3);
                                this.giftIds.add(Long.valueOf(gift3.id));
                            }
                        }
                    }
                }
            }
            if (this.gifts.size() != this.oldGifts.size()) {
                z = true;
                break;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= this.gifts.size()) {
                    z = false;
                    break;
                } else {
                    if (!((Gift) this.gifts.get(i2)).equals((Gift) this.oldGifts.get(i2))) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            for (int i3 = 0; i3 < this.gifts.size(); i3++) {
                Gift gift4 = (Gift) this.gifts.get(i3);
                int i4 = 0;
                while (true) {
                    if (i4 >= this.oldGifts.size()) {
                        gift2 = null;
                        break;
                    } else {
                        if (((Gift) this.oldGifts.get(i4)).id == gift4.id) {
                            gift2 = (Gift) this.oldGifts.get(i4);
                            break;
                        }
                        i4++;
                    }
                }
                if (gift2 != null) {
                    gift4.copy(gift2);
                } else {
                    float fDp = AndroidUtilities.dp(22.5f);
                    int i5 = gift4.color;
                    gift4.gradient = new RadialGradient(0.0f, 0.0f, fDp, new int[]{i5, Theme.multAlpha(i5, 0.0f)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    Paint paint = new Paint(1);
                    gift4.gradientPaint = paint;
                    paint.setShader(gift4.gradient);
                    TLRPC.Document document = gift4.document;
                    if (document != null) {
                        gift4.emojiDrawable = AnimatedEmojiDrawable.make(this.currentAccount, 0, document);
                    } else {
                        gift4.emojiDrawable = AnimatedEmojiDrawable.make(this.currentAccount, 0, gift4.documentId);
                    }
                    AnimatedFloat animatedFloat = new AnimatedFloat(this, 0L, 320L, (TimeInterpolator) null);
                    gift4.animatedFloat = animatedFloat;
                    animatedFloat.force(0.0f);
                    if (isAttachedToWindow()) {
                        gift4.emojiDrawable.addView(this);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (int i6 = 0; i6 < this.maxCount; i6++) {
                arrayList.add(Integer.valueOf(i6));
            }
            for (int i7 = 0; i7 < this.oldGifts.size(); i7++) {
                Gift gift5 = (Gift) this.oldGifts.get(i7);
                int i8 = 0;
                while (true) {
                    if (i8 >= this.gifts.size()) {
                        gift = null;
                        break;
                    } else {
                        if (((Gift) this.gifts.get(i8)).id == gift5.id) {
                            gift = (Gift) this.gifts.get(i8);
                            break;
                        }
                        i8++;
                    }
                }
                if (gift == null) {
                    gift5.emojiDrawable.removeView(this);
                    gift5.emojiDrawable = null;
                    gift5.gradient = null;
                } else {
                    arrayList.remove(Integer.valueOf(gift5.position));
                }
            }
            if (!arrayList.isEmpty()) {
                BagRandomizer bagRandomizer = new BagRandomizer(arrayList);
                for (int i9 = 0; i9 < this.gifts.size(); i9++) {
                    Gift gift6 = (Gift) this.gifts.get(i9);
                    if (gift6.position == -1) {
                        gift6.position = ((Integer) bagRandomizer.next()).intValue();
                    }
                }
            }
            if (z) {
                invalidate();
            }
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float fDp;
        float fDp2;
        float fLerp;
        float f;
        float fMin;
        float f2;
        float fClamp01;
        if (this.gifts.isEmpty()) {
            return;
        }
        float f3 = 1.0f;
        if (this.expandProgress >= 1.0f || this.collapseProgress <= 0.0f) {
            return;
        }
        float x = this.avatarContainer.getX();
        float y = this.avatarContainer.getY();
        float width = this.avatarContainer.getWidth() * this.avatarContainer.getScaleX();
        float height = this.avatarContainer.getHeight() * this.avatarContainer.getScaleY();
        float fDpf2 = AndroidUtilities.dpf2(96.0f);
        float fMin2 = Math.min(x, (getWidth() - fDpf2) / 2.0f);
        float fMax = Math.max(y, (this.maxExpandY - fDpf2) / 2.0f);
        float fMax2 = Math.max(width, fDpf2);
        float fMax3 = Math.max(height, fDpf2);
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.expandY);
        float f4 = fMin2 + (fMax2 / 2.0f);
        float f5 = (fMax3 / 2.0f) + fMax;
        float f6 = x + (width / 2.0f);
        float f7 = y + (height / 2.0f);
        float f8 = this.expandY;
        float f9 = f8 / this.maxExpandY;
        float fClamp02 = Utilities.clamp01((f8 - (AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight())) / AndroidUtilities.dp(50.0f));
        int i = 0;
        while (i < this.gifts.size()) {
            Gift gift = (Gift) this.gifts.get(i);
            float f10 = gift.animatedFloat.set(f3);
            float fLerp2 = AndroidUtilities.lerp(0.5f, f3, f10);
            float f11 = (f3 - this.expandProgress) * f10 * (f3 - this.actionBarProgress) * fClamp02;
            int i2 = gift.position;
            if (i2 == 0) {
                fDp = (f4 / 2.0f) - (AndroidUtilities.dp(20.0f) * f9);
                fDp2 = f5 - AndroidUtilities.dp(13.0f);
            } else {
                if (i2 == 1) {
                    fLerp = ((f4 * 2.0f) / 3.0f) - (AndroidUtilities.dp(6.0f) * f9);
                    fDp2 = fMax - AndroidUtilities.dp(4.0f);
                } else {
                    if (i2 == 2) {
                        float fDp3 = ((f4 * 2.0f) / 3.0f) - (AndroidUtilities.dp(12.0f) * f9);
                        fDp2 = (fMax + fMax3) - AndroidUtilities.dp(16.0f);
                        fLerp = fDp3;
                    } else if (i2 == 3) {
                        fDp = (1.5f * f4) + (AndroidUtilities.dp(20.0f) * f9);
                        fDp2 = f5 - AndroidUtilities.dp(13.0f);
                    } else if (i2 == 4) {
                        fLerp = ((f4 * 4.0f) / 3.0f) + (AndroidUtilities.dp(12.0f) * f9);
                        fDp2 = fMax - AndroidUtilities.dp(4.0f);
                    } else {
                        float fDp4 = ((4.0f * f4) / 3.0f) + (AndroidUtilities.dp(12.0f) * f9);
                        fDp2 = (fMax + fMax3) - AndroidUtilities.dp(16.0f);
                        fLerp = fDp4;
                    }
                    f = 0.9f;
                    if (!this.isOpening || f10 >= 1.0f) {
                        fMin = this.collapseProgress;
                    } else {
                        fMin = Math.min(f10, this.collapseProgress);
                    }
                    f2 = f * 0.2f;
                    if (fMin >= 1.0f - f2) {
                        fClamp01 = 1.0f;
                    } else {
                        fClamp01 = Utilities.clamp01(((fMin - 0.32000002f) + f2) / 0.67999995f);
                    }
                    if (fClamp01 < 1.0f) {
                        fLerp = AndroidUtilities.lerp(f6, fLerp, this.giftCollapseXInterpolator.getInterpolation(fClamp01));
                        fDp2 = AndroidUtilities.lerp(f7, fDp2, this.giftCollapseYInterpolator.getInterpolation(fClamp01));
                        fLerp2 = AndroidUtilities.lerp(fLerp2 / 2.0f, fLerp2, fClamp01);
                    }
                    gift.draw(canvas, fLerp, fDp2, fLerp2, 0.0f, f11, 1.0f);
                    i++;
                    fClamp02 = fClamp02;
                    f3 = 1.0f;
                }
                f = 0.0f;
                if (!this.isOpening) {
                    fMin = this.collapseProgress;
                } else {
                    fMin = this.collapseProgress;
                }
                f2 = f * 0.2f;
                if (fMin >= 1.0f - f2) {
                    fClamp01 = 1.0f;
                } else {
                    fClamp01 = Utilities.clamp01(((fMin - 0.32000002f) + f2) / 0.67999995f);
                }
                if (fClamp01 < 1.0f) {
                    fLerp = AndroidUtilities.lerp(f6, fLerp, this.giftCollapseXInterpolator.getInterpolation(fClamp01));
                    fDp2 = AndroidUtilities.lerp(f7, fDp2, this.giftCollapseYInterpolator.getInterpolation(fClamp01));
                    fLerp2 = AndroidUtilities.lerp(fLerp2 / 2.0f, fLerp2, fClamp01);
                }
                gift.draw(canvas, fLerp, fDp2, fLerp2, 0.0f, f11, 1.0f);
                i++;
                fClamp02 = fClamp02;
                f3 = 1.0f;
            }
            fClamp02 = fClamp02;
            fLerp = fDp;
            f = 1.6f;
            if (!this.isOpening) {
                fMin = this.collapseProgress;
            } else {
                fMin = this.collapseProgress;
            }
            f2 = f * 0.2f;
            if (fMin >= 1.0f - f2) {
                fClamp01 = 1.0f;
            } else {
                fClamp01 = Utilities.clamp01(((fMin - 0.32000002f) + f2) / 0.67999995f);
            }
            if (fClamp01 < 1.0f) {
                fLerp = AndroidUtilities.lerp(f6, fLerp, this.giftCollapseXInterpolator.getInterpolation(fClamp01));
                fDp2 = AndroidUtilities.lerp(f7, fDp2, this.giftCollapseYInterpolator.getInterpolation(fClamp01));
                fLerp2 = AndroidUtilities.lerp(fLerp2 / 2.0f, fLerp2, fClamp01);
            }
            gift.draw(canvas, fLerp, fDp2, fLerp2, 0.0f, f11, 1.0f);
            i++;
            fClamp02 = fClamp02;
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
        if (!this.active) {
            return false;
        }
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
