package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
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
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import java.util.ArrayList;
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
import org.telegram.ui.Components.RecyclerListView;

public class ProfileNotificationsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private static final int done_button = 1;
    private ListAdapter adapter;
    private boolean addingException;
    private AnimatorSet animatorSet;
    ChatAvatarContainer avatarContainer;
    private int avatarRow;
    private int avatarSectionRow;
    private int callsRow;
    private int callsVibrateRow;
    private int colorRow;
    private int customResetRow;
    private int customResetShadowRow;
    private ProfileNotificationsActivityDelegate delegate;
    private long dialogId;
    private int enableRow;
    private int generalRow;
    private boolean isInTop5Peers;
    private int ledInfoRow;
    private int ledRow;
    private RecyclerListView listView;
    private boolean needReset;
    private boolean notificationsEnabled;
    private int popupDisabledRow;
    private int popupEnabledRow;
    private int popupInfoRow;
    private int popupRow;
    private int previewRow;
    private int priorityInfoRow;
    private int priorityRow;
    private Theme.ResourcesProvider resourcesProvider;
    private int ringtoneInfoRow;
    private int ringtoneRow;
    private int rowCount;
    private int smartRow;
    private int soundRow;
    private int storiesRow;
    private long topicId;
    private int vibrateRow;

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private static final int VIEW_TYPE_HEADER = 0;
        private static final int VIEW_TYPE_INFO = 2;
        private static final int VIEW_TYPE_RADIO = 4;
        private static final int VIEW_TYPE_SHADOW = 6;
        private static final int VIEW_TYPE_TEXT_CHECK = 7;
        private static final int VIEW_TYPE_TEXT_COLOR = 3;
        private static final int VIEW_TYPE_TEXT_SETTINGS = 1;
        private static final int VIEW_TYPE_USER = 5;
        private Context context;

        public ListAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getItemCount() {
            return ProfileNotificationsActivity.this.rowCount;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == ProfileNotificationsActivity.this.generalRow || i == ProfileNotificationsActivity.this.popupRow || i == ProfileNotificationsActivity.this.ledRow || i == ProfileNotificationsActivity.this.callsRow) {
                return 0;
            }
            if (i == ProfileNotificationsActivity.this.soundRow || i == ProfileNotificationsActivity.this.vibrateRow || i == ProfileNotificationsActivity.this.priorityRow || i == ProfileNotificationsActivity.this.smartRow || i == ProfileNotificationsActivity.this.ringtoneRow || i == ProfileNotificationsActivity.this.callsVibrateRow || i == ProfileNotificationsActivity.this.customResetRow) {
                return 1;
            }
            if (i == ProfileNotificationsActivity.this.popupInfoRow || i == ProfileNotificationsActivity.this.ledInfoRow || i == ProfileNotificationsActivity.this.priorityInfoRow || i == ProfileNotificationsActivity.this.ringtoneInfoRow) {
                return 2;
            }
            if (i == ProfileNotificationsActivity.this.colorRow) {
                return 3;
            }
            if (i == ProfileNotificationsActivity.this.popupEnabledRow || i == ProfileNotificationsActivity.this.popupDisabledRow) {
                return 4;
            }
            if (i == ProfileNotificationsActivity.this.avatarRow) {
                return 5;
            }
            if (i == ProfileNotificationsActivity.this.avatarSectionRow || i == ProfileNotificationsActivity.this.customResetShadowRow) {
                return 6;
            }
            return (i == ProfileNotificationsActivity.this.enableRow || i == ProfileNotificationsActivity.this.previewRow || i == ProfileNotificationsActivity.this.storiesRow) ? 7 : 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getAdapterPosition() == ProfileNotificationsActivity.this.previewRow) {
                return ProfileNotificationsActivity.this.notificationsEnabled;
            }
            if (viewHolder.getAdapterPosition() == ProfileNotificationsActivity.this.customResetRow) {
                return true;
            }
            switch (viewHolder.getItemViewType()) {
                case 0:
                case 2:
                case 5:
                case 6:
                    return false;
                case 1:
                case 3:
                case 4:
                    return ProfileNotificationsActivity.this.notificationsEnabled;
                default:
                    return true;
            }
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z = true;
            boolean z2 = false;
            switch (viewHolder.getItemViewType()) {
                case 0:
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    if (i == ProfileNotificationsActivity.this.generalRow) {
                        headerCell.setText(LocaleController.getString(R.string.General));
                    } else if (i == ProfileNotificationsActivity.this.popupRow) {
                        headerCell.setText(LocaleController.getString(R.string.ProfilePopupNotification));
                    } else if (i == ProfileNotificationsActivity.this.ledRow) {
                        headerCell.setText(LocaleController.getString(R.string.NotificationsLed));
                    } else if (i == ProfileNotificationsActivity.this.callsRow) {
                        headerCell.setText(LocaleController.getString(R.string.VoipNotificationSettings));
                    }
                    break;
                case 1:
                    TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                    String sharedPrefKey = NotificationsController.getSharedPrefKey(ProfileNotificationsActivity.this.dialogId, ProfileNotificationsActivity.this.topicId);
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount);
                    if (i == ProfileNotificationsActivity.this.customResetRow) {
                        textSettingsCell.setText(LocaleController.getString(R.string.ResetCustomNotifications), false);
                        textSettingsCell.setTextColor(ProfileNotificationsActivity.this.getThemedColor(Theme.key_text_RedBold));
                    } else {
                        textSettingsCell.setTextColor(ProfileNotificationsActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                        if (i == ProfileNotificationsActivity.this.soundRow) {
                            String strM = zzii.m("sound_", sharedPrefKey);
                            int i2 = R.string.SoundDefault;
                            String string = notificationsSettings.getString(strM, LocaleController.getString(i2));
                            long j = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                            if (j != 0) {
                                TLRPC.Document document = ProfileNotificationsActivity.this.getMediaDataController().ringtoneDataStore.getDocument(j);
                                string = document == null ? LocaleController.getString(R.string.CustomSound) : NotificationsSoundActivity.trimTitle(document, document.file_name_fixed);
                            } else if (string.equals("NoSound")) {
                                string = LocaleController.getString(R.string.NoSound);
                            } else if (string.equals("Default")) {
                                string = LocaleController.getString(i2);
                            }
                            textSettingsCell.setTextAndValue(LocaleController.getString(R.string.Sound), string, false, true);
                        } else if (i == ProfileNotificationsActivity.this.ringtoneRow) {
                            String string2 = notificationsSettings.getString(zzii.m("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                            if (string2.equals("NoSound")) {
                                string2 = LocaleController.getString(R.string.NoSound);
                            }
                            textSettingsCell.setTextAndValue(LocaleController.getString(R.string.VoipSettingsRingtone), string2, false, false);
                        } else if (i == ProfileNotificationsActivity.this.vibrateRow) {
                            int i3 = notificationsSettings.getInt("vibrate_" + sharedPrefKey, 0);
                            if (i3 == 0 || i3 == 4) {
                                String string3 = LocaleController.getString(R.string.Vibrate);
                                String string4 = LocaleController.getString(R.string.VibrationDefault);
                                if (ProfileNotificationsActivity.this.smartRow == -1 && ProfileNotificationsActivity.this.priorityRow == -1) {
                                    z = false;
                                }
                                textSettingsCell.setTextAndValue(string3, string4, false, z);
                            } else if (i3 == 1) {
                                String string5 = LocaleController.getString(R.string.Vibrate);
                                String string6 = LocaleController.getString(R.string.Short);
                                if (ProfileNotificationsActivity.this.smartRow == -1 && ProfileNotificationsActivity.this.priorityRow == -1) {
                                    z = false;
                                }
                                textSettingsCell.setTextAndValue(string5, string6, false, z);
                            } else if (i3 == 2) {
                                String string7 = LocaleController.getString(R.string.Vibrate);
                                String string8 = LocaleController.getString(R.string.VibrationDisabled);
                                if (ProfileNotificationsActivity.this.smartRow == -1 && ProfileNotificationsActivity.this.priorityRow == -1) {
                                    z = false;
                                }
                                textSettingsCell.setTextAndValue(string7, string8, false, z);
                            } else if (i3 == 3) {
                                String string9 = LocaleController.getString(R.string.Vibrate);
                                String string10 = LocaleController.getString(R.string.Long);
                                if (ProfileNotificationsActivity.this.smartRow == -1 && ProfileNotificationsActivity.this.priorityRow == -1) {
                                    z = false;
                                }
                                textSettingsCell.setTextAndValue(string9, string10, false, z);
                            }
                        } else if (i == ProfileNotificationsActivity.this.priorityRow) {
                            int i4 = notificationsSettings.getInt("priority_" + sharedPrefKey, 3);
                            if (i4 == 0) {
                                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityHigh), false, false);
                            } else if (i4 == 1 || i4 == 2) {
                                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityUrgent), false, false);
                            } else if (i4 == 3) {
                                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPrioritySettings), false, false);
                            } else if (i4 == 4) {
                                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityLow), false, false);
                            } else if (i4 == 5) {
                                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityMedium), false, false);
                            }
                        } else if (i == ProfileNotificationsActivity.this.smartRow) {
                            int i5 = notificationsSettings.getInt("smart_max_count_" + sharedPrefKey, 2);
                            int i6 = notificationsSettings.getInt("smart_delay_" + sharedPrefKey, 180);
                            if (i5 == 0) {
                                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.SmartNotifications), LocaleController.getString(R.string.SmartNotificationsDisabled), false, ProfileNotificationsActivity.this.priorityRow != -1);
                            } else {
                                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.SmartNotifications), LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(i5), LocaleController.formatPluralString("Minutes", i6 / 60, new Object[0])), false, ProfileNotificationsActivity.this.priorityRow != -1);
                            }
                        } else if (i == ProfileNotificationsActivity.this.callsVibrateRow) {
                            int i7 = notificationsSettings.getInt("calls_vibrate_" + sharedPrefKey, 0);
                            if (i7 == 0 || i7 == 4) {
                                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDefault), false, true);
                            } else if (i7 == 1) {
                                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Short), false, true);
                            } else if (i7 == 2) {
                                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDisabled), false, true);
                            } else if (i7 == 3) {
                                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Long), false, true);
                            }
                        }
                    }
                    break;
                case 2:
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    textInfoPrivacyCell.setFixedSize(0);
                    if (i == ProfileNotificationsActivity.this.popupInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                    } else if (i == ProfileNotificationsActivity.this.ledInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                    } else if (i == ProfileNotificationsActivity.this.priorityInfoRow) {
                        if (ProfileNotificationsActivity.this.priorityRow == -1) {
                            textInfoPrivacyCell.setText("");
                        } else {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PriorityInfo));
                        }
                    } else if (i == ProfileNotificationsActivity.this.ringtoneInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                    }
                    break;
                case 3:
                    TextColorCell textColorCell = (TextColorCell) viewHolder.itemView;
                    String sharedPrefKey2 = NotificationsController.getSharedPrefKey(ProfileNotificationsActivity.this.dialogId, ProfileNotificationsActivity.this.topicId);
                    SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount);
                    int i8 = notificationsSettings2.contains("color_" + sharedPrefKey2) ? notificationsSettings2.getInt("color_" + sharedPrefKey2, -16776961) : DialogObject.isChatDialog(ProfileNotificationsActivity.this.dialogId) ? notificationsSettings2.getInt("GroupLed", -16776961) : notificationsSettings2.getInt("MessagesLed", -16776961);
                    for (int i9 = 0; i9 < 9; i9++) {
                        if (TextColorCell.colorsToSave[i9] == i8) {
                            i8 = TextColorCell.colors[i9];
                            textColorCell.textView.setText(LocaleController.getString(R.string.NotificationsLedColor));
                            textColorCell.needDivider = false;
                            textColorCell.currentColor = i8;
                            textColorCell.setWillNotDraw(i8 == 0);
                            textColorCell.invalidate();
                        }
                        break;
                    }
                    textColorCell.textView.setText(LocaleController.getString(R.string.NotificationsLedColor));
                    textColorCell.needDivider = false;
                    textColorCell.currentColor = i8;
                    textColorCell.setWillNotDraw(i8 == 0);
                    textColorCell.invalidate();
                    break;
                case 4:
                    RadioCell radioCell = (RadioCell) viewHolder.itemView;
                    SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount);
                    int i10 = notificationsSettings3.getInt("popup_" + NotificationsController.getSharedPrefKey(ProfileNotificationsActivity.this.dialogId, ProfileNotificationsActivity.this.topicId), 0);
                    if (i10 == 0) {
                        i10 = notificationsSettings3.getInt(DialogObject.isChatDialog(ProfileNotificationsActivity.this.dialogId) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                    }
                    if (i == ProfileNotificationsActivity.this.popupEnabledRow) {
                        radioCell.setText(LocaleController.getString(R.string.PopupEnabled), i10 == 1, true);
                        radioCell.setTag(1);
                    } else if (i == ProfileNotificationsActivity.this.popupDisabledRow) {
                        radioCell.setText(LocaleController.getString(R.string.PopupDisabled), i10 == 2, false);
                        radioCell.setTag(2);
                    }
                    break;
                case 5:
                    ((UserCell2) viewHolder.itemView).setData(DialogObject.isUserDialog(ProfileNotificationsActivity.this.dialogId) ? MessagesController.getInstance(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).getUser(Long.valueOf(ProfileNotificationsActivity.this.dialogId)) : MessagesController.getInstance(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).getChat(Long.valueOf(-ProfileNotificationsActivity.this.dialogId)), null);
                    break;
                case 6:
                    ShadowSectionCell shadowSectionCell = (ShadowSectionCell) viewHolder.itemView;
                    boolean z3 = i > 0;
                    z = i < getItemCount() - 1;
                    if (shadowSectionCell.top != z3 || shadowSectionCell.bottom != z) {
                        shadowSectionCell.top = z3;
                        shadowSectionCell.bottom = z;
                        int i11 = shadowSectionCell.backgroundColor;
                        if (i11 == 0) {
                            shadowSectionCell.setBackground(null);
                        } else {
                            shadowSectionCell.setBackgroundColor(i11);
                        }
                    }
                    break;
                case 7:
                    TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                    SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount);
                    if (i == ProfileNotificationsActivity.this.enableRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.Notifications), ProfileNotificationsActivity.this.notificationsEnabled, true);
                    } else if (i == ProfileNotificationsActivity.this.previewRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.MessagePreview), notificationsSettings4.getBoolean("content_preview_" + NotificationsController.getSharedPrefKey(ProfileNotificationsActivity.this.dialogId, ProfileNotificationsActivity.this.topicId), true), true);
                    } else if (i == ProfileNotificationsActivity.this.storiesRow) {
                        String strM2 = zzii.m("stories_", NotificationsController.getSharedPrefKey(ProfileNotificationsActivity.this.dialogId, ProfileNotificationsActivity.this.topicId));
                        if (ProfileNotificationsActivity.this.isInTop5Peers || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                            z2 = true;
                        }
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(strM2, z2), true);
                    }
                    break;
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View headerCell;
            switch (i) {
                case 0:
                    headerCell = new HeaderCell(this.context, ProfileNotificationsActivity.this.resourcesProvider);
                    headerCell.setBackgroundColor(ProfileNotificationsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    break;
                case 1:
                    headerCell = new TextSettingsCell(this.context, ProfileNotificationsActivity.this.resourcesProvider, 0);
                    headerCell.setBackgroundColor(ProfileNotificationsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    break;
                case 2:
                    headerCell = new TextInfoPrivacyCell(this.context, 24, ProfileNotificationsActivity.this.resourcesProvider);
                    break;
                case 3:
                    headerCell = new TextColorCell(this.context, ProfileNotificationsActivity.this.resourcesProvider);
                    headerCell.setBackgroundColor(ProfileNotificationsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    break;
                case 4:
                    headerCell = new RadioCell(this.context, ProfileNotificationsActivity.this.resourcesProvider);
                    headerCell.setBackgroundColor(ProfileNotificationsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    break;
                case 5:
                    headerCell = new UserCell2(this.context, ProfileNotificationsActivity.this.resourcesProvider);
                    headerCell.setBackgroundColor(ProfileNotificationsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    break;
                case 6:
                    headerCell = new ShadowSectionCell(this.context, ProfileNotificationsActivity.this.resourcesProvider, 0);
                    break;
                default:
                    headerCell = new TextCheckCell(this.context, 21, false, ProfileNotificationsActivity.this.resourcesProvider);
                    headerCell.setBackgroundColor(ProfileNotificationsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    break;
            }
            return zzkd.m(headerCell, headerCell, -2);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                ((HeaderCell) viewHolder.itemView).setEnabled(ProfileNotificationsActivity.this.notificationsEnabled, (ArrayList<Animator>) null);
                return;
            }
            if (itemViewType == 1) {
                TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                if (viewHolder.getAdapterPosition() == ProfileNotificationsActivity.this.customResetRow) {
                    textSettingsCell.setEnabled(true, null);
                    return;
                } else {
                    textSettingsCell.setEnabled(ProfileNotificationsActivity.this.notificationsEnabled, null);
                    return;
                }
            }
            if (itemViewType == 2) {
                ((TextInfoPrivacyCell) viewHolder.itemView).setEnabled(ProfileNotificationsActivity.this.notificationsEnabled, null);
                return;
            }
            if (itemViewType == 3) {
                ((TextColorCell) viewHolder.itemView).setEnabled(ProfileNotificationsActivity.this.notificationsEnabled, null);
                return;
            }
            if (itemViewType == 4) {
                ((RadioCell) viewHolder.itemView).setEnabled(ProfileNotificationsActivity.this.notificationsEnabled, null);
                return;
            }
            if (itemViewType != 7) {
                return;
            }
            TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
            if (viewHolder.getAdapterPosition() == ProfileNotificationsActivity.this.previewRow) {
                textCheckCell.setEnabled(ProfileNotificationsActivity.this.notificationsEnabled, null);
            } else if (viewHolder.getAdapterPosition() == ProfileNotificationsActivity.this.storiesRow) {
                textCheckCell.setEnabled(ProfileNotificationsActivity.this.notificationsEnabled, null);
            } else {
                textCheckCell.setEnabled(true, null);
            }
        }
    }

    public ProfileNotificationsActivity(Bundle bundle) {
        this(bundle, null);
    }

    private void checkRowsEnabled() {
        int childCount = this.listView.getChildCount();
        ArrayList<Animator> arrayList = new ArrayList<>();
        for (int i = 0; i < childCount; i++) {
            RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.getChildViewHolder(this.listView.getChildAt(i));
            int itemViewType = holder.getItemViewType();
            int adapterPosition = holder.getAdapterPosition();
            if (adapterPosition != this.enableRow && adapterPosition != this.customResetRow) {
                if (itemViewType == 0) {
                    ((HeaderCell) holder.itemView).setEnabled(this.notificationsEnabled, arrayList);
                } else if (itemViewType == 1) {
                    ((TextSettingsCell) holder.itemView).setEnabled(this.notificationsEnabled, arrayList);
                } else if (itemViewType == 2) {
                    ((TextInfoPrivacyCell) holder.itemView).setEnabled(this.notificationsEnabled, arrayList);
                } else if (itemViewType == 3) {
                    ((TextColorCell) holder.itemView).setEnabled(this.notificationsEnabled, arrayList);
                } else if (itemViewType == 4) {
                    ((RadioCell) holder.itemView).setEnabled(this.notificationsEnabled, arrayList);
                } else if (itemViewType == 7 && adapterPosition == this.previewRow) {
                    ((TextCheckCell) holder.itemView).setEnabled(this.notificationsEnabled, arrayList);
                }
            }
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
        this.animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (animator.equals(ProfileNotificationsActivity.this.animatorSet)) {
                    ProfileNotificationsActivity.this.animatorSet = null;
                }
            }
        });
        this.animatorSet.setDuration(150L);
        this.animatorSet.start();
    }

    public void lambda$createView$0(String str, AlertDialog alertDialog, int i) {
        this.needReset = true;
        MessagesController.getNotificationsSettings(this.currentAccount).edit().putBoolean("custom_" + str, false).remove("notify2_" + str).apply();
        finishFragment();
        ProfileNotificationsActivityDelegate profileNotificationsActivityDelegate = this.delegate;
        if (profileNotificationsActivityDelegate != null) {
            profileNotificationsActivityDelegate.didRemoveException(this.dialogId);
        }
    }

    public void lambda$createView$1() {
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.lambda$onBindViewHolder$31(this.vibrateRow);
        }
    }

    public void lambda$createView$2() {
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.lambda$onBindViewHolder$31(this.callsVibrateRow);
        }
    }

    public void lambda$createView$3() {
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.lambda$onBindViewHolder$31(this.priorityRow);
        }
    }

    public void lambda$createView$4(String str, int i, int i2) {
        MessagesController.getNotificationsSettings(this.currentAccount).edit().putInt("smart_max_count_" + str, i).putInt("smart_delay_" + str, i2).apply();
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.lambda$onBindViewHolder$31(this.smartRow);
        }
    }

    public void lambda$createView$5() {
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.lambda$onBindViewHolder$31(this.colorRow);
        }
    }

    public void lambda$createView$6(Context context, String str, View view, int i) {
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i == this.customResetRow) {
                AlertDialog alertDialogCreate = new AlertDialog.Builder(context, 0, this.resourcesProvider).setTitle(LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle)).setMessage(LocaleController.getString(R.string.ResetCustomNotificationsAlert)).setPositiveButton(LocaleController.getString(R.string.Reset), new ProfileNotificationsActivity$$ExternalSyntheticLambda1(this, str)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
                showDialog(alertDialogCreate);
                TextView textView = (TextView) alertDialogCreate.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                    return;
                }
                return;
            }
            if (i == this.soundRow) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.dialogId);
                bundle.putLong("topic_id", this.topicId);
                presentFragment(new NotificationsSoundActivity(bundle, this.resourcesProvider));
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
                    String string = notificationsSettings.getString("ringtone_path_" + str, path);
                    if (string != null && !string.equals("NoSound")) {
                        parcelable = string.equals(path) ? uri : Uri.parse(string);
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
                final int i2 = 0;
                showDialog(AlertsCreator.createVibrationSelectDialog(getParentActivity(), this.dialogId, this.topicId, false, false, new Runnable(this) {
                    public final ProfileNotificationsActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                this.f$0.lambda$createView$1();
                                break;
                            case 1:
                                this.f$0.lambda$createView$2();
                                break;
                            case 2:
                                this.f$0.lambda$createView$3();
                                break;
                            default:
                                this.f$0.lambda$createView$5();
                                break;
                        }
                    }
                }, this.resourcesProvider));
                return;
            }
            if (i == this.enableRow) {
                TextCheckCell textCheckCell = (TextCheckCell) view;
                boolean z = !textCheckCell.isChecked();
                this.notificationsEnabled = z;
                textCheckCell.setChecked(z);
                checkRowsEnabled();
                return;
            }
            if (i == this.previewRow) {
                TextCheckCell textCheckCell2 = (TextCheckCell) view;
                MessagesController.getNotificationsSettings(this.currentAccount).edit().putBoolean(zzii.m("content_preview_", str), !textCheckCell2.isChecked()).apply();
                textCheckCell2.setChecked(!textCheckCell2.isChecked());
                return;
            }
            if (i == this.callsVibrateRow) {
                final int i3 = 1;
                showDialog(AlertsCreator.createVibrationSelectDialog(getParentActivity(), this.dialogId, this.topicId, zzii.m("calls_vibrate_", str), new Runnable(this) {
                    public final ProfileNotificationsActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i3) {
                            case 0:
                                this.f$0.lambda$createView$1();
                                break;
                            case 1:
                                this.f$0.lambda$createView$2();
                                break;
                            case 2:
                                this.f$0.lambda$createView$3();
                                break;
                            default:
                                this.f$0.lambda$createView$5();
                                break;
                        }
                    }
                }, this.resourcesProvider));
                return;
            }
            if (i == this.priorityRow) {
                final int i4 = 2;
                showDialog(AlertsCreator.createPrioritySelectDialog(getParentActivity(), this.dialogId, this.topicId, -1, new Runnable(this) {
                    public final ProfileNotificationsActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i4) {
                            case 0:
                                this.f$0.lambda$createView$1();
                                break;
                            case 1:
                                this.f$0.lambda$createView$2();
                                break;
                            case 2:
                                this.f$0.lambda$createView$3();
                                break;
                            default:
                                this.f$0.lambda$createView$5();
                                break;
                        }
                    }
                }, this.resourcesProvider));
                return;
            }
            if (i == this.smartRow) {
                if (getParentActivity() == null) {
                    return;
                }
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(this.currentAccount);
                int i5 = notificationsSettings2.getInt("smart_max_count_" + str, 2);
                AlertsCreator.createSoundFrequencyPickerDialog(getParentActivity(), i5 != 0 ? i5 : 2, notificationsSettings2.getInt("smart_delay_" + str, 180), new ProfileNotificationsActivity$$ExternalSyntheticLambda1(this, str), this.resourcesProvider);
                return;
            }
            if (i == this.colorRow) {
                if (getParentActivity() == null) {
                    return;
                }
                final int i6 = 3;
                showDialog(AlertsCreator.createColorSelectDialog(getParentActivity(), this.dialogId, this.topicId, -1, new Runnable(this) {
                    public final ProfileNotificationsActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i6) {
                            case 0:
                                this.f$0.lambda$createView$1();
                                break;
                            case 1:
                                this.f$0.lambda$createView$2();
                                break;
                            case 2:
                                this.f$0.lambda$createView$3();
                                break;
                            default:
                                this.f$0.lambda$createView$5();
                                break;
                        }
                    }
                }, this.resourcesProvider));
                return;
            }
            if (i == this.popupEnabledRow) {
                MessagesController.getNotificationsSettings(this.currentAccount).edit().putInt("popup_" + str, 1).apply();
                ((RadioCell) view).setChecked(true, true);
                View viewFindViewWithTag = this.listView.findViewWithTag(2);
                if (viewFindViewWithTag != null) {
                    ((RadioCell) viewFindViewWithTag).setChecked(false, true);
                    return;
                }
                return;
            }
            if (i == this.popupDisabledRow) {
                MessagesController.getNotificationsSettings(this.currentAccount).edit().putInt("popup_" + str, 2).apply();
                ((RadioCell) view).setChecked(true, true);
                View viewFindViewWithTag2 = this.listView.findViewWithTag(1);
                if (viewFindViewWithTag2 != null) {
                    ((RadioCell) viewFindViewWithTag2).setChecked(false, true);
                    return;
                }
                return;
            }
            if (i == this.storiesRow) {
                TextCheckCell textCheckCell3 = (TextCheckCell) view;
                boolean zIsChecked = textCheckCell3.isChecked();
                boolean z2 = !zIsChecked;
                textCheckCell3.setChecked(z2);
                SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
                if (!this.isInTop5Peers || zIsChecked) {
                    editorEdit.putBoolean("stories_" + str, z2);
                } else {
                    editorEdit.remove("stories_" + str);
                }
                editorEdit.apply();
                getNotificationsController().updateServerNotificationsSettings(this.dialogId, this.topicId);
            }
        }
    }

    public void lambda$getThemeDescriptions$7() {
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

    @Override
    public View createView(Context context) {
        this.actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_avatar_actionBarSelectorBlue, this.resourcesProvider), false);
        this.actionBar.setItemsColor(Theme.getColor(Theme.key_actionBarDefaultIcon, this.resourcesProvider), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final String sharedPrefKey = NotificationsController.getSharedPrefKey(this.dialogId, this.topicId);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    if (!ProfileNotificationsActivity.this.addingException && ProfileNotificationsActivity.this.notificationsEnabled) {
                        MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).edit().putInt("notify2_" + sharedPrefKey, 0).apply();
                    }
                } else if (i == 1) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((BaseFragment) ProfileNotificationsActivity.this).currentAccount);
                    SharedPreferences.Editor editorEdit = notificationsSettings.edit();
                    editorEdit.putBoolean("custom_" + sharedPrefKey, true);
                    TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).dialogs_dict.get(ProfileNotificationsActivity.this.dialogId);
                    if (ProfileNotificationsActivity.this.notificationsEnabled) {
                        editorEdit.putInt("notify2_" + sharedPrefKey, 0);
                        if (ProfileNotificationsActivity.this.topicId == 0) {
                            MessagesStorage.getInstance(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).setDialogFlags(ProfileNotificationsActivity.this.dialogId, 0L);
                            if (dialog != null) {
                                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                            }
                        }
                    } else {
                        editorEdit.putInt("notify2_" + sharedPrefKey, 2);
                        if (ProfileNotificationsActivity.this.topicId == 0) {
                            NotificationsController.getInstance(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).removeNotificationsForDialog(ProfileNotificationsActivity.this.dialogId);
                            MessagesStorage.getInstance(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).setDialogFlags(ProfileNotificationsActivity.this.dialogId, 1L);
                            if (dialog != null) {
                                TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                                dialog.notify_settings = tL_peerNotifySettings;
                                tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                            }
                        }
                    }
                    editorEdit.apply();
                    NotificationsController.getInstance(((BaseFragment) ProfileNotificationsActivity.this).currentAccount).updateServerNotificationsSettings(ProfileNotificationsActivity.this.dialogId, ProfileNotificationsActivity.this.topicId);
                    if (ProfileNotificationsActivity.this.delegate != null) {
                        NotificationsSettingsActivity.NotificationException notificationException = new NotificationsSettingsActivity.NotificationException();
                        notificationException.did = ProfileNotificationsActivity.this.dialogId;
                        notificationException.hasCustom = true;
                        int i2 = notificationsSettings.getInt("notify2_" + sharedPrefKey, 0);
                        notificationException.notify = i2;
                        if (i2 != 0) {
                            notificationException.muteUntil = notificationsSettings.getInt("notifyuntil_" + sharedPrefKey, 0);
                        }
                        ProfileNotificationsActivity.this.delegate.didCreateNewException(notificationException);
                    }
                }
                ProfileNotificationsActivity.this.finishFragment();
            }
        });
        ChatAvatarContainer chatAvatarContainer = new ChatAvatarContainer(context, null, false, this.resourcesProvider);
        this.avatarContainer = chatAvatarContainer;
        chatAvatarContainer.setOccupyStatusBar(!AndroidUtilities.isTablet());
        this.actionBar.addView(this.avatarContainer, 0, LayoutHelper.createFrame(-2, -1.0f, 51, !this.inPreviewMode ? 56.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (this.dialogId >= 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.dialogId));
            if (user != null) {
                this.avatarContainer.setUserAvatar(user);
                this.avatarContainer.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        } else if (this.topicId != 0) {
            TLRPC.TL_forumTopic tL_forumTopicFindTopic = getMessagesController().getTopicsController().findTopic(-this.dialogId, this.topicId);
            ForumUtilities.setTopicIcon(this.avatarContainer.getAvatarImageView(), tL_forumTopicFindTopic, false, true, this.resourcesProvider);
            this.avatarContainer.setTitle(tL_forumTopicFindTopic.title);
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
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
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView2 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.adapter = listAdapter;
        recyclerListView2.setAdapter(listAdapter);
        this.listView.lambda$onCellEnter$52(null);
        this.listView.setLayoutAnimation(null);
        this.listView.setLayoutManager(new LinearLayoutManager(context) {
            {
                super(1, false);
            }

            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        });
        this.listView.setOnItemClickListener(new ThemeActivity$ListAdapter$$ExternalSyntheticLambda0(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.adapter.notifyDataSetChanged();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public Theme.ResourcesProvider getResourceProvider() {
        return this.resourcesProvider;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        QrActivity$$ExternalSyntheticLambda18 qrActivity$$ExternalSyntheticLambda18 = new QrActivity$$ExternalSyntheticLambda18(this, 2);
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
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, new String[]{"statusColor"}, null, null, -1, qrActivity$$ExternalSyntheticLambda18, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, new String[]{"statusOnlineColor"}, null, null, -1, qrActivity$$ExternalSyntheticLambda18, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell2.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda18, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda18, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda18, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda18, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda18, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda18, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda18, Theme.key_avatar_backgroundPink));
        return arrayList;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
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
            listAdapter.lambda$onBindViewHolder$31(i == 13 ? this.ringtoneRow : this.soundRow);
        }
    }

    @Override
    public boolean onFragmentCreate() {
        boolean z;
        if (DialogObject.isUserDialog(this.dialogId)) {
            ArrayList<TLRPC.TL_topPeer> arrayList = getMediaDataController().hints;
            int i = 0;
            while (i < arrayList.size()) {
                TLRPC.Peer peer = arrayList.get(i).peer;
                if ((peer instanceof TLRPC.TL_peerUser) && peer.user_id == this.dialogId) {
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
        if (z2 || this.topicId != 0) {
            this.rowCount = i2 + 2;
            this.enableRow = i3;
        } else {
            this.enableRow = -1;
        }
        this.storiesRow = -1;
        if (DialogObject.isEncryptedDialog(this.dialogId)) {
            this.previewRow = -1;
        } else {
            int i4 = this.rowCount;
            this.rowCount = i4 + 1;
            this.previewRow = i4;
            if (DialogObject.isUserDialog(this.dialogId)) {
                int i5 = this.rowCount;
                this.rowCount = i5 + 1;
                this.storiesRow = i5;
            }
        }
        int i6 = this.rowCount;
        this.soundRow = i6;
        this.rowCount = i6 + 2;
        this.vibrateRow = i6 + 1;
        if (DialogObject.isChatDialog(this.dialogId)) {
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
        if (DialogObject.isChatDialog(this.dialogId)) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (DialogObject.isEncryptedDialog(this.dialogId) || z) {
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
        if (DialogObject.isUserDialog(this.dialogId)) {
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
        if (this.addingException) {
            this.customResetRow = -1;
            this.customResetShadowRow = -1;
        } else {
            this.customResetRow = i12;
            this.rowCount = i11 + 5;
            this.customResetShadowRow = i11 + 4;
        }
        boolean zIsGlobalNotificationsEnabled = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(this.dialogId, false, false);
        if (this.addingException) {
            this.notificationsEnabled = !zIsGlobalNotificationsEnabled;
        } else {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.dialogId, this.topicId);
            boolean zContains = notificationsSettings.contains("notify2_" + sharedPrefKey);
            int i13 = notificationsSettings.getInt("notify2_" + sharedPrefKey, 0);
            if (i13 == 0) {
                if (zContains) {
                    this.notificationsEnabled = true;
                } else {
                    this.notificationsEnabled = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(this.dialogId, false, false);
                }
            } else if (i13 == 1) {
                this.notificationsEnabled = true;
            } else if (i13 == 2) {
                this.notificationsEnabled = false;
            } else {
                this.notificationsEnabled = false;
            }
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.needReset) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.dialogId, this.topicId);
            MessagesController.getNotificationsSettings(this.currentAccount).edit().putBoolean("custom_" + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    public void setDelegate(ProfileNotificationsActivityDelegate profileNotificationsActivityDelegate) {
        this.delegate = profileNotificationsActivityDelegate;
    }

    public ProfileNotificationsActivity(Bundle bundle, Theme.ResourcesProvider resourcesProvider) {
        super(bundle);
        this.resourcesProvider = resourcesProvider;
        this.dialogId = bundle.getLong("dialog_id");
        this.topicId = bundle.getLong("topic_id");
        this.addingException = bundle.getBoolean("exception", false);
    }

    public interface ProfileNotificationsActivityDelegate {
        void didCreateNewException(NotificationsSettingsActivity.NotificationException notificationException);

        void didRemoveException(long j);

        public abstract class CC {
            public static void $default$didRemoveException(ProfileNotificationsActivityDelegate profileNotificationsActivityDelegate, long j) {
            }
        }
    }
}
