package org.telegram.ui.Components.Premium.boosts.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda5;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.UserCell2;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet$$ExternalSyntheticLambda16;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorCountryCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorLetterCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorUserCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda26;

public final class SelectorAdapter extends AdapterWithDiffUtils {
    public final Context context;
    public boolean isGreenSelector;
    public ArrayList items;
    public RecyclerListView listView;
    public final boolean needChecks;
    public boolean needChecks2;
    public final Theme.ResourcesProvider resourcesProvider;
    public GraySectionCell topSectionCell;
    public final HashMap chatsParticipantsCount = new HashMap();
    public boolean callButtonsVisible = true;

    public final class Item extends AdapterWithDiffUtils.Item {
        public UserSelectorBottomSheet$$ExternalSyntheticLambda16 audioCall;
        public AlertDialog$$ExternalSyntheticLambda5 callback;
        public TLRPC.Chat chat;
        public boolean checked;
        public TLRPC.TL_help_country country;
        public CombinedDrawable icon;
        public int id;
        public AlertDialog$$ExternalSyntheticLambda5 options;
        public int padHeight;
        public TLRPC.InputPeer peer;
        public int resId;
        public String subtext;
        public String text;
        public TLRPC.User user;
        public UserSelectorBottomSheet$$ExternalSyntheticLambda16 videoCall;
        public GraySectionCell view;

        public Item(int i, boolean z) {
            super(i, z);
            this.padHeight = -1;
        }

        public static Item asUser(TLRPC.User user, boolean z) {
            Item item = new Item(3, true);
            item.user = user;
            item.peer = null;
            item.chat = null;
            item.checked = z;
            return item;
        }

