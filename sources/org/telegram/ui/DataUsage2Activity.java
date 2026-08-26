package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.StatsController;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CacheChart;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.ViewPagerFixed;

public final class DataUsage2Activity extends BaseFragment {
    public boolean changeStatusBar;
    public ViewPagerFixed pager;
    public ViewPagerFixed.AnonymousClass3 tabsView;
    public static final int[][] colors2 = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] colors = {Theme.key_statisticChartLine_blue, Theme.key_statisticChartLine_green, Theme.key_statisticChartLine_lightblue, Theme.key_statisticChartLine_golden, Theme.key_statisticChartLine_red, Theme.key_statisticChartLine_purple, Theme.key_statisticChartLine_cyan};
    public static final int[] particles = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    public static final int[] titles = {R.string.LocalVideoCache, R.string.LocalDocumentCache, R.string.LocalPhotoCache, R.string.MessagesSettings, R.string.LocalMusicCache, R.string.LocalAudioCache, R.string.CallsDataUsage};
    public static final int[] stats = {2, 5, 4, 1, 7, 3, 0};

    public final class Cell extends FrameLayout {
        public final ImageView arrowView;
        public boolean divider;
        public final ImageView imageView;
        public final TextView textView;
        public final TextView valueTextView;

        public Cell(DataUsage2Activity dataUsage2Activity, Context context) {
            super(context);
            setBackgroundColor(dataUsage2Activity.getThemedColor(Theme.key_windowBackgroundWhite));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, LayoutHelper.createFrame(28, 28.0f, (LocaleController.isRTL ? 5 : 3) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(2.0f);
            addView(linearLayout, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 64.0f, 0.0f, 20.0f, 0.0f));
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            if (LocaleController.isRTL) {
                linearLayout2.setGravity(5);
            }
            linearLayout2.setWeightSum(2.0f);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 16.0f);
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(dataUsage2Activity.getThemedColor(i));
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine();
            textView.setLines(1);
            ImageView imageView2 = new ImageView(context);
            this.arrowView = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView2.setImageResource(R.drawable.arrow_more);
            imageView2.setColorFilter(new PorterDuffColorFilter(dataUsage2Activity.getThemedColor(i), PorterDuff.Mode.MULTIPLY));
            imageView2.setTranslationY(AndroidUtilities.dp(1.0f));
            imageView2.setVisibility(8);
            if (LocaleController.isRTL) {
                linearLayout2.addView(imageView2, LayoutHelper.createLinear(16, 16, 21, 3, 0, 0, 0));
                linearLayout2.addView(textView, LayoutHelper.createLinear(-2, -2, 21));
            } else {
                linearLayout2.addView(textView, LayoutHelper.createLinear(-2, -2, 16));
                linearLayout2.addView(imageView2, LayoutHelper.createLinear(16, 16, 16, 3, 0, 0, 0));
            }
            TextView textView2 = new TextView(context);
            this.valueTextView = textView2;
            textView2.setTextSize(1, 16.0f);
            textView2.setTextColor(dataUsage2Activity.getThemedColor(Theme.key_windowBackgroundWhiteBlueText2));
            textView2.setGravity(LocaleController.isRTL ? 3 : 5);
            if (LocaleController.isRTL) {
                linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 19));
                linearLayout.addView(linearLayout2, LayoutHelper.createLinear(0, -2, 2.0f, 21));
            } else {
                linearLayout.addView(linearLayout2, LayoutHelper.createLinear(0, -2, 2.0f, 16));
                linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 21));
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.divider) {
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(64.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }

        public final void setArrow(Boolean bool) {
            ImageView imageView = this.arrowView;
            if (bool == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                imageView.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
        }
    }

    public final class CustomCharacterSpan extends MetricAffectingSpan {
        public final double ratio = 0.1d;

        @Override
        public final void updateDrawState(TextPaint textPaint) {
            textPaint.baselineShift += (int) (((double) textPaint.ascent()) * this.ratio);
        }

        @Override
        public final void updateMeasureState(TextPaint textPaint) {
            textPaint.baselineShift += (int) (((double) textPaint.ascent()) * this.ratio);
        }
    }

    public final class ListView extends RecyclerListView {
        public static final int $r8$clinit = 0;
        public final LiteModeSettingsActivity.Adapter adapter;
        public boolean animateChart;
        public DataUsage2Activity$ListView$Adapter$1 chart;
        public Size[] chartSegments;
        public final boolean[] collapsed;
        public int currentType;
        public boolean empty;
        public final ArrayList itemInners;
        public final LinearLayoutManager layoutManager;
        public final ArrayList oldItems;
        public final ArrayList removedSegments;
        public Size[] segments;
        public final int[] tempPercents;
        public final float[] tempSizes;
        public long totalSize;
        public long totalSizeIn;
        public long totalSizeOut;

        public final class Size extends CacheChart.SegmentSize {
            public final int inCount;
            public final long inSize;
            public final int index;
            public final int outCount;
            public final long outSize;

            public Size(int i, long j, long j2, long j3, int i2, int i3) {
                this.index = i;
                this.size = j;
                this.selected = true;
                this.inSize = j2;
                this.inCount = i2;
                this.outSize = j3;
                this.outCount = i3;
            }
        }

        public ListView(Activity activity) {
            super(activity, null);
            this.animateChart = false;
            this.currentType = 0;
            this.oldItems = new ArrayList();
            this.itemInners = new ArrayList();
            this.tempSizes = new float[7];
            this.tempPercents = new int[7];
            this.removedSegments = new ArrayList();
            this.collapsed = new boolean[7];
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
            this.layoutManager = linearLayoutManager;
            setLayoutManager(linearLayoutManager);
            LiteModeSettingsActivity.Adapter adapter = new LiteModeSettingsActivity.Adapter(this, 1);
            this.adapter = adapter;
            setAdapter(adapter);
            setSections();
            setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(this, 7));
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setDurations(220L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.delayAnimations = false;
            defaultItemAnimator.mSupportsChangeAnimations = false;
            setItemAnimator(defaultItemAnimator);
        }

        public final long getReceivedBytesCount(int i) {
            int i2 = this.currentType;
            DataUsage2Activity dataUsage2Activity = DataUsage2Activity.this;
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                return StatsController.getInstance(((BaseFragment) dataUsage2Activity).currentAccount).getReceivedBytesCount(this.currentType - 1, i);
            }
            return StatsController.getInstance(((BaseFragment) dataUsage2Activity).currentAccount).getReceivedBytesCount(2, i) + StatsController.getInstance(((BaseFragment) dataUsage2Activity).currentAccount).getReceivedBytesCount(1, i) + StatsController.getInstance(((BaseFragment) dataUsage2Activity).currentAccount).getReceivedBytesCount(0, i);
        }

        public final long getResetStatsDate() {
            int i = this.currentType;
            DataUsage2Activity dataUsage2Activity = DataUsage2Activity.this;
            if (i == 1 || i == 2 || i == 3) {
                return StatsController.getInstance(((BaseFragment) dataUsage2Activity).currentAccount).getResetStatsDate(this.currentType - 1);
            }
            long[] jArr = {StatsController.getInstance(((BaseFragment) dataUsage2Activity).currentAccount).getResetStatsDate(0), StatsController.getInstance(((BaseFragment) dataUsage2Activity).currentAccount).getResetStatsDate(1), StatsController.getInstance(((BaseFragment) dataUsage2Activity).currentAccount).getResetStatsDate(2)};
            long j = Long.MAX_VALUE;
            for (int i2 = 0; i2 < 3; i2++) {
                long j2 = jArr[i2];
                if (j > j2) {
                    j = j2;
                }
            }
            return j;
        }

        public final long getSentBytesCount(int i) {
            int i2 = this.currentType;
            DataUsage2Activity dataUsage2Activity = DataUsage2Activity.this;
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                return StatsController.getInstance(((BaseFragment) dataUsage2Activity).currentAccount).getSentBytesCount(this.currentType - 1, i);
            }
            return StatsController.getInstance(((BaseFragment) dataUsage2Activity).currentAccount).getSentBytesCount(2, i) + StatsController.getInstance(((BaseFragment) dataUsage2Activity).currentAccount).getSentBytesCount(1, i) + StatsController.getInstance(((BaseFragment) dataUsage2Activity).currentAccount).getSentBytesCount(0, i);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        }

        public final void setup() {
            int i;
            int recivedItemsCount;
            int sentItemsCount;
            this.totalSize = getReceivedBytesCount(6) + getSentBytesCount(6);
            this.totalSizeIn = getReceivedBytesCount(6);
            this.totalSizeOut = getSentBytesCount(6);
            if (this.segments == null) {
                this.segments = new Size[7];
            }
            if (this.chartSegments == null) {
                this.chartSegments = new Size[7];
            }
            int i2 = 0;
            while (true) {
                int[] iArr = DataUsage2Activity.stats;
                int length = iArr.length;
                float[] fArr = this.tempSizes;
                if (i2 >= length) {
                    Arrays.sort(this.segments, new ChatActivity$$ExternalSyntheticLambda18(27));
                    AndroidUtilities.roundPercents(fArr, this.tempPercents);
                    Arrays.fill(this.collapsed, true);
                    return;
                }
                int i3 = iArr[i2];
                long receivedBytesCount = getReceivedBytesCount(i3) + getSentBytesCount(i3);
                Size[] sizeArr = this.chartSegments;
                Size[] sizeArr2 = this.segments;
                long receivedBytesCount2 = getReceivedBytesCount(iArr[i2]);
                long sentBytesCount = getSentBytesCount(iArr[i2]);
                int i4 = iArr[i2];
                int i5 = this.currentType;
                DataUsage2Activity dataUsage2Activity = DataUsage2Activity.this;
                int i6 = i2;
                if (i5 == 1 || i5 == 2 || i5 == 3) {
                    i = 1;
                    recivedItemsCount = StatsController.getInstance(((BaseFragment) dataUsage2Activity).currentAccount).getRecivedItemsCount(this.currentType - 1, i4);
                } else {
                    recivedItemsCount = StatsController.getInstance(((BaseFragment) dataUsage2Activity).currentAccount).getRecivedItemsCount(2, i4) + StatsController.getInstance(((BaseFragment) dataUsage2Activity).currentAccount).getRecivedItemsCount(1, i4) + StatsController.getInstance(((BaseFragment) dataUsage2Activity).currentAccount).getRecivedItemsCount(0, i4);
                    i = 1;
                }
                int i7 = iArr[i6];
                int i8 = this.currentType;
                if (i8 == i || i8 == 2 || i8 == 3) {
                    sentItemsCount = StatsController.getInstance(((BaseFragment) dataUsage2Activity).currentAccount).getSentItemsCount(this.currentType - 1, i7);
                } else {
                    sentItemsCount = StatsController.getInstance(((BaseFragment) dataUsage2Activity).currentAccount).getSentItemsCount(2, i7) + StatsController.getInstance(((BaseFragment) dataUsage2Activity).currentAccount).getSentItemsCount(i, i7) + StatsController.getInstance(((BaseFragment) dataUsage2Activity).currentAccount).getSentItemsCount(0, i7);
                }
                Size size = new Size(i6, receivedBytesCount, receivedBytesCount2, sentBytesCount, recivedItemsCount, sentItemsCount);
                sizeArr2[i6] = size;
                sizeArr[i6] = size;
                fArr[i6] = receivedBytesCount / this.totalSize;
                i2 = i6 + 1;
            }
        }

        public final void updateRows$10(boolean z) {
            int i;
            int i2;
            String string;
            SpannableString spannableString;
            int i3;
            String str;
            int i4 = 1;
            ArrayList arrayList = this.oldItems;
            arrayList.clear();
            ArrayList arrayList2 = this.itemInners;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            arrayList2.add(new ItemInner(0, false));
            long j = 0;
            String string2 = this.totalSize > 0 ? LocaleController.formatString(R.string.YourNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(getResetStatsDate())) : LocaleController.formatString(R.string.NoNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(getResetStatsDate()));
            arrayList2.add(new ItemInner(1, string2));
            ArrayList arrayList3 = new ArrayList();
            int i5 = 0;
            while (true) {
                Size[] sizeArr = this.segments;
                if (i5 >= sizeArr.length) {
                    break;
                }
                Size size = sizeArr[i5];
                long j2 = j;
                long j3 = size.size;
                boolean z2 = this.empty;
                int i6 = size.index;
                boolean z3 = z2 || this.removedSegments.contains(Integer.valueOf(i6));
                if (j3 > j2 || z3) {
                    int i7 = this.tempPercents[i6];
                    if (i7 <= 0) {
                        Object[] objArr = new Object[i4];
                        objArr[0] = Integer.valueOf(i4);
                        str = String.format("<%d%%", objArr);
                    } else {
                        Object[] objArr2 = new Object[i4];
                        objArr2[0] = Integer.valueOf(i7);
                        str = String.format("%d%%", objArr2);
                    }
                    SpannableString spannableString2 = new SpannableString(str);
                    spannableString2.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                    spannableString2.setSpan(new RelativeSizeSpan(0.8f), 0, spannableString2.length(), 33);
                    spannableString2.setSpan(new CustomCharacterSpan(), 0, spannableString2.length(), 33);
                    int i8 = DataUsage2Activity.particles[i6];
                    int[] iArr = DataUsage2Activity.colors2[i6];
                    arrayList3.add(new ItemInner(i5, i8, iArr[0], iArr[i4], j3 == j2 ? LocaleController.getString(DataUsage2Activity.titles[i6]) : TextUtils.concat(LocaleController.getString(DataUsage2Activity.titles[i6]), "  ", spannableString2), AndroidUtilities.formatFileSize(j3)));
                }
                i5++;
                j = j2;
                i4 = 1;
            }
            long j4 = j;
            if (!arrayList3.isEmpty()) {
                SpannableString spannableString3 = new SpannableString("^");
                Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_upload).mutate();
                int i9 = Theme.key_windowBackgroundWhiteBlackText;
                Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                int color = Theme.getColor(i9, resourcesProvider);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(color, mode));
                drawableMutate.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
                spannableString3.setSpan(new ImageSpan(drawableMutate, 2), 0, 1, 33);
                SpannableString spannableString4 = new SpannableString("v");
                Drawable drawableMutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
                drawableMutate2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i9, resourcesProvider), mode));
                drawableMutate2.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
                spannableString4.setSpan(new ImageSpan(drawableMutate2, 2), 0, 1, 33);
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    int i11 = ((ItemInner) arrayList3.get(i10)).index;
                    if (i11 < 0 || this.collapsed[i11]) {
                        spannableString = spannableString3;
                        i3 = i10;
                    } else {
                        Size size2 = this.segments[i11];
                        int i12 = DataUsage2Activity.stats[size2.index];
                        int i13 = size2.inCount;
                        int i14 = size2.outCount;
                        long j5 = size2.inSize;
                        int i15 = i10;
                        long j6 = size2.outSize;
                        if (i12 == 0) {
                            if (j6 > j4 || i14 > 0) {
                                int i16 = i15 + 1;
                                arrayList3.add(i16, new ItemInner(-1, 0, 0, 0, LocaleController.formatPluralStringComma("OutgoingCallsCount", i14), AndroidUtilities.formatFileSize(j6)));
                                i3 = i16;
                            } else {
                                i3 = i15;
                            }
                            if (j5 > j4 || i13 > 0) {
                                i3++;
                                arrayList3.add(i3, new ItemInner(-1, 0, 0, 0, LocaleController.formatPluralStringComma("IncomingCallsCount", i13), AndroidUtilities.formatFileSize(j5)));
                            }
                            spannableString = spannableString3;
                        } else if (i12 != 1) {
                            if (j6 > j4 || i14 > 0) {
                                int i17 = i15 + 1;
                                spannableString = spannableString3;
                                arrayList3.add(i17, new ItemInner(-1, 0, 0, 0, TextUtils.concat(spannableString, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesSentCount", i14))), AndroidUtilities.formatFileSize(j6)));
                                i3 = i17;
                            } else {
                                spannableString = spannableString3;
                                i3 = i15;
                            }
                            if (j5 > j4 || i13 > 0) {
                                i3++;
                                arrayList3.add(i3, new ItemInner(-1, 0, 0, 0, TextUtils.concat(spannableString4, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesReceivedCount", i13))), AndroidUtilities.formatFileSize(j5)));
                            }
                        } else {
                            spannableString = spannableString3;
                            if (j6 > j4 || i14 > 0) {
                                int i18 = i15 + 1;
                                arrayList3.add(i18, new ItemInner(-1, 0, 0, 0, TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.BytesSent)), AndroidUtilities.formatFileSize(j6)));
                                i3 = i18;
                            } else {
                                i3 = i15;
                            }
                            if (j5 > j4 || i13 > 0) {
                                i3++;
                                arrayList3.add(i3, new ItemInner(-1, 0, 0, 0, TextUtils.concat(spannableString4, " ", LocaleController.getString(R.string.BytesReceived)), AndroidUtilities.formatFileSize(j5)));
                            }
                        }
                    }
                    i10 = i3 + 1;
                    spannableString3 = spannableString;
                }
                arrayList2.addAll(arrayList3);
                if (!this.empty) {
                    arrayList2.add(new ItemInner(3, LocaleController.getString(R.string.DataUsageSectionsInfo) + "\n"));
                }
            }
            if (!this.empty) {
                arrayList2.add(new ItemInner(4, LocaleController.getString(R.string.TotalNetworkUsage)));
                arrayList2.add(new ItemInner(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, LocaleController.getString(R.string.BytesSent), AndroidUtilities.formatFileSize(this.totalSizeOut)));
                arrayList2.add(new ItemInner(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, LocaleController.getString(R.string.BytesReceived), AndroidUtilities.formatFileSize(this.totalSizeIn)));
            }
            if (arrayList3.isEmpty()) {
                i = 3;
            } else {
                i = 3;
                arrayList2.add(new ItemInner(3, string2));
            }
            if (this.currentType != 0) {
                if (arrayList3.isEmpty()) {
                    arrayList2.add(new ItemInner(i, false));
                }
                arrayList2.add(new ItemInner(-2, R.drawable.msg_download_settings, -11565578, -13276952, LocaleController.getString(R.string.AutomaticDownloadSettings), null));
                int i19 = this.currentType;
                if (i19 != 1) {
                    i2 = 3;
                    string = i19 != 3 ? LocaleController.getString(R.string.AutomaticDownloadSettingsInfoWiFi) : LocaleController.getString(R.string.AutomaticDownloadSettingsInfoRoaming);
                } else {
                    i2 = 3;
                    string = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoMobile);
                }
                arrayList2.add(new ItemInner(i2, string));
            }
            if (!arrayList3.isEmpty()) {
                arrayList2.add(new ItemInner(LocaleController.getString(R.string.ResetStatistics)));
            }
            arrayList2.add(new ItemInner(3, false));
            LiteModeSettingsActivity.Adapter adapter = this.adapter;
            if (adapter != null) {
                if (z) {
                    adapter.setItems(arrayList, arrayList2);
                } else {
                    adapter.mObservable.notifyChanged();
                }
            }
        }
    }

    public final class PageAdapter extends ViewPagerFixed.Adapter {
        public PageAdapter() {
        }

        @Override
        public final void bindView(View view, int i, int i2) {
            ListView listView = (ListView) view;
            listView.currentType = i;
            listView.removedSegments.clear();
            listView.empty = listView.getReceivedBytesCount(6) + listView.getSentBytesCount(6) <= 0;
            listView.setup();
            listView.updateRows$10(false);
            listView.scrollToPosition(0);
        }

        @Override
        public final View createView(int i) {
            DataUsage2Activity dataUsage2Activity = DataUsage2Activity.this;
            return dataUsage2Activity.new ListView(dataUsage2Activity.getParentActivity());
        }

        @Override
        public final int getItemCount() {
            return 4;
        }

        @Override
        public final CharSequence getItemTitle(int i) {
            if (i == 0) {
                return LocaleController.getString(R.string.NetworkUsageAllTab);
            }
            if (i == 1) {
                return LocaleController.getString(R.string.NetworkUsageMobileTab);
            }
            if (i != 2) {
                return i != 3 ? "" : LocaleController.getString(R.string.NetworkUsageRoamingTab);
            }
            return LocaleController.getString(R.string.NetworkUsageWiFiTab);
        }
    }

    public final class RoundingCell extends View {
        public final Paint paint;
        public final Path path;
        public boolean top;

        public RoundingCell(Context context) {
            super(context);
            this.path = new Path();
            Paint paint = new Paint(1);
            this.paint = paint;
            this.top = true;
            paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
            paint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        }

        @Override
        public final void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            requestLayout();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawPath(this.path, this.paint);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(13.0f), 1073741824));
            setTop(this.top);
        }

        public void setTop(boolean z) {
            Path path = this.path;
            path.rewind();
            this.top = z;
            if (!z) {
                float fDp = AndroidUtilities.dp(8.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, ((-getMeasuredHeight()) * 2) - AndroidUtilities.dp(4.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(4.0f));
                path.addRoundRect(rectF, fDp, fDp, Path.Direction.CW);
                return;
            }
            float fDp2 = AndroidUtilities.dp(14.0f);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, AndroidUtilities.dp(4.0f), getMeasuredWidth(), (getMeasuredHeight() * 2) + AndroidUtilities.dp(4.0f));
            path.addRoundRect(rectF2, fDp2, fDp2, Path.Direction.CW);
        }
    }

    public final class SubtitleCell extends FrameLayout {
        public final TextView textView;

        public SubtitleCell(DataUsage2Activity dataUsage2Activity, Context context) {
            super(context);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setGravity(17);
            textView.setTextSize(1, 13.0f);
            textView.setTextColor(dataUsage2Activity.getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }
    }

    public DataUsage2Activity() {
        super(null);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.NetworkUsage));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_actionBarActionModeDefault;
        actionBar.setBackgroundColor(getThemedColor(i));
        ActionBar actionBar2 = this.actionBar;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        actionBar2.setTitleColor(getThemedColor(i2));
        this.actionBar.setItemsColor(getThemedColor(i2), false);
        this.actionBar.setItemsBackgroundColor(getThemedColor(Theme.key_listSelector), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 13));
        LoginActivity.AnonymousClass4 anonymousClass4 = new LoginActivity.AnonymousClass4(this, context, 3);
        anonymousClass4.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context, null);
        this.pager = viewPagerFixed;
        viewPagerFixed.setAdapter(new PageAdapter());
        ViewPagerFixed.AnonymousClass3 anonymousClass3CreateTabsView = this.pager.createTabsView(8, true);
        this.tabsView = anonymousClass3CreateTabsView;
        anonymousClass3CreateTabsView.setBackgroundColor(getThemedColor(i));
        anonymousClass4.addView(this.tabsView, LayoutHelper.createFrame(-1, 48, 55));
        anonymousClass4.addView(this.pager, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 48.0f, 0.0f, 0.0f));
        this.fragmentView = anonymousClass4;
        return anonymousClass4;
    }

    @Override
    public final Theme.ResourcesProvider getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (this.changeStatusBar) {
            return AndroidUtilities.computePerceivedBrightness(Theme.getColor(null, Theme.key_actionBarActionModeDefault, false)) > 0.721f;
        }
        return super.isLightStatusBar();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getY() <= AndroidUtilities.dp(48.0f) + ActionBar.getCurrentActionBarHeight()) {
                return true;
            }
        }
        return this.pager.getCurrentPosition() == 0;
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z, float f) {
        if (f > 0.5f && !this.changeStatusBar) {
            this.changeStatusBar = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z, f);
    }

    public final void scrollToReset() {
        View currentView = this.pager.getCurrentView();
        if (currentView instanceof ListView) {
            ListView listView = (ListView) currentView;
            listView.getClass();
            listView.highlightRowInternal(new DataUsage2Activity$ListView$$ExternalSyntheticLambda0(listView), 700, true);
        }
    }

    public final class ItemInner extends AdapterWithDiffUtils.Item {
        public final int imageColorBottom;
        public final int imageColorTop;
        public final int imageResId;
        public final int index;
        public final CharSequence text;
        public final String valueText;

        public ItemInner(int i, String str) {
            super(i, false);
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ItemInner)) {
                return false;
            }
            ItemInner itemInner = (ItemInner) obj;
            int i = itemInner.viewType;
            int i2 = this.viewType;
            if (i != i2) {
                return false;
            }
            CharSequence charSequence = this.text;
            CharSequence charSequence2 = itemInner.text;
            if (i2 == 1 || i2 == 4 || i2 == 3 || i2 == 5) {
                return TextUtils.equals(charSequence, charSequence2);
            }
            if (i2 == 2) {
                return itemInner.index == this.index && TextUtils.equals(charSequence, charSequence2) && itemInner.imageColorTop == this.imageColorTop && itemInner.imageColorBottom == this.imageColorBottom && itemInner.imageResId == this.imageResId;
            }
            return true;
        }

        public ItemInner(String str) {
            super(5, false);
            this.text = str;
        }

        public ItemInner(int i, int i2, int i3, int i4, CharSequence charSequence, String str) {
            super(2, false);
            this.index = i;
            this.imageResId = i2;
            this.imageColorTop = i3;
            this.imageColorBottom = i4;
            this.text = charSequence;
            this.valueText = str;
        }
    }
}
