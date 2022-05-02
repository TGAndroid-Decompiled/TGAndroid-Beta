package org.telegram.p009ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0890R;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C0945ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Cells.AvailableReactionCell;
import org.telegram.p009ui.Cells.HeaderCell;
import org.telegram.p009ui.Cells.TextCheckCell;
import org.telegram.p009ui.Cells.TextInfoPrivacyCell;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.Components.SimpleThemeDescription;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$TL_availableReaction;

public class ChatReactionsEditActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private long chatId;
    private LinearLayout contentView;
    private TLRPC$Chat currentChat;
    private TextCheckCell enableReactionsCell;
    private TLRPC$ChatFull info;
    private RecyclerView.Adapter listAdapter;
    private RecyclerListView listView;
    private List<String> chatReactions = new ArrayList();
    private ArrayList<TLRPC$TL_availableReaction> availableReactions = new ArrayList<>();

    public ChatReactionsEditActivity(Bundle bundle) {
        super(bundle);
        this.chatId = bundle.getLong("chat_id", 0L);
    }

    @Override
    public boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ChatReactionsEditActivity.onFragmentCreate():boolean");
    }

    @Override
    public View createView(final Context context) {
        this.actionBar.setTitle(LocaleController.getString("Reactions", C0890R.string.Reactions));
        this.actionBar.setBackButtonImage(C0890R.C0891drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new C0945ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    ChatReactionsEditActivity.this.finishFragment();
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.availableReactions.addAll(getMediaDataController().getEnabledReactionsList());
        TextCheckCell textCheckCell = new TextCheckCell(context);
        this.enableReactionsCell = textCheckCell;
        textCheckCell.setHeight(56);
        this.enableReactionsCell.setTextAndCheck(LocaleController.getString("EnableReactions", C0890R.string.EnableReactions), true ^ this.chatReactions.isEmpty(), false);
        TextCheckCell textCheckCell2 = this.enableReactionsCell;
        textCheckCell2.setBackgroundColor(Theme.getColor(textCheckCell2.isChecked() ? "windowBackgroundChecked" : "windowBackgroundUnchecked"));
        this.enableReactionsCell.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.enableReactionsCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatReactionsEditActivity.this.lambda$createView$0(view);
            }
        });
        linearLayout.addView(this.enableReactionsCell, LayoutHelper.createLinear(-1, -2));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setLayoutManager(new LinearLayoutManager(context));
        RecyclerListView recyclerListView2 = this.listView;
        RecyclerView.Adapter adapter = new RecyclerView.Adapter() {
            @Override
            public int getItemViewType(int i) {
                if (i == 0) {
                    return 0;
                }
                return i == 1 ? 1 : 2;
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                if (i == 0) {
                    return new RecyclerListView.Holder(new TextInfoPrivacyCell(context));
                }
                if (i != 1) {
                    return new RecyclerListView.Holder(new AvailableReactionCell(context, false));
                }
                return new RecyclerListView.Holder(new HeaderCell(context, 23));
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                int itemViewType = getItemViewType(i);
                if (itemViewType == 0) {
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    textInfoPrivacyCell.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText4"));
                    textInfoPrivacyCell.setText(ChatObject.isChannelAndNotMegaGroup(ChatReactionsEditActivity.this.currentChat) ? LocaleController.getString("EnableReactionsChannelInfo", C0890R.string.EnableReactionsChannelInfo) : LocaleController.getString("EnableReactionsGroupInfo", C0890R.string.EnableReactionsGroupInfo));
                } else if (itemViewType == 1) {
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    headerCell.setText(LocaleController.getString("AvailableReactions", C0890R.string.AvailableReactions));
                    headerCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                } else if (itemViewType == 2) {
                    TLRPC$TL_availableReaction tLRPC$TL_availableReaction = (TLRPC$TL_availableReaction) ChatReactionsEditActivity.this.availableReactions.get(i - 2);
                    ((AvailableReactionCell) viewHolder.itemView).bind(tLRPC$TL_availableReaction, ChatReactionsEditActivity.this.chatReactions.contains(tLRPC$TL_availableReaction.reaction));
                }
            }

            @Override
            public int getItemCount() {
                return (!ChatReactionsEditActivity.this.chatReactions.isEmpty() ? ChatReactionsEditActivity.this.availableReactions.size() + 1 : 0) + 1;
            }
        };
        this.listAdapter = adapter;
        recyclerListView2.setAdapter(adapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                ChatReactionsEditActivity.this.lambda$createView$1(view, i);
            }
        });
        linearLayout.addView(this.listView, LayoutHelper.createLinear(-1, 0, 1.0f));
        this.contentView = linearLayout;
        this.fragmentView = linearLayout;
        updateColors();
        return this.contentView;
    }

    public void lambda$createView$0(View view) {
        setCheckedEnableReactionCell(!this.enableReactionsCell.isChecked());
    }

    public void lambda$createView$1(View view, int i) {
        if (i > 1) {
            AvailableReactionCell availableReactionCell = (AvailableReactionCell) view;
            TLRPC$TL_availableReaction tLRPC$TL_availableReaction = this.availableReactions.get(i - 2);
            boolean z = !this.chatReactions.contains(tLRPC$TL_availableReaction.reaction);
            if (z) {
                this.chatReactions.add(tLRPC$TL_availableReaction.reaction);
            } else {
                this.chatReactions.remove(tLRPC$TL_availableReaction.reaction);
                if (this.chatReactions.isEmpty()) {
                    setCheckedEnableReactionCell(false);
                }
            }
            availableReactionCell.setChecked(z, true);
        }
    }

    private void setCheckedEnableReactionCell(boolean z) {
        if (this.enableReactionsCell.isChecked() != z) {
            this.enableReactionsCell.setChecked(z);
            int color = Theme.getColor(z ? "windowBackgroundChecked" : "windowBackgroundUnchecked");
            if (z) {
                this.enableReactionsCell.setBackgroundColorAnimated(z, color);
            } else {
                this.enableReactionsCell.setBackgroundColorAnimatedReverse(color);
            }
            if (z) {
                Iterator<TLRPC$TL_availableReaction> it = this.availableReactions.iterator();
                while (it.hasNext()) {
                    this.chatReactions.add(it.next().reaction);
                }
                this.listAdapter.notifyItemRangeInserted(1, this.availableReactions.size() + 1);
                return;
            }
            this.chatReactions.clear();
            this.listAdapter.notifyItemRangeRemoved(1, this.availableReactions.size() + 1);
        }
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        TLRPC$ChatFull tLRPC$ChatFull = this.info;
        boolean z = true;
        if (tLRPC$ChatFull != null) {
            z = true ^ tLRPC$ChatFull.available_reactions.equals(this.chatReactions);
        }
        if (z) {
            getMessagesController().setChatReactions(this.chatId, this.chatReactions);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
    }

    public void setInfo(TLRPC$ChatFull tLRPC$ChatFull) {
        this.info = tLRPC$ChatFull;
        if (tLRPC$ChatFull != null) {
            if (this.currentChat == null) {
                this.currentChat = getMessagesController().getChat(Long.valueOf(this.chatId));
            }
            this.chatReactions = new ArrayList(tLRPC$ChatFull.available_reactions);
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        return SimpleThemeDescription.createThemeDescriptions(new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                ChatReactionsEditActivity.this.updateColors();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        }, "windowBackgroundWhite", "windowBackgroundWhiteBlackText", "windowBackgroundWhiteGrayText2", "listSelectorSDK21", "windowBackgroundGray", "windowBackgroundWhiteGrayText4", "windowBackgroundWhiteRedText4", "windowBackgroundChecked", "windowBackgroundCheckText", "switchTrackBlue", "switchTrackBlueChecked", "switchTrackBlueThumb", "switchTrackBlueThumbChecked");
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void updateColors() {
        this.contentView.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
        this.enableReactionsCell.setColors("windowBackgroundCheckText", "switchTrackBlue", "switchTrackBlueChecked", "switchTrackBlueThumb", "switchTrackBlueThumbChecked");
        this.listAdapter.notifyDataSetChanged();
    }

    @Override
    @SuppressLint({"NotifyDataSetChanged"})
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i2 == this.currentAccount && i == NotificationCenter.reactionsDidLoad) {
            this.availableReactions.clear();
            this.availableReactions.addAll(getMediaDataController().getEnabledReactionsList());
            this.listAdapter.notifyDataSetChanged();
        }
    }
}
