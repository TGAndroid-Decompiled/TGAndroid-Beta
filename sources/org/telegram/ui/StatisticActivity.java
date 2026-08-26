package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.ArraySet;
import androidx.core.graphics.ColorUtils;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.internal.mlkit_vision_common.zzkc;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import com.google.android.gms.internal.mlkit_vision_common.zzlo;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.commonmark.parser.Parser;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LruCache;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SegmentTree;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.EmptyCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.ManageChatTextCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.StatisticPostInfoCell;
import org.telegram.ui.Charts.BarChartView;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Charts.ChartPickerDelegate;
import org.telegram.ui.Charts.DoubleLinearChartView;
import org.telegram.ui.Charts.LinearBarChartView;
import org.telegram.ui.Charts.LinearChartView;
import org.telegram.ui.Charts.PieChartView;
import org.telegram.ui.Charts.StackBarChartView;
import org.telegram.ui.Charts.StackLinearChartView;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.data.DoubleLinearChartData;
import org.telegram.ui.Charts.data.StackBarChartData;
import org.telegram.ui.Charts.data.StackLinearChartData;
import org.telegram.ui.Charts.view_data.ChartHeaderView;
import org.telegram.ui.Charts.view_data.LegendSignatureView;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Charts.view_data.TransitionParams;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.FlatCheckBox;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.blur3.Blur3HashImpl;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.glass.GlassTabView;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda7;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesViewPager$$ExternalSyntheticLambda0;

