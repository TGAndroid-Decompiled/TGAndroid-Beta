package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$TL_documentAttributeImageSize;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stories.recorder.HintView2;
public class ChatGreetingsView extends LinearLayout {
    private final int currentAccount;
    private TextView descriptionView;
    boolean ignoreLayot;
    private Listener listener;
    private TLRPC$Document preloadedGreetingsSticker;
    private TextView premiumButtonView;
    private RLottieImageView premiumIconView;
    private boolean premiumLock;
    private TextView premiumTextView;
    private final Theme.ResourcesProvider resourcesProvider;
    public BackupImageView stickerToSendView;
    private TextView titleView;
    boolean wasDraw;

    public interface Listener {
        void onGreetings(TLRPC$Document tLRPC$Document);
    }

    public ChatGreetingsView(Context context, TLRPC$User tLRPC$User, int i, int i2, TLRPC$Document tLRPC$Document, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        setOrientation(1);
        this.currentAccount = i2;
        this.resourcesProvider = resourcesProvider;
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextSize(1, 14.0f);
        this.titleView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.titleView.setTextAlignment(4);
        this.titleView.setGravity(17);
        TextView textView2 = new TextView(context);
        this.descriptionView = textView2;
        textView2.setTextAlignment(4);
        this.descriptionView.setGravity(17);
        this.descriptionView.setTextSize(1, 14.0f);
        this.descriptionView.setGravity(1);
        this.stickerToSendView = new BackupImageView(context);
        updateLayout();
        updateColors();
        if (i <= 0) {
            this.titleView.setText(LocaleController.getString("NoMessages", R.string.NoMessages));
            this.descriptionView.setText(LocaleController.getString("NoMessagesGreetingsDescription", R.string.NoMessagesGreetingsDescription));
        } else {
            this.titleView.setText(LocaleController.formatString("NearbyPeopleGreetingsMessage", R.string.NearbyPeopleGreetingsMessage, tLRPC$User.first_name, LocaleController.formatDistance(i, 1)));
            this.descriptionView.setText(LocaleController.getString("NearbyPeopleGreetingsDescription", R.string.NearbyPeopleGreetingsDescription));
        }
        TextView textView3 = this.descriptionView;
        textView3.setMaxWidth(HintView2.cutInFancyHalf(textView3.getText(), this.descriptionView.getPaint()));
        this.stickerToSendView.setContentDescription(this.descriptionView.getText());
        this.preloadedGreetingsSticker = tLRPC$Document;
        if (tLRPC$Document == null) {
            this.preloadedGreetingsSticker = MediaDataController.getInstance(i2).getGreetingsSticker();
        }
    }

