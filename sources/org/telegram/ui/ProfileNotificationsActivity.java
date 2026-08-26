package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.RadioCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCheckBoxCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextColorCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Cells.UserCell2;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Stories.LiveCommentsView$$ExternalSyntheticLambda6;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda2;

public final class ProfileNotificationsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public ListAdapter adapter;
    public final boolean addingException;
    public AnimatorSet animatorSet;
    public ChatAvatarContainer avatarContainer;
    public int avatarRow;
    public int avatarSectionRow;
    public int callsRow;
    public int callsVibrateRow;
    public int colorRow;
    public int customResetRow;
    public int customResetShadowRow;
    public ProfileNotificationsActivityDelegate delegate;
    public final long dialogId;
    public int enableRow;
    public int generalRow;
    public boolean isInTop5Peers;
    public int ledInfoRow;
    public int ledRow;
    public RecyclerListView listView;
    public boolean needReset;
    public boolean notificationsEnabled;
    public int popupDisabledRow;
    public int popupEnabledRow;
    public int popupInfoRow;
    public int popupRow;
    public int previewRow;
    public int priorityInfoRow;
    public int priorityRow;
    public final Theme.ResourcesProvider resourcesProvider;
    public int ringtoneInfoRow;
    public int ringtoneRow;
    public int rowCount;
    public int smartRow;
    public int soundRow;
    public int storiesRow;
    public final long topicId;
    public int vibrateRow;

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context context;

        public ListAdapter(Context context) {
            this.context = context;
        }

        @Override
        public final int getItemCount() {
            return ProfileNotificationsActivity.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            ProfileNotificationsActivity profileNotificationsActivity = ProfileNotificationsActivity.this;
            if (i == profileNotificationsActivity.generalRow || i == profileNotificationsActivity.popupRow || i == profileNotificationsActivity.ledRow || i == profileNotificationsActivity.callsRow) {
                return 0;
            }
            if (i == profileNotificationsActivity.soundRow || i == profileNotificationsActivity.vibrateRow || i == profileNotificationsActivity.priorityRow || i == profileNotificationsActivity.smartRow || i == profileNotificationsActivity.ringtoneRow || i == profileNotificationsActivity.callsVibrateRow || i == profileNotificationsActivity.customResetRow) {
                return 1;
            }
            if (i == profileNotificationsActivity.popupInfoRow || i == profileNotificationsActivity.ledInfoRow || i == profileNotificationsActivity.priorityInfoRow || i == profileNotificationsActivity.ringtoneInfoRow) {
                return 2;
            }
            if (i == profileNotificationsActivity.colorRow) {
                return 3;
            }
            if (i == profileNotificationsActivity.popupEnabledRow || i == profileNotificationsActivity.popupDisabledRow) {
                return 4;
            }
            if (i == profileNotificationsActivity.avatarRow) {
                return 5;
            }
            if (i == profileNotificationsActivity.avatarSectionRow || i == profileNotificationsActivity.customResetShadowRow) {
                return 6;
            }
            return (i == profileNotificationsActivity.enableRow || i == profileNotificationsActivity.previewRow || i == profileNotificationsActivity.storiesRow) ? 7 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            ProfileNotificationsActivity profileNotificationsActivity = ProfileNotificationsActivity.this;
            if (adapterPosition == profileNotificationsActivity.previewRow) {
                return profileNotificationsActivity.notificationsEnabled;
            }
            if (viewHolder.getAdapterPosition() == profileNotificationsActivity.customResetRow) {
                return true;
            }
            switch (viewHolder.mItemViewType) {
                case 0:
                case 2:
                case 5:
                case 6:
                    return false;
                case 1:
                case 3:
                case 4:
                    return profileNotificationsActivity.notificationsEnabled;
                default:
                    return true;
            }
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = viewHolder.mItemViewType;
            ProfileNotificationsActivity profileNotificationsActivity = ProfileNotificationsActivity.this;
            boolean z = true;
            long j = profileNotificationsActivity.topicId;
            long j2 = profileNotificationsActivity.dialogId;
            boolean z2 = false;
            View view = viewHolder.itemView;
            switch (i2) {
                case 0:
                    HeaderCell headerCell = (HeaderCell) view;
                    if (i == profileNotificationsActivity.generalRow) {
                        headerCell.setText(LocaleController.getString(R.string.General));
                    } else if (i == profileNotificationsActivity.popupRow) {
                        headerCell.setText(LocaleController.getString(R.string.ProfilePopupNotification));
                    } else if (i == profileNotificationsActivity.ledRow) {
                        headerCell.setText(LocaleController.getString(R.string.NotificationsLed));
                    } else if (i == profileNotificationsActivity.callsRow) {
                        headerCell.setText(LocaleController.getString(R.string.VoipNotificationSettings));
                    }
                    break;
                case 1:
                    TextSettingsCell textSettingsCell = (TextSettingsCell) view;
                    String sharedPrefKey = NotificationsController.getSharedPrefKey(j2, j);
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((BaseFragment) profileNotificationsActivity).currentAccount);
                    if (i == profileNotificationsActivity.customResetRow) {
                        textSettingsCell.setText(LocaleController.getString(R.string.ResetCustomNotifications), false);
                        textSettingsCell.setTextColor(profileNotificationsActivity.getThemedColor(Theme.key_text_RedBold));
                    } else {
                        textSettingsCell.setTextColor(profileNotificationsActivity.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                        if (i == profileNotificationsActivity.soundRow) {
                            String strM = zzil.m("sound_", sharedPrefKey);
                            int i3 = R.string.SoundDefault;
                            String string = notificationsSettings.getString(strM, LocaleController.getString(i3));
                            long j3 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                            if (j3 != 0) {
                                TLRPC.Document document = profileNotificationsActivity.getMediaDataController().ringtoneDataStore.getDocument(j3);
                                string = document == null ? LocaleController.getString(R.string.CustomSound) : NotificationsSoundActivity.trimTitle(document, document.file_name_fixed);
                            } else if (string.equals("NoSound")) {
                                string = LocaleController.getString(R.string.NoSound);
                            } else if (string.equals("Default")) {
                                string = LocaleController.getString(i3);
                            }
                            textSettingsCell.setTextAndValue(LocaleController.getString(R.string.Sound), string, false, true);
                        } else if (i == profileNotificationsActivity.ringtoneRow) {
                            String string2 = notificationsSettings.getString(zzil.m("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                            if (string2.equals("NoSound")) {
                                string2 = LocaleController.getString(R.string.NoSound);
                            }
                            textSettingsCell.setTextAndValue(LocaleController.getString(R.string.VoipSettingsRingtone), string2, false, false);
                        } else if (i == profileNotificationsActivity.vibrateRow) {
                            int iM = ArticleViewer.IBlock.CC.m("vibrate_", sharedPrefKey, notificationsSettings, 0);
                            if (iM == 0 || iM == 4) {
                                String string3 = LocaleController.getString(R.string.Vibrate);
                                String string4 = LocaleController.getString(R.string.VibrationDefault);
                                if (profileNotificationsActivity.smartRow == -1 && profileNotificationsActivity.priorityRow == -1) {
                                    z = false;
                                }
                                textSettingsCell.setTextAndValue(string3, string4, false, z);
                            } else if (iM == 1) {
                                String string5 = LocaleController.getString(R.string.Vibrate);
                                String string6 = LocaleController.getString(R.string.Short);
                                if (profileNotificationsActivity.smartRow == -1 && profileNotificationsActivity.priorityRow == -1) {
                                    z = false;
                                }
                                textSettingsCell.setTextAndValue(string5, string6, false, z);
                            } else if (iM == 2) {
                                String string7 = LocaleController.getString(R.string.Vibrate);
                                String string8 = LocaleController.getString(R.string.VibrationDisabled);
                                if (profileNotificationsActivity.smartRow == -1 && profileNotificationsActivity.priorityRow == -1) {
                                    z = false;
                                }
                                textSettingsCell.setTextAndValue(string7, string8, false, z);
                            } else if (iM == 3) {
                                String string9 = LocaleController.getString(R.string.Vibrate);
                                String string10 = LocaleController.getString(R.string.Long);
                                if (profileNotificationsActivity.smartRow == -1 && profileNotificationsActivity.priorityRow == -1) {
                                    z = false;
                                }
                                textSettingsCell.setTextAndValue(string9, string10, false, z);
                            }
                        } else if (i == profileNotificationsActivity.priorityRow) {
                            int iM2 = ArticleViewer.IBlock.CC.m("priority_", sharedPrefKey, notificationsSettings, 3);
                            if (iM2 == 0) {
                                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityHigh), false, false);
                            } else if (iM2 == 1 || iM2 == 2) {
                                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityUrgent), false, false);
                            } else if (iM2 == 3) {
                                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPrioritySettings), false, false);
                            } else if (iM2 == 4) {
                                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityLow), false, false);
                            } else if (iM2 == 5) {
                                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityMedium), false, false);
                            }
                        } else if (i == profileNotificationsActivity.smartRow) {
                            int iM3 = ArticleViewer.IBlock.CC.m("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                            int iM4 = ArticleViewer.IBlock.CC.m("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                            if (iM3 == 0) {
                                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.SmartNotifications), LocaleController.getString(R.string.SmartNotificationsDisabled), false, profileNotificationsActivity.priorityRow != -1);
                            } else {
                                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.SmartNotifications), LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(iM3), LocaleController.formatPluralString("Minutes", iM4 / 60, new Object[0])), false, profileNotificationsActivity.priorityRow != -1);
                            }
                        } else if (i == profileNotificationsActivity.callsVibrateRow) {
                            int iM5 = ArticleViewer.IBlock.CC.m("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                            if (iM5 == 0 || iM5 == 4) {
                                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDefault), false, true);
                            } else if (iM5 == 1) {
                                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Short), false, true);
                            } else if (iM5 == 2) {
                                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDisabled), false, true);
                            } else if (iM5 == 3) {
                                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Long), false, true);
                            }
                        }
                    }
                    break;
                case 2:
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                    textInfoPrivacyCell.setFixedSize(0);
                    if (i == profileNotificationsActivity.popupInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                    } else if (i == profileNotificationsActivity.ledInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                    } else if (i == profileNotificationsActivity.priorityInfoRow) {
                        if (profileNotificationsActivity.priorityRow == -1) {
                            textInfoPrivacyCell.setText("");
                        } else {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PriorityInfo));
                        }
                    } else if (i == profileNotificationsActivity.ringtoneInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                    }
                    break;
                case 3:
                    TextColorCell textColorCell = (TextColorCell) view;
                    String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j2, j);
                    SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(((BaseFragment) profileNotificationsActivity).currentAccount);
                    int iM6 = notificationsSettings2.contains("color_" + sharedPrefKey2) ? ArticleViewer.IBlock.CC.m("color_", sharedPrefKey2, notificationsSettings2, -16776961) : DialogObject.isChatDialog(j2) ? notificationsSettings2.getInt("GroupLed", -16776961) : notificationsSettings2.getInt("MessagesLed", -16776961);
                    for (int i4 = 0; i4 < 9; i4++) {
                        if (TextColorCell.colorsToSave[i4] == iM6) {
                            iM6 = TextColorCell.colors[i4];
                            textColorCell.textView.setText(LocaleController.getString(R.string.NotificationsLedColor));
                            textColorCell.needDivider = false;
                            textColorCell.currentColor = iM6;
                            textColorCell.setWillNotDraw(iM6 == 0);
                            textColorCell.invalidate();
                        }
                        break;
                    }
                    textColorCell.textView.setText(LocaleController.getString(R.string.NotificationsLedColor));
                    textColorCell.needDivider = false;
                    textColorCell.currentColor = iM6;
                    textColorCell.setWillNotDraw(iM6 == 0);
                    textColorCell.invalidate();
                    break;
                case 4:
                    RadioCell radioCell = (RadioCell) view;
                    SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(((BaseFragment) profileNotificationsActivity).currentAccount);
                    int iM7 = ArticleViewer.IBlock.CC.m("popup_", NotificationsController.getSharedPrefKey(j2, j), notificationsSettings3, 0);
                    if (iM7 == 0) {
                        iM7 = notificationsSettings3.getInt(DialogObject.isChatDialog(j2) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                    }
                    if (i == profileNotificationsActivity.popupEnabledRow) {
                        radioCell.setText(LocaleController.getString(R.string.PopupEnabled), iM7 == 1, true);
                        radioCell.setTag(1);
                    } else if (i == profileNotificationsActivity.popupDisabledRow) {
                        radioCell.setText(LocaleController.getString(R.string.PopupDisabled), iM7 == 2, false);
                        radioCell.setTag(2);
                    }
                    break;
                case 5:
                    ((UserCell2) view).setData(DialogObject.isUserDialog(j2) ? MessagesController.getInstance(((BaseFragment) profileNotificationsActivity).currentAccount).getUser(Long.valueOf(j2)) : MessagesController.getInstance(((BaseFragment) profileNotificationsActivity).currentAccount).getChat(Long.valueOf(-j2)), null);
                    break;
                case 6:
                    ShadowSectionCell shadowSectionCell = (ShadowSectionCell) view;
                    boolean z3 = i > 0;
                    z = i < profileNotificationsActivity.rowCount - 1;
                    if (shadowSectionCell.top != z3 || shadowSectionCell.bottom != z) {
                        shadowSectionCell.top = z3;
                        shadowSectionCell.bottom = z;
                        int i5 = shadowSectionCell.backgroundColor;
                        if (i5 == 0) {
                            shadowSectionCell.setBackground(null);
                        } else {
                            shadowSectionCell.setBackgroundColor(i5);
                        }
                    }
                    break;
                case 7:
                    TextCheckCell textCheckCell = (TextCheckCell) view;
                    SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(((BaseFragment) profileNotificationsActivity).currentAccount);
                    if (i == profileNotificationsActivity.enableRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.Notifications), profileNotificationsActivity.notificationsEnabled, true);
                    } else if (i == profileNotificationsActivity.previewRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.MessagePreview), notificationsSettings4.getBoolean("content_preview_" + NotificationsController.getSharedPrefKey(j2, j), true), true);
                    } else if (i == profileNotificationsActivity.storiesRow) {
                        String strM2 = zzil.m("stories_", NotificationsController.getSharedPrefKey(j2, j));
                        if (profileNotificationsActivity.isInTop5Peers || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                            z2 = true;
                        }
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(strM2, z2), true);
                    }
                    break;
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View headerCell;
            ProfileNotificationsActivity profileNotificationsActivity = ProfileNotificationsActivity.this;
            Context context = this.context;
            Theme.ResourcesProvider resourcesProvider = profileNotificationsActivity.resourcesProvider;
            switch (i) {
                case 0:
                    headerCell = new HeaderCell(context, resourcesProvider);
                    headerCell.setBackgroundColor(profileNotificationsActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                    break;
                case 1:
                    headerCell = new TextSettingsCell(context, 0, resourcesProvider);
                    headerCell.setBackgroundColor(profileNotificationsActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                    break;
                case 2:
                    headerCell = new TextInfoPrivacyCell(context, 24, resourcesProvider);
                    break;
                case 3:
                    headerCell = new TextColorCell(context, resourcesProvider);
                    headerCell.setBackgroundColor(profileNotificationsActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                    break;
                case 4:
                    headerCell = new RadioCell(context, resourcesProvider);
                    headerCell.setBackgroundColor(profileNotificationsActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                    break;
                case 5:
                    headerCell = new UserCell2(context, resourcesProvider);
                    headerCell.setBackgroundColor(profileNotificationsActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                    break;
                case 6:
                    headerCell = new ShadowSectionCell(context, (Object) null);
                    break;
                default:
                    headerCell = new TextCheckCell(21, context, resourcesProvider, false);
                    headerCell.setBackgroundColor(profileNotificationsActivity.getThemedColor(Theme.key_windowBackgroundWhite));
                    break;
            }
            return zzkl.m(headerCell, headerCell);
        }

        @Override
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            ProfileNotificationsActivity profileNotificationsActivity = ProfileNotificationsActivity.this;
            View view = viewHolder.itemView;
            if (i == 0) {
                ((HeaderCell) view).setEnabled(null, profileNotificationsActivity.notificationsEnabled);
                return;
            }
            if (i == 1) {
                TextSettingsCell textSettingsCell = (TextSettingsCell) view;
                if (viewHolder.getAdapterPosition() == profileNotificationsActivity.customResetRow) {
                    textSettingsCell.setEnabled(null, true);
                    return;
                } else {
                    textSettingsCell.setEnabled(null, profileNotificationsActivity.notificationsEnabled);
                    return;
                }
            }
            if (i == 2) {
                ((TextInfoPrivacyCell) view).setEnabled(null, profileNotificationsActivity.notificationsEnabled);
                return;
            }
            if (i == 3) {
                ((TextColorCell) view).setEnabled(null, profileNotificationsActivity.notificationsEnabled);
                return;
            }
            if (i == 4) {
                ((RadioCell) view).setEnabled(null, profileNotificationsActivity.notificationsEnabled);
                return;
            }
            if (i != 7) {
                return;
            }
            TextCheckCell textCheckCell = (TextCheckCell) view;
            if (viewHolder.getAdapterPosition() == profileNotificationsActivity.previewRow) {
                textCheckCell.setEnabled(null, profileNotificationsActivity.notificationsEnabled);
            } else if (viewHolder.getAdapterPosition() == profileNotificationsActivity.storiesRow) {
                textCheckCell.setEnabled(null, profileNotificationsActivity.notificationsEnabled);
            } else {
                textCheckCell.setEnabled(null, true);
            }
        }
    }

    public interface ProfileNotificationsActivityDelegate {
        void didCreateNewException(NotificationsSettingsActivity.NotificationException notificationException);

        void didRemoveException();
    }

    public ProfileNotificationsActivity(Bundle bundle, Theme.ResourcesProvider resourcesProvider) {
        super(bundle);
        this.resourcesProvider = resourcesProvider;
        this.dialogId = bundle.getLong("dialog_id");
        this.topicId = bundle.getLong("topic_id");
        this.addingException = bundle.getBoolean("exception", false);
    }

    @Override
    public final View createView(Context context) {
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_avatar_actionBarSelectorBlue;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        boolean z = false;
        actionBar.setItemsBackgroundColor(Theme.getColor(i, resourcesProvider), false);
        this.actionBar.setItemsColor(Theme.getColor(Theme.key_actionBarDefaultIcon, resourcesProvider), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j = this.dialogId;
        long j2 = this.topicId;
        final String sharedPrefKey = NotificationsController.getSharedPrefKey(j, j2);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public final void onItemClick(int i2) {
                ProfileNotificationsActivity profileNotificationsActivity = ProfileNotificationsActivity.this;
                String str = sharedPrefKey;
                if (i2 == -1) {
                    if (!profileNotificationsActivity.addingException && profileNotificationsActivity.notificationsEnabled) {
                        MessagesController.getNotificationsSettings(((BaseFragment) profileNotificationsActivity).currentAccount).edit().putInt("notify2_" + str, 0).apply();
                    }
                } else if (i2 == 1) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((BaseFragment) profileNotificationsActivity).currentAccount);
                    SharedPreferences.Editor editorEdit = notificationsSettings.edit();
                    editorEdit.putBoolean("custom_" + str, true);
                    LongSparseArray longSparseArray = MessagesController.getInstance(((BaseFragment) profileNotificationsActivity).currentAccount).dialogs_dict;
                    long j3 = profileNotificationsActivity.dialogId;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) longSparseArray.get(j3);
                    boolean z2 = profileNotificationsActivity.notificationsEnabled;
                    long j4 = profileNotificationsActivity.topicId;
                    if (z2) {
                        editorEdit.putInt("notify2_" + str, 0);
                        if (j4 == 0) {
                            MessagesStorage.getInstance(((BaseFragment) profileNotificationsActivity).currentAccount).setDialogFlags(j3, 0L);
                            if (dialog != null) {
                                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                            }
                        }
                    } else {
                        editorEdit.putInt("notify2_" + str, 2);
                        if (j4 == 0) {
                            NotificationsController.getInstance(((BaseFragment) profileNotificationsActivity).currentAccount).removeNotificationsForDialog(j3);
                            MessagesStorage.getInstance(((BaseFragment) profileNotificationsActivity).currentAccount).setDialogFlags(j3, 1L);
                            if (dialog != null) {
                                TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                                dialog.notify_settings = tL_peerNotifySettings;
                                tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                            }
                        }
                    }
                    editorEdit.apply();
                    NotificationsController.getInstance(((BaseFragment) profileNotificationsActivity).currentAccount).updateServerNotificationsSettings(j3, j4);
                    if (profileNotificationsActivity.delegate != null) {
                        NotificationsSettingsActivity.NotificationException notificationException = new NotificationsSettingsActivity.NotificationException();
                        notificationException.did = j3;
                        notificationException.hasCustom = true;
                        int iM = ArticleViewer.IBlock.CC.m("notify2_", str, notificationsSettings, 0);
                        notificationException.notify = iM;
                        if (iM != 0) {
                            notificationException.muteUntil = ArticleViewer.IBlock.CC.m("notifyuntil_", str, notificationsSettings, 0);
                        }
                        profileNotificationsActivity.delegate.didCreateNewException(notificationException);
                    }
                }
                profileNotificationsActivity.finishFragment();
            }
        });
        ChatAvatarContainer chatAvatarContainer = new ChatAvatarContainer(context, null, false, resourcesProvider);
        this.avatarContainer = chatAvatarContainer;
        int i2 = 1;
        chatAvatarContainer.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.avatarContainer, 0, LayoutHelper.createFrame(-2, -1.0f, 51, !this.inPreviewMode ? 56.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j >= 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j));
            if (user != null) {
                this.avatarContainer.setUserAvatar(user);
                this.avatarContainer.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        } else if (j2 != 0) {
            TLRPC.TL_forumTopic tL_forumTopicFindTopic = getMessagesController().getTopicsController().findTopic(-j, j2);
            ForumUtilities.setTopicIcon(this.avatarContainer.getAvatarImageView(), tL_forumTopicFindTopic, false, true, resourcesProvider);
            this.avatarContainer.setTitle(tL_forumTopicFindTopic.title);
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j));
            this.avatarContainer.setChatAvatar(chat);
            this.avatarContainer.setTitle(chat.title);
        }
        if (this.addingException) {
            this.avatarContainer.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.createMenu().addItem(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.avatarContainer.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider));
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        RecyclerListView recyclerListView2 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.adapter = listAdapter;
        recyclerListView2.setAdapter(listAdapter);
        this.listView.setItemAnimator(null);
        this.listView.setLayoutAnimation(null);
        this.listView.setLayoutManager(new PhotoViewer.AnonymousClass36(i2, 16, z));
        this.listView.setOnItemClickListener(new LiveCommentsView$$ExternalSyntheticLambda6(this, context, sharedPrefKey, 2));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.adapter.mObservable.notifyChanged();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final Theme.ResourcesProvider getResourceProvider() {
        return this.resourcesProvider;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        QrActivity$$ExternalSyntheticLambda9 qrActivity$$ExternalSyntheticLambda9 = new QrActivity$$ExternalSyntheticLambda9(14, this);
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{HeaderCell.class, TextSettingsCell.class, TextColorCell.class, RadioCell.class, UserCell2.class, TextCheckCell.class, TextCheckBoxCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
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
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextColorCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{RadioCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 8192, new Class[]{RadioCell.class}, new String[]{"radioButton"}, null, null, -1, null, Theme.key_radioBackground));
        arrayList.add(new ThemeDescription(this.listView, 16384, new Class[]{RadioCell.class}, new String[]{"radioButton"}, null, null, -1, null, Theme.key_radioBackgroundChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrack));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrackChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, new String[]{"nameTextView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, new String[]{"statusColor"}, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, new String[]{"statusOnlineColor"}, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundPink));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$createView$0(String str) {
        this.needReset = true;
        MessagesController.getNotificationsSettings(this.currentAccount).edit().putBoolean("custom_" + str, false).remove("notify2_" + str).apply();
        finishFragment();
        ProfileNotificationsActivityDelegate profileNotificationsActivityDelegate = this.delegate;
        if (profileNotificationsActivityDelegate != null) {
            profileNotificationsActivityDelegate.didRemoveException();
        }
    }

    public final void lambda$createView$4(int i, int i2, String str) {
        MessagesController.getNotificationsSettings(this.currentAccount).edit().putInt("smart_max_count_" + str, i).putInt("smart_delay_" + str, i2).apply();
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.notifyItemChanged(this.smartRow);
        }
    }

    public final void lambda$createView$6(Context context, String str, View view, int i) {
        final int i2 = 3;
        final int i3 = 2;
        final int i4 = 0;
        final int i5 = 1;
        if (view.isEnabled()) {
            int i6 = this.customResetRow;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            Parcelable parcelable = null;
            if (i == i6) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                builder.setPositiveButton(LocaleController.getString(R.string.Reset), new ProfileNotificationsActivity$$ExternalSyntheticLambda6(this, str));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog);
                TextView textView = (TextView) alertDialog.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                    return;
                }
                return;
            }
            int i7 = this.soundRow;
            long j = this.topicId;
            long j2 = this.dialogId;
            if (i == i7) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", j2);
                bundle.putLong("topic_id", j);
                presentFragment(new NotificationsSoundActivity(bundle, resourcesProvider));
                return;
            }
            if (i == this.ringtoneRow) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    String path = uri != null ? uri.getPath() : null;
                    String string2 = notificationsSettings.getString("ringtone_path_" + str, path);
                    if (string2 != null && !string2.equals("NoSound")) {
                        parcelable = string2.equals(path) ? uri : Uri.parse(string2);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    startActivityForResult(intent, 13);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            if (i == this.vibrateRow) {
                Activity parentActivity = getParentActivity();
                Runnable runnable = new Runnable(this) {
                    public final ProfileNotificationsActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i4) {
                            case 0:
                                ProfileNotificationsActivity profileNotificationsActivity = this.f$0;
                                ProfileNotificationsActivity.ListAdapter listAdapter = profileNotificationsActivity.adapter;
                                if (listAdapter != null) {
                                    listAdapter.notifyItemChanged(profileNotificationsActivity.vibrateRow);
                                }
                                break;
                            case 1:
                                ProfileNotificationsActivity profileNotificationsActivity2 = this.f$0;
                                ProfileNotificationsActivity.ListAdapter listAdapter2 = profileNotificationsActivity2.adapter;
                                if (listAdapter2 != null) {
                                    listAdapter2.notifyItemChanged(profileNotificationsActivity2.callsVibrateRow);
                                }
                                break;
                            case 2:
                                ProfileNotificationsActivity profileNotificationsActivity3 = this.f$0;
                                ProfileNotificationsActivity.ListAdapter listAdapter3 = profileNotificationsActivity3.adapter;
                                if (listAdapter3 != null) {
                                    listAdapter3.notifyItemChanged(profileNotificationsActivity3.priorityRow);
                                }
                                break;
                            default:
                                ProfileNotificationsActivity profileNotificationsActivity4 = this.f$0;
                                ProfileNotificationsActivity.ListAdapter listAdapter4 = profileNotificationsActivity4.adapter;
                                if (listAdapter4 != null) {
                                    listAdapter4.notifyItemChanged(profileNotificationsActivity4.colorRow);
                                }
                                break;
                        }
                    }
                };
                Pattern pattern = AlertsCreator.URL_PATTERN;
                long j3 = this.dialogId;
                showDialog(AlertsCreator.createVibrationSelectDialog(parentActivity, j3, this.topicId, j3 != 0 ? Log.m(j3, "vibrate_") : "vibrate_messages", runnable, this.resourcesProvider));
                return;
            }
            if (i == this.enableRow) {
                TextCheckCell textCheckCell = (TextCheckCell) view;
                boolean z = !textCheckCell.checkBox.isChecked;
                this.notificationsEnabled = z;
                textCheckCell.setChecked(z);
                int childCount = this.listView.getChildCount();
                ArrayList arrayList = new ArrayList();
                while (i4 < childCount) {
                    RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.getChildViewHolder(this.listView.getChildAt(i4));
                    int i8 = holder.mItemViewType;
                    int adapterPosition = holder.getAdapterPosition();
                    if (adapterPosition != this.enableRow && adapterPosition != this.customResetRow) {
                        View view2 = holder.itemView;
                        if (i8 == 0) {
                            ((HeaderCell) view2).setEnabled(arrayList, this.notificationsEnabled);
                        } else if (i8 == 1) {
                            ((TextSettingsCell) view2).setEnabled(arrayList, this.notificationsEnabled);
                        } else if (i8 == 2) {
                            ((TextInfoPrivacyCell) view2).setEnabled(arrayList, this.notificationsEnabled);
                        } else if (i8 == 3) {
                            ((TextColorCell) view2).setEnabled(arrayList, this.notificationsEnabled);
                        } else if (i8 == 4) {
                            ((RadioCell) view2).setEnabled(arrayList, this.notificationsEnabled);
                        } else if (i8 == 7 && adapterPosition == this.previewRow) {
                            ((TextCheckCell) view2).setEnabled(arrayList, this.notificationsEnabled);
                        }
                    }
                    i4++;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AnimatorSet animatorSet = this.animatorSet;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.animatorSet = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.animatorSet.addListener(new PhotoViewer.AnonymousClass78.AnonymousClass1(this, 8));
                this.animatorSet.setDuration(150L);
                this.animatorSet.start();
                return;
            }
            if (i == this.previewRow) {
                TextCheckCell textCheckCell2 = (TextCheckCell) view;
                SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
                String strM = zzil.m("content_preview_", str);
                Switch r4 = textCheckCell2.checkBox;
                editorEdit.putBoolean(strM, !r4.isChecked).apply();
                textCheckCell2.setChecked(!r4.isChecked);
                return;
            }
            if (i == this.callsVibrateRow) {
                showDialog(AlertsCreator.createVibrationSelectDialog(getParentActivity(), this.dialogId, this.topicId, zzil.m("calls_vibrate_", str), new Runnable(this) {
                    public final ProfileNotificationsActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i5) {
                            case 0:
                                ProfileNotificationsActivity profileNotificationsActivity = this.f$0;
                                ProfileNotificationsActivity.ListAdapter listAdapter = profileNotificationsActivity.adapter;
                                if (listAdapter != null) {
                                    listAdapter.notifyItemChanged(profileNotificationsActivity.vibrateRow);
                                }
                                break;
                            case 1:
                                ProfileNotificationsActivity profileNotificationsActivity2 = this.f$0;
                                ProfileNotificationsActivity.ListAdapter listAdapter2 = profileNotificationsActivity2.adapter;
                                if (listAdapter2 != null) {
                                    listAdapter2.notifyItemChanged(profileNotificationsActivity2.callsVibrateRow);
                                }
                                break;
                            case 2:
                                ProfileNotificationsActivity profileNotificationsActivity3 = this.f$0;
                                ProfileNotificationsActivity.ListAdapter listAdapter3 = profileNotificationsActivity3.adapter;
                                if (listAdapter3 != null) {
                                    listAdapter3.notifyItemChanged(profileNotificationsActivity3.priorityRow);
                                }
                                break;
                            default:
                                ProfileNotificationsActivity profileNotificationsActivity4 = this.f$0;
                                ProfileNotificationsActivity.ListAdapter listAdapter4 = profileNotificationsActivity4.adapter;
                                if (listAdapter4 != null) {
                                    listAdapter4.notifyItemChanged(profileNotificationsActivity4.colorRow);
                                }
                                break;
                        }
                    }
                }, this.resourcesProvider));
                return;
            }
            if (i == this.priorityRow) {
                showDialog(AlertsCreator.createPrioritySelectDialog(getParentActivity(), this.dialogId, this.topicId, -1, new Runnable(this) {
                    public final ProfileNotificationsActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i3) {
                            case 0:
                                ProfileNotificationsActivity profileNotificationsActivity = this.f$0;
                                ProfileNotificationsActivity.ListAdapter listAdapter = profileNotificationsActivity.adapter;
                                if (listAdapter != null) {
                                    listAdapter.notifyItemChanged(profileNotificationsActivity.vibrateRow);
                                }
                                break;
                            case 1:
                                ProfileNotificationsActivity profileNotificationsActivity2 = this.f$0;
                                ProfileNotificationsActivity.ListAdapter listAdapter2 = profileNotificationsActivity2.adapter;
                                if (listAdapter2 != null) {
                                    listAdapter2.notifyItemChanged(profileNotificationsActivity2.callsVibrateRow);
                                }
                                break;
                            case 2:
                                ProfileNotificationsActivity profileNotificationsActivity3 = this.f$0;
                                ProfileNotificationsActivity.ListAdapter listAdapter3 = profileNotificationsActivity3.adapter;
                                if (listAdapter3 != null) {
                                    listAdapter3.notifyItemChanged(profileNotificationsActivity3.priorityRow);
                                }
                                break;
                            default:
                                ProfileNotificationsActivity profileNotificationsActivity4 = this.f$0;
                                ProfileNotificationsActivity.ListAdapter listAdapter4 = profileNotificationsActivity4.adapter;
                                if (listAdapter4 != null) {
                                    listAdapter4.notifyItemChanged(profileNotificationsActivity4.colorRow);
                                }
                                break;
                        }
                    }
                }, this.resourcesProvider));
                return;
            }
            if (i != this.smartRow) {
                if (i == this.colorRow) {
                    if (getParentActivity() == null) {
                        return;
                    }
                    showDialog(AlertsCreator.createColorSelectDialog(getParentActivity(), this.dialogId, this.topicId, -1, new Runnable(this) {
                        public final ProfileNotificationsActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    ProfileNotificationsActivity profileNotificationsActivity = this.f$0;
                                    ProfileNotificationsActivity.ListAdapter listAdapter = profileNotificationsActivity.adapter;
                                    if (listAdapter != null) {
                                        listAdapter.notifyItemChanged(profileNotificationsActivity.vibrateRow);
                                    }
                                    break;
                                case 1:
                                    ProfileNotificationsActivity profileNotificationsActivity2 = this.f$0;
                                    ProfileNotificationsActivity.ListAdapter listAdapter2 = profileNotificationsActivity2.adapter;
                                    if (listAdapter2 != null) {
                                        listAdapter2.notifyItemChanged(profileNotificationsActivity2.callsVibrateRow);
                                    }
                                    break;
                                case 2:
                                    ProfileNotificationsActivity profileNotificationsActivity3 = this.f$0;
                                    ProfileNotificationsActivity.ListAdapter listAdapter3 = profileNotificationsActivity3.adapter;
                                    if (listAdapter3 != null) {
                                        listAdapter3.notifyItemChanged(profileNotificationsActivity3.priorityRow);
                                    }
                                    break;
                                default:
                                    ProfileNotificationsActivity profileNotificationsActivity4 = this.f$0;
                                    ProfileNotificationsActivity.ListAdapter listAdapter4 = profileNotificationsActivity4.adapter;
                                    if (listAdapter4 != null) {
                                        listAdapter4.notifyItemChanged(profileNotificationsActivity4.colorRow);
                                    }
                                    break;
                            }
                        }
                    }, this.resourcesProvider));
                    return;
                }
                if (i == this.popupEnabledRow) {
                    MessagesController.getNotificationsSettings(this.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((RadioCell) view).radioButton.setChecked(true, true);
                    View viewFindViewWithTag = this.listView.findViewWithTag(2);
                    if (viewFindViewWithTag != null) {
                        ((RadioCell) viewFindViewWithTag).radioButton.setChecked(false, true);
                        return;
                    }
                    return;
                }
                if (i == this.popupDisabledRow) {
                    MessagesController.getNotificationsSettings(this.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((RadioCell) view).radioButton.setChecked(true, true);
                    View viewFindViewWithTag2 = this.listView.findViewWithTag(1);
                    if (viewFindViewWithTag2 != null) {
                        ((RadioCell) viewFindViewWithTag2).radioButton.setChecked(false, true);
                        return;
                    }
                    return;
                }
                if (i == this.storiesRow) {
                    TextCheckCell textCheckCell3 = (TextCheckCell) view;
                    boolean z2 = textCheckCell3.checkBox.isChecked;
                    boolean z3 = !z2;
                    textCheckCell3.setChecked(z3);
                    SharedPreferences.Editor editorEdit2 = MessagesController.getNotificationsSettings(this.currentAccount).edit();
                    if (!this.isInTop5Peers || z2) {
                        editorEdit2.putBoolean("stories_" + str, z3);
                    } else {
                        editorEdit2.remove("stories_" + str);
                    }
                    editorEdit2.apply();
                    getNotificationsController().updateServerNotificationsSettings(j2, j);
                    return;
                }
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(this.currentAccount);
            int iM = ArticleViewer.IBlock.CC.m("smart_max_count_", str, notificationsSettings2, 2);
            int iM2 = ArticleViewer.IBlock.CC.m("smart_delay_", str, notificationsSettings2, 180);
            i3 = iM != 0 ? iM : 2;
            Activity parentActivity2 = getParentActivity();
            ProfileNotificationsActivity$$ExternalSyntheticLambda6 profileNotificationsActivity$$ExternalSyntheticLambda6 = new ProfileNotificationsActivity$$ExternalSyntheticLambda6(this, str);
            Pattern pattern2 = AlertsCreator.URL_PATTERN;
            if (parentActivity2 == null) {
                return;
            }
            int colorOrDefault = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_dialogTextBlack) : Theme.getColor(null, Theme.key_dialogTextBlack, false);
            int colorOrDefault2 = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_dialogBackground) : Theme.getColor(null, Theme.key_dialogBackground, false);
            if (resourcesProvider != null) {
                resourcesProvider.getColorOrDefault(Theme.key_sheet_other);
            } else {
                Theme.getColor(null, Theme.key_sheet_other, false);
            }
            if (resourcesProvider != null) {
                resourcesProvider.getColorOrDefault(Theme.key_player_actionBarSelector);
            } else {
                Theme.getColor(null, Theme.key_player_actionBarSelector, false);
            }
            if (resourcesProvider != null) {
                resourcesProvider.getColorOrDefault(Theme.key_actionBarDefaultSubmenuItem);
            } else {
                Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false);
            }
            if (resourcesProvider != null) {
                resourcesProvider.getColorOrDefault(Theme.key_actionBarDefaultSubmenuBackground);
            } else {
                Theme.getColor(null, Theme.key_actionBarDefaultSubmenuBackground, false);
            }
            if (resourcesProvider != null) {
                resourcesProvider.getColorOrDefault(Theme.key_listSelector);
            } else {
                Theme.getColor(null, Theme.key_listSelector, false);
            }
            int colorOrDefault3 = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_featuredStickers_buttonText) : Theme.getColor(null, Theme.key_featuredStickers_buttonText, false);
            int colorOrDefault4 = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_featuredStickers_addButton) : Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
            int colorOrDefault5 = resourcesProvider != null ? resourcesProvider.getColorOrDefault(Theme.key_featuredStickers_addButtonPressed) : Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
            BottomSheet.Builder builder2 = new BottomSheet.Builder(parentActivity2, resourcesProvider);
            BottomSheet bottomSheet = builder2.bottomSheet;
            bottomSheet.applyBottomPadding = false;
            AlertsCreator.AnonymousClass48 anonymousClass48 = new AlertsCreator.AnonymousClass48(parentActivity2, 18, resourcesProvider);
            anonymousClass48.setMinValue(0);
            anonymousClass48.setMaxValue(10);
            anonymousClass48.setTextColor(colorOrDefault);
            anonymousClass48.setValue(i3 - 1);
            anonymousClass48.setWrapSelectorWheel(false);
            anonymousClass48.setFormatter(new ChatActivity$$ExternalSyntheticLambda131(27));
            AlertsCreator.AnonymousClass49 anonymousClass49 = new AlertsCreator.AnonymousClass49(parentActivity2, 18, resourcesProvider);
            anonymousClass49.setMinValue(0);
            anonymousClass49.setMaxValue(10);
            anonymousClass49.setTextColor(colorOrDefault);
            anonymousClass49.setValue((iM2 / 60) - 1);
            anonymousClass49.setWrapSelectorWheel(false);
            anonymousClass49.setFormatter(new ChatActivity$$ExternalSyntheticLambda131(28));
            NumberPicker numberPicker = new NumberPicker(parentActivity2, 18, resourcesProvider);
            numberPicker.setMinValue(0);
            numberPicker.setMaxValue(0);
            numberPicker.setTextColor(colorOrDefault);
            numberPicker.setValue(0);
            numberPicker.setWrapSelectorWheel(false);
            numberPicker.setFormatter(new ChatActivity$$ExternalSyntheticLambda131(29));
            AlertsCreator.AnonymousClass27 anonymousClass27 = new AlertsCreator.AnonymousClass27(parentActivity2, anonymousClass48, anonymousClass49, numberPicker);
            anonymousClass27.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(parentActivity2);
            anonymousClass27.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
            TextView textView2 = new TextView(parentActivity2);
            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
            textView2.setTextColor(colorOrDefault);
            textView2.setTextSize(1, 20.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            frameLayout.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView2.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(9));
            LinearLayout linearLayout = new LinearLayout(parentActivity2);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            anonymousClass27.addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            AlertsCreator.AnonymousClass51 anonymousClass51 = new AlertsCreator.AnonymousClass51(parentActivity2);
            linearLayout.addView(anonymousClass48, LayoutHelper.createLinear(0.4f, 0, 270));
            linearLayout.addView(numberPicker, LayoutHelper.createLinear(0, -2, 0.2f, 16));
            linearLayout.addView(anonymousClass49, LayoutHelper.createLinear(0.4f, 0, 270));
            anonymousClass51.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            anonymousClass51.setGravity(17);
            anonymousClass51.setTextColor(colorOrDefault3);
            anonymousClass51.setTextSize(1, 14.0f);
            anonymousClass51.setTypeface(AndroidUtilities.bold());
            int iDp = AndroidUtilities.dp(8.0f);
            anonymousClass51.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, colorOrDefault4, colorOrDefault5, colorOrDefault5));
            anonymousClass51.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
            anonymousClass27.addView(anonymousClass51, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
            ChatActivity$$ExternalSyntheticLambda131 chatActivity$$ExternalSyntheticLambda131 = new ChatActivity$$ExternalSyntheticLambda131(19);
            anonymousClass48.setOnValueChangedListener(chatActivity$$ExternalSyntheticLambda131);
            anonymousClass49.setOnValueChangedListener(chatActivity$$ExternalSyntheticLambda131);
            anonymousClass51.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(anonymousClass48, anonymousClass49, profileNotificationsActivity$$ExternalSyntheticLambda6, builder2, 4));
            bottomSheet.customView = anonymousClass27;
            bottomSheet.show();
            bottomSheet.setBackgroundColor(colorOrDefault2);
            bottomSheet.fixNavigationBar(colorOrDefault2);
        }
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        String string;
        Ringtone ringtone;
        if (i2 != -1 || intent == null) {
            return;
        }
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
        if (uri == null || (ringtone = RingtoneManager.getRingtone(ApplicationLoader.applicationContext, uri)) == null) {
            string = null;
        } else {
            if (i == 13) {
                string = uri.equals(Settings.System.DEFAULT_RINGTONE_URI) ? LocaleController.getString(R.string.DefaultRingtone) : ringtone.getTitle(getParentActivity());
            } else {
                string = uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? LocaleController.getString(R.string.SoundDefault) : ringtone.getTitle(getParentActivity());
            }
            ringtone.stop();
        }
        SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.dialogId, this.topicId);
        if (i == 12) {
            if (string != null) {
                editorEdit.putString("sound_" + sharedPrefKey, string);
                editorEdit.putString("sound_path_" + sharedPrefKey, uri.toString());
            } else {
                editorEdit.putString("sound_" + sharedPrefKey, "NoSound");
                editorEdit.putString("sound_path_" + sharedPrefKey, "NoSound");
            }
            getNotificationsController().deleteNotificationChannel(this.dialogId, this.topicId);
        } else if (i == 13) {
            if (string != null) {
                editorEdit.putString("ringtone_" + sharedPrefKey, string);
                editorEdit.putString("ringtone_path_" + sharedPrefKey, uri.toString());
            } else {
                editorEdit.putString("ringtone_" + sharedPrefKey, "NoSound");
                editorEdit.putString("ringtone_path_" + sharedPrefKey, "NoSound");
            }
        }
        editorEdit.apply();
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.notifyItemChanged(i == 13 ? this.ringtoneRow : this.soundRow);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        boolean z;
        long j = this.dialogId;
        if (DialogObject.isUserDialog(j)) {
            ArrayList<TLRPC.TL_topPeer> arrayList = getMediaDataController().hints;
            int i = 0;
            while (i < arrayList.size()) {
                TLRPC.Peer peer = arrayList.get(i).peer;
                if ((peer instanceof TLRPC.TL_peerUser) && peer.user_id == j) {
                    this.isInTop5Peers = i < 5;
                    break;
                }
                i++;
            }
        }
        this.rowCount = 0;
        boolean z2 = this.addingException;
        if (z2) {
            this.avatarRow = 0;
            this.rowCount = 2;
            this.avatarSectionRow = 1;
        } else {
            this.avatarRow = -1;
            this.avatarSectionRow = -1;
        }
        int i2 = this.rowCount;
        int i3 = i2 + 1;
        this.rowCount = i3;
        this.generalRow = i2;
        long j2 = this.topicId;
        if (z2 || j2 != 0) {
            this.rowCount = i2 + 2;
            this.enableRow = i3;
        } else {
            this.enableRow = -1;
        }
        this.storiesRow = -1;
        if (DialogObject.isEncryptedDialog(j)) {
            this.previewRow = -1;
        } else {
            int i4 = this.rowCount;
            this.rowCount = i4 + 1;
            this.previewRow = i4;
            if (DialogObject.isUserDialog(j)) {
                int i5 = this.rowCount;
                this.rowCount = i5 + 1;
                this.storiesRow = i5;
            }
        }
        int i6 = this.rowCount;
        this.soundRow = i6;
        this.rowCount = i6 + 2;
        this.vibrateRow = i6 + 1;
        if (DialogObject.isChatDialog(j)) {
            int i7 = this.rowCount;
            this.rowCount = i7 + 1;
            this.smartRow = i7;
        } else {
            this.smartRow = -1;
        }
        int i8 = this.rowCount;
        this.priorityRow = i8;
        this.rowCount = i8 + 2;
        this.priorityInfoRow = i8 + 1;
        if (DialogObject.isChatDialog(j)) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (DialogObject.isEncryptedDialog(j) || z) {
            this.popupRow = -1;
            this.popupEnabledRow = -1;
            this.popupDisabledRow = -1;
            this.popupInfoRow = -1;
        } else {
            int i9 = this.rowCount;
            this.popupRow = i9;
            this.popupEnabledRow = i9 + 1;
            this.popupDisabledRow = i9 + 2;
            this.rowCount = i9 + 4;
            this.popupInfoRow = i9 + 3;
        }
        if (DialogObject.isUserDialog(j)) {
            int i10 = this.rowCount;
            this.callsRow = i10;
            this.callsVibrateRow = i10 + 1;
            this.ringtoneRow = i10 + 2;
            this.rowCount = i10 + 4;
            this.ringtoneInfoRow = i10 + 3;
        } else {
            this.callsRow = -1;
            this.callsVibrateRow = -1;
            this.ringtoneRow = -1;
            this.ringtoneInfoRow = -1;
        }
        int i11 = this.rowCount;
        this.ledRow = i11;
        this.colorRow = i11 + 1;
        int i12 = i11 + 3;
        this.rowCount = i12;
        this.ledInfoRow = i11 + 2;
        if (z2) {
            this.customResetRow = -1;
            this.customResetShadowRow = -1;
        } else {
            this.customResetRow = i12;
            this.rowCount = i11 + 5;
            this.customResetShadowRow = i11 + 4;
        }
        boolean zIsGlobalNotificationsEnabled = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j, false, false);
        if (z2) {
            this.notificationsEnabled = !zIsGlobalNotificationsEnabled;
        } else {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j, j2);
            boolean zContains = notificationsSettings.contains("notify2_" + sharedPrefKey);
            int iM = ArticleViewer.IBlock.CC.m("notify2_", sharedPrefKey, notificationsSettings, 0);
            if (iM == 0) {
                if (zContains) {
                    this.notificationsEnabled = true;
                } else {
                    this.notificationsEnabled = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j, false, false);
                }
            } else if (iM == 1) {
                this.notificationsEnabled = true;
            } else if (iM == 2) {
                this.notificationsEnabled = false;
            } else {
                this.notificationsEnabled = false;
            }
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.needReset) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.dialogId, this.topicId);
            MessagesController.getNotificationsSettings(this.currentAccount).edit().putBoolean("custom_" + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }
}
