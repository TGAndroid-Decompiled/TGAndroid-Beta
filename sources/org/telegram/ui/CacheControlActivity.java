package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
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
import androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda2;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzit;
import com.google.android.gms.internal.mlkit_vision_common.zzkc;
import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import com.stripe.android.Stripe;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilePathDatabase;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckBoxCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CacheChart;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.NestedSizeNotifierLayout;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Components.Paint.Views.PaintColorsListView;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SlideChooseView;
import org.telegram.ui.Components.StorageDiagramView;
import org.telegram.ui.Components.StorageUsageView;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.Storage.CacheModel;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;

public final class CacheControlActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public static volatile boolean canceled = false;
    public static Long lastDeviceTotalFreeSize;
    public static Long lastDeviceTotalSize;
    public static Long lastTotalSizeCalculated;
    public static long lastTotalSizeCalculatedTime;
    public ValueAnimator actionBarAnimator;
    public float actionBarShadowAlpha;
    public boolean actionBarShown;
    public float actionBarShownT;
    public ActionBar.AnonymousClass1 actionMode;
    public TextView actionModeClearButton;
    public AnimatedTextView actionModeSubtitle;
    public AnimatedTextView actionModeTitle;
    public long audioSize;
    public DialogCacheBottomSheet bottomSheet;
    public ListAdapter.AnonymousClass1 cacheChart;
    public CacheChartHeader cacheChartHeader;
    public long cacheEmojiSize;
    public CacheModel cacheModel;
    public long cacheSize;
    public long cacheTempSize;
    public DialogCacheBottomSheet.AnonymousClass3 cachedMediaLayout;
    public boolean calculating;
    public boolean changeStatusBar;
    public ClearCacheButtonInternal clearCacheButton;
    public ActionBarMenuSubItem clearDatabaseItem;
    public boolean collapsed;
    public long databaseSize;
    public long documentsSize;
    public long fragmentCreateTime;
    public final ArrayList itemInners;
    public LinearLayoutManager layoutManager;
    public ListAdapter listAdapter;
    public ChatActivity.AnonymousClass34 listView;
    public long logsSize;
    public final long migrateOldFolderRow;
    public long musicSize;
    public AnonymousClass2 nestedSizeNotifierLayout;
    public final ArrayList oldItems;
    public int[] percents;
    public long photoSize;
    public AlertDialog progressDialog;
    public ActionBarMenuSubItem resetDatabaseItem;
    public final boolean[] selected;
    public long stickersCacheSize;
    public long storiesSize;
    public float[] tempSizes;
    public long totalDeviceFreeSize;
    public long totalDeviceSize;
    public long totalSize;
    public long videoSize;

    public final class AnonymousClass5 extends RecyclerView.OnScrollListener {
        public final int $r8$classId;
        public boolean pinned;
        public final NotificationCenter.NotificationCenterDelegate this$0;

        public AnonymousClass5(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i) {
            this.$r8$classId = i;
            this.this$0 = notificationCenterDelegate;
        }

        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            switch (this.$r8$classId) {
                case 1:
                    if (i == 0) {
                        int iDp = AndroidUtilities.dp(13.0f);
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.this$0;
                        ActionBarMenuItem actionBarMenuItem = chatAttachAlertPhotoLayout.parentAlert.selectedMenuItem;
                        int iDp2 = iDp + (actionBarMenuItem != null ? AndroidUtilities.dp(actionBarMenuItem.getAlpha() * 26.0f) : 0);
                        ChatAttachAlert chatAttachAlert = chatAttachAlertPhotoLayout.parentAlert;
                        int backgroundPaddingTop = chatAttachAlert.getBackgroundPaddingTop();
                        if (((chatAttachAlert.scrollOffsetY[0] - backgroundPaddingTop) - iDp2) + backgroundPaddingTop < (chatAttachAlert.topCommentContainer.getAlpha() * chatAttachAlert.topCommentContainer.getMeasuredHeight()) + ActionBar.getCurrentActionBarHeight()) {
                            ChatAttachAlertPhotoLayout.AnonymousClass3 anonymousClass3 = chatAttachAlertPhotoLayout.gridView;
                            RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass3.findViewHolderForAdapterPosition(0);
                            if (holder != null) {
                                View view = holder.itemView;
                                if (view.getTop() > chatAttachAlertPhotoLayout.getTopScrollOffset()) {
                                    anonymousClass3.smoothScrollBy(0, view.getTop() - chatAttachAlertPhotoLayout.getTopScrollOffset(), null);
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) this.this$0;
                    if (i == 1 && ((BottomSheet) StoryPrivacyBottomSheet.this).keyboardVisible && page.searchField != null) {
                        StoryPrivacyBottomSheet.this.closeKeyboard();
                    }
                    if (i == 0) {
                        page.wasAtTop = !page.listView.canScrollVertically(-1);
                        page.listView.canScrollVertically(1);
                    }
                    page.scrolling = i != 0;
                    break;
            }
        }

        @Override
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    CacheControlActivity cacheControlActivity = (CacheControlActivity) this.this$0;
                    cacheControlActivity.updateActionBar(cacheControlActivity.layoutManager.findFirstVisibleItemPosition() > 0 || ((BaseFragment) cacheControlActivity).actionBar.isActionModeShowed());
                    boolean z = this.pinned;
                    AnonymousClass2 anonymousClass2 = cacheControlActivity.nestedSizeNotifierLayout;
                    NestedSizeNotifierLayout.ChildLayout childLayout = anonymousClass2.childLayout;
                    if (z != (childLayout != null && childLayout.getTop() == anonymousClass2.maxTop)) {
                        AnonymousClass2 anonymousClass3 = cacheControlActivity.nestedSizeNotifierLayout;
                        NestedSizeNotifierLayout.ChildLayout childLayout2 = anonymousClass3.childLayout;
                        this.pinned = childLayout2 != null && childLayout2.getTop() == anonymousClass3.maxTop;
                        cacheControlActivity.nestedSizeNotifierLayout.invalidate();
                    }
                    break;
                case 1:
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.this$0;
                    if (chatAttachAlertPhotoLayout.gridView.getChildCount() > 0) {
                        chatAttachAlertPhotoLayout.parentAlert.updateLayout(chatAttachAlertPhotoLayout, true, i2);
                        if (chatAttachAlertPhotoLayout.adapter.getItemCount() > 30) {
                            boolean z2 = this.pinned;
                            boolean z3 = chatAttachAlertPhotoLayout.parentAlert.pinnedToTop;
                            if (z2 != z3) {
                                this.pinned = z3;
                                OKLCH.m(chatAttachAlertPhotoLayout.gridView.getFastScroll().animate(), this.pinned ? 1.0f : 0.0f, 100L);
                            }
                        } else {
                            chatAttachAlertPhotoLayout.gridView.getFastScroll().setAlpha(0.0f);
                        }
                        if (i2 != 0) {
                            chatAttachAlertPhotoLayout.checkCameraViewPosition();
                        }
                        break;
                    }
                    break;
                default:
                    StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) this.this$0;
                    boolean zCanScrollVertically = page.listView.canScrollVertically(1);
                    if (zCanScrollVertically != this.pinned) {
                        page.buttonContainer.invalidate();
                        this.pinned = zCanScrollVertically;
                    }
                    page.contentView.invalidate();
                    StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                    ((BottomSheet) storyPrivacyBottomSheet).containerView.invalidate();
                    if (page.pageType == 6) {
                        RecyclerListView recyclerListView = page.listView;
                        if (recyclerListView.getChildCount() > 0 && RecyclerView.getChildAdapterPosition(recyclerListView.getChildAt(0)) >= MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet).currentAccount).getStoriesController().blocklist.size()) {
                            MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet).currentAccount).getStoriesController().loadBlocklist();
                            break;
                        }
                    }
                    break;
            }
        }
    }

    public final class CacheChartHeader extends FrameLayout {
        public final Paint loadingBackgroundPaint;
        public final LoadingDrawable loadingDrawable;
        public final AnimatedFloat loadingFloat;
        public Float percent;
        public final AnimatedFloat percentAnimated;
        public final Paint percentPaint;
        public final RectF progressRect;
        public float[] radii;
        public Path roundPath;
        public final TextView[] subtitle;
        public final AnimatedTextView title;
        public Float usedPercent;
        public final AnimatedFloat usedPercentAnimated;
        public final Paint usedPercentPaint;

        public CacheChartHeader(Context context) {
            super(context);
            this.subtitle = new TextView[3];
            this.progressRect = new RectF();
            this.loadingDrawable = new LoadingDrawable();
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.percentAnimated = new AnimatedFloat(450L, this, cubicBezierInterpolator);
            this.usedPercentAnimated = new AnimatedFloat(450L, this, cubicBezierInterpolator);
            this.loadingFloat = new AnimatedFloat(450L, this, cubicBezierInterpolator);
            this.loadingBackgroundPaint = new Paint(1);
            this.percentPaint = new Paint(1);
            this.usedPercentPaint = new Paint(1);
            AnimatedTextView animatedTextView = new AnimatedTextView(context, false, false, false);
            this.title = animatedTextView;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = animatedTextView.drawable;
            animatedTextDrawable.moveAmplitude = 0.35f;
            animatedTextDrawable.animateDuration = 350L;
            animatedTextDrawable.animateWave = 1.0f;
            animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
            animatedTextView.setTypeface(AndroidUtilities.bold());
            animatedTextView.setTextSize(AndroidUtilities.dp(20.0f));
            animatedTextView.setText(LocaleController.getString(R.string.StorageUsage));
            animatedTextView.setGravity(17);
            animatedTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            addView(animatedTextView, LayoutHelper.createFrame(-2, 26, 49));
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
            LoadingDrawable loadingDrawable = this.loadingDrawable;
            loadingDrawable.getClass();
            loadingDrawable.setRadii(AndroidUtilities.dp(4.0f));
            this.loadingDrawable.setCallback(this);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            float alpha = 1.0f - this.subtitle[2].getAlpha();
            float f = this.loadingFloat.set(this.percent == null ? 1.0f : 0.0f, false);
            Float f2 = this.percent;
            float fFloatValue = f2 == null ? 0.0f : f2.floatValue();
            AnimatedFloat animatedFloat = this.percentAnimated;
            float f3 = animatedFloat.set(fFloatValue, false);
            Float f4 = this.usedPercent;
            float f5 = this.usedPercentAnimated.set(f4 == null ? 0.0f : f4.floatValue(), false);
            Paint paint = this.loadingBackgroundPaint;
            int i = Theme.key_actionBarActionModeDefaultSelector;
            paint.setColor(Theme.getColor(null, i, false));
            paint.setAlpha((int) (paint.getAlpha() * alpha));
            RectF rectF = AndroidUtilities.rectTmp;
            RectF rectF2 = this.progressRect;
            float f6 = 1.0f - f;
            rectF.set(Math.max((Math.max(AndroidUtilities.dp(4.0f), rectF2.width() * f5) * f6) + rectF2.left, (Math.max(AndroidUtilities.dp(4.0f), rectF2.width() * f3) * f6) + rectF2.left) + AndroidUtilities.dp(1.0f), rectF2.top, rectF2.right, rectF2.bottom);
            if (rectF.left < rectF.right && rectF.width() > AndroidUtilities.dp(3.0f)) {
                drawRoundRect(AndroidUtilities.dp(AndroidUtilities.lerp(1, 2, f)), AndroidUtilities.dp(2.0f), canvas, paint, rectF);
            }
            LoadingDrawable loadingDrawable = this.loadingDrawable;
            loadingDrawable.setBounds(rectF2);
            loadingDrawable.setAlpha((int) (255.0f * alpha * f));
            loadingDrawable.draw(canvas);
            Paint paint2 = this.usedPercentPaint;
            int i2 = Theme.key_radioBackgroundChecked;
            paint2.setColor(ColorUtils.blendARGB(0.75f, Theme.getColor(null, i2, false), Theme.getColor(null, i, false)));
            paint2.setAlpha((int) (paint2.getAlpha() * alpha));
            rectF.set((Math.max(AndroidUtilities.dp(4.0f), rectF2.width() * f3) * f6) + rectF2.left + AndroidUtilities.dp(1.0f), rectF2.top, (Math.max(AndroidUtilities.dp(4.0f), rectF2.width() * f5) * f6) + rectF2.left, rectF2.bottom);
            if (rectF.width() > AndroidUtilities.dp(3.0f)) {
                drawRoundRect(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(f5 > 0.97f ? 2.0f : 1.0f), canvas, paint2, rectF);
            }
            Paint paint3 = this.percentPaint;
            paint3.setColor(Theme.getColor(null, i2, false));
            paint3.setAlpha((int) (paint3.getAlpha() * alpha));
            float f7 = rectF2.left;
            rectF.set(f7, rectF2.top, (Math.max(AndroidUtilities.dp(4.0f), rectF2.width() * f3) * f6) + f7, rectF2.bottom);
            drawRoundRect(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(f3 > 0.97f ? 2.0f : 1.0f), canvas, paint3, rectF);
            if (f > 0.0f || animatedFloat.transition) {
                invalidate();
            }
            super.dispatchDraw(canvas);
        }

        public final void drawRoundRect(float f, float f2, Canvas canvas, Paint paint, RectF rectF) {
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

        @Override
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int iMin = (int) Math.min(AndroidUtilities.dp(174.0f), ((double) size) * 0.8d);
            measureChildren(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
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

        public final void setData(float f, float f2, boolean z) {
            this.title.setText(z ? LocaleController.getString(R.string.StorageUsage) : LocaleController.getString(R.string.StorageCleared));
            if (z) {
                TextView[] textViewArr = this.subtitle;
                if (f < 0.01f) {
                    textViewArr[1].setText(LocaleController.formatString(R.string.StorageUsageTelegramLess, CacheControlActivity.access$1700(f)));
                } else {
                    textViewArr[1].setText(LocaleController.formatString(R.string.StorageUsageTelegram, CacheControlActivity.access$1700(f)));
                }
                switchSubtitle(1);
            } else {
                switchSubtitle(2);
            }
            this.percent = Float.valueOf(f);
            this.usedPercent = Float.valueOf(f2);
            invalidate();
        }

        public final void switchSubtitle(int i) {
            boolean z = System.currentTimeMillis() - CacheControlActivity.this.fragmentCreateTime > 40;
            TextView[] textViewArr = this.subtitle;
            updateViewVisible(textViewArr[0], i == 0, z);
            updateViewVisible(textViewArr[1], i == 1, z);
            updateViewVisible(textViewArr[2], i == 2, z);
        }

        public final void updateViewVisible(TextView textView, boolean z, boolean z2) {
            if (textView == null) {
                return;
            }
            if (textView.getParent() == null) {
                z2 = false;
            }
            textView.animate().setListener(null).cancel();
            if (!z2) {
                textView.setVisibility(z ? 0 : 4);
                textView.setTag(z ? 1 : null);
                textView.setAlpha(z ? 1.0f : 0.0f);
                textView.setTranslationY(z ? 0.0f : AndroidUtilities.dp(8.0f));
                invalidate();
                return;
            }
            if (!z) {
                final int i = 1;
                textView.animate().alpha(0.0f).translationY(AndroidUtilities.dp(8.0f)).setListener(new ChatActivity.AnonymousClass77(textView)).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final CacheControlActivity.CacheChartHeader f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i) {
                            case 0:
                                this.f$0.invalidate();
                                break;
                            default:
                                this.f$0.invalidate();
                                break;
                        }
                    }
                }).start();
                return;
            }
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
                textView.setTranslationY(AndroidUtilities.dp(8.0f));
            }
            final int i2 = 0;
            textView.animate().alpha(1.0f).translationY(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final CacheControlActivity.CacheChartHeader f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i2) {
                        case 0:
                            this.f$0.invalidate();
                            break;
                        default:
                            this.f$0.invalidate();
                            break;
                    }
                }
            }).start();
        }
    }

    public class ClearCacheButton extends FrameLayout {
        public final ChatActivity.AnonymousClass60 button;
        public final AnimatedTextView.AnimatedTextDrawable textView;
        public final AnimatedTextView.AnimatedTextDrawable valueTextView;

        public ClearCacheButton(Context context) {
            super(context);
            ChatActivity.AnonymousClass60 anonymousClass60 = new ChatActivity.AnonymousClass60(this, context, 4);
            this.button = anonymousClass60;
            int i = Theme.key_featuredStickers_addButton;
            anonymousClass60.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{24.0f}, i));
            anonymousClass60.setImportantForAccessibility(1);
            ScaleStateListAnimator.apply(anonymousClass60, 0.02f, 1.2f);
            if (LocaleController.isRTL) {
                TextView textView = new TextView(context);
                textView.setText(LocaleController.getString(R.string.ClearCache));
                textView.setGravity(17);
                textView.setTextSize(1, 14.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
                anonymousClass60.addView(textView, LayoutHelper.createFrame(-2, -1, 17));
            }
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, true, true, false);
            this.textView = animatedTextDrawable;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            animatedTextDrawable.moveAmplitude = 0.25f;
            animatedTextDrawable.animateDuration = 300L;
            animatedTextDrawable.animateWave = 1.0f;
            animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
            animatedTextDrawable.setCallback(anonymousClass60);
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(14.0f));
            animatedTextDrawable.setText(LocaleController.getString(R.string.ClearCache), true, true);
            animatedTextDrawable.gravity = 5;
            Typeface typefaceBold = AndroidUtilities.bold();
            TextPaint textPaint = animatedTextDrawable.textPaint;
            textPaint.setTypeface(typefaceBold);
            int i2 = Theme.key_featuredStickers_buttonText;
            int color = Theme.getColor(null, i2, false);
            textPaint.setColor(color);
            animatedTextDrawable.alpha = Color.alpha(color);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(true, true, true, false);
            this.valueTextView = animatedTextDrawable2;
            animatedTextDrawable2.moveAmplitude = 0.25f;
            animatedTextDrawable2.animateDuration = 300L;
            animatedTextDrawable2.animateWave = 1.0f;
            animatedTextDrawable2.animateInterpolator = cubicBezierInterpolator;
            animatedTextDrawable2.setCallback(anonymousClass60);
            animatedTextDrawable2.setTextSize(AndroidUtilities.dp(14.0f));
            Typeface typefaceBold2 = AndroidUtilities.bold();
            TextPaint textPaint2 = animatedTextDrawable2.textPaint;
            textPaint2.setTypeface(typefaceBold2);
            int iBlendOver = Theme.blendOver(Theme.getColor(null, i, false), Theme.multAlpha(0.7f, Theme.getColor(null, i2, false)));
            textPaint2.setColor(iBlendOver);
            animatedTextDrawable2.alpha = Color.alpha(iBlendOver);
            animatedTextDrawable2.setText("", true, true);
            anonymousClass60.setContentDescription(TextUtils.concat(animatedTextDrawable.currentText, "\t", animatedTextDrawable2.currentText));
            addView(anonymousClass60, LayoutHelper.createFrame(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        public void setDisabled(boolean z) {
            ChatActivity.AnonymousClass60 anonymousClass60 = this.button;
            anonymousClass60.animate().cancel();
            anonymousClass60.animate().alpha(z ? 0.65f : 1.0f).start();
            anonymousClass60.setClickable(!z);
        }

        public final void setSize(long j, boolean z) {
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.textView;
            animatedTextDrawable.setText(z ? LocaleController.getString(R.string.ClearCache) : LocaleController.getString(R.string.ClearSelectedCache), true, true);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.valueTextView;
            animatedTextDrawable2.setText(j <= 0 ? "" : AndroidUtilities.formatFileSize(j), true, true);
            setDisabled(j <= 0);
            ChatActivity.AnonymousClass60 anonymousClass60 = this.button;
            anonymousClass60.invalidate();
            anonymousClass60.setContentDescription(TextUtils.concat(animatedTextDrawable.currentText, "\t", animatedTextDrawable2.currentText));
        }
    }

    public final class ClearCacheButtonInternal extends ClearCacheButton {

        public final class AnonymousClass1 extends BottomSheet {
            @Override
            public final boolean canDismissWithTouchOutside() {
                return false;
            }
        }

        public ClearCacheButtonInternal(Context context) {
            super(context);
            ((ViewGroup.MarginLayoutParams) this.button.getLayoutParams()).topMargin = AndroidUtilities.dp(5.0f);
            this.button.setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda38(this, 13));
        }
    }

    public final class DialogFileEntities {
        public long dialogId;
        public final SparseArray entitiesByType = new SparseArray();
        public int filesCount;
        public long totalSize;

        public DialogFileEntities(long j) {
            this.dialogId = j;
        }

        public final void addFile(CacheModel.FileInfo fileInfo, int i) {
            SparseArray sparseArray = this.entitiesByType;
            FileEntities fileEntities = (FileEntities) sparseArray.get(i, null);
            if (fileEntities == null) {
                fileEntities = new FileEntities();
                sparseArray.put(i, fileEntities);
            }
            long j = fileInfo.size;
            fileEntities.totalSize += j;
            this.totalSize += j;
            this.filesCount++;
            fileEntities.files.add(fileInfo);
        }
    }

    public final class FileEntities {
        public final ArrayList files = new ArrayList();
        public long totalSize;
    }

    public final class ListAdapter extends AdapterWithDiffUtils {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return CacheControlActivity.this.itemInners.size();
        }

        @Override
        public final int getItemViewType(int i) {
            return ((ItemInner) CacheControlActivity.this.itemInners.get(i)).viewType;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            long adapterPosition = viewHolder.getAdapterPosition();
            CacheControlActivity cacheControlActivity = CacheControlActivity.this;
            if (adapterPosition == cacheControlActivity.migrateOldFolderRow) {
                return true;
            }
            int i = viewHolder.mItemViewType;
            return (i == 2 && cacheControlActivity.totalSize > 0 && !cacheControlActivity.calculating) || i == 5 || i == 7 || i == 11;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            int i3 = 14;
            CacheControlActivity cacheControlActivity = CacheControlActivity.this;
            ArrayList arrayList = cacheControlActivity.itemInners;
            ItemInner itemInner = (ItemInner) arrayList.get(i);
            int i4 = viewHolder.mItemViewType;
            View view = viewHolder.itemView;
            if (i4 == 0) {
                TextSettingsCell textSettingsCell = (TextSettingsCell) view;
                if (i == cacheControlActivity.migrateOldFolderRow) {
                    textSettingsCell.setTextAndValue(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
                    return;
                }
                return;
            }
            if (i4 == 1) {
                ((TextInfoPrivacyCell) view).setText(AndroidUtilities.replaceTags(itemInner.text));
                return;
            }
            if (i4 != 2) {
                if (i4 == 3) {
                    HeaderCell headerCell = (HeaderCell) view;
                    headerCell.setText(((ItemInner) arrayList.get(i)).headerName);
                    ((ItemInner) arrayList.get(i)).getClass();
                    headerCell.setTopMargin(15);
                    ((ItemInner) arrayList.get(i)).getClass();
                    headerCell.setBottomMargin(0);
                    return;
                }
                if (i4 == 7) {
                    TextCell textCell = (TextCell) view;
                    CacheByChatsController cacheByChatsController = cacheControlActivity.getMessagesController().getCacheByChatsController();
                    int i5 = itemInner.keepMediaType;
                    int size = cacheByChatsController.getKeepMediaExceptions(((ItemInner) arrayList.get(i)).keepMediaType).size();
                    String pluralString = size > 0 ? LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size)) : null;
                    String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i5));
                    if (((ItemInner) arrayList.get(i)).keepMediaType == 0) {
                        textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                    } else if (((ItemInner) arrayList.get(i)).keepMediaType == 1) {
                        textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                    } else if (((ItemInner) arrayList.get(i)).keepMediaType == 2) {
                        textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                    } else if (((ItemInner) arrayList.get(i)).keepMediaType == 3) {
                        textCell.setTextAndValueAndColorfulIcon(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                    }
                    textCell.setSubtitle(pluralString);
                    return;
                }
                switch (i4) {
                    case 9:
                        cacheControlActivity.updateChart();
                        break;
                    case 10:
                        CacheChartHeader cacheChartHeader = cacheControlActivity.cacheChartHeader;
                        if (cacheChartHeader != null && !cacheControlActivity.calculating) {
                            long j = cacheControlActivity.totalSize;
                            boolean z = j > 0;
                            long j2 = cacheControlActivity.totalDeviceSize;
                            float f = j2 <= 0 ? 0.0f : j / j2;
                            long j3 = cacheControlActivity.totalDeviceFreeSize;
                            cacheChartHeader.setData(f, (j3 <= 0 || j2 <= 0) ? 0.0f : (j2 - j3) / j2, z);
                            break;
                        }
                        break;
                    case 11:
                        CheckBoxCell checkBoxCell = (CheckBoxCell) view;
                        int i6 = itemInner.index;
                        boolean zIsOtherSelected = i6 < 0 ? cacheControlActivity.isOtherSelected() : cacheControlActivity.selected[i6];
                        String str = itemInner.headerName;
                        int[] iArr = cacheControlActivity.percents;
                        int i7 = itemInner.index;
                        if (i7 < 0) {
                            i7 = 9;
                        }
                        int i8 = iArr[i7];
                        SpannableString spannableString = new SpannableString(i8 <= 0 ? String.format("<%.1f%%", Float.valueOf(1.0f)) : String.format("%d%%", Integer.valueOf(i8)));
                        spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                        spannableString.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                        spannableStringBuilder.append((CharSequence) "  ");
                        spannableStringBuilder.append((CharSequence) spannableString);
                        checkBoxCell.setText(spannableStringBuilder, AndroidUtilities.formatFileSize(itemInner.size), zIsOtherSelected, itemInner.index >= 0 ? !itemInner.last : !cacheControlActivity.collapsed, false);
                        int i9 = itemInner.colorKey;
                        int i10 = Theme.key_checkboxCheck;
                        CheckBox2 checkBox2 = checkBoxCell.checkBoxRound;
                        if (checkBox2 != null) {
                            checkBox2.checkBoxBase.setColor(i9, i9, i10);
                        }
                        checkBoxCell.setCollapsed(itemInner.index < 0 ? Boolean.valueOf(cacheControlActivity.collapsed) : null);
                        if (itemInner.index == -1) {
                            checkBoxCell.setOnSectionsClickListener(new CallLogActivity$$ExternalSyntheticLambda38(this, i3), new ChatActivity$$ExternalSyntheticLambda77(i3, this, checkBoxCell));
                        } else {
                            checkBoxCell.setOnSectionsClickListener(null, null);
                        }
                        checkBoxCell.setPad(itemInner.pad ? 1 : 0);
                        break;
                }
                return;
            }
            final StorageUsageView storageUsageView = (StorageUsageView) view;
            boolean z2 = cacheControlActivity.calculating;
            long j4 = cacheControlActivity.databaseSize;
            long j5 = cacheControlActivity.totalSize;
            long j6 = cacheControlActivity.totalDeviceFreeSize;
            long j7 = cacheControlActivity.totalDeviceSize;
            storageUsageView.calculating = z2;
            TextView textView = storageUsageView.freeSizeTextView;
            textView.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j6)));
            TextView textView2 = storageUsageView.totlaSizeTextView;
            long j8 = j7 - j6;
            textView2.setText(LocaleController.formatString("TotalDeviceSize", R.string.TotalDeviceSize, AndroidUtilities.formatFileSize(j8)));
            View view2 = storageUsageView.divider;
            TextView textView3 = storageUsageView.telegramDatabaseTextView;
            TextView textView4 = storageUsageView.telegramCacheTextView;
            TextView textView5 = storageUsageView.calculatingTextView;
            AvatarPreviewer avatarPreviewer = storageUsageView.ellipsizeSpanAnimator;
            TextSettingsCell textSettingsCell2 = storageUsageView.textSettingsCell;
            if (z2) {
                textView5.setVisibility(0);
                textView4.setVisibility(8);
                textView.setVisibility(8);
                textView2.setVisibility(8);
                textView3.setVisibility(8);
                view2.setVisibility(8);
                textSettingsCell2.setVisibility(8);
                storageUsageView.progress = 0.0f;
                storageUsageView.progress2 = 0.0f;
                if (avatarPreviewer != null) {
                    avatarPreviewer.addView(textView5);
                }
            } else {
                if (avatarPreviewer != null) {
                    avatarPreviewer.removeView(textView5);
                }
                textView5.setVisibility(8);
                if (j5 > 0) {
                    i2 = 0;
                    view2.setVisibility(0);
                    textSettingsCell2.setVisibility(0);
                    textView4.setVisibility(0);
                    textView3.setVisibility(8);
                    textSettingsCell2.setTextAndValue(LocaleController.getString(R.string.ClearTelegramCache), AndroidUtilities.formatFileSize(j5), false, true);
                    textView4.setText(LocaleController.formatString("TelegramCacheSize", R.string.TelegramCacheSize, AndroidUtilities.formatFileSize(j5 + j4)));
                } else {
                    i2 = 0;
                    textView4.setVisibility(8);
                    textView3.setVisibility(0);
                    textView3.setText(LocaleController.formatString("LocalDatabaseSize", R.string.LocalDatabaseSize, AndroidUtilities.formatFileSize(j4)));
                    view2.setVisibility(8);
                    textSettingsCell2.setVisibility(8);
                }
                textView.setVisibility(i2);
                textView2.setVisibility(i2);
                float f2 = j7;
                float f3 = (j5 + j4) / f2;
                float f4 = j8 / f2;
                if (storageUsageView.progress != f3) {
                    ValueAnimator valueAnimator = storageUsageView.valueAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    final int i11 = 0;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(storageUsageView.progress, f3);
                    storageUsageView.valueAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            switch (i11) {
                                case 0:
                                    StorageUsageView storageUsageView2 = storageUsageView;
                                    storageUsageView2.getClass();
                                    storageUsageView2.progress = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    storageUsageView2.invalidate();
                                    break;
                                default:
                                    StorageUsageView storageUsageView3 = storageUsageView;
                                    storageUsageView3.getClass();
                                    storageUsageView3.progress2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    storageUsageView3.invalidate();
                                    break;
                            }
                        }
                    });
                    storageUsageView.valueAnimator.start();
                }
                if (storageUsageView.progress2 != f4) {
                    ValueAnimator valueAnimator2 = storageUsageView.valueAnimator2;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    final int i12 = 1;
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(storageUsageView.progress2, f4);
                    storageUsageView.valueAnimator2 = valueAnimatorOfFloat2;
                    valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                            switch (i12) {
                                case 0:
                                    StorageUsageView storageUsageView2 = storageUsageView;
                                    storageUsageView2.getClass();
                                    storageUsageView2.progress = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                    storageUsageView2.invalidate();
                                    break;
                                default:
                                    StorageUsageView storageUsageView3 = storageUsageView;
                                    storageUsageView3.getClass();
                                    storageUsageView3.progress2 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                    storageUsageView3.invalidate();
                                    break;
                            }
                        }
                    });
                    storageUsageView.valueAnimator2.start();
                }
            }
            textSettingsCell2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            storageUsageView.requestLayout();
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ?? checkBoxCell;
            SlideChooseView slideChooseView;
            int i2 = 2;
            int i3 = 1;
            Context context = this.mContext;
            if (i != 0) {
                CacheControlActivity cacheControlActivity = CacheControlActivity.this;
                switch (i) {
                    case 2:
                        checkBoxCell = new StorageUsageView(context);
                        break;
                    case 3:
                        checkBoxCell = new HeaderCell(context);
                        break;
                    case 4:
                        slideChooseView = new SlideChooseView(context, null);
                        slideChooseView.setCallback(new ChatActivity$$ExternalSyntheticLambda131(i2));
                        int i4 = SharedConfig.keepMedia;
                        slideChooseView.setOptions(i4 == 3 ? 0 : i4 + 1, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                        checkBoxCell = slideChooseView;
                        break;
                    case 5:
                        checkBoxCell = new UserCell(cacheControlActivity.getParentActivity(), cacheControlActivity.getResourceProvider());
                        break;
                    case 6:
                        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(cacheControlActivity.getParentActivity(), null);
                        flickerLoadingView.setIsSingleCell(true);
                        flickerLoadingView.setItemsCount(3);
                        flickerLoadingView.setIgnoreHeightCheck(true);
                        flickerLoadingView.setViewType(25);
                        checkBoxCell = flickerLoadingView;
                        break;
                    case 7:
                        checkBoxCell = new TextCell(context);
                        break;
                    case 8:
                        DialogCacheBottomSheet.AnonymousClass3 anonymousClass3 = new DialogCacheBottomSheet.AnonymousClass3(this, context, cacheControlActivity, i3);
                        cacheControlActivity.cachedMediaLayout = anonymousClass3;
                        anonymousClass3.setDelegate(new Stripe(this, 15));
                        cacheControlActivity.cachedMediaLayout.setCacheModel(cacheControlActivity.cacheModel);
                        cacheControlActivity.nestedSizeNotifierLayout.setChildLayout(cacheControlActivity.cachedMediaLayout, AndroidUtilities.dp(40.0f));
                        anonymousClass3.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                        checkBoxCell = anonymousClass3;
                        break;
                    case 9:
                        ?? r9 = new CacheChart(context) {
                            {
                                int[] iArr = CacheChart.DEFAULT_COLORS;
                                int[] iArr2 = CacheChart.DEFAULT_PARTICLES;
                            }

                            @Override
                            public final void onSectionDown(int i5, boolean z) {
                                CacheControlActivity cacheControlActivity2 = CacheControlActivity.this;
                                if (!z) {
                                    cacheControlActivity2.listView.removeHighlightRow();
                                    return;
                                }
                                int i6 = -1;
                                if (i5 == 8) {
                                    i5 = -1;
                                }
                                for (int i7 = 0; i7 < cacheControlActivity2.itemInners.size(); i7++) {
                                    ItemInner itemInner = (ItemInner) cacheControlActivity2.itemInners.get(i7);
                                    if (itemInner != null && itemInner.viewType == 11 && itemInner.index == i5) {
                                        i6 = i7;
                                        break;
                                    }
                                }
                                if (i6 >= 0) {
                                    cacheControlActivity2.listView.highlightRowInternal(new LogoutActivity$$ExternalSyntheticLambda1(i6, 3), 0, true);
                                } else {
                                    cacheControlActivity2.listView.removeHighlightRow();
                                }
                            }
                        };
                        cacheControlActivity.cacheChart = r9;
                        r9.setTag(-33024);
                        checkBoxCell = r9;
                        break;
                    case 10:
                        CacheChartHeader cacheChartHeader = cacheControlActivity.new CacheChartHeader(context);
                        cacheControlActivity.cacheChartHeader = cacheChartHeader;
                        cacheChartHeader.setTag(-33024);
                        checkBoxCell = cacheChartHeader;
                        break;
                    case 11:
                        checkBoxCell = new CheckBoxCell(this.mContext, 4, 21, false, cacheControlActivity.getResourceProvider());
                        break;
                    case 12:
                        FlickerLoadingView flickerLoadingView2 = new FlickerLoadingView(cacheControlActivity.getParentActivity(), null);
                        flickerLoadingView2.setIsSingleCell(true);
                        flickerLoadingView2.setItemsCount(1);
                        flickerLoadingView2.setIgnoreHeightCheck(true);
                        flickerLoadingView2.setViewType(26);
                        checkBoxCell = flickerLoadingView2;
                        break;
                    case 13:
                        ClearCacheButtonInternal clearCacheButtonInternal = cacheControlActivity.new ClearCacheButtonInternal(context);
                        cacheControlActivity.clearCacheButton = clearCacheButtonInternal;
                        checkBoxCell = clearCacheButtonInternal;
                        break;
                    case 14:
                        slideChooseView = new SlideChooseView(context, null);
                        float f = ((int) ((cacheControlActivity.totalDeviceSize / 1024) / 1024)) / 1000.0f;
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
                        slideChooseView.setCallback(new WindowVisibilityManager$$ExternalSyntheticLambda0(arrayList, 27));
                        int iIndexOf = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", Integer.MAX_VALUE)));
                        if (iIndexOf < 0) {
                            iIndexOf = arrayList.size() - 1;
                        }
                        slideChooseView.setOptions(iIndexOf, null, strArr);
                        checkBoxCell = slideChooseView;
                        break;
                    default:
                        checkBoxCell = new TextInfoPrivacyCell(context, 24, null);
                        break;
                }
            } else {
                checkBoxCell = new TextSettingsCell(context, 0, null);
            }
            return new RecyclerListView.Holder(checkBoxCell);
        }
    }

    public final class UserCell extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
        public boolean canDisable;
        public CheckBox2 checkBox;
        public DialogFileEntities dialogFileEntities;
        public final BackupImageView imageView;
        public boolean needDivider;
        public final Theme.ResourcesProvider resourcesProvider;
        public final TextView textView;
        public final AnimatedTextView valueTextView;

        public UserCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setSingleLine();
            textView.setLines(1);
            textView.setMaxLines(1);
            textView.setTextSize(1, 16.0f);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            boolean z = LocaleController.isRTL;
            addView(textView, LayoutHelper.createFrame(-1, -1.0f, (z ? 5 : 3) | 48, z ? 21.0f : 72.0f, 0.0f, z ? 72.0f : 21.0f, 0.0f));
            AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, !LocaleController.isRTL);
            this.valueTextView = animatedTextView;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = animatedTextView.drawable;
            animatedTextDrawable.moveAmplitude = 0.55f;
            animatedTextDrawable.animateDuration = 320L;
            animatedTextDrawable.animateWave = 1.0f;
            animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
            animatedTextView.setTextSize(AndroidUtilities.dp(16.0f));
            animatedTextView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
            animatedTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteValueText, resourcesProvider));
            boolean z2 = LocaleController.isRTL;
            addView(animatedTextView, LayoutHelper.createFrame(-2, -1.0f, (z2 ? 3 : 5) | 48, z2 ? 21.0f : 72.0f, 0.0f, z2 ? 72.0f : 21.0f, 0.0f));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.getAvatarDrawable().scaleSize = 0.8f;
            addView(backupImageView, LayoutHelper.createFrame(38, 38.0f, (LocaleController.isRTL ? 5 : 3) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            TextView textView;
            if (i != NotificationCenter.emojiLoaded || (textView = this.textView) == null) {
                return;
            }
            textView.invalidate();
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
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
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            StringBuilder sb = new StringBuilder();
            sb.append((Object) this.textView.getText());
            AnimatedTextView animatedTextView = this.valueTextView;
            if (animatedTextView == null || animatedTextView.getVisibility() != 0) {
                str = "";
            } else {
                str = "\n" + ((Object) animatedTextView.getText());
            }
            sb.append(str);
            accessibilityNodeInfo.setText(sb.toString());
            accessibilityNodeInfo.setEnabled(isEnabled());
        }

        @Override
        public final void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(50.0f) + (this.needDivider ? 1 : 0));
            int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
            int i3 = measuredWidth / 2;
            BackupImageView backupImageView = this.imageView;
            if (backupImageView.getVisibility() == 0) {
                backupImageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(38.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(38.0f), 1073741824));
            }
            AnimatedTextView animatedTextView = this.valueTextView;
            if (animatedTextView.getVisibility() == 0) {
                animatedTextView.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                measuredWidth = (measuredWidth - animatedTextView.getMeasuredWidth()) - AndroidUtilities.dp(8.0f);
            }
            int iDp = AndroidUtilities.dp(12.0f) + animatedTextView.getMeasuredWidth();
            boolean z = LocaleController.isRTL;
            TextView textView = this.textView;
            if (z) {
                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = iDp;
            } else {
                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = iDp;
            }
            textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - iDp, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            CheckBox2 checkBox2 = this.checkBox;
            if (checkBox2 != null) {
                checkBox2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
            }
        }

        public void setCanDisable(boolean z) {
            this.canDisable = z;
        }

        @Override
        public void setEnabled(boolean z) {
            super.setEnabled(z);
            float f = 1.0f;
            this.textView.setAlpha((z || !this.canDisable) ? 1.0f : 0.5f);
            AnimatedTextView animatedTextView = this.valueTextView;
            if (animatedTextView.getVisibility() == 0) {
                if (!z && this.canDisable) {
                    f = 0.5f;
                }
                animatedTextView.setAlpha(f);
            }
        }

        public void setTextColor(int i) {
            this.textView.setTextColor(i);
        }

        public void setTextValueColor(int i) {
            this.valueTextView.setTextColor(i);
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
        this.oldItems = new ArrayList();
        this.itemInners = new ArrayList();
        this.actionBarShadowAlpha = 1.0f;
    }

    public static String access$1700(float f) {
        if (f < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float fRound = Math.round(f * 100.0f);
        return fRound <= 0.0f ? String.format("<%d%%", 1) : String.format("%d%%", Integer.valueOf((int) fRound));
    }

    public static void access$4000(CacheControlActivity cacheControlActivity) {
        String pluralString;
        if (cacheControlActivity.cacheModel.selectedFiles.size() <= 0) {
            cacheControlActivity.cachedMediaLayout.showActionMode(false);
            return;
        }
        if (cacheControlActivity.cachedMediaLayout != null) {
            if (cacheControlActivity.cacheModel.selectedDialogs.isEmpty()) {
                pluralString = LocaleController.formatPluralString("Files", cacheControlActivity.cacheModel.selectedFiles.size(), Integer.valueOf(cacheControlActivity.cacheModel.selectedFiles.size()));
            } else {
                ArrayList arrayList = cacheControlActivity.cacheModel.entities;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    DialogFileEntities dialogFileEntities = (DialogFileEntities) obj;
                    if (cacheControlActivity.cacheModel.selectedDialogs.contains(Long.valueOf(dialogFileEntities.dialogId))) {
                        i2 += dialogFileEntities.filesCount;
                    }
                }
                int size2 = cacheControlActivity.cacheModel.selectedFiles.size() - i2;
                pluralString = size2 > 0 ? zzkc.m(LocaleController.formatPluralString("Chats", cacheControlActivity.cacheModel.selectedDialogs.size(), Integer.valueOf(cacheControlActivity.cacheModel.selectedDialogs.size())), ", ", LocaleController.formatPluralString("Files", size2, Integer.valueOf(size2))) : LocaleController.formatPluralString("Chats", cacheControlActivity.cacheModel.selectedDialogs.size(), Integer.valueOf(cacheControlActivity.cacheModel.selectedDialogs.size()));
            }
            cacheControlActivity.actionModeTitle.setText(AndroidUtilities.formatFileSize(cacheControlActivity.cacheModel.selectedSize), !LocaleController.isRTL, true);
            cacheControlActivity.actionModeSubtitle.setText(pluralString, !LocaleController.isRTL, true);
            cacheControlActivity.cachedMediaLayout.showActionMode(true);
        }
    }

    public static void calculateTotalSize(Utilities.Callback callback) {
        Long l = lastTotalSizeCalculated;
        if (l != null) {
            callback.run(l);
            if (System.currentTimeMillis() - lastTotalSizeCalculatedTime < 5000) {
                return;
            }
        }
        Utilities.cacheClearQueue.postRunnable(new CacheControlActivity$$ExternalSyntheticLambda3(0, callback));
    }

    public static void cleanDirJava(String str, int i, int[] iArr, CacheControlActivity$$ExternalSyntheticLambda23 cacheControlActivity$$ExternalSyntheticLambda23) {
        File[] fileArrListFiles;
        int i2;
        int iCountDirJava = countDirJava(i, str);
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
                    if ((!z || i != 1) && ((z || i != 2) && ((!z2 || i != 5) && ((z2 || i != 3) && ((!z3 || i != 5) && (z3 || i != 4)))))) {
                        if (file2.isDirectory()) {
                            file2.delete();
                            i2 = iArr[0] + 1;
                            iArr[0] = i2;
                            if (cacheControlActivity$$ExternalSyntheticLambda23 != null) {
                                cacheControlActivity$$ExternalSyntheticLambda23.run(Float.valueOf(i2 / iCountDirJava));
                            }
                        } else if ("drafts".equals(file2.getName())) {
                            cleanDirJava(zzit.m(str, "/", name), i, iArr, cacheControlActivity$$ExternalSyntheticLambda23);
                        }
                    }
                } else if (file2.isDirectory()) {
                    file2.delete();
                    i2 = iArr[0] + 1;
                    iArr[0] = i2;
                    if (cacheControlActivity$$ExternalSyntheticLambda23 != null) {
                        cacheControlActivity$$ExternalSyntheticLambda23.run(Float.valueOf(i2 / iCountDirJava));
                    }
                } else if ("drafts".equals(file2.getName())) {
                    cleanDirJava(zzit.m(str, "/", name), i, iArr, cacheControlActivity$$ExternalSyntheticLambda23);
                }
            }
        }
    }

    public static int countDirJava(int i, String str) {
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
                    boolean z = lowerCase.endsWith(".mp3") || lowerCase.endsWith(".m4a");
                    boolean z2 = lowerCase.endsWith(".tgs") || lowerCase.endsWith(".webm");
                    boolean z3 = lowerCase.endsWith(".tmp") || lowerCase.endsWith(".temp") || lowerCase.endsWith(".preload");
                    if ((!z || i != 1) && ((z || i != 2) && ((!z2 || i != 5) && ((z2 || i != 3) && ((!z3 || i != 5) && (z3 || i != 4)))))) {
                        if (file2.isDirectory()) {
                            iCountDirJava += countDirJava(i, str + "/" + name);
                        } else {
                            iCountDirJava++;
                        }
                    }
                } else if (file2.isDirectory()) {
                    iCountDirJava += countDirJava(i, str + "/" + name);
                } else {
                    iCountDirJava++;
                }
            }
        }
        return iCountDirJava;
    }

    public static void getDeviceTotalSize(GiftSheet$$ExternalSyntheticLambda8 giftSheet$$ExternalSyntheticLambda8) {
        Long l;
        Long l2 = lastDeviceTotalSize;
        if (l2 == null || (l = lastDeviceTotalFreeSize) == null) {
            Utilities.cacheClearQueue.postRunnable(new ArticleViewer$$ExternalSyntheticLambda3(giftSheet$$ExternalSyntheticLambda8, 21));
        } else {
            giftSheet$$ExternalSyntheticLambda8.run(l2, l);
        }
    }

    public static long getDirectorySize(int i, File file) {
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

    public static boolean pathContains(int i, String str) {
        if (str == null || FileLoader.checkDirectory(i) == null) {
            return false;
        }
        return str.contains(FileLoader.checkDirectory(i).getAbsolutePath());
    }

    public final void cleanupDialogFiles(DialogFileEntities dialogFileEntities, StorageDiagramView.ClearViewData[] clearViewDataArr, CacheModel cacheModel) {
        long j;
        FileEntities fileEntities;
        HashSet hashSet;
        StorageDiagramView.ClearViewData clearViewData;
        AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3, null);
        alertDialog.canCacnel = false;
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 500L);
        HashSet hashSet2 = new HashSet();
        long j2 = this.totalSize;
        int i = 0;
        while (i < 8) {
            if ((clearViewDataArr == null || ((clearViewData = clearViewDataArr[i]) != null && clearViewData.clear)) && (fileEntities = (FileEntities) dialogFileEntities.entitiesByType.get(i)) != null) {
                ArrayList arrayList = fileEntities.files;
                hashSet2.addAll(arrayList);
                hashSet = hashSet2;
                long j3 = dialogFileEntities.totalSize;
                long j4 = fileEntities.totalSize;
                dialogFileEntities.totalSize = j3 - j4;
                this.totalSize -= j4;
                this.totalDeviceFreeSize += j4;
                dialogFileEntities.entitiesByType.delete(i);
                if (i == 0) {
                    this.photoSize -= fileEntities.totalSize;
                } else if (i == 1) {
                    this.videoSize -= fileEntities.totalSize;
                } else if (i == 2) {
                    this.documentsSize -= fileEntities.totalSize;
                } else if (i == 3) {
                    this.musicSize -= fileEntities.totalSize;
                } else if (i == 4) {
                    this.audioSize -= fileEntities.totalSize;
                } else if (i == 5) {
                    this.stickersCacheSize -= fileEntities.totalSize;
                } else if (i == 7) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        CacheModel.FileInfo fileInfo = (CacheModel.FileInfo) arrayList.get(i2);
                        String absolutePath = ((CacheModel.FileInfo) arrayList.get(i2)).file.getAbsolutePath();
                        char c = 6;
                        if (pathContains(6, absolutePath)) {
                            c = 7;
                        } else if (pathContains(0, absolutePath) || pathContains(100, absolutePath)) {
                            c = 0;
                        } else if (pathContains(2, absolutePath) || pathContains(101, absolutePath)) {
                            c = 1;
                        }
                        if (c == 7) {
                            this.storiesSize -= fileInfo.size;
                        } else if (c == 0) {
                            this.photoSize -= fileInfo.size;
                        } else if (c == 1) {
                            this.videoSize -= fileInfo.size;
                        } else {
                            this.cacheSize -= fileInfo.size;
                        }
                    }
                } else {
                    this.cacheSize -= fileEntities.totalSize;
                }
            } else {
                hashSet = hashSet2;
            }
            i++;
            hashSet2 = hashSet;
        }
        HashSet hashSet3 = hashSet2;
        if (dialogFileEntities.entitiesByType.size() == 0) {
            this.cacheModel.entities.remove(dialogFileEntities);
        }
        updateRows$1(true);
        if (cacheModel != null) {
            for (CacheModel.FileInfo fileInfo2 : cacheModel.selectedFiles) {
                hashSet3 = hashSet3;
                if (!hashSet3.contains(fileInfo2)) {
                    long j5 = this.totalSize;
                    long j6 = fileInfo2.size;
                    this.totalSize = j5 - j6;
                    this.totalDeviceFreeSize += j6;
                    hashSet3.add(fileInfo2);
                    FileEntities fileEntities2 = (FileEntities) dialogFileEntities.entitiesByType.get(fileInfo2.type, null);
                    if (fileEntities2 != null && fileEntities2.files.remove(fileInfo2)) {
                        long j7 = fileEntities2.totalSize;
                        long j8 = fileInfo2.size;
                        fileEntities2.totalSize = j7 - j8;
                        dialogFileEntities.totalSize -= j8;
                        dialogFileEntities.filesCount--;
                    }
                    int i3 = fileInfo2.type;
                    if (i3 == 0) {
                        this.photoSize -= fileInfo2.size;
                    } else if (i3 == 1) {
                        this.videoSize -= fileInfo2.size;
                    } else if (i3 == 2) {
                        this.documentsSize -= fileInfo2.size;
                    } else {
                        if (i3 == 3) {
                            j = j2;
                            this.musicSize -= fileInfo2.size;
                        } else {
                            j = j2;
                            if (i3 == 4) {
                                this.audioSize -= fileInfo2.size;
                            }
                        }
                        j2 = j;
                    }
                }
            }
        }
        HashSet<CacheModel.FileInfo> hashSet4 = hashSet3;
        long j9 = j2;
        for (CacheModel.FileInfo fileInfo3 : hashSet4) {
            CacheModel cacheModel2 = this.cacheModel;
            if (cacheModel2.selectedFiles.remove(fileInfo3)) {
                cacheModel2.selectedSize -= fileInfo3.size;
            }
            ArrayList listByType = cacheModel2.getListByType(fileInfo3.type);
            if (listByType != null) {
                listByType.remove(fileInfo3);
            }
        }
        Bulletin bulletinCreateSimpleBulletinWithIconSize = BulletinFactory.of(this).createSimpleBulletinWithIconSize(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j9 - this.totalSize)));
        bulletinCreateSimpleBulletinWithIconSize.hideAfterBottomSheet = false;
        bulletinCreateSimpleBulletinWithIconSize.show();
        ArrayList arrayList2 = new ArrayList(hashSet4);
        getFileLoader().getFileDatabase().removeFiles(arrayList2);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new RemoteUtils$$ExternalSyntheticLambda2(this, arrayList2, alertDialog, 29));
    }

    public final void clearDatabase(boolean z) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        String string = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LocalDatabaseClearText));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("LocalDatabaseClearText2", R.string.LocalDatabaseClearText2, AndroidUtilities.formatFileSize(this.databaseSize))));
        alertDialog.message = spannableStringBuilder;
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.CacheClear), new ChatActivity$$ExternalSyntheticLambda168(2, this, z));
        showDialog(alertDialog);
        TextView textView = (TextView) alertDialog.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public final void clearSelectedFiles() {
        if (this.cacheModel.selectedFiles.size() == 0 || getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        String string = LocaleController.getString(R.string.ClearCache);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.getString(R.string.ClearCacheForChats);
        builder.setPositiveButton(LocaleController.getString(R.string.Clear), new CacheControlActivity$$ExternalSyntheticLambda7(this));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog);
        TextView textView = (TextView) alertDialog.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    @Override
    public final View createView(Context context) {
        int i = 3;
        this.actionBar.setBackgroundDrawable(null);
        int i2 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        ActionBar actionBar = this.actionBar;
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        actionBar.setTitleColor(ColorUtils.setAlphaComponent(Theme.getColor(null, i3, false), 0));
        this.actionBar.setItemsColor(Theme.getColor(null, i3, false), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_listSelector, false), false);
        zzkt.m(this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.StorageUsage));
        this.actionBar.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 14));
        this.actionMode = this.actionBar.createActionMode(null);
        FrameLayout frameLayout = new FrameLayout(context);
        this.actionMode.addView(frameLayout, LayoutHelper.createLinear(1.0f, 0, -1, 72, 0, 0));
        AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, true);
        this.actionModeTitle = animatedTextView;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = animatedTextView.drawable;
        animatedTextDrawable.moveAmplitude = 0.35f;
        animatedTextDrawable.animateDuration = 350L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        animatedTextView.setTextSize(AndroidUtilities.dp(18.0f));
        this.actionModeTitle.setTypeface(AndroidUtilities.bold());
        this.actionModeTitle.setTextColor(Theme.getColor(null, i3, false));
        frameLayout.addView(this.actionModeTitle, LayoutHelper.createFrame(-1, 18.0f, 19, 0.0f, -11.0f, 18.0f, 0.0f));
        AnimatedTextView animatedTextView2 = new AnimatedTextView(context, true, true, true);
        this.actionModeSubtitle = animatedTextView2;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = animatedTextView2.drawable;
        animatedTextDrawable2.moveAmplitude = 0.35f;
        animatedTextDrawable2.animateDuration = 350L;
        animatedTextDrawable2.animateWave = 1.0f;
        animatedTextDrawable2.animateInterpolator = cubicBezierInterpolator;
        animatedTextView2.setTextSize(AndroidUtilities.dp(14.0f));
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
        this.actionModeClearButton.setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda38(this, 12));
        if (LocaleController.isRTL) {
            frameLayout.addView(this.actionModeClearButton, LayoutHelper.createFrame(-2, 28.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            frameLayout.addView(this.actionModeClearButton, LayoutHelper.createFrame(-2, 28.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        }
        ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(2, R.drawable.ic_ab_other);
        int i4 = R.drawable.msg_delete;
        int i5 = R.string.ClearLocalDatabase;
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem = actionBarMenuItemAddItem.addSubItem(3, i4, LocaleController.getString(i5));
        this.clearDatabaseItem = actionBarMenuSubItemAddSubItem;
        int i6 = Theme.key_text_RedRegular;
        actionBarMenuSubItemAddSubItem.setIconColor(Theme.getColor(null, i6, false));
        ActionBarMenuSubItem actionBarMenuSubItem = this.clearDatabaseItem;
        int i7 = Theme.key_text_RedBold;
        actionBarMenuSubItem.setTextColor(Theme.getColor(null, i7, false));
        this.clearDatabaseItem.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(null, i6, false)));
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem2 = actionBarMenuItemAddItem.addSubItem(4, i4, "Full Reset Database");
            this.resetDatabaseItem = actionBarMenuSubItemAddSubItem2;
            actionBarMenuSubItemAddSubItem2.setIconColor(Theme.getColor(null, i6, false));
            this.resetDatabaseItem.setTextColor(Theme.getColor(null, i7, false));
            this.resetDatabaseItem.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(null, i6, false)));
        }
        if (this.clearDatabaseItem != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(i5));
            this.clearDatabaseItem.setText(spannableStringBuilder);
        }
        this.listAdapter = new ListAdapter(context);
        ?? r3 = new NestedSizeNotifierLayout(context) {
            @Override
            public final void dispatchDraw(Canvas canvas) {
                float f;
                super.dispatchDraw(canvas);
                NestedSizeNotifierLayout.ChildLayout childLayout = this.childLayout;
                boolean z = childLayout != null && childLayout.getTop() == this.maxTop;
                CacheControlActivity cacheControlActivity = CacheControlActivity.this;
                if (z) {
                    float f2 = cacheControlActivity.actionBarShadowAlpha;
                    if (f2 != 0.0f) {
                        cacheControlActivity.actionBarShadowAlpha = f2 - 0.16f;
                        invalidate();
                    } else if (!z) {
                        f = cacheControlActivity.actionBarShadowAlpha;
                        if (f != 1.0f) {
                            cacheControlActivity.actionBarShadowAlpha = f + 0.16f;
                            invalidate();
                        }
                    }
                } else if (!z) {
                    f = cacheControlActivity.actionBarShadowAlpha;
                    if (f != 1.0f) {
                        cacheControlActivity.actionBarShadowAlpha = f + 0.16f;
                        invalidate();
                    }
                }
                cacheControlActivity.actionBarShadowAlpha = Utilities.clamp(cacheControlActivity.actionBarShadowAlpha, 1.0f, 0.0f);
                if (((BaseFragment) cacheControlActivity).parentLayout != null) {
                    ((ActionBarLayout) ((BaseFragment) cacheControlActivity).parentLayout).drawHeaderShadow(canvas, (int) (cacheControlActivity.actionBarShownT * 255.0f * cacheControlActivity.actionBarShadowAlpha), ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
                }
            }
        };
        this.nestedSizeNotifierLayout = r3;
        this.fragmentView = r3;
        r3.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(this, context, i);
        this.listView = anonymousClass34;
        anonymousClass34.setSections();
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setPadding(0, (ActionBar.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, 0);
        this.listView.setClipToPadding(false);
        ChatActivity.AnonymousClass34 anonymousClass35 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        anonymousClass35.setLayoutManager(linearLayoutManager);
        r3.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        this.listView.setAdapter(this.listAdapter);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                CacheControlActivity.this.listView.invalidate();
            }
        };
        defaultItemAnimator.setDurations(350L);
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.delayAnimations = false;
        defaultItemAnimator.mSupportsChangeAnimations = false;
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setOnItemClickListener(new CacheControlActivity$$ExternalSyntheticLambda7(this));
        this.listView.addOnScrollListener(new AnonymousClass5(this, i2));
        r3.addView(this.actionBar, LayoutHelper.createFrame(-2.0f, -1));
        setTargetListView(this.listView);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
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
                if (this.clearDatabaseItem != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
                    this.clearDatabaseItem.setText(spannableStringBuilder);
                }
                updateRows$1(true);
            }
        }
    }

    public final void fillDialogsEntitiesRecursive(File file, int i, LongSparseArray longSparseArray, CacheModel cacheModel) {
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
                        DialogFileEntities dialogFileEntities = (DialogFileEntities) longSparseArray.get(j, null);
                        if (dialogFileEntities == null) {
                            dialogFileEntities = new DialogFileEntities(fileInfo.dialogId);
                            longSparseArray.put(fileInfo.dialogId, dialogFileEntities);
                        }
                        dialogFileEntities.addFile(fileInfo, i2);
                    }
                    if (i2 != 6) {
                        cacheModel.getListByType(i2).add(fileInfo);
                    }
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(this, 3);
        ArrayList arrayList = new ArrayList();
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
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(null, 0, new Class[]{CheckBoxCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(null, 0, new Class[]{CheckBoxCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(null, 0, new Class[]{CheckBoxCell.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(null, 0, new Class[]{StorageDiagramView.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(null, 0, new Class[]{TextCheckBoxCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_dialogBackground));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_statisticChartLine_blue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_statisticChartLine_green));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_statisticChartLine_red));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_statisticChartLine_golden));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_statisticChartLine_lightblue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_statisticChartLine_lightgreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_statisticChartLine_orange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_statisticChartLine_indigo));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (this.changeStatusBar) {
            return AndroidUtilities.computePerceivedBrightness(Theme.getColor(null, Theme.key_windowBackgroundGray, false)) > 0.721f;
        }
        return super.isLightStatusBar();
    }

    public final boolean isOtherSelected() {
        int i;
        boolean[] zArr = this.selected;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.itemInners;
            if (i2 >= arrayList.size()) {
                break;
            }
            ItemInner itemInner = (ItemInner) arrayList.get(i2);
            if (itemInner.viewType == 11 && !itemInner.pad && (i = itemInner.index) >= 0) {
                zArr2[i] = true;
            }
            i2++;
        }
        for (int i3 = 0; i3 < length; i3++) {
            if (!zArr2[i3] && !zArr[i3]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        DialogCacheBottomSheet.AnonymousClass3 anonymousClass3 = this.cachedMediaLayout;
        if (anonymousClass3 == null || motionEvent == null) {
            return true;
        }
        Rect rect = AndroidUtilities.rectTmp2;
        anonymousClass3.getHitRect(rect);
        return !rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight()) || this.cachedMediaLayout.viewPagerFixed.currentPosition == 0;
    }

    public final void lambda$cleanupDialogFiles$22(AlertDialog alertDialog) {
        FileLoader.getInstance(this.currentAccount).checkCurrentDownloadsFiles();
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void lambda$cleanupFolders$11(ChatActivity$$ExternalSyntheticLambda464 chatActivity$$ExternalSyntheticLambda464, CacheControlActivity$ClearCacheButtonInternal$$ExternalSyntheticLambda5 cacheControlActivity$ClearCacheButtonInternal$$ExternalSyntheticLambda5) {
        int i;
        int i2;
        File fileCheckDirectory;
        int i3;
        File fileCheckDirectory2;
        char c;
        File fileCheckDirectory3;
        File fileCheckDirectory4;
        int i4 = 1;
        int[] iArr = {0};
        boolean[] zArr = this.selected;
        int i5 = 2;
        int i6 = 3;
        int i7 = (zArr[0] ? 2 : 0) + (zArr[1] ? 2 : 0) + (zArr[2] ? 2 : 0) + (zArr[3] ? 2 : 0) + (zArr[4] ? 1 : 0) + (zArr[5] ? 2 : 0) + (zArr[6] ? 1 : 0) + (zArr[7] ? 1 : 0) + (zArr[8] ? 1 : 0) + (zArr[9] ? 1 : 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        CacheControlActivity$$ExternalSyntheticLambda23 cacheControlActivity$$ExternalSyntheticLambda23 = new CacheControlActivity$$ExternalSyntheticLambda23(chatActivity$$ExternalSyntheticLambda464, iArr, i7, 0);
        ArticleViewer$$ExternalSyntheticLambda48 articleViewer$$ExternalSyntheticLambda48 = new ArticleViewer$$ExternalSyntheticLambda48(chatActivity$$ExternalSyntheticLambda464, iArr, i7, jCurrentTimeMillis, 12);
        long j = 0;
        int i8 = 0;
        boolean z = true;
        boolean z2 = false;
        while (i8 < 10) {
            if (zArr[i8]) {
                if (i8 == 0) {
                    j += this.photoSize;
                    i2 = 9;
                    i5 = 0;
                    i6 = 0;
                } else if (i8 == i4) {
                    j += this.videoSize;
                    i2 = 9;
                    i5 = 0;
                    i6 = 2;
                } else if (i8 == i5) {
                    j += this.documentsSize;
                    i2 = 9;
                    i5 = 1;
                } else if (i8 == i6) {
                    j += this.musicSize;
                    i2 = 9;
                } else if (i8 == 4) {
                    j += this.audioSize;
                    i2 = 9;
                    i5 = 0;
                    i6 = 1;
                } else if (i8 == 5) {
                    j += this.storiesSize;
                    i2 = 9;
                    i5 = 0;
                    i6 = 6;
                } else {
                    if (i8 == 6) {
                        j += this.stickersCacheSize;
                        i2 = 9;
                        i5 = 0;
                        i6 = 100;
                    } else {
                        i = 7;
                        if (i8 == 7) {
                            articleViewer$$ExternalSyntheticLambda48 = articleViewer$$ExternalSyntheticLambda48;
                            j += this.cacheSize;
                            i2 = 9;
                            i5 = 5;
                        } else {
                            articleViewer$$ExternalSyntheticLambda48 = articleViewer$$ExternalSyntheticLambda48;
                            if (i8 == 8) {
                                j += this.cacheTempSize;
                                i2 = 9;
                                i5 = 4;
                            } else {
                                i2 = 9;
                                if (i8 == 9) {
                                    j += this.logsSize;
                                    i5 = 1;
                                    i6 = 0;
                                } else {
                                    i5 = 0;
                                    i6 = -1;
                                }
                            }
                        }
                        i6 = 4;
                    }
                    if (i6 != -1) {
                        if (i8 == i) {
                            try {
                                cleanDirJava(ApplicationLoader.getFilesDirFixed("rasterized/wallpaper").getAbsolutePath(), 0, null, null);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                        if (i8 == i2) {
                            fileCheckDirectory = AndroidUtilities.getLogsDir();
                        } else if (i6 == 100) {
                            fileCheckDirectory = new File(FileLoader.checkDirectory(4), "acache");
                        } else {
                            fileCheckDirectory = FileLoader.checkDirectory(i6);
                        }
                        if (fileCheckDirectory != null) {
                            cleanDirJava(fileCheckDirectory.getAbsolutePath(), i5, null, cacheControlActivity$$ExternalSyntheticLambda23);
                        }
                        iArr[0] = iArr[0] + 1;
                        articleViewer$$ExternalSyntheticLambda48.run();
                        if (i6 == 100) {
                            fileCheckDirectory4 = FileLoader.checkDirectory(4);
                            if (fileCheckDirectory4 != null) {
                                cleanDirJava(fileCheckDirectory4.getAbsolutePath(), 3, null, cacheControlActivity$$ExternalSyntheticLambda23);
                            }
                            iArr[0] = iArr[0] + 1;
                            articleViewer$$ExternalSyntheticLambda48.run();
                        }
                        if (i6 != 0 || i6 == 2) {
                            if (i6 == 0) {
                                i3 = 100;
                            } else {
                                i3 = 101;
                            }
                            fileCheckDirectory2 = FileLoader.checkDirectory(i3);
                            if (fileCheckDirectory2 != null) {
                                cleanDirJava(fileCheckDirectory2.getAbsolutePath(), i5, null, cacheControlActivity$$ExternalSyntheticLambda23);
                            }
                            c = 0;
                            iArr[0] = iArr[0] + 1;
                            articleViewer$$ExternalSyntheticLambda48.run();
                        } else {
                            c = 0;
                        }
                        if (i6 == 3) {
                            fileCheckDirectory3 = FileLoader.checkDirectory(5);
                            if (fileCheckDirectory3 != null) {
                                cleanDirJava(fileCheckDirectory3.getAbsolutePath(), i5, null, cacheControlActivity$$ExternalSyntheticLambda23);
                            }
                            iArr[c] = iArr[c] + 1;
                            articleViewer$$ExternalSyntheticLambda48.run();
                        }
                        if (i8 == i2) {
                            this.logsSize = getDirectorySize(1, AndroidUtilities.getLogsDir());
                        } else if (i6 == 4) {
                            this.cacheSize = getDirectorySize(5, FileLoader.checkDirectory(4));
                            this.cacheTempSize = getDirectorySize(4, FileLoader.checkDirectory(4));
                            z2 = true;
                        } else if (i6 == 1) {
                            this.audioSize = getDirectorySize(i5, FileLoader.checkDirectory(1));
                        } else if (i6 == 6) {
                            this.storiesSize = getDirectorySize(i5, FileLoader.checkDirectory(6));
                        } else if (i6 == 3) {
                            if (i5 == 1) {
                                long directorySize = getDirectorySize(i5, FileLoader.checkDirectory(3));
                                this.documentsSize = directorySize;
                                this.documentsSize = getDirectorySize(i5, FileLoader.checkDirectory(5)) + directorySize;
                            } else {
                                long directorySize2 = getDirectorySize(i5, FileLoader.checkDirectory(3));
                                this.musicSize = directorySize2;
                                this.musicSize = getDirectorySize(i5, FileLoader.checkDirectory(5)) + directorySize2;
                            }
                        } else if (i6 == 0) {
                            long directorySize3 = getDirectorySize(i5, FileLoader.checkDirectory(0));
                            this.photoSize = directorySize3;
                            this.photoSize = getDirectorySize(i5, FileLoader.checkDirectory(100)) + directorySize3;
                            z2 = true;
                        } else if (i6 == 2) {
                            long directorySize4 = getDirectorySize(i5, FileLoader.checkDirectory(2));
                            this.videoSize = directorySize4;
                            this.videoSize = getDirectorySize(i5, FileLoader.checkDirectory(101)) + directorySize4;
                        } else if (i6 == 100) {
                            this.stickersCacheSize = getDirectorySize(i5, new File(FileLoader.checkDirectory(4), "acache"));
                            long directorySize5 = getDirectorySize(3, FileLoader.checkDirectory(4));
                            this.cacheEmojiSize = directorySize5;
                            this.stickersCacheSize += directorySize5;
                            z2 = true;
                        }
                    }
                    i8++;
                    articleViewer$$ExternalSyntheticLambda48 = articleViewer$$ExternalSyntheticLambda48;
                    i4 = 1;
                    i5 = 2;
                    i6 = 3;
                }
                i = 7;
                if (i6 != -1) {
                    if (i8 == i) {
                        cleanDirJava(ApplicationLoader.getFilesDirFixed("rasterized/wallpaper").getAbsolutePath(), 0, null, null);
                    }
                    if (i8 == i2) {
                        fileCheckDirectory = AndroidUtilities.getLogsDir();
                    } else if (i6 == 100) {
                        fileCheckDirectory = new File(FileLoader.checkDirectory(4), "acache");
                    } else {
                        fileCheckDirectory = FileLoader.checkDirectory(i6);
                    }
                    if (fileCheckDirectory != null) {
                        cleanDirJava(fileCheckDirectory.getAbsolutePath(), i5, null, cacheControlActivity$$ExternalSyntheticLambda23);
                    }
                    iArr[0] = iArr[0] + 1;
                    articleViewer$$ExternalSyntheticLambda48.run();
                    if (i6 == 100) {
                        fileCheckDirectory4 = FileLoader.checkDirectory(4);
                        if (fileCheckDirectory4 != null) {
                            cleanDirJava(fileCheckDirectory4.getAbsolutePath(), 3, null, cacheControlActivity$$ExternalSyntheticLambda23);
                        }
                        iArr[0] = iArr[0] + 1;
                        articleViewer$$ExternalSyntheticLambda48.run();
                    }
                    if (i6 != 0) {
                        if (i6 == 0) {
                            i3 = 100;
                        } else {
                            i3 = 101;
                        }
                        fileCheckDirectory2 = FileLoader.checkDirectory(i3);
                        if (fileCheckDirectory2 != null) {
                            cleanDirJava(fileCheckDirectory2.getAbsolutePath(), i5, null, cacheControlActivity$$ExternalSyntheticLambda23);
                        }
                        c = 0;
                        iArr[0] = iArr[0] + 1;
                        articleViewer$$ExternalSyntheticLambda48.run();
                    } else {
                        if (i6 == 0) {
                            i3 = 100;
                        } else {
                            i3 = 101;
                        }
                        fileCheckDirectory2 = FileLoader.checkDirectory(i3);
                        if (fileCheckDirectory2 != null) {
                            cleanDirJava(fileCheckDirectory2.getAbsolutePath(), i5, null, cacheControlActivity$$ExternalSyntheticLambda23);
                        }
                        c = 0;
                        iArr[0] = iArr[0] + 1;
                        articleViewer$$ExternalSyntheticLambda48.run();
                    }
                    if (i6 == 3) {
                        fileCheckDirectory3 = FileLoader.checkDirectory(5);
                        if (fileCheckDirectory3 != null) {
                            cleanDirJava(fileCheckDirectory3.getAbsolutePath(), i5, null, cacheControlActivity$$ExternalSyntheticLambda23);
                        }
                        iArr[c] = iArr[c] + 1;
                        articleViewer$$ExternalSyntheticLambda48.run();
                    }
                    if (i8 == i2) {
                        this.logsSize = getDirectorySize(1, AndroidUtilities.getLogsDir());
                    } else if (i6 == 4) {
                        this.cacheSize = getDirectorySize(5, FileLoader.checkDirectory(4));
                        this.cacheTempSize = getDirectorySize(4, FileLoader.checkDirectory(4));
                        z2 = true;
                    } else if (i6 == 1) {
                        this.audioSize = getDirectorySize(i5, FileLoader.checkDirectory(1));
                    } else if (i6 == 6) {
                        this.storiesSize = getDirectorySize(i5, FileLoader.checkDirectory(6));
                    } else if (i6 == 3) {
                        if (i5 == 1) {
                            long directorySize6 = getDirectorySize(i5, FileLoader.checkDirectory(3));
                            this.documentsSize = directorySize6;
                            this.documentsSize = getDirectorySize(i5, FileLoader.checkDirectory(5)) + directorySize6;
                        } else {
                            long directorySize7 = getDirectorySize(i5, FileLoader.checkDirectory(3));
                            this.musicSize = directorySize7;
                            this.musicSize = getDirectorySize(i5, FileLoader.checkDirectory(5)) + directorySize7;
                        }
                    } else if (i6 == 0) {
                        long directorySize8 = getDirectorySize(i5, FileLoader.checkDirectory(0));
                        this.photoSize = directorySize8;
                        this.photoSize = getDirectorySize(i5, FileLoader.checkDirectory(100)) + directorySize8;
                        z2 = true;
                    } else if (i6 == 2) {
                        long directorySize9 = getDirectorySize(i5, FileLoader.checkDirectory(2));
                        this.videoSize = directorySize9;
                        this.videoSize = getDirectorySize(i5, FileLoader.checkDirectory(101)) + directorySize9;
                    } else if (i6 == 100) {
                        this.stickersCacheSize = getDirectorySize(i5, new File(FileLoader.checkDirectory(4), "acache"));
                        long directorySize10 = getDirectorySize(3, FileLoader.checkDirectory(4));
                        this.cacheEmojiSize = directorySize10;
                        this.stickersCacheSize += directorySize10;
                        z2 = true;
                    }
                }
                i8++;
                articleViewer$$ExternalSyntheticLambda48 = articleViewer$$ExternalSyntheticLambda48;
                i4 = 1;
                i5 = 2;
                i6 = 3;
            } else {
                articleViewer$$ExternalSyntheticLambda48 = articleViewer$$ExternalSyntheticLambda48;
                z = false;
            }
            i8++;
            articleViewer$$ExternalSyntheticLambda48 = articleViewer$$ExternalSyntheticLambda48;
            i4 = 1;
            i5 = 2;
            i6 = 3;
        }
        long j2 = this.cacheSize + this.cacheTempSize + this.logsSize + this.videoSize + this.audioSize + this.photoSize + this.documentsSize + this.musicSize + this.stickersCacheSize + this.storiesSize;
        lastTotalSizeCalculated = Long.valueOf(j2);
        this.totalSize = j2;
        lastTotalSizeCalculatedTime = System.currentTimeMillis();
        Arrays.fill(zArr, true);
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong();
        this.totalDeviceSize = statFs.getBlockCountLong() * blockSizeLong;
        this.totalDeviceFreeSize = availableBlocksLong * blockSizeLong;
        if (z) {
            FileLoader.getInstance(this.currentAccount).clearFilePaths();
        }
        FileLoader.getInstance(this.currentAccount).checkCurrentDownloadsFiles();
        AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda72(this, z2, j, cacheControlActivity$ClearCacheButtonInternal$$ExternalSyntheticLambda5, 9));
    }

    public final void lambda$cleanupFoldersInternal$16(boolean z, long j, CacheControlActivity$ClearCacheButtonInternal$$ExternalSyntheticLambda5 cacheControlActivity$ClearCacheButtonInternal$$ExternalSyntheticLambda5) {
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
        AndroidUtilities.runOnUIThread(new LinkManager$3$$ExternalSyntheticLambda0(this, j, 10), 150L);
        MediaDataController.getInstance(this.currentAccount).checkAllMedia(true);
        getFileLoader().getFileDatabase().getQueue().postRunnable(new CacheControlActivity$$ExternalSyntheticLambda1(this, 2));
        cacheControlActivity$ClearCacheButtonInternal$$ExternalSyntheticLambda5.run();
    }

    public final void lambda$clearDatabase$24(boolean z) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3, null);
        this.progressDialog = alertDialog;
        alertDialog.canCacnel = false;
        alertDialog.showDelayed(500L);
        MessagesController.getInstance(this.currentAccount).clearQueryTime();
        if (z) {
            getMessagesStorage().fullReset();
        } else {
            getMessagesStorage().clearLocalDatabase();
        }
    }

    public final void lambda$updateActionBar$21(ValueAnimator valueAnimator) {
        this.actionBarShownT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.actionBar.setTitleColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false), (int) (this.actionBarShownT * 255.0f)));
        this.actionBar.setBackgroundColor(ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_windowBackgroundWhite, false), (int) (this.actionBarShownT * 255.0f)));
        this.fragmentView.invalidate();
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        CacheModel cacheModel = this.cacheModel;
        if (cacheModel == null || cacheModel.selectedFiles.isEmpty()) {
            return super.onBackPressed(z);
        }
        if (z) {
            CacheModel cacheModel2 = this.cacheModel;
            cacheModel2.selectedSize = 0L;
            cacheModel2.selectedFiles.clear();
            cacheModel2.selectedDialogs.clear();
            DialogCacheBottomSheet.AnonymousClass3 anonymousClass3 = this.cachedMediaLayout;
            if (anonymousClass3 != null) {
                anonymousClass3.showActionMode(false);
                this.cachedMediaLayout.updateVisibleRows();
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        canceled = false;
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.databaseSize = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
        Utilities.globalQueue.postRunnable(new CacheControlActivity$$ExternalSyntheticLambda1(this, 0));
        this.fragmentCreateTime = System.currentTimeMillis();
        updateRows$1(false);
        updateChart();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
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
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, (ActionBar.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
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
    public final void onResume() {
        super.onResume();
        this.listAdapter.mObservable.notifyChanged();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z, float f) {
        if (f > 0.5f && !this.changeStatusBar) {
            this.changeStatusBar = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z, f);
    }

    public final void toggleOtherSelected(CheckBoxCell checkBoxCell) {
        int i;
        int i2;
        int i3;
        boolean zIsOtherSelected = isOtherSelected();
        ArrayList arrayList = this.itemInners;
        boolean[] zArr = this.selected;
        if (zIsOtherSelected) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    if (checkBoxCell != null) {
                        AndroidUtilities.shakeViewSpring(checkBoxCell, -3.0f);
                        return;
                    }
                    return;
                }
                ItemInner itemInner = (ItemInner) arrayList.get(i4);
                if (itemInner.viewType == 11 && !itemInner.pad && (i3 = itemInner.index) >= 0 && zArr[i3]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        if (this.collapsed) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ItemInner itemInner2 = (ItemInner) arrayList.get(i5);
                if (itemInner2.viewType == 11 && !itemInner2.pad && (i2 = itemInner2.index) >= 0) {
                    zArr2[i2] = true;
                }
            }
            for (int i6 = 0; i6 < length; i6++) {
                if (!zArr2[i6]) {
                    zArr[i6] = !zIsOtherSelected;
                }
            }
        } else {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ItemInner itemInner3 = (ItemInner) arrayList.get(i7);
                if (itemInner3.viewType == 11 && itemInner3.pad && (i = itemInner3.index) >= 0) {
                    zArr[i] = !zIsOtherSelected;
                }
            }
        }
        for (int i8 = 0; i8 < this.listView.getChildCount(); i8++) {
            View childAt = this.listView.getChildAt(i8);
            if (childAt instanceof CheckBoxCell) {
                this.listView.getClass();
                int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition >= 0) {
                    ItemInner itemInner4 = (ItemInner) arrayList.get(childAdapterPosition);
                    if (itemInner4.viewType == 11) {
                        int i9 = itemInner4.index;
                        if (i9 < 0) {
                            ((CheckBoxCell) childAt).setChecked(!zIsOtherSelected, true);
                        } else {
                            ((CheckBoxCell) childAt).setChecked(zArr[i9], true);
                        }
                    }
                }
            }
        }
        updateChart();
    }

    public final void updateActionBar(boolean z) {
        if (z != this.actionBarShown) {
            ValueAnimator valueAnimator = this.actionBarAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f = this.actionBarShownT;
            this.actionBarShown = z;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
            this.actionBarAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 4));
            this.actionBarAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.actionBarAnimator.setDuration(380L);
            this.actionBarAnimator.start();
        }
    }

    public final void updateChart() {
        ListAdapter.AnonymousClass1 anonymousClass1 = this.cacheChart;
        boolean z = false;
        if (anonymousClass1 != null) {
            boolean z2 = this.calculating;
            if (!z2 && this.totalSize > 0) {
                CacheChart.SegmentSize[] segmentSizeArr = new CacheChart.SegmentSize[11];
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.itemInners;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    ItemInner itemInner = (ItemInner) arrayList.get(i);
                    if (itemInner.viewType == 11) {
                        int i2 = itemInner.index;
                        boolean[] zArr = this.selected;
                        if (i2 >= 0) {
                            long j = itemInner.size;
                            boolean z3 = zArr[i2];
                            CacheChart.SegmentSize segmentSize = new CacheChart.SegmentSize();
                            segmentSize.size = j;
                            segmentSize.selected = z3;
                            segmentSizeArr[i2] = segmentSize;
                        } else if (this.collapsed) {
                            long j2 = itemInner.size;
                            boolean z4 = zArr[10];
                            CacheChart.SegmentSize segmentSize2 = new CacheChart.SegmentSize();
                            segmentSize2.size = j2;
                            segmentSize2.selected = z4;
                            segmentSizeArr[10] = segmentSize2;
                        }
                    }
                    i++;
                }
                if (System.currentTimeMillis() - this.fragmentCreateTime < 80) {
                    this.cacheChart.loadingFloat.set(0.0f, true);
                }
                setSegments(this.totalSize, true, segmentSizeArr);
            } else if (z2) {
                anonymousClass1.setSegments(-1L, true, new CacheChart.SegmentSize[0]);
            } else {
                anonymousClass1.setSegments(0L, true, new CacheChart.SegmentSize[0]);
            }
        }
        ClearCacheButtonInternal clearCacheButtonInternal = this.clearCacheButton;
        if (clearCacheButtonInternal == null || this.calculating) {
            return;
        }
        CacheControlActivity cacheControlActivity = CacheControlActivity.this;
        boolean[] zArr2 = cacheControlActivity.selected;
        long j3 = (zArr2[0] ? cacheControlActivity.photoSize : 0L) + (zArr2[1] ? cacheControlActivity.videoSize : 0L) + (zArr2[2] ? cacheControlActivity.documentsSize : 0L) + (zArr2[3] ? cacheControlActivity.musicSize : 0L) + (zArr2[4] ? cacheControlActivity.audioSize : 0L) + (zArr2[5] ? cacheControlActivity.storiesSize : 0L) + (zArr2[6] ? cacheControlActivity.stickersCacheSize : 0L) + (zArr2[7] ? cacheControlActivity.cacheSize : 0L) + (zArr2[8] ? cacheControlActivity.cacheTempSize : 0L) + (zArr2[9] ? cacheControlActivity.logsSize : 0L);
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = cacheControlActivity.itemInners;
            if (i3 >= arrayList2.size()) {
                z = true;
                break;
            }
            ItemInner itemInner2 = (ItemInner) arrayList2.get(i3);
            if (itemInner2.viewType == 11) {
                int length = itemInner2.index;
                if (length < 0) {
                    length = zArr2.length - 1;
                }
                if (!zArr2[length]) {
                    break;
                }
            }
            i3++;
        }
        clearCacheButtonInternal.setSize(j3, z);
    }

    public final void updateRows$1(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.CacheControlActivity.updateRows$1(boolean):void");
    }

    public final class ItemInner extends AdapterWithDiffUtils.Item {
        public int colorKey;
        public String headerName;
        public int index;
        public final int keepMediaType;
        public boolean last;
        public boolean pad;
        public long size;
        public String text;

        public ItemInner(int i, String str) {
            super(i, true);
            this.keepMediaType = -1;
            this.headerName = str;
        }

        public static ItemInner asCheckBox(int i, long j, String str, int i2) {
            ItemInner itemInner = new ItemInner(11);
            itemInner.index = i;
            itemInner.headerName = str;
            itemInner.size = j;
            itemInner.colorKey = i2;
            itemInner.last = false;
            return itemInner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && ItemInner.class == obj.getClass()) {
                ItemInner itemInner = (ItemInner) obj;
                int i = this.viewType;
                if (i == itemInner.viewType) {
                    if (i == 9 || i == 10 || i == 8 || i == 4 || i == 2 || i == 0 || i == 13) {
                        return true;
                    }
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
            return false;
        }

        public ItemInner(int i, int i2) {
            super(7, true);
            this.keepMediaType = i;
        }

        public ItemInner(int i) {
            super(i, true);
            this.keepMediaType = -1;
        }
    }

    public final class ClearingCacheView extends FrameLayout {
        public final AnimatedTextView percentsTextView;
        public final ProgressView progressView;

        public ClearingCacheView(Context context) {
            super(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            rLottieImageView.setAutoRepeat(true);
            rLottieImageView.setAnimation(R.raw.utyan_cache, 150, 150, null);
            addView(rLottieImageView, LayoutHelper.createFrame(150, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
            rLottieImageView.playAnimation();
            AnimatedTextView animatedTextView = new AnimatedTextView(context, false, true, true);
            this.percentsTextView = animatedTextView;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = animatedTextView.drawable;
            animatedTextDrawable.moveAmplitude = 0.35f;
            animatedTextDrawable.animateDuration = 120L;
            animatedTextDrawable.animateWave = 1.0f;
            animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
            animatedTextView.setGravity(1);
            int i = Theme.key_dialogTextBlack;
            animatedTextView.setTextColor(Theme.getColor(null, i, false));
            animatedTextView.setTextSize(AndroidUtilities.dp(24.0f));
            animatedTextView.setTypeface(AndroidUtilities.bold());
            addView(animatedTextView, LayoutHelper.createFrame(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
            ProgressView progressView = new ProgressView(context);
            this.progressView = progressView;
            addView(progressView, LayoutHelper.createFrame(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setGravity(1);
            FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(16.0f, Theme.getColor(null, i, false), 1, textView);
            textView.setText(LocaleController.getString(R.string.ClearingCache));
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setGravity(1);
            textView2.setTextColor(Theme.getColor(null, i, false));
            textView2.setTextSize(1, 14.0f);
            textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
            addView(textView2, LayoutHelper.createFrame(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
            setProgress(0.0f);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), 1073741824));
        }

        public final void setProgress(float f) {
            AnimatedTextView animatedTextView = this.percentsTextView;
            animatedTextView.drawable.cancelAnimation();
            animatedTextView.setText(String.format("%d%%", Integer.valueOf((int) Math.ceil(MathUtils.clamp(f, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
            ProgressView progressView = this.progressView;
            progressView.progress = f;
            progressView.invalidate();
        }

        public final class ProgressView extends View {
            public final int $r8$classId = 0;
            public final Paint in;
            public final Paint out;
            public float progress;
            public final Object progressT;

            public ProgressView(Context context) {
                super(context);
                Paint paint = new Paint(1);
                this.in = paint;
                Paint paint2 = new Paint(1);
                this.out = paint2;
                this.progressT = new AnimatedFloat(350L, this, CubicBezierInterpolator.EASE_OUT);
                int i = Theme.key_switchTrackChecked;
                paint.setColor(Theme.getColor(null, i, false));
                paint2.setColor(Theme.multAlpha(0.2f, Theme.getColor(null, i, false)));
            }

            @Override
            public final void onDraw(Canvas canvas) {
                switch (this.$r8$classId) {
                    case 0:
                        super.onDraw(canvas);
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.out);
                        rectF.set(0.0f, 0.0f, ((AnimatedFloat) this.progressT).set(this.progress, false) * getMeasuredWidth(), getMeasuredHeight());
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.in);
                        break;
                    default:
                        super.onDraw(canvas);
                        float height = getHeight() / 2.0f;
                        float fDp = AndroidUtilities.dp(6.0f);
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float f = height - fDp;
                        float f2 = height + fDp;
                        rectF2.set(fDp, f, getWidth() - fDp, f2);
                        canvas.save();
                        ColorPickerBottomSheet colorPickerBottomSheet = (ColorPickerBottomSheet) this.progressT;
                        colorPickerBottomSheet.path.rewind();
                        colorPickerBottomSheet.path.addRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
                        canvas.clipPath(colorPickerBottomSheet.path);
                        PaintColorsListView.drawCheckerboard(canvas, rectF2, AndroidUtilities.dp(6.0f));
                        canvas.restore();
                        rectF2.set(fDp, f, getWidth() - fDp, f2);
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.in);
                        float fDp2 = AndroidUtilities.dp(13.0f);
                        Paint paint = this.out;
                        float strokeWidth = fDp2 - (paint.getStrokeWidth() / 2.0f);
                        float fMax = Math.max(fDp + strokeWidth, (((getWidth() - (2.0f * fDp)) * this.progress) + fDp) - strokeWidth);
                        canvas.drawCircle(fMax, height, fDp2, paint);
                        PaintColorsListView.drawColorCircle(fMax, height, strokeWidth, ColorUtils.setAlphaComponent(colorPickerBottomSheet.mColor, (int) (this.progress * 255.0f)), canvas);
                        break;
                }
            }

            @Override
            public void onSizeChanged(int i, int i2, int i3, int i4) {
                switch (this.$r8$classId) {
                    case 1:
                        super.onSizeChanged(i, i2, i3, i4);
                        this.in.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{0, ((ColorPickerBottomSheet) this.progressT).mColor}, (float[]) null, Shader.TileMode.CLAMP));
                        break;
                    default:
                        super.onSizeChanged(i, i2, i3, i4);
                        break;
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                switch (this.$r8$classId) {
                    case 1:
                        int actionMasked = motionEvent.getActionMasked();
                        if (actionMasked != 0) {
                            if (actionMasked == 1) {
                                updatePosition(motionEvent.getX());
                                getParent().requestDisallowInterceptTouchEvent(false);
                            } else if (actionMasked != 2) {
                                if (actionMasked == 3) {
                                    getParent().requestDisallowInterceptTouchEvent(false);
                                }
                            }
                            return true;
                        }
                        getParent().requestDisallowInterceptTouchEvent(true);
                        updatePosition(motionEvent.getX());
                        return true;
                    default:
                        return super.onTouchEvent(motionEvent);
                }
            }

            public void updatePosition(float f) {
                float fDp = AndroidUtilities.dp(6.0f);
                float fClamp = MathUtils.clamp(((f - fDp) + (AndroidUtilities.dp(13.0f) - (this.out.getStrokeWidth() / 2.0f))) / (getWidth() - (fDp * 2.0f)), 0.0f, 1.0f);
                this.progress = fClamp;
                ColorPickerBottomSheet colorPickerBottomSheet = (ColorPickerBottomSheet) this.progressT;
                colorPickerBottomSheet.onSetColor(ColorUtils.setAlphaComponent(colorPickerBottomSheet.mColor, (int) (fClamp * 255.0f)), 1);
                invalidate();
            }

            public ProgressView(ColorPickerBottomSheet colorPickerBottomSheet, Context context) {
                super(context);
                this.progressT = colorPickerBottomSheet;
                this.in = new Paint(1);
                Paint paint = new Paint(1);
                this.out = paint;
                paint.setColor(-1);
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            }
        }
    }
}
