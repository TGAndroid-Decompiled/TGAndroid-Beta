package org.telegram.p009ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.collection.ArraySet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LruCache;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.p009ui.ActionBar.ActionBarMenu;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.SimpleTextView;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Cells.EmptyCell;
import org.telegram.p009ui.Cells.HeaderCell;
import org.telegram.p009ui.Cells.LoadingCell;
import org.telegram.p009ui.Cells.ManageChatUserCell;
import org.telegram.p009ui.Cells.ShadowSectionCell;
import org.telegram.p009ui.Charts.BaseChartView;
import org.telegram.p009ui.Charts.data.ChartData;
import org.telegram.p009ui.Charts.data.StackLinearChartData;
import org.telegram.p009ui.Charts.view_data.ChartHeaderView;
import org.telegram.p009ui.Components.ChatAvatarContainer;
import org.telegram.p009ui.Components.CombinedDrawable;
import org.telegram.p009ui.Components.EmptyTextProgressView;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.RLottieImageView;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.MessageStatisticActivity;
import org.telegram.p009ui.StatisticActivity;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageFwdHeader;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputPeerEmpty;
import org.telegram.tgnet.TLRPC$TL_messages_messagesSlice;
import org.telegram.tgnet.TLRPC$TL_statsGraph;
import org.telegram.tgnet.TLRPC$TL_statsGraphError;
import org.telegram.tgnet.TLRPC$TL_stats_getMessagePublicForwards;
import org.telegram.tgnet.TLRPC$TL_stats_getMessageStats;
import org.telegram.tgnet.TLRPC$TL_stats_loadAsyncGraph;
import org.telegram.tgnet.TLRPC$TL_stats_messageStats;
import org.telegram.tgnet.TLRPC$messages_Messages;

