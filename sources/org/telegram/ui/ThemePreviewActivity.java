package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
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
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.exoplayer2.util.Consumer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
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
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.MenuDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.PatternCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.ColorPicker;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.GestureDetector2;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SeekBarView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.WallpaperCheckBoxView;
import org.telegram.ui.Components.WallpaperParallaxEffect;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.Stories.recorder.SliderView;

public class ThemePreviewActivity extends BaseFragment implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    private int TAG;
    private Theme.ThemeAccent accent;
    private ActionBar actionBar2;
    private HintView animationHint;
    private BlurButton applyButton1;
    private BlurButton applyButton2;
    private Runnable applyColorAction;
    private boolean applyColorScheduled;
    private Theme.ThemeInfo applyingTheme;
    private FrameLayout backgroundButtonsContainer;
    private WallpaperCheckBoxView[] backgroundCheckBoxView;
    private int backgroundColor;
    private int backgroundGradientColor1;
    private int backgroundGradientColor2;
    private int backgroundGradientColor3;
    private BackgroundGradientDrawable.Disposable backgroundGradientDisposable;
    private BackgroundView backgroundImage;
    private BackgroundView[] backgroundImages;
    private ImageView backgroundPlayAnimationImageView;
    private FrameLayout backgroundPlayAnimationView;
    private AnimatorSet backgroundPlayViewAnimator;
    private int backgroundRotation;
    private int backupAccentColor;
    private int backupAccentColor2;
    private long backupBackgroundGradientOverrideColor1;
    private long backupBackgroundGradientOverrideColor2;
    private long backupBackgroundGradientOverrideColor3;
    private long backupBackgroundOverrideColor;
    private int backupBackgroundRotation;
    private float backupIntensity;
    private int backupMyMessagesAccentColor;
    private boolean backupMyMessagesAnimated;
    private int backupMyMessagesGradientAccentColor1;
    private int backupMyMessagesGradientAccentColor2;
    private int backupMyMessagesGradientAccentColor3;
    private String backupSlug;
    private final PorterDuff.Mode blendMode;
    private Bitmap blurredBitmap;
    private BitmapDrawable blurredDrawable;
    public TL_stories.TL_premium_boostsStatus boostsStatus;
    private FrameLayout bottomOverlayChat;
    private TextView cancelButton;
    private View changeDayNightView;
    private ValueAnimator changeDayNightViewAnimator;
    private ValueAnimator changeDayNightViewAnimator2;
    private float changeDayNightViewProgress;
    private int checkColor;
    private boolean checkedBoostsLevel;
    private boolean checkingBoostsLevel;
    private ColorPicker colorPicker;
    private int colorType;
    float croppedWidth;
    private float currentIntensity;
    float currentScrollOffset;
    private Object currentWallpaper;
    private Bitmap currentWallpaperBitmap;
    private ActionBarMenuItem dayNightItem;
    float defaultScrollOffset;
    private WallpaperActivityDelegate delegate;
    private boolean deleteOnCancel;
    long dialogId;
    private DialogsAdapter dialogsAdapter;
    private float dimAmount;
    private SliderView dimmingSlider;
    private FrameLayout dimmingSliderContainer;
    private TextView doneButton;
    private View dotsContainer;
    private TextView dropDown;
    private ActionBarMenuItem dropDownContainer;
    private boolean editingTheme;
    private FragmentFloatingButton floatingButton;
    private FrameLayout frameLayout;
    GestureDetector2 gestureDetector2;
    private boolean hasScrollingBackground;
    private String imageFilter;
    private HeaderCell intensityCell;
    private SeekBarView intensitySeekBar;
    private boolean isBlurred;
    private boolean isMotion;
    private WeakReference lastDrawableToBlur;
    private int lastPickedColor;
    private int lastPickedColorNum;
    private TLRPC.TL_wallPaper lastSelectedPattern;
    private int lastSizeHash;
    private RecyclerListView listView;
    private RecyclerListView listView2;
    private String loadingFile;
    private File loadingFileObject;
    private TLRPC.PhotoSize loadingSize;
    private ColoredImageSpan lockSpan;
    float maxScrollOffset;
    private int maxWallpaperSize;
    private MessagesAdapter messagesAdapter;
    private FrameLayout messagesButtonsContainer;
    private WallpaperCheckBoxView[] messagesCheckBoxView;
    private ImageView messagesPlayAnimationImageView;
    private FrameLayout messagesPlayAnimationView;
    private AnimatorSet messagesPlayViewAnimator;
    private AnimatorSet motionAnimation;
    org.telegram.ui.ActionBar.MessageDrawable msgOutDrawable;
    org.telegram.ui.ActionBar.MessageDrawable msgOutDrawableSelected;
    org.telegram.ui.ActionBar.MessageDrawable msgOutMediaDrawable;
    org.telegram.ui.ActionBar.MessageDrawable msgOutMediaDrawableSelected;
    private boolean nightTheme;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    DayNightSwitchDelegate onSwitchDayNightDelegate;
    private Bitmap originalBitmap;
    private FrameLayout page1;
    private FrameLayout page2;
    private WallpaperParallaxEffect parallaxEffect;
    private float parallaxScale;
    private int patternColor;
    private FrameLayout[] patternLayout;
    private TextView patternTitleView;
    private AnimatorSet patternViewAnimation;
    private ArrayList patterns;
    private PatternsAdapter patternsAdapter;
    private FrameLayout[] patternsButtonsContainer;
    private TextView[] patternsCancelButton;
    private HashMap patternsDict;
    private LinearLayoutManager patternsLayoutManager;
    private RecyclerListView patternsListView;
    private TextView[] patternsSaveButton;
    private int previousBackgroundColor;
    private int previousBackgroundGradientColor1;
    private int previousBackgroundGradientColor2;
    private int previousBackgroundGradientColor3;
    private int previousBackgroundRotation;
    private float previousIntensity;
    private TLRPC.TL_wallPaper previousSelectedPattern;
    private float progressToDarkTheme;
    private boolean progressVisible;
    private boolean removeBackgroundOverride;
    private boolean rotatePreview;
    private FrameLayout saveButtonsContainer;
    private ActionBarMenuItem saveItem;
    private final int screenType;
    private Scroller scroller;
    private TLRPC.TL_wallPaper selectedPattern;
    boolean self;
    MessageObject serverWallpaper;
    private boolean setupFinished;
    private Drawable sheetDrawable;
    private boolean shouldShowBrightnessControll;
    private boolean shouldShowDayNightIcon;
    private boolean showColor;
    private RLottieDrawable sunDrawable;
    public final ThemeDelegate themeDelegate;
    private List themeDescriptions;
    private UndoView undoView;
    public boolean useDefaultThemeForButtons;
    private ValueAnimator valueAnimator;
    private ViewPager viewPager;
    private boolean wasScroll;
    private long watchForKeyboardEndTime;

    public interface DayNightSwitchDelegate {
        boolean isDark();

        boolean supportsAnimation();

        void switchDayNight(boolean z);
    }

    public interface WallpaperActivityDelegate {
        void didSetNewBackground(TLRPC.WallPaper wallPaper);
    }

    public static void m4678$r8$lambda$2i4CDrimH8j2VLE_CYXrB74oqk() {
    }

    public static void $r8$lambda$6v2qeXkA9uQMHaheGToXZeLTfTQ(View view, int i) {
    }

    public static boolean $r8$lambda$hgI32JY_2MnOr_EA_PQkThVFdaQ(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public void onProgressDownload(String str, long j, long j2) {
    }

    @Override
    public void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    @Override
    public void setResourceProvider(Theme.ResourcesProvider resourcesProvider) {
        this.themeDelegate.parentProvider = resourcesProvider;
    }

    @Override
    public Theme.ResourcesProvider getResourceProvider() {
        return this.themeDelegate;
    }

    public static void $r8$lambda$hCJ3QFgQflxazbFgeA72bxQNWtY(ThemePreviewActivity themePreviewActivity) {
        themePreviewActivity.applyColorScheduled = false;
        themePreviewActivity.applyColor(themePreviewActivity.lastPickedColor, themePreviewActivity.lastPickedColorNum);
        themePreviewActivity.lastPickedColorNum = -1;
    }

    private void checkBoostsLevel() {
        if (this.dialogId >= 0 || this.checkingBoostsLevel || this.checkedBoostsLevel || this.boostsStatus != null) {
            return;
        }
        this.checkingBoostsLevel = true;
        getMessagesController().getBoostsController().getBoostsStats(this.dialogId, new Consumer() {
            @Override
            public final void accept(Object obj) {
                ThemePreviewActivity.m4687$r8$lambda$ujzXCAm4yqYVDw_aFmuwwQB6eU(this.f$0, (TL_stories.TL_premium_boostsStatus) obj);
            }
        });
    }

    public static void m4687$r8$lambda$ujzXCAm4yqYVDw_aFmuwwQB6eU(ThemePreviewActivity themePreviewActivity, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        themePreviewActivity.boostsStatus = tL_premium_boostsStatus;
        themePreviewActivity.checkedBoostsLevel = true;
        themePreviewActivity.updateApplyButton1(true);
        themePreviewActivity.checkingBoostsLevel = false;
    }

    public static void showFor(final ChatActivity chatActivity, MessageObject messageObject) {
        Object obj;
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
            TLRPC.WallPaper wallPaper = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
            if (wallPaper.pattern || wallPaper.document == null) {
                String str = wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                int i = wallPaperSettings.background_color;
                int i2 = wallPaperSettings.second_background_color;
                int i3 = wallPaperSettings.third_background_color;
                int i4 = wallPaperSettings.fourth_background_color;
                int wallpaperRotation = AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false);
                TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper.settings;
                WallpapersListActivity.ColorWallpaper colorWallpaper = new WallpapersListActivity.ColorWallpaper(str, i, i2, i3, i4, wallpaperRotation, wallPaperSettings2.intensity / 100.0f, wallPaperSettings2.motion, null);
                if (wallPaper instanceof TLRPC.TL_wallPaper) {
                    colorWallpaper.pattern = (TLRPC.TL_wallPaper) wallPaper;
                }
                obj = colorWallpaper;
            } else {
                obj = wallPaper;
            }
            final boolean zIsDark = Theme.getActiveTheme().isDark();
            ThemePreviewActivity themePreviewActivity = new ThemePreviewActivity(obj, null, true, false) {
                @Override
                public void onFragmentClosed() {
                    super.onFragmentClosed();
                    ChatActivity.ThemeDelegate themeDelegate = chatActivity.themeDelegate;
                    themeDelegate.setCurrentTheme(themeDelegate.getCurrentTheme(), chatActivity.themeDelegate.getCurrentWallpaper(), false, Boolean.valueOf(zIsDark));
                }
            };
            TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper.settings;
            if (wallPaperSettings3 != null) {
                themePreviewActivity.setInitialModes(wallPaperSettings3.blur, wallPaperSettings3.motion, wallPaperSettings3.intensity / 100.0f);
            }
            themePreviewActivity.setCurrentServerWallpaper(messageObject);
            themePreviewActivity.setDialogId(messageObject.getDialogId());
            themePreviewActivity.setResourceProvider(chatActivity.themeDelegate);
            themePreviewActivity.setOnSwitchDayNightDelegate(new DayNightSwitchDelegate(zIsDark, chatActivity) {
                boolean forceDark;
                final ChatActivity val$chatActivity;
                final boolean val$initialIsDark;

                @Override
                public boolean supportsAnimation() {
                    return true;
                }

                {
                    this.val$initialIsDark = zIsDark;
                    this.val$chatActivity = chatActivity;
                    this.forceDark = zIsDark;
                }

                @Override
                public boolean isDark() {
                    return this.forceDark;
                }

                @Override
                public void switchDayNight(boolean z) {
                    this.forceDark = !this.forceDark;
                    ChatActivity.ThemeDelegate themeDelegate = this.val$chatActivity.themeDelegate;
                    themeDelegate.setCurrentTheme(themeDelegate.getCurrentTheme(), this.val$chatActivity.themeDelegate.getCurrentWallpaper(), z, Boolean.valueOf(this.forceDark));
                }
            });
            chatActivity.presentFragment(themePreviewActivity);
        }
    }

    private void setCurrentServerWallpaper(MessageObject messageObject) {
        this.serverWallpaper = messageObject;
    }

    public void setDialogId(long j) {
        this.dialogId = j;
        this.self = j == 0 || j == getUserConfig().getClientUserId();
    }

    public void setOnSwitchDayNightDelegate(DayNightSwitchDelegate dayNightSwitchDelegate) {
        this.onSwitchDayNightDelegate = dayNightSwitchDelegate;
    }

    public ThemePreviewActivity(Object obj, Bitmap bitmap) {
        this(obj, bitmap, false, false);
    }

    public ThemePreviewActivity(Object obj, Bitmap bitmap, boolean z, boolean z2) {
        this.themeDelegate = new ThemeDelegate() {
            @Override
            public boolean isDark() {
                DayNightSwitchDelegate dayNightSwitchDelegate = ThemePreviewActivity.this.onSwitchDayNightDelegate;
                if (dayNightSwitchDelegate != null) {
                    return dayNightSwitchDelegate.isDark();
                }
                return super.isDark();
            }
        };
        this.useDefaultThemeForButtons = true;
        this.colorType = 1;
        this.msgOutDrawable = new MessageDrawable(0, true, false);
        this.msgOutDrawableSelected = new MessageDrawable(0, true, true);
        this.msgOutMediaDrawable = new MessageDrawable(1, true, false);
        this.msgOutMediaDrawableSelected = new MessageDrawable(1, true, true);
        this.lastPickedColorNum = -1;
        this.applyColorAction = new Runnable() {
            @Override
            public final void run() {
                ThemePreviewActivity.$r8$lambda$hCJ3QFgQflxazbFgeA72bxQNWtY(this.f$0);
            }
        };
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
        this.loadingFile = null;
        this.loadingFileObject = null;
        this.loadingSize = null;
        this.imageFilter = "640_360";
        this.maxWallpaperSize = 1920;
        this.self = true;
        this.gestureDetector2 = new GestureDetector2(getContext(), new GestureDetector2.OnGestureListener() {
            @Override
            public void onLongPress(MotionEvent motionEvent) {
            }

            @Override
            public void onShowPress(MotionEvent motionEvent) {
            }

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                return false;
            }

            @Override
            public void onUp(MotionEvent motionEvent) {
            }

            @Override
            public boolean onDown(MotionEvent motionEvent) {
                if (ThemePreviewActivity.this.scroller == null) {
                    return true;
                }
                ThemePreviewActivity.this.scroller.abortAnimation();
                return true;
            }

            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (ThemePreviewActivity.this.scroller != null) {
                    ThemePreviewActivity.this.scroller.abortAnimation();
                }
                ThemePreviewActivity themePreviewActivity = ThemePreviewActivity.this;
                themePreviewActivity.currentScrollOffset = Utilities.clamp(themePreviewActivity.currentScrollOffset + f, themePreviewActivity.maxScrollOffset, 0.0f);
                ThemePreviewActivity.this.invalidateBlur();
                ThemePreviewActivity.this.backgroundImage.invalidate();
                return true;
            }

            @Override
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (ThemePreviewActivity.this.scroller == null) {
                    return true;
                }
                ThemePreviewActivity.this.scroller.abortAnimation();
                ThemePreviewActivity.this.scroller.fling((int) ThemePreviewActivity.this.currentScrollOffset, 0, Math.round(-f), Math.round(f2), 0, (int) ThemePreviewActivity.this.maxScrollOffset, 0, Integer.MAX_VALUE);
                ThemePreviewActivity.this.backgroundImage.postInvalidate();
                return true;
            }
        });
        this.checkingBoostsLevel = false;
        this.checkedBoostsLevel = false;
        this.screenType = 2;
        this.showColor = z2;
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
                if (f < 0.0f && !Theme.getActiveTheme().isDark()) {
                    this.currentIntensity *= -1.0f;
                }
            }
        }
        this.msgOutDrawable.themePreview = true;
        this.msgOutMediaDrawable.themePreview = true;
        this.msgOutDrawableSelected.themePreview = true;
        this.msgOutMediaDrawableSelected.themePreview = true;
    }

    public ThemePreviewActivity(Theme.ThemeInfo themeInfo) {
        this(themeInfo, false, 0, false, false);
    }

    public ThemePreviewActivity(Theme.ThemeInfo themeInfo, boolean z, int i, boolean z2, boolean z3) {
        this.themeDelegate = new ThemeDelegate() {
            @Override
            public boolean isDark() {
                DayNightSwitchDelegate dayNightSwitchDelegate = ThemePreviewActivity.this.onSwitchDayNightDelegate;
                if (dayNightSwitchDelegate != null) {
                    return dayNightSwitchDelegate.isDark();
                }
                return super.isDark();
            }
        };
        this.useDefaultThemeForButtons = true;
        this.colorType = 1;
        this.msgOutDrawable = new MessageDrawable(0, true, false);
        this.msgOutDrawableSelected = new MessageDrawable(0, true, true);
        this.msgOutMediaDrawable = new MessageDrawable(1, true, false);
        this.msgOutMediaDrawableSelected = new MessageDrawable(1, true, true);
        this.lastPickedColorNum = -1;
        this.applyColorAction = new Runnable() {
            @Override
            public final void run() {
                ThemePreviewActivity.$r8$lambda$hCJ3QFgQflxazbFgeA72bxQNWtY(this.f$0);
            }
        };
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
        this.loadingFile = null;
        this.loadingFileObject = null;
        this.loadingSize = null;
        this.imageFilter = "640_360";
        this.maxWallpaperSize = 1920;
        this.self = true;
        this.gestureDetector2 = new GestureDetector2(getContext(), new GestureDetector2.OnGestureListener() {
            @Override
            public void onLongPress(MotionEvent motionEvent) {
            }

            @Override
            public void onShowPress(MotionEvent motionEvent) {
            }

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                return false;
            }

            @Override
            public void onUp(MotionEvent motionEvent) {
            }

            @Override
            public boolean onDown(MotionEvent motionEvent) {
                if (ThemePreviewActivity.this.scroller == null) {
                    return true;
                }
                ThemePreviewActivity.this.scroller.abortAnimation();
                return true;
            }

            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (ThemePreviewActivity.this.scroller != null) {
                    ThemePreviewActivity.this.scroller.abortAnimation();
                }
                ThemePreviewActivity themePreviewActivity = ThemePreviewActivity.this;
                themePreviewActivity.currentScrollOffset = Utilities.clamp(themePreviewActivity.currentScrollOffset + f, themePreviewActivity.maxScrollOffset, 0.0f);
                ThemePreviewActivity.this.invalidateBlur();
                ThemePreviewActivity.this.backgroundImage.invalidate();
                return true;
            }

            @Override
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (ThemePreviewActivity.this.scroller == null) {
                    return true;
                }
                ThemePreviewActivity.this.scroller.abortAnimation();
                ThemePreviewActivity.this.scroller.fling((int) ThemePreviewActivity.this.currentScrollOffset, 0, Math.round(-f), Math.round(f2), 0, (int) ThemePreviewActivity.this.maxScrollOffset, 0, Integer.MAX_VALUE);
                ThemePreviewActivity.this.backgroundImage.postInvalidate();
                return true;
            }
        });
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
            Theme.applyThemeTemporary(this.applyingTheme, true);
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.goingToPreviewTheme, new Object[0]);
        this.msgOutDrawable.themePreview = true;
        this.msgOutMediaDrawable.themePreview = true;
        this.msgOutDrawableSelected.themePreview = true;
        this.msgOutMediaDrawableSelected.themePreview = true;
    }

    public void setInitialModes(boolean z, boolean z2, float f) {
        this.isBlurred = z;
        this.isMotion = z2;
        this.dimAmount = f;
    }

    @Override
    public View createView(Context context) {
        boolean z;
        float f;
        CharSequence charSequence;
        String str;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        final Rect rect;
        TextPaint textPaint;
        Object obj;
        int i6;
        String[] strArr;
        int[] iArr;
        int iMax;
        final int i7;
        int i8;
        final int i9;
        int i10;
        FrameLayout.LayoutParams layoutParamsCreateFrame;
        float f3;
        int iDp;
        int i11;
        Theme.ThemeAccent themeAccent;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int[] iArr2;
        String[] strArr2;
        int i17;
        int iMax2;
        int i18;
        float f4;
        float f5;
        float f6;
        final int i19;
        boolean z2;
        int iDp2;
        FrameLayout.LayoutParams layoutParams;
        boolean z3;
        Theme.ThemeAccent themeAccent2;
        int iDp3;
        FrameLayout.LayoutParams layoutParams2;
        int i20;
        int i21;
        float f7;
        float f8;
        float f9;
        Integer num;
        int i22;
        DayNightSwitchDelegate dayNightSwitchDelegate;
        int i23;
        float f10;
        float f11;
        float f12;
        INavigationLayout iNavigationLayout;
        Theme.ThemeAccent themeAccent3;
        int i24;
        int i25;
        this.msgOutDrawable.setResourceProvider(getResourceProvider());
        this.msgOutDrawableSelected.setResourceProvider(getResourceProvider());
        this.msgOutMediaDrawable.setResourceProvider(getResourceProvider());
        this.msgOutMediaDrawableSelected.setResourceProvider(getResourceProvider());
        this.hasOwnBackground = true;
        DayNightSwitchDelegate dayNightSwitchDelegate2 = this.onSwitchDayNightDelegate;
        boolean z4 = (dayNightSwitchDelegate2 == null || this.dialogId == 0) ? false : true;
        this.shouldShowDayNightIcon = z4;
        if (z4) {
            Object obj2 = this.currentWallpaper;
            if (!(obj2 instanceof WallpapersListActivity.FileWallpaper)) {
                if (obj2 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
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
        if (iNavigationLayout2 != null && iNavigationLayout2.isLayersLayout()) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.page1 = new FrameLayout(context);
        if (this.shouldShowBrightnessControll && SharedConfig.dayNightWallpaperSwitchHint < 3) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ThemePreviewActivity.$r8$lambda$QL3hckfE11bflQFil0yLsG9XVgY(this.f$0);
                }
            }, 2000L);
        }
        this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public boolean canCollapseSearch() {
                return true;
            }

            @Override
            public void onSearchCollapse() {
            }

            @Override
            public void onSearchExpand() {
            }

            @Override
            public void onTextChanged(EditText editText) {
            }
        }).setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.actionBar.setBackButtonDrawable(new MenuDrawable());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ThemePreview));
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            protected void onMeasure(int i26, int i27) {
                int size = View.MeasureSpec.getSize(i26);
                int size2 = View.MeasureSpec.getSize(i27);
                setMeasuredDimension(size, size2);
                measureChildWithMargins(((BaseFragment) ThemePreviewActivity.this).actionBar, i26, 0, i27, 0);
                int measuredHeight = ((BaseFragment) ThemePreviewActivity.this).actionBar.getMeasuredHeight();
                if (((BaseFragment) ThemePreviewActivity.this).actionBar.getVisibility() == 0) {
                    size2 -= measuredHeight;
                }
                ((FrameLayout.LayoutParams) ThemePreviewActivity.this.listView.getLayoutParams()).topMargin = measuredHeight;
                ThemePreviewActivity.this.listView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                measureChildWithMargins(ThemePreviewActivity.this.floatingButton, i26, 0, i27, 0);
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                boolean zDrawChild = super.drawChild(canvas, view, j);
                if (view == ((BaseFragment) ThemePreviewActivity.this).actionBar && ((BaseFragment) ThemePreviewActivity.this).parentLayout != null) {
                    ((BaseFragment) ThemePreviewActivity.this).parentLayout.drawHeaderShadow(canvas, ((BaseFragment) ThemePreviewActivity.this).actionBar.getVisibility() == 0 ? ((BaseFragment) ThemePreviewActivity.this).actionBar.getMeasuredHeight() : 0);
                }
                return zDrawChild;
            }
        };
        this.page1 = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
        this.page1.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setVerticalScrollBarEnabled(true);
        this.listView.setItemAnimator(null);
        this.listView.setLayoutAnimation(null);
        this.listView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        this.listView.setPadding(0, 0, 0, AndroidUtilities.dp(this.screenType != 0 ? 12.0f : 0.0f));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i26) {
                ThemePreviewActivity.$r8$lambda$6v2qeXkA9uQMHaheGToXZeLTfTQ(view, i26);
            }
        });
        this.page1.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider);
        this.floatingButton = fragmentFloatingButton;
        fragmentFloatingButton.setImageResource(R.drawable.floating_pencil);
        this.page1.addView(this.floatingButton, FragmentFloatingButton.createDefaultLayoutParams());
        DialogsAdapter dialogsAdapter = new DialogsAdapter(context);
        this.dialogsAdapter = dialogsAdapter;
        this.listView.setAdapter(dialogsAdapter);
        this.page2 = new FrameLayout(context) {
            private boolean ignoreLayout;

            @Override
            protected void onMeasure(int i26, int i27) {
                float f13;
                AnonymousClass7 anonymousClass7 = this;
                int size = View.MeasureSpec.getSize(i26);
                int size2 = View.MeasureSpec.getSize(i27);
                anonymousClass7.setMeasuredDimension(size, size2);
                if (ThemePreviewActivity.this.dropDownContainer != null) {
                    anonymousClass7.ignoreLayout = true;
                    if (!AndroidUtilities.isTablet()) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ThemePreviewActivity.this.dropDownContainer.getLayoutParams();
                        layoutParams3.topMargin = AndroidUtilities.statusBarHeight;
                        ThemePreviewActivity.this.dropDownContainer.setLayoutParams(layoutParams3);
                    }
                    if (AndroidUtilities.isTablet() || ApplicationLoader.applicationContext.getResources().getConfiguration().orientation != 2) {
                        ThemePreviewActivity.this.dropDown.setTextSize(1, 20.0f);
                    } else {
                        ThemePreviewActivity.this.dropDown.setTextSize(1, 18.0f);
                    }
                    anonymousClass7.ignoreLayout = false;
                }
                anonymousClass7.measureChildWithMargins(ThemePreviewActivity.this.actionBar2, i26, 0, i27, 0);
                int measuredHeight = ThemePreviewActivity.this.actionBar2.getMeasuredHeight();
                if (ThemePreviewActivity.this.actionBar2.getVisibility() == 0) {
                    size2 -= measuredHeight;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ThemePreviewActivity.this.listView2.getLayoutParams();
                layoutParams4.topMargin = measuredHeight;
                if (ThemePreviewActivity.this.screenType == 2) {
                    RecyclerListView recyclerListView2 = ThemePreviewActivity.this.listView2;
                    int iDp4 = AndroidUtilities.dp(4.0f);
                    ThemePreviewActivity themePreviewActivity = ThemePreviewActivity.this;
                    recyclerListView2.setPadding(0, iDp4, 0, (AndroidUtilities.dp(((themePreviewActivity.self || themePreviewActivity.dialogId <= 0) ? 0 : 58) + 72) - 12) + (ThemePreviewActivity.this.insideBottomSheet() ? AndroidUtilities.navigationBarHeight : 0));
                }
                ThemePreviewActivity.this.listView2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - layoutParams4.bottomMargin, 1073741824));
                ((FrameLayout.LayoutParams) ThemePreviewActivity.this.backgroundImage.getLayoutParams()).topMargin = measuredHeight;
                ThemePreviewActivity.this.backgroundImage.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                if (ThemePreviewActivity.this.dimmingSliderContainer != null) {
                    ((FrameLayout.LayoutParams) ThemePreviewActivity.this.dimmingSliderContainer.getLayoutParams()).topMargin = measuredHeight;
                    ThemePreviewActivity.this.dimmingSliderContainer.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(222.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
                }
                if (ThemePreviewActivity.this.bottomOverlayChat != null) {
                    ThemePreviewActivity.this.bottomOverlayChat.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + (ThemePreviewActivity.this.insideBottomSheet() ? AndroidUtilities.navigationBarHeight : 0));
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ThemePreviewActivity.this.bottomOverlayChat.getLayoutParams();
                    ThemePreviewActivity themePreviewActivity2 = ThemePreviewActivity.this;
                    layoutParams5.height = AndroidUtilities.dp(72 + ((themePreviewActivity2.self || themePreviewActivity2.dialogId <= 0) ? 0 : 58)) + (ThemePreviewActivity.this.insideBottomSheet() ? AndroidUtilities.navigationBarHeight : 0);
                    anonymousClass7.measureChildWithMargins(ThemePreviewActivity.this.bottomOverlayChat, i26, 0, i27, 0);
                }
                if (ThemePreviewActivity.this.sheetDrawable != null) {
                    ThemePreviewActivity.this.sheetDrawable.getPadding(AndroidUtilities.rectTmp2);
                }
                int i28 = 0;
                while (i28 < ThemePreviewActivity.this.patternLayout.length) {
                    if (ThemePreviewActivity.this.patternLayout[i28] != null) {
                        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) ThemePreviewActivity.this.patternLayout[i28].getLayoutParams();
                        if (i28 == 0) {
                            f13 = ThemePreviewActivity.this.screenType == 2 ? 321 : 273;
                        } else {
                            f13 = 316.0f;
                        }
                        layoutParams6.height = AndroidUtilities.dp(f13);
                        if (ThemePreviewActivity.this.insideBottomSheet()) {
                            layoutParams6.height += AndroidUtilities.navigationBarHeight;
                        }
                        if (i28 == 0) {
                            layoutParams6.height += AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top;
                        }
                        ThemePreviewActivity.this.patternLayout[i28].setPadding(0, i28 == 0 ? AndroidUtilities.dp(12.0f) + AndroidUtilities.rectTmp2.top : 0, 0, ThemePreviewActivity.this.insideBottomSheet() ? AndroidUtilities.navigationBarHeight : 0);
                        anonymousClass7.measureChildWithMargins(ThemePreviewActivity.this.patternLayout[i28], i26, 0, i27, 0);
                    }
                    i28++;
                    anonymousClass7 = this;
                }
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                boolean zDrawChild = super.drawChild(canvas, view, j);
                if (view == ThemePreviewActivity.this.actionBar2 && ((BaseFragment) ThemePreviewActivity.this).parentLayout != null) {
                    ((BaseFragment) ThemePreviewActivity.this).parentLayout.drawHeaderShadow(canvas, ThemePreviewActivity.this.actionBar2.getVisibility() == 0 ? (int) (ThemePreviewActivity.this.actionBar2.getMeasuredHeight() + ThemePreviewActivity.this.actionBar2.getTranslationY()) : 0);
                }
                return zDrawChild;
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.messagesAdapter = new MessagesAdapter(context);
        this.actionBar2 = createActionBar(context);
        if (AndroidUtilities.isTablet()) {
            this.actionBar2.setOccupyStatusBar(false);
        }
        this.actionBar2.setBackButtonDrawable(new BackDrawable(false));
        this.actionBar2.setActionBarMenuOnItemClick(new AnonymousClass8());
        for (int i26 = 0; i26 < 2; i26++) {
            this.backgroundImages[i26] = new BackgroundView(getContext());
            this.page2.addView(this.backgroundImages[i26], LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        }
        BackgroundView backgroundView = this.backgroundImages[0];
        this.backgroundImage = backgroundView;
        backgroundView.setVisibility(0);
        this.backgroundImages[1].setVisibility(8);
        if (this.screenType == 2) {
            this.backgroundImage.getImageReceiver().setDelegate(new ImageReceiver.ImageReceiverDelegate() {
                @Override
                public final void didSetImage(ImageReceiver imageReceiver, boolean z5, boolean z6, boolean z7) {
                    ThemePreviewActivity.$r8$lambda$KRc6_gFlzwNQbkdyPLR7UMzAhJU(this.f$0, imageReceiver, z5, z6, z7);
                }

                @Override
                public void didSetImageBitmap(int i27, String str2, Drawable drawable) {
                    ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i27, str2, drawable);
                }

                @Override
                public void onAnimationReady(ImageReceiver imageReceiver) {
                    ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
                }
            });
        }
        if (this.messagesAdapter.showSecretMessages) {
            this.actionBar2.setTitle("Telegram Beta Chat");
            f = 4.0f;
            this.actionBar2.setSubtitle(LocaleController.formatPluralString("Members", 505, new Object[0]));
        } else {
            f = 4.0f;
            int i27 = this.screenType;
            if (i27 == 2) {
                if (this.dialogId != 0) {
                    this.actionBar2.setTitle(LocaleController.getString(R.string.WallpaperPreview));
                } else {
                    this.actionBar2.setTitle(LocaleController.getString(R.string.BackgroundPreview));
                }
                ActionBarMenu actionBarMenuCreateMenu = this.actionBar2.createMenu();
                Object obj3 = this.currentWallpaper;
                if ((obj3 instanceof WallpapersListActivity.FileWallpaper) && ((WallpapersListActivity.FileWallpaper) obj3).originalPath != null) {
                    actionBarMenuCreateMenu.addItem(7, R.drawable.msg_header_draw);
                }
                if (this.dialogId == 0) {
                    if (!BuildVars.DEBUG_PRIVATE_VERSION || Theme.getActiveTheme().getAccent(false) == null) {
                        Object obj4 = this.currentWallpaper;
                        if (((obj4 instanceof WallpapersListActivity.ColorWallpaper) && !"d".equals(((WallpapersListActivity.ColorWallpaper) obj4).slug)) || (this.currentWallpaper instanceof TLRPC.TL_wallPaper)) {
                            actionBarMenuCreateMenu.addItem(5, R.drawable.msg_header_share);
                        }
                    } else {
                        actionBarMenuCreateMenu.addItem(5, R.drawable.msg_header_share);
                    }
                }
                if (this.dialogId != 0 && this.shouldShowDayNightIcon) {
                    int i28 = R.raw.sun;
                    RLottieDrawable rLottieDrawable = new RLottieDrawable(i28, "" + i28, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
                    this.sunDrawable = rLottieDrawable;
                    this.dayNightItem = actionBarMenuCreateMenu.addItem(6, rLottieDrawable);
                    this.sunDrawable.setPlayInDirectionOfCustomEndFrame(true);
                    DayNightSwitchDelegate dayNightSwitchDelegate3 = this.onSwitchDayNightDelegate;
                    if (dayNightSwitchDelegate3 != null && !dayNightSwitchDelegate3.isDark()) {
                        this.sunDrawable.setCustomEndFrame(0);
                        this.sunDrawable.setCurrentFrame(0);
                    } else {
                        this.sunDrawable.setCurrentFrame(35);
                        this.sunDrawable.setCustomEndFrame(36);
                    }
                    this.sunDrawable.beginApplyLayerColors();
                    int color = Theme.getColor(Theme.key_chats_menuName);
                    this.sunDrawable.setLayerColor("Sunny", color);
                    this.sunDrawable.setLayerColor("Path 6", color);
                    this.sunDrawable.setLayerColor("Path", color);
                    this.sunDrawable.setLayerColor("Path 5", color);
                    this.sunDrawable.commitApplyLayerColors();
                }
            } else if (i27 != 1) {
                charSequence = "";
                str = "d";
                f2 = -2.0f;
                Theme.ThemeInfo themeInfo = this.applyingTheme;
                TLRPC.TL_theme tL_theme = themeInfo.info;
                String name = tL_theme != null ? tL_theme.title : themeInfo.getName();
                int iLastIndexOf = name.lastIndexOf(".attheme");
                if (iLastIndexOf >= 0) {
                    name = name.substring(0, iLastIndexOf);
                }
                this.actionBar2.setTitle(name);
                TLRPC.TL_theme tL_theme2 = this.applyingTheme.info;
                if (tL_theme2 != null && (i = tL_theme2.installs_count) > 0) {
                    this.actionBar2.setSubtitle(LocaleController.formatPluralString("ThemeInstallCount", i, new Object[0]));
                } else {
                    this.actionBar2.setSubtitle(LocaleController.formatDateOnline((System.currentTimeMillis() / 1000) - 3600, null));
                }
            } else {
                ActionBarMenu actionBarMenuCreateMenu2 = this.actionBar2.createMenu();
                this.saveItem = actionBarMenuCreateMenu2.addItem(4, LocaleController.getString(R.string.Save));
                charSequence = "";
                str = "d";
                f2 = -2.0f;
                ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, actionBarMenuCreateMenu2, 0, 0) {
                    @Override
                    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                        accessibilityNodeInfo.setText(ThemePreviewActivity.this.dropDown.getText());
                    }
                };
                this.dropDownContainer = actionBarMenuItem;
                actionBarMenuItem.setSubMenuOpenSide(1);
                this.dropDownContainer.addSubItem(2, LocaleController.getString(R.string.ColorPickerBackground));
                ActionBarMenuItem actionBarMenuItem2 = this.dropDownContainer;
                int i29 = R.string.ColorPickerMainColor;
                actionBarMenuItem2.addSubItem(1, LocaleController.getString(i29));
                this.dropDownContainer.addSubItem(3, LocaleController.getString(R.string.ColorPickerMyMessages));
                this.dropDownContainer.setAllowCloseAnimation(false);
                this.dropDownContainer.setForceSmoothKeyboard(true);
                this.actionBar2.addView(this.dropDownContainer, LayoutHelper.createFrame(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                this.dropDownContainer.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.dropDownContainer.toggleSubMenu();
                    }
                });
                TextView textView = new TextView(context);
                this.dropDown = textView;
                textView.setImportantForAccessibility(2);
                this.dropDown.setGravity(3);
                this.dropDown.setSingleLine(true);
                this.dropDown.setLines(1);
                this.dropDown.setMaxLines(1);
                this.dropDown.setEllipsize(TextUtils.TruncateAt.END);
                TextView textView2 = this.dropDown;
                int i30 = Theme.key_actionBarDefaultTitle;
                textView2.setTextColor(getThemedColor(i30));
                this.dropDown.setTypeface(AndroidUtilities.bold());
                this.dropDown.setText(LocaleController.getString(i29));
                Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
                drawableMutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i30), PorterDuff.Mode.MULTIPLY));
                this.dropDown.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableMutate, (Drawable) null);
                this.dropDown.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                this.dropDown.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                this.dropDownContainer.addView(this.dropDown, LayoutHelper.createFrame(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 1.0f));
            }
            this.listView2 = new RecyclerListView(context) {
                float lastX;
                float lastY;
                boolean scrollingBackground;
                float startX;
                float startY;

                @Override
                public boolean drawChild(Canvas canvas, View view, long j) {
                    RecyclerView.ViewHolder childViewHolder;
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    if (view instanceof ChatMessageCell) {
                        ChatMessageCell chatMessageCell = (ChatMessageCell) view;
                        chatMessageCell.getMessageObject();
                        ImageReceiver avatarImage = chatMessageCell.getAvatarImage();
                        if (avatarImage != null) {
                            int top = view.getTop();
                            if (chatMessageCell.isPinnedBottom() && (childViewHolder = ThemePreviewActivity.this.listView2.getChildViewHolder(view)) != null) {
                                if (ThemePreviewActivity.this.listView2.findViewHolderForAdapterPosition(childViewHolder.getAdapterPosition() - 1) != null) {
                                    avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                                    avatarImage.draw(canvas);
                                    return zDrawChild;
                                }
                            }
                            float translationX = chatMessageCell.getTranslationX();
                            int top2 = view.getTop() + chatMessageCell.getLayoutHeight();
                            int measuredHeight = ThemePreviewActivity.this.listView2.getMeasuredHeight() - ThemePreviewActivity.this.listView2.getPaddingBottom();
                            if (top2 > measuredHeight) {
                                top2 = measuredHeight;
                            }
                            if (chatMessageCell.isPinnedTop() && (childViewHolder = ThemePreviewActivity.this.listView2.getChildViewHolder(view)) != null) {
                                int i31 = 0;
                                while (i31 < 20) {
                                    i31++;
                                    RecyclerView.ViewHolder childViewHolder2 = ThemePreviewActivity.this.listView2.findViewHolderForAdapterPosition(childViewHolder2.getAdapterPosition() + 1);
                                    if (childViewHolder2 == null) {
                                        break;
                                    }
                                    top = childViewHolder2.itemView.getTop();
                                    if (top2 - AndroidUtilities.dp(48.0f) < childViewHolder2.itemView.getBottom()) {
                                        translationX = Math.min(childViewHolder2.itemView.getTranslationX(), translationX);
                                    }
                                    View view2 = childViewHolder2.itemView;
                                    if (!(view2 instanceof ChatMessageCell) || !((ChatMessageCell) view2).isPinnedTop()) {
                                        break;
                                    }
                                }
                            }
                            if (top2 - AndroidUtilities.dp(48.0f) < top) {
                                top2 = top + AndroidUtilities.dp(48.0f);
                            }
                            if (translationX != 0.0f) {
                                canvas.save();
                                canvas.translate(translationX, 0.0f);
                            }
                            avatarImage.setImageY(top2 - AndroidUtilities.dp(44.0f));
                            avatarImage.draw(canvas);
                            if (translationX != 0.0f) {
                                canvas.restore();
                            }
                        }
                    }
                    return zDrawChild;
                }

                @Override
                public void setTranslationY(float f13) {
                    super.setTranslationY(f13);
                    if (ThemePreviewActivity.this.backgroundCheckBoxView != null) {
                        for (int i31 = 0; i31 < ThemePreviewActivity.this.backgroundCheckBoxView.length; i31++) {
                            ThemePreviewActivity.this.backgroundCheckBoxView[i31].invalidate();
                        }
                    }
                    if (ThemePreviewActivity.this.messagesCheckBoxView != null) {
                        for (int i32 = 0; i32 < ThemePreviewActivity.this.messagesCheckBoxView.length; i32++) {
                            ThemePreviewActivity.this.messagesCheckBoxView[i32].invalidate();
                        }
                    }
                    if (ThemePreviewActivity.this.backgroundPlayAnimationView != null) {
                        ThemePreviewActivity.this.backgroundPlayAnimationView.invalidate();
                    }
                    if (ThemePreviewActivity.this.messagesPlayAnimationView != null) {
                        ThemePreviewActivity.this.messagesPlayAnimationView.invalidate();
                    }
                }

                @Override
                protected void onChildPressed(View view, float f13, float f14, boolean z5) {
                    if (z5 && (view instanceof ChatMessageCell) && !((ChatMessageCell) view).isInsideBackground(f13, f14)) {
                        return;
                    }
                    super.onChildPressed(view, f13, f14, z5);
                }

                @Override
                protected boolean allowSelectChildAtPosition(View view) {
                    RecyclerView.ViewHolder viewHolderFindContainingViewHolder = ThemePreviewActivity.this.listView2.findContainingViewHolder(view);
                    if (viewHolderFindContainingViewHolder == null || viewHolderFindContainingViewHolder.getItemViewType() != 2) {
                        return super.allowSelectChildAtPosition(view);
                    }
                    return false;
                }

                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    checkMotionEvent(motionEvent);
                    if (ThemePreviewActivity.this.hasScrollingBackground) {
                        if (motionEvent.getAction() == 0) {
                            float x = motionEvent.getX();
                            this.startX = x;
                            this.lastX = x;
                            float y = motionEvent.getY();
                            this.startY = y;
                            this.lastY = y;
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
                        ThemePreviewActivity.this.gestureDetector2.onTouchEvent(motionEvent);
                    }
                    return this.scrollingBackground || super.onTouchEvent(motionEvent);
                }

                private void checkMotionEvent(MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        if (!ThemePreviewActivity.this.wasScroll && (ThemePreviewActivity.this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) && ThemePreviewActivity.this.patternLayout[0].getVisibility() == 0) {
                            ThemePreviewActivity.this.showPatternsView(0, false, true);
                        }
                        ThemePreviewActivity.this.wasScroll = false;
                    }
                }

                @Override
                protected void onLayout(boolean z5, int i31, int i32, int i33, int i34) {
                    super.onLayout(z5, i31, i32, i33, i34);
                    ThemePreviewActivity.this.invalidateBlur();
                }
            };
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
                @Override
                protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    ThemePreviewActivity.this.listView2.invalidateViews();
                }
            };
            defaultItemAnimator.setDelayAnimations(false);
            this.listView2.setItemAnimator(defaultItemAnimator);
            this.listView2.setVerticalScrollBarEnabled(true);
            this.listView2.setOverScrollMode(2);
            i2 = this.screenType;
            if (i2 == 2) {
                RecyclerListView recyclerListView2 = this.listView2;
                int iDp4 = AndroidUtilities.dp(f);
                if (!this.self || this.dialogId <= 0) {
                    i24 = 0;
                } else {
                    i24 = 58;
                }
                int iDp5 = AndroidUtilities.dp(72 + i24) - 12;
                if (insideBottomSheet()) {
                    i25 = AndroidUtilities.navigationBarHeight;
                } else {
                    i25 = 0;
                }
                recyclerListView2.setPadding(0, iDp4, 0, iDp5 + i25);
            } else if (i2 == 1) {
                this.listView2.setPadding(0, AndroidUtilities.dp(f), 0, AndroidUtilities.dp(16.0f));
            } else {
                this.listView2.setPadding(0, AndroidUtilities.dp(f), 0, AndroidUtilities.dp(f));
            }
            this.listView2.setClipToPadding(false);
            this.listView2.setLayoutManager(new LinearLayoutManager(context, 1, true));
            RecyclerListView recyclerListView3 = this.listView2;
            if (LocaleController.isRTL) {
                i3 = 1;
            } else {
                i3 = 2;
            }
            recyclerListView3.setVerticalScrollbarPosition(i3);
            if (this.screenType == 1) {
                this.page2.addView(this.listView2, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 273.0f));
                this.listView2.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
                    @Override
                    public boolean hasDoubleTap(View view, int i31) {
                        return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i31);
                    }

                    @Override
                    public void onDoubleTap(View view, int i31, float f13, float f14) {
                        RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i31, f13, f14);
                    }

                    @Override
                    public final void onItemClick(View view, int i31, float f13, float f14) {
                        ThemePreviewActivity.m4689$r8$lambda$yUgoSDSIx920vGr5qa_ApbKjww(this.f$0, view, i31, f13, f14);
                    }
                });
                i4 = -1;
            } else {
                i4 = -1;
                this.page2.addView(this.listView2, LayoutHelper.createFrame(-1, -1, 51));
            }
            this.listView2.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i31, int i32) {
                    ThemePreviewActivity.this.listView2.invalidateViews();
                    ThemePreviewActivity.this.wasScroll = true;
                }

                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int i31) {
                    if (i31 == 0) {
                        ThemePreviewActivity.this.wasScroll = false;
                    }
                }
            });
            this.page2.addView(this.actionBar2, LayoutHelper.createFrame(i4, f2));
            WallpaperParallaxEffect wallpaperParallaxEffect = new WallpaperParallaxEffect(context);
            this.parallaxEffect = wallpaperParallaxEffect;
            wallpaperParallaxEffect.setCallback(new WallpaperParallaxEffect.Callback() {
                @Override
                public final void onOffsetsChanged(int i31, int i32, float f13) {
                    ThemePreviewActivity.$r8$lambda$8OgX8ATzZHWjtlgaHFfk3PpGc_g(this.f$0, i31, i32, f13);
                }
            });
            i5 = this.screenType;
            if (i5 != 1 || i5 == 2) {
                if (i5 == 2) {
                    final boolean zInsideBottomSheet = insideBottomSheet();
                    FrameLayout frameLayout2 = new FrameLayout(context) {
                        private final ColorFilter colorFilter;
                        private LinearGradient gradient;
                        private int gradientHeight;
                        private final Paint gradientPaint;

                        {
                            Paint paint = new Paint(3);
                            this.gradientPaint = paint;
                            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                            ColorMatrix colorMatrix = new ColorMatrix();
                            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.4f);
                            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.65f);
                            this.colorFilter = new ColorMatrixColorFilter(colorMatrix);
                        }

                        @Override
                        protected void dispatchDraw(Canvas canvas) {
                            Canvas canvas2;
                            if (zInsideBottomSheet) {
                                RectF rectF = AndroidUtilities.rectTmp;
                                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                                Theme.applyServiceShaderMatrixForView(this, ThemePreviewActivity.this.backgroundImage, ThemePreviewActivity.this.themeDelegate);
                                Paint paint = ThemePreviewActivity.this.themeDelegate.getPaint("paintChatActionBackground");
                                ColorFilter colorFilter = paint.getColorFilter();
                                paint.setColorFilter(this.colorFilter);
                                float f13 = 1.0f;
                                if (ThemePreviewActivity.this.backgroundImage != null && (ThemePreviewActivity.this.backgroundImage.getBackground() instanceof MotionBackgroundDrawable) && ThemePreviewActivity.this.currentIntensity < 0.0f) {
                                    f13 = 0.33f;
                                }
                                int alpha = paint.getAlpha();
                                paint.setAlpha((int) (alpha * f13));
                                canvas2.drawRect(rectF, paint);
                                paint.setAlpha(alpha);
                                paint.setColorFilter(colorFilter);
                                if (ThemePreviewActivity.this.shouldShowBrightnessControll && ThemePreviewActivity.this.dimAmount > 0.0f) {
                                    canvas2.drawColor(ColorUtils.setAlphaComponent(-16777216, (int) (ThemePreviewActivity.this.dimAmount * 255.0f * ThemePreviewActivity.this.progressToDarkTheme)));
                                }
                                canvas2.save();
                                if (this.gradient == null || this.gradientHeight != getHeight()) {
                                    int height = getHeight();
                                    this.gradientHeight = height;
                                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, height, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                                    this.gradient = linearGradient;
                                    this.gradientPaint.setShader(linearGradient);
                                }
                                canvas2.drawRect(rectF, this.gradientPaint);
                                canvas2.restore();
                                canvas2.restore();
                            } else {
                                canvas2 = canvas;
                            }
                            super.dispatchDraw(canvas2);
                        }

                        @Override
                        protected void onMeasure(int i31, int i32) {
                            super.onMeasure(i31, i32);
                            for (int i33 = 0; i33 < getChildCount(); i33++) {
                                View childAt = getChildAt(i33);
                                if (childAt.getMeasuredWidth() > AndroidUtilities.dp(420.0f)) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(420.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                                }
                            }
                        }
                    };
                    this.bottomOverlayChat = frameLayout2;
                    frameLayout2.setWillNotDraw(false);
                    FrameLayout frameLayout3 = this.bottomOverlayChat;
                    int iDp6 = AndroidUtilities.dp(12.0f);
                    int iDp7 = AndroidUtilities.dp(12.0f);
                    int iDp8 = AndroidUtilities.dp(12.0f);
                    int iDp9 = AndroidUtilities.dp(12.0f);
                    if (insideBottomSheet()) {
                        i22 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i22 = 0;
                    }
                    frameLayout3.setPadding(iDp6, iDp7, iDp8, iDp9 + i22);
                    this.page2.addView(this.bottomOverlayChat, LayoutHelper.createFrame(-1, 0, 81));
                    BlurButton blurButton = new BlurButton(context);
                    this.applyButton1 = blurButton;
                    ScaleStateListAnimator.apply(blurButton, 0.033f, 1.2f);
                    updateApplyButton1(false);
                    this.applyButton1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            this.f$0.applyWallpaperBackground(false);
                        }
                    });
                    if (this.dialogId <= 0 && !this.self && this.serverWallpaper == null) {
                        BlurButton blurButton2 = new BlurButton(context);
                        this.applyButton2 = blurButton2;
                        ScaleStateListAnimator.apply(blurButton2, 0.033f, 1.2f);
                        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.dialogId));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
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
                        this.applyButton2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                this.f$0.applyWallpaperBackground(true);
                            }
                        });
                        this.bottomOverlayChat.addView(this.applyButton1, LayoutHelper.createFrame(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 58.0f));
                        this.bottomOverlayChat.addView(this.applyButton2, LayoutHelper.createFrame(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                    } else {
                        this.bottomOverlayChat.addView(this.applyButton1, LayoutHelper.createFrame(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                    }
                    if (this.shouldShowBrightnessControll) {
                        FrameLayout frameLayout4 = new FrameLayout(getContext()) {
                            private final Paint shadowPaint = new Paint(1);
                            private final Paint dimPaint = new Paint(1);
                            private final Paint dimPaint2 = new Paint(1);

                            @Override
                            protected void dispatchDraw(Canvas canvas) {
                                RectF rectF = AndroidUtilities.rectTmp;
                                rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                                float fDp = AndroidUtilities.dp(8.0f);
                                this.shadowPaint.setColor(0);
                                this.shadowPaint.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33f), ColorUtils.setAlphaComponent(-16777216, (int) (ThemePreviewActivity.this.dimmingSlider.getAlpha() * 27.0f)));
                                canvas.drawRoundRect(rectF, fDp, fDp, this.shadowPaint);
                                Theme.applyServiceShaderMatrixForView(this, ThemePreviewActivity.this.backgroundImage, ThemePreviewActivity.this.themeDelegate);
                                Paint paint = ThemePreviewActivity.this.themeDelegate.getPaint("paintChatActionBackground");
                                int alpha = paint.getAlpha();
                                paint.setAlpha((int) (alpha * ThemePreviewActivity.this.dimmingSlider.getAlpha()));
                                canvas.drawRoundRect(rectF, fDp, fDp, paint);
                                paint.setAlpha(alpha);
                                if (ThemePreviewActivity.this.shouldShowBrightnessControll && ThemePreviewActivity.this.dimAmount > 0.0f) {
                                    this.dimPaint2.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (ThemePreviewActivity.this.dimAmount * 255.0f * ThemePreviewActivity.this.progressToDarkTheme)));
                                    canvas.drawRoundRect(rectF, fDp, fDp, this.dimPaint2);
                                }
                                this.dimPaint.setColor(520093695);
                                this.dimPaint.setAlpha((int) (ThemePreviewActivity.this.dimmingSlider.getAlpha() * 30.0f));
                                canvas.drawRoundRect(rectF, fDp, fDp, this.dimPaint);
                                super.dispatchDraw(canvas);
                            }
                        };
                        this.dimmingSliderContainer = frameLayout4;
                        frameLayout4.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                        this.page2.addView(this.dimmingSliderContainer, LayoutHelper.createFrame(222, 76, 49));
                        SliderView sliderView = new SliderView(getContext(), 3) {
                            @Override
                            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                                if (getParent() != null) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                return super.dispatchTouchEvent(motionEvent);
                            }
                        };
                        this.dimmingSlider = sliderView;
                        sliderView.setValue(this.dimAmount);
                        this.dimmingSlider.setMinMax(0.0f, 0.9f);
                        this.dimmingSlider.setOnValueChange(new Utilities.Callback() {
                            @Override
                            public final void run(Object obj5) {
                                ThemePreviewActivity.m4677$r8$lambda$1NbvpStwepfVDa_AAqQbAYfgNA(this.f$0, (Float) obj5);
                            }
                        });
                        this.dimmingSliderContainer.addView(this.dimmingSlider);
                        dayNightSwitchDelegate = this.onSwitchDayNightDelegate;
                        if (dayNightSwitchDelegate != null) {
                            SliderView sliderView2 = this.dimmingSlider;
                            if (dayNightSwitchDelegate.isDark()) {
                                i23 = 0;
                            } else {
                                i23 = 8;
                            }
                            sliderView2.setVisibility(i23);
                            SliderView sliderView3 = this.dimmingSlider;
                            if (this.onSwitchDayNightDelegate.isDark()) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            sliderView3.setAlpha(f10);
                            SliderView sliderView4 = this.dimmingSlider;
                            if (this.onSwitchDayNightDelegate.isDark()) {
                                f11 = this.dimAmount;
                            } else {
                                f11 = 0.0f;
                            }
                            sliderView4.setValue(f11);
                        }
                    }
                }
                rect = new Rect();
                Drawable drawableMutate2 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                this.sheetDrawable = drawableMutate2;
                drawableMutate2.getPadding(rect);
                this.sheetDrawable.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_windowBackgroundWhite), PorterDuff.Mode.MULTIPLY));
                textPaint = new TextPaint(1);
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                textPaint.setTypeface(AndroidUtilities.bold());
                obj = this.currentWallpaper;
                if (this.screenType != 1 || (obj instanceof WallpapersListActivity.ColorWallpaper)) {
                    if ((obj instanceof WallpapersListActivity.ColorWallpaper) || !str.equals(((WallpapersListActivity.ColorWallpaper) obj).slug)) {
                        i6 = 3;
                    } else {
                        i6 = 0;
                    }
                } else if ((obj instanceof WallpapersListActivity.FileWallpaper) && "t".equals(((WallpapersListActivity.FileWallpaper) obj).slug)) {
                    i6 = 0;
                } else {
                    i6 = 2;
                }
                strArr = new String[i6];
                iArr = new int[i6];
                this.backgroundCheckBoxView = new WallpaperCheckBoxView[i6];
                if (i6 != 0) {
                    this.backgroundButtonsContainer = new FrameLayout(context);
                    if (this.screenType != 1 || (this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper)) {
                        strArr[0] = LocaleController.getString(R.string.BackgroundColors);
                        strArr[1] = LocaleController.getString(R.string.BackgroundPattern);
                        strArr[2] = LocaleController.getString(R.string.BackgroundMotion);
                    } else {
                        strArr[0] = LocaleController.getString(R.string.BackgroundBlurred);
                        strArr[1] = LocaleController.getString(R.string.BackgroundMotion);
                    }
                    iMax = 0;
                    for (i20 = 0; i20 < i6; i20++) {
                        int iCeil = (int) Math.ceil(textPaint.measureText(strArr[i20]));
                        iArr[i20] = iCeil;
                        iMax = Math.max(iMax, iCeil);
                    }
                    FrameLayout frameLayout5 = new FrameLayout(context) {
                        private RectF rect = new RectF();

                        @Override
                        protected void onDraw(Canvas canvas) {
                            this.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                            Theme.applyServiceShaderMatrixForView(ThemePreviewActivity.this.backgroundPlayAnimationView, ThemePreviewActivity.this.backgroundImage, ThemePreviewActivity.this.themeDelegate);
                            canvas.drawRoundRect(this.rect, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ThemePreviewActivity.this.themeDelegate.getPaint("paintChatActionBackground"));
                            if (Theme.hasGradientService()) {
                                canvas.drawRoundRect(this.rect, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ThemePreviewActivity.this.themeDelegate.getPaint("paintChatActionBackgroundDarken"));
                            }
                        }
                    };
                    this.backgroundPlayAnimationView = frameLayout5;
                    frameLayout5.setWillNotDraw(false);
                    FrameLayout frameLayout6 = this.backgroundPlayAnimationView;
                    if (this.backgroundGradientColor1 != 0) {
                        i21 = 0;
                    } else {
                        i21 = 4;
                    }
                    frameLayout6.setVisibility(i21);
                    FrameLayout frameLayout7 = this.backgroundPlayAnimationView;
                    if (this.backgroundGradientColor1 != 0) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.1f;
                    }
                    frameLayout7.setScaleX(f7);
                    FrameLayout frameLayout8 = this.backgroundPlayAnimationView;
                    if (this.backgroundGradientColor1 != 0) {
                        f8 = 1.0f;
                    } else {
                        f8 = 0.1f;
                    }
                    frameLayout8.setScaleY(f8);
                    FrameLayout frameLayout9 = this.backgroundPlayAnimationView;
                    if (this.backgroundGradientColor1 != 0) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    frameLayout9.setAlpha(f9);
                    FrameLayout frameLayout10 = this.backgroundPlayAnimationView;
                    if (this.backgroundGradientColor1 != 0) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    frameLayout10.setTag(num);
                    this.backgroundButtonsContainer.addView(this.backgroundPlayAnimationView, LayoutHelper.createFrame(48, 48, 17));
                    this.backgroundPlayAnimationView.setOnClickListener(new View.OnClickListener() {
                        int rotation = 0;

                        @Override
                        public void onClick(View view) {
                            ThemePreviewActivity.this.backgroundPlayAnimationImageView.setRotation(this.rotation);
                            this.rotation -= 45;
                            ThemePreviewActivity.this.backgroundPlayAnimationImageView.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
                            if (ThemePreviewActivity.this.backgroundImages[0] != null) {
                                Drawable background = ThemePreviewActivity.this.backgroundImages[0].getBackground();
                                if (!(background instanceof MotionBackgroundDrawable)) {
                                    ThemePreviewActivity.this.onColorsRotate();
                                } else {
                                    ((MotionBackgroundDrawable) background).switchToNextPosition();
                                }
                            }
                            if (ThemePreviewActivity.this.backgroundImages[1] != null) {
                                Drawable background2 = ThemePreviewActivity.this.backgroundImages[1].getBackground();
                                if (background2 instanceof MotionBackgroundDrawable) {
                                    ((MotionBackgroundDrawable) background2).switchToNextPosition();
                                }
                            }
                        }
                    });
                    ImageView imageView = new ImageView(context);
                    this.backgroundPlayAnimationImageView = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    this.backgroundPlayAnimationImageView.setImageResource(R.drawable.bg_rotate_large);
                    this.backgroundPlayAnimationView.addView(this.backgroundPlayAnimationImageView, LayoutHelper.createFrame(-2, -2, 17));
                } else {
                    iMax = 0;
                }
                i7 = 0;
                while (i7 < i6) {
                    this.backgroundCheckBoxView[i7] = new WallpaperCheckBoxView(context, (this.screenType == 1 && !(this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper)) || i7 != 0, this.backgroundImage, this.themeDelegate);
                    this.backgroundCheckBoxView[i7].setBackgroundColor(this.backgroundColor);
                    this.backgroundCheckBoxView[i7].setText(strArr[i7], iArr[i7], iMax);
                    if (this.screenType == 1 && !(this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper)) {
                        this.backgroundCheckBoxView[i7].setChecked(i7 == 0 ? this.isBlurred : this.isMotion, false);
                    } else if (i7 == 1) {
                        WallpaperCheckBoxView wallpaperCheckBoxView = this.backgroundCheckBoxView[i7];
                        if (this.selectedPattern == null || !((themeAccent2 = this.accent) == null || TextUtils.isEmpty(themeAccent2.patternSlug))) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        wallpaperCheckBoxView.setChecked(z3, false);
                    } else if (i7 == 2) {
                        this.backgroundCheckBoxView[i7].setChecked(this.isMotion, false);
                    }
                    iDp3 = AndroidUtilities.dp(56.0f) + iMax;
                    layoutParams2 = new FrameLayout.LayoutParams(iDp3, -2);
                    layoutParams2.gravity = 17;
                    if (i6 == 3) {
                        if (i7 != 0 || i7 == 2) {
                            layoutParams2.leftMargin = (iDp3 / 2) + AndroidUtilities.dp(10.0f);
                        } else {
                            layoutParams2.rightMargin = (iDp3 / 2) + AndroidUtilities.dp(10.0f);
                        }
                    } else if (i7 == 1) {
                        layoutParams2.leftMargin = (iDp3 / 2) + AndroidUtilities.dp(10.0f);
                    } else {
                        layoutParams2.rightMargin = (iDp3 / 2) + AndroidUtilities.dp(10.0f);
                    }
                    this.backgroundButtonsContainer.addView(this.backgroundCheckBoxView[i7], layoutParams2);
                    final WallpaperCheckBoxView wallpaperCheckBoxView2 = this.backgroundCheckBoxView[i7];
                    wallpaperCheckBoxView2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            ThemePreviewActivity.$r8$lambda$gw7VHMT_d8xxvRDe8qqoA1688xs(this.f$0, i7, wallpaperCheckBoxView2, view);
                        }
                    });
                    if (i7 == 2) {
                        this.backgroundCheckBoxView[i7].setAlpha(0.0f);
                        this.backgroundCheckBoxView[i7].setVisibility(4);
                    }
                    i7++;
                }
                i8 = 1;
                if (this.screenType == 1) {
                    iArr2 = new int[2];
                    this.messagesCheckBoxView = new WallpaperCheckBoxView[2];
                    this.messagesButtonsContainer = new FrameLayout(context);
                    strArr2 = new String[]{LocaleController.getString(R.string.BackgroundAnimate), LocaleController.getString(R.string.BackgroundColors)};
                    i17 = 0;
                    iMax2 = 0;
                    for (i16 = 2; i17 < i16; i16 = 2) {
                        int iCeil2 = (int) Math.ceil(textPaint.measureText(strArr2[i17]));
                        iArr2[i17] = iCeil2;
                        iMax2 = Math.max(iMax2, iCeil2);
                        i17++;
                    }
                    if (this.accent != null) {
                        FrameLayout frameLayout11 = new FrameLayout(context) {
                            private RectF rect = new RectF();

                            @Override
                            protected void onDraw(Canvas canvas) {
                                this.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                                Theme.applyServiceShaderMatrixForView(ThemePreviewActivity.this.messagesPlayAnimationView, ThemePreviewActivity.this.backgroundImage, ThemePreviewActivity.this.themeDelegate);
                                canvas.drawRoundRect(this.rect, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ThemePreviewActivity.this.themeDelegate.getPaint("paintChatActionBackground"));
                                if (Theme.hasGradientService()) {
                                    canvas.drawRoundRect(this.rect, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ThemePreviewActivity.this.themeDelegate.getPaint("paintChatActionBackgroundDarken"));
                                }
                            }
                        };
                        this.messagesPlayAnimationView = frameLayout11;
                        frameLayout11.setWillNotDraw(false);
                        FrameLayout frameLayout12 = this.messagesPlayAnimationView;
                        if (this.accent.myMessagesGradientAccentColor1 != 0) {
                            i18 = 0;
                        } else {
                            i18 = 4;
                        }
                        frameLayout12.setVisibility(i18);
                        FrameLayout frameLayout13 = this.messagesPlayAnimationView;
                        if (this.accent.myMessagesGradientAccentColor1 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = 0.1f;
                        }
                        frameLayout13.setScaleX(f4);
                        FrameLayout frameLayout14 = this.messagesPlayAnimationView;
                        if (this.accent.myMessagesGradientAccentColor1 != 0) {
                            f5 = 1.0f;
                        } else {
                            f5 = 0.1f;
                        }
                        frameLayout14.setScaleY(f5);
                        FrameLayout frameLayout15 = this.messagesPlayAnimationView;
                        if (this.accent.myMessagesGradientAccentColor1 != 0) {
                            f6 = 1.0f;
                        } else {
                            f6 = 0.0f;
                        }
                        frameLayout15.setAlpha(f6);
                        this.messagesButtonsContainer.addView(this.messagesPlayAnimationView, LayoutHelper.createFrame(48, 48, 17));
                        this.messagesPlayAnimationView.setOnClickListener(new View.OnClickListener() {
                            int rotation = 0;

                            @Override
                            public void onClick(View view) {
                                ThemePreviewActivity.this.messagesPlayAnimationImageView.setRotation(this.rotation);
                                this.rotation -= 45;
                                ThemePreviewActivity.this.messagesPlayAnimationImageView.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
                                if (!ThemePreviewActivity.this.accent.myMessagesAnimated) {
                                    if (ThemePreviewActivity.this.accent.myMessagesGradientAccentColor3 != 0) {
                                        int i31 = ThemePreviewActivity.this.accent.myMessagesAccentColor != 0 ? ThemePreviewActivity.this.accent.myMessagesAccentColor : ThemePreviewActivity.this.accent.accentColor;
                                        ThemePreviewActivity.this.accent.myMessagesAccentColor = ThemePreviewActivity.this.accent.myMessagesGradientAccentColor1;
                                        ThemePreviewActivity.this.accent.myMessagesGradientAccentColor1 = ThemePreviewActivity.this.accent.myMessagesGradientAccentColor2;
                                        ThemePreviewActivity.this.accent.myMessagesGradientAccentColor2 = ThemePreviewActivity.this.accent.myMessagesGradientAccentColor3;
                                        ThemePreviewActivity.this.accent.myMessagesGradientAccentColor3 = i31;
                                    } else {
                                        int i32 = ThemePreviewActivity.this.accent.myMessagesAccentColor != 0 ? ThemePreviewActivity.this.accent.myMessagesAccentColor : ThemePreviewActivity.this.accent.accentColor;
                                        ThemePreviewActivity.this.accent.myMessagesAccentColor = ThemePreviewActivity.this.accent.myMessagesGradientAccentColor1;
                                        ThemePreviewActivity.this.accent.myMessagesGradientAccentColor1 = ThemePreviewActivity.this.accent.myMessagesGradientAccentColor2;
                                        ThemePreviewActivity.this.accent.myMessagesGradientAccentColor2 = i32;
                                    }
                                    ThemePreviewActivity.this.colorPicker.setColor(ThemePreviewActivity.this.accent.myMessagesGradientAccentColor3, 3);
                                    ThemePreviewActivity.this.colorPicker.setColor(ThemePreviewActivity.this.accent.myMessagesGradientAccentColor2, 2);
                                    ThemePreviewActivity.this.colorPicker.setColor(ThemePreviewActivity.this.accent.myMessagesGradientAccentColor1, 1);
                                    ThemePreviewActivity.this.colorPicker.setColor(ThemePreviewActivity.this.accent.myMessagesAccentColor != 0 ? ThemePreviewActivity.this.accent.myMessagesAccentColor : ThemePreviewActivity.this.accent.accentColor, 0);
                                    ThemePreviewActivity.this.messagesCheckBoxView[1].setColor(0, ThemePreviewActivity.this.accent.myMessagesAccentColor);
                                    ThemePreviewActivity.this.messagesCheckBoxView[1].setColor(1, ThemePreviewActivity.this.accent.myMessagesGradientAccentColor1);
                                    ThemePreviewActivity.this.messagesCheckBoxView[1].setColor(2, ThemePreviewActivity.this.accent.myMessagesGradientAccentColor2);
                                    ThemePreviewActivity.this.messagesCheckBoxView[1].setColor(3, ThemePreviewActivity.this.accent.myMessagesGradientAccentColor3);
                                    Theme.refreshThemeColors(true, true);
                                    ThemePreviewActivity.this.listView2.invalidateViews();
                                    return;
                                }
                                if (ThemePreviewActivity.this.msgOutDrawable.getMotionBackgroundDrawable() != null) {
                                    ThemePreviewActivity.this.msgOutDrawable.getMotionBackgroundDrawable().switchToNextPosition();
                                }
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        this.messagesPlayAnimationImageView = imageView2;
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        this.messagesPlayAnimationImageView.setImageResource(R.drawable.bg_rotate_large);
                        this.messagesPlayAnimationView.addView(this.messagesPlayAnimationImageView, LayoutHelper.createFrame(-2, -2, 17));
                        for (i19 = 0; i19 < 2; i19++) {
                            WallpaperCheckBoxView[] wallpaperCheckBoxViewArr = this.messagesCheckBoxView;
                            if (i19 == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            wallpaperCheckBoxViewArr[i19] = new WallpaperCheckBoxView(context, z2, this.backgroundImage, this.themeDelegate);
                            this.messagesCheckBoxView[i19].setText(strArr2[i19], iArr2[i19], iMax2);
                            if (i19 == 0) {
                                this.messagesCheckBoxView[i19].setChecked(this.accent.myMessagesAnimated, false);
                            }
                            iDp2 = AndroidUtilities.dp(56.0f) + iMax2;
                            layoutParams = new FrameLayout.LayoutParams(iDp2, -2);
                            layoutParams.gravity = 17;
                            if (i19 == 1) {
                                layoutParams.leftMargin = (iDp2 / 2) + AndroidUtilities.dp(10.0f);
                            } else {
                                layoutParams.rightMargin = (iDp2 / 2) + AndroidUtilities.dp(10.0f);
                            }
                            this.messagesButtonsContainer.addView(this.messagesCheckBoxView[i19], layoutParams);
                            final WallpaperCheckBoxView wallpaperCheckBoxView3 = this.messagesCheckBoxView[i19];
                            wallpaperCheckBoxView3.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    ThemePreviewActivity.$r8$lambda$g4zxTy8DWZDBESqlEGMhg5NKfYI(this.f$0, i19, wallpaperCheckBoxView3, view);
                                }
                            });
                        }
                    }
                    i8 = 1;
                }
                if (this.screenType != i8 || (this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper)) {
                    this.isBlurred = false;
                    for (i9 = 0; i9 < 2; i9++) {
                        this.patternLayout[i9] = new FrameLayout(context) {
                            @Override
                            public void onDraw(Canvas canvas) {
                                if (i9 == 0) {
                                    ThemePreviewActivity.this.sheetDrawable.setBounds(ThemePreviewActivity.this.colorPicker.getLeft() - rect.left, 0, ThemePreviewActivity.this.colorPicker.getRight() + rect.right, getMeasuredHeight());
                                } else {
                                    ThemePreviewActivity.this.sheetDrawable.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                                }
                                ThemePreviewActivity.this.sheetDrawable.draw(canvas);
                            }
                        };
                        if (i9 != 1 || this.screenType == 2) {
                            this.patternLayout[i9].setVisibility(4);
                        }
                        this.patternLayout[i9].setWillNotDraw(false);
                        if (this.screenType == 2) {
                            if (i9 == 0) {
                                i15 = 321;
                            } else {
                                i15 = 316;
                            }
                            layoutParamsCreateFrame = LayoutHelper.createFrame(-1, i15, 83);
                        } else {
                            if (i9 == 0) {
                                i10 = 273;
                            } else {
                                i10 = 316;
                            }
                            layoutParamsCreateFrame = LayoutHelper.createFrame(-1, i10, 83);
                        }
                        if (i9 == 0) {
                            if (this.screenType == 2) {
                                i14 = 321;
                            } else {
                                i14 = 273;
                            }
                            f3 = i14;
                        } else {
                            f3 = 316.0f;
                        }
                        layoutParamsCreateFrame.height = AndroidUtilities.dp(f3);
                        if (insideBottomSheet()) {
                            layoutParamsCreateFrame.height += AndroidUtilities.navigationBarHeight;
                        }
                        if (i9 == 0) {
                            Drawable drawable = this.sheetDrawable;
                            Rect rect2 = AndroidUtilities.rectTmp2;
                            drawable.getPadding(rect2);
                            layoutParamsCreateFrame.height += AndroidUtilities.dp(12.0f) + rect2.top;
                        }
                        FrameLayout frameLayout16 = this.patternLayout[i9];
                        if (i9 == 0) {
                            iDp = AndroidUtilities.dp(12.0f) + rect.top;
                        } else {
                            iDp = 0;
                        }
                        if (insideBottomSheet()) {
                            i11 = AndroidUtilities.navigationBarHeight;
                        } else {
                            i11 = 0;
                        }
                        frameLayout16.setPadding(0, iDp, 0, i11);
                        this.page2.addView(this.patternLayout[i9], layoutParamsCreateFrame);
                        if (i9 != 1 || this.screenType == 2) {
                            this.patternsButtonsContainer[i9] = new FrameLayout(context) {
                                Paint paint = new Paint();

                                @Override
                                public void onDraw(Canvas canvas) {
                                    int intrinsicHeight = Theme.chat_composeShadowDrawable.getIntrinsicHeight();
                                    Theme.chat_composeShadowDrawable.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                                    Theme.chat_composeShadowDrawable.draw(canvas);
                                    this.paint.setColor(ThemePreviewActivity.this.getThemedColor(Theme.key_chat_messagePanelBackground));
                                    canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), this.paint);
                                }
                            };
                            this.patternsButtonsContainer[i9].setWillNotDraw(false);
                            this.patternsButtonsContainer[i9].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                            this.patternsButtonsContainer[i9].setClickable(true);
                            this.patternLayout[i9].addView(this.patternsButtonsContainer[i9], LayoutHelper.createFrame(-1, 51, 80));
                            this.patternsCancelButton[i9] = new TextView(context);
                            this.patternsCancelButton[i9].setTextSize(1, 15.0f);
                            this.patternsCancelButton[i9].setTypeface(AndroidUtilities.bold());
                            TextView textView3 = this.patternsCancelButton[i9];
                            int i31 = Theme.key_chat_fieldOverlayText;
                            textView3.setTextColor(getThemedColor(i31));
                            this.patternsCancelButton[i9].setText(LocaleController.getString(R.string.Cancel));
                            this.patternsCancelButton[i9].setGravity(17);
                            this.patternsCancelButton[i9].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                            TextView textView4 = this.patternsCancelButton[i9];
                            int i32 = Theme.key_listSelector;
                            textView4.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i32), 0));
                            this.patternsButtonsContainer[i9].addView(this.patternsCancelButton[i9], LayoutHelper.createFrame(-2, -1, 51));
                            this.patternsCancelButton[i9].setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    ThemePreviewActivity.$r8$lambda$2_eHBBt6BCIuI7vPNNwgGWViXxk(this.f$0, i9, view);
                                }
                            });
                            this.patternsSaveButton[i9] = new TextView(context);
                            this.patternsSaveButton[i9].setTextSize(1, 15.0f);
                            this.patternsSaveButton[i9].setTypeface(AndroidUtilities.bold());
                            this.patternsSaveButton[i9].setTextColor(getThemedColor(i31));
                            this.patternsSaveButton[i9].setText(LocaleController.getString(R.string.ApplyTheme));
                            this.patternsSaveButton[i9].setGravity(17);
                            this.patternsSaveButton[i9].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                            this.patternsSaveButton[i9].setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i32), 0));
                            this.patternsButtonsContainer[i9].addView(this.patternsSaveButton[i9], LayoutHelper.createFrame(-2, -1, 53));
                            this.patternsSaveButton[i9].setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view) {
                                    ThemePreviewActivity.$r8$lambda$SYZDOhqtZEiS6wgO2ZfYZSofEVQ(this.f$0, i9, view);
                                }
                            });
                        }
                        if (i9 == 1) {
                            TextView textView5 = new TextView(context);
                            this.patternTitleView = textView5;
                            textView5.setLines(1);
                            this.patternTitleView.setSingleLine(true);
                            this.patternTitleView.setText(LocaleController.getString(R.string.BackgroundChoosePattern));
                            this.patternTitleView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                            this.patternTitleView.setTextSize(1, 20.0f);
                            this.patternTitleView.setTypeface(AndroidUtilities.bold());
                            this.patternTitleView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
                            this.patternTitleView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                            this.patternTitleView.setGravity(16);
                            this.patternLayout[i9].addView(this.patternTitleView, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                            RecyclerListView recyclerListView4 = new RecyclerListView(context) {
                                @Override
                                public boolean onTouchEvent(MotionEvent motionEvent) {
                                    if (motionEvent.getAction() == 0) {
                                        getParent().requestDisallowInterceptTouchEvent(true);
                                    }
                                    return super.onTouchEvent(motionEvent);
                                }
                            };
                            this.patternsListView = recyclerListView4;
                            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
                            this.patternsLayoutManager = linearLayoutManager;
                            recyclerListView4.setLayoutManager(linearLayoutManager);
                            RecyclerListView recyclerListView5 = this.patternsListView;
                            PatternsAdapter patternsAdapter = new PatternsAdapter(context);
                            this.patternsAdapter = patternsAdapter;
                            recyclerListView5.setAdapter(patternsAdapter);
                            this.patternsListView.addItemDecoration(new RecyclerView.ItemDecoration() {
                                @Override
                                public void getItemOffsets(Rect rect3, View view, RecyclerView recyclerView, RecyclerView.State state) {
                                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                                    rect3.left = AndroidUtilities.dp(12.0f);
                                    rect3.top = 0;
                                    rect3.bottom = 0;
                                    if (childAdapterPosition == state.getItemCount() - 1) {
                                        rect3.right = AndroidUtilities.dp(12.0f);
                                    }
                                }
                            });
                            this.patternLayout[i9].addView(this.patternsListView, LayoutHelper.createFrame(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                            this.patternsListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                                @Override
                                public final void onItemClick(View view, int i33) {
                                    ThemePreviewActivity.$r8$lambda$5Ocn8fX67CEAIw11qzaYjS5qRUs(this.f$0, view, i33);
                                }
                            });
                            HeaderCell headerCell = new HeaderCell(context);
                            this.intensityCell = headerCell;
                            headerCell.setText(LocaleController.getString(R.string.BackgroundIntensity));
                            this.patternLayout[i9].addView(this.intensityCell, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                            SeekBarView seekBarView = new SeekBarView(context, getResourceProvider()) {
                                @Override
                                public boolean onTouchEvent(MotionEvent motionEvent) {
                                    if (motionEvent.getAction() == 0) {
                                        getParent().requestDisallowInterceptTouchEvent(true);
                                    }
                                    return super.onTouchEvent(motionEvent);
                                }
                            };
                            this.intensitySeekBar = seekBarView;
                            seekBarView.setProgress(this.currentIntensity);
                            this.intensitySeekBar.setReportChanges(true);
                            this.intensitySeekBar.setDelegate(new SeekBarView.SeekBarViewDelegate() {
                                @Override
                                public CharSequence getContentDescription() {
                                    return SeekBarView.SeekBarViewDelegate.CC.$default$getContentDescription(this);
                                }

                                @Override
                                public int getStepsCount() {
                                    return SeekBarView.SeekBarViewDelegate.CC.$default$getStepsCount(this);
                                }

                                @Override
                                public boolean needVisuallyDivideSteps() {
                                    return SeekBarView.SeekBarViewDelegate.CC.$default$needVisuallyDivideSteps(this);
                                }

                                @Override
                                public void onSeekBarPressed(boolean z5) {
                                }

                                @Override
                                public void onSeekBarDrag(boolean z5, float f13) {
                                    ThemePreviewActivity.this.currentIntensity = f13;
                                    ThemePreviewActivity.this.updateIntensity();
                                }
                            });
                            this.patternLayout[i9].addView(this.intensitySeekBar, LayoutHelper.createFrame(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                        } else {
                            ColorPicker colorPicker = new ColorPicker(context, this.editingTheme, new AnonymousClass26());
                            this.colorPicker = colorPicker;
                            colorPicker.setResourcesProvider(getResourceProvider());
                            if (this.screenType == 1) {
                                this.patternLayout[i9].addView(this.colorPicker, LayoutHelper.createFrame(-1, -1, 1));
                                if (this.applyingTheme.isDark()) {
                                    this.colorPicker.setMinBrightness(0.2f);
                                } else {
                                    this.colorPicker.setMinBrightness(0.05f);
                                    this.colorPicker.setMaxBrightness(0.8f);
                                }
                                themeAccent = this.accent;
                                if (themeAccent != null) {
                                    if (themeAccent.accentColor2 != 0) {
                                        i12 = 2;
                                    } else {
                                        i12 = 1;
                                    }
                                    this.colorPicker.setType(1, hasChanges(1), 2, i12, false, 0, false);
                                    this.colorPicker.setColor(this.accent.accentColor, 0);
                                    i13 = this.accent.accentColor2;
                                    if (i13 != 0) {
                                        this.colorPicker.setColor(i13, 1);
                                    }
                                }
                            } else {
                                this.patternLayout[i9].addView(this.colorPicker, LayoutHelper.createFrame(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                            }
                        }
                    }
                }
                updateButtonState(false, false);
                if (!this.backgroundImage.getImageReceiver().hasBitmapImage()) {
                    this.page2.setBackgroundColor(-16777216);
                }
                if (this.screenType != 1 && !(this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper)) {
                    this.backgroundImage.getImageReceiver().setCrossfadeWithOldImage(true);
                }
            }
            this.listView2.setAdapter(this.messagesAdapter);
            FrameLayout frameLayout17 = new FrameLayout(context) {
                private int[] loc = new int[2];

                @Override
                public void invalidate() {
                    super.invalidate();
                    if (ThemePreviewActivity.this.page2 != null) {
                        ThemePreviewActivity.this.page2.invalidate();
                    }
                }

                @Override
                protected void onDraw(Canvas canvas) {
                    if (AndroidUtilities.usingHardwareInput) {
                        return;
                    }
                    getLocationInWindow(this.loc);
                    if (ThemePreviewActivity.this.actionBar2.getTranslationY() != this.loc[1]) {
                        ThemePreviewActivity.this.actionBar2.setTranslationY(-this.loc[1]);
                        ThemePreviewActivity.this.page2.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < ThemePreviewActivity.this.watchForKeyboardEndTime) {
                        invalidate();
                    }
                }
            };
            this.frameLayout = frameLayout17;
            frameLayout17.setWillNotDraw(false);
            FrameLayout frameLayout18 = this.frameLayout;
            this.fragmentView = frameLayout18;
            ViewTreeObserver viewTreeObserver = frameLayout18.getViewTreeObserver();
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() {
                @Override
                public final void onGlobalLayout() {
                    ThemePreviewActivity.m4686$r8$lambda$sflEnhuHtdEAXWIHmerLdo3NV4(this.f$0);
                }
            };
            this.onGlobalLayoutListener = onGlobalLayoutListener;
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            ViewPager viewPager = new ViewPager(context);
            this.viewPager = viewPager;
            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrollStateChanged(int i33) {
                }

                @Override
                public void onPageScrolled(int i33, float f13, int i34) {
                }

                @Override
                public void onPageSelected(int i33) {
                    ThemePreviewActivity.this.dotsContainer.invalidate();
                }
            });
            this.viewPager.setAdapter(new PagerAdapter() {
                @Override
                public int getItemPosition(Object obj5) {
                    return -1;
                }

                @Override
                public boolean isViewFromObject(View view, Object obj5) {
                    return obj5 == view;
                }

                @Override
                public int getCount() {
                    return ThemePreviewActivity.this.screenType != 0 ? 1 : 2;
                }

                @Override
                public Object instantiateItem(ViewGroup viewGroup, int i33) {
                    FrameLayout frameLayout19 = i33 == 0 ? ThemePreviewActivity.this.page2 : ThemePreviewActivity.this.page1;
                    viewGroup.addView(frameLayout19);
                    return frameLayout19;
                }

                @Override
                public void destroyItem(ViewGroup viewGroup, int i33, Object obj5) {
                    viewGroup.removeView((View) obj5);
                }
            });
            AndroidUtilities.setViewPagerEdgeEffectColor(this.viewPager, getThemedColor(Theme.key_actionBarDefault));
            FrameLayout frameLayout19 = this.frameLayout;
            ViewPager viewPager2 = this.viewPager;
            if (this.screenType == 0) {
                f12 = 48.0f;
            } else {
                f12 = 0.0f;
            }
            frameLayout19.addView(viewPager2, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, f12));
            UndoView undoView = new UndoView(context, this);
            this.undoView = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
            this.frameLayout.addView(this.undoView, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (this.screenType == 0) {
                View view = new View(context);
                view.setBackgroundColor(getThemedColor(Theme.key_dialogShadowLine));
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, 1, 83);
                layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
                this.frameLayout.addView(view, layoutParams3);
                FrameLayout frameLayout20 = new FrameLayout(context);
                this.saveButtonsContainer = frameLayout20;
                frameLayout20.setBackgroundColor(getButtonsColor(Theme.key_windowBackgroundWhite));
                this.frameLayout.addView(this.saveButtonsContainer, LayoutHelper.createFrame(-1, 48, 83));
                View view2 = new View(context) {
                    private Paint paint = new Paint(1);

                    @Override
                    protected void onDraw(Canvas canvas) {
                        int currentItem = ThemePreviewActivity.this.viewPager.getCurrentItem();
                        this.paint.setColor(ThemePreviewActivity.this.getButtonsColor(Theme.key_chat_fieldOverlayText));
                        int i33 = 0;
                        while (i33 < 2) {
                            this.paint.setAlpha(i33 == currentItem ? 255 : 127);
                            canvas.drawCircle(AndroidUtilities.dp((i33 * 15) + 3), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), this.paint);
                            i33++;
                        }
                    }
                };
                this.dotsContainer = view2;
                this.saveButtonsContainer.addView(view2, LayoutHelper.createFrame(22, 8, 17));
                TextView textView6 = new TextView(context);
                this.cancelButton = textView6;
                textView6.setTextSize(1, 14.0f);
                TextView textView7 = this.cancelButton;
                int i33 = Theme.key_chat_fieldOverlayText;
                textView7.setTextColor(getButtonsColor(i33));
                this.cancelButton.setGravity(17);
                this.cancelButton.setBackgroundDrawable(Theme.createSelectorDrawable(251658240, 0));
                this.cancelButton.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
                this.cancelButton.setText(LocaleController.getString(R.string.Cancel));
                this.cancelButton.setTypeface(AndroidUtilities.bold());
                this.saveButtonsContainer.addView(this.cancelButton, LayoutHelper.createFrame(-2, -1, 51));
                this.cancelButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        this.f$0.cancelThemeApply(false);
                    }
                });
                TextView textView8 = new TextView(context);
                this.doneButton = textView8;
                textView8.setTextSize(1, 14.0f);
                this.doneButton.setTextColor(getButtonsColor(i33));
                this.doneButton.setGravity(17);
                this.doneButton.setBackgroundDrawable(Theme.createSelectorDrawable(251658240, 0));
                this.doneButton.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
                this.doneButton.setText(LocaleController.getString(R.string.ApplyTheme));
                this.doneButton.setTypeface(AndroidUtilities.bold());
                this.saveButtonsContainer.addView(this.doneButton, LayoutHelper.createFrame(-2, -1, 53));
                this.doneButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        ThemePreviewActivity.$r8$lambda$c3RaOEckOO52UD_94oeXOrTSkGw(this.f$0, view3);
                    }
                });
            }
            if (this.screenType == 1 && !Theme.hasCustomWallpaper() && (themeAccent3 = this.accent) != null && themeAccent3.backgroundOverrideColor != 4294967296L) {
                selectColorType(2);
            }
            this.themeDescriptions = getThemeDescriptionsInternal();
            setCurrentImage(true);
            updatePlayAnimationView(false);
            if (this.showColor) {
                showPatternsView(0, true, false);
            }
            this.scroller = new Scroller(getContext());
            iNavigationLayout = this.parentLayout;
            if (iNavigationLayout != null && iNavigationLayout.getBottomSheet() != null) {
                this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(Theme.key_dialogBackground));
                if (this.screenType == 2 && this.dialogId != 0) {
                    this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            }
            return this.fragmentView;
        }
        charSequence = "";
        str = "d";
        f2 = -2.0f;
        this.listView2 = new RecyclerListView(context) {
            float lastX;
            float lastY;
            boolean scrollingBackground;
            float startX;
            float startY;

            @Override
            public boolean drawChild(Canvas canvas, View view3, long j) {
                RecyclerView.ViewHolder childViewHolder;
                boolean zDrawChild = super.drawChild(canvas, view3, j);
                if (view3 instanceof ChatMessageCell) {
                    ChatMessageCell chatMessageCell = (ChatMessageCell) view3;
                    chatMessageCell.getMessageObject();
                    ImageReceiver avatarImage = chatMessageCell.getAvatarImage();
                    if (avatarImage != null) {
                        int top = view3.getTop();
                        if (chatMessageCell.isPinnedBottom() && (childViewHolder = ThemePreviewActivity.this.listView2.getChildViewHolder(view3)) != null) {
                            if (ThemePreviewActivity.this.listView2.findViewHolderForAdapterPosition(childViewHolder.getAdapterPosition() - 1) != null) {
                                avatarImage.setImageY(-AndroidUtilities.dp(1000.0f));
                                avatarImage.draw(canvas);
                                return zDrawChild;
                            }
                        }
                        float translationX = chatMessageCell.getTranslationX();
                        int top2 = view3.getTop() + chatMessageCell.getLayoutHeight();
                        int measuredHeight = ThemePreviewActivity.this.listView2.getMeasuredHeight() - ThemePreviewActivity.this.listView2.getPaddingBottom();
                        if (top2 > measuredHeight) {
                            top2 = measuredHeight;
                        }
                        if (chatMessageCell.isPinnedTop() && (childViewHolder2 = ThemePreviewActivity.this.listView2.getChildViewHolder(view3)) != null) {
                            int i34 = 0;
                            while (i34 < 20) {
                                i34++;
                                RecyclerView.ViewHolder childViewHolder2 = ThemePreviewActivity.this.listView2.findViewHolderForAdapterPosition(childViewHolder2.getAdapterPosition() + 1);
                                if (childViewHolder2 == null) {
                                    break;
                                }
                                top = childViewHolder2.itemView.getTop();
                                if (top2 - AndroidUtilities.dp(48.0f) < childViewHolder2.itemView.getBottom()) {
                                    translationX = Math.min(childViewHolder2.itemView.getTranslationX(), translationX);
                                }
                                View view4 = childViewHolder2.itemView;
                                if (!(view4 instanceof ChatMessageCell) || !((ChatMessageCell) view4).isPinnedTop()) {
                                    break;
                                }
                            }
                        }
                        if (top2 - AndroidUtilities.dp(48.0f) < top) {
                            top2 = top + AndroidUtilities.dp(48.0f);
                        }
                        if (translationX != 0.0f) {
                            canvas.save();
                            canvas.translate(translationX, 0.0f);
                        }
                        avatarImage.setImageY(top2 - AndroidUtilities.dp(44.0f));
                        avatarImage.draw(canvas);
                        if (translationX != 0.0f) {
                            canvas.restore();
                        }
                    }
                }
                return zDrawChild;
            }

            @Override
            public void setTranslationY(float f13) {
                super.setTranslationY(f13);
                if (ThemePreviewActivity.this.backgroundCheckBoxView != null) {
                    for (int i34 = 0; i34 < ThemePreviewActivity.this.backgroundCheckBoxView.length; i34++) {
                        ThemePreviewActivity.this.backgroundCheckBoxView[i34].invalidate();
                    }
                }
                if (ThemePreviewActivity.this.messagesCheckBoxView != null) {
                    for (int i35 = 0; i35 < ThemePreviewActivity.this.messagesCheckBoxView.length; i35++) {
                        ThemePreviewActivity.this.messagesCheckBoxView[i35].invalidate();
                    }
                }
                if (ThemePreviewActivity.this.backgroundPlayAnimationView != null) {
                    ThemePreviewActivity.this.backgroundPlayAnimationView.invalidate();
                }
                if (ThemePreviewActivity.this.messagesPlayAnimationView != null) {
                    ThemePreviewActivity.this.messagesPlayAnimationView.invalidate();
                }
            }

            @Override
            protected void onChildPressed(View view3, float f13, float f14, boolean z5) {
                if (z5 && (view3 instanceof ChatMessageCell) && !((ChatMessageCell) view3).isInsideBackground(f13, f14)) {
                    return;
                }
                super.onChildPressed(view3, f13, f14, z5);
            }

            @Override
            protected boolean allowSelectChildAtPosition(View view3) {
                RecyclerView.ViewHolder viewHolderFindContainingViewHolder = ThemePreviewActivity.this.listView2.findContainingViewHolder(view3);
                if (viewHolderFindContainingViewHolder == null || viewHolderFindContainingViewHolder.getItemViewType() != 2) {
                    return super.allowSelectChildAtPosition(view3);
                }
                return false;
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                checkMotionEvent(motionEvent);
                if (ThemePreviewActivity.this.hasScrollingBackground) {
                    if (motionEvent.getAction() == 0) {
                        float x = motionEvent.getX();
                        this.startX = x;
                        this.lastX = x;
                        float y = motionEvent.getY();
                        this.startY = y;
                        this.lastY = y;
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
                    ThemePreviewActivity.this.gestureDetector2.onTouchEvent(motionEvent);
                }
                return this.scrollingBackground || super.onTouchEvent(motionEvent);
            }

            private void checkMotionEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    if (!ThemePreviewActivity.this.wasScroll && (ThemePreviewActivity.this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) && ThemePreviewActivity.this.patternLayout[0].getVisibility() == 0) {
                        ThemePreviewActivity.this.showPatternsView(0, false, true);
                    }
                    ThemePreviewActivity.this.wasScroll = false;
                }
            }

            @Override
            protected void onLayout(boolean z5, int i34, int i35, int i36, int i37) {
                super.onLayout(z5, i34, i35, i36, i37);
                ThemePreviewActivity.this.invalidateBlur();
            }
        };
        DefaultItemAnimator defaultItemAnimator2 = new DefaultItemAnimator() {
            @Override
            protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                ThemePreviewActivity.this.listView2.invalidateViews();
            }
        };
        defaultItemAnimator2.setDelayAnimations(false);
        this.listView2.setItemAnimator(defaultItemAnimator2);
        this.listView2.setVerticalScrollBarEnabled(true);
        this.listView2.setOverScrollMode(2);
        i2 = this.screenType;
        if (i2 == 2) {
            RecyclerListView recyclerListView6 = this.listView2;
            int iDp10 = AndroidUtilities.dp(f);
            if (this.self) {
                i24 = 0;
            } else {
                i24 = 0;
            }
            int iDp11 = AndroidUtilities.dp(72 + i24) - 12;
            if (insideBottomSheet()) {
                i25 = AndroidUtilities.navigationBarHeight;
            } else {
                i25 = 0;
            }
            recyclerListView6.setPadding(0, iDp10, 0, iDp11 + i25);
        } else if (i2 == 1) {
            this.listView2.setPadding(0, AndroidUtilities.dp(f), 0, AndroidUtilities.dp(16.0f));
        } else {
            this.listView2.setPadding(0, AndroidUtilities.dp(f), 0, AndroidUtilities.dp(f));
        }
        this.listView2.setClipToPadding(false);
        this.listView2.setLayoutManager(new LinearLayoutManager(context, 1, true));
        RecyclerListView recyclerListView7 = this.listView2;
        if (LocaleController.isRTL) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        recyclerListView7.setVerticalScrollbarPosition(i3);
        if (this.screenType == 1) {
            this.page2.addView(this.listView2, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 273.0f));
            this.listView2.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
                @Override
                public boolean hasDoubleTap(View view3, int i34) {
                    return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view3, i34);
                }

                @Override
                public void onDoubleTap(View view3, int i34, float f13, float f14) {
                    RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view3, i34, f13, f14);
                }

                @Override
                public final void onItemClick(View view3, int i34, float f13, float f14) {
                    ThemePreviewActivity.m4689$r8$lambda$yUgoSDSIx920vGr5qa_ApbKjww(this.f$0, view3, i34, f13, f14);
                }
            });
            i4 = -1;
        } else {
            i4 = -1;
            this.page2.addView(this.listView2, LayoutHelper.createFrame(-1, -1, 51));
        }
        this.listView2.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i34, int i35) {
                ThemePreviewActivity.this.listView2.invalidateViews();
                ThemePreviewActivity.this.wasScroll = true;
            }

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i34) {
                if (i34 == 0) {
                    ThemePreviewActivity.this.wasScroll = false;
                }
            }
        });
        this.page2.addView(this.actionBar2, LayoutHelper.createFrame(i4, f2));
        WallpaperParallaxEffect wallpaperParallaxEffect2 = new WallpaperParallaxEffect(context);
        this.parallaxEffect = wallpaperParallaxEffect2;
        wallpaperParallaxEffect2.setCallback(new WallpaperParallaxEffect.Callback() {
            @Override
            public final void onOffsetsChanged(int i34, int i35, float f13) {
                ThemePreviewActivity.$r8$lambda$8OgX8ATzZHWjtlgaHFfk3PpGc_g(this.f$0, i34, i35, f13);
            }
        });
        i5 = this.screenType;
        if (i5 != 1) {
            if (i5 == 2) {
                final boolean zInsideBottomSheet2 = insideBottomSheet();
                FrameLayout frameLayout21 = new FrameLayout(context) {
                    private final ColorFilter colorFilter;
                    private LinearGradient gradient;
                    private int gradientHeight;
                    private final Paint gradientPaint;

                    {
                        Paint paint = new Paint(3);
                        this.gradientPaint = paint;
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                        ColorMatrix colorMatrix = new ColorMatrix();
                        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.4f);
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.65f);
                        this.colorFilter = new ColorMatrixColorFilter(colorMatrix);
                    }

                    @Override
                    protected void dispatchDraw(Canvas canvas) {
                        Canvas canvas2;
                        if (zInsideBottomSheet2) {
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                            canvas2 = canvas;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                            Theme.applyServiceShaderMatrixForView(this, ThemePreviewActivity.this.backgroundImage, ThemePreviewActivity.this.themeDelegate);
                            Paint paint = ThemePreviewActivity.this.themeDelegate.getPaint("paintChatActionBackground");
                            ColorFilter colorFilter = paint.getColorFilter();
                            paint.setColorFilter(this.colorFilter);
                            float f13 = 1.0f;
                            if (ThemePreviewActivity.this.backgroundImage != null && (ThemePreviewActivity.this.backgroundImage.getBackground() instanceof MotionBackgroundDrawable) && ThemePreviewActivity.this.currentIntensity < 0.0f) {
                                f13 = 0.33f;
                            }
                            int alpha = paint.getAlpha();
                            paint.setAlpha((int) (alpha * f13));
                            canvas2.drawRect(rectF, paint);
                            paint.setAlpha(alpha);
                            paint.setColorFilter(colorFilter);
                            if (ThemePreviewActivity.this.shouldShowBrightnessControll && ThemePreviewActivity.this.dimAmount > 0.0f) {
                                canvas2.drawColor(ColorUtils.setAlphaComponent(-16777216, (int) (ThemePreviewActivity.this.dimAmount * 255.0f * ThemePreviewActivity.this.progressToDarkTheme)));
                            }
                            canvas2.save();
                            if (this.gradient == null || this.gradientHeight != getHeight()) {
                                int height = getHeight();
                                this.gradientHeight = height;
                                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, height, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                                this.gradient = linearGradient;
                                this.gradientPaint.setShader(linearGradient);
                            }
                            canvas2.drawRect(rectF, this.gradientPaint);
                            canvas2.restore();
                            canvas2.restore();
                        } else {
                            canvas2 = canvas;
                        }
                        super.dispatchDraw(canvas2);
                    }

                    @Override
                    protected void onMeasure(int i34, int i35) {
                        super.onMeasure(i34, i35);
                        for (int i36 = 0; i36 < getChildCount(); i36++) {
                            View childAt = getChildAt(i36);
                            if (childAt.getMeasuredWidth() > AndroidUtilities.dp(420.0f)) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(420.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                            }
                        }
                    }
                };
                this.bottomOverlayChat = frameLayout21;
                frameLayout21.setWillNotDraw(false);
                FrameLayout frameLayout22 = this.bottomOverlayChat;
                int iDp12 = AndroidUtilities.dp(12.0f);
                int iDp13 = AndroidUtilities.dp(12.0f);
                int iDp14 = AndroidUtilities.dp(12.0f);
                int iDp15 = AndroidUtilities.dp(12.0f);
                if (insideBottomSheet()) {
                    i22 = AndroidUtilities.navigationBarHeight;
                } else {
                    i22 = 0;
                }
                frameLayout22.setPadding(iDp12, iDp13, iDp14, iDp15 + i22);
                this.page2.addView(this.bottomOverlayChat, LayoutHelper.createFrame(-1, 0, 81));
                BlurButton blurButton4 = new BlurButton(context);
                this.applyButton1 = blurButton4;
                ScaleStateListAnimator.apply(blurButton4, 0.033f, 1.2f);
                updateApplyButton1(false);
                this.applyButton1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        this.f$0.applyWallpaperBackground(false);
                    }
                });
                if (this.dialogId <= 0) {
                    this.bottomOverlayChat.addView(this.applyButton1, LayoutHelper.createFrame(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                } else {
                    this.bottomOverlayChat.addView(this.applyButton1, LayoutHelper.createFrame(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                }
                if (this.shouldShowBrightnessControll) {
                    FrameLayout frameLayout23 = new FrameLayout(getContext()) {
                        private final Paint shadowPaint = new Paint(1);
                        private final Paint dimPaint = new Paint(1);
                        private final Paint dimPaint2 = new Paint(1);

                        @Override
                        protected void dispatchDraw(Canvas canvas) {
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                            float fDp = AndroidUtilities.dp(8.0f);
                            this.shadowPaint.setColor(0);
                            this.shadowPaint.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33f), ColorUtils.setAlphaComponent(-16777216, (int) (ThemePreviewActivity.this.dimmingSlider.getAlpha() * 27.0f)));
                            canvas.drawRoundRect(rectF, fDp, fDp, this.shadowPaint);
                            Theme.applyServiceShaderMatrixForView(this, ThemePreviewActivity.this.backgroundImage, ThemePreviewActivity.this.themeDelegate);
                            Paint paint = ThemePreviewActivity.this.themeDelegate.getPaint("paintChatActionBackground");
                            int alpha = paint.getAlpha();
                            paint.setAlpha((int) (alpha * ThemePreviewActivity.this.dimmingSlider.getAlpha()));
                            canvas.drawRoundRect(rectF, fDp, fDp, paint);
                            paint.setAlpha(alpha);
                            if (ThemePreviewActivity.this.shouldShowBrightnessControll && ThemePreviewActivity.this.dimAmount > 0.0f) {
                                this.dimPaint2.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (ThemePreviewActivity.this.dimAmount * 255.0f * ThemePreviewActivity.this.progressToDarkTheme)));
                                canvas.drawRoundRect(rectF, fDp, fDp, this.dimPaint2);
                            }
                            this.dimPaint.setColor(520093695);
                            this.dimPaint.setAlpha((int) (ThemePreviewActivity.this.dimmingSlider.getAlpha() * 30.0f));
                            canvas.drawRoundRect(rectF, fDp, fDp, this.dimPaint);
                            super.dispatchDraw(canvas);
                        }
                    };
                    this.dimmingSliderContainer = frameLayout23;
                    frameLayout23.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                    this.page2.addView(this.dimmingSliderContainer, LayoutHelper.createFrame(222, 76, 49));
                    SliderView sliderView5 = new SliderView(getContext(), 3) {
                        @Override
                        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                            if (getParent() != null) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    };
                    this.dimmingSlider = sliderView5;
                    sliderView5.setValue(this.dimAmount);
                    this.dimmingSlider.setMinMax(0.0f, 0.9f);
                    this.dimmingSlider.setOnValueChange(new Utilities.Callback() {
                        @Override
                        public final void run(Object obj5) {
                            ThemePreviewActivity.m4677$r8$lambda$1NbvpStwepfVDa_AAqQbAYfgNA(this.f$0, (Float) obj5);
                        }
                    });
                    this.dimmingSliderContainer.addView(this.dimmingSlider);
                    dayNightSwitchDelegate = this.onSwitchDayNightDelegate;
                    if (dayNightSwitchDelegate != null) {
                        SliderView sliderView6 = this.dimmingSlider;
                        if (dayNightSwitchDelegate.isDark()) {
                            i23 = 0;
                        } else {
                            i23 = 8;
                        }
                        sliderView6.setVisibility(i23);
                        SliderView sliderView7 = this.dimmingSlider;
                        if (this.onSwitchDayNightDelegate.isDark()) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        sliderView7.setAlpha(f10);
                        SliderView sliderView8 = this.dimmingSlider;
                        if (this.onSwitchDayNightDelegate.isDark()) {
                            f11 = this.dimAmount;
                        } else {
                            f11 = 0.0f;
                        }
                        sliderView8.setValue(f11);
                    }
                }
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
            if (this.screenType != 1) {
                if (obj instanceof WallpapersListActivity.ColorWallpaper) {
                }
                i6 = 3;
            } else {
                if (obj instanceof WallpapersListActivity.ColorWallpaper) {
                }
                i6 = 3;
            }
            strArr = new String[i6];
            iArr = new int[i6];
            this.backgroundCheckBoxView = new WallpaperCheckBoxView[i6];
            if (i6 != 0) {
                this.backgroundButtonsContainer = new FrameLayout(context);
                if (this.screenType != 1) {
                    strArr[0] = LocaleController.getString(R.string.BackgroundColors);
                    strArr[1] = LocaleController.getString(R.string.BackgroundPattern);
                    strArr[2] = LocaleController.getString(R.string.BackgroundMotion);
                } else {
                    strArr[0] = LocaleController.getString(R.string.BackgroundColors);
                    strArr[1] = LocaleController.getString(R.string.BackgroundPattern);
                    strArr[2] = LocaleController.getString(R.string.BackgroundMotion);
                }
                iMax = 0;
                while (i20 < i6) {
                    int iCeil3 = (int) Math.ceil(textPaint.measureText(strArr[i20]));
                    iArr[i20] = iCeil3;
                    iMax = Math.max(iMax, iCeil3);
                }
                FrameLayout frameLayout24 = new FrameLayout(context) {
                    private RectF rect = new RectF();

                    @Override
                    protected void onDraw(Canvas canvas) {
                        this.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        Theme.applyServiceShaderMatrixForView(ThemePreviewActivity.this.backgroundPlayAnimationView, ThemePreviewActivity.this.backgroundImage, ThemePreviewActivity.this.themeDelegate);
                        canvas.drawRoundRect(this.rect, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ThemePreviewActivity.this.themeDelegate.getPaint("paintChatActionBackground"));
                        if (Theme.hasGradientService()) {
                            canvas.drawRoundRect(this.rect, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ThemePreviewActivity.this.themeDelegate.getPaint("paintChatActionBackgroundDarken"));
                        }
                    }
                };
                this.backgroundPlayAnimationView = frameLayout24;
                frameLayout24.setWillNotDraw(false);
                FrameLayout frameLayout25 = this.backgroundPlayAnimationView;
                if (this.backgroundGradientColor1 != 0) {
                    i21 = 0;
                } else {
                    i21 = 4;
                }
                frameLayout25.setVisibility(i21);
                FrameLayout frameLayout26 = this.backgroundPlayAnimationView;
                if (this.backgroundGradientColor1 != 0) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.1f;
                }
                frameLayout26.setScaleX(f7);
                FrameLayout frameLayout27 = this.backgroundPlayAnimationView;
                if (this.backgroundGradientColor1 != 0) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.1f;
                }
                frameLayout27.setScaleY(f8);
                FrameLayout frameLayout28 = this.backgroundPlayAnimationView;
                if (this.backgroundGradientColor1 != 0) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                frameLayout28.setAlpha(f9);
                FrameLayout frameLayout110 = this.backgroundPlayAnimationView;
                if (this.backgroundGradientColor1 != 0) {
                    num = 1;
                } else {
                    num = null;
                }
                frameLayout110.setTag(num);
                this.backgroundButtonsContainer.addView(this.backgroundPlayAnimationView, LayoutHelper.createFrame(48, 48, 17));
                this.backgroundPlayAnimationView.setOnClickListener(new View.OnClickListener() {
                    int rotation = 0;

                    @Override
                    public void onClick(View view3) {
                        ThemePreviewActivity.this.backgroundPlayAnimationImageView.setRotation(this.rotation);
                        this.rotation -= 45;
                        ThemePreviewActivity.this.backgroundPlayAnimationImageView.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
                        if (ThemePreviewActivity.this.backgroundImages[0] != null) {
                            Drawable background = ThemePreviewActivity.this.backgroundImages[0].getBackground();
                            if (!(background instanceof MotionBackgroundDrawable)) {
                                ThemePreviewActivity.this.onColorsRotate();
                            } else {
                                ((MotionBackgroundDrawable) background).switchToNextPosition();
                            }
                        }
                        if (ThemePreviewActivity.this.backgroundImages[1] != null) {
                            Drawable background2 = ThemePreviewActivity.this.backgroundImages[1].getBackground();
                            if (background2 instanceof MotionBackgroundDrawable) {
                                ((MotionBackgroundDrawable) background2).switchToNextPosition();
                            }
                        }
                    }
                });
                ImageView imageView3 = new ImageView(context);
                this.backgroundPlayAnimationImageView = imageView3;
                imageView3.setScaleType(ImageView.ScaleType.CENTER);
                this.backgroundPlayAnimationImageView.setImageResource(R.drawable.bg_rotate_large);
                this.backgroundPlayAnimationView.addView(this.backgroundPlayAnimationImageView, LayoutHelper.createFrame(-2, -2, 17));
            } else {
                iMax = 0;
            }
            i7 = 0;
            while (i7 < i6) {
                this.backgroundCheckBoxView[i7] = new WallpaperCheckBoxView(context, (this.screenType == 1 && !(this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper)) || i7 != 0, this.backgroundImage, this.themeDelegate);
                this.backgroundCheckBoxView[i7].setBackgroundColor(this.backgroundColor);
                this.backgroundCheckBoxView[i7].setText(strArr[i7], iArr[i7], iMax);
                if (this.screenType == 1) {
                    if (i7 == 1) {
                        WallpaperCheckBoxView wallpaperCheckBoxView4 = this.backgroundCheckBoxView[i7];
                        if (this.selectedPattern == null) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        wallpaperCheckBoxView4.setChecked(z3, false);
                    } else if (i7 == 2) {
                        this.backgroundCheckBoxView[i7].setChecked(this.isMotion, false);
                    }
                } else if (i7 == 1) {
                    WallpaperCheckBoxView wallpaperCheckBoxView5 = this.backgroundCheckBoxView[i7];
                    if (this.selectedPattern == null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    wallpaperCheckBoxView5.setChecked(z3, false);
                } else if (i7 == 2) {
                    this.backgroundCheckBoxView[i7].setChecked(this.isMotion, false);
                }
                iDp3 = AndroidUtilities.dp(56.0f) + iMax;
                layoutParams2 = new FrameLayout.LayoutParams(iDp3, -2);
                layoutParams2.gravity = 17;
                if (i6 == 3) {
                    if (i7 != 0) {
                        layoutParams2.leftMargin = (iDp3 / 2) + AndroidUtilities.dp(10.0f);
                    } else {
                        layoutParams2.leftMargin = (iDp3 / 2) + AndroidUtilities.dp(10.0f);
                    }
                } else if (i7 == 1) {
                    layoutParams2.leftMargin = (iDp3 / 2) + AndroidUtilities.dp(10.0f);
                } else {
                    layoutParams2.rightMargin = (iDp3 / 2) + AndroidUtilities.dp(10.0f);
                }
                this.backgroundButtonsContainer.addView(this.backgroundCheckBoxView[i7], layoutParams2);
                final WallpaperCheckBoxView wallpaperCheckBoxView6 = this.backgroundCheckBoxView[i7];
                wallpaperCheckBoxView6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        ThemePreviewActivity.$r8$lambda$gw7VHMT_d8xxvRDe8qqoA1688xs(this.f$0, i7, wallpaperCheckBoxView6, view3);
                    }
                });
                if (i7 == 2) {
                    this.backgroundCheckBoxView[i7].setAlpha(0.0f);
                    this.backgroundCheckBoxView[i7].setVisibility(4);
                }
                i7++;
            }
            i8 = 1;
            if (this.screenType == 1) {
                iArr2 = new int[2];
                this.messagesCheckBoxView = new WallpaperCheckBoxView[2];
                this.messagesButtonsContainer = new FrameLayout(context);
                strArr2 = new String[]{LocaleController.getString(R.string.BackgroundAnimate), LocaleController.getString(R.string.BackgroundColors)};
                i17 = 0;
                iMax2 = 0;
                while (i17 < i16) {
                    int iCeil4 = (int) Math.ceil(textPaint.measureText(strArr2[i17]));
                    iArr2[i17] = iCeil4;
                    iMax2 = Math.max(iMax2, iCeil4);
                    i17++;
                }
                if (this.accent != null) {
                    FrameLayout frameLayout111 = new FrameLayout(context) {
                        private RectF rect = new RectF();

                        @Override
                        protected void onDraw(Canvas canvas) {
                            this.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                            Theme.applyServiceShaderMatrixForView(ThemePreviewActivity.this.messagesPlayAnimationView, ThemePreviewActivity.this.backgroundImage, ThemePreviewActivity.this.themeDelegate);
                            canvas.drawRoundRect(this.rect, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ThemePreviewActivity.this.themeDelegate.getPaint("paintChatActionBackground"));
                            if (Theme.hasGradientService()) {
                                canvas.drawRoundRect(this.rect, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ThemePreviewActivity.this.themeDelegate.getPaint("paintChatActionBackgroundDarken"));
                            }
                        }
                    };
                    this.messagesPlayAnimationView = frameLayout111;
                    frameLayout111.setWillNotDraw(false);
                    FrameLayout frameLayout112 = this.messagesPlayAnimationView;
                    if (this.accent.myMessagesGradientAccentColor1 != 0) {
                        i18 = 0;
                    } else {
                        i18 = 4;
                    }
                    frameLayout112.setVisibility(i18);
                    FrameLayout frameLayout113 = this.messagesPlayAnimationView;
                    if (this.accent.myMessagesGradientAccentColor1 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = 0.1f;
                    }
                    frameLayout113.setScaleX(f4);
                    FrameLayout frameLayout114 = this.messagesPlayAnimationView;
                    if (this.accent.myMessagesGradientAccentColor1 != 0) {
                        f5 = 1.0f;
                    } else {
                        f5 = 0.1f;
                    }
                    frameLayout114.setScaleY(f5);
                    FrameLayout frameLayout115 = this.messagesPlayAnimationView;
                    if (this.accent.myMessagesGradientAccentColor1 != 0) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    frameLayout115.setAlpha(f6);
                    this.messagesButtonsContainer.addView(this.messagesPlayAnimationView, LayoutHelper.createFrame(48, 48, 17));
                    this.messagesPlayAnimationView.setOnClickListener(new View.OnClickListener() {
                        int rotation = 0;

                        @Override
                        public void onClick(View view3) {
                            ThemePreviewActivity.this.messagesPlayAnimationImageView.setRotation(this.rotation);
                            this.rotation -= 45;
                            ThemePreviewActivity.this.messagesPlayAnimationImageView.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
                            if (!ThemePreviewActivity.this.accent.myMessagesAnimated) {
                                if (ThemePreviewActivity.this.accent.myMessagesGradientAccentColor3 != 0) {
                                    int i34 = ThemePreviewActivity.this.accent.myMessagesAccentColor != 0 ? ThemePreviewActivity.this.accent.myMessagesAccentColor : ThemePreviewActivity.this.accent.accentColor;
                                    ThemePreviewActivity.this.accent.myMessagesAccentColor = ThemePreviewActivity.this.accent.myMessagesGradientAccentColor1;
                                    ThemePreviewActivity.this.accent.myMessagesGradientAccentColor1 = ThemePreviewActivity.this.accent.myMessagesGradientAccentColor2;
                                    ThemePreviewActivity.this.accent.myMessagesGradientAccentColor2 = ThemePreviewActivity.this.accent.myMessagesGradientAccentColor3;
                                    ThemePreviewActivity.this.accent.myMessagesGradientAccentColor3 = i34;
                                } else {
                                    int i35 = ThemePreviewActivity.this.accent.myMessagesAccentColor != 0 ? ThemePreviewActivity.this.accent.myMessagesAccentColor : ThemePreviewActivity.this.accent.accentColor;
                                    ThemePreviewActivity.this.accent.myMessagesAccentColor = ThemePreviewActivity.this.accent.myMessagesGradientAccentColor1;
                                    ThemePreviewActivity.this.accent.myMessagesGradientAccentColor1 = ThemePreviewActivity.this.accent.myMessagesGradientAccentColor2;
                                    ThemePreviewActivity.this.accent.myMessagesGradientAccentColor2 = i35;
                                }
                                ThemePreviewActivity.this.colorPicker.setColor(ThemePreviewActivity.this.accent.myMessagesGradientAccentColor3, 3);
                                ThemePreviewActivity.this.colorPicker.setColor(ThemePreviewActivity.this.accent.myMessagesGradientAccentColor2, 2);
                                ThemePreviewActivity.this.colorPicker.setColor(ThemePreviewActivity.this.accent.myMessagesGradientAccentColor1, 1);
                                ThemePreviewActivity.this.colorPicker.setColor(ThemePreviewActivity.this.accent.myMessagesAccentColor != 0 ? ThemePreviewActivity.this.accent.myMessagesAccentColor : ThemePreviewActivity.this.accent.accentColor, 0);
                                ThemePreviewActivity.this.messagesCheckBoxView[1].setColor(0, ThemePreviewActivity.this.accent.myMessagesAccentColor);
                                ThemePreviewActivity.this.messagesCheckBoxView[1].setColor(1, ThemePreviewActivity.this.accent.myMessagesGradientAccentColor1);
                                ThemePreviewActivity.this.messagesCheckBoxView[1].setColor(2, ThemePreviewActivity.this.accent.myMessagesGradientAccentColor2);
                                ThemePreviewActivity.this.messagesCheckBoxView[1].setColor(3, ThemePreviewActivity.this.accent.myMessagesGradientAccentColor3);
                                Theme.refreshThemeColors(true, true);
                                ThemePreviewActivity.this.listView2.invalidateViews();
                                return;
                            }
                            if (ThemePreviewActivity.this.msgOutDrawable.getMotionBackgroundDrawable() != null) {
                                ThemePreviewActivity.this.msgOutDrawable.getMotionBackgroundDrawable().switchToNextPosition();
                            }
                        }
                    });
                    ImageView imageView4 = new ImageView(context);
                    this.messagesPlayAnimationImageView = imageView4;
                    imageView4.setScaleType(ImageView.ScaleType.CENTER);
                    this.messagesPlayAnimationImageView.setImageResource(R.drawable.bg_rotate_large);
                    this.messagesPlayAnimationView.addView(this.messagesPlayAnimationImageView, LayoutHelper.createFrame(-2, -2, 17));
                    while (i19 < 2) {
                        WallpaperCheckBoxView[] wallpaperCheckBoxViewArr2 = this.messagesCheckBoxView;
                        if (i19 == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        wallpaperCheckBoxViewArr2[i19] = new WallpaperCheckBoxView(context, z2, this.backgroundImage, this.themeDelegate);
                        this.messagesCheckBoxView[i19].setText(strArr2[i19], iArr2[i19], iMax2);
                        if (i19 == 0) {
                            this.messagesCheckBoxView[i19].setChecked(this.accent.myMessagesAnimated, false);
                        }
                        iDp2 = AndroidUtilities.dp(56.0f) + iMax2;
                        layoutParams = new FrameLayout.LayoutParams(iDp2, -2);
                        layoutParams.gravity = 17;
                        if (i19 == 1) {
                            layoutParams.leftMargin = (iDp2 / 2) + AndroidUtilities.dp(10.0f);
                        } else {
                            layoutParams.rightMargin = (iDp2 / 2) + AndroidUtilities.dp(10.0f);
                        }
                        this.messagesButtonsContainer.addView(this.messagesCheckBoxView[i19], layoutParams);
                        final WallpaperCheckBoxView wallpaperCheckBoxView7 = this.messagesCheckBoxView[i19];
                        wallpaperCheckBoxView7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view3) {
                                ThemePreviewActivity.$r8$lambda$g4zxTy8DWZDBESqlEGMhg5NKfYI(this.f$0, i19, wallpaperCheckBoxView7, view3);
                            }
                        });
                    }
                }
                i8 = 1;
            }
            if (this.screenType != i8) {
                this.isBlurred = false;
                while (i9 < 2) {
                    this.patternLayout[i9] = new FrameLayout(context) {
                        @Override
                        public void onDraw(Canvas canvas) {
                            if (i9 == 0) {
                                ThemePreviewActivity.this.sheetDrawable.setBounds(ThemePreviewActivity.this.colorPicker.getLeft() - rect.left, 0, ThemePreviewActivity.this.colorPicker.getRight() + rect.right, getMeasuredHeight());
                            } else {
                                ThemePreviewActivity.this.sheetDrawable.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                            }
                            ThemePreviewActivity.this.sheetDrawable.draw(canvas);
                        }
                    };
                    if (i9 != 1) {
                        this.patternLayout[i9].setVisibility(4);
                    } else {
                        this.patternLayout[i9].setVisibility(4);
                    }
                    this.patternLayout[i9].setWillNotDraw(false);
                    if (this.screenType == 2) {
                        if (i9 == 0) {
                            i15 = 321;
                        } else {
                            i15 = 316;
                        }
                        layoutParamsCreateFrame = LayoutHelper.createFrame(-1, i15, 83);
                    } else {
                        if (i9 == 0) {
                            i10 = 273;
                        } else {
                            i10 = 316;
                        }
                        layoutParamsCreateFrame = LayoutHelper.createFrame(-1, i10, 83);
                    }
                    if (i9 == 0) {
                        if (this.screenType == 2) {
                            i14 = 321;
                        } else {
                            i14 = 273;
                        }
                        f3 = i14;
                    } else {
                        f3 = 316.0f;
                    }
                    layoutParamsCreateFrame.height = AndroidUtilities.dp(f3);
                    if (insideBottomSheet()) {
                        layoutParamsCreateFrame.height += AndroidUtilities.navigationBarHeight;
                    }
                    if (i9 == 0) {
                        Drawable drawable2 = this.sheetDrawable;
                        Rect rect3 = AndroidUtilities.rectTmp2;
                        drawable2.getPadding(rect3);
                        layoutParamsCreateFrame.height += AndroidUtilities.dp(12.0f) + rect3.top;
                    }
                    FrameLayout frameLayout116 = this.patternLayout[i9];
                    if (i9 == 0) {
                        iDp = AndroidUtilities.dp(12.0f) + rect.top;
                    } else {
                        iDp = 0;
                    }
                    if (insideBottomSheet()) {
                        i11 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i11 = 0;
                    }
                    frameLayout116.setPadding(0, iDp, 0, i11);
                    this.page2.addView(this.patternLayout[i9], layoutParamsCreateFrame);
                    if (i9 != 1) {
                        this.patternsButtonsContainer[i9] = new FrameLayout(context) {
                            Paint paint = new Paint();

                            @Override
                            public void onDraw(Canvas canvas) {
                                int intrinsicHeight = Theme.chat_composeShadowDrawable.getIntrinsicHeight();
                                Theme.chat_composeShadowDrawable.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                                Theme.chat_composeShadowDrawable.draw(canvas);
                                this.paint.setColor(ThemePreviewActivity.this.getThemedColor(Theme.key_chat_messagePanelBackground));
                                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), this.paint);
                            }
                        };
                        this.patternsButtonsContainer[i9].setWillNotDraw(false);
                        this.patternsButtonsContainer[i9].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        this.patternsButtonsContainer[i9].setClickable(true);
                        this.patternLayout[i9].addView(this.patternsButtonsContainer[i9], LayoutHelper.createFrame(-1, 51, 80));
                        this.patternsCancelButton[i9] = new TextView(context);
                        this.patternsCancelButton[i9].setTextSize(1, 15.0f);
                        this.patternsCancelButton[i9].setTypeface(AndroidUtilities.bold());
                        TextView textView9 = this.patternsCancelButton[i9];
                        int i34 = Theme.key_chat_fieldOverlayText;
                        textView9.setTextColor(getThemedColor(i34));
                        this.patternsCancelButton[i9].setText(LocaleController.getString(R.string.Cancel));
                        this.patternsCancelButton[i9].setGravity(17);
                        this.patternsCancelButton[i9].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView10 = this.patternsCancelButton[i9];
                        int i35 = Theme.key_listSelector;
                        textView10.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i35), 0));
                        this.patternsButtonsContainer[i9].addView(this.patternsCancelButton[i9], LayoutHelper.createFrame(-2, -1, 51));
                        this.patternsCancelButton[i9].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view3) {
                                ThemePreviewActivity.$r8$lambda$2_eHBBt6BCIuI7vPNNwgGWViXxk(this.f$0, i9, view3);
                            }
                        });
                        this.patternsSaveButton[i9] = new TextView(context);
                        this.patternsSaveButton[i9].setTextSize(1, 15.0f);
                        this.patternsSaveButton[i9].setTypeface(AndroidUtilities.bold());
                        this.patternsSaveButton[i9].setTextColor(getThemedColor(i34));
                        this.patternsSaveButton[i9].setText(LocaleController.getString(R.string.ApplyTheme));
                        this.patternsSaveButton[i9].setGravity(17);
                        this.patternsSaveButton[i9].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        this.patternsSaveButton[i9].setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i35), 0));
                        this.patternsButtonsContainer[i9].addView(this.patternsSaveButton[i9], LayoutHelper.createFrame(-2, -1, 53));
                        this.patternsSaveButton[i9].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view3) {
                                ThemePreviewActivity.$r8$lambda$SYZDOhqtZEiS6wgO2ZfYZSofEVQ(this.f$0, i9, view3);
                            }
                        });
                    } else {
                        this.patternsButtonsContainer[i9] = new FrameLayout(context) {
                            Paint paint = new Paint();

                            @Override
                            public void onDraw(Canvas canvas) {
                                int intrinsicHeight = Theme.chat_composeShadowDrawable.getIntrinsicHeight();
                                Theme.chat_composeShadowDrawable.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                                Theme.chat_composeShadowDrawable.draw(canvas);
                                this.paint.setColor(ThemePreviewActivity.this.getThemedColor(Theme.key_chat_messagePanelBackground));
                                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), this.paint);
                            }
                        };
                        this.patternsButtonsContainer[i9].setWillNotDraw(false);
                        this.patternsButtonsContainer[i9].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        this.patternsButtonsContainer[i9].setClickable(true);
                        this.patternLayout[i9].addView(this.patternsButtonsContainer[i9], LayoutHelper.createFrame(-1, 51, 80));
                        this.patternsCancelButton[i9] = new TextView(context);
                        this.patternsCancelButton[i9].setTextSize(1, 15.0f);
                        this.patternsCancelButton[i9].setTypeface(AndroidUtilities.bold());
                        TextView textView11 = this.patternsCancelButton[i9];
                        int i36 = Theme.key_chat_fieldOverlayText;
                        textView11.setTextColor(getThemedColor(i36));
                        this.patternsCancelButton[i9].setText(LocaleController.getString(R.string.Cancel));
                        this.patternsCancelButton[i9].setGravity(17);
                        this.patternsCancelButton[i9].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView12 = this.patternsCancelButton[i9];
                        int i37 = Theme.key_listSelector;
                        textView12.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i37), 0));
                        this.patternsButtonsContainer[i9].addView(this.patternsCancelButton[i9], LayoutHelper.createFrame(-2, -1, 51));
                        this.patternsCancelButton[i9].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view3) {
                                ThemePreviewActivity.$r8$lambda$2_eHBBt6BCIuI7vPNNwgGWViXxk(this.f$0, i9, view3);
                            }
                        });
                        this.patternsSaveButton[i9] = new TextView(context);
                        this.patternsSaveButton[i9].setTextSize(1, 15.0f);
                        this.patternsSaveButton[i9].setTypeface(AndroidUtilities.bold());
                        this.patternsSaveButton[i9].setTextColor(getThemedColor(i36));
                        this.patternsSaveButton[i9].setText(LocaleController.getString(R.string.ApplyTheme));
                        this.patternsSaveButton[i9].setGravity(17);
                        this.patternsSaveButton[i9].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        this.patternsSaveButton[i9].setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i37), 0));
                        this.patternsButtonsContainer[i9].addView(this.patternsSaveButton[i9], LayoutHelper.createFrame(-2, -1, 53));
                        this.patternsSaveButton[i9].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view3) {
                                ThemePreviewActivity.$r8$lambda$SYZDOhqtZEiS6wgO2ZfYZSofEVQ(this.f$0, i9, view3);
                            }
                        });
                    }
                    if (i9 == 1) {
                        TextView textView13 = new TextView(context);
                        this.patternTitleView = textView13;
                        textView13.setLines(1);
                        this.patternTitleView.setSingleLine(true);
                        this.patternTitleView.setText(LocaleController.getString(R.string.BackgroundChoosePattern));
                        this.patternTitleView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                        this.patternTitleView.setTextSize(1, 20.0f);
                        this.patternTitleView.setTypeface(AndroidUtilities.bold());
                        this.patternTitleView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
                        this.patternTitleView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                        this.patternTitleView.setGravity(16);
                        this.patternLayout[i9].addView(this.patternTitleView, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                        RecyclerListView recyclerListView8 = new RecyclerListView(context) {
                            @Override
                            public boolean onTouchEvent(MotionEvent motionEvent) {
                                if (motionEvent.getAction() == 0) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                return super.onTouchEvent(motionEvent);
                            }
                        };
                        this.patternsListView = recyclerListView8;
                        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(context, 0, false);
                        this.patternsLayoutManager = linearLayoutManager2;
                        recyclerListView8.setLayoutManager(linearLayoutManager2);
                        RecyclerListView recyclerListView9 = this.patternsListView;
                        PatternsAdapter patternsAdapter2 = new PatternsAdapter(context);
                        this.patternsAdapter = patternsAdapter2;
                        recyclerListView9.setAdapter(patternsAdapter2);
                        this.patternsListView.addItemDecoration(new RecyclerView.ItemDecoration() {
                            @Override
                            public void getItemOffsets(Rect rect4, View view3, RecyclerView recyclerView, RecyclerView.State state) {
                                int childAdapterPosition = recyclerView.getChildAdapterPosition(view3);
                                rect4.left = AndroidUtilities.dp(12.0f);
                                rect4.top = 0;
                                rect4.bottom = 0;
                                if (childAdapterPosition == state.getItemCount() - 1) {
                                    rect4.right = AndroidUtilities.dp(12.0f);
                                }
                            }
                        });
                        this.patternLayout[i9].addView(this.patternsListView, LayoutHelper.createFrame(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                        this.patternsListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                            @Override
                            public final void onItemClick(View view3, int i38) {
                                ThemePreviewActivity.$r8$lambda$5Ocn8fX67CEAIw11qzaYjS5qRUs(this.f$0, view3, i38);
                            }
                        });
                        HeaderCell headerCell2 = new HeaderCell(context);
                        this.intensityCell = headerCell2;
                        headerCell2.setText(LocaleController.getString(R.string.BackgroundIntensity));
                        this.patternLayout[i9].addView(this.intensityCell, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                        SeekBarView seekBarView2 = new SeekBarView(context, getResourceProvider()) {
                            @Override
                            public boolean onTouchEvent(MotionEvent motionEvent) {
                                if (motionEvent.getAction() == 0) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                return super.onTouchEvent(motionEvent);
                            }
                        };
                        this.intensitySeekBar = seekBarView2;
                        seekBarView2.setProgress(this.currentIntensity);
                        this.intensitySeekBar.setReportChanges(true);
                        this.intensitySeekBar.setDelegate(new SeekBarView.SeekBarViewDelegate() {
                            @Override
                            public CharSequence getContentDescription() {
                                return SeekBarView.SeekBarViewDelegate.CC.$default$getContentDescription(this);
                            }

                            @Override
                            public int getStepsCount() {
                                return SeekBarView.SeekBarViewDelegate.CC.$default$getStepsCount(this);
                            }

                            @Override
                            public boolean needVisuallyDivideSteps() {
                                return SeekBarView.SeekBarViewDelegate.CC.$default$needVisuallyDivideSteps(this);
                            }

                            @Override
                            public void onSeekBarPressed(boolean z5) {
                            }

                            @Override
                            public void onSeekBarDrag(boolean z5, float f13) {
                                ThemePreviewActivity.this.currentIntensity = f13;
                                ThemePreviewActivity.this.updateIntensity();
                            }
                        });
                        this.patternLayout[i9].addView(this.intensitySeekBar, LayoutHelper.createFrame(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                    } else {
                        ColorPicker colorPicker2 = new ColorPicker(context, this.editingTheme, new AnonymousClass26());
                        this.colorPicker = colorPicker2;
                        colorPicker2.setResourcesProvider(getResourceProvider());
                        if (this.screenType == 1) {
                            this.patternLayout[i9].addView(this.colorPicker, LayoutHelper.createFrame(-1, -1, 1));
                            if (this.applyingTheme.isDark()) {
                                this.colorPicker.setMinBrightness(0.2f);
                            } else {
                                this.colorPicker.setMinBrightness(0.05f);
                                this.colorPicker.setMaxBrightness(0.8f);
                            }
                            themeAccent = this.accent;
                            if (themeAccent != null) {
                                if (themeAccent.accentColor2 != 0) {
                                    i12 = 2;
                                } else {
                                    i12 = 1;
                                }
                                this.colorPicker.setType(1, hasChanges(1), 2, i12, false, 0, false);
                                this.colorPicker.setColor(this.accent.accentColor, 0);
                                i13 = this.accent.accentColor2;
                                if (i13 != 0) {
                                    this.colorPicker.setColor(i13, 1);
                                }
                            }
                        } else {
                            this.patternLayout[i9].addView(this.colorPicker, LayoutHelper.createFrame(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                        }
                    }
                }
            } else {
                this.isBlurred = false;
                while (i9 < 2) {
                    this.patternLayout[i9] = new FrameLayout(context) {
                        @Override
                        public void onDraw(Canvas canvas) {
                            if (i9 == 0) {
                                ThemePreviewActivity.this.sheetDrawable.setBounds(ThemePreviewActivity.this.colorPicker.getLeft() - rect.left, 0, ThemePreviewActivity.this.colorPicker.getRight() + rect.right, getMeasuredHeight());
                            } else {
                                ThemePreviewActivity.this.sheetDrawable.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                            }
                            ThemePreviewActivity.this.sheetDrawable.draw(canvas);
                        }
                    };
                    if (i9 != 1) {
                        this.patternLayout[i9].setVisibility(4);
                    } else {
                        this.patternLayout[i9].setVisibility(4);
                    }
                    this.patternLayout[i9].setWillNotDraw(false);
                    if (this.screenType == 2) {
                        if (i9 == 0) {
                            i15 = 321;
                        } else {
                            i15 = 316;
                        }
                        layoutParamsCreateFrame = LayoutHelper.createFrame(-1, i15, 83);
                    } else {
                        if (i9 == 0) {
                            i10 = 273;
                        } else {
                            i10 = 316;
                        }
                        layoutParamsCreateFrame = LayoutHelper.createFrame(-1, i10, 83);
                    }
                    if (i9 == 0) {
                        if (this.screenType == 2) {
                            i14 = 321;
                        } else {
                            i14 = 273;
                        }
                        f3 = i14;
                    } else {
                        f3 = 316.0f;
                    }
                    layoutParamsCreateFrame.height = AndroidUtilities.dp(f3);
                    if (insideBottomSheet()) {
                        layoutParamsCreateFrame.height += AndroidUtilities.navigationBarHeight;
                    }
                    if (i9 == 0) {
                        Drawable drawable3 = this.sheetDrawable;
                        Rect rect4 = AndroidUtilities.rectTmp2;
                        drawable3.getPadding(rect4);
                        layoutParamsCreateFrame.height += AndroidUtilities.dp(12.0f) + rect4.top;
                    }
                    FrameLayout frameLayout117 = this.patternLayout[i9];
                    if (i9 == 0) {
                        iDp = AndroidUtilities.dp(12.0f) + rect.top;
                    } else {
                        iDp = 0;
                    }
                    if (insideBottomSheet()) {
                        i11 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i11 = 0;
                    }
                    frameLayout117.setPadding(0, iDp, 0, i11);
                    this.page2.addView(this.patternLayout[i9], layoutParamsCreateFrame);
                    if (i9 != 1) {
                        this.patternsButtonsContainer[i9] = new FrameLayout(context) {
                            Paint paint = new Paint();

                            @Override
                            public void onDraw(Canvas canvas) {
                                int intrinsicHeight = Theme.chat_composeShadowDrawable.getIntrinsicHeight();
                                Theme.chat_composeShadowDrawable.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                                Theme.chat_composeShadowDrawable.draw(canvas);
                                this.paint.setColor(ThemePreviewActivity.this.getThemedColor(Theme.key_chat_messagePanelBackground));
                                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), this.paint);
                            }
                        };
                        this.patternsButtonsContainer[i9].setWillNotDraw(false);
                        this.patternsButtonsContainer[i9].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        this.patternsButtonsContainer[i9].setClickable(true);
                        this.patternLayout[i9].addView(this.patternsButtonsContainer[i9], LayoutHelper.createFrame(-1, 51, 80));
                        this.patternsCancelButton[i9] = new TextView(context);
                        this.patternsCancelButton[i9].setTextSize(1, 15.0f);
                        this.patternsCancelButton[i9].setTypeface(AndroidUtilities.bold());
                        TextView textView14 = this.patternsCancelButton[i9];
                        int i38 = Theme.key_chat_fieldOverlayText;
                        textView14.setTextColor(getThemedColor(i38));
                        this.patternsCancelButton[i9].setText(LocaleController.getString(R.string.Cancel));
                        this.patternsCancelButton[i9].setGravity(17);
                        this.patternsCancelButton[i9].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView15 = this.patternsCancelButton[i9];
                        int i39 = Theme.key_listSelector;
                        textView15.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i39), 0));
                        this.patternsButtonsContainer[i9].addView(this.patternsCancelButton[i9], LayoutHelper.createFrame(-2, -1, 51));
                        this.patternsCancelButton[i9].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view3) {
                                ThemePreviewActivity.$r8$lambda$2_eHBBt6BCIuI7vPNNwgGWViXxk(this.f$0, i9, view3);
                            }
                        });
                        this.patternsSaveButton[i9] = new TextView(context);
                        this.patternsSaveButton[i9].setTextSize(1, 15.0f);
                        this.patternsSaveButton[i9].setTypeface(AndroidUtilities.bold());
                        this.patternsSaveButton[i9].setTextColor(getThemedColor(i38));
                        this.patternsSaveButton[i9].setText(LocaleController.getString(R.string.ApplyTheme));
                        this.patternsSaveButton[i9].setGravity(17);
                        this.patternsSaveButton[i9].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        this.patternsSaveButton[i9].setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i39), 0));
                        this.patternsButtonsContainer[i9].addView(this.patternsSaveButton[i9], LayoutHelper.createFrame(-2, -1, 53));
                        this.patternsSaveButton[i9].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view3) {
                                ThemePreviewActivity.$r8$lambda$SYZDOhqtZEiS6wgO2ZfYZSofEVQ(this.f$0, i9, view3);
                            }
                        });
                    } else {
                        this.patternsButtonsContainer[i9] = new FrameLayout(context) {
                            Paint paint = new Paint();

                            @Override
                            public void onDraw(Canvas canvas) {
                                int intrinsicHeight = Theme.chat_composeShadowDrawable.getIntrinsicHeight();
                                Theme.chat_composeShadowDrawable.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                                Theme.chat_composeShadowDrawable.draw(canvas);
                                this.paint.setColor(ThemePreviewActivity.this.getThemedColor(Theme.key_chat_messagePanelBackground));
                                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), this.paint);
                            }
                        };
                        this.patternsButtonsContainer[i9].setWillNotDraw(false);
                        this.patternsButtonsContainer[i9].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        this.patternsButtonsContainer[i9].setClickable(true);
                        this.patternLayout[i9].addView(this.patternsButtonsContainer[i9], LayoutHelper.createFrame(-1, 51, 80));
                        this.patternsCancelButton[i9] = new TextView(context);
                        this.patternsCancelButton[i9].setTextSize(1, 15.0f);
                        this.patternsCancelButton[i9].setTypeface(AndroidUtilities.bold());
                        TextView textView16 = this.patternsCancelButton[i9];
                        int i310 = Theme.key_chat_fieldOverlayText;
                        textView16.setTextColor(getThemedColor(i310));
                        this.patternsCancelButton[i9].setText(LocaleController.getString(R.string.Cancel));
                        this.patternsCancelButton[i9].setGravity(17);
                        this.patternsCancelButton[i9].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView17 = this.patternsCancelButton[i9];
                        int i311 = Theme.key_listSelector;
                        textView17.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i311), 0));
                        this.patternsButtonsContainer[i9].addView(this.patternsCancelButton[i9], LayoutHelper.createFrame(-2, -1, 51));
                        this.patternsCancelButton[i9].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view3) {
                                ThemePreviewActivity.$r8$lambda$2_eHBBt6BCIuI7vPNNwgGWViXxk(this.f$0, i9, view3);
                            }
                        });
                        this.patternsSaveButton[i9] = new TextView(context);
                        this.patternsSaveButton[i9].setTextSize(1, 15.0f);
                        this.patternsSaveButton[i9].setTypeface(AndroidUtilities.bold());
                        this.patternsSaveButton[i9].setTextColor(getThemedColor(i310));
                        this.patternsSaveButton[i9].setText(LocaleController.getString(R.string.ApplyTheme));
                        this.patternsSaveButton[i9].setGravity(17);
                        this.patternsSaveButton[i9].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        this.patternsSaveButton[i9].setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i311), 0));
                        this.patternsButtonsContainer[i9].addView(this.patternsSaveButton[i9], LayoutHelper.createFrame(-2, -1, 53));
                        this.patternsSaveButton[i9].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view3) {
                                ThemePreviewActivity.$r8$lambda$SYZDOhqtZEiS6wgO2ZfYZSofEVQ(this.f$0, i9, view3);
                            }
                        });
                    }
                    if (i9 == 1) {
                        TextView textView18 = new TextView(context);
                        this.patternTitleView = textView18;
                        textView18.setLines(1);
                        this.patternTitleView.setSingleLine(true);
                        this.patternTitleView.setText(LocaleController.getString(R.string.BackgroundChoosePattern));
                        this.patternTitleView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                        this.patternTitleView.setTextSize(1, 20.0f);
                        this.patternTitleView.setTypeface(AndroidUtilities.bold());
                        this.patternTitleView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
                        this.patternTitleView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                        this.patternTitleView.setGravity(16);
                        this.patternLayout[i9].addView(this.patternTitleView, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                        RecyclerListView recyclerListView10 = new RecyclerListView(context) {
                            @Override
                            public boolean onTouchEvent(MotionEvent motionEvent) {
                                if (motionEvent.getAction() == 0) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                return super.onTouchEvent(motionEvent);
                            }
                        };
                        this.patternsListView = recyclerListView10;
                        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(context, 0, false);
                        this.patternsLayoutManager = linearLayoutManager3;
                        recyclerListView10.setLayoutManager(linearLayoutManager3);
                        RecyclerListView recyclerListView11 = this.patternsListView;
                        PatternsAdapter patternsAdapter3 = new PatternsAdapter(context);
                        this.patternsAdapter = patternsAdapter3;
                        recyclerListView11.setAdapter(patternsAdapter3);
                        this.patternsListView.addItemDecoration(new RecyclerView.ItemDecoration() {
                            @Override
                            public void getItemOffsets(Rect rect5, View view3, RecyclerView recyclerView, RecyclerView.State state) {
                                int childAdapterPosition = recyclerView.getChildAdapterPosition(view3);
                                rect5.left = AndroidUtilities.dp(12.0f);
                                rect5.top = 0;
                                rect5.bottom = 0;
                                if (childAdapterPosition == state.getItemCount() - 1) {
                                    rect5.right = AndroidUtilities.dp(12.0f);
                                }
                            }
                        });
                        this.patternLayout[i9].addView(this.patternsListView, LayoutHelper.createFrame(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                        this.patternsListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                            @Override
                            public final void onItemClick(View view3, int i312) {
                                ThemePreviewActivity.$r8$lambda$5Ocn8fX67CEAIw11qzaYjS5qRUs(this.f$0, view3, i312);
                            }
                        });
                        HeaderCell headerCell3 = new HeaderCell(context);
                        this.intensityCell = headerCell3;
                        headerCell3.setText(LocaleController.getString(R.string.BackgroundIntensity));
                        this.patternLayout[i9].addView(this.intensityCell, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                        SeekBarView seekBarView3 = new SeekBarView(context, getResourceProvider()) {
                            @Override
                            public boolean onTouchEvent(MotionEvent motionEvent) {
                                if (motionEvent.getAction() == 0) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                return super.onTouchEvent(motionEvent);
                            }
                        };
                        this.intensitySeekBar = seekBarView3;
                        seekBarView3.setProgress(this.currentIntensity);
                        this.intensitySeekBar.setReportChanges(true);
                        this.intensitySeekBar.setDelegate(new SeekBarView.SeekBarViewDelegate() {
                            @Override
                            public CharSequence getContentDescription() {
                                return SeekBarView.SeekBarViewDelegate.CC.$default$getContentDescription(this);
                            }

                            @Override
                            public int getStepsCount() {
                                return SeekBarView.SeekBarViewDelegate.CC.$default$getStepsCount(this);
                            }

                            @Override
                            public boolean needVisuallyDivideSteps() {
                                return SeekBarView.SeekBarViewDelegate.CC.$default$needVisuallyDivideSteps(this);
                            }

                            @Override
                            public void onSeekBarPressed(boolean z5) {
                            }

                            @Override
                            public void onSeekBarDrag(boolean z5, float f13) {
                                ThemePreviewActivity.this.currentIntensity = f13;
                                ThemePreviewActivity.this.updateIntensity();
                            }
                        });
                        this.patternLayout[i9].addView(this.intensitySeekBar, LayoutHelper.createFrame(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                    } else {
                        ColorPicker colorPicker3 = new ColorPicker(context, this.editingTheme, new AnonymousClass26());
                        this.colorPicker = colorPicker3;
                        colorPicker3.setResourcesProvider(getResourceProvider());
                        if (this.screenType == 1) {
                            this.patternLayout[i9].addView(this.colorPicker, LayoutHelper.createFrame(-1, -1, 1));
                            if (this.applyingTheme.isDark()) {
                                this.colorPicker.setMinBrightness(0.2f);
                            } else {
                                this.colorPicker.setMinBrightness(0.05f);
                                this.colorPicker.setMaxBrightness(0.8f);
                            }
                            themeAccent = this.accent;
                            if (themeAccent != null) {
                                if (themeAccent.accentColor2 != 0) {
                                    i12 = 2;
                                } else {
                                    i12 = 1;
                                }
                                this.colorPicker.setType(1, hasChanges(1), 2, i12, false, 0, false);
                                this.colorPicker.setColor(this.accent.accentColor, 0);
                                i13 = this.accent.accentColor2;
                                if (i13 != 0) {
                                    this.colorPicker.setColor(i13, 1);
                                }
                            }
                        } else {
                            this.patternLayout[i9].addView(this.colorPicker, LayoutHelper.createFrame(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                        }
                    }
                }
            }
            updateButtonState(false, false);
            if (!this.backgroundImage.getImageReceiver().hasBitmapImage()) {
                this.page2.setBackgroundColor(-16777216);
            }
            if (this.screenType != 1) {
                this.backgroundImage.getImageReceiver().setCrossfadeWithOldImage(true);
            }
        } else {
            if (i5 == 2) {
                final boolean zInsideBottomSheet3 = insideBottomSheet();
                FrameLayout frameLayout29 = new FrameLayout(context) {
                    private final ColorFilter colorFilter;
                    private LinearGradient gradient;
                    private int gradientHeight;
                    private final Paint gradientPaint;

                    {
                        Paint paint = new Paint(3);
                        this.gradientPaint = paint;
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                        ColorMatrix colorMatrix = new ColorMatrix();
                        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.4f);
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.65f);
                        this.colorFilter = new ColorMatrixColorFilter(colorMatrix);
                    }

                    @Override
                    protected void dispatchDraw(Canvas canvas) {
                        Canvas canvas2;
                        if (zInsideBottomSheet3) {
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                            canvas2 = canvas;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                            Theme.applyServiceShaderMatrixForView(this, ThemePreviewActivity.this.backgroundImage, ThemePreviewActivity.this.themeDelegate);
                            Paint paint = ThemePreviewActivity.this.themeDelegate.getPaint("paintChatActionBackground");
                            ColorFilter colorFilter = paint.getColorFilter();
                            paint.setColorFilter(this.colorFilter);
                            float f13 = 1.0f;
                            if (ThemePreviewActivity.this.backgroundImage != null && (ThemePreviewActivity.this.backgroundImage.getBackground() instanceof MotionBackgroundDrawable) && ThemePreviewActivity.this.currentIntensity < 0.0f) {
                                f13 = 0.33f;
                            }
                            int alpha = paint.getAlpha();
                            paint.setAlpha((int) (alpha * f13));
                            canvas2.drawRect(rectF, paint);
                            paint.setAlpha(alpha);
                            paint.setColorFilter(colorFilter);
                            if (ThemePreviewActivity.this.shouldShowBrightnessControll && ThemePreviewActivity.this.dimAmount > 0.0f) {
                                canvas2.drawColor(ColorUtils.setAlphaComponent(-16777216, (int) (ThemePreviewActivity.this.dimAmount * 255.0f * ThemePreviewActivity.this.progressToDarkTheme)));
                            }
                            canvas2.save();
                            if (this.gradient == null || this.gradientHeight != getHeight()) {
                                int height = getHeight();
                                this.gradientHeight = height;
                                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, height, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                                this.gradient = linearGradient;
                                this.gradientPaint.setShader(linearGradient);
                            }
                            canvas2.drawRect(rectF, this.gradientPaint);
                            canvas2.restore();
                            canvas2.restore();
                        } else {
                            canvas2 = canvas;
                        }
                        super.dispatchDraw(canvas2);
                    }

                    @Override
                    protected void onMeasure(int i312, int i313) {
                        super.onMeasure(i312, i313);
                        for (int i314 = 0; i314 < getChildCount(); i314++) {
                            View childAt = getChildAt(i314);
                            if (childAt.getMeasuredWidth() > AndroidUtilities.dp(420.0f)) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(420.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                            }
                        }
                    }
                };
                this.bottomOverlayChat = frameLayout29;
                frameLayout29.setWillNotDraw(false);
                FrameLayout frameLayout210 = this.bottomOverlayChat;
                int iDp16 = AndroidUtilities.dp(12.0f);
                int iDp17 = AndroidUtilities.dp(12.0f);
                int iDp18 = AndroidUtilities.dp(12.0f);
                int iDp19 = AndroidUtilities.dp(12.0f);
                if (insideBottomSheet()) {
                    i22 = AndroidUtilities.navigationBarHeight;
                } else {
                    i22 = 0;
                }
                frameLayout210.setPadding(iDp16, iDp17, iDp18, iDp19 + i22);
                this.page2.addView(this.bottomOverlayChat, LayoutHelper.createFrame(-1, 0, 81));
                BlurButton blurButton5 = new BlurButton(context);
                this.applyButton1 = blurButton5;
                ScaleStateListAnimator.apply(blurButton5, 0.033f, 1.2f);
                updateApplyButton1(false);
                this.applyButton1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        this.f$0.applyWallpaperBackground(false);
                    }
                });
                if (this.dialogId <= 0) {
                    this.bottomOverlayChat.addView(this.applyButton1, LayoutHelper.createFrame(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                } else {
                    this.bottomOverlayChat.addView(this.applyButton1, LayoutHelper.createFrame(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                }
                if (this.shouldShowBrightnessControll) {
                    FrameLayout frameLayout211 = new FrameLayout(getContext()) {
                        private final Paint shadowPaint = new Paint(1);
                        private final Paint dimPaint = new Paint(1);
                        private final Paint dimPaint2 = new Paint(1);

                        @Override
                        protected void dispatchDraw(Canvas canvas) {
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                            float fDp = AndroidUtilities.dp(8.0f);
                            this.shadowPaint.setColor(0);
                            this.shadowPaint.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33f), ColorUtils.setAlphaComponent(-16777216, (int) (ThemePreviewActivity.this.dimmingSlider.getAlpha() * 27.0f)));
                            canvas.drawRoundRect(rectF, fDp, fDp, this.shadowPaint);
                            Theme.applyServiceShaderMatrixForView(this, ThemePreviewActivity.this.backgroundImage, ThemePreviewActivity.this.themeDelegate);
                            Paint paint = ThemePreviewActivity.this.themeDelegate.getPaint("paintChatActionBackground");
                            int alpha = paint.getAlpha();
                            paint.setAlpha((int) (alpha * ThemePreviewActivity.this.dimmingSlider.getAlpha()));
                            canvas.drawRoundRect(rectF, fDp, fDp, paint);
                            paint.setAlpha(alpha);
                            if (ThemePreviewActivity.this.shouldShowBrightnessControll && ThemePreviewActivity.this.dimAmount > 0.0f) {
                                this.dimPaint2.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (ThemePreviewActivity.this.dimAmount * 255.0f * ThemePreviewActivity.this.progressToDarkTheme)));
                                canvas.drawRoundRect(rectF, fDp, fDp, this.dimPaint2);
                            }
                            this.dimPaint.setColor(520093695);
                            this.dimPaint.setAlpha((int) (ThemePreviewActivity.this.dimmingSlider.getAlpha() * 30.0f));
                            canvas.drawRoundRect(rectF, fDp, fDp, this.dimPaint);
                            super.dispatchDraw(canvas);
                        }
                    };
                    this.dimmingSliderContainer = frameLayout211;
                    frameLayout211.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                    this.page2.addView(this.dimmingSliderContainer, LayoutHelper.createFrame(222, 76, 49));
                    SliderView sliderView9 = new SliderView(getContext(), 3) {
                        @Override
                        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                            if (getParent() != null) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    };
                    this.dimmingSlider = sliderView9;
                    sliderView9.setValue(this.dimAmount);
                    this.dimmingSlider.setMinMax(0.0f, 0.9f);
                    this.dimmingSlider.setOnValueChange(new Utilities.Callback() {
                        @Override
                        public final void run(Object obj5) {
                            ThemePreviewActivity.m4677$r8$lambda$1NbvpStwepfVDa_AAqQbAYfgNA(this.f$0, (Float) obj5);
                        }
                    });
                    this.dimmingSliderContainer.addView(this.dimmingSlider);
                    dayNightSwitchDelegate = this.onSwitchDayNightDelegate;
                    if (dayNightSwitchDelegate != null) {
                        SliderView sliderView10 = this.dimmingSlider;
                        if (dayNightSwitchDelegate.isDark()) {
                            i23 = 0;
                        } else {
                            i23 = 8;
                        }
                        sliderView10.setVisibility(i23);
                        SliderView sliderView11 = this.dimmingSlider;
                        if (this.onSwitchDayNightDelegate.isDark()) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        sliderView11.setAlpha(f10);
                        SliderView sliderView12 = this.dimmingSlider;
                        if (this.onSwitchDayNightDelegate.isDark()) {
                            f11 = this.dimAmount;
                        } else {
                            f11 = 0.0f;
                        }
                        sliderView12.setValue(f11);
                    }
                }
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
            if (this.screenType != 1) {
                if (obj instanceof WallpapersListActivity.ColorWallpaper) {
                }
                i6 = 3;
            } else {
                if (obj instanceof WallpapersListActivity.ColorWallpaper) {
                }
                i6 = 3;
            }
            strArr = new String[i6];
            iArr = new int[i6];
            this.backgroundCheckBoxView = new WallpaperCheckBoxView[i6];
            if (i6 != 0) {
                this.backgroundButtonsContainer = new FrameLayout(context);
                if (this.screenType != 1) {
                    strArr[0] = LocaleController.getString(R.string.BackgroundColors);
                    strArr[1] = LocaleController.getString(R.string.BackgroundPattern);
                    strArr[2] = LocaleController.getString(R.string.BackgroundMotion);
                } else {
                    strArr[0] = LocaleController.getString(R.string.BackgroundColors);
                    strArr[1] = LocaleController.getString(R.string.BackgroundPattern);
                    strArr[2] = LocaleController.getString(R.string.BackgroundMotion);
                }
                iMax = 0;
                while (i20 < i6) {
                    int iCeil5 = (int) Math.ceil(textPaint.measureText(strArr[i20]));
                    iArr[i20] = iCeil5;
                    iMax = Math.max(iMax, iCeil5);
                }
                FrameLayout frameLayout212 = new FrameLayout(context) {
                    private RectF rect = new RectF();

                    @Override
                    protected void onDraw(Canvas canvas) {
                        this.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        Theme.applyServiceShaderMatrixForView(ThemePreviewActivity.this.backgroundPlayAnimationView, ThemePreviewActivity.this.backgroundImage, ThemePreviewActivity.this.themeDelegate);
                        canvas.drawRoundRect(this.rect, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ThemePreviewActivity.this.themeDelegate.getPaint("paintChatActionBackground"));
                        if (Theme.hasGradientService()) {
                            canvas.drawRoundRect(this.rect, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ThemePreviewActivity.this.themeDelegate.getPaint("paintChatActionBackgroundDarken"));
                        }
                    }
                };
                this.backgroundPlayAnimationView = frameLayout212;
                frameLayout212.setWillNotDraw(false);
                FrameLayout frameLayout213 = this.backgroundPlayAnimationView;
                if (this.backgroundGradientColor1 != 0) {
                    i21 = 0;
                } else {
                    i21 = 4;
                }
                frameLayout213.setVisibility(i21);
                FrameLayout frameLayout214 = this.backgroundPlayAnimationView;
                if (this.backgroundGradientColor1 != 0) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.1f;
                }
                frameLayout214.setScaleX(f7);
                FrameLayout frameLayout215 = this.backgroundPlayAnimationView;
                if (this.backgroundGradientColor1 != 0) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.1f;
                }
                frameLayout215.setScaleY(f8);
                FrameLayout frameLayout216 = this.backgroundPlayAnimationView;
                if (this.backgroundGradientColor1 != 0) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                frameLayout216.setAlpha(f9);
                FrameLayout frameLayout118 = this.backgroundPlayAnimationView;
                if (this.backgroundGradientColor1 != 0) {
                    num = 1;
                } else {
                    num = null;
                }
                frameLayout118.setTag(num);
                this.backgroundButtonsContainer.addView(this.backgroundPlayAnimationView, LayoutHelper.createFrame(48, 48, 17));
                this.backgroundPlayAnimationView.setOnClickListener(new View.OnClickListener() {
                    int rotation = 0;

                    @Override
                    public void onClick(View view3) {
                        ThemePreviewActivity.this.backgroundPlayAnimationImageView.setRotation(this.rotation);
                        this.rotation -= 45;
                        ThemePreviewActivity.this.backgroundPlayAnimationImageView.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
                        if (ThemePreviewActivity.this.backgroundImages[0] != null) {
                            Drawable background = ThemePreviewActivity.this.backgroundImages[0].getBackground();
                            if (!(background instanceof MotionBackgroundDrawable)) {
                                ThemePreviewActivity.this.onColorsRotate();
                            } else {
                                ((MotionBackgroundDrawable) background).switchToNextPosition();
                            }
                        }
                        if (ThemePreviewActivity.this.backgroundImages[1] != null) {
                            Drawable background2 = ThemePreviewActivity.this.backgroundImages[1].getBackground();
                            if (background2 instanceof MotionBackgroundDrawable) {
                                ((MotionBackgroundDrawable) background2).switchToNextPosition();
                            }
                        }
                    }
                });
                ImageView imageView5 = new ImageView(context);
                this.backgroundPlayAnimationImageView = imageView5;
                imageView5.setScaleType(ImageView.ScaleType.CENTER);
                this.backgroundPlayAnimationImageView.setImageResource(R.drawable.bg_rotate_large);
                this.backgroundPlayAnimationView.addView(this.backgroundPlayAnimationImageView, LayoutHelper.createFrame(-2, -2, 17));
            } else {
                iMax = 0;
            }
            i7 = 0;
            while (i7 < i6) {
                this.backgroundCheckBoxView[i7] = new WallpaperCheckBoxView(context, (this.screenType == 1 && !(this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper)) || i7 != 0, this.backgroundImage, this.themeDelegate);
                this.backgroundCheckBoxView[i7].setBackgroundColor(this.backgroundColor);
                this.backgroundCheckBoxView[i7].setText(strArr[i7], iArr[i7], iMax);
                if (this.screenType == 1) {
                    if (i7 == 1) {
                        WallpaperCheckBoxView wallpaperCheckBoxView8 = this.backgroundCheckBoxView[i7];
                        if (this.selectedPattern == null) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        wallpaperCheckBoxView8.setChecked(z3, false);
                    } else if (i7 == 2) {
                        this.backgroundCheckBoxView[i7].setChecked(this.isMotion, false);
                    }
                } else if (i7 == 1) {
                    WallpaperCheckBoxView wallpaperCheckBoxView9 = this.backgroundCheckBoxView[i7];
                    if (this.selectedPattern == null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    wallpaperCheckBoxView9.setChecked(z3, false);
                } else if (i7 == 2) {
                    this.backgroundCheckBoxView[i7].setChecked(this.isMotion, false);
                }
                iDp3 = AndroidUtilities.dp(56.0f) + iMax;
                layoutParams2 = new FrameLayout.LayoutParams(iDp3, -2);
                layoutParams2.gravity = 17;
                if (i6 == 3) {
                    if (i7 != 0) {
                        layoutParams2.leftMargin = (iDp3 / 2) + AndroidUtilities.dp(10.0f);
                    } else {
                        layoutParams2.leftMargin = (iDp3 / 2) + AndroidUtilities.dp(10.0f);
                    }
                } else if (i7 == 1) {
                    layoutParams2.leftMargin = (iDp3 / 2) + AndroidUtilities.dp(10.0f);
                } else {
                    layoutParams2.rightMargin = (iDp3 / 2) + AndroidUtilities.dp(10.0f);
                }
                this.backgroundButtonsContainer.addView(this.backgroundCheckBoxView[i7], layoutParams2);
                final WallpaperCheckBoxView wallpaperCheckBoxView10 = this.backgroundCheckBoxView[i7];
                wallpaperCheckBoxView10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        ThemePreviewActivity.$r8$lambda$gw7VHMT_d8xxvRDe8qqoA1688xs(this.f$0, i7, wallpaperCheckBoxView10, view3);
                    }
                });
                if (i7 == 2) {
                    this.backgroundCheckBoxView[i7].setAlpha(0.0f);
                    this.backgroundCheckBoxView[i7].setVisibility(4);
                }
                i7++;
            }
            i8 = 1;
            if (this.screenType == 1) {
                iArr2 = new int[2];
                this.messagesCheckBoxView = new WallpaperCheckBoxView[2];
                this.messagesButtonsContainer = new FrameLayout(context);
                strArr2 = new String[]{LocaleController.getString(R.string.BackgroundAnimate), LocaleController.getString(R.string.BackgroundColors)};
                i17 = 0;
                iMax2 = 0;
                while (i17 < i16) {
                    int iCeil6 = (int) Math.ceil(textPaint.measureText(strArr2[i17]));
                    iArr2[i17] = iCeil6;
                    iMax2 = Math.max(iMax2, iCeil6);
                    i17++;
                }
                if (this.accent != null) {
                    FrameLayout frameLayout119 = new FrameLayout(context) {
                        private RectF rect = new RectF();

                        @Override
                        protected void onDraw(Canvas canvas) {
                            this.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                            Theme.applyServiceShaderMatrixForView(ThemePreviewActivity.this.messagesPlayAnimationView, ThemePreviewActivity.this.backgroundImage, ThemePreviewActivity.this.themeDelegate);
                            canvas.drawRoundRect(this.rect, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ThemePreviewActivity.this.themeDelegate.getPaint("paintChatActionBackground"));
                            if (Theme.hasGradientService()) {
                                canvas.drawRoundRect(this.rect, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ThemePreviewActivity.this.themeDelegate.getPaint("paintChatActionBackgroundDarken"));
                            }
                        }
                    };
                    this.messagesPlayAnimationView = frameLayout119;
                    frameLayout119.setWillNotDraw(false);
                    FrameLayout frameLayout1110 = this.messagesPlayAnimationView;
                    if (this.accent.myMessagesGradientAccentColor1 != 0) {
                        i18 = 0;
                    } else {
                        i18 = 4;
                    }
                    frameLayout1110.setVisibility(i18);
                    FrameLayout frameLayout1111 = this.messagesPlayAnimationView;
                    if (this.accent.myMessagesGradientAccentColor1 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = 0.1f;
                    }
                    frameLayout1111.setScaleX(f4);
                    FrameLayout frameLayout1112 = this.messagesPlayAnimationView;
                    if (this.accent.myMessagesGradientAccentColor1 != 0) {
                        f5 = 1.0f;
                    } else {
                        f5 = 0.1f;
                    }
                    frameLayout1112.setScaleY(f5);
                    FrameLayout frameLayout1113 = this.messagesPlayAnimationView;
                    if (this.accent.myMessagesGradientAccentColor1 != 0) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    frameLayout1113.setAlpha(f6);
                    this.messagesButtonsContainer.addView(this.messagesPlayAnimationView, LayoutHelper.createFrame(48, 48, 17));
                    this.messagesPlayAnimationView.setOnClickListener(new View.OnClickListener() {
                        int rotation = 0;

                        @Override
                        public void onClick(View view3) {
                            ThemePreviewActivity.this.messagesPlayAnimationImageView.setRotation(this.rotation);
                            this.rotation -= 45;
                            ThemePreviewActivity.this.messagesPlayAnimationImageView.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
                            if (!ThemePreviewActivity.this.accent.myMessagesAnimated) {
                                if (ThemePreviewActivity.this.accent.myMessagesGradientAccentColor3 != 0) {
                                    int i312 = ThemePreviewActivity.this.accent.myMessagesAccentColor != 0 ? ThemePreviewActivity.this.accent.myMessagesAccentColor : ThemePreviewActivity.this.accent.accentColor;
                                    ThemePreviewActivity.this.accent.myMessagesAccentColor = ThemePreviewActivity.this.accent.myMessagesGradientAccentColor1;
                                    ThemePreviewActivity.this.accent.myMessagesGradientAccentColor1 = ThemePreviewActivity.this.accent.myMessagesGradientAccentColor2;
                                    ThemePreviewActivity.this.accent.myMessagesGradientAccentColor2 = ThemePreviewActivity.this.accent.myMessagesGradientAccentColor3;
                                    ThemePreviewActivity.this.accent.myMessagesGradientAccentColor3 = i312;
                                } else {
                                    int i313 = ThemePreviewActivity.this.accent.myMessagesAccentColor != 0 ? ThemePreviewActivity.this.accent.myMessagesAccentColor : ThemePreviewActivity.this.accent.accentColor;
                                    ThemePreviewActivity.this.accent.myMessagesAccentColor = ThemePreviewActivity.this.accent.myMessagesGradientAccentColor1;
                                    ThemePreviewActivity.this.accent.myMessagesGradientAccentColor1 = ThemePreviewActivity.this.accent.myMessagesGradientAccentColor2;
                                    ThemePreviewActivity.this.accent.myMessagesGradientAccentColor2 = i313;
                                }
                                ThemePreviewActivity.this.colorPicker.setColor(ThemePreviewActivity.this.accent.myMessagesGradientAccentColor3, 3);
                                ThemePreviewActivity.this.colorPicker.setColor(ThemePreviewActivity.this.accent.myMessagesGradientAccentColor2, 2);
                                ThemePreviewActivity.this.colorPicker.setColor(ThemePreviewActivity.this.accent.myMessagesGradientAccentColor1, 1);
                                ThemePreviewActivity.this.colorPicker.setColor(ThemePreviewActivity.this.accent.myMessagesAccentColor != 0 ? ThemePreviewActivity.this.accent.myMessagesAccentColor : ThemePreviewActivity.this.accent.accentColor, 0);
                                ThemePreviewActivity.this.messagesCheckBoxView[1].setColor(0, ThemePreviewActivity.this.accent.myMessagesAccentColor);
                                ThemePreviewActivity.this.messagesCheckBoxView[1].setColor(1, ThemePreviewActivity.this.accent.myMessagesGradientAccentColor1);
                                ThemePreviewActivity.this.messagesCheckBoxView[1].setColor(2, ThemePreviewActivity.this.accent.myMessagesGradientAccentColor2);
                                ThemePreviewActivity.this.messagesCheckBoxView[1].setColor(3, ThemePreviewActivity.this.accent.myMessagesGradientAccentColor3);
                                Theme.refreshThemeColors(true, true);
                                ThemePreviewActivity.this.listView2.invalidateViews();
                                return;
                            }
                            if (ThemePreviewActivity.this.msgOutDrawable.getMotionBackgroundDrawable() != null) {
                                ThemePreviewActivity.this.msgOutDrawable.getMotionBackgroundDrawable().switchToNextPosition();
                            }
                        }
                    });
                    ImageView imageView6 = new ImageView(context);
                    this.messagesPlayAnimationImageView = imageView6;
                    imageView6.setScaleType(ImageView.ScaleType.CENTER);
                    this.messagesPlayAnimationImageView.setImageResource(R.drawable.bg_rotate_large);
                    this.messagesPlayAnimationView.addView(this.messagesPlayAnimationImageView, LayoutHelper.createFrame(-2, -2, 17));
                    while (i19 < 2) {
                        WallpaperCheckBoxView[] wallpaperCheckBoxViewArr3 = this.messagesCheckBoxView;
                        if (i19 == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        wallpaperCheckBoxViewArr3[i19] = new WallpaperCheckBoxView(context, z2, this.backgroundImage, this.themeDelegate);
                        this.messagesCheckBoxView[i19].setText(strArr2[i19], iArr2[i19], iMax2);
                        if (i19 == 0) {
                            this.messagesCheckBoxView[i19].setChecked(this.accent.myMessagesAnimated, false);
                        }
                        iDp2 = AndroidUtilities.dp(56.0f) + iMax2;
                        layoutParams = new FrameLayout.LayoutParams(iDp2, -2);
                        layoutParams.gravity = 17;
                        if (i19 == 1) {
                            layoutParams.leftMargin = (iDp2 / 2) + AndroidUtilities.dp(10.0f);
                        } else {
                            layoutParams.rightMargin = (iDp2 / 2) + AndroidUtilities.dp(10.0f);
                        }
                        this.messagesButtonsContainer.addView(this.messagesCheckBoxView[i19], layoutParams);
                        final WallpaperCheckBoxView wallpaperCheckBoxView11 = this.messagesCheckBoxView[i19];
                        wallpaperCheckBoxView11.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view3) {
                                ThemePreviewActivity.$r8$lambda$g4zxTy8DWZDBESqlEGMhg5NKfYI(this.f$0, i19, wallpaperCheckBoxView11, view3);
                            }
                        });
                    }
                }
                i8 = 1;
            }
            if (this.screenType != i8) {
                this.isBlurred = false;
                while (i9 < 2) {
                    this.patternLayout[i9] = new FrameLayout(context) {
                        @Override
                        public void onDraw(Canvas canvas) {
                            if (i9 == 0) {
                                ThemePreviewActivity.this.sheetDrawable.setBounds(ThemePreviewActivity.this.colorPicker.getLeft() - rect.left, 0, ThemePreviewActivity.this.colorPicker.getRight() + rect.right, getMeasuredHeight());
                            } else {
                                ThemePreviewActivity.this.sheetDrawable.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                            }
                            ThemePreviewActivity.this.sheetDrawable.draw(canvas);
                        }
                    };
                    if (i9 != 1) {
                        this.patternLayout[i9].setVisibility(4);
                    } else {
                        this.patternLayout[i9].setVisibility(4);
                    }
                    this.patternLayout[i9].setWillNotDraw(false);
                    if (this.screenType == 2) {
                        if (i9 == 0) {
                            i15 = 321;
                        } else {
                            i15 = 316;
                        }
                        layoutParamsCreateFrame = LayoutHelper.createFrame(-1, i15, 83);
                    } else {
                        if (i9 == 0) {
                            i10 = 273;
                        } else {
                            i10 = 316;
                        }
                        layoutParamsCreateFrame = LayoutHelper.createFrame(-1, i10, 83);
                    }
                    if (i9 == 0) {
                        if (this.screenType == 2) {
                            i14 = 321;
                        } else {
                            i14 = 273;
                        }
                        f3 = i14;
                    } else {
                        f3 = 316.0f;
                    }
                    layoutParamsCreateFrame.height = AndroidUtilities.dp(f3);
                    if (insideBottomSheet()) {
                        layoutParamsCreateFrame.height += AndroidUtilities.navigationBarHeight;
                    }
                    if (i9 == 0) {
                        Drawable drawable4 = this.sheetDrawable;
                        Rect rect5 = AndroidUtilities.rectTmp2;
                        drawable4.getPadding(rect5);
                        layoutParamsCreateFrame.height += AndroidUtilities.dp(12.0f) + rect5.top;
                    }
                    FrameLayout frameLayout1114 = this.patternLayout[i9];
                    if (i9 == 0) {
                        iDp = AndroidUtilities.dp(12.0f) + rect.top;
                    } else {
                        iDp = 0;
                    }
                    if (insideBottomSheet()) {
                        i11 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i11 = 0;
                    }
                    frameLayout1114.setPadding(0, iDp, 0, i11);
                    this.page2.addView(this.patternLayout[i9], layoutParamsCreateFrame);
                    if (i9 != 1) {
                        this.patternsButtonsContainer[i9] = new FrameLayout(context) {
                            Paint paint = new Paint();

                            @Override
                            public void onDraw(Canvas canvas) {
                                int intrinsicHeight = Theme.chat_composeShadowDrawable.getIntrinsicHeight();
                                Theme.chat_composeShadowDrawable.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                                Theme.chat_composeShadowDrawable.draw(canvas);
                                this.paint.setColor(ThemePreviewActivity.this.getThemedColor(Theme.key_chat_messagePanelBackground));
                                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), this.paint);
                            }
                        };
                        this.patternsButtonsContainer[i9].setWillNotDraw(false);
                        this.patternsButtonsContainer[i9].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        this.patternsButtonsContainer[i9].setClickable(true);
                        this.patternLayout[i9].addView(this.patternsButtonsContainer[i9], LayoutHelper.createFrame(-1, 51, 80));
                        this.patternsCancelButton[i9] = new TextView(context);
                        this.patternsCancelButton[i9].setTextSize(1, 15.0f);
                        this.patternsCancelButton[i9].setTypeface(AndroidUtilities.bold());
                        TextView textView19 = this.patternsCancelButton[i9];
                        int i312 = Theme.key_chat_fieldOverlayText;
                        textView19.setTextColor(getThemedColor(i312));
                        this.patternsCancelButton[i9].setText(LocaleController.getString(R.string.Cancel));
                        this.patternsCancelButton[i9].setGravity(17);
                        this.patternsCancelButton[i9].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView110 = this.patternsCancelButton[i9];
                        int i313 = Theme.key_listSelector;
                        textView110.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i313), 0));
                        this.patternsButtonsContainer[i9].addView(this.patternsCancelButton[i9], LayoutHelper.createFrame(-2, -1, 51));
                        this.patternsCancelButton[i9].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view3) {
                                ThemePreviewActivity.$r8$lambda$2_eHBBt6BCIuI7vPNNwgGWViXxk(this.f$0, i9, view3);
                            }
                        });
                        this.patternsSaveButton[i9] = new TextView(context);
                        this.patternsSaveButton[i9].setTextSize(1, 15.0f);
                        this.patternsSaveButton[i9].setTypeface(AndroidUtilities.bold());
                        this.patternsSaveButton[i9].setTextColor(getThemedColor(i312));
                        this.patternsSaveButton[i9].setText(LocaleController.getString(R.string.ApplyTheme));
                        this.patternsSaveButton[i9].setGravity(17);
                        this.patternsSaveButton[i9].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        this.patternsSaveButton[i9].setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i313), 0));
                        this.patternsButtonsContainer[i9].addView(this.patternsSaveButton[i9], LayoutHelper.createFrame(-2, -1, 53));
                        this.patternsSaveButton[i9].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view3) {
                                ThemePreviewActivity.$r8$lambda$SYZDOhqtZEiS6wgO2ZfYZSofEVQ(this.f$0, i9, view3);
                            }
                        });
                    } else {
                        this.patternsButtonsContainer[i9] = new FrameLayout(context) {
                            Paint paint = new Paint();

                            @Override
                            public void onDraw(Canvas canvas) {
                                int intrinsicHeight = Theme.chat_composeShadowDrawable.getIntrinsicHeight();
                                Theme.chat_composeShadowDrawable.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                                Theme.chat_composeShadowDrawable.draw(canvas);
                                this.paint.setColor(ThemePreviewActivity.this.getThemedColor(Theme.key_chat_messagePanelBackground));
                                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), this.paint);
                            }
                        };
                        this.patternsButtonsContainer[i9].setWillNotDraw(false);
                        this.patternsButtonsContainer[i9].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        this.patternsButtonsContainer[i9].setClickable(true);
                        this.patternLayout[i9].addView(this.patternsButtonsContainer[i9], LayoutHelper.createFrame(-1, 51, 80));
                        this.patternsCancelButton[i9] = new TextView(context);
                        this.patternsCancelButton[i9].setTextSize(1, 15.0f);
                        this.patternsCancelButton[i9].setTypeface(AndroidUtilities.bold());
                        TextView textView111 = this.patternsCancelButton[i9];
                        int i314 = Theme.key_chat_fieldOverlayText;
                        textView111.setTextColor(getThemedColor(i314));
                        this.patternsCancelButton[i9].setText(LocaleController.getString(R.string.Cancel));
                        this.patternsCancelButton[i9].setGravity(17);
                        this.patternsCancelButton[i9].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView112 = this.patternsCancelButton[i9];
                        int i315 = Theme.key_listSelector;
                        textView112.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i315), 0));
                        this.patternsButtonsContainer[i9].addView(this.patternsCancelButton[i9], LayoutHelper.createFrame(-2, -1, 51));
                        this.patternsCancelButton[i9].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view3) {
                                ThemePreviewActivity.$r8$lambda$2_eHBBt6BCIuI7vPNNwgGWViXxk(this.f$0, i9, view3);
                            }
                        });
                        this.patternsSaveButton[i9] = new TextView(context);
                        this.patternsSaveButton[i9].setTextSize(1, 15.0f);
                        this.patternsSaveButton[i9].setTypeface(AndroidUtilities.bold());
                        this.patternsSaveButton[i9].setTextColor(getThemedColor(i314));
                        this.patternsSaveButton[i9].setText(LocaleController.getString(R.string.ApplyTheme));
                        this.patternsSaveButton[i9].setGravity(17);
                        this.patternsSaveButton[i9].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        this.patternsSaveButton[i9].setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i315), 0));
                        this.patternsButtonsContainer[i9].addView(this.patternsSaveButton[i9], LayoutHelper.createFrame(-2, -1, 53));
                        this.patternsSaveButton[i9].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view3) {
                                ThemePreviewActivity.$r8$lambda$SYZDOhqtZEiS6wgO2ZfYZSofEVQ(this.f$0, i9, view3);
                            }
                        });
                    }
                    if (i9 == 1) {
                        TextView textView113 = new TextView(context);
                        this.patternTitleView = textView113;
                        textView113.setLines(1);
                        this.patternTitleView.setSingleLine(true);
                        this.patternTitleView.setText(LocaleController.getString(R.string.BackgroundChoosePattern));
                        this.patternTitleView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                        this.patternTitleView.setTextSize(1, 20.0f);
                        this.patternTitleView.setTypeface(AndroidUtilities.bold());
                        this.patternTitleView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
                        this.patternTitleView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                        this.patternTitleView.setGravity(16);
                        this.patternLayout[i9].addView(this.patternTitleView, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                        RecyclerListView recyclerListView12 = new RecyclerListView(context) {
                            @Override
                            public boolean onTouchEvent(MotionEvent motionEvent) {
                                if (motionEvent.getAction() == 0) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                return super.onTouchEvent(motionEvent);
                            }
                        };
                        this.patternsListView = recyclerListView12;
                        LinearLayoutManager linearLayoutManager4 = new LinearLayoutManager(context, 0, false);
                        this.patternsLayoutManager = linearLayoutManager4;
                        recyclerListView12.setLayoutManager(linearLayoutManager4);
                        RecyclerListView recyclerListView13 = this.patternsListView;
                        PatternsAdapter patternsAdapter4 = new PatternsAdapter(context);
                        this.patternsAdapter = patternsAdapter4;
                        recyclerListView13.setAdapter(patternsAdapter4);
                        this.patternsListView.addItemDecoration(new RecyclerView.ItemDecoration() {
                            @Override
                            public void getItemOffsets(Rect rect6, View view3, RecyclerView recyclerView, RecyclerView.State state) {
                                int childAdapterPosition = recyclerView.getChildAdapterPosition(view3);
                                rect6.left = AndroidUtilities.dp(12.0f);
                                rect6.top = 0;
                                rect6.bottom = 0;
                                if (childAdapterPosition == state.getItemCount() - 1) {
                                    rect6.right = AndroidUtilities.dp(12.0f);
                                }
                            }
                        });
                        this.patternLayout[i9].addView(this.patternsListView, LayoutHelper.createFrame(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                        this.patternsListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                            @Override
                            public final void onItemClick(View view3, int i316) {
                                ThemePreviewActivity.$r8$lambda$5Ocn8fX67CEAIw11qzaYjS5qRUs(this.f$0, view3, i316);
                            }
                        });
                        HeaderCell headerCell4 = new HeaderCell(context);
                        this.intensityCell = headerCell4;
                        headerCell4.setText(LocaleController.getString(R.string.BackgroundIntensity));
                        this.patternLayout[i9].addView(this.intensityCell, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                        SeekBarView seekBarView4 = new SeekBarView(context, getResourceProvider()) {
                            @Override
                            public boolean onTouchEvent(MotionEvent motionEvent) {
                                if (motionEvent.getAction() == 0) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                return super.onTouchEvent(motionEvent);
                            }
                        };
                        this.intensitySeekBar = seekBarView4;
                        seekBarView4.setProgress(this.currentIntensity);
                        this.intensitySeekBar.setReportChanges(true);
                        this.intensitySeekBar.setDelegate(new SeekBarView.SeekBarViewDelegate() {
                            @Override
                            public CharSequence getContentDescription() {
                                return SeekBarView.SeekBarViewDelegate.CC.$default$getContentDescription(this);
                            }

                            @Override
                            public int getStepsCount() {
                                return SeekBarView.SeekBarViewDelegate.CC.$default$getStepsCount(this);
                            }

                            @Override
                            public boolean needVisuallyDivideSteps() {
                                return SeekBarView.SeekBarViewDelegate.CC.$default$needVisuallyDivideSteps(this);
                            }

                            @Override
                            public void onSeekBarPressed(boolean z5) {
                            }

                            @Override
                            public void onSeekBarDrag(boolean z5, float f13) {
                                ThemePreviewActivity.this.currentIntensity = f13;
                                ThemePreviewActivity.this.updateIntensity();
                            }
                        });
                        this.patternLayout[i9].addView(this.intensitySeekBar, LayoutHelper.createFrame(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                    } else {
                        ColorPicker colorPicker4 = new ColorPicker(context, this.editingTheme, new AnonymousClass26());
                        this.colorPicker = colorPicker4;
                        colorPicker4.setResourcesProvider(getResourceProvider());
                        if (this.screenType == 1) {
                            this.patternLayout[i9].addView(this.colorPicker, LayoutHelper.createFrame(-1, -1, 1));
                            if (this.applyingTheme.isDark()) {
                                this.colorPicker.setMinBrightness(0.2f);
                            } else {
                                this.colorPicker.setMinBrightness(0.05f);
                                this.colorPicker.setMaxBrightness(0.8f);
                            }
                            themeAccent = this.accent;
                            if (themeAccent != null) {
                                if (themeAccent.accentColor2 != 0) {
                                    i12 = 2;
                                } else {
                                    i12 = 1;
                                }
                                this.colorPicker.setType(1, hasChanges(1), 2, i12, false, 0, false);
                                this.colorPicker.setColor(this.accent.accentColor, 0);
                                i13 = this.accent.accentColor2;
                                if (i13 != 0) {
                                    this.colorPicker.setColor(i13, 1);
                                }
                            }
                        } else {
                            this.patternLayout[i9].addView(this.colorPicker, LayoutHelper.createFrame(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                        }
                    }
                }
            } else {
                this.isBlurred = false;
                while (i9 < 2) {
                    this.patternLayout[i9] = new FrameLayout(context) {
                        @Override
                        public void onDraw(Canvas canvas) {
                            if (i9 == 0) {
                                ThemePreviewActivity.this.sheetDrawable.setBounds(ThemePreviewActivity.this.colorPicker.getLeft() - rect.left, 0, ThemePreviewActivity.this.colorPicker.getRight() + rect.right, getMeasuredHeight());
                            } else {
                                ThemePreviewActivity.this.sheetDrawable.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                            }
                            ThemePreviewActivity.this.sheetDrawable.draw(canvas);
                        }
                    };
                    if (i9 != 1) {
                        this.patternLayout[i9].setVisibility(4);
                    } else {
                        this.patternLayout[i9].setVisibility(4);
                    }
                    this.patternLayout[i9].setWillNotDraw(false);
                    if (this.screenType == 2) {
                        if (i9 == 0) {
                            i15 = 321;
                        } else {
                            i15 = 316;
                        }
                        layoutParamsCreateFrame = LayoutHelper.createFrame(-1, i15, 83);
                    } else {
                        if (i9 == 0) {
                            i10 = 273;
                        } else {
                            i10 = 316;
                        }
                        layoutParamsCreateFrame = LayoutHelper.createFrame(-1, i10, 83);
                    }
                    if (i9 == 0) {
                        if (this.screenType == 2) {
                            i14 = 321;
                        } else {
                            i14 = 273;
                        }
                        f3 = i14;
                    } else {
                        f3 = 316.0f;
                    }
                    layoutParamsCreateFrame.height = AndroidUtilities.dp(f3);
                    if (insideBottomSheet()) {
                        layoutParamsCreateFrame.height += AndroidUtilities.navigationBarHeight;
                    }
                    if (i9 == 0) {
                        Drawable drawable5 = this.sheetDrawable;
                        Rect rect6 = AndroidUtilities.rectTmp2;
                        drawable5.getPadding(rect6);
                        layoutParamsCreateFrame.height += AndroidUtilities.dp(12.0f) + rect6.top;
                    }
                    FrameLayout frameLayout1115 = this.patternLayout[i9];
                    if (i9 == 0) {
                        iDp = AndroidUtilities.dp(12.0f) + rect.top;
                    } else {
                        iDp = 0;
                    }
                    if (insideBottomSheet()) {
                        i11 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i11 = 0;
                    }
                    frameLayout1115.setPadding(0, iDp, 0, i11);
                    this.page2.addView(this.patternLayout[i9], layoutParamsCreateFrame);
                    if (i9 != 1) {
                        this.patternsButtonsContainer[i9] = new FrameLayout(context) {
                            Paint paint = new Paint();

                            @Override
                            public void onDraw(Canvas canvas) {
                                int intrinsicHeight = Theme.chat_composeShadowDrawable.getIntrinsicHeight();
                                Theme.chat_composeShadowDrawable.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                                Theme.chat_composeShadowDrawable.draw(canvas);
                                this.paint.setColor(ThemePreviewActivity.this.getThemedColor(Theme.key_chat_messagePanelBackground));
                                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), this.paint);
                            }
                        };
                        this.patternsButtonsContainer[i9].setWillNotDraw(false);
                        this.patternsButtonsContainer[i9].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        this.patternsButtonsContainer[i9].setClickable(true);
                        this.patternLayout[i9].addView(this.patternsButtonsContainer[i9], LayoutHelper.createFrame(-1, 51, 80));
                        this.patternsCancelButton[i9] = new TextView(context);
                        this.patternsCancelButton[i9].setTextSize(1, 15.0f);
                        this.patternsCancelButton[i9].setTypeface(AndroidUtilities.bold());
                        TextView textView114 = this.patternsCancelButton[i9];
                        int i316 = Theme.key_chat_fieldOverlayText;
                        textView114.setTextColor(getThemedColor(i316));
                        this.patternsCancelButton[i9].setText(LocaleController.getString(R.string.Cancel));
                        this.patternsCancelButton[i9].setGravity(17);
                        this.patternsCancelButton[i9].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView115 = this.patternsCancelButton[i9];
                        int i317 = Theme.key_listSelector;
                        textView115.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i317), 0));
                        this.patternsButtonsContainer[i9].addView(this.patternsCancelButton[i9], LayoutHelper.createFrame(-2, -1, 51));
                        this.patternsCancelButton[i9].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view3) {
                                ThemePreviewActivity.$r8$lambda$2_eHBBt6BCIuI7vPNNwgGWViXxk(this.f$0, i9, view3);
                            }
                        });
                        this.patternsSaveButton[i9] = new TextView(context);
                        this.patternsSaveButton[i9].setTextSize(1, 15.0f);
                        this.patternsSaveButton[i9].setTypeface(AndroidUtilities.bold());
                        this.patternsSaveButton[i9].setTextColor(getThemedColor(i316));
                        this.patternsSaveButton[i9].setText(LocaleController.getString(R.string.ApplyTheme));
                        this.patternsSaveButton[i9].setGravity(17);
                        this.patternsSaveButton[i9].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        this.patternsSaveButton[i9].setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i317), 0));
                        this.patternsButtonsContainer[i9].addView(this.patternsSaveButton[i9], LayoutHelper.createFrame(-2, -1, 53));
                        this.patternsSaveButton[i9].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view3) {
                                ThemePreviewActivity.$r8$lambda$SYZDOhqtZEiS6wgO2ZfYZSofEVQ(this.f$0, i9, view3);
                            }
                        });
                    } else {
                        this.patternsButtonsContainer[i9] = new FrameLayout(context) {
                            Paint paint = new Paint();

                            @Override
                            public void onDraw(Canvas canvas) {
                                int intrinsicHeight = Theme.chat_composeShadowDrawable.getIntrinsicHeight();
                                Theme.chat_composeShadowDrawable.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                                Theme.chat_composeShadowDrawable.draw(canvas);
                                this.paint.setColor(ThemePreviewActivity.this.getThemedColor(Theme.key_chat_messagePanelBackground));
                                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), this.paint);
                            }
                        };
                        this.patternsButtonsContainer[i9].setWillNotDraw(false);
                        this.patternsButtonsContainer[i9].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        this.patternsButtonsContainer[i9].setClickable(true);
                        this.patternLayout[i9].addView(this.patternsButtonsContainer[i9], LayoutHelper.createFrame(-1, 51, 80));
                        this.patternsCancelButton[i9] = new TextView(context);
                        this.patternsCancelButton[i9].setTextSize(1, 15.0f);
                        this.patternsCancelButton[i9].setTypeface(AndroidUtilities.bold());
                        TextView textView116 = this.patternsCancelButton[i9];
                        int i318 = Theme.key_chat_fieldOverlayText;
                        textView116.setTextColor(getThemedColor(i318));
                        this.patternsCancelButton[i9].setText(LocaleController.getString(R.string.Cancel));
                        this.patternsCancelButton[i9].setGravity(17);
                        this.patternsCancelButton[i9].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView117 = this.patternsCancelButton[i9];
                        int i319 = Theme.key_listSelector;
                        textView117.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i319), 0));
                        this.patternsButtonsContainer[i9].addView(this.patternsCancelButton[i9], LayoutHelper.createFrame(-2, -1, 51));
                        this.patternsCancelButton[i9].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view3) {
                                ThemePreviewActivity.$r8$lambda$2_eHBBt6BCIuI7vPNNwgGWViXxk(this.f$0, i9, view3);
                            }
                        });
                        this.patternsSaveButton[i9] = new TextView(context);
                        this.patternsSaveButton[i9].setTextSize(1, 15.0f);
                        this.patternsSaveButton[i9].setTypeface(AndroidUtilities.bold());
                        this.patternsSaveButton[i9].setTextColor(getThemedColor(i318));
                        this.patternsSaveButton[i9].setText(LocaleController.getString(R.string.ApplyTheme));
                        this.patternsSaveButton[i9].setGravity(17);
                        this.patternsSaveButton[i9].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        this.patternsSaveButton[i9].setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i319), 0));
                        this.patternsButtonsContainer[i9].addView(this.patternsSaveButton[i9], LayoutHelper.createFrame(-2, -1, 53));
                        this.patternsSaveButton[i9].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view3) {
                                ThemePreviewActivity.$r8$lambda$SYZDOhqtZEiS6wgO2ZfYZSofEVQ(this.f$0, i9, view3);
                            }
                        });
                    }
                    if (i9 == 1) {
                        TextView textView118 = new TextView(context);
                        this.patternTitleView = textView118;
                        textView118.setLines(1);
                        this.patternTitleView.setSingleLine(true);
                        this.patternTitleView.setText(LocaleController.getString(R.string.BackgroundChoosePattern));
                        this.patternTitleView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                        this.patternTitleView.setTextSize(1, 20.0f);
                        this.patternTitleView.setTypeface(AndroidUtilities.bold());
                        this.patternTitleView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
                        this.patternTitleView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                        this.patternTitleView.setGravity(16);
                        this.patternLayout[i9].addView(this.patternTitleView, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                        RecyclerListView recyclerListView14 = new RecyclerListView(context) {
                            @Override
                            public boolean onTouchEvent(MotionEvent motionEvent) {
                                if (motionEvent.getAction() == 0) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                return super.onTouchEvent(motionEvent);
                            }
                        };
                        this.patternsListView = recyclerListView14;
                        LinearLayoutManager linearLayoutManager5 = new LinearLayoutManager(context, 0, false);
                        this.patternsLayoutManager = linearLayoutManager5;
                        recyclerListView14.setLayoutManager(linearLayoutManager5);
                        RecyclerListView recyclerListView15 = this.patternsListView;
                        PatternsAdapter patternsAdapter5 = new PatternsAdapter(context);
                        this.patternsAdapter = patternsAdapter5;
                        recyclerListView15.setAdapter(patternsAdapter5);
                        this.patternsListView.addItemDecoration(new RecyclerView.ItemDecoration() {
                            @Override
                            public void getItemOffsets(Rect rect7, View view3, RecyclerView recyclerView, RecyclerView.State state) {
                                int childAdapterPosition = recyclerView.getChildAdapterPosition(view3);
                                rect7.left = AndroidUtilities.dp(12.0f);
                                rect7.top = 0;
                                rect7.bottom = 0;
                                if (childAdapterPosition == state.getItemCount() - 1) {
                                    rect7.right = AndroidUtilities.dp(12.0f);
                                }
                            }
                        });
                        this.patternLayout[i9].addView(this.patternsListView, LayoutHelper.createFrame(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                        this.patternsListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                            @Override
                            public final void onItemClick(View view3, int i3110) {
                                ThemePreviewActivity.$r8$lambda$5Ocn8fX67CEAIw11qzaYjS5qRUs(this.f$0, view3, i3110);
                            }
                        });
                        HeaderCell headerCell5 = new HeaderCell(context);
                        this.intensityCell = headerCell5;
                        headerCell5.setText(LocaleController.getString(R.string.BackgroundIntensity));
                        this.patternLayout[i9].addView(this.intensityCell, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                        SeekBarView seekBarView5 = new SeekBarView(context, getResourceProvider()) {
                            @Override
                            public boolean onTouchEvent(MotionEvent motionEvent) {
                                if (motionEvent.getAction() == 0) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                return super.onTouchEvent(motionEvent);
                            }
                        };
                        this.intensitySeekBar = seekBarView5;
                        seekBarView5.setProgress(this.currentIntensity);
                        this.intensitySeekBar.setReportChanges(true);
                        this.intensitySeekBar.setDelegate(new SeekBarView.SeekBarViewDelegate() {
                            @Override
                            public CharSequence getContentDescription() {
                                return SeekBarView.SeekBarViewDelegate.CC.$default$getContentDescription(this);
                            }

                            @Override
                            public int getStepsCount() {
                                return SeekBarView.SeekBarViewDelegate.CC.$default$getStepsCount(this);
                            }

                            @Override
                            public boolean needVisuallyDivideSteps() {
                                return SeekBarView.SeekBarViewDelegate.CC.$default$needVisuallyDivideSteps(this);
                            }

                            @Override
                            public void onSeekBarPressed(boolean z5) {
                            }

                            @Override
                            public void onSeekBarDrag(boolean z5, float f13) {
                                ThemePreviewActivity.this.currentIntensity = f13;
                                ThemePreviewActivity.this.updateIntensity();
                            }
                        });
                        this.patternLayout[i9].addView(this.intensitySeekBar, LayoutHelper.createFrame(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                    } else {
                        ColorPicker colorPicker5 = new ColorPicker(context, this.editingTheme, new AnonymousClass26());
                        this.colorPicker = colorPicker5;
                        colorPicker5.setResourcesProvider(getResourceProvider());
                        if (this.screenType == 1) {
                            this.patternLayout[i9].addView(this.colorPicker, LayoutHelper.createFrame(-1, -1, 1));
                            if (this.applyingTheme.isDark()) {
                                this.colorPicker.setMinBrightness(0.2f);
                            } else {
                                this.colorPicker.setMinBrightness(0.05f);
                                this.colorPicker.setMaxBrightness(0.8f);
                            }
                            themeAccent = this.accent;
                            if (themeAccent != null) {
                                if (themeAccent.accentColor2 != 0) {
                                    i12 = 2;
                                } else {
                                    i12 = 1;
                                }
                                this.colorPicker.setType(1, hasChanges(1), 2, i12, false, 0, false);
                                this.colorPicker.setColor(this.accent.accentColor, 0);
                                i13 = this.accent.accentColor2;
                                if (i13 != 0) {
                                    this.colorPicker.setColor(i13, 1);
                                }
                            }
                        } else {
                            this.patternLayout[i9].addView(this.colorPicker, LayoutHelper.createFrame(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                        }
                    }
                }
            }
            updateButtonState(false, false);
            if (!this.backgroundImage.getImageReceiver().hasBitmapImage()) {
                this.page2.setBackgroundColor(-16777216);
            }
            if (this.screenType != 1) {
                this.backgroundImage.getImageReceiver().setCrossfadeWithOldImage(true);
            }
        }
        this.listView2.setAdapter(this.messagesAdapter);
        FrameLayout frameLayout120 = new FrameLayout(context) {
            private int[] loc = new int[2];

            @Override
            public void invalidate() {
                super.invalidate();
                if (ThemePreviewActivity.this.page2 != null) {
                    ThemePreviewActivity.this.page2.invalidate();
                }
            }

            @Override
            protected void onDraw(Canvas canvas) {
                if (AndroidUtilities.usingHardwareInput) {
                    return;
                }
                getLocationInWindow(this.loc);
                if (ThemePreviewActivity.this.actionBar2.getTranslationY() != this.loc[1]) {
                    ThemePreviewActivity.this.actionBar2.setTranslationY(-this.loc[1]);
                    ThemePreviewActivity.this.page2.invalidate();
                }
                if (SystemClock.elapsedRealtime() < ThemePreviewActivity.this.watchForKeyboardEndTime) {
                    invalidate();
                }
            }
        };
        this.frameLayout = frameLayout120;
        frameLayout120.setWillNotDraw(false);
        FrameLayout frameLayout121 = this.frameLayout;
        this.fragmentView = frameLayout121;
        ViewTreeObserver viewTreeObserver2 = frameLayout121.getViewTreeObserver();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public final void onGlobalLayout() {
                ThemePreviewActivity.m4686$r8$lambda$sflEnhuHtdEAXWIHmerLdo3NV4(this.f$0);
            }
        };
        this.onGlobalLayoutListener = onGlobalLayoutListener2;
        viewTreeObserver2.addOnGlobalLayoutListener(onGlobalLayoutListener2);
        ViewPager viewPager3 = new ViewPager(context);
        this.viewPager = viewPager3;
        viewPager3.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrollStateChanged(int i320) {
            }

            @Override
            public void onPageScrolled(int i320, float f13, int i321) {
            }

            @Override
            public void onPageSelected(int i320) {
                ThemePreviewActivity.this.dotsContainer.invalidate();
            }
        });
        this.viewPager.setAdapter(new PagerAdapter() {
            @Override
            public int getItemPosition(Object obj5) {
                return -1;
            }

            @Override
            public boolean isViewFromObject(View view3, Object obj5) {
                return obj5 == view3;
            }

            @Override
            public int getCount() {
                return ThemePreviewActivity.this.screenType != 0 ? 1 : 2;
            }

            @Override
            public Object instantiateItem(ViewGroup viewGroup, int i320) {
                FrameLayout frameLayout122 = i320 == 0 ? ThemePreviewActivity.this.page2 : ThemePreviewActivity.this.page1;
                viewGroup.addView(frameLayout122);
                return frameLayout122;
            }

            @Override
            public void destroyItem(ViewGroup viewGroup, int i320, Object obj5) {
                viewGroup.removeView((View) obj5);
            }
        });
        AndroidUtilities.setViewPagerEdgeEffectColor(this.viewPager, getThemedColor(Theme.key_actionBarDefault));
        FrameLayout frameLayout122 = this.frameLayout;
        ViewPager viewPager4 = this.viewPager;
        if (this.screenType == 0) {
            f12 = 48.0f;
        } else {
            f12 = 0.0f;
        }
        frameLayout122.addView(viewPager4, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, f12));
        UndoView undoView2 = new UndoView(context, this);
        this.undoView = undoView2;
        undoView2.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.frameLayout.addView(this.undoView, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        if (this.screenType == 0) {
            View view3 = new View(context);
            view3.setBackgroundColor(getThemedColor(Theme.key_dialogShadowLine));
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, 1, 83);
            layoutParams4.bottomMargin = AndroidUtilities.dp(48.0f);
            this.frameLayout.addView(view3, layoutParams4);
            FrameLayout frameLayout217 = new FrameLayout(context);
            this.saveButtonsContainer = frameLayout217;
            frameLayout217.setBackgroundColor(getButtonsColor(Theme.key_windowBackgroundWhite));
            this.frameLayout.addView(this.saveButtonsContainer, LayoutHelper.createFrame(-1, 48, 83));
            View view4 = new View(context) {
                private Paint paint = new Paint(1);

                @Override
                protected void onDraw(Canvas canvas) {
                    int currentItem = ThemePreviewActivity.this.viewPager.getCurrentItem();
                    this.paint.setColor(ThemePreviewActivity.this.getButtonsColor(Theme.key_chat_fieldOverlayText));
                    int i320 = 0;
                    while (i320 < 2) {
                        this.paint.setAlpha(i320 == currentItem ? 255 : 127);
                        canvas.drawCircle(AndroidUtilities.dp((i320 * 15) + 3), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), this.paint);
                        i320++;
                    }
                }
            };
            this.dotsContainer = view4;
            this.saveButtonsContainer.addView(view4, LayoutHelper.createFrame(22, 8, 17));
            TextView textView20 = new TextView(context);
            this.cancelButton = textView20;
            textView20.setTextSize(1, 14.0f);
            TextView textView21 = this.cancelButton;
            int i320 = Theme.key_chat_fieldOverlayText;
            textView21.setTextColor(getButtonsColor(i320));
            this.cancelButton.setGravity(17);
            this.cancelButton.setBackgroundDrawable(Theme.createSelectorDrawable(251658240, 0));
            this.cancelButton.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
            this.cancelButton.setText(LocaleController.getString(R.string.Cancel));
            this.cancelButton.setTypeface(AndroidUtilities.bold());
            this.saveButtonsContainer.addView(this.cancelButton, LayoutHelper.createFrame(-2, -1, 51));
            this.cancelButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view5) {
                    this.f$0.cancelThemeApply(false);
                }
            });
            TextView textView22 = new TextView(context);
            this.doneButton = textView22;
            textView22.setTextSize(1, 14.0f);
            this.doneButton.setTextColor(getButtonsColor(i320));
            this.doneButton.setGravity(17);
            this.doneButton.setBackgroundDrawable(Theme.createSelectorDrawable(251658240, 0));
            this.doneButton.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
            this.doneButton.setText(LocaleController.getString(R.string.ApplyTheme));
            this.doneButton.setTypeface(AndroidUtilities.bold());
            this.saveButtonsContainer.addView(this.doneButton, LayoutHelper.createFrame(-2, -1, 53));
            this.doneButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view5) {
                    ThemePreviewActivity.$r8$lambda$c3RaOEckOO52UD_94oeXOrTSkGw(this.f$0, view5);
                }
            });
        }
        if (this.screenType == 1) {
            selectColorType(2);
        }
        this.themeDescriptions = getThemeDescriptionsInternal();
        setCurrentImage(true);
        updatePlayAnimationView(false);
        if (this.showColor) {
            showPatternsView(0, true, false);
        }
        this.scroller = new Scroller(getContext());
        iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null) {
            this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(Theme.key_dialogBackground));
            if (this.screenType == 2) {
                this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
            }
        }
        return this.fragmentView;
    }

    public static void $r8$lambda$QL3hckfE11bflQFil0yLsG9XVgY(ThemePreviewActivity themePreviewActivity) {
        if (themePreviewActivity.getParentActivity() == null || themePreviewActivity.getContext() == null) {
            return;
        }
        SharedConfig.increaseDayNightWallpaperSiwtchHint();
        HintView hintView = new HintView(themePreviewActivity.getContext(), 7, true);
        hintView.setAlpha(0.0f);
        hintView.setVisibility(4);
        hintView.setShowingDuration(4000L);
        themePreviewActivity.frameLayout.addView(hintView, LayoutHelper.createFrame(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
        if (themePreviewActivity.onSwitchDayNightDelegate.isDark()) {
            hintView.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
        } else {
            hintView.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
        }
        hintView.setBackgroundColor(-366530760, -1);
        hintView.showForView(themePreviewActivity.dayNightItem, true);
        hintView.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
    }

    class AnonymousClass8 extends ActionBar.ActionBarMenuOnItemClick {
        AnonymousClass8() {
        }

        @Override
        public void onItemClick(int i) {
            File file;
            Theme.ThemeAccent accent;
            String url;
            if (i == -1) {
                if (ThemePreviewActivity.this.checkDiscard(true)) {
                    ThemePreviewActivity.this.cancelThemeApply(false);
                    return;
                }
                return;
            }
            if (i >= 1 && i <= 3) {
                ThemePreviewActivity.this.selectColorType(i);
                return;
            }
            if (i == 4) {
                if (ThemePreviewActivity.this.removeBackgroundOverride) {
                    Theme.resetCustomWallpaper(false);
                }
                File pathToWallpaper = ThemePreviewActivity.this.accent.getPathToWallpaper();
                if (pathToWallpaper != null) {
                    pathToWallpaper.delete();
                }
                ThemePreviewActivity.this.accent.patternSlug = ThemePreviewActivity.this.selectedPattern != null ? ThemePreviewActivity.this.selectedPattern.slug : "";
                ThemePreviewActivity.this.accent.patternIntensity = ThemePreviewActivity.this.currentIntensity;
                ThemePreviewActivity.this.accent.patternMotion = ThemePreviewActivity.this.isMotion;
                if (((int) ThemePreviewActivity.this.accent.backgroundOverrideColor) == 0) {
                    ThemePreviewActivity.this.accent.backgroundOverrideColor = 4294967296L;
                }
                if (((int) ThemePreviewActivity.this.accent.backgroundGradientOverrideColor1) == 0) {
                    ThemePreviewActivity.this.accent.backgroundGradientOverrideColor1 = 4294967296L;
                }
                if (((int) ThemePreviewActivity.this.accent.backgroundGradientOverrideColor2) == 0) {
                    ThemePreviewActivity.this.accent.backgroundGradientOverrideColor2 = 4294967296L;
                }
                if (((int) ThemePreviewActivity.this.accent.backgroundGradientOverrideColor3) == 0) {
                    ThemePreviewActivity.this.accent.backgroundGradientOverrideColor3 = 4294967296L;
                }
                ThemePreviewActivity.this.saveAccentWallpaper();
                NotificationCenter.getGlobalInstance().removeObserver(ThemePreviewActivity.this, NotificationCenter.wallpapersDidLoad);
                Theme.saveThemeAccents(ThemePreviewActivity.this.applyingTheme, true, false, false, true);
                Theme.applyPreviousTheme();
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.needSetDayNightTheme, ThemePreviewActivity.this.applyingTheme, Boolean.valueOf(ThemePreviewActivity.this.nightTheme), null, -1);
                ThemePreviewActivity.this.finishFragment();
                return;
            }
            if (i == 5) {
                if (ThemePreviewActivity.this.getParentActivity() == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                if (ThemePreviewActivity.this.isBlurred) {
                    sb.append("blur");
                }
                if (ThemePreviewActivity.this.isMotion) {
                    if (sb.length() > 0) {
                        sb.append("+");
                    }
                    sb.append("motion");
                }
                if (!(ThemePreviewActivity.this.currentWallpaper instanceof TLRPC.TL_wallPaper)) {
                    if (ThemePreviewActivity.this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) {
                        WallpapersListActivity.ColorWallpaper colorWallpaper = new WallpapersListActivity.ColorWallpaper(ThemePreviewActivity.this.selectedPattern != null ? ThemePreviewActivity.this.selectedPattern.slug : "c", ThemePreviewActivity.this.backgroundColor, ThemePreviewActivity.this.backgroundGradientColor1, ThemePreviewActivity.this.backgroundGradientColor2, ThemePreviewActivity.this.backgroundGradientColor3, ThemePreviewActivity.this.backgroundRotation, ThemePreviewActivity.this.currentIntensity, ThemePreviewActivity.this.isMotion, null);
                        colorWallpaper.pattern = ThemePreviewActivity.this.selectedPattern;
                        url = colorWallpaper.getUrl();
                    } else {
                        if (!BuildVars.DEBUG_PRIVATE_VERSION || (accent = Theme.getActiveTheme().getAccent(false)) == null) {
                            return;
                        }
                        WallpapersListActivity.ColorWallpaper colorWallpaper2 = new WallpapersListActivity.ColorWallpaper(accent.patternSlug, (int) accent.backgroundOverrideColor, (int) accent.backgroundGradientOverrideColor1, (int) accent.backgroundGradientOverrideColor2, (int) accent.backgroundGradientOverrideColor3, accent.backgroundRotation, accent.patternIntensity, accent.patternMotion, null);
                        int size = ThemePreviewActivity.this.patterns.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) ThemePreviewActivity.this.patterns.get(i2);
                            if (tL_wallPaper.pattern && accent.patternSlug.equals(tL_wallPaper.slug)) {
                                colorWallpaper2.pattern = tL_wallPaper;
                                break;
                            }
                        }
                        url = colorWallpaper2.getUrl();
                    }
                } else {
                    url = "https://" + MessagesController.getInstance(((BaseFragment) ThemePreviewActivity.this).currentAccount).linkPrefix + "/bg/" + ((TLRPC.TL_wallPaper) ThemePreviewActivity.this.currentWallpaper).slug;
                    if (sb.length() > 0) {
                        url = url + "?mode=" + sb.toString();
                    }
                }
                String str = url;
                ThemePreviewActivity.this.showDialog(new ShareAlert(ThemePreviewActivity.this.getParentActivity(), null, str, false, str, false) {
                    @Override
                    protected void onSend(LongSparseArray longSparseArray, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
                        if (z) {
                            if (longSparseArray.size() == 1) {
                                ThemePreviewActivity.this.undoView.showWithAction(((TLRPC.Dialog) longSparseArray.valueAt(0)).id, 61, Integer.valueOf(i3));
                            } else {
                                ThemePreviewActivity.this.undoView.showWithAction(0L, 61, Integer.valueOf(i3), Integer.valueOf(longSparseArray.size()), (Runnable) null, (Runnable) null);
                            }
                        }
                    }
                });
                return;
            }
            if (i != 6) {
                if (i == 7 && (ThemePreviewActivity.this.currentWallpaper instanceof WallpapersListActivity.FileWallpaper) && (file = ((WallpapersListActivity.FileWallpaper) ThemePreviewActivity.this.currentWallpaper).originalPath) != null) {
                    final MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L);
                    photoEntry.isVideo = false;
                    photoEntry.thumbPath = null;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(photoEntry);
                    PhotoViewer.getInstance().setParentActivity(ThemePreviewActivity.this.getParentActivity());
                    PhotoViewer.getInstance().openPhotoForSelect(arrayList, 0, 3, false, new PhotoViewer.EmptyPhotoViewerProvider() {
                        @Override
                        public boolean allowCaption() {
                            return false;
                        }

                        @Override
                        public void sendButtonPressed(int i3, VideoEditedInfo videoEditedInfo, boolean z, int i4, int i5, boolean z2) {
                            if (photoEntry.imagePath != null) {
                                File file2 = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                                Point realScreenSize = AndroidUtilities.getRealScreenSize();
                                Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(photoEntry.imagePath, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
                                try {
                                    bitmapLoadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file2));
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                File file3 = new File(photoEntry.imagePath);
                                ThemePreviewActivity.this.currentWallpaper = new WallpapersListActivity.FileWallpaper("", file3, file3);
                                ThemePreviewActivity.this.currentWallpaperBitmap = bitmapLoadBitmap;
                                ThemePreviewActivity.this.lastSizeHash = 0;
                                ThemePreviewActivity.this.backgroundImage.requestLayout();
                                ThemePreviewActivity.this.setCurrentImage(false);
                                ThemePreviewActivity.this.blurredBitmap = null;
                                ThemePreviewActivity.this.updateBlurred();
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
            boolean zIsDark = ThemePreviewActivity.this.onSwitchDayNightDelegate.isDark();
            DayNightSwitchDelegate dayNightSwitchDelegate = ThemePreviewActivity.this.onSwitchDayNightDelegate;
            if (dayNightSwitchDelegate != null) {
                if (!dayNightSwitchDelegate.supportsAnimation()) {
                    ThemePreviewActivity.this.toggleTheme();
                    return;
                }
                ThemePreviewActivity.this.onSwitchDayNightDelegate.switchDayNight(true);
                ThemePreviewActivity.this.sunDrawable.setPlayInDirectionOfCustomEndFrame(true);
                if (zIsDark) {
                    ThemePreviewActivity.this.sunDrawable.setCustomEndFrame(0);
                } else {
                    ThemePreviewActivity.this.sunDrawable.setCustomEndFrame(36);
                }
                ThemePreviewActivity.this.sunDrawable.start();
                if (ThemePreviewActivity.this.shouldShowBrightnessControll) {
                    DayNightSwitchDelegate dayNightSwitchDelegate2 = ThemePreviewActivity.this.onSwitchDayNightDelegate;
                    if (dayNightSwitchDelegate2 == null || !dayNightSwitchDelegate2.isDark()) {
                        ThemePreviewActivity.this.dimmingSlider.animateValueTo(0.0f);
                    } else {
                        ThemePreviewActivity.this.dimmingSlider.setVisibility(0);
                        ThemePreviewActivity.this.dimmingSlider.animateValueTo(ThemePreviewActivity.this.dimAmount);
                    }
                    if (ThemePreviewActivity.this.changeDayNightViewAnimator2 != null) {
                        ThemePreviewActivity.this.changeDayNightViewAnimator2.removeAllListeners();
                        ThemePreviewActivity.this.changeDayNightViewAnimator2.cancel();
                    }
                    ThemePreviewActivity themePreviewActivity = ThemePreviewActivity.this;
                    themePreviewActivity.changeDayNightViewAnimator2 = ValueAnimator.ofFloat(themePreviewActivity.progressToDarkTheme, ThemePreviewActivity.this.onSwitchDayNightDelegate.isDark() ? 1.0f : 0.0f);
                    ThemePreviewActivity.this.changeDayNightViewAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ThemePreviewActivity.AnonymousClass8.$r8$lambda$FPn4dkrXw65VuDcH9Ase3TxZwcg(this.f$0, valueAnimator);
                        }
                    });
                    ThemePreviewActivity.this.changeDayNightViewAnimator2.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (ThemePreviewActivity.this.onSwitchDayNightDelegate.isDark()) {
                                return;
                            }
                            ThemePreviewActivity.this.dimmingSlider.setVisibility(8);
                        }
                    });
                    ThemePreviewActivity.this.changeDayNightViewAnimator2.setDuration(250L);
                    ThemePreviewActivity.this.changeDayNightViewAnimator2.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    ThemePreviewActivity.this.changeDayNightViewAnimator2.start();
                }
            }
        }

        public static void $r8$lambda$FPn4dkrXw65VuDcH9Ase3TxZwcg(AnonymousClass8 anonymousClass8, ValueAnimator valueAnimator) {
            ThemePreviewActivity.this.progressToDarkTheme = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ThemePreviewActivity.this.backgroundImage.invalidate();
            ThemePreviewActivity.this.bottomOverlayChat.invalidate();
            ThemePreviewActivity.this.dimmingSlider.setAlpha(ThemePreviewActivity.this.progressToDarkTheme);
            ThemePreviewActivity.this.dimmingSliderContainer.invalidate();
            ThemePreviewActivity.this.invalidateBlur();
        }
    }

    public static void $r8$lambda$KRc6_gFlzwNQbkdyPLR7UMzAhJU(ThemePreviewActivity themePreviewActivity, ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        if (themePreviewActivity.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) {
            return;
        }
        Drawable drawable = imageReceiver.getDrawable();
        if (!z || drawable == null) {
            return;
        }
        themePreviewActivity.themeDelegate.applyChatServiceMessageColor(AndroidUtilities.calcDrawableColor(drawable), themePreviewActivity.checkBlur(drawable), drawable, Float.valueOf(themePreviewActivity.currentIntensity));
        if (!z2 && themePreviewActivity.isBlurred && themePreviewActivity.blurredBitmap == null) {
            themePreviewActivity.backgroundImage.getImageReceiver().setCrossfadeWithOldImage(false);
            themePreviewActivity.updateBlurred();
            themePreviewActivity.backgroundImage.getImageReceiver().setCrossfadeWithOldImage(true);
        }
        themePreviewActivity.invalidateBlur();
    }

    public static void m4689$r8$lambda$yUgoSDSIx920vGr5qa_ApbKjww(ThemePreviewActivity themePreviewActivity, View view, int i, float f, float f2) {
        themePreviewActivity.getClass();
        if (view instanceof ChatMessageCell) {
            ChatMessageCell chatMessageCell = (ChatMessageCell) view;
            if (chatMessageCell.isInsideBackground(f, f2)) {
                if (chatMessageCell.getMessageObject().isOutOwner()) {
                    themePreviewActivity.selectColorType(3);
                    return;
                } else {
                    themePreviewActivity.selectColorType(1);
                    return;
                }
            }
            themePreviewActivity.selectColorType(2);
        }
    }

    public static void $r8$lambda$8OgX8ATzZHWjtlgaHFfk3PpGc_g(ThemePreviewActivity themePreviewActivity, int i, int i2, float f) {
        if (themePreviewActivity.isMotion) {
            themePreviewActivity.backgroundImage.getBackground();
            float scaleX = themePreviewActivity.motionAnimation != null ? (themePreviewActivity.backgroundImage.getScaleX() - 1.0f) / (themePreviewActivity.parallaxScale - 1.0f) : 1.0f;
            themePreviewActivity.backgroundImage.setTranslationX(i * scaleX);
            themePreviewActivity.backgroundImage.setTranslationY(i2 * scaleX);
        }
    }

    public static void m4677$r8$lambda$1NbvpStwepfVDa_AAqQbAYfgNA(ThemePreviewActivity themePreviewActivity, Float f) {
        themePreviewActivity.getClass();
        themePreviewActivity.dimAmount = f.floatValue();
        themePreviewActivity.backgroundImage.invalidate();
        themePreviewActivity.invalidateBlur();
    }

    public static void $r8$lambda$gw7VHMT_d8xxvRDe8qqoA1688xs(ThemePreviewActivity themePreviewActivity, int i, WallpaperCheckBoxView wallpaperCheckBoxView, View view) {
        if (themePreviewActivity.backgroundButtonsContainer.getAlpha() == 1.0f && themePreviewActivity.patternViewAnimation == null) {
            int i2 = themePreviewActivity.screenType;
            if ((i2 == 1 || (themePreviewActivity.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper)) && i == 2) {
                wallpaperCheckBoxView.setChecked(!wallpaperCheckBoxView.isChecked(), true);
                boolean zIsChecked = wallpaperCheckBoxView.isChecked();
                themePreviewActivity.isMotion = zIsChecked;
                themePreviewActivity.parallaxEffect.setEnabled(zIsChecked);
                themePreviewActivity.animateMotionChange();
                return;
            }
            if (i == 1 && (i2 == 1 || (themePreviewActivity.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper))) {
                if (themePreviewActivity.backgroundCheckBoxView[1].isChecked()) {
                    themePreviewActivity.lastSelectedPattern = themePreviewActivity.selectedPattern;
                    themePreviewActivity.backgroundImage.setImageDrawable(null);
                    themePreviewActivity.selectedPattern = null;
                    themePreviewActivity.isMotion = false;
                    themePreviewActivity.updateButtonState(false, true);
                    themePreviewActivity.animateMotionChange();
                    if (themePreviewActivity.patternLayout[1].getVisibility() == 0) {
                        if (themePreviewActivity.screenType == 1) {
                            themePreviewActivity.showPatternsView(0, true, true);
                        } else {
                            themePreviewActivity.showPatternsView(i, themePreviewActivity.patternLayout[i].getVisibility() != 0, true);
                        }
                    }
                } else {
                    themePreviewActivity.selectPattern(themePreviewActivity.lastSelectedPattern != null ? -1 : 0);
                    if (themePreviewActivity.screenType == 1) {
                        themePreviewActivity.showPatternsView(1, true, true);
                    } else {
                        themePreviewActivity.showPatternsView(i, themePreviewActivity.patternLayout[i].getVisibility() != 0, true);
                    }
                }
                themePreviewActivity.backgroundCheckBoxView[1].setChecked(themePreviewActivity.selectedPattern != null, true);
                themePreviewActivity.updateSelectedPattern(true);
                themePreviewActivity.patternsListView.invalidateViews();
                themePreviewActivity.updateMotionButton();
                return;
            }
            if (themePreviewActivity.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) {
                themePreviewActivity.showPatternsView(i, themePreviewActivity.patternLayout[i].getVisibility() != 0, true);
                return;
            }
            if (i2 != 1) {
                wallpaperCheckBoxView.setChecked(!wallpaperCheckBoxView.isChecked(), true);
                if (i == 0) {
                    boolean zIsChecked2 = wallpaperCheckBoxView.isChecked();
                    themePreviewActivity.isBlurred = zIsChecked2;
                    if (zIsChecked2) {
                        themePreviewActivity.backgroundImage.getImageReceiver().setForceCrossfade(true);
                    }
                    themePreviewActivity.updateBlurred();
                    return;
                }
                boolean zIsChecked3 = wallpaperCheckBoxView.isChecked();
                themePreviewActivity.isMotion = zIsChecked3;
                themePreviewActivity.parallaxEffect.setEnabled(zIsChecked3);
                themePreviewActivity.animateMotionChange();
            }
        }
    }

    public static void $r8$lambda$g4zxTy8DWZDBESqlEGMhg5NKfYI(ThemePreviewActivity themePreviewActivity, int i, WallpaperCheckBoxView wallpaperCheckBoxView, View view) {
        if (themePreviewActivity.messagesButtonsContainer.getAlpha() == 1.0f && i == 0) {
            wallpaperCheckBoxView.setChecked(!wallpaperCheckBoxView.isChecked(), true);
            themePreviewActivity.accent.myMessagesAnimated = wallpaperCheckBoxView.isChecked();
            Theme.refreshThemeColors(true, true);
            themePreviewActivity.listView2.invalidateViews();
        }
    }

    public static void $r8$lambda$2_eHBBt6BCIuI7vPNNwgGWViXxk(ThemePreviewActivity themePreviewActivity, int i, View view) {
        if (themePreviewActivity.patternViewAnimation != null) {
            return;
        }
        if (i == 0) {
            themePreviewActivity.backgroundRotation = themePreviewActivity.previousBackgroundRotation;
            themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor3, 3, true, true);
            themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor2, 2, true, true);
            themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundGradientColor1, 1, true, true);
            themePreviewActivity.setBackgroundColor(themePreviewActivity.previousBackgroundColor, 0, true, true);
        } else {
            TLRPC.TL_wallPaper tL_wallPaper = themePreviewActivity.previousSelectedPattern;
            themePreviewActivity.selectedPattern = tL_wallPaper;
            if (tL_wallPaper == null) {
                themePreviewActivity.backgroundImage.setImageDrawable(null);
            } else {
                BackgroundView backgroundView = themePreviewActivity.backgroundImage;
                ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper.document);
                String str = themePreviewActivity.imageFilter;
                TLRPC.TL_wallPaper tL_wallPaper2 = themePreviewActivity.selectedPattern;
                backgroundView.setImage(forDocument, str, (ImageLocation) null, (String) null, "jpg", tL_wallPaper2.document.size, 1, tL_wallPaper2);
            }
            themePreviewActivity.backgroundCheckBoxView[1].setChecked(themePreviewActivity.selectedPattern != null, false);
            float f = themePreviewActivity.previousIntensity;
            themePreviewActivity.currentIntensity = f;
            themePreviewActivity.intensitySeekBar.setProgress(f);
            themePreviewActivity.backgroundImage.getImageReceiver().setAlpha(themePreviewActivity.currentIntensity);
            themePreviewActivity.updateButtonState(false, true);
            themePreviewActivity.updateSelectedPattern(true);
        }
        if (themePreviewActivity.screenType == 2) {
            themePreviewActivity.showPatternsView(i, false, true);
            return;
        }
        if (themePreviewActivity.selectedPattern == null) {
            if (themePreviewActivity.isMotion) {
                themePreviewActivity.isMotion = false;
                themePreviewActivity.backgroundCheckBoxView[0].setChecked(false, true);
                themePreviewActivity.animateMotionChange();
            }
            themePreviewActivity.updateMotionButton();
        }
        themePreviewActivity.showPatternsView(0, true, true);
    }

    public static void $r8$lambda$SYZDOhqtZEiS6wgO2ZfYZSofEVQ(ThemePreviewActivity themePreviewActivity, int i, View view) {
        if (themePreviewActivity.patternViewAnimation != null) {
            return;
        }
        if (themePreviewActivity.screenType == 2) {
            themePreviewActivity.showPatternsView(i, false, true);
        } else {
            themePreviewActivity.showPatternsView(0, true, true);
        }
    }

    public static void $r8$lambda$5Ocn8fX67CEAIw11qzaYjS5qRUs(ThemePreviewActivity themePreviewActivity, View view, int i) {
        boolean z = themePreviewActivity.selectedPattern != null;
        themePreviewActivity.selectPattern(i);
        if (z == (themePreviewActivity.selectedPattern == null)) {
            themePreviewActivity.animateMotionChange();
            themePreviewActivity.updateMotionButton();
        }
        themePreviewActivity.updateSelectedPattern(true);
        themePreviewActivity.backgroundCheckBoxView[1].setChecked(themePreviewActivity.selectedPattern != null, true);
        themePreviewActivity.patternsListView.invalidateViews();
        int left = view.getLeft();
        int right = view.getRight();
        int iDp = AndroidUtilities.dp(52.0f);
        int i2 = left - iDp;
        if (i2 < 0) {
            themePreviewActivity.patternsListView.smoothScrollBy(i2, 0);
            return;
        }
        int i3 = right + iDp;
        if (i3 > themePreviewActivity.patternsListView.getMeasuredWidth()) {
            RecyclerListView recyclerListView = themePreviewActivity.patternsListView;
            recyclerListView.smoothScrollBy(i3 - recyclerListView.getMeasuredWidth(), 0);
        }
    }

    class AnonymousClass26 implements ColorPicker.ColorPickerDelegate {
        AnonymousClass26() {
        }

        @Override
        public void setColor(int i, int i2, boolean z) {
            if (ThemePreviewActivity.this.screenType == 2) {
                ThemePreviewActivity.this.setBackgroundColor(i, i2, z, true);
            } else {
                ThemePreviewActivity.this.scheduleApplyColor(i, i2, z);
            }
        }

        @Override
        public void openThemeCreate(boolean z) {
            if (z) {
                if (ThemePreviewActivity.this.accent.info == null) {
                    ThemePreviewActivity.this.finishFragment();
                    MessagesController.getInstance(((BaseFragment) ThemePreviewActivity.this).currentAccount).saveThemeToServer(ThemePreviewActivity.this.accent.parentTheme, ThemePreviewActivity.this.accent);
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.needShareTheme, ThemePreviewActivity.this.accent.parentTheme, ThemePreviewActivity.this.accent);
                    return;
                }
                String str = "https://" + MessagesController.getInstance(((BaseFragment) ThemePreviewActivity.this).currentAccount).linkPrefix + "/addtheme/" + ThemePreviewActivity.this.accent.info.slug;
                ThemePreviewActivity.this.showDialog(new ShareAlert(ThemePreviewActivity.this.getParentActivity(), null, str, false, str, false));
                return;
            }
            AlertsCreator.createThemeCreateDialog(ThemePreviewActivity.this, 1, null, null);
        }

        @Override
        public void deleteTheme() {
            if (ThemePreviewActivity.this.getParentActivity() == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(ThemePreviewActivity.this.getParentActivity());
            builder.setTitle(LocaleController.getString(R.string.DeleteThemeTitle));
            builder.setMessage(LocaleController.getString(R.string.DeleteThemeAlert));
            builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    ThemePreviewActivity.AnonymousClass26.$r8$lambda$xgLWoFs49x6w6kZ28tKHKWNacfM(this.f$0, alertDialog, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate = builder.create();
            ThemePreviewActivity.this.showDialog(alertDialogCreate);
            TextView textView = (TextView) alertDialogCreate.getButton(-1);
            if (textView != null) {
                textView.setTextColor(ThemePreviewActivity.this.getThemedColor(Theme.key_text_RedBold));
            }
        }

        public static void $r8$lambda$xgLWoFs49x6w6kZ28tKHKWNacfM(AnonymousClass26 anonymousClass26, AlertDialog alertDialog, int i) {
            Theme.deleteThemeAccent(ThemePreviewActivity.this.applyingTheme, ThemePreviewActivity.this.accent, true);
            Theme.applyPreviousTheme();
            Theme.refreshThemeColors();
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.needSetDayNightTheme, ThemePreviewActivity.this.applyingTheme, Boolean.valueOf(ThemePreviewActivity.this.nightTheme), null, -1);
            ThemePreviewActivity.this.finishFragment();
        }

        @Override
        public int getDefaultColor(int i) {
            Theme.ThemeAccent themeAccent;
            if (ThemePreviewActivity.this.colorType == 3 && ThemePreviewActivity.this.applyingTheme.firstAccentIsDefault && i == 0 && (themeAccent = (Theme.ThemeAccent) ThemePreviewActivity.this.applyingTheme.themeAccentsMap.get(Theme.DEFALT_THEME_ACCENT_ID)) != null) {
                return themeAccent.myMessagesAccentColor;
            }
            return 0;
        }
    }

    public static void m4686$r8$lambda$sflEnhuHtdEAXWIHmerLdo3NV4(ThemePreviewActivity themePreviewActivity) {
        themePreviewActivity.getClass();
        themePreviewActivity.watchForKeyboardEndTime = SystemClock.elapsedRealtime() + 1500;
        themePreviewActivity.frameLayout.invalidate();
    }

    public static void $r8$lambda$c3RaOEckOO52UD_94oeXOrTSkGw(ThemePreviewActivity themePreviewActivity, View view) {
        Theme.ThemeAccent accent;
        themePreviewActivity.getClass();
        Theme.ThemeInfo previousTheme = Theme.getPreviousTheme();
        if (previousTheme == null) {
            return;
        }
        int i = previousTheme.prevAccentId;
        if (i >= 0) {
            accent = (Theme.ThemeAccent) previousTheme.themeAccentsMap.get(i);
        } else {
            accent = previousTheme.getAccent(false);
        }
        if (themePreviewActivity.accent != null) {
            themePreviewActivity.saveAccentWallpaper();
            Theme.saveThemeAccents(themePreviewActivity.applyingTheme, true, false, false, false);
            Theme.clearPreviousTheme();
            Theme.applyTheme(themePreviewActivity.applyingTheme, themePreviewActivity.nightTheme);
            themePreviewActivity.parentLayout.rebuildAllFragmentViews(false, false);
        } else {
            themePreviewActivity.parentLayout.rebuildAllFragmentViews(false, false);
            File file = new File(themePreviewActivity.applyingTheme.pathToFile);
            Theme.ThemeInfo themeInfo = themePreviewActivity.applyingTheme;
            Theme.applyThemeFile(file, themeInfo.name, themeInfo.info, false);
            MessagesController.getInstance(themePreviewActivity.applyingTheme.account).saveTheme(themePreviewActivity.applyingTheme, null, false, false);
            SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            editorEdit.putString("lastDayTheme", themePreviewActivity.applyingTheme.getKey());
            editorEdit.commit();
        }
        BaseFragment baseFragment = (BaseFragment) themePreviewActivity.getParentLayout().getFragmentStack().get(Math.max(0, themePreviewActivity.getParentLayout().getFragmentStack().size() - 2));
        themePreviewActivity.finishFragment();
        if (themePreviewActivity.screenType == 0) {
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.didApplyNewTheme, previousTheme, accent, Boolean.valueOf(themePreviewActivity.deleteOnCancel));
        }
        Theme.turnOffAutoNight(baseFragment);
    }

    public boolean insideBottomSheet() {
        INavigationLayout iNavigationLayout = this.parentLayout;
        return (iNavigationLayout == null || iNavigationLayout.getBottomSheet() == null) ? false : true;
    }

    public void updateIntensity() {
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
                this.backgroundImage.getImageReceiver().setGradientBitmap(((MotionBackgroundDrawable) this.backgroundImage.getBackground()).getBitmap());
            }
        }
        ThemeDelegate themeDelegate = this.themeDelegate;
        int i = this.checkColor;
        themeDelegate.applyChatServiceMessageColor(new int[]{i, i, i, i}, this.backgroundImage.getBackground(), this.backgroundImage.getBackground(), Float.valueOf(this.currentIntensity));
        invalidateBlur();
    }

    private void updateApplyButton1(boolean z) {
        long j = this.dialogId;
        if (j > 0) {
            this.applyButton1.setText(LocaleController.getString(R.string.ApplyWallpaperForMe));
            return;
        }
        if (j < 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
            if (chat != null) {
                this.applyButton1.setText(LocaleController.formatString(R.string.ApplyWallpaperForChannel, chat.title));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < getCustomWallpaperLevelMin()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                    if (this.lockSpan == null) {
                        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_switch_lock);
                        this.lockSpan = coloredImageSpan;
                        coloredImageSpan.setTopOffset(1);
                    }
                    spannableStringBuilder.setSpan(this.lockSpan, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", getCustomWallpaperLevelMin(), new Object[0]));
                    this.applyButton1.setSubText(spannableStringBuilder, z);
                    return;
                }
                if (this.boostsStatus == null) {
                    checkBoostsLevel();
                    return;
                } else {
                    this.applyButton1.setSubText(null, z);
                    return;
                }
            }
            this.applyButton1.setText(LocaleController.formatString(R.string.ApplyWallpaperForChannel, LocaleController.getString(R.string.AccDescrChannel).toLowerCase()));
            return;
        }
        this.applyButton1.setText(LocaleController.getString(R.string.ApplyWallpaper));
    }

    private int getCustomWallpaperLevelMin() {
        if (ChatObject.isChannelAndNotMegaGroup(-this.dialogId, this.currentAccount)) {
            return getMessagesController().channelCustomWallpaperLevelMin;
        }
        return getMessagesController().groupCustomWallpaperLevelMin;
    }

    public void applyWallpaperBackground(boolean z) {
        Object obj;
        File httpFilePath;
        boolean zCopyFile;
        boolean zEquals;
        char c;
        File file;
        File file2;
        Object obj2;
        ?? r11;
        ?? r12;
        Object obj3;
        int i;
        String str;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        MediaController.SearchImage searchImage;
        TLRPC.Photo photo;
        File httpFilePath2;
        ?? r26;
        ?? r13;
        TLRPC.TL_wallPaper tL_wallPaper;
        Theme.OverrideWallpaperInfo overrideWallpaperInfo;
        Object obj4;
        long j;
        boolean z3;
        boolean z4;
        ?? r14;
        ?? r0;
        Theme.OverrideWallpaperInfo overrideWallpaperInfo2;
        ?? r15;
        ?? r1;
        TLRPC.TL_wallPaper tL_wallPaper2;
        float f;
        TLRPC.UserFull userFull;
        WallpapersListActivity.ColorWallpaper colorWallpaper;
        String str2;
        float f2;
        float f3;
        Object obj5;
        int i6 = 0;
        if (this.dialogId < 0) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
            if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < getCustomWallpaperLevelMin()) {
                getMessagesController().getBoostsController().userCanBoostChannel(this.dialogId, this.boostsStatus, new Consumer() {
                    @Override
                    public final void accept(Object obj6) {
                        ThemePreviewActivity.$r8$lambda$z0Xbo2o3aptP1NUk5Nfqh0Kgvpk(this.f$0, (ChannelBoostsController.CanApplyBoost) obj6);
                    }
                });
                return;
            } else if (this.boostsStatus == null) {
                return;
            }
        }
        if (!getUserConfig().isPremium() && z) {
            showDialog(new PremiumFeatureBottomSheet(this, 22, true));
            return;
        }
        Theme.ThemeInfo activeTheme = Theme.getActiveTheme();
        String strGenerateWallpaperName = activeTheme.generateWallpaperName(null, this.isBlurred);
        String strGenerateWallpaperName2 = this.isBlurred ? activeTheme.generateWallpaperName(null, false) : strGenerateWallpaperName;
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
                        if (this.hasScrollingBackground && this.currentScrollOffset != this.defaultScrollOffset) {
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
                        } else {
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
                            TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) obj3;
                            str = tL_wallPaper3.slug;
                            zCopyFile = zCopyFile;
                            zEquals = zEquals;
                            r26 = r12;
                            i2 = 45;
                            i4 = 0;
                            i5 = 0;
                            i = 0;
                            r13 = tL_wallPaper3;
                            i3 = 0;
                        } else if (obj3 instanceof WallpapersListActivity.ColorWallpaper) {
                            if ("d".equals(((WallpapersListActivity.ColorWallpaper) obj3).slug)) {
                                zCopyFile = zCopyFile;
                                zEquals = zEquals;
                                r26 = r12;
                                str = "d";
                                i2 = 45;
                                i3 = 0;
                                i4 = 0;
                                i5 = 0;
                                i = 0;
                                r13 = r12;
                            } else {
                                tL_wallPaper = this.selectedPattern;
                                if (tL_wallPaper != null) {
                                    str = tL_wallPaper.slug;
                                } else {
                                    str = "c";
                                }
                                i3 = this.backgroundColor;
                                i5 = this.backgroundGradientColor1;
                                i = 0;
                                i6 = this.backgroundGradientColor2;
                                int i7 = this.backgroundGradientColor3;
                                i2 = this.backgroundRotation;
                                i4 = i7;
                                z2 = false;
                                r26 = 0;
                                r13 = z2;
                            }
                        } else {
                            i = 0;
                            if (obj3 instanceof WallpapersListActivity.FileWallpaper) {
                                WallpapersListActivity.FileWallpaper fileWallpaper2 = (WallpapersListActivity.FileWallpaper) obj3;
                                str = fileWallpaper2.slug;
                                httpFilePath2 = fileWallpaper2.path;
                            } else if (obj3 instanceof MediaController.SearchImage) {
                                searchImage = (MediaController.SearchImage) obj3;
                                photo = searchImage.photo;
                                if (photo != null) {
                                    httpFilePath2 = FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.maxWallpaperSize, true), true);
                                } else {
                                    httpFilePath2 = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                                }
                                str = "";
                            } else {
                                str = "d";
                                i2 = 45;
                                i3 = 0;
                                i4 = 0;
                                i6 = 0;
                                z2 = false;
                                i5 = 0;
                                r26 = 0;
                                r13 = z2;
                            }
                            zCopyFile = zCopyFile;
                            r26 = httpFilePath2;
                            zEquals = zEquals;
                            i2 = 45;
                            i3 = 0;
                            i4 = 0;
                            i6 = 0;
                            r13 = 0;
                            i5 = 0;
                        }
                        overrideWallpaperInfo = new Theme.OverrideWallpaperInfo();
                        overrideWallpaperInfo.fileName = strGenerateWallpaperName2;
                        overrideWallpaperInfo.originalFileName = strGenerateWallpaperName;
                        overrideWallpaperInfo.slug = str;
                        overrideWallpaperInfo.isBlurred = this.isBlurred;
                        overrideWallpaperInfo.isMotion = this.isMotion;
                        overrideWallpaperInfo.color = i3;
                        overrideWallpaperInfo.gradientColor1 = i5;
                        overrideWallpaperInfo.gradientColor2 = i6;
                        overrideWallpaperInfo.gradientColor3 = i4;
                        overrideWallpaperInfo.rotation = i2;
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
                        messagesController.saveWallpaperToServer(r26, overrideWallpaperInfo, z3, 0L);
                        if (!zCopyFile) {
                            if (this.dialogId != 0) {
                                if (r26 == 0) {
                                    ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.dialogId, null, overrideWallpaperInfo, this.serverWallpaper, new Runnable() {
                                        @Override
                                        public final void run() {
                                            ThemePreviewActivity.m4678$r8$lambda$2i4CDrimH8j2VLE_CYXrB74oqk();
                                        }
                                    });
                                    r15 = r13;
                                } else {
                                    ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.dialogId, null, overrideWallpaperInfo, this.serverWallpaper, new Runnable() {
                                        @Override
                                        public final void run() {
                                            ThemePreviewActivity.m4678$r8$lambda$2i4CDrimH8j2VLE_CYXrB74oqk();
                                        }
                                    });
                                    r15 = r13;
                                }
                                r15 = tL_wallPaper2;
                                r15 = tL_wallPaper2;
                                this.setupFinished = true;
                                r1 = this.delegate;
                                if (r1 != 0) {
                                    r1.didSetNewBackground(r15);
                                }
                                finishFragment();
                                z4 = false;
                                r14 = r15;
                            } else {
                                Theme.serviceMessageColorBackup = getThemedColor(Theme.key_chat_serviceBackground);
                                if ("t".equals(overrideWallpaperInfo.slug)) {
                                    overrideWallpaperInfo2 = null;
                                } else {
                                    overrideWallpaperInfo2 = overrideWallpaperInfo;
                                }
                                Theme.getActiveTheme().setOverrideWallpaper(overrideWallpaperInfo2);
                                Theme.reloadWallpaper(true);
                                if (!zEquals) {
                                    ImageLoader.getInstance().removeImage(ImageLoader.getHttpFileName(file3.getAbsolutePath()) + "@100_100");
                                }
                            }
                            if (z4) {
                                r0 = this.delegate;
                                if (r0 != 0) {
                                    r0.didSetNewBackground(r14);
                                }
                                finishFragment();
                            }
                        }
                        z4 = true;
                        r14 = r13;
                        if (z4) {
                            r0 = this.delegate;
                            if (r0 != 0) {
                                r0.didSetNewBackground(r14);
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
                if (photo2 != null) {
                    httpFilePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, this.maxWallpaperSize, true), true);
                } else {
                    httpFilePath = ImageLoader.getHttpFilePath(searchImage2.imageUrl, "jpg");
                }
                try {
                    zCopyFile = AndroidUtilities.copyFile(httpFilePath, file3);
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
            TLRPC.TL_wallPaper tL_wallPaper4 = (TLRPC.TL_wallPaper) obj3;
            str = tL_wallPaper4.slug;
            zCopyFile = zCopyFile;
            zEquals = zEquals;
            r26 = r12;
            i2 = 45;
            i4 = 0;
            i5 = 0;
            i = 0;
            r13 = tL_wallPaper4;
            i3 = 0;
        } else if (obj3 instanceof WallpapersListActivity.ColorWallpaper) {
            if ("d".equals(((WallpapersListActivity.ColorWallpaper) obj3).slug)) {
                zCopyFile = zCopyFile;
                zEquals = zEquals;
                r26 = r12;
                str = "d";
                i2 = 45;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i = 0;
                r13 = r12;
            } else {
                tL_wallPaper = this.selectedPattern;
                if (tL_wallPaper != null) {
                    str = tL_wallPaper.slug;
                } else {
                    str = "c";
                }
                i3 = this.backgroundColor;
                i5 = this.backgroundGradientColor1;
                i = 0;
                i6 = this.backgroundGradientColor2;
                int i8 = this.backgroundGradientColor3;
                i2 = this.backgroundRotation;
                i4 = i8;
                z2 = false;
                r26 = 0;
                r13 = z2;
            }
        } else {
            i = 0;
            if (obj3 instanceof WallpapersListActivity.FileWallpaper) {
                WallpapersListActivity.FileWallpaper fileWallpaper3 = (WallpapersListActivity.FileWallpaper) obj3;
                str = fileWallpaper3.slug;
                httpFilePath2 = fileWallpaper3.path;
            } else if (obj3 instanceof MediaController.SearchImage) {
                searchImage = (MediaController.SearchImage) obj3;
                photo = searchImage.photo;
                if (photo != null) {
                    httpFilePath2 = FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.maxWallpaperSize, true), true);
                } else {
                    httpFilePath2 = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                }
                str = "";
            } else {
                str = "d";
                i2 = 45;
                i3 = 0;
                i4 = 0;
                i6 = 0;
                z2 = false;
                i5 = 0;
                r26 = 0;
                r13 = z2;
            }
            zCopyFile = zCopyFile;
            r26 = httpFilePath2;
            zEquals = zEquals;
            i2 = 45;
            i3 = 0;
            i4 = 0;
            i6 = 0;
            r13 = 0;
            i5 = 0;
        }
        overrideWallpaperInfo = new Theme.OverrideWallpaperInfo();
        overrideWallpaperInfo.fileName = strGenerateWallpaperName2;
        overrideWallpaperInfo.originalFileName = strGenerateWallpaperName;
        overrideWallpaperInfo.slug = str;
        overrideWallpaperInfo.isBlurred = this.isBlurred;
        overrideWallpaperInfo.isMotion = this.isMotion;
        overrideWallpaperInfo.color = i3;
        overrideWallpaperInfo.gradientColor1 = i5;
        overrideWallpaperInfo.gradientColor2 = i6;
        overrideWallpaperInfo.gradientColor3 = i4;
        overrideWallpaperInfo.rotation = i2;
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
            if (f2 < 0.0f && !Theme.getActiveTheme().isDark()) {
                f2 *= -1.0f;
            }
            if (colorWallpaper.parentWallpaper != null && colorWallpaper.color == i3 && colorWallpaper.gradientColor1 == i5 && colorWallpaper.gradientColor2 == i6 && colorWallpaper.gradientColor3 == i4 && TextUtils.equals(colorWallpaper.slug, str2) && colorWallpaper.gradientRotation == i2 && (this.selectedPattern == null || Math.abs(f2 - this.currentIntensity) < 0.001f)) {
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
        messagesController2.saveWallpaperToServer(r26, overrideWallpaperInfo, z3, 0L);
        if (!zCopyFile) {
            if (this.dialogId != 0) {
                if (r26 == 0 && getMessagesController().uploadingWallpaperInfo == overrideWallpaperInfo) {
                    tL_wallPaper2 = new TLRPC.TL_wallPaper();
                    TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                    tL_wallPaper2.settings = tL_wallPaperSettings;
                    tL_wallPaperSettings.intensity = (int) (overrideWallpaperInfo.intensity * 100.0f);
                    tL_wallPaperSettings.blur = overrideWallpaperInfo.isBlurred;
                    tL_wallPaperSettings.motion = overrideWallpaperInfo.isMotion;
                    tL_wallPaper2.uploadingImage = r26.getAbsolutePath();
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
                    tL_wallPaper2.stripedThumb = bitmapCreateBitmap3;
                    createServiceMessageLocal(tL_wallPaper2, z);
                    if (this.dialogId >= 0) {
                        TLRPC.UserFull userFull2 = getMessagesController().getUserFull(this.dialogId);
                        if (userFull2 != null) {
                            r15 = tL_wallPaper2;
                            userFull2.wallpaper = tL_wallPaper2;
                            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                            int i9 = NotificationCenter.userInfoDidLoad;
                            Object[] objArr = new Object[2];
                            objArr[i] = Long.valueOf(this.dialogId);
                            objArr[1] = userFull2;
                            notificationCenter.postNotificationName(i9, objArr);
                            r15 = tL_wallPaper2;
                        }
                    } else {
                        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.dialogId);
                        if (chatFull != null) {
                            r15 = tL_wallPaper2;
                            chatFull.wallpaper = tL_wallPaper2;
                            NotificationCenter notificationCenter2 = NotificationCenter.getInstance(this.currentAccount);
                            int i10 = NotificationCenter.chatInfoDidLoad;
                            Integer numValueOf = Integer.valueOf(i);
                            Object[] objArr2 = new Object[4];
                            objArr2[i] = chatFull;
                            objArr2[1] = numValueOf;
                            Boolean bool = Boolean.FALSE;
                            objArr2[2] = bool;
                            objArr2[3] = bool;
                            notificationCenter2.postNotificationName(i10, objArr2);
                            r15 = tL_wallPaper2;
                        }
                    }
                } else {
                    ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.dialogId, null, overrideWallpaperInfo, this.serverWallpaper, new Runnable() {
                        @Override
                        public final void run() {
                            ThemePreviewActivity.m4678$r8$lambda$2i4CDrimH8j2VLE_CYXrB74oqk();
                        }
                    });
                    r15 = r13;
                }
                r15 = tL_wallPaper2;
                r15 = tL_wallPaper2;
                this.setupFinished = true;
                r1 = this.delegate;
                if (r1 != 0) {
                    r1.didSetNewBackground(r15);
                }
                finishFragment();
                z4 = false;
                r14 = r15;
            } else {
                Theme.serviceMessageColorBackup = getThemedColor(Theme.key_chat_serviceBackground);
                if ("t".equals(overrideWallpaperInfo.slug)) {
                    overrideWallpaperInfo2 = null;
                } else {
                    overrideWallpaperInfo2 = overrideWallpaperInfo;
                }
                Theme.getActiveTheme().setOverrideWallpaper(overrideWallpaperInfo2);
                Theme.reloadWallpaper(true);
                if (!zEquals) {
                    ImageLoader.getInstance().removeImage(ImageLoader.getHttpFileName(file3.getAbsolutePath()) + "@100_100");
                }
            }
            if (z4) {
                r0 = this.delegate;
                if (r0 != 0) {
                    r0.didSetNewBackground(r14);
                }
                finishFragment();
            }
        }
        z4 = true;
        r14 = r13;
        if (z4) {
            r0 = this.delegate;
            if (r0 != 0) {
                r0.didSetNewBackground(r14);
            }
            finishFragment();
        }
    }

    public static void $r8$lambda$z0Xbo2o3aptP1NUk5Nfqh0Kgvpk(final ThemePreviewActivity themePreviewActivity, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (themePreviewActivity.getContext() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(themePreviewActivity, themePreviewActivity.getContext(), 23, themePreviewActivity.currentAccount, themePreviewActivity.getResourceProvider());
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        limitReachedBottomSheet.setBoostsStats(themePreviewActivity.boostsStatus, true);
        limitReachedBottomSheet.setDialogId(themePreviewActivity.dialogId);
        if (!themePreviewActivity.insideBottomSheet()) {
            limitReachedBottomSheet.showStatisticButtonInLink(new Runnable() {
                @Override
                public final void run() {
                    ThemePreviewActivity themePreviewActivity2 = this.f$0;
                    themePreviewActivity2.presentFragment(StatisticActivity.create(themePreviewActivity2.getMessagesController().getChat(Long.valueOf(-themePreviewActivity2.dialogId))));
                }
            });
        }
        themePreviewActivity.showDialog(limitReachedBottomSheet);
    }

    public void onColorsRotate() {
        if (this.screenType == 2) {
            this.backgroundRotation += 45;
            while (true) {
                int i = this.backgroundRotation;
                if (i >= 360) {
                    this.backgroundRotation = i - 360;
                } else {
                    setBackgroundColor(this.backgroundColor, 0, true, true);
                    return;
                }
            }
        } else {
            Theme.ThemeAccent themeAccent = this.accent;
            if (themeAccent == null) {
                return;
            }
            themeAccent.backgroundRotation += 45;
            while (true) {
                Theme.ThemeAccent themeAccent2 = this.accent;
                int i2 = themeAccent2.backgroundRotation;
                if (i2 >= 360) {
                    themeAccent2.backgroundRotation = i2 - 360;
                } else {
                    Theme.refreshThemeColors();
                    return;
                }
            }
        }
    }

    public void selectColorType(int i) {
        selectColorType(i, true);
    }

    private void selectColorType(int i, boolean z) {
        int i2;
        int i3;
        if (getParentActivity() == null || this.colorType == i || this.patternViewAnimation != null || this.accent == null) {
            return;
        }
        if (z && i == 2 && (Theme.hasCustomWallpaper() || this.accent.backgroundOverrideColor == 4294967296L)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString(R.string.ChangeChatBackground));
            if (!Theme.hasCustomWallpaper() || Theme.isCustomWallpaperColor()) {
                builder.setMessage(LocaleController.getString(R.string.ChangeColorToColor));
                builder.setPositiveButton(LocaleController.getString(R.string.Reset), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i4) {
                        ThemePreviewActivity.$r8$lambda$UXVCt3v_yObF_A1amwR25ll5bTM(this.f$0, alertDialog, i4);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Continue), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i4) {
                        ThemePreviewActivity.$r8$lambda$kBWfaBTMyKKZyIXh10d1aDZi6DE(this.f$0, alertDialog, i4);
                    }
                });
            } else {
                builder.setMessage(LocaleController.getString(R.string.ChangeWallpaperToColor));
                builder.setPositiveButton(LocaleController.getString(R.string.Change), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i4) {
                        ThemePreviewActivity.$r8$lambda$F6F14OY8MG2OW_TWx_GVUH07dmI(this.f$0, alertDialog, i4);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            }
            showDialog(builder.create());
            return;
        }
        int i4 = this.colorType;
        this.colorType = i;
        if (i == 1) {
            this.dropDown.setText(LocaleController.getString(R.string.ColorPickerMainColor));
            this.colorPicker.setType(1, hasChanges(1), 2, this.accent.accentColor2 != 0 ? 2 : 1, false, 0, false);
            this.colorPicker.setColor(this.accent.accentColor, 0);
            int i5 = this.accent.accentColor2;
            if (i5 != 0) {
                this.colorPicker.setColor(i5, 1);
            }
            if (i4 == 2 || (i4 == 3 && this.accent.myMessagesGradientAccentColor2 != 0)) {
                this.messagesAdapter.notifyItemRemoved(0);
            }
        } else if (i == 2) {
            this.dropDown.setText(LocaleController.getString(R.string.ColorPickerBackground));
            int themedColor = getThemedColor(Theme.key_chat_wallpaper);
            int i6 = Theme.key_chat_wallpaper_gradient_to1;
            int themedColor2 = Theme.hasThemeKey(i6) ? getThemedColor(i6) : 0;
            int i7 = Theme.key_chat_wallpaper_gradient_to2;
            int themedColor3 = Theme.hasThemeKey(i7) ? getThemedColor(i7) : 0;
            int i8 = Theme.key_chat_wallpaper_gradient_to3;
            int themedColor4 = Theme.hasThemeKey(i8) ? getThemedColor(i8) : 0;
            Theme.ThemeAccent themeAccent = this.accent;
            long j = themeAccent.backgroundGradientOverrideColor1;
            int i9 = (int) j;
            if (i9 == 0 && j != 0) {
                themedColor2 = 0;
            }
            long j2 = themeAccent.backgroundGradientOverrideColor2;
            int i10 = (int) j2;
            if (i10 == 0 && j2 != 0) {
                themedColor3 = 0;
            }
            long j3 = themeAccent.backgroundGradientOverrideColor3;
            int i11 = (int) j3;
            if (i11 == 0 && j3 != 0) {
                themedColor4 = 0;
            }
            int i12 = (int) themeAccent.backgroundOverrideColor;
            if (i9 == 0 && themedColor2 == 0) {
                i2 = 1;
            } else if (i11 == 0 && themedColor4 == 0) {
                i2 = (i10 == 0 && themedColor3 == 0) ? 2 : 3;
            } else {
                i2 = 4;
            }
            this.colorPicker.setType(2, hasChanges(2), 4, i2, false, this.accent.backgroundRotation, false);
            ColorPicker colorPicker = this.colorPicker;
            if (i11 == 0) {
                i11 = themedColor4;
            }
            colorPicker.setColor(i11, 3);
            ColorPicker colorPicker2 = this.colorPicker;
            if (i10 == 0) {
                i10 = themedColor3;
            }
            colorPicker2.setColor(i10, 2);
            ColorPicker colorPicker3 = this.colorPicker;
            if (i9 == 0) {
                i9 = themedColor2;
            }
            colorPicker3.setColor(i9, 1);
            ColorPicker colorPicker4 = this.colorPicker;
            if (i12 != 0) {
                themedColor = i12;
            }
            colorPicker4.setColor(themedColor, 0);
            if (i4 == 1 || this.accent.myMessagesGradientAccentColor2 == 0) {
                this.messagesAdapter.notifyItemInserted(0);
            } else {
                this.messagesAdapter.notifyItemChanged(0);
            }
            this.listView2.smoothScrollBy(0, AndroidUtilities.dp(60.0f));
        } else if (i == 3) {
            this.dropDown.setText(LocaleController.getString(R.string.ColorPickerMyMessages));
            Theme.ThemeAccent themeAccent2 = this.accent;
            if (themeAccent2.myMessagesGradientAccentColor1 == 0) {
                i3 = 1;
            } else if (themeAccent2.myMessagesGradientAccentColor3 != 0) {
                i3 = 4;
            } else {
                i3 = themeAccent2.myMessagesGradientAccentColor2 != 0 ? 3 : 2;
            }
            this.colorPicker.setType(2, hasChanges(3), 4, i3, true, 0, false);
            this.colorPicker.setColor(this.accent.myMessagesGradientAccentColor3, 3);
            this.colorPicker.setColor(this.accent.myMessagesGradientAccentColor2, 2);
            this.colorPicker.setColor(this.accent.myMessagesGradientAccentColor1, 1);
            ColorPicker colorPicker5 = this.colorPicker;
            Theme.ThemeAccent themeAccent3 = this.accent;
            int i13 = themeAccent3.myMessagesAccentColor;
            if (i13 == 0) {
                i13 = themeAccent3.accentColor;
            }
            colorPicker5.setColor(i13, 0);
            this.messagesCheckBoxView[1].setColor(0, this.accent.myMessagesAccentColor);
            this.messagesCheckBoxView[1].setColor(1, this.accent.myMessagesGradientAccentColor1);
            this.messagesCheckBoxView[1].setColor(2, this.accent.myMessagesGradientAccentColor2);
            this.messagesCheckBoxView[1].setColor(3, this.accent.myMessagesGradientAccentColor3);
            if (this.accent.myMessagesGradientAccentColor2 != 0) {
                if (i4 == 1) {
                    this.messagesAdapter.notifyItemInserted(0);
                } else {
                    this.messagesAdapter.notifyItemChanged(0);
                }
            } else if (i4 == 2) {
                this.messagesAdapter.notifyItemRemoved(0);
            }
            this.listView2.smoothScrollBy(0, AndroidUtilities.dp(60.0f));
            showAnimationHint();
        }
        if (i == 1 || i == 3) {
            if (i4 == 2 && this.patternLayout[1].getVisibility() == 0) {
                showPatternsView(0, true, true);
            }
            if (i == 1) {
                if (this.applyingTheme.isDark()) {
                    this.colorPicker.setMinBrightness(0.2f);
                    return;
                } else {
                    this.colorPicker.setMinBrightness(0.05f);
                    this.colorPicker.setMaxBrightness(0.8f);
                    return;
                }
            }
            this.colorPicker.setMinBrightness(0.0f);
            this.colorPicker.setMaxBrightness(1.0f);
            return;
        }
        this.colorPicker.setMinBrightness(0.0f);
        this.colorPicker.setMaxBrightness(1.0f);
    }

    public static void $r8$lambda$UXVCt3v_yObF_A1amwR25ll5bTM(ThemePreviewActivity themePreviewActivity, AlertDialog alertDialog, int i) {
        Theme.ThemeAccent themeAccent = themePreviewActivity.accent;
        if (themeAccent.backgroundOverrideColor == 4294967296L) {
            themeAccent.backgroundOverrideColor = 0L;
            themeAccent.backgroundGradientOverrideColor1 = 0L;
            themeAccent.backgroundGradientOverrideColor2 = 0L;
            themeAccent.backgroundGradientOverrideColor3 = 0L;
            themePreviewActivity.updatePlayAnimationView(false);
            Theme.refreshThemeColors();
        }
        themePreviewActivity.removeBackgroundOverride = true;
        Theme.resetCustomWallpaper(true);
        themePreviewActivity.selectColorType(2, false);
    }

    public static void $r8$lambda$kBWfaBTMyKKZyIXh10d1aDZi6DE(ThemePreviewActivity themePreviewActivity, AlertDialog alertDialog, int i) {
        themePreviewActivity.getClass();
        if (Theme.isCustomWallpaperColor()) {
            Theme.ThemeAccent themeAccent = themePreviewActivity.accent;
            Theme.OverrideWallpaperInfo overrideWallpaperInfo = themeAccent.overrideWallpaper;
            themeAccent.backgroundOverrideColor = overrideWallpaperInfo.color;
            themeAccent.backgroundGradientOverrideColor1 = overrideWallpaperInfo.gradientColor1;
            themeAccent.backgroundGradientOverrideColor2 = overrideWallpaperInfo.gradientColor2;
            themeAccent.backgroundGradientOverrideColor3 = overrideWallpaperInfo.gradientColor3;
            themeAccent.backgroundRotation = overrideWallpaperInfo.rotation;
            String str = overrideWallpaperInfo.slug;
            themeAccent.patternSlug = str;
            float f = overrideWallpaperInfo.intensity;
            themeAccent.patternIntensity = f;
            themePreviewActivity.currentIntensity = f;
            if (str != null && !"c".equals(str)) {
                int size = themePreviewActivity.patterns.size();
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) themePreviewActivity.patterns.get(i2);
                    if (tL_wallPaper.pattern && themePreviewActivity.accent.patternSlug.equals(tL_wallPaper.slug)) {
                        themePreviewActivity.selectedPattern = tL_wallPaper;
                        break;
                    }
                }
            } else {
                themePreviewActivity.selectedPattern = null;
            }
            themePreviewActivity.removeBackgroundOverride = true;
            themePreviewActivity.backgroundCheckBoxView[1].setChecked(themePreviewActivity.selectedPattern != null, true);
            themePreviewActivity.updatePlayAnimationView(false);
            Theme.refreshThemeColors();
        }
        Drawable background = themePreviewActivity.backgroundImage.getBackground();
        if (background instanceof MotionBackgroundDrawable) {
            MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) background;
            motionBackgroundDrawable.setPatternBitmap(100, null);
            if (Theme.getActiveTheme().isDark()) {
                if (themePreviewActivity.currentIntensity < 0.0f) {
                    themePreviewActivity.backgroundImage.getImageReceiver().setGradientBitmap(motionBackgroundDrawable.getBitmap());
                }
                SeekBarView seekBarView = themePreviewActivity.intensitySeekBar;
                if (seekBarView != null) {
                    seekBarView.setTwoSided(true);
                }
            } else {
                float f2 = themePreviewActivity.currentIntensity;
                if (f2 < 0.0f) {
                    themePreviewActivity.currentIntensity = -f2;
                }
            }
        }
        SeekBarView seekBarView2 = themePreviewActivity.intensitySeekBar;
        if (seekBarView2 != null) {
            seekBarView2.setProgress(themePreviewActivity.currentIntensity);
        }
        Theme.resetCustomWallpaper(true);
        themePreviewActivity.selectColorType(2, false);
    }

    public static void $r8$lambda$F6F14OY8MG2OW_TWx_GVUH07dmI(ThemePreviewActivity themePreviewActivity, AlertDialog alertDialog, int i) {
        Theme.ThemeAccent themeAccent = themePreviewActivity.accent;
        if (themeAccent.backgroundOverrideColor == 4294967296L) {
            themeAccent.backgroundOverrideColor = 0L;
            themeAccent.backgroundGradientOverrideColor1 = 0L;
            themeAccent.backgroundGradientOverrideColor2 = 0L;
            themeAccent.backgroundGradientOverrideColor3 = 0L;
            themePreviewActivity.updatePlayAnimationView(false);
            Theme.refreshThemeColors();
        }
        themePreviewActivity.removeBackgroundOverride = true;
        Theme.resetCustomWallpaper(true);
        themePreviewActivity.selectColorType(2, false);
    }

    private void selectPattern(int i) {
        TLRPC.TL_wallPaper tL_wallPaper;
        if (i >= 0 && i < this.patterns.size()) {
            tL_wallPaper = (TLRPC.TL_wallPaper) this.patterns.get(i);
        } else {
            tL_wallPaper = this.lastSelectedPattern;
        }
        TLRPC.TL_wallPaper tL_wallPaper2 = tL_wallPaper;
        if (tL_wallPaper2 == null) {
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
        this.page2.addView(this.backgroundImages[0], this.page2.indexOfChild(this.backgroundImages[1]) + 1);
        BackgroundView[] backgroundViewArr2 = this.backgroundImages;
        BackgroundView backgroundView3 = backgroundViewArr2[0];
        this.backgroundImage = backgroundView3;
        backgroundView3.setBackground(backgroundViewArr2[1].getBackground());
        updateIntensity();
        this.backgroundImages[1].setVisibility(0);
        this.backgroundImages[1].setAlpha(1.0f);
        this.backgroundImage.setVisibility(0);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.valueAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ThemePreviewActivity.this.backgroundImage.setAlpha(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        this.valueAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                ThemePreviewActivity.this.backgroundImage.invalidate();
                ThemePreviewActivity.this.backgroundImages[1].setVisibility(8);
                ThemePreviewActivity.this.valueAnimator = null;
            }
        });
        this.valueAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.valueAnimator.setDuration(300L);
        this.valueAnimator.start();
        this.backgroundImage.getImageReceiver().setCrossfadeDuration(300);
        this.backgroundImage.getImageReceiver().setImage(ImageLocation.getForDocument(tL_wallPaper2.document), this.imageFilter, null, null, null, tL_wallPaper2.document.size, "jpg", tL_wallPaper2, 1);
        this.backgroundImage.onNewImageSet();
        this.selectedPattern = tL_wallPaper2;
        this.isMotion = this.backgroundCheckBoxView[2].isChecked();
        updateButtonState(false, true);
    }

    public void saveAccentWallpaper() {
        Theme.ThemeAccent themeAccent = this.accent;
        if (themeAccent == null || TextUtils.isEmpty(themeAccent.patternSlug)) {
            return;
        }
        try {
            File pathToWallpaper = this.accent.getPathToWallpaper();
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

    private boolean hasChanges(int i) {
        int defaultAccentColor;
        long j;
        if (this.editingTheme) {
            return false;
        }
        if (i == 1 || i == 2) {
            long j2 = this.backupBackgroundOverrideColor;
            if (j2 == 0) {
                int defaultAccentColor2 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper);
                int i2 = (int) this.accent.backgroundOverrideColor;
                if (i2 == 0) {
                    i2 = defaultAccentColor2;
                }
                if (i2 != defaultAccentColor2) {
                    return true;
                }
            } else if (j2 != this.accent.backgroundOverrideColor) {
                return true;
            }
            long j3 = this.backupBackgroundGradientOverrideColor1;
            if (j3 == 0 && this.backupBackgroundGradientOverrideColor2 == 0 && this.backupBackgroundGradientOverrideColor3 == 0) {
                for (int i3 = 0; i3 < 3; i3++) {
                    if (i3 == 0) {
                        defaultAccentColor = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to1);
                        j = this.accent.backgroundGradientOverrideColor1;
                    } else if (i3 == 1) {
                        defaultAccentColor = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to2);
                        j = this.accent.backgroundGradientOverrideColor2;
                    } else {
                        defaultAccentColor = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to3);
                        j = this.accent.backgroundGradientOverrideColor3;
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
            } else {
                Theme.ThemeAccent themeAccent = this.accent;
                if (j3 != themeAccent.backgroundGradientOverrideColor1 || this.backupBackgroundGradientOverrideColor2 != themeAccent.backgroundGradientOverrideColor2 || this.backupBackgroundGradientOverrideColor3 != themeAccent.backgroundGradientOverrideColor3) {
                    return true;
                }
            }
            if (this.accent.backgroundRotation != this.backupBackgroundRotation) {
                return true;
            }
        }
        if (i == 1 || i == 3) {
            int i5 = this.backupAccentColor;
            Theme.ThemeAccent themeAccent2 = this.accent;
            if (i5 != themeAccent2.accentColor2) {
                return true;
            }
            int i6 = this.backupMyMessagesAccentColor;
            if (i6 != 0) {
                if (i6 != themeAccent2.myMessagesAccentColor) {
                    return true;
                }
            } else {
                int i7 = themeAccent2.myMessagesAccentColor;
                if (i7 != 0 && i7 != themeAccent2.accentColor) {
                    return true;
                }
            }
            int i8 = this.backupMyMessagesGradientAccentColor1;
            if (i8 != 0) {
                if (i8 != themeAccent2.myMessagesGradientAccentColor1) {
                    return true;
                }
            } else if (themeAccent2.myMessagesGradientAccentColor1 != 0) {
                return true;
            }
            int i9 = this.backupMyMessagesGradientAccentColor2;
            if (i9 != 0) {
                if (i9 != themeAccent2.myMessagesGradientAccentColor2) {
                    return true;
                }
            } else if (themeAccent2.myMessagesGradientAccentColor2 != 0) {
                return true;
            }
            int i10 = this.backupMyMessagesGradientAccentColor3;
            if (i10 != 0) {
                if (i10 != themeAccent2.myMessagesGradientAccentColor3) {
                    return true;
                }
            } else if (themeAccent2.myMessagesGradientAccentColor3 != 0) {
                return true;
            }
            if (this.backupMyMessagesAnimated != themeAccent2.myMessagesAnimated) {
                return true;
            }
        }
        return false;
    }

    public boolean checkDiscard(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ThemePreviewActivity.checkDiscard(boolean):boolean");
    }

    @Override
    public boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.invalidateMotionBackground);
        getNotificationCenter().addObserver(this, NotificationCenter.wallpaperSettedToUser);
        int i = this.screenType;
        if (i == 1 || i == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        int i2 = this.screenType;
        if (i2 == 2 || i2 == 1) {
            Theme.setChangingWallpaper(true);
        }
        if (this.screenType != 0 || this.accent != null) {
            Point point = AndroidUtilities.displaySize;
            int iMin = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            this.imageFilter = ((int) (iMin / AndroidUtilities.density)) + "_" + ((int) (Math.max(point2.x, point2.y) / AndroidUtilities.density)) + "_f";
            Point point3 = AndroidUtilities.displaySize;
            this.maxWallpaperSize = Math.max(point3.x, point3.y);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            this.TAG = DownloadController.getInstance(this.currentAccount).generateObserverTag();
            if (this.patterns == null) {
                this.patterns = new ArrayList();
                MessagesStorage.getInstance(this.currentAccount).getWallpapers();
            }
        } else {
            this.isMotion = Theme.isWallpaperMotion();
        }
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.invalidateMotionBackground);
        getNotificationCenter().removeObserver(this, NotificationCenter.wallpaperSettedToUser);
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout != null && this.onGlobalLayoutListener != null) {
            frameLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        }
        int i = this.screenType;
        if ((i == 2 || i == 1) && this.onSwitchDayNightDelegate == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    Theme.setChangingWallpaper(false);
                }
            });
        }
        int i2 = this.screenType;
        if (i2 == 2) {
            Bitmap bitmap = this.blurredBitmap;
            if (bitmap != null) {
                bitmap.recycle();
                this.blurredBitmap = null;
            }
            this.themeDelegate.applyChatServiceMessageColor();
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.didSetNewWallpapper, new Object[0]);
        } else if (i2 == 1 || i2 == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (this.screenType != 0 || this.accent != null) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
        }
        super.onFragmentDestroy();
        checkBlur(null);
    }

    private BitmapDrawable checkBlur(Drawable drawable) {
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
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getContext().getResources(), bitmapCreateBitmap);
        this.blurredDrawable = bitmapDrawable;
        bitmapDrawable.setFilterBitmap(true);
        return this.blurredDrawable;
    }

    public void invalidateBlur() {
        FrameLayout frameLayout = this.dimmingSliderContainer;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
        FrameLayout frameLayout2 = this.backgroundButtonsContainer;
        if (frameLayout2 != null) {
            int childCount = frameLayout2.getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.backgroundButtonsContainer.getChildAt(i).invalidate();
            }
        }
        FrameLayout frameLayout3 = this.messagesButtonsContainer;
        if (frameLayout3 != null) {
            int childCount2 = frameLayout3.getChildCount();
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
            for (int i5 = 0; i5 < this.listView2.getChildCount(); i5++) {
                View childAt2 = this.listView2.getChildAt(i5);
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
        FrameLayout frameLayout4 = this.bottomOverlayChat;
        if (frameLayout4 != null) {
            frameLayout4.invalidate();
        }
    }

    private void setVisiblePart(ChatActionCell chatActionCell) {
        float measuredWidth;
        if (this.backgroundImage == null) {
            return;
        }
        if (this.themeDelegate.serviceBitmap == null) {
            measuredWidth = this.currentScrollOffset + 0.0f;
        } else {
            float width = this.themeDelegate.serviceBitmap.getWidth();
            measuredWidth = ((this.backgroundImage.getMeasuredWidth() - (width * Math.max(this.backgroundImage.getMeasuredWidth() / width, this.backgroundImage.getMeasuredHeight() / this.themeDelegate.serviceBitmap.getHeight()))) / 2.0f) + this.currentScrollOffset + 0.0f;
        }
        chatActionCell.setVisiblePart(chatActionCell.getY() - ((-this.backgroundImage.ty) + 0.0f), measuredWidth, this.backgroundImage.getMeasuredHeight(), this.shouldShowBrightnessControll ? this.dimAmount * this.progressToDarkTheme : 0.0f);
    }

    @Override
    public void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        if (z || this.screenType != 2) {
            return;
        }
        this.themeDelegate.applyChatServiceMessageColor();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.didSetNewWallpapper, new Object[0]);
    }

    @Override
    public void onBottomSheetCreated() {
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
    public void onResume() {
        super.onResume();
        DialogsAdapter dialogsAdapter = this.dialogsAdapter;
        if (dialogsAdapter != null) {
            dialogsAdapter.notifyDataSetChanged();
        }
        MessagesAdapter messagesAdapter = this.messagesAdapter;
        if (messagesAdapter != null) {
            messagesAdapter.notifyDataSetChanged();
        }
        if (this.isMotion) {
            this.parallaxEffect.setEnabled(true);
        }
        Theme.disallowChangeServiceMessageColor = true;
    }

    @Override
    public void onPause() {
        super.onPause();
        if (this.isMotion) {
            this.parallaxEffect.setEnabled(false);
        }
        Theme.disallowChangeServiceMessageColor = false;
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.screenType != 2) {
            return false;
        }
        return !this.hasScrollingBackground || motionEvent == null || motionEvent.getY() <= ((float) (AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight()));
    }

    @Override
    public void onFailedDownload(String str, boolean z) {
        updateButtonState(true, z);
    }

    @Override
    public void onSuccessDownload(String str) {
        updateButtonState(false, true);
    }

    @Override
    public int getObserverTag() {
        return this.TAG;
    }

    public void updateBlurred() {
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
        if (this.isBlurred) {
            Bitmap bitmap2 = this.blurredBitmap;
            if (bitmap2 != null) {
                this.backgroundImage.setImageBitmap(bitmap2);
                return;
            }
            return;
        }
        setCurrentImage(false);
    }

    @Override
    public boolean onBackPressed(boolean z) {
        if (!checkDiscard(z)) {
            return false;
        }
        cancelThemeApply(true);
        return super.onBackPressed(z);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
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
                    ((DialogCell) childAt).update(0);
                }
            }
            return;
        }
        if (i == NotificationCenter.invalidateMotionBackground) {
            RecyclerListView recyclerListView2 = this.listView2;
            if (recyclerListView2 != null) {
                recyclerListView2.invalidateViews();
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
        if (i == NotificationCenter.wallpapersDidLoad) {
            ArrayList arrayList = (ArrayList) objArr[0];
            this.patterns.clear();
            this.patternsDict.clear();
            int size = arrayList.size();
            boolean z = false;
            for (int i4 = 0; i4 < size; i4++) {
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i4);
                if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                    TLRPC.Document document = wallPaper.document;
                    if (document != null && !this.patternsDict.containsKey(Long.valueOf(document.id))) {
                        this.patterns.add(wallPaper);
                        this.patternsDict.put(Long.valueOf(wallPaper.document.id), wallPaper);
                    }
                    Theme.ThemeAccent themeAccent = this.accent;
                    if (themeAccent != null && (str2 = themeAccent.patternSlug) != null && str2.equals(wallPaper.slug)) {
                        this.selectedPattern = (TLRPC.TL_wallPaper) wallPaper;
                        setCurrentImage(false);
                        updateButtonState(false, false);
                    } else if (this.accent != null || (tL_wallPaper2 = this.selectedPattern) == null || (str = tL_wallPaper2.slug) == null || !str.equals(wallPaper.slug)) {
                    }
                    z = true;
                }
            }
            if (!z && (tL_wallPaper = this.selectedPattern) != null) {
                this.patterns.add(0, tL_wallPaper);
            }
            PatternsAdapter patternsAdapter = this.patternsAdapter;
            if (patternsAdapter != null) {
                patternsAdapter.notifyDataSetChanged();
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
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ThemePreviewActivity.$r8$lambda$Vi7T5WWz0lQdvntjdFvAOYufYJw(this.f$0, tLObject, tL_error);
                }
            }), this.classGuid);
            return;
        }
        if (i != NotificationCenter.wallpaperSettedToUser || this.dialogId == 0) {
            return;
        }
        finishFragment();
    }

    public static void $r8$lambda$Vi7T5WWz0lQdvntjdFvAOYufYJw(final ThemePreviewActivity themePreviewActivity, final TLObject tLObject, TLRPC.TL_error tL_error) {
        themePreviewActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ThemePreviewActivity.$r8$lambda$mcX8ZbTIzaUpIuGC5KA2x2RZN1o(this.f$0, tLObject);
            }
        });
    }

    public static void $r8$lambda$mcX8ZbTIzaUpIuGC5KA2x2RZN1o(final ThemePreviewActivity themePreviewActivity, TLObject tLObject) {
        Theme.ThemeAccent themeAccent;
        TLRPC.TL_wallPaper tL_wallPaper;
        TLRPC.TL_wallPaper tL_wallPaper2;
        String str;
        String str2;
        themePreviewActivity.getClass();
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            themePreviewActivity.patterns.clear();
            themePreviewActivity.patternsDict.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                if (tL_wallPapers.wallpapers.get(i) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i);
                    if (tL_wallPaper3.pattern) {
                        TLRPC.Document document = tL_wallPaper3.document;
                        if (document != null && !themePreviewActivity.patternsDict.containsKey(Long.valueOf(document.id))) {
                            themePreviewActivity.patterns.add(tL_wallPaper3);
                            themePreviewActivity.patternsDict.put(Long.valueOf(tL_wallPaper3.document.id), tL_wallPaper3);
                        }
                        Theme.ThemeAccent themeAccent2 = themePreviewActivity.accent;
                        if (themeAccent2 != null && (str2 = themeAccent2.patternSlug) != null && str2.equals(tL_wallPaper3.slug)) {
                            themePreviewActivity.selectedPattern = tL_wallPaper3;
                            themePreviewActivity.setCurrentImage(false);
                            themePreviewActivity.updateButtonState(false, false);
                        } else if (themePreviewActivity.accent != null || (tL_wallPaper2 = themePreviewActivity.selectedPattern) == null || (str = tL_wallPaper2.slug) == null || !str.equals(tL_wallPaper3.slug)) {
                        }
                        z = true;
                    }
                }
            }
            if (!z && (tL_wallPaper = themePreviewActivity.selectedPattern) != null) {
                themePreviewActivity.patterns.add(0, tL_wallPaper);
            }
            PatternsAdapter patternsAdapter = themePreviewActivity.patternsAdapter;
            if (patternsAdapter != null) {
                patternsAdapter.notifyDataSetChanged();
            }
            MessagesStorage.getInstance(themePreviewActivity.currentAccount).putWallpapers(tL_wallPapers.wallpapers, 1);
        }
        if (themePreviewActivity.selectedPattern != null || (themeAccent = themePreviewActivity.accent) == null || TextUtils.isEmpty(themeAccent.patternSlug)) {
            return;
        }
        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = themePreviewActivity.accent.patternSlug;
        getwallpaper.wallpaper = tL_inputWallPaperSlug;
        ConnectionsManager.getInstance(themePreviewActivity.currentAccount).bindRequestToGuid(themePreviewActivity.getConnectionsManager().sendRequest(getwallpaper, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                ThemePreviewActivity.$r8$lambda$gD4HqCNx__ulLMgFF7T_Yrp331Q(this.f$0, tLObject2, tL_error);
            }
        }), themePreviewActivity.classGuid);
    }

    public static void $r8$lambda$gD4HqCNx__ulLMgFF7T_Yrp331Q(final ThemePreviewActivity themePreviewActivity, final TLObject tLObject, TLRPC.TL_error tL_error) {
        themePreviewActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ThemePreviewActivity.m4683$r8$lambda$imLDks32R2Ur2yjv8vcXv1SEKM(this.f$0, tLObject);
            }
        });
    }

    public static void m4683$r8$lambda$imLDks32R2Ur2yjv8vcXv1SEKM(ThemePreviewActivity themePreviewActivity, TLObject tLObject) {
        themePreviewActivity.getClass();
        if (tLObject instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject;
            if (tL_wallPaper.pattern) {
                themePreviewActivity.selectedPattern = tL_wallPaper;
                themePreviewActivity.setCurrentImage(false);
                themePreviewActivity.updateButtonState(false, false);
                themePreviewActivity.patterns.add(0, themePreviewActivity.selectedPattern);
                PatternsAdapter patternsAdapter = themePreviewActivity.patternsAdapter;
                if (patternsAdapter != null) {
                    patternsAdapter.notifyDataSetChanged();
                }
            }
        }
    }

    public void cancelThemeApply(boolean z) {
        if (this.screenType == 2) {
            if (z) {
                return;
            }
            finishFragment();
            return;
        }
        Theme.applyPreviousTheme();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        if (this.screenType == 1) {
            if (this.editingTheme) {
                Theme.ThemeAccent themeAccent = this.accent;
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
            Theme.saveThemeAccents(this.applyingTheme, false, true, false, false);
        } else {
            if (this.accent != null) {
                Theme.saveThemeAccents(this.applyingTheme, false, this.deleteOnCancel, false, false);
            }
            this.parentLayout.rebuildAllFragmentViews(false, false);
            if (this.deleteOnCancel) {
                Theme.ThemeInfo themeInfo = this.applyingTheme;
                if (themeInfo.pathToFile != null && !Theme.isThemeInstalled(themeInfo)) {
                    new File(this.applyingTheme.pathToFile).delete();
                }
            }
        }
        if (z) {
            return;
        }
        finishFragment();
    }

    public int getButtonsColor(int i) {
        return this.useDefaultThemeForButtons ? Theme.getDefaultColor(i) : getThemedColor(i);
    }

    public void scheduleApplyColor(int i, int i2, boolean z) {
        if (i2 == -1) {
            int i3 = this.colorType;
            if (i3 == 1 || i3 == 2) {
                long j = this.backupBackgroundOverrideColor;
                if (j != 0) {
                    this.accent.backgroundOverrideColor = j;
                } else {
                    this.accent.backgroundOverrideColor = 0L;
                }
                long j2 = this.backupBackgroundGradientOverrideColor1;
                if (j2 != 0) {
                    this.accent.backgroundGradientOverrideColor1 = j2;
                } else {
                    this.accent.backgroundGradientOverrideColor1 = 0L;
                }
                long j3 = this.backupBackgroundGradientOverrideColor2;
                if (j3 != 0) {
                    this.accent.backgroundGradientOverrideColor2 = j3;
                } else {
                    this.accent.backgroundGradientOverrideColor2 = 0L;
                }
                long j4 = this.backupBackgroundGradientOverrideColor3;
                if (j4 != 0) {
                    this.accent.backgroundGradientOverrideColor3 = j4;
                } else {
                    this.accent.backgroundGradientOverrideColor3 = 0L;
                }
                this.accent.backgroundRotation = this.backupBackgroundRotation;
                if (i3 == 2) {
                    int defaultAccentColor = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper);
                    int defaultAccentColor2 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to1);
                    int defaultAccentColor3 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to2);
                    int defaultAccentColor4 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to3);
                    Theme.ThemeAccent themeAccent = this.accent;
                    int i4 = (int) themeAccent.backgroundGradientOverrideColor1;
                    int i5 = (int) themeAccent.backgroundGradientOverrideColor2;
                    int i6 = (int) themeAccent.backgroundGradientOverrideColor3;
                    int i7 = (int) themeAccent.backgroundOverrideColor;
                    ColorPicker colorPicker = this.colorPicker;
                    if (i6 != 0) {
                        defaultAccentColor4 = i6;
                    }
                    colorPicker.setColor(defaultAccentColor4, 3);
                    ColorPicker colorPicker2 = this.colorPicker;
                    if (i5 != 0) {
                        defaultAccentColor3 = i5;
                    }
                    colorPicker2.setColor(defaultAccentColor3, 2);
                    ColorPicker colorPicker3 = this.colorPicker;
                    if (i4 != 0) {
                        defaultAccentColor2 = i4;
                    }
                    colorPicker3.setColor(defaultAccentColor2, 1);
                    ColorPicker colorPicker4 = this.colorPicker;
                    if (i7 != 0) {
                        defaultAccentColor = i7;
                    }
                    colorPicker4.setColor(defaultAccentColor, 0);
                }
            }
            int i8 = this.colorType;
            if (i8 == 1 || i8 == 3) {
                int i9 = this.backupMyMessagesAccentColor;
                if (i9 != 0) {
                    this.accent.myMessagesAccentColor = i9;
                } else {
                    this.accent.myMessagesAccentColor = 0;
                }
                int i10 = this.backupMyMessagesGradientAccentColor1;
                if (i10 != 0) {
                    this.accent.myMessagesGradientAccentColor1 = i10;
                } else {
                    this.accent.myMessagesGradientAccentColor1 = 0;
                }
                int i11 = this.backupMyMessagesGradientAccentColor2;
                if (i11 != 0) {
                    this.accent.myMessagesGradientAccentColor2 = i11;
                } else {
                    this.accent.myMessagesGradientAccentColor2 = 0;
                }
                int i12 = this.backupMyMessagesGradientAccentColor3;
                if (i12 != 0) {
                    this.accent.myMessagesGradientAccentColor3 = i12;
                } else {
                    this.accent.myMessagesGradientAccentColor3 = 0;
                }
                if (i8 == 3) {
                    this.colorPicker.setColor(this.accent.myMessagesGradientAccentColor3, 3);
                    this.colorPicker.setColor(this.accent.myMessagesGradientAccentColor2, 2);
                    this.colorPicker.setColor(this.accent.myMessagesGradientAccentColor1, 1);
                    ColorPicker colorPicker5 = this.colorPicker;
                    Theme.ThemeAccent themeAccent2 = this.accent;
                    int i13 = themeAccent2.myMessagesAccentColor;
                    if (i13 == 0) {
                        i13 = themeAccent2.accentColor;
                    }
                    colorPicker5.setColor(i13, 0);
                }
            }
            Theme.refreshThemeColors();
            this.listView2.invalidateViews();
            return;
        }
        int i14 = this.lastPickedColorNum;
        if (i14 != -1 && i14 != i2) {
            this.applyColorAction.run();
        }
        this.lastPickedColor = i;
        this.lastPickedColorNum = i2;
        if (z) {
            this.applyColorAction.run();
        } else {
            if (this.applyColorScheduled) {
                return;
            }
            this.applyColorScheduled = true;
            this.fragmentView.postDelayed(this.applyColorAction, 16L);
        }
    }

    private void applyColor(int i, int i2) {
        int i3 = this.colorType;
        if (i3 == 1) {
            if (i2 == 0) {
                this.accent.accentColor = i;
                Theme.refreshThemeColors();
            } else if (i2 == 1) {
                this.accent.accentColor2 = i;
                Theme.refreshThemeColors(true, true);
                this.listView2.invalidateViews();
                this.colorPicker.setHasChanges(hasChanges(this.colorType));
                updatePlayAnimationView(true);
            }
        } else if (i3 == 2) {
            if (this.lastPickedColorNum == 0) {
                this.accent.backgroundOverrideColor = i;
            } else if (i2 == 1) {
                int defaultAccentColor = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to1);
                if (i == 0 && defaultAccentColor != 0) {
                    this.accent.backgroundGradientOverrideColor1 = 4294967296L;
                } else {
                    this.accent.backgroundGradientOverrideColor1 = i;
                }
            } else if (i2 == 2) {
                int defaultAccentColor2 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to2);
                if (i == 0 && defaultAccentColor2 != 0) {
                    this.accent.backgroundGradientOverrideColor2 = 4294967296L;
                } else {
                    this.accent.backgroundGradientOverrideColor2 = i;
                }
            } else if (i2 == 3) {
                int defaultAccentColor3 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to3);
                if (i == 0 && defaultAccentColor3 != 0) {
                    this.accent.backgroundGradientOverrideColor3 = 4294967296L;
                } else {
                    this.accent.backgroundGradientOverrideColor3 = i;
                }
            }
            Theme.refreshThemeColors(true, false);
            this.colorPicker.setHasChanges(hasChanges(this.colorType));
            updatePlayAnimationView(true);
        } else if (i3 == 3) {
            int i4 = this.lastPickedColorNum;
            if (i4 == 0) {
                this.accent.myMessagesAccentColor = i;
            } else if (i4 == 1) {
                this.accent.myMessagesGradientAccentColor1 = i;
            } else if (i4 == 2) {
                Theme.ThemeAccent themeAccent = this.accent;
                int i5 = themeAccent.myMessagesGradientAccentColor2;
                themeAccent.myMessagesGradientAccentColor2 = i;
                if (i5 != 0 && i == 0) {
                    this.messagesAdapter.notifyItemRemoved(0);
                } else if (i5 == 0 && i != 0) {
                    this.messagesAdapter.notifyItemInserted(0);
                    showAnimationHint();
                }
            } else {
                this.accent.myMessagesGradientAccentColor3 = i;
            }
            int i6 = this.lastPickedColorNum;
            if (i6 >= 0) {
                this.messagesCheckBoxView[1].setColor(i6, i);
            }
            Theme.refreshThemeColors(true, true);
            this.listView2.invalidateViews();
            this.colorPicker.setHasChanges(hasChanges(this.colorType));
            updatePlayAnimationView(true);
        }
        int size = this.themeDescriptions.size();
        for (int i7 = 0; i7 < size; i7++) {
            ThemeDescription themeDescription = (ThemeDescription) this.themeDescriptions.get(i7);
            themeDescription.setColor(getThemedColor(themeDescription.getCurrentKey()), false, false);
        }
        this.listView.invalidateViews();
        this.listView2.invalidateViews();
        View view = this.dotsContainer;
        if (view != null) {
            view.invalidate();
        }
    }

    private void updateButtonState(boolean z, boolean z2) {
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
        boolean z3 = obj instanceof TLRPC.TL_wallPaper;
        if (z3 || (obj instanceof MediaController.SearchImage)) {
            if (z3) {
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
            if (zExists) {
                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                this.backgroundImage.invalidate();
                if (this.screenType == 2) {
                    if (j != 0 && this.dialogId == 0) {
                        this.actionBar2.setSubtitle(AndroidUtilities.formatFileSize(j));
                    } else {
                        this.actionBar2.setSubtitle(null);
                    }
                }
            } else {
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(attachFileName, null, this);
                if (this.screenType == 2 && this.dialogId == 0) {
                    this.actionBar2.setSubtitle(LocaleController.getString(R.string.LoadingFullImage));
                }
                this.backgroundImage.invalidate();
            }
            if (this.selectedPattern == null && (frameLayout = this.backgroundButtonsContainer) != null) {
                frameLayout.setAlpha(zExists ? 1.0f : 0.5f);
            }
            int i2 = this.screenType;
            if (i2 == 0) {
                this.doneButton.setEnabled(zExists);
                this.doneButton.setAlpha(zExists ? 1.0f : 0.5f);
                return;
            }
            if (i2 == 2) {
                this.bottomOverlayChat.setEnabled(zExists);
                BlurButton blurButton = this.applyButton1;
                if (blurButton != null) {
                    blurButton.setAlpha(zExists ? 1.0f : 0.5f);
                }
                BlurButton blurButton2 = this.applyButton2;
                if (blurButton2 != null) {
                    blurButton2.setAlpha(zExists ? 1.0f : 0.5f);
                    return;
                }
                return;
            }
            this.saveItem.setEnabled(zExists);
            this.saveItem.setAlpha(zExists ? 1.0f : 0.5f);
        }
    }

    public void setDelegate(WallpaperActivityDelegate wallpaperActivityDelegate) {
        this.delegate = wallpaperActivityDelegate;
    }

    public void setPatterns(ArrayList arrayList) {
        this.patterns = arrayList;
        if (this.screenType == 1 || (this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper)) {
            WallpapersListActivity.ColorWallpaper colorWallpaper = (WallpapersListActivity.ColorWallpaper) this.currentWallpaper;
            if (colorWallpaper.patternId != 0) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) this.patterns.get(i);
                    if (tL_wallPaper.id == colorWallpaper.patternId) {
                        this.selectedPattern = tL_wallPaper;
                        break;
                    }
                }
                this.currentIntensity = colorWallpaper.intensity;
            }
        }
    }

    private void showAnimationHint() {
        if (this.page2 == null || this.messagesCheckBoxView == null || this.accent.myMessagesGradientAccentColor2 == 0) {
            return;
        }
        final SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("bganimationhint", false)) {
            return;
        }
        if (this.animationHint == null) {
            HintView hintView = new HintView(getParentActivity(), 8);
            this.animationHint = hintView;
            hintView.setShowingDuration(5000L);
            this.animationHint.setAlpha(0.0f);
            this.animationHint.setVisibility(4);
            this.animationHint.setText(LocaleController.getString(R.string.BackgroundAnimateInfo));
            this.animationHint.setExtraTranslationY(AndroidUtilities.dp(6.0f));
            this.frameLayout.addView(this.animationHint, LayoutHelper.createFrame(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ThemePreviewActivity.m4688$r8$lambda$x1Zgc3jsqHZu_u_wxarUZEzhGg(this.f$0, globalMainSettings);
            }
        }, 500L);
    }

    public static void m4688$r8$lambda$x1Zgc3jsqHZu_u_wxarUZEzhGg(ThemePreviewActivity themePreviewActivity, SharedPreferences sharedPreferences) {
        if (themePreviewActivity.colorType != 3) {
            return;
        }
        sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
        themePreviewActivity.animationHint.showForView(themePreviewActivity.messagesCheckBoxView[0], true);
    }

    private void updateSelectedPattern(boolean z) {
        int childCount = this.patternsListView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.patternsListView.getChildAt(i);
            if (childAt instanceof PatternCell) {
                ((PatternCell) childAt).updateSelected(z);
            }
        }
    }

    private void updateMotionButton() {
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
                public void onAnimationEnd(Animator animator) {
                    ThemePreviewActivity.this.backgroundCheckBoxView[ThemePreviewActivity.this.selectedPattern != null ? (char) 0 : (char) 2].setVisibility(4);
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
        int iDp = (layoutParams.width + AndroidUtilities.dp(9.0f)) / 2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.backgroundCheckBoxView[0], (Property<WallpaperCheckBoxView, Float>) View.ALPHA, this.selectedPattern == null ? 0.0f : 1.0f));
        WallpaperCheckBoxView wallpaperCheckBoxView2 = this.backgroundCheckBoxView[0];
        Property property2 = View.TRANSLATION_X;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(wallpaperCheckBoxView2, (Property<WallpaperCheckBoxView, Float>) property2, this.selectedPattern != null ? 0.0f : iDp));
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.backgroundCheckBoxView[1], (Property<WallpaperCheckBoxView, Float>) property2, this.selectedPattern == null ? -iDp : 0.0f));
        animatorSet2.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        animatorSet2.setDuration(200L);
        animatorSet2.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (ThemePreviewActivity.this.selectedPattern == null) {
                    ThemePreviewActivity.this.backgroundCheckBoxView[0].setVisibility(4);
                }
            }
        });
        animatorSet2.start();
    }

    public void showPatternsView(final int i, final boolean z, boolean z2) {
        int iIndexOf;
        int i2;
        int i3;
        final boolean z3 = z && i == 1 && this.selectedPattern != null;
        if (z) {
            if (i == 0) {
                if (this.screenType == 2) {
                    this.previousBackgroundColor = this.backgroundColor;
                    int i4 = this.backgroundGradientColor1;
                    this.previousBackgroundGradientColor1 = i4;
                    int i5 = this.backgroundGradientColor2;
                    this.previousBackgroundGradientColor2 = i5;
                    int i6 = this.backgroundGradientColor3;
                    this.previousBackgroundGradientColor3 = i6;
                    int i7 = this.backupBackgroundRotation;
                    this.previousBackgroundRotation = i7;
                    if (i6 != 0) {
                        i2 = i7;
                        i3 = 4;
                    } else {
                        i2 = i7;
                        if (i5 != 0) {
                            i3 = 3;
                        } else {
                            i3 = i4 != 0 ? 2 : 1;
                        }
                    }
                    this.colorPicker.setType(0, false, 4, i3, false, i2, false);
                    this.colorPicker.setColor(this.backgroundGradientColor3, 3);
                    this.colorPicker.setColor(this.backgroundGradientColor2, 2);
                    this.colorPicker.setColor(this.backgroundGradientColor1, 1);
                    this.colorPicker.setColor(this.backgroundColor, 0);
                }
            } else {
                this.previousSelectedPattern = this.selectedPattern;
                this.previousIntensity = this.currentIntensity;
                this.patternsAdapter.notifyDataSetChanged();
                ArrayList arrayList = this.patterns;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.selectedPattern;
                    if (tL_wallPaper == null) {
                        iIndexOf = 0;
                    } else {
                        iIndexOf = arrayList.indexOf(tL_wallPaper) + (this.screenType == 2 ? 1 : 0);
                    }
                    this.patternsLayoutManager.scrollToPositionWithOffset(iIndexOf, (this.patternsListView.getMeasuredWidth() - AndroidUtilities.dp(124.0f)) / 2);
                }
            }
        }
        int i8 = this.screenType;
        if (i8 == 1 || i8 == 2) {
            this.backgroundCheckBoxView[z3 ? (char) 2 : (char) 0].setVisibility(0);
        }
        if (i == 1 && !this.intensitySeekBar.isTwoSided()) {
            float f = this.currentIntensity;
            if (f < 0.0f) {
                float f2 = -f;
                this.currentIntensity = f2;
                this.intensitySeekBar.setProgress(f2);
            }
        }
        if (z2) {
            this.patternViewAnimation = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            int i9 = i == 0 ? 1 : 0;
            if (z) {
                this.patternLayout[i].setVisibility(0);
                int i10 = this.screenType;
                if (i10 == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.listView2, (Property<RecyclerListView, Float>) View.TRANSLATION_Y, i == 1 ? -AndroidUtilities.dp(21.0f) : 0.0f));
                    WallpaperCheckBoxView wallpaperCheckBoxView = this.backgroundCheckBoxView[2];
                    Property property = View.ALPHA;
                    arrayList2.add(ObjectAnimator.ofFloat(wallpaperCheckBoxView, (Property<WallpaperCheckBoxView, Float>) property, z3 ? 1.0f : 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.backgroundCheckBoxView[0], (Property<WallpaperCheckBoxView, Float>) property, z3 ? 0.0f : 1.0f));
                    if (i == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.patternLayout[i], (Property<FrameLayout, Float>) property, 0.0f, 1.0f));
                    } else {
                        this.patternLayout[i].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.patternLayout[i9], (Property<FrameLayout, Float>) property, 0.0f));
                    }
                    this.colorPicker.hideKeyboard();
                } else if (i10 == 2) {
                    RecyclerListView recyclerListView = this.listView2;
                    Property property2 = View.TRANSLATION_Y;
                    arrayList2.add(ObjectAnimator.ofFloat(recyclerListView, (Property<RecyclerListView, Float>) property2, (-this.patternLayout[i].getMeasuredHeight()) + AndroidUtilities.dp((this.applyButton2 == null ? 0 : 58) + 72) + (insideBottomSheet() ? AndroidUtilities.navigationBarHeight : 0)));
                    WallpaperCheckBoxView wallpaperCheckBoxView2 = this.backgroundCheckBoxView[2];
                    Property property3 = View.ALPHA;
                    arrayList2.add(ObjectAnimator.ofFloat(wallpaperCheckBoxView2, (Property<WallpaperCheckBoxView, Float>) property3, z3 ? 1.0f : 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.backgroundCheckBoxView[0], (Property<WallpaperCheckBoxView, Float>) property3, z3 ? 0.0f : 1.0f));
                    if (this.patternLayout[i9].getVisibility() == 0) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.patternLayout[i9], (Property<FrameLayout, Float>) property3, 0.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.patternLayout[i], (Property<FrameLayout, Float>) property3, 0.0f, 1.0f));
                        this.patternLayout[i].setTranslationY(0.0f);
                    } else {
                        FrameLayout frameLayout = this.patternLayout[i];
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property2, frameLayout.getMeasuredHeight(), 0.0f));
                    }
                } else {
                    if (i == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.patternLayout[i], (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                    } else {
                        this.patternLayout[i].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(this.patternLayout[i9], (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                    }
                    this.colorPicker.hideKeyboard();
                }
            } else {
                RecyclerListView recyclerListView2 = this.listView2;
                Property property4 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(recyclerListView2, (Property<RecyclerListView, Float>) property4, 0.0f));
                FrameLayout frameLayout2 = this.patternLayout[i];
                arrayList2.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property4, frameLayout2.getMeasuredHeight()));
                WallpaperCheckBoxView wallpaperCheckBoxView3 = this.backgroundCheckBoxView[0];
                Property property5 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(wallpaperCheckBoxView3, (Property<WallpaperCheckBoxView, Float>) property5, 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.backgroundCheckBoxView[2], (Property<WallpaperCheckBoxView, Float>) property5, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.backgroundImage, (Property<BackgroundView, Float>) property5, 1.0f));
            }
            this.patternViewAnimation.playTogether(arrayList2);
            final int i11 = i9;
            this.patternViewAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ThemePreviewActivity.this.patternViewAnimation = null;
                    if (z && ThemePreviewActivity.this.patternLayout[i11].getVisibility() == 0) {
                        ThemePreviewActivity.this.patternLayout[i11].setAlpha(1.0f);
                        ThemePreviewActivity.this.patternLayout[i11].setVisibility(4);
                    } else if (!z) {
                        ThemePreviewActivity.this.patternLayout[i].setVisibility(4);
                    }
                    if (ThemePreviewActivity.this.screenType == 1 || ThemePreviewActivity.this.screenType == 2) {
                        ThemePreviewActivity.this.backgroundCheckBoxView[z3 ? (char) 0 : (char) 2].setVisibility(4);
                    } else if (i == 1) {
                        ThemePreviewActivity.this.patternLayout[i11].setAlpha(0.0f);
                    }
                }
            });
            this.patternViewAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.patternViewAnimation.setDuration(200L);
            this.patternViewAnimation.start();
            return;
        }
        char c = i == 0 ? (char) 1 : (char) 0;
        if (z) {
            this.patternLayout[i].setVisibility(0);
            int i12 = this.screenType;
            if (i12 == 1) {
                this.listView2.setTranslationY(i == 1 ? -AndroidUtilities.dp(21.0f) : 0.0f);
                this.backgroundCheckBoxView[2].setAlpha(z3 ? 1.0f : 0.0f);
                this.backgroundCheckBoxView[0].setAlpha(z3 ? 0.0f : 1.0f);
                if (i == 1) {
                    this.patternLayout[i].setAlpha(1.0f);
                } else {
                    this.patternLayout[i].setAlpha(1.0f);
                    this.patternLayout[c].setAlpha(0.0f);
                }
                this.colorPicker.hideKeyboard();
            } else if (i12 == 2) {
                this.listView2.setTranslationY((-AndroidUtilities.dp(i == 0 ? 343.0f : 316.0f)) + AndroidUtilities.dp((this.applyButton2 == null ? 0 : 58) + 72) + (insideBottomSheet() ? AndroidUtilities.navigationBarHeight : 0));
                this.backgroundCheckBoxView[2].setAlpha(z3 ? 1.0f : 0.0f);
                this.backgroundCheckBoxView[0].setAlpha(z3 ? 0.0f : 1.0f);
                if (this.patternLayout[c].getVisibility() == 0) {
                    this.patternLayout[c].setAlpha(0.0f);
                    this.patternLayout[i].setAlpha(1.0f);
                    this.patternLayout[i].setTranslationY(0.0f);
                } else {
                    this.patternLayout[i].setTranslationY(0.0f);
                }
            } else {
                if (i == 1) {
                    this.patternLayout[i].setAlpha(1.0f);
                } else {
                    this.patternLayout[i].setAlpha(1.0f);
                    this.patternLayout[c].setAlpha(0.0f);
                }
                this.colorPicker.hideKeyboard();
            }
        } else {
            this.listView2.setTranslationY(0.0f);
            FrameLayout frameLayout3 = this.patternLayout[i];
            frameLayout3.setTranslationY(frameLayout3.getMeasuredHeight());
            this.backgroundCheckBoxView[0].setAlpha(1.0f);
            this.backgroundCheckBoxView[2].setAlpha(1.0f);
            this.backgroundImage.setAlpha(1.0f);
        }
        if (z && this.patternLayout[c].getVisibility() == 0) {
            this.patternLayout[c].setAlpha(1.0f);
            this.patternLayout[c].setVisibility(4);
        } else if (!z) {
            this.patternLayout[i].setVisibility(4);
        }
        int i13 = this.screenType;
        if (i13 == 1 || i13 == 2) {
            this.backgroundCheckBoxView[z3 ? (char) 0 : (char) 2].setVisibility(4);
        } else if (i == 1) {
            this.patternLayout[c].setAlpha(0.0f);
        }
    }

    private void animateMotionChange() {
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
        this.motionAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                ThemePreviewActivity.this.motionAnimation = null;
            }
        });
        this.motionAnimation.start();
    }

    private void updatePlayAnimationView(boolean z) {
        char c;
        char c2;
        float f;
        float f2;
        FrameLayout frameLayout;
        boolean z2;
        AnimatorSet animatorSet;
        int defaultAccentColor;
        int i;
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
        int defaultAccentColor2;
        if (Build.VERSION.SDK_INT >= 29) {
            int i2 = this.screenType;
            if (i2 == 0) {
                Theme.ThemeAccent themeAccent = this.accent;
                if (themeAccent != null) {
                    defaultAccentColor2 = (int) themeAccent.backgroundGradientOverrideColor2;
                } else {
                    defaultAccentColor2 = getThemedColor(Theme.key_chat_wallpaper_gradient_to2);
                }
            } else if (i2 == 1) {
                defaultAccentColor2 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to2);
                long j = this.accent.backgroundGradientOverrideColor2;
                int i3 = (int) j;
                if (i3 == 0 && j != 0) {
                    defaultAccentColor2 = 0;
                } else if (i3 != 0) {
                    defaultAccentColor2 = i3;
                }
            } else if (this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) {
                defaultAccentColor2 = this.backgroundGradientColor2;
            } else {
                defaultAccentColor2 = 0;
            }
            if (defaultAccentColor2 != 0 && this.currentIntensity >= 0.0f) {
                this.backgroundImage.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
            } else {
                this.backgroundImage.getImageReceiver().setBlendMode(null);
            }
        }
        if (this.backgroundPlayAnimationView != null) {
            int i4 = this.screenType;
            if (i4 == 2) {
                if (this.backgroundGradientColor1 != 0) {
                    c = 3;
                    c2 = 2;
                    i = defaultAccentColor;
                    z3 = true;
                    if (this.backgroundPlayAnimationView.getTag() != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.backgroundPlayAnimationView.setTag(z3 ? 1 : null);
                    if (z4 != z3) {
                        if (z3) {
                            this.backgroundPlayAnimationView.setVisibility(0);
                        }
                        animatorSet2 = this.backgroundPlayViewAnimator;
                        if (animatorSet2 != null) {
                            animatorSet2.cancel();
                        }
                        if (z) {
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.backgroundPlayViewAnimator = animatorSet3;
                            FrameLayout frameLayout2 = this.backgroundPlayAnimationView;
                            Property property = View.ALPHA;
                            if (z3) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, f7);
                            FrameLayout frameLayout3 = this.backgroundPlayAnimationView;
                            Property property2 = View.SCALE_X;
                            if (z3) {
                                f8 = 1.0f;
                            } else {
                                f8 = 0.0f;
                            }
                            f = 34.0f;
                            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, f8);
                            FrameLayout frameLayout4 = this.backgroundPlayAnimationView;
                            Property property3 = View.SCALE_Y;
                            if (z3) {
                                f9 = 1.0f;
                            } else {
                                f9 = 0.0f;
                            }
                            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(frameLayout4, (Property<FrameLayout, Float>) property3, f9);
                            WallpaperCheckBoxView wallpaperCheckBoxView = this.backgroundCheckBoxView[0];
                            Property property4 = View.TRANSLATION_X;
                            if (z3) {
                                fDp3 = AndroidUtilities.dp(34.0f);
                            } else {
                                fDp3 = 0.0f;
                            }
                            f2 = 1.0f;
                            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(wallpaperCheckBoxView, (Property<WallpaperCheckBoxView, Float>) property4, fDp3);
                            WallpaperCheckBoxView wallpaperCheckBoxView2 = this.backgroundCheckBoxView[1];
                            if (z3) {
                                f10 = -AndroidUtilities.dp(34.0f);
                            } else {
                                f10 = 0.0f;
                            }
                            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(wallpaperCheckBoxView2, (Property<WallpaperCheckBoxView, Float>) property4, f10);
                            WallpaperCheckBoxView wallpaperCheckBoxView3 = this.backgroundCheckBoxView[c2];
                            if (z3) {
                                fDp4 = AndroidUtilities.dp(34.0f);
                            } else {
                                fDp4 = 0.0f;
                            }
                            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(wallpaperCheckBoxView3, (Property<WallpaperCheckBoxView, Float>) property4, fDp4);
                            Animator[] animatorArr = new Animator[6];
                            animatorArr[0] = objectAnimatorOfFloat;
                            animatorArr[1] = objectAnimatorOfFloat2;
                            animatorArr[c2] = objectAnimatorOfFloat3;
                            animatorArr[c] = objectAnimatorOfFloat4;
                            animatorArr[4] = objectAnimatorOfFloat5;
                            animatorArr[5] = objectAnimatorOfFloat6;
                            animatorSet3.playTogether(animatorArr);
                            this.backgroundPlayViewAnimator.setDuration(180L);
                            this.backgroundPlayViewAnimator.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    if (ThemePreviewActivity.this.backgroundPlayAnimationView.getTag() == null) {
                                        ThemePreviewActivity.this.backgroundPlayAnimationView.setVisibility(4);
                                    }
                                    ThemePreviewActivity.this.backgroundPlayViewAnimator = null;
                                }
                            });
                            this.backgroundPlayViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                            this.backgroundPlayViewAnimator.start();
                        } else {
                            f = 34.0f;
                            f2 = 1.0f;
                            FrameLayout frameLayout5 = this.backgroundPlayAnimationView;
                            if (z3) {
                                f3 = 1.0f;
                            } else {
                                f3 = 0.0f;
                            }
                            frameLayout5.setAlpha(f3);
                            FrameLayout frameLayout6 = this.backgroundPlayAnimationView;
                            if (z3) {
                                f4 = 1.0f;
                            } else {
                                f4 = 0.0f;
                            }
                            frameLayout6.setScaleX(f4);
                            FrameLayout frameLayout7 = this.backgroundPlayAnimationView;
                            if (z3) {
                                f5 = 1.0f;
                            } else {
                                f5 = 0.0f;
                            }
                            frameLayout7.setScaleY(f5);
                            WallpaperCheckBoxView wallpaperCheckBoxView4 = this.backgroundCheckBoxView[0];
                            if (z3) {
                                fDp = AndroidUtilities.dp(34.0f);
                            } else {
                                fDp = 0.0f;
                            }
                            wallpaperCheckBoxView4.setTranslationX(fDp);
                            WallpaperCheckBoxView wallpaperCheckBoxView5 = this.backgroundCheckBoxView[1];
                            if (z3) {
                                f6 = -AndroidUtilities.dp(34.0f);
                            } else {
                                f6 = 0.0f;
                            }
                            wallpaperCheckBoxView5.setTranslationX(f6);
                            WallpaperCheckBoxView wallpaperCheckBoxView6 = this.backgroundCheckBoxView[c2];
                            if (z3) {
                                fDp2 = AndroidUtilities.dp(34.0f);
                            } else {
                                fDp2 = 0.0f;
                            }
                            wallpaperCheckBoxView6.setTranslationX(fDp2);
                        }
                    }
                }
                c = 3;
                c2 = 2;
                i = defaultAccentColor;
                z3 = false;
                if (this.backgroundPlayAnimationView.getTag() != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.backgroundPlayAnimationView.setTag(z3 ? 1 : null);
                if (z4 != z3) {
                    if (z3) {
                        this.backgroundPlayAnimationView.setVisibility(0);
                    }
                    animatorSet2 = this.backgroundPlayViewAnimator;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    if (z) {
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.backgroundPlayViewAnimator = animatorSet4;
                        FrameLayout frameLayout8 = this.backgroundPlayAnimationView;
                        Property property5 = View.ALPHA;
                        if (z3) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(frameLayout8, (Property<FrameLayout, Float>) property5, f7);
                        FrameLayout frameLayout9 = this.backgroundPlayAnimationView;
                        Property property6 = View.SCALE_X;
                        if (z3) {
                            f8 = 1.0f;
                        } else {
                            f8 = 0.0f;
                        }
                        f = 34.0f;
                        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(frameLayout9, (Property<FrameLayout, Float>) property6, f8);
                        FrameLayout frameLayout10 = this.backgroundPlayAnimationView;
                        Property property7 = View.SCALE_Y;
                        if (z3) {
                            f9 = 1.0f;
                        } else {
                            f9 = 0.0f;
                        }
                        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(frameLayout10, (Property<FrameLayout, Float>) property7, f9);
                        WallpaperCheckBoxView wallpaperCheckBoxView7 = this.backgroundCheckBoxView[0];
                        Property property8 = View.TRANSLATION_X;
                        if (z3) {
                            fDp3 = AndroidUtilities.dp(34.0f);
                        } else {
                            fDp3 = 0.0f;
                        }
                        f2 = 1.0f;
                        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(wallpaperCheckBoxView7, (Property<WallpaperCheckBoxView, Float>) property8, fDp3);
                        WallpaperCheckBoxView wallpaperCheckBoxView8 = this.backgroundCheckBoxView[1];
                        if (z3) {
                            f10 = -AndroidUtilities.dp(34.0f);
                        } else {
                            f10 = 0.0f;
                        }
                        ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(wallpaperCheckBoxView8, (Property<WallpaperCheckBoxView, Float>) property8, f10);
                        WallpaperCheckBoxView wallpaperCheckBoxView9 = this.backgroundCheckBoxView[c2];
                        if (z3) {
                            fDp4 = AndroidUtilities.dp(34.0f);
                        } else {
                            fDp4 = 0.0f;
                        }
                        ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(wallpaperCheckBoxView9, (Property<WallpaperCheckBoxView, Float>) property8, fDp4);
                        Animator[] animatorArr2 = new Animator[6];
                        animatorArr2[0] = objectAnimatorOfFloat7;
                        animatorArr2[1] = objectAnimatorOfFloat8;
                        animatorArr2[c2] = objectAnimatorOfFloat9;
                        animatorArr2[c] = objectAnimatorOfFloat10;
                        animatorArr2[4] = objectAnimatorOfFloat11;
                        animatorArr2[5] = objectAnimatorOfFloat12;
                        animatorSet4.playTogether(animatorArr2);
                        this.backgroundPlayViewAnimator.setDuration(180L);
                        this.backgroundPlayViewAnimator.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (ThemePreviewActivity.this.backgroundPlayAnimationView.getTag() == null) {
                                    ThemePreviewActivity.this.backgroundPlayAnimationView.setVisibility(4);
                                }
                                ThemePreviewActivity.this.backgroundPlayViewAnimator = null;
                            }
                        });
                        this.backgroundPlayViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                        this.backgroundPlayViewAnimator.start();
                    } else {
                        f = 34.0f;
                        f2 = 1.0f;
                        FrameLayout frameLayout11 = this.backgroundPlayAnimationView;
                        if (z3) {
                            f3 = 1.0f;
                        } else {
                            f3 = 0.0f;
                        }
                        frameLayout11.setAlpha(f3);
                        FrameLayout frameLayout12 = this.backgroundPlayAnimationView;
                        if (z3) {
                            f4 = 1.0f;
                        } else {
                            f4 = 0.0f;
                        }
                        frameLayout12.setScaleX(f4);
                        FrameLayout frameLayout13 = this.backgroundPlayAnimationView;
                        if (z3) {
                            f5 = 1.0f;
                        } else {
                            f5 = 0.0f;
                        }
                        frameLayout13.setScaleY(f5);
                        WallpaperCheckBoxView wallpaperCheckBoxView10 = this.backgroundCheckBoxView[0];
                        if (z3) {
                            fDp = AndroidUtilities.dp(34.0f);
                        } else {
                            fDp = 0.0f;
                        }
                        wallpaperCheckBoxView10.setTranslationX(fDp);
                        WallpaperCheckBoxView wallpaperCheckBoxView11 = this.backgroundCheckBoxView[1];
                        if (z3) {
                            f6 = -AndroidUtilities.dp(34.0f);
                        } else {
                            f6 = 0.0f;
                        }
                        wallpaperCheckBoxView11.setTranslationX(f6);
                        WallpaperCheckBoxView wallpaperCheckBoxView12 = this.backgroundCheckBoxView[c2];
                        if (z3) {
                            fDp2 = AndroidUtilities.dp(34.0f);
                        } else {
                            fDp2 = 0.0f;
                        }
                        wallpaperCheckBoxView12.setTranslationX(fDp2);
                    }
                }
            } else {
                if (i4 == 1) {
                    defaultAccentColor = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to1);
                    c = 3;
                    c2 = 2;
                    long j2 = this.accent.backgroundGradientOverrideColor1;
                    int i5 = (int) j2;
                    if (i5 == 0 && j2 != 0) {
                        i = 0;
                    } else if (i5 != 0) {
                        i = i5;
                    }
                    if (i != 0) {
                        i = defaultAccentColor;
                        z3 = true;
                    }
                    if (this.backgroundPlayAnimationView.getTag() != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.backgroundPlayAnimationView.setTag(z3 ? 1 : null);
                    if (z4 != z3) {
                        if (z3) {
                            this.backgroundPlayAnimationView.setVisibility(0);
                        }
                        animatorSet2 = this.backgroundPlayViewAnimator;
                        if (animatorSet2 != null) {
                            animatorSet2.cancel();
                        }
                        if (z) {
                            AnimatorSet animatorSet5 = new AnimatorSet();
                            this.backgroundPlayViewAnimator = animatorSet5;
                            FrameLayout frameLayout14 = this.backgroundPlayAnimationView;
                            Property property9 = View.ALPHA;
                            if (z3) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            ObjectAnimator objectAnimatorOfFloat13 = ObjectAnimator.ofFloat(frameLayout14, (Property<FrameLayout, Float>) property9, f7);
                            FrameLayout frameLayout15 = this.backgroundPlayAnimationView;
                            Property property10 = View.SCALE_X;
                            if (z3) {
                                f8 = 1.0f;
                            } else {
                                f8 = 0.0f;
                            }
                            f = 34.0f;
                            ObjectAnimator objectAnimatorOfFloat14 = ObjectAnimator.ofFloat(frameLayout15, (Property<FrameLayout, Float>) property10, f8);
                            FrameLayout frameLayout16 = this.backgroundPlayAnimationView;
                            Property property11 = View.SCALE_Y;
                            if (z3) {
                                f9 = 1.0f;
                            } else {
                                f9 = 0.0f;
                            }
                            ObjectAnimator objectAnimatorOfFloat15 = ObjectAnimator.ofFloat(frameLayout16, (Property<FrameLayout, Float>) property11, f9);
                            WallpaperCheckBoxView wallpaperCheckBoxView13 = this.backgroundCheckBoxView[0];
                            Property property12 = View.TRANSLATION_X;
                            if (z3) {
                                fDp3 = AndroidUtilities.dp(34.0f);
                            } else {
                                fDp3 = 0.0f;
                            }
                            f2 = 1.0f;
                            ObjectAnimator objectAnimatorOfFloat16 = ObjectAnimator.ofFloat(wallpaperCheckBoxView13, (Property<WallpaperCheckBoxView, Float>) property12, fDp3);
                            WallpaperCheckBoxView wallpaperCheckBoxView14 = this.backgroundCheckBoxView[1];
                            if (z3) {
                                f10 = -AndroidUtilities.dp(34.0f);
                            } else {
                                f10 = 0.0f;
                            }
                            ObjectAnimator objectAnimatorOfFloat17 = ObjectAnimator.ofFloat(wallpaperCheckBoxView14, (Property<WallpaperCheckBoxView, Float>) property12, f10);
                            WallpaperCheckBoxView wallpaperCheckBoxView15 = this.backgroundCheckBoxView[c2];
                            if (z3) {
                                fDp4 = AndroidUtilities.dp(34.0f);
                            } else {
                                fDp4 = 0.0f;
                            }
                            ObjectAnimator objectAnimatorOfFloat18 = ObjectAnimator.ofFloat(wallpaperCheckBoxView15, (Property<WallpaperCheckBoxView, Float>) property12, fDp4);
                            Animator[] animatorArr3 = new Animator[6];
                            animatorArr3[0] = objectAnimatorOfFloat13;
                            animatorArr3[1] = objectAnimatorOfFloat14;
                            animatorArr3[c2] = objectAnimatorOfFloat15;
                            animatorArr3[c] = objectAnimatorOfFloat16;
                            animatorArr3[4] = objectAnimatorOfFloat17;
                            animatorArr3[5] = objectAnimatorOfFloat18;
                            animatorSet5.playTogether(animatorArr3);
                            this.backgroundPlayViewAnimator.setDuration(180L);
                            this.backgroundPlayViewAnimator.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    if (ThemePreviewActivity.this.backgroundPlayAnimationView.getTag() == null) {
                                        ThemePreviewActivity.this.backgroundPlayAnimationView.setVisibility(4);
                                    }
                                    ThemePreviewActivity.this.backgroundPlayViewAnimator = null;
                                }
                            });
                            this.backgroundPlayViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                            this.backgroundPlayViewAnimator.start();
                        } else {
                            f = 34.0f;
                            f2 = 1.0f;
                            FrameLayout frameLayout17 = this.backgroundPlayAnimationView;
                            if (z3) {
                                f3 = 1.0f;
                            } else {
                                f3 = 0.0f;
                            }
                            frameLayout17.setAlpha(f3);
                            FrameLayout frameLayout18 = this.backgroundPlayAnimationView;
                            if (z3) {
                                f4 = 1.0f;
                            } else {
                                f4 = 0.0f;
                            }
                            frameLayout18.setScaleX(f4);
                            FrameLayout frameLayout19 = this.backgroundPlayAnimationView;
                            if (z3) {
                                f5 = 1.0f;
                            } else {
                                f5 = 0.0f;
                            }
                            frameLayout19.setScaleY(f5);
                            WallpaperCheckBoxView wallpaperCheckBoxView16 = this.backgroundCheckBoxView[0];
                            if (z3) {
                                fDp = AndroidUtilities.dp(34.0f);
                            } else {
                                fDp = 0.0f;
                            }
                            wallpaperCheckBoxView16.setTranslationX(fDp);
                            WallpaperCheckBoxView wallpaperCheckBoxView17 = this.backgroundCheckBoxView[1];
                            if (z3) {
                                f6 = -AndroidUtilities.dp(34.0f);
                            } else {
                                f6 = 0.0f;
                            }
                            wallpaperCheckBoxView17.setTranslationX(f6);
                            WallpaperCheckBoxView wallpaperCheckBoxView18 = this.backgroundCheckBoxView[c2];
                            if (z3) {
                                fDp2 = AndroidUtilities.dp(34.0f);
                            } else {
                                fDp2 = 0.0f;
                            }
                            wallpaperCheckBoxView18.setTranslationX(fDp2);
                        }
                    }
                } else {
                    c = 3;
                    c2 = 2;
                }
                i = defaultAccentColor;
                z3 = false;
                if (this.backgroundPlayAnimationView.getTag() != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.backgroundPlayAnimationView.setTag(z3 ? 1 : null);
                if (z4 != z3) {
                    if (z3) {
                        this.backgroundPlayAnimationView.setVisibility(0);
                    }
                    animatorSet2 = this.backgroundPlayViewAnimator;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    if (z) {
                        AnimatorSet animatorSet6 = new AnimatorSet();
                        this.backgroundPlayViewAnimator = animatorSet6;
                        FrameLayout frameLayout110 = this.backgroundPlayAnimationView;
                        Property property13 = View.ALPHA;
                        if (z3) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        ObjectAnimator objectAnimatorOfFloat19 = ObjectAnimator.ofFloat(frameLayout110, (Property<FrameLayout, Float>) property13, f7);
                        FrameLayout frameLayout111 = this.backgroundPlayAnimationView;
                        Property property14 = View.SCALE_X;
                        if (z3) {
                            f8 = 1.0f;
                        } else {
                            f8 = 0.0f;
                        }
                        f = 34.0f;
                        ObjectAnimator objectAnimatorOfFloat110 = ObjectAnimator.ofFloat(frameLayout111, (Property<FrameLayout, Float>) property14, f8);
                        FrameLayout frameLayout112 = this.backgroundPlayAnimationView;
                        Property property15 = View.SCALE_Y;
                        if (z3) {
                            f9 = 1.0f;
                        } else {
                            f9 = 0.0f;
                        }
                        ObjectAnimator objectAnimatorOfFloat111 = ObjectAnimator.ofFloat(frameLayout112, (Property<FrameLayout, Float>) property15, f9);
                        WallpaperCheckBoxView wallpaperCheckBoxView19 = this.backgroundCheckBoxView[0];
                        Property property16 = View.TRANSLATION_X;
                        if (z3) {
                            fDp3 = AndroidUtilities.dp(34.0f);
                        } else {
                            fDp3 = 0.0f;
                        }
                        f2 = 1.0f;
                        ObjectAnimator objectAnimatorOfFloat112 = ObjectAnimator.ofFloat(wallpaperCheckBoxView19, (Property<WallpaperCheckBoxView, Float>) property16, fDp3);
                        WallpaperCheckBoxView wallpaperCheckBoxView110 = this.backgroundCheckBoxView[1];
                        if (z3) {
                            f10 = -AndroidUtilities.dp(34.0f);
                        } else {
                            f10 = 0.0f;
                        }
                        ObjectAnimator objectAnimatorOfFloat113 = ObjectAnimator.ofFloat(wallpaperCheckBoxView110, (Property<WallpaperCheckBoxView, Float>) property16, f10);
                        WallpaperCheckBoxView wallpaperCheckBoxView111 = this.backgroundCheckBoxView[c2];
                        if (z3) {
                            fDp4 = AndroidUtilities.dp(34.0f);
                        } else {
                            fDp4 = 0.0f;
                        }
                        ObjectAnimator objectAnimatorOfFloat114 = ObjectAnimator.ofFloat(wallpaperCheckBoxView111, (Property<WallpaperCheckBoxView, Float>) property16, fDp4);
                        Animator[] animatorArr4 = new Animator[6];
                        animatorArr4[0] = objectAnimatorOfFloat19;
                        animatorArr4[1] = objectAnimatorOfFloat110;
                        animatorArr4[c2] = objectAnimatorOfFloat111;
                        animatorArr4[c] = objectAnimatorOfFloat112;
                        animatorArr4[4] = objectAnimatorOfFloat113;
                        animatorArr4[5] = objectAnimatorOfFloat114;
                        animatorSet6.playTogether(animatorArr4);
                        this.backgroundPlayViewAnimator.setDuration(180L);
                        this.backgroundPlayViewAnimator.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (ThemePreviewActivity.this.backgroundPlayAnimationView.getTag() == null) {
                                    ThemePreviewActivity.this.backgroundPlayAnimationView.setVisibility(4);
                                }
                                ThemePreviewActivity.this.backgroundPlayViewAnimator = null;
                            }
                        });
                        this.backgroundPlayViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                        this.backgroundPlayViewAnimator.start();
                    } else {
                        f = 34.0f;
                        f2 = 1.0f;
                        FrameLayout frameLayout113 = this.backgroundPlayAnimationView;
                        if (z3) {
                            f3 = 1.0f;
                        } else {
                            f3 = 0.0f;
                        }
                        frameLayout113.setAlpha(f3);
                        FrameLayout frameLayout114 = this.backgroundPlayAnimationView;
                        if (z3) {
                            f4 = 1.0f;
                        } else {
                            f4 = 0.0f;
                        }
                        frameLayout114.setScaleX(f4);
                        FrameLayout frameLayout115 = this.backgroundPlayAnimationView;
                        if (z3) {
                            f5 = 1.0f;
                        } else {
                            f5 = 0.0f;
                        }
                        frameLayout115.setScaleY(f5);
                        WallpaperCheckBoxView wallpaperCheckBoxView112 = this.backgroundCheckBoxView[0];
                        if (z3) {
                            fDp = AndroidUtilities.dp(34.0f);
                        } else {
                            fDp = 0.0f;
                        }
                        wallpaperCheckBoxView112.setTranslationX(fDp);
                        WallpaperCheckBoxView wallpaperCheckBoxView113 = this.backgroundCheckBoxView[1];
                        if (z3) {
                            f6 = -AndroidUtilities.dp(34.0f);
                        } else {
                            f6 = 0.0f;
                        }
                        wallpaperCheckBoxView113.setTranslationX(f6);
                        WallpaperCheckBoxView wallpaperCheckBoxView114 = this.backgroundCheckBoxView[c2];
                        if (z3) {
                            fDp2 = AndroidUtilities.dp(34.0f);
                        } else {
                            fDp2 = 0.0f;
                        }
                        wallpaperCheckBoxView114.setTranslationX(fDp2);
                    }
                }
            }
            frameLayout = this.messagesPlayAnimationView;
            if (frameLayout != null) {
                if (frameLayout.getTag() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.messagesPlayAnimationView.setTag(1);
                if (!z2) {
                    this.messagesPlayAnimationView.setVisibility(0);
                    animatorSet = this.messagesPlayViewAnimator;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (z) {
                        AnimatorSet animatorSet7 = new AnimatorSet();
                        this.messagesPlayViewAnimator = animatorSet7;
                        ObjectAnimator objectAnimatorOfFloat20 = ObjectAnimator.ofFloat(this.messagesPlayAnimationView, (Property<FrameLayout, Float>) View.ALPHA, f2);
                        ObjectAnimator objectAnimatorOfFloat21 = ObjectAnimator.ofFloat(this.messagesPlayAnimationView, (Property<FrameLayout, Float>) View.SCALE_X, f2);
                        ObjectAnimator objectAnimatorOfFloat22 = ObjectAnimator.ofFloat(this.messagesPlayAnimationView, (Property<FrameLayout, Float>) View.SCALE_Y, f2);
                        WallpaperCheckBoxView wallpaperCheckBoxView20 = this.messagesCheckBoxView[0];
                        Property property17 = View.TRANSLATION_X;
                        ObjectAnimator objectAnimatorOfFloat23 = ObjectAnimator.ofFloat(wallpaperCheckBoxView20, (Property<WallpaperCheckBoxView, Float>) property17, -AndroidUtilities.dp(f));
                        ObjectAnimator objectAnimatorOfFloat24 = ObjectAnimator.ofFloat(this.messagesCheckBoxView[1], (Property<WallpaperCheckBoxView, Float>) property17, AndroidUtilities.dp(f));
                        Animator[] animatorArr5 = new Animator[5];
                        animatorArr5[0] = objectAnimatorOfFloat20;
                        animatorArr5[1] = objectAnimatorOfFloat21;
                        animatorArr5[c2] = objectAnimatorOfFloat22;
                        animatorArr5[c] = objectAnimatorOfFloat23;
                        animatorArr5[4] = objectAnimatorOfFloat24;
                        animatorSet7.playTogether(animatorArr5);
                        this.messagesPlayViewAnimator.setDuration(180L);
                        this.messagesPlayViewAnimator.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (ThemePreviewActivity.this.messagesPlayAnimationView.getTag() == null) {
                                    ThemePreviewActivity.this.messagesPlayAnimationView.setVisibility(4);
                                }
                                ThemePreviewActivity.this.messagesPlayViewAnimator = null;
                            }
                        });
                        this.messagesPlayViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                        this.messagesPlayViewAnimator.start();
                        return;
                    }
                    this.messagesPlayAnimationView.setAlpha(1.0f);
                    this.messagesPlayAnimationView.setScaleX(1.0f);
                    this.messagesPlayAnimationView.setScaleY(1.0f);
                    this.messagesCheckBoxView[0].setTranslationX(-AndroidUtilities.dp(f));
                    this.messagesCheckBoxView[1].setTranslationX(AndroidUtilities.dp(f));
                }
            }
        }
        c = 3;
        c2 = 2;
        f = 34.0f;
        f2 = 1.0f;
        frameLayout = this.messagesPlayAnimationView;
        if (frameLayout != null) {
            if (frameLayout.getTag() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.messagesPlayAnimationView.setTag(1);
            if (!z2) {
                this.messagesPlayAnimationView.setVisibility(0);
                animatorSet = this.messagesPlayViewAnimator;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                if (z) {
                    AnimatorSet animatorSet8 = new AnimatorSet();
                    this.messagesPlayViewAnimator = animatorSet8;
                    ObjectAnimator objectAnimatorOfFloat25 = ObjectAnimator.ofFloat(this.messagesPlayAnimationView, (Property<FrameLayout, Float>) View.ALPHA, f2);
                    ObjectAnimator objectAnimatorOfFloat26 = ObjectAnimator.ofFloat(this.messagesPlayAnimationView, (Property<FrameLayout, Float>) View.SCALE_X, f2);
                    ObjectAnimator objectAnimatorOfFloat27 = ObjectAnimator.ofFloat(this.messagesPlayAnimationView, (Property<FrameLayout, Float>) View.SCALE_Y, f2);
                    WallpaperCheckBoxView wallpaperCheckBoxView21 = this.messagesCheckBoxView[0];
                    Property property18 = View.TRANSLATION_X;
                    ObjectAnimator objectAnimatorOfFloat28 = ObjectAnimator.ofFloat(wallpaperCheckBoxView21, (Property<WallpaperCheckBoxView, Float>) property18, -AndroidUtilities.dp(f));
                    ObjectAnimator objectAnimatorOfFloat29 = ObjectAnimator.ofFloat(this.messagesCheckBoxView[1], (Property<WallpaperCheckBoxView, Float>) property18, AndroidUtilities.dp(f));
                    Animator[] animatorArr6 = new Animator[5];
                    animatorArr6[0] = objectAnimatorOfFloat25;
                    animatorArr6[1] = objectAnimatorOfFloat26;
                    animatorArr6[c2] = objectAnimatorOfFloat27;
                    animatorArr6[c] = objectAnimatorOfFloat28;
                    animatorArr6[4] = objectAnimatorOfFloat29;
                    animatorSet8.playTogether(animatorArr6);
                    this.messagesPlayViewAnimator.setDuration(180L);
                    this.messagesPlayViewAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (ThemePreviewActivity.this.messagesPlayAnimationView.getTag() == null) {
                                ThemePreviewActivity.this.messagesPlayAnimationView.setVisibility(4);
                            }
                            ThemePreviewActivity.this.messagesPlayViewAnimator = null;
                        }
                    });
                    this.messagesPlayViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    this.messagesPlayViewAnimator.start();
                    return;
                }
                this.messagesPlayAnimationView.setAlpha(1.0f);
                this.messagesPlayAnimationView.setScaleX(1.0f);
                this.messagesPlayAnimationView.setScaleY(1.0f);
                this.messagesCheckBoxView[0].setTranslationX(-AndroidUtilities.dp(f));
                this.messagesCheckBoxView[1].setTranslationX(AndroidUtilities.dp(f));
            }
        }
    }

    public void setBackgroundColor(int i, int i2, boolean z, boolean z2) {
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
        updatePlayAnimationView(z2);
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
            if (this.intensitySeekBar != null && Theme.getActiveTheme().isDark()) {
                this.intensitySeekBar.setTwoSided(true);
            }
            Drawable background = this.backgroundImage.getBackground();
            if (background instanceof MotionBackgroundDrawable) {
                motionBackgroundDrawable = (MotionBackgroundDrawable) background;
            } else {
                motionBackgroundDrawable = new MotionBackgroundDrawable();
                motionBackgroundDrawable.setParentView(this.backgroundImage);
                if (this.rotatePreview) {
                    motionBackgroundDrawable.rotatePreview(false);
                }
            }
            motionBackgroundDrawable.setColors(this.backgroundColor, this.backgroundGradientColor1, this.backgroundGradientColor2, this.backgroundGradientColor3);
            this.backgroundImage.setBackground(motionBackgroundDrawable);
            this.patternColor = motionBackgroundDrawable.getPatternColor();
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
        if (!Theme.hasThemeKey(i4) || (this.backgroundImage.getBackground() instanceof MotionBackgroundDrawable)) {
            ThemeDelegate themeDelegate = this.themeDelegate;
            int i5 = this.checkColor;
            themeDelegate.applyChatServiceMessageColor(new int[]{i5, i5, i5, i5}, this.backgroundImage.getBackground(), this.backgroundImage.getBackground(), Float.valueOf(this.currentIntensity));
        } else if (Theme.getCachedWallpaperNonBlocking() instanceof MotionBackgroundDrawable) {
            int themedColor = getThemedColor(i4);
            this.themeDelegate.applyChatServiceMessageColor(new int[]{themedColor, themedColor, themedColor, themedColor}, this.backgroundImage.getBackground(), this.backgroundImage.getBackground(), Float.valueOf(this.currentIntensity));
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
            if (Theme.getActiveTheme().isDark() && (this.backgroundImage.getBackground() instanceof MotionBackgroundDrawable)) {
                SeekBarView seekBarView = this.intensitySeekBar;
                if (seekBarView != null) {
                    seekBarView.setTwoSided(true);
                }
                if (this.currentIntensity < 0.0f) {
                    this.backgroundImage.getImageReceiver().setGradientBitmap(((MotionBackgroundDrawable) this.backgroundImage.getBackground()).getBitmap());
                }
            } else {
                this.backgroundImage.getImageReceiver().setGradientBitmap(null);
                SeekBarView seekBarView2 = this.intensitySeekBar;
                if (seekBarView2 != null) {
                    seekBarView2.setTwoSided(false);
                }
            }
            SeekBarView seekBarView3 = this.intensitySeekBar;
            if (seekBarView3 != null) {
                seekBarView3.setProgress(this.currentIntensity);
            }
        }
        RecyclerListView recyclerListView = this.listView2;
        if (recyclerListView != null) {
            recyclerListView.invalidateViews();
        }
        FrameLayout frameLayout = this.backgroundButtonsContainer;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                this.backgroundButtonsContainer.getChildAt(i6).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.messagesButtonsContainer;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i7 = 0; i7 < childCount2; i7++) {
                this.messagesButtonsContainer.getChildAt(i7).invalidate();
            }
        }
    }

    public void setCurrentImage(boolean z) {
        Drawable colorDrawable;
        MotionBackgroundDrawable motionBackgroundDrawable;
        MotionBackgroundDrawable motionBackgroundDrawable2;
        int i = this.screenType;
        if (i == 0 && this.accent == null) {
            this.backgroundImage.setBackground(Theme.getCachedWallpaper());
        } else {
            if (i == 2) {
                Object obj = this.currentWallpaper;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = z ? FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, 100) : null;
                    this.backgroundImage.setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.imageFilter, ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", closestPhotoSizeWithSize instanceof TLRPC.TL_photoStrippedSize ? new BitmapDrawable(ImageLoader.getStrippedPhotoBitmap(closestPhotoSizeWithSize.bytes, "b")) : null, "jpg", tL_wallPaper.document.size, 1, tL_wallPaper);
                } else if (obj instanceof WallpapersListActivity.ColorWallpaper) {
                    WallpapersListActivity.ColorWallpaper colorWallpaper = (WallpapersListActivity.ColorWallpaper) obj;
                    this.backgroundRotation = colorWallpaper.gradientRotation;
                    setBackgroundColor(colorWallpaper.color, 0, true, false);
                    int i2 = colorWallpaper.gradientColor1;
                    if (i2 != 0) {
                        setBackgroundColor(i2, 1, true, false);
                    }
                    setBackgroundColor(colorWallpaper.gradientColor2, 2, true, false);
                    setBackgroundColor(colorWallpaper.gradientColor3, 3, true, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.selectedPattern;
                    if (tL_wallPaper2 != null) {
                        BackgroundView backgroundView = this.backgroundImage;
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                        String str = this.imageFilter;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.selectedPattern;
                        backgroundView.setImage(forDocument, str, (ImageLocation) null, (String) null, "jpg", tL_wallPaper3.document.size, 1, tL_wallPaper3);
                    } else if ("d".equals(colorWallpaper.slug)) {
                        Point point = AndroidUtilities.displaySize;
                        int iMin = Math.min(point.x, point.y);
                        Point point2 = AndroidUtilities.displaySize;
                        this.backgroundImage.setImageBitmap(SvgHelper.getBitmap(R.raw.default_pattern, iMin, Math.max(point2.x, point2.y), Build.VERSION.SDK_INT >= 29 ? 1459617792 : MotionBackgroundDrawable.getPatternColor(colorWallpaper.color, colorWallpaper.gradientColor1, colorWallpaper.gradientColor2, colorWallpaper.gradientColor3)));
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
                                BackgroundView backgroundView2 = this.backgroundImage;
                                backgroundView2.setImageDrawable(Theme.getThemedWallpaper(false, backgroundView2));
                            } else {
                                int i3 = fileWallpaper.resId;
                                if (i3 != 0) {
                                    this.backgroundImage.setImageResource(i3);
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
                        this.backgroundImage.setImage(ImageLocation.getForPhoto(photoSize, searchImage.photo), this.imageFilter, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, searchImage.photo), "100_100_b", "jpg", photoSize != null ? photoSize.size : 0, 1, searchImage);
                    } else {
                        this.backgroundImage.setImage(searchImage.imageUrl, this.imageFilter, searchImage.thumbUrl, "100_100_b");
                    }
                }
            } else if (this.accent == null) {
                this.backgroundImage.setBackground(Theme.getCachedWallpaper());
            } else {
                BackgroundGradientDrawable.Disposable disposable = this.backgroundGradientDisposable;
                if (disposable != null) {
                    disposable.dispose();
                    this.backgroundGradientDisposable = null;
                }
                int defaultAccentColor = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper);
                int i4 = (int) this.accent.backgroundOverrideColor;
                if (i4 != 0) {
                    defaultAccentColor = i4;
                }
                int defaultAccentColor2 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to1);
                long j = this.accent.backgroundGradientOverrideColor1;
                int i5 = (int) j;
                if (i5 == 0 && j != 0) {
                    defaultAccentColor2 = 0;
                } else if (i5 != 0) {
                    defaultAccentColor2 = i5;
                }
                int defaultAccentColor3 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to2);
                long j2 = this.accent.backgroundGradientOverrideColor2;
                int i6 = (int) j2;
                if (i6 == 0 && j2 != 0) {
                    defaultAccentColor3 = 0;
                } else if (i6 != 0) {
                    defaultAccentColor3 = i6;
                }
                int defaultAccentColor4 = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to3);
                Theme.ThemeAccent themeAccent = this.accent;
                long j3 = themeAccent.backgroundGradientOverrideColor3;
                int i7 = (int) j3;
                if (i7 == 0 && j3 != 0) {
                    defaultAccentColor4 = 0;
                } else if (i7 != 0) {
                    defaultAccentColor4 = i7;
                }
                if (!TextUtils.isEmpty(themeAccent.patternSlug) && !Theme.hasCustomWallpaper()) {
                    if (defaultAccentColor3 != 0) {
                        Drawable background = this.backgroundImage.getBackground();
                        if (background instanceof MotionBackgroundDrawable) {
                            motionBackgroundDrawable2 = (MotionBackgroundDrawable) background;
                        } else {
                            motionBackgroundDrawable = new MotionBackgroundDrawable();
                            motionBackgroundDrawable.setParentView(this.backgroundImage);
                            if (this.rotatePreview) {
                                motionBackgroundDrawable2 = motionBackgroundDrawable;
                                motionBackgroundDrawable.rotatePreview(false);
                                motionBackgroundDrawable2 = motionBackgroundDrawable;
                            }
                        }
                        motionBackgroundDrawable2 = motionBackgroundDrawable;
                        motionBackgroundDrawable2.setColors(defaultAccentColor, defaultAccentColor2, defaultAccentColor3, defaultAccentColor4);
                        colorDrawable = motionBackgroundDrawable2;
                    } else if (defaultAccentColor2 != 0) {
                        BackgroundGradientDrawable backgroundGradientDrawable = new BackgroundGradientDrawable(BackgroundGradientDrawable.getGradientOrientation(this.accent.backgroundRotation), new int[]{defaultAccentColor, defaultAccentColor2});
                        this.backgroundGradientDisposable = backgroundGradientDrawable.startDithering(BackgroundGradientDrawable.Sizes.ofDeviceScreen(), new BackgroundGradientDrawable.ListenerAdapter() {
                            @Override
                            public void onSizeReady(int i8, int i9) {
                                Point point3 = AndroidUtilities.displaySize;
                                if ((point3.x <= point3.y) == (i8 <= i9)) {
                                    ThemePreviewActivity.this.backgroundImage.invalidate();
                                }
                            }
                        }, 100L);
                        colorDrawable = backgroundGradientDrawable;
                    } else {
                        colorDrawable = new ColorDrawable(defaultAccentColor);
                    }
                    this.backgroundImage.setBackground(colorDrawable);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.selectedPattern;
                    if (tL_wallPaper4 != null) {
                        BackgroundView backgroundView3 = this.backgroundImage;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(tL_wallPaper4.document);
                        String str2 = this.imageFilter;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.selectedPattern;
                        backgroundView3.setImage(forDocument2, str2, (ImageLocation) null, (String) null, "jpg", tL_wallPaper5.document.size, 1, tL_wallPaper5);
                    }
                } else {
                    Drawable cachedWallpaperNonBlocking = Theme.getCachedWallpaperNonBlocking();
                    if (cachedWallpaperNonBlocking != null) {
                        if (cachedWallpaperNonBlocking instanceof MotionBackgroundDrawable) {
                            ((MotionBackgroundDrawable) cachedWallpaperNonBlocking).setParentView(this.backgroundImage);
                        }
                        this.backgroundImage.setBackground(cachedWallpaperNonBlocking);
                    }
                }
                if (defaultAccentColor2 == 0) {
                    int patternColor = AndroidUtilities.getPatternColor(defaultAccentColor);
                    this.checkColor = patternColor;
                    this.patternColor = patternColor;
                } else if (defaultAccentColor3 != 0) {
                    this.patternColor = MotionBackgroundDrawable.getPatternColor(defaultAccentColor, defaultAccentColor2, defaultAccentColor3, defaultAccentColor4);
                    this.checkColor = 754974720;
                } else {
                    int patternColor2 = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(defaultAccentColor, defaultAccentColor2));
                    this.checkColor = patternColor2;
                    this.patternColor = patternColor2;
                }
                BackgroundView backgroundView4 = this.backgroundImage;
                if (backgroundView4 != null) {
                    backgroundView4.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.patternColor, this.blendMode));
                    this.backgroundImage.getImageReceiver().setAlpha(Math.abs(this.currentIntensity));
                    this.backgroundImage.invalidate();
                    if (Theme.getActiveTheme().isDark() && (this.backgroundImage.getBackground() instanceof MotionBackgroundDrawable)) {
                        SeekBarView seekBarView = this.intensitySeekBar;
                        if (seekBarView != null) {
                            seekBarView.setTwoSided(true);
                        }
                        if (this.currentIntensity < 0.0f) {
                            this.backgroundImage.getImageReceiver().setGradientBitmap(((MotionBackgroundDrawable) this.backgroundImage.getBackground()).getBitmap());
                        }
                    } else {
                        this.backgroundImage.getImageReceiver().setGradientBitmap(null);
                        SeekBarView seekBarView2 = this.intensitySeekBar;
                        if (seekBarView2 != null) {
                            seekBarView2.setTwoSided(false);
                        }
                    }
                    SeekBarView seekBarView3 = this.intensitySeekBar;
                    if (seekBarView3 != null) {
                        seekBarView3.setProgress(this.currentIntensity);
                    }
                }
                if (this.backgroundCheckBoxView != null) {
                    int i8 = 0;
                    while (true) {
                        WallpaperCheckBoxView[] wallpaperCheckBoxViewArr = this.backgroundCheckBoxView;
                        if (i8 >= wallpaperCheckBoxViewArr.length) {
                            break;
                        }
                        wallpaperCheckBoxViewArr[i8].setColor(0, defaultAccentColor);
                        this.backgroundCheckBoxView[i8].setColor(1, defaultAccentColor2);
                        this.backgroundCheckBoxView[i8].setColor(2, defaultAccentColor3);
                        this.backgroundCheckBoxView[i8].setColor(3, defaultAccentColor4);
                        i8++;
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
                invalidateBlur();
            }
        }
        this.rotatePreview = false;
    }

    public static class DialogsAdapter extends RecyclerListView.SelectionAdapter {
        private ArrayList dialogs = new ArrayList();
        private Context mContext;

        public DialogsAdapter(Context context) {
            this.mContext = context;
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
            this.dialogs.add(customDialog);
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
            this.dialogs.add(customDialog2);
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
            this.dialogs.add(customDialog3);
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
            this.dialogs.add(customDialog4);
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
            this.dialogs.add(customDialog5);
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
            this.dialogs.add(customDialog6);
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
            this.dialogs.add(customDialog7);
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
            this.dialogs.add(customDialog8);
        }

        @Override
        public int getItemCount() {
            return this.dialogs.size();
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() != 1;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View loadingCell;
            if (i == 0) {
                loadingCell = new DialogCell(null, this.mContext, false, false);
            } else {
                loadingCell = new LoadingCell(this.mContext);
            }
            loadingCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(loadingCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
                DialogCell dialogCell = (DialogCell) viewHolder.itemView;
                dialogCell.useSeparator = i != getItemCount() - 1;
                dialogCell.setDialog((DialogCell.CustomDialog) this.dialogs.get(i));
            }
        }

        @Override
        public int getItemViewType(int i) {
            return i == this.dialogs.size() ? 1 : 0;
        }
    }

    public class MessagesAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;
        private ArrayList messages;
        private boolean showSecretMessages;

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        public MessagesAdapter(Context context) {
            this.showSecretMessages = ThemePreviewActivity.this.screenType == 0 && Utilities.random.nextInt(100) <= 1;
            this.mContext = context;
            this.messages = new ArrayList();
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i = iCurrentTimeMillis - 3600;
            if (ThemePreviewActivity.this.screenType != 2) {
                if (ThemePreviewActivity.this.screenType == 1) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_message.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                    TLRPC.Document document = tL_message.media.document;
                    document.mime_type = "audio/mp3";
                    document.file_reference = new byte[0];
                    document.id = -2147483648L;
                    document.size = 2621440L;
                    document.dc_id = Integer.MIN_VALUE;
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_documentAttributeFilename.file_name = LocaleController.getString(R.string.NewThemePreviewReply2) + ".mp3";
                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                    int i2 = iCurrentTimeMillis + (-3540);
                    tL_message.date = i2;
                    tL_message.dialog_id = 1L;
                    tL_message.flags = 259;
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.from_id = tL_peerUser;
                    tL_peerUser.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                    tL_message.id = 1;
                    tL_message.out = true;
                    TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                    tL_message.peer_id = tL_peerUser2;
                    tL_peerUser2.user_id = 0L;
                    MessageObject messageObject = new MessageObject(UserConfig.selectedAccount, tL_message, true, false);
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                        tL_message2.message = "this is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text";
                        tL_message2.date = iCurrentTimeMillis - 2640;
                        tL_message2.dialog_id = 1L;
                        tL_message2.flags = 259;
                        TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                        tL_message2.from_id = tL_peerUser3;
                        tL_peerUser3.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                        tL_message2.id = 1;
                        tL_message2.media = new TLRPC.TL_messageMediaEmpty();
                        tL_message2.out = true;
                        TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
                        tL_message2.peer_id = tL_peerUser4;
                        tL_peerUser4.user_id = 0L;
                        MessageObject messageObject2 = new MessageObject(UserConfig.selectedAccount, tL_message2, true, false);
                        messageObject2.resetLayout();
                        messageObject2.eventId = 1L;
                        this.messages.add(messageObject2);
                    }
                    TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
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
                        tL_message3.entities.add(tL_messageEntityTextUrl);
                    }
                    tL_message3.message = sb.toString();
                    tL_message3.date = iCurrentTimeMillis - 2640;
                    tL_message3.dialog_id = 1L;
                    tL_message3.flags = 259;
                    TLRPC.TL_peerUser tL_peerUser5 = new TLRPC.TL_peerUser();
                    tL_message3.from_id = tL_peerUser5;
                    tL_peerUser5.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                    tL_message3.id = 1;
                    tL_message3.media = new TLRPC.TL_messageMediaEmpty();
                    tL_message3.out = true;
                    TLRPC.TL_peerUser tL_peerUser6 = new TLRPC.TL_peerUser();
                    tL_message3.peer_id = tL_peerUser6;
                    tL_peerUser6.user_id = 0L;
                    MessageObject messageObject3 = new MessageObject(UserConfig.selectedAccount, tL_message3, true, false);
                    messageObject3.resetLayout();
                    messageObject3.eventId = 1L;
                    this.messages.add(messageObject3);
                    TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                    tL_message4.message = LocaleController.getString(R.string.NewThemePreviewLine1);
                    tL_message4.date = i2;
                    tL_message4.dialog_id = 1L;
                    tL_message4.flags = 265;
                    tL_message4.from_id = new TLRPC.TL_peerUser();
                    tL_message4.id = 1;
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_message4.reply_to = tL_messageReplyHeader;
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = 5;
                    tL_message4.media = new TLRPC.TL_messageMediaEmpty();
                    tL_message4.out = false;
                    TLRPC.TL_peerUser tL_peerUser7 = new TLRPC.TL_peerUser();
                    tL_message4.peer_id = tL_peerUser7;
                    tL_peerUser7.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                    MessageObject messageObject4 = new MessageObject(UserConfig.selectedAccount, tL_message4, true, false);
                    messageObject4.customReplyName = LocaleController.getString(R.string.NewThemePreviewName);
                    messageObject3.customReplyName = "Test User";
                    messageObject4.eventId = 1L;
                    messageObject4.resetLayout();
                    messageObject4.replyMessageObject = messageObject;
                    messageObject3.replyMessageObject = messageObject4;
                    this.messages.add(messageObject4);
                    this.messages.add(messageObject);
                    TLRPC.TL_message tL_message5 = new TLRPC.TL_message();
                    tL_message5.date = iCurrentTimeMillis - 3480;
                    tL_message5.dialog_id = 1L;
                    tL_message5.flags = 259;
                    tL_message5.out = false;
                    tL_message5.from_id = new TLRPC.TL_peerUser();
                    tL_message5.id = 1;
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument2 = new TLRPC.TL_messageMediaDocument();
                    tL_message5.media = tL_messageMediaDocument2;
                    tL_messageMediaDocument2.flags |= 3;
                    tL_messageMediaDocument2.document = new TLRPC.TL_document();
                    TLRPC.Document document2 = tL_message5.media.document;
                    document2.mime_type = "audio/ogg";
                    document2.file_reference = new byte[0];
                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                    tL_documentAttributeAudio.flags = 1028;
                    tL_documentAttributeAudio.duration = 3.0d;
                    tL_documentAttributeAudio.voice = true;
                    tL_documentAttributeAudio.waveform = new byte[]{0, 4, 17, -50, -93, 86, -103, -45, -12, -26, 63, -25, -3, 109, -114, -54, -4, -1, -1, -1, -1, -29, -1, -1, -25, -1, -1, -97, -43, 57, -57, -108, 1, -91, -4, -47, 21, 99, 10, 97, 43, 45, 115, -112, -77, 51, -63, 66, 40, 34, -122, -116, 48, -124, 16, 66, -120, 16, 68, 16, 33, 4, 1};
                    tL_message5.media.document.attributes.add(tL_documentAttributeAudio);
                    tL_message5.out = true;
                    TLRPC.TL_peerUser tL_peerUser8 = new TLRPC.TL_peerUser();
                    tL_message5.peer_id = tL_peerUser8;
                    tL_peerUser8.user_id = 0L;
                    MessageObject messageObject5 = new MessageObject(((BaseFragment) ThemePreviewActivity.this).currentAccount, tL_message5, true, false);
                    messageObject5.audioProgressSec = 1;
                    messageObject5.audioProgress = 0.3f;
                    messageObject5.useCustomPhoto = true;
                    this.messages.add(messageObject5);
                    return;
                }
                if (this.showSecretMessages) {
                    TLRPC.TL_user tL_user = new TLRPC.TL_user();
                    tL_user.id = 2147483647L;
                    tL_user.first_name = "Me";
                    TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
                    tL_user2.id = 2147483646L;
                    tL_user2.first_name = "Serj";
                    ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                    arrayList.add(tL_user);
                    arrayList.add(tL_user2);
                    MessagesController.getInstance(((BaseFragment) ThemePreviewActivity.this).currentAccount).putUsers(arrayList, true);
                    TLRPC.TL_message tL_message6 = new TLRPC.TL_message();
                    tL_message6.message = "Guess why Half-Life 3 was never released.";
                    int i3 = iCurrentTimeMillis - 2640;
                    tL_message6.date = i3;
                    tL_message6.dialog_id = -1L;
                    tL_message6.flags = 259;
                    tL_message6.id = 2147483646;
                    tL_message6.media = new TLRPC.TL_messageMediaEmpty();
                    tL_message6.out = false;
                    TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                    tL_message6.peer_id = tL_peerChat;
                    tL_peerChat.chat_id = 1L;
                    TLRPC.TL_peerUser tL_peerUser9 = new TLRPC.TL_peerUser();
                    tL_message6.from_id = tL_peerUser9;
                    tL_peerUser9.user_id = tL_user2.id;
                    this.messages.add(new MessageObject(((BaseFragment) ThemePreviewActivity.this).currentAccount, tL_message6, true, false));
                    TLRPC.TL_message tL_message7 = new TLRPC.TL_message();
                    tL_message7.message = "No.\nAnd every unnecessary ping of the dev delays the release for 10 days.\nEvery request for ETA delays the release for 2 weeks.";
                    tL_message7.date = i3;
                    tL_message7.dialog_id = -1L;
                    tL_message7.flags = 259;
                    tL_message7.id = 1;
                    tL_message7.media = new TLRPC.TL_messageMediaEmpty();
                    tL_message7.out = false;
                    TLRPC.TL_peerChat tL_peerChat2 = new TLRPC.TL_peerChat();
                    tL_message7.peer_id = tL_peerChat2;
                    tL_peerChat2.chat_id = 1L;
                    TLRPC.TL_peerUser tL_peerUser10 = new TLRPC.TL_peerUser();
                    tL_message7.from_id = tL_peerUser10;
                    tL_peerUser10.user_id = tL_user2.id;
                    this.messages.add(new MessageObject(((BaseFragment) ThemePreviewActivity.this).currentAccount, tL_message7, true, false));
                    TLRPC.TL_message tL_message8 = new TLRPC.TL_message();
                    tL_message8.message = "Is source code for Android coming anytime soon?";
                    tL_message8.date = iCurrentTimeMillis - 3000;
                    tL_message8.dialog_id = -1L;
                    tL_message8.flags = 259;
                    tL_message8.id = 1;
                    tL_message8.media = new TLRPC.TL_messageMediaEmpty();
                    tL_message8.out = false;
                    TLRPC.TL_peerChat tL_peerChat3 = new TLRPC.TL_peerChat();
                    tL_message8.peer_id = tL_peerChat3;
                    tL_peerChat3.chat_id = 1L;
                    TLRPC.TL_peerUser tL_peerUser11 = new TLRPC.TL_peerUser();
                    tL_message8.from_id = tL_peerUser11;
                    tL_peerUser11.user_id = tL_user.id;
                    this.messages.add(new MessageObject(((BaseFragment) ThemePreviewActivity.this).currentAccount, tL_message8, true, false));
                    return;
                }
                TLRPC.TL_message tL_message9 = new TLRPC.TL_message();
                tL_message9.message = LocaleController.getString(R.string.ThemePreviewLine1);
                int i4 = iCurrentTimeMillis - 3540;
                tL_message9.date = i4;
                tL_message9.dialog_id = 1L;
                tL_message9.flags = 259;
                TLRPC.TL_peerUser tL_peerUser12 = new TLRPC.TL_peerUser();
                tL_message9.from_id = tL_peerUser12;
                tL_peerUser12.user_id = UserConfig.getInstance(((BaseFragment) ThemePreviewActivity.this).currentAccount).getClientUserId();
                tL_message9.id = 1;
                tL_message9.media = new TLRPC.TL_messageMediaEmpty();
                tL_message9.out = true;
                TLRPC.TL_peerUser tL_peerUser13 = new TLRPC.TL_peerUser();
                tL_message9.peer_id = tL_peerUser13;
                tL_peerUser13.user_id = 0L;
                MessageObject messageObject6 = new MessageObject(((BaseFragment) ThemePreviewActivity.this).currentAccount, tL_message9, true, false);
                TLRPC.TL_message tL_message10 = new TLRPC.TL_message();
                tL_message10.message = LocaleController.getString(R.string.ThemePreviewLine2);
                tL_message10.date = iCurrentTimeMillis - 2640;
                tL_message10.dialog_id = 1L;
                tL_message10.flags = 259;
                TLRPC.TL_peerUser tL_peerUser14 = new TLRPC.TL_peerUser();
                tL_message10.from_id = tL_peerUser14;
                tL_peerUser14.user_id = UserConfig.getInstance(((BaseFragment) ThemePreviewActivity.this).currentAccount).getClientUserId();
                tL_message10.id = 1;
                tL_message10.media = new TLRPC.TL_messageMediaEmpty();
                tL_message10.out = true;
                TLRPC.TL_peerUser tL_peerUser15 = new TLRPC.TL_peerUser();
                tL_message10.peer_id = tL_peerUser15;
                tL_peerUser15.user_id = 0L;
                this.messages.add(new MessageObject(((BaseFragment) ThemePreviewActivity.this).currentAccount, tL_message10, true, false));
                TLRPC.TL_message tL_message11 = new TLRPC.TL_message();
                tL_message11.date = iCurrentTimeMillis - 3470;
                tL_message11.dialog_id = 1L;
                tL_message11.flags = 259;
                tL_message11.from_id = new TLRPC.TL_peerUser();
                tL_message11.id = 5;
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument3 = new TLRPC.TL_messageMediaDocument();
                tL_message11.media = tL_messageMediaDocument3;
                tL_messageMediaDocument3.flags |= 3;
                tL_messageMediaDocument3.document = new TLRPC.TL_document();
                TLRPC.Document document3 = tL_message11.media.document;
                document3.mime_type = "audio/mp4";
                document3.file_reference = new byte[0];
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio2.duration = 243.0d;
                tL_documentAttributeAudio2.performer = LocaleController.getString(R.string.ThemePreviewSongPerformer);
                tL_documentAttributeAudio2.title = LocaleController.getString(R.string.ThemePreviewSongTitle);
                tL_message11.media.document.attributes.add(tL_documentAttributeAudio2);
                tL_message11.out = false;
                TLRPC.TL_peerUser tL_peerUser16 = new TLRPC.TL_peerUser();
                tL_message11.peer_id = tL_peerUser16;
                tL_peerUser16.user_id = UserConfig.getInstance(((BaseFragment) ThemePreviewActivity.this).currentAccount).getClientUserId();
                this.messages.add(new MessageObject(((BaseFragment) ThemePreviewActivity.this).currentAccount, tL_message11, true, false));
                TLRPC.TL_message tL_message12 = new TLRPC.TL_message();
                tL_message12.message = LocaleController.getString(R.string.ThemePreviewLine3);
                tL_message12.date = i4;
                tL_message12.dialog_id = 1L;
                tL_message12.flags = 265;
                tL_message12.from_id = new TLRPC.TL_peerUser();
                tL_message12.id = 1;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader2 = new TLRPC.TL_messageReplyHeader();
                tL_message12.reply_to = tL_messageReplyHeader2;
                tL_messageReplyHeader2.flags |= 16;
                tL_messageReplyHeader2.reply_to_msg_id = 5;
                tL_message12.media = new TLRPC.TL_messageMediaEmpty();
                tL_message12.out = false;
                TLRPC.TL_peerUser tL_peerUser17 = new TLRPC.TL_peerUser();
                tL_message12.peer_id = tL_peerUser17;
                tL_peerUser17.user_id = UserConfig.getInstance(((BaseFragment) ThemePreviewActivity.this).currentAccount).getClientUserId();
                MessageObject messageObject7 = new MessageObject(((BaseFragment) ThemePreviewActivity.this).currentAccount, tL_message12, true, false);
                messageObject7.customReplyName = LocaleController.getString(R.string.ThemePreviewLine3Reply);
                messageObject7.replyMessageObject = messageObject6;
                this.messages.add(messageObject7);
                TLRPC.TL_message tL_message13 = new TLRPC.TL_message();
                tL_message13.date = iCurrentTimeMillis - 3480;
                tL_message13.dialog_id = 1L;
                tL_message13.flags = 259;
                TLRPC.TL_peerUser tL_peerUser18 = new TLRPC.TL_peerUser();
                tL_message13.from_id = tL_peerUser18;
                tL_peerUser18.user_id = UserConfig.getInstance(((BaseFragment) ThemePreviewActivity.this).currentAccount).getClientUserId();
                tL_message13.id = 1;
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument4 = new TLRPC.TL_messageMediaDocument();
                tL_message13.media = tL_messageMediaDocument4;
                tL_messageMediaDocument4.flags |= 3;
                tL_messageMediaDocument4.document = new TLRPC.TL_document();
                TLRPC.Document document4 = tL_message13.media.document;
                document4.mime_type = "audio/ogg";
                document4.file_reference = new byte[0];
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio3 = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio3.flags = 1028;
                tL_documentAttributeAudio3.duration = 3.0d;
                tL_documentAttributeAudio3.voice = true;
                tL_documentAttributeAudio3.waveform = new byte[]{0, 4, 17, -50, -93, 86, -103, -45, -12, -26, 63, -25, -3, 109, -114, -54, -4, -1, -1, -1, -1, -29, -1, -1, -25, -1, -1, -97, -43, 57, -57, -108, 1, -91, -4, -47, 21, 99, 10, 97, 43, 45, 115, -112, -77, 51, -63, 66, 40, 34, -122, -116, 48, -124, 16, 66, -120, 16, 68, 16, 33, 4, 1};
                tL_message13.media.document.attributes.add(tL_documentAttributeAudio3);
                tL_message13.out = true;
                TLRPC.TL_peerUser tL_peerUser19 = new TLRPC.TL_peerUser();
                tL_message13.peer_id = tL_peerUser19;
                tL_peerUser19.user_id = 0L;
                MessageObject messageObject8 = new MessageObject(((BaseFragment) ThemePreviewActivity.this).currentAccount, tL_message13, true, false);
                messageObject8.audioProgressSec = 1;
                messageObject8.audioProgress = 0.3f;
                messageObject8.useCustomPhoto = true;
                this.messages.add(messageObject8);
                this.messages.add(messageObject6);
                TLRPC.TL_message tL_message14 = new TLRPC.TL_message();
                tL_message14.date = iCurrentTimeMillis - 3590;
                tL_message14.dialog_id = 1L;
                tL_message14.flags = 257;
                tL_message14.from_id = new TLRPC.TL_peerUser();
                tL_message14.id = 1;
                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
                tL_message14.media = tL_messageMediaPhoto;
                tL_messageMediaPhoto.flags |= 3;
                tL_messageMediaPhoto.photo = new TLRPC.TL_photo();
                TLRPC.Photo photo = tL_message14.media.photo;
                photo.file_reference = new byte[0];
                photo.has_stickers = false;
                photo.id = 1L;
                photo.access_hash = 0L;
                photo.date = i;
                TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                tL_photoSize.size = 0;
                tL_photoSize.w = 500;
                tL_photoSize.h = 302;
                tL_photoSize.type = "s";
                tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
                tL_message14.media.photo.sizes.add(tL_photoSize);
                tL_message14.message = LocaleController.getString(R.string.ThemePreviewLine4);
                tL_message14.out = false;
                TLRPC.TL_peerUser tL_peerUser20 = new TLRPC.TL_peerUser();
                tL_message14.peer_id = tL_peerUser20;
                tL_peerUser20.user_id = UserConfig.getInstance(((BaseFragment) ThemePreviewActivity.this).currentAccount).getClientUserId();
                MessageObject messageObject9 = new MessageObject(((BaseFragment) ThemePreviewActivity.this).currentAccount, tL_message14, true, false);
                messageObject9.useCustomPhoto = true;
                this.messages.add(messageObject9);
                return;
            }
            if (ThemePreviewActivity.this.dialogId >= 0) {
                TLRPC.TL_message tL_message15 = new TLRPC.TL_message();
                if (ThemePreviewActivity.this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) {
                    tL_message15.message = LocaleController.getString(R.string.BackgroundColorSinglePreviewLine2);
                } else {
                    tL_message15.message = LocaleController.getString(R.string.BackgroundPreviewLine2);
                }
                tL_message15.date = iCurrentTimeMillis - 3540;
                tL_message15.dialog_id = 1L;
                tL_message15.flags = 259;
                tL_message15.id = 1;
                tL_message15.media = new TLRPC.TL_messageMediaEmpty();
                tL_message15.out = true;
                TLRPC.TL_peerUser tL_peerUser21 = new TLRPC.TL_peerUser();
                tL_message15.from_id = tL_peerUser21;
                tL_peerUser21.user_id = UserConfig.getInstance(((BaseFragment) ThemePreviewActivity.this).currentAccount).getClientUserId();
                TLRPC.TL_peerUser tL_peerUser22 = new TLRPC.TL_peerUser();
                tL_message15.peer_id = tL_peerUser22;
                tL_peerUser22.user_id = UserConfig.getInstance(((BaseFragment) ThemePreviewActivity.this).currentAccount).getClientUserId();
                MessageObject messageObject10 = new MessageObject(((BaseFragment) ThemePreviewActivity.this).currentAccount, tL_message15, true, false) {
                    @Override
                    public boolean needDrawAvatar() {
                        return false;
                    }
                };
                messageObject10.eventId = 1L;
                messageObject10.resetLayout();
                this.messages.add(messageObject10);
            }
            TLRPC.TL_message tL_message16 = new TLRPC.TL_message();
            MessageObject messageObject11 = null;
            TLRPC.Chat chat = ThemePreviewActivity.this.dialogId < 0 ? ThemePreviewActivity.this.getMessagesController().getChat(Long.valueOf(-ThemePreviewActivity.this.dialogId)) : null;
            if (chat != null) {
                tL_message16.message = LocaleController.getString(R.string.ChannelBackgroundMessagePreview);
                TLRPC.TL_message tL_message17 = new TLRPC.TL_message();
                tL_message17.message = LocaleController.getString(R.string.ChannelBackgroundMessageReplyText);
                TLRPC.Chat chat2 = chat;
                messageObject11 = new MessageObject(((BaseFragment) ThemePreviewActivity.this).currentAccount, tL_message17, true, false) {
                    @Override
                    public boolean needDrawAvatar() {
                        return false;
                    }
                };
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_message16.from_id = tL_peerChannel;
                tL_peerChannel.channel_id = chat2.id;
                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                tL_message16.peer_id = tL_peerChannel2;
                tL_peerChannel2.channel_id = chat2.id;
            } else {
                if (ThemePreviewActivity.this.dialogId == 0) {
                    if (ThemePreviewActivity.this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) {
                        tL_message16.message = LocaleController.getString(R.string.BackgroundColorSinglePreviewLine1);
                    } else {
                        tL_message16.message = LocaleController.getString(R.string.BackgroundPreviewLine1);
                    }
                } else {
                    tL_message16.message = LocaleController.getString(R.string.BackgroundColorSinglePreviewLine3);
                }
                tL_message16.from_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser23 = new TLRPC.TL_peerUser();
                tL_message16.peer_id = tL_peerUser23;
                tL_peerUser23.user_id = UserConfig.getInstance(((BaseFragment) ThemePreviewActivity.this).currentAccount).getClientUserId();
            }
            MessageObject messageObject12 = messageObject11;
            int i5 = iCurrentTimeMillis - 3540;
            tL_message16.date = i5;
            tL_message16.dialog_id = 1L;
            tL_message16.flags = 265;
            tL_message16.id = 1;
            tL_message16.media = new TLRPC.TL_messageMediaEmpty();
            tL_message16.out = false;
            MessageObject messageObject13 = new MessageObject(((BaseFragment) ThemePreviewActivity.this).currentAccount, tL_message16, messageObject12, true, false) {
                @Override
                public boolean needDrawAvatar() {
                    return false;
                }
            };
            if (messageObject12 != null) {
                messageObject13.customReplyName = LocaleController.getString(R.string.ChannelBackgroundMessageReplyName);
            }
            messageObject13.eventId = 1L;
            messageObject13.resetLayout();
            this.messages.add(messageObject13);
            if (ThemePreviewActivity.this.dialogId == 0 || ThemePreviewActivity.this.serverWallpaper != null) {
                return;
            }
            TLRPC.User user = ThemePreviewActivity.this.getMessagesController().getUser(Long.valueOf(ThemePreviewActivity.this.dialogId));
            TLRPC.TL_message tL_message18 = new TLRPC.TL_message();
            tL_message18.message = "";
            MessageObject messageObject14 = new MessageObject(((BaseFragment) ThemePreviewActivity.this).currentAccount, tL_message18, true, false);
            messageObject14.eventId = 1L;
            messageObject14.contentType = 5;
            this.messages.add(messageObject14);
            TLRPC.TL_message tL_message19 = new TLRPC.TL_message();
            if (user != null) {
                tL_message19.message = LocaleController.formatString(R.string.ChatBackgroundHint, UserObject.getFirstName(user));
            } else {
                tL_message19.message = LocaleController.getString(R.string.ChannelBackgroundHint);
            }
            tL_message19.date = i5;
            tL_message19.dialog_id = 1L;
            tL_message19.flags = 265;
            tL_message19.from_id = new TLRPC.TL_peerUser();
            tL_message19.id = 1;
            tL_message19.media = new TLRPC.TL_messageMediaEmpty();
            tL_message19.out = false;
            TLRPC.TL_peerUser tL_peerUser24 = new TLRPC.TL_peerUser();
            tL_message19.peer_id = tL_peerUser24;
            tL_peerUser24.user_id = UserConfig.getInstance(((BaseFragment) ThemePreviewActivity.this).currentAccount).getClientUserId();
            MessageObject messageObject15 = new MessageObject(((BaseFragment) ThemePreviewActivity.this).currentAccount, tL_message19, true, false);
            messageObject15.eventId = 1L;
            messageObject15.resetLayout();
            messageObject15.contentType = 1;
            this.messages.add(messageObject15);
        }

        private boolean hasButtons() {
            if (ThemePreviewActivity.this.messagesButtonsContainer == null || ThemePreviewActivity.this.screenType != 1 || ThemePreviewActivity.this.colorType != 3 || ThemePreviewActivity.this.accent.myMessagesGradientAccentColor2 == 0) {
                if (ThemePreviewActivity.this.backgroundButtonsContainer == null) {
                    return false;
                }
                if (ThemePreviewActivity.this.screenType != 2 && (ThemePreviewActivity.this.screenType != 1 || ThemePreviewActivity.this.colorType != 2)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public int getItemCount() {
            int size = this.messages.size();
            return hasButtons() ? size + 1 : size;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 0) {
                ChatMessageCell chatMessageCell = new ChatMessageCell(this.mContext, ((BaseFragment) ThemePreviewActivity.this).currentAccount, false, null, new Theme.ResourcesProvider() {
                    @Override
                    public ColorFilter getAnimatedEmojiColorFilter() {
                        return Theme.chat_animatedEmojiTextColorFilter;
                    }

                    @Override
                    public void setAnimatedColor(int i2, int i3) {
                        Theme.ResourcesProvider.CC.$default$setAnimatedColor(this, i2, i3);
                    }

                    @Override
                    public int getColor(int i2) {
                        return ThemePreviewActivity.this.themeDelegate.getColor(i2);
                    }

                    @Override
                    public Drawable getDrawable(String str) {
                        if (str.equals("drawableMsgOut")) {
                            return ThemePreviewActivity.this.msgOutDrawable;
                        }
                        if (str.equals("drawableMsgOutSelected")) {
                            return ThemePreviewActivity.this.msgOutDrawableSelected;
                        }
                        if (str.equals("drawableMsgOutMedia")) {
                            return ThemePreviewActivity.this.msgOutMediaDrawable;
                        }
                        if (str.equals("drawableMsgOutMediaSelected")) {
                            return ThemePreviewActivity.this.msgOutMediaDrawableSelected;
                        }
                        ThemeDelegate themeDelegate = ThemePreviewActivity.this.themeDelegate;
                        if (themeDelegate != null) {
                            return themeDelegate.getDrawable(str);
                        }
                        return Theme.getThemeDrawable(str);
                    }

                    @Override
                    public boolean isDark() {
                        return ThemePreviewActivity.this.themeDelegate.isDark();
                    }

                    @Override
                    public int getCurrentColor(int i2) {
                        return ThemePreviewActivity.this.themeDelegate.getCurrentColor(i2);
                    }

                    @Override
                    public int getColorOrDefault(int i2) {
                        return ThemePreviewActivity.this.themeDelegate.getColorOrDefault(i2);
                    }

                    @Override
                    public Paint getPaint(String str) {
                        return ThemePreviewActivity.this.themeDelegate.getPaint(str);
                    }

                    @Override
                    public boolean hasGradientService() {
                        return ThemePreviewActivity.this.themeDelegate.hasGradientService();
                    }

                    @Override
                    public void applyServiceShaderMatrix(int i2, int i3, float f, float f2) {
                        ThemeDelegate themeDelegate = ThemePreviewActivity.this.themeDelegate;
                        if (themeDelegate == null) {
                            Theme.applyServiceShaderMatrix(i2, i3, f, f2);
                        } else {
                            themeDelegate.applyServiceShaderMatrix(i2, i3, f, f2);
                        }
                    }
                });
                chatMessageCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate() {
                    @Override
                    public boolean allowAddPollOptions() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$allowAddPollOptions(this);
                    }

                    @Override
                    public boolean canDrawOutboundsContent() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canDrawOutboundsContent(this);
                    }

                    @Override
                    public boolean canPerformActions() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canPerformActions(this);
                    }

                    @Override
                    public boolean canPerformReply() {
                        return canPerformActions();
                    }

                    @Override
                    public boolean canSaveRichDocument(ChatMessageCell chatMessageCell2) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canSaveRichDocument(this, chatMessageCell2);
                    }

                    @Override
                    public boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell2) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canToggleRichMessageCheckbox(this, chatMessageCell2);
                    }

                    @Override
                    public void didLongPress(ChatMessageCell chatMessageCell2, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPress(this, chatMessageCell2, f, f2);
                    }

                    @Override
                    public void didLongPressBotButton(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressBotButton(this, chatMessageCell2, keyboardButtonProto);
                    }

                    @Override
                    public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat, int i2, float f, float f2) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressChannelAvatar(this, chatMessageCell2, chat, i2, f, f2);
                    }

                    @Override
                    public void didLongPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressCustomBotButton(this, chatMessageCell2, buttonCustom);
                    }

                    @Override
                    public boolean didLongPressPollOption(ChatMessageCell chatMessageCell2, TLRPC.PollAnswer pollAnswer) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressPollOption(this, chatMessageCell2, pollAnswer);
                    }

                    @Override
                    public boolean didLongPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressToDoButton(this, chatMessageCell2, todoItem);
                    }

                    @Override
                    public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user, float f, float f2) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressUserAvatar(this, chatMessageCell2, user, f, f2);
                    }

                    @Override
                    public void didPressAboutRevenueSharingAds() {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAboutRevenueSharingAds(this);
                    }

                    @Override
                    public void didPressAddPollOptionButton(ChatMessageCell chatMessageCell2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAddPollOptionButton(this, chatMessageCell2);
                    }

                    @Override
                    public void didPressAdmin(ChatMessageCell chatMessageCell2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAdmin(this, chatMessageCell2);
                    }

                    @Override
                    public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell2, AnimatedEmojiSpan animatedEmojiSpan) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAnimatedEmoji(this, chatMessageCell2, animatedEmojiSpan);
                    }

                    @Override
                    public void didPressAppUpdateButton() {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAppUpdateButton(this);
                    }

                    @Override
                    public void didPressBoostCounter(ChatMessageCell chatMessageCell2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBoostCounter(this, chatMessageCell2);
                    }

                    @Override
                    public void didPressBotButton(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBotButton(this, chatMessageCell2, keyboardButtonProto);
                    }

                    @Override
                    public void didPressCancelSendButton(ChatMessageCell chatMessageCell2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCancelSendButton(this, chatMessageCell2);
                    }

                    @Override
                    public void didPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat, int i2, float f, float f2, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelAvatar(this, chatMessageCell2, chat, i2, f, f2, z);
                    }

                    @Override
                    public void didPressChannelRecommendation(ChatMessageCell chatMessageCell2, TLObject tLObject, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendation(this, chatMessageCell2, tLObject, z);
                    }

                    @Override
                    public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendationsClose(this, chatMessageCell2);
                    }

                    @Override
                    public void didPressCodeCopy(ChatMessageCell chatMessageCell2, MessageObject.TextLayoutBlock textLayoutBlock) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCodeCopy(this, chatMessageCell2, textLayoutBlock);
                    }

                    @Override
                    public void didPressCommentButton(ChatMessageCell chatMessageCell2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCommentButton(this, chatMessageCell2);
                    }

                    @Override
                    public void didPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCustomBotButton(this, chatMessageCell2, buttonCustom);
                    }

                    @Override
                    public void didPressEffect(ChatMessageCell chatMessageCell2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressEffect(this, chatMessageCell2);
                    }

                    @Override
                    public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressExtendedMediaPreview(this, chatMessageCell2, keyboardInlineButton);
                    }

                    @Override
                    public void didPressFactCheck(ChatMessageCell chatMessageCell2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressFactCheck(this, chatMessageCell2);
                    }

                    @Override
                    public void didPressFactCheckWhat(ChatMessageCell chatMessageCell2, int i2, int i3) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressFactCheckWhat(this, chatMessageCell2, i2, i3);
                    }

                    @Override
                    public void didPressGiveawayChatButton(ChatMessageCell chatMessageCell2, int i2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressGiveawayChatButton(this, chatMessageCell2, i2);
                    }

                    @Override
                    public void didPressGroupImage(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressGroupImage(this, chatMessageCell2, imageReceiver, messageExtendedMedia, f, f2);
                    }

                    @Override
                    public void didPressHiddenForward(ChatMessageCell chatMessageCell2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHiddenForward(this, chatMessageCell2);
                    }

                    @Override
                    public void didPressHint(ChatMessageCell chatMessageCell2, int i2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHint(this, chatMessageCell2, i2);
                    }

                    @Override
                    public void didPressImage(ChatMessageCell chatMessageCell2, float f, float f2, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressImage(this, chatMessageCell2, f, f2, z);
                    }

                    @Override
                    public void didPressInstantButton(ChatMessageCell chatMessageCell2, int i2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressInstantButton(this, chatMessageCell2, i2);
                    }

                    @Override
                    public void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressMoreChannelRecommendations(this, chatMessageCell2);
                    }

                    @Override
                    public void didPressOther(ChatMessageCell chatMessageCell2, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressOther(this, chatMessageCell2, f, f2);
                    }

                    @Override
                    public void didPressPollMedia(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressPollMedia(this, chatMessageCell2, imageReceiver, pollAnswer, messageMedia, f, f2, i2);
                    }

                    @Override
                    public void didPressReaction(ChatMessageCell chatMessageCell2, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReaction(this, chatMessageCell2, reactionCount, z, f, f2);
                    }

                    @Override
                    public void didPressReplyMessage(ChatMessageCell chatMessageCell2, int i2, float f, float f2, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReplyMessage(this, chatMessageCell2, i2, f, f2, z);
                    }

                    @Override
                    public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressRevealSensitiveContent(this, chatMessageCell2);
                    }

                    @Override
                    public void didPressRichDocumentOptions(ChatMessageCell chatMessageCell2, TLRPC.Document document, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressRichDocumentOptions(this, chatMessageCell2, document, f, f2);
                    }

                    @Override
                    public void didPressShowMore(ChatMessageCell chatMessageCell2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressShowMore(this, chatMessageCell2);
                    }

                    @Override
                    public void didPressSideButton(ChatMessageCell chatMessageCell2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSideButton(this, chatMessageCell2);
                    }

                    @Override
                    public void didPressSponsoredClose(ChatMessageCell chatMessageCell2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSponsoredClose(this, chatMessageCell2);
                    }

                    @Override
                    public void didPressSponsoredInfo(ChatMessageCell chatMessageCell2, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSponsoredInfo(this, chatMessageCell2, f, f2);
                    }

                    @Override
                    public void didPressSummarize(ChatMessageCell chatMessageCell2, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSummarize(this, chatMessageCell2, z);
                    }

                    @Override
                    public void didPressTime(ChatMessageCell chatMessageCell2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressTime(this, chatMessageCell2);
                    }

                    @Override
                    public boolean didPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem, boolean z) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressToDoButton(this, chatMessageCell2, todoItem, z);
                    }

                    @Override
                    public void didPressUrl(ChatMessageCell chatMessageCell2, CharacterStyle characterStyle, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUrl(this, chatMessageCell2, characterStyle, z);
                    }

                    @Override
                    public void didPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user, float f, float f2, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserAvatar(this, chatMessageCell2, user, f, f2, z);
                    }

                    @Override
                    public void didPressUserStatus(ChatMessageCell chatMessageCell2, TLRPC.User user, TLRPC.Document document, String str) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserStatus(this, chatMessageCell2, user, document, str);
                    }

                    @Override
                    public void didPressViaBot(ChatMessageCell chatMessageCell2, String str) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBot(this, chatMessageCell2, str);
                    }

                    @Override
                    public void didPressViaBotNotInline(ChatMessageCell chatMessageCell2, long j) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBotNotInline(this, chatMessageCell2, j);
                    }

                    @Override
                    public void didPressVoteButtons(ChatMessageCell chatMessageCell2, ArrayList arrayList, int i2, int i3, int i4) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressVoteButtons(this, chatMessageCell2, arrayList, i2, i3, i4);
                    }

                    @Override
                    public void didPressWebPage(ChatMessageCell chatMessageCell2, TLRPC.WebPage webPage, String str, boolean z) {
                        Browser.openUrl(chatMessageCell2.getContext(), str);
                    }

                    @Override
                    public void didQuickShareEnd(ChatMessageCell chatMessageCell2, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareEnd(this, chatMessageCell2, f, f2);
                    }

                    @Override
                    public void didQuickShareMove(ChatMessageCell chatMessageCell2, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareMove(this, chatMessageCell2, f, f2);
                    }

                    @Override
                    public void didQuickShareStart(ChatMessageCell chatMessageCell2, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareStart(this, chatMessageCell2, f, f2);
                    }

                    @Override
                    public void didStartVideoStream(MessageObject messageObject) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didStartVideoStream(this, messageObject);
                    }

                    @Override
                    public void didTogglePollPreview(ChatMessageCell chatMessageCell2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didTogglePollPreview(this, chatMessageCell2);
                    }

                    @Override
                    public void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell2, boolean z, Runnable runnable) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didToggleRichMessageCheckbox(this, chatMessageCell2, z, runnable);
                    }

                    @Override
                    public boolean doNotShowLoadingReply(MessageObject messageObject) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$doNotShowLoadingReply(this, messageObject);
                    }

                    @Override
                    public void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$drawPollMode(this, canvas, chatMessageCell2);
                    }

                    @Override
                    public void forceUpdate(ChatMessageCell chatMessageCell2, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$forceUpdate(this, chatMessageCell2, z);
                    }

                    @Override
                    public void forceUpdate(ChatMessageCell chatMessageCell2, boolean z, boolean z2) {
                        forceUpdate(chatMessageCell2, z);
                    }

                    @Override
                    public void forceUpdateNoAnimation(ChatMessageCell chatMessageCell2, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$forceUpdateNoAnimation(this, chatMessageCell2, z);
                    }

                    @Override
                    public int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell2) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getAddPollOptionInputFieldHeight(this, chatMessageCell2);
                    }

                    @Override
                    public String getAdminRank(long j) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getAdminRank(this, j);
                    }

                    @Override
                    public int getChatMode() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getChatMode(this);
                    }

                    @Override
                    public ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getDraftMessageMeasureController(this);
                    }

                    @Override
                    public PinchToZoomHelper getPinchToZoomHelper() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getPinchToZoomHelper(this);
                    }

                    @Override
                    public String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell2) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getProgressLoadingBotButtonUrl(this, chatMessageCell2);
                    }

                    @Override
                    public CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell2) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getProgressLoadingLink(this, chatMessageCell2);
                    }

                    @Override
                    public TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getTextSelectionHelper(this);
                    }

                    @Override
                    public boolean hasSelectedMessages() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$hasSelectedMessages(this);
                    }

                    @Override
                    public void invalidateBlur() {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$invalidateBlur(this);
                    }

                    @Override
                    public boolean isAdmin(long j) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isAdmin(this, j);
                    }

                    @Override
                    public boolean isLandscape() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isLandscape(this);
                    }

                    @Override
                    public boolean isOwner(long j) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isOwner(this, j);
                    }

                    @Override
                    public boolean isProgressLoading(ChatMessageCell chatMessageCell2, int i2) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isProgressLoading(this, chatMessageCell2, i2);
                    }

                    @Override
                    public boolean isReplyOrSelf() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isReplyOrSelf(this);
                    }

                    @Override
                    public boolean keyboardIsOpened() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$keyboardIsOpened(this);
                    }

                    @Override
                    public void needOpenWebView(MessageObject messageObject, String str, String str2, String str3, String str4, int i2, int i3) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$needOpenWebView(this, messageObject, str, str2, str3, str4, i2, i3);
                    }

                    @Override
                    public boolean needPlayMessage(ChatMessageCell chatMessageCell2, MessageObject messageObject, boolean z) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$needPlayMessage(this, chatMessageCell2, messageObject, z);
                    }

                    @Override
                    public void needReloadPolls() {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$needReloadPolls(this);
                    }

                    @Override
                    public void needShowPremiumBulletin(int i2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$needShowPremiumBulletin(this, i2);
                    }

                    @Override
                    public boolean onAccessibilityAction(int i2, Bundle bundle) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$onAccessibilityAction(this, i2, bundle);
                    }

                    @Override
                    public void onDiceFinished() {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$onDiceFinished(this);
                    }

                    @Override
                    public boolean openArticlePhoto(ChatMessageCell chatMessageCell2, TL_iv.PageBlock pageBlock) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$openArticlePhoto(this, chatMessageCell2, pageBlock);
                    }

                    @Override
                    public void setShouldNotRepeatSticker(MessageObject messageObject) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$setShouldNotRepeatSticker(this, messageObject);
                    }

                    @Override
                    public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell2, boolean z) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldDrawThreadProgress(this, chatMessageCell2, z);
                    }

                    @Override
                    public boolean shouldRepeatSticker(MessageObject messageObject) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldRepeatSticker(this, messageObject);
                    }

                    @Override
                    public void videoTimerReached() {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$videoTimerReached(this);
                    }
                });
                view = chatMessageCell;
            } else if (i == 1) {
                ChatActionCell chatActionCell = new ChatActionCell(this.mContext, false, ThemePreviewActivity.this.themeDelegate);
                chatActionCell.setDelegate(new ChatActionCell.ChatActionCellDelegate() {
                    @Override
                    public boolean canDrawOutboundsContent() {
                        return ChatActionCell.ChatActionCellDelegate.CC.$default$canDrawOutboundsContent(this);
                    }

                    @Override
                    public void didClickButton(ChatActionCell chatActionCell2) {
                        ChatActionCell.ChatActionCellDelegate.CC.$default$didClickButton(this, chatActionCell2);
                    }

                    @Override
                    public void didClickImage(ChatActionCell chatActionCell2) {
                        ChatActionCell.ChatActionCellDelegate.CC.$default$didClickImage(this, chatActionCell2);
                    }

                    @Override
                    public boolean didLongPress(ChatActionCell chatActionCell2, float f, float f2) {
                        return ChatActionCell.ChatActionCellDelegate.CC.$default$didLongPress(this, chatActionCell2, f, f2);
                    }

                    @Override
                    public void didOpenPremiumGift(ChatActionCell chatActionCell2, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str, boolean z) {
                        ChatActionCell.ChatActionCellDelegate.CC.$default$didOpenPremiumGift(this, chatActionCell2, tL_premiumGiftOption, str, z);
                    }

                    @Override
                    public void didOpenPremiumGiftChannel(ChatActionCell chatActionCell2, String str, boolean z) {
                        ChatActionCell.ChatActionCellDelegate.CC.$default$didOpenPremiumGiftChannel(this, chatActionCell2, str, z);
                    }

                    @Override
                    public void didPressReaction(ChatActionCell chatActionCell2, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
                        ChatActionCell.ChatActionCellDelegate.CC.$default$didPressReaction(this, chatActionCell2, reactionCount, z, f, f2);
                    }

                    @Override
                    public void didPressReplyMessage(ChatActionCell chatActionCell2, int i2) {
                        ChatActionCell.ChatActionCellDelegate.CC.$default$didPressReplyMessage(this, chatActionCell2, i2);
                    }

                    @Override
                    public void didPressTaskLink(ChatActionCell chatActionCell2, int i2, int i3) {
                        ChatActionCell.ChatActionCellDelegate.CC.$default$didPressTaskLink(this, chatActionCell2, i2, i3);
                    }

                    @Override
                    public void forceUpdate(ChatActionCell chatActionCell2, boolean z) {
                        ChatActionCell.ChatActionCellDelegate.CC.$default$forceUpdate(this, chatActionCell2, z);
                    }

                    @Override
                    public BaseFragment getBaseFragment() {
                        return ChatActionCell.ChatActionCellDelegate.CC.$default$getBaseFragment(this);
                    }

                    @Override
                    public long getDialogId() {
                        return ChatActionCell.ChatActionCellDelegate.CC.$default$getDialogId(this);
                    }

                    @Override
                    public long getTopicId() {
                        return ChatActionCell.ChatActionCellDelegate.CC.$default$getTopicId(this);
                    }

                    @Override
                    public void needOpenInviteLink(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
                        ChatActionCell.ChatActionCellDelegate.CC.$default$needOpenInviteLink(this, tL_chatInviteExported);
                    }

                    @Override
                    public void needOpenUserProfile(long j) {
                        ChatActionCell.ChatActionCellDelegate.CC.$default$needOpenUserProfile(this, j);
                    }

                    @Override
                    public void needShowEffectOverlay(ChatActionCell chatActionCell2, TLRPC.Document document, TLRPC.VideoSize videoSize) {
                        ChatActionCell.ChatActionCellDelegate.CC.$default$needShowEffectOverlay(this, chatActionCell2, document, videoSize);
                    }

                    @Override
                    public void onTopicClick(ChatActionCell chatActionCell2) {
                        ChatActionCell.ChatActionCellDelegate.CC.$default$onTopicClick(this, chatActionCell2);
                    }
                });
                view = chatActionCell;
            } else if (i == 2) {
                if (ThemePreviewActivity.this.backgroundButtonsContainer.getParent() != null) {
                    ((ViewGroup) ThemePreviewActivity.this.backgroundButtonsContainer.getParent()).removeView(ThemePreviewActivity.this.backgroundButtonsContainer);
                }
                FrameLayout frameLayout = new FrameLayout(this.mContext) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                    }
                };
                frameLayout.addView(ThemePreviewActivity.this.backgroundButtonsContainer, LayoutHelper.createFrame(-1, 76, 17));
                view = frameLayout;
            } else if (i != 5) {
                if (ThemePreviewActivity.this.messagesButtonsContainer.getParent() != null) {
                    ((ViewGroup) ThemePreviewActivity.this.messagesButtonsContainer.getParent()).removeView(ThemePreviewActivity.this.messagesButtonsContainer);
                }
                FrameLayout frameLayout2 = new FrameLayout(this.mContext) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                    }
                };
                frameLayout2.addView(ThemePreviewActivity.this.messagesButtonsContainer, LayoutHelper.createFrame(-1, 76, 17));
                view = frameLayout2;
            } else {
                view = new View(ThemePreviewActivity.this.getContext()) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(4.0f), 1073741824));
                    }
                };
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            boolean z2;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 2 || itemViewType == 3) {
                return;
            }
            if (hasButtons()) {
                i--;
            }
            MessageObject messageObject = (MessageObject) this.messages.get(i);
            View view = viewHolder.itemView;
            if (view instanceof ChatMessageCell) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) view;
                chatMessageCell.isChat = false;
                int i2 = i - 1;
                int itemViewType2 = getItemViewType(i2);
                int i3 = i + 1;
                int itemViewType3 = getItemViewType(i3);
                if ((messageObject.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) || itemViewType2 != viewHolder.getItemViewType()) {
                    z = false;
                } else {
                    MessageObject messageObject2 = (MessageObject) this.messages.get(i2);
                    if (messageObject2.isOutOwner() != messageObject.isOutOwner() || Math.abs(messageObject2.messageOwner.date - messageObject.messageOwner.date) > 300) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (itemViewType3 == viewHolder.getItemViewType() && i3 < this.messages.size()) {
                    MessageObject messageObject3 = (MessageObject) this.messages.get(i3);
                    z2 = !(messageObject3.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && messageObject3.isOutOwner() == messageObject.isOutOwner() && Math.abs(messageObject3.messageOwner.date - messageObject.messageOwner.date) <= 300;
                }
                chatMessageCell.isChat = this.showSecretMessages || ThemePreviewActivity.this.dialogId < 0;
                chatMessageCell.setFullyDraw(true);
                chatMessageCell.setMessageObject(messageObject, null, z, z2, false);
                return;
            }
            if (view instanceof ChatActionCell) {
                ChatActionCell chatActionCell = (ChatActionCell) view;
                chatActionCell.setMessageObject(messageObject);
                chatActionCell.setAlpha(1.0f);
                ThemePreviewActivity.this.invalidateBlur();
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (hasButtons()) {
                if (i == 0) {
                    return ThemePreviewActivity.this.colorType == 3 ? 3 : 2;
                }
                i--;
            }
            if (i < 0 || i >= this.messages.size()) {
                return 4;
            }
            return ((MessageObject) this.messages.get(i)).contentType;
        }
    }

    class PatternsAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        @Override
        public int getItemViewType(int i) {
            return 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        public PatternsAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            if (ThemePreviewActivity.this.patterns != null) {
                return ThemePreviewActivity.this.patterns.size();
            }
            return 0;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(new PatternCell(this.mContext, ThemePreviewActivity.this.maxWallpaperSize, new PatternCell.PatternCellDelegate() {
                @Override
                public TLRPC.TL_wallPaper getSelectedPattern() {
                    return ThemePreviewActivity.this.selectedPattern;
                }

                @Override
                public int getCheckColor() {
                    return ThemePreviewActivity.this.checkColor;
                }

                @Override
                public int getBackgroundColor() {
                    if (ThemePreviewActivity.this.screenType == 2) {
                        return ThemePreviewActivity.this.backgroundColor;
                    }
                    int defaultAccentColor = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper);
                    int i2 = (int) ThemePreviewActivity.this.accent.backgroundOverrideColor;
                    return i2 != 0 ? i2 : defaultAccentColor;
                }

                @Override
                public int getBackgroundGradientColor1() {
                    if (ThemePreviewActivity.this.screenType == 2) {
                        return ThemePreviewActivity.this.backgroundGradientColor1;
                    }
                    int defaultAccentColor = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to1);
                    int i2 = (int) ThemePreviewActivity.this.accent.backgroundGradientOverrideColor1;
                    return i2 != 0 ? i2 : defaultAccentColor;
                }

                @Override
                public int getBackgroundGradientColor2() {
                    if (ThemePreviewActivity.this.screenType == 2) {
                        return ThemePreviewActivity.this.backgroundGradientColor2;
                    }
                    int defaultAccentColor = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to2);
                    int i2 = (int) ThemePreviewActivity.this.accent.backgroundGradientOverrideColor2;
                    return i2 != 0 ? i2 : defaultAccentColor;
                }

                @Override
                public int getBackgroundGradientColor3() {
                    if (ThemePreviewActivity.this.screenType == 2) {
                        return ThemePreviewActivity.this.backgroundGradientColor3;
                    }
                    int defaultAccentColor = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to3);
                    int i2 = (int) ThemePreviewActivity.this.accent.backgroundGradientOverrideColor3;
                    return i2 != 0 ? i2 : defaultAccentColor;
                }

                @Override
                public int getBackgroundGradientAngle() {
                    return ThemePreviewActivity.this.screenType == 2 ? ThemePreviewActivity.this.backgroundRotation : ThemePreviewActivity.this.accent.backgroundRotation;
                }

                @Override
                public float getIntensity() {
                    return ThemePreviewActivity.this.currentIntensity;
                }

                @Override
                public int getPatternColor() {
                    return ThemePreviewActivity.this.patternColor;
                }
            }));
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            PatternCell patternCell = (PatternCell) viewHolder.itemView;
            patternCell.setPattern((TLRPC.TL_wallPaper) ThemePreviewActivity.this.patterns.get(i));
            patternCell.getImageReceiver().setColorFilter(new PorterDuffColorFilter(ThemePreviewActivity.this.patternColor, ThemePreviewActivity.this.blendMode));
            if (Build.VERSION.SDK_INT >= 29) {
                int i2 = 0;
                if (ThemePreviewActivity.this.screenType != 1) {
                    if (ThemePreviewActivity.this.currentWallpaper instanceof WallpapersListActivity.ColorWallpaper) {
                        i2 = ThemePreviewActivity.this.backgroundGradientColor2;
                    }
                } else {
                    int defaultAccentColor = Theme.getDefaultAccentColor(Theme.key_chat_wallpaper_gradient_to2);
                    int i3 = (int) ThemePreviewActivity.this.accent.backgroundGradientOverrideColor2;
                    if (i3 != 0 || ThemePreviewActivity.this.accent.backgroundGradientOverrideColor2 == 0) {
                        i2 = i3 != 0 ? i3 : defaultAccentColor;
                    }
                }
                if (i2 != 0 && ThemePreviewActivity.this.currentIntensity >= 0.0f) {
                    ThemePreviewActivity.this.backgroundImage.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                } else {
                    patternCell.getImageReceiver().setBlendMode(null);
                }
            }
        }
    }

    public ArrayList getThemeDescriptionsInternal() {
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                ThemePreviewActivity.m4684$r8$lambda$mxPVSGvN3hJPwWs7u42kcNPav8(this.f$0);
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.page1;
        int i = ThemeDescription.FLAG_BACKGROUND;
        int i2 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(frameLayout, i, null, null, null, themeDescriptionDelegate, i2));
        ViewPager viewPager = this.viewPager;
        int i3 = ThemeDescription.FLAG_LISTGLOWCOLOR;
        int i4 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(viewPager, i3, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i4));
        ActionBar actionBar = this.actionBar;
        int i5 = ThemeDescription.FLAG_AB_SELECTORCOLOR;
        int i6 = Theme.key_actionBarDefaultSelector;
        arrayList.add(new ThemeDescription(actionBar, i5, null, null, null, null, i6));
        ActionBar actionBar2 = this.actionBar;
        int i7 = ThemeDescription.FLAG_AB_TITLECOLOR;
        int i8 = Theme.key_actionBarDefaultTitle;
        arrayList.add(new ThemeDescription(actionBar2, i7, null, null, null, null, i8));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCH, null, null, null, null, Theme.key_actionBarDefaultSearch));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCHPLACEHOLDER, null, null, null, null, Theme.key_actionBarDefaultSearchPlaceholder));
        arrayList.add(new ThemeDescription(this.actionBar2, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.actionBar2, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, i8));
        arrayList.add(new ThemeDescription(this.actionBar2, ThemeDescription.FLAG_AB_SUBTITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultSubtitle));
        arrayList.add(new ThemeDescription(this.actionBar2, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.actionBar2, ThemeDescription.FLAG_AB_SUBMENUBACKGROUND, null, null, null, themeDescriptionDelegate, Theme.key_actionBarDefaultSubmenuBackground));
        arrayList.add(new ThemeDescription(this.actionBar2, ThemeDescription.FLAG_AB_SUBMENUITEM, null, null, null, themeDescriptionDelegate, Theme.key_actionBarDefaultSubmenuItem));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.listView2, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i4));
        if (!this.useDefaultThemeForButtons) {
            arrayList.add(new ThemeDescription(this.saveButtonsContainer, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i2));
            TextView textView = this.cancelButton;
            int i9 = ThemeDescription.FLAG_TEXTCOLOR;
            int i10 = Theme.key_chat_fieldOverlayText;
            arrayList.add(new ThemeDescription(textView, i9, null, null, null, null, i10));
            arrayList.add(new ThemeDescription(this.doneButton, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i10));
        }
        ColorPicker colorPicker = this.colorPicker;
        if (colorPicker != null) {
            colorPicker.provideThemeDescriptions(arrayList);
        }
        if (this.patternLayout != null) {
            for (int i11 = 0; i11 < this.patternLayout.length; i11++) {
                arrayList.add(new ThemeDescription(this.patternLayout[i11], 0, null, null, new Drawable[]{Theme.chat_composeShadowDrawable}, null, Theme.key_chat_messagePanelShadow));
                arrayList.add(new ThemeDescription(this.patternLayout[i11], 0, null, Theme.chat_composeBackgroundPaint, null, null, Theme.key_chat_messagePanelBackground));
            }
            for (int i12 = 0; i12 < this.patternsButtonsContainer.length; i12++) {
                arrayList.add(new ThemeDescription(this.patternsButtonsContainer[i12], 0, null, null, new Drawable[]{Theme.chat_composeShadowDrawable}, null, Theme.key_chat_messagePanelShadow));
                arrayList.add(new ThemeDescription(this.patternsButtonsContainer[i12], 0, null, Theme.chat_composeBackgroundPaint, null, null, Theme.key_chat_messagePanelBackground));
            }
            arrayList.add(new ThemeDescription(this.bottomOverlayChat, 0, null, null, new Drawable[]{Theme.chat_composeShadowDrawable}, null, Theme.key_chat_messagePanelShadow));
            arrayList.add(new ThemeDescription(this.bottomOverlayChat, 0, null, Theme.chat_composeBackgroundPaint, null, null, Theme.key_chat_messagePanelBackground));
            for (int i13 = 0; i13 < this.patternsSaveButton.length; i13++) {
                arrayList.add(new ThemeDescription(this.patternsSaveButton[i13], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_chat_fieldOverlayText));
            }
            for (int i14 = 0; i14 < this.patternsCancelButton.length; i14++) {
                arrayList.add(new ThemeDescription(this.patternsCancelButton[i14], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_chat_fieldOverlayText));
            }
            arrayList.add(new ThemeDescription(this.intensitySeekBar, 0, new Class[]{SeekBarView.class}, new String[]{"innerPaint1"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_player_progressBackground));
            arrayList.add(new ThemeDescription(this.intensitySeekBar, 0, new Class[]{SeekBarView.class}, new String[]{"outerPaint1"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_player_progress));
            arrayList.add(new ThemeDescription(this.intensityCell, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgInDrawable, Theme.chat_msgInMediaDrawable}, null, Theme.key_chat_inBubble));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgInSelectedDrawable, Theme.chat_msgInMediaSelectedDrawable}, null, Theme.key_chat_inBubbleSelected));
            Drawable[] shadowDrawables = Theme.chat_msgInDrawable.getShadowDrawables();
            int i15 = Theme.key_chat_inBubbleShadow;
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, shadowDrawables, null, i15));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, Theme.chat_msgInMediaDrawable.getShadowDrawables(), null, i15));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{this.msgOutDrawable, this.msgOutMediaDrawable}, null, Theme.key_chat_outBubble));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{this.msgOutDrawable, this.msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient1));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{this.msgOutDrawable, this.msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient2));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{this.msgOutDrawable, this.msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient3));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, new Drawable[]{Theme.chat_msgOutSelectedDrawable, Theme.chat_msgOutMediaSelectedDrawable}, null, Theme.key_chat_outBubbleSelected));
            Drawable[] shadowDrawables2 = Theme.chat_msgOutDrawable.getShadowDrawables();
            int i16 = Theme.key_chat_outBubbleShadow;
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, shadowDrawables2, null, i16));
            arrayList.add(new ThemeDescription(this.listView2, 0, new Class[]{ChatMessageCell.class}, null, Theme.chat_msgOutMediaDrawable.getShadowDrawables(), null, i16));
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
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_divider));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_dialogBackground));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription((View) null, 0, (Class[]) null, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_dialogBackgroundGray));
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            ((ThemeDescription) arrayList.get(i17)).resourcesProvider = getResourceProvider();
        }
        return arrayList;
    }

    public static void m4684$r8$lambda$mxPVSGvN3hJPwWs7u42kcNPav8(ThemePreviewActivity themePreviewActivity) {
        ActionBarMenuItem actionBarMenuItem = themePreviewActivity.dropDownContainer;
        int i = 0;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.redrawPopup(themePreviewActivity.getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
            themePreviewActivity.dropDownContainer.setPopupItemsColor(themePreviewActivity.getThemedColor(Theme.key_actionBarDefaultSubmenuItem), false);
        }
        Drawable drawable = themePreviewActivity.sheetDrawable;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(themePreviewActivity.getThemedColor(Theme.key_windowBackgroundWhite), PorterDuff.Mode.MULTIPLY));
        }
        FrameLayout frameLayout = themePreviewActivity.bottomOverlayChat;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
        if (themePreviewActivity.onSwitchDayNightDelegate != null) {
            INavigationLayout iNavigationLayout = themePreviewActivity.parentLayout;
            if (iNavigationLayout != null && iNavigationLayout.getBottomSheet() != null) {
                themePreviewActivity.parentLayout.getBottomSheet().fixNavigationBar(themePreviewActivity.getThemedColor(Theme.key_dialogBackground));
                if (themePreviewActivity.screenType == 2 && themePreviewActivity.dialogId != 0) {
                    themePreviewActivity.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            } else {
                themePreviewActivity.setNavigationBarColor(themePreviewActivity.getThemedColor(Theme.key_dialogBackground));
            }
        }
        if (themePreviewActivity.backgroundCheckBoxView != null) {
            int i2 = 0;
            while (true) {
                WallpaperCheckBoxView[] wallpaperCheckBoxViewArr = themePreviewActivity.backgroundCheckBoxView;
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
        if (themePreviewActivity.messagesCheckBoxView != null) {
            while (true) {
                WallpaperCheckBoxView[] wallpaperCheckBoxViewArr2 = themePreviewActivity.messagesCheckBoxView;
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
        TextView textView = themePreviewActivity.patternTitleView;
        if (textView != null) {
            textView.setTextColor(themePreviewActivity.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
        }
        ColorPicker colorPicker = themePreviewActivity.colorPicker;
        if (colorPicker != null) {
            colorPicker.invalidate();
        }
        FragmentFloatingButton fragmentFloatingButton = themePreviewActivity.floatingButton;
        if (fragmentFloatingButton != null) {
            fragmentFloatingButton.updateColors();
        }
    }

    @Override
    public ArrayList getThemeDescriptions() {
        if (this.shouldShowDayNightIcon) {
            return getThemeDescriptionsInternal();
        }
        return super.getThemeDescriptions();
    }

    private void createServiceMessageLocal(TLRPC.WallPaper wallPaper, boolean z) {
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
        tL_messageActionSetChatWallPaper.wallpaper = wallPaper;
        tL_messageActionSetChatWallPaper.for_both = z;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        arrayList.add(new MessageObject(this.currentAccount, tL_messageService, false, false));
        new ArrayList().add(tL_messageService);
        MessagesController.getInstance(this.currentAccount).updateInterfaceWithMessages(this.dialogId, arrayList, 0);
    }

    public class BackgroundView extends BackupImageView {
        public Drawable background;
        boolean drawBackground;
        public float tx;
        public float ty;

        public BackgroundView(Context context) {
            super(context);
            this.drawBackground = true;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            ThemePreviewActivity themePreviewActivity = ThemePreviewActivity.this;
            themePreviewActivity.parallaxScale = themePreviewActivity.parallaxEffect.getScale(getMeasuredWidth(), getMeasuredHeight());
            if (ThemePreviewActivity.this.isMotion) {
                setScaleX(ThemePreviewActivity.this.parallaxScale);
                setScaleY(ThemePreviewActivity.this.parallaxScale);
            }
            ThemePreviewActivity themePreviewActivity2 = ThemePreviewActivity.this;
            themePreviewActivity2.progressVisible = themePreviewActivity2.screenType == 2 && getMeasuredWidth() <= getMeasuredHeight();
            int measuredWidth = getMeasuredWidth() + (getMeasuredHeight() << 16);
            if (ThemePreviewActivity.this.lastSizeHash != measuredWidth) {
                ThemePreviewActivity.this.hasScrollingBackground = false;
                if (ThemePreviewActivity.this.currentWallpaperBitmap != null) {
                    int width = (int) (ThemePreviewActivity.this.currentWallpaperBitmap.getWidth() * (getMeasuredHeight() / ThemePreviewActivity.this.currentWallpaperBitmap.getHeight()));
                    if (width - getMeasuredWidth() > 100) {
                        ThemePreviewActivity.this.hasScrollingBackground = true;
                        ThemePreviewActivity.this.croppedWidth = (int) (getMeasuredWidth() * (ThemePreviewActivity.this.currentWallpaperBitmap.getHeight() / getMeasuredHeight()));
                        ThemePreviewActivity themePreviewActivity3 = ThemePreviewActivity.this;
                        float measuredWidth2 = (width - getMeasuredWidth()) / 2.0f;
                        themePreviewActivity3.currentScrollOffset = measuredWidth2;
                        themePreviewActivity3.defaultScrollOffset = measuredWidth2;
                        ThemePreviewActivity themePreviewActivity4 = ThemePreviewActivity.this;
                        themePreviewActivity4.maxScrollOffset = themePreviewActivity4.currentScrollOffset * 2.0f;
                        setSize(width, getMeasuredHeight());
                        this.drawFromStart = true;
                        ThemePreviewActivity.this.invalidateBlur();
                    }
                }
                if (!ThemePreviewActivity.this.hasScrollingBackground) {
                    setSize(-1, -1);
                    this.drawFromStart = false;
                }
            }
            ThemePreviewActivity.this.lastSizeHash = measuredWidth;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            this.tx = 0.0f;
            this.ty = 0.0f;
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
                        int iCeil = (int) Math.ceil(this.background.getIntrinsicWidth() * fMax * ThemePreviewActivity.this.parallaxScale);
                        int iCeil2 = (int) Math.ceil(this.background.getIntrinsicHeight() * fMax * ThemePreviewActivity.this.parallaxScale);
                        int measuredWidth = (getMeasuredWidth() - iCeil) / 2;
                        int i = (measuredHeight - iCeil2) / 2;
                        this.ty = i;
                        this.background.setBounds(measuredWidth, i, iCeil + measuredWidth, iCeil2 + i);
                        this.background.draw(canvas);
                    }
                }
            }
            if (ThemePreviewActivity.this.hasScrollingBackground) {
                if (!ThemePreviewActivity.this.scroller.isFinished() && ThemePreviewActivity.this.scroller.computeScrollOffset()) {
                    float startX = ThemePreviewActivity.this.scroller.getStartX();
                    ThemePreviewActivity themePreviewActivity = ThemePreviewActivity.this;
                    if (startX < themePreviewActivity.maxScrollOffset && themePreviewActivity.scroller.getStartX() > 0) {
                        ThemePreviewActivity themePreviewActivity2 = ThemePreviewActivity.this;
                        themePreviewActivity2.currentScrollOffset = themePreviewActivity2.scroller.getCurrX();
                    }
                    ThemePreviewActivity.this.invalidateBlur();
                    invalidate();
                }
                canvas.save();
                float f2 = -ThemePreviewActivity.this.currentScrollOffset;
                this.tx = f2;
                canvas.translate(f2, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            } else {
                super.onDraw(canvas);
            }
            if (!ThemePreviewActivity.this.shouldShowBrightnessControll || ThemePreviewActivity.this.dimAmount <= 0.0f) {
                return;
            }
            canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, (int) (ThemePreviewActivity.this.dimAmount * 255.0f * ThemePreviewActivity.this.progressToDarkTheme)));
        }

        @Override
        public Drawable getBackground() {
            return this.background;
        }

        @Override
        public void setBackground(Drawable drawable) {
            this.background = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
        }

        @Override
        protected boolean verifyDrawable(Drawable drawable) {
            return this.background == drawable || super.verifyDrawable(drawable);
        }
    }

    private class MessageDrawable extends org.telegram.ui.ActionBar.MessageDrawable {
        public MessageDrawable(int i, boolean z, boolean z2) {
            super(i, z, z2);
        }

        @Override
        public void setTop(int i, int i2, int i3, boolean z, boolean z2) {
            if (ThemePreviewActivity.this.setupFinished) {
                return;
            }
            super.setTop(i, i2, i3, z, z2);
        }

        @Override
        public void setTop(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
            if (ThemePreviewActivity.this.setupFinished) {
                return;
            }
            super.setTop(i, i2, i3, i4, i5, i6, z, z2);
        }
    }

    private class BlurButton extends View {
        private final ColorFilter colorFilter;
        private final Paint dimPaint;
        private final Paint dimPaint2;
        private CircularProgressDrawable loadingDrawable;
        private float loadingT;
        private final Drawable rippleDrawable;
        private Text subtext;
        private boolean subtextShown;
        private AnimatedFloat subtextShownT;
        private Text text;

        public BlurButton(Context context) {
            super(context);
            this.subtextShownT = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
            Drawable drawableCreateRadSelectorDrawable = Theme.createRadSelectorDrawable(285212671, 8, 8);
            this.rippleDrawable = drawableCreateRadSelectorDrawable;
            this.dimPaint = new Paint(1);
            this.dimPaint2 = new Paint(1);
            this.loadingT = 0.0f;
            drawableCreateRadSelectorDrawable.setCallback(this);
            ColorMatrix colorMatrix = new ColorMatrix();
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
            this.colorFilter = new ColorMatrixColorFilter(colorMatrix);
        }

        public void setText(CharSequence charSequence) {
            this.text = new Text(charSequence, 14.0f, AndroidUtilities.bold());
        }

        public void setSubText(CharSequence charSequence, boolean z) {
            if (charSequence != null) {
                this.subtext = new Text(charSequence, 12.0f);
            }
            boolean z2 = charSequence != null;
            this.subtextShown = z2;
            if (!z) {
                this.subtextShownT.set(z2, true);
            }
            invalidate();
        }

        public CharSequence getText() {
            Text text = this.text;
            if (text != null) {
                return text.getText();
            }
            return null;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Text text;
            float height = getHeight() / 2.0f;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            Theme.applyServiceShaderMatrixForView(this, ThemePreviewActivity.this.backgroundImage, ThemePreviewActivity.this.themeDelegate);
            Paint paint = ThemePreviewActivity.this.themeDelegate.getPaint("paintChatActionBackground");
            ColorFilter colorFilter = paint.getColorFilter();
            paint.setColorFilter(this.colorFilter);
            canvas.drawRoundRect(rectF, height, height, paint);
            paint.setColorFilter(colorFilter);
            if (ThemePreviewActivity.this.shouldShowBrightnessControll && ThemePreviewActivity.this.dimAmount > 0.0f) {
                this.dimPaint2.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (ThemePreviewActivity.this.dimAmount * 255.0f * ThemePreviewActivity.this.progressToDarkTheme)));
                canvas.drawRoundRect(rectF, height, height, this.dimPaint2);
            }
            this.dimPaint.setColor(520093695);
            canvas.drawRoundRect(rectF, height, height, this.dimPaint);
            if (this.loadingT > 0.0f) {
                if (this.loadingDrawable == null) {
                    this.loadingDrawable = new CircularProgressDrawable(-1);
                }
                int iDp = (int) ((1.0f - this.loadingT) * AndroidUtilities.dp(-24.0f));
                this.loadingDrawable.setBounds(0, iDp, getWidth(), getHeight() + iDp);
                this.loadingDrawable.setAlpha((int) (this.loadingT * 255.0f));
                this.loadingDrawable.draw(canvas);
                invalidate();
            }
            float f = this.subtextShownT.set(this.subtextShown);
            if (this.loadingT < 1.0f && (text = this.text) != null) {
                text.ellipsize(getWidth() - AndroidUtilities.dp(14.0f)).draw(canvas, (getWidth() - this.text.getWidth()) / 2.0f, ((getHeight() / 2.0f) + (this.loadingT * AndroidUtilities.dp(24.0f))) - (AndroidUtilities.dp(7.0f) * f), -1, 1.0f - this.loadingT);
            }
            if (this.loadingT < 1.0f && this.subtext != null) {
                canvas.save();
                canvas.scale(f, f, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
                this.subtext.ellipsize(getWidth() - AndroidUtilities.dp(14.0f)).draw(canvas, (getWidth() - this.subtext.getWidth()) / 2.0f, AndroidUtilities.dp(11.0f) + (getHeight() / 2.0f) + (this.loadingT * AndroidUtilities.dp(24.0f)), Theme.multAlpha(-1, 0.75f), 1.0f - this.loadingT);
                canvas.restore();
            }
            this.rippleDrawable.setBounds(0, 0, getWidth(), getHeight());
            this.rippleDrawable.draw(canvas);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            if (motionEvent.getAction() == 0) {
                this.rippleDrawable.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.rippleDrawable.setState(new int[]{16842910, 16842919});
                z = true;
            } else {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.rippleDrawable.setState(StateSet.NOTHING);
                }
                z = false;
            }
            return super.onTouchEvent(motionEvent) || z;
        }

        @Override
        protected boolean verifyDrawable(Drawable drawable) {
            return drawable == this.rippleDrawable || super.verifyDrawable(drawable);
        }
    }

    public class ThemeDelegate implements Theme.ResourcesProvider {
        public final Paint chat_actionBackgroundGradientDarkenPaint;
        public final TextPaint chat_actionTextPaint;
        public final TextPaint chat_actionTextPaint2;
        public final TextPaint chat_botButtonPaint;
        public Theme.ResourcesProvider parentProvider;
        private Bitmap serviceBitmap;
        private Matrix serviceBitmapMatrix;
        public BitmapShader serviceBitmapShader;
        private final SparseIntArray currentColors = new SparseIntArray();
        public final Paint chat_actionBackgroundPaint = new Paint(3);
        public final Paint chat_actionBackgroundSelectedPaint = new Paint(3);

        @Override
        public ColorFilter getAnimatedEmojiColorFilter() {
            return Theme.chat_animatedEmojiTextColorFilter;
        }

        @Override
        public int getColorOrDefault(int i) {
            return getColor(i);
        }

        @Override
        public void setAnimatedColor(int i, int i2) {
            Theme.ResourcesProvider.CC.$default$setAnimatedColor(this, i, i2);
        }

        public ThemeDelegate() {
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

        @Override
        public int getColor(int i) {
            Theme.ResourcesProvider resourcesProvider = this.parentProvider;
            if (resourcesProvider != null) {
                return resourcesProvider.getColor(i);
            }
            return Theme.getColor(i);
        }

        @Override
        public Drawable getDrawable(String str) {
            Theme.ResourcesProvider resourcesProvider = this.parentProvider;
            if (resourcesProvider != null) {
                return resourcesProvider.getDrawable(str);
            }
            return Theme.getThemeDrawable(str);
        }

        @Override
        public int getCurrentColor(int i) {
            Theme.ResourcesProvider resourcesProvider = this.parentProvider;
            if (resourcesProvider == null) {
                return getColor(i);
            }
            return resourcesProvider.getCurrentColor(i);
        }

        @Override
        public Paint getPaint(String str) {
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
                    if (resourcesProvider == null) {
                        return Theme.getThemePaint(str);
                    }
                    return resourcesProvider.getPaint(str);
            }
        }

        @Override
        public boolean hasGradientService() {
            Theme.ResourcesProvider resourcesProvider = this.parentProvider;
            if (resourcesProvider != null) {
                return resourcesProvider.hasGradientService();
            }
            return Theme.hasGradientService();
        }

        public void applyChatServiceMessageColor() {
            applyChatServiceMessageColor(null, null, null, null);
        }

        public void applyChatServiceMessageColor(int[] iArr, Drawable drawable, Drawable drawable2, Float f) {
            Bitmap bitmap;
            int i = Theme.key_chat_serviceBackground;
            int color = getColor(i);
            int color2 = getColor(Theme.key_chat_serviceBackgroundSelected);
            if (drawable == null) {
                drawable = drawable2;
            }
            boolean z = drawable instanceof MotionBackgroundDrawable;
            if ((z || (drawable instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) {
                if (z) {
                    bitmap = ((MotionBackgroundDrawable) drawable).getBitmap();
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
                this.chat_actionTextPaint.setColor(-1);
                this.chat_actionTextPaint2.setColor(-1);
                this.chat_actionTextPaint.linkColor = -1;
                this.chat_botButtonPaint.setColor(-1);
            } else {
                this.serviceBitmap = null;
                this.serviceBitmapShader = null;
                TextPaint textPaint = this.chat_actionTextPaint;
                int i2 = Theme.key_chat_serviceText;
                textPaint.setColor(getColor(i2));
                this.chat_actionTextPaint2.setColor(getColor(i2));
                this.chat_actionTextPaint.linkColor = getColor(Theme.key_chat_serviceLink);
            }
            this.chat_actionBackgroundPaint.setColor(color);
            this.chat_actionBackgroundSelectedPaint.setColor(color2);
            if (this.serviceBitmapShader != null && (this.currentColors.indexOfKey(i) < 0 || z || (drawable instanceof BitmapDrawable))) {
                ColorMatrix colorMatrix = new ColorMatrix();
                if (z) {
                    if (((MotionBackgroundDrawable) drawable).getIntensity() >= 0.0f) {
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
                    float intensity = ((MotionBackgroundDrawable) drawable).getIntensity();
                    if (f != null) {
                        intensity = f.floatValue();
                    }
                    if (intensity >= 0.0f) {
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
                this.chat_actionBackgroundPaint.setShader(this.serviceBitmapShader);
                this.chat_actionBackgroundPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                this.chat_actionBackgroundPaint.setAlpha(255);
                this.chat_actionBackgroundSelectedPaint.setShader(this.serviceBitmapShader);
                ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix2, 0.85f);
                this.chat_actionBackgroundSelectedPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                this.chat_actionBackgroundSelectedPaint.setAlpha(255);
                return;
            }
            this.chat_actionBackgroundPaint.setColorFilter(null);
            this.chat_actionBackgroundPaint.setShader(null);
            this.chat_actionBackgroundSelectedPaint.setColorFilter(null);
            this.chat_actionBackgroundSelectedPaint.setShader(null);
        }

        @Override
        public void applyServiceShaderMatrix(int i, int i2, float f, float f2) {
            BitmapShader bitmapShader;
            Bitmap bitmap = this.serviceBitmap;
            if (bitmap == null || (bitmapShader = this.serviceBitmapShader) == null) {
                Theme.applyServiceShaderMatrix(i, i2, f, f2);
            } else {
                Theme.applyServiceShaderMatrix(bitmap, bitmapShader, this.serviceBitmapMatrix, i, i2, f, f2);
            }
        }

        @Override
        public boolean isDark() {
            DayNightSwitchDelegate dayNightSwitchDelegate = ThemePreviewActivity.this.onSwitchDayNightDelegate;
            if (dayNightSwitchDelegate != null) {
                return dayNightSwitchDelegate.isDark();
            }
            Theme.ResourcesProvider resourcesProvider = this.parentProvider;
            return resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark();
        }
    }

    public void toggleTheme() {
        if (this.changeDayNightView != null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) (insideBottomSheet() ? this.parentLayout.getBottomSheet().getWindow() : getParentActivity().getWindow()).getDecorView();
        final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmapCreateBitmap);
        this.dayNightItem.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.dayNightItem.setAlpha(1.0f);
        final Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        final Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        this.dayNightItem.getLocationInWindow(iArr);
        final float f = iArr[0];
        final float f2 = iArr[1];
        final float measuredWidth = f + (this.dayNightItem.getMeasuredWidth() / 2.0f);
        final float measuredHeight = f2 + (this.dayNightItem.getMeasuredHeight() / 2.0f);
        final float fMax = Math.max(bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
        View view = new View(getContext()) {
            @Override
            protected void onDraw(Canvas canvas2) {
                super.onDraw(canvas2);
                if (!ThemePreviewActivity.this.themeDelegate.isDark()) {
                    canvas2.drawCircle(measuredWidth, measuredHeight, fMax * (1.0f - ThemePreviewActivity.this.changeDayNightViewProgress), paint2);
                } else {
                    if (ThemePreviewActivity.this.changeDayNightViewProgress > 0.0f) {
                        canvas.drawCircle(measuredWidth, measuredHeight, fMax * ThemePreviewActivity.this.changeDayNightViewProgress, paint);
                    }
                    canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint2);
                }
                canvas2.save();
                canvas2.translate(f, f2);
                ThemePreviewActivity.this.dayNightItem.draw(canvas2);
                canvas2.restore();
            }
        };
        this.changeDayNightView = view;
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return ThemePreviewActivity.$r8$lambda$hgI32JY_2MnOr_EA_PQkThVFdaQ(view2, motionEvent);
            }
        });
        this.changeDayNightViewProgress = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.changeDayNightViewAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            boolean changedNavigationBarColor = false;

            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ThemePreviewActivity.this.changeDayNightViewProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ThemePreviewActivity.this.changeDayNightView.invalidate();
                if (this.changedNavigationBarColor || ThemePreviewActivity.this.changeDayNightViewProgress <= 0.5f) {
                    return;
                }
                this.changedNavigationBarColor = true;
            }
        });
        this.changeDayNightViewAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (ThemePreviewActivity.this.changeDayNightView != null) {
                    if (ThemePreviewActivity.this.changeDayNightView.getParent() != null) {
                        ((ViewGroup) ThemePreviewActivity.this.changeDayNightView.getParent()).removeView(ThemePreviewActivity.this.changeDayNightView);
                    }
                    ThemePreviewActivity.this.changeDayNightView = null;
                }
                ThemePreviewActivity.this.changeDayNightViewAnimator = null;
                super.onAnimationEnd(animator);
            }
        });
        this.changeDayNightViewAnimator.setDuration(400L);
        this.changeDayNightViewAnimator.setInterpolator(Easings.easeInOutQuad);
        this.changeDayNightViewAnimator.start();
        frameLayout.addView(this.changeDayNightView, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ThemePreviewActivity.m4685$r8$lambda$oas9CTr2XW9LE5om3hyG7dg0w(this.f$0);
            }
        });
    }

    public static void m4685$r8$lambda$oas9CTr2XW9LE5om3hyG7dg0w(final ThemePreviewActivity themePreviewActivity) {
        themePreviewActivity.onSwitchDayNightDelegate.switchDayNight(false);
        themePreviewActivity.setForceDark(themePreviewActivity.themeDelegate.isDark(), true);
        themePreviewActivity.setCurrentImage(false);
        themePreviewActivity.invalidateBlur();
        themePreviewActivity.updateBlurred();
        if (themePreviewActivity.themeDescriptions != null) {
            for (int i = 0; i < themePreviewActivity.themeDescriptions.size(); i++) {
                ((ThemeDescription) themePreviewActivity.themeDescriptions.get(i)).setColor(themePreviewActivity.getThemedColor(((ThemeDescription) themePreviewActivity.themeDescriptions.get(i)).getCurrentKey()), false, false);
            }
        }
        if (themePreviewActivity.shouldShowBrightnessControll) {
            DayNightSwitchDelegate dayNightSwitchDelegate = themePreviewActivity.onSwitchDayNightDelegate;
            if (dayNightSwitchDelegate != null && dayNightSwitchDelegate.isDark()) {
                themePreviewActivity.dimmingSlider.setVisibility(0);
                themePreviewActivity.dimmingSlider.animateValueTo(themePreviewActivity.dimAmount);
            } else {
                themePreviewActivity.dimmingSlider.animateValueTo(0.0f);
            }
            ValueAnimator valueAnimator = themePreviewActivity.changeDayNightViewAnimator2;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                themePreviewActivity.changeDayNightViewAnimator2.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(themePreviewActivity.progressToDarkTheme, themePreviewActivity.onSwitchDayNightDelegate.isDark() ? 1.0f : 0.0f);
            themePreviewActivity.changeDayNightViewAnimator2 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ThemePreviewActivity.$r8$lambda$3VBFZAo3FGBpCKbvZEY8iEbqsDM(this.f$0, valueAnimator2);
                }
            });
            themePreviewActivity.changeDayNightViewAnimator2.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (ThemePreviewActivity.this.onSwitchDayNightDelegate.isDark()) {
                        return;
                    }
                    ThemePreviewActivity.this.dimmingSlider.setVisibility(8);
                }
            });
            themePreviewActivity.changeDayNightViewAnimator2.setDuration(250L);
            themePreviewActivity.changeDayNightViewAnimator2.setInterpolator(CubicBezierInterpolator.DEFAULT);
            themePreviewActivity.changeDayNightViewAnimator2.start();
        }
    }

    public static void $r8$lambda$3VBFZAo3FGBpCKbvZEY8iEbqsDM(ThemePreviewActivity themePreviewActivity, ValueAnimator valueAnimator) {
        themePreviewActivity.getClass();
        themePreviewActivity.progressToDarkTheme = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        themePreviewActivity.backgroundImage.invalidate();
        themePreviewActivity.bottomOverlayChat.invalidate();
        themePreviewActivity.dimmingSlider.setAlpha(themePreviewActivity.progressToDarkTheme);
        themePreviewActivity.dimmingSliderContainer.invalidate();
        themePreviewActivity.invalidateBlur();
    }

    public void setForceDark(boolean z, boolean z2) {
        if (z2) {
            RLottieDrawable rLottieDrawable = this.sunDrawable;
            rLottieDrawable.setCustomEndFrame(z ? rLottieDrawable.getFramesCount() : 0);
            RLottieDrawable rLottieDrawable2 = this.sunDrawable;
            if (rLottieDrawable2 != null) {
                rLottieDrawable2.start();
                return;
            }
            return;
        }
        int framesCount = z ? this.sunDrawable.getFramesCount() - 1 : 0;
        this.sunDrawable.setCurrentFrame(framesCount, false, true);
        this.sunDrawable.setCustomEndFrame(framesCount);
        ActionBarMenuItem actionBarMenuItem = this.dayNightItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.invalidate();
        }
    }
}
