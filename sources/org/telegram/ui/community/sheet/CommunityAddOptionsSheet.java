package org.telegram.ui.community.sheet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
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
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class CommunityAddOptionsSheet extends BottomSheetWithRecyclerListView {
    private UniversalAdapter adapter;
    private final FrameLayout cell;
    private final TLRPC.Chat chat;
    private final boolean isBot;
    private final boolean isChannel;
    private boolean isHidden;
    private final ProfileSearchCell searchCell;
    private final TLRPC.User user;
    private int visibleRow;

    public CommunityAddOptionsSheet(Context context, final TLRPC.Chat chat, long j, final Utilities.Callback callback) {
        int i;
        ButtonWithCounterView buttonWithCounterView;
        int i2;
        super(context, null, false, true, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, null);
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
        this.user = user;
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
        this.chat = chat2;
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
        ProfileSearchCell profileSearchCell = new ProfileSearchCell(context);
        this.searchCell = profileSearchCell;
        if (chat2 != null) {
            profileSearchCell.setData(chat2, null, chat2.title, LocaleController.formatPluralStringSpaced("Members", chat2.participants_count), false, false);
        } else {
            if (user != null) {
                i = -1;
                profileSearchCell.setData(user, null, DialogObject.getName(user), LocaleController.getString(R.string.Bot), false, false);
            }
            frameLayout.addView(profileSearchCell, LayoutHelper.createFrame(i, -2.0f));
            RecyclerListView recyclerListView = this.recyclerListView;
            int i3 = this.backgroundPaddingLeft;
            recyclerListView.setPadding(i3, 0, i3, AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(64.0f));
            this.recyclerListView.setSections();
            this.recyclerListView.setClipToPadding(false);
            this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i4) {
                    this.f$0.lambda$new$0(view, i4);
                }
            });
            buttonWithCounterView = new ButtonWithCounterView(context, this.resourcesProvider);
            if (chat != null) {
                if (ChatObject.canAddChatToCommunity(chat)) {
                    i2 = R.string.CommunityAddToCommunityButton;
                } else {
                    i2 = R.string.CommunityAddToCommunityRequestButton;
                }
                buttonWithCounterView.setText(LocaleController.getString(i2));
            } else {
                buttonWithCounterView.setText(LocaleController.getString(R.string.CommunityCreateCommunity));
            }
            buttonWithCounterView.setRound();
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$1(callback, chat, view);
                }
            });
            this.containerView.addView(buttonWithCounterView, LayoutHelper.createFrameMarginPx(-1, 48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
            this.adapter.update(false);
        }
        i = -1;
        frameLayout.addView(profileSearchCell, LayoutHelper.createFrame(i, -2.0f));
        RecyclerListView recyclerListView2 = this.recyclerListView;
        int i4 = this.backgroundPaddingLeft;
        recyclerListView2.setPadding(i4, 0, i4, AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(64.0f));
        this.recyclerListView.setSections();
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i5) {
                this.f$0.lambda$new$0(view, i5);
            }
        });
        buttonWithCounterView = new ButtonWithCounterView(context, this.resourcesProvider);
        if (chat != null) {
            if (ChatObject.canAddChatToCommunity(chat)) {
                i2 = R.string.CommunityAddToCommunityButton;
            } else {
                i2 = R.string.CommunityAddToCommunityRequestButton;
            }
            buttonWithCounterView.setText(LocaleController.getString(i2));
        } else {
            buttonWithCounterView.setText(LocaleController.getString(R.string.CommunityCreateCommunity));
        }
        buttonWithCounterView.setRound();
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$1(callback, chat, view);
            }
        });
        this.containerView.addView(buttonWithCounterView, LayoutHelper.createFrameMarginPx(-1, 48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.adapter.update(false);
    }

    public void lambda$new$0(View view, int i) {
        int i2 = this.adapter.getItem(i - 1).id;
        if (i2 == 151) {
            setIsHidden(false);
        } else if (i2 == 150) {
            setIsHidden(true);
        }
    }

    public void lambda$new$1(Utilities.Callback callback, TLRPC.Chat chat, View view) {
        apply(callback, this.isHidden, (chat == null || ChatObject.canAddChatToCommunity(chat)) ? false : true);
    }

    private void apply(final Utilities.Callback callback, final boolean z, boolean z2) {
        int i;
        if (z2 && !z && !this.isBot) {
            Context context = getContext();
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            String string = LocaleController.getString(R.string.CommunityAddToCommunityTitle);
            if (this.isChannel) {
                i = R.string.CommunityAddToCommunityChannelMessage;
            } else {
                i = R.string.CommunityAddToCommunityGroupMessage;
            }
            AlertsCreator.showSimpleConfirmAlert(context, resourcesProvider, string, LocaleController.getString(i), LocaleController.getString(R.string.Add), false, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$apply$2(callback, z);
                }
            });
            return;
        }
        callback.run(Boolean.valueOf(z));
        lambda$new$0();
    }

    public void lambda$apply$2(Utilities.Callback callback, boolean z) {
        apply(callback, z, false);
    }

    private void setIsHidden(boolean z) {
        boolean z2;
        if (this.isHidden == z) {
            return;
        }
        this.isHidden = z;
        View viewFindViewByPosition = this.recyclerListView.findViewByPosition(this.visibleRow + 1);
        if (viewFindViewByPosition instanceof RadioButtonCell) {
            ((RadioButtonCell) viewFindViewByPosition).setChecked(!z, true);
            z2 = false;
        } else {
            z2 = true;
        }
        View viewFindViewByPosition2 = this.recyclerListView.findViewByPosition(this.visibleRow + 2);
        if (viewFindViewByPosition2 instanceof RadioButtonCell) {
            ((RadioButtonCell) viewFindViewByPosition2).setChecked(z, true);
        } else {
            z2 = true;
        }
        if (z2) {
            this.adapter.update(true);
        }
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString(this.isBot ? R.string.CommunityAddBotTitle : R.string.CommunityAddChatTitle);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, false, new Utilities.Callback2() {
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
        arrayList.add(UItem.asSpace(0, AndroidUtilities.dp(12.0f)));
        arrayList.add(UItem.asCustom(1, this.cell));
        arrayList.add(UItem.asSpace(2, AndroidUtilities.dp(12.0f)));
        arrayList.add(UItem.asHeader(3, LocaleController.getString(R.string.CommunityChatVisibilitySection)));
        this.visibleRow = arrayList.size();
        arrayList.add(UItem.asRadio2(151, LocaleController.getString(R.string.CommunityChatVisibilityVisible), LocaleController.getString(this.isBot ? R.string.CommunityChatVisibilityVisibleBotInfo : R.string.CommunityChatVisibilityVisibleInfo)).setChecked(!this.isHidden));
        arrayList.add(UItem.asRadio2(150, LocaleController.getString(R.string.CommunityChatVisibilityHidden), LocaleController.getString(this.isBot ? R.string.CommunityChatVisibilityHiddenBotInfo : R.string.CommunityChatVisibilityHiddenInfo)).setChecked(this.isHidden));
        arrayList.add(UItem.asShadow(6, LocaleController.getString(R.string.CommunityChatVisibilityCannotChange)));
    }
}
