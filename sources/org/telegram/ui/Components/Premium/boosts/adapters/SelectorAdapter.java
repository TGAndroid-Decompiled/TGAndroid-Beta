package org.telegram.ui.Components.Premium.boosts.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$TL_help_country;
import org.telegram.tgnet.TLRPC$TL_inputPeerChannel;
import org.telegram.tgnet.TLRPC$TL_inputPeerChat;
import org.telegram.tgnet.TLRPC$TL_inputPeerSelf;
import org.telegram.tgnet.TLRPC$TL_inputPeerUser;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorCountryCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorLetterCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorUserCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickerEmptyView;
public class SelectorAdapter extends AdapterWithDiffUtils {
    private HashMap<Long, Integer> chatsParticipantsCount = new HashMap<>();
    private final Context context;
    private boolean isGreenSelector;
    private List<Item> items;
    private RecyclerListView listView;
    private final Theme.ResourcesProvider resourcesProvider;
    private GraySectionCell topSectionCell;
    private View.OnClickListener topSectionClickListener;

    public SelectorAdapter(Context context, Theme.ResourcesProvider resourcesProvider) {
        this.context = context;
        this.resourcesProvider = resourcesProvider;
        BoostRepository.loadParticipantsCount(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                SelectorAdapter.this.lambda$new$0((HashMap) obj);
            }
        });
    }

    public void lambda$new$0(HashMap hashMap) {
        this.chatsParticipantsCount.clear();
        this.chatsParticipantsCount.putAll(hashMap);
    }

    public void setData(List<Item> list, RecyclerListView recyclerListView) {
        this.items = list;
        this.listView = recyclerListView;
    }

    public void setTopSectionClickListener(View.OnClickListener onClickListener) {
        this.topSectionClickListener = onClickListener;
        GraySectionCell graySectionCell = this.topSectionCell;
        if (graySectionCell != null) {
            if (onClickListener == null) {
                graySectionCell.setRightText(null);
            } else {
                graySectionCell.setRightText(LocaleController.getString(R.string.UsersDeselectAll), true, onClickListener);
            }
        }
    }

    public void setGreenSelector(boolean z) {
        this.isGreenSelector = z;
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        return viewHolder.getItemViewType() == 3 || viewHolder.getItemViewType() == 6;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        SelectorUserCell selectorUserCell;
        if (i == -1) {
            selectorUserCell = new View(this.context);
        } else if (i == 3) {
            selectorUserCell = new SelectorUserCell(this.context, this.resourcesProvider, this.isGreenSelector);
        } else if (i == 5) {
            StickerEmptyView stickerEmptyView = new StickerEmptyView(this.context, null, 1, this.resourcesProvider);
            stickerEmptyView.title.setText(LocaleController.getString("NoResult", R.string.NoResult));
            stickerEmptyView.subtitle.setText(LocaleController.getString("SearchEmptyViewFilteredSubtitle2", R.string.SearchEmptyViewFilteredSubtitle2));
            stickerEmptyView.linearLayout.setTranslationY(AndroidUtilities.dp(24.0f));
            selectorUserCell = stickerEmptyView;
        } else if (i == 7) {
            selectorUserCell = new SelectorLetterCell(this.context, this.resourcesProvider);
        } else if (i == 6) {
            selectorUserCell = new SelectorCountryCell(this.context, this.resourcesProvider);
        } else if (i == 8) {
            selectorUserCell = new GraySectionCell(this.context, this.resourcesProvider);
        } else {
            selectorUserCell = new View(this.context);
        }
        return new RecyclerListView.Holder(selectorUserCell);
    }

    public int getParticipantsCount(TLRPC$Chat tLRPC$Chat) {
        Integer num;
        int i;
        TLRPC$ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(tLRPC$Chat.id);
        if (chatFull == null || (i = chatFull.participants_count) <= 0) {
            if (!this.chatsParticipantsCount.isEmpty() && (num = this.chatsParticipantsCount.get(Long.valueOf(tLRPC$Chat.id))) != null) {
                return num.intValue();
            }
            return tLRPC$Chat.participants_count;
        }
        return i;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        List<Item> list = this.items;
        if (list == null || i < 0) {
            return;
        }
        Item item = list.get(i);
        int itemViewType = viewHolder.getItemViewType();
        boolean z = true;
        if (itemViewType != 3) {
            if (itemViewType == 6) {
                SelectorCountryCell selectorCountryCell = (SelectorCountryCell) viewHolder.itemView;
                selectorCountryCell.setCountry(item.country, (i >= this.items.size() - 1 || (i2 = i + 1) >= this.items.size() - 1 || this.items.get(i2).viewType == 7) ? false : false);
                selectorCountryCell.setChecked(item.checked, false);
                return;
            } else if (itemViewType == -1) {
                int i3 = item.padHeight;
                if (i3 < 0) {
                    i3 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                }
                viewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, i3));
                return;
            } else if (itemViewType == 7) {
                ((SelectorLetterCell) viewHolder.itemView).setLetter(item.text);
                return;
            } else if (itemViewType == 5) {
                try {
                    ((StickerEmptyView) viewHolder.itemView).stickerView.getImageReceiver().startAnimation();
                    return;
                } catch (Exception unused) {
                    return;
                }
            } else if (itemViewType == 8) {
                GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
                graySectionCell.setText(item.text);
                if (this.topSectionClickListener == null) {
                    graySectionCell.setRightText((String) null, (View.OnClickListener) null);
                } else {
                    graySectionCell.setRightText(LocaleController.getString(R.string.UsersDeselectAll), this.topSectionClickListener);
                }
                this.topSectionCell = graySectionCell;
                return;
            } else {
                return;
            }
        }
        SelectorUserCell selectorUserCell = (SelectorUserCell) viewHolder.itemView;
        TLRPC$User tLRPC$User = item.user;
        if (tLRPC$User != null) {
            selectorUserCell.setUser(tLRPC$User);
        } else {
            TLRPC$Chat tLRPC$Chat = item.chat;
            if (tLRPC$Chat != null) {
                selectorUserCell.setChat(tLRPC$Chat, getParticipantsCount(tLRPC$Chat));
            } else {
                TLRPC$InputPeer tLRPC$InputPeer = item.peer;
                if (tLRPC$InputPeer != null) {
                    if (tLRPC$InputPeer instanceof TLRPC$TL_inputPeerSelf) {
                        selectorUserCell.setUser(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                    } else if (tLRPC$InputPeer instanceof TLRPC$TL_inputPeerUser) {
                        selectorUserCell.setUser(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tLRPC$InputPeer.user_id)));
                    } else if (tLRPC$InputPeer instanceof TLRPC$TL_inputPeerChat) {
                        TLRPC$Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(tLRPC$InputPeer.chat_id));
                        selectorUserCell.setChat(chat, getParticipantsCount(chat));
                    } else if (tLRPC$InputPeer instanceof TLRPC$TL_inputPeerChannel) {
                        TLRPC$Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(tLRPC$InputPeer.channel_id));
                        selectorUserCell.setChat(chat2, getParticipantsCount(chat2));
                    }
                }
            }
        }
        selectorUserCell.setChecked(item.checked, false);
        selectorUserCell.setCheckboxAlpha(1.0f, false);
        selectorUserCell.setDivider(i < this.items.size() + (-2));
        int i4 = i + 1;
        if (i4 >= this.items.size() || this.items.get(i4).viewType != 7) {
            return;
        }
        selectorUserCell.setDivider(false);
    }

    @Override
    public int getItemViewType(int i) {
        List<Item> list = this.items;
        if (list == null || i < 0) {
            return -1;
        }
        return list.get(i).viewType;
    }

    @Override
    public int getItemCount() {
        List<Item> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    private RecyclerView.Adapter realAdapter() {
        return this.listView.getAdapter();
    }

    @Override
    public void notifyItemChanged(int i) {
        realAdapter().notifyItemChanged(i + 1);
    }

    @Override
    public void notifyItemInserted(int i) {
        realAdapter().notifyItemInserted(i + 1);
    }

    @Override
    public void notifyItemMoved(int i, int i2) {
        realAdapter().notifyItemMoved(i + 1, i2);
    }

    @Override
    public void notifyItemRangeChanged(int i, int i2) {
        realAdapter().notifyItemRangeChanged(i + 1, i2);
    }

    @Override
    public void notifyItemRangeChanged(int i, int i2, Object obj) {
        realAdapter().notifyItemRangeChanged(i + 1, i2, obj);
    }

    @Override
    public void notifyItemRangeInserted(int i, int i2) {
        realAdapter().notifyItemRangeInserted(i + 1, i2);
    }

    @Override
    public void notifyItemRangeRemoved(int i, int i2) {
        realAdapter().notifyItemRangeRemoved(i + 1, i2);
    }

    @Override
    public void notifyItemRemoved(int i) {
        realAdapter().notifyItemRemoved(i + 1);
    }

    @Override
    @SuppressLint({"NotifyDataSetChanged"})
    public void notifyDataSetChanged() {
        realAdapter().notifyDataSetChanged();
    }

    public void notifyChangedLast() {
        List<Item> list = this.items;
        if (list == null || list.isEmpty()) {
            return;
        }
        notifyItemChanged(this.items.size() - 1);
    }

    public static class Item extends AdapterWithDiffUtils.Item {
        public TLRPC$Chat chat;
        public boolean checked;
        public TLRPC$TL_help_country country;
        public int padHeight;
        public TLRPC$InputPeer peer;
        public String text;
        public int type;
        public TLRPC$User user;

        private Item(int i, boolean z) {
            super(i, z);
            this.padHeight = -1;
        }

        public static Item asPad(int i) {
            Item item = new Item(-1, false);
            item.padHeight = i;
            return item;
        }

        public static Item asUser(TLRPC$User tLRPC$User, boolean z) {
            Item item = new Item(3, true);
            item.user = tLRPC$User;
            item.peer = null;
            item.chat = null;
            item.checked = z;
            return item;
        }

        public static Item asLetter(String str) {
            Item item = new Item(7, false);
            item.text = str;
            return item;
        }

        public static Item asTopSection(String str) {
            Item item = new Item(8, false);
            item.text = str;
            return item;
        }

        public static Item asCountry(TLRPC$TL_help_country tLRPC$TL_help_country, boolean z) {
            Item item = new Item(6, true);
            item.country = tLRPC$TL_help_country;
            item.checked = z;
            return item;
        }

        public static Item asPeer(TLRPC$InputPeer tLRPC$InputPeer, boolean z) {
            Item item = new Item(3, true);
            item.peer = tLRPC$InputPeer;
            item.user = null;
            item.chat = null;
            item.checked = z;
            return item;
        }

        public static Item asNoUsers() {
            return new Item(5, false);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Item.class != obj.getClass()) {
                return false;
            }
            Item item = (Item) obj;
            int i = this.viewType;
            if (i != item.viewType) {
                return false;
            }
            if (i != -1 || this.padHeight == item.padHeight) {
                if (i != 3 || (this.user == item.user && this.chat == item.chat && this.peer == item.peer && this.type == item.type && this.checked == item.checked)) {
                    if (i != 6 || (this.country == item.country && this.checked == item.checked)) {
                        if (i != 7 || TextUtils.equals(this.text, item.text)) {
                            return this.viewType != 8 || (TextUtils.equals(this.text, item.text) && this.checked == item.checked);
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }
}