        @Override
        public final boolean contentsEquals(AdapterWithDiffUtils.Item item) {
            if (this != item) {
                if (item != null && Item.class == item.getClass()) {
                    Item item2 = (Item) item;
                    if (this.checked == item2.checked) {
                        if (this.viewType == 8) {
                            if (TextUtils.equals(this.subtext, item2.subtext)) {
                                if ((this.callback == null) == (item2.callback == null)) {
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final boolean equals(Object obj) {
            long peerDialogId;
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
            if (i == -1 && this.padHeight != item.padHeight) {
                return false;
            }
            if (i == 3) {
                TLRPC.User user = this.user;
                long peerDialogId2 = 0;
                if (user != null) {
                    peerDialogId = user.id;
                } else {
                    TLRPC.Chat chat = this.chat;
                    if (chat != null) {
                        peerDialogId = -chat.id;
                    } else {
                        TLRPC.InputPeer inputPeer = this.peer;
                        peerDialogId = inputPeer != null ? DialogObject.getPeerDialogId(inputPeer) : 0L;
                    }
                }
                TLRPC.User user2 = item.user;
                if (user2 != null) {
                    peerDialogId2 = user2.id;
                } else {
                    TLRPC.Chat chat2 = item.chat;
                    if (chat2 != null) {
                        peerDialogId2 = -chat2.id;
                    } else {
                        TLRPC.InputPeer inputPeer2 = item.peer;
                        if (inputPeer2 != null) {
                            peerDialogId2 = DialogObject.getPeerDialogId(inputPeer2);
                        }
                    }
                }
                if (peerDialogId != peerDialogId2) {
                    return false;
                }
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
    }

    public SelectorAdapter(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        this.context = context;
        this.needChecks = z;
        this.resourcesProvider = resourcesProvider;
        DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda6 = new DialogCell$$ExternalSyntheticLambda6(this, 17);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new GiftSheet$$ExternalSyntheticLambda26(5, messagesStorage, dialogCell$$ExternalSyntheticLambda6));
    }

    @Override
    public final int getItemCount() {
        ArrayList arrayList = this.items;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int getItemViewType(int i) {
        ArrayList arrayList = this.items;
        if (arrayList == null || i < 0) {
            return -1;
        }
        return ((Item) arrayList.get(i)).viewType;
    }

    public final int getParticipantsCount$2(TLRPC.Chat chat) {
        Integer num;
        int i;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.id);
        if (chatFull != null && (i = chatFull.participants_count) > 0) {
            return i;
        }
        HashMap map = this.chatsParticipantsCount;
        return (map.isEmpty() || (num = (Integer) map.get(Long.valueOf(chat.id))) == null) ? chat.participants_count : num.intValue();
    }

    @Override
    public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        return viewHolder.getItemViewType() == 3 || viewHolder.getItemViewType() == 6 || viewHolder.getItemViewType() == 9;
    }

    @Override
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        int i2;
        ArrayList arrayList = this.items;
        if (arrayList == null || i < 0) {
            return;
        }
        Item item = (Item) arrayList.get(i);
        int itemViewType = viewHolder.getItemViewType();
        int i3 = 8;
        if (itemViewType != 3) {
            if (itemViewType == 6) {
                SelectorCountryCell selectorCountryCell = (SelectorCountryCell) viewHolder.itemView;
                z = i < this.items.size() - 1 && (i2 = i + 1) < this.items.size() - 1 && ((Item) this.items.get(i2)).viewType != 7;
                selectorCountryCell.country = item.country;
                selectorCountryCell.setCountryInternal();
                selectorCountryCell.setDivider(z);
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
            if (itemViewType != 8) {
                if (itemViewType == 9) {
                    TextCell textCell = (TextCell) viewHolder.itemView;
                    textCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                    textCell.setTextAndIcon((CharSequence) item.text, item.resId, false);
                    return;
                } else {
                    if (itemViewType == 10) {
                        FrameLayout frameLayout = (FrameLayout) viewHolder.itemView;
                        if (frameLayout.getChildCount() == 1 && frameLayout.getChildAt(0) == item.view) {
                            return;
                        }
                        AndroidUtilities.removeFromParent(item.view);
                        frameLayout.addView(item.view, LayoutHelper.createFrame(-1, -2.0f));
                        return;
                    }
                    return;
                }
            }
            GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
            if (TextUtils.equals(graySectionCell.getText(), item.text)) {
                String str = item.subtext;
                if (str == null) {
                    str = "";
                }
                graySectionCell.setRightText(str, item.callback);
            } else {
                graySectionCell.setText(Emoji.replaceWithRestrictedEmoji(item.text, graySectionCell.getTextView(), (Runnable) null));
                if (!TextUtils.isEmpty(item.subtext)) {
                    String str2 = item.subtext;
                    AlertDialog$$ExternalSyntheticLambda5 alertDialog$$ExternalSyntheticLambda5 = item.callback;
                    GraySectionCell.AnonymousClass1 anonymousClass1 = graySectionCell.rightTextView;
                    anonymousClass1.setText(str2, false);
                    anonymousClass1.setOnClickListener(alertDialog$$ExternalSyntheticLambda5);
                    anonymousClass1.setVisibility(0);
                }
            }
            this.topSectionCell = graySectionCell;
            return;
        }
        SelectorUserCell selectorUserCell = (SelectorUserCell) viewHolder.itemView;
        CombinedDrawable combinedDrawable = item.icon;
        if (combinedDrawable != null) {
            String str3 = item.text;
            String str4 = item.subtext;
            selectorUserCell.optionsView.setVisibility(8);
            selectorUserCell.user = null;
            selectorUserCell.chat = null;
            BackupImageView backupImageView = selectorUserCell.imageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
            backupImageView.setImageDrawable(combinedDrawable);
            UserCell2.AnonymousClass1 anonymousClass2 = selectorUserCell.titleTextView;
            anonymousClass2.setText(str3);
            boolean[] zArr = selectorUserCell.isOnline;
            zArr[0] = false;
            selectorUserCell.setSubtitle(str4);
            selectorUserCell.subtitleTextView.setTextColor(Theme.getColor(zArr[0] ? Theme.key_dialogTextBlue2 : Theme.key_dialogTextGray3, selectorUserCell.resourcesProvider));
            CheckBox2 checkBox2 = selectorUserCell.checkBox;
            if (checkBox2 != null) {
                checkBox2.setAlpha(1.0f);
            }
            anonymousClass2.setRightDrawable((Drawable) null);
        } else {
            TLRPC.User user = item.user;
            if (user != null) {
                selectorUserCell.setUser(user);
                String str5 = item.subtext;
                if (str5 != null) {
                    selectorUserCell.setSubtitle(str5);
                    selectorUserCell.subtitleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, this.resourcesProvider));
                }
            } else {
                TLRPC.Chat chat = item.chat;
                if (chat != null) {
                    selectorUserCell.setChat(getParticipantsCount$2(chat), chat);
                } else {
                    TLRPC.InputPeer inputPeer = item.peer;
                    if (inputPeer != null) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                            selectorUserCell.setUser(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            selectorUserCell.setUser(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(inputPeer.user_id)));
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                            TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.chat_id));
                            selectorUserCell.setChat(getParticipantsCount$2(chat2), chat2);
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                            TLRPC.Chat chat3 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                            selectorUserCell.setChat(getParticipantsCount$2(chat3), chat3);
                        }
                    }
                }
            }
        }
        selectorUserCell.setChecked(item.checked, false);
        selectorUserCell.setCheckboxAlpha(1.0f, false);
        int i5 = i + 1;
        selectorUserCell.setDivider(i5 >= this.items.size() || ((Item) this.items.get(i5)).viewType == itemViewType);
        if (i5 < this.items.size() && ((Item) this.items.get(i5)).viewType == 7) {
            selectorUserCell.setDivider(false);
        }
        selectorUserCell.setOptions(item.options);
        UserSelectorBottomSheet$$ExternalSyntheticLambda16 userSelectorBottomSheet$$ExternalSyntheticLambda16 = item.audioCall;
        UserSelectorBottomSheet$$ExternalSyntheticLambda16 userSelectorBottomSheet$$ExternalSyntheticLambda17 = item.videoCall;
        boolean z2 = userSelectorBottomSheet$$ExternalSyntheticLambda16 != null;
        selectorUserCell.hasAudioView = z2;
        ImageView imageView = selectorUserCell.audioView;
        imageView.setVisibility((z2 && selectorUserCell.showCallButtons) ? 0 : 8);
        imageView.setOnClickListener(userSelectorBottomSheet$$ExternalSyntheticLambda16);
        z = userSelectorBottomSheet$$ExternalSyntheticLambda17 != null;
        selectorUserCell.hasVideoView = z;
        ImageView imageView2 = selectorUserCell.videoView;
        if (z && selectorUserCell.showCallButtons) {
            i3 = 0;
        }
        imageView2.setVisibility(i3);
        imageView2.setOnClickListener(userSelectorBottomSheet$$ExternalSyntheticLambda17);
        selectorUserCell.setCallButtonsVisible(this.callButtonsVisible, false);
    }

