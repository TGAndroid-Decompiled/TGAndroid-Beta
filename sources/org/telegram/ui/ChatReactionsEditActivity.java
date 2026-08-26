package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.AvailableReactionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.RadioCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SimpleThemeDescription;
import org.telegram.ui.Components.Switch;

public class ChatReactionsEditActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public static final String KEY_CHAT_ID = "chat_id";
    public static final int SELECT_TYPE_ALL = 0;
    public static final int SELECT_TYPE_NONE = 2;
    public static final int SELECT_TYPE_SOME = 1;
    private static final int TYPE_CONTROLS_CONTAINER = 3;
    private static final int TYPE_HEADER = 1;
    private static final int TYPE_INFO = 0;
    private static final int TYPE_REACTION = 2;
    private RadioCell allReactions;
    private ArrayList<TLRPC.TL_availableReaction> availableReactions;
    private long chatId;
    private List<String> chatReactions;
    private LinearLayout contentView;
    LinearLayout contorlsLayout;
    private TLRPC.Chat currentChat;
    private RadioCell disableReactions;
    private TextCheckCell enableReactionsCell;
    private TLRPC.ChatFull info;
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

    public void lambda$createView$0(View view) {
        setCheckedEnableReactionCell(this.enableReactionsCell.isChecked() ? 2 : 1, true);
    }

    public void lambda$createView$1() {
        setCheckedEnableReactionCell(0, true);
    }

    public void lambda$createView$2(View view) {
        AndroidUtilities.runOnUIThread(new ChatReactionsEditActivity$$ExternalSyntheticLambda0(this, 0));
    }

    public void lambda$createView$3() {
        setCheckedEnableReactionCell(1, true);
    }

    public void lambda$createView$4(View view) {
        AndroidUtilities.runOnUIThread(new ChatReactionsEditActivity$$ExternalSyntheticLambda0(this, 1));
    }

    public void lambda$createView$5() {
        setCheckedEnableReactionCell(2, true);
    }

    public void lambda$createView$6(View view) {
        AndroidUtilities.runOnUIThread(new ChatReactionsEditActivity$$ExternalSyntheticLambda0(this, 2));
    }

    public void lambda$createView$7(View view, int i) {
        boolean z = this.isChannel;
        if (i <= (z ? 1 : 2)) {
            return;
        }
        AvailableReactionCell availableReactionCell = (AvailableReactionCell) view;
        TLRPC.TL_availableReaction tL_availableReaction = this.availableReactions.get(i - (z ? 2 : 3));
        boolean zContains = this.chatReactions.contains(tL_availableReaction.reaction);
        boolean z2 = !zContains;
        if (zContains) {
            this.chatReactions.remove(tL_availableReaction.reaction);
            if (this.chatReactions.isEmpty()) {
                RecyclerView.Adapter adapter = this.listAdapter;
                if (adapter != null) {
                    adapter.notifyItemRangeRemoved(this.isChannel ? 1 : 2, this.availableReactions.size() + 1);
                }
                setCheckedEnableReactionCell(2, true);
            }
        } else {
            this.chatReactions.add(tL_availableReaction.reaction);
        }
        Switch r7 = availableReactionCell.switchView;
        if (r7 != null) {
            r7.setChecked(z2, true);
        }
        CheckBox2 checkBox2 = availableReactionCell.checkBox;
        if (checkBox2 != null) {
            checkBox2.setChecked(z2, true);
        }
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
            int color = Theme.getColor(null, z2 ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked, false);
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
                ArrayList<TLRPC.TL_availableReaction> arrayList = this.availableReactions;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    TLRPC.TL_availableReaction tL_availableReaction = arrayList.get(i3);
                    i3++;
                    TLRPC.TL_availableReaction tL_availableReaction2 = tL_availableReaction;
                    if (tL_availableReaction2.reaction.equals("👍") || tL_availableReaction2.reaction.equals("👎")) {
                        this.chatReactions.add(tL_availableReaction2.reaction);
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
            adapter.lambda$onBindViewHolder$31(1);
        }
        RecyclerView.Adapter adapter4 = this.listAdapter;
        if (adapter4 == null || z) {
            return;
        }
        adapter4.notifyDataSetChanged();
    }

    public void updateColors() {
        this.contentView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        TextCheckCell textCheckCell = this.enableReactionsCell;
        if (textCheckCell != null) {
            textCheckCell.setColors(Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
        }
        this.listAdapter.notifyDataSetChanged();
    }

    @Override
    public View createView(final Context context) {
        this.isChannel = ChatObject.isChannelAndNotMegaGroup(this.chatId, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
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
            this.enableReactionsCell.setTextAndCheck(LocaleController.getString(R.string.EnableReactions), !this.chatReactions.isEmpty(), false);
            TextCheckCell textCheckCell2 = this.enableReactionsCell;
            textCheckCell2.setBackgroundColor(Theme.getColor(null, textCheckCell2.isChecked() ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked, false));
            this.enableReactionsCell.setTypeface(AndroidUtilities.bold());
            final int i = 0;
            this.enableReactionsCell.setOnClickListener(new View.OnClickListener(this) {
                public final ChatReactionsEditActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$createView$0(view);
                            break;
                        case 1:
                            this.f$0.lambda$createView$2(view);
                            break;
                        case 2:
                            this.f$0.lambda$createView$4(view);
                            break;
                        default:
                            this.f$0.lambda$createView$6(view);
                            break;
                    }
                }
            });
            linearLayout.addView(this.enableReactionsCell, LayoutHelper.createLinear(-1, -2));
        }
        HeaderCell headerCell = new HeaderCell(context);
        headerCell.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.contorlsLayout = linearLayout2;
        linearLayout2.setOrientation(1);
        RadioCell radioCell = new RadioCell(context, null);
        this.allReactions = radioCell;
        radioCell.setText(LocaleController.getString(R.string.AllReactions), false, true);
        RadioCell radioCell2 = new RadioCell(context, null);
        this.someReactions = radioCell2;
        radioCell2.setText(LocaleController.getString(R.string.SomeReactions), false, true);
        RadioCell radioCell3 = new RadioCell(context, null);
        this.disableReactions = radioCell3;
        radioCell3.setText(LocaleController.getString(R.string.NoReactions), false, false);
        this.contorlsLayout.addView(headerCell, LayoutHelper.createLinear(-1, -2));
        this.contorlsLayout.addView(this.allReactions, LayoutHelper.createLinear(-1, -2));
        this.contorlsLayout.addView(this.someReactions, LayoutHelper.createLinear(-1, -2));
        this.contorlsLayout.addView(this.disableReactions, LayoutHelper.createLinear(-1, -2));
        this.radioCells.clear();
        this.radioCells.add(this.allReactions);
        this.radioCells.add(this.someReactions);
        this.radioCells.add(this.disableReactions);
        final int i2 = 1;
        this.allReactions.setOnClickListener(new View.OnClickListener(this) {
            public final ChatReactionsEditActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$createView$0(view);
                        break;
                    case 1:
                        this.f$0.lambda$createView$2(view);
                        break;
                    case 2:
                        this.f$0.lambda$createView$4(view);
                        break;
                    default:
                        this.f$0.lambda$createView$6(view);
                        break;
                }
            }
        });
        final int i3 = 2;
        this.someReactions.setOnClickListener(new View.OnClickListener(this) {
            public final ChatReactionsEditActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$createView$0(view);
                        break;
                    case 1:
                        this.f$0.lambda$createView$2(view);
                        break;
                    case 2:
                        this.f$0.lambda$createView$4(view);
                        break;
                    default:
                        this.f$0.lambda$createView$6(view);
                        break;
                }
            }
        });
        final int i4 = 3;
        this.disableReactions.setOnClickListener(new View.OnClickListener(this) {
            public final ChatReactionsEditActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        this.f$0.lambda$createView$0(view);
                        break;
                    case 1:
                        this.f$0.lambda$createView$2(view);
                        break;
                    case 2:
                        this.f$0.lambda$createView$4(view);
                        break;
                    default:
                        this.f$0.lambda$createView$6(view);
                        break;
                }
            }
        });
        int i5 = Theme.key_windowBackgroundWhite;
        headerCell.setBackgroundColor(Theme.getColor(null, i5, false));
        RadioCell radioCell4 = this.allReactions;
        int color = Theme.getColor(null, i5, false);
        int i6 = Theme.key_listSelector;
        radioCell4.setBackground(Theme.createSelectorWithBackgroundDrawable(color, Theme.getColor(null, i6, false)));
        this.someReactions.setBackground(Theme.createSelectorWithBackgroundDrawable(Theme.getColor(null, i5, false), Theme.getColor(null, i6, false)));
        this.disableReactions.setBackground(Theme.createSelectorWithBackgroundDrawable(Theme.getColor(null, i5, false), Theme.getColor(null, i6, false)));
        setCheckedEnableReactionCell(this.startFromType, false);
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        CacheChatsExceptionsFragment$$ExternalSyntheticOutline0.m(1, recyclerListView, false);
        RecyclerListView recyclerListView2 = this.listView;
        RecyclerView.Adapter adapter = new RecyclerView.Adapter() {
            @Override
            public int getItemCount() {
                ChatReactionsEditActivity chatReactionsEditActivity = ChatReactionsEditActivity.this;
                if (chatReactionsEditActivity.isChannel) {
                    return (chatReactionsEditActivity.chatReactions.isEmpty() ? 0 : ChatReactionsEditActivity.this.availableReactions.size() + 1) + 1;
                }
                return (chatReactionsEditActivity.chatReactions.isEmpty() ? 0 : ChatReactionsEditActivity.this.availableReactions.size() + 1) + 2;
            }

            @Override
            public int getItemViewType(int i7) {
                if (ChatReactionsEditActivity.this.isChannel) {
                    if (i7 == 0) {
                        return 0;
                    }
                    return i7 == 1 ? 1 : 2;
                }
                if (i7 == 0) {
                    return 3;
                }
                if (i7 == 1) {
                    return 0;
                }
                return i7 == 2 ? 1 : 2;
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
                int itemViewType = getItemViewType(i7);
                if (itemViewType != 0) {
                    if (itemViewType == 1) {
                        HeaderCell headerCell2 = (HeaderCell) viewHolder.itemView;
                        headerCell2.setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
                        headerCell2.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                        return;
                    } else {
                        if (itemViewType != 2) {
                            return;
                        }
                        AvailableReactionCell availableReactionCell = (AvailableReactionCell) viewHolder.itemView;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ChatReactionsEditActivity.this.availableReactions.get(i7 - (ChatReactionsEditActivity.this.isChannel ? 2 : 3));
                        availableReactionCell.bind(tL_availableReaction, ChatReactionsEditActivity.this.chatReactions.contains(tL_availableReaction.reaction), ((BaseFragment) ChatReactionsEditActivity.this).currentAccount);
                        return;
                    }
                }
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                textInfoPrivacyCell.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText4, false));
                ChatReactionsEditActivity chatReactionsEditActivity = ChatReactionsEditActivity.this;
                if (chatReactionsEditActivity.isChannel) {
                    textInfoPrivacyCell.setText(ChatObject.isChannelAndNotMegaGroup(chatReactionsEditActivity.currentChat) ? LocaleController.getString(R.string.EnableReactionsChannelInfo) : LocaleController.getString(R.string.EnableReactionsGroupInfo));
                    return;
                }
                int i8 = chatReactionsEditActivity.selectedType;
                if (i8 == 1) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
                } else if (i8 == 0) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
                } else if (i8 == 2) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.DisableReactionsInfo));
                }
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
                if (i7 == 0) {
                    return new RecyclerListView.Holder(new TextInfoPrivacyCell(context, 24, null));
                }
                if (i7 == 1) {
                    return new RecyclerListView.Holder(new HeaderCell(context, 23));
                }
                if (i7 != 3) {
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
        };
        this.listAdapter = adapter;
        recyclerListView2.setAdapter(adapter);
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda100(this, 11));
        linearLayout.addView(this.listView, LayoutHelper.createLinear(-1, 0, 1.0f));
        this.listView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.contentView = linearLayout;
        this.fragmentView = linearLayout;
        updateColors();
        return this.contentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i2 != this.currentAccount) {
            return;
        }
        if (i == NotificationCenter.reactionsDidLoad) {
            this.availableReactions.clear();
            this.availableReactions.addAll(getMediaDataController().getEnabledReactionsList());
            this.listAdapter.notifyDataSetChanged();
        } else if (i == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.chatId)) {
            INavigationLayout iNavigationLayout = this.parentLayout;
            if (iNavigationLayout == null || ((ActionBarLayout) iNavigationLayout).getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        return SimpleThemeDescription.createThemeDescriptions(new IntroActivity$$ExternalSyntheticLambda0(this, 9), Theme.key_windowBackgroundWhite, Theme.key_windowBackgroundWhiteBlackText, Theme.key_windowBackgroundWhiteGrayText2, Theme.key_listSelector, Theme.key_windowBackgroundGray, Theme.key_windowBackgroundWhiteGrayText4, Theme.key_text_RedRegular, Theme.key_windowBackgroundChecked, Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
    }

    @Override
    public boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatReactionsEditActivity.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.chatId, this.selectedType, this.chatReactions);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    public void setInfo(TLRPC.ChatFull chatFull) {
        this.info = chatFull;
        if (chatFull != null) {
            if (this.currentChat == null) {
                this.currentChat = getMessagesController().getChat(Long.valueOf(this.chatId));
            }
            this.chatReactions = new ArrayList();
            TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                this.startFromType = 0;
                return;
            }
            if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                this.startFromType = 2;
                return;
            }
            if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                for (int i = 0; i < tL_chatReactionsSome.reactions.size(); i++) {
                    if (tL_chatReactionsSome.reactions.get(i) instanceof TLRPC.TL_reactionEmoji) {
                        this.chatReactions.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i)).emoticon);
                    }
                }
                this.startFromType = 1;
            }
        }
    }
}
