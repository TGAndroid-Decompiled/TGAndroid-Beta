package org.telegram.ui.community.sheet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.RadioButtonCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Stars.GiftOfferSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TON.TONIntroActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.bots.BotDownloads$$ExternalSyntheticLambda0;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda8;

public final class CommunityAddOptionsSheet extends BottomSheetWithRecyclerListView {
    public UniversalAdapter adapter;
    public final FrameLayout cell;
    public final boolean isBot;
    public final boolean isChannel;
    public boolean isHidden;
    public int visibleRow;

    public CommunityAddOptionsSheet(Context context, TLRPC.Chat chat, long j, Utilities.Callback callback) {
        super(context, null, false, true, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, null);
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
        this.isBot = UserObject.isBot(user);
        this.isChannel = ChatObject.isChannelAndNotMegaGroup(chat2);
        this.ignoreTouchActionBar = false;
        this.headerMoveTop = AndroidUtilities.dp(12.0f);
        this.actionBar.setTitle(getTitle());
        setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider));
        FrameLayout frameLayout = new FrameLayout(context);
        this.cell = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
        frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        ProfileSearchCell profileSearchCell = new ProfileSearchCell(context, null);
        if (chat2 != null) {
            profileSearchCell.setData(chat2, null, chat2.title, LocaleController.formatPluralStringSpaced("Members", chat2.participants_count), false, false);
        } else if (user != null) {
            profileSearchCell.setData(user, null, DialogObject.getName(user), LocaleController.getString(R.string.Bot), false, false);
        }
        frameLayout.addView(profileSearchCell, LayoutHelper.createFrame(-1, -2.0f));
        RecyclerListView recyclerListView = this.recyclerListView;
        int i = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i, 0, i, AndroidUtilities.dp(64.0f) + AndroidUtilities.navigationBarHeight);
        this.recyclerListView.setSections();
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setOnItemClickListener(new TONIntroActivity$$ExternalSyntheticLambda3(this, 18));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, this.resourcesProvider);
        if (chat != null) {
            buttonWithCounterView.setText(LocaleController.getString(ChatObject.canAddChatToCommunity(chat) ? R.string.CommunityAddToCommunityButton : R.string.CommunityAddToCommunityRequestButton));
        } else {
            buttonWithCounterView.setText(LocaleController.getString(R.string.CommunityCreateCommunity));
        }
        buttonWithCounterView.setRound();
        buttonWithCounterView.setOnClickListener(new GiftOfferSheet$$ExternalSyntheticLambda2(this, callback, chat, 16));
        this.containerView.addView(buttonWithCounterView, LayoutHelper.createFrameMarginPx(-1, 48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.adapter.update(false);
    }

    public final void apply(Utilities.Callback callback, boolean z, boolean z2) {
        if (z2 && !z && !this.isBot) {
            AlertsCreator.showSimpleConfirmAlert(getContext(), this.resourcesProvider, LocaleController.getString(R.string.CommunityAddToCommunityTitle), LocaleController.getString(this.isChannel ? R.string.CommunityAddToCommunityChannelMessage : R.string.CommunityAddToCommunityGroupMessage), LocaleController.getString(R.string.Add), false, new EglRenderer$$ExternalSyntheticLambda8(this, callback, z, 13));
        } else {
            callback.run(Boolean.valueOf(z));
            lambda$showGiftOfferSheet$15();
        }
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, false, new BotDownloads$$ExternalSyntheticLambda0(this, 15), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(this.isBot ? R.string.CommunityAddBotTitle : R.string.CommunityAddChatTitle);
    }

    public final void setIsHidden(boolean z) {
        boolean z2;
        if (this.isHidden == z) {
            return;
        }
        this.isHidden = z;
        View viewFindViewByPosition = this.recyclerListView.findViewByPosition(this.visibleRow + 1);
        if (viewFindViewByPosition instanceof RadioButtonCell) {
            ((RadioButtonCell) viewFindViewByPosition).radioButton.setChecked(!z, true);
            z2 = false;
        } else {
            z2 = true;
        }
        View viewFindViewByPosition2 = this.recyclerListView.findViewByPosition(this.visibleRow + 2);
        if (viewFindViewByPosition2 instanceof RadioButtonCell) {
            ((RadioButtonCell) viewFindViewByPosition2).radioButton.setChecked(z, true);
        } else {
            z2 = true;
        }
        if (z2) {
            this.adapter.update(true);
        }
    }
}
