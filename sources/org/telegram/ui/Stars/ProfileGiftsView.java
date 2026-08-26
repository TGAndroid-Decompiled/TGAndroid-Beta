package org.telegram.ui.Stars;

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
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocationController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.ProfileActivity;

public final class ProfileGiftsView extends View implements NotificationCenter.NotificationCenterDelegate {
    public float actionBarProgress;
    public boolean active;
    public final ProfileActivity.AnonymousClass19 avatarContainer;
    public float collapseProgress;
    public final int currentAccount;
    public float cy;
    public final long dialogId;
    public float expandProgress;
    public float expandY;
    public final DecelerateInterpolator giftCollapseXInterpolator;
    public final LinearInterpolator giftCollapseYInterpolator;
    public final HashSet giftIds;
    public final ArrayList gifts;
    public boolean isOpening;
    public float left;
    public StarsController.GiftsList list;
    public int maxCount;
    public float maxExpandY;
    public final ArrayList oldGifts;
    public Gift pressedGift;
    public float progressToInsets;
    public float right;
    public final AnimatedFloat rightAnimated;

    public final class Gift {
        public AnimatedFloat animatedFloat;
        public final ButtonBounce bounce;
        public final RectF bounds;
        public final int color;
        public final TLRPC.Document document;
        public final long documentId;
        public AnimatedEmojiDrawable emojiDrawable;
        public RadialGradient gradient;
        public Paint gradientPaint;
        public final long id;
        public StarsReactionsSheet.Particles particles;
        public int position = -1;
        public final String slug;

