package org.telegram.ui.Components;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.exoplayer2.RendererCapabilities;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.GLIconSettingsView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class PostsSearchContainer extends FrameLayout {
    public ColoredImageSpan arrowSpan;
    public EllipsizeSpanAnimator$TextAlphaSpan colorSpan;
    public final int currentAccount;
    public final ButtonWithCounterView emptyButton;
    public final BackupImageView emptyImageView;
    public final FrameLayout emptyParentView;
    public final TextView emptyTextView;
    public final TextView emptyTitleView;
    public final TextView emptyUnderButtonTextView;
    public final GLIconSettingsView emptyView;
    public boolean endReached;
    public TLRPC.SearchPostsFlood flood;
    public boolean floodLoading;
    public int floodLoadingRequestId;
    public final DialogsActivity fragment;
    public boolean ignoreRequestLayout;
    public boolean isEmpty;
    public String lastQuery;
    public int lastRate;
    public final UniversalRecyclerView listView;
    public boolean loading;
    public final ArrayList messages;
    public final ArrayList newsMessages;
    public boolean newsMessagesEndReached;
    public int newsMessagesLastRate;
    public int queryid;
    public int reqId;
    public ColoredImageSpan searchSpan;
    public final ColoredImageSpan[] starSpan;
    public final PostsSearchContainer$$ExternalSyntheticLambda5 updateEmptyViewRunnable;
    public boolean wasEmptyOnFloodLoad;
    public boolean wasOpen;

    public PostsSearchContainer(Activity activity, DialogsActivity dialogsActivity) {
        super(activity);
        this.newsMessages = new ArrayList();
        this.messages = new ArrayList();
        this.reqId = -1;
        this.queryid = 0;
        this.floodLoadingRequestId = -1;
        this.starSpan = new ColoredImageSpan[1];
        this.updateEmptyViewRunnable = new PostsSearchContainer$$ExternalSyntheticLambda5(this, 0);
        this.fragment = dialogsActivity;
        int currentAccount = dialogsActivity.getCurrentAccount();
        this.currentAccount = currentAccount;
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(activity, currentAccount, 0, new GiftSheet$$ExternalSyntheticLambda8(this, 7), new ProfileGooeyView$$ExternalSyntheticLambda0(this, 14), null, null);
        this.listView = universalRecyclerView;
        universalRecyclerView.addOnScrollListener(new ChatActivity.AnonymousClass35(2, this, dialogsActivity));
        addView(universalRecyclerView, LayoutHelper.createFrame(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.emptyParentView = frameLayout;
        GLIconSettingsView gLIconSettingsView = new GLIconSettingsView(activity, 5);
        this.emptyView = gLIconSettingsView;
        gLIconSettingsView.setOrientation(1);
        frameLayout.addView(gLIconSettingsView, LayoutHelper.createFrame(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        BackupImageView backupImageView = new BackupImageView(activity);
        this.emptyImageView = backupImageView;
        backupImageView.setVisibility(8);
        gLIconSettingsView.addView(backupImageView, LayoutHelper.createLinear(130, 130, 1, 0, 0, 0, 12));
        TextView textView = new TextView(activity);
        this.emptyTitleView = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        gLIconSettingsView.addView(textView, LayoutHelper.createLinear(-2, -2, 1));
        TextView textView2 = new TextView(activity);
        this.emptyTextView = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(4);
        textView2.setEllipsize(truncateAt);
        gLIconSettingsView.addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 0, 9, 0, 0));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(activity, null, true);
        buttonWithCounterView.setRoundRadius(24);
        this.emptyButton = buttonWithCounterView;
        gLIconSettingsView.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 44, 7, 0, 19, 0, 0));
        TextView textView3 = new TextView(activity);
        this.emptyUnderButtonTextView = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setGravity(17);
        gLIconSettingsView.addView(textView3, LayoutHelper.createLinear(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
        universalRecyclerView.setHideIfEmpty(false);
        universalRecyclerView.setEmptyView(frameLayout);
        universalRecyclerView.animateEmptyView = true;
        universalRecyclerView.emptyViewAnimationType = 0;
        updateColors();
        updateEmptyView();
    }

    public final void load(boolean z) {
        long j;
        TLRPC.SearchPostsFlood searchPostsFlood;
        if (this.loading) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.lastQuery);
        if (zIsEmpty && this.newsMessagesEndReached) {
            return;
        }
        if (zIsEmpty || !this.endReached) {
            if (zIsEmpty || this.flood != null) {
                this.loading = true;
                int i = this.currentAccount;
                MessagesController messagesController = MessagesController.getInstance(i);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= 2;
                tL_channels_searchPosts.query = this.lastQuery;
                tL_channels_searchPosts.limit = 30;
                if (zIsEmpty) {
                    ArrayList arrayList = this.newsMessages;
                    if (arrayList.isEmpty()) {
                        tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        MessageObject messageObject = (MessageObject) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList);
                        tL_channels_searchPosts.offset_rate = this.newsMessagesLastRate;
                        tL_channels_searchPosts.offset_id = messageObject.getRealId();
                        tL_channels_searchPosts.offset_peer = messagesController.getInputPeer(messageObject.messageOwner.peer_id);
                    }
                } else {
                    ArrayList arrayList2 = this.messages;
                    if (arrayList2.isEmpty()) {
                        tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        MessageObject messageObject2 = (MessageObject) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList2);
                        tL_channels_searchPosts.offset_rate = this.lastRate;
                        tL_channels_searchPosts.offset_id = messageObject2.getRealId();
                        tL_channels_searchPosts.offset_peer = messagesController.getInputPeer(messageObject2.messageOwner.peer_id);
                    }
                }
                if (!z || (searchPostsFlood = this.flood) == null) {
                    j = 0;
                } else {
                    tL_channels_searchPosts.flags |= 4;
                    j = searchPostsFlood.stars_amount;
                    tL_channels_searchPosts.allow_paid_stars = j;
                }
                this.reqId = connectionsManager.sendRequest(tL_channels_searchPosts, new AudioPlayerAlert$$ExternalSyntheticLambda44(this, messagesController, zIsEmpty, tL_channels_searchPosts, z, j, connectionsManager), 1024);
                updateEmptyView();
                this.listView.adapter.update(true);
            }
        }
    }

    public final void loadFlood(String str) {
        int i = this.floodLoadingRequestId;
        int i2 = this.currentAccount;
        if (i >= 0) {
            ConnectionsManager.getInstance(i2).cancelRequest(this.floodLoadingRequestId, true);
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
        this.floodLoadingRequestId = ConnectionsManager.getInstance(i2).sendRequest(tL_channels_checkSearchPostsFlood, new CallLogActivity$$ExternalSyntheticLambda1(this, 25));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.flood == null) {
            loadFlood(null);
        }
        if (this.wasOpen) {
            return;
        }
        this.wasOpen = true;
        MessagesController.getGlobalMainSettings().edit().putInt("searchpostsnew", MessagesController.getGlobalMainSettings().getInt("searchpostsnew", 0) + 1).apply();
        StarsController.getInstance(this.currentAccount, false).getBalance();
    }

    @Override
    public final void requestLayout() {
        if (this.ignoreRequestLayout) {
            return;
        }
        super.requestLayout();
    }

    public void setKeyboardHeight(int i) {
        this.emptyView.animate().translationY((-i) / 2.0f).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
    }

    public final void updateColors() {
        this.emptyParentView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        this.emptyTitleView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        int i = Theme.key_windowBackgroundWhiteGrayText;
        this.emptyUnderButtonTextView.setTextColor(Theme.getColor(null, i, false));
        this.emptyTextView.setTextColor(Theme.getColor(null, i, false));
        UniversalRecyclerView universalRecyclerView = this.listView;
        universalRecyclerView.setAdapter(null);
        universalRecyclerView.setAdapter(universalRecyclerView.adapter);
        if (this.colorSpan != null) {
            this.colorSpan = null;
            updateEmptyView();
        }
    }

    public final void updateEmptyView() {
        float f;
        TLRPC.SearchPostsFlood searchPostsFlood;
        final int i = 2;
        PostsSearchContainer$$ExternalSyntheticLambda5 postsSearchContainer$$ExternalSyntheticLambda5 = this.updateEmptyViewRunnable;
        AndroidUtilities.cancelRunOnUIThread(postsSearchContainer$$ExternalSyntheticLambda5);
        int i2 = this.currentAccount;
        int currentTime = ConnectionsManager.getInstance(i2).getCurrentTime();
        boolean zIsPremium = UserConfig.getInstance(i2).isPremium();
        TextView textView = this.emptyTextView;
        TextView textView2 = this.emptyTitleView;
        BackupImageView backupImageView = this.emptyImageView;
        TextView textView3 = this.emptyUnderButtonTextView;
        ButtonWithCounterView buttonWithCounterView = this.emptyButton;
        final int i3 = 1;
        final int i4 = 0;
        if (!zIsPremium) {
            backupImageView.setVisibility(8);
            textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
            textView.setText(LocaleController.getString(R.string.SearchPostsText));
            buttonWithCounterView.setVisibility(0);
            buttonWithCounterView.setText(LocaleController.getString(R.string.SearchPostsButtonPremium), true, true);
            buttonWithCounterView.setSubText(null, true);
            buttonWithCounterView.setOnClickListener(new View.OnClickListener(this) {
                public final PostsSearchContainer f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            PostsSearchContainer postsSearchContainer = this.f$0;
                            postsSearchContainer.getClass();
                            postsSearchContainer.fragment.presentFragment(new PremiumPreviewFragment(0, "search"));
                            break;
                        case 1:
                            PostsSearchContainer postsSearchContainer2 = this.f$0;
                            postsSearchContainer2.emptyButton.setLoading(true);
                            postsSearchContainer2.load(true);
                            break;
                        default:
                            PostsSearchContainer postsSearchContainer3 = this.f$0;
                            postsSearchContainer3.emptyButton.setLoading(true);
                            postsSearchContainer3.load(false);
                            break;
                    }
                }
            });
            textView3.setVisibility(0);
            textView3.setText(LocaleController.getString(R.string.SearchPostsPremium));
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.lastQuery);
        ArrayList arrayList = this.messages;
        if (!zIsEmpty && arrayList.isEmpty() && this.endReached) {
            if (backupImageView.getImageReceiver().getImageDrawable() == null) {
                backupImageView.setImageDrawable(new RLottieDrawable(R.raw.utyan_empty, "utyan_empty", AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f), true, null));
            }
            backupImageView.setVisibility(0);
            textView2.setText(LocaleController.getString(R.string.SearchPostsNotFound));
            textView.setText(LocaleController.formatString(R.string.SearchPostsNotFoundText, TextUtils.ellipsize(this.lastQuery, textView.getPaint(), AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END)));
            buttonWithCounterView.setVisibility(8);
            textView3.setVisibility(8);
            return;
        }
        if (TextUtils.isEmpty(this.lastQuery) || (searchPostsFlood = this.flood) == null) {
            f = 100.0f;
        } else {
            f = 100.0f;
            if ((searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
                backupImageView.setVisibility(8);
                textView2.setText(LocaleController.getString(R.string.SearchPostsLimitReached));
                textView.setText(LocaleController.formatPluralStringComma("SearchPostsLimitReachedText", this.flood.total_daily));
                int i5 = this.flood.wait_till - currentTime;
                int i6 = i5 / 3600;
                int i7 = i5 - (i6 * 3600);
                int i8 = i7 / 60;
                int i9 = i7 - (i8 * 60);
                buttonWithCounterView.setVisibility(0);
                buttonWithCounterView.setText(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("SearchPostsButtonPay", (int) this.flood.stars_amount), 1.13f, this.starSpan), true, true);
                int i10 = R.string.SearchPostsFreeSearchUnlocksIn;
                StringBuilder sb = new StringBuilder();
                sb.append(i6 > 0 ? RendererCapabilities.CC.m(i6, ":") : "");
                sb.append(i8 < 10 ? DiffUtil.m(i8, "0") : Integer.valueOf(i8));
                sb.append(":");
                sb.append(i9 < 10 ? DiffUtil.m(i9, "0") : Integer.valueOf(i9));
                buttonWithCounterView.setSubText(LocaleController.formatString(i10, sb.toString()), true);
                buttonWithCounterView.subText.setHacks(false, true);
                buttonWithCounterView.setOnClickListener(new View.OnClickListener(this) {
                    public final PostsSearchContainer f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i3) {
                            case 0:
                                PostsSearchContainer postsSearchContainer = this.f$0;
                                postsSearchContainer.getClass();
                                postsSearchContainer.fragment.presentFragment(new PremiumPreviewFragment(0, "search"));
                                break;
                            case 1:
                                PostsSearchContainer postsSearchContainer2 = this.f$0;
                                postsSearchContainer2.emptyButton.setLoading(true);
                                postsSearchContainer2.load(true);
                                break;
                            default:
                                PostsSearchContainer postsSearchContainer3 = this.f$0;
                                postsSearchContainer3.emptyButton.setLoading(true);
                                postsSearchContainer3.load(false);
                                break;
                        }
                    }
                });
                AndroidUtilities.runOnUIThread(postsSearchContainer$$ExternalSyntheticLambda5, 1000L);
                textView3.setVisibility(8);
                return;
            }
        }
        if (!arrayList.isEmpty() || this.loading || TextUtils.isEmpty(this.lastQuery)) {
            backupImageView.setVisibility(8);
            textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
            textView.setText(LocaleController.getString(R.string.SearchPostsText));
            buttonWithCounterView.setVisibility(8);
            if (this.flood == null) {
                textView3.setVisibility(8);
                return;
            }
            textView3.setVisibility(0);
            TLRPC.SearchPostsFlood searchPostsFlood2 = this.flood;
            int i11 = searchPostsFlood2.remains;
            if (i11 < 1) {
                i11 = searchPostsFlood2.total_daily;
            }
            textView3.setText(LocaleController.formatPluralStringComma("SearchPostsFreeSearches", i11));
            return;
        }
        backupImageView.setVisibility(8);
        textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
        textView.setText(LocaleController.getString(R.string.SearchPostsText));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
        if (this.searchSpan == null) {
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.smiles_tab_search);
            this.searchSpan = coloredImageSpan;
            coloredImageSpan.setScale(0.79f, 0.79f);
        }
        if (this.colorSpan == null) {
            this.colorSpan = new EllipsizeSpanAnimator$TextAlphaSpan(Theme.blendOver(Theme.getColor(null, Theme.key_featuredStickers_addButton, false), Theme.multAlpha(0.75f, Theme.getColor(null, Theme.key_featuredStickers_buttonText, false))), 1);
        }
        spannableStringBuilder.setSpan(this.searchSpan, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SearchPostsButton));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(TextUtils.ellipsize(this.lastQuery, buttonWithCounterView.getTextPaint(), AndroidUtilities.dp(f), TextUtils.TruncateAt.END));
        spannableStringBuilder.setSpan(this.colorSpan, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " >");
        if (this.arrowSpan == null) {
            ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.msg_mini_forumarrow);
            this.arrowSpan = coloredImageSpan2;
            coloredImageSpan2.setScale(1.05f, 1.05f);
        }
        spannableStringBuilder.setSpan(this.arrowSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        buttonWithCounterView.setVisibility(0);
        buttonWithCounterView.setText(spannableStringBuilder, true, true);
        buttonWithCounterView.text.setHacks(false, false);
        buttonWithCounterView.setSubText(null, true);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener(this) {
            public final PostsSearchContainer f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        PostsSearchContainer postsSearchContainer = this.f$0;
                        postsSearchContainer.getClass();
                        postsSearchContainer.fragment.presentFragment(new PremiumPreviewFragment(0, "search"));
                        break;
                    case 1:
                        PostsSearchContainer postsSearchContainer2 = this.f$0;
                        postsSearchContainer2.emptyButton.setLoading(true);
                        postsSearchContainer2.load(true);
                        break;
                    default:
                        PostsSearchContainer postsSearchContainer3 = this.f$0;
                        postsSearchContainer3.emptyButton.setLoading(true);
                        postsSearchContainer3.load(false);
                        break;
                }
            }
        });
        if (this.flood == null) {
            textView3.setVisibility(8);
            return;
        }
        textView3.setVisibility(0);
        TLRPC.SearchPostsFlood searchPostsFlood3 = this.flood;
        int i12 = searchPostsFlood3.remains;
        if (i12 < 1) {
            i12 = searchPostsFlood3.total_daily;
        }
        textView3.setText(LocaleController.formatPluralStringComma("SearchPostsFreeSearches", i12));
    }
}
