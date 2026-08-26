package org.telegram.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import com.google.android.gms.internal.mlkit_vision_common.zzki;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotGuardHelper$$ExternalSyntheticLambda0;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilePathDatabase;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.BottomSheet$$ExternalSyntheticLambda5;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckBoxCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CacheChart;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.HideViewAfterAnimation;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.NestedSizeNotifierLayout;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SlideChooseView;
import org.telegram.ui.Components.StorageDiagramView;
import org.telegram.ui.Components.StorageUsageView;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Storage.CacheModel;

public class CacheControlActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public static final int KEEP_MEDIA_TYPE_CHANNEL = 2;
    public static final int KEEP_MEDIA_TYPE_GROUP = 1;
    public static final int KEEP_MEDIA_TYPE_STORIES = 3;
    public static final int KEEP_MEDIA_TYPE_USER = 0;
    private static int LISTDIR_DOCTYPE2_EMOJI = 3;
    private static int LISTDIR_DOCTYPE2_OTHER = 5;
    private static int LISTDIR_DOCTYPE2_TEMP = 4;
    private static int LISTDIR_DOCTYPE_ALL = 0;
    private static int LISTDIR_DOCTYPE_MUSIC = 2;
    private static int LISTDIR_DOCTYPE_OTHER_THAN_MUSIC = 1;
    public static final int TYPE_ANIMATED_STICKERS_CACHE = 5;
    public static final int TYPE_DOCUMENTS = 2;
    public static final int TYPE_MUSIC = 3;
    public static final int TYPE_OTHER = 6;
    public static final int TYPE_PHOTOS = 0;
    public static final int TYPE_STORIES = 7;
    public static final int TYPE_VIDEOS = 1;
    public static final int TYPE_VOICE = 4;
    public static final long UNKNOWN_CHATS_DIALOG_ID = Long.MAX_VALUE;
    private static final int VIEW_FLICKER_LOADING_DIALOG = 6;
    private static final int VIEW_TYPE_CACHE_VIEW_PAGER = 8;
    private static final int VIEW_TYPE_CHART = 9;
    private static final int VIEW_TYPE_CHART_HEADER = 10;
    private static final int VIEW_TYPE_CHAT = 5;
    private static final int VIEW_TYPE_CHOOSER = 4;
    private static final int VIEW_TYPE_CLEAR_CACHE_BUTTON = 13;
    private static final int VIEW_TYPE_HEADER = 3;
    private static final int VIEW_TYPE_INFO = 1;
    private static final int VIEW_TYPE_KEEP_MEDIA_CELL = 7;
    public static final int VIEW_TYPE_MAX_CACHE_SIZE = 14;
    private static final int VIEW_TYPE_SECTION = 11;
    private static final int VIEW_TYPE_SECTION_LOADING = 12;
    private static final int VIEW_TYPE_STORAGE = 2;
    private static final int VIEW_TYPE_TEXT_SETTINGS = 0;
    public static volatile boolean canceled = false;
    private static final int clear_database_id = 3;
    private static final int delete_id = 1;
    private static Long lastDeviceTotalFreeSize = null;
    private static Long lastDeviceTotalSize = null;
    private static Long lastTotalSizeCalculated = null;
    private static long lastTotalSizeCalculatedTime = 0;
    private static final int other_id = 2;
    private static final int reset_database_id = 4;
    private ValueAnimator actionBarAnimator;
    private float actionBarShadowAlpha;
    private boolean actionBarShown;
    private float actionBarShownT;
    private ActionBarMenu actionMode;
    private TextView actionModeClearButton;
    private AnimatedTextView actionModeSubtitle;
    private AnimatedTextView actionModeTitle;
    private View actionTextView;
    private long audioSize;
    private BottomSheet bottomSheet;
    private View bottomSheetView;
    private CacheChart cacheChart;
    private CacheChartHeader cacheChartHeader;
    private long cacheEmojiSize;
    CacheModel cacheModel;
    private long cacheSize;
    private long cacheTempSize;
    private CachedMediaLayout cachedMediaLayout;
    private boolean calculating;
    private boolean changeStatusBar;
    private ClearCacheButtonInternal clearCacheButton;
    private ActionBarMenuSubItem clearDatabaseItem;
    private boolean collapsed;
    private long databaseSize;
    private long documentsSize;
    long fragmentCreateTime;
    private ArrayList<ItemInner> itemInners;
    private LinearLayoutManager layoutManager;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private boolean loadingDialogs;
    private long logsSize;
    private long migrateOldFolderRow;
    private long musicSize;
    private NestedSizeNotifierLayout nestedSizeNotifierLayout;
    private ArrayList<ItemInner> oldItems;
    private int[] percents;
    private long photoSize;
    AlertDialog progressDialog;
    private ActionBarMenuSubItem resetDatabaseItem;
    private int sectionsEndRow;
    private int sectionsStartRow;
    private boolean[] selected;
    AnimatedTextView selectedDialogsCountTextView;
    private long stickersCacheSize;
    private long storiesSize;
    private float[] tempSizes;
    private long totalDeviceFreeSize;
    private long totalDeviceSize;
    private long totalSize;
    private boolean updateDatabaseSize;
    private long videoSize;

    public class CacheChartHeader extends FrameLayout {
        boolean firstSet;
        Paint loadingBackgroundPaint;
        LoadingDrawable loadingDrawable;
        AnimatedFloat loadingFloat;
        Float percent;
        AnimatedFloat percentAnimated;
        Paint percentPaint;
        RectF progressRect;
        private float[] radii;
        private Path roundPath;
        TextView[] subtitle;
        AnimatedTextView title;
        Float usedPercent;
        AnimatedFloat usedPercentAnimated;
        Paint usedPercentPaint;

        public CacheChartHeader(Context context) {
            super(context);
            this.subtitle = new TextView[3];
            this.progressRect = new RectF();
            this.loadingDrawable = new LoadingDrawable();
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.percentAnimated = new AnimatedFloat(this, 450L, cubicBezierInterpolator);
            this.usedPercentAnimated = new AnimatedFloat(this, 450L, cubicBezierInterpolator);
            this.loadingFloat = new AnimatedFloat(this, 450L, cubicBezierInterpolator);
            this.loadingBackgroundPaint = new Paint(1);
            this.percentPaint = new Paint(1);
            this.usedPercentPaint = new Paint(1);
            this.firstSet = true;
            AnimatedTextView animatedTextView = new AnimatedTextView(context);
            this.title = animatedTextView;
            animatedTextView.setAnimationProperties(0.35f, 0L, 350L, cubicBezierInterpolator);
            this.title.setTypeface(AndroidUtilities.bold());
            this.title.setTextSize(AndroidUtilities.dp(20.0f));
            this.title.setText(LocaleController.getString(R.string.StorageUsage));
            this.title.setGravity(17);
            this.title.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            addView(this.title, LayoutHelper.createFrame(-2, 26, 49));
            int i = 0;
            while (i < 3) {
                this.subtitle[i] = new TextView(context);
                this.subtitle[i].setTextSize(1, 13.0f);
                this.subtitle[i].setGravity(17);
                this.subtitle[i].setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                if (i == 0) {
                    this.subtitle[i].setText(LocaleController.getString(R.string.StorageUsageCalculating));
                } else if (i == 1) {
                    this.subtitle[i].setAlpha(0.0f);
                    this.subtitle[i].setText(LocaleController.getString(R.string.StorageUsageTelegram));
                    this.subtitle[i].setVisibility(4);
                } else if (i == 2) {
                    this.subtitle[i].setText(LocaleController.getString(R.string.StorageCleared2));
                    this.subtitle[i].setAlpha(0.0f);
                    this.subtitle[i].setVisibility(4);
                }
                this.subtitle[i].setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText4, false));
                addView(this.subtitle[i], LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, i == 2 ? 12.0f : -6.0f, 0.0f, 0.0f));
                i++;
            }
            this.loadingDrawable.setColors(Theme.getColor(null, Theme.key_actionBarActionModeDefaultSelector, false), Theme.multAlpha(0.2f, Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText4, false)));
            this.loadingDrawable.setRadiiDp(4.0f);
            this.loadingDrawable.setCallback(this);
        }

        private void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, Paint paint) {
            Path path = this.roundPath;
            if (path == null) {
                this.roundPath = new Path();
            } else {
                path.rewind();
            }
            if (this.radii == null) {
                this.radii = new float[8];
            }
            float[] fArr = this.radii;
            fArr[7] = f;
            fArr[6] = f;
            fArr[1] = f;
            fArr[0] = f;
            fArr[5] = f2;
            fArr[4] = f2;
            fArr[3] = f2;
            fArr[2] = f2;
            this.roundPath.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.drawPath(this.roundPath, paint);
        }

        public void lambda$updateViewVisible$0(ValueAnimator valueAnimator) {
            invalidate();
        }

        public void lambda$updateViewVisible$1(ValueAnimator valueAnimator) {
            invalidate();
        }

        private void switchSubtitle(int i) {
            boolean z = System.currentTimeMillis() - CacheControlActivity.this.fragmentCreateTime > 40;
            updateViewVisible(this.subtitle[0], i == 0, z);
            updateViewVisible(this.subtitle[1], i == 1, z);
            updateViewVisible(this.subtitle[2], i == 2, z);
        }

        private void updateViewVisible(View view, boolean z, boolean z2) {
            if (view == null) {
                return;
            }
            if (view.getParent() == null) {
                z2 = false;
            }
            view.animate().setListener(null).cancel();
            if (!z2) {
                view.setVisibility(z ? 0 : 4);
                view.setTag(z ? 1 : null);
                view.setAlpha(z ? 1.0f : 0.0f);
                view.setTranslationY(z ? 0.0f : AndroidUtilities.dp(8.0f));
                invalidate();
                return;
            }
            if (!z) {
                final int i = 1;
                view.animate().alpha(0.0f).translationY(AndroidUtilities.dp(8.0f)).setListener(new HideViewAfterAnimation(view)).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final CacheControlActivity.CacheChartHeader f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i) {
                            case 0:
                                this.f$0.lambda$updateViewVisible$0(valueAnimator);
                                break;
                            default:
                                this.f$0.lambda$updateViewVisible$1(valueAnimator);
                                break;
                        }
                    }
                }).start();
                return;
            }
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setTranslationY(AndroidUtilities.dp(8.0f));
            }
            final int i2 = 0;
            view.animate().alpha(1.0f).translationY(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final CacheControlActivity.CacheChartHeader f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$updateViewVisible$0(valueAnimator);
                            break;
                        default:
                            this.f$0.lambda$updateViewVisible$1(valueAnimator);
                            break;
                    }
                }
            }).start();
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            RectF rectF;
            float alpha = 1.0f - this.subtitle[2].getAlpha();
            float f = this.loadingFloat.set(this.percent == null ? 1.0f : 0.0f);
            AnimatedFloat animatedFloat = this.percentAnimated;
            Float f2 = this.percent;
            float f3 = animatedFloat.set(f2 == null ? 0.0f : f2.floatValue());
            AnimatedFloat animatedFloat2 = this.usedPercentAnimated;
            Float f4 = this.usedPercent;
            float f5 = animatedFloat2.set(f4 == null ? 0.0f : f4.floatValue());
            Paint paint = this.loadingBackgroundPaint;
            int i = Theme.key_actionBarActionModeDefaultSelector;
            paint.setColor(Theme.getColor(null, i, false));
            Paint paint2 = this.loadingBackgroundPaint;
            paint2.setAlpha((int) (paint2.getAlpha() * alpha));
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f6 = 1.0f - f;
            float fMax = Math.max((Math.max(AndroidUtilities.dp(4.0f), this.progressRect.width() * f5) * f6) + this.progressRect.left, (Math.max(AndroidUtilities.dp(4.0f), this.progressRect.width() * f3) * f6) + this.progressRect.left) + AndroidUtilities.dp(1.0f);
            RectF rectF3 = this.progressRect;
            rectF2.set(fMax, rectF3.top, rectF3.right, rectF3.bottom);
            if (rectF2.left >= rectF2.right || rectF2.width() <= AndroidUtilities.dp(3.0f)) {
                rectF = rectF2;
            } else {
                rectF = rectF2;
                drawRoundRect(canvas, rectF, AndroidUtilities.dp(AndroidUtilities.lerp(1, 2, f)), AndroidUtilities.dp(2.0f), this.loadingBackgroundPaint);
            }
            this.loadingDrawable.setBounds(this.progressRect);
            this.loadingDrawable.setAlpha((int) (255.0f * alpha * f));
            this.loadingDrawable.draw(canvas);
            Paint paint3 = this.usedPercentPaint;
            int i2 = Theme.key_radioBackgroundChecked;
            paint3.setColor(ColorUtils.blendARGB(0.75f, Theme.getColor(null, i2, false), Theme.getColor(null, i, false)));
            Paint paint4 = this.usedPercentPaint;
            paint4.setAlpha((int) (paint4.getAlpha() * alpha));
            float fMax2 = (Math.max(AndroidUtilities.dp(4.0f), this.progressRect.width() * f3) * f6) + this.progressRect.left + AndroidUtilities.dp(1.0f);
            RectF rectF4 = this.progressRect;
            rectF.set(fMax2, rectF4.top, (Math.max(AndroidUtilities.dp(4.0f), this.progressRect.width() * f5) * f6) + rectF4.left, this.progressRect.bottom);
            if (rectF.width() > AndroidUtilities.dp(3.0f)) {
                drawRoundRect(canvas, rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(f5 > 0.97f ? 2.0f : 1.0f), this.usedPercentPaint);
            }
            this.percentPaint.setColor(Theme.getColor(null, i2, false));
            Paint paint5 = this.percentPaint;
            paint5.setAlpha((int) (paint5.getAlpha() * alpha));
            RectF rectF5 = this.progressRect;
            float f7 = rectF5.left;
            rectF.set(f7, rectF5.top, (Math.max(AndroidUtilities.dp(4.0f), this.progressRect.width() * f3) * f6) + f7, this.progressRect.bottom);
            drawRoundRect(canvas, rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(f3 > 0.97f ? 2.0f : 1.0f), this.percentPaint);
            if (f > 0.0f || this.percentAnimated.isInProgress()) {
                invalidate();
            }
            super.dispatchDraw(canvas);
        }

        @Override
        public void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int iMin = (int) Math.min(AndroidUtilities.dp(174.0f), ((double) size) * 0.8d);
            super.measureChildren(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
            int iDp = AndroidUtilities.dp(72.0f);
            int i3 = 0;
            int iMax = 0;
            while (true) {
                TextView[] textViewArr = this.subtitle;
                if (i3 >= textViewArr.length) {
                    int i4 = iDp + iMax;
                    setMeasuredDimension(size, i4);
                    this.progressRect.set((size - iMin) / 2.0f, i4 - AndroidUtilities.dp(30.0f), (size + iMin) / 2.0f, i4 - AndroidUtilities.dp(26.0f));
                    return;
                }
                iMax = Math.max(iMax, textViewArr[i3].getMeasuredHeight() - (i3 == 2 ? AndroidUtilities.dp(16.0f) : 0));
                i3++;
            }
        }

        public void setData(boolean z, float f, float f2) {
            this.title.setText(z ? LocaleController.getString(R.string.StorageUsage) : LocaleController.getString(R.string.StorageCleared));
            if (z) {
                if (f < 0.01f) {
                    this.subtitle[1].setText(LocaleController.formatString(R.string.StorageUsageTelegramLess, CacheControlActivity.this.formatPercent(f)));
                } else {
                    this.subtitle[1].setText(LocaleController.formatString(R.string.StorageUsageTelegram, CacheControlActivity.this.formatPercent(f)));
                }
                switchSubtitle(1);
            } else {
                switchSubtitle(2);
            }
            this.firstSet = false;
            this.percent = Float.valueOf(f);
            this.usedPercent = Float.valueOf(f2);
            invalidate();
        }
    }

    public static class ClearCacheButton extends FrameLayout {
        FrameLayout button;
        TextView rtlTextView;
        AnimatedTextView.AnimatedTextDrawable textView;
        AnimatedTextView.AnimatedTextDrawable valueTextView;

        public ClearCacheButton(Context context) {
            super(context);
            FrameLayout frameLayout = new FrameLayout(context) {
                @Override
                public void dispatchDraw(Canvas canvas) {
                    int measuredWidth = (((getMeasuredWidth() - AndroidUtilities.dp(8.0f)) - ((int) ClearCacheButton.this.valueTextView.getCurrentWidth())) + ((int) ClearCacheButton.this.textView.getCurrentWidth())) / 2;
                    if (LocaleController.isRTL) {
                        super.dispatchDraw(canvas);
                        return;
                    }
                    ClearCacheButton.this.textView.setBounds(0, 0, measuredWidth, getHeight());
                    ClearCacheButton.this.textView.draw(canvas);
                    ClearCacheButton.this.valueTextView.setBounds(AndroidUtilities.dp(8.0f) + measuredWidth, 0, getWidth(), getHeight());
                    ClearCacheButton.this.valueTextView.draw(canvas);
                }

                @Override
                public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    accessibilityNodeInfo.setClassName("android.widget.Button");
                }

                @Override
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    super.onInterceptTouchEvent(motionEvent);
                    return true;
                }

                @Override
                public boolean verifyDrawable(Drawable drawable) {
                    ClearCacheButton clearCacheButton = ClearCacheButton.this;
                    return drawable == clearCacheButton.valueTextView || drawable == clearCacheButton.textView || super.verifyDrawable(drawable);
                }
            };
            this.button = frameLayout;
            int i = Theme.key_featuredStickers_addButton;
            frameLayout.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{24.0f}, i));
            this.button.setImportantForAccessibility(1);
            ScaleStateListAnimator.apply(this.button, 0.02f, 1.2f);
            if (LocaleController.isRTL) {
                TextView textView = new TextView(context);
                this.rtlTextView = textView;
                textView.setText(LocaleController.getString(R.string.ClearCache));
                this.rtlTextView.setGravity(17);
                this.rtlTextView.setTextSize(1, 14.0f);
                this.rtlTextView.setTypeface(AndroidUtilities.bold());
                this.rtlTextView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
                this.button.addView(this.rtlTextView, LayoutHelper.createFrame(-2, -1, 17));
            }
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, true, true);
            this.textView = animatedTextDrawable;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            animatedTextDrawable.setAnimationProperties(0.25f, 0L, 300L, cubicBezierInterpolator);
            this.textView.setCallback(this.button);
            this.textView.setTextSize(AndroidUtilities.dp(14.0f));
            this.textView.setText(LocaleController.getString(R.string.ClearCache));
            this.textView.setGravity(5);
            this.textView.setTypeface(AndroidUtilities.bold());
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.textView;
            int i2 = Theme.key_featuredStickers_buttonText;
            animatedTextDrawable2.setTextColor(Theme.getColor(null, i2, false));
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable3 = new AnimatedTextView.AnimatedTextDrawable(true, true, true);
            this.valueTextView = animatedTextDrawable3;
            animatedTextDrawable3.setAnimationProperties(0.25f, 0L, 300L, cubicBezierInterpolator);
            this.valueTextView.setCallback(this.button);
            this.valueTextView.setTextSize(AndroidUtilities.dp(14.0f));
            this.valueTextView.setTypeface(AndroidUtilities.bold());
            this.valueTextView.setTextColor(Theme.blendOver(Theme.getColor(null, i, false), Theme.multAlpha(0.7f, Theme.getColor(null, i2, false))));
            this.valueTextView.setText("");
            this.button.setContentDescription(TextUtils.concat(this.textView.getText(), "\t", this.valueTextView.getText()));
            addView(this.button, LayoutHelper.createFrame(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        public void setDisabled(boolean z) {
            this.button.animate().cancel();
            this.button.animate().alpha(z ? 0.65f : 1.0f).start();
            this.button.setClickable(!z);
        }

        public void setSize(boolean z, long j) {
            this.textView.setText(z ? LocaleController.getString(R.string.ClearCache) : LocaleController.getString(R.string.ClearSelectedCache));
            this.valueTextView.setText(j <= 0 ? "" : AndroidUtilities.formatFileSize(j));
            setDisabled(j <= 0);
            this.button.invalidate();
            this.button.setContentDescription(TextUtils.concat(this.textView.getText(), "\t", this.valueTextView.getText()));
        }
    }

    public class ClearCacheButtonInternal extends ClearCacheButton {
        public ClearCacheButtonInternal(Context context) {
            super(context);
            ((ViewGroup.MarginLayoutParams) this.button.getLayoutParams()).topMargin = AndroidUtilities.dp(5.0f);
            this.button.setOnClickListener(new PollItemMenu$4$$ExternalSyntheticLambda0(this, 2));
        }

        private void doClearCache() {
            BottomSheet bottomSheet = new BottomSheet(getContext(), false) {
                @Override
                public boolean canDismissWithTouchOutside() {
                    return false;
                }

                @Override
                public void setLastVisible(boolean z) {
                }
            };
            bottomSheet.fixNavigationBar();
            bottomSheet.setCanDismissWithSwipe(false);
            bottomSheet.setCancelable(false);
            ClearingCacheView clearingCacheView = CacheControlActivity.this.new ClearingCacheView(getContext());
            bottomSheet.setCustomView(clearingCacheView);
            boolean[] zArr = {false};
            float[] fArr = {0.0f};
            boolean[] zArr2 = {false};
            ChatActivity$$ExternalSyntheticLambda5 chatActivity$$ExternalSyntheticLambda5 = new ChatActivity$$ExternalSyntheticLambda5(1, this, clearingCacheView, fArr, zArr2);
            long[] jArr = {-1};
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda5(2, this, zArr, jArr, bottomSheet), 150L);
            CacheControlActivity.this.cleanupFolders(new ChatActivity$$ExternalSyntheticLambda506(fArr, zArr2, chatActivity$$ExternalSyntheticLambda5, 1), new CacheControlActivity$ClearCacheButtonInternal$$ExternalSyntheticLambda0(zArr, clearingCacheView, jArr, bottomSheet, 1));
        }

        public void lambda$doClearCache$2(ClearingCacheView clearingCacheView, float[] fArr, boolean[] zArr) {
            clearingCacheView.setProgress(fArr[0]);
            if (zArr[0]) {
                CacheControlActivity.this.updateRows();
            }
        }

        public void lambda$doClearCache$3(boolean[] zArr, long[] jArr, BottomSheet bottomSheet) {
            if (zArr[0]) {
                return;
            }
            jArr[0] = System.currentTimeMillis();
            CacheControlActivity.this.showDialog(bottomSheet);
        }

        public static void lambda$doClearCache$4(float[] fArr, boolean[] zArr, Runnable runnable, Float f, Boolean bool) {
            fArr[0] = f.floatValue();
            zArr[0] = bool.booleanValue();
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(runnable);
        }

        public static void lambda$doClearCache$5(boolean[] zArr, ClearingCacheView clearingCacheView, long[] jArr, BottomSheet bottomSheet) {
            zArr[0] = true;
            clearingCacheView.setProgress(1.0f);
            if (jArr[0] <= 0) {
                bottomSheet.lambda$showGiftOfferSheet$15();
            } else {
                Objects.requireNonNull(bottomSheet);
                AndroidUtilities.runOnUIThread(new BottomSheet$$ExternalSyntheticLambda5(bottomSheet, 1), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
            }
        }

        public static void lambda$doClearCache$6(boolean[] zArr, ClearingCacheView clearingCacheView, long[] jArr, BottomSheet bottomSheet) {
            AndroidUtilities.runOnUIThread(new CacheControlActivity$ClearCacheButtonInternal$$ExternalSyntheticLambda0(zArr, clearingCacheView, jArr, bottomSheet, 0));
        }

        public void lambda$new$0(AlertDialog alertDialog, int i) {
            doClearCache();
        }

        public void lambda$new$1(View view) {
            String str;
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, null);
            StringBuilder sb = new StringBuilder();
            sb.append(LocaleController.getString(R.string.ClearCache));
            if (TextUtils.isEmpty(this.valueTextView.getText())) {
                str = "";
            } else {
                str = " (" + ((Object) this.valueTextView.getText()) + ")";
            }
            sb.append(str);
            AlertDialog alertDialogCreate = builder.setTitle(sb.toString()).setMessage(LocaleController.getString(R.string.StorageUsageInfo)).setPositiveButton(this.textView.getText(), new PhotoViewer$55$$ExternalSyntheticLambda2(this, 2)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
            CacheControlActivity.this.showDialog(alertDialogCreate);
            View button = alertDialogCreate.getButton(-1);
            if (button instanceof TextView) {
                int i = Theme.key_text_RedRegular;
                ((TextView) button).setTextColor(Theme.getColor(null, i, false));
                button.setBackground(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(6.0f), Theme.multAlpha(0.12f, Theme.getColor(null, i, false))));
            }
        }

        public void updateSize() {
            setSize(CacheControlActivity.this.isAllSectionsSelected(), (CacheControlActivity.this.selected[0] ? CacheControlActivity.this.photoSize : 0L) + (CacheControlActivity.this.selected[1] ? CacheControlActivity.this.videoSize : 0L) + (CacheControlActivity.this.selected[2] ? CacheControlActivity.this.documentsSize : 0L) + (CacheControlActivity.this.selected[3] ? CacheControlActivity.this.musicSize : 0L) + (CacheControlActivity.this.selected[4] ? CacheControlActivity.this.audioSize : 0L) + (CacheControlActivity.this.selected[5] ? CacheControlActivity.this.storiesSize : 0L) + (CacheControlActivity.this.selected[6] ? CacheControlActivity.this.stickersCacheSize : 0L) + (CacheControlActivity.this.selected[7] ? CacheControlActivity.this.cacheSize : 0L) + (CacheControlActivity.this.selected[8] ? CacheControlActivity.this.cacheTempSize : 0L) + (CacheControlActivity.this.selected[9] ? CacheControlActivity.this.logsSize : 0L));
        }
    }

    public class ClearingCacheView extends FrameLayout {
        RLottieImageView imageView;
        AnimatedTextView percentsTextView;
        ProgressView progressView;
        TextView subtitle;
        TextView title;

        public class ProgressView extends View {
            Paint in;
            Paint out;
            float progress;
            AnimatedFloat progressT;

            public ProgressView(Context context) {
                super(context);
                this.in = new Paint(1);
                this.out = new Paint(1);
                this.progressT = new AnimatedFloat(this, 350L, CubicBezierInterpolator.EASE_OUT);
                Paint paint = this.in;
                int i = Theme.key_switchTrackChecked;
                paint.setColor(Theme.getColor(null, i, false));
                this.out.setColor(Theme.multAlpha(0.2f, Theme.getColor(null, i, false)));
            }

            @Override
            public void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.out);
                rectF.set(0.0f, 0.0f, this.progressT.set(this.progress) * getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.in);
            }

            public void setProgress(float f) {
                this.progress = f;
                invalidate();
            }
        }

        public ClearingCacheView(Context context) {
            super(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            rLottieImageView.setAutoRepeat(true);
            this.imageView.setAnimation(R.raw.utyan_cache, 150, 150);
            addView(this.imageView, LayoutHelper.createFrame(150, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
            this.imageView.playAnimation();
            AnimatedTextView animatedTextView = new AnimatedTextView(context, false, true, true);
            this.percentsTextView = animatedTextView;
            animatedTextView.setAnimationProperties(0.35f, 0L, 120L, CubicBezierInterpolator.EASE_OUT);
            this.percentsTextView.setGravity(1);
            AnimatedTextView animatedTextView2 = this.percentsTextView;
            int i = Theme.key_dialogTextBlack;
            animatedTextView2.setTextColor(Theme.getColor(null, i, false));
            this.percentsTextView.setTextSize(AndroidUtilities.dp(24.0f));
            this.percentsTextView.setTypeface(AndroidUtilities.bold());
            addView(this.percentsTextView, LayoutHelper.createFrame(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
            ProgressView progressView = new ProgressView(context);
            this.progressView = progressView;
            addView(progressView, LayoutHelper.createFrame(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            this.title = textView;
            textView.setGravity(1);
            this.title.setTextColor(Theme.getColor(null, i, false));
            this.title.setTextSize(1, 16.0f);
            this.title.setTypeface(AndroidUtilities.bold());
            this.title.setText(LocaleController.getString(R.string.ClearingCache));
            addView(this.title, LayoutHelper.createFrame(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.subtitle = textView2;
            textView2.setGravity(1);
            this.subtitle.setTextColor(Theme.getColor(null, i, false));
            this.subtitle.setTextSize(1, 14.0f);
            this.subtitle.setText(LocaleController.getString(R.string.ClearingCacheDescription));
            addView(this.subtitle, LayoutHelper.createFrame(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
            setProgress(0.0f);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), 1073741824));
        }

        public void setProgress(float f) {
            this.percentsTextView.cancelAnimation();
            this.percentsTextView.setText(String.format("%d%%", Integer.valueOf((int) Math.ceil(MathUtils.clamp(f, 0.0f, 1.0f) * 100.0f))), true ^ LocaleController.isRTL);
            this.progressView.setProgress(f);
        }
    }

    public static class DialogFileEntities {
        public long dialogId;
        public final SparseArray<FileEntities> entitiesByType = new SparseArray<>();
        int filesCount;
        long totalSize;

        public DialogFileEntities(long j) {
            this.dialogId = j;
        }

        public void addFile(CacheModel.FileInfo fileInfo, int i) {
            FileEntities fileEntities = this.entitiesByType.get(i, null);
            if (fileEntities == null) {
                fileEntities = new FileEntities();
                this.entitiesByType.put(i, fileEntities);
            }
            fileEntities.count++;
            long j = fileInfo.size;
            fileEntities.totalSize += j;
            this.totalSize += j;
            this.filesCount++;
            fileEntities.files.add(fileInfo);
        }

        public CacheModel createCacheModel() {
            HashSet hashSet;
            CacheModel cacheModel = new CacheModel(true);
            FileEntities fileEntities = this.entitiesByType.get(0);
            ArrayList arrayList = cacheModel.media;
            if (fileEntities != null) {
                arrayList.addAll(this.entitiesByType.get(0).files);
            }
            if (this.entitiesByType.get(1) != null) {
                arrayList.addAll(this.entitiesByType.get(1).files);
            }
            FileEntities fileEntities2 = this.entitiesByType.get(2);
            ArrayList arrayList2 = cacheModel.documents;
            if (fileEntities2 != null) {
                arrayList2.addAll(this.entitiesByType.get(2).files);
            }
            FileEntities fileEntities3 = this.entitiesByType.get(3);
            ArrayList arrayList3 = cacheModel.music;
            if (fileEntities3 != null) {
                arrayList3.addAll(this.entitiesByType.get(3).files);
            }
            FileEntities fileEntities4 = this.entitiesByType.get(4);
            ArrayList arrayList4 = cacheModel.voice;
            if (fileEntities4 != null) {
                arrayList4.addAll(this.entitiesByType.get(4).files);
            }
            int i = 0;
            while (true) {
                int size = arrayList.size();
                hashSet = cacheModel.selectedFiles;
                if (i >= size) {
                    break;
                }
                hashSet.add((CacheModel.FileInfo) arrayList.get(i));
                if (((CacheModel.FileInfo) arrayList.get(i)).type == 0) {
                    cacheModel.photosSelectedSize += ((CacheModel.FileInfo) arrayList.get(i)).size;
                } else {
                    cacheModel.videosSelectedSize += ((CacheModel.FileInfo) arrayList.get(i)).size;
                }
                i++;
            }
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                hashSet.add((CacheModel.FileInfo) arrayList2.get(i2));
                cacheModel.documentsSelectedSize += ((CacheModel.FileInfo) arrayList2.get(i2)).size;
            }
            for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                hashSet.add((CacheModel.FileInfo) arrayList3.get(i3));
                cacheModel.musicSelectedSize += ((CacheModel.FileInfo) arrayList3.get(i3)).size;
            }
            for (int i4 = 0; i4 < arrayList4.size(); i4++) {
                hashSet.add((CacheModel.FileInfo) arrayList4.get(i4));
                cacheModel.voiceSelectedSize += ((CacheModel.FileInfo) arrayList4.get(i4)).size;
            }
            cacheModel.allPhotosSelected = true;
            cacheModel.allVideosSelected = true;
            cacheModel.allDocumentsSelected = true;
            cacheModel.allMusicSelected = true;
            cacheModel.allVoiceSelected = true;
            CacheModel.sort(arrayList);
            CacheModel.sort(arrayList2);
            CacheModel.sort(arrayList3);
            CacheModel.sort(arrayList4);
            CacheModel.sort(cacheModel.stories);
            return cacheModel;
        }

        public boolean isEmpty() {
            return this.totalSize <= 0;
        }

        public void merge(DialogFileEntities dialogFileEntities) {
            for (int i = 0; i < dialogFileEntities.entitiesByType.size(); i++) {
                int iKeyAt = dialogFileEntities.entitiesByType.keyAt(i);
                FileEntities fileEntitiesValueAt = dialogFileEntities.entitiesByType.valueAt(i);
                FileEntities fileEntities = this.entitiesByType.get(iKeyAt, null);
                if (fileEntities == null) {
                    fileEntities = new FileEntities();
                    this.entitiesByType.put(iKeyAt, fileEntities);
                }
                fileEntities.count += fileEntitiesValueAt.count;
                fileEntities.totalSize += fileEntitiesValueAt.totalSize;
                this.totalSize += fileEntitiesValueAt.totalSize;
                fileEntities.files.addAll(fileEntitiesValueAt.files);
            }
            this.filesCount += dialogFileEntities.filesCount;
        }

        public void removeFile(CacheModel.FileInfo fileInfo) {
            FileEntities fileEntities = this.entitiesByType.get(fileInfo.type, null);
            if (fileEntities != null && fileEntities.files.remove(fileInfo)) {
                fileEntities.count--;
                long j = fileEntities.totalSize;
                long j2 = fileInfo.size;
                fileEntities.totalSize = j - j2;
                this.totalSize -= j2;
                this.filesCount--;
            }
        }
    }

    public static class FileEntities {
        public int count;
        public ArrayList<CacheModel.FileInfo> files = new ArrayList<>();
        public long totalSize;
    }

    public static class ItemInner extends AdapterWithDiffUtils.Item {
        int colorKey;
        DialogFileEntities entities;
        int headerBottomMargin;
        CharSequence headerName;
        int headerTopMargin;
        public int index;
        int keepMediaType;
        boolean last;
        public boolean pad;
        public long size;
        String text;

        public static ItemInner asCheckBox(CharSequence charSequence, int i, long j, int i2) {
            return asCheckBox(charSequence, i, j, i2, false);
        }

        public static ItemInner asInfo(String str) {
            ItemInner itemInner = new ItemInner(1);
            itemInner.text = str;
            return itemInner;
        }

        public boolean equals(Object obj) {
            DialogFileEntities dialogFileEntities;
            DialogFileEntities dialogFileEntities2;
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                ItemInner itemInner = (ItemInner) obj;
                int i = this.viewType;
                if (i == itemInner.viewType) {
                    if (i != 9 && i != 10) {
                        if (i == 5 && (dialogFileEntities = this.entities) != null && (dialogFileEntities2 = itemInner.entities) != null) {
                            return dialogFileEntities.dialogId == dialogFileEntities2.dialogId;
                        }
                        if (i != 8 && i != 4 && i != 2 && i != 0 && i != 13) {
                            if (i == 3) {
                                return Objects.equals(this.headerName, itemInner.headerName);
                            }
                            if (i == 1) {
                                return Objects.equals(this.text, itemInner.text);
                            }
                            if (i == 11) {
                                return this.index == itemInner.index && this.size == itemInner.size;
                            }
                            return i == 7 && this.keepMediaType == itemInner.keepMediaType;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public ItemInner(int i, String str, DialogFileEntities dialogFileEntities) {
            super(i, true);
            this.headerTopMargin = 15;
            this.headerBottomMargin = 0;
            this.keepMediaType = -1;
            this.headerName = str;
            this.entities = dialogFileEntities;
        }

        public static ItemInner asCheckBox(CharSequence charSequence, int i, long j, int i2, boolean z) {
            ItemInner itemInner = new ItemInner(11);
            itemInner.index = i;
            itemInner.headerName = charSequence;
            itemInner.size = j;
            itemInner.colorKey = i2;
            itemInner.last = z;
            return itemInner;
        }

        public ItemInner(int i, int i2) {
            super(i, true);
            this.headerTopMargin = 15;
            this.headerBottomMargin = 0;
            this.keepMediaType = i2;
        }

        public ItemInner(int i, String str, int i2, int i3, DialogFileEntities dialogFileEntities) {
            super(i, true);
            this.keepMediaType = -1;
            this.headerName = str;
            this.headerTopMargin = i2;
            this.headerBottomMargin = i3;
            this.entities = dialogFileEntities;
        }

        private ItemInner(int i) {
            super(i, true);
            this.headerTopMargin = 15;
            this.headerBottomMargin = 0;
            this.keepMediaType = -1;
        }
    }

    public class ListAdapter extends AdapterWithDiffUtils {
        private Context mContext;

        public class AnonymousClass1 extends CacheChart {
            public AnonymousClass1(Context context) {
                super(context);
            }

            public static int lambda$onSectionDown$0(int i) {
                return i;
            }

            @Override
            public void onSectionClick(int i) {
            }

            @Override
            public void onSectionDown(int i, boolean z) {
                if (!z) {
                    CacheControlActivity.this.listView.removeHighlightRow();
                    return;
                }
                int i2 = -1;
                if (i == 8) {
                    i = -1;
                }
                for (int i3 = 0; i3 < CacheControlActivity.this.itemInners.size(); i3++) {
                    ItemInner itemInner = (ItemInner) CacheControlActivity.this.itemInners.get(i3);
                    if (itemInner != null && itemInner.viewType == 11 && itemInner.index == i) {
                        i2 = i3;
                        break;
                    }
                }
                if (i2 >= 0) {
                    CacheControlActivity.this.listView.highlightRow(new LogoutActivity$$ExternalSyntheticLambda1(i2, 1), 0);
                } else {
                    CacheControlActivity.this.listView.removeHighlightRow();
                }
            }
        }

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        public void lambda$onBindViewHolder$2(View view) {
            CacheControlActivity cacheControlActivity = CacheControlActivity.this;
            cacheControlActivity.collapsed = !cacheControlActivity.collapsed;
            CacheControlActivity.this.updateRows();
            CacheControlActivity.this.updateChart();
        }

        public void lambda$onBindViewHolder$3(CheckBoxCell checkBoxCell, View view) {
            CacheControlActivity.this.toggleOtherSelected(checkBoxCell);
        }

        public static void lambda$onCreateViewHolder$0(int i) {
            if (i == 0) {
                SharedConfig.setKeepMedia(3);
                return;
            }
            if (i == 1) {
                SharedConfig.setKeepMedia(0);
            } else if (i == 2) {
                SharedConfig.setKeepMedia(1);
            } else if (i == 3) {
                SharedConfig.setKeepMedia(2);
            }
        }

        public static void lambda$onCreateViewHolder$1(ArrayList arrayList, int i) {
            SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) arrayList.get(i)).intValue()).apply();
        }

        @Override
        public int getItemCount() {
            return CacheControlActivity.this.itemInners.size();
        }

        @Override
        public int getItemViewType(int i) {
            return ((ItemInner) CacheControlActivity.this.itemInners.get(i)).viewType;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getAdapterPosition() != CacheControlActivity.this.migrateOldFolderRow) {
                return (viewHolder.getItemViewType() == 2 && CacheControlActivity.this.totalSize > 0 && !CacheControlActivity.this.calculating) || viewHolder.getItemViewType() == 5 || viewHolder.getItemViewType() == 7 || viewHolder.getItemViewType() == 11;
            }
            return true;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = 3;
            int i3 = 2;
            ItemInner itemInner = (ItemInner) CacheControlActivity.this.itemInners.get(i);
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                if (i == CacheControlActivity.this.migrateOldFolderRow) {
                    textSettingsCell.setTextAndValue(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
                    return;
                }
                return;
            }
            if (itemViewType == 1) {
                ((TextInfoPrivacyCell) viewHolder.itemView).setText(AndroidUtilities.replaceTags(itemInner.text));
                return;
            }
            if (itemViewType == 2) {
                ((StorageUsageView) viewHolder.itemView).setStorageUsage(CacheControlActivity.this.calculating, CacheControlActivity.this.databaseSize, CacheControlActivity.this.totalSize, CacheControlActivity.this.totalDeviceFreeSize, CacheControlActivity.this.totalDeviceSize);
                return;
            }
            if (itemViewType == 3) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                headerCell.setText(((ItemInner) CacheControlActivity.this.itemInners.get(i)).headerName);
                headerCell.setTopMargin(((ItemInner) CacheControlActivity.this.itemInners.get(i)).headerTopMargin);
                headerCell.setBottomMargin(((ItemInner) CacheControlActivity.this.itemInners.get(i)).headerBottomMargin);
                return;
            }
            if (itemViewType == 7) {
                TextCell textCell = (TextCell) viewHolder.itemView;
                CacheByChatsController cacheByChatsController = CacheControlActivity.this.getMessagesController().getCacheByChatsController();
                int i4 = itemInner.keepMediaType;
                int size = cacheByChatsController.getKeepMediaExceptions(((ItemInner) CacheControlActivity.this.itemInners.get(i)).keepMediaType).size();
                String pluralString = size > 0 ? LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size)) : null;
                String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i4));
                if (((ItemInner) CacheControlActivity.this.itemInners.get(i)).keepMediaType == 0) {
                    textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                } else if (((ItemInner) CacheControlActivity.this.itemInners.get(i)).keepMediaType == 1) {
                    textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                } else if (((ItemInner) CacheControlActivity.this.itemInners.get(i)).keepMediaType == 2) {
                    textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                } else if (((ItemInner) CacheControlActivity.this.itemInners.get(i)).keepMediaType == 3) {
                    textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                }
                textCell.setSubtitle(pluralString);
                return;
            }
            switch (itemViewType) {
                case 9:
                    CacheControlActivity.this.updateChart();
                    break;
                case 10:
                    if (CacheControlActivity.this.cacheChartHeader != null && !CacheControlActivity.this.calculating) {
                        CacheChartHeader cacheChartHeader = CacheControlActivity.this.cacheChartHeader;
                        boolean z = CacheControlActivity.this.totalSize > 0;
                        float f = 0.0f;
                        float f2 = CacheControlActivity.this.totalDeviceSize <= 0 ? 0.0f : CacheControlActivity.this.totalSize / CacheControlActivity.this.totalDeviceSize;
                        if (CacheControlActivity.this.totalDeviceFreeSize > 0 && CacheControlActivity.this.totalDeviceSize > 0) {
                            f = (CacheControlActivity.this.totalDeviceSize - CacheControlActivity.this.totalDeviceFreeSize) / CacheControlActivity.this.totalDeviceSize;
                        }
                        cacheChartHeader.setData(z, f2, f);
                        break;
                    }
                    break;
                case 11:
                    CheckBoxCell checkBoxCell = (CheckBoxCell) viewHolder.itemView;
                    boolean zIsOtherSelected = itemInner.index < 0 ? CacheControlActivity.this.isOtherSelected() : CacheControlActivity.this.selected[itemInner.index];
                    CacheControlActivity cacheControlActivity = CacheControlActivity.this;
                    CharSequence charSequence = itemInner.headerName;
                    int[] iArr = cacheControlActivity.percents;
                    int i5 = itemInner.index;
                    checkBoxCell.setText(cacheControlActivity.getCheckBoxTitle(charSequence, iArr[i5 < 0 ? 9 : i5], i5 < 0), AndroidUtilities.formatFileSize(itemInner.size), zIsOtherSelected, itemInner.index >= 0 ? !itemInner.last : !CacheControlActivity.this.collapsed, false);
                    int i6 = itemInner.colorKey;
                    int i7 = Theme.key_checkboxCheck;
                    CheckBox2 checkBox2 = checkBoxCell.checkBoxRound;
                    if (checkBox2 != null) {
                        checkBox2.setColor(i6, i6, i7);
                    }
                    checkBoxCell.setCollapsed(itemInner.index < 0 ? Boolean.valueOf(CacheControlActivity.this.collapsed) : null);
                    if (itemInner.index == -1) {
                        checkBoxCell.setOnSectionsClickListener(new PollItemMenu$4$$ExternalSyntheticLambda0(this, i2), new ArticleViewer$$ExternalSyntheticLambda53(i3, this, checkBoxCell));
                    } else {
                        checkBoxCell.setOnSectionsClickListener(null, null);
                    }
                    checkBoxCell.setPad(itemInner.pad ? 1 : 0);
                    break;
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View checkBoxCell;
            View view;
            int i2 = 3;
            int i3 = 1;
            if (i != 0) {
                switch (i) {
                    case 2:
                        checkBoxCell = new StorageUsageView(this.mContext);
                        break;
                    case 3:
                        checkBoxCell = new HeaderCell(this.mContext);
                        break;
                    case 4:
                        SlideChooseView slideChooseView = new SlideChooseView(this.mContext);
                        slideChooseView.setCallback(new ChatActivity$$ExternalSyntheticLambda49(i3));
                        int i4 = SharedConfig.keepMedia;
                        slideChooseView.setOptions(i4 == 3 ? 0 : i4 + 1, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                        view = slideChooseView;
                        checkBoxCell = view;
                        break;
                    case 5:
                        checkBoxCell = new UserCell(CacheControlActivity.this.getContext(), CacheControlActivity.this.getResourceProvider());
                        break;
                    case 6:
                        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(CacheControlActivity.this.getContext());
                        flickerLoadingView.setIsSingleCell(true);
                        flickerLoadingView.setItemsCount(3);
                        flickerLoadingView.setIgnoreHeightCheck(true);
                        flickerLoadingView.setViewType(25);
                        view = flickerLoadingView;
                        checkBoxCell = view;
                        break;
                    case 7:
                        checkBoxCell = new TextCell(this.mContext);
                        break;
                    case 8:
                        CachedMediaLayout cachedMediaLayout = CacheControlActivity.this.cachedMediaLayout = new CachedMediaLayout(this.mContext, CacheControlActivity.this) {
                            @Override
                            public boolean actionModeIsVisible() {
                                return ((BaseFragment) CacheControlActivity.this).actionBar.isActionModeShowed();
                            }

                            @Override
                            public void onMeasure(int i5, int i6) {
                                super.onMeasure(i5, OKLCH.m(12.0f, View.MeasureSpec.getSize(i6) - (ActionBar.getCurrentActionBarHeight() / 2), 1073741824));
                            }

                            @Override
                            public void showActionMode(boolean z) {
                                if (!z) {
                                    ((BaseFragment) CacheControlActivity.this).actionBar.hideActionMode();
                                } else {
                                    CacheControlActivity.this.updateActionBar(true);
                                    ((BaseFragment) CacheControlActivity.this).actionBar.showActionMode();
                                }
                            }
                        };
                        CacheControlActivity.this.cachedMediaLayout.setDelegate(new CachedMediaLayout.Delegate() {
                            @Override
                            public void clear() {
                                CacheControlActivity.this.clearSelectedFiles();
                            }

                            @Override
                            public void clearSelection() {
                                CacheModel cacheModel = CacheControlActivity.this.cacheModel;
                                if (cacheModel == null || cacheModel.selectedFiles.size() <= 0) {
                                    return;
                                }
                                CacheModel cacheModel2 = CacheControlActivity.this.cacheModel;
                                cacheModel2.selectedSize = 0L;
                                cacheModel2.selectedFiles.clear();
                                cacheModel2.selectedDialogs.clear();
                                if (CacheControlActivity.this.cachedMediaLayout != null) {
                                    CacheControlActivity.this.cachedMediaLayout.showActionMode(false);
                                    CacheControlActivity.this.cachedMediaLayout.updateVisibleRows();
                                }
                            }

                            @Override
                            public final void dismiss() {
                                CachedMediaLayout.Delegate.CC.$default$dismiss(this);
                            }

                            @Override
                            public void onItemSelected(DialogFileEntities dialogFileEntities, CacheModel.FileInfo fileInfo, boolean z) {
                                if (dialogFileEntities == null) {
                                    if (fileInfo != null) {
                                        CacheControlActivity.this.cacheModel.toggleSelect(fileInfo);
                                        CacheControlActivity.this.cachedMediaLayout.updateVisibleRows();
                                        CacheControlActivity.this.updateActionMode();
                                        return;
                                    }
                                    return;
                                }
                                if (CacheControlActivity.this.cacheModel.selectedFiles.size() <= 0 && !z) {
                                    CacheControlActivity.this.showClearCacheDialog(dialogFileEntities);
                                    return;
                                }
                                CacheModel cacheModel = CacheControlActivity.this.cacheModel;
                                boolean zContains = cacheModel.selectedDialogs.contains(Long.valueOf(dialogFileEntities.dialogId));
                                HashSet hashSet = cacheModel.selectedFiles;
                                if (zContains) {
                                    for (int i5 = 0; i5 < dialogFileEntities.entitiesByType.size(); i5++) {
                                        ArrayList<CacheModel.FileInfo> arrayList = dialogFileEntities.entitiesByType.valueAt(i5).files;
                                        int size = arrayList.size();
                                        int i6 = 0;
                                        while (i6 < size) {
                                            CacheModel.FileInfo fileInfo2 = arrayList.get(i6);
                                            i6++;
                                            CacheModel.FileInfo fileInfo3 = fileInfo2;
                                            if (hashSet.remove(fileInfo3)) {
                                                cacheModel.selectedSize -= fileInfo3.size;
                                            }
                                        }
                                    }
                                } else {
                                    for (int i7 = 0; i7 < dialogFileEntities.entitiesByType.size(); i7++) {
                                        ArrayList<CacheModel.FileInfo> arrayList2 = dialogFileEntities.entitiesByType.valueAt(i7).files;
                                        int size2 = arrayList2.size();
                                        int i8 = 0;
                                        while (i8 < size2) {
                                            CacheModel.FileInfo fileInfo4 = arrayList2.get(i8);
                                            i8++;
                                            CacheModel.FileInfo fileInfo5 = fileInfo4;
                                            if (hashSet.add(fileInfo5)) {
                                                cacheModel.selectedSize += fileInfo5.size;
                                            }
                                        }
                                    }
                                }
                                cacheModel.checkSelectedDialogs();
                                CacheControlActivity.this.cachedMediaLayout.updateVisibleRows();
                                CacheControlActivity.this.updateActionMode();
                            }
                        });
                        CacheControlActivity.this.cachedMediaLayout.setCacheModel(CacheControlActivity.this.cacheModel);
                        CacheControlActivity.this.nestedSizeNotifierLayout.setChildLayout(CacheControlActivity.this.cachedMediaLayout, AndroidUtilities.dp(40.0f));
                        cachedMediaLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                        checkBoxCell = cachedMediaLayout;
                        break;
                    case 9:
                        CacheChart cacheChart = CacheControlActivity.this.cacheChart = new AnonymousClass1(this.mContext);
                        cacheChart.setTag(-33024);
                        checkBoxCell = cacheChart;
                        break;
                    case 10:
                        CacheChartHeader cacheChartHeader = CacheControlActivity.this.cacheChartHeader = CacheControlActivity.this.new CacheChartHeader(this.mContext);
                        cacheChartHeader.setTag(-33024);
                        checkBoxCell = cacheChartHeader;
                        break;
                    case 11:
                        checkBoxCell = new CheckBoxCell(this.mContext, 4, 21, false, CacheControlActivity.this.getResourceProvider());
                        break;
                    case 12:
                        FlickerLoadingView flickerLoadingView2 = new FlickerLoadingView(CacheControlActivity.this.getContext());
                        flickerLoadingView2.setIsSingleCell(true);
                        flickerLoadingView2.setItemsCount(1);
                        flickerLoadingView2.setIgnoreHeightCheck(true);
                        flickerLoadingView2.setViewType(26);
                        checkBoxCell = flickerLoadingView2;
                        break;
                    case 13:
                        checkBoxCell = CacheControlActivity.this.clearCacheButton = CacheControlActivity.this.new ClearCacheButtonInternal(this.mContext);
                        break;
                    case 14:
                        SlideChooseView slideChooseView2 = new SlideChooseView(this.mContext);
                        float f = ((int) ((CacheControlActivity.this.totalDeviceSize / 1024) / 1024)) / 1000.0f;
                        ArrayList arrayList = new ArrayList();
                        if (f <= 17.0f) {
                            arrayList.add(2);
                        }
                        if (f > 5.0f) {
                            arrayList.add(5);
                        }
                        if (f > 16.0f) {
                            arrayList.add(16);
                        }
                        if (f > 32.0f) {
                            arrayList.add(32);
                        }
                        arrayList.add(Integer.MAX_VALUE);
                        String[] strArr = new String[arrayList.size()];
                        for (int i5 = 0; i5 < arrayList.size(); i5++) {
                            if (((Integer) arrayList.get(i5)).intValue() == 1) {
                                strArr[i5] = "300 MB";
                            } else if (((Integer) arrayList.get(i5)).intValue() == Integer.MAX_VALUE) {
                                strArr[i5] = LocaleController.getString(R.string.NoLimit);
                            } else {
                                strArr[i5] = String.format("%d GB", arrayList.get(i5));
                            }
                        }
                        slideChooseView2.setCallback(new PhotoViewer$55$$ExternalSyntheticLambda2(arrayList, i2));
                        int iIndexOf = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", Integer.MAX_VALUE)));
                        if (iIndexOf < 0) {
                            iIndexOf = arrayList.size() - 1;
                        }
                        slideChooseView2.setOptions(iIndexOf, strArr);
                        view = slideChooseView2;
                        checkBoxCell = view;
                        break;
                    default:
                        checkBoxCell = new TextInfoPrivacyCell(this.mContext, 24, null);
                        break;
                }
            } else {
                checkBoxCell = new TextSettingsCell(this.mContext, null, 0);
            }
            return new RecyclerListView.Holder(checkBoxCell);
        }
    }

    public static class UserCell extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
        private boolean canDisable;
        protected CheckBox2 checkBox;
        public DialogFileEntities dialogFileEntities;
        private BackupImageView imageView;
        private boolean needDivider;
        private Theme.ResourcesProvider resourcesProvider;
        private TextView textView;
        private AnimatedTextView valueTextView;

        public UserCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setSingleLine();
            this.textView.setLines(1);
            this.textView.setMaxLines(1);
            this.textView.setTextSize(1, 16.0f);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            TextView textView2 = this.textView;
            boolean z = LocaleController.isRTL;
            addView(textView2, LayoutHelper.createFrame(-1, -1.0f, (z ? 5 : 3) | 48, z ? 21.0f : 72.0f, 0.0f, z ? 72.0f : 21.0f, 0.0f));
            AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, !LocaleController.isRTL);
            this.valueTextView = animatedTextView;
            animatedTextView.setAnimationProperties(0.55f, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.valueTextView.setTextSize(AndroidUtilities.dp(16.0f));
            this.valueTextView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
            this.valueTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteValueText, resourcesProvider));
            AnimatedTextView animatedTextView2 = this.valueTextView;
            boolean z2 = LocaleController.isRTL;
            addView(animatedTextView2, LayoutHelper.createFrame(-2, -1.0f, (z2 ? 3 : 5) | 48, z2 ? 21.0f : 72.0f, 0.0f, z2 ? 72.0f : 21.0f, 0.0f));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.getAvatarDrawable().setScaleSize(0.8f);
            addView(this.imageView, LayoutHelper.createFrame(38, 38.0f, (LocaleController.isRTL ? 5 : 3) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            TextView textView;
            if (i != NotificationCenter.emojiLoaded || (textView = this.textView) == null) {
                return;
            }
            textView.invalidate();
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (this.needDivider) {
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }

        public BackupImageView getImageView() {
            return this.imageView;
        }

        public TextView getTextView() {
            return this.textView;
        }

        public AnimatedTextView getValueTextView() {
            return this.valueTextView;
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            StringBuilder sb = new StringBuilder();
            sb.append((Object) this.textView.getText());
            AnimatedTextView animatedTextView = this.valueTextView;
            if (animatedTextView == null || animatedTextView.getVisibility() != 0) {
                str = "";
            } else {
                str = "\n" + ((Object) this.valueTextView.getText());
            }
            sb.append(str);
            accessibilityNodeInfo.setText(sb.toString());
            accessibilityNodeInfo.setEnabled(isEnabled());
        }

        @Override
        public void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(50.0f) + (this.needDivider ? 1 : 0));
            int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
            int i3 = measuredWidth / 2;
            if (this.imageView.getVisibility() == 0) {
                this.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(38.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(38.0f), 1073741824));
            }
            if (this.valueTextView.getVisibility() == 0) {
                this.valueTextView.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                measuredWidth = (measuredWidth - this.valueTextView.getMeasuredWidth()) - AndroidUtilities.dp(8.0f);
            }
            int iDp = AndroidUtilities.dp(12.0f) + this.valueTextView.getMeasuredWidth();
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) this.textView.getLayoutParams()).leftMargin = iDp;
            } else {
                ((ViewGroup.MarginLayoutParams) this.textView.getLayoutParams()).rightMargin = iDp;
            }
            this.textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - iDp, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            CheckBox2 checkBox2 = this.checkBox;
            if (checkBox2 != null) {
                checkBox2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
            }
        }

        public void setCanDisable(boolean z) {
            this.canDisable = z;
        }

        public void setChecked(boolean z, boolean z2) {
            CheckBox2 checkBox2 = this.checkBox;
            if (checkBox2 != null || z) {
                if (checkBox2 == null) {
                    CheckBox2 checkBox3 = new CheckBox2(getContext(), 21, this.resourcesProvider);
                    this.checkBox = checkBox3;
                    checkBox3.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
                    this.checkBox.setDrawUnchecked(false);
                    this.checkBox.setDrawBackgroundAsArc(3);
                    addView(this.checkBox, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 38.0f, 25.0f, 38.0f, 0.0f));
                }
                this.checkBox.setChecked(z, z2);
            }
        }

        public void setEnabled(boolean z, ArrayList<Animator> arrayList) {
            setEnabled(z);
            if (arrayList != null) {
                arrayList.add(ObjectAnimator.ofFloat(this.textView, "alpha", z ? 1.0f : 0.5f));
                if (this.valueTextView.getVisibility() == 0) {
                    arrayList.add(ObjectAnimator.ofFloat(this.valueTextView, "alpha", z ? 1.0f : 0.5f));
                    return;
                }
                return;
            }
            this.textView.setAlpha(z ? 1.0f : 0.5f);
            if (this.valueTextView.getVisibility() == 0) {
                this.valueTextView.setAlpha(z ? 1.0f : 0.5f);
            }
        }

        public void setText(CharSequence charSequence, boolean z) {
            this.textView.setText(Emoji.replaceEmoji(charSequence, this.textView.getPaint().getFontMetricsInt(), false));
            this.valueTextView.setVisibility(4);
            this.needDivider = z;
            setWillNotDraw(!z);
        }

        public void setTextAndValue(CharSequence charSequence, CharSequence charSequence2, boolean z) {
            setTextAndValue(charSequence, charSequence2, false, z);
        }

        public void setTextColor(int i) {
            this.textView.setTextColor(i);
        }

        public void setTextValueColor(int i) {
            this.valueTextView.setTextColor(i);
        }

        public void setTextAndValue(CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
            this.textView.setText(Emoji.replaceEmoji(charSequence, this.textView.getPaint().getFontMetricsInt(), false));
            if (charSequence2 != null) {
                this.valueTextView.setText(charSequence2, z);
                this.valueTextView.setVisibility(0);
            } else {
                this.valueTextView.setVisibility(4);
            }
            this.needDivider = z2;
            setWillNotDraw(!z2);
            requestLayout();
        }

        @Override
        public void setEnabled(boolean z) {
            super.setEnabled(z);
            float f = 1.0f;
            this.textView.setAlpha((z || !this.canDisable) ? 1.0f : 0.5f);
            if (this.valueTextView.getVisibility() == 0) {
                AnimatedTextView animatedTextView = this.valueTextView;
                if (!z && this.canDisable) {
                    f = 0.5f;
                }
                animatedTextView.setAlpha(f);
            }
        }
    }

    public CacheControlActivity() {
        super(null);
        this.selected = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.databaseSize = -1L;
        this.cacheSize = -1L;
        this.cacheEmojiSize = -1L;
        this.cacheTempSize = -1L;
        this.documentsSize = -1L;
        this.audioSize = -1L;
        this.storiesSize = -1L;
        this.musicSize = -1L;
        this.photoSize = -1L;
        this.videoSize = -1L;
        this.logsSize = -1L;
        this.stickersCacheSize = -1L;
        this.totalSize = -1L;
        this.totalDeviceSize = -1L;
        this.totalDeviceFreeSize = -1L;
        this.migrateOldFolderRow = -1L;
        this.calculating = true;
        this.collapsed = true;
        this.sectionsStartRow = -1;
        this.sectionsEndRow = -1;
        this.oldItems = new ArrayList<>();
        this.itemInners = new ArrayList<>();
        this.actionBarShadowAlpha = 1.0f;
    }

    public static float access$516(CacheControlActivity cacheControlActivity, float f) {
        float f2 = cacheControlActivity.actionBarShadowAlpha + f;
        cacheControlActivity.actionBarShadowAlpha = f2;
        return f2;
    }

    public static float access$524(CacheControlActivity cacheControlActivity, float f) {
        float f2 = cacheControlActivity.actionBarShadowAlpha - f;
        cacheControlActivity.actionBarShadowAlpha = f2;
        return f2;
    }

    public static void calculateTotalSize(Utilities.Callback<Long> callback) {
        if (callback == null) {
            return;
        }
        Long l = lastTotalSizeCalculated;
        if (l != null) {
            callback.run(l);
            if (System.currentTimeMillis() - lastTotalSizeCalculatedTime < 5000) {
                return;
            }
        }
        Utilities.cacheClearQueue.postRunnable(new CacheControlActivity$$ExternalSyntheticLambda11(0, callback));
    }

    public static void cleanDirJava(String str, int i, int[] iArr, Utilities.Callback<Float> callback) {
        File[] fileArrListFiles;
        int i2;
        int iCountDirJava = countDirJava(str, i);
        if (iArr == null) {
            iArr = new int[]{0};
        }
        File file = new File(str);
        if (!file.exists() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            String name = file2.getName();
            if (!".".equals(name)) {
                if (i > 0 && name.length() >= 4) {
                    String lowerCase = name.toLowerCase();
                    boolean z = lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a");
                    boolean z2 = lowerCase.endsWith(".tgs") || lowerCase.endsWith(".webm");
                    boolean z3 = lowerCase.endsWith(".tmp") || lowerCase.endsWith(".temp") || lowerCase.endsWith(".preload");
                    if ((!z || i != LISTDIR_DOCTYPE_OTHER_THAN_MUSIC) && ((z || i != LISTDIR_DOCTYPE_MUSIC) && ((!z2 || i != LISTDIR_DOCTYPE2_OTHER) && ((z2 || i != LISTDIR_DOCTYPE2_EMOJI) && ((!z3 || i != LISTDIR_DOCTYPE2_OTHER) && (z3 || i != LISTDIR_DOCTYPE2_TEMP)))))) {
                        if (file2.isDirectory()) {
                            file2.delete();
                            i2 = iArr[0] + 1;
                            iArr[0] = i2;
                            if (callback != null) {
                                callback.run(Float.valueOf(i2 / iCountDirJava));
                            }
                        } else if ("drafts".equals(file2.getName())) {
                            cleanDirJava(zziq.m(str, "/", name), i, iArr, callback);
                        }
                    }
                } else if (file2.isDirectory()) {
                    file2.delete();
                    i2 = iArr[0] + 1;
                    iArr[0] = i2;
                    if (callback != null) {
                        callback.run(Float.valueOf(i2 / iCountDirJava));
                    }
                } else if ("drafts".equals(file2.getName())) {
                    cleanDirJava(zziq.m(str, "/", name), i, iArr, callback);
                }
            }
        }
    }

    public void cleanupDialogFiles(DialogFileEntities dialogFileEntities, StorageDiagramView.ClearViewData[] clearViewDataArr, CacheModel cacheModel) {
        FileEntities fileEntities;
        int i;
        StorageDiagramView.ClearViewData clearViewData;
        AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3, null);
        alertDialog.canCacnel = false;
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 500L);
        HashSet<CacheModel.FileInfo> hashSet = new HashSet();
        long j = this.totalSize;
        for (int i2 = 0; i2 < 8; i2++) {
            if ((clearViewDataArr == null || ((clearViewData = clearViewDataArr[i2]) != null && clearViewData.clear)) && (fileEntities = dialogFileEntities.entitiesByType.get(i2)) != null) {
                hashSet.addAll(fileEntities.files);
                long j2 = dialogFileEntities.totalSize;
                long j3 = fileEntities.totalSize;
                dialogFileEntities.totalSize = j2 - j3;
                this.totalSize -= j3;
                this.totalDeviceFreeSize += j3;
                dialogFileEntities.entitiesByType.delete(i2);
                if (i2 == 0) {
                    this.photoSize -= fileEntities.totalSize;
                } else if (i2 == 1) {
                    this.videoSize -= fileEntities.totalSize;
                } else if (i2 == 2) {
                    this.documentsSize -= fileEntities.totalSize;
                } else if (i2 == 3) {
                    this.musicSize -= fileEntities.totalSize;
                } else if (i2 == 4) {
                    this.audioSize -= fileEntities.totalSize;
                } else if (i2 == 5) {
                    this.stickersCacheSize -= fileEntities.totalSize;
                } else {
                    int i3 = 7;
                    if (i2 == 7) {
                        int i4 = 0;
                        while (i4 < fileEntities.files.size()) {
                            CacheModel.FileInfo fileInfo = fileEntities.files.get(i4);
                            int typeByPath = getTypeByPath(fileEntities.files.get(i4).file.getAbsolutePath());
                            if (typeByPath == i3) {
                                i = i4;
                                this.storiesSize -= fileInfo.size;
                            } else {
                                i = i4;
                                if (typeByPath == 0) {
                                    this.photoSize -= fileInfo.size;
                                } else if (typeByPath == 1) {
                                    this.videoSize -= fileInfo.size;
                                } else {
                                    this.cacheSize -= fileInfo.size;
                                }
                            }
                            i4 = i + 1;
                            i3 = 7;
                        }
                    } else {
                        this.cacheSize -= fileEntities.totalSize;
                    }
                }
            }
        }
        if (dialogFileEntities.entitiesByType.size() == 0) {
            this.cacheModel.entities.remove(dialogFileEntities);
        }
        updateRows();
        if (cacheModel != null) {
            for (CacheModel.FileInfo fileInfo2 : cacheModel.selectedFiles) {
                if (!hashSet.contains(fileInfo2)) {
                    long j4 = this.totalSize;
                    long j5 = fileInfo2.size;
                    this.totalSize = j4 - j5;
                    this.totalDeviceFreeSize += j5;
                    hashSet.add(fileInfo2);
                    dialogFileEntities.removeFile(fileInfo2);
                    int i5 = fileInfo2.type;
                    if (i5 == 0) {
                        this.photoSize -= fileInfo2.size;
                    } else if (i5 == 1) {
                        this.videoSize -= fileInfo2.size;
                    } else if (i5 == 2) {
                        this.documentsSize -= fileInfo2.size;
                    } else if (i5 == 3) {
                        this.musicSize -= fileInfo2.size;
                    } else if (i5 == 4) {
                        this.audioSize -= fileInfo2.size;
                    }
                }
            }
        }
        for (CacheModel.FileInfo fileInfo3 : hashSet) {
            CacheModel cacheModel2 = this.cacheModel;
            if (cacheModel2.selectedFiles.remove(fileInfo3)) {
                cacheModel2.selectedSize -= fileInfo3.size;
            }
            ArrayList listByType = cacheModel2.getListByType(fileInfo3.type);
            if (listByType != null) {
                listByType.remove(fileInfo3);
            }
        }
        Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(this).createSimpleBulletin(R.raw.ic_delete, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j - this.totalSize)));
        bulletinCreateSimpleBulletin.hideAfterBottomSheet = false;
        bulletinCreateSimpleBulletin.show();
        ArrayList arrayList = new ArrayList(hashSet);
        getFileLoader().getFileDatabase().removeFiles(arrayList);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new PhotoViewer$86$$ExternalSyntheticLambda0(this, arrayList, alertDialog, 24));
    }

    public void cleanupFolders(Utilities.Callback2<Float, Boolean> callback2, Runnable runnable) {
        CacheModel cacheModel = this.cacheModel;
        if (cacheModel != null) {
            cacheModel.selectedSize = 0L;
            cacheModel.selectedFiles.clear();
            cacheModel.selectedDialogs.clear();
        }
        CachedMediaLayout cachedMediaLayout = this.cachedMediaLayout;
        if (cachedMediaLayout != null) {
            cachedMediaLayout.updateVisibleRows();
            this.cachedMediaLayout.showActionMode(false);
        }
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new CacheControlActivity$$ExternalSyntheticLambda2(this, callback2, runnable, 0));
        setCacheModel(null);
        this.loadingDialogs = true;
    }

    public void lambda$cleanupFolders$11(final Utilities.Callback2<Float, Boolean> callback2, Runnable runnable) {
        int i;
        int i2;
        File fileCheckDirectory;
        int i3;
        File fileCheckDirectory2;
        File fileCheckDirectory3;
        File fileCheckDirectory4;
        int i4 = 1;
        final int[] iArr = {0};
        boolean[] zArr = this.selected;
        int i5 = 2;
        int i6 = 3;
        int i7 = 4;
        int i8 = 5;
        final int i9 = (zArr[0] ? 2 : 0) + (zArr[1] ? 2 : 0) + (zArr[2] ? 2 : 0) + (zArr[3] ? 2 : 0) + (zArr[4] ? 1 : 0) + (zArr[5] ? 2 : 0) + (zArr[6] ? 1 : 0) + (zArr[7] ? 1 : 0) + (zArr[8] ? 1 : 0) + (zArr[9] ? 1 : 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Utilities.Callback callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                int[] iArr2 = iArr;
                CacheControlActivity.lambda$cleanupFoldersInternal$13(callback2, iArr2, i9, (Float) obj);
            }
        };
        long j = 0;
        int i10 = 0;
        boolean z = true;
        boolean z2 = false;
        while (i10 < 10) {
            if (this.selected[i10]) {
                if (i10 == 0) {
                    j += this.photoSize;
                    i = 0;
                } else if (i10 == i4) {
                    j += this.videoSize;
                    i = 2;
                } else {
                    if (i10 == i5) {
                        j += this.documentsSize;
                        i = 3;
                    } else {
                        if (i10 == i6) {
                            j += this.musicSize;
                            i = 3;
                            i2 = 2;
                        } else if (i10 == i7) {
                            j += this.audioSize;
                            i = 1;
                        } else if (i10 == i8) {
                            j += this.storiesSize;
                            i = 6;
                        } else if (i10 == 6) {
                            j += this.stickersCacheSize;
                            i = 100;
                        } else if (i10 == 7) {
                            j += this.cacheSize;
                            i = 4;
                            i2 = 5;
                        } else if (i10 == 8) {
                            j += this.cacheTempSize;
                            i = 4;
                            i2 = 4;
                        } else if (i10 == 9) {
                            j += this.logsSize;
                            i = 0;
                        } else {
                            i = -1;
                        }
                        if (i != -1) {
                            if (i10 == 7) {
                                try {
                                    cleanDirJava(ApplicationLoader.getFilesDirFixed("rasterized/wallpaper").getAbsolutePath(), 0, null, null);
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            if (i10 == 9) {
                                fileCheckDirectory = AndroidUtilities.getLogsDir();
                            } else if (i == 100) {
                                fileCheckDirectory = new File(FileLoader.checkDirectory(4), "acache");
                            } else {
                                fileCheckDirectory = FileLoader.checkDirectory(i);
                            }
                            if (fileCheckDirectory != null) {
                                cleanDirJava(fileCheckDirectory.getAbsolutePath(), i2, null, callback);
                            }
                            iArr[0] = iArr[0] + 1;
                            lambda$cleanupFoldersInternal$14(callback2, iArr, i9, jCurrentTimeMillis);
                            if (i == 100) {
                                fileCheckDirectory4 = FileLoader.checkDirectory(4);
                                if (fileCheckDirectory4 != null) {
                                    cleanDirJava(fileCheckDirectory4.getAbsolutePath(), i6, null, callback);
                                }
                                iArr[0] = iArr[0] + 1;
                                lambda$cleanupFoldersInternal$14(callback2, iArr, i9, jCurrentTimeMillis);
                            }
                            if (i != 0 || i == i5) {
                                if (i == 0) {
                                    i3 = 100;
                                } else {
                                    i3 = 101;
                                }
                                fileCheckDirectory2 = FileLoader.checkDirectory(i3);
                                if (fileCheckDirectory2 != null) {
                                    cleanDirJava(fileCheckDirectory2.getAbsolutePath(), i2, null, callback);
                                }
                                iArr[0] = iArr[0] + 1;
                                lambda$cleanupFoldersInternal$14(callback2, iArr, i9, jCurrentTimeMillis);
                            }
                            if (i == i6) {
                                fileCheckDirectory3 = FileLoader.checkDirectory(5);
                                if (fileCheckDirectory3 != null) {
                                    cleanDirJava(fileCheckDirectory3.getAbsolutePath(), i2, null, callback);
                                }
                                iArr[0] = iArr[0] + 1;
                                lambda$cleanupFoldersInternal$14(callback2, iArr, i9, jCurrentTimeMillis);
                            }
                            if (i10 == 9) {
                                this.logsSize = getDirectorySize(AndroidUtilities.getLogsDir(), 1);
                                iArr = iArr;
                            } else if (i == 4) {
                                this.cacheSize = getDirectorySize(FileLoader.checkDirectory(4), 5);
                                this.cacheTempSize = getDirectorySize(FileLoader.checkDirectory(4), 4);
                                iArr = iArr;
                                i5 = 2;
                                i6 = 3;
                                z2 = true;
                            } else {
                                if (i == 1) {
                                    this.audioSize = getDirectorySize(FileLoader.checkDirectory(1), i2);
                                } else if (i == 6) {
                                    this.storiesSize = getDirectorySize(FileLoader.checkDirectory(6), i2);
                                } else if (i == 3) {
                                    if (i2 == 1) {
                                        long directorySize = getDirectorySize(FileLoader.checkDirectory(3), i2);
                                        this.documentsSize = directorySize;
                                        this.documentsSize = directorySize + getDirectorySize(FileLoader.checkDirectory(5), i2);
                                    } else {
                                        long directorySize2 = getDirectorySize(FileLoader.checkDirectory(3), i2);
                                        this.musicSize = directorySize2;
                                        this.musicSize = directorySize2 + getDirectorySize(FileLoader.checkDirectory(5), i2);
                                    }
                                    iArr = iArr;
                                    i5 = 2;
                                    i6 = 3;
                                } else if (i == 0) {
                                    long directorySize3 = getDirectorySize(FileLoader.checkDirectory(0), i2);
                                    this.photoSize = directorySize3;
                                    this.photoSize = directorySize3 + getDirectorySize(FileLoader.checkDirectory(100), i2);
                                    iArr = iArr;
                                    i5 = 2;
                                    i6 = 3;
                                    z2 = true;
                                } else {
                                    i5 = 2;
                                    if (i == 2) {
                                        long directorySize4 = getDirectorySize(FileLoader.checkDirectory(2), i2);
                                        this.videoSize = directorySize4;
                                        this.videoSize = directorySize4 + getDirectorySize(FileLoader.checkDirectory(101), i2);
                                    } else if (i == 100) {
                                        this.stickersCacheSize = getDirectorySize(new File(FileLoader.checkDirectory(4), "acache"), i2);
                                        i6 = 3;
                                        long directorySize5 = getDirectorySize(FileLoader.checkDirectory(4), 3);
                                        this.cacheEmojiSize = directorySize5;
                                        iArr = iArr;
                                        this.stickersCacheSize += directorySize5;
                                        z2 = true;
                                    }
                                    iArr = iArr;
                                    i6 = 3;
                                }
                                i5 = 2;
                                i6 = 3;
                            }
                            i10++;
                            iArr = iArr;
                            i4 = 1;
                            i7 = 4;
                            i8 = 5;
                        }
                    }
                    i2 = 1;
                    if (i != -1) {
                        if (i10 == 7) {
                            cleanDirJava(ApplicationLoader.getFilesDirFixed("rasterized/wallpaper").getAbsolutePath(), 0, null, null);
                        }
                        if (i10 == 9) {
                            fileCheckDirectory = AndroidUtilities.getLogsDir();
                        } else if (i == 100) {
                            fileCheckDirectory = new File(FileLoader.checkDirectory(4), "acache");
                        } else {
                            fileCheckDirectory = FileLoader.checkDirectory(i);
                        }
                        if (fileCheckDirectory != null) {
                            cleanDirJava(fileCheckDirectory.getAbsolutePath(), i2, null, callback);
                        }
                        iArr[0] = iArr[0] + 1;
                        lambda$cleanupFoldersInternal$14(callback2, iArr, i9, jCurrentTimeMillis);
                        if (i == 100) {
                            fileCheckDirectory4 = FileLoader.checkDirectory(4);
                            if (fileCheckDirectory4 != null) {
                                cleanDirJava(fileCheckDirectory4.getAbsolutePath(), i6, null, callback);
                            }
                            iArr[0] = iArr[0] + 1;
                            lambda$cleanupFoldersInternal$14(callback2, iArr, i9, jCurrentTimeMillis);
                        }
                        if (i != 0) {
                            if (i == 0) {
                                i3 = 100;
                            } else {
                                i3 = 101;
                            }
                            fileCheckDirectory2 = FileLoader.checkDirectory(i3);
                            if (fileCheckDirectory2 != null) {
                                cleanDirJava(fileCheckDirectory2.getAbsolutePath(), i2, null, callback);
                            }
                            iArr[0] = iArr[0] + 1;
                            lambda$cleanupFoldersInternal$14(callback2, iArr, i9, jCurrentTimeMillis);
                        } else {
                            if (i == 0) {
                                i3 = 100;
                            } else {
                                i3 = 101;
                            }
                            fileCheckDirectory2 = FileLoader.checkDirectory(i3);
                            if (fileCheckDirectory2 != null) {
                                cleanDirJava(fileCheckDirectory2.getAbsolutePath(), i2, null, callback);
                            }
                            iArr[0] = iArr[0] + 1;
                            lambda$cleanupFoldersInternal$14(callback2, iArr, i9, jCurrentTimeMillis);
                        }
                        if (i == i6) {
                            fileCheckDirectory3 = FileLoader.checkDirectory(5);
                            if (fileCheckDirectory3 != null) {
                                cleanDirJava(fileCheckDirectory3.getAbsolutePath(), i2, null, callback);
                            }
                            iArr[0] = iArr[0] + 1;
                            lambda$cleanupFoldersInternal$14(callback2, iArr, i9, jCurrentTimeMillis);
                        }
                        if (i10 == 9) {
                            this.logsSize = getDirectorySize(AndroidUtilities.getLogsDir(), 1);
                            iArr = iArr;
                        } else if (i == 4) {
                            this.cacheSize = getDirectorySize(FileLoader.checkDirectory(4), 5);
                            this.cacheTempSize = getDirectorySize(FileLoader.checkDirectory(4), 4);
                            iArr = iArr;
                            i5 = 2;
                            i6 = 3;
                            z2 = true;
                        } else {
                            if (i == 1) {
                                this.audioSize = getDirectorySize(FileLoader.checkDirectory(1), i2);
                            } else if (i == 6) {
                                this.storiesSize = getDirectorySize(FileLoader.checkDirectory(6), i2);
                            } else if (i == 3) {
                                if (i2 == 1) {
                                    long directorySize6 = getDirectorySize(FileLoader.checkDirectory(3), i2);
                                    this.documentsSize = directorySize6;
                                    this.documentsSize = directorySize6 + getDirectorySize(FileLoader.checkDirectory(5), i2);
                                } else {
                                    long directorySize7 = getDirectorySize(FileLoader.checkDirectory(3), i2);
                                    this.musicSize = directorySize7;
                                    this.musicSize = directorySize7 + getDirectorySize(FileLoader.checkDirectory(5), i2);
                                }
                                iArr = iArr;
                                i5 = 2;
                                i6 = 3;
                            } else if (i == 0) {
                                long directorySize8 = getDirectorySize(FileLoader.checkDirectory(0), i2);
                                this.photoSize = directorySize8;
                                this.photoSize = directorySize8 + getDirectorySize(FileLoader.checkDirectory(100), i2);
                                iArr = iArr;
                                i5 = 2;
                                i6 = 3;
                                z2 = true;
                            } else {
                                i5 = 2;
                                if (i == 2) {
                                    long directorySize9 = getDirectorySize(FileLoader.checkDirectory(2), i2);
                                    this.videoSize = directorySize9;
                                    this.videoSize = directorySize9 + getDirectorySize(FileLoader.checkDirectory(101), i2);
                                } else if (i == 100) {
                                    this.stickersCacheSize = getDirectorySize(new File(FileLoader.checkDirectory(4), "acache"), i2);
                                    i6 = 3;
                                    long directorySize10 = getDirectorySize(FileLoader.checkDirectory(4), 3);
                                    this.cacheEmojiSize = directorySize10;
                                    iArr = iArr;
                                    this.stickersCacheSize += directorySize10;
                                    z2 = true;
                                }
                                iArr = iArr;
                                i6 = 3;
                            }
                            i5 = 2;
                            i6 = 3;
                        }
                        i10++;
                        iArr = iArr;
                        i4 = 1;
                        i7 = 4;
                        i8 = 5;
                    }
                }
                i2 = 0;
                if (i != -1) {
                    if (i10 == 7) {
                        cleanDirJava(ApplicationLoader.getFilesDirFixed("rasterized/wallpaper").getAbsolutePath(), 0, null, null);
                    }
                    if (i10 == 9) {
                        fileCheckDirectory = AndroidUtilities.getLogsDir();
                    } else if (i == 100) {
                        fileCheckDirectory = new File(FileLoader.checkDirectory(4), "acache");
                    } else {
                        fileCheckDirectory = FileLoader.checkDirectory(i);
                    }
                    if (fileCheckDirectory != null) {
                        cleanDirJava(fileCheckDirectory.getAbsolutePath(), i2, null, callback);
                    }
                    iArr[0] = iArr[0] + 1;
                    lambda$cleanupFoldersInternal$14(callback2, iArr, i9, jCurrentTimeMillis);
                    if (i == 100) {
                        fileCheckDirectory4 = FileLoader.checkDirectory(4);
                        if (fileCheckDirectory4 != null) {
                            cleanDirJava(fileCheckDirectory4.getAbsolutePath(), i6, null, callback);
                        }
                        iArr[0] = iArr[0] + 1;
                        lambda$cleanupFoldersInternal$14(callback2, iArr, i9, jCurrentTimeMillis);
                    }
                    if (i != 0) {
                        if (i == 0) {
                            i3 = 100;
                        } else {
                            i3 = 101;
                        }
                        fileCheckDirectory2 = FileLoader.checkDirectory(i3);
                        if (fileCheckDirectory2 != null) {
                            cleanDirJava(fileCheckDirectory2.getAbsolutePath(), i2, null, callback);
                        }
                        iArr[0] = iArr[0] + 1;
                        lambda$cleanupFoldersInternal$14(callback2, iArr, i9, jCurrentTimeMillis);
                    } else {
                        if (i == 0) {
                            i3 = 100;
                        } else {
                            i3 = 101;
                        }
                        fileCheckDirectory2 = FileLoader.checkDirectory(i3);
                        if (fileCheckDirectory2 != null) {
                            cleanDirJava(fileCheckDirectory2.getAbsolutePath(), i2, null, callback);
                        }
                        iArr[0] = iArr[0] + 1;
                        lambda$cleanupFoldersInternal$14(callback2, iArr, i9, jCurrentTimeMillis);
                    }
                    if (i == i6) {
                        fileCheckDirectory3 = FileLoader.checkDirectory(5);
                        if (fileCheckDirectory3 != null) {
                            cleanDirJava(fileCheckDirectory3.getAbsolutePath(), i2, null, callback);
                        }
                        iArr[0] = iArr[0] + 1;
                        lambda$cleanupFoldersInternal$14(callback2, iArr, i9, jCurrentTimeMillis);
                    }
                    if (i10 == 9) {
                        this.logsSize = getDirectorySize(AndroidUtilities.getLogsDir(), 1);
                        iArr = iArr;
                    } else if (i == 4) {
                        this.cacheSize = getDirectorySize(FileLoader.checkDirectory(4), 5);
                        this.cacheTempSize = getDirectorySize(FileLoader.checkDirectory(4), 4);
                        iArr = iArr;
                        i5 = 2;
                        i6 = 3;
                        z2 = true;
                    } else {
                        if (i == 1) {
                            this.audioSize = getDirectorySize(FileLoader.checkDirectory(1), i2);
                        } else if (i == 6) {
                            this.storiesSize = getDirectorySize(FileLoader.checkDirectory(6), i2);
                        } else if (i == 3) {
                            if (i2 == 1) {
                                long directorySize11 = getDirectorySize(FileLoader.checkDirectory(3), i2);
                                this.documentsSize = directorySize11;
                                this.documentsSize = directorySize11 + getDirectorySize(FileLoader.checkDirectory(5), i2);
                            } else {
                                long directorySize12 = getDirectorySize(FileLoader.checkDirectory(3), i2);
                                this.musicSize = directorySize12;
                                this.musicSize = directorySize12 + getDirectorySize(FileLoader.checkDirectory(5), i2);
                            }
                            iArr = iArr;
                            i5 = 2;
                            i6 = 3;
                        } else if (i == 0) {
                            long directorySize13 = getDirectorySize(FileLoader.checkDirectory(0), i2);
                            this.photoSize = directorySize13;
                            this.photoSize = directorySize13 + getDirectorySize(FileLoader.checkDirectory(100), i2);
                            iArr = iArr;
                            i5 = 2;
                            i6 = 3;
                            z2 = true;
                        } else {
                            i5 = 2;
                            if (i == 2) {
                                long directorySize14 = getDirectorySize(FileLoader.checkDirectory(2), i2);
                                this.videoSize = directorySize14;
                                this.videoSize = directorySize14 + getDirectorySize(FileLoader.checkDirectory(101), i2);
                            } else if (i == 100) {
                                this.stickersCacheSize = getDirectorySize(new File(FileLoader.checkDirectory(4), "acache"), i2);
                                i6 = 3;
                                long directorySize15 = getDirectorySize(FileLoader.checkDirectory(4), 3);
                                this.cacheEmojiSize = directorySize15;
                                iArr = iArr;
                                this.stickersCacheSize += directorySize15;
                                z2 = true;
                            }
                            iArr = iArr;
                            i6 = 3;
                        }
                        i5 = 2;
                        i6 = 3;
                    }
                    i10++;
                    iArr = iArr;
                    i4 = 1;
                    i7 = 4;
                    i8 = 5;
                }
            } else {
                iArr = iArr;
                z = false;
            }
            i10++;
            iArr = iArr;
            i4 = 1;
            i7 = 4;
            i8 = 5;
        }
        long j2 = this.cacheSize + this.cacheTempSize + this.logsSize + this.videoSize + this.audioSize + this.photoSize + this.documentsSize + this.musicSize + this.stickersCacheSize + this.storiesSize;
        lastTotalSizeCalculated = Long.valueOf(j2);
        this.totalSize = j2;
        lastTotalSizeCalculatedTime = System.currentTimeMillis();
        Arrays.fill(this.selected, true);
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong();
        this.totalDeviceSize = statFs.getBlockCountLong() * blockSizeLong;
        this.totalDeviceFreeSize = availableBlocksLong * blockSizeLong;
        if (z) {
            FileLoader.getInstance(this.currentAccount).clearFilePaths();
        }
        FileLoader.getInstance(this.currentAccount).checkCurrentDownloadsFiles();
        AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda138(this, z2, j, runnable, 9));
    }

    public void clearDatabase(boolean z) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setTitle(LocaleController.getString(R.string.LocalDatabaseClearTextTitle));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LocalDatabaseClearText));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("LocalDatabaseClearText2", R.string.LocalDatabaseClearText2, AndroidUtilities.formatFileSize(this.databaseSize))));
        builder.setMessage(spannableStringBuilder);
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.CacheClear), new ChatActivity$$ExternalSyntheticLambda142(this, z, 3));
        AlertDialog alertDialogCreate = builder.create();
        showDialog(alertDialogCreate);
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public void clearSelectedFiles() {
        if (this.cacheModel.selectedFiles.size() == 0 || getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, null);
        builder.setTitle(LocaleController.getString(R.string.ClearCache));
        builder.setMessage(LocaleController.getString(R.string.ClearCacheForChats));
        builder.setPositiveButton(LocaleController.getString(R.string.Clear), new CacheControlActivity$$ExternalSyntheticLambda9(this));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        showDialog(alertDialogCreate);
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public static int countDirJava(String str, int i) {
        File[] fileArrListFiles;
        File file = new File(str);
        if (!file.exists() || (fileArrListFiles = file.listFiles()) == null) {
            return 0;
        }
        int iCountDirJava = 0;
        for (File file2 : fileArrListFiles) {
            String name = file2.getName();
            if (!".".equals(name)) {
                if (i > 0 && name.length() >= 4) {
                    String lowerCase = name.toLowerCase();
                    boolean z = true;
                    boolean z2 = lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a");
                    boolean z3 = lowerCase.endsWith(".tgs") || lowerCase.endsWith(".webm");
                    if (!lowerCase.endsWith(".tmp") && !lowerCase.endsWith(".temp") && !lowerCase.endsWith(".preload")) {
                        z = false;
                    }
                    if ((!z2 || i != LISTDIR_DOCTYPE_OTHER_THAN_MUSIC) && ((z2 || i != LISTDIR_DOCTYPE_MUSIC) && ((!z3 || i != LISTDIR_DOCTYPE2_OTHER) && ((z3 || i != LISTDIR_DOCTYPE2_EMOJI) && ((!z || i != LISTDIR_DOCTYPE2_OTHER) && (z || i != LISTDIR_DOCTYPE2_TEMP)))))) {
                        if (file2.isDirectory()) {
                            iCountDirJava += countDirJava(str + "/" + name, i);
                        } else {
                            iCountDirJava++;
                        }
                    }
                } else if (file2.isDirectory()) {
                    iCountDirJava += countDirJava(str + "/" + name, i);
                } else {
                    iCountDirJava++;
                }
            }
        }
        return iCountDirJava;
    }

    public String formatPercent(float f) {
        return formatPercent(f, true);
    }

    private CharSequence getCheckBoxTitle(CharSequence charSequence, int i) {
        return getCheckBoxTitle(charSequence, i, false);
    }

    public static void getDeviceTotalSize(Utilities.Callback2<Long, Long> callback2) {
        Long l;
        Long l2 = lastDeviceTotalSize;
        if (l2 == null || (l = lastDeviceTotalFreeSize) == null) {
            Utilities.cacheClearQueue.postRunnable(new ChatActivity$$ExternalSyntheticLambda498(1, callback2));
        } else if (callback2 != null) {
            callback2.run(l2, l);
        }
    }

    private static long getDirectorySize(File file, int i) {
        if (file != null && !canceled) {
            if (file.isDirectory()) {
                return Utilities.getDirSize(file.getAbsolutePath(), i, false);
            }
            if (file.isFile()) {
                return file.length();
            }
        }
        return 0L;
    }

    private int getTypeByPath(String str) {
        if (pathContains(str, 6)) {
            return 7;
        }
        if (pathContains(str, 0) || pathContains(str, 100)) {
            return 0;
        }
        return (pathContains(str, 2) || pathContains(str, 101)) ? 1 : 6;
    }

    public boolean isAllSectionsSelected() {
        for (int i = 0; i < this.itemInners.size(); i++) {
            ItemInner itemInner = this.itemInners.get(i);
            if (itemInner.viewType == 11) {
                int length = itemInner.index;
                if (length < 0) {
                    length = this.selected.length - 1;
                }
                if (!this.selected[length]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isOtherSelected() {
        int i;
        int length = this.selected.length;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < this.itemInners.size(); i2++) {
            ItemInner itemInner = this.itemInners.get(i2);
            if (itemInner.viewType == 11 && !itemInner.pad && (i = itemInner.index) >= 0) {
                zArr[i] = true;
            }
        }
        for (int i3 = 0; i3 < length; i3++) {
            if (!zArr[i3] && !this.selected[i3]) {
                return false;
            }
        }
        return true;
    }

    public static void lambda$calculateTotalSize$0(Utilities.Callback callback, long j) {
        callback.run(Long.valueOf(j));
    }

    public static void lambda$calculateTotalSize$1(Utilities.Callback callback) {
        canceled = false;
        long directorySize = getDirectorySize(FileLoader.checkDirectory(4), 5);
        long directorySize2 = getDirectorySize(FileLoader.checkDirectory(4), 4);
        long directorySize3 = getDirectorySize(FileLoader.checkDirectory(0), 0) + getDirectorySize(FileLoader.checkDirectory(100), 0);
        long directorySize4 = getDirectorySize(FileLoader.checkDirectory(2), 0) + getDirectorySize(FileLoader.checkDirectory(101), 0);
        long directorySize5 = getDirectorySize(FileLoader.checkDirectory(3), 1) + getDirectorySize(FileLoader.checkDirectory(5), 1);
        long directorySize6 = getDirectorySize(FileLoader.checkDirectory(3), 2) + getDirectorySize(FileLoader.checkDirectory(5), 2);
        long directorySize7 = getDirectorySize(new File(FileLoader.checkDirectory(4), "acache"), 0) + getDirectorySize(FileLoader.checkDirectory(4), 3);
        long directorySize8 = getDirectorySize(FileLoader.checkDirectory(1), 0);
        long directorySize9 = getDirectorySize(FileLoader.checkDirectory(6), 0);
        long directorySize10 = getDirectorySize(AndroidUtilities.getLogsDir(), 1);
        if (!BuildVars.DEBUG_VERSION && directorySize10 < 268435456) {
            directorySize10 = 0;
        }
        long j = directorySize + directorySize2 + directorySize4 + directorySize8 + directorySize3 + directorySize5 + directorySize6 + directorySize7 + directorySize9 + directorySize10;
        lastTotalSizeCalculated = Long.valueOf(j);
        lastTotalSizeCalculatedTime = System.currentTimeMillis();
        if (canceled) {
            return;
        }
        AndroidUtilities.runOnUIThread(new StakedDiceSheet$$ExternalSyntheticLambda4(j, 1, callback));
    }

    public void lambda$cleanupDialogFiles$22(AlertDialog alertDialog) {
        FileLoader.getInstance(this.currentAccount).checkCurrentDownloadsFiles();
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$cleanupDialogFiles$23(ArrayList arrayList, AlertDialog alertDialog) {
        for (int i = 0; i < arrayList.size(); i++) {
            ((CacheModel.FileInfo) arrayList.get(i)).file.delete();
        }
        AndroidUtilities.runOnUIThread(new PhotoViewer$7$$ExternalSyntheticLambda0(20, this, alertDialog));
    }

    public void lambda$cleanupFolders$12(Utilities.Callback2 callback2, Runnable runnable) {
        Utilities.globalQueue.postRunnable(new CacheControlActivity$$ExternalSyntheticLambda2(this, callback2, runnable, 1));
    }

    public static void lambda$cleanupFoldersInternal$13(Utilities.Callback2 callback2, int[] iArr, int i, Float f) {
        float f2 = i;
        callback2.run(Float.valueOf((MathUtils.clamp(f.floatValue(), 0.0f, 1.0f) * (1.0f / f2)) + (iArr[0] / f2)), Boolean.FALSE);
    }

    private static void lambda$cleanupFoldersInternal$14(Utilities.Callback2 callback2, int[] iArr, int i, long j) {
        callback2.run(Float.valueOf(iArr[0] / i), Boolean.valueOf(System.currentTimeMillis() - j > 250));
    }

    public void lambda$cleanupFoldersInternal$15(long j) {
        Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(this).createSimpleBulletin(R.raw.ic_delete, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j)));
        bulletinCreateSimpleBulletin.hideAfterBottomSheet = false;
        bulletinCreateSimpleBulletin.show();
    }

    public void lambda$cleanupFoldersInternal$16(boolean z, long j, Runnable runnable) {
        if (z) {
            ImageLoader.getInstance().clearMemory();
        }
        try {
            AlertDialog alertDialog = this.progressDialog;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.progressDialog = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        getMediaDataController().ringtoneDataStore.checkRingtoneSoundsLoaded();
        AndroidUtilities.runOnUIThread(new LinkManager$3$$ExternalSyntheticLambda0(this, j, 2), 150L);
        MediaDataController.getInstance(this.currentAccount).checkAllMedia(true);
        loadDialogEntities();
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$clearDatabase$24(boolean z, AlertDialog alertDialog, int i) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog alertDialog2 = new AlertDialog(getParentActivity(), 3, null);
        this.progressDialog = alertDialog2;
        alertDialog2.canCacnel = false;
        alertDialog2.showDelayed(500L);
        MessagesController.getInstance(this.currentAccount).clearQueryTime();
        if (z) {
            getMessagesStorage().fullReset();
        } else {
            getMessagesStorage().clearLocalDatabase();
        }
    }

    public void lambda$clearSelectedFiles$20(AlertDialog alertDialog, int i) {
        CacheModel cacheModel = this.cacheModel;
        cacheModel.getClass();
        DialogFileEntities dialogFileEntities = new DialogFileEntities(0L);
        for (CacheModel.FileInfo fileInfo : cacheModel.selectedFiles) {
            dialogFileEntities.addFile(fileInfo, fileInfo.type);
            LongSparseArray longSparseArray = cacheModel.entitiesByDialogId;
            DialogFileEntities dialogFileEntities2 = (DialogFileEntities) longSparseArray.get(fileInfo.dialogId);
            if (dialogFileEntities2 != null) {
                dialogFileEntities2.removeFile(fileInfo);
                if (dialogFileEntities2.isEmpty()) {
                    longSparseArray.remove(fileInfo.dialogId);
                    cacheModel.entities.remove(dialogFileEntities2);
                }
                ArrayList listByType = cacheModel.getListByType(fileInfo.type);
                if (listByType != null) {
                    listByType.remove(fileInfo);
                }
            }
        }
        if (dialogFileEntities.totalSize > 0) {
            cleanupDialogFiles(dialogFileEntities, null, null);
        }
        CacheModel cacheModel2 = this.cacheModel;
        cacheModel2.selectedSize = 0L;
        cacheModel2.selectedFiles.clear();
        cacheModel2.selectedDialogs.clear();
        CachedMediaLayout cachedMediaLayout = this.cachedMediaLayout;
        if (cachedMediaLayout != null) {
            cachedMediaLayout.update();
            this.cachedMediaLayout.showActionMode(false);
        }
        updateRows();
        updateChart();
    }

    public void lambda$createView$17(View view) {
        clearSelectedFiles();
    }

    public void lambda$createView$18(int i, int i2) {
        AndroidUtilities.updateVisibleRows(this.listView);
    }

    public void lambda$createView$19(View view, int i, float f, float f2) {
        if (getParentActivity() != null && i >= 0 && i < this.itemInners.size()) {
            ItemInner itemInner = this.itemInners.get(i);
            if (itemInner.viewType == 11 && (view instanceof CheckBoxCell)) {
                if (itemInner.index >= 0) {
                    toggleSection(itemInner, view);
                    return;
                }
                this.collapsed = !this.collapsed;
                updateRows();
                updateChart();
                return;
            }
            DialogFileEntities dialogFileEntities = itemInner.entities;
            if (dialogFileEntities != null) {
                showClearCacheDialog(dialogFileEntities);
                return;
            }
            if (itemInner.keepMediaType >= 0) {
                KeepMediaPopupView keepMediaPopupView = new KeepMediaPopupView(this, view.getContext());
                ActionBarPopupWindow actionBarPopupWindowCreateSimplePopup = AlertsCreator.createSimplePopup(this, keepMediaPopupView, view, f, f2);
                keepMediaPopupView.update(this.itemInners.get(i).keepMediaType);
                keepMediaPopupView.setParentWindow(actionBarPopupWindowCreateSimplePopup);
                keepMediaPopupView.setCallback(new CacheControlActivity$$ExternalSyntheticLambda9(this));
            }
        }
    }

    public static void lambda$getDeviceTotalSize$2(long j, long j2, long j3, Utilities.Callback2 callback2) {
        lastDeviceTotalSize = Long.valueOf(j * j2);
        Long lValueOf = Long.valueOf(j3 * j2);
        lastDeviceTotalFreeSize = lValueOf;
        if (callback2 != null) {
            callback2.run(lastDeviceTotalSize, lValueOf);
        }
    }

    public static void lambda$getDeviceTotalSize$3(Utilities.Callback2 callback2) {
        ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
        File file = rootDirs.get(0);
        file.getAbsolutePath();
        if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
            int size = rootDirs.size();
            for (int i = 0; i < size; i++) {
                File file2 = rootDirs.get(i);
                if (file2.getAbsolutePath().startsWith(SharedConfig.storageCacheDir) && file2.canWrite()) {
                    file = file2;
                    break;
                }
            }
        }
        try {
            StatFs statFs = new StatFs(file.getPath());
            AndroidUtilities.runOnUIThread(new BotGuardHelper$$ExternalSyntheticLambda0(statFs.getBlockCountLong(), statFs.getBlockSizeLong(), statFs.getAvailableBlocksLong(), callback2));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$getThemeDescriptions$25() {
        BottomSheet bottomSheet = this.bottomSheet;
        if (bottomSheet != null) {
            bottomSheet.setBackgroundColor(Theme.getColor(null, Theme.key_dialogBackground, false));
        }
        View view = this.actionTextView;
        if (view != null) {
            view.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{4.0f}, Theme.key_featuredStickers_addButton));
        }
    }

    public void lambda$loadDialogEntities$6(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, CacheModel cacheModel) {
        boolean z;
        this.loadingDialogs = false;
        getMessagesController().putUsers(arrayList, true);
        getMessagesController().putChats(arrayList2, true);
        DialogFileEntities dialogFileEntities = null;
        int i = 0;
        while (i < arrayList3.size()) {
            DialogFileEntities dialogFileEntities2 = (DialogFileEntities) arrayList3.get(i);
            if (getMessagesController().getUserOrChat(dialogFileEntities2.dialogId) == null) {
                dialogFileEntities2.dialogId = Long.MAX_VALUE;
                if (dialogFileEntities != null) {
                    dialogFileEntities.merge(dialogFileEntities2);
                    arrayList3.remove(i);
                    i--;
                    z = true;
                } else {
                    dialogFileEntities = dialogFileEntities2;
                    z = false;
                }
                if (z) {
                    sort(arrayList3);
                }
            }
            i++;
        }
        cacheModel.entities = arrayList3;
        LongSparseArray longSparseArray = cacheModel.entitiesByDialogId;
        longSparseArray.clear();
        int size = arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList3.get(i2);
            i2++;
            DialogFileEntities dialogFileEntities3 = (DialogFileEntities) obj;
            longSparseArray.put(dialogFileEntities3.dialogId, dialogFileEntities3);
        }
        if (canceled) {
            return;
        }
        setCacheModel(cacheModel);
        updateRows();
        updateChart();
        if (this.cacheChartHeader == null || this.calculating || System.currentTimeMillis() - this.fragmentCreateTime <= 120) {
            return;
        }
        CacheChartHeader cacheChartHeader = this.cacheChartHeader;
        long j = this.totalSize;
        boolean z2 = j > 0;
        long j2 = this.totalDeviceSize;
        float f = 0.0f;
        float f2 = j2 <= 0 ? 0.0f : j / j2;
        long j3 = this.totalDeviceFreeSize;
        if (j3 > 0 && j2 > 0) {
            f = (j2 - j3) / j2;
        }
        cacheChartHeader.setData(z2, f2, f);
    }

    public void lambda$loadDialogEntities$7(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, CacheModel cacheModel) {
        ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
        if (!arrayList.isEmpty()) {
            try {
                getMessagesStorage().getUsersInternal((ArrayList<Long>) arrayList, arrayList4);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (!arrayList2.isEmpty()) {
            try {
                getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        int i = 0;
        while (i < arrayList3.size()) {
            if (((DialogFileEntities) arrayList3.get(i)).totalSize <= 0) {
                arrayList3.remove(i);
                i--;
            }
            i++;
        }
        sort(arrayList3);
        AndroidUtilities.runOnUIThread(new CacheControlActivity$$ExternalSyntheticLambda13(this, arrayList4, arrayList5, arrayList3, cacheModel, 0));
    }

    public void lambda$loadDialogEntities$8() {
        getFileLoader().getFileDatabase().ensureDatabaseCreated();
        CacheModel cacheModel = new CacheModel(false);
        LongSparseArray<DialogFileEntities> longSparseArray = new LongSparseArray<>();
        fillDialogsEntitiesRecursive(FileLoader.checkDirectory(4), 6, longSparseArray, cacheModel);
        fillDialogsEntitiesRecursive(FileLoader.checkDirectory(0), 0, longSparseArray, cacheModel);
        fillDialogsEntitiesRecursive(FileLoader.checkDirectory(100), 0, longSparseArray, cacheModel);
        fillDialogsEntitiesRecursive(FileLoader.checkDirectory(2), 1, longSparseArray, cacheModel);
        fillDialogsEntitiesRecursive(FileLoader.checkDirectory(101), 1, longSparseArray, cacheModel);
        fillDialogsEntitiesRecursive(FileLoader.checkDirectory(1), 4, longSparseArray, cacheModel);
        fillDialogsEntitiesRecursive(FileLoader.checkDirectory(6), 6, longSparseArray, cacheModel);
        fillDialogsEntitiesRecursive(FileLoader.checkDirectory(3), 2, longSparseArray, cacheModel);
        fillDialogsEntitiesRecursive(FileLoader.checkDirectory(5), 2, longSparseArray, cacheModel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < longSparseArray.size(); i++) {
            DialogFileEntities dialogFileEntitiesValueAt = longSparseArray.valueAt(i);
            arrayList.add(dialogFileEntitiesValueAt);
            if (getMessagesController().getUserOrChat(((DialogFileEntities) arrayList.get(i)).dialogId) == null) {
                long j = dialogFileEntitiesValueAt.dialogId;
                if (j > 0) {
                    arrayList2.add(Long.valueOf(j));
                } else {
                    arrayList3.add(Long.valueOf(j));
                }
            }
        }
        CacheModel.sort(cacheModel.media);
        CacheModel.sort(cacheModel.documents);
        CacheModel.sort(cacheModel.music);
        CacheModel.sort(cacheModel.voice);
        CacheModel.sort(cacheModel.stories);
        getMessagesStorage().getStorageQueue().postRunnable(new CacheControlActivity$$ExternalSyntheticLambda13(this, arrayList2, arrayList3, arrayList, cacheModel, 1));
    }

    public void lambda$onFragmentCreate$4() {
        resumeDelayedFragmentAnimation();
        this.calculating = false;
        updateRows(true);
        updateChart();
    }

    public void lambda$onFragmentCreate$5() {
        this.cacheSize = getDirectorySize(FileLoader.checkDirectory(4), 5);
        if (canceled) {
            return;
        }
        this.cacheTempSize = getDirectorySize(FileLoader.checkDirectory(4), 4);
        if (canceled) {
            return;
        }
        long directorySize = getDirectorySize(FileLoader.checkDirectory(0), 0);
        this.photoSize = directorySize;
        this.photoSize = directorySize + getDirectorySize(FileLoader.checkDirectory(100), 0);
        if (canceled) {
            return;
        }
        long directorySize2 = getDirectorySize(FileLoader.checkDirectory(2), 0);
        this.videoSize = directorySize2;
        this.videoSize = directorySize2 + getDirectorySize(FileLoader.checkDirectory(101), 0);
        if (canceled) {
            return;
        }
        long directorySize3 = getDirectorySize(AndroidUtilities.getLogsDir(), 1);
        this.logsSize = directorySize3;
        if (!BuildVars.DEBUG_VERSION && directorySize3 < 268435456) {
            this.logsSize = 0L;
        }
        if (canceled) {
            return;
        }
        long directorySize4 = getDirectorySize(FileLoader.checkDirectory(3), 1);
        this.documentsSize = directorySize4;
        this.documentsSize = directorySize4 + getDirectorySize(FileLoader.checkDirectory(5), 1);
        if (canceled) {
            return;
        }
        long directorySize5 = getDirectorySize(FileLoader.checkDirectory(3), 2);
        this.musicSize = directorySize5;
        this.musicSize = directorySize5 + getDirectorySize(FileLoader.checkDirectory(5), 2);
        if (canceled) {
            return;
        }
        this.stickersCacheSize = getDirectorySize(new File(FileLoader.checkDirectory(4), "acache"), 0);
        if (canceled) {
            return;
        }
        this.cacheEmojiSize = getDirectorySize(FileLoader.checkDirectory(4), 3);
        if (canceled) {
            return;
        }
        this.stickersCacheSize += this.cacheEmojiSize;
        this.audioSize = getDirectorySize(FileLoader.checkDirectory(1), 0);
        this.storiesSize = getDirectorySize(FileLoader.checkDirectory(6), 0);
        if (canceled) {
            return;
        }
        long j = this.cacheSize + this.cacheTempSize + this.videoSize + this.logsSize + this.audioSize + this.photoSize + this.documentsSize + this.musicSize + this.storiesSize + this.stickersCacheSize;
        lastTotalSizeCalculated = Long.valueOf(j);
        this.totalSize = j;
        lastTotalSizeCalculatedTime = System.currentTimeMillis();
        ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
        File file = rootDirs.get(0);
        file.getAbsolutePath();
        if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
            int size = rootDirs.size();
            for (int i = 0; i < size; i++) {
                File file2 = rootDirs.get(i);
                if (file2.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                    file = file2;
                    break;
                }
            }
        }
        try {
            StatFs statFs = new StatFs(file.getPath());
            long blockSizeLong = statFs.getBlockSizeLong();
            long availableBlocksLong = statFs.getAvailableBlocksLong();
            this.totalDeviceSize = statFs.getBlockCountLong() * blockSizeLong;
            this.totalDeviceFreeSize = availableBlocksLong * blockSizeLong;
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new CacheControlActivity$$ExternalSyntheticLambda0(this, 1));
        loadDialogEntities();
    }

    public static int lambda$sort$9(DialogFileEntities dialogFileEntities, DialogFileEntities dialogFileEntities2) {
        long j = dialogFileEntities2.totalSize;
        long j2 = dialogFileEntities.totalSize;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    public void lambda$updateActionBar$21(ValueAnimator valueAnimator) {
        this.actionBarShownT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.actionBar.setTitleColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false), (int) (this.actionBarShownT * 255.0f)));
        this.actionBar.setBackgroundColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_windowBackgroundWhite, false), (int) (this.actionBarShownT * 255.0f)));
        this.fragmentView.invalidate();
    }

    public static int lambda$updateRows$10(ItemInner itemInner, ItemInner itemInner2) {
        return Long.compare(itemInner2.size, itemInner.size);
    }

    private void loadDialogEntities() {
        getFileLoader().getFileDatabase().getQueue().postRunnable(new CacheControlActivity$$ExternalSyntheticLambda0(this, 2));
    }

    private void migrateOldFolder() {
        FilesMigrationService.checkBottomSheet(this);
    }

    private boolean pathContains(String str, int i) {
        if (str == null || FileLoader.checkDirectory(i) == null) {
            return false;
        }
        return str.contains(FileLoader.checkDirectory(i).getAbsolutePath());
    }

    public static void resetCalculatedTotalSIze() {
        lastTotalSizeCalculated = null;
    }

    private int sectionsSelected() {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            if (this.selected[i2] && size(i2) > 0) {
                i++;
            }
        }
        return i;
    }

    public void showClearCacheDialog(final DialogFileEntities dialogFileEntities) {
        if (this.totalSize <= 0 || getParentActivity() == null) {
            return;
        }
        DialogCacheBottomSheet dialogCacheBottomSheet = new DialogCacheBottomSheet(this, dialogFileEntities, dialogFileEntities.createCacheModel(), new DialogCacheBottomSheet.Delegate() {
            @Override
            public void cleanupDialogFiles(DialogFileEntities dialogFileEntities2, StorageDiagramView.ClearViewData[] clearViewDataArr, CacheModel cacheModel) {
                CacheControlActivity.this.cleanupDialogFiles(dialogFileEntities2, clearViewDataArr, cacheModel);
            }

            @Override
            public void onAvatarClick() {
                CacheControlActivity.this.bottomSheet.lambda$showGiftOfferSheet$15();
                Bundle bundle = new Bundle();
                long j = dialogFileEntities.dialogId;
                if (j > 0) {
                    bundle.putLong("user_id", j);
                } else {
                    bundle.putLong("chat_id", -j);
                }
                CacheControlActivity.this.presentFragment(new ProfileActivity(bundle, null));
            }
        });
        this.bottomSheet = dialogCacheBottomSheet;
        showDialog(dialogCacheBottomSheet);
    }

    private long size(int i) {
        switch (i) {
            case 0:
                return this.photoSize;
            case 1:
                return this.videoSize;
            case 2:
                return this.documentsSize;
            case 3:
                return this.musicSize;
            case 4:
                return this.audioSize;
            case 5:
                return this.storiesSize;
            case 6:
                return this.stickersCacheSize;
            case 7:
                return this.cacheSize;
            case 8:
                return this.cacheTempSize;
            case 9:
                return this.logsSize;
            default:
                return 0L;
        }
    }

    private void sort(ArrayList<DialogFileEntities> arrayList) {
        Collections.sort(arrayList, new OAuthSheet$$ExternalSyntheticLambda10(3));
    }

    public void toggleOtherSelected(View view) {
        int i;
        int childAdapterPosition;
        int i2;
        int i3;
        boolean zIsOtherSelected = isOtherSelected();
        if (zIsOtherSelected) {
            int i4 = 0;
            while (true) {
                if (i4 >= this.itemInners.size()) {
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    if (view != null) {
                        AndroidUtilities.shakeViewSpring(view, -3.0f);
                        return;
                    }
                    return;
                }
                ItemInner itemInner = this.itemInners.get(i4);
                if (itemInner.viewType == 11 && !itemInner.pad && (i3 = itemInner.index) >= 0 && this.selected[i3]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        if (this.collapsed) {
            int length = this.selected.length;
            boolean[] zArr = new boolean[length];
            for (int i5 = 0; i5 < this.itemInners.size(); i5++) {
                ItemInner itemInner2 = this.itemInners.get(i5);
                if (itemInner2.viewType == 11 && !itemInner2.pad && (i2 = itemInner2.index) >= 0) {
                    zArr[i2] = true;
                }
            }
            for (int i6 = 0; i6 < length; i6++) {
                if (!zArr[i6]) {
                    this.selected[i6] = !zIsOtherSelected;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.itemInners.size(); i7++) {
                ItemInner itemInner3 = this.itemInners.get(i7);
                if (itemInner3.viewType == 11 && itemInner3.pad && (i = itemInner3.index) >= 0) {
                    this.selected[i] = !zIsOtherSelected;
                }
            }
        }
        for (int i8 = 0; i8 < this.listView.getChildCount(); i8++) {
            View childAt = this.listView.getChildAt(i8);
            if ((childAt instanceof CheckBoxCell) && (childAdapterPosition = this.listView.getChildAdapterPosition(childAt)) >= 0) {
                ItemInner itemInner4 = this.itemInners.get(childAdapterPosition);
                if (itemInner4.viewType == 11) {
                    int i9 = itemInner4.index;
                    if (i9 < 0) {
                        ((CheckBoxCell) childAt).setChecked(!zIsOtherSelected, true);
                    } else {
                        ((CheckBoxCell) childAt).setChecked(this.selected[i9], true);
                    }
                }
            }
        }
        updateChart();
    }

    private void toggleSection(ItemInner itemInner, View view) {
        int childAdapterPosition;
        int i = itemInner.index;
        if (i < 0) {
            toggleOtherSelected(view);
            return;
        }
        if (this.selected[i] && sectionsSelected() <= 1) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            if (view != null) {
                AndroidUtilities.shakeViewSpring(view, -3.0f);
                return;
            }
            return;
        }
        if (view instanceof CheckBoxCell) {
            boolean[] zArr = this.selected;
            int i2 = itemInner.index;
            boolean z = !zArr[i2];
            zArr[i2] = z;
            ((CheckBoxCell) view).setChecked(z, true);
        } else {
            boolean[] zArr2 = this.selected;
            int i3 = itemInner.index;
            zArr2[i3] = !zArr2[i3];
            int iIndexOf = this.itemInners.indexOf(itemInner);
            if (iIndexOf >= 0) {
                for (int i4 = 0; i4 < this.listView.getChildCount(); i4++) {
                    View childAt = this.listView.getChildAt(i4);
                    if ((childAt instanceof CheckBoxCell) && iIndexOf == this.listView.getChildAdapterPosition(childAt)) {
                        ((CheckBoxCell) childAt).setChecked(this.selected[itemInner.index], true);
                    }
                }
            }
        }
        if (itemInner.pad) {
            for (int i5 = 0; i5 < this.listView.getChildCount(); i5++) {
                View childAt2 = this.listView.getChildAt(i5);
                if ((childAt2 instanceof CheckBoxCell) && (childAdapterPosition = this.listView.getChildAdapterPosition(childAt2)) >= 0 && childAdapterPosition < this.itemInners.size() && this.itemInners.get(childAdapterPosition).index < 0) {
                    ((CheckBoxCell) childAt2).setChecked(isOtherSelected(), true);
                    break;
                }
            }
        }
        updateChart();
    }

    public void updateActionBar(boolean z) {
        if (z != this.actionBarShown) {
            ValueAnimator valueAnimator = this.actionBarAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f = this.actionBarShownT;
            this.actionBarShown = z;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
            this.actionBarAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(this, 28));
            this.actionBarAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.actionBarAnimator.setDuration(380L);
            this.actionBarAnimator.start();
        }
    }

    public void updateActionMode() {
        String pluralString;
        if (this.cacheModel.selectedFiles.size() <= 0) {
            this.cachedMediaLayout.showActionMode(false);
            return;
        }
        if (this.cachedMediaLayout != null) {
            if (this.cacheModel.selectedDialogs.isEmpty()) {
                pluralString = LocaleController.formatPluralString("Files", this.cacheModel.selectedFiles.size(), Integer.valueOf(this.cacheModel.selectedFiles.size()));
            } else {
                ArrayList arrayList = this.cacheModel.entities;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    DialogFileEntities dialogFileEntities = (DialogFileEntities) obj;
                    if (this.cacheModel.selectedDialogs.contains(Long.valueOf(dialogFileEntities.dialogId))) {
                        i2 += dialogFileEntities.filesCount;
                    }
                }
                int size2 = this.cacheModel.selectedFiles.size() - i2;
                pluralString = size2 > 0 ? zzjx.m(LocaleController.formatPluralString("Chats", this.cacheModel.selectedDialogs.size(), Integer.valueOf(this.cacheModel.selectedDialogs.size())), ", ", LocaleController.formatPluralString("Files", size2, Integer.valueOf(size2))) : LocaleController.formatPluralString("Chats", this.cacheModel.selectedDialogs.size(), Integer.valueOf(this.cacheModel.selectedDialogs.size()));
            }
            this.actionModeTitle.setText(AndroidUtilities.formatFileSize(this.cacheModel.selectedSize), !LocaleController.isRTL);
            this.actionModeSubtitle.setText(pluralString, !LocaleController.isRTL);
            this.cachedMediaLayout.showActionMode(true);
        }
    }

    public void updateChart() {
        CacheChart cacheChart = this.cacheChart;
        if (cacheChart != null) {
            boolean z = this.calculating;
            if (!z && this.totalSize > 0) {
                CacheChart.SegmentSize[] segmentSizeArr = new CacheChart.SegmentSize[11];
                for (int i = 0; i < this.itemInners.size(); i++) {
                    ItemInner itemInner = this.itemInners.get(i);
                    if (itemInner.viewType == 11) {
                        int i2 = itemInner.index;
                        if (i2 >= 0) {
                            segmentSizeArr[i2] = CacheChart.SegmentSize.of(itemInner.size, this.selected[i2]);
                        } else if (this.collapsed) {
                            segmentSizeArr[10] = CacheChart.SegmentSize.of(itemInner.size, this.selected[10]);
                        }
                    }
                }
                if (System.currentTimeMillis() - this.fragmentCreateTime < 80) {
                    this.cacheChart.loadingFloat.set(0.0f, true);
                }
                this.cacheChart.setSegments(this.totalSize, true, segmentSizeArr);
            } else if (z) {
                cacheChart.setSegments(-1L, true, new CacheChart.SegmentSize[0]);
            } else {
                cacheChart.setSegments(0L, true, new CacheChart.SegmentSize[0]);
            }
        }
        ClearCacheButtonInternal clearCacheButtonInternal = this.clearCacheButton;
        if (clearCacheButtonInternal == null || this.calculating) {
            return;
        }
        clearCacheButtonInternal.updateSize();
    }

    private void updateDatabaseItemSize() {
        if (this.clearDatabaseItem != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
            this.clearDatabaseItem.setText(spannableStringBuilder);
        }
    }

    public void updateRows() {
        updateRows(true);
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        actionBar.setTitleColor(ColorUtils.setAlphaComponent(Theme.getColor(null, i, false), 0));
        this.actionBar.setItemsColor(Theme.getColor(null, i, false), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_listSelector, false), false);
        zzki.m(this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.StorageUsage));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 != -1) {
                    if (i2 == 1) {
                        CacheControlActivity.this.clearSelectedFiles();
                        return;
                    } else if (i2 == 3) {
                        CacheControlActivity.this.clearDatabase(false);
                        return;
                    } else {
                        if (i2 == 4) {
                            CacheControlActivity.this.clearDatabase(true);
                            return;
                        }
                        return;
                    }
                }
                if (!((BaseFragment) CacheControlActivity.this).actionBar.isActionModeShowed()) {
                    CacheControlActivity.this.finishFragment();
                    return;
                }
                CacheModel cacheModel = CacheControlActivity.this.cacheModel;
                if (cacheModel != null) {
                    cacheModel.selectedSize = 0L;
                    cacheModel.selectedFiles.clear();
                    cacheModel.selectedDialogs.clear();
                }
                if (CacheControlActivity.this.cachedMediaLayout != null) {
                    CacheControlActivity.this.cachedMediaLayout.showActionMode(false);
                    CacheControlActivity.this.cachedMediaLayout.updateVisibleRows();
                }
            }
        });
        this.actionMode = this.actionBar.createActionMode();
        FrameLayout frameLayout = new FrameLayout(context);
        this.actionMode.addView(frameLayout, LayoutHelper.createLinear(0, -1, 1.0f, 72, 0, 0, 0));
        AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, true);
        this.actionModeTitle = animatedTextView;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        animatedTextView.setAnimationProperties(0.35f, 0L, 350L, cubicBezierInterpolator);
        this.actionModeTitle.setTextSize(AndroidUtilities.dp(18.0f));
        this.actionModeTitle.setTypeface(AndroidUtilities.bold());
        this.actionModeTitle.setTextColor(Theme.getColor(null, i, false));
        frameLayout.addView(this.actionModeTitle, LayoutHelper.createFrame(-1, 18.0f, 19, 0.0f, -11.0f, 18.0f, 0.0f));
        AnimatedTextView animatedTextView2 = new AnimatedTextView(context, true, true, true);
        this.actionModeSubtitle = animatedTextView2;
        animatedTextView2.setAnimationProperties(0.35f, 0L, 350L, cubicBezierInterpolator);
        this.actionModeSubtitle.setTextSize(AndroidUtilities.dp(14.0f));
        this.actionModeSubtitle.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false));
        frameLayout.addView(this.actionModeSubtitle, LayoutHelper.createFrame(-1, 18.0f, 19, 0.0f, 10.0f, 18.0f, 0.0f));
        TextView textView = new TextView(context);
        this.actionModeClearButton = textView;
        textView.setTextSize(1, 14.0f);
        this.actionModeClearButton.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        this.actionModeClearButton.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        this.actionModeClearButton.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{6.0f}, Theme.key_featuredStickers_addButton));
        this.actionModeClearButton.setTypeface(AndroidUtilities.bold());
        this.actionModeClearButton.setGravity(17);
        this.actionModeClearButton.setText(LocaleController.getString(R.string.CacheClear));
        this.actionModeClearButton.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda11(this, 2));
        if (LocaleController.isRTL) {
            frameLayout.addView(this.actionModeClearButton, LayoutHelper.createFrame(-2, 28.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            frameLayout.addView(this.actionModeClearButton, LayoutHelper.createFrame(-2, 28.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        }
        ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(2, R.drawable.ic_ab_other);
        int i2 = R.drawable.msg_delete;
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem = actionBarMenuItemAddItem.addSubItem(3, i2, LocaleController.getString(R.string.ClearLocalDatabase));
        this.clearDatabaseItem = actionBarMenuSubItemAddSubItem;
        int i3 = Theme.key_text_RedRegular;
        actionBarMenuSubItemAddSubItem.setIconColor(Theme.getColor(null, i3, false));
        ActionBarMenuSubItem actionBarMenuSubItem = this.clearDatabaseItem;
        int i4 = Theme.key_text_RedBold;
        actionBarMenuSubItem.setTextColor(Theme.getColor(null, i4, false));
        this.clearDatabaseItem.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(null, i3, false)));
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem2 = actionBarMenuItemAddItem.addSubItem(4, i2, "Full Reset Database");
            this.resetDatabaseItem = actionBarMenuSubItemAddSubItem2;
            actionBarMenuSubItemAddSubItem2.setIconColor(Theme.getColor(null, i3, false));
            this.resetDatabaseItem.setTextColor(Theme.getColor(null, i4, false));
            this.resetDatabaseItem.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(null, i3, false)));
        }
        updateDatabaseItemSize();
        this.listAdapter = new ListAdapter(context);
        NestedSizeNotifierLayout nestedSizeNotifierLayout = new NestedSizeNotifierLayout(context) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                boolean zIsPinnedToTop = isPinnedToTop();
                if (zIsPinnedToTop && CacheControlActivity.this.actionBarShadowAlpha != 0.0f) {
                    CacheControlActivity.access$524(CacheControlActivity.this, 0.16f);
                    invalidate();
                } else if (!zIsPinnedToTop && CacheControlActivity.this.actionBarShadowAlpha != 1.0f) {
                    CacheControlActivity.access$516(CacheControlActivity.this, 0.16f);
                    invalidate();
                }
                CacheControlActivity cacheControlActivity = CacheControlActivity.this;
                cacheControlActivity.actionBarShadowAlpha = Utilities.clamp(cacheControlActivity.actionBarShadowAlpha, 1.0f, 0.0f);
                if (((BaseFragment) CacheControlActivity.this).parentLayout != null) {
                    INavigationLayout iNavigationLayout = ((BaseFragment) CacheControlActivity.this).parentLayout;
                    ActionBarLayout actionBarLayout = (ActionBarLayout) iNavigationLayout;
                    actionBarLayout.drawHeaderShadow(canvas, (int) (CacheControlActivity.this.actionBarShadowAlpha * CacheControlActivity.this.actionBarShownT * 255.0f), ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
                }
            }
        };
        this.nestedSizeNotifierLayout = nestedSizeNotifierLayout;
        this.fragmentView = nestedSizeNotifierLayout;
        nestedSizeNotifierLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public boolean allowSelectChildAtPosition(View view) {
                return view != CacheControlActivity.this.cacheChart;
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setPadding(0, (ActionBar.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, 0);
        this.listView.setClipToPadding(false);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        nestedSizeNotifierLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setAdapter(this.listAdapter);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                CacheControlActivity.this.listView.invalidate();
            }
        };
        defaultItemAnimator.setDurations(350L);
        defaultItemAnimator.setInterpolator(cubicBezierInterpolator);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.listView.lambda$onCellEnter$52(defaultItemAnimator);
        this.listView.setOnItemClickListener(new CacheControlActivity$$ExternalSyntheticLambda9(this));
        this.listView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            boolean pinned;

            @Override
            public void onScrolled(RecyclerView recyclerView, int i5, int i6) {
                super.onScrolled(recyclerView, i5, i6);
                CacheControlActivity cacheControlActivity = CacheControlActivity.this;
                cacheControlActivity.updateActionBar(cacheControlActivity.layoutManager.findFirstVisibleItemPosition() > 0 || ((BaseFragment) CacheControlActivity.this).actionBar.isActionModeShowed());
                if (this.pinned != CacheControlActivity.this.nestedSizeNotifierLayout.isPinnedToTop()) {
                    this.pinned = CacheControlActivity.this.nestedSizeNotifierLayout.isPinnedToTop();
                    CacheControlActivity.this.nestedSizeNotifierLayout.invalidate();
                }
            }
        });
        nestedSizeNotifierLayout.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f));
        this.nestedSizeNotifierLayout.setTargetListView(this.listView);
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didClearDatabase) {
            try {
                AlertDialog alertDialog = this.progressDialog;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.progressDialog = null;
            if (this.listAdapter != null) {
                this.databaseSize = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
                this.updateDatabaseSize = true;
                updateDatabaseItemSize();
                updateRows();
            }
        }
    }

    public void fillDialogsEntitiesRecursive(File file, int i, LongSparseArray<DialogFileEntities> longSparseArray, CacheModel cacheModel) {
        File[] fileArrListFiles;
        if (file != null && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (canceled) {
                    break;
                }
                if (file2.isDirectory()) {
                    fillDialogsEntitiesRecursive(file2, i, longSparseArray, cacheModel);
                } else if (!file2.getName().equals(".nomedia")) {
                    FilePathDatabase.FileMeta fileDialogId = getFileLoader().getFileDatabase().getFileDialogId(file2, null);
                    String lowerCase = file2.getName().toLowerCase();
                    int i2 = (lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a")) ? 3 : i;
                    CacheModel.FileInfo fileInfo = new CacheModel.FileInfo(file2);
                    long length = file2.length();
                    fileInfo.size = length;
                    if (fileDialogId != null) {
                        fileInfo.dialogId = fileDialogId.dialogId;
                        fileInfo.messageId = fileDialogId.messageId;
                        int i3 = fileDialogId.messageType;
                        fileInfo.messageType = i3;
                        if (i3 == 23 && length > 0) {
                            i2 = 7;
                        }
                    }
                    fileInfo.type = i2;
                    long j = fileInfo.dialogId;
                    if (j != 0) {
                        DialogFileEntities dialogFileEntities = longSparseArray.get(j, null);
                        if (dialogFileEntities == null) {
                            dialogFileEntities = new DialogFileEntities(fileInfo.dialogId);
                            longSparseArray.put(fileInfo.dialogId, dialogFileEntities);
                        }
                        dialogFileEntities.addFile(fileInfo, i2);
                    }
                    if (cacheModel != null && i2 != 6) {
                        cacheModel.getListByType(i2).add(fileInfo);
                    }
                }
            }
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        IntroActivity$$ExternalSyntheticLambda0 introActivity$$ExternalSyntheticLambda0 = new IntroActivity$$ExternalSyntheticLambda0(this, 2);
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{TextSettingsCell.class, SlideChooseView.class, StorageUsageView.class, HeaderCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        int i = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        int i2 = Theme.key_windowBackgroundWhiteValueText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StorageUsageView.class}, new String[]{"paintFill"}, null, null, -1, null, Theme.key_player_progressBackground));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StorageUsageView.class}, new String[]{"paintProgress"}, null, null, -1, null, Theme.key_player_progress));
        int i3 = Theme.key_windowBackgroundWhiteGrayText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StorageUsageView.class}, new String[]{"telegramCacheTextView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StorageUsageView.class}, new String[]{"freeSizeTextView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StorageUsageView.class}, new String[]{"calculationgTextView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SlideChooseView.class}, null, null, null, Theme.key_switchTrack));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SlideChooseView.class}, null, null, null, Theme.key_switchTrackChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SlideChooseView.class}, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, new Class[]{CheckBoxCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, new Class[]{CheckBoxCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, new Class[]{CheckBoxCell.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, new Class[]{StorageDiagramView.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(null, 0, new Class[]{TextCheckBoxCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_dialogBackground));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, null, null, null, null, Theme.key_statisticChartLine_blue));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, null, null, null, null, Theme.key_statisticChartLine_green));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, null, null, null, null, Theme.key_statisticChartLine_red));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, null, null, null, null, Theme.key_statisticChartLine_golden));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, null, null, null, null, Theme.key_statisticChartLine_lightblue));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, null, null, null, null, Theme.key_statisticChartLine_lightgreen));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, null, null, null, null, Theme.key_statisticChartLine_orange));
        arrayList.add(new ThemeDescription(this.bottomSheetView, 0, null, null, null, null, Theme.key_statisticChartLine_indigo));
        return arrayList;
    }

    @Override
    public boolean isLightStatusBar() {
        if (this.changeStatusBar) {
            return AndroidUtilities.computePerceivedBrightness(Theme.getColor(null, Theme.key_windowBackgroundGray, false)) > 0.721f;
        }
        return super.isLightStatusBar();
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        CachedMediaLayout cachedMediaLayout = this.cachedMediaLayout;
        if (cachedMediaLayout == null || motionEvent == null) {
            return true;
        }
        Rect rect = AndroidUtilities.rectTmp2;
        cachedMediaLayout.getHitRect(rect);
        if (rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight())) {
            return this.cachedMediaLayout.viewPagerFixed.isCurrentTabFirst();
        }
        return true;
    }

    @Override
    public boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public boolean onBackPressed(boolean z) {
        CacheModel cacheModel = this.cacheModel;
        if (cacheModel == null || cacheModel.selectedFiles.isEmpty()) {
            return super.onBackPressed(z);
        }
        if (z) {
            CacheModel cacheModel2 = this.cacheModel;
            cacheModel2.selectedSize = 0L;
            cacheModel2.selectedFiles.clear();
            cacheModel2.selectedDialogs.clear();
            CachedMediaLayout cachedMediaLayout = this.cachedMediaLayout;
            if (cachedMediaLayout != null) {
                cachedMediaLayout.showActionMode(false);
                this.cachedMediaLayout.updateVisibleRows();
            }
        }
        return false;
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        canceled = false;
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.databaseSize = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
        this.loadingDialogs = true;
        Utilities.globalQueue.postRunnable(new CacheControlActivity$$ExternalSyntheticLambda0(this, 0));
        this.fragmentCreateTime = System.currentTimeMillis();
        updateRows(false);
        updateChart();
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didClearDatabase);
        try {
            AlertDialog alertDialog = this.progressDialog;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
        this.progressDialog = null;
        canceled = true;
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, (ActionBar.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        FilesMigrationService.FilesMigrationBottomSheet filesMigrationBottomSheet;
        if (i == 4) {
            for (int i2 : iArr) {
                if (i2 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT < 30 || (filesMigrationBottomSheet = FilesMigrationService.filesMigrationBottomSheet) == null) {
                return;
            }
            filesMigrationBottomSheet.migrateOldFolder();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.listAdapter.notifyDataSetChanged();
    }

    @Override
    public void onTransitionAnimationProgress(boolean z, float f) {
        if (f > 0.5f && !this.changeStatusBar) {
            this.changeStatusBar = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z, f);
    }

    public void scrollTo() {
    }

    public void setCacheModel(CacheModel cacheModel) {
        this.cacheModel = cacheModel;
        CachedMediaLayout cachedMediaLayout = this.cachedMediaLayout;
        if (cachedMediaLayout != null) {
            cachedMediaLayout.setCacheModel(cacheModel);
        }
    }

    private String formatPercent(float f, boolean z) {
        if (z && f < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float fRound = Math.round(f * 100.0f);
        return (!z || fRound > 0.0f) ? String.format("%d%%", Integer.valueOf((int) fRound)) : String.format("<%d%%", 1);
    }

    public CharSequence getCheckBoxTitle(CharSequence charSequence, int i, boolean z) {
        SpannableString spannableString = new SpannableString(i <= 0 ? String.format("<%.1f%%", Float.valueOf(1.0f)) : String.format("%d%%", Integer.valueOf(i)));
        spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
        spannableString.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    private void updateRows(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.CacheControlActivity.updateRows(boolean):void");
    }
}
