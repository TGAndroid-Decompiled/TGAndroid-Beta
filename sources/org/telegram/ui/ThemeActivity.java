package org.telegram.ui;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
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
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.gms.internal.mlkit_language_id_common.zzit;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserNameResolver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.time.SunDate;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.AppIconsSelectorCell;
import org.telegram.ui.Cells.BrightnessControlCell;
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
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SeekBarView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SimpleThemeDescription;
import org.telegram.ui.Components.SwipeGestureSettingsView;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Stories.LiveCommentsView$$ExternalSyntheticLambda6;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.WebViewRequestProps;
import org.telegram.ui.web.SearchEngine;
import org.telegram.ui.web.WebBrowserSettings;

public final class ThemeActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public int appIconHeaderRow;
    public int appIconSelectorRow;
    public int appIconShadowRow;
    public int automaticBrightnessInfoRow;
    public int automaticBrightnessRow;
    public int automaticHeaderRow;
    public int backgroundRow;
    public int bluetoothScoRow;
    public int browserRow;
    public int bubbleRadiusHeaderRow;
    public int bubbleRadiusInfoRow;
    public int bubbleRadiusRow;
    public int changeUserColor;
    public int chatBlurRow;
    public int chatListHeaderRow;
    public int chatListInfoRow;
    public int chatListRow;
    public int contactsReimportRow;
    public int contactsSortRow;
    public int createNewThemeRow;
    public final int currentType;
    public final ArrayList darkThemes;
    public final ArrayList defaultThemes;
    public int directShareRow;
    public int distanceRow;
    public int editThemeRow;
    public int enableAnimationsRow;
    public final GpsLocationListener gpsLocationListener;
    public boolean hasThemeAccents;
    public boolean highlightSensitiveRow;
    public boolean lastIsDarkTheme;
    public int lastShadowRow;
    public ListAdapter listAdapter;
    public RecyclerListView listView;
    public int liteModeInfoRow;
    public int liteModeRow;
    public int mediaSoundHeaderRow;
    public int mediaSoundSectionRow;
    public ActionBarMenuItem menuItem;
    public final GpsLocationListener networkLocationListener;
    public int newThemeInfoRow;
    public int nextMediaTapRow;
    public int nightAutomaticRow;
    public int nightDisabledRow;
    public int nightScheduledRow;
    public int nightSystemDefaultRow;
    public int nightThemeRow;
    public int nightTypeInfoRow;
    public int otherHeaderRow;
    public int otherSectionRow;
    public int pauseOnMediaRow;
    public int pauseOnRecordRow;
    public int preferedHeaderRow;
    public boolean previousByLocation;
    public int previousUpdatedType;
    public int raiseToListenRow;
    public int raiseToSpeakRow;
    public int rowCount;
    public int saveToGalleryOption1Row;
    public int saveToGalleryOption2Row;
    public int saveToGallerySectionRow;
    public int scheduleFromRow;
    public int scheduleFromToInfoRow;
    public int scheduleHeaderRow;
    public int scheduleLocationInfoRow;
    public int scheduleLocationRow;
    public int scheduleToRow;
    public int scheduleUpdateLocationRow;
    public int searchEngineRow;
    public int selectThemeHeaderRow;
    public int sendByEnterRow;
    public int sensitiveContentRow;
    public int settings2Row;
    public int settingsRow;
    public Theme.ThemeAccent sharingAccent;
    public AlertDialog sharingProgressDialog;
    public Theme.ThemeInfo sharingTheme;
    public int stickersInfoRow;
    public int stickersRow;
    public int stickersSectionRow;
    public RLottieDrawable sunDrawable;
    public int swipeGestureHeaderRow;
    public int swipeGestureInfoRow;
    public int swipeGestureRow;
    public int textSizeHeaderRow;
    public int textSizeRow;
    public int themeAccentListRow;
    public int themeHeaderRow;
    public int themeInfoRow;
    public int themeListRow;
    public int themeListRow2;
    public int themePreviewRow;
    public ThemeSetUrlActivity.AnonymousClass4 themesHorizontalListCell;
    public boolean updateDistance;
    public boolean updateRecordViaSco;
    public boolean updateSearchEngine;
    public boolean updatingLocation;

    public final class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        public AnonymousClass1() {
        }

        @Override
        public final void onItemClick(int i) throws Throwable {
            boolean zEquals;
            Theme.ThemeInfo themeInfo;
            int i2 = 1;
            if (i == -1) {
                ThemeActivity.this.finishFragment();
                return;
            }
            if (i == 1) {
                ThemeActivity.this.createNewTheme();
                return;
            }
            if (i == 2) {
                Theme.ThemeInfo themeInfo2 = Theme.currentDayTheme;
                if (themeInfo2 == null) {
                    themeInfo2 = Theme.defaultTheme;
                }
                Theme.ThemeAccent accent = themeInfo2.getAccent(false);
                if (accent.info == null) {
                    ThemeActivity.this.getMessagesController().saveThemeToServer(accent.parentTheme, accent);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, accent.parentTheme, accent);
                    return;
                }
                String str = "https://" + ThemeActivity.this.getMessagesController().linkPrefix + "/addtheme/" + accent.info.slug;
                ThemeActivity.this.showDialog(new ShareAlert(ThemeActivity.this.getParentActivity(), str, str, null));
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
                AlertDialog.Builder builder = new AlertDialog.Builder(ThemeActivity.this.getParentActivity(), 0, null);
                builder.alertDialog.title = LocaleController.getString("ThemeResetToDefaultsTitle", R.string.ThemeResetToDefaultsTitle);
                builder.alertDialog.message = LocaleController.getString("ThemeResetToDefaultsText", R.string.ThemeResetToDefaultsText);
                builder.setPositiveButton(LocaleController.getString("Reset", R.string.Reset), new TodoItemMenu$$ExternalSyntheticLambda3(this, i2));
                builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                AlertDialog alertDialog = builder.alertDialog;
                ThemeActivity.this.showDialog(alertDialog);
                TextView textView = (TextView) alertDialog.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                    return;
                }
                return;
            }
            if (i == 5) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str2 = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                HashMap map = Theme.themesDict;
                if (((Theme.ThemeInfo) map.get(string)) == null || ((Theme.ThemeInfo) map.get(string)).isDark()) {
                    string = "Blue";
                }
                String str3 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (((Theme.ThemeInfo) map.get(string2)) == null || !((Theme.ThemeInfo) map.get(string2)).isDark()) {
                    string2 = "Dark Blue";
                }
                Theme.ThemeInfo themeInfo3 = Theme.currentTheme;
                if (string.equals(string2)) {
                    if (themeInfo3.isDark() || string.equals("Dark Blue") || string.equals("Night")) {
                        str3 = string2;
                    }
                    zEquals = str2.equals(themeInfo3.getKey());
                    if (zEquals) {
                        themeInfo = (Theme.ThemeInfo) map.get(str3);
                    } else {
                        themeInfo = (Theme.ThemeInfo) map.get(str2);
                    }
                    int[] iArr = {(ThemeActivity.this.menuItem.getIconView().getMeasuredWidth() / 2) + i, (ThemeActivity.this.menuItem.getIconView().getMeasuredHeight() / 2) + i};
                    ThemeActivity.this.menuItem.getIconView().getLocationInWindow(iArr);
                    int i3 = iArr[0];
                    int i4 = iArr[1];
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themeInfo, Boolean.FALSE, iArr, -1, Boolean.valueOf(zEquals), ThemeActivity.this.menuItem.getIconView());
                    ThemeActivity.this.updateRows$8(true);
                    Theme.turnOffAutoNight(ThemeActivity.this);
                }
                str3 = string2;
                str2 = string;
                zEquals = str2.equals(themeInfo3.getKey());
                if (zEquals) {
                    themeInfo = (Theme.ThemeInfo) map.get(str3);
                } else {
                    themeInfo = (Theme.ThemeInfo) map.get(str2);
                }
                int[] iArr2 = {(ThemeActivity.this.menuItem.getIconView().getMeasuredWidth() / 2) + i3, (ThemeActivity.this.menuItem.getIconView().getMeasuredHeight() / 2) + i4};
                ThemeActivity.this.menuItem.getIconView().getLocationInWindow(iArr2);
                int i5 = iArr2[0];
                int i6 = iArr2[1];
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themeInfo, Boolean.FALSE, iArr2, -1, Boolean.valueOf(zEquals), ThemeActivity.this.menuItem.getIconView());
                ThemeActivity.this.updateRows$8(true);
                Theme.turnOffAutoNight(ThemeActivity.this);
            }
        }
    }

    public final class BubbleRadiusCell extends FrameLayout {
        public final int endRadius;
        public final SeekBarView sizeBar;
        public final TextPaint textPaint;

        public BubbleRadiusCell(Context context) {
            super(context);
            this.endRadius = 17;
            setWillNotDraw(false);
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SeekBarView seekBarView = new SeekBarView(context, null, false);
            this.sizeBar = seekBarView;
            seekBarView.setReportChanges(true);
            seekBarView.setSeparatorsCount(18);
            seekBarView.setDelegate(new PhotoViewer.AnonymousClass49(this, 14));
            seekBarView.setImportantForAccessibility(2);
            addView(seekBarView, LayoutHelper.createFrame(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            this.sizeBar.invalidate();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            TextPaint textPaint = this.textPaint;
            textPaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
            canvas.drawText("" + SharedConfig.bubbleRadius, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            this.sizeBar.getSeekBarAccessibilityDelegate().onInitializeAccessibilityNodeInfoInternal(this, accessibilityNodeInfo);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
            this.sizeBar.setProgress(SharedConfig.bubbleRadius / this.endRadius);
        }

        @Override
        public final boolean performAccessibilityAction(int i, Bundle bundle) {
            return super.performAccessibilityAction(i, bundle) || this.sizeBar.getSeekBarAccessibilityDelegate().performAccessibilityActionInternal(this, i, bundle);
        }
    }

    public final class GpsLocationListener implements LocationListener {
        public GpsLocationListener() {
        }

        @Override
        public final void onLocationChanged(Location location) {
            if (location == null) {
                return;
            }
            ThemeActivity themeActivity = ThemeActivity.this;
            themeActivity.updatingLocation = false;
            LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
            locationManager.removeUpdates(themeActivity.gpsLocationListener);
            locationManager.removeUpdates(themeActivity.networkLocationListener);
            ThemeActivity.this.updateSunTime(location, false);
        }

        @Override
        public final void onProviderDisabled(String str) {
        }

        @Override
        public final void onProviderEnabled(String str) {
        }

        @Override
        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    public final class InnerAccentView extends View {
        public ObjectAnimator checkAnimator;
        public boolean checked;
        public float checkedState;
        public Theme.ThemeAccent currentAccent;
        public Theme.ThemeInfo currentTheme;
        public final Paint paint;

        public InnerAccentView(Context context) {
            super(context);
            this.paint = new Paint(1);
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateCheckedState(false);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float fDp = AndroidUtilities.dp(20.0f);
            float measuredWidth = getMeasuredWidth() * 0.5f;
            float measuredHeight = getMeasuredHeight() * 0.5f;
            Paint paint = this.paint;
            paint.setColor(this.currentAccent.accentColor);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            paint.setAlpha(Math.round(this.checkedState * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, fDp - (paint.getStrokeWidth() * 0.5f), paint);
            paint.setAlpha(255);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(measuredWidth, measuredHeight, fDp - (AndroidUtilities.dp(5.0f) * this.checkedState), paint);
            if (this.checkedState != 0.0f) {
                paint.setColor(-1);
                paint.setAlpha(Math.round(this.checkedState * 255.0f));
                canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(2.0f), paint);
                canvas.drawCircle(measuredWidth - (AndroidUtilities.dp(7.0f) * this.checkedState), measuredHeight, AndroidUtilities.dp(2.0f), paint);
                canvas.drawCircle((AndroidUtilities.dp(7.0f) * this.checkedState) + measuredWidth, measuredHeight, AndroidUtilities.dp(2.0f), paint);
            }
            int i = this.currentAccent.myMessagesAccentColor;
            if (i == 0 || this.checkedState == 1.0f) {
                return;
            }
            paint.setColor(i);
            canvas.drawCircle(measuredWidth, measuredHeight, (1.0f - this.checkedState) * AndroidUtilities.dp(8.0f), paint);
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(LocaleController.getString("ColorPickerMainColor", R.string.ColorPickerMainColor));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setChecked(this.checked);
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824));
        }

        public final void updateCheckedState(boolean z) {
            this.checked = this.currentTheme.currentAccentId == this.currentAccent.id;
            ObjectAnimator objectAnimator = this.checkAnimator;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (!z) {
                this.checkedState = this.checked ? 1.0f : 0.0f;
                invalidate();
            } else {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "checkedState", this.checked ? 1.0f : 0.0f);
                this.checkAnimator = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(200L);
                this.checkAnimator.start();
            }
        }
    }

    public final class InnerCustomAccentView extends View {
        public static final int $r8$clinit = 0;
        public int[] colors;
        public final Paint paint;

        public InnerCustomAccentView(Context context) {
            super(context);
            this.paint = new Paint(1);
            this.colors = new int[7];
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float measuredWidth = getMeasuredWidth() * 0.5f;
            float measuredHeight = getMeasuredHeight() * 0.5f;
            float fDp = AndroidUtilities.dp(5.0f);
            float fDp2 = AndroidUtilities.dp(20.0f) - fDp;
            Paint paint = this.paint;
            paint.setStyle(Paint.Style.FILL);
            int i = 0;
            paint.setColor(this.colors[0]);
            canvas.drawCircle(measuredWidth, measuredHeight, fDp, paint);
            double d = 0.0d;
            while (i < 6) {
                float fSin = (((float) Math.sin(d)) * fDp2) + measuredWidth;
                float fCos = measuredHeight - (((float) Math.cos(d)) * fDp2);
                i++;
                paint.setColor(this.colors[i]);
                canvas.drawCircle(fSin, fCos, fDp, paint);
                d += 1.0471975511965976d;
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setText(LocaleController.getString("ColorPickerMainColor", R.string.ColorPickerMainColor));
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setEnabled(true);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(62.0f), 1073741824));
        }
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public boolean first = true;
        public final Context mContext;

        public final class AnonymousClass1 extends BrightnessControlCell {
            public AnonymousClass1(Context context) {
                super(context);
            }
        }

        public final class AnonymousClass5 extends ThemePreviewMessagesCell {
            @Override
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        }

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return ThemeActivity.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            ThemeActivity themeActivity = ThemeActivity.this;
            if (i == themeActivity.scheduleFromRow || i == themeActivity.distanceRow || i == themeActivity.scheduleToRow || i == themeActivity.scheduleUpdateLocationRow || i == themeActivity.contactsReimportRow || i == themeActivity.contactsSortRow || i == themeActivity.bluetoothScoRow || i == themeActivity.searchEngineRow) {
                return 1;
            }
            if (i == themeActivity.automaticBrightnessInfoRow || i == themeActivity.scheduleLocationInfoRow || i == themeActivity.swipeGestureInfoRow || i == themeActivity.stickersInfoRow || i == themeActivity.liteModeInfoRow) {
                return 2;
            }
            if (i == themeActivity.themeInfoRow || i == themeActivity.nightTypeInfoRow || i == themeActivity.scheduleFromToInfoRow || i == themeActivity.settings2Row || i == themeActivity.newThemeInfoRow || i == themeActivity.chatListInfoRow || i == themeActivity.bubbleRadiusInfoRow || i == themeActivity.saveToGallerySectionRow || i == themeActivity.appIconShadowRow || i == themeActivity.lastShadowRow || i == themeActivity.stickersSectionRow || i == themeActivity.mediaSoundSectionRow || i == themeActivity.otherSectionRow) {
                return 3;
            }
            if (i == themeActivity.nightDisabledRow || i == themeActivity.nightScheduledRow || i == themeActivity.nightAutomaticRow || i == themeActivity.nightSystemDefaultRow) {
                return 4;
            }
            if (i == themeActivity.scheduleHeaderRow || i == themeActivity.automaticHeaderRow || i == themeActivity.preferedHeaderRow || i == themeActivity.settingsRow || i == themeActivity.themeHeaderRow || i == themeActivity.textSizeHeaderRow || i == themeActivity.chatListHeaderRow || i == themeActivity.bubbleRadiusHeaderRow || i == themeActivity.swipeGestureHeaderRow || i == themeActivity.selectThemeHeaderRow || i == themeActivity.appIconHeaderRow || i == themeActivity.mediaSoundHeaderRow || i == themeActivity.otherHeaderRow) {
                return 5;
            }
            if (i == themeActivity.automaticBrightnessRow) {
                return 6;
            }
            if (i == themeActivity.scheduleLocationRow || i == themeActivity.sendByEnterRow || i == themeActivity.raiseToSpeakRow || i == themeActivity.raiseToListenRow || i == themeActivity.pauseOnRecordRow || i == themeActivity.directShareRow || i == themeActivity.chatBlurRow || i == themeActivity.pauseOnMediaRow || i == themeActivity.nextMediaTapRow || i == themeActivity.sensitiveContentRow) {
                return 7;
            }
            if (i == themeActivity.textSizeRow) {
                return 8;
            }
            if (i == themeActivity.chatListRow) {
                return 9;
            }
            if (i == themeActivity.nightThemeRow || i == themeActivity.browserRow) {
                return 10;
            }
            if (i == themeActivity.themeListRow) {
                return 11;
            }
            if (i == themeActivity.themeAccentListRow) {
                return 12;
            }
            if (i == themeActivity.bubbleRadiusRow) {
                return 13;
            }
            if (i == themeActivity.backgroundRow || i == themeActivity.editThemeRow || i == themeActivity.createNewThemeRow || i == themeActivity.liteModeRow || i == themeActivity.stickersRow) {
                return 14;
            }
            if (i == themeActivity.swipeGestureRow) {
                return 15;
            }
            if (i == themeActivity.themePreviewRow) {
                return 16;
            }
            if (i == themeActivity.themeListRow2) {
                return 17;
            }
            if (i == themeActivity.saveToGalleryOption1Row || i == themeActivity.saveToGalleryOption2Row) {
                return 19;
            }
            if (i == themeActivity.appIconSelectorRow) {
                return 20;
            }
            return i == themeActivity.changeUserColor ? 21 : 1;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return i == 0 || i == 1 || i == 4 || i == 7 || i == 10 || i == 11 || i == 12 || i == 14 || i == 18 || i == 20 || i == 21;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            int i2 = viewHolder.mItemViewType;
            ThemeActivity themeActivity = ThemeActivity.this;
            String name = "";
            View view = viewHolder.itemView;
            if (i2 == 1) {
                TextSettingsCell textSettingsCell = (TextSettingsCell) view;
                if (i == themeActivity.nightThemeRow) {
                    if (Theme.selectedAutoNightType == 0 || Theme.currentNightTheme == null) {
                        textSettingsCell.setTextAndValue(LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.AutoNightThemeOff), false, false);
                        return;
                    }
                    String string = LocaleController.getString(R.string.AutoNightTheme);
                    Theme.ThemeInfo themeInfo = Theme.currentNightTheme;
                    if (themeInfo != null) {
                        name = themeInfo.getName();
                        if (name.toLowerCase().endsWith(".attheme")) {
                            name = name.substring(0, name.lastIndexOf(46));
                        }
                    }
                    textSettingsCell.setTextAndValue(string, name, false, false);
                    return;
                }
                if (i == themeActivity.scheduleFromRow) {
                    int i3 = Theme.autoNightDayStartTime;
                    int i4 = i3 / 60;
                    textSettingsCell.setTextAndValue(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3 - (i4 * 60))), false, true);
                    return;
                }
                if (i == themeActivity.scheduleToRow) {
                    int i5 = Theme.autoNightDayEndTime;
                    int i6 = i5 / 60;
                    textSettingsCell.setTextAndValue(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i6), Integer.valueOf(i5 - (i6 * 60))), false, false);
                    return;
                }
                if (i == themeActivity.scheduleUpdateLocationRow) {
                    textSettingsCell.setTextAndValue(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), Theme.autoNightCityName, false, false);
                    return;
                }
                if (i == themeActivity.contactsSortRow) {
                    int i7 = MessagesController.getGlobalMainSettings().getInt("sortContactsBy", 0);
                    textSettingsCell.setTextAndValue(LocaleController.getString("SortBy", R.string.SortBy), i7 == 0 ? LocaleController.getString("Default", R.string.Default) : i7 == 1 ? LocaleController.getString("FirstName", R.string.SortFirstName) : LocaleController.getString("LastName", R.string.SortLastName), false, true);
                    return;
                }
                if (i == themeActivity.contactsReimportRow) {
                    textSettingsCell.setText(LocaleController.getString("ImportContacts", R.string.ImportContacts), true);
                    return;
                }
                if (i == themeActivity.distanceRow) {
                    int i8 = SharedConfig.distanceSystemType;
                    textSettingsCell.setTextAndValue(LocaleController.getString("DistanceUnits", R.string.DistanceUnits), i8 == 0 ? LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic) : i8 == 1 ? LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers) : LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles), themeActivity.updateDistance, themeActivity.otherSectionRow >= 0);
                    themeActivity.updateDistance = false;
                    return;
                }
                if (i == themeActivity.searchEngineRow) {
                    textSettingsCell.setTextAndValue(LocaleController.getString(R.string.SearchEngine), SearchEngine.getCurrent().name, themeActivity.updateSearchEngine, false);
                    return;
                } else {
                    if (i == themeActivity.bluetoothScoRow) {
                        textSettingsCell.setTextAndValue(LocaleController.getString(R.string.MicrophoneForVoiceMessages), LocaleController.getString(SharedConfig.recordViaSco ? R.string.MicrophoneForVoiceMessagesSco : R.string.MicrophoneForVoiceMessagesBuiltIn), themeActivity.updateRecordViaSco, false);
                        themeActivity.updateRecordViaSco = false;
                        return;
                    }
                    return;
                }
            }
            if (i2 == 2) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                textInfoPrivacyCell.setFixedSize(0);
                if (i == themeActivity.automaticBrightnessInfoRow) {
                    textInfoPrivacyCell.setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (Theme.autoNightBrighnessThreshold * 100.0f))));
                    return;
                }
                if (i == themeActivity.scheduleLocationInfoRow) {
                    int i9 = Theme.autoNightSunriseTime;
                    int i10 = i9 / 60;
                    String str = String.format("%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i9 - (i10 * 60)));
                    int i11 = Theme.autoNightSunsetTime;
                    int i12 = i11 / 60;
                    textInfoPrivacyCell.setText(LocaleController.formatString("AutoNightUpdateLocationInfo", R.string.AutoNightUpdateLocationInfo, String.format("%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11 - (i12 * 60))), str));
                    return;
                }
                if (i == themeActivity.swipeGestureInfoRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString("ChatListSwipeGestureInfo", R.string.ChatListSwipeGestureInfo));
                    return;
                } else if (i == themeActivity.liteModeInfoRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString("LiteModeInfo", R.string.LiteModeInfo));
                    return;
                } else {
                    textInfoPrivacyCell.setFixedSize(12);
                    textInfoPrivacyCell.setText("");
                    return;
                }
            }
            if (i2 == 4) {
                ThemeTypeCell themeTypeCell = (ThemeTypeCell) view;
                if (i == themeActivity.nightDisabledRow) {
                    String string2 = LocaleController.getString("AutoNightDisabled", R.string.AutoNightDisabled);
                    boolean z2 = Theme.selectedAutoNightType == 0;
                    themeTypeCell.textView.setText(string2);
                    themeTypeCell.checkImage.setVisibility(z2 ? 0 : 4);
                    themeTypeCell.needDivider = true;
                    return;
                }
                if (i == themeActivity.nightScheduledRow) {
                    String string3 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                    boolean z3 = Theme.selectedAutoNightType == 1;
                    themeTypeCell.textView.setText(string3);
                    themeTypeCell.checkImage.setVisibility(z3 ? 0 : 4);
                    themeTypeCell.needDivider = true;
                    return;
                }
                if (i == themeActivity.nightAutomaticRow) {
                    String string4 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                    boolean z4 = Theme.selectedAutoNightType == 2;
                    z = themeActivity.nightSystemDefaultRow != -1;
                    themeTypeCell.textView.setText(string4);
                    themeTypeCell.checkImage.setVisibility(z4 ? 0 : 4);
                    themeTypeCell.needDivider = z;
                    return;
                }
                if (i == themeActivity.nightSystemDefaultRow) {
                    String string5 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                    z = Theme.selectedAutoNightType == 3;
                    themeTypeCell.textView.setText(string5);
                    themeTypeCell.checkImage.setVisibility(z ? 0 : 4);
                    themeTypeCell.needDivider = false;
                    return;
                }
                return;
            }
            if (i2 == 5) {
                HeaderCell headerCell = (HeaderCell) view;
                if (i == themeActivity.scheduleHeaderRow) {
                    headerCell.setText(LocaleController.getString("AutoNightSchedule", R.string.AutoNightSchedule));
                    return;
                }
                if (i == themeActivity.automaticHeaderRow) {
                    headerCell.setText(LocaleController.getString("AutoNightBrightness", R.string.AutoNightBrightness));
                    return;
                }
                if (i == themeActivity.preferedHeaderRow) {
                    headerCell.setText(LocaleController.getString("AutoNightPreferred", R.string.AutoNightPreferred));
                    return;
                }
                if (i == themeActivity.settingsRow) {
                    headerCell.setText(LocaleController.getString("SETTINGS", R.string.SETTINGS));
                    return;
                }
                if (i == themeActivity.themeHeaderRow) {
                    if (themeActivity.currentType == 3) {
                        headerCell.setText(LocaleController.getString("BuildMyOwnTheme", R.string.BuildMyOwnTheme));
                        return;
                    } else {
                        headerCell.setText(LocaleController.getString("ColorTheme", R.string.ColorTheme));
                        return;
                    }
                }
                if (i == themeActivity.textSizeHeaderRow) {
                    headerCell.setText(LocaleController.getString("TextSizeHeader", R.string.TextSizeHeader));
                    return;
                }
                if (i == themeActivity.chatListHeaderRow) {
                    headerCell.setText(LocaleController.getString("ChatList", R.string.ChatList));
                    return;
                }
                if (i == themeActivity.bubbleRadiusHeaderRow) {
                    headerCell.setText(LocaleController.getString("BubbleRadius", R.string.BubbleRadius));
                    return;
                }
                if (i == themeActivity.swipeGestureHeaderRow) {
                    headerCell.setText(LocaleController.getString("ChatListSwipeGesture", R.string.ChatListSwipeGesture));
                    return;
                }
                if (i == themeActivity.selectThemeHeaderRow) {
                    headerCell.setText(LocaleController.getString("SelectTheme", R.string.SelectTheme));
                    return;
                }
                if (i == themeActivity.appIconHeaderRow) {
                    headerCell.setText(LocaleController.getString(R.string.AppIcon));
                    return;
                } else if (i == themeActivity.otherHeaderRow) {
                    headerCell.setText(LocaleController.getString("OtherSettings", R.string.OtherSettings));
                    return;
                } else {
                    if (i == themeActivity.mediaSoundHeaderRow) {
                        headerCell.setText(LocaleController.getString("MediaAndSoundSettings", R.string.MediaAndSoundSettings));
                        return;
                    }
                    return;
                }
            }
            if (i2 == 6) {
                ((BrightnessControlCell) view).setProgress(Theme.autoNightBrighnessThreshold);
                return;
            }
            if (i2 == 7) {
                TextCheckCell textCheckCell = (TextCheckCell) view;
                if (i == themeActivity.scheduleLocationRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("AutoNightLocation", R.string.AutoNightLocation), Theme.autoNightScheduleByLocation, true);
                    return;
                }
                if (i == themeActivity.enableAnimationsRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("EnableAnimations", R.string.EnableAnimations), MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), true);
                    return;
                }
                if (i == themeActivity.sendByEnterRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("SendByEnter", R.string.SendByEnter), MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false), true);
                    return;
                }
                if (i == themeActivity.raiseToSpeakRow) {
                    textCheckCell.setTextAndValueAndCheck(LocaleController.getString("RaiseToSpeak", R.string.RaiseToSpeak), LocaleController.getString("RaiseToSpeakInfo", R.string.RaiseToSpeakInfo), SharedConfig.raiseToSpeak, true, true);
                    return;
                }
                if (i == themeActivity.raiseToListenRow) {
                    textCheckCell.setTextAndValueAndCheck(LocaleController.getString("RaiseToListen", R.string.RaiseToListen), LocaleController.getString("RaiseToListenInfo", R.string.RaiseToListenInfo), SharedConfig.raiseToListen, true, true);
                    return;
                }
                if (i == themeActivity.nextMediaTapRow) {
                    textCheckCell.setTextAndValueAndCheck(LocaleController.getString("NextMediaTap", R.string.NextMediaTap), LocaleController.getString("NextMediaTapInfo", R.string.NextMediaTapInfo), SharedConfig.nextMediaTap, true, true);
                    return;
                }
                if (i == themeActivity.pauseOnRecordRow) {
                    textCheckCell.setTextAndValueAndCheck(LocaleController.getString(R.string.PauseMusicOnRecord), LocaleController.getString("PauseMusicOnRecordInfo", R.string.PauseMusicOnRecordInfo), SharedConfig.pauseMusicOnRecord, true, true);
                    return;
                }
                if (i == themeActivity.pauseOnMediaRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PauseMusicOnMedia), SharedConfig.pauseMusicOnMedia, true);
                    return;
                }
                if (i == themeActivity.directShareRow) {
                    textCheckCell.setTextAndValueAndCheck(LocaleController.getString("DirectShare", R.string.DirectShare), LocaleController.getString("DirectShareInfo", R.string.DirectShareInfo), SharedConfig.directShare, false, true);
                    return;
                } else if (i == themeActivity.sensitiveContentRow) {
                    textCheckCell.setTextAndValueAndCheck(LocaleController.getString(R.string.ShowSensitiveContent), LocaleController.getString(R.string.ShowSensitiveContentInfo), themeActivity.getMessagesController().showSensitiveContent(), true, true);
                    return;
                } else {
                    if (i == themeActivity.chatBlurRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString("BlurInChat", R.string.BlurInChat), SharedConfig.chatBlurEnabled(), true);
                        return;
                    }
                    return;
                }
            }
            if (i2 == 14) {
                TextCell textCell = (TextCell) view;
                textCell.heightDp = 48;
                if (i == themeActivity.backgroundRow) {
                    textCell.setSubtitle(null);
                    int i13 = Theme.key_windowBackgroundWhiteBlueText4;
                    textCell.setColors(i13, i13);
                    textCell.setTextAndIcon(R.drawable.msg_background, LocaleController.getString(R.string.ChangeChatBackground), themeActivity.changeUserColor >= 0);
                    return;
                }
                if (i == themeActivity.editThemeRow) {
                    textCell.setSubtitle(null);
                    int i14 = Theme.key_windowBackgroundWhiteBlueText4;
                    textCell.setColors(i14, i14);
                    textCell.setTextAndIcon(R.drawable.msg_theme, (CharSequence) LocaleController.getString(R.string.EditCurrentTheme), true);
                    return;
                }
                if (i == themeActivity.createNewThemeRow) {
                    textCell.setSubtitle(null);
                    int i15 = Theme.key_windowBackgroundWhiteBlueText4;
                    textCell.setColors(i15, i15);
                    textCell.setTextAndIcon(R.drawable.msg_colors, (CharSequence) LocaleController.getString(R.string.CreateNewTheme), false);
                    return;
                }
                if (i == themeActivity.liteModeRow) {
                    textCell.setColors(Theme.key_dialogIcon, Theme.key_windowBackgroundWhiteBlackText);
                    textCell.setTextAndIcon(R.drawable.msg2_animations, (CharSequence) LocaleController.getString(R.string.LiteMode), true);
                    textCell.setSubtitle(LocaleController.getString(R.string.LiteModeInfo));
                    textCell.heightDp = 60;
                    textCell.offsetFromImage = 64;
                    textCell.imageLeft = 20;
                    return;
                }
                if (i == themeActivity.stickersRow) {
                    textCell.setColors(Theme.key_dialogIcon, Theme.key_windowBackgroundWhiteBlackText);
                    textCell.setTextAndIcon(R.drawable.msg2_sticker, (CharSequence) LocaleController.getString(R.string.StickersName), false);
                    textCell.setSubtitle(LocaleController.getString(R.string.StickersNameInfo2));
                    textCell.offsetFromImage = 64;
                    textCell.heightDp = 60;
                    textCell.imageLeft = 20;
                    return;
                }
                return;
            }
            if (i2 == 17) {
                ((DefaultThemesPreviewCell) view).updateDayNightMode();
                return;
            }
            if (i2 == 19) {
                RadioButtonCell radioButtonCell = (RadioButtonCell) view;
                if (i == themeActivity.saveToGalleryOption1Row) {
                    radioButtonCell.setTextAndValue("save media only from peer chats", "", true, false);
                    return;
                } else {
                    radioButtonCell.setTextAndValue("save media from all chats", "", true, false);
                    return;
                }
            }
            if (i2 == 21) {
                ((PeerColorActivity.ChangeNameColorCell) view).set(themeActivity.getUserConfig().getCurrentUser());
                return;
            }
            switch (i2) {
                case 10:
                    NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) view;
                    if (i == themeActivity.nightThemeRow) {
                        boolean z5 = Theme.selectedAutoNightType != 0;
                        if (z5) {
                            Theme.ThemeInfo themeInfo2 = Theme.currentNightTheme;
                            if (themeInfo2 != null) {
                                name = themeInfo2.getName();
                                if (name.toLowerCase().endsWith(".attheme")) {
                                    name = name.substring(0, name.lastIndexOf(46));
                                }
                            }
                        } else {
                            name = LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                        }
                        if (z5) {
                            int i16 = Theme.selectedAutoNightType;
                            name = zzit.m(i16 == 1 ? LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled) : i16 == 3 ? LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault) : LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive), " ", name);
                        }
                        notificationsCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), name, R.drawable.menu_night_mode_24, z5, 0, false, true, false);
                    } else if (i == themeActivity.browserRow) {
                        notificationsCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString(R.string.InappBrowser), LocaleController.getString(R.string.InappBrowserInfo), R.drawable.msg2_language, themeActivity.getMessagesController().isWebBrowserInAppEnabled(), 0, false, true, false);
                    }
                    break;
                case 11:
                    if (this.first) {
                        themeActivity.themesHorizontalListCell.scrollToCurrentTheme(themeActivity.listView.getMeasuredWidth());
                        this.first = false;
                    }
                    break;
                case 12:
                    RecyclerListView recyclerListView = (RecyclerListView) view;
                    ThemeAccentsListAdapter themeAccentsListAdapter = (ThemeAccentsListAdapter) recyclerListView.getAdapter();
                    themeAccentsListAdapter.notifyDataSetChanged();
                    int iIndexOf = themeAccentsListAdapter.themeAccents.indexOf(themeAccentsListAdapter.currentTheme.getAccent(false));
                    if (iIndexOf == -1) {
                        iIndexOf = themeAccentsListAdapter.getItemCount() - 1;
                    }
                    if (iIndexOf != -1) {
                        ((LinearLayoutManager) recyclerListView.getLayoutManager()).scrollToPositionWithOffset(iIndexOf, (themeActivity.listView.getMeasuredWidth() / 2) - AndroidUtilities.dp(42.0f));
                    }
                    break;
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View notificationsCheckCell;
            View textSettingsCell;
            View changeNameColorCell;
            ThemeActivity themeActivity = ThemeActivity.this;
            Theme.ResourcesProvider resourcesProvider = null;
            Context context = this.mContext;
            switch (i) {
                case 1:
                    textSettingsCell = new TextSettingsCell(context, 0, null);
                    break;
                case 2:
                    textSettingsCell = new TextInfoPrivacyCell(context, 24, null);
                    break;
                case 3:
                    textSettingsCell = new ShadowSectionCell(context, (Object) null);
                    break;
                case 4:
                    textSettingsCell = new ThemeTypeCell(context);
                    break;
                case 5:
                    textSettingsCell = new HeaderCell(context);
                    break;
                case 6:
                    textSettingsCell = new AnonymousClass1(context);
                    break;
                case 7:
                    textSettingsCell = new TextCheckCell(context);
                    break;
                case 8:
                    textSettingsCell = themeActivity.new TextSizeCell(context);
                    break;
                case 9:
                    textSettingsCell = new PhotoViewer.AnonymousClass35(context);
                    break;
                case 10:
                    notificationsCheckCell = new NotificationsCheckCell(this.mContext, 21, 60, true, null);
                    textSettingsCell = notificationsCheckCell;
                    break;
                case 11:
                    this.first = true;
                    ThemeSetUrlActivity.AnonymousClass4 anonymousClass4 = new ThemeSetUrlActivity.AnonymousClass4(this, this.mContext, themeActivity, themeActivity.currentType, themeActivity.defaultThemes, themeActivity.darkThemes);
                    themeActivity.themesHorizontalListCell = anonymousClass4;
                    anonymousClass4.setDrawDivider(themeActivity.hasThemeAccents);
                    themeActivity.themesHorizontalListCell.setFocusable(false);
                    ThemeSetUrlActivity.AnonymousClass4 anonymousClass5 = themeActivity.themesHorizontalListCell;
                    anonymousClass5.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(148.0f)));
                    textSettingsCell = anonymousClass5;
                    break;
                case 12:
                    MessageSeenView.AnonymousClass1 anonymousClass1 = new MessageSeenView.AnonymousClass1(context, 1, resourcesProvider);
                    anonymousClass1.setFocusable(false);
                    anonymousClass1.setItemAnimator(null);
                    anonymousClass1.setLayoutAnimation(null);
                    anonymousClass1.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
                    anonymousClass1.setClipToPadding(false);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
                    linearLayoutManager.setOrientation(0);
                    anonymousClass1.setLayoutManager(linearLayoutManager);
                    ThemeAccentsListAdapter themeAccentsListAdapter = themeActivity.new ThemeAccentsListAdapter(context);
                    anonymousClass1.setAdapter(themeAccentsListAdapter);
                    anonymousClass1.setOnItemClickListener(new LiveCommentsView$$ExternalSyntheticLambda6(this, themeAccentsListAdapter, anonymousClass1, 5));
                    anonymousClass1.setOnItemLongClickListener(new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(28, this, themeAccentsListAdapter));
                    anonymousClass1.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(62.0f)));
                    changeNameColorCell = anonymousClass1;
                    textSettingsCell = changeNameColorCell;
                    break;
                case 13:
                    textSettingsCell = themeActivity.new BubbleRadiusCell(context);
                    break;
                case 14:
                case 18:
                default:
                    textSettingsCell = new TextCell(context);
                    break;
                case 15:
                    textSettingsCell = new SwipeGestureSettingsView(context, ((BaseFragment) themeActivity).currentAccount);
                    break;
                case 16:
                    notificationsCheckCell = new AnonymousClass5(this.mContext, ((BaseFragment) themeActivity).parentLayout, 0, 0L, null);
                    notificationsCheckCell.setImportantForAccessibility(4);
                    textSettingsCell = notificationsCheckCell;
                    break;
                case 17:
                    DefaultThemesPreviewCell defaultThemesPreviewCell = new DefaultThemesPreviewCell(themeActivity.currentType, context, themeActivity);
                    defaultThemesPreviewCell.setFocusable(false);
                    defaultThemesPreviewCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    textSettingsCell = defaultThemesPreviewCell;
                    break;
                case 19:
                    textSettingsCell = new RadioButtonCell(context, false);
                    break;
                case 20:
                    textSettingsCell = new AppIconsSelectorCell(((BaseFragment) themeActivity).currentAccount, context, themeActivity);
                    break;
                case 21:
                    changeNameColorCell = new PeerColorActivity.ChangeNameColorCell(((BaseFragment) themeActivity).currentAccount, 0L, this.mContext, themeActivity.getResourceProvider());
                    textSettingsCell = changeNameColorCell;
                    break;
            }
            return new RecyclerListView.Holder(textSettingsCell);
        }

        @Override
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.mItemViewType == 4) {
                ((ThemeTypeCell) viewHolder.itemView).setTypeChecked(viewHolder.getAdapterPosition() == Theme.selectedAutoNightType);
            }
        }
    }

    public final class TextSizeCell extends FrameLayout {
        public final int endFontSize;
        public int lastWidth;
        public final ThemePreviewMessagesCell messagesCell;
        public final SeekBarView sizeBar;
        public final int startFontSize;
        public final TextPaint textPaint;

        public TextSizeCell(Context context) {
            super(context);
            this.startFontSize = 12;
            this.endFontSize = 30;
            setWillNotDraw(false);
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SeekBarView seekBarView = new SeekBarView(context, null, false);
            this.sizeBar = seekBarView;
            seekBarView.setReportChanges(true);
            seekBarView.setSeparatorsCount(19);
            seekBarView.setDelegate(new PollItemMenu.AnonymousClass6(this, 9));
            seekBarView.setImportantForAccessibility(2);
            addView(seekBarView, LayoutHelper.createFrame(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
            ThemePreviewMessagesCell themePreviewMessagesCell = new ThemePreviewMessagesCell(context, ((BaseFragment) ThemeActivity.this).parentLayout, 0, 0L, null);
            this.messagesCell = themePreviewMessagesCell;
            themePreviewMessagesCell.setImportantForAccessibility(4);
            addView(themePreviewMessagesCell, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 53.0f, 0.0f, 0.0f));
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            this.messagesCell.invalidate();
            this.sizeBar.invalidate();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            TextPaint textPaint = this.textPaint;
            textPaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
            canvas.drawText("" + SharedConfig.fontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            this.sizeBar.getSeekBarAccessibilityDelegate().onInitializeAccessibilityNodeInfoInternal(this, accessibilityNodeInfo);
        }

        @Override
        public final void onMeasure(int i, int i2) {
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
        public final boolean performAccessibilityAction(int i, Bundle bundle) {
            return super.performAccessibilityAction(i, bundle) || this.sizeBar.getSeekBarAccessibilityDelegate().performAccessibilityActionInternal(this, i, bundle);
        }
    }

    public final class ThemeAccentsListAdapter extends RecyclerListView.SelectionAdapter {
        public Theme.ThemeInfo currentTheme;
        public final Context mContext;
        public ArrayList themeAccents;

        public ThemeAccentsListAdapter(Context context) {
            this.mContext = context;
            notifyDataSetChanged();
        }

        @Override
        public final int getItemCount() {
            if (this.themeAccents.isEmpty()) {
                return 0;
            }
            return this.themeAccents.size() + 1;
        }

        @Override
        public final int getItemViewType(int i) {
            return i == getItemCount() - 1 ? 1 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public final void notifyDataSetChanged() {
            Theme.ThemeInfo themeInfo;
            if (ThemeActivity.this.currentType == 1) {
                themeInfo = Theme.currentNightTheme;
            } else {
                themeInfo = Theme.currentDayTheme;
                if (themeInfo == null) {
                    themeInfo = Theme.defaultTheme;
                }
            }
            this.currentTheme = themeInfo;
            this.themeAccents = new ArrayList(this.currentTheme.themeAccents);
            this.mObservable.notifyChanged();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = getItemViewType(i);
            View view = viewHolder.itemView;
            if (itemViewType == 0) {
                InnerAccentView innerAccentView = (InnerAccentView) view;
                Theme.ThemeInfo themeInfo = this.currentTheme;
                Theme.ThemeAccent themeAccent = (Theme.ThemeAccent) this.themeAccents.get(i);
                innerAccentView.currentTheme = themeInfo;
                innerAccentView.currentAccent = themeAccent;
                innerAccentView.updateCheckedState(false);
                return;
            }
            if (itemViewType != 1) {
                return;
            }
            InnerCustomAccentView innerCustomAccentView = (InnerCustomAccentView) view;
            Theme.ThemeInfo themeInfo2 = this.currentTheme;
            int i2 = InnerCustomAccentView.$r8$clinit;
            innerCustomAccentView.getClass();
            if (themeInfo2.defaultAccentCount >= 8) {
                innerCustomAccentView.colors = new int[]{themeInfo2.getAccentColor(6), themeInfo2.getAccentColor(4), themeInfo2.getAccentColor(7), themeInfo2.getAccentColor(2), themeInfo2.getAccentColor(0), themeInfo2.getAccentColor(5), themeInfo2.getAccentColor(3)};
            } else {
                innerCustomAccentView.colors = new int[7];
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Context context = this.mContext;
            return i != 0 ? new RecyclerListView.Holder(new InnerCustomAccentView(context)) : new RecyclerListView.Holder(new InnerAccentView(context));
        }
    }

    public ThemeActivity(int i) {
        super(null);
        this.darkThemes = new ArrayList();
        this.defaultThemes = new ArrayList();
        this.gpsLocationListener = new GpsLocationListener();
        this.networkLocationListener = new GpsLocationListener();
        this.currentType = i;
        updateRows$8(true);
    }

    public static boolean access$1000(ThemeActivity themeActivity, int i, boolean z) {
        if (i == SharedConfig.bubbleRadius) {
            return false;
        }
        SharedConfig.bubbleRadius = i;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putInt("bubbleRadius", SharedConfig.bubbleRadius);
        editorEdit.commit();
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = themeActivity.listView.findViewHolderForAdapterPosition(themeActivity.textSizeRow);
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
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = themeActivity.listView.findViewHolderForAdapterPosition(themeActivity.bubbleRadiusRow);
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
        themeActivity.updateMenuItem();
        return true;
    }

    public static boolean access$500(ThemeActivity themeActivity, int i) {
        if (i != SharedConfig.fontSize) {
            SharedConfig.fontSize = i;
            SharedConfig.fontSizeIsDefault = false;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putInt("fons_size", SharedConfig.fontSize);
                editorEdit.commit();
                Theme.createCommonMessageResources();
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = themeActivity.listView.findViewHolderForAdapterPosition(themeActivity.textSizeRow);
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
                themeActivity.updateMenuItem();
                return true;
            }
        }
        return false;
    }

    public static void verifyAge(final int i, final Context context, final Utilities.Callback callback, final Theme.ResourcesProvider resourcesProvider) {
        final MessagesController messagesController = MessagesController.getInstance(i);
        final String str = messagesController.verifyAgeBotUsername;
        String str2 = messagesController.verifyAgeCountry;
        final int i2 = messagesController.verifyAgeMin;
        if (TextUtils.isEmpty(str) || !messagesController.config.needAgeVideoVerification.get()) {
            callback.run(Boolean.TRUE);
            return;
        }
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, resourcesProvider, false, false);
        LinearLayout linearLayoutM = zzkf.m(context, 1);
        linearLayoutM.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        linearLayoutM.setClipChildren(false);
        linearLayoutM.setClipToPadding(false);
        bottomSheetM.customView = linearLayoutM;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.filled_verify_age);
        frameLayout.addView(imageView, LayoutHelper.createFrame(50, 50, 17));
        linearLayoutM.addView(frameLayout, LayoutHelper.createLinear(80, 80, 1, 0, 20, 0, 8));
        int i3 = Theme.key_dialogTextBlack;
        TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, i3, true, resourcesProvider);
        zzkg.m(R.string.AgeVerificationTitle, textViewMakeTextView, 17);
        linearLayoutM.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 7, 24, 8, 24, 8));
        TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, i3, false, resourcesProvider);
        textViewMakeTextView2.setText(AndroidUtilities.replaceTags(LocaleController.getString("AgeVerificationText" + str2)));
        textViewMakeTextView2.setGravity(17);
        linearLayoutM.addView(textViewMakeTextView2, LayoutHelper.createLinear(-1, -2, 7, 24, 0, 24, 0));
        final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
        buttonWithCounterView.setText(LocaleController.getString(R.string.AgeVerificationButton), false, true);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                final ButtonWithCounterView buttonWithCounterView2 = buttonWithCounterView;
                if (buttonWithCounterView2.loading) {
                    return;
                }
                buttonWithCounterView2.setLoading(true);
                int i4 = R.raw.permission_request_camera;
                int i5 = R.string.AgeVerificationNeedCameraPermission;
                final MessagesController messagesController2 = messagesController;
                final Utilities.Callback callback2 = callback;
                final BottomSheet[] bottomSheetArr = bottomSheetArr;
                final String str3 = str;
                final int i6 = i;
                final Context context2 = context;
                final Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                final int i7 = i2;
                PermissionRequest.ensureEitherPermission(i4, i5, new String[]{"android.permission.CAMERA"}, new String[]{"android.permission.CAMERA"}, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        final ButtonWithCounterView buttonWithCounterView3 = buttonWithCounterView2;
                        if (!zBooleanValue) {
                            buttonWithCounterView3.setLoading(false);
                            return;
                        }
                        final MessagesController messagesController3 = messagesController2;
                        UserNameResolver userNameResolver = messagesController3.getUserNameResolver();
                        final Utilities.Callback callback3 = callback2;
                        final BottomSheet[] bottomSheetArr2 = bottomSheetArr;
                        final int i8 = i6;
                        final Context context3 = context2;
                        final Theme.ResourcesProvider resourcesProvider3 = resourcesProvider2;
                        final int i9 = i7;
                        userNameResolver.resolve(str3, new Consumer() {
                            @Override
                            public final void accept(Object obj2) {
                                Long l = (Long) obj2;
                                ButtonWithCounterView buttonWithCounterView4 = buttonWithCounterView3;
                                if (l == null) {
                                    buttonWithCounterView4.setLoading(false);
                                    return;
                                }
                                TLRPC.User user = messagesController3.getUser(l);
                                if (user == null) {
                                    buttonWithCounterView4.setLoading(false);
                                    return;
                                }
                                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                                if (safeLastFragment == null) {
                                    buttonWithCounterView4.setLoading(false);
                                    return;
                                }
                                WebViewRequestProps webViewRequestPropsOf = WebViewRequestProps.of(i8, l.longValue(), l.longValue(), null, null, 4, 0, 0L, null, false, null, user, 0, false, false);
                                final BotWebViewSheet botWebViewSheet = new BotWebViewSheet(context3, resourcesProvider3);
                                final Utilities.Callback callback4 = callback3;
                                final int i10 = i9;
                                ?? r6 = new Utilities.Callback4() {
                                    @Override
                                    public final void run(Object obj3, Object obj4, Object obj5, Object obj6) {
                                        boolean zBooleanValue2;
                                        Boolean bool = (Boolean) obj3;
                                        Double d = (Double) obj4;
                                        if (d != null) {
                                            zBooleanValue2 = d.doubleValue() >= ((double) i10);
                                        } else {
                                            zBooleanValue2 = bool.booleanValue();
                                        }
                                        botWebViewSheet.dismiss$1(false);
                                        callback4.run(Boolean.valueOf(zBooleanValue2));
                                        BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                                        if (!zBooleanValue2 || safeLastFragment2 == null) {
                                            return;
                                        }
                                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.AgeVerificationPassedTitle, BulletinFactory.of(safeLastFragment2), R.raw.contact_check, 36);
                                    }
                                };
                                botWebViewSheet.onVerifiedAge = r6;
                                BotWebViewSheet.AnonymousClass2 anonymousClass2 = botWebViewSheet.webViewContainer;
                                if (anonymousClass2 != 0) {
                                    anonymousClass2.setOnVerifiedAge(r6);
                                }
                                botWebViewSheet.setDefaultFullsize(true);
                                botWebViewSheet.needsContext = false;
                                botWebViewSheet.parentActivity = safeLastFragment.getParentActivity();
                                botWebViewSheet.requestWebView(safeLastFragment, webViewRequestPropsOf);
                                botWebViewSheet.show();
                                buttonWithCounterView4.setLoading(false);
                                bottomSheetArr2[0].lambda$showGiftOfferSheet$15();
                            }
                        });
                    }
                });
            }
        });
        linearLayoutM.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 7, 2, 29, 2, 14));
        bottomSheetM.show();
        final BottomSheet[] bottomSheetArr = {bottomSheetM};
        bottomSheetM.fixNavigationBar();
    }

    public final void createNewTheme() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        String string = LocaleController.getString("NewTheme", R.string.NewTheme);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.getString("CreateNewThemeAlert", R.string.CreateNewThemeAlert);
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString("CreateTheme", R.string.CreateTheme), new ThemeActivity$$ExternalSyntheticLambda6(this, 2));
        showDialog(alertDialog);
    }

    @Override
    public final View createView(Context context) {
        this.lastIsDarkTheme = !Theme.isCurrentThemeDay();
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        int i = this.currentType;
        if (i == 3) {
            this.actionBar.setTitle(LocaleController.getString("BrowseThemes", R.string.BrowseThemes));
            ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
            int i2 = R.raw.sun;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i2, SurfaceContainer$$ExternalSyntheticOutline0.m(i2, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.sunDrawable = rLottieDrawable;
            if (this.lastIsDarkTheme) {
                rLottieDrawable.setCurrentFrame(rLottieDrawable.metaData[0] - 1, true, false);
            } else {
                rLottieDrawable.setCurrentFrame(0, true, false);
            }
            RLottieDrawable rLottieDrawable2 = this.sunDrawable;
            rLottieDrawable2.playInDirectionOfCustomEndFrame = true;
            this.menuItem = actionBarMenuCreateMenu.addItem(5, rLottieDrawable2);
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
                getMessagesController().getContentSettings(new VoIPFragment$$ExternalSyntheticLambda7(this, 21));
            }
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoNightTheme));
        }
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isRightLayout) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1());
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        this.fragmentView = frameLayout;
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        zzku.m(this.listView);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setAdapter(this.listAdapter);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).delayAnimations = false;
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setOnItemClickListener(new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(27, this, context));
        if (i == 0) {
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setDurations(350L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.delayAnimations = false;
            defaultItemAnimator.mSupportsChangeAnimations = false;
            this.listView.setItemAnimator(defaultItemAnimator);
        }
        if (this.highlightSensitiveRow) {
            updateRows$8(false);
            this.highlightSensitiveRow = false;
            this.listView.scrollToPosition(ThemeActivity.this.rowCount - 1);
            AndroidUtilities.runOnUIThread(new ThemeActivity$$ExternalSyntheticLambda4(this, 0), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
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
            listAdapter2.mObservable.notifyItemRangeChanged(i4, 1, new Object());
            return;
        }
        if (i == NotificationCenter.themeListUpdated) {
            updateRows$8(true);
            return;
        }
        if (i == NotificationCenter.themeUploadedToServer) {
            Theme.ThemeInfo themeInfo = (Theme.ThemeInfo) objArr[0];
            Theme.ThemeAccent themeAccent = (Theme.ThemeAccent) objArr[1];
            if (themeInfo == this.sharingTheme && themeAccent == this.sharingAccent) {
                StringBuilder sb = new StringBuilder("https://");
                sb.append(getMessagesController().linkPrefix);
                sb.append("/addtheme/");
                sb.append((themeAccent != null ? themeAccent.info : themeInfo.info).slug);
                String string = sb.toString();
                showDialog(new ShareAlert(getParentActivity(), string, string, null));
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
            AlertDialog alertDialog3 = new AlertDialog(getParentActivity(), 3, null);
            this.sharingProgressDialog = alertDialog3;
            alertDialog3.canCacnel = true;
            showDialog(alertDialog3, new ShareActivity$$ExternalSyntheticLambda0(this, 5));
            return;
        }
        if (i != NotificationCenter.needSetDayNightTheme) {
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
                return;
            }
            return;
        }
        updateMenuItem();
        if (this.currentType != 3) {
            return;
        }
        boolean zIsCurrentThemeDay = Theme.isCurrentThemeDay();
        boolean z = !zIsCurrentThemeDay;
        if (this.lastIsDarkTheme != z) {
            this.lastIsDarkTheme = z;
            RLottieDrawable rLottieDrawable = this.sunDrawable;
            rLottieDrawable.setCustomEndFrame(!zIsCurrentThemeDay ? rLottieDrawable.metaData[0] - 1 : 0);
            this.menuItem.getIconView().playAnimation();
        }
        if (this.themeListRow2 >= 0) {
            for (int i7 = 0; i7 < this.listView.getChildCount(); i7++) {
                if (this.listView.getChildAt(i7) instanceof DefaultThemesPreviewCell) {
                    ((DefaultThemesPreviewCell) this.listView.getChildAt(i7)).updateDayNightMode();
                }
            }
        }
    }

    public final void editTheme() {
        Theme.ThemeInfo themeInfo = Theme.currentDayTheme;
        if (themeInfo == null) {
            themeInfo = Theme.defaultTheme;
        }
        Theme.ThemeInfo themeInfo2 = themeInfo;
        presentFragment(new ThemePreviewActivity(themeInfo2, false, 1, themeInfo2.getAccent(false).id >= 100, this.currentType == 1));
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{TextSettingsCell.class, TextCheckCell.class, HeaderCell.class, BrightnessControlCell.class, ThemeTypeCell.class, TextSizeCell.class, BubbleRadiusCell.class, PhotoViewer.AnonymousClass35.class, NotificationsCheckCell.class, ThemesHorizontalListCell.class, MessageSeenView.AnonymousClass1.class, TextCell.class, PeerColorActivity.ChangeNameColorCell.class, SwipeGestureSettingsView.class, DefaultThemesPreviewCell.class, AppIconsSelectorCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.actionBar, Integer.MIN_VALUE, null, null, null, null, Theme.key_actionBarDefaultSubmenuBackground));
        arrayList.add(new ThemeDescription(this.actionBar, 1073741824, null, null, null, null, Theme.key_actionBarDefaultSubmenuItem));
        arrayList.add(new ThemeDescription(this.actionBar, 1073741832, null, null, null, null, Theme.key_actionBarDefaultSubmenuItemIcon));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        int i3 = Theme.key_windowBackgroundWhiteValueText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        int i4 = Theme.key_windowBackgroundWhiteBlueText4;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        int i5 = Theme.key_switchTrack;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, i5));
        int i6 = Theme.key_switchTrackChecked;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, i6));
        int i7 = Theme.key_windowBackgroundWhiteGrayIcon;
        arrayList.add(new ThemeDescription(this.listView, 8, new Class[]{BrightnessControlCell.class}, new String[]{"leftImageView"}, null, null, -1, null, i7));
        arrayList.add(new ThemeDescription(this.listView, 8, new Class[]{BrightnessControlCell.class}, new String[]{"rightImageView"}, null, null, -1, null, i7));
        int i8 = Theme.key_player_progressBackground;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{BrightnessControlCell.class}, new String[]{"seekBarView"}, null, null, -1, null, i8));
        int i9 = Theme.key_player_progress;
        arrayList.add(new ThemeDescription(this.listView, 2048, new Class[]{BrightnessControlCell.class}, new String[]{"seekBarView"}, null, null, -1, null, i9));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ThemeTypeCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ThemeTypeCell.class}, new String[]{"checkImage"}, null, null, -1, null, Theme.key_featuredStickers_addedIcon));
        arrayList.add(new ThemeDescription(this.listView, 2048, new Class[]{TextSizeCell.class}, new String[]{"sizeBar"}, null, null, -1, null, i9));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, new String[]{"sizeBar"}, null, null, -1, null, i8));
        arrayList.add(new ThemeDescription(this.listView, 2048, new Class[]{BubbleRadiusCell.class}, new String[]{"sizeBar"}, null, null, -1, null, i9));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{BubbleRadiusCell.class}, new String[]{"sizeBar"}, null, null, -1, null, i8));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{PhotoViewer.AnonymousClass35.class}, null, null, null, Theme.key_radioBackground));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{PhotoViewer.AnonymousClass35.class}, null, null, null, Theme.key_radioBackgroundChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, i5));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, i6));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, new Drawable[]{Theme.chat_msgInDrawable, Theme.chat_msgInMediaDrawable}, null, Theme.key_chat_inBubble));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, new Drawable[]{Theme.chat_msgInSelectedDrawable, Theme.chat_msgInMediaSelectedDrawable}, null, Theme.key_chat_inBubbleSelected));
        Drawable[] drawableArr = Theme.chat_msgInDrawable.shadowDrawable;
        int i10 = Theme.key_chat_inBubbleShadow;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, drawableArr, null, i10));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSizeCell.class}, null, Theme.chat_msgInMediaDrawable.shadowDrawable, null, i10));
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
        arrayList.addAll(SimpleThemeDescription.createThemeDescriptions(new QrActivity$$ExternalSyntheticLambda9(18, this), i11, i2, i3));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$createView$10(TodoItemMenu$$ExternalSyntheticLambda9 todoItemMenu$$ExternalSyntheticLambda9) {
        verifyAge(this.currentAccount, getParentActivity(), new ThemeActivity$$ExternalSyntheticLambda19(9, this, todoItemMenu$$ExternalSyntheticLambda9), getResourceProvider());
    }

    public final void lambda$createView$13(Context context, View view, final int i, float f) {
        int i2;
        int i3;
        String string;
        final int i4 = 0;
        final int i5 = 1;
        if (i == this.enableAnimationsRow) {
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
        if (i == this.backgroundRow) {
            presentFragment(new WallpapersListActivity(0));
            return;
        }
        if (i == this.changeUserColor) {
            PeerColorActivity peerColorActivity = new PeerColorActivity();
            peerColorActivity.bulletinFragment = this;
            presentFragment(peerColorActivity);
            return;
        }
        if (i == this.sendByEnterRow) {
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
        if (i == this.raiseToSpeakRow) {
            SharedConfig.toggleRaiseToSpeak();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(SharedConfig.raiseToSpeak);
                return;
            }
            return;
        }
        if (i == this.nextMediaTapRow) {
            SharedConfig.toggleNextMediaTap();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(SharedConfig.nextMediaTap);
                return;
            }
            return;
        }
        if (i == this.raiseToListenRow) {
            SharedConfig.toggleRaiseToListen();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(SharedConfig.raiseToListen);
            }
            if (!SharedConfig.raiseToListen && this.raiseToSpeakRow != -1) {
                for (int i6 = 0; i6 < this.listView.getChildCount(); i6++) {
                    View childAt = this.listView.getChildAt(i6);
                    if (childAt instanceof TextCheckCell) {
                        this.listView.getClass();
                        if (RecyclerView.getChildAdapterPosition(childAt) == this.raiseToSpeakRow) {
                            ((TextCheckCell) childAt).setChecked(false);
                        }
                    }
                }
            }
            updateRows$8(false);
            return;
        }
        if (i == this.pauseOnRecordRow) {
            SharedConfig.togglePauseMusicOnRecord();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(SharedConfig.pauseMusicOnRecord);
                return;
            }
            return;
        }
        if (i == this.pauseOnMediaRow) {
            SharedConfig.togglePauseMusicOnMedia();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(SharedConfig.pauseMusicOnMedia);
                return;
            }
            return;
        }
        float f2 = 4.0f;
        if (i == this.distanceRow) {
            if (getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference = new AtomicReference();
            LinearLayout linearLayoutM = zzkf.m(context, 1);
            CharSequence[] charSequenceArr = {LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic), LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers), LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles)};
            final int i7 = 0;
            while (i7 < 3) {
                RadioColorCell radioColorCell = new RadioColorCell(getParentActivity(), null);
                radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                radioColorCell.setCheckColor(Theme.getColor(null, Theme.key_radioBackground, false), Theme.getColor(null, Theme.key_dialogRadioBackgroundChecked, false));
                radioColorCell.setTextAndValue(charSequenceArr[i7], i7 == SharedConfig.distanceSystemType);
                radioColorCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 2, -1));
                linearLayoutM.addView(radioColorCell);
                radioColorCell.setOnClickListener(new View.OnClickListener(this) {
                    public final ThemeActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i4) {
                            case 0:
                                ThemeActivity themeActivity = this.f$0;
                                themeActivity.getClass();
                                SharedConfig.setDistanceSystemType(i7);
                                themeActivity.updateDistance = true;
                                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = themeActivity.listView.findViewHolderForAdapterPosition(themeActivity.distanceRow);
                                if (viewHolderFindViewHolderForAdapterPosition != null) {
                                    themeActivity.listAdapter.onBindViewHolder(viewHolderFindViewHolderForAdapterPosition, themeActivity.distanceRow);
                                }
                                ((Dialog) atomicReference.get()).dismiss();
                                break;
                            default:
                                ThemeActivity themeActivity2 = this.f$0;
                                themeActivity2.getClass();
                                SharedConfig.setSearchEngineType(i7);
                                themeActivity2.updateSearchEngine = true;
                                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = themeActivity2.listView.findViewHolderForAdapterPosition(themeActivity2.searchEngineRow);
                                if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                                    themeActivity2.listAdapter.onBindViewHolder(viewHolderFindViewHolderForAdapterPosition2, themeActivity2.searchEngineRow);
                                }
                                ((Dialog) atomicReference.get()).dismiss();
                                break;
                        }
                    }
                });
                i7++;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            String string2 = LocaleController.getString("DistanceUnitsTitle", R.string.DistanceUnitsTitle);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string2;
            builder.setView(linearLayoutM);
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            atomicReference.set(alertDialog);
            showDialog(alertDialog);
            return;
        }
        if (i == this.searchEngineRow) {
            if (getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference2 = new AtomicReference();
            LinearLayout linearLayoutM2 = zzkf.m(context, 1);
            ArrayList searchEngines = SearchEngine.getSearchEngines();
            int size = searchEngines.size();
            CharSequence[] charSequenceArr2 = new CharSequence[size];
            final int i8 = 0;
            while (i8 < size) {
                charSequenceArr2[i8] = ((SearchEngine) searchEngines.get(i8)).name;
                RadioColorCell radioColorCell2 = new RadioColorCell(getParentActivity(), null);
                radioColorCell2.setPadding(AndroidUtilities.dp(f2), 0, AndroidUtilities.dp(4.0f), 0);
                radioColorCell2.setCheckColor(Theme.getColor(null, Theme.key_radioBackground, false), Theme.getColor(null, Theme.key_dialogRadioBackgroundChecked, false));
                radioColorCell2.setTextAndValue(charSequenceArr2[i8], i8 == SharedConfig.searchEngineType);
                radioColorCell2.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 2, -1));
                linearLayoutM2.addView(radioColorCell2);
                radioColorCell2.setOnClickListener(new View.OnClickListener(this) {
                    public final ThemeActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i5) {
                            case 0:
                                ThemeActivity themeActivity = this.f$0;
                                themeActivity.getClass();
                                SharedConfig.setDistanceSystemType(i8);
                                themeActivity.updateDistance = true;
                                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = themeActivity.listView.findViewHolderForAdapterPosition(themeActivity.distanceRow);
                                if (viewHolderFindViewHolderForAdapterPosition != null) {
                                    themeActivity.listAdapter.onBindViewHolder(viewHolderFindViewHolderForAdapterPosition, themeActivity.distanceRow);
                                }
                                ((Dialog) atomicReference2.get()).dismiss();
                                break;
                            default:
                                ThemeActivity themeActivity2 = this.f$0;
                                themeActivity2.getClass();
                                SharedConfig.setSearchEngineType(i8);
                                themeActivity2.updateSearchEngine = true;
                                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = themeActivity2.listView.findViewHolderForAdapterPosition(themeActivity2.searchEngineRow);
                                if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                                    themeActivity2.listAdapter.onBindViewHolder(viewHolderFindViewHolderForAdapterPosition2, themeActivity2.searchEngineRow);
                                }
                                ((Dialog) atomicReference2.get()).dismiss();
                                break;
                        }
                    }
                });
                i8++;
                f2 = 4.0f;
            }
            AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity(), 0, null);
            String string3 = LocaleController.getString(R.string.SearchEngine);
            AlertDialog alertDialog2 = builder2.alertDialog;
            alertDialog2.title = string3;
            builder2.setView(linearLayoutM2);
            builder2.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            atomicReference2.set(alertDialog2);
            showDialog(alertDialog2);
            return;
        }
        if (i == this.bluetoothScoRow) {
            if (getParentActivity() == null) {
                return;
            }
            final AtomicReference atomicReference3 = new AtomicReference();
            LinearLayout linearLayoutM3 = zzkf.m(context, 1);
            RadioColorCell radioColorCell3 = new RadioColorCell(getParentActivity(), null);
            radioColorCell3.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            int i9 = Theme.key_radioBackground;
            int color = Theme.getColor(null, i9, false);
            int i10 = Theme.key_dialogRadioBackgroundChecked;
            radioColorCell3.setCheckColor(color, Theme.getColor(null, i10, false));
            radioColorCell3.setTextAndValue(LocaleController.getString(R.string.MicrophoneForVoiceMessagesBuiltIn), !SharedConfig.recordViaSco);
            int i11 = Theme.key_listSelector;
            radioColorCell3.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, i11, false), 2, -1));
            linearLayoutM3.addView(radioColorCell3);
            radioColorCell3.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i4) {
                        case 0:
                            ThemeActivity themeActivity = this.f$0;
                            themeActivity.getClass();
                            SharedConfig.recordViaSco = false;
                            SharedConfig.saveConfig();
                            themeActivity.updateRecordViaSco = true;
                            ((Dialog) atomicReference3.get()).dismiss();
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = themeActivity.listView.findViewHolderForAdapterPosition(themeActivity.bluetoothScoRow);
                            if (viewHolderFindViewHolderForAdapterPosition != null) {
                                themeActivity.listAdapter.onBindViewHolder(viewHolderFindViewHolderForAdapterPosition, themeActivity.bluetoothScoRow);
                            }
                            break;
                        default:
                            ThemeActivity themeActivity2 = this.f$0;
                            themeActivity2.getClass();
                            int i12 = R.raw.permission_request_microphone;
                            int i13 = R.string.PermissionNoBluetoothWithHint;
                            AtomicReference atomicReference4 = atomicReference3;
                            PermissionRequest.ensureEitherPermission(i12, i13, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new ThemeActivity$$ExternalSyntheticLambda19(0, themeActivity2, atomicReference4));
                            SharedConfig.recordViaSco = true;
                            SharedConfig.saveConfig();
                            themeActivity2.updateRecordViaSco = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = themeActivity2.listView.findViewHolderForAdapterPosition(themeActivity2.bluetoothScoRow);
                            if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                                themeActivity2.listAdapter.onBindViewHolder(viewHolderFindViewHolderForAdapterPosition2, themeActivity2.bluetoothScoRow);
                            }
                            break;
                    }
                }
            });
            RadioColorCell radioColorCell4 = new RadioColorCell(getParentActivity(), null);
            radioColorCell4.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            radioColorCell4.setCheckColor(Theme.getColor(null, i9, false), Theme.getColor(null, i10, false));
            String string4 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoIfConnected);
            String string5 = LocaleController.getString(R.string.MicrophoneForVoiceMessagesScoHint);
            boolean z5 = SharedConfig.recordViaSco;
            radioColorCell4.textView.setText(string4);
            TextView textView = radioColorCell4.text2View;
            textView.setVisibility(0);
            textView.setText(string5);
            radioColorCell4.radioButton.setChecked(z5, false);
            radioColorCell4.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, i11, false), 2, -1));
            linearLayoutM3.addView(radioColorCell4);
            radioColorCell4.setOnClickListener(new View.OnClickListener(this) {
                public final ThemeActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i5) {
                        case 0:
                            ThemeActivity themeActivity = this.f$0;
                            themeActivity.getClass();
                            SharedConfig.recordViaSco = false;
                            SharedConfig.saveConfig();
                            themeActivity.updateRecordViaSco = true;
                            ((Dialog) atomicReference3.get()).dismiss();
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = themeActivity.listView.findViewHolderForAdapterPosition(themeActivity.bluetoothScoRow);
                            if (viewHolderFindViewHolderForAdapterPosition != null) {
                                themeActivity.listAdapter.onBindViewHolder(viewHolderFindViewHolderForAdapterPosition, themeActivity.bluetoothScoRow);
                            }
                            break;
                        default:
                            ThemeActivity themeActivity2 = this.f$0;
                            themeActivity2.getClass();
                            int i12 = R.raw.permission_request_microphone;
                            int i13 = R.string.PermissionNoBluetoothWithHint;
                            AtomicReference atomicReference4 = atomicReference3;
                            PermissionRequest.ensureEitherPermission(i12, i13, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new String[]{"android.permission.BLUETOOTH_CONNECT"}, new ThemeActivity$$ExternalSyntheticLambda19(0, themeActivity2, atomicReference4));
                            SharedConfig.recordViaSco = true;
                            SharedConfig.saveConfig();
                            themeActivity2.updateRecordViaSco = true;
                            ((Dialog) atomicReference4.get()).dismiss();
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = themeActivity2.listView.findViewHolderForAdapterPosition(themeActivity2.bluetoothScoRow);
                            if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                                themeActivity2.listAdapter.onBindViewHolder(viewHolderFindViewHolderForAdapterPosition2, themeActivity2.bluetoothScoRow);
                            }
                            break;
                    }
                }
            });
            AlertDialog.Builder builder3 = new AlertDialog.Builder(getParentActivity(), 0, null);
            String string6 = LocaleController.getString(R.string.MicrophoneForVoiceMessages);
            AlertDialog alertDialog3 = builder3.alertDialog;
            alertDialog3.title = string6;
            builder3.setView(linearLayoutM3);
            builder3.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            atomicReference3.set(alertDialog3);
            showDialog(alertDialog3);
            return;
        }
        if (i == this.directShareRow) {
            SharedConfig.toggleDirectShare();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(SharedConfig.directShare);
                return;
            }
            return;
        }
        if (i == this.sensitiveContentRow) {
            if (getMessagesController().showSensitiveContent()) {
                getMessagesController().setContentSettings(false);
                if (view instanceof TextCheckCell) {
                    ((TextCheckCell) view).setChecked(getMessagesController().showSensitiveContent());
                    return;
                }
                return;
            }
            TodoItemMenu$$ExternalSyntheticLambda9 todoItemMenu$$ExternalSyntheticLambda9 = new TodoItemMenu$$ExternalSyntheticLambda9(8, this, view);
            AlertDialog.Builder builder4 = new AlertDialog.Builder(context, 0, this.resourceProvider);
            String string7 = LocaleController.getString(R.string.ConfirmSensitiveContentTitle);
            AlertDialog alertDialog4 = builder4.alertDialog;
            alertDialog4.title = string7;
            alertDialog4.message = LocaleController.getString(R.string.ConfirmSensitiveContentText);
            builder4.setPositiveButton(LocaleController.getString(R.string.Confirm), new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(26, this, todoItemMenu$$ExternalSyntheticLambda9));
            builder4.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog4);
            return;
        }
        if (i == this.contactsReimportRow) {
            return;
        }
        if (i == this.contactsSortRow) {
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog.Builder builder5 = new AlertDialog.Builder(getParentActivity(), 0, null);
            String string8 = LocaleController.getString("SortBy", R.string.SortBy);
            AlertDialog alertDialog5 = builder5.alertDialog;
            alertDialog5.title = string8;
            builder5.setItems(new CharSequence[]{LocaleController.getString("Default", R.string.Default), LocaleController.getString("SortFirstName", R.string.SortFirstName), LocaleController.getString("SortLastName", R.string.SortLastName)}, new ThemeActivity$$ExternalSyntheticLambda14(this, i, i4));
            builder5.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            showDialog(alertDialog5);
            return;
        }
        if (i == this.chatBlurRow) {
            SharedConfig.toggleChatBlur();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(SharedConfig.chatBlurEnabled());
                return;
            }
            return;
        }
        if (i == this.nightThemeRow) {
            if ((!LocaleController.isRTL || f > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                presentFragment(new ThemeActivity(1));
                return;
            }
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
            boolean z6 = Theme.selectedAutoNightType != 0;
            if (z6) {
                Theme.ThemeInfo themeInfo = Theme.currentNightTheme;
                if (themeInfo == null) {
                    string = "";
                } else {
                    string = themeInfo.getName();
                    if (string.toLowerCase().endsWith(".attheme")) {
                        string = string.substring(0, string.lastIndexOf(46));
                    }
                }
            } else {
                string = LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
            }
            if (z6) {
                int i12 = Theme.selectedAutoNightType;
                string = zzit.m(i12 == 1 ? LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled) : i12 == 3 ? LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault) : LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive), " ", string);
            }
            notificationsCheckCell.setTextAndValueAndIconAndCheck(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), string, R.drawable.menu_night_mode_24, z6, 0, false, true, false);
            return;
        }
        if (i == this.browserRow) {
            if ((!LocaleController.isRTL || f > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                presentFragment(new WebBrowserSettings(null));
                return;
            } else {
                getMessagesController().toggleWebBrowserInAppEnabled();
                ((NotificationsCheckCell) view).setChecked(getMessagesController().isWebBrowserInAppEnabled());
                return;
            }
        }
        if (i == this.nightDisabledRow) {
            if (Theme.selectedAutoNightType == 0) {
                return;
            }
            Theme.selectedAutoNightType = 0;
            updateRows$8(true);
            Theme.checkAutoNightThemeConditions(false);
            return;
        }
        if (i == this.nightScheduledRow) {
            if (Theme.selectedAutoNightType == 1) {
                return;
            }
            Theme.selectedAutoNightType = 1;
            if (Theme.autoNightScheduleByLocation) {
                updateSunTime(null, true);
            }
            updateRows$8(true);
            Theme.checkAutoNightThemeConditions(false);
            return;
        }
        if (i == this.nightAutomaticRow) {
            if (Theme.selectedAutoNightType == 2) {
                return;
            }
            Theme.selectedAutoNightType = 2;
            updateRows$8(true);
            Theme.checkAutoNightThemeConditions(false);
            return;
        }
        if (i == this.nightSystemDefaultRow) {
            if (Theme.selectedAutoNightType == 3) {
                return;
            }
            Theme.selectedAutoNightType = 3;
            updateRows$8(true);
            Theme.checkAutoNightThemeConditions(false);
            return;
        }
        if (i == this.scheduleLocationRow) {
            boolean z7 = !Theme.autoNightScheduleByLocation;
            Theme.autoNightScheduleByLocation = z7;
            ((TextCheckCell) view).setChecked(z7);
            updateRows$8(true);
            if (Theme.autoNightScheduleByLocation) {
                updateSunTime(null, true);
            }
            Theme.checkAutoNightThemeConditions(false);
            return;
        }
        if (i == this.scheduleFromRow || i == this.scheduleToRow) {
            if (getParentActivity() == null) {
                return;
            }
            if (i == this.scheduleFromRow) {
                i2 = Theme.autoNightDayStartTime;
                i3 = i2 / 60;
            } else {
                i2 = Theme.autoNightDayEndTime;
                i3 = i2 / 60;
            }
            int i13 = i2 - (i3 * 60);
            final TextSettingsCell textSettingsCell = (TextSettingsCell) view;
            showDialog(new TimePickerDialog(getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                @Override
                public final void onTimeSet(TimePicker timePicker, int i14, int i15) {
                    int i16 = (i14 * 60) + i15;
                    int i17 = this.f$0.scheduleFromRow;
                    int i18 = i;
                    TextSettingsCell textSettingsCell2 = textSettingsCell;
                    if (i18 == i17) {
                        Theme.autoNightDayStartTime = i16;
                        textSettingsCell2.setTextAndValue(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i15)), false, true);
                    } else {
                        Theme.autoNightDayEndTime = i16;
                        textSettingsCell2.setTextAndValue(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i15)), false, true);
                    }
                }
            }, i3, i13, true));
            return;
        }
        if (i == this.scheduleUpdateLocationRow) {
            updateSunTime(null, true);
            return;
        }
        if (i == this.createNewThemeRow) {
            createNewTheme();
            return;
        }
        if (i == this.editThemeRow) {
            editTheme();
        } else if (i == this.stickersRow) {
            presentFragment(new StickersActivity(0, null));
        } else if (i == this.liteModeRow) {
            presentFragment(new LiteModeSettingsActivity());
        }
    }

    @Override
    public final boolean onFragmentCreate() {
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
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.updatingLocation = false;
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        locationManager.removeUpdates(this.gpsLocationListener);
        locationManager.removeUpdates(this.networkLocationListener);
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
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.listAdapter != null) {
            updateRows$8(true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        }
    }

    public final void updateMenuItem() {
        Theme.OverrideWallpaperInfo overrideWallpaperInfo;
        if (this.menuItem == null) {
            return;
        }
        Theme.ThemeInfo themeInfo = Theme.currentDayTheme;
        if (themeInfo == null) {
            themeInfo = Theme.defaultTheme;
        }
        Theme.ThemeAccent accent = themeInfo.getAccent(false);
        ArrayList arrayList = themeInfo.themeAccents;
        if (arrayList == null || arrayList.isEmpty() || accent == null || accent.id < 100) {
            this.menuItem.hideSubItem(2);
            this.menuItem.hideSubItem(3);
        } else {
            this.menuItem.showSubItem$1(2);
            this.menuItem.showSubItem$1(3);
        }
        int i = AndroidUtilities.isTablet() ? 18 : 16;
        Theme.ThemeInfo themeInfo2 = Theme.currentDayTheme;
        if (themeInfo2 == null) {
            themeInfo2 = Theme.defaultTheme;
        }
        if (SharedConfig.fontSize == i && SharedConfig.bubbleRadius == 17 && themeInfo2.firstAccentIsDefault && themeInfo2.currentAccentId == Theme.DEFALT_THEME_ACCENT_ID && (accent == null || (overrideWallpaperInfo = accent.overrideWallpaper) == null || "d".equals(overrideWallpaperInfo.slug))) {
            this.menuItem.hideSubItem(4);
        } else {
            this.menuItem.showSubItem$1(4);
        }
    }

    public final void updateRows$8(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Theme.ThemeInfo themeInfo;
        TLRPC.TL_theme tL_theme;
        int i7 = this.rowCount;
        int i8 = this.themeAccentListRow;
        int i9 = this.editThemeRow;
        int i10 = this.raiseToSpeakRow;
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
        ArrayList arrayList = this.defaultThemes;
        arrayList.clear();
        ArrayList arrayList2 = this.darkThemes;
        arrayList2.clear();
        int size = Theme.themes.size();
        int i11 = 0;
        while (true) {
            i = this.currentType;
            if (i11 >= size) {
                break;
            }
            Theme.ThemeInfo themeInfo2 = (Theme.ThemeInfo) Theme.themes.get(i11);
            if (i == 0 || i == 3 || ((themeInfo2.pathToFile != null || themeInfo2.isDark()) && ((tL_theme = themeInfo2.info) == null || tL_theme.document != null))) {
                if (themeInfo2.pathToFile != null) {
                    arrayList2.add(themeInfo2);
                } else {
                    arrayList.add(themeInfo2);
                }
            }
            i11++;
        }
        Collections.sort(arrayList, new OAuthSheet$$ExternalSyntheticLambda3(19));
        if (i == 3) {
            int i12 = this.rowCount;
            this.selectThemeHeaderRow = i12;
            this.themeListRow2 = i12 + 1;
            this.chatListInfoRow = i12 + 2;
            this.themePreviewRow = i12 + 3;
            this.themeHeaderRow = i12 + 4;
            this.rowCount = i12 + 6;
            this.themeListRow = i12 + 5;
            Theme.ThemeInfo themeInfo3 = Theme.currentDayTheme;
            if (themeInfo3 == null) {
                themeInfo3 = Theme.defaultTheme;
            }
            boolean z2 = themeInfo3.defaultAccentCount != 0;
            this.hasThemeAccents = z2;
            ThemeSetUrlActivity.AnonymousClass4 anonymousClass4 = this.themesHorizontalListCell;
            if (anonymousClass4 != null) {
                anonymousClass4.setDrawDivider(z2);
            }
            if (this.hasThemeAccents) {
                int i13 = this.rowCount;
                this.rowCount = i13 + 1;
                this.themeAccentListRow = i13;
            }
            int i14 = this.rowCount;
            this.rowCount = i14 + 1;
            this.bubbleRadiusInfoRow = i14;
            Theme.ThemeInfo themeInfo4 = Theme.currentDayTheme;
            if (themeInfo4 == null) {
                themeInfo4 = Theme.defaultTheme;
            }
            Theme.ThemeAccent accent = themeInfo4.getAccent(false);
            ArrayList arrayList3 = themeInfo4.themeAccents;
            if (arrayList3 != null && !arrayList3.isEmpty() && accent != null && accent.id >= 100) {
                int i15 = this.rowCount;
                this.rowCount = i15 + 1;
                this.editThemeRow = i15;
            }
            int i16 = this.rowCount;
            this.createNewThemeRow = i16;
            this.rowCount = i16 + 2;
            this.lastShadowRow = i16 + 1;
        } else if (i == 0) {
            int i17 = this.rowCount;
            this.textSizeHeaderRow = i17;
            this.textSizeRow = i17 + 1;
            this.backgroundRow = i17 + 2;
            this.changeUserColor = i17 + 3;
            this.newThemeInfoRow = i17 + 4;
            this.themeHeaderRow = i17 + 5;
            this.themeListRow2 = i17 + 6;
            this.themeInfoRow = i17 + 7;
            this.bubbleRadiusHeaderRow = i17 + 8;
            this.bubbleRadiusRow = i17 + 9;
            this.bubbleRadiusInfoRow = i17 + 10;
            this.chatListHeaderRow = i17 + 11;
            this.chatListRow = i17 + 12;
            this.chatListInfoRow = i17 + 13;
            this.appIconHeaderRow = i17 + 14;
            this.appIconSelectorRow = i17 + 15;
            this.appIconShadowRow = i17 + 16;
            this.swipeGestureHeaderRow = i17 + 17;
            this.swipeGestureRow = i17 + 18;
            this.swipeGestureInfoRow = i17 + 19;
            this.nightThemeRow = i17 + 20;
            this.browserRow = i17 + 21;
            this.liteModeRow = i17 + 22;
            this.stickersRow = i17 + 23;
            this.stickersSectionRow = i17 + 24;
            this.mediaSoundHeaderRow = i17 + 25;
            this.nextMediaTapRow = i17 + 26;
            int i18 = i17 + 28;
            this.rowCount = i18;
            this.raiseToListenRow = i17 + 27;
            if (SharedConfig.raiseToListen) {
                this.rowCount = i17 + 29;
                this.raiseToSpeakRow = i18;
            }
            int i19 = this.rowCount;
            this.pauseOnRecordRow = i19;
            this.pauseOnMediaRow = i19 + 1;
            this.bluetoothScoRow = i19 + 2;
            this.mediaSoundSectionRow = i19 + 3;
            this.otherHeaderRow = i19 + 4;
            this.rowCount = i19 + 6;
            this.directShareRow = i19 + 5;
            TL_account.contentSettings contentSettings = getMessagesController().getContentSettings();
            if (contentSettings != null && contentSettings.sensitive_can_change) {
                int i20 = this.rowCount;
                this.rowCount = i20 + 1;
                this.sensitiveContentRow = i20;
            }
            int i21 = this.rowCount;
            this.sendByEnterRow = i21;
            this.distanceRow = i21 + 1;
            this.rowCount = i21 + 3;
            this.otherSectionRow = i21 + 2;
        } else {
            int i22 = this.rowCount;
            this.nightDisabledRow = i22;
            this.nightScheduledRow = i22 + 1;
            int i23 = i22 + 3;
            this.rowCount = i23;
            this.nightAutomaticRow = i22 + 2;
            if (Build.VERSION.SDK_INT >= 29) {
                this.rowCount = i22 + 4;
                this.nightSystemDefaultRow = i23;
            }
            int i24 = this.rowCount;
            int i25 = i24 + 1;
            this.rowCount = i25;
            this.nightTypeInfoRow = i24;
            int i26 = Theme.selectedAutoNightType;
            if (i26 == 1) {
                this.scheduleHeaderRow = i25;
                int i27 = i24 + 3;
                this.rowCount = i27;
                this.scheduleLocationRow = i24 + 2;
                if (Theme.autoNightScheduleByLocation) {
                    this.scheduleUpdateLocationRow = i27;
                    this.rowCount = i24 + 5;
                    this.scheduleLocationInfoRow = i24 + 4;
                } else {
                    this.scheduleFromRow = i27;
                    this.scheduleToRow = i24 + 4;
                    this.rowCount = i24 + 6;
                    this.scheduleFromToInfoRow = i24 + 5;
                }
            } else if (i26 == 2) {
                this.automaticHeaderRow = i25;
                this.automaticBrightnessRow = i24 + 2;
                this.rowCount = i24 + 4;
                this.automaticBrightnessInfoRow = i24 + 3;
            }
            if (Theme.selectedAutoNightType != 0) {
                int i28 = this.rowCount;
                this.preferedHeaderRow = i28;
                this.rowCount = i28 + 2;
                this.themeListRow = i28 + 1;
                boolean z3 = Theme.currentNightTheme.defaultAccentCount != 0;
                this.hasThemeAccents = z3;
                ThemeSetUrlActivity.AnonymousClass4 anonymousClass5 = this.themesHorizontalListCell;
                if (anonymousClass5 != null) {
                    anonymousClass5.setDrawDivider(z3);
                }
                if (this.hasThemeAccents) {
                    int i29 = this.rowCount;
                    this.rowCount = i29 + 1;
                    this.themeAccentListRow = i29;
                }
                int i30 = this.rowCount;
                this.rowCount = i30 + 1;
                this.themeInfoRow = i30;
            }
        }
        ThemeSetUrlActivity.AnonymousClass4 anonymousClass6 = this.themesHorizontalListCell;
        if (anonymousClass6 != null) {
            int width = this.listView.getWidth();
            int i31 = anonymousClass6.prevCount;
            FloatingDebugView.AnonymousClass3 anonymousClass3 = anonymousClass6.adapter;
            if (i31 != anonymousClass3.getItemCount()) {
                anonymousClass3.mObservable.notifyChanged();
                if (anonymousClass6.currentType == 1) {
                    themeInfo = Theme.currentNightTheme;
                } else {
                    themeInfo = Theme.currentDayTheme;
                    if (themeInfo == null) {
                        themeInfo = Theme.defaultTheme;
                    }
                }
                if (anonymousClass6.prevThemeInfo != themeInfo) {
                    anonymousClass6.scrollToCurrentTheme(width);
                }
            }
        }
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            RecyclerView.AdapterDataObservable adapterDataObservable = listAdapter.mObservable;
            if (i == 1 && (i5 = this.previousUpdatedType) != (i6 = Theme.selectedAutoNightType) && i5 != -1) {
                int i32 = this.nightTypeInfoRow;
                int i33 = i32 + 1;
                if (i5 != i6) {
                    int i34 = 0;
                    while (i34 < 4) {
                        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findViewHolderForAdapterPosition(i34);
                        if (holder != null) {
                            View view = holder.itemView;
                            if (view instanceof ThemeTypeCell) {
                                ((ThemeTypeCell) view).setTypeChecked(i34 == Theme.selectedAutoNightType);
                            }
                        }
                        i34++;
                    }
                    int i35 = Theme.selectedAutoNightType;
                    if (i35 == 0) {
                        this.listAdapter.mObservable.notifyItemRangeRemoved(i33, i7 - i33);
                    } else if (i35 == 1) {
                        int i36 = this.previousUpdatedType;
                        if (i36 == 0) {
                            this.listAdapter.mObservable.notifyItemRangeInserted(i33, this.rowCount - i33);
                        } else if (i36 == 2) {
                            this.listAdapter.mObservable.notifyItemRangeRemoved(i33, 3);
                            this.listAdapter.mObservable.notifyItemRangeInserted(i33, Theme.autoNightScheduleByLocation ? 4 : 5);
                        } else if (i36 == 3) {
                            this.listAdapter.mObservable.notifyItemRangeInserted(i33, Theme.autoNightScheduleByLocation ? 4 : 5);
                        }
                    } else if (i35 == 2) {
                        int i37 = this.previousUpdatedType;
                        if (i37 == 0) {
                            this.listAdapter.mObservable.notifyItemRangeInserted(i33, this.rowCount - i33);
                        } else if (i37 == 1) {
                            this.listAdapter.mObservable.notifyItemRangeRemoved(i33, Theme.autoNightScheduleByLocation ? 4 : 5);
                            this.listAdapter.mObservable.notifyItemRangeInserted(i33, 3);
                        } else if (i37 == 3) {
                            this.listAdapter.mObservable.notifyItemRangeInserted(i33, 3);
                        }
                    } else if (i35 == 3) {
                        int i38 = this.previousUpdatedType;
                        if (i38 == 0) {
                            this.listAdapter.mObservable.notifyItemRangeInserted(i33, this.rowCount - i33);
                        } else if (i38 == 2) {
                            this.listAdapter.mObservable.notifyItemRangeRemoved(i33, 3);
                        } else if (i38 == 1) {
                            this.listAdapter.mObservable.notifyItemRangeRemoved(i33, Theme.autoNightScheduleByLocation ? 4 : 5);
                        }
                    }
                } else {
                    boolean z4 = this.previousByLocation;
                    boolean z5 = Theme.autoNightScheduleByLocation;
                    if (z4 != z5) {
                        int i39 = i32 + 3;
                        adapterDataObservable.notifyItemRangeRemoved(i39, z5 ? 3 : 2);
                        this.listAdapter.mObservable.notifyItemRangeInserted(i39, Theme.autoNightScheduleByLocation ? 2 : 3);
                    }
                }
            } else if (z || this.previousUpdatedType == -1) {
                adapterDataObservable.notifyChanged();
            } else {
                if (i8 == -1 && (i4 = this.themeAccentListRow) != -1) {
                    adapterDataObservable.notifyItemRangeInserted(i4, 1);
                } else if (i8 == -1 || this.themeAccentListRow != -1) {
                    int i40 = this.themeAccentListRow;
                    if (i40 != -1) {
                        listAdapter.notifyItemChanged(i40);
                    }
                } else {
                    adapterDataObservable.notifyItemRangeRemoved(i8, 1);
                    if (i9 != -1) {
                        i9--;
                    }
                }
                if (i9 == -1 && (i3 = this.editThemeRow) != -1) {
                    this.listAdapter.mObservable.notifyItemRangeInserted(i3, 1);
                } else if (i9 != -1 && this.editThemeRow == -1) {
                    this.listAdapter.mObservable.notifyItemRangeRemoved(i9, 1);
                }
                if (i10 == -1 && (i2 = this.raiseToSpeakRow) != -1) {
                    this.listAdapter.mObservable.notifyItemRangeInserted(i2, 1);
                } else if (i10 != -1 && this.raiseToSpeakRow == -1) {
                    this.listAdapter.mObservable.notifyItemRangeRemoved(i10, 1);
                }
            }
        }
        if (i == 1) {
            this.previousByLocation = Theme.autoNightScheduleByLocation;
            this.previousUpdatedType = Theme.selectedAutoNightType;
        }
        updateMenuItem();
    }

    public final void updateSunTime(Location location, boolean z) {
        Activity parentActivity;
        int i = 1;
        int i2 = 0;
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
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                    builder.setTopAnimation(R.raw.permission_request_location, 72, Theme.getColor(null, Theme.key_dialogTopBackground, false), null);
                    builder.alertDialog.message = LocaleController.getString("GpsDisabledAlertText", R.string.GpsDisabledAlertText);
                    builder.setPositiveButton(LocaleController.getString("ConnectingToProxyEnable", R.string.ConnectingToProxyEnable), new ThemeActivity$$ExternalSyntheticLambda6(this, i2));
                    builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                    showDialog(builder.alertDialog);
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
            if (!this.updatingLocation) {
                this.updatingLocation = true;
                LocationManager locationManager2 = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                try {
                    locationManager2.requestLocationUpdates("gps", 1L, 0.0f, this.gpsLocationListener);
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
                try {
                    locationManager2.requestLocationUpdates("network", 1L, 0.0f, this.networkLocationListener);
                } catch (Exception e4) {
                    FileLog.e(e4);
                }
            }
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
        Utilities.globalQueue.postRunnable(new ThemeActivity$$ExternalSyntheticLambda4(this, i));
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findViewHolderForAdapterPosition(this.scheduleLocationInfoRow);
        if (holder != null) {
            View view = holder.itemView;
            if (view instanceof TextInfoPrivacyCell) {
                int i3 = Theme.autoNightSunriseTime;
                int i4 = i3 / 60;
                String str = String.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3 - (i4 * 60)));
                int i5 = Theme.autoNightSunsetTime;
                int i6 = i5 / 60;
                ((TextInfoPrivacyCell) view).setText(LocaleController.formatString("AutoNightUpdateLocationInfo", R.string.AutoNightUpdateLocationInfo, String.format("%02d:%02d", Integer.valueOf(i6), Integer.valueOf(i5 - (i6 * 60))), str));
            }
        }
        if (Theme.autoNightScheduleByLocation && Theme.selectedAutoNightType == 1) {
            Theme.checkAutoNightThemeConditions(false);
        }
    }
}
