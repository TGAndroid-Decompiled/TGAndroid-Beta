package org.telegram.ui;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.time.SunDate;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeColors;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.AppIconsSelectorCell;
import org.telegram.ui.Cells.BrightnessControlCell;
import org.telegram.ui.Cells.ChatListCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.NotificationsCheckCell;
import org.telegram.ui.Cells.RadioButtonCell;
import org.telegram.ui.Cells.RadioColorCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Cells.ThemePreviewMessagesCell;
import org.telegram.ui.Cells.ThemeTypeCell;
import org.telegram.ui.Cells.ThemesHorizontalListCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SeekBarView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SimpleThemeDescription;
import org.telegram.ui.Components.SwipeGestureSettingsView;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.WebViewRequestProps;
import org.telegram.ui.web.SearchEngine;
import org.telegram.ui.web.WebBrowserSettings;

public class ThemeActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private int appIconHeaderRow;
    private int appIconSelectorRow;
    private int appIconShadowRow;
    private int automaticBrightnessInfoRow;
    private int automaticBrightnessRow;
    private int automaticHeaderRow;
    private int backgroundRow;
    private int bluetoothScoRow;
    private int browserRow;
    private int bubbleRadiusHeaderRow;
    private int bubbleRadiusInfoRow;
    private int bubbleRadiusRow;
    private int changeUserColor;
    private int chatBlurRow;
    private int chatListHeaderRow;
    private int chatListInfoRow;
    private int chatListRow;
    private int contactsReimportRow;
    private int contactsSortRow;
    private int createNewThemeRow;
    private int currentType;
    private ArrayList darkThemes = new ArrayList();
    private ArrayList defaultThemes = new ArrayList();
    private int directShareRow;
    private int distanceRow;
    private int editThemeRow;
    private int enableAnimationsRow;
    private GpsLocationListener gpsLocationListener;
    boolean hasThemeAccents;
    private boolean highlightSensitiveRow;
    boolean lastIsDarkTheme;
    private int lastShadowRow;
    private LinearLayoutManager layoutManager;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private int liteModeInfoRow;
    private int liteModeRow;
    private int mediaSoundHeaderRow;
    private int mediaSoundSectionRow;
    private ActionBarMenuItem menuItem;
    private GpsLocationListener networkLocationListener;
    private int newThemeInfoRow;
    private int nextMediaTapRow;
    private int nightAutomaticRow;
    private int nightDisabledRow;
    private int nightScheduledRow;
    private int nightSystemDefaultRow;
    private int nightThemeRow;
    private int nightTypeInfoRow;
    private int otherHeaderRow;
    private int otherSectionRow;
    private int pauseOnMediaRow;
    private int pauseOnRecordRow;
    private int preferedHeaderRow;
    private boolean previousByLocation;
    private int previousUpdatedType;
    private int raiseToListenRow;
    private int raiseToSpeakRow;
    private int rowCount;
    private int saveToGalleryOption1Row;
    private int saveToGalleryOption2Row;
    private int saveToGallerySectionRow;
    private int scheduleFromRow;
    private int scheduleFromToInfoRow;
    private int scheduleHeaderRow;
    private int scheduleLocationInfoRow;
    private int scheduleLocationRow;
    private int scheduleToRow;
    private int scheduleUpdateLocationRow;
    private int searchEngineRow;
    private int selectThemeHeaderRow;
    private int sendByEnterRow;
    private int sensitiveContentRow;
    private int settings2Row;
    private int settingsRow;
    private Theme.ThemeAccent sharingAccent;
    private AlertDialog sharingProgressDialog;
    private Theme.ThemeInfo sharingTheme;
    private int stickersInfoRow;
    private int stickersRow;
    private int stickersSectionRow;
    private RLottieDrawable sunDrawable;
    private int swipeGestureHeaderRow;
    private int swipeGestureInfoRow;
    private int swipeGestureRow;
    private int textSizeHeaderRow;
    private int textSizeRow;
    private int themeAccentListRow;
    private int themeHeaderRow;
    private int themeInfoRow;
    private int themeListRow;
    private int themeListRow2;
    private int themePreviewRow;
    private ThemesHorizontalListCell themesHorizontalListCell;
    private boolean updateDistance;
    private boolean updateRecordViaSco;
    private boolean updateSearchEngine;
    private boolean updatingLocation;

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    public ThemeActivity highlightSensitiveRow() {
        this.highlightSensitiveRow = true;
        return this;
    }

    private class GpsLocationListener implements LocationListener {
        @Override
        public void onProviderDisabled(String str) {
        }

        @Override
        public void onProviderEnabled(String str) {
        }

        @Override
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }

        private GpsLocationListener() {
        }

        GpsLocationListener(ThemeActivity themeActivity, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override
        public void onLocationChanged(Location location) {
            if (location == null) {
                return;
            }
            ThemeActivity.this.stopLocationUpdate();
            ThemeActivity.this.updateSunTime(location, false);
        }
    }

    private class TextSizeCell extends FrameLayout {
        private int endFontSize;
        private int lastWidth;
        private ThemePreviewMessagesCell messagesCell;
        private SeekBarView sizeBar;
        private int startFontSize;
        private TextPaint textPaint;

        public TextSizeCell(Context context) {
            super(context);
            this.startFontSize = 12;
            this.endFontSize = 30;
            setWillNotDraw(false);
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SeekBarView seekBarView = new SeekBarView(context);
            this.sizeBar = seekBarView;
            seekBarView.setReportChanges(true);
            this.sizeBar.setSeparatorsCount((this.endFontSize - this.startFontSize) + 1);
            this.sizeBar.setDelegate(new SeekBarView.SeekBarViewDelegate() {
                @Override
                public boolean needVisuallyDivideSteps() {
                    return SeekBarView.SeekBarViewDelegate.CC.$default$needVisuallyDivideSteps(this);
                }

                @Override
                public void onSeekBarPressed(boolean z) {
                }

                @Override
                public void onSeekBarDrag(boolean z, float f) {
                    TextSizeCell textSizeCell = TextSizeCell.this;
                    ThemeActivity.this.setFontSize(Math.round(textSizeCell.startFontSize + ((TextSizeCell.this.endFontSize - TextSizeCell.this.startFontSize) * f)));
                }

                @Override
                public CharSequence getContentDescription() {
                    return String.valueOf(Math.round(TextSizeCell.this.startFontSize + ((TextSizeCell.this.endFontSize - TextSizeCell.this.startFontSize) * TextSizeCell.this.sizeBar.getProgress())));
                }

                @Override
                public int getStepsCount() {
                    return TextSizeCell.this.endFontSize - TextSizeCell.this.startFontSize;
                }
            });
            this.sizeBar.setImportantForAccessibility(2);
            addView(this.sizeBar, LayoutHelper.createFrame(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
            ThemePreviewMessagesCell themePreviewMessagesCell = new ThemePreviewMessagesCell(context, ((BaseFragment) ThemeActivity.this).parentLayout, 0);
            this.messagesCell = themePreviewMessagesCell;
            themePreviewMessagesCell.setImportantForAccessibility(4);
            addView(this.messagesCell, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 53.0f, 0.0f, 0.0f));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            this.textPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteValueText));
            canvas.drawText("" + SharedConfig.fontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), this.textPaint);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int size = View.MeasureSpec.getSize(i);
            if (this.lastWidth != size) {
                SeekBarView seekBarView = this.sizeBar;
                int i3 = SharedConfig.fontSize;
                int i4 = this.startFontSize;
                seekBarView.setProgress((i3 - i4) / (this.endFontSize - i4));
                this.lastWidth = size;
            }
        }

        @Override
        public void invalidate() {
            super.invalidate();
            this.messagesCell.invalidate();
            this.sizeBar.invalidate();
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            this.sizeBar.getSeekBarAccessibilityDelegate().onInitializeAccessibilityNodeInfoInternal(this, accessibilityNodeInfo);
        }

        @Override
        public boolean performAccessibilityAction(int i, Bundle bundle) {
            return super.performAccessibilityAction(i, bundle) || this.sizeBar.getSeekBarAccessibilityDelegate().performAccessibilityActionInternal(this, i, bundle);
        }
    }

    private class BubbleRadiusCell extends FrameLayout {
        private int endRadius;
        private SeekBarView sizeBar;
        private int startRadius;
        private TextPaint textPaint;

        public BubbleRadiusCell(Context context) {
            super(context);
            this.startRadius = 0;
            this.endRadius = 17;
            setWillNotDraw(false);
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SeekBarView seekBarView = new SeekBarView(context);
            this.sizeBar = seekBarView;
            seekBarView.setReportChanges(true);
            this.sizeBar.setSeparatorsCount((this.endRadius - this.startRadius) + 1);
            this.sizeBar.setDelegate(new SeekBarView.SeekBarViewDelegate() {
                @Override
                public boolean needVisuallyDivideSteps() {
                    return SeekBarView.SeekBarViewDelegate.CC.$default$needVisuallyDivideSteps(this);
                }

                @Override
                public void onSeekBarPressed(boolean z) {
                }

                @Override
                public void onSeekBarDrag(boolean z, float f) {
                    BubbleRadiusCell bubbleRadiusCell = BubbleRadiusCell.this;
                    ThemeActivity.this.setBubbleRadius(Math.round(bubbleRadiusCell.startRadius + ((BubbleRadiusCell.this.endRadius - BubbleRadiusCell.this.startRadius) * f)), false);
                }

                @Override
                public CharSequence getContentDescription() {
                    return String.valueOf(Math.round(BubbleRadiusCell.this.startRadius + ((BubbleRadiusCell.this.endRadius - BubbleRadiusCell.this.startRadius) * BubbleRadiusCell.this.sizeBar.getProgress())));
                }

                @Override
                public int getStepsCount() {
                    return BubbleRadiusCell.this.endRadius - BubbleRadiusCell.this.startRadius;
                }
            });
            this.sizeBar.setImportantForAccessibility(2);
            addView(this.sizeBar, LayoutHelper.createFrame(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            this.textPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteValueText));
            canvas.drawText("" + SharedConfig.bubbleRadius, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), this.textPaint);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
            SeekBarView seekBarView = this.sizeBar;
            int i3 = SharedConfig.bubbleRadius;
            int i4 = this.startRadius;
            seekBarView.setProgress((i3 - i4) / (this.endRadius - i4));
        }

        @Override
        public void invalidate() {
            super.invalidate();
            this.sizeBar.invalidate();
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            this.sizeBar.getSeekBarAccessibilityDelegate().onInitializeAccessibilityNodeInfoInternal(this, accessibilityNodeInfo);
        }

        @Override
        public boolean performAccessibilityAction(int i, Bundle bundle) {
            return super.performAccessibilityAction(i, bundle) || this.sizeBar.getSeekBarAccessibilityDelegate().performAccessibilityActionInternal(this, i, bundle);
        }
    }

    public ThemeActivity(int i) {
        AnonymousClass1 anonymousClass1 = null;
        this.gpsLocationListener = new GpsLocationListener(this, anonymousClass1);
        this.networkLocationListener = new GpsLocationListener(this, anonymousClass1);
        this.currentType = i;
        updateRows(true);
    }

    public boolean setBubbleRadius(int i, boolean z) {
        if (i == SharedConfig.bubbleRadius) {
            return false;
        }
        SharedConfig.bubbleRadius = i;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putInt("bubbleRadius", SharedConfig.bubbleRadius);
        editorEdit.commit();
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(this.textSizeRow);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            View view = viewHolderFindViewHolderForAdapterPosition.itemView;
            if (view instanceof TextSizeCell) {
                TextSizeCell textSizeCell = (TextSizeCell) view;
                ChatMessageCell[] cells = textSizeCell.messagesCell.getCells();
                for (int i2 = 0; i2 < cells.length; i2++) {
                    cells[i2].getMessageObject().resetLayout();
                    cells[i2].requestLayout();
                }
                textSizeCell.invalidate();
            }
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = this.listView.findViewHolderForAdapterPosition(this.bubbleRadiusRow);
        if (viewHolderFindViewHolderForAdapterPosition2 != null) {
            View view2 = viewHolderFindViewHolderForAdapterPosition2.itemView;
            if (view2 instanceof BubbleRadiusCell) {
                BubbleRadiusCell bubbleRadiusCell = (BubbleRadiusCell) view2;
                if (z) {
                    bubbleRadiusCell.requestLayout();
                } else {
                    bubbleRadiusCell.invalidate();
                }
            }
        }
        updateMenuItem();
        return true;
    }

    public boolean setFontSize(int i) {
        if (i == SharedConfig.fontSize) {
            return false;
        }
        SharedConfig.fontSize = i;
        SharedConfig.fontSizeIsDefault = false;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
        if (sharedPreferences == null) {
            return false;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt("fons_size", SharedConfig.fontSize);
        editorEdit.commit();
        Theme.createCommonMessageResources();
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(this.textSizeRow);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            View view = viewHolderFindViewHolderForAdapterPosition.itemView;
            if (view instanceof TextSizeCell) {
                ChatMessageCell[] cells = ((TextSizeCell) view).messagesCell.getCells();
                for (int i2 = 0; i2 < cells.length; i2++) {
                    cells[i2].getMessageObject().resetLayout();
                    cells[i2].requestLayout();
                }
            }
        }
        updateMenuItem();
        return true;
    }

    public void updateRows(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        TLRPC.TL_theme tL_theme;
        int i6 = this.rowCount;
        int i7 = this.themeAccentListRow;
        int i8 = this.editThemeRow;
        int i9 = this.raiseToSpeakRow;
        this.rowCount = 0;
        this.contactsReimportRow = -1;
        this.contactsSortRow = -1;
        this.scheduleLocationRow = -1;
        this.scheduleUpdateLocationRow = -1;
        this.scheduleLocationInfoRow = -1;
        this.nightDisabledRow = -1;
        this.nightScheduledRow = -1;
        this.nightAutomaticRow = -1;
        this.nightSystemDefaultRow = -1;
        this.nightTypeInfoRow = -1;
        this.scheduleHeaderRow = -1;
        this.nightThemeRow = -1;
        this.browserRow = -1;
        this.newThemeInfoRow = -1;
        this.scheduleFromRow = -1;
        this.scheduleToRow = -1;
        this.scheduleFromToInfoRow = -1;
        this.themeListRow = -1;
        this.themeListRow2 = -1;
        this.themeAccentListRow = -1;
        this.themeInfoRow = -1;
        this.preferedHeaderRow = -1;
        this.automaticHeaderRow = -1;
        this.automaticBrightnessRow = -1;
        this.automaticBrightnessInfoRow = -1;
        this.textSizeHeaderRow = -1;
        this.themeHeaderRow = -1;
        this.bubbleRadiusHeaderRow = -1;
        this.bubbleRadiusRow = -1;
        this.bubbleRadiusInfoRow = -1;
        this.chatListHeaderRow = -1;
        this.chatListRow = -1;
        this.chatListInfoRow = -1;
        this.chatBlurRow = -1;
        this.pauseOnRecordRow = -1;
        this.pauseOnMediaRow = -1;
        this.stickersRow = -1;
        this.stickersInfoRow = -1;
        this.stickersSectionRow = -1;
        this.mediaSoundHeaderRow = -1;
        this.otherHeaderRow = -1;
        this.mediaSoundSectionRow = -1;
        this.otherSectionRow = -1;
        this.liteModeRow = -1;
        this.liteModeInfoRow = -1;
        this.textSizeRow = -1;
        this.backgroundRow = -1;
        this.changeUserColor = -1;
        this.settingsRow = -1;
        this.directShareRow = -1;
        this.sensitiveContentRow = -1;
        this.enableAnimationsRow = -1;
        this.raiseToSpeakRow = -1;
        this.raiseToListenRow = -1;
        this.nextMediaTapRow = -1;
        this.sendByEnterRow = -1;
        this.saveToGalleryOption1Row = -1;
        this.saveToGalleryOption2Row = -1;
        this.saveToGallerySectionRow = -1;
        this.distanceRow = -1;
        this.searchEngineRow = -1;
        this.bluetoothScoRow = -1;
        this.settings2Row = -1;
        this.swipeGestureHeaderRow = -1;
        this.swipeGestureRow = -1;
        this.swipeGestureInfoRow = -1;
        this.selectThemeHeaderRow = -1;
        this.themePreviewRow = -1;
        this.editThemeRow = -1;
        this.createNewThemeRow = -1;
        this.appIconHeaderRow = -1;
        this.appIconSelectorRow = -1;
        this.appIconShadowRow = -1;
        this.lastShadowRow = -1;
        this.defaultThemes.clear();
        this.darkThemes.clear();
        int size = Theme.themes.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            Theme.ThemeInfo themeInfo = (Theme.ThemeInfo) Theme.themes.get(i10);
            int i11 = this.currentType;
            if (i11 == 0 || i11 == 3 || (!themeInfo.isLight() && ((tL_theme = themeInfo.info) == null || tL_theme.document != null))) {
                if (themeInfo.pathToFile != null) {
                    this.darkThemes.add(themeInfo);
                } else {
                    this.defaultThemes.add(themeInfo);
                }
            }
            i10++;
        }
        Collections.sort(this.defaultThemes, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((Theme.ThemeInfo) obj).sortIndex, ((Theme.ThemeInfo) obj2).sortIndex);
            }
        });
        int i12 = this.currentType;
        if (i12 == 3) {
            int i13 = this.rowCount;
            this.selectThemeHeaderRow = i13;
            this.themeListRow2 = i13 + 1;
            this.chatListInfoRow = i13 + 2;
            this.themePreviewRow = i13 + 3;
            this.themeHeaderRow = i13 + 4;
            this.rowCount = i13 + 6;
            this.themeListRow = i13 + 5;
            boolean zHasAccentColors = Theme.getCurrentTheme().hasAccentColors();
            this.hasThemeAccents = zHasAccentColors;
            ThemesHorizontalListCell themesHorizontalListCell = this.themesHorizontalListCell;
            if (themesHorizontalListCell != null) {
                themesHorizontalListCell.setDrawDivider(zHasAccentColors);
            }
            if (this.hasThemeAccents) {
                int i14 = this.rowCount;
                this.rowCount = i14 + 1;
                this.themeAccentListRow = i14;
            }
            int i15 = this.rowCount;
            this.rowCount = i15 + 1;
            this.bubbleRadiusInfoRow = i15;
            Theme.ThemeInfo currentTheme = Theme.getCurrentTheme();
            Theme.ThemeAccent accent = currentTheme.getAccent(false);
            ArrayList arrayList = currentTheme.themeAccents;
            if (arrayList != null && !arrayList.isEmpty() && accent != null && accent.id >= 100) {
                int i16 = this.rowCount;
                this.rowCount = i16 + 1;
                this.editThemeRow = i16;
            }
            int i17 = this.rowCount;
            this.createNewThemeRow = i17;
            this.rowCount = i17 + 2;
            this.lastShadowRow = i17 + 1;
        } else if (i12 == 0) {
            int i18 = this.rowCount;
            this.textSizeHeaderRow = i18;
            this.textSizeRow = i18 + 1;
            this.backgroundRow = i18 + 2;
            this.changeUserColor = i18 + 3;
            this.newThemeInfoRow = i18 + 4;
            this.themeHeaderRow = i18 + 5;
            this.themeListRow2 = i18 + 6;
            this.themeInfoRow = i18 + 7;
            this.bubbleRadiusHeaderRow = i18 + 8;
            this.bubbleRadiusRow = i18 + 9;
            this.bubbleRadiusInfoRow = i18 + 10;
            this.chatListHeaderRow = i18 + 11;
            this.chatListRow = i18 + 12;
            this.chatListInfoRow = i18 + 13;
            this.appIconHeaderRow = i18 + 14;
            this.appIconSelectorRow = i18 + 15;
            this.appIconShadowRow = i18 + 16;
            this.swipeGestureHeaderRow = i18 + 17;
            this.swipeGestureRow = i18 + 18;
            this.swipeGestureInfoRow = i18 + 19;
            this.nightThemeRow = i18 + 20;
            this.browserRow = i18 + 21;
            this.liteModeRow = i18 + 22;
            this.stickersRow = i18 + 23;
            this.stickersSectionRow = i18 + 24;
            this.mediaSoundHeaderRow = i18 + 25;
            this.nextMediaTapRow = i18 + 26;
            int i19 = i18 + 28;
            this.rowCount = i19;
            this.raiseToListenRow = i18 + 27;
            if (SharedConfig.raiseToListen) {
                this.rowCount = i18 + 29;
                this.raiseToSpeakRow = i19;
            }
            int i20 = this.rowCount;
            this.pauseOnRecordRow = i20;
            this.pauseOnMediaRow = i20 + 1;
            this.bluetoothScoRow = i20 + 2;
            this.mediaSoundSectionRow = i20 + 3;
            this.otherHeaderRow = i20 + 4;
            this.rowCount = i20 + 6;
            this.directShareRow = i20 + 5;
            TL_account.contentSettings contentSettings = getMessagesController().getContentSettings();
            if (contentSettings != null && contentSettings.sensitive_can_change) {
                int i21 = this.rowCount;
                this.rowCount = i21 + 1;
                this.sensitiveContentRow = i21;
            }
            int i22 = this.rowCount;
            this.sendByEnterRow = i22;
            this.distanceRow = i22 + 1;
            this.rowCount = i22 + 3;
            this.otherSectionRow = i22 + 2;
        } else {
            int i23 = this.rowCount;
            this.nightDisabledRow = i23;
            this.nightScheduledRow = i23 + 1;
            int i24 = i23 + 3;
            this.rowCount = i24;
            this.nightAutomaticRow = i23 + 2;
            if (Build.VERSION.SDK_INT >= 29) {
                this.rowCount = i23 + 4;
                this.nightSystemDefaultRow = i24;
            }
            int i25 = this.rowCount;
            int i26 = i25 + 1;
            this.rowCount = i26;
            this.nightTypeInfoRow = i25;
            int i27 = Theme.selectedAutoNightType;
            if (i27 == 1) {
                this.scheduleHeaderRow = i26;
                int i28 = i25 + 3;
                this.rowCount = i28;
                this.scheduleLocationRow = i25 + 2;
                if (Theme.autoNightScheduleByLocation) {
                    this.scheduleUpdateLocationRow = i28;
                    this.rowCount = i25 + 5;
                    this.scheduleLocationInfoRow = i25 + 4;
                } else {
                    this.scheduleFromRow = i28;
                    this.scheduleToRow = i25 + 4;
                    this.rowCount = i25 + 6;
                    this.scheduleFromToInfoRow = i25 + 5;
                }
            } else if (i27 == 2) {
                this.automaticHeaderRow = i26;
                this.automaticBrightnessRow = i25 + 2;
                this.rowCount = i25 + 4;
                this.automaticBrightnessInfoRow = i25 + 3;
            }
            if (Theme.selectedAutoNightType != 0) {
                int i29 = this.rowCount;
                this.preferedHeaderRow = i29;
                this.rowCount = i29 + 2;
                this.themeListRow = i29 + 1;
                boolean zHasAccentColors2 = Theme.getCurrentNightTheme().hasAccentColors();
                this.hasThemeAccents = zHasAccentColors2;
                ThemesHorizontalListCell themesHorizontalListCell2 = this.themesHorizontalListCell;
                if (themesHorizontalListCell2 != null) {
                    themesHorizontalListCell2.setDrawDivider(zHasAccentColors2);
                }
                if (this.hasThemeAccents) {
                    int i30 = this.rowCount;
                    this.rowCount = i30 + 1;
                    this.themeAccentListRow = i30;
                }
                int i31 = this.rowCount;
                this.rowCount = i31 + 1;
                this.themeInfoRow = i31;
            }
        }
        ThemesHorizontalListCell themesHorizontalListCell3 = this.themesHorizontalListCell;
        if (themesHorizontalListCell3 != null) {
            themesHorizontalListCell3.notifyDataSetChanged(this.listView.getWidth());
        }
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            if (this.currentType != 1 || (i4 = this.previousUpdatedType) == (i5 = Theme.selectedAutoNightType) || i4 == -1) {
                if (z || this.previousUpdatedType == -1) {
                    listAdapter.notifyDataSetChanged();
                } else {
                    if (i7 == -1 && (i3 = this.themeAccentListRow) != -1) {
                        listAdapter.notifyItemInserted(i3);
                    } else if (i7 != -1 && this.themeAccentListRow == -1) {
                        listAdapter.notifyItemRemoved(i7);
                        if (i8 != -1) {
                            i8--;
                        }
                    } else {
                        int i32 = this.themeAccentListRow;
                        if (i32 != -1) {
                            listAdapter.notifyItemChanged(i32);
                        }
                    }
                    if (i8 == -1 && (i2 = this.editThemeRow) != -1) {
                        this.listAdapter.notifyItemInserted(i2);
                    } else if (i8 != -1 && this.editThemeRow == -1) {
                        this.listAdapter.notifyItemRemoved(i8);
                    }
                    if (i9 == -1 && (i = this.raiseToSpeakRow) != -1) {
                        this.listAdapter.notifyItemInserted(i);
                    } else if (i9 != -1 && this.raiseToSpeakRow == -1) {
                        this.listAdapter.notifyItemRemoved(i9);
                    }
                }
            } else {
                int i33 = this.nightTypeInfoRow;
                int i34 = i33 + 1;
                if (i4 != i5) {
                    int i35 = 0;
                    while (i35 < 4) {
                        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findViewHolderForAdapterPosition(i35);
                        if (holder != null) {
                            View view = holder.itemView;
                            if (view instanceof ThemeTypeCell) {
                                ((ThemeTypeCell) view).setTypeChecked(i35 == Theme.selectedAutoNightType);
                            }
                        }
                        i35++;
                    }
                    int i36 = Theme.selectedAutoNightType;
                    if (i36 == 0) {
                        this.listAdapter.notifyItemRangeRemoved(i34, i6 - i34);
                    } else if (i36 == 1) {
                        int i37 = this.previousUpdatedType;
                        if (i37 == 0) {
                            this.listAdapter.notifyItemRangeInserted(i34, this.rowCount - i34);
                        } else if (i37 == 2) {
                            this.listAdapter.notifyItemRangeRemoved(i34, 3);
                            this.listAdapter.notifyItemRangeInserted(i34, Theme.autoNightScheduleByLocation ? 4 : 5);
                        } else if (i37 == 3) {
                            this.listAdapter.notifyItemRangeInserted(i34, Theme.autoNightScheduleByLocation ? 4 : 5);
                        }
                    } else if (i36 == 2) {
                        int i38 = this.previousUpdatedType;
                        if (i38 == 0) {
                            this.listAdapter.notifyItemRangeInserted(i34, this.rowCount - i34);
                        } else if (i38 == 1) {
                            this.listAdapter.notifyItemRangeRemoved(i34, Theme.autoNightScheduleByLocation ? 4 : 5);
                            this.listAdapter.notifyItemRangeInserted(i34, 3);
                        } else if (i38 == 3) {
                            this.listAdapter.notifyItemRangeInserted(i34, 3);
                        }
                    } else if (i36 == 3) {
                        int i39 = this.previousUpdatedType;
                        if (i39 == 0) {
                            this.listAdapter.notifyItemRangeInserted(i34, this.rowCount - i34);
                        } else if (i39 == 2) {
                            this.listAdapter.notifyItemRangeRemoved(i34, 3);
                        } else if (i39 == 1) {
                            this.listAdapter.notifyItemRangeRemoved(i34, Theme.autoNightScheduleByLocation ? 4 : 5);
                        }
                    }
                } else {
                    boolean z2 = this.previousByLocation;
                    boolean z3 = Theme.autoNightScheduleByLocation;
                    if (z2 != z3) {
                        int i40 = i33 + 3;
                        listAdapter.notifyItemRangeRemoved(i40, z3 ? 3 : 2);
                        this.listAdapter.notifyItemRangeInserted(i40, Theme.autoNightScheduleByLocation ? 2 : 3);
                    }
                }
            }
        }
        if (this.currentType == 1) {
            this.previousByLocation = Theme.autoNightScheduleByLocation;
            this.previousUpdatedType = Theme.selectedAutoNightType;
        }
        updateMenuItem();
    }

    @Override
    public boolean onFragmentCreate() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.themeListUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.themeAccentListUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.needShareTheme);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.needSetDayNightTheme);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiPreviewThemesChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.appConfigUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.contentSettingsLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadError);
        getNotificationCenter().addObserver(this, NotificationCenter.webBrowserSettingsUpdate);
        if (this.currentType == 0) {
            Theme.loadRemoteThemes(this.currentAccount, true);
            Theme.checkCurrentRemoteTheme(true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        stopLocationUpdate();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.themeListUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.themeAccentListUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.needShareTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.needSetDayNightTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiPreviewThemesChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.appConfigUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.contentSettingsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadError);
        getNotificationCenter().removeObserver(this, NotificationCenter.webBrowserSettingsUpdate);
        Theme.saveAutoNightThemeConfig();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        AlertDialog alertDialog;
        int i4;
        int i5;
        if (i == NotificationCenter.locationPermissionGranted) {
            updateSunTime(null, true);
            return;
        }
        if (i == NotificationCenter.didSetNewWallpapper || i == NotificationCenter.emojiLoaded) {
            RecyclerListView recyclerListView = this.listView;
            if (recyclerListView != null) {
                recyclerListView.invalidateViews();
            }
            updateMenuItem();
            return;
        }
        if (i == NotificationCenter.webBrowserSettingsUpdate) {
            ListAdapter listAdapter = this.listAdapter;
            if (listAdapter == null || (i5 = this.browserRow) == -1) {
                return;
            }
            listAdapter.notifyItemChanged(i5);
            return;
        }
        if (i == NotificationCenter.themeAccentListUpdated) {
            ListAdapter listAdapter2 = this.listAdapter;
            if (listAdapter2 == null || (i4 = this.themeAccentListRow) == -1) {
                return;
            }
            listAdapter2.notifyItemChanged(i4, new Object());
            return;
        }
        if (i == NotificationCenter.themeListUpdated) {
            updateRows(true);
            return;
        }
        if (i == NotificationCenter.themeUploadedToServer) {
            Theme.ThemeInfo themeInfo = (Theme.ThemeInfo) objArr[0];
            Theme.ThemeAccent themeAccent = (Theme.ThemeAccent) objArr[1];
            if (themeInfo == this.sharingTheme && themeAccent == this.sharingAccent) {
                StringBuilder sb = new StringBuilder();
                sb.append("https://");
                sb.append(getMessagesController().linkPrefix);
                sb.append("/addtheme/");
                sb.append((themeAccent != null ? themeAccent.info : themeInfo.info).slug);
                String string = sb.toString();
                showDialog(new ShareAlert(getParentActivity(), null, string, false, string, false));
                AlertDialog alertDialog2 = this.sharingProgressDialog;
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.themeUploadError) {
            Theme.ThemeInfo themeInfo2 = (Theme.ThemeInfo) objArr[0];
            Theme.ThemeAccent themeAccent2 = (Theme.ThemeAccent) objArr[1];
            if (themeInfo2 == this.sharingTheme && themeAccent2 == this.sharingAccent && (alertDialog = this.sharingProgressDialog) == null) {
                alertDialog.dismiss();
                return;
            }
            return;
        }
        if (i == NotificationCenter.needShareTheme) {
            if (getParentActivity() == null || this.isPaused) {
                return;
            }
            this.sharingTheme = (Theme.ThemeInfo) objArr[0];
            this.sharingAccent = (Theme.ThemeAccent) objArr[1];
            AlertDialog alertDialog3 = new AlertDialog(getParentActivity(), 3);
            this.sharingProgressDialog = alertDialog3;
            alertDialog3.setCanCancel(true);
            showDialog(this.sharingProgressDialog, new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    ThemeActivity.m4680$r8$lambda$pDhCLvXW9kAM_5k3xcl4TfOjCk(this.f$0, dialogInterface);
                }
            });
            return;
        }
        if (i == NotificationCenter.needSetDayNightTheme) {
            updateMenuItem();
            checkCurrentDayNight();
            return;
        }
        if (i == NotificationCenter.emojiPreviewThemesChanged) {
            int i6 = this.themeListRow2;
            if (i6 >= 0) {
                this.listAdapter.notifyItemChanged(i6);
                return;
            }
            return;
        }
        if ((i == NotificationCenter.contentSettingsLoaded || i == NotificationCenter.appConfigUpdated) && (i3 = this.sensitiveContentRow) >= 0) {
            this.listAdapter.notifyItemChanged(i3);
        }
    }

    public static void m4680$r8$lambda$pDhCLvXW9kAM_5k3xcl4TfOjCk(ThemeActivity themeActivity, DialogInterface dialogInterface) {
        themeActivity.sharingProgressDialog = null;
        themeActivity.sharingTheme = null;
        themeActivity.sharingAccent = null;
    }

    @Override
    public View createView(final Context context) {
        this.lastIsDarkTheme = !Theme.isCurrentThemeDay();
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        int i = this.currentType;
        if (i == 3) {
            this.actionBar.setTitle(LocaleController.getString("BrowseThemes", R.string.BrowseThemes));
            ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
            int i2 = R.raw.sun;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i2, "" + i2, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.sunDrawable = rLottieDrawable;
            if (this.lastIsDarkTheme) {
                rLottieDrawable.setCurrentFrame(rLottieDrawable.getFramesCount() - 1);
            } else {
                rLottieDrawable.setCurrentFrame(0);
            }
            this.sunDrawable.setPlayInDirectionOfCustomEndFrame(true);
            this.menuItem = actionBarMenuCreateMenu.addItem(5, this.sunDrawable);
        } else if (i == 0) {
            this.actionBar.setTitle(LocaleController.getString("ChatSettings", R.string.ChatSettings));
            ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(0, R.drawable.ic_ab_other);
            this.menuItem = actionBarMenuItemAddItem;
            actionBarMenuItemAddItem.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
            this.menuItem.addSubItem(2, R.drawable.msg_share, LocaleController.getString("ShareTheme", R.string.ShareTheme));
            this.menuItem.addSubItem(3, R.drawable.msg_edit, LocaleController.getString("EditThemeColors", R.string.EditThemeColors));
            this.menuItem.addSubItem(1, R.drawable.msg_palette, LocaleController.getString("CreateNewThemeMenu", R.string.CreateNewThemeMenu));
            this.menuItem.addSubItem(4, R.drawable.msg_reset, LocaleController.getString("ThemeResetToDefaults", R.string.ThemeResetToDefaults));
            if (getMessagesController().getContentSettings() == null) {
                getMessagesController().getContentSettings(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        ThemeActivity.$r8$lambda$2hkMdQ_Deq_3qTmsvhTeIpsmDXs(this.f$0, (TL_account.contentSettings) obj);
                    }
                });
            }
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoNightTheme));
        }
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && iNavigationLayout.isRightLayout()) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1());
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        this.fragmentView = frameLayout;
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setAdapter(this.listAdapter);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setDelayAnimations(false);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view, int i3) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i3);
            }

            @Override
            public void onDoubleTap(View view, int i3, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i3, f, f2);
            }

            @Override
            public final void onItemClick(View view, int i3, float f, float f2) {
                ThemeActivity.$r8$lambda$v5A2K14SuCfVVf9TPmb7FpgKSk4(this.f$0, context, view, i3, f, f2);
            }
        });
        if (this.currentType == 0) {
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setDurations(350L);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setSupportsChangeAnimations(false);
            this.listView.setItemAnimator(defaultItemAnimator);
        }
        if (this.highlightSensitiveRow) {
            updateRows(false);
            this.highlightSensitiveRow = false;
            this.listView.scrollToPosition(this.listAdapter.getItemCount() - 1);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ThemeActivity themeActivity = this.f$0;
                    themeActivity.listView.highlightRow(new RecyclerListView.IntReturnCallback() {
                        @Override
                        public final int run() {
                            return this.f$0.sensitiveContentRow;
                        }
                    });
                }
            }, 200L);
        }
        return this.fragmentView;
    }

    public static void $r8$lambda$2hkMdQ_Deq_3qTmsvhTeIpsmDXs(ThemeActivity themeActivity, TL_account.contentSettings contentsettings) {
        ListAdapter listAdapter;
        RecyclerListView recyclerListView = themeActivity.listView;
        if (recyclerListView == null || !recyclerListView.isAttachedToWindow() || (listAdapter = themeActivity.listAdapter) == null) {
            return;
        }
        int i = themeActivity.sensitiveContentRow;
        boolean z = false;
        boolean z2 = i >= 0;
        if (contentsettings != null && contentsettings.sensitive_can_change) {
            z = true;
        }
        if (z2 == z) {
            listAdapter.notifyItemChanged(i);
        } else {
            themeActivity.updateRows(true);
        }
    }

    class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        AnonymousClass1() {
        }

        @Override
        public void onItemClick(int i) {
            boolean zEquals;
            Theme.ThemeInfo theme;
            if (i == -1) {
                ThemeActivity.this.finishFragment();
                return;
            }
            if (i == 1) {
                ThemeActivity.this.createNewTheme();
                return;
            }
            if (i == 2) {
                Theme.ThemeAccent accent = Theme.getCurrentTheme().getAccent(false);
                if (accent.info == null) {
                    ThemeActivity.this.getMessagesController().saveThemeToServer(accent.parentTheme, accent);
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.needShareTheme, accent.parentTheme, accent);
                    return;
                }
                String str = "https://" + ThemeActivity.this.getMessagesController().linkPrefix + "/addtheme/" + accent.info.slug;
                ThemeActivity.this.showDialog(new ShareAlert(ThemeActivity.this.getParentActivity(), null, str, false, str, false));
                return;
            }
            if (i == 3) {
                ThemeActivity.this.editTheme();
                return;
            }
            if (i == 4) {
                if (ThemeActivity.this.getParentActivity() == null) {
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(ThemeActivity.this.getParentActivity());
                builder.setTitle(LocaleController.getString("ThemeResetToDefaultsTitle", R.string.ThemeResetToDefaultsTitle));
                builder.setMessage(LocaleController.getString("ThemeResetToDefaultsText", R.string.ThemeResetToDefaultsText));
                builder.setPositiveButton(LocaleController.getString("Reset", R.string.Reset), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        ThemeActivity.AnonymousClass1.m4686$r8$lambda$woc2Pg8UDVLyp7jztIHSTeuY(this.f$0, alertDialog, i2);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                AlertDialog alertDialogCreate = builder.create();
                ThemeActivity.this.showDialog(alertDialogCreate);
                TextView textView = (TextView) alertDialogCreate.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                    return;
                }
                return;
            }
            if (i == 5) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str2 = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (Theme.getTheme(string) == null || Theme.getTheme(string).isDark()) {
                    string = "Blue";
                }
                String str3 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (Theme.getTheme(string2) == null || !Theme.getTheme(string2).isDark()) {
                    string2 = "Dark Blue";
                }
                Theme.ThemeInfo activeTheme = Theme.getActiveTheme();
                if (string.equals(string2)) {
                    if (activeTheme.isDark() || string.equals("Dark Blue") || string.equals("Night")) {
                        str3 = string2;
                    }
                    zEquals = str2.equals(activeTheme.getKey());
                    if (zEquals) {
                        theme = Theme.getTheme(str3);
                    } else {
                        theme = Theme.getTheme(str2);
                    }
                    int[] iArr = new int[2];
                    ThemeActivity.this.menuItem.getIconView().getLocationInWindow(iArr);
                    iArr[0] = iArr[0] + (ThemeActivity.this.menuItem.getIconView().getMeasuredWidth() / 2);
                    iArr[1] = iArr[1] + (ThemeActivity.this.menuItem.getIconView().getMeasuredHeight() / 2);
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.needSetDayNightTheme, theme, Boolean.FALSE, iArr, -1, Boolean.valueOf(zEquals), ThemeActivity.this.menuItem.getIconView());
                    ThemeActivity.this.updateRows(true);
                    Theme.turnOffAutoNight(ThemeActivity.this);
                }
                str3 = string2;
                str2 = string;
                zEquals = str2.equals(activeTheme.getKey());
                if (zEquals) {
                    theme = Theme.getTheme(str3);
                } else {
                    theme = Theme.getTheme(str2);
                }
                int[] iArr2 = new int[2];
                ThemeActivity.this.menuItem.getIconView().getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] + (ThemeActivity.this.menuItem.getIconView().getMeasuredWidth() / 2);
                iArr2[1] = iArr2[1] + (ThemeActivity.this.menuItem.getIconView().getMeasuredHeight() / 2);
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.needSetDayNightTheme, theme, Boolean.FALSE, iArr2, -1, Boolean.valueOf(zEquals), ThemeActivity.this.menuItem.getIconView());
                ThemeActivity.this.updateRows(true);
                Theme.turnOffAutoNight(ThemeActivity.this);
            }
        }

        public static void m4686$r8$lambda$woc2Pg8UDVLyp7jztIHSTeuY(AnonymousClass1 anonymousClass1, AlertDialog alertDialog, int i) {
            boolean fontSize = ThemeActivity.this.setFontSize(AndroidUtilities.isTablet() ? 18 : 16);
            if (ThemeActivity.this.setBubbleRadius(17, true)) {
                fontSize = true;
            }
            if (fontSize) {
                ThemeActivity.this.listAdapter.notifyItemChanged(ThemeActivity.this.textSizeRow, new Object());
                ThemeActivity.this.listAdapter.notifyItemChanged(ThemeActivity.this.bubbleRadiusRow, new Object());
            }
            if (ThemeActivity.this.themesHorizontalListCell != null) {
                Theme.ThemeInfo theme = Theme.getTheme("Blue");
                Theme.ThemeInfo currentTheme = Theme.getCurrentTheme();
                Theme.ThemeAccent themeAccent = (Theme.ThemeAccent) theme.themeAccentsMap.get(Theme.DEFALT_THEME_ACCENT_ID);
                if (themeAccent != null) {
                    Theme.OverrideWallpaperInfo overrideWallpaperInfo = new Theme.OverrideWallpaperInfo();
                    overrideWallpaperInfo.slug = "d";
                    overrideWallpaperInfo.fileName = "Blue_99_wp.jpg";
                    overrideWallpaperInfo.originalFileName = "Blue_99_wp.jpg";
                    themeAccent.overrideWallpaper = overrideWallpaperInfo;
                    theme.setOverrideWallpaper(overrideWallpaperInfo);
                }
                if (theme != currentTheme) {
                    theme.setCurrentAccentId(Theme.DEFALT_THEME_ACCENT_ID);
                    Theme.saveThemeAccents(theme, true, false, true, false);
                    ThemeActivity.this.themesHorizontalListCell.selectTheme(theme);
                    ThemeActivity.this.themesHorizontalListCell.smoothScrollToPosition(0);
                    return;
                }
                if (theme.currentAccentId != Theme.DEFALT_THEME_ACCENT_ID) {
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.needSetDayNightTheme, currentTheme, Boolean.valueOf(ThemeActivity.this.currentType == 1), null, Integer.valueOf(Theme.DEFALT_THEME_ACCENT_ID));
                    ThemeActivity.this.listAdapter.notifyItemChanged(ThemeActivity.this.themeAccentListRow);
                } else {
                    Theme.reloadWallpaper(true);
                }
            }
        }
    }

    public static void $r8$lambda$v5A2K14SuCfVVf9TPmb7FpgKSk4(final ThemeActivity themeActivity, Context context, final View view, final int i, float f, float f2) {
        int i2;
        int i3;
        String string;
        if (i == themeActivity.enableAnimationsRow) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z = globalMainSettings.getBoolean("view_animations", true);
            SharedPreferences.Editor editorEdit = globalMainSettings.edit();
            boolean z2 = !z;
            editorEdit.putBoolean("view_animations", z2);
            SharedConfig.setAnimationsEnabled(z2);
            editorEdit.commit();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(z2);
                return;
            }
            return;
        }
        if (i == themeActivity.backgroundRow) {
            themeActivity.presentFragment(new WallpapersListActivity(0));
            return;
        }
        if (i == themeActivity.changeUserColor) {
            themeActivity.presentFragment(new PeerColorActivity(0L).setOnApplied(themeActivity));
            return;
        }
        if (i == themeActivity.sendByEnterRow) {
            SharedPreferences globalMainSettings2 = MessagesController.getGlobalMainSettings();
            boolean z3 = globalMainSettings2.getBoolean("send_by_enter", false);
            SharedPreferences.Editor editorEdit2 = globalMainSettings2.edit();
            boolean z4 = !z3;
            editorEdit2.putBoolean("send_by_enter", z4);
            editorEdit2.commit();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(z4);
                return;
            }
            return;
        }
        if (i == themeActivity.raiseToSpeakRow) {
            SharedConfig.toggleRaiseToSpeak();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(SharedConfig.raiseToSpeak);
                return;
            }
            return;
        }
        if (i == themeActivity.nextMediaTapRow) {
            SharedConfig.toggleNextMediaTap();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(SharedConfig.nextMediaTap);
                return;
            }
            return;
        }
        if (i == themeActivity.raiseToListenRow) {
            SharedConfig.toggleRaiseToListen();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(SharedConfig.raiseToListen);
            }
            if (!SharedConfig.raiseToListen && themeActivity.raiseToSpeakRow != -1) {
                for (int i4 = 0; i4 < themeActivity.listView.getChildCount(); i4++) {
                    View childAt = themeActivity.listView.getChildAt(i4);
                    if ((childAt instanceof TextCheckCell) && themeActivity.listView.getChildAdapterPosition(childAt) == themeActivity.raiseToSpeakRow) {
                        ((TextCheckCell) childAt).setChecked(false);
                    }
                }
            }
            themeActivity.updateRows(false);
            return;
        }
        if (i == themeActivity.pauseOnRecordRow) {
            SharedConfig.togglePauseMusicOnRecord();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(SharedConfig.pauseMusicOnRecord);
                return;
            }
            return;
        }
        if (i == themeActivity.pauseOnMediaRow) {
            SharedConfig.togglePauseMusicOnMedia();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(SharedConfig.pauseMusicOnMedia);
                return;
            }
            return;
        }
        if (i == themeActivity.distanceRow) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference = new AtomicReference();
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            CharSequence[] charSequenceArr = {LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic), LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers), LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles)};
            final int i5 = 0;
            while (i5 < 3) {
                RadioColorCell radioColorCell = new RadioColorCell(themeActivity.getParentActivity());
                radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                radioColorCell.setCheckColor(Theme.getColor(Theme.key_radioBackground), Theme.getColor(Theme.key_dialogRadioBackgroundChecked));
                radioColorCell.setTextAndValue(charSequenceArr[i5], i5 == SharedConfig.distanceSystemType);
                radioColorCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector), 2));
                linearLayout.addView(radioColorCell);
                radioColorCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ThemeActivity.m4683$r8$lambda$vBy7czrF7UI6WXFqTpHTwgqqvM(this.f$0, i5, atomicReference, view2);
                    }
                });
                i5++;
            }
            AlertDialog alertDialogCreate = new AlertDialog.Builder(themeActivity.getParentActivity()).setTitle(LocaleController.getString("DistanceUnitsTitle", R.string.DistanceUnitsTitle)).setView(linearLayout).setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null).create();
            atomicReference.set(alertDialogCreate);
            themeActivity.showDialog(alertDialogCreate);
            return;
        }
        if (i == themeActivity.searchEngineRow) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference2 = new AtomicReference();
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            ArrayList searchEngines = SearchEngine.getSearchEngines();
            int size = searchEngines.size();
            CharSequence[] charSequenceArr2 = new CharSequence[size];
            final int i6 = 0;
            while (i6 < size) {
                charSequenceArr2[i6] = ((SearchEngine) searchEngines.get(i6)).name;
                RadioColorCell radioColorCell2 = new RadioColorCell(themeActivity.getParentActivity());
                radioColorCell2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                radioColorCell2.setCheckColor(Theme.getColor(Theme.key_radioBackground), Theme.getColor(Theme.key_dialogRadioBackgroundChecked));
                radioColorCell2.setTextAndValue(charSequenceArr2[i6], i6 == SharedConfig.searchEngineType);
                radioColorCell2.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector), 2));
                linearLayout2.addView(radioColorCell2);
                radioColorCell2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ThemeActivity.$r8$lambda$Sw6vFYI4tjSxxmGeJ9K8laTsc5I(this.f$0, i6, atomicReference2, view2);
                    }
                });
                i6++;
            }
            AlertDialog alertDialogCreate2 = new AlertDialog.Builder(themeActivity.getParentActivity()).setTitle(LocaleController.getString(R.string.SearchEngine)).setView(linearLayout2).setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null).create();
            atomicReference2.set(alertDialogCreate2);
            themeActivity.showDialog(alertDialogCreate2);
            return;
        }
        if (i == themeActivity.bluetoothScoRow) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference3 = new AtomicReference();
            LinearLayout linearLayout3 = new LinearLayout(context);
            linearLayout3.setOrientation(1);
            RadioColorCell radioColorCell3 = new RadioColorCell(themeActivity.getParentActivity());
            radioColorCell3.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            int i7 = Theme.key_radioBackground;
            int color = Theme.getColor(i7);
            int i8 = Theme.key_dialogRadioBackgroundChecked;
            radioColorCell3.setCheckColor(color, Theme.getColor(i8));
            radioColorCell3.setTextAndValue(LocaleController.getString(R.string.MicrophoneForVoiceMessagesBuiltIn), true ^ SharedConfig.recordViaSco);
            int i9 = Theme.key_listSelector;
            radioColorCell3.setBackground(Theme.createSelectorDrawable(Theme.getColor(i9), 2));
            linearLayout3.addView(radioColorCell3);
            radioColorCell3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ThemeActivity.m4679$r8$lambda$o88CKzHyrJdHWq83ol_Gg0RIn4(this.f$0, atomicReference3, view2);
                }
            });
            RadioColorCell radioColorCell4 = new RadioColorCell(themeActivity.getParentActivity());
            radioColorCell4.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            radioColorCell4.setCheckColor(Theme.getColor(i7), Theme.getColor(i8));
            radioColorCell4.setTextAndText2AndValue(LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoIfConnected), LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoHint), SharedConfig.recordViaSco);
            radioColorCell4.setBackground(Theme.createSelectorDrawable(Theme.getColor(i9), 2));
            linearLayout3.addView(radioColorCell4);
            radioColorCell4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ThemeActivity.$r8$lambda$FWhgCi96jq8uq11LzrLgie2oeG8(this.f$0, atomicReference3, view2);
                }
            });
            AlertDialog alertDialogCreate3 = new AlertDialog.Builder(themeActivity.getParentActivity()).setTitle(LocaleController.getString(R.string.MicrophoneForVoiceMessages)).setView(linearLayout3).setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null).create();
            atomicReference3.set(alertDialogCreate3);
            themeActivity.showDialog(alertDialogCreate3);
            return;
        }
        if (i == themeActivity.directShareRow) {
            SharedConfig.toggleDirectShare();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(SharedConfig.directShare);
                return;
            }
            return;
        }
        if (i == themeActivity.sensitiveContentRow) {
            if (!themeActivity.getMessagesController().showSensitiveContent()) {
                final Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        ThemeActivity.$r8$lambda$kD9VW2rfjJl2Qo30sP0SLPf0LzM(this.f$0, view);
                    }
                };
                themeActivity.showDialog(new AlertDialog.Builder(context, themeActivity.resourceProvider).setTitle(LocaleController.getString(R.string.ConfirmSensitiveContentTitle)).setMessage(LocaleController.getString(R.string.ConfirmSensitiveContentText)).setPositiveButton(LocaleController.getString(R.string.Confirm), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i10) {
                        ThemeActivity themeActivity2 = this.f$0;
                        ThemeActivity.verifyAge(themeActivity2.getContext(), themeActivity2.currentAccount, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                ThemeActivity.m4674$r8$lambda$F5FZy6So8EmIHL3PewrVJsS0(themeActivity2, runnable, (Boolean) obj);
                            }
                        }, themeActivity2.getResourceProvider());
                    }
                }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create());
                return;
            } else {
                themeActivity.getMessagesController().setContentSettings(false);
                if (view instanceof TextCheckCell) {
                    ((TextCheckCell) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            }
        }
        if (i == themeActivity.contactsReimportRow) {
            return;
        }
        if (i == themeActivity.contactsSortRow) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(themeActivity.getParentActivity());
            builder.setTitle(LocaleController.getString("SortBy", R.string.SortBy));
            builder.setItems(new CharSequence[]{LocaleController.getString("Default", R.string.Default), LocaleController.getString("SortFirstName", R.string.SortFirstName), LocaleController.getString("SortLastName", R.string.SortLastName)}, new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    ThemeActivity.$r8$lambda$7p4ys0LQEjjF2kr4dYXi6gFz9Cg(this.f$0, i, dialogInterface, i10);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            themeActivity.showDialog(builder.create());
            return;
        }
        if (i == themeActivity.chatBlurRow) {
            SharedConfig.toggleChatBlur();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(SharedConfig.chatBlurEnabled());
                return;
            }
            return;
        }
        if (i == themeActivity.nightThemeRow) {
            if ((LocaleController.isRTL && f <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) view;
                if (Theme.selectedAutoNightType == 0) {
                    Theme.selectedAutoNightType = 2;
                    notificationsCheckCell.setChecked(true);
                } else {
                    Theme.selectedAutoNightType = 0;
                    notificationsCheckCell.setChecked(false);
                }
                Theme.saveAutoNightThemeConfig();
                Theme.checkAutoNightThemeConditions(true);
                boolean z5 = Theme.selectedAutoNightType != 0;
                String currentNightThemeName = z5 ? Theme.getCurrentNightThemeName() : LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                if (z5) {
                    int i10 = Theme.selectedAutoNightType;
                    if (i10 == 1) {
                        string = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                    } else if (i10 == 3) {
                        string = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                    } else {
                        string = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                    }
                    currentNightThemeName = string + " " + currentNightThemeName;
                }
                notificationsCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), currentNightThemeName, R.drawable.menu_night_mode_24, z5, 0, false, true);
                return;
            }
            themeActivity.presentFragment(new ThemeActivity(1));
            return;
        }
        if (i == themeActivity.browserRow) {
            if ((LocaleController.isRTL && f <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                themeActivity.getMessagesController().toggleWebBrowserInAppEnabled();
                ((NotificationsCheckCell) view).setChecked(themeActivity.getMessagesController().isWebBrowserInAppEnabled());
                return;
            } else {
                themeActivity.presentFragment(new WebBrowserSettings(null));
                return;
            }
        }
        if (i == themeActivity.nightDisabledRow) {
            if (Theme.selectedAutoNightType == 0) {
                return;
            }
            Theme.selectedAutoNightType = 0;
            themeActivity.updateRows(true);
            Theme.checkAutoNightThemeConditions();
            return;
        }
        if (i == themeActivity.nightScheduledRow) {
            if (Theme.selectedAutoNightType == 1) {
                return;
            }
            Theme.selectedAutoNightType = 1;
            if (Theme.autoNightScheduleByLocation) {
                themeActivity.updateSunTime(null, true);
            }
            themeActivity.updateRows(true);
            Theme.checkAutoNightThemeConditions();
            return;
        }
        if (i == themeActivity.nightAutomaticRow) {
            if (Theme.selectedAutoNightType == 2) {
                return;
            }
            Theme.selectedAutoNightType = 2;
            themeActivity.updateRows(true);
            Theme.checkAutoNightThemeConditions();
            return;
        }
        if (i == themeActivity.nightSystemDefaultRow) {
            if (Theme.selectedAutoNightType == 3) {
                return;
            }
            Theme.selectedAutoNightType = 3;
            themeActivity.updateRows(true);
            Theme.checkAutoNightThemeConditions();
            return;
        }
        if (i == themeActivity.scheduleLocationRow) {
            boolean z6 = !Theme.autoNightScheduleByLocation;
            Theme.autoNightScheduleByLocation = z6;
            ((TextCheckCell) view).setChecked(z6);
            themeActivity.updateRows(true);
            if (Theme.autoNightScheduleByLocation) {
                themeActivity.updateSunTime(null, true);
            }
            Theme.checkAutoNightThemeConditions();
            return;
        }
        if (i == themeActivity.scheduleFromRow || i == themeActivity.scheduleToRow) {
            if (themeActivity.getParentActivity() == null) {
                return;
            }
            if (i == themeActivity.scheduleFromRow) {
                i2 = Theme.autoNightDayStartTime;
                i3 = i2 / 60;
            } else {
                i2 = Theme.autoNightDayEndTime;
                i3 = i2 / 60;
            }
            int i11 = i2 - (i3 * 60);
            final TextSettingsCell textSettingsCell = (TextSettingsCell) view;
            themeActivity.showDialog(new TimePickerDialog(themeActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                @Override
                public final void onTimeSet(TimePicker timePicker, int i12, int i13) {
                    ThemeActivity.$r8$lambda$u4JLZmB1MeecpwR6Z9YPtmo6mYk(this.f$0, i, textSettingsCell, timePicker, i12, i13);
                }
            }, i3, i11, true));
            return;
        }
        if (i == themeActivity.scheduleUpdateLocationRow) {
            themeActivity.updateSunTime(null, true);
            return;
        }
        if (i == themeActivity.createNewThemeRow) {
            themeActivity.createNewTheme();
            return;
        }
        if (i == themeActivity.editThemeRow) {
            themeActivity.editTheme();
        } else if (i == themeActivity.stickersRow) {
            themeActivity.presentFragment(new StickersActivity(0, null));
        } else if (i == themeActivity.liteModeRow) {
            themeActivity.presentFragment(new LiteModeSettingsActivity());
        }
    }

    public static void m4683$r8$lambda$vBy7czrF7UI6WXFqTpHTwgqqvM(ThemeActivity themeActivity, int i, AtomicReference atomicReference, View view) {
        themeActivity.getClass();
        SharedConfig.setDistanceSystemType(i);
        themeActivity.updateDistance = true;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = themeActivity.listView.findViewHolderForAdapterPosition(themeActivity.distanceRow);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            themeActivity.listAdapter.onBindViewHolder(viewHolderFindViewHolderForAdapterPosition, themeActivity.distanceRow);
        }
        ((Dialog) atomicReference.get()).dismiss();
    }

    public static void $r8$lambda$Sw6vFYI4tjSxxmGeJ9K8laTsc5I(ThemeActivity themeActivity, int i, AtomicReference atomicReference, View view) {
        themeActivity.getClass();
        SharedConfig.setSearchEngineType(i);
        themeActivity.updateSearchEngine = true;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = themeActivity.listView.findViewHolderForAdapterPosition(themeActivity.searchEngineRow);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            themeActivity.listAdapter.onBindViewHolder(viewHolderFindViewHolderForAdapterPosition, themeActivity.searchEngineRow);
        }
        ((Dialog) atomicReference.get()).dismiss();
    }

    public static void m4679$r8$lambda$o88CKzHyrJdHWq83ol_Gg0RIn4(ThemeActivity themeActivity, AtomicReference atomicReference, View view) {
        themeActivity.getClass();
        SharedConfig.recordViaSco = false;
        SharedConfig.saveConfig();
        themeActivity.updateRecordViaSco = true;
        ((Dialog) atomicReference.get()).dismiss();
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = themeActivity.listView.findViewHolderForAdapterPosition(themeActivity.bluetoothScoRow);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            themeActivity.listAdapter.onBindViewHolder(viewHolderFindViewHolderForAdapterPosition, themeActivity.bluetoothScoRow);
        }
    }

    public static void $r8$lambda$FWhgCi96jq8uq11LzrLgie2oeG8(final ThemeActivity themeActivity, final AtomicReference atomicReference, View view) {
        themeActivity.getClass();
        PermissionRequest.ensurePermission(R.raw.permission_request_microphone, R.string.PermissionNoBluetoothWithHint, "android.permission.BLUETOOTH_CONNECT", new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ThemeActivity.$r8$lambda$4M7U5cyuogjKajDRHTjQWkRhick(this.f$0, atomicReference, (Boolean) obj);
            }
        });
        SharedConfig.recordViaSco = true;
        SharedConfig.saveConfig();
        themeActivity.updateRecordViaSco = true;
        ((Dialog) atomicReference.get()).dismiss();
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = themeActivity.listView.findViewHolderForAdapterPosition(themeActivity.bluetoothScoRow);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            themeActivity.listAdapter.onBindViewHolder(viewHolderFindViewHolderForAdapterPosition, themeActivity.bluetoothScoRow);
        }
    }

    public static void $r8$lambda$4M7U5cyuogjKajDRHTjQWkRhick(ThemeActivity themeActivity, AtomicReference atomicReference, Boolean bool) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        themeActivity.getClass();
        if (bool.booleanValue()) {
            return;
        }
        SharedConfig.recordViaSco = false;
        SharedConfig.saveConfig();
        themeActivity.updateRecordViaSco = true;
        ((Dialog) atomicReference.get()).dismiss();
        RecyclerListView recyclerListView = themeActivity.listView;
        if (recyclerListView == null || !recyclerListView.isAttachedToWindow() || (viewHolderFindViewHolderForAdapterPosition = themeActivity.listView.findViewHolderForAdapterPosition(themeActivity.bluetoothScoRow)) == null) {
            return;
        }
        themeActivity.listAdapter.onBindViewHolder(viewHolderFindViewHolderForAdapterPosition, themeActivity.bluetoothScoRow);
    }

    public static void $r8$lambda$kD9VW2rfjJl2Qo30sP0SLPf0LzM(ThemeActivity themeActivity, View view) {
        themeActivity.getMessagesController().setContentSettings(true);
        if (view instanceof TextCheckCell) {
            ((TextCheckCell) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
        }
    }

    public static void m4674$r8$lambda$F5FZy6So8EmIHL3PewrVJsS0(ThemeActivity themeActivity, Runnable runnable, Boolean bool) {
        themeActivity.getClass();
        if (bool.booleanValue()) {
            runnable.run();
        } else {
            BulletinFactory.of(themeActivity).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText)).show();
        }
    }

    public static void $r8$lambda$7p4ys0LQEjjF2kr4dYXi6gFz9Cg(ThemeActivity themeActivity, int i, DialogInterface dialogInterface, int i2) {
        themeActivity.getClass();
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putInt("sortContactsBy", i2);
        editorEdit.commit();
        ListAdapter listAdapter = themeActivity.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyItemChanged(i);
        }
    }

    public static void $r8$lambda$u4JLZmB1MeecpwR6Z9YPtmo6mYk(ThemeActivity themeActivity, int i, TextSettingsCell textSettingsCell, TimePicker timePicker, int i2, int i3) {
        int i4 = (i2 * 60) + i3;
        if (i == themeActivity.scheduleFromRow) {
            Theme.autoNightDayStartTime = i4;
            textSettingsCell.setTextAndValue(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i3)), true);
        } else {
            Theme.autoNightDayEndTime = i4;
            textSettingsCell.setTextAndValue(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i3)), true);
        }
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    public void editTheme() {
        Theme.ThemeInfo currentTheme = Theme.getCurrentTheme();
        presentFragment(new ThemePreviewActivity(currentTheme, false, 1, currentTheme.getAccent(false).id >= 100, this.currentType == 1));
    }

    public void createNewTheme() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString("NewTheme", R.string.NewTheme));
        builder.setMessage(LocaleController.getString("CreateNewThemeAlert", R.string.CreateNewThemeAlert));
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString("CreateTheme", R.string.CreateTheme), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                ThemeActivity.m4685$r8$lambda$zw9LyNQJjGMm0eyR_387UkgXP8(this.f$0, alertDialog, i);
            }
        });
        showDialog(builder.create());
    }

    public static void m4685$r8$lambda$zw9LyNQJjGMm0eyR_387UkgXP8(ThemeActivity themeActivity, AlertDialog alertDialog, int i) {
        themeActivity.getClass();
        AlertsCreator.createThemeCreateDialog(themeActivity, 0, null, null);
    }

    @Override
    public void onResume() {
        super.onResume();
        if (this.listAdapter != null) {
            updateRows(true);
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        }
    }

    public static void verifyAge(final Context context, final int i, final Utilities.Callback callback, final Theme.ResourcesProvider resourcesProvider) {
        final MessagesController messagesController = MessagesController.getInstance(i);
        final String str = messagesController.verifyAgeBotUsername;
        String str2 = messagesController.verifyAgeCountry;
        final int i2 = messagesController.verifyAgeMin;
        if (TextUtils.isEmpty(str) || !messagesController.config.needAgeVideoVerification.get()) {
            callback.run(Boolean.TRUE);
            return;
        }
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        builder.setCustomView(linearLayout);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.filled_verify_age);
        frameLayout.addView(imageView, LayoutHelper.createFrame(50, 50, 17));
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(80, 80, 1, 0, 20, 0, 8));
        int i3 = Theme.key_dialogTextBlack;
        TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, i3, true, resourcesProvider);
        textViewMakeTextView.setText(LocaleController.getString(R.string.AgeVerificationTitle));
        textViewMakeTextView.setGravity(17);
        linearLayout.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 7, 24, 8, 24, 8));
        TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, i3, false, resourcesProvider);
        textViewMakeTextView2.setText(AndroidUtilities.replaceTags(LocaleController.getString("AgeVerificationText" + str2)));
        textViewMakeTextView2.setGravity(17);
        linearLayout.addView(textViewMakeTextView2, LayoutHelper.createLinear(-1, -2, 7, 24, 0, 24, 0));
        final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        buttonWithCounterView.setText(LocaleController.getString(R.string.AgeVerificationButton), false);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ThemeActivity.m4682$r8$lambda$uozHzELxr3wVaxAYbSzijnvu_w(buttonWithCounterView, messagesController, str, i, context, resourcesProvider, i2, callback, bottomSheetArr, view);
            }
        });
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 7, 2, 29, 2, 14));
        BottomSheet bottomSheetShow = builder.show();
        final BottomSheet[] bottomSheetArr = {bottomSheetShow};
        bottomSheetShow.fixNavigationBar();
    }

    public static void m4682$r8$lambda$uozHzELxr3wVaxAYbSzijnvu_w(final ButtonWithCounterView buttonWithCounterView, final MessagesController messagesController, final String str, final int i, final Context context, final Theme.ResourcesProvider resourcesProvider, final int i2, final Utilities.Callback callback, final BottomSheet[] bottomSheetArr, View view) {
        if (buttonWithCounterView.isLoading()) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        PermissionRequest.ensurePermission(R.raw.permission_request_camera, R.string.AgeVerificationNeedCameraPermission, "android.permission.CAMERA", new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ThemeActivity.m4677$r8$lambda$XlJxHor5V0Uy8jknfANjs6yLaU(buttonWithCounterView, messagesController, str, i, context, resourcesProvider, i2, callback, bottomSheetArr, (Boolean) obj);
            }
        });
    }

    public static void m4677$r8$lambda$XlJxHor5V0Uy8jknfANjs6yLaU(final ButtonWithCounterView buttonWithCounterView, final MessagesController messagesController, String str, final int i, final Context context, final Theme.ResourcesProvider resourcesProvider, final int i2, final Utilities.Callback callback, final BottomSheet[] bottomSheetArr, Boolean bool) {
        if (!bool.booleanValue()) {
            buttonWithCounterView.setLoading(false);
        } else {
            messagesController.getUserNameResolver().resolve(str, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    ThemeActivity.$r8$lambda$CbtDnHAhwyxtHOEorJstUdRwPBo(buttonWithCounterView, messagesController, i, context, resourcesProvider, i2, callback, bottomSheetArr, (Long) obj);
                }
            });
        }
    }

    public static void $r8$lambda$CbtDnHAhwyxtHOEorJstUdRwPBo(ButtonWithCounterView buttonWithCounterView, MessagesController messagesController, int i, Context context, Theme.ResourcesProvider resourcesProvider, final int i2, final Utilities.Callback callback, BottomSheet[] bottomSheetArr, Long l) {
        if (l == null) {
            buttonWithCounterView.setLoading(false);
            return;
        }
        TLRPC.User user = messagesController.getUser(l);
        if (user == null) {
            buttonWithCounterView.setLoading(false);
            return;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            buttonWithCounterView.setLoading(false);
            return;
        }
        WebViewRequestProps webViewRequestPropsOf = WebViewRequestProps.of(i, l.longValue(), l.longValue(), null, null, 4, 0, 0L, false, null, false, null, user, 0, false, false);
        final BotWebViewSheet botWebViewSheet = new BotWebViewSheet(context, resourcesProvider);
        botWebViewSheet.setOnVerifiedAge(new Utilities.Callback4() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                ThemeActivity.m4676$r8$lambda$RDYnJnFitcwfnyCjEBWrLOKAqw(i2, botWebViewSheet, callback, (Boolean) obj, (Double) obj2, (String) obj3, (Double) obj4);
            }
        });
        botWebViewSheet.setDefaultFullsize(true);
        botWebViewSheet.setNeedsContext(false);
        botWebViewSheet.setParentActivity(safeLastFragment.getParentActivity());
        botWebViewSheet.requestWebView(safeLastFragment, webViewRequestPropsOf);
        botWebViewSheet.show();
        buttonWithCounterView.setLoading(false);
        bottomSheetArr[0].dismiss();
    }

    public static void m4676$r8$lambda$RDYnJnFitcwfnyCjEBWrLOKAqw(int i, BotWebViewSheet botWebViewSheet, Utilities.Callback callback, Boolean bool, Double d, String str, Double d2) {
        boolean zBooleanValue;
        if (d != null) {
            zBooleanValue = d.doubleValue() >= ((double) i);
        } else {
            zBooleanValue = bool.booleanValue();
        }
        botWebViewSheet.dismiss();
        callback.run(Boolean.valueOf(zBooleanValue));
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (!zBooleanValue || safeLastFragment == null) {
            return;
        }
        BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.AgeVerificationPassedTitle)).show();
    }

    private void updateMenuItem() {
        Theme.OverrideWallpaperInfo overrideWallpaperInfo;
        if (this.menuItem == null) {
            return;
        }
        Theme.ThemeInfo currentTheme = Theme.getCurrentTheme();
        Theme.ThemeAccent accent = currentTheme.getAccent(false);
        ArrayList arrayList = currentTheme.themeAccents;
        if (arrayList != null && !arrayList.isEmpty() && accent != null && accent.id >= 100) {
            this.menuItem.showSubItem(2);
            this.menuItem.showSubItem(3);
        } else {
            this.menuItem.hideSubItem(2);
            this.menuItem.hideSubItem(3);
        }
        int i = AndroidUtilities.isTablet() ? 18 : 16;
        Theme.ThemeInfo currentTheme2 = Theme.getCurrentTheme();
        if (SharedConfig.fontSize != i || SharedConfig.bubbleRadius != 17 || !currentTheme2.firstAccentIsDefault || currentTheme2.currentAccentId != Theme.DEFALT_THEME_ACCENT_ID || (accent != null && (overrideWallpaperInfo = accent.overrideWallpaper) != null && !"d".equals(overrideWallpaperInfo.slug))) {
            this.menuItem.showSubItem(4);
        } else {
            this.menuItem.hideSubItem(4);
        }
    }

    public void updateSunTime(Location location, boolean z) {
        Activity parentActivity;
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        if (getParentActivity() != null) {
            if (!getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
                return;
            }
            try {
                if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                    builder.setTopAnimation(R.raw.permission_request_location, 72, false, Theme.getColor(Theme.key_dialogTopBackground));
                    builder.setMessage(LocaleController.getString("GpsDisabledAlertText", R.string.GpsDisabledAlertText));
                    builder.setPositiveButton(LocaleController.getString("ConnectingToProxyEnable", R.string.ConnectingToProxyEnable), new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i) {
                            ThemeActivity.$r8$lambda$hAioia46sT_dm2_U0Rp825WYduw(this.f$0, alertDialog, i);
                        }
                    });
                    builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                    showDialog(builder.create());
                    return;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        try {
            location = locationManager.getLastKnownLocation("gps");
            if (location == null) {
                location = locationManager.getLastKnownLocation("network");
            }
            if (location == null) {
                location = locationManager.getLastKnownLocation("passive");
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        if (location == null || z) {
            startLocationUpdate();
            if (location == null) {
                return;
            }
        }
        Theme.autoNightLocationLatitude = location.getLatitude();
        Theme.autoNightLocationLongitude = location.getLongitude();
        int[] iArrCalculateSunriseSunset = SunDate.calculateSunriseSunset(Theme.autoNightLocationLatitude, Theme.autoNightLocationLongitude);
        Theme.autoNightSunriseTime = iArrCalculateSunriseSunset[0];
        Theme.autoNightSunsetTime = iArrCalculateSunriseSunset[1];
        Theme.autoNightCityName = null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        Theme.autoNightLastSunCheckDay = calendar.get(5);
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ThemeActivity.$r8$lambda$tK3zKxFuObHbNgcksbrnWLUI6CA(this.f$0);
            }
        });
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findViewHolderForAdapterPosition(this.scheduleLocationInfoRow);
        if (holder != null) {
            View view = holder.itemView;
            if (view instanceof TextInfoPrivacyCell) {
                ((TextInfoPrivacyCell) view).setText(getLocationSunString());
            }
        }
        if (Theme.autoNightScheduleByLocation && Theme.selectedAutoNightType == 1) {
            Theme.checkAutoNightThemeConditions();
        }
    }

    public static void $r8$lambda$hAioia46sT_dm2_U0Rp825WYduw(ThemeActivity themeActivity, AlertDialog alertDialog, int i) {
        if (themeActivity.getParentActivity() == null) {
            return;
        }
        try {
            themeActivity.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } catch (Exception unused) {
        }
    }

    public static void $r8$lambda$tK3zKxFuObHbNgcksbrnWLUI6CA(final ThemeActivity themeActivity) {
        final String locality;
        themeActivity.getClass();
        try {
            List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, Locale.getDefault()).getFromLocation(Theme.autoNightLocationLatitude, Theme.autoNightLocationLongitude, 1);
            locality = fromLocation.size() > 0 ? fromLocation.get(0).getLocality() : null;
        } catch (Exception unused) {
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ThemeActivity.m4678$r8$lambda$bvzBk_XlcvyXki6qKoYqWj7WE(this.f$0, locality);
            }
        });
    }

    public static void m4678$r8$lambda$bvzBk_XlcvyXki6qKoYqWj7WE(ThemeActivity themeActivity, String str) {
        RecyclerListView.Holder holder;
        themeActivity.getClass();
        Theme.autoNightCityName = str;
        if (str == null) {
            Theme.autoNightCityName = String.format("(%.06f, %.06f)", Double.valueOf(Theme.autoNightLocationLatitude), Double.valueOf(Theme.autoNightLocationLongitude));
        }
        Theme.saveAutoNightThemeConfig();
        RecyclerListView recyclerListView = themeActivity.listView;
        if (recyclerListView == null || (holder = (RecyclerListView.Holder) recyclerListView.findViewHolderForAdapterPosition(themeActivity.scheduleUpdateLocationRow)) == null) {
            return;
        }
        View view = holder.itemView;
        if (view instanceof TextSettingsCell) {
            ((TextSettingsCell) view).setTextAndValue(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), Theme.autoNightCityName, false);
        }
    }

    private void startLocationUpdate() {
        if (this.updatingLocation) {
            return;
        }
        this.updatingLocation = true;
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        try {
            locationManager.requestLocationUpdates("gps", 1L, 0.0f, this.gpsLocationListener);
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            locationManager.requestLocationUpdates("network", 1L, 0.0f, this.networkLocationListener);
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public void stopLocationUpdate() {
        this.updatingLocation = false;
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        locationManager.removeUpdates(this.gpsLocationListener);
        locationManager.removeUpdates(this.networkLocationListener);
    }

    public String getLocationSunString() {
        int i = Theme.autoNightSunriseTime;
        int i2 = i / 60;
        String str = String.format("%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i - (i2 * 60)));
        int i3 = Theme.autoNightSunsetTime;
        int i4 = i3 / 60;
        return LocaleController.formatString("AutoNightUpdateLocationInfo", R.string.AutoNightUpdateLocationInfo, String.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3 - (i4 * 60))), str);
    }

    static class InnerAccentView extends View {
        private ObjectAnimator checkAnimator;
        private boolean checked;
        private float checkedState;
        private Theme.ThemeAccent currentAccent;
        private Theme.ThemeInfo currentTheme;
        private final Paint paint;

        InnerAccentView(Context context) {
            super(context);
            this.paint = new Paint(1);
        }

        void setThemeAndColor(Theme.ThemeInfo themeInfo, Theme.ThemeAccent themeAccent) {
            this.currentTheme = themeInfo;
            this.currentAccent = themeAccent;
            updateCheckedState(false);
        }

        void updateCheckedState(boolean z) {
            this.checked = this.currentTheme.currentAccentId == this.currentAccent.id;
            ObjectAnimator objectAnimator = this.checkAnimator;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "checkedState", this.checked ? 1.0f : 0.0f);
                this.checkAnimator = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(200L);
                this.checkAnimator.start();
                return;
            }
            setCheckedState(this.checked ? 1.0f : 0.0f);
        }

        public void setCheckedState(float f) {
            this.checkedState = f;
            invalidate();
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateCheckedState(false);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            float fDp = AndroidUtilities.dp(20.0f);
            float measuredWidth = getMeasuredWidth() * 0.5f;
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.paint.setColor(this.currentAccent.accentColor);
            this.paint.setStyle(Paint.Style.STROKE);
            this.paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            this.paint.setAlpha(Math.round(this.checkedState * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, fDp - (this.paint.getStrokeWidth() * 0.5f), this.paint);
            this.paint.setAlpha(255);
            this.paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, fDp - (AndroidUtilities.dp(5.0f) * this.checkedState), this.paint);
            if (this.checkedState != 0.0f) {
                this.paint.setColor(-1);
                this.paint.setAlpha(Math.round(this.checkedState * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(2.0f), this.paint);
                canvas.drawCircle(measuredWidth - (AndroidUtilities.dp(7.0f) * this.checkedState), measuredHeight, AndroidUtilities.dp(2.0f), this.paint);
                canvas.drawCircle((AndroidUtilities.dp(7.0f) * this.checkedState) + measuredWidth, measuredHeight, AndroidUtilities.dp(2.0f), this.paint);
            }
            int i = this.currentAccent.myMessagesAccentColor;
            if (i == 0 || this.checkedState == 1.0f) {
                return;
            }
            this.paint.setColor(i);
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(8.0f) * (1.0f - this.checkedState), this.paint);
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(LocaleController.getString("ColorPickerMainColor", R.string.ColorPickerMainColor));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.checked);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }
    }

    private static class InnerCustomAccentView extends View {
        private int[] colors;
        private final Paint paint;

        InnerCustomAccentView(Context context) {
            super(context);
            this.paint = new Paint(1);
            this.colors = new int[7];
        }

        public void setTheme(Theme.ThemeInfo themeInfo) {
            if (themeInfo.defaultAccentCount >= 8) {
                this.colors = new int[]{themeInfo.getAccentColor(6), themeInfo.getAccentColor(4), themeInfo.getAccentColor(7), themeInfo.getAccentColor(2), themeInfo.getAccentColor(0), themeInfo.getAccentColor(5), themeInfo.getAccentColor(3)};
            } else {
                this.colors = new int[7];
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            float measuredWidth = getMeasuredWidth() * 0.5f;
            float measuredHeight = getMeasuredHeight() * 0.5f;
            float fDp = AndroidUtilities.dp(5.0f);
            float fDp2 = AndroidUtilities.dp(20.0f) - fDp;
            this.paint.setStyle(Paint.Style.FILL);
            int i = 0;
            this.paint.setColor(this.colors[0]);
            canvas.drawCircle(measuredWidth, measuredHeight, fDp, this.paint);
            double d = 0.0d;
            while (i < 6) {
                float fSin = (((float) Math.sin(d)) * fDp2) + measuredWidth;
                float fCos = measuredHeight - (((float) Math.cos(d)) * fDp2);
                i++;
                this.paint.setColor(this.colors[i]);
                canvas.drawCircle(fSin, fCos, fDp, this.paint);
                d += 1.0471975511965976d;
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(LocaleController.getString("ColorPickerMainColor", R.string.ColorPickerMainColor));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setEnabled(true);
        }
    }

    class ThemeAccentsListAdapter extends RecyclerListView.SelectionAdapter {
        private Theme.ThemeInfo currentTheme;
        private Context mContext;
        private ArrayList themeAccents;

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        ThemeAccentsListAdapter(Context context) {
            this.mContext = context;
            notifyDataSetChanged();
        }

        @Override
        public void notifyDataSetChanged() {
            this.currentTheme = ThemeActivity.this.currentType == 1 ? Theme.getCurrentNightTheme() : Theme.getCurrentTheme();
            this.themeAccents = new ArrayList(this.currentTheme.themeAccents);
            super.notifyDataSetChanged();
        }

        @Override
        public int getItemViewType(int i) {
            return i == getItemCount() - 1 ? 1 : 0;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return new RecyclerListView.Holder(new InnerAccentView(this.mContext));
            }
            return new RecyclerListView.Holder(new InnerCustomAccentView(this.mContext));
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                ((InnerAccentView) viewHolder.itemView).setThemeAndColor(this.currentTheme, (Theme.ThemeAccent) this.themeAccents.get(i));
            } else {
                if (itemViewType != 1) {
                    return;
                }
                ((InnerCustomAccentView) viewHolder.itemView).setTheme(this.currentTheme);
            }
        }

        @Override
        public int getItemCount() {
            if (this.themeAccents.isEmpty()) {
                return 0;
            }
            return this.themeAccents.size() + 1;
        }

        public int findCurrentAccent() {
            return this.themeAccents.indexOf(this.currentTheme.getAccent(false));
        }
    }

    class ListAdapter extends RecyclerListView.SelectionAdapter {
        private boolean first = true;
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            return ThemeActivity.this.rowCount;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 0 || itemViewType == 1 || itemViewType == 4 || itemViewType == 7 || itemViewType == 10 || itemViewType == 11 || itemViewType == 12 || itemViewType == 14 || itemViewType == 18 || itemViewType == 20 || itemViewType == 21;
        }

        public void showOptionsForTheme(final Theme.ThemeInfo themeInfo) {
            int[] iArr;
            CharSequence[] charSequenceArr;
            if (ThemeActivity.this.getParentActivity() != null) {
                if ((themeInfo.info == null || themeInfo.themeLoaded) && ThemeActivity.this.currentType != 1) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(ThemeActivity.this.getParentActivity());
                    boolean z = false;
                    if (themeInfo.pathToFile == null) {
                        charSequenceArr = new CharSequence[]{null, LocaleController.getString("ExportTheme", R.string.ExportTheme)};
                        iArr = new int[]{0, R.drawable.msg_shareout};
                    } else {
                        TLRPC.TL_theme tL_theme = themeInfo.info;
                        boolean z2 = tL_theme == null || !tL_theme.isDefault;
                        String string = LocaleController.getString("ShareFile", R.string.ShareFile);
                        String string2 = LocaleController.getString("ExportTheme", R.string.ExportTheme);
                        TLRPC.TL_theme tL_theme2 = themeInfo.info;
                        String string3 = (tL_theme2 == null || (!tL_theme2.isDefault && tL_theme2.creator)) ? LocaleController.getString("Edit", R.string.Edit) : null;
                        TLRPC.TL_theme tL_theme3 = themeInfo.info;
                        CharSequence[] charSequenceArr2 = {string, string2, string3, (tL_theme3 == null || !tL_theme3.creator) ? null : LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl), z2 ? LocaleController.getString("Delete", R.string.Delete) : null};
                        z = z2;
                        iArr = new int[]{R.drawable.msg_share, R.drawable.msg_shareout, R.drawable.msg_edit, R.drawable.msg_link, R.drawable.msg_delete};
                        charSequenceArr = charSequenceArr2;
                    }
                    builder.setItems(charSequenceArr, iArr, new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i) throws Throwable {
                            ThemeActivity.ListAdapter.$r8$lambda$zTgYDzbKt8ihxZ2T2Mo8jbwEmD8(this.f$0, themeInfo, dialogInterface, i);
                        }
                    });
                    AlertDialog alertDialogCreate = builder.create();
                    ThemeActivity.this.showDialog(alertDialogCreate);
                    if (z) {
                        alertDialogCreate.setItemColor(alertDialogCreate.getItemsCount() - 1, Theme.getColor(Theme.key_text_RedBold), Theme.getColor(Theme.key_text_RedRegular));
                    }
                }
            }
        }

        public static void $r8$lambda$zTgYDzbKt8ihxZ2T2Mo8jbwEmD8(final ListAdapter listAdapter, final Theme.ThemeInfo themeInfo, DialogInterface dialogInterface, int i) throws Throwable {
            File assetFile;
            Throwable th;
            ?? r3;
            String str;
            File file;
            Intent intent;
            Exception exc;
            if (ThemeActivity.this.getParentActivity() == null) {
                return;
            }
            ?? r2 = 0;
            r2 = 0;
            r2 = 0;
            r2 = 0;
            ?? r4 = 0;
            r2 = 0;
            if (i == 0) {
                if (themeInfo.info == null) {
                    ThemeActivity.this.getMessagesController().saveThemeToServer(themeInfo, null);
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.needShareTheme, themeInfo, null);
                    return;
                }
                String str2 = "https://" + ThemeActivity.this.getMessagesController().linkPrefix + "/addtheme/" + themeInfo.info.slug;
                ThemeActivity.this.showDialog(new ShareAlert(ThemeActivity.this.getParentActivity(), null, str2, false, str2, false));
                return;
            }
            if (i != 1) {
                if (i == 2) {
                    if (((BaseFragment) ThemeActivity.this).parentLayout != null) {
                        Theme.applyTheme(themeInfo);
                        ((BaseFragment) ThemeActivity.this).parentLayout.rebuildAllFragmentViews(true, true);
                        new ThemeEditorView().show(ThemeActivity.this.getParentActivity(), themeInfo);
                        return;
                    }
                    return;
                }
                if (i == 3) {
                    ThemeActivity.this.presentFragment(new ThemeSetUrlActivity(themeInfo, null, false));
                    return;
                }
                if (ThemeActivity.this.getParentActivity() == null) {
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(ThemeActivity.this.getParentActivity());
                builder.setTitle(LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle));
                builder.setMessage(LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert));
                builder.setPositiveButton(LocaleController.getString("Delete", R.string.Delete), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        ThemeActivity.ListAdapter.m4687$r8$lambda$6Aryyeh6g9qSqvSjJ71n_XgnhY(this.f$0, themeInfo, alertDialog, i2);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                AlertDialog alertDialogCreate = builder.create();
                ThemeActivity.this.showDialog(alertDialogCreate);
                TextView textView = (TextView) alertDialogCreate.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                    return;
                }
                return;
            }
            if (themeInfo.pathToFile == null && themeInfo.assetName == null) {
                StringBuilder sb = new StringBuilder();
                int[] defaultColors = Theme.getDefaultColors();
                for (int i2 = 0; i2 < defaultColors.length; i2++) {
                    sb.append(ThemeColors.getStringName(i2));
                    sb.append("=");
                    sb.append(defaultColors[i2]);
                    sb.append("\n");
                }
                assetFile = new File(ApplicationLoader.getFilesDirFixed(), "default_theme.attheme");
                try {
                    try {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(assetFile);
                            try {
                                fileOutputStream.write(AndroidUtilities.getStringBytes(sb.toString()));
                                fileOutputStream.close();
                            } catch (Exception e) {
                                exc = e;
                                r2 = fileOutputStream;
                                FileLog.e(exc);
                                if (r2 != 0) {
                                    r2.close();
                                    r2 = r2;
                                }
                                str = themeInfo.name;
                                if (!str.endsWith(".attheme")) {
                                    str = str + ".attheme";
                                }
                                file = new File(FileLoader.getDirectory(4), FileLoader.fixFileName(str));
                                if (AndroidUtilities.copyFile(assetFile, file)) {
                                    intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/xml");
                                    r2 = "android.intent.extra.STREAM";
                                    if (Build.VERSION.SDK_INT >= 24) {
                                        try {
                                            intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(ThemeActivity.this.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file));
                                            intent.setFlags(1);
                                        } catch (Exception unused) {
                                            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                                        }
                                    } else {
                                        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                                    }
                                    ThemeActivity.this.startActivityForResult(Intent.createChooser(intent, LocaleController.getString("ShareFile", R.string.ShareFile)), 500);
                                    r4 = r2;
                                } else {
                                    r4 = r2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r3 = fileOutputStream;
                                if (r3 != 0) {
                                    try {
                                        r3.close();
                                        throw th;
                                    } catch (Exception e2) {
                                        FileLog.e(e2);
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            FileLog.e(e3);
                        }
                    } catch (Exception e4) {
                        exc = e4;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r3 = r4;
                }
            } else {
                String str3 = themeInfo.assetName;
                assetFile = str3 != null ? Theme.getAssetFile(str3) : new File(themeInfo.pathToFile);
            }
            str = themeInfo.name;
            if (!str.endsWith(".attheme")) {
                str = str + ".attheme";
            }
            file = new File(FileLoader.getDirectory(4), FileLoader.fixFileName(str));
            try {
                if (AndroidUtilities.copyFile(assetFile, file)) {
                    r4 = r2;
                } else {
                    intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/xml");
                    r2 = "android.intent.extra.STREAM";
                    if (Build.VERSION.SDK_INT >= 24) {
                        intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(ThemeActivity.this.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file));
                        intent.setFlags(1);
                    } else {
                        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                    }
                    ThemeActivity.this.startActivityForResult(Intent.createChooser(intent, LocaleController.getString("ShareFile", R.string.ShareFile)), 500);
                    r4 = r2;
                }
            } catch (Exception e5) {
                FileLog.e(e5);
                r4 = r2;
            }
        }

        public static void m4687$r8$lambda$6Aryyeh6g9qSqvSjJ71n_XgnhY(ListAdapter listAdapter, Theme.ThemeInfo themeInfo, AlertDialog alertDialog, int i) {
            listAdapter.getClass();
            MessagesController.getInstance(themeInfo.account).saveTheme(themeInfo, null, themeInfo == Theme.getCurrentNightTheme(), true);
            if (Theme.deleteTheme(themeInfo)) {
                ((BaseFragment) ThemeActivity.this).parentLayout.rebuildAllFragmentViews(true, true);
            }
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.themeListUpdated, new Object[0]);
        }

        public static void $r8$lambda$5kfwAA3Dj9F1C6IpsJxJmYwz8h8(ListAdapter listAdapter, ThemeAccentsListAdapter themeAccentsListAdapter, RecyclerListView recyclerListView, View view, int i) {
            Theme.ThemeInfo currentNightTheme = ThemeActivity.this.currentType == 1 ? Theme.getCurrentNightTheme() : Theme.getCurrentTheme();
            if (i != themeAccentsListAdapter.getItemCount() - 1) {
                Theme.ThemeAccent themeAccent = (Theme.ThemeAccent) themeAccentsListAdapter.themeAccents.get(i);
                if (!TextUtils.isEmpty(themeAccent.patternSlug) && themeAccent.id != Theme.DEFALT_THEME_ACCENT_ID) {
                    Theme.PatternsLoader.createLoader(false);
                }
                int i2 = currentNightTheme.currentAccentId;
                int i3 = themeAccent.id;
                if (i2 != i3) {
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.needSetDayNightTheme, currentNightTheme, Boolean.valueOf(ThemeActivity.this.currentType == 1), null, Integer.valueOf(themeAccent.id));
                    EmojiThemes.saveCustomTheme(currentNightTheme, themeAccent.id);
                    Theme.turnOffAutoNight(ThemeActivity.this);
                } else {
                    ThemeActivity themeActivity = ThemeActivity.this;
                    themeActivity.presentFragment(new ThemePreviewActivity(currentNightTheme, false, 1, i3 >= 100, themeActivity.currentType == 1));
                }
            } else {
                ThemeActivity themeActivity2 = ThemeActivity.this;
                themeActivity2.presentFragment(new ThemePreviewActivity(currentNightTheme, false, 1, false, themeActivity2.currentType == 1));
            }
            int left = view.getLeft();
            int right = view.getRight();
            int iDp = AndroidUtilities.dp(52.0f);
            int i4 = left - iDp;
            if (i4 < 0) {
                recyclerListView.smoothScrollBy(i4, 0);
            } else {
                int i5 = right + iDp;
                if (i5 > recyclerListView.getMeasuredWidth()) {
                    recyclerListView.smoothScrollBy(i5 - recyclerListView.getMeasuredWidth(), 0);
                }
            }
            int childCount = recyclerListView.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = recyclerListView.getChildAt(i6);
                if (childAt instanceof InnerAccentView) {
                    ((InnerAccentView) childAt).updateCheckedState(true);
                }
            }
        }

        public static boolean $r8$lambda$Qzk_mTDXwKbVgZaZJbIYdkx0dcQ(final ListAdapter listAdapter, final ThemeAccentsListAdapter themeAccentsListAdapter, View view, int i) {
            listAdapter.getClass();
            if (i >= 0 && i < themeAccentsListAdapter.themeAccents.size()) {
                final Theme.ThemeAccent themeAccent = (Theme.ThemeAccent) themeAccentsListAdapter.themeAccents.get(i);
                if (themeAccent.id >= 100 && !themeAccent.isDefault) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(ThemeActivity.this.getParentActivity());
                    String string = LocaleController.getString("OpenInEditor", R.string.OpenInEditor);
                    String string2 = LocaleController.getString("ShareTheme", R.string.ShareTheme);
                    TLRPC.TL_theme tL_theme = themeAccent.info;
                    builder.setItems(new CharSequence[]{string, string2, (tL_theme == null || !tL_theme.creator) ? null : LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl), LocaleController.getString("DeleteTheme", R.string.DeleteTheme)}, new int[]{R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete}, new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            ThemeActivity.ListAdapter.$r8$lambda$iGWsCvPBdd4kG_S9hXgNaYVykDs(this.f$0, themeAccent, themeAccentsListAdapter, dialogInterface, i2);
                        }
                    });
                    AlertDialog alertDialogCreate = builder.create();
                    ThemeActivity.this.showDialog(alertDialogCreate);
                    alertDialogCreate.setItemColor(alertDialogCreate.getItemsCount() - 1, Theme.getColor(Theme.key_text_RedBold), Theme.getColor(Theme.key_text_RedRegular));
                    return true;
                }
            }
            return false;
        }

        public static void $r8$lambda$iGWsCvPBdd4kG_S9hXgNaYVykDs(final ListAdapter listAdapter, final Theme.ThemeAccent themeAccent, final ThemeAccentsListAdapter themeAccentsListAdapter, DialogInterface dialogInterface, int i) {
            if (ThemeActivity.this.getParentActivity() == null) {
                return;
            }
            if (i == 0) {
                AlertsCreator.createThemeCreateDialog(ThemeActivity.this, i == 1 ? 2 : 1, themeAccent.parentTheme, themeAccent);
                return;
            }
            if (i == 1) {
                if (themeAccent.info == null) {
                    ThemeActivity.this.getMessagesController().saveThemeToServer(themeAccent.parentTheme, themeAccent);
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.needShareTheme, themeAccent.parentTheme, themeAccent);
                    return;
                }
                String str = "https://" + ThemeActivity.this.getMessagesController().linkPrefix + "/addtheme/" + themeAccent.info.slug;
                ThemeActivity.this.showDialog(new ShareAlert(ThemeActivity.this.getParentActivity(), null, str, false, str, false));
                return;
            }
            if (i == 2) {
                ThemeActivity.this.presentFragment(new ThemeSetUrlActivity(themeAccent.parentTheme, themeAccent, false));
                return;
            }
            if (i != 3 || ThemeActivity.this.getParentActivity() == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(ThemeActivity.this.getParentActivity());
            builder.setTitle(LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle));
            builder.setMessage(LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert));
            builder.setPositiveButton(LocaleController.getString("Delete", R.string.Delete), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    ThemeActivity.ListAdapter.$r8$lambda$x2HguB2hSCzJ72AbppmQD156TO4(this.f$0, themeAccentsListAdapter, themeAccent, alertDialog, i2);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            AlertDialog alertDialogCreate = builder.create();
            ThemeActivity.this.showDialog(alertDialogCreate);
            TextView textView = (TextView) alertDialogCreate.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
            }
        }

        public static void $r8$lambda$x2HguB2hSCzJ72AbppmQD156TO4(ListAdapter listAdapter, ThemeAccentsListAdapter themeAccentsListAdapter, Theme.ThemeAccent themeAccent, AlertDialog alertDialog, int i) {
            listAdapter.getClass();
            if (Theme.deleteThemeAccent(themeAccentsListAdapter.currentTheme, themeAccent, true)) {
                Theme.refreshThemeColors();
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.needSetDayNightTheme, Theme.getActiveTheme(), Boolean.valueOf(ThemeActivity.this.currentType == 1), null, -1);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View notificationsCheckCell;
            View bubbleRadiusCell;
            int i2 = 0;
            switch (i) {
                case 1:
                    notificationsCheckCell = new TextSettingsCell(this.mContext);
                    break;
                case 2:
                    notificationsCheckCell = new TextInfoPrivacyCell(this.mContext);
                    break;
                case 3:
                    notificationsCheckCell = new ShadowSectionCell(this.mContext);
                    break;
                case 4:
                    notificationsCheckCell = new ThemeTypeCell(this.mContext);
                    break;
                case 5:
                    notificationsCheckCell = new HeaderCell(this.mContext);
                    break;
                case 6:
                    notificationsCheckCell = new BrightnessControlCell(this.mContext, i2) {
                        @Override
                        protected void didChangedValue(float f) {
                            int i3 = (int) (Theme.autoNightBrighnessThreshold * 100.0f);
                            int i4 = (int) (f * 100.0f);
                            Theme.autoNightBrighnessThreshold = f;
                            if (i3 != i4) {
                                RecyclerListView.Holder holder = (RecyclerListView.Holder) ThemeActivity.this.listView.findViewHolderForAdapterPosition(ThemeActivity.this.automaticBrightnessInfoRow);
                                if (holder != null) {
                                    ((TextInfoPrivacyCell) holder.itemView).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (Theme.autoNightBrighnessThreshold * 100.0f))));
                                }
                                Theme.checkAutoNightThemeConditions(true);
                            }
                        }
                    };
                    break;
                case 7:
                    notificationsCheckCell = new TextCheckCell(this.mContext);
                    break;
                case 8:
                    notificationsCheckCell = ThemeActivity.this.new TextSizeCell(this.mContext);
                    break;
                case 9:
                    notificationsCheckCell = new ChatListCell(this.mContext) {
                        @Override
                        protected void didSelectChatType(boolean z) {
                            SharedConfig.setUseThreeLinesLayout(z);
                        }
                    };
                    break;
                case 10:
                    notificationsCheckCell = new NotificationsCheckCell(this.mContext, 21, 60, true);
                    break;
                case 11:
                    this.first = true;
                    ThemeActivity themeActivity = ThemeActivity.this;
                    Context context = this.mContext;
                    ThemeActivity themeActivity2 = ThemeActivity.this;
                    themeActivity.themesHorizontalListCell = new ThemesHorizontalListCell(context, themeActivity2, themeActivity2.currentType, ThemeActivity.this.defaultThemes, ThemeActivity.this.darkThemes) {
                        @Override
                        protected void showOptionsForTheme(Theme.ThemeInfo themeInfo) {
                            ThemeActivity.this.listAdapter.showOptionsForTheme(themeInfo);
                        }

                        @Override
                        protected void updateRows() {
                            ThemeActivity.this.updateRows(false);
                        }
                    };
                    ThemeActivity.this.themesHorizontalListCell.setDrawDivider(ThemeActivity.this.hasThemeAccents);
                    ThemeActivity.this.themesHorizontalListCell.setFocusable(false);
                    ThemesHorizontalListCell themesHorizontalListCell = ThemeActivity.this.themesHorizontalListCell;
                    themesHorizontalListCell.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(148.0f)));
                    notificationsCheckCell = themesHorizontalListCell;
                    break;
                case 12:
                    final TintRecyclerListView tintRecyclerListView = new TintRecyclerListView(this.mContext) {
                        @Override
                        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                            if (getParent() != null && getParent().getParent() != null) {
                                getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                            }
                            return super.onInterceptTouchEvent(motionEvent);
                        }
                    };
                    tintRecyclerListView.setFocusable(false);
                    tintRecyclerListView.setItemAnimator(null);
                    tintRecyclerListView.setLayoutAnimation(null);
                    tintRecyclerListView.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
                    tintRecyclerListView.setClipToPadding(false);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext);
                    linearLayoutManager.setOrientation(0);
                    tintRecyclerListView.setLayoutManager(linearLayoutManager);
                    final ThemeAccentsListAdapter themeAccentsListAdapter = ThemeActivity.this.new ThemeAccentsListAdapter(this.mContext);
                    tintRecyclerListView.setAdapter(themeAccentsListAdapter);
                    tintRecyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                        @Override
                        public final void onItemClick(View view, int i3) {
                            ThemeActivity.ListAdapter.$r8$lambda$5kfwAA3Dj9F1C6IpsJxJmYwz8h8(this.f$0, themeAccentsListAdapter, tintRecyclerListView, view, i3);
                        }
                    });
                    tintRecyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
                        @Override
                        public final boolean onItemClick(View view, int i3) {
                            return ThemeActivity.ListAdapter.$r8$lambda$Qzk_mTDXwKbVgZaZJbIYdkx0dcQ(this.f$0, themeAccentsListAdapter, view, i3);
                        }
                    });
                    tintRecyclerListView.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(62.0f)));
                    bubbleRadiusCell = tintRecyclerListView;
                    notificationsCheckCell = bubbleRadiusCell;
                    break;
                case 13:
                    bubbleRadiusCell = ThemeActivity.this.new BubbleRadiusCell(this.mContext);
                    notificationsCheckCell = bubbleRadiusCell;
                    break;
                case 14:
                case 18:
                default:
                    bubbleRadiusCell = new TextCell(this.mContext);
                    notificationsCheckCell = bubbleRadiusCell;
                    break;
                case 15:
                    bubbleRadiusCell = new SwipeGestureSettingsView(this.mContext, ((BaseFragment) ThemeActivity.this).currentAccount);
                    notificationsCheckCell = bubbleRadiusCell;
                    break;
                case 16:
                    ThemePreviewMessagesCell themePreviewMessagesCell = new ThemePreviewMessagesCell(this.mContext, ((BaseFragment) ThemeActivity.this).parentLayout, i2) {
                        @Override
                        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                            if (getParent() != null && getParent().getParent() != null) {
                                getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                            }
                            return super.onInterceptTouchEvent(motionEvent);
                        }
                    };
                    themePreviewMessagesCell.setImportantForAccessibility(4);
                    bubbleRadiusCell = themePreviewMessagesCell;
                    notificationsCheckCell = bubbleRadiusCell;
                    break;
                case 17:
                    Context context2 = this.mContext;
                    ThemeActivity themeActivity3 = ThemeActivity.this;
                    DefaultThemesPreviewCell defaultThemesPreviewCell = new DefaultThemesPreviewCell(context2, themeActivity3, themeActivity3.currentType);
                    defaultThemesPreviewCell.setFocusable(false);
                    defaultThemesPreviewCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    bubbleRadiusCell = defaultThemesPreviewCell;
                    notificationsCheckCell = bubbleRadiusCell;
                    break;
                case 19:
                    bubbleRadiusCell = new RadioButtonCell(this.mContext);
                    notificationsCheckCell = bubbleRadiusCell;
                    break;
                case 20:
                    Context context3 = this.mContext;
                    ThemeActivity themeActivity4 = ThemeActivity.this;
                    bubbleRadiusCell = new AppIconsSelectorCell(context3, themeActivity4, ((BaseFragment) themeActivity4).currentAccount);
                    notificationsCheckCell = bubbleRadiusCell;
                    break;
                case 21:
                    notificationsCheckCell = new PeerColorActivity.ChangeNameColorCell(((BaseFragment) ThemeActivity.this).currentAccount, 0L, this.mContext, ThemeActivity.this.getResourceProvider());
                    break;
            }
            return new RecyclerListView.Holder(notificationsCheckCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            String string2;
            String string3;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 1) {
                TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                if (i != ThemeActivity.this.nightThemeRow) {
                    if (i != ThemeActivity.this.scheduleFromRow) {
                        if (i != ThemeActivity.this.scheduleToRow) {
                            if (i != ThemeActivity.this.scheduleUpdateLocationRow) {
                                if (i != ThemeActivity.this.contactsSortRow) {
                                    if (i != ThemeActivity.this.contactsReimportRow) {
                                        if (i != ThemeActivity.this.distanceRow) {
                                            if (i == ThemeActivity.this.searchEngineRow) {
                                                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.SearchEngine), SearchEngine.getCurrent().name, ThemeActivity.this.updateSearchEngine, false);
                                                return;
                                            } else {
                                                if (i == ThemeActivity.this.bluetoothScoRow) {
                                                    textSettingsCell.setTextAndValue(LocaleController.getString(R.string.MicrophoneForVoiceMessages), LocaleController.getString(SharedConfig.recordViaSco ? R.string.MicrophoneForVoiceMessagesSco : R.string.MicrophoneForVoiceMessagesBuiltIn), ThemeActivity.this.updateRecordViaSco, false);
                                                    ThemeActivity.this.updateRecordViaSco = false;
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        int i2 = SharedConfig.distanceSystemType;
                                        if (i2 == 0) {
                                            string = LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic);
                                        } else if (i2 == 1) {
                                            string = LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers);
                                        } else {
                                            string = LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles);
                                        }
                                        textSettingsCell.setTextAndValue(LocaleController.getString("DistanceUnits", R.string.DistanceUnits), string, ThemeActivity.this.updateDistance, ThemeActivity.this.otherSectionRow >= 0);
                                        ThemeActivity.this.updateDistance = false;
                                        return;
                                    }
                                    textSettingsCell.setText(LocaleController.getString("ImportContacts", R.string.ImportContacts), true);
                                    return;
                                }
                                int i3 = MessagesController.getGlobalMainSettings().getInt("sortContactsBy", 0);
                                if (i3 == 0) {
                                    string2 = LocaleController.getString("Default", R.string.Default);
                                } else if (i3 == 1) {
                                    string2 = LocaleController.getString("FirstName", R.string.SortFirstName);
                                } else {
                                    string2 = LocaleController.getString("LastName", R.string.SortLastName);
                                }
                                textSettingsCell.setTextAndValue(LocaleController.getString("SortBy", R.string.SortBy), string2, true);
                                return;
                            }
                            textSettingsCell.setTextAndValue(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), Theme.autoNightCityName, false);
                            return;
                        }
                        int i4 = Theme.autoNightDayEndTime;
                        int i5 = i4 / 60;
                        textSettingsCell.setTextAndValue(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i5), Integer.valueOf(i4 - (i5 * 60))), false);
                        return;
                    }
                    int i6 = Theme.autoNightDayStartTime;
                    int i7 = i6 / 60;
                    textSettingsCell.setTextAndValue(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i7), Integer.valueOf(i6 - (i7 * 60))), true);
                    return;
                }
                if (Theme.selectedAutoNightType == 0 || Theme.getCurrentNightTheme() == null) {
                    textSettingsCell.setTextAndValue(LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.AutoNightThemeOff), false);
                    return;
                } else {
                    textSettingsCell.setTextAndValue(LocaleController.getString(R.string.AutoNightTheme), Theme.getCurrentNightThemeName(), false);
                    return;
                }
            }
            if (itemViewType == 2) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                textInfoPrivacyCell.setFixedSize(0);
                if (i == ThemeActivity.this.automaticBrightnessInfoRow) {
                    textInfoPrivacyCell.setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (Theme.autoNightBrighnessThreshold * 100.0f))));
                    return;
                }
                if (i == ThemeActivity.this.scheduleLocationInfoRow) {
                    textInfoPrivacyCell.setText(ThemeActivity.this.getLocationSunString());
                    return;
                }
                if (i != ThemeActivity.this.swipeGestureInfoRow) {
                    if (i == ThemeActivity.this.liteModeInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString("LiteModeInfo", R.string.LiteModeInfo));
                        return;
                    } else {
                        textInfoPrivacyCell.setFixedSize(12);
                        textInfoPrivacyCell.setText("");
                        return;
                    }
                }
                textInfoPrivacyCell.setText(LocaleController.getString("ChatListSwipeGestureInfo", R.string.ChatListSwipeGestureInfo));
                return;
            }
            if (itemViewType == 4) {
                ThemeTypeCell themeTypeCell = (ThemeTypeCell) viewHolder.itemView;
                if (i != ThemeActivity.this.nightDisabledRow) {
                    if (i != ThemeActivity.this.nightScheduledRow) {
                        if (i == ThemeActivity.this.nightAutomaticRow) {
                            themeTypeCell.setValue(LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive), Theme.selectedAutoNightType == 2, ThemeActivity.this.nightSystemDefaultRow != -1);
                            return;
                        } else {
                            if (i == ThemeActivity.this.nightSystemDefaultRow) {
                                themeTypeCell.setValue(LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault), Theme.selectedAutoNightType == 3, false);
                                return;
                            }
                            return;
                        }
                    }
                    themeTypeCell.setValue(LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled), Theme.selectedAutoNightType == 1, true);
                    return;
                }
                themeTypeCell.setValue(LocaleController.getString("AutoNightDisabled", R.string.AutoNightDisabled), Theme.selectedAutoNightType == 0, true);
                return;
            }
            if (itemViewType == 5) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (i != ThemeActivity.this.scheduleHeaderRow) {
                    if (i != ThemeActivity.this.automaticHeaderRow) {
                        if (i != ThemeActivity.this.preferedHeaderRow) {
                            if (i != ThemeActivity.this.settingsRow) {
                                if (i == ThemeActivity.this.themeHeaderRow) {
                                    if (ThemeActivity.this.currentType == 3) {
                                        headerCell.setText(LocaleController.getString("BuildMyOwnTheme", R.string.BuildMyOwnTheme));
                                        return;
                                    } else {
                                        headerCell.setText(LocaleController.getString("ColorTheme", R.string.ColorTheme));
                                        return;
                                    }
                                }
                                if (i != ThemeActivity.this.textSizeHeaderRow) {
                                    if (i != ThemeActivity.this.chatListHeaderRow) {
                                        if (i != ThemeActivity.this.bubbleRadiusHeaderRow) {
                                            if (i != ThemeActivity.this.swipeGestureHeaderRow) {
                                                if (i != ThemeActivity.this.selectThemeHeaderRow) {
                                                    if (i != ThemeActivity.this.appIconHeaderRow) {
                                                        if (i != ThemeActivity.this.otherHeaderRow) {
                                                            if (i == ThemeActivity.this.mediaSoundHeaderRow) {
                                                                headerCell.setText(LocaleController.getString("MediaAndSoundSettings", R.string.MediaAndSoundSettings));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        headerCell.setText(LocaleController.getString("OtherSettings", R.string.OtherSettings));
                                                        return;
                                                    }
                                                    headerCell.setText(LocaleController.getString(R.string.AppIcon));
                                                    return;
                                                }
                                                headerCell.setText(LocaleController.getString("SelectTheme", R.string.SelectTheme));
                                                return;
                                            }
                                            headerCell.setText(LocaleController.getString("ChatListSwipeGesture", R.string.ChatListSwipeGesture));
                                            return;
                                        }
                                        headerCell.setText(LocaleController.getString("BubbleRadius", R.string.BubbleRadius));
                                        return;
                                    }
                                    headerCell.setText(LocaleController.getString("ChatList", R.string.ChatList));
                                    return;
                                }
                                headerCell.setText(LocaleController.getString("TextSizeHeader", R.string.TextSizeHeader));
                                return;
                            }
                            headerCell.setText(LocaleController.getString("SETTINGS", R.string.SETTINGS));
                            return;
                        }
                        headerCell.setText(LocaleController.getString("AutoNightPreferred", R.string.AutoNightPreferred));
                        return;
                    }
                    headerCell.setText(LocaleController.getString("AutoNightBrightness", R.string.AutoNightBrightness));
                    return;
                }
                headerCell.setText(LocaleController.getString("AutoNightSchedule", R.string.AutoNightSchedule));
                return;
            }
            if (itemViewType == 6) {
                ((BrightnessControlCell) viewHolder.itemView).setProgress(Theme.autoNightBrighnessThreshold);
                return;
            }
            if (itemViewType == 7) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                if (i != ThemeActivity.this.scheduleLocationRow) {
                    if (i != ThemeActivity.this.enableAnimationsRow) {
                        if (i != ThemeActivity.this.sendByEnterRow) {
                            if (i != ThemeActivity.this.raiseToSpeakRow) {
                                if (i != ThemeActivity.this.raiseToListenRow) {
                                    if (i != ThemeActivity.this.nextMediaTapRow) {
                                        if (i != ThemeActivity.this.pauseOnRecordRow) {
                                            if (i != ThemeActivity.this.pauseOnMediaRow) {
                                                if (i != ThemeActivity.this.directShareRow) {
                                                    if (i != ThemeActivity.this.sensitiveContentRow) {
                                                        if (i == ThemeActivity.this.chatBlurRow) {
                                                            textCheckCell.setTextAndCheck(LocaleController.getString("BlurInChat", R.string.BlurInChat), SharedConfig.chatBlurEnabled(), true);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    textCheckCell.setTextAndValueAndCheck(LocaleController.getString(R.string.ShowSensitiveContent), LocaleController.getString(R.string.ShowSensitiveContentInfo), ThemeActivity.this.getMessagesController().showSensitiveContent(), true, true);
                                                    return;
                                                }
                                                textCheckCell.setTextAndValueAndCheck(LocaleController.getString("DirectShare", R.string.DirectShare), LocaleController.getString("DirectShareInfo", R.string.DirectShareInfo), SharedConfig.directShare, false, true);
                                                return;
                                            }
                                            textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PauseMusicOnMedia), SharedConfig.pauseMusicOnMedia, true);
                                            return;
                                        }
                                        textCheckCell.setTextAndValueAndCheck(LocaleController.getString(R.string.PauseMusicOnRecord), LocaleController.getString("PauseMusicOnRecordInfo", R.string.PauseMusicOnRecordInfo), SharedConfig.pauseMusicOnRecord, true, true);
                                        return;
                                    }
                                    textCheckCell.setTextAndValueAndCheck(LocaleController.getString("NextMediaTap", R.string.NextMediaTap), LocaleController.getString("NextMediaTapInfo", R.string.NextMediaTapInfo), SharedConfig.nextMediaTap, true, true);
                                    return;
                                }
                                textCheckCell.setTextAndValueAndCheck(LocaleController.getString("RaiseToListen", R.string.RaiseToListen), LocaleController.getString("RaiseToListenInfo", R.string.RaiseToListenInfo), SharedConfig.raiseToListen, true, true);
                                return;
                            }
                            textCheckCell.setTextAndValueAndCheck(LocaleController.getString("RaiseToSpeak", R.string.RaiseToSpeak), LocaleController.getString("RaiseToSpeakInfo", R.string.RaiseToSpeakInfo), SharedConfig.raiseToSpeak, true, true);
                            return;
                        }
                        textCheckCell.setTextAndCheck(LocaleController.getString("SendByEnter", R.string.SendByEnter), MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false), true);
                        return;
                    }
                    textCheckCell.setTextAndCheck(LocaleController.getString("EnableAnimations", R.string.EnableAnimations), MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), true);
                    return;
                }
                textCheckCell.setTextAndCheck(LocaleController.getString("AutoNightLocation", R.string.AutoNightLocation), Theme.autoNightScheduleByLocation, true);
                return;
            }
            if (itemViewType == 14) {
                TextCell textCell = (TextCell) viewHolder.itemView;
                textCell.heightDp = 48;
                if (i != ThemeActivity.this.backgroundRow) {
                    if (i != ThemeActivity.this.editThemeRow) {
                        if (i != ThemeActivity.this.createNewThemeRow) {
                            if (i != ThemeActivity.this.liteModeRow) {
                                if (i == ThemeActivity.this.stickersRow) {
                                    textCell.setColors(Theme.key_dialogIcon, Theme.key_windowBackgroundWhiteBlackText);
                                    textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, false);
                                    textCell.setSubtitle(LocaleController.getString(R.string.StickersNameInfo2));
                                    textCell.offsetFromImage = 64;
                                    textCell.heightDp = 60;
                                    textCell.imageLeft = 20;
                                    return;
                                }
                                return;
                            }
                            textCell.setColors(Theme.key_dialogIcon, Theme.key_windowBackgroundWhiteBlackText);
                            textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.LiteMode), R.drawable.msg2_animations, true);
                            textCell.setSubtitle(LocaleController.getString(R.string.LiteModeInfo));
                            textCell.heightDp = 60;
                            textCell.offsetFromImage = 64;
                            textCell.imageLeft = 20;
                            return;
                        }
                        textCell.setSubtitle(null);
                        int i8 = Theme.key_windowBackgroundWhiteBlueText4;
                        textCell.setColors(i8, i8);
                        textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.CreateNewTheme), R.drawable.msg_colors, false);
                        return;
                    }
                    textCell.setSubtitle(null);
                    int i9 = Theme.key_windowBackgroundWhiteBlueText4;
                    textCell.setColors(i9, i9);
                    textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.EditCurrentTheme), R.drawable.msg_theme, true);
                    return;
                }
                textCell.setSubtitle(null);
                int i10 = Theme.key_windowBackgroundWhiteBlueText4;
                textCell.setColors(i10, i10);
                textCell.setTextAndIcon(LocaleController.getString(R.string.ChangeChatBackground), R.drawable.msg_background, ThemeActivity.this.changeUserColor >= 0);
                return;
            }
            if (itemViewType == 17) {
                ((DefaultThemesPreviewCell) viewHolder.itemView).updateDayNightMode();
                return;
            }
            if (itemViewType == 19) {
                RadioButtonCell radioButtonCell = (RadioButtonCell) viewHolder.itemView;
                if (i == ThemeActivity.this.saveToGalleryOption1Row) {
                    radioButtonCell.setTextAndValue("save media only from peer chats", "", true, false);
                    return;
                } else {
                    radioButtonCell.setTextAndValue("save media from all chats", "", true, false);
                    return;
                }
            }
            if (itemViewType != 21) {
                switch (itemViewType) {
                    case 10:
                        NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) viewHolder.itemView;
                        if (i != ThemeActivity.this.nightThemeRow) {
                            if (i == ThemeActivity.this.browserRow) {
                                notificationsCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.InappBrowser), LocaleController.getString(R.string.InappBrowserInfo), R.drawable.msg2_language, ThemeActivity.this.getMessagesController().isWebBrowserInAppEnabled(), 0, false, true);
                            }
                        } else {
                            boolean z = Theme.selectedAutoNightType != 0;
                            String currentNightThemeName = z ? Theme.getCurrentNightThemeName() : LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                            if (z) {
                                int i11 = Theme.selectedAutoNightType;
                                if (i11 == 1) {
                                    string3 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                                } else if (i11 == 3) {
                                    string3 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                                } else {
                                    string3 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                                }
                                currentNightThemeName = string3 + " " + currentNightThemeName;
                            }
                            notificationsCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), currentNightThemeName, R.drawable.menu_night_mode_24, z, 0, false, true);
                        }
                        break;
                    case 11:
                        if (this.first) {
                            ThemeActivity.this.themesHorizontalListCell.scrollToCurrentTheme(ThemeActivity.this.listView.getMeasuredWidth(), false);
                            this.first = false;
                        }
                        break;
                    case 12:
                        RecyclerListView recyclerListView = (RecyclerListView) viewHolder.itemView;
                        ThemeAccentsListAdapter themeAccentsListAdapter = (ThemeAccentsListAdapter) recyclerListView.getAdapter();
                        themeAccentsListAdapter.notifyDataSetChanged();
                        int iFindCurrentAccent = themeAccentsListAdapter.findCurrentAccent();
                        if (iFindCurrentAccent == -1) {
                            iFindCurrentAccent = themeAccentsListAdapter.getItemCount() - 1;
                        }
                        if (iFindCurrentAccent != -1) {
                            ((LinearLayoutManager) recyclerListView.getLayoutManager()).scrollToPositionWithOffset(iFindCurrentAccent, (ThemeActivity.this.listView.getMeasuredWidth() / 2) - AndroidUtilities.dp(42.0f));
                        }
                        break;
                }
                return;
            }
            ((PeerColorActivity.ChangeNameColorCell) viewHolder.itemView).set(ThemeActivity.this.getUserConfig().getCurrentUser());
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 4) {
                ((ThemeTypeCell) viewHolder.itemView).setTypeChecked(viewHolder.getAdapterPosition() == Theme.selectedAutoNightType);
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (i == ThemeActivity.this.scheduleFromRow || i == ThemeActivity.this.distanceRow || i == ThemeActivity.this.scheduleToRow || i == ThemeActivity.this.scheduleUpdateLocationRow || i == ThemeActivity.this.contactsReimportRow || i == ThemeActivity.this.contactsSortRow || i == ThemeActivity.this.bluetoothScoRow || i == ThemeActivity.this.searchEngineRow) {
                return 1;
            }
            if (i == ThemeActivity.this.automaticBrightnessInfoRow || i == ThemeActivity.this.scheduleLocationInfoRow || i == ThemeActivity.this.swipeGestureInfoRow || i == ThemeActivity.this.stickersInfoRow || i == ThemeActivity.this.liteModeInfoRow) {
                return 2;
            }
            if (i == ThemeActivity.this.themeInfoRow || i == ThemeActivity.this.nightTypeInfoRow || i == ThemeActivity.this.scheduleFromToInfoRow || i == ThemeActivity.this.settings2Row || i == ThemeActivity.this.newThemeInfoRow || i == ThemeActivity.this.chatListInfoRow || i == ThemeActivity.this.bubbleRadiusInfoRow || i == ThemeActivity.this.saveToGallerySectionRow || i == ThemeActivity.this.appIconShadowRow || i == ThemeActivity.this.lastShadowRow || i == ThemeActivity.this.stickersSectionRow || i == ThemeActivity.this.mediaSoundSectionRow || i == ThemeActivity.this.otherSectionRow) {
                return 3;
            }
            if (i == ThemeActivity.this.nightDisabledRow || i == ThemeActivity.this.nightScheduledRow || i == ThemeActivity.this.nightAutomaticRow || i == ThemeActivity.this.nightSystemDefaultRow) {
                return 4;
            }
            if (i == ThemeActivity.this.scheduleHeaderRow || i == ThemeActivity.this.automaticHeaderRow || i == ThemeActivity.this.preferedHeaderRow || i == ThemeActivity.this.settingsRow || i == ThemeActivity.this.themeHeaderRow || i == ThemeActivity.this.textSizeHeaderRow || i == ThemeActivity.this.chatListHeaderRow || i == ThemeActivity.this.bubbleRadiusHeaderRow || i == ThemeActivity.this.swipeGestureHeaderRow || i == ThemeActivity.this.selectThemeHeaderRow || i == ThemeActivity.this.appIconHeaderRow || i == ThemeActivity.this.mediaSoundHeaderRow || i == ThemeActivity.this.otherHeaderRow) {
                return 5;
            }
            if (i == ThemeActivity.this.automaticBrightnessRow) {
                return 6;
            }
            if (i == ThemeActivity.this.scheduleLocationRow || i == ThemeActivity.this.sendByEnterRow || i == ThemeActivity.this.raiseToSpeakRow || i == ThemeActivity.this.raiseToListenRow || i == ThemeActivity.this.pauseOnRecordRow || i == ThemeActivity.this.directShareRow || i == ThemeActivity.this.chatBlurRow || i == ThemeActivity.this.pauseOnMediaRow || i == ThemeActivity.this.nextMediaTapRow || i == ThemeActivity.this.sensitiveContentRow) {
                return 7;
            }
            if (i == ThemeActivity.this.textSizeRow) {
                return 8;
            }
            if (i == ThemeActivity.this.chatListRow) {
                return 9;
            }
            if (i == ThemeActivity.this.nightThemeRow || i == ThemeActivity.this.browserRow) {
                return 10;
            }
            if (i == ThemeActivity.this.themeListRow) {
                return 11;
            }
            if (i == ThemeActivity.this.themeAccentListRow) {
                return 12;
            }
            if (i == ThemeActivity.this.bubbleRadiusRow) {
                return 13;
            }
            if (i == ThemeActivity.this.backgroundRow || i == ThemeActivity.this.editThemeRow || i == ThemeActivity.this.createNewThemeRow || i == ThemeActivity.this.liteModeRow || i == ThemeActivity.this.stickersRow) {
                return 14;
            }
            if (i == ThemeActivity.this.swipeGestureRow) {
                return 15;
            }
            if (i == ThemeActivity.this.themePreviewRow) {
                return 16;
            }
            if (i == ThemeActivity.this.themeListRow2) {
                return 17;
            }
            if (i == ThemeActivity.this.saveToGalleryOption1Row || i == ThemeActivity.this.saveToGalleryOption2Row) {
                return 19;
            }
            if (i == ThemeActivity.this.appIconSelectorRow) {
                return 20;
            }
            return i == ThemeActivity.this.changeUserColor ? 21 : 1;
        }
    }

    private static abstract class TintRecyclerListView extends RecyclerListView {
        TintRecyclerListView(Context context) {
            super(context);
        }
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{TextSettingsCell.class, TextCheckCell.class, HeaderCell.class, BrightnessControlCell.class, ThemeTypeCell.class, TextSizeCell.class, BubbleRadiusCell.class, ChatListCell.class, NotificationsCheckCell.class, ThemesHorizontalListCell.class, TintRecyclerListView.class, TextCell.class, PeerColorActivity.ChangeNameColorCell.class, SwipeGestureSettingsView.class, DefaultThemesPreviewCell.class, AppIconsSelectorCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUBACKGROUND, null, null, null, null, Theme.key_actionBarDefaultSubmenuBackground));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUITEM, null, null, null, null, Theme.key_actionBarDefaultSubmenuItem));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUITEM | ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, Theme.key_actionBarDefaultSubmenuItemIcon));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        int i3 = Theme.key_windowBackgroundWhiteValueText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
        int i4 = Theme.key_windowBackgroundWhiteBlueText4;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        int i5 = Theme.key_switchTrack;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        int i6 = Theme.key_switchTrackChecked;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i6));
        int i7 = Theme.key_windowBackgroundWhiteGrayIcon;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{BrightnessControlCell.class}, new String[]{"leftImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i7));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{BrightnessControlCell.class}, new String[]{"rightImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i7));
        int i8 = Theme.key_player_progressBackground;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{BrightnessControlCell.class}, new String[]{"seekBarView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i8));
        int i9 = Theme.key_player_progress;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_PROGRESSBAR, new Class[]{BrightnessControlCell.class}, new String[]{"seekBarView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i9));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ThemeTypeCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ThemeTypeCell.class}, new String[]{"checkImage"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_featuredStickers_addedIcon));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_PROGRESSBAR, new Class[]{TextSizeCell.class}, new String[]{"sizeBar"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i9));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, new String[]{"sizeBar"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i8));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_PROGRESSBAR, new Class[]{BubbleRadiusCell.class}, new String[]{"sizeBar"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i9));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{BubbleRadiusCell.class}, new String[]{"sizeBar"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i8));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ChatListCell.class}, null, null, null, Theme.key_radioBackground));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ChatListCell.class}, null, null, null, Theme.key_radioBackgroundChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i6));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, new Drawable[]{Theme.chat_msgInDrawable, Theme.chat_msgInMediaDrawable}, null, Theme.key_chat_inBubble));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, new Drawable[]{Theme.chat_msgInSelectedDrawable, Theme.chat_msgInMediaSelectedDrawable}, null, Theme.key_chat_inBubbleSelected));
        Drawable[] shadowDrawables = Theme.chat_msgInDrawable.getShadowDrawables();
        int i10 = Theme.key_chat_inBubbleShadow;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, shadowDrawables, null, i10));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, Theme.chat_msgInMediaDrawable.getShadowDrawables(), null, i10));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubble));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient1));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, new Drawable[]{Theme.chat_msgOutSelectedDrawable, Theme.chat_msgOutMediaSelectedDrawable}, null, Theme.key_chat_outBubbleSelected));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleShadow));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, new Drawable[]{Theme.chat_msgInDrawable, Theme.chat_msgInMediaDrawable}, null, i10));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, null, null, Theme.key_chat_messageTextIn));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, null, null, Theme.key_chat_messageTextOut));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, new Drawable[]{Theme.chat_msgOutCheckDrawable}, null, Theme.key_chat_outSentCheck));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, new Drawable[]{Theme.chat_msgOutCheckSelectedDrawable}, null, Theme.key_chat_outSentCheckSelected));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, new Drawable[]{Theme.chat_msgOutCheckReadDrawable, Theme.chat_msgOutHalfCheckDrawable}, null, Theme.key_chat_outSentCheckRead));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, new Drawable[]{Theme.chat_msgOutCheckReadSelectedDrawable, Theme.chat_msgOutHalfCheckSelectedDrawable}, null, Theme.key_chat_outSentCheckReadSelected));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, new Drawable[]{Theme.chat_msgMediaCheckDrawable, Theme.chat_msgMediaHalfCheckDrawable}, null, Theme.key_chat_mediaSentCheck));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, null, null, Theme.key_chat_inReplyLine));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, null, null, Theme.key_chat_outReplyLine));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, null, null, Theme.key_chat_inReplyNameText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, null, null, Theme.key_chat_outReplyNameText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, null, null, Theme.key_chat_inReplyMessageText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, null, null, Theme.key_chat_outReplyMessageText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, null, null, Theme.key_chat_inReplyMediaMessageSelectedText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, null, null, Theme.key_chat_outReplyMediaMessageSelectedText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, null, null, Theme.key_chat_inTimeText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, null, null, Theme.key_chat_outTimeText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, null, null, Theme.key_chat_inTimeSelectedText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, null, null, Theme.key_chat_outTimeSelectedText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{AppIconsSelectorCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{AppIconsSelectorCell.class}, null, null, null, i2));
        int i11 = Theme.key_windowBackgroundWhiteHintText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{AppIconsSelectorCell.class}, null, null, null, i11));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{AppIconsSelectorCell.class}, null, null, null, i3));
        arrayList.addAll(SimpleThemeDescription.createThemeDescriptions(new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                ThemeActivity.m4673$r8$lambda$ClPdEBJ7Chuy4EHDuol94dMYw(this.f$0);
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        }, i11, i2, i3));
        return arrayList;
    }

    public static void m4673$r8$lambda$ClPdEBJ7Chuy4EHDuol94dMYw(ThemeActivity themeActivity) {
        for (int i = 0; i < themeActivity.listView.getChildCount(); i++) {
            View childAt = themeActivity.listView.getChildAt(i);
            if (childAt instanceof AppIconsSelectorCell) {
                ((AppIconsSelectorCell) childAt).getAdapter().notifyDataSetChanged();
            } else if (childAt instanceof PeerColorActivity.ChangeNameColorCell) {
                ((PeerColorActivity.ChangeNameColorCell) childAt).updateColors();
            }
        }
        for (int i2 = 0; i2 < themeActivity.listView.getCachedChildCount(); i2++) {
            View cachedChildAt = themeActivity.listView.getCachedChildAt(i2);
            if (cachedChildAt instanceof AppIconsSelectorCell) {
                ((AppIconsSelectorCell) cachedChildAt).getAdapter().notifyDataSetChanged();
            } else if (cachedChildAt instanceof PeerColorActivity.ChangeNameColorCell) {
                ((PeerColorActivity.ChangeNameColorCell) cachedChildAt).updateColors();
            }
        }
        for (int i3 = 0; i3 < themeActivity.listView.getHiddenChildCount(); i3++) {
            View hiddenChildAt = themeActivity.listView.getHiddenChildAt(i3);
            if (hiddenChildAt instanceof AppIconsSelectorCell) {
                ((AppIconsSelectorCell) hiddenChildAt).getAdapter().notifyDataSetChanged();
            } else if (hiddenChildAt instanceof PeerColorActivity.ChangeNameColorCell) {
                ((PeerColorActivity.ChangeNameColorCell) hiddenChildAt).updateColors();
            }
        }
        for (int i4 = 0; i4 < themeActivity.listView.getAttachedScrapChildCount(); i4++) {
            View attachedScrapChildAt = themeActivity.listView.getAttachedScrapChildAt(i4);
            if (attachedScrapChildAt instanceof AppIconsSelectorCell) {
                ((AppIconsSelectorCell) attachedScrapChildAt).getAdapter().notifyDataSetChanged();
            } else if (attachedScrapChildAt instanceof PeerColorActivity.ChangeNameColorCell) {
                ((PeerColorActivity.ChangeNameColorCell) attachedScrapChildAt).updateColors();
            }
        }
    }

    public void checkCurrentDayNight() {
        if (this.currentType != 3) {
            return;
        }
        boolean zIsCurrentThemeDay = Theme.isCurrentThemeDay();
        boolean z = !zIsCurrentThemeDay;
        if (this.lastIsDarkTheme != z) {
            this.lastIsDarkTheme = z;
            RLottieDrawable rLottieDrawable = this.sunDrawable;
            rLottieDrawable.setCustomEndFrame(!zIsCurrentThemeDay ? rLottieDrawable.getFramesCount() - 1 : 0);
            this.menuItem.getIconView().playAnimation();
        }
        if (this.themeListRow2 >= 0) {
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                if (this.listView.getChildAt(i) instanceof DefaultThemesPreviewCell) {
                    ((DefaultThemesPreviewCell) this.listView.getChildAt(i)).updateDayNightMode();
                }
            }
        }
    }
}