public final class StatisticActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public ChartViewData actionsData;
    public Adapter adapter;
    public AnonymousClass11 animator;
    public ChatAvatarContainer avatarContainer;
    public ChannelBoostLayout boostLayout;
    public TLRPC.ChatFull chat;
    public final long chatId;
    public final LruCache childDataCache;
    public DiffUtilsCallback diffUtilsCallback;
    public ChartViewData followersData;
    public ChartViewData groupMembersData;
    public ChartViewData growthData;
    public AnonymousClass10 iBlur3Capture;
    public final BlurredBackgroundDrawableViewFactory iBlur3FactoryLiquidGlass;
    public final RectF iBlur3PositionActionBar;
    public final RectF iBlur3PositionMainTabs;
    public final ArrayList iBlur3Positions;
    public final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    public final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    public RLottieImageView imageView;
    public boolean initialLoading;
    public ChartViewData interactionsData;
    public final boolean isMegagroup;
    public ChartViewData ivInteractionsData;
    public ChartViewData languagesData;
    public ZoomCancelable lastCancelable;
    public LinearLayoutManager layoutManager;
    public ViewGroupPartRenderer listBlur3Capture;
    public int loadFromId;
    public long maxDateOverview;
    public ChartViewData membersLanguageData;
    public ChartViewData messagesData;
    public boolean messagesIsLoading;
    public long minDateOverview;
    public ChannelMonetizationLayout monetizationLayout;
    public ChartViewData newFollowersBySourceData;
    public ChartViewData newMembersBySourceData;
    public ChartViewData notificationsData;
    public final boolean onlyBoostsStat;
    public OverviewChannelData overviewChannelData;
    public OverviewChatData overviewChatData;
    public final AlertDialog[] progressDialog;
    public LinearLayout progressLayout;
    public ChartViewData reactionsByEmotionData;
    public final ArrayList recentAllSortedDataLoaded;
    public final SparseIntArray recentPostIdtoIndexMap;
    public final ArrayList recentPostsAll;
    public final ArrayList recentPostsLoaded;
    public final ArrayList recentStoriesAll;
    public final SparseIntArray recentStoriesIdtoIndexMap;
    public final ArrayList recentStoriesLoaded;
    public AnonymousClass7 recyclerListView;
    public final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    public BaseChartView.SharedUiComponents sharedUi;
    public final LaunchActivity.AnonymousClass18 showProgressbar;
    public boolean showTabs;
    public final boolean startFromBoosts;
    public final boolean startFromMonetization;
    public StoriesController.StoriesList storiesList;
    public int storiesListId;
    public ChartViewData storyInteractionsData;
    public ChartViewData storyReactionsByEmotionData;
    public GlassTabView[] tabs;
    public MainTabsLayout tabsView;
    public final ArrayList topAdmins;
    public ChartViewData topDayOfWeeksData;
    public ChartViewData topHoursData;
    public final ArrayList topInviters;
    public final ArrayList topMembersAll;
    public final ArrayList topMembersVisible;
    public PollItemMenu.AnonymousClass3 viewPagerFixed;
    public ChartViewData viewsBySourceData;

    public final class AnonymousClass11 extends DefaultItemAnimator {
        @Override
        public final long getAddAnimationDelay(long j, long j2, long j3) {
            return j;
        }
    }

    public final class Adapter extends RecyclerListView.SelectionAdapter {
        public int count;
        public int overviewCell;
        public int overviewHeaderCell = -1;
        public int growCell = -1;
        public int progressCell = -1;
        public int folowersCell = -1;
        public int topHourseCell = -1;
        public int interactionsCell = -1;
        public int ivInteractionsCell = -1;
        public int viewsBySourceCell = -1;
        public int newFollowersBySourceCell = -1;
        public int languagesCell = -1;
        public int notificationsCell = -1;
        public int reactionsByEmotionCell = -1;
        public int storyInteractionsCell = -1;
        public int storyReactionsByEmotionCell = -1;
        public int recentPostsHeaderCell = -1;
        public int recentPostsStartRow = -1;
        public int recentPostsEndRow = -1;
        public int groupMembersCell = -1;
        public int newMembersBySourceCell = -1;
        public int membersLanguageCell = -1;
        public int messagesCell = -1;
        public int actionsCell = -1;
        public int topDayOfWeeksCell = -1;
        public int topMembersHeaderCell = -1;
        public int topMembersStartRow = -1;
        public int topMembersEndRow = -1;
        public int topAdminsHeaderCell = -1;
        public int topAdminsStartRow = -1;
        public int topAdminsEndRow = -1;
        public int topInviterHeaderCell = -1;
        public int topInviterStartRow = -1;
        public int topInviterEndRow = -1;
        public int expandTopMembersRow = -1;
        public final ArraySet shadowDivideCells = new ArraySet(0);
        public final ArraySet emptyCells = new ArraySet(0);

        public final class AnonymousClass1 extends ChartCell {
            @Override
            public final void onDraw(Canvas canvas) {
                if (getTranslationY() != 0.0f) {
                    canvas.drawColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                }
                super.onDraw(canvas);
            }
        }

        public final class AnonymousClass2 extends StatisticPostInfoCell {
            @Override
            public final void onDraw(Canvas canvas) {
                if (getTranslationY() != 0.0f) {
                    canvas.drawColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                }
                super.onDraw(canvas);
            }
        }

        public final class AnonymousClass3 extends ChartHeaderView {
            @Override
            public final void onDraw(Canvas canvas) {
                if (getTranslationY() != 0.0f) {
                    canvas.drawColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                }
                super.onDraw(canvas);
            }
        }

        public Adapter() {
        }

        @Override
        public final int getItemCount() {
            return this.count;
        }

        @Override
        public final long getItemId(int i) {
            int i2 = this.recentPostsStartRow;
            if (i >= i2 && i < this.recentPostsEndRow) {
                return ((RecentPostInfo) StatisticActivity.this.recentAllSortedDataLoaded.get(i - i2)).getId();
            }
            if (i == this.growCell) {
                return 1L;
            }
            if (i == this.folowersCell) {
                return 2L;
            }
            if (i == this.topHourseCell) {
                return 3L;
            }
            if (i == this.interactionsCell) {
                return 4L;
            }
            if (i == this.notificationsCell) {
                return 5L;
            }
            if (i == this.ivInteractionsCell) {
                return 6L;
            }
            if (i == this.viewsBySourceCell) {
                return 7L;
            }
            if (i == this.newFollowersBySourceCell) {
                return 8L;
            }
            if (i == this.languagesCell) {
                return 9L;
            }
            if (i == this.groupMembersCell) {
                return 10L;
            }
            if (i == this.newMembersBySourceCell) {
                return 11L;
            }
            if (i == this.membersLanguageCell) {
                return 12L;
            }
            if (i == this.messagesCell) {
                return 13L;
            }
            if (i == this.actionsCell) {
                return 14L;
            }
            if (i == this.topDayOfWeeksCell) {
                return 15L;
            }
            if (i == this.reactionsByEmotionCell) {
                return 16L;
            }
            if (i == this.storyInteractionsCell) {
                return 17L;
            }
            return i == this.storyReactionsByEmotionCell ? 18L : -1L;
        }

        @Override
        public final int getItemViewType(int i) {
            if (i == this.growCell || i == this.folowersCell || i == this.topHourseCell || i == this.notificationsCell || i == this.actionsCell || i == this.groupMembersCell) {
                return 0;
            }
            if (i == this.interactionsCell || i == this.ivInteractionsCell || i == this.storyInteractionsCell) {
                return 1;
            }
            if (i == this.viewsBySourceCell || i == this.newFollowersBySourceCell || i == this.newMembersBySourceCell || i == this.messagesCell || i == this.reactionsByEmotionCell || i == this.storyReactionsByEmotionCell) {
                return 2;
            }
            if (i == this.languagesCell || i == this.membersLanguageCell || i == this.topDayOfWeeksCell) {
                return 4;
            }
            if (i >= this.recentPostsStartRow && i <= this.recentPostsEndRow) {
                return 9;
            }
            if (i == this.progressCell) {
                return 11;
            }
            if (this.emptyCells.contains(Integer.valueOf(i))) {
                return 12;
            }
            if (i == this.recentPostsHeaderCell || i == this.overviewHeaderCell || i == this.topAdminsHeaderCell || i == this.topMembersHeaderCell || i == this.topInviterHeaderCell) {
                return 13;
            }
            if (i == this.overviewCell) {
                return 14;
            }
            if ((i < this.topAdminsStartRow || i > this.topAdminsEndRow) && ((i < this.topMembersStartRow || i > this.topMembersEndRow) && (i < this.topInviterStartRow || i > this.topInviterEndRow))) {
                return i == this.expandTopMembersRow ? 15 : 10;
            }
            return 9;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return i == 9 || i == 15;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            MessageObject messageObject;
            StatisticPostInfoCell.AnonymousClass1 anonymousClass1;
            CharSequence string;
            ChartViewData chartViewData;
            int itemViewType = getItemViewType(i);
            StatisticActivity statisticActivity = StatisticActivity.this;
            View view = viewHolder.itemView;
            if (itemViewType >= 0 && itemViewType <= 4) {
                if (this.growCell == i) {
                    chartViewData = statisticActivity.growthData;
                } else if (this.folowersCell == i) {
                    chartViewData = statisticActivity.followersData;
                } else if (this.interactionsCell == i) {
                    chartViewData = statisticActivity.interactionsData;
                } else if (this.viewsBySourceCell == i) {
                    chartViewData = statisticActivity.viewsBySourceData;
                } else if (this.newFollowersBySourceCell == i) {
                    chartViewData = statisticActivity.newFollowersBySourceData;
                } else if (this.ivInteractionsCell == i) {
                    chartViewData = statisticActivity.ivInteractionsData;
                } else if (this.topHourseCell == i) {
                    chartViewData = statisticActivity.topHoursData;
                } else if (this.notificationsCell == i) {
                    chartViewData = statisticActivity.notificationsData;
                } else if (this.reactionsByEmotionCell == i) {
                    chartViewData = statisticActivity.reactionsByEmotionData;
                } else if (this.storyInteractionsCell == i) {
                    chartViewData = statisticActivity.storyInteractionsData;
                } else if (this.storyReactionsByEmotionCell == i) {
                    chartViewData = statisticActivity.storyReactionsByEmotionData;
                } else if (this.groupMembersCell == i) {
                    chartViewData = statisticActivity.groupMembersData;
                } else if (this.newMembersBySourceCell == i) {
                    chartViewData = statisticActivity.newMembersBySourceData;
                } else if (this.membersLanguageCell == i) {
                    chartViewData = statisticActivity.membersLanguageData;
                } else if (this.messagesCell == i) {
                    chartViewData = statisticActivity.messagesData;
                } else if (this.actionsCell == i) {
                    chartViewData = statisticActivity.actionsData;
                } else {
                    chartViewData = this.topDayOfWeeksCell == i ? statisticActivity.topDayOfWeeksData : statisticActivity.languagesData;
                }
                ((ChartCell) view).updateData(chartViewData, false);
                return;
            }
            ArrayList arrayList = statisticActivity.topMembersVisible;
            boolean z = statisticActivity.isMegagroup;
            if (itemViewType == 9) {
                if (z) {
                    int i2 = this.topAdminsStartRow;
                    if (i >= i2 && i <= this.topAdminsEndRow) {
                        ((StatisticPostInfoCell) view).setData((MemberData) statisticActivity.topAdmins.get(i - i2));
                        return;
                    }
                    int i3 = this.topMembersStartRow;
                    if (i >= i3 && i <= this.topMembersEndRow) {
                        ((StatisticPostInfoCell) view).setData((MemberData) arrayList.get(i - i3));
                        return;
                    }
                    int i4 = this.topInviterStartRow;
                    if (i < i4 || i > this.topInviterEndRow) {
                        return;
                    }
                    ((StatisticPostInfoCell) view).setData((MemberData) statisticActivity.topInviters.get(i - i4));
                    return;
                }
                int i5 = i - this.recentPostsStartRow;
                ArrayList arrayList2 = statisticActivity.recentAllSortedDataLoaded;
                RecentPostInfo recentPostInfo = (RecentPostInfo) arrayList2.get(i5);
                StatisticPostInfoCell statisticPostInfoCell = (StatisticPostInfoCell) view;
                boolean z2 = i5 == arrayList2.size() - 1;
                statisticPostInfoCell.postInfo = recentPostInfo;
                statisticPostInfoCell.needDivider = !z2;
                MessageObject messageObject2 = recentPostInfo.message;
                ArrayList<TLRPC.PhotoSize> arrayList3 = messageObject2.photoThumbs;
                StatisticPostInfoCell.AnonymousClass1 anonymousClass2 = statisticPostInfoCell.imageView;
                if (arrayList3 != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList3, AndroidUtilities.getPhotoSize());
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject2.photoThumbs, 50);
                    ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject2.photoThumbsObject);
                    ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject2.photoThumbsObject);
                    anonymousClass1 = anonymousClass2;
                    statisticPostInfoCell.imageView.setImage(forObject, "50_50", forObject2, "b1", null, null, 0, messageObject2);
                    messageObject = messageObject2;
                    anonymousClass1.setRoundRadius(AndroidUtilities.dp(9.0f));
                    anonymousClass1.setScaleX(0.96f);
                    anonymousClass1.setScaleY(0.96f);
                } else {
                    messageObject = messageObject2;
                    anonymousClass1 = anonymousClass2;
                    TLRPC.ChatFull chatFull = statisticPostInfoCell.chat;
                    if (chatFull.chat_photo.sizes.size() > 0) {
                        statisticPostInfoCell.imageView.setImage(ImageLocation.getForPhoto(chatFull.chat_photo.sizes.get(0), chatFull.chat_photo), "50_50", null, null, null, null, 0, statisticPostInfoCell.chat);
                        anonymousClass1.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
                        anonymousClass1.setScaleX(0.96f);
                        anonymousClass1.setScaleY(0.96f);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(chatFull.id));
                        AvatarDrawable avatarDrawable = statisticPostInfoCell.avatarDrawable;
                        avatarDrawable.setInfo(UserConfig.selectedAccount, chat);
                        anonymousClass1.imageReceiver.setForUserOrChat(chat, avatarDrawable);
                        anonymousClass1.onNewImageSet();
                        anonymousClass1.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
                        anonymousClass1.setScaleX(1.0f);
                        anonymousClass1.setScaleY(1.0f);
                    }
                }
                if (messageObject.isStory()) {
                    anonymousClass1.setScaleX(1.0f);
                    anonymousClass1.setScaleY(1.0f);
                    anonymousClass1.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
                }
                if (messageObject.isMusic()) {
                    string = zzkc.m(messageObject.getMusicTitle().trim(), ", ", messageObject.getMusicAuthor().trim());
                } else if (messageObject.isStory()) {
                    string = LocaleController.getString(R.string.Story);
                } else {
                    string = messageObject.caption;
                    if (string == null) {
                        string = messageObject.messageText;
                    }
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string != null ? string : "");
                for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                }
                statisticPostInfoCell.message.setText(AndroidUtilities.trim(AndroidUtilities.replaceNewLines(spannableStringBuilder), null));
                TextView textView = statisticPostInfoCell.views;
                TL_stats.PostInteractionCounters postInteractionCounters = recentPostInfo.counters;
                String pluralString = LocaleController.getPluralString("Views", postInteractionCounters instanceof TL_stats.TL_postInteractionCountersMessage ? ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters).views : postInteractionCounters instanceof TL_stats.TL_postInteractionCountersStory ? ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters).views : 0);
                TL_stats.PostInteractionCounters postInteractionCounters2 = recentPostInfo.counters;
                textView.setText(String.format(pluralString, AndroidUtilities.formatWholeNumber(postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage ? ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters2).views : postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory ? ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters2).views : 0, 0)));
                MessageObject messageObject3 = recentPostInfo.message;
                Date date = new Date((messageObject3 == null ? 0L : messageObject3.messageOwner.date) * 1000);
                statisticPostInfoCell.date.setText(LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date), LocaleController.getInstance().getFormatterDay().format(date)));
                TextView textView2 = statisticPostInfoCell.shares;
                TL_stats.PostInteractionCounters postInteractionCounters3 = recentPostInfo.counters;
                textView2.setText(AndroidUtilities.formatWholeNumber(postInteractionCounters3 instanceof TL_stats.TL_postInteractionCountersMessage ? ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters3).forwards : postInteractionCounters3 instanceof TL_stats.TL_postInteractionCountersStory ? ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters3).forwards : 0, 0));
                TextView textView3 = statisticPostInfoCell.likes;
                TL_stats.PostInteractionCounters postInteractionCounters4 = recentPostInfo.counters;
                textView3.setText(AndroidUtilities.formatWholeNumber(postInteractionCounters4 instanceof TL_stats.TL_postInteractionCountersMessage ? ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters4).reactions : postInteractionCounters4 instanceof TL_stats.TL_postInteractionCountersStory ? ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters4).reactions : 0, 0));
                TL_stats.PostInteractionCounters postInteractionCounters5 = recentPostInfo.counters;
                textView2.setVisibility((postInteractionCounters5 instanceof TL_stats.TL_postInteractionCountersMessage ? ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters5).forwards : postInteractionCounters5 instanceof TL_stats.TL_postInteractionCountersStory ? ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters5).forwards : 0) != 0 ? 0 : 8);
                TL_stats.PostInteractionCounters postInteractionCounters6 = recentPostInfo.counters;
                textView3.setVisibility((postInteractionCounters6 instanceof TL_stats.TL_postInteractionCountersMessage ? ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters6).reactions : postInteractionCounters6 instanceof TL_stats.TL_postInteractionCountersStory ? ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters6).reactions : 0) == 0 ? 8 : 0);
                statisticPostInfoCell.invalidate();
                if (recentPostInfo.counters instanceof TL_stats.TL_postInteractionCountersStory) {
                    statisticPostInfoCell.setImageViewAction(new PhotoViewer$$ExternalSyntheticLambda52(21, this, recentPostInfo));
                    return;
                } else {
                    statisticPostInfoCell.setImageViewAction(null);
                    return;
                }
            }
            if (itemViewType == 13) {
                ChartHeaderView chartHeaderView = (ChartHeaderView) view;
                chartHeaderView.showDate(true);
                chartHeaderView.setDates(statisticActivity.minDateOverview, statisticActivity.maxDateOverview);
                chartHeaderView.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
                if (i == this.overviewHeaderCell) {
                    chartHeaderView.setTitle(LocaleController.getString("StatisticOverview", R.string.StatisticOverview));
                    return;
                }
                if (i == this.topAdminsHeaderCell) {
                    chartHeaderView.setTitle(LocaleController.getString("TopAdmins", R.string.TopAdmins));
                    return;
                }
                if (i == this.topInviterHeaderCell) {
                    chartHeaderView.setTitle(LocaleController.getString("TopInviters", R.string.TopInviters));
                    return;
                } else {
                    if (i == this.topMembersHeaderCell) {
                        chartHeaderView.setTitle(LocaleController.getString("TopMembers", R.string.TopMembers));
                        return;
                    }
                    chartHeaderView.showDate(false);
                    chartHeaderView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(6.0f));
                    chartHeaderView.setTitle(LocaleController.getString("RecentPostsCapitalize", R.string.RecentPostsCapitalize));
                    return;
                }
            }
            if (itemViewType != 14) {
                if (itemViewType == 15) {
                    ((ManageChatTextCell) view).setText(LocaleController.formatPluralString("ShowVotes", statisticActivity.topMembersAll.size() - arrayList.size(), new Object[0]), R.drawable.arrow_more, 5, false);
                    return;
                }
                return;
            }
            OverviewCell overviewCell = (OverviewCell) view;
            if (z) {
                overviewCell.setData(statisticActivity.overviewChatData);
                return;
            }
            OverviewChannelData overviewChannelData = statisticActivity.overviewChannelData;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                TextView[] textViewArr = overviewCell.primary;
                int length = textViewArr.length;
                TextView[] textViewArr2 = overviewCell.title;
                if (i6 >= length) {
                    while (i7 < overviewCell.primary.length) {
                        ((ViewGroup) textViewArr2[i7].getParent()).setVisibility(8);
                        i7++;
                    }
                    for (int i8 = 0; i8 < overviewCell.getChildCount(); i8++) {
                        ViewGroup viewGroup = (ViewGroup) overviewCell.getChildAt(i8);
                        if (viewGroup.getChildAt(0).getVisibility() == 8 && viewGroup.getChildAt(1).getVisibility() == 8) {
                            viewGroup.setVisibility(8);
                        }
                    }
                    overviewCell.updateColors();
                    return;
                }
                TextView[] textViewArr3 = overviewCell.secondary;
                switch (i6) {
                    case 0:
                        textViewArr[i7].setText(overviewChannelData.followersPrimary);
                        textViewArr3[i7].setText(overviewChannelData.followersSecondary);
                        textViewArr3[i7].setTag(Integer.valueOf(overviewChannelData.followersUp ? Theme.key_windowBackgroundWhiteGreenText2 : Theme.key_text_RedRegular));
                        textViewArr2[i7].setText(overviewChannelData.followersTitle);
                        break;
                    case 1:
                        textViewArr[i7].setText(overviewChannelData.notificationsPrimary);
                        textViewArr3[i7].setText("");
                        textViewArr2[i7].setText(overviewChannelData.notificationsTitle);
                        break;
                    case 2:
                        textViewArr[i7].setText(overviewChannelData.viewsPrimary);
                        textViewArr3[i7].setText(overviewChannelData.viewsSecondary);
                        textViewArr3[i7].setTag(Integer.valueOf(overviewChannelData.viewsUp ? Theme.key_windowBackgroundWhiteGreenText2 : Theme.key_text_RedRegular));
                        textViewArr2[i7].setText(overviewChannelData.viewsTitle);
                        break;
                    case 3:
                        textViewArr[i7].setText(overviewChannelData.viewsPerStoryPrimary);
                        textViewArr3[i7].setText(overviewChannelData.viewsPerStorySecondary);
                        textViewArr3[i7].setTag(Integer.valueOf(overviewChannelData.viewsPerStoryUp ? Theme.key_windowBackgroundWhiteGreenText2 : Theme.key_text_RedRegular));
                        textViewArr2[i7].setText(overviewChannelData.viewsPerStoryTitle);
                        if (overviewChannelData.viewsPerStoryVisible) {
                        }
                        i6++;
                        break;
                    case 4:
                        textViewArr[i7].setText(overviewChannelData.sharesPrimary);
                        textViewArr3[i7].setText(overviewChannelData.sharesSecondary);
                        textViewArr3[i7].setTag(Integer.valueOf(overviewChannelData.sharesUp ? Theme.key_windowBackgroundWhiteGreenText2 : Theme.key_text_RedRegular));
                        textViewArr2[i7].setText(overviewChannelData.sharesTitle);
                        break;
                    case 5:
                        textViewArr[i7].setText(overviewChannelData.sharesPerStoryPrimary);
                        textViewArr3[i7].setText(overviewChannelData.sharesPerStorySecondary);
                        textViewArr3[i7].setTag(Integer.valueOf(overviewChannelData.sharesPerStoryUp ? Theme.key_windowBackgroundWhiteGreenText2 : Theme.key_text_RedRegular));
                        textViewArr2[i7].setText(overviewChannelData.sharesPerStoryTitle);
                        if (overviewChannelData.sharesPerStoryVisible) {
                        }
                        i6++;
                        break;
                    case 6:
                        textViewArr[i7].setText(overviewChannelData.reactionsPerPostPrimary);
                        textViewArr3[i7].setText(overviewChannelData.reactionsPerPostSecondary);
                        textViewArr3[i7].setTag(Integer.valueOf(overviewChannelData.reactionsPerPostUp ? Theme.key_windowBackgroundWhiteGreenText2 : Theme.key_text_RedRegular));
                        textViewArr2[i7].setText(overviewChannelData.reactionsPerPostTitle);
                        if (overviewChannelData.reactionsPerPostVisible) {
                        }
                        i6++;
                        break;
                    case 7:
                        textViewArr[i7].setText(overviewChannelData.reactionsPerStoryPrimary);
                        textViewArr3[i7].setText(overviewChannelData.reactionsPerStorySecondary);
                        textViewArr3[i7].setTag(Integer.valueOf(overviewChannelData.reactionsPerStoryUp ? Theme.key_windowBackgroundWhiteGreenText2 : Theme.key_text_RedRegular));
                        textViewArr2[i7].setText(overviewChannelData.reactionsPerStoryTitle);
                        if (overviewChannelData.reactionsPerStoryVisible) {
                        }
                        i6++;
                        break;
                    default:
                        continue;
                        i6++;
                        break;
                }
                i7++;
                i6++;
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View overviewCell;
            StatisticActivity statisticActivity = StatisticActivity.this;
            if (i >= 0 && i <= 4) {
                AnonymousClass1 anonymousClass1 = statisticActivity.new AnonymousClass1(viewGroup.getContext(), ((BaseFragment) statisticActivity).currentAccount, i, statisticActivity.sharedUi);
                anonymousClass1.setWillNotDraw(false);
                overviewCell = anonymousClass1;
            } else if (i == 9) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(viewGroup.getContext(), statisticActivity.chat, statisticActivity.getResourceProvider());
                anonymousClass2.setWillNotDraw(false);
                overviewCell = anonymousClass2;
            } else if (i == 11) {
                overviewCell = new LoadingCell(viewGroup.getContext());
            } else if (i == 12) {
                overviewCell = new EmptyCell(viewGroup.getContext(), AndroidUtilities.dp(15.0f));
            } else if (i == 13) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(viewGroup.getContext(), null);
                anonymousClass3.setWillNotDraw(false);
                anonymousClass3.setPadding(anonymousClass3.getPaddingLeft(), AndroidUtilities.dp(16.0f), anonymousClass3.getRight(), AndroidUtilities.dp(16.0f));
                overviewCell = anonymousClass3;
            } else if (i == 14) {
                overviewCell = new OverviewCell(viewGroup.getContext(), statisticActivity.isMegagroup ? 2 : 4);
            } else if (i == 15) {
                ManageChatTextCell manageChatTextCell = new ManageChatTextCell(viewGroup.getContext());
                manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                overviewCell = manageChatTextCell;
            } else {
                overviewCell = new ShadowSectionCell(viewGroup.getContext(), 0, 0);
            }
            return zzkl.m(overviewCell, overviewCell);
        }

        public final void update() {
            this.growCell = -1;
            this.folowersCell = -1;
            this.interactionsCell = -1;
            this.viewsBySourceCell = -1;
            this.newFollowersBySourceCell = -1;
            this.languagesCell = -1;
            this.recentPostsStartRow = -1;
            this.recentPostsEndRow = -1;
            this.progressCell = -1;
            this.recentPostsHeaderCell = -1;
            this.ivInteractionsCell = -1;
            this.topHourseCell = -1;
            this.notificationsCell = -1;
            this.storyReactionsByEmotionCell = -1;
            this.storyInteractionsCell = -1;
            this.reactionsByEmotionCell = -1;
            this.groupMembersCell = -1;
            this.newMembersBySourceCell = -1;
            this.membersLanguageCell = -1;
            this.messagesCell = -1;
            this.actionsCell = -1;
            this.topDayOfWeeksCell = -1;
            this.topMembersHeaderCell = -1;
            this.topMembersStartRow = -1;
            this.topMembersEndRow = -1;
            this.topAdminsHeaderCell = -1;
            this.topAdminsStartRow = -1;
            this.topAdminsEndRow = -1;
            this.topInviterHeaderCell = -1;
            this.topInviterStartRow = -1;
            this.topInviterEndRow = -1;
            this.expandTopMembersRow = -1;
            this.count = 0;
            ArraySet arraySet = this.emptyCells;
            arraySet.clear();
            ArraySet arraySet2 = this.shadowDivideCells;
            arraySet2.clear();
            StatisticActivity statisticActivity = StatisticActivity.this;
            if (statisticActivity.isMegagroup) {
                if (statisticActivity.overviewChatData != null) {
                    int i = this.count;
                    this.overviewHeaderCell = i;
                    this.count = i + 2;
                    this.overviewCell = i + 1;
                }
                ChartViewData chartViewData = statisticActivity.growthData;
                if (chartViewData != null && !chartViewData.isEmpty) {
                    int i2 = this.count;
                    if (i2 > 0) {
                        this.count = i2 + 1;
                        arraySet2.add(Integer.valueOf(i2));
                    }
                    int i3 = this.count;
                    this.count = i3 + 1;
                    this.growCell = i3;
                }
                ChartViewData chartViewData2 = statisticActivity.groupMembersData;
                if (chartViewData2 != null && !chartViewData2.isEmpty) {
                    int i4 = this.count;
                    if (i4 > 0) {
                        this.count = i4 + 1;
                        arraySet2.add(Integer.valueOf(i4));
                    }
                    int i5 = this.count;
                    this.count = i5 + 1;
                    this.groupMembersCell = i5;
                }
                ChartViewData chartViewData3 = statisticActivity.newMembersBySourceData;
                if (chartViewData3 != null && !chartViewData3.isEmpty && !chartViewData3.isError) {
                    int i6 = this.count;
                    if (i6 > 0) {
                        this.count = i6 + 1;
                        arraySet2.add(Integer.valueOf(i6));
                    }
                    int i7 = this.count;
                    this.count = i7 + 1;
                    this.newMembersBySourceCell = i7;
                }
                ChartViewData chartViewData4 = statisticActivity.membersLanguageData;
                if (chartViewData4 != null && !chartViewData4.isEmpty && !chartViewData4.isError) {
                    int i8 = this.count;
                    if (i8 > 0) {
                        this.count = i8 + 1;
                        arraySet2.add(Integer.valueOf(i8));
                    }
                    int i9 = this.count;
                    this.count = i9 + 1;
                    this.membersLanguageCell = i9;
                }
                ChartViewData chartViewData5 = statisticActivity.messagesData;
                if (chartViewData5 != null && !chartViewData5.isEmpty && !chartViewData5.isError) {
                    int i10 = this.count;
                    if (i10 > 0) {
                        this.count = i10 + 1;
                        arraySet2.add(Integer.valueOf(i10));
                    }
                    int i11 = this.count;
                    this.count = i11 + 1;
                    this.messagesCell = i11;
                }
                ChartViewData chartViewData6 = statisticActivity.actionsData;
                if (chartViewData6 != null && !chartViewData6.isEmpty && !chartViewData6.isError) {
                    int i12 = this.count;
                    if (i12 > 0) {
                        this.count = i12 + 1;
                        arraySet2.add(Integer.valueOf(i12));
                    }
                    int i13 = this.count;
                    this.count = i13 + 1;
                    this.actionsCell = i13;
                }
                ChartViewData chartViewData7 = statisticActivity.topHoursData;
                if (chartViewData7 != null && !chartViewData7.isEmpty && !chartViewData7.isError) {
                    int i14 = this.count;
                    if (i14 > 0) {
                        this.count = i14 + 1;
                        arraySet2.add(Integer.valueOf(i14));
                    }
                    int i15 = this.count;
                    this.count = i15 + 1;
                    this.topHourseCell = i15;
                }
                ChartViewData chartViewData8 = statisticActivity.topDayOfWeeksData;
                if (chartViewData8 != null && !chartViewData8.isEmpty && !chartViewData8.isError) {
                    int i16 = this.count;
                    if (i16 > 0) {
                        this.count = i16 + 1;
                        arraySet2.add(Integer.valueOf(i16));
                    }
                    int i17 = this.count;
                    this.count = i17 + 1;
                    this.topDayOfWeeksCell = i17;
                }
                ArrayList arrayList = statisticActivity.topMembersVisible;
                if (arrayList.size() > 0) {
                    int i18 = this.count;
                    if (i18 > 0) {
                        this.count = i18 + 1;
                        arraySet2.add(Integer.valueOf(i18));
                    }
                    int i19 = this.count;
                    int i20 = i19 + 1;
                    this.topMembersHeaderCell = i19;
                    this.count = i19 + 2;
                    this.topMembersStartRow = i20;
                    int size = arrayList.size() + i20;
                    this.topMembersEndRow = size - 1;
                    this.count = size;
                    if (arrayList.size() != statisticActivity.topMembersAll.size()) {
                        int i21 = this.count;
                        this.count = i21 + 1;
                        this.expandTopMembersRow = i21;
                    } else {
                        int i22 = this.count;
                        this.count = i22 + 1;
                        arraySet.add(Integer.valueOf(i22));
                    }
                }
                ArrayList arrayList2 = statisticActivity.topAdmins;
                if (arrayList2.size() > 0) {
                    int i23 = this.count;
                    if (i23 > 0) {
                        this.count = i23 + 1;
                        arraySet2.add(Integer.valueOf(i23));
                    }
                    int i24 = this.count;
                    int i25 = i24 + 1;
                    this.topAdminsHeaderCell = i24;
                    this.count = i24 + 2;
                    this.topAdminsStartRow = i25;
                    int size2 = arrayList2.size() + i25;
                    this.topAdminsEndRow = size2 - 1;
                    this.count = size2 + 1;
                    arraySet.add(Integer.valueOf(size2));
                }
                ArrayList arrayList3 = statisticActivity.topInviters;
                if (arrayList3.size() > 0) {
                    int i26 = this.count;
                    if (i26 > 0) {
                        this.count = i26 + 1;
                        arraySet2.add(Integer.valueOf(i26));
                    }
                    int i27 = this.count;
                    int i28 = i27 + 1;
                    this.topInviterHeaderCell = i27;
                    this.count = i27 + 2;
                    this.topInviterStartRow = i28;
                    int size3 = arrayList3.size() + i28;
                    this.topInviterEndRow = size3 - 1;
                    this.count = size3;
                }
                int i29 = this.count;
                if (i29 > 0) {
                    this.count = i29 + 1;
                    arraySet.add(Integer.valueOf(i29));
                    int i30 = this.count;
                    this.count = i30 + 1;
                    arraySet2.add(Integer.valueOf(i30));
                    return;
                }
                return;
            }
            if (statisticActivity.overviewChannelData != null) {
                int i31 = this.count;
                this.overviewHeaderCell = i31;
                this.count = i31 + 2;
                this.overviewCell = i31 + 1;
            }
            ChartViewData chartViewData9 = statisticActivity.growthData;
            if (chartViewData9 != null && !chartViewData9.isEmpty) {
                int i32 = this.count;
                if (i32 > 0) {
                    this.count = i32 + 1;
                    arraySet2.add(Integer.valueOf(i32));
                }
                int i33 = this.count;
                this.count = i33 + 1;
                this.growCell = i33;
            }
            ChartViewData chartViewData10 = statisticActivity.followersData;
            if (chartViewData10 != null && !chartViewData10.isEmpty) {
                int i34 = this.count;
                if (i34 > 0) {
                    this.count = i34 + 1;
                    arraySet2.add(Integer.valueOf(i34));
                }
                int i35 = this.count;
                this.count = i35 + 1;
                this.folowersCell = i35;
            }
            ChartViewData chartViewData11 = statisticActivity.notificationsData;
            if (chartViewData11 != null && !chartViewData11.isEmpty) {
                int i36 = this.count;
                if (i36 > 0) {
                    this.count = i36 + 1;
                    arraySet2.add(Integer.valueOf(i36));
                }
                int i37 = this.count;
                this.count = i37 + 1;
                this.notificationsCell = i37;
            }
            ChartViewData chartViewData12 = statisticActivity.topHoursData;
            if (chartViewData12 != null && !chartViewData12.isEmpty) {
                int i38 = this.count;
                if (i38 > 0) {
                    this.count = i38 + 1;
                    arraySet2.add(Integer.valueOf(i38));
                }
                int i39 = this.count;
                this.count = i39 + 1;
                this.topHourseCell = i39;
            }
            ChartViewData chartViewData13 = statisticActivity.viewsBySourceData;
            if (chartViewData13 != null && !chartViewData13.isEmpty) {
                int i40 = this.count;
                if (i40 > 0) {
                    this.count = i40 + 1;
                    arraySet2.add(Integer.valueOf(i40));
                }
                int i41 = this.count;
                this.count = i41 + 1;
                this.viewsBySourceCell = i41;
            }
            ChartViewData chartViewData14 = statisticActivity.newFollowersBySourceData;
            if (chartViewData14 != null && !chartViewData14.isEmpty) {
                int i42 = this.count;
                if (i42 > 0) {
                    this.count = i42 + 1;
                    arraySet2.add(Integer.valueOf(i42));
                }
                int i43 = this.count;
                this.count = i43 + 1;
                this.newFollowersBySourceCell = i43;
            }
            ChartViewData chartViewData15 = statisticActivity.languagesData;
            if (chartViewData15 != null && !chartViewData15.isEmpty) {
                int i44 = this.count;
                if (i44 > 0) {
                    this.count = i44 + 1;
                    arraySet2.add(Integer.valueOf(i44));
                }
                int i45 = this.count;
                this.count = i45 + 1;
                this.languagesCell = i45;
            }
            ChartViewData chartViewData16 = statisticActivity.interactionsData;
            if (chartViewData16 != null && !chartViewData16.isEmpty) {
                int i46 = this.count;
                if (i46 > 0) {
                    this.count = i46 + 1;
                    arraySet2.add(Integer.valueOf(i46));
                }
                int i47 = this.count;
                this.count = i47 + 1;
                this.interactionsCell = i47;
            }
            ChartViewData chartViewData17 = statisticActivity.ivInteractionsData;
            if (chartViewData17 != null && !chartViewData17.loading && !chartViewData17.isError) {
                int i48 = this.count;
                if (i48 > 0) {
                    this.count = i48 + 1;
                    arraySet2.add(Integer.valueOf(i48));
                }
                int i49 = this.count;
                this.count = i49 + 1;
                this.ivInteractionsCell = i49;
            }
            ChartViewData chartViewData18 = statisticActivity.reactionsByEmotionData;
            if (chartViewData18 != null && !chartViewData18.isEmpty && !chartViewData18.isError) {
                int i50 = this.count;
                if (i50 > 0) {
                    this.count = i50 + 1;
                    arraySet2.add(Integer.valueOf(i50));
                }
                int i51 = this.count;
                this.count = i51 + 1;
                this.reactionsByEmotionCell = i51;
            }
            ChartViewData chartViewData19 = statisticActivity.storyInteractionsData;
            if (chartViewData19 != null && !chartViewData19.isEmpty && !chartViewData19.isError) {
                int i52 = this.count;
                if (i52 > 0) {
                    this.count = i52 + 1;
                    arraySet2.add(Integer.valueOf(i52));
                }
                int i53 = this.count;
                this.count = i53 + 1;
                this.storyInteractionsCell = i53;
            }
            ChartViewData chartViewData20 = statisticActivity.storyReactionsByEmotionData;
            if (chartViewData20 != null && !chartViewData20.isEmpty && !chartViewData20.isError) {
                int i54 = this.count;
                if (i54 > 0) {
                    this.count = i54 + 1;
                    arraySet2.add(Integer.valueOf(i54));
                }
                int i55 = this.count;
                this.count = i55 + 1;
                this.storyReactionsByEmotionCell = i55;
            }
            int i56 = this.count;
            this.count = i56 + 1;
            arraySet2.add(Integer.valueOf(i56));
            ArrayList arrayList4 = statisticActivity.recentAllSortedDataLoaded;
            if (arrayList4.size() > 0) {
                int i57 = this.count;
                int i58 = i57 + 1;
                this.recentPostsHeaderCell = i57;
                this.count = i57 + 2;
                this.recentPostsStartRow = i58;
                int size4 = arrayList4.size() + i58;
                this.recentPostsEndRow = size4 - 1;
                this.count = size4;
                if (statisticActivity.recentPostsLoaded.size() != statisticActivity.recentPostsAll.size()) {
                    int i59 = this.count;
                    this.count = i59 + 1;
                    this.progressCell = i59;
                } else {
                    int i60 = this.count;
                    this.count = i60 + 1;
                    arraySet.add(Integer.valueOf(i60));
                }
                int i61 = this.count;
                this.count = i61 + 1;
                arraySet2.add(Integer.valueOf(i61));
            }
        }
    }

    public abstract class BaseChartCell extends FrameLayout {
        public final ChartHeaderView chartHeaderView;
        public final int chartType;
        public final BaseChartView chartView;
        public final ArrayList checkBoxes;
        public final TopicsFragment.AnonymousClass14 checkboxContainer;
        public ChartViewData data;
        public final TextView errorTextView;
        public final RadialProgressView progressView;
        public final Window window;
        public final BaseChartView zoomedChartView;

        public final class AnonymousClass2 extends AnimatorListenerAdapter {
            public final int $r8$classId;
            public final BaseChartCell this$0;

            public AnonymousClass2(BaseChartCell baseChartCell, int i) {
                this.$r8$classId = i;
                this.this$0 = baseChartCell;
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                switch (this.$r8$classId) {
                    case 0:
                        BaseChartCell baseChartCell = this.this$0;
                        baseChartCell.chartView.setVisibility(4);
                        BaseChartView baseChartView = baseChartCell.chartView;
                        baseChartView.enabled = false;
                        BaseChartView baseChartView2 = baseChartCell.zoomedChartView;
                        baseChartView2.enabled = true;
                        baseChartView.transitionMode = 0;
                        baseChartView2.transitionMode = 0;
                        Window window = baseChartCell.window;
                        if (window != null) {
                            window.clearFlags(16);
                        }
                        break;
                    case 1:
                        BaseChartCell baseChartCell2 = this.this$0;
                        baseChartCell2.zoomedChartView.setVisibility(4);
                        BaseChartView baseChartView3 = baseChartCell2.chartView;
                        baseChartView3.transitionMode = 0;
                        BaseChartView baseChartView4 = baseChartCell2.zoomedChartView;
                        baseChartView4.transitionMode = 0;
                        baseChartView3.enabled = true;
                        baseChartView4.enabled = false;
                        if (baseChartView3 instanceof StackLinearChartView) {
                            baseChartView3.selectedIndex = -1;
                            baseChartView3.legendShowing = false;
                            baseChartView3.animateLegentTo = false;
                            baseChartView3.legendSignatureView.setVisibility(8);
                            baseChartView3.selectionA = 0.0f;
                        } else {
                            baseChartView3.legendShowing = true;
                            baseChartView3.moveLegend((baseChartView3.chartFullWidth * baseChartView3.pickerDelegate.pickerStart) - BaseChartView.HORIZONTAL_PADDING);
                            baseChartCell2.chartView.animateLegend(true);
                            baseChartCell2.chartView.invalidate();
                        }
                        Window window2 = baseChartCell2.window;
                        if (window2 != null) {
                            window2.clearFlags(16);
                        }
                        break;
                    default:
                        BaseChartCell baseChartCell3 = this.this$0;
                        baseChartCell3.chartView.transitionMode = 0;
                        baseChartCell3.progressView.setVisibility(8);
                        break;
                }
            }
        }

        public final class CheckBoxHolder {
            public final FlatCheckBox checkBox;
            public LineViewData line;
            public final int position;

            public CheckBoxHolder(int i) {
                this.position = i;
                FlatCheckBox flatCheckBox = new FlatCheckBox(BaseChartCell.this.getContext());
                this.checkBox = flatCheckBox;
                flatCheckBox.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                BaseChartCell.this.checkboxContainer.addView(flatCheckBox);
                BaseChartCell.this.checkBoxes.add(this);
            }
        }

        public BaseChartCell(Context context, int i, BaseChartView.SharedUiComponents sharedUiComponents, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.checkBoxes = new ArrayList();
            setWillNotDraw(false);
            if (context instanceof Activity) {
                this.window = ((Activity) context).getWindow();
            } else {
                this.window = null;
            }
            this.chartType = i;
            LinearLayout linearLayoutM = zzkf.m(context, 1);
            TopicsFragment.AnonymousClass14 anonymousClass14 = new TopicsFragment.AnonymousClass14(context, 4);
            this.checkboxContainer = anonymousClass14;
            ChartHeaderView chartHeaderView = new ChartHeaderView(getContext(), resourcesProvider);
            this.chartHeaderView = chartHeaderView;
            TextView textView = chartHeaderView.back;
            textView.setOnTouchListener(new RecyclerListView.FoucsableOnTouchListener());
            final int i2 = 0;
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final StatisticActivity.BaseChartCell f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            this.f$0.zoomOut(true);
                            break;
                        case 1:
                            this.f$0.onZoomed();
                            break;
                        default:
                            this.f$0.zoomedChartView.animateLegend(false);
                            break;
                    }
                }
            });
            if (i == 1) {
                this.chartView = new DoubleLinearChartView(getContext(), resourcesProvider);
                DoubleLinearChartView doubleLinearChartView = new DoubleLinearChartView(getContext(), resourcesProvider);
                this.zoomedChartView = doubleLinearChartView;
                doubleLinearChartView.legendSignatureView.useHour = true;
            } else if (i == 2) {
                this.chartView = new StackBarChartView(getContext(), resourcesProvider);
                StackBarChartView stackBarChartView = new StackBarChartView(getContext(), resourcesProvider);
                this.zoomedChartView = stackBarChartView;
                stackBarChartView.legendSignatureView.useHour = true;
            } else if (i == 3) {
                BarChartView barChartView = new BarChartView(getContext(), null);
                barChartView.superDraw = true;
                barChartView.useAlphaSignature = true;
                this.chartView = barChartView;
                LinearChartView linearChartView = new LinearChartView(getContext(), null);
                this.zoomedChartView = linearChartView;
                linearChartView.legendSignatureView.useHour = true;
            } else if (i == 4) {
                StackLinearChartView stackLinearChartView = new StackLinearChartView(getContext());
                this.chartView = stackLinearChartView;
                stackLinearChartView.legendSignatureView.showPercentage = true;
                this.zoomedChartView = new PieChartView(getContext());
            } else if (i != 5) {
                this.chartView = new LinearChartView(getContext(), null);
                LinearChartView linearChartView2 = new LinearChartView(getContext(), null);
                this.zoomedChartView = linearChartView2;
                linearChartView2.legendSignatureView.useHour = true;
            } else {
                this.chartView = new LinearBarChartView(getContext(), null);
                LinearBarChartView linearBarChartView = new LinearBarChartView(getContext(), null);
                this.zoomedChartView = linearBarChartView;
                linearBarChartView.legendSignatureView.useHour = true;
            }
            FrameLayout frameLayout = new FrameLayout(context);
            this.chartView.sharedUiComponents = sharedUiComponents;
            this.zoomedChartView.sharedUiComponents = sharedUiComponents;
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            this.progressView = radialProgressView;
            frameLayout.addView(this.chartView);
            frameLayout.addView(this.chartView.legendSignatureView, -2, -2);
            frameLayout.addView(this.zoomedChartView);
            frameLayout.addView(this.zoomedChartView.legendSignatureView, -2, -2);
            frameLayout.addView(radialProgressView, LayoutHelper.createFrame(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
            TextView textView2 = new TextView(context);
            this.errorTextView = textView2;
            textView2.setTextSize(1, 15.0f);
            frameLayout.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            radialProgressView.setVisibility(8);
            textView2.setTextColor(Theme.getColor(Theme.key_dialogTextGray4, resourcesProvider));
            this.chartView.setDateSelectionListener(new StoriesViewPager$$ExternalSyntheticLambda0(this, 15));
            this.chartView.legendSignatureView.showProgress(false, false);
            this.chartView.legendSignatureView.setOnTouchListener(new RecyclerListView.FoucsableOnTouchListener());
            final int i3 = 1;
            this.chartView.legendSignatureView.setOnClickListener(new View.OnClickListener(this) {
                public final StatisticActivity.BaseChartCell f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            this.f$0.zoomOut(true);
                            break;
                        case 1:
                            this.f$0.onZoomed();
                            break;
                        default:
                            this.f$0.zoomedChartView.animateLegend(false);
                            break;
                    }
                }
            });
            final int i4 = 2;
            this.zoomedChartView.legendSignatureView.setOnClickListener(new View.OnClickListener(this) {
                public final StatisticActivity.BaseChartCell f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            this.f$0.zoomOut(true);
                            break;
                        case 1:
                            this.f$0.onZoomed();
                            break;
                        default:
                            this.f$0.zoomedChartView.animateLegend(false);
                            break;
                    }
                }
            });
            this.chartView.setVisibility(0);
            this.zoomedChartView.setVisibility(4);
            this.chartView.setHeader(chartHeaderView);
            linearLayoutM.addView(chartHeaderView, LayoutHelper.createFrame(52.0f, -1));
            linearLayoutM.addView(frameLayout, LayoutHelper.createFrame(-2.0f, -1));
            linearLayoutM.addView(anonymousClass14, LayoutHelper.createFrame(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
            if (i == 4) {
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                linearLayoutM.setClipChildren(false);
                linearLayoutM.setClipToPadding(false);
            }
            addView(linearLayoutM);
        }

        public final ValueAnimator createTransitionAnimator(long j, boolean z) {
            Window window = this.window;
            if (window != null) {
                window.setFlags(16, 16);
            }
            BaseChartView baseChartView = this.chartView;
            baseChartView.enabled = false;
            BaseChartView baseChartView2 = this.zoomedChartView;
            baseChartView2.enabled = false;
            baseChartView.transitionMode = 2;
            baseChartView2.transitionMode = 1;
            final TransitionParams transitionParams = new TransitionParams();
            ChartPickerDelegate chartPickerDelegate = baseChartView.pickerDelegate;
            transitionParams.pickerEndOut = chartPickerDelegate.pickerEnd;
            transitionParams.pickerStartOut = chartPickerDelegate.pickerStart;
            int iBinarySearch = Arrays.binarySearch(this.data.chartData.x, j);
            if (iBinarySearch < 0) {
                iBinarySearch = this.data.chartData.x.length - 1;
            }
            transitionParams.xPercentage = this.data.chartData.xPercentage[iBinarySearch];
            baseChartView2.setVisibility(0);
            baseChartView2.transitionParams = transitionParams;
            baseChartView.transitionParams = transitionParams;
            long j2 = 0;
            long j3 = 2147483647L;
            for (int i = 0; i < this.data.chartData.lines.size(); i++) {
                if (((ChartData.Line) this.data.chartData.lines.get(i)).y[iBinarySearch] > j2) {
                    j2 = ((ChartData.Line) this.data.chartData.lines.get(i)).y[iBinarySearch];
                }
                if (((ChartData.Line) this.data.chartData.lines.get(i)).y[iBinarySearch] < j3) {
                    j3 = ((ChartData.Line) this.data.chartData.lines.get(i)).y[iBinarySearch];
                }
            }
            float f = j3 + (j2 - j3);
            float f2 = baseChartView.currentMinHeight;
            final float f3 = (f - f2) / (baseChartView.currentMaxHeight - f2);
            baseChartView.fillTransitionParams(transitionParams);
            baseChartView2.fillTransitionParams(transitionParams);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    StatisticActivity.BaseChartCell baseChartCell = this.f$0;
                    BaseChartView baseChartView3 = baseChartCell.chartView;
                    float f4 = baseChartView3.chartWidth;
                    ChartPickerDelegate chartPickerDelegate2 = baseChartView3.pickerDelegate;
                    float f5 = chartPickerDelegate2.pickerEnd;
                    float f6 = chartPickerDelegate2.pickerStart;
                    float f7 = ((f4 / (f5 - f6)) * f6) - BaseChartView.HORIZONTAL_PADDING;
                    RectF rectF = baseChartView3.chartArea;
                    float fHeight = (rectF.height() * (1.0f - f3)) + rectF.top;
                    TransitionParams transitionParams2 = transitionParams;
                    transitionParams2.pY = fHeight;
                    transitionParams2.pX = (baseChartView3.chartFullWidth * transitionParams2.xPercentage) - f7;
                    transitionParams2.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BaseChartView baseChartView4 = baseChartCell.zoomedChartView;
                    baseChartView4.invalidate();
                    baseChartView4.fillTransitionParams(transitionParams2);
                    baseChartView3.invalidate();
                }
            });
            valueAnimatorOfFloat.setDuration(400L);
            valueAnimatorOfFloat.setInterpolator(new FastOutSlowInInterpolator());
            return valueAnimatorOfFloat;
        }

        public abstract void loadData(ChartViewData chartViewData);

        public abstract void onZoomed();

        public final void recolor() {
            ChartData chartData;
            ArrayList arrayList;
            BaseChartView baseChartView = this.chartView;
            baseChartView.updateColors();
            baseChartView.invalidate();
            BaseChartView baseChartView2 = this.zoomedChartView;
            baseChartView2.updateColors();
            baseChartView2.invalidate();
            ChartHeaderView chartHeaderView = this.chartHeaderView;
            chartHeaderView.recolor();
            chartHeaderView.invalidate();
            ChartViewData chartViewData = this.data;
            if (chartViewData != null && (chartData = chartViewData.chartData) != null && (arrayList = chartData.lines) != null && arrayList.size() > 1) {
                for (int i = 0; i < this.data.chartData.lines.size(); i++) {
                    int color = (((ChartData.Line) this.data.chartData.lines.get(i)).colorKey < 0 || !Theme.hasThemeKey(((ChartData.Line) this.data.chartData.lines.get(i)).colorKey)) ? ColorUtils.calculateLuminance(Theme.getColor(null, Theme.key_windowBackgroundWhite, false)) < 0.5d ? ((ChartData.Line) this.data.chartData.lines.get(i)).colorDark : ((ChartData.Line) this.data.chartData.lines.get(i)).color : Theme.getColor(null, ((ChartData.Line) this.data.chartData.lines.get(i)).colorKey, false);
                    ArrayList arrayList2 = this.checkBoxes;
                    if (i < arrayList2.size()) {
                        FlatCheckBox flatCheckBox = ((CheckBoxHolder) arrayList2.get(i)).checkBox;
                        flatCheckBox.getClass();
                        flatCheckBox.colorActive = Theme.getColor(null, Theme.key_windowBackgroundWhite, false);
                        flatCheckBox.colorTextActive = -1;
                        flatCheckBox.colorInactive = color;
                        flatCheckBox.invalidate();
                    }
                }
            }
            this.progressView.setProgressColor(Theme.getColor(null, Theme.key_progressCircle, false));
            this.errorTextView.setTextColor(Theme.getColor(null, Theme.key_dialogTextGray4, false));
        }

        public final void updateData(ChartViewData chartViewData, boolean z) {
            if (chartViewData == null) {
                return;
            }
            ChartHeaderView chartHeaderView = this.chartHeaderView;
            chartHeaderView.setTitle(chartViewData.title);
            boolean z2 = getContext().getResources().getConfiguration().orientation == 2;
            BaseChartView baseChartView = this.chartView;
            baseChartView.setLandscape(z2);
            BaseChartView baseChartView2 = this.zoomedChartView;
            baseChartView2.setLandscape(z2);
            this.data = chartViewData;
            boolean z3 = chartViewData.isEmpty;
            ArrayList arrayList = this.checkBoxes;
            RadialProgressView radialProgressView = this.progressView;
            TextView textView = this.errorTextView;
            TopicsFragment.AnonymousClass14 anonymousClass14 = this.checkboxContainer;
            if (z3 || chartViewData.isError) {
                radialProgressView.setVisibility(8);
                String str = chartViewData.errorMessage;
                if (str != null) {
                    textView.setText(str);
                    if (textView.getVisibility() == 8) {
                        textView.setAlpha(0.0f);
                        textView.animate().alpha(1.0f);
                    }
                    textView.setVisibility(0);
                }
                anonymousClass14.removeAllViews();
                arrayList.clear();
                baseChartView.setData(null);
                return;
            }
            textView.setVisibility(8);
            LegendSignatureView legendSignatureView = baseChartView.legendSignatureView;
            boolean z4 = chartViewData.useHourFormat;
            legendSignatureView.isTopHourChart = z4;
            chartHeaderView.showDate(!z4);
            if (chartViewData.chartData == null && chartViewData.token != null) {
                radialProgressView.setAlpha(1.0f);
                radialProgressView.setVisibility(0);
                loadData(chartViewData);
                baseChartView.setData(null);
                return;
            }
            if (!z) {
                radialProgressView.setVisibility(8);
            }
            boolean data = baseChartView.setData(chartViewData.chartData);
            ChartPickerDelegate chartPickerDelegate = baseChartView.pickerDelegate;
            if (data && chartViewData.showAll) {
                chartPickerDelegate.pickerStart = 0.0f;
                chartPickerDelegate.pickerEnd = 1.0f;
                chartPickerDelegate.view.onPickerDataChanged(true, false, false);
            }
            chartHeaderView.setUseWeekInterval(chartViewData.useWeekFormat);
            baseChartView.legendSignatureView.setUseWeek(chartViewData.useWeekFormat);
            LegendSignatureView legendSignatureView2 = baseChartView.legendSignatureView;
            legendSignatureView2.zoomEnabled = this.data.zoomToken != null || this.chartType == 4;
            baseChartView2.legendSignatureView.zoomEnabled = false;
            legendSignatureView2.setEnabled(legendSignatureView2.zoomEnabled);
            LegendSignatureView legendSignatureView3 = baseChartView2.legendSignatureView;
            legendSignatureView3.setEnabled(legendSignatureView3.zoomEnabled);
            ArrayList arrayList2 = baseChartView.lines;
            int size = arrayList2.size();
            anonymousClass14.removeAllViews();
            arrayList.clear();
            if (size > 1) {
                for (int i = 0; i < size; i++) {
                    LineViewData lineViewData = (LineViewData) arrayList2.get(i);
                    CheckBoxHolder checkBoxHolder = new CheckBoxHolder(i);
                    checkBoxHolder.line = lineViewData;
                    String str2 = lineViewData.line.name;
                    FlatCheckBox flatCheckBox = checkBoxHolder.checkBox;
                    flatCheckBox.setText(str2);
                    flatCheckBox.setChecked(lineViewData.enabled, false);
                    flatCheckBox.setOnTouchListener(new RecyclerListView.FoucsableOnTouchListener());
                    flatCheckBox.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda52(22, checkBoxHolder, lineViewData));
                    flatCheckBox.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda130(5, checkBoxHolder, lineViewData));
                }
            }
            long j = this.data.activeZoom;
            if (j > 0) {
                baseChartView.selectedIndex = Arrays.binarySearch(baseChartView.chartData.x, j);
                baseChartView.legendShowing = true;
                baseChartView.legendSignatureView.setVisibility(0);
                baseChartView.selectionA = 1.0f;
                baseChartView.moveLegend((baseChartView.chartFullWidth * chartPickerDelegate.pickerStart) - BaseChartView.HORIZONTAL_PADDING);
                try {
                    baseChartView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                zoomChart(true);
            } else {
                zoomOut(false);
                baseChartView.invalidate();
            }
            recolor();
            if (z) {
                baseChartView.transitionMode = 3;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                TransitionParams transitionParams = new TransitionParams();
                baseChartView.transitionParams = transitionParams;
                transitionParams.progress = 0.0f;
                valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda18(this, 18));
                valueAnimatorOfFloat.addListener(new AnonymousClass2(this, 2));
                valueAnimatorOfFloat.start();
            }
        }

        public abstract void zoomCanceled();

        public final void zoomChart(boolean z) {
            ArrayList arrayList;
            boolean z2;
            BaseChartView baseChartView = this.chartView;
            long selectedDate = baseChartView.getSelectedDate();
            ChartData chartData = this.data.childChartData;
            BaseChartView baseChartView2 = this.zoomedChartView;
            if (!z || baseChartView2.getVisibility() != 0) {
                baseChartView2.updatePicker(chartData, selectedDate);
            }
            baseChartView2.setData(chartData);
            if (this.data.chartData.lines.size() > 1) {
                int i = 0;
                int i2 = 0;
                while (true) {
                    int size = this.data.chartData.lines.size();
                    arrayList = this.checkBoxes;
                    if (i >= size) {
                        break;
                    }
                    int i3 = 0;
                    while (true) {
                        if (i3 >= chartData.lines.size()) {
                            z2 = false;
                            break;
                        }
                        if (((ChartData.Line) chartData.lines.get(i3)).id.equals(((ChartData.Line) this.data.chartData.lines.get(i)).id)) {
                            boolean z3 = ((CheckBoxHolder) arrayList.get(i)).checkBox.checked;
                            ArrayList arrayList2 = baseChartView2.lines;
                            ((LineViewData) arrayList2.get(i3)).enabled = z3;
                            ((LineViewData) arrayList2.get(i3)).alpha = z3 ? 1.0f : 0.0f;
                            ((CheckBoxHolder) arrayList.get(i)).checkBox.enabled = true;
                            ((CheckBoxHolder) arrayList.get(i)).checkBox.animate().alpha(1.0f).start();
                            if (z3) {
                                i2++;
                            }
                            z2 = true;
                            break;
                        }
                        i3++;
                    }
                    if (!z2) {
                        ((CheckBoxHolder) arrayList.get(i)).checkBox.enabled = false;
                        ((CheckBoxHolder) arrayList.get(i)).checkBox.animate().alpha(0.0f).start();
                    }
                    i++;
                }
                if (i2 == 0) {
                    for (int i4 = 0; i4 < this.data.chartData.lines.size(); i4++) {
                        ((CheckBoxHolder) arrayList.get(i4)).checkBox.enabled = true;
                        ((CheckBoxHolder) arrayList.get(i4)).checkBox.animate().alpha(1.0f).start();
                    }
                    return;
                }
            }
            this.data.activeZoom = selectedDate;
            baseChartView.legendSignatureView.setAlpha(0.0f);
            baseChartView.selectionA = 0.0f;
            baseChartView.legendShowing = false;
            baseChartView.animateLegentTo = false;
            baseChartView2.updateColors();
            ChartHeaderView chartHeaderView = this.chartHeaderView;
            if (!z) {
                baseChartView2.selectedIndex = -1;
                baseChartView2.legendShowing = false;
                baseChartView2.animateLegentTo = false;
                baseChartView2.legendSignatureView.setVisibility(8);
                baseChartView2.selectionA = 0.0f;
                chartHeaderView.zoomTo(selectedDate, true);
            }
            baseChartView2.setHeader(chartHeaderView);
            baseChartView.setHeader(null);
            if (!z) {
                ValueAnimator valueAnimatorCreateTransitionAnimator = createTransitionAnimator(selectedDate, true);
                valueAnimatorCreateTransitionAnimator.addListener(new AnonymousClass2(this, 0));
                valueAnimatorCreateTransitionAnimator.start();
                return;
            }
            baseChartView.setVisibility(4);
            baseChartView2.setVisibility(0);
            baseChartView.transitionMode = 0;
            baseChartView2.transitionMode = 0;
            baseChartView.enabled = false;
            baseChartView2.enabled = true;
            chartHeaderView.zoomTo(selectedDate, false);
        }

        public final void zoomOut(boolean z) {
            ChartData chartData;
            ChartViewData chartViewData = this.data;
            if (chartViewData == null || (chartData = chartViewData.chartData) == null || chartData.x == null) {
                return;
            }
            ChartHeaderView chartHeaderView = this.chartHeaderView;
            chartHeaderView.getClass();
            BaseChartView baseChartView = this.chartView;
            chartHeaderView.setDates(baseChartView.getStartDate(), baseChartView.getEndDate());
            TextView textView = chartHeaderView.back;
            TextView textView2 = chartHeaderView.title;
            if (z) {
                textView2.setAlpha(0.0f);
                textView2.setScaleX(0.3f);
                textView2.setScaleY(0.3f);
                textView2.setPivotX(0.0f);
                textView2.setPivotY(0.0f);
                textView2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(200L).start();
                textView.setAlpha(1.0f);
                textView.setTranslationX(0.0f);
                textView.setTranslationY(0.0f);
                textView.setScaleX(1.0f);
                textView.setScaleY(1.0f);
                textView.setPivotY(AndroidUtilities.dp(40.0f));
                textView.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(200L).start();
            } else {
                textView2.setAlpha(1.0f);
                textView2.setScaleX(1.0f);
                textView2.setScaleY(1.0f);
                textView.setAlpha(0.0f);
            }
            baseChartView.legendSignatureView.chevron.setAlpha(1.0f);
            BaseChartView baseChartView2 = this.zoomedChartView;
            baseChartView2.setHeader(null);
            long selectedDate = baseChartView.getSelectedDate();
            this.data.activeZoom = 0L;
            int i = 0;
            baseChartView.setVisibility(0);
            baseChartView2.selectedIndex = -1;
            baseChartView2.legendShowing = false;
            baseChartView2.animateLegentTo = false;
            baseChartView2.legendSignatureView.setVisibility(8);
            baseChartView2.selectionA = 0.0f;
            baseChartView2.setHeader(null);
            baseChartView.setHeader(chartHeaderView);
            ArrayList arrayList = this.checkBoxes;
            if (z) {
                ValueAnimator valueAnimatorCreateTransitionAnimator = createTransitionAnimator(selectedDate, false);
                valueAnimatorCreateTransitionAnimator.addListener(new AnonymousClass2(this, 1));
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    CheckBoxHolder checkBoxHolder = (CheckBoxHolder) obj;
                    checkBoxHolder.checkBox.animate().alpha(1.0f).start();
                    checkBoxHolder.checkBox.enabled = true;
                }
                valueAnimatorCreateTransitionAnimator.start();
                return;
            }
            baseChartView2.setVisibility(4);
            baseChartView.enabled = true;
            baseChartView2.enabled = false;
            baseChartView.invalidate();
            Window window = this.window;
            if (window != null) {
                window.clearFlags(16);
            }
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                CheckBoxHolder checkBoxHolder2 = (CheckBoxHolder) obj2;
                checkBoxHolder2.checkBox.setAlpha(1.0f);
                checkBoxHolder2.checkBox.enabled = true;
            }
        }
    }

    public abstract class ChartCell extends BaseChartCell {
        public final int currentAccount;

        public ChartCell(Context context, int i, int i2, BaseChartView.SharedUiComponents sharedUiComponents) {
            super(context, i2, sharedUiComponents, null);
            this.currentAccount = i;
        }

        @Override
        public final void loadData(ChartViewData chartViewData) {
            StatisticActivity statisticActivity = StatisticActivity.this;
            chartViewData.load(this.currentAccount, ((BaseFragment) statisticActivity).classGuid, statisticActivity.chat.stats_dc, new StatisticActivity$$ExternalSyntheticLambda13(0, statisticActivity, this.data));
        }

        @Override
        public final void onZoomed() {
            if (this.data.activeZoom > 0) {
                return;
            }
            performClick();
            BaseChartView baseChartView = this.chartView;
            if (baseChartView.legendSignatureView.canGoZoom) {
                long selectedDate = baseChartView.getSelectedDate();
                if (this.chartType == 4) {
                    ChartViewData chartViewData = this.data;
                    chartViewData.childChartData = new StackLinearChartData(chartViewData.chartData, selectedDate);
                    zoomChart(false);
                    return;
                }
                if (this.data.zoomToken == null) {
                    return;
                }
                StatisticActivity statisticActivity = StatisticActivity.this;
                StatisticActivity.access$5100(statisticActivity);
                String str = this.data.zoomToken + "_" + selectedDate;
                ChartData chartData = (ChartData) statisticActivity.childDataCache.get(str);
                if (chartData != null) {
                    this.data.childChartData = chartData;
                    zoomChart(false);
                    return;
                }
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
                tL_loadAsyncGraph.token = this.data.zoomToken;
                if (selectedDate != 0) {
                    tL_loadAsyncGraph.x = selectedDate;
                    tL_loadAsyncGraph.flags |= 1;
                }
                ZoomCancelable zoomCancelable = new ZoomCancelable();
                statisticActivity.lastCancelable = zoomCancelable;
                statisticActivity.recyclerListView.getClass();
                zoomCancelable.adapterPosition = RecyclerView.getChildAdapterPosition(this);
                baseChartView.legendSignatureView.showProgress(true, false);
                int i = this.currentAccount;
                ConnectionsManager.getInstance(i).bindRequestToGuid(ConnectionsManager.getInstance(i).sendRequest(tL_loadAsyncGraph, new StarGiftSheet$$ExternalSyntheticLambda7(this, str, zoomCancelable, 4), null, null, 0, statisticActivity.chat.stats_dc, 1, true), ((BaseFragment) statisticActivity).classGuid);
            }
        }

        @Override
        public final void zoomCanceled() {
            StatisticActivity.access$5100(StatisticActivity.this);
        }
    }

    public final class ChartViewData {
        public long activeZoom;
        public ChartData chartData;
        public ChartData childChartData;
        public String errorMessage;
        public final int graphType;
        public boolean isEmpty;
        public boolean isError;
        public boolean isLanguages;
        public boolean loading;
        public boolean showAll;
        public final String title;
        public String token;
        public boolean useHourFormat;
        public boolean useWeekFormat;
        public String zoomToken;

        public ChartViewData(String str, int i) {
            this.title = str;
            this.graphType = i;
        }

        public final void load(int i, int i2, int i3, Utilities.Callback0Return callback0Return) {
            if (this.loading) {
                return;
            }
            this.loading = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.token;
            ConnectionsManager.getInstance(i).bindRequestToGuid(ConnectionsManager.getInstance(i).sendRequest(tL_loadAsyncGraph, new ProfileActivity$$ExternalSyntheticLambda65(25, this, callback0Return), null, null, 0, i3, 1, true), i2);
        }
    }

    public final class DiffUtilsCallback extends DiffUtil {
        public final Adapter adapter;
        public int count;
        public final LinearLayoutManager layoutManager;
        public final SparseIntArray positionToTypeMap = new SparseIntArray();
        public int growCell = -1;
        public int folowersCell = -1;
        public int interactionsCell = -1;
        public int ivInteractionsCell = -1;
        public int viewsBySourceCell = -1;
        public int newFollowersBySourceCell = -1;
        public int languagesCell = -1;
        public int topHourseCell = -1;
        public int notificationsCell = -1;
        public int reactionsByEmotionCell = -1;
        public int storyInteractionsCell = -1;
        public int storyReactionsByEmotionCell = -1;
        public int groupMembersCell = -1;
        public int newMembersBySourceCell = -1;
        public int membersLanguageCell = -1;
        public int messagesCell = -1;
        public int actionsCell = -1;
        public int topDayOfWeeksCell = -1;
        public int startPosts = -1;
        public int endPosts = -1;

        public DiffUtilsCallback(Adapter adapter, LinearLayoutManager linearLayoutManager) {
            this.adapter = adapter;
            this.layoutManager = linearLayoutManager;
        }

        @Override
        public final boolean areContentsTheSame(int i, int i2) {
            return this.positionToTypeMap.get(i) == this.adapter.getItemViewType(i2);
        }

        @Override
        public final boolean areItemsTheSame(int i, int i2) {
            SparseIntArray sparseIntArray = this.positionToTypeMap;
            int i3 = sparseIntArray.get(i);
            Adapter adapter = this.adapter;
            if (i3 == 13 && adapter.getItemViewType(i2) == 13) {
                return true;
            }
            if (sparseIntArray.get(i) == 10 && adapter.getItemViewType(i2) == 10) {
                return true;
            }
            int i4 = this.startPosts;
            if (i >= i4 && i <= this.endPosts) {
                return i - i4 == i2 - adapter.recentPostsStartRow;
            }
            if (i == this.growCell && i2 == adapter.growCell) {
                return true;
            }
            if (i == this.folowersCell && i2 == adapter.folowersCell) {
                return true;
            }
            if (i == this.interactionsCell && i2 == adapter.interactionsCell) {
                return true;
            }
            if (i == this.ivInteractionsCell && i2 == adapter.ivInteractionsCell) {
                return true;
            }
            if (i == this.viewsBySourceCell && i2 == adapter.viewsBySourceCell) {
                return true;
            }
            if (i == this.newFollowersBySourceCell && i2 == adapter.newFollowersBySourceCell) {
                return true;
            }
            if (i == this.languagesCell && i2 == adapter.languagesCell) {
                return true;
            }
            if (i == this.topHourseCell && i2 == adapter.topHourseCell) {
                return true;
            }
            if (i == this.notificationsCell && i2 == adapter.notificationsCell) {
                return true;
            }
            if (i == this.groupMembersCell && i2 == adapter.groupMembersCell) {
                return true;
            }
            if (i == this.newMembersBySourceCell && i2 == adapter.newMembersBySourceCell) {
                return true;
            }
            if (i == this.membersLanguageCell && i2 == adapter.membersLanguageCell) {
                return true;
            }
            if (i == this.messagesCell && i2 == adapter.messagesCell) {
                return true;
            }
            if (i == this.actionsCell && i2 == adapter.actionsCell) {
                return true;
            }
            if (i == this.topDayOfWeeksCell && i2 == adapter.topDayOfWeeksCell) {
                return true;
            }
            if (i == this.reactionsByEmotionCell && i2 == adapter.reactionsByEmotionCell) {
                return true;
            }
            if (i == this.storyInteractionsCell && i2 == adapter.storyInteractionsCell) {
                return true;
            }
            return i == this.storyReactionsByEmotionCell && i2 == adapter.storyReactionsByEmotionCell;
        }

        @Override
        public final int getNewListSize() {
            return this.adapter.count;
        }

        @Override
        public final int getOldListSize() {
            return this.count;
        }

        public final void update() {
            long itemId;
            int top;
            View viewFindViewByPosition;
            SparseIntArray sparseIntArray = this.positionToTypeMap;
            sparseIntArray.clear();
            Adapter adapter = this.adapter;
            this.count = adapter.count;
            int i = 0;
            for (int i2 = 0; i2 < this.count; i2++) {
                sparseIntArray.put(i2, adapter.getItemViewType(i2));
            }
            this.growCell = adapter.growCell;
            this.folowersCell = adapter.folowersCell;
            this.interactionsCell = adapter.interactionsCell;
            this.ivInteractionsCell = adapter.ivInteractionsCell;
            this.viewsBySourceCell = adapter.viewsBySourceCell;
            this.newFollowersBySourceCell = adapter.newFollowersBySourceCell;
            this.languagesCell = adapter.languagesCell;
            this.topHourseCell = adapter.topHourseCell;
            this.notificationsCell = adapter.notificationsCell;
            this.startPosts = adapter.recentPostsStartRow;
            this.endPosts = adapter.recentPostsEndRow;
            this.reactionsByEmotionCell = adapter.reactionsByEmotionCell;
            this.storyInteractionsCell = adapter.storyInteractionsCell;
            this.storyReactionsByEmotionCell = adapter.storyReactionsByEmotionCell;
            this.groupMembersCell = adapter.groupMembersCell;
            this.newMembersBySourceCell = adapter.newMembersBySourceCell;
            this.membersLanguageCell = adapter.membersLanguageCell;
            this.messagesCell = adapter.messagesCell;
            this.actionsCell = adapter.actionsCell;
            this.topDayOfWeeksCell = adapter.topDayOfWeeksCell;
            adapter.update();
            LinearLayoutManager linearLayoutManager = this.layoutManager;
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            while (true) {
                if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
                    itemId = -1;
                    top = 0;
                    break;
                } else {
                    if (adapter.getItemId(iFindFirstVisibleItemPosition) != -1 && (viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) != null) {
                        itemId = adapter.getItemId(iFindFirstVisibleItemPosition);
                        top = viewFindViewByPosition.getTop();
                        break;
                    }
                    iFindFirstVisibleItemPosition++;
                }
            }
            DiffUtil.calculateDiff(this, true).dispatchUpdatesTo(new GroupCallActivity.UpdateCallback(adapter, 1));
            if (itemId != -1) {
                while (true) {
                    if (i >= adapter.count) {
                        i = -1;
                        break;
                    } else if (adapter.getItemId(i) == itemId) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i > 0) {
                    linearLayoutManager.scrollToPositionWithOffset(i, top, linearLayoutManager.mShouldReverseLayout);
                }
            }
        }
    }

    public final class MemberData {
        public String description;
        public TLRPC.User user;

        public final void onClick(StatisticActivity statisticActivity) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.user.id);
            MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.user, false);
            statisticActivity.presentFragment(new ProfileActivity(bundle, null));
        }

        public final void onLongClick(final TLRPC.ChatFull chatFull, final StatisticActivity statisticActivity, final AlertDialog[] alertDialogArr, boolean z) {
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant;
            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant2;
            boolean z2;
            int i;
            String str;
            ArrayList<TLRPC.ChatParticipant> arrayList;
            MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.user, false);
            ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            if (!z || (arrayList = chatFull.participants.participants) == null) {
                tL_chatChannelParticipant = null;
                tL_chatChannelParticipant2 = null;
            } else {
                int size = arrayList.size();
                tL_chatChannelParticipant = null;
                tL_chatChannelParticipant2 = null;
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i2);
                    long j = chatParticipant.user_id;
                    if (j == this.user.id && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                        tL_chatChannelParticipant = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                    }
                    if (j == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                        tL_chatChannelParticipant2 = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                    }
                }
            }
            arrayList2.add(LocaleController.getString("StatisticOpenProfile", R.string.StatisticOpenProfile));
            zzlo.m(R.drawable.msg_openprofile, 2, arrayList4, arrayList3);
            arrayList2.add(LocaleController.getString("StatisticSearchUserHistory", R.string.StatisticSearchUserHistory));
            zzlo.m(R.drawable.msg_msgbubble3, 1, arrayList4, arrayList3);
            if (z && tL_chatChannelParticipant == null) {
                if (alertDialogArr[0] == null) {
                    AlertDialog alertDialog = new AlertDialog(statisticActivity.getFragmentView().getContext(), 3, null);
                    alertDialogArr[0] = alertDialog;
                    AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                    AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                    AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 300L);
                }
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.id);
                tL_channels_getParticipant.participant = MessagesController.getInputPeer(this.user);
                final int i3 = 0;
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant, new RequestDelegate(this) {
                    public final StatisticActivity.MemberData f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i3) {
                            case 0:
                                final StatisticActivity.MemberData memberData = this.f$0;
                                memberData.getClass();
                                final StatisticActivity statisticActivity2 = statisticActivity;
                                final AlertDialog[] alertDialogArr2 = alertDialogArr;
                                final TLRPC.ChatFull chatFull2 = chatFull;
                                final int i4 = 0;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i4) {
                                            case 0:
                                                StatisticActivity.MemberData memberData2 = memberData;
                                                memberData2.getClass();
                                                StatisticActivity statisticActivity3 = statisticActivity2;
                                                if (!statisticActivity3.isFinishing() && statisticActivity3.getFragmentView() != null) {
                                                    AlertDialog[] alertDialogArr3 = alertDialogArr2;
                                                    if (alertDialogArr3[0] != null) {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        TLRPC.ChatFull chatFull3 = chatFull2;
                                                        if (tL_error2 != null) {
                                                            memberData2.onLongClick(chatFull3, statisticActivity3, alertDialogArr3, false);
                                                        } else {
                                                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                            tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                            tL_chatChannelParticipant3.user_id = memberData2.user.id;
                                                            chatFull3.participants.participants.add(0, tL_chatChannelParticipant3);
                                                            memberData2.onLongClick(chatFull3, statisticActivity3, alertDialogArr3, true);
                                                        }
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                StatisticActivity.MemberData memberData3 = memberData;
                                                memberData3.getClass();
                                                StatisticActivity statisticActivity4 = statisticActivity2;
                                                if (!statisticActivity4.isFinishing() && statisticActivity4.getFragmentView() != null) {
                                                    AlertDialog[] alertDialogArr4 = alertDialogArr2;
                                                    if (alertDialogArr4[0] != null) {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        TLRPC.ChatFull chatFull4 = chatFull2;
                                                        if (tL_error3 != null) {
                                                            memberData3.onLongClick(chatFull4, statisticActivity4, alertDialogArr4, false);
                                                        } else {
                                                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                            tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                            tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                            chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                            memberData3.onLongClick(chatFull4, statisticActivity4, alertDialogArr4, true);
                                                        }
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final StatisticActivity.MemberData memberData2 = this.f$0;
                                memberData2.getClass();
                                final StatisticActivity statisticActivity3 = statisticActivity;
                                final AlertDialog[] alertDialogArr3 = alertDialogArr;
                                final TLRPC.ChatFull chatFull3 = chatFull;
                                final int i5 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i5) {
                                            case 0:
                                                StatisticActivity.MemberData memberData3 = memberData2;
                                                memberData3.getClass();
                                                StatisticActivity statisticActivity4 = statisticActivity3;
                                                if (!statisticActivity4.isFinishing() && statisticActivity4.getFragmentView() != null) {
                                                    AlertDialog[] alertDialogArr4 = alertDialogArr3;
                                                    if (alertDialogArr4[0] != null) {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        TLRPC.ChatFull chatFull4 = chatFull3;
                                                        if (tL_error2 != null) {
                                                            memberData3.onLongClick(chatFull4, statisticActivity4, alertDialogArr4, false);
                                                        } else {
                                                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                            tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                            tL_chatChannelParticipant3.user_id = memberData3.user.id;
                                                            chatFull4.participants.participants.add(0, tL_chatChannelParticipant3);
                                                            memberData3.onLongClick(chatFull4, statisticActivity4, alertDialogArr4, true);
                                                        }
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                StatisticActivity.MemberData memberData4 = memberData2;
                                                memberData4.getClass();
                                                StatisticActivity statisticActivity5 = statisticActivity3;
                                                if (!statisticActivity5.isFinishing() && statisticActivity5.getFragmentView() != null) {
                                                    AlertDialog[] alertDialogArr5 = alertDialogArr3;
                                                    if (alertDialogArr5[0] != null) {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        TLRPC.ChatFull chatFull5 = chatFull3;
                                                        if (tL_error3 != null) {
                                                            memberData4.onLongClick(chatFull5, statisticActivity5, alertDialogArr5, false);
                                                        } else {
                                                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                            tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                            tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                            chatFull5.participants.participants.add(0, tL_chatChannelParticipant4);
                                                            memberData4.onLongClick(chatFull5, statisticActivity5, alertDialogArr5, true);
                                                        }
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                });
                return;
            }
            if (z && tL_chatChannelParticipant2 == null) {
                if (alertDialogArr[0] == null) {
                    AlertDialog alertDialog2 = new AlertDialog(statisticActivity.getFragmentView().getContext(), 3, null);
                    alertDialogArr[0] = alertDialog2;
                    AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda2 = alertDialog2.showRunnable;
                    AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda2);
                    AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda2, 300L);
                }
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant2.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.id);
                tL_channels_getParticipant2.participant = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(UserConfig.getInstance(UserConfig.selectedAccount).clientUserId);
                final int i4 = 1;
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant2, new RequestDelegate(this) {
                    public final StatisticActivity.MemberData f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i4) {
                            case 0:
                                final StatisticActivity.MemberData memberData = this.f$0;
                                memberData.getClass();
                                final StatisticActivity statisticActivity2 = statisticActivity;
                                final AlertDialog[] alertDialogArr2 = alertDialogArr;
                                final TLRPC.ChatFull chatFull2 = chatFull;
                                final int i5 = 0;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i5) {
                                            case 0:
                                                StatisticActivity.MemberData memberData3 = memberData;
                                                memberData3.getClass();
                                                StatisticActivity statisticActivity4 = statisticActivity2;
                                                if (!statisticActivity4.isFinishing() && statisticActivity4.getFragmentView() != null) {
                                                    AlertDialog[] alertDialogArr4 = alertDialogArr2;
                                                    if (alertDialogArr4[0] != null) {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        TLRPC.ChatFull chatFull4 = chatFull2;
                                                        if (tL_error2 != null) {
                                                            memberData3.onLongClick(chatFull4, statisticActivity4, alertDialogArr4, false);
                                                        } else {
                                                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                            tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                            tL_chatChannelParticipant3.user_id = memberData3.user.id;
                                                            chatFull4.participants.participants.add(0, tL_chatChannelParticipant3);
                                                            memberData3.onLongClick(chatFull4, statisticActivity4, alertDialogArr4, true);
                                                        }
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                StatisticActivity.MemberData memberData4 = memberData;
                                                memberData4.getClass();
                                                StatisticActivity statisticActivity5 = statisticActivity2;
                                                if (!statisticActivity5.isFinishing() && statisticActivity5.getFragmentView() != null) {
                                                    AlertDialog[] alertDialogArr5 = alertDialogArr2;
                                                    if (alertDialogArr5[0] != null) {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        TLRPC.ChatFull chatFull5 = chatFull2;
                                                        if (tL_error3 != null) {
                                                            memberData4.onLongClick(chatFull5, statisticActivity5, alertDialogArr5, false);
                                                        } else {
                                                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                            tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                            tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                            chatFull5.participants.participants.add(0, tL_chatChannelParticipant4);
                                                            memberData4.onLongClick(chatFull5, statisticActivity5, alertDialogArr5, true);
                                                        }
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final StatisticActivity.MemberData memberData2 = this.f$0;
                                memberData2.getClass();
                                final StatisticActivity statisticActivity3 = statisticActivity;
                                final AlertDialog[] alertDialogArr3 = alertDialogArr;
                                final TLRPC.ChatFull chatFull3 = chatFull;
                                final int i6 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i6) {
                                            case 0:
                                                StatisticActivity.MemberData memberData3 = memberData2;
                                                memberData3.getClass();
                                                StatisticActivity statisticActivity4 = statisticActivity3;
                                                if (!statisticActivity4.isFinishing() && statisticActivity4.getFragmentView() != null) {
                                                    AlertDialog[] alertDialogArr4 = alertDialogArr3;
                                                    if (alertDialogArr4[0] != null) {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        TLRPC.ChatFull chatFull4 = chatFull3;
                                                        if (tL_error2 != null) {
                                                            memberData3.onLongClick(chatFull4, statisticActivity4, alertDialogArr4, false);
                                                        } else {
                                                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                            tL_chatChannelParticipant3.channelParticipant = tL_channels_channelParticipant.participant;
                                                            tL_chatChannelParticipant3.user_id = memberData3.user.id;
                                                            chatFull4.participants.participants.add(0, tL_chatChannelParticipant3);
                                                            memberData3.onLongClick(chatFull4, statisticActivity4, alertDialogArr4, true);
                                                        }
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                StatisticActivity.MemberData memberData4 = memberData2;
                                                memberData4.getClass();
                                                StatisticActivity statisticActivity5 = statisticActivity3;
                                                if (!statisticActivity5.isFinishing() && statisticActivity5.getFragmentView() != null) {
                                                    AlertDialog[] alertDialogArr5 = alertDialogArr3;
                                                    if (alertDialogArr5[0] != null) {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        TLRPC.ChatFull chatFull5 = chatFull3;
                                                        if (tL_error3 != null) {
                                                            memberData4.onLongClick(chatFull5, statisticActivity5, alertDialogArr5, false);
                                                        } else {
                                                            TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant2 = (TLRPC.TL_channels_channelParticipant) tLObject;
                                                            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                            tL_chatChannelParticipant4.channelParticipant = tL_channels_channelParticipant2.participant;
                                                            tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                            chatFull5.participants.participants.add(0, tL_chatChannelParticipant4);
                                                            memberData4.onLongClick(chatFull5, statisticActivity5, alertDialogArr5, true);
                                                        }
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                });
                return;
            }
            AlertDialog alertDialog3 = alertDialogArr[0];
            if (alertDialog3 != null) {
                alertDialog3.dismiss();
                alertDialogArr[0] = null;
            }
            if (tL_chatChannelParticipant2 == null || tL_chatChannelParticipant == null || tL_chatChannelParticipant2.user_id == tL_chatChannelParticipant.user_id) {
                z2 = false;
            } else {
                TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = tL_chatChannelParticipant2.channelParticipant.admin_rights;
                boolean z3 = tL_chatAdminRights != null && tL_chatAdminRights.add_admins;
                if (z3 && ((channelParticipant instanceof TLRPC.TL_channelParticipantCreator) || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit))) {
                    z3 = false;
                }
                if (z3) {
                    z2 = channelParticipant.admin_rights == null;
                    if (z2) {
                        i = R.string.SetAsAdmin;
                        str = "SetAsAdmin";
                    } else {
                        i = R.string.EditAdminRights;
                        str = "EditAdminRights";
                    }
                    arrayList2.add(LocaleController.getString(str, i));
                    zzlo.m(z2 ? R.drawable.msg_admins : R.drawable.msg_permissions, 0, arrayList4, arrayList3);
                } else {
                    z2 = false;
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(statisticActivity.getParentActivity(), 0, null);
            CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
            int[] intArray = AndroidUtilities.toIntArray(arrayList4);
            final boolean z4 = z2;
            final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = tL_chatChannelParticipant;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    final StatisticActivity.MemberData memberData = this.f$0;
                    memberData.getClass();
                    ArrayList arrayList5 = arrayList3;
                    int iIntValue = ((Integer) arrayList5.get(i5)).intValue();
                    final StatisticActivity statisticActivity2 = statisticActivity;
                    TLRPC.ChatFull chatFull2 = chatFull;
                    if (iIntValue != 0) {
                        if (((Integer) arrayList5.get(i5)).intValue() == 2) {
                            memberData.onClick(statisticActivity2);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chatFull2.id);
                        bundle.putLong("search_from_user_id", memberData.user.id);
                        statisticActivity2.presentFragment(new ChatActivity(bundle));
                        return;
                    }
                    final boolean[] zArr = new boolean[1];
                    long j2 = memberData.user.id;
                    long j3 = chatFull2.id;
                    final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant3;
                    TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                    String str2 = channelParticipant2.rank;
                    final boolean z5 = z4;
                    ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(j2, j3, tL_chatAdminRights2, tL_chatBannedRights, str2, z5) {
                        @Override
                        public final void onTransitionAnimationEnd(boolean z6, boolean z7) {
                            if (!z6 && z7 && zArr[0]) {
                                StatisticActivity statisticActivity3 = statisticActivity2;
                                if (BulletinFactory.canShowBulletin(statisticActivity3)) {
                                    BulletinFactory.createPromoteToAdminBulletin(statisticActivity3, MemberData.this.user.first_name).show();
                                }
                            }
                        }
                    };
                    chatRightsEditActivity.delegate = new ChatRightsEditActivity.ChatRightsEditActivityDelegate() {
                        @Override
                        public final void didChangeOwner(TLRPC.User user) {
                        }

                        @Override
                        public final void didSetRights(int i6, TLRPC.TL_chatAdminRights tL_chatAdminRights3, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str3) {
                            TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant5 = tL_chatChannelParticipant4;
                            if (i6 == 0) {
                                TLRPC.ChannelParticipant channelParticipant3 = tL_chatChannelParticipant5.channelParticipant;
                                channelParticipant3.admin_rights = null;
                                channelParticipant3.rank = "";
                            } else {
                                TLRPC.ChannelParticipant channelParticipant4 = tL_chatChannelParticipant5.channelParticipant;
                                channelParticipant4.admin_rights = tL_chatAdminRights3;
                                channelParticipant4.rank = str3;
                                if (z5) {
                                    zArr[0] = true;
                                }
                            }
                        }
                    };
                    statisticActivity2.presentFragment(chatRightsEditActivity);
                }
            };
            AlertDialog alertDialog4 = builder.alertDialog;
            alertDialog4.items = charSequenceArr;
            alertDialog4.itemIcons = intArray;
            alertDialog4.onClickListener = onClickListener;
            statisticActivity.showDialog(alertDialog4);
        }
    }

    public final class OverviewChannelData {
        public final String followersPrimary;
        public final String followersSecondary;
        public final String followersTitle;
        public final boolean followersUp;
        public final String notificationsPrimary;
        public final String notificationsTitle;
        public final String reactionsPerPostPrimary;
        public final String reactionsPerPostSecondary;
        public final String reactionsPerPostTitle;
        public final boolean reactionsPerPostUp;
        public final boolean reactionsPerPostVisible;
        public final String reactionsPerStoryPrimary;
        public final String reactionsPerStorySecondary;
        public final String reactionsPerStoryTitle;
        public final boolean reactionsPerStoryUp;
        public final boolean reactionsPerStoryVisible;
        public final String sharesPerStoryPrimary;
        public final String sharesPerStorySecondary;
        public final String sharesPerStoryTitle;
        public final boolean sharesPerStoryUp;
        public final boolean sharesPerStoryVisible;
        public final String sharesPrimary;
        public final String sharesSecondary;
        public final String sharesTitle;
        public final boolean sharesUp;
        public final String viewsPerStoryPrimary;
        public final String viewsPerStorySecondary;
        public final String viewsPerStoryTitle;
        public final boolean viewsPerStoryUp;
        public final boolean viewsPerStoryVisible;
        public final String viewsPrimary;
        public final String viewsSecondary;
        public final String viewsTitle;
        public final boolean viewsUp;

        public OverviewChannelData(TL_stats.TL_broadcastStats tL_broadcastStats) {
            float f;
            float f2;
            Parser parserPrepare = prepare(tL_broadcastStats.reactions_per_post);
            this.reactionsPerPostTitle = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            this.reactionsPerPostPrimary = (String) parserPrepare.blockParserFactories;
            this.reactionsPerPostSecondary = (String) parserPrepare.delimiterProcessors;
            this.reactionsPerPostUp = ((Boolean) parserPrepare.postProcessors).booleanValue();
            this.reactionsPerPostVisible = ((Boolean) parserPrepare.inlineParserFactory).booleanValue();
            Parser parserPrepare2 = prepare(tL_broadcastStats.reactions_per_story);
            this.reactionsPerStoryTitle = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            this.reactionsPerStoryPrimary = (String) parserPrepare2.blockParserFactories;
            this.reactionsPerStorySecondary = (String) parserPrepare2.delimiterProcessors;
            this.reactionsPerStoryUp = ((Boolean) parserPrepare2.postProcessors).booleanValue();
            this.reactionsPerStoryVisible = ((Boolean) parserPrepare2.inlineParserFactory).booleanValue();
            Parser parserPrepare3 = prepare(tL_broadcastStats.views_per_story);
            this.viewsPerStoryTitle = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            this.viewsPerStoryPrimary = (String) parserPrepare3.blockParserFactories;
            this.viewsPerStorySecondary = (String) parserPrepare3.delimiterProcessors;
            this.viewsPerStoryUp = ((Boolean) parserPrepare3.postProcessors).booleanValue();
            this.viewsPerStoryVisible = ((Boolean) parserPrepare3.inlineParserFactory).booleanValue();
            Parser parserPrepare4 = prepare(tL_broadcastStats.shares_per_story);
            this.sharesPerStoryTitle = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            this.sharesPerStoryPrimary = (String) parserPrepare4.blockParserFactories;
            this.sharesPerStorySecondary = (String) parserPrepare4.delimiterProcessors;
            this.sharesPerStoryUp = ((Boolean) parserPrepare4.postProcessors).booleanValue();
            this.sharesPerStoryVisible = ((Boolean) parserPrepare4.inlineParserFactory).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            double d = tL_statsAbsValueAndPrev.current;
            double d2 = tL_statsAbsValueAndPrev.previous;
            int i = (int) (d - d2);
            float fAbs = d2 == 0.0d ? 0.0f : Math.abs((i / ((float) d2)) * 100.0f);
            this.followersTitle = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            this.followersPrimary = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i == 0 || fAbs == 0.0f) {
                f = 100.0f;
                f2 = 0.0f;
                this.followersSecondary = "";
            } else {
                f = 100.0f;
                int i2 = (int) fAbs;
                f2 = 0.0f;
                if (fAbs == i2) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i > 0 ? "+" : "");
                    sb.append(AndroidUtilities.formatWholeNumber(i, 0));
                    this.followersSecondary = sb.toString() + " (" + i2 + "%)";
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i > 0 ? "+" : "");
                    sb2.append(AndroidUtilities.formatWholeNumber(i, 0));
                    this.followersSecondary = String.format(locale2, "%s (%.1f%s)", sb2.toString(), Float.valueOf(fAbs), "%");
                }
            }
            this.followersUp = i >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d3 = tL_statsAbsValueAndPrev2.current;
            double d4 = tL_statsAbsValueAndPrev2.previous;
            int i3 = (int) (d3 - d4);
            float fAbs2 = d4 == r11 ? 0.0f : Math.abs((i3 / ((float) d4)) * f);
            this.sharesTitle = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            this.sharesPrimary = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i3 == 0 || fAbs2 == f2) {
                this.sharesSecondary = "";
            } else {
                int i4 = (int) fAbs2;
                if (fAbs2 == i4) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i3 > 0 ? "+" : "");
                    sb3.append(AndroidUtilities.formatWholeNumber(i3, 0));
                    this.sharesSecondary = sb3.toString() + " (" + i4 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i3 > 0 ? "+" : "");
                    sb4.append(AndroidUtilities.formatWholeNumber(i3, 0));
                    this.sharesSecondary = String.format(locale4, "%s (%.1f%s)", sb4.toString(), Float.valueOf(fAbs2), "%");
                }
            }
            this.sharesUp = i3 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d5 = tL_statsAbsValueAndPrev3.current;
            double d6 = tL_statsAbsValueAndPrev3.previous;
            int i5 = (int) (d5 - d6);
            float fAbs3 = d6 == 0 ? 0.0f : Math.abs((i5 / ((float) d6)) * f);
            this.viewsTitle = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            this.viewsPrimary = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
            if (i5 == 0 || fAbs3 == f2) {
                this.viewsSecondary = "";
            } else {
                int i6 = (int) fAbs3;
                if (fAbs3 == i6) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(i5 > 0 ? "+" : "");
                    sb5.append(AndroidUtilities.formatWholeNumber(i5, 0));
                    this.viewsSecondary = sb5.toString() + " (" + i6 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(i5 > 0 ? "+" : "");
                    sb6.append(AndroidUtilities.formatWholeNumber(i5, 0));
                    this.viewsSecondary = String.format(locale6, "%s (%.1f%s)", sb6.toString(), Float.valueOf(fAbs3), "%");
                }
            }
            this.viewsUp = i5 >= 0;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f3 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            this.notificationsTitle = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i7 = (int) f3;
            if (f3 != i7) {
                this.notificationsPrimary = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f3), "%");
            } else {
                Locale locale7 = Locale.ENGLISH;
                this.notificationsPrimary = RendererCapabilities.CC.m(i7, "%");
            }
        }

        public static Parser prepare(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
            boolean z = true;
            double d = tL_statsAbsValueAndPrev.current;
            double d2 = tL_statsAbsValueAndPrev.previous;
            int i = (int) (d - d2);
            float fAbs = d2 == 0.0d ? 0.0f : Math.abs((i / ((float) d2)) * 100.0f);
            String wholeNumber = AndroidUtilities.formatWholeNumber((int) tL_statsAbsValueAndPrev.current, 0);
            String str = "";
            if (i != 0 && fAbs != 0.0f) {
                int i2 = (int) fAbs;
                if (fAbs == i2) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i > 0 ? "+" : "");
                    sb.append(AndroidUtilities.formatWholeNumber(i, 0));
                    str = sb.toString() + " (" + i2 + "%)";
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i > 0 ? "+" : "");
                    sb2.append(AndroidUtilities.formatWholeNumber(i, 0));
                    str = String.format(locale2, "%s (%.1f%s)", sb2.toString(), Float.valueOf(fAbs), "%");
                }
            }
            String str2 = str;
            boolean z2 = i >= 0;
            if (i == 0 && tL_statsAbsValueAndPrev.current == 0.0d) {
                z = false;
            }
            return new Parser(wholeNumber, str2, Boolean.valueOf(z2), Boolean.valueOf(z), 24);
        }
    }

    public final class OverviewChatData {
        public final String membersPrimary;
        public final String membersSecondary;
        public final String membersTitle;
        public final boolean membersUp;
        public final String messagesPrimary;
        public final String messagesSecondary;
        public final String messagesTitle;
        public final boolean messagesUp;
        public final String postingMembersPrimary;
        public final String postingMembersSecondary;
        public final String postingMembersTitle;
        public final boolean postingMembersUp;
        public final String viewingMembersPrimary;
        public final String viewingMembersSecondary;
        public final String viewingMembersTitle;
        public final boolean viewingMembersUp;

        public OverviewChatData(TL_stats.TL_megagroupStats tL_megagroupStats) {
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_megagroupStats.members;
            double d = tL_statsAbsValueAndPrev.current;
            double d2 = tL_statsAbsValueAndPrev.previous;
            int i = (int) (d - d2);
            float fAbs = d2 == 0.0d ? 0.0f : Math.abs((i / ((float) d2)) * 100.0f);
            this.membersTitle = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            this.membersPrimary = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
            if (i == 0 || fAbs == 0.0f) {
                this.membersSecondary = "";
            } else {
                int i2 = (int) fAbs;
                if (fAbs == i2) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i > 0 ? "+" : "");
                    sb.append(AndroidUtilities.formatWholeNumber(i, 0));
                    this.membersSecondary = sb.toString() + " (" + i2 + "%)";
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i > 0 ? "+" : "");
                    sb2.append(AndroidUtilities.formatWholeNumber(i, 0));
                    this.membersSecondary = String.format(locale2, "%s (%.1f%s)", sb2.toString(), Float.valueOf(fAbs), "%");
                }
            }
            this.membersUp = i >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_megagroupStats.viewers;
            double d3 = tL_statsAbsValueAndPrev2.current;
            double d4 = tL_statsAbsValueAndPrev2.previous;
            int i3 = (int) (d3 - d4);
            float fAbs2 = d4 == 0.0d ? 0.0f : Math.abs((i3 / ((float) d4)) * 100.0f);
            this.viewingMembersTitle = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            this.viewingMembersPrimary = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
            if (i3 == 0 || fAbs2 == 0.0f) {
                this.viewingMembersSecondary = "";
            } else {
                Locale locale3 = Locale.ENGLISH;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i3 > 0 ? "+" : "");
                sb3.append(AndroidUtilities.formatWholeNumber(i3, 0));
                this.viewingMembersSecondary = sb3.toString();
            }
            this.viewingMembersUp = i3 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_megagroupStats.posters;
            double d5 = tL_statsAbsValueAndPrev3.current;
            double d6 = tL_statsAbsValueAndPrev3.previous;
            int i4 = (int) (d5 - d6);
            float fAbs3 = d6 == 0.0d ? 0.0f : Math.abs((i4 / ((float) d6)) * 100.0f);
            this.postingMembersTitle = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            this.postingMembersPrimary = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
            if (i4 == 0 || fAbs3 == 0.0f) {
                this.postingMembersSecondary = "";
            } else {
                Locale locale4 = Locale.ENGLISH;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(i4 > 0 ? "+" : "");
                sb4.append(AndroidUtilities.formatWholeNumber(i4, 0));
                this.postingMembersSecondary = sb4.toString();
            }
            this.postingMembersUp = i4 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.messages;
            double d7 = tL_statsAbsValueAndPrev4.current;
            double d8 = tL_statsAbsValueAndPrev4.previous;
            int i5 = (int) (d7 - d8);
            float fAbs4 = d8 == 0.0d ? 0.0f : Math.abs((i5 / ((float) d8)) * 100.0f);
            this.messagesTitle = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            this.messagesPrimary = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
            if (i5 == 0 || fAbs4 == 0.0f) {
                this.messagesSecondary = "";
            } else {
                Locale locale5 = Locale.ENGLISH;
                StringBuilder sb5 = new StringBuilder();
                sb5.append(i5 <= 0 ? "" : "+");
                sb5.append(AndroidUtilities.formatWholeNumber(i5, 0));
                this.messagesSecondary = sb5.toString();
            }
            this.messagesUp = i5 >= 0;
        }
    }

    public final class RecentPostInfo {
        public TL_stats.PostInteractionCounters counters;
        public MessageObject message;

        public final int getId() {
            TL_stats.PostInteractionCounters postInteractionCounters = this.counters;
            if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersMessage) {
                return ((TL_stats.TL_postInteractionCountersMessage) postInteractionCounters).msg_id;
            }
            if (postInteractionCounters instanceof TL_stats.TL_postInteractionCountersStory) {
                return ((TL_stats.TL_postInteractionCountersStory) postInteractionCounters).story_id;
            }
            return 0;
        }
    }

    public final class UniversalChartCell extends BaseChartCell {
        public final int classGuid;
        public final int currentAccount;
        public StatisticActivity$$ExternalSyntheticLambda13 findCell;
        public int stats_dc;

        public UniversalChartCell(Context context, int i, int i2, BaseChartView.SharedUiComponents sharedUiComponents, int i3) {
            super(context, i2, sharedUiComponents, null);
            this.currentAccount = i;
            this.classGuid = i3;
        }

        @Override
        public final void loadData(ChartViewData chartViewData) {
            int i;
            if (chartViewData == null || (i = this.stats_dc) < 0) {
                return;
            }
            chartViewData.load(this.currentAccount, this.classGuid, i, this.findCell);
        }

        @Override
        public final void onZoomed() {
        }

        @Override
        public final void zoomCanceled() {
        }
    }

    public final class ZoomCancelable {
        public int adapterPosition;
        public boolean canceled;
    }

    public StatisticActivity(Bundle bundle) {
        super(bundle);
        int i = Build.VERSION.SDK_INT;
        this.topMembersAll = new ArrayList();
        this.topMembersVisible = new ArrayList();
        this.topInviters = new ArrayList();
        this.topAdmins = new ArrayList();
        this.childDataCache = new LruCache(50);
        this.progressDialog = new AlertDialog[1];
        this.loadFromId = -1;
        this.recentPostIdtoIndexMap = new SparseIntArray();
        this.recentStoriesIdtoIndexMap = new SparseIntArray();
        this.recentPostsAll = new ArrayList();
        this.recentPostsLoaded = new ArrayList();
        this.recentStoriesAll = new ArrayList();
        this.recentStoriesLoaded = new ArrayList();
        this.recentAllSortedDataLoaded = new ArrayList();
        this.initialLoading = true;
        this.showProgressbar = new LaunchActivity.AnonymousClass18(this, 18);
        ArrayList arrayList = new ArrayList();
        this.iBlur3Positions = arrayList;
        RectF rectF = new RectF();
        this.iBlur3PositionActionBar = rectF;
        RectF rectF2 = new RectF();
        this.iBlur3PositionMainTabs = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j = bundle.getLong("chat_id");
        this.chatId = j;
        this.isMegagroup = bundle.getBoolean("is_megagroup", false);
        this.startFromBoosts = bundle.getBoolean("start_from_boosts", false);
        this.startFromMonetization = bundle.getBoolean("start_from_monetization", false);
        this.onlyBoostsStat = bundle.getBoolean("only_boosts", false);
        this.chat = getMessagesController().getChatFull(j);
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        blurredBackgroundSourceColor.paint.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        if (i < 31) {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
            this.iBlur3SourceGlass = null;
            this.iBlur3FactoryLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
            return;
        }
        this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor(false);
        this.iBlur3SourceGlassFrosted = new BlurredBackgroundSourceRenderNode(null);
        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
        this.iBlur3SourceGlass = blurredBackgroundSourceRenderNode;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
        this.iBlur3FactoryLiquidGlass = blurredBackgroundDrawableViewFactory;
        blurredBackgroundDrawableViewFactory.isLiquidGlassEffectAllowed = LiteMode.isEnabled(262144);
    }

    public static void access$200(StatisticActivity statisticActivity) {
        DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
        if (Build.VERSION.SDK_INT < 31 || (downscaleScrollableNoiseSuppressor = statisticActivity.scrollableViewNoiseSuppressor) == null || statisticActivity.fragmentView == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (statisticActivity.fragmentView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f);
        int iDp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        statisticActivity.iBlur3PositionActionBar.set(0.0f, -iDp, statisticActivity.fragmentView.getMeasuredWidth(), statisticActivity.actionBar.getMeasuredHeight() + iDp);
        RectF rectF = statisticActivity.iBlur3PositionMainTabs;
        rectF.set(0.0f, iDp2, statisticActivity.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        downscaleScrollableNoiseSuppressor.setupRenderNodes(2, statisticActivity.iBlur3Positions);
        downscaleScrollableNoiseSuppressor.invalidateResultRenderNodes(statisticActivity.iBlur3Capture, statisticActivity.fragmentView.getMeasuredWidth(), statisticActivity.fragmentView.getMeasuredHeight());
    }

    public static void access$300(StatisticActivity statisticActivity) {
        View currentView = statisticActivity.viewPagerFixed.getCurrentView();
        ChannelBoostLayout channelBoostLayout = statisticActivity.boostLayout;
        if (currentView == channelBoostLayout) {
            statisticActivity.actionBar.setAdaptiveBackground(channelBoostLayout.listView);
            return;
        }
        ChannelMonetizationLayout channelMonetizationLayout = statisticActivity.monetizationLayout;
        if (currentView == channelMonetizationLayout) {
            statisticActivity.actionBar.setAdaptiveBackground(channelMonetizationLayout.listView);
        } else {
            statisticActivity.actionBar.setAdaptiveBackground(statisticActivity.recyclerListView);
        }
    }

    public static void access$5100(StatisticActivity statisticActivity) {
        ZoomCancelable zoomCancelable = statisticActivity.lastCancelable;
        if (zoomCancelable != null) {
            zoomCancelable.canceled = true;
        }
        int childCount = statisticActivity.recyclerListView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = statisticActivity.recyclerListView.getChildAt(i);
            if (childAt instanceof ChartCell) {
                ((ChartCell) childAt).chartView.legendSignatureView.showProgress(false, true);
            }
        }
    }

    public static BaseFragment create(TLRPC.Chat chat, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.id);
        return (chatFull == null || !(chatFull.can_view_stats || chatFull.can_view_stars_revenue)) ? new BoostsActivity(-chat.id) : new StatisticActivity(bundle);
    }

    public static ChartData createChartData(JSONObject jSONObject, int i, boolean z) {
        if (i == 0) {
            return new ChartData(jSONObject);
        }
        if (i == 1) {
            return new DoubleLinearChartData(jSONObject);
        }
        if (i != 2) {
            if (i == 4) {
                return new StackLinearChartData(jSONObject, z);
            }
            return null;
        }
        StackBarChartData stackBarChartData = new StackBarChartData(jSONObject);
        int length = ((ChartData.Line) stackBarChartData.lines.get(0)).y.length;
        int size = stackBarChartData.lines.size();
        stackBarChartData.ySum = new long[length];
        for (int i2 = 0; i2 < length; i2++) {
            stackBarChartData.ySum[i2] = 0;
            for (int i3 = 0; i3 < size; i3++) {
                long[] jArr = stackBarChartData.ySum;
                jArr[i2] = jArr[i2] + ((ChartData.Line) stackBarChartData.lines.get(i3)).y[i2];
            }
        }
        stackBarChartData.ySumSegmentTree = new SegmentTree(stackBarChartData.ySum);
        return stackBarChartData;
    }

    public static ChartViewData createViewData(TL_stats.StatsGraph statsGraph, String str, int i, boolean z) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        ChartViewData chartViewData = new ChartViewData(str, i);
        chartViewData.isLanguages = z;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                ChartData chartDataCreateChartData = createChartData(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i, z);
                chartViewData.chartData = chartDataCreateChartData;
                if (chartDataCreateChartData != null) {
                    chartDataCreateChartData.yRate = statsGraph.rate;
                }
                chartViewData.zoomToken = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (chartDataCreateChartData == null || (jArr2 = chartDataCreateChartData.x) == null || jArr2.length < 2) {
                    chartViewData.isEmpty = true;
                }
                if (i == 4 && chartDataCreateChartData != null && (jArr = chartDataCreateChartData.x) != null && jArr.length > 0) {
                    long j = jArr[jArr.length - 1];
                    chartViewData.childChartData = new StackLinearChartData(chartDataCreateChartData, j);
                    chartViewData.activeZoom = j;
                    return chartViewData;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            chartViewData.token = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return chartViewData;
    }

    public static void putColorFromData(ChartViewData chartViewData, ArrayList arrayList, ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate) {
        ChartData chartData;
        if (chartViewData == null || (chartData = chartViewData.chartData) == null) {
            return;
        }
        ArrayList arrayList2 = chartData.lines;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ChartData.Line line = (ChartData.Line) obj;
            int i2 = line.colorKey;
            if (i2 >= 0) {
                if (!Theme.hasThemeKey(i2)) {
                    Theme.setColor(line.colorKey, Theme.currentTheme == Theme.currentNightTheme ? line.colorDark : line.color, false);
                    Theme.defaultColors[line.colorKey] = line.color;
                }
                arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, line.colorKey));
            }
        }
    }

    public static void recolorRecyclerItem$1(View view) {
        if (view instanceof ChartCell) {
            ((ChartCell) view).recolor();
            return;
        }
        if (view instanceof ShadowSectionCell) {
            CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(null, Theme.key_windowBackgroundGray, false)), Theme.getThemedDrawableByKey(ApplicationLoader.applicationContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow), 0, 0);
            combinedDrawable.fullSize = true;
            view.setBackground(combinedDrawable);
            return;
        }
        if (view instanceof ChartHeaderView) {
            ((ChartHeaderView) view).recolor();
        } else if (view instanceof OverviewCell) {
            int i = OverviewCell.$r8$clinit;
            ((OverviewCell) view).updateColors();
        }
    }

    public final void checkUi_listPaddings() {
        int i = AndroidUtilities.navigationBarHeight;
        int i2 = AndroidUtilities.statusBarHeight;
        MainTabsLayout mainTabsLayout = this.tabsView;
        if (mainTabsLayout != null) {
            mainTabsLayout.setTranslationY(-i);
        }
        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + i2;
        int iDp = (this.showTabs ? AndroidUtilities.dp(72.0f) : 0) + i;
        AnonymousClass7 anonymousClass7 = this.recyclerListView;
        if (anonymousClass7 != null) {
            anonymousClass7.setPadding(0, currentActionBarHeight, 0, iDp);
        }
        ChannelBoostLayout channelBoostLayout = this.boostLayout;
        if (channelBoostLayout != null) {
            channelBoostLayout.listView.setPadding(0, currentActionBarHeight, 0, iDp);
        }
        ChannelMonetizationLayout channelMonetizationLayout = this.monetizationLayout;
        if (channelMonetizationLayout != null) {
            channelMonetizationLayout.listView.setPadding(0, currentActionBarHeight, 0, iDp);
        }
    }

    @Override
    public final ActionBar createActionBar(Context context) {
        ActionBar actionBarCreateActionBar = super.createActionBar(context);
        actionBarCreateActionBar.setAddToContainer(false);
        return actionBarCreateActionBar;
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout;
        StatisticActivity statisticActivity = this;
        statisticActivity.sharedUi = new BaseChartView.SharedUiComponents(null);
        MessagesController messagesController = MessagesController.getInstance(statisticActivity.currentAccount);
        long j = statisticActivity.chatId;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(statisticActivity.currentAccount).getChatFull(j);
        boolean z = chatFull != null && chatFull.can_view_stats;
        final boolean zIsBoostSupported = ChatObject.isBoostSupported(chat);
        boolean z2 = chatFull != null && (chatFull.can_view_revenue || chatFull.can_view_stars_revenue);
        ArrayList arrayList = new ArrayList(3);
        if (z) {
            arrayList.add(GlassTabView.createMainTab(context, statisticActivity.resourceProvider, GlassTabView.TabAnimation.POLL, R.string.Statistics));
        }
        arrayList.add(GlassTabView.createMainTab(context, statisticActivity.resourceProvider, GlassTabView.TabAnimation.BOOSTS, R.string.Boosts));
        if (z2) {
            arrayList.add(GlassTabView.createMainTab(context, statisticActivity.resourceProvider, GlassTabView.TabAnimation.MONETIZATION, R.string.Monetization));
        }
        statisticActivity.tabs = (GlassTabView[]) arrayList.toArray(new GlassTabView[0]);
        MainTabsLayout mainTabsLayout = new MainTabsLayout(context, statisticActivity.resourceProvider);
        statisticActivity.tabsView = mainTabsLayout;
        mainTabsLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        int i = 0;
        while (true) {
            GlassTabView[] glassTabViewArr = statisticActivity.tabs;
            if (i >= glassTabViewArr.length) {
                break;
            }
            GlassTabView glassTabView = glassTabViewArr[i];
            glassTabView.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda68(statisticActivity, i, 24));
            statisticActivity.tabsView.addView(statisticActivity.tabs[i]);
            statisticActivity.tabsView.setViewVisible(glassTabView, true, false);
            i++;
        }
        statisticActivity.viewPagerFixed = new PollItemMenu.AnonymousClass3(statisticActivity, statisticActivity.getParentActivity(), 4);
        FrameLayout frameLayout2 = new FrameLayout(context);
        if (zIsBoostSupported) {
            statisticActivity.boostLayout = new ChannelBoostLayout(statisticActivity, -j, statisticActivity.getResourceProvider());
        }
        if (z2) {
            frameLayout = frameLayout2;
            ChannelMonetizationLayout channelMonetizationLayout = new ChannelMonetizationLayout(statisticActivity.getParentActivity(), this, statisticActivity.currentAccount, -j, getResourceProvider(), ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue, chatFull.can_view_stars_revenue);
            statisticActivity = this;
            statisticActivity.monetizationLayout = channelMonetizationLayout;
            channelMonetizationLayout.setActionBar(statisticActivity.actionBar);
        } else {
            frameLayout = frameLayout2;
        }
        final boolean z3 = z;
        final boolean z4 = z2;
        final FrameLayout frameLayout3 = frameLayout;
        statisticActivity.viewPagerFixed.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public final View createView(int i2) {
                StatisticActivity statisticActivity2 = StatisticActivity.this;
                if (statisticActivity2.onlyBoostsStat) {
                    return statisticActivity2.boostLayout;
                }
                boolean z5 = z3;
                FrameLayout frameLayout4 = frameLayout3;
                if (z5) {
                    if (i2 == 0) {
                        return frameLayout4;
                    }
                    i2--;
                }
                if (zIsBoostSupported) {
                    if (i2 == 0) {
                        return statisticActivity2.boostLayout;
                    }
                    i2--;
                }
                return (z4 && i2 == 0) ? statisticActivity2.monetizationLayout : frameLayout4;
            }

            @Override
            public final int getItemCount() {
                if (StatisticActivity.this.onlyBoostsStat) {
                    return 1;
                }
                return (z3 ? 1 : 0) + (zIsBoostSupported ? 1 : 0) + (z4 ? 1 : 0);
            }

            @Override
            public final int getItemViewType(int i2) {
                return i2;
            }

            @Override
            public final void bindView(View view, int i2, int i3) {
            }
        });
        boolean z5 = statisticActivity.onlyBoostsStat;
        boolean z6 = zIsBoostSupported && !z5;
        statisticActivity.showTabs = z6;
        if (z6 && statisticActivity.startFromBoosts) {
            statisticActivity.viewPagerFixed.setPosition(z3 ? 1 : 0);
        } else if (z6 && statisticActivity.startFromMonetization) {
            statisticActivity.viewPagerFixed.setPosition((z3 ? 1 : 0) + ((z5 || !zIsBoostSupported) ? 0 : 1));
        }
        statisticActivity.selectTab(statisticActivity.viewPagerFixed.getCurrentPosition(), false);
        final LoginActivity.AnonymousClass2 anonymousClass2 = new LoginActivity.AnonymousClass2(statisticActivity, statisticActivity.getParentActivity(), 7);
        statisticActivity.actionBar.setDrawBlurBackground(anonymousClass2);
        anonymousClass2.setBackgroundColor(statisticActivity.getThemedColor(Theme.key_windowBackgroundGray));
        ViewPositionWatcher viewPositionWatcher = new ViewPositionWatcher(anonymousClass2);
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = statisticActivity.iBlur3FactoryLiquidGlass;
        blurredBackgroundDrawableViewFactory.viewPositionWatcher = viewPositionWatcher;
        blurredBackgroundDrawableViewFactory.parent = anonymousClass2;
        anonymousClass2.addView(statisticActivity.viewPagerFixed, LayoutHelper.createFrame(-1.0f, -1));
        anonymousClass2.addView(statisticActivity.actionBar);
        if (statisticActivity.showTabs) {
            anonymousClass2.addView(statisticActivity.tabsView, LayoutHelper.createFrame(344, 72, 81));
            statisticActivity.setBulletinDelegate(new LaunchActivity.AnonymousClass7(11));
        }
        statisticActivity.fragmentView = anonymousClass2;
        ?? r2 = new RecyclerListView(context) {
            public int lastH;

            @Override
            public final void onMeasure(int i2, int i3) {
                Adapter adapter;
                super.onMeasure(i2, i3);
                if (this.lastH != getMeasuredHeight() && (adapter = StatisticActivity.this.adapter) != null) {
                    adapter.mObservable.notifyChanged();
                }
                this.lastH = getMeasuredHeight();
            }
        };
        statisticActivity.recyclerListView = r2;
        r2.setSections(true);
        statisticActivity.recyclerListView.setClipToPadding(false);
        AnonymousClass7 anonymousClass7 = statisticActivity.recyclerListView;
        Objects.requireNonNull(anonymousClass7);
        statisticActivity.listBlur3Capture = new ViewGroupPartRenderer(anonymousClass7, anonymousClass2, new TopicsFragment$$ExternalSyntheticLambda7(anonymousClass7, 3));
        ChannelBoostLayout channelBoostLayout = statisticActivity.boostLayout;
        if (channelBoostLayout != null) {
            RecyclerListView recyclerListView = channelBoostLayout.listView;
            Objects.requireNonNull(recyclerListView);
            channelBoostLayout.iBlur3Capture = new ViewGroupPartRenderer(recyclerListView, anonymousClass2, new TopicsFragment$$ExternalSyntheticLambda7(recyclerListView, 3));
            final int i2 = 0;
            statisticActivity.boostLayout.listView.addOnScrollListener(new RecyclerView.OnScrollListener(statisticActivity) {
                public final StatisticActivity this$0;

                {
                    this.this$0 = statisticActivity;
                }

                @Override
                public final void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                    StatisticActivity statisticActivity2;
                    DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
                    DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor2;
                    StatisticActivity statisticActivity3;
                    DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor3;
                    switch (i2) {
                        case 0:
                            if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor = (statisticActivity2 = this.this$0).scrollableViewNoiseSuppressor) != null) {
                                downscaleScrollableNoiseSuppressor.onScrolled(i3, i4);
                                StatisticActivity.access$200(statisticActivity2);
                                break;
                            }
                            break;
                        case 1:
                            StatisticActivity statisticActivity4 = this.this$0;
                            if (statisticActivity4.recentPostsAll.size() != statisticActivity4.recentPostsLoaded.size() && !statisticActivity4.messagesIsLoading && statisticActivity4.layoutManager.findLastVisibleItemPosition() > statisticActivity4.adapter.count - 20) {
                                statisticActivity4.loadMessages();
                            }
                            if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor2 = statisticActivity4.scrollableViewNoiseSuppressor) != null) {
                                downscaleScrollableNoiseSuppressor2.onScrolled(i3, i4);
                                StatisticActivity.access$200(statisticActivity4);
                                break;
                            }
                            break;
                        default:
                            if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor3 = (statisticActivity3 = this.this$0).scrollableViewNoiseSuppressor) != null) {
                                downscaleScrollableNoiseSuppressor3.onScrolled(i3, i4);
                                StatisticActivity.access$200(statisticActivity3);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        ChannelMonetizationLayout channelMonetizationLayout2 = statisticActivity.monetizationLayout;
        if (channelMonetizationLayout2 != null) {
            UniversalRecyclerView universalRecyclerView = channelMonetizationLayout2.listView;
            Objects.requireNonNull(universalRecyclerView);
            channelMonetizationLayout2.iBlur3Capture = new ViewGroupPartRenderer(universalRecyclerView, anonymousClass2, new TopicsFragment$$ExternalSyntheticLambda7(universalRecyclerView, 1));
            final int i3 = 2;
            statisticActivity.monetizationLayout.listView.addOnScrollListener(new RecyclerView.OnScrollListener(statisticActivity) {
                public final StatisticActivity this$0;

                {
                    this.this$0 = statisticActivity;
                }

                @Override
                public final void onScrolled(RecyclerView recyclerView, int i4, int i5) {
                    StatisticActivity statisticActivity2;
                    DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
                    DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor2;
                    StatisticActivity statisticActivity3;
                    DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor3;
                    switch (i3) {
                        case 0:
                            if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor = (statisticActivity2 = this.this$0).scrollableViewNoiseSuppressor) != null) {
                                downscaleScrollableNoiseSuppressor.onScrolled(i4, i5);
                                StatisticActivity.access$200(statisticActivity2);
                                break;
                            }
                            break;
                        case 1:
                            StatisticActivity statisticActivity4 = this.this$0;
                            if (statisticActivity4.recentPostsAll.size() != statisticActivity4.recentPostsLoaded.size() && !statisticActivity4.messagesIsLoading && statisticActivity4.layoutManager.findLastVisibleItemPosition() > statisticActivity4.adapter.count - 20) {
                                statisticActivity4.loadMessages();
                            }
                            if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor2 = statisticActivity4.scrollableViewNoiseSuppressor) != null) {
                                downscaleScrollableNoiseSuppressor2.onScrolled(i4, i5);
                                StatisticActivity.access$200(statisticActivity4);
                                break;
                            }
                            break;
                        default:
                            if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor3 = (statisticActivity3 = this.this$0).scrollableViewNoiseSuppressor) != null) {
                                downscaleScrollableNoiseSuppressor3.onScrolled(i4, i5);
                                StatisticActivity.access$200(statisticActivity3);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        statisticActivity.iBlur3Capture = new IBlur3Capture() {
            public final RectF fragmentPosition = new RectF();

            @Override
            public final void capture(Canvas canvas, RectF rectF) {
                ViewGroupPartRenderer viewGroupPartRenderer;
                View view;
                ViewGroupPartRenderer viewGroupPartRenderer2;
                View view2;
                ChannelBoostLayout channelBoostLayout2;
                AnonymousClass7 anonymousClass8;
                StatisticActivity statisticActivity2 = StatisticActivity.this;
                statisticActivity2.fragmentView.getMeasuredWidth();
                statisticActivity2.fragmentView.getMeasuredHeight();
                canvas.drawColor(statisticActivity2.getThemedColor(Theme.key_windowBackgroundWhite));
                for (int i4 = 0; i4 < 3; i4++) {
                    if (i4 == 0) {
                        viewGroupPartRenderer = statisticActivity2.listBlur3Capture;
                        anonymousClass8 = statisticActivity2.recyclerListView;
                    } else {
                        if (i4 != 1 || (channelBoostLayout2 = statisticActivity2.boostLayout) == null) {
                            ChannelMonetizationLayout channelMonetizationLayout3 = statisticActivity2.monetizationLayout;
                            if (channelMonetizationLayout3 != null) {
                                viewGroupPartRenderer2 = channelMonetizationLayout3.iBlur3Capture;
                                view2 = channelMonetizationLayout3;
                            } else {
                                viewGroupPartRenderer = null;
                                view = null;
                            }
                        } else {
                            viewGroupPartRenderer2 = channelBoostLayout2.iBlur3Capture;
                            view2 = channelBoostLayout2;
                        }
                        ViewGroupPartRenderer viewGroupPartRenderer3 = viewGroupPartRenderer2;
                        view = view2;
                        viewGroupPartRenderer = viewGroupPartRenderer3;
                    }
                    if (viewGroupPartRenderer == null) {
                        view = anonymousClass8;
                    } else if (view != null) {
                        LoginActivity.AnonymousClass2 anonymousClass3 = anonymousClass2;
                        RectF rectF2 = this.fragmentPosition;
                        ViewPositionWatcher.computeRectInParent(view, anonymousClass3, rectF2);
                        if (rectF2.right > 0.0f) {
                            statisticActivity2.fragmentView.getMeasuredWidth();
                        }
                        canvas.save();
                        viewGroupPartRenderer.capture(canvas, rectF);
                        canvas.restore();
                    }
                }
            }

            @Override
            public final void captureCalculateHash(Blur3HashImpl blur3HashImpl, RectF rectF) {
                blur3HashImpl.unsupported = true;
            }
        };
        statisticActivity.recyclerListView.setSections();
        LinearLayout linearLayout = new LinearLayout(context);
        statisticActivity.progressLayout = linearLayout;
        linearLayout.setOrientation(1);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        statisticActivity.imageView = rLottieImageView;
        rLottieImageView.setAutoRepeat(true);
        statisticActivity.imageView.setAnimation(R.raw.statistic_preload, 120, 120, null);
        statisticActivity.imageView.playAnimation();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i4 = Theme.key_player_actionBarTitle;
        textView.setTextColor(Theme.getColor(null, i4, false));
        textView.setTag(Integer.valueOf(i4));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i5 = Theme.key_player_actionBarSubtitle;
        textView2.setTextColor(Theme.getColor(null, i5, false));
        textView2.setTag(Integer.valueOf(i5));
        zzkg.m(R.string.LoadingStatsDescription, textView2, 1);
        statisticActivity.progressLayout.addView(statisticActivity.imageView, LayoutHelper.createLinear(120, 120, 1, 0, 0, 0, 20));
        statisticActivity.progressLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 10));
        statisticActivity.progressLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 1));
        frameLayout3.addView(statisticActivity.progressLayout, LayoutHelper.createFrame(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (statisticActivity.adapter == null) {
            statisticActivity.adapter = statisticActivity.new Adapter();
        }
        statisticActivity.recyclerListView.setAdapter(statisticActivity.adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        statisticActivity.layoutManager = linearLayoutManager;
        statisticActivity.recyclerListView.setLayoutManager(linearLayoutManager);
        statisticActivity.animator = new AnonymousClass11();
        statisticActivity.recyclerListView.setItemAnimator(null);
        final int i6 = 1;
        statisticActivity.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener(statisticActivity) {
            public final StatisticActivity this$0;

            {
                this.this$0 = statisticActivity;
            }

            @Override
            public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
                StatisticActivity statisticActivity2;
                DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
                DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor2;
                StatisticActivity statisticActivity3;
                DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor3;
                switch (i6) {
                    case 0:
                        if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor = (statisticActivity2 = this.this$0).scrollableViewNoiseSuppressor) != null) {
                            downscaleScrollableNoiseSuppressor.onScrolled(i7, i8);
                            StatisticActivity.access$200(statisticActivity2);
                            break;
                        }
                        break;
                    case 1:
                        StatisticActivity statisticActivity4 = this.this$0;
                        if (statisticActivity4.recentPostsAll.size() != statisticActivity4.recentPostsLoaded.size() && !statisticActivity4.messagesIsLoading && statisticActivity4.layoutManager.findLastVisibleItemPosition() > statisticActivity4.adapter.count - 20) {
                            statisticActivity4.loadMessages();
                        }
                        if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor2 = statisticActivity4.scrollableViewNoiseSuppressor) != null) {
                            downscaleScrollableNoiseSuppressor2.onScrolled(i7, i8);
                            StatisticActivity.access$200(statisticActivity4);
                            break;
                        }
                        break;
                    default:
                        if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor3 = (statisticActivity3 = this.this$0).scrollableViewNoiseSuppressor) != null) {
                            downscaleScrollableNoiseSuppressor3.onScrolled(i7, i8);
                            StatisticActivity.access$200(statisticActivity3);
                            break;
                        }
                        break;
                }
            }
        });
        statisticActivity.recyclerListView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(statisticActivity, 12));
        statisticActivity.recyclerListView.setOnItemLongClickListener(new StoriesViewPager$$ExternalSyntheticLambda0(statisticActivity, 14));
        frameLayout3.addView(statisticActivity.recyclerListView);
        ChatAvatarContainer chatAvatarContainer = new ChatAvatarContainer(context, null, false, null);
        statisticActivity.avatarContainer = chatAvatarContainer;
        chatAvatarContainer.setOccupyStatusBar(!AndroidUtilities.isTablet());
        statisticActivity.avatarContainer.getAvatarImageView().setScaleX(0.9f);
        statisticActivity.avatarContainer.getAvatarImageView().setScaleY(0.9f);
        statisticActivity.avatarContainer.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        statisticActivity.actionBar.addView(statisticActivity.avatarContainer, 0, LayoutHelper.createFrame(-2, -1.0f, 51, !statisticActivity.inPreviewMode ? 50.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        TLRPC.Chat chat2 = statisticActivity.getMessagesController().getChat(Long.valueOf(j));
        statisticActivity.avatarContainer.setChatAvatar(chat2);
        statisticActivity.avatarContainer.setTitle(chat2 == null ? "" : chat2.title);
        ChatAvatarContainer chatAvatarContainer2 = statisticActivity.avatarContainer;
        if (chatAvatarContainer2.getSubtitleTextView() != null) {
            chatAvatarContainer2.getSubtitleTextView().setVisibility(8);
        }
        zzkt.m(statisticActivity.actionBar);
        statisticActivity.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(statisticActivity, 26));
        ChatAvatarContainer chatAvatarContainer3 = statisticActivity.avatarContainer;
        int color = Theme.getColor(null, i4, false);
        int color2 = Theme.getColor(null, i5, false);
        chatAvatarContainer3.titleTextView.setTextColor(color);
        ChatAvatarContainer.SimpleTextConnectedView simpleTextConnectedView = chatAvatarContainer3.subtitleTextView;
        simpleTextConnectedView.setTextColor(color2);
        simpleTextConnectedView.setTag(Integer.valueOf(color2));
        statisticActivity.actionBar.setItemsColor(Theme.getColor(null, i4, false), false);
        statisticActivity.actionBar.setItemsColor(Theme.getColor(null, i4, false), true);
        statisticActivity.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_actionBarActionModeDefaultSelector, false), false);
        statisticActivity.actionBar.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        boolean z7 = statisticActivity.initialLoading;
        LaunchActivity.AnonymousClass18 anonymousClass18 = statisticActivity.showProgressbar;
        if (z7) {
            statisticActivity.progressLayout.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(anonymousClass18, 500L);
            statisticActivity.progressLayout.setVisibility(0);
            statisticActivity.recyclerListView.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
            statisticActivity.progressLayout.setVisibility(8);
            statisticActivity.recyclerListView.setVisibility(0);
        }
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(statisticActivity.tabsView, BlurredBackgroundProviderImpl.mainTabs(statisticActivity.resourceProvider), false);
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(28.0f));
        blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(7.666f));
        statisticActivity.tabsView.setBackground(blurredBackgroundDrawableCreate);
        statisticActivity.checkUi_listPaddings();
        statisticActivity.diffUtilsCallback = new DiffUtilsCallback(statisticActivity.adapter, statisticActivity.layoutManager);
        return statisticActivity.fragmentView;
    }

    public final void dataLoaded(ChartViewData[] chartViewDataArr) {
        Adapter adapter = this.adapter;
        if (adapter != null) {
            adapter.update();
            setItemAnimator(null);
            this.adapter.mObservable.notifyChanged();
        }
        this.initialLoading = false;
        LinearLayout linearLayout = this.progressLayout;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.showProgressbar);
        this.progressLayout.animate().alpha(0.0f).setDuration(230L).setListener(new PhotoViewer.AnonymousClass78.AnonymousClass1(this, 16));
        setVisibility(0);
        setAlpha(0.0f);
        animate().alpha(1.0f).setDuration(230L).start();
        for (ChartViewData chartViewData : chartViewDataArr) {
            if (chartViewData != null && chartViewData.chartData == null && chartViewData.token != null) {
                chartViewData.load(this.currentAccount, this.classGuid, this.chat.stats_dc, new StatisticActivity$$ExternalSyntheticLambda13(0, this, chartViewData));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList arrayList;
        int i3 = 0;
        if (i == NotificationCenter.storiesListUpdated) {
            if (((StoriesController.StoriesList) objArr[0]) == this.storiesList) {
                ArrayList arrayList2 = this.recentStoriesLoaded;
                arrayList2.clear();
                ArrayList arrayList3 = this.recentStoriesAll;
                int size = arrayList3.size();
                while (i3 < size) {
                    Object obj = arrayList3.get(i3);
                    i3++;
                    RecentPostInfo recentPostInfo = (RecentPostInfo) obj;
                    MessageObject messageObjectFindMessageObject = this.storiesList.findMessageObject(recentPostInfo.getId());
                    if (messageObjectFindMessageObject != null) {
                        recentPostInfo.message = messageObjectFindMessageObject;
                        arrayList2.add(recentPostInfo);
                    }
                }
                this.recentStoriesIdtoIndexMap.clear();
                arrayList3.clear();
                sortAllLoadedData();
                if (this.adapter != null) {
                    setItemAnimator(null);
                    this.diffUtilsCallback.update();
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.boostByChannelCreated) {
            if (getParentLayout() == null) {
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            List<BaseFragment> fragmentStack = ((ActionBarLayout) getParentLayout()).getFragmentStack();
            BaseFragment baseFragment = fragmentStack.size() >= 2 ? (BaseFragment) RendererCapabilities.CC.m(2, fragmentStack) : null;
            if (baseFragment instanceof ChatEditActivity) {
                INavigationLayout parentLayout = getParentLayout();
                parentLayout.getClass();
                ((ActionBarLayout) parentLayout).removeFragmentFromStack(baseFragment, false);
            }
            List<BaseFragment> fragmentStack2 = ((ActionBarLayout) getParentLayout()).getFragmentStack();
            BaseFragment baseFragment2 = fragmentStack2.size() >= 2 ? (BaseFragment) RendererCapabilities.CC.m(2, fragmentStack2) : null;
            if (!zBooleanValue) {
                finishFragment();
                if (baseFragment2 instanceof ProfileActivity) {
                    BoostDialogs.showBulletin(baseFragment2, chat, false);
                    return;
                }
                return;
            }
            BaseFragment baseFragment3 = fragmentStack2.size() >= 3 ? (BaseFragment) RendererCapabilities.CC.m(3, fragmentStack2) : null;
            if (baseFragment2 instanceof ProfileActivity) {
                INavigationLayout parentLayout2 = getParentLayout();
                parentLayout2.getClass();
                ((ActionBarLayout) parentLayout2).removeFragmentFromStack(baseFragment2, false);
            }
            finishFragment();
            if (baseFragment3 instanceof ChatActivity) {
                BoostDialogs.showBulletin(baseFragment3, chat, true);
                return;
            }
            return;
        }
        if (i != NotificationCenter.messagesDidLoad) {
            if (i == NotificationCenter.chatInfoDidLoad) {
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
                if (chatFull.id == this.chatId && this.chat == null) {
                    this.chat = chatFull;
                    loadStatistic$1();
                    return;
                }
                return;
            }
            return;
        }
        if (((Integer) objArr[10]).intValue() == this.classGuid) {
            ArrayList arrayList4 = (ArrayList) objArr[2];
            ArrayList arrayList5 = new ArrayList();
            int size2 = arrayList4.size();
            int i4 = 0;
            while (true) {
                arrayList = this.recentPostsAll;
                if (i4 >= size2) {
                    break;
                }
                MessageObject messageObject = (MessageObject) arrayList4.get(i4);
                int i5 = this.recentPostIdtoIndexMap.get(messageObject.getId(), -1);
                if (i5 >= 0 && ((RecentPostInfo) arrayList.get(i5)).getId() == messageObject.getId()) {
                    if (messageObject.deleted) {
                        arrayList5.add((RecentPostInfo) arrayList.get(i5));
                    } else {
                        ((RecentPostInfo) arrayList.get(i5)).message = messageObject;
                    }
                }
                i4++;
            }
            arrayList.removeAll(arrayList5);
            ArrayList arrayList6 = this.recentPostsLoaded;
            arrayList6.clear();
            int size3 = arrayList.size();
            while (i3 < size3) {
                RecentPostInfo recentPostInfo2 = (RecentPostInfo) arrayList.get(i3);
                if (recentPostInfo2.message == null) {
                    this.loadFromId = recentPostInfo2.getId();
                    break;
                } else {
                    arrayList6.add(recentPostInfo2);
                    i3++;
                }
            }
            if (arrayList6.size() < 20) {
                loadMessages();
            }
            sortAllLoadedData();
            if (this.adapter != null) {
                setItemAnimator(null);
                this.diffUtilsCallback.update();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ChartViewData chartViewData;
        ChartViewData chartViewData2;
        QrActivity$$ExternalSyntheticLambda9 qrActivity$$ExternalSyntheticLambda9 = new QrActivity$$ExternalSyntheticLambda9(17, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i = Theme.key_windowBackgroundGray;
        arrayList.add(new ThemeDescription(view, 1, null, null, null, null, i));
        int i2 = Theme.key_dialogTextBlack;
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{StatisticPostInfoCell.class}, new String[]{"message"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{StatisticPostInfoCell.class}, new String[]{"views"}, null, null, -1, null, i2));
        int i3 = Theme.key_windowBackgroundWhiteGrayText3;
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{StatisticPostInfoCell.class}, new String[]{"shares"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{StatisticPostInfoCell.class}, new String[]{"likes"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{StatisticPostInfoCell.class}, new String[]{"date"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.recyclerListView, 0, new Class[]{ChartHeaderView.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, -1, qrActivity$$ExternalSyntheticLambda9, i2));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_statisticChartSignature));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_statisticChartSignatureAlpha));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_statisticChartHintLine));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_statisticChartActiveLine));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_statisticChartInactivePickerChart));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_statisticChartActivePickerChart));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_dialogBackground));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_actionBarActionModeDefaultSelector));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, i));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_windowBackgroundWhiteGreenText2));
        int i4 = Theme.key_text_RedRegular;
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, i4));
        ChatAvatarContainer chatAvatarContainer = this.avatarContainer;
        arrayList.add(new ThemeDescription(chatAvatarContainer != null ? chatAvatarContainer.getTitleTextView() : null, 4, null, null, null, null, Theme.key_player_actionBarTitle));
        ChatAvatarContainer chatAvatarContainer2 = this.avatarContainer;
        arrayList.add(new ThemeDescription(chatAvatarContainer2 != null ? chatAvatarContainer2.getSubtitleTextView() : null, 262148, (Class[]) null, (Paint[]) null, Theme.key_player_actionBarSubtitle));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_statisticChartLineEmpty));
        arrayList.add(new ThemeDescription(this.recyclerListView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.recyclerListView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayIcon));
        arrayList.add(new ThemeDescription(this.recyclerListView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueButton));
        arrayList.add(new ThemeDescription(this.recyclerListView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueIcon));
        arrayList.add(new ThemeDescription(this.recyclerListView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.recyclerListView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, null, null, -1, null, i4));
        if (this.isMegagroup) {
            int i5 = 0;
            while (i5 < 6) {
                if (i5 == 0) {
                    chartViewData2 = this.growthData;
                } else if (i5 == 1) {
                    chartViewData2 = this.groupMembersData;
                } else if (i5 == 2) {
                    chartViewData2 = this.newMembersBySourceData;
                } else if (i5 == 3) {
                    chartViewData2 = this.membersLanguageData;
                } else {
                    chartViewData2 = i5 == 4 ? this.messagesData : this.actionsData;
                }
                putColorFromData(chartViewData2, arrayList, qrActivity$$ExternalSyntheticLambda9);
                i5++;
            }
        } else {
            int i6 = 0;
            while (i6 < 12) {
                if (i6 == 0) {
                    chartViewData = this.growthData;
                } else if (i6 == 1) {
                    chartViewData = this.followersData;
                } else if (i6 == 2) {
                    chartViewData = this.interactionsData;
                } else if (i6 == 3) {
                    chartViewData = this.ivInteractionsData;
                } else if (i6 == 4) {
                    chartViewData = this.viewsBySourceData;
                } else if (i6 == 5) {
                    chartViewData = this.newFollowersBySourceData;
                } else if (i6 == 6) {
                    chartViewData = this.notificationsData;
                } else if (i6 == 7) {
                    chartViewData = this.topHoursData;
                } else if (i6 == 8) {
                    chartViewData = this.languagesData;
                } else if (i6 == 9) {
                    chartViewData = this.reactionsByEmotionData;
                } else {
                    chartViewData = i6 == 10 ? this.storyInteractionsData : this.storyReactionsByEmotionData;
                }
                putColorFromData(chartViewData, arrayList, qrActivity$$ExternalSyntheticLambda9);
                i6++;
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(null, Theme.key_windowBackgroundWhite, false)) > 0.699999988079071d;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        PollItemMenu.AnonymousClass3 anonymousClass3 = this.viewPagerFixed;
        if (anonymousClass3 == null || (anonymousClass3.currentPosition == 0 && anonymousClass3.currentProgress == 1.0f)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void lambda$loadMessages$11(TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i = 0; i < arrayList2.size(); i++) {
                arrayList.add(new MessageObject(this.currentAccount, arrayList2.get(i), false, true));
            }
            getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new StatisticActivity$$ExternalSyntheticLambda7(this, arrayList, 1));
    }

    public final void lambda$loadStatistic$3(TLObject tLObject) {
        ?? r15;
        char c;
        char c2;
        char c3;
        long j;
        TLRPC.User user;
        TLRPC.User user2;
        ArrayList arrayList;
        ArrayList arrayList2;
        TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster;
        TLRPC.User user3;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            c = 3;
            c2 = 7;
            c3 = 6;
            j = 1000;
            final ChartViewData[] chartViewDataArr = {createViewData(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), createViewData(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), createViewData(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), createViewData(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), createViewData(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), createViewData(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), createViewData(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), createViewData(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), createViewData(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), createViewData(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), createViewData(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), createViewData(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            ChartViewData chartViewData = chartViewDataArr[2];
            if (chartViewData != null) {
                chartViewData.useHourFormat = true;
            }
            this.overviewChannelData = new OverviewChannelData(tL_broadcastStats);
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            this.maxDateOverview = ((long) tL_statsDateRangeDays.max_date) * 1000;
            this.minDateOverview = ((long) tL_statsDateRangeDays.min_date) * 1000;
            ArrayList arrayList3 = this.recentPostsAll;
            arrayList3.clear();
            ArrayList arrayList4 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList5 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList5.size();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList5.get(i);
                i++;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                RecentPostInfo recentPostInfo = new RecentPostInfo();
                recentPostInfo.counters = postInteractionCounters2;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList3.add(recentPostInfo);
                    this.recentPostIdtoIndexMap.put(recentPostInfo.getId(), i2);
                    i2++;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList4.add(Integer.valueOf(recentPostInfo.getId()));
                    this.recentStoriesAll.add(recentPostInfo);
                    this.recentStoriesIdtoIndexMap.put(recentPostInfo.getId(), i3);
                    i3++;
                }
            }
            AndroidUtilities.runOnUIThread(new StatisticActivity$$ExternalSyntheticLambda7(this, arrayList4, 0));
            if (arrayList3.size() > 0) {
                getMessagesStorage().getMessages(-this.chatId, 0L, false, arrayList3.size(), ((RecentPostInfo) arrayList3.get(0)).getId(), 0, 0, this.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            r15 = 0;
            final Object[] objArr = 0 == true ? 1 : 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final StatisticActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (objArr) {
                        case 0:
                            StatisticActivity statisticActivity = this.f$0;
                            statisticActivity.getClass();
                            StatisticActivity.ChartViewData[] chartViewDataArr2 = chartViewDataArr;
                            statisticActivity.ivInteractionsData = chartViewDataArr2[0];
                            statisticActivity.followersData = chartViewDataArr2[1];
                            statisticActivity.topHoursData = chartViewDataArr2[2];
                            statisticActivity.interactionsData = chartViewDataArr2[3];
                            statisticActivity.growthData = chartViewDataArr2[4];
                            statisticActivity.viewsBySourceData = chartViewDataArr2[5];
                            statisticActivity.newFollowersBySourceData = chartViewDataArr2[6];
                            statisticActivity.languagesData = chartViewDataArr2[7];
                            statisticActivity.notificationsData = chartViewDataArr2[8];
                            statisticActivity.reactionsByEmotionData = chartViewDataArr2[9];
                            statisticActivity.storyInteractionsData = chartViewDataArr2[10];
                            statisticActivity.storyReactionsByEmotionData = chartViewDataArr2[11];
                            statisticActivity.dataLoaded(chartViewDataArr2);
                            break;
                        default:
                            StatisticActivity statisticActivity2 = this.f$0;
                            statisticActivity2.getClass();
                            StatisticActivity.ChartViewData[] chartViewDataArr3 = chartViewDataArr;
                            statisticActivity2.growthData = chartViewDataArr3[0];
                            statisticActivity2.groupMembersData = chartViewDataArr3[1];
                            statisticActivity2.newMembersBySourceData = chartViewDataArr3[2];
                            statisticActivity2.membersLanguageData = chartViewDataArr3[3];
                            statisticActivity2.messagesData = chartViewDataArr3[4];
                            statisticActivity2.actionsData = chartViewDataArr3[5];
                            statisticActivity2.topHoursData = chartViewDataArr3[6];
                            statisticActivity2.topDayOfWeeksData = chartViewDataArr3[7];
                            statisticActivity2.dataLoaded(chartViewDataArr3);
                            break;
                    }
                }
            });
        } else {
            r15 = 0;
            c = 3;
            c2 = 7;
            c3 = 6;
            j = 1000;
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            ChartViewData chartViewDataCreateViewData = createViewData(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), r15, r15);
            ChartViewData chartViewDataCreateViewData2 = createViewData(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), r15, r15);
            ChartViewData chartViewDataCreateViewData3 = createViewData(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, r15);
            ChartViewData chartViewDataCreateViewData4 = createViewData(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true);
            ChartViewData chartViewDataCreateViewData5 = createViewData(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, r15);
            ChartViewData chartViewDataCreateViewData6 = createViewData(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, r15);
            ChartViewData chartViewDataCreateViewData7 = createViewData(tL_megagroupStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), r15, r15);
            ChartViewData chartViewDataCreateViewData8 = createViewData(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, r15);
            final ChartViewData[] chartViewDataArr2 = new ChartViewData[8];
            chartViewDataArr2[r15] = chartViewDataCreateViewData;
            chartViewDataArr2[1] = chartViewDataCreateViewData2;
            chartViewDataArr2[2] = chartViewDataCreateViewData3;
            chartViewDataArr2[c] = chartViewDataCreateViewData4;
            chartViewDataArr2[4] = chartViewDataCreateViewData5;
            chartViewDataArr2[5] = chartViewDataCreateViewData6;
            chartViewDataArr2[c3] = chartViewDataCreateViewData7;
            chartViewDataArr2[c2] = chartViewDataCreateViewData8;
            ChartViewData chartViewData2 = chartViewDataArr2[c3];
            if (chartViewData2 != null) {
                chartViewData2.useHourFormat = true;
            }
            ChartViewData chartViewData3 = chartViewDataArr2[c2];
            if (chartViewData3 != null) {
                chartViewData3.useWeekFormat = true;
            }
            this.overviewChatData = new OverviewChatData(tL_megagroupStats);
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            this.maxDateOverview = ((long) tL_statsDateRangeDays2.max_date) * j;
            this.minDateOverview = ((long) tL_statsDateRangeDays2.min_date) * j;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList6 = tL_megagroupStats.top_posters;
            if (arrayList6 != null && !arrayList6.isEmpty()) {
                int i4 = 0;
                while (true) {
                    int size2 = tL_megagroupStats.top_posters.size();
                    arrayList = this.topMembersAll;
                    arrayList2 = this.topMembersVisible;
                    if (i4 >= size2) {
                        break;
                    }
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster2 = tL_megagroupStats.top_posters.get(i4);
                    ArrayList<TLRPC.User> arrayList7 = tL_megagroupStats.users;
                    MemberData memberData = new MemberData();
                    long j2 = tL_statsGroupTopPoster2.user_id;
                    int size3 = arrayList7.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size3) {
                            tL_statsGroupTopPoster = tL_statsGroupTopPoster2;
                            user3 = null;
                            break;
                        }
                        TLRPC.User user4 = arrayList7.get(i5);
                        i5++;
                        user3 = user4;
                        tL_statsGroupTopPoster = tL_statsGroupTopPoster2;
                        if (user3.id == j2) {
                            break;
                        } else {
                            tL_statsGroupTopPoster2 = tL_statsGroupTopPoster;
                        }
                    }
                    memberData.user = user3;
                    StringBuilder sb = new StringBuilder();
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster3 = tL_statsGroupTopPoster;
                    int i6 = tL_statsGroupTopPoster3.messages;
                    if (i6 > 0) {
                        sb.append(LocaleController.formatPluralString("messages", i6, new Object[0]));
                    }
                    if (tL_statsGroupTopPoster3.avg_chars > 0) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append(LocaleController.formatString("CharactersPerMessage", R.string.CharactersPerMessage, LocaleController.formatPluralString("Characters", tL_statsGroupTopPoster3.avg_chars, new Object[0])));
                    }
                    memberData.description = sb.toString();
                    if (arrayList2.size() < 10) {
                        arrayList2.add(memberData);
                    }
                    arrayList.add(memberData);
                    i4++;
                }
                if (arrayList.size() - arrayList2.size() < 2) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopAdmin> arrayList8 = tL_megagroupStats.top_admins;
            if (arrayList8 != null && !arrayList8.isEmpty()) {
                for (int i7 = 0; i7 < tL_megagroupStats.top_admins.size(); i7++) {
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i7);
                    ArrayList<TLRPC.User> arrayList9 = tL_megagroupStats.users;
                    MemberData memberData2 = new MemberData();
                    long j3 = tL_statsGroupTopAdmin.user_id;
                    int size4 = arrayList9.size();
                    int i8 = 0;
                    do {
                        if (i8 >= size4) {
                            user2 = null;
                            break;
                        } else {
                            TLRPC.User user5 = arrayList9.get(i8);
                            i8++;
                            user2 = user5;
                        }
                    } while (user2.id != j3);
                    memberData2.user = user2;
                    StringBuilder sb2 = new StringBuilder();
                    int i9 = tL_statsGroupTopAdmin.deleted;
                    if (i9 > 0) {
                        sb2.append(LocaleController.formatPluralString("Deletions", i9, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(LocaleController.formatPluralString("Bans", tL_statsGroupTopAdmin.banned, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(LocaleController.formatPluralString("Restrictions", tL_statsGroupTopAdmin.kicked, new Object[0]));
                    }
                    memberData2.description = sb2.toString();
                    this.topAdmins.add(memberData2);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList10 = tL_megagroupStats.top_inviters;
            if (arrayList10 != null && !arrayList10.isEmpty()) {
                for (int i10 = 0; i10 < tL_megagroupStats.top_inviters.size(); i10++) {
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i10);
                    ArrayList<TLRPC.User> arrayList11 = tL_megagroupStats.users;
                    MemberData memberData3 = new MemberData();
                    long j4 = tL_statsGroupTopInviter.user_id;
                    int size5 = arrayList11.size();
                    int i11 = 0;
                    do {
                        if (i11 >= size5) {
                            user = null;
                            break;
                        } else {
                            TLRPC.User user6 = arrayList11.get(i11);
                            i11++;
                            user = user6;
                        }
                    } while (user.id != j4);
                    memberData3.user = user;
                    int i12 = tL_statsGroupTopInviter.invitations;
                    if (i12 > 0) {
                        memberData3.description = LocaleController.formatPluralString("Invitations", i12, new Object[0]);
                    } else {
                        memberData3.description = "";
                    }
                    this.topInviters.add(memberData3);
                }
            }
            final int i13 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final StatisticActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i13) {
                        case 0:
                            StatisticActivity statisticActivity = this.f$0;
                            statisticActivity.getClass();
                            StatisticActivity.ChartViewData[] chartViewDataArr3 = chartViewDataArr2;
                            statisticActivity.ivInteractionsData = chartViewDataArr3[0];
                            statisticActivity.followersData = chartViewDataArr3[1];
                            statisticActivity.topHoursData = chartViewDataArr3[2];
                            statisticActivity.interactionsData = chartViewDataArr3[3];
                            statisticActivity.growthData = chartViewDataArr3[4];
                            statisticActivity.viewsBySourceData = chartViewDataArr3[5];
                            statisticActivity.newFollowersBySourceData = chartViewDataArr3[6];
                            statisticActivity.languagesData = chartViewDataArr3[7];
                            statisticActivity.notificationsData = chartViewDataArr3[8];
                            statisticActivity.reactionsByEmotionData = chartViewDataArr3[9];
                            statisticActivity.storyInteractionsData = chartViewDataArr3[10];
                            statisticActivity.storyReactionsByEmotionData = chartViewDataArr3[11];
                            statisticActivity.dataLoaded(chartViewDataArr3);
                            break;
                        default:
                            StatisticActivity statisticActivity2 = this.f$0;
                            statisticActivity2.getClass();
                            StatisticActivity.ChartViewData[] chartViewDataArr4 = chartViewDataArr2;
                            statisticActivity2.growthData = chartViewDataArr4[0];
                            statisticActivity2.groupMembersData = chartViewDataArr4[1];
                            statisticActivity2.newMembersBySourceData = chartViewDataArr4[2];
                            statisticActivity2.membersLanguageData = chartViewDataArr4[3];
                            statisticActivity2.messagesData = chartViewDataArr4[4];
                            statisticActivity2.actionsData = chartViewDataArr4[5];
                            statisticActivity2.topHoursData = chartViewDataArr4[6];
                            statisticActivity2.topDayOfWeeksData = chartViewDataArr4[7];
                            statisticActivity2.dataLoaded(chartViewDataArr4);
                            break;
                    }
                }
            });
        }
    }

    public final void loadMessages() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.id = new ArrayList<>();
        ArrayList arrayList = this.recentPostsAll;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = this.recentPostIdtoIndexMap.get(this.loadFromId); i2 < size; i2++) {
            if (((RecentPostInfo) arrayList.get(i2)).message == null) {
                tL_channels_getMessages.id.add(Integer.valueOf(((RecentPostInfo) arrayList.get(i2)).getId()));
                i++;
                if (i > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.chatId);
        this.messagesIsLoading = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new StatisticActivity$$ExternalSyntheticLambda5(this, 1));
    }

    public final void loadStatistic$1() {
        TLObject tLObject;
        if (this.onlyBoostsStat) {
            return;
        }
        boolean z = this.isMegagroup;
        long j = this.chatId;
        if (z) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j);
            tLObject = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j);
            tLObject = tL_getBroadcastStats;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLObject, new StatisticActivity$$ExternalSyntheticLambda5(this, 0), null, null, 0, this.chat.stats_dc, 1, true), this.classGuid);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesListUpdated);
        StoriesController storiesController = getMessagesController().getStoriesController();
        long j = this.chatId;
        StoriesController.StoriesList storiesList = storiesController.getStoriesList(-j, 2, -1, true);
        this.storiesList = storiesList;
        if (storiesList != null) {
            int i = storiesList.maxLinkId;
            storiesList.maxLinkId = i + 1;
            storiesList.links.add(Integer.valueOf(i));
            StickersActivity$$ExternalSyntheticLambda18 stickersActivity$$ExternalSyntheticLambda18 = storiesList.destroyRunnable;
            if (stickersActivity$$ExternalSyntheticLambda18 != null) {
                AndroidUtilities.cancelRunOnUIThread(stickersActivity$$ExternalSyntheticLambda18);
            }
            this.storiesListId = i;
        }
        if (this.chat != null) {
            loadStatistic$1();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(j, this.classGuid, true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        StickersActivity$$ExternalSyntheticLambda18 stickersActivity$$ExternalSyntheticLambda18;
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesListUpdated);
        AlertDialog[] alertDialogArr = this.progressDialog;
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog != null) {
            alertDialog.dismiss();
            alertDialogArr[0] = null;
        }
        StoriesController.StoriesList storiesList = this.storiesList;
        if (storiesList != null) {
            int i = this.storiesListId;
            ArrayList arrayList = storiesList.links;
            arrayList.remove(Integer.valueOf(i));
            if (arrayList.isEmpty() && (stickersActivity$$ExternalSyntheticLambda18 = storiesList.destroyRunnable) != null) {
                AndroidUtilities.cancelRunOnUIThread(stickersActivity$$ExternalSyntheticLambda18);
                AndroidUtilities.runOnUIThread(stickersActivity$$ExternalSyntheticLambda18, 300000L);
            }
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        checkUi_listPaddings();
    }

    public final void selectTab(int i, boolean z) {
        int i2 = 0;
        while (true) {
            GlassTabView[] glassTabViewArr = this.tabs;
            if (i2 >= glassTabViewArr.length) {
                return;
            }
            glassTabViewArr[i2].setSelected(i2 == i, z);
            i2++;
        }
    }

    public final void sortAllLoadedData() {
        ArrayList arrayList = this.recentAllSortedDataLoaded;
        arrayList.clear();
        arrayList.addAll(this.recentPostsLoaded);
        arrayList.addAll(this.recentStoriesLoaded);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new StatisticActivity$$ExternalSyntheticLambda4(0))));
    }

    public final class OverviewCell extends LinearLayout {
        public static final int $r8$clinit = 0;
        public final TextView[] primary;
        public final TextView[] secondary;
        public final TextView[] title;

        public OverviewCell(Context context, int i) {
            super(context);
            int i2 = i * 2;
            this.primary = new TextView[i2];
            this.secondary = new TextView[i2];
            this.title = new TextView[i2];
            setOrientation(1);
            setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            for (int i3 = 0; i3 < i; i3++) {
                LinearLayout linearLayoutM = zzkf.m(context, 0);
                for (int i4 = 0; i4 < 2; i4++) {
                    LinearLayout linearLayoutM2 = zzkf.m(context, 1);
                    LinearLayout linearLayoutM3 = zzkf.m(context, 0);
                    int i5 = (i3 * 2) + i4;
                    this.primary[i5] = new TextView(context);
                    this.secondary[i5] = new TextView(context);
                    this.title[i5] = new TextView(context);
                    this.primary[i5].setTypeface(AndroidUtilities.bold());
                    this.primary[i5].setTextSize(1, 17.0f);
                    this.title[i5].setTextSize(1, 13.0f);
                    this.title[i5].setGravity(3);
                    this.secondary[i5].setTextSize(1, 13.0f);
                    this.secondary[i5].setPadding(AndroidUtilities.dp(4.0f), 0, 0, 0);
                    linearLayoutM3.addView(this.primary[i5]);
                    linearLayoutM3.addView(this.secondary[i5]);
                    linearLayoutM2.addView(linearLayoutM3);
                    linearLayoutM2.addView(this.title[i5]);
                    linearLayoutM.addView(linearLayoutM2, LayoutHelper.createLinear(1.0f, -1, -2));
                }
                addView(linearLayoutM, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
            }
        }

        public void setData(OverviewChatData overviewChatData) {
            TextView[] textViewArr = this.primary;
            textViewArr[0].setText(overviewChatData.membersPrimary);
            textViewArr[1].setText(overviewChatData.messagesPrimary);
            textViewArr[2].setText(overviewChatData.viewingMembersPrimary);
            textViewArr[3].setText(overviewChatData.postingMembersPrimary);
            TextView[] textViewArr2 = this.secondary;
            textViewArr2[0].setText(overviewChatData.membersSecondary);
            textViewArr2[0].setTag(Integer.valueOf(overviewChatData.membersUp ? Theme.key_windowBackgroundWhiteGreenText2 : Theme.key_text_RedRegular));
            textViewArr2[1].setText(overviewChatData.messagesSecondary);
            textViewArr2[1].setTag(Integer.valueOf(overviewChatData.messagesUp ? Theme.key_windowBackgroundWhiteGreenText2 : Theme.key_text_RedRegular));
            textViewArr2[2].setText(overviewChatData.viewingMembersSecondary);
            textViewArr2[2].setTag(Integer.valueOf(overviewChatData.viewingMembersUp ? Theme.key_windowBackgroundWhiteGreenText2 : Theme.key_text_RedRegular));
            textViewArr2[3].setText(overviewChatData.postingMembersSecondary);
            textViewArr2[3].setTag(Integer.valueOf(overviewChatData.postingMembersUp ? Theme.key_windowBackgroundWhiteGreenText2 : Theme.key_text_RedRegular));
            TextView[] textViewArr3 = this.title;
            textViewArr3[0].setText(overviewChatData.membersTitle);
            textViewArr3[1].setText(overviewChatData.messagesTitle);
            textViewArr3[2].setText(overviewChatData.viewingMembersTitle);
            textViewArr3[3].setText(overviewChatData.postingMembersTitle);
            updateColors();
        }

        public final void updateColors() {
            int i = 0;
            while (true) {
                TextView[] textViewArr = this.primary;
                if (i >= textViewArr.length) {
                    return;
                }
                TextView textView = textViewArr[i];
                int i2 = Theme.key_windowBackgroundWhiteBlackText;
                textView.setTextColor(Theme.getColor(null, i2, false));
                this.title[i].setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false));
                TextView[] textViewArr2 = this.secondary;
                Integer num = (Integer) textViewArr2[i].getTag();
                if (num != null) {
                    textViewArr2[i].setTextColor(Theme.getColor(null, num.intValue(), false));
                } else {
                    textViewArr2[i].setTextColor(Theme.getColor(null, i2, false));
                }
                i++;
            }
        }

        public final void setData(String str, int i, String str2, String str3) {
            this.primary[i].setText(str);
            this.secondary[i].setText(str2);
            this.title[i].setText(str3);
            updateColors();
        }
    }
}
