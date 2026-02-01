package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class PostsSearchContainer extends FrameLayout {
    private ColoredImageSpan arrowSpan;
    private ForegroundColorAlphaSpan colorSpan;
    private final int currentAccount;
    private final ButtonWithCounterView emptyButton;
    private final BackupImageView emptyImageView;
    private final FrameLayout emptyParentView;
    private final TextView emptyTextView;
    private final TextView emptyTitleView;
    private final TextView emptyUnderButtonTextView;
    private final LinearLayout emptyView;
    private boolean endReached;
    private TLRPC.SearchPostsFlood flood;
    private boolean floodLoading;
    private int floodLoadingRequestId;
    private final BaseFragment fragment;
    private boolean isEmpty;
    private String lastQuery;
    private int lastRate;
    public final UniversalRecyclerView listView;
    private boolean loading;
    private final ArrayList messages;
    private final ArrayList newsMessages;
    private boolean newsMessagesEndReached;
    private int newsMessagesLastRate;
    private int queryid;
    private int reqId;
    private ColoredImageSpan searchSpan;
    private ColoredImageSpan[] starSpan;
    private final Runnable updateEmptyViewRunnable;
    private boolean wasEmptyOnFloodLoad;
    private boolean wasOpen;

    public PostsSearchContainer(Context context, final BaseFragment baseFragment) {
        super(context);
        this.newsMessages = new ArrayList();
        this.messages = new ArrayList();
        this.reqId = -1;
        this.queryid = 0;
        this.floodLoadingRequestId = -1;
        this.starSpan = new ColoredImageSpan[1];
        this.updateEmptyViewRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.updateEmptyView();
            }
        };
        this.fragment = baseFragment;
        int currentAccount = baseFragment.getCurrentAccount();
        this.currentAccount = currentAccount;
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, currentAccount, 0, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                this.f$0.onItemClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, null, null);
        this.listView = universalRecyclerView;
        universalRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) throws NumberFormatException {
                BaseFragment baseFragment2;
                if (!(TextUtils.isEmpty(PostsSearchContainer.this.lastQuery) ? PostsSearchContainer.this.newsMessages : PostsSearchContainer.this.messages).isEmpty() && (!PostsSearchContainer.this.listView.canScrollVertically(1) || PostsSearchContainer.this.isLoadingVisible())) {
                    PostsSearchContainer.this.load(false);
                }
                PostsSearchContainer postsSearchContainer = PostsSearchContainer.this;
                if (!postsSearchContainer.listView.scrollingByUser || postsSearchContainer.isEmpty || (baseFragment2 = baseFragment) == null || baseFragment2.getParentActivity() == null) {
                    return;
                }
                AndroidUtilities.hideKeyboard(baseFragment.getParentActivity().getCurrentFocus());
            }
        });
        addView(universalRecyclerView, LayoutHelper.createFrame(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.emptyParentView = frameLayout;
        LinearLayout linearLayout = new LinearLayout(context) {
            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i)), View.MeasureSpec.getMode(i)), i2);
            }
        };
        this.emptyView = linearLayout;
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, LayoutHelper.createFrame(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        this.emptyImageView = backupImageView;
        backupImageView.setVisibility(8);
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(130, 130, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        this.emptyTitleView = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.emptyTextView = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(4);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 0, 9, 0, 0));
        ButtonWithCounterView round = new ButtonWithCounterView(context, null).setRound();
        this.emptyButton = round;
        linearLayout.addView(round, LayoutHelper.createLinear(-1, 44, 7, 0, 19, 0, 0));
        TextView textView3 = new TextView(context);
        this.emptyUnderButtonTextView = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setGravity(17);
        linearLayout.addView(textView3, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
        addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
        universalRecyclerView.setHideIfEmpty(false);
        universalRecyclerView.setEmptyView(frameLayout);
        universalRecyclerView.setAnimateEmptyView(true, 0);
        updateColors();
        updateEmptyView();
    }

    public void updateColors() {
        this.emptyParentView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        this.emptyTitleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        TextView textView = this.emptyUnderButtonTextView;
        int i = Theme.key_windowBackgroundWhiteGrayText;
        textView.setTextColor(Theme.getColor(i));
        this.emptyTextView.setTextColor(Theme.getColor(i));
        this.listView.setAdapter(null);
        UniversalRecyclerView universalRecyclerView = this.listView;
        universalRecyclerView.setAdapter(universalRecyclerView.adapter);
        if (this.colorSpan != null) {
            this.colorSpan = null;
            updateEmptyView();
        }
    }

    public boolean isLoadingVisible() {
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            if (this.listView.getChildAt(i) instanceof FlickerLoadingView) {
                return true;
            }
        }
        return false;
    }

    public void load(final boolean z) throws NumberFormatException {
        long j;
        TLRPC.SearchPostsFlood searchPostsFlood;
        if (this.loading) {
            return;
        }
        final boolean zIsEmpty = TextUtils.isEmpty(this.lastQuery);
        if (zIsEmpty && this.newsMessagesEndReached) {
            return;
        }
        if (zIsEmpty || !this.endReached) {
            if (zIsEmpty || this.flood != null) {
                this.loading = true;
                final MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                final ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.currentAccount);
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= 2;
                tL_channels_searchPosts.query = this.lastQuery;
                tL_channels_searchPosts.limit = 30;
                if (zIsEmpty) {
                    if (!this.newsMessages.isEmpty()) {
                        ArrayList arrayList = this.newsMessages;
                        MessageObject messageObject = (MessageObject) arrayList.get(arrayList.size() - 1);
                        tL_channels_searchPosts.offset_rate = this.newsMessagesLastRate;
                        tL_channels_searchPosts.offset_id = messageObject.getRealId();
                        tL_channels_searchPosts.offset_peer = messagesController.getInputPeer(messageObject.messageOwner.peer_id);
                    } else {
                        tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                } else if (!this.messages.isEmpty()) {
                    ArrayList arrayList2 = this.messages;
                    MessageObject messageObject2 = (MessageObject) arrayList2.get(arrayList2.size() - 1);
                    tL_channels_searchPosts.offset_rate = this.lastRate;
                    tL_channels_searchPosts.offset_id = messageObject2.getRealId();
                    tL_channels_searchPosts.offset_peer = messagesController.getInputPeer(messageObject2.messageOwner.peer_id);
                } else {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                if (!z || (searchPostsFlood = this.flood) == null) {
                    j = 0;
                } else {
                    tL_channels_searchPosts.flags |= 4;
                    j = searchPostsFlood.stars_amount;
                    tL_channels_searchPosts.allow_paid_stars = j;
                }
                final long j2 = j;
                this.reqId = connectionsManager.sendRequest(tL_channels_searchPosts, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$load$4(messagesController, zIsEmpty, tL_channels_searchPosts, z, j2, connectionsManager, tLObject, tL_error);
                    }
                }, 1024);
                updateEmptyView();
                this.listView.adapter.update(true);
            }
        }
    }

    public void lambda$load$4(final MessagesController messagesController, final boolean z, final TLRPC.TL_channels_searchPosts tL_channels_searchPosts, final boolean z2, final long j, final ConnectionsManager connectionsManager, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() throws NumberFormatException {
                this.f$0.lambda$load$3(tLObject, messagesController, z, tL_channels_searchPosts, z2, j, tL_error, connectionsManager);
            }
        });
    }

    public void lambda$load$3(TLObject tLObject, MessagesController messagesController, final boolean z, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z2, final long j, TLRPC.TL_error tL_error, ConnectionsManager connectionsManager) throws NumberFormatException {
        this.reqId = -1;
        this.loading = false;
        this.emptyButton.setLoading(false);
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            messagesController.putUsers(messages_messages.users, false);
            messagesController.putChats(messages_messages.chats, false);
            TLRPC.SearchPostsFlood searchPostsFlood = messages_messages.search_flood;
            if (searchPostsFlood != null) {
                this.flood = searchPostsFlood;
            }
            final ArrayList arrayList = z ? this.newsMessages : this.messages;
            boolean zIsEmpty = arrayList.isEmpty();
            Iterator<TLRPC.Message> it = messages_messages.messages.iterator();
            while (it.hasNext()) {
                MessageObject messageObject = new MessageObject(this.currentAccount, it.next(), false, false);
                if (!z) {
                    messageObject.setQuery(tL_channels_searchPosts.query);
                }
                arrayList.add(messageObject);
            }
            if (!z) {
                if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                    this.lastRate = messages_messages.next_rate;
                    this.endReached = (messages_messages.flags & 1) == 0;
                } else if ((messages_messages instanceof TLRPC.TL_messages_messages) || (messages_messages instanceof TLRPC.TL_messages_channelMessages)) {
                    this.lastRate = 0;
                    this.endReached = true;
                }
            } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                this.newsMessagesLastRate = messages_messages.next_rate;
                this.newsMessagesEndReached = (messages_messages.flags & 1) == 0;
            } else if ((messages_messages instanceof TLRPC.TL_messages_messages) || (messages_messages instanceof TLRPC.TL_messages_channelMessages)) {
                this.newsMessagesLastRate = 0;
                this.newsMessagesEndReached = true;
            }
            updateEmptyView();
            if (zIsEmpty) {
                this.listView.scrollToPosition(0);
            }
            this.listView.adapter.update(true);
            if (!arrayList.isEmpty() && (!z ? !this.endReached : !this.newsMessagesEndReached)) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() throws NumberFormatException {
                        this.f$0.lambda$load$0(z, arrayList);
                    }
                });
            }
            if (!z2 || j <= 0 || z) {
                return;
            }
            BulletinFactory.of(this.fragment).createSimpleBulletin(R.raw.stars_topup, AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("SearchPaidStars", (int) j))).show();
            return;
        }
        if (tL_error != null && tL_error.text.startsWith("FLOOD_WAIT_") && tL_error.text.contains("_OR_STARS_")) {
            Matcher matcher = Pattern.compile("FLOOD_WAIT_(\\d+)_OR_STARS_(\\d+)").matcher(tL_error.text);
            if (matcher == null || !matcher.matches()) {
                return;
            }
            int i = Integer.parseInt(matcher.group(1));
            int i2 = Integer.parseInt(matcher.group(2));
            TLRPC.SearchPostsFlood searchPostsFlood2 = this.flood;
            if (searchPostsFlood2 != null) {
                searchPostsFlood2.flags = 2 | searchPostsFlood2.flags;
                searchPostsFlood2.wait_till = connectionsManager.getCurrentTime() + i;
                this.flood.stars_amount = i2;
            }
            updateEmptyView();
            this.listView.adapter.update(true);
            return;
        }
        if (tL_error != null && "PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error.text)) {
            updateEmptyView();
            this.listView.adapter.update(true);
        } else {
            if (tL_error == null || !"BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                return;
            }
            updateEmptyView();
            this.listView.adapter.update(true);
            StarsController.getInstance(this.currentAccount).getBalance(true, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$load$2(j);
                }
            }, true);
        }
    }

    public void lambda$load$0(boolean z, ArrayList arrayList) throws NumberFormatException {
        if (z) {
            arrayList = this.newsMessages;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (!this.listView.canScrollVertically(1) || isLoadingVisible()) {
            load(false);
        }
    }

    public void lambda$load$2(long j) {
        Activity activity = AndroidUtilities.getActivity();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        new StarsIntroActivity.StarsNeededSheet(activity, (PhotoViewer.getInstance().isVisible() || (safeLastFragment != null && safeLastFragment.hasShownSheet())) ? new DarkThemeResourceProvider() : safeLastFragment != null ? safeLastFragment.getResourceProvider() : null, j, 15, "", new Runnable() {
            @Override
            public final void run() throws NumberFormatException {
                this.f$0.lambda$load$1();
            }
        }, 0L).show();
    }

    public void lambda$load$1() throws NumberFormatException {
        load(true);
    }

    private void cancel() {
        if (this.reqId >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
            this.reqId = -1;
        }
        this.loading = false;
        this.emptyButton.setLoading(false);
    }

    public void search(String str) {
        if (TextUtils.equals(this.lastQuery, str)) {
            return;
        }
        cancel();
        this.lastQuery = str;
        if (TextUtils.isEmpty(str)) {
            this.lastRate = 0;
            this.queryid++;
            this.endReached = false;
            this.messages.clear();
            load(false);
        } else {
            loadFlood(str);
            this.lastRate = 0;
            this.queryid++;
            this.endReached = false;
            this.messages.clear();
        }
        updateEmptyView();
        this.listView.scrollToPosition(0);
        this.listView.adapter.update(true);
    }

    private void loadFlood(String str) {
        if (this.floodLoadingRequestId >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.floodLoadingRequestId, true);
            this.floodLoadingRequestId = -1;
        }
        if (!this.floodLoading) {
            this.wasEmptyOnFloodLoad = this.isEmpty && !(this.messages.isEmpty() && this.endReached);
        }
        this.floodLoading = true;
        TLRPC.TL_channels_checkSearchPostsFlood tL_channels_checkSearchPostsFlood = new TLRPC.TL_channels_checkSearchPostsFlood();
        if (!TextUtils.isEmpty(str)) {
            tL_channels_checkSearchPostsFlood.flags = 1 | tL_channels_checkSearchPostsFlood.flags;
            tL_channels_checkSearchPostsFlood.query = str;
        }
        this.floodLoadingRequestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkSearchPostsFlood, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadFlood$6(tLObject, tL_error);
            }
        });
    }

    public void lambda$loadFlood$6(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() throws NumberFormatException {
                this.f$0.lambda$loadFlood$5(tLObject);
            }
        });
    }

    public void lambda$loadFlood$5(TLObject tLObject) throws NumberFormatException {
        this.floodLoading = false;
        if (tLObject instanceof TLRPC.SearchPostsFlood) {
            TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
            this.flood = searchPostsFlood;
            if (searchPostsFlood.query_is_free) {
                load(false);
            } else {
                updateEmptyView();
                this.listView.adapter.update(true);
            }
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.flood == null) {
            loadFlood(null);
        }
        if (this.wasOpen) {
            return;
        }
        this.wasOpen = true;
        MessagesController.getGlobalMainSettings().edit().putInt("searchpostsnew", MessagesController.getGlobalMainSettings().getInt("searchpostsnew", 0) + 1).apply();
        StarsController.getInstance(this.currentAccount).getBalance();
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        if (this.flood == null) {
            arrayList.add(UItem.asFlicker(-1, 7));
            arrayList.add(UItem.asFlicker(-2, 7));
            arrayList.add(UItem.asFlicker(-3, 7));
            this.isEmpty = false;
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.lastQuery);
        if (zIsEmpty) {
            if (!this.newsMessages.isEmpty()) {
                arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            Iterator it = this.newsMessages.iterator();
            while (it.hasNext()) {
                arrayList.add(UItem.asSearchMessage((MessageObject) it.next()));
            }
        } else {
            if (!this.messages.isEmpty()) {
                arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            Iterator it2 = this.messages.iterator();
            while (it2.hasNext()) {
                arrayList.add(UItem.asSearchMessage((MessageObject) it2.next()));
            }
        }
        if (this.loading || ((this.floodLoading && !this.wasEmptyOnFloodLoad) || (!zIsEmpty && !this.messages.isEmpty() && !this.endReached))) {
            arrayList.add(UItem.asFlicker(this.queryid * 3, 7));
            arrayList.add(UItem.asFlicker((this.queryid * 3) + 1, 7));
            arrayList.add(UItem.asFlicker((this.queryid * 3) + 2, 7));
        }
        this.isEmpty = arrayList.isEmpty();
    }

    public void onItemClick(UItem uItem, View view, int i, float f, float f2) {
        Object obj = uItem.object;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            Bundle bundle = new Bundle();
            if (messageObject.getDialogId() >= 0) {
                bundle.putLong("user_id", messageObject.getDialogId());
            } else {
                bundle.putLong("chat_id", -messageObject.getDialogId());
            }
            bundle.putInt("message_id", messageObject.getId());
            this.fragment.presentFragment(DialogsActivity.highlightFoundQuote(new ChatActivity(bundle), messageObject));
        }
    }

    public void updateEmptyView() {
        TLRPC.SearchPostsFlood searchPostsFlood;
        String str;
        Object objValueOf;
        Object objValueOf2;
        AndroidUtilities.cancelRunOnUIThread(this.updateEmptyViewRunnable);
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.emptyImageView.setVisibility(8);
            this.emptyTitleView.setText(LocaleController.getString(R.string.SearchPostsTitle));
            this.emptyTextView.setText(LocaleController.getString(R.string.SearchPostsText));
            this.emptyButton.setVisibility(0);
            this.emptyButton.setText(LocaleController.getString(R.string.SearchPostsButtonPremium), true);
            this.emptyButton.setSubText(null, true);
            this.emptyButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$updateEmptyView$7(view);
                }
            });
            this.emptyUnderButtonTextView.setVisibility(0);
            this.emptyUnderButtonTextView.setText(LocaleController.getString(R.string.SearchPostsPremium));
            return;
        }
        if (!TextUtils.isEmpty(this.lastQuery) && this.messages.isEmpty() && this.endReached) {
            if (this.emptyImageView.getImageReceiver().getImageDrawable() == null) {
                this.emptyImageView.setImageDrawable(new RLottieDrawable(R.raw.utyan_empty, "utyan_empty", AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
            }
            this.emptyImageView.setVisibility(0);
            this.emptyTitleView.setText(LocaleController.getString(R.string.SearchPostsNotFound));
            TextView textView = this.emptyTextView;
            textView.setText(LocaleController.formatString(R.string.SearchPostsNotFoundText, TextUtils.ellipsize(this.lastQuery, textView.getPaint(), AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END)));
            this.emptyButton.setVisibility(8);
            this.emptyUnderButtonTextView.setVisibility(8);
            return;
        }
        if (!TextUtils.isEmpty(this.lastQuery) && (searchPostsFlood = this.flood) != null && (searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
            this.emptyImageView.setVisibility(8);
            this.emptyTitleView.setText(LocaleController.getString(R.string.SearchPostsLimitReached));
            this.emptyTextView.setText(LocaleController.formatPluralStringComma("SearchPostsLimitReachedText", this.flood.total_daily));
            int i = this.flood.wait_till - currentTime;
            int i2 = i / 3600;
            int i3 = i - (i2 * 3600);
            int i4 = i3 / 60;
            int i5 = i3 - (i4 * 60);
            this.emptyButton.setVisibility(0);
            this.emptyButton.setText(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("SearchPostsButtonPay", (int) this.flood.stars_amount), 1.13f, this.starSpan), true);
            ButtonWithCounterView buttonWithCounterView = this.emptyButton;
            int i6 = R.string.SearchPostsFreeSearchUnlocksIn;
            StringBuilder sb = new StringBuilder();
            if (i2 > 0) {
                str = i2 + ":";
            } else {
                str = "";
            }
            sb.append(str);
            if (i4 < 10) {
                objValueOf = "0" + i4;
            } else {
                objValueOf = Integer.valueOf(i4);
            }
            sb.append(objValueOf);
            sb.append(":");
            if (i5 < 10) {
                objValueOf2 = "0" + i5;
            } else {
                objValueOf2 = Integer.valueOf(i5);
            }
            sb.append(objValueOf2);
            buttonWithCounterView.setSubText(LocaleController.formatString(i6, sb.toString()), true);
            this.emptyButton.subText.setHacks(false, true, true);
            this.emptyButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) throws NumberFormatException {
                    this.f$0.lambda$updateEmptyView$8(view);
                }
            });
            AndroidUtilities.runOnUIThread(this.updateEmptyViewRunnable, 1000L);
            this.emptyUnderButtonTextView.setVisibility(8);
            return;
        }
        if (this.messages.isEmpty() && !this.loading && !TextUtils.isEmpty(this.lastQuery)) {
            this.emptyImageView.setVisibility(8);
            this.emptyTitleView.setText(LocaleController.getString(R.string.SearchPostsTitle));
            this.emptyTextView.setText(LocaleController.getString(R.string.SearchPostsText));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
            if (this.searchSpan == null) {
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.smiles_tab_search);
                this.searchSpan = coloredImageSpan;
                coloredImageSpan.setScale(0.79f, 0.79f);
            }
            if (this.colorSpan == null) {
                this.colorSpan = new ForegroundColorAlphaSpan(Theme.blendOver(Theme.getColor(Theme.key_featuredStickers_addButton), Theme.multAlpha(Theme.getColor(Theme.key_featuredStickers_buttonText), 0.75f)));
            }
            spannableStringBuilder.setSpan(this.searchSpan, 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SearchPostsButton));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(TextUtils.ellipsize(this.lastQuery, this.emptyButton.getTextPaint(), AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
            spannableStringBuilder.setSpan(this.colorSpan, length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " >");
            if (this.arrowSpan == null) {
                ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.msg_mini_forumarrow);
                this.arrowSpan = coloredImageSpan2;
                coloredImageSpan2.setScale(1.05f, 1.05f);
            }
            spannableStringBuilder.setSpan(this.arrowSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            this.emptyButton.setVisibility(0);
            this.emptyButton.setText(spannableStringBuilder, true);
            this.emptyButton.text.setHacks(false, true, false);
            this.emptyButton.setSubText(null, true);
            this.emptyButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) throws NumberFormatException {
                    this.f$0.lambda$updateEmptyView$9(view);
                }
            });
            if (this.flood != null) {
                this.emptyUnderButtonTextView.setVisibility(0);
                TextView textView2 = this.emptyUnderButtonTextView;
                TLRPC.SearchPostsFlood searchPostsFlood2 = this.flood;
                int i7 = searchPostsFlood2.remains;
                if (i7 < 1) {
                    i7 = searchPostsFlood2.total_daily;
                }
                textView2.setText(LocaleController.formatPluralStringComma("SearchPostsFreeSearches", i7));
                return;
            }
            this.emptyUnderButtonTextView.setVisibility(8);
            return;
        }
        this.emptyImageView.setVisibility(8);
        this.emptyTitleView.setText(LocaleController.getString(R.string.SearchPostsTitle));
        this.emptyTextView.setText(LocaleController.getString(R.string.SearchPostsText));
        this.emptyButton.setVisibility(8);
        if (this.flood != null) {
            this.emptyUnderButtonTextView.setVisibility(0);
            TextView textView3 = this.emptyUnderButtonTextView;
            TLRPC.SearchPostsFlood searchPostsFlood3 = this.flood;
            int i8 = searchPostsFlood3.remains;
            if (i8 < 1) {
                i8 = searchPostsFlood3.total_daily;
            }
            textView3.setText(LocaleController.formatPluralStringComma("SearchPostsFreeSearches", i8));
            return;
        }
        this.emptyUnderButtonTextView.setVisibility(8);
    }

    public void lambda$updateEmptyView$7(View view) {
        this.fragment.presentFragment(new PremiumPreviewFragment("search"));
    }

    public void lambda$updateEmptyView$8(View view) throws NumberFormatException {
        this.emptyButton.setLoading(true);
        load(true);
    }

    public void lambda$updateEmptyView$9(View view) throws NumberFormatException {
        this.emptyButton.setLoading(true);
        load(false);
    }

    public void setKeyboardHeight(int i) {
        this.emptyView.animate().translationY((-i) / 2.0f).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
    }

    public static class ForegroundColorAlphaSpan extends CharacterStyle {
        private final int color;

        public ForegroundColorAlphaSpan(int i) {
            this.color = i;
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(Theme.multAlpha(this.color, textPaint.getAlpha() / 255.0f));
        }
    }
}
