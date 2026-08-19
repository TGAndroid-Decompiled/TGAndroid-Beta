package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
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
import org.telegram.messenger.UserObject;
import org.telegram.messenger.utils.BitmapsCache;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stories.recorder.HintView2;

public abstract class ChatGreetingsView extends LinearLayout {
    private int backgroundHeight;
    private final int currentAccount;
    private TextView descriptionView;
    private boolean disableBackground;
    boolean ignoreLayot;
    private boolean isSuggest;
    private Listener listener;
    public BackupImageView nextStickerToSendView;
    private TLRPC.Document preloadedGreetingsSticker;
    private TextView premiumButtonView;
    private RLottieImageView premiumIconView;
    private boolean premiumLock;
    private TextView premiumTextView;
    public boolean preview;
    private final Theme.ResourcesProvider resourcesProvider;
    public FrameLayout stickerContainer;
    public BackupImageView stickerToSendView;
    private TextView titleView;
    private AnimatorSet togglingStickersAnimator;
    private float viewTop;
    private float viewTranslationX;
    private boolean visiblePartSet;
    boolean wasDraw;

    public interface Listener {
        void onGreetings(TLRPC.Document document);
    }

    public ChatGreetingsView(Context context, TLRPC.User user, int i, TLRPC.Document document, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        setOrientation(1);
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextSize(1, 14.0f);
        this.titleView.setTypeface(AndroidUtilities.bold());
        this.titleView.setTextAlignment(4);
        this.titleView.setGravity(17);
        TextView textView2 = new TextView(context);
        this.descriptionView = textView2;
        textView2.setTextAlignment(4);
        this.descriptionView.setGravity(17);
        this.descriptionView.setTextSize(1, 14.0f);
        this.descriptionView.setGravity(1);
        this.stickerContainer = new FrameLayout(context);
        BackupImageView backupImageView = new BackupImageView(context);
        this.stickerToSendView = backupImageView;
        backupImageView.getImageReceiver().setAspectFit(true);
        this.stickerContainer.addView(this.stickerToSendView, LayoutHelper.createFrame(112, 112.0f));
        ScaleStateListAnimator.apply(this.stickerToSendView);
        BackupImageView backupImageView2 = new BackupImageView(context);
        this.nextStickerToSendView = backupImageView2;
        backupImageView2.getImageReceiver().setAspectFit(true);
        this.stickerContainer.addView(this.nextStickerToSendView, LayoutHelper.createFrame(112, 112.0f));
        this.nextStickerToSendView.setVisibility(8);
        this.nextStickerToSendView.setAlpha(0.0f);
        ScaleStateListAnimator.apply(this.nextStickerToSendView);
        updateLayout();
        updateColors();
        setText(LocaleController.getString(R.string.NoMessages), LocaleController.getString(R.string.NoMessagesGreetingsDescription));
        this.preloadedGreetingsSticker = document;
        if (document == null) {
            this.preloadedGreetingsSticker = MediaDataController.getInstance(i).getGreetingsSticker();
        }
    }

    public void setText(CharSequence charSequence, CharSequence charSequence2) {
        this.titleView.setText(charSequence);
        this.descriptionView.setText(charSequence2);
        TextView textView = this.descriptionView;
        textView.setMaxWidth(HintView2.cutInFancyHalf(textView.getText(), this.descriptionView.getPaint()));
        this.stickerToSendView.setContentDescription(this.descriptionView.getText());
    }

    public void resetPremiumLock() {
        setPremiumLock(false, null, null, null);
    }

    public void setPremiumLock(boolean z, CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        setPremiumLock(z, false, charSequence, charSequence2, onClickListener);
    }