        public Gift(ProfileGiftsView profileGiftsView, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
            new Matrix();
            this.bounds = new RectF();
            this.bounce = new ButtonBounce(profileGiftsView, 1.0f, 5.0f);
            this.id = tL_starGiftUnique.id;
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            this.document = document;
            this.documentId = document == null ? 0L : document.id;
            this.color = ((TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
            this.slug = tL_starGiftUnique.slug;
            this.particles = new StarsReactionsSheet.Particles(1, 6);
            float fDp = AndroidUtilities.dp(36.0f);
            float f = (-fDp) / 2.0f;
            float f2 = fDp / 2.0f;
            this.particles.bounds.set(f, f, f2, f2);
        }
    }

    public ProfileGiftsView(Context context, int i, long j, ProfileActivity.AnonymousClass19 anonymousClass19) {
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
        this.avatarContainer = anonymousClass19;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == this.dialogId) {
            update();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float fDp;
        int iDp;
        float fLerp;
        float fMin;
        float f;
        float fClamp01;
        float fDp2;
        float f2;
        Paint paint;
        Gift gift;
        ProfileGiftsView profileGiftsView = this;
        ArrayList arrayList = profileGiftsView.gifts;
        if (arrayList.isEmpty()) {
            return;
        }
        float f3 = 1.0f;
        if (profileGiftsView.expandProgress >= 1.0f || profileGiftsView.collapseProgress <= 0.0f) {
            return;
        }
        ProfileActivity.AnonymousClass19 anonymousClass19 = profileGiftsView.avatarContainer;
        float x = anonymousClass19.getX();
        float y = anonymousClass19.getY();
        float scaleX = anonymousClass19.getScaleX() * anonymousClass19.getWidth();
        float scaleY = anonymousClass19.getScaleY() * anonymousClass19.getHeight();
        float fDpf2 = AndroidUtilities.dpf2(96.0f);
        float fMin2 = Math.min(x, (profileGiftsView.getWidth() - fDpf2) / 2.0f);
        float fM = ChatActivity$$ExternalSyntheticOutline0.m(profileGiftsView.maxExpandY, fDpf2, 2.0f, y);
        float fMax = Math.max(scaleX, fDpf2);
        float fMax2 = Math.max(scaleY, fDpf2);
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, profileGiftsView.getWidth(), profileGiftsView.expandY);
        float f4 = (fMax / 2.0f) + fMin2;
        float f5 = (fMax2 / 2.0f) + fM;
        float f6 = (scaleX / 2.0f) + x;
        float f7 = (scaleY / 2.0f) + y;
        float f8 = profileGiftsView.expandY;
        float f9 = f8 / profileGiftsView.maxExpandY;
        float fClamp02 = Utilities.clamp01((f8 - (ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) / AndroidUtilities.dp(50.0f));
        boolean z = false;
        int i = 0;
        while (i < arrayList.size()) {
            Gift gift2 = (Gift) arrayList.get(i);
            float f10 = gift2.animatedFloat.set(f3, z);
            float fLerp2 = AndroidUtilities.lerp(0.5f, f3, f10);
            int i2 = i;
            float fM2 = ImageReceiver$$ExternalSyntheticOutline2.m(f3, profileGiftsView.actionBarProgress, (f3 - profileGiftsView.expandProgress) * f10, fClamp02);
            int i3 = gift2.position;
            float f11 = 1.6f;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        fDp = ((f4 * 2.0f) / 3.0f) - (AndroidUtilities.dp(12.0f) * f9);
                        fLerp = (fM + fMax2) - AndroidUtilities.dp(16.0f);
                    } else if (i3 == 3) {
                        fDp = (AndroidUtilities.dp(20.0f) * f9) + (1.5f * f4);
                        iDp = AndroidUtilities.dp(13.0f);
                    } else if (i3 != 4) {
                        fDp = (AndroidUtilities.dp(12.0f) * f9) + ((4.0f * f4) / 3.0f);
                        fLerp = (fM + fMax2) - AndroidUtilities.dp(16.0f);
                    } else {
                        fDp = (AndroidUtilities.dp(12.0f) * f9) + ((f4 * 4.0f) / 3.0f);
                        fLerp = fM - AndroidUtilities.dp(4.0f);
                    }
                    f11 = 0.9f;
                    if (!profileGiftsView.isOpening || f10 >= 1.0f) {
                        fMin = profileGiftsView.collapseProgress;
                    } else {
                        fMin = Math.min(f10, profileGiftsView.collapseProgress);
                    }
                    f = f11 * 0.2f;
                    if (fMin >= 1.0f - f) {
                        fClamp01 = 1.0f;
                    } else {
                        fClamp01 = Utilities.clamp01(((fMin - 0.32000002f) + f) / 0.67999995f);
                    }
                    if (fClamp01 < 1.0f) {
                        fDp = AndroidUtilities.lerp(f6, fDp, profileGiftsView.giftCollapseXInterpolator.getInterpolation(fClamp01));
                        fLerp = AndroidUtilities.lerp(f7, fLerp, profileGiftsView.giftCollapseYInterpolator.getInterpolation(fClamp01));
                        fLerp2 = AndroidUtilities.lerp(fLerp2 / 2.0f, fLerp2, fClamp01);
                    }
                    if (fM2 > 0.0f) {
                        fDp2 = AndroidUtilities.dp(45.0f);
                        float f12 = fLerp2;
                        f2 = fDp2 / 2.0f;
                        gift2.bounds.set(fDp - f2, fLerp - f2, fDp + f2, fLerp + f2);
                        canvas.save();
                        canvas.translate(fDp, fLerp);
                        canvas.rotate(0.0f);
                        float scale = gift2.bounce.getScale(0.1f) * f12;
                        canvas.scale(scale, scale);
                        gift2.particles.process();
                        gift2.particles.draw(canvas, gift2.color, fM2);
                        paint = gift2.gradientPaint;
                        if (paint != null) {
                            paint.setAlpha((int) (fM2 * 255.0f * 1.0f));
                            float f13 = (-fDp2) / 2.0f;
                            gift = gift2;
                            canvas.drawRect(f13, f13, f2, f2, gift2.gradientPaint);
                        } else {
                            gift = gift2;
                        }
                        if (gift.emojiDrawable != null) {
                            int iDp2 = AndroidUtilities.dp(24.0f);
                            int i4 = (-iDp2) / 2;
                            int i5 = iDp2 / 2;
                            gift.emojiDrawable.setBounds(i4, i4, i5, i5);
                            gift.emojiDrawable.setAlpha((int) (fM2 * 255.0f));
                            gift.emojiDrawable.draw(canvas);
                        }
                        canvas.restore();
                    }
                    i = i2 + 1;
                    profileGiftsView = this;
                    f7 = f7;
                    arrayList = arrayList;
                    fClamp02 = fClamp02;
                    z = false;
                    f3 = 1.0f;
                } else {
                    fDp = ((f4 * 2.0f) / 3.0f) - (AndroidUtilities.dp(6.0f) * f9);
                    fLerp = fM - AndroidUtilities.dp(4.0f);
                }
                f11 = 0.0f;
                if (profileGiftsView.isOpening) {
                    fMin = profileGiftsView.collapseProgress;
                } else {
                    fMin = profileGiftsView.collapseProgress;
                }
                f = f11 * 0.2f;
                if (fMin >= 1.0f - f) {
                    fClamp01 = 1.0f;
                } else {
                    fClamp01 = Utilities.clamp01(((fMin - 0.32000002f) + f) / 0.67999995f);
                }
                if (fClamp01 < 1.0f) {
                    fDp = AndroidUtilities.lerp(f6, fDp, profileGiftsView.giftCollapseXInterpolator.getInterpolation(fClamp01));
                    fLerp = AndroidUtilities.lerp(f7, fLerp, profileGiftsView.giftCollapseYInterpolator.getInterpolation(fClamp01));
                    fLerp2 = AndroidUtilities.lerp(fLerp2 / 2.0f, fLerp2, fClamp01);
                }
                if (fM2 > 0.0f) {
                    fDp2 = AndroidUtilities.dp(45.0f);
                    float f14 = fLerp2;
                    f2 = fDp2 / 2.0f;
                    gift2.bounds.set(fDp - f2, fLerp - f2, fDp + f2, fLerp + f2);
                    canvas.save();
                    canvas.translate(fDp, fLerp);
                    canvas.rotate(0.0f);
                    float scale2 = gift2.bounce.getScale(0.1f) * f14;
                    canvas.scale(scale2, scale2);
                    gift2.particles.process();
                    gift2.particles.draw(canvas, gift2.color, fM2);
                    paint = gift2.gradientPaint;
                    if (paint != null) {
                        paint.setAlpha((int) (fM2 * 255.0f * 1.0f));
                        float f15 = (-fDp2) / 2.0f;
                        gift = gift2;
                        canvas.drawRect(f15, f15, f2, f2, gift2.gradientPaint);
                    } else {
                        gift = gift2;
                    }
                    if (gift.emojiDrawable != null) {
                        int iDp3 = AndroidUtilities.dp(24.0f);
                        int i6 = (-iDp3) / 2;
                        int i7 = iDp3 / 2;
                        gift.emojiDrawable.setBounds(i6, i6, i7, i7);
                        gift.emojiDrawable.setAlpha((int) (fM2 * 255.0f));
                        gift.emojiDrawable.draw(canvas);
                    }
                    canvas.restore();
                }
                i = i2 + 1;
                profileGiftsView = this;
                f7 = f7;
                arrayList = arrayList;
                fClamp02 = fClamp02;
                z = false;
                f3 = 1.0f;
            } else {
                fDp = (f4 / 2.0f) - (AndroidUtilities.dp(20.0f) * f9);
                iDp = AndroidUtilities.dp(13.0f);
            }
            fLerp = f5 - iDp;
            if (profileGiftsView.isOpening) {
                fMin = profileGiftsView.collapseProgress;
            } else {
                fMin = profileGiftsView.collapseProgress;
            }
            f = f11 * 0.2f;
            if (fMin >= 1.0f - f) {
                fClamp01 = 1.0f;
            } else {
                fClamp01 = Utilities.clamp01(((fMin - 0.32000002f) + f) / 0.67999995f);
            }
            if (fClamp01 < 1.0f) {
                fDp = AndroidUtilities.lerp(f6, fDp, profileGiftsView.giftCollapseXInterpolator.getInterpolation(fClamp01));
                fLerp = AndroidUtilities.lerp(f7, fLerp, profileGiftsView.giftCollapseYInterpolator.getInterpolation(fClamp01));
                fLerp2 = AndroidUtilities.lerp(fLerp2 / 2.0f, fLerp2, fClamp01);
            }
            if (fM2 > 0.0f) {
                fDp2 = AndroidUtilities.dp(45.0f);
                float f16 = fLerp2;
                f2 = fDp2 / 2.0f;
                gift2.bounds.set(fDp - f2, fLerp - f2, fDp + f2, fLerp + f2);
                canvas.save();
                canvas.translate(fDp, fLerp);
                canvas.rotate(0.0f);
                float scale3 = gift2.bounce.getScale(0.1f) * f16;
                canvas.scale(scale3, scale3);
                gift2.particles.process();
                gift2.particles.draw(canvas, gift2.color, fM2);
                paint = gift2.gradientPaint;
                if (paint != null) {
                    paint.setAlpha((int) (fM2 * 255.0f * 1.0f));
                    float f17 = (-fDp2) / 2.0f;
                    gift = gift2;
                    canvas.drawRect(f17, f17, f2, f2, gift2.gradientPaint);
                } else {
                    gift = gift2;
                }
                if (gift.emojiDrawable != null) {
                    int iDp4 = AndroidUtilities.dp(24.0f);
                    int i8 = (-iDp4) / 2;
                    int i9 = iDp4 / 2;
                    gift.emojiDrawable.setBounds(i8, i8, i9, i9);
                    gift.emojiDrawable.setAlpha((int) (fM2 * 255.0f));
                    gift.emojiDrawable.draw(canvas);
                }
                canvas.restore();
            }
            i = i2 + 1;
            profileGiftsView = this;
            f7 = f7;
            arrayList = arrayList;
            fClamp02 = fClamp02;
            z = false;
            f3 = 1.0f;
        }
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.gifts;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Gift) obj).emojiDrawable.addView(this);
        }
        update();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        ArrayList arrayList = this.gifts;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Gift) obj).emojiDrawable.removeView(this);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Gift gift;
        Gift gift2;
        if (!this.active) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.gifts;
            if (i >= arrayList.size()) {
                gift = null;
                break;
            }
            if (((Gift) arrayList.get(i)).bounds.contains(x, y)) {
                gift = (Gift) arrayList.get(i);
                break;
            }
            i++;
        }
        if (motionEvent.getAction() == 0) {
            this.pressedGift = gift;
            if (gift != null) {
                gift.bounce.setPressed(true);
            }
        } else if (motionEvent.getAction() == 2) {
            Gift gift3 = this.pressedGift;
            if (gift3 != gift && gift3 != null) {
                gift3.bounce.setPressed(false);
                this.pressedGift = null;
            }
        } else if (motionEvent.getAction() == 1) {
            Gift gift4 = this.pressedGift;
            if (gift4 != null) {
                Browser.openUrl(getContext(), "https://t.me/nft/" + gift4.slug);
                this.pressedGift.bounce.setPressed(false);
                this.pressedGift = null;
            }
        } else if (motionEvent.getAction() == 3 && (gift2 = this.pressedGift) != null) {
            gift2.bounce.setPressed(false);
            this.pressedGift = null;
        }
        return this.pressedGift != null;
    }

    public void setActionBarActionMode(float f) {
        this.actionBarProgress = f;
        invalidate();
    }

    public void setActive(boolean z) {
        this.active = z;
    }

    public void setExpandCoords(float f) {
        this.expandY = f;
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

    public final void update() {
        TLRPC.EmojiStatus emojiStatus;
        boolean z;
        Gift gift;
        Gift gift2;
        int i = this.currentAccount;
        if (MessagesController.getInstance(i).enableGiftsInProfile) {
            this.maxCount = MessagesController.getInstance(i).stargiftsPinnedToTopLimit;
            ArrayList arrayList = this.oldGifts;
            arrayList.clear();
            ArrayList arrayList2 = this.gifts;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            HashSet hashSet = this.giftIds;
            hashSet.clear();
            long j = this.dialogId;
            if (j >= 0) {
                TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
                if (user == null) {
                    emojiStatus = null;
                } else {
                    emojiStatus = user.emoji_status;
                }
            } else {
                TLRPC.User user2 = MessagesController.getInstance(i).getUser(Long.valueOf(-j));
                if (user2 == null) {
                    emojiStatus = null;
                } else {
                    emojiStatus = user2.emoji_status;
                }
            }
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                hashSet.add(Long.valueOf(((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id));
            }
            int i2 = 0;
            StarsController.GiftsList profileGiftsList = StarsController.getInstance(i, false).getProfileGiftsList(j, true);
            this.list = profileGiftsList;
            if (profileGiftsList != null) {
                for (int i3 = 0; i3 < this.list.gifts.size(); i3++) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.list.gifts.get(i3);
                    if (!savedStarGift.unsaved && savedStarGift.pinned_to_top) {
                        TL_stars.StarGift starGift = savedStarGift.gift;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            Gift gift3 = new Gift(this, (TL_stars.TL_starGiftUnique) starGift);
                            long j2 = gift3.id;
                            if (!hashSet.contains(Long.valueOf(j2))) {
                                arrayList2.add(gift3);
                                hashSet.add(Long.valueOf(j2));
                            }
                        }
                    }
                }
            }
            if (arrayList2.size() != arrayList.size()) {
                z = true;
                break;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList2.size()) {
                    z = false;
                    break;
                }
                Gift gift4 = (Gift) arrayList2.get(i4);
                Gift gift5 = (Gift) arrayList.get(i4);
                gift4.getClass();
                if (gift5 == null || gift5.id != gift4.id) {
                    z = true;
                    break;
                }
                i4++;
            }
            int i5 = 0;
            while (i5 < arrayList2.size()) {
                Gift gift6 = (Gift) arrayList2.get(i5);
                int i6 = 0;
                while (true) {
                    if (i6 >= arrayList.size()) {
                        gift2 = null;
                        break;
                    } else {
                        if (((Gift) arrayList.get(i6)).id == gift6.id) {
                            gift2 = (Gift) arrayList.get(i6);
                            break;
                        }
                        i6++;
                    }
                }
                if (gift2 != null) {
                    gift6.getClass();
                    gift6.gradient = gift2.gradient;
                    gift6.emojiDrawable = gift2.emojiDrawable;
                    gift6.gradientPaint = gift2.gradientPaint;
                    gift6.animatedFloat = gift2.animatedFloat;
                    gift6.particles = gift2.particles;
                    gift6.position = gift2.position;
                } else {
                    float fDp = AndroidUtilities.dp(22.5f);
                    int i7 = gift6.color;
                    gift6.gradient = new RadialGradient(0.0f, 0.0f, fDp, new int[]{i7, Theme.multAlpha(0.0f, i7)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    Paint paint = new Paint(1);
                    gift6.gradientPaint = paint;
                    paint.setShader(gift6.gradient);
                    TLRPC.Document document = gift6.document;
                    if (document != null) {
                        gift6.emojiDrawable = AnimatedEmojiDrawable.make(i, i2, document);
                    } else {
                        gift6.emojiDrawable = AnimatedEmojiDrawable.make(i, gift6.documentId, null, i2);
                    }
                    AnimatedFloat animatedFloat = new AnimatedFloat(this, 0L, 320L, (Interpolator) null);
                    gift6.animatedFloat = animatedFloat;
                    animatedFloat.set(0.0f, true);
                    if (isAttachedToWindow()) {
                        gift6.emojiDrawable.addView(this);
                    }
                }
                i5++;
                i2 = 0;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int iM = 0; iM < this.maxCount; iM = LocationController$$ExternalSyntheticOutline0.m(iM, iM, 1, arrayList3)) {
            }
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                Gift gift7 = (Gift) arrayList.get(i8);
                int i9 = 0;
                while (true) {
                    if (i9 >= arrayList2.size()) {
                        gift = null;
                        break;
                    } else {
                        if (((Gift) arrayList2.get(i9)).id == gift7.id) {
                            gift = (Gift) arrayList2.get(i9);
                            break;
                        }
                        i9++;
                    }
                }
                if (gift == null) {
                    gift7.emojiDrawable.removeView(this);
                    gift7.emojiDrawable = null;
                    gift7.gradient = null;
                } else {
                    arrayList3.remove(Integer.valueOf(gift7.position));
                }
            }
            if (!arrayList3.isEmpty()) {
                BagRandomizer bagRandomizer = new BagRandomizer(arrayList3);
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    Gift gift8 = (Gift) arrayList2.get(i10);
                    if (gift8.position == -1) {
                        gift8.position = ((Integer) bagRandomizer.next()).intValue();
                    }
                }
            }
            if (z) {
                invalidate();
            }
        }
    }
}
