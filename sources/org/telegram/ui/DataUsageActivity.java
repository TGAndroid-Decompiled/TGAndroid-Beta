package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.StatsController;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

public class DataUsageActivity extends BaseFragment {
    private static final Interpolator interpolator = new DataUsageActivity$$ExternalSyntheticLambda1(0);
    private boolean animatingForward;
    private boolean backAnimation;
    private Paint backgroundPaint;
    private int maximumVelocity;
    private ListAdapter mobileAdapter;
    private ListAdapter roamingAdapter;
    private ScrollSlidingTextTabStrip scrollSlidingTextTabStrip;
    private boolean swipeBackEnabled;
    private AnimatorSet tabsAnimation;
    private boolean tabsAnimationInProgress;
    private ViewPage[] viewPages;
    private ListAdapter wifiAdapter;

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private int currentType;
        private Context mContext;
        private int photosSectionRow = 0;
        private int photosSentRow = 1;
        private int photosReceivedRow = 2;
        private int photosBytesSentRow = 3;
        private int photosBytesReceivedRow = 4;
        private int photosSection2Row = 5;
        private int videosSectionRow = 6;
        private int videosSentRow = 7;
        private int videosReceivedRow = 8;
        private int videosBytesSentRow = 9;
        private int videosBytesReceivedRow = 10;
        private int videosSection2Row = 11;
        private int audiosSectionRow = 12;
        private int audiosSentRow = 13;
        private int audiosReceivedRow = 14;
        private int audiosBytesSentRow = 15;
        private int audiosBytesReceivedRow = 16;
        private int audiosSection2Row = 17;
        private int filesSectionRow = 18;
        private int filesSentRow = 19;
        private int filesReceivedRow = 20;
        private int filesBytesSentRow = 21;
        private int filesBytesReceivedRow = 22;
        private int filesSection2Row = 23;
        private int callsSectionRow = 24;
        private int callsSentRow = 25;
        private int callsReceivedRow = 26;
        private int callsBytesSentRow = 27;
        private int callsBytesReceivedRow = 28;
        private int callsTotalTimeRow = 29;
        private int callsSection2Row = 30;
        private int messagesSectionRow = 31;
        private int messagesSentRow = -1;
        private int messagesReceivedRow = -1;
        private int messagesBytesSentRow = 32;
        private int messagesBytesReceivedRow = 33;
        private int messagesSection2Row = 34;
        private int totalSectionRow = 35;
        private int totalBytesSentRow = 36;
        private int totalBytesReceivedRow = 37;
        private int totalSection2Row = 38;
        private int resetRow = 39;
        private int rowCount = 41;
        private int resetSection2Row = 40;

        public ListAdapter(Context context, int i) {
            this.mContext = context;
            this.currentType = i;
        }

