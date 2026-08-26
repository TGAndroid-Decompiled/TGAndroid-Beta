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
import org.telegram.ui.Components.ColorPicker;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda28;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda1;

public final class CommunityInviteOnlySheet extends BottomSheetWithRecyclerListView {
    public UniversalAdapter adapter;
    public final ColorPicker.AnonymousClass1 cell;

    public CommunityInviteOnlySheet(Context context, TLRPC.Chat chat, Runnable runnable) {
        super(context, null, false, true, false, false, false, 2, null);
        this.headerMoveTop = AndroidUtilities.dp(30.0f);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i, 0, i, AndroidUtilities.dp(130.0f) + AndroidUtilities.navigationBarHeight);
        this.recyclerListView.setClipToPadding(false);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, this.resourcesProvider, true);
        buttonWithCounterView.setText(LocaleController.getString(R.string.Cancel));
        buttonWithCounterView.setNeutral();
        buttonWithCounterView.setRoundRadius(24);
        buttonWithCounterView.setOnClickListener(new BotAdView$$ExternalSyntheticLambda1(this, 9));
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, this.resourcesProvider, true);
        buttonWithCounterView2.setText(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.CommunityInviteOnlyChannelMessageOwner : R.string.CommunityInviteOnlyGroupMessageOwner));
        buttonWithCounterView2.setRoundRadius(24);
        buttonWithCounterView2.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda28(7, this, runnable));
        ColorPicker.AnonymousClass1 anonymousClass1 = new ColorPicker.AnonymousClass1(context);
        this.cell = anonymousClass1;
        anonymousClass1.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(17.0f));
        BackupImageView backupImageView = (BackupImageView) anonymousClass1.rect;
        backupImageView.imageReceiver.setForUserOrChat(chat, new AvatarDrawable(chat));
        backupImageView.onNewImageSet();
        TextView textView = (TextView) anonymousClass1.paint;
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
        this.containerView.addView(buttonWithCounterView2, LayoutHelper.createFrameMarginPx(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(70.0f) + AndroidUtilities.navigationBarHeight));
        this.containerView.addView(buttonWithCounterView, LayoutHelper.createFrameMarginPx(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.adapter.update(false);
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new TodoItemMenu$$ExternalSyntheticLambda17(this, 17), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.applyBackground = false;
        return universalAdapter;
    }

    @Override
    public final CharSequence getTitle() {
        return null;
    }
}
