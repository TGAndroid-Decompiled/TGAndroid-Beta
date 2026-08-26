package org.telegram.ui.Components.Premium.boosts.adapters;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ImageUpdater$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.Premium.boosts.cells.ActionBtnCell;
import org.telegram.ui.Components.Premium.boosts.cells.HeaderCell;
import org.telegram.ui.Components.Premium.boosts.cells.LinkCell;
import org.telegram.ui.Components.Premium.boosts.cells.TableCell;
import org.telegram.ui.Components.Premium.boosts.cells.TextInfoCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchField$$ExternalSyntheticLambda0;
import org.telegram.ui.ContactAddActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda14;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public abstract class GiftInfoAdapter extends RecyclerListView.SelectionAdapter {
    public BaseFragment baseFragment;
    public BottomSheet.ContainerView container;
    public TLRPC.TL_payments_checkedGiftCode giftCode;
    public boolean isUnused;
    public final Theme.ResourcesProvider resourcesProvider;
    public String slug;

    public GiftInfoAdapter(Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
    }

    @Override
    public final int getItemCount() {
        return 5;
    }

    @Override
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 5;
                    }
                }
            }
        }
        return i2;
    }

    @Override
    public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        return false;
    }

    @Override
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        final int i2 = 0;
        int i3 = viewHolder.mItemViewType;
        View view = viewHolder.itemView;
        if (i3 == 0) {
            HeaderCell headerCell = (HeaderCell) view;
            if (this.isUnused) {
                headerCell.titleView.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
                headerCell.subtitleView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkAllows", R.string.BoostingLinkAllows, new Object[0])));
            } else {
                headerCell.titleView.setText(LocaleController.formatString("BoostingUsedGiftLink", R.string.BoostingUsedGiftLink, new Object[0]));
                headerCell.subtitleView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkUsed", R.string.BoostingLinkUsed, new Object[0])));
            }
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = this.giftCode;
            if (tL_payments_checkedGiftCode.boost != null) {
                long j = tL_payments_checkedGiftCode.to_id;
                final PollItemMenu$$ExternalSyntheticLambda14 pollItemMenu$$ExternalSyntheticLambda14 = new PollItemMenu$$ExternalSyntheticLambda14(this, 2);
                headerCell.titleView.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
                SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingLinkAllowsToUser));
                final TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j));
                final int i4 = 1;
                headerCell.subtitleView.setText(AndroidUtilities.replaceCharSequence("%1$s", spannableStringBuilderReplaceTags, AndroidUtilities.replaceSingleTag("**" + UserObject.getUserName(user) + "**", Theme.key_chat_messageLinkIn, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (i4) {
                            case 0:
                                pollItemMenu$$ExternalSyntheticLambda14.run(user);
                                break;
                            default:
                                pollItemMenu$$ExternalSyntheticLambda14.run(user);
                                break;
                        }
                    }
                }, headerCell.resourcesProvider)));
            }
            if (this.giftCode.to_id == -1) {
                headerCell.titleView.setText(LocaleController.formatString("BoostingGiftLink", R.string.BoostingGiftLink, new Object[0]));
                headerCell.subtitleView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingLinkAllowsAnyone", R.string.BoostingLinkAllowsAnyone, new Object[0])));
                return;
            }
            return;
        }
        if (i3 == 1) {
            LinkCell linkCell = (LinkCell) view;
            linkCell.setSlug(this.slug);
            if (this.giftCode.boost != null && this.slug == null) {
                linkCell.hideSlug(new GiftInfoAdapter$$ExternalSyntheticLambda2(this, 1));
            }
            String str = this.slug;
            if ((str == null || str.isEmpty()) && this.giftCode.to_id == -1) {
                linkCell.hideSlug(new GiftInfoAdapter$$ExternalSyntheticLambda2(this, 1));
                return;
            }
            return;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    return;
                }
                ActionBtnCell actionBtnCell = (ActionBtnCell) view;
                actionBtnCell.setOkStyle(this.isUnused);
                actionBtnCell.setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda8(9, this, actionBtnCell));
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode2 = this.giftCode;
                if (tL_payments_checkedGiftCode2.boost != null || tL_payments_checkedGiftCode2.flags == -1) {
                    actionBtnCell.drawDivider = false;
                    ButtonWithCounterView buttonWithCounterView = actionBtnCell.button;
                    buttonWithCounterView.setShowZero(false);
                    buttonWithCounterView.setEnabled(true);
                    buttonWithCounterView.setText(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
                    actionBtnCell.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 20));
                    return;
                }
                return;
            }
            TextInfoCell textInfoCell = (TextInfoCell) view;
            textInfoCell.setTextGravity(17);
            textInfoCell.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            textInfoCell.setTopPadding(14);
            textInfoCell.setBottomPadding(15);
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode3 = this.giftCode;
            if (tL_payments_checkedGiftCode3.boost == null) {
                if (this.isUnused) {
                    textInfoCell.setText(AndroidUtilities.replaceSingleTag(tL_payments_checkedGiftCode3.to_id == -1 ? LocaleController.getString(R.string.BoostingSendLinkToAnyone) : LocaleController.getString(R.string.BoostingSendLinkToFriends), Theme.key_chat_messageLinkIn, 0, new GiftInfoAdapter$$ExternalSyntheticLambda2(this, i2), this.resourcesProvider));
                    return;
                } else {
                    Date date = new Date(((long) this.giftCode.used_date) * 1000);
                    textInfoCell.setText(LocaleController.formatString("BoostingUsedLinkDate", R.string.BoostingUsedLinkDate, LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date), LocaleController.getInstance().getFormatterDay().format(date))));
                    return;
                }
            }
            String str2 = this.slug;
            if (str2 == null || str2.isEmpty()) {
                textInfoCell.setText(LocaleController.getString(R.string.BoostingLinkNotActivated));
                return;
            } else {
                textInfoCell.setFixedSize(14);
                textInfoCell.setText(null);
                return;
            }
        }
        TableCell tableCell = (TableCell) view;
        final TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode4 = this.giftCode;
        final PollItemMenu$$ExternalSyntheticLambda14 pollItemMenu$$ExternalSyntheticLambda15 = new PollItemMenu$$ExternalSyntheticLambda14(this, 2);
        tableCell.getClass();
        Date date2 = new Date(((long) tL_payments_checkedGiftCode4.date) * 1000);
        tableCell.dateTextView.setText(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(date2), LocaleController.getInstance().getFormatterDay().format(date2)));
        int i5 = tL_payments_checkedGiftCode4.via_giveaway ? Theme.key_dialogTextBlue : Theme.key_dialogTextBlack;
        Theme.ResourcesProvider resourcesProvider = tableCell.resourcesProvider;
        int color = Theme.getColor(i5, resourcesProvider);
        TextView textView = tableCell.reasonTextView;
        textView.setTextColor(color);
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_payments_checkedGiftCode4.from_id)));
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "**");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.BoostingGiveaway));
            spannableStringBuilder.append((CharSequence) "**");
            textView.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder.toString(), Theme.key_chat_messageLinkIn, 0, new Runnable() {
                @Override
                public final void run() {
                    switch (i2) {
                        case 0:
                            pollItemMenu$$ExternalSyntheticLambda15.run(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            pollItemMenu$$ExternalSyntheticLambda15.run(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, resourcesProvider));
            textView.setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda8(11, pollItemMenu$$ExternalSyntheticLambda15, tL_payments_checkedGiftCode4));
        } else {
            textView.setText(LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.BoostingYouWereSelected : R.string.BoostingYouWereSelectedGroup));
            textView.setOnClickListener(null);
        }
        int i6 = tL_payments_checkedGiftCode4.months;
        tableCell.giftTextView.setText(LocaleController.formatString("BoostingTelegramPremiumFor", R.string.BoostingTelegramPremiumFor, i6 == 12 ? LocaleController.formatPluralString("Years", 1, new Object[0]) : LocaleController.formatPluralString("Months", i6, new Object[0])));
        FrameLayout frameLayout = tableCell.fromFrameLayout;
        BackupImageView backupImageView = tableCell.fromImageView;
        TextView textView2 = tableCell.fromTextView;
        if (chat != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "**");
            spannableStringBuilder2.append((CharSequence) chat.title);
            spannableStringBuilder2.append((CharSequence) "**");
            textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder2.toString(), Theme.key_chat_messageLinkIn, 0, new ImageUpdater$$ExternalSyntheticLambda2(29, pollItemMenu$$ExternalSyntheticLambda15, chat), resourcesProvider), textView2.getPaint().getFontMetricsInt(), false));
            backupImageView.imageReceiver.setForUserOrChat(chat, new AvatarDrawable(chat));
            backupImageView.onNewImageSet();
            frameLayout.setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda8(12, pollItemMenu$$ExternalSyntheticLambda15, chat));
        } else {
            final TLRPC.User user2 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode4.from_id.user_id));
            final int i7 = 0;
            textView2.setText(Emoji.replaceEmoji(UserObject.getFirstName(user2), textView2.getPaint().getFontMetricsInt(), false));
            backupImageView.imageReceiver.setForUserOrChat(user2, new AvatarDrawable(user2));
            backupImageView.onNewImageSet();
            frameLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (i7) {
                        case 0:
                            pollItemMenu$$ExternalSyntheticLambda15.run(user2);
                            break;
                        default:
                            pollItemMenu$$ExternalSyntheticLambda15.run(user2);
                            break;
                    }
                }
            });
        }
        long j2 = tL_payments_checkedGiftCode4.to_id;
        BackupImageView backupImageView2 = tableCell.toImageView;
        TextView textView3 = tableCell.toTextView;
        if (j2 == -1 && tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) "**");
            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.BoostingIncompleteGiveaway));
            spannableStringBuilder3.append((CharSequence) "**");
            final int i8 = 1;
            textView.setText(AndroidUtilities.replaceSingleTag(spannableStringBuilder3.toString(), Theme.key_chat_messageLinkIn, 0, new Runnable() {
                @Override
                public final void run() {
                    switch (i8) {
                        case 0:
                            pollItemMenu$$ExternalSyntheticLambda15.run(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            pollItemMenu$$ExternalSyntheticLambda15.run(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, resourcesProvider));
            textView3.setText(LocaleController.getString(R.string.BoostingNoRecipient));
            textView3.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).rightMargin = 0;
            backupImageView2.setVisibility(8);
        } else {
            final TLRPC.User user3 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(tL_payments_checkedGiftCode4.to_id));
            if (user3 != null) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                spannableStringBuilder4.append((CharSequence) "**");
                spannableStringBuilder4.append((CharSequence) UserObject.getFirstName(user3));
                spannableStringBuilder4.append((CharSequence) "**");
                final int i9 = 0;
                textView3.setText(Emoji.replaceEmoji(AndroidUtilities.replaceSingleTag(spannableStringBuilder4.toString(), Theme.key_chat_messageLinkIn, 0, new Runnable() {
                    @Override
                    public final void run() {
                        switch (i9) {
                            case 0:
                                pollItemMenu$$ExternalSyntheticLambda15.run(user3);
                                break;
                            default:
                                pollItemMenu$$ExternalSyntheticLambda15.run(user3);
                                break;
                        }
                    }
                }, resourcesProvider), textView3.getPaint().getFontMetricsInt(), false));
                backupImageView2.imageReceiver.setForUserOrChat(user3, new AvatarDrawable(user3));
                backupImageView2.onNewImageSet();
                final int i10 = 1;
                tableCell.toFrameLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        switch (i10) {
                            case 0:
                                pollItemMenu$$ExternalSyntheticLambda15.run(user3);
                                break;
                            default:
                                pollItemMenu$$ExternalSyntheticLambda15.run(user3);
                                break;
                        }
                    }
                });
            }
        }
        if (tL_payments_checkedGiftCode4.boost != null) {
            tableCell.tableRow4.setVisibility(8);
        }
    }

    @Override
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View linkCell;
        Context context = viewGroup.getContext();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (i == 1) {
            linkCell = new LinkCell(context, resourcesProvider);
        } else if (i == 2) {
            linkCell = new TableCell(context, resourcesProvider);
        } else if (i == 3) {
            linkCell = new TextInfoCell(context, resourcesProvider);
        } else if (i != 4) {
            linkCell = i != 5 ? new HeaderCell(context, resourcesProvider) : new View(context);
        } else {
            linkCell = new ActionBtnCell(context, resourcesProvider);
            linkCell.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
        }
        return zzkl.m(linkCell, linkCell);
    }

    public abstract void onHiddenLinkClicked();

    public abstract void onObjectClicked(TLObject tLObject);
}
