package org.telegram.ui.Stories;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.internal.mlkit_vision_common.zzkb;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.utils.GradientProtectionDrawable;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Views.StoryLinkPreviewDialog;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.DialogsActivity$25$$ExternalSyntheticLambda14;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stars.BalanceCloud$$ExternalSyntheticLambda1;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.PreviewHighlightView;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda2;
import org.telegram.ui.community.CommunityEditActivity;

public final class StealthModeAlert extends BottomSheet {
    public static final int $r8$clinit = 0;
    public final PremiumButtonView button;
    public DialogsActivity$25$$ExternalSyntheticLambda14 listener;
    public boolean stealthModeIsActive;
    public final int type;
    public final BalanceCloud$$ExternalSyntheticLambda1 updateButtonRunnuble;

    public StealthModeAlert(Context context, final float f, final int i, final Theme.ResourcesProvider resourcesProvider) {
        super(context, false, false, resourcesProvider);
        this.updateButtonRunnuble = new BalanceCloud$$ExternalSyntheticLambda1(this, 29);
        this.type = i;
        FrameLayout frameLayout = new FrameLayout(getContext()) {
            @Override
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                Bulletin.addDelegate(StealthModeAlert.this.container, new Bulletin.Delegate() {
                    @Override
                    public final boolean allowLayoutChanges() {
                        return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
                    }

                    @Override
                    public final boolean bottomOffsetAnimated() {
                        return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
                    }

                    @Override
                    public final boolean clipWithGradient(int i2) {
                        return Bulletin.Delegate.CC.$default$clipWithGradient(this, i2);
                    }

                    @Override
                    public final int getBottomOffset(int i2) {
                        return Bulletin.Delegate.CC.$default$getBottomOffset(this, i2);
                    }

                    @Override
                    public final int getLeftPadding() {
                        return Bulletin.Delegate.CC.$default$getLeftPadding(this);
                    }

                    @Override
                    public final int getRightPadding() {
                        return Bulletin.Delegate.CC.$default$getRightPadding(this);
                    }

                    @Override
                    public final int getTopOffset(int i2) {
                        return (int) (f + AndroidUtilities.dp(58.0f));
                    }

                    @Override
                    public final void onBottomOffsetChange(float f2) {
                        Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f2);
                    }

                    @Override
                    public final void onHide(Bulletin bulletin) {
                        Bulletin.Delegate.CC.$default$onHide(this, bulletin);
                    }

                    @Override
                    public final void onShow(Bulletin bulletin) {
                        Bulletin.Delegate.CC.$default$onShow(this, bulletin);
                    }
                });
            }

