package org.telegram.ui.community.sheet;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class CommunityInviteOnlySheet extends BottomSheetWithRecyclerListView {
    private UniversalAdapter adapter;
    private ButtonWithCounterView cancelButton;
    private CommunityPendingInviteOnlyCell cell;
    private ButtonWithCounterView messageButton;

    @Override
    protected CharSequence getTitle() {
        return null;
    }

    public CommunityInviteOnlySheet(Context context, TLRPC.Chat chat, TLRPC.User user, final Runnable runnable) {
        int i;
        int i2;
        super(context, null, false, true, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, null);
        this.headerMoveTop = AndroidUtilities.dp(30.0f);
        RecyclerListView recyclerListView = this.recyclerListView;
        int i3 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i3, 0, i3, AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(130.0f));
        this.recyclerListView.setClipToPadding(false);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, this.resourcesProvider);
        this.cancelButton = buttonWithCounterView;
        buttonWithCounterView.setText(LocaleController.getString(R.string.Cancel));
        this.cancelButton.setNeutral();
        this.cancelButton.setRound();
        this.cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$0(view);
            }
        });
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, this.resourcesProvider);
        this.messageButton = buttonWithCounterView2;
        if (zIsChannelAndNotMegaGroup) {
            i = R.string.CommunityInviteOnlyChannelMessageOwner;
        } else {
            i = R.string.CommunityInviteOnlyGroupMessageOwner;
        }
        buttonWithCounterView2.setText(LocaleController.getString(i));
        this.messageButton.setRound();
        this.messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$1(runnable, view);
            }
        });
        CommunityPendingInviteOnlyCell communityPendingInviteOnlyCell = new CommunityPendingInviteOnlyCell(context);
        this.cell = communityPendingInviteOnlyCell;
        communityPendingInviteOnlyCell.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(17.0f));
        this.cell.avatarImage.setForUserOrChat(chat, new AvatarDrawable(chat));
        this.cell.titleView.setText(DialogObject.getName(chat));
        TextView textView = this.cell.titleView;
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(getThemedColor(i4));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.mini_ephemeral_hidden_14), 0, 1, 33);
        if (zIsChannelAndNotMegaGroup) {
            i2 = R.string.CommunityInviteOnlyChannelInfo;
        } else {
            i2 = R.string.CommunityInviteOnlyGroupInfo;
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(i2));
        this.cell.textView.setTextColor(getThemedColor(i4));
        this.cell.textView.setText(spannableStringBuilder);
        this.containerView.addView(this.messageButton, LayoutHelper.createFrameMarginPx(-1, 48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(70.0f) + AndroidUtilities.navigationBarHeight));
        this.containerView.addView(this.cancelButton, LayoutHelper.createFrameMarginPx(-1, 48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.adapter.update(false);
    }

    public void lambda$new$0(View view) {
        lambda$new$0();
    }

    public void lambda$new$1(Runnable runnable, View view) {
        runnable.run();
        lambda$new$0();
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asCustom(0, this.cell));
    }

    private static class CommunityPendingInviteOnlyCell extends LinearLayout {
        private final BackupImageView avatarImage;
        private final TextView textView;
        private final TextView titleView;

        public CommunityPendingInviteOnlyCell(Context context) {
            super(context);
            setOrientation(1);
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarImage = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(35.0f));
            addView(backupImageView, LayoutHelper.createLinear(70, 70, 1));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 20.0f);
            textView.setGravity(17);
            addView(textView, LayoutHelper.createLinear(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
            TextView textView2 = new TextView(context);
            this.textView = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            textView2.setGravity(17);
            addView(textView2, LayoutHelper.createLinear(-1, -2));
        }
    }
}
