package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
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
    private final UniversalRecyclerView listView;
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
                PostsSearchContainer.this.updateEmptyView();
            }
        };
        this.fragment = baseFragment;
        int currentAccount = baseFragment.getCurrentAccount();
        this.currentAccount = currentAccount;
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, currentAccount, 0, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                PostsSearchContainer.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                PostsSearchContainer.this.onItemClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, null, null);
        this.listView = universalRecyclerView;
        universalRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                BaseFragment baseFragment2;
                if (!(TextUtils.isEmpty(PostsSearchContainer.this.lastQuery) ? PostsSearchContainer.this.newsMessages : PostsSearchContainer.this.messages).isEmpty() && (!PostsSearchContainer.this.listView.canScrollVertically(1) || PostsSearchContainer.this.isLoadingVisible())) {
                    PostsSearchContainer.this.load(false);
                }
                if (!PostsSearchContainer.this.listView.scrollingByUser || PostsSearchContainer.this.isEmpty || (baseFragment2 = baseFragment) == null || baseFragment2.getParentActivity() == null) {
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
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, null);
        this.emptyButton = buttonWithCounterView;
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 44, 7, 0, 19, 0, 0));
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

    private void cancel() {
        if (this.reqId >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
            this.reqId = -1;
        }
        this.loading = false;
        this.emptyButton.setLoading(false);
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        boolean isEmpty;
        if (this.flood == null) {
            arrayList.add(UItem.asFlicker(-1, 7));
            arrayList.add(UItem.asFlicker(-2, 7));
            arrayList.add(UItem.asFlicker(-3, 7));
            isEmpty = false;
        } else {
            boolean isEmpty2 = TextUtils.isEmpty(this.lastQuery);
            if (isEmpty2) {
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
            if (this.loading || ((this.floodLoading && !this.wasEmptyOnFloodLoad) || (!isEmpty2 && !this.messages.isEmpty() && !this.endReached))) {
                arrayList.add(UItem.asFlicker(this.queryid * 3, 7));
                arrayList.add(UItem.asFlicker((this.queryid * 3) + 1, 7));
                arrayList.add(UItem.asFlicker((this.queryid * 3) + 2, 7));
            }
            isEmpty = arrayList.isEmpty();
        }
        this.isEmpty = isEmpty;
    }

    public boolean isLoadingVisible() {
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            if (this.listView.getChildAt(i) instanceof FlickerLoadingView) {
                return true;
            }
        }
        return false;
    }

    public void lambda$load$0(boolean z, ArrayList arrayList) {
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

    public void lambda$load$1() {
        load(true);
    }

    public void lambda$load$2(long j) {
        Activity activity = AndroidUtilities.getActivity();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        new StarsIntroActivity.StarsNeededSheet(activity, (PhotoViewer.getInstance().isVisible() || (safeLastFragment != null && safeLastFragment.hasShownSheet())) ? new DarkThemeResourceProvider() : safeLastFragment != null ? safeLastFragment.getResourceProvider() : null, j, 15, "", new Runnable() {
            @Override
            public final void run() {
                PostsSearchContainer.this.lambda$load$1();
            }
        }).show();
    }

    public void lambda$load$3(TLObject tLObject, MessagesController messagesController, final boolean z, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z2, final long j, TLRPC.TL_error tL_error, ConnectionsManager connectionsManager) {
        this.reqId = -1;
        this.loading = false;
        this.emptyButton.setLoading(false);
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            if (tL_error != null && tL_error.text.startsWith("FLOOD_WAIT_") && tL_error.text.contains("_OR_STARS_")) {
                Matcher matcher = Pattern.compile("FLOOD_WAIT_(\\d+)_OR_STARS_(\\d+)").matcher(tL_error.text);
                if (matcher == null || !matcher.matches()) {
                    return;
                }
                int parseInt = Integer.parseInt(matcher.group(1));
                int parseInt2 = Integer.parseInt(matcher.group(2));
                TLRPC.SearchPostsFlood searchPostsFlood = this.flood;
                if (searchPostsFlood != null) {
                    searchPostsFlood.flags = 2 | searchPostsFlood.flags;
                    searchPostsFlood.wait_till = connectionsManager.getCurrentTime() + parseInt;
                    this.flood.stars_amount = parseInt2;
                }
            } else if (tL_error == null || !"PREMIUM_ACCOUNT_REQUIRED".equalsIgnoreCase(tL_error.text)) {
                if (tL_error == null || !"BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    return;
                }
                updateEmptyView();
                this.listView.adapter.update(true);
                StarsController.getInstance(this.currentAccount).getBalance(true, new Runnable() {
                    @Override
                    public final void run() {
                        PostsSearchContainer.this.lambda$load$2(j);
                    }
                }, true);
                return;
            }
            updateEmptyView();
            this.listView.adapter.update(true);
            return;
        }
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        messagesController.putUsers(messages_messages.users, false);
        messagesController.putChats(messages_messages.chats, false);
        TLRPC.SearchPostsFlood searchPostsFlood2 = messages_messages.search_flood;
        if (searchPostsFlood2 != null) {
            this.flood = searchPostsFlood2;
        }
        final ArrayList arrayList = z ? this.newsMessages : this.messages;
        boolean isEmpty = arrayList.isEmpty();
        Iterator<TLRPC.Message> it = messages_messages.messages.iterator();
        while (it.hasNext()) {
            MessageObject messageObject = new MessageObject(this.currentAccount, it.next(), false, false);
            if (!z) {
                messageObject.setQuery(tL_channels_searchPosts.query);
            }
            arrayList.add(messageObject);
        }
        boolean z3 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
        if (z) {
            if (z3) {
                this.newsMessagesLastRate = messages_messages.next_rate;
                this.newsMessagesEndReached = (messages_messages.flags & 1) == 0;
            } else if ((messages_messages instanceof TLRPC.TL_messages_messages) || (messages_messages instanceof TLRPC.TL_messages_channelMessages)) {
                this.newsMessagesLastRate = 0;
                this.newsMessagesEndReached = true;
            }
        } else if (z3) {
            this.lastRate = messages_messages.next_rate;
            this.endReached = (messages_messages.flags & 1) == 0;
        } else if ((messages_messages instanceof TLRPC.TL_messages_messages) || (messages_messages instanceof TLRPC.TL_messages_channelMessages)) {
            this.lastRate = 0;
            this.endReached = true;
        }
        updateEmptyView();
        if (isEmpty) {
            this.listView.scrollToPosition(0);
        }
        this.listView.adapter.update(true);
        if (!arrayList.isEmpty() && (!z ? !this.endReached : !this.newsMessagesEndReached)) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PostsSearchContainer.this.lambda$load$0(z, arrayList);
                }
            });
        }
        if (!z2 || j <= 0 || z) {
            return;
        }
        BulletinFactory.of(this.fragment).createSimpleBulletin(R.raw.stars_topup, AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("SearchPaidStars", (int) j))).show();
    }

    public void lambda$load$4(final MessagesController messagesController, final boolean z, final TLRPC.TL_channels_searchPosts tL_channels_searchPosts, final boolean z2, final long j, final ConnectionsManager connectionsManager, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PostsSearchContainer.this.lambda$load$3(tLObject, messagesController, z, tL_channels_searchPosts, z2, j, tL_error, connectionsManager);
            }
        });
    }

    public void lambda$loadFlood$5(TLObject tLObject) {
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

    public void lambda$loadFlood$6(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PostsSearchContainer.this.lambda$loadFlood$5(tLObject);
            }
        });
    }

    public void lambda$updateEmptyView$7(View view) {
        this.fragment.presentFragment(new PremiumPreviewFragment("search"));
    }

    public void lambda$updateEmptyView$8(View view) {
        this.emptyButton.setLoading(true);
        load(true);
    }

    public void lambda$updateEmptyView$9(View view) {
        this.emptyButton.setLoading(true);
        load(false);
    }

    public void load(final boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.PostsSearchContainer.load(boolean):void");
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
                PostsSearchContainer.this.lambda$loadFlood$6(tLObject, tL_error);
            }
        });
    }

    public void onItemClick(UItem uItem, View view, int i, float f, float f2) {
        String str;
        Object obj = uItem.object;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            Bundle bundle = new Bundle();
            long dialogId = messageObject.getDialogId();
            long dialogId2 = messageObject.getDialogId();
            if (dialogId >= 0) {
                str = "user_id";
            } else {
                dialogId2 = -dialogId2;
                str = "chat_id";
            }
            bundle.putLong(str, dialogId2);
            bundle.putInt("message_id", messageObject.getId());
            this.fragment.presentFragment(DialogsActivity.highlightFoundQuote(new ChatActivity(bundle), messageObject));
        }
    }

    public void updateEmptyView() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.PostsSearchContainer.updateEmptyView():void");
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

    public void setKeyboardHeight(int i) {
        this.emptyView.animate().translationY((-i) / 2.0f).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
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
}
