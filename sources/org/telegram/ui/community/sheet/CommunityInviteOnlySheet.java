package org.telegram.ui.community.sheet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Stories.LiveCommentsView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda2;
import org.telegram.ui.bots.BotDownloads$$ExternalSyntheticLambda0;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda20;

public final class CommunityInviteOnlySheet extends BottomSheetWithRecyclerListView {
    public UniversalAdapter adapter;
    public final LiveCommentsView.LiveCommentView.AnonymousClass1 cell;

    public CommunityInviteOnlySheet(Context context, TLRPC.Chat chat, Runnable runnable) {
        super(context, null, false, true, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, null);
        this.headerMoveTop = AndroidUtilities.dp(30.0f);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i, 0, i, AndroidUtilities.dp(130.0f) + AndroidUtilities.navigationBarHeight);
        this.recyclerListView.setClipToPadding(false);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, this.resourcesProvider);
        buttonWithCounterView.setText(LocaleController.getString(R.string.Cancel));
        buttonWithCounterView.setNeutral();
        buttonWithCounterView.setRound();
        buttonWithCounterView.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(this, 27));
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, true, this.resourcesProvider);
        buttonWithCounterView2.setText(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.CommunityInviteOnlyChannelMessageOwner : R.string.CommunityInviteOnlyGroupMessageOwner));
        buttonWithCounterView2.setRound();
        buttonWithCounterView2.setOnClickListener(new RichEditor$$ExternalSyntheticLambda20(23, this, runnable));
        LiveCommentsView.LiveCommentView.AnonymousClass1 anonymousClass1 = new LiveCommentsView.LiveCommentView.AnonymousClass1(context);
        this.cell = anonymousClass1;
        anonymousClass1.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(17.0f));
        ((BackupImageView) anonymousClass1.particles).setForUserOrChat(chat, new AvatarDrawable(chat));
        TextView textView = (TextView) anonymousClass1.clipPath;
        textView.setText(DialogObject.getName(chat));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(getThemedColor(i2));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.mini_ephemeral_hidden_14), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.CommunityInviteOnlyChannelInfo : R.string.CommunityInviteOnlyGroupInfo));
        TextView textView2 = (TextView) anonymousClass1.this$0;
        textView2.setTextColor(getThemedColor(i2));
        textView2.setText(spannableStringBuilder);
        this.containerView.addView(buttonWithCounterView2, LayoutHelper.createFrameMarginPx(-1, 48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(70.0f) + AndroidUtilities.navigationBarHeight));
        this.containerView.addView(buttonWithCounterView, LayoutHelper.createFrameMarginPx(-1, 48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.adapter.update(false);
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new BotDownloads$$ExternalSyntheticLambda0(this, 16), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    @Override
    public final CharSequence getTitle() {
        return null;
    }
}