            @Override
            public final void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                Bulletin.removeDelegate(StealthModeAlert.this.container);
            }
        };
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(null, Theme.key_featuredStickers_addButton, false)));
        imageView.setImageResource(R.drawable.large_stealth);
        frameLayout.addView(imageView, LayoutHelper.createFrame(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        zzkb.m(20.0f, 1, textView);
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        textView.setText(LocaleController.getString(R.string.StealthModeTitle));
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 1));
        SimpleTextView simpleTextView = new SimpleTextView(getContext());
        simpleTextView.setTextSize(14);
        simpleTextView.setAlignment(Layout.Alignment.ALIGN_CENTER);
        simpleTextView.setMaxLines(100);
        simpleTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            simpleTextView.setText(LocaleController.getString(R.string.StealthModeHint));
        } else {
            simpleTextView.setText(LocaleController.getString(R.string.StealthModePremiumHint));
        }
        linearLayout.addView(simpleTextView, LayoutHelper.createLinear(-2, -2, 1, 36, 10, 36, 0));
        ItemCell itemCell = new ItemCell(this, getContext());
        ((ImageView) itemCell.imageView).setImageResource(R.drawable.msg_stealth_5min);
        ((TextView) itemCell.textView).setText(LocaleController.getString(R.string.HideRecentViews));
        ((TextView) itemCell.description).setText(LocaleController.getString(R.string.HideRecentViewsDescription));
        linearLayout.addView(itemCell, LayoutHelper.createLinear(-1, -2, 0, 0, 20, 0, 0));
        ItemCell itemCell2 = new ItemCell(this, getContext());
        ((ImageView) itemCell2.imageView).setImageResource(R.drawable.msg_stealth_25min);
        ((TextView) itemCell2.textView).setText(LocaleController.getString(R.string.HideNextViews));
        ((TextView) itemCell2.description).setText(LocaleController.getString(R.string.HideNextViewsDescription));
        linearLayout.addView(itemCell2, LayoutHelper.createLinear(-1, -2, 0, 0, 10, 0, 0));
        PremiumButtonView premiumButtonView = new PremiumButtonView(context, AndroidUtilities.dp(8.0f), true, resourcesProvider);
        this.button = premiumButtonView;
        premiumButtonView.drawGradient = false;
        premiumButtonView.overlayTextView.getDrawable().setSplitByWords(false);
        int i2 = R.raw.unlock_icon;
        premiumButtonView.setIcon(i2);
        ScaleStateListAnimator.apply(premiumButtonView);
        final TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (currentUser.premium) {
            updateButton$1(false);
        } else {
            premiumButtonView.setIcon(i2);
            premiumButtonView.setButton(LocaleController.getString(R.string.UnlockStealthMode), new BotAdView$$ExternalSyntheticLambda2(this, 16), false);
        }
        linearLayout.addView(premiumButtonView, LayoutHelper.createLinear(-1, 48, 80, 14, 24, 14, 16));
        setCustomView(frameLayout);
        premiumButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$3(currentUser, i, resourcesProvider);
            }
        });
    }

    public static void showStealthModeEnabledBulletin() {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        BulletinFactory bulletinFactoryOf = lastFragment.getLastStoryViewer() != null ? BulletinFactory.of(lastFragment.getLastStoryViewer().windowView, lastFragment.getLastStoryViewer().resourcesProvider) : BulletinFactory.global();
        if (bulletinFactoryOf != null) {
            bulletinFactoryOf.createSimpleLargeBulletin(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeOn), LocaleController.getString(R.string.StealthModeOnHint)).show();
        }
    }

    public final void lambda$new$3(TLRPC.User user, int i, Theme.ResourcesProvider resourcesProvider) {
        if (!user.premium) {
            lambda$showGiftOfferSheet$15();
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment != null) {
                lastFragment.showDialog(new PremiumFeatureBottomSheet(lastFragment, lastFragment.getContext(), lastFragment.getCurrentAccount(), false, 14, false, null));
                return;
            }
            return;
        }
        if (this.stealthModeIsActive) {
            lambda$showGiftOfferSheet$15();
            DialogsActivity$25$$ExternalSyntheticLambda14 dialogsActivity$25$$ExternalSyntheticLambda14 = this.listener;
            if (dialogsActivity$25$$ExternalSyntheticLambda14 != null) {
                dialogsActivity$25$$ExternalSyntheticLambda14.onButtonClicked(false);
                return;
            }
            return;
        }
        StoriesController storiesController = MessagesController.getInstance(this.currentAccount).getStoriesController();
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = storiesController.stealthMode;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
            if (!this.stealthModeIsActive) {
                BulletinFactory bulletinFactoryOf = BulletinFactory.of(this.container, resourcesProvider);
                if (bulletinFactoryOf != null) {
                    bulletinFactoryOf.createErrorBulletin(AndroidUtilities.replaceTags(LocaleController.getString(R.string.StealthModeCooldownHint))).show(true);
                    return;
                }
                return;
            }
            lambda$showGiftOfferSheet$15();
            DialogsActivity$25$$ExternalSyntheticLambda14 dialogsActivity$25$$ExternalSyntheticLambda15 = this.listener;
            if (dialogsActivity$25$$ExternalSyntheticLambda15 != null) {
                dialogsActivity$25$$ExternalSyntheticLambda15.onButtonClicked(false);
                return;
            }
            return;
        }
        TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
        tL_stories_activateStealthMode.future = true;
        tL_stories_activateStealthMode.past = true;
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
        tL_storiesStealthMode2.flags |= 3;
        tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + MessagesController.getInstance(this.currentAccount).stealthModeCooldown;
        tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + MessagesController.getInstance(this.currentAccount).stealthModeFuture;
        storiesController.setStealthMode(tL_storiesStealthMode2);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_activateStealthMode, new StealthModeAlert$$ExternalSyntheticLambda3(0));
        try {
            this.containerView.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        lambda$showGiftOfferSheet$15();
        if (i == 0) {
            showStealthModeEnabledBulletin();
        }
        DialogsActivity$25$$ExternalSyntheticLambda14 dialogsActivity$25$$ExternalSyntheticLambda16 = this.listener;
        if (dialogsActivity$25$$ExternalSyntheticLambda16 != null) {
            dialogsActivity$25$$ExternalSyntheticLambda16.onButtonClicked(true);
        }
    }

    public final void updateButton$1(boolean z) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(this.currentAccount).getStoriesController().stealthMode;
        PremiumButtonView premiumButtonView = this.button;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.stealthModeIsActive = true;
            premiumButtonView.setOverlayText(LocaleController.getString(R.string.StealthModeIsActive), true, z);
            premiumButtonView.overlayTextView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
            return;
        }
        if (tL_storiesStealthMode != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            int i = tL_storiesStealthMode.cooldown_until_date;
            if (currentTime <= i) {
                long currentTime2 = i - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                int i2 = (int) (currentTime2 % 60);
                long j = currentTime2 / 60;
                int i3 = (int) (j % 60);
                int i4 = (int) (j / 60);
                StringBuilder sb = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb.append(String.format(locale, "%02d", Integer.valueOf(i4)));
                sb.append(String.format(locale, ":%02d", Integer.valueOf(i3)));
                sb.append(String.format(locale, ":%02d", Integer.valueOf(i2)));
                premiumButtonView.setOverlayText(LocaleController.formatString("AvailableIn", R.string.AvailableIn, sb.toString()), true, z);
                premiumButtonView.overlayTextView.setTextColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false), 125));
                BalanceCloud$$ExternalSyntheticLambda1 balanceCloud$$ExternalSyntheticLambda1 = this.updateButtonRunnuble;
                AndroidUtilities.cancelRunOnUIThread(balanceCloud$$ExternalSyntheticLambda1);
                AndroidUtilities.runOnUIThread(balanceCloud$$ExternalSyntheticLambda1, 1000L);
                return;
            }
        }
        int i5 = this.type;
        if (i5 == 0) {
            premiumButtonView.setOverlayText(LocaleController.getString(R.string.EnableStealthMode), true, z);
        } else if (i5 == 1) {
            premiumButtonView.setOverlayText(LocaleController.getString(R.string.EnableStealthModeAndOpenStory), true, z);
        }
        premiumButtonView.overlayTextView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
    }

    public final class ItemCell extends FrameLayout {
        public final int $r8$classId;
        public final Object description;
        public final Object imageView;
        public final Object textView;

        public ItemCell(Context context, Paint paint, TextPaint textPaint) {
            super(context);
            this.$r8$classId = 1;
            this.description = paint;
            this.imageView = textPaint;
            this.textView = new RectF();
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 5:
                    super.dispatchDraw(canvas);
                    Paint paint = (Paint) this.description;
                    paint.setColor(-1);
                    float width = getWidth() - (AndroidUtilities.dpf2(5.0f) * 2.0f);
                    PreviewHighlightView previewHighlightView = (PreviewHighlightView) this.imageView;
                    float fDpf2 = (width - AndroidUtilities.dpf2((previewHighlightView.storiesCount - 1) * 2)) / previewHighlightView.storiesCount;
                    float fDpf3 = AndroidUtilities.dpf2(5.0f);
                    int i = 0;
                    while (i < previewHighlightView.storiesCount) {
                        RectF rectF = (RectF) this.textView;
                        rectF.set(fDpf3, AndroidUtilities.dpf2(8.0f), fDpf3 + fDpf2, AndroidUtilities.dpf2(10.0f));
                        paint.setAlpha(i < previewHighlightView.storiesCount + (-1) ? 255 : 133);
                        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(1.0f), paint);
                        fDpf3 += AndroidUtilities.dpf2(2.0f) + fDpf2;
                        i++;
                    }
                    break;
                default:
                    super.dispatchDraw(canvas);
                    break;
            }
        }

        @Override
        public void draw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 2:
                    canvas.save();
                    canvas.clipPath((Path) this.textView);
                    super.draw(canvas);
                    canvas.restore();
                    break;
                default:
                    super.draw(canvas);
                    break;
            }
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            switch (this.$r8$classId) {
                case 3:
                    StoryLinkPreviewDialog storyLinkPreviewDialog = (StoryLinkPreviewDialog) this.imageView;
                    if (view != storyLinkPreviewDialog.linkView) {
                        return super.drawChild(canvas, view, j);
                    }
                    canvas.save();
                    canvas.translate(((AnimatedFloat) this.textView).set(view.getX()), ((AnimatedFloat) this.description).set(view.getY()));
                    storyLinkPreviewDialog.linkView.drawInternal(canvas);
                    canvas.restore();
                    return true;
                case 4:
                    if (((StarsIntroActivity.StarsTransactionView) this.imageView).imageViewCount > 1) {
                        Paint paint = (Paint) this.textView;
                        paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, (Theme.ResourcesProvider) this.description));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                        rectF.inset(-AndroidUtilities.dp(1.66f), -AndroidUtilities.dp(1.66f));
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
                    }
                    return super.drawChild(canvas, view, j);
                case 5:
                default:
                    return super.drawChild(canvas, view, j);
                case 6:
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    CommunityEditActivity communityEditActivity = (CommunityEditActivity) this.imageView;
                    if (view == communityEditActivity.listView) {
                        int i = Theme.key_windowBackgroundGray;
                        int themedColor = communityEditActivity.getThemedColor(i);
                        GradientProtectionDrawable gradientProtectionDrawable = (GradientProtectionDrawable) this.textView;
                        gradientProtectionDrawable.setColor(themedColor);
                        gradientProtectionDrawable.setBounds(0, 0, getWidth(), AndroidUtilities.statusBarHeight);
                        gradientProtectionDrawable.draw(canvas);
                        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(AndroidUtilities.navigationBarHeight);
                        if (navigationBarThirdButtonsFactor > 0.0f) {
                            GradientProtectionDrawable gradientProtectionDrawable2 = (GradientProtectionDrawable) this.description;
                            gradientProtectionDrawable2.setAlpha((int) (navigationBarThirdButtonsFactor * 255.0f));
                            gradientProtectionDrawable2.setColor(communityEditActivity.getThemedColor(i));
                            gradientProtectionDrawable2.setBounds(0, getHeight() - AndroidUtilities.navigationBarHeight, getWidth(), getHeight());
                            gradientProtectionDrawable2.draw(canvas);
                        }
                    }
                    return zDrawChild;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 1:
                    super.onDraw(canvas);
                    int color = Theme.getColor(null, Theme.key_text_RedRegular, false);
                    Paint paint = (Paint) this.description;
                    paint.setColor(color);
                    canvas.save();
                    float measuredWidth = getMeasuredWidth();
                    TextPaint textPaint = (TextPaint) this.imageView;
                    canvas.translate((measuredWidth - textPaint.measureText("500")) - AndroidUtilities.dp(8.0f), AndroidUtilities.dpf2(7.0f));
                    RectF rectF = (RectF) this.textView;
                    rectF.set(0.0f, 0.0f, textPaint.measureText("500"), textPaint.getTextSize());
                    rectF.inset(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(3.0f));
                    float textSize = (textPaint.getTextSize() / 2.0f) + AndroidUtilities.dp(3.0f);
                    canvas.drawRoundRect(rectF, textSize, textSize, paint);
                    canvas.drawText("500", 0.0f, textPaint.getTextSize() - AndroidUtilities.dpf2(2.0f), textPaint);
                    canvas.restore();
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 2:
                    super.onMeasure(i, i2);
                    Path path = (Path) this.textView;
                    path.rewind();
                    RectF rectF = (RectF) this.description;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                    StoryLinkPreviewDialog.AnonymousClass5 anonymousClass5 = ((StoryLinkPreviewDialog) this.imageView).linkView;
                    if (anonymousClass5 != null) {
                        anonymousClass5.setMaxWidth(getMeasuredWidth() - AndroidUtilities.dp(32.0f));
                    }
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        public ItemCell(final Context context, final Theme.ResourcesProvider resourcesProvider, boolean z) {
            super(context);
            this.$r8$classId = 7;
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(23.0f));
            addView(backupImageView, LayoutHelper.createFrame(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
            if (z) {
                addView(new View(context, resourcesProvider) {
                    public final Paint pBg;
                    public final Paint pRed;
                    public final Paint pWhite;
                    public final RectF rectF;
                    public final Theme.ResourcesProvider val$resourcesProvider;

                    {
                        this.val$resourcesProvider = resourcesProvider;
                        Paint paint = new Paint(1);
                        this.pBg = paint;
                        Paint paint2 = new Paint(1);
                        this.pWhite = paint2;
                        Paint paint3 = new Paint(1);
                        this.pRed = paint3;
                        this.rectF = new RectF();
                        paint2.setColor(-1);
                        paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
                        paint3.setColor(Theme.getColor(Theme.key_color_red, resourcesProvider));
                    }

                    @Override
                    public final void onDraw(Canvas canvas) {
                        super.onDraw(canvas);
                        RectF rectF = this.rectF;
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.pBg);
                        rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.pRed);
                        rectF.inset(AndroidUtilities.dpf2(4.67f), AndroidUtilities.dpf2(9.066f));
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.pWhite);
                    }
                }, LayoutHelper.createFrame(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
            }
            TextView textView = new TextView(context);
            this.textView = textView;
            AccountFrozenAlert$$ExternalSyntheticOutline1.m(16.0f, 1, textView);
            textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
            textView.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.description = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            textView2.setSingleLine(true);
            textView2.setEllipsize(truncateAt);
            addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
        }

        public ItemCell(StoryLinkPreviewDialog storyLinkPreviewDialog, Context context, int i) {
            super(context);
            this.$r8$classId = i;
            switch (i) {
                case 3:
                    this.imageView = storyLinkPreviewDialog;
                    super(context);
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                    this.textView = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
                    this.description = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
                    break;
                default:
                    this.imageView = storyLinkPreviewDialog;
                    this.textView = new Path();
                    this.description = new RectF();
                    break;
            }
        }

        public ItemCell(StarsIntroActivity.StarsTransactionView starsTransactionView, Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.$r8$classId = 4;
            this.imageView = starsTransactionView;
            this.description = resourcesProvider;
            this.textView = new Paint(1);
        }

        public ItemCell(StealthModeAlert stealthModeAlert, Context context) {
            super(context);
            this.$r8$classId = 0;
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_featuredStickers_addButton, false), PorterDuff.Mode.MULTIPLY));
            addView(imageView, LayoutHelper.createFrame(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, ((BottomSheet) stealthModeAlert).resourcesProvider));
            textView.setTextSize(1, 14.0f);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.description = textView2;
            textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, ((BottomSheet) stealthModeAlert).resourcesProvider));
            textView2.setTextSize(1, 14.0f);
            addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
        }

        public ItemCell(PreviewHighlightView previewHighlightView, Context context) {
            super(context);
            this.$r8$classId = 5;
            this.imageView = previewHighlightView;
            this.textView = new RectF();
            this.description = new Paint(1);
        }

        public ItemCell(CommunityEditActivity communityEditActivity, Context context) {
            super(context);
            this.$r8$classId = 6;
            this.imageView = communityEditActivity;
            this.textView = new GradientProtectionDrawable(2);
            this.description = new GradientProtectionDrawable(8);
        }
    }
}
