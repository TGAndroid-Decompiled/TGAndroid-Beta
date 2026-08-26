package org.telegram.ui.Components.Premium.boosts.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.UserCell2;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.Premium.boosts.cells.AddChannelCell;
import org.telegram.ui.Components.Premium.boosts.cells.BoostTypeCell;
import org.telegram.ui.Components.Premium.boosts.cells.BoostTypeSingleCell;
import org.telegram.ui.Components.Premium.boosts.cells.ChatCell;
import org.telegram.ui.Components.Premium.boosts.cells.DateEndCell;
import org.telegram.ui.Components.Premium.boosts.cells.DurationCell;
import org.telegram.ui.Components.Premium.boosts.cells.EnterPrizeCell;
import org.telegram.ui.Components.Premium.boosts.cells.HeaderCell;
import org.telegram.ui.Components.Premium.boosts.cells.ParticipantsTypeCell;
import org.telegram.ui.Components.Premium.boosts.cells.SliderCell;
import org.telegram.ui.Components.Premium.boosts.cells.StarGiveawayOptionCell;
import org.telegram.ui.Components.Premium.boosts.cells.SubtitleWithCounterCell;
import org.telegram.ui.Components.Premium.boosts.cells.SwitcherCell;
import org.telegram.ui.Components.Premium.boosts.cells.TextInfoCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda26;
import org.telegram.ui.Stars.StarsIntroActivity;

public final class BoostAdapter extends AdapterWithDiffUtils {
    public BoostViaGiftsBottomSheet$$ExternalSyntheticLambda2 afterTextChangedListener;
    public BoostViaGiftsBottomSheet$$ExternalSyntheticLambda2 chatDeleteListener;
    public TLRPC.Chat currentChat;
    public HeaderCell headerCell;
    public RecyclerListView recyclerListView;
    public final Theme.ResourcesProvider resourcesProvider;
    public BoostViaGiftsBottomSheet$$ExternalSyntheticLambda2 sliderCallback;
    public ArrayList items = new ArrayList();
    public final HashMap chatsParticipantsCount = new HashMap();

    public final class Item extends AdapterWithDiffUtils.Item {
        public boolean boolValue;
        public TLRPC.Chat chat;
        public int intValue;
        public int intValue2;
        public long longValue;
        public TLObject object;
        public TLRPC.InputPeer peer;
        public int subType;
        public CharSequence text;
        public Object user;
        public List values;

        public static Item asChat(TLRPC.Chat chat, int i, boolean z) {
            Item item = new Item(9, false);
            item.chat = chat;
            item.peer = null;
            item.boolValue = z;
            item.intValue = i;
            return item;
        }

        public static Item asDivider(CharSequence charSequence, boolean z) {
            Item item = new Item(7, false);
            item.text = charSequence;
            item.boolValue = z;
            return item;
        }

        public static Item asParticipants(ArrayList arrayList, int i, boolean z, int i2) {
            Item item = new Item(11, i2 == i);
            item.subType = i;
            item.boolValue = z;
            item.user = arrayList;
            return item;
        }

        public static Item asSubTitle(String str) {
            Item item = new Item(6, false);
            item.text = str;
            return item;
        }

        public static boolean eq(List list, List list2) {
            if (list == null && list2 == null) {
                return true;
            }
            if (list == null || list2 == null || list.size() != list2.size()) {
                return false;
            }
            for (int i = 0; i < list.size(); i++) {
                if (((Integer) list.get(i)).intValue() != ((Integer) list2.get(i)).intValue()) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public final boolean contentsEquals(AdapterWithDiffUtils.Item item) {
            Item item2;
            int i;
            int i2;
            if (this == item) {
                return true;
            }
            if (item == null || Item.class != item.getClass() || (i = (item2 = (Item) item).viewType) != (i2 = this.viewType)) {
                return false;
            }
            if (i2 == 0) {
                return this.boolValue == item2.boolValue;
            }
            if (i == 17) {
                return this.intValue == item2.intValue && this.longValue == item2.longValue && this.object == item2.object && this.boolValue == item2.boolValue && this.selectable == item2.selectable;
            }
            if (i2 == 5) {
                return this.intValue == item2.intValue && eq(this.values, item2.values);
            }
            return i2 == 13 && this.intValue == item2.intValue && TextUtils.equals(this.text, item2.text);
        }

        public final boolean equals(Object obj) {
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
            if (i == 0) {
                return true;
            }
            if (i == 17) {
                return this.intValue == item.intValue && this.object == item.object;
            }
            if (i == 5) {
                return eq(this.values, item.values);
            }
            if (i == 13) {
                return TextUtils.equals(this.text, item.text);
            }
            return this.chat == item.chat && this.user == item.user && this.peer == item.peer && this.object == item.object && this.boolValue == item.boolValue && this.intValue == item.intValue && this.intValue2 == item.intValue2 && this.longValue == item.longValue && this.subType == item.subType && TextUtils.equals(this.text, item.text);
        }
    }

    public BoostAdapter(Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
        DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda6 = new DialogCell$$ExternalSyntheticLambda6(this, 15);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new GiftSheet$$ExternalSyntheticLambda26(5, messagesStorage, dialogCell$$ExternalSyntheticLambda6));
    }

