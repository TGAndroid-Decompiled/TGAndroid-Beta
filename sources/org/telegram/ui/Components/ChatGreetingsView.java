package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.utils.BitmapsCache;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.BusinessIntroActivity;
import org.telegram.ui.Business.BusinessIntroActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$16$$ExternalSyntheticLambda4;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.Stories.recorder.HintView2;

public abstract class ChatGreetingsView extends LinearLayout {
    public static final int $r8$clinit = 0;
    public int backgroundHeight;
    public final int currentAccount;
    public final TextView descriptionView;
    public boolean disableBackground;
    public boolean ignoreLayot;
    public boolean isSuggest;
    public Listener listener;
    public BackupImageView nextStickerToSendView;
    public TLRPC.Document preloadedGreetingsSticker;
    public IntroActivity.AnonymousClass4 premiumButtonView;
    public RLottieImageView premiumIconView;
    public boolean premiumLock;
    public TextView premiumTextView;
    public boolean preview;
    public final Theme.ResourcesProvider resourcesProvider;
    public final FrameLayout stickerContainer;
    public BackupImageView stickerToSendView;
    public final TextView titleView;
    public AnimatorSet togglingStickersAnimator;
    public float viewTop;
    public boolean wasDraw;

    public final class AnonymousClass2 implements ImageReceiver.ImageReceiverDelegate {
        public final BusinessIntroActivity.AnonymousClass1 this$0;
        public final BusinessIntroActivity$$ExternalSyntheticLambda3 val$whenDone;
        public boolean waited;

        public AnonymousClass2(BusinessIntroActivity.AnonymousClass1 anonymousClass1, BusinessIntroActivity$$ExternalSyntheticLambda3 businessIntroActivity$$ExternalSyntheticLambda3) {
            this.this$0 = anonymousClass1;
            this.val$whenDone = businessIntroActivity$$ExternalSyntheticLambda3;
        }

        @Override
        public final void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        }

        @Override
        public final void didSetImageBitmap(int i, String str, Drawable drawable) {
            RLottieDrawable rLottieDrawable;
            BitmapsCache bitmapsCache;
            if (this.waited) {
                return;
            }
            if ((i == 0 || i == 3) && drawable != null) {
                this.waited = true;
                if ((drawable instanceof RLottieDrawable) && (bitmapsCache = (rLottieDrawable = (RLottieDrawable) drawable).bitmapsCache) != null && (!bitmapsCache.cacheCreated || !bitmapsCache.fileExist)) {
                    rLottieDrawable.whenCacheDone = new EmojiView$2$$ExternalSyntheticLambda1(10, this, this.val$whenDone);
                } else {
                    ChatGreetingsView.access$000(this.this$0);
                    this.val$whenDone.run();
                }
            }
        }