    @Override
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View selectorUserCell;
        Context context = this.context;
        if (i == -1) {
            selectorUserCell = new View(context);
        } else if (i == 3) {
            selectorUserCell = new SelectorUserCell(this.context, this.needChecks, this.needChecks2, this.resourcesProvider, this.isGreenSelector);
        } else {
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (i == 5) {
                StickerEmptyView stickerEmptyView = new StickerEmptyView(context, null, 1, resourcesProvider);
                stickerEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
                stickerEmptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                stickerEmptyView.linearLayout.setTranslationY(AndroidUtilities.dp(24.0f));
                selectorUserCell = stickerEmptyView;
            } else if (i == 7) {
                selectorUserCell = new SelectorLetterCell(context, resourcesProvider);
            } else if (i == 6) {
                selectorUserCell = new SelectorCountryCell(context, resourcesProvider);
            } else if (i == 8) {
                selectorUserCell = new GraySectionCell(context, 16, resourcesProvider);
            } else if (i == 9) {
                TextCell textCell = new TextCell(23, this.context, this.resourcesProvider, false, false);
                textCell.leftPadding = 16;
                textCell.imageLeft = 19;
                selectorUserCell = textCell;
            } else {
                selectorUserCell = i == 10 ? new FrameLayout(context) : new View(context);
            }
        }
        return new RecyclerListView.Holder(selectorUserCell);
    }

    @Override
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        View view = viewHolder.itemView;
        if (view instanceof SelectorUserCell) {
            ((SelectorUserCell) view).setCallButtonsVisible(this.callButtonsVisible, false);
        }
    }
}
