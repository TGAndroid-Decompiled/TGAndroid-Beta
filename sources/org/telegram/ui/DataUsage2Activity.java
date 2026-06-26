package org.telegram.ui;

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
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.StatsController;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.CacheChart;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.DataUsage2Activity;
import org.telegram.ui.SettingsActivity;

public class DataUsage2Activity extends BaseFragment {
    private boolean changeStatusBar;
    private ViewPagerFixed.Adapter pageAdapter;
    private ViewPagerFixed pager;
    private Theme.ResourcesProvider resourcesProvider;
    private ViewPagerFixed.TabsView tabsView;
    private static final int[][] colors2 = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    private static int[] colors = {Theme.key_statisticChartLine_blue, Theme.key_statisticChartLine_green, Theme.key_statisticChartLine_lightblue, Theme.key_statisticChartLine_golden, Theme.key_statisticChartLine_red, Theme.key_statisticChartLine_purple, Theme.key_statisticChartLine_cyan};
    private static int[] particles = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    private static int[] titles = {R.string.LocalVideoCache, R.string.LocalDocumentCache, R.string.LocalPhotoCache, R.string.MessagesSettings, R.string.LocalMusicCache, R.string.LocalAudioCache, R.string.CallsDataUsage};
    private static int[] stats = {2, 5, 4, 1, 7, 3, 0};

    public DataUsage2Activity() {
        this(null);
    }

    public DataUsage2Activity(Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
    }

