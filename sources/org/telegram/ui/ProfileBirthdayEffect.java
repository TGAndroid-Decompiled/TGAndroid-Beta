package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import j$.time.LocalDate;
import j$.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SvgHelper$SvgDrawable$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Cells.TextDetailCell;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.spoilers.SpoilersTextView;

public final class ProfileBirthdayEffect extends View {
    public static final String[] interactions = {"🎉", "🎆", "🎈"};
    public boolean attached;
    public boolean autoplayed;
    public BirthdayEffectFetcher fetcher;
    public BirthdayEffectFetcher fetcherToSet;
    public boolean isPlaying;
    public long lastTime;
    public final ProfileActivity profileActivity;
    public final PointF sourcePoint;
    public float t;

    public final class BirthdayEffectFetcher {
        public final int age;
        public boolean detachLater;
        public ImageReceiverAsset interactionAsset;
        public boolean loaded;
        public final boolean[] setsLoaded;
        public final ArrayList digitAssets = new ArrayList();
        public final ArrayList allAssets = new ArrayList();
        public final ArrayList loadedAssets = new ArrayList();
        public final ArrayList callbacks = new ArrayList();
        public final ArrayList views = new ArrayList();

        public BirthdayEffectFetcher(int i, int i2) {
            boolean[] zArr = new boolean[2];
            this.setsLoaded = zArr;
            this.age = i2;
            if (i2 <= 0) {
                zArr[0] = true;
            } else {
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                String strM = DiffUtil.m(i2, "");
                for (int i3 = 0; i3 < strM.length(); i3++) {
                    int iCharAt = strM.charAt(i3) - '0';
                    if (iCharAt >= 0 && iCharAt <= 9) {
                        arrayList.add(Integer.valueOf(iCharAt));
                        hashSet.add(Integer.valueOf(iCharAt));
                    }
                }
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                String[] strArr = ProfileBirthdayEffect.interactions;
                tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
                MediaDataController.getInstance(i).getStickerSet(tL_inputStickerSetShortName, 0, false, new ArticleViewer$$ExternalSyntheticLambda33(this, hashSet, arrayList, 13));
            }
            String str = ProfileBirthdayEffect.interactions[Utilities.random.nextInt(3)];
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
            MediaDataController.getInstance(i).getStickerSet(tL_inputStickerSetShortName2, 0, false, new OAuthSheet$$ExternalSyntheticLambda13(22, this, str));
        }

        public static BirthdayEffectFetcher of(int i, TLRPC.UserFull userFull, BirthdayEffectFetcher birthdayEffectFetcher) {
            TL_account.TL_birthday tL_birthday;
            if (!LiteMode.isEnabled(2) || !BirthdayController.isToday(userFull)) {
                if (birthdayEffectFetcher == null) {
                    return null;
                }
                birthdayEffectFetcher.detach(false);
                return null;
            }
            int years = (userFull == null || (tL_birthday = userFull.birthday) == null || (tL_birthday.flags & 1) == 0) ? 0 : Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
            if (birthdayEffectFetcher != null) {
                if (birthdayEffectFetcher.age == years) {
                    return birthdayEffectFetcher;
                }
                birthdayEffectFetcher.detach(false);
            }
            return new BirthdayEffectFetcher(i, years);
        }

        public final void checkWhenLoaded() {
            if (this.loaded || this.loadedAssets.size() < this.allAssets.size()) {
                return;
            }
            boolean[] zArr = this.setsLoaded;
            int i = 0;
            if (zArr[0] && zArr[1]) {
                this.loaded = true;
                ArrayList arrayList = this.callbacks;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((Runnable) obj).run();
                }
                arrayList.clear();
            }
        }