    @Override
    public final int getItemCount() {
        return this.items.size();
    }

    @Override
    public final int getItemViewType(int i) {
        return ((Item) this.items.get(i)).viewType;
    }

    public final int getParticipantsCount$1(TLRPC.Chat chat) {
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
        int itemViewType = viewHolder.getItemViewType();
        return itemViewType == 2 || itemViewType == 11 || itemViewType == 8 || itemViewType == 10 || itemViewType == 15 || itemViewType == 12 || itemViewType == 17 || itemViewType == 18;
    }

    @Override
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int itemViewType = viewHolder.getItemViewType();
        Item item = (Item) this.items.get(i);
        if (itemViewType == 0) {
            HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
            this.headerCell = headerCell;
            headerCell.setBoostViaGifsText(this.currentChat);
            this.headerCell.setStars(item.boolValue);
            return;
        }
        if (itemViewType == 2) {
            BoostTypeCell boostTypeCell = (BoostTypeCell) viewHolder.itemView;
            int i2 = item.subType;
            int i3 = item.intValue;
            TLRPC.User user = (TLRPC.User) item.user;
            boolean z = item.selectable;
            boolean z2 = boostTypeCell.selectedType == i2;
            boostTypeCell.selectedType = i2;
            SimpleTextView simpleTextView = boostTypeCell.subtitleTextView;
            AvatarDrawable avatarDrawable = boostTypeCell.avatarDrawable;
            Theme.ResourcesProvider resourcesProvider = boostTypeCell.resourcesProvider;
            UserCell2.AnonymousClass1 anonymousClass1 = boostTypeCell.titleTextView;
            if (i2 == 0) {
                anonymousClass1.setText(LocaleController.getString(R.string.BoostingCreateGiveaway));
                boostTypeCell.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                simpleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, resourcesProvider));
                avatarDrawable.setAvatarType(16);
                avatarDrawable.setColor(-15292942, -15630089);
                boostTypeCell.setDivider(true);
                boostTypeCell.setBackground(Theme.getThemedDrawableByKey(boostTypeCell.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            } else if (i2 == 1) {
                anonymousClass1.setText(LocaleController.getString(R.string.BoostingAwardSpecificUsers));
                if (i3 == 1 && user != null) {
                    boostTypeCell.setSubtitle(boostTypeCell.withArrow(Emoji.replaceEmoji(UserObject.getUserName(user), simpleTextView.getPaint().getFontMetricsInt(), false)));
                } else if (i3 > 0) {
                    boostTypeCell.setSubtitle(boostTypeCell.withArrow(LocaleController.formatPluralString("Recipient", i3, new Object[0])));
                } else {
                    boostTypeCell.setSubtitle(boostTypeCell.withArrow(LocaleController.getString(R.string.BoostingSelectRecipients)));
                }
                simpleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlue2, resourcesProvider));
                avatarDrawable.setAvatarType(6);
                avatarDrawable.setColor(-3905294, -6923014);
                boostTypeCell.setDivider(false);
                boostTypeCell.setBackground(Theme.getThemedDrawableByKey(boostTypeCell.getContext(), R.drawable.greydivider_top, Theme.key_windowBackgroundGrayShadow));
            } else if (i2 == 2) {
                anonymousClass1.setText(LocaleController.getString(R.string.BoostingPremium));
                if (i3 == 1 && user != null) {
                    boostTypeCell.setSubtitle(boostTypeCell.withArrow(Emoji.replaceEmoji(UserObject.getUserName(user), simpleTextView.getPaint().getFontMetricsInt(), false)));
                } else if (i3 > 0) {
                    boostTypeCell.setSubtitle(boostTypeCell.withArrow(LocaleController.formatPluralString("Recipient", i3, new Object[0])));
                } else {
                    boostTypeCell.setSubtitle(boostTypeCell.withArrow(LocaleController.getString(R.string.BoostingWinnersRandomly)));
                }
                simpleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlue2, resourcesProvider));
                avatarDrawable.setAvatarType(25);
                avatarDrawable.setColor(-3905294, -6923014);
                boostTypeCell.setDivider(true);
                boostTypeCell.setBackground(Theme.getThemedDrawableByKey(boostTypeCell.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            } else if (i2 == 3) {
                anonymousClass1.setText(TextCell.applyNewSpan(LocaleController.getString(R.string.BoostingStars)));
                boostTypeCell.setSubtitle(LocaleController.getString(R.string.BoostingWinnersRandomly));
                simpleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, resourcesProvider));
                avatarDrawable.setAvatarType(26);
                avatarDrawable.setColor(-146917, -625593);
                boostTypeCell.setDivider(false);
                boostTypeCell.setBackground(Theme.getThemedDrawableByKey(boostTypeCell.getContext(), R.drawable.greydivider_top, Theme.key_windowBackgroundGrayShadow));
            }
            boostTypeCell.radioButton.setChecked(z, z2);
            BackupImageView backupImageView = boostTypeCell.imageView;
            backupImageView.setImageDrawable(avatarDrawable);
            backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
            return;
        }
        if (itemViewType == 5) {
            SliderCell sliderCell = (SliderCell) viewHolder.itemView;
            List list = item.values;
            int i4 = item.intValue;
            sliderCell.getClass();
            String[] strArr = new String[list.size()];
            for (int i5 = 0; i5 < list.size(); i5++) {
                strArr[i5] = String.valueOf((Integer) list.get(i5));
            }
            sliderCell.slideChooseView.setOptions(i4, strArr);
            sliderCell.setCallBack(this.sliderCallback);
            return;
        }
        if (itemViewType == 6) {
            ((org.telegram.ui.Cells.HeaderCell) viewHolder.itemView).setText(item.text);
            return;
        }
        if (itemViewType == 7) {
            TextInfoCell textInfoCell = (TextInfoCell) viewHolder.itemView;
            textInfoCell.setText(item.text);
            textInfoCell.setBackground(item.boolValue);
            return;
        }
        switch (itemViewType) {
            case 9:
                ChatCell chatCell = (ChatCell) viewHolder.itemView;
                TLRPC.InputPeer inputPeer = item.peer;
                if (inputPeer == null) {
                    TLRPC.Chat chat = item.chat;
                    chatCell.setChat(chat, item.intValue, item.boolValue, getParticipantsCount$1(chat));
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.chat_id));
                    chatCell.setChat(chat2, item.intValue, item.boolValue, getParticipantsCount$1(chat2));
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.Chat chat3 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                    chatCell.setChat(chat3, item.intValue, item.boolValue, getParticipantsCount$1(chat3));
                }
                chatCell.setChatDeleteListener(this.chatDeleteListener);
                break;
            case 10:
                ((DateEndCell) viewHolder.itemView).setDate(item.longValue);
                break;
            case 11:
                ParticipantsTypeCell participantsTypeCell = (ParticipantsTypeCell) viewHolder.itemView;
                int i6 = item.subType;
                boolean z3 = item.selectable;
                boolean z4 = item.boolValue;
                List list2 = (List) item.user;
                TLRPC.Chat chat4 = this.currentChat;
                participantsTypeCell.selectedType = i6;
                boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat4);
                UserCell2.AnonymousClass1 anonymousClass2 = participantsTypeCell.titleTextView;
                if (i6 == 0) {
                    anonymousClass2.setText(LocaleController.formatString(zIsChannelAndNotMegaGroup ? R.string.BoostingAllSubscribers : R.string.BoostingAllMembers, new Object[0]));
                } else if (i6 == 1) {
                    anonymousClass2.setText(LocaleController.formatString(zIsChannelAndNotMegaGroup ? R.string.BoostingNewSubscribers : R.string.BoostingNewMembers, new Object[0]));
                }
                participantsTypeCell.radioButton.setChecked(z3, false);
                participantsTypeCell.setDivider(z4);
                participantsTypeCell.subtitleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlue2, participantsTypeCell.resourcesProvider));
                if (list2.size() == 0) {
                    participantsTypeCell.setSubtitle(participantsTypeCell.withArrow(LocaleController.getString(R.string.BoostingFromAllCountries)));
                } else if (list2.size() > 3) {
                    participantsTypeCell.setSubtitle(participantsTypeCell.withArrow(LocaleController.formatPluralString("BoostingFromCountriesCount", list2.size(), new Object[0])));
                } else if (list2.size() == 1) {
                    participantsTypeCell.setSubtitle(participantsTypeCell.withArrow(LocaleController.formatString("BoostingFromAllCountries1", R.string.BoostingFromAllCountries1, ((TLRPC.TL_help_country) list2.get(0)).default_name)));
                } else if (list2.size() == 2) {
                    participantsTypeCell.setSubtitle(participantsTypeCell.withArrow(LocaleController.formatString("BoostingFromAllCountries2", R.string.BoostingFromAllCountries2, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name)));
                } else {
                    participantsTypeCell.setSubtitle(participantsTypeCell.withArrow(LocaleController.formatString("BoostingFromAllCountries3", R.string.BoostingFromAllCountries3, ((TLRPC.TL_help_country) list2.get(0)).default_name, ((TLRPC.TL_help_country) list2.get(1)).default_name, ((TLRPC.TL_help_country) list2.get(2)).default_name)));
                }
                break;
            case 12:
                DurationCell durationCell = (DurationCell) viewHolder.itemView;
                TLObject tLObject = item.object;
                int i7 = item.intValue;
                int i8 = item.intValue2;
                long j = item.longValue;
                CharSequence charSequence = item.text;
                boolean z5 = item.boolValue;
                boolean z6 = item.selectable;
                durationCell.code = tLObject;
                UserCell2.AnonymousClass1 anonymousClass3 = durationCell.titleTextView;
                if (i7 >= 12) {
                    anonymousClass3.setText(LocaleController.formatPluralString("Years", 1, new Object[0]));
                } else {
                    anonymousClass3.setText(LocaleController.formatPluralString("Months", i7, new Object[0]));
                }
                StringBuilder sb = new StringBuilder();
                sb.append(BillingController.getInstance().formatCurrency(i8 > 0 ? j / ((long) i8) : j, charSequence.toString()));
                sb.append(" x ");
                sb.append(i8);
                durationCell.setSubtitle(sb.toString());
                SimpleTextView simpleTextView2 = durationCell.totalTextView;
                BillingController billingController = BillingController.getInstance();
                if (i8 <= 0) {
                    j = 0;
                }
                simpleTextView2.setText(billingController.formatCurrency(j, charSequence.toString()));
                durationCell.setDivider(z5);
                durationCell.radioButton.setChecked(z6, false);
                break;
            case 13:
                SubtitleWithCounterCell subtitleWithCounterCell = (SubtitleWithCounterCell) viewHolder.itemView;
                subtitleWithCounterCell.setText(item.text);
                int i9 = item.intValue;
                String pluralString = i9 > 0 ? LocaleController.formatPluralString("BoostingBoostsCountTitle", i9, Integer.valueOf(i9)) : "";
                AnimatedTextView animatedTextView = subtitleWithCounterCell.counterTextView;
                animatedTextView.cancelAnimation();
                animatedTextView.setText(pluralString, true);
                break;
            case 14:
                ((BoostTypeSingleCell) viewHolder.itemView).setGiveaway((TL_stories.PrepaidGiveaway) item.user);
                break;
            case 15:
                SwitcherCell switcherCell = (SwitcherCell) viewHolder.itemView;
                CharSequence charSequence2 = item.text;
                boolean z7 = item.selectable;
                boolean z8 = item.boolValue;
                switcherCell.type = item.subType;
                switcherCell.setTextAndCheck(charSequence2, z7, z8);
                break;
            case 16:
                EnterPrizeCell enterPrizeCell = (EnterPrizeCell) viewHolder.itemView;
                enterPrizeCell.setCount(item.intValue);
                enterPrizeCell.setAfterTextChangedListener(this.afterTextChangedListener);
                break;
            case 17:
                StarGiveawayOptionCell starGiveawayOptionCell = (StarGiveawayOptionCell) viewHolder.itemView;
                TLObject tLObject2 = item.object;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = tLObject2 == null ? null : (TL_stars.TL_starsGiveawayOption) tLObject2;
                int i10 = item.intValue;
                long j2 = item.longValue;
                boolean z9 = item.selectable;
                boolean z10 = starGiveawayOptionCell.currentOption == tL_starsGiveawayOption;
                starGiveawayOptionCell.radioButton.setChecked(z9, z10);
                starGiveawayOptionCell.currentOption = tL_starsGiveawayOption;
                AnimatedTextView animatedTextView2 = starGiveawayOptionCell.subtitleView;
                if (z10) {
                    animatedTextView2.cancelAnimation();
                }
                TextView textView = starGiveawayOptionCell.priceView;
                AnimatedTextView animatedTextView3 = starGiveawayOptionCell.titleView;
                if (tL_starsGiveawayOption == null) {
                    animatedTextView3.setText(starGiveawayOptionCell.loading1, false);
                    animatedTextView2.setText(starGiveawayOptionCell.loading2, z10);
                    textView.setText("");
                } else {
                    animatedTextView3.setText(LocaleController.formatPluralStringComma("GiveawayStars", (int) tL_starsGiveawayOption.stars, ' '), false);
                    animatedTextView2.setText(LocaleController.formatPluralStringComma("BoostingStarOptionPerUser", (int) j2, ','), z10);
                    textView.setText(BillingController.getInstance().formatCurrency(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                }
                int i11 = i10 + 1;
                starGiveawayOptionCell.starsCount = i11;
                if (!z10) {
                    starGiveawayOptionCell.animatedStarsCount.set(i11, true);
                }
                starGiveawayOptionCell.invalidate();
                break;
        }
    }

    @Override
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View boostTypeCell;
        Context context = viewGroup.getContext();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        switch (i) {
            case 2:
                boostTypeCell = new BoostTypeCell(context, resourcesProvider);
                break;
            case 3:
                boostTypeCell = new View(context);
                break;
            case 4:
                boostTypeCell = new ShadowSectionCell(context, Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider));
                break;
            case 5:
                boostTypeCell = new SliderCell(context, resourcesProvider);
                break;
            case 6:
                org.telegram.ui.Cells.HeaderCell headerCell = new org.telegram.ui.Cells.HeaderCell(context, Theme.key_windowBackgroundWhiteBlueHeader, 21, 15, 3, false, false, this.resourcesProvider);
                headerCell.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
                boostTypeCell = headerCell;
                break;
            case 7:
                boostTypeCell = new TextInfoCell(context, resourcesProvider);
                break;
            case 8:
                boostTypeCell = new AddChannelCell(context, resourcesProvider);
                break;
            case 9:
                boostTypeCell = new ChatCell(context, resourcesProvider);
                break;
            case 10:
                boostTypeCell = new DateEndCell(context, resourcesProvider);
                break;
            case 11:
                ParticipantsTypeCell participantsTypeCell = new ParticipantsTypeCell(context, resourcesProvider);
                participantsTypeCell.imageView.setVisibility(8);
                boostTypeCell = participantsTypeCell;
                break;
            case 12:
                boostTypeCell = new DurationCell(context, resourcesProvider);
                break;
            case 13:
                SubtitleWithCounterCell subtitleWithCounterCell = new SubtitleWithCounterCell(context, resourcesProvider);
                subtitleWithCounterCell.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
                boostTypeCell = subtitleWithCounterCell;
                break;
            case 14:
                boostTypeCell = new BoostTypeSingleCell(context, resourcesProvider);
                break;
            case 15:
                SwitcherCell switcherCell = new SwitcherCell(context, 21, false, resourcesProvider);
                switcherCell.setHeight(50);
                boostTypeCell = switcherCell;
                break;
            case 16:
                boostTypeCell = new EnterPrizeCell(context, resourcesProvider);
                break;
            case 17:
                boostTypeCell = new StarGiveawayOptionCell(context, resourcesProvider);
                break;
            case 18:
                StarsIntroActivity.ExpandView expandView = new StarsIntroActivity.ExpandView(context);
                expandView.set(LocaleController.getString(R.string.NotifyMoreOptions));
                boostTypeCell = expandView;
                break;
            default:
                boostTypeCell = new HeaderCell(context, resourcesProvider);
                break;
        }
        return zzkd.m(boostTypeCell, boostTypeCell, -2);
    }
}
