package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.internal.mlkit_vision_common.zzlf;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.DialogRadioCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCheckCell2;
import org.telegram.ui.Cells.TextDetailCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Cells.UserCell2;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.GuardBotReplaceSheet;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.TagEditCell;
import org.telegram.ui.Gifts.AuctionBidSheet$$ExternalSyntheticLambda15;

public class ChatRightsEditActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public int addAdminsRow;
    public FrameLayout addBotButton;
    public FrameLayout addBotButtonContainer;
    public int addBotButtonRow;
    public AnimatedTextView addBotButtonText;
    public int addUsersRow;
    public final TLRPC.TL_chatAdminRights adminRights;
    public int anonymousRow;
    public boolean asAdmin;
    public ValueAnimator asAdminAnimator;
    public float asAdminT;
    public int banUsersRow;
    public TLRPC.TL_chatBannedRights bannedRights;
    public boolean banning;
    public final String botHash;
    public final boolean canEdit;
    public int cantEditInfoRow;
    public int changeInfoRow;
    public int channelDeleteMessagesRow;
    public int channelDeleteStoriesRow;
    public int channelEditMessagesRow;
    public int channelEditStoriesRow;
    public boolean channelMessagesExpanded;
    public int channelMessagesRow;
    public int channelPostMessagesRow;
    public int channelPostStoriesRow;
    public boolean channelStoriesExpanded;
    public int channelStoriesRow;
    public long chatId;
    public TLRPC.ChatFull chatInfo;
    public final String currentBannedRights;
    public TLRPC.Chat currentChat;
    public String currentRank;
    public final int currentType;
    public final TLRPC.User currentUser;
    public final boolean currentUserIsBotGuard;
    public final TLRPC.TL_chatBannedRights defaultBannedRights;
    public ChatRightsEditActivityDelegate delegate;
    public int deleteMessagesRow;
    public CrossfadeDrawable doneDrawable;
    public ValueAnimator doneDrawableAnimator;
    public int editMesagesRow;
    public int editTagsRow;
    public int embedLinksRow;
    public long guardBotIdToSet;
    public int guardBotInfoRow;
    public int guardBotRow;
    public boolean hasGuardBotToSet;
    public final boolean initialAsAdmin;
    public final boolean initialIsSet;
    public final String initialRank;
    public final boolean isAddingNew;
    public final boolean isChannel;
    public final boolean isCommunity;
    public final boolean isForum;
    public PhotoViewer.AnonymousClass36 linearLayoutManager;
    public ChatActivity.AnonymousClass34 listView;
    public ListAdapter listViewAdapter;
    public boolean loading;
    public int manageDirectRow;
    public int manageLinkedPeersRow;
    public int manageRow;
    public int manageTopicsRow;
    public int manageWelcomeRow;
    public final TLRPC.TL_chatAdminRights myAdminRights;
    public int pinMessagesRow;
    public int postMessagesRow;
    public int rankHeaderRow;
    public int rankInfoRow;
    public int rankRow;
    public int removeAdminRow;
    public int removeAdminShadowRow;
    public int rightsShadowRow;
    public int rowCount;
    public int sendFilesRow;
    public boolean sendMediaExpanded;
    public int sendMediaRow;
    public int sendMessagesRow;
    public int sendMusicRow;
    public int sendPhotosRow;
    public int sendPollsRow;
    public int sendReactionsRow;
    public int sendRoundRow;
    public int sendStickersRow;
    public int sendVideosRow;
    public int sendVoiceRow;
    public int startVoiceChatRow;
    public int transferOwnerRow;
    public int transferOwnerShadowRow;
    public int untilDateRow;
    public int untilSectionRow;

    public interface ChatRightsEditActivityDelegate {
        void didChangeOwner(TLRPC.User user);

        void didSetRights(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str);
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public boolean ignoreTextChange;
        public final Context mContext;

        public ListAdapter(Context context) {
            if (ChatRightsEditActivity.this.currentType == 2) {
                setHasStableIds(true);
            }
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return ChatRightsEditActivity.this.rowCount;
        }

        @Override
        public final long getItemId(int i) {
            ChatRightsEditActivity chatRightsEditActivity = ChatRightsEditActivity.this;
            if (chatRightsEditActivity.currentType != 2) {
                return -1L;
            }
            if (i == chatRightsEditActivity.manageRow) {
                return 1L;
            }
            if (i == chatRightsEditActivity.changeInfoRow) {
                return 2L;
            }
            if (i == chatRightsEditActivity.postMessagesRow) {
                return 3L;
            }
            if (i == chatRightsEditActivity.editMesagesRow) {
                return 4L;
            }
            if (i == chatRightsEditActivity.deleteMessagesRow) {
                return 5L;
            }
            if (i == chatRightsEditActivity.addAdminsRow) {
                return 6L;
            }
            if (i == chatRightsEditActivity.anonymousRow) {
                return 7L;
            }
            if (i == chatRightsEditActivity.banUsersRow) {
                return 8L;
            }
            if (i == chatRightsEditActivity.addUsersRow) {
                return 9L;
            }
            if (i == chatRightsEditActivity.pinMessagesRow) {
                return 10L;
            }
            if (i == chatRightsEditActivity.rightsShadowRow) {
                return 11L;
            }
            if (i == chatRightsEditActivity.removeAdminRow) {
                return 12L;
            }
            if (i == chatRightsEditActivity.removeAdminShadowRow) {
                return 13L;
            }
            if (i == chatRightsEditActivity.cantEditInfoRow) {
                return 14L;
            }
            if (i == chatRightsEditActivity.transferOwnerShadowRow) {
                return 15L;
            }
            if (i == chatRightsEditActivity.transferOwnerRow) {
                return 16L;
            }
            if (i == chatRightsEditActivity.rankHeaderRow) {
                return 17L;
            }
            if (i == chatRightsEditActivity.rankRow) {
                return 18L;
            }
            if (i == chatRightsEditActivity.rankInfoRow) {
                return 19L;
            }
            if (i == chatRightsEditActivity.sendMessagesRow) {
                return 20L;
            }
            if (i == chatRightsEditActivity.sendPhotosRow) {
                return 21L;
            }
            if (i == chatRightsEditActivity.sendStickersRow) {
                return 22L;
            }
            if (i == chatRightsEditActivity.sendPollsRow) {
                return 23L;
            }
            if (i == chatRightsEditActivity.embedLinksRow) {
                return 24L;
            }
            if (i == chatRightsEditActivity.startVoiceChatRow) {
                return 25L;
            }
            if (i == chatRightsEditActivity.untilSectionRow) {
                return 26L;
            }
            if (i == chatRightsEditActivity.untilDateRow) {
                return 27L;
            }
            if (i == chatRightsEditActivity.addBotButtonRow) {
                return 28L;
            }
            if (i == chatRightsEditActivity.manageTopicsRow) {
                return 29L;
            }
            if (i == chatRightsEditActivity.sendVideosRow) {
                return 30L;
            }
            if (i == chatRightsEditActivity.sendFilesRow) {
                return 31L;
            }
            if (i == chatRightsEditActivity.sendMusicRow) {
                return 32L;
            }
            if (i == chatRightsEditActivity.sendVoiceRow) {
                return 33L;
            }
            if (i == chatRightsEditActivity.sendRoundRow) {
                return 34L;
            }
            if (i == chatRightsEditActivity.sendMediaRow) {
                return 35L;
            }
            if (i == chatRightsEditActivity.channelMessagesRow) {
                return 36L;
            }
            if (i == chatRightsEditActivity.channelPostMessagesRow) {
                return 37L;
            }
            if (i == chatRightsEditActivity.channelEditMessagesRow) {
                return 38L;
            }
            if (i == chatRightsEditActivity.channelDeleteMessagesRow) {
                return 39L;
            }
            if (i == chatRightsEditActivity.channelStoriesRow) {
                return 40L;
            }
            if (i == chatRightsEditActivity.channelPostStoriesRow) {
                return 41L;
            }
            if (i == chatRightsEditActivity.channelEditStoriesRow) {
                return 42L;
            }
            if (i == chatRightsEditActivity.channelDeleteStoriesRow) {
                return 43L;
            }
            if (i == chatRightsEditActivity.manageDirectRow) {
                return 44L;
            }
            if (i == chatRightsEditActivity.editTagsRow) {
                return 45L;
            }
            if (i == chatRightsEditActivity.sendReactionsRow) {
                return 46L;
            }
            if (i == chatRightsEditActivity.guardBotRow) {
                return 47L;
            }
            if (i == chatRightsEditActivity.guardBotInfoRow) {
                return 48L;
            }
            if (i == chatRightsEditActivity.manageLinkedPeersRow) {
                return 49L;
            }
            return i == chatRightsEditActivity.manageWelcomeRow ? 50L : 0L;
        }

        @Override
        public final int getItemViewType(int i) {
            ChatRightsEditActivity chatRightsEditActivity = ChatRightsEditActivity.this;
            if (i == chatRightsEditActivity.sendStickersRow || i == chatRightsEditActivity.embedLinksRow || i == chatRightsEditActivity.sendPollsRow || i == chatRightsEditActivity.sendPhotosRow || i == chatRightsEditActivity.sendVideosRow || i == chatRightsEditActivity.sendFilesRow || i == chatRightsEditActivity.sendMusicRow || i == chatRightsEditActivity.sendRoundRow || i == chatRightsEditActivity.sendVoiceRow || i == chatRightsEditActivity.sendReactionsRow || i == chatRightsEditActivity.channelPostMessagesRow || i == chatRightsEditActivity.channelEditMessagesRow || i == chatRightsEditActivity.channelDeleteMessagesRow || i == chatRightsEditActivity.channelPostStoriesRow || i == chatRightsEditActivity.channelEditStoriesRow || i == chatRightsEditActivity.channelDeleteStoriesRow) {
                return 10;
            }
            if (i == chatRightsEditActivity.sendMediaRow || i == chatRightsEditActivity.channelMessagesRow || i == chatRightsEditActivity.channelStoriesRow) {
                return 9;
            }
            if (i == 0) {
                return 0;
            }
            if (i == 1 || i == chatRightsEditActivity.rightsShadowRow || i == chatRightsEditActivity.removeAdminShadowRow || i == chatRightsEditActivity.untilSectionRow || i == chatRightsEditActivity.transferOwnerShadowRow) {
                return 5;
            }
            if (i == 2 || i == chatRightsEditActivity.rankHeaderRow) {
                return 3;
            }
            if (i == chatRightsEditActivity.changeInfoRow || i == chatRightsEditActivity.postMessagesRow || i == chatRightsEditActivity.manageDirectRow || i == chatRightsEditActivity.editMesagesRow || i == chatRightsEditActivity.deleteMessagesRow || i == chatRightsEditActivity.addAdminsRow || i == chatRightsEditActivity.banUsersRow || i == chatRightsEditActivity.addUsersRow || i == chatRightsEditActivity.pinMessagesRow || i == chatRightsEditActivity.editTagsRow || i == chatRightsEditActivity.sendMessagesRow || i == chatRightsEditActivity.anonymousRow || i == chatRightsEditActivity.startVoiceChatRow || i == chatRightsEditActivity.manageRow || i == chatRightsEditActivity.manageTopicsRow || i == chatRightsEditActivity.guardBotRow || i == chatRightsEditActivity.manageLinkedPeersRow || i == chatRightsEditActivity.manageWelcomeRow) {
                return 4;
            }
            if (i == chatRightsEditActivity.cantEditInfoRow || i == chatRightsEditActivity.rankInfoRow || i == chatRightsEditActivity.guardBotInfoRow) {
                return 1;
            }
            if (i == chatRightsEditActivity.untilDateRow) {
                return 6;
            }
            if (i == chatRightsEditActivity.rankRow) {
                return 11;
            }
            return i == chatRightsEditActivity.addBotButtonRow ? 8 : 2;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            TLRPC.Chat chat;
            int i = viewHolder.mItemViewType;
            ChatRightsEditActivity chatRightsEditActivity = ChatRightsEditActivity.this;
            boolean z = chatRightsEditActivity.currentChat.creator;
            int i2 = chatRightsEditActivity.currentType;
            if (!z || ((i2 != 0 && (i2 != 2 || !chatRightsEditActivity.asAdmin)) || i != 4 || viewHolder.getAdapterPosition() != chatRightsEditActivity.anonymousRow)) {
                if (!chatRightsEditActivity.canEdit) {
                    return false;
                }
                if ((i2 != 0 && i2 != 2) || i != 4) {
                    return i != 3 ? false : false;
                }
                int adapterPosition = viewHolder.getAdapterPosition();
                int i3 = chatRightsEditActivity.manageRow;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = chatRightsEditActivity.myAdminRights;
                if (adapterPosition == i3) {
                    if (!tL_chatAdminRights.add_admins && ((chat = chatRightsEditActivity.currentChat) == null || !chat.creator)) {
                        return false;
                    }
                } else {
                    if (i2 == 2 && !chatRightsEditActivity.asAdmin) {
                        return false;
                    }
                    int i4 = chatRightsEditActivity.changeInfoRow;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = chatRightsEditActivity.defaultBannedRights;
                    if (adapterPosition == i4) {
                        if (!tL_chatAdminRights.change_info) {
                            return false;
                        }
                        if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !chatRightsEditActivity.isChannel) {
                            return false;
                        }
                    } else {
                        if (adapterPosition == chatRightsEditActivity.postMessagesRow) {
                            return tL_chatAdminRights.post_messages;
                        }
                        if (adapterPosition == chatRightsEditActivity.manageDirectRow) {
                            return tL_chatAdminRights.manage_direct_messages;
                        }
                        if (adapterPosition == chatRightsEditActivity.manageWelcomeRow) {
                            return tL_chatAdminRights.manage_welcome_messages;
                        }
                        if (adapterPosition == chatRightsEditActivity.editMesagesRow) {
                            return tL_chatAdminRights.edit_messages;
                        }
                        if (adapterPosition == chatRightsEditActivity.deleteMessagesRow) {
                            return tL_chatAdminRights.delete_messages;
                        }
                        if (adapterPosition == chatRightsEditActivity.startVoiceChatRow) {
                            return tL_chatAdminRights.manage_call;
                        }
                        if (adapterPosition == chatRightsEditActivity.addAdminsRow) {
                            return tL_chatAdminRights.add_admins;
                        }
                        if (adapterPosition == chatRightsEditActivity.anonymousRow) {
                            return tL_chatAdminRights.anonymous;
                        }
                        if (adapterPosition == chatRightsEditActivity.banUsersRow) {
                            return tL_chatAdminRights.ban_users;
                        }
                        if (adapterPosition == chatRightsEditActivity.addUsersRow) {
                            return tL_chatAdminRights.invite_users;
                        }
                        if (adapterPosition == chatRightsEditActivity.pinMessagesRow) {
                            if (!tL_chatAdminRights.pin_messages) {
                                return false;
                            }
                            if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                return false;
                            }
                        } else {
                            if (adapterPosition == chatRightsEditActivity.editTagsRow) {
                                return tL_chatAdminRights.manage_ranks;
                            }
                            if (adapterPosition == chatRightsEditActivity.manageTopicsRow) {
                                return tL_chatAdminRights.manage_topics;
                            }
                            if (adapterPosition == chatRightsEditActivity.channelPostStoriesRow) {
                                return tL_chatAdminRights.post_stories;
                            }
                            if (adapterPosition == chatRightsEditActivity.channelEditStoriesRow) {
                                return tL_chatAdminRights.edit_stories;
                            }
                            if (adapterPosition == chatRightsEditActivity.channelDeleteStoriesRow) {
                                return tL_chatAdminRights.delete_stories;
                            }
                            if (adapterPosition == chatRightsEditActivity.manageLinkedPeersRow) {
                                return tL_chatAdminRights.manage_linked_peers;
                            }
                            if (i != 3 || i == 1 || i == 5 || i == 8 || i == 11) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            int i2;
            int i3;
            int i4 = viewHolder.mItemViewType;
            ChatRightsEditActivity chatRightsEditActivity = ChatRightsEditActivity.this;
            final int i5 = 2;
            boolean z2 = true;
            final int i6 = 0;
            int i7 = chatRightsEditActivity.currentType;
            boolean z3 = chatRightsEditActivity.isChannel;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = chatRightsEditActivity.adminRights;
            View view = viewHolder.itemView;
            switch (i4) {
                case 0:
                    ((UserCell2) view).setData(chatRightsEditActivity.currentUser, chatRightsEditActivity.currentType == 2 ? LocaleController.getString(R.string.Bot) : null);
                    break;
                case 1:
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                    if (i == chatRightsEditActivity.guardBotInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.EditAdminProcessJoinRequestsInfo));
                    } else if (i == chatRightsEditActivity.cantEditInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.EditAdminCantEdit));
                    } else if (i == chatRightsEditActivity.rankInfoRow) {
                        textInfoPrivacyCell.setText(chatRightsEditActivity.currentType == 0 ? LocaleController.formatString(R.string.EditAdminRankInfo, (UserObject.isUserSelf(chatRightsEditActivity.currentUser) && chatRightsEditActivity.currentChat.creator) ? LocaleController.getString(R.string.ChannelCreator) : LocaleController.getString(R.string.ChannelAdmin)) : LocaleController.formatString(R.string.EditMemberRankInfo, UserObject.getUserName(chatRightsEditActivity.currentUser)));
                    }
                    break;
                case 2:
                    TextSettingsCell textSettingsCell = (TextSettingsCell) view;
                    if (i == chatRightsEditActivity.removeAdminRow) {
                        int i8 = Theme.key_text_RedRegular;
                        textSettingsCell.setTextColor(Theme.getColor(i8));
                        textSettingsCell.setTag(Integer.valueOf(i8));
                        if (chatRightsEditActivity.currentType == 0) {
                            textSettingsCell.setText(LocaleController.getString(R.string.EditAdminRemoveAdmin), false);
                        } else if (chatRightsEditActivity.currentType == 1) {
                            textSettingsCell.setText(LocaleController.getString(R.string.UserRestrictionsBlock), false);
                        }
                    } else if (i == chatRightsEditActivity.transferOwnerRow) {
                        int i9 = Theme.key_windowBackgroundWhiteBlackText;
                        textSettingsCell.setTextColor(Theme.getColor(i9));
                        textSettingsCell.setTag(Integer.valueOf(i9));
                        if (!z3) {
                            textSettingsCell.setText(LocaleController.getString(R.string.EditAdminGroupTransfer), false);
                        } else {
                            textSettingsCell.setText(LocaleController.getString(R.string.EditAdminChannelTransfer), false);
                        }
                    }
                    break;
                case 3:
                    HeaderCell headerCell = (HeaderCell) view;
                    if (i != 2) {
                        if (i == chatRightsEditActivity.rankHeaderRow) {
                            headerCell.setText(LocaleController.getString(R.string.EditAdminRank));
                        }
                    } else if (chatRightsEditActivity.currentType == 2 || (chatRightsEditActivity.currentUser != null && chatRightsEditActivity.currentUser.bot)) {
                        headerCell.setText(LocaleController.getString(R.string.BotRestrictionsCanDo));
                    } else if (chatRightsEditActivity.currentType == 0) {
                        headerCell.setText(LocaleController.getString(R.string.EditAdminWhatCanDo));
                    } else if (chatRightsEditActivity.currentType == 1) {
                        headerCell.setText(LocaleController.getString(R.string.UserRestrictionsCanDo));
                    }
                    break;
                case 4:
                case 9:
                    final TextCheckCell2 textCheckCell2 = (TextCheckCell2) view;
                    boolean z4 = i7 != 2 || chatRightsEditActivity.asAdmin;
                    TLRPC.Chat chat = chatRightsEditActivity.currentChat;
                    boolean z5 = chat != null && chat.creator;
                    if (i == chatRightsEditActivity.sendMediaRow) {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = chatRightsEditActivity.bannedRights;
                        boolean z6 = tL_chatBannedRights.send_photos;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chatRightsEditActivity.defaultBannedRights;
                        int i10 = (z6 || tL_chatBannedRights2.send_photos) ? 0 : 1;
                        if (!tL_chatBannedRights.send_videos && !tL_chatBannedRights2.send_videos) {
                            i10++;
                        }
                        if (!tL_chatBannedRights.send_stickers && !tL_chatBannedRights2.send_stickers) {
                            i10++;
                        }
                        if (!tL_chatBannedRights.send_audios && !tL_chatBannedRights2.send_audios) {
                            i10++;
                        }
                        if (!tL_chatBannedRights.send_docs && !tL_chatBannedRights2.send_docs) {
                            i10++;
                        }
                        if (!tL_chatBannedRights.send_voices && !tL_chatBannedRights2.send_voices) {
                            i10++;
                        }
                        if (!tL_chatBannedRights.send_roundvideos && !tL_chatBannedRights2.send_roundvideos) {
                            i10++;
                        }
                        if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights2.embed_links && !tL_chatBannedRights.send_plain && !tL_chatBannedRights2.send_plain) {
                            i10++;
                        }
                        if (!tL_chatBannedRights.send_polls && !tL_chatBannedRights2.send_polls) {
                            i10++;
                        }
                        if (!tL_chatBannedRights.send_reactions && !tL_chatBannedRights2.send_reactions) {
                            i10++;
                        }
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.UserRestrictionsSendMedia), i10 > 0, true, true);
                        Locale locale = Locale.US;
                        textCheckCell2.setCollapseArrow(new Runnable(this) {
                            public final ChatRightsEditActivity.ListAdapter f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run() {
                                switch (i6) {
                                    case 0:
                                        ChatRightsEditActivity.ListAdapter listAdapter = this.f$0;
                                        TextCheckCell2 textCheckCell3 = textCheckCell2;
                                        if (textCheckCell3.isEnabled()) {
                                            ChatRightsEditActivity chatRightsEditActivity2 = ChatRightsEditActivity.this;
                                            if (!ChatRightsEditActivity.access$7800(chatRightsEditActivity2)) {
                                                boolean z7 = textCheckCell3.checkBox.isChecked;
                                                textCheckCell3.setChecked(!z7);
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights3 = chatRightsEditActivity2.bannedRights;
                                                tL_chatBannedRights3.send_media = z7;
                                                tL_chatBannedRights3.send_photos = z7;
                                                tL_chatBannedRights3.send_videos = z7;
                                                tL_chatBannedRights3.send_stickers = z7;
                                                tL_chatBannedRights3.send_gifs = z7;
                                                tL_chatBannedRights3.send_games = z7;
                                                tL_chatBannedRights3.send_inline = z7;
                                                tL_chatBannedRights3.send_audios = z7;
                                                tL_chatBannedRights3.send_docs = z7;
                                                tL_chatBannedRights3.send_voices = z7;
                                                tL_chatBannedRights3.send_roundvideos = z7;
                                                tL_chatBannedRights3.embed_links = z7;
                                                tL_chatBannedRights3.send_polls = z7;
                                                tL_chatBannedRights3.send_reactions = z7;
                                                AndroidUtilities.updateVisibleRows(chatRightsEditActivity2.listView);
                                            } else {
                                                AlertDialog.Builder builder = new AlertDialog.Builder(chatRightsEditActivity2.getParentActivity(), 0, null);
                                                String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                                AlertDialog alertDialog = builder.alertDialog;
                                                alertDialog.title = string;
                                                alertDialog.message = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                                builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                                                alertDialog.show();
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        ChatRightsEditActivity.ListAdapter listAdapter2 = this.f$0;
                                        listAdapter2.getClass();
                                        TextCheckCell2 textCheckCell4 = textCheckCell2;
                                        if (textCheckCell4.isEnabled()) {
                                            boolean z8 = textCheckCell4.checkBox.isChecked;
                                            textCheckCell4.setChecked(z8);
                                            ChatRightsEditActivity chatRightsEditActivity3 = ChatRightsEditActivity.this;
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = chatRightsEditActivity3.adminRights;
                                            boolean z9 = !z8;
                                            tL_chatAdminRights2.post_messages = z9;
                                            tL_chatAdminRights2.edit_messages = z9;
                                            tL_chatAdminRights2.delete_messages = z9;
                                            AndroidUtilities.updateVisibleRows(chatRightsEditActivity3.listView);
                                            break;
                                        }
                                        break;
                                    default:
                                        ChatRightsEditActivity.ListAdapter listAdapter3 = this.f$0;
                                        listAdapter3.getClass();
                                        TextCheckCell2 textCheckCell5 = textCheckCell2;
                                        if (textCheckCell5.isEnabled()) {
                                            boolean z10 = textCheckCell5.checkBox.isChecked;
                                            textCheckCell5.setChecked(z10);
                                            ChatRightsEditActivity chatRightsEditActivity4 = ChatRightsEditActivity.this;
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights3 = chatRightsEditActivity4.adminRights;
                                            boolean z11 = !z10;
                                            tL_chatAdminRights3.post_stories = z11;
                                            tL_chatAdminRights3.edit_stories = z11;
                                            tL_chatAdminRights3.delete_stories = z11;
                                            AndroidUtilities.updateVisibleRows(chatRightsEditActivity4.listView);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, RendererCapabilities.CC.m(i10, "/10"), !chatRightsEditActivity.sendMediaExpanded);
                        textCheckCell2.setIcon(ChatRightsEditActivity.access$7800(chatRightsEditActivity) ? R.drawable.permission_locked : 0);
                    } else if (i == chatRightsEditActivity.channelMessagesRow) {
                        ?? r3 = tL_chatAdminRights.post_messages;
                        if (tL_chatAdminRights.edit_messages) {
                            i3 = r3;
                            i3 = r3 + 1;
                        }
                        i3 = r3;
                        int i11 = i3;
                        if (tL_chatAdminRights.delete_messages) {
                            i11 = i3 + 1;
                        }
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.ChannelManageMessages), i11 > 0, true, true);
                        Locale locale2 = Locale.US;
                        String strM = RendererCapabilities.CC.m(i11, "/3");
                        boolean z7 = !chatRightsEditActivity.channelMessagesExpanded;
                        final boolean z8 = z2 ? 1 : 0;
                        textCheckCell2.setCollapseArrow(new Runnable(this) {
                            public final ChatRightsEditActivity.ListAdapter f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run() {
                                switch (z8) {
                                    case 0:
                                        ChatRightsEditActivity.ListAdapter listAdapter = this.f$0;
                                        TextCheckCell2 textCheckCell3 = textCheckCell2;
                                        if (textCheckCell3.isEnabled()) {
                                            ChatRightsEditActivity chatRightsEditActivity2 = ChatRightsEditActivity.this;
                                            if (!ChatRightsEditActivity.access$7800(chatRightsEditActivity2)) {
                                                boolean z9 = textCheckCell3.checkBox.isChecked;
                                                textCheckCell3.setChecked(!z9);
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights3 = chatRightsEditActivity2.bannedRights;
                                                tL_chatBannedRights3.send_media = z9;
                                                tL_chatBannedRights3.send_photos = z9;
                                                tL_chatBannedRights3.send_videos = z9;
                                                tL_chatBannedRights3.send_stickers = z9;
                                                tL_chatBannedRights3.send_gifs = z9;
                                                tL_chatBannedRights3.send_games = z9;
                                                tL_chatBannedRights3.send_inline = z9;
                                                tL_chatBannedRights3.send_audios = z9;
                                                tL_chatBannedRights3.send_docs = z9;
                                                tL_chatBannedRights3.send_voices = z9;
                                                tL_chatBannedRights3.send_roundvideos = z9;
                                                tL_chatBannedRights3.embed_links = z9;
                                                tL_chatBannedRights3.send_polls = z9;
                                                tL_chatBannedRights3.send_reactions = z9;
                                                AndroidUtilities.updateVisibleRows(chatRightsEditActivity2.listView);
                                            } else {
                                                AlertDialog.Builder builder = new AlertDialog.Builder(chatRightsEditActivity2.getParentActivity(), 0, null);
                                                String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                                AlertDialog alertDialog = builder.alertDialog;
                                                alertDialog.title = string;
                                                alertDialog.message = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                                builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                                                alertDialog.show();
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        ChatRightsEditActivity.ListAdapter listAdapter2 = this.f$0;
                                        listAdapter2.getClass();
                                        TextCheckCell2 textCheckCell4 = textCheckCell2;
                                        if (textCheckCell4.isEnabled()) {
                                            boolean z10 = textCheckCell4.checkBox.isChecked;
                                            textCheckCell4.setChecked(z10);
                                            ChatRightsEditActivity chatRightsEditActivity3 = ChatRightsEditActivity.this;
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = chatRightsEditActivity3.adminRights;
                                            boolean z11 = !z10;
                                            tL_chatAdminRights2.post_messages = z11;
                                            tL_chatAdminRights2.edit_messages = z11;
                                            tL_chatAdminRights2.delete_messages = z11;
                                            AndroidUtilities.updateVisibleRows(chatRightsEditActivity3.listView);
                                            break;
                                        }
                                        break;
                                    default:
                                        ChatRightsEditActivity.ListAdapter listAdapter3 = this.f$0;
                                        listAdapter3.getClass();
                                        TextCheckCell2 textCheckCell5 = textCheckCell2;
                                        if (textCheckCell5.isEnabled()) {
                                            boolean z12 = textCheckCell5.checkBox.isChecked;
                                            textCheckCell5.setChecked(z12);
                                            ChatRightsEditActivity chatRightsEditActivity4 = ChatRightsEditActivity.this;
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights3 = chatRightsEditActivity4.adminRights;
                                            boolean z13 = !z12;
                                            tL_chatAdminRights3.post_stories = z13;
                                            tL_chatAdminRights3.edit_stories = z13;
                                            tL_chatAdminRights3.delete_stories = z13;
                                            AndroidUtilities.updateVisibleRows(chatRightsEditActivity4.listView);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, strM, z7);
                    } else if (i == chatRightsEditActivity.channelStoriesRow) {
                        ?? r4 = tL_chatAdminRights.post_stories;
                        if (tL_chatAdminRights.edit_stories) {
                            i2 = r4;
                            i2 = r4 + 1;
                        }
                        i2 = r4;
                        int i12 = i2;
                        if (tL_chatAdminRights.delete_stories) {
                            i12 = i2 + 1;
                        }
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.ChannelManageStories), i12 > 0, true, true);
                        Locale locale3 = Locale.US;
                        textCheckCell2.setCollapseArrow(new Runnable(this) {
                            public final ChatRightsEditActivity.ListAdapter f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run() {
                                switch (i5) {
                                    case 0:
                                        ChatRightsEditActivity.ListAdapter listAdapter = this.f$0;
                                        TextCheckCell2 textCheckCell3 = textCheckCell2;
                                        if (textCheckCell3.isEnabled()) {
                                            ChatRightsEditActivity chatRightsEditActivity2 = ChatRightsEditActivity.this;
                                            if (!ChatRightsEditActivity.access$7800(chatRightsEditActivity2)) {
                                                boolean z9 = textCheckCell3.checkBox.isChecked;
                                                textCheckCell3.setChecked(!z9);
                                                TLRPC.TL_chatBannedRights tL_chatBannedRights3 = chatRightsEditActivity2.bannedRights;
                                                tL_chatBannedRights3.send_media = z9;
                                                tL_chatBannedRights3.send_photos = z9;
                                                tL_chatBannedRights3.send_videos = z9;
                                                tL_chatBannedRights3.send_stickers = z9;
                                                tL_chatBannedRights3.send_gifs = z9;
                                                tL_chatBannedRights3.send_games = z9;
                                                tL_chatBannedRights3.send_inline = z9;
                                                tL_chatBannedRights3.send_audios = z9;
                                                tL_chatBannedRights3.send_docs = z9;
                                                tL_chatBannedRights3.send_voices = z9;
                                                tL_chatBannedRights3.send_roundvideos = z9;
                                                tL_chatBannedRights3.embed_links = z9;
                                                tL_chatBannedRights3.send_polls = z9;
                                                tL_chatBannedRights3.send_reactions = z9;
                                                AndroidUtilities.updateVisibleRows(chatRightsEditActivity2.listView);
                                            } else {
                                                AlertDialog.Builder builder = new AlertDialog.Builder(chatRightsEditActivity2.getParentActivity(), 0, null);
                                                String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                                                AlertDialog alertDialog = builder.alertDialog;
                                                alertDialog.title = string;
                                                alertDialog.message = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                                                builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                                                alertDialog.show();
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        ChatRightsEditActivity.ListAdapter listAdapter2 = this.f$0;
                                        listAdapter2.getClass();
                                        TextCheckCell2 textCheckCell4 = textCheckCell2;
                                        if (textCheckCell4.isEnabled()) {
                                            boolean z10 = textCheckCell4.checkBox.isChecked;
                                            textCheckCell4.setChecked(z10);
                                            ChatRightsEditActivity chatRightsEditActivity3 = ChatRightsEditActivity.this;
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = chatRightsEditActivity3.adminRights;
                                            boolean z11 = !z10;
                                            tL_chatAdminRights2.post_messages = z11;
                                            tL_chatAdminRights2.edit_messages = z11;
                                            tL_chatAdminRights2.delete_messages = z11;
                                            AndroidUtilities.updateVisibleRows(chatRightsEditActivity3.listView);
                                            break;
                                        }
                                        break;
                                    default:
                                        ChatRightsEditActivity.ListAdapter listAdapter3 = this.f$0;
                                        listAdapter3.getClass();
                                        TextCheckCell2 textCheckCell5 = textCheckCell2;
                                        if (textCheckCell5.isEnabled()) {
                                            boolean z12 = textCheckCell5.checkBox.isChecked;
                                            textCheckCell5.setChecked(z12);
                                            ChatRightsEditActivity chatRightsEditActivity4 = ChatRightsEditActivity.this;
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights3 = chatRightsEditActivity4.adminRights;
                                            boolean z13 = !z12;
                                            tL_chatAdminRights3.post_stories = z13;
                                            tL_chatAdminRights3.edit_stories = z13;
                                            tL_chatAdminRights3.delete_stories = z13;
                                            AndroidUtilities.updateVisibleRows(chatRightsEditActivity4.listView);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, RendererCapabilities.CC.m(i12, "/3"), !chatRightsEditActivity.channelStoriesExpanded);
                    } else if (i == chatRightsEditActivity.manageRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.ManageGroup), chatRightsEditActivity.asAdmin, true);
                        textCheckCell2.setIcon((chatRightsEditActivity.myAdminRights.add_admins || z5) ? 0 : R.drawable.permission_locked);
                    } else {
                        int i13 = chatRightsEditActivity.changeInfoRow;
                        boolean z9 = chatRightsEditActivity.isCommunity;
                        if (i == i13) {
                            if (chatRightsEditActivity.currentType == 0 || chatRightsEditActivity.currentType == 2) {
                                if (z9) {
                                    textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.CommunityAdminRightEditCommunityName), z4 && chatRightsEditActivity.adminRights.change_info, true);
                                } else if (z3) {
                                    textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminChangeChannelInfo), z4 && chatRightsEditActivity.adminRights.change_info, true);
                                } else {
                                    textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminChangeGroupInfo), (z4 && chatRightsEditActivity.adminRights.change_info) || !chatRightsEditActivity.defaultBannedRights.change_info, true);
                                }
                                if (chatRightsEditActivity.currentType == 2) {
                                    textCheckCell2.setIcon((chatRightsEditActivity.myAdminRights.change_info || z5) ? 0 : R.drawable.permission_locked);
                                }
                            } else if (chatRightsEditActivity.currentType == 1) {
                                textCheckCell2.setTextAndCheck(LocaleController.getString(z9 ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo), (chatRightsEditActivity.bannedRights.change_info || chatRightsEditActivity.defaultBannedRights.change_info) ? false : true, chatRightsEditActivity.manageTopicsRow != -1);
                                textCheckCell2.setIcon(chatRightsEditActivity.defaultBannedRights.change_info ? R.drawable.permission_locked : 0);
                            }
                        } else if (i == chatRightsEditActivity.postMessagesRow) {
                            textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminPostMessages), z4 && chatRightsEditActivity.adminRights.post_messages, true);
                            if (chatRightsEditActivity.currentType == 2) {
                                textCheckCell2.setIcon((chatRightsEditActivity.myAdminRights.post_messages || z5) ? 0 : R.drawable.permission_locked);
                            }
                        } else if (i == chatRightsEditActivity.manageWelcomeRow) {
                            if (UserObject.isBot(chatRightsEditActivity.currentUser)) {
                                textCheckCell2.setTextAndCheck(LocaleController.getString(z3 ? R.string.EditAdminBotChannelSendWelcomeMessages : R.string.EditAdminBotGroupSendWelcomeMessages), z4 && chatRightsEditActivity.adminRights.manage_welcome_messages, true);
                            } else {
                                textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminUserManageWelcomeMessages), z4 && chatRightsEditActivity.adminRights.manage_welcome_messages, true);
                            }
                            if (chatRightsEditActivity.currentType == 2) {
                                textCheckCell2.setIcon((chatRightsEditActivity.myAdminRights.manage_welcome_messages || z5) ? 0 : R.drawable.permission_locked);
                            }
                        } else if (i == chatRightsEditActivity.manageDirectRow) {
                            textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminManageDirect), z4 && chatRightsEditActivity.adminRights.manage_direct_messages, true);
                            if (chatRightsEditActivity.currentType == 2) {
                                textCheckCell2.setIcon((chatRightsEditActivity.myAdminRights.manage_direct_messages || z5) ? 0 : R.drawable.permission_locked);
                            }
                        } else if (i == chatRightsEditActivity.editMesagesRow) {
                            textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminEditMessages), z4 && chatRightsEditActivity.adminRights.edit_messages, true);
                            if (chatRightsEditActivity.currentType == 2) {
                                textCheckCell2.setIcon((chatRightsEditActivity.myAdminRights.edit_messages || z5) ? 0 : R.drawable.permission_locked);
                            }
                        } else if (i == chatRightsEditActivity.deleteMessagesRow) {
                            if (z3) {
                                textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminDeleteMessages), z4 && chatRightsEditActivity.adminRights.delete_messages, true);
                            } else {
                                textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminGroupDeleteMessages), z4 && chatRightsEditActivity.adminRights.delete_messages, true);
                            }
                            if (chatRightsEditActivity.currentType == 2) {
                                textCheckCell2.setIcon((chatRightsEditActivity.myAdminRights.delete_messages || z5) ? 0 : R.drawable.permission_locked);
                            }
                        } else if (i == chatRightsEditActivity.addAdminsRow) {
                            textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminAddAdmins), z4 && chatRightsEditActivity.adminRights.add_admins, (chatRightsEditActivity.banUsersRow != -1 && z3) || chatRightsEditActivity.anonymousRow != -1);
                            if (chatRightsEditActivity.currentType == 2) {
                                textCheckCell2.setIcon((chatRightsEditActivity.myAdminRights.add_admins || z5) ? 0 : R.drawable.permission_locked);
                            }
                        } else {
                            int i14 = chatRightsEditActivity.anonymousRow;
                            boolean z10 = chatRightsEditActivity.currentUserIsBotGuard;
                            if (i == i14) {
                                textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminSendAnonymously), z4 && chatRightsEditActivity.adminRights.anonymous, chatRightsEditActivity.manageTopicsRow != -1 || z10);
                                if (chatRightsEditActivity.currentType == 2) {
                                    textCheckCell2.setIcon((chatRightsEditActivity.myAdminRights.anonymous || z5) ? 0 : R.drawable.permission_locked);
                                }
                            } else if (i == chatRightsEditActivity.guardBotRow) {
                                String string = LocaleController.getString(R.string.EditAdminProcessJoinRequests);
                                if (chatRightsEditActivity.chatInfo == null || chatRightsEditActivity.currentUser == null) {
                                    z = false;
                                } else if ((chatRightsEditActivity.hasGuardBotToSet ? chatRightsEditActivity.guardBotIdToSet : chatRightsEditActivity.chatInfo.guard_bot_id) == chatRightsEditActivity.currentUser.id) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                textCheckCell2.setTextAndCheck(string, z, false);
                                if (chatRightsEditActivity.currentType == 2) {
                                    textCheckCell2.setIcon(0);
                                }
                            } else if (i == chatRightsEditActivity.banUsersRow) {
                                textCheckCell2.setTextAndCheck(LocaleController.getString(z9 ? R.string.CommunityAdminRightBanMembers : R.string.EditAdminBanUsers), z4 && chatRightsEditActivity.adminRights.ban_users, !z9);
                                if (chatRightsEditActivity.currentType == 2) {
                                    textCheckCell2.setIcon((chatRightsEditActivity.myAdminRights.ban_users || z5) ? 0 : R.drawable.permission_locked);
                                }
                            } else if (i == chatRightsEditActivity.manageLinkedPeersRow) {
                                textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.CommunityAdminRightEditGroupList), z4 && chatRightsEditActivity.adminRights.manage_linked_peers, true);
                                if (chatRightsEditActivity.currentType == 2) {
                                    textCheckCell2.setIcon((chatRightsEditActivity.myAdminRights.manage_linked_peers || z5) ? 0 : R.drawable.permission_locked);
                                }
                            } else if (i == chatRightsEditActivity.startVoiceChatRow) {
                                textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.StartVoipChatPermission), z4 && chatRightsEditActivity.adminRights.manage_call, true);
                                if (chatRightsEditActivity.currentType == 2) {
                                    textCheckCell2.setIcon((chatRightsEditActivity.myAdminRights.manage_call || z5) ? 0 : R.drawable.permission_locked);
                                }
                            } else if (i == chatRightsEditActivity.manageTopicsRow) {
                                if (chatRightsEditActivity.currentType == 0) {
                                    textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.ManageTopicsPermission), z4 && chatRightsEditActivity.adminRights.manage_topics, z10);
                                } else if (chatRightsEditActivity.currentType == 1) {
                                    textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.CreateTopicsPermission), (chatRightsEditActivity.bannedRights.manage_topics || chatRightsEditActivity.defaultBannedRights.manage_topics) ? false : true, z10);
                                    textCheckCell2.setIcon(chatRightsEditActivity.defaultBannedRights.manage_topics ? R.drawable.permission_locked : 0);
                                } else if (chatRightsEditActivity.currentType == 2) {
                                    textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.ManageTopicsPermission), z4 && chatRightsEditActivity.adminRights.manage_topics, z10);
                                    textCheckCell2.setIcon((chatRightsEditActivity.myAdminRights.manage_topics || z5) ? 0 : R.drawable.permission_locked);
                                }
                            } else if (i == chatRightsEditActivity.addUsersRow) {
                                if (chatRightsEditActivity.currentType == 0) {
                                    if (ChatObject.isActionBannedByDefault(chatRightsEditActivity.currentChat, 3)) {
                                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminAddUsers), chatRightsEditActivity.adminRights.invite_users, true);
                                    } else {
                                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminAddUsersViaLink), chatRightsEditActivity.adminRights.invite_users, true);
                                    }
                                } else if (chatRightsEditActivity.currentType == 1) {
                                    textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.UserRestrictionsInviteUsers), (chatRightsEditActivity.bannedRights.invite_users || chatRightsEditActivity.defaultBannedRights.invite_users) ? false : true, true);
                                    textCheckCell2.setIcon(chatRightsEditActivity.defaultBannedRights.invite_users ? R.drawable.permission_locked : 0);
                                } else if (chatRightsEditActivity.currentType == 2) {
                                    textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminAddUsersViaLink), z4 && chatRightsEditActivity.adminRights.invite_users, true);
                                    textCheckCell2.setIcon((chatRightsEditActivity.myAdminRights.invite_users || z5) ? 0 : R.drawable.permission_locked);
                                }
                            } else if (i == chatRightsEditActivity.pinMessagesRow) {
                                if (chatRightsEditActivity.currentType == 0 || chatRightsEditActivity.currentType == 2) {
                                    textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminPinMessages), (z4 && chatRightsEditActivity.adminRights.pin_messages) || !chatRightsEditActivity.defaultBannedRights.pin_messages, true);
                                    if (chatRightsEditActivity.currentType == 2) {
                                        textCheckCell2.setIcon((chatRightsEditActivity.myAdminRights.pin_messages || z5) ? 0 : R.drawable.permission_locked);
                                    }
                                } else if (chatRightsEditActivity.currentType == 1) {
                                    textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.UserRestrictionsPinMessages), (chatRightsEditActivity.bannedRights.pin_messages || chatRightsEditActivity.defaultBannedRights.pin_messages) ? false : true, true);
                                    textCheckCell2.setIcon(chatRightsEditActivity.defaultBannedRights.pin_messages ? R.drawable.permission_locked : 0);
                                }
                            } else if (i == chatRightsEditActivity.editTagsRow) {
                                if (chatRightsEditActivity.currentType == 0 || chatRightsEditActivity.currentType == 2) {
                                    textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminEditTags), z4 && chatRightsEditActivity.adminRights.manage_ranks, true);
                                    if (chatRightsEditActivity.currentType == 2) {
                                        textCheckCell2.setIcon((chatRightsEditActivity.myAdminRights.manage_ranks || z5) ? 0 : R.drawable.permission_locked);
                                    }
                                } else if (chatRightsEditActivity.currentType == 1) {
                                    textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.UserRestrictionsEditTags), (chatRightsEditActivity.bannedRights.edit_rank || chatRightsEditActivity.defaultBannedRights.edit_rank) ? false : true, true);
                                    textCheckCell2.setIcon(chatRightsEditActivity.defaultBannedRights.edit_rank ? R.drawable.permission_locked : 0);
                                }
                            } else if (i == chatRightsEditActivity.sendMessagesRow) {
                                textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.UserRestrictionsSend), (chatRightsEditActivity.bannedRights.send_plain || chatRightsEditActivity.defaultBannedRights.send_plain) ? false : true, true);
                                textCheckCell2.setIcon(chatRightsEditActivity.defaultBannedRights.send_plain ? R.drawable.permission_locked : 0);
                            }
                        }
                    }
                    if (chatRightsEditActivity.currentType != 2 && i == chatRightsEditActivity.sendMessagesRow) {
                        textCheckCell2.setEnabled((chatRightsEditActivity.bannedRights.view_messages || chatRightsEditActivity.defaultBannedRights.view_messages) ? false : true);
                    }
                    break;
                case 5:
                    ShadowSectionCell shadowSectionCell = (ShadowSectionCell) view;
                    if (i7 == 2 && (i == chatRightsEditActivity.rightsShadowRow || i == chatRightsEditActivity.rankInfoRow)) {
                        shadowSectionCell.setAlpha(chatRightsEditActivity.asAdminT);
                    } else {
                        shadowSectionCell.setAlpha(1.0f);
                    }
                    break;
                case 6:
                    TextDetailCell textDetailCell = (TextDetailCell) view;
                    if (i == chatRightsEditActivity.untilDateRow) {
                        int i15 = chatRightsEditActivity.bannedRights.until_date;
                        textDetailCell.setTextAndValue((CharSequence) LocaleController.getString(R.string.UserRestrictionsDuration), (CharSequence) ((i15 == 0 || Math.abs(((long) i15) - (System.currentTimeMillis() / 1000)) > 315360000) ? LocaleController.getString(R.string.UserRestrictionsUntilForever) : LocaleController.formatDateForBan(chatRightsEditActivity.bannedRights.until_date)), false);
                    }
                    break;
                case 7:
                    PollEditTextCell pollEditTextCell = (PollEditTextCell) view;
                    String string2 = (UserObject.isUserSelf(chatRightsEditActivity.currentUser) && chatRightsEditActivity.currentChat.creator) ? LocaleController.getString(R.string.ChannelCreator) : LocaleController.getString(R.string.ChannelAdmin);
                    this.ignoreTextChange = true;
                    pollEditTextCell.getTextView().setEnabled(chatRightsEditActivity.canEdit || chatRightsEditActivity.currentChat.creator);
                    pollEditTextCell.getTextView().setSingleLine(true);
                    pollEditTextCell.getTextView().setImeOptions(6);
                    pollEditTextCell.setTextAndHint(chatRightsEditActivity.currentRank, string2, false);
                    this.ignoreTextChange = false;
                    break;
                case 10:
                    CheckBoxCell checkBoxCell = (CheckBoxCell) view;
                    boolean z11 = checkBoxCell.getTag() != null && ((Integer) checkBoxCell.getTag()).intValue() == i;
                    checkBoxCell.setTag(Integer.valueOf(i));
                    int i16 = chatRightsEditActivity.sendStickersRow;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = chatRightsEditActivity.defaultBannedRights;
                    if (i == i16) {
                        checkBoxCell.setText(LocaleController.getString(R.string.SendMediaPermissionStickersGifs), "", (chatRightsEditActivity.bannedRights.send_stickers || tL_chatBannedRights3.send_stickers) ? false : true, true, z11);
                        checkBoxCell.setIcon(tL_chatBannedRights3.send_stickers ? R.drawable.permission_locked : 0);
                    } else if (i == chatRightsEditActivity.embedLinksRow) {
                        String string3 = LocaleController.getString(R.string.UserRestrictionsEmbedLinks);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights4 = chatRightsEditActivity.bannedRights;
                        checkBoxCell.setText(string3, "", (tL_chatBannedRights4.embed_links || tL_chatBannedRights3.embed_links || tL_chatBannedRights4.send_plain || tL_chatBannedRights3.send_plain) ? false : true, true, z11);
                        checkBoxCell.setIcon(tL_chatBannedRights3.embed_links ? R.drawable.permission_locked : 0);
                    } else if (i == chatRightsEditActivity.sendPollsRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.SendMediaPolls), "", (chatRightsEditActivity.bannedRights.send_polls || tL_chatBannedRights3.send_polls) ? false : true, true, z11);
                        checkBoxCell.setIcon(tL_chatBannedRights3.send_polls ? R.drawable.permission_locked : 0);
                    } else if (i == chatRightsEditActivity.sendPhotosRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.SendMediaPermissionPhotos), "", (chatRightsEditActivity.bannedRights.send_photos || tL_chatBannedRights3.send_photos) ? false : true, true, z11);
                        checkBoxCell.setIcon(tL_chatBannedRights3.send_photos ? R.drawable.permission_locked : 0);
                    } else if (i == chatRightsEditActivity.sendVideosRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.SendMediaPermissionVideos), "", (chatRightsEditActivity.bannedRights.send_videos || tL_chatBannedRights3.send_videos) ? false : true, true, z11);
                        checkBoxCell.setIcon(tL_chatBannedRights3.send_videos ? R.drawable.permission_locked : 0);
                    } else if (i == chatRightsEditActivity.sendReactionsRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", (chatRightsEditActivity.bannedRights.send_reactions || tL_chatBannedRights3.send_reactions) ? false : true, true, false);
                        checkBoxCell.setIcon(tL_chatBannedRights3.send_reactions ? R.drawable.permission_locked : 0);
                    } else if (i == chatRightsEditActivity.sendMusicRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.SendMediaPermissionMusic), "", (chatRightsEditActivity.bannedRights.send_audios || tL_chatBannedRights3.send_audios) ? false : true, true, z11);
                        checkBoxCell.setIcon(tL_chatBannedRights3.send_audios ? R.drawable.permission_locked : 0);
                    } else if (i == chatRightsEditActivity.sendFilesRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.SendMediaPermissionFiles), "", (chatRightsEditActivity.bannedRights.send_docs || tL_chatBannedRights3.send_docs) ? false : true, true, z11);
                        checkBoxCell.setIcon(tL_chatBannedRights3.send_docs ? R.drawable.permission_locked : 0);
                    } else if (i == chatRightsEditActivity.sendVoiceRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.SendMediaPermissionVoice), "", (chatRightsEditActivity.bannedRights.send_voices || tL_chatBannedRights3.send_voices) ? false : true, true, z11);
                        checkBoxCell.setIcon(tL_chatBannedRights3.send_voices ? R.drawable.permission_locked : 0);
                    } else if (i == chatRightsEditActivity.sendRoundRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.SendMediaPermissionRound), "", (chatRightsEditActivity.bannedRights.send_roundvideos || tL_chatBannedRights3.send_roundvideos) ? false : true, true, z11);
                        checkBoxCell.setIcon(tL_chatBannedRights3.send_roundvideos ? R.drawable.permission_locked : 0);
                    } else if (i == chatRightsEditActivity.channelPostMessagesRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.EditAdminPostMessages), "", tL_chatAdminRights.post_messages, true, z11);
                    } else if (i == chatRightsEditActivity.channelEditMessagesRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.EditAdminEditMessages), "", tL_chatAdminRights.edit_messages, true, z11);
                    } else if (i == chatRightsEditActivity.channelDeleteMessagesRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.EditAdminDeleteMessages), "", tL_chatAdminRights.delete_messages, true, z11);
                    } else if (i == chatRightsEditActivity.channelPostStoriesRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.EditAdminPostStories), "", tL_chatAdminRights.post_stories, true, z11);
                    } else if (i == chatRightsEditActivity.channelEditStoriesRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.EditAdminEditStories), "", tL_chatAdminRights.edit_stories, true, z11);
                    } else if (i == chatRightsEditActivity.channelDeleteStoriesRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.EditAdminDeleteStories), "", tL_chatAdminRights.delete_stories, true, z11);
                    }
                    break;
                case 11:
                    ((TagEditCell) view).set(chatRightsEditActivity.currentUser, chatRightsEditActivity.currentRank, i7 == 0, false, new DialogCell$$ExternalSyntheticLambda6(this, 12));
                    break;
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            View tagEditCell;
            ChatRightsEditActivity chatRightsEditActivity = ChatRightsEditActivity.this;
            Context context = this.mContext;
            switch (i) {
                case 0:
                    UserCell2 userCell2 = new UserCell2(context, null);
                    userCell2.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    tagEditCell = userCell2;
                    break;
                case 1:
                    tagEditCell = new TextInfoPrivacyCell(context, 24, null);
                    break;
                case 2:
                default:
                    TextSettingsCell textSettingsCell = new TextSettingsCell(context, 0, null);
                    textSettingsCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    tagEditCell = textSettingsCell;
                    break;
                case 3:
                    HeaderCell headerCell = new HeaderCell(this.mContext, Theme.key_windowBackgroundWhiteBlueHeader, 21, 15, true);
                    headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    view = headerCell;
                    tagEditCell = view;
                    break;
                case 4:
                case 9:
                    TextCheckCell2 textCheckCell2 = new TextCheckCell2(context);
                    textCheckCell2.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    tagEditCell = textCheckCell2;
                    break;
                case 5:
                    tagEditCell = new ShadowSectionCell(context, (Object) null);
                    break;
                case 6:
                    TextDetailCell textDetailCell = new TextDetailCell(23, this.mContext, null, false, false);
                    textDetailCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    view = textDetailCell;
                    tagEditCell = view;
                    break;
                case 7:
                    PollEditTextCell pollEditTextCell = new PollEditTextCell(context, 0, null, null);
                    pollEditTextCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    pollEditTextCell.textView.addTextChangedListener(new ArticleViewer.AnonymousClass16(this, 7));
                    tagEditCell = pollEditTextCell;
                    break;
                case 8:
                    FrameLayout frameLayout = new FrameLayout(context);
                    chatRightsEditActivity.addBotButtonContainer = frameLayout;
                    int i2 = Theme.key_windowBackgroundGray;
                    frameLayout.setBackgroundColor(Theme.getColor(null, i2, false));
                    chatRightsEditActivity.addBotButton = new FrameLayout(context);
                    AnimatedTextView animatedTextView = new AnimatedTextView(context, true, false, false);
                    chatRightsEditActivity.addBotButtonText = animatedTextView;
                    animatedTextView.setTypeface(AndroidUtilities.bold());
                    chatRightsEditActivity.addBotButtonText.setTextColor(-1);
                    chatRightsEditActivity.addBotButtonText.setTextSize(AndroidUtilities.dp(14.0f));
                    chatRightsEditActivity.addBotButtonText.setGravity(17);
                    AnimatedTextView animatedTextView2 = chatRightsEditActivity.addBotButtonText;
                    StringBuilder sb = new StringBuilder();
                    zzlf.m(R.string.AddBotButton, " ", sb);
                    sb.append(LocaleController.getString(chatRightsEditActivity.asAdmin ? R.string.AddBotButtonAsAdmin : R.string.AddBotButtonAsMember));
                    animatedTextView2.setText(sb.toString());
                    chatRightsEditActivity.addBotButton.addView(chatRightsEditActivity.addBotButtonText, LayoutHelper.createFrame(-2, -2, 17));
                    chatRightsEditActivity.addBotButton.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{4.0f}, Theme.key_featuredStickers_addButton));
                    chatRightsEditActivity.addBotButton.setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(this, 2));
                    chatRightsEditActivity.addBotButtonContainer.addView(chatRightsEditActivity.addBotButton, LayoutHelper.createFrame(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                    chatRightsEditActivity.addBotButtonContainer.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    View view2 = new View(context);
                    view2.setBackgroundColor(Theme.getColor(null, i2, false));
                    chatRightsEditActivity.addBotButtonContainer.setClipChildren(false);
                    chatRightsEditActivity.addBotButtonContainer.setClipToPadding(false);
                    chatRightsEditActivity.addBotButtonContainer.addView(view2, LayoutHelper.createFrame(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                    tagEditCell = chatRightsEditActivity.addBotButtonContainer;
                    break;
                case 10:
                    CheckBoxCell checkBoxCell = new CheckBoxCell(this.mContext, 4, 21, false, chatRightsEditActivity.getResourceProvider());
                    checkBoxCell.setPad(1);
                    checkBoxCell.getCheckBoxRound().setDrawBackgroundAsArc(14);
                    checkBoxCell.getCheckBoxRound().checkBoxBase.setColor(Theme.key_switch2TrackChecked, Theme.key_radioBackground, Theme.key_checkboxCheck);
                    checkBoxCell.setEnabled(true);
                    checkBoxCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    view = checkBoxCell;
                    tagEditCell = view;
                    break;
                case 11:
                    tagEditCell = new TagEditCell(((BaseFragment) chatRightsEditActivity).currentAccount, -chatRightsEditActivity.chatId, this.mContext, ((BaseFragment) chatRightsEditActivity).resourceProvider);
                    break;
            }
            return new RecyclerListView.Holder(tagEditCell);
        }

        @Override
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            ChatRightsEditActivity chatRightsEditActivity = ChatRightsEditActivity.this;
            if (adapterPosition == chatRightsEditActivity.rankHeaderRow) {
                ChatRightsEditActivity.access$6900(chatRightsEditActivity, viewHolder.itemView);
            }
        }

        @Override
        public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            ChatRightsEditActivity chatRightsEditActivity = ChatRightsEditActivity.this;
            if (adapterPosition != chatRightsEditActivity.rankRow || chatRightsEditActivity.getParentActivity() == null) {
                return;
            }
            AndroidUtilities.hideKeyboard(chatRightsEditActivity.getParentActivity().getCurrentFocus());
        }
    }

    public ChatRightsEditActivity(long j, long j2, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i, boolean z, boolean z2, String str2) {
        boolean z3;
        TLRPC.UserFull userFull;
        TLRPC.Chat chat;
        super(null);
        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
        this.loading = false;
        this.asAdminT = 0.0f;
        this.asAdmin = false;
        this.initialAsAdmin = false;
        this.currentBannedRights = "";
        this.isAddingNew = z2;
        this.chatId = j2;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
        this.currentUser = user;
        this.currentType = i;
        this.canEdit = z;
        boolean z4 = true;
        boolean z5 = !z;
        this.channelStoriesExpanded = z5;
        this.channelMessagesExpanded = z5;
        this.botHash = str2;
        this.currentChat = getMessagesController().getChat(Long.valueOf(this.chatId));
        this.chatInfo = getMessagesController().getChatFull(this.chatId);
        this.currentUserIsBotGuard = user != null && user.bot_guard;
        String str3 = str != null ? str : "";
        this.currentRank = str3;
        this.initialRank = str3;
        this.isCommunity = ChatObject.isCommunity(this.currentChat);
        TLRPC.Chat chat2 = this.currentChat;
        if (chat2 != null) {
            this.isChannel = ChatObject.isChannel(chat2) && !this.currentChat.megagroup;
            this.isForum = ChatObject.isForum(this.currentChat);
            this.myAdminRights = this.currentChat.admin_rights;
        }
        if (this.myAdminRights == null) {
            this.myAdminRights = emptyAdminRights(i != 2 || ((chat = this.currentChat) != null && chat.creator));
        }
        if (i == 0 || i == 2) {
            if (i == 2 && (userFull = getMessagesController().getUserFull(j)) != null) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights3 = this.isChannel ? userFull.bot_broadcast_admin_rights : userFull.bot_group_admin_rights;
                if (tL_chatAdminRights3 != null) {
                    if (tL_chatAdminRights2 == null) {
                        tL_chatAdminRights2 = tL_chatAdminRights3;
                    } else {
                        tL_chatAdminRights2.ban_users = tL_chatAdminRights2.ban_users || tL_chatAdminRights3.ban_users;
                        tL_chatAdminRights2.add_admins = tL_chatAdminRights2.add_admins || tL_chatAdminRights3.add_admins;
                        tL_chatAdminRights2.post_messages = tL_chatAdminRights2.post_messages || tL_chatAdminRights3.post_messages;
                        tL_chatAdminRights2.pin_messages = tL_chatAdminRights2.pin_messages || tL_chatAdminRights3.pin_messages;
                        tL_chatAdminRights2.manage_ranks = tL_chatAdminRights2.manage_ranks || tL_chatAdminRights3.manage_ranks;
                        tL_chatAdminRights2.delete_messages = tL_chatAdminRights2.delete_messages || tL_chatAdminRights3.delete_messages;
                        tL_chatAdminRights2.change_info = tL_chatAdminRights2.change_info || tL_chatAdminRights3.change_info;
                        tL_chatAdminRights2.anonymous = tL_chatAdminRights2.anonymous || tL_chatAdminRights3.anonymous;
                        tL_chatAdminRights2.edit_messages = tL_chatAdminRights2.edit_messages || tL_chatAdminRights3.edit_messages;
                        tL_chatAdminRights2.manage_call = tL_chatAdminRights2.manage_call || tL_chatAdminRights3.manage_call;
                        tL_chatAdminRights2.manage_topics = tL_chatAdminRights2.manage_topics || tL_chatAdminRights3.manage_topics;
                        tL_chatAdminRights2.post_stories = tL_chatAdminRights2.post_stories || tL_chatAdminRights3.post_stories;
                        tL_chatAdminRights2.edit_stories = tL_chatAdminRights2.edit_stories || tL_chatAdminRights3.edit_stories;
                        tL_chatAdminRights2.delete_stories = tL_chatAdminRights2.delete_stories || tL_chatAdminRights3.delete_stories;
                        tL_chatAdminRights2.manage_direct_messages = tL_chatAdminRights2.manage_direct_messages || tL_chatAdminRights3.manage_direct_messages;
                        tL_chatAdminRights2.manage_welcome_messages = tL_chatAdminRights2.manage_welcome_messages || tL_chatAdminRights3.manage_welcome_messages;
                        tL_chatAdminRights2.manage_linked_peers = tL_chatAdminRights2.manage_linked_peers || tL_chatAdminRights3.manage_linked_peers;
                        tL_chatAdminRights2.other = tL_chatAdminRights2.other || tL_chatAdminRights3.other;
                    }
                }
            }
            if (tL_chatAdminRights2 == null) {
                this.initialAsAdmin = false;
                if (i == 2) {
                    this.adminRights = emptyAdminRights(false);
                    boolean z6 = this.isChannel;
                    this.asAdmin = z6;
                    this.asAdminT = z6 ? 1.0f : 0.0f;
                    this.initialIsSet = false;
                } else {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights4 = new TLRPC.TL_chatAdminRights();
                    this.adminRights = tL_chatAdminRights4;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights5 = this.myAdminRights;
                    tL_chatAdminRights4.change_info = tL_chatAdminRights5.change_info;
                    tL_chatAdminRights4.post_messages = tL_chatAdminRights5.post_messages;
                    tL_chatAdminRights4.edit_messages = tL_chatAdminRights5.edit_messages;
                    tL_chatAdminRights4.delete_messages = tL_chatAdminRights5.delete_messages;
                    tL_chatAdminRights4.manage_call = tL_chatAdminRights5.manage_call;
                    tL_chatAdminRights4.ban_users = tL_chatAdminRights5.ban_users;
                    tL_chatAdminRights4.invite_users = tL_chatAdminRights5.invite_users;
                    tL_chatAdminRights4.pin_messages = tL_chatAdminRights5.pin_messages;
                    tL_chatAdminRights4.manage_ranks = tL_chatAdminRights5.manage_ranks;
                    tL_chatAdminRights4.manage_topics = tL_chatAdminRights5.manage_topics;
                    tL_chatAdminRights4.post_stories = tL_chatAdminRights5.post_stories;
                    tL_chatAdminRights4.edit_stories = tL_chatAdminRights5.edit_stories;
                    tL_chatAdminRights4.delete_stories = tL_chatAdminRights5.delete_stories;
                    tL_chatAdminRights4.manage_direct_messages = tL_chatAdminRights5.manage_direct_messages;
                    tL_chatAdminRights4.manage_welcome_messages = tL_chatAdminRights5.manage_welcome_messages;
                    tL_chatAdminRights4.manage_linked_peers = tL_chatAdminRights5.manage_linked_peers;
                    tL_chatAdminRights4.other = tL_chatAdminRights5.other;
                    this.initialIsSet = false;
                }
            } else {
                this.initialAsAdmin = true;
                TLRPC.TL_chatAdminRights tL_chatAdminRights6 = new TLRPC.TL_chatAdminRights();
                this.adminRights = tL_chatAdminRights6;
                boolean z7 = tL_chatAdminRights2.change_info;
                tL_chatAdminRights6.change_info = z7;
                boolean z8 = tL_chatAdminRights2.post_messages;
                tL_chatAdminRights6.post_messages = z8;
                boolean z9 = tL_chatAdminRights2.edit_messages;
                tL_chatAdminRights6.edit_messages = z9;
                boolean z10 = tL_chatAdminRights2.delete_messages;
                tL_chatAdminRights6.delete_messages = z10;
                boolean z11 = tL_chatAdminRights2.manage_call;
                tL_chatAdminRights6.manage_call = z11;
                boolean z12 = tL_chatAdminRights2.ban_users;
                tL_chatAdminRights6.ban_users = z12;
                boolean z13 = tL_chatAdminRights2.invite_users;
                tL_chatAdminRights6.invite_users = z13;
                boolean z14 = tL_chatAdminRights2.pin_messages;
                tL_chatAdminRights6.pin_messages = z14;
                boolean z15 = tL_chatAdminRights2.manage_ranks;
                tL_chatAdminRights6.manage_ranks = z15;
                boolean z16 = tL_chatAdminRights2.manage_topics;
                tL_chatAdminRights6.manage_topics = z16;
                tL_chatAdminRights6.post_stories = tL_chatAdminRights2.post_stories;
                tL_chatAdminRights6.edit_stories = tL_chatAdminRights2.edit_stories;
                tL_chatAdminRights6.delete_stories = tL_chatAdminRights2.delete_stories;
                boolean z17 = tL_chatAdminRights2.manage_direct_messages;
                tL_chatAdminRights6.manage_direct_messages = z17;
                boolean z18 = tL_chatAdminRights2.manage_welcome_messages;
                tL_chatAdminRights6.manage_welcome_messages = z18;
                boolean z19 = tL_chatAdminRights2.manage_linked_peers;
                tL_chatAdminRights6.manage_linked_peers = z19;
                boolean z20 = tL_chatAdminRights2.add_admins;
                tL_chatAdminRights6.add_admins = z20;
                boolean z21 = tL_chatAdminRights2.anonymous;
                tL_chatAdminRights6.anonymous = z21;
                boolean z22 = tL_chatAdminRights2.other;
                tL_chatAdminRights6.other = z22;
                boolean z23 = z7 || z8 || z17 || z18 || z9 || z10 || z12 || z13 || z19 || z14 || z15 || z20 || z11 || z21 || z16 || z22;
                this.initialIsSet = z23;
                if (i == 2) {
                    boolean z24 = this.isChannel || z23;
                    this.asAdmin = z24;
                    this.asAdminT = z24 ? 1.0f : 0.0f;
                    this.initialIsSet = false;
                }
            }
            TLRPC.Chat chat3 = this.currentChat;
            if (chat3 != null) {
                this.defaultBannedRights = chat3.default_banned_rights;
            }
            if (this.defaultBannedRights == null) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
                this.defaultBannedRights = tL_chatBannedRights3;
                tL_chatBannedRights3.view_messages = false;
                tL_chatBannedRights3.send_media = false;
                tL_chatBannedRights3.send_messages = false;
                tL_chatBannedRights3.embed_links = false;
                tL_chatBannedRights3.send_stickers = false;
                tL_chatBannedRights3.send_gifs = false;
                tL_chatBannedRights3.send_games = false;
                tL_chatBannedRights3.send_inline = false;
                tL_chatBannedRights3.send_polls = false;
                tL_chatBannedRights3.invite_users = false;
                tL_chatBannedRights3.change_info = false;
                tL_chatBannedRights3.pin_messages = false;
                tL_chatBannedRights3.manage_topics = false;
                tL_chatBannedRights3.send_plain = false;
                tL_chatBannedRights3.send_videos = false;
                tL_chatBannedRights3.send_photos = false;
                tL_chatBannedRights3.send_audios = false;
                tL_chatBannedRights3.send_docs = false;
                tL_chatBannedRights3.send_voices = false;
                tL_chatBannedRights3.send_roundvideos = false;
                tL_chatBannedRights3.edit_rank = false;
                tL_chatBannedRights3.send_reactions = false;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights4 = this.defaultBannedRights;
            if (tL_chatBannedRights4.change_info || this.isChannel) {
                z3 = true;
            } else {
                z3 = true;
                this.adminRights.change_info = true;
            }
            if (!tL_chatBannedRights4.pin_messages) {
                this.adminRights.pin_messages = z3;
            }
        } else if (i == 1) {
            this.defaultBannedRights = tL_chatBannedRights;
            if (tL_chatBannedRights == null) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights5 = new TLRPC.TL_chatBannedRights();
                this.defaultBannedRights = tL_chatBannedRights5;
                tL_chatBannedRights5.view_messages = false;
                tL_chatBannedRights5.send_media = false;
                tL_chatBannedRights5.send_messages = false;
                tL_chatBannedRights5.embed_links = false;
                tL_chatBannedRights5.send_stickers = false;
                tL_chatBannedRights5.send_gifs = false;
                tL_chatBannedRights5.send_games = false;
                tL_chatBannedRights5.send_inline = false;
                tL_chatBannedRights5.send_polls = false;
                tL_chatBannedRights5.invite_users = false;
                tL_chatBannedRights5.change_info = false;
                tL_chatBannedRights5.pin_messages = false;
                tL_chatBannedRights5.manage_topics = false;
                tL_chatBannedRights5.send_plain = false;
                tL_chatBannedRights5.send_videos = false;
                tL_chatBannedRights5.send_photos = false;
                tL_chatBannedRights5.send_audios = false;
                tL_chatBannedRights5.send_docs = false;
                tL_chatBannedRights5.send_voices = false;
                tL_chatBannedRights5.send_roundvideos = false;
                tL_chatBannedRights5.edit_rank = false;
                tL_chatBannedRights5.send_reactions = false;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights6 = new TLRPC.TL_chatBannedRights();
            this.bannedRights = tL_chatBannedRights6;
            if (tL_chatBannedRights2 == null) {
                tL_chatBannedRights6.view_messages = false;
                tL_chatBannedRights6.send_media = false;
                tL_chatBannedRights6.send_messages = false;
                tL_chatBannedRights6.embed_links = false;
                tL_chatBannedRights6.send_stickers = false;
                tL_chatBannedRights6.send_gifs = false;
                tL_chatBannedRights6.send_games = false;
                tL_chatBannedRights6.send_inline = false;
                tL_chatBannedRights6.send_polls = false;
                tL_chatBannedRights6.invite_users = false;
                tL_chatBannedRights6.change_info = false;
                tL_chatBannedRights6.pin_messages = false;
                tL_chatBannedRights6.manage_topics = false;
                tL_chatBannedRights6.edit_rank = false;
                tL_chatBannedRights6.send_reactions = false;
            } else {
                tL_chatBannedRights6.view_messages = tL_chatBannedRights2.view_messages;
                tL_chatBannedRights6.send_messages = tL_chatBannedRights2.send_messages;
                tL_chatBannedRights6.send_media = tL_chatBannedRights2.send_media;
                tL_chatBannedRights6.send_stickers = tL_chatBannedRights2.send_stickers;
                tL_chatBannedRights6.send_gifs = tL_chatBannedRights2.send_gifs;
                tL_chatBannedRights6.send_games = tL_chatBannedRights2.send_games;
                tL_chatBannedRights6.send_inline = tL_chatBannedRights2.send_inline;
                tL_chatBannedRights6.embed_links = tL_chatBannedRights2.embed_links;
                tL_chatBannedRights6.send_polls = tL_chatBannedRights2.send_polls;
                tL_chatBannedRights6.invite_users = tL_chatBannedRights2.invite_users;
                tL_chatBannedRights6.change_info = tL_chatBannedRights2.change_info;
                tL_chatBannedRights6.pin_messages = tL_chatBannedRights2.pin_messages;
                tL_chatBannedRights6.until_date = tL_chatBannedRights2.until_date;
                tL_chatBannedRights6.manage_topics = tL_chatBannedRights2.manage_topics;
                tL_chatBannedRights6.send_photos = tL_chatBannedRights2.send_photos;
                tL_chatBannedRights6.send_videos = tL_chatBannedRights2.send_videos;
                tL_chatBannedRights6.send_roundvideos = tL_chatBannedRights2.send_roundvideos;
                tL_chatBannedRights6.send_audios = tL_chatBannedRights2.send_audios;
                tL_chatBannedRights6.send_voices = tL_chatBannedRights2.send_voices;
                tL_chatBannedRights6.send_docs = tL_chatBannedRights2.send_docs;
                tL_chatBannedRights6.send_plain = tL_chatBannedRights2.send_plain;
                tL_chatBannedRights6.edit_rank = tL_chatBannedRights2.edit_rank;
                tL_chatBannedRights6.send_reactions = tL_chatBannedRights2.send_reactions;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights7 = this.defaultBannedRights;
            if (tL_chatBannedRights7.view_messages) {
                tL_chatBannedRights6.view_messages = true;
            }
            if (tL_chatBannedRights7.send_messages) {
                tL_chatBannedRights6.send_messages = true;
            }
            if (tL_chatBannedRights7.send_media) {
                tL_chatBannedRights6.send_media = true;
            }
            if (tL_chatBannedRights7.send_stickers) {
                tL_chatBannedRights6.send_stickers = true;
            }
            if (tL_chatBannedRights7.send_gifs) {
                tL_chatBannedRights6.send_gifs = true;
            }
            if (tL_chatBannedRights7.send_games) {
                tL_chatBannedRights6.send_games = true;
            }
            if (tL_chatBannedRights7.send_inline) {
                tL_chatBannedRights6.send_inline = true;
            }
            if (tL_chatBannedRights7.embed_links) {
                tL_chatBannedRights6.embed_links = true;
            }
            if (tL_chatBannedRights7.send_polls) {
                tL_chatBannedRights6.send_polls = true;
            }
            if (tL_chatBannedRights7.invite_users) {
                tL_chatBannedRights6.invite_users = true;
            }
            if (tL_chatBannedRights7.change_info) {
                tL_chatBannedRights6.change_info = true;
            }
            if (tL_chatBannedRights7.pin_messages) {
                tL_chatBannedRights6.pin_messages = true;
            }
            if (tL_chatBannedRights7.edit_rank) {
                tL_chatBannedRights6.edit_rank = true;
            }
            if (tL_chatBannedRights7.send_reactions) {
                tL_chatBannedRights6.send_reactions = true;
            }
            if (tL_chatBannedRights7.manage_topics) {
                tL_chatBannedRights6.manage_topics = true;
            }
            if (tL_chatBannedRights7.send_photos) {
                tL_chatBannedRights6.send_photos = true;
            }
            if (tL_chatBannedRights7.send_videos) {
                tL_chatBannedRights6.send_videos = true;
            }
            if (tL_chatBannedRights7.send_audios) {
                tL_chatBannedRights6.send_audios = true;
            }
            if (tL_chatBannedRights7.send_docs) {
                tL_chatBannedRights6.send_docs = true;
            }
            if (tL_chatBannedRights7.send_voices) {
                tL_chatBannedRights6.send_voices = true;
            }
            if (tL_chatBannedRights7.send_roundvideos) {
                tL_chatBannedRights6.send_roundvideos = true;
            }
            if (tL_chatBannedRights7.send_plain) {
                tL_chatBannedRights6.send_plain = true;
            }
            this.currentBannedRights = ChatObject.getBannedRightsString(tL_chatBannedRights6);
            if (tL_chatBannedRights2 != null && tL_chatBannedRights2.view_messages) {
                z4 = false;
            }
            this.initialIsSet = z4;
        }
        updateRows$2(false);
    }

    public static void access$6900(ChatRightsEditActivity chatRightsEditActivity, View view) {
        if (view instanceof HeaderCell) {
            HeaderCell headerCell = (HeaderCell) view;
            String str = chatRightsEditActivity.currentRank;
            int iCodePointCount = 16 - (str != null ? str.codePointCount(0, str.length()) : 0);
            if (iCodePointCount > 4.8f) {
                headerCell.setText2("");
                return;
            }
            headerCell.setText2(String.format("%d", Integer.valueOf(iCodePointCount)));
            SimpleTextView textView2 = headerCell.getTextView2();
            int i = iCodePointCount < 0 ? Theme.key_text_RedRegular : Theme.key_windowBackgroundWhiteGrayText3;
            textView2.setTextColor(Theme.getColor(null, i, false));
            textView2.setTag(Integer.valueOf(i));
        }
    }

    public static boolean access$7800(ChatRightsEditActivity chatRightsEditActivity) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = chatRightsEditActivity.defaultBannedRights;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    public static TLRPC.TL_chatAdminRights emptyAdminRights(boolean z) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
        tL_chatAdminRights.manage_linked_peers = z;
        tL_chatAdminRights.manage_ranks = z;
        tL_chatAdminRights.manage_welcome_messages = z;
        tL_chatAdminRights.manage_direct_messages = z;
        tL_chatAdminRights.delete_stories = z;
        tL_chatAdminRights.edit_stories = z;
        tL_chatAdminRights.post_stories = z;
        tL_chatAdminRights.manage_topics = z;
        tL_chatAdminRights.manage_call = z;
        tL_chatAdminRights.add_admins = z;
        tL_chatAdminRights.pin_messages = z;
        tL_chatAdminRights.invite_users = z;
        tL_chatAdminRights.ban_users = z;
        tL_chatAdminRights.delete_messages = z;
        tL_chatAdminRights.edit_messages = z;
        tL_chatAdminRights.post_messages = z;
        tL_chatAdminRights.change_info = z;
        return tL_chatAdminRights;
    }

    public static TLRPC.TL_chatAdminRights rightsOR(TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatAdminRights tL_chatAdminRights2) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = new TLRPC.TL_chatAdminRights();
        boolean z = true;
        tL_chatAdminRights3.change_info = tL_chatAdminRights.change_info || tL_chatAdminRights2.change_info;
        tL_chatAdminRights3.post_messages = tL_chatAdminRights.post_messages || tL_chatAdminRights2.post_messages;
        tL_chatAdminRights3.edit_messages = tL_chatAdminRights.edit_messages || tL_chatAdminRights2.edit_messages;
        tL_chatAdminRights3.delete_messages = tL_chatAdminRights.delete_messages || tL_chatAdminRights2.delete_messages;
        tL_chatAdminRights3.ban_users = tL_chatAdminRights.ban_users || tL_chatAdminRights2.ban_users;
        tL_chatAdminRights3.invite_users = tL_chatAdminRights.invite_users || tL_chatAdminRights2.invite_users;
        tL_chatAdminRights3.pin_messages = tL_chatAdminRights.pin_messages || tL_chatAdminRights2.pin_messages;
        tL_chatAdminRights3.manage_ranks = tL_chatAdminRights.manage_ranks || tL_chatAdminRights2.manage_ranks;
        tL_chatAdminRights3.add_admins = tL_chatAdminRights.add_admins || tL_chatAdminRights2.add_admins;
        tL_chatAdminRights3.manage_call = tL_chatAdminRights.manage_call || tL_chatAdminRights2.manage_call;
        tL_chatAdminRights3.manage_topics = tL_chatAdminRights.manage_topics || tL_chatAdminRights2.manage_topics;
        tL_chatAdminRights3.post_stories = tL_chatAdminRights.post_stories || tL_chatAdminRights2.post_stories;
        tL_chatAdminRights3.edit_stories = tL_chatAdminRights.edit_stories || tL_chatAdminRights2.edit_stories;
        tL_chatAdminRights3.delete_stories = tL_chatAdminRights.delete_stories || tL_chatAdminRights2.delete_stories;
        tL_chatAdminRights3.manage_direct_messages = tL_chatAdminRights.manage_direct_messages || tL_chatAdminRights2.manage_direct_messages;
        tL_chatAdminRights3.manage_welcome_messages = tL_chatAdminRights.manage_welcome_messages || tL_chatAdminRights2.manage_welcome_messages;
        if (!tL_chatAdminRights.manage_linked_peers && !tL_chatAdminRights2.manage_linked_peers) {
            z = false;
        }
        tL_chatAdminRights3.manage_linked_peers = z;
        return tL_chatAdminRights3;
    }

    public final boolean checkDiscard$1(boolean z) {
        int i = 0;
        int i2 = this.currentType;
        if (i2 != 2) {
            if (!(i2 == 1 ? this.currentBannedRights.equals(ChatObject.getBannedRightsString(this.bannedRights)) : this.initialRank.equals(this.currentRank))) {
                if (z) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                    String string = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.title = string;
                    alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("UserRestrictionsApplyChangesText", R.string.UserRestrictionsApplyChangesText, MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chatId)).title));
                    builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new ChatRightsEditActivity$$ExternalSyntheticLambda2(this, i));
                    builder.setNegativeButton(LocaleController.getString(R.string.PassportDiscard), new ChatRightsEditActivity$$ExternalSyntheticLambda2(this, 6));
                    showDialog(alertDialog);
                }
                return false;
            }
        }
        return true;
    }

    public final void checkGuardBotRow() {
        boolean z;
        TLRPC.User user;
        int i = this.guardBotRow;
        if (i >= 0) {
            TextCheckCell2 textCheckCell2 = (TextCheckCell2) this.linearLayoutManager.findViewByPosition(i);
            if (textCheckCell2 == null) {
                this.listViewAdapter.notifyItemChanged(this.guardBotRow);
                return;
            }
            TLRPC.ChatFull chatFull = this.chatInfo;
            if (chatFull == null || (user = this.currentUser) == null) {
                z = false;
            } else {
                if ((this.hasGuardBotToSet ? this.guardBotIdToSet : chatFull.guard_bot_id) == user.id) {
                    z = true;
                } else {
                    z = false;
                }
            }
            textCheckCell2.setChecked(z);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i = 1;
        this.actionBar.setAllowOverlayTitle(true);
        int i2 = this.currentType;
        if (i2 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditAdmin));
        } else if (i2 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AddBot));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.UserRestrictions));
        }
        this.actionBar.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 25));
        boolean z = false;
        if (this.canEdit || (!this.isChannel && this.currentChat.creator && UserObject.isUserSelf(this.currentUser))) {
            ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
            int i3 = Theme.key_actionBarDefaultIcon;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i3, false), PorterDuff.Mode.MULTIPLY));
            this.doneDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(null, i3, false)));
            actionBarMenuCreateMenu.addItemWithWidth(1, 0, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            actionBarMenuCreateMenu.getItem(1).setIcon(this.doneDrawable);
        }
        CalendarActivity.AnonymousClass2 anonymousClass2 = new CalendarActivity.AnonymousClass2(this, context);
        this.fragmentView = anonymousClass2;
        anonymousClass2.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        View view = this.fragmentView;
        FrameLayout frameLayout = (FrameLayout) view;
        view.setFocusableInTouchMode(true);
        ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(this, context, 5);
        this.listView = anonymousClass34;
        anonymousClass34.setClipChildren(i2 != 2);
        PhotoViewer.AnonymousClass36 anonymousClass36 = new PhotoViewer.AnonymousClass36(i, 4, z);
        this.linearLayoutManager = anonymousClass36;
        anonymousClass36.mInitialPrefetchItemCount = 100;
        this.listView.setLayoutManager(anonymousClass36);
        ChatActivity.AnonymousClass34 anonymousClass35 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listViewAdapter = listAdapter;
        anonymousClass35.setAdapter(listAdapter);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        if (i2 == 2) {
            this.listView.setResetSelectorOnChanged(false);
        }
        defaultItemAnimator.mSupportsChangeAnimations = false;
        defaultItemAnimator.delayAnimations = false;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.setDurations(350L);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        this.listView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setOnScrollListener(new ChatActivity.AnonymousClass53(this, 10));
        this.listView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda0(4, this, context));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            TLRPC.Chat chat = this.currentChat;
            if (chat == null || chatFull.id != chat.id) {
                return;
            }
            this.chatInfo = chatFull;
            checkGuardBotRow();
            return;
        }
        if (i == NotificationCenter.dialogDeleted) {
            if ((-this.chatId) == ((Long) objArr[0]).longValue()) {
                INavigationLayout iNavigationLayout = this.parentLayout;
                if (iNavigationLayout == null || ((ActionBarLayout) iNavigationLayout).getLastFragment() != this) {
                    removeSelfFromStack();
                } else {
                    finishFragment();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(this, 10);
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{UserCell2.class, TextSettingsCell.class, TextCheckCell2.class, HeaderCell.class, TextDetailCell.class, PollEditTextCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        int i2 = Theme.key_text_RedRegular;
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueImageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayIcon));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextDetailCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        int i4 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextDetailCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell2.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell2.class}, new String[]{"valueTextView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell2.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switch2Track));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell2.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switch2TrackChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{HeaderCell.class}, new String[]{"textView2"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{HeaderCell.class}, new String[]{"textView2"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText3));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{PollEditTextCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 8388608, new Class[]{PollEditTextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteHintText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, new String[]{"nameTextView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, new String[]{"statusColor"}, null, null, -1, chatActivity$$ExternalSyntheticLambda94, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, new String[]{"statusOnlineColor"}, null, null, -1, chatActivity$$ExternalSyntheticLambda94, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(null, 0, new Class[]{DialogRadioCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_dialogTextBlack));
        arrayList.add(new ThemeDescription(null, 0, new Class[]{DialogRadioCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_dialogTextGray2));
        arrayList.add(new ThemeDescription(null, 8192, new Class[]{DialogRadioCell.class}, new String[]{"radioButton"}, null, null, -1, null, Theme.key_dialogRadioBackground));
        arrayList.add(new ThemeDescription(null, 16384, new Class[]{DialogRadioCell.class}, new String[]{"radioButton"}, null, null, -1, null, Theme.key_dialogRadioBackgroundChecked));
        return arrayList;
    }

    public final void initTransfer(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        if (getParentActivity() == null) {
            return;
        }
        if (tL_inputCheckPasswordSRP != null && !ChatObject.isChannel(this.currentChat)) {
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getParentActivity(), this.chatId, this, new ChatActivity$$ExternalSyntheticLambda248(this, tL_inputCheckPasswordSRP, twoStepVerificationActivity, 18));
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (ChatObject.isChannel(this.currentChat)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.currentChat;
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        tL_channels_editCreator.password = tL_inputCheckPasswordSRP != null ? tL_inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = getMessagesController().getInputUser(this.currentUser);
        getConnectionsManager().sendRequest(tL_channels_editCreator, new LoginActivity$$ExternalSyntheticLambda42(this, tL_inputCheckPasswordSRP, twoStepVerificationActivity, tL_channels_editCreator, 5));
    }

    public final boolean isDefaultAdminRights() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = this.adminRights;
        boolean z = tL_chatAdminRights.change_info;
        boolean z2 = this.isForum;
        if (z && tL_chatAdminRights.delete_messages && tL_chatAdminRights.ban_users && tL_chatAdminRights.invite_users && tL_chatAdminRights.pin_messages && tL_chatAdminRights.manage_ranks && ((!z2 || tL_chatAdminRights.manage_topics) && tL_chatAdminRights.manage_call && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous)) {
            return true;
        }
        if (z || tL_chatAdminRights.delete_messages || tL_chatAdminRights.ban_users || tL_chatAdminRights.invite_users || tL_chatAdminRights.pin_messages || tL_chatAdminRights.manage_ranks) {
            return false;
        }
        return ((z2 && tL_chatAdminRights.manage_topics) || tL_chatAdminRights.manage_call || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous) ? false : true;
    }

    public final void lambda$createView$5(BottomSheet.Builder builder, View view) {
        int iIntValue = ((Integer) view.getTag()).intValue();
        if (iIntValue == 0) {
            this.bannedRights.until_date = 0;
            this.listViewAdapter.notifyItemChanged(this.untilDateRow);
        } else if (iIntValue == 1) {
            this.bannedRights.until_date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 86400;
            this.listViewAdapter.notifyItemChanged(this.untilDateRow);
        } else if (iIntValue == 2) {
            this.bannedRights.until_date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 604800;
            this.listViewAdapter.notifyItemChanged(this.untilDateRow);
        } else if (iIntValue == 3) {
            this.bannedRights.until_date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 2592000;
            this.listViewAdapter.notifyItemChanged(this.untilDateRow);
        } else if (iIntValue == 4) {
            Calendar calendar = Calendar.getInstance();
            try {
                DatePickerDialog datePickerDialog = new DatePickerDialog(getParentActivity(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                        final ChatRightsEditActivity chatRightsEditActivity = this.f$0;
                        chatRightsEditActivity.getClass();
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.clear();
                        calendar2.set(i, i2, i3);
                        final int time = (int) (calendar2.getTime().getTime() / 1000);
                        try {
                            TimePickerDialog timePickerDialog = new TimePickerDialog(chatRightsEditActivity.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                                @Override
                                public final void onTimeSet(TimePicker timePicker, int i4, int i5) {
                                    ChatRightsEditActivity chatRightsEditActivity2 = chatRightsEditActivity;
                                    chatRightsEditActivity2.bannedRights.until_date = (i5 * 60) + (i4 * 3600) + time;
                                    chatRightsEditActivity2.listViewAdapter.notifyItemChanged(chatRightsEditActivity2.untilDateRow);
                                }
                            }, 0, 0, true);
                            timePickerDialog.setButton(-1, LocaleController.getString(R.string.Set), timePickerDialog);
                            timePickerDialog.setButton(-2, LocaleController.getString(R.string.Cancel), new ChatRightsEditActivity$$ExternalSyntheticLambda18());
                            chatRightsEditActivity.showDialog(timePickerDialog);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                }, calendar.get(1), calendar.get(2), calendar.get(5));
                DatePicker datePicker = datePickerDialog.getDatePicker();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.set(11, calendar2.getMinimum(11));
                calendar2.set(12, calendar2.getMinimum(12));
                calendar2.set(13, calendar2.getMinimum(13));
                calendar2.set(14, calendar2.getMinimum(14));
                datePicker.setMinDate(calendar2.getTimeInMillis());
                calendar2.setTimeInMillis(System.currentTimeMillis() + 31536000000L);
                calendar2.set(11, calendar2.getMaximum(11));
                calendar2.set(12, calendar2.getMaximum(12));
                calendar2.set(13, calendar2.getMaximum(13));
                calendar2.set(14, calendar2.getMaximum(14));
                datePicker.setMaxDate(calendar2.getTimeInMillis());
                datePickerDialog.setButton(-1, LocaleController.getString(R.string.Set), datePickerDialog);
                datePickerDialog.setButton(-2, LocaleController.getString(R.string.Cancel), new ChatRightsEditActivity$$ExternalSyntheticLambda18());
                datePickerDialog.setOnShowListener(new AuctionBidSheet$$ExternalSyntheticLambda15(2, datePicker));
                showDialog(datePickerDialog);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        builder.bottomSheet.dismissRunnable.run();
    }

    public final void lambda$createView$7(long j) {
        TLRPC.ChatFull chatFull = this.chatInfo;
        long j2 = chatFull != null ? chatFull.guard_bot_id : 0L;
        TLRPC.User user = j2 != 0 ? getMessagesController().getUser(Long.valueOf(j2)) : null;
        if (user != null && j != 0 && user.id != j) {
            new GuardBotReplaceSheet(getParentActivity(), this.resourceProvider, user, this.currentUser, new ChatRightsEditActivity$$ExternalSyntheticLambda5(this, j, 1)).show();
            return;
        }
        this.guardBotIdToSet = j;
        this.hasGuardBotToSet = true;
        checkGuardBotRow();
    }

    public final void lambda$createView$8(Context context, View view, int i) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        boolean z5;
        boolean z6;
        View viewFindViewByPosition;
        String string;
        boolean z7 = false;
        boolean z8 = this.canEdit;
        int i3 = this.currentType;
        if (z8 || (this.currentChat.creator && i3 == 0 && i == this.anonymousRow)) {
            if (i == this.sendMediaRow) {
                if (!(view instanceof TextCheckCell2) || ((TextCheckCell2) view).isEnabled()) {
                    this.sendMediaExpanded = !this.sendMediaExpanded;
                    updateRows$2(false);
                    this.listViewAdapter.notifyItemChanged(this.sendMediaRow);
                    if (this.sendMediaExpanded) {
                        this.listViewAdapter.mObservable.notifyItemRangeInserted(this.sendMediaRow + 1, 10);
                        return;
                    } else {
                        this.listViewAdapter.mObservable.notifyItemRangeRemoved(this.sendMediaRow + 1, 10);
                        return;
                    }
                }
                return;
            }
            int i4 = this.channelMessagesRow;
            int i5 = 3;
            if (i == i4) {
                if (!(view instanceof TextCheckCell2) || ((TextCheckCell2) view).isEnabled()) {
                    this.channelMessagesExpanded = !this.channelMessagesExpanded;
                    updateRows$2(false);
                    this.listViewAdapter.notifyItemChanged(this.channelMessagesRow);
                    if (this.channelMessagesExpanded) {
                        this.listViewAdapter.mObservable.notifyItemRangeInserted(this.channelMessagesRow + 1, 3);
                        return;
                    } else {
                        this.listViewAdapter.mObservable.notifyItemRangeRemoved(this.channelMessagesRow + 1, 3);
                        return;
                    }
                }
                return;
            }
            int i6 = this.channelStoriesRow;
            if (i == i6) {
                if (!(view instanceof TextCheckCell2) || ((TextCheckCell2) view).isEnabled()) {
                    this.channelStoriesExpanded = !this.channelStoriesExpanded;
                    updateRows$2(false);
                    this.listViewAdapter.notifyItemChanged(this.channelStoriesRow);
                    if (this.channelStoriesExpanded) {
                        this.listViewAdapter.mObservable.notifyItemRangeInserted(this.channelStoriesRow + 1, 3);
                        return;
                    } else {
                        this.listViewAdapter.mObservable.notifyItemRangeRemoved(this.channelStoriesRow + 1, 3);
                        return;
                    }
                }
                return;
            }
            TLRPC.User user = this.currentUser;
            if (i == 0) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            int i7 = this.removeAdminRow;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.adminRights;
            if (i == i7) {
                if (i3 == 0) {
                    MessagesController.getInstance(this.currentAccount).setUserAdminRole(this.chatId, this.currentUser, new TLRPC.TL_chatAdminRights(), this.currentRank, this.isChannel, getFragmentForAlert(0), this.isAddingNew, false, null, null);
                    ChatRightsEditActivityDelegate chatRightsEditActivityDelegate = this.delegate;
                    if (chatRightsEditActivityDelegate != null) {
                        chatRightsEditActivityDelegate.didSetRights(0, tL_chatAdminRights, this.bannedRights, this.currentRank);
                    }
                    finishFragment();
                    return;
                }
                if (i3 == 1) {
                    this.banning = true;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = new TLRPC.TL_chatBannedRights();
                    this.bannedRights = tL_chatBannedRights2;
                    tL_chatBannedRights2.view_messages = true;
                    tL_chatBannedRights2.send_media = true;
                    tL_chatBannedRights2.send_messages = true;
                    tL_chatBannedRights2.send_stickers = true;
                    tL_chatBannedRights2.send_gifs = true;
                    tL_chatBannedRights2.send_games = true;
                    tL_chatBannedRights2.send_inline = true;
                    tL_chatBannedRights2.embed_links = true;
                    tL_chatBannedRights2.pin_messages = true;
                    tL_chatBannedRights2.edit_rank = true;
                    tL_chatBannedRights2.send_reactions = true;
                    tL_chatBannedRights2.send_polls = true;
                    tL_chatBannedRights2.invite_users = true;
                    tL_chatBannedRights2.change_info = true;
                    tL_chatBannedRights2.manage_topics = true;
                    tL_chatBannedRights2.until_date = 0;
                    onDonePressed(true);
                    return;
                }
                return;
            }
            if (i == this.transferOwnerRow) {
                initTransfer(null, null);
                return;
            }
            if (i == this.untilDateRow) {
                if (getParentActivity() == null) {
                    return;
                }
                BottomSheet.Builder builder = new BottomSheet.Builder(context, null);
                BottomSheet bottomSheet = builder.bottomSheet;
                bottomSheet.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                HeaderCell headerCell = new HeaderCell(context, Theme.key_dialogTextBlue2, 23, 15, false);
                headerCell.setHeight(47);
                headerCell.setText(LocaleController.getString(R.string.UserRestrictionsDuration));
                linearLayout.addView(headerCell);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2));
                int i8 = 5;
                BottomSheet.BottomSheetCell[] bottomSheetCellArr = new BottomSheet.BottomSheetCell[5];
                int i9 = 0;
                while (i9 < i8) {
                    BottomSheet.BottomSheetCell bottomSheetCell = new BottomSheet.BottomSheetCell(context, 0, null);
                    bottomSheetCellArr[i9] = bottomSheetCell;
                    bottomSheetCell.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                    bottomSheetCellArr[i9].setTag(Integer.valueOf(i9));
                    bottomSheetCellArr[i9].setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    if (i9 == 0) {
                        string = LocaleController.getString(R.string.UserRestrictionsUntilForever);
                    } else if (i9 == 1) {
                        string = LocaleController.formatPluralString("Days", 1, new Object[0]);
                    } else if (i9 != 2) {
                        string = i9 != i5 ? LocaleController.getString(R.string.UserRestrictionsCustom) : LocaleController.formatPluralString("Months", 1, new Object[0]);
                    } else {
                        string = LocaleController.formatPluralString("Weeks", 1, new Object[0]);
                    }
                    bottomSheetCellArr[i9].setTextAndIcon(string, 0, null, false);
                    linearLayout2.addView(bottomSheetCellArr[i9], LayoutHelper.createLinear(-1, -2));
                    bottomSheetCellArr[i9].setOnClickListener(new ChatActivity$$ExternalSyntheticLambda77(27, this, builder));
                    i9++;
                    i8 = 5;
                    i5 = 3;
                }
                bottomSheet.customView = linearLayout;
                showDialog(bottomSheet);
                return;
            }
            boolean z9 = view instanceof CheckBoxCell;
            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = this.defaultBannedRights;
            if (z9) {
                CheckBoxCell checkBoxCell = (CheckBoxCell) view;
                int i10 = this.channelPostMessagesRow;
                if (i == i10 || i == this.channelEditMessagesRow || i == this.channelDeleteMessagesRow) {
                    if (i == i10) {
                        z5 = !tL_chatAdminRights.post_messages;
                        tL_chatAdminRights.post_messages = z5;
                    } else if (i == this.channelEditMessagesRow) {
                        z5 = !tL_chatAdminRights.edit_messages;
                        tL_chatAdminRights.edit_messages = z5;
                    } else {
                        z5 = !tL_chatAdminRights.delete_messages;
                        tL_chatAdminRights.delete_messages = z5;
                    }
                    this.listViewAdapter.notifyItemChanged(i4);
                    checkBoxCell.setChecked(z5, true);
                    return;
                }
                int i11 = this.channelPostStoriesRow;
                if (i == i11 || i == this.channelEditStoriesRow || i == this.channelDeleteStoriesRow) {
                    if (i == i11) {
                        z6 = !tL_chatAdminRights.post_stories;
                        tL_chatAdminRights.post_stories = z6;
                    } else if (i == this.channelEditStoriesRow) {
                        z6 = !tL_chatAdminRights.edit_stories;
                        tL_chatAdminRights.edit_stories = z6;
                    } else {
                        z6 = !tL_chatAdminRights.delete_stories;
                        tL_chatAdminRights.delete_stories = z6;
                    }
                    this.listViewAdapter.notifyItemChanged(i6);
                    checkBoxCell.setChecked(z6, true);
                    return;
                }
                if (i3 != 1 || this.bannedRights == null) {
                    return;
                }
                checkBoxCell.isChecked();
                if (checkBoxCell.checkBoxRound.iconDrawable != null) {
                    if (i3 != 2) {
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity(), 0, null);
                        String string2 = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        AlertDialog alertDialog = builder2.alertDialog;
                        alertDialog.title = string2;
                        alertDialog.message = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        builder2.setPositiveButton(LocaleController.getString(R.string.OK), null);
                        alertDialog.show();
                        return;
                    }
                    return;
                }
                if (i == this.sendPhotosRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = this.bannedRights;
                    z7 = !tL_chatBannedRights4.send_photos;
                    tL_chatBannedRights4.send_photos = z7;
                } else if (i == this.sendVideosRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.bannedRights;
                    z7 = !tL_chatBannedRights5.send_videos;
                    tL_chatBannedRights5.send_videos = z7;
                } else if (i == this.sendMusicRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights6 = this.bannedRights;
                    z7 = !tL_chatBannedRights6.send_audios;
                    tL_chatBannedRights6.send_audios = z7;
                } else if (i == this.sendReactionsRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights7 = this.bannedRights;
                    z7 = !tL_chatBannedRights7.send_reactions;
                    tL_chatBannedRights7.send_reactions = z7;
                } else if (i == this.sendFilesRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights8 = this.bannedRights;
                    z7 = !tL_chatBannedRights8.send_docs;
                    tL_chatBannedRights8.send_docs = z7;
                } else if (i == this.sendRoundRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights9 = this.bannedRights;
                    z7 = !tL_chatBannedRights9.send_roundvideos;
                    tL_chatBannedRights9.send_roundvideos = z7;
                } else if (i == this.sendVoiceRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights10 = this.bannedRights;
                    z7 = !tL_chatBannedRights10.send_voices;
                    tL_chatBannedRights10.send_voices = z7;
                } else if (i == this.sendStickersRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights11 = this.bannedRights;
                    z7 = !tL_chatBannedRights11.send_stickers;
                    tL_chatBannedRights11.send_inline = z7;
                    tL_chatBannedRights11.send_gifs = z7;
                    tL_chatBannedRights11.send_games = z7;
                    tL_chatBannedRights11.send_stickers = z7;
                } else if (i == this.embedLinksRow) {
                    if ((this.bannedRights.send_plain || tL_chatBannedRights3.send_plain) && (viewFindViewByPosition = this.linearLayoutManager.findViewByPosition(this.sendMessagesRow)) != null) {
                        AndroidUtilities.shakeViewSpring(viewFindViewByPosition);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        return;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights12 = this.bannedRights;
                        z7 = !tL_chatBannedRights12.embed_links;
                        tL_chatBannedRights12.embed_links = z7;
                    }
                } else if (i == this.sendPollsRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights13 = this.bannedRights;
                    z7 = !tL_chatBannedRights13.send_polls;
                    tL_chatBannedRights13.send_polls = z7;
                }
                this.listViewAdapter.notifyItemChanged(this.sendMediaRow);
                checkBoxCell.setChecked(!z7, true);
                return;
            }
            if (view instanceof TextCheckCell2) {
                TextCheckCell2 textCheckCell2 = (TextCheckCell2) view;
                if (textCheckCell2.checkBox.iconDrawable != null) {
                    if (i3 != 2) {
                        AlertDialog.Builder builder3 = new AlertDialog.Builder(getParentActivity(), 0, null);
                        String string3 = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        AlertDialog alertDialog2 = builder3.alertDialog;
                        alertDialog2.title = string3;
                        alertDialog2.message = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        builder3.setPositiveButton(LocaleController.getString(R.string.OK), null);
                        alertDialog2.show();
                        return;
                    }
                    return;
                }
                if (!textCheckCell2.isEnabled()) {
                    if (i3 == 2 || i3 == 0) {
                        if ((i != this.changeInfoRow || tL_chatBannedRights3 == null || tL_chatBannedRights3.change_info) && ((i != this.pinMessagesRow || tL_chatBannedRights3 == null || tL_chatBannedRights3.pin_messages) && (i != this.editTagsRow || tL_chatBannedRights3 == null || tL_chatBannedRights3.edit_rank))) {
                            return;
                        }
                        AlertDialog.Builder builder4 = new AlertDialog.Builder(getParentActivity(), 0, null);
                        String string4 = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        AlertDialog alertDialog3 = builder4.alertDialog;
                        alertDialog3.title = string4;
                        alertDialog3.message = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                        builder4.setPositiveButton(LocaleController.getString(R.string.OK), null);
                        alertDialog3.show();
                        return;
                    }
                    return;
                }
                Switch r1 = textCheckCell2.checkBox;
                if (i3 != 2 && i != this.guardBotRow) {
                    textCheckCell2.setChecked(!r1.isChecked);
                }
                boolean z10 = r1.isChecked;
                if (i == this.manageRow) {
                    z10 = !this.asAdmin;
                    this.asAdmin = z10;
                    FrameLayout frameLayout = this.addBotButton;
                    if (frameLayout != null) {
                        frameLayout.invalidate();
                    }
                    int childCount = this.listView.getChildCount();
                    int i12 = 0;
                    while (i12 < childCount) {
                        View childAt = this.listView.getChildAt(i12);
                        this.listView.getClass();
                        int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                        if (childAt instanceof TextCheckCell2) {
                            boolean z11 = this.asAdmin;
                            if (z11) {
                                int i13 = this.manageRow;
                                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = this.myAdminRights;
                                if (childAdapterPosition == i13) {
                                    if (tL_chatAdminRights2.add_admins || ((chat2 = this.currentChat) != null && chat2.creator)) {
                                        z3 = z11;
                                        z4 = true;
                                    } else {
                                        z3 = z11;
                                        z4 = false;
                                    }
                                } else if (childAdapterPosition == this.changeInfoRow) {
                                    z11 = tL_chatAdminRights.change_info;
                                    if (tL_chatAdminRights2.change_info && tL_chatBannedRights3.change_info) {
                                        z3 = z11;
                                        z4 = true;
                                    } else {
                                        z3 = z11;
                                        z4 = false;
                                    }
                                } else if (childAdapterPosition == this.postMessagesRow) {
                                    z3 = tL_chatAdminRights.post_messages;
                                    z4 = tL_chatAdminRights2.post_messages;
                                } else if (childAdapterPosition == this.manageDirectRow) {
                                    z3 = tL_chatAdminRights.manage_direct_messages;
                                    z4 = tL_chatAdminRights2.manage_direct_messages;
                                } else if (childAdapterPosition == this.manageWelcomeRow) {
                                    z3 = tL_chatAdminRights.manage_welcome_messages;
                                    z4 = tL_chatAdminRights2.manage_welcome_messages;
                                } else if (childAdapterPosition == this.editMesagesRow) {
                                    z3 = tL_chatAdminRights.edit_messages;
                                    z4 = tL_chatAdminRights2.edit_messages;
                                } else if (childAdapterPosition == this.deleteMessagesRow) {
                                    z3 = tL_chatAdminRights.delete_messages;
                                    z4 = tL_chatAdminRights2.delete_messages;
                                } else if (childAdapterPosition == this.banUsersRow) {
                                    z3 = tL_chatAdminRights.ban_users;
                                    z4 = tL_chatAdminRights2.ban_users;
                                } else if (childAdapterPosition == this.addUsersRow) {
                                    z3 = tL_chatAdminRights.invite_users;
                                    z4 = tL_chatAdminRights2.invite_users;
                                } else if (childAdapterPosition == this.pinMessagesRow) {
                                    z11 = tL_chatAdminRights.pin_messages;
                                    if (tL_chatAdminRights2.pin_messages && tL_chatBannedRights3.pin_messages) {
                                        z3 = z11;
                                        z4 = true;
                                    } else {
                                        z3 = z11;
                                        z4 = false;
                                    }
                                } else if (childAdapterPosition == this.editTagsRow) {
                                    z3 = tL_chatAdminRights.manage_ranks;
                                    z4 = tL_chatAdminRights2.manage_ranks;
                                } else if (childAdapterPosition == this.startVoiceChatRow) {
                                    z3 = tL_chatAdminRights.manage_call;
                                    z4 = tL_chatAdminRights2.manage_call;
                                } else if (childAdapterPosition == this.addAdminsRow) {
                                    z3 = tL_chatAdminRights.add_admins;
                                    z4 = tL_chatAdminRights2.add_admins;
                                } else if (childAdapterPosition == this.anonymousRow) {
                                    z11 = tL_chatAdminRights.anonymous;
                                    if (tL_chatAdminRights2.anonymous || ((chat = this.currentChat) != null && chat.creator)) {
                                        z3 = z11;
                                        z4 = true;
                                    } else {
                                        z3 = z11;
                                        z4 = false;
                                    }
                                } else if (childAdapterPosition == this.manageTopicsRow) {
                                    z3 = tL_chatAdminRights.manage_topics;
                                    z4 = tL_chatAdminRights2.manage_topics;
                                } else if (childAdapterPosition == this.manageLinkedPeersRow) {
                                    z3 = tL_chatAdminRights.manage_linked_peers;
                                    z4 = tL_chatAdminRights2.manage_linked_peers;
                                } else {
                                    z3 = false;
                                    z4 = false;
                                }
                                TextCheckCell2 textCheckCell3 = (TextCheckCell2) childAt;
                                textCheckCell3.setChecked(z3);
                                textCheckCell3.setEnabled(z4, true);
                            } else if ((childAdapterPosition != this.changeInfoRow || tL_chatBannedRights3.change_info) && ((childAdapterPosition != this.pinMessagesRow || tL_chatBannedRights3.pin_messages) && (childAdapterPosition != this.editTagsRow || tL_chatBannedRights3.edit_rank))) {
                                TextCheckCell2 textCheckCell4 = (TextCheckCell2) childAt;
                                textCheckCell4.setChecked(z7);
                                textCheckCell4.setEnabled(childAdapterPosition == this.manageRow, true);
                            } else {
                                TextCheckCell2 textCheckCell5 = (TextCheckCell2) childAt;
                                textCheckCell5.setChecked(true);
                                textCheckCell5.setEnabled(z7, z7);
                            }
                        }
                        i12++;
                        z7 = false;
                    }
                    this.listViewAdapter.mObservable.notifyChanged();
                    AnimatedTextView animatedTextView = this.addBotButtonText;
                    if (animatedTextView != null) {
                        StringBuilder sb = new StringBuilder();
                        zzlf.m(R.string.AddBotButton, " ", sb);
                        sb.append(LocaleController.getString(this.asAdmin ? R.string.AddBotButtonAsAdmin : R.string.AddBotButtonAsMember));
                        animatedTextView.setText(sb.toString(), true, this.asAdmin);
                    }
                    ValueAnimator valueAnimator = this.asAdminAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.asAdminAnimator = null;
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.asAdminT, this.asAdmin ? 1.0f : 0.0f);
                    this.asAdminAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new ChatRightsEditActivity$$ExternalSyntheticLambda11(this, 0));
                    this.asAdminAnimator.setDuration((long) (Math.abs(this.asAdminT - (this.asAdmin ? 1.0f : 0.0f)) * 200.0f));
                    this.asAdminAnimator.start();
                } else if (i == this.changeInfoRow) {
                    if (i3 == 0 || i3 == 2) {
                        z10 = !tL_chatAdminRights.change_info;
                        tL_chatAdminRights.change_info = z10;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights14 = this.bannedRights;
                        z10 = !tL_chatBannedRights14.change_info;
                        tL_chatBannedRights14.change_info = z10;
                    }
                } else if (i == this.postMessagesRow) {
                    z10 = !tL_chatAdminRights.post_messages;
                    tL_chatAdminRights.post_messages = z10;
                } else if (i == this.guardBotRow) {
                    String shortName = DialogObject.getShortName(user);
                    String string5 = LocaleController.getString(R.string.ApproveNewMembersTitle);
                    String string6 = LocaleController.getString(!z10 ? R.string.ApproveNewMembersEnable : R.string.ApproveNewMembersDisable);
                    boolean z12 = this.isChannel;
                    if (z10) {
                        i2 = z12 ? R.string.ApproveNewMembersDisabledMessageChannel : R.string.ApproveNewMembersDisabledMessageGroup;
                    } else {
                        i2 = z12 ? R.string.ApproveNewMembersMessageChannel : R.string.ApproveNewMembersMessageGroup;
                    }
                    AlertsCreator.showSimpleConfirmAlert(this, string5, AndroidUtilities.replaceTags(LocaleController.formatString(i2, shortName)), string6, false, new ChatRightsEditActivity$$ExternalSyntheticLambda5(this, !z10 ? user.id : 0L, 0));
                } else if (i == this.manageWelcomeRow) {
                    z10 = !tL_chatAdminRights.manage_welcome_messages;
                    tL_chatAdminRights.manage_welcome_messages = z10;
                } else if (i == this.manageDirectRow) {
                    z10 = !tL_chatAdminRights.manage_direct_messages;
                    tL_chatAdminRights.manage_direct_messages = z10;
                } else if (i == this.editMesagesRow) {
                    z10 = !tL_chatAdminRights.edit_messages;
                    tL_chatAdminRights.edit_messages = z10;
                } else if (i == this.deleteMessagesRow) {
                    z10 = !tL_chatAdminRights.delete_messages;
                    tL_chatAdminRights.delete_messages = z10;
                } else if (i == this.addAdminsRow) {
                    z10 = !tL_chatAdminRights.add_admins;
                    tL_chatAdminRights.add_admins = z10;
                } else if (i == this.anonymousRow) {
                    z10 = !tL_chatAdminRights.anonymous;
                    tL_chatAdminRights.anonymous = z10;
                } else if (i == this.banUsersRow) {
                    z10 = !tL_chatAdminRights.ban_users;
                    tL_chatAdminRights.ban_users = z10;
                } else if (i == this.startVoiceChatRow) {
                    z10 = !tL_chatAdminRights.manage_call;
                    tL_chatAdminRights.manage_call = z10;
                } else if (i == this.manageTopicsRow) {
                    if (i3 == 0 || i3 == 2) {
                        z10 = !tL_chatAdminRights.manage_topics;
                        tL_chatAdminRights.manage_topics = z10;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights15 = this.bannedRights;
                        z10 = !tL_chatBannedRights15.manage_topics;
                        tL_chatBannedRights15.manage_topics = z10;
                    }
                } else if (i == this.manageLinkedPeersRow) {
                    if (i3 == 0 || i3 == 2) {
                        z10 = !tL_chatAdminRights.manage_linked_peers;
                        tL_chatAdminRights.manage_linked_peers = z10;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights16 = this.bannedRights;
                        z10 = !tL_chatBannedRights16.manage_linked_peers;
                        tL_chatBannedRights16.manage_linked_peers = z10;
                    }
                } else if (i == this.addUsersRow) {
                    if (i3 == 0 || i3 == 2) {
                        z10 = !tL_chatAdminRights.invite_users;
                        tL_chatAdminRights.invite_users = z10;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights17 = this.bannedRights;
                        z10 = !tL_chatBannedRights17.invite_users;
                        tL_chatBannedRights17.invite_users = z10;
                    }
                } else if (i == this.pinMessagesRow) {
                    if (i3 == 0 || i3 == 2) {
                        z10 = !tL_chatAdminRights.pin_messages;
                        tL_chatAdminRights.pin_messages = z10;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights18 = this.bannedRights;
                        z10 = !tL_chatBannedRights18.pin_messages;
                        tL_chatBannedRights18.pin_messages = z10;
                    }
                } else {
                    if (i != this.editTagsRow) {
                        if (i3 == 1 && (tL_chatBannedRights = this.bannedRights) != null) {
                            if (i == this.sendMessagesRow) {
                                z = !tL_chatBannedRights.send_plain;
                                tL_chatBannedRights.send_plain = z;
                            } else {
                                z = z10;
                            }
                            if (z10 && ((!tL_chatBannedRights.send_plain || !tL_chatBannedRights.embed_links || !tL_chatBannedRights.send_inline || !tL_chatBannedRights.send_photos || !tL_chatBannedRights.send_videos || !tL_chatBannedRights.send_audios || !tL_chatBannedRights.send_docs || !tL_chatBannedRights.send_voices || !tL_chatBannedRights.send_roundvideos || !tL_chatBannedRights.send_polls || !tL_chatBannedRights.send_reactions) && tL_chatBannedRights.view_messages)) {
                                tL_chatBannedRights.view_messages = false;
                            }
                            int i14 = this.embedLinksRow;
                            if (i14 >= 0) {
                                this.listViewAdapter.notifyItemChanged(i14);
                            }
                            int i15 = this.sendMediaRow;
                            if (i15 >= 0) {
                                this.listViewAdapter.notifyItemChanged(i15);
                            }
                            z10 = z;
                        }
                        if (i3 == 2) {
                            if (this.asAdmin || !z10) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            textCheckCell2.setChecked(z2);
                        }
                        updateRows$2(true);
                    }
                    if (i3 == 0 || i3 == 2) {
                        z10 = !tL_chatAdminRights.manage_ranks;
                        tL_chatAdminRights.manage_ranks = z10;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights19 = this.bannedRights;
                        z10 = !tL_chatBannedRights19.edit_rank;
                        tL_chatBannedRights19.edit_rank = z10;
                    }
                }
                if (i3 == 2) {
                    if (this.asAdmin) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    textCheckCell2.setChecked(z2);
                }
                updateRows$2(true);
            }
        }
    }

    public final void lambda$initTransfer$13(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j) {
        if (j != 0) {
            this.chatId = j;
            this.currentChat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
            initTransfer(twoStepVerificationActivity, tL_inputCheckPasswordSRP);
        }
    }

    public final void lambda$initTransfer$19(TLRPC.TL_error tL_error, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        TLRPC.User user = this.currentUser;
        if (tL_error == null) {
            if (tL_inputCheckPasswordSRP != null) {
                this.delegate.didChangeOwner(user);
                removeSelfFromStack();
                twoStepVerificationActivity.needHideProgress();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (getParentActivity() == null) {
            return;
        }
        boolean zEquals = "PASSWORD_HASH_INVALID".equals(tL_error.text);
        boolean z = this.isChannel;
        if (zEquals) {
            if (tL_inputCheckPasswordSRP == null) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                AlertDialog alertDialog = builder.alertDialog;
                if (z) {
                    alertDialog.title = LocaleController.getString(R.string.EditAdminChannelTransfer);
                } else {
                    alertDialog.title = LocaleController.getString(R.string.EditAdminGroupTransfer);
                }
                alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText, this.currentChat.title, UserObject.getFirstName(user)));
                builder.setPositiveButton(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new ChatRightsEditActivity$$ExternalSyntheticLambda2(this, 4));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog);
                return;
            }
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ChatActivity$$ExternalSyntheticLambda208(22, this, twoStepVerificationActivity), 8);
                return;
            }
            if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.needHideProgress();
                    twoStepVerificationActivity.finishFragment();
                }
                AlertsCreator.showAddUserAlert(tL_error, this, z, this.isCommunity, tL_channels_editCreator);
                return;
            }
            if (getParentActivity() == null || AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium()) {
                presentFragment(new TooManyCommunitiesActivity(1));
                return;
            } else {
                showDialog(new LimitReachedBottomSheet(5, this.currentAccount, getParentActivity(), this, null));
                return;
            }
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.needHideProgress();
        }
        AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity(), 0, null);
        String string = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
        AlertDialog alertDialog2 = builder2.alertDialog;
        alertDialog2.title = string;
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        builder2.setView(linearLayout);
        TextView textView = new TextView(getParentActivity());
        int i = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(null, i, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (z) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("EditChannelAdminTransferAlertText", R.string.EditChannelAdminTransferAlertText, UserObject.getFirstName(user))));
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferAlertText", R.string.EditAdminTransferAlertText, UserObject.getFirstName(user))));
        }
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(getParentActivity());
        int i2 = R.drawable.list_circle;
        imageView.setImageResource(i2);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int color = Theme.getColor(null, i, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
        TextView textView2 = new TextView(getParentActivity());
        textView2.setTextColor(Theme.getColor(null, i, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
            linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2));
            linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(getParentActivity());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, LayoutHelper.createLinear(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(getParentActivity());
        imageView2.setImageResource(i2);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), mode));
        TextView textView3 = new TextView(getParentActivity());
        textView3.setTextColor(Theme.getColor(null, i, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
            linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2, 5));
        } else {
            linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2));
            linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            builder2.setPositiveButton(LocaleController.getString(R.string.EditAdminTransferSetPassword), new ChatRightsEditActivity$$ExternalSyntheticLambda2(this, 5));
            builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        } else {
            TextView textView4 = new TextView(getParentActivity());
            textView4.setTextColor(Theme.getColor(null, i, false));
            textView4.setTextSize(1, 16.0f);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, LayoutHelper.createLinear(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            builder2.setNegativeButton(LocaleController.getString(R.string.OK), null);
        }
        showDialog(alertDialog2);
    }

    public final void lambda$onDonePressed$21(long j) {
        if (j != 0) {
            this.chatId = j;
            this.currentChat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
            onDonePressed(true);
        }
    }

    public final boolean lambda$onDonePressed$24(TLRPC.TL_error tL_error) {
        setLoading(false);
        if (tL_error == null || !"USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            return true;
        }
        if (ChatObject.isChannel(this.currentChat)) {
            return false;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(11, this.currentAccount, getParentActivity(), this, getResourceProvider());
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.currentUser);
        limitReachedBottomSheet.setRestrictedUsers(this.currentChat, arrayList, null, null, null);
        limitReachedBottomSheet.show();
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        return checkDiscard$1(z);
    }

    public final void onDonePressed(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatRightsEditActivity.onDonePressed(boolean):void");
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void setLoading(boolean z) {
        int i = 1;
        ValueAnimator valueAnimator = this.doneDrawableAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.loading = z;
        this.actionBar.getBackButton().setEnabled(!this.loading);
        CrossfadeDrawable crossfadeDrawable = this.doneDrawable;
        if (crossfadeDrawable != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(crossfadeDrawable.progress, this.loading ? 1.0f : 0.0f);
            this.doneDrawableAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ChatRightsEditActivity$$ExternalSyntheticLambda11(this, i));
            this.doneDrawableAnimator.addListener(new CheckBox.AnonymousClass1(this, 3));
            this.doneDrawableAnimator.setDuration((long) (Math.abs(this.doneDrawable.progress - (this.loading ? 1.0f : 0.0f)) * 150.0f));
            this.doneDrawableAnimator.start();
        }
    }

    public final void updateRows$2(boolean z) {
        int i;
        int iMin = Math.min(this.transferOwnerShadowRow, this.transferOwnerRow);
        this.manageRow = -1;
        this.changeInfoRow = -1;
        this.postMessagesRow = -1;
        this.manageDirectRow = -1;
        this.manageWelcomeRow = -1;
        this.editMesagesRow = -1;
        this.deleteMessagesRow = -1;
        this.addAdminsRow = -1;
        this.anonymousRow = -1;
        this.banUsersRow = -1;
        this.addUsersRow = -1;
        this.pinMessagesRow = -1;
        this.editTagsRow = -1;
        this.sendReactionsRow = -1;
        this.guardBotRow = -1;
        this.guardBotInfoRow = -1;
        this.rightsShadowRow = -1;
        this.removeAdminRow = -1;
        this.removeAdminShadowRow = -1;
        this.cantEditInfoRow = -1;
        this.transferOwnerShadowRow = -1;
        this.transferOwnerRow = -1;
        this.rankHeaderRow = -1;
        this.rankRow = -1;
        this.rankInfoRow = -1;
        this.sendMessagesRow = -1;
        this.sendMediaRow = -1;
        this.channelMessagesRow = -1;
        this.channelPostMessagesRow = -1;
        this.channelEditMessagesRow = -1;
        this.channelDeleteMessagesRow = -1;
        this.channelStoriesRow = -1;
        this.channelPostStoriesRow = -1;
        this.channelEditStoriesRow = -1;
        this.channelDeleteStoriesRow = -1;
        this.sendPhotosRow = -1;
        this.sendVideosRow = -1;
        this.sendMusicRow = -1;
        this.sendFilesRow = -1;
        this.sendVoiceRow = -1;
        this.sendRoundRow = -1;
        this.sendStickersRow = -1;
        this.sendPollsRow = -1;
        this.embedLinksRow = -1;
        this.startVoiceChatRow = -1;
        this.untilSectionRow = -1;
        this.untilDateRow = -1;
        this.addBotButtonRow = -1;
        this.manageTopicsRow = -1;
        this.manageLinkedPeersRow = -1;
        this.rowCount = 3;
        boolean z2 = this.isCommunity;
        boolean z3 = this.isChannel;
        boolean z4 = this.isForum;
        int i2 = this.currentType;
        if (i2 == 0 || i2 == 2) {
            if (z2) {
                this.changeInfoRow = 3;
                this.manageLinkedPeersRow = 4;
                this.addAdminsRow = 5;
                this.rowCount = 7;
                this.banUsersRow = 6;
            } else if (z3) {
                this.changeInfoRow = 3;
                this.rowCount = 5;
                this.channelMessagesRow = 4;
                if (this.channelMessagesExpanded) {
                    this.channelPostMessagesRow = 5;
                    this.channelEditMessagesRow = 6;
                    this.rowCount = 8;
                    this.channelDeleteMessagesRow = 7;
                }
                int i3 = this.rowCount;
                int i4 = i3 + 1;
                this.rowCount = i4;
                this.channelStoriesRow = i3;
                if (this.channelStoriesExpanded) {
                    this.channelPostStoriesRow = i4;
                    this.channelEditStoriesRow = i3 + 2;
                    this.rowCount = i3 + 4;
                    this.channelDeleteStoriesRow = i3 + 3;
                }
                int i5 = this.rowCount;
                this.manageDirectRow = i5;
                this.manageWelcomeRow = i5 + 1;
                this.addUsersRow = i5 + 2;
                this.startVoiceChatRow = i5 + 3;
                this.addAdminsRow = i5 + 4;
                this.rowCount = i5 + 6;
                this.banUsersRow = i5 + 5;
            } else {
                if (i2 == 2) {
                    this.rowCount = 4;
                    this.manageRow = 3;
                }
                int i6 = this.rowCount;
                this.changeInfoRow = i6;
                this.deleteMessagesRow = i6 + 1;
                this.banUsersRow = i6 + 2;
                this.addUsersRow = i6 + 3;
                int i7 = i6 + 5;
                this.rowCount = i7;
                this.pinMessagesRow = i6 + 4;
                if (i2 != 2) {
                    this.rowCount = i6 + 6;
                    this.editTagsRow = i7;
                }
                if (ChatObject.isChannel(this.currentChat)) {
                    int i8 = this.rowCount;
                    int i9 = i8 + 1;
                    this.rowCount = i9;
                    this.channelStoriesRow = i8;
                    if (this.channelStoriesExpanded) {
                        this.channelPostStoriesRow = i9;
                        this.channelEditStoriesRow = i8 + 2;
                        this.rowCount = i8 + 4;
                        this.channelDeleteStoriesRow = i8 + 3;
                    }
                }
                int i10 = this.rowCount;
                this.manageWelcomeRow = i10;
                this.startVoiceChatRow = i10 + 1;
                this.addAdminsRow = i10 + 2;
                int i11 = i10 + 4;
                this.rowCount = i11;
                this.anonymousRow = i10 + 3;
                if (z4) {
                    this.rowCount = i10 + 5;
                    this.manageTopicsRow = i11;
                }
                if (this.currentUserIsBotGuard) {
                    int i12 = this.rowCount;
                    this.guardBotRow = i12;
                    this.rowCount = i12 + 2;
                    this.guardBotInfoRow = i12 + 1;
                }
            }
        } else if (i2 == 1) {
            this.sendMessagesRow = 3;
            this.rowCount = 5;
            this.sendMediaRow = 4;
            if (this.sendMediaExpanded) {
                this.sendPhotosRow = 5;
                this.sendVideosRow = 6;
                this.sendFilesRow = 7;
                this.sendMusicRow = 8;
                this.sendVoiceRow = 9;
                this.sendRoundRow = 10;
                this.sendStickersRow = 11;
                this.sendPollsRow = 12;
                this.embedLinksRow = 13;
                this.rowCount = 15;
                this.sendReactionsRow = 14;
            }
            int i13 = this.rowCount;
            this.addUsersRow = i13;
            this.pinMessagesRow = i13 + 1;
            this.editTagsRow = i13 + 2;
            int i14 = i13 + 4;
            this.rowCount = i14;
            this.changeInfoRow = i13 + 3;
            if (z4) {
                this.rowCount = i13 + 5;
                this.manageTopicsRow = i14;
            }
            int i15 = this.rowCount;
            this.untilSectionRow = i15;
            this.rowCount = i15 + 2;
            this.untilDateRow = i15 + 1;
        }
        int i16 = this.rowCount;
        boolean z5 = this.canEdit;
        TLRPC.User user = this.currentUser;
        if (z5) {
            if (!z3 && (i2 == 0 || ((i2 == 2 && this.asAdmin) || i2 == 1))) {
                this.rightsShadowRow = i16;
                this.rankRow = i16 + 1;
                this.rowCount = i16 + 3;
                this.rankInfoRow = i16 + 2;
            }
            TLRPC.Chat chat = this.currentChat;
            if (chat != null && chat.creator && i2 == 0) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = this.adminRights;
                if (!z3 ? !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || ((z4 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_welcome_messages)) : !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.post_messages || !tL_chatAdminRights.edit_messages || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || !tL_chatAdminRights.post_stories || !tL_chatAdminRights.edit_stories || !tL_chatAdminRights.delete_stories || !tL_chatAdminRights.manage_direct_messages || !tL_chatAdminRights.manage_welcome_messages)) {
                    if (!user.bot && !z2) {
                        int i17 = this.rightsShadowRow;
                        if (i17 == -1) {
                            int i18 = this.rowCount;
                            this.rowCount = i18 + 1;
                            this.transferOwnerShadowRow = i18;
                        }
                        int i19 = this.rowCount;
                        int i20 = i19 + 1;
                        this.rowCount = i20;
                        this.transferOwnerRow = i19;
                        if (i17 != -1) {
                            this.rowCount = i19 + 2;
                            this.transferOwnerShadowRow = i20;
                        }
                    }
                }
            }
            if (this.initialIsSet) {
                if (this.rightsShadowRow == -1) {
                    int i21 = this.rowCount;
                    this.rowCount = i21 + 1;
                    this.rightsShadowRow = i21;
                }
                int i22 = this.rowCount;
                this.removeAdminRow = i22;
                this.rowCount = i22 + 2;
                this.removeAdminShadowRow = i22 + 1;
            }
        } else if (i2 != 0) {
            this.rowCount = i16 + 1;
            this.rightsShadowRow = i16;
        } else if (z3 || (this.currentRank.isEmpty() && !(this.currentChat.creator && UserObject.isUserSelf(user)))) {
            int i23 = this.rowCount;
            this.rowCount = i23 + 1;
            this.cantEditInfoRow = i23;
        } else {
            int i24 = this.rowCount;
            this.rightsShadowRow = i24;
            this.rowCount = i24 + 2;
            this.rankRow = i24 + 1;
            if (this.currentChat.creator && UserObject.isUserSelf(user)) {
                int i25 = this.rowCount;
                this.rowCount = i25 + 1;
                this.rankInfoRow = i25;
            } else {
                int i26 = this.rowCount;
                this.rowCount = i26 + 1;
                this.cantEditInfoRow = i26;
            }
        }
        if (i2 == 2) {
            int i27 = this.rowCount;
            this.rowCount = i27 + 1;
            this.addBotButtonRow = i27;
        }
        if (z) {
            if (iMin == -1 && (i = this.transferOwnerShadowRow) != -1) {
                this.listViewAdapter.mObservable.notifyItemRangeInserted(Math.min(i, this.transferOwnerRow), 2);
            } else {
                if (iMin == -1 || this.transferOwnerShadowRow != -1) {
                    return;
                }
                this.listViewAdapter.mObservable.notifyItemRangeRemoved(iMin, 2);
            }
        }
    }
}
