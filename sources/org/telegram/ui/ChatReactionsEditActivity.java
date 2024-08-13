package org.telegram.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$ChatReactions;
import org.telegram.tgnet.TLRPC$TL_availableReaction;
import org.telegram.tgnet.TLRPC$TL_chatReactionsAll;
import org.telegram.tgnet.TLRPC$TL_chatReactionsNone;
import org.telegram.tgnet.TLRPC$TL_chatReactionsSome;
import org.telegram.tgnet.TLRPC$TL_reactionEmoji;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.AvailableReactionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.RadioCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SimpleThemeDescription;
public class ChatReactionsEditActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private RadioCell allReactions;
    private ArrayList<TLRPC$TL_availableReaction> availableReactions;
    private long chatId;
    private List<String> chatReactions;
    private LinearLayout contentView;
    LinearLayout contorlsLayout;
    private TLRPC$Chat currentChat;
    private RadioCell disableReactions;
    private TextCheckCell enableReactionsCell;
    private TLRPC$ChatFull info;
    boolean isChannel;
    private RecyclerView.Adapter listAdapter;
    private RecyclerListView listView;
    ArrayList<RadioCell> radioCells;
    int selectedType;
    private RadioCell someReactions;
    int startFromType;

    public ChatReactionsEditActivity(Bundle bundle) {
        super(bundle);
        this.chatReactions = new ArrayList();
        this.availableReactions = new ArrayList<>();
        this.selectedType = -1;
        this.radioCells = new ArrayList<>();
        this.chatId = bundle.getLong("chat_id", 0L);
    }

    @Override
    public boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatReactionsEditActivity.onFragmentCreate():boolean");
    }

    @Override
    public View createView(final Context context) {
        this.isChannel = ChatObject.isChannelAndNotMegaGroup(this.chatId, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString("Reactions", R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
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
        if (this.isChannel) {
            TextCheckCell textCheckCell = new TextCheckCell(context);
            this.enableReactionsCell = textCheckCell;
            textCheckCell.setHeight(56);
            this.enableReactionsCell.setTextAndCheck(LocaleController.getString("EnableReactions", R.string.EnableReactions), !this.chatReactions.isEmpty(), false);
            TextCheckCell textCheckCell2 = this.enableReactionsCell;
            textCheckCell2.setBackgroundColor(Theme.getColor(textCheckCell2.isChecked() ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked));
            this.enableReactionsCell.setTypeface(AndroidUtilities.bold());
            this.enableReactionsCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChatReactionsEditActivity.this.lambda$createView$0(view);
                }
            });
            linearLayout.addView(this.enableReactionsCell, LayoutHelper.createLinear(-1, -2));
        }
        HeaderCell headerCell = new HeaderCell(context);
        headerCell.setText(LocaleController.getString("AvailableReactions", R.string.AvailableReactions));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.contorlsLayout = linearLayout2;
        linearLayout2.setOrientation(1);
        RadioCell radioCell = new RadioCell(context);
        this.allReactions = radioCell;
        radioCell.setText(LocaleController.getString("AllReactions", R.string.AllReactions), false, true);
        RadioCell radioCell2 = new RadioCell(context);
        this.someReactions = radioCell2;
        radioCell2.setText(LocaleController.getString("SomeReactions", R.string.SomeReactions), false, true);
        RadioCell radioCell3 = new RadioCell(context);
        this.disableReactions = radioCell3;
        radioCell3.setText(LocaleController.getString("NoReactions", R.string.NoReactions), false, false);
        this.contorlsLayout.addView(headerCell, LayoutHelper.createLinear(-1, -2));
        this.contorlsLayout.addView(this.allReactions, LayoutHelper.createLinear(-1, -2));
        this.contorlsLayout.addView(this.someReactions, LayoutHelper.createLinear(-1, -2));
        this.contorlsLayout.addView(this.disableReactions, LayoutHelper.createLinear(-1, -2));
        this.radioCells.clear();
        this.radioCells.add(this.allReactions);
        this.radioCells.add(this.someReactions);
        this.radioCells.add(this.disableReactions);
        this.allReactions.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatReactionsEditActivity.this.lambda$createView$2(view);
            }
        });
        this.someReactions.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatReactionsEditActivity.this.lambda$createView$4(view);
            }
        });
        this.disableReactions.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatReactionsEditActivity.this.lambda$createView$6(view);
            }
        });
        int i = Theme.key_windowBackgroundWhite;
        headerCell.setBackgroundColor(Theme.getColor(i));
        RadioCell radioCell4 = this.allReactions;
        int color = Theme.getColor(i);
        int i2 = Theme.key_listSelector;
        radioCell4.setBackground(Theme.createSelectorWithBackgroundDrawable(color, Theme.getColor(i2)));
        this.someReactions.setBackground(Theme.createSelectorWithBackgroundDrawable(Theme.getColor(i), Theme.getColor(i2)));
        this.disableReactions.setBackground(Theme.createSelectorWithBackgroundDrawable(Theme.getColor(i), Theme.getColor(i2)));
        setCheckedEnableReactionCell(this.startFromType, false);
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setLayoutManager(new LinearLayoutManager(context));
        RecyclerListView recyclerListView2 = this.listView;
        RecyclerView.Adapter adapter = new RecyclerView.Adapter() {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i3) {
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 3) {
                            return new RecyclerListView.Holder(new AvailableReactionCell(context, false, false));
                        }
                        FrameLayout frameLayout = new FrameLayout(context);
                        if (ChatReactionsEditActivity.this.contorlsLayout.getParent() != null) {
                            ((ViewGroup) ChatReactionsEditActivity.this.contorlsLayout.getParent()).removeView(ChatReactionsEditActivity.this.contorlsLayout);
                        }
                        frameLayout.addView(ChatReactionsEditActivity.this.contorlsLayout);
                        frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                        return new RecyclerListView.Holder(frameLayout);
                    }
                    return new RecyclerListView.Holder(new HeaderCell(context, 23));
                }
                return new RecyclerListView.Holder(new TextInfoPrivacyCell(context));
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i3) {
                int itemViewType = getItemViewType(i3);
                if (itemViewType != 0) {
                    if (itemViewType == 1) {
                        HeaderCell headerCell2 = (HeaderCell) viewHolder.itemView;
                        headerCell2.setText(LocaleController.getString("OnlyAllowThisReactions", R.string.OnlyAllowThisReactions));
                        headerCell2.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                        return;
                    } else if (itemViewType != 2) {
                        return;
                    } else {
                        AvailableReactionCell availableReactionCell = (AvailableReactionCell) viewHolder.itemView;
                        TLRPC$TL_availableReaction tLRPC$TL_availableReaction = (TLRPC$TL_availableReaction) ChatReactionsEditActivity.this.availableReactions.get(i3 - (ChatReactionsEditActivity.this.isChannel ? 2 : 3));
                        availableReactionCell.bind(tLRPC$TL_availableReaction, ChatReactionsEditActivity.this.chatReactions.contains(tLRPC$TL_availableReaction.reaction), ((BaseFragment) ChatReactionsEditActivity.this).currentAccount);
                        return;
                    }
                }
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                textInfoPrivacyCell.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4));
                ChatReactionsEditActivity chatReactionsEditActivity = ChatReactionsEditActivity.this;
                if (chatReactionsEditActivity.isChannel) {
                    textInfoPrivacyCell.setText(ChatObject.isChannelAndNotMegaGroup(chatReactionsEditActivity.currentChat) ? LocaleController.getString("EnableReactionsChannelInfo", R.string.EnableReactionsChannelInfo) : LocaleController.getString("EnableReactionsGroupInfo", R.string.EnableReactionsGroupInfo));
                    return;
                }
                textInfoPrivacyCell.setForeground(Theme.getThemedDrawableByKey(chatReactionsEditActivity.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                int i4 = ChatReactionsEditActivity.this.selectedType;
                if (i4 == 1) {
                    textInfoPrivacyCell.setText(LocaleController.getString("EnableSomeReactionsInfo", R.string.EnableSomeReactionsInfo));
                } else if (i4 == 0) {
                    textInfoPrivacyCell.setText(LocaleController.getString("EnableAllReactionsInfo", R.string.EnableAllReactionsInfo));
                } else if (i4 == 2) {
                    textInfoPrivacyCell.setText(LocaleController.getString("DisableReactionsInfo", R.string.DisableReactionsInfo));
                }
            }

            @Override
            public int getItemCount() {
                ChatReactionsEditActivity chatReactionsEditActivity = ChatReactionsEditActivity.this;
                if (chatReactionsEditActivity.isChannel) {
                    return (chatReactionsEditActivity.chatReactions.isEmpty() ? 0 : ChatReactionsEditActivity.this.availableReactions.size() + 1) + 1;
                }
                return (chatReactionsEditActivity.chatReactions.isEmpty() ? 0 : ChatReactionsEditActivity.this.availableReactions.size() + 1) + 2;
            }

            @Override
            public int getItemViewType(int i3) {
                if (ChatReactionsEditActivity.this.isChannel) {
                    if (i3 == 0) {
                        return 0;
                    }
                    return i3 == 1 ? 1 : 2;
                } else if (i3 == 0) {
                    return 3;
                } else {
                    if (i3 == 1) {
                        return 0;
                    }
                    return i3 == 2 ? 1 : 2;
                }
            }
        };
        this.listAdapter = adapter;
        recyclerListView2.setAdapter(adapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i3) {
                ChatReactionsEditActivity.this.lambda$createView$7(view, i3);
            }
        });
        linearLayout.addView(this.listView, LayoutHelper.createLinear(-1, 0, 1.0f));
        this.contentView = linearLayout;
        this.fragmentView = linearLayout;
        updateColors();
        return this.contentView;
    }

    public void lambda$createView$0(View view) {
        setCheckedEnableReactionCell(this.enableReactionsCell.isChecked() ? 2 : 1, true);
    }

    public void lambda$createView$1() {
        setCheckedEnableReactionCell(0, true);
    }

    public void lambda$createView$2(View view) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatReactionsEditActivity.this.lambda$createView$1();
            }
        });
    }

    public void lambda$createView$3() {
        setCheckedEnableReactionCell(1, true);
    }

    public void lambda$createView$4(View view) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatReactionsEditActivity.this.lambda$createView$3();
            }
        });
    }

    public void lambda$createView$5() {
        setCheckedEnableReactionCell(2, true);
    }

    public void lambda$createView$6(View view) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatReactionsEditActivity.this.lambda$createView$5();
            }
        });
    }

    public void lambda$createView$7(View view, int i) {
        boolean z = this.isChannel;
        if (i <= (z ? 1 : 2)) {
            return;
        }
        AvailableReactionCell availableReactionCell = (AvailableReactionCell) view;
        TLRPC$TL_availableReaction tLRPC$TL_availableReaction = this.availableReactions.get(i - (z ? 2 : 3));
        boolean z2 = !this.chatReactions.contains(tLRPC$TL_availableReaction.reaction);
        if (z2) {
            this.chatReactions.add(tLRPC$TL_availableReaction.reaction);
        } else {
            this.chatReactions.remove(tLRPC$TL_availableReaction.reaction);
            if (this.chatReactions.isEmpty()) {
                RecyclerView.Adapter adapter = this.listAdapter;
                if (adapter != null) {
                    adapter.notifyItemRangeRemoved(this.isChannel ? 1 : 2, this.availableReactions.size() + 1);
                }
                setCheckedEnableReactionCell(2, true);
            }
        }
        availableReactionCell.setChecked(z2, true);
    }

    private void setCheckedEnableReactionCell(int i, boolean z) {
        RecyclerView.Adapter adapter;
        if (this.selectedType == i) {
            return;
        }
        TextCheckCell textCheckCell = this.enableReactionsCell;
        if (textCheckCell != null) {
            boolean z2 = i == 1 || i == 0;
            textCheckCell.setChecked(z2);
            int color = Theme.getColor(z2 ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked);
            if (z2) {
                this.enableReactionsCell.setBackgroundColorAnimated(z2, color);
            } else {
                this.enableReactionsCell.setBackgroundColorAnimatedReverse(color);
            }
        }
        this.selectedType = i;
        int i2 = 0;
        while (i2 < this.radioCells.size()) {
            this.radioCells.get(i2).setChecked(i == i2, z);
            i2++;
        }
        if (i == 1) {
            if (z) {
                this.chatReactions.clear();
                Iterator<TLRPC$TL_availableReaction> it = this.availableReactions.iterator();
                while (it.hasNext()) {
                    TLRPC$TL_availableReaction next = it.next();
                    if (next.reaction.equals("👍") || next.reaction.equals("👎")) {
                        this.chatReactions.add(next.reaction);
                    }
                }
                if (this.chatReactions.isEmpty() && this.availableReactions.size() >= 2) {
                    this.chatReactions.add(this.availableReactions.get(0).reaction);
                    this.chatReactions.add(this.availableReactions.get(1).reaction);
                }
            }
            RecyclerView.Adapter adapter2 = this.listAdapter;
            if (adapter2 != null && z) {
                adapter2.notifyItemRangeInserted(this.isChannel ? 1 : 2, this.availableReactions.size() + 1);
            }
        } else if (!this.chatReactions.isEmpty()) {
            this.chatReactions.clear();
            RecyclerView.Adapter adapter3 = this.listAdapter;
            if (adapter3 != null && z) {
                adapter3.notifyItemRangeRemoved(this.isChannel ? 1 : 2, this.availableReactions.size() + 1);
            }
        }
        if (!this.isChannel && (adapter = this.listAdapter) != null && z) {
            adapter.notifyItemChanged(1);
        }
        RecyclerView.Adapter adapter4 = this.listAdapter;
        if (adapter4 == null || z) {
            return;
        }
        adapter4.notifyDataSetChanged();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.chatId, this.selectedType, this.chatReactions);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
    }

    public void setInfo(TLRPC$ChatFull tLRPC$ChatFull) {
        this.info = tLRPC$ChatFull;
        if (tLRPC$ChatFull != null) {
            if (this.currentChat == null) {
                this.currentChat = getMessagesController().getChat(Long.valueOf(this.chatId));
            }
            this.chatReactions = new ArrayList();
            TLRPC$ChatReactions tLRPC$ChatReactions = tLRPC$ChatFull.available_reactions;
            if (tLRPC$ChatReactions instanceof TLRPC$TL_chatReactionsAll) {
                this.startFromType = 0;
            } else if (tLRPC$ChatReactions instanceof TLRPC$TL_chatReactionsNone) {
                this.startFromType = 2;
            } else if (tLRPC$ChatReactions instanceof TLRPC$TL_chatReactionsSome) {
                TLRPC$TL_chatReactionsSome tLRPC$TL_chatReactionsSome = (TLRPC$TL_chatReactionsSome) tLRPC$ChatReactions;
                for (int i = 0; i < tLRPC$TL_chatReactionsSome.reactions.size(); i++) {
                    if (tLRPC$TL_chatReactionsSome.reactions.get(i) instanceof TLRPC$TL_reactionEmoji) {
                        this.chatReactions.add(((TLRPC$TL_reactionEmoji) tLRPC$TL_chatReactionsSome.reactions.get(i)).emoticon);
                    }
                }
                this.startFromType = 1;
            }
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
        }, Theme.key_windowBackgroundWhite, Theme.key_windowBackgroundWhiteBlackText, Theme.key_windowBackgroundWhiteGrayText2, Theme.key_listSelector, Theme.key_windowBackgroundGray, Theme.key_windowBackgroundWhiteGrayText4, Theme.key_text_RedRegular, Theme.key_windowBackgroundChecked, Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void updateColors() {
        this.contentView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        TextCheckCell textCheckCell = this.enableReactionsCell;
        if (textCheckCell != null) {
            textCheckCell.setColors(Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
        }
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