        public final void detach(boolean z) {
            if (!z && !this.views.isEmpty()) {
                this.detachLater = true;
                return;
            }
            this.callbacks.clear();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.allAssets;
                if (i >= arrayList.size()) {
                    arrayList.clear();
                    return;
                } else {
                    ((ImageReceiverAsset) arrayList.get(i)).onDetachedFromWindow();
                    i++;
                }
            }
        }
    }

    public final class ImageReceiverAsset extends ImageReceiver {

        public final class AnonymousClass1 implements ImageReceiver.ImageReceiverDelegate {
            public final Runnable[] val$callback;

            public AnonymousClass1(Runnable[] runnableArr) {
                this.val$callback = runnableArr;
            }

            @Override
            public final void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
                if (imageReceiver.hasBitmapImage()) {
                    Runnable[] runnableArr = this.val$callback;
                    if (runnableArr[0] != null) {
                        RLottieDrawable lottieAnimation = imageReceiver.getLottieAnimation();
                        if (lottieAnimation == null) {
                            runnableArr[0].run();
                            runnableArr[0] = null;
                        } else if (lottieAnimation.isGeneratingCache()) {
                            lottieAnimation.whenCacheDone = new ProfileActivity$9$$ExternalSyntheticLambda1(runnableArr, 4);
                        } else {
                            runnableArr[0].run();
                            runnableArr[0] = null;
                        }
                    }
                }
            }

            @Override
            public final void didSetImageBitmap(int i, String str, Drawable drawable) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
            }

            @Override
            public final void onAnimationReady(ImageReceiver imageReceiver) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
            }
        }
    }

    public ProfileBirthdayEffect(ProfileActivity profileActivity, BirthdayEffectFetcher birthdayEffectFetcher) {
        super(profileActivity.getParentActivity());
        this.sourcePoint = new PointF();
        this.t = 1.0f;
        this.isPlaying = false;
        this.profileActivity = profileActivity;
        this.fetcher = birthdayEffectFetcher;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.fetcher.views.add(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.attached) {
            for (int i = 0; i < this.fetcher.allAssets.size(); i++) {
                ((ImageReceiverAsset) this.fetcher.allAssets.get(i)).setParentView(null);
            }
            this.attached = false;
        }
        BirthdayEffectFetcher birthdayEffectFetcher = this.fetcher;
        birthdayEffectFetcher.views.remove(this);
        if (birthdayEffectFetcher.views.isEmpty() && birthdayEffectFetcher.detachLater) {
            birthdayEffectFetcher.detach(true);
            birthdayEffectFetcher.detachLater = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.fetcher.loaded) {
            if (!this.attached) {
                for (int i = 0; i < this.fetcher.allAssets.size(); i++) {
                    ((ImageReceiverAsset) this.fetcher.allAssets.get(i)).setParentView(this);
                }
                this.attached = true;
                if (!this.autoplayed) {
                    this.autoplayed = true;
                    post(new ProfileActivity$9$$ExternalSyntheticLambda1(this, 2));
                }
            }
            if (this.isPlaying) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.t = Utilities.clamp(this.t + (Utilities.clamp(jCurrentTimeMillis - this.lastTime, 20L, 0L) / 4200.0f), 1.0f, 0.0f);
                this.lastTime = jCurrentTimeMillis;
                ProfileActivity profileActivity = this.profileActivity;
                ProfileActivity.AnonymousClass12 anonymousClass12 = profileActivity.listView;
                int i2 = profileActivity.birthdayRow;
                PointF pointF = this.sourcePoint;
                float f = 2.0f;
                if (i2 >= 0) {
                    for (int i3 = 0; i3 < anonymousClass12.getChildCount(); i3++) {
                        View childAt = anonymousClass12.getChildAt(i3);
                        if (i2 == RecyclerView.getChildAdapterPosition(childAt) && (childAt instanceof TextDetailCell)) {
                            SpoilersTextView spoilersTextView = ((TextDetailCell) childAt).textView;
                            pointF.set(spoilersTextView.getX() + childAt.getX() + anonymousClass12.getX() + AndroidUtilities.dp(12.0f), (spoilersTextView.getMeasuredHeight() / 2.0f) + spoilersTextView.getY() + childAt.getY() + anonymousClass12.getY());
                            break;
                        }
                    }
                }
                float filterWidth = EmojiAnimationsOverlay.getFilterWidth();
                this.fetcher.interactionAsset.setImageCoords((getWidth() - AndroidUtilities.dp(filterWidth)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(filterWidth) * 0.5f)), AndroidUtilities.dp(filterWidth), AndroidUtilities.dp(filterWidth));
                canvas.save();
                canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
                this.fetcher.interactionAsset.draw(canvas);
                this.fetcher.interactionAsset.setAlpha(1.0f - ((this.t - 0.9f) / 0.1f));
                canvas.restore();
                int iDp = AndroidUtilities.dp(110.0f);
                int size = this.fetcher.digitAssets.size() - 1;
                while (size >= 0) {
                    ImageReceiverAsset imageReceiverAsset = (ImageReceiverAsset) this.fetcher.digitAssets.get(size);
                    float f2 = size;
                    float fCascade = AndroidUtilities.cascade(this.t, f2, this.fetcher.digitAssets.size(), 1.8f);
                    float f3 = iDp;
                    float f4 = 0.88f * f3;
                    float fM = SvgHelper$SvgDrawable$$ExternalSyntheticOutline0.m(f4, this.fetcher.digitAssets.size() - 1, getWidth(), f);
                    float f5 = pointF.x;
                    float f6 = pointF.y;
                    int i4 = iDp;
                    float fPow = f6 - ((f6 + f3) * ((float) Math.pow(this.t, 2.0d)));
                    float interpolation = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(Utilities.clamp(fCascade / 0.4f, 1.0f, 0.0f));
                    float f7 = (f3 / 2.0f) * interpolation;
                    float f8 = f3 * interpolation;
                    imageReceiverAsset.setImageCoords((((fM - f5) * fCascade) + ((f4 * f2) + f5)) - f7, fPow - f7, f8, f8);
                    imageReceiverAsset.draw(canvas);
                    size--;
                    iDp = i4;
                    f = 2.0f;
                }
                if (this.t < 1.0f) {
                    invalidate();
                    return;
                }
                this.isPlaying = false;
                updateFetcher(this.fetcherToSet);
                this.fetcherToSet = null;
            }
        }
    }

    public final boolean start() {
        BirthdayEffectFetcher birthdayEffectFetcher = this.fetcher;
        if (!birthdayEffectFetcher.loaded || this.t < 1.0f) {
            return false;
        }
        if (birthdayEffectFetcher.interactionAsset.getLottieAnimation() != null) {
            this.fetcher.interactionAsset.getLottieAnimation().setCurrentFrame(0, false, false);
            this.fetcher.interactionAsset.getLottieAnimation().restart(true);
        }
        this.isPlaying = true;
        this.t = 0.0f;
        invalidate();
        return true;
    }

    public final void updateFetcher(BirthdayEffectFetcher birthdayEffectFetcher) {
        if (this.fetcher == birthdayEffectFetcher || birthdayEffectFetcher == null) {
            return;
        }
        if (this.isPlaying) {
            this.fetcherToSet = birthdayEffectFetcher;
            return;
        }
        int i = 0;
        if (this.attached) {
            for (int i2 = 0; i2 < this.fetcher.allAssets.size(); i2++) {
                ((ImageReceiverAsset) this.fetcher.allAssets.get(i2)).setParentView(null);
            }
            this.attached = false;
        }
        BirthdayEffectFetcher birthdayEffectFetcher2 = this.fetcher;
        birthdayEffectFetcher2.views.remove(this);
        if (birthdayEffectFetcher2.views.isEmpty() && birthdayEffectFetcher2.detachLater) {
            birthdayEffectFetcher2.detach(true);
            birthdayEffectFetcher2.detachLater = false;
        }
        this.fetcher = birthdayEffectFetcher;
        if (this.attached) {
            return;
        }
        while (true) {
            ArrayList arrayList = birthdayEffectFetcher.allAssets;
            if (i >= arrayList.size()) {
                this.attached = true;
                return;
            } else {
                ((ImageReceiverAsset) arrayList.get(i)).setParentView(this);
                i++;
            }
        }
    }
}
