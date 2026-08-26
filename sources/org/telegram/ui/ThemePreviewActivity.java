package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import com.google.android.gms.internal.mlkit_vision_common.zzln;
import com.stripe.android.Stripe;
import com.stripe.android.time.Clock;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticApiModelOutline5;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.utils.GradientProtectionDrawable;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.MenuDrawable;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticApiModelOutline3;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.MaxFileSizeCell;
import org.telegram.ui.Cells.PatternCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.BackgroundGradientDrawable$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayoutPreview;
import org.telegram.ui.Components.ColorPicker;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.GestureDetector2;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.Paint.Views.MessageEntityView;
import org.telegram.ui.Components.PhotoFilterBlurControl;
import org.telegram.ui.Components.PhotoFilterCurvesControl;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet.ViewPage;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RectOld;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SeekBarView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.Size;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.WallpaperCheckBoxView;
import org.telegram.ui.Components.WallpaperParallaxEffect;
import org.telegram.ui.Components.poll.sheets.CountrySelectBottomSheet;
import org.telegram.ui.Gifts.AuctionBidSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.SliderView;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.bots.AffiliateProgramFragment;

public class ThemePreviewActivity extends BaseFragment implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public int TAG;
    public final Theme.ThemeAccent accent;
    public ActionBar actionBar2;
    public HintView animationHint;
    public BlurButton applyButton1;
    public BlurButton applyButton2;
    public final Runnable applyColorAction;
    public boolean applyColorScheduled;
    public final Theme.ThemeInfo applyingTheme;
    public FrameLayout backgroundButtonsContainer;
    public WallpaperCheckBoxView[] backgroundCheckBoxView;
    public int backgroundColor;
    public int backgroundGradientColor1;
    public int backgroundGradientColor2;
    public int backgroundGradientColor3;
    public BackgroundGradientDrawable$$ExternalSyntheticLambda1 backgroundGradientDisposable;
    public BackgroundView backgroundImage;
    public final BackgroundView[] backgroundImages;
    public ImageView backgroundPlayAnimationImageView;
    public AnonymousClass16 backgroundPlayAnimationView;
    public AnimatorSet backgroundPlayViewAnimator;
    public int backgroundRotation;
    public final int backupAccentColor;
    public final int backupAccentColor2;
    public final long backupBackgroundGradientOverrideColor1;
    public final long backupBackgroundGradientOverrideColor2;
    public final long backupBackgroundGradientOverrideColor3;
    public final long backupBackgroundOverrideColor;
    public final int backupBackgroundRotation;
    public final float backupIntensity;
    public final int backupMyMessagesAccentColor;
    public final boolean backupMyMessagesAnimated;
    public final int backupMyMessagesGradientAccentColor1;
    public final int backupMyMessagesGradientAccentColor2;
    public final int backupMyMessagesGradientAccentColor3;
    public final String backupSlug;
    public final PorterDuff.Mode blendMode;
    public Bitmap blurredBitmap;
    public BitmapDrawable blurredDrawable;
    public TL_stories.TL_premium_boostsStatus boostsStatus;
    public AnonymousClass13 bottomOverlayChat;
    public TextView cancelButton;
    public PeerColorActivity.AnonymousClass7 changeDayNightView;
    public ValueAnimator changeDayNightViewAnimator;
    public ValueAnimator changeDayNightViewAnimator2;
    public float changeDayNightViewProgress;
    public int checkColor;
    public boolean checkedBoostsLevel;
    public boolean checkingBoostsLevel;
    public ColorPicker colorPicker;
    public int colorType;
    public float croppedWidth;
    public float currentIntensity;
    public float currentScrollOffset;
    public Object currentWallpaper;
    public Bitmap currentWallpaperBitmap;
    public ActionBarMenuItem dayNightItem;
    public float defaultScrollOffset;
    public WallpaperActivityDelegate delegate;
    public final boolean deleteOnCancel;
    public long dialogId;
    public DialogsAdapter dialogsAdapter;
    public float dimAmount;
    public AnonymousClass15 dimmingSlider;
    public AnonymousClass14 dimmingSliderContainer;
    public TextView doneButton;
    public ChatActivity.AnonymousClass27 dotsContainer;
    public TextView dropDown;
    public AnonymousClass9 dropDownContainer;
    public final boolean editingTheme;
    public FragmentFloatingButton floatingButton;
    public TextureViewContainer frameLayout;
    public final GestureDetector2 gestureDetector2;
    public boolean hasScrollingBackground;
    public String imageFilter;
    public HeaderCell intensityCell;
    public MaxFileSizeCell.AnonymousClass1 intensitySeekBar;
    public boolean isBlurred;
    public boolean isMotion;
    public WeakReference lastDrawableToBlur;
    public int lastPickedColor;
    public int lastPickedColorNum;
    public TLRPC.TL_wallPaper lastSelectedPattern;
    public int lastSizeHash;
    public RecyclerListView listView;
    public AnonymousClass10 listView2;
    public ColoredImageSpan lockSpan;
    public float maxScrollOffset;
    public int maxWallpaperSize;
    public MessagesAdapter messagesAdapter;
    public FrameLayout messagesButtonsContainer;
    public WallpaperCheckBoxView[] messagesCheckBoxView;
    public ImageView messagesPlayAnimationImageView;
    public AnonymousClass16 messagesPlayAnimationView;
    public AnimatorSet messagesPlayViewAnimator;
    public AnimatorSet motionAnimation;
    public final Theme.AnonymousClass12 msgOutDrawable;
    public final Theme.AnonymousClass12 msgOutDrawableSelected;
    public final Theme.AnonymousClass12 msgOutMediaDrawable;
    public final Theme.AnonymousClass12 msgOutMediaDrawableSelected;
    public final boolean nightTheme;
    public LaunchActivity$$ExternalSyntheticLambda28 onGlobalLayoutListener;
    public DayNightSwitchDelegate onSwitchDayNightDelegate;
    public Bitmap originalBitmap;
    public FrameLayout page1;
    public QrActivity.AnonymousClass1 page2;
    public WallpaperParallaxEffect parallaxEffect;
    public float parallaxScale;
    public int patternColor;
    public final FrameLayout[] patternLayout;
    public TextView patternTitleView;
    public AnimatorSet patternViewAnimation;
    public ArrayList patterns;
    public PatternsAdapter patternsAdapter;
    public final FrameLayout[] patternsButtonsContainer;
    public final TextView[] patternsCancelButton;
    public final HashMap patternsDict;
    public LinearLayoutManager patternsLayoutManager;
    public MessageSeenView.AnonymousClass1 patternsListView;
    public final TextView[] patternsSaveButton;
    public int previousBackgroundColor;
    public int previousBackgroundGradientColor1;
    public int previousBackgroundGradientColor2;
    public int previousBackgroundGradientColor3;
    public int previousBackgroundRotation;
    public float previousIntensity;
    public TLRPC.TL_wallPaper previousSelectedPattern;
    public float progressToDarkTheme;
    public boolean removeBackgroundOverride;
    public boolean rotatePreview;
    public FrameLayout saveButtonsContainer;
    public ActionBarMenuItem saveItem;
    public final int screenType;
    public Scroller scroller;
    public TLRPC.TL_wallPaper selectedPattern;
    public boolean self;
    public MessageObject serverWallpaper;
    public boolean setupFinished;
    public Drawable sheetDrawable;
    public boolean shouldShowBrightnessControll;
    public boolean shouldShowDayNightIcon;
    public RLottieDrawable sunDrawable;
    public final AnonymousClass1 themeDelegate;
    public ArrayList themeDescriptions;
    public UndoView undoView;
    public final boolean useDefaultThemeForButtons;
    public ValueAnimator valueAnimator;
    public ViewPager viewPager;
    public boolean wasScroll;
    public long watchForKeyboardEndTime;

    public final class AnonymousClass1 implements Theme.ResourcesProvider {
        public final Paint chat_actionBackgroundGradientDarkenPaint;
        public final TextPaint chat_actionTextPaint;
        public final TextPaint chat_actionTextPaint2;
        public final TextPaint chat_botButtonPaint;
        public Theme.ResourcesProvider parentProvider;
        public Bitmap serviceBitmap;
        public Matrix serviceBitmapMatrix;
        public BitmapShader serviceBitmapShader;
        public final ThemePreviewActivity this$0$1;
        public final SparseIntArray currentColors = new SparseIntArray();
        public final Paint chat_actionBackgroundPaint = new Paint(3);
        public final Paint chat_actionBackgroundSelectedPaint = new Paint(3);

        public AnonymousClass1() {
            this.this$0$1 = ThemePreviewActivity.this;
            Paint paint = new Paint(3);
            this.chat_actionBackgroundGradientDarkenPaint = paint;
            TextPaint textPaint = new TextPaint();
            this.chat_actionTextPaint = textPaint;
            TextPaint textPaint2 = new TextPaint();
            this.chat_actionTextPaint2 = textPaint2;
            TextPaint textPaint3 = new TextPaint();
            this.chat_botButtonPaint = textPaint3;
            textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
            textPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
            textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint3.setTypeface(AndroidUtilities.bold());
            paint.setColor(352321536);
        }

        public final void applyChatServiceMessageColor(Drawable drawable, Drawable drawable2, Float f) {
            Bitmap bitmap;
            int i = Theme.key_chat_serviceBackground;
            int color = getColor(i);
            int color2 = getColor(Theme.key_chat_serviceBackgroundSelected);
            if (drawable == null) {
                drawable = drawable2;
            }
            boolean z = drawable instanceof MotionBackgroundDrawable;
            TextPaint textPaint = this.chat_actionTextPaint2;
            TextPaint textPaint2 = this.chat_actionTextPaint;
            if ((z || (drawable instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) {
                if (z) {
                    bitmap = ((MotionBackgroundDrawable) drawable).currentBitmap;
                } else {
                    bitmap = drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap() : null;
                }
                if (this.serviceBitmap != bitmap) {
                    this.serviceBitmap = bitmap;
                    Bitmap bitmap2 = this.serviceBitmap;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.serviceBitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                    if (this.serviceBitmapMatrix == null) {
                        this.serviceBitmapMatrix = new Matrix();
                    }
                }
                textPaint2.setColor(-1);
                textPaint.setColor(-1);
                textPaint2.linkColor = -1;
                this.chat_botButtonPaint.setColor(-1);
            } else {
                this.serviceBitmap = null;
                this.serviceBitmapShader = null;
                int i2 = Theme.key_chat_serviceText;
                textPaint2.setColor(getColor(i2));
                textPaint.setColor(getColor(i2));
                textPaint2.linkColor = getColor(Theme.key_chat_serviceLink);
            }
            Paint paint = this.chat_actionBackgroundPaint;
            paint.setColor(color);
            Paint paint2 = this.chat_actionBackgroundSelectedPaint;
            paint2.setColor(color2);
            if (this.serviceBitmapShader == null || !(this.currentColors.indexOfKey(i) < 0 || z || (drawable instanceof BitmapDrawable))) {
                paint.setColorFilter(null);
                paint.setShader(null);
                paint2.setColorFilter(null);
                paint2.setShader(null);
                return;
            }
            ColorMatrix colorMatrix = new ColorMatrix();
            if (z) {
                if (((MotionBackgroundDrawable) drawable).intensity >= 0.0f) {
                    colorMatrix.setSaturation(1.6f);
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, isDark() ? 0.97f : 0.92f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, isDark() ? 0.12f : -0.06f);
                } else {
                    colorMatrix.setSaturation(1.1f);
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, isDark() ? 0.4f : 0.8f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, isDark() ? 0.08f : -0.06f);
                }
            } else {
                colorMatrix.setSaturation(1.6f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, isDark() ? 0.9f : 0.84f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, isDark() ? -0.04f : 0.06f);
            }
            if (z) {
                float fFloatValue = ((MotionBackgroundDrawable) drawable).intensity;
                if (f != null) {
                    fFloatValue = f.floatValue();
                }
                if (fFloatValue >= 0.0f) {
                    colorMatrix.setSaturation(1.8f);
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.97f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.03f);
                } else {
                    colorMatrix.setSaturation(0.5f);
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.35f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.03f);
                }
            } else {
                colorMatrix.setSaturation(1.6f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.97f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.06f);
            }
            paint.setShader(this.serviceBitmapShader);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            paint.setAlpha(255);
            paint2.setShader(this.serviceBitmapShader);
            ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix2, 0.85f);
            paint2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
            paint2.setAlpha(255);
        }

        @Override
        public final void applyServiceShaderMatrix(float f, float f2, int i, int i2) {
            BitmapShader bitmapShader;
            Bitmap bitmap = this.serviceBitmap;
            if (bitmap == null || (bitmapShader = this.serviceBitmapShader) == null) {
                ArticleViewer.IBlock.CC.$default$applyServiceShaderMatrix(f, f2, i, i2);
            } else {
                Theme.applyServiceShaderMatrix(bitmap, bitmapShader, this.serviceBitmapMatrix, i, i2, f, f2);
            }
        }

        @Override
        public final ColorFilter getAnimatedEmojiColorFilter() {
            return Theme.chat_animatedEmojiTextColorFilter;
        }

        @Override
        public final int getColor(int i) {
            Theme.ResourcesProvider resourcesProvider = this.parentProvider;
            return resourcesProvider != null ? resourcesProvider.getColor(i) : Theme.getColor(null, i, false);
        }

        @Override
        public final int getColorOrDefault(int i) {
            return getColor(i);
        }

        @Override
        public final int getCurrentColor(int i) {
            Theme.ResourcesProvider resourcesProvider = this.parentProvider;
            return resourcesProvider != null ? resourcesProvider.getCurrentColor(i) : getColor(i);
        }

        @Override
        public final Drawable getDrawable(String str) {
            Theme.ResourcesProvider resourcesProvider = this.parentProvider;
            return resourcesProvider != null ? resourcesProvider.getDrawable(str) : (Drawable) Theme.defaultChatDrawables.get(str);
        }

        @Override
        public final Paint getPaint(String str) {
            str.getClass();
            switch (str) {
                case "paintChatActionText2":
                    return this.chat_actionTextPaint2;
                case "paintChatActionBackground":
                    return this.chat_actionBackgroundPaint;
                case "paintChatBotButton":
                    return this.chat_botButtonPaint;
                case "paintChatActionBackgroundDarken":
                    return this.chat_actionBackgroundGradientDarkenPaint;
                case "paintChatActionBackgroundSelected":
                    return this.chat_actionBackgroundSelectedPaint;
                case "paintChatActionText":
                    return this.chat_actionTextPaint;
                default:
                    Theme.ResourcesProvider resourcesProvider = this.parentProvider;
                    return resourcesProvider != null ? resourcesProvider.getPaint(str) : Theme.getThemePaint(str);
            }
        }

        @Override
        public final boolean hasGradientService() {
            Theme.ResourcesProvider resourcesProvider = this.parentProvider;
            return resourcesProvider != null ? resourcesProvider.hasGradientService() : Theme.hasGradientService();
        }

        @Override
        public final boolean isDark() {
            DayNightSwitchDelegate dayNightSwitchDelegate = ThemePreviewActivity.this.onSwitchDayNightDelegate;
            if (dayNightSwitchDelegate != null) {
                return dayNightSwitchDelegate.isDark();
            }
            DayNightSwitchDelegate dayNightSwitchDelegate2 = this.this$0$1.onSwitchDayNightDelegate;
            if (dayNightSwitchDelegate2 != null) {
                return dayNightSwitchDelegate2.isDark();
            }
            Theme.ResourcesProvider resourcesProvider = this.parentProvider;
            return resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
        }

        @Override
        public final void setAnimatedColor(int i, int i2) {
        }
    }

    public final class AnonymousClass26 implements ColorPicker.ColorPickerDelegate {
        public AnonymousClass26() {
        }

        @Override
        public final void deleteTheme() {
            ThemePreviewActivity themePreviewActivity = ThemePreviewActivity.this;
            if (themePreviewActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(themePreviewActivity.getParentActivity(), 0, null);
            String string = LocaleController.getString(R.string.DeleteThemeTitle);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString(R.string.DeleteThemeAlert);
            builder.setPositiveButton(LocaleController.getString(R.string.Delete), new TodoItemMenu$$ExternalSyntheticLambda3(this, 2));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            themePreviewActivity.showDialog(alertDialog);
            TextView textView = (TextView) alertDialog.getButton(-1);
            if (textView != null) {
                textView.setTextColor(themePreviewActivity.getThemedColor(Theme.key_text_RedBold));
            }
        }

        @Override
        public final int getDefaultColor(int i) {
            Theme.ThemeAccent themeAccent;
            ThemePreviewActivity themePreviewActivity = ThemePreviewActivity.this;
            if (themePreviewActivity.colorType != 3) {
                return 0;
            }
            Theme.ThemeInfo themeInfo = themePreviewActivity.applyingTheme;
            if (themeInfo.firstAccentIsDefault && i == 0 && (themeAccent = (Theme.ThemeAccent) themeInfo.themeAccentsMap.get(Theme.DEFALT_THEME_ACCENT_ID)) != null) {
                return themeAccent.myMessagesAccentColor;
            }
            return 0;
        }

        @Override
        public final void openThemeCreate(boolean z) throws Throwable {
            ThemePreviewActivity themePreviewActivity = ThemePreviewActivity.this;
            if (!z) {
                AlertsCreator.createThemeCreateDialog(themePreviewActivity, 1, null, null);
                return;
            }
            Theme.ThemeAccent themeAccent = themePreviewActivity.accent;
            if (themeAccent.info == null) {
                themePreviewActivity.finishFragment();
                MessagesController.getInstance(((BaseFragment) themePreviewActivity).currentAccount).saveThemeToServer(themeAccent.parentTheme, themeAccent);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, themeAccent.parentTheme, themeAccent);
            } else {
                String str = "https://" + MessagesController.getInstance(((BaseFragment) themePreviewActivity).currentAccount).linkPrefix + "/addtheme/" + themeAccent.info.slug;
                themePreviewActivity.showDialog(new ShareAlert(themePreviewActivity.getParentActivity(), str, str, null));
            }
        }

        @Override
        public final void setColor(int i, int i2, boolean z) {
            int i3;
            int i4;
            boolean z2;
            ThemePreviewActivity themePreviewActivity = ThemePreviewActivity.this;
            if (themePreviewActivity.screenType == 2) {
                themePreviewActivity.setBackgroundColor(i, i2, true);
                return;
            }
            if (i2 != -1) {
                int i5 = themePreviewActivity.lastPickedColorNum;
                Runnable runnable = themePreviewActivity.applyColorAction;
                if (i5 != -1 && i5 != i2) {
                    runnable.run();
                }
                themePreviewActivity.lastPickedColor = i;
                themePreviewActivity.lastPickedColorNum = i2;
                if (z) {
                    runnable.run();
                    return;
                } else {
                    if (themePreviewActivity.applyColorScheduled) {
                        return;
                    }
                    themePreviewActivity.applyColorScheduled = true;
                    themePreviewActivity.fragmentView.postDelayed(runnable, 16L);
                    return;
                }
            }
            int i6 = themePreviewActivity.colorType;
            Theme.ThemeAccent themeAccent = themePreviewActivity.accent;
            if (i6 == 1 || i6 == 2) {
                long j = themePreviewActivity.backupBackgroundOverrideColor;
                if (j != 0) {
                    themeAccent.backgroundOverrideColor = j;
                } else {
                    themeAccent.backgroundOverrideColor = 0L;
                }
                long j2 = themePreviewActivity.backupBackgroundGradientOverrideColor1;
                if (j2 != 0) {
                    themeAccent.backgroundGradientOverrideColor1 = j2;
                } else {
                    themeAccent.backgroundGradientOverrideColor1 = 0L;
                }
                long j3 = themePreviewActivity.backupBackgroundGradientOverrideColor2;
                if (j3 != 0) {
                    themeAccent.backgroundGradientOverrideColor2 = j3;
                } else {
                    themeAccent.backgroundGradientOverrideColor2 = 0L;
                }
                long j4 = themePreviewActivity.backupBackgroundGradientOverrideColor3;
                if (j4 != 0) {
                    themeAccent.backgroundGradientOverrideColor3 = j4;
                } else {
                    themeAccent.backgroundGradientOverrideColor3 = 0L;
                }
                themeAccent.backgroundRotation = themePreviewActivity.backupBackgroundRotation;
                if (i6 == 2) {
                    int defaultAccentColor = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper);
                    int defaultAccentColor2 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to1);
                    int defaultAccentColor3 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to2);
                    int defaultAccentColor4 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to3);
                    int i7 = (int) themeAccent.backgroundGradientOverrideColor1;
                    int i8 = (int) themeAccent.backgroundGradientOverrideColor2;
                    int i9 = (int) themeAccent.backgroundGradientOverrideColor3;
                    int i10 = (int) themeAccent.backgroundOverrideColor;
                    ColorPicker colorPicker = themePreviewActivity.colorPicker;
                    if (i9 != 0) {
                        defaultAccentColor4 = i9;
                    }
                    colorPicker.setColor(defaultAccentColor4, 3);
                    ColorPicker colorPicker2 = themePreviewActivity.colorPicker;
                    if (i8 != 0) {
                        defaultAccentColor3 = i8;
                    }
                    colorPicker2.setColor(defaultAccentColor3, 2);
                    ColorPicker colorPicker3 = themePreviewActivity.colorPicker;
                    if (i7 != 0) {
                        defaultAccentColor2 = i7;
                    }
                    i3 = 1;
                    colorPicker3.setColor(defaultAccentColor2, 1);
                    ColorPicker colorPicker4 = themePreviewActivity.colorPicker;
                    if (i10 != 0) {
                        defaultAccentColor = i10;
                    }
                    colorPicker4.setColor(defaultAccentColor, 0);
                } else {
                    i3 = 1;
                }
            } else {
                i3 = 1;
            }
            int i11 = themePreviewActivity.colorType;
            if (i11 == i3 || i11 == 3) {
                int i12 = themePreviewActivity.backupMyMessagesAccentColor;
                if (i12 != 0) {
                    themeAccent.myMessagesAccentColor = i12;
                    i4 = 0;
                } else {
                    i4 = 0;
                    themeAccent.myMessagesAccentColor = 0;
                }
                int i13 = themePreviewActivity.backupMyMessagesGradientAccentColor1;
                if (i13 != 0) {
                    themeAccent.myMessagesGradientAccentColor1 = i13;
                } else {
                    themeAccent.myMessagesGradientAccentColor1 = i4;
                }
                int i14 = themePreviewActivity.backupMyMessagesGradientAccentColor2;
                if (i14 != 0) {
                    themeAccent.myMessagesGradientAccentColor2 = i14;
                } else {
                    themeAccent.myMessagesGradientAccentColor2 = i4;
                }
                int i15 = themePreviewActivity.backupMyMessagesGradientAccentColor3;
                if (i15 != 0) {
                    themeAccent.myMessagesGradientAccentColor3 = i15;
                } else {
                    themeAccent.myMessagesGradientAccentColor3 = i4;
                }
                if (i11 == 3) {
                    themePreviewActivity.colorPicker.setColor(themeAccent.myMessagesGradientAccentColor3, 3);
                    themePreviewActivity.colorPicker.setColor(themeAccent.myMessagesGradientAccentColor2, 2);
                    themePreviewActivity.colorPicker.setColor(themeAccent.myMessagesGradientAccentColor1, 1);
                    ColorPicker colorPicker5 = themePreviewActivity.colorPicker;
                    int i16 = themeAccent.myMessagesAccentColor;
                    if (i16 == 0) {
                        i16 = themeAccent.accentColor;
                    }
                    z2 = false;
                    colorPicker5.setColor(i16, 0);
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            Theme.refreshThemeColors(z2, z2);
            themePreviewActivity.listView2.invalidateViews();
        }
    }

    public final class AnonymousClass29 extends PagerAdapter {
        public final int $r8$classId;
        public final NotificationCenter.NotificationCenterDelegate this$0;

        public AnonymousClass29(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i) {
            this.$r8$classId = i;
            this.this$0 = notificationCenterDelegate;
        }

        @Override
        public final void destroyItem(ViewPager viewPager, Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    viewPager.removeView((View) obj);
                    break;
                case 1:
                    viewPager.removeView((View) obj);
                    break;
                default:
                    viewPager.removeView((View) obj);
                    break;
            }
        }

        @Override
        public final int getCount() {
            switch (this.$r8$classId) {
                case 0:
                    return ((ThemePreviewActivity) this.this$0).screenType != 0 ? 1 : 2;
                case 1:
                    return ((PremiumFeatureBottomSheet) this.this$0).premiumFeatures.size();
                default:
                    return ((IntroActivity) this.this$0).titles.length;
            }
        }

        @Override
        public int getItemPosition(Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    return -1;
                default:
                    return super.getItemPosition(obj);
            }
        }

        @Override
        public final Object instantiateItem(ViewPager viewPager, int i) {
            switch (this.$r8$classId) {
                case 0:
                    ThemePreviewActivity themePreviewActivity = (ThemePreviewActivity) this.this$0;
                    View view = i == 0 ? themePreviewActivity.page2 : themePreviewActivity.page1;
                    viewPager.addView(view);
                    return view;
                case 1:
                    PremiumFeatureBottomSheet premiumFeatureBottomSheet = (PremiumFeatureBottomSheet) this.this$0;
                    PremiumFeatureBottomSheet.ViewPage viewPage = premiumFeatureBottomSheet.new ViewPage(premiumFeatureBottomSheet.getContext(), i);
                    viewPager.addView(viewPage);
                    viewPage.position = i;
                    PremiumPreviewFragment.PremiumFeatureData premiumFeatureData = (PremiumPreviewFragment.PremiumFeatureData) premiumFeatureBottomSheet.premiumFeatures.get(i);
                    int i2 = premiumFeatureData.type;
                    TextView textView = viewPage.title;
                    LinkSpanDrawable.LinksTextView linksTextView = viewPage.description;
                    if (i2 == 0 || i2 == 14 || i2 == 28) {
                        textView.setText("");
                        linksTextView.setText("");
                        viewPage.topViewOnFullHeight = true;
                    } else {
                        boolean z = premiumFeatureBottomSheet.onlySelectedType;
                        String str = premiumFeatureData.description;
                        String str2 = premiumFeatureData.title;
                        if (z) {
                            int i3 = premiumFeatureBottomSheet.startType;
                            if (i3 == 4) {
                                textView.setText(LocaleController.getString(R.string.AdditionalReactions));
                                zzln.m(R.string.AdditionalReactionsDescription, linksTextView);
                            } else if (i3 == 3) {
                                textView.setText(LocaleController.getString(R.string.PremiumPreviewNoAds));
                                zzln.m(R.string.PremiumPreviewNoAdsDescription2, linksTextView);
                            } else if (i3 == 24) {
                                textView.setText(LocaleController.getString(R.string.PremiumPreviewTags));
                                zzln.m(R.string.PremiumPreviewTagsDescription, linksTextView);
                            } else if (i3 == 10) {
                                textView.setText(LocaleController.getString(R.string.PremiumPreviewAppIcon));
                                zzln.m(R.string.PremiumPreviewAppIconDescription2, linksTextView);
                            } else if (i3 == 2) {
                                textView.setText(LocaleController.getString(R.string.PremiumPreviewDownloadSpeed));
                                zzln.m(R.string.PremiumPreviewDownloadSpeedDescription2, linksTextView);
                            } else if (i3 == 9) {
                                textView.setText(LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement));
                                zzln.m(R.string.PremiumPreviewAdvancedChatManagementDescription2, linksTextView);
                            } else if (i3 == 8) {
                                textView.setText(LocaleController.getString(R.string.PremiumPreviewVoiceToText));
                                zzln.m(R.string.PremiumPreviewVoiceToTextDescription2, linksTextView);
                            } else if (i3 == 13) {
                                textView.setText(LocaleController.getString(R.string.PremiumPreviewTranslations));
                                zzln.m(R.string.PremiumPreviewTranslationsDescription, linksTextView);
                            } else if (i3 == 38) {
                                textView.setText(LocaleController.getString(R.string.PremiumPreviewEffects));
                                zzln.m(R.string.PremiumPreviewEffectsDescription, linksTextView);
                            } else if (i3 == 22) {
                                textView.setText(LocaleController.getString(R.string.PremiumPreviewWallpaper));
                                zzln.m(R.string.PremiumPreviewWallpaperDescription, linksTextView);
                            } else if (i3 == 23) {
                                textView.setText(LocaleController.getString(R.string.PremiumPreviewProfileColor));
                                zzln.m(R.string.PremiumPreviewProfileColorDescription, linksTextView);
                            } else if (i3 == 41) {
                                textView.setText(LocaleController.getString(R.string.PremiumPreviewSharingDisable));
                                zzln.m(R.string.PremiumPreviewSharingDisableDescription, linksTextView);
                            } else {
                                textView.setText(str2);
                                linksTextView.setText(AndroidUtilities.replaceTags(str));
                            }
                            viewPage.topViewOnFullHeight = false;
                        } else {
                            textView.setText(str2);
                            linksTextView.setText(AndroidUtilities.replaceTags(str));
                            viewPage.topViewOnFullHeight = false;
                        }
                    }
                    linksTextView.setMaxWidth(HintView2.cutInFancyHalf(linksTextView.getText(), linksTextView.getPaint()));
                    viewPage.requestLayout();
                    boolean z2 = premiumFeatureData.type == 40;
                    if (z2 && viewPage.featuresLayout == null) {
                        LinearLayout linearLayout = new LinearLayout(viewPage.getContext());
                        viewPage.featuresLayout = linearLayout;
                        linearLayout.setOrientation(1);
                        AffiliateProgramFragment.FeatureCell featureCell = new AffiliateProgramFragment.FeatureCell(viewPage.getContext(), ((BottomSheet) premiumFeatureBottomSheet).resourcesProvider, true);
                        featureCell.set(LocaleController.getString(R.string.GiftsFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
                        viewPage.featuresLayout.addView(featureCellArr[0], LayoutHelper.createLinear(-1, -2));
                        AffiliateProgramFragment.FeatureCell featureCell2 = new AffiliateProgramFragment.FeatureCell(viewPage.getContext(), ((BottomSheet) premiumFeatureBottomSheet).resourcesProvider, true);
                        featureCell2.set(LocaleController.getString(R.string.GiftsFeature2Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
                        viewPage.featuresLayout.addView(featureCellArr[1], LayoutHelper.createLinear(-1, -2));
                        AffiliateProgramFragment.FeatureCell featureCell3 = new AffiliateProgramFragment.FeatureCell(viewPage.getContext(), ((BottomSheet) premiumFeatureBottomSheet).resourcesProvider, true);
                        AffiliateProgramFragment.FeatureCell[] featureCellArr = {featureCell, featureCell2, featureCell3};
                        featureCell3.set(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
                        viewPage.featuresLayout.addView(featureCellArr[2], LayoutHelper.createLinear(-1, -2));
                        viewPage.addView(viewPage.featuresLayout, LayoutHelper.createLinear(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                    }
                    LinearLayout linearLayout2 = viewPage.featuresLayout;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(z2 ? 0 : 8);
                    }
                    ((ViewGroup.MarginLayoutParams) linksTextView.getLayoutParams()).topMargin = AndroidUtilities.dp(z2 ? 6.0f : 10.0f);
                    return viewPage;
                default:
                    TextView textView2 = new TextView(viewPager.getContext());
                    IntroActivity introActivity = (IntroActivity) this.this$0;
                    textView2.setTag(introActivity.pagerHeaderTag);
                    TextView textView3 = new TextView(viewPager.getContext());
                    textView3.setTag(introActivity.pagerMessageTag);
                    IntroActivity.AnonymousClass1 anonymousClass1 = new IntroActivity.AnonymousClass1(viewPager.getContext(), textView2, textView3);
                    int i4 = Theme.key_windowBackgroundWhiteBlackText;
                    textView2.setTextColor(Theme.getColor(null, i4, false));
                    textView2.setTextSize(1, 26.0f);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setGravity(17);
                    anonymousClass1.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                    textView3.setTextColor(Theme.getColor(null, i4, false));
                    textView3.setTextSize(1, 15.0f);
                    textView3.setLineSpacing(AndroidUtilities.dpf2(2.33f), 1.0f);
                    textView3.setGravity(17);
                    anonymousClass1.addView(textView3, LayoutHelper.createFrame(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                    viewPager.addView(anonymousClass1, 0);
                    textView2.setText(introActivity.titles[i]);
                    textView3.setText(AndroidUtilities.replaceTags(introActivity.messages[i]));
                    return anonymousClass1;
            }
        }

        @Override
        public final boolean isViewFromObject(View view, Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    return obj == view;
                case 1:
                    return view == obj;
                default:
                    return view.equals(obj);
            }
        }

        @Override
        public void setPrimaryItem(int i) {
            switch (this.$r8$classId) {
                case 2:
                    IntroActivity introActivity = (IntroActivity) this.this$0;
                    introActivity.bottomPages.setCurrentPage(i);
                    introActivity.currentViewPagerPage = i;
                    break;
            }
        }
    }

    public final class AnonymousClass32 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final ThemePreviewActivity this$0;

        public AnonymousClass32(ThemePreviewActivity themePreviewActivity, int i) {
            this.$r8$classId = i;
            this.this$0 = themePreviewActivity;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    super.onAnimationEnd(animator);
                    ThemePreviewActivity themePreviewActivity = this.this$0;
                    themePreviewActivity.backgroundImage.invalidate();
                    themePreviewActivity.backgroundImages[1].setVisibility(8);
                    themePreviewActivity.valueAnimator = null;
                    break;
                case 1:
                    this.this$0.motionAnimation = null;
                    break;
                case 2:
                    ThemePreviewActivity themePreviewActivity2 = this.this$0;
                    if (themePreviewActivity2.backgroundPlayAnimationView.getTag() == null) {
                        themePreviewActivity2.backgroundPlayAnimationView.setVisibility(4);
                    }
                    themePreviewActivity2.backgroundPlayViewAnimator = null;
                    break;
                case 3:
                    ThemePreviewActivity themePreviewActivity3 = this.this$0;
                    if (themePreviewActivity3.messagesPlayAnimationView.getTag() == null) {
                        themePreviewActivity3.messagesPlayAnimationView.setVisibility(4);
                    }
                    themePreviewActivity3.messagesPlayViewAnimator = null;
                    break;
                case 4:
                    ThemePreviewActivity themePreviewActivity4 = this.this$0;
                    PeerColorActivity.AnonymousClass7 anonymousClass7 = themePreviewActivity4.changeDayNightView;
                    if (anonymousClass7 != null) {
                        if (anonymousClass7.getParent() != null) {
                            ((ViewGroup) themePreviewActivity4.changeDayNightView.getParent()).removeView(themePreviewActivity4.changeDayNightView);
                        }
                        themePreviewActivity4.changeDayNightView = null;
                    }
                    themePreviewActivity4.changeDayNightViewAnimator = null;
                    super.onAnimationEnd(animator);
                    break;
                default:
                    ThemePreviewActivity themePreviewActivity5 = this.this$0;
                    if (!themePreviewActivity5.onSwitchDayNightDelegate.isDark()) {
                        themePreviewActivity5.dimmingSlider.setVisibility(8);
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass8 extends ActionBar.ActionBarMenuOnItemClick {
        public AnonymousClass8() {
        }

        @Override
        public final void onItemClick(int i) {
            File file;
            Theme.ThemeAccent accent;
            String url;
            int i2 = 7;
            ThemePreviewActivity themePreviewActivity = ThemePreviewActivity.this;
            if (i == -1) {
                if (themePreviewActivity.checkDiscard$7(true)) {
                    themePreviewActivity.cancelThemeApply(false);
                    return;
                }
                return;
            }
            if (i >= 1 && i <= 3) {
                themePreviewActivity.selectColorType(i, true);
                return;
            }
            if (i == 4) {
                if (themePreviewActivity.removeBackgroundOverride) {
                    Theme.currentTheme.setOverrideWallpaper(null);
                }
                Theme.ThemeAccent themeAccent = themePreviewActivity.accent;
                File pathToWallpaper = themeAccent.getPathToWallpaper();
                if (pathToWallpaper != null) {
                    pathToWallpaper.delete();
                }
                TLRPC.TL_wallPaper tL_wallPaper = themePreviewActivity.selectedPattern;
                themeAccent.patternSlug = tL_wallPaper != null ? tL_wallPaper.slug : "";
                themeAccent.patternIntensity = themePreviewActivity.currentIntensity;
                themeAccent.patternMotion = themePreviewActivity.isMotion;
                if (((int) themeAccent.backgroundOverrideColor) == 0) {
                    themeAccent.backgroundOverrideColor = 4294967296L;
                }
                if (((int) themeAccent.backgroundGradientOverrideColor1) == 0) {
                    themeAccent.backgroundGradientOverrideColor1 = 4294967296L;
                }
                if (((int) themeAccent.backgroundGradientOverrideColor2) == 0) {
                    themeAccent.backgroundGradientOverrideColor2 = 4294967296L;
                }
                if (((int) themeAccent.backgroundGradientOverrideColor3) == 0) {
                    themeAccent.backgroundGradientOverrideColor3 = 4294967296L;
                }
                themePreviewActivity.saveAccentWallpaper();
                NotificationCenter.getGlobalInstance().removeObserver(themePreviewActivity, NotificationCenter.wallpapersDidLoad);
                Theme.saveThemeAccents(themePreviewActivity.applyingTheme, true, false, false, true, false);
                Theme.applyPreviousTheme();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themePreviewActivity.applyingTheme, Boolean.valueOf(themePreviewActivity.nightTheme), null, -1);
                themePreviewActivity.finishFragment();
                return;
            }
            if (i == 5) {
                if (themePreviewActivity.getParentActivity() == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                if (themePreviewActivity.isBlurred) {
                    sb.append("blur");
                }
                if (themePreviewActivity.isMotion) {
                    if (sb.length() > 0) {
                        sb.append("+");
                    }
                    sb.append("motion");
                }
                Object obj = themePreviewActivity.currentWallpaper;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    url = "https://" + MessagesController.getInstance(((BaseFragment) themePreviewActivity).currentAccount).linkPrefix + "/bg/" + ((TLRPC.TL_wallPaper) obj).slug;
                    if (sb.length() > 0) {
                        StringBuilder sbM = Log.m(url, "?mode=");
                        sbM.append(sb.toString());
                        url = sbM.toString();
                    }
                } else if (obj instanceof WallpapersListActivity.ColorWallpaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = themePreviewActivity.selectedPattern;
                    WallpapersListActivity.ColorWallpaper colorWallpaper = new WallpapersListActivity.ColorWallpaper(tL_wallPaper2 != null ? tL_wallPaper2.slug : "c", themePreviewActivity.backgroundColor, themePreviewActivity.backgroundGradientColor1, themePreviewActivity.backgroundGradientColor2, themePreviewActivity.backgroundGradientColor3, themePreviewActivity.backgroundRotation, themePreviewActivity.currentIntensity, themePreviewActivity.isMotion, null);
                    colorWallpaper.pattern = tL_wallPaper2;
                    url = colorWallpaper.getUrl();
                } else {
                    if (!BuildVars.DEBUG_PRIVATE_VERSION || (accent = Theme.currentTheme.getAccent(false)) == null) {
                        return;
                    }
                    WallpapersListActivity.ColorWallpaper colorWallpaper2 = new WallpapersListActivity.ColorWallpaper(accent.patternSlug, (int) accent.backgroundOverrideColor, (int) accent.backgroundGradientOverrideColor1, (int) accent.backgroundGradientOverrideColor2, (int) accent.backgroundGradientOverrideColor3, accent.backgroundRotation, accent.patternIntensity, accent.patternMotion, null);
                    int size = themePreviewActivity.patterns.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) themePreviewActivity.patterns.get(i3);
                        if (tL_wallPaper3.pattern && accent.patternSlug.equals(tL_wallPaper3.slug)) {
                            colorWallpaper2.pattern = tL_wallPaper3;
                            break;
                        }
                    }
                    url = colorWallpaper2.getUrl();
                }
                themePreviewActivity.showDialog(new ShareAlert(themePreviewActivity.getParentActivity(), url, url) {
                    @Override
                    public final void onSend(LongSparseArray longSparseArray, int i4, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
                        if (z) {
                            int size2 = longSparseArray.size();
                            AnonymousClass8 anonymousClass8 = AnonymousClass8.this;
                            if (size2 == 1) {
                                ThemePreviewActivity.this.undoView.showWithAction(((TLRPC.Dialog) longSparseArray.valueAt(0)).id, 61, Integer.valueOf(i4), (Object) null, (Runnable) null, (Runnable) null);
                            } else {
                                ThemePreviewActivity.this.undoView.showWithAction(0L, 61, Integer.valueOf(i4), Integer.valueOf(longSparseArray.size()), (Runnable) null, (Runnable) null);
                            }
                        }
                    }
                });
                return;
            }
            if (i != 6) {
                if (i == 7) {
                    Object obj2 = themePreviewActivity.currentWallpaper;
                    if (!(obj2 instanceof WallpapersListActivity.FileWallpaper) || (file = ((WallpapersListActivity.FileWallpaper) obj2).originalPath) == null) {
                        return;
                    }
                    final MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                    photoEntry.isVideo = false;
                    photoEntry.thumbPath = null;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(photoEntry);
                    PhotoViewer.getInstance().setParentActivity(themePreviewActivity.getParentActivity(), null, null);
                    PhotoViewer.getInstance().openPhotoForSelect(arrayList, 0, 3, false, new PhotoViewer.EmptyPhotoViewerProvider() {
                        @Override
                        public final boolean allowCaption() {
                            return false;
                        }

                        @Override
                        public final void sendButtonPressed(int i4, VideoEditedInfo videoEditedInfo, boolean z, int i5, int i6, boolean z2) throws FileNotFoundException {
                            MediaController.PhotoEntry photoEntry2 = photoEntry;
                            if (photoEntry2.imagePath != null) {
                                File file2 = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                                Point realScreenSize = AndroidUtilities.getRealScreenSize();
                                Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(photoEntry2.imagePath, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
                                try {
                                    bitmapLoadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file2));
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                File file3 = new File(photoEntry2.imagePath);
                                ThemePreviewActivity themePreviewActivity2 = ThemePreviewActivity.this;
                                themePreviewActivity2.currentWallpaper = new WallpapersListActivity.FileWallpaper(file3, file3, "");
                                themePreviewActivity2.currentWallpaperBitmap = bitmapLoadBitmap;
                                themePreviewActivity2.lastSizeHash = 0;
                                themePreviewActivity2.backgroundImage.requestLayout();
                                themePreviewActivity2.setCurrentImage(false);
                                themePreviewActivity2.blurredBitmap = null;
                                themePreviewActivity2.updateBlurred();
                            }
                        }
                    }, null);
                    return;
                }
                return;
            }
            if (SharedConfig.dayNightWallpaperSwitchHint <= 3) {
                SharedConfig.dayNightWallpaperSwitchHint = 10;
                SharedConfig.increaseDayNightWallpaperSiwtchHint();
            }
            boolean zIsDark = themePreviewActivity.onSwitchDayNightDelegate.isDark();
            DayNightSwitchDelegate dayNightSwitchDelegate = themePreviewActivity.onSwitchDayNightDelegate;
            if (dayNightSwitchDelegate != null) {
                if (!dayNightSwitchDelegate.supportsAnimation()) {
                    themePreviewActivity.toggleTheme();
                    return;
                }
                themePreviewActivity.onSwitchDayNightDelegate.switchDayNight(true);
                RLottieDrawable rLottieDrawable = themePreviewActivity.sunDrawable;
                rLottieDrawable.playInDirectionOfCustomEndFrame = true;
                if (zIsDark) {
                    rLottieDrawable.setCustomEndFrame(0);
                } else {
                    rLottieDrawable.setCustomEndFrame(36);
                }
                themePreviewActivity.sunDrawable.start();
                if (themePreviewActivity.shouldShowBrightnessControll) {
                    DayNightSwitchDelegate dayNightSwitchDelegate2 = themePreviewActivity.onSwitchDayNightDelegate;
                    if (dayNightSwitchDelegate2 == null || !dayNightSwitchDelegate2.isDark()) {
                        AnonymousClass15 anonymousClass15 = themePreviewActivity.dimmingSlider;
                        anonymousClass15.valueIsAnimated = true;
                        float f = anonymousClass15.minVolume;
                        anonymousClass15.value = (0.0f - f) / (anonymousClass15.maxVolume - f);
                        anonymousClass15.updateText(0.0f);
                    } else {
                        themePreviewActivity.dimmingSlider.setVisibility(0);
                        AnonymousClass15 anonymousClass16 = themePreviewActivity.dimmingSlider;
                        float f2 = themePreviewActivity.dimAmount;
                        anonymousClass16.valueIsAnimated = true;
                        float f3 = anonymousClass16.minVolume;
                        anonymousClass16.value = (f2 - f3) / (anonymousClass16.maxVolume - f3);
                        anonymousClass16.updateText(f2);
                    }
                    ValueAnimator valueAnimator = themePreviewActivity.changeDayNightViewAnimator2;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        themePreviewActivity.changeDayNightViewAnimator2.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(themePreviewActivity.progressToDarkTheme, themePreviewActivity.onSwitchDayNightDelegate.isDark() ? 1.0f : 0.0f);
                    themePreviewActivity.changeDayNightViewAnimator2 = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda4(this, 18));
                    themePreviewActivity.changeDayNightViewAnimator2.addListener(new WebviewActivity.AnonymousClass3.AnonymousClass1(this, i2));
                    themePreviewActivity.changeDayNightViewAnimator2.setDuration(250L);
                    themePreviewActivity.changeDayNightViewAnimator2.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    themePreviewActivity.changeDayNightViewAnimator2.start();
                }
            }
        }
    }

    public final class AnonymousClass9 extends ActionBarMenuItem {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass9(ChatAttachAlert.AttachAlertLayout attachAlertLayout, Context context, ActionBarMenu actionBarMenu, Theme.ResourcesProvider resourcesProvider, int i) {
            super(context, actionBarMenu, 0, 0, false, resourcesProvider);
            this.$r8$classId = i;
            this.this$0 = attachAlertLayout;
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            switch (this.$r8$classId) {
                case 0:
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    accessibilityNodeInfo.setText(((ThemePreviewActivity) this.this$0).dropDown.getText());
                    break;
                case 1:
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.this$0).dropDown.getText());
                    break;
                default:
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayoutPreview) this.this$0).header.getText());
                    break;
            }
        }

        public AnonymousClass9(ThemePreviewActivity themePreviewActivity, Context context, ActionBarMenu actionBarMenu) {
            super(context, actionBarMenu, 0, 0, false, null);
            this.$r8$classId = 0;
            this.this$0 = themePreviewActivity;
        }
    }

    public final class BackgroundView extends BackupImageView {
        public Drawable background;
        public final boolean drawBackground;
        public float tx;
        public float ty;

        public BackgroundView(Activity activity) {
            super(activity);
            this.drawBackground = true;
        }

        @Override
        public Drawable getBackground() {
            return this.background;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            this.tx = 0.0f;
            this.ty = 0.0f;
            ThemePreviewActivity themePreviewActivity = ThemePreviewActivity.this;
            if (this.drawBackground) {
                Drawable drawable = this.background;
                if ((drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable) || (drawable instanceof MotionBackgroundDrawable)) {
                    drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    this.background.draw(canvas);
                } else if (drawable instanceof BitmapDrawable) {
                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                        canvas.save();
                        float f = 2.0f / AndroidUtilities.density;
                        canvas.scale(f, f);
                        this.background.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f), (int) Math.ceil(getMeasuredHeight() / f));
                        this.background.draw(canvas);
                        canvas.restore();
                    } else {
                        int measuredHeight = getMeasuredHeight();
                        float fMax = Math.max(getMeasuredWidth() / this.background.getIntrinsicWidth(), measuredHeight / this.background.getIntrinsicHeight());
                        int iCeil = (int) Math.ceil(this.background.getIntrinsicWidth() * fMax * themePreviewActivity.parallaxScale);
                        int iCeil2 = (int) Math.ceil(this.background.getIntrinsicHeight() * fMax * themePreviewActivity.parallaxScale);
                        int measuredWidth = (getMeasuredWidth() - iCeil) / 2;
                        int i = (measuredHeight - iCeil2) / 2;
                        this.ty = i;
                        this.background.setBounds(measuredWidth, i, iCeil + measuredWidth, iCeil2 + i);
                        this.background.draw(canvas);
                    }
                }
            }
            if (themePreviewActivity.hasScrollingBackground) {
                if (!themePreviewActivity.scroller.isFinished() && themePreviewActivity.scroller.computeScrollOffset()) {
                    if (themePreviewActivity.scroller.getStartX() < themePreviewActivity.maxScrollOffset && themePreviewActivity.scroller.getStartX() > 0) {
                        themePreviewActivity.currentScrollOffset = themePreviewActivity.scroller.getCurrX();
                    }
                    themePreviewActivity.invalidateBlur$2();
                    invalidate();
                }
                canvas.save();
                float f2 = -themePreviewActivity.currentScrollOffset;
                this.tx = f2;
                canvas.translate(f2, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            } else {
                super.onDraw(canvas);
            }
            if (themePreviewActivity.shouldShowBrightnessControll) {
                float f3 = themePreviewActivity.dimAmount;
                if (f3 > 0.0f) {
                    canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, (int) (f3 * 255.0f * themePreviewActivity.progressToDarkTheme)));
                }
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            ThemePreviewActivity themePreviewActivity = ThemePreviewActivity.this;
            WallpaperParallaxEffect wallpaperParallaxEffect = themePreviewActivity.parallaxEffect;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            wallpaperParallaxEffect.getClass();
            float f = measuredWidth;
            float fDp = AndroidUtilities.dp(16.0f) * 2;
            float f2 = (f + fDp) / f;
            float f3 = measuredHeight;
            float fMax = Math.max(f2, (fDp + f3) / f3);
            themePreviewActivity.parallaxScale = fMax;
            if (themePreviewActivity.isMotion) {
                setScaleX(fMax);
                setScaleY(themePreviewActivity.parallaxScale);
            }
            if (themePreviewActivity.screenType == 2) {
                getMeasuredWidth();
                getMeasuredHeight();
            }
            int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
            if (themePreviewActivity.lastSizeHash != measuredWidth2) {
                themePreviewActivity.hasScrollingBackground = false;
                Bitmap bitmap = themePreviewActivity.currentWallpaperBitmap;
                if (bitmap != null) {
                    int measuredHeight2 = (int) ((getMeasuredHeight() / themePreviewActivity.currentWallpaperBitmap.getHeight()) * bitmap.getWidth());
                    if (measuredHeight2 - getMeasuredWidth() > 100) {
                        themePreviewActivity.hasScrollingBackground = true;
                        themePreviewActivity.croppedWidth = (int) ((themePreviewActivity.currentWallpaperBitmap.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                        float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                        themePreviewActivity.currentScrollOffset = measuredWidth3;
                        themePreviewActivity.defaultScrollOffset = measuredWidth3;
                        themePreviewActivity.maxScrollOffset = measuredWidth3 * 2.0f;
                        int measuredHeight3 = getMeasuredHeight();
                        this.width = measuredHeight2;
                        this.height = measuredHeight3;
                        invalidate();
                        this.drawFromStart = true;
                        themePreviewActivity.invalidateBlur$2();
                    }
                }
                if (!themePreviewActivity.hasScrollingBackground) {
                    this.width = -1;
                    this.height = -1;
                    invalidate();
                    this.drawFromStart = false;
                }
            }
            themePreviewActivity.lastSizeHash = measuredWidth2;
        }

        @Override
        public void setBackground(Drawable drawable) {
            this.background = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            return this.background == drawable || super.verifyDrawable(drawable);
        }
    }

    public final class BlurButton extends View {
        public final ColorMatrixColorFilter colorFilter;
        public final Paint dimPaint;
        public final Paint dimPaint2;
        public final BaseCell.RippleDrawableSafe rippleDrawable;
        public Text subtext;
        public boolean subtextShown;
        public final AnimatedFloat subtextShownT;
        public Text text;
        public final ThemePreviewActivity this$0;

        public BlurButton(Context context, ThemePreviewActivity themePreviewActivity) {
            super(context);
            this.this$0 = themePreviewActivity;
            this.subtextShownT = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
            BaseCell.RippleDrawableSafe rippleDrawableSafeCreateRadSelectorDrawable = Theme.createRadSelectorDrawable(285212671, 8, 8);
            this.rippleDrawable = rippleDrawableSafeCreateRadSelectorDrawable;
            this.dimPaint = new Paint(1);
            this.dimPaint2 = new Paint(1);
            rippleDrawableSafeCreateRadSelectorDrawable.setCallback(this);
            ColorMatrix colorMatrix = new ColorMatrix();
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
            this.colorFilter = new ColorMatrixColorFilter(colorMatrix);
        }

        public final CharSequence getText() {
            Text text = this.text;
            if (text != null) {
                return text.getText();
            }
            return null;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float height = getHeight() / 2.0f;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            ThemePreviewActivity themePreviewActivity = this.this$0;
            BackgroundView backgroundView = themePreviewActivity.backgroundImage;
            AnonymousClass1 anonymousClass1 = themePreviewActivity.themeDelegate;
            Theme.applyServiceShaderMatrixForView(this, backgroundView, anonymousClass1);
            Paint paint = anonymousClass1.getPaint("paintChatActionBackground");
            ColorFilter colorFilter = paint.getColorFilter();
            paint.setColorFilter(this.colorFilter);
            canvas.drawRoundRect(rectF, height, height, paint);
            paint.setColorFilter(colorFilter);
            if (themePreviewActivity.shouldShowBrightnessControll) {
                float f = themePreviewActivity.dimAmount;
                if (f > 0.0f) {
                    Paint paint2 = this.dimPaint2;
                    paint2.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (f * 255.0f * themePreviewActivity.progressToDarkTheme)));
                    canvas.drawRoundRect(rectF, height, height, paint2);
                }
            }
            Paint paint3 = this.dimPaint;
            paint3.setColor(520093695);
            canvas.drawRoundRect(rectF, height, height, paint3);
            float f2 = this.subtextShownT.set(this.subtextShown);
            Text text = this.text;
            if (text != null) {
                text.ellipsizeWidth = getWidth() - AndroidUtilities.dp(14.0f);
                text.draw((getWidth() - this.text.getWidth()) / 2.0f, ((AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (AndroidUtilities.dp(7.0f) * f2), 1.0f, -1, canvas);
            }
            if (this.subtext != null) {
                canvas.save();
                canvas.scale(f2, f2, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
                Text text2 = this.subtext;
                text2.ellipsizeWidth = getWidth() - AndroidUtilities.dp(14.0f);
                text2.draw((getWidth() - this.subtext.getWidth()) / 2.0f, AndroidUtilities.dp(11.0f) + (AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f), 1.0f, Theme.multAlpha(0.75f, -1), canvas);
                canvas.restore();
            }
            int width = getWidth();
            int height2 = getHeight();
            BaseCell.RippleDrawableSafe rippleDrawableSafe = this.rippleDrawable;
            rippleDrawableSafe.setBounds(0, 0, width, height2);
            rippleDrawableSafe.draw(canvas);
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            int action = motionEvent.getAction();
            BaseCell.RippleDrawableSafe rippleDrawableSafe = this.rippleDrawable;
            if (action == 0) {
                rippleDrawableSafe.setHotspot(motionEvent.getX(), motionEvent.getY());
                rippleDrawableSafe.setState(new int[]{16842910, 16842919});
                z = true;
            } else {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    rippleDrawableSafe.setState(StateSet.NOTHING);
                }
                z = false;
            }
            return super.onTouchEvent(motionEvent) || z;
        }

        public final void setText(CharSequence charSequence) {
            this.text = new Text(charSequence, 14.0f, AndroidUtilities.bold());
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            return drawable == this.rippleDrawable || super.verifyDrawable(drawable);
        }
    }

    public interface DayNightSwitchDelegate {
        boolean isDark();

        boolean supportsAnimation();

        void switchDayNight(boolean z);
    }

    public final class DialogsAdapter extends RecyclerListView.SelectionAdapter {
        public final ArrayList dialogs;
        public final Context mContext;

        public DialogsAdapter(Context context) {
            this.mContext = context;
            ArrayList arrayList = new ArrayList();
            this.dialogs = arrayList;
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            DialogCell.CustomDialog customDialog = new DialogCell.CustomDialog();
            customDialog.name = LocaleController.getString(R.string.ThemePreviewDialog1);
            customDialog.message = LocaleController.getString(R.string.ThemePreviewDialogMessage1);
            customDialog.id = 0;
            customDialog.unread_count = 0;
            customDialog.pinned = true;
            customDialog.muted = false;
            customDialog.type = 0;
            customDialog.date = iCurrentTimeMillis;
            customDialog.verified = false;
            customDialog.isMedia = false;
            customDialog.sent = 2;
            arrayList.add(customDialog);
            DialogCell.CustomDialog customDialog2 = new DialogCell.CustomDialog();
            customDialog2.name = LocaleController.getString(R.string.ThemePreviewDialog2);
            customDialog2.message = LocaleController.getString(R.string.ThemePreviewDialogMessage2);
            customDialog2.id = 1;
            customDialog2.unread_count = 2;
            customDialog2.pinned = false;
            customDialog2.muted = false;
            customDialog2.type = 0;
            customDialog2.date = iCurrentTimeMillis - 3600;
            customDialog2.verified = false;
            customDialog2.isMedia = false;
            customDialog2.sent = -1;
            arrayList.add(customDialog2);
            DialogCell.CustomDialog customDialog3 = new DialogCell.CustomDialog();
            customDialog3.name = LocaleController.getString(R.string.ThemePreviewDialog3);
            customDialog3.message = LocaleController.getString(R.string.ThemePreviewDialogMessage3);
            customDialog3.id = 2;
            customDialog3.unread_count = 3;
            customDialog3.pinned = false;
            customDialog3.muted = true;
            customDialog3.type = 0;
            customDialog3.date = iCurrentTimeMillis - 7200;
            customDialog3.verified = false;
            customDialog3.isMedia = true;
            customDialog3.sent = -1;
            arrayList.add(customDialog3);
            DialogCell.CustomDialog customDialog4 = new DialogCell.CustomDialog();
            customDialog4.name = LocaleController.getString(R.string.ThemePreviewDialog4);
            customDialog4.message = LocaleController.getString(R.string.ThemePreviewDialogMessage4);
            customDialog4.id = 3;
            customDialog4.unread_count = 0;
            customDialog4.pinned = false;
            customDialog4.muted = false;
            customDialog4.type = 2;
            customDialog4.date = iCurrentTimeMillis - 10800;
            customDialog4.verified = false;
            customDialog4.isMedia = false;
            customDialog4.sent = -1;
            arrayList.add(customDialog4);
            DialogCell.CustomDialog customDialog5 = new DialogCell.CustomDialog();
            customDialog5.name = LocaleController.getString(R.string.ThemePreviewDialog5);
            customDialog5.message = LocaleController.getString(R.string.ThemePreviewDialogMessage5);
            customDialog5.id = 4;
            customDialog5.unread_count = 0;
            customDialog5.pinned = false;
            customDialog5.muted = false;
            customDialog5.type = 1;
            customDialog5.date = iCurrentTimeMillis - 14400;
            customDialog5.verified = false;
            customDialog5.isMedia = false;
            customDialog5.sent = 2;
            arrayList.add(customDialog5);
            DialogCell.CustomDialog customDialog6 = new DialogCell.CustomDialog();
            customDialog6.name = LocaleController.getString(R.string.ThemePreviewDialog6);
            customDialog6.message = LocaleController.getString(R.string.ThemePreviewDialogMessage6);
            customDialog6.id = 5;
            customDialog6.unread_count = 0;
            customDialog6.pinned = false;
            customDialog6.muted = false;
            customDialog6.type = 0;
            customDialog6.date = iCurrentTimeMillis - 18000;
            customDialog6.verified = false;
            customDialog6.isMedia = false;
            customDialog6.sent = -1;
            arrayList.add(customDialog6);
            DialogCell.CustomDialog customDialog7 = new DialogCell.CustomDialog();
            customDialog7.name = LocaleController.getString(R.string.ThemePreviewDialog7);
            customDialog7.message = LocaleController.getString(R.string.ThemePreviewDialogMessage7);
            customDialog7.id = 6;
            customDialog7.unread_count = 0;
            customDialog7.pinned = false;
            customDialog7.muted = false;
            customDialog7.type = 0;
            customDialog7.date = iCurrentTimeMillis - 21600;
            customDialog7.verified = true;
            customDialog7.isMedia = false;
            customDialog7.sent = -1;
            arrayList.add(customDialog7);
            DialogCell.CustomDialog customDialog8 = new DialogCell.CustomDialog();
            customDialog8.name = LocaleController.getString(R.string.ThemePreviewDialog8);
            customDialog8.message = LocaleController.getString(R.string.ThemePreviewDialogMessage8);
            customDialog8.id = 0;
            customDialog8.unread_count = 0;
            customDialog8.pinned = false;
            customDialog8.muted = false;
            customDialog8.type = 0;
            customDialog8.date = iCurrentTimeMillis - 25200;
            customDialog8.verified = true;
            customDialog8.isMedia = false;
            customDialog8.sent = -1;
            arrayList.add(customDialog8);
        }

        @Override
        public final int getItemCount() {
            return this.dialogs.size();
        }

        @Override
        public final int getItemViewType(int i) {
            return i == this.dialogs.size() ? 1 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType != 1;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.mItemViewType == 0) {
                DialogCell dialogCell = (DialogCell) viewHolder.itemView;
                ArrayList arrayList = this.dialogs;
                dialogCell.useSeparator = i != arrayList.size() - 1;
                dialogCell.setDialog((DialogCell.CustomDialog) arrayList.get(i));
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View loadingCell;
            if (i == 0) {
                loadingCell = new DialogCell(null, this.mContext, false, UserConfig.selectedAccount, null);
            } else {
                loadingCell = new LoadingCell(this.mContext);
            }
            loadingCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(loadingCell);
        }
    }

    public final class MessagesAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;
        public final ArrayList messages;
        public final boolean showSecretMessages;
        public final ThemePreviewActivity this$0;

        public final class AnonymousClass1 extends MessageObject {
            @Override
            public final boolean needDrawAvatar() {
                return false;
            }
        }

        public final class AnonymousClass2 extends MessageObject {
            @Override
            public final boolean needDrawAvatar() {
                return false;
            }
        }

        public final class AnonymousClass3 extends MessageObject {
            @Override
            public final boolean needDrawAvatar() {
                return false;
            }
        }

        public MessagesAdapter(Context context, ThemePreviewActivity themePreviewActivity) {
            AnonymousClass2 anonymousClass2;
            this.this$0 = themePreviewActivity;
            int i = themePreviewActivity.screenType;
            boolean z = i == 0 && Utilities.random.nextInt(100) <= 1;
            this.showSecretMessages = z;
            this.mContext = context;
            ArrayList arrayList = new ArrayList();
            this.messages = arrayList;
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i2 = iCurrentTimeMillis - 3600;
            if (i == 2) {
                if (themePreviewActivity.dialogId >= 0) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    if (themePreviewActivity.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) {
                        tL_message.message = LocaleController.getString(R.string.BackgroundColorSinglePreviewLine2);
                    } else {
                        tL_message.message = LocaleController.getString(R.string.BackgroundPreviewLine2);
                    }
                    tL_message.date = iCurrentTimeMillis - 3540;
                    tL_message.dialog_id = 1L;
                    tL_message.flags = 259;
                    tL_message.id = 1;
                    tL_message.media = new TLRPC.TL_messageMediaEmpty();
                    tL_message.out = true;
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.from_id = tL_peerUser;
                    tL_peerUser.user_id = UserConfig.getInstance(((BaseFragment) themePreviewActivity).currentAccount).getClientUserId();
                    TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                    tL_message.peer_id = tL_peerUser2;
                    tL_peerUser2.user_id = UserConfig.getInstance(((BaseFragment) themePreviewActivity).currentAccount).getClientUserId();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(((BaseFragment) themePreviewActivity).currentAccount, tL_message, true, false);
                    anonymousClass1.eventId = 1L;
                    anonymousClass1.resetLayout();
                    arrayList.add(anonymousClass1);
                }
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                TLRPC.Chat chat = themePreviewActivity.dialogId < 0 ? themePreviewActivity.getMessagesController().getChat(Long.valueOf(-themePreviewActivity.dialogId)) : null;
                if (chat != null) {
                    tL_message2.message = LocaleController.getString(R.string.ChannelBackgroundMessagePreview);
                    TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                    tL_message3.message = LocaleController.getString(R.string.ChannelBackgroundMessageReplyText);
                    AnonymousClass2 anonymousClass3 = new AnonymousClass2(((BaseFragment) themePreviewActivity).currentAccount, tL_message3, true, false);
                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                    tL_message2.from_id = tL_peerChannel;
                    tL_peerChannel.channel_id = chat.id;
                    TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                    tL_message2.peer_id = tL_peerChannel2;
                    tL_peerChannel2.channel_id = chat.id;
                    anonymousClass2 = anonymousClass3;
                } else {
                    if (themePreviewActivity.dialogId != 0) {
                        tL_message2.message = LocaleController.getString(R.string.BackgroundColorSinglePreviewLine3);
                    } else if (themePreviewActivity.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) {
                        tL_message2.message = LocaleController.getString(R.string.BackgroundColorSinglePreviewLine1);
                    } else {
                        tL_message2.message = LocaleController.getString(R.string.BackgroundPreviewLine1);
                    }
                    tL_message2.from_id = new TLRPC.TL_peerUser();
                    TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                    tL_message2.peer_id = tL_peerUser3;
                    tL_peerUser3.user_id = UserConfig.getInstance(((BaseFragment) themePreviewActivity).currentAccount).getClientUserId();
                    anonymousClass2 = null;
                }
                int i3 = iCurrentTimeMillis - 3540;
                tL_message2.date = i3;
                tL_message2.dialog_id = 1L;
                tL_message2.flags = 265;
                tL_message2.id = 1;
                tL_message2.media = new TLRPC.TL_messageMediaEmpty();
                tL_message2.out = false;
                AnonymousClass3 anonymousClass4 = new AnonymousClass3(((BaseFragment) themePreviewActivity).currentAccount, tL_message2, anonymousClass2, true, false);
                if (anonymousClass2 != null) {
                    anonymousClass4.customReplyName = LocaleController.getString(R.string.ChannelBackgroundMessageReplyName);
                }
                anonymousClass4.eventId = 1L;
                anonymousClass4.resetLayout();
                arrayList.add(anonymousClass4);
                if (themePreviewActivity.dialogId == 0 || themePreviewActivity.serverWallpaper != null) {
                    return;
                }
                TLRPC.User user = themePreviewActivity.getMessagesController().getUser(Long.valueOf(themePreviewActivity.dialogId));
                TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                tL_message4.message = "";
                MessageObject messageObject = new MessageObject(((BaseFragment) themePreviewActivity).currentAccount, tL_message4, true, false);
                messageObject.eventId = 1L;
                messageObject.contentType = 5;
                arrayList.add(messageObject);
                TLRPC.TL_message tL_message5 = new TLRPC.TL_message();
                if (user != null) {
                    tL_message5.message = LocaleController.formatString(R.string.ChatBackgroundHint, UserObject.getFirstName(user));
                } else {
                    tL_message5.message = LocaleController.getString(R.string.ChannelBackgroundHint);
                }
                tL_message5.date = i3;
                tL_message5.dialog_id = 1L;
                tL_message5.flags = 265;
                tL_message5.from_id = new TLRPC.TL_peerUser();
                tL_message5.id = 1;
                tL_message5.media = new TLRPC.TL_messageMediaEmpty();
                tL_message5.out = false;
                TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
                tL_message5.peer_id = tL_peerUser4;
                tL_peerUser4.user_id = UserConfig.getInstance(((BaseFragment) themePreviewActivity).currentAccount).getClientUserId();
                MessageObject messageObject2 = new MessageObject(((BaseFragment) themePreviewActivity).currentAccount, tL_message5, true, false);
                messageObject2.eventId = 1L;
                messageObject2.resetLayout();
                messageObject2.contentType = 1;
                arrayList.add(messageObject2);
                return;
            }
            if (i == 1) {
                TLRPC.TL_message tL_message6 = new TLRPC.TL_message();
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message6.media = tL_messageMediaDocument;
                tL_messageMediaDocument.document = new TLRPC.TL_document();
                TLRPC.Document document = tL_message6.media.document;
                document.mime_type = "audio/mp3";
                document.file_reference = new byte[0];
                document.id = -2147483648L;
                document.size = 2621440L;
                document.dc_id = Integer.MIN_VALUE;
                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                tL_documentAttributeFilename.file_name = LocaleController.getString(R.string.NewThemePreviewReply2) + ".mp3";
                tL_message6.media.document.attributes.add(tL_documentAttributeFilename);
                int i4 = iCurrentTimeMillis + (-3540);
                tL_message6.date = i4;
                tL_message6.dialog_id = 1L;
                tL_message6.flags = 259;
                TLRPC.TL_peerUser tL_peerUser5 = new TLRPC.TL_peerUser();
                tL_message6.from_id = tL_peerUser5;
                tL_peerUser5.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                tL_message6.id = 1;
                tL_message6.out = true;
                TLRPC.TL_peerUser tL_peerUser6 = new TLRPC.TL_peerUser();
                tL_message6.peer_id = tL_peerUser6;
                tL_peerUser6.user_id = 0L;
                MessageObject messageObject3 = new MessageObject(UserConfig.selectedAccount, tL_message6, true, false);
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    TLRPC.TL_message tL_message7 = new TLRPC.TL_message();
                    tL_message7.message = "this is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text";
                    tL_message7.date = iCurrentTimeMillis - 2640;
                    tL_message7.dialog_id = 1L;
                    tL_message7.flags = 259;
                    TLRPC.TL_peerUser tL_peerUser7 = new TLRPC.TL_peerUser();
                    tL_message7.from_id = tL_peerUser7;
                    tL_peerUser7.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                    tL_message7.id = 1;
                    tL_message7.media = new TLRPC.TL_messageMediaEmpty();
                    tL_message7.out = true;
                    TLRPC.TL_peerUser tL_peerUser8 = new TLRPC.TL_peerUser();
                    tL_message7.peer_id = tL_peerUser8;
                    tL_peerUser8.user_id = 0L;
                    MessageObject messageObject4 = new MessageObject(UserConfig.selectedAccount, tL_message7, true, false);
                    messageObject4.resetLayout();
                    messageObject4.eventId = 1L;
                    arrayList.add(messageObject4);
                }
                TLRPC.TL_message tL_message8 = new TLRPC.TL_message();
                String string = LocaleController.getString(R.string.NewThemePreviewLine3);
                StringBuilder sb = new StringBuilder(string);
                int iIndexOf = string.indexOf(42);
                int iLastIndexOf = string.lastIndexOf(42);
                if (iIndexOf != -1 && iLastIndexOf != -1) {
                    sb.replace(iLastIndexOf, iLastIndexOf + 1, "");
                    sb.replace(iIndexOf, iIndexOf + 1, "");
                    TLRPC.TL_messageEntityTextUrl tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                    tL_messageEntityTextUrl.offset = iIndexOf;
                    tL_messageEntityTextUrl.length = (iLastIndexOf - iIndexOf) - 1;
                    tL_messageEntityTextUrl.url = "https://telegram.org";
                    tL_message8.entities.add(tL_messageEntityTextUrl);
                }
                tL_message8.message = sb.toString();
                tL_message8.date = iCurrentTimeMillis - 2640;
                tL_message8.dialog_id = 1L;
                tL_message8.flags = 259;
                TLRPC.TL_peerUser tL_peerUser9 = new TLRPC.TL_peerUser();
                tL_message8.from_id = tL_peerUser9;
                tL_peerUser9.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                tL_message8.id = 1;
                tL_message8.media = new TLRPC.TL_messageMediaEmpty();
                tL_message8.out = true;
                TLRPC.TL_peerUser tL_peerUser10 = new TLRPC.TL_peerUser();
                tL_message8.peer_id = tL_peerUser10;
                tL_peerUser10.user_id = 0L;
                MessageObject messageObject5 = new MessageObject(UserConfig.selectedAccount, tL_message8, true, false);
                messageObject5.resetLayout();
                messageObject5.eventId = 1L;
                arrayList.add(messageObject5);
                TLRPC.TL_message tL_message9 = new TLRPC.TL_message();
                tL_message9.message = LocaleController.getString(R.string.NewThemePreviewLine1);
                tL_message9.date = i4;
                tL_message9.dialog_id = 1L;
                tL_message9.flags = 265;
                tL_message9.from_id = new TLRPC.TL_peerUser();
                tL_message9.id = 1;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message9.reply_to = tL_messageReplyHeader;
                tL_messageReplyHeader.flags |= 16;
                tL_messageReplyHeader.reply_to_msg_id = 5;
                tL_message9.media = new TLRPC.TL_messageMediaEmpty();
                tL_message9.out = false;
                TLRPC.TL_peerUser tL_peerUser11 = new TLRPC.TL_peerUser();
                tL_message9.peer_id = tL_peerUser11;
                tL_peerUser11.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                MessageObject messageObject6 = new MessageObject(UserConfig.selectedAccount, tL_message9, true, false);
                messageObject6.customReplyName = LocaleController.getString(R.string.NewThemePreviewName);
                messageObject5.customReplyName = "Test User";
                messageObject6.eventId = 1L;
                messageObject6.resetLayout();
                messageObject6.replyMessageObject = messageObject3;
                messageObject5.replyMessageObject = messageObject6;
                arrayList.add(messageObject6);
                arrayList.add(messageObject3);
                TLRPC.TL_message tL_message10 = new TLRPC.TL_message();
                tL_message10.date = iCurrentTimeMillis - 3480;
                tL_message10.dialog_id = 1L;
                tL_message10.flags = 259;
                tL_message10.out = false;
                tL_message10.from_id = new TLRPC.TL_peerUser();
                tL_message10.id = 1;
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument2 = new TLRPC.TL_messageMediaDocument();
                tL_message10.media = tL_messageMediaDocument2;
                tL_messageMediaDocument2.flags |= 3;
                tL_messageMediaDocument2.document = new TLRPC.TL_document();
                TLRPC.Document document2 = tL_message10.media.document;
                document2.mime_type = "audio/ogg";
                document2.file_reference = new byte[0];
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.flags = 1028;
                tL_documentAttributeAudio.duration = 3.0d;
                tL_documentAttributeAudio.voice = true;
                tL_documentAttributeAudio.waveform = new byte[]{0, 4, 17, -50, -93, 86, -103, -45, -12, -26, 63, -25, -3, 109, -114, -54, -4, -1, -1, -1, -1, -29, -1, -1, -25, -1, -1, -97, -43, 57, -57, -108, 1, -91, -4, -47, 21, 99, 10, 97, 43, 45, 115, -112, -77, 51, -63, 66, 40, 34, -122, -116, 48, -124, 16, 66, -120, 16, 68, 16, 33, 4, 1};
                tL_message10.media.document.attributes.add(tL_documentAttributeAudio);
                tL_message10.out = true;
                TLRPC.TL_peerUser tL_peerUser12 = new TLRPC.TL_peerUser();
                tL_message10.peer_id = tL_peerUser12;
                tL_peerUser12.user_id = 0L;
                MessageObject messageObject7 = new MessageObject(((BaseFragment) themePreviewActivity).currentAccount, tL_message10, true, false);
                messageObject7.audioProgressSec = 1;
                messageObject7.audioProgress = 0.3f;
                messageObject7.useCustomPhoto = true;
                arrayList.add(messageObject7);
                return;
            }
            if (z) {
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                tL_user.id = 2147483647L;
                tL_user.first_name = "Me";
                TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
                tL_user2.id = 2147483646L;
                tL_user2.first_name = "Serj";
                ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                arrayList2.add(tL_user);
                arrayList2.add(tL_user2);
                MessagesController.getInstance(((BaseFragment) themePreviewActivity).currentAccount).putUsers(arrayList2, true);
                TLRPC.TL_message tL_message11 = new TLRPC.TL_message();
                tL_message11.message = "Guess why Half-Life 3 was never released.";
                int i5 = iCurrentTimeMillis - 2640;
                tL_message11.date = i5;
                tL_message11.dialog_id = -1L;
                tL_message11.flags = 259;
                tL_message11.id = 2147483646;
                tL_message11.media = new TLRPC.TL_messageMediaEmpty();
                tL_message11.out = false;
                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                tL_message11.peer_id = tL_peerChat;
                tL_peerChat.chat_id = 1L;
                TLRPC.TL_peerUser tL_peerUser13 = new TLRPC.TL_peerUser();
                tL_message11.from_id = tL_peerUser13;
                tL_peerUser13.user_id = tL_user2.id;
                arrayList.add(new MessageObject(((BaseFragment) themePreviewActivity).currentAccount, tL_message11, true, false));
                TLRPC.TL_message tL_message12 = new TLRPC.TL_message();
                tL_message12.message = "No.\nAnd every unnecessary ping of the dev delays the release for 10 days.\nEvery request for ETA delays the release for 2 weeks.";
                tL_message12.date = i5;
                tL_message12.dialog_id = -1L;
                tL_message12.flags = 259;
                tL_message12.id = 1;
                tL_message12.media = new TLRPC.TL_messageMediaEmpty();
                tL_message12.out = false;
                TLRPC.TL_peerChat tL_peerChat2 = new TLRPC.TL_peerChat();
                tL_message12.peer_id = tL_peerChat2;
                tL_peerChat2.chat_id = 1L;
                TLRPC.TL_peerUser tL_peerUser14 = new TLRPC.TL_peerUser();
                tL_message12.from_id = tL_peerUser14;
                tL_peerUser14.user_id = tL_user2.id;
                arrayList.add(new MessageObject(((BaseFragment) themePreviewActivity).currentAccount, tL_message12, true, false));
                TLRPC.TL_message tL_message13 = new TLRPC.TL_message();
                tL_message13.message = "Is source code for Android coming anytime soon?";
                tL_message13.date = iCurrentTimeMillis - 3000;
                tL_message13.dialog_id = -1L;
                tL_message13.flags = 259;
                tL_message13.id = 1;
                tL_message13.media = new TLRPC.TL_messageMediaEmpty();
                tL_message13.out = false;
                TLRPC.TL_peerChat tL_peerChat3 = new TLRPC.TL_peerChat();
                tL_message13.peer_id = tL_peerChat3;
                tL_peerChat3.chat_id = 1L;
                TLRPC.TL_peerUser tL_peerUser15 = new TLRPC.TL_peerUser();
                tL_message13.from_id = tL_peerUser15;
                tL_peerUser15.user_id = tL_user.id;
                arrayList.add(new MessageObject(((BaseFragment) themePreviewActivity).currentAccount, tL_message13, true, false));
                return;
            }
            TLRPC.TL_message tL_message14 = new TLRPC.TL_message();
            tL_message14.message = LocaleController.getString(R.string.ThemePreviewLine1);
            int i6 = iCurrentTimeMillis - 3540;
            tL_message14.date = i6;
            tL_message14.dialog_id = 1L;
            tL_message14.flags = 259;
            TLRPC.TL_peerUser tL_peerUser16 = new TLRPC.TL_peerUser();
            tL_message14.from_id = tL_peerUser16;
            tL_peerUser16.user_id = UserConfig.getInstance(((BaseFragment) themePreviewActivity).currentAccount).getClientUserId();
            tL_message14.id = 1;
            tL_message14.media = new TLRPC.TL_messageMediaEmpty();
            tL_message14.out = true;
            TLRPC.TL_peerUser tL_peerUser17 = new TLRPC.TL_peerUser();
            tL_message14.peer_id = tL_peerUser17;
            tL_peerUser17.user_id = 0L;
            MessageObject messageObject8 = new MessageObject(((BaseFragment) themePreviewActivity).currentAccount, tL_message14, true, false);
            TLRPC.TL_message tL_message15 = new TLRPC.TL_message();
            tL_message15.message = LocaleController.getString(R.string.ThemePreviewLine2);
            tL_message15.date = iCurrentTimeMillis - 2640;
            tL_message15.dialog_id = 1L;
            tL_message15.flags = 259;
            TLRPC.TL_peerUser tL_peerUser18 = new TLRPC.TL_peerUser();
            tL_message15.from_id = tL_peerUser18;
            tL_peerUser18.user_id = UserConfig.getInstance(((BaseFragment) themePreviewActivity).currentAccount).getClientUserId();
            tL_message15.id = 1;
            tL_message15.media = new TLRPC.TL_messageMediaEmpty();
            tL_message15.out = true;
            TLRPC.TL_peerUser tL_peerUser19 = new TLRPC.TL_peerUser();
            tL_message15.peer_id = tL_peerUser19;
            tL_peerUser19.user_id = 0L;
            arrayList.add(new MessageObject(((BaseFragment) themePreviewActivity).currentAccount, tL_message15, true, false));
            TLRPC.TL_message tL_message16 = new TLRPC.TL_message();
            tL_message16.date = iCurrentTimeMillis - 3470;
            tL_message16.dialog_id = 1L;
            tL_message16.flags = 259;
            tL_message16.from_id = new TLRPC.TL_peerUser();
            tL_message16.id = 5;
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument3 = new TLRPC.TL_messageMediaDocument();
            tL_message16.media = tL_messageMediaDocument3;
            tL_messageMediaDocument3.flags |= 3;
            tL_messageMediaDocument3.document = new TLRPC.TL_document();
            TLRPC.Document document3 = tL_message16.media.document;
            document3.mime_type = "audio/mp4";
            document3.file_reference = new byte[0];
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio2.duration = 243.0d;
            tL_documentAttributeAudio2.performer = LocaleController.getString(R.string.ThemePreviewSongPerformer);
            tL_documentAttributeAudio2.title = LocaleController.getString(R.string.ThemePreviewSongTitle);
            tL_message16.media.document.attributes.add(tL_documentAttributeAudio2);
            tL_message16.out = false;
            TLRPC.TL_peerUser tL_peerUser20 = new TLRPC.TL_peerUser();
            tL_message16.peer_id = tL_peerUser20;
            tL_peerUser20.user_id = UserConfig.getInstance(((BaseFragment) themePreviewActivity).currentAccount).getClientUserId();
            arrayList.add(new MessageObject(((BaseFragment) themePreviewActivity).currentAccount, tL_message16, true, false));
            TLRPC.TL_message tL_message17 = new TLRPC.TL_message();
            tL_message17.message = LocaleController.getString(R.string.ThemePreviewLine3);
            tL_message17.date = i6;
            tL_message17.dialog_id = 1L;
            tL_message17.flags = 265;
            tL_message17.from_id = new TLRPC.TL_peerUser();
            tL_message17.id = 1;
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader2 = new TLRPC.TL_messageReplyHeader();
            tL_message17.reply_to = tL_messageReplyHeader2;
            tL_messageReplyHeader2.flags |= 16;
            tL_messageReplyHeader2.reply_to_msg_id = 5;
            tL_message17.media = new TLRPC.TL_messageMediaEmpty();
            tL_message17.out = false;
            TLRPC.TL_peerUser tL_peerUser21 = new TLRPC.TL_peerUser();
            tL_message17.peer_id = tL_peerUser21;
            tL_peerUser21.user_id = UserConfig.getInstance(((BaseFragment) themePreviewActivity).currentAccount).getClientUserId();
            MessageObject messageObject9 = new MessageObject(((BaseFragment) themePreviewActivity).currentAccount, tL_message17, true, false);
            messageObject9.customReplyName = LocaleController.getString(R.string.ThemePreviewLine3Reply);
            messageObject9.replyMessageObject = messageObject8;
            arrayList.add(messageObject9);
            TLRPC.TL_message tL_message18 = new TLRPC.TL_message();
            tL_message18.date = iCurrentTimeMillis - 3480;
            tL_message18.dialog_id = 1L;
            tL_message18.flags = 259;
            TLRPC.TL_peerUser tL_peerUser22 = new TLRPC.TL_peerUser();
            tL_message18.from_id = tL_peerUser22;
            tL_peerUser22.user_id = UserConfig.getInstance(((BaseFragment) themePreviewActivity).currentAccount).getClientUserId();
            tL_message18.id = 1;
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument4 = new TLRPC.TL_messageMediaDocument();
            tL_message18.media = tL_messageMediaDocument4;
            tL_messageMediaDocument4.flags |= 3;
            tL_messageMediaDocument4.document = new TLRPC.TL_document();
            TLRPC.Document document4 = tL_message18.media.document;
            document4.mime_type = "audio/ogg";
            document4.file_reference = new byte[0];
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio3 = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio3.flags = 1028;
            tL_documentAttributeAudio3.duration = 3.0d;
            tL_documentAttributeAudio3.voice = true;
            tL_documentAttributeAudio3.waveform = new byte[]{0, 4, 17, -50, -93, 86, -103, -45, -12, -26, 63, -25, -3, 109, -114, -54, -4, -1, -1, -1, -1, -29, -1, -1, -25, -1, -1, -97, -43, 57, -57, -108, 1, -91, -4, -47, 21, 99, 10, 97, 43, 45, 115, -112, -77, 51, -63, 66, 40, 34, -122, -116, 48, -124, 16, 66, -120, 16, 68, 16, 33, 4, 1};
            tL_message18.media.document.attributes.add(tL_documentAttributeAudio3);
            tL_message18.out = true;
            TLRPC.TL_peerUser tL_peerUser23 = new TLRPC.TL_peerUser();
            tL_message18.peer_id = tL_peerUser23;
            tL_peerUser23.user_id = 0L;
            MessageObject messageObject10 = new MessageObject(((BaseFragment) themePreviewActivity).currentAccount, tL_message18, true, false);
            messageObject10.audioProgressSec = 1;
            messageObject10.audioProgress = 0.3f;
            messageObject10.useCustomPhoto = true;
            arrayList.add(messageObject10);
            arrayList.add(messageObject8);
            TLRPC.TL_message tL_message19 = new TLRPC.TL_message();
            tL_message19.date = iCurrentTimeMillis - 3590;
            tL_message19.dialog_id = 1L;
            tL_message19.flags = 257;
            tL_message19.from_id = new TLRPC.TL_peerUser();
            tL_message19.id = 1;
            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
            tL_message19.media = tL_messageMediaPhoto;
            tL_messageMediaPhoto.flags |= 3;
            tL_messageMediaPhoto.photo = new TLRPC.TL_photo();
            TLRPC.Photo photo = tL_message19.media.photo;
            photo.file_reference = new byte[0];
            photo.has_stickers = false;
            photo.id = 1L;
            photo.access_hash = 0L;
            photo.date = i2;
            TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
            tL_photoSize.size = 0;
            tL_photoSize.w = 500;
            tL_photoSize.h = 302;
            tL_photoSize.type = "s";
            tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
            tL_message19.media.photo.sizes.add(tL_photoSize);
            tL_message19.message = LocaleController.getString(R.string.ThemePreviewLine4);
            tL_message19.out = false;
            TLRPC.TL_peerUser tL_peerUser24 = new TLRPC.TL_peerUser();
            tL_message19.peer_id = tL_peerUser24;
            tL_peerUser24.user_id = UserConfig.getInstance(((BaseFragment) themePreviewActivity).currentAccount).getClientUserId();
            MessageObject messageObject11 = new MessageObject(((BaseFragment) themePreviewActivity).currentAccount, tL_message19, true, false);
            messageObject11.useCustomPhoto = true;
            arrayList.add(messageObject11);
        }

        @Override
        public final int getItemCount() {
            int size = this.messages.size();
            return hasButtons() ? size + 1 : size;
        }

        @Override
        public final int getItemViewType(int i) {
            if (hasButtons()) {
                if (i == 0) {
                    return this.this$0.colorType == 3 ? 3 : 2;
                }
                i--;
            }
            if (i < 0) {
                return 4;
            }
            ArrayList arrayList = this.messages;
            if (i < arrayList.size()) {
                return ((MessageObject) arrayList.get(i)).contentType;
            }
            return 4;
        }

        public final boolean hasButtons() {
            ThemePreviewActivity themePreviewActivity = this.this$0;
            FrameLayout frameLayout = themePreviewActivity.messagesButtonsContainer;
            int i = themePreviewActivity.screenType;
            if (frameLayout == null || i != 1 || themePreviewActivity.colorType != 3 || themePreviewActivity.accent.myMessagesGradientAccentColor2 == 0) {
                if (themePreviewActivity.backgroundButtonsContainer == null) {
                    return false;
                }
                if (i != 2 && (i != 1 || themePreviewActivity.colorType != 2)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            boolean z2;
            int i2 = viewHolder.mItemViewType;
            if (i2 == 2 || i2 == 3) {
                return;
            }
            if (hasButtons()) {
                i--;
            }
            ArrayList arrayList = this.messages;
            MessageObject messageObject = (MessageObject) arrayList.get(i);
            View view = viewHolder.itemView;
            boolean z3 = view instanceof ChatMessageCell;
            ThemePreviewActivity themePreviewActivity = this.this$0;
            if (!z3) {
                if (view instanceof ChatActionCell) {
                    ChatActionCell chatActionCell = (ChatActionCell) view;
                    chatActionCell.setMessageObject(messageObject);
                    chatActionCell.setAlpha(1.0f);
                    themePreviewActivity.invalidateBlur$2();
                    return;
                }
                return;
            }
            ChatMessageCell chatMessageCell = (ChatMessageCell) view;
            chatMessageCell.isChat = false;
            int i3 = i - 1;
            int itemViewType = getItemViewType(i3);
            int i4 = i + 1;
            int itemViewType2 = getItemViewType(i4);
            if ((messageObject.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) || itemViewType != viewHolder.mItemViewType) {
                z = false;
            } else {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i3);
                if (messageObject2.isOutOwner() != messageObject.isOutOwner() || Math.abs(messageObject2.messageOwner.date - messageObject.messageOwner.date) > 300) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (itemViewType2 != viewHolder.mItemViewType || i4 >= arrayList.size()) {
                z2 = false;
            } else {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i4);
                if ((messageObject3.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) || messageObject3.isOutOwner() != messageObject.isOutOwner() || Math.abs(messageObject3.messageOwner.date - messageObject.messageOwner.date) > 300) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            chatMessageCell.isChat = this.showSecretMessages || themePreviewActivity.dialogId < 0;
            chatMessageCell.setFullyDraw(true);
            chatMessageCell.setMessageObject(messageObject, null, z, z2, false, false);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            TopicsFragment.AnonymousClass14 anonymousClass14;
            View anonymousClass2;
            ThemePreviewActivity themePreviewActivity = this.this$0;
            if (i == 0) {
                ChatMessageCell chatMessageCell = new ChatMessageCell(this.mContext, ((BaseFragment) themePreviewActivity).currentAccount, false, null, new PhotoViewer.AnonymousClass49(this, 15));
                chatMessageCell.setDelegate(new ChatActivity.AnonymousClass40(26));
                anonymousClass2 = chatMessageCell;
            } else {
                Context context = this.mContext;
                if (i == 1) {
                    ChatActionCell chatActionCell = new ChatActionCell(context, themePreviewActivity.themeDelegate, false);
                    chatActionCell.setDelegate(new Clock(26));
                    anonymousClass2 = chatActionCell;
                } else {
                    if (i == 2) {
                        if (themePreviewActivity.backgroundButtonsContainer.getParent() != null) {
                            ((ViewGroup) themePreviewActivity.backgroundButtonsContainer.getParent()).removeView(themePreviewActivity.backgroundButtonsContainer);
                        }
                        anonymousClass14 = new TopicsFragment.AnonymousClass14(context, 7);
                        anonymousClass14.addView(themePreviewActivity.backgroundButtonsContainer, LayoutHelper.createFrame(-1, 76, 17));
                    } else if (i == 5) {
                        anonymousClass2 = new PaymentFormActivity.AnonymousClass2(themePreviewActivity.getParentActivity(), 28);
                    } else {
                        if (themePreviewActivity.messagesButtonsContainer.getParent() != null) {
                            ((ViewGroup) themePreviewActivity.messagesButtonsContainer.getParent()).removeView(themePreviewActivity.messagesButtonsContainer);
                        }
                        anonymousClass14 = new TopicsFragment.AnonymousClass14(context, 8);
                        anonymousClass14.addView(themePreviewActivity.messagesButtonsContainer, LayoutHelper.createFrame(-1, 76, 17));
                    }
                    anonymousClass2 = anonymousClass14;
                }
            }
            return zzkl.m(anonymousClass2, anonymousClass2);
        }
    }

    public final class PatternsAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;
        public final ThemePreviewActivity this$0;

        public final class AnonymousClass1 {
            public AnonymousClass1() {
            }
        }

        public PatternsAdapter(Context context, ThemePreviewActivity themePreviewActivity) {
            this.this$0 = themePreviewActivity;
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            ArrayList arrayList = this.this$0.patterns;
            if (arrayList != null) {
                return arrayList.size();
            }
            return 0;
        }

        @Override
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            PatternCell patternCell = (PatternCell) viewHolder.itemView;
            ThemePreviewActivity themePreviewActivity = this.this$0;
            patternCell.setPattern((TLRPC.TL_wallPaper) themePreviewActivity.patterns.get(i));
            patternCell.getImageReceiver().setColorFilter(new PorterDuffColorFilter(themePreviewActivity.patternColor, themePreviewActivity.blendMode));
            if (Build.VERSION.SDK_INT >= 29) {
                int i2 = 0;
                if (themePreviewActivity.screenType == 1) {
                    int defaultAccentColor = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to2);
                    long j = themePreviewActivity.accent.backgroundGradientOverrideColor2;
                    int i3 = (int) j;
                    if (i3 != 0 || j == 0) {
                        i2 = i3 != 0 ? i3 : defaultAccentColor;
                    }
                } else if (themePreviewActivity.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) {
                    i2 = themePreviewActivity.backgroundGradientColor2;
                }
                if (i2 == 0 || themePreviewActivity.currentIntensity < 0.0f) {
                    patternCell.getImageReceiver().setBlendMode(null);
                } else {
                    themePreviewActivity.backgroundImage.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(new PatternCell(this.mContext, this.this$0.maxWallpaperSize, new AnonymousClass1()));
        }
    }

    public interface WallpaperActivityDelegate {
        void didSetNewBackground(TLRPC.TL_wallPaper tL_wallPaper);
    }

    public ThemePreviewActivity(Theme.ThemeInfo themeInfo, boolean z, int i, boolean z2, boolean z3) {
        super(null);
        this.themeDelegate = new AnonymousClass1();
        this.useDefaultThemeForButtons = true;
        this.colorType = 1;
        Theme.AnonymousClass12 anonymousClass12 = new Theme.AnonymousClass12(this, 0, false);
        this.msgOutDrawable = anonymousClass12;
        Theme.AnonymousClass12 anonymousClass13 = new Theme.AnonymousClass12(this, 0, true);
        this.msgOutDrawableSelected = anonymousClass13;
        Theme.AnonymousClass12 anonymousClass14 = new Theme.AnonymousClass12(this, 1, false);
        this.msgOutMediaDrawable = anonymousClass14;
        Theme.AnonymousClass12 anonymousClass15 = new Theme.AnonymousClass12(this, 1, true);
        this.msgOutMediaDrawableSelected = anonymousClass15;
        this.lastPickedColorNum = -1;
        this.applyColorAction = new ThemePreviewActivity$$ExternalSyntheticLambda0(this, 0);
        this.backgroundImages = new BackgroundView[2];
        this.patternLayout = new FrameLayout[2];
        this.patternsCancelButton = new TextView[2];
        this.patternsSaveButton = new TextView[2];
        this.patternsButtonsContainer = new FrameLayout[2];
        this.patternsDict = new HashMap();
        this.currentIntensity = 0.5f;
        this.dimAmount = 0.0f;
        this.blendMode = PorterDuff.Mode.SRC_IN;
        this.parallaxScale = 1.0f;
        this.imageFilter = "640_360";
        this.maxWallpaperSize = 1920;
        this.self = true;
        this.gestureDetector2 = new GestureDetector2(getParentActivity(), new PhotoViewer.AnonymousClass24(this, 8));
        this.checkingBoostsLevel = false;
        this.checkedBoostsLevel = false;
        this.screenType = i;
        this.nightTheme = z3;
        this.applyingTheme = themeInfo;
        this.deleteOnCancel = z;
        this.editingTheme = z2;
        if (i == 1) {
            Theme.ThemeAccent accent = themeInfo.getAccent(!z2);
            this.accent = accent;
            if (accent != null) {
                this.useDefaultThemeForButtons = false;
                this.backupAccentColor = accent.accentColor;
                this.backupAccentColor2 = accent.accentColor2;
                this.backupMyMessagesAccentColor = accent.myMessagesAccentColor;
                this.backupMyMessagesGradientAccentColor1 = accent.myMessagesGradientAccentColor1;
                this.backupMyMessagesGradientAccentColor2 = accent.myMessagesGradientAccentColor2;
                this.backupMyMessagesGradientAccentColor3 = accent.myMessagesGradientAccentColor3;
                this.backupMyMessagesAnimated = accent.myMessagesAnimated;
                this.backupBackgroundOverrideColor = accent.backgroundOverrideColor;
                this.backupBackgroundGradientOverrideColor1 = accent.backgroundGradientOverrideColor1;
                this.backupBackgroundGradientOverrideColor2 = accent.backgroundGradientOverrideColor2;
                this.backupBackgroundGradientOverrideColor3 = accent.backgroundGradientOverrideColor3;
                this.backupIntensity = accent.patternIntensity;
                this.backupSlug = accent.patternSlug;
                this.backupBackgroundRotation = accent.backgroundRotation;
            }
        } else {
            if (i == 0) {
                this.useDefaultThemeForButtons = false;
            }
            Theme.ThemeAccent accent2 = themeInfo.getAccent(false);
            this.accent = accent2;
            if (accent2 != null) {
                this.selectedPattern = accent2.pattern;
            }
        }
        Theme.ThemeAccent themeAccent = this.accent;
        if (themeAccent != null) {
            this.isMotion = themeAccent.patternMotion;
            if (!TextUtils.isEmpty(themeAccent.patternSlug)) {
                this.currentIntensity = this.accent.patternIntensity;
            }
            Theme.ThemeInfo themeInfo2 = Theme.currentDayTheme;
            Theme.previousTheme = themeInfo2 == null ? Theme.defaultTheme : themeInfo2;
            Theme.hasPreviousTheme = true;
            Theme.isApplyingAccent = true;
            Theme.applyTheme(themeInfo, false, false);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.goingToPreviewTheme, new Object[0]);
        anonymousClass12.themePreview = true;
        anonymousClass14.themePreview = true;
        anonymousClass13.themePreview = true;
        anonymousClass15.themePreview = true;
    }

    public final void animateMotionChange() {
        int i = 1;
        AnimatorSet animatorSet = this.motionAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.motionAnimation = animatorSet2;
        if (this.isMotion) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.backgroundImage, (Property<BackgroundView, Float>) View.SCALE_X, this.parallaxScale), ObjectAnimator.ofFloat(this.backgroundImage, (Property<BackgroundView, Float>) View.SCALE_Y, this.parallaxScale));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.backgroundImage, (Property<BackgroundView, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.backgroundImage, (Property<BackgroundView, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.backgroundImage, (Property<BackgroundView, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.backgroundImage, (Property<BackgroundView, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.motionAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        this.motionAnimation.addListener(new AnonymousClass32(this, i));
        this.motionAnimation.start();
    }

    public final void applyWallpaperBackground(boolean z) {
        Object obj;
        boolean zCopyFile;
        boolean zEquals;
        char c;
        File file;
        File file2;
        Object obj2;
        ?? r11;
        ?? r12;
        Object obj3;
        String str;
        int i;
        int i2;
        int i3;
        boolean z2;
        int i4;
        MediaController.SearchImage searchImage;
        TLRPC.Photo photo;
        File httpFilePath;
        ?? r26;
        ?? r13;
        ?? r27;
        TLRPC.TL_wallPaper tL_wallPaper;
        ?? r14;
        Theme.OverrideWallpaperInfo overrideWallpaperInfo;
        Object obj4;
        long j;
        boolean z3;
        boolean z4;
        ?? r15;
        ?? r0;
        Theme.OverrideWallpaperInfo overrideWallpaperInfo2;
        ?? r16;
        ?? r1;
        float f;
        TLRPC.UserFull userFull;
        WallpapersListActivity.ColorWallpaper colorWallpaper;
        String str2;
        float f2;
        float f3;
        Object obj5;
        int i5 = 0;
        int i6 = 1;
        long j2 = this.dialogId;
        if (j2 < 0) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
            if (tL_premium_boostsStatus != null) {
                if (tL_premium_boostsStatus.level < (ChatObject.isChannelAndNotMegaGroup(-j2, this.currentAccount) ? getMessagesController().channelCustomWallpaperLevelMin : getMessagesController().groupCustomWallpaperLevelMin)) {
                    getMessagesController().getBoostsController().userCanBoostChannel(this.dialogId, this.boostsStatus, new ThemePreviewActivity$$ExternalSyntheticLambda25(this, i6));
                    return;
                }
            }
            if (this.boostsStatus == null) {
                return;
            }
        }
        if (!getUserConfig().isPremium() && z) {
            showDialog(new PremiumFeatureBottomSheet(this, getParentActivity(), getCurrentAccount(), false, 22, true, null));
            return;
        }
        Theme.ThemeInfo themeInfo = Theme.currentTheme;
        String strGenerateWallpaperName = themeInfo.generateWallpaperName(null, this.isBlurred);
        String strGenerateWallpaperName2 = this.isBlurred ? themeInfo.generateWallpaperName(null, false) : strGenerateWallpaperName;
        File file3 = new File(ApplicationLoader.getFilesDirFixed(), strGenerateWallpaperName);
        Object obj6 = this.currentWallpaper;
        char c2 = 'W';
        if (obj6 instanceof TLRPC.TL_wallPaper) {
            if (this.originalBitmap != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    this.originalBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                    fileOutputStream.close();
                } catch (Exception e) {
                    FileLog.e(e);
                    zCopyFile = false;
                }
            } else {
                ImageReceiver imageReceiver = this.backgroundImage.getImageReceiver();
                if (imageReceiver.hasNotThumb() || imageReceiver.hasStaticThumb()) {
                    Bitmap bitmap = imageReceiver.getBitmap();
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
                        fileOutputStream2.close();
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        zCopyFile = false;
                    }
                }
                zCopyFile = false;
                if (!zCopyFile) {
                    try {
                        zCopyFile = AndroidUtilities.copyFile(FileLoader.getInstance(this.currentAccount).getPathToAttach(((TLRPC.TL_wallPaper) this.currentWallpaper).document, true), file3);
                    } catch (Exception e3) {
                        FileLog.e(e3);
                        obj = null;
                        zCopyFile = false;
                        obj5 = obj;
                    }
                }
                obj5 = null;
                zEquals = false;
                r12 = obj5;
            }
            zCopyFile = true;
            if (!zCopyFile) {
                zCopyFile = AndroidUtilities.copyFile(FileLoader.getInstance(this.currentAccount).getPathToAttach(((TLRPC.TL_wallPaper) this.currentWallpaper).document, true), file3);
            }
            obj5 = null;
            zEquals = false;
            r12 = obj5;
        } else if (obj6 instanceof WallpapersListActivity.ColorWallpaper) {
            if (this.selectedPattern != null) {
                try {
                    Bitmap bitmap2 = this.backgroundImage.getImageReceiver().getBitmap();
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    if (this.backgroundGradientColor2 == 0) {
                        if (this.backgroundGradientColor1 != 0) {
                            GradientDrawable gradientDrawable = new GradientDrawable(BackgroundGradientDrawable.getGradientOrientation(this.backgroundRotation), new int[]{this.backgroundColor, this.backgroundGradientColor1});
                            gradientDrawable.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                            gradientDrawable.draw(canvas);
                        } else {
                            canvas.drawColor(this.backgroundColor);
                        }
                    }
                    Paint paint = new Paint(2);
                    paint.setColorFilter(new PorterDuffColorFilter(this.patternColor, this.blendMode));
                    paint.setAlpha((int) (Math.abs(this.currentIntensity) * 255.0f));
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                    FileOutputStream fileOutputStream3 = new FileOutputStream(file3);
                    if (this.backgroundGradientColor2 != 0) {
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream3);
                    } else {
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream3);
                    }
                    fileOutputStream3.close();
                    obj2 = null;
                } catch (Throwable th) {
                    FileLog.e(th);
                    zCopyFile = false;
                    zEquals = false;
                    r12 = 0;
                }
            } else {
                obj2 = null;
            }
            zEquals = false;
            r11 = obj2;
            zCopyFile = true;
            r12 = r11;
        } else if (obj6 instanceof WallpapersListActivity.FileWallpaper) {
            WallpapersListActivity.FileWallpaper fileWallpaper = (WallpapersListActivity.FileWallpaper) obj6;
            if (fileWallpaper.resId != 0 || "t".equals(fileWallpaper.slug)) {
                obj2 = null;
                zEquals = false;
                r11 = obj2;
                zCopyFile = true;
                r12 = r11;
            } else {
                try {
                    try {
                        if (!this.hasScrollingBackground || this.currentScrollOffset == this.defaultScrollOffset) {
                            c = 0;
                            c2 = 0;
                            file = fileWallpaper.originalPath;
                            if (file == null) {
                                file2 = fileWallpaper.path;
                            }
                            zEquals = file.equals(file3);
                            r11 = c2;
                            if (zEquals) {
                                zCopyFile = true;
                                r12 = r11;
                            } else {
                                try {
                                    zCopyFile = AndroidUtilities.copyFile(file, file3);
                                    r12 = c2;
                                } catch (Exception e4) {
                                    e = e4;
                                    FileLog.e(e);
                                    zCopyFile = false;
                                    r12 = c2;
                                }
                            }
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap((int) this.croppedWidth, this.currentWallpaperBitmap.getHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                            canvas2.translate(-((this.currentScrollOffset / this.maxScrollOffset) * (this.currentWallpaperBitmap.getWidth() - bitmapCreateBitmap2.getWidth())), 0.0f);
                            c = 0;
                            canvas2.drawBitmap(this.currentWallpaperBitmap, 0.0f, 0.0f, (Paint) null);
                            fileWallpaper.path = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                            FileOutputStream fileOutputStream4 = new FileOutputStream(fileWallpaper.path);
                            bitmapCreateBitmap2.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream4);
                            fileOutputStream4.close();
                            bitmapCreateBitmap2.recycle();
                            file2 = fileWallpaper.path;
                        }
                        file = file2;
                        c2 = c;
                        zEquals = file.equals(file3);
                        r11 = c2;
                        if (zEquals) {
                            zCopyFile = true;
                            r12 = r11;
                        } else {
                            zCopyFile = AndroidUtilities.copyFile(file, file3);
                            r12 = c2;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        zEquals = false;
                        FileLog.e(e);
                        zCopyFile = false;
                        r12 = c2;
                        if (this.isBlurred) {
                            try {
                                FileOutputStream fileOutputStream5 = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), strGenerateWallpaperName2));
                                this.blurredBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream5);
                                fileOutputStream5.close();
                                zCopyFile = true;
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                zCopyFile = false;
                            }
                        }
                        obj3 = this.currentWallpaper;
                        if (obj3 instanceof TLRPC.TL_wallPaper) {
                            TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj3;
                            str = tL_wallPaper2.slug;
                            zCopyFile = zCopyFile;
                            zEquals = zEquals;
                            r27 = r12;
                            i = 45;
                            i3 = 0;
                            i4 = 0;
                            r14 = tL_wallPaper2;
                            i2 = 0;
                        } else if (obj3 instanceof WallpapersListActivity.ColorWallpaper) {
                            if (obj3 instanceof WallpapersListActivity.FileWallpaper) {
                                WallpapersListActivity.FileWallpaper fileWallpaper2 = (WallpapersListActivity.FileWallpaper) obj3;
                                str = fileWallpaper2.slug;
                                httpFilePath = fileWallpaper2.path;
                            } else if (obj3 instanceof MediaController.SearchImage) {
                                searchImage = (MediaController.SearchImage) obj3;
                                photo = searchImage.photo;
                                if (photo != null) {
                                    httpFilePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.maxWallpaperSize, true), true);
                                } else {
                                    httpFilePath = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                                }
                                str = "";
                            } else {
                                str = "d";
                                i = 45;
                                i2 = 0;
                                i3 = 0;
                                i5 = 0;
                                z2 = false;
                                i4 = 0;
                                r27 = 0;
                                r14 = z2;
                            }
                            r26 = httpFilePath;
                            i = 45;
                            i2 = 0;
                            i3 = 0;
                            i5 = 0;
                            r13 = 0;
                            i4 = 0;
                            r14 = r13;
                            r27 = r26;
                        } else if ("d".equals(((WallpapersListActivity.ColorWallpaper) obj3).slug)) {
                            r26 = r12;
                            str = "d";
                            i = 45;
                            i2 = 0;
                            i3 = 0;
                            r13 = r12;
                            i4 = 0;
                            r14 = r13;
                            r27 = r26;
                        } else {
                            tL_wallPaper = this.selectedPattern;
                            if (tL_wallPaper != null) {
                                str = tL_wallPaper.slug;
                            } else {
                                str = "c";
                            }
                            i2 = this.backgroundColor;
                            i4 = this.backgroundGradientColor1;
                            int i7 = this.backgroundGradientColor2;
                            i3 = this.backgroundGradientColor3;
                            i = this.backgroundRotation;
                            i5 = i7;
                            z2 = false;
                            r27 = 0;
                            r14 = z2;
                        }
                        overrideWallpaperInfo = new Theme.OverrideWallpaperInfo();
                        overrideWallpaperInfo.fileName = strGenerateWallpaperName2;
                        overrideWallpaperInfo.originalFileName = strGenerateWallpaperName;
                        overrideWallpaperInfo.slug = str;
                        overrideWallpaperInfo.isBlurred = this.isBlurred;
                        overrideWallpaperInfo.isMotion = this.isMotion;
                        overrideWallpaperInfo.color = i2;
                        overrideWallpaperInfo.gradientColor1 = i4;
                        overrideWallpaperInfo.gradientColor2 = i5;
                        overrideWallpaperInfo.gradientColor3 = i3;
                        overrideWallpaperInfo.rotation = i;
                        if (this.shouldShowBrightnessControll) {
                            f3 = this.dimAmount;
                            if (f3 >= 0.0f) {
                                overrideWallpaperInfo.intensity = f3;
                            } else {
                                overrideWallpaperInfo.intensity = this.currentIntensity;
                            }
                        } else {
                            overrideWallpaperInfo.intensity = this.currentIntensity;
                        }
                        obj4 = this.currentWallpaper;
                        if (obj4 instanceof WallpapersListActivity.ColorWallpaper) {
                            colorWallpaper = (WallpapersListActivity.ColorWallpaper) obj4;
                            if ("c".equals(str)) {
                                str2 = null;
                            } else {
                                str2 = null;
                            }
                            f2 = colorWallpaper.intensity;
                            if (f2 < 0.0f) {
                                f2 *= -1.0f;
                            }
                            if (colorWallpaper.parentWallpaper != null) {
                                TLRPC.WallPaper wallPaper = colorWallpaper.parentWallpaper;
                                overrideWallpaperInfo.wallpaperId = wallPaper.id;
                                overrideWallpaperInfo.accessHash = wallPaper.access_hash;
                            }
                        }
                        j = this.dialogId;
                        overrideWallpaperInfo.dialogId = j;
                        if (j != 0) {
                            overrideWallpaperInfo.prevUserWallpaper = userFull.wallpaper;
                        }
                        overrideWallpaperInfo.forBoth = z;
                        ?? messagesController = MessagesController.getInstance(this.currentAccount);
                        if (str == null) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        messagesController.saveWallpaperToServer(r27, overrideWallpaperInfo, z3, 0L);
                        if (!zCopyFile) {
                            if (this.dialogId != 0) {
                                if (r27 == 0) {
                                    ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.dialogId, null, overrideWallpaperInfo, this.serverWallpaper, new ChatActivity$$ExternalSyntheticLambda470(5));
                                    r16 = r14;
                                } else {
                                    ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.dialogId, null, overrideWallpaperInfo, this.serverWallpaper, new ChatActivity$$ExternalSyntheticLambda470(5));
                                    r16 = r14;
                                }
                                this.setupFinished = true;
                                r1 = this.delegate;
                                if (r1 != 0) {
                                    r1.didSetNewBackground(r16);
                                }
                                finishFragment();
                                z4 = false;
                                r15 = r16;
                            } else {
                                Theme.serviceMessageColorBackup = getThemedColor(Theme.key_chat_serviceBackground);
                                if ("t".equals(overrideWallpaperInfo.slug)) {
                                    overrideWallpaperInfo2 = null;
                                } else {
                                    overrideWallpaperInfo2 = overrideWallpaperInfo;
                                }
                                Theme.currentTheme.setOverrideWallpaper(overrideWallpaperInfo2);
                                Theme.reloadWallpaper(true);
                                if (!zEquals) {
                                    ImageLoader.getInstance().removeImage(ImageLoader.getHttpFileName(file3.getAbsolutePath()) + "@100_100");
                                }
                            }
                            if (z4) {
                                r0 = this.delegate;
                                if (r0 != 0) {
                                    r0.didSetNewBackground(r15);
                                }
                                finishFragment();
                            }
                        }
                        z4 = true;
                        r15 = r14;
                        if (z4) {
                            r0 = this.delegate;
                            if (r0 != 0) {
                                r0.didSetNewBackground(r15);
                            }
                            finishFragment();
                        }
                    }
                } catch (Exception e6) {
                    e = e6;
                    c2 = 0;
                }
            }
        } else {
            obj = null;
            obj5 = null;
            obj = null;
            if (obj6 instanceof MediaController.SearchImage) {
                MediaController.SearchImage searchImage2 = (MediaController.SearchImage) obj6;
                TLRPC.Photo photo2 = searchImage2.photo;
                try {
                    zCopyFile = AndroidUtilities.copyFile(photo2 != null ? FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, this.maxWallpaperSize, true), true) : ImageLoader.getHttpFilePath(searchImage2.imageUrl, "jpg"), file3);
                } catch (Exception e7) {
                    FileLog.e(e7);
                    zCopyFile = false;
                    obj5 = obj;
                }
            } else {
                zCopyFile = false;
                obj5 = obj;
            }
            zEquals = false;
            r12 = obj5;
        }
        if (this.isBlurred) {
            FileOutputStream fileOutputStream6 = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), strGenerateWallpaperName2));
            this.blurredBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream6);
            fileOutputStream6.close();
            zCopyFile = true;
        }
        obj3 = this.currentWallpaper;
        if (obj3 instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) obj3;
            str = tL_wallPaper3.slug;
            zCopyFile = zCopyFile;
            zEquals = zEquals;
            r27 = r12;
            i = 45;
            i3 = 0;
            i4 = 0;
            r14 = tL_wallPaper3;
            i2 = 0;
        } else if (obj3 instanceof WallpapersListActivity.ColorWallpaper) {
            if (obj3 instanceof WallpapersListActivity.FileWallpaper) {
                WallpapersListActivity.FileWallpaper fileWallpaper3 = (WallpapersListActivity.FileWallpaper) obj3;
                str = fileWallpaper3.slug;
                httpFilePath = fileWallpaper3.path;
            } else if (obj3 instanceof MediaController.SearchImage) {
                searchImage = (MediaController.SearchImage) obj3;
                photo = searchImage.photo;
                if (photo != null) {
                    httpFilePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.maxWallpaperSize, true), true);
                } else {
                    httpFilePath = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                }
                str = "";
            } else {
                str = "d";
                i = 45;
                i2 = 0;
                i3 = 0;
                i5 = 0;
                z2 = false;
                i4 = 0;
                r27 = 0;
                r14 = z2;
            }
            r26 = httpFilePath;
            i = 45;
            i2 = 0;
            i3 = 0;
            i5 = 0;
            r13 = 0;
            i4 = 0;
            r14 = r13;
            r27 = r26;
        } else if ("d".equals(((WallpapersListActivity.ColorWallpaper) obj3).slug)) {
            r26 = r12;
            str = "d";
            i = 45;
            i2 = 0;
            i3 = 0;
            r13 = r12;
            i4 = 0;
            r14 = r13;
            r27 = r26;
        } else {
            tL_wallPaper = this.selectedPattern;
            if (tL_wallPaper != null) {
                str = tL_wallPaper.slug;
            } else {
                str = "c";
            }
            i2 = this.backgroundColor;
            i4 = this.backgroundGradientColor1;
            int i8 = this.backgroundGradientColor2;
            i3 = this.backgroundGradientColor3;
            i = this.backgroundRotation;
            i5 = i8;
            z2 = false;
            r27 = 0;
            r14 = z2;
        }
        overrideWallpaperInfo = new Theme.OverrideWallpaperInfo();
        overrideWallpaperInfo.fileName = strGenerateWallpaperName2;
        overrideWallpaperInfo.originalFileName = strGenerateWallpaperName;
        overrideWallpaperInfo.slug = str;
        overrideWallpaperInfo.isBlurred = this.isBlurred;
        overrideWallpaperInfo.isMotion = this.isMotion;
        overrideWallpaperInfo.color = i2;
        overrideWallpaperInfo.gradientColor1 = i4;
        overrideWallpaperInfo.gradientColor2 = i5;
        overrideWallpaperInfo.gradientColor3 = i3;
        overrideWallpaperInfo.rotation = i;
        if (this.shouldShowBrightnessControll) {
            f3 = this.dimAmount;
            if (f3 >= 0.0f) {
                overrideWallpaperInfo.intensity = f3;
            } else {
                overrideWallpaperInfo.intensity = this.currentIntensity;
            }
        } else {
            overrideWallpaperInfo.intensity = this.currentIntensity;
        }
        obj4 = this.currentWallpaper;
        if (obj4 instanceof WallpapersListActivity.ColorWallpaper) {
            colorWallpaper = (WallpapersListActivity.ColorWallpaper) obj4;
            if ("c".equals(str) || "t".equals(str) || "d".equals(str)) {
                str2 = null;
            } else {
                str2 = str;
            }
            f2 = colorWallpaper.intensity;
            if (f2 < 0.0f && !Theme.currentTheme.isDark()) {
                f2 *= -1.0f;
            }
            if (colorWallpaper.parentWallpaper != null && colorWallpaper.color == i2 && colorWallpaper.gradientColor1 == i4 && colorWallpaper.gradientColor2 == i5 && colorWallpaper.gradientColor3 == i3 && TextUtils.equals(colorWallpaper.slug, str2) && colorWallpaper.gradientRotation == i && (this.selectedPattern == null || Math.abs(f2 - this.currentIntensity) < 0.001f)) {
                TLRPC.WallPaper wallPaper2 = colorWallpaper.parentWallpaper;
                overrideWallpaperInfo.wallpaperId = wallPaper2.id;
                overrideWallpaperInfo.accessHash = wallPaper2.access_hash;
            }
        }
        j = this.dialogId;
        overrideWallpaperInfo.dialogId = j;
        if (j != 0 && (userFull = getMessagesController().getUserFull(this.dialogId)) != null) {
            overrideWallpaperInfo.prevUserWallpaper = userFull.wallpaper;
        }
        overrideWallpaperInfo.forBoth = z;
        ?? messagesController2 = MessagesController.getInstance(this.currentAccount);
        if (str == null && this.dialogId == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        messagesController2.saveWallpaperToServer(r27, overrideWallpaperInfo, z3, 0L);
        if (!zCopyFile) {
            if (this.dialogId != 0) {
                if (r27 == 0 && getMessagesController().uploadingWallpaperInfo == overrideWallpaperInfo) {
                    TLRPC.TL_wallPaper tL_wallPaper4 = new TLRPC.TL_wallPaper();
                    TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                    tL_wallPaper4.settings = tL_wallPaperSettings;
                    tL_wallPaperSettings.intensity = (int) (overrideWallpaperInfo.intensity * 100.0f);
                    tL_wallPaperSettings.blur = overrideWallpaperInfo.isBlurred;
                    tL_wallPaperSettings.motion = overrideWallpaperInfo.isMotion;
                    tL_wallPaper4.uploadingImage = r27.getAbsolutePath();
                    Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                    Canvas canvas3 = new Canvas(bitmapCreateBitmap3);
                    float fMax = Math.max(50.0f / this.backgroundImage.getMeasuredWidth(), 50.0f / this.backgroundImage.getMeasuredHeight());
                    canvas3.scale(fMax, fMax);
                    if (this.backgroundImage.getMeasuredHeight() > this.backgroundImage.getMeasuredWidth()) {
                        f = 0.0f;
                        canvas3.translate(0.0f, (-(this.backgroundImage.getMeasuredHeight() - this.backgroundImage.getMeasuredWidth())) / 2.0f);
                    } else {
                        f = 0.0f;
                        canvas3.translate((-(this.backgroundImage.getMeasuredWidth() - this.backgroundImage.getMeasuredHeight())) / 2.0f, 0.0f);
                    }
                    float f4 = this.dimAmount;
                    this.dimAmount = f;
                    this.backgroundImage.draw(canvas3);
                    this.dimAmount = f4;
                    Utilities.blurBitmap(bitmapCreateBitmap3, 3);
                    tL_wallPaper4.stripedThumb = bitmapCreateBitmap3;
                    TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                    tL_messageService.random_id = SendMessagesHelper.getInstance(this.currentAccount).getNextRandomId();
                    tL_messageService.dialog_id = this.dialogId;
                    tL_messageService.unread = true;
                    tL_messageService.out = true;
                    int newMessageId = getUserConfig().getNewMessageId();
                    tL_messageService.id = newMessageId;
                    tL_messageService.local_id = newMessageId;
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
                    if (ChatObject.isChannel(chat)) {
                        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                        tL_messageService.from_id = tL_peerChannel;
                        tL_peerChannel.channel_id = chat.id;
                        TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                        tL_messageService.peer_id = tL_peerChannel2;
                        tL_peerChannel2.channel_id = chat.id;
                    } else {
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_messageService.from_id = tL_peerUser;
                        tL_peerUser.user_id = getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                        tL_messageService.peer_id = tL_peerUser2;
                        tL_peerUser2.user_id = this.dialogId;
                    }
                    tL_messageService.flags |= 256;
                    tL_messageService.date = getConnectionsManager().getCurrentTime();
                    TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = new TLRPC.TL_messageActionSetChatWallPaper();
                    tL_messageService.action = tL_messageActionSetChatWallPaper;
                    tL_messageActionSetChatWallPaper.wallpaper = tL_wallPaper4;
                    tL_messageActionSetChatWallPaper.for_both = z;
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    arrayList.add(new MessageObject(this.currentAccount, tL_messageService, false, false));
                    new ArrayList().add(tL_messageService);
                    MessagesController.getInstance(this.currentAccount).updateInterfaceWithMessages(this.dialogId, arrayList, 0);
                    if (this.dialogId >= 0) {
                        TLRPC.UserFull userFull2 = getMessagesController().getUserFull(this.dialogId);
                        if (userFull2 != null) {
                            userFull2.wallpaper = tL_wallPaper4;
                            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(this.dialogId), userFull2);
                        }
                    } else {
                        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.dialogId);
                        if (chatFull != null) {
                            chatFull.wallpaper = tL_wallPaper4;
                            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                            int i9 = NotificationCenter.chatInfoDidLoad;
                            Boolean bool = Boolean.FALSE;
                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i9, chatFull, 0, bool, bool);
                            r16 = tL_wallPaper4;
                        }
                    }
                    r16 = tL_wallPaper4;
                } else {
                    ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.dialogId, null, overrideWallpaperInfo, this.serverWallpaper, new ChatActivity$$ExternalSyntheticLambda470(5));
                    r16 = r14;
                }
                this.setupFinished = true;
                r1 = this.delegate;
                if (r1 != 0) {
                    r1.didSetNewBackground(r16);
                }
                finishFragment();
                z4 = false;
                r15 = r16;
            } else {
                Theme.serviceMessageColorBackup = getThemedColor(Theme.key_chat_serviceBackground);
                if ("t".equals(overrideWallpaperInfo.slug)) {
                    overrideWallpaperInfo2 = null;
                } else {
                    overrideWallpaperInfo2 = overrideWallpaperInfo;
                }
                Theme.currentTheme.setOverrideWallpaper(overrideWallpaperInfo2);
                Theme.reloadWallpaper(true);
                if (!zEquals) {
                    ImageLoader.getInstance().removeImage(ImageLoader.getHttpFileName(file3.getAbsolutePath()) + "@100_100");
                }
            }
            if (z4) {
                r0 = this.delegate;
                if (r0 != 0) {
                    r0.didSetNewBackground(r15);
                }
                finishFragment();
            }
        }
        z4 = true;
        r15 = r14;
        if (z4) {
            r0 = this.delegate;
            if (r0 != 0) {
                r0.didSetNewBackground(r15);
            }
            finishFragment();
        }
    }

    public final void cancelThemeApply(boolean z) {
        int i = this.screenType;
        if (i == 2) {
            if (z) {
                return;
            }
            finishFragment();
            return;
        }
        Theme.applyPreviousTheme();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        Theme.ThemeAccent themeAccent = this.accent;
        if (i == 1) {
            if (this.editingTheme) {
                themeAccent.accentColor = this.backupAccentColor;
                themeAccent.accentColor2 = this.backupAccentColor2;
                themeAccent.myMessagesAccentColor = this.backupMyMessagesAccentColor;
                themeAccent.myMessagesGradientAccentColor1 = this.backupMyMessagesGradientAccentColor1;
                themeAccent.myMessagesGradientAccentColor2 = this.backupMyMessagesGradientAccentColor2;
                themeAccent.myMessagesGradientAccentColor3 = this.backupMyMessagesGradientAccentColor3;
                themeAccent.myMessagesAnimated = this.backupMyMessagesAnimated;
                themeAccent.backgroundOverrideColor = this.backupBackgroundOverrideColor;
                themeAccent.backgroundGradientOverrideColor1 = this.backupBackgroundGradientOverrideColor1;
                themeAccent.backgroundGradientOverrideColor2 = this.backupBackgroundGradientOverrideColor2;
                themeAccent.backgroundGradientOverrideColor3 = this.backupBackgroundGradientOverrideColor3;
                themeAccent.backgroundRotation = this.backupBackgroundRotation;
                themeAccent.patternSlug = this.backupSlug;
                themeAccent.patternIntensity = this.backupIntensity;
            }
            Theme.saveThemeAccents(this.applyingTheme, false, true, false, false, false);
        } else {
            if (themeAccent != null) {
                Theme.saveThemeAccents(this.applyingTheme, false, this.deleteOnCancel, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).rebuildAllFragmentViews(false, false);
            if (this.deleteOnCancel) {
                Theme.ThemeInfo themeInfo = this.applyingTheme;
                if (themeInfo.pathToFile != null && Theme.themesDict.get(themeInfo.getKey()) == null) {
                    new File(themeInfo.pathToFile).delete();
                }
            }
        }
        if (z) {
            return;
        }
        finishFragment();
    }

    public final BitmapDrawable checkBlur(Drawable drawable) {
        WeakReference weakReference = this.lastDrawableToBlur;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.blurredDrawable;
        }
        WeakReference weakReference2 = this.lastDrawableToBlur;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.lastDrawableToBlur = null;
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            this.blurredDrawable = null;
            return null;
        }
        this.lastDrawableToBlur = new WeakReference(drawable);
        int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, intrinsicWidth, 24);
        ColorFilter colorFilter = drawable.getColorFilter();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1.3f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.94f);
        drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setColorFilter(colorFilter);
        Utilities.blurBitmap(bitmapCreateBitmap, 3);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getParentActivity().getResources(), bitmapCreateBitmap);
        this.blurredDrawable = bitmapDrawable;
        bitmapDrawable.setFilterBitmap(true);
        return this.blurredDrawable;
    }

    public final boolean checkDiscard$7(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ThemePreviewActivity.checkDiscard$7(boolean):boolean");
    }

    @Override
    public final View createView(Context context) {
        boolean z;
        BackgroundView[] backgroundViewArr;
        int i;
        float f;
        int i2;
        int i3;
        Theme.ThemeAccent themeAccent;
        char c;
        final Rect rect;
        TextPaint textPaint;
        Object obj;
        int i4;
        String[] strArr;
        int[] iArr;
        Theme.ThemeInfo themeInfo;
        int i5;
        final int i6;
        AnonymousClass1 anonymousClass1;
        int i7;
        final int i8;
        FrameLayout frameLayout;
        FrameLayout[] frameLayoutArr;
        int i9;
        FrameLayout.LayoutParams layoutParamsCreateFrame;
        float f2;
        int iDp;
        int i10;
        ?? r14;
        float f3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr2;
        String[] strArr2;
        int i16;
        int iMax;
        int[] iArr3;
        int i17;
        float f4;
        float f5;
        float f6;
        final int i18;
        boolean z2;
        WallpaperCheckBoxView wallpaperCheckBoxView;
        int iDp2;
        FrameLayout.LayoutParams layoutParams;
        WallpaperCheckBoxView wallpaperCheckBoxView2;
        int i19;
        boolean z3;
        int iDp3;
        FrameLayout.LayoutParams layoutParams2;
        boolean z4;
        int iMax2;
        int i20;
        int i21;
        float f7;
        float f8;
        float f9;
        Object obj2;
        int i22;
        DayNightSwitchDelegate dayNightSwitchDelegate;
        int i23;
        float f10;
        float f11;
        float f12;
        final int i24;
        INavigationLayout iNavigationLayout;
        int i25;
        boolean z5;
        int themedColor;
        int i26;
        int themedColor2;
        int themedColor3;
        int i27;
        int i28;
        int i29 = 4;
        final int i30 = 3;
        final int i31 = 2;
        this.msgOutDrawable.resourcesProvider = (AnonymousClass1) getResourceProvider();
        this.msgOutDrawableSelected.resourcesProvider = (AnonymousClass1) getResourceProvider();
        this.msgOutMediaDrawable.resourcesProvider = (AnonymousClass1) getResourceProvider();
        this.msgOutMediaDrawableSelected.resourcesProvider = (AnonymousClass1) getResourceProvider();
        int i32 = 1;
        this.hasOwnBackground = true;
        DayNightSwitchDelegate dayNightSwitchDelegate2 = this.onSwitchDayNightDelegate;
        final int i33 = 0;
        boolean z6 = (dayNightSwitchDelegate2 == null || this.dialogId == 0) ? false : true;
        this.shouldShowDayNightIcon = z6;
        if (z6) {
            Object obj3 = this.currentWallpaper;
            if (!(obj3 instanceof WallpapersListActivity.FileWallpaper)) {
                if (obj3 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj3;
                    if (tL_wallPaper.document == null || tL_wallPaper.pattern) {
                    }
                }
                z = false;
            }
            z = true;
        } else {
            z = false;
        }
        this.shouldShowBrightnessControll = z;
        if (z) {
            this.progressToDarkTheme = dayNightSwitchDelegate2.isDark() ? 1.0f : 0.0f;
        }
        INavigationLayout iNavigationLayout2 = this.parentLayout;
        if (iNavigationLayout2 != null && ((ActionBarLayout) iNavigationLayout2).isLayersLayout()) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.page1 = new FrameLayout(context);
        if (this.shouldShowBrightnessControll && SharedConfig.dayNightWallpaperSwitchHint < 3) {
            AndroidUtilities.runOnUIThread(new ThemePreviewActivity$$ExternalSyntheticLambda0(this, i30), 2000L);
        }
        ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search);
        actionBarMenuItemAddItem.setIsSearchField$1();
        actionBarMenuItemAddItem.listener = new OKLCH() {
            @Override
            public final void onSearchCollapse() {
            }

            @Override
            public final void onSearchExpand() {
            }

            @Override
            public final void onTextChanged(EditTextBoldCursor editTextBoldCursor) {
            }
        };
        actionBarMenuItemAddItem.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.actionBar.setBackButtonDrawable(new MenuDrawable());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ThemePreview));
        LoginActivity.AnonymousClass4 anonymousClass4 = new LoginActivity.AnonymousClass4(context, this);
        this.page1 = anonymousClass4;
        anonymousClass4.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
        this.page1.addView(this.actionBar, LayoutHelper.createFrame(-2.0f, -1));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setVerticalScrollBarEnabled(true);
        this.listView.setItemAnimator(null);
        this.listView.setLayoutAnimation(null);
        zzku.m(this.listView);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        RecyclerListView recyclerListView2 = this.listView;
        int i34 = this.screenType;
        recyclerListView2.setPadding(0, 0, 0, AndroidUtilities.dp(i34 != 0 ? 12.0f : 0.0f));
        this.listView.setOnItemClickListener(new AuctionBidSheet$$ExternalSyntheticLambda6(i29));
        this.page1.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider);
        this.floatingButton = fragmentFloatingButton;
        fragmentFloatingButton.setImageResource(R.drawable.floating_pencil);
        this.page1.addView(this.floatingButton, FragmentFloatingButton.createDefaultLayoutParams());
        DialogsAdapter dialogsAdapter = new DialogsAdapter(context);
        this.dialogsAdapter = dialogsAdapter;
        this.listView.setAdapter(dialogsAdapter);
        this.page2 = new QrActivity.AnonymousClass1(context, this);
        this.messagesAdapter = new MessagesAdapter(context, this);
        this.actionBar2 = createActionBar(context);
        if (AndroidUtilities.isTablet()) {
            this.actionBar2.setOccupyStatusBar(false);
        }
        zzkt.m(this.actionBar2);
        this.actionBar2.setActionBarMenuOnItemClick(new AnonymousClass8());
        int i35 = 0;
        while (true) {
            backgroundViewArr = this.backgroundImages;
            if (i35 >= 2) {
                break;
            }
            BackgroundView backgroundView = new BackgroundView((Activity) getContext());
            backgroundViewArr[i35] = backgroundView;
            this.page2.addView(backgroundView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
            i35++;
        }
        BackgroundView backgroundView2 = backgroundViewArr[0];
        this.backgroundImage = backgroundView2;
        backgroundView2.setVisibility(0);
        backgroundViewArr[1].setVisibility(8);
        if (i34 == 2) {
            this.backgroundImage.getImageReceiver().setDelegate(new ThemePreviewActivity$$ExternalSyntheticLambda13(this, i33));
        }
        boolean z7 = this.messagesAdapter.showSecretMessages;
        Theme.ThemeInfo themeInfo2 = this.applyingTheme;
        if (z7) {
            this.actionBar2.setTitle("Telegram Beta Chat");
            this.actionBar2.setSubtitle(LocaleController.formatPluralString("Members", 505, new Object[0]));
        } else if (i34 == 2) {
            if (this.dialogId != 0) {
                this.actionBar2.setTitle(LocaleController.getString(R.string.WallpaperPreview));
            } else {
                this.actionBar2.setTitle(LocaleController.getString(R.string.BackgroundPreview));
            }
            ActionBarMenu actionBarMenuCreateMenu = this.actionBar2.createMenu();
            Object obj4 = this.currentWallpaper;
            if ((obj4 instanceof WallpapersListActivity.FileWallpaper) && ((WallpapersListActivity.FileWallpaper) obj4).originalPath != null) {
                actionBarMenuCreateMenu.addItem(7, R.drawable.msg_header_draw);
            }
            if (this.dialogId == 0) {
                if (!BuildVars.DEBUG_PRIVATE_VERSION || Theme.getActiveTheme().getAccent(false) == null) {
                    Object obj5 = this.currentWallpaper;
                    if (((obj5 instanceof WallpapersListActivity.ColorWallpaper) && !"d".equals(((WallpapersListActivity.ColorWallpaper) obj5).slug)) || (this.currentWallpaper instanceof TLRPC.TL_wallPaper)) {
                        actionBarMenuCreateMenu.addItem(5, R.drawable.msg_header_share);
                    }
                } else {
                    actionBarMenuCreateMenu.addItem(5, R.drawable.msg_header_share);
                }
            }
            if (this.dialogId != 0 && this.shouldShowDayNightIcon) {
                int i36 = R.raw.sun;
                RLottieDrawable rLottieDrawable = new RLottieDrawable(i36, SurfaceContainer$$ExternalSyntheticOutline0.m(i36, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
                this.sunDrawable = rLottieDrawable;
                this.dayNightItem = actionBarMenuCreateMenu.addItem(6, rLottieDrawable);
                this.sunDrawable.playInDirectionOfCustomEndFrame = true;
                DayNightSwitchDelegate dayNightSwitchDelegate3 = this.onSwitchDayNightDelegate;
                if (dayNightSwitchDelegate3 == null || dayNightSwitchDelegate3.isDark()) {
                    this.sunDrawable.setCurrentFrame(35, true, false);
                    this.sunDrawable.setCustomEndFrame(36);
                } else {
                    this.sunDrawable.setCustomEndFrame(0);
                    this.sunDrawable.setCurrentFrame(0, true, false);
                }
                this.sunDrawable.applyingLayerColors = true;
                int color = Theme.getColor(Theme.key_chats_menuName);
                this.sunDrawable.setLayerColor(color, "Sunny");
                this.sunDrawable.setLayerColor(color, "Path 6");
                this.sunDrawable.setLayerColor(color, "Path");
                this.sunDrawable.setLayerColor(color, "Path 5");
                this.sunDrawable.commitApplyLayerColors();
            }
        } else {
            if (i34 != 1) {
                TLRPC.TL_theme tL_theme = themeInfo2.info;
                String name = tL_theme != null ? tL_theme.title : themeInfo2.getName();
                int iLastIndexOf = name.lastIndexOf(".attheme");
                if (iLastIndexOf >= 0) {
                    name = name.substring(0, iLastIndexOf);
                }
                this.actionBar2.setTitle(name);
                TLRPC.TL_theme tL_theme2 = themeInfo2.info;
                if (tL_theme2 == null || (i = tL_theme2.installs_count) <= 0) {
                    this.actionBar2.setSubtitle(LocaleController.formatDateOnline((System.currentTimeMillis() / 1000) - 3600, null));
                } else {
                    this.actionBar2.setSubtitle(LocaleController.formatPluralString("ThemeInstallCount", i, new Object[0]));
                }
                this.listView2 = new RecyclerListView(context) {
                    public boolean scrollingBackground;
                    public float startX;

                    @Override
                    public final boolean allowSelectChildAtPosition(View view) {
                        AnonymousClass10 anonymousClass10 = this.listView2;
                        View viewFindContainingItemView = anonymousClass10.findContainingItemView(view);
                        RecyclerView.ViewHolder childViewHolder = viewFindContainingItemView == null ? null : anonymousClass10.getChildViewHolder(viewFindContainingItemView);
                        return childViewHolder == null || childViewHolder.mItemViewType != 2;
                    }

                    @Override
                    public final boolean drawChild(Canvas canvas, View view, long j) {
                        RecyclerView.ViewHolder childViewHolder;
                        boolean zDrawChild = super.drawChild(canvas, view, j);
                        if (view instanceof ChatMessageCell) {
                            ChatMessageCell chatMessageCell = (ChatMessageCell) view;
                            chatMessageCell.getMessageObject();
                            ImageReceiver avatarImage = chatMessageCell.getAvatarImage();
                            if (avatarImage != null) {
                                int top = view.getTop();
                                boolean zIsPinnedBottom = chatMessageCell.isPinnedBottom();
                                ThemePreviewActivity themePreviewActivity = this;
                                if (zIsPinnedBottom && (childViewHolder = themePreviewActivity.listView2.getChildViewHolder(view)) != null) {
                                    if (themePreviewActivity.listView2.findViewHolderForAdapterPosition(childViewHolder.getAdapterPosition() - 1) != null) {
                                        avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                                        avatarImage.draw(canvas);
                                        return zDrawChild;
                                    }
                                }
                                float translationX = chatMessageCell.getTranslationX();
                                int layoutHeight = chatMessageCell.getLayoutHeight() + view.getTop();
                                int measuredHeight = themePreviewActivity.listView2.getMeasuredHeight() - themePreviewActivity.listView2.getPaddingBottom();
                                if (layoutHeight > measuredHeight) {
                                    layoutHeight = measuredHeight;
                                }
                                if (chatMessageCell.isPinnedTop() && (childViewHolder = themePreviewActivity.listView2.getChildViewHolder(view)) != null) {
                                    int i37 = 0;
                                    while (i37 < 20) {
                                        i37++;
                                        RecyclerView.ViewHolder childViewHolder2 = themePreviewActivity.listView2.findViewHolderForAdapterPosition(childViewHolder2.getAdapterPosition() + 1);
                                        if (childViewHolder2 == null) {
                                            break;
                                        }
                                        View view2 = childViewHolder2.itemView;
                                        int top2 = view2.getTop();
                                        if (layoutHeight - AndroidUtilities.dp(48.0f) < view2.getBottom()) {
                                            translationX = Math.min(view2.getTranslationX(), translationX);
                                        }
                                        if (!(view2 instanceof ChatMessageCell) || !((ChatMessageCell) view2).isPinnedTop()) {
                                            top = top2;
                                            break;
                                        }
                                        top = top2;
                                    }
                                }
                                if (layoutHeight - AndroidUtilities.dp(48.0f) < top) {
                                    layoutHeight = AndroidUtilities.dp(48.0f) + top;
                                }
                                if (translationX != 0.0f) {
                                    canvas.save();
                                    canvas.translate(translationX, 0.0f);
                                }
                                avatarImage.setImageY(layoutHeight - AndroidUtilities.dp(44.0f));
                                avatarImage.draw(canvas);
                                if (translationX != 0.0f) {
                                    canvas.restore();
                                }
                            }
                        }
                        return zDrawChild;
                    }

                    @Override
                    public final void onChildPressed(View view, float f13, float f14, boolean z8) {
                        if (z8 && (view instanceof ChatMessageCell) && !((ChatMessageCell) view).isInsideBackground(f13)) {
                            return;
                        }
                        super.onChildPressed(view, f13, f14, z8);
                    }

                    @Override
                    public final void onLayout(boolean z8, int i37, int i38, int i39, int i40) {
                        super.onLayout(z8, i37, i38, i39, i40);
                        this.invalidateBlur$2();
                    }

                    @Override
                    public final boolean onTouchEvent(MotionEvent motionEvent) {
                        int action = motionEvent.getAction();
                        ThemePreviewActivity themePreviewActivity = this;
                        if (action == 1) {
                            if (!themePreviewActivity.wasScroll && (themePreviewActivity.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) && themePreviewActivity.patternLayout[0].getVisibility() == 0) {
                                themePreviewActivity.showPatternsView(0, false);
                            }
                            themePreviewActivity.wasScroll = false;
                        }
                        if (themePreviewActivity.hasScrollingBackground) {
                            if (motionEvent.getAction() == 0) {
                                this.startX = motionEvent.getX();
                                motionEvent.getY();
                                if (getParent() != null) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                this.scrollingBackground = true;
                            } else if (motionEvent.getAction() == 2) {
                                if (!this.scrollingBackground && Math.abs(this.startX - motionEvent.getX()) > AndroidUtilities.touchSlop) {
                                    if (getParent() != null) {
                                        getParent().requestDisallowInterceptTouchEvent(true);
                                    }
                                    this.scrollingBackground = true;
                                }
                            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                                this.scrollingBackground = false;
                                if (getParent() != null) {
                                    getParent().requestDisallowInterceptTouchEvent(false);
                                }
                            }
                            themePreviewActivity.gestureDetector2.onTouchEvent(motionEvent);
                        }
                        return this.scrollingBackground || super.onTouchEvent(motionEvent);
                    }

                    @Override
                    public final void setTranslationY(float f13) {
                        super.setTranslationY(f13);
                        ThemePreviewActivity themePreviewActivity = this;
                        int i37 = 0;
                        if (themePreviewActivity.backgroundCheckBoxView != null) {
                            int i38 = 0;
                            while (true) {
                                WallpaperCheckBoxView[] wallpaperCheckBoxViewArr = themePreviewActivity.backgroundCheckBoxView;
                                if (i38 >= wallpaperCheckBoxViewArr.length) {
                                    break;
                                }
                                wallpaperCheckBoxViewArr[i38].invalidate();
                                i38++;
                            }
                        }
                        if (themePreviewActivity.messagesCheckBoxView != null) {
                            while (true) {
                                WallpaperCheckBoxView[] wallpaperCheckBoxViewArr2 = themePreviewActivity.messagesCheckBoxView;
                                if (i37 >= wallpaperCheckBoxViewArr2.length) {
                                    break;
                                }
                                wallpaperCheckBoxViewArr2[i37].invalidate();
                                i37++;
                            }
                        }
                        AnonymousClass16 anonymousClass16 = themePreviewActivity.backgroundPlayAnimationView;
                        if (anonymousClass16 != null) {
                            anonymousClass16.invalidate();
                        }
                        AnonymousClass16 anonymousClass17 = themePreviewActivity.messagesPlayAnimationView;
                        if (anonymousClass17 != null) {
                            anonymousClass17.invalidate();
                        }
                    }
                };
                DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
                    @Override
                    public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                        invalidateViews();
                    }
                };
                defaultItemAnimator.setDelayAnimations();
                setItemAnimator(defaultItemAnimator);
                setVerticalScrollBarEnabled(true);
                setOverScrollMode(2);
                if (i34 == 2) {
                    AnonymousClass10 anonymousClass10 = this.listView2;
                    int iDp4 = AndroidUtilities.dp(4.0f);
                    f = 16.0f;
                    if (!this.self || this.dialogId <= 0) {
                        i27 = 0;
                    } else {
                        i27 = 58;
                    }
                    int iDp5 = AndroidUtilities.dp(72 + i27) - 12;
                    if (insideBottomSheet()) {
                        i28 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i28 = 0;
                    }
                    anonymousClass10.setPadding(0, iDp4, 0, iDp5 + i28);
                } else {
                    f = 16.0f;
                    if (i34 == 1) {
                        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(16.0f));
                    } else {
                        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                    }
                }
                setClipToPadding(false);
                setLayoutManager(new LinearLayoutManager(1, true));
                AnonymousClass10 anonymousClass11 = this.listView2;
                if (LocaleController.isRTL) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                anonymousClass11.setVerticalScrollbarPosition(i2);
                if (i34 == 1) {
                    this.page2.addView(this.listView2, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 273.0f));
                    setOnItemClickListener(new ThemePreviewActivity$$ExternalSyntheticLambda13(this, i32));
                    i3 = -1;
                } else {
                    i3 = -1;
                    this.page2.addView(this.listView2, LayoutHelper.createFrame(-1, -1, 51));
                }
                setOnScrollListener(new SettingsActivity.AnonymousClass5(this, 16));
                this.page2.addView(this.actionBar2, LayoutHelper.createFrame(-2.0f, i3));
                WallpaperParallaxEffect wallpaperParallaxEffect = new WallpaperParallaxEffect(context);
                this.parallaxEffect = wallpaperParallaxEffect;
                wallpaperParallaxEffect.setCallback(new ThemePreviewActivity$$ExternalSyntheticLambda13(this, i31));
                themeAccent = this.accent;
                if (i34 != 1 || i34 == 2) {
                    if (i34 == 2) {
                        AnonymousClass13 anonymousClass13 = new AnonymousClass13(this, context, insideBottomSheet());
                        this.bottomOverlayChat = anonymousClass13;
                        anonymousClass13.setWillNotDraw(false);
                        AnonymousClass13 anonymousClass14 = this.bottomOverlayChat;
                        int iDp6 = AndroidUtilities.dp(12.0f);
                        c = 2;
                        int iDp7 = AndroidUtilities.dp(12.0f);
                        int iDp8 = AndroidUtilities.dp(12.0f);
                        int iDp9 = AndroidUtilities.dp(12.0f);
                        if (insideBottomSheet()) {
                            i22 = AndroidUtilities.navigationBarHeight;
                        } else {
                            i22 = 0;
                        }
                        anonymousClass14.setPadding(iDp6, iDp7, iDp8, iDp9 + i22);
                        this.page2.addView(this.bottomOverlayChat, LayoutHelper.createFrame(-1, 0, 81));
                        BlurButton blurButton = new BlurButton(context, this);
                        this.applyButton1 = blurButton;
                        ScaleStateListAnimator.apply(blurButton, 0.033f, 1.2f);
                        updateApplyButton1(false);
                        this.applyButton1.setOnClickListener(new View.OnClickListener(this) {
                            public final ThemePreviewActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (i30) {
                                    case 0:
                                        this.f$0.cancelThemeApply(false);
                                        break;
                                    case 1:
                                        this.f$0.lambda$createView$18$1$2();
                                        break;
                                    case 2:
                                        this.f$0.dropDownContainer.toggleSubMenu(null, null);
                                        break;
                                    case 3:
                                        this.f$0.applyWallpaperBackground(false);
                                        break;
                                    default:
                                        this.f$0.applyWallpaperBackground(true);
                                        break;
                                }
                            }
                        });
                        if (this.dialogId > 0 || this.self || this.serverWallpaper != null) {
                            this.bottomOverlayChat.addView(this.applyButton1, LayoutHelper.createFrame(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                        } else {
                            BlurButton blurButton2 = new BlurButton(context, this);
                            this.applyButton2 = blurButton2;
                            ScaleStateListAnimator.apply(blurButton2, 0.033f, 1.2f);
                            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.dialogId));
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
                            if (!getUserConfig().isPremium()) {
                                spannableStringBuilder.append((CharSequence) "l ");
                                spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_mini_lock3), 0, 1, 33);
                            }
                            spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.ApplyWallpaperForMeAndPeer, UserObject.getUserName(user)));
                            this.applyButton2.setText(spannableStringBuilder);
                            try {
                                BlurButton blurButton3 = this.applyButton2;
                                blurButton3.setText(Emoji.replaceEmoji(blurButton3.getText(), this.applyButton2.text.getFontMetricsInt(), false));
                            } catch (Exception unused) {
                            }
                            final int i37 = 4;
                            this.applyButton2.setOnClickListener(new View.OnClickListener(this) {
                                public final ThemePreviewActivity f$0;

                                {
                                    this.f$0 = this;
                                }

                                @Override
                                public final void onClick(View view) {
                                    switch (i37) {
                                        case 0:
                                            this.f$0.cancelThemeApply(false);
                                            break;
                                        case 1:
                                            this.f$0.lambda$createView$18$1$2();
                                            break;
                                        case 2:
                                            this.f$0.dropDownContainer.toggleSubMenu(null, null);
                                            break;
                                        case 3:
                                            this.f$0.applyWallpaperBackground(false);
                                            break;
                                        default:
                                            this.f$0.applyWallpaperBackground(true);
                                            break;
                                    }
                                }
                            });
                            this.bottomOverlayChat.addView(this.applyButton1, LayoutHelper.createFrame(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 58.0f));
                            this.bottomOverlayChat.addView(this.applyButton2, LayoutHelper.createFrame(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                        }
                        if (this.shouldShowBrightnessControll) {
                            AnonymousClass14 anonymousClass15 = new AnonymousClass14(this, (Activity) getContext());
                            this.dimmingSliderContainer = anonymousClass15;
                            anonymousClass15.setPadding(AndroidUtilities.dp(f), AndroidUtilities.dp(f), AndroidUtilities.dp(f), AndroidUtilities.dp(f));
                            this.page2.addView(this.dimmingSliderContainer, LayoutHelper.createFrame(222, 76, 49));
                            ?? r5 = new SliderView((Activity) getContext()) {
                                @Override
                                public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                                    if (getParent() != null) {
                                        getParent().requestDisallowInterceptTouchEvent(true);
                                    }
                                    return super.dispatchTouchEvent(motionEvent);
                                }
                            };
                            this.dimmingSlider = r5;
                            r5.setValue(this.dimAmount);
                            setMinMax();
                            setOnValueChange(new VoIPFragment$$ExternalSyntheticLambda7(this, 22));
                            this.dimmingSliderContainer.addView(this.dimmingSlider);
                            dayNightSwitchDelegate = this.onSwitchDayNightDelegate;
                            if (dayNightSwitchDelegate != null) {
                                AnonymousClass15 anonymousClass16 = this.dimmingSlider;
                                if (dayNightSwitchDelegate.isDark()) {
                                    i23 = 0;
                                } else {
                                    i23 = 8;
                                }
                                anonymousClass16.setVisibility(i23);
                                AnonymousClass15 anonymousClass17 = this.dimmingSlider;
                                if (this.onSwitchDayNightDelegate.isDark()) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                anonymousClass17.setAlpha(f10);
                                AnonymousClass15 anonymousClass18 = this.dimmingSlider;
                                if (this.onSwitchDayNightDelegate.isDark()) {
                                    f11 = this.dimAmount;
                                } else {
                                    f11 = 0.0f;
                                }
                                anonymousClass18.setValue(f11);
                            }
                        }
                    } else {
                        c = 2;
                    }
                    rect = new Rect();
                    Drawable drawableMutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                    this.sheetDrawable = drawableMutate;
                    drawableMutate.getPadding(rect);
                    this.sheetDrawable.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_windowBackgroundWhite), PorterDuff.Mode.MULTIPLY));
                    textPaint = new TextPaint(1);
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    textPaint.setTypeface(AndroidUtilities.bold());
                    obj = this.currentWallpaper;
                    if (i34 != 1 || (obj instanceof WallpapersListActivity.ColorWallpaper)) {
                        if ((obj instanceof WallpapersListActivity.ColorWallpaper) || !"d".equals(((WallpapersListActivity.ColorWallpaper) obj).slug)) {
                            i4 = 3;
                        } else {
                            i4 = 0;
                        }
                    } else if ((obj instanceof WallpapersListActivity.FileWallpaper) && "t".equals(((WallpapersListActivity.FileWallpaper) obj).slug)) {
                        i4 = 0;
                    } else {
                        i4 = 2;
                    }
                    strArr = new String[i4];
                    iArr = new int[i4];
                    this.backgroundCheckBoxView = new WallpaperCheckBoxView[i4];
                    if (i4 != 0) {
                        this.backgroundButtonsContainer = new FrameLayout(context);
                        if (i34 != 1 || (this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper)) {
                            strArr[0] = LocaleController.getString(R.string.BackgroundColors);
                            strArr[1] = LocaleController.getString(R.string.BackgroundPattern);
                            strArr[c] = LocaleController.getString(R.string.BackgroundMotion);
                        } else {
                            strArr[0] = LocaleController.getString(R.string.BackgroundBlurred);
                            strArr[1] = LocaleController.getString(R.string.BackgroundMotion);
                        }
                        iMax2 = 0;
                        i20 = 0;
                        while (i20 < i4) {
                            int iCeil = (int) Math.ceil(textPaint.measureText(strArr[i20]));
                            iArr[i20] = iCeil;
                            iMax2 = Math.max(iMax2, iCeil);
                            i20++;
                            themeInfo2 = themeInfo2;
                        }
                        themeInfo = themeInfo2;
                        ?? r3 = new FrameLayout(context, this, i33) {
                            public final int $r8$classId;
                            public final RectF rect;
                            public final ThemePreviewActivity this$0;

                            {
                                super(context);
                                this.$r8$classId = i33;
                                switch (i33) {
                                    case 1:
                                        this.this$0 = this;
                                        super(context);
                                        this.rect = new RectF();
                                        break;
                                    default:
                                        this.this$0 = this;
                                        this.rect = new RectF();
                                        break;
                                }
                            }

                            @Override
                            public final void onDraw(Canvas canvas) {
                                switch (this.$r8$classId) {
                                    case 0:
                                        RectF rectF = this.rect;
                                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                                        ThemePreviewActivity themePreviewActivity = this.this$0;
                                        Theme.applyServiceShaderMatrixForView(themePreviewActivity.backgroundPlayAnimationView, themePreviewActivity.backgroundImage, themePreviewActivity.themeDelegate);
                                        canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity.themeDelegate.getPaint("paintChatActionBackground"));
                                        if (Theme.hasGradientService()) {
                                            canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity.themeDelegate.getPaint("paintChatActionBackgroundDarken"));
                                        }
                                        break;
                                    default:
                                        RectF rectF2 = this.rect;
                                        rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                                        ThemePreviewActivity themePreviewActivity2 = this.this$0;
                                        Theme.applyServiceShaderMatrixForView(themePreviewActivity2.messagesPlayAnimationView, themePreviewActivity2.backgroundImage, themePreviewActivity2.themeDelegate);
                                        canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity2.themeDelegate.getPaint("paintChatActionBackground"));
                                        if (Theme.hasGradientService()) {
                                            canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity2.themeDelegate.getPaint("paintChatActionBackgroundDarken"));
                                        }
                                        break;
                                }
                            }
                        };
                        this.backgroundPlayAnimationView = r3;
                        r3.setWillNotDraw(false);
                        AnonymousClass16 anonymousClass19 = this.backgroundPlayAnimationView;
                        if (this.backgroundGradientColor1 != 0) {
                            i21 = 0;
                        } else {
                            i21 = 4;
                        }
                        anonymousClass19.setVisibility(i21);
                        AnonymousClass16 anonymousClass110 = this.backgroundPlayAnimationView;
                        if (this.backgroundGradientColor1 != 0) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.1f;
                        }
                        anonymousClass110.setScaleX(f7);
                        AnonymousClass16 anonymousClass111 = this.backgroundPlayAnimationView;
                        if (this.backgroundGradientColor1 != 0) {
                            f8 = 1.0f;
                        } else {
                            f8 = 0.1f;
                        }
                        anonymousClass111.setScaleY(f8);
                        AnonymousClass16 anonymousClass112 = this.backgroundPlayAnimationView;
                        if (this.backgroundGradientColor1 != 0) {
                            f9 = 1.0f;
                        } else {
                            f9 = 0.0f;
                        }
                        anonymousClass112.setAlpha(f9);
                        AnonymousClass16 anonymousClass113 = this.backgroundPlayAnimationView;
                        if (this.backgroundGradientColor1 != 0) {
                            obj2 = 1;
                        } else {
                            obj2 = null;
                        }
                        anonymousClass113.setTag(obj2);
                        this.backgroundButtonsContainer.addView(this.backgroundPlayAnimationView, LayoutHelper.createFrame(48, 48, 17));
                        setOnClickListener(new View.OnClickListener(this) {
                            public int rotation = 0;
                            public final ThemePreviewActivity this$0;

                            {
                                this.this$0 = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (i33) {
                                    case 0:
                                        ThemePreviewActivity themePreviewActivity = this.this$0;
                                        themePreviewActivity.backgroundPlayAnimationImageView.setRotation(this.rotation);
                                        this.rotation -= 45;
                                        themePreviewActivity.backgroundPlayAnimationImageView.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
                                        BackgroundView[] backgroundViewArr2 = themePreviewActivity.backgroundImages;
                                        BackgroundView backgroundView3 = backgroundViewArr2[0];
                                        if (backgroundView3 != null) {
                                            Drawable background = backgroundView3.getBackground();
                                            if (background instanceof MotionBackgroundDrawable) {
                                                ((MotionBackgroundDrawable) background).switchToNextPosition(false);
                                            } else if (themePreviewActivity.screenType == 2) {
                                                themePreviewActivity.backgroundRotation += 45;
                                                while (true) {
                                                    int i38 = themePreviewActivity.backgroundRotation;
                                                    if (i38 >= 360) {
                                                        themePreviewActivity.backgroundRotation = i38 - 360;
                                                    } else {
                                                        themePreviewActivity.setBackgroundColor(themePreviewActivity.backgroundColor, 0, true);
                                                    }
                                                }
                                            } else {
                                                Theme.ThemeAccent themeAccent2 = themePreviewActivity.accent;
                                                if (themeAccent2 != null) {
                                                    themeAccent2.backgroundRotation += 45;
                                                    while (true) {
                                                        int i39 = themeAccent2.backgroundRotation;
                                                        if (i39 >= 360) {
                                                            themeAccent2.backgroundRotation = i39 - 360;
                                                        } else {
                                                            Theme.refreshThemeColors(false, false);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        BackgroundView backgroundView4 = backgroundViewArr2[1];
                                        if (backgroundView4 != null) {
                                            Drawable background2 = backgroundView4.getBackground();
                                            if (background2 instanceof MotionBackgroundDrawable) {
                                                ((MotionBackgroundDrawable) background2).switchToNextPosition(false);
                                            }
                                        }
                                        break;
                                    default:
                                        ThemePreviewActivity themePreviewActivity2 = this.this$0;
                                        themePreviewActivity2.messagesPlayAnimationImageView.setRotation(this.rotation);
                                        this.rotation -= 45;
                                        themePreviewActivity2.messagesPlayAnimationImageView.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
                                        Theme.ThemeAccent themeAccent3 = themePreviewActivity2.accent;
                                        if (!themeAccent3.myMessagesAnimated) {
                                            int i40 = themeAccent3.myMessagesGradientAccentColor3;
                                            if (i40 != 0) {
                                                int i41 = themeAccent3.myMessagesAccentColor;
                                                if (i41 == 0) {
                                                    i41 = themeAccent3.accentColor;
                                                }
                                                themeAccent3.myMessagesAccentColor = themeAccent3.myMessagesGradientAccentColor1;
                                                themeAccent3.myMessagesGradientAccentColor1 = themeAccent3.myMessagesGradientAccentColor2;
                                                themeAccent3.myMessagesGradientAccentColor2 = i40;
                                                themeAccent3.myMessagesGradientAccentColor3 = i41;
                                            } else {
                                                int i42 = themeAccent3.myMessagesAccentColor;
                                                if (i42 == 0) {
                                                    i42 = themeAccent3.accentColor;
                                                }
                                                themeAccent3.myMessagesAccentColor = themeAccent3.myMessagesGradientAccentColor1;
                                                themeAccent3.myMessagesGradientAccentColor1 = themeAccent3.myMessagesGradientAccentColor2;
                                                themeAccent3.myMessagesGradientAccentColor2 = i42;
                                            }
                                            themePreviewActivity2.colorPicker.setColor(themeAccent3.myMessagesGradientAccentColor3, 3);
                                            themePreviewActivity2.colorPicker.setColor(themePreviewActivity2.accent.myMessagesGradientAccentColor2, 2);
                                            themePreviewActivity2.colorPicker.setColor(themePreviewActivity2.accent.myMessagesGradientAccentColor1, 1);
                                            ColorPicker colorPicker = themePreviewActivity2.colorPicker;
                                            Theme.ThemeAccent themeAccent4 = themePreviewActivity2.accent;
                                            int i43 = themeAccent4.myMessagesAccentColor;
                                            if (i43 == 0) {
                                                i43 = themeAccent4.accentColor;
                                            }
                                            colorPicker.setColor(i43, 0);
                                            themePreviewActivity2.messagesCheckBoxView[1].setColor(0, themePreviewActivity2.accent.myMessagesAccentColor);
                                            themePreviewActivity2.messagesCheckBoxView[1].setColor(1, themePreviewActivity2.accent.myMessagesGradientAccentColor1);
                                            themePreviewActivity2.messagesCheckBoxView[1].setColor(2, themePreviewActivity2.accent.myMessagesGradientAccentColor2);
                                            themePreviewActivity2.messagesCheckBoxView[1].setColor(3, themePreviewActivity2.accent.myMessagesGradientAccentColor3);
                                            Theme.refreshThemeColors(true, true);
                                            themePreviewActivity2.listView2.invalidateViews();
                                        } else if (themePreviewActivity2.msgOutDrawable.getMotionBackgroundDrawable() != null) {
                                            themePreviewActivity2.msgOutDrawable.getMotionBackgroundDrawable().switchToNextPosition(false);
                                        }
                                        break;
                                }
                            }
                        });
                        ImageView imageView = new ImageView(context);
                        this.backgroundPlayAnimationImageView = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.backgroundPlayAnimationImageView.setImageResource(R.drawable.bg_rotate_large);
                        addView(this.backgroundPlayAnimationImageView, LayoutHelper.createFrame(-2, -2, 17));
                        i5 = iMax2;
                    } else {
                        themeInfo = themeInfo2;
                        i5 = 0;
                    }
                    i6 = 0;
                    while (true) {
                        anonymousClass1 = this.themeDelegate;
                        if (i6 >= i4) {
                            break;
                        }
                        this.backgroundCheckBoxView[i6] = new WallpaperCheckBoxView(context, (i34 == 1 && !(this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper)) || i6 != 0, this.backgroundImage, anonymousClass1);
                        this.backgroundCheckBoxView[i6].setBackgroundColor(this.backgroundColor);
                        wallpaperCheckBoxView2 = this.backgroundCheckBoxView[i6];
                        String str = strArr[i6];
                        int i38 = iArr[i6];
                        wallpaperCheckBoxView2.currentText = str;
                        wallpaperCheckBoxView2.currentTextSize = i38;
                        wallpaperCheckBoxView2.maxTextSize = i5;
                        i19 = 1;
                        if (i34 == 1) {
                            if (i6 == i19) {
                                if (this.selectedPattern == null || !(themeAccent == null || TextUtils.isEmpty(themeAccent.patternSlug))) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                wallpaperCheckBoxView2.setChecked(z3, false);
                            } else if (i6 == 2) {
                                wallpaperCheckBoxView2.setChecked(this.isMotion, false);
                            }
                        } else if (this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) {
                            i19 = 1;
                            if (i6 == i19) {
                                if (this.selectedPattern == null) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                wallpaperCheckBoxView2.setChecked(z3, false);
                            } else if (i6 == 2) {
                                wallpaperCheckBoxView2.setChecked(this.isMotion, false);
                            }
                        } else {
                            if (i6 == 0) {
                                z4 = this.isBlurred;
                            } else {
                                z4 = this.isMotion;
                            }
                            wallpaperCheckBoxView2.setChecked(z4, false);
                        }
                        iDp3 = AndroidUtilities.dp(56.0f) + i5;
                        layoutParams2 = new FrameLayout.LayoutParams(iDp3, -2);
                        layoutParams2.gravity = 17;
                        if (i4 == 3) {
                            if (i6 != 0 || i6 == 2) {
                                layoutParams2.leftMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                            } else {
                                layoutParams2.rightMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                            }
                        } else if (i6 == 1) {
                            layoutParams2.leftMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                        } else {
                            layoutParams2.rightMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                        }
                        this.backgroundButtonsContainer.addView(this.backgroundCheckBoxView[i6], layoutParams2);
                        final WallpaperCheckBoxView wallpaperCheckBoxView3 = this.backgroundCheckBoxView[i6];
                        final int i39 = 1;
                        wallpaperCheckBoxView3.setOnClickListener(new View.OnClickListener(this) {
                            public final ThemePreviewActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (i39) {
                                    case 0:
                                        ThemePreviewActivity themePreviewActivity = this.f$0;
                                        if (themePreviewActivity.messagesButtonsContainer.getAlpha() == 1.0f && i6 == 0) {
                                            WallpaperCheckBoxView wallpaperCheckBoxView4 = wallpaperCheckBoxView3;
                                            wallpaperCheckBoxView4.setChecked(!wallpaperCheckBoxView4.isChecked, true);
                                            themePreviewActivity.accent.myMessagesAnimated = wallpaperCheckBoxView4.isChecked;
                                            Theme.refreshThemeColors(true, true);
                                            themePreviewActivity.listView2.invalidateViews();
                                        }
                                        break;
                                    default:
                                        ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                        if (themePreviewActivity2.backgroundButtonsContainer.getAlpha() == 1.0f && themePreviewActivity2.patternViewAnimation == null) {
                                            int i40 = i6;
                                            WallpaperCheckBoxView wallpaperCheckBoxView5 = wallpaperCheckBoxView3;
                                            int i41 = themePreviewActivity2.screenType;
                                            if ((i41 == 1 || (themePreviewActivity2.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper)) && i40 == 2) {
                                                wallpaperCheckBoxView5.setChecked(!wallpaperCheckBoxView5.isChecked, true);
                                                boolean z8 = wallpaperCheckBoxView5.isChecked;
                                                themePreviewActivity2.isMotion = z8;
                                                themePreviewActivity2.parallaxEffect.setEnabled(z8);
                                                themePreviewActivity2.animateMotionChange();
                                            } else {
                                                FrameLayout[] frameLayoutArr2 = themePreviewActivity2.patternLayout;
                                                if (i40 == 1 && (i41 == 1 || (themePreviewActivity2.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper))) {
                                                    if (themePreviewActivity2.backgroundCheckBoxView[1].isChecked) {
                                                        themePreviewActivity2.lastSelectedPattern = themePreviewActivity2.selectedPattern;
                                                        themePreviewActivity2.backgroundImage.setImageDrawable(null);
                                                        themePreviewActivity2.selectedPattern = null;
                                                        themePreviewActivity2.isMotion = false;
                                                        themePreviewActivity2.updateButtonState$1$1();
                                                        themePreviewActivity2.animateMotionChange();
                                                        if (frameLayoutArr2[1].getVisibility() == 0) {
                                                            if (i41 == 1) {
                                                                themePreviewActivity2.showPatternsView(0, true);
                                                            } else {
                                                                themePreviewActivity2.showPatternsView(i40, frameLayoutArr2[i40].getVisibility() != 0);
                                                            }
                                                        }
                                                    } else {
                                                        themePreviewActivity2.selectPattern(themePreviewActivity2.lastSelectedPattern != null ? -1 : 0);
                                                        if (i41 == 1) {
                                                            themePreviewActivity2.showPatternsView(1, true);
                                                        } else {
                                                            themePreviewActivity2.showPatternsView(i40, frameLayoutArr2[i40].getVisibility() != 0);
                                                        }
                                                    }
                                                    themePreviewActivity2.backgroundCheckBoxView[1].setChecked(themePreviewActivity2.selectedPattern != null, true);
                                                    themePreviewActivity2.updateSelectedPattern();
                                                    themePreviewActivity2.patternsListView.invalidateViews();
                                                    themePreviewActivity2.updateMotionButton();
                                                } else if (themePreviewActivity2.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) {
                                                    themePreviewActivity2.showPatternsView(i40, frameLayoutArr2[i40].getVisibility() != 0);
                                                } else if (i41 != 1) {
                                                    wallpaperCheckBoxView5.setChecked(!wallpaperCheckBoxView5.isChecked, true);
                                                    if (i40 != 0) {
                                                        boolean z9 = wallpaperCheckBoxView5.isChecked;
                                                        themePreviewActivity2.isMotion = z9;
                                                        themePreviewActivity2.parallaxEffect.setEnabled(z9);
                                                        themePreviewActivity2.animateMotionChange();
                                                    } else {
                                                        boolean z10 = wallpaperCheckBoxView5.isChecked;
                                                        themePreviewActivity2.isBlurred = z10;
                                                        if (z10) {
                                                            themePreviewActivity2.backgroundImage.getImageReceiver().setForceCrossfade(true);
                                                        }
                                                        themePreviewActivity2.updateBlurred();
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        if (i6 == 2) {
                            this.backgroundCheckBoxView[i6].setAlpha(0.0f);
                            this.backgroundCheckBoxView[i6].setVisibility(4);
                        }
                        i6++;
                    }
                    i7 = 1;
                    if (i34 == 1) {
                        iArr2 = new int[2];
                        this.messagesCheckBoxView = new WallpaperCheckBoxView[2];
                        this.messagesButtonsContainer = new FrameLayout(context);
                        strArr2 = new String[]{LocaleController.getString(R.string.BackgroundAnimate), LocaleController.getString(R.string.BackgroundColors)};
                        i16 = 0;
                        iMax = 0;
                        for (i15 = 2; i16 < i15; i15 = 2) {
                            int[] iArr4 = iArr2;
                            int iCeil2 = (int) Math.ceil(textPaint.measureText(strArr2[i16]));
                            iArr4[i16] = iCeil2;
                            iMax = Math.max(iMax, iCeil2);
                            i16++;
                            iArr2 = iArr4;
                        }
                        iArr3 = iArr2;
                        i7 = 1;
                        if (themeAccent != null) {
                            ?? r2 = new FrameLayout(context, this, i7) {
                                public final int $r8$classId;
                                public final RectF rect;
                                public final ThemePreviewActivity this$0;

                                {
                                    super(context);
                                    this.$r8$classId = i7;
                                    switch (i7) {
                                        case 1:
                                            this.this$0 = this;
                                            super(context);
                                            this.rect = new RectF();
                                            break;
                                        default:
                                            this.this$0 = this;
                                            this.rect = new RectF();
                                            break;
                                    }
                                }

                                @Override
                                public final void onDraw(Canvas canvas) {
                                    switch (this.$r8$classId) {
                                        case 0:
                                            RectF rectF = this.rect;
                                            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                                            ThemePreviewActivity themePreviewActivity = this.this$0;
                                            Theme.applyServiceShaderMatrixForView(themePreviewActivity.backgroundPlayAnimationView, themePreviewActivity.backgroundImage, themePreviewActivity.themeDelegate);
                                            canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity.themeDelegate.getPaint("paintChatActionBackground"));
                                            if (Theme.hasGradientService()) {
                                                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity.themeDelegate.getPaint("paintChatActionBackgroundDarken"));
                                            }
                                            break;
                                        default:
                                            RectF rectF2 = this.rect;
                                            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                                            ThemePreviewActivity themePreviewActivity2 = this.this$0;
                                            Theme.applyServiceShaderMatrixForView(themePreviewActivity2.messagesPlayAnimationView, themePreviewActivity2.backgroundImage, themePreviewActivity2.themeDelegate);
                                            canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity2.themeDelegate.getPaint("paintChatActionBackground"));
                                            if (Theme.hasGradientService()) {
                                                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity2.themeDelegate.getPaint("paintChatActionBackgroundDarken"));
                                            }
                                            break;
                                    }
                                }
                            };
                            this.messagesPlayAnimationView = r2;
                            r2.setWillNotDraw(false);
                            AnonymousClass16 anonymousClass114 = this.messagesPlayAnimationView;
                            if (themeAccent.myMessagesGradientAccentColor1 != 0) {
                                i17 = 0;
                            } else {
                                i17 = 4;
                            }
                            anonymousClass114.setVisibility(i17);
                            AnonymousClass16 anonymousClass115 = this.messagesPlayAnimationView;
                            if (themeAccent.myMessagesGradientAccentColor1 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = 0.1f;
                            }
                            anonymousClass115.setScaleX(f4);
                            AnonymousClass16 anonymousClass116 = this.messagesPlayAnimationView;
                            if (themeAccent.myMessagesGradientAccentColor1 != 0) {
                                f5 = 1.0f;
                            } else {
                                f5 = 0.1f;
                            }
                            anonymousClass116.setScaleY(f5);
                            AnonymousClass16 anonymousClass117 = this.messagesPlayAnimationView;
                            if (themeAccent.myMessagesGradientAccentColor1 != 0) {
                                f6 = 1.0f;
                            } else {
                                f6 = 0.0f;
                            }
                            anonymousClass117.setAlpha(f6);
                            this.messagesButtonsContainer.addView(this.messagesPlayAnimationView, LayoutHelper.createFrame(48, 48, 17));
                            final int i40 = 1;
                            setOnClickListener(new View.OnClickListener(this) {
                                public int rotation = 0;
                                public final ThemePreviewActivity this$0;

                                {
                                    this.this$0 = this;
                                }

                                @Override
                                public final void onClick(View view) {
                                    switch (i40) {
                                        case 0:
                                            ThemePreviewActivity themePreviewActivity = this.this$0;
                                            themePreviewActivity.backgroundPlayAnimationImageView.setRotation(this.rotation);
                                            this.rotation -= 45;
                                            themePreviewActivity.backgroundPlayAnimationImageView.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
                                            BackgroundView[] backgroundViewArr2 = themePreviewActivity.backgroundImages;
                                            BackgroundView backgroundView3 = backgroundViewArr2[0];
                                            if (backgroundView3 != null) {
                                                Drawable background = backgroundView3.getBackground();
                                                if (background instanceof MotionBackgroundDrawable) {
                                                    ((MotionBackgroundDrawable) background).switchToNextPosition(false);
                                                } else if (themePreviewActivity.screenType == 2) {
                                                    themePreviewActivity.backgroundRotation += 45;
                                                    while (true) {
                                                        int i310 = themePreviewActivity.backgroundRotation;
                                                        if (i310 >= 360) {
                                                            themePreviewActivity.backgroundRotation = i310 - 360;
                                                        } else {
                                                            themePreviewActivity.setBackgroundColor(themePreviewActivity.backgroundColor, 0, true);
                                                        }
                                                    }
                                                } else {
                                                    Theme.ThemeAccent themeAccent2 = themePreviewActivity.accent;
                                                    if (themeAccent2 != null) {
                                                        themeAccent2.backgroundRotation += 45;
                                                        while (true) {
                                                            int i311 = themeAccent2.backgroundRotation;
                                                            if (i311 >= 360) {
                                                                themeAccent2.backgroundRotation = i311 - 360;
                                                            } else {
                                                                Theme.refreshThemeColors(false, false);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            BackgroundView backgroundView4 = backgroundViewArr2[1];
                                            if (backgroundView4 != null) {
                                                Drawable background2 = backgroundView4.getBackground();
                                                if (background2 instanceof MotionBackgroundDrawable) {
                                                    ((MotionBackgroundDrawable) background2).switchToNextPosition(false);
                                                }
                                            }
                                            break;
                                        default:
                                            ThemePreviewActivity themePreviewActivity2 = this.this$0;
                                            themePreviewActivity2.messagesPlayAnimationImageView.setRotation(this.rotation);
                                            this.rotation -= 45;
                                            themePreviewActivity2.messagesPlayAnimationImageView.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
                                            Theme.ThemeAccent themeAccent3 = themePreviewActivity2.accent;
                                            if (!themeAccent3.myMessagesAnimated) {
                                                int i41 = themeAccent3.myMessagesGradientAccentColor3;
                                                if (i41 != 0) {
                                                    int i42 = themeAccent3.myMessagesAccentColor;
                                                    if (i42 == 0) {
                                                        i42 = themeAccent3.accentColor;
                                                    }
                                                    themeAccent3.myMessagesAccentColor = themeAccent3.myMessagesGradientAccentColor1;
                                                    themeAccent3.myMessagesGradientAccentColor1 = themeAccent3.myMessagesGradientAccentColor2;
                                                    themeAccent3.myMessagesGradientAccentColor2 = i41;
                                                    themeAccent3.myMessagesGradientAccentColor3 = i42;
                                                } else {
                                                    int i43 = themeAccent3.myMessagesAccentColor;
                                                    if (i43 == 0) {
                                                        i43 = themeAccent3.accentColor;
                                                    }
                                                    themeAccent3.myMessagesAccentColor = themeAccent3.myMessagesGradientAccentColor1;
                                                    themeAccent3.myMessagesGradientAccentColor1 = themeAccent3.myMessagesGradientAccentColor2;
                                                    themeAccent3.myMessagesGradientAccentColor2 = i43;
                                                }
                                                themePreviewActivity2.colorPicker.setColor(themeAccent3.myMessagesGradientAccentColor3, 3);
                                                themePreviewActivity2.colorPicker.setColor(themePreviewActivity2.accent.myMessagesGradientAccentColor2, 2);
                                                themePreviewActivity2.colorPicker.setColor(themePreviewActivity2.accent.myMessagesGradientAccentColor1, 1);
                                                ColorPicker colorPicker = themePreviewActivity2.colorPicker;
                                                Theme.ThemeAccent themeAccent4 = themePreviewActivity2.accent;
                                                int i44 = themeAccent4.myMessagesAccentColor;
                                                if (i44 == 0) {
                                                    i44 = themeAccent4.accentColor;
                                                }
                                                colorPicker.setColor(i44, 0);
                                                themePreviewActivity2.messagesCheckBoxView[1].setColor(0, themePreviewActivity2.accent.myMessagesAccentColor);
                                                themePreviewActivity2.messagesCheckBoxView[1].setColor(1, themePreviewActivity2.accent.myMessagesGradientAccentColor1);
                                                themePreviewActivity2.messagesCheckBoxView[1].setColor(2, themePreviewActivity2.accent.myMessagesGradientAccentColor2);
                                                themePreviewActivity2.messagesCheckBoxView[1].setColor(3, themePreviewActivity2.accent.myMessagesGradientAccentColor3);
                                                Theme.refreshThemeColors(true, true);
                                                themePreviewActivity2.listView2.invalidateViews();
                                            } else if (themePreviewActivity2.msgOutDrawable.getMotionBackgroundDrawable() != null) {
                                                themePreviewActivity2.msgOutDrawable.getMotionBackgroundDrawable().switchToNextPosition(false);
                                            }
                                            break;
                                    }
                                }
                            });
                            ImageView imageView2 = new ImageView(context);
                            this.messagesPlayAnimationImageView = imageView2;
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            this.messagesPlayAnimationImageView.setImageResource(R.drawable.bg_rotate_large);
                            addView(this.messagesPlayAnimationImageView, LayoutHelper.createFrame(-2, -2, 17));
                            for (i18 = 0; i18 < 2; i18++) {
                                WallpaperCheckBoxView[] wallpaperCheckBoxViewArr = this.messagesCheckBoxView;
                                if (i18 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                wallpaperCheckBoxViewArr[i18] = new WallpaperCheckBoxView(context, z2, this.backgroundImage, anonymousClass1);
                                wallpaperCheckBoxView = this.messagesCheckBoxView[i18];
                                String str2 = strArr2[i18];
                                int i41 = iArr3[i18];
                                wallpaperCheckBoxView.currentText = str2;
                                wallpaperCheckBoxView.currentTextSize = i41;
                                wallpaperCheckBoxView.maxTextSize = iMax;
                                if (i18 == 0) {
                                    wallpaperCheckBoxView.setChecked(themeAccent.myMessagesAnimated, false);
                                }
                                iDp2 = AndroidUtilities.dp(56.0f) + iMax;
                                layoutParams = new FrameLayout.LayoutParams(iDp2, -2);
                                layoutParams.gravity = 17;
                                if (i18 == 1) {
                                    layoutParams.leftMargin = AndroidUtilities.dp(10.0f) + (iDp2 / 2);
                                } else {
                                    layoutParams.rightMargin = AndroidUtilities.dp(10.0f) + (iDp2 / 2);
                                }
                                this.messagesButtonsContainer.addView(this.messagesCheckBoxView[i18], layoutParams);
                                final WallpaperCheckBoxView wallpaperCheckBoxView4 = this.messagesCheckBoxView[i18];
                                final int i42 = 0;
                                wallpaperCheckBoxView4.setOnClickListener(new View.OnClickListener(this) {
                                    public final ThemePreviewActivity f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (i42) {
                                            case 0:
                                                ThemePreviewActivity themePreviewActivity = this.f$0;
                                                if (themePreviewActivity.messagesButtonsContainer.getAlpha() == 1.0f && i18 == 0) {
                                                    WallpaperCheckBoxView wallpaperCheckBoxView5 = wallpaperCheckBoxView4;
                                                    wallpaperCheckBoxView5.setChecked(!wallpaperCheckBoxView5.isChecked, true);
                                                    themePreviewActivity.accent.myMessagesAnimated = wallpaperCheckBoxView5.isChecked;
                                                    Theme.refreshThemeColors(true, true);
                                                    themePreviewActivity.listView2.invalidateViews();
                                                }
                                                break;
                                            default:
                                                ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                                if (themePreviewActivity2.backgroundButtonsContainer.getAlpha() == 1.0f && themePreviewActivity2.patternViewAnimation == null) {
                                                    int i43 = i18;
                                                    WallpaperCheckBoxView wallpaperCheckBoxView6 = wallpaperCheckBoxView4;
                                                    int i44 = themePreviewActivity2.screenType;
                                                    if ((i44 == 1 || (themePreviewActivity2.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper)) && i43 == 2) {
                                                        wallpaperCheckBoxView6.setChecked(!wallpaperCheckBoxView6.isChecked, true);
                                                        boolean z8 = wallpaperCheckBoxView6.isChecked;
                                                        themePreviewActivity2.isMotion = z8;
                                                        themePreviewActivity2.parallaxEffect.setEnabled(z8);
                                                        themePreviewActivity2.animateMotionChange();
                                                    } else {
                                                        FrameLayout[] frameLayoutArr2 = themePreviewActivity2.patternLayout;
                                                        if (i43 == 1 && (i44 == 1 || (themePreviewActivity2.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper))) {
                                                            if (themePreviewActivity2.backgroundCheckBoxView[1].isChecked) {
                                                                themePreviewActivity2.lastSelectedPattern = themePreviewActivity2.selectedPattern;
                                                                themePreviewActivity2.backgroundImage.setImageDrawable(null);
                                                                themePreviewActivity2.selectedPattern = null;
                                                                themePreviewActivity2.isMotion = false;
                                                                themePreviewActivity2.updateButtonState$1$1();
                                                                themePreviewActivity2.animateMotionChange();
                                                                if (frameLayoutArr2[1].getVisibility() == 0) {
                                                                    if (i44 == 1) {
                                                                        themePreviewActivity2.showPatternsView(0, true);
                                                                    } else {
                                                                        themePreviewActivity2.showPatternsView(i43, frameLayoutArr2[i43].getVisibility() != 0);
                                                                    }
                                                                }
                                                            } else {
                                                                themePreviewActivity2.selectPattern(themePreviewActivity2.lastSelectedPattern != null ? -1 : 0);
                                                                if (i44 == 1) {
                                                                    themePreviewActivity2.showPatternsView(1, true);
                                                                } else {
                                                                    themePreviewActivity2.showPatternsView(i43, frameLayoutArr2[i43].getVisibility() != 0);
                                                                }
                                                            }
                                                            themePreviewActivity2.backgroundCheckBoxView[1].setChecked(themePreviewActivity2.selectedPattern != null, true);
                                                            themePreviewActivity2.updateSelectedPattern();
                                                            themePreviewActivity2.patternsListView.invalidateViews();
                                                            themePreviewActivity2.updateMotionButton();
                                                        } else if (themePreviewActivity2.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) {
                                                            themePreviewActivity2.showPatternsView(i43, frameLayoutArr2[i43].getVisibility() != 0);
                                                        } else if (i44 != 1) {
                                                            wallpaperCheckBoxView6.setChecked(!wallpaperCheckBoxView6.isChecked, true);
                                                            if (i43 != 0) {
                                                                boolean z9 = wallpaperCheckBoxView6.isChecked;
                                                                themePreviewActivity2.isMotion = z9;
                                                                themePreviewActivity2.parallaxEffect.setEnabled(z9);
                                                                themePreviewActivity2.animateMotionChange();
                                                            } else {
                                                                boolean z10 = wallpaperCheckBoxView6.isChecked;
                                                                themePreviewActivity2.isBlurred = z10;
                                                                if (z10) {
                                                                    themePreviewActivity2.backgroundImage.getImageReceiver().setForceCrossfade(true);
                                                                }
                                                                themePreviewActivity2.updateBlurred();
                                                            }
                                                        }
                                                    }
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                            i7 = 1;
                        }
                    }
                    if (i34 != i7 || (this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper)) {
                        this.isBlurred = false;
                        i8 = 0;
                        while (i8 < 2) {
                            frameLayout = new FrameLayout(context) {
                                @Override
                                public final void onDraw(Canvas canvas) {
                                    int i43 = i8;
                                    Rect rect2 = rect;
                                    ThemePreviewActivity themePreviewActivity = ThemePreviewActivity.this;
                                    if (i43 == 0) {
                                        themePreviewActivity.sheetDrawable.setBounds(themePreviewActivity.colorPicker.getLeft() - rect2.left, 0, themePreviewActivity.colorPicker.getRight() + rect2.right, getMeasuredHeight());
                                    } else {
                                        themePreviewActivity.sheetDrawable.setBounds(-rect2.left, 0, getMeasuredWidth() + rect2.right, getMeasuredHeight());
                                    }
                                    themePreviewActivity.sheetDrawable.draw(canvas);
                                }
                            };
                            frameLayoutArr = this.patternLayout;
                            frameLayoutArr[i8] = frameLayout;
                            if (i8 != 1 || i34 == 2) {
                                frameLayout.setVisibility(4);
                            }
                            frameLayoutArr[i8].setWillNotDraw(false);
                            if (i34 == 2) {
                                if (i8 == 0) {
                                    i13 = 321;
                                } else {
                                    i13 = 316;
                                }
                                layoutParamsCreateFrame = LayoutHelper.createFrame(-1, i13, 83);
                            } else {
                                if (i8 == 0) {
                                    i9 = 273;
                                } else {
                                    i9 = 316;
                                }
                                layoutParamsCreateFrame = LayoutHelper.createFrame(-1, i9, 83);
                            }
                            if (i8 == 0) {
                                f2 = i34 != 2 ? 273 : 321;
                            } else {
                                f2 = 316.0f;
                            }
                            layoutParamsCreateFrame.height = AndroidUtilities.dp(f2);
                            if (insideBottomSheet()) {
                                layoutParamsCreateFrame.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i8 == 0) {
                                Drawable drawable = this.sheetDrawable;
                                Rect rect2 = AndroidUtilities.rectTmp2;
                                drawable.getPadding(rect2);
                                layoutParamsCreateFrame.height = AndroidUtilities.dp(12.0f) + rect2.top + layoutParamsCreateFrame.height;
                            }
                            GLSurfaceView gLSurfaceView = frameLayoutArr[i8];
                            if (i8 == 0) {
                                iDp = AndroidUtilities.dp(12.0f) + rect.top;
                            } else {
                                iDp = 0;
                            }
                            if (insideBottomSheet()) {
                                i10 = AndroidUtilities.navigationBarHeight;
                            } else {
                                i10 = 0;
                            }
                            gLSurfaceView.setPadding(0, iDp, 0, i10);
                            this.page2.addView(frameLayoutArr[i8], layoutParamsCreateFrame);
                            r14 = 1;
                            if (i8 != 1 || i34 == 2) {
                                TextureViewContainer textureViewContainer = new TextureViewContainer(context, this, 1);
                                ViewGroup[] viewGroupArr = this.patternsButtonsContainer;
                                viewGroupArr[i8] = textureViewContainer;
                                textureViewContainer.setWillNotDraw(false);
                                viewGroupArr[i8].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                                viewGroupArr[i8].setClickable(true);
                                f3 = 21.0f;
                                frameLayoutArr[i8].addView(viewGroupArr[i8], LayoutHelper.createFrame(-1, 51, 80));
                                TextView textView = new TextView(context);
                                TextView[] textViewArr = this.patternsCancelButton;
                                textViewArr[i8] = textView;
                                textView.setTextSize(1, 15.0f);
                                textViewArr[i8].setTypeface(AndroidUtilities.bold());
                                TextView textView2 = textViewArr[i8];
                                int i43 = Theme.key_chat_fieldOverlayText;
                                textView2.setTextColor(getThemedColor(i43));
                                textViewArr[i8].setText(LocaleController.getString(R.string.Cancel));
                                textViewArr[i8].setGravity(17);
                                textViewArr[i8].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                                TextView textView3 = textViewArr[i8];
                                int i44 = Theme.key_listSelector;
                                textView3.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i44), 0));
                                viewGroupArr[i8].addView(textViewArr[i8], LayoutHelper.createFrame(-2, -1, 51));
                                final int i45 = 0;
                                textViewArr[i8].setOnClickListener(new View.OnClickListener(this) {
                                    public final ThemePreviewActivity f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (i45) {
                                            case 0:
                                                ThemePreviewActivity themePreviewActivity = this.f$0;
                                                if (themePreviewActivity.patternViewAnimation == null) {
                                                    int i46 = i8;
                                                    if (i46 == 0) {
                                                        themePreviewActivity.backgroundRotation = themePreviewActivity.previousBackgroundRotation;
                                                        themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor3, 3, true);
                                                        themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor2, 2, true);
                                                        themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor1, 1, true);
                                                        themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundColor, 0, true);
                                                    } else {
                                                        TLRPC.TL_wallPaper tL_wallPaper2 = themePreviewActivity.previousSelectedPattern;
                                                        themePreviewActivity.selectedPattern = tL_wallPaper2;
                                                        if (tL_wallPaper2 == null) {
                                                            themePreviewActivity.backgroundImage.setImageDrawable(null);
                                                        } else {
                                                            ThemePreviewActivity.BackgroundView backgroundView3 = themePreviewActivity.backgroundImage;
                                                            ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                            String str3 = themePreviewActivity.imageFilter;
                                                            TLRPC.TL_wallPaper tL_wallPaper3 = themePreviewActivity.selectedPattern;
                                                            backgroundView3.imageReceiver.setImage(forDocument, str3, null, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                            backgroundView3.onNewImageSet();
                                                        }
                                                        themePreviewActivity.backgroundCheckBoxView[1].setChecked(themePreviewActivity.selectedPattern != null, false);
                                                        float f13 = themePreviewActivity.previousIntensity;
                                                        themePreviewActivity.currentIntensity = f13;
                                                        themePreviewActivity.intensitySeekBar.setProgress(f13);
                                                        themePreviewActivity.backgroundImage.getImageReceiver().setAlpha(themePreviewActivity.currentIntensity);
                                                        themePreviewActivity.updateButtonState$1$1();
                                                        themePreviewActivity.updateSelectedPattern();
                                                    }
                                                    if (themePreviewActivity.screenType != 2) {
                                                        if (themePreviewActivity.selectedPattern == null) {
                                                            if (themePreviewActivity.isMotion) {
                                                                themePreviewActivity.isMotion = false;
                                                                themePreviewActivity.backgroundCheckBoxView[0].setChecked(false, true);
                                                                themePreviewActivity.animateMotionChange();
                                                            }
                                                            themePreviewActivity.updateMotionButton();
                                                        }
                                                        themePreviewActivity.showPatternsView(0, true);
                                                    } else {
                                                        themePreviewActivity.showPatternsView(i46, false);
                                                    }
                                                    break;
                                                }
                                                break;
                                            default:
                                                ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                                if (themePreviewActivity2.patternViewAnimation == null) {
                                                    if (themePreviewActivity2.screenType != 2) {
                                                        themePreviewActivity2.showPatternsView(0, true);
                                                    } else {
                                                        themePreviewActivity2.showPatternsView(i8, false);
                                                    }
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                TextView textView4 = new TextView(context);
                                TextView[] textViewArr2 = this.patternsSaveButton;
                                textViewArr2[i8] = textView4;
                                textView4.setTextSize(1, 15.0f);
                                textViewArr2[i8].setTypeface(AndroidUtilities.bold());
                                textViewArr2[i8].setTextColor(getThemedColor(i43));
                                textViewArr2[i8].setText(LocaleController.getString(R.string.ApplyTheme));
                                textViewArr2[i8].setGravity(17);
                                textViewArr2[i8].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                                textViewArr2[i8].setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i44), 0));
                                viewGroupArr[i8].addView(textViewArr2[i8], LayoutHelper.createFrame(-2, -1, 53));
                                TextView textView5 = textViewArr2[i8];
                                r14 = 1;
                                final char c2 = 1 == true ? 1 : 0;
                                textView5.setOnClickListener(new View.OnClickListener(this) {
                                    public final ThemePreviewActivity f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (c2) {
                                            case 0:
                                                ThemePreviewActivity themePreviewActivity = this.f$0;
                                                if (themePreviewActivity.patternViewAnimation == null) {
                                                    int i46 = i8;
                                                    if (i46 == 0) {
                                                        themePreviewActivity.backgroundRotation = themePreviewActivity.previousBackgroundRotation;
                                                        themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor3, 3, true);
                                                        themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor2, 2, true);
                                                        themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor1, 1, true);
                                                        themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundColor, 0, true);
                                                    } else {
                                                        TLRPC.TL_wallPaper tL_wallPaper2 = themePreviewActivity.previousSelectedPattern;
                                                        themePreviewActivity.selectedPattern = tL_wallPaper2;
                                                        if (tL_wallPaper2 == null) {
                                                            themePreviewActivity.backgroundImage.setImageDrawable(null);
                                                        } else {
                                                            ThemePreviewActivity.BackgroundView backgroundView3 = themePreviewActivity.backgroundImage;
                                                            ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                            String str3 = themePreviewActivity.imageFilter;
                                                            TLRPC.TL_wallPaper tL_wallPaper3 = themePreviewActivity.selectedPattern;
                                                            backgroundView3.imageReceiver.setImage(forDocument, str3, null, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                            backgroundView3.onNewImageSet();
                                                        }
                                                        themePreviewActivity.backgroundCheckBoxView[1].setChecked(themePreviewActivity.selectedPattern != null, false);
                                                        float f13 = themePreviewActivity.previousIntensity;
                                                        themePreviewActivity.currentIntensity = f13;
                                                        themePreviewActivity.intensitySeekBar.setProgress(f13);
                                                        themePreviewActivity.backgroundImage.getImageReceiver().setAlpha(themePreviewActivity.currentIntensity);
                                                        themePreviewActivity.updateButtonState$1$1();
                                                        themePreviewActivity.updateSelectedPattern();
                                                    }
                                                    if (themePreviewActivity.screenType != 2) {
                                                        if (themePreviewActivity.selectedPattern == null) {
                                                            if (themePreviewActivity.isMotion) {
                                                                themePreviewActivity.isMotion = false;
                                                                themePreviewActivity.backgroundCheckBoxView[0].setChecked(false, true);
                                                                themePreviewActivity.animateMotionChange();
                                                            }
                                                            themePreviewActivity.updateMotionButton();
                                                        }
                                                        themePreviewActivity.showPatternsView(0, true);
                                                    } else {
                                                        themePreviewActivity.showPatternsView(i46, false);
                                                    }
                                                    break;
                                                }
                                                break;
                                            default:
                                                ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                                if (themePreviewActivity2.patternViewAnimation == null) {
                                                    if (themePreviewActivity2.screenType != 2) {
                                                        themePreviewActivity2.showPatternsView(0, true);
                                                    } else {
                                                        themePreviewActivity2.showPatternsView(i8, false);
                                                    }
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                f3 = 21.0f;
                            }
                            if (i8 == r14) {
                                TextView textView6 = new TextView(context);
                                this.patternTitleView = textView6;
                                textView6.setLines(r14);
                                this.patternTitleView.setSingleLine(r14);
                                this.patternTitleView.setText(LocaleController.getString(R.string.BackgroundChoosePattern));
                                this.patternTitleView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                                this.patternTitleView.setTextSize(r14, 20.0f);
                                this.patternTitleView.setTypeface(AndroidUtilities.bold());
                                this.patternTitleView.setPadding(AndroidUtilities.dp(f3), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(f3), AndroidUtilities.dp(8.0f));
                                this.patternTitleView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                                this.patternTitleView.setGravity(16);
                                frameLayoutArr[i8].addView(this.patternTitleView, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                                MessageSeenView.AnonymousClass1 anonymousClass2 = new MessageSeenView.AnonymousClass1(context);
                                this.patternsListView = anonymousClass2;
                                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
                                this.patternsLayoutManager = linearLayoutManager;
                                anonymousClass2.setLayoutManager(linearLayoutManager);
                                MessageSeenView.AnonymousClass1 anonymousClass3 = this.patternsListView;
                                PatternsAdapter patternsAdapter = new PatternsAdapter(context, this);
                                this.patternsAdapter = patternsAdapter;
                                anonymousClass3.setAdapter(patternsAdapter);
                                this.patternsListView.addItemDecoration(new FiltersView.AnonymousClass2(9));
                                frameLayoutArr[i8].addView(this.patternsListView, LayoutHelper.createFrame(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                                this.patternsListView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 21));
                                HeaderCell headerCell = new HeaderCell(context);
                                this.intensityCell = headerCell;
                                headerCell.setText(LocaleController.getString(R.string.BackgroundIntensity));
                                frameLayoutArr[i8].addView(this.intensityCell, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                                MaxFileSizeCell.AnonymousClass1 anonymousClass5 = new MaxFileSizeCell.AnonymousClass1(context, (AnonymousClass1) getResourceProvider());
                                this.intensitySeekBar = anonymousClass5;
                                anonymousClass5.setProgress(this.currentIntensity);
                                this.intensitySeekBar.setReportChanges(true);
                                this.intensitySeekBar.setDelegate(new PhotoViewer.AnonymousClass18(this, 29));
                                frameLayoutArr[i8].addView(this.intensitySeekBar, LayoutHelper.createFrame(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                            } else {
                                ColorPicker colorPicker = new ColorPicker(context, this.editingTheme, new AnonymousClass26());
                                this.colorPicker = colorPicker;
                                colorPicker.setResourcesProvider(getResourceProvider());
                                if (i34 == 1) {
                                    frameLayoutArr[i8].addView(this.colorPicker, LayoutHelper.createFrame(-1, -1, 1));
                                    if (themeInfo.isDark()) {
                                        this.colorPicker.setMinBrightness(0.2f);
                                    } else {
                                        this.colorPicker.setMinBrightness(0.05f);
                                        this.colorPicker.setMaxBrightness(0.8f);
                                    }
                                    if (themeAccent != null) {
                                        if (themeAccent.accentColor2 != 0) {
                                            i11 = 2;
                                        } else {
                                            i11 = 1;
                                        }
                                        ColorPicker colorPicker2 = this.colorPicker;
                                        hasChanges(1);
                                        colorPicker2.setType(1, 2, i11, false);
                                        this.colorPicker.setColor(themeAccent.accentColor, 0);
                                        i12 = themeAccent.accentColor2;
                                        if (i12 != 0) {
                                            this.colorPicker.setColor(i12, 1);
                                        }
                                    }
                                } else {
                                    frameLayoutArr[i8].addView(this.colorPicker, LayoutHelper.createFrame(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                                }
                            }
                            i8++;
                            i34 = i34;
                        }
                    }
                    i14 = i34;
                    updateButtonState$1$1();
                    if (!this.backgroundImage.getImageReceiver().hasBitmapImage()) {
                        this.page2.setBackgroundColor(-16777216);
                    }
                    if (i14 != 1 && !(this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper)) {
                        this.backgroundImage.getImageReceiver().setCrossfadeWithOldImage(true);
                    }
                } else {
                    i14 = i34;
                }
                setAdapter(this.messagesAdapter);
                TextureViewContainer textureViewContainer2 = new TextureViewContainer(context, this, 2);
                this.frameLayout = textureViewContainer2;
                textureViewContainer2.setWillNotDraw(false);
                TextureViewContainer textureViewContainer3 = this.frameLayout;
                this.fragmentView = textureViewContainer3;
                ViewTreeObserver viewTreeObserver = textureViewContainer3.getViewTreeObserver();
                LaunchActivity$$ExternalSyntheticLambda28 launchActivity$$ExternalSyntheticLambda28 = new LaunchActivity$$ExternalSyntheticLambda28(this, 3);
                this.onGlobalLayoutListener = launchActivity$$ExternalSyntheticLambda28;
                viewTreeObserver.addOnGlobalLayoutListener(launchActivity$$ExternalSyntheticLambda28);
                ViewPager viewPager = new ViewPager(context);
                this.viewPager = viewPager;
                viewPager.addOnPageChangeListener(new IntroActivity.AnonymousClass3(this, 5));
                this.viewPager.setAdapter(new AnonymousClass29(this, 0));
                AndroidUtilities.setViewPagerEdgeEffectColor(this.viewPager, getThemedColor(Theme.key_actionBarDefault));
                TextureViewContainer textureViewContainer4 = this.frameLayout;
                ViewPager viewPager2 = this.viewPager;
                if (i14 == 0) {
                    f12 = 48.0f;
                } else {
                    f12 = 0.0f;
                }
                textureViewContainer4.addView(viewPager2, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, f12));
                UndoView undoView = new UndoView(context, this);
                this.undoView = undoView;
                undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
                this.frameLayout.addView(this.undoView, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                if (i14 == 0) {
                    View view = new View(context);
                    view.setBackgroundColor(getThemedColor(Theme.key_dialogShadowLine));
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, 1, 83);
                    layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
                    this.frameLayout.addView(view, layoutParams3);
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    this.saveButtonsContainer = frameLayout2;
                    i25 = Theme.key_windowBackgroundWhite;
                    z5 = this.useDefaultThemeForButtons;
                    if (z5) {
                        themedColor = Theme.getDefaultColor(i25);
                    } else {
                        themedColor = getThemedColor(i25);
                    }
                    frameLayout2.setBackgroundColor(themedColor);
                    this.frameLayout.addView(this.saveButtonsContainer, LayoutHelper.createFrame(-1, 48, 83));
                    ChatActivity.AnonymousClass27 anonymousClass27 = new ChatActivity.AnonymousClass27(context, this);
                    this.dotsContainer = anonymousClass27;
                    this.saveButtonsContainer.addView(anonymousClass27, LayoutHelper.createFrame(22, 8, 17));
                    TextView textView7 = new TextView(context);
                    this.cancelButton = textView7;
                    textView7.setTextSize(1, 14.0f);
                    TextView textView8 = this.cancelButton;
                    i26 = Theme.key_chat_fieldOverlayText;
                    if (z5) {
                        themedColor2 = Theme.getDefaultColor(i26);
                    } else {
                        themedColor2 = getThemedColor(i26);
                    }
                    textView8.setTextColor(themedColor2);
                    this.cancelButton.setGravity(17);
                    this.cancelButton.setBackgroundDrawable(Theme.createSelectorDrawable(251658240, 0));
                    this.cancelButton.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
                    this.cancelButton.setText(LocaleController.getString(R.string.Cancel));
                    this.cancelButton.setTypeface(AndroidUtilities.bold());
                    this.saveButtonsContainer.addView(this.cancelButton, LayoutHelper.createFrame(-2, -1, 51));
                    final int i46 = 0;
                    this.cancelButton.setOnClickListener(new View.OnClickListener(this) {
                        public final ThemePreviewActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (i46) {
                                case 0:
                                    this.f$0.cancelThemeApply(false);
                                    break;
                                case 1:
                                    this.f$0.lambda$createView$18$1$2();
                                    break;
                                case 2:
                                    this.f$0.dropDownContainer.toggleSubMenu(null, null);
                                    break;
                                case 3:
                                    this.f$0.applyWallpaperBackground(false);
                                    break;
                                default:
                                    this.f$0.applyWallpaperBackground(true);
                                    break;
                            }
                        }
                    });
                    TextView textView9 = new TextView(context);
                    this.doneButton = textView9;
                    textView9.setTextSize(1, 14.0f);
                    TextView textView10 = this.doneButton;
                    if (z5) {
                        themedColor3 = Theme.getDefaultColor(i26);
                    } else {
                        themedColor3 = getThemedColor(i26);
                    }
                    textView10.setTextColor(themedColor3);
                    this.doneButton.setGravity(17);
                    this.doneButton.setBackgroundDrawable(Theme.createSelectorDrawable(251658240, 0));
                    this.doneButton.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
                    this.doneButton.setText(LocaleController.getString(R.string.ApplyTheme));
                    this.doneButton.setTypeface(AndroidUtilities.bold());
                    this.saveButtonsContainer.addView(this.doneButton, LayoutHelper.createFrame(-2, -1, 53));
                    i24 = 1;
                    this.doneButton.setOnClickListener(new View.OnClickListener(this) {
                        public final ThemePreviewActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (i24) {
                                case 0:
                                    this.f$0.cancelThemeApply(false);
                                    break;
                                case 1:
                                    this.f$0.lambda$createView$18$1$2();
                                    break;
                                case 2:
                                    this.f$0.dropDownContainer.toggleSubMenu(null, null);
                                    break;
                                case 3:
                                    this.f$0.applyWallpaperBackground(false);
                                    break;
                                default:
                                    this.f$0.applyWallpaperBackground(true);
                                    break;
                            }
                        }
                    });
                } else {
                    i24 = 1;
                }
                if (i14 == i24 && !Theme.hasCustomWallpaper() && themeAccent != null && themeAccent.backgroundOverrideColor != 4294967296L) {
                    selectColorType();
                }
                this.themeDescriptions = getThemeDescriptionsInternal();
                setCurrentImage(true);
                updatePlayAnimationView(false);
                this.scroller = new Scroller(getContext());
                iNavigationLayout = this.parentLayout;
                if (iNavigationLayout != null && iNavigationLayout.getBottomSheet() != null) {
                    this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(Theme.key_dialogBackground));
                    if (i14 == 2 && this.dialogId != 0) {
                        this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                    }
                }
                return this.fragmentView;
            }
            ActionBarMenu actionBarMenuCreateMenu2 = this.actionBar2.createMenu();
            this.saveItem = actionBarMenuCreateMenu2.addItem(4, LocaleController.getString(R.string.Save));
            AnonymousClass9 anonymousClass9 = new AnonymousClass9(this, context, actionBarMenuCreateMenu2);
            this.dropDownContainer = anonymousClass9;
            anonymousClass9.setSubMenuOpenSide(1);
            this.dropDownContainer.addSubItem(2, LocaleController.getString(R.string.ColorPickerBackground));
            AnonymousClass9 anonymousClass12 = this.dropDownContainer;
            int i47 = R.string.ColorPickerMainColor;
            anonymousClass12.addSubItem(1, LocaleController.getString(i47));
            this.dropDownContainer.addSubItem(3, LocaleController.getString(R.string.ColorPickerMyMessages));
            this.dropDownContainer.setAllowCloseAnimation();
            this.dropDownContainer.setForceSmoothKeyboard(true);
            this.actionBar2.addView(this.dropDownContainer, LayoutHelper.createFrame(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
            this.dropDownContainer.setOnClickListener(new View.OnClickListener(this) {
                public final ThemePreviewActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i31) {
                        case 0:
                            this.f$0.cancelThemeApply(false);
                            break;
                        case 1:
                            this.f$0.lambda$createView$18$1$2();
                            break;
                        case 2:
                            this.f$0.dropDownContainer.toggleSubMenu(null, null);
                            break;
                        case 3:
                            this.f$0.applyWallpaperBackground(false);
                            break;
                        default:
                            this.f$0.applyWallpaperBackground(true);
                            break;
                    }
                }
            });
            TextView textView11 = new TextView(context);
            this.dropDown = textView11;
            textView11.setImportantForAccessibility(2);
            this.dropDown.setGravity(3);
            this.dropDown.setSingleLine(true);
            this.dropDown.setLines(1);
            this.dropDown.setMaxLines(1);
            this.dropDown.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView12 = this.dropDown;
            int i48 = Theme.key_actionBarDefaultTitle;
            textView12.setTextColor(getThemedColor(i48));
            this.dropDown.setTypeface(AndroidUtilities.bold());
            this.dropDown.setText(LocaleController.getString(i47));
            Drawable drawableMutate2 = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i48), PorterDuff.Mode.MULTIPLY));
            this.dropDown.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableMutate2, (Drawable) null);
            this.dropDown.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
            this.dropDown.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            this.dropDownContainer.addView(this.dropDown, LayoutHelper.createFrame(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 1.0f));
        }
        this.listView2 = new RecyclerListView(context) {
            public boolean scrollingBackground;
            public float startX;

            @Override
            public final boolean allowSelectChildAtPosition(View view2) {
                AnonymousClass10 anonymousClass118 = this.listView2;
                View viewFindContainingItemView = anonymousClass118.findContainingItemView(view2);
                RecyclerView.ViewHolder childViewHolder = viewFindContainingItemView == null ? null : anonymousClass118.getChildViewHolder(viewFindContainingItemView);
                return childViewHolder == null || childViewHolder.mItemViewType != 2;
            }

            @Override
            public final boolean drawChild(Canvas canvas, View view2, long j) {
                RecyclerView.ViewHolder childViewHolder;
                boolean zDrawChild = super.drawChild(canvas, view2, j);
                if (view2 instanceof ChatMessageCell) {
                    ChatMessageCell chatMessageCell = (ChatMessageCell) view2;
                    chatMessageCell.getMessageObject();
                    ImageReceiver avatarImage = chatMessageCell.getAvatarImage();
                    if (avatarImage != null) {
                        int top = view2.getTop();
                        boolean zIsPinnedBottom = chatMessageCell.isPinnedBottom();
                        ThemePreviewActivity themePreviewActivity = this;
                        if (zIsPinnedBottom && (childViewHolder = themePreviewActivity.listView2.getChildViewHolder(view2)) != null) {
                            if (themePreviewActivity.listView2.findViewHolderForAdapterPosition(childViewHolder.getAdapterPosition() - 1) != null) {
                                avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                                avatarImage.draw(canvas);
                                return zDrawChild;
                            }
                        }
                        float translationX = chatMessageCell.getTranslationX();
                        int layoutHeight = chatMessageCell.getLayoutHeight() + view2.getTop();
                        int measuredHeight = themePreviewActivity.listView2.getMeasuredHeight() - themePreviewActivity.listView2.getPaddingBottom();
                        if (layoutHeight > measuredHeight) {
                            layoutHeight = measuredHeight;
                        }
                        if (chatMessageCell.isPinnedTop() && (childViewHolder2 = themePreviewActivity.listView2.getChildViewHolder(view2)) != null) {
                            int i310 = 0;
                            while (i310 < 20) {
                                i310++;
                                RecyclerView.ViewHolder childViewHolder2 = themePreviewActivity.listView2.findViewHolderForAdapterPosition(childViewHolder2.getAdapterPosition() + 1);
                                if (childViewHolder2 == null) {
                                    break;
                                }
                                View view3 = childViewHolder2.itemView;
                                int top2 = view3.getTop();
                                if (layoutHeight - AndroidUtilities.dp(48.0f) < view3.getBottom()) {
                                    translationX = Math.min(view3.getTranslationX(), translationX);
                                }
                                if (!(view3 instanceof ChatMessageCell) || !((ChatMessageCell) view3).isPinnedTop()) {
                                    top = top2;
                                    break;
                                }
                                top = top2;
                            }
                        }
                        if (layoutHeight - AndroidUtilities.dp(48.0f) < top) {
                            layoutHeight = AndroidUtilities.dp(48.0f) + top;
                        }
                        if (translationX != 0.0f) {
                            canvas.save();
                            canvas.translate(translationX, 0.0f);
                        }
                        avatarImage.setImageY(layoutHeight - AndroidUtilities.dp(44.0f));
                        avatarImage.draw(canvas);
                        if (translationX != 0.0f) {
                            canvas.restore();
                        }
                    }
                }
                return zDrawChild;
            }

            @Override
            public final void onChildPressed(View view2, float f13, float f14, boolean z8) {
                if (z8 && (view2 instanceof ChatMessageCell) && !((ChatMessageCell) view2).isInsideBackground(f13)) {
                    return;
                }
                super.onChildPressed(view2, f13, f14, z8);
            }

            @Override
            public final void onLayout(boolean z8, int i310, int i311, int i312, int i49) {
                super.onLayout(z8, i310, i311, i312, i49);
                this.invalidateBlur$2();
            }

            @Override
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                ThemePreviewActivity themePreviewActivity = this;
                if (action == 1) {
                    if (!themePreviewActivity.wasScroll && (themePreviewActivity.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) && themePreviewActivity.patternLayout[0].getVisibility() == 0) {
                        themePreviewActivity.showPatternsView(0, false);
                    }
                    themePreviewActivity.wasScroll = false;
                }
                if (themePreviewActivity.hasScrollingBackground) {
                    if (motionEvent.getAction() == 0) {
                        this.startX = motionEvent.getX();
                        motionEvent.getY();
                        if (getParent() != null) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        this.scrollingBackground = true;
                    } else if (motionEvent.getAction() == 2) {
                        if (!this.scrollingBackground && Math.abs(this.startX - motionEvent.getX()) > AndroidUtilities.touchSlop) {
                            if (getParent() != null) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            this.scrollingBackground = true;
                        }
                    } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                        this.scrollingBackground = false;
                        if (getParent() != null) {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        }
                    }
                    themePreviewActivity.gestureDetector2.onTouchEvent(motionEvent);
                }
                return this.scrollingBackground || super.onTouchEvent(motionEvent);
            }

            @Override
            public final void setTranslationY(float f13) {
                super.setTranslationY(f13);
                ThemePreviewActivity themePreviewActivity = this;
                int i310 = 0;
                if (themePreviewActivity.backgroundCheckBoxView != null) {
                    int i311 = 0;
                    while (true) {
                        WallpaperCheckBoxView[] wallpaperCheckBoxViewArr2 = themePreviewActivity.backgroundCheckBoxView;
                        if (i311 >= wallpaperCheckBoxViewArr2.length) {
                            break;
                        }
                        wallpaperCheckBoxViewArr2[i311].invalidate();
                        i311++;
                    }
                }
                if (themePreviewActivity.messagesCheckBoxView != null) {
                    while (true) {
                        WallpaperCheckBoxView[] wallpaperCheckBoxViewArr3 = themePreviewActivity.messagesCheckBoxView;
                        if (i310 >= wallpaperCheckBoxViewArr3.length) {
                            break;
                        }
                        wallpaperCheckBoxViewArr3[i310].invalidate();
                        i310++;
                    }
                }
                AnonymousClass16 anonymousClass118 = themePreviewActivity.backgroundPlayAnimationView;
                if (anonymousClass118 != null) {
                    anonymousClass118.invalidate();
                }
                AnonymousClass16 anonymousClass119 = themePreviewActivity.messagesPlayAnimationView;
                if (anonymousClass119 != null) {
                    anonymousClass119.invalidate();
                }
            }
        };
        DefaultItemAnimator defaultItemAnimator2 = new DefaultItemAnimator() {
            @Override
            public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                invalidateViews();
            }
        };
        defaultItemAnimator2.setDelayAnimations();
        setItemAnimator(defaultItemAnimator2);
        setVerticalScrollBarEnabled(true);
        setOverScrollMode(2);
        if (i34 == 2) {
            AnonymousClass10 anonymousClass118 = this.listView2;
            int iDp10 = AndroidUtilities.dp(4.0f);
            f = 16.0f;
            if (this.self) {
                i27 = 0;
            } else {
                i27 = 0;
            }
            int iDp11 = AndroidUtilities.dp(72 + i27) - 12;
            if (insideBottomSheet()) {
                i28 = AndroidUtilities.navigationBarHeight;
            } else {
                i28 = 0;
            }
            anonymousClass118.setPadding(0, iDp10, 0, iDp11 + i28);
        } else {
            f = 16.0f;
            if (i34 == 1) {
                setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(16.0f));
            } else {
                setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
            }
        }
        setClipToPadding(false);
        setLayoutManager(new LinearLayoutManager(1, true));
        AnonymousClass10 anonymousClass119 = this.listView2;
        if (LocaleController.isRTL) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        anonymousClass119.setVerticalScrollbarPosition(i2);
        if (i34 == 1) {
            this.page2.addView(this.listView2, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 273.0f));
            setOnItemClickListener(new ThemePreviewActivity$$ExternalSyntheticLambda13(this, i32));
            i3 = -1;
        } else {
            i3 = -1;
            this.page2.addView(this.listView2, LayoutHelper.createFrame(-1, -1, 51));
        }
        setOnScrollListener(new SettingsActivity.AnonymousClass5(this, 16));
        this.page2.addView(this.actionBar2, LayoutHelper.createFrame(-2.0f, i3));
        WallpaperParallaxEffect wallpaperParallaxEffect2 = new WallpaperParallaxEffect(context);
        this.parallaxEffect = wallpaperParallaxEffect2;
        wallpaperParallaxEffect2.setCallback(new ThemePreviewActivity$$ExternalSyntheticLambda13(this, i31));
        themeAccent = this.accent;
        if (i34 != 1) {
            if (i34 == 2) {
                AnonymousClass13 anonymousClass120 = new AnonymousClass13(this, context, insideBottomSheet());
                this.bottomOverlayChat = anonymousClass120;
                anonymousClass120.setWillNotDraw(false);
                AnonymousClass13 anonymousClass121 = this.bottomOverlayChat;
                int iDp12 = AndroidUtilities.dp(12.0f);
                c = 2;
                int iDp13 = AndroidUtilities.dp(12.0f);
                int iDp14 = AndroidUtilities.dp(12.0f);
                int iDp15 = AndroidUtilities.dp(12.0f);
                if (insideBottomSheet()) {
                    i22 = AndroidUtilities.navigationBarHeight;
                } else {
                    i22 = 0;
                }
                anonymousClass121.setPadding(iDp12, iDp13, iDp14, iDp15 + i22);
                this.page2.addView(this.bottomOverlayChat, LayoutHelper.createFrame(-1, 0, 81));
                BlurButton blurButton4 = new BlurButton(context, this);
                this.applyButton1 = blurButton4;
                ScaleStateListAnimator.apply(blurButton4, 0.033f, 1.2f);
                updateApplyButton1(false);
                this.applyButton1.setOnClickListener(new View.OnClickListener(this) {
                    public final ThemePreviewActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i30) {
                            case 0:
                                this.f$0.cancelThemeApply(false);
                                break;
                            case 1:
                                this.f$0.lambda$createView$18$1$2();
                                break;
                            case 2:
                                this.f$0.dropDownContainer.toggleSubMenu(null, null);
                                break;
                            case 3:
                                this.f$0.applyWallpaperBackground(false);
                                break;
                            default:
                                this.f$0.applyWallpaperBackground(true);
                                break;
                        }
                    }
                });
                if (this.dialogId > 0) {
                    this.bottomOverlayChat.addView(this.applyButton1, LayoutHelper.createFrame(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                } else {
                    this.bottomOverlayChat.addView(this.applyButton1, LayoutHelper.createFrame(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                }
                if (this.shouldShowBrightnessControll) {
                    AnonymousClass14 anonymousClass122 = new AnonymousClass14(this, (Activity) getContext());
                    this.dimmingSliderContainer = anonymousClass122;
                    anonymousClass122.setPadding(AndroidUtilities.dp(f), AndroidUtilities.dp(f), AndroidUtilities.dp(f), AndroidUtilities.dp(f));
                    this.page2.addView(this.dimmingSliderContainer, LayoutHelper.createFrame(222, 76, 49));
                    ?? r6 = new SliderView((Activity) getContext()) {
                        @Override
                        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                            if (getParent() != null) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    };
                    this.dimmingSlider = r6;
                    r6.setValue(this.dimAmount);
                    setMinMax();
                    setOnValueChange(new VoIPFragment$$ExternalSyntheticLambda7(this, 22));
                    this.dimmingSliderContainer.addView(this.dimmingSlider);
                    dayNightSwitchDelegate = this.onSwitchDayNightDelegate;
                    if (dayNightSwitchDelegate != null) {
                        AnonymousClass15 anonymousClass123 = this.dimmingSlider;
                        if (dayNightSwitchDelegate.isDark()) {
                            i23 = 0;
                        } else {
                            i23 = 8;
                        }
                        anonymousClass123.setVisibility(i23);
                        AnonymousClass15 anonymousClass124 = this.dimmingSlider;
                        if (this.onSwitchDayNightDelegate.isDark()) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        anonymousClass124.setAlpha(f10);
                        AnonymousClass15 anonymousClass125 = this.dimmingSlider;
                        if (this.onSwitchDayNightDelegate.isDark()) {
                            f11 = this.dimAmount;
                        } else {
                            f11 = 0.0f;
                        }
                        anonymousClass125.setValue(f11);
                    }
                }
            } else {
                c = 2;
            }
            rect = new Rect();
            Drawable drawableMutate3 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            this.sheetDrawable = drawableMutate3;
            drawableMutate3.getPadding(rect);
            this.sheetDrawable.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_windowBackgroundWhite), PorterDuff.Mode.MULTIPLY));
            textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            obj = this.currentWallpaper;
            if (i34 != 1) {
                if (obj instanceof WallpapersListActivity.ColorWallpaper) {
                }
                i4 = 3;
            } else {
                if (obj instanceof WallpapersListActivity.ColorWallpaper) {
                }
                i4 = 3;
            }
            strArr = new String[i4];
            iArr = new int[i4];
            this.backgroundCheckBoxView = new WallpaperCheckBoxView[i4];
            if (i4 != 0) {
                this.backgroundButtonsContainer = new FrameLayout(context);
                if (i34 != 1) {
                    strArr[0] = LocaleController.getString(R.string.BackgroundColors);
                    strArr[1] = LocaleController.getString(R.string.BackgroundPattern);
                    strArr[c] = LocaleController.getString(R.string.BackgroundMotion);
                } else {
                    strArr[0] = LocaleController.getString(R.string.BackgroundColors);
                    strArr[1] = LocaleController.getString(R.string.BackgroundPattern);
                    strArr[c] = LocaleController.getString(R.string.BackgroundMotion);
                }
                iMax2 = 0;
                i20 = 0;
                while (i20 < i4) {
                    int iCeil3 = (int) Math.ceil(textPaint.measureText(strArr[i20]));
                    iArr[i20] = iCeil3;
                    iMax2 = Math.max(iMax2, iCeil3);
                    i20++;
                    themeInfo2 = themeInfo2;
                }
                themeInfo = themeInfo2;
                ?? r4 = new FrameLayout(context, this, i33) {
                    public final int $r8$classId;
                    public final RectF rect;
                    public final ThemePreviewActivity this$0;

                    {
                        super(context);
                        this.$r8$classId = i33;
                        switch (i33) {
                            case 1:
                                this.this$0 = this;
                                super(context);
                                this.rect = new RectF();
                                break;
                            default:
                                this.this$0 = this;
                                this.rect = new RectF();
                                break;
                        }
                    }

                    @Override
                    public final void onDraw(Canvas canvas) {
                        switch (this.$r8$classId) {
                            case 0:
                                RectF rectF = this.rect;
                                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                                ThemePreviewActivity themePreviewActivity = this.this$0;
                                Theme.applyServiceShaderMatrixForView(themePreviewActivity.backgroundPlayAnimationView, themePreviewActivity.backgroundImage, themePreviewActivity.themeDelegate);
                                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity.themeDelegate.getPaint("paintChatActionBackground"));
                                if (Theme.hasGradientService()) {
                                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity.themeDelegate.getPaint("paintChatActionBackgroundDarken"));
                                }
                                break;
                            default:
                                RectF rectF2 = this.rect;
                                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                                ThemePreviewActivity themePreviewActivity2 = this.this$0;
                                Theme.applyServiceShaderMatrixForView(themePreviewActivity2.messagesPlayAnimationView, themePreviewActivity2.backgroundImage, themePreviewActivity2.themeDelegate);
                                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity2.themeDelegate.getPaint("paintChatActionBackground"));
                                if (Theme.hasGradientService()) {
                                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity2.themeDelegate.getPaint("paintChatActionBackgroundDarken"));
                                }
                                break;
                        }
                    }
                };
                this.backgroundPlayAnimationView = r4;
                r4.setWillNotDraw(false);
                AnonymousClass16 anonymousClass126 = this.backgroundPlayAnimationView;
                if (this.backgroundGradientColor1 != 0) {
                    i21 = 0;
                } else {
                    i21 = 4;
                }
                anonymousClass126.setVisibility(i21);
                AnonymousClass16 anonymousClass1110 = this.backgroundPlayAnimationView;
                if (this.backgroundGradientColor1 != 0) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.1f;
                }
                anonymousClass1110.setScaleX(f7);
                AnonymousClass16 anonymousClass1111 = this.backgroundPlayAnimationView;
                if (this.backgroundGradientColor1 != 0) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.1f;
                }
                anonymousClass1111.setScaleY(f8);
                AnonymousClass16 anonymousClass1112 = this.backgroundPlayAnimationView;
                if (this.backgroundGradientColor1 != 0) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                anonymousClass1112.setAlpha(f9);
                AnonymousClass16 anonymousClass1113 = this.backgroundPlayAnimationView;
                if (this.backgroundGradientColor1 != 0) {
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                anonymousClass1113.setTag(obj2);
                this.backgroundButtonsContainer.addView(this.backgroundPlayAnimationView, LayoutHelper.createFrame(48, 48, 17));
                setOnClickListener(new View.OnClickListener(this) {
                    public int rotation = 0;
                    public final ThemePreviewActivity this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i33) {
                            case 0:
                                ThemePreviewActivity themePreviewActivity = this.this$0;
                                themePreviewActivity.backgroundPlayAnimationImageView.setRotation(this.rotation);
                                this.rotation -= 45;
                                themePreviewActivity.backgroundPlayAnimationImageView.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
                                BackgroundView[] backgroundViewArr2 = themePreviewActivity.backgroundImages;
                                BackgroundView backgroundView3 = backgroundViewArr2[0];
                                if (backgroundView3 != null) {
                                    Drawable background = backgroundView3.getBackground();
                                    if (background instanceof MotionBackgroundDrawable) {
                                        ((MotionBackgroundDrawable) background).switchToNextPosition(false);
                                    } else if (themePreviewActivity.screenType == 2) {
                                        themePreviewActivity.backgroundRotation += 45;
                                        while (true) {
                                            int i310 = themePreviewActivity.backgroundRotation;
                                            if (i310 >= 360) {
                                                themePreviewActivity.backgroundRotation = i310 - 360;
                                            } else {
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.backgroundColor, 0, true);
                                            }
                                        }
                                    } else {
                                        Theme.ThemeAccent themeAccent2 = themePreviewActivity.accent;
                                        if (themeAccent2 != null) {
                                            themeAccent2.backgroundRotation += 45;
                                            while (true) {
                                                int i311 = themeAccent2.backgroundRotation;
                                                if (i311 >= 360) {
                                                    themeAccent2.backgroundRotation = i311 - 360;
                                                } else {
                                                    Theme.refreshThemeColors(false, false);
                                                }
                                            }
                                        }
                                    }
                                }
                                BackgroundView backgroundView4 = backgroundViewArr2[1];
                                if (backgroundView4 != null) {
                                    Drawable background2 = backgroundView4.getBackground();
                                    if (background2 instanceof MotionBackgroundDrawable) {
                                        ((MotionBackgroundDrawable) background2).switchToNextPosition(false);
                                    }
                                }
                                break;
                            default:
                                ThemePreviewActivity themePreviewActivity2 = this.this$0;
                                themePreviewActivity2.messagesPlayAnimationImageView.setRotation(this.rotation);
                                this.rotation -= 45;
                                themePreviewActivity2.messagesPlayAnimationImageView.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
                                Theme.ThemeAccent themeAccent3 = themePreviewActivity2.accent;
                                if (!themeAccent3.myMessagesAnimated) {
                                    int i49 = themeAccent3.myMessagesGradientAccentColor3;
                                    if (i49 != 0) {
                                        int i410 = themeAccent3.myMessagesAccentColor;
                                        if (i410 == 0) {
                                            i410 = themeAccent3.accentColor;
                                        }
                                        themeAccent3.myMessagesAccentColor = themeAccent3.myMessagesGradientAccentColor1;
                                        themeAccent3.myMessagesGradientAccentColor1 = themeAccent3.myMessagesGradientAccentColor2;
                                        themeAccent3.myMessagesGradientAccentColor2 = i49;
                                        themeAccent3.myMessagesGradientAccentColor3 = i410;
                                    } else {
                                        int i411 = themeAccent3.myMessagesAccentColor;
                                        if (i411 == 0) {
                                            i411 = themeAccent3.accentColor;
                                        }
                                        themeAccent3.myMessagesAccentColor = themeAccent3.myMessagesGradientAccentColor1;
                                        themeAccent3.myMessagesGradientAccentColor1 = themeAccent3.myMessagesGradientAccentColor2;
                                        themeAccent3.myMessagesGradientAccentColor2 = i411;
                                    }
                                    themePreviewActivity2.colorPicker.setColor(themeAccent3.myMessagesGradientAccentColor3, 3);
                                    themePreviewActivity2.colorPicker.setColor(themePreviewActivity2.accent.myMessagesGradientAccentColor2, 2);
                                    themePreviewActivity2.colorPicker.setColor(themePreviewActivity2.accent.myMessagesGradientAccentColor1, 1);
                                    ColorPicker colorPicker3 = themePreviewActivity2.colorPicker;
                                    Theme.ThemeAccent themeAccent4 = themePreviewActivity2.accent;
                                    int i412 = themeAccent4.myMessagesAccentColor;
                                    if (i412 == 0) {
                                        i412 = themeAccent4.accentColor;
                                    }
                                    colorPicker3.setColor(i412, 0);
                                    themePreviewActivity2.messagesCheckBoxView[1].setColor(0, themePreviewActivity2.accent.myMessagesAccentColor);
                                    themePreviewActivity2.messagesCheckBoxView[1].setColor(1, themePreviewActivity2.accent.myMessagesGradientAccentColor1);
                                    themePreviewActivity2.messagesCheckBoxView[1].setColor(2, themePreviewActivity2.accent.myMessagesGradientAccentColor2);
                                    themePreviewActivity2.messagesCheckBoxView[1].setColor(3, themePreviewActivity2.accent.myMessagesGradientAccentColor3);
                                    Theme.refreshThemeColors(true, true);
                                    themePreviewActivity2.listView2.invalidateViews();
                                } else if (themePreviewActivity2.msgOutDrawable.getMotionBackgroundDrawable() != null) {
                                    themePreviewActivity2.msgOutDrawable.getMotionBackgroundDrawable().switchToNextPosition(false);
                                }
                                break;
                        }
                    }
                });
                ImageView imageView3 = new ImageView(context);
                this.backgroundPlayAnimationImageView = imageView3;
                imageView3.setScaleType(ImageView.ScaleType.CENTER);
                this.backgroundPlayAnimationImageView.setImageResource(R.drawable.bg_rotate_large);
                addView(this.backgroundPlayAnimationImageView, LayoutHelper.createFrame(-2, -2, 17));
                i5 = iMax2;
            } else {
                themeInfo = themeInfo2;
                i5 = 0;
            }
            i6 = 0;
            while (true) {
                anonymousClass1 = this.themeDelegate;
                if (i6 >= i4) {
                    break;
                    break;
                }
                this.backgroundCheckBoxView[i6] = new WallpaperCheckBoxView(context, (i34 == 1 && !(this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper)) || i6 != 0, this.backgroundImage, anonymousClass1);
                this.backgroundCheckBoxView[i6].setBackgroundColor(this.backgroundColor);
                wallpaperCheckBoxView2 = this.backgroundCheckBoxView[i6];
                String str3 = strArr[i6];
                int i310 = iArr[i6];
                wallpaperCheckBoxView2.currentText = str3;
                wallpaperCheckBoxView2.currentTextSize = i310;
                wallpaperCheckBoxView2.maxTextSize = i5;
                i19 = 1;
                if (i34 == 1) {
                    if (i6 == i19) {
                        if (this.selectedPattern == null) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        wallpaperCheckBoxView2.setChecked(z3, false);
                    } else if (i6 == 2) {
                        wallpaperCheckBoxView2.setChecked(this.isMotion, false);
                    }
                } else if (this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) {
                    i19 = 1;
                    if (i6 == i19) {
                        if (this.selectedPattern == null) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        wallpaperCheckBoxView2.setChecked(z3, false);
                    } else if (i6 == 2) {
                        wallpaperCheckBoxView2.setChecked(this.isMotion, false);
                    }
                } else {
                    if (i6 == 0) {
                        z4 = this.isBlurred;
                    } else {
                        z4 = this.isMotion;
                    }
                    wallpaperCheckBoxView2.setChecked(z4, false);
                }
                iDp3 = AndroidUtilities.dp(56.0f) + i5;
                layoutParams2 = new FrameLayout.LayoutParams(iDp3, -2);
                layoutParams2.gravity = 17;
                if (i4 == 3) {
                    if (i6 != 0) {
                        layoutParams2.leftMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                    } else {
                        layoutParams2.leftMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                    }
                } else if (i6 == 1) {
                    layoutParams2.leftMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                } else {
                    layoutParams2.rightMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                }
                this.backgroundButtonsContainer.addView(this.backgroundCheckBoxView[i6], layoutParams2);
                final WallpaperCheckBoxView wallpaperCheckBoxView5 = this.backgroundCheckBoxView[i6];
                final int i311 = 1;
                wallpaperCheckBoxView5.setOnClickListener(new View.OnClickListener(this) {
                    public final ThemePreviewActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i311) {
                            case 0:
                                ThemePreviewActivity themePreviewActivity = this.f$0;
                                if (themePreviewActivity.messagesButtonsContainer.getAlpha() == 1.0f && i6 == 0) {
                                    WallpaperCheckBoxView wallpaperCheckBoxView6 = wallpaperCheckBoxView5;
                                    wallpaperCheckBoxView6.setChecked(!wallpaperCheckBoxView6.isChecked, true);
                                    themePreviewActivity.accent.myMessagesAnimated = wallpaperCheckBoxView6.isChecked;
                                    Theme.refreshThemeColors(true, true);
                                    themePreviewActivity.listView2.invalidateViews();
                                }
                                break;
                            default:
                                ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                if (themePreviewActivity2.backgroundButtonsContainer.getAlpha() == 1.0f && themePreviewActivity2.patternViewAnimation == null) {
                                    int i49 = i6;
                                    WallpaperCheckBoxView wallpaperCheckBoxView7 = wallpaperCheckBoxView5;
                                    int i410 = themePreviewActivity2.screenType;
                                    if ((i410 == 1 || (themePreviewActivity2.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper)) && i49 == 2) {
                                        wallpaperCheckBoxView7.setChecked(!wallpaperCheckBoxView7.isChecked, true);
                                        boolean z8 = wallpaperCheckBoxView7.isChecked;
                                        themePreviewActivity2.isMotion = z8;
                                        themePreviewActivity2.parallaxEffect.setEnabled(z8);
                                        themePreviewActivity2.animateMotionChange();
                                    } else {
                                        FrameLayout[] frameLayoutArr2 = themePreviewActivity2.patternLayout;
                                        if (i49 == 1 && (i410 == 1 || (themePreviewActivity2.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper))) {
                                            if (themePreviewActivity2.backgroundCheckBoxView[1].isChecked) {
                                                themePreviewActivity2.lastSelectedPattern = themePreviewActivity2.selectedPattern;
                                                themePreviewActivity2.backgroundImage.setImageDrawable(null);
                                                themePreviewActivity2.selectedPattern = null;
                                                themePreviewActivity2.isMotion = false;
                                                themePreviewActivity2.updateButtonState$1$1();
                                                themePreviewActivity2.animateMotionChange();
                                                if (frameLayoutArr2[1].getVisibility() == 0) {
                                                    if (i410 == 1) {
                                                        themePreviewActivity2.showPatternsView(0, true);
                                                    } else {
                                                        themePreviewActivity2.showPatternsView(i49, frameLayoutArr2[i49].getVisibility() != 0);
                                                    }
                                                }
                                            } else {
                                                themePreviewActivity2.selectPattern(themePreviewActivity2.lastSelectedPattern != null ? -1 : 0);
                                                if (i410 == 1) {
                                                    themePreviewActivity2.showPatternsView(1, true);
                                                } else {
                                                    themePreviewActivity2.showPatternsView(i49, frameLayoutArr2[i49].getVisibility() != 0);
                                                }
                                            }
                                            themePreviewActivity2.backgroundCheckBoxView[1].setChecked(themePreviewActivity2.selectedPattern != null, true);
                                            themePreviewActivity2.updateSelectedPattern();
                                            themePreviewActivity2.patternsListView.invalidateViews();
                                            themePreviewActivity2.updateMotionButton();
                                        } else if (themePreviewActivity2.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) {
                                            themePreviewActivity2.showPatternsView(i49, frameLayoutArr2[i49].getVisibility() != 0);
                                        } else if (i410 != 1) {
                                            wallpaperCheckBoxView7.setChecked(!wallpaperCheckBoxView7.isChecked, true);
                                            if (i49 != 0) {
                                                boolean z9 = wallpaperCheckBoxView7.isChecked;
                                                themePreviewActivity2.isMotion = z9;
                                                themePreviewActivity2.parallaxEffect.setEnabled(z9);
                                                themePreviewActivity2.animateMotionChange();
                                            } else {
                                                boolean z10 = wallpaperCheckBoxView7.isChecked;
                                                themePreviewActivity2.isBlurred = z10;
                                                if (z10) {
                                                    themePreviewActivity2.backgroundImage.getImageReceiver().setForceCrossfade(true);
                                                }
                                                themePreviewActivity2.updateBlurred();
                                            }
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (i6 == 2) {
                    this.backgroundCheckBoxView[i6].setAlpha(0.0f);
                    this.backgroundCheckBoxView[i6].setVisibility(4);
                }
                i6++;
            }
            i7 = 1;
            if (i34 == 1) {
                iArr2 = new int[2];
                this.messagesCheckBoxView = new WallpaperCheckBoxView[2];
                this.messagesButtonsContainer = new FrameLayout(context);
                strArr2 = new String[]{LocaleController.getString(R.string.BackgroundAnimate), LocaleController.getString(R.string.BackgroundColors)};
                i16 = 0;
                iMax = 0;
                while (i16 < i15) {
                    int[] iArr5 = iArr2;
                    int iCeil4 = (int) Math.ceil(textPaint.measureText(strArr2[i16]));
                    iArr5[i16] = iCeil4;
                    iMax = Math.max(iMax, iCeil4);
                    i16++;
                    iArr2 = iArr5;
                }
                iArr3 = iArr2;
                i7 = 1;
                if (themeAccent != null) {
                    ?? r7 = new FrameLayout(context, this, i7) {
                        public final int $r8$classId;
                        public final RectF rect;
                        public final ThemePreviewActivity this$0;

                        {
                            super(context);
                            this.$r8$classId = i7;
                            switch (i7) {
                                case 1:
                                    this.this$0 = this;
                                    super(context);
                                    this.rect = new RectF();
                                    break;
                                default:
                                    this.this$0 = this;
                                    this.rect = new RectF();
                                    break;
                            }
                        }

                        @Override
                        public final void onDraw(Canvas canvas) {
                            switch (this.$r8$classId) {
                                case 0:
                                    RectF rectF = this.rect;
                                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                                    ThemePreviewActivity themePreviewActivity = this.this$0;
                                    Theme.applyServiceShaderMatrixForView(themePreviewActivity.backgroundPlayAnimationView, themePreviewActivity.backgroundImage, themePreviewActivity.themeDelegate);
                                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity.themeDelegate.getPaint("paintChatActionBackground"));
                                    if (Theme.hasGradientService()) {
                                        canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity.themeDelegate.getPaint("paintChatActionBackgroundDarken"));
                                    }
                                    break;
                                default:
                                    RectF rectF2 = this.rect;
                                    rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                                    ThemePreviewActivity themePreviewActivity2 = this.this$0;
                                    Theme.applyServiceShaderMatrixForView(themePreviewActivity2.messagesPlayAnimationView, themePreviewActivity2.backgroundImage, themePreviewActivity2.themeDelegate);
                                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity2.themeDelegate.getPaint("paintChatActionBackground"));
                                    if (Theme.hasGradientService()) {
                                        canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity2.themeDelegate.getPaint("paintChatActionBackgroundDarken"));
                                    }
                                    break;
                            }
                        }
                    };
                    this.messagesPlayAnimationView = r7;
                    r7.setWillNotDraw(false);
                    AnonymousClass16 anonymousClass1114 = this.messagesPlayAnimationView;
                    if (themeAccent.myMessagesGradientAccentColor1 != 0) {
                        i17 = 0;
                    } else {
                        i17 = 4;
                    }
                    anonymousClass1114.setVisibility(i17);
                    AnonymousClass16 anonymousClass1115 = this.messagesPlayAnimationView;
                    if (themeAccent.myMessagesGradientAccentColor1 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = 0.1f;
                    }
                    anonymousClass1115.setScaleX(f4);
                    AnonymousClass16 anonymousClass1116 = this.messagesPlayAnimationView;
                    if (themeAccent.myMessagesGradientAccentColor1 != 0) {
                        f5 = 1.0f;
                    } else {
                        f5 = 0.1f;
                    }
                    anonymousClass1116.setScaleY(f5);
                    AnonymousClass16 anonymousClass1117 = this.messagesPlayAnimationView;
                    if (themeAccent.myMessagesGradientAccentColor1 != 0) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    anonymousClass1117.setAlpha(f6);
                    this.messagesButtonsContainer.addView(this.messagesPlayAnimationView, LayoutHelper.createFrame(48, 48, 17));
                    final int i49 = 1;
                    setOnClickListener(new View.OnClickListener(this) {
                        public int rotation = 0;
                        public final ThemePreviewActivity this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (i49) {
                                case 0:
                                    ThemePreviewActivity themePreviewActivity = this.this$0;
                                    themePreviewActivity.backgroundPlayAnimationImageView.setRotation(this.rotation);
                                    this.rotation -= 45;
                                    themePreviewActivity.backgroundPlayAnimationImageView.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
                                    BackgroundView[] backgroundViewArr2 = themePreviewActivity.backgroundImages;
                                    BackgroundView backgroundView3 = backgroundViewArr2[0];
                                    if (backgroundView3 != null) {
                                        Drawable background = backgroundView3.getBackground();
                                        if (background instanceof MotionBackgroundDrawable) {
                                            ((MotionBackgroundDrawable) background).switchToNextPosition(false);
                                        } else if (themePreviewActivity.screenType == 2) {
                                            themePreviewActivity.backgroundRotation += 45;
                                            while (true) {
                                                int i312 = themePreviewActivity.backgroundRotation;
                                                if (i312 >= 360) {
                                                    themePreviewActivity.backgroundRotation = i312 - 360;
                                                } else {
                                                    themePreviewActivity.setBackgroundColor(themePreviewActivity.backgroundColor, 0, true);
                                                }
                                            }
                                        } else {
                                            Theme.ThemeAccent themeAccent2 = themePreviewActivity.accent;
                                            if (themeAccent2 != null) {
                                                themeAccent2.backgroundRotation += 45;
                                                while (true) {
                                                    int i313 = themeAccent2.backgroundRotation;
                                                    if (i313 >= 360) {
                                                        themeAccent2.backgroundRotation = i313 - 360;
                                                    } else {
                                                        Theme.refreshThemeColors(false, false);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    BackgroundView backgroundView4 = backgroundViewArr2[1];
                                    if (backgroundView4 != null) {
                                        Drawable background2 = backgroundView4.getBackground();
                                        if (background2 instanceof MotionBackgroundDrawable) {
                                            ((MotionBackgroundDrawable) background2).switchToNextPosition(false);
                                        }
                                    }
                                    break;
                                default:
                                    ThemePreviewActivity themePreviewActivity2 = this.this$0;
                                    themePreviewActivity2.messagesPlayAnimationImageView.setRotation(this.rotation);
                                    this.rotation -= 45;
                                    themePreviewActivity2.messagesPlayAnimationImageView.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
                                    Theme.ThemeAccent themeAccent3 = themePreviewActivity2.accent;
                                    if (!themeAccent3.myMessagesAnimated) {
                                        int i410 = themeAccent3.myMessagesGradientAccentColor3;
                                        if (i410 != 0) {
                                            int i411 = themeAccent3.myMessagesAccentColor;
                                            if (i411 == 0) {
                                                i411 = themeAccent3.accentColor;
                                            }
                                            themeAccent3.myMessagesAccentColor = themeAccent3.myMessagesGradientAccentColor1;
                                            themeAccent3.myMessagesGradientAccentColor1 = themeAccent3.myMessagesGradientAccentColor2;
                                            themeAccent3.myMessagesGradientAccentColor2 = i410;
                                            themeAccent3.myMessagesGradientAccentColor3 = i411;
                                        } else {
                                            int i412 = themeAccent3.myMessagesAccentColor;
                                            if (i412 == 0) {
                                                i412 = themeAccent3.accentColor;
                                            }
                                            themeAccent3.myMessagesAccentColor = themeAccent3.myMessagesGradientAccentColor1;
                                            themeAccent3.myMessagesGradientAccentColor1 = themeAccent3.myMessagesGradientAccentColor2;
                                            themeAccent3.myMessagesGradientAccentColor2 = i412;
                                        }
                                        themePreviewActivity2.colorPicker.setColor(themeAccent3.myMessagesGradientAccentColor3, 3);
                                        themePreviewActivity2.colorPicker.setColor(themePreviewActivity2.accent.myMessagesGradientAccentColor2, 2);
                                        themePreviewActivity2.colorPicker.setColor(themePreviewActivity2.accent.myMessagesGradientAccentColor1, 1);
                                        ColorPicker colorPicker3 = themePreviewActivity2.colorPicker;
                                        Theme.ThemeAccent themeAccent4 = themePreviewActivity2.accent;
                                        int i413 = themeAccent4.myMessagesAccentColor;
                                        if (i413 == 0) {
                                            i413 = themeAccent4.accentColor;
                                        }
                                        colorPicker3.setColor(i413, 0);
                                        themePreviewActivity2.messagesCheckBoxView[1].setColor(0, themePreviewActivity2.accent.myMessagesAccentColor);
                                        themePreviewActivity2.messagesCheckBoxView[1].setColor(1, themePreviewActivity2.accent.myMessagesGradientAccentColor1);
                                        themePreviewActivity2.messagesCheckBoxView[1].setColor(2, themePreviewActivity2.accent.myMessagesGradientAccentColor2);
                                        themePreviewActivity2.messagesCheckBoxView[1].setColor(3, themePreviewActivity2.accent.myMessagesGradientAccentColor3);
                                        Theme.refreshThemeColors(true, true);
                                        themePreviewActivity2.listView2.invalidateViews();
                                    } else if (themePreviewActivity2.msgOutDrawable.getMotionBackgroundDrawable() != null) {
                                        themePreviewActivity2.msgOutDrawable.getMotionBackgroundDrawable().switchToNextPosition(false);
                                    }
                                    break;
                            }
                        }
                    });
                    ImageView imageView4 = new ImageView(context);
                    this.messagesPlayAnimationImageView = imageView4;
                    imageView4.setScaleType(ImageView.ScaleType.CENTER);
                    this.messagesPlayAnimationImageView.setImageResource(R.drawable.bg_rotate_large);
                    addView(this.messagesPlayAnimationImageView, LayoutHelper.createFrame(-2, -2, 17));
                    while (i18 < 2) {
                        WallpaperCheckBoxView[] wallpaperCheckBoxViewArr2 = this.messagesCheckBoxView;
                        if (i18 == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        wallpaperCheckBoxViewArr2[i18] = new WallpaperCheckBoxView(context, z2, this.backgroundImage, anonymousClass1);
                        wallpaperCheckBoxView = this.messagesCheckBoxView[i18];
                        String str4 = strArr2[i18];
                        int i410 = iArr3[i18];
                        wallpaperCheckBoxView.currentText = str4;
                        wallpaperCheckBoxView.currentTextSize = i410;
                        wallpaperCheckBoxView.maxTextSize = iMax;
                        if (i18 == 0) {
                            wallpaperCheckBoxView.setChecked(themeAccent.myMessagesAnimated, false);
                        }
                        iDp2 = AndroidUtilities.dp(56.0f) + iMax;
                        layoutParams = new FrameLayout.LayoutParams(iDp2, -2);
                        layoutParams.gravity = 17;
                        if (i18 == 1) {
                            layoutParams.leftMargin = AndroidUtilities.dp(10.0f) + (iDp2 / 2);
                        } else {
                            layoutParams.rightMargin = AndroidUtilities.dp(10.0f) + (iDp2 / 2);
                        }
                        this.messagesButtonsContainer.addView(this.messagesCheckBoxView[i18], layoutParams);
                        final WallpaperCheckBoxView wallpaperCheckBoxView6 = this.messagesCheckBoxView[i18];
                        final int i411 = 0;
                        wallpaperCheckBoxView6.setOnClickListener(new View.OnClickListener(this) {
                            public final ThemePreviewActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i411) {
                                    case 0:
                                        ThemePreviewActivity themePreviewActivity = this.f$0;
                                        if (themePreviewActivity.messagesButtonsContainer.getAlpha() == 1.0f && i18 == 0) {
                                            WallpaperCheckBoxView wallpaperCheckBoxView7 = wallpaperCheckBoxView6;
                                            wallpaperCheckBoxView7.setChecked(!wallpaperCheckBoxView7.isChecked, true);
                                            themePreviewActivity.accent.myMessagesAnimated = wallpaperCheckBoxView7.isChecked;
                                            Theme.refreshThemeColors(true, true);
                                            themePreviewActivity.listView2.invalidateViews();
                                        }
                                        break;
                                    default:
                                        ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                        if (themePreviewActivity2.backgroundButtonsContainer.getAlpha() == 1.0f && themePreviewActivity2.patternViewAnimation == null) {
                                            int i412 = i18;
                                            WallpaperCheckBoxView wallpaperCheckBoxView8 = wallpaperCheckBoxView6;
                                            int i413 = themePreviewActivity2.screenType;
                                            if ((i413 == 1 || (themePreviewActivity2.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper)) && i412 == 2) {
                                                wallpaperCheckBoxView8.setChecked(!wallpaperCheckBoxView8.isChecked, true);
                                                boolean z8 = wallpaperCheckBoxView8.isChecked;
                                                themePreviewActivity2.isMotion = z8;
                                                themePreviewActivity2.parallaxEffect.setEnabled(z8);
                                                themePreviewActivity2.animateMotionChange();
                                            } else {
                                                FrameLayout[] frameLayoutArr2 = themePreviewActivity2.patternLayout;
                                                if (i412 == 1 && (i413 == 1 || (themePreviewActivity2.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper))) {
                                                    if (themePreviewActivity2.backgroundCheckBoxView[1].isChecked) {
                                                        themePreviewActivity2.lastSelectedPattern = themePreviewActivity2.selectedPattern;
                                                        themePreviewActivity2.backgroundImage.setImageDrawable(null);
                                                        themePreviewActivity2.selectedPattern = null;
                                                        themePreviewActivity2.isMotion = false;
                                                        themePreviewActivity2.updateButtonState$1$1();
                                                        themePreviewActivity2.animateMotionChange();
                                                        if (frameLayoutArr2[1].getVisibility() == 0) {
                                                            if (i413 == 1) {
                                                                themePreviewActivity2.showPatternsView(0, true);
                                                            } else {
                                                                themePreviewActivity2.showPatternsView(i412, frameLayoutArr2[i412].getVisibility() != 0);
                                                            }
                                                        }
                                                    } else {
                                                        themePreviewActivity2.selectPattern(themePreviewActivity2.lastSelectedPattern != null ? -1 : 0);
                                                        if (i413 == 1) {
                                                            themePreviewActivity2.showPatternsView(1, true);
                                                        } else {
                                                            themePreviewActivity2.showPatternsView(i412, frameLayoutArr2[i412].getVisibility() != 0);
                                                        }
                                                    }
                                                    themePreviewActivity2.backgroundCheckBoxView[1].setChecked(themePreviewActivity2.selectedPattern != null, true);
                                                    themePreviewActivity2.updateSelectedPattern();
                                                    themePreviewActivity2.patternsListView.invalidateViews();
                                                    themePreviewActivity2.updateMotionButton();
                                                } else if (themePreviewActivity2.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) {
                                                    themePreviewActivity2.showPatternsView(i412, frameLayoutArr2[i412].getVisibility() != 0);
                                                } else if (i413 != 1) {
                                                    wallpaperCheckBoxView8.setChecked(!wallpaperCheckBoxView8.isChecked, true);
                                                    if (i412 != 0) {
                                                        boolean z9 = wallpaperCheckBoxView8.isChecked;
                                                        themePreviewActivity2.isMotion = z9;
                                                        themePreviewActivity2.parallaxEffect.setEnabled(z9);
                                                        themePreviewActivity2.animateMotionChange();
                                                    } else {
                                                        boolean z10 = wallpaperCheckBoxView8.isChecked;
                                                        themePreviewActivity2.isBlurred = z10;
                                                        if (z10) {
                                                            themePreviewActivity2.backgroundImage.getImageReceiver().setForceCrossfade(true);
                                                        }
                                                        themePreviewActivity2.updateBlurred();
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    i7 = 1;
                }
            }
            if (i34 != i7) {
                this.isBlurred = false;
                i8 = 0;
                while (i8 < 2) {
                    frameLayout = new FrameLayout(context) {
                        @Override
                        public final void onDraw(Canvas canvas) {
                            int i412 = i8;
                            Rect rect3 = rect;
                            ThemePreviewActivity themePreviewActivity = ThemePreviewActivity.this;
                            if (i412 == 0) {
                                themePreviewActivity.sheetDrawable.setBounds(themePreviewActivity.colorPicker.getLeft() - rect3.left, 0, themePreviewActivity.colorPicker.getRight() + rect3.right, getMeasuredHeight());
                            } else {
                                themePreviewActivity.sheetDrawable.setBounds(-rect3.left, 0, getMeasuredWidth() + rect3.right, getMeasuredHeight());
                            }
                            themePreviewActivity.sheetDrawable.draw(canvas);
                        }
                    };
                    frameLayoutArr = this.patternLayout;
                    frameLayoutArr[i8] = frameLayout;
                    if (i8 != 1) {
                        frameLayout.setVisibility(4);
                    } else {
                        frameLayout.setVisibility(4);
                    }
                    frameLayoutArr[i8].setWillNotDraw(false);
                    if (i34 == 2) {
                        if (i8 == 0) {
                            i13 = 321;
                        } else {
                            i13 = 316;
                        }
                        layoutParamsCreateFrame = LayoutHelper.createFrame(-1, i13, 83);
                    } else {
                        if (i8 == 0) {
                            i9 = 273;
                        } else {
                            i9 = 316;
                        }
                        layoutParamsCreateFrame = LayoutHelper.createFrame(-1, i9, 83);
                    }
                    if (i8 == 0) {
                        f2 = i34 != 2 ? 273 : 321;
                    } else {
                        f2 = 316.0f;
                    }
                    layoutParamsCreateFrame.height = AndroidUtilities.dp(f2);
                    if (insideBottomSheet()) {
                        layoutParamsCreateFrame.height += AndroidUtilities.navigationBarHeight;
                    }
                    if (i8 == 0) {
                        Drawable drawable2 = this.sheetDrawable;
                        Rect rect3 = AndroidUtilities.rectTmp2;
                        drawable2.getPadding(rect3);
                        layoutParamsCreateFrame.height = AndroidUtilities.dp(12.0f) + rect3.top + layoutParamsCreateFrame.height;
                    }
                    GLSurfaceView gLSurfaceView2 = frameLayoutArr[i8];
                    if (i8 == 0) {
                        iDp = AndroidUtilities.dp(12.0f) + rect.top;
                    } else {
                        iDp = 0;
                    }
                    if (insideBottomSheet()) {
                        i10 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i10 = 0;
                    }
                    gLSurfaceView2.setPadding(0, iDp, 0, i10);
                    this.page2.addView(frameLayoutArr[i8], layoutParamsCreateFrame);
                    r14 = 1;
                    if (i8 != 1) {
                        TextureViewContainer textureViewContainer5 = new TextureViewContainer(context, this, 1);
                        ViewGroup[] viewGroupArr2 = this.patternsButtonsContainer;
                        viewGroupArr2[i8] = textureViewContainer5;
                        textureViewContainer5.setWillNotDraw(false);
                        viewGroupArr2[i8].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        viewGroupArr2[i8].setClickable(true);
                        f3 = 21.0f;
                        frameLayoutArr[i8].addView(viewGroupArr2[i8], LayoutHelper.createFrame(-1, 51, 80));
                        TextView textView13 = new TextView(context);
                        TextView[] textViewArr3 = this.patternsCancelButton;
                        textViewArr3[i8] = textView13;
                        textView13.setTextSize(1, 15.0f);
                        textViewArr3[i8].setTypeface(AndroidUtilities.bold());
                        TextView textView14 = textViewArr3[i8];
                        int i412 = Theme.key_chat_fieldOverlayText;
                        textView14.setTextColor(getThemedColor(i412));
                        textViewArr3[i8].setText(LocaleController.getString(R.string.Cancel));
                        textViewArr3[i8].setGravity(17);
                        textViewArr3[i8].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView15 = textViewArr3[i8];
                        int i413 = Theme.key_listSelector;
                        textView15.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i413), 0));
                        viewGroupArr2[i8].addView(textViewArr3[i8], LayoutHelper.createFrame(-2, -1, 51));
                        final int i414 = 0;
                        textViewArr3[i8].setOnClickListener(new View.OnClickListener(this) {
                            public final ThemePreviewActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i414) {
                                    case 0:
                                        ThemePreviewActivity themePreviewActivity = this.f$0;
                                        if (themePreviewActivity.patternViewAnimation == null) {
                                            int i415 = i8;
                                            if (i415 == 0) {
                                                themePreviewActivity.backgroundRotation = themePreviewActivity.previousBackgroundRotation;
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor3, 3, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor2, 2, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor1, 1, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundColor, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = themePreviewActivity.previousSelectedPattern;
                                                themePreviewActivity.selectedPattern = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    themePreviewActivity.backgroundImage.setImageDrawable(null);
                                                } else {
                                                    ThemePreviewActivity.BackgroundView backgroundView3 = themePreviewActivity.backgroundImage;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str5 = themePreviewActivity.imageFilter;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = themePreviewActivity.selectedPattern;
                                                    backgroundView3.imageReceiver.setImage(forDocument, str5, null, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                    backgroundView3.onNewImageSet();
                                                }
                                                themePreviewActivity.backgroundCheckBoxView[1].setChecked(themePreviewActivity.selectedPattern != null, false);
                                                float f13 = themePreviewActivity.previousIntensity;
                                                themePreviewActivity.currentIntensity = f13;
                                                themePreviewActivity.intensitySeekBar.setProgress(f13);
                                                themePreviewActivity.backgroundImage.getImageReceiver().setAlpha(themePreviewActivity.currentIntensity);
                                                themePreviewActivity.updateButtonState$1$1();
                                                themePreviewActivity.updateSelectedPattern();
                                            }
                                            if (themePreviewActivity.screenType != 2) {
                                                if (themePreviewActivity.selectedPattern == null) {
                                                    if (themePreviewActivity.isMotion) {
                                                        themePreviewActivity.isMotion = false;
                                                        themePreviewActivity.backgroundCheckBoxView[0].setChecked(false, true);
                                                        themePreviewActivity.animateMotionChange();
                                                    }
                                                    themePreviewActivity.updateMotionButton();
                                                }
                                                themePreviewActivity.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity.showPatternsView(i415, false);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                        if (themePreviewActivity2.patternViewAnimation == null) {
                                            if (themePreviewActivity2.screenType != 2) {
                                                themePreviewActivity2.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity2.showPatternsView(i8, false);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        TextView textView16 = new TextView(context);
                        TextView[] textViewArr4 = this.patternsSaveButton;
                        textViewArr4[i8] = textView16;
                        textView16.setTextSize(1, 15.0f);
                        textViewArr4[i8].setTypeface(AndroidUtilities.bold());
                        textViewArr4[i8].setTextColor(getThemedColor(i412));
                        textViewArr4[i8].setText(LocaleController.getString(R.string.ApplyTheme));
                        textViewArr4[i8].setGravity(17);
                        textViewArr4[i8].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        textViewArr4[i8].setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i413), 0));
                        viewGroupArr2[i8].addView(textViewArr4[i8], LayoutHelper.createFrame(-2, -1, 53));
                        TextView textView17 = textViewArr4[i8];
                        r14 = 1;
                        final int c3 = 1 == true ? 1 : 0;
                        textView17.setOnClickListener(new View.OnClickListener(this) {
                            public final ThemePreviewActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (c3) {
                                    case 0:
                                        ThemePreviewActivity themePreviewActivity = this.f$0;
                                        if (themePreviewActivity.patternViewAnimation == null) {
                                            int i415 = i8;
                                            if (i415 == 0) {
                                                themePreviewActivity.backgroundRotation = themePreviewActivity.previousBackgroundRotation;
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor3, 3, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor2, 2, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor1, 1, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundColor, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = themePreviewActivity.previousSelectedPattern;
                                                themePreviewActivity.selectedPattern = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    themePreviewActivity.backgroundImage.setImageDrawable(null);
                                                } else {
                                                    ThemePreviewActivity.BackgroundView backgroundView3 = themePreviewActivity.backgroundImage;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str5 = themePreviewActivity.imageFilter;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = themePreviewActivity.selectedPattern;
                                                    backgroundView3.imageReceiver.setImage(forDocument, str5, null, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                    backgroundView3.onNewImageSet();
                                                }
                                                themePreviewActivity.backgroundCheckBoxView[1].setChecked(themePreviewActivity.selectedPattern != null, false);
                                                float f13 = themePreviewActivity.previousIntensity;
                                                themePreviewActivity.currentIntensity = f13;
                                                themePreviewActivity.intensitySeekBar.setProgress(f13);
                                                themePreviewActivity.backgroundImage.getImageReceiver().setAlpha(themePreviewActivity.currentIntensity);
                                                themePreviewActivity.updateButtonState$1$1();
                                                themePreviewActivity.updateSelectedPattern();
                                            }
                                            if (themePreviewActivity.screenType != 2) {
                                                if (themePreviewActivity.selectedPattern == null) {
                                                    if (themePreviewActivity.isMotion) {
                                                        themePreviewActivity.isMotion = false;
                                                        themePreviewActivity.backgroundCheckBoxView[0].setChecked(false, true);
                                                        themePreviewActivity.animateMotionChange();
                                                    }
                                                    themePreviewActivity.updateMotionButton();
                                                }
                                                themePreviewActivity.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity.showPatternsView(i415, false);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                        if (themePreviewActivity2.patternViewAnimation == null) {
                                            if (themePreviewActivity2.screenType != 2) {
                                                themePreviewActivity2.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity2.showPatternsView(i8, false);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        TextureViewContainer textureViewContainer6 = new TextureViewContainer(context, this, 1);
                        ViewGroup[] viewGroupArr3 = this.patternsButtonsContainer;
                        viewGroupArr3[i8] = textureViewContainer6;
                        textureViewContainer6.setWillNotDraw(false);
                        viewGroupArr3[i8].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        viewGroupArr3[i8].setClickable(true);
                        f3 = 21.0f;
                        frameLayoutArr[i8].addView(viewGroupArr3[i8], LayoutHelper.createFrame(-1, 51, 80));
                        TextView textView18 = new TextView(context);
                        TextView[] textViewArr5 = this.patternsCancelButton;
                        textViewArr5[i8] = textView18;
                        textView18.setTextSize(1, 15.0f);
                        textViewArr5[i8].setTypeface(AndroidUtilities.bold());
                        TextView textView19 = textViewArr5[i8];
                        int i415 = Theme.key_chat_fieldOverlayText;
                        textView19.setTextColor(getThemedColor(i415));
                        textViewArr5[i8].setText(LocaleController.getString(R.string.Cancel));
                        textViewArr5[i8].setGravity(17);
                        textViewArr5[i8].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView110 = textViewArr5[i8];
                        int i416 = Theme.key_listSelector;
                        textView110.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i416), 0));
                        viewGroupArr3[i8].addView(textViewArr5[i8], LayoutHelper.createFrame(-2, -1, 51));
                        final int i417 = 0;
                        textViewArr5[i8].setOnClickListener(new View.OnClickListener(this) {
                            public final ThemePreviewActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i417) {
                                    case 0:
                                        ThemePreviewActivity themePreviewActivity = this.f$0;
                                        if (themePreviewActivity.patternViewAnimation == null) {
                                            int i418 = i8;
                                            if (i418 == 0) {
                                                themePreviewActivity.backgroundRotation = themePreviewActivity.previousBackgroundRotation;
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor3, 3, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor2, 2, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor1, 1, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundColor, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = themePreviewActivity.previousSelectedPattern;
                                                themePreviewActivity.selectedPattern = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    themePreviewActivity.backgroundImage.setImageDrawable(null);
                                                } else {
                                                    ThemePreviewActivity.BackgroundView backgroundView3 = themePreviewActivity.backgroundImage;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str5 = themePreviewActivity.imageFilter;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = themePreviewActivity.selectedPattern;
                                                    backgroundView3.imageReceiver.setImage(forDocument, str5, null, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                    backgroundView3.onNewImageSet();
                                                }
                                                themePreviewActivity.backgroundCheckBoxView[1].setChecked(themePreviewActivity.selectedPattern != null, false);
                                                float f13 = themePreviewActivity.previousIntensity;
                                                themePreviewActivity.currentIntensity = f13;
                                                themePreviewActivity.intensitySeekBar.setProgress(f13);
                                                themePreviewActivity.backgroundImage.getImageReceiver().setAlpha(themePreviewActivity.currentIntensity);
                                                themePreviewActivity.updateButtonState$1$1();
                                                themePreviewActivity.updateSelectedPattern();
                                            }
                                            if (themePreviewActivity.screenType != 2) {
                                                if (themePreviewActivity.selectedPattern == null) {
                                                    if (themePreviewActivity.isMotion) {
                                                        themePreviewActivity.isMotion = false;
                                                        themePreviewActivity.backgroundCheckBoxView[0].setChecked(false, true);
                                                        themePreviewActivity.animateMotionChange();
                                                    }
                                                    themePreviewActivity.updateMotionButton();
                                                }
                                                themePreviewActivity.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity.showPatternsView(i418, false);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                        if (themePreviewActivity2.patternViewAnimation == null) {
                                            if (themePreviewActivity2.screenType != 2) {
                                                themePreviewActivity2.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity2.showPatternsView(i8, false);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        TextView textView111 = new TextView(context);
                        TextView[] textViewArr6 = this.patternsSaveButton;
                        textViewArr6[i8] = textView111;
                        textView111.setTextSize(1, 15.0f);
                        textViewArr6[i8].setTypeface(AndroidUtilities.bold());
                        textViewArr6[i8].setTextColor(getThemedColor(i415));
                        textViewArr6[i8].setText(LocaleController.getString(R.string.ApplyTheme));
                        textViewArr6[i8].setGravity(17);
                        textViewArr6[i8].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        textViewArr6[i8].setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i416), 0));
                        viewGroupArr3[i8].addView(textViewArr6[i8], LayoutHelper.createFrame(-2, -1, 53));
                        TextView textView112 = textViewArr6[i8];
                        r14 = 1;
                        final int c4 = 1 == true ? 1 : 0;
                        textView112.setOnClickListener(new View.OnClickListener(this) {
                            public final ThemePreviewActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (c4) {
                                    case 0:
                                        ThemePreviewActivity themePreviewActivity = this.f$0;
                                        if (themePreviewActivity.patternViewAnimation == null) {
                                            int i418 = i8;
                                            if (i418 == 0) {
                                                themePreviewActivity.backgroundRotation = themePreviewActivity.previousBackgroundRotation;
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor3, 3, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor2, 2, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor1, 1, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundColor, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = themePreviewActivity.previousSelectedPattern;
                                                themePreviewActivity.selectedPattern = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    themePreviewActivity.backgroundImage.setImageDrawable(null);
                                                } else {
                                                    ThemePreviewActivity.BackgroundView backgroundView3 = themePreviewActivity.backgroundImage;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str5 = themePreviewActivity.imageFilter;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = themePreviewActivity.selectedPattern;
                                                    backgroundView3.imageReceiver.setImage(forDocument, str5, null, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                    backgroundView3.onNewImageSet();
                                                }
                                                themePreviewActivity.backgroundCheckBoxView[1].setChecked(themePreviewActivity.selectedPattern != null, false);
                                                float f13 = themePreviewActivity.previousIntensity;
                                                themePreviewActivity.currentIntensity = f13;
                                                themePreviewActivity.intensitySeekBar.setProgress(f13);
                                                themePreviewActivity.backgroundImage.getImageReceiver().setAlpha(themePreviewActivity.currentIntensity);
                                                themePreviewActivity.updateButtonState$1$1();
                                                themePreviewActivity.updateSelectedPattern();
                                            }
                                            if (themePreviewActivity.screenType != 2) {
                                                if (themePreviewActivity.selectedPattern == null) {
                                                    if (themePreviewActivity.isMotion) {
                                                        themePreviewActivity.isMotion = false;
                                                        themePreviewActivity.backgroundCheckBoxView[0].setChecked(false, true);
                                                        themePreviewActivity.animateMotionChange();
                                                    }
                                                    themePreviewActivity.updateMotionButton();
                                                }
                                                themePreviewActivity.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity.showPatternsView(i418, false);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                        if (themePreviewActivity2.patternViewAnimation == null) {
                                            if (themePreviewActivity2.screenType != 2) {
                                                themePreviewActivity2.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity2.showPatternsView(i8, false);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    if (i8 == r14) {
                        TextView textView20 = new TextView(context);
                        this.patternTitleView = textView20;
                        textView20.setLines(r14);
                        this.patternTitleView.setSingleLine(r14);
                        this.patternTitleView.setText(LocaleController.getString(R.string.BackgroundChoosePattern));
                        this.patternTitleView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                        this.patternTitleView.setTextSize(r14, 20.0f);
                        this.patternTitleView.setTypeface(AndroidUtilities.bold());
                        this.patternTitleView.setPadding(AndroidUtilities.dp(f3), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(f3), AndroidUtilities.dp(8.0f));
                        this.patternTitleView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                        this.patternTitleView.setGravity(16);
                        frameLayoutArr[i8].addView(this.patternTitleView, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                        MessageSeenView.AnonymousClass1 anonymousClass6 = new MessageSeenView.AnonymousClass1(context);
                        this.patternsListView = anonymousClass6;
                        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(0, false);
                        this.patternsLayoutManager = linearLayoutManager2;
                        anonymousClass6.setLayoutManager(linearLayoutManager2);
                        MessageSeenView.AnonymousClass1 anonymousClass7 = this.patternsListView;
                        PatternsAdapter patternsAdapter2 = new PatternsAdapter(context, this);
                        this.patternsAdapter = patternsAdapter2;
                        anonymousClass7.setAdapter(patternsAdapter2);
                        this.patternsListView.addItemDecoration(new FiltersView.AnonymousClass2(9));
                        frameLayoutArr[i8].addView(this.patternsListView, LayoutHelper.createFrame(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                        this.patternsListView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 21));
                        HeaderCell headerCell2 = new HeaderCell(context);
                        this.intensityCell = headerCell2;
                        headerCell2.setText(LocaleController.getString(R.string.BackgroundIntensity));
                        frameLayoutArr[i8].addView(this.intensityCell, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                        MaxFileSizeCell.AnonymousClass1 anonymousClass8 = new MaxFileSizeCell.AnonymousClass1(context, (AnonymousClass1) getResourceProvider());
                        this.intensitySeekBar = anonymousClass8;
                        anonymousClass8.setProgress(this.currentIntensity);
                        this.intensitySeekBar.setReportChanges(true);
                        this.intensitySeekBar.setDelegate(new PhotoViewer.AnonymousClass18(this, 29));
                        frameLayoutArr[i8].addView(this.intensitySeekBar, LayoutHelper.createFrame(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                    } else {
                        ColorPicker colorPicker3 = new ColorPicker(context, this.editingTheme, new AnonymousClass26());
                        this.colorPicker = colorPicker3;
                        colorPicker3.setResourcesProvider(getResourceProvider());
                        if (i34 == 1) {
                            frameLayoutArr[i8].addView(this.colorPicker, LayoutHelper.createFrame(-1, -1, 1));
                            if (themeInfo.isDark()) {
                                this.colorPicker.setMinBrightness(0.2f);
                            } else {
                                this.colorPicker.setMinBrightness(0.05f);
                                this.colorPicker.setMaxBrightness(0.8f);
                            }
                            if (themeAccent != null) {
                                if (themeAccent.accentColor2 != 0) {
                                    i11 = 2;
                                } else {
                                    i11 = 1;
                                }
                                ColorPicker colorPicker4 = this.colorPicker;
                                hasChanges(1);
                                colorPicker4.setType(1, 2, i11, false);
                                this.colorPicker.setColor(themeAccent.accentColor, 0);
                                i12 = themeAccent.accentColor2;
                                if (i12 != 0) {
                                    this.colorPicker.setColor(i12, 1);
                                }
                            }
                        } else {
                            frameLayoutArr[i8].addView(this.colorPicker, LayoutHelper.createFrame(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                        }
                    }
                    i8++;
                    i34 = i34;
                }
            } else {
                this.isBlurred = false;
                i8 = 0;
                while (i8 < 2) {
                    frameLayout = new FrameLayout(context) {
                        @Override
                        public final void onDraw(Canvas canvas) {
                            int i418 = i8;
                            Rect rect4 = rect;
                            ThemePreviewActivity themePreviewActivity = ThemePreviewActivity.this;
                            if (i418 == 0) {
                                themePreviewActivity.sheetDrawable.setBounds(themePreviewActivity.colorPicker.getLeft() - rect4.left, 0, themePreviewActivity.colorPicker.getRight() + rect4.right, getMeasuredHeight());
                            } else {
                                themePreviewActivity.sheetDrawable.setBounds(-rect4.left, 0, getMeasuredWidth() + rect4.right, getMeasuredHeight());
                            }
                            themePreviewActivity.sheetDrawable.draw(canvas);
                        }
                    };
                    frameLayoutArr = this.patternLayout;
                    frameLayoutArr[i8] = frameLayout;
                    if (i8 != 1) {
                        frameLayout.setVisibility(4);
                    } else {
                        frameLayout.setVisibility(4);
                    }
                    frameLayoutArr[i8].setWillNotDraw(false);
                    if (i34 == 2) {
                        if (i8 == 0) {
                            i13 = 321;
                        } else {
                            i13 = 316;
                        }
                        layoutParamsCreateFrame = LayoutHelper.createFrame(-1, i13, 83);
                    } else {
                        if (i8 == 0) {
                            i9 = 273;
                        } else {
                            i9 = 316;
                        }
                        layoutParamsCreateFrame = LayoutHelper.createFrame(-1, i9, 83);
                    }
                    if (i8 == 0) {
                        f2 = i34 != 2 ? 273 : 321;
                    } else {
                        f2 = 316.0f;
                    }
                    layoutParamsCreateFrame.height = AndroidUtilities.dp(f2);
                    if (insideBottomSheet()) {
                        layoutParamsCreateFrame.height += AndroidUtilities.navigationBarHeight;
                    }
                    if (i8 == 0) {
                        Drawable drawable3 = this.sheetDrawable;
                        Rect rect4 = AndroidUtilities.rectTmp2;
                        drawable3.getPadding(rect4);
                        layoutParamsCreateFrame.height = AndroidUtilities.dp(12.0f) + rect4.top + layoutParamsCreateFrame.height;
                    }
                    GLSurfaceView gLSurfaceView3 = frameLayoutArr[i8];
                    if (i8 == 0) {
                        iDp = AndroidUtilities.dp(12.0f) + rect.top;
                    } else {
                        iDp = 0;
                    }
                    if (insideBottomSheet()) {
                        i10 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i10 = 0;
                    }
                    gLSurfaceView3.setPadding(0, iDp, 0, i10);
                    this.page2.addView(frameLayoutArr[i8], layoutParamsCreateFrame);
                    r14 = 1;
                    if (i8 != 1) {
                        TextureViewContainer textureViewContainer7 = new TextureViewContainer(context, this, 1);
                        ViewGroup[] viewGroupArr4 = this.patternsButtonsContainer;
                        viewGroupArr4[i8] = textureViewContainer7;
                        textureViewContainer7.setWillNotDraw(false);
                        viewGroupArr4[i8].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        viewGroupArr4[i8].setClickable(true);
                        f3 = 21.0f;
                        frameLayoutArr[i8].addView(viewGroupArr4[i8], LayoutHelper.createFrame(-1, 51, 80));
                        TextView textView113 = new TextView(context);
                        TextView[] textViewArr7 = this.patternsCancelButton;
                        textViewArr7[i8] = textView113;
                        textView113.setTextSize(1, 15.0f);
                        textViewArr7[i8].setTypeface(AndroidUtilities.bold());
                        TextView textView114 = textViewArr7[i8];
                        int i418 = Theme.key_chat_fieldOverlayText;
                        textView114.setTextColor(getThemedColor(i418));
                        textViewArr7[i8].setText(LocaleController.getString(R.string.Cancel));
                        textViewArr7[i8].setGravity(17);
                        textViewArr7[i8].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView115 = textViewArr7[i8];
                        int i419 = Theme.key_listSelector;
                        textView115.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i419), 0));
                        viewGroupArr4[i8].addView(textViewArr7[i8], LayoutHelper.createFrame(-2, -1, 51));
                        final int i4110 = 0;
                        textViewArr7[i8].setOnClickListener(new View.OnClickListener(this) {
                            public final ThemePreviewActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i4110) {
                                    case 0:
                                        ThemePreviewActivity themePreviewActivity = this.f$0;
                                        if (themePreviewActivity.patternViewAnimation == null) {
                                            int i4111 = i8;
                                            if (i4111 == 0) {
                                                themePreviewActivity.backgroundRotation = themePreviewActivity.previousBackgroundRotation;
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor3, 3, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor2, 2, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor1, 1, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundColor, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = themePreviewActivity.previousSelectedPattern;
                                                themePreviewActivity.selectedPattern = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    themePreviewActivity.backgroundImage.setImageDrawable(null);
                                                } else {
                                                    ThemePreviewActivity.BackgroundView backgroundView3 = themePreviewActivity.backgroundImage;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str5 = themePreviewActivity.imageFilter;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = themePreviewActivity.selectedPattern;
                                                    backgroundView3.imageReceiver.setImage(forDocument, str5, null, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                    backgroundView3.onNewImageSet();
                                                }
                                                themePreviewActivity.backgroundCheckBoxView[1].setChecked(themePreviewActivity.selectedPattern != null, false);
                                                float f13 = themePreviewActivity.previousIntensity;
                                                themePreviewActivity.currentIntensity = f13;
                                                themePreviewActivity.intensitySeekBar.setProgress(f13);
                                                themePreviewActivity.backgroundImage.getImageReceiver().setAlpha(themePreviewActivity.currentIntensity);
                                                themePreviewActivity.updateButtonState$1$1();
                                                themePreviewActivity.updateSelectedPattern();
                                            }
                                            if (themePreviewActivity.screenType != 2) {
                                                if (themePreviewActivity.selectedPattern == null) {
                                                    if (themePreviewActivity.isMotion) {
                                                        themePreviewActivity.isMotion = false;
                                                        themePreviewActivity.backgroundCheckBoxView[0].setChecked(false, true);
                                                        themePreviewActivity.animateMotionChange();
                                                    }
                                                    themePreviewActivity.updateMotionButton();
                                                }
                                                themePreviewActivity.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity.showPatternsView(i4111, false);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                        if (themePreviewActivity2.patternViewAnimation == null) {
                                            if (themePreviewActivity2.screenType != 2) {
                                                themePreviewActivity2.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity2.showPatternsView(i8, false);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        TextView textView116 = new TextView(context);
                        TextView[] textViewArr8 = this.patternsSaveButton;
                        textViewArr8[i8] = textView116;
                        textView116.setTextSize(1, 15.0f);
                        textViewArr8[i8].setTypeface(AndroidUtilities.bold());
                        textViewArr8[i8].setTextColor(getThemedColor(i418));
                        textViewArr8[i8].setText(LocaleController.getString(R.string.ApplyTheme));
                        textViewArr8[i8].setGravity(17);
                        textViewArr8[i8].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        textViewArr8[i8].setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i419), 0));
                        viewGroupArr4[i8].addView(textViewArr8[i8], LayoutHelper.createFrame(-2, -1, 53));
                        TextView textView117 = textViewArr8[i8];
                        r14 = 1;
                        final int c5 = 1 == true ? 1 : 0;
                        textView117.setOnClickListener(new View.OnClickListener(this) {
                            public final ThemePreviewActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (c5) {
                                    case 0:
                                        ThemePreviewActivity themePreviewActivity = this.f$0;
                                        if (themePreviewActivity.patternViewAnimation == null) {
                                            int i4111 = i8;
                                            if (i4111 == 0) {
                                                themePreviewActivity.backgroundRotation = themePreviewActivity.previousBackgroundRotation;
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor3, 3, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor2, 2, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor1, 1, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundColor, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = themePreviewActivity.previousSelectedPattern;
                                                themePreviewActivity.selectedPattern = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    themePreviewActivity.backgroundImage.setImageDrawable(null);
                                                } else {
                                                    ThemePreviewActivity.BackgroundView backgroundView3 = themePreviewActivity.backgroundImage;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str5 = themePreviewActivity.imageFilter;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = themePreviewActivity.selectedPattern;
                                                    backgroundView3.imageReceiver.setImage(forDocument, str5, null, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                    backgroundView3.onNewImageSet();
                                                }
                                                themePreviewActivity.backgroundCheckBoxView[1].setChecked(themePreviewActivity.selectedPattern != null, false);
                                                float f13 = themePreviewActivity.previousIntensity;
                                                themePreviewActivity.currentIntensity = f13;
                                                themePreviewActivity.intensitySeekBar.setProgress(f13);
                                                themePreviewActivity.backgroundImage.getImageReceiver().setAlpha(themePreviewActivity.currentIntensity);
                                                themePreviewActivity.updateButtonState$1$1();
                                                themePreviewActivity.updateSelectedPattern();
                                            }
                                            if (themePreviewActivity.screenType != 2) {
                                                if (themePreviewActivity.selectedPattern == null) {
                                                    if (themePreviewActivity.isMotion) {
                                                        themePreviewActivity.isMotion = false;
                                                        themePreviewActivity.backgroundCheckBoxView[0].setChecked(false, true);
                                                        themePreviewActivity.animateMotionChange();
                                                    }
                                                    themePreviewActivity.updateMotionButton();
                                                }
                                                themePreviewActivity.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity.showPatternsView(i4111, false);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                        if (themePreviewActivity2.patternViewAnimation == null) {
                                            if (themePreviewActivity2.screenType != 2) {
                                                themePreviewActivity2.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity2.showPatternsView(i8, false);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        TextureViewContainer textureViewContainer8 = new TextureViewContainer(context, this, 1);
                        ViewGroup[] viewGroupArr5 = this.patternsButtonsContainer;
                        viewGroupArr5[i8] = textureViewContainer8;
                        textureViewContainer8.setWillNotDraw(false);
                        viewGroupArr5[i8].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        viewGroupArr5[i8].setClickable(true);
                        f3 = 21.0f;
                        frameLayoutArr[i8].addView(viewGroupArr5[i8], LayoutHelper.createFrame(-1, 51, 80));
                        TextView textView118 = new TextView(context);
                        TextView[] textViewArr9 = this.patternsCancelButton;
                        textViewArr9[i8] = textView118;
                        textView118.setTextSize(1, 15.0f);
                        textViewArr9[i8].setTypeface(AndroidUtilities.bold());
                        TextView textView119 = textViewArr9[i8];
                        int i4111 = Theme.key_chat_fieldOverlayText;
                        textView119.setTextColor(getThemedColor(i4111));
                        textViewArr9[i8].setText(LocaleController.getString(R.string.Cancel));
                        textViewArr9[i8].setGravity(17);
                        textViewArr9[i8].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView1110 = textViewArr9[i8];
                        int i4112 = Theme.key_listSelector;
                        textView1110.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i4112), 0));
                        viewGroupArr5[i8].addView(textViewArr9[i8], LayoutHelper.createFrame(-2, -1, 51));
                        final int i4113 = 0;
                        textViewArr9[i8].setOnClickListener(new View.OnClickListener(this) {
                            public final ThemePreviewActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i4113) {
                                    case 0:
                                        ThemePreviewActivity themePreviewActivity = this.f$0;
                                        if (themePreviewActivity.patternViewAnimation == null) {
                                            int i4114 = i8;
                                            if (i4114 == 0) {
                                                themePreviewActivity.backgroundRotation = themePreviewActivity.previousBackgroundRotation;
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor3, 3, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor2, 2, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor1, 1, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundColor, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = themePreviewActivity.previousSelectedPattern;
                                                themePreviewActivity.selectedPattern = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    themePreviewActivity.backgroundImage.setImageDrawable(null);
                                                } else {
                                                    ThemePreviewActivity.BackgroundView backgroundView3 = themePreviewActivity.backgroundImage;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str5 = themePreviewActivity.imageFilter;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = themePreviewActivity.selectedPattern;
                                                    backgroundView3.imageReceiver.setImage(forDocument, str5, null, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                    backgroundView3.onNewImageSet();
                                                }
                                                themePreviewActivity.backgroundCheckBoxView[1].setChecked(themePreviewActivity.selectedPattern != null, false);
                                                float f13 = themePreviewActivity.previousIntensity;
                                                themePreviewActivity.currentIntensity = f13;
                                                themePreviewActivity.intensitySeekBar.setProgress(f13);
                                                themePreviewActivity.backgroundImage.getImageReceiver().setAlpha(themePreviewActivity.currentIntensity);
                                                themePreviewActivity.updateButtonState$1$1();
                                                themePreviewActivity.updateSelectedPattern();
                                            }
                                            if (themePreviewActivity.screenType != 2) {
                                                if (themePreviewActivity.selectedPattern == null) {
                                                    if (themePreviewActivity.isMotion) {
                                                        themePreviewActivity.isMotion = false;
                                                        themePreviewActivity.backgroundCheckBoxView[0].setChecked(false, true);
                                                        themePreviewActivity.animateMotionChange();
                                                    }
                                                    themePreviewActivity.updateMotionButton();
                                                }
                                                themePreviewActivity.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity.showPatternsView(i4114, false);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                        if (themePreviewActivity2.patternViewAnimation == null) {
                                            if (themePreviewActivity2.screenType != 2) {
                                                themePreviewActivity2.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity2.showPatternsView(i8, false);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        TextView textView1111 = new TextView(context);
                        TextView[] textViewArr10 = this.patternsSaveButton;
                        textViewArr10[i8] = textView1111;
                        textView1111.setTextSize(1, 15.0f);
                        textViewArr10[i8].setTypeface(AndroidUtilities.bold());
                        textViewArr10[i8].setTextColor(getThemedColor(i4111));
                        textViewArr10[i8].setText(LocaleController.getString(R.string.ApplyTheme));
                        textViewArr10[i8].setGravity(17);
                        textViewArr10[i8].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        textViewArr10[i8].setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i4112), 0));
                        viewGroupArr5[i8].addView(textViewArr10[i8], LayoutHelper.createFrame(-2, -1, 53));
                        TextView textView1112 = textViewArr10[i8];
                        r14 = 1;
                        final int c6 = 1 == true ? 1 : 0;
                        textView1112.setOnClickListener(new View.OnClickListener(this) {
                            public final ThemePreviewActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (c6) {
                                    case 0:
                                        ThemePreviewActivity themePreviewActivity = this.f$0;
                                        if (themePreviewActivity.patternViewAnimation == null) {
                                            int i4114 = i8;
                                            if (i4114 == 0) {
                                                themePreviewActivity.backgroundRotation = themePreviewActivity.previousBackgroundRotation;
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor3, 3, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor2, 2, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor1, 1, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundColor, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = themePreviewActivity.previousSelectedPattern;
                                                themePreviewActivity.selectedPattern = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    themePreviewActivity.backgroundImage.setImageDrawable(null);
                                                } else {
                                                    ThemePreviewActivity.BackgroundView backgroundView3 = themePreviewActivity.backgroundImage;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str5 = themePreviewActivity.imageFilter;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = themePreviewActivity.selectedPattern;
                                                    backgroundView3.imageReceiver.setImage(forDocument, str5, null, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                    backgroundView3.onNewImageSet();
                                                }
                                                themePreviewActivity.backgroundCheckBoxView[1].setChecked(themePreviewActivity.selectedPattern != null, false);
                                                float f13 = themePreviewActivity.previousIntensity;
                                                themePreviewActivity.currentIntensity = f13;
                                                themePreviewActivity.intensitySeekBar.setProgress(f13);
                                                themePreviewActivity.backgroundImage.getImageReceiver().setAlpha(themePreviewActivity.currentIntensity);
                                                themePreviewActivity.updateButtonState$1$1();
                                                themePreviewActivity.updateSelectedPattern();
                                            }
                                            if (themePreviewActivity.screenType != 2) {
                                                if (themePreviewActivity.selectedPattern == null) {
                                                    if (themePreviewActivity.isMotion) {
                                                        themePreviewActivity.isMotion = false;
                                                        themePreviewActivity.backgroundCheckBoxView[0].setChecked(false, true);
                                                        themePreviewActivity.animateMotionChange();
                                                    }
                                                    themePreviewActivity.updateMotionButton();
                                                }
                                                themePreviewActivity.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity.showPatternsView(i4114, false);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                        if (themePreviewActivity2.patternViewAnimation == null) {
                                            if (themePreviewActivity2.screenType != 2) {
                                                themePreviewActivity2.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity2.showPatternsView(i8, false);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    if (i8 == r14) {
                        TextView textView21 = new TextView(context);
                        this.patternTitleView = textView21;
                        textView21.setLines(r14);
                        this.patternTitleView.setSingleLine(r14);
                        this.patternTitleView.setText(LocaleController.getString(R.string.BackgroundChoosePattern));
                        this.patternTitleView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                        this.patternTitleView.setTextSize(r14, 20.0f);
                        this.patternTitleView.setTypeface(AndroidUtilities.bold());
                        this.patternTitleView.setPadding(AndroidUtilities.dp(f3), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(f3), AndroidUtilities.dp(8.0f));
                        this.patternTitleView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                        this.patternTitleView.setGravity(16);
                        frameLayoutArr[i8].addView(this.patternTitleView, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                        MessageSeenView.AnonymousClass1 anonymousClass20 = new MessageSeenView.AnonymousClass1(context);
                        this.patternsListView = anonymousClass20;
                        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(0, false);
                        this.patternsLayoutManager = linearLayoutManager3;
                        anonymousClass20.setLayoutManager(linearLayoutManager3);
                        MessageSeenView.AnonymousClass1 anonymousClass21 = this.patternsListView;
                        PatternsAdapter patternsAdapter3 = new PatternsAdapter(context, this);
                        this.patternsAdapter = patternsAdapter3;
                        anonymousClass21.setAdapter(patternsAdapter3);
                        this.patternsListView.addItemDecoration(new FiltersView.AnonymousClass2(9));
                        frameLayoutArr[i8].addView(this.patternsListView, LayoutHelper.createFrame(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                        this.patternsListView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 21));
                        HeaderCell headerCell3 = new HeaderCell(context);
                        this.intensityCell = headerCell3;
                        headerCell3.setText(LocaleController.getString(R.string.BackgroundIntensity));
                        frameLayoutArr[i8].addView(this.intensityCell, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                        MaxFileSizeCell.AnonymousClass1 anonymousClass22 = new MaxFileSizeCell.AnonymousClass1(context, (AnonymousClass1) getResourceProvider());
                        this.intensitySeekBar = anonymousClass22;
                        anonymousClass22.setProgress(this.currentIntensity);
                        this.intensitySeekBar.setReportChanges(true);
                        this.intensitySeekBar.setDelegate(new PhotoViewer.AnonymousClass18(this, 29));
                        frameLayoutArr[i8].addView(this.intensitySeekBar, LayoutHelper.createFrame(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                    } else {
                        ColorPicker colorPicker5 = new ColorPicker(context, this.editingTheme, new AnonymousClass26());
                        this.colorPicker = colorPicker5;
                        colorPicker5.setResourcesProvider(getResourceProvider());
                        if (i34 == 1) {
                            frameLayoutArr[i8].addView(this.colorPicker, LayoutHelper.createFrame(-1, -1, 1));
                            if (themeInfo.isDark()) {
                                this.colorPicker.setMinBrightness(0.2f);
                            } else {
                                this.colorPicker.setMinBrightness(0.05f);
                                this.colorPicker.setMaxBrightness(0.8f);
                            }
                            if (themeAccent != null) {
                                if (themeAccent.accentColor2 != 0) {
                                    i11 = 2;
                                } else {
                                    i11 = 1;
                                }
                                ColorPicker colorPicker6 = this.colorPicker;
                                hasChanges(1);
                                colorPicker6.setType(1, 2, i11, false);
                                this.colorPicker.setColor(themeAccent.accentColor, 0);
                                i12 = themeAccent.accentColor2;
                                if (i12 != 0) {
                                    this.colorPicker.setColor(i12, 1);
                                }
                            }
                        } else {
                            frameLayoutArr[i8].addView(this.colorPicker, LayoutHelper.createFrame(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                        }
                    }
                    i8++;
                    i34 = i34;
                }
            }
            i14 = i34;
            updateButtonState$1$1();
            if (!this.backgroundImage.getImageReceiver().hasBitmapImage()) {
                this.page2.setBackgroundColor(-16777216);
            }
            if (i14 != 1) {
                this.backgroundImage.getImageReceiver().setCrossfadeWithOldImage(true);
            }
        } else {
            if (i34 == 2) {
                AnonymousClass13 anonymousClass127 = new AnonymousClass13(this, context, insideBottomSheet());
                this.bottomOverlayChat = anonymousClass127;
                anonymousClass127.setWillNotDraw(false);
                AnonymousClass13 anonymousClass128 = this.bottomOverlayChat;
                int iDp16 = AndroidUtilities.dp(12.0f);
                c = 2;
                int iDp17 = AndroidUtilities.dp(12.0f);
                int iDp18 = AndroidUtilities.dp(12.0f);
                int iDp19 = AndroidUtilities.dp(12.0f);
                if (insideBottomSheet()) {
                    i22 = AndroidUtilities.navigationBarHeight;
                } else {
                    i22 = 0;
                }
                anonymousClass128.setPadding(iDp16, iDp17, iDp18, iDp19 + i22);
                this.page2.addView(this.bottomOverlayChat, LayoutHelper.createFrame(-1, 0, 81));
                BlurButton blurButton5 = new BlurButton(context, this);
                this.applyButton1 = blurButton5;
                ScaleStateListAnimator.apply(blurButton5, 0.033f, 1.2f);
                updateApplyButton1(false);
                this.applyButton1.setOnClickListener(new View.OnClickListener(this) {
                    public final ThemePreviewActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i30) {
                            case 0:
                                this.f$0.cancelThemeApply(false);
                                break;
                            case 1:
                                this.f$0.lambda$createView$18$1$2();
                                break;
                            case 2:
                                this.f$0.dropDownContainer.toggleSubMenu(null, null);
                                break;
                            case 3:
                                this.f$0.applyWallpaperBackground(false);
                                break;
                            default:
                                this.f$0.applyWallpaperBackground(true);
                                break;
                        }
                    }
                });
                if (this.dialogId > 0) {
                    this.bottomOverlayChat.addView(this.applyButton1, LayoutHelper.createFrame(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                } else {
                    this.bottomOverlayChat.addView(this.applyButton1, LayoutHelper.createFrame(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                }
                if (this.shouldShowBrightnessControll) {
                    AnonymousClass14 anonymousClass129 = new AnonymousClass14(this, (Activity) getContext());
                    this.dimmingSliderContainer = anonymousClass129;
                    anonymousClass129.setPadding(AndroidUtilities.dp(f), AndroidUtilities.dp(f), AndroidUtilities.dp(f), AndroidUtilities.dp(f));
                    this.page2.addView(this.dimmingSliderContainer, LayoutHelper.createFrame(222, 76, 49));
                    ?? r8 = new SliderView((Activity) getContext()) {
                        @Override
                        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                            if (getParent() != null) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    };
                    this.dimmingSlider = r8;
                    r8.setValue(this.dimAmount);
                    setMinMax();
                    setOnValueChange(new VoIPFragment$$ExternalSyntheticLambda7(this, 22));
                    this.dimmingSliderContainer.addView(this.dimmingSlider);
                    dayNightSwitchDelegate = this.onSwitchDayNightDelegate;
                    if (dayNightSwitchDelegate != null) {
                        AnonymousClass15 anonymousClass1210 = this.dimmingSlider;
                        if (dayNightSwitchDelegate.isDark()) {
                            i23 = 0;
                        } else {
                            i23 = 8;
                        }
                        anonymousClass1210.setVisibility(i23);
                        AnonymousClass15 anonymousClass1211 = this.dimmingSlider;
                        if (this.onSwitchDayNightDelegate.isDark()) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        anonymousClass1211.setAlpha(f10);
                        AnonymousClass15 anonymousClass1212 = this.dimmingSlider;
                        if (this.onSwitchDayNightDelegate.isDark()) {
                            f11 = this.dimAmount;
                        } else {
                            f11 = 0.0f;
                        }
                        anonymousClass1212.setValue(f11);
                    }
                }
            } else {
                c = 2;
            }
            rect = new Rect();
            Drawable drawableMutate4 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            this.sheetDrawable = drawableMutate4;
            drawableMutate4.getPadding(rect);
            this.sheetDrawable.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_windowBackgroundWhite), PorterDuff.Mode.MULTIPLY));
            textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            obj = this.currentWallpaper;
            if (i34 != 1) {
                if (obj instanceof WallpapersListActivity.ColorWallpaper) {
                }
                i4 = 3;
            } else {
                if (obj instanceof WallpapersListActivity.ColorWallpaper) {
                }
                i4 = 3;
            }
            strArr = new String[i4];
            iArr = new int[i4];
            this.backgroundCheckBoxView = new WallpaperCheckBoxView[i4];
            if (i4 != 0) {
                this.backgroundButtonsContainer = new FrameLayout(context);
                if (i34 != 1) {
                    strArr[0] = LocaleController.getString(R.string.BackgroundColors);
                    strArr[1] = LocaleController.getString(R.string.BackgroundPattern);
                    strArr[c] = LocaleController.getString(R.string.BackgroundMotion);
                } else {
                    strArr[0] = LocaleController.getString(R.string.BackgroundColors);
                    strArr[1] = LocaleController.getString(R.string.BackgroundPattern);
                    strArr[c] = LocaleController.getString(R.string.BackgroundMotion);
                }
                iMax2 = 0;
                i20 = 0;
                while (i20 < i4) {
                    int iCeil5 = (int) Math.ceil(textPaint.measureText(strArr[i20]));
                    iArr[i20] = iCeil5;
                    iMax2 = Math.max(iMax2, iCeil5);
                    i20++;
                    themeInfo2 = themeInfo2;
                }
                themeInfo = themeInfo2;
                ?? r9 = new FrameLayout(context, this, i33) {
                    public final int $r8$classId;
                    public final RectF rect;
                    public final ThemePreviewActivity this$0;

                    {
                        super(context);
                        this.$r8$classId = i33;
                        switch (i33) {
                            case 1:
                                this.this$0 = this;
                                super(context);
                                this.rect = new RectF();
                                break;
                            default:
                                this.this$0 = this;
                                this.rect = new RectF();
                                break;
                        }
                    }

                    @Override
                    public final void onDraw(Canvas canvas) {
                        switch (this.$r8$classId) {
                            case 0:
                                RectF rectF = this.rect;
                                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                                ThemePreviewActivity themePreviewActivity = this.this$0;
                                Theme.applyServiceShaderMatrixForView(themePreviewActivity.backgroundPlayAnimationView, themePreviewActivity.backgroundImage, themePreviewActivity.themeDelegate);
                                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity.themeDelegate.getPaint("paintChatActionBackground"));
                                if (Theme.hasGradientService()) {
                                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity.themeDelegate.getPaint("paintChatActionBackgroundDarken"));
                                }
                                break;
                            default:
                                RectF rectF2 = this.rect;
                                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                                ThemePreviewActivity themePreviewActivity2 = this.this$0;
                                Theme.applyServiceShaderMatrixForView(themePreviewActivity2.messagesPlayAnimationView, themePreviewActivity2.backgroundImage, themePreviewActivity2.themeDelegate);
                                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity2.themeDelegate.getPaint("paintChatActionBackground"));
                                if (Theme.hasGradientService()) {
                                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity2.themeDelegate.getPaint("paintChatActionBackgroundDarken"));
                                }
                                break;
                        }
                    }
                };
                this.backgroundPlayAnimationView = r9;
                r9.setWillNotDraw(false);
                AnonymousClass16 anonymousClass1213 = this.backgroundPlayAnimationView;
                if (this.backgroundGradientColor1 != 0) {
                    i21 = 0;
                } else {
                    i21 = 4;
                }
                anonymousClass1213.setVisibility(i21);
                AnonymousClass16 anonymousClass1118 = this.backgroundPlayAnimationView;
                if (this.backgroundGradientColor1 != 0) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.1f;
                }
                anonymousClass1118.setScaleX(f7);
                AnonymousClass16 anonymousClass1119 = this.backgroundPlayAnimationView;
                if (this.backgroundGradientColor1 != 0) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.1f;
                }
                anonymousClass1119.setScaleY(f8);
                AnonymousClass16 anonymousClass11110 = this.backgroundPlayAnimationView;
                if (this.backgroundGradientColor1 != 0) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                anonymousClass11110.setAlpha(f9);
                AnonymousClass16 anonymousClass11111 = this.backgroundPlayAnimationView;
                if (this.backgroundGradientColor1 != 0) {
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                anonymousClass11111.setTag(obj2);
                this.backgroundButtonsContainer.addView(this.backgroundPlayAnimationView, LayoutHelper.createFrame(48, 48, 17));
                setOnClickListener(new View.OnClickListener(this) {
                    public int rotation = 0;
                    public final ThemePreviewActivity this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i33) {
                            case 0:
                                ThemePreviewActivity themePreviewActivity = this.this$0;
                                themePreviewActivity.backgroundPlayAnimationImageView.setRotation(this.rotation);
                                this.rotation -= 45;
                                themePreviewActivity.backgroundPlayAnimationImageView.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
                                BackgroundView[] backgroundViewArr2 = themePreviewActivity.backgroundImages;
                                BackgroundView backgroundView3 = backgroundViewArr2[0];
                                if (backgroundView3 != null) {
                                    Drawable background = backgroundView3.getBackground();
                                    if (background instanceof MotionBackgroundDrawable) {
                                        ((MotionBackgroundDrawable) background).switchToNextPosition(false);
                                    } else if (themePreviewActivity.screenType == 2) {
                                        themePreviewActivity.backgroundRotation += 45;
                                        while (true) {
                                            int i312 = themePreviewActivity.backgroundRotation;
                                            if (i312 >= 360) {
                                                themePreviewActivity.backgroundRotation = i312 - 360;
                                            } else {
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.backgroundColor, 0, true);
                                            }
                                        }
                                    } else {
                                        Theme.ThemeAccent themeAccent2 = themePreviewActivity.accent;
                                        if (themeAccent2 != null) {
                                            themeAccent2.backgroundRotation += 45;
                                            while (true) {
                                                int i313 = themeAccent2.backgroundRotation;
                                                if (i313 >= 360) {
                                                    themeAccent2.backgroundRotation = i313 - 360;
                                                } else {
                                                    Theme.refreshThemeColors(false, false);
                                                }
                                            }
                                        }
                                    }
                                }
                                BackgroundView backgroundView4 = backgroundViewArr2[1];
                                if (backgroundView4 != null) {
                                    Drawable background2 = backgroundView4.getBackground();
                                    if (background2 instanceof MotionBackgroundDrawable) {
                                        ((MotionBackgroundDrawable) background2).switchToNextPosition(false);
                                    }
                                }
                                break;
                            default:
                                ThemePreviewActivity themePreviewActivity2 = this.this$0;
                                themePreviewActivity2.messagesPlayAnimationImageView.setRotation(this.rotation);
                                this.rotation -= 45;
                                themePreviewActivity2.messagesPlayAnimationImageView.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
                                Theme.ThemeAccent themeAccent3 = themePreviewActivity2.accent;
                                if (!themeAccent3.myMessagesAnimated) {
                                    int i4114 = themeAccent3.myMessagesGradientAccentColor3;
                                    if (i4114 != 0) {
                                        int i4115 = themeAccent3.myMessagesAccentColor;
                                        if (i4115 == 0) {
                                            i4115 = themeAccent3.accentColor;
                                        }
                                        themeAccent3.myMessagesAccentColor = themeAccent3.myMessagesGradientAccentColor1;
                                        themeAccent3.myMessagesGradientAccentColor1 = themeAccent3.myMessagesGradientAccentColor2;
                                        themeAccent3.myMessagesGradientAccentColor2 = i4114;
                                        themeAccent3.myMessagesGradientAccentColor3 = i4115;
                                    } else {
                                        int i4116 = themeAccent3.myMessagesAccentColor;
                                        if (i4116 == 0) {
                                            i4116 = themeAccent3.accentColor;
                                        }
                                        themeAccent3.myMessagesAccentColor = themeAccent3.myMessagesGradientAccentColor1;
                                        themeAccent3.myMessagesGradientAccentColor1 = themeAccent3.myMessagesGradientAccentColor2;
                                        themeAccent3.myMessagesGradientAccentColor2 = i4116;
                                    }
                                    themePreviewActivity2.colorPicker.setColor(themeAccent3.myMessagesGradientAccentColor3, 3);
                                    themePreviewActivity2.colorPicker.setColor(themePreviewActivity2.accent.myMessagesGradientAccentColor2, 2);
                                    themePreviewActivity2.colorPicker.setColor(themePreviewActivity2.accent.myMessagesGradientAccentColor1, 1);
                                    ColorPicker colorPicker7 = themePreviewActivity2.colorPicker;
                                    Theme.ThemeAccent themeAccent4 = themePreviewActivity2.accent;
                                    int i4117 = themeAccent4.myMessagesAccentColor;
                                    if (i4117 == 0) {
                                        i4117 = themeAccent4.accentColor;
                                    }
                                    colorPicker7.setColor(i4117, 0);
                                    themePreviewActivity2.messagesCheckBoxView[1].setColor(0, themePreviewActivity2.accent.myMessagesAccentColor);
                                    themePreviewActivity2.messagesCheckBoxView[1].setColor(1, themePreviewActivity2.accent.myMessagesGradientAccentColor1);
                                    themePreviewActivity2.messagesCheckBoxView[1].setColor(2, themePreviewActivity2.accent.myMessagesGradientAccentColor2);
                                    themePreviewActivity2.messagesCheckBoxView[1].setColor(3, themePreviewActivity2.accent.myMessagesGradientAccentColor3);
                                    Theme.refreshThemeColors(true, true);
                                    themePreviewActivity2.listView2.invalidateViews();
                                } else if (themePreviewActivity2.msgOutDrawable.getMotionBackgroundDrawable() != null) {
                                    themePreviewActivity2.msgOutDrawable.getMotionBackgroundDrawable().switchToNextPosition(false);
                                }
                                break;
                        }
                    }
                });
                ImageView imageView5 = new ImageView(context);
                this.backgroundPlayAnimationImageView = imageView5;
                imageView5.setScaleType(ImageView.ScaleType.CENTER);
                this.backgroundPlayAnimationImageView.setImageResource(R.drawable.bg_rotate_large);
                addView(this.backgroundPlayAnimationImageView, LayoutHelper.createFrame(-2, -2, 17));
                i5 = iMax2;
            } else {
                themeInfo = themeInfo2;
                i5 = 0;
            }
            i6 = 0;
            while (true) {
                anonymousClass1 = this.themeDelegate;
                if (i6 >= i4) {
                    break;
                    break;
                }
                this.backgroundCheckBoxView[i6] = new WallpaperCheckBoxView(context, (i34 == 1 && !(this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper)) || i6 != 0, this.backgroundImage, anonymousClass1);
                this.backgroundCheckBoxView[i6].setBackgroundColor(this.backgroundColor);
                wallpaperCheckBoxView2 = this.backgroundCheckBoxView[i6];
                String str5 = strArr[i6];
                int i312 = iArr[i6];
                wallpaperCheckBoxView2.currentText = str5;
                wallpaperCheckBoxView2.currentTextSize = i312;
                wallpaperCheckBoxView2.maxTextSize = i5;
                i19 = 1;
                if (i34 == 1) {
                    if (i6 == i19) {
                        if (this.selectedPattern == null) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        wallpaperCheckBoxView2.setChecked(z3, false);
                    } else if (i6 == 2) {
                        wallpaperCheckBoxView2.setChecked(this.isMotion, false);
                    }
                } else if (this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) {
                    i19 = 1;
                    if (i6 == i19) {
                        if (this.selectedPattern == null) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        wallpaperCheckBoxView2.setChecked(z3, false);
                    } else if (i6 == 2) {
                        wallpaperCheckBoxView2.setChecked(this.isMotion, false);
                    }
                } else {
                    if (i6 == 0) {
                        z4 = this.isBlurred;
                    } else {
                        z4 = this.isMotion;
                    }
                    wallpaperCheckBoxView2.setChecked(z4, false);
                }
                iDp3 = AndroidUtilities.dp(56.0f) + i5;
                layoutParams2 = new FrameLayout.LayoutParams(iDp3, -2);
                layoutParams2.gravity = 17;
                if (i4 == 3) {
                    if (i6 != 0) {
                        layoutParams2.leftMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                    } else {
                        layoutParams2.leftMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                    }
                } else if (i6 == 1) {
                    layoutParams2.leftMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                } else {
                    layoutParams2.rightMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                }
                this.backgroundButtonsContainer.addView(this.backgroundCheckBoxView[i6], layoutParams2);
                final WallpaperCheckBoxView wallpaperCheckBoxView7 = this.backgroundCheckBoxView[i6];
                final int i313 = 1;
                wallpaperCheckBoxView7.setOnClickListener(new View.OnClickListener(this) {
                    public final ThemePreviewActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i313) {
                            case 0:
                                ThemePreviewActivity themePreviewActivity = this.f$0;
                                if (themePreviewActivity.messagesButtonsContainer.getAlpha() == 1.0f && i6 == 0) {
                                    WallpaperCheckBoxView wallpaperCheckBoxView8 = wallpaperCheckBoxView7;
                                    wallpaperCheckBoxView8.setChecked(!wallpaperCheckBoxView8.isChecked, true);
                                    themePreviewActivity.accent.myMessagesAnimated = wallpaperCheckBoxView8.isChecked;
                                    Theme.refreshThemeColors(true, true);
                                    themePreviewActivity.listView2.invalidateViews();
                                }
                                break;
                            default:
                                ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                if (themePreviewActivity2.backgroundButtonsContainer.getAlpha() == 1.0f && themePreviewActivity2.patternViewAnimation == null) {
                                    int i4114 = i6;
                                    WallpaperCheckBoxView wallpaperCheckBoxView9 = wallpaperCheckBoxView7;
                                    int i4115 = themePreviewActivity2.screenType;
                                    if ((i4115 == 1 || (themePreviewActivity2.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper)) && i4114 == 2) {
                                        wallpaperCheckBoxView9.setChecked(!wallpaperCheckBoxView9.isChecked, true);
                                        boolean z8 = wallpaperCheckBoxView9.isChecked;
                                        themePreviewActivity2.isMotion = z8;
                                        themePreviewActivity2.parallaxEffect.setEnabled(z8);
                                        themePreviewActivity2.animateMotionChange();
                                    } else {
                                        FrameLayout[] frameLayoutArr2 = themePreviewActivity2.patternLayout;
                                        if (i4114 == 1 && (i4115 == 1 || (themePreviewActivity2.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper))) {
                                            if (themePreviewActivity2.backgroundCheckBoxView[1].isChecked) {
                                                themePreviewActivity2.lastSelectedPattern = themePreviewActivity2.selectedPattern;
                                                themePreviewActivity2.backgroundImage.setImageDrawable(null);
                                                themePreviewActivity2.selectedPattern = null;
                                                themePreviewActivity2.isMotion = false;
                                                themePreviewActivity2.updateButtonState$1$1();
                                                themePreviewActivity2.animateMotionChange();
                                                if (frameLayoutArr2[1].getVisibility() == 0) {
                                                    if (i4115 == 1) {
                                                        themePreviewActivity2.showPatternsView(0, true);
                                                    } else {
                                                        themePreviewActivity2.showPatternsView(i4114, frameLayoutArr2[i4114].getVisibility() != 0);
                                                    }
                                                }
                                            } else {
                                                themePreviewActivity2.selectPattern(themePreviewActivity2.lastSelectedPattern != null ? -1 : 0);
                                                if (i4115 == 1) {
                                                    themePreviewActivity2.showPatternsView(1, true);
                                                } else {
                                                    themePreviewActivity2.showPatternsView(i4114, frameLayoutArr2[i4114].getVisibility() != 0);
                                                }
                                            }
                                            themePreviewActivity2.backgroundCheckBoxView[1].setChecked(themePreviewActivity2.selectedPattern != null, true);
                                            themePreviewActivity2.updateSelectedPattern();
                                            themePreviewActivity2.patternsListView.invalidateViews();
                                            themePreviewActivity2.updateMotionButton();
                                        } else if (themePreviewActivity2.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) {
                                            themePreviewActivity2.showPatternsView(i4114, frameLayoutArr2[i4114].getVisibility() != 0);
                                        } else if (i4115 != 1) {
                                            wallpaperCheckBoxView9.setChecked(!wallpaperCheckBoxView9.isChecked, true);
                                            if (i4114 != 0) {
                                                boolean z9 = wallpaperCheckBoxView9.isChecked;
                                                themePreviewActivity2.isMotion = z9;
                                                themePreviewActivity2.parallaxEffect.setEnabled(z9);
                                                themePreviewActivity2.animateMotionChange();
                                            } else {
                                                boolean z10 = wallpaperCheckBoxView9.isChecked;
                                                themePreviewActivity2.isBlurred = z10;
                                                if (z10) {
                                                    themePreviewActivity2.backgroundImage.getImageReceiver().setForceCrossfade(true);
                                                }
                                                themePreviewActivity2.updateBlurred();
                                            }
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (i6 == 2) {
                    this.backgroundCheckBoxView[i6].setAlpha(0.0f);
                    this.backgroundCheckBoxView[i6].setVisibility(4);
                }
                i6++;
            }
            i7 = 1;
            if (i34 == 1) {
                iArr2 = new int[2];
                this.messagesCheckBoxView = new WallpaperCheckBoxView[2];
                this.messagesButtonsContainer = new FrameLayout(context);
                strArr2 = new String[]{LocaleController.getString(R.string.BackgroundAnimate), LocaleController.getString(R.string.BackgroundColors)};
                i16 = 0;
                iMax = 0;
                while (i16 < i15) {
                    int[] iArr6 = iArr2;
                    int iCeil6 = (int) Math.ceil(textPaint.measureText(strArr2[i16]));
                    iArr6[i16] = iCeil6;
                    iMax = Math.max(iMax, iCeil6);
                    i16++;
                    iArr2 = iArr6;
                }
                iArr3 = iArr2;
                i7 = 1;
                if (themeAccent != null) {
                    ?? r10 = new FrameLayout(context, this, i7) {
                        public final int $r8$classId;
                        public final RectF rect;
                        public final ThemePreviewActivity this$0;

                        {
                            super(context);
                            this.$r8$classId = i7;
                            switch (i7) {
                                case 1:
                                    this.this$0 = this;
                                    super(context);
                                    this.rect = new RectF();
                                    break;
                                default:
                                    this.this$0 = this;
                                    this.rect = new RectF();
                                    break;
                            }
                        }

                        @Override
                        public final void onDraw(Canvas canvas) {
                            switch (this.$r8$classId) {
                                case 0:
                                    RectF rectF = this.rect;
                                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                                    ThemePreviewActivity themePreviewActivity = this.this$0;
                                    Theme.applyServiceShaderMatrixForView(themePreviewActivity.backgroundPlayAnimationView, themePreviewActivity.backgroundImage, themePreviewActivity.themeDelegate);
                                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity.themeDelegate.getPaint("paintChatActionBackground"));
                                    if (Theme.hasGradientService()) {
                                        canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity.themeDelegate.getPaint("paintChatActionBackgroundDarken"));
                                    }
                                    break;
                                default:
                                    RectF rectF2 = this.rect;
                                    rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                                    ThemePreviewActivity themePreviewActivity2 = this.this$0;
                                    Theme.applyServiceShaderMatrixForView(themePreviewActivity2.messagesPlayAnimationView, themePreviewActivity2.backgroundImage, themePreviewActivity2.themeDelegate);
                                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity2.themeDelegate.getPaint("paintChatActionBackground"));
                                    if (Theme.hasGradientService()) {
                                        canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, themePreviewActivity2.themeDelegate.getPaint("paintChatActionBackgroundDarken"));
                                    }
                                    break;
                            }
                        }
                    };
                    this.messagesPlayAnimationView = r10;
                    r10.setWillNotDraw(false);
                    AnonymousClass16 anonymousClass11112 = this.messagesPlayAnimationView;
                    if (themeAccent.myMessagesGradientAccentColor1 != 0) {
                        i17 = 0;
                    } else {
                        i17 = 4;
                    }
                    anonymousClass11112.setVisibility(i17);
                    AnonymousClass16 anonymousClass11113 = this.messagesPlayAnimationView;
                    if (themeAccent.myMessagesGradientAccentColor1 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = 0.1f;
                    }
                    anonymousClass11113.setScaleX(f4);
                    AnonymousClass16 anonymousClass11114 = this.messagesPlayAnimationView;
                    if (themeAccent.myMessagesGradientAccentColor1 != 0) {
                        f5 = 1.0f;
                    } else {
                        f5 = 0.1f;
                    }
                    anonymousClass11114.setScaleY(f5);
                    AnonymousClass16 anonymousClass11115 = this.messagesPlayAnimationView;
                    if (themeAccent.myMessagesGradientAccentColor1 != 0) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    anonymousClass11115.setAlpha(f6);
                    this.messagesButtonsContainer.addView(this.messagesPlayAnimationView, LayoutHelper.createFrame(48, 48, 17));
                    final int i420 = 1;
                    setOnClickListener(new View.OnClickListener(this) {
                        public int rotation = 0;
                        public final ThemePreviewActivity this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (i420) {
                                case 0:
                                    ThemePreviewActivity themePreviewActivity = this.this$0;
                                    themePreviewActivity.backgroundPlayAnimationImageView.setRotation(this.rotation);
                                    this.rotation -= 45;
                                    themePreviewActivity.backgroundPlayAnimationImageView.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
                                    BackgroundView[] backgroundViewArr2 = themePreviewActivity.backgroundImages;
                                    BackgroundView backgroundView3 = backgroundViewArr2[0];
                                    if (backgroundView3 != null) {
                                        Drawable background = backgroundView3.getBackground();
                                        if (background instanceof MotionBackgroundDrawable) {
                                            ((MotionBackgroundDrawable) background).switchToNextPosition(false);
                                        } else if (themePreviewActivity.screenType == 2) {
                                            themePreviewActivity.backgroundRotation += 45;
                                            while (true) {
                                                int i314 = themePreviewActivity.backgroundRotation;
                                                if (i314 >= 360) {
                                                    themePreviewActivity.backgroundRotation = i314 - 360;
                                                } else {
                                                    themePreviewActivity.setBackgroundColor(themePreviewActivity.backgroundColor, 0, true);
                                                }
                                            }
                                        } else {
                                            Theme.ThemeAccent themeAccent2 = themePreviewActivity.accent;
                                            if (themeAccent2 != null) {
                                                themeAccent2.backgroundRotation += 45;
                                                while (true) {
                                                    int i315 = themeAccent2.backgroundRotation;
                                                    if (i315 >= 360) {
                                                        themeAccent2.backgroundRotation = i315 - 360;
                                                    } else {
                                                        Theme.refreshThemeColors(false, false);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    BackgroundView backgroundView4 = backgroundViewArr2[1];
                                    if (backgroundView4 != null) {
                                        Drawable background2 = backgroundView4.getBackground();
                                        if (background2 instanceof MotionBackgroundDrawable) {
                                            ((MotionBackgroundDrawable) background2).switchToNextPosition(false);
                                        }
                                    }
                                    break;
                                default:
                                    ThemePreviewActivity themePreviewActivity2 = this.this$0;
                                    themePreviewActivity2.messagesPlayAnimationImageView.setRotation(this.rotation);
                                    this.rotation -= 45;
                                    themePreviewActivity2.messagesPlayAnimationImageView.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
                                    Theme.ThemeAccent themeAccent3 = themePreviewActivity2.accent;
                                    if (!themeAccent3.myMessagesAnimated) {
                                        int i4114 = themeAccent3.myMessagesGradientAccentColor3;
                                        if (i4114 != 0) {
                                            int i4115 = themeAccent3.myMessagesAccentColor;
                                            if (i4115 == 0) {
                                                i4115 = themeAccent3.accentColor;
                                            }
                                            themeAccent3.myMessagesAccentColor = themeAccent3.myMessagesGradientAccentColor1;
                                            themeAccent3.myMessagesGradientAccentColor1 = themeAccent3.myMessagesGradientAccentColor2;
                                            themeAccent3.myMessagesGradientAccentColor2 = i4114;
                                            themeAccent3.myMessagesGradientAccentColor3 = i4115;
                                        } else {
                                            int i4116 = themeAccent3.myMessagesAccentColor;
                                            if (i4116 == 0) {
                                                i4116 = themeAccent3.accentColor;
                                            }
                                            themeAccent3.myMessagesAccentColor = themeAccent3.myMessagesGradientAccentColor1;
                                            themeAccent3.myMessagesGradientAccentColor1 = themeAccent3.myMessagesGradientAccentColor2;
                                            themeAccent3.myMessagesGradientAccentColor2 = i4116;
                                        }
                                        themePreviewActivity2.colorPicker.setColor(themeAccent3.myMessagesGradientAccentColor3, 3);
                                        themePreviewActivity2.colorPicker.setColor(themePreviewActivity2.accent.myMessagesGradientAccentColor2, 2);
                                        themePreviewActivity2.colorPicker.setColor(themePreviewActivity2.accent.myMessagesGradientAccentColor1, 1);
                                        ColorPicker colorPicker7 = themePreviewActivity2.colorPicker;
                                        Theme.ThemeAccent themeAccent4 = themePreviewActivity2.accent;
                                        int i4117 = themeAccent4.myMessagesAccentColor;
                                        if (i4117 == 0) {
                                            i4117 = themeAccent4.accentColor;
                                        }
                                        colorPicker7.setColor(i4117, 0);
                                        themePreviewActivity2.messagesCheckBoxView[1].setColor(0, themePreviewActivity2.accent.myMessagesAccentColor);
                                        themePreviewActivity2.messagesCheckBoxView[1].setColor(1, themePreviewActivity2.accent.myMessagesGradientAccentColor1);
                                        themePreviewActivity2.messagesCheckBoxView[1].setColor(2, themePreviewActivity2.accent.myMessagesGradientAccentColor2);
                                        themePreviewActivity2.messagesCheckBoxView[1].setColor(3, themePreviewActivity2.accent.myMessagesGradientAccentColor3);
                                        Theme.refreshThemeColors(true, true);
                                        themePreviewActivity2.listView2.invalidateViews();
                                    } else if (themePreviewActivity2.msgOutDrawable.getMotionBackgroundDrawable() != null) {
                                        themePreviewActivity2.msgOutDrawable.getMotionBackgroundDrawable().switchToNextPosition(false);
                                    }
                                    break;
                            }
                        }
                    });
                    ImageView imageView6 = new ImageView(context);
                    this.messagesPlayAnimationImageView = imageView6;
                    imageView6.setScaleType(ImageView.ScaleType.CENTER);
                    this.messagesPlayAnimationImageView.setImageResource(R.drawable.bg_rotate_large);
                    addView(this.messagesPlayAnimationImageView, LayoutHelper.createFrame(-2, -2, 17));
                    while (i18 < 2) {
                        WallpaperCheckBoxView[] wallpaperCheckBoxViewArr3 = this.messagesCheckBoxView;
                        if (i18 == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        wallpaperCheckBoxViewArr3[i18] = new WallpaperCheckBoxView(context, z2, this.backgroundImage, anonymousClass1);
                        wallpaperCheckBoxView = this.messagesCheckBoxView[i18];
                        String str6 = strArr2[i18];
                        int i4114 = iArr3[i18];
                        wallpaperCheckBoxView.currentText = str6;
                        wallpaperCheckBoxView.currentTextSize = i4114;
                        wallpaperCheckBoxView.maxTextSize = iMax;
                        if (i18 == 0) {
                            wallpaperCheckBoxView.setChecked(themeAccent.myMessagesAnimated, false);
                        }
                        iDp2 = AndroidUtilities.dp(56.0f) + iMax;
                        layoutParams = new FrameLayout.LayoutParams(iDp2, -2);
                        layoutParams.gravity = 17;
                        if (i18 == 1) {
                            layoutParams.leftMargin = AndroidUtilities.dp(10.0f) + (iDp2 / 2);
                        } else {
                            layoutParams.rightMargin = AndroidUtilities.dp(10.0f) + (iDp2 / 2);
                        }
                        this.messagesButtonsContainer.addView(this.messagesCheckBoxView[i18], layoutParams);
                        final WallpaperCheckBoxView wallpaperCheckBoxView8 = this.messagesCheckBoxView[i18];
                        final int i4115 = 0;
                        wallpaperCheckBoxView8.setOnClickListener(new View.OnClickListener(this) {
                            public final ThemePreviewActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i4115) {
                                    case 0:
                                        ThemePreviewActivity themePreviewActivity = this.f$0;
                                        if (themePreviewActivity.messagesButtonsContainer.getAlpha() == 1.0f && i18 == 0) {
                                            WallpaperCheckBoxView wallpaperCheckBoxView9 = wallpaperCheckBoxView8;
                                            wallpaperCheckBoxView9.setChecked(!wallpaperCheckBoxView9.isChecked, true);
                                            themePreviewActivity.accent.myMessagesAnimated = wallpaperCheckBoxView9.isChecked;
                                            Theme.refreshThemeColors(true, true);
                                            themePreviewActivity.listView2.invalidateViews();
                                        }
                                        break;
                                    default:
                                        ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                        if (themePreviewActivity2.backgroundButtonsContainer.getAlpha() == 1.0f && themePreviewActivity2.patternViewAnimation == null) {
                                            int i4116 = i18;
                                            WallpaperCheckBoxView wallpaperCheckBoxView10 = wallpaperCheckBoxView8;
                                            int i4117 = themePreviewActivity2.screenType;
                                            if ((i4117 == 1 || (themePreviewActivity2.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper)) && i4116 == 2) {
                                                wallpaperCheckBoxView10.setChecked(!wallpaperCheckBoxView10.isChecked, true);
                                                boolean z8 = wallpaperCheckBoxView10.isChecked;
                                                themePreviewActivity2.isMotion = z8;
                                                themePreviewActivity2.parallaxEffect.setEnabled(z8);
                                                themePreviewActivity2.animateMotionChange();
                                            } else {
                                                FrameLayout[] frameLayoutArr2 = themePreviewActivity2.patternLayout;
                                                if (i4116 == 1 && (i4117 == 1 || (themePreviewActivity2.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper))) {
                                                    if (themePreviewActivity2.backgroundCheckBoxView[1].isChecked) {
                                                        themePreviewActivity2.lastSelectedPattern = themePreviewActivity2.selectedPattern;
                                                        themePreviewActivity2.backgroundImage.setImageDrawable(null);
                                                        themePreviewActivity2.selectedPattern = null;
                                                        themePreviewActivity2.isMotion = false;
                                                        themePreviewActivity2.updateButtonState$1$1();
                                                        themePreviewActivity2.animateMotionChange();
                                                        if (frameLayoutArr2[1].getVisibility() == 0) {
                                                            if (i4117 == 1) {
                                                                themePreviewActivity2.showPatternsView(0, true);
                                                            } else {
                                                                themePreviewActivity2.showPatternsView(i4116, frameLayoutArr2[i4116].getVisibility() != 0);
                                                            }
                                                        }
                                                    } else {
                                                        themePreviewActivity2.selectPattern(themePreviewActivity2.lastSelectedPattern != null ? -1 : 0);
                                                        if (i4117 == 1) {
                                                            themePreviewActivity2.showPatternsView(1, true);
                                                        } else {
                                                            themePreviewActivity2.showPatternsView(i4116, frameLayoutArr2[i4116].getVisibility() != 0);
                                                        }
                                                    }
                                                    themePreviewActivity2.backgroundCheckBoxView[1].setChecked(themePreviewActivity2.selectedPattern != null, true);
                                                    themePreviewActivity2.updateSelectedPattern();
                                                    themePreviewActivity2.patternsListView.invalidateViews();
                                                    themePreviewActivity2.updateMotionButton();
                                                } else if (themePreviewActivity2.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) {
                                                    themePreviewActivity2.showPatternsView(i4116, frameLayoutArr2[i4116].getVisibility() != 0);
                                                } else if (i4117 != 1) {
                                                    wallpaperCheckBoxView10.setChecked(!wallpaperCheckBoxView10.isChecked, true);
                                                    if (i4116 != 0) {
                                                        boolean z9 = wallpaperCheckBoxView10.isChecked;
                                                        themePreviewActivity2.isMotion = z9;
                                                        themePreviewActivity2.parallaxEffect.setEnabled(z9);
                                                        themePreviewActivity2.animateMotionChange();
                                                    } else {
                                                        boolean z10 = wallpaperCheckBoxView10.isChecked;
                                                        themePreviewActivity2.isBlurred = z10;
                                                        if (z10) {
                                                            themePreviewActivity2.backgroundImage.getImageReceiver().setForceCrossfade(true);
                                                        }
                                                        themePreviewActivity2.updateBlurred();
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    i7 = 1;
                }
            }
            if (i34 != i7) {
                this.isBlurred = false;
                i8 = 0;
                while (i8 < 2) {
                    frameLayout = new FrameLayout(context) {
                        @Override
                        public final void onDraw(Canvas canvas) {
                            int i4116 = i8;
                            Rect rect5 = rect;
                            ThemePreviewActivity themePreviewActivity = ThemePreviewActivity.this;
                            if (i4116 == 0) {
                                themePreviewActivity.sheetDrawable.setBounds(themePreviewActivity.colorPicker.getLeft() - rect5.left, 0, themePreviewActivity.colorPicker.getRight() + rect5.right, getMeasuredHeight());
                            } else {
                                themePreviewActivity.sheetDrawable.setBounds(-rect5.left, 0, getMeasuredWidth() + rect5.right, getMeasuredHeight());
                            }
                            themePreviewActivity.sheetDrawable.draw(canvas);
                        }
                    };
                    frameLayoutArr = this.patternLayout;
                    frameLayoutArr[i8] = frameLayout;
                    if (i8 != 1) {
                        frameLayout.setVisibility(4);
                    } else {
                        frameLayout.setVisibility(4);
                    }
                    frameLayoutArr[i8].setWillNotDraw(false);
                    if (i34 == 2) {
                        if (i8 == 0) {
                            i13 = 321;
                        } else {
                            i13 = 316;
                        }
                        layoutParamsCreateFrame = LayoutHelper.createFrame(-1, i13, 83);
                    } else {
                        if (i8 == 0) {
                            i9 = 273;
                        } else {
                            i9 = 316;
                        }
                        layoutParamsCreateFrame = LayoutHelper.createFrame(-1, i9, 83);
                    }
                    if (i8 == 0) {
                        f2 = i34 != 2 ? 273 : 321;
                    } else {
                        f2 = 316.0f;
                    }
                    layoutParamsCreateFrame.height = AndroidUtilities.dp(f2);
                    if (insideBottomSheet()) {
                        layoutParamsCreateFrame.height += AndroidUtilities.navigationBarHeight;
                    }
                    if (i8 == 0) {
                        Drawable drawable4 = this.sheetDrawable;
                        Rect rect5 = AndroidUtilities.rectTmp2;
                        drawable4.getPadding(rect5);
                        layoutParamsCreateFrame.height = AndroidUtilities.dp(12.0f) + rect5.top + layoutParamsCreateFrame.height;
                    }
                    GLSurfaceView gLSurfaceView4 = frameLayoutArr[i8];
                    if (i8 == 0) {
                        iDp = AndroidUtilities.dp(12.0f) + rect.top;
                    } else {
                        iDp = 0;
                    }
                    if (insideBottomSheet()) {
                        i10 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i10 = 0;
                    }
                    gLSurfaceView4.setPadding(0, iDp, 0, i10);
                    this.page2.addView(frameLayoutArr[i8], layoutParamsCreateFrame);
                    r14 = 1;
                    if (i8 != 1) {
                        TextureViewContainer textureViewContainer9 = new TextureViewContainer(context, this, 1);
                        ViewGroup[] viewGroupArr6 = this.patternsButtonsContainer;
                        viewGroupArr6[i8] = textureViewContainer9;
                        textureViewContainer9.setWillNotDraw(false);
                        viewGroupArr6[i8].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        viewGroupArr6[i8].setClickable(true);
                        f3 = 21.0f;
                        frameLayoutArr[i8].addView(viewGroupArr6[i8], LayoutHelper.createFrame(-1, 51, 80));
                        TextView textView1113 = new TextView(context);
                        TextView[] textViewArr11 = this.patternsCancelButton;
                        textViewArr11[i8] = textView1113;
                        textView1113.setTextSize(1, 15.0f);
                        textViewArr11[i8].setTypeface(AndroidUtilities.bold());
                        TextView textView1114 = textViewArr11[i8];
                        int i4116 = Theme.key_chat_fieldOverlayText;
                        textView1114.setTextColor(getThemedColor(i4116));
                        textViewArr11[i8].setText(LocaleController.getString(R.string.Cancel));
                        textViewArr11[i8].setGravity(17);
                        textViewArr11[i8].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView1115 = textViewArr11[i8];
                        int i4117 = Theme.key_listSelector;
                        textView1115.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i4117), 0));
                        viewGroupArr6[i8].addView(textViewArr11[i8], LayoutHelper.createFrame(-2, -1, 51));
                        final int i4118 = 0;
                        textViewArr11[i8].setOnClickListener(new View.OnClickListener(this) {
                            public final ThemePreviewActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i4118) {
                                    case 0:
                                        ThemePreviewActivity themePreviewActivity = this.f$0;
                                        if (themePreviewActivity.patternViewAnimation == null) {
                                            int i4119 = i8;
                                            if (i4119 == 0) {
                                                themePreviewActivity.backgroundRotation = themePreviewActivity.previousBackgroundRotation;
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor3, 3, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor2, 2, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor1, 1, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundColor, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = themePreviewActivity.previousSelectedPattern;
                                                themePreviewActivity.selectedPattern = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    themePreviewActivity.backgroundImage.setImageDrawable(null);
                                                } else {
                                                    ThemePreviewActivity.BackgroundView backgroundView3 = themePreviewActivity.backgroundImage;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str7 = themePreviewActivity.imageFilter;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = themePreviewActivity.selectedPattern;
                                                    backgroundView3.imageReceiver.setImage(forDocument, str7, null, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                    backgroundView3.onNewImageSet();
                                                }
                                                themePreviewActivity.backgroundCheckBoxView[1].setChecked(themePreviewActivity.selectedPattern != null, false);
                                                float f13 = themePreviewActivity.previousIntensity;
                                                themePreviewActivity.currentIntensity = f13;
                                                themePreviewActivity.intensitySeekBar.setProgress(f13);
                                                themePreviewActivity.backgroundImage.getImageReceiver().setAlpha(themePreviewActivity.currentIntensity);
                                                themePreviewActivity.updateButtonState$1$1();
                                                themePreviewActivity.updateSelectedPattern();
                                            }
                                            if (themePreviewActivity.screenType != 2) {
                                                if (themePreviewActivity.selectedPattern == null) {
                                                    if (themePreviewActivity.isMotion) {
                                                        themePreviewActivity.isMotion = false;
                                                        themePreviewActivity.backgroundCheckBoxView[0].setChecked(false, true);
                                                        themePreviewActivity.animateMotionChange();
                                                    }
                                                    themePreviewActivity.updateMotionButton();
                                                }
                                                themePreviewActivity.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity.showPatternsView(i4119, false);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                        if (themePreviewActivity2.patternViewAnimation == null) {
                                            if (themePreviewActivity2.screenType != 2) {
                                                themePreviewActivity2.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity2.showPatternsView(i8, false);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        TextView textView1116 = new TextView(context);
                        TextView[] textViewArr12 = this.patternsSaveButton;
                        textViewArr12[i8] = textView1116;
                        textView1116.setTextSize(1, 15.0f);
                        textViewArr12[i8].setTypeface(AndroidUtilities.bold());
                        textViewArr12[i8].setTextColor(getThemedColor(i4116));
                        textViewArr12[i8].setText(LocaleController.getString(R.string.ApplyTheme));
                        textViewArr12[i8].setGravity(17);
                        textViewArr12[i8].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        textViewArr12[i8].setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i4117), 0));
                        viewGroupArr6[i8].addView(textViewArr12[i8], LayoutHelper.createFrame(-2, -1, 53));
                        TextView textView1117 = textViewArr12[i8];
                        r14 = 1;
                        final int c7 = 1 == true ? 1 : 0;
                        textView1117.setOnClickListener(new View.OnClickListener(this) {
                            public final ThemePreviewActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (c7) {
                                    case 0:
                                        ThemePreviewActivity themePreviewActivity = this.f$0;
                                        if (themePreviewActivity.patternViewAnimation == null) {
                                            int i4119 = i8;
                                            if (i4119 == 0) {
                                                themePreviewActivity.backgroundRotation = themePreviewActivity.previousBackgroundRotation;
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor3, 3, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor2, 2, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor1, 1, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundColor, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = themePreviewActivity.previousSelectedPattern;
                                                themePreviewActivity.selectedPattern = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    themePreviewActivity.backgroundImage.setImageDrawable(null);
                                                } else {
                                                    ThemePreviewActivity.BackgroundView backgroundView3 = themePreviewActivity.backgroundImage;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str7 = themePreviewActivity.imageFilter;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = themePreviewActivity.selectedPattern;
                                                    backgroundView3.imageReceiver.setImage(forDocument, str7, null, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                    backgroundView3.onNewImageSet();
                                                }
                                                themePreviewActivity.backgroundCheckBoxView[1].setChecked(themePreviewActivity.selectedPattern != null, false);
                                                float f13 = themePreviewActivity.previousIntensity;
                                                themePreviewActivity.currentIntensity = f13;
                                                themePreviewActivity.intensitySeekBar.setProgress(f13);
                                                themePreviewActivity.backgroundImage.getImageReceiver().setAlpha(themePreviewActivity.currentIntensity);
                                                themePreviewActivity.updateButtonState$1$1();
                                                themePreviewActivity.updateSelectedPattern();
                                            }
                                            if (themePreviewActivity.screenType != 2) {
                                                if (themePreviewActivity.selectedPattern == null) {
                                                    if (themePreviewActivity.isMotion) {
                                                        themePreviewActivity.isMotion = false;
                                                        themePreviewActivity.backgroundCheckBoxView[0].setChecked(false, true);
                                                        themePreviewActivity.animateMotionChange();
                                                    }
                                                    themePreviewActivity.updateMotionButton();
                                                }
                                                themePreviewActivity.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity.showPatternsView(i4119, false);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                        if (themePreviewActivity2.patternViewAnimation == null) {
                                            if (themePreviewActivity2.screenType != 2) {
                                                themePreviewActivity2.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity2.showPatternsView(i8, false);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        TextureViewContainer textureViewContainer10 = new TextureViewContainer(context, this, 1);
                        ViewGroup[] viewGroupArr7 = this.patternsButtonsContainer;
                        viewGroupArr7[i8] = textureViewContainer10;
                        textureViewContainer10.setWillNotDraw(false);
                        viewGroupArr7[i8].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        viewGroupArr7[i8].setClickable(true);
                        f3 = 21.0f;
                        frameLayoutArr[i8].addView(viewGroupArr7[i8], LayoutHelper.createFrame(-1, 51, 80));
                        TextView textView1118 = new TextView(context);
                        TextView[] textViewArr13 = this.patternsCancelButton;
                        textViewArr13[i8] = textView1118;
                        textView1118.setTextSize(1, 15.0f);
                        textViewArr13[i8].setTypeface(AndroidUtilities.bold());
                        TextView textView1119 = textViewArr13[i8];
                        int i4119 = Theme.key_chat_fieldOverlayText;
                        textView1119.setTextColor(getThemedColor(i4119));
                        textViewArr13[i8].setText(LocaleController.getString(R.string.Cancel));
                        textViewArr13[i8].setGravity(17);
                        textViewArr13[i8].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView11110 = textViewArr13[i8];
                        int i41110 = Theme.key_listSelector;
                        textView11110.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i41110), 0));
                        viewGroupArr7[i8].addView(textViewArr13[i8], LayoutHelper.createFrame(-2, -1, 51));
                        final int i41111 = 0;
                        textViewArr13[i8].setOnClickListener(new View.OnClickListener(this) {
                            public final ThemePreviewActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i41111) {
                                    case 0:
                                        ThemePreviewActivity themePreviewActivity = this.f$0;
                                        if (themePreviewActivity.patternViewAnimation == null) {
                                            int i41112 = i8;
                                            if (i41112 == 0) {
                                                themePreviewActivity.backgroundRotation = themePreviewActivity.previousBackgroundRotation;
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor3, 3, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor2, 2, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor1, 1, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundColor, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = themePreviewActivity.previousSelectedPattern;
                                                themePreviewActivity.selectedPattern = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    themePreviewActivity.backgroundImage.setImageDrawable(null);
                                                } else {
                                                    ThemePreviewActivity.BackgroundView backgroundView3 = themePreviewActivity.backgroundImage;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str7 = themePreviewActivity.imageFilter;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = themePreviewActivity.selectedPattern;
                                                    backgroundView3.imageReceiver.setImage(forDocument, str7, null, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                    backgroundView3.onNewImageSet();
                                                }
                                                themePreviewActivity.backgroundCheckBoxView[1].setChecked(themePreviewActivity.selectedPattern != null, false);
                                                float f13 = themePreviewActivity.previousIntensity;
                                                themePreviewActivity.currentIntensity = f13;
                                                themePreviewActivity.intensitySeekBar.setProgress(f13);
                                                themePreviewActivity.backgroundImage.getImageReceiver().setAlpha(themePreviewActivity.currentIntensity);
                                                themePreviewActivity.updateButtonState$1$1();
                                                themePreviewActivity.updateSelectedPattern();
                                            }
                                            if (themePreviewActivity.screenType != 2) {
                                                if (themePreviewActivity.selectedPattern == null) {
                                                    if (themePreviewActivity.isMotion) {
                                                        themePreviewActivity.isMotion = false;
                                                        themePreviewActivity.backgroundCheckBoxView[0].setChecked(false, true);
                                                        themePreviewActivity.animateMotionChange();
                                                    }
                                                    themePreviewActivity.updateMotionButton();
                                                }
                                                themePreviewActivity.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity.showPatternsView(i41112, false);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                        if (themePreviewActivity2.patternViewAnimation == null) {
                                            if (themePreviewActivity2.screenType != 2) {
                                                themePreviewActivity2.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity2.showPatternsView(i8, false);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        TextView textView11111 = new TextView(context);
                        TextView[] textViewArr14 = this.patternsSaveButton;
                        textViewArr14[i8] = textView11111;
                        textView11111.setTextSize(1, 15.0f);
                        textViewArr14[i8].setTypeface(AndroidUtilities.bold());
                        textViewArr14[i8].setTextColor(getThemedColor(i4119));
                        textViewArr14[i8].setText(LocaleController.getString(R.string.ApplyTheme));
                        textViewArr14[i8].setGravity(17);
                        textViewArr14[i8].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        textViewArr14[i8].setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i41110), 0));
                        viewGroupArr7[i8].addView(textViewArr14[i8], LayoutHelper.createFrame(-2, -1, 53));
                        TextView textView11112 = textViewArr14[i8];
                        r14 = 1;
                        final int c8 = 1 == true ? 1 : 0;
                        textView11112.setOnClickListener(new View.OnClickListener(this) {
                            public final ThemePreviewActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (c8) {
                                    case 0:
                                        ThemePreviewActivity themePreviewActivity = this.f$0;
                                        if (themePreviewActivity.patternViewAnimation == null) {
                                            int i41112 = i8;
                                            if (i41112 == 0) {
                                                themePreviewActivity.backgroundRotation = themePreviewActivity.previousBackgroundRotation;
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor3, 3, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor2, 2, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor1, 1, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundColor, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = themePreviewActivity.previousSelectedPattern;
                                                themePreviewActivity.selectedPattern = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    themePreviewActivity.backgroundImage.setImageDrawable(null);
                                                } else {
                                                    ThemePreviewActivity.BackgroundView backgroundView3 = themePreviewActivity.backgroundImage;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str7 = themePreviewActivity.imageFilter;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = themePreviewActivity.selectedPattern;
                                                    backgroundView3.imageReceiver.setImage(forDocument, str7, null, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                    backgroundView3.onNewImageSet();
                                                }
                                                themePreviewActivity.backgroundCheckBoxView[1].setChecked(themePreviewActivity.selectedPattern != null, false);
                                                float f13 = themePreviewActivity.previousIntensity;
                                                themePreviewActivity.currentIntensity = f13;
                                                themePreviewActivity.intensitySeekBar.setProgress(f13);
                                                themePreviewActivity.backgroundImage.getImageReceiver().setAlpha(themePreviewActivity.currentIntensity);
                                                themePreviewActivity.updateButtonState$1$1();
                                                themePreviewActivity.updateSelectedPattern();
                                            }
                                            if (themePreviewActivity.screenType != 2) {
                                                if (themePreviewActivity.selectedPattern == null) {
                                                    if (themePreviewActivity.isMotion) {
                                                        themePreviewActivity.isMotion = false;
                                                        themePreviewActivity.backgroundCheckBoxView[0].setChecked(false, true);
                                                        themePreviewActivity.animateMotionChange();
                                                    }
                                                    themePreviewActivity.updateMotionButton();
                                                }
                                                themePreviewActivity.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity.showPatternsView(i41112, false);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                        if (themePreviewActivity2.patternViewAnimation == null) {
                                            if (themePreviewActivity2.screenType != 2) {
                                                themePreviewActivity2.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity2.showPatternsView(i8, false);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    if (i8 == r14) {
                        TextView textView22 = new TextView(context);
                        this.patternTitleView = textView22;
                        textView22.setLines(r14);
                        this.patternTitleView.setSingleLine(r14);
                        this.patternTitleView.setText(LocaleController.getString(R.string.BackgroundChoosePattern));
                        this.patternTitleView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                        this.patternTitleView.setTextSize(r14, 20.0f);
                        this.patternTitleView.setTypeface(AndroidUtilities.bold());
                        this.patternTitleView.setPadding(AndroidUtilities.dp(f3), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(f3), AndroidUtilities.dp(8.0f));
                        this.patternTitleView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                        this.patternTitleView.setGravity(16);
                        frameLayoutArr[i8].addView(this.patternTitleView, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                        MessageSeenView.AnonymousClass1 anonymousClass23 = new MessageSeenView.AnonymousClass1(context);
                        this.patternsListView = anonymousClass23;
                        LinearLayoutManager linearLayoutManager4 = new LinearLayoutManager(0, false);
                        this.patternsLayoutManager = linearLayoutManager4;
                        anonymousClass23.setLayoutManager(linearLayoutManager4);
                        MessageSeenView.AnonymousClass1 anonymousClass24 = this.patternsListView;
                        PatternsAdapter patternsAdapter4 = new PatternsAdapter(context, this);
                        this.patternsAdapter = patternsAdapter4;
                        anonymousClass24.setAdapter(patternsAdapter4);
                        this.patternsListView.addItemDecoration(new FiltersView.AnonymousClass2(9));
                        frameLayoutArr[i8].addView(this.patternsListView, LayoutHelper.createFrame(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                        this.patternsListView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 21));
                        HeaderCell headerCell4 = new HeaderCell(context);
                        this.intensityCell = headerCell4;
                        headerCell4.setText(LocaleController.getString(R.string.BackgroundIntensity));
                        frameLayoutArr[i8].addView(this.intensityCell, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                        MaxFileSizeCell.AnonymousClass1 anonymousClass25 = new MaxFileSizeCell.AnonymousClass1(context, (AnonymousClass1) getResourceProvider());
                        this.intensitySeekBar = anonymousClass25;
                        anonymousClass25.setProgress(this.currentIntensity);
                        this.intensitySeekBar.setReportChanges(true);
                        this.intensitySeekBar.setDelegate(new PhotoViewer.AnonymousClass18(this, 29));
                        frameLayoutArr[i8].addView(this.intensitySeekBar, LayoutHelper.createFrame(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                    } else {
                        ColorPicker colorPicker7 = new ColorPicker(context, this.editingTheme, new AnonymousClass26());
                        this.colorPicker = colorPicker7;
                        colorPicker7.setResourcesProvider(getResourceProvider());
                        if (i34 == 1) {
                            frameLayoutArr[i8].addView(this.colorPicker, LayoutHelper.createFrame(-1, -1, 1));
                            if (themeInfo.isDark()) {
                                this.colorPicker.setMinBrightness(0.2f);
                            } else {
                                this.colorPicker.setMinBrightness(0.05f);
                                this.colorPicker.setMaxBrightness(0.8f);
                            }
                            if (themeAccent != null) {
                                if (themeAccent.accentColor2 != 0) {
                                    i11 = 2;
                                } else {
                                    i11 = 1;
                                }
                                ColorPicker colorPicker8 = this.colorPicker;
                                hasChanges(1);
                                colorPicker8.setType(1, 2, i11, false);
                                this.colorPicker.setColor(themeAccent.accentColor, 0);
                                i12 = themeAccent.accentColor2;
                                if (i12 != 0) {
                                    this.colorPicker.setColor(i12, 1);
                                }
                            }
                        } else {
                            frameLayoutArr[i8].addView(this.colorPicker, LayoutHelper.createFrame(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                        }
                    }
                    i8++;
                    i34 = i34;
                }
            } else {
                this.isBlurred = false;
                i8 = 0;
                while (i8 < 2) {
                    frameLayout = new FrameLayout(context) {
                        @Override
                        public final void onDraw(Canvas canvas) {
                            int i41112 = i8;
                            Rect rect6 = rect;
                            ThemePreviewActivity themePreviewActivity = ThemePreviewActivity.this;
                            if (i41112 == 0) {
                                themePreviewActivity.sheetDrawable.setBounds(themePreviewActivity.colorPicker.getLeft() - rect6.left, 0, themePreviewActivity.colorPicker.getRight() + rect6.right, getMeasuredHeight());
                            } else {
                                themePreviewActivity.sheetDrawable.setBounds(-rect6.left, 0, getMeasuredWidth() + rect6.right, getMeasuredHeight());
                            }
                            themePreviewActivity.sheetDrawable.draw(canvas);
                        }
                    };
                    frameLayoutArr = this.patternLayout;
                    frameLayoutArr[i8] = frameLayout;
                    if (i8 != 1) {
                        frameLayout.setVisibility(4);
                    } else {
                        frameLayout.setVisibility(4);
                    }
                    frameLayoutArr[i8].setWillNotDraw(false);
                    if (i34 == 2) {
                        if (i8 == 0) {
                            i13 = 321;
                        } else {
                            i13 = 316;
                        }
                        layoutParamsCreateFrame = LayoutHelper.createFrame(-1, i13, 83);
                    } else {
                        if (i8 == 0) {
                            i9 = 273;
                        } else {
                            i9 = 316;
                        }
                        layoutParamsCreateFrame = LayoutHelper.createFrame(-1, i9, 83);
                    }
                    if (i8 == 0) {
                        f2 = i34 != 2 ? 273 : 321;
                    } else {
                        f2 = 316.0f;
                    }
                    layoutParamsCreateFrame.height = AndroidUtilities.dp(f2);
                    if (insideBottomSheet()) {
                        layoutParamsCreateFrame.height += AndroidUtilities.navigationBarHeight;
                    }
                    if (i8 == 0) {
                        Drawable drawable5 = this.sheetDrawable;
                        Rect rect6 = AndroidUtilities.rectTmp2;
                        drawable5.getPadding(rect6);
                        layoutParamsCreateFrame.height = AndroidUtilities.dp(12.0f) + rect6.top + layoutParamsCreateFrame.height;
                    }
                    GLSurfaceView gLSurfaceView5 = frameLayoutArr[i8];
                    if (i8 == 0) {
                        iDp = AndroidUtilities.dp(12.0f) + rect.top;
                    } else {
                        iDp = 0;
                    }
                    if (insideBottomSheet()) {
                        i10 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i10 = 0;
                    }
                    gLSurfaceView5.setPadding(0, iDp, 0, i10);
                    this.page2.addView(frameLayoutArr[i8], layoutParamsCreateFrame);
                    r14 = 1;
                    if (i8 != 1) {
                        TextureViewContainer textureViewContainer11 = new TextureViewContainer(context, this, 1);
                        ViewGroup[] viewGroupArr8 = this.patternsButtonsContainer;
                        viewGroupArr8[i8] = textureViewContainer11;
                        textureViewContainer11.setWillNotDraw(false);
                        viewGroupArr8[i8].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        viewGroupArr8[i8].setClickable(true);
                        f3 = 21.0f;
                        frameLayoutArr[i8].addView(viewGroupArr8[i8], LayoutHelper.createFrame(-1, 51, 80));
                        TextView textView11113 = new TextView(context);
                        TextView[] textViewArr15 = this.patternsCancelButton;
                        textViewArr15[i8] = textView11113;
                        textView11113.setTextSize(1, 15.0f);
                        textViewArr15[i8].setTypeface(AndroidUtilities.bold());
                        TextView textView11114 = textViewArr15[i8];
                        int i41112 = Theme.key_chat_fieldOverlayText;
                        textView11114.setTextColor(getThemedColor(i41112));
                        textViewArr15[i8].setText(LocaleController.getString(R.string.Cancel));
                        textViewArr15[i8].setGravity(17);
                        textViewArr15[i8].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView11115 = textViewArr15[i8];
                        int i41113 = Theme.key_listSelector;
                        textView11115.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i41113), 0));
                        viewGroupArr8[i8].addView(textViewArr15[i8], LayoutHelper.createFrame(-2, -1, 51));
                        final int i41114 = 0;
                        textViewArr15[i8].setOnClickListener(new View.OnClickListener(this) {
                            public final ThemePreviewActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i41114) {
                                    case 0:
                                        ThemePreviewActivity themePreviewActivity = this.f$0;
                                        if (themePreviewActivity.patternViewAnimation == null) {
                                            int i41115 = i8;
                                            if (i41115 == 0) {
                                                themePreviewActivity.backgroundRotation = themePreviewActivity.previousBackgroundRotation;
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor3, 3, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor2, 2, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor1, 1, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundColor, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = themePreviewActivity.previousSelectedPattern;
                                                themePreviewActivity.selectedPattern = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    themePreviewActivity.backgroundImage.setImageDrawable(null);
                                                } else {
                                                    ThemePreviewActivity.BackgroundView backgroundView3 = themePreviewActivity.backgroundImage;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str7 = themePreviewActivity.imageFilter;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = themePreviewActivity.selectedPattern;
                                                    backgroundView3.imageReceiver.setImage(forDocument, str7, null, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                    backgroundView3.onNewImageSet();
                                                }
                                                themePreviewActivity.backgroundCheckBoxView[1].setChecked(themePreviewActivity.selectedPattern != null, false);
                                                float f13 = themePreviewActivity.previousIntensity;
                                                themePreviewActivity.currentIntensity = f13;
                                                themePreviewActivity.intensitySeekBar.setProgress(f13);
                                                themePreviewActivity.backgroundImage.getImageReceiver().setAlpha(themePreviewActivity.currentIntensity);
                                                themePreviewActivity.updateButtonState$1$1();
                                                themePreviewActivity.updateSelectedPattern();
                                            }
                                            if (themePreviewActivity.screenType != 2) {
                                                if (themePreviewActivity.selectedPattern == null) {
                                                    if (themePreviewActivity.isMotion) {
                                                        themePreviewActivity.isMotion = false;
                                                        themePreviewActivity.backgroundCheckBoxView[0].setChecked(false, true);
                                                        themePreviewActivity.animateMotionChange();
                                                    }
                                                    themePreviewActivity.updateMotionButton();
                                                }
                                                themePreviewActivity.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity.showPatternsView(i41115, false);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                        if (themePreviewActivity2.patternViewAnimation == null) {
                                            if (themePreviewActivity2.screenType != 2) {
                                                themePreviewActivity2.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity2.showPatternsView(i8, false);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        TextView textView11116 = new TextView(context);
                        TextView[] textViewArr16 = this.patternsSaveButton;
                        textViewArr16[i8] = textView11116;
                        textView11116.setTextSize(1, 15.0f);
                        textViewArr16[i8].setTypeface(AndroidUtilities.bold());
                        textViewArr16[i8].setTextColor(getThemedColor(i41112));
                        textViewArr16[i8].setText(LocaleController.getString(R.string.ApplyTheme));
                        textViewArr16[i8].setGravity(17);
                        textViewArr16[i8].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        textViewArr16[i8].setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i41113), 0));
                        viewGroupArr8[i8].addView(textViewArr16[i8], LayoutHelper.createFrame(-2, -1, 53));
                        TextView textView11117 = textViewArr16[i8];
                        r14 = 1;
                        final int c9 = 1 == true ? 1 : 0;
                        textView11117.setOnClickListener(new View.OnClickListener(this) {
                            public final ThemePreviewActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (c9) {
                                    case 0:
                                        ThemePreviewActivity themePreviewActivity = this.f$0;
                                        if (themePreviewActivity.patternViewAnimation == null) {
                                            int i41115 = i8;
                                            if (i41115 == 0) {
                                                themePreviewActivity.backgroundRotation = themePreviewActivity.previousBackgroundRotation;
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor3, 3, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor2, 2, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor1, 1, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundColor, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = themePreviewActivity.previousSelectedPattern;
                                                themePreviewActivity.selectedPattern = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    themePreviewActivity.backgroundImage.setImageDrawable(null);
                                                } else {
                                                    ThemePreviewActivity.BackgroundView backgroundView3 = themePreviewActivity.backgroundImage;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str7 = themePreviewActivity.imageFilter;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = themePreviewActivity.selectedPattern;
                                                    backgroundView3.imageReceiver.setImage(forDocument, str7, null, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                    backgroundView3.onNewImageSet();
                                                }
                                                themePreviewActivity.backgroundCheckBoxView[1].setChecked(themePreviewActivity.selectedPattern != null, false);
                                                float f13 = themePreviewActivity.previousIntensity;
                                                themePreviewActivity.currentIntensity = f13;
                                                themePreviewActivity.intensitySeekBar.setProgress(f13);
                                                themePreviewActivity.backgroundImage.getImageReceiver().setAlpha(themePreviewActivity.currentIntensity);
                                                themePreviewActivity.updateButtonState$1$1();
                                                themePreviewActivity.updateSelectedPattern();
                                            }
                                            if (themePreviewActivity.screenType != 2) {
                                                if (themePreviewActivity.selectedPattern == null) {
                                                    if (themePreviewActivity.isMotion) {
                                                        themePreviewActivity.isMotion = false;
                                                        themePreviewActivity.backgroundCheckBoxView[0].setChecked(false, true);
                                                        themePreviewActivity.animateMotionChange();
                                                    }
                                                    themePreviewActivity.updateMotionButton();
                                                }
                                                themePreviewActivity.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity.showPatternsView(i41115, false);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                        if (themePreviewActivity2.patternViewAnimation == null) {
                                            if (themePreviewActivity2.screenType != 2) {
                                                themePreviewActivity2.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity2.showPatternsView(i8, false);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        TextureViewContainer textureViewContainer12 = new TextureViewContainer(context, this, 1);
                        ViewGroup[] viewGroupArr9 = this.patternsButtonsContainer;
                        viewGroupArr9[i8] = textureViewContainer12;
                        textureViewContainer12.setWillNotDraw(false);
                        viewGroupArr9[i8].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        viewGroupArr9[i8].setClickable(true);
                        f3 = 21.0f;
                        frameLayoutArr[i8].addView(viewGroupArr9[i8], LayoutHelper.createFrame(-1, 51, 80));
                        TextView textView11118 = new TextView(context);
                        TextView[] textViewArr17 = this.patternsCancelButton;
                        textViewArr17[i8] = textView11118;
                        textView11118.setTextSize(1, 15.0f);
                        textViewArr17[i8].setTypeface(AndroidUtilities.bold());
                        TextView textView11119 = textViewArr17[i8];
                        int i41115 = Theme.key_chat_fieldOverlayText;
                        textView11119.setTextColor(getThemedColor(i41115));
                        textViewArr17[i8].setText(LocaleController.getString(R.string.Cancel));
                        textViewArr17[i8].setGravity(17);
                        textViewArr17[i8].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView111110 = textViewArr17[i8];
                        int i41116 = Theme.key_listSelector;
                        textView111110.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i41116), 0));
                        viewGroupArr9[i8].addView(textViewArr17[i8], LayoutHelper.createFrame(-2, -1, 51));
                        final int i41117 = 0;
                        textViewArr17[i8].setOnClickListener(new View.OnClickListener(this) {
                            public final ThemePreviewActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i41117) {
                                    case 0:
                                        ThemePreviewActivity themePreviewActivity = this.f$0;
                                        if (themePreviewActivity.patternViewAnimation == null) {
                                            int i41118 = i8;
                                            if (i41118 == 0) {
                                                themePreviewActivity.backgroundRotation = themePreviewActivity.previousBackgroundRotation;
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor3, 3, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor2, 2, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor1, 1, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundColor, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = themePreviewActivity.previousSelectedPattern;
                                                themePreviewActivity.selectedPattern = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    themePreviewActivity.backgroundImage.setImageDrawable(null);
                                                } else {
                                                    ThemePreviewActivity.BackgroundView backgroundView3 = themePreviewActivity.backgroundImage;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str7 = themePreviewActivity.imageFilter;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = themePreviewActivity.selectedPattern;
                                                    backgroundView3.imageReceiver.setImage(forDocument, str7, null, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                    backgroundView3.onNewImageSet();
                                                }
                                                themePreviewActivity.backgroundCheckBoxView[1].setChecked(themePreviewActivity.selectedPattern != null, false);
                                                float f13 = themePreviewActivity.previousIntensity;
                                                themePreviewActivity.currentIntensity = f13;
                                                themePreviewActivity.intensitySeekBar.setProgress(f13);
                                                themePreviewActivity.backgroundImage.getImageReceiver().setAlpha(themePreviewActivity.currentIntensity);
                                                themePreviewActivity.updateButtonState$1$1();
                                                themePreviewActivity.updateSelectedPattern();
                                            }
                                            if (themePreviewActivity.screenType != 2) {
                                                if (themePreviewActivity.selectedPattern == null) {
                                                    if (themePreviewActivity.isMotion) {
                                                        themePreviewActivity.isMotion = false;
                                                        themePreviewActivity.backgroundCheckBoxView[0].setChecked(false, true);
                                                        themePreviewActivity.animateMotionChange();
                                                    }
                                                    themePreviewActivity.updateMotionButton();
                                                }
                                                themePreviewActivity.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity.showPatternsView(i41118, false);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                        if (themePreviewActivity2.patternViewAnimation == null) {
                                            if (themePreviewActivity2.screenType != 2) {
                                                themePreviewActivity2.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity2.showPatternsView(i8, false);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        TextView textView111111 = new TextView(context);
                        TextView[] textViewArr18 = this.patternsSaveButton;
                        textViewArr18[i8] = textView111111;
                        textView111111.setTextSize(1, 15.0f);
                        textViewArr18[i8].setTypeface(AndroidUtilities.bold());
                        textViewArr18[i8].setTextColor(getThemedColor(i41115));
                        textViewArr18[i8].setText(LocaleController.getString(R.string.ApplyTheme));
                        textViewArr18[i8].setGravity(17);
                        textViewArr18[i8].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        textViewArr18[i8].setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i41116), 0));
                        viewGroupArr9[i8].addView(textViewArr18[i8], LayoutHelper.createFrame(-2, -1, 53));
                        TextView textView111112 = textViewArr18[i8];
                        r14 = 1;
                        final int c10 = 1 == true ? 1 : 0;
                        textView111112.setOnClickListener(new View.OnClickListener(this) {
                            public final ThemePreviewActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (c10) {
                                    case 0:
                                        ThemePreviewActivity themePreviewActivity = this.f$0;
                                        if (themePreviewActivity.patternViewAnimation == null) {
                                            int i41118 = i8;
                                            if (i41118 == 0) {
                                                themePreviewActivity.backgroundRotation = themePreviewActivity.previousBackgroundRotation;
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor3, 3, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor2, 2, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor1, 1, true);
                                                themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundColor, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = themePreviewActivity.previousSelectedPattern;
                                                themePreviewActivity.selectedPattern = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    themePreviewActivity.backgroundImage.setImageDrawable(null);
                                                } else {
                                                    ThemePreviewActivity.BackgroundView backgroundView3 = themePreviewActivity.backgroundImage;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str7 = themePreviewActivity.imageFilter;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = themePreviewActivity.selectedPattern;
                                                    backgroundView3.imageReceiver.setImage(forDocument, str7, null, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                    backgroundView3.onNewImageSet();
                                                }
                                                themePreviewActivity.backgroundCheckBoxView[1].setChecked(themePreviewActivity.selectedPattern != null, false);
                                                float f13 = themePreviewActivity.previousIntensity;
                                                themePreviewActivity.currentIntensity = f13;
                                                themePreviewActivity.intensitySeekBar.setProgress(f13);
                                                themePreviewActivity.backgroundImage.getImageReceiver().setAlpha(themePreviewActivity.currentIntensity);
                                                themePreviewActivity.updateButtonState$1$1();
                                                themePreviewActivity.updateSelectedPattern();
                                            }
                                            if (themePreviewActivity.screenType != 2) {
                                                if (themePreviewActivity.selectedPattern == null) {
                                                    if (themePreviewActivity.isMotion) {
                                                        themePreviewActivity.isMotion = false;
                                                        themePreviewActivity.backgroundCheckBoxView[0].setChecked(false, true);
                                                        themePreviewActivity.animateMotionChange();
                                                    }
                                                    themePreviewActivity.updateMotionButton();
                                                }
                                                themePreviewActivity.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity.showPatternsView(i41118, false);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        ThemePreviewActivity themePreviewActivity2 = this.f$0;
                                        if (themePreviewActivity2.patternViewAnimation == null) {
                                            if (themePreviewActivity2.screenType != 2) {
                                                themePreviewActivity2.showPatternsView(0, true);
                                            } else {
                                                themePreviewActivity2.showPatternsView(i8, false);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    if (i8 == r14) {
                        TextView textView23 = new TextView(context);
                        this.patternTitleView = textView23;
                        textView23.setLines(r14);
                        this.patternTitleView.setSingleLine(r14);
                        this.patternTitleView.setText(LocaleController.getString(R.string.BackgroundChoosePattern));
                        this.patternTitleView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                        this.patternTitleView.setTextSize(r14, 20.0f);
                        this.patternTitleView.setTypeface(AndroidUtilities.bold());
                        this.patternTitleView.setPadding(AndroidUtilities.dp(f3), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(f3), AndroidUtilities.dp(8.0f));
                        this.patternTitleView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                        this.patternTitleView.setGravity(16);
                        frameLayoutArr[i8].addView(this.patternTitleView, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                        MessageSeenView.AnonymousClass1 anonymousClass26 = new MessageSeenView.AnonymousClass1(context);
                        this.patternsListView = anonymousClass26;
                        LinearLayoutManager linearLayoutManager5 = new LinearLayoutManager(0, false);
                        this.patternsLayoutManager = linearLayoutManager5;
                        anonymousClass26.setLayoutManager(linearLayoutManager5);
                        MessageSeenView.AnonymousClass1 anonymousClass28 = this.patternsListView;
                        PatternsAdapter patternsAdapter5 = new PatternsAdapter(context, this);
                        this.patternsAdapter = patternsAdapter5;
                        anonymousClass28.setAdapter(patternsAdapter5);
                        this.patternsListView.addItemDecoration(new FiltersView.AnonymousClass2(9));
                        frameLayoutArr[i8].addView(this.patternsListView, LayoutHelper.createFrame(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                        this.patternsListView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 21));
                        HeaderCell headerCell5 = new HeaderCell(context);
                        this.intensityCell = headerCell5;
                        headerCell5.setText(LocaleController.getString(R.string.BackgroundIntensity));
                        frameLayoutArr[i8].addView(this.intensityCell, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                        MaxFileSizeCell.AnonymousClass1 anonymousClass29 = new MaxFileSizeCell.AnonymousClass1(context, (AnonymousClass1) getResourceProvider());
                        this.intensitySeekBar = anonymousClass29;
                        anonymousClass29.setProgress(this.currentIntensity);
                        this.intensitySeekBar.setReportChanges(true);
                        this.intensitySeekBar.setDelegate(new PhotoViewer.AnonymousClass18(this, 29));
                        frameLayoutArr[i8].addView(this.intensitySeekBar, LayoutHelper.createFrame(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                    } else {
                        ColorPicker colorPicker9 = new ColorPicker(context, this.editingTheme, new AnonymousClass26());
                        this.colorPicker = colorPicker9;
                        colorPicker9.setResourcesProvider(getResourceProvider());
                        if (i34 == 1) {
                            frameLayoutArr[i8].addView(this.colorPicker, LayoutHelper.createFrame(-1, -1, 1));
                            if (themeInfo.isDark()) {
                                this.colorPicker.setMinBrightness(0.2f);
                            } else {
                                this.colorPicker.setMinBrightness(0.05f);
                                this.colorPicker.setMaxBrightness(0.8f);
                            }
                            if (themeAccent != null) {
                                if (themeAccent.accentColor2 != 0) {
                                    i11 = 2;
                                } else {
                                    i11 = 1;
                                }
                                ColorPicker colorPicker10 = this.colorPicker;
                                hasChanges(1);
                                colorPicker10.setType(1, 2, i11, false);
                                this.colorPicker.setColor(themeAccent.accentColor, 0);
                                i12 = themeAccent.accentColor2;
                                if (i12 != 0) {
                                    this.colorPicker.setColor(i12, 1);
                                }
                            }
                        } else {
                            frameLayoutArr[i8].addView(this.colorPicker, LayoutHelper.createFrame(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                        }
                    }
                    i8++;
                    i34 = i34;
                }
            }
            i14 = i34;
            updateButtonState$1$1();
            if (!this.backgroundImage.getImageReceiver().hasBitmapImage()) {
                this.page2.setBackgroundColor(-16777216);
            }
            if (i14 != 1) {
                this.backgroundImage.getImageReceiver().setCrossfadeWithOldImage(true);
            }
        }
        setAdapter(this.messagesAdapter);
        TextureViewContainer textureViewContainer13 = new TextureViewContainer(context, this, 2);
        this.frameLayout = textureViewContainer13;
        textureViewContainer13.setWillNotDraw(false);
        TextureViewContainer textureViewContainer14 = this.frameLayout;
        this.fragmentView = textureViewContainer14;
        ViewTreeObserver viewTreeObserver2 = textureViewContainer14.getViewTreeObserver();
        LaunchActivity$$ExternalSyntheticLambda28 launchActivity$$ExternalSyntheticLambda29 = new LaunchActivity$$ExternalSyntheticLambda28(this, 3);
        this.onGlobalLayoutListener = launchActivity$$ExternalSyntheticLambda29;
        viewTreeObserver2.addOnGlobalLayoutListener(launchActivity$$ExternalSyntheticLambda29);
        ViewPager viewPager3 = new ViewPager(context);
        this.viewPager = viewPager3;
        viewPager3.addOnPageChangeListener(new IntroActivity.AnonymousClass3(this, 5));
        this.viewPager.setAdapter(new AnonymousClass29(this, 0));
        AndroidUtilities.setViewPagerEdgeEffectColor(this.viewPager, getThemedColor(Theme.key_actionBarDefault));
        TextureViewContainer textureViewContainer15 = this.frameLayout;
        ViewPager viewPager4 = this.viewPager;
        if (i14 == 0) {
            f12 = 48.0f;
        } else {
            f12 = 0.0f;
        }
        textureViewContainer15.addView(viewPager4, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, f12));
        UndoView undoView2 = new UndoView(context, this);
        this.undoView = undoView2;
        undoView2.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.frameLayout.addView(this.undoView, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        if (i14 == 0) {
            View view2 = new View(context);
            view2.setBackgroundColor(getThemedColor(Theme.key_dialogShadowLine));
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, 1, 83);
            layoutParams4.bottomMargin = AndroidUtilities.dp(48.0f);
            this.frameLayout.addView(view2, layoutParams4);
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.saveButtonsContainer = frameLayout3;
            i25 = Theme.key_windowBackgroundWhite;
            z5 = this.useDefaultThemeForButtons;
            if (z5) {
                themedColor = Theme.getDefaultColor(i25);
            } else {
                themedColor = getThemedColor(i25);
            }
            frameLayout3.setBackgroundColor(themedColor);
            this.frameLayout.addView(this.saveButtonsContainer, LayoutHelper.createFrame(-1, 48, 83));
            ChatActivity.AnonymousClass27 anonymousClass210 = new ChatActivity.AnonymousClass27(context, this);
            this.dotsContainer = anonymousClass210;
            this.saveButtonsContainer.addView(anonymousClass210, LayoutHelper.createFrame(22, 8, 17));
            TextView textView24 = new TextView(context);
            this.cancelButton = textView24;
            textView24.setTextSize(1, 14.0f);
            TextView textView25 = this.cancelButton;
            i26 = Theme.key_chat_fieldOverlayText;
            if (z5) {
                themedColor2 = Theme.getDefaultColor(i26);
            } else {
                themedColor2 = getThemedColor(i26);
            }
            textView25.setTextColor(themedColor2);
            this.cancelButton.setGravity(17);
            this.cancelButton.setBackgroundDrawable(Theme.createSelectorDrawable(251658240, 0));
            this.cancelButton.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
            this.cancelButton.setText(LocaleController.getString(R.string.Cancel));
            this.cancelButton.setTypeface(AndroidUtilities.bold());
            this.saveButtonsContainer.addView(this.cancelButton, LayoutHelper.createFrame(-2, -1, 51));
            final int i421 = 0;
            this.cancelButton.setOnClickListener(new View.OnClickListener(this) {
                public final ThemePreviewActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (i421) {
                        case 0:
                            this.f$0.cancelThemeApply(false);
                            break;
                        case 1:
                            this.f$0.lambda$createView$18$1$2();
                            break;
                        case 2:
                            this.f$0.dropDownContainer.toggleSubMenu(null, null);
                            break;
                        case 3:
                            this.f$0.applyWallpaperBackground(false);
                            break;
                        default:
                            this.f$0.applyWallpaperBackground(true);
                            break;
                    }
                }
            });
            TextView textView26 = new TextView(context);
            this.doneButton = textView26;
            textView26.setTextSize(1, 14.0f);
            TextView textView120 = this.doneButton;
            if (z5) {
                themedColor3 = Theme.getDefaultColor(i26);
            } else {
                themedColor3 = getThemedColor(i26);
            }
            textView120.setTextColor(themedColor3);
            this.doneButton.setGravity(17);
            this.doneButton.setBackgroundDrawable(Theme.createSelectorDrawable(251658240, 0));
            this.doneButton.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
            this.doneButton.setText(LocaleController.getString(R.string.ApplyTheme));
            this.doneButton.setTypeface(AndroidUtilities.bold());
            this.saveButtonsContainer.addView(this.doneButton, LayoutHelper.createFrame(-2, -1, 53));
            i24 = 1;
            this.doneButton.setOnClickListener(new View.OnClickListener(this) {
                public final ThemePreviewActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (i24) {
                        case 0:
                            this.f$0.cancelThemeApply(false);
                            break;
                        case 1:
                            this.f$0.lambda$createView$18$1$2();
                            break;
                        case 2:
                            this.f$0.dropDownContainer.toggleSubMenu(null, null);
                            break;
                        case 3:
                            this.f$0.applyWallpaperBackground(false);
                            break;
                        default:
                            this.f$0.applyWallpaperBackground(true);
                            break;
                    }
                }
            });
        } else {
            i24 = 1;
        }
        if (i14 == i24) {
            selectColorType();
        }
        this.themeDescriptions = getThemeDescriptionsInternal();
        setCurrentImage(true);
        updatePlayAnimationView(false);
        this.scroller = new Scroller(getContext());
        iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null) {
            this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(Theme.key_dialogBackground));
            if (i14 == 2) {
                this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
            }
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        TLRPC.TL_wallPaper tL_wallPaper2;
        String str;
        String str2;
        if (i == NotificationCenter.chatWasBoostedByUser) {
            if (this.dialogId == ((Long) objArr[2]).longValue()) {
                this.boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[0];
                updateApplyButton1(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.emojiLoaded) {
            RecyclerListView recyclerListView = this.listView;
            if (recyclerListView == null) {
                return;
            }
            int childCount = recyclerListView.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.listView.getChildAt(i3);
                if (childAt instanceof DialogCell) {
                    ((DialogCell) childAt).update(0, true);
                }
            }
            return;
        }
        if (i == NotificationCenter.invalidateMotionBackground) {
            AnonymousClass10 anonymousClass10 = this.listView2;
            if (anonymousClass10 != null) {
                anonymousClass10.invalidateViews();
                return;
            }
            return;
        }
        if (i == NotificationCenter.didSetNewWallpapper) {
            if (this.page2 != null) {
                setCurrentImage(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.wallpapersNeedReload) {
            Object obj = this.currentWallpaper;
            if (obj instanceof WallpapersListActivity.FileWallpaper) {
                WallpapersListActivity.FileWallpaper fileWallpaper = (WallpapersListActivity.FileWallpaper) obj;
                if (fileWallpaper.slug == null) {
                    fileWallpaper.slug = (String) objArr[0];
                    return;
                }
                return;
            }
            return;
        }
        long jCalcHash = 0;
        if (i != NotificationCenter.wallpapersDidLoad) {
            if (i != NotificationCenter.wallpaperSettedToUser || this.dialogId == 0) {
                return;
            }
            finishFragment();
            return;
        }
        ArrayList arrayList = (ArrayList) objArr[0];
        this.patterns.clear();
        HashMap map = this.patternsDict;
        map.clear();
        int size = arrayList.size();
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i4);
            if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                TLRPC.Document document = wallPaper.document;
                if (document != null && !map.containsKey(Long.valueOf(document.id))) {
                    this.patterns.add(wallPaper);
                    map.put(Long.valueOf(wallPaper.document.id), wallPaper);
                }
                Theme.ThemeAccent themeAccent = this.accent;
                if (themeAccent != null && (str2 = themeAccent.patternSlug) != null && str2.equals(wallPaper.slug)) {
                    this.selectedPattern = (TLRPC.TL_wallPaper) wallPaper;
                    setCurrentImage(false);
                    updateButtonState$1$1();
                } else if (themeAccent != null || (tL_wallPaper2 = this.selectedPattern) == null || (str = tL_wallPaper2.slug) == null || !str.equals(wallPaper.slug)) {
                }
                z = true;
            }
        }
        if (!z && (tL_wallPaper = this.selectedPattern) != null) {
            this.patterns.add(0, tL_wallPaper);
        }
        PatternsAdapter patternsAdapter = this.patternsAdapter;
        if (patternsAdapter != null) {
            patternsAdapter.mObservable.notifyChanged();
        }
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i5);
            if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                jCalcHash = MediaDataController.calcHash(jCalcHash, wallPaper2.id);
            }
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = jCalcHash;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new ThemePreviewActivity$$ExternalSyntheticLambda3(this, 0)), this.classGuid);
    }

    @Override
    public final int getObserverTag() {
        return this.TAG;
    }

    @Override
    public final Theme.ResourcesProvider getResourceProvider() {
        return this.themeDelegate;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return this.shouldShowDayNightIcon ? getThemeDescriptionsInternal() : super.getThemeDescriptions();
    }

    public final ArrayList getThemeDescriptionsInternal() {
        QrActivity$$ExternalSyntheticLambda9 qrActivity$$ExternalSyntheticLambda9 = new QrActivity$$ExternalSyntheticLambda9(19, this);
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.page1;
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(frameLayout, 1, null, null, null, qrActivity$$ExternalSyntheticLambda9, i));
        ViewPager viewPager = this.viewPager;
        int i2 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(viewPager, 32768, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBar, 1, null, null, null, null, i2));
        ActionBar actionBar = this.actionBar;
        int i3 = Theme.key_actionBarDefaultSelector;
        arrayList.add(new ThemeDescription(actionBar, 256, null, null, null, null, i3));
        ActionBar actionBar2 = this.actionBar;
        int i4 = Theme.key_actionBarDefaultTitle;
        arrayList.add(new ThemeDescription(actionBar2, 128, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.actionBar, 134217728, null, null, null, null, Theme.key_actionBarDefaultSearch));
        arrayList.add(new ThemeDescription(this.actionBar, 67108864, null, null, null, null, Theme.key_actionBarDefaultSearchPlaceholder));
        arrayList.add(new ThemeDescription(this.actionBar2, 1, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBar2, 128, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.actionBar2, 1024, null, null, null, null, Theme.key_actionBarDefaultSubtitle));
        arrayList.add(new ThemeDescription(this.actionBar2, 256, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.actionBar2, Integer.MIN_VALUE, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_actionBarDefaultSubmenuBackground));
        arrayList.add(new ThemeDescription(this.actionBar2, 1073741824, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_actionBarDefaultSubmenuItem));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView2, 32768, null, null, null, null, i2));
        if (!this.useDefaultThemeForButtons) {
            arrayList.add(new ThemeDescription(this.saveButtonsContainer, 1, null, null, null, null, i));
            TextView textView = this.cancelButton;
            int i5 = Theme.key_chat_fieldOverlayText;
            arrayList.add(new ThemeDescription(textView, 4, null, null, null, null, i5));
            arrayList.add(new ThemeDescription(this.doneButton, 4, null, null, null, null, i5));
        }
        ColorPicker colorPicker = this.colorPicker;
        if (colorPicker != null) {
            int i6 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = colorPicker.colorEditText;
                if (i6 >= editTextBoldCursorArr.length) {
                    break;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i6];
                int i7 = Theme.key_windowBackgroundWhiteBlackText;
                arrayList.add(new ThemeDescription(editTextBoldCursor, 4, null, null, null, null, i7));
                arrayList.add(new ThemeDescription(editTextBoldCursorArr[i6], 16777216, null, null, null, null, i7));
                arrayList.add(new ThemeDescription(editTextBoldCursorArr[i6], 8388608, null, null, null, null, Theme.key_windowBackgroundWhiteHintText));
                arrayList.add(new ThemeDescription(editTextBoldCursorArr[i6], 8390656, null, null, null, null, Theme.key_windowBackgroundWhiteBlueHeader));
                arrayList.add(new ThemeDescription(editTextBoldCursorArr[i6], 32, null, null, null, null, Theme.key_windowBackgroundWhiteInputField));
                arrayList.add(new ThemeDescription(editTextBoldCursorArr[i6], 65568, null, null, null, null, Theme.key_windowBackgroundWhiteInputFieldActivated));
                i6++;
            }
            int i8 = Theme.key_windowBackgroundWhiteBlackText;
            arrayList.add(new ThemeDescription(colorPicker.clearButton, 8, null, null, null, null, i8));
            int i9 = Theme.key_dialogButtonSelector;
            arrayList.add(new ThemeDescription(colorPicker.clearButton, 32, null, null, null, null, i9));
            ActionBarMenuItem actionBarMenuItem = colorPicker.menuItem;
            if (actionBarMenuItem != null) {
                ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(colorPicker, 15);
                arrayList.add(new ThemeDescription(actionBarMenuItem, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, i8));
                arrayList.add(new ThemeDescription(actionBarMenuItem, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, i9));
                arrayList.add(new ThemeDescription(actionBarMenuItem, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_actionBarDefaultSubmenuItem));
                arrayList.add(new ThemeDescription(actionBarMenuItem, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_actionBarDefaultSubmenuItemIcon));
                arrayList.add(new ThemeDescription(actionBarMenuItem, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_actionBarDefaultSubmenuBackground));
            }
        }
        FrameLayout[] frameLayoutArr = this.patternLayout;
        if (frameLayoutArr != null) {
            for (int i10 = 0; i10 < frameLayoutArr.length; i10++) {
                arrayList.add(new ThemeDescription(frameLayoutArr[i10], 0, null, null, new Drawable[]{Theme.chat_composeShadowDrawable}, null, Theme.key_chat_messagePanelShadow));
                arrayList.add(new ThemeDescription(frameLayoutArr[i10], 0, null, Theme.chat_composeBackgroundPaint, null, null, Theme.key_chat_messagePanelBackground));
            }
            int i11 = 0;
            while (true) {
                FrameLayout[] frameLayoutArr2 = this.patternsButtonsContainer;
                if (i11 >= frameLayoutArr2.length) {
                    break;
                }
                arrayList.add(new ThemeDescription(frameLayoutArr2[i11], 0, null, null, new Drawable[]{Theme.chat_composeShadowDrawable}, null, Theme.key_chat_messagePanelShadow));
                arrayList.add(new ThemeDescription(frameLayoutArr2[i11], 0, null, Theme.chat_composeBackgroundPaint, null, null, Theme.key_chat_messagePanelBackground));
                i11++;
            }
            arrayList.add(new ThemeDescription(this.bottomOverlayChat, 0, null, null, new Drawable[]{Theme.chat_composeShadowDrawable}, null, Theme.key_chat_messagePanelShadow));
            arrayList.add(new ThemeDescription(this.bottomOverlayChat, 0, null, Theme.chat_composeBackgroundPaint, null, null, Theme.key_chat_messagePanelBackground));
            int i12 = 0;
            while (true) {
                TextView[] textViewArr = this.patternsSaveButton;
                if (i12 >= textViewArr.length) {
                    break;
                }
                arrayList.add(new ThemeDescription(textViewArr[i12], 4, null, null, null, null, Theme.key_chat_fieldOverlayText));
                i12++;
            }
            int i13 = 0;
            while (true) {
                TextView[] textViewArr2 = this.patternsCancelButton;
                if (i13 >= textViewArr2.length) {
                    break;
                }
                arrayList.add(new ThemeDescription(textViewArr2[i13], 4, null, null, null, null, Theme.key_chat_fieldOverlayText));
                i13++;
            }
            arrayList.add(new ThemeDescription(this.intensitySeekBar, 0, new Class[]{SeekBarView.class}, new String[]{"innerPaint1"}, null, null, -1, null, Theme.key_player_progressBackground));
            arrayList.add(new ThemeDescription(this.intensitySeekBar, 0, new Class[]{SeekBarView.class}, new String[]{"outerPaint1"}, null, null, -1, null, Theme.key_player_progress));
            arrayList.add(new ThemeDescription(this.intensityCell, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgInDrawable, Theme.chat_msgInMediaDrawable}, null, Theme.key_chat_inBubble));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgInSelectedDrawable, Theme.chat_msgInMediaSelectedDrawable}, null, Theme.key_chat_inBubbleSelected));
            Drawable[] drawableArr = Theme.chat_msgInDrawable.shadowDrawable;
            int i14 = Theme.key_chat_inBubbleShadow;
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, drawableArr, null, i14));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, Theme.chat_msgInMediaDrawable.shadowDrawable, null, i14));
            Theme.AnonymousClass12 anonymousClass12 = this.msgOutDrawable;
            Theme.AnonymousClass12 anonymousClass13 = this.msgOutMediaDrawable;
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{anonymousClass12, anonymousClass13}, null, Theme.key_chat_outBubble));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{anonymousClass12, anonymousClass13}, null, Theme.key_chat_outBubbleGradient1));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{anonymousClass12, anonymousClass13}, null, Theme.key_chat_outBubbleGradient2));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{anonymousClass12, anonymousClass13}, null, Theme.key_chat_outBubbleGradient3));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutSelectedDrawable, Theme.chat_msgOutMediaSelectedDrawable}, null, Theme.key_chat_outBubbleSelected));
            Drawable[] drawableArr2 = Theme.chat_msgOutDrawable.shadowDrawable;
            int i15 = Theme.key_chat_outBubbleShadow;
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, drawableArr2, null, i15));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, Theme.chat_msgOutMediaDrawable.shadowDrawable, null, i15));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_messageTextIn));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_messageTextOut));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutCheckDrawable}, null, Theme.key_chat_outSentCheck));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutCheckSelectedDrawable}, null, Theme.key_chat_outSentCheckSelected));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutCheckReadDrawable, Theme.chat_msgOutHalfCheckDrawable}, null, Theme.key_chat_outSentCheckRead));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutCheckReadSelectedDrawable, Theme.chat_msgOutHalfCheckSelectedDrawable}, null, Theme.key_chat_outSentCheckReadSelected));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgMediaCheckDrawable, Theme.chat_msgMediaHalfCheckDrawable}, null, Theme.key_chat_mediaSentCheck));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inReplyLine));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outReplyLine));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inReplyNameText));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outReplyNameText));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inReplyMessageText));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outReplyMessageText));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inReplyMediaMessageSelectedText));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outReplyMediaMessageSelectedText));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inTimeText));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outTimeText));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_inTimeSelectedText));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, null, null, Theme.key_chat_outTimeSelectedText));
        }
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_divider));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_dialogBackground));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_dialogBackgroundGray));
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ((ThemeDescription) arrayList.get(i16)).resourcesProvider = this.themeDelegate;
        }
        return arrayList;
    }

    public final boolean hasChanges(int i) {
        int defaultAccentColor;
        long j;
        if (this.editingTheme) {
            return false;
        }
        Theme.ThemeAccent themeAccent = this.accent;
        if (i == 1 || i == 2) {
            long j2 = this.backupBackgroundOverrideColor;
            if (j2 == 0) {
                int defaultAccentColor2 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper);
                int i2 = (int) themeAccent.backgroundOverrideColor;
                if (i2 == 0) {
                    i2 = defaultAccentColor2;
                }
                if (i2 != defaultAccentColor2) {
                    return true;
                }
            } else if (j2 != themeAccent.backgroundOverrideColor) {
                return true;
            }
            long j3 = this.backupBackgroundGradientOverrideColor3;
            long j4 = this.backupBackgroundGradientOverrideColor2;
            long j5 = this.backupBackgroundGradientOverrideColor1;
            if (j5 == 0 && j4 == 0 && j3 == 0) {
                for (int i3 = 0; i3 < 3; i3++) {
                    if (i3 == 0) {
                        defaultAccentColor = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to1);
                        j = themeAccent.backgroundGradientOverrideColor1;
                    } else if (i3 == 1) {
                        defaultAccentColor = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to2);
                        j = themeAccent.backgroundGradientOverrideColor2;
                    } else {
                        defaultAccentColor = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to3);
                        j = themeAccent.backgroundGradientOverrideColor3;
                    }
                    int i4 = (int) j;
                    if (i4 == 0 && j != 0) {
                        i4 = 0;
                    } else if (i4 == 0) {
                        i4 = defaultAccentColor;
                    }
                    if (i4 != defaultAccentColor) {
                        return true;
                    }
                }
            } else if (j5 != themeAccent.backgroundGradientOverrideColor1 || j4 != themeAccent.backgroundGradientOverrideColor2 || j3 != themeAccent.backgroundGradientOverrideColor3) {
                return true;
            }
            if (themeAccent.backgroundRotation != this.backupBackgroundRotation) {
                return true;
            }
        }
        if (i == 1 || i == 3) {
            if (this.backupAccentColor != themeAccent.accentColor2) {
                return true;
            }
            int i5 = this.backupMyMessagesAccentColor;
            if (i5 == 0) {
                int i6 = themeAccent.myMessagesAccentColor;
                if (i6 != 0 && i6 != themeAccent.accentColor) {
                    return true;
                }
            } else if (i5 != themeAccent.myMessagesAccentColor) {
                return true;
            }
            int i7 = this.backupMyMessagesGradientAccentColor1;
            if (i7 != 0) {
                if (i7 != themeAccent.myMessagesGradientAccentColor1) {
                    return true;
                }
            } else if (themeAccent.myMessagesGradientAccentColor1 != 0) {
                return true;
            }
            int i8 = this.backupMyMessagesGradientAccentColor2;
            if (i8 != 0) {
                if (i8 != themeAccent.myMessagesGradientAccentColor2) {
                    return true;
                }
            } else if (themeAccent.myMessagesGradientAccentColor2 != 0) {
                return true;
            }
            int i9 = this.backupMyMessagesGradientAccentColor3;
            if (i9 != 0) {
                if (i9 != themeAccent.myMessagesGradientAccentColor3) {
                    return true;
                }
            } else if (themeAccent.myMessagesGradientAccentColor3 != 0) {
                return true;
            }
            if (this.backupMyMessagesAnimated != themeAccent.myMessagesAnimated) {
                return true;
            }
        }
        return false;
    }

    public boolean insideBottomSheet() {
        INavigationLayout iNavigationLayout = this.parentLayout;
        return (iNavigationLayout == null || iNavigationLayout.getBottomSheet() == null) ? false : true;
    }

    public final void invalidateBlur$2() {
        AnonymousClass14 anonymousClass14 = this.dimmingSliderContainer;
        if (anonymousClass14 != null) {
            anonymousClass14.invalidate();
        }
        FrameLayout frameLayout = this.backgroundButtonsContainer;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.backgroundButtonsContainer.getChildAt(i).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.messagesButtonsContainer;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                this.messagesButtonsContainer.getChildAt(i2).invalidate();
            }
        }
        if (this.backgroundCheckBoxView != null) {
            int i3 = 0;
            while (true) {
                WallpaperCheckBoxView[] wallpaperCheckBoxViewArr = this.backgroundCheckBoxView;
                if (i3 >= wallpaperCheckBoxViewArr.length) {
                    break;
                }
                WallpaperCheckBoxView wallpaperCheckBoxView = wallpaperCheckBoxViewArr[i3];
                if (wallpaperCheckBoxView != null) {
                    wallpaperCheckBoxView.setDimAmount(this.shouldShowBrightnessControll ? this.dimAmount * this.progressToDarkTheme : 0.0f);
                    this.backgroundCheckBoxView[i3].invalidate();
                }
                i3++;
            }
        }
        if (this.listView != null) {
            for (int i4 = 0; i4 < this.listView.getChildCount(); i4++) {
                View childAt = this.listView.getChildAt(i4);
                if (childAt instanceof ChatActionCell) {
                    setVisiblePart((ChatActionCell) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.listView2 != null) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt2 = getChildAt(i5);
                if (childAt2 instanceof ChatActionCell) {
                    setVisiblePart((ChatActionCell) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        BlurButton blurButton = this.applyButton1;
        if (blurButton != null) {
            blurButton.invalidate();
        }
        BlurButton blurButton2 = this.applyButton2;
        if (blurButton2 != null) {
            blurButton2.invalidate();
        }
        AnonymousClass13 anonymousClass13 = this.bottomOverlayChat;
        if (anonymousClass13 != null) {
            anonymousClass13.invalidate();
        }
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.screenType != 2) {
            return false;
        }
        if (!this.hasScrollingBackground || motionEvent == null) {
            return true;
        }
        return motionEvent.getY() <= ((float) (ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight));
    }

    public final void lambda$applyWallpaperBackground$20(ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (getParentActivity() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(23, this.currentAccount, getParentActivity(), this, this.themeDelegate);
        limitReachedBottomSheet.canApplyBoost = canApplyBoost;
        limitReachedBottomSheet.updateButton$2();
        limitReachedBottomSheet.updatePremiumButtonText();
        limitReachedBottomSheet.boostsStatus = this.boostsStatus;
        limitReachedBottomSheet.isCurrentChat = true;
        limitReachedBottomSheet.updateRows$7();
        limitReachedBottomSheet.dialogId = this.dialogId;
        limitReachedBottomSheet.updateRows$7();
        if (!insideBottomSheet()) {
            limitReachedBottomSheet.statisticClickRunnable = new ThemePreviewActivity$$ExternalSyntheticLambda0(this, 1);
        }
        showDialog(limitReachedBottomSheet);
    }

    public final void lambda$createView$18$1$2() {
        Theme.ThemeInfo themeInfo = Theme.previousTheme;
        if (themeInfo == null) {
            return;
        }
        int i = themeInfo.prevAccentId;
        Theme.ThemeAccent accent = i >= 0 ? (Theme.ThemeAccent) themeInfo.themeAccentsMap.get(i) : themeInfo.getAccent(false);
        if (this.accent != null) {
            saveAccentWallpaper();
            Theme.saveThemeAccents(this.applyingTheme, true, false, false, false, false);
            if (Theme.previousTheme != null) {
                Theme.hasPreviousTheme = false;
                Theme.isApplyingAccent = false;
                Theme.previousTheme = null;
            }
            Theme.applyTheme(this.applyingTheme, true, this.nightTheme);
            ((ActionBarLayout) this.parentLayout).rebuildAllFragmentViews(false, false);
        } else {
            ((ActionBarLayout) this.parentLayout).rebuildAllFragmentViews(false, false);
            File file = new File(this.applyingTheme.pathToFile);
            Theme.ThemeInfo themeInfo2 = this.applyingTheme;
            Theme.applyThemeFile(file, themeInfo2.name, themeInfo2.info, false);
            MessagesController.getInstance(this.applyingTheme.account).saveTheme(this.applyingTheme, null, false, false);
            SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            editorEdit.putString("lastDayTheme", this.applyingTheme.getKey());
            editorEdit.commit();
        }
        BaseFragment baseFragment = ((ActionBarLayout) getParentLayout()).getFragmentStack().get(Math.max(0, ((ActionBarLayout) getParentLayout()).getFragmentStack().size() - 2));
        finishFragment();
        if (this.screenType == 0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didApplyNewTheme, themeInfo, accent, Boolean.valueOf(this.deleteOnCancel));
        }
        Theme.turnOffAutoNight(baseFragment);
    }

    public final void lambda$didReceivedNotification$30(TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        TLRPC.TL_wallPaper tL_wallPaper2;
        String str;
        String str2;
        boolean z = tLObject instanceof TL_account.TL_wallPapers;
        Theme.ThemeAccent themeAccent = this.accent;
        if (z) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            this.patterns.clear();
            HashMap map = this.patternsDict;
            map.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z2 = false;
            for (int i = 0; i < size; i++) {
                if (tL_wallPapers.wallpapers.get(i) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i);
                    if (tL_wallPaper3.pattern) {
                        TLRPC.Document document = tL_wallPaper3.document;
                        if (document != null && !map.containsKey(Long.valueOf(document.id))) {
                            this.patterns.add(tL_wallPaper3);
                            map.put(Long.valueOf(tL_wallPaper3.document.id), tL_wallPaper3);
                        }
                        if (themeAccent != null && (str2 = themeAccent.patternSlug) != null && str2.equals(tL_wallPaper3.slug)) {
                            this.selectedPattern = tL_wallPaper3;
                            setCurrentImage(false);
                            updateButtonState$1$1();
                        } else if (themeAccent != null || (tL_wallPaper2 = this.selectedPattern) == null || (str = tL_wallPaper2.slug) == null || !str.equals(tL_wallPaper3.slug)) {
                        }
                        z2 = true;
                    }
                }
            }
            if (!z2 && (tL_wallPaper = this.selectedPattern) != null) {
                this.patterns.add(0, tL_wallPaper);
            }
            PatternsAdapter patternsAdapter = this.patternsAdapter;
            if (patternsAdapter != null) {
                patternsAdapter.mObservable.notifyChanged();
            }
            MessagesStorage.getInstance(this.currentAccount).putWallpapers(tL_wallPapers.wallpapers, 1);
        }
        if (this.selectedPattern != null || themeAccent == null || TextUtils.isEmpty(themeAccent.patternSlug)) {
            return;
        }
        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = themeAccent.patternSlug;
        getwallpaper.wallpaper = tL_inputWallPaperSlug;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(getConnectionsManager().sendRequest(getwallpaper, new ThemePreviewActivity$$ExternalSyntheticLambda3(this, 1)), this.classGuid);
    }

    public final void lambda$getThemeDescriptionsInternal$33() {
        AnonymousClass9 anonymousClass9 = this.dropDownContainer;
        int i = 0;
        if (anonymousClass9 != null) {
            anonymousClass9.redrawPopup(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
            this.dropDownContainer.setPopupItemsColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItem), false);
        }
        Drawable drawable = this.sheetDrawable;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_windowBackgroundWhite), PorterDuff.Mode.MULTIPLY));
        }
        AnonymousClass13 anonymousClass13 = this.bottomOverlayChat;
        if (anonymousClass13 != null) {
            anonymousClass13.invalidate();
        }
        if (this.onSwitchDayNightDelegate != null) {
            INavigationLayout iNavigationLayout = this.parentLayout;
            if (iNavigationLayout == null || iNavigationLayout.getBottomSheet() == null) {
                setNavigationBarColor(getThemedColor(Theme.key_dialogBackground));
            } else {
                this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(Theme.key_dialogBackground));
                if (this.screenType == 2 && this.dialogId != 0) {
                    this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            }
        }
        if (this.backgroundCheckBoxView != null) {
            int i2 = 0;
            while (true) {
                WallpaperCheckBoxView[] wallpaperCheckBoxViewArr = this.backgroundCheckBoxView;
                if (i2 >= wallpaperCheckBoxViewArr.length) {
                    break;
                }
                WallpaperCheckBoxView wallpaperCheckBoxView = wallpaperCheckBoxViewArr[i2];
                if (wallpaperCheckBoxView != null) {
                    wallpaperCheckBoxView.invalidate();
                }
                i2++;
            }
        }
        if (this.messagesCheckBoxView != null) {
            while (true) {
                WallpaperCheckBoxView[] wallpaperCheckBoxViewArr2 = this.messagesCheckBoxView;
                if (i >= wallpaperCheckBoxViewArr2.length) {
                    break;
                }
                WallpaperCheckBoxView wallpaperCheckBoxView2 = wallpaperCheckBoxViewArr2[i];
                if (wallpaperCheckBoxView2 != null) {
                    wallpaperCheckBoxView2.invalidate();
                }
                i++;
            }
        }
        TextView textView = this.patternTitleView;
        if (textView != null) {
            textView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
        }
        ColorPicker colorPicker = this.colorPicker;
        if (colorPicker != null) {
            colorPicker.invalidate();
        }
        FragmentFloatingButton fragmentFloatingButton = this.floatingButton;
        if (fragmentFloatingButton != null) {
            fragmentFloatingButton.updateColors$1();
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (!checkDiscard$7(z)) {
            return false;
        }
        cancelThemeApply(true);
        return super.onBackPressed(z);
    }

    @Override
    public final void onBottomSheetCreated() {
        super.onBottomSheetCreated();
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout == null || iNavigationLayout.getBottomSheet() == null) {
            return;
        }
        this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(Theme.key_dialogBackground));
        if (this.screenType != 2 || this.dialogId == 0) {
            return;
        }
        this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
    }

    @Override
    public final void onFailedDownload(String str, boolean z) {
        updateButtonState$1$1();
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.invalidateMotionBackground);
        getNotificationCenter().addObserver(this, NotificationCenter.wallpaperSettedToUser);
        int i = this.screenType;
        if (i == 1 || i == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i == 2 || i == 1) {
            Theme.changingWallpaper = true;
        }
        if (i == 0 && this.accent == null) {
            this.isMotion = Theme.isWallpaperMotion;
        } else {
            Point point = AndroidUtilities.displaySize;
            int iMin = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            int iMax = Math.max(point2.x, point2.y);
            StringBuilder sb = new StringBuilder();
            sb.append((int) (iMin / AndroidUtilities.density));
            sb.append("_");
            this.imageFilter = SurfaceContainer$$ExternalSyntheticOutline0.m((int) (iMax / AndroidUtilities.density), "_f", sb);
            Point point3 = AndroidUtilities.displaySize;
            this.maxWallpaperSize = Math.max(point3.x, point3.y);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            this.TAG = DownloadController.getInstance(this.currentAccount).generateObserverTag();
            if (this.patterns == null) {
                this.patterns = new ArrayList();
                MessagesStorage.getInstance(this.currentAccount).getWallpapers();
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.invalidateMotionBackground);
        getNotificationCenter().removeObserver(this, NotificationCenter.wallpaperSettedToUser);
        TextureViewContainer textureViewContainer = this.frameLayout;
        if (textureViewContainer != null && this.onGlobalLayoutListener != null) {
            textureViewContainer.getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        }
        int i = this.screenType;
        if ((i == 2 || i == 1) && this.onSwitchDayNightDelegate == null) {
            AndroidUtilities.runOnUIThread(new VoIPFragment$$ExternalSyntheticLambda31(9));
        }
        if (i == 2) {
            Bitmap bitmap = this.blurredBitmap;
            if (bitmap != null) {
                bitmap.recycle();
                this.blurredBitmap = null;
            }
            this.themeDelegate.applyChatServiceMessageColor(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        } else if (i == 1 || i == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i != 0 || this.accent != null) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
        }
        super.onFragmentDestroy();
        checkBlur(null);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.isMotion) {
            this.parallaxEffect.setEnabled(false);
        }
        Theme.disallowChangeServiceMessageColor = false;
    }

    @Override
    public final void onProgressDownload(String str, long j, long j2) {
    }

    @Override
    public final void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    @Override
    public final void onResume() {
        super.onResume();
        DialogsAdapter dialogsAdapter = this.dialogsAdapter;
        if (dialogsAdapter != null) {
            dialogsAdapter.mObservable.notifyChanged();
        }
        MessagesAdapter messagesAdapter = this.messagesAdapter;
        if (messagesAdapter != null) {
            messagesAdapter.mObservable.notifyChanged();
        }
        if (this.isMotion) {
            this.parallaxEffect.setEnabled(true);
        }
        Theme.disallowChangeServiceMessageColor = true;
    }

    @Override
    public final void onSuccessDownload(String str) {
        updateButtonState$1$1();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        if (z || this.screenType != 2) {
            return;
        }
        this.themeDelegate.applyChatServiceMessageColor(null, null, null);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
    }

    public final void saveAccentWallpaper() {
        Theme.ThemeAccent themeAccent = this.accent;
        if (themeAccent == null || TextUtils.isEmpty(themeAccent.patternSlug)) {
            return;
        }
        try {
            File pathToWallpaper = themeAccent.getPathToWallpaper();
            Drawable background = this.backgroundImage.getBackground();
            Bitmap bitmap = this.backgroundImage.getImageReceiver().getBitmap();
            if (background instanceof MotionBackgroundDrawable) {
                FileOutputStream fileOutputStream = new FileOutputStream(pathToWallpaper);
                bitmap.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                fileOutputStream.close();
                return;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            background.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
            background.draw(canvas);
            Paint paint = new Paint(2);
            paint.setColorFilter(new PorterDuffColorFilter(this.patternColor, this.blendMode));
            paint.setAlpha((int) (this.currentIntensity * 255.0f));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            FileOutputStream fileOutputStream2 = new FileOutputStream(pathToWallpaper);
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
            fileOutputStream2.close();
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public final void selectColorType() {
        selectColorType(2, true);
    }

    public final void selectPattern(int i) {
        int i2 = 0;
        TLRPC.TL_wallPaper tL_wallPaper = (i < 0 || i >= this.patterns.size()) ? this.lastSelectedPattern : (TLRPC.TL_wallPaper) this.patterns.get(i);
        if (tL_wallPaper == null) {
            return;
        }
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.valueAnimator.cancel();
        }
        BackgroundView[] backgroundViewArr = this.backgroundImages;
        BackgroundView backgroundView = backgroundViewArr[0];
        BackgroundView backgroundView2 = backgroundViewArr[1];
        backgroundViewArr[0] = backgroundView2;
        backgroundViewArr[1] = backgroundView;
        this.page2.removeView(backgroundView2);
        this.page2.addView(backgroundViewArr[0], this.page2.indexOfChild(backgroundViewArr[1]) + 1);
        BackgroundView backgroundView3 = backgroundViewArr[0];
        this.backgroundImage = backgroundView3;
        backgroundView3.setBackground(backgroundViewArr[1].getBackground());
        updateIntensity();
        backgroundViewArr[1].setVisibility(0);
        backgroundViewArr[1].setAlpha(1.0f);
        this.backgroundImage.setVisibility(0);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.valueAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ChatActivity.AnonymousClass133(this, 16));
        this.valueAnimator.addListener(new AnonymousClass32(this, i2));
        this.valueAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.valueAnimator.setDuration(300L);
        this.valueAnimator.start();
        this.backgroundImage.getImageReceiver().setCrossfadeDuration(300);
        this.backgroundImage.getImageReceiver().setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.imageFilter, null, null, null, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
        this.backgroundImage.onNewImageSet();
        this.selectedPattern = tL_wallPaper;
        this.isMotion = this.backgroundCheckBoxView[2].isChecked;
        updateButtonState$1$1();
    }

    public final void setBackgroundColor(int i, int i2, boolean z) {
        MotionBackgroundDrawable motionBackgroundDrawable;
        if (i2 == 0) {
            this.backgroundColor = i;
        } else if (i2 == 1) {
            this.backgroundGradientColor1 = i;
        } else if (i2 == 2) {
            this.backgroundGradientColor2 = i;
        } else if (i2 == 3) {
            this.backgroundGradientColor3 = i;
        }
        updatePlayAnimationView(z);
        if (this.backgroundCheckBoxView != null) {
            int i3 = 0;
            while (true) {
                WallpaperCheckBoxView[] wallpaperCheckBoxViewArr = this.backgroundCheckBoxView;
                if (i3 >= wallpaperCheckBoxViewArr.length) {
                    break;
                }
                WallpaperCheckBoxView wallpaperCheckBoxView = wallpaperCheckBoxViewArr[i3];
                if (wallpaperCheckBoxView != null) {
                    wallpaperCheckBoxView.setColor(i2, i);
                }
                i3++;
            }
        }
        if (this.backgroundGradientColor2 != 0) {
            if (this.intensitySeekBar != null && Theme.currentTheme.isDark()) {
                this.intensitySeekBar.setTwoSided(true);
            }
            Drawable background = this.backgroundImage.getBackground();
            if (background instanceof MotionBackgroundDrawable) {
                motionBackgroundDrawable = (MotionBackgroundDrawable) background;
            } else {
                motionBackgroundDrawable = new MotionBackgroundDrawable();
                motionBackgroundDrawable.setParentView(this.backgroundImage);
                if (this.rotatePreview && motionBackgroundDrawable.posAnimationProgress >= 1.0f) {
                    motionBackgroundDrawable.rotatingPreview = true;
                    motionBackgroundDrawable.posAnimationProgress = 0.0f;
                    motionBackgroundDrawable.rotationBack = false;
                    motionBackgroundDrawable.invalidateParent();
                }
            }
            MotionBackgroundDrawable motionBackgroundDrawable2 = motionBackgroundDrawable;
            motionBackgroundDrawable2.setColors(this.backgroundColor, this.backgroundGradientColor1, this.backgroundGradientColor2, this.backgroundGradientColor3, 0, true);
            this.backgroundImage.setBackground(motionBackgroundDrawable2);
            this.patternColor = motionBackgroundDrawable2.getPatternColor();
            this.checkColor = 754974720;
        } else if (this.backgroundGradientColor1 != 0) {
            this.backgroundImage.setBackground(new GradientDrawable(BackgroundGradientDrawable.getGradientOrientation(this.backgroundRotation), new int[]{this.backgroundColor, this.backgroundGradientColor1}));
            int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(this.backgroundColor, this.backgroundGradientColor1));
            this.checkColor = patternColor;
            this.patternColor = patternColor;
        } else {
            this.backgroundImage.setBackgroundColor(this.backgroundColor);
            int patternColor2 = AndroidUtilities.getPatternColor(this.backgroundColor);
            this.checkColor = patternColor2;
            this.patternColor = patternColor2;
        }
        int i4 = Theme.key_chat_serviceBackground;
        boolean zHasThemeKey = Theme.hasThemeKey(i4);
        AnonymousClass1 anonymousClass1 = this.themeDelegate;
        if (!zHasThemeKey || (this.backgroundImage.getBackground() instanceof MotionBackgroundDrawable)) {
            anonymousClass1.applyChatServiceMessageColor(this.backgroundImage.getBackground(), this.backgroundImage.getBackground(), Float.valueOf(this.currentIntensity));
        } else {
            Drawable drawable = Theme.themedWallpaper;
            if (drawable == null) {
                drawable = Theme.wallpaper;
            }
            if (drawable instanceof MotionBackgroundDrawable) {
                getThemedColor(i4);
                anonymousClass1.applyChatServiceMessageColor(this.backgroundImage.getBackground(), this.backgroundImage.getBackground(), Float.valueOf(this.currentIntensity));
            }
        }
        ImageView imageView = this.backgroundPlayAnimationImageView;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_serviceText), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.messagesPlayAnimationImageView;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_serviceText), PorterDuff.Mode.MULTIPLY));
        }
        BackgroundView backgroundView = this.backgroundImage;
        if (backgroundView != null) {
            backgroundView.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.patternColor, this.blendMode));
            this.backgroundImage.getImageReceiver().setAlpha(Math.abs(this.currentIntensity));
            this.backgroundImage.invalidate();
            if (Theme.currentTheme.isDark() && (this.backgroundImage.getBackground() instanceof MotionBackgroundDrawable)) {
                MaxFileSizeCell.AnonymousClass1 anonymousClass2 = this.intensitySeekBar;
                if (anonymousClass2 != null) {
                    anonymousClass2.setTwoSided(true);
                }
                if (this.currentIntensity < 0.0f) {
                    this.backgroundImage.getImageReceiver().setGradientBitmap(((MotionBackgroundDrawable) this.backgroundImage.getBackground()).currentBitmap);
                }
            } else {
                this.backgroundImage.getImageReceiver().setGradientBitmap(null);
                MaxFileSizeCell.AnonymousClass1 anonymousClass3 = this.intensitySeekBar;
                if (anonymousClass3 != null) {
                    anonymousClass3.setTwoSided(false);
                }
            }
            MaxFileSizeCell.AnonymousClass1 anonymousClass4 = this.intensitySeekBar;
            if (anonymousClass4 != null) {
                anonymousClass4.setProgress(this.currentIntensity);
            }
        }
        AnonymousClass10 anonymousClass10 = this.listView2;
        if (anonymousClass10 != null) {
            anonymousClass10.invalidateViews();
        }
        FrameLayout frameLayout = this.backgroundButtonsContainer;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                this.backgroundButtonsContainer.getChildAt(i5).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.messagesButtonsContainer;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i6 = 0; i6 < childCount2; i6++) {
                this.messagesButtonsContainer.getChildAt(i6).invalidate();
            }
        }
    }

    public final void setCurrentImage(boolean z) {
        int i;
        int i2;
        int i3;
        float f;
        Drawable colorDrawable;
        MotionBackgroundDrawable motionBackgroundDrawable;
        MotionBackgroundDrawable motionBackgroundDrawable2;
        Theme.ThemeAccent themeAccent = this.accent;
        int i4 = this.screenType;
        if (i4 == 0 && themeAccent == null) {
            this.backgroundImage.setBackground(Theme.getCachedWallpaper());
        } else {
            if (i4 == 2) {
                Object obj = this.currentWallpaper;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = z ? FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, 100) : null;
                    BitmapDrawable bitmapDrawable = closestPhotoSizeWithSize instanceof TLRPC.TL_photoStrippedSize ? new BitmapDrawable(ImageLoader.getStrippedPhotoBitmap(closestPhotoSizeWithSize.bytes, "b")) : null;
                    BackgroundView backgroundView = this.backgroundImage;
                    backgroundView.imageReceiver.setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.imageFilter, ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    backgroundView.onNewImageSet();
                } else if (obj instanceof WallpapersListActivity.ColorWallpaper) {
                    WallpapersListActivity.ColorWallpaper colorWallpaper = (WallpapersListActivity.ColorWallpaper) obj;
                    this.backgroundRotation = colorWallpaper.gradientRotation;
                    int i5 = colorWallpaper.color;
                    setBackgroundColor(i5, 0, false);
                    int i6 = colorWallpaper.gradientColor1;
                    if (i6 != 0) {
                        setBackgroundColor(i6, 1, false);
                    }
                    int i7 = colorWallpaper.gradientColor2;
                    setBackgroundColor(i7, 2, false);
                    int i8 = colorWallpaper.gradientColor3;
                    setBackgroundColor(i8, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.selectedPattern;
                    if (tL_wallPaper2 != null) {
                        BackgroundView backgroundView2 = this.backgroundImage;
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                        String str = this.imageFilter;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.selectedPattern;
                        backgroundView2.imageReceiver.setImage(forDocument, str, null, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                        backgroundView2.onNewImageSet();
                    } else if ("d".equals(colorWallpaper.slug)) {
                        Point point = AndroidUtilities.displaySize;
                        int iMin = Math.min(point.x, point.y);
                        Point point2 = AndroidUtilities.displaySize;
                        this.backgroundImage.setImageBitmap(SvgHelper.getBitmap(R.raw.default_pattern, iMin, Math.max(point2.x, point2.y), Build.VERSION.SDK_INT >= 29 ? 1459617792 : MotionBackgroundDrawable.getPatternColor(i5, i6, i7, i8)));
                    }
                } else if (obj instanceof WallpapersListActivity.FileWallpaper) {
                    Bitmap bitmap = this.currentWallpaperBitmap;
                    if (bitmap != null) {
                        this.backgroundImage.setImageBitmap(bitmap);
                    } else {
                        WallpapersListActivity.FileWallpaper fileWallpaper = (WallpapersListActivity.FileWallpaper) obj;
                        File file = fileWallpaper.originalPath;
                        if (file != null) {
                            this.backgroundImage.setImage(file.getAbsolutePath(), this.imageFilter, null);
                        } else {
                            File file2 = fileWallpaper.path;
                            if (file2 != null) {
                                this.backgroundImage.setImage(file2.getAbsolutePath(), this.imageFilter, null);
                            } else if ("t".equals(fileWallpaper.slug)) {
                                BackgroundView backgroundView3 = this.backgroundImage;
                                backgroundView3.setImageDrawable(Theme.getThemedWallpaper(backgroundView3, false));
                            } else {
                                int i9 = fileWallpaper.resId;
                                if (i9 != 0) {
                                    this.backgroundImage.setImageResource(i9);
                                }
                            }
                        }
                    }
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    TLRPC.Photo photo = searchImage.photo;
                    if (photo != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, this.maxWallpaperSize, true);
                        TLRPC.PhotoSize photoSize = closestPhotoSizeWithSize3 != closestPhotoSizeWithSize2 ? closestPhotoSizeWithSize3 : null;
                        int i10 = photoSize != null ? photoSize.size : 0;
                        BackgroundView backgroundView4 = this.backgroundImage;
                        backgroundView4.imageReceiver.setImage(ImageLocation.getForPhoto(photoSize, searchImage.photo), this.imageFilter, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, searchImage.photo), "100_100_b", null, i10, "jpg", searchImage, 1);
                        backgroundView4.onNewImageSet();
                    } else {
                        BackgroundView backgroundView5 = this.backgroundImage;
                        String str2 = searchImage.imageUrl;
                        String str3 = this.imageFilter;
                        String str4 = searchImage.thumbUrl;
                        backgroundView5.getClass();
                        backgroundView5.setImage(ImageLocation.getForPath(str2), str3, ImageLocation.getForPath(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (themeAccent == null) {
                this.backgroundImage.setBackground(Theme.getCachedWallpaper());
            } else {
                BackgroundGradientDrawable$$ExternalSyntheticLambda1 backgroundGradientDrawable$$ExternalSyntheticLambda1 = this.backgroundGradientDisposable;
                if (backgroundGradientDrawable$$ExternalSyntheticLambda1 != null) {
                    backgroundGradientDrawable$$ExternalSyntheticLambda1.dispose();
                    this.backgroundGradientDisposable = null;
                }
                int defaultAccentColor = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper);
                int i11 = (int) themeAccent.backgroundOverrideColor;
                int i12 = i11 != 0 ? i11 : defaultAccentColor;
                int defaultAccentColor2 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to1);
                long j = themeAccent.backgroundGradientOverrideColor1;
                int i13 = (int) j;
                if (i13 == 0 && j != 0) {
                    defaultAccentColor2 = 0;
                } else if (i13 != 0) {
                    defaultAccentColor2 = i13;
                }
                int defaultAccentColor3 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to2);
                long j2 = themeAccent.backgroundGradientOverrideColor2;
                int i14 = (int) j2;
                if (i14 == 0 && j2 != 0) {
                    defaultAccentColor3 = 0;
                } else if (i14 != 0) {
                    defaultAccentColor3 = i14;
                }
                int defaultAccentColor4 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to3);
                long j3 = themeAccent.backgroundGradientOverrideColor3;
                int i15 = (int) j3;
                if (i15 != 0 || j3 == 0) {
                    i = i15 != 0 ? i15 : defaultAccentColor4;
                } else {
                    i = 0;
                }
                if (TextUtils.isEmpty(themeAccent.patternSlug) || Theme.hasCustomWallpaper()) {
                    i2 = defaultAccentColor2;
                    i3 = defaultAccentColor3;
                    f = 0.0f;
                    Drawable drawable = Theme.themedWallpaper;
                    if (drawable == null) {
                        drawable = Theme.wallpaper;
                    }
                    if (drawable != null) {
                        if (drawable instanceof MotionBackgroundDrawable) {
                            ((MotionBackgroundDrawable) drawable).setParentView(this.backgroundImage);
                        }
                        this.backgroundImage.setBackground(drawable);
                    }
                } else {
                    if (defaultAccentColor3 != 0) {
                        Drawable background = this.backgroundImage.getBackground();
                        if (background instanceof MotionBackgroundDrawable) {
                            motionBackgroundDrawable2 = (MotionBackgroundDrawable) background;
                        } else {
                            motionBackgroundDrawable = new MotionBackgroundDrawable();
                            motionBackgroundDrawable.setParentView(this.backgroundImage);
                            if (this.rotatePreview && motionBackgroundDrawable.posAnimationProgress >= 1.0f) {
                                motionBackgroundDrawable2 = motionBackgroundDrawable;
                                motionBackgroundDrawable2 = motionBackgroundDrawable;
                                motionBackgroundDrawable.rotatingPreview = true;
                                motionBackgroundDrawable.posAnimationProgress = 0.0f;
                                motionBackgroundDrawable.rotationBack = false;
                                motionBackgroundDrawable.invalidateParent();
                                motionBackgroundDrawable2 = motionBackgroundDrawable;
                            }
                        }
                        motionBackgroundDrawable2 = motionBackgroundDrawable;
                        motionBackgroundDrawable2 = motionBackgroundDrawable;
                        motionBackgroundDrawable2 = motionBackgroundDrawable;
                        i2 = defaultAccentColor2;
                        i3 = defaultAccentColor3;
                        motionBackgroundDrawable2.setColors(i12, i2, i3, i, 0, true);
                        colorDrawable = motionBackgroundDrawable2;
                    } else {
                        i2 = defaultAccentColor2;
                        i3 = defaultAccentColor3;
                        if (i2 != 0) {
                            BackgroundGradientDrawable backgroundGradientDrawable = new BackgroundGradientDrawable(BackgroundGradientDrawable.getGradientOrientation(themeAccent.backgroundRotation), new int[]{i12, i2});
                            this.backgroundGradientDisposable = backgroundGradientDrawable.startDithering(Stripe.ofDeviceScreen(0.5f, 3), new VoIPFragment.AnonymousClass3(this, 1), 100L);
                            colorDrawable = backgroundGradientDrawable;
                        } else {
                            colorDrawable = new ColorDrawable(i12);
                        }
                    }
                    this.backgroundImage.setBackground(colorDrawable);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.selectedPattern;
                    if (tL_wallPaper4 != null) {
                        BackgroundView backgroundView6 = this.backgroundImage;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(tL_wallPaper4.document);
                        String str5 = this.imageFilter;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.selectedPattern;
                        f = 0.0f;
                        backgroundView6.imageReceiver.setImage(forDocument2, str5, null, null, null, tL_wallPaper5.document.size, "jpg", tL_wallPaper5, 1);
                        backgroundView6.onNewImageSet();
                    } else {
                        f = 0.0f;
                    }
                }
                if (i2 == 0) {
                    int patternColor = AndroidUtilities.getPatternColor(i12);
                    this.checkColor = patternColor;
                    this.patternColor = patternColor;
                } else if (i3 != 0) {
                    this.patternColor = MotionBackgroundDrawable.getPatternColor(i12, i2, i3, i);
                    this.checkColor = 754974720;
                } else {
                    int patternColor2 = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(i12, i2));
                    this.checkColor = patternColor2;
                    this.patternColor = patternColor2;
                }
                BackgroundView backgroundView7 = this.backgroundImage;
                if (backgroundView7 != null) {
                    backgroundView7.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.patternColor, this.blendMode));
                    this.backgroundImage.getImageReceiver().setAlpha(Math.abs(this.currentIntensity));
                    this.backgroundImage.invalidate();
                    if (Theme.currentTheme.isDark() && (this.backgroundImage.getBackground() instanceof MotionBackgroundDrawable)) {
                        MaxFileSizeCell.AnonymousClass1 anonymousClass1 = this.intensitySeekBar;
                        if (anonymousClass1 != null) {
                            anonymousClass1.setTwoSided(true);
                        }
                        if (this.currentIntensity < f) {
                            this.backgroundImage.getImageReceiver().setGradientBitmap(((MotionBackgroundDrawable) this.backgroundImage.getBackground()).currentBitmap);
                        }
                    } else {
                        this.backgroundImage.getImageReceiver().setGradientBitmap(null);
                        MaxFileSizeCell.AnonymousClass1 anonymousClass2 = this.intensitySeekBar;
                        if (anonymousClass2 != null) {
                            anonymousClass2.setTwoSided(false);
                        }
                    }
                    MaxFileSizeCell.AnonymousClass1 anonymousClass3 = this.intensitySeekBar;
                    if (anonymousClass3 != null) {
                        anonymousClass3.setProgress(this.currentIntensity);
                    }
                }
                if (this.backgroundCheckBoxView != null) {
                    int i16 = 0;
                    while (true) {
                        WallpaperCheckBoxView[] wallpaperCheckBoxViewArr = this.backgroundCheckBoxView;
                        if (i16 >= wallpaperCheckBoxViewArr.length) {
                            break;
                        }
                        wallpaperCheckBoxViewArr[i16].setColor(0, i12);
                        this.backgroundCheckBoxView[i16].setColor(1, i2);
                        this.backgroundCheckBoxView[i16].setColor(2, i3);
                        this.backgroundCheckBoxView[i16].setColor(3, i);
                        i16++;
                    }
                }
                ImageView imageView = this.backgroundPlayAnimationImageView;
                if (imageView != null) {
                    imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_serviceText), PorterDuff.Mode.MULTIPLY));
                }
                ImageView imageView2 = this.messagesPlayAnimationImageView;
                if (imageView2 != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_serviceText), PorterDuff.Mode.MULTIPLY));
                }
                invalidateBlur$2();
            }
        }
        this.rotatePreview = false;
    }

    public final void setDialogId(long j) {
        this.dialogId = j;
        this.self = j == 0 || j == getUserConfig().getClientUserId();
    }

    @Override
    public final void setResourceProvider(Theme.ResourcesProvider resourcesProvider) {
        this.themeDelegate.parentProvider = resourcesProvider;
    }

    public final void setVisiblePart(ChatActionCell chatActionCell) {
        float measuredWidth;
        if (this.backgroundImage == null) {
            return;
        }
        AnonymousClass1 anonymousClass1 = this.themeDelegate;
        Bitmap bitmap = anonymousClass1.serviceBitmap;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            measuredWidth = ((this.backgroundImage.getMeasuredWidth() - (Math.max(this.backgroundImage.getMeasuredWidth() / width, this.backgroundImage.getMeasuredHeight() / anonymousClass1.serviceBitmap.getHeight()) * width)) / 2.0f) + this.currentScrollOffset + 0.0f;
        } else {
            measuredWidth = this.currentScrollOffset + 0.0f;
        }
        float y = chatActionCell.getY() - ((-this.backgroundImage.ty) + 0.0f);
        int measuredHeight = this.backgroundImage.getMeasuredHeight();
        float f = this.shouldShowBrightnessControll ? this.dimAmount * this.progressToDarkTheme : 0.0f;
        chatActionCell.visiblePartSet = true;
        chatActionCell.backgroundHeight = measuredHeight;
        chatActionCell.viewTop = y;
        chatActionCell.viewTranslationX = measuredWidth;
        chatActionCell.dimAmount = f;
        chatActionCell.dimPaint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (f * 255.0f)));
        chatActionCell.invalidate();
    }

    public final void showAnimationHint() {
        if (this.page2 == null || this.messagesCheckBoxView == null || this.accent.myMessagesGradientAccentColor2 == 0) {
            return;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("bganimationhint", false)) {
            return;
        }
        if (this.animationHint == null) {
            HintView hintView = new HintView(8, getParentActivity(), null, false);
            this.animationHint = hintView;
            hintView.setShowingDuration(5000L);
            this.animationHint.setAlpha(0.0f);
            this.animationHint.setVisibility(4);
            this.animationHint.setText(LocaleController.getString(R.string.BackgroundAnimateInfo));
            this.animationHint.setExtraTranslationY(AndroidUtilities.dp(6.0f));
            this.frameLayout.addView(this.animationHint, LayoutHelper.createFrame(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda9(10, this, globalMainSettings), 500L);
    }

    public final void showPatternsView(final int i, final boolean z) {
        int iIndexOf;
        int i2;
        final boolean z2 = z && i == 1 && this.selectedPattern != null;
        int i3 = this.screenType;
        if (z) {
            if (i != 0) {
                this.previousSelectedPattern = this.selectedPattern;
                this.previousIntensity = this.currentIntensity;
                this.patternsAdapter.mObservable.notifyChanged();
                ArrayList arrayList = this.patterns;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.selectedPattern;
                    if (tL_wallPaper == null) {
                        iIndexOf = 0;
                    } else {
                        iIndexOf = arrayList.indexOf(tL_wallPaper) + (i3 == 2 ? 1 : 0);
                    }
                    LinearLayoutManager linearLayoutManager = this.patternsLayoutManager;
                    linearLayoutManager.scrollToPositionWithOffset(iIndexOf, OKLCH.m$2(124.0f, this.patternsListView.getMeasuredWidth(), 2), linearLayoutManager.mShouldReverseLayout);
                }
            } else if (i3 == 2) {
                this.previousBackgroundColor = this.backgroundColor;
                int i4 = this.backgroundGradientColor1;
                this.previousBackgroundGradientColor1 = i4;
                int i5 = this.backgroundGradientColor2;
                this.previousBackgroundGradientColor2 = i5;
                int i6 = this.backgroundGradientColor3;
                this.previousBackgroundGradientColor3 = i6;
                this.previousBackgroundRotation = this.backupBackgroundRotation;
                if (i6 != 0) {
                    i2 = 4;
                } else if (i5 != 0) {
                    i2 = 3;
                } else {
                    i2 = i4 != 0 ? 2 : 1;
                }
                this.colorPicker.setType(0, 4, i2, false);
                this.colorPicker.setColor(this.backgroundGradientColor3, 3);
                this.colorPicker.setColor(this.backgroundGradientColor2, 2);
                this.colorPicker.setColor(this.backgroundGradientColor1, 1);
                this.colorPicker.setColor(this.backgroundColor, 0);
            }
        }
        if (i3 == 1 || i3 == 2) {
            this.backgroundCheckBoxView[z2 ? (char) 2 : (char) 0].setVisibility(0);
        }
        if (i == 1) {
            MaxFileSizeCell.AnonymousClass1 anonymousClass1 = this.intensitySeekBar;
            if (!anonymousClass1.twoSided) {
                float f = this.currentIntensity;
                if (f < 0.0f) {
                    float f2 = -f;
                    this.currentIntensity = f2;
                    anonymousClass1.setProgress(f2);
                }
            }
        }
        this.patternViewAnimation = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        int i7 = i == 0 ? 1 : 0;
        FrameLayout[] frameLayoutArr = this.patternLayout;
        if (z) {
            frameLayoutArr[i].setVisibility(0);
            if (i3 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(this.listView2, (Property<AnonymousClass10, Float>) View.TRANSLATION_Y, i == 1 ? -AndroidUtilities.dp(21.0f) : 0.0f));
                WallpaperCheckBoxView wallpaperCheckBoxView = this.backgroundCheckBoxView[2];
                Property property = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(wallpaperCheckBoxView, (Property<WallpaperCheckBoxView, Float>) property, z2 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.backgroundCheckBoxView[0], (Property<WallpaperCheckBoxView, Float>) property, z2 ? 0.0f : 1.0f));
                if (i == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i], (Property<FrameLayout, Float>) property, 0.0f, 1.0f));
                } else {
                    frameLayoutArr[i].setAlpha(1.0f);
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i7], (Property<FrameLayout, Float>) property, 0.0f));
                }
                AndroidUtilities.hideKeyboard(this.colorPicker.colorEditText[1]);
            } else if (i3 == 2) {
                AnonymousClass10 anonymousClass10 = this.listView2;
                Property property2 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(anonymousClass10, (Property<AnonymousClass10, Float>) property2, AndroidUtilities.dp((this.applyButton2 != null ? 58 : 0) + 72) + (-frameLayoutArr[i].getMeasuredHeight()) + (insideBottomSheet() ? AndroidUtilities.navigationBarHeight : 0)));
                WallpaperCheckBoxView wallpaperCheckBoxView2 = this.backgroundCheckBoxView[2];
                Property property3 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(wallpaperCheckBoxView2, (Property<WallpaperCheckBoxView, Float>) property3, z2 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.backgroundCheckBoxView[0], (Property<WallpaperCheckBoxView, Float>) property3, z2 ? 0.0f : 1.0f));
                if (frameLayoutArr[i7].getVisibility() == 0) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i7], (Property<FrameLayout, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i], (Property<FrameLayout, Float>) property3, 0.0f, 1.0f));
                    frameLayoutArr[i].setTranslationY(0.0f);
                } else {
                    FrameLayout frameLayout = frameLayoutArr[i];
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property2, frameLayout.getMeasuredHeight(), 0.0f));
                }
            } else {
                if (i == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i], (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                } else {
                    frameLayoutArr[i].setAlpha(1.0f);
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i7], (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                }
                AndroidUtilities.hideKeyboard(this.colorPicker.colorEditText[1]);
            }
        } else {
            AnonymousClass10 anonymousClass11 = this.listView2;
            Property property4 = View.TRANSLATION_Y;
            arrayList2.add(ObjectAnimator.ofFloat(anonymousClass11, (Property<AnonymousClass10, Float>) property4, 0.0f));
            FrameLayout frameLayout2 = frameLayoutArr[i];
            arrayList2.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property4, frameLayout2.getMeasuredHeight()));
            WallpaperCheckBoxView wallpaperCheckBoxView3 = this.backgroundCheckBoxView[0];
            Property property5 = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(wallpaperCheckBoxView3, (Property<WallpaperCheckBoxView, Float>) property5, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.backgroundCheckBoxView[2], (Property<WallpaperCheckBoxView, Float>) property5, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.backgroundImage, (Property<BackgroundView, Float>) property5, 1.0f));
        }
        this.patternViewAnimation.playTogether(arrayList2);
        final int i8 = i7;
        this.patternViewAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public final void onAnimationEnd(Animator animator) {
                ThemePreviewActivity themePreviewActivity = ThemePreviewActivity.this;
                themePreviewActivity.patternViewAnimation = null;
                FrameLayout[] frameLayoutArr2 = themePreviewActivity.patternLayout;
                int i9 = i;
                int i10 = i8;
                boolean z3 = z;
                if (z3 && frameLayoutArr2[i10].getVisibility() == 0) {
                    frameLayoutArr2[i10].setAlpha(1.0f);
                    frameLayoutArr2[i10].setVisibility(4);
                } else if (!z3) {
                    frameLayoutArr2[i9].setVisibility(4);
                }
                int i11 = themePreviewActivity.screenType;
                if (i11 == 1 || i11 == 2) {
                    themePreviewActivity.backgroundCheckBoxView[z2 ? (char) 0 : (char) 2].setVisibility(4);
                } else if (i9 == 1) {
                    frameLayoutArr2[i10].setAlpha(0.0f);
                }
            }
        });
        this.patternViewAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        this.patternViewAnimation.setDuration(200L);
        this.patternViewAnimation.start();
    }

    public final void toggleTheme() {
        int i = 2;
        if (this.changeDayNightView != null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) (insideBottomSheet() ? this.parentLayout.getBottomSheet().getWindow() : getParentActivity().getWindow()).getDecorView();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        this.dayNightItem.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.dayNightItem.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        this.dayNightItem.getLocationInWindow(iArr);
        float f = iArr[0];
        float f2 = iArr[1];
        float measuredWidth = (this.dayNightItem.getMeasuredWidth() / 2.0f) + f;
        float measuredHeight = (this.dayNightItem.getMeasuredHeight() / 2.0f) + f2;
        float fMax = Math.max(bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
        PeerColorActivity.AnonymousClass7 anonymousClass7 = new PeerColorActivity.AnonymousClass7(this, getParentActivity(), canvas, measuredWidth, measuredHeight, fMax, paint, bitmapCreateBitmap, paint2, f, f2, 2);
        this.changeDayNightView = anonymousClass7;
        anonymousClass7.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
        this.changeDayNightViewProgress = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.changeDayNightViewAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new PeerColorActivity.AnonymousClass8(this, 3));
        this.changeDayNightViewAnimator.addListener(new AnonymousClass32(this, 4));
        this.changeDayNightViewAnimator.setDuration(400L);
        this.changeDayNightViewAnimator.setInterpolator(Easings.easeInOutQuad);
        this.changeDayNightViewAnimator.start();
        frameLayout.addView(this.changeDayNightView, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new ThemePreviewActivity$$ExternalSyntheticLambda0(this, i));
    }

    public final void updateApplyButton1(boolean z) {
        int i = 0;
        long j = this.dialogId;
        if (j > 0) {
            this.applyButton1.setText(LocaleController.getString(R.string.ApplyWallpaperForMe));
            return;
        }
        if (j >= 0) {
            this.applyButton1.setText(LocaleController.getString(R.string.ApplyWallpaper));
            return;
        }
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
        if (chat == null) {
            this.applyButton1.setText(LocaleController.formatString(R.string.ApplyWallpaperForChannel, LocaleController.getString(R.string.AccDescrChannel).toLowerCase()));
            return;
        }
        this.applyButton1.setText(LocaleController.formatString(R.string.ApplyWallpaperForChannel, chat.title));
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
        if (tL_premium_boostsStatus != null) {
            if (tL_premium_boostsStatus.level < (ChatObject.isChannelAndNotMegaGroup(-this.dialogId, this.currentAccount) ? getMessagesController().channelCustomWallpaperLevelMin : getMessagesController().groupCustomWallpaperLevelMin)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                if (this.lockSpan == null) {
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_switch_lock);
                    this.lockSpan = coloredImageSpan;
                    coloredImageSpan.setTopOffset(1);
                }
                spannableStringBuilder.setSpan(this.lockSpan, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", ChatObject.isChannelAndNotMegaGroup(-this.dialogId, this.currentAccount) ? getMessagesController().channelCustomWallpaperLevelMin : getMessagesController().groupCustomWallpaperLevelMin, new Object[0]));
                BlurButton blurButton = this.applyButton1;
                blurButton.getClass();
                blurButton.subtext = new Text(spannableStringBuilder, 12.0f, null);
                blurButton.subtextShown = true;
                if (!z) {
                    blurButton.subtextShownT.set(true, true);
                }
                blurButton.invalidate();
                return;
            }
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.boostsStatus;
        if (tL_premium_boostsStatus2 == null) {
            if (this.dialogId >= 0 || this.checkingBoostsLevel || this.checkedBoostsLevel || tL_premium_boostsStatus2 != null) {
                return;
            }
            this.checkingBoostsLevel = true;
            getMessagesController().getBoostsController().getBoostsStats(this.dialogId, new ThemePreviewActivity$$ExternalSyntheticLambda25(this, i));
            return;
        }
        BlurButton blurButton2 = this.applyButton1;
        blurButton2.getClass();
        blurButton2.subtextShown = false;
        if (!z) {
            AnimatedFloat animatedFloat = blurButton2.subtextShownT;
            animatedFloat.getClass();
            animatedFloat.set(0.0f, true);
        }
        blurButton2.invalidate();
    }

    public final void updateBlurred() {
        if (this.isBlurred && this.blurredBitmap == null) {
            Bitmap bitmap = this.currentWallpaperBitmap;
            if (bitmap != null) {
                this.originalBitmap = bitmap;
                this.blurredBitmap = Utilities.blurWallpaper(bitmap);
            } else {
                ImageReceiver imageReceiver = this.backgroundImage.getImageReceiver();
                if (imageReceiver.hasNotThumb() || imageReceiver.hasStaticThumb()) {
                    this.originalBitmap = imageReceiver.getBitmap();
                    this.blurredBitmap = Utilities.blurWallpaper(imageReceiver.getBitmap());
                }
            }
        }
        if (!this.isBlurred) {
            setCurrentImage(false);
            return;
        }
        Bitmap bitmap2 = this.blurredBitmap;
        if (bitmap2 != null) {
            this.backgroundImage.setImageBitmap(bitmap2);
        }
    }

    public final void updateButtonState$1$1() {
        File httpFilePath;
        String name;
        int i;
        long j;
        File pathToAttach;
        String attachFileName;
        FrameLayout frameLayout;
        Object obj = this.selectedPattern;
        if (obj == null) {
            obj = this.currentWallpaper;
        }
        boolean z = obj instanceof TLRPC.TL_wallPaper;
        if (z || (obj instanceof MediaController.SearchImage)) {
            if (z) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                attachFileName = FileLoader.getAttachFileName(tL_wallPaper.document);
                if (TextUtils.isEmpty(attachFileName)) {
                    return;
                }
                pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(tL_wallPaper.document, true);
                j = tL_wallPaper.document.size;
            } else {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                TLRPC.Photo photo = searchImage.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.maxWallpaperSize, true);
                    httpFilePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true);
                    name = FileLoader.getAttachFileName(closestPhotoSizeWithSize);
                    i = closestPhotoSizeWithSize.size;
                } else {
                    httpFilePath = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                    name = httpFilePath.getName();
                    i = searchImage.size;
                }
                j = i;
                String str = name;
                pathToAttach = httpFilePath;
                attachFileName = str;
                if (TextUtils.isEmpty(attachFileName)) {
                    return;
                }
            }
            boolean zExists = pathToAttach.exists();
            int i2 = this.screenType;
            if (zExists) {
                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                this.backgroundImage.invalidate();
                if (i2 == 2) {
                    if (j == 0 || this.dialogId != 0) {
                        this.actionBar2.setSubtitle(null);
                    } else {
                        this.actionBar2.setSubtitle(AndroidUtilities.formatFileSize(j));
                    }
                }
            } else {
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(attachFileName, null, this);
                if (i2 == 2 && this.dialogId == 0) {
                    this.actionBar2.setSubtitle(LocaleController.getString(R.string.LoadingFullImage));
                }
                this.backgroundImage.invalidate();
            }
            if (this.selectedPattern == null && (frameLayout = this.backgroundButtonsContainer) != null) {
                frameLayout.setAlpha(zExists ? 1.0f : 0.5f);
            }
            if (i2 == 0) {
                this.doneButton.setEnabled(zExists);
                this.doneButton.setAlpha(zExists ? 1.0f : 0.5f);
                return;
            }
            if (i2 != 2) {
                this.saveItem.setEnabled(zExists);
                this.saveItem.setAlpha(zExists ? 1.0f : 0.5f);
                return;
            }
            this.bottomOverlayChat.setEnabled(zExists);
            BlurButton blurButton = this.applyButton1;
            if (blurButton != null) {
                blurButton.setAlpha(zExists ? 1.0f : 0.5f);
            }
            BlurButton blurButton2 = this.applyButton2;
            if (blurButton2 != null) {
                blurButton2.setAlpha(zExists ? 1.0f : 0.5f);
            }
        }
    }

    public final void updateIntensity() {
        this.backgroundImage.getImageReceiver().setAlpha(Math.abs(this.currentIntensity));
        this.backgroundImage.invalidate();
        this.patternsListView.invalidateViews();
        if (this.currentIntensity >= 0.0f) {
            this.backgroundImage.getImageReceiver().setGradientBitmap(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.backgroundImage.getImageReceiver().setBlendMode(null);
            }
            if (this.backgroundImage.getBackground() instanceof MotionBackgroundDrawable) {
                this.backgroundImage.getImageReceiver().setGradientBitmap(((MotionBackgroundDrawable) this.backgroundImage.getBackground()).currentBitmap);
            }
        }
        this.themeDelegate.applyChatServiceMessageColor(this.backgroundImage.getBackground(), this.backgroundImage.getBackground(), Float.valueOf(this.currentIntensity));
        invalidateBlur$2();
    }

    public final void updateMotionButton() {
        int i = this.screenType;
        if (i == 1 || i == 2) {
            if (this.selectedPattern == null && (this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper)) {
                this.backgroundCheckBoxView[2].setChecked(false, true);
            }
            this.backgroundCheckBoxView[this.selectedPattern != null ? (char) 2 : (char) 0].setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            WallpaperCheckBoxView wallpaperCheckBoxView = this.backgroundCheckBoxView[2];
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(wallpaperCheckBoxView, (Property<WallpaperCheckBoxView, Float>) property, this.selectedPattern != null ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.backgroundCheckBoxView[0], (Property<WallpaperCheckBoxView, Float>) property, this.selectedPattern != null ? 0.0f : 1.0f));
            animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public final void onAnimationEnd(Animator animator) {
                    ThemePreviewActivity themePreviewActivity = ThemePreviewActivity.this;
                    themePreviewActivity.backgroundCheckBoxView[themePreviewActivity.selectedPattern != null ? (char) 0 : (char) 2].setVisibility(4);
                }
            });
            animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            animatorSet.setDuration(200L);
            animatorSet.start();
            return;
        }
        boolean zIsEnabled = this.backgroundCheckBoxView[0].isEnabled();
        TLRPC.TL_wallPaper tL_wallPaper = this.selectedPattern;
        if (zIsEnabled == (tL_wallPaper != null)) {
            return;
        }
        if (tL_wallPaper == null) {
            this.backgroundCheckBoxView[0].setChecked(false, true);
        }
        this.backgroundCheckBoxView[0].setEnabled(this.selectedPattern != null);
        if (this.selectedPattern != null) {
            this.backgroundCheckBoxView[0].setVisibility(0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.backgroundCheckBoxView[1].getLayoutParams();
        AnimatorSet animatorSet2 = new AnimatorSet();
        int iDp = (AndroidUtilities.dp(9.0f) + layoutParams.width) / 2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.backgroundCheckBoxView[0], (Property<WallpaperCheckBoxView, Float>) View.ALPHA, this.selectedPattern == null ? 0.0f : 1.0f));
        WallpaperCheckBoxView wallpaperCheckBoxView2 = this.backgroundCheckBoxView[0];
        Property property2 = View.TRANSLATION_X;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(wallpaperCheckBoxView2, (Property<WallpaperCheckBoxView, Float>) property2, this.selectedPattern != null ? 0.0f : iDp));
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.backgroundCheckBoxView[1], (Property<WallpaperCheckBoxView, Float>) property2, this.selectedPattern == null ? -iDp : 0.0f));
        animatorSet2.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        animatorSet2.setDuration(200L);
        animatorSet2.addListener(new AnimatorListenerAdapter() {
            @Override
            public final void onAnimationEnd(Animator animator) {
                ThemePreviewActivity themePreviewActivity = ThemePreviewActivity.this;
                if (themePreviewActivity.selectedPattern == null) {
                    themePreviewActivity.backgroundCheckBoxView[0].setVisibility(4);
                }
            }
        });
        animatorSet2.start();
    }

    public final void updatePlayAnimationView(boolean z) {
        long j;
        float f;
        float f2;
        char c;
        AnonymousClass16 anonymousClass16;
        boolean z2;
        AnimatorSet animatorSet;
        boolean z3;
        boolean z4;
        AnimatorSet animatorSet2;
        float f3;
        float f4;
        float f5;
        float fDp;
        float f6;
        float fDp2;
        float f7;
        float f8;
        float f9;
        float fDp3;
        float f10;
        float fDp4;
        int defaultAccentColor;
        int i = 2;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.screenType;
        Theme.ThemeAccent themeAccent = this.accent;
        if (i2 >= 29) {
            if (i3 != 0) {
                j = 0;
                if (i3 == 1) {
                    defaultAccentColor = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to2);
                    long j2 = themeAccent.backgroundGradientOverrideColor2;
                    int i4 = (int) j2;
                    if (i4 == 0 && j2 != 0) {
                        defaultAccentColor = 0;
                    } else if (i4 != 0) {
                        defaultAccentColor = i4;
                    }
                } else if (this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) {
                    defaultAccentColor = this.backgroundGradientColor2;
                } else {
                    defaultAccentColor = 0;
                }
            } else if (themeAccent != null) {
                j = 0;
                defaultAccentColor = (int) themeAccent.backgroundGradientOverrideColor2;
            } else {
                j = 0;
                defaultAccentColor = getThemedColor(Theme.key_chat_wallpaper_gradient_to2);
            }
            if (defaultAccentColor == 0 || this.currentIntensity < 0.0f) {
                this.backgroundImage.getImageReceiver().setBlendMode(null);
            } else {
                this.backgroundImage.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
            }
        } else {
            j = 0;
        }
        if (this.backgroundPlayAnimationView != null) {
            if (i3 == 2) {
                if (this.backgroundGradientColor1 != 0) {
                    f2 = 34.0f;
                    if (getTag() != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    setTag(z3 ? 1 : null);
                    if (z4 != z3) {
                        if (z3) {
                            setVisibility(0);
                        }
                        animatorSet2 = this.backgroundPlayViewAnimator;
                        if (animatorSet2 != null) {
                            animatorSet2.cancel();
                        }
                        if (z) {
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.backgroundPlayViewAnimator = animatorSet3;
                            AnonymousClass16 anonymousClass17 = this.backgroundPlayAnimationView;
                            Property property = View.ALPHA;
                            if (z3) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(anonymousClass17, (Property<AnonymousClass16, Float>) property, f7);
                            AnonymousClass16 anonymousClass18 = this.backgroundPlayAnimationView;
                            Property property2 = View.SCALE_X;
                            if (z3) {
                                f8 = 1.0f;
                            } else {
                                f8 = 0.0f;
                            }
                            f = 1.0f;
                            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(anonymousClass18, (Property<AnonymousClass16, Float>) property2, f8);
                            AnonymousClass16 anonymousClass19 = this.backgroundPlayAnimationView;
                            Property property3 = View.SCALE_Y;
                            if (z3) {
                                f9 = 1.0f;
                            } else {
                                f9 = 0.0f;
                            }
                            c = 3;
                            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(anonymousClass19, (Property<AnonymousClass16, Float>) property3, f9);
                            WallpaperCheckBoxView wallpaperCheckBoxView = this.backgroundCheckBoxView[0];
                            Property property4 = View.TRANSLATION_X;
                            if (z3) {
                                fDp3 = AndroidUtilities.dp(f2);
                            } else {
                                fDp3 = 0.0f;
                            }
                            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(wallpaperCheckBoxView, (Property<WallpaperCheckBoxView, Float>) property4, fDp3);
                            WallpaperCheckBoxView wallpaperCheckBoxView2 = this.backgroundCheckBoxView[1];
                            if (z3) {
                                f10 = -AndroidUtilities.dp(f2);
                            } else {
                                f10 = 0.0f;
                            }
                            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(wallpaperCheckBoxView2, (Property<WallpaperCheckBoxView, Float>) property4, f10);
                            WallpaperCheckBoxView wallpaperCheckBoxView3 = this.backgroundCheckBoxView[2];
                            if (z3) {
                                fDp4 = AndroidUtilities.dp(f2);
                            } else {
                                fDp4 = 0.0f;
                            }
                            animatorSet3.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5, ObjectAnimator.ofFloat(wallpaperCheckBoxView3, (Property<WallpaperCheckBoxView, Float>) property4, fDp4));
                            this.backgroundPlayViewAnimator.setDuration(180L);
                            this.backgroundPlayViewAnimator.addListener(new AnonymousClass32(this, i));
                            this.backgroundPlayViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                            this.backgroundPlayViewAnimator.start();
                        } else {
                            f = 1.0f;
                            c = 3;
                            AnonymousClass16 anonymousClass110 = this.backgroundPlayAnimationView;
                            if (z3) {
                                f3 = 1.0f;
                            } else {
                                f3 = 0.0f;
                            }
                            anonymousClass110.setAlpha(f3);
                            AnonymousClass16 anonymousClass111 = this.backgroundPlayAnimationView;
                            if (z3) {
                                f4 = 1.0f;
                            } else {
                                f4 = 0.0f;
                            }
                            anonymousClass111.setScaleX(f4);
                            AnonymousClass16 anonymousClass112 = this.backgroundPlayAnimationView;
                            if (z3) {
                                f5 = 1.0f;
                            } else {
                                f5 = 0.0f;
                            }
                            anonymousClass112.setScaleY(f5);
                            WallpaperCheckBoxView wallpaperCheckBoxView4 = this.backgroundCheckBoxView[0];
                            if (z3) {
                                fDp = AndroidUtilities.dp(f2);
                            } else {
                                fDp = 0.0f;
                            }
                            wallpaperCheckBoxView4.setTranslationX(fDp);
                            WallpaperCheckBoxView wallpaperCheckBoxView5 = this.backgroundCheckBoxView[1];
                            if (z3) {
                                f6 = -AndroidUtilities.dp(f2);
                            } else {
                                f6 = 0.0f;
                            }
                            wallpaperCheckBoxView5.setTranslationX(f6);
                            WallpaperCheckBoxView wallpaperCheckBoxView6 = this.backgroundCheckBoxView[2];
                            if (z3) {
                                fDp2 = AndroidUtilities.dp(f2);
                            } else {
                                fDp2 = 0.0f;
                            }
                            wallpaperCheckBoxView6.setTranslationX(fDp2);
                        }
                    } else {
                        f = 1.0f;
                    }
                }
                f2 = 34.0f;
                if (getTag() != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                setTag(z3 ? 1 : null);
                if (z4 != z3) {
                    if (z3) {
                        setVisibility(0);
                    }
                    animatorSet2 = this.backgroundPlayViewAnimator;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    if (z) {
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.backgroundPlayViewAnimator = animatorSet4;
                        AnonymousClass16 anonymousClass113 = this.backgroundPlayAnimationView;
                        Property property5 = View.ALPHA;
                        if (z3) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(anonymousClass113, (Property<AnonymousClass16, Float>) property5, f7);
                        AnonymousClass16 anonymousClass114 = this.backgroundPlayAnimationView;
                        Property property6 = View.SCALE_X;
                        if (z3) {
                            f8 = 1.0f;
                        } else {
                            f8 = 0.0f;
                        }
                        f = 1.0f;
                        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(anonymousClass114, (Property<AnonymousClass16, Float>) property6, f8);
                        AnonymousClass16 anonymousClass115 = this.backgroundPlayAnimationView;
                        Property property7 = View.SCALE_Y;
                        if (z3) {
                            f9 = 1.0f;
                        } else {
                            f9 = 0.0f;
                        }
                        c = 3;
                        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(anonymousClass115, (Property<AnonymousClass16, Float>) property7, f9);
                        WallpaperCheckBoxView wallpaperCheckBoxView7 = this.backgroundCheckBoxView[0];
                        Property property8 = View.TRANSLATION_X;
                        if (z3) {
                            fDp3 = AndroidUtilities.dp(f2);
                        } else {
                            fDp3 = 0.0f;
                        }
                        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(wallpaperCheckBoxView7, (Property<WallpaperCheckBoxView, Float>) property8, fDp3);
                        WallpaperCheckBoxView wallpaperCheckBoxView8 = this.backgroundCheckBoxView[1];
                        if (z3) {
                            f10 = -AndroidUtilities.dp(f2);
                        } else {
                            f10 = 0.0f;
                        }
                        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(wallpaperCheckBoxView8, (Property<WallpaperCheckBoxView, Float>) property8, f10);
                        WallpaperCheckBoxView wallpaperCheckBoxView9 = this.backgroundCheckBoxView[2];
                        if (z3) {
                            fDp4 = AndroidUtilities.dp(f2);
                        } else {
                            fDp4 = 0.0f;
                        }
                        animatorSet4.playTogether(objectAnimatorOfFloat6, objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat10, ObjectAnimator.ofFloat(wallpaperCheckBoxView9, (Property<WallpaperCheckBoxView, Float>) property8, fDp4));
                        this.backgroundPlayViewAnimator.setDuration(180L);
                        this.backgroundPlayViewAnimator.addListener(new AnonymousClass32(this, i));
                        this.backgroundPlayViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                        this.backgroundPlayViewAnimator.start();
                    } else {
                        f = 1.0f;
                        c = 3;
                        AnonymousClass16 anonymousClass116 = this.backgroundPlayAnimationView;
                        if (z3) {
                            f3 = 1.0f;
                        } else {
                            f3 = 0.0f;
                        }
                        anonymousClass116.setAlpha(f3);
                        AnonymousClass16 anonymousClass117 = this.backgroundPlayAnimationView;
                        if (z3) {
                            f4 = 1.0f;
                        } else {
                            f4 = 0.0f;
                        }
                        anonymousClass117.setScaleX(f4);
                        AnonymousClass16 anonymousClass118 = this.backgroundPlayAnimationView;
                        if (z3) {
                            f5 = 1.0f;
                        } else {
                            f5 = 0.0f;
                        }
                        anonymousClass118.setScaleY(f5);
                        WallpaperCheckBoxView wallpaperCheckBoxView10 = this.backgroundCheckBoxView[0];
                        if (z3) {
                            fDp = AndroidUtilities.dp(f2);
                        } else {
                            fDp = 0.0f;
                        }
                        wallpaperCheckBoxView10.setTranslationX(fDp);
                        WallpaperCheckBoxView wallpaperCheckBoxView11 = this.backgroundCheckBoxView[1];
                        if (z3) {
                            f6 = -AndroidUtilities.dp(f2);
                        } else {
                            f6 = 0.0f;
                        }
                        wallpaperCheckBoxView11.setTranslationX(f6);
                        WallpaperCheckBoxView wallpaperCheckBoxView12 = this.backgroundCheckBoxView[2];
                        if (z3) {
                            fDp2 = AndroidUtilities.dp(f2);
                        } else {
                            fDp2 = 0.0f;
                        }
                        wallpaperCheckBoxView12.setTranslationX(fDp2);
                    }
                } else {
                    f = 1.0f;
                }
            } else {
                if (i3 == 1) {
                    int defaultAccentColor2 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to1);
                    long j3 = themeAccent.backgroundGradientOverrideColor1;
                    f2 = 34.0f;
                    int i5 = (int) j3;
                    if (i5 == 0 && j3 != j) {
                        defaultAccentColor2 = 0;
                    } else if (i5 != 0) {
                        defaultAccentColor2 = i5;
                    }
                    z3 = defaultAccentColor2 != 0;
                    if (getTag() != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    setTag(z3 ? 1 : null);
                    if (z4 != z3) {
                        if (z3) {
                            setVisibility(0);
                        }
                        animatorSet2 = this.backgroundPlayViewAnimator;
                        if (animatorSet2 != null) {
                            animatorSet2.cancel();
                        }
                        if (z) {
                            AnimatorSet animatorSet5 = new AnimatorSet();
                            this.backgroundPlayViewAnimator = animatorSet5;
                            AnonymousClass16 anonymousClass119 = this.backgroundPlayAnimationView;
                            Property property9 = View.ALPHA;
                            if (z3) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(anonymousClass119, (Property<AnonymousClass16, Float>) property9, f7);
                            AnonymousClass16 anonymousClass1110 = this.backgroundPlayAnimationView;
                            Property property10 = View.SCALE_X;
                            if (z3) {
                                f8 = 1.0f;
                            } else {
                                f8 = 0.0f;
                            }
                            f = 1.0f;
                            ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(anonymousClass1110, (Property<AnonymousClass16, Float>) property10, f8);
                            AnonymousClass16 anonymousClass1111 = this.backgroundPlayAnimationView;
                            Property property11 = View.SCALE_Y;
                            if (z3) {
                                f9 = 1.0f;
                            } else {
                                f9 = 0.0f;
                            }
                            c = 3;
                            ObjectAnimator objectAnimatorOfFloat13 = ObjectAnimator.ofFloat(anonymousClass1111, (Property<AnonymousClass16, Float>) property11, f9);
                            WallpaperCheckBoxView wallpaperCheckBoxView13 = this.backgroundCheckBoxView[0];
                            Property property12 = View.TRANSLATION_X;
                            if (z3) {
                                fDp3 = AndroidUtilities.dp(f2);
                            } else {
                                fDp3 = 0.0f;
                            }
                            ObjectAnimator objectAnimatorOfFloat14 = ObjectAnimator.ofFloat(wallpaperCheckBoxView13, (Property<WallpaperCheckBoxView, Float>) property12, fDp3);
                            WallpaperCheckBoxView wallpaperCheckBoxView14 = this.backgroundCheckBoxView[1];
                            if (z3) {
                                f10 = -AndroidUtilities.dp(f2);
                            } else {
                                f10 = 0.0f;
                            }
                            ObjectAnimator objectAnimatorOfFloat15 = ObjectAnimator.ofFloat(wallpaperCheckBoxView14, (Property<WallpaperCheckBoxView, Float>) property12, f10);
                            WallpaperCheckBoxView wallpaperCheckBoxView15 = this.backgroundCheckBoxView[2];
                            if (z3) {
                                fDp4 = AndroidUtilities.dp(f2);
                            } else {
                                fDp4 = 0.0f;
                            }
                            animatorSet5.playTogether(objectAnimatorOfFloat11, objectAnimatorOfFloat12, objectAnimatorOfFloat13, objectAnimatorOfFloat14, objectAnimatorOfFloat15, ObjectAnimator.ofFloat(wallpaperCheckBoxView15, (Property<WallpaperCheckBoxView, Float>) property12, fDp4));
                            this.backgroundPlayViewAnimator.setDuration(180L);
                            this.backgroundPlayViewAnimator.addListener(new AnonymousClass32(this, i));
                            this.backgroundPlayViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                            this.backgroundPlayViewAnimator.start();
                        } else {
                            f = 1.0f;
                            c = 3;
                            AnonymousClass16 anonymousClass1112 = this.backgroundPlayAnimationView;
                            if (z3) {
                                f3 = 1.0f;
                            } else {
                                f3 = 0.0f;
                            }
                            anonymousClass1112.setAlpha(f3);
                            AnonymousClass16 anonymousClass1113 = this.backgroundPlayAnimationView;
                            if (z3) {
                                f4 = 1.0f;
                            } else {
                                f4 = 0.0f;
                            }
                            anonymousClass1113.setScaleX(f4);
                            AnonymousClass16 anonymousClass1114 = this.backgroundPlayAnimationView;
                            if (z3) {
                                f5 = 1.0f;
                            } else {
                                f5 = 0.0f;
                            }
                            anonymousClass1114.setScaleY(f5);
                            WallpaperCheckBoxView wallpaperCheckBoxView16 = this.backgroundCheckBoxView[0];
                            if (z3) {
                                fDp = AndroidUtilities.dp(f2);
                            } else {
                                fDp = 0.0f;
                            }
                            wallpaperCheckBoxView16.setTranslationX(fDp);
                            WallpaperCheckBoxView wallpaperCheckBoxView17 = this.backgroundCheckBoxView[1];
                            if (z3) {
                                f6 = -AndroidUtilities.dp(f2);
                            } else {
                                f6 = 0.0f;
                            }
                            wallpaperCheckBoxView17.setTranslationX(f6);
                            WallpaperCheckBoxView wallpaperCheckBoxView18 = this.backgroundCheckBoxView[2];
                            if (z3) {
                                fDp2 = AndroidUtilities.dp(f2);
                            } else {
                                fDp2 = 0.0f;
                            }
                            wallpaperCheckBoxView18.setTranslationX(fDp2);
                        }
                    } else {
                        f = 1.0f;
                    }
                } else {
                    f2 = 34.0f;
                }
                if (getTag() != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                setTag(z3 ? 1 : null);
                if (z4 != z3) {
                    if (z3) {
                        setVisibility(0);
                    }
                    animatorSet2 = this.backgroundPlayViewAnimator;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    if (z) {
                        AnimatorSet animatorSet6 = new AnimatorSet();
                        this.backgroundPlayViewAnimator = animatorSet6;
                        AnonymousClass16 anonymousClass1115 = this.backgroundPlayAnimationView;
                        Property property13 = View.ALPHA;
                        if (z3) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        ObjectAnimator objectAnimatorOfFloat16 = ObjectAnimator.ofFloat(anonymousClass1115, (Property<AnonymousClass16, Float>) property13, f7);
                        AnonymousClass16 anonymousClass1116 = this.backgroundPlayAnimationView;
                        Property property14 = View.SCALE_X;
                        if (z3) {
                            f8 = 1.0f;
                        } else {
                            f8 = 0.0f;
                        }
                        f = 1.0f;
                        ObjectAnimator objectAnimatorOfFloat17 = ObjectAnimator.ofFloat(anonymousClass1116, (Property<AnonymousClass16, Float>) property14, f8);
                        AnonymousClass16 anonymousClass1117 = this.backgroundPlayAnimationView;
                        Property property15 = View.SCALE_Y;
                        if (z3) {
                            f9 = 1.0f;
                        } else {
                            f9 = 0.0f;
                        }
                        c = 3;
                        ObjectAnimator objectAnimatorOfFloat18 = ObjectAnimator.ofFloat(anonymousClass1117, (Property<AnonymousClass16, Float>) property15, f9);
                        WallpaperCheckBoxView wallpaperCheckBoxView19 = this.backgroundCheckBoxView[0];
                        Property property16 = View.TRANSLATION_X;
                        if (z3) {
                            fDp3 = AndroidUtilities.dp(f2);
                        } else {
                            fDp3 = 0.0f;
                        }
                        ObjectAnimator objectAnimatorOfFloat19 = ObjectAnimator.ofFloat(wallpaperCheckBoxView19, (Property<WallpaperCheckBoxView, Float>) property16, fDp3);
                        WallpaperCheckBoxView wallpaperCheckBoxView110 = this.backgroundCheckBoxView[1];
                        if (z3) {
                            f10 = -AndroidUtilities.dp(f2);
                        } else {
                            f10 = 0.0f;
                        }
                        ObjectAnimator objectAnimatorOfFloat110 = ObjectAnimator.ofFloat(wallpaperCheckBoxView110, (Property<WallpaperCheckBoxView, Float>) property16, f10);
                        WallpaperCheckBoxView wallpaperCheckBoxView111 = this.backgroundCheckBoxView[2];
                        if (z3) {
                            fDp4 = AndroidUtilities.dp(f2);
                        } else {
                            fDp4 = 0.0f;
                        }
                        animatorSet6.playTogether(objectAnimatorOfFloat16, objectAnimatorOfFloat17, objectAnimatorOfFloat18, objectAnimatorOfFloat19, objectAnimatorOfFloat110, ObjectAnimator.ofFloat(wallpaperCheckBoxView111, (Property<WallpaperCheckBoxView, Float>) property16, fDp4));
                        this.backgroundPlayViewAnimator.setDuration(180L);
                        this.backgroundPlayViewAnimator.addListener(new AnonymousClass32(this, i));
                        this.backgroundPlayViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                        this.backgroundPlayViewAnimator.start();
                    } else {
                        f = 1.0f;
                        c = 3;
                        AnonymousClass16 anonymousClass1118 = this.backgroundPlayAnimationView;
                        if (z3) {
                            f3 = 1.0f;
                        } else {
                            f3 = 0.0f;
                        }
                        anonymousClass1118.setAlpha(f3);
                        AnonymousClass16 anonymousClass1119 = this.backgroundPlayAnimationView;
                        if (z3) {
                            f4 = 1.0f;
                        } else {
                            f4 = 0.0f;
                        }
                        anonymousClass1119.setScaleX(f4);
                        AnonymousClass16 anonymousClass11110 = this.backgroundPlayAnimationView;
                        if (z3) {
                            f5 = 1.0f;
                        } else {
                            f5 = 0.0f;
                        }
                        anonymousClass11110.setScaleY(f5);
                        WallpaperCheckBoxView wallpaperCheckBoxView112 = this.backgroundCheckBoxView[0];
                        if (z3) {
                            fDp = AndroidUtilities.dp(f2);
                        } else {
                            fDp = 0.0f;
                        }
                        wallpaperCheckBoxView112.setTranslationX(fDp);
                        WallpaperCheckBoxView wallpaperCheckBoxView113 = this.backgroundCheckBoxView[1];
                        if (z3) {
                            f6 = -AndroidUtilities.dp(f2);
                        } else {
                            f6 = 0.0f;
                        }
                        wallpaperCheckBoxView113.setTranslationX(f6);
                        WallpaperCheckBoxView wallpaperCheckBoxView114 = this.backgroundCheckBoxView[2];
                        if (z3) {
                            fDp2 = AndroidUtilities.dp(f2);
                        } else {
                            fDp2 = 0.0f;
                        }
                        wallpaperCheckBoxView114.setTranslationX(fDp2);
                    }
                } else {
                    f = 1.0f;
                }
            }
            anonymousClass16 = this.messagesPlayAnimationView;
            if (anonymousClass16 != null) {
                if (anonymousClass16.getTag() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                setTag(1);
                if (!z2) {
                    setVisibility(0);
                    animatorSet = this.messagesPlayViewAnimator;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (z) {
                        setAlpha(1.0f);
                        setScaleX(1.0f);
                        setScaleY(1.0f);
                        this.messagesCheckBoxView[0].setTranslationX(-AndroidUtilities.dp(f2));
                        this.messagesCheckBoxView[1].setTranslationX(AndroidUtilities.dp(f2));
                        return;
                    }
                    AnimatorSet animatorSet7 = new AnimatorSet();
                    this.messagesPlayViewAnimator = animatorSet7;
                    ObjectAnimator objectAnimatorOfFloat20 = ObjectAnimator.ofFloat(this.messagesPlayAnimationView, (Property<AnonymousClass16, Float>) View.ALPHA, f);
                    ObjectAnimator objectAnimatorOfFloat21 = ObjectAnimator.ofFloat(this.messagesPlayAnimationView, (Property<AnonymousClass16, Float>) View.SCALE_X, f);
                    ObjectAnimator objectAnimatorOfFloat22 = ObjectAnimator.ofFloat(this.messagesPlayAnimationView, (Property<AnonymousClass16, Float>) View.SCALE_Y, f);
                    WallpaperCheckBoxView wallpaperCheckBoxView20 = this.messagesCheckBoxView[0];
                    Property property17 = View.TRANSLATION_X;
                    ObjectAnimator objectAnimatorOfFloat23 = ObjectAnimator.ofFloat(wallpaperCheckBoxView20, (Property<WallpaperCheckBoxView, Float>) property17, -AndroidUtilities.dp(f2));
                    ObjectAnimator objectAnimatorOfFloat24 = ObjectAnimator.ofFloat(this.messagesCheckBoxView[1], (Property<WallpaperCheckBoxView, Float>) property17, AndroidUtilities.dp(f2));
                    Animator[] animatorArr = new Animator[5];
                    animatorArr[0] = objectAnimatorOfFloat20;
                    animatorArr[1] = objectAnimatorOfFloat21;
                    animatorArr[2] = objectAnimatorOfFloat22;
                    animatorArr[c] = objectAnimatorOfFloat23;
                    animatorArr[4] = objectAnimatorOfFloat24;
                    animatorSet7.playTogether(animatorArr);
                    this.messagesPlayViewAnimator.setDuration(180L);
                    this.messagesPlayViewAnimator.addListener(new AnonymousClass32(this, 3));
                    this.messagesPlayViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    this.messagesPlayViewAnimator.start();
                }
            }
        }
        f = 1.0f;
        f2 = 34.0f;
        c = 3;
        anonymousClass16 = this.messagesPlayAnimationView;
        if (anonymousClass16 != null) {
            if (anonymousClass16.getTag() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            setTag(1);
            if (!z2) {
                setVisibility(0);
                animatorSet = this.messagesPlayViewAnimator;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                if (z) {
                    setAlpha(1.0f);
                    setScaleX(1.0f);
                    setScaleY(1.0f);
                    this.messagesCheckBoxView[0].setTranslationX(-AndroidUtilities.dp(f2));
                    this.messagesCheckBoxView[1].setTranslationX(AndroidUtilities.dp(f2));
                    return;
                }
                AnimatorSet animatorSet8 = new AnimatorSet();
                this.messagesPlayViewAnimator = animatorSet8;
                ObjectAnimator objectAnimatorOfFloat25 = ObjectAnimator.ofFloat(this.messagesPlayAnimationView, (Property<AnonymousClass16, Float>) View.ALPHA, f);
                ObjectAnimator objectAnimatorOfFloat26 = ObjectAnimator.ofFloat(this.messagesPlayAnimationView, (Property<AnonymousClass16, Float>) View.SCALE_X, f);
                ObjectAnimator objectAnimatorOfFloat27 = ObjectAnimator.ofFloat(this.messagesPlayAnimationView, (Property<AnonymousClass16, Float>) View.SCALE_Y, f);
                WallpaperCheckBoxView wallpaperCheckBoxView21 = this.messagesCheckBoxView[0];
                Property property18 = View.TRANSLATION_X;
                ObjectAnimator objectAnimatorOfFloat28 = ObjectAnimator.ofFloat(wallpaperCheckBoxView21, (Property<WallpaperCheckBoxView, Float>) property18, -AndroidUtilities.dp(f2));
                ObjectAnimator objectAnimatorOfFloat29 = ObjectAnimator.ofFloat(this.messagesCheckBoxView[1], (Property<WallpaperCheckBoxView, Float>) property18, AndroidUtilities.dp(f2));
                Animator[] animatorArr2 = new Animator[5];
                animatorArr2[0] = objectAnimatorOfFloat25;
                animatorArr2[1] = objectAnimatorOfFloat26;
                animatorArr2[2] = objectAnimatorOfFloat27;
                animatorArr2[c] = objectAnimatorOfFloat28;
                animatorArr2[4] = objectAnimatorOfFloat29;
                animatorSet8.playTogether(animatorArr2);
                this.messagesPlayViewAnimator.setDuration(180L);
                this.messagesPlayViewAnimator.addListener(new AnonymousClass32(this, 3));
                this.messagesPlayViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                this.messagesPlayViewAnimator.start();
            }
        }
    }

    public final void updateSelectedPattern() {
        int childCount = this.patternsListView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.patternsListView.getChildAt(i);
            if (childAt instanceof PatternCell) {
                ((PatternCell) childAt).updateSelected$1(true);
            }
        }
    }

    public final void selectColorType(int i, boolean z) {
        Theme.ThemeAccent themeAccent;
        ?? r7;
        int i2;
        int i3;
        if (getParentActivity() == null || this.colorType == i || this.patternViewAnimation != null || (themeAccent = this.accent) == null) {
            return;
        }
        if (z && i == 2 && (Theme.hasCustomWallpaper() || themeAccent.backgroundOverrideColor == 4294967296L)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            String string = LocaleController.getString(R.string.ChangeChatBackground);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            if (!Theme.hasCustomWallpaper() || (Theme.hasCustomWallpaper() && Theme.currentTheme.overrideWallpaper.color != 0)) {
                alertDialog.message = LocaleController.getString(R.string.ChangeColorToColor);
                builder.setPositiveButton(LocaleController.getString(R.string.Reset), new ThemePreviewActivity$$ExternalSyntheticLambda13(this, 6));
                builder.setNegativeButton(LocaleController.getString(R.string.Continue), new ThemePreviewActivity$$ExternalSyntheticLambda13(this, 7));
            } else {
                alertDialog.message = LocaleController.getString(R.string.ChangeWallpaperToColor);
                builder.setPositiveButton(LocaleController.getString(R.string.Change), new ThemePreviewActivity$$ExternalSyntheticLambda13(this, 5));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            }
            showDialog(alertDialog);
            return;
        }
        int i4 = this.colorType;
        this.colorType = i;
        if (i == 1) {
            this.dropDown.setText(LocaleController.getString(R.string.ColorPickerMainColor));
            int i5 = themeAccent.accentColor2 != 0 ? 2 : 1;
            ColorPicker colorPicker = this.colorPicker;
            hasChanges(1);
            colorPicker.setType(1, 2, i5, false);
            this.colorPicker.setColor(themeAccent.accentColor, 0);
            int i6 = themeAccent.accentColor2;
            if (i6 != 0) {
                this.colorPicker.setColor(i6, 1);
            }
            if (i4 == 2 || (i4 == 3 && themeAccent.myMessagesGradientAccentColor2 != 0)) {
                r7 = 1;
                this.messagesAdapter.mObservable.notifyItemRangeRemoved(0, 1);
            }
            if (i == r7 && i != 3) {
                this.colorPicker.setMinBrightness(0.0f);
                this.colorPicker.setMaxBrightness(1.0f);
                return;
            }
            if (i4 == 2 && this.patternLayout[r7].getVisibility() == 0) {
                showPatternsView(0, r7);
            }
            if (i == r7) {
                this.colorPicker.setMinBrightness(0.0f);
                this.colorPicker.setMaxBrightness(1.0f);
            } else if (this.applyingTheme.isDark()) {
                this.colorPicker.setMinBrightness(0.2f);
            } else {
                this.colorPicker.setMinBrightness(0.05f);
                this.colorPicker.setMaxBrightness(0.8f);
            }
        }
        if (i == 2) {
            this.dropDown.setText(LocaleController.getString(R.string.ColorPickerBackground));
            int themedColor = getThemedColor(Theme.key_chat_wallpaper);
            int i7 = Theme.key_chat_wallpaper_gradient_to1;
            int themedColor2 = Theme.hasThemeKey(i7) ? getThemedColor(i7) : 0;
            int i8 = Theme.key_chat_wallpaper_gradient_to2;
            int themedColor3 = Theme.hasThemeKey(i8) ? getThemedColor(i8) : 0;
            int i9 = Theme.key_chat_wallpaper_gradient_to3;
            int themedColor4 = Theme.hasThemeKey(i9) ? getThemedColor(i9) : 0;
            long j = themeAccent.backgroundGradientOverrideColor1;
            int i10 = (int) j;
            if (i10 == 0 && j != 0) {
                themedColor2 = 0;
            }
            long j2 = themeAccent.backgroundGradientOverrideColor2;
            int i11 = (int) j2;
            if (i11 == 0 && j2 != 0) {
                themedColor3 = 0;
            }
            long j3 = themeAccent.backgroundGradientOverrideColor3;
            int i12 = (int) j3;
            if (i12 == 0 && j3 != 0) {
                themedColor4 = 0;
            }
            int i13 = (int) themeAccent.backgroundOverrideColor;
            if (i10 == 0 && themedColor2 == 0) {
                i2 = 1;
            } else if (i12 == 0 && themedColor4 == 0) {
                i2 = (i11 == 0 && themedColor3 == 0) ? 2 : 3;
            } else {
                i2 = 4;
            }
            ColorPicker colorPicker2 = this.colorPicker;
            hasChanges(2);
            colorPicker2.setType(2, 4, i2, false);
            ColorPicker colorPicker3 = this.colorPicker;
            if (i12 == 0) {
                i12 = themedColor4;
            }
            colorPicker3.setColor(i12, 3);
            ColorPicker colorPicker4 = this.colorPicker;
            if (i11 != 0) {
                themedColor3 = i11;
            }
            colorPicker4.setColor(themedColor3, 2);
            ColorPicker colorPicker5 = this.colorPicker;
            if (i10 == 0) {
                i10 = themedColor2;
            }
            colorPicker5.setColor(i10, 1);
            ColorPicker colorPicker6 = this.colorPicker;
            if (i13 != 0) {
                themedColor = i13;
            }
            colorPicker6.setColor(themedColor, 0);
            if (i4 == 1 || themeAccent.myMessagesGradientAccentColor2 == 0) {
                this.messagesAdapter.mObservable.notifyItemRangeInserted(0, 1);
            } else {
                this.messagesAdapter.notifyItemChanged(0);
            }
            smoothScrollBy(0, AndroidUtilities.dp(60.0f), null);
        } else if (i == 3) {
            this.dropDown.setText(LocaleController.getString(R.string.ColorPickerMyMessages));
            if (themeAccent.myMessagesGradientAccentColor1 == 0) {
                i3 = 1;
            } else if (themeAccent.myMessagesGradientAccentColor3 != 0) {
                i3 = 4;
            } else {
                i3 = themeAccent.myMessagesGradientAccentColor2 != 0 ? 3 : 2;
            }
            ColorPicker colorPicker7 = this.colorPicker;
            hasChanges(3);
            colorPicker7.setType(2, 4, i3, true);
            this.colorPicker.setColor(themeAccent.myMessagesGradientAccentColor3, 3);
            this.colorPicker.setColor(themeAccent.myMessagesGradientAccentColor2, 2);
            this.colorPicker.setColor(themeAccent.myMessagesGradientAccentColor1, 1);
            ColorPicker colorPicker8 = this.colorPicker;
            int i14 = themeAccent.myMessagesAccentColor;
            if (i14 == 0) {
                i14 = themeAccent.accentColor;
            }
            colorPicker8.setColor(i14, 0);
            this.messagesCheckBoxView[1].setColor(0, themeAccent.myMessagesAccentColor);
            this.messagesCheckBoxView[1].setColor(1, themeAccent.myMessagesGradientAccentColor1);
            this.messagesCheckBoxView[1].setColor(2, themeAccent.myMessagesGradientAccentColor2);
            this.messagesCheckBoxView[1].setColor(3, themeAccent.myMessagesGradientAccentColor3);
            if (themeAccent.myMessagesGradientAccentColor2 != 0) {
                if (i4 == 1) {
                    this.messagesAdapter.mObservable.notifyItemRangeInserted(0, 1);
                } else {
                    this.messagesAdapter.notifyItemChanged(0);
                }
            } else if (i4 == 2) {
                this.messagesAdapter.mObservable.notifyItemRangeRemoved(0, 1);
            }
            smoothScrollBy(0, AndroidUtilities.dp(60.0f), null);
            showAnimationHint();
        }
        r7 = 1;
        if (i == r7) {
        }
        if (i4 == 2) {
            showPatternsView(0, r7);
        }
        if (i == r7) {
            this.colorPicker.setMinBrightness(0.0f);
            this.colorPicker.setMaxBrightness(1.0f);
        } else if (this.applyingTheme.isDark()) {
            this.colorPicker.setMinBrightness(0.2f);
        } else {
            this.colorPicker.setMinBrightness(0.05f);
            this.colorPicker.setMaxBrightness(0.8f);
        }
    }

    public final class AnonymousClass14 extends FrameLayout {
        public final int $r8$classId = 2;
        public final Object dimPaint;
        public Object dimPaint2;
        public final Object shadowPaint;
        public final Object this$0;

        public AnonymousClass14(Context context) {
            super(context);
            this.dimPaint = new Path();
            this.dimPaint2 = new float[8];
            this.this$0 = new RectF();
            this.shadowPaint = new Paint(1);
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            ValueAnimator valueAnimator;
            ValueAnimator valueAnimator2;
            boolean z;
            Canvas canvasBeginRecording;
            switch (this.$r8$classId) {
                case 0:
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                    float fDp = AndroidUtilities.dp(8.0f);
                    Paint paint = (Paint) this.shadowPaint;
                    paint.setColor(0);
                    float fDpf2 = AndroidUtilities.dpf2(1.0f);
                    float fDpf3 = AndroidUtilities.dpf2(0.33f);
                    ThemePreviewActivity themePreviewActivity = (ThemePreviewActivity) this.this$0;
                    paint.setShadowLayer(fDpf2, 0.0f, fDpf3, ColorUtils.setAlphaComponent(-16777216, (int) (themePreviewActivity.dimmingSlider.getAlpha() * 27.0f)));
                    canvas.drawRoundRect(rectF, fDp, fDp, paint);
                    Theme.applyServiceShaderMatrixForView(this, themePreviewActivity.backgroundImage, themePreviewActivity.themeDelegate);
                    Paint paint2 = themePreviewActivity.themeDelegate.getPaint("paintChatActionBackground");
                    int alpha = paint2.getAlpha();
                    paint2.setAlpha((int) (themePreviewActivity.dimmingSlider.getAlpha() * alpha));
                    canvas.drawRoundRect(rectF, fDp, fDp, paint2);
                    paint2.setAlpha(alpha);
                    if (themePreviewActivity.shouldShowBrightnessControll) {
                        float f = themePreviewActivity.dimAmount;
                        if (f > 0.0f) {
                            Paint paint3 = (Paint) this.dimPaint2;
                            paint3.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (f * 255.0f * themePreviewActivity.progressToDarkTheme)));
                            canvas.drawRoundRect(rectF, fDp, fDp, paint3);
                        }
                    }
                    Paint paint4 = (Paint) this.dimPaint;
                    paint4.setColor(520093695);
                    paint4.setAlpha((int) (themePreviewActivity.dimmingSlider.getAlpha() * 30.0f));
                    canvas.drawRoundRect(rectF, fDp, fDp, paint4);
                    super.dispatchDraw(canvas);
                    break;
                case 4:
                    LimitPreviewView limitPreviewView = (LimitPreviewView) this.this$0;
                    boolean z2 = limitPreviewView.isBoostsStyle;
                    Paint paint5 = (Paint) this.shadowPaint;
                    Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.dimPaint2;
                    if (!z2) {
                        paint5.setColor(Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider));
                    } else if (limitPreviewView.isStatistic || limitPreviewView.isRatingStyle) {
                        paint5.setColor(Theme.getColor(Theme.key_listSelector, resourcesProvider));
                    } else {
                        paint5.setColor(Theme.getColor(Theme.key_graySection, resourcesProvider));
                    }
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    LimitPreviewView.DarkGradientProvider darkGradientProvider = limitPreviewView.darkGradientProvider;
                    if (darkGradientProvider != null) {
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ((BoostsActivity) ((WindowVisibilityManager$$ExternalSyntheticLambda0) darkGradientProvider).f$0).setDarkGradientLocation(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                    } else {
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint5);
                    }
                    canvas.save();
                    if (!limitPreviewView.isBoostsStyle) {
                        canvas.clipRect(limitPreviewView.width1, 0, getMeasuredWidth(), getMeasuredHeight());
                    }
                    Paint mainGradientPaint = limitPreviewView.isRatingStyle ? limitPreviewView.ratingPaint : limitPreviewView.darkGradientProvider != null ? (Paint) this.dimPaint : PremiumGradient.getInstance().getMainGradientPaint();
                    ViewGroup viewGroup = limitPreviewView.parentVideForGradient;
                    if (viewGroup != null) {
                        PremiumGradient.PremiumGradientTools premiumGradientTools = limitPreviewView.staticGradient;
                        if (premiumGradientTools != null) {
                            mainGradientPaint = premiumGradientTools.paint;
                            float f2 = limitPreviewView.gradientTotalHeight;
                            float f3 = -limitPreviewView.gradientYOffset;
                            premiumGradientTools.chekColors();
                            Matrix matrix = premiumGradientTools.matrix;
                            matrix.reset();
                            matrix.postScale(1.0f, f2 / 100.0f, 0.0f, 0.0f);
                            matrix.postTranslate(0.0f, f3);
                            premiumGradientTools.shader.setLocalMatrix(matrix);
                        } else {
                            float y = 0.0f;
                            for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                                y += view.getY();
                            }
                            PremiumGradient.getInstance().mainGradient.gradientMatrix(0, limitPreviewView.getGlobalXOffset() - getLeft(), 0, viewGroup.getMeasuredWidth(), -y, viewGroup.getMeasuredHeight());
                        }
                    } else {
                        PremiumGradient.getInstance().mainGradient.gradientMatrix(0, limitPreviewView.getGlobalXOffset() - getLeft(), 0, limitPreviewView.getMeasuredWidth(), -getTop(), limitPreviewView.getMeasuredHeight());
                    }
                    int alpha2 = mainGradientPaint.getAlpha();
                    if (limitPreviewView.animateArrowFadeOut && (valueAnimator2 = limitPreviewView.arrowAnimator) != null) {
                        mainGradientPaint.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha2));
                    } else if (limitPreviewView.animateArrowFadeIn && (valueAnimator = limitPreviewView.arrowAnimator) != null) {
                        mainGradientPaint.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha2));
                    }
                    if (limitPreviewView.isBoostsStyle) {
                        if (limitPreviewView.isRatingNegative || limitPreviewView.drawFromRight) {
                            AndroidUtilities.rectTmp.set(limitPreviewView.width1, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        } else {
                            AndroidUtilities.rectTmp.set(0.0f, 0.0f, limitPreviewView.width1, getMeasuredHeight());
                        }
                    }
                    canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), mainGradientPaint);
                    mainGradientPaint.setAlpha(alpha2);
                    canvas.restore();
                    if (limitPreviewView.staticGradient == null && limitPreviewView.invalidationEnabled) {
                        invalidate();
                    }
                    super.dispatchDraw(canvas);
                    break;
                case 5:
                    Paint paint6 = (Paint) this.shadowPaint;
                    paint6.setColor(Theme.getColor(Theme.key_sheet_scrollUp, (Theme.ResourcesProvider) this.dimPaint2));
                    float fDp2 = AndroidUtilities.dp(18.0f);
                    float height = getHeight() / 2.0f;
                    LimitReachedBottomSheet.BoostFeatureCell boostFeatureCell = (LimitReachedBottomSheet.BoostFeatureCell) this.this$0;
                    canvas.drawLine(fDp2, height, boostFeatureCell.levelTextView.getLeft() - AndroidUtilities.dp(20.0f), getHeight() / 2.0f, paint6);
                    canvas.drawLine(AndroidUtilities.dp(20.0f) + boostFeatureCell.levelTextView.getRight(), getHeight() / 2.0f, getWidth() - AndroidUtilities.dp(18.0f), getHeight() / 2.0f, paint6);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(boostFeatureCell.levelTextView.getLeft() - AndroidUtilities.dp(15.0f), ((boostFeatureCell.levelTextView.getBottom() + boostFeatureCell.levelTextView.getTop()) - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(15.0f) + boostFeatureCell.levelTextView.getRight(), (AndroidUtilities.dp(30.0f) + (boostFeatureCell.levelTextView.getBottom() + boostFeatureCell.levelTextView.getTop())) / 2.0f);
                    canvas.save();
                    canvas.translate(rectF3.left, rectF3.top);
                    rectF3.set(0.0f, 0.0f, rectF3.width(), rectF3.height());
                    PremiumGradient.PremiumGradientTools premiumGradientTools2 = (PremiumGradient.PremiumGradientTools) this.dimPaint;
                    premiumGradientTools2.getClass();
                    premiumGradientTools2.gradientMatrix((int) rectF3.left, 0.0f, (int) rectF3.top, (int) rectF3.right, 0.0f, (int) rectF3.bottom);
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), premiumGradientTools2.paint);
                    canvas.restore();
                    super.dispatchDraw(canvas);
                    break;
                case 7:
                    int i = Build.VERSION.SDK_INT;
                    if (i < 31 || !canvas.isHardwareAccelerated() || AndroidUtilities.makingGlobalBlurBitmap) {
                        z = false;
                        canvasBeginRecording = canvas;
                    } else {
                        if (((RenderNode) this.dimPaint2) == null) {
                            this.dimPaint2 = PhotoViewer$$ExternalSyntheticApiModelOutline3.m$5();
                        }
                        ((RenderNode) this.dimPaint2).setPosition(0, 0, getWidth(), getHeight());
                        canvasBeginRecording = ((RenderNode) this.dimPaint2).beginRecording();
                        z = true;
                    }
                    super.dispatchDraw(canvasBeginRecording);
                    if (z && i >= 31) {
                        ((RenderNode) this.dimPaint2).endRecording();
                        BlurringShader.BlurManager blurManager = ((StoryRecorder) this.this$0).blurManager;
                        if (blurManager != null) {
                            RenderNode renderNode = (RenderNode) this.dimPaint2;
                            blurManager.renderNodeView = this;
                            blurManager.renderNode = renderNode;
                            blurManager.renderNodeBackgroundColor = -14737633;
                            if (renderNode == null || i < 31) {
                                blurManager.blurRenderNode = null;
                            } else {
                                RenderNode renderNodeM = AndroidUtilities$$ExternalSyntheticApiModelOutline5.m((Object) renderNode);
                                RenderNode renderNodeM$3 = Theme$$ExternalSyntheticApiModelOutline3.m$3();
                                float fDp3 = AndroidUtilities.dp(35.0f);
                                float fDp4 = AndroidUtilities.dp(35.0f);
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                renderNodeM$3.setRenderEffect(RenderEffect.createBlurEffect(fDp3, fDp4, Shader.TileMode.CLAMP));
                                renderNodeM$3.setPosition(0, 0, renderNodeM.getWidth(), renderNodeM.getHeight());
                                RecordingCanvas recordingCanvasBeginRecording = renderNodeM$3.beginRecording();
                                recordingCanvasBeginRecording.drawColor(-14737633);
                                recordingCanvasBeginRecording.drawRenderNode(renderNodeM);
                                renderNodeM$3.endRecording();
                                blurManager.blurRenderNode = renderNodeM$3;
                            }
                        }
                        canvas.drawRenderNode((RenderNode) this.dimPaint2);
                        break;
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
                case 1:
                    RectF rectF = (RectF) this.dimPaint2;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ((BoostsActivity) this.this$0).setDarkGradientLocation(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
                    invalidate();
                    super.draw(canvas);
                    break;
                default:
                    super.draw(canvas);
                    break;
            }
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            ImageReceiver photoImage;
            switch (this.$r8$classId) {
                case 3:
                    PaintView.AnonymousClass26 anonymousClass26 = (PaintView.AnonymousClass26) this.this$0;
                    if (view != anonymousClass26.textureView) {
                        return super.drawChild(canvas, view, j);
                    }
                    ChatMessageCell cell = anonymousClass26.getCell();
                    int i = 0;
                    if (cell == null || (photoImage = cell.getPhotoImage()) == null) {
                        return false;
                    }
                    Matrix matrix = (Matrix) this.shadowPaint;
                    matrix.reset();
                    float fMax = Math.max(photoImage.getImageWidth() / anonymousClass26.videoWidth, photoImage.getImageHeight() / anonymousClass26.videoHeight);
                    matrix.postScale((anonymousClass26.videoWidth / anonymousClass26.textureView.getWidth()) * fMax, (anonymousClass26.videoHeight / anonymousClass26.textureView.getHeight()) * fMax);
                    MessageEntityView.AnonymousClass2 anonymousClass2 = anonymousClass26.listView;
                    matrix.postTranslate((photoImage.getCenterX() + (cell.getX() + anonymousClass2.getX())) - ((anonymousClass26.videoWidth * fMax) / 2.0f), (photoImage.getCenterY() + (cell.getY() + anonymousClass2.getY())) - ((anonymousClass26.videoHeight * fMax) / 2.0f));
                    anonymousClass26.textureView.setTransform(matrix);
                    canvas.save();
                    Path path = (Path) this.dimPaint2;
                    path.rewind();
                    AndroidUtilities.rectTmp.set(photoImage.getImageX() + cell.getX() + anonymousClass2.getX(), photoImage.getImageY() + cell.getY() + anonymousClass2.getY(), photoImage.getImageX2() + cell.getX() + anonymousClass2.getX(), photoImage.getImageY2() + cell.getY() + anonymousClass2.getY());
                    while (true) {
                        int length = photoImage.getRoundRadius().length;
                        float[] fArr = (float[]) this.dimPaint;
                        if (i >= length) {
                            path.addRoundRect(AndroidUtilities.rectTmp, fArr, Path.Direction.CW);
                            canvas.clipPath(path);
                            boolean zDrawChild = super.drawChild(canvas, view, j);
                            canvas.restore();
                            return zDrawChild;
                        }
                        int i2 = i * 2;
                        fArr[i2] = photoImage.getRoundRadius()[i];
                        fArr[i2 + 1] = photoImage.getRoundRadius()[i];
                        i++;
                    }
                    break;
                case 6:
                    boolean zDrawChild2 = super.drawChild(canvas, view, j);
                    CountrySelectBottomSheet countrySelectBottomSheet = (CountrySelectBottomSheet) this.this$0;
                    int i3 = (int) countrySelectBottomSheet.animatorSelectorContainerHeight.factor;
                    if (view == countrySelectBottomSheet.spansContainer && i3 > 0) {
                        int iDp = AndroidUtilities.dp(40.0f);
                        int width = getWidth();
                        int iDp2 = AndroidUtilities.dp(48.0f);
                        GradientProtectionDrawable gradientProtectionDrawable = (GradientProtectionDrawable) this.shadowPaint;
                        gradientProtectionDrawable.setBounds(0, iDp, width, iDp2);
                        int i4 = Theme.key_dialogBackground;
                        Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.dimPaint2;
                        gradientProtectionDrawable.setColor(Theme.getColor(i4, resourcesProvider));
                        gradientProtectionDrawable.draw(canvas);
                        int iDp3 = AndroidUtilities.dp(48.0f) + i3;
                        int iDp4 = iDp3 - AndroidUtilities.dp(8.0f);
                        int width2 = getWidth();
                        GradientProtectionDrawable gradientProtectionDrawable2 = (GradientProtectionDrawable) this.dimPaint;
                        gradientProtectionDrawable2.setBounds(0, iDp4, width2, iDp3);
                        gradientProtectionDrawable2.setColor(Theme.getColor(i4, resourcesProvider));
                        gradientProtectionDrawable2.draw(canvas);
                    }
                    return zDrawChild2;
                default:
                    return super.drawChild(canvas, view, j);
            }
        }

        @Override
        public void invalidate() {
            switch (this.$r8$classId) {
                case 7:
                    ValueAnimator valueAnimator = ((StoryRecorder) this.this$0).openCloseAnimator;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        super.invalidate();
                    }
                    break;
                default:
                    super.invalidate();
                    break;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 2:
                    RectF rectF = (RectF) this.this$0;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    float[] fArr = (float[]) this.dimPaint2;
                    fArr[3] = 0.0f;
                    fArr[2] = 0.0f;
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                    float fDp = AndroidUtilities.dp(4.0f);
                    fArr[7] = fDp;
                    fArr[6] = fDp;
                    fArr[5] = fDp;
                    fArr[4] = fDp;
                    Path path = (Path) this.dimPaint;
                    path.reset();
                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                    path.close();
                    Paint paint = (Paint) this.shadowPaint;
                    paint.setColor(2130706432);
                    canvas.drawPath(path, paint);
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int left;
            int boundsRight;
            switch (this.$r8$classId) {
                case 3:
                    PaintView.AnonymousClass26 anonymousClass26 = (PaintView.AnonymousClass26) this.this$0;
                    int measuredWidth = anonymousClass26.listView.getMeasuredWidth();
                    int iMax = 0;
                    for (int i5 = 0; i5 < anonymousClass26.listView.getChildCount(); i5++) {
                        View childAt = anonymousClass26.listView.getChildAt(i5);
                        int left2 = childAt.getLeft();
                        int right = childAt.getRight();
                        if (childAt instanceof ChatMessageCell) {
                            ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                            left2 = childAt.getLeft() + chatMessageCell.getBoundsLeft();
                            left = childAt.getLeft();
                            boundsRight = chatMessageCell.getBoundsRight();
                        } else {
                            if (childAt instanceof ChatActionCell) {
                                ChatActionCell chatActionCell = (ChatActionCell) childAt;
                                left2 = childAt.getLeft() + chatActionCell.getBoundsLeft();
                                left = childAt.getLeft();
                                boundsRight = chatActionCell.getBoundsRight();
                            }
                            measuredWidth = Math.min(left2, measuredWidth);
                            iMax = Math.max(right, iMax);
                        }
                        right = boundsRight + left;
                        measuredWidth = Math.min(left2, measuredWidth);
                        iMax = Math.max(right, iMax);
                    }
                    MessageEntityView.AnonymousClass2 anonymousClass2 = anonymousClass26.listView;
                    anonymousClass2.layout(-measuredWidth, 0, anonymousClass2.getMeasuredWidth() - measuredWidth, anonymousClass26.listView.getMeasuredHeight());
                    TextureView textureView = anonymousClass26.textureView;
                    if (textureView != null) {
                        textureView.layout(0, 0, getMeasuredWidth(), anonymousClass26.listView.getMeasuredHeight());
                    }
                    break;
                case 4:
                    if (getChildCount() == 2) {
                        View childAt2 = getChildAt(0);
                        View childAt3 = getChildAt(1);
                        int measuredWidth2 = childAt2.getMeasuredWidth();
                        int i6 = i4 - i2;
                        childAt2.layout(0, 0, measuredWidth2, i6);
                        childAt3.layout(measuredWidth2, 0, i3 - i, i6);
                    } else {
                        super.onLayout(z, i, i2, i3, i4);
                    }
                    break;
                case 5:
                case 6:
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    break;
                case 7:
                    super.onLayout(z, i, i2, i3, i4);
                    if (Build.VERSION.SDK_INT >= 29) {
                        int i7 = i3 - i;
                        int i8 = i4 - i2;
                        int iDp = i8 - AndroidUtilities.dp(120.0f);
                        int iDp2 = AndroidUtilities.dp(40.0f);
                        Rect rect = (Rect) this.shadowPaint;
                        rect.set(0, iDp, iDp2, i8);
                        int iDp3 = i7 - AndroidUtilities.dp(40.0f);
                        int iDp4 = i8 - AndroidUtilities.dp(120.0f);
                        Rect rect2 = (Rect) this.dimPaint;
                        rect2.set(iDp3, iDp4, i7, i8);
                        setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
                    }
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            int left;
            int boundsRight;
            switch (this.$r8$classId) {
                case 3:
                    PaintView.AnonymousClass26 anonymousClass26 = (PaintView.AnonymousClass26) this.this$0;
                    anonymousClass26.listView.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                    TextureView textureView = anonymousClass26.textureView;
                    if (textureView != null) {
                        textureView.measure(View.MeasureSpec.makeMeasureSpec(anonymousClass26.listView.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(anonymousClass26.listView.getMeasuredHeight(), 1073741824));
                    }
                    int measuredWidth = anonymousClass26.listView.getMeasuredWidth();
                    int iMax = 0;
                    for (int i3 = 0; i3 < anonymousClass26.listView.getChildCount(); i3++) {
                        View childAt = anonymousClass26.listView.getChildAt(i3);
                        int left2 = childAt.getLeft();
                        int right = childAt.getRight();
                        if (childAt instanceof ChatMessageCell) {
                            ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                            left2 = childAt.getLeft() + chatMessageCell.getBoundsLeft();
                            left = childAt.getLeft();
                            boundsRight = chatMessageCell.getBoundsRight();
                        } else {
                            if (childAt instanceof ChatActionCell) {
                                ChatActionCell chatActionCell = (ChatActionCell) childAt;
                                left2 = childAt.getLeft() + chatActionCell.getBoundsLeft();
                                left = childAt.getLeft();
                                boundsRight = chatActionCell.getBoundsRight();
                            }
                            measuredWidth = Math.min(left2, measuredWidth);
                            iMax = Math.max(right, iMax);
                        }
                        right = boundsRight + left;
                        measuredWidth = Math.min(left2, measuredWidth);
                        iMax = Math.max(right, iMax);
                    }
                    setMeasuredDimension(iMax - measuredWidth, anonymousClass26.listView.getMeasuredHeight());
                    break;
                case 4:
                    if (getChildCount() == 2) {
                        int size = View.MeasureSpec.getSize(i);
                        int size2 = View.MeasureSpec.getSize(i2);
                        LimitPreviewView limitPreviewView = (LimitPreviewView) this.this$0;
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                        DialogsActivity.AnonymousClass52 anonymousClass52 = limitPreviewView.defaultLayout;
                        anonymousClass52.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        int measuredWidth2 = anonymousClass52.getMeasuredWidth();
                        int iDp = AndroidUtilities.dp(24.0f);
                        AnimatedTextView animatedTextView = limitPreviewView.defaultText;
                        int measuredWidth3 = animatedTextView.getMeasuredWidth() + iDp;
                        TextView textView = limitPreviewView.defaultCount;
                        int iMax2 = Math.max(measuredWidth2, measuredWidth3 + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() + AndroidUtilities.dp(24.0f) : 0));
                        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                        DialogsActivity.AnonymousClass52 anonymousClass53 = limitPreviewView.premiumLayout;
                        anonymousClass53.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                        boolean z = limitPreviewView.isBoostsStyle;
                        AnimatedTextView animatedTextView2 = limitPreviewView.premiumCount;
                        if (z) {
                            float f = limitPreviewView.percent;
                            Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.dimPaint2;
                            if (f == 0.0f) {
                                limitPreviewView.width1 = 0;
                                if (!limitPreviewView.animateArrowFadeIn && !limitPreviewView.animateArrowFadeOut) {
                                    animatedTextView2.setTextColor((!limitPreviewView.isRatingNegative && limitPreviewView.darkGradientProvider == null) ? Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider) : -1);
                                    animatedTextView.setTextColor(limitPreviewView.darkGradientProvider == null ? Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider) : -1);
                                }
                            } else if (f < 1.0f) {
                                float measuredWidth4 = limitPreviewView.isRatingNegative ? 0.0f : anonymousClass52.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                                limitPreviewView.width1 = (int) ((((size - measuredWidth4) - (limitPreviewView.isRatingNegative ? 0.0f : anonymousClass53.getMeasuredWidth() - AndroidUtilities.dp(8.0f))) * limitPreviewView.percent) + measuredWidth4);
                                if (!limitPreviewView.animateArrowFadeIn && !limitPreviewView.animateArrowFadeOut) {
                                    animatedTextView2.setTextColor((!limitPreviewView.isRatingNegative && limitPreviewView.darkGradientProvider == null) ? Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider) : -1);
                                    animatedTextView.setTextColor(-1);
                                }
                            } else {
                                limitPreviewView.width1 = size;
                                if (!limitPreviewView.animateArrowFadeIn && !limitPreviewView.animateArrowFadeOut) {
                                    animatedTextView2.setTextColor(-1);
                                    animatedTextView.setTextColor(-1);
                                }
                            }
                        } else {
                            int iClamp = (int) Utilities.clamp(size * limitPreviewView.percent, size - Math.max(anonymousClass53.getMeasuredWidth(), (limitPreviewView.premiumText.getMeasuredWidth() + AndroidUtilities.dp(24.0f)) + (animatedTextView2.getVisibility() == 0 ? animatedTextView2.getMeasuredWidth() + AndroidUtilities.dp(24.0f) : 0)), iMax2);
                            limitPreviewView.width1 = iClamp;
                            anonymousClass52.measure(View.MeasureSpec.makeMeasureSpec(iClamp, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                            anonymousClass53.measure(View.MeasureSpec.makeMeasureSpec(size - limitPreviewView.width1, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                        }
                        setMeasuredDimension(size, size2);
                    } else {
                        super.onMeasure(i, i2);
                    }
                    break;
                case 5:
                case 6:
                default:
                    super.onMeasure(i, i2);
                    break;
                case 7:
                    super.onMeasure(i, i2);
                    StoryRecorder storyRecorder = (StoryRecorder) this.this$0;
                    PhotoFilterCurvesControl photoFilterCurvesControl = storyRecorder.photoFilterViewCurvesControl;
                    if (photoFilterCurvesControl != null) {
                        float measuredWidth5 = photoFilterCurvesControl.getMeasuredWidth();
                        float measuredHeight = storyRecorder.photoFilterViewCurvesControl.getMeasuredHeight();
                        RectOld rectOld = photoFilterCurvesControl.actualArea;
                        rectOld.x = 0.0f;
                        rectOld.y = 0.0f;
                        rectOld.width = measuredWidth5;
                        rectOld.height = measuredHeight;
                    }
                    PhotoFilterBlurControl photoFilterBlurControl = storyRecorder.photoFilterViewBlurControl;
                    if (photoFilterBlurControl != null) {
                        float measuredWidth6 = photoFilterBlurControl.getMeasuredWidth();
                        float measuredHeight2 = storyRecorder.photoFilterViewBlurControl.getMeasuredHeight();
                        Size size3 = photoFilterBlurControl.actualAreaSize;
                        size3.width = measuredWidth6;
                        size3.height = measuredHeight2;
                    }
                    break;
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 7:
                    ?? r0 = ((StoryRecorder) this.this$0).previewTouchable;
                    if (r0 == 0) {
                        return super.onTouchEvent(motionEvent);
                    }
                    r0.onTouch(motionEvent);
                    return true;
                default:
                    return super.onTouchEvent(motionEvent);
            }
        }

        public AnonymousClass14(Context context, Theme.ResourcesProvider resourcesProvider, CountrySelectBottomSheet countrySelectBottomSheet) {
            super(context);
            this.this$0 = countrySelectBottomSheet;
            this.dimPaint2 = resourcesProvider;
            this.shadowPaint = new GradientProtectionDrawable(2);
            this.dimPaint = new GradientProtectionDrawable(8);
        }

        public AnonymousClass14(BoostsActivity boostsActivity, Context context) {
            super(context);
            this.this$0 = boostsActivity;
            this.dimPaint2 = new RectF();
            setWillNotDraw(false);
            View imageView = new ImageView(context);
            this.shadowPaint = imageView;
            TextView textView = new TextView(context);
            this.dimPaint = textView;
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 12.0f);
            addView(imageView, LayoutHelper.createFrame(-2, -2, 1));
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
            setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            setMinimumWidth(AndroidUtilities.dp(100.0f));
            int iDp = AndroidUtilities.dp(10.0f);
            int alphaComponent = ColorUtils.setAlphaComponent(-16777216, 80);
            setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, alphaComponent, alphaComponent));
        }

        public AnonymousClass14(LimitPreviewView limitPreviewView, Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.this$0 = limitPreviewView;
            this.dimPaint2 = resourcesProvider;
            this.shadowPaint = new Paint();
            Paint paint = new Paint();
            this.dimPaint = paint;
            paint.setColor(-1);
        }

        public AnonymousClass14(LimitReachedBottomSheet.BoostFeatureCell boostFeatureCell, Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.this$0 = boostFeatureCell;
            this.dimPaint2 = resourcesProvider;
            this.dimPaint = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, resourcesProvider);
            Paint paint = new Paint(1);
            this.shadowPaint = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(1.0f);
        }

        public AnonymousClass14(PaintView.AnonymousClass26 anonymousClass26, Context context) {
            super(context);
            this.this$0 = anonymousClass26;
            this.shadowPaint = new Matrix();
            this.dimPaint = new float[8];
            this.dimPaint2 = new Path();
        }

        public AnonymousClass14(StoryRecorder storyRecorder, Activity activity) {
            super(activity);
            this.this$0 = storyRecorder;
            this.shadowPaint = new Rect();
            this.dimPaint = new Rect();
        }

        public AnonymousClass14(ThemePreviewActivity themePreviewActivity, Activity activity) {
            super(activity);
            this.this$0 = themePreviewActivity;
            this.shadowPaint = new Paint(1);
            this.dimPaint = new Paint(1);
            this.dimPaint2 = new Paint(1);
        }
    }

    public final class AnonymousClass13 extends FrameLayout {
        public final int $r8$classId = 1;
        public Object colorFilter;
        public Object gradient;
        public int gradientHeight;
        public final Object gradientPaint;
        public Object this$0;
        public boolean val$drawShadow;

        public AnonymousClass13(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.gradientHeight = AndroidUtilities.dp(64.0f);
            BackupImageView backupImageView = new BackupImageView(context);
            this.gradient = backupImageView;
            backupImageView.setAspectFit(true);
            backupImageView.setRoundRadius(AndroidUtilities.dp(12.0f));
            addView(backupImageView, LayoutHelper.createFrame(-1.0f, -1));
            RadialProgress2 radialProgress2 = new RadialProgress2(resourcesProvider, this);
            this.gradientPaint = radialProgress2;
            radialProgress2.overrideAlpha = 0.0f;
            radialProgress2.setIcon(10, false, false);
            radialProgress2.setColors(1107296256, 1107296256, -1, -1);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            Object obj = this.gradientPaint;
            float f = 1.0f;
            final int i = 1;
            final int i2 = 0;
            switch (this.$r8$classId) {
                case 0:
                    if (this.val$drawShadow) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                        ThemePreviewActivity themePreviewActivity = (ThemePreviewActivity) this.this$0;
                        Theme.applyServiceShaderMatrixForView(this, themePreviewActivity.backgroundImage, themePreviewActivity.themeDelegate);
                        Paint paint = themePreviewActivity.themeDelegate.getPaint("paintChatActionBackground");
                        ColorFilter colorFilter = paint.getColorFilter();
                        paint.setColorFilter((ColorMatrixColorFilter) this.colorFilter);
                        BackgroundView backgroundView = themePreviewActivity.backgroundImage;
                        if (backgroundView != null && (backgroundView.getBackground() instanceof MotionBackgroundDrawable) && themePreviewActivity.currentIntensity < 0.0f) {
                            f = 0.33f;
                        }
                        int alpha = paint.getAlpha();
                        paint.setAlpha((int) (alpha * f));
                        canvas.drawRect(rectF, paint);
                        paint.setAlpha(alpha);
                        paint.setColorFilter(colorFilter);
                        if (themePreviewActivity.shouldShowBrightnessControll) {
                            float f2 = themePreviewActivity.dimAmount;
                            if (f2 > 0.0f) {
                                canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, (int) (f2 * 255.0f * themePreviewActivity.progressToDarkTheme)));
                            }
                        }
                        canvas.save();
                        Paint paint2 = (Paint) obj;
                        if (((LinearGradient) this.gradient) == null || this.gradientHeight != getHeight()) {
                            int height = getHeight();
                            this.gradientHeight = height;
                            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, height, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            this.gradient = linearGradient;
                            paint2.setShader(linearGradient);
                        }
                        canvas.drawRect(rectF, paint2);
                        canvas.restore();
                        canvas.restore();
                    }
                    super.dispatchDraw(canvas);
                    break;
                default:
                    super.dispatchDraw(canvas);
                    if (this.val$drawShadow) {
                        Drawable drawable = ((BackupImageView) this.gradient).getImageReceiver().getDrawable();
                        RadialProgress2 radialProgress2 = (RadialProgress2) obj;
                        if ((drawable instanceof AnimatedFileDrawable) && ((AnimatedFileDrawable) drawable).metaData[4] > 0) {
                            ValueAnimator valueAnimator = (ValueAnimator) this.this$0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                if ((radialProgress2.drawMiniIcon ? radialProgress2.miniMediaActionDrawable : radialProgress2.mediaActionDrawable).downloadProgress < 1.0f) {
                                    radialProgress2.setProgress(1.0f, true);
                                }
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((Float) ((ValueAnimator) this.this$0).getAnimatedValue()).floatValue(), 0.0f);
                                this.colorFilter = valueAnimatorOfFloat;
                                valueAnimatorOfFloat.addListener(new ArticleViewer.AnonymousClass25(this, 6));
                                ((ValueAnimator) this.colorFilter).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                    public final ThemePreviewActivity.AnonymousClass13 f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                        switch (i2) {
                                            case 0:
                                                this.f$0.invalidate();
                                                break;
                                            default:
                                                this.f$0.invalidate();
                                                break;
                                        }
                                    }
                                });
                                ((ValueAnimator) this.colorFilter).setDuration(250L);
                                ((ValueAnimator) this.colorFilter).start();
                            } else {
                                this.val$drawShadow = false;
                            }
                        } else if (((ValueAnimator) this.this$0) == null) {
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.this$0 = valueAnimatorOfFloat2;
                            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ThemePreviewActivity.AnonymousClass13 f$0;

                                {
                                    this.f$0 = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (i) {
                                        case 0:
                                            this.f$0.invalidate();
                                            break;
                                        default:
                                            this.f$0.invalidate();
                                            break;
                                    }
                                }
                            });
                            ((ValueAnimator) this.this$0).setStartDelay(250L);
                            ((ValueAnimator) this.this$0).setDuration(250L);
                            ((ValueAnimator) this.this$0).start();
                        }
                        ValueAnimator valueAnimator2 = (ValueAnimator) this.colorFilter;
                        if (valueAnimator2 == null) {
                            ValueAnimator valueAnimator3 = (ValueAnimator) this.this$0;
                            if (valueAnimator3 != null) {
                                radialProgress2.overrideAlpha = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                radialProgress2.draw(canvas);
                            }
                        } else {
                            radialProgress2.overrideAlpha = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            radialProgress2.draw(canvas);
                        }
                    }
                    break;
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 1:
                    super.onLayout(z, i, i2, i3, i4);
                    int width = getWidth() / 2;
                    int height = getHeight() / 2;
                    int i5 = this.gradientHeight;
                    ((RadialProgress2) this.gradientPaint).setProgressRect(width - i5, height - i5, width + i5, height + i5);
                    break;
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    super.onMeasure(i, i2);
                    for (int i3 = 0; i3 < getChildCount(); i3++) {
                        View childAt = getChildAt(i3);
                        if (childAt.getMeasuredWidth() > AndroidUtilities.dp(420.0f)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(420.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                        }
                    }
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        public AnonymousClass13(ThemePreviewActivity themePreviewActivity, Context context, boolean z) {
            super(context);
            this.this$0 = themePreviewActivity;
            this.val$drawShadow = z;
            Paint paint = new Paint(3);
            this.gradientPaint = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            ColorMatrix colorMatrix = new ColorMatrix();
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.4f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.65f);
            this.colorFilter = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public ThemePreviewActivity(boolean z, Object obj, Bitmap bitmap) {
        super(null);
        this.themeDelegate = new AnonymousClass1();
        this.useDefaultThemeForButtons = true;
        this.colorType = 1;
        Theme.AnonymousClass12 anonymousClass12 = new Theme.AnonymousClass12(this, 0, false);
        this.msgOutDrawable = anonymousClass12;
        Theme.AnonymousClass12 anonymousClass13 = new Theme.AnonymousClass12(this, 0, true);
        this.msgOutDrawableSelected = anonymousClass13;
        Theme.AnonymousClass12 anonymousClass14 = new Theme.AnonymousClass12(this, 1, false);
        this.msgOutMediaDrawable = anonymousClass14;
        Theme.AnonymousClass12 anonymousClass15 = new Theme.AnonymousClass12(this, 1, true);
        this.msgOutMediaDrawableSelected = anonymousClass15;
        this.lastPickedColorNum = -1;
        this.applyColorAction = new ThemePreviewActivity$$ExternalSyntheticLambda0(this, 0);
        this.backgroundImages = new BackgroundView[2];
        this.patternLayout = new FrameLayout[2];
        this.patternsCancelButton = new TextView[2];
        this.patternsSaveButton = new TextView[2];
        this.patternsButtonsContainer = new FrameLayout[2];
        this.patternsDict = new HashMap();
        this.currentIntensity = 0.5f;
        this.dimAmount = 0.0f;
        this.blendMode = PorterDuff.Mode.SRC_IN;
        this.parallaxScale = 1.0f;
        this.imageFilter = "640_360";
        this.maxWallpaperSize = 1920;
        this.self = true;
        this.gestureDetector2 = new GestureDetector2(getParentActivity(), new PhotoViewer.AnonymousClass24(this, 8));
        this.checkingBoostsLevel = false;
        this.checkedBoostsLevel = false;
        this.screenType = 2;
        this.currentWallpaper = obj;
        this.currentWallpaperBitmap = bitmap;
        this.rotatePreview = z;
        if (obj instanceof WallpapersListActivity.ColorWallpaper) {
            WallpapersListActivity.ColorWallpaper colorWallpaper = (WallpapersListActivity.ColorWallpaper) obj;
            this.isMotion = colorWallpaper.motion;
            TLRPC.TL_wallPaper tL_wallPaper = colorWallpaper.pattern;
            this.selectedPattern = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f = colorWallpaper.intensity;
                this.currentIntensity = f;
                if (f < 0.0f && !Theme.currentTheme.isDark()) {
                    this.currentIntensity *= -1.0f;
                }
            }
        }
        anonymousClass12.themePreview = true;
        anonymousClass14.themePreview = true;
        anonymousClass13.themePreview = true;
        anonymousClass15.themePreview = true;
    }

    public ThemePreviewActivity(Theme.ThemeInfo themeInfo) {
        this(themeInfo, false, 0, false, false);
    }
}