    public void setPremiumLock(boolean z, boolean z2, CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
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
                    this.premiumIconView.setAnimation(R.raw.large_message_lock, 80, 80);
                    this.premiumIconView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            ChatGreetingsView.$r8$lambda$06XqzI5PQJZLi1lFTz35DaWMwKg(this.f$0, view);
                        }
                    });
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
            this.premiumTextView.setText(charSequence);
            TextView textView2 = this.premiumTextView;
            textView2.setMaxWidth(HintView2.cutInFancyHalf(textView2.getText(), this.premiumTextView.getPaint()));
            TextView textView3 = this.premiumTextView;
            int i = Theme.key_chat_serviceText;
            textView3.setTextColor(getThemedColor(i));
            this.premiumTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            if (this.premiumButtonView == null) {
                TextView textView4 = new TextView(getContext()) {
                    private final Path clipPath = new Path();
                    StarParticlesView.Drawable starParticlesDrawable;

                    @Override
                    protected void onLayout(boolean z3, int i2, int i3, int i4, int i5) {
                        super.onLayout(z3, i2, i3, i4, i5);
                        StarParticlesView.Drawable drawable = new StarParticlesView.Drawable(10);
                        this.starParticlesDrawable = drawable;
                        drawable.type = 100;
                        drawable.isCircle = false;
                        drawable.roundEffect = true;
                        drawable.useRotate = false;
                        drawable.useBlur = true;
                        drawable.checkBounds = true;
                        drawable.size1 = 1;
                        drawable.k3 = 0.98f;
                        drawable.k2 = 0.98f;
                        drawable.k1 = 0.98f;
                        drawable.paused = false;
                        drawable.speedScale = 0.0f;
                        drawable.minLifeTime = 750L;
                        drawable.randLifeTime = 750;
                        drawable.init();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        this.starParticlesDrawable.rect.set(rectF);
                        this.starParticlesDrawable.rect2.set(rectF);
                        this.starParticlesDrawable.resetPositions();
                        this.clipPath.reset();
                        this.clipPath.addRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, Path.Direction.CW);
                    }

                    @Override
                    protected void onDraw(Canvas canvas) {
                        if (this.starParticlesDrawable != null) {
                            canvas.save();
                            canvas.clipPath(this.clipPath);
                            this.starParticlesDrawable.onDraw(canvas);
                            canvas.restore();
                            invalidate();
                        }
                        super.onDraw(canvas);
                    }
                };
                this.premiumButtonView = textView4;
                textView4.setTextAlignment(4);
                this.premiumButtonView.setGravity(17);
                this.premiumButtonView.setTypeface(AndroidUtilities.bold());
                this.premiumButtonView.setTextSize(1, 14.0f);
                this.premiumButtonView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                this.premiumButtonView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(15.0f), 503316480, 855638016));
                ScaleStateListAnimator.apply(this.premiumButtonView);
            }
            this.premiumButtonView.setText(charSequence2);
            this.premiumButtonView.setTextColor(getThemedColor(i));
            this.premiumButtonView.setOnClickListener(onClickListener);
        }
        updateLayout();
    }

    public static void $r8$lambda$06XqzI5PQJZLi1lFTz35DaWMwKg(ChatGreetingsView chatGreetingsView, View view) {
        chatGreetingsView.premiumIconView.setProgress(0.0f);
        chatGreetingsView.premiumIconView.playAnimation();
    }

    private void updateLayout() {
        removeAllViews();
        if (this.premiumLock) {
            addView(this.premiumIconView, LayoutHelper.createLinear(78, 78, 49, 20, 9, 20, 9));
            boolean zPremiumFeaturesBlocked = MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked();
            addView(this.premiumTextView, LayoutHelper.createLinear(-2, -2, 49, 20, 0, 20, zPremiumFeaturesBlocked ? 13 : 9));
            if (zPremiumFeaturesBlocked) {
                return;
            }
            TextView textView = this.premiumButtonView;
            if ((textView == null || TextUtils.isEmpty(textView.getText())) && this.isSuggest) {
                return;
            }
            addView(this.premiumButtonView, LayoutHelper.createLinear(-2, 30, 49, 20, 2, 20, 13));
            return;
        }
        addView(this.titleView, LayoutHelper.createLinear(-2, -2, 1, 20, 6, 20, 6));
        addView(this.descriptionView, LayoutHelper.createLinear(-2, -2, 1, 20, 6, 20, 6));
        addView(this.stickerContainer, LayoutHelper.createLinear(112, 112, 1, 16, 10, 16, 16));
    }

    public void setSticker(TLRPC.Document document) {
        final TLRPC.Document document2;
        if (document == null) {
            return;
        }
        this.wasDraw = true;
        this.nextStickerToSendView.clearImage();
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, Theme.key_chat_serviceBackground, 1.0f);
        if (svgThumb != null) {
            document2 = document;
            this.stickerToSendView.setImage(ImageLocation.getForDocument(document), createFilter(document), svgThumb, 0, document2);
        } else {
            this.stickerToSendView.setImage(ImageLocation.getForDocument(document), createFilter(document), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, 0, document);
            document2 = document;
        }
        this.stickerToSendView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatGreetingsView.$r8$lambda$flfrJ0LaBGFFJqtR9RCK7UdR_5E(this.f$0, document2, view);
            }
        });
    }

    public static void $r8$lambda$flfrJ0LaBGFFJqtR9RCK7UdR_5E(ChatGreetingsView chatGreetingsView, TLRPC.Document document, View view) {
        Listener listener = chatGreetingsView.listener;
        if (listener != null) {
            listener.onGreetings(document);
        }
    }

    public void setSticker(String str) {
        if (str == null) {
            return;
        }
        this.wasDraw = true;
        this.nextStickerToSendView.clearImage();
        this.stickerToSendView.setImage(ImageLocation.getForPath(str), "256_256", (ImageLocation) null, (String) null, 0, (Object) null);
    }

    public void setNextSticker(TLRPC.Document document, Runnable runnable) {
        final TLRPC.Document document2;
        if (document == null) {
            return;
        }
        AnimatorSet animatorSet = this.togglingStickersAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.nextStickerToSendView.getImageReceiver().setDelegate(new AnonymousClass2(runnable));
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, Theme.key_chat_serviceBackground, 1.0f);
        if (svgThumb != null) {
            document2 = document;
            this.nextStickerToSendView.setImage(ImageLocation.getForDocument(document), createFilter(document), svgThumb, 0, document2);
        } else {
            this.nextStickerToSendView.setImage(ImageLocation.getForDocument(document), createFilter(document), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, 0, document);
            document2 = document;
        }
        this.nextStickerToSendView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatGreetingsView.$r8$lambda$sE5lOh5buuYAbmETqF9wS7ZFYT0(this.f$0, document2, view);
            }
        });
    }

    class AnonymousClass2 implements ImageReceiver.ImageReceiverDelegate {
        final Runnable val$whenDone;
        private boolean waited;

        @Override
        public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        }

        @Override
        public void onAnimationReady(ImageReceiver imageReceiver) {
            ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
        }

        AnonymousClass2(Runnable runnable) {
            this.val$whenDone = runnable;
        }

        @Override
        public void didSetImageBitmap(int i, String str, Drawable drawable) {
            RLottieDrawable rLottieDrawable;
            BitmapsCache bitmapsCache;
            if (this.waited) {
                return;
            }
            if ((i == 0 || i == 3) && drawable != null) {
                this.waited = true;
                if (!(drawable instanceof RLottieDrawable) || (bitmapsCache = (rLottieDrawable = (RLottieDrawable) drawable).bitmapsCache) == null || !bitmapsCache.needGenCache()) {
                    ChatGreetingsView.this.toggleToNextSticker();
                    Runnable runnable = this.val$whenDone;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                final Runnable runnable2 = this.val$whenDone;
                rLottieDrawable.whenCacheDone = new Runnable() {
                    @Override
                    public final void run() {
                        ChatGreetingsView.AnonymousClass2.$r8$lambda$LnOldy349nLDS3inONUcbmDOCfw(this.f$0, runnable2);
                    }
                };
            }
        }

        public static void $r8$lambda$LnOldy349nLDS3inONUcbmDOCfw(AnonymousClass2 anonymousClass2, Runnable runnable) {
            ChatGreetingsView.this.toggleToNextSticker();
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public static void $r8$lambda$sE5lOh5buuYAbmETqF9wS7ZFYT0(ChatGreetingsView chatGreetingsView, TLRPC.Document document, View view) {
        Listener listener = chatGreetingsView.listener;
        if (listener != null) {
            listener.onGreetings(document);
        }
    }

    public void toggleToNextSticker() {
        AnimatorSet animatorSet = this.togglingStickersAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.nextStickerToSendView.setVisibility(0);
        this.stickerToSendView.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.togglingStickersAnimator = animatorSet2;
        animatorSet2.setDuration(420L);
        this.togglingStickersAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.togglingStickersAnimator.addListener(new AnimatorListenerAdapter() {
            private boolean cancelled;

            @Override
            public void onAnimationEnd(Animator animator) {
                if (this.cancelled) {
                    return;
                }
                ChatGreetingsView chatGreetingsView = ChatGreetingsView.this;
                BackupImageView backupImageView = chatGreetingsView.stickerToSendView;
                chatGreetingsView.stickerToSendView = chatGreetingsView.nextStickerToSendView;
                chatGreetingsView.nextStickerToSendView = backupImageView;
                backupImageView.setVisibility(8);
                ChatGreetingsView.this.nextStickerToSendView.setAlpha(0.0f);
                ChatGreetingsView.this.stickerToSendView.setVisibility(0);
                ChatGreetingsView.this.stickerToSendView.setAlpha(1.0f);
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                this.cancelled = true;
            }
        });
        AnimatorSet animatorSet3 = this.togglingStickersAnimator;
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.nextStickerToSendView, (Property<BackupImageView, Float>) property, 0.0f, 1.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.nextStickerToSendView, (Property<BackupImageView, Float>) property2, 0.7f, 1.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.nextStickerToSendView, (Property<BackupImageView, Float>) property3, 0.7f, 1.0f);
        BackupImageView backupImageView = this.nextStickerToSendView;
        float[] fArr = {-AndroidUtilities.dp(24.0f), 0.0f};
        Property property4 = View.TRANSLATION_Y;
        animatorSet3.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, ObjectAnimator.ofFloat(backupImageView, (Property<BackupImageView, Float>) property4, fArr), ObjectAnimator.ofFloat(this.stickerToSendView, (Property<BackupImageView, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.stickerToSendView, (Property<BackupImageView, Float>) property2, 1.0f, 0.7f), ObjectAnimator.ofFloat(this.stickerToSendView, (Property<BackupImageView, Float>) property3, 1.0f, 0.7f), ObjectAnimator.ofFloat(this.stickerToSendView, (Property<BackupImageView, Float>) property4, 0.0f, AndroidUtilities.dp(24.0f)));
        this.togglingStickersAnimator.start();
    }

    public static String createFilter(TLRPC.Document document) {
        float fMin;
        float f;
        int iDp;
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
        int i2 = 0;
        while (true) {
            if (i2 >= document.attributes.size()) {
                iDp = 0;
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
            iDp = i + AndroidUtilities.dp(100.0f);
        }
        int i3 = (int) (i * (f2 / iDp));
        int i4 = (int) f2;
        float f3 = i3;
        if (f3 > f2) {
            i4 = (int) (i4 * (f2 / f3));
            i3 = i4;
        }
        float f4 = i4;
        float f5 = AndroidUtilities.density;
        return String.format(Locale.US, "%d_%d", Integer.valueOf((int) (f4 / f5)), Integer.valueOf((int) (i3 / f5)));
    }

    private void updateColors() {
        TextView textView = this.titleView;
        int i = Theme.key_chat_serviceText;
        textView.setTextColor(getThemedColor(i));
        this.descriptionView.setTextColor(getThemedColor(i));
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        this.ignoreLayot = true;
        if (!this.preview) {
            this.descriptionView.setVisibility(0);
        }
        this.stickerToSendView.setVisibility(0);
        super.onMeasure(i, i2);
        if (getMeasuredHeight() > View.MeasureSpec.getSize(i2) && !this.preview) {
            this.descriptionView.setVisibility(8);
            this.stickerToSendView.setVisibility(8);
        } else {
            if (!this.preview) {
                this.descriptionView.setVisibility(0);
            }
            this.stickerToSendView.setVisibility(0);
        }
        this.ignoreLayot = false;
        super.onMeasure(i, i2);
    }

    public void setPreview(CharSequence charSequence, CharSequence charSequence2) {
        int iMin;
        this.preview = true;
        TextView textView = this.titleView;
        if (TextUtils.isEmpty(charSequence == null ? null : charSequence.toString().trim())) {
            charSequence = LocaleController.getString(R.string.NoMessages);
        }
        textView.setText(charSequence);
        TextView textView2 = this.descriptionView;
        if (TextUtils.isEmpty(charSequence2 != null ? charSequence2.toString().trim() : null)) {
            charSequence2 = LocaleController.getString(R.string.NoMessagesGreetingsDescription);
        }
        textView2.setText(charSequence2);
        TextView textView3 = this.descriptionView;
        if (textView3.getText().length() > 60) {
            iMin = Math.min((int) (AndroidUtilities.displaySize.x * 0.5f), HintView2.cutInFancyHalf(this.descriptionView.getText(), this.descriptionView.getPaint()));
        } else {
            iMin = (int) (AndroidUtilities.displaySize.x * 0.5f);
        }
        textView3.setMaxWidth(iMin);
    }

    public void setVisiblePart(float f, int i) {
        this.visiblePartSet = true;
        this.backgroundHeight = i;
        this.viewTop = f;
        this.viewTranslationX = 0.0f;
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.disableBackground) {
            canvas2 = canvas;
        } else {
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (resourcesProvider != null) {
                resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
            } else {
                Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Theme.getThemePaint("paintChatActionBackground", this.resourcesProvider));
        }
        if (!this.wasDraw) {
            this.wasDraw = true;
            setSticker(this.preloadedGreetingsSticker);
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayot) {
            return;
        }
        super.requestLayout();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        fetchSticker();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    private void fetchSticker() {
        if (this.preloadedGreetingsSticker == null) {
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.preloadedGreetingsSticker = greetingsSticker;
            if (this.wasDraw) {
                setSticker(greetingsSticker);
            }
        }
    }

    @Override
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        this.disableBackground = true;
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public static void showPremiumSheet(Context context, int i, long j, Theme.ResourcesProvider resourcesProvider) {
        String firstName;
        final BottomSheet bottomSheet = new BottomSheet(context, false, resourcesProvider);
        bottomSheet.fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setAnimation(R.raw.large_message_lock, 80, 80);
        rLottieImageView.playAnimation();
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        rLottieImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
        linearLayout.addView(rLottieImageView, LayoutHelper.createLinear(80, 80, 1, 0, 16, 0, 16));
        boolean zPremiumFeaturesBlocked = MessagesController.getInstance(i).premiumFeaturesBlocked();
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i2 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView.setTextSize(1, 20.0f);
        textView.setText(LocaleController.getString(zPremiumFeaturesBlocked ? R.string.PremiumMessageHeaderLocked : R.string.PremiumMessageHeader));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView2.setTextSize(1, 14.0f);
        if (j <= 0) {
            firstName = "";
        } else {
            firstName = UserObject.getFirstName(MessagesController.getInstance(i).getUser(Long.valueOf(j)));
        }
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(zPremiumFeaturesBlocked ? R.string.PremiumMessageTextLocked : R.string.PremiumMessageText, firstName, firstName)));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 12, 9, 12, 19));
        if (!zPremiumFeaturesBlocked) {
            PremiumButtonView premiumButtonView = new PremiumButtonView(context, true, resourcesProvider);
            premiumButtonView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChatGreetingsView.$r8$lambda$13a8CLbV7ZHYOY05YUpOVmneXOw(bottomSheet, view);
                }
            });
            premiumButtonView.setOverlayText(LocaleController.getString(R.string.PremiumMessageButton), false, false);
            linearLayout.addView(premiumButtonView, LayoutHelper.createLinear(-1, 48, 1, 0, 0, 0, 4));
        }
        bottomSheet.setCustomView(linearLayout);
        bottomSheet.show();
    }

    public static void $r8$lambda$13a8CLbV7ZHYOY05YUpOVmneXOw(BottomSheet bottomSheet, View view) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            lastFragment.presentFragment(new PremiumPreviewFragment("contact"));
            bottomSheet.dismiss();
        }
    }
}