public class MessageStatisticActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private ChatAvatarContainer avatarContainer;
    private TLRPC$ChatFull chat;
    private final long chatId;
    boolean drawPlay;
    private int emptyRow;
    private EmptyTextProgressView emptyView;
    private boolean endReached;
    private int endRow;
    private boolean firstLoaded;
    private int headerRow;
    private RLottieImageView imageView;
    private int interactionsChartRow;
    private StatisticActivity.ChartViewData interactionsViewData;
    private StatisticActivity.ZoomCancelable lastCancelable;
    private LinearLayoutManager layoutManager;
    private FrameLayout listContainer;
    private RecyclerListView listView;
    private ListAdapter listViewAdapter;
    private boolean loading;
    private int loadingRow;
    private final int messageId;
    private MessageObject messageObject;
    private int nextRate;
    private int overviewHeaderRow;
    private int overviewRow;
    private LinearLayout progressLayout;
    private int publicChats;
    private int rowCount;
    private BaseChartView.SharedUiComponents sharedUi;
    private int startRow;
    private boolean statsLoaded;
    ImageReceiver thumbImage;
    private LruCache<ChartData> childDataCache = new LruCache<>(15);
    private ArrayList<TLRPC$Message> messages = new ArrayList<>();
    ArraySet<Integer> shadowDivideCells = new ArraySet<>();
    private final Runnable showProgressbar = new Runnable() {
        @Override
        public void run() {
            MessageStatisticActivity.this.progressLayout.animate().alpha(1.0f).setDuration(230L);
        }
    };

    public MessageStatisticActivity(MessageObject messageObject) {
        this.messageObject = messageObject;
        if (messageObject.messageOwner.fwd_from == null) {
            this.chatId = messageObject.getChatId();
            this.messageId = this.messageObject.getId();
        } else {
            this.chatId = -messageObject.getFromChatId();
            this.messageId = this.messageObject.messageOwner.fwd_msg_id;
        }
        this.chat = getMessagesController().getChatFull(this.chatId);
    }

    private void updateRows() {
        this.shadowDivideCells.clear();
        this.headerRow = -1;
        this.startRow = -1;
        this.endRow = -1;
        this.loadingRow = -1;
        this.interactionsChartRow = -1;
        this.overviewHeaderRow = -1;
        this.overviewRow = -1;
        this.rowCount = 0;
        if (this.firstLoaded && this.statsLoaded) {
            AndroidUtilities.cancelRunOnUIThread(this.showProgressbar);
            if (this.listContainer.getVisibility() == 8) {
                this.progressLayout.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        MessageStatisticActivity.this.progressLayout.setVisibility(8);
                    }
                });
                this.listContainer.setVisibility(0);
                this.listContainer.setAlpha(0.0f);
                this.listContainer.animate().alpha(1.0f).start();
            }
            int i = this.rowCount;
            int i2 = i + 1;
            this.rowCount = i2;
            this.overviewHeaderRow = i;
            int i3 = i2 + 1;
            this.rowCount = i3;
            this.overviewRow = i2;
            ArraySet<Integer> arraySet = this.shadowDivideCells;
            this.rowCount = i3 + 1;
            arraySet.add(Integer.valueOf(i3));
            if (this.interactionsViewData != null) {
                int i4 = this.rowCount;
                int i5 = i4 + 1;
                this.rowCount = i5;
                this.interactionsChartRow = i4;
                ArraySet<Integer> arraySet2 = this.shadowDivideCells;
                this.rowCount = i5 + 1;
                arraySet2.add(Integer.valueOf(i5));
            }
            if (!this.messages.isEmpty()) {
                int i6 = this.rowCount;
                int i7 = i6 + 1;
                this.rowCount = i7;
                this.headerRow = i6;
                this.startRow = i7;
                int size = i7 + this.messages.size();
                this.rowCount = size;
                this.endRow = size;
                int i8 = size + 1;
                this.rowCount = i8;
                this.emptyRow = size;
                ArraySet<Integer> arraySet3 = this.shadowDivideCells;
                this.rowCount = i8 + 1;
                arraySet3.add(Integer.valueOf(i8));
                if (!this.endReached) {
                    int i9 = this.rowCount;
                    this.rowCount = i9 + 1;
                    this.loadingRow = i9;
                }
            }
        }
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.chat != null) {
            loadStat();
            loadChats(100);
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(this.chatId, this.classGuid, true);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC$ChatFull tLRPC$ChatFull = (TLRPC$ChatFull) objArr[0];
            if (this.chat == null && tLRPC$ChatFull.f855id == this.chatId) {
                TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
                if (chat != null) {
                    this.avatarContainer.setChatAvatar(chat);
                    this.avatarContainer.setTitle(chat.title);
                }
                this.chat = tLRPC$ChatFull;
                loadStat();
                loadChats(100);
                updateMenu();
            }
        }
    }

    @Override
    public android.view.View createView(android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.MessageStatisticActivity.createView(android.content.Context):android.view.View");
    }

    public void lambda$createView$0(View view, int i) {
        int i2 = this.startRow;
        if (i >= i2 && i < this.endRow) {
            TLRPC$Message tLRPC$Message = this.messages.get(i - i2);
            long dialogId = MessageObject.getDialogId(tLRPC$Message);
            Bundle bundle = new Bundle();
            if (DialogObject.isUserDialog(dialogId)) {
                bundle.putLong("user_id", dialogId);
            } else {
                bundle.putLong("chat_id", -dialogId);
            }
            bundle.putInt("message_id", tLRPC$Message.f877id);
            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
            if (getMessagesController().checkCanOpenChat(bundle, this)) {
                presentFragment(new ChatActivity(bundle));
            }
        }
    }

    public void lambda$createView$1(View view) {
        if (getParentLayout().fragmentsStack.size() > 1) {
            BaseFragment baseFragment = getParentLayout().fragmentsStack.get(getParentLayout().fragmentsStack.size() - 2);
            if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).getCurrentChat().f854id == this.chatId) {
                finishFragment();
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        bundle.putInt("message_id", this.messageId);
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        presentFragment(new ChatActivity(bundle));
    }

    private void updateMenu() {
        TLRPC$ChatFull tLRPC$ChatFull = this.chat;
        if (tLRPC$ChatFull != null && tLRPC$ChatFull.can_view_stats) {
            ActionBarMenu createMenu = this.actionBar.createMenu();
            createMenu.clearItems();
            createMenu.addItem(0, C0952R.C0953drawable.ic_ab_other).addSubItem(1, C0952R.C0953drawable.msg_stats, LocaleController.getString("ViewChannelStats", C0952R.string.ViewChannelStats));
        }
    }

    public void loadChats(int i) {
        if (!this.loading) {
            this.loading = true;
            ListAdapter listAdapter = this.listViewAdapter;
            if (listAdapter != null) {
                listAdapter.notifyDataSetChanged();
            }
            TLRPC$TL_stats_getMessagePublicForwards tLRPC$TL_stats_getMessagePublicForwards = new TLRPC$TL_stats_getMessagePublicForwards();
            tLRPC$TL_stats_getMessagePublicForwards.limit = i;
            MessageObject messageObject = this.messageObject;
            TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = messageObject.messageOwner.fwd_from;
            if (tLRPC$MessageFwdHeader != null) {
                tLRPC$TL_stats_getMessagePublicForwards.msg_id = tLRPC$MessageFwdHeader.saved_from_msg_id;
                tLRPC$TL_stats_getMessagePublicForwards.channel = getMessagesController().getInputChannel(-this.messageObject.getFromChatId());
            } else {
                tLRPC$TL_stats_getMessagePublicForwards.msg_id = messageObject.getId();
                tLRPC$TL_stats_getMessagePublicForwards.channel = getMessagesController().getInputChannel(-this.messageObject.getDialogId());
            }
            if (!this.messages.isEmpty()) {
                ArrayList<TLRPC$Message> arrayList = this.messages;
                TLRPC$Message tLRPC$Message = arrayList.get(arrayList.size() - 1);
                tLRPC$TL_stats_getMessagePublicForwards.offset_id = tLRPC$Message.f877id;
                tLRPC$TL_stats_getMessagePublicForwards.offset_peer = getMessagesController().getInputPeer(MessageObject.getDialogId(tLRPC$Message));
                tLRPC$TL_stats_getMessagePublicForwards.offset_rate = this.nextRate;
            } else {
                tLRPC$TL_stats_getMessagePublicForwards.offset_peer = new TLRPC$TL_inputPeerEmpty();
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_stats_getMessagePublicForwards, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MessageStatisticActivity.this.lambda$loadChats$3(tLObject, tLRPC$TL_error);
                }
            }, null, null, 0, this.chat.stats_dc, 1, true), this.classGuid);
        }
    }

    public void lambda$loadChats$3(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessageStatisticActivity.this.lambda$loadChats$2(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$loadChats$2(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error == null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            if ((tLRPC$messages_Messages.flags & 1) != 0) {
                this.nextRate = tLRPC$messages_Messages.next_rate;
            }
            int i = tLRPC$messages_Messages.count;
            if (i != 0) {
                this.publicChats = i;
            } else if (this.publicChats == 0) {
                this.publicChats = tLRPC$messages_Messages.messages.size();
            }
            this.endReached = !(tLRPC$messages_Messages instanceof TLRPC$TL_messages_messagesSlice);
            getMessagesController().putChats(tLRPC$messages_Messages.chats, false);
            getMessagesController().putUsers(tLRPC$messages_Messages.users, false);
            this.messages.addAll(tLRPC$messages_Messages.messages);
            EmptyTextProgressView emptyTextProgressView = this.emptyView;
            if (emptyTextProgressView != null) {
                emptyTextProgressView.showTextView();
            }
        }
        this.firstLoaded = true;
        this.loading = false;
        updateRows();
    }

    private void loadStat() {
        TLRPC$TL_stats_getMessageStats tLRPC$TL_stats_getMessageStats = new TLRPC$TL_stats_getMessageStats();
        MessageObject messageObject = this.messageObject;
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = messageObject.messageOwner.fwd_from;
        if (tLRPC$MessageFwdHeader != null) {
            tLRPC$TL_stats_getMessageStats.msg_id = tLRPC$MessageFwdHeader.saved_from_msg_id;
            tLRPC$TL_stats_getMessageStats.channel = getMessagesController().getInputChannel(-this.messageObject.getFromChatId());
        } else {
            tLRPC$TL_stats_getMessageStats.msg_id = messageObject.getId();
            tLRPC$TL_stats_getMessageStats.channel = getMessagesController().getInputChannel(-this.messageObject.getDialogId());
        }
        getConnectionsManager().sendRequest(tLRPC$TL_stats_getMessageStats, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MessageStatisticActivity.this.lambda$loadStat$8(tLObject, tLRPC$TL_error);
            }
        }, null, null, 0, this.chat.stats_dc, 1, true);
    }

    public void lambda$loadStat$8(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessageStatisticActivity.this.lambda$loadStat$7(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$loadStat$7(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        this.statsLoaded = true;
        if (tLRPC$TL_error != null) {
            updateRows();
            return;
        }
        StatisticActivity.ChartViewData createViewData = StatisticActivity.createViewData(((TLRPC$TL_stats_messageStats) tLObject).views_graph, LocaleController.getString("InteractionsChartTitle", C0952R.string.InteractionsChartTitle), 1, false);
        this.interactionsViewData = createViewData;
        if (createViewData == null || createViewData.chartData.f1012x.length > 5) {
            updateRows();
            return;
        }
        this.statsLoaded = false;
        final TLRPC$TL_stats_loadAsyncGraph tLRPC$TL_stats_loadAsyncGraph = new TLRPC$TL_stats_loadAsyncGraph();
        StatisticActivity.ChartViewData chartViewData = this.interactionsViewData;
        tLRPC$TL_stats_loadAsyncGraph.token = chartViewData.zoomToken;
        long[] jArr = chartViewData.chartData.f1012x;
        tLRPC$TL_stats_loadAsyncGraph.f973x = jArr[jArr.length - 1];
        tLRPC$TL_stats_loadAsyncGraph.flags |= 1;
        final String str = this.interactionsViewData.zoomToken + "_" + tLRPC$TL_stats_loadAsyncGraph.f973x;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_stats_loadAsyncGraph, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                MessageStatisticActivity.this.lambda$loadStat$6(str, tLRPC$TL_stats_loadAsyncGraph, tLObject2, tLRPC$TL_error2);
            }
        }, null, null, 0, this.chat.stats_dc, 1, true), this.classGuid);
    }

    public void lambda$loadStat$6(final String str, final TLRPC$TL_stats_loadAsyncGraph tLRPC$TL_stats_loadAsyncGraph, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        ChartData chartData = null;
        if (tLObject instanceof TLRPC$TL_statsGraph) {
            try {
                chartData = StatisticActivity.createChartData(new JSONObject(((TLRPC$TL_statsGraph) tLObject).json.data), 1, false);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (tLObject instanceof TLRPC$TL_statsGraphError) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessageStatisticActivity.this.lambda$loadStat$4(tLObject);
                }
            });
        }
        final ChartData chartData2 = chartData;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessageStatisticActivity.this.lambda$loadStat$5(tLRPC$TL_error, chartData2, str, tLRPC$TL_stats_loadAsyncGraph);
            }
        });
    }

    public void lambda$loadStat$4(TLObject tLObject) {
        if (getParentActivity() != null) {
            Toast.makeText(getParentActivity(), ((TLRPC$TL_statsGraphError) tLObject).error, 1).show();
        }
    }

    public void lambda$loadStat$5(TLRPC$TL_error tLRPC$TL_error, ChartData chartData, String str, TLRPC$TL_stats_loadAsyncGraph tLRPC$TL_stats_loadAsyncGraph) {
        this.statsLoaded = true;
        if (tLRPC$TL_error != null || chartData == null) {
            updateRows();
            return;
        }
        this.childDataCache.put(str, chartData);
        StatisticActivity.ChartViewData chartViewData = this.interactionsViewData;
        chartViewData.childChartData = chartData;
        chartViewData.activeZoom = tLRPC$TL_stats_loadAsyncGraph.f973x;
        updateRows();
    }

    @Override
    public void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 0) {
                return ((ManageChatUserCell) viewHolder.itemView).getCurrentObject() instanceof TLObject;
            }
            return false;
        }

        @Override
        public int getItemCount() {
            return MessageStatisticActivity.this.rowCount;
        }

        public class C31311 extends StatisticActivity.BaseChartCell {
            @Override
            void loadData(StatisticActivity.ChartViewData chartViewData) {
            }

            C31311(Context context, int i, BaseChartView.SharedUiComponents sharedUiComponents) {
                super(context, i, sharedUiComponents);
            }

            @Override
            public void onZoomed() {
                if (this.data.activeZoom <= 0) {
                    performClick();
                    BaseChartView baseChartView = this.chartView;
                    if (baseChartView.legendSignatureView.canGoZoom) {
                        long selectedDate = baseChartView.getSelectedDate();
                        if (this.chartType == 4) {
                            StatisticActivity.ChartViewData chartViewData = this.data;
                            chartViewData.childChartData = new StackLinearChartData(chartViewData.chartData, selectedDate);
                            zoomChart(false);
                        } else if (this.data.zoomToken != null) {
                            zoomCanceled();
                            final String str = this.data.zoomToken + "_" + selectedDate;
                            ChartData chartData = (ChartData) MessageStatisticActivity.this.childDataCache.get(str);
                            if (chartData != null) {
                                this.data.childChartData = chartData;
                                zoomChart(false);
                                return;
                            }
                            TLRPC$TL_stats_loadAsyncGraph tLRPC$TL_stats_loadAsyncGraph = new TLRPC$TL_stats_loadAsyncGraph();
                            tLRPC$TL_stats_loadAsyncGraph.token = this.data.zoomToken;
                            if (selectedDate != 0) {
                                tLRPC$TL_stats_loadAsyncGraph.f973x = selectedDate;
                                tLRPC$TL_stats_loadAsyncGraph.flags |= 1;
                            }
                            MessageStatisticActivity messageStatisticActivity = MessageStatisticActivity.this;
                            final StatisticActivity.ZoomCancelable zoomCancelable = new StatisticActivity.ZoomCancelable();
                            messageStatisticActivity.lastCancelable = zoomCancelable;
                            zoomCancelable.adapterPosition = MessageStatisticActivity.this.listView.getChildAdapterPosition(this);
                            this.chartView.legendSignatureView.showProgress(true, false);
                            ConnectionsManager.getInstance(((BaseFragment) MessageStatisticActivity.this).currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(((BaseFragment) MessageStatisticActivity.this).currentAccount).sendRequest(tLRPC$TL_stats_loadAsyncGraph, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                    MessageStatisticActivity.ListAdapter.C31311.this.lambda$onZoomed$1(str, zoomCancelable, tLObject, tLRPC$TL_error);
                                }
                            }, null, null, 0, MessageStatisticActivity.this.chat.stats_dc, 1, true), ((BaseFragment) MessageStatisticActivity.this).classGuid);
                        }
                    }
                }
            }

            public void lambda$onZoomed$1(final String str, final StatisticActivity.ZoomCancelable zoomCancelable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                final ChartData chartData = null;
                if (tLObject instanceof TLRPC$TL_statsGraph) {
                    try {
                        chartData = StatisticActivity.createChartData(new JSONObject(((TLRPC$TL_statsGraph) tLObject).json.data), this.data.graphType, false);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TLRPC$TL_statsGraphError) {
                    Toast.makeText(getContext(), ((TLRPC$TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MessageStatisticActivity.ListAdapter.C31311.this.lambda$onZoomed$0(chartData, str, zoomCancelable);
                    }
                });
            }

            public void lambda$onZoomed$0(ChartData chartData, String str, StatisticActivity.ZoomCancelable zoomCancelable) {
                if (chartData != null) {
                    MessageStatisticActivity.this.childDataCache.put(str, chartData);
                }
                if (chartData != null && !zoomCancelable.canceled && zoomCancelable.adapterPosition >= 0) {
                    View findViewByPosition = MessageStatisticActivity.this.layoutManager.findViewByPosition(zoomCancelable.adapterPosition);
                    if (findViewByPosition instanceof StatisticActivity.BaseChartCell) {
                        this.data.childChartData = chartData;
                        StatisticActivity.BaseChartCell baseChartCell = (StatisticActivity.BaseChartCell) findViewByPosition;
                        baseChartCell.chartView.legendSignatureView.showProgress(false, false);
                        baseChartCell.zoomChart(false);
                    }
                }
                zoomCanceled();
            }

            @Override
            public void zoomCanceled() {
                if (MessageStatisticActivity.this.lastCancelable != null) {
                    MessageStatisticActivity.this.lastCancelable.canceled = true;
                }
                int childCount = MessageStatisticActivity.this.listView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = MessageStatisticActivity.this.listView.getChildAt(i);
                    if (childAt instanceof StatisticActivity.BaseChartCell) {
                        ((StatisticActivity.BaseChartCell) childAt).chartView.legendSignatureView.showProgress(false, true);
                    }
                }
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            LoadingCell loadingCell;
            if (i == 0) {
                ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, 6, 2, false);
                manageChatUserCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                loadingCell = manageChatUserCell;
            } else if (i == 1) {
                loadingCell = new ShadowSectionCell(this.mContext);
            } else if (i == 2) {
                HeaderCell headerCell = new HeaderCell(this.mContext, "windowBackgroundWhiteBlueHeader", 16, 11, false);
                headerCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                headerCell.setHeight(43);
                loadingCell = headerCell;
            } else if (i == 4) {
                C31311 r9 = new C31311(this.mContext, 1, MessageStatisticActivity.this.sharedUi = new BaseChartView.SharedUiComponents());
                r9.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                loadingCell = r9;
            } else if (i == 5) {
                OverviewCell overviewCell = new OverviewCell(this.mContext);
                overviewCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                overviewCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                loadingCell = overviewCell;
            } else if (i != 6) {
                loadingCell = new LoadingCell(this.mContext, AndroidUtilities.m34dp(40.0f), AndroidUtilities.m34dp(120.0f));
            } else {
                EmptyCell emptyCell = new EmptyCell(this.mContext, 16);
                emptyCell.setLayoutParams(new RecyclerView.LayoutParams(-1, 16));
                emptyCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                loadingCell = emptyCell;
            }
            return new RecyclerListView.Holder(loadingCell);
        }

        @Override
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r9, int r10) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.MessageStatisticActivity.ListAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        @Override
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).recycle();
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (MessageStatisticActivity.this.shadowDivideCells.contains(Integer.valueOf(i))) {
                return 1;
            }
            if (i == MessageStatisticActivity.this.headerRow || i == MessageStatisticActivity.this.overviewHeaderRow) {
                return 2;
            }
            if (i == MessageStatisticActivity.this.loadingRow) {
                return 3;
            }
            if (i == MessageStatisticActivity.this.interactionsChartRow) {
                return 4;
            }
            if (i == MessageStatisticActivity.this.overviewRow) {
                return 5;
            }
            return i == MessageStatisticActivity.this.emptyRow ? 6 : 0;
        }

        public TLRPC$Message getItem(int i) {
            if (i < MessageStatisticActivity.this.startRow || i >= MessageStatisticActivity.this.endRow) {
                return null;
            }
            return (TLRPC$Message) MessageStatisticActivity.this.messages.get(i - MessageStatisticActivity.this.startRow);
        }
    }

    public class OverviewCell extends LinearLayout {
        TextView[] primary = new TextView[3];
        TextView[] title = new TextView[3];
        View[] cell = new View[3];

        public OverviewCell(Context context) {
            super(context);
            setOrientation(1);
            setPadding(AndroidUtilities.m34dp(16.0f), 0, AndroidUtilities.m34dp(16.0f), AndroidUtilities.m34dp(16.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            for (int i = 0; i < 3; i++) {
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.cell[i] = linearLayout2;
                linearLayout2.setOrientation(1);
                this.primary[i] = new TextView(context);
                this.title[i] = new TextView(context);
                this.primary[i].setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                this.primary[i].setTextSize(1, 17.0f);
                this.title[i].setTextSize(1, 13.0f);
                linearLayout2.addView(this.primary[i]);
                linearLayout2.addView(this.title[i]);
                linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f));
            }
            addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f));
        }

        public void setData() {
            this.primary[0].setText(AndroidUtilities.formatWholeNumber(MessageStatisticActivity.this.messageObject.messageOwner.views, 0));
            this.title[0].setText(LocaleController.getString("StatisticViews", C0952R.string.StatisticViews));
            if (MessageStatisticActivity.this.publicChats > 0) {
                this.cell[1].setVisibility(0);
                this.primary[1].setText(AndroidUtilities.formatWholeNumber(MessageStatisticActivity.this.publicChats, 0));
                this.title[1].setText(LocaleController.formatString("PublicShares", C0952R.string.PublicShares, new Object[0]));
            } else {
                this.cell[1].setVisibility(8);
            }
            int i = MessageStatisticActivity.this.messageObject.messageOwner.forwards - MessageStatisticActivity.this.publicChats;
            if (i > 0) {
                this.cell[2].setVisibility(0);
                this.primary[2].setText(AndroidUtilities.formatWholeNumber(i, 0));
                this.title[2].setText(LocaleController.formatString("PrivateShares", C0952R.string.PrivateShares, new Object[0]));
            } else {
                this.cell[2].setVisibility(8);
            }
            updateColors();
        }

        public void updateColors() {
            for (int i = 0; i < 3; i++) {
                this.primary[i].setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
                this.title[i].setTextColor(Theme.getColor("windowBackgroundWhiteGrayText2"));
            }
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ThemeDescription.ThemeDescriptionDelegate messageStatisticActivity$$ExternalSyntheticLambda8 = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                MessageStatisticActivity.this.lambda$getThemeDescriptions$9();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{HeaderCell.class, ManageChatUserCell.class}, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        ChatAvatarContainer chatAvatarContainer = this.avatarContainer;
        SimpleTextView simpleTextView = null;
        arrayList.add(new ThemeDescription(chatAvatarContainer != null ? chatAvatarContainer.getTitleTextView() : null, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "player_actionBarTitle"));
        ChatAvatarContainer chatAvatarContainer2 = this.avatarContainer;
        if (chatAvatarContainer2 != null) {
            simpleTextView = chatAvatarContainer2.getSubtitleTextView();
        }
        arrayList.add(new ThemeDescription(simpleTextView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, (Class[]) null, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "player_actionBarSubtitle", (Object) null));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, messageStatisticActivity$$ExternalSyntheticLambda8, "statisticChartLineEmpty"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, "divider"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueHeader"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusColor"}, (Paint[]) null, (Drawable[]) null, messageStatisticActivity$$ExternalSyntheticLambda8, "windowBackgroundWhiteGrayText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusOnlineColor"}, (Paint[]) null, (Drawable[]) null, messageStatisticActivity$$ExternalSyntheticLambda8, "windowBackgroundWhiteBlueText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, null, Theme.avatarDrawables, null, "avatar_text"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, messageStatisticActivity$$ExternalSyntheticLambda8, "avatar_backgroundRed"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, messageStatisticActivity$$ExternalSyntheticLambda8, "avatar_backgroundOrange"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, messageStatisticActivity$$ExternalSyntheticLambda8, "avatar_backgroundViolet"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, messageStatisticActivity$$ExternalSyntheticLambda8, "avatar_backgroundGreen"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, messageStatisticActivity$$ExternalSyntheticLambda8, "avatar_backgroundCyan"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, messageStatisticActivity$$ExternalSyntheticLambda8, "avatar_backgroundBlue"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, messageStatisticActivity$$ExternalSyntheticLambda8, "avatar_backgroundPink"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUBACKGROUND, null, null, null, null, "actionBarDefaultSubmenuBackground"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUITEM, null, null, null, null, "actionBarDefaultSubmenuItem"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUITEM | ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, "actionBarDefaultSubmenuItemIcon"));
        StatisticActivity.putColorFromData(this.interactionsViewData, arrayList, messageStatisticActivity$$ExternalSyntheticLambda8);
        return arrayList;
    }

    public void lambda$getThemeDescriptions$9() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                recolorRecyclerItem(this.listView.getChildAt(i));
            }
            int hiddenChildCount = this.listView.getHiddenChildCount();
            for (int i2 = 0; i2 < hiddenChildCount; i2++) {
                recolorRecyclerItem(this.listView.getHiddenChildAt(i2));
            }
            int cachedChildCount = this.listView.getCachedChildCount();
            for (int i3 = 0; i3 < cachedChildCount; i3++) {
                recolorRecyclerItem(this.listView.getCachedChildAt(i3));
            }
            int attachedScrapChildCount = this.listView.getAttachedScrapChildCount();
            for (int i4 = 0; i4 < attachedScrapChildCount; i4++) {
                recolorRecyclerItem(this.listView.getAttachedScrapChildAt(i4));
            }
            this.listView.getRecycledViewPool().clear();
        }
        BaseChartView.SharedUiComponents sharedUiComponents = this.sharedUi;
        if (sharedUiComponents != null) {
            sharedUiComponents.invalidate();
        }
        this.avatarContainer.getSubtitleTextView().setLinkTextColor(Theme.getColor("player_actionBarSubtitle"));
    }

    private void recolorRecyclerItem(View view) {
        if (view instanceof ManageChatUserCell) {
            ((ManageChatUserCell) view).update(0);
        } else if (view instanceof StatisticActivity.BaseChartCell) {
            ((StatisticActivity.BaseChartCell) view).recolor();
            view.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        } else if (view instanceof ShadowSectionCell) {
            CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor("windowBackgroundGray")), Theme.getThemedDrawable(ApplicationLoader.applicationContext, (int) C0952R.C0953drawable.greydivider, "windowBackgroundGrayShadow"), 0, 0);
            combinedDrawable.setFullsize(true);
            view.setBackground(combinedDrawable);
        } else if (view instanceof ChartHeaderView) {
            ((ChartHeaderView) view).recolor();
        } else if (view instanceof OverviewCell) {
            ((OverviewCell) view).updateColors();
            view.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        }
        if (view instanceof EmptyCell) {
            view.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        }
    }
}