        @Override
        public int getItemCount() {
            return this.rowCount;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == this.resetSection2Row) {
                return 3;
            }
            if (i == this.callsSection2Row || i == this.filesSection2Row || i == this.audiosSection2Row || i == this.videosSection2Row || i == this.photosSection2Row || i == this.messagesSection2Row || i == this.totalSection2Row) {
                return 0;
            }
            return (i == this.totalSectionRow || i == this.callsSectionRow || i == this.filesSectionRow || i == this.audiosSectionRow || i == this.videosSectionRow || i == this.photosSectionRow || i == this.messagesSectionRow) ? 2 : 1;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getAdapterPosition() == this.resetRow;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                if (i == this.resetSection2Row) {
                    viewHolder.itemView.setBackgroundDrawable(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    return;
                } else {
                    viewHolder.itemView.setBackgroundDrawable(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                    return;
                }
            }
            int i2 = 3;
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    if (itemViewType != 3) {
                        return;
                    }
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    textInfoPrivacyCell.setText(LocaleController.formatString("NetworkUsageSince", R.string.NetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(StatsController.getInstance(((BaseFragment) DataUsageActivity.this).currentAccount).getResetStatsDate(this.currentType))));
                    return;
                }
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (i == this.totalSectionRow) {
                    headerCell.setText(LocaleController.getString(R.string.TotalDataUsage));
                    return;
                }
                if (i == this.callsSectionRow) {
                    headerCell.setText(LocaleController.getString(R.string.CallsDataUsage));
                    return;
                }
                if (i == this.filesSectionRow) {
                    headerCell.setText(LocaleController.getString(R.string.FilesDataUsage));
                    return;
                }
                if (i == this.audiosSectionRow) {
                    headerCell.setText(LocaleController.getString(R.string.LocalAudioCache));
                    return;
                }
                if (i == this.videosSectionRow) {
                    headerCell.setText(LocaleController.getString(R.string.LocalVideoCache));
                    return;
                } else if (i == this.photosSectionRow) {
                    headerCell.setText(LocaleController.getString(R.string.LocalPhotoCache));
                    return;
                } else {
                    if (i == this.messagesSectionRow) {
                        headerCell.setText(LocaleController.getString(R.string.MessagesDataUsage));
                        return;
                    }
                    return;
                }
            }
            TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
            if (i == this.resetRow) {
                int i3 = Theme.key_text_RedRegular;
                textSettingsCell.setTag(Integer.valueOf(i3));
                textSettingsCell.setText(LocaleController.getString(R.string.ResetStatistics), false);
                textSettingsCell.setTextColor(Theme.getColor(null, i3, false));
                return;
            }
            int i4 = Theme.key_windowBackgroundWhiteBlackText;
            textSettingsCell.setTag(Integer.valueOf(i4));
            textSettingsCell.setTextColor(Theme.getColor(null, i4, false));
            int i5 = this.callsSentRow;
            if (i == i5 || i == this.callsReceivedRow || i == this.callsBytesSentRow || i == this.callsBytesReceivedRow) {
                i2 = 0;
            } else if (i == this.messagesSentRow || i == this.messagesReceivedRow || i == this.messagesBytesSentRow || i == this.messagesBytesReceivedRow) {
                i2 = 1;
            } else if (i == this.photosSentRow || i == this.photosReceivedRow || i == this.photosBytesSentRow || i == this.photosBytesReceivedRow) {
                i2 = 4;
            } else if (i != this.audiosSentRow && i != this.audiosReceivedRow && i != this.audiosBytesSentRow && i != this.audiosBytesReceivedRow) {
                if (i == this.videosSentRow || i == this.videosReceivedRow || i == this.videosBytesSentRow || i == this.videosBytesReceivedRow) {
                    i2 = 2;
                } else {
                    i2 = (i == this.filesSentRow || i == this.filesReceivedRow || i == this.filesBytesSentRow || i == this.filesBytesReceivedRow) ? 5 : 6;
                }
            }
            if (i == i5) {
                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.OutgoingCalls), String.format("%d", Integer.valueOf(StatsController.getInstance(((BaseFragment) DataUsageActivity.this).currentAccount).getSentItemsCount(this.currentType, i2))), false, true);
                return;
            }
            if (i == this.callsReceivedRow) {
                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.IncomingCalls), String.format("%d", Integer.valueOf(StatsController.getInstance(((BaseFragment) DataUsageActivity.this).currentAccount).getRecivedItemsCount(this.currentType, i2))), false, true);
                return;
            }
            if (i == this.callsTotalTimeRow) {
                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.CallsTotalTime), AndroidUtilities.formatShortDuration(StatsController.getInstance(((BaseFragment) DataUsageActivity.this).currentAccount).getCallsTotalTime(this.currentType)), false, false);
                return;
            }
            if (i == this.messagesSentRow || i == this.photosSentRow || i == this.videosSentRow || i == this.audiosSentRow || i == this.filesSentRow) {
                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.CountSent), String.format("%d", Integer.valueOf(StatsController.getInstance(((BaseFragment) DataUsageActivity.this).currentAccount).getSentItemsCount(this.currentType, i2))), false, true);
                return;
            }
            if (i == this.messagesReceivedRow || i == this.photosReceivedRow || i == this.videosReceivedRow || i == this.audiosReceivedRow || i == this.filesReceivedRow) {
                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.CountReceived), String.format("%d", Integer.valueOf(StatsController.getInstance(((BaseFragment) DataUsageActivity.this).currentAccount).getRecivedItemsCount(this.currentType, i2))), false, true);
                return;
            }
            if (i == this.messagesBytesSentRow || i == this.photosBytesSentRow || i == this.videosBytesSentRow || i == this.audiosBytesSentRow || i == this.filesBytesSentRow || i == this.callsBytesSentRow || i == this.totalBytesSentRow) {
                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.BytesSent), AndroidUtilities.formatFileSize(StatsController.getInstance(((BaseFragment) DataUsageActivity.this).currentAccount).getSentBytesCount(this.currentType, i2)), false, true);
                return;
            }
            if (i == this.messagesBytesReceivedRow || i == this.photosBytesReceivedRow || i == this.videosBytesReceivedRow || i == this.audiosBytesReceivedRow || i == this.filesBytesReceivedRow || i == this.callsBytesReceivedRow || i == this.totalBytesReceivedRow) {
                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.BytesReceived), AndroidUtilities.formatFileSize(StatsController.getInstance(((BaseFragment) DataUsageActivity.this).currentAccount).getReceivedBytesCount(this.currentType, i2)), false, i == this.callsBytesReceivedRow);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            View textInfoPrivacyCell;
            if (i == 0) {
                shadowSectionCell = new ShadowSectionCell(this.mContext, null, 0);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        textInfoPrivacyCell = new TextInfoPrivacyCell(this.mContext, 24, null);
                    } else {
                        shadowSectionCell = new HeaderCell(this.mContext);
                        shadowSectionCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    }
                    return zzkd.m(textInfoPrivacyCell, textInfoPrivacyCell, -2);
                }
                shadowSectionCell = new TextSettingsCell(this.mContext, null, 0);
                shadowSectionCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            }
            textInfoPrivacyCell = shadowSectionCell;
            return zzkd.m(textInfoPrivacyCell, textInfoPrivacyCell, -2);
        }
    }

    public class ViewPage extends FrameLayout {
        private LinearLayoutManager layoutManager;
        private ListAdapter listAdapter;
        private RecyclerListView listView;
        private int selectedType;

        public ViewPage(Context context) {
            super(context);
        }
    }

    public DataUsageActivity() {
        super(null);
        this.backgroundPaint = new Paint();
        this.viewPages = new ViewPage[2];
        this.swipeBackEnabled = true;
    }

    public void lambda$createView$1(ListAdapter listAdapter, AlertDialog alertDialog, int i) {
        StatsController.getInstance(this.currentAccount).resetStats(listAdapter.currentType);
        listAdapter.notifyDataSetChanged();
    }

    public void lambda$createView$2(RecyclerListView recyclerListView, View view, int i) {
        if (getParentActivity() == null) {
            return;
        }
        ListAdapter listAdapter = (ListAdapter) recyclerListView.getAdapter();
        if (i == listAdapter.resetRow) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.setTitle(LocaleController.getString(R.string.ResetStatisticsAlertTitle));
            builder.setMessage(LocaleController.getString(R.string.ResetStatisticsAlert));
            builder.setPositiveButton(LocaleController.getString(R.string.Reset), new WearAuthSheet$$ExternalSyntheticLambda3(6, this, listAdapter));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate = builder.create();
            showDialog(alertDialogCreate);
            TextView textView = (TextView) alertDialogCreate.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            }
        }
    }

    public static float lambda$static$0(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }

    public void setScrollY(float f) {
        this.actionBar.setTranslationY(f);
        int i = 0;
        while (true) {
            ViewPage[] viewPageArr = this.viewPages;
            if (i >= viewPageArr.length) {
                this.fragmentView.invalidate();
                return;
            } else {
                viewPageArr[i].listView.setPinnedSectionOffsetY((int) f);
                i++;
            }
        }
    }

    public void switchToCurrentSelectedMode(boolean z) {
        ViewPage[] viewPageArr;
        int i = 0;
        while (true) {
            viewPageArr = this.viewPages;
            if (i >= viewPageArr.length) {
                break;
            }
            viewPageArr[i].listView.stopScroll();
            i++;
        }
        RecyclerView.Adapter adapter = viewPageArr[z ? 1 : 0].listView.getAdapter();
        this.viewPages[z ? 1 : 0].listView.setPinnedHeaderShadowDrawable(null);
        if (this.viewPages[z ? 1 : 0].selectedType == 0) {
            if (adapter != this.mobileAdapter) {
                this.viewPages[z ? 1 : 0].listView.setAdapter(this.mobileAdapter);
            }
        } else if (this.viewPages[z ? 1 : 0].selectedType == 1) {
            if (adapter != this.wifiAdapter) {
                this.viewPages[z ? 1 : 0].listView.setAdapter(this.wifiAdapter);
            }
        } else if (this.viewPages[z ? 1 : 0].selectedType == 2 && adapter != this.roamingAdapter) {
            this.viewPages[z ? 1 : 0].listView.setAdapter(this.roamingAdapter);
        }
        this.viewPages[z ? 1 : 0].listView.setVisibility(0);
        if (this.actionBar.getTranslationY() != 0.0f) {
            this.viewPages[z ? 1 : 0].layoutManager.scrollToPositionWithOffset(0, (int) this.actionBar.getTranslationY());
        }
    }

    private void updateTabs() {
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = this.scrollSlidingTextTabStrip;
        if (scrollSlidingTextTabStrip == null) {
            return;
        }
        scrollSlidingTextTabStrip.addTextTab(0, LocaleController.getString(R.string.NetworkUsageMobileTab));
        this.scrollSlidingTextTabStrip.addTextTab(1, LocaleController.getString(R.string.NetworkUsageWiFiTab));
        this.scrollSlidingTextTabStrip.addTextTab(2, LocaleController.getString(R.string.NetworkUsageRoamingTab));
        this.scrollSlidingTextTabStrip.setVisibility(0);
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        int currentTabId = this.scrollSlidingTextTabStrip.getCurrentTabId();
        if (currentTabId >= 0) {
            this.viewPages[0].selectedType = currentTabId;
        }
        this.scrollSlidingTextTabStrip.finishAddingTabs();
    }

    @Override
    public View createView(Context context) {
        ViewPage viewPage;
        RecyclerListView.Holder holder;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.NetworkUsage));
        INavigationLayout iNavigationLayout = this.parentLayout;
        boolean z = false;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isLayersLayout) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        int i = 1;
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    DataUsageActivity.this.finishFragment();
                }
            }
        });
        this.hasOwnBackground = true;
        this.mobileAdapter = new ListAdapter(context, 0);
        this.wifiAdapter = new ListAdapter(context, 1);
        this.roamingAdapter = new ListAdapter(context, 2);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context);
        this.scrollSlidingTextTabStrip = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.scrollSlidingTextTabStrip, LayoutHelper.createFrame(-1, 44, 83));
        this.scrollSlidingTextTabStrip.setDelegate(new ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate() {
            @Override
            public final boolean canReorder(int i2) {
                return ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate.CC.$default$canReorder(this, i2);
            }

            @Override
            public void onPageScrolled(float f) {
                if (f != 1.0f || DataUsageActivity.this.viewPages[1].getVisibility() == 0) {
                    if (DataUsageActivity.this.animatingForward) {
                        DataUsageActivity.this.viewPages[0].setTranslationX((-f) * DataUsageActivity.this.viewPages[0].getMeasuredWidth());
                        DataUsageActivity.this.viewPages[1].setTranslationX(DataUsageActivity.this.viewPages[0].getMeasuredWidth() - (f * DataUsageActivity.this.viewPages[0].getMeasuredWidth()));
                    } else {
                        DataUsageActivity.this.viewPages[0].setTranslationX(DataUsageActivity.this.viewPages[0].getMeasuredWidth() * f);
                        DataUsageActivity.this.viewPages[1].setTranslationX((f * DataUsageActivity.this.viewPages[0].getMeasuredWidth()) - DataUsageActivity.this.viewPages[0].getMeasuredWidth());
                    }
                    if (f == 1.0f) {
                        ViewPage viewPage2 = DataUsageActivity.this.viewPages[0];
                        DataUsageActivity.this.viewPages[0] = DataUsageActivity.this.viewPages[1];
                        DataUsageActivity.this.viewPages[1] = viewPage2;
                        DataUsageActivity.this.viewPages[1].setVisibility(8);
                    }
                }
            }

            @Override
            public void onPageSelected(int i2, boolean z2) {
                if (DataUsageActivity.this.viewPages[0].selectedType == i2) {
                    return;
                }
                DataUsageActivity dataUsageActivity = DataUsageActivity.this;
                dataUsageActivity.swipeBackEnabled = i2 == dataUsageActivity.scrollSlidingTextTabStrip.getFirstTabId();
                DataUsageActivity.this.viewPages[1].selectedType = i2;
                DataUsageActivity.this.viewPages[1].setVisibility(0);
                DataUsageActivity.this.switchToCurrentSelectedMode(true);
                DataUsageActivity.this.animatingForward = z2;
            }

            @Override
            public final void onSamePageSelected() {
                ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate.CC.$default$onSamePageSelected(this);
            }

            @Override
            public final boolean showOptions(int i2, View view) {
                return ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate.CC.$default$showOptions(this, i2, view);
            }
        });
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        FrameLayout frameLayout = new FrameLayout(context) {
            private boolean globalIgnoreLayout;
            private boolean maybeStartTracking;
            private boolean startedTracking;
            private int startedTrackingPointerId;
            private int startedTrackingX;
            private int startedTrackingY;
            private VelocityTracker velocityTracker;

            private boolean prepareForMoving(MotionEvent motionEvent, boolean z2) {
                int nextPageId = DataUsageActivity.this.scrollSlidingTextTabStrip.getNextPageId(z2);
                if (nextPageId < 0) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                this.maybeStartTracking = false;
                this.startedTracking = true;
                this.startedTrackingX = (int) motionEvent.getX();
                ((BaseFragment) DataUsageActivity.this).actionBar.setEnabled(false);
                DataUsageActivity.this.scrollSlidingTextTabStrip.setEnabled(false);
                DataUsageActivity.this.viewPages[1].selectedType = nextPageId;
                DataUsageActivity.this.viewPages[1].setVisibility(0);
                DataUsageActivity.this.animatingForward = z2;
                DataUsageActivity.this.switchToCurrentSelectedMode(true);
                if (z2) {
                    DataUsageActivity.this.viewPages[1].setTranslationX(DataUsageActivity.this.viewPages[0].getMeasuredWidth());
                } else {
                    DataUsageActivity.this.viewPages[1].setTranslationX(-DataUsageActivity.this.viewPages[0].getMeasuredWidth());
                }
                return true;
            }

            public boolean checkTabsAnimationInProgress() {
                if (!DataUsageActivity.this.tabsAnimationInProgress) {
                    return false;
                }
                if (DataUsageActivity.this.backAnimation) {
                    if (Math.abs(DataUsageActivity.this.viewPages[0].getTranslationX()) < 1.0f) {
                        DataUsageActivity.this.viewPages[0].setTranslationX(0.0f);
                        DataUsageActivity.this.viewPages[1].setTranslationX(DataUsageActivity.this.viewPages[0].getMeasuredWidth() * (DataUsageActivity.this.animatingForward ? 1 : -1));
                        if (DataUsageActivity.this.tabsAnimation != null) {
                            DataUsageActivity.this.tabsAnimation.cancel();
                            DataUsageActivity.this.tabsAnimation = null;
                        }
                        DataUsageActivity.this.tabsAnimationInProgress = false;
                    }
                } else if (Math.abs(DataUsageActivity.this.viewPages[1].getTranslationX()) < 1.0f) {
                    DataUsageActivity.this.viewPages[0].setTranslationX(DataUsageActivity.this.viewPages[0].getMeasuredWidth() * (DataUsageActivity.this.animatingForward ? -1 : 1));
                    DataUsageActivity.this.viewPages[1].setTranslationX(0.0f);
                    if (DataUsageActivity.this.tabsAnimation != null) {
                        DataUsageActivity.this.tabsAnimation.cancel();
                        DataUsageActivity.this.tabsAnimation = null;
                    }
                    DataUsageActivity.this.tabsAnimationInProgress = false;
                }
                return DataUsageActivity.this.tabsAnimationInProgress;
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                if (((BaseFragment) DataUsageActivity.this).parentLayout != null) {
                    INavigationLayout iNavigationLayout2 = ((BaseFragment) DataUsageActivity.this).parentLayout;
                    int measuredHeight = ((BaseFragment) DataUsageActivity.this).actionBar.getMeasuredHeight() + ((int) ((BaseFragment) DataUsageActivity.this).actionBar.getTranslationY());
                    iNavigationLayout2.getClass();
                    ((ActionBarLayout) iNavigationLayout2).drawHeaderShadow(canvas, 255, measuredHeight);
                }
            }

            @Override
            public void onDraw(Canvas canvas) {
                DataUsageActivity.this.backgroundPaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
                canvas.drawRect(0.0f, ((BaseFragment) DataUsageActivity.this).actionBar.getTranslationY() + ((BaseFragment) DataUsageActivity.this).actionBar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), DataUsageActivity.this.backgroundPaint);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return checkTabsAnimationInProgress() || DataUsageActivity.this.scrollSlidingTextTabStrip.isAnimatingIndicator() || onTouchEvent(motionEvent);
            }

            @Override
            public void onMeasure(int i2, int i3) {
                setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
                AnonymousClass3 anonymousClass3 = this;
                anonymousClass3.measureChildWithMargins(((BaseFragment) DataUsageActivity.this).actionBar, i2, 0, i3, 0);
                int measuredHeight = ((BaseFragment) DataUsageActivity.this).actionBar.getMeasuredHeight();
                anonymousClass3.globalIgnoreLayout = true;
                int i4 = 0;
                for (int i5 = 0; i5 < DataUsageActivity.this.viewPages.length; i5++) {
                    if (DataUsageActivity.this.viewPages[i5] != null && DataUsageActivity.this.viewPages[i5].listView != null) {
                        DataUsageActivity.this.viewPages[i5].listView.setPadding(0, measuredHeight, 0, AndroidUtilities.dp(4.0f));
                    }
                }
                anonymousClass3.globalIgnoreLayout = false;
                int childCount = getChildCount();
                while (i4 < childCount) {
                    View childAt = getChildAt(i4);
                    if (childAt != null && childAt.getVisibility() != 8 && childAt != ((BaseFragment) DataUsageActivity.this).actionBar) {
                        anonymousClass3.measureChildWithMargins(childAt, i2, 0, i3, 0);
                    }
                    i4++;
                    anonymousClass3 = this;
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                float xVelocity;
                float yVelocity;
                float measuredWidth;
                if (((ActionBarLayout) ((BaseFragment) DataUsageActivity.this).parentLayout).checkTransitionAnimation() || checkTabsAnimationInProgress()) {
                    return false;
                }
                if (motionEvent != null) {
                    if (this.velocityTracker == null) {
                        this.velocityTracker = VelocityTracker.obtain();
                    }
                    this.velocityTracker.addMovement(motionEvent);
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.startedTracking && !this.maybeStartTracking) {
                    this.startedTrackingPointerId = motionEvent.getPointerId(0);
                    this.maybeStartTracking = true;
                    this.startedTrackingX = (int) motionEvent.getX();
                    this.startedTrackingY = (int) motionEvent.getY();
                    this.velocityTracker.clear();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.startedTrackingPointerId) {
                    int x = (int) (motionEvent.getX() - this.startedTrackingX);
                    int iAbs = Math.abs(((int) motionEvent.getY()) - this.startedTrackingY);
                    if (this.startedTracking && ((DataUsageActivity.this.animatingForward && x > 0) || (!DataUsageActivity.this.animatingForward && x < 0))) {
                        if (!prepareForMoving(motionEvent, x < 0)) {
                            this.maybeStartTracking = true;
                            this.startedTracking = false;
                            DataUsageActivity.this.viewPages[0].setTranslationX(0.0f);
                            DataUsageActivity.this.viewPages[1].setTranslationX(DataUsageActivity.this.animatingForward ? DataUsageActivity.this.viewPages[0].getMeasuredWidth() : -DataUsageActivity.this.viewPages[0].getMeasuredWidth());
                            DataUsageActivity.this.scrollSlidingTextTabStrip.selectTabWithId(DataUsageActivity.this.viewPages[1].selectedType, 0.0f);
                        }
                    }
                    if (!this.maybeStartTracking || this.startedTracking) {
                        if (this.startedTracking) {
                            if (DataUsageActivity.this.animatingForward) {
                                DataUsageActivity.this.viewPages[0].setTranslationX(x);
                                DataUsageActivity.this.viewPages[1].setTranslationX(DataUsageActivity.this.viewPages[0].getMeasuredWidth() + x);
                            } else {
                                DataUsageActivity.this.viewPages[0].setTranslationX(x);
                                DataUsageActivity.this.viewPages[1].setTranslationX(x - DataUsageActivity.this.viewPages[0].getMeasuredWidth());
                            }
                            DataUsageActivity.this.scrollSlidingTextTabStrip.selectTabWithId(DataUsageActivity.this.viewPages[1].selectedType, Math.abs(x) / DataUsageActivity.this.viewPages[0].getMeasuredWidth());
                        }
                    } else if (Math.abs(x) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x) > iAbs) {
                        prepareForMoving(motionEvent, x < 0);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    this.velocityTracker.computeCurrentVelocity(1000, DataUsageActivity.this.maximumVelocity);
                    if (motionEvent == null || motionEvent.getAction() == 3) {
                        xVelocity = 0.0f;
                        yVelocity = 0.0f;
                    } else {
                        xVelocity = this.velocityTracker.getXVelocity();
                        yVelocity = this.velocityTracker.getYVelocity();
                        if (!this.startedTracking && Math.abs(xVelocity) >= 3000.0f && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                            prepareForMoving(motionEvent, xVelocity < 0.0f);
                        }
                    }
                    if (this.startedTracking) {
                        float x2 = DataUsageActivity.this.viewPages[0].getX();
                        DataUsageActivity.this.tabsAnimation = new AnimatorSet();
                        DataUsageActivity.this.backAnimation = Math.abs(x2) < ((float) DataUsageActivity.this.viewPages[0].getMeasuredWidth()) / 3.0f && (Math.abs(xVelocity) < 3500.0f || Math.abs(xVelocity) < Math.abs(yVelocity));
                        boolean z2 = DataUsageActivity.this.backAnimation;
                        Property property = View.TRANSLATION_X;
                        if (z2) {
                            measuredWidth = Math.abs(x2);
                            if (DataUsageActivity.this.animatingForward) {
                                DataUsageActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(DataUsageActivity.this.viewPages[0], (Property<ViewPage, Float>) property, 0.0f), ObjectAnimator.ofFloat(DataUsageActivity.this.viewPages[1], (Property<ViewPage, Float>) property, DataUsageActivity.this.viewPages[1].getMeasuredWidth()));
                            } else {
                                DataUsageActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(DataUsageActivity.this.viewPages[0], (Property<ViewPage, Float>) property, 0.0f), ObjectAnimator.ofFloat(DataUsageActivity.this.viewPages[1], (Property<ViewPage, Float>) property, -DataUsageActivity.this.viewPages[1].getMeasuredWidth()));
                            }
                        } else {
                            measuredWidth = DataUsageActivity.this.viewPages[0].getMeasuredWidth() - Math.abs(x2);
                            if (DataUsageActivity.this.animatingForward) {
                                DataUsageActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(DataUsageActivity.this.viewPages[0], (Property<ViewPage, Float>) property, -DataUsageActivity.this.viewPages[0].getMeasuredWidth()), ObjectAnimator.ofFloat(DataUsageActivity.this.viewPages[1], (Property<ViewPage, Float>) property, 0.0f));
                            } else {
                                DataUsageActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(DataUsageActivity.this.viewPages[0], (Property<ViewPage, Float>) property, DataUsageActivity.this.viewPages[0].getMeasuredWidth()), ObjectAnimator.ofFloat(DataUsageActivity.this.viewPages[1], (Property<ViewPage, Float>) property, 0.0f));
                            }
                        }
                        DataUsageActivity.this.tabsAnimation.setInterpolator(DataUsageActivity.interpolator);
                        int measuredWidth2 = getMeasuredWidth();
                        float f = measuredWidth2 / 2;
                        float fDistanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f) + f;
                        float fAbs = Math.abs(xVelocity);
                        DataUsageActivity.this.tabsAnimation.setDuration(Math.max(150, Math.min(fAbs > 0.0f ? Math.round(Math.abs(fDistanceInfluenceForSnapDuration / fAbs) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                        DataUsageActivity.this.tabsAnimation.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                DataUsageActivity.this.tabsAnimation = null;
                                if (DataUsageActivity.this.backAnimation) {
                                    DataUsageActivity.this.viewPages[1].setVisibility(8);
                                } else {
                                    ViewPage viewPage2 = DataUsageActivity.this.viewPages[0];
                                    DataUsageActivity.this.viewPages[0] = DataUsageActivity.this.viewPages[1];
                                    DataUsageActivity.this.viewPages[1] = viewPage2;
                                    DataUsageActivity.this.viewPages[1].setVisibility(8);
                                    DataUsageActivity dataUsageActivity = DataUsageActivity.this;
                                    dataUsageActivity.swipeBackEnabled = dataUsageActivity.viewPages[0].selectedType == DataUsageActivity.this.scrollSlidingTextTabStrip.getFirstTabId();
                                    DataUsageActivity.this.scrollSlidingTextTabStrip.selectTabWithId(DataUsageActivity.this.viewPages[0].selectedType, 1.0f);
                                }
                                DataUsageActivity.this.tabsAnimationInProgress = false;
                                AnonymousClass3.this.maybeStartTracking = false;
                                AnonymousClass3.this.startedTracking = false;
                                ((BaseFragment) DataUsageActivity.this).actionBar.setEnabled(true);
                                DataUsageActivity.this.scrollSlidingTextTabStrip.setEnabled(true);
                            }
                        });
                        DataUsageActivity.this.tabsAnimation.start();
                        DataUsageActivity.this.tabsAnimationInProgress = true;
                        this.startedTracking = false;
                    } else {
                        this.maybeStartTracking = false;
                        ((BaseFragment) DataUsageActivity.this).actionBar.setEnabled(true);
                        DataUsageActivity.this.scrollSlidingTextTabStrip.setEnabled(true);
                    }
                    VelocityTracker velocityTracker = this.velocityTracker;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.velocityTracker = null;
                    }
                }
                return this.startedTracking;
            }

            @Override
            public void requestLayout() {
                if (this.globalIgnoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.fragmentView = frameLayout;
        frameLayout.setWillNotDraw(false);
        int i2 = 0;
        int iFindFirstVisibleItemPosition = -1;
        int top = 0;
        while (true) {
            ViewPage[] viewPageArr = this.viewPages;
            if (i2 >= viewPageArr.length) {
                break;
            }
            if (i2 == 0 && (viewPage = viewPageArr[i2]) != null && viewPage.layoutManager != null) {
                iFindFirstVisibleItemPosition = this.viewPages[i2].layoutManager.findFirstVisibleItemPosition();
                if (iFindFirstVisibleItemPosition == this.viewPages[i2].layoutManager.getItemCount() - 1 || (holder = (RecyclerListView.Holder) this.viewPages[i2].listView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition)) == null) {
                    iFindFirstVisibleItemPosition = -1;
                } else {
                    top = holder.itemView.getTop();
                }
            }
            ViewPage viewPage2 = new ViewPage(context) {
                @Override
                public void setTranslationX(float f) {
                    super.setTranslationX(f);
                    if (DataUsageActivity.this.tabsAnimationInProgress && DataUsageActivity.this.viewPages[0] == this) {
                        DataUsageActivity.this.scrollSlidingTextTabStrip.selectTabWithId(DataUsageActivity.this.viewPages[1].selectedType, Math.abs(DataUsageActivity.this.viewPages[0].getTranslationX()) / DataUsageActivity.this.viewPages[0].getMeasuredWidth());
                    }
                }
            };
            frameLayout.addView(viewPage2, LayoutHelper.createFrame(-1, -1.0f));
            this.viewPages[i2] = viewPage2;
            LinearLayoutManager linearLayoutManager = viewPage2.layoutManager = new LinearLayoutManager(context, i, z) {
                {
                    super(i, z);
                }

                @Override
                public boolean supportsPredictiveItemAnimations() {
                    return false;
                }
            };
            RecyclerListView recyclerListView = new RecyclerListView(context);
            this.viewPages[i2].listView = recyclerListView;
            this.viewPages[i2].listView.setScrollingTouchSlop(1);
            this.viewPages[i2].listView.lambda$onCellEnter$52(null);
            this.viewPages[i2].listView.setClipToPadding(false);
            this.viewPages[i2].listView.setSectionsType(2);
            this.viewPages[i2].listView.setLayoutManager(linearLayoutManager);
            ViewPage viewPage3 = this.viewPages[i2];
            viewPage3.addView(viewPage3.listView, LayoutHelper.createFrame(-1, -1.0f));
            this.viewPages[i2].listView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda5(5, this, recyclerListView));
            this.viewPages[i2].listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int i3) {
                    if (i3 != 1) {
                        int i4 = (int) (-((BaseFragment) DataUsageActivity.this).actionBar.getTranslationY());
                        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
                        if (i4 == 0 || i4 == currentActionBarHeight) {
                            return;
                        }
                        if (i4 < currentActionBarHeight / 2) {
                            DataUsageActivity.this.viewPages[0].listView.smoothScrollBy(0, -i4);
                        } else {
                            DataUsageActivity.this.viewPages[0].listView.smoothScrollBy(0, currentActionBarHeight - i4);
                        }
                    }
                }

                @Override
                public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                    if (recyclerView == DataUsageActivity.this.viewPages[0].listView) {
                        float translationY = ((BaseFragment) DataUsageActivity.this).actionBar.getTranslationY();
                        float f = translationY - i4;
                        if (f < (-ActionBar.getCurrentActionBarHeight())) {
                            f = -ActionBar.getCurrentActionBarHeight();
                        } else if (f > 0.0f) {
                            f = 0.0f;
                        }
                        if (f != translationY) {
                            DataUsageActivity.this.setScrollY(f);
                        }
                    }
                }
            });
            if (i2 == 0 && iFindFirstVisibleItemPosition != -1) {
                linearLayoutManager.scrollToPositionWithOffset(iFindFirstVisibleItemPosition, top);
            }
            if (i2 != 0) {
                this.viewPages[i2].setVisibility(8);
            }
            i2++;
        }
        frameLayout.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f));
        updateTabs();
        switchToCurrentSelectedMode(false);
        this.swipeBackEnabled = this.scrollSlidingTextTabStrip.getCurrentTabId() == this.scrollSlidingTextTabStrip.getFirstTabId();
        return this.fragmentView;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.fragmentView, 0, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.actionBar, 1, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, Theme.key_actionBarTabActiveText));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, Theme.key_actionBarTabUnactiveText));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, Theme.key_actionBarTabLine));
        arrayList.add(new ThemeDescription(null, 0, null, null, new Drawable[]{this.scrollSlidingTextTabStrip.getSelectorDrawable()}, null, Theme.key_actionBarTabSelector));
        int i = 0;
        while (true) {
            ViewPage[] viewPageArr = this.viewPages;
            if (i >= viewPageArr.length) {
                return arrayList;
            }
            arrayList.add(new ThemeDescription(viewPageArr[i].listView, 16, new Class[]{TextSettingsCell.class, HeaderCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
            arrayList.add(new ThemeDescription(this.viewPages[i].listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
            arrayList.add(new ThemeDescription(this.viewPages[i].listView, 4096, null, null, null, null, Theme.key_listSelector));
            arrayList.add(new ThemeDescription(this.viewPages[i].listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
            int i2 = Theme.key_windowBackgroundGrayShadow;
            arrayList.add(new ThemeDescription(this.viewPages[i].listView, 32, new Class[]{ShadowSectionCell.class}, null, null, null, i2));
            arrayList.add(new ThemeDescription(this.viewPages[i].listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
            arrayList.add(new ThemeDescription(this.viewPages[i].listView, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i2));
            arrayList.add(new ThemeDescription(this.viewPages[i].listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
            arrayList.add(new ThemeDescription(this.viewPages[i].listView, 262144, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
            arrayList.add(new ThemeDescription(this.viewPages[i].listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteValueText));
            arrayList.add(new ThemeDescription(this.viewPages[i].listView, 262144, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_text_RedRegular));
            i++;
        }
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.swipeBackEnabled;
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.mobileAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        ListAdapter listAdapter2 = this.wifiAdapter;
        if (listAdapter2 != null) {
            listAdapter2.notifyDataSetChanged();
        }
        ListAdapter listAdapter3 = this.roamingAdapter;
        if (listAdapter3 != null) {
            listAdapter3.notifyDataSetChanged();
        }
    }
}