        @Override
        public final void onAnimationReady(ImageReceiver imageReceiver) {
            ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
        }
    }

    public interface Listener {
        void onGreetings(TLRPC.Document document);
    }

    public ChatGreetingsView(Context context, int i, TLRPC.Document document, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        setOrientation(1);
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextAlignment(4);
        textView.setGravity(17);
        TextView textView2 = new TextView(context);
        this.descriptionView = textView2;
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.stickerContainer = frameLayout;
        BackupImageView backupImageView = new BackupImageView(context);
        this.stickerToSendView = backupImageView;
        backupImageView.getImageReceiver().setAspectFit(true);
        frameLayout.addView(this.stickerToSendView, LayoutHelper.createFrame(112.0f, 112));
        ScaleStateListAnimator.apply(this.stickerToSendView, 0.1f, 1.5f);
        BackupImageView backupImageView2 = new BackupImageView(context);
        this.nextStickerToSendView = backupImageView2;
        backupImageView2.getImageReceiver().setAspectFit(true);
        frameLayout.addView(this.nextStickerToSendView, LayoutHelper.createFrame(112.0f, 112));
        this.nextStickerToSendView.setVisibility(8);
        this.nextStickerToSendView.setAlpha(0.0f);
        ScaleStateListAnimator.apply(this.nextStickerToSendView, 0.1f, 1.5f);
        updateLayout();
        int i2 = Theme.key_chat_serviceText;
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
        String string = LocaleController.getString(R.string.NoMessages);
        String string2 = LocaleController.getString(R.string.NoMessagesGreetingsDescription);
        textView.setText(string);
        textView2.setText(string2);
        textView2.setMaxWidth(HintView2.cutInFancyHalf(textView2.getText(), textView2.getPaint()));
        this.stickerToSendView.setContentDescription(textView2.getText());
        this.preloadedGreetingsSticker = document;
        if (document == null) {
            this.preloadedGreetingsSticker = MediaDataController.getInstance(i).getGreetingsSticker();
        }
    }

    public static void access$000(BusinessIntroActivity.AnonymousClass1 anonymousClass1) {
        AnimatorSet animatorSet = anonymousClass1.togglingStickersAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        anonymousClass1.nextStickerToSendView.setVisibility(0);
        anonymousClass1.stickerToSendView.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        anonymousClass1.togglingStickersAnimator = animatorSet2;
        animatorSet2.setDuration(420L);
        anonymousClass1.togglingStickersAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        anonymousClass1.togglingStickersAnimator.addListener(new ChatActivity.AnonymousClass77(anonymousClass1));
        AnimatorSet animatorSet3 = anonymousClass1.togglingStickersAnimator;
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(anonymousClass1.nextStickerToSendView, (Property<BackupImageView, Float>) property, 0.0f, 1.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(anonymousClass1.nextStickerToSendView, (Property<BackupImageView, Float>) property2, 0.7f, 1.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(anonymousClass1.nextStickerToSendView, (Property<BackupImageView, Float>) property3, 0.7f, 1.0f);
        BackupImageView backupImageView = anonymousClass1.nextStickerToSendView;
        float[] fArr = {-AndroidUtilities.dp(24.0f), 0.0f};
        Property property4 = View.TRANSLATION_Y;
        animatorSet3.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, ObjectAnimator.ofFloat(backupImageView, (Property<BackupImageView, Float>) property4, fArr), ObjectAnimator.ofFloat(anonymousClass1.stickerToSendView, (Property<BackupImageView, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(anonymousClass1.stickerToSendView, (Property<BackupImageView, Float>) property2, 1.0f, 0.7f), ObjectAnimator.ofFloat(anonymousClass1.stickerToSendView, (Property<BackupImageView, Float>) property3, 1.0f, 0.7f), ObjectAnimator.ofFloat(anonymousClass1.stickerToSendView, (Property<BackupImageView, Float>) property4, 0.0f, AndroidUtilities.dp(24.0f)));
        anonymousClass1.togglingStickersAnimator.start();
    }

    public static String createFilter(TLRPC.Document document) {
        float fMin;
        float f;
        int i;
        if (AndroidUtilities.isTablet()) {
            fMin = AndroidUtilities.getMinTabletSide();
            f = 0.4f;
        } else {
            Point point = AndroidUtilities.displaySize;
            fMin = Math.min(point.x, point.y);
            f = 0.5f;
        }
        float f2 = fMin * f;
        int iDp = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= document.attributes.size()) {
                i = 0;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i2);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                iDp = documentAttribute.w;
                i = documentAttribute.h;
                break;
            }
            i2++;
        }
        if (MessageObject.isAnimatedStickerDocument(document, true) && iDp == 0 && i == 0) {
            iDp = 512;
            i = 512;
        }
        if (iDp == 0) {
            i = (int) f2;
            iDp = AndroidUtilities.dp(100.0f) + i;
        }
        int i3 = (int) ((f2 / iDp) * i);
        int i4 = (int) f2;
        float f3 = i3;
        if (f3 > f2) {
            i4 = (int) ((f2 / f3) * i4);
            i3 = i4;
        }
        float f4 = i4;
        float f5 = AndroidUtilities.density;
        int i5 = (int) (f4 / f5);
        int i6 = (int) (i3 / f5);
        Locale locale = Locale.US;
        return i5 + "_" + i6;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.disableBackground) {
            canvas2 = canvas;
        } else {
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (resourcesProvider != null) {
                resourcesProvider.applyServiceShaderMatrix(0.0f, this.viewTop + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.backgroundHeight);
            } else {
                Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, getMeasuredWidth(), this.backgroundHeight, 0.0f, this.viewTop + AndroidUtilities.dp(4.0f));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Theme.getThemePaint("paintChatActionBackground", resourcesProvider));
        }
        if (!this.wasDraw) {
            this.wasDraw = true;
            setSticker(this.preloadedGreetingsSticker);
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.preloadedGreetingsSticker == null) {
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.preloadedGreetingsSticker = greetingsSticker;
            if (this.wasDraw) {
                setSticker(greetingsSticker);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public void onMeasure(int i, int i2) {
        this.ignoreLayot = true;
        boolean z = this.preview;
        TextView textView = this.descriptionView;
        if (!z) {
            textView.setVisibility(0);
        }
        this.stickerToSendView.setVisibility(0);
        super.onMeasure(i, i2);
        if (getMeasuredHeight() <= View.MeasureSpec.getSize(i2) || this.preview) {
            if (!this.preview) {
                textView.setVisibility(0);
            }
            this.stickerToSendView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.stickerToSendView.setVisibility(8);
        }
        this.ignoreLayot = false;
        super.onMeasure(i, i2);
    }

    @Override
    public final void requestLayout() {
        if (this.ignoreLayot) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        this.disableBackground = true;
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public final void setPremiumLock(boolean z, boolean z2, SpannableStringBuilder spannableStringBuilder, String str, View.OnClickListener onClickListener) {
        if (this.premiumLock == z) {
            return;
        }
        this.premiumLock = z;
        this.isSuggest = z2;
        if (z) {
            if (this.premiumIconView == null) {
                RLottieImageView rLottieImageView = new RLottieImageView(getContext());
                this.premiumIconView = rLottieImageView;
                rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
                this.premiumIconView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.premiumIconView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(78.0f), 469762048));
                if (z2) {
                    this.premiumIconView.setImageResource(R.drawable.filled_chatlist2);
                } else {
                    this.premiumIconView.setAnimation(R.raw.large_message_lock, 80, 80, null);
                    this.premiumIconView.setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(this, 11));
                }
            }
            this.premiumIconView.playAnimation();
            if (this.premiumTextView == null) {
                TextView textView = new TextView(getContext());
                this.premiumTextView = textView;
                textView.setTextAlignment(4);
                this.premiumTextView.setGravity(17);
                this.premiumTextView.setTextSize(1, 13.0f);
            }
            this.premiumTextView.setText(spannableStringBuilder);
            TextView textView2 = this.premiumTextView;
            textView2.setMaxWidth(HintView2.cutInFancyHalf(textView2.getText(), this.premiumTextView.getPaint()));
            TextView textView3 = this.premiumTextView;
            int i = Theme.key_chat_serviceText;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            textView3.setTextColor(Theme.getColor(i, resourcesProvider));
            this.premiumTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            if (this.premiumButtonView == null) {
                IntroActivity.AnonymousClass4 anonymousClass4 = new IntroActivity.AnonymousClass4(getContext());
                this.premiumButtonView = anonymousClass4;
                anonymousClass4.setTextAlignment(4);
                this.premiumButtonView.setGravity(17);
                this.premiumButtonView.setTypeface(AndroidUtilities.bold());
                this.premiumButtonView.setTextSize(1, 14.0f);
                this.premiumButtonView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                IntroActivity.AnonymousClass4 anonymousClass5 = this.premiumButtonView;
                int iDp = AndroidUtilities.dp(15.0f);
                anonymousClass5.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 503316480, 855638016, 855638016));
                ScaleStateListAnimator.apply(this.premiumButtonView, 0.1f, 1.5f);
            }
            this.premiumButtonView.setText(str);
            this.premiumButtonView.setTextColor(Theme.getColor(i, resourcesProvider));
            this.premiumButtonView.setOnClickListener(onClickListener);
        }
        updateLayout();
    }

    public final void setPreview(CharSequence charSequence, CharSequence charSequence2) {
        this.preview = true;
        if (TextUtils.isEmpty(charSequence == null ? null : charSequence.toString().trim())) {
            charSequence = LocaleController.getString(R.string.NoMessages);
        }
        this.titleView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence2 != null ? charSequence2.toString().trim() : null)) {
            charSequence2 = LocaleController.getString(R.string.NoMessagesGreetingsDescription);
        }
        TextView textView = this.descriptionView;
        textView.setText(charSequence2);
        textView.setMaxWidth(textView.getText().length() > 60 ? Math.min((int) (AndroidUtilities.displaySize.x * 0.5f), HintView2.cutInFancyHalf(textView.getText(), textView.getPaint())) : (int) (AndroidUtilities.displaySize.x * 0.5f));
    }

    public void setSticker(TLRPC.Document document) {
        TLRPC.Document document2;
        if (document == null) {
            return;
        }
        this.wasDraw = true;
        this.nextStickerToSendView.imageReceiver.clearImage();
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, Theme.key_chat_serviceBackground, 1.0f);
        if (svgThumb != null) {
            this.stickerToSendView.setImage$1(ImageLocation.getForDocument(document), createFilter(document), svgThumb, document);
            document2 = document;
        } else {
            document2 = document;
            this.stickerToSendView.setImage(ImageLocation.getForDocument(document), createFilter(document), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), null, null, null, 0, document2);
        }
        this.stickerToSendView.setOnClickListener(new ChatGreetingsView$$ExternalSyntheticLambda2(this, document2, 0));
    }

    public final void updateLayout() {
        removeAllViews();
        if (!this.premiumLock) {
            addView(this.titleView, LayoutHelper.createLinear(-2, -2, 1, 20, 6, 20, 6));
            addView(this.descriptionView, LayoutHelper.createLinear(-2, -2, 1, 20, 6, 20, 6));
            addView(this.stickerContainer, LayoutHelper.createLinear(112, 112, 1, 16, 10, 16, 16));
            return;
        }
        addView(this.premiumIconView, LayoutHelper.createLinear(78, 78, 49, 20, 9, 20, 9));
        boolean zPremiumFeaturesBlocked = MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked();
        addView(this.premiumTextView, LayoutHelper.createLinear(-2, -2, 49, 20, 0, 20, zPremiumFeaturesBlocked ? 13 : 9));
        if (zPremiumFeaturesBlocked) {
            return;
        }
        IntroActivity.AnonymousClass4 anonymousClass4 = this.premiumButtonView;
        if ((anonymousClass4 == null || TextUtils.isEmpty(anonymousClass4.getText())) && this.isSuggest) {
            return;
        }
        addView(this.premiumButtonView, LayoutHelper.createLinear(-2, 30, 49, 20, 2, 20, 13));
    }

    public void setSticker(String str) {
        if (str == null) {
            return;
        }
        this.wasDraw = true;
        this.nextStickerToSendView.imageReceiver.clearImage();
        this.stickerToSendView.setImage(ImageLocation.getForPath(str), "256_256", null, null, null, null, 0, null);
    }
}