    @Override
    public View createView(Context context) {
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
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i3) {
                if (i3 == -1) {
                    DataUsage2Activity.this.finishFragment();
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            protected void onMeasure(int i3, int i4) {
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4), 1073741824));
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                if (DataUsage2Activity.this.getParentLayout() == null || DataUsage2Activity.this.tabsView == null) {
                    return;
                }
                float measuredHeight = DataUsage2Activity.this.tabsView.getMeasuredHeight();
                canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, Theme.dividerPaint);
            }
        };
        frameLayout.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context);
        this.pager = viewPagerFixed;
        PageAdapter pageAdapter = new PageAdapter();
        this.pageAdapter = pageAdapter;
        viewPagerFixed.setAdapter(pageAdapter);
        ViewPagerFixed.TabsView tabsViewCreateTabsView = this.pager.createTabsView(true, 8);
        this.tabsView = tabsViewCreateTabsView;
        tabsViewCreateTabsView.setBackgroundColor(getThemedColor(i));
        frameLayout.addView(this.tabsView, LayoutHelper.createFrame(-1, 48, 55));
        frameLayout.addView(this.pager, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 48.0f, 0.0f, 0.0f));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public void selectTab(int i) {
        this.tabsView.scrollToTab(i, i);
    }

    public void scrollToReset() {
        View currentView = this.pager.getCurrentView();
        if (currentView instanceof ListView) {
            ((ListView) currentView).scrollTo(5);
        }
    }

    @Override
    public Theme.ResourcesProvider getResourceProvider() {
        return this.resourcesProvider;
    }

    private class PageAdapter extends ViewPagerFixed.Adapter {
        @Override
        public int getItemCount() {
            return 4;
        }

        private PageAdapter() {
        }

        @Override
        public View createView(int i) {
            DataUsage2Activity dataUsage2Activity = DataUsage2Activity.this;
            return dataUsage2Activity.new ListView(dataUsage2Activity.getContext());
        }

        @Override
        public void bindView(View view, int i, int i2) {
            ListView listView = (ListView) view;
            listView.setType(i);
            listView.scrollToPosition(0);
        }

        @Override
        public String getItemTitle(int i) {
            if (i == 0) {
                return LocaleController.getString(R.string.NetworkUsageAllTab);
            }
            if (i == 1) {
                return LocaleController.getString(R.string.NetworkUsageMobileTab);
            }
            if (i == 2) {
                return LocaleController.getString(R.string.NetworkUsageWiFiTab);
            }
            if (i == 3) {
                return LocaleController.getString(R.string.NetworkUsageRoamingTab);
            }
            return "";
        }
    }

    class ListView extends RecyclerListView {
        Adapter adapter;
        private boolean animateChart;
        private CacheChart chart;
        private Size[] chartSegments;
        private boolean[] collapsed;
        int currentType;
        private boolean empty;
        private ArrayList itemInners;
        LinearLayoutManager layoutManager;
        private ArrayList oldItems;
        private ArrayList removedSegments;
        private Size[] segments;
        private int[] tempPercents;
        private float[] tempSizes;
        private long totalSize;
        private long totalSizeIn;
        private long totalSizeOut;

        public ListView(Context context) {
            super(context);
            this.animateChart = false;
            this.currentType = 0;
            this.oldItems = new ArrayList();
            this.itemInners = new ArrayList();
            this.tempSizes = new float[7];
            this.tempPercents = new int[7];
            this.removedSegments = new ArrayList();
            this.collapsed = new boolean[7];
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            this.layoutManager = linearLayoutManager;
            setLayoutManager(linearLayoutManager);
            Adapter adapter = new Adapter();
            this.adapter = adapter;
            setAdapter(adapter);
            setSections();
            setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i) {
                    this.f$0.lambda$new$1(view, i);
                }
            });
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setDurations(220L);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setSupportsChangeAnimations(false);
            setItemAnimator(defaultItemAnimator);
        }

        public void lambda$new$1(View view, int i) {
            if ((view instanceof Cell) && i >= 0 && i < this.itemInners.size()) {
                ItemInner itemInner = (ItemInner) this.itemInners.get(i);
                if (itemInner != null) {
                    int i2 = itemInner.index;
                    if (i2 >= 0) {
                        this.collapsed[i2] = !r0[i2];
                        updateRows(true);
                        return;
                    } else {
                        if (i2 == -2) {
                            DataUsage2Activity.this.presentFragment(new DataAutoDownloadActivity(this.currentType - 1));
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (view instanceof TextCell) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DataUsage2Activity.this.getParentActivity());
                builder.setTitle(LocaleController.getString(R.string.ResetStatisticsAlertTitle));
                builder.setMessage(LocaleController.getString(R.string.ResetStatisticsAlert));
                builder.setPositiveButton(LocaleController.getString(R.string.Reset), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i3) {
                        this.f$0.lambda$new$0(alertDialog, i3);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                AlertDialog alertDialogCreate = builder.create();
                DataUsage2Activity.this.showDialog(alertDialogCreate);
                TextView textView = (TextView) alertDialogCreate.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                }
            }
        }

        public void lambda$new$0(AlertDialog alertDialog, int i) {
            this.removedSegments.clear();
            int i2 = 0;
            while (true) {
                Size[] sizeArr = this.segments;
                if (i2 >= sizeArr.length) {
                    StatsController.getInstance(((BaseFragment) DataUsage2Activity.this).currentAccount).resetStats(0);
                    StatsController.getInstance(((BaseFragment) DataUsage2Activity.this).currentAccount).resetStats(1);
                    StatsController.getInstance(((BaseFragment) DataUsage2Activity.this).currentAccount).resetStats(2);
                    this.animateChart = true;
                    setup();
                    updateRows(true);
                    return;
                }
                Size size = sizeArr[i2];
                if (size.size > 0) {
                    this.removedSegments.add(Integer.valueOf(size.index));
                }
                i2++;
            }
        }

        public void setType(int i) {
            this.currentType = i;
            this.removedSegments.clear();
            this.empty = getBytesCount(6) <= 0;
            setup();
            updateRows(false);
        }

        private void setup() {
            this.totalSize = getBytesCount(6);
            this.totalSizeIn = getReceivedBytesCount(6);
            this.totalSizeOut = getSentBytesCount(6);
            if (this.segments == null) {
                this.segments = new Size[7];
            }
            if (this.chartSegments == null) {
                this.chartSegments = new Size[7];
            }
            for (int i = 0; i < DataUsage2Activity.stats.length; i++) {
                long bytesCount = getBytesCount(DataUsage2Activity.stats[i]);
                Size[] sizeArr = this.chartSegments;
                Size[] sizeArr2 = this.segments;
                Size size = new Size(i, bytesCount, getReceivedBytesCount(DataUsage2Activity.stats[i]), getSentBytesCount(DataUsage2Activity.stats[i]), getReceivedItemsCount(DataUsage2Activity.stats[i]), getSentItemsCount(DataUsage2Activity.stats[i]));
                sizeArr2[i] = size;
                sizeArr[i] = size;
                this.tempSizes[i] = bytesCount / this.totalSize;
            }
            Arrays.sort(this.segments, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return DataUsage2Activity.ListView.lambda$setup$2((DataUsage2Activity.ListView.Size) obj, (DataUsage2Activity.ListView.Size) obj2);
                }
            });
            AndroidUtilities.roundPercents(this.tempSizes, this.tempPercents);
            Arrays.fill(this.collapsed, true);
        }

        public static int lambda$setup$2(Size size, Size size2) {
            return Long.compare(size2.size, size.size);
        }

        private String formatPercent(int i) {
            return i <= 0 ? String.format("<%d%%", 1) : String.format("%d%%", Integer.valueOf(i));
        }

        class Size extends CacheChart.SegmentSize {
            int inCount;
            long inSize;
            int index;
            int outCount;
            long outSize;

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

        private void updateRows(boolean z) {
            String string;
            String string2;
            this.oldItems.clear();
            this.oldItems.addAll(this.itemInners);
            this.itemInners.clear();
            this.itemInners.add(new ItemInner(0));
            long j = 0;
            if (this.totalSize > 0) {
                string = LocaleController.formatString(R.string.YourNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(getResetStatsDate()));
            } else {
                string = LocaleController.formatString(R.string.NoNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(getResetStatsDate()));
            }
            this.itemInners.add(ItemInner.asSubtitle(string));
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                Size[] sizeArr = this.segments;
                if (i >= sizeArr.length) {
                    break;
                }
                Size size = sizeArr[i];
                long j2 = size.size;
                int i2 = size.index;
                boolean z2 = this.empty || this.removedSegments.contains(Integer.valueOf(i2));
                if (j2 > j || z2) {
                    SpannableString spannableString = new SpannableString(formatPercent(this.tempPercents[i2]));
                    spannableString.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    spannableString.setSpan(new RelativeSizeSpan(0.8f), 0, spannableString.length(), 33);
                    spannableString.setSpan(DataUsage2Activity.this.new CustomCharacterSpan(0.1d), 0, spannableString.length(), 33);
                    arrayList.add(ItemInner.asCell(i, DataUsage2Activity.particles[i2], DataUsage2Activity.colors2[i2][0], DataUsage2Activity.colors2[i2][1], j2 == j ? LocaleController.getString(DataUsage2Activity.titles[i2]) : TextUtils.concat(LocaleController.getString(DataUsage2Activity.titles[i2]), "  ", spannableString), AndroidUtilities.formatFileSize(j2)));
                }
                i++;
                j = 0;
            }
            if (!arrayList.isEmpty()) {
                SpannableString spannableString2 = new SpannableString("^");
                Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_upload).mutate();
                int i3 = Theme.key_windowBackgroundWhiteBlackText;
                int themedColor = getThemedColor(i3);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
                drawableMutate.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
                spannableString2.setSpan(new ImageSpan(drawableMutate, 2), 0, 1, 33);
                SpannableString spannableString3 = new SpannableString("v");
                Drawable drawableMutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
                drawableMutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i3), mode));
                drawableMutate2.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
                spannableString3.setSpan(new ImageSpan(drawableMutate2, 2), 0, 1, 33);
                int i4 = 0;
                while (i4 < arrayList.size()) {
                    int i5 = ((ItemInner) arrayList.get(i4)).index;
                    if (i5 >= 0 && !this.collapsed[i5]) {
                        Size size2 = this.segments[i5];
                        if (DataUsage2Activity.stats[size2.index] == 0) {
                            if (size2.outSize > 0 || size2.outCount > 0) {
                                i4++;
                                arrayList.add(i4, ItemInner.asCell(-1, 0, 0, LocaleController.formatPluralStringComma("OutgoingCallsCount", size2.outCount), AndroidUtilities.formatFileSize(size2.outSize)));
                            }
                            if (size2.inSize > 0 || size2.inCount > 0) {
                                i4++;
                                arrayList.add(i4, ItemInner.asCell(-1, 0, 0, LocaleController.formatPluralStringComma("IncomingCallsCount", size2.inCount), AndroidUtilities.formatFileSize(size2.inSize)));
                            }
                        } else if (DataUsage2Activity.stats[size2.index] != 1) {
                            if (size2.outSize > 0 || size2.outCount > 0) {
                                i4++;
                                arrayList.add(i4, ItemInner.asCell(-1, 0, 0, TextUtils.concat(spannableString2, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesSentCount", size2.outCount))), AndroidUtilities.formatFileSize(size2.outSize)));
                            }
                            if (size2.inSize > 0 || size2.inCount > 0) {
                                i4++;
                                arrayList.add(i4, ItemInner.asCell(-1, 0, 0, TextUtils.concat(spannableString3, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesReceivedCount", size2.inCount))), AndroidUtilities.formatFileSize(size2.inSize)));
                            }
                        } else {
                            if (size2.outSize > 0 || size2.outCount > 0) {
                                i4++;
                                arrayList.add(i4, ItemInner.asCell(-1, 0, 0, TextUtils.concat(spannableString2, " ", LocaleController.getString(R.string.BytesSent)), AndroidUtilities.formatFileSize(size2.outSize)));
                            }
                            if (size2.inSize > 0 || size2.inCount > 0) {
                                i4++;
                                arrayList.add(i4, ItemInner.asCell(-1, 0, 0, TextUtils.concat(spannableString3, " ", LocaleController.getString(R.string.BytesReceived)), AndroidUtilities.formatFileSize(size2.inSize)));
                            }
                        }
                    }
                    i4++;
                }
                this.itemInners.addAll(arrayList);
                if (!this.empty) {
                    this.itemInners.add(ItemInner.asSeparator(LocaleController.getString(R.string.DataUsageSectionsInfo) + "\n"));
                }
            }
            if (!this.empty) {
                this.itemInners.add(ItemInner.asHeader(LocaleController.getString(R.string.TotalNetworkUsage)));
                this.itemInners.add(ItemInner.asCell(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, LocaleController.getString(R.string.BytesSent), AndroidUtilities.formatFileSize(this.totalSizeOut)));
                this.itemInners.add(ItemInner.asCell(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, LocaleController.getString(R.string.BytesReceived), AndroidUtilities.formatFileSize(this.totalSizeIn)));
            }
            if (!arrayList.isEmpty()) {
                this.itemInners.add(ItemInner.asSeparator(string));
            }
            if (this.currentType != 0) {
                if (arrayList.isEmpty()) {
                    this.itemInners.add(ItemInner.asSeparator());
                }
                this.itemInners.add(ItemInner.asCell(-2, R.drawable.msg_download_settings, -11565578, -13276952, LocaleController.getString(R.string.AutomaticDownloadSettings), null));
                int i6 = this.currentType;
                if (i6 == 1) {
                    string2 = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoMobile);
                } else if (i6 == 3) {
                    string2 = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoRoaming);
                } else {
                    string2 = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoWiFi);
                }
                this.itemInners.add(ItemInner.asSeparator(string2));
            }
            if (!arrayList.isEmpty()) {
                this.itemInners.add(new ItemInner(5, LocaleController.getString(R.string.ResetStatistics)));
            }
            this.itemInners.add(ItemInner.asSeparator());
            Adapter adapter = this.adapter;
            if (adapter != null) {
                if (z) {
                    adapter.setItems(this.oldItems, this.itemInners);
                } else {
                    adapter.notifyDataSetChanged();
                }
            }
        }

        public void scrollTo(final int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            highlightRow(new RecyclerListView.IntReturnCallback() {
                @Override
                public final int run() {
                    return this.f$0.lambda$scrollTo$3(i);
                }
            });
        }

        public int lambda$scrollTo$3(int i) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.itemInners.size()) {
                    i2 = -1;
                    break;
                }
                if (((ItemInner) this.itemInners.get(i2)).viewType == i) {
                    break;
                }
                i2++;
            }
            if (i2 < 0) {
                return -1;
            }
            this.layoutManager.scrollToPositionWithOffset(i2, AndroidUtilities.dp(60.0f));
            return i2;
        }

        class Adapter extends AdapterWithDiffUtils {
            private Adapter() {
            }

            class AnonymousClass1 extends CacheChart {
                public static int lambda$onSectionDown$0(int i) {
                    return i;
                }

                @Override
                protected int heightDp() {
                    return 216;
                }

                @Override
                protected int padInsideDp() {
                    return 10;
                }

                AnonymousClass1(Context context, int i, int[] iArr, int i2, int[] iArr2) {
                    super(context, i, iArr, i2, iArr2);
                }

                @Override
                protected void onSectionDown(int i, boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                    final int i2;
                    if (z) {
                        if (i < 0 || i >= ListView.this.segments.length) {
                            return;
                        }
                        int i3 = 0;
                        while (true) {
                            i2 = -1;
                            if (i3 >= ListView.this.segments.length) {
                                i3 = -1;
                                break;
                            } else if (ListView.this.segments[i3].index == i) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        int i4 = 0;
                        while (true) {
                            if (i4 < ListView.this.itemInners.size()) {
                                ItemInner itemInner = (ItemInner) ListView.this.itemInners.get(i4);
                                if (itemInner != null && itemInner.viewType == 2 && itemInner.index == i3) {
                                    i2 = i4;
                                    break;
                                }
                                i4++;
                            } else {
                                break;
                            }
                        }
                        if (i2 >= 0) {
                            ListView.this.highlightRow(new RecyclerListView.IntReturnCallback() {
                                @Override
                                public final int run() {
                                    return DataUsage2Activity.ListView.Adapter.AnonymousClass1.lambda$onSectionDown$0(i2);
                                }
                            }, 0);
                            return;
                        } else {
                            ListView.this.removeHighlightRow();
                            return;
                        }
                    }
                    ListView.this.removeHighlightRow();
                }
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View subtitleCell;
                View textInfoPrivacyCell;
                if (i == 0) {
                    ListView.this.chart = new AnonymousClass1(ListView.this.getContext(), DataUsage2Activity.colors.length, DataUsage2Activity.colors, 1, DataUsage2Activity.particles);
                    ListView.this.chart.setInterceptTouch(false);
                    subtitleCell = ListView.this.chart;
                    subtitleCell.setTag(-33024);
                } else if (i == 1) {
                    ListView listView = ListView.this;
                    subtitleCell = DataUsage2Activity.this.new SubtitleCell(listView.getContext());
                    subtitleCell.setTag(-33024);
                } else {
                    if (i == 3) {
                        textInfoPrivacyCell = new TextInfoPrivacyCell(ListView.this.getContext());
                    } else if (i == 4) {
                        HeaderCell headerCell = new HeaderCell(ListView.this.getContext());
                        headerCell.setBackgroundColor(ListView.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        textInfoPrivacyCell = headerCell;
                    } else if (i == 5) {
                        TextCell textCell = new TextCell(ListView.this.getContext());
                        textCell.setTextColor(ListView.this.getThemedColor(Theme.key_text_RedRegular));
                        textCell.setBackgroundColor(ListView.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        textInfoPrivacyCell = textCell;
                    } else if (i == 6) {
                        textInfoPrivacyCell = new RoundingCell(ListView.this.getContext());
                    } else if (i == 7) {
                        textInfoPrivacyCell = new View(ListView.this.getContext()) {
                            {
                                setBackgroundColor(ListView.this.getThemedColor(Theme.key_windowBackgroundWhite));
                            }

                            @Override
                            protected void onMeasure(int i2, int i3) {
                                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(4.0f), 1073741824));
                            }
                        };
                    } else {
                        ListView listView2 = ListView.this;
                        textInfoPrivacyCell = DataUsage2Activity.this.new Cell(listView2.getContext());
                    }
                    return new RecyclerListView.Holder(textInfoPrivacyCell);
                }
                textInfoPrivacyCell = subtitleCell;
                return new RecyclerListView.Holder(textInfoPrivacyCell);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                int i2;
                ItemInner itemInner = (ItemInner) ListView.this.itemInners.get(viewHolder.getAdapterPosition());
                int itemViewType = viewHolder.getItemViewType();
                if (itemViewType == 0) {
                    CacheChart cacheChart = (CacheChart) viewHolder.itemView;
                    if (ListView.this.segments != null) {
                        cacheChart.setSegments(ListView.this.totalSize, ListView.this.animateChart, ListView.this.chartSegments);
                    }
                    ListView.this.animateChart = false;
                    return;
                }
                if (itemViewType == 1) {
                    ((SubtitleCell) viewHolder.itemView).setText(itemInner.text);
                    return;
                }
                if (itemViewType == 2) {
                    Cell cell = (Cell) viewHolder.itemView;
                    int i3 = i + 1;
                    cell.set(itemInner.imageColorTop, itemInner.imageColorBottom, itemInner.imageResId, itemInner.text, itemInner.valueText, i3 < getItemCount() && ((ItemInner) ListView.this.itemInners.get(i3)).viewType == itemViewType);
                    cell.setArrow((itemInner.pad || (i2 = itemInner.index) < 0 || (i2 < ListView.this.segments.length && ListView.this.segments[itemInner.index].size <= 0)) ? null : Boolean.valueOf(ListView.this.collapsed[itemInner.index]));
                    return;
                }
                if (itemViewType == 3) {
                    ((TextInfoPrivacyCell) viewHolder.itemView).setText(itemInner.text);
                    return;
                }
                if (itemViewType == 4) {
                    ((HeaderCell) viewHolder.itemView).setText(itemInner.text);
                } else if (itemViewType == 5) {
                    ((TextCell) viewHolder.itemView).setText(itemInner.text.toString(), false);
                } else if (itemViewType == 6) {
                    ((RoundingCell) viewHolder.itemView).setTop(true);
                }
            }

            @Override
            public int getItemCount() {
                return ListView.this.itemInners.size();
            }

            @Override
            public int getItemViewType(int i) {
                return ((ItemInner) ListView.this.itemInners.get(i)).viewType;
            }

            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                ItemInner itemInner = (ItemInner) ListView.this.itemInners.get(viewHolder.getAdapterPosition());
                int i = itemInner.viewType;
                return i == 5 || (i == 2 && itemInner.index != -1);
            }
        }

        private int getSentItemsCount(int i) {
            int i2 = this.currentType;
            return (i2 == 1 || i2 == 2 || i2 == 3) ? StatsController.getInstance(((BaseFragment) DataUsage2Activity.this).currentAccount).getSentItemsCount(this.currentType - 1, i) : StatsController.getInstance(((BaseFragment) DataUsage2Activity.this).currentAccount).getSentItemsCount(0, i) + StatsController.getInstance(((BaseFragment) DataUsage2Activity.this).currentAccount).getSentItemsCount(1, i) + StatsController.getInstance(((BaseFragment) DataUsage2Activity.this).currentAccount).getSentItemsCount(2, i);
        }

        private int getReceivedItemsCount(int i) {
            int i2 = this.currentType;
            return (i2 == 1 || i2 == 2 || i2 == 3) ? StatsController.getInstance(((BaseFragment) DataUsage2Activity.this).currentAccount).getRecivedItemsCount(this.currentType - 1, i) : StatsController.getInstance(((BaseFragment) DataUsage2Activity.this).currentAccount).getRecivedItemsCount(0, i) + StatsController.getInstance(((BaseFragment) DataUsage2Activity.this).currentAccount).getRecivedItemsCount(1, i) + StatsController.getInstance(((BaseFragment) DataUsage2Activity.this).currentAccount).getRecivedItemsCount(2, i);
        }

        private long getBytesCount(int i) {
            return getSentBytesCount(i) + getReceivedBytesCount(i);
        }

        private long getSentBytesCount(int i) {
            int i2 = this.currentType;
            return (i2 == 1 || i2 == 2 || i2 == 3) ? StatsController.getInstance(((BaseFragment) DataUsage2Activity.this).currentAccount).getSentBytesCount(this.currentType - 1, i) : StatsController.getInstance(((BaseFragment) DataUsage2Activity.this).currentAccount).getSentBytesCount(0, i) + StatsController.getInstance(((BaseFragment) DataUsage2Activity.this).currentAccount).getSentBytesCount(1, i) + StatsController.getInstance(((BaseFragment) DataUsage2Activity.this).currentAccount).getSentBytesCount(2, i);
        }

        private long getReceivedBytesCount(int i) {
            int i2 = this.currentType;
            return (i2 == 1 || i2 == 2 || i2 == 3) ? StatsController.getInstance(((BaseFragment) DataUsage2Activity.this).currentAccount).getReceivedBytesCount(this.currentType - 1, i) : StatsController.getInstance(((BaseFragment) DataUsage2Activity.this).currentAccount).getReceivedBytesCount(0, i) + StatsController.getInstance(((BaseFragment) DataUsage2Activity.this).currentAccount).getReceivedBytesCount(1, i) + StatsController.getInstance(((BaseFragment) DataUsage2Activity.this).currentAccount).getReceivedBytesCount(2, i);
        }

        private long getResetStatsDate() {
            int i = this.currentType;
            if (i == 1 || i == 2 || i == 3) {
                return StatsController.getInstance(((BaseFragment) DataUsage2Activity.this).currentAccount).getResetStatsDate(this.currentType - 1);
            }
            return min(StatsController.getInstance(((BaseFragment) DataUsage2Activity.this).currentAccount).getResetStatsDate(0), StatsController.getInstance(((BaseFragment) DataUsage2Activity.this).currentAccount).getResetStatsDate(1), StatsController.getInstance(((BaseFragment) DataUsage2Activity.this).currentAccount).getResetStatsDate(2));
        }

        private long min(long... jArr) {
            long j = Long.MAX_VALUE;
            for (long j2 : jArr) {
                if (j > j2) {
                    j = j2;
                }
            }
            return j;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        }
    }

    private static class ItemInner extends AdapterWithDiffUtils.Item {
        public int imageColorBottom;
        public int imageColorTop;
        public int imageResId;
        public int index;
        public int key;
        public boolean pad;
        public CharSequence text;
        public CharSequence valueText;

        public ItemInner(int i) {
            super(i, false);
        }

        private ItemInner(int i, CharSequence charSequence) {
            super(i, false);
            this.text = charSequence;
        }

        private ItemInner(int i, int i2, int i3, int i4, int i5, CharSequence charSequence, CharSequence charSequence2) {
            super(i, false);
            this.index = i2;
            this.imageResId = i3;
            this.imageColorTop = i4;
            this.imageColorBottom = i5;
            this.text = charSequence;
            this.valueText = charSequence2;
        }

        public static ItemInner asSeparator() {
            return new ItemInner(3);
        }

        public static ItemInner asSeparator(String str) {
            return new ItemInner(3, str);
        }

        public static ItemInner asHeader(String str) {
            return new ItemInner(4, str);
        }

        public static ItemInner asSubtitle(String str) {
            return new ItemInner(1, str);
        }

        public static ItemInner asCell(int i, int i2, int i3, int i4, CharSequence charSequence, CharSequence charSequence2) {
            return new ItemInner(2, i, i2, i3, i4, charSequence, charSequence2);
        }

        public static ItemInner asCell(int i, int i2, int i3, CharSequence charSequence, CharSequence charSequence2) {
            return new ItemInner(2, i, i2, i3, i3, charSequence, charSequence2);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ItemInner)) {
                return false;
            }
            ItemInner itemInner = (ItemInner) obj;
            int i = itemInner.viewType;
            int i2 = this.viewType;
            if (i != i2) {
                return false;
            }
            if (i2 == 1 || i2 == 4 || i2 == 3 || i2 == 5) {
                return TextUtils.equals(this.text, itemInner.text);
            }
            return i2 == 2 ? itemInner.index == this.index && TextUtils.equals(this.text, itemInner.text) && itemInner.imageColorTop == this.imageColorTop && itemInner.imageColorBottom == this.imageColorBottom && itemInner.imageResId == this.imageResId : itemInner.key == this.key;
        }
    }

    class SubtitleCell extends FrameLayout {
        TextView textView;

        public SubtitleCell(Context context) {
            super(context);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setGravity(17);
            this.textView.setTextSize(1, 13.0f);
            this.textView.setTextColor(DataUsage2Activity.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
            addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 14.0f));
        }

        public void setText(CharSequence charSequence) {
            this.textView.setText(charSequence);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }
    }

    public static class RoundingCell extends View {
        Paint paint;
        Path path;
        private boolean top;

        public RoundingCell(Context context) {
            super(context);
            this.path = new Path();
            Paint paint = new Paint(1);
            this.paint = paint;
            this.top = true;
            paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(-0.66f), 251658240);
            this.paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        }

        public void setTop(boolean z) {
            this.path.rewind();
            this.top = z;
            if (z) {
                float fDp = AndroidUtilities.dp(14.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.dp(4.0f), getMeasuredWidth(), AndroidUtilities.dp(4.0f) + (getMeasuredHeight() * 2));
                this.path.addRoundRect(rectF, fDp, fDp, Path.Direction.CW);
                return;
            }
            float fDp2 = AndroidUtilities.dp(8.0f);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, ((-getMeasuredHeight()) * 2) - AndroidUtilities.dp(4.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(4.0f));
            this.path.addRoundRect(rectF2, fDp2, fDp2, Path.Direction.CW);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawPath(this.path, this.paint);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(13.0f), 1073741824));
            setTop(this.top);
        }

        @Override
        protected void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            requestLayout();
        }
    }

    class Cell extends FrameLayout {
        ImageView arrowView;
        boolean divider;
        ImageView imageView;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        TextView textView;
        TextView valueTextView;

        public Cell(Context context) {
            super(context);
            setBackgroundColor(DataUsage2Activity.this.getThemedColor(Theme.key_windowBackgroundWhite));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.imageView, LayoutHelper.createFrame(28, 28.0f, (LocaleController.isRTL ? 5 : 3) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayout = linearLayout;
            linearLayout.setOrientation(0);
            this.linearLayout.setWeightSum(2.0f);
            addView(this.linearLayout, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 64.0f, 0.0f, 20.0f, 0.0f));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.linearLayout2 = linearLayout2;
            linearLayout2.setOrientation(0);
            if (LocaleController.isRTL) {
                this.linearLayout2.setGravity(5);
            }
            this.linearLayout2.setWeightSum(2.0f);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 16.0f);
            TextView textView2 = this.textView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView2.setTextColor(DataUsage2Activity.this.getThemedColor(i));
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setSingleLine();
            this.textView.setLines(1);
            ImageView imageView2 = new ImageView(context);
            this.arrowView = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.arrowView.setImageResource(R.drawable.arrow_more);
            this.arrowView.setColorFilter(new PorterDuffColorFilter(DataUsage2Activity.this.getThemedColor(i), PorterDuff.Mode.MULTIPLY));
            this.arrowView.setTranslationY(AndroidUtilities.dp(1.0f));
            this.arrowView.setVisibility(8);
            if (LocaleController.isRTL) {
                this.linearLayout2.addView(this.arrowView, LayoutHelper.createLinear(16, 16, 21, 3, 0, 0, 0));
                this.linearLayout2.addView(this.textView, LayoutHelper.createLinear(-2, -2, 21));
            } else {
                this.linearLayout2.addView(this.textView, LayoutHelper.createLinear(-2, -2, 16));
                this.linearLayout2.addView(this.arrowView, LayoutHelper.createLinear(16, 16, 16, 3, 0, 0, 0));
            }
            TextView textView3 = new TextView(context);
            this.valueTextView = textView3;
            textView3.setTextSize(1, 16.0f);
            this.valueTextView.setTextColor(DataUsage2Activity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlueText2));
            this.valueTextView.setGravity(LocaleController.isRTL ? 3 : 5);
            if (LocaleController.isRTL) {
                this.linearLayout.addView(this.valueTextView, LayoutHelper.createLinear(-2, -2, 19));
                this.linearLayout.addView(this.linearLayout2, LayoutHelper.createLinear(0, -2, 2.0f, 21));
            } else {
                this.linearLayout.addView(this.linearLayout2, LayoutHelper.createLinear(0, -2, 2.0f, 16));
                this.linearLayout.addView(this.valueTextView, LayoutHelper.createLinear(-2, -2, 21));
            }
        }

        public void set(int i, int i2, int i3, CharSequence charSequence, CharSequence charSequence2, boolean z) {
            if (i3 == 0) {
                this.imageView.setVisibility(8);
            } else {
                this.imageView.setVisibility(0);
                boolean zIsDark = DataUsage2Activity.this.resourcesProvider != null ? DataUsage2Activity.this.resourcesProvider.isDark() : Theme.isCurrentThemeDark();
                SettingsActivity.SettingCell.Background background = new SettingsActivity.SettingCell.Background();
                background.setColor(i, i2);
                background.setDrawBorder(zIsDark);
                this.imageView.setBackground(background);
                this.imageView.setImageResource(i3);
            }
            this.textView.setText(charSequence);
            this.valueTextView.setText(charSequence2);
            this.divider = z;
            setWillNotDraw(!z);
        }

        public void setArrow(Boolean bool) {
            if (bool == null) {
                this.arrowView.setVisibility(8);
            } else {
                this.arrowView.setVisibility(0);
                this.arrowView.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.divider) {
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(64.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }
    }

    public class CustomCharacterSpan extends MetricAffectingSpan {
        double ratio;

        public CustomCharacterSpan(double d) {
            this.ratio = d;
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            textPaint.baselineShift += (int) (textPaint.ascent() * this.ratio);
        }

        @Override
        public void updateMeasureState(TextPaint textPaint) {
            textPaint.baselineShift += (int) (textPaint.ascent() * this.ratio);
        }
    }

    @Override
    public void onTransitionAnimationProgress(boolean z, float f) {
        if (f > 0.5f && !this.changeStatusBar) {
            this.changeStatusBar = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z, f);
    }

    @Override
    public boolean isLightStatusBar() {
        if (this.changeStatusBar) {
            return AndroidUtilities.computePerceivedBrightness(Theme.getColor(Theme.key_actionBarActionModeDefault)) > 0.721f;
        }
        return super.isLightStatusBar();
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return (motionEvent != null && motionEvent.getY() <= ((float) (ActionBar.getCurrentActionBarHeight() + AndroidUtilities.dp(48.0f)))) || this.pager.getCurrentPosition() == 0;
    }
}
