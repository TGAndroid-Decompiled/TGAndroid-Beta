package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.View;
import j$.time.LocalDate;
import j$.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$TL_birthday;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetShortName;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.ui.Cells.TextDetailCell;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.ProfileBirthdayEffect;

public class ProfileBirthdayEffect extends View {
    public static String[] interactions = {"🎉", "🎆", "🎈"};
    public static String interactionsPack = "EmojiAnimations";
    public static String numbersEmojipack = "FestiveFontEmoji";
    private boolean attached;
    private boolean autoplayed;
    private BirthdayEffectFetcher fetcher;
    private BirthdayEffectFetcher fetcherToSet;
    private boolean isPlaying;
    private long lastTime;
    private final ProfileActivity profileActivity;
    public PointF sourcePoint;
    private float t;

    public ProfileBirthdayEffect(ProfileActivity profileActivity, BirthdayEffectFetcher birthdayEffectFetcher) {
        super(profileActivity.getContext());
        this.sourcePoint = new PointF();
        this.t = 1.0f;
        this.isPlaying = false;
        profileActivity.getCurrentAccount();
        profileActivity.getDialogId();
        this.profileActivity = profileActivity;
        this.fetcher = birthdayEffectFetcher;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.fetcher.loaded) {
            int i = 1;
            if (!this.attached) {
                for (int i2 = 0; i2 < this.fetcher.allAssets.size(); i2++) {
                    this.fetcher.allAssets.get(i2).setParentView(this);
                }
                this.attached = true;
                if (!this.autoplayed) {
                    this.autoplayed = true;
                    post(new Runnable() {
                        @Override
                        public final void run() {
                            ProfileBirthdayEffect.this.lambda$onDraw$0();
                        }
                    });
                }
            }
            if (this.isPlaying) {
                long currentTimeMillis = System.currentTimeMillis();
                this.t = Utilities.clamp(this.t + (((float) Utilities.clamp(currentTimeMillis - this.lastTime, 20L, 0L)) / 4200.0f), 1.0f, 0.0f);
                this.lastTime = currentTimeMillis;
                updateSourcePoint();
                float filterWidth = EmojiAnimationsOverlay.getFilterWidth();
                this.fetcher.interactionAsset.setImageCoords((getWidth() - AndroidUtilities.dp(filterWidth)) / 2.0f, Math.max(0.0f, this.sourcePoint.y - (AndroidUtilities.dp(filterWidth) * 0.5f)), AndroidUtilities.dp(filterWidth), AndroidUtilities.dp(filterWidth));
                canvas.save();
                canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
                this.fetcher.interactionAsset.draw(canvas);
                this.fetcher.interactionAsset.setAlpha(1.0f - ((this.t - 0.9f) / 0.1f));
                canvas.restore();
                int dp = AndroidUtilities.dp(110.0f);
                int size = this.fetcher.digitAssets.size() - 1;
                while (size >= 0) {
                    ImageReceiverAsset imageReceiverAsset = this.fetcher.digitAssets.get(size);
                    float f = size;
                    float cascade = AndroidUtilities.cascade(this.t, f, this.fetcher.digitAssets.size(), 1.8f);
                    float f2 = dp;
                    float f3 = 0.88f * f2;
                    float width = (getWidth() - ((this.fetcher.digitAssets.size() - i) * f3)) / 2.0f;
                    PointF pointF = this.sourcePoint;
                    float f4 = pointF.x;
                    float f5 = pointF.y;
                    float f6 = f4 + (f3 * f) + ((width - f4) * cascade);
                    float pow = f5 - ((f5 + f2) * ((float) Math.pow(this.t, 2.0d)));
                    float interpolation = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                    float f7 = (f2 / 2.0f) * interpolation;
                    float f8 = f2 * interpolation;
                    imageReceiverAsset.setImageCoords(f6 - f7, pow - f7, f8, f8);
                    imageReceiverAsset.draw(canvas);
                    size--;
                    i = 1;
                }
                if (this.t >= 1.0f) {
                    this.isPlaying = false;
                    updateFetcher(this.fetcherToSet);
                    this.fetcherToSet = null;
                    return;
                }
                invalidate();
            }
        }
    }

    public void updateFetcher(BirthdayEffectFetcher birthdayEffectFetcher) {
        if (this.fetcher == birthdayEffectFetcher || birthdayEffectFetcher == null) {
            return;
        }
        if (this.isPlaying) {
            this.fetcherToSet = birthdayEffectFetcher;
            return;
        }
        if (this.attached) {
            for (int i = 0; i < this.fetcher.allAssets.size(); i++) {
                this.fetcher.allAssets.get(i).setParentView(null);
            }
            this.attached = false;
        }
        this.fetcher.removeView(this);
        this.fetcher = birthdayEffectFetcher;
        if (this.attached) {
            return;
        }
        for (int i2 = 0; i2 < birthdayEffectFetcher.allAssets.size(); i2++) {
            birthdayEffectFetcher.allAssets.get(i2).setParentView(this);
        }
        this.attached = true;
    }

    public boolean lambda$onDraw$0() {
        if (!this.fetcher.loaded || this.t < 1.0f) {
            return false;
        }
        if (this.fetcher.interactionAsset.getLottieAnimation() != null) {
            this.fetcher.interactionAsset.getLottieAnimation().setCurrentFrame(0, false);
            this.fetcher.interactionAsset.getLottieAnimation().restart(true);
        }
        this.isPlaying = true;
        this.t = 0.0f;
        invalidate();
        return true;
    }

    public void hide() {
        animate().alpha(0.0f).setDuration(200L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
    }

    private void updateSourcePoint() {
        RecyclerListView listView = this.profileActivity.getListView();
        int i = this.profileActivity.birthdayRow;
        if (i < 0) {
            return;
        }
        for (int i2 = 0; i2 < listView.getChildCount(); i2++) {
            View childAt = listView.getChildAt(i2);
            if (i == listView.getChildAdapterPosition(childAt) && (childAt instanceof TextDetailCell)) {
                LinkSpanDrawable.LinksTextView linksTextView = ((TextDetailCell) childAt).textView;
                this.sourcePoint.set(listView.getX() + childAt.getX() + linksTextView.getX() + AndroidUtilities.dp(12.0f), listView.getY() + childAt.getY() + linksTextView.getY() + (linksTextView.getMeasuredHeight() / 2.0f));
                return;
            }
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.fetcher.addView(this);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.attached) {
            for (int i = 0; i < this.fetcher.allAssets.size(); i++) {
                this.fetcher.allAssets.get(i).setParentView(null);
            }
            this.attached = false;
        }
        this.fetcher.removeView(this);
    }

    public static class BirthdayEffectFetcher {
        public final int age;
        private boolean detachLater;
        public ImageReceiverAsset interactionAsset;
        private boolean loaded;
        private final boolean[] setsLoaded;
        public ArrayList<ImageReceiverAsset> digitAssets = new ArrayList<>();
        public ArrayList<ImageReceiverAsset> allAssets = new ArrayList<>();
        public ArrayList<ImageReceiverAsset> loadedAssets = new ArrayList<>();
        private ArrayList<Runnable> callbacks = new ArrayList<>();
        public ArrayList<ProfileBirthdayEffect> views = new ArrayList<>();

        public static BirthdayEffectFetcher of(int i, TLRPC$UserFull tLRPC$UserFull, BirthdayEffectFetcher birthdayEffectFetcher) {
            TLRPC$TL_birthday tLRPC$TL_birthday;
            if (!LiteMode.isEnabled(2) || !BirthdayController.isToday(tLRPC$UserFull)) {
                if (birthdayEffectFetcher == null) {
                    return null;
                }
                birthdayEffectFetcher.detach(false);
                return null;
            }
            int years = (tLRPC$UserFull == null || (tLRPC$TL_birthday = tLRPC$UserFull.birthday) == null || (tLRPC$TL_birthday.flags & 1) == 0) ? 0 : Period.between(LocalDate.of(tLRPC$TL_birthday.year, tLRPC$TL_birthday.month, tLRPC$TL_birthday.day), LocalDate.now()).getYears();
            if (birthdayEffectFetcher != null) {
                if (birthdayEffectFetcher.age == years) {
                    return birthdayEffectFetcher;
                }
                birthdayEffectFetcher.detach(false);
            }
            return new BirthdayEffectFetcher(i, years);
        }

        private BirthdayEffectFetcher(int i, int i2) {
            boolean[] zArr = new boolean[2];
            this.setsLoaded = zArr;
            this.age = i2;
            if (i2 <= 0) {
                zArr[0] = true;
            } else {
                final ArrayList arrayList = new ArrayList();
                final HashSet hashSet = new HashSet();
                String str = "" + i2;
                for (int i3 = 0; i3 < str.length(); i3++) {
                    int charAt = str.charAt(i3) - '0';
                    if (charAt >= 0 && charAt <= 9) {
                        arrayList.add(Integer.valueOf(charAt));
                        hashSet.add(Integer.valueOf(charAt));
                    }
                }
                TLRPC$TL_inputStickerSetShortName tLRPC$TL_inputStickerSetShortName = new TLRPC$TL_inputStickerSetShortName();
                tLRPC$TL_inputStickerSetShortName.short_name = ProfileBirthdayEffect.numbersEmojipack;
                MediaDataController.getInstance(i).getStickerSet(tLRPC$TL_inputStickerSetShortName, 0, false, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        ProfileBirthdayEffect.BirthdayEffectFetcher.this.lambda$new$1(hashSet, arrayList, (TLRPC$TL_messages_stickerSet) obj);
                    }
                });
            }
            final String str2 = ProfileBirthdayEffect.interactions[Utilities.random.nextInt(ProfileBirthdayEffect.interactions.length)];
            TLRPC$TL_inputStickerSetShortName tLRPC$TL_inputStickerSetShortName2 = new TLRPC$TL_inputStickerSetShortName();
            tLRPC$TL_inputStickerSetShortName2.short_name = ProfileBirthdayEffect.interactionsPack;
            MediaDataController.getInstance(i).getStickerSet(tLRPC$TL_inputStickerSetShortName2, 0, false, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    ProfileBirthdayEffect.BirthdayEffectFetcher.this.lambda$new$3(str2, (TLRPC$TL_messages_stickerSet) obj);
                }
            });
        }

        public void lambda$new$1(HashSet hashSet, ArrayList arrayList, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
            HashMap hashMap = new HashMap();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                TLRPC$Document findSticker = SelectAnimatedEmojiDialog.findSticker(tLRPC$TL_messages_stickerSet, num + "️⃣");
                if (findSticker == null) {
                    findSticker = SelectAnimatedEmojiDialog.findSticker(tLRPC$TL_messages_stickerSet, num + "⃣");
                }
                if (findSticker == null) {
                    FileLog.e("couldn't find " + num + "️⃣ emoji in " + ProfileBirthdayEffect.numbersEmojipack);
                    return;
                }
                hashMap.put(num, findSticker);
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                int intValue = ((Integer) entry.getKey()).intValue();
                final ImageReceiverAsset imageReceiverAsset = new ImageReceiverAsset();
                this.allAssets.add(imageReceiverAsset);
                imageReceiverAsset.setEmoji((TLRPC$Document) entry.getValue(), "80_80", tLRPC$TL_messages_stickerSet, new Runnable() {
                    @Override
                    public final void run() {
                        ProfileBirthdayEffect.BirthdayEffectFetcher.this.lambda$new$0(imageReceiverAsset);
                    }
                });
                imageReceiverAsset.onAttachedToWindow();
                hashMap2.put(Integer.valueOf(intValue), imageReceiverAsset);
            }
            for (int i = 0; i < arrayList.size(); i++) {
                this.digitAssets.add((ImageReceiverAsset) hashMap2.get(Integer.valueOf(((Integer) arrayList.get(i)).intValue())));
            }
            this.setsLoaded[0] = true;
            checkWhenLoaded();
        }

        public void lambda$new$0(ImageReceiverAsset imageReceiverAsset) {
            this.loadedAssets.add(imageReceiverAsset);
            checkWhenLoaded();
        }

        public void lambda$new$3(String str, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet) {
            TLRPC$Document findSticker = SelectAnimatedEmojiDialog.findSticker(tLRPC$TL_messages_stickerSet, str);
            if (findSticker == null) {
                FileLog.e("couldn't find " + str + " sticker in " + ProfileBirthdayEffect.interactionsPack);
                return;
            }
            ImageReceiverAsset imageReceiverAsset = new ImageReceiverAsset();
            this.interactionAsset = imageReceiverAsset;
            this.allAssets.add(imageReceiverAsset);
            int filterWidth = EmojiAnimationsOverlay.getFilterWidth();
            this.interactionAsset.setAutoRepeat(0);
            this.interactionAsset.setEmoji(findSticker, filterWidth + "_" + filterWidth + "_precache", tLRPC$TL_messages_stickerSet, new Runnable() {
                @Override
                public final void run() {
                    ProfileBirthdayEffect.BirthdayEffectFetcher.this.lambda$new$2();
                }
            });
            this.interactionAsset.onAttachedToWindow();
            this.setsLoaded[1] = true;
            checkWhenLoaded();
        }

        public void lambda$new$2() {
            this.loadedAssets.add(this.interactionAsset);
            checkWhenLoaded();
        }

        public void checkWhenLoaded() {
            if (this.loaded || this.loadedAssets.size() < this.allAssets.size()) {
                return;
            }
            boolean[] zArr = this.setsLoaded;
            if (zArr[0] && zArr[1]) {
                this.loaded = true;
                Iterator<Runnable> it = this.callbacks.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
                this.callbacks.clear();
            }
        }

        public void subscribe(Runnable runnable) {
            if (this.loaded) {
                runnable.run();
            } else {
                this.callbacks.add(runnable);
            }
        }

        public void detach(boolean z) {
            if (!z && !this.views.isEmpty()) {
                this.detachLater = true;
                return;
            }
            this.callbacks.clear();
            for (int i = 0; i < this.allAssets.size(); i++) {
                this.allAssets.get(i).onDetachedFromWindow();
            }
            this.allAssets.clear();
        }

        public void addView(ProfileBirthdayEffect profileBirthdayEffect) {
            this.views.add(profileBirthdayEffect);
        }

        public void removeView(ProfileBirthdayEffect profileBirthdayEffect) {
            this.views.remove(profileBirthdayEffect);
            if (this.views.isEmpty() && this.detachLater) {
                detach(true);
                this.detachLater = false;
            }
        }
    }

    public static class ImageReceiverAsset extends ImageReceiver {
        private ImageReceiverAsset() {
        }

        public class AnonymousClass1 implements ImageReceiver.ImageReceiverDelegate {
            final Runnable[] val$callback;

            @Override
            public void didSetImageBitmap(int i, String str, Drawable drawable) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
            }

            @Override
            public void onAnimationReady(ImageReceiver imageReceiver) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
            }

            AnonymousClass1(ImageReceiverAsset imageReceiverAsset, Runnable[] runnableArr) {
                this.val$callback = runnableArr;
            }

            @Override
            public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
                if (!imageReceiver.hasBitmapImage() || this.val$callback[0] == null) {
                    return;
                }
                RLottieDrawable lottieAnimation = imageReceiver.getLottieAnimation();
                if (lottieAnimation == null) {
                    this.val$callback[0].run();
                    this.val$callback[0] = null;
                } else if (lottieAnimation.isGeneratingCache()) {
                    final Runnable[] runnableArr = this.val$callback;
                    lottieAnimation.whenCacheDone = new Runnable() {
                        @Override
                        public final void run() {
                            ProfileBirthdayEffect.ImageReceiverAsset.AnonymousClass1.lambda$didSetImage$0(runnableArr);
                        }
                    };
                } else {
                    this.val$callback[0].run();
                    this.val$callback[0] = null;
                }
            }

            public static void lambda$didSetImage$0(Runnable[] runnableArr) {
                runnableArr[0].run();
                runnableArr[0] = null;
            }
        }

        public void setEmoji(TLRPC$Document tLRPC$Document, String str, TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, Runnable runnable) {
            setDelegate(new AnonymousClass1(this, new Runnable[]{runnable}));
            setImage(ImageLocation.getForDocument(tLRPC$Document), str, null, null, tLRPC$TL_messages_stickerSet, 0);
        }
    }
}
