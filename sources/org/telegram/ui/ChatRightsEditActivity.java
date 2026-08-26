package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
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
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.GuardBotReplaceSheet;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.TagEditCell;

public class ChatRightsEditActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private static final int MAX_RANK_LENGTH = 16;
    public static final int TYPE_ADD_BOT = 2;
    public static final int TYPE_ADMIN = 0;
    public static final int TYPE_BANNED = 1;
    private static final int done_button = 1;
    private int addAdminsRow;
    private FrameLayout addBotButton;
    private FrameLayout addBotButtonContainer;
    private int addBotButtonRow;
    private AnimatedTextView addBotButtonText;
    private int addUsersRow;
    private TLRPC.TL_chatAdminRights adminRights;
    private int anonymousRow;
    private boolean asAdmin;
    private ValueAnimator asAdminAnimator;
    private float asAdminT;
    private int banUsersRow;
    private TLRPC.TL_chatBannedRights bannedRights;
    public boolean banning;
    private String botHash;
    private boolean canEdit;
    private int cantEditInfoRow;
    private int changeInfoRow;
    private int channelDeleteMessagesRow;
    private int channelDeleteStoriesRow;
    private int channelEditMessagesRow;
    private int channelEditStoriesRow;
    private boolean channelMessagesExpanded;
    private int channelMessagesRow;
    private int channelPostMessagesRow;
    private int channelPostStoriesRow;
    private boolean channelStoriesExpanded;
    private int channelStoriesRow;
    private long chatId;
    private TLRPC.ChatFull chatInfo;
    private boolean closingKeyboardAfterFinish;
    private String currentBannedRights;
    private TLRPC.Chat currentChat;
    private String currentRank;
    private int currentType;
    private TLRPC.User currentUser;
    private boolean currentUserIsBotGuard;
    private TLRPC.TL_chatBannedRights defaultBannedRights;
    private ChatRightsEditActivityDelegate delegate;
    private int deleteMessagesRow;
    private CrossfadeDrawable doneDrawable;
    private ValueAnimator doneDrawableAnimator;
    private int editMesagesRow;
    private int editTagsRow;
    private int embedLinksRow;
    private long guardBotIdToSet;
    private int guardBotInfoRow;
    private int guardBotRow;
    private boolean hasGuardBotToSet;
    private boolean initialAsAdmin;
    private boolean initialIsSet;
    private String initialRank;
    private boolean isAddingNew;
    private boolean isChannel;
    private boolean isCommunity;
    private boolean isForum;
    private LinearLayoutManager linearLayoutManager;
    private RecyclerListView listView;
    private ListAdapter listViewAdapter;
    private boolean loading;
    private int manageDirectRow;
    private int manageLinkedPeersRow;
    private int manageRow;
    private int manageTopicsRow;
    private int manageWelcomeRow;
    private TLRPC.TL_chatAdminRights myAdminRights;
    private int permissionsEndRow;
    private int permissionsStartRow;
    private int pinMessagesRow;
    private int postMessagesRow;
    private PollEditTextCell rankEditTextCell;
    private int rankHeaderRow;
    private int rankInfoRow;
    private int rankRow;
    private int removeAdminRow;
    private int removeAdminShadowRow;
    private int rightsShadowRow;
    private int rowCount;
    private int sendFilesRow;
    private boolean sendMediaExpanded;
    private int sendMediaRow;
    private int sendMessagesRow;
    private int sendMusicRow;
    private int sendPhotosRow;
    private int sendPollsRow;
    private int sendReactionsRow;
    private int sendRoundRow;
    private int sendStickersRow;
    private int sendVideosRow;
    private int sendVoiceRow;
    private int startVoiceChatRow;
    private int transferOwnerRow;
    private int transferOwnerShadowRow;
    private int untilDateRow;
    private int untilSectionRow;

    public interface ChatRightsEditActivityDelegate {
        void didChangeOwner(TLRPC.User user);

        void didSetRights(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str);
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private boolean ignoreTextChange;
        private Context mContext;
        private final int VIEW_TYPE_USER_CELL = 0;
        private final int VIEW_TYPE_INFO_CELL = 1;
        private final int VIEW_TYPE_TRANSFER_CELL = 2;
        private final int VIEW_TYPE_HEADER_CELL = 3;
        private final int VIEW_TYPE_SWITCH_CELL = 4;
        private final int VIEW_TYPE_SHADOW_CELL = 5;
        private final int VIEW_TYPE_UNTIL_DATE_CELL = 6;
        private final int VIEW_TYPE_RANK_CELL = 7;
        private final int VIEW_TYPE_ADD_BOT_CELL = 8;
        private final int VIEW_TYPE_EXPANDABLE_SWITCH = 9;
        private final int VIEW_TYPE_INNER_CHECK = 10;
        private final int VIEW_TYPE_TAG_CELL = 11;

        public ListAdapter(Context context) {
            if (ChatRightsEditActivity.this.currentType == 2) {
                setHasStableIds(true);
            }
            this.mContext = context;
        }

        public void lambda$onBindViewHolder$1(TextCheckCell2 textCheckCell2) {
            if (textCheckCell2.isEnabled()) {
                if (ChatRightsEditActivity.this.allDefaultMediaBanned()) {
                    new AlertDialog.Builder(ChatRightsEditActivity.this.getParentActivity(), 0, null).setTitle(LocaleController.getString(R.string.UserRestrictionsCantModify)).setMessage(LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled)).setPositiveButton(LocaleController.getString(R.string.OK), null).create().show();
                    return;
                }
                boolean z = !textCheckCell2.checkBox.isChecked();
                textCheckCell2.setChecked(z);
                ChatRightsEditActivity.this.setSendMediaEnabled(z);
            }
        }

        public void lambda$onBindViewHolder$2(TextCheckCell2 textCheckCell2) {
            if (textCheckCell2.isEnabled()) {
                boolean zIsChecked = textCheckCell2.checkBox.isChecked();
                textCheckCell2.setChecked(zIsChecked);
                ChatRightsEditActivity.this.setChannelMessagesEnabled(zIsChecked);
            }
        }

        public void lambda$onBindViewHolder$3(TextCheckCell2 textCheckCell2) {
            if (textCheckCell2.isEnabled()) {
                boolean zIsChecked = textCheckCell2.checkBox.isChecked();
                textCheckCell2.setChecked(zIsChecked);
                ChatRightsEditActivity.this.setChannelStoriesEnabled(zIsChecked);
            }
        }

        public void lambda$onBindViewHolder$4(String str) {
            ChatRightsEditActivity.this.currentRank = str;
        }

        public void lambda$onCreateViewHolder$0(View view) {
            ChatRightsEditActivity.this.onDonePressed();
        }

        @Override
        public int getItemCount() {
            return ChatRightsEditActivity.this.rowCount;
        }

        @Override
        public long getItemId(int i) {
            if (ChatRightsEditActivity.this.currentType != 2) {
                return super.getItemId(i);
            }
            if (i == ChatRightsEditActivity.this.manageRow) {
                return 1L;
            }
            if (i == ChatRightsEditActivity.this.changeInfoRow) {
                return 2L;
            }
            if (i == ChatRightsEditActivity.this.postMessagesRow) {
                return 3L;
            }
            if (i == ChatRightsEditActivity.this.editMesagesRow) {
                return 4L;
            }
            if (i == ChatRightsEditActivity.this.deleteMessagesRow) {
                return 5L;
            }
            if (i == ChatRightsEditActivity.this.addAdminsRow) {
                return 6L;
            }
            if (i == ChatRightsEditActivity.this.anonymousRow) {
                return 7L;
            }
            if (i == ChatRightsEditActivity.this.banUsersRow) {
                return 8L;
            }
            if (i == ChatRightsEditActivity.this.addUsersRow) {
                return 9L;
            }
            if (i == ChatRightsEditActivity.this.pinMessagesRow) {
                return 10L;
            }
            if (i == ChatRightsEditActivity.this.rightsShadowRow) {
                return 11L;
            }
            if (i == ChatRightsEditActivity.this.removeAdminRow) {
                return 12L;
            }
            if (i == ChatRightsEditActivity.this.removeAdminShadowRow) {
                return 13L;
            }
            if (i == ChatRightsEditActivity.this.cantEditInfoRow) {
                return 14L;
            }
            if (i == ChatRightsEditActivity.this.transferOwnerShadowRow) {
                return 15L;
            }
            if (i == ChatRightsEditActivity.this.transferOwnerRow) {
                return 16L;
            }
            if (i == ChatRightsEditActivity.this.rankHeaderRow) {
                return 17L;
            }
            if (i == ChatRightsEditActivity.this.rankRow) {
                return 18L;
            }
            if (i == ChatRightsEditActivity.this.rankInfoRow) {
                return 19L;
            }
            if (i == ChatRightsEditActivity.this.sendMessagesRow) {
                return 20L;
            }
            if (i == ChatRightsEditActivity.this.sendPhotosRow) {
                return 21L;
            }
            if (i == ChatRightsEditActivity.this.sendStickersRow) {
                return 22L;
            }
            if (i == ChatRightsEditActivity.this.sendPollsRow) {
                return 23L;
            }
            if (i == ChatRightsEditActivity.this.embedLinksRow) {
                return 24L;
            }
            if (i == ChatRightsEditActivity.this.startVoiceChatRow) {
                return 25L;
            }
            if (i == ChatRightsEditActivity.this.untilSectionRow) {
                return 26L;
            }
            if (i == ChatRightsEditActivity.this.untilDateRow) {
                return 27L;
            }
            if (i == ChatRightsEditActivity.this.addBotButtonRow) {
                return 28L;
            }
            if (i == ChatRightsEditActivity.this.manageTopicsRow) {
                return 29L;
            }
            if (i == ChatRightsEditActivity.this.sendVideosRow) {
                return 30L;
            }
            if (i == ChatRightsEditActivity.this.sendFilesRow) {
                return 31L;
            }
            if (i == ChatRightsEditActivity.this.sendMusicRow) {
                return 32L;
            }
            if (i == ChatRightsEditActivity.this.sendVoiceRow) {
                return 33L;
            }
            if (i == ChatRightsEditActivity.this.sendRoundRow) {
                return 34L;
            }
            if (i == ChatRightsEditActivity.this.sendMediaRow) {
                return 35L;
            }
            if (i == ChatRightsEditActivity.this.channelMessagesRow) {
                return 36L;
            }
            if (i == ChatRightsEditActivity.this.channelPostMessagesRow) {
                return 37L;
            }
            if (i == ChatRightsEditActivity.this.channelEditMessagesRow) {
                return 38L;
            }
            if (i == ChatRightsEditActivity.this.channelDeleteMessagesRow) {
                return 39L;
            }
            if (i == ChatRightsEditActivity.this.channelStoriesRow) {
                return 40L;
            }
            if (i == ChatRightsEditActivity.this.channelPostStoriesRow) {
                return 41L;
            }
            if (i == ChatRightsEditActivity.this.channelEditStoriesRow) {
                return 42L;
            }
            if (i == ChatRightsEditActivity.this.channelDeleteStoriesRow) {
                return 43L;
            }
            if (i == ChatRightsEditActivity.this.manageDirectRow) {
                return 44L;
            }
            if (i == ChatRightsEditActivity.this.editTagsRow) {
                return 45L;
            }
            if (i == ChatRightsEditActivity.this.sendReactionsRow) {
                return 46L;
            }
            if (i == ChatRightsEditActivity.this.guardBotRow) {
                return 47L;
            }
            if (i == ChatRightsEditActivity.this.guardBotInfoRow) {
                return 48L;
            }
            if (i == ChatRightsEditActivity.this.manageLinkedPeersRow) {
                return 49L;
            }
            return i == ChatRightsEditActivity.this.manageWelcomeRow ? 50L : 0L;
        }

        @Override
        public int getItemViewType(int i) {
            if (ChatRightsEditActivity.this.isExpandableSendMediaRow(i)) {
                return 10;
            }
            if (i == ChatRightsEditActivity.this.sendMediaRow || i == ChatRightsEditActivity.this.channelMessagesRow || i == ChatRightsEditActivity.this.channelStoriesRow) {
                return 9;
            }
            if (i == 0) {
                return 0;
            }
            if (i == 1 || i == ChatRightsEditActivity.this.rightsShadowRow || i == ChatRightsEditActivity.this.removeAdminShadowRow || i == ChatRightsEditActivity.this.untilSectionRow || i == ChatRightsEditActivity.this.transferOwnerShadowRow) {
                return 5;
            }
            if (i == 2 || i == ChatRightsEditActivity.this.rankHeaderRow) {
                return 3;
            }
            if (i == ChatRightsEditActivity.this.changeInfoRow || i == ChatRightsEditActivity.this.postMessagesRow || i == ChatRightsEditActivity.this.manageDirectRow || i == ChatRightsEditActivity.this.editMesagesRow || i == ChatRightsEditActivity.this.deleteMessagesRow || i == ChatRightsEditActivity.this.addAdminsRow || i == ChatRightsEditActivity.this.banUsersRow || i == ChatRightsEditActivity.this.addUsersRow || i == ChatRightsEditActivity.this.pinMessagesRow || i == ChatRightsEditActivity.this.editTagsRow || i == ChatRightsEditActivity.this.sendMessagesRow || i == ChatRightsEditActivity.this.anonymousRow || i == ChatRightsEditActivity.this.startVoiceChatRow || i == ChatRightsEditActivity.this.manageRow || i == ChatRightsEditActivity.this.manageTopicsRow || i == ChatRightsEditActivity.this.guardBotRow || i == ChatRightsEditActivity.this.manageLinkedPeersRow || i == ChatRightsEditActivity.this.manageWelcomeRow) {
                return 4;
            }
            if (i == ChatRightsEditActivity.this.cantEditInfoRow || i == ChatRightsEditActivity.this.rankInfoRow || i == ChatRightsEditActivity.this.guardBotInfoRow) {
                return 1;
            }
            if (i == ChatRightsEditActivity.this.untilDateRow) {
                return 6;
            }
            if (i == ChatRightsEditActivity.this.rankRow) {
                return 11;
            }
            return i == ChatRightsEditActivity.this.addBotButtonRow ? 8 : 2;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            if (ChatRightsEditActivity.this.currentChat.creator && ((ChatRightsEditActivity.this.currentType == 0 || (ChatRightsEditActivity.this.currentType == 2 && ChatRightsEditActivity.this.asAdmin)) && itemViewType == 4 && viewHolder.getAdapterPosition() == ChatRightsEditActivity.this.anonymousRow)) {
                return true;
            }
            if (!ChatRightsEditActivity.this.canEdit) {
                return false;
            }
            if ((ChatRightsEditActivity.this.currentType == 0 || ChatRightsEditActivity.this.currentType == 2) && itemViewType == 4) {
                int adapterPosition = viewHolder.getAdapterPosition();
                if (adapterPosition == ChatRightsEditActivity.this.manageRow) {
                    return ChatRightsEditActivity.this.myAdminRights.add_admins || (ChatRightsEditActivity.this.currentChat != null && ChatRightsEditActivity.this.currentChat.creator);
                }
                if (ChatRightsEditActivity.this.currentType == 2 && !ChatRightsEditActivity.this.asAdmin) {
                    return false;
                }
                if (adapterPosition == ChatRightsEditActivity.this.changeInfoRow) {
                    return ChatRightsEditActivity.this.myAdminRights.change_info && (ChatRightsEditActivity.this.defaultBannedRights == null || ChatRightsEditActivity.this.defaultBannedRights.change_info || ChatRightsEditActivity.this.isChannel);
                }
                if (adapterPosition == ChatRightsEditActivity.this.postMessagesRow) {
                    return ChatRightsEditActivity.this.myAdminRights.post_messages;
                }
                if (adapterPosition == ChatRightsEditActivity.this.manageDirectRow) {
                    return ChatRightsEditActivity.this.myAdminRights.manage_direct_messages;
                }
                if (adapterPosition == ChatRightsEditActivity.this.manageWelcomeRow) {
                    return ChatRightsEditActivity.this.myAdminRights.manage_welcome_messages;
                }
                if (adapterPosition == ChatRightsEditActivity.this.editMesagesRow) {
                    return ChatRightsEditActivity.this.myAdminRights.edit_messages;
                }
                if (adapterPosition == ChatRightsEditActivity.this.deleteMessagesRow) {
                    return ChatRightsEditActivity.this.myAdminRights.delete_messages;
                }
                if (adapterPosition == ChatRightsEditActivity.this.startVoiceChatRow) {
                    return ChatRightsEditActivity.this.myAdminRights.manage_call;
                }
                if (adapterPosition == ChatRightsEditActivity.this.addAdminsRow) {
                    return ChatRightsEditActivity.this.myAdminRights.add_admins;
                }
                if (adapterPosition == ChatRightsEditActivity.this.anonymousRow) {
                    return ChatRightsEditActivity.this.myAdminRights.anonymous;
                }
                if (adapterPosition == ChatRightsEditActivity.this.banUsersRow) {
                    return ChatRightsEditActivity.this.myAdminRights.ban_users;
                }
                if (adapterPosition == ChatRightsEditActivity.this.addUsersRow) {
                    return ChatRightsEditActivity.this.myAdminRights.invite_users;
                }
                if (adapterPosition == ChatRightsEditActivity.this.pinMessagesRow) {
                    return ChatRightsEditActivity.this.myAdminRights.pin_messages && (ChatRightsEditActivity.this.defaultBannedRights == null || ChatRightsEditActivity.this.defaultBannedRights.pin_messages);
                }
                if (adapterPosition == ChatRightsEditActivity.this.editTagsRow) {
                    return ChatRightsEditActivity.this.myAdminRights.manage_ranks;
                }
                if (adapterPosition == ChatRightsEditActivity.this.manageTopicsRow) {
                    return ChatRightsEditActivity.this.myAdminRights.manage_topics;
                }
                if (adapterPosition == ChatRightsEditActivity.this.channelPostStoriesRow) {
                    return ChatRightsEditActivity.this.myAdminRights.post_stories;
                }
                if (adapterPosition == ChatRightsEditActivity.this.channelEditStoriesRow) {
                    return ChatRightsEditActivity.this.myAdminRights.edit_stories;
                }
                if (adapterPosition == ChatRightsEditActivity.this.channelDeleteStoriesRow) {
                    return ChatRightsEditActivity.this.myAdminRights.delete_stories;
                }
                if (adapterPosition == ChatRightsEditActivity.this.manageLinkedPeersRow) {
                    return ChatRightsEditActivity.this.myAdminRights.manage_linked_peers;
                }
            }
            return (itemViewType == 3 || itemViewType == 1 || itemViewType == 5 || itemViewType == 8 || itemViewType == 11) ? false : true;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            final int i2 = 2;
            char c = 1;
            char c2 = 1;
            final int i3 = 0;
            switch (viewHolder.getItemViewType()) {
                case 0:
                    ((UserCell2) viewHolder.itemView).setData(ChatRightsEditActivity.this.currentUser, ChatRightsEditActivity.this.currentType == 2 ? LocaleController.getString(R.string.Bot) : null);
                    break;
                case 1:
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    if (i == ChatRightsEditActivity.this.guardBotInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.EditAdminProcessJoinRequestsInfo));
                    } else if (i == ChatRightsEditActivity.this.cantEditInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.EditAdminCantEdit));
                    } else if (i == ChatRightsEditActivity.this.rankInfoRow) {
                        textInfoPrivacyCell.setText(ChatRightsEditActivity.this.currentType == 0 ? LocaleController.formatString(R.string.EditAdminRankInfo, (UserObject.isUserSelf(ChatRightsEditActivity.this.currentUser) && ChatRightsEditActivity.this.currentChat.creator) ? LocaleController.getString(R.string.ChannelCreator) : LocaleController.getString(R.string.ChannelAdmin)) : LocaleController.formatString(R.string.EditMemberRankInfo, UserObject.getUserName(ChatRightsEditActivity.this.currentUser)));
                    }
                    break;
                case 2:
                    TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                    if (i == ChatRightsEditActivity.this.removeAdminRow) {
                        int i4 = Theme.key_text_RedRegular;
                        textSettingsCell.setTextColor(Theme.getColor(i4));
                        textSettingsCell.setTag(Integer.valueOf(i4));
                        if (ChatRightsEditActivity.this.currentType == 0) {
                            textSettingsCell.setText(LocaleController.getString(R.string.EditAdminRemoveAdmin), false);
                        } else if (ChatRightsEditActivity.this.currentType == 1) {
                            textSettingsCell.setText(LocaleController.getString(R.string.UserRestrictionsBlock), false);
                        }
                    } else if (i == ChatRightsEditActivity.this.transferOwnerRow) {
                        int i5 = Theme.key_windowBackgroundWhiteBlackText;
                        textSettingsCell.setTextColor(Theme.getColor(i5));
                        textSettingsCell.setTag(Integer.valueOf(i5));
                        if (!ChatRightsEditActivity.this.isChannel) {
                            textSettingsCell.setText(LocaleController.getString(R.string.EditAdminGroupTransfer), false);
                        } else {
                            textSettingsCell.setText(LocaleController.getString(R.string.EditAdminChannelTransfer), false);
                        }
                    }
                    break;
                case 3:
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    if (i != 2) {
                        if (i == ChatRightsEditActivity.this.rankHeaderRow) {
                            headerCell.setText(LocaleController.getString(R.string.EditAdminRank));
                        }
                    } else if (ChatRightsEditActivity.this.currentType == 2 || (ChatRightsEditActivity.this.currentUser != null && ChatRightsEditActivity.this.currentUser.bot)) {
                        headerCell.setText(LocaleController.getString(R.string.BotRestrictionsCanDo));
                    } else if (ChatRightsEditActivity.this.currentType == 0) {
                        headerCell.setText(LocaleController.getString(R.string.EditAdminWhatCanDo));
                    } else if (ChatRightsEditActivity.this.currentType == 1) {
                        headerCell.setText(LocaleController.getString(R.string.UserRestrictionsCanDo));
                    }
                    break;
                case 4:
                case 9:
                    final TextCheckCell2 textCheckCell2 = (TextCheckCell2) viewHolder.itemView;
                    boolean z2 = ChatRightsEditActivity.this.currentType != 2 || ChatRightsEditActivity.this.asAdmin;
                    boolean z3 = ChatRightsEditActivity.this.currentChat != null && ChatRightsEditActivity.this.currentChat.creator;
                    if (i == ChatRightsEditActivity.this.sendMediaRow) {
                        int sendMediaSelectedCount = ChatRightsEditActivity.this.getSendMediaSelectedCount();
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.UserRestrictionsSendMedia), sendMediaSelectedCount > 0, true, true);
                        Locale locale = Locale.US;
                        textCheckCell2.setCollapseArrow(RendererCapabilities.CC.m(sendMediaSelectedCount, "/10"), !ChatRightsEditActivity.this.sendMediaExpanded, new Runnable(this) {
                            public final ChatRightsEditActivity.ListAdapter f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        this.f$0.lambda$onBindViewHolder$1(textCheckCell2);
                                        break;
                                    case 1:
                                        this.f$0.lambda$onBindViewHolder$2(textCheckCell2);
                                        break;
                                    default:
                                        this.f$0.lambda$onBindViewHolder$3(textCheckCell2);
                                        break;
                                }
                            }
                        });
                        textCheckCell2.setIcon(ChatRightsEditActivity.this.allDefaultMediaBanned() ? R.drawable.permission_locked : 0);
                    } else if (i == ChatRightsEditActivity.this.channelMessagesRow) {
                        int channelMessagesSelectedCount = ChatRightsEditActivity.this.getChannelMessagesSelectedCount();
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.ChannelManageMessages), channelMessagesSelectedCount > 0, true, true);
                        Locale locale2 = Locale.US;
                        String strM = RendererCapabilities.CC.m(channelMessagesSelectedCount, "/3");
                        boolean z4 = !ChatRightsEditActivity.this.channelMessagesExpanded;
                        final char c3 = c == true ? 1 : 0;
                        textCheckCell2.setCollapseArrow(strM, z4, new Runnable(this) {
                            public final ChatRightsEditActivity.ListAdapter f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run() {
                                switch (c3) {
                                    case 0:
                                        this.f$0.lambda$onBindViewHolder$1(textCheckCell2);
                                        break;
                                    case 1:
                                        this.f$0.lambda$onBindViewHolder$2(textCheckCell2);
                                        break;
                                    default:
                                        this.f$0.lambda$onBindViewHolder$3(textCheckCell2);
                                        break;
                                }
                            }
                        });
                    } else if (i == ChatRightsEditActivity.this.channelStoriesRow) {
                        int channelStoriesSelectedCount = ChatRightsEditActivity.this.getChannelStoriesSelectedCount();
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.ChannelManageStories), channelStoriesSelectedCount > 0, true, true);
                        Locale locale3 = Locale.US;
                        textCheckCell2.setCollapseArrow(RendererCapabilities.CC.m(channelStoriesSelectedCount, "/3"), !ChatRightsEditActivity.this.channelStoriesExpanded, new Runnable(this) {
                            public final ChatRightsEditActivity.ListAdapter f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run() {
                                switch (i2) {
                                    case 0:
                                        this.f$0.lambda$onBindViewHolder$1(textCheckCell2);
                                        break;
                                    case 1:
                                        this.f$0.lambda$onBindViewHolder$2(textCheckCell2);
                                        break;
                                    default:
                                        this.f$0.lambda$onBindViewHolder$3(textCheckCell2);
                                        break;
                                }
                            }
                        });
                    } else if (i == ChatRightsEditActivity.this.manageRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.ManageGroup), ChatRightsEditActivity.this.asAdmin, true);
                        textCheckCell2.setIcon((ChatRightsEditActivity.this.myAdminRights.add_admins || z3) ? 0 : R.drawable.permission_locked);
                    } else if (i == ChatRightsEditActivity.this.changeInfoRow) {
                        if (ChatRightsEditActivity.this.currentType == 0 || ChatRightsEditActivity.this.currentType == 2) {
                            if (ChatRightsEditActivity.this.isCommunity) {
                                textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.CommunityAdminRightEditCommunityName), z2 && ChatRightsEditActivity.this.adminRights.change_info, true);
                            } else if (ChatRightsEditActivity.this.isChannel) {
                                textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminChangeChannelInfo), z2 && ChatRightsEditActivity.this.adminRights.change_info, true);
                            } else {
                                textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminChangeGroupInfo), (z2 && ChatRightsEditActivity.this.adminRights.change_info) || !ChatRightsEditActivity.this.defaultBannedRights.change_info, true);
                            }
                            if (ChatRightsEditActivity.this.currentType == 2) {
                                textCheckCell2.setIcon((ChatRightsEditActivity.this.myAdminRights.change_info || z3) ? 0 : R.drawable.permission_locked);
                            }
                        } else if (ChatRightsEditActivity.this.currentType == 1) {
                            textCheckCell2.setTextAndCheck(LocaleController.getString(ChatRightsEditActivity.this.isCommunity ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo), (ChatRightsEditActivity.this.bannedRights.change_info || ChatRightsEditActivity.this.defaultBannedRights.change_info) ? false : true, ChatRightsEditActivity.this.manageTopicsRow != -1);
                            textCheckCell2.setIcon(ChatRightsEditActivity.this.defaultBannedRights.change_info ? R.drawable.permission_locked : 0);
                        }
                    } else if (i == ChatRightsEditActivity.this.postMessagesRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminPostMessages), z2 && ChatRightsEditActivity.this.adminRights.post_messages, true);
                        if (ChatRightsEditActivity.this.currentType == 2) {
                            textCheckCell2.setIcon((ChatRightsEditActivity.this.myAdminRights.post_messages || z3) ? 0 : R.drawable.permission_locked);
                        }
                    } else if (i == ChatRightsEditActivity.this.manageWelcomeRow) {
                        if (UserObject.isBot(ChatRightsEditActivity.this.currentUser)) {
                            textCheckCell2.setTextAndCheck(LocaleController.getString(ChatRightsEditActivity.this.isChannel ? R.string.EditAdminBotChannelSendWelcomeMessages : R.string.EditAdminBotGroupSendWelcomeMessages), z2 && ChatRightsEditActivity.this.adminRights.manage_welcome_messages, true);
                        } else {
                            textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminUserManageWelcomeMessages), z2 && ChatRightsEditActivity.this.adminRights.manage_welcome_messages, true);
                        }
                        if (ChatRightsEditActivity.this.currentType == 2) {
                            textCheckCell2.setIcon((ChatRightsEditActivity.this.myAdminRights.manage_welcome_messages || z3) ? 0 : R.drawable.permission_locked);
                        }
                    } else if (i == ChatRightsEditActivity.this.manageDirectRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminManageDirect), z2 && ChatRightsEditActivity.this.adminRights.manage_direct_messages, true);
                        if (ChatRightsEditActivity.this.currentType == 2) {
                            textCheckCell2.setIcon((ChatRightsEditActivity.this.myAdminRights.manage_direct_messages || z3) ? 0 : R.drawable.permission_locked);
                        }
                    } else if (i == ChatRightsEditActivity.this.editMesagesRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminEditMessages), z2 && ChatRightsEditActivity.this.adminRights.edit_messages, true);
                        if (ChatRightsEditActivity.this.currentType == 2) {
                            textCheckCell2.setIcon((ChatRightsEditActivity.this.myAdminRights.edit_messages || z3) ? 0 : R.drawable.permission_locked);
                        }
                    } else if (i == ChatRightsEditActivity.this.deleteMessagesRow) {
                        if (ChatRightsEditActivity.this.isChannel) {
                            textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminDeleteMessages), z2 && ChatRightsEditActivity.this.adminRights.delete_messages, true);
                        } else {
                            textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminGroupDeleteMessages), z2 && ChatRightsEditActivity.this.adminRights.delete_messages, true);
                        }
                        if (ChatRightsEditActivity.this.currentType == 2) {
                            textCheckCell2.setIcon((ChatRightsEditActivity.this.myAdminRights.delete_messages || z3) ? 0 : R.drawable.permission_locked);
                        }
                    } else if (i == ChatRightsEditActivity.this.addAdminsRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminAddAdmins), z2 && ChatRightsEditActivity.this.adminRights.add_admins, (ChatRightsEditActivity.this.banUsersRow != -1 && ChatRightsEditActivity.this.isChannel) || ChatRightsEditActivity.this.anonymousRow != -1);
                        if (ChatRightsEditActivity.this.currentType == 2) {
                            textCheckCell2.setIcon((ChatRightsEditActivity.this.myAdminRights.add_admins || z3) ? 0 : R.drawable.permission_locked);
                        }
                    } else if (i == ChatRightsEditActivity.this.anonymousRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminSendAnonymously), z2 && ChatRightsEditActivity.this.adminRights.anonymous, ChatRightsEditActivity.this.manageTopicsRow != -1 || ChatRightsEditActivity.this.currentUserIsBotGuard);
                        if (ChatRightsEditActivity.this.currentType == 2) {
                            textCheckCell2.setIcon((ChatRightsEditActivity.this.myAdminRights.anonymous || z3) ? 0 : R.drawable.permission_locked);
                        }
                    } else if (i == ChatRightsEditActivity.this.guardBotRow) {
                        String string = LocaleController.getString(R.string.EditAdminProcessJoinRequests);
                        if (ChatRightsEditActivity.this.chatInfo == null || ChatRightsEditActivity.this.currentUser == null) {
                            z = false;
                        } else if ((ChatRightsEditActivity.this.hasGuardBotToSet ? ChatRightsEditActivity.this.guardBotIdToSet : ChatRightsEditActivity.this.chatInfo.guard_bot_id) == ChatRightsEditActivity.this.currentUser.id) {
                            z = true;
                        } else {
                            z = false;
                        }
                        textCheckCell2.setTextAndCheck(string, z, false);
                        if (ChatRightsEditActivity.this.currentType == 2) {
                            textCheckCell2.setIcon(0);
                        }
                    } else if (i == ChatRightsEditActivity.this.banUsersRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(ChatRightsEditActivity.this.isCommunity ? R.string.CommunityAdminRightBanMembers : R.string.EditAdminBanUsers), z2 && ChatRightsEditActivity.this.adminRights.ban_users, !ChatRightsEditActivity.this.isCommunity);
                        if (ChatRightsEditActivity.this.currentType == 2) {
                            textCheckCell2.setIcon((ChatRightsEditActivity.this.myAdminRights.ban_users || z3) ? 0 : R.drawable.permission_locked);
                        }
                    } else if (i == ChatRightsEditActivity.this.manageLinkedPeersRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.CommunityAdminRightEditGroupList), z2 && ChatRightsEditActivity.this.adminRights.manage_linked_peers, true);
                        if (ChatRightsEditActivity.this.currentType == 2) {
                            textCheckCell2.setIcon((ChatRightsEditActivity.this.myAdminRights.manage_linked_peers || z3) ? 0 : R.drawable.permission_locked);
                        }
                    } else if (i == ChatRightsEditActivity.this.startVoiceChatRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.StartVoipChatPermission), z2 && ChatRightsEditActivity.this.adminRights.manage_call, true);
                        if (ChatRightsEditActivity.this.currentType == 2) {
                            textCheckCell2.setIcon((ChatRightsEditActivity.this.myAdminRights.manage_call || z3) ? 0 : R.drawable.permission_locked);
                        }
                    } else if (i == ChatRightsEditActivity.this.manageTopicsRow) {
                        if (ChatRightsEditActivity.this.currentType == 0) {
                            textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.ManageTopicsPermission), z2 && ChatRightsEditActivity.this.adminRights.manage_topics, ChatRightsEditActivity.this.currentUserIsBotGuard);
                        } else if (ChatRightsEditActivity.this.currentType == 1) {
                            textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.CreateTopicsPermission), (ChatRightsEditActivity.this.bannedRights.manage_topics || ChatRightsEditActivity.this.defaultBannedRights.manage_topics) ? false : true, ChatRightsEditActivity.this.currentUserIsBotGuard);
                            textCheckCell2.setIcon(ChatRightsEditActivity.this.defaultBannedRights.manage_topics ? R.drawable.permission_locked : 0);
                        } else if (ChatRightsEditActivity.this.currentType == 2) {
                            textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.ManageTopicsPermission), z2 && ChatRightsEditActivity.this.adminRights.manage_topics, ChatRightsEditActivity.this.currentUserIsBotGuard);
                            textCheckCell2.setIcon((ChatRightsEditActivity.this.myAdminRights.manage_topics || z3) ? 0 : R.drawable.permission_locked);
                        }
                    } else if (i == ChatRightsEditActivity.this.addUsersRow) {
                        if (ChatRightsEditActivity.this.currentType == 0) {
                            if (ChatObject.isActionBannedByDefault(ChatRightsEditActivity.this.currentChat, 3)) {
                                textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminAddUsers), ChatRightsEditActivity.this.adminRights.invite_users, true);
                            } else {
                                textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminAddUsersViaLink), ChatRightsEditActivity.this.adminRights.invite_users, true);
                            }
                        } else if (ChatRightsEditActivity.this.currentType == 1) {
                            textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.UserRestrictionsInviteUsers), (ChatRightsEditActivity.this.bannedRights.invite_users || ChatRightsEditActivity.this.defaultBannedRights.invite_users) ? false : true, true);
                            textCheckCell2.setIcon(ChatRightsEditActivity.this.defaultBannedRights.invite_users ? R.drawable.permission_locked : 0);
                        } else if (ChatRightsEditActivity.this.currentType == 2) {
                            textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminAddUsersViaLink), z2 && ChatRightsEditActivity.this.adminRights.invite_users, true);
                            textCheckCell2.setIcon((ChatRightsEditActivity.this.myAdminRights.invite_users || z3) ? 0 : R.drawable.permission_locked);
                        }
                    } else if (i == ChatRightsEditActivity.this.pinMessagesRow) {
                        if (ChatRightsEditActivity.this.currentType == 0 || ChatRightsEditActivity.this.currentType == 2) {
                            textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminPinMessages), (z2 && ChatRightsEditActivity.this.adminRights.pin_messages) || !ChatRightsEditActivity.this.defaultBannedRights.pin_messages, true);
                            if (ChatRightsEditActivity.this.currentType == 2) {
                                textCheckCell2.setIcon((ChatRightsEditActivity.this.myAdminRights.pin_messages || z3) ? 0 : R.drawable.permission_locked);
                            }
                        } else if (ChatRightsEditActivity.this.currentType == 1) {
                            textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.UserRestrictionsPinMessages), (ChatRightsEditActivity.this.bannedRights.pin_messages || ChatRightsEditActivity.this.defaultBannedRights.pin_messages) ? false : true, true);
                            textCheckCell2.setIcon(ChatRightsEditActivity.this.defaultBannedRights.pin_messages ? R.drawable.permission_locked : 0);
                        }
                    } else if (i == ChatRightsEditActivity.this.editTagsRow) {
                        if (ChatRightsEditActivity.this.currentType == 0 || ChatRightsEditActivity.this.currentType == 2) {
                            textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.EditAdminEditTags), z2 && ChatRightsEditActivity.this.adminRights.manage_ranks, true);
                            if (ChatRightsEditActivity.this.currentType == 2) {
                                textCheckCell2.setIcon((ChatRightsEditActivity.this.myAdminRights.manage_ranks || z3) ? 0 : R.drawable.permission_locked);
                            }
                        } else if (ChatRightsEditActivity.this.currentType == 1) {
                            textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.UserRestrictionsEditTags), (ChatRightsEditActivity.this.bannedRights.edit_rank || ChatRightsEditActivity.this.defaultBannedRights.edit_rank) ? false : true, true);
                            textCheckCell2.setIcon(ChatRightsEditActivity.this.defaultBannedRights.edit_rank ? R.drawable.permission_locked : 0);
                        }
                    } else if (i == ChatRightsEditActivity.this.sendMessagesRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.UserRestrictionsSend), (ChatRightsEditActivity.this.bannedRights.send_plain || ChatRightsEditActivity.this.defaultBannedRights.send_plain) ? false : true, true);
                        textCheckCell2.setIcon(ChatRightsEditActivity.this.defaultBannedRights.send_plain ? R.drawable.permission_locked : 0);
                    }
                    if (ChatRightsEditActivity.this.currentType != 2 && i == ChatRightsEditActivity.this.sendMessagesRow) {
                        textCheckCell2.setEnabled((ChatRightsEditActivity.this.bannedRights.view_messages || ChatRightsEditActivity.this.defaultBannedRights.view_messages) ? false : true);
                    }
                    break;
                case 5:
                    ShadowSectionCell shadowSectionCell = (ShadowSectionCell) viewHolder.itemView;
                    if (ChatRightsEditActivity.this.currentType == 2 && (i == ChatRightsEditActivity.this.rightsShadowRow || i == ChatRightsEditActivity.this.rankInfoRow)) {
                        shadowSectionCell.setAlpha(ChatRightsEditActivity.this.asAdminT);
                    } else {
                        shadowSectionCell.setAlpha(1.0f);
                    }
                    break;
                case 6:
                    TextDetailCell textDetailCell = (TextDetailCell) viewHolder.itemView;
                    if (i == ChatRightsEditActivity.this.untilDateRow) {
                        textDetailCell.setTextAndValue(LocaleController.getString(R.string.UserRestrictionsDuration), (ChatRightsEditActivity.this.bannedRights.until_date == 0 || Math.abs(((long) ChatRightsEditActivity.this.bannedRights.until_date) - (System.currentTimeMillis() / 1000)) > 315360000) ? LocaleController.getString(R.string.UserRestrictionsUntilForever) : LocaleController.formatDateForBan(ChatRightsEditActivity.this.bannedRights.until_date), false);
                    }
                    break;
                case 7:
                    PollEditTextCell pollEditTextCell = (PollEditTextCell) viewHolder.itemView;
                    String string2 = (UserObject.isUserSelf(ChatRightsEditActivity.this.currentUser) && ChatRightsEditActivity.this.currentChat.creator) ? LocaleController.getString(R.string.ChannelCreator) : LocaleController.getString(R.string.ChannelAdmin);
                    this.ignoreTextChange = true;
                    pollEditTextCell.getTextView().setEnabled(ChatRightsEditActivity.this.canEdit || ChatRightsEditActivity.this.currentChat.creator);
                    pollEditTextCell.getTextView().setSingleLine(true);
                    pollEditTextCell.getTextView().setImeOptions(6);
                    pollEditTextCell.setTextAndHint(ChatRightsEditActivity.this.currentRank, string2, false);
                    this.ignoreTextChange = false;
                    break;
                case 10:
                    CheckBoxCell checkBoxCell = (CheckBoxCell) viewHolder.itemView;
                    boolean z5 = checkBoxCell.getTag() != null && ((Integer) checkBoxCell.getTag()).intValue() == i;
                    checkBoxCell.setTag(Integer.valueOf(i));
                    if (i == ChatRightsEditActivity.this.sendStickersRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.SendMediaPermissionStickersGifs), "", (ChatRightsEditActivity.this.bannedRights.send_stickers || ChatRightsEditActivity.this.defaultBannedRights.send_stickers) ? false : true, true, z5);
                        checkBoxCell.setIcon(ChatRightsEditActivity.this.defaultBannedRights.send_stickers ? R.drawable.permission_locked : 0);
                    } else if (i == ChatRightsEditActivity.this.embedLinksRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.UserRestrictionsEmbedLinks), "", (ChatRightsEditActivity.this.bannedRights.embed_links || ChatRightsEditActivity.this.defaultBannedRights.embed_links || ChatRightsEditActivity.this.bannedRights.send_plain || ChatRightsEditActivity.this.defaultBannedRights.send_plain) ? false : true, true, z5);
                        checkBoxCell.setIcon(ChatRightsEditActivity.this.defaultBannedRights.embed_links ? R.drawable.permission_locked : 0);
                    } else if (i == ChatRightsEditActivity.this.sendPollsRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.SendMediaPolls), "", (ChatRightsEditActivity.this.bannedRights.send_polls || ChatRightsEditActivity.this.defaultBannedRights.send_polls) ? false : true, true, z5);
                        checkBoxCell.setIcon(ChatRightsEditActivity.this.defaultBannedRights.send_polls ? R.drawable.permission_locked : 0);
                    } else if (i == ChatRightsEditActivity.this.sendPhotosRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.SendMediaPermissionPhotos), "", (ChatRightsEditActivity.this.bannedRights.send_photos || ChatRightsEditActivity.this.defaultBannedRights.send_photos) ? false : true, true, z5);
                        checkBoxCell.setIcon(ChatRightsEditActivity.this.defaultBannedRights.send_photos ? R.drawable.permission_locked : 0);
                    } else if (i == ChatRightsEditActivity.this.sendVideosRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.SendMediaPermissionVideos), "", (ChatRightsEditActivity.this.bannedRights.send_videos || ChatRightsEditActivity.this.defaultBannedRights.send_videos) ? false : true, true, z5);
                        checkBoxCell.setIcon(ChatRightsEditActivity.this.defaultBannedRights.send_videos ? R.drawable.permission_locked : 0);
                    } else if (i == ChatRightsEditActivity.this.sendReactionsRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", (ChatRightsEditActivity.this.bannedRights.send_reactions || ChatRightsEditActivity.this.defaultBannedRights.send_reactions) ? false : true, true, false);
                        checkBoxCell.setIcon(ChatRightsEditActivity.this.defaultBannedRights.send_reactions ? R.drawable.permission_locked : 0);
                    } else if (i == ChatRightsEditActivity.this.sendMusicRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.SendMediaPermissionMusic), "", (ChatRightsEditActivity.this.bannedRights.send_audios || ChatRightsEditActivity.this.defaultBannedRights.send_audios) ? false : true, true, z5);
                        checkBoxCell.setIcon(ChatRightsEditActivity.this.defaultBannedRights.send_audios ? R.drawable.permission_locked : 0);
                    } else if (i == ChatRightsEditActivity.this.sendFilesRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.SendMediaPermissionFiles), "", (ChatRightsEditActivity.this.bannedRights.send_docs || ChatRightsEditActivity.this.defaultBannedRights.send_docs) ? false : true, true, z5);
                        checkBoxCell.setIcon(ChatRightsEditActivity.this.defaultBannedRights.send_docs ? R.drawable.permission_locked : 0);
                    } else if (i == ChatRightsEditActivity.this.sendVoiceRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.SendMediaPermissionVoice), "", (ChatRightsEditActivity.this.bannedRights.send_voices || ChatRightsEditActivity.this.defaultBannedRights.send_voices) ? false : true, true, z5);
                        checkBoxCell.setIcon(ChatRightsEditActivity.this.defaultBannedRights.send_voices ? R.drawable.permission_locked : 0);
                    } else if (i == ChatRightsEditActivity.this.sendRoundRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.SendMediaPermissionRound), "", (ChatRightsEditActivity.this.bannedRights.send_roundvideos || ChatRightsEditActivity.this.defaultBannedRights.send_roundvideos) ? false : true, true, z5);
                        checkBoxCell.setIcon(ChatRightsEditActivity.this.defaultBannedRights.send_roundvideos ? R.drawable.permission_locked : 0);
                    } else if (i == ChatRightsEditActivity.this.channelPostMessagesRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.EditAdminPostMessages), "", ChatRightsEditActivity.this.adminRights.post_messages, true, z5);
                    } else if (i == ChatRightsEditActivity.this.channelEditMessagesRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.EditAdminEditMessages), "", ChatRightsEditActivity.this.adminRights.edit_messages, true, z5);
                    } else if (i == ChatRightsEditActivity.this.channelDeleteMessagesRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.EditAdminDeleteMessages), "", ChatRightsEditActivity.this.adminRights.delete_messages, true, z5);
                    } else if (i == ChatRightsEditActivity.this.channelPostStoriesRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.EditAdminPostStories), "", ChatRightsEditActivity.this.adminRights.post_stories, true, z5);
                    } else if (i == ChatRightsEditActivity.this.channelEditStoriesRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.EditAdminEditStories), "", ChatRightsEditActivity.this.adminRights.edit_stories, true, z5);
                    } else if (i == ChatRightsEditActivity.this.channelDeleteStoriesRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.EditAdminDeleteStories), "", ChatRightsEditActivity.this.adminRights.delete_stories, true, z5);
                    }
                    break;
                case 11:
                    ((TagEditCell) viewHolder.itemView).set(ChatRightsEditActivity.this.currentUser, ChatRightsEditActivity.this.currentRank, ChatRightsEditActivity.this.currentType == 0, false, new PollItemMenu$$ExternalSyntheticLambda15(this, c2 == true ? 1 : 0));
                    break;
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            View tagEditCell;
            switch (i) {
                case 0:
                    UserCell2 userCell2 = new UserCell2(this.mContext, null);
                    userCell2.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    tagEditCell = userCell2;
                    break;
                case 1:
                    tagEditCell = new TextInfoPrivacyCell(this.mContext, 24, null);
                    break;
                case 2:
                default:
                    TextSettingsCell textSettingsCell = new TextSettingsCell(this.mContext, null, 0);
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
                    TextCheckCell2 textCheckCell2 = new TextCheckCell2(this.mContext);
                    textCheckCell2.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    tagEditCell = textCheckCell2;
                    break;
                case 5:
                    tagEditCell = new ShadowSectionCell(this.mContext, null, 0);
                    break;
                case 6:
                    TextDetailCell textDetailCell = new TextDetailCell(23, this.mContext, null, false, false);
                    textDetailCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    view = textDetailCell;
                    tagEditCell = view;
                    break;
                case 7:
                    PollEditTextCell pollEditTextCell = ChatRightsEditActivity.this.rankEditTextCell = new PollEditTextCell(this.mContext, 0, null, null);
                    pollEditTextCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    pollEditTextCell.addTextWatcher(new TextWatcher() {
                        @Override
                        public void afterTextChanged(Editable editable) {
                            if (ListAdapter.this.ignoreTextChange) {
                                return;
                            }
                            ChatRightsEditActivity.this.currentRank = editable.toString();
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ChatRightsEditActivity.this.listView.findViewHolderForAdapterPosition(ChatRightsEditActivity.this.rankHeaderRow);
                            if (viewHolderFindViewHolderForAdapterPosition != null) {
                                ChatRightsEditActivity.this.setTextLeft(viewHolderFindViewHolderForAdapterPosition.itemView);
                            }
                        }

                        @Override
                        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                        }

                        @Override
                        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                        }
                    });
                    tagEditCell = pollEditTextCell;
                    break;
                case 8:
                    ChatRightsEditActivity.this.addBotButtonContainer = new FrameLayout(this.mContext);
                    FrameLayout frameLayout = ChatRightsEditActivity.this.addBotButtonContainer;
                    int i2 = Theme.key_windowBackgroundGray;
                    frameLayout.setBackgroundColor(Theme.getColor(null, i2, false));
                    ChatRightsEditActivity.this.addBotButton = new FrameLayout(this.mContext);
                    ChatRightsEditActivity.this.addBotButtonText = new AnimatedTextView(this.mContext, true, false, false);
                    ChatRightsEditActivity.this.addBotButtonText.setTypeface(AndroidUtilities.bold());
                    ChatRightsEditActivity.this.addBotButtonText.setTextColor(-1);
                    ChatRightsEditActivity.this.addBotButtonText.setTextSize(AndroidUtilities.dp(14.0f));
                    ChatRightsEditActivity.this.addBotButtonText.setGravity(17);
                    AnimatedTextView animatedTextView = ChatRightsEditActivity.this.addBotButtonText;
                    StringBuilder sb = new StringBuilder();
                    zzko.m(R.string.AddBotButton, " ", sb);
                    sb.append(LocaleController.getString(ChatRightsEditActivity.this.asAdmin ? R.string.AddBotButtonAsAdmin : R.string.AddBotButtonAsMember));
                    animatedTextView.setText(sb.toString());
                    ChatRightsEditActivity.this.addBotButton.addView(ChatRightsEditActivity.this.addBotButtonText, LayoutHelper.createFrame(-2, -2, 17));
                    ChatRightsEditActivity.this.addBotButton.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{4.0f}, Theme.key_featuredStickers_addButton));
                    ChatRightsEditActivity.this.addBotButton.setOnClickListener(new PollItemMenu$4$$ExternalSyntheticLambda0(this, 8));
                    ChatRightsEditActivity.this.addBotButtonContainer.addView(ChatRightsEditActivity.this.addBotButton, LayoutHelper.createFrame(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                    ChatRightsEditActivity.this.addBotButtonContainer.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    View view2 = new View(this.mContext);
                    view2.setBackgroundColor(Theme.getColor(null, i2, false));
                    ChatRightsEditActivity.this.addBotButtonContainer.setClipChildren(false);
                    ChatRightsEditActivity.this.addBotButtonContainer.setClipToPadding(false);
                    ChatRightsEditActivity.this.addBotButtonContainer.addView(view2, LayoutHelper.createFrame(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                    tagEditCell = ChatRightsEditActivity.this.addBotButtonContainer;
                    break;
                case 10:
                    CheckBoxCell checkBoxCell = new CheckBoxCell(this.mContext, 4, 21, false, ChatRightsEditActivity.this.getResourceProvider());
                    checkBoxCell.setPad(1);
                    checkBoxCell.getCheckBoxRound().setDrawBackgroundAsArc(14);
                    checkBoxCell.getCheckBoxRound().setColor(Theme.key_switch2TrackChecked, Theme.key_radioBackground, Theme.key_checkboxCheck);
                    checkBoxCell.setEnabled(true);
                    checkBoxCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    view = checkBoxCell;
                    tagEditCell = view;
                    break;
                case 11:
                    tagEditCell = new TagEditCell(this.mContext, ((BaseFragment) ChatRightsEditActivity.this).currentAccount, -ChatRightsEditActivity.this.chatId, ((BaseFragment) ChatRightsEditActivity.this).resourceProvider);
                    break;
            }
            return new RecyclerListView.Holder(tagEditCell);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getAdapterPosition() == ChatRightsEditActivity.this.rankHeaderRow) {
                ChatRightsEditActivity.this.setTextLeft(viewHolder.itemView);
            }
        }

        @Override
        public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getAdapterPosition() != ChatRightsEditActivity.this.rankRow || ChatRightsEditActivity.this.getParentActivity() == null) {
                return;
            }
            AndroidUtilities.hideKeyboard(ChatRightsEditActivity.this.getParentActivity().getCurrentFocus());
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
        this.closingKeyboardAfterFinish = false;
        this.isAddingNew = z2;
        this.chatId = j2;
        this.currentUser = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
        this.currentType = i;
        this.canEdit = z;
        boolean z4 = true;
        boolean z5 = !z;
        this.channelStoriesExpanded = z5;
        this.channelMessagesExpanded = z5;
        this.botHash = str2;
        this.currentChat = getMessagesController().getChat(Long.valueOf(this.chatId));
        this.chatInfo = getMessagesController().getChatFull(this.chatId);
        TLRPC.User user = this.currentUser;
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
            this.myAdminRights = emptyAdminRights(this.currentType != 2 || ((chat = this.currentChat) != null && chat.creator));
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
        updateRows(false);
    }

    public boolean allDefaultMediaBanned() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.defaultBannedRights;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    public boolean checkDiscard(boolean z) {
        int i = this.currentType;
        if (i != 2) {
            if (!(i == 1 ? this.currentBannedRights.equals(ChatObject.getBannedRightsString(this.bannedRights)) : this.initialRank.equals(this.currentRank))) {
                if (z) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                    builder.setTitle(LocaleController.getString(R.string.UserRestrictionsApplyChanges));
                    SendMessagesHelper$$ExternalSyntheticOutline0.m("UserRestrictionsApplyChangesText", R.string.UserRestrictionsApplyChangesText, new Object[]{MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chatId)).title}, builder);
                    builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new ChatRightsEditActivity$$ExternalSyntheticLambda5(this, 7));
                    builder.setNegativeButton(LocaleController.getString(R.string.PassportDiscard), new ChatRightsEditActivity$$ExternalSyntheticLambda5(this, 8));
                    showDialog(builder.create());
                }
                return false;
            }
        }
        return true;
    }

    private void checkGuardBotRow() {
        boolean z;
        TLRPC.User user;
        int i = this.guardBotRow;
        if (i >= 0) {
            TextCheckCell2 textCheckCell2 = (TextCheckCell2) this.linearLayoutManager.findViewByPosition(i);
            if (textCheckCell2 == null) {
                this.listViewAdapter.lambda$onBindViewHolder$31(this.guardBotRow);
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

    public int getChannelMessagesSelectedCount() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = this.adminRights;
        ?? r1 = tL_chatAdminRights.post_messages;
        int i = r1;
        if (tL_chatAdminRights.edit_messages) {
            i = r1 + 1;
        }
        return tL_chatAdminRights.delete_messages ? i + 1 : i;
    }

    public int getChannelStoriesSelectedCount() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = this.adminRights;
        ?? r1 = tL_chatAdminRights.post_stories;
        int i = r1;
        if (tL_chatAdminRights.edit_stories) {
            i = r1 + 1;
        }
        return tL_chatAdminRights.delete_stories ? i + 1 : i;
    }

    public int getSendMediaSelectedCount() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.bannedRights;
        int i = (tL_chatBannedRights.send_photos || this.defaultBannedRights.send_photos) ? 0 : 1;
        if (!tL_chatBannedRights.send_videos && !this.defaultBannedRights.send_videos) {
            i++;
        }
        if (!tL_chatBannedRights.send_stickers && !this.defaultBannedRights.send_stickers) {
            i++;
        }
        if (!tL_chatBannedRights.send_audios && !this.defaultBannedRights.send_audios) {
            i++;
        }
        if (!tL_chatBannedRights.send_docs && !this.defaultBannedRights.send_docs) {
            i++;
        }
        if (!tL_chatBannedRights.send_voices && !this.defaultBannedRights.send_voices) {
            i++;
        }
        if (!tL_chatBannedRights.send_roundvideos && !this.defaultBannedRights.send_roundvideos) {
            i++;
        }
        if (!tL_chatBannedRights.embed_links) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.defaultBannedRights;
            if (!tL_chatBannedRights2.embed_links && !tL_chatBannedRights.send_plain && !tL_chatBannedRights2.send_plain) {
                i++;
            }
        }
        if (!tL_chatBannedRights.send_polls && !this.defaultBannedRights.send_polls) {
            i++;
        }
        return (tL_chatBannedRights.send_reactions || this.defaultBannedRights.send_reactions) ? i : i + 1;
    }

    private boolean hasAllAdminRights() {
        if (this.isChannel) {
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.adminRights;
            return tL_chatAdminRights.change_info && tL_chatAdminRights.post_messages && tL_chatAdminRights.edit_messages && tL_chatAdminRights.delete_messages && tL_chatAdminRights.invite_users && tL_chatAdminRights.add_admins && tL_chatAdminRights.manage_call && tL_chatAdminRights.post_stories && tL_chatAdminRights.edit_stories && tL_chatAdminRights.delete_stories && tL_chatAdminRights.manage_direct_messages && tL_chatAdminRights.manage_welcome_messages;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = this.adminRights;
        return tL_chatAdminRights2.change_info && tL_chatAdminRights2.delete_messages && tL_chatAdminRights2.ban_users && tL_chatAdminRights2.invite_users && tL_chatAdminRights2.pin_messages && tL_chatAdminRights2.manage_ranks && tL_chatAdminRights2.add_admins && tL_chatAdminRights2.manage_call && (!this.isForum || tL_chatAdminRights2.manage_topics) && tL_chatAdminRights2.manage_welcome_messages;
    }

    public void lambda$initTransfer$14(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getParentActivity() == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.currentChat)) {
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getParentActivity(), this.chatId, this, new WearAuthSheet$$ExternalSyntheticLambda5(this, inputCheckPasswordSRP, twoStepVerificationActivity, 20));
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
        tL_channels_editCreator.password = inputCheckPasswordSRP != null ? inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = getMessagesController().getInputUser(this.currentUser);
        getConnectionsManager().sendRequest(tL_channels_editCreator, new LoginActivity$$ExternalSyntheticLambda27(5, this, inputCheckPasswordSRP, twoStepVerificationActivity, tL_channels_editCreator));
    }

    private boolean isDefaultAdminRights() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = this.adminRights;
        boolean z = tL_chatAdminRights.change_info;
        if (z && tL_chatAdminRights.delete_messages && tL_chatAdminRights.ban_users && tL_chatAdminRights.invite_users && tL_chatAdminRights.pin_messages && tL_chatAdminRights.manage_ranks && ((!this.isForum || tL_chatAdminRights.manage_topics) && tL_chatAdminRights.manage_call && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous)) {
            return true;
        }
        if (z || tL_chatAdminRights.delete_messages || tL_chatAdminRights.ban_users || tL_chatAdminRights.invite_users || tL_chatAdminRights.pin_messages || tL_chatAdminRights.manage_ranks) {
            return false;
        }
        return ((this.isForum && tL_chatAdminRights.manage_topics) || tL_chatAdminRights.manage_call || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous) ? false : true;
    }

    public boolean isExpandableSendMediaRow(int i) {
        return i == this.sendStickersRow || i == this.embedLinksRow || i == this.sendPollsRow || i == this.sendPhotosRow || i == this.sendVideosRow || i == this.sendFilesRow || i == this.sendMusicRow || i == this.sendRoundRow || i == this.sendVoiceRow || i == this.sendReactionsRow || i == this.channelPostMessagesRow || i == this.channelEditMessagesRow || i == this.channelDeleteMessagesRow || i == this.channelPostStoriesRow || i == this.channelEditStoriesRow || i == this.channelDeleteStoriesRow;
    }

    public void lambda$checkDiscard$30(AlertDialog alertDialog, int i) {
        onDonePressed();
    }

    public void lambda$checkDiscard$31(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$createView$0(int i, TimePicker timePicker, int i2, int i3) {
        this.bannedRights.until_date = (i3 * 60) + (i2 * 3600) + i;
        this.listViewAdapter.lambda$onBindViewHolder$31(this.untilDateRow);
    }

    public static void lambda$createView$1(DialogInterface dialogInterface, int i) {
    }

    public void lambda$createView$2(DatePicker datePicker, int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(i, i2, i3);
        final int time = (int) (calendar.getTime().getTime() / 1000);
        try {
            TimePickerDialog timePickerDialog = new TimePickerDialog(getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                @Override
                public final void onTimeSet(TimePicker timePicker, int i4, int i5) {
                    this.f$0.lambda$createView$0(time, timePicker, i4, i5);
                }
            }, 0, 0, true);
            timePickerDialog.setButton(-1, LocaleController.getString(R.string.Set), timePickerDialog);
            timePickerDialog.setButton(-2, LocaleController.getString(R.string.Cancel), new ChatRightsEditActivity$$ExternalSyntheticLambda11(0));
            showDialog(timePickerDialog);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$createView$3(DialogInterface dialogInterface, int i) {
    }

    public static void lambda$createView$4(DatePicker datePicker, DialogInterface dialogInterface) {
        int childCount = datePicker.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = datePicker.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.width = -1;
            childAt.setLayoutParams(layoutParams);
        }
    }

    public void lambda$createView$5(BottomSheet.Builder builder, View view) {
        int iIntValue = ((Integer) view.getTag()).intValue();
        if (iIntValue == 0) {
            this.bannedRights.until_date = 0;
            this.listViewAdapter.lambda$onBindViewHolder$31(this.untilDateRow);
        } else if (iIntValue == 1) {
            this.bannedRights.until_date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 86400;
            this.listViewAdapter.lambda$onBindViewHolder$31(this.untilDateRow);
        } else if (iIntValue == 2) {
            this.bannedRights.until_date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 604800;
            this.listViewAdapter.lambda$onBindViewHolder$31(this.untilDateRow);
        } else if (iIntValue == 3) {
            this.bannedRights.until_date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 2592000;
            this.listViewAdapter.lambda$onBindViewHolder$31(this.untilDateRow);
        } else if (iIntValue == 4) {
            Calendar calendar = Calendar.getInstance();
            try {
                DatePickerDialog datePickerDialog = new DatePickerDialog(getParentActivity(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                        this.f$0.lambda$createView$2(datePicker, i, i2, i3);
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
                datePickerDialog.setButton(-2, LocaleController.getString(R.string.Cancel), new ChatRightsEditActivity$$ExternalSyntheticLambda11(1));
                datePickerDialog.setOnShowListener(new ChatRightsEditActivity$$ExternalSyntheticLambda16(datePicker, 0));
                showDialog(datePickerDialog);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        builder.bottomSheet.dismissRunnable.run();
    }

    public void lambda$createView$6(long j) {
        this.guardBotIdToSet = j;
        this.hasGuardBotToSet = true;
        checkGuardBotRow();
    }

    public void lambda$createView$7(long j) {
        TLRPC.ChatFull chatFull = this.chatInfo;
        long j2 = chatFull != null ? chatFull.guard_bot_id : 0L;
        TLRPC.User user = j2 != 0 ? getMessagesController().getUser(Long.valueOf(j2)) : null;
        if (user != null && j != 0 && user.id != j) {
            GuardBotReplaceSheet.show(getContext(), this.resourceProvider, this.currentAccount, user, this.currentUser, new ChatRightsEditActivity$$ExternalSyntheticLambda1(this, j, 0));
            return;
        }
        this.guardBotIdToSet = j;
        this.hasGuardBotToSet = true;
        checkGuardBotRow();
    }

    public void lambda$createView$8(Context context, View view, int i) {
        int i2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights3;
        boolean z;
        boolean z2;
        View viewFindViewByPosition;
        String string;
        boolean z3 = false;
        int i3 = 1;
        if (this.canEdit || (this.currentChat.creator && this.currentType == 0 && i == this.anonymousRow)) {
            if (i == this.sendMediaRow) {
                if (!(view instanceof TextCheckCell2) || ((TextCheckCell2) view).isEnabled()) {
                    this.sendMediaExpanded = !this.sendMediaExpanded;
                    updateRows(false);
                    this.listViewAdapter.lambda$onBindViewHolder$31(this.sendMediaRow);
                    if (this.sendMediaExpanded) {
                        this.listViewAdapter.notifyItemRangeInserted(this.sendMediaRow + 1, 10);
                        return;
                    } else {
                        this.listViewAdapter.notifyItemRangeRemoved(this.sendMediaRow + 1, 10);
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
                    updateRows(false);
                    this.listViewAdapter.lambda$onBindViewHolder$31(this.channelMessagesRow);
                    if (this.channelMessagesExpanded) {
                        this.listViewAdapter.notifyItemRangeInserted(this.channelMessagesRow + 1, 3);
                        return;
                    } else {
                        this.listViewAdapter.notifyItemRangeRemoved(this.channelMessagesRow + 1, 3);
                        return;
                    }
                }
                return;
            }
            int i6 = this.channelStoriesRow;
            if (i == i6) {
                if (!(view instanceof TextCheckCell2) || ((TextCheckCell2) view).isEnabled()) {
                    this.channelStoriesExpanded = !this.channelStoriesExpanded;
                    updateRows(false);
                    this.listViewAdapter.lambda$onBindViewHolder$31(this.channelStoriesRow);
                    if (this.channelStoriesExpanded) {
                        this.listViewAdapter.notifyItemRangeInserted(this.channelStoriesRow + 1, 3);
                        return;
                    } else {
                        this.listViewAdapter.notifyItemRangeRemoved(this.channelStoriesRow + 1, 3);
                        return;
                    }
                }
                return;
            }
            if (i == 0) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.currentUser.id);
                presentFragment(new ProfileActivity(bundle));
                return;
            }
            if (i == this.removeAdminRow) {
                int i7 = this.currentType;
                if (i7 == 0) {
                    MessagesController.getInstance(this.currentAccount).setUserAdminRole(this.chatId, this.currentUser, new TLRPC.TL_chatAdminRights(), this.currentRank, this.isChannel, getFragmentForAlert(0), this.isAddingNew, false, null, null);
                    ChatRightsEditActivityDelegate chatRightsEditActivityDelegate = this.delegate;
                    if (chatRightsEditActivityDelegate != null) {
                        chatRightsEditActivityDelegate.didSetRights(0, this.adminRights, this.bannedRights, this.currentRank);
                    }
                    finishFragment();
                    return;
                }
                if (i7 == 1) {
                    this.banning = true;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = new TLRPC.TL_chatBannedRights();
                    this.bannedRights = tL_chatBannedRights4;
                    tL_chatBannedRights4.view_messages = true;
                    tL_chatBannedRights4.send_media = true;
                    tL_chatBannedRights4.send_messages = true;
                    tL_chatBannedRights4.send_stickers = true;
                    tL_chatBannedRights4.send_gifs = true;
                    tL_chatBannedRights4.send_games = true;
                    tL_chatBannedRights4.send_inline = true;
                    tL_chatBannedRights4.embed_links = true;
                    tL_chatBannedRights4.pin_messages = true;
                    tL_chatBannedRights4.edit_rank = true;
                    tL_chatBannedRights4.send_reactions = true;
                    tL_chatBannedRights4.send_polls = true;
                    tL_chatBannedRights4.invite_users = true;
                    tL_chatBannedRights4.change_info = true;
                    tL_chatBannedRights4.manage_topics = true;
                    tL_chatBannedRights4.until_date = 0;
                    onDonePressed();
                    return;
                }
                return;
            }
            if (i == this.transferOwnerRow) {
                lambda$initTransfer$14(null, null);
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
                    bottomSheetCellArr[i9].setOnClickListener(new ArticleViewer$$ExternalSyntheticLambda53(22, this, builder));
                    i9++;
                    i8 = 5;
                    i5 = 3;
                }
                bottomSheet.customView = linearLayout;
                showDialog(bottomSheet);
                return;
            }
            if (view instanceof CheckBoxCell) {
                CheckBoxCell checkBoxCell = (CheckBoxCell) view;
                int i10 = this.channelPostMessagesRow;
                if (i == i10 || i == this.channelEditMessagesRow || i == this.channelDeleteMessagesRow) {
                    if (i == i10) {
                        TLRPC.TL_chatAdminRights tL_chatAdminRights = this.adminRights;
                        z = !tL_chatAdminRights.post_messages;
                        tL_chatAdminRights.post_messages = z;
                    } else if (i == this.channelEditMessagesRow) {
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = this.adminRights;
                        z = !tL_chatAdminRights2.edit_messages;
                        tL_chatAdminRights2.edit_messages = z;
                    } else {
                        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = this.adminRights;
                        z = !tL_chatAdminRights3.delete_messages;
                        tL_chatAdminRights3.delete_messages = z;
                    }
                    this.listViewAdapter.lambda$onBindViewHolder$31(i4);
                    checkBoxCell.setChecked(z, true);
                    return;
                }
                int i11 = this.channelPostStoriesRow;
                if (i == i11 || i == this.channelEditStoriesRow || i == this.channelDeleteStoriesRow) {
                    if (i == i11) {
                        TLRPC.TL_chatAdminRights tL_chatAdminRights4 = this.adminRights;
                        z2 = !tL_chatAdminRights4.post_stories;
                        tL_chatAdminRights4.post_stories = z2;
                    } else if (i == this.channelEditStoriesRow) {
                        TLRPC.TL_chatAdminRights tL_chatAdminRights5 = this.adminRights;
                        z2 = !tL_chatAdminRights5.edit_stories;
                        tL_chatAdminRights5.edit_stories = z2;
                    } else {
                        TLRPC.TL_chatAdminRights tL_chatAdminRights6 = this.adminRights;
                        z2 = !tL_chatAdminRights6.delete_stories;
                        tL_chatAdminRights6.delete_stories = z2;
                    }
                    this.listViewAdapter.lambda$onBindViewHolder$31(i6);
                    checkBoxCell.setChecked(z2, true);
                    return;
                }
                if (this.currentType != 1 || this.bannedRights == null) {
                    return;
                }
                checkBoxCell.isChecked();
                if (checkBoxCell.checkBoxRound.hasIcon()) {
                    if (this.currentType != 2) {
                        new AlertDialog.Builder(getParentActivity(), 0, null).setTitle(LocaleController.getString(R.string.UserRestrictionsCantModify)).setMessage(LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled)).setPositiveButton(LocaleController.getString(R.string.OK), null).create().show();
                        return;
                    }
                    return;
                }
                if (i == this.sendPhotosRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.bannedRights;
                    z3 = !tL_chatBannedRights5.send_photos;
                    tL_chatBannedRights5.send_photos = z3;
                } else if (i == this.sendVideosRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights6 = this.bannedRights;
                    z3 = !tL_chatBannedRights6.send_videos;
                    tL_chatBannedRights6.send_videos = z3;
                } else if (i == this.sendMusicRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights7 = this.bannedRights;
                    z3 = !tL_chatBannedRights7.send_audios;
                    tL_chatBannedRights7.send_audios = z3;
                } else if (i == this.sendReactionsRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights8 = this.bannedRights;
                    z3 = !tL_chatBannedRights8.send_reactions;
                    tL_chatBannedRights8.send_reactions = z3;
                } else if (i == this.sendFilesRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights9 = this.bannedRights;
                    z3 = !tL_chatBannedRights9.send_docs;
                    tL_chatBannedRights9.send_docs = z3;
                } else if (i == this.sendRoundRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights10 = this.bannedRights;
                    z3 = !tL_chatBannedRights10.send_roundvideos;
                    tL_chatBannedRights10.send_roundvideos = z3;
                } else if (i == this.sendVoiceRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights11 = this.bannedRights;
                    z3 = !tL_chatBannedRights11.send_voices;
                    tL_chatBannedRights11.send_voices = z3;
                } else if (i == this.sendStickersRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights12 = this.bannedRights;
                    z3 = !tL_chatBannedRights12.send_stickers;
                    tL_chatBannedRights12.send_inline = z3;
                    tL_chatBannedRights12.send_gifs = z3;
                    tL_chatBannedRights12.send_games = z3;
                    tL_chatBannedRights12.send_stickers = z3;
                } else if (i == this.embedLinksRow) {
                    if ((this.bannedRights.send_plain || this.defaultBannedRights.send_plain) && (viewFindViewByPosition = this.linearLayoutManager.findViewByPosition(this.sendMessagesRow)) != null) {
                        AndroidUtilities.shakeViewSpring(viewFindViewByPosition);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        return;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights13 = this.bannedRights;
                        z3 = !tL_chatBannedRights13.embed_links;
                        tL_chatBannedRights13.embed_links = z3;
                    }
                } else if (i == this.sendPollsRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights14 = this.bannedRights;
                    z3 = !tL_chatBannedRights14.send_polls;
                    tL_chatBannedRights14.send_polls = z3;
                }
                this.listViewAdapter.lambda$onBindViewHolder$31(this.sendMediaRow);
                checkBoxCell.setChecked(!z3, true);
                return;
            }
            if (view instanceof TextCheckCell2) {
                TextCheckCell2 textCheckCell2 = (TextCheckCell2) view;
                if (textCheckCell2.checkBox.hasIcon()) {
                    if (this.currentType != 2) {
                        new AlertDialog.Builder(getParentActivity(), 0, null).setTitle(LocaleController.getString(R.string.UserRestrictionsCantModify)).setMessage(LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled)).setPositiveButton(LocaleController.getString(R.string.OK), null).create().show();
                        return;
                    }
                    return;
                }
                if (!textCheckCell2.isEnabled()) {
                    int i12 = this.currentType;
                    if (i12 == 2 || i12 == 0) {
                        if ((i != this.changeInfoRow || (tL_chatBannedRights3 = this.defaultBannedRights) == null || tL_chatBannedRights3.change_info) && ((i != this.pinMessagesRow || (tL_chatBannedRights2 = this.defaultBannedRights) == null || tL_chatBannedRights2.pin_messages) && (i != this.editTagsRow || (tL_chatBannedRights = this.defaultBannedRights) == null || tL_chatBannedRights.edit_rank))) {
                            return;
                        }
                        new AlertDialog.Builder(getParentActivity(), 0, null).setTitle(LocaleController.getString(R.string.UserRestrictionsCantModify)).setMessage(LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled)).setPositiveButton(LocaleController.getString(R.string.OK), null).create().show();
                        return;
                    }
                    return;
                }
                int i13 = this.currentType;
                Switch r2 = textCheckCell2.checkBox;
                if (i13 != 2 && i != this.guardBotRow) {
                    textCheckCell2.setChecked(!r2.isChecked());
                }
                boolean zIsChecked = r2.isChecked();
                if (i == this.manageRow) {
                    zIsChecked = !this.asAdmin;
                    this.asAdmin = zIsChecked;
                    updateAsAdmin(true);
                } else if (i == this.changeInfoRow) {
                    int i14 = this.currentType;
                    if (i14 == 0 || i14 == 2) {
                        TLRPC.TL_chatAdminRights tL_chatAdminRights7 = this.adminRights;
                        zIsChecked = !tL_chatAdminRights7.change_info;
                        tL_chatAdminRights7.change_info = zIsChecked;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights15 = this.bannedRights;
                        zIsChecked = !tL_chatBannedRights15.change_info;
                        tL_chatBannedRights15.change_info = zIsChecked;
                    }
                } else if (i == this.postMessagesRow) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights8 = this.adminRights;
                    zIsChecked = !tL_chatAdminRights8.post_messages;
                    tL_chatAdminRights8.post_messages = zIsChecked;
                } else if (i == this.guardBotRow) {
                    String shortName = DialogObject.getShortName(this.currentUser);
                    String string2 = LocaleController.getString(R.string.ApproveNewMembersTitle);
                    String string3 = LocaleController.getString(!zIsChecked ? R.string.ApproveNewMembersEnable : R.string.ApproveNewMembersDisable);
                    if (zIsChecked) {
                        i2 = this.isChannel ? R.string.ApproveNewMembersDisabledMessageChannel : R.string.ApproveNewMembersDisabledMessageGroup;
                    } else {
                        i2 = this.isChannel ? R.string.ApproveNewMembersMessageChannel : R.string.ApproveNewMembersMessageGroup;
                    }
                    AlertsCreator.showSimpleConfirmAlert(this, string2, AndroidUtilities.replaceTags(LocaleController.formatString(i2, shortName)), string3, false, new ChatRightsEditActivity$$ExternalSyntheticLambda1(this, !zIsChecked ? this.currentUser.id : 0L, i3));
                } else if (i == this.manageWelcomeRow) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights9 = this.adminRights;
                    zIsChecked = !tL_chatAdminRights9.manage_welcome_messages;
                    tL_chatAdminRights9.manage_welcome_messages = zIsChecked;
                } else if (i == this.manageDirectRow) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights10 = this.adminRights;
                    zIsChecked = !tL_chatAdminRights10.manage_direct_messages;
                    tL_chatAdminRights10.manage_direct_messages = zIsChecked;
                } else if (i == this.editMesagesRow) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights11 = this.adminRights;
                    zIsChecked = !tL_chatAdminRights11.edit_messages;
                    tL_chatAdminRights11.edit_messages = zIsChecked;
                } else if (i == this.deleteMessagesRow) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights12 = this.adminRights;
                    zIsChecked = !tL_chatAdminRights12.delete_messages;
                    tL_chatAdminRights12.delete_messages = zIsChecked;
                } else if (i == this.addAdminsRow) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights13 = this.adminRights;
                    zIsChecked = !tL_chatAdminRights13.add_admins;
                    tL_chatAdminRights13.add_admins = zIsChecked;
                } else if (i == this.anonymousRow) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights14 = this.adminRights;
                    zIsChecked = !tL_chatAdminRights14.anonymous;
                    tL_chatAdminRights14.anonymous = zIsChecked;
                } else if (i == this.banUsersRow) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights15 = this.adminRights;
                    zIsChecked = !tL_chatAdminRights15.ban_users;
                    tL_chatAdminRights15.ban_users = zIsChecked;
                } else if (i == this.startVoiceChatRow) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights16 = this.adminRights;
                    zIsChecked = !tL_chatAdminRights16.manage_call;
                    tL_chatAdminRights16.manage_call = zIsChecked;
                } else if (i == this.manageTopicsRow) {
                    int i15 = this.currentType;
                    if (i15 == 0 || i15 == 2) {
                        TLRPC.TL_chatAdminRights tL_chatAdminRights17 = this.adminRights;
                        zIsChecked = !tL_chatAdminRights17.manage_topics;
                        tL_chatAdminRights17.manage_topics = zIsChecked;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights16 = this.bannedRights;
                        zIsChecked = !tL_chatBannedRights16.manage_topics;
                        tL_chatBannedRights16.manage_topics = zIsChecked;
                    }
                } else if (i == this.manageLinkedPeersRow) {
                    int i16 = this.currentType;
                    if (i16 == 0 || i16 == 2) {
                        TLRPC.TL_chatAdminRights tL_chatAdminRights18 = this.adminRights;
                        zIsChecked = !tL_chatAdminRights18.manage_linked_peers;
                        tL_chatAdminRights18.manage_linked_peers = zIsChecked;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights17 = this.bannedRights;
                        zIsChecked = !tL_chatBannedRights17.manage_linked_peers;
                        tL_chatBannedRights17.manage_linked_peers = zIsChecked;
                    }
                } else if (i == this.addUsersRow) {
                    int i17 = this.currentType;
                    if (i17 == 0 || i17 == 2) {
                        TLRPC.TL_chatAdminRights tL_chatAdminRights19 = this.adminRights;
                        zIsChecked = !tL_chatAdminRights19.invite_users;
                        tL_chatAdminRights19.invite_users = zIsChecked;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights18 = this.bannedRights;
                        zIsChecked = !tL_chatBannedRights18.invite_users;
                        tL_chatBannedRights18.invite_users = zIsChecked;
                    }
                } else if (i == this.pinMessagesRow) {
                    int i18 = this.currentType;
                    if (i18 == 0 || i18 == 2) {
                        TLRPC.TL_chatAdminRights tL_chatAdminRights20 = this.adminRights;
                        zIsChecked = !tL_chatAdminRights20.pin_messages;
                        tL_chatAdminRights20.pin_messages = zIsChecked;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights19 = this.bannedRights;
                        zIsChecked = !tL_chatBannedRights19.pin_messages;
                        tL_chatBannedRights19.pin_messages = zIsChecked;
                    }
                } else if (i == this.editTagsRow) {
                    int i19 = this.currentType;
                    if (i19 == 0 || i19 == 2) {
                        TLRPC.TL_chatAdminRights tL_chatAdminRights21 = this.adminRights;
                        zIsChecked = !tL_chatAdminRights21.manage_ranks;
                        tL_chatAdminRights21.manage_ranks = zIsChecked;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights20 = this.bannedRights;
                        zIsChecked = !tL_chatBannedRights20.edit_rank;
                        tL_chatBannedRights20.edit_rank = zIsChecked;
                    }
                } else if (this.currentType == 1 && this.bannedRights != null) {
                    boolean zIsChecked2 = r2.isChecked();
                    if (i == this.sendMessagesRow) {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights21 = this.bannedRights;
                        zIsChecked = !tL_chatBannedRights21.send_plain;
                        tL_chatBannedRights21.send_plain = zIsChecked;
                    }
                    if (zIsChecked2) {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights22 = this.bannedRights;
                        if ((!tL_chatBannedRights22.send_plain || !tL_chatBannedRights22.embed_links || !tL_chatBannedRights22.send_inline || !tL_chatBannedRights22.send_photos || !tL_chatBannedRights22.send_videos || !tL_chatBannedRights22.send_audios || !tL_chatBannedRights22.send_docs || !tL_chatBannedRights22.send_voices || !tL_chatBannedRights22.send_roundvideos || !tL_chatBannedRights22.send_polls || !tL_chatBannedRights22.send_reactions) && tL_chatBannedRights22.view_messages) {
                            tL_chatBannedRights22.view_messages = false;
                        }
                    }
                    int i20 = this.embedLinksRow;
                    if (i20 >= 0) {
                        this.listViewAdapter.lambda$onBindViewHolder$31(i20);
                    }
                    int i21 = this.sendMediaRow;
                    if (i21 >= 0) {
                        this.listViewAdapter.lambda$onBindViewHolder$31(i21);
                    }
                }
                if (this.currentType == 2) {
                    if (this.asAdmin && zIsChecked) {
                        z3 = true;
                    }
                    textCheckCell2.setChecked(z3);
                }
                updateRows(true);
            }
        }
    }

    public void lambda$getThemeDescriptions$33() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof UserCell2) {
                    ((UserCell2) childAt).update();
                }
            }
        }
    }

    public void lambda$initTransfer$13(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j) {
        if (j != 0) {
            this.chatId = j;
            this.currentChat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
            lambda$initTransfer$14(inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public void lambda$initTransfer$15(AlertDialog alertDialog, int i) {
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        twoStepVerificationActivity.setDelegate(0, new DialogsActivity$$ExternalSyntheticLambda6(3, this, twoStepVerificationActivity));
        presentFragment(twoStepVerificationActivity);
    }

    public void lambda$initTransfer$16(AlertDialog alertDialog, int i) {
        presentFragment(new TwoStepVerificationSetupActivity(6, null));
    }

    public void lambda$initTransfer$17(TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.setCurrentPasswordInfo(null, password);
            TwoStepVerificationActivity.initPasswordNewAlgo(password);
            lambda$initTransfer$14(twoStepVerificationActivity.getNewSrpPassword(), twoStepVerificationActivity);
        }
    }

    public void lambda$initTransfer$18(TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda5(24, this, tL_error, tLObject, twoStepVerificationActivity));
    }

    public void lambda$initTransfer$19(TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i = 1;
        if (tL_error == null) {
            if (inputCheckPasswordSRP != null) {
                this.delegate.didChangeOwner(this.currentUser);
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
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            if (inputCheckPasswordSRP == null) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                if (this.isChannel) {
                    builder.setTitle(LocaleController.getString(R.string.EditAdminChannelTransfer));
                } else {
                    builder.setTitle(LocaleController.getString(R.string.EditAdminGroupTransfer));
                }
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText, this.currentChat.title, UserObject.getFirstName(this.currentUser))));
                builder.setPositiveButton(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new ChatRightsEditActivity$$ExternalSyntheticLambda5(this, i));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                showDialog(builder.create());
                return;
            }
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new IntroActivity$$ExternalSyntheticLambda6(24, this, twoStepVerificationActivity), 8);
                return;
            }
            if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.needHideProgress();
                    twoStepVerificationActivity.finishFragment();
                }
                AlertsCreator.showAddUserAlert(tL_error, this, this.isChannel, this.isCommunity, tL_channels_editCreator);
                return;
            }
            if (getParentActivity() == null || AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium()) {
                presentFragment(new TooManyCommunitiesActivity(1));
                return;
            } else {
                showDialog(new LimitReachedBottomSheet(5, this, getParentActivity(), this.currentAccount, null));
                return;
            }
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.needHideProgress();
        }
        AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder2.setTitle(LocaleController.getString(R.string.EditAdminTransferAlertTitle));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        builder2.setView(linearLayout);
        TextView textView = new TextView(getParentActivity());
        int i2 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(null, i2, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (this.isChannel) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("EditChannelAdminTransferAlertText", R.string.EditChannelAdminTransferAlertText, UserObject.getFirstName(this.currentUser))));
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferAlertText", R.string.EditAdminTransferAlertText, UserObject.getFirstName(this.currentUser))));
        }
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(getParentActivity());
        int i3 = R.drawable.list_circle;
        imageView.setImageResource(i3);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int color = Theme.getColor(null, i2, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
        TextView textView2 = new TextView(getParentActivity());
        textView2.setTextColor(Theme.getColor(null, i2, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
            linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2));
            linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(getParentActivity());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(getParentActivity());
        imageView2.setImageResource(i3);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i2, false), mode));
        TextView textView3 = new TextView(getParentActivity());
        textView3.setTextColor(Theme.getColor(null, i2, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
            linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2, 5));
        } else {
            linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2));
            linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            builder2.setPositiveButton(LocaleController.getString(R.string.EditAdminTransferSetPassword), new ChatRightsEditActivity$$ExternalSyntheticLambda5(this, 2));
            builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        } else {
            TextView textView4 = new TextView(getParentActivity());
            textView4.setTextColor(Theme.getColor(null, i2, false));
            textView4.setTextSize(1, 16.0f);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
            builder2.setNegativeButton(LocaleController.getString(R.string.OK), null);
        }
        showDialog(builder2.create());
    }

    public void lambda$initTransfer$20(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda22(this, tL_error, inputCheckPasswordSRP, twoStepVerificationActivity, tL_channels_editCreator, 14));
    }

    public void lambda$onDonePressed$21(long j) {
        if (j != 0) {
            this.chatId = j;
            this.currentChat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
            onDonePressed();
        }
    }

    public void lambda$onDonePressed$22() {
        onDonePressed(false);
    }

    public void lambda$onDonePressed$23() {
        if (this.hasGuardBotToSet) {
            setGuardBotImpl(this.guardBotIdToSet);
        }
        ChatRightsEditActivityDelegate chatRightsEditActivityDelegate = this.delegate;
        if (chatRightsEditActivityDelegate != null) {
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.adminRights;
            chatRightsEditActivityDelegate.didSetRights((tL_chatAdminRights.change_info || tL_chatAdminRights.post_messages || tL_chatAdminRights.manage_direct_messages || tL_chatAdminRights.manage_welcome_messages || tL_chatAdminRights.edit_messages || tL_chatAdminRights.delete_messages || tL_chatAdminRights.ban_users || tL_chatAdminRights.invite_users || (this.isForum && tL_chatAdminRights.manage_topics) || tL_chatAdminRights.pin_messages || tL_chatAdminRights.manage_ranks || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous || tL_chatAdminRights.manage_call || ((this.isChannel && (tL_chatAdminRights.post_stories || tL_chatAdminRights.edit_stories || tL_chatAdminRights.delete_stories)) || tL_chatAdminRights.other)) ? 1 : 0, tL_chatAdminRights, this.bannedRights, this.currentRank);
            finishFragment();
        }
    }

    public boolean lambda$onDonePressed$24(TLRPC.TL_error tL_error) {
        setLoading(false);
        if (tL_error == null || !"USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            return true;
        }
        if (ChatObject.isChannel(this.currentChat)) {
            return false;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(11, this, getParentActivity(), this.currentAccount, getResourceProvider());
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        arrayList.add(this.currentUser);
        limitReachedBottomSheet.setRestrictedUsers(this.currentChat, arrayList, null, null, null);
        limitReachedBottomSheet.show();
        return false;
    }

    public void lambda$onDonePressed$25() {
        ChatRightsEditActivityDelegate chatRightsEditActivityDelegate = this.delegate;
        if (chatRightsEditActivityDelegate != null) {
            chatRightsEditActivityDelegate.didSetRights(0, this.asAdmin ? this.adminRights : null, null, this.currentRank);
        }
        this.closingKeyboardAfterFinish = true;
        Bundle bundleM = CallLogActivity$$ExternalSyntheticOutline0.m("scrollToTopOnResume", true);
        bundleM.putLong("chat_id", this.currentChat.id);
        if (!getMessagesController().checkCanOpenChat(bundleM, this)) {
            setLoading(false);
            return;
        }
        ChatActivity chatActivity = new ChatActivity(bundleM);
        presentFragment(chatActivity, true);
        if (BulletinFactory.canShowBulletin(chatActivity)) {
            boolean z = this.isAddingNew;
            if (z && this.asAdmin) {
                BulletinFactory.createAddedAsAdminBulletin(chatActivity, this.currentUser.first_name).show();
            } else {
                if (z || this.initialAsAdmin || !this.asAdmin) {
                    return;
                }
                BulletinFactory.createPromoteToAdminBulletin(chatActivity, this.currentUser.first_name).show();
            }
        }
    }

    public boolean lambda$onDonePressed$26(TLRPC.TL_error tL_error) {
        setLoading(false);
        return true;
    }

    public boolean lambda$onDonePressed$27(TLRPC.TL_error tL_error) {
        setLoading(false);
        return true;
    }

    public void lambda$onDonePressed$28(AlertDialog alertDialog, int i) {
        setLoading(true);
        ChatRightsEditActivity$$ExternalSyntheticLambda4 chatRightsEditActivity$$ExternalSyntheticLambda4 = new ChatRightsEditActivity$$ExternalSyntheticLambda4(this, 0);
        if (this.asAdmin || this.initialAsAdmin) {
            getMessagesController().setUserAdminRole(this.currentChat.id, this.currentUser, this.asAdmin ? this.adminRights : emptyAdminRights(false), this.currentRank, false, this, this.isAddingNew, this.asAdmin, this.botHash, chatRightsEditActivity$$ExternalSyntheticLambda4, new ChatRightsEditActivity$$ExternalSyntheticLambda5(this, 6));
        } else {
            getMessagesController().addUserToChat(this.currentChat.id, this.currentUser, 0, this.botHash, this, true, chatRightsEditActivity$$ExternalSyntheticLambda4, new ChatRightsEditActivity$$ExternalSyntheticLambda5(this, 0));
        }
    }

    public static void lambda$setGuardBotImpl$10(AlertDialog[] alertDialogArr) {
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda29(alertDialogArr, 2));
    }

    public static void lambda$setGuardBotImpl$11(AlertDialog[] alertDialogArr) {
        alertDialogArr[0].dismiss();
    }

    public static void lambda$setGuardBotImpl$12(AlertDialog[] alertDialogArr) {
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda29(alertDialogArr, 3));
    }

    public static void lambda$setGuardBotImpl$9(AlertDialog[] alertDialogArr) {
        alertDialogArr[0].dismiss();
    }

    public void lambda$setLoading$29(ValueAnimator valueAnimator) {
        this.doneDrawable.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.doneDrawable.invalidateSelf();
    }

    public void lambda$updateAsAdmin$32(ValueAnimator valueAnimator) {
        this.asAdminT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        FrameLayout frameLayout = this.addBotButton;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    public void onDonePressed() {
        onDonePressed(true);
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

    public void setChannelMessagesEnabled(boolean z) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = this.adminRights;
        boolean z2 = !z;
        tL_chatAdminRights.post_messages = z2;
        tL_chatAdminRights.edit_messages = z2;
        tL_chatAdminRights.delete_messages = z2;
        AndroidUtilities.updateVisibleRows(this.listView);
    }

    public void setChannelStoriesEnabled(boolean z) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = this.adminRights;
        boolean z2 = !z;
        tL_chatAdminRights.post_stories = z2;
        tL_chatAdminRights.edit_stories = z2;
        tL_chatAdminRights.delete_stories = z2;
        AndroidUtilities.updateVisibleRows(this.listView);
    }

    private void setGuardBotImpl(long j) {
        AlertDialog[] alertDialogArr = {new AlertDialog(getContext(), 3, null)};
        getMessagesController().toggleChatJoinRequest(this.chatId, j, true, false, true, new ChatActivity$$ExternalSyntheticLambda29(alertDialogArr, 4), new ChatActivity$$ExternalSyntheticLambda29(alertDialogArr, 5));
        alertDialogArr[0].showDelayed(300L);
    }

    public void setSendMediaEnabled(boolean z) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.bannedRights;
        boolean z2 = !z;
        tL_chatBannedRights.send_media = z2;
        tL_chatBannedRights.send_photos = z2;
        tL_chatBannedRights.send_videos = z2;
        tL_chatBannedRights.send_stickers = z2;
        tL_chatBannedRights.send_gifs = z2;
        tL_chatBannedRights.send_games = z2;
        tL_chatBannedRights.send_inline = z2;
        tL_chatBannedRights.send_audios = z2;
        tL_chatBannedRights.send_docs = z2;
        tL_chatBannedRights.send_voices = z2;
        tL_chatBannedRights.send_roundvideos = z2;
        tL_chatBannedRights.embed_links = z2;
        tL_chatBannedRights.send_polls = z2;
        tL_chatBannedRights.send_reactions = z2;
        AndroidUtilities.updateVisibleRows(this.listView);
    }

    public void setTextLeft(View view) {
        if (view instanceof HeaderCell) {
            HeaderCell headerCell = (HeaderCell) view;
            String str = this.currentRank;
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

    private void updateAsAdmin(boolean z) {
        boolean z2;
        boolean z3;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        int i = 1;
        FrameLayout frameLayout = this.addBotButton;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
        int childCount = this.listView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.listView.getChildAt(i2);
            int childAdapterPosition = this.listView.getChildAdapterPosition(childAt);
            if (childAt instanceof TextCheckCell2) {
                boolean z4 = this.asAdmin;
                if (z4) {
                    if (childAdapterPosition == this.manageRow) {
                        if (this.myAdminRights.add_admins || ((chat2 = this.currentChat) != null && chat2.creator)) {
                            z2 = z4;
                            z3 = true;
                        } else {
                            z2 = z4;
                            z3 = false;
                        }
                    } else if (childAdapterPosition == this.changeInfoRow) {
                        z4 = this.adminRights.change_info;
                        if (this.myAdminRights.change_info && this.defaultBannedRights.change_info) {
                            z2 = z4;
                            z3 = true;
                        } else {
                            z2 = z4;
                            z3 = false;
                        }
                    } else if (childAdapterPosition == this.postMessagesRow) {
                        z2 = this.adminRights.post_messages;
                        z3 = this.myAdminRights.post_messages;
                    } else if (childAdapterPosition == this.manageDirectRow) {
                        z2 = this.adminRights.manage_direct_messages;
                        z3 = this.myAdminRights.manage_direct_messages;
                    } else if (childAdapterPosition == this.manageWelcomeRow) {
                        z2 = this.adminRights.manage_welcome_messages;
                        z3 = this.myAdminRights.manage_welcome_messages;
                    } else if (childAdapterPosition == this.editMesagesRow) {
                        z2 = this.adminRights.edit_messages;
                        z3 = this.myAdminRights.edit_messages;
                    } else if (childAdapterPosition == this.deleteMessagesRow) {
                        z2 = this.adminRights.delete_messages;
                        z3 = this.myAdminRights.delete_messages;
                    } else if (childAdapterPosition == this.banUsersRow) {
                        z2 = this.adminRights.ban_users;
                        z3 = this.myAdminRights.ban_users;
                    } else if (childAdapterPosition == this.addUsersRow) {
                        z2 = this.adminRights.invite_users;
                        z3 = this.myAdminRights.invite_users;
                    } else if (childAdapterPosition == this.pinMessagesRow) {
                        z4 = this.adminRights.pin_messages;
                        if (this.myAdminRights.pin_messages && this.defaultBannedRights.pin_messages) {
                            z2 = z4;
                            z3 = true;
                        } else {
                            z2 = z4;
                            z3 = false;
                        }
                    } else if (childAdapterPosition == this.editTagsRow) {
                        z2 = this.adminRights.manage_ranks;
                        z3 = this.myAdminRights.manage_ranks;
                    } else if (childAdapterPosition == this.startVoiceChatRow) {
                        z2 = this.adminRights.manage_call;
                        z3 = this.myAdminRights.manage_call;
                    } else if (childAdapterPosition == this.addAdminsRow) {
                        z2 = this.adminRights.add_admins;
                        z3 = this.myAdminRights.add_admins;
                    } else if (childAdapterPosition == this.anonymousRow) {
                        z4 = this.adminRights.anonymous;
                        if (this.myAdminRights.anonymous || ((chat = this.currentChat) != null && chat.creator)) {
                            z2 = z4;
                            z3 = true;
                        } else {
                            z2 = z4;
                            z3 = false;
                        }
                    } else if (childAdapterPosition == this.manageTopicsRow) {
                        z2 = this.adminRights.manage_topics;
                        z3 = this.myAdminRights.manage_topics;
                    } else if (childAdapterPosition == this.manageLinkedPeersRow) {
                        z2 = this.adminRights.manage_linked_peers;
                        z3 = this.myAdminRights.manage_linked_peers;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                    TextCheckCell2 textCheckCell2 = (TextCheckCell2) childAt;
                    textCheckCell2.setChecked(z2);
                    textCheckCell2.setEnabled(z3, z);
                } else if ((childAdapterPosition != this.changeInfoRow || this.defaultBannedRights.change_info) && ((childAdapterPosition != this.pinMessagesRow || this.defaultBannedRights.pin_messages) && (childAdapterPosition != this.editTagsRow || this.defaultBannedRights.edit_rank))) {
                    TextCheckCell2 textCheckCell3 = (TextCheckCell2) childAt;
                    textCheckCell3.setChecked(false);
                    textCheckCell3.setEnabled(childAdapterPosition == this.manageRow, z);
                } else {
                    TextCheckCell2 textCheckCell4 = (TextCheckCell2) childAt;
                    textCheckCell4.setChecked(true);
                    textCheckCell4.setEnabled(false, false);
                }
            }
        }
        this.listViewAdapter.notifyDataSetChanged();
        AnimatedTextView animatedTextView = this.addBotButtonText;
        if (animatedTextView != null) {
            StringBuilder sb = new StringBuilder();
            zzko.m(R.string.AddBotButton, " ", sb);
            sb.append(LocaleController.getString(this.asAdmin ? R.string.AddBotButtonAsAdmin : R.string.AddBotButtonAsMember));
            animatedTextView.setText(sb.toString(), z, this.asAdmin);
        }
        ValueAnimator valueAnimator = this.asAdminAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.asAdminAnimator = null;
        }
        if (z) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.asAdminT, this.asAdmin ? 1.0f : 0.0f);
            this.asAdminAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ChatRightsEditActivity$$ExternalSyntheticLambda2(this, i));
            this.asAdminAnimator.setDuration((long) (Math.abs(this.asAdminT - (this.asAdmin ? 1.0f : 0.0f)) * 200.0f));
            this.asAdminAnimator.start();
            return;
        }
        this.asAdminT = this.asAdmin ? 1.0f : 0.0f;
        FrameLayout frameLayout2 = this.addBotButton;
        if (frameLayout2 != null) {
            frameLayout2.invalidate();
        }
    }

    private void updateRows(boolean z) {
        int i;
        int i2;
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
        this.permissionsStartRow = 3;
        int i3 = this.currentType;
        if (i3 == 0 || i3 == 2) {
            if (this.isCommunity) {
                this.changeInfoRow = 3;
                this.manageLinkedPeersRow = 4;
                this.addAdminsRow = 5;
                this.rowCount = 7;
                this.banUsersRow = 6;
            } else if (this.isChannel) {
                this.changeInfoRow = 3;
                this.rowCount = 5;
                this.channelMessagesRow = 4;
                if (this.channelMessagesExpanded) {
                    this.channelPostMessagesRow = 5;
                    this.channelEditMessagesRow = 6;
                    this.rowCount = 8;
                    this.channelDeleteMessagesRow = 7;
                }
                int i4 = this.rowCount;
                int i5 = i4 + 1;
                this.rowCount = i5;
                this.channelStoriesRow = i4;
                if (this.channelStoriesExpanded) {
                    this.channelPostStoriesRow = i5;
                    this.channelEditStoriesRow = i4 + 2;
                    this.rowCount = i4 + 4;
                    this.channelDeleteStoriesRow = i4 + 3;
                }
                int i6 = this.rowCount;
                this.manageDirectRow = i6;
                this.manageWelcomeRow = i6 + 1;
                this.addUsersRow = i6 + 2;
                this.startVoiceChatRow = i6 + 3;
                this.addAdminsRow = i6 + 4;
                this.rowCount = i6 + 6;
                this.banUsersRow = i6 + 5;
            } else {
                if (i3 == 2) {
                    this.rowCount = 4;
                    this.manageRow = 3;
                }
                int i7 = this.rowCount;
                this.changeInfoRow = i7;
                this.deleteMessagesRow = i7 + 1;
                this.banUsersRow = i7 + 2;
                this.addUsersRow = i7 + 3;
                int i8 = i7 + 5;
                this.rowCount = i8;
                this.pinMessagesRow = i7 + 4;
                if (i3 != 2) {
                    this.rowCount = i7 + 6;
                    this.editTagsRow = i8;
                }
                if (ChatObject.isChannel(this.currentChat)) {
                    int i9 = this.rowCount;
                    int i10 = i9 + 1;
                    this.rowCount = i10;
                    this.channelStoriesRow = i9;
                    if (this.channelStoriesExpanded) {
                        this.channelPostStoriesRow = i10;
                        this.channelEditStoriesRow = i9 + 2;
                        this.rowCount = i9 + 4;
                        this.channelDeleteStoriesRow = i9 + 3;
                    }
                }
                int i11 = this.rowCount;
                this.manageWelcomeRow = i11;
                this.startVoiceChatRow = i11 + 1;
                this.addAdminsRow = i11 + 2;
                int i12 = i11 + 4;
                this.rowCount = i12;
                this.anonymousRow = i11 + 3;
                if (this.isForum) {
                    this.rowCount = i11 + 5;
                    this.manageTopicsRow = i12;
                }
                if (this.currentUserIsBotGuard) {
                    int i13 = this.rowCount;
                    this.guardBotRow = i13;
                    this.rowCount = i13 + 2;
                    this.guardBotInfoRow = i13 + 1;
                }
            }
        } else if (i3 == 1) {
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
            int i14 = this.rowCount;
            this.addUsersRow = i14;
            this.pinMessagesRow = i14 + 1;
            this.editTagsRow = i14 + 2;
            int i15 = i14 + 4;
            this.rowCount = i15;
            this.changeInfoRow = i14 + 3;
            if (this.isForum) {
                this.rowCount = i14 + 5;
                this.manageTopicsRow = i15;
            }
            int i16 = this.rowCount;
            this.untilSectionRow = i16;
            this.rowCount = i16 + 2;
            this.untilDateRow = i16 + 1;
        }
        int i17 = this.rowCount;
        this.permissionsEndRow = i17;
        if (this.canEdit) {
            if (!this.isChannel && ((i2 = this.currentType) == 0 || ((i2 == 2 && this.asAdmin) || i2 == 1))) {
                this.rightsShadowRow = i17;
                this.rankRow = i17 + 1;
                this.rowCount = i17 + 3;
                this.rankInfoRow = i17 + 2;
            }
            TLRPC.Chat chat = this.currentChat;
            if (chat != null && chat.creator && this.currentType == 0 && hasAllAdminRights() && !this.currentUser.bot && !this.isCommunity) {
                int i18 = this.rightsShadowRow;
                if (i18 == -1) {
                    int i19 = this.rowCount;
                    this.rowCount = i19 + 1;
                    this.transferOwnerShadowRow = i19;
                }
                int i20 = this.rowCount;
                int i21 = i20 + 1;
                this.rowCount = i21;
                this.transferOwnerRow = i20;
                if (i18 != -1) {
                    this.rowCount = i20 + 2;
                    this.transferOwnerShadowRow = i21;
                }
            }
            if (this.initialIsSet) {
                if (this.rightsShadowRow == -1) {
                    int i22 = this.rowCount;
                    this.rowCount = i22 + 1;
                    this.rightsShadowRow = i22;
                }
                int i23 = this.rowCount;
                this.removeAdminRow = i23;
                this.rowCount = i23 + 2;
                this.removeAdminShadowRow = i23 + 1;
            }
        } else if (this.currentType != 0) {
            this.rowCount = i17 + 1;
            this.rightsShadowRow = i17;
        } else if (this.isChannel || (this.currentRank.isEmpty() && !(this.currentChat.creator && UserObject.isUserSelf(this.currentUser)))) {
            int i24 = this.rowCount;
            this.rowCount = i24 + 1;
            this.cantEditInfoRow = i24;
        } else {
            int i25 = this.rowCount;
            this.rightsShadowRow = i25;
            this.rowCount = i25 + 2;
            this.rankRow = i25 + 1;
            if (this.currentChat.creator && UserObject.isUserSelf(this.currentUser)) {
                int i26 = this.rowCount;
                this.rowCount = i26 + 1;
                this.rankInfoRow = i26;
            } else {
                int i27 = this.rowCount;
                this.rowCount = i27 + 1;
                this.cantEditInfoRow = i27;
            }
        }
        if (this.currentType == 2) {
            int i28 = this.rowCount;
            this.rowCount = i28 + 1;
            this.addBotButtonRow = i28;
        }
        if (z) {
            if (iMin == -1 && (i = this.transferOwnerShadowRow) != -1) {
                this.listViewAdapter.notifyItemRangeInserted(Math.min(i, this.transferOwnerRow), 2);
            } else {
                if (iMin == -1 || this.transferOwnerShadowRow != -1) {
                    return;
                }
                this.listViewAdapter.notifyItemRangeRemoved(iMin, 2);
            }
        }
    }

    @Override
    public View createView(Context context) {
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
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i3) {
                if (i3 == -1) {
                    if (ChatRightsEditActivity.this.checkDiscard(true)) {
                        ChatRightsEditActivity.this.finishFragment();
                    }
                } else if (i3 == 1) {
                    ChatRightsEditActivity.this.onDonePressed();
                }
            }
        });
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
        FrameLayout frameLayout = new FrameLayout(context) {
            private int previousHeight = -1;

            @Override
            public void onLayout(boolean z2, int i4, int i5, int i6, int i7) {
                super.onLayout(z2, i4, i5, i6, i7);
                int i8 = i7 - i5;
                int i9 = this.previousHeight;
                if (i9 != -1 && Math.abs(i9 - i8) > AndroidUtilities.dp(20.0f)) {
                    ChatRightsEditActivity.this.listView.smoothScrollToPosition(ChatRightsEditActivity.this.rowCount - 1);
                }
                this.previousHeight = i8;
            }
        };
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        View view = this.fragmentView;
        FrameLayout frameLayout2 = (FrameLayout) view;
        view.setFocusableInTouchMode(true);
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (ChatRightsEditActivity.this.loading) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (ChatRightsEditActivity.this.loading) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setClipChildren(this.currentType != 2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, i, z) {
            {
                super(i, z);
            }

            @Override
            public int getExtraLayoutSpace(RecyclerView.State state) {
                return 5000;
            }
        };
        this.linearLayoutManager = linearLayoutManager;
        linearLayoutManager.setInitialPrefetchItemCount(100);
        this.listView.setLayoutManager(this.linearLayoutManager);
        RecyclerListView recyclerListView2 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listViewAdapter = listAdapter;
        recyclerListView2.setAdapter(listAdapter);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        if (this.currentType == 2) {
            this.listView.setResetSelectorOnChanged(false);
        }
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.listView.lambda$onCellEnter$52(defaultItemAnimator);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
                if (i4 == 1) {
                    AndroidUtilities.hideKeyboard(ChatRightsEditActivity.this.getParentActivity().getCurrentFocus());
                }
            }
        });
        this.listView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda5(4, this, context));
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
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
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        IntroActivity$$ExternalSyntheticLambda0 introActivity$$ExternalSyntheticLambda0 = new IntroActivity$$ExternalSyntheticLambda0(this, 10);
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
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, new String[]{"statusColor"}, null, null, -1, introActivity$$ExternalSyntheticLambda0, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, new String[]{"statusOnlineColor"}, null, null, -1, introActivity$$ExternalSyntheticLambda0, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(null, 0, new Class[]{DialogRadioCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_dialogTextBlack));
        arrayList.add(new ThemeDescription(null, 0, new Class[]{DialogRadioCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_dialogTextGray2));
        arrayList.add(new ThemeDescription(null, 8192, new Class[]{DialogRadioCell.class}, new String[]{"radioButton"}, null, null, -1, null, Theme.key_dialogRadioBackground));
        arrayList.add(new ThemeDescription(null, 16384, new Class[]{DialogRadioCell.class}, new String[]{"radioButton"}, null, null, -1, null, Theme.key_dialogRadioBackgroundChecked));
        return arrayList;
    }

    @Override
    public boolean onBackPressed(boolean z) {
        return checkDiscard(z);
    }

    @Override
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public void setDelegate(ChatRightsEditActivityDelegate chatRightsEditActivityDelegate) {
        this.delegate = chatRightsEditActivityDelegate;
    }

    public void setLoading(boolean z) {
        int i = 0;
        ValueAnimator valueAnimator = this.doneDrawableAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.loading = z;
        this.actionBar.getBackButton().setEnabled(!this.loading);
        CrossfadeDrawable crossfadeDrawable = this.doneDrawable;
        if (crossfadeDrawable != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(crossfadeDrawable.getProgress(), this.loading ? 1.0f : 0.0f);
            this.doneDrawableAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ChatRightsEditActivity$$ExternalSyntheticLambda2(this, i));
            this.doneDrawableAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationCancel(Animator animator) {
                    ChatRightsEditActivity.this.doneDrawable.setProgress(ChatRightsEditActivity.this.loading ? 1.0f : 0.0f);
                    ChatRightsEditActivity.this.doneDrawable.invalidateSelf();
                }
            });
            this.doneDrawableAnimator.setDuration((long) (Math.abs(this.doneDrawable.getProgress() - (this.loading ? 1.0f : 0.0f)) * 150.0f));
            this.doneDrawableAnimator.start();
        }
    }

    private void onDonePressed(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatRightsEditActivity.onDonePressed(boolean):void");
    }
}
