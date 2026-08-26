package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.BaseMenuWrapper;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import com.google.android.gms.internal.mlkit_vision_common.zzkm;
import com.google.android.gms.internal.mlkit_vision_common.zzli;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline2;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.ThemePreviewMessagesCell;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.ChatAttachAlertColorsLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.ExtendedGridLayoutManager;
import org.telegram.ui.Components.FilledTabsView;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SimpleThemeDescription;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.Stars.StarGiftPatterns;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.StoriesUtilities;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public final class PeerColorActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout actionBarContainer;
    public boolean applying;
    public boolean applyingName;
    public boolean applyingProfile;
    public ImageView backButton;
    public BaseFragment bulletinFragment;
    public AnonymousClass7 changeDayNightView;
    public ValueAnimator changeDayNightViewAnimator;
    public float changeDayNightViewProgress;
    public AnonymousClass4 colorBar;
    public LoginActivity.AnonymousClass4 contentView;
    public final SparseIntArray currentColors;
    public ImageView dayNightItem;
    public boolean forceDark;
    public final StarsController.GiftsList gifts;
    public final StarsController.GiftsList giftsWithPeerColor;
    public boolean isDark;
    public boolean loading;
    public final MessageDrawable msgInDrawable;
    public final MessageDrawable msgInDrawableSelected;
    public Page namePage;
    public Theme.ResourcesProvider parentResourcesProvider;
    public Page profilePage;
    public RLottieDrawable sunDrawable;
    public FilledTabsView tabsView;
    public PollItemMenu.AnonymousClass3 viewPager;

    public final class AnonymousClass4 extends ColoredActionBar {
        public int lastBtnColor;

        public AnonymousClass4(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            this.lastBtnColor = 0;
        }

        @Override
        public final void onUpdateColor() {
            PeerColorActivity peerColorActivity = PeerColorActivity.this;
            if (peerColorActivity.getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(peerColorActivity.getParentActivity(), peerColorActivity.isLightStatusBar());
            }
            int actionBarButtonColor = getActionBarButtonColor();
            if (this.lastBtnColor != actionBarButtonColor) {
                ImageView imageView = peerColorActivity.backButton;
                if (imageView != null) {
                    this.lastBtnColor = actionBarButtonColor;
                    imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
                }
                ImageView imageView2 = peerColorActivity.dayNightItem;
                if (imageView2 != null) {
                    this.lastBtnColor = actionBarButtonColor;
                    imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
                }
            }
            FilledTabsView filledTabsView = peerColorActivity.tabsView;
            if (filledTabsView != null) {
                filledTabsView.setBackgroundColor(getTabsViewBackgroundColor());
            }
        }
    }

    public final class AnonymousClass7 extends View {
        public final int $r8$classId;
        public final BaseFragment this$0;
        public final Bitmap val$bitmap;
        public final Canvas val$bitmapCanvas;
        public final Paint val$bitmapPaint;
        public final float val$cx;
        public final float val$cy;
        public final float val$r;
        public final float val$x;
        public final Paint val$xRefPaint;
        public final float val$y;

        public AnonymousClass7(BaseFragment baseFragment, Activity activity, Canvas canvas, float f, float f2, float f3, Paint paint, Bitmap bitmap, Paint paint2, float f4, float f5, int i) {
            super(activity);
            this.$r8$classId = i;
            this.this$0 = baseFragment;
            this.val$bitmapCanvas = canvas;
            this.val$cx = f;
            this.val$cy = f2;
            this.val$r = f3;
            this.val$xRefPaint = paint;
            this.val$bitmap = bitmap;
            this.val$bitmapPaint = paint2;
            this.val$x = f4;
            this.val$y = f5;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    super.onDraw(canvas);
                    PeerColorActivity peerColorActivity = (PeerColorActivity) this.this$0;
                    boolean z = peerColorActivity.isDark;
                    Paint paint = this.val$bitmapPaint;
                    float f = this.val$r;
                    float f2 = this.val$cy;
                    float f3 = this.val$cx;
                    if (z) {
                        float f4 = peerColorActivity.changeDayNightViewProgress;
                        if (f4 > 0.0f) {
                            this.val$bitmapCanvas.drawCircle(f3, f2, f * f4, this.val$xRefPaint);
                        }
                        canvas.drawBitmap(this.val$bitmap, 0.0f, 0.0f, paint);
                    } else {
                        canvas.drawCircle(f3, f2, (1.0f - peerColorActivity.changeDayNightViewProgress) * f, paint);
                    }
                    canvas.save();
                    canvas.translate(this.val$x, this.val$y);
                    peerColorActivity.dayNightItem.draw(canvas);
                    canvas.restore();
                    break;
                case 1:
                    super.onDraw(canvas);
                    ChannelColorActivity channelColorActivity = (ChannelColorActivity) this.this$0;
                    boolean z2 = channelColorActivity.isDark;
                    Paint paint2 = this.val$bitmapPaint;
                    float f5 = this.val$r;
                    float f6 = this.val$cy;
                    float f7 = this.val$cx;
                    if (z2) {
                        float f8 = channelColorActivity.changeDayNightViewProgress;
                        if (f8 > 0.0f) {
                            this.val$bitmapCanvas.drawCircle(f7, f6, f5 * f8, this.val$xRefPaint);
                        }
                        canvas.drawBitmap(this.val$bitmap, 0.0f, 0.0f, paint2);
                    } else {
                        canvas.drawCircle(f7, f6, (1.0f - channelColorActivity.changeDayNightViewProgress) * f5, paint2);
                    }
                    canvas.save();
                    canvas.translate(this.val$x, this.val$y);
                    channelColorActivity.dayNightItem.draw(canvas);
                    canvas.restore();
                    break;
                default:
                    super.onDraw(canvas);
                    ThemePreviewActivity themePreviewActivity = (ThemePreviewActivity) this.this$0;
                    boolean zIsDark = themePreviewActivity.themeDelegate.isDark();
                    Paint paint3 = this.val$bitmapPaint;
                    float f9 = this.val$r;
                    float f10 = this.val$cy;
                    float f11 = this.val$cx;
                    if (zIsDark) {
                        float f12 = themePreviewActivity.changeDayNightViewProgress;
                        if (f12 > 0.0f) {
                            this.val$bitmapCanvas.drawCircle(f11, f10, f9 * f12, this.val$xRefPaint);
                        }
                        canvas.drawBitmap(this.val$bitmap, 0.0f, 0.0f, paint3);
                    } else {
                        canvas.drawCircle(f11, f10, (1.0f - themePreviewActivity.changeDayNightViewProgress) * f9, paint3);
                    }
                    canvas.save();
                    canvas.translate(this.val$x, this.val$y);
                    themePreviewActivity.dayNightItem.draw(canvas);
                    canvas.restore();
                    break;
            }
        }
    }

    public final class AnonymousClass8 implements ValueAnimator.AnimatorUpdateListener {
        public final int $r8$classId;
        public boolean changedNavigationBarColor = false;
        public final NotificationCenter.NotificationCenterDelegate this$0;

        public AnonymousClass8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i) {
            this.$r8$classId = i;
            this.this$0 = notificationCenterDelegate;
        }

        @Override
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            switch (this.$r8$classId) {
                case 0:
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    PeerColorActivity peerColorActivity = (PeerColorActivity) this.this$0;
                    peerColorActivity.changeDayNightViewProgress = fFloatValue;
                    peerColorActivity.changeDayNightView.invalidate();
                    if (!this.changedNavigationBarColor && peerColorActivity.changeDayNightViewProgress > 0.5f) {
                        this.changedNavigationBarColor = true;
                        break;
                    }
                    break;
                case 1:
                    float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    ChannelColorActivity channelColorActivity = (ChannelColorActivity) this.this$0;
                    channelColorActivity.changeDayNightViewProgress = fFloatValue2;
                    channelColorActivity.changeDayNightView.invalidate();
                    if (!this.changedNavigationBarColor && channelColorActivity.changeDayNightViewProgress > 0.5f) {
                        this.changedNavigationBarColor = true;
                        break;
                    }
                    break;
                case 2:
                    float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    StoryRecorder storyRecorder = (StoryRecorder) this.this$0;
                    storyRecorder.changeDayNightViewProgress = fFloatValue3;
                    StoryRecorder.AnonymousClass31 anonymousClass31 = storyRecorder.changeDayNightView;
                    if (anonymousClass31 != null) {
                        anonymousClass31.invalidate();
                    }
                    if (!this.changedNavigationBarColor && storyRecorder.changeDayNightViewProgress > 0.5f) {
                        this.changedNavigationBarColor = true;
                        break;
                    }
                    break;
                default:
                    float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    ThemePreviewActivity themePreviewActivity = (ThemePreviewActivity) this.this$0;
                    themePreviewActivity.changeDayNightViewProgress = fFloatValue4;
                    themePreviewActivity.changeDayNightView.invalidate();
                    if (!this.changedNavigationBarColor && themePreviewActivity.changeDayNightViewProgress > 0.5f) {
                        this.changedNavigationBarColor = true;
                        break;
                    }
                    break;
            }
        }
    }

    public final class ChangeNameColorCell extends View {
        public final Text buttonText;
        public PeerColorDrawable color1Drawable;
        public PeerColorDrawable color2Drawable;
        public final int currentAccount;
        public final Drawable drawable;
        public final boolean isChannelOrGroup;
        public final boolean isGroup;
        public final LevelLock lock;
        public boolean needDivider;
        public final Theme.ResourcesProvider resourcesProvider;
        public Text userText;
        public final Paint userTextBackgroundPaint;
        public int userTextColorKey;

        public ChangeNameColorCell(int i, long j, Context context, Theme.ResourcesProvider resourcesProvider) {
            int i2;
            int iMin;
            int iMax;
            super(context);
            this.userTextBackgroundPaint = new Paint(1);
            this.userTextColorKey = -1;
            MessagesController messagesController = MessagesController.getInstance(i);
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j));
            this.currentAccount = i;
            boolean z = j < 0;
            this.isChannelOrGroup = z;
            boolean z2 = z && !ChatObject.isChannelAndNotMegaGroup(chat);
            this.isGroup = z2;
            this.resourcesProvider = resourcesProvider;
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.menu_edit_appearance).mutate();
            this.drawable = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4, resourcesProvider), PorterDuff.Mode.SRC_IN));
            if (z) {
                i2 = z2 ? R.string.ChangeGroupAppearance : R.string.ChangeChannelNameColor2;
            } else {
                i2 = R.string.ChangeUserNameColor;
            }
            String string = LocaleController.getString(i2);
            if (z && !z2 && MessagesController.getInstance(i).getMainSettings().getInt("boostingappearance", 0) < 3) {
                MessagesController.PeerColors peerColors = messagesController.peerColors;
                if (peerColors != null) {
                    int iMin2 = Math.min(Integer.MAX_VALUE, peerColors.maxLevel());
                    int iMax2 = Math.max(0, messagesController.peerColors.maxLevel());
                    iMin = Math.min(iMin2, messagesController.peerColors.minLevel());
                    iMax = Math.max(iMax2, messagesController.peerColors.minLevel());
                } else {
                    iMin = Integer.MAX_VALUE;
                    iMax = 0;
                }
                int iMin3 = Math.min(iMin, messagesController.channelBgIconLevelMin);
                int iMin4 = Math.min(iMax, messagesController.channelBgIconLevelMin);
                MessagesController.PeerColors peerColors2 = messagesController.profilePeerColors;
                if (peerColors2 != null) {
                    int iMin5 = Math.min(iMin3, peerColors2.maxLevel());
                    int iMax3 = Math.max(iMin4, messagesController.profilePeerColors.maxLevel());
                    iMin3 = Math.min(iMin5, messagesController.profilePeerColors.minLevel());
                    iMin4 = Math.max(iMax3, messagesController.profilePeerColors.minLevel());
                }
                int iMin6 = Math.min(iMin3, messagesController.channelProfileIconLevelMin);
                int iMax4 = Math.max(iMin4, messagesController.channelProfileIconLevelMin);
                int iMin7 = Math.min(iMin6, messagesController.channelEmojiStatusLevelMin);
                int iMax5 = Math.max(iMax4, messagesController.channelEmojiStatusLevelMin);
                int iMin8 = Math.min(iMin7, messagesController.channelWallpaperLevelMin);
                int iMax6 = Math.max(iMax5, messagesController.channelWallpaperLevelMin);
                int iMin9 = Math.min(iMin8, messagesController.channelCustomWallpaperLevelMin);
                int iMax7 = Math.max(iMax6, messagesController.channelCustomWallpaperLevelMin);
                int i3 = chat != null ? chat.level : 0;
                if (i3 < iMax7) {
                    this.lock = new LevelLock(Math.max(i3, iMin9), context, resourcesProvider, true);
                }
            }
            setContentDescription(string);
            this.buttonText = new Text(string, 16.0f, null);
            updateColors();
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            int iDp;
            int iDp2;
            int iDp3 = AndroidUtilities.dp(28.0f);
            if (LocaleController.isRTL) {
                iDp3 = getMeasuredWidth() - iDp3;
            }
            float measuredHeight = getMeasuredHeight() / 2.0f;
            Drawable drawable = this.drawable;
            DrawableUtils.setBounds(drawable, iDp3, measuredHeight, 17);
            drawable.draw(canvas);
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(171.0f);
            LevelLock levelLock = this.lock;
            if (levelLock != null) {
                iDp = AndroidUtilities.dp(8.0f) + levelLock.getIntrinsicWidth();
            } else {
                iDp = 0;
            }
            Text text = this.buttonText;
            text.ellipsizeWidth = measuredWidth - iDp;
            float measuredWidth2 = LocaleController.isRTL ? (getMeasuredWidth() - text.getWidth()) - AndroidUtilities.dp(58.0f) : AndroidUtilities.dp(58.0f);
            text.draw(canvas, measuredWidth2, getMeasuredHeight() / 2.0f, 1.0f);
            if (levelLock != null) {
                int width = (int) (text.getWidth() + measuredWidth2 + AndroidUtilities.dp(6.0f));
                levelLock.setBounds(width, 0, width, getHeight());
                levelLock.draw(canvas);
            }
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            boolean z = this.isGroup;
            if (z && this.color2Drawable != null) {
                int iDp4 = LocaleController.isRTL ? AndroidUtilities.dp(58.0f) : getMeasuredWidth() - AndroidUtilities.dp(24.0f);
                this.color2Drawable.setBounds(iDp4 - AndroidUtilities.dp(11.0f), OKLCH.m$2(11.0f, getMeasuredHeight(), 2), iDp4, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
                PeerColorDrawable peerColorDrawable = this.color2Drawable;
                float fDpf2 = AndroidUtilities.dpf2(3.0f);
                int color = Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider);
                if (peerColorDrawable.strokePaint == null) {
                    Paint paint = new Paint(1);
                    peerColorDrawable.strokePaint = paint;
                    paint.setStyle(Paint.Style.STROKE);
                }
                peerColorDrawable.strokePaint.setStrokeWidth(fDpf2);
                peerColorDrawable.strokePaint.setColor(color);
                this.color2Drawable.draw(canvas);
            } else if (this.color1Drawable != null && this.color2Drawable != null) {
                int iDp5 = LocaleController.isRTL ? AndroidUtilities.dp(58.0f) : getMeasuredWidth() - AndroidUtilities.dp(24.0f);
                this.color2Drawable.setBounds(iDp5 - AndroidUtilities.dp(11.0f), OKLCH.m$2(11.0f, getMeasuredHeight(), 2), iDp5, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
                PeerColorDrawable peerColorDrawable2 = this.color2Drawable;
                float fDpf3 = AndroidUtilities.dpf2(3.0f);
                int i = Theme.key_windowBackgroundWhite;
                int color2 = Theme.getColor(i, resourcesProvider);
                if (peerColorDrawable2.strokePaint == null) {
                    Paint paint2 = new Paint(1);
                    peerColorDrawable2.strokePaint = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                }
                peerColorDrawable2.strokePaint.setStrokeWidth(fDpf3);
                peerColorDrawable2.strokePaint.setColor(color2);
                this.color2Drawable.draw(canvas);
                int iDp6 = iDp5 - AndroidUtilities.dp(18.0f);
                this.color1Drawable.setBounds(iDp6 - AndroidUtilities.dp(11.0f), OKLCH.m$2(11.0f, getMeasuredHeight(), 2), iDp6, (AndroidUtilities.dp(11.0f) + getMeasuredHeight()) / 2);
                PeerColorDrawable peerColorDrawable3 = this.color1Drawable;
                float fDpf4 = AndroidUtilities.dpf2(3.0f);
                int color3 = Theme.getColor(i, resourcesProvider);
                if (peerColorDrawable3.strokePaint == null) {
                    Paint paint3 = new Paint(1);
                    peerColorDrawable3.strokePaint = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                peerColorDrawable3.strokePaint.setStrokeWidth(fDpf4);
                peerColorDrawable3.strokePaint.setColor(color3);
                this.color1Drawable.draw(canvas);
            } else if (this.userText != null && !z) {
                float measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp(116.0f);
                float width2 = text.getWidth();
                if (levelLock == null) {
                    iDp2 = 0;
                } else {
                    iDp2 = AndroidUtilities.dp(12.0f) + levelLock.getIntrinsicWidth();
                }
                float fMin = (int) (measuredWidth3 - Math.min(width2 + iDp2, getMeasuredWidth() - AndroidUtilities.dp(164.0f)));
                int iMin = (int) Math.min(this.userText.getWidth(), fMin);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(LocaleController.isRTL ? AndroidUtilities.dp(15.0f) : RichMessageLayout$$ExternalSyntheticOutline2.m(getMeasuredWidth(), 33.0f, iMin), (getMeasuredHeight() - AndroidUtilities.dp(22.0f)) / 2.0f, LocaleController.isRTL ? AndroidUtilities.dp(33.0f) + iMin : getMeasuredWidth() - AndroidUtilities.dp(15.0f), (AndroidUtilities.dp(22.0f) + getMeasuredHeight()) / 2.0f);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.userTextBackgroundPaint);
                Text text2 = this.userText;
                text2.ellipsizeWidth = fMin;
                text2.draw(canvas, LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : RichMessageLayout$$ExternalSyntheticOutline2.m(getMeasuredWidth(), 24.0f, iMin), getMeasuredHeight() / 2.0f, 1.0f);
            }
            if (this.needDivider) {
                Paint paint4 = resourcesProvider != null ? resourcesProvider.getPaint("paintDivider") : null;
                if (paint4 == null) {
                    paint4 = Theme.dividerPaint;
                }
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(58.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(58.0f) : 0), getMeasuredHeight() - 1, paint4);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.needDivider ? 1 : 0), 1073741824));
        }

        public void set(TLRPC.User user) {
            PeerColorDrawable peerColorDrawableFrom;
            int color;
            ArrayList<Integer> arrayList;
            if (user == null) {
                return;
            }
            String str = user.first_name;
            String strTrim = str == null ? "" : str.trim();
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf > 0) {
                strTrim = strTrim.substring(0, iIndexOf);
            }
            this.userText = new Text(Emoji.replaceEmoji(strTrim, Theme.chat_msgTextPaint.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
            PeerColorDrawable peerColorDrawable = this.color1Drawable;
            if (peerColorDrawable != null) {
                peerColorDrawable.setView(null);
            }
            TLRPC.EmojiStatus emojiStatus = user.emoji_status;
            boolean z = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
            int i = this.currentAccount;
            if (z) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                int i2 = PeerColorDrawable.$r8$clinit;
                int i3 = tL_emojiStatusCollectible.center_color | (-16777216);
                this.color1Drawable = new PeerColorDrawable(tL_emojiStatusCollectible.document_id, i3, i3, i3);
            } else {
                if (UserObject.getProfileColorId(user) >= 0) {
                    int profileColorId = UserObject.getProfileColorId(user);
                    int i4 = PeerColorDrawable.$r8$clinit;
                    MessagesController.PeerColors peerColors = MessagesController.getInstance(i).profilePeerColors;
                    peerColorDrawableFrom = PeerColorDrawable.from(peerColors == null ? null : peerColors.getColor(profileColorId), true);
                    peerColorDrawableFrom.radius = AndroidUtilities.dp(11.0f);
                    peerColorDrawableFrom.initPath();
                } else {
                    peerColorDrawableFrom = null;
                }
                this.color1Drawable = peerColorDrawableFrom;
            }
            PeerColorDrawable peerColorDrawable2 = this.color1Drawable;
            if (peerColorDrawable2 != null) {
                peerColorDrawable2.setView(this);
            }
            TLRPC.PeerColor peerColor = user.color;
            boolean z2 = peerColor instanceof TLRPC.TL_peerColorCollectible;
            Paint paint = this.userTextBackgroundPaint;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (z2) {
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
                int i5 = (!zIsDark || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
                if (!zIsDark || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                    arrayList = tL_peerColorCollectible.colors;
                }
                int iIntValue = arrayList.get(0).intValue() | (-16777216);
                int iIntValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : iIntValue;
                int iIntValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : iIntValue;
                this.userText.paint.setColor(i5);
                paint.setColor(Theme.multAlpha(0.1f, i5));
                PeerColorDrawable peerColorDrawable3 = new PeerColorDrawable(tL_peerColorCollectible.gift_emoji_id, iIntValue, iIntValue2, iIntValue3);
                peerColorDrawable3.radius = AndroidUtilities.dp(11.0f);
                peerColorDrawable3.initPath();
                this.color2Drawable = peerColorDrawable3;
                peerColorDrawable3.setView(this);
                return;
            }
            int colorId = UserObject.getColorId(user);
            if (colorId < 7) {
                int i6 = Theme.keys_avatar_nameInMessage[colorId];
                this.userTextColorKey = i6;
                color = Theme.getColor(i6, resourcesProvider);
            } else {
                MessagesController.PeerColors peerColors2 = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                MessagesController.PeerColor color2 = peerColors2 != null ? peerColors2.getColor(colorId) : null;
                if (color2 != null) {
                    this.userTextColorKey = -1;
                    color = color2.getColor1();
                } else {
                    int i7 = Theme.keys_avatar_nameInMessage[0];
                    this.userTextColorKey = i7;
                    color = Theme.getColor(i7, resourcesProvider);
                }
            }
            this.userText.paint.setColor(color);
            paint.setColor(Theme.multAlpha(0.1f, color));
            PeerColorDrawable peerColorDrawableFrom2 = PeerColorDrawable.from(i, colorId);
            peerColorDrawableFrom2.radius = AndroidUtilities.dp(11.0f);
            peerColorDrawableFrom2.initPath();
            this.color2Drawable = peerColorDrawableFrom2;
        }

        public final void updateColors() {
            Paint paint;
            int i;
            boolean z = this.isChannelOrGroup;
            int i2 = z ? Theme.key_windowBackgroundWhiteGrayIcon : Theme.key_windowBackgroundWhiteBlueText4;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            this.drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, resourcesProvider), PorterDuff.Mode.SRC_IN));
            this.buttonText.paint.setColor(Theme.getColor(z ? Theme.key_windowBackgroundWhiteBlackText : Theme.key_windowBackgroundWhiteBlueText4, resourcesProvider));
            if (this.userText == null || (paint = this.userTextBackgroundPaint) == null || (i = this.userTextColorKey) == -1) {
                return;
            }
            int color = Theme.getColor(i, resourcesProvider);
            this.userText.paint.setColor(color);
            paint.setColor(Theme.multAlpha(0.1f, color));
        }
    }

    public final class GiftCell extends FrameLayout {
        public TL_stars.starGiftAttributeBackdrop backdrop;
        public final FrameLayout card;
        public final GiftSheet.CardBackground cardBackground;
        public long id;
        public final BackupImageView imageView;
        public TLRPC.Document lastDocument;
        public TL_stars.starGiftAttributePattern pattern;
        public final GiftSheet.Ribbon ribbon;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                GiftCell giftCell = (GiftCell) view;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) uItem.object;
                giftCell.getClass();
                giftCell.id = savedStarGift.gift.id;
                giftCell.setPadding(0, 0, 0, 0);
                TLRPC.Document document = savedStarGift.gift.getDocument();
                TL_stars.StarGift starGift = savedStarGift.gift;
                BackupImageView backupImageView = giftCell.imageView;
                if (document == null) {
                    backupImageView.imageReceiver.clearImage();
                    giftCell.lastDocument = null;
                } else if (giftCell.lastDocument != document) {
                    giftCell.lastDocument = document;
                    backupImageView.setImage(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f)), document), "100_100", DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f), starGift);
                }
                giftCell.backdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
                giftCell.pattern = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = giftCell.backdrop;
                GiftSheet.CardBackground cardBackground = giftCell.cardBackground;
                cardBackground.setBackdrop(stargiftattributebackdrop);
                cardBackground.setPattern(giftCell.pattern);
                GiftSheet.Ribbon ribbon = giftCell.ribbon;
                if (ribbon != null) {
                    ribbon.setBackdrop(giftCell.backdrop);
                    String strM = BillingController$$ExternalSyntheticOutline0.m(savedStarGift.gift.num, ',', new StringBuilder("#"));
                    ribbon.currentText = strM;
                    ribbon.drawable.setText(9, strM, false);
                }
                giftCell.setSelected(uItem.checked, false);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new GiftCell(context, resourcesProvider, true);
            }
        }

        public GiftCell(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
            super(context);
            FrameLayout frameLayout = new FrameLayout(context);
            this.card = frameLayout;
            GiftSheet.CardBackground cardBackground = new GiftSheet.CardBackground(frameLayout, resourcesProvider, false);
            this.cardBackground = cardBackground;
            frameLayout.setBackground(cardBackground);
            addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
            ScaleStateListAnimator.apply(frameLayout, 0.025f, 1.25f);
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            frameLayout.addView(backupImageView, LayoutHelper.createFrame(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
            if (!z) {
                this.ribbon = null;
                return;
            }
            GiftSheet.Ribbon ribbon = new GiftSheet.Ribbon(context);
            this.ribbon = ribbon;
            addView(ribbon, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        }

        public long getGiftId() {
            return this.id;
        }

        public final void set(int i, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique2;
            this.id = tL_starGiftUnique.id;
            boolean z = i % 3 == 1;
            setPadding(z ? AndroidUtilities.dp(4.0f) : 0, 0, z ? AndroidUtilities.dp(4.0f) : 0, 0);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            BackupImageView backupImageView = this.imageView;
            if (document != null) {
                if (this.lastDocument != document) {
                    this.lastDocument = document;
                    tL_starGiftUnique2 = tL_starGiftUnique;
                    backupImageView.setImage(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f)), document), "100_100", DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f), tL_starGiftUnique2);
                }
                this.backdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique2.attributes, TL_stars.starGiftAttributeBackdrop.class);
                this.pattern = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(tL_starGiftUnique2.attributes, TL_stars.starGiftAttributePattern.class);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.backdrop;
                GiftSheet.CardBackground cardBackground = this.cardBackground;
                cardBackground.setBackdrop(stargiftattributebackdrop);
                cardBackground.setPattern(this.pattern);
            }
            backupImageView.imageReceiver.clearImage();
            this.lastDocument = null;
            tL_starGiftUnique2 = tL_starGiftUnique;
            this.backdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(tL_starGiftUnique2.attributes, TL_stars.starGiftAttributeBackdrop.class);
            this.pattern = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(tL_starGiftUnique2.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.backdrop;
            GiftSheet.CardBackground cardBackground2 = this.cardBackground;
            cardBackground2.setBackdrop(stargiftattributebackdrop2);
            cardBackground2.setPattern(this.pattern);
        }

        public final void setSelected(boolean z, boolean z2) {
            this.cardBackground.setSelected(z, z2);
            float f = z ? 0.9f : 1.0f;
            BackupImageView backupImageView = this.imageView;
            if (z2) {
                backupImageView.animate().scaleX(f).scaleY(f).start();
                return;
            }
            backupImageView.animate().cancel();
            backupImageView.setScaleX(f);
            backupImageView.setScaleY(f);
        }
    }

    public final class LevelLock extends Drawable {
        public final PremiumGradient.PremiumGradientTools gradientTools;
        public final Drawable lock;
        public final Text text;

        public LevelLock(int i, Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
            this.text = new Text(LocaleController.formatPluralString(z ? "BoostLevelPlus" : "BoostLevel", i, new Object[0]), 12.0f, AndroidUtilities.bold());
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
            this.lock = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.gradientTools = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, resourcesProvider);
        }

        @Override
        public final void draw(Canvas canvas) {
            int i = getBounds().left;
            int iCenterY = getBounds().centerY();
            RectF rectF = AndroidUtilities.rectTmp;
            float f = iCenterY;
            rectF.set(i, f - (AndroidUtilities.dp(18.33f) / 2.0f), getIntrinsicWidth() + i, (AndroidUtilities.dp(18.33f) / 2.0f) + f);
            PremiumGradient.PremiumGradientTools premiumGradientTools = this.gradientTools;
            premiumGradientTools.getClass();
            premiumGradientTools.gradientMatrix((int) rectF.left, 0.0f, (int) rectF.top, (int) rectF.right, 0.0f, (int) rectF.bottom);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), premiumGradientTools.paint);
            int iDp = AndroidUtilities.dp(3.33f) + i;
            Drawable drawable = this.lock;
            drawable.setBounds(iDp, (int) (f - ((drawable.getIntrinsicHeight() * 0.875f) / 2.0f)), (int) ((drawable.getIntrinsicWidth() * 0.875f) + AndroidUtilities.dp(3.33f) + i), (int) Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(drawable.getIntrinsicHeight(), 0.875f, 2.0f, f));
            drawable.draw(canvas);
            this.text.draw((drawable.getIntrinsicWidth() * 0.875f) + AndroidUtilities.dp(3.66f) + i, f, 1.0f, -1, canvas);
        }

        @Override
        public final int getIntrinsicHeight() {
            return AndroidUtilities.dp(18.33f);
        }

        @Override
        public final int getIntrinsicWidth() {
            return (int) (this.text.getWidth() + (this.lock.getIntrinsicWidth() * 0.875f) + AndroidUtilities.dp(9.66f));
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        @Override
        public final void setAlpha(int i) {
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public final class Page extends FrameLayout {
        public int actionBarHeight;
        public final ButtonWithCounterView button;
        public final String buttonCollectible;
        public final FrameLayout buttonContainer;
        public final SpannableStringBuilder buttonLocked;
        public int buttonRow;
        public final View buttonShadow;
        public final String buttonUnlocked;
        public int clearRow;
        public int colorPickerRow;
        public int giftsCount;
        public int giftsEmptyRow;
        public int giftsEndRow;
        public int giftsHeaderRow;
        public int giftsInfoRow;
        public int giftsLoadingEndRow;
        public int giftsLoadingStartRow;
        public int giftsStartRow;
        public int giftsTabsRow;
        public int iconRow;
        public final HashMap index2gift;
        public final int info2Row;
        public int infoRow;
        public final AnonymousClass4 listAdapter;
        public final AnonymousClass1 listView;
        public final ThemePreviewMessagesCell messagesCellPreview;
        public PeerColorGrid peerColorPicker;
        public final ProfilePreview profilePreview;
        public ResaleGiftsFragment.ResaleGiftsList resaleGifts;
        public int rowCount;
        public AnonymousClass8 selectAnimatedEmojiDialog;
        public int selectedColor;
        public long selectedEmoji;
        public TLRPC.TL_emojiStatusCollectible selectedEmojiCollectible;
        public TLRPC.TL_peerColorCollectible selectedPeerCollectible;
        public TL_stars.TL_starGiftUnique selectedResaleGift;
        public TL_stars.StarGift selectedTabGift;
        public SetReplyIconCell setReplyIconCell;
        public int shadowRow;
        public final ArrayList tabs;
        public final int type;
        public final ArrayList uniqueGifts;

        public final class AnonymousClass2 extends BaseMenuWrapper {
            public final int $r8$classId;
            public final Object this$1;

            public AnonymousClass2(Object obj, int i) {
                this.$r8$classId = i;
                this.this$1 = obj;
            }

            @Override
            public final int getSpanSize(int i) {
                int i2;
                int i3;
                switch (this.$r8$classId) {
                    case 0:
                        Page page = (Page) this.this$1;
                        if (i < page.giftsStartRow || i >= page.giftsEndRow) {
                            return (i < page.giftsLoadingStartRow || i >= page.giftsLoadingEndRow) ? 3 : 1;
                        }
                        return 1;
                    case 1:
                        ChatAttachAlertColorsLayout chatAttachAlertColorsLayout = (ChatAttachAlertColorsLayout) this.this$1;
                        int i4 = chatAttachAlertColorsLayout.itemSize;
                        int i5 = chatAttachAlertColorsLayout.itemsPerRow;
                        return i4 + (i % i5 != i5 + (-1) ? AndroidUtilities.dp(5.0f) : 0);
                    case 2:
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.this$1;
                        if (i == chatAttachAlertPhotoLayout.adapter.itemsCount - 1 || ((chatAttachAlertPhotoLayout.noGalleryPermissions || chatAttachAlertPhotoLayout.noCameraPermissions) && i == 0)) {
                            return chatAttachAlertPhotoLayout.layoutManager.mSpanCount;
                        }
                        if (chatAttachAlertPhotoLayout.noCameraPermissions) {
                            i--;
                        }
                        int i6 = chatAttachAlertPhotoLayout.itemSize;
                        int i7 = chatAttachAlertPhotoLayout.itemsPerRow;
                        return i6 + (i % i7 != i7 + (-1) ? AndroidUtilities.dp(2.0f) : 0);
                    case 3:
                        EmojiView.GifLayoutManager gifLayoutManager = (EmojiView.GifLayoutManager) this.this$1;
                        if (i == 0) {
                            EmojiView.this.gifAdapter.getClass();
                        }
                        RecyclerView.Adapter adapter = EmojiView.this.gifGridView.getAdapter();
                        EmojiView.GifAdapter gifAdapter = EmojiView.this.gifSearchAdapter;
                        if (adapter == gifAdapter && gifAdapter.results.isEmpty()) {
                            return gifLayoutManager.mSpanCount;
                        }
                        EmojiView.this.gifAdapter.getClass();
                        gifLayoutManager.checkLayout();
                        return gifLayoutManager.itemSpans.get(i);
                    case 4:
                        StickersAlert stickersAlert = (StickersAlert) this.this$1;
                        if ((stickersAlert.stickerSetCovereds == null || !(stickersAlert.adapter.cache.get(i) instanceof Integer)) && i != stickersAlert.adapter.totalItems) {
                            return 1;
                        }
                        return stickersAlert.adapter.stickersPerRow;
                    case 5:
                        UItem item = ((ResaleGiftsFragment.SelectGiftSheet) this.this$1).adapter.getItem(i - 1);
                        if (item == null || (i2 = item.spanCount) == -1) {
                            return 3;
                        }
                        return i2;
                    case 6:
                        StarGiftPreviewSheet starGiftPreviewSheet = (StarGiftPreviewSheet) this.this$1;
                        StarGiftPreviewSheet.AnonymousClass5 anonymousClass5 = starGiftPreviewSheet.adapter;
                        ExtendedGridLayoutManager extendedGridLayoutManager = starGiftPreviewSheet.layoutManager;
                        if (anonymousClass5 == null || i == 0) {
                            return extendedGridLayoutManager.mSpanCount;
                        }
                        UItem item2 = anonymousClass5.getItem(i - 1);
                        return (item2 == null || (i3 = item2.spanCount) == -1) ? extendedGridLayoutManager.mSpanCount : i3;
                    case 7:
                        EmojiBottomSheet.GifPage.GifLayoutManager gifLayoutManager2 = (EmojiBottomSheet.GifPage.GifLayoutManager) this.this$1;
                        if (EmojiBottomSheet.GifPage.this.adapter.getItem(i) == null) {
                            return gifLayoutManager2.mSpanCount;
                        }
                        gifLayoutManager2.checkLayout();
                        return gifLayoutManager2.itemSpans.get(i);
                    default:
                        EmojiBottomSheet.Page page2 = (EmojiBottomSheet.Page) this.this$1;
                        if (page2.adapter.getItemViewType(i) != 2) {
                            return page2.spanCount;
                        }
                        return 1;
                }
            }
        }

        public final class AnonymousClass4 extends RecyclerListView.SelectionAdapter {
            public final Context val$context;
            public final int val$type;

            public AnonymousClass4(Context context, int i) {
                this.val$context = context;
                this.val$type = i;
            }

            @Override
            public final int getItemCount() {
                return Page.this.rowCount;
            }

            @Override
            public final int getItemViewType(int i) {
                Page page = Page.this;
                if (i != page.infoRow && i != page.giftsInfoRow && i != page.info2Row && i != page.shadowRow) {
                    if (i == page.colorPickerRow) {
                        return 1;
                    }
                    if (i == page.iconRow) {
                        return 3;
                    }
                    if (i == page.buttonRow) {
                        return 5;
                    }
                    if (i == page.clearRow) {
                        return 6;
                    }
                    if (i == page.giftsTabsRow) {
                        return 10;
                    }
                    if (i == page.giftsEmptyRow) {
                        return 11;
                    }
                    if (i == page.giftsHeaderRow) {
                        return 7;
                    }
                    if (i >= page.giftsStartRow && i < page.giftsEndRow) {
                        return page.selectedTabGift == null ? 8 : 12;
                    }
                    if (i >= page.giftsLoadingStartRow && i < page.giftsLoadingEndRow) {
                        return 9;
                    }
                    if (i == page.rowCount - 1) {
                        return 4;
                    }
                }
                return 2;
            }

            @Override
            public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                int i = viewHolder.mItemViewType;
                return i == 3 || i == 6 || i == 8 || i == 12;
            }

            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
                int itemViewType = getItemViewType(i);
                View view = viewHolder.itemView;
                int i2 = this.val$type;
                int i3 = 1;
                z = true;
                boolean z = true;
                Page page = Page.this;
                switch (itemViewType) {
                    case 1:
                        view.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        ((PeerColorGrid) view).updateColors();
                        break;
                    case 2:
                        TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                        textInfoPrivacyCell.setFixedSize(0);
                        if (i == page.infoRow) {
                            textInfoPrivacyCell.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(i2 == 1 ? LocaleController.getString(R.string.UserColorHint) : LocaleController.getString(R.string.UserProfileHint2), new OAuthSheet$$ExternalSyntheticLambda17(this, i2, 19)), true));
                            textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(page.getContext(), page.clearRow >= 0 ? R.drawable.greydivider : R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                        } else if (i == page.shadowRow) {
                            textInfoPrivacyCell.setText("");
                            textInfoPrivacyCell.setFixedSize(12);
                            textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(page.getContext(), page.giftsHeaderRow >= 0 ? R.drawable.greydivider : R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                        } else if (i == page.giftsInfoRow) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                            textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(page.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                        }
                        break;
                    case 3:
                        SetReplyIconCell setReplyIconCell = (SetReplyIconCell) view;
                        setReplyIconCell.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        setReplyIconCell.textView.setTextColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                        break;
                    case 6:
                        TextCell textCell = (TextCell) view;
                        textCell.updateColors();
                        textCell.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        textCell.updateColors();
                        if (i == page.clearRow) {
                            textCell.setText(LocaleController.getString(R.string.UserProfileColorReset), false);
                        }
                        break;
                    case 7:
                        HeaderCell headerCell = (HeaderCell) view;
                        if (i == page.giftsHeaderRow) {
                            headerCell.setText(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                        }
                        headerCell.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        break;
                    case 8:
                        GiftCell giftCell = (GiftCell) view;
                        int i4 = i - page.giftsStartRow;
                        if (i4 >= 0) {
                            ArrayList arrayList = page.uniqueGifts;
                            if (i4 < arrayList.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i4);
                                giftCell.set(i4, tL_starGiftUnique);
                                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = page.selectedEmojiCollectible;
                                giftCell.setSelected((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = page.selectedPeerCollectible) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                                giftCell.card.invalidate();
                                break;
                            }
                        }
                        break;
                    case 10:
                        GiftSheet.Tabs tabs = (GiftSheet.Tabs) view;
                        page.tabs.clear();
                        HashMap map = page.index2gift;
                        map.clear();
                        PeerColorActivity peerColorActivity = PeerColorActivity.this;
                        ArrayList arrayList2 = StarsController.getInstance(((BaseFragment) peerColorActivity).currentAccount, false).sortedGifts;
                        ArrayList arrayList3 = page.tabs;
                        arrayList3.add(LocaleController.getString(R.string.Gift2TabMine));
                        int i5 = 0;
                        int size = 0;
                        while (i5 < arrayList2.size()) {
                            TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList2.get(i5);
                            if ((i2 == 0 || (i2 == i3 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                                if (page.selectedTabGift == starGift) {
                                    size = arrayList3.size();
                                }
                                map.put(Integer.valueOf(arrayList3.size()), starGift);
                                TextPaint textPaint = new TextPaint(i3);
                                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                                TLRPC.Document document = starGift.getDocument();
                                AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, textPaint.getFontMetricsInt());
                                animatedEmojiSpan.document = document;
                                animatedEmojiSpan.size = AndroidUtilities.dp(14.0f);
                                spannableStringBuilder.setSpan(animatedEmojiSpan, 0, 1, 33);
                                spannableStringBuilder.append(starGift.title);
                                arrayList3.add(spannableStringBuilder);
                            }
                            i5++;
                            map = map;
                            page = page;
                            i3 = 1;
                        }
                        tabs.set(0, arrayList3, size, new PeerColorActivity$Page$4$$ExternalSyntheticLambda0(this, 0));
                        tabs.setBackgroundColor(peerColorActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                        tabs.updateColors();
                        break;
                    case 11:
                        EmptyView emptyView = (EmptyView) view;
                        emptyView.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        LinkSpanDrawable.LinksTextView linksTextView = emptyView.title;
                        Page page2 = Page.this;
                        linksTextView.setTextColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
                        LinkSpanDrawable.LinksTextView linksTextView2 = emptyView.subtitle;
                        PeerColorActivity peerColorActivity2 = PeerColorActivity.this;
                        int i6 = Theme.key_chat_messageLinkIn;
                        linksTextView2.setTextColor(peerColorActivity2.getThemedColor(i6));
                        linksTextView2.setLinkTextColor(peerColorActivity2.getThemedColor(i6));
                        break;
                    case 12:
                        GiftSheet.GiftCell giftCell2 = (GiftSheet.GiftCell) view;
                        int i7 = i - page.giftsStartRow;
                        if (page.resaleGifts != null && i7 >= 0) {
                            ArrayList arrayList4 = page.uniqueGifts;
                            if (i7 < arrayList4.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList4.get(i7);
                                giftCell2.setStarsGift(tL_starGiftUnique2, false, false, false, true, false);
                                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = page.selectedEmojiCollectible;
                                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = page.selectedPeerCollectible) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
                                    z = false;
                                }
                                giftCell2.setSelected(z, false);
                                break;
                            }
                        }
                        break;
                }
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View view;
                View anonymousClass2;
                View giftCell;
                Page page = Page.this;
                switch (i) {
                    case 1:
                        Context context = page.getContext();
                        PeerColorActivity peerColorActivity = PeerColorActivity.this;
                        PeerColorGrid peerColorGrid = new PeerColorGrid(this.val$type, ((BaseFragment) peerColorActivity).currentAccount, context, ((BaseFragment) peerColorActivity).resourceProvider);
                        page.peerColorPicker = peerColorGrid;
                        peerColorGrid.setBackgroundColor(peerColorActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                        peerColorGrid.setSelected(page.selectedColor, false);
                        peerColorGrid.setOnColorClick(new PeerColorActivity$Page$4$$ExternalSyntheticLambda0(this, 1));
                        view = peerColorGrid;
                        anonymousClass2 = view;
                        break;
                    case 2:
                    default:
                        anonymousClass2 = new TextInfoPrivacyCell(page.getContext(), 24, PeerColorActivity.this.getResourceProvider());
                        break;
                    case 3:
                        SetReplyIconCell setReplyIconCell = page.new SetReplyIconCell(page.getContext());
                        page.setReplyIconCell = setReplyIconCell;
                        setReplyIconCell.update(false);
                        view = setReplyIconCell;
                        anonymousClass2 = view;
                        break;
                    case 4:
                        PaymentFormActivity.AnonymousClass2 anonymousClass3 = new PaymentFormActivity.AnonymousClass2(page.getContext(), 21);
                        anonymousClass3.setBackground(Theme.getThemedDrawableByKey(page.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                        anonymousClass2 = anonymousClass3;
                        break;
                    case 5:
                        anonymousClass2 = new PaymentFormActivity.AnonymousClass2(page.getContext(), 20);
                        break;
                    case 6:
                        Context context2 = page.getContext();
                        PeerColorActivity peerColorActivity2 = PeerColorActivity.this;
                        TextCell textCell = new TextCell(23, context2, peerColorActivity2.getResourceProvider(), false, false);
                        textCell.setBackgroundColor(peerColorActivity2.getThemedColor(Theme.key_windowBackgroundWhite));
                        view = textCell;
                        anonymousClass2 = view;
                        break;
                    case 7:
                        Context context3 = page.getContext();
                        PeerColorActivity peerColorActivity3 = PeerColorActivity.this;
                        HeaderCell headerCell = new HeaderCell(context3, ((BaseFragment) peerColorActivity3).resourceProvider);
                        headerCell.setBackgroundColor(peerColorActivity3.getThemedColor(Theme.key_windowBackgroundWhite));
                        anonymousClass2 = headerCell;
                        break;
                    case 8:
                        giftCell = new GiftCell(page.getContext(), ((BaseFragment) PeerColorActivity.this).resourceProvider, false);
                        anonymousClass2 = giftCell;
                        break;
                    case 9:
                        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.val$context, ((BaseFragment) PeerColorActivity.this).resourceProvider);
                        flickerLoadingView.setIsSingleCell(true);
                        flickerLoadingView.setViewType(35);
                        anonymousClass2 = flickerLoadingView;
                        break;
                    case 10:
                        giftCell = new GiftSheet.Tabs(page.getContext(), false);
                        giftCell.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        anonymousClass2 = giftCell;
                        break;
                    case 11:
                        anonymousClass2 = page.new EmptyView(page.getContext());
                        break;
                    case 12:
                        Context context4 = page.getContext();
                        PeerColorActivity peerColorActivity4 = PeerColorActivity.this;
                        anonymousClass2 = new GiftSheet.GiftCell(context4, ((BaseFragment) peerColorActivity4).currentAccount, ((BaseFragment) peerColorActivity4).resourceProvider);
                        break;
                }
                return new RecyclerListView.Holder(anonymousClass2);
            }

            @Override
            public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
                int i = viewHolder.mItemViewType;
                boolean z = true;
                Page page = Page.this;
                View view = viewHolder.itemView;
                if (i == 8) {
                    GiftCell giftCell = (GiftCell) view;
                    int adapterPosition = viewHolder.getAdapterPosition() - page.giftsStartRow;
                    if (adapterPosition >= 0) {
                        ArrayList arrayList = page.uniqueGifts;
                        if (adapterPosition >= arrayList.size()) {
                            return;
                        }
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(adapterPosition);
                        giftCell.set(adapterPosition, tL_starGiftUnique);
                        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = page.selectedEmojiCollectible;
                        if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = page.selectedPeerCollectible) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                            z = false;
                        }
                        giftCell.setSelected(z, false);
                        return;
                    }
                    return;
                }
                if (i == 12) {
                    GiftSheet.GiftCell giftCell2 = (GiftSheet.GiftCell) view;
                    int adapterPosition2 = viewHolder.getAdapterPosition() - page.giftsStartRow;
                    if (page.resaleGifts != null && adapterPosition2 >= 0) {
                        ArrayList arrayList2 = page.uniqueGifts;
                        if (adapterPosition2 >= arrayList2.size()) {
                            return;
                        }
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(adapterPosition2);
                        giftCell2.setStarsGift(tL_starGiftUnique2, false, false, false, true, false);
                        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = page.selectedEmojiCollectible;
                        if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = page.selectedPeerCollectible) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                            z = false;
                        }
                        giftCell2.setSelected(z, false);
                    }
                }
            }
        }

        public final class EmptyView extends LinearLayout {
            public final LinkSpanDrawable.LinksTextView subtitle;
            public final LinkSpanDrawable.LinksTextView title;

            public EmptyView(Context context) {
                super(context);
                setOrientation(1);
                setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                BackupImageView backupImageView = new BackupImageView(getContext());
                backupImageView.setImageDrawable(new RLottieDrawable(R.raw.utyan_draw, "utyan_draw", AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null));
                addView(backupImageView, LayoutHelper.createLinear(120, 120, 1, 0, 6, 0, 0));
                Context context2 = getContext();
                int i = Theme.key_windowBackgroundWhiteGrayText;
                PeerColorActivity peerColorActivity = PeerColorActivity.this;
                LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView = TextHelper.makeLinkTextView(context2, 14.0f, i, false, ((BaseFragment) peerColorActivity).resourceProvider);
                this.title = linksTextViewMakeLinkTextView;
                linksTextViewMakeLinkTextView.setGravity(17);
                linksTextViewMakeLinkTextView.setText(LocaleController.getString(Page.this.type == 0 ? R.string.Gift2PeerColorProfileEmptyTitle : R.string.Gift2PeerColorReplyEmptyTitle));
                addView(linksTextViewMakeLinkTextView, LayoutHelper.createLinear(-1, -2, 1, 64, 8, 64, 8));
                LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView2 = TextHelper.makeLinkTextView(getContext(), 14.0f, Theme.key_chat_messageLinkIn, false, ((BaseFragment) peerColorActivity).resourceProvider);
                this.subtitle = linksTextViewMakeLinkTextView2;
                linksTextViewMakeLinkTextView2.setGravity(17);
                linksTextViewMakeLinkTextView2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2PeerColorEmptyButton), new PhotoViewer$$ExternalSyntheticLambda21(this, 10)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.33f), 1.0f));
                addView(linksTextViewMakeLinkTextView2, LayoutHelper.createLinear(-1, -2, 1, 32, 4, 32, 24));
            }
        }

        public final class SetReplyIconCell extends FrameLayout {
            public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable imageDrawable;
            public Text offText;
            public final TextView textView;

            public SetReplyIconCell(Context context) {
                super(context);
                setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                TextView textView = new TextView(context);
                this.textView = textView;
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                if (Page.this.type == 1) {
                    textView.setText(LocaleController.getString(R.string.UserReplyIcon));
                } else {
                    textView.setText(LocaleController.getString(R.string.UserProfileIcon));
                }
                addView(textView, LayoutHelper.createFrame(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
                this.imageDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, false, AndroidUtilities.dp(24.0f), 13);
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                updateImageBounds();
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.imageDrawable;
                swapAnimatedEmojiDrawable.setColor(Integer.valueOf(getColor()));
                Text text = this.offText;
                if (text != null) {
                    text.draw((getMeasuredWidth() - this.offText.getWidth()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlueText4), canvas);
                } else {
                    swapAnimatedEmojiDrawable.draw(canvas);
                }
            }

            public final int getColor() {
                MessagesController.PeerColor color;
                Page page = Page.this;
                int i = page.selectedColor;
                PeerColorActivity peerColorActivity = PeerColorActivity.this;
                if (i < 0) {
                    int i2 = Theme.key_actionBarDefault;
                    if (AndroidUtilities.computePerceivedBrightness(peerColorActivity.getThemedColor(i2)) > 0.8f) {
                        return Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, ((BaseFragment) peerColorActivity).resourceProvider);
                    }
                    return AndroidUtilities.computePerceivedBrightness(peerColorActivity.getThemedColor(i2)) < 0.2f ? Theme.multAlpha(0.5f, Theme.getColor(Theme.key_actionBarDefaultTitle, ((BaseFragment) peerColorActivity).resourceProvider)) : Theme.blendOver(Theme.getColor(Theme.key_windowBackgroundWhite, ((BaseFragment) peerColorActivity).resourceProvider), Theme.multAlpha(0.7f, PeerColorActivity.adaptProfileEmojiColor(Theme.getColor(i2, ((BaseFragment) peerColorActivity).resourceProvider))));
                }
                if (i < 7) {
                    return peerColorActivity.getThemedColor(Theme.keys_avatar_nameInMessage[i]);
                }
                MessagesController.PeerColors peerColors = page.type == 1 ? MessagesController.getInstance(((BaseFragment) peerColorActivity).currentAccount).peerColors : MessagesController.getInstance(((BaseFragment) peerColorActivity).currentAccount).profilePeerColors;
                return (peerColors == null || (color = peerColors.getColor(page.selectedColor)) == null) ? peerColorActivity.getThemedColor(Theme.keys_avatar_nameInMessage[0]) : color.getColor1();
            }

            @Override
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                this.imageDrawable.attach();
            }

            @Override
            public final void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                this.imageDrawable.detach();
            }

            @Override
            public final void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
            }

            public final void update(boolean z) {
                long j = Page.this.selectedEmoji;
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.imageDrawable;
                if (j != 0) {
                    swapAnimatedEmojiDrawable.set(j, z);
                    this.offText = null;
                } else {
                    swapAnimatedEmojiDrawable.set((Drawable) null, z);
                    if (this.offText == null) {
                        this.offText = new Text(LocaleController.getString(R.string.UserReplyIconOff), 16.0f, null);
                    }
                }
            }

            public final void updateImageBounds() {
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.imageDrawable;
                swapAnimatedEmojiDrawable.setBounds(LocaleController.isRTL ? AndroidUtilities.dp(21.0f) : (getWidth() - swapAnimatedEmojiDrawable.size) - AndroidUtilities.dp(21.0f), (getHeight() - swapAnimatedEmojiDrawable.size) / 2, LocaleController.isRTL ? AndroidUtilities.dp(21.0f) + swapAnimatedEmojiDrawable.size : getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + swapAnimatedEmojiDrawable.size) / 2);
            }
        }

        public Page(Context context, final int i) {
            CharSequence charSequence;
            super(context);
            this.selectedColor = -1;
            this.selectedEmoji = 0L;
            this.selectedEmojiCollectible = null;
            this.selectedPeerCollectible = null;
            this.selectedTabGift = null;
            this.tabs = new ArrayList();
            this.index2gift = new HashMap();
            this.colorPickerRow = -1;
            this.infoRow = -1;
            this.iconRow = -1;
            this.info2Row = -1;
            this.buttonRow = -1;
            this.clearRow = -1;
            this.shadowRow = -1;
            this.giftsHeaderRow = -1;
            this.giftsStartRow = -1;
            this.giftsEndRow = -1;
            this.giftsLoadingStartRow = -1;
            this.giftsLoadingEndRow = -1;
            this.giftsCount = 0;
            this.giftsInfoRow = -1;
            this.giftsTabsRow = -1;
            this.giftsEmptyRow = -1;
            this.uniqueGifts = new ArrayList();
            this.type = i;
            setupValues();
            ?? r6 = new RecyclerListView(getContext(), PeerColorActivity.this.getResourceProvider()) {
                @Override
                public final Integer getSelectorColor(int i2) {
                    Page page = Page.this;
                    if ((i2 < page.giftsStartRow || i2 >= page.giftsEndRow) && (i2 < page.giftsLoadingStartRow || i2 >= page.giftsLoadingEndRow)) {
                        return super.getSelectorColor(i2);
                    }
                    return 0;
                }

                @Override
                public final void onDraw(Canvas canvas) {
                    Page page = Page.this;
                    drawSectionBackground(canvas, page.giftsStartRow, Math.max(page.giftsLoadingEndRow, page.giftsEndRow) - 1, Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    super.onDraw(canvas);
                }

                @Override
                public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                    super.onLayout(z, i2, i3, i4, i5);
                    Page page = Page.this;
                    Page.access$100(page);
                    if (page.selectedTabGift != null) {
                        if (page.resaleGifts == null || !page.seesLoading()) {
                            return;
                        }
                        page.resaleGifts.load(false);
                        return;
                    }
                    PeerColorActivity peerColorActivity = PeerColorActivity.this;
                    StarsController.GiftsList giftsList = i == 1 ? peerColorActivity.giftsWithPeerColor : peerColorActivity.gifts;
                    if (giftsList == null || !page.seesLoading()) {
                        return;
                    }
                    giftsList.load();
                }

                @Override
                public final void onMeasure(int i2, int i3) {
                    super.onMeasure(i2, i3);
                    Page.access$100(Page.this);
                }
            };
            this.listView = r6;
            ((DefaultItemAnimator) r6.getItemAnimator()).mSupportsChangeAnimations = false;
            getContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(3);
            gridLayoutManager.mSpanSizeLookup = new AnonymousClass2(this, 0);
            r6.addItemDecoration(new MessageSeenView.AnonymousClass2(this, 7));
            r6.setLayoutManager(gridLayoutManager);
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(context, i);
            this.listAdapter = anonymousClass4;
            r6.setAdapter(anonymousClass4);
            r6.setOnItemClickListener(new PeerColorActivity$Page$$ExternalSyntheticLambda0(this, i, 0));
            r6.addOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public final void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                    Page page = Page.this;
                    if (page.selectedTabGift != null) {
                        if (page.resaleGifts == null || !page.seesLoading()) {
                            return;
                        }
                        page.resaleGifts.load(false);
                        return;
                    }
                    PeerColorActivity peerColorActivity = PeerColorActivity.this;
                    StarsController.GiftsList giftsList = i == 1 ? peerColorActivity.giftsWithPeerColor : peerColorActivity.gifts;
                    if (giftsList == null || !page.seesLoading()) {
                        return;
                    }
                    giftsList.load();
                }
            });
            addView((View) r6, LayoutHelper.createFrame(-1.0f, -1));
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.buttonContainer = frameLayout;
            frameLayout.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_windowBackgroundGray));
            View view = new View(getContext());
            this.buttonShadow = view;
            view.setBackgroundColor(PeerColorActivity.this.getThemedColor(Theme.key_divider));
            view.setAlpha(0.0f);
            frameLayout.addView(view, LayoutHelper.createFrame(-1, 0.66f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
            spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_mini_lock2), 0, 1, 33);
            String string = LocaleController.getString(R.string.UserColorApply);
            this.buttonUnlocked = string;
            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) string);
            this.buttonLocked = spannableStringBuilderAppend;
            String string2 = LocaleController.getString(R.string.UserColorApplyCollectible);
            this.buttonCollectible = string2;
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), PeerColorActivity.this.getResourceProvider(), true);
            this.button = buttonWithCounterView;
            buttonWithCounterView.setRoundRadius(24);
            buttonWithCounterView.text.setHacks(true, true);
            if (!PeerColorActivity.this.getUserConfig().isPremium()) {
                charSequence = spannableStringBuilderAppend;
            } else if (this.selectedEmojiCollectible != null) {
                charSequence = string;
                charSequence = string2;
            }
            charSequence = string;
            buttonWithCounterView.setText(charSequence, false, true);
            buttonWithCounterView.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda4(this, 15));
            frameLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 119, 14.0f, 14.66f, 14.0f, 14.0f));
            addView(frameLayout, LayoutHelper.createFrame(-1, -2, 80));
            r6.addOnScrollListener(new SettingsActivity.AnonymousClass5(this, 2));
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setDurations(350L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.delayAnimations = false;
            defaultItemAnimator.mSupportsChangeAnimations = false;
            r6.setItemAnimator(defaultItemAnimator);
            if (i == 0) {
                ProfilePreview profilePreview = new ProfilePreview(((BaseFragment) PeerColorActivity.this).currentAccount, 0L, getContext(), ((BaseFragment) PeerColorActivity.this).resourceProvider);
                this.profilePreview = profilePreview;
                updateProfilePreview(false);
                addView(profilePreview, LayoutHelper.createFrame(-1, -2, 55));
            } else {
                ThemePreviewMessagesCell themePreviewMessagesCell = new ThemePreviewMessagesCell(getContext(), ((BaseFragment) PeerColorActivity.this).parentLayout, 3, 0L, ((BaseFragment) PeerColorActivity.this).resourceProvider);
                this.messagesCellPreview = themePreviewMessagesCell;
                themePreviewMessagesCell.setImportantForAccessibility(4);
                themePreviewMessagesCell.fragment = PeerColorActivity.this;
                addView(themePreviewMessagesCell, LayoutHelper.createFrame(-1, -2, 55));
            }
            updateColors();
            updateRows();
            setWillNotDraw(false);
        }

        public static void access$100(Page page) {
            AnonymousClass1 anonymousClass1;
            if (page.buttonContainer == null) {
                return;
            }
            int i = Page.this.rowCount - 1;
            int i2 = 0;
            boolean z = false;
            int measuredHeight = 0;
            while (true) {
                anonymousClass1 = page.listView;
                if (i2 >= anonymousClass1.getChildCount()) {
                    break;
                }
                View childAt = anonymousClass1.getChildAt(i2);
                int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition != -1 && childAdapterPosition <= i) {
                    measuredHeight = Math.max(measuredHeight, childAt.getTop());
                    if (childAdapterPosition == i) {
                        z = true;
                    }
                }
                i2++;
            }
            if (!z) {
                measuredHeight = anonymousClass1.getMeasuredHeight();
            }
            float fMax = Math.max(0, measuredHeight - (anonymousClass1.getMeasuredHeight() - AndroidUtilities.dp(76.66f)));
            int i3 = page.type;
            if (i3 == 0 || i3 == 1) {
                page.buttonShadow.animate().alpha(fMax > 0.0f ? 0.0f : 1.0f).start();
                fMax = 0.0f;
            }
            page.buttonContainer.setTranslationY(fMax);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            PeerColorActivity peerColorActivity = PeerColorActivity.this;
            if (peerColorActivity.getParentLayout() != null) {
                INavigationLayout parentLayout = peerColorActivity.getParentLayout();
                int i = this.actionBarHeight;
                parentLayout.getClass();
                ((ActionBarLayout) parentLayout).drawHeaderShadow(canvas, 255, i);
            }
        }

        public final boolean hasUnsavedChanged() {
            TLRPC.User currentUser = PeerColorActivity.this.getUserConfig().getCurrentUser();
            if (currentUser != null) {
                if (this.type != 1) {
                    if (this.selectedColor == (currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : UserObject.getProfileColorId(currentUser))) {
                        if (this.selectedEmoji == (currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? 0L : UserObject.getOnlyProfileEmojiId(currentUser))) {
                            TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.selectedEmojiCollectible;
                            boolean z = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
                            if ((tL_emojiStatusCollectible != null) == z && tL_emojiStatusCollectible != null && z && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id) {
                            }
                        }
                    }
                    return true;
                }
                if (this.selectedColor == (currentUser.color instanceof TLRPC.TL_peerColorCollectible ? -1 : UserObject.getColorId(currentUser)) && this.selectedEmoji == UserObject.getEmojiId(currentUser)) {
                    TLRPC.PeerColor peerColor = currentUser.color;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = peerColor instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor : null;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.selectedPeerCollectible;
                    if (tL_peerColorCollectible != tL_peerColorCollectible2 && ((tL_peerColorCollectible != null || tL_peerColorCollectible2 != null) && (tL_peerColorCollectible == null || tL_peerColorCollectible2 == null || tL_peerColorCollectible.collectible_id != tL_peerColorCollectible2.collectible_id))) {
                    }
                }
                return true;
            }
            return false;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int i3 = this.type;
            AnonymousClass1 anonymousClass1 = this.listView;
            if (i3 == 1) {
                super.onMeasure(i, i2);
                ThemePreviewMessagesCell themePreviewMessagesCell = this.messagesCellPreview;
                this.actionBarHeight = ActionBar.getCurrentActionBarHeight() + themePreviewMessagesCell.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
                ((ViewGroup.MarginLayoutParams) themePreviewMessagesCell.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                ((ViewGroup.MarginLayoutParams) anonymousClass1.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                anonymousClass1.setPadding(0, themePreviewMessagesCell.getMeasuredHeight(), 0, 0);
            } else {
                this.actionBarHeight = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
                ((ViewGroup.MarginLayoutParams) anonymousClass1.getLayoutParams()).topMargin = this.actionBarHeight;
                ((ViewGroup.MarginLayoutParams) this.profilePreview.getLayoutParams()).height = this.actionBarHeight;
            }
            super.onMeasure(i, i2);
        }

        public final boolean seesLoading() {
            AnonymousClass1 anonymousClass1 = this.listView;
            if (anonymousClass1 == null) {
                return false;
            }
            for (int i = 0; i < anonymousClass1.getChildCount(); i++) {
                if (anonymousClass1.getChildAt(i) instanceof FlickerLoadingView) {
                    return true;
                }
            }
            return false;
        }

        public final void setupValues() {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
            PeerColorActivity peerColorActivity = PeerColorActivity.this;
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
            if (this.type == 0) {
                TLRPC.User currentUser = peerColorActivity.getUserConfig().getCurrentUser();
                this.selectedColor = UserObject.getProfileColorId(currentUser);
                this.selectedEmoji = UserObject.getProfileEmojiId(currentUser);
                if (currentUser != null) {
                    TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                    if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                        tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    } else {
                        tL_emojiStatusCollectible = null;
                    }
                } else {
                    tL_emojiStatusCollectible = null;
                }
                this.selectedEmojiCollectible = tL_emojiStatusCollectible;
                this.selectedPeerCollectible = null;
            } else {
                TLRPC.User currentUser2 = peerColorActivity.getUserConfig().getCurrentUser();
                this.selectedColor = UserObject.getColorId(currentUser2);
                this.selectedEmoji = UserObject.getEmojiId(currentUser2);
                this.selectedEmojiCollectible = null;
                if (currentUser2 != null) {
                    TLRPC.PeerColor peerColor = currentUser2.color;
                    if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                        tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                    }
                }
                this.selectedPeerCollectible = tL_peerColorCollectible;
            }
            if (this.selectedEmojiCollectible == null && this.selectedPeerCollectible == null) {
                return;
            }
            this.selectedColor = -1;
            this.selectedEmoji = 0L;
        }

        public final void update() {
            updateRows();
            this.listAdapter.mObservable.notifyChanged();
        }

        public final void updateButton() {
            CharSequence charSequence;
            ButtonWithCounterView buttonWithCounterView = this.button;
            if (buttonWithCounterView == null) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.selectedResaleGift;
            if (tL_starGiftUnique != null) {
                AmountUtils$Amount resellAmount = tL_starGiftUnique.getResellAmount(AmountUtils$Currency.STARS);
                if (tL_starGiftUnique.resale_ton_only) {
                    buttonWithCounterView.setText(StarsIntroActivity.replaceStars(true, (CharSequence) LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(AmountUtils$Currency.TON).asFormatString()), 1.13f), true, true);
                    buttonWithCounterView.setSubText(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) (resellAmount.nanos / 1000000000)), 1.13f, (ColoredImageSpan[]) null), true);
                    return;
                } else {
                    buttonWithCounterView.setText(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) (resellAmount.nanos / 1000000000)), 1.13f, (ColoredImageSpan[]) null), true, true);
                    buttonWithCounterView.setSubText(null, true);
                    return;
                }
            }
            PeerColorActivity peerColorActivity = PeerColorActivity.this;
            if (peerColorActivity.getUserConfig().isPremium()) {
                charSequence = this.selectedEmojiCollectible != null ? this.buttonCollectible : this.buttonUnlocked;
            } else {
                peerColorActivity.getClass();
                charSequence = this.buttonLocked;
            }
            buttonWithCounterView.setText(charSequence, true, true);
            buttonWithCounterView.setSubText(null, true);
        }

        public final void updateColors() {
            int i = Theme.key_windowBackgroundGray;
            PeerColorActivity peerColorActivity = PeerColorActivity.this;
            int themedColor = peerColorActivity.getThemedColor(i);
            AnonymousClass1 anonymousClass1 = this.listView;
            anonymousClass1.setBackgroundColor(themedColor);
            ButtonWithCounterView buttonWithCounterView = this.button;
            if (buttonWithCounterView != null) {
                buttonWithCounterView.updateColors$1();
            }
            ThemePreviewMessagesCell themePreviewMessagesCell = this.messagesCellPreview;
            if (themePreviewMessagesCell != null) {
                themePreviewMessagesCell.invalidate();
            }
            updateProfilePreview(true);
            this.buttonContainer.setBackgroundColor(peerColorActivity.getThemedColor(i));
            this.buttonShadow.setBackgroundColor(peerColorActivity.getThemedColor(Theme.key_divider));
            AndroidUtilities.forEachViews((RecyclerView) anonymousClass1, (Consumer) new QrActivity$5$$ExternalSyntheticLambda0(this, 7));
        }

        public final void updateMessages() {
            MessageObject messageObject;
            ThemePreviewMessagesCell themePreviewMessagesCell = this.messagesCellPreview;
            if (themePreviewMessagesCell != null) {
                ChatMessageCell[] cells = themePreviewMessagesCell.getCells();
                for (int i = 0; i < cells.length; i++) {
                    ChatMessageCell chatMessageCell = cells[i];
                    if (chatMessageCell != null && (messageObject = chatMessageCell.getMessageObject()) != null) {
                        messageObject.notime = true;
                        PeerColorGrid peerColorGrid = this.peerColorPicker;
                        if (peerColorGrid != null) {
                            messageObject.overrideLinkColor = peerColorGrid.getColorId();
                        }
                        messageObject.overrideLinkEmoji = this.selectedEmoji;
                        messageObject.overrideLinkPeerColor = this.selectedPeerCollectible;
                        cells[i].setAvatar(messageObject);
                        cells[i].invalidate();
                    }
                }
            }
        }

        public final void updateProfilePreview(boolean z) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
            int i;
            PeerColorActivity peerColorActivity;
            AnonymousClass4 anonymousClass4;
            PeerColorGrid peerColorGrid = this.peerColorPicker;
            if (peerColorGrid != null) {
                peerColorGrid.setSelected(this.selectedColor, z);
            }
            ProfilePreview profilePreview = this.profilePreview;
            if (profilePreview != null) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.selectedEmojiCollectible;
                if (tL_emojiStatusCollectible != null) {
                    profilePreview.setStatusEmoji(tL_emojiStatusCollectible.document_id, true, z);
                    profilePreview.setColor(MessagesController.PeerColor.fromCollectible(this.selectedEmojiCollectible), z);
                    profilePreview.setEmoji(this.selectedEmojiCollectible.pattern_document_id, true, z);
                } else {
                    if (DialogObject.isEmojiStatusCollectible(0L)) {
                        profilePreview.setStatusEmoji(0L, false, z);
                    } else {
                        profilePreview.setStatusEmoji(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z);
                    }
                    profilePreview.setColor(this.selectedColor, z);
                    profilePreview.setEmoji(this.selectedEmoji, false, z);
                }
            }
            int i2 = this.type;
            if (i2 == 0 && (anonymousClass4 = (peerColorActivity = PeerColorActivity.this).colorBar) != null) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.selectedEmojiCollectible;
                if (tL_emojiStatusCollectible2 != null) {
                    anonymousClass4.setColor(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z);
                } else {
                    anonymousClass4.setColor(((BaseFragment) peerColorActivity).currentAccount, this.selectedColor, z);
                }
            }
            if (i2 == 0) {
                int i3 = this.clearRow;
                updateRows();
                AnonymousClass4 anonymousClass5 = this.listAdapter;
                if (i3 >= 0 && this.clearRow < 0) {
                    anonymousClass5.mObservable.notifyItemRangeRemoved(i3, 2);
                } else if (i3 < 0 && (i = this.clearRow) >= 0) {
                    anonymousClass5.mObservable.notifyItemRangeInserted(i, 2);
                }
            }
            int i4 = 0;
            while (true) {
                AnonymousClass1 anonymousClass1 = this.listView;
                if (i4 >= anonymousClass1.getChildCount()) {
                    return;
                }
                View childAt = anonymousClass1.getChildAt(i4);
                if (childAt instanceof GiftCell) {
                    GiftCell giftCell = (GiftCell) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.selectedEmojiCollectible;
                    giftCell.setSelected((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == giftCell.getGiftId()) || ((tL_peerColorCollectible2 = this.selectedPeerCollectible) != null && tL_peerColorCollectible2.collectible_id == giftCell.getGiftId()), true);
                } else if (childAt instanceof GiftSheet.GiftCell) {
                    GiftSheet.GiftCell giftCell2 = (GiftSheet.GiftCell) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.selectedEmojiCollectible;
                    giftCell2.setSelected((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == giftCell2.getGiftId()) || ((tL_peerColorCollectible = this.selectedPeerCollectible) != null && tL_peerColorCollectible.collectible_id == giftCell2.getGiftId()), true);
                }
                i4++;
            }
        }

        public final void updateRows() {
            this.clearRow = -1;
            this.shadowRow = -1;
            this.giftsHeaderRow = -1;
            this.giftsStartRow = -1;
            this.giftsLoadingStartRow = -1;
            this.giftsLoadingEndRow = -1;
            this.giftsEndRow = -1;
            this.giftsInfoRow = -1;
            this.giftsTabsRow = -1;
            this.giftsEmptyRow = -1;
            int i = 0;
            this.giftsCount = 0;
            ArrayList arrayList = this.uniqueGifts;
            arrayList.clear();
            this.colorPickerRow = 0;
            this.iconRow = 1;
            int i2 = 3;
            this.rowCount = 3;
            this.infoRow = 2;
            int i3 = this.type;
            if (i3 == 0 && (this.selectedColor >= 0 || this.selectedEmojiCollectible != null || this.selectedPeerCollectible != null)) {
                this.clearRow = 3;
                this.rowCount = 5;
                this.shadowRow = 4;
            }
            PeerColorActivity peerColorActivity = PeerColorActivity.this;
            StarsController.GiftsList giftsList = peerColorActivity.gifts;
            StarsController.GiftsList giftsList2 = i3 == 1 ? peerColorActivity.giftsWithPeerColor : giftsList;
            if ((i3 == 0 || i3 == 1) && giftsList2 != null) {
                int i4 = this.rowCount;
                this.rowCount = i4 + 1;
                this.giftsTabsRow = i4;
                if (this.selectedTabGift == null) {
                    while (true) {
                        ArrayList arrayList2 = giftsList2.gifts;
                        if (i >= arrayList2.size()) {
                            break;
                        }
                        TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i)).gift;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                        }
                        i++;
                    }
                    int i5 = this.rowCount;
                    this.giftsStartRow = i5;
                    this.rowCount = arrayList.size() + i5;
                    int size = arrayList.size() + this.giftsCount;
                    this.giftsCount = size;
                    int i6 = this.rowCount;
                    this.giftsEndRow = i6;
                    if (giftsList.loading || !giftsList.endReached) {
                        this.giftsLoadingStartRow = i6;
                        int i7 = 3 - (size % 3);
                        if (size <= 0) {
                            i2 = 9;
                        } else if (i7 > 0) {
                            i2 = i7;
                        }
                        int i8 = i6 + i2;
                        this.rowCount = i8;
                        this.giftsCount = size + i2;
                        this.giftsLoadingEndRow = i8;
                    } else if (arrayList.isEmpty()) {
                        int i9 = this.rowCount;
                        this.rowCount = i9 + 1;
                        this.giftsEmptyRow = i9;
                    }
                    if (seesLoading()) {
                        giftsList2.load();
                    }
                } else if (this.resaleGifts != null) {
                    long clientUserId = UserConfig.getInstance(((BaseFragment) peerColorActivity).currentAccount).getClientUserId();
                    for (int i10 = 0; i10 < this.resaleGifts.gifts.size(); i10++) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.resaleGifts.gifts.get(i10);
                        if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                            arrayList.add(tL_starGiftUnique);
                        }
                    }
                    int i11 = this.rowCount;
                    this.giftsStartRow = i11;
                    this.rowCount = arrayList.size() + i11;
                    int size2 = arrayList.size() + this.giftsCount;
                    this.giftsCount = size2;
                    int i12 = this.rowCount;
                    this.giftsEndRow = i12;
                    ResaleGiftsFragment.ResaleGiftsList resaleGiftsList = this.resaleGifts;
                    if (resaleGiftsList.loading || !resaleGiftsList.endReached) {
                        this.giftsLoadingStartRow = i12;
                        int i13 = 3 - (size2 % 3);
                        if (size2 <= 0) {
                            i2 = 9;
                        } else if (i13 > 0) {
                            i2 = i13;
                        }
                        int i14 = i12 + i2;
                        this.rowCount = i14;
                        this.giftsCount = size2 + i2;
                        this.giftsLoadingEndRow = i14;
                    }
                    if (seesLoading()) {
                        this.resaleGifts.load(false);
                    }
                }
                int i15 = this.rowCount;
                this.rowCount = i15 + 1;
                this.giftsInfoRow = i15;
            }
            int i16 = this.rowCount;
            this.rowCount = i16 + 1;
            this.buttonRow = i16;
        }
    }

    public final class PeerColorGrid extends View {
        public final Paint backgroundPaint;
        public ColorButton[] buttons;
        public final int currentAccount;
        public final Paint dividerPaint;
        public boolean lock;
        public boolean needDivider;
        public Utilities.Callback onColorClick;
        public final int[] order;
        public ColorButton pressedButton;
        public final Theme.ResourcesProvider resourcesProvider;
        public int selectedColorId;
        public final int type;

        public final class ColorButton {
            public final ButtonBounce bounce;
            public Paint closePaint;
            public Path closePath;
            public boolean hasClose;
            public boolean hasColor2;
            public boolean hasColor3;
            public int id;
            public Drawable lockDrawable;
            public boolean selected;
            public final AnimatedFloat selectedT;
            public final Paint paint1 = new Paint(1);
            public final Paint paint2 = new Paint(1);
            public final Paint paint3 = new Paint(1);
            public final Path circlePath = new Path();
            public final Path color2Path = new Path();
            public final RectF bounds = new RectF();
            public final RectF clickBounds = new RectF();

            public ColorButton() {
                this.bounce = new ButtonBounce(PeerColorGrid.this, 1.0f, 5.0f);
                this.selectedT = new AnimatedFloat(PeerColorGrid.this, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            }

            public final void set(MessagesController.PeerColor peerColor) {
                if (peerColor == null) {
                    return;
                }
                PeerColorGrid peerColorGrid = PeerColorGrid.this;
                Theme.ResourcesProvider resourcesProvider = peerColorGrid.resourcesProvider;
                boolean zIsDark = resourcesProvider == null ? Theme.currentTheme.isDark() : resourcesProvider.isDark();
                Paint paint = this.paint2;
                Paint paint2 = this.paint1;
                if (peerColorGrid.type != 1) {
                    paint2.setColor(peerColor.getColor(0, resourcesProvider));
                    paint.setColor(peerColor.getColor(peerColor.hasColor6(zIsDark) ? 1 : 0, resourcesProvider));
                    this.hasColor2 = peerColor.hasColor6(zIsDark);
                    this.hasColor3 = false;
                    return;
                }
                if (zIsDark && peerColor.hasColor2() && !peerColor.hasColor3()) {
                    paint2.setColor(peerColor.getColor(1, resourcesProvider));
                    paint.setColor(peerColor.getColor(0, resourcesProvider));
                } else {
                    paint2.setColor(peerColor.getColor(0, resourcesProvider));
                    paint.setColor(peerColor.getColor(1, resourcesProvider));
                }
                this.paint3.setColor(peerColor.getColor(2, resourcesProvider));
                this.hasColor2 = peerColor.hasColor2(zIsDark);
                this.hasColor3 = peerColor.hasColor3(zIsDark);
            }
        }

        public PeerColorGrid(int i, int i2, Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.order = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
            this.dividerPaint = new Paint(1);
            this.needDivider = true;
            this.selectedColorId = 0;
            this.type = i;
            this.currentAccount = i2;
            this.resourcesProvider = resourcesProvider;
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            if (this.buttons != null) {
                int i = 0;
                while (true) {
                    ColorButton[] colorButtonArr = this.buttons;
                    if (i >= colorButtonArr.length) {
                        break;
                    }
                    ColorButton colorButton = colorButtonArr[i];
                    colorButton.getClass();
                    canvas.save();
                    float scale = colorButton.bounce.getScale(0.05f);
                    RectF rectF = colorButton.bounds;
                    canvas.scale(scale, scale, rectF.centerX(), rectF.centerY());
                    canvas.save();
                    Path path = colorButton.circlePath;
                    path.rewind();
                    path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                    canvas.clipPath(path);
                    canvas.drawPaint(colorButton.paint1);
                    if (colorButton.hasColor2) {
                        Path path2 = colorButton.color2Path;
                        path2.rewind();
                        path2.moveTo(rectF.right, rectF.top);
                        path2.lineTo(rectF.right, rectF.bottom);
                        path2.lineTo(rectF.left, rectF.bottom);
                        path2.close();
                        canvas.drawPath(path2, colorButton.paint2);
                    }
                    canvas.restore();
                    if (colorButton.hasColor3) {
                        canvas.save();
                        float fWidth = rectF.width() * 0.315f;
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float f = fWidth / 2.0f;
                        rectF2.set(rectF.centerX() - f, rectF.centerY() - f, rectF.centerX() + f, rectF.centerY() + f);
                        canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), colorButton.paint3);
                        canvas.restore();
                    }
                    float f2 = colorButton.selectedT.set(colorButton.selected);
                    PeerColorGrid peerColorGrid = PeerColorGrid.this;
                    if (f2 > 0.0f) {
                        peerColorGrid.backgroundPaint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                        peerColorGrid.backgroundPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, peerColorGrid.resourcesProvider));
                        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, f2) * peerColorGrid.backgroundPaint.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), peerColorGrid.backgroundPaint);
                    }
                    if (colorButton.hasClose) {
                        if (peerColorGrid.lock) {
                            if (colorButton.lockDrawable == null) {
                                Drawable drawable = peerColorGrid.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                                colorButton.lockDrawable = drawable;
                                drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                            }
                            colorButton.lockDrawable.setBounds((int) TextureRenderer$$ExternalSyntheticOutline0.m(colorButton.lockDrawable.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) TextureRenderer$$ExternalSyntheticOutline0.m(colorButton.lockDrawable.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) zzjd.m(colorButton.lockDrawable.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) zzjd.m(colorButton.lockDrawable.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                            colorButton.lockDrawable.draw(canvas);
                        } else {
                            if (colorButton.closePath == null) {
                                colorButton.closePath = new Path();
                            }
                            if (colorButton.closePaint == null) {
                                Paint paint = new Paint(1);
                                colorButton.closePaint = paint;
                                paint.setColor(-1);
                                colorButton.closePaint.setStyle(Paint.Style.STROKE);
                                colorButton.closePaint.setStrokeCap(Paint.Cap.ROUND);
                            }
                            colorButton.closePaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                            colorButton.closePath.rewind();
                            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), f2);
                            colorButton.closePath.moveTo(rectF.centerX() - fLerp, rectF.centerY() - fLerp);
                            colorButton.closePath.lineTo(rectF.centerX() + fLerp, rectF.centerY() + fLerp);
                            colorButton.closePath.moveTo(rectF.centerX() + fLerp, rectF.centerY() - fLerp);
                            colorButton.closePath.lineTo(rectF.centerX() - fLerp, rectF.centerY() + fLerp);
                            canvas.drawPath(colorButton.closePath, colorButton.closePaint);
                        }
                    }
                    canvas.restore();
                    i++;
                }
            }
            if (this.needDivider) {
                Paint paint2 = this.dividerPaint;
                paint2.setColor(Theme.getColor(Theme.key_divider, this.resourcesProvider));
                canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint2);
            }
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            ColorButton colorButton;
            ColorButton colorButton2;
            Utilities.Callback callback;
            Utilities.Callback callback2;
            if (this.buttons == null) {
                colorButton = null;
                break;
            }
            int i = 0;
            while (true) {
                ColorButton[] colorButtonArr = this.buttons;
                if (i >= colorButtonArr.length) {
                    colorButton = null;
                    break;
                }
                if (colorButtonArr[i].clickBounds.contains(motionEvent.getX(), motionEvent.getY())) {
                    colorButton = this.buttons[i];
                    break;
                }
                i++;
            }
            if (motionEvent.getAction() == 0) {
                this.pressedButton = colorButton;
                if (colorButton != null) {
                    colorButton.bounce.setPressed(true);
                }
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (motionEvent.getAction() == 2) {
                ColorButton colorButton3 = this.pressedButton;
                if (colorButton3 != colorButton) {
                    if (colorButton3 != null) {
                        colorButton3.bounce.setPressed(false);
                    }
                    if (colorButton != null) {
                        colorButton.bounce.setPressed(true);
                    }
                    if (this.pressedButton != null && colorButton != null && (callback2 = this.onColorClick) != null) {
                        callback2.run(Integer.valueOf(colorButton.id));
                    }
                    this.pressedButton = colorButton;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && (colorButton2 = this.pressedButton) != null && (callback = this.onColorClick) != null) {
                    callback.run(Integer.valueOf(colorButton2.id));
                }
                if (this.buttons != null) {
                    int i2 = 0;
                    while (true) {
                        ColorButton[] colorButtonArr2 = this.buttons;
                        if (i2 >= colorButtonArr2.length) {
                            break;
                        }
                        colorButtonArr2[i2].bounce.setPressed(false);
                        i2++;
                    }
                }
                this.pressedButton = null;
            }
            return true;
        }

        public int getColorId() {
            return this.selectedColorId;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            int i4 = this.type;
            MessagesController.PeerColors peerColors = i4 == 1 ? messagesController.peerColors : messagesController.profilePeerColors;
            int size2 = peerColors == null ? 0 : peerColors.colors.size();
            int i5 = 8;
            int i6 = 2;
            if (i4 == 2) {
                size2 = 8;
            }
            if (i4 != 2 && i4 == 1) {
                i5 = 7;
            }
            float f = size;
            float f2 = i5;
            float f3 = i5 + 1;
            float fMin = Math.min(AndroidUtilities.dp(54.0f), f / ((f3 * 0.28947f) + f2));
            float fMin2 = Math.min(0.28947f * fMin, AndroidUtilities.dp(8.0f));
            float fMin3 = Math.min(0.31578946f * fMin, AndroidUtilities.dp(11.33f));
            int i7 = size2 / i5;
            setMeasuredDimension(size, (int) (((i7 + 1) * fMin3) + (i7 * fMin)));
            ColorButton[] colorButtonArr = this.buttons;
            if (colorButtonArr == null || colorButtonArr.length != size2) {
                this.buttons = new ColorButton[size2];
                int i8 = 0;
                while (i8 < size2) {
                    this.buttons[i8] = new ColorButton();
                    if (i4 == i6) {
                        ColorButton colorButton = this.buttons[i8];
                        int i9 = this.order[i8];
                        colorButton.id = i9;
                        colorButton.hasClose = i9 < 0;
                        if (i9 < 0) {
                            i3 = Theme.key_avatar_backgroundGray;
                        } else {
                            int[] iArr = Theme.keys_avatar_nameInMessage;
                            i3 = iArr[i9 % iArr.length];
                        }
                        int color = Theme.getColor(i3, this.resourcesProvider);
                        colorButton.hasColor3 = false;
                        colorButton.hasColor2 = false;
                        colorButton.paint1.setColor(color);
                    } else if (peerColors != null && i8 >= 0 && i8 < peerColors.colors.size()) {
                        this.buttons[i8].id = peerColors.colors.get(i8).id;
                        this.buttons[i8].set(peerColors.colors.get(i8));
                    }
                    i8++;
                    i6 = 2;
                }
            }
            float f4 = ((f - ((f3 * fMin2) + (f2 * fMin))) / 2.0f) + fMin2;
            if (this.buttons != null) {
                float f5 = f4;
                float f6 = fMin3;
                for (int i10 = 0; i10 < this.buttons.length; i10++) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(f5, f6, f5 + fMin, f6 + fMin);
                    this.buttons[i10].bounds.set(rectF);
                    rectF.inset((-fMin2) / 2.0f, (-fMin3) / 2.0f);
                    this.buttons[i10].clickBounds.set(rectF);
                    ColorButton colorButton2 = this.buttons[i10];
                    boolean z = colorButton2.id == this.selectedColorId;
                    colorButton2.selected = z;
                    colorButton2.selectedT.set(z, true);
                    PeerColorGrid.this.invalidate();
                    if (i10 % i5 == i5 - 1) {
                        f6 += fMin + fMin3;
                        f5 = f4;
                    } else {
                        f5 = fMin + fMin2 + f5;
                    }
                }
            }
        }

        public void setCloseAsLock(boolean z) {
            this.lock = z;
        }

        public void setDivider(boolean z) {
            this.needDivider = z;
            invalidate();
        }

        public void setOnColorClick(Utilities.Callback<Integer> callback) {
            this.onColorClick = callback;
        }

        public final void setSelected(int i, boolean z) {
            this.selectedColorId = i;
            if (this.buttons == null) {
                return;
            }
            int i2 = 0;
            while (true) {
                ColorButton[] colorButtonArr = this.buttons;
                if (i2 >= colorButtonArr.length) {
                    return;
                }
                ColorButton colorButton = colorButtonArr[i2];
                boolean z2 = colorButton.id == i;
                colorButton.selected = z2;
                if (!z) {
                    colorButton.selectedT.set(z2, true);
                }
                PeerColorGrid.this.invalidate();
                i2++;
            }
        }

        public final void updateColors() {
            int i;
            if (this.buttons == null) {
                return;
            }
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            int i2 = this.type;
            MessagesController.PeerColors peerColors = i2 == 1 ? messagesController.peerColors : messagesController.profilePeerColors;
            int i3 = 0;
            while (true) {
                ColorButton[] colorButtonArr = this.buttons;
                if (i3 >= colorButtonArr.length) {
                    invalidate();
                    return;
                }
                Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                int[] iArr = this.order;
                if (i2 == 2) {
                    ColorButton colorButton = colorButtonArr[i3];
                    int i4 = iArr[i3];
                    colorButton.id = i4;
                    colorButton.hasClose = i4 < 0;
                    if (i4 < 0) {
                        i = Theme.key_avatar_backgroundGray;
                    } else {
                        int[] iArr2 = Theme.keys_avatar_nameInMessage;
                        i = iArr2[i4 % iArr2.length];
                    }
                    int color = Theme.getColor(i, resourcesProvider);
                    colorButton.hasColor3 = false;
                    colorButton.hasColor2 = false;
                    colorButton.paint1.setColor(color);
                } else if (i3 < 7 && i2 == 1) {
                    ColorButton colorButton2 = colorButtonArr[i3];
                    int i5 = iArr[i3];
                    colorButton2.id = i5;
                    int color2 = Theme.getColor(Theme.keys_avatar_nameInMessage[i5], resourcesProvider);
                    colorButton2.hasColor3 = false;
                    colorButton2.hasColor2 = false;
                    colorButton2.paint1.setColor(color2);
                } else if (peerColors != null && i3 >= 0 && i3 < peerColors.colors.size()) {
                    this.buttons[i3].id = peerColors.colors.get(i3).id;
                    this.buttons[i3].set(peerColors.colors.get(i3));
                }
                i3++;
            }
        }
    }

    public PeerColorActivity() {
        super(null);
        this.currentColors = new SparseIntArray();
        boolean zIsDark = Theme.currentTheme.isDark();
        this.isDark = zIsDark;
        this.forceDark = zIsDark;
        StarsController.getInstance(this.currentAccount, false).loadStarGifts();
        StarsController.GiftsList giftsList = new StarsController.GiftsList(this.currentAccount, 0L, false);
        this.gifts = giftsList;
        int i = giftsList.includeFlags;
        int i2 = (i & (-16)) | 8;
        if (i != i2) {
            giftsList.includeFlags = i2;
        }
        giftsList.load();
        StarsController.GiftsList giftsList2 = new StarsController.GiftsList(this.currentAccount, 0L, false);
        this.giftsWithPeerColor = giftsList2;
        int i3 = giftsList2.includeFlags;
        int i4 = (i3 & (-16)) | 8;
        if (i3 != i4) {
            giftsList2.includeFlags = i4;
        }
        giftsList2.peer_color_available = true;
        giftsList2.load();
        this.resourceProvider = new PhotoViewer.AnonymousClass24(this, 2);
        this.msgInDrawable = new MessageDrawable(0, false, false, this.resourceProvider);
        this.msgInDrawableSelected = new MessageDrawable(0, false, true, this.resourceProvider);
    }

    public static int adaptProfileEmojiColor(int i) {
        return Theme.adaptHSV(0.5f, (AndroidUtilities.computePerceivedBrightness(i) > 0.2f ? 1 : (AndroidUtilities.computePerceivedBrightness(i) == 0.2f ? 0 : -1)) < 0 ? 0.28f : -0.28f, i);
    }

    public final void apply() {
        TL_account.updateColor updatecolor;
        TLRPC.TL_peerColor tL_peerColor;
        TLRPC.PeerColor peerColor;
        int i;
        int i2;
        long j;
        TL_account.updateColor updatecolor2;
        int i3;
        if (this.applying || !getUserConfig().isPremium()) {
            return;
        }
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        if (currentUser.color == null) {
            TLRPC.TL_peerColor tL_peerColor2 = new TLRPC.TL_peerColor();
            currentUser.color = tL_peerColor2;
            tL_peerColor2.flags |= 1;
            tL_peerColor2.color = (int) (currentUser.id % 7);
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = null;
        if (this.namePage.selectedColor == UserObject.getColorId(currentUser) && this.namePage.selectedEmoji == UserObject.getEmojiId(currentUser)) {
            TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.namePage.selectedPeerCollectible;
            long j2 = tL_peerColorCollectible == null ? 0L : tL_peerColorCollectible.collectible_id;
            TLRPC.PeerColor peerColor2 = currentUser.color;
            if (j2 != (peerColor2 instanceof TLRPC.TL_peerColorCollectible ? peerColor2.collectible_id : 0L)) {
                this.applyingName = true;
                updatecolor = new TL_account.updateColor();
                currentUser.flags2 |= 256;
                currentUser.color.flags |= 1;
                if (this.namePage.selectedPeerCollectible != null) {
                    updatecolor.flags |= 4;
                    TLRPC.TL_inputPeerColorCollectible tL_inputPeerColorCollectible = new TLRPC.TL_inputPeerColorCollectible();
                    updatecolor.color = tL_inputPeerColorCollectible;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.namePage.selectedPeerCollectible;
                    tL_inputPeerColorCollectible.collectible_id = tL_peerColorCollectible2.collectible_id;
                    currentUser.color = tL_peerColorCollectible2;
                } else {
                    updatecolor.flags |= 4;
                    tL_peerColor = new TLRPC.TL_peerColor();
                    updatecolor.color = tL_peerColor;
                    tL_peerColor.flags |= 1;
                    Page page = this.namePage;
                    int i4 = page.selectedColor;
                    tL_peerColor.color = i4;
                    peerColor = currentUser.color;
                    i = peerColor.flags;
                    i2 = i | 1;
                    peerColor.flags = i2;
                    peerColor.color = i4;
                    j = page.selectedEmoji;
                    if (j != 0) {
                        updatecolor.flags |= 1;
                        peerColor.flags = i | 3;
                        tL_peerColor.flags |= 2;
                        peerColor.background_emoji_id = j;
                        tL_peerColor.background_emoji_id = j;
                    } else {
                        peerColor.flags = i2 & (-3);
                        peerColor.background_emoji_id = 0L;
                    }
                }
                getConnectionsManager().sendRequest(updatecolor, null);
            }
        } else {
            this.applyingName = true;
            updatecolor = new TL_account.updateColor();
            currentUser.flags2 |= 256;
            currentUser.color.flags |= 1;
            if (this.namePage.selectedPeerCollectible != null) {
                updatecolor.flags |= 4;
                TLRPC.TL_inputPeerColorCollectible tL_inputPeerColorCollectible2 = new TLRPC.TL_inputPeerColorCollectible();
                updatecolor.color = tL_inputPeerColorCollectible2;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible3 = this.namePage.selectedPeerCollectible;
                tL_inputPeerColorCollectible2.collectible_id = tL_peerColorCollectible3.collectible_id;
                currentUser.color = tL_peerColorCollectible3;
            } else {
                updatecolor.flags |= 4;
                tL_peerColor = new TLRPC.TL_peerColor();
                updatecolor.color = tL_peerColor;
                tL_peerColor.flags |= 1;
                Page page2 = this.namePage;
                int i5 = page2.selectedColor;
                tL_peerColor.color = i5;
                peerColor = currentUser.color;
                i = peerColor.flags;
                i2 = i | 1;
                peerColor.flags = i2;
                peerColor.color = i5;
                j = page2.selectedEmoji;
                if (j != 0) {
                    updatecolor.flags |= 1;
                    peerColor.flags = i | 3;
                    tL_peerColor.flags |= 2;
                    peerColor.background_emoji_id = j;
                    tL_peerColor.background_emoji_id = j;
                } else {
                    peerColor.flags = i2 & (-3);
                    peerColor.background_emoji_id = 0L;
                }
            }
            getConnectionsManager().sendRequest(updatecolor, null);
        }
        if (this.profilePage.selectedColor == UserObject.getProfileColorId(currentUser) && this.profilePage.selectedEmoji == UserObject.getOnlyProfileEmojiId(currentUser)) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.profilePage.selectedEmojiCollectible;
            if ((tL_emojiStatusCollectible == null ? 0L : tL_emojiStatusCollectible.collectible_id) != UserObject.getProfileCollectibleId(currentUser)) {
                this.applyingProfile = true;
                if (currentUser.profile_color == null) {
                    currentUser.profile_color = new TLRPC.TL_peerColor();
                }
                updatecolor2 = new TL_account.updateColor();
                updatecolor2.for_profile = true;
                currentUser.flags2 |= 512;
                if (this.profilePage.selectedColor < 0) {
                    currentUser.profile_color.flags &= -2;
                } else {
                    if (updatecolor2.color == null) {
                        updatecolor2.flags |= 4;
                        updatecolor2.color = new TLRPC.TL_peerColor();
                    }
                    TLRPC.PeerColor peerColor3 = updatecolor2.color;
                    peerColor3.flags |= 1;
                    int i6 = this.profilePage.selectedColor;
                    peerColor3.color = i6;
                    TLRPC.PeerColor peerColor4 = currentUser.profile_color;
                    peerColor4.flags |= 1;
                    peerColor4.color = i6;
                }
                if (this.profilePage.selectedEmoji != 0) {
                    i3 = updatecolor2.flags;
                    updatecolor2.flags = i3 | 1;
                    currentUser.profile_color.flags |= 2;
                    if (updatecolor2.color == null) {
                        updatecolor2.flags = i3 | 5;
                        updatecolor2.color = new TLRPC.TL_peerColor();
                    }
                    TLRPC.PeerColor peerColor5 = updatecolor2.color;
                    peerColor5.flags |= 2;
                    TLRPC.PeerColor peerColor6 = currentUser.profile_color;
                    long j3 = this.profilePage.selectedEmoji;
                    peerColor6.background_emoji_id = j3;
                    peerColor5.background_emoji_id = j3;
                } else {
                    TLRPC.PeerColor peerColor7 = currentUser.profile_color;
                    peerColor7.flags &= -3;
                    peerColor7.background_emoji_id = 0L;
                }
                getConnectionsManager().sendRequest(updatecolor2, null);
            }
        } else {
            this.applyingProfile = true;
            if (currentUser.profile_color == null) {
                currentUser.profile_color = new TLRPC.TL_peerColor();
            }
            updatecolor2 = new TL_account.updateColor();
            updatecolor2.for_profile = true;
            currentUser.flags2 |= 512;
            if (this.profilePage.selectedColor < 0) {
                currentUser.profile_color.flags &= -2;
            } else {
                if (updatecolor2.color == null) {
                    updatecolor2.flags |= 4;
                    updatecolor2.color = new TLRPC.TL_peerColor();
                }
                TLRPC.PeerColor peerColor8 = updatecolor2.color;
                peerColor8.flags |= 1;
                int i7 = this.profilePage.selectedColor;
                peerColor8.color = i7;
                TLRPC.PeerColor peerColor9 = currentUser.profile_color;
                peerColor9.flags |= 1;
                peerColor9.color = i7;
            }
            if (this.profilePage.selectedEmoji != 0) {
                i3 = updatecolor2.flags;
                updatecolor2.flags = i3 | 1;
                currentUser.profile_color.flags |= 2;
                if (updatecolor2.color == null) {
                    updatecolor2.flags = i3 | 5;
                    updatecolor2.color = new TLRPC.TL_peerColor();
                }
                TLRPC.PeerColor peerColor10 = updatecolor2.color;
                peerColor10.flags |= 2;
                TLRPC.PeerColor peerColor11 = currentUser.profile_color;
                long j4 = this.profilePage.selectedEmoji;
                peerColor11.background_emoji_id = j4;
                peerColor10.background_emoji_id = j4;
            } else {
                TLRPC.PeerColor peerColor12 = currentUser.profile_color;
                peerColor12.flags &= -3;
                peerColor12.background_emoji_id = 0L;
            }
            getConnectionsManager().sendRequest(updatecolor2, null);
        }
        TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.profilePage.selectedEmojiCollectible;
        boolean z = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        if (!((tL_emojiStatusCollectible2 != null) == z && tL_emojiStatusCollectible2 != null && z && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible2.collectible_id) && (tL_emojiStatusCollectible2 != null || DialogObject.isEmojiStatusCollectible(emojiStatus))) {
            ?? tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.profilePage.selectedEmojiCollectible;
            if (tL_emojiStatusCollectible3 != null) {
                long j5 = tL_emojiStatusCollectible3.collectible_id;
                for (int i8 = 0; i8 < this.profilePage.uniqueGifts.size(); i8++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.profilePage.uniqueGifts.get(i8);
                    if (tL_starGiftUnique2.id == j5) {
                        tL_starGiftUnique = tL_starGiftUnique2;
                        break;
                    }
                }
            }
            if (tL_starGiftUnique != null) {
                tL_emojiStatusEmpty = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_emojiStatusEmpty.collectible_id = tL_starGiftUnique.id;
            }
            getMessagesController().updateEmojiStatus(0L, tL_emojiStatusEmpty, tL_starGiftUnique);
        }
        getMessagesController().putUser(currentUser, false);
        getUserConfig().saveConfig(true);
        finishFragment();
        showBulletin$1();
        this.applying = true;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_EMOJI_STATUS));
    }

    public final void buttonClick$1() {
        if (this.loading) {
            return;
        }
        if (!getUserConfig().isPremium()) {
            showDialog(new PremiumFeatureBottomSheet(this, getParentActivity(), getCurrentAccount(), false, 23, true, null));
            return;
        }
        Page page = this.viewPager.getCurrentPosition() == 1 ? this.namePage : this.profilePage;
        if (page.selectedResaleGift == null) {
            Page page2 = this.viewPager.getCurrentPosition() == 1 ? this.profilePage : this.namePage;
            if (page2.selectedResaleGift != null) {
                page2.setupValues();
            }
            apply();
            finishFragment();
            showBulletin$1();
            return;
        }
        (this.viewPager.getCurrentPosition() == 1 ? this.profilePage : this.namePage).setupValues();
        this.loading = true;
        page.button.setLoading(true);
        TL_stars.TL_starGiftUnique tL_starGiftUnique = page.selectedResaleGift;
        OAuthSheet$$ExternalSyntheticLambda13 oAuthSheet$$ExternalSyntheticLambda13 = new OAuthSheet$$ExternalSyntheticLambda13(19, this, page);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        AmountUtils$Currency amountUtils$Currency = tL_starGiftUnique.resale_ton_only ? AmountUtils$Currency.TON : AmountUtils$Currency.STARS;
        StarsController.getInstance(this.currentAccount, amountUtils$Currency).getResellingGiftForm(tL_starGiftUnique, clientUserId, null, true, new PeerColorActivity$$ExternalSyntheticLambda8(this, amountUtils$Currency, tL_starGiftUnique, clientUserId, oAuthSheet$$ExternalSyntheticLambda13));
    }

    @Override
    public final View createView(Context context) {
        final int i = 1;
        this.namePage = new Page(context, 1);
        final int i2 = 0;
        this.profilePage = new Page(context, 0);
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        LoginActivity.AnonymousClass4 anonymousClass4 = new LoginActivity.AnonymousClass4(this, context, 12);
        anonymousClass4.setFitsSystemWindows(true);
        this.colorBar = new AnonymousClass4(context, this.resourceProvider);
        this.profilePage.updateProfilePreview(false);
        anonymousClass4.addView(this.colorBar, LayoutHelper.createFrame(-1, -2, 55));
        PollItemMenu.AnonymousClass3 anonymousClass3 = new PollItemMenu.AnonymousClass3(this, context, 2);
        this.viewPager = anonymousClass3;
        anonymousClass3.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public final View createView(int i3) {
                PeerColorActivity peerColorActivity = PeerColorActivity.this;
                if (i3 == 1) {
                    return peerColorActivity.namePage;
                }
                if (i3 == 0) {
                    return peerColorActivity.profilePage;
                }
                return null;
            }

            @Override
            public final int getItemCount() {
                return 2;
            }

            @Override
            public final int getItemViewType(int i3) {
                return i3;
            }

            @Override
            public final void bindView(View view, int i3, int i4) {
            }
        });
        anonymousClass4.addView(this.viewPager, LayoutHelper.createFrame(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.actionBarContainer = frameLayout;
        anonymousClass4.addView(frameLayout, LayoutHelper.createFrame(-1, -2, 55));
        FilledTabsView filledTabsView = new FilledTabsView(context);
        this.tabsView = filledTabsView;
        filledTabsView.setTabs(LocaleController.getString(R.string.UserColorTabProfile), LocaleController.getString(R.string.UserColorTabName));
        FilledTabsView filledTabsView2 = this.tabsView;
        filledTabsView2.onTabClick = new PollItemMenu$$ExternalSyntheticLambda14(this, 22);
        this.actionBarContainer.addView(filledTabsView2, LayoutHelper.createFrame(-1, 40, 17));
        AnonymousClass4 anonymousClass5 = this.colorBar;
        if (anonymousClass5 != null) {
            anonymousClass5.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.backButton = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.backButton;
        int i3 = Theme.key_actionBarWhiteSelector;
        imageView2.setBackground(Theme.createSelectorDrawable(getThemedColor(i3), 1, -1));
        this.backButton.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.backButton;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.backButton.setOnClickListener(new View.OnClickListener(this) {
            public final PeerColorActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                int i4 = 0;
                switch (i2) {
                    case 0:
                        PeerColorActivity peerColorActivity = this.f$0;
                        if (peerColorActivity.onBackPressed(true)) {
                            peerColorActivity.finishFragment();
                        }
                        break;
                    default:
                        PeerColorActivity peerColorActivity2 = this.f$0;
                        FrameLayout frameLayout2 = (FrameLayout) peerColorActivity2.getParentActivity().getWindow().getDecorView();
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        peerColorActivity2.dayNightItem.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        peerColorActivity2.dayNightItem.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        peerColorActivity2.dayNightItem.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float measuredWidth = (peerColorActivity2.dayNightItem.getMeasuredWidth() / 2.0f) + f;
                        float measuredHeight = (peerColorActivity2.dayNightItem.getMeasuredHeight() / 2.0f) + f2;
                        float fMax = Math.max(bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
                        PeerColorActivity.AnonymousClass7 anonymousClass7 = new PeerColorActivity.AnonymousClass7(peerColorActivity2, peerColorActivity2.getParentActivity(), canvas, measuredWidth, measuredHeight, fMax, paint, bitmapCreateBitmap, paint2, f, f2, 0);
                        peerColorActivity2.changeDayNightView = anonymousClass7;
                        anonymousClass7.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
                        peerColorActivity2.changeDayNightViewProgress = 0.0f;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        peerColorActivity2.changeDayNightViewAnimator = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.addUpdateListener(new PeerColorActivity.AnonymousClass8(peerColorActivity2, i4));
                        peerColorActivity2.changeDayNightViewAnimator.addListener(new PhotoViewer$41$1(peerColorActivity2, 22));
                        peerColorActivity2.changeDayNightViewAnimator.setDuration(400L);
                        peerColorActivity2.changeDayNightViewAnimator.setInterpolator(Easings.easeInOutQuad);
                        peerColorActivity2.changeDayNightViewAnimator.start();
                        frameLayout2.addView(peerColorActivity2.changeDayNightView, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda21(peerColorActivity2, 9));
                        break;
                }
            }
        });
        this.actionBarContainer.addView(this.backButton, LayoutHelper.createFrame(54, 54, 19));
        int i4 = R.raw.sun;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i4, SurfaceContainer$$ExternalSyntheticOutline0.m(i4, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.sunDrawable = rLottieDrawable;
        rLottieDrawable.playInDirectionOfCustomEndFrame = true;
        if (this.isDark) {
            rLottieDrawable.setCurrentFrame(35, true, false);
            this.sunDrawable.setCustomEndFrame(36);
        } else {
            rLottieDrawable.setCustomEndFrame(0);
            this.sunDrawable.setCurrentFrame(0, true, false);
        }
        this.sunDrawable.applyingLayerColors = true;
        int color = Theme.getColor(null, Theme.key_chats_menuName, false);
        RLottieDrawable rLottieDrawable2 = this.sunDrawable;
        OKLCH.m(color, rLottieDrawable2.newColorUpdates, "Sunny", rLottieDrawable2);
        RLottieDrawable rLottieDrawable3 = this.sunDrawable;
        OKLCH.m(color, rLottieDrawable3.newColorUpdates, "Path 6", rLottieDrawable3);
        RLottieDrawable rLottieDrawable4 = this.sunDrawable;
        OKLCH.m(color, rLottieDrawable4.newColorUpdates, "Path", rLottieDrawable4);
        RLottieDrawable rLottieDrawable5 = this.sunDrawable;
        OKLCH.m(color, rLottieDrawable5.newColorUpdates, "Path 5", rLottieDrawable5);
        this.sunDrawable.commitApplyLayerColors();
        ImageView imageView4 = new ImageView(context);
        this.dayNightItem = imageView4;
        imageView4.setScaleType(scaleType);
        this.dayNightItem.setBackground(Theme.createSelectorDrawable(getThemedColor(i3), 1, -1));
        this.dayNightItem.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.dayNightItem.setOnClickListener(new View.OnClickListener(this) {
            public final PeerColorActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                int i5 = 0;
                switch (i) {
                    case 0:
                        PeerColorActivity peerColorActivity = this.f$0;
                        if (peerColorActivity.onBackPressed(true)) {
                            peerColorActivity.finishFragment();
                        }
                        break;
                    default:
                        PeerColorActivity peerColorActivity2 = this.f$0;
                        FrameLayout frameLayout2 = (FrameLayout) peerColorActivity2.getParentActivity().getWindow().getDecorView();
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        peerColorActivity2.dayNightItem.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        peerColorActivity2.dayNightItem.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        peerColorActivity2.dayNightItem.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float measuredWidth = (peerColorActivity2.dayNightItem.getMeasuredWidth() / 2.0f) + f;
                        float measuredHeight = (peerColorActivity2.dayNightItem.getMeasuredHeight() / 2.0f) + f2;
                        float fMax = Math.max(bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
                        PeerColorActivity.AnonymousClass7 anonymousClass7 = new PeerColorActivity.AnonymousClass7(peerColorActivity2, peerColorActivity2.getParentActivity(), canvas, measuredWidth, measuredHeight, fMax, paint, bitmapCreateBitmap, paint2, f, f2, 0);
                        peerColorActivity2.changeDayNightView = anonymousClass7;
                        anonymousClass7.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
                        peerColorActivity2.changeDayNightViewProgress = 0.0f;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        peerColorActivity2.changeDayNightViewAnimator = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.addUpdateListener(new PeerColorActivity.AnonymousClass8(peerColorActivity2, i5));
                        peerColorActivity2.changeDayNightViewAnimator.addListener(new PhotoViewer$41$1(peerColorActivity2, 22));
                        peerColorActivity2.changeDayNightViewAnimator.setDuration(400L);
                        peerColorActivity2.changeDayNightViewAnimator.setInterpolator(Easings.easeInOutQuad);
                        peerColorActivity2.changeDayNightViewAnimator.start();
                        frameLayout2.addView(peerColorActivity2.changeDayNightView, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda21(peerColorActivity2, 9));
                        break;
                }
            }
        });
        this.actionBarContainer.addView(this.dayNightItem, LayoutHelper.createFrame(54, 54, 21));
        this.dayNightItem.setImageDrawable(this.sunDrawable);
        AnonymousClass4 anonymousClass6 = this.colorBar;
        anonymousClass6.getClass();
        anonymousClass6.defaultColor = Theme.getColor(Theme.key_actionBarDefault, anonymousClass6.resourcesProvider);
        anonymousClass6.onUpdateColor();
        anonymousClass6.invalidate();
        this.contentView = anonymousClass4;
        this.fragmentView = anonymousClass4;
        return anonymousClass4;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i2 != this.currentAccount) {
            return;
        }
        if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            this.namePage.updateButton();
            this.profilePage.updateButton();
        } else if (i == NotificationCenter.starUserGiftsLoaded) {
            this.namePage.update();
            this.profilePage.update();
        } else if (i == NotificationCenter.starGiftsLoaded) {
            this.namePage.update();
            this.profilePage.update();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return SimpleThemeDescription.createThemeDescriptions(new QrActivity$$ExternalSyntheticLambda9(10, this), Theme.key_windowBackgroundWhite, Theme.key_windowBackgroundWhiteBlackText, Theme.key_windowBackgroundWhiteGrayText2, Theme.key_listSelector, Theme.key_windowBackgroundGray, Theme.key_windowBackgroundWhiteGrayText4, Theme.key_text_RedRegular, Theme.key_windowBackgroundChecked, Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
    }

    @Override
    public final boolean isLightStatusBar() {
        AnonymousClass4 anonymousClass4 = this.colorBar;
        if (anonymousClass4 == null) {
            return super.isLightStatusBar();
        }
        return ColorUtils.calculateLuminance(anonymousClass4.getColor()) > 0.699999988079071d;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if ((this.namePage.hasUnsavedChanged() || this.profilePage.hasUnsavedChanged()) && getUserConfig().isPremium()) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void lambda$buy$7(boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, OAuthSheet$$ExternalSyntheticLambda13 oAuthSheet$$ExternalSyntheticLambda13, StarGiftSheet.PaymentFormState paymentFormState, Browser.Progress progress) {
        zArr[0] = true;
        progress.init();
        StarsController.getInstance(this.currentAccount, paymentFormState.currency).buyResellingGift(paymentFormState.form, tL_starGiftUnique, j, null, true, new OAuthSheet$$ExternalSyntheticLambda18(18, progress, oAuthSheet$$ExternalSyntheticLambda13));
    }

    public final void lambda$buy$9(AmountUtils$Currency amountUtils$Currency, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, OAuthSheet$$ExternalSyntheticLambda13 oAuthSheet$$ExternalSyntheticLambda13, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        StarGiftSheet.PaymentFormState paymentFormState = new StarGiftSheet.PaymentFormState(amountUtils$Currency, tL_payments_paymentFormStarGift);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        boolean[] zArr = new boolean[1];
        StarGiftSheet.ResaleBuyTransferAlert resaleBuyTransferAlert = new StarGiftSheet.ResaleBuyTransferAlert(getParentActivity(), this.resourceProvider, tL_starGiftUnique, paymentFormState, this.currentAccount, j, BillingController$$ExternalSyntheticOutline0.m(tL_starGiftUnique.num, ',', sb), false, new PeerColorActivity$$ExternalSyntheticLambda9(this, zArr, tL_starGiftUnique, j, oAuthSheet$$ExternalSyntheticLambda13, 0));
        resaleBuyTransferAlert.alertDialog.setOnDismissListener(new VoIPFragment$$ExternalSyntheticLambda16(zArr, oAuthSheet$$ExternalSyntheticLambda13, 10));
        resaleBuyTransferAlert.show();
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if ((!this.namePage.hasUnsavedChanged() && !this.profilePage.hasUnsavedChanged()) || !getUserConfig().isPremium()) {
            return super.onBackPressed(z);
        }
        if (z && getVisibleDialog() == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.UserColorUnsaved);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString(R.string.UserColorUnsavedMessage);
            final int i = 0;
            builder.setNegativeButton(LocaleController.getString(R.string.Dismiss), new AlertDialog.OnButtonClickListener(this) {
                public final PeerColorActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog2, int i2) {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$showUnsavedAlert$3(alertDialog2, i2);
                            break;
                        default:
                            this.f$0.buttonClick$1();
                            break;
                    }
                }
            });
            final int i2 = 1;
            builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new AlertDialog.OnButtonClickListener(this) {
                public final PeerColorActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog2, int i3) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$showUnsavedAlert$3(alertDialog2, i3);
                            break;
                        default:
                            this.f$0.buttonClick$1();
                            break;
                    }
                }
            });
            showDialog(alertDialog);
            ((TextView) alertDialog.getButton(-2)).setTextColor(getThemedColor(Theme.key_text_RedBold));
        }
        return false;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        setBulletinDelegate(null);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.starGiftsLoaded);
        setBulletinDelegate(new LaunchActivity.AnonymousClass7(10));
        getMediaDataController().loadReplyIcons();
        if (MessagesController.getInstance(this.currentAccount).peerColors == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            MessagesController.getInstance(this.currentAccount).loadAppConfig(true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.starGiftsLoaded);
    }

    @Override
    public final void setResourceProvider(Theme.ResourcesProvider resourcesProvider) {
        this.parentResourcesProvider = resourcesProvider;
    }

    public final void showBulletin$1() {
        Page page;
        int i;
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor color;
        boolean zIsTextColorEmoji;
        RLottieImageView rLottieImageView;
        Page page2;
        ArrayList<Integer> arrayList;
        PeerColorDrawable peerColorDrawable;
        if (this.bulletinFragment != null) {
            if (this.applyingName) {
                if (this.applyingProfile) {
                    if ((this.viewPager.getCurrentPosition() == 0 ? this.profilePage : this.namePage) != this.namePage) {
                        if (this.applyingProfile) {
                            if (this.applyingName) {
                                if (this.viewPager.getCurrentPosition() == 0) {
                                    page2 = this.profilePage;
                                } else {
                                    page2 = this.namePage;
                                }
                                if (page2 == this.profilePage) {
                                    page = this.profilePage;
                                    if (page.selectedColor < 0) {
                                        BulletinFactory bulletinFactoryOf = BulletinFactory.of(this.bulletinFragment);
                                        int i2 = this.currentAccount;
                                        i = this.profilePage.selectedColor;
                                        int i3 = PeerColorDrawable.$r8$clinit;
                                        peerColors = MessagesController.getInstance(i2).profilePeerColors;
                                        if (peerColors == null) {
                                            color = null;
                                        } else {
                                            color = peerColors.getColor(i);
                                        }
                                        bulletinFactoryOf.createSimpleBulletin(PeerColorDrawable.from(color, true), LocaleController.getString(R.string.UserProfileColorApplied)).show();
                                    } else if (page.selectedEmoji != 0) {
                                        BulletinFactory bulletinFactoryOf2 = BulletinFactory.of(this.bulletinFragment);
                                        TLRPC.Document documentFindDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, this.profilePage.selectedEmoji);
                                        String string = LocaleController.getString(R.string.UserProfileColorEmojiApplied);
                                        bulletinFactoryOf2.getClass();
                                        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(bulletinFactoryOf2.getContext(), bulletinFactoryOf2.resourcesProvider);
                                        zIsTextColorEmoji = MessageObject.isTextColorEmoji(documentFindDocument);
                                        rLottieImageView = lottieLayout.imageView;
                                        if (zIsTextColorEmoji) {
                                            rLottieImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_undo_infoColor, false), PorterDuff.Mode.SRC_IN));
                                        }
                                        lottieLayout.setAnimation(documentFindDocument, new String[0]);
                                        rLottieImageView.stopAnimation();
                                        lottieLayout.textView.setText(string);
                                        lottieLayout.textView.setTextSize(1, 14.0f);
                                        lottieLayout.textView.setSingleLine(false);
                                        lottieLayout.textView.setMaxLines(3);
                                        bulletinFactoryOf2.create(lottieLayout, 2750).show();
                                    } else {
                                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.UserProfileColorResetApplied, BulletinFactory.of(this.bulletinFragment), R.raw.contact_check, 36);
                                    }
                                }
                            } else {
                                page = this.profilePage;
                                if (page.selectedColor < 0) {
                                    BulletinFactory bulletinFactoryOf3 = BulletinFactory.of(this.bulletinFragment);
                                    int i4 = this.currentAccount;
                                    i = this.profilePage.selectedColor;
                                    int i5 = PeerColorDrawable.$r8$clinit;
                                    peerColors = MessagesController.getInstance(i4).profilePeerColors;
                                    if (peerColors == null) {
                                        color = null;
                                    } else {
                                        color = peerColors.getColor(i);
                                    }
                                    bulletinFactoryOf3.createSimpleBulletin(PeerColorDrawable.from(color, true), LocaleController.getString(R.string.UserProfileColorApplied)).show();
                                } else if (page.selectedEmoji != 0) {
                                    BulletinFactory bulletinFactoryOf4 = BulletinFactory.of(this.bulletinFragment);
                                    TLRPC.Document documentFindDocument2 = AnimatedEmojiDrawable.findDocument(this.currentAccount, this.profilePage.selectedEmoji);
                                    String string2 = LocaleController.getString(R.string.UserProfileColorEmojiApplied);
                                    bulletinFactoryOf4.getClass();
                                    Bulletin.LottieLayout lottieLayout2 = new Bulletin.LottieLayout(bulletinFactoryOf4.getContext(), bulletinFactoryOf4.resourcesProvider);
                                    zIsTextColorEmoji = MessageObject.isTextColorEmoji(documentFindDocument2);
                                    rLottieImageView = lottieLayout2.imageView;
                                    if (zIsTextColorEmoji) {
                                        rLottieImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_undo_infoColor, false), PorterDuff.Mode.SRC_IN));
                                    }
                                    lottieLayout2.setAnimation(documentFindDocument2, new String[0]);
                                    rLottieImageView.stopAnimation();
                                    lottieLayout2.textView.setText(string2);
                                    lottieLayout2.textView.setTextSize(1, 14.0f);
                                    lottieLayout2.textView.setSingleLine(false);
                                    lottieLayout2.textView.setMaxLines(3);
                                    bulletinFactoryOf4.create(lottieLayout2, 2750).show();
                                } else {
                                    FactCheckController$$ExternalSyntheticOutline0.m(R.string.UserProfileColorResetApplied, BulletinFactory.of(this.bulletinFragment), R.raw.contact_check, 36);
                                }
                            }
                        }
                    }
                }
                Page page3 = this.namePage;
                if (page3.selectedColor >= 0) {
                    BulletinFactory.of(this.bulletinFragment).createSimpleBulletin(PeerColorDrawable.from(this.currentAccount, this.namePage.selectedColor), LocaleController.getString(R.string.UserColorApplied)).show();
                } else {
                    if (page3.selectedPeerCollectible == null) {
                        return;
                    }
                    BulletinFactory bulletinFactoryOf5 = BulletinFactory.of(this.bulletinFragment);
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.namePage.selectedPeerCollectible;
                    int i6 = PeerColorDrawable.$r8$clinit;
                    if (!Theme.currentTheme.isDark() || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        peerColorDrawable = null;
                    } else {
                        int iIntValue = arrayList.get(0).intValue() | (-16777216);
                        peerColorDrawable = new PeerColorDrawable(tL_peerColorCollectible.gift_emoji_id, iIntValue, arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : iIntValue, arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : iIntValue);
                    }
                    bulletinFactoryOf5.createSimpleBulletin(peerColorDrawable, LocaleController.getString(R.string.UserColorApplied)).show();
                }
            } else if (this.applyingProfile) {
                if (this.applyingName) {
                    page = this.profilePage;
                    if (page.selectedColor < 0) {
                        BulletinFactory bulletinFactoryOf6 = BulletinFactory.of(this.bulletinFragment);
                        int i7 = this.currentAccount;
                        i = this.profilePage.selectedColor;
                        int i8 = PeerColorDrawable.$r8$clinit;
                        peerColors = MessagesController.getInstance(i7).profilePeerColors;
                        if (peerColors == null) {
                            color = null;
                        } else {
                            color = peerColors.getColor(i);
                        }
                        bulletinFactoryOf6.createSimpleBulletin(PeerColorDrawable.from(color, true), LocaleController.getString(R.string.UserProfileColorApplied)).show();
                    } else if (page.selectedEmoji != 0) {
                        BulletinFactory bulletinFactoryOf7 = BulletinFactory.of(this.bulletinFragment);
                        TLRPC.Document documentFindDocument3 = AnimatedEmojiDrawable.findDocument(this.currentAccount, this.profilePage.selectedEmoji);
                        String string3 = LocaleController.getString(R.string.UserProfileColorEmojiApplied);
                        bulletinFactoryOf7.getClass();
                        Bulletin.LottieLayout lottieLayout3 = new Bulletin.LottieLayout(bulletinFactoryOf7.getContext(), bulletinFactoryOf7.resourcesProvider);
                        zIsTextColorEmoji = MessageObject.isTextColorEmoji(documentFindDocument3);
                        rLottieImageView = lottieLayout3.imageView;
                        if (zIsTextColorEmoji) {
                            rLottieImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_undo_infoColor, false), PorterDuff.Mode.SRC_IN));
                        }
                        lottieLayout3.setAnimation(documentFindDocument3, new String[0]);
                        rLottieImageView.stopAnimation();
                        lottieLayout3.textView.setText(string3);
                        lottieLayout3.textView.setTextSize(1, 14.0f);
                        lottieLayout3.textView.setSingleLine(false);
                        lottieLayout3.textView.setMaxLines(3);
                        bulletinFactoryOf7.create(lottieLayout3, 2750).show();
                    } else {
                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.UserProfileColorResetApplied, BulletinFactory.of(this.bulletinFragment), R.raw.contact_check, 36);
                    }
                } else {
                    if (this.viewPager.getCurrentPosition() == 0) {
                        page2 = this.profilePage;
                    } else {
                        page2 = this.namePage;
                    }
                    if (page2 == this.profilePage) {
                        page = this.profilePage;
                        if (page.selectedColor < 0) {
                            BulletinFactory bulletinFactoryOf8 = BulletinFactory.of(this.bulletinFragment);
                            int i9 = this.currentAccount;
                            i = this.profilePage.selectedColor;
                            int i10 = PeerColorDrawable.$r8$clinit;
                            peerColors = MessagesController.getInstance(i9).profilePeerColors;
                            if (peerColors == null) {
                                color = null;
                            } else {
                                color = peerColors.getColor(i);
                            }
                            bulletinFactoryOf8.createSimpleBulletin(PeerColorDrawable.from(color, true), LocaleController.getString(R.string.UserProfileColorApplied)).show();
                        } else if (page.selectedEmoji != 0) {
                            BulletinFactory bulletinFactoryOf9 = BulletinFactory.of(this.bulletinFragment);
                            TLRPC.Document documentFindDocument4 = AnimatedEmojiDrawable.findDocument(this.currentAccount, this.profilePage.selectedEmoji);
                            String string4 = LocaleController.getString(R.string.UserProfileColorEmojiApplied);
                            bulletinFactoryOf9.getClass();
                            Bulletin.LottieLayout lottieLayout4 = new Bulletin.LottieLayout(bulletinFactoryOf9.getContext(), bulletinFactoryOf9.resourcesProvider);
                            zIsTextColorEmoji = MessageObject.isTextColorEmoji(documentFindDocument4);
                            rLottieImageView = lottieLayout4.imageView;
                            if (zIsTextColorEmoji) {
                                rLottieImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_undo_infoColor, false), PorterDuff.Mode.SRC_IN));
                            }
                            lottieLayout4.setAnimation(documentFindDocument4, new String[0]);
                            rLottieImageView.stopAnimation();
                            lottieLayout4.textView.setText(string4);
                            lottieLayout4.textView.setTextSize(1, 14.0f);
                            lottieLayout4.textView.setSingleLine(false);
                            lottieLayout4.textView.setMaxLines(3);
                            bulletinFactoryOf9.create(lottieLayout4, 2750).show();
                        } else {
                            FactCheckController$$ExternalSyntheticOutline0.m(R.string.UserProfileColorResetApplied, BulletinFactory.of(this.bulletinFragment), R.raw.contact_check, 36);
                        }
                    }
                }
            }
            this.bulletinFragment = null;
        }
    }

    public final void updateColors$5() {
        this.contentView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        this.namePage.updateColors();
        this.profilePage.updateColors();
        AnonymousClass4 anonymousClass4 = this.colorBar;
        if (anonymousClass4 != null) {
            anonymousClass4.defaultColor = Theme.getColor(Theme.key_actionBarDefault, anonymousClass4.resourcesProvider);
            anonymousClass4.onUpdateColor();
            anonymousClass4.invalidate();
        }
        setNavigationBarColor(getNavigationBarColor());
    }

    public class ColoredActionBar extends View {
        public RadialGradient backgroundGradient;
        public int backgroundGradientColor1;
        public int backgroundGradientColor2;
        public int backgroundGradientHeight;
        public int backgroundGradientWidth;
        public final Paint backgroundPaint;
        public int color1;
        public final AnimatedColor color1Animated;
        public int color2;
        public final AnimatedColor color2Animated;
        public int defaultColor;
        public boolean ignoreMeasure;
        public boolean isDefault;
        public float progressToGradient;
        public final Theme.ResourcesProvider resourcesProvider;

        public ColoredActionBar(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.progressToGradient = 0.0f;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.color1Animated = new AnimatedColor(this, 350L, cubicBezierInterpolator);
            this.color2Animated = new AnimatedColor(this, 350L, cubicBezierInterpolator);
            this.backgroundPaint = new Paint(1);
            this.resourcesProvider = resourcesProvider;
            this.defaultColor = Theme.getColor(Theme.key_actionBarDefault, resourcesProvider);
            setColor(-1, -1, false);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            Canvas canvas2;
            int i = this.color1Animated.set(this.color1, false);
            int i2 = this.color2Animated.set(this.color2, false);
            RadialGradient radialGradient = this.backgroundGradient;
            Paint paint = this.backgroundPaint;
            if (radialGradient == null || this.backgroundGradientColor1 != i || this.backgroundGradientColor2 != i2 || this.backgroundGradientWidth != getWidth() || this.backgroundGradientHeight != getHeight()) {
                this.backgroundGradientWidth = getWidth();
                this.backgroundGradientHeight = getHeight();
                float f = this.backgroundGradientWidth;
                float f2 = this.backgroundGradientHeight;
                float fDistance = AndroidUtilities.distance(0.0f, 0.0f, f, f2) * 0.75f;
                this.backgroundGradientColor2 = i2;
                this.backgroundGradientColor1 = i;
                RadialGradient radialGradient2 = new RadialGradient(f / 2.0f, f2 * 0.4f, fDistance, new int[]{i2, i}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.backgroundGradient = radialGradient2;
                paint.setShader(radialGradient2);
                onUpdateColor();
            }
            if (this.progressToGradient < 1.0f) {
                canvas2 = canvas;
                canvas2.drawColor(this.defaultColor);
            } else {
                canvas2 = canvas;
            }
            float f3 = this.progressToGradient;
            if (f3 > 0.0f) {
                paint.setAlpha((int) (f3 * 255.0f));
                canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            }
        }

        public int getActionBarButtonColor() {
            int i = Theme.key_actionBarDefaultIcon;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            return ColorUtils.blendARGB(this.progressToGradient, Theme.getColor(i, resourcesProvider), this.isDefault ? Theme.getColor(i, resourcesProvider) : -1);
        }

        public int getColor() {
            return ColorUtils.blendARGB(this.progressToGradient, Theme.getColor(Theme.key_actionBarDefault, this.resourcesProvider), ColorUtils.blendARGB(0.75f, this.color1Animated.value, this.color2Animated.value));
        }

        public int getTabsViewBackgroundColor() {
            int i = Theme.key_actionBarDefault;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            int color = AndroidUtilities.computePerceivedBrightness(Theme.getColor(i, resourcesProvider)) > 0.721f ? Theme.getColor(Theme.key_actionBarDefaultIcon, resourcesProvider) : Theme.adaptHSV(0.08f, -0.08f, Theme.getColor(i, resourcesProvider));
            AnimatedColor animatedColor = this.color1Animated;
            int i2 = animatedColor.value;
            AnimatedColor animatedColor2 = this.color2Animated;
            return ColorUtils.blendARGB(this.progressToGradient, color, AndroidUtilities.computePerceivedBrightness(ColorUtils.blendARGB(0.75f, i2, animatedColor2.value)) > 0.721f ? Theme.getColor(Theme.key_windowBackgroundWhiteBlueIcon, resourcesProvider) : Theme.adaptHSV(0.08f, -0.08f, ColorUtils.blendARGB(0.75f, animatedColor.value, animatedColor2.value)));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            if (!this.ignoreMeasure) {
                i2 = zzkm.m(230.0f, AndroidUtilities.statusBarHeight);
            }
            super.onMeasure(i, i2);
        }

        public void onUpdateColor() {
        }

        public final void setColor(int i, int i2, boolean z) {
            MessagesController.PeerColors peerColors;
            MessagesController.PeerColor color = null;
            if (i2 >= 0 && i >= 0 && (peerColors = MessagesController.getInstance(i).profilePeerColors) != null) {
                color = peerColors.getColor(i2);
            }
            setColor(color, z);
        }

        public void setProgressToGradient(float f) {
            if (Math.abs(this.progressToGradient - f) > 0.001f) {
                this.progressToGradient = f;
                onUpdateColor();
                invalidate();
            }
        }

        public final void setColor(MessagesController.PeerColor peerColor, boolean z) {
            boolean zIsDark;
            this.isDefault = false;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (peerColor == null) {
                this.isDefault = true;
                int color = Theme.getColor(Theme.key_actionBarDefault, resourcesProvider);
                this.color2 = color;
                this.color1 = color;
            } else {
                if (resourcesProvider != null) {
                    zIsDark = resourcesProvider.isDark();
                } else {
                    zIsDark = Theme.currentTheme.isDark();
                }
                this.color1 = peerColor.getBgColor1(zIsDark);
                this.color2 = peerColor.getBgColor2(zIsDark);
            }
            if (!z) {
                this.color1Animated.set(this.color1, true);
                this.color2Animated.set(this.color2, true);
            }
            invalidate();
        }
    }

    public class ProfilePreview extends FrameLayout {
        public final AvatarDrawable avatarDrawable;
        public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable botVerificationEmoji;
        public final int currentAccount;
        public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emoji;
        public final AnimatedFloat emojiCollectible;
        public final ImageReceiver imageReceiver;
        public final boolean isChannel;
        public boolean isForum;
        public MessagesController.PeerColor peerColor;
        public final RectF rectF;
        public final Theme.ResourcesProvider resourcesProvider;
        public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable statusEmoji;
        public final StoriesUtilities.StoryGradientTools storyGradient;
        public final SimpleTextView subtitleView;
        public final ProfileActivity.AnonymousClass24 titleView;

        public ProfilePreview(int i, long j, Context context, Theme.ResourcesProvider resourcesProvider) {
            CharSequence userName;
            long botVerificationIcon;
            long emojiStatusDocumentId;
            super(context);
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.imageReceiver = imageReceiver;
            AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            this.avatarDrawable = avatarDrawable;
            this.emoji = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, false, AndroidUtilities.dp(20.0f), 13);
            this.storyGradient = new StoriesUtilities.StoryGradientTools(this);
            this.emojiCollectible = new AnimatedFloat(320L, this, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.rectF = new RectF();
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            boolean z = j < 0;
            this.isChannel = z;
            ProfileActivity.AnonymousClass24 anonymousClass24 = new ProfileActivity.AnonymousClass24(this, context, 1);
            this.titleView = anonymousClass24;
            this.botVerificationEmoji = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(anonymousClass24, false, AndroidUtilities.dp(17.0f), 7);
            this.statusEmoji = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(anonymousClass24, false, AndroidUtilities.dp(24.0f), 7);
            anonymousClass24.setLeftDrawableOutside(true);
            anonymousClass24.setRightDrawableOutside(true);
            anonymousClass24.setTextColor(-1);
            anonymousClass24.setTextSize(20);
            anonymousClass24.setTypeface(AndroidUtilities.bold());
            anonymousClass24.setWidthWrapContent(true);
            addView(anonymousClass24, LayoutHelper.createFrame(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.subtitleView = simpleTextView;
            simpleTextView.setTextSize(14);
            simpleTextView.setTextColor(-2130706433);
            simpleTextView.setGravity(1);
            addView(simpleTextView, LayoutHelper.createFrame(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
            imageReceiver.setRoundRadius(AndroidUtilities.dp(96.0f));
            if (z) {
                TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
                userName = chat == null ? "" : chat.title;
                avatarDrawable.setInfo(i, chat);
                imageReceiver.setForUserOrChat(chat, avatarDrawable);
                botVerificationIcon = DialogObject.getBotVerificationIcon(chat);
                if (chat != null) {
                    emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(chat.emoji_status);
                } else {
                    emojiStatusDocumentId = 0;
                }
            } else {
                TLRPC.User currentUser = UserConfig.getInstance(i).getCurrentUser();
                userName = UserObject.getUserName(currentUser);
                avatarDrawable.setInfo(i, currentUser);
                imageReceiver.setForUserOrChat(currentUser, avatarDrawable);
                botVerificationIcon = DialogObject.getBotVerificationIcon(currentUser);
                if (currentUser != null) {
                    emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(currentUser.emoji_status);
                } else {
                    emojiStatusDocumentId = 0;
                }
            }
            try {
                userName = Emoji.replaceEmoji(userName, null, false);
            } catch (Exception unused) {
            }
            this.titleView.setText(userName, false);
            this.botVerificationEmoji.set(botVerificationIcon, false);
            this.titleView.setLeftDrawable(this.botVerificationEmoji);
            this.statusEmoji.set(emojiStatusDocumentId, false);
            this.titleView.setRightDrawable(this.statusEmoji);
            if (this.isChannel) {
                long j2 = -j;
                TLRPC.Chat chat2 = MessagesController.getInstance(i).getChat(Long.valueOf(j2));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i).getChatFull(j2);
                if (chatFull == null || chatFull.participants_count <= 0) {
                    if (chat2 == null || chat2.participants_count <= 0) {
                        boolean zIsPublic = ChatObject.isPublic(chat2);
                        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            this.subtitleView.setText(LocaleController.getString(zIsPublic ? R.string.ChannelPublic : R.string.ChannelPrivate).toLowerCase(), false);
                        } else {
                            this.subtitleView.setText(LocaleController.getString(zIsPublic ? R.string.MegaPublic : R.string.MegaPrivate).toLowerCase(), false);
                        }
                    } else if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                        this.subtitleView.setText(LocaleController.formatPluralStringComma("Subscribers", chat2.participants_count), false);
                    } else {
                        this.subtitleView.setText(LocaleController.formatPluralStringComma("Members", chat2.participants_count), false);
                    }
                } else if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                    this.subtitleView.setText(LocaleController.formatPluralStringComma("Subscribers", chatFull.participants_count), false);
                } else {
                    this.subtitleView.setText(LocaleController.formatPluralStringComma("Members", chatFull.participants_count), false);
                }
            } else {
                this.subtitleView.setText(LocaleController.getString(R.string.Online), false);
            }
            setWillNotDraw(false);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            RectF rectF = this.rectF;
            rectF.set((getWidth() - AndroidUtilities.dp(86.0f)) / 2.0f, getHeight() - AndroidUtilities.dp(168.0f), (AndroidUtilities.dp(86.0f) + getWidth()) / 2.0f, getHeight() - AndroidUtilities.dp(82.0f));
            StarGiftPatterns.drawProfileAnimatedPattern(canvas, this.emoji, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
            ImageReceiver imageReceiver = this.imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(this.isForum ? 18.0f : 54.0f));
            imageReceiver.setImageCoords(rectF);
            imageReceiver.draw(canvas);
            float fWidth = (rectF.width() / 2.0f) + AndroidUtilities.dp(4.0f);
            float fDp = AndroidUtilities.dp(this.isForum ? 22.0f : 58.0f);
            canvas.drawRoundRect(rectF.centerX() - fWidth, rectF.centerY() - fWidth, rectF.centerX() + fWidth, rectF.centerY() + fWidth, fDp, fDp, this.storyGradient.getPaint(rectF));
            super.dispatchDraw(canvas);
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.emoji.attach();
            this.imageReceiver.onAttachedToWindow();
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.emoji.detach();
            this.imageReceiver.onDetachedFromWindow();
        }

        public final void overrideAvatarColor(int i) {
            int color;
            int color2;
            int color3;
            int color4;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (i >= 14) {
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                MessagesController.PeerColors peerColors = messagesController != null ? messagesController.peerColors : null;
                MessagesController.PeerColor color5 = peerColors != null ? peerColors.getColor(i) : null;
                if (color5 != null) {
                    int color1 = color5.getColor1();
                    color3 = Theme.getColor(Theme.keys_avatar_background[AvatarDrawable.getPeerColorIndex(color1)], resourcesProvider);
                    color4 = Theme.getColor(Theme.keys_avatar_background2[AvatarDrawable.getPeerColorIndex(color1)], resourcesProvider);
                } else {
                    long j = i;
                    color = Theme.getColor(Theme.keys_avatar_background[AvatarDrawable.getColorIndex(j)], resourcesProvider);
                    color2 = Theme.getColor(Theme.keys_avatar_background2[AvatarDrawable.getColorIndex(j)], resourcesProvider);
                }
                this.avatarDrawable.setColor(color3, color4);
                invalidate();
            }
            long j2 = i;
            color = Theme.getColor(Theme.keys_avatar_background[AvatarDrawable.getColorIndex(j2)], resourcesProvider);
            color2 = Theme.getColor(Theme.keys_avatar_background2[AvatarDrawable.getColorIndex(j2)], resourcesProvider);
            int i2 = color2;
            color3 = color;
            color4 = i2;
            this.avatarDrawable.setColor(color3, color4);
            invalidate();
        }

        public void setColor(int i, boolean z) {
            MessagesController.PeerColors peerColors = MessagesController.getInstance(this.currentAccount).profilePeerColors;
            setColor(peerColors == null ? null : peerColors.getColor(i), z);
        }

        public final void setEmoji(long j, boolean z, boolean z2) {
            MessagesController.PeerColor peerColor;
            int i;
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
            if (j == 0) {
                swapAnimatedEmojiDrawable.set((Drawable) null, z2);
            } else {
                swapAnimatedEmojiDrawable.set(j, z2);
            }
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
            MessagesController.PeerColor peerColor2 = this.peerColor;
            if (peerColor2 != null) {
                int i2 = peerColor2.patternColor;
                if (i2 != 0) {
                    swapAnimatedEmojiDrawable.setColor(Integer.valueOf(i2));
                } else {
                    swapAnimatedEmojiDrawable.setColor(Integer.valueOf(PeerColorActivity.adaptProfileEmojiColor(peerColor2.getBgColor1(zIsDark))));
                }
            } else {
                int i3 = Theme.key_actionBarDefault;
                if (AndroidUtilities.computePerceivedBrightness(Theme.getColor(i3, resourcesProvider)) > 0.8f) {
                    zzli.m(Theme.key_windowBackgroundWhiteBlueText, resourcesProvider, swapAnimatedEmojiDrawable);
                } else if (AndroidUtilities.computePerceivedBrightness(Theme.getColor(i3, resourcesProvider)) < 0.2f) {
                    swapAnimatedEmojiDrawable.setColor(Integer.valueOf(Theme.multAlpha(0.5f, Theme.getColor(null, Theme.key_actionBarDefaultTitle, false))));
                } else {
                    swapAnimatedEmojiDrawable.setColor(Integer.valueOf(PeerColorActivity.adaptProfileEmojiColor(Theme.getColor(null, i3, false))));
                }
            }
            MessagesController.PeerColor peerColor3 = this.peerColor;
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.statusEmoji;
            if (peerColor3 != null) {
                int color = peerColor3.getColor(1, resourcesProvider);
                if (this.peerColor.hasColor6(zIsDark)) {
                    peerColor = this.peerColor;
                    i = 4;
                } else {
                    peerColor = this.peerColor;
                    i = 2;
                }
                swapAnimatedEmojiDrawable2.setColor(Integer.valueOf(ColorUtils.blendARGB(0.5f, color, peerColor.getColor(i, resourcesProvider))));
            } else {
                zzli.m(Theme.key_profile_verifiedBackground, resourcesProvider, swapAnimatedEmojiDrawable2);
            }
            if (!z2) {
                this.emojiCollectible.force(z);
            }
            invalidate();
        }

        public void setForum(boolean z) {
            if (this.isForum != z) {
                invalidate();
            }
            this.isForum = z;
        }

        public final void setStatusEmoji(long j, boolean z, boolean z2) {
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.statusEmoji;
            swapAnimatedEmojiDrawable.set(j, z2);
            swapAnimatedEmojiDrawable.setParticles(z, z2);
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
            MessagesController.PeerColor peerColor = this.peerColor;
            if (peerColor != null) {
                swapAnimatedEmojiDrawable.setColor(Integer.valueOf(ColorUtils.blendARGB(0.5f, peerColor.getColor2(zIsDark), this.peerColor.hasColor6(zIsDark) ? this.peerColor.getColor5(zIsDark) : this.peerColor.getColor3(zIsDark))));
            } else {
                zzli.m(Theme.key_profile_verifiedBackground, resourcesProvider, swapAnimatedEmojiDrawable);
            }
        }

        public final void setColor(MessagesController.PeerColor peerColor, boolean z) {
            this.peerColor = peerColor;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.botVerificationEmoji;
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.statusEmoji;
            SimpleTextView simpleTextView = this.subtitleView;
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable3 = this.emoji;
            ProfileActivity.AnonymousClass24 anonymousClass24 = this.titleView;
            if (peerColor != null) {
                int i = peerColor.patternColor;
                if (i != 0) {
                    swapAnimatedEmojiDrawable3.setColor(Integer.valueOf(i));
                } else {
                    swapAnimatedEmojiDrawable3.setColor(Integer.valueOf(PeerColorActivity.adaptProfileEmojiColor(peerColor.getBgColor1(zIsDark))));
                }
                swapAnimatedEmojiDrawable2.setColor(Integer.valueOf(ColorUtils.blendARGB(0.25f, peerColor.getStoryColor1(Theme.currentTheme.isDark()), -1)));
                swapAnimatedEmojiDrawable.setColor(Integer.valueOf(ColorUtils.blendARGB(0.25f, peerColor.getStoryColor1(Theme.currentTheme.isDark()), -1)));
                int iBlendARGB = ColorUtils.blendARGB(0.5f, peerColor.getStoryColor1(zIsDark), peerColor.getStoryColor2(zIsDark));
                int i2 = Theme.key_actionBarDefault;
                if (!Theme.hasHue(Theme.getColor(i2, resourcesProvider))) {
                    simpleTextView.setTextColor(iBlendARGB);
                } else {
                    int color = Theme.getColor(i2, resourcesProvider);
                    int color2 = Theme.getColor(Theme.key_avatar_subtitleInProfileBlue, resourcesProvider);
                    float[] tempHsv = Theme.getTempHsv(3);
                    float[] tempHsv2 = Theme.getTempHsv(4);
                    Color.colorToHSV(color, tempHsv);
                    Color.colorToHSV(iBlendARGB, tempHsv2);
                    simpleTextView.setTextColor(Theme.changeColorAccent(tempHsv, tempHsv2, color2, zIsDark, iBlendARGB));
                }
                anonymousClass24.setTextColor(-1);
            } else {
                int i3 = Theme.key_actionBarDefault;
                if (AndroidUtilities.computePerceivedBrightness(Theme.getColor(i3, resourcesProvider)) > 0.8f) {
                    zzli.m(Theme.key_windowBackgroundWhiteBlueText, resourcesProvider, swapAnimatedEmojiDrawable3);
                } else if (AndroidUtilities.computePerceivedBrightness(Theme.getColor(i3, resourcesProvider)) < 0.2f) {
                    swapAnimatedEmojiDrawable3.setColor(Integer.valueOf(Theme.multAlpha(0.5f, Theme.getColor(Theme.key_actionBarDefaultTitle, resourcesProvider))));
                } else {
                    swapAnimatedEmojiDrawable3.setColor(Integer.valueOf(PeerColorActivity.adaptProfileEmojiColor(Theme.getColor(i3, resourcesProvider))));
                }
                int i4 = Theme.key_profile_verifiedBackground;
                zzli.m(i4, resourcesProvider, swapAnimatedEmojiDrawable2);
                zzli.m(i4, resourcesProvider, swapAnimatedEmojiDrawable);
                simpleTextView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubtitle, resourcesProvider));
                anonymousClass24.setTextColor(Theme.getColor(Theme.key_actionBarDefaultTitle, resourcesProvider));
            }
            this.storyGradient.setColor(peerColor, z);
            invalidate();
        }
    }

    public final class PeerColorDrawable extends Drawable {
        public static final int $r8$clinit = 0;
        public final Path clipCirclePath;
        public final Paint color1Paint;
        public final Paint color2Paint;
        public final Path color2Path;
        public final Paint color3Paint;
        public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emoji;
        public final boolean hasColor3;
        public float radius = AndroidUtilities.dpf2(10.6665f);
        public Paint strokePaint;

        public PeerColorDrawable(int i, int i2, int i3) {
            Paint paint = new Paint(1);
            this.color1Paint = paint;
            Paint paint2 = new Paint(1);
            this.color2Paint = paint2;
            Paint paint3 = new Paint(1);
            this.color3Paint = paint3;
            this.color2Path = new Path();
            this.clipCirclePath = new Path();
            this.hasColor3 = i3 != i;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            this.emoji = null;
            initPath();
        }

        public static PeerColorDrawable from(int i, int i2) {
            if (i2 < 7) {
                int[] iArr = Theme.keys_avatar_nameInMessage;
                return new PeerColorDrawable(Theme.getColor(null, iArr[i2], false), Theme.getColor(null, iArr[i2], false), Theme.getColor(null, iArr[i2], false));
            }
            MessagesController.PeerColors peerColors = MessagesController.getInstance(i).peerColors;
            return from(peerColors != null ? peerColors.getColor(i2) : null, false);
        }

        @Override
        public final void draw(Canvas canvas) {
            canvas.save();
            canvas.translate(getBounds().centerX() - this.radius, getBounds().centerY() - this.radius);
            Paint paint = this.strokePaint;
            if (paint != null) {
                float f = this.radius;
                canvas.drawCircle(f, f, f, paint);
            }
            canvas.clipPath(this.clipCirclePath);
            canvas.drawPaint(this.color1Paint);
            canvas.drawPath(this.color2Path, this.color2Paint);
            if (this.hasColor3) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(this.radius - AndroidUtilities.dp(3.66f), this.radius - AndroidUtilities.dp(3.66f), this.radius + AndroidUtilities.dp(3.66f), this.radius + AndroidUtilities.dp(3.66f));
                float f2 = this.radius;
                canvas.rotate(45.0f, f2, f2);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), this.color3Paint);
            }
            canvas.restore();
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
            if (swapAnimatedEmojiDrawable != null) {
                int iDp = AndroidUtilities.dp(14.0f) / 2;
                swapAnimatedEmojiDrawable.setBounds(getBounds().centerX() - iDp, getBounds().centerY() - iDp, getBounds().centerX() + iDp, getBounds().centerY() + iDp);
                swapAnimatedEmojiDrawable.draw(canvas);
            }
        }

        @Override
        public final int getIntrinsicHeight() {
            return (int) (this.radius * 2.0f);
        }

        @Override
        public final int getIntrinsicWidth() {
            return (int) (this.radius * 2.0f);
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        public final void initPath() {
            Path path = this.clipCirclePath;
            path.rewind();
            float f = this.radius;
            path.addCircle(f, f, f, Path.Direction.CW);
            Path path2 = this.color2Path;
            path2.rewind();
            path2.moveTo(this.radius * 2.0f, 0.0f);
            float f2 = this.radius * 2.0f;
            path2.lineTo(f2, f2);
            path2.lineTo(0.0f, this.radius * 2.0f);
            path2.close();
        }

        @Override
        public final void setAlpha(int i) {
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }

        public final void setView(View view) {
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
            if (view != null) {
                if (swapAnimatedEmojiDrawable != null) {
                    swapAnimatedEmojiDrawable.setParentView(view);
                }
                view.addOnAttachStateChangeListener(new AvatarSpan.AnonymousClass1(this, 15));
            } else if (swapAnimatedEmojiDrawable != null) {
                swapAnimatedEmojiDrawable.detach();
                swapAnimatedEmojiDrawable.setParentView(null);
            }
        }

        public static PeerColorDrawable from(MessagesController.PeerColor peerColor, boolean z) {
            if (peerColor == null) {
                return new PeerColorDrawable(0, 0, 0);
            }
            return new PeerColorDrawable(peerColor.getColor1(), (!z || peerColor.hasColor6(Theme.currentTheme.isDark())) ? peerColor.getColor2() : peerColor.getColor1(), z ? peerColor.getColor1() : peerColor.getColor3());
        }

        public PeerColorDrawable(long j, int i, int i2, int i3) {
            Paint paint = new Paint(1);
            this.color1Paint = paint;
            Paint paint2 = new Paint(1);
            this.color2Paint = paint2;
            Paint paint3 = new Paint(1);
            this.color3Paint = paint3;
            this.color2Path = new Path();
            this.clipCirclePath = new Path();
            this.hasColor3 = i3 != i;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            initPath();
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(null, false, AndroidUtilities.dp(14.0f), 7);
            this.emoji = swapAnimatedEmojiDrawable;
            swapAnimatedEmojiDrawable.set(j, false);
        }
    }
}