    public void setPremiumLock(boolean z, long j) {
        String formatString;
        TLRPC$User user;
        if (this.premiumLock == z) {
            return;
        }
        this.premiumLock = z;
        if (z) {
            if (this.premiumIconView == null) {
                RLottieImageView rLottieImageView = new RLottieImageView(getContext());
                this.premiumIconView = rLottieImageView;
                rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
                this.premiumIconView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.premiumIconView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(78.0f), 469762048));
                this.premiumIconView.setAnimation(R.raw.large_message_lock, 80, 80);
                this.premiumIconView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ChatGreetingsView.this.lambda$setPremiumLock$0(view);
                    }
                });
            }
            this.premiumIconView.playAnimation();
            if (this.premiumTextView == null) {
                TextView textView = new TextView(getContext());
                this.premiumTextView = textView;
                textView.setTextAlignment(4);
                this.premiumTextView.setGravity(17);
                this.premiumTextView.setTextSize(1, 13.0f);
            }
            String userName = (j < 0 || (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j))) == null) ? BuildConfig.APP_CENTER_HASH : UserObject.getUserName(user);
            if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                formatString = LocaleController.formatString(R.string.MessageLockedPremiumLocked, userName);
            } else {
                formatString = LocaleController.formatString(R.string.MessageLockedPremium, userName);
            }
            this.premiumTextView.setText(AndroidUtilities.replaceTags(formatString));
            TextView textView2 = this.premiumTextView;
            textView2.setMaxWidth(HintView2.cutInFancyHalf(textView2.getText(), this.premiumTextView.getPaint()));
            TextView textView3 = this.premiumTextView;
            int i = Theme.key_chat_serviceText;
            textView3.setTextColor(getThemedColor(i));
            this.premiumTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            if (this.premiumButtonView == null) {
                TextView textView4 = new TextView(this, getContext()) {
                    private final Path clipPath = new Path();
                    StarParticlesView.Drawable starParticlesDrawable;

                    @Override
                    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
                        super.onLayout(z2, i2, i3, i4, i5);
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
                this.premiumButtonView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                this.premiumButtonView.setTextSize(1, 14.0f);
                this.premiumButtonView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(6.66f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(7.0f));
                this.premiumButtonView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(15.0f), 503316480, AndroidUtilities.DARK_STATUS_BAR_OVERLAY));
                ScaleStateListAnimator.apply(this.premiumButtonView);
            }
            this.premiumButtonView.setText(LocaleController.getString(R.string.MessagePremiumUnlock));
            this.premiumButtonView.setTextColor(getThemedColor(i));
            this.premiumButtonView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChatGreetingsView.lambda$setPremiumLock$1(view);
                }
            });
        }
        updateLayout();
    }

    public void lambda$setPremiumLock$0(View view) {
        this.premiumIconView.setProgress(0.0f);
        this.premiumIconView.playAnimation();
    }

    public static void lambda$setPremiumLock$1(View view) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            lastFragment.presentFragment(new PremiumPreviewFragment("contact"));
        }
    }

    private void updateLayout() {
        removeAllViews();
        if (this.premiumLock) {
            addView(this.premiumIconView, LayoutHelper.createLinear(78, 78, 49, 20, 17, 20, 9));
            boolean premiumFeaturesBlocked = MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked();
            addView(this.premiumTextView, LayoutHelper.createLinear(-2, -2, 49, 20, 0, 20, premiumFeaturesBlocked ? 13 : 9));
            if (premiumFeaturesBlocked) {
                return;
            }
            addView(this.premiumButtonView, LayoutHelper.createLinear(-2, 30, 49, 20, 2, 20, 13));
            return;
        }
        addView(this.titleView, LayoutHelper.createLinear(-2, -2, 1, 20, 14, 20, 6));
        addView(this.descriptionView, LayoutHelper.createLinear(-2, -2, 1, 20, 6, 20, 0));
        addView(this.stickerToSendView, LayoutHelper.createLinear((int) R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, (int) R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 1, 0, 16, 0, 16));
    }

    private void setSticker(final TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document == null) {
            return;
        }
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tLRPC$Document, Theme.key_chat_serviceBackground, 1.0f);
        if (svgThumb != null) {
            this.stickerToSendView.setImage(ImageLocation.getForDocument(tLRPC$Document), createFilter(tLRPC$Document), svgThumb, 0, tLRPC$Document);
        } else {
            this.stickerToSendView.setImage(ImageLocation.getForDocument(tLRPC$Document), createFilter(tLRPC$Document), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 90), tLRPC$Document), (String) null, 0, tLRPC$Document);
        }
        this.stickerToSendView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatGreetingsView.this.lambda$setSticker$2(tLRPC$Document, view);
            }
        });
    }

    public void lambda$setSticker$2(TLRPC$Document tLRPC$Document, View view) {
        Listener listener = this.listener;
        if (listener != null) {
            listener.onGreetings(tLRPC$Document);
        }
    }

    public static String createFilter(TLRPC$Document tLRPC$Document) {
        float min;
        float f;
        int i;
        int i2;
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
            f = 0.4f;
        } else {
            android.graphics.Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f = 0.5f;
        }
        float f2 = min * f;
        int i3 = 0;
        while (true) {
            if (i3 >= tLRPC$Document.attributes.size()) {
                i = 0;
                i2 = 0;
                break;
            }
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i3);
            if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeImageSize) {
                i = tLRPC$DocumentAttribute.w;
                i2 = tLRPC$DocumentAttribute.h;
                break;
            }
            i3++;
        }
        if (MessageObject.isAnimatedStickerDocument(tLRPC$Document, true) && i == 0 && i2 == 0) {
            i = LiteMode.FLAG_CALLS_ANIMATIONS;
            i2 = LiteMode.FLAG_CALLS_ANIMATIONS;
        }
        if (i == 0) {
            i2 = (int) f2;
            i = i2 + AndroidUtilities.dp(100.0f);
        }
        int i4 = (int) (i2 * (f2 / i));
        int i5 = (int) f2;
        float f3 = i4;
        if (f3 > f2) {
            i5 = (int) (i5 * (f2 / f3));
            i4 = i5;
        }
        float f4 = i5;
        float f5 = AndroidUtilities.density;
        return String.format(Locale.US, "%d_%d", Integer.valueOf((int) (f4 / f5)), Integer.valueOf((int) (i4 / f5)));
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
        this.descriptionView.setVisibility(0);
        this.stickerToSendView.setVisibility(0);
        super.onMeasure(i, i2);
        if (getMeasuredHeight() > View.MeasureSpec.getSize(i2)) {
            this.descriptionView.setVisibility(8);
            this.stickerToSendView.setVisibility(8);
        } else {
            this.descriptionView.setVisibility(0);
            this.stickerToSendView.setVisibility(0);
        }
        this.ignoreLayot = false;
        super.onMeasure(i, i2);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (!this.wasDraw) {
            this.wasDraw = true;
            setSticker(this.preloadedGreetingsSticker);
        }
        super.dispatchDraw(canvas);
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
            TLRPC$Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.preloadedGreetingsSticker = greetingsSticker;
            if (this.wasDraw) {
                setSticker(greetingsSticker);
            }
        }
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public static void showPremiumSheet(Context context, int i, long j, Theme.ResourcesProvider resourcesProvider) {
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
        boolean premiumFeaturesBlocked = MessagesController.getInstance(i).premiumFeaturesBlocked();
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textView.setGravity(17);
        int i2 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView.setTextSize(1, 20.0f);
        textView.setText(LocaleController.getString(premiumFeaturesBlocked ? R.string.PremiumMessageHeaderLocked : R.string.PremiumMessageHeader));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView2.setTextSize(1, 14.0f);
        String firstName = j > 0 ? UserObject.getFirstName(MessagesController.getInstance(i).getUser(Long.valueOf(j))) : BuildConfig.APP_CENTER_HASH;
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(premiumFeaturesBlocked ? R.string.PremiumMessageTextLocked : R.string.PremiumMessageText, firstName, firstName)));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 12, 9, 12, 19));
        if (!premiumFeaturesBlocked) {
            PremiumButtonView premiumButtonView = new PremiumButtonView(context, true, resourcesProvider);
            premiumButtonView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChatGreetingsView.lambda$showPremiumSheet$3(BottomSheet.this, view);
                }
            });
            premiumButtonView.setOverlayText(LocaleController.getString(R.string.PremiumMessageButton), false, false);
            linearLayout.addView(premiumButtonView, LayoutHelper.createLinear(-1, 48, 1, 0, 0, 0, 4));
        }
        bottomSheet.setCustomView(linearLayout);
        bottomSheet.show();
    }

    public static void lambda$showPremiumSheet$3(BottomSheet bottomSheet, View view) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            lastFragment.presentFragment(new PremiumPreviewFragment("contact"));
            bottomSheet.dismiss();
        }
    }
}
