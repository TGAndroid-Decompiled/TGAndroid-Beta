package org.telegram.ui.Components.Premium.boosts.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorCountryCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorLetterCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorUserCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickerEmptyView;

public class SelectorAdapter extends AdapterWithDiffUtils {
    private final Context context;
    private boolean isGreenSelector;
    private List items;
    private RecyclerListView listView;
    public boolean needChecks;
    public boolean needChecks2;
    private final Theme.ResourcesProvider resourcesProvider;
    private GraySectionCell topSectionCell;
    private View.OnClickListener topSectionClickListener;
    private HashMap chatsParticipantsCount = new HashMap();
    private boolean callButtonsVisible = true;

    public SelectorAdapter(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        this.context = context;
        this.needChecks = z;
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

    public void setNeedChecks2(boolean z) {
        this.needChecks2 = z;
    }

    public void setData(List list, RecyclerListView recyclerListView) {
        this.items = list;
        this.listView = recyclerListView;
    }

    public void setCallButtonsVisible(final boolean z) {
        if (this.callButtonsVisible != z) {
            this.callButtonsVisible = z;
            AndroidUtilities.forEachViews((RecyclerView) this.listView, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    SelectorAdapter.lambda$setCallButtonsVisible$1(z, (View) obj);
                }
            });
        }
    }

    public static void lambda$setCallButtonsVisible$1(boolean z, View view) {
        if (view instanceof SelectorUserCell) {
            ((SelectorUserCell) view).setCallButtonsVisible(z, true);
        }
    }

    @Override
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        View view = viewHolder.itemView;
        if (view instanceof SelectorUserCell) {
            ((SelectorUserCell) view).setCallButtonsVisible(this.callButtonsVisible, false);
        }
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
        return viewHolder.getItemViewType() == 3 || viewHolder.getItemViewType() == 6 || viewHolder.getItemViewType() == 9;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        if (i == -1) {
            view = new View(this.context);
        } else if (i == 3) {
            view = new SelectorUserCell(this.context, this.needChecks, this.needChecks2, this.resourcesProvider, this.isGreenSelector);
        } else if (i == 5) {
            StickerEmptyView stickerEmptyView = new StickerEmptyView(this.context, null, 1, this.resourcesProvider);
            stickerEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
            stickerEmptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            stickerEmptyView.linearLayout.setTranslationY(AndroidUtilities.dp(24.0f));
            view = stickerEmptyView;
        } else if (i == 7) {
            view = new SelectorLetterCell(this.context, this.resourcesProvider);
        } else if (i == 6) {
            view = new SelectorCountryCell(this.context, this.resourcesProvider);
        } else if (i == 8) {
            view = new GraySectionCell(this.context, this.resourcesProvider);
        } else if (i == 9) {
            TextCell textCell = new TextCell(this.context, this.resourcesProvider);
            textCell.leftPadding = 16;
            textCell.imageLeft = 19;
            view = textCell;
        } else if (i == 10) {
            view = new FrameLayout(this.context);
        } else {
            view = new View(this.context);
        }
        return new RecyclerListView.Holder(view);
    }

    public int getParticipantsCount(TLRPC.Chat chat) {
        Integer num;
        int i;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.id);
        if (chatFull != null && (i = chatFull.participants_count) > 0) {
            return i;
        }
        if (!this.chatsParticipantsCount.isEmpty() && (num = (Integer) this.chatsParticipantsCount.get(Long.valueOf(chat.id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        List list = this.items;
        if (list == null || i < 0) {
            return;
        }
        Item item = (Item) list.get(i);
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 3) {
            SelectorUserCell selectorUserCell = (SelectorUserCell) viewHolder.itemView;
            Drawable drawable = item.icon;
            if (drawable != null) {
                selectorUserCell.setCustomUser(drawable, item.text, item.subtext);
            } else {
                TLRPC.User user = item.user;
                if (user != null) {
                    selectorUserCell.setUser(user);
                    CharSequence charSequence = item.subtext;
                    if (charSequence != null) {
                        selectorUserCell.setSubtitle(charSequence);
                        selectorUserCell.subtitleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, this.resourcesProvider));
                    }
                } else {
                    TLRPC.Chat chat = item.chat;
                    if (chat != null) {
                        selectorUserCell.setChat(chat, getParticipantsCount(chat));
                    } else {
                        TLRPC.InputPeer inputPeer = item.peer;
                        if (inputPeer != null) {
                            if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                                selectorUserCell.setUser(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                                selectorUserCell.setUser(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(inputPeer.user_id)));
                            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.chat_id));
                                selectorUserCell.setChat(chat2, getParticipantsCount(chat2));
                            } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                TLRPC.Chat chat3 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                                selectorUserCell.setChat(chat3, getParticipantsCount(chat3));
                            }
                        }
                    }
                }
            }
            selectorUserCell.setChecked(item.checked, false);
            selectorUserCell.setCheckboxAlpha(1.0f, false);
            int i3 = i + 1;
            if (i3 < this.items.size() && ((Item) this.items.get(i3)).viewType != itemViewType) {
                r4 = false;
            }
            selectorUserCell.setDivider(r4);
            if (i3 < this.items.size() && ((Item) this.items.get(i3)).viewType == 7) {
                selectorUserCell.setDivider(false);
            }
            selectorUserCell.setOptions(item.options);
            selectorUserCell.setCallButtons(item.audioCall, item.videoCall);
            selectorUserCell.setCallButtonsVisible(this.callButtonsVisible, false);
            return;
        }
        if (itemViewType == 6) {
            SelectorCountryCell selectorCountryCell = (SelectorCountryCell) viewHolder.itemView;
            selectorCountryCell.setCountry(item.country, i < this.items.size() - 1 && (i2 = i + 1) < this.items.size() - 1 && ((Item) this.items.get(i2)).viewType != 7);
            selectorCountryCell.setChecked(item.checked, false);
            return;
        }
        if (itemViewType == -1) {
            int i4 = item.padHeight;
            if (i4 < 0) {
                i4 = (int) (AndroidUtilities.displaySize.y * 0.3f);
            }
            viewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, i4));
            return;
        }
        if (itemViewType == 7) {
            ((SelectorLetterCell) viewHolder.itemView).setLetter(item.text);
            return;
        }
        if (itemViewType == 5) {
            try {
                ((StickerEmptyView) viewHolder.itemView).stickerView.getImageReceiver().startAnimation();
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (itemViewType == 8) {
            GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
            if (TextUtils.equals(graySectionCell.getText(), item.text)) {
                CharSequence charSequence2 = item.subtext;
                if (charSequence2 == null) {
                    charSequence2 = "";
                }
                graySectionCell.setRightText(charSequence2, true, item.callback);
            } else {
                graySectionCell.setText(Emoji.replaceWithRestrictedEmoji(item.text, graySectionCell.getTextView(), (Runnable) null));
                if (!TextUtils.isEmpty(item.subtext)) {
                    graySectionCell.setRightText(item.subtext, item.callback);
                }
            }
            this.topSectionCell = graySectionCell;
            return;
        }
        if (itemViewType == 9) {
            TextCell textCell = (TextCell) viewHolder.itemView;
            textCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
            textCell.setTextAndIcon(item.text, item.resId, false);
        } else if (itemViewType == 10) {
            FrameLayout frameLayout = (FrameLayout) viewHolder.itemView;
            if (frameLayout.getChildCount() == 1 && frameLayout.getChildAt(0) == item.view) {
                return;
            }
            AndroidUtilities.removeFromParent(item.view);
            frameLayout.addView(item.view, LayoutHelper.createFrame(-1, -2.0f));
        }
    }

    @Override
    public int getItemViewType(int i) {
        List list = this.items;
        if (list == null || i < 0) {
            return -1;
        }
        return ((Item) list.get(i)).viewType;
    }

    @Override
    public int getItemCount() {
        List list = this.items;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void notifyChangedLast() {
        List list = this.items;
        if (list == null || list.isEmpty()) {
            return;
        }
        notifyItemChanged(this.items.size() - 1);
    }

    public static class Item extends AdapterWithDiffUtils.Item {
        public View.OnClickListener audioCall;
        public View.OnClickListener callback;
        public TLRPC.Chat chat;
        public boolean checked;
        public TLRPC.TL_help_country country;
        public Drawable icon;
        public int id;
        public View.OnClickListener options;
        public int padHeight;
        public TLRPC.InputPeer peer;
        public int resId;
        public CharSequence subtext;
        public CharSequence text;
        public int type;
        public TLRPC.User user;
        public View.OnClickListener videoCall;
        public View view;

        private Item(int i, boolean z) {
            super(i, z);
            this.padHeight = -1;
        }

        public static Item asPad(int i) {
            Item item = new Item(-1, false);
            item.padHeight = i;
            return item;
        }

        public static Item asButton(int i, int i2, String str) {
            Item item = new Item(9, false);
            item.id = i;
            item.resId = i2;
            item.text = str;
            return item;
        }

        public static Item asCustom(View view) {
            Item item = new Item(10, false);
            item.view = view;
            return item;
        }

        public static Item asCustomUser(int i, Drawable drawable, CharSequence charSequence, CharSequence charSequence2) {
            Item item = new Item(3, true);
            item.id = i;
            item.icon = drawable;
            item.text = charSequence;
            item.subtext = charSequence2;
            return item;
        }

        public static Item asUser(TLRPC.User user, boolean z) {
            Item item = new Item(3, true);
            item.user = user;
            item.peer = null;
            item.chat = null;
            item.checked = z;
            return item;
        }

        public Item withOptions(View.OnClickListener onClickListener) {
            this.options = onClickListener;
            return this;
        }

        public Item withCall(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
            this.audioCall = onClickListener;
            this.videoCall = onClickListener2;
            return this;
        }

        public static Item asLetter(String str) {
            Item item = new Item(7, false);
            item.text = str;
            return item;
        }

        public static Item asTopSection(CharSequence charSequence) {
            Item item = new Item(8, false);
            item.text = charSequence;
            return item;
        }

        public Item withRightText(String str, View.OnClickListener onClickListener) {
            this.subtext = str;
            this.callback = onClickListener;
            return this;
        }

        public static Item asCountry(TLRPC.TL_help_country tL_help_country, boolean z) {
            Item item = new Item(6, true);
            item.country = tL_help_country;
            item.checked = z;
            return item;
        }

        public static Item asPeer(TLRPC.InputPeer inputPeer, boolean z) {
            Item item = new Item(3, true);
            item.peer = inputPeer;
            item.user = null;
            item.chat = null;
            item.checked = z;
            return item;
        }

        public static Item asChat(TLRPC.Chat chat, boolean z) {
            Item item = new Item(3, true);
            item.chat = chat;
            item.user = null;
            item.peer = null;
            item.checked = z;
            return item;
        }

        public long getDialogId() {
            TLRPC.User user = this.user;
            if (user != null) {
                return user.id;
            }
            TLRPC.Chat chat = this.chat;
            if (chat != null) {
                return -chat.id;
            }
            TLRPC.InputPeer inputPeer = this.peer;
            if (inputPeer != null) {
                return DialogObject.getPeerDialogId(inputPeer);
            }
            return 0L;
        }

        public static Item asNoUsers() {
            return new Item(5, false);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Item item = (Item) obj;
            int i = this.viewType;
            if (i != item.viewType) {
                return false;
            }
            if (i == -1 && this.padHeight != item.padHeight) {
                return false;
            }
            if (i == 3 && (getDialogId() != item.getDialogId() || this.type != item.type)) {
                return false;
            }
            int i2 = this.viewType;
            if (i2 == 6 && this.country != item.country) {
                return false;
            }
            if (i2 == 7 && !TextUtils.equals(this.text, item.text)) {
                return false;
            }
            if (this.viewType == 8 && !TextUtils.equals(this.text, item.text)) {
                return false;
            }
            if (this.viewType != 9 || (TextUtils.equals(this.text, item.text) && this.id == item.id && this.resId == item.resId)) {
                return this.viewType != 10 || this.view == item.view;
            }
            return false;
        }

        @Override
        public boolean contentsEquals(AdapterWithDiffUtils.Item item) {
            if (this == item) {
                return true;
            }
            if (item == null || getClass() != item.getClass()) {
                return false;
            }
            Item item2 = (Item) item;
            if (this.checked != item2.checked) {
                return false;
            }
            if (this.viewType != 8) {
                return true;
            }
            if (TextUtils.equals(this.subtext, item2.subtext)) {
                if ((this.callback == null) == (item2.callback == null)) {
                    return true;
                }
            }
            return false;
        }
    }
}
