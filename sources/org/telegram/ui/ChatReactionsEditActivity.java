package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AvailableReactionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.RadioCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SimpleThemeDescription;

public final class ChatReactionsEditActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public RadioCell allReactions;
    public final ArrayList availableReactions;
    public final long chatId;
    public ArrayList chatReactions;
    public LinearLayout contentView;
    public LinearLayout contorlsLayout;
    public TLRPC.Chat currentChat;
    public RadioCell disableReactions;
    public TextCheckCell enableReactionsCell;
    public TLRPC.ChatFull info;
    public boolean isChannel;
    public AnonymousClass2 listAdapter;
    public RecyclerListView listView;
    public final ArrayList radioCells;
    public int selectedType;
    public RadioCell someReactions;
    public int startFromType;

    public ChatReactionsEditActivity(Bundle bundle) {
        super(bundle);
        this.chatReactions = new ArrayList();
        this.availableReactions = new ArrayList();
        this.selectedType = -1;
        this.radioCells = new ArrayList();
        this.chatId = bundle.getLong("chat_id", 0L);
    }

    @Override
    public final View createView(final Context context) {
        this.isChannel = ChatObject.isChannelAndNotMegaGroup(this.chatId, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 24));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.availableReactions.addAll(getMediaDataController().getEnabledReactionsList());
        if (this.isChannel) {
            TextCheckCell textCheckCell = new TextCheckCell(context);
            this.enableReactionsCell = textCheckCell;
            textCheckCell.setHeight(56);
            this.enableReactionsCell.setTextAndCheck(LocaleController.getString(R.string.EnableReactions), !this.chatReactions.isEmpty(), false);
            TextCheckCell textCheckCell2 = this.enableReactionsCell;
            textCheckCell2.setBackgroundColor(Theme.getColor(null, textCheckCell2.checkBox.isChecked ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked, false));
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
                            ChatReactionsEditActivity chatReactionsEditActivity = this.f$0;
                            chatReactionsEditActivity.setCheckedEnableReactionCell(chatReactionsEditActivity.enableReactionsCell.checkBox.isChecked ? 2 : 1, true);
                            break;
                        case 1:
                            final ChatReactionsEditActivity chatReactionsEditActivity2 = this.f$0;
                            final int i2 = 2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i2) {
                                        case 0:
                                            chatReactionsEditActivity2.setCheckedEnableReactionCell(1, true);
                                            break;
                                        case 1:
                                            chatReactionsEditActivity2.setCheckedEnableReactionCell(2, true);
                                            break;
                                        default:
                                            chatReactionsEditActivity2.setCheckedEnableReactionCell(0, true);
                                            break;
                                    }
                                }
                            });
                            break;
                        case 2:
                            final ChatReactionsEditActivity chatReactionsEditActivity3 = this.f$0;
                            final int i3 = 0;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i3) {
                                        case 0:
                                            chatReactionsEditActivity3.setCheckedEnableReactionCell(1, true);
                                            break;
                                        case 1:
                                            chatReactionsEditActivity3.setCheckedEnableReactionCell(2, true);
                                            break;
                                        default:
                                            chatReactionsEditActivity3.setCheckedEnableReactionCell(0, true);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final ChatReactionsEditActivity chatReactionsEditActivity4 = this.f$0;
                            final int i4 = 1;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i4) {
                                        case 0:
                                            chatReactionsEditActivity4.setCheckedEnableReactionCell(1, true);
                                            break;
                                        case 1:
                                            chatReactionsEditActivity4.setCheckedEnableReactionCell(2, true);
                                            break;
                                        default:
                                            chatReactionsEditActivity4.setCheckedEnableReactionCell(0, true);
                                            break;
                                    }
                                }
                            });
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
        ArrayList arrayList = this.radioCells;
        arrayList.clear();
        arrayList.add(this.allReactions);
        arrayList.add(this.someReactions);
        arrayList.add(this.disableReactions);
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
                        ChatReactionsEditActivity chatReactionsEditActivity = this.f$0;
                        chatReactionsEditActivity.setCheckedEnableReactionCell(chatReactionsEditActivity.enableReactionsCell.checkBox.isChecked ? 2 : 1, true);
                        break;
                    case 1:
                        final ChatReactionsEditActivity chatReactionsEditActivity2 = this.f$0;
                        final int i3 = 2;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        chatReactionsEditActivity2.setCheckedEnableReactionCell(1, true);
                                        break;
                                    case 1:
                                        chatReactionsEditActivity2.setCheckedEnableReactionCell(2, true);
                                        break;
                                    default:
                                        chatReactionsEditActivity2.setCheckedEnableReactionCell(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 2:
                        final ChatReactionsEditActivity chatReactionsEditActivity3 = this.f$0;
                        final int i4 = 0;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i4) {
                                    case 0:
                                        chatReactionsEditActivity3.setCheckedEnableReactionCell(1, true);
                                        break;
                                    case 1:
                                        chatReactionsEditActivity3.setCheckedEnableReactionCell(2, true);
                                        break;
                                    default:
                                        chatReactionsEditActivity3.setCheckedEnableReactionCell(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final ChatReactionsEditActivity chatReactionsEditActivity4 = this.f$0;
                        final int i5 = 1;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i5) {
                                    case 0:
                                        chatReactionsEditActivity4.setCheckedEnableReactionCell(1, true);
                                        break;
                                    case 1:
                                        chatReactionsEditActivity4.setCheckedEnableReactionCell(2, true);
                                        break;
                                    default:
                                        chatReactionsEditActivity4.setCheckedEnableReactionCell(0, true);
                                        break;
                                }
                            }
                        });
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
                        ChatReactionsEditActivity chatReactionsEditActivity = this.f$0;
                        chatReactionsEditActivity.setCheckedEnableReactionCell(chatReactionsEditActivity.enableReactionsCell.checkBox.isChecked ? 2 : 1, true);
                        break;
                    case 1:
                        final ChatReactionsEditActivity chatReactionsEditActivity2 = this.f$0;
                        final int i4 = 2;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i4) {
                                    case 0:
                                        chatReactionsEditActivity2.setCheckedEnableReactionCell(1, true);
                                        break;
                                    case 1:
                                        chatReactionsEditActivity2.setCheckedEnableReactionCell(2, true);
                                        break;
                                    default:
                                        chatReactionsEditActivity2.setCheckedEnableReactionCell(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 2:
                        final ChatReactionsEditActivity chatReactionsEditActivity3 = this.f$0;
                        final int i5 = 0;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i5) {
                                    case 0:
                                        chatReactionsEditActivity3.setCheckedEnableReactionCell(1, true);
                                        break;
                                    case 1:
                                        chatReactionsEditActivity3.setCheckedEnableReactionCell(2, true);
                                        break;
                                    default:
                                        chatReactionsEditActivity3.setCheckedEnableReactionCell(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final ChatReactionsEditActivity chatReactionsEditActivity4 = this.f$0;
                        final int i6 = 1;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i6) {
                                    case 0:
                                        chatReactionsEditActivity4.setCheckedEnableReactionCell(1, true);
                                        break;
                                    case 1:
                                        chatReactionsEditActivity4.setCheckedEnableReactionCell(2, true);
                                        break;
                                    default:
                                        chatReactionsEditActivity4.setCheckedEnableReactionCell(0, true);
                                        break;
                                }
                            }
                        });
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
                        ChatReactionsEditActivity chatReactionsEditActivity = this.f$0;
                        chatReactionsEditActivity.setCheckedEnableReactionCell(chatReactionsEditActivity.enableReactionsCell.checkBox.isChecked ? 2 : 1, true);
                        break;
                    case 1:
                        final ChatReactionsEditActivity chatReactionsEditActivity2 = this.f$0;
                        final int i5 = 2;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i5) {
                                    case 0:
                                        chatReactionsEditActivity2.setCheckedEnableReactionCell(1, true);
                                        break;
                                    case 1:
                                        chatReactionsEditActivity2.setCheckedEnableReactionCell(2, true);
                                        break;
                                    default:
                                        chatReactionsEditActivity2.setCheckedEnableReactionCell(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    case 2:
                        final ChatReactionsEditActivity chatReactionsEditActivity3 = this.f$0;
                        final int i6 = 0;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i6) {
                                    case 0:
                                        chatReactionsEditActivity3.setCheckedEnableReactionCell(1, true);
                                        break;
                                    case 1:
                                        chatReactionsEditActivity3.setCheckedEnableReactionCell(2, true);
                                        break;
                                    default:
                                        chatReactionsEditActivity3.setCheckedEnableReactionCell(0, true);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final ChatReactionsEditActivity chatReactionsEditActivity4 = this.f$0;
                        final int i7 = 1;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i7) {
                                    case 0:
                                        chatReactionsEditActivity4.setCheckedEnableReactionCell(1, true);
                                        break;
                                    case 1:
                                        chatReactionsEditActivity4.setCheckedEnableReactionCell(2, true);
                                        break;
                                    default:
                                        chatReactionsEditActivity4.setCheckedEnableReactionCell(0, true);
                                        break;
                                }
                            }
                        });
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
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        zzku.m(recyclerListView);
        RecyclerListView recyclerListView2 = this.listView;
        ?? r2 = new RecyclerView.Adapter() {
            @Override
            public final int getItemCount() {
                ChatReactionsEditActivity chatReactionsEditActivity = ChatReactionsEditActivity.this;
                if (chatReactionsEditActivity.isChannel) {
                    return (chatReactionsEditActivity.chatReactions.isEmpty() ? 0 : chatReactionsEditActivity.availableReactions.size() + 1) + 1;
                }
                return (chatReactionsEditActivity.chatReactions.isEmpty() ? 0 : chatReactionsEditActivity.availableReactions.size() + 1) + 2;
            }

            @Override
            public final int getItemViewType(int i7) {
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
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
                int itemViewType = getItemViewType(i7);
                ChatReactionsEditActivity chatReactionsEditActivity = ChatReactionsEditActivity.this;
                View view = viewHolder.itemView;
                if (itemViewType != 0) {
                    if (itemViewType == 1) {
                        HeaderCell headerCell2 = (HeaderCell) view;
                        headerCell2.setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
                        headerCell2.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                        return;
                    } else {
                        if (itemViewType != 2) {
                            return;
                        }
                        AvailableReactionCell availableReactionCell = (AvailableReactionCell) view;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) chatReactionsEditActivity.availableReactions.get(i7 - (chatReactionsEditActivity.isChannel ? 2 : 3));
                        availableReactionCell.bind(tL_availableReaction, chatReactionsEditActivity.chatReactions.contains(tL_availableReaction.reaction), ((BaseFragment) chatReactionsEditActivity).currentAccount);
                        return;
                    }
                }
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                textInfoPrivacyCell.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText4, false));
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
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
                Context context2 = context;
                if (i7 == 0) {
                    return new RecyclerListView.Holder(new TextInfoPrivacyCell(context2, 24, null));
                }
                if (i7 == 1) {
                    return new RecyclerListView.Holder(new HeaderCell(context2, 23));
                }
                if (i7 != 3) {
                    return new RecyclerListView.Holder(new AvailableReactionCell(context2, false, false));
                }
                FrameLayout frameLayout = new FrameLayout(context2);
                ChatReactionsEditActivity chatReactionsEditActivity = ChatReactionsEditActivity.this;
                if (chatReactionsEditActivity.contorlsLayout.getParent() != null) {
                    ((ViewGroup) chatReactionsEditActivity.contorlsLayout.getParent()).removeView(chatReactionsEditActivity.contorlsLayout);
                }
                frameLayout.addView(chatReactionsEditActivity.contorlsLayout);
                frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                return new RecyclerListView.Holder(frameLayout);
            }
        };
        this.listAdapter = r2;
        recyclerListView2.setAdapter(r2);
        this.listView.setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, 8));
        linearLayout.addView(this.listView, LayoutHelper.createLinear(1.0f, -1, 0));
        this.listView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.contentView = linearLayout;
        this.fragmentView = linearLayout;
        updateColors$2();
        return this.contentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i2 != this.currentAccount) {
            return;
        }
        if (i == NotificationCenter.reactionsDidLoad) {
            ArrayList arrayList = this.availableReactions;
            arrayList.clear();
            arrayList.addAll(getMediaDataController().getEnabledReactionsList());
            this.listAdapter.mObservable.notifyChanged();
            return;
        }
        if (i == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.chatId)) {
            INavigationLayout iNavigationLayout = this.parentLayout;
            if (iNavigationLayout == null || ((ActionBarLayout) iNavigationLayout).getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return SimpleThemeDescription.createThemeDescriptions(new ChatActivity$$ExternalSyntheticLambda94(this, 9), Theme.key_windowBackgroundWhite, Theme.key_windowBackgroundWhiteBlackText, Theme.key_windowBackgroundWhiteGrayText2, Theme.key_listSelector, Theme.key_windowBackgroundGray, Theme.key_windowBackgroundWhiteGrayText4, Theme.key_text_RedRegular, Theme.key_windowBackgroundChecked, Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatReactionsEditActivity.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.chatId, this.selectedType, this.chatReactions);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    public final void setCheckedEnableReactionCell(int i, boolean z) {
        AnonymousClass2 anonymousClass2;
        if (this.selectedType == i) {
            return;
        }
        TextCheckCell textCheckCell = this.enableReactionsCell;
        if (textCheckCell != null) {
            boolean z2 = i == 1 || i == 0;
            textCheckCell.setChecked(z2);
            int color = Theme.getColor(null, z2 ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked, false);
            if (z2) {
                this.enableReactionsCell.setBackgroundColorAnimated(color, z2);
            } else {
                this.enableReactionsCell.setBackgroundColorAnimatedReverse(color);
            }
        }
        this.selectedType = i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.radioCells;
            if (i2 >= arrayList.size()) {
                break;
            }
            ((RadioCell) arrayList.get(i2)).radioButton.setChecked(i == i2, z);
            i2++;
        }
        ArrayList arrayList2 = this.availableReactions;
        if (i == 1) {
            if (z) {
                this.chatReactions.clear();
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                    if (tL_availableReaction.reaction.equals("👍") || tL_availableReaction.reaction.equals("👎")) {
                        this.chatReactions.add(tL_availableReaction.reaction);
                    }
                }
                if (this.chatReactions.isEmpty() && arrayList2.size() >= 2) {
                    this.chatReactions.add(((TLRPC.TL_availableReaction) arrayList2.get(0)).reaction);
                    this.chatReactions.add(((TLRPC.TL_availableReaction) arrayList2.get(1)).reaction);
                }
            }
            AnonymousClass2 anonymousClass3 = this.listAdapter;
            if (anonymousClass3 != null && z) {
                anonymousClass3.mObservable.notifyItemRangeInserted(this.isChannel ? 1 : 2, arrayList2.size() + 1);
            }
        } else if (!this.chatReactions.isEmpty()) {
            this.chatReactions.clear();
            AnonymousClass2 anonymousClass4 = this.listAdapter;
            if (anonymousClass4 != null && z) {
                anonymousClass4.mObservable.notifyItemRangeRemoved(this.isChannel ? 1 : 2, arrayList2.size() + 1);
            }
        }
        if (!this.isChannel && (anonymousClass2 = this.listAdapter) != null && z) {
            anonymousClass2.notifyItemChanged(1);
        }
        AnonymousClass2 anonymousClass5 = this.listAdapter;
        if (anonymousClass5 == null || z) {
            return;
        }
        anonymousClass5.mObservable.notifyChanged();
    }

    public final void updateColors$2() {
        this.contentView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        TextCheckCell textCheckCell = this.enableReactionsCell;
        if (textCheckCell != null) {
            textCheckCell.setColors(Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
        }
        this.listAdapter.mObservable.notifyChanged();
    }
}
