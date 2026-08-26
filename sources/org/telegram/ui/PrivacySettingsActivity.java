package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.RadioColorCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.bots.BotBiometry;
import org.telegram.ui.bots.BotBiometrySettings;

public class PrivacySettingsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private int advancedSectionRow;
    private boolean archiveChats;
    private int autoDeleteMesages;
    private int bioRow;
    private final ArrayList<BotBiometry.Bot> biometryBots;
    private int birthdayRow;
    private int blockedRow;
    private int botsAndWebsitesShadowRow;
    private int botsBiometryRow;
    private int botsDetailRow;
    private int botsSectionRow;
    private int callsRow;
    private boolean[] clear;
    private int contactsDeleteRow;
    private int contactsDetailRow;
    private int contactsSectionRow;
    private int contactsSuggestRow;
    private int contactsSyncRow;
    public ArrayList<TL_account.Passkey> currentPasskeys;
    private TL_account.Password currentPassword;
    private boolean currentSuggest;
    private boolean currentSync;
    private int deleteAccountDetailRow;
    private int deleteAccountRow;
    private boolean deleteAccountUpdate;
    private SessionsActivity devicesActivityPreload;
    private int emailLoginRow;
    private boolean feeValue;
    private int forwardsRow;
    private int giftsRow;
    private int groupsDetailRow;
    private int groupsRow;
    private int lastSeenRow;
    private LinearLayoutManager layoutManager;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private int musicRow;
    private int newChatsHeaderRow;
    private int newChatsRow;
    private int newChatsSectionRow;
    private boolean newSuggest;
    private boolean newSync;
    private int noncontactsRow;
    private boolean noncontactsValue;
    private int passcodeRow;
    private int passkeysRow;
    private int passportRow;
    private int passwordRow;
    private int paymentsClearRow;
    private int phoneNumberRow;
    private SpannableString premiumStar;
    private int privacySectionRow;
    private int privacyShadowRow;
    private int profilePhotoRow;
    private AlertDialog progressDialog;
    private int rowCount;
    private int secretDetailRow;
    private int secretMapRow;
    private boolean secretMapUpdate;
    private int secretSectionRow;
    private int secretWebpageRow;
    private int securitySectionRow;
    private int sessionsDetailRow;
    private int sessionsRow;
    private int voicesRow;
    private SessionsActivity webSessionsActivityPreload;
    private int webSessionsRow;

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            return PrivacySettingsActivity.this.rowCount;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == PrivacySettingsActivity.this.passportRow || i == PrivacySettingsActivity.this.lastSeenRow || i == PrivacySettingsActivity.this.phoneNumberRow || i == PrivacySettingsActivity.this.deleteAccountRow || i == PrivacySettingsActivity.this.webSessionsRow || i == PrivacySettingsActivity.this.groupsRow || i == PrivacySettingsActivity.this.paymentsClearRow || i == PrivacySettingsActivity.this.secretMapRow || i == PrivacySettingsActivity.this.contactsDeleteRow || i == PrivacySettingsActivity.this.botsBiometryRow) {
                return 0;
            }
            if (i == PrivacySettingsActivity.this.privacyShadowRow || i == PrivacySettingsActivity.this.deleteAccountDetailRow || i == PrivacySettingsActivity.this.groupsDetailRow || i == PrivacySettingsActivity.this.sessionsDetailRow || i == PrivacySettingsActivity.this.secretDetailRow || i == PrivacySettingsActivity.this.botsDetailRow || i == PrivacySettingsActivity.this.contactsDetailRow || i == PrivacySettingsActivity.this.newChatsSectionRow) {
                return 1;
            }
            if (i == PrivacySettingsActivity.this.securitySectionRow || i == PrivacySettingsActivity.this.advancedSectionRow || i == PrivacySettingsActivity.this.privacySectionRow || i == PrivacySettingsActivity.this.secretSectionRow || i == PrivacySettingsActivity.this.botsSectionRow || i == PrivacySettingsActivity.this.contactsSectionRow || i == PrivacySettingsActivity.this.newChatsHeaderRow) {
                return 2;
            }
            if (i == PrivacySettingsActivity.this.secretWebpageRow || i == PrivacySettingsActivity.this.contactsSyncRow || i == PrivacySettingsActivity.this.contactsSuggestRow || i == PrivacySettingsActivity.this.newChatsRow) {
                return 3;
            }
            if (i == PrivacySettingsActivity.this.botsAndWebsitesShadowRow) {
                return 4;
            }
            return (i == PrivacySettingsActivity.this.autoDeleteMesages || i == PrivacySettingsActivity.this.sessionsRow || i == PrivacySettingsActivity.this.emailLoginRow || i == PrivacySettingsActivity.this.passwordRow || i == PrivacySettingsActivity.this.passkeysRow || i == PrivacySettingsActivity.this.passcodeRow || i == PrivacySettingsActivity.this.blockedRow) ? 5 : 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            return adapterPosition == PrivacySettingsActivity.this.passcodeRow || adapterPosition == PrivacySettingsActivity.this.passwordRow || adapterPosition == PrivacySettingsActivity.this.passkeysRow || adapterPosition == PrivacySettingsActivity.this.blockedRow || adapterPosition == PrivacySettingsActivity.this.sessionsRow || adapterPosition == PrivacySettingsActivity.this.secretWebpageRow || adapterPosition == PrivacySettingsActivity.this.webSessionsRow || (adapterPosition == PrivacySettingsActivity.this.groupsRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(1)) || ((adapterPosition == PrivacySettingsActivity.this.lastSeenRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(0)) || ((adapterPosition == PrivacySettingsActivity.this.callsRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(2)) || ((adapterPosition == PrivacySettingsActivity.this.profilePhotoRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(4)) || ((adapterPosition == PrivacySettingsActivity.this.bioRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(9)) || ((adapterPosition == PrivacySettingsActivity.this.musicRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(14)) || ((adapterPosition == PrivacySettingsActivity.this.birthdayRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(11)) || ((adapterPosition == PrivacySettingsActivity.this.giftsRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(12)) || ((adapterPosition == PrivacySettingsActivity.this.forwardsRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(5)) || ((adapterPosition == PrivacySettingsActivity.this.phoneNumberRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(6)) || ((adapterPosition == PrivacySettingsActivity.this.voicesRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(8)) || adapterPosition == PrivacySettingsActivity.this.noncontactsRow || ((adapterPosition == PrivacySettingsActivity.this.deleteAccountRow && !PrivacySettingsActivity.this.getContactsController().getLoadingDeleteInfo()) || ((adapterPosition == PrivacySettingsActivity.this.newChatsRow && !PrivacySettingsActivity.this.getContactsController().getLoadingGlobalSettings()) || adapterPosition == PrivacySettingsActivity.this.emailLoginRow || adapterPosition == PrivacySettingsActivity.this.paymentsClearRow || adapterPosition == PrivacySettingsActivity.this.secretMapRow || adapterPosition == PrivacySettingsActivity.this.contactsSyncRow || adapterPosition == PrivacySettingsActivity.this.passportRow || adapterPosition == PrivacySettingsActivity.this.contactsDeleteRow || adapterPosition == PrivacySettingsActivity.this.contactsSuggestRow || adapterPosition == PrivacySettingsActivity.this.autoDeleteMesages || adapterPosition == PrivacySettingsActivity.this.botsBiometryRow))))))))))));
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            boolean z;
            int i2;
            String string2;
            boolean z2;
            String str;
            String string3;
            String string4;
            int i3;
            String string5;
            String str2;
            String string6;
            int i4;
            String str3;
            SpannableStringBuilder spannableStringBuilderValueOf;
            CharSequence charSequence;
            String str4;
            String str5;
            String tTLString;
            boolean z3 = true;
            boolean z4 = false;
            int itemViewType = viewHolder.getItemViewType();
            int i5 = 16;
            String pluralString = null;
            if (itemViewType == 0) {
                boolean z5 = viewHolder.itemView.getTag() != null && ((Integer) viewHolder.itemView.getTag()).intValue() == i;
                viewHolder.itemView.setTag(Integer.valueOf(i));
                TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                textSettingsCell.setBetterLayout(true);
                if (i == PrivacySettingsActivity.this.webSessionsRow) {
                    textSettingsCell.setText(LocaleController.getString("WebSessionsTitle", R.string.WebSessionsTitle), false);
                } else {
                    if (i == PrivacySettingsActivity.this.phoneNumberRow) {
                        if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(6)) {
                            z = true;
                            i5 = 30;
                        } else {
                            pluralString = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 6);
                            z = false;
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("PrivacyPhone", R.string.PrivacyPhone), pluralString, false, true);
                    } else if (i == PrivacySettingsActivity.this.lastSeenRow) {
                        if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(0)) {
                            z = true;
                            i5 = 30;
                        } else {
                            pluralString = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 0);
                            z = false;
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("PrivacyLastSeen", R.string.PrivacyLastSeen), pluralString, false, true);
                    } else if (i == PrivacySettingsActivity.this.groupsRow) {
                        if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(1)) {
                            z = true;
                            i5 = 30;
                        } else {
                            pluralString = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 1);
                            z = false;
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString(R.string.PrivacyInvites), pluralString, false, false);
                    } else if (i == PrivacySettingsActivity.this.callsRow) {
                        if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(2)) {
                            z = true;
                            i5 = 30;
                        } else {
                            pluralString = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 2);
                            z = false;
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("Calls", R.string.Calls), pluralString, false, true);
                    } else if (i == PrivacySettingsActivity.this.profilePhotoRow) {
                        if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(4)) {
                            z = true;
                            i5 = 30;
                        } else {
                            pluralString = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 4);
                            z = false;
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("PrivacyProfilePhoto", R.string.PrivacyProfilePhoto), pluralString, false, true);
                    } else if (i == PrivacySettingsActivity.this.bioRow) {
                        if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(9)) {
                            z = true;
                            i5 = 30;
                        } else {
                            pluralString = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 9);
                            z = false;
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("PrivacyBio", R.string.PrivacyBio), pluralString, false, true);
                    } else if (i == PrivacySettingsActivity.this.musicRow) {
                        if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(14)) {
                            z = true;
                            i5 = 30;
                        } else {
                            pluralString = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 14);
                            z = false;
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString(R.string.PrivacyMusic), pluralString, false, true);
                    } else if (i == PrivacySettingsActivity.this.birthdayRow) {
                        if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(11)) {
                            z = true;
                            i5 = 30;
                        } else {
                            pluralString = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 11);
                            z = false;
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString(R.string.PrivacyBirthday), pluralString, false, true);
                    } else if (i == PrivacySettingsActivity.this.giftsRow) {
                        if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(12)) {
                            z = true;
                            i5 = 30;
                        } else {
                            pluralString = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 12);
                            z = false;
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString(R.string.PrivacyGifts), pluralString, false, true);
                    } else if (i == PrivacySettingsActivity.this.forwardsRow) {
                        if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(5)) {
                            z = true;
                            i5 = 30;
                        } else {
                            pluralString = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 5);
                            z = false;
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("PrivacyForwards", R.string.PrivacyForwards), pluralString, false, true);
                    } else if (i == PrivacySettingsActivity.this.voicesRow) {
                        if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(8)) {
                            string2 = null;
                            i5 = 30;
                            z2 = true;
                        } else {
                            string2 = !PrivacySettingsActivity.this.getUserConfig().isPremium() ? LocaleController.getString(R.string.P2PEverybody) : PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 8);
                            z2 = false;
                        }
                        textSettingsCell.setTextAndValue(PrivacySettingsActivity.this.addPremiumStar(LocaleController.getString(R.string.PrivacyVoiceMessages)), string2, false, PrivacySettingsActivity.this.noncontactsRow != -1);
                        textSettingsCell.getValueImageView().setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayIcon, false), PorterDuff.Mode.MULTIPLY));
                        z4 = z2;
                    } else if (i == PrivacySettingsActivity.this.noncontactsRow) {
                        if (PrivacySettingsActivity.this.feeValue) {
                            i2 = R.string.ContactsAndFee;
                        } else {
                            i2 = PrivacySettingsActivity.this.noncontactsValue ? R.string.ContactsAndPremium : R.string.P2PEverybody;
                        }
                        textSettingsCell.setTextAndValue((!PrivacySettingsActivity.this.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium || PrivacySettingsActivity.this.getMessagesController().starsPaidMessagesAvailable) ? PrivacySettingsActivity.this.addPremiumStar(LocaleController.getString(R.string.PrivacyMessages)) : LocaleController.getString(R.string.PrivacyMessages), LocaleController.getString(i2), false, PrivacySettingsActivity.this.musicRow != -1);
                    } else if (i == PrivacySettingsActivity.this.passportRow) {
                        textSettingsCell.setText(LocaleController.getString("TelegramPassport", R.string.TelegramPassport), true);
                    } else if (i == PrivacySettingsActivity.this.deleteAccountRow) {
                        if (PrivacySettingsActivity.this.getContactsController().getLoadingDeleteInfo()) {
                            z = true;
                        } else {
                            int deleteAccountTTL = PrivacySettingsActivity.this.getContactsController().getDeleteAccountTTL();
                            if (deleteAccountTTL <= 182) {
                                pluralString = LocaleController.formatPluralString("Months", deleteAccountTTL / 30, new Object[0]);
                            } else if (deleteAccountTTL == 365) {
                                pluralString = LocaleController.formatPluralString("Months", 12, new Object[0]);
                            } else if (deleteAccountTTL == 548) {
                                pluralString = LocaleController.formatPluralString("Months", 18, new Object[0]);
                            } else if (deleteAccountTTL == 730) {
                                pluralString = LocaleController.formatPluralString("Months", 24, new Object[0]);
                            } else {
                                pluralString = deleteAccountTTL > 30 ? LocaleController.formatPluralString("Months", (int) Math.round(((double) deleteAccountTTL) / 30.0d), new Object[0]) : LocaleController.formatPluralString("Days", deleteAccountTTL, new Object[0]);
                            }
                            z = false;
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("DeleteAccountIfAwayFor3", R.string.DeleteAccountIfAwayFor3), pluralString, PrivacySettingsActivity.this.deleteAccountUpdate, false);
                        PrivacySettingsActivity.this.deleteAccountUpdate = false;
                    } else if (i == PrivacySettingsActivity.this.paymentsClearRow) {
                        textSettingsCell.setText(LocaleController.getString("PrivacyPaymentsClear", R.string.PrivacyPaymentsClear), true);
                    } else if (i == PrivacySettingsActivity.this.botsBiometryRow) {
                        textSettingsCell.setText(LocaleController.getString(R.string.PrivacyBiometryBotsButton), true);
                    } else if (i == PrivacySettingsActivity.this.secretMapRow) {
                        int i6 = SharedConfig.mapPreviewType;
                        if (i6 == 0) {
                            string = LocaleController.getString("MapPreviewProviderTelegram", R.string.MapPreviewProviderTelegram);
                        } else if (i6 != 1) {
                            string = i6 != 2 ? LocaleController.getString("MapPreviewProviderYandex", R.string.MapPreviewProviderYandex) : LocaleController.getString("MapPreviewProviderNobody", R.string.MapPreviewProviderNobody);
                        } else {
                            string = LocaleController.getString("MapPreviewProviderGoogle", R.string.MapPreviewProviderGoogle);
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("MapPreviewProvider", R.string.MapPreviewProvider), string, PrivacySettingsActivity.this.secretMapUpdate, true);
                        PrivacySettingsActivity.this.secretMapUpdate = false;
                    } else if (i == PrivacySettingsActivity.this.contactsDeleteRow) {
                        textSettingsCell.setText(LocaleController.getString("SyncContactsDelete", R.string.SyncContactsDelete), true);
                    }
                    z4 = z;
                }
                textSettingsCell.drawLoading = z4;
                textSettingsCell.loadingSize = i5;
                if (z5) {
                    textSettingsCell.measureDelay = true;
                } else {
                    textSettingsCell.drawLoadingProgress = z4 ? 1.0f : 0.0f;
                }
                textSettingsCell.invalidate();
                return;
            }
            if (itemViewType == 1) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                getItemCount();
                if (i == PrivacySettingsActivity.this.deleteAccountDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString("DeleteAccountHelp", R.string.DeleteAccountHelp));
                    return;
                }
                if (i == PrivacySettingsActivity.this.groupsDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString("GroupsAndChannelsHelp", R.string.GroupsAndChannelsHelp));
                    return;
                }
                if (i == PrivacySettingsActivity.this.sessionsDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString("SessionsSettingsInfo", R.string.SessionsSettingsInfo));
                    return;
                }
                if (i == PrivacySettingsActivity.this.secretDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString("SecretWebPageInfo", R.string.SecretWebPageInfo));
                    return;
                }
                if (i == PrivacySettingsActivity.this.botsDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString("PrivacyBotsInfo", R.string.PrivacyBotsInfo));
                    return;
                }
                if (i == PrivacySettingsActivity.this.privacyShadowRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyInvitesInfo));
                    return;
                } else if (i == PrivacySettingsActivity.this.contactsDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString("SuggestContactsInfo", R.string.SuggestContactsInfo));
                    return;
                } else {
                    if (i == PrivacySettingsActivity.this.newChatsSectionRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString("ArchiveAndMuteInfo", R.string.ArchiveAndMuteInfo));
                        return;
                    }
                    return;
                }
            }
            if (itemViewType == 2) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (i == PrivacySettingsActivity.this.privacySectionRow) {
                    headerCell.setText(LocaleController.getString("PrivacyTitle", R.string.PrivacyTitle));
                    return;
                }
                if (i == PrivacySettingsActivity.this.securitySectionRow) {
                    headerCell.setText(LocaleController.getString("SecurityTitle", R.string.SecurityTitle));
                    return;
                }
                if (i == PrivacySettingsActivity.this.advancedSectionRow) {
                    headerCell.setText(LocaleController.getString("DeleteMyAccount", R.string.DeleteMyAccount));
                    return;
                }
                if (i == PrivacySettingsActivity.this.secretSectionRow) {
                    headerCell.setText(LocaleController.getString("SecretChat", R.string.SecretChat));
                    return;
                }
                if (i == PrivacySettingsActivity.this.botsSectionRow) {
                    headerCell.setText(LocaleController.getString("PrivacyBots", R.string.PrivacyBots));
                    return;
                } else if (i == PrivacySettingsActivity.this.contactsSectionRow) {
                    headerCell.setText(LocaleController.getString("Contacts", R.string.Contacts));
                    return;
                } else {
                    if (i == PrivacySettingsActivity.this.newChatsHeaderRow) {
                        headerCell.setText(LocaleController.getString("NewChatsFromNonContacts", R.string.NewChatsFromNonContacts));
                        return;
                    }
                    return;
                }
            }
            if (itemViewType == 3) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                if (i == PrivacySettingsActivity.this.secretWebpageRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("SecretWebPage", R.string.SecretWebPage), PrivacySettingsActivity.this.getMessagesController().secretWebpagePreview == 1, false);
                    return;
                }
                if (i == PrivacySettingsActivity.this.contactsSyncRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("SyncContacts", R.string.SyncContacts), PrivacySettingsActivity.this.newSync, true);
                    return;
                } else if (i == PrivacySettingsActivity.this.contactsSuggestRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("SuggestContacts", R.string.SuggestContacts), PrivacySettingsActivity.this.newSuggest, false);
                    return;
                } else {
                    if (i == PrivacySettingsActivity.this.newChatsRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString("ArchiveAndMute", R.string.ArchiveAndMute), PrivacySettingsActivity.this.archiveChats, false);
                        return;
                    }
                    return;
                }
            }
            if (itemViewType != 5) {
                return;
            }
            View view = viewHolder.itemView;
            TextCell textCell = (TextCell) view;
            boolean z6 = view.getTag() != null && ((Integer) viewHolder.itemView.getTag()).intValue() == i;
            viewHolder.itemView.setTag(Integer.valueOf(i));
            textCell.setPrioritizeTitleOverValue(false);
            if (i == PrivacySettingsActivity.this.autoDeleteMesages) {
                int globalTTl = PrivacySettingsActivity.this.getUserConfig().getGlobalTTl();
                if (globalTTl == -1) {
                    tTLString = null;
                } else {
                    tTLString = globalTTl > 0 ? LocaleController.formatTTLString(globalTTl * 60) : LocaleController.getString("PasswordOff", R.string.PasswordOff);
                    z3 = false;
                }
                textCell.setTextAndValueAndIcon(LocaleController.getString("AutoDeleteMessages", R.string.AutoDeleteMessages), tTLString, true, R.drawable.msg2_autodelete, true);
            } else {
                String str6 = "";
                if (i != PrivacySettingsActivity.this.sessionsRow) {
                    if (i == PrivacySettingsActivity.this.emailLoginRow) {
                        if (PrivacySettingsActivity.this.currentPassword == null) {
                            z4 = true;
                            charSequence = str6;
                        } else {
                            spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(PrivacySettingsActivity.this.currentPassword.login_email_pattern);
                            int iIndexOf = PrivacySettingsActivity.this.currentPassword.login_email_pattern.indexOf(42);
                            int iLastIndexOf = PrivacySettingsActivity.this.currentPassword.login_email_pattern.lastIndexOf(42);
                            if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                                TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                                textStyleRun.flags |= 256;
                                textStyleRun.start = iIndexOf;
                                int i7 = iLastIndexOf + 1;
                                textStyleRun.end = i7;
                                spannableStringBuilderValueOf.setSpan(new TextStyleSpan(textStyleRun), iIndexOf, i7, 0);
                                charSequence = spannableStringBuilderValueOf;
                            }
                        }
                        charSequence = spannableStringBuilderValueOf;
                        charSequence = spannableStringBuilderValueOf;
                        charSequence = spannableStringBuilderValueOf;
                        textCell.setPrioritizeTitleOverValue(true);
                        textCell.setTextAndSpoilersValueAndIcon(LocaleController.getString(R.string.EmailLogin), charSequence, R.drawable.msg2_email, true);
                    } else if (i == PrivacySettingsActivity.this.passwordRow) {
                        int i8 = R.drawable.menu_2sv;
                        if (PrivacySettingsActivity.this.currentPassword == null) {
                            i4 = i8;
                            str3 = "";
                        } else {
                            if (PrivacySettingsActivity.this.currentPassword.has_password) {
                                i8 = R.drawable.menu_2sv_on;
                                string6 = LocaleController.getString(R.string.PasswordOn);
                            } else {
                                string6 = LocaleController.getString(R.string.PasswordOff);
                            }
                            i4 = i8;
                            str3 = string6;
                            z3 = false;
                        }
                        textCell.setTextAndValueAndIcon(LocaleController.getString(R.string.TwoStepVerification), str3, true, i4, true);
                    } else if (i == PrivacySettingsActivity.this.passkeysRow) {
                        ArrayList<TL_account.Passkey> arrayList = PrivacySettingsActivity.this.currentPasskeys;
                        if (arrayList == null) {
                            str2 = "";
                        } else {
                            if (arrayList.size() == 1 && textCell.valueTextView.getPaint().measureText(PrivacySettingsActivity.this.currentPasskeys.get(0).name) < AndroidUtilities.displaySize.x / 3.0f) {
                                string5 = PrivacySettingsActivity.this.currentPasskeys.get(0).name;
                            } else if (PrivacySettingsActivity.this.currentPasskeys.size() > 0) {
                                string5 = PrivacySettingsActivity.this.currentPasskeys.size() + "";
                            } else {
                                string5 = LocaleController.getString(R.string.PasswordOff);
                            }
                            str2 = string5;
                            z3 = false;
                        }
                        textCell.setTextAndValueAndIcon(LocaleController.getString(R.string.Passkey), str2, true, R.drawable.msg2_permissions, true);
                    } else if (i == PrivacySettingsActivity.this.passcodeRow) {
                        if (SharedConfig.passcodeHash.length() != 0) {
                            string4 = LocaleController.getString(R.string.PasswordOn);
                            i3 = R.drawable.msg2_secret;
                        } else {
                            string4 = LocaleController.getString(R.string.PasswordOff);
                            i3 = R.drawable.msg2_secret;
                        }
                        textCell.setTextAndValueAndIcon(LocaleController.getString(R.string.Passcode), string4, true, i3, true);
                    } else if (i == PrivacySettingsActivity.this.blockedRow) {
                        int i9 = PrivacySettingsActivity.this.getMessagesController().totalBlockedCount;
                        if (i9 == 0) {
                            string3 = LocaleController.getString("BlockedEmpty", R.string.BlockedEmpty);
                        } else {
                            if (i9 > 0) {
                                string3 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(i9));
                            } else {
                                str = "";
                            }
                            textCell.setTextAndValueAndIcon(LocaleController.getString("BlockedUsers", R.string.BlockedUsers), str, true, R.drawable.msg2_block2, true);
                        }
                        str = string3;
                        z3 = false;
                        textCell.setTextAndValueAndIcon(LocaleController.getString("BlockedUsers", R.string.BlockedUsers), str, true, R.drawable.msg2_block2, true);
                    }
                    textCell.setDrawLoading(z4, 16, z6);
                }
                if (PrivacySettingsActivity.this.devicesActivityPreload.getSessionsCount() == 0) {
                    if (PrivacySettingsActivity.this.getMessagesController().lastKnownSessionsCount == 0) {
                        str5 = "";
                    } else {
                        str4 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(PrivacySettingsActivity.this.getMessagesController().lastKnownSessionsCount));
                    }
                    PrivacySettingsActivity.this.getMessagesController().lastKnownSessionsCount = PrivacySettingsActivity.this.devicesActivityPreload.getSessionsCount();
                    textCell.setTextAndValueAndIcon(LocaleController.getString(R.string.SessionsTitle), str5, true, R.drawable.msg2_devices, false);
                } else {
                    str4 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(PrivacySettingsActivity.this.devicesActivityPreload.getSessionsCount()));
                }
                str5 = str4;
                z3 = false;
                PrivacySettingsActivity.this.getMessagesController().lastKnownSessionsCount = PrivacySettingsActivity.this.devicesActivityPreload.getSessionsCount();
                textCell.setTextAndValueAndIcon(LocaleController.getString(R.string.SessionsTitle), str5, true, R.drawable.msg2_devices, false);
            }
            z4 = z3;
            textCell.setDrawLoading(z4, 16, z6);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textSettingsCell;
            View textInfoPrivacyCell;
            if (i != 0) {
                if (i == 1) {
                    textInfoPrivacyCell = new TextInfoPrivacyCell(this.mContext, 24, null);
                } else if (i == 2) {
                    textInfoPrivacyCell = new HeaderCell(this.mContext);
                } else if (i != 4) {
                    textInfoPrivacyCell = i != 5 ? new TextCheckCell(this.mContext) : new TextCell(this.mContext);
                } else {
                    textSettingsCell = new ShadowSectionCell(this.mContext, null, 0);
                }
                return new RecyclerListView.Holder(textInfoPrivacyCell);
            }
            textSettingsCell = new TextSettingsCell(this.mContext, null, 0);
            textInfoPrivacyCell = textSettingsCell;
            return new RecyclerListView.Holder(textInfoPrivacyCell);
        }
    }

    public PrivacySettingsActivity() {
        super(null);
        this.biometryBots = new ArrayList<>();
        this.clear = new boolean[2];
    }

    public CharSequence addPremiumStar(String str) {
        if (this.premiumStar == null) {
            this.premiumStar = new SpannableString("★");
            AnimatedEmojiDrawable.WrapSizeDrawable wrapSizeDrawable = new AnimatedEmojiDrawable.WrapSizeDrawable(PremiumGradient.getInstance().premiumStarMenuDrawable, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
            wrapSizeDrawable.setBounds(0, 0, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
            this.premiumStar.setSpan(new ImageSpan(wrapSizeDrawable, 2), 0, this.premiumStar.length(), 17);
        }
        return new SpannableStringBuilder(str).append((CharSequence) " \u2009").append((CharSequence) this.premiumStar);
    }

    public static String formatRulesString(AccountInstance accountInstance, int i) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        Boolean bool;
        ArrayList<TLRPC.PrivacyRule> privacyRules = accountInstance.getContactsController().getPrivacyRules(i);
        TLRPC.GlobalPrivacySettings globalPrivacySettings = accountInstance.getContactsController().getGlobalPrivacySettings();
        if (privacyRules == null || privacyRules.size() == 0) {
            return i == 3 ? LocaleController.getString(R.string.P2PNobody) : LocaleController.getString(R.string.LastSeenNobody);
        }
        Boolean bool2 = null;
        int size = 0;
        int size2 = 0;
        byte b = -1;
        boolean z = false;
        for (int i2 = 0; i2 < privacyRules.size(); i2++) {
            TLRPC.PrivacyRule privacyRule = privacyRules.get(i2);
            if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                int size3 = tL_privacyValueAllowChatParticipants.chats.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    TLRPC.Chat chat = accountInstance.getMessagesController().getChat(tL_privacyValueAllowChatParticipants.chats.get(i3));
                    if (chat != null) {
                        size += chat.participants_count;
                    }
                }
            } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                int size4 = tL_privacyValueDisallowChatParticipants.chats.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(tL_privacyValueDisallowChatParticipants.chats.get(i4));
                    if (chat2 != null) {
                        size2 += chat2.participants_count;
                    }
                }
            } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                size += ((TLRPC.TL_privacyValueAllowUsers) privacyRule).users.size();
            } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                size2 += ((TLRPC.TL_privacyValueDisallowUsers) privacyRule).users.size();
            } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowPremium) {
                z = true;
            } else {
                if (privacyRule instanceof TLRPC.TL_privacyValueAllowBots) {
                    bool = Boolean.TRUE;
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowBots) {
                    bool = Boolean.FALSE;
                } else if (b == -1) {
                    b = privacyRule instanceof TLRPC.TL_privacyValueAllowAll ? (byte) 0 : privacyRule instanceof TLRPC.TL_privacyValueDisallowAll ? (byte) 1 : (byte) 2;
                }
                bool2 = bool;
            }
        }
        if (i == 12 && globalPrivacySettings != null && (disallowedGiftsSettings2 = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings2.disallow_unique_stargifts && disallowedGiftsSettings2.disallow_unlimited_stargifts && disallowedGiftsSettings2.disallow_limited_stargifts && !disallowedGiftsSettings2.disallow_premium_gifts) {
            return LocaleController.getString(R.string.PrivacyValueGiftsOnlyPremium);
        }
        if (i == 12 && globalPrivacySettings != null && (disallowedGiftsSettings = globalPrivacySettings.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_premium_gifts) {
            return LocaleController.getString(R.string.PrivacyValueGiftsNone);
        }
        if (b == 0 || (b == -1 && size2 > 0)) {
            if (i == 3) {
                return size2 == 0 ? LocaleController.getString(R.string.P2PEverybody) : LocaleController.formatString(R.string.P2PEverybodyMinus, Integer.valueOf(size2));
            }
            if (i != 12) {
                return size2 == 0 ? LocaleController.getString(R.string.LastSeenEverybody) : LocaleController.formatString(R.string.LastSeenEverybodyMinus, Integer.valueOf(size2));
            }
            if (size2 == 0) {
                return LocaleController.getString((bool2 == null || bool2.booleanValue()) ? R.string.LastSeenEverybody : R.string.PrivacyValueEveryoneExceptBots);
            }
            return LocaleController.formatString((bool2 == null || bool2.booleanValue()) ? R.string.LastSeenEverybodyMinus : R.string.PrivacyValueEveryoneExceptBotsMinus, Integer.valueOf(size2));
        }
        if (b != 2 && (b != -1 || size2 <= 0 || size <= 0)) {
            if (b != 1 && size <= 0) {
                return (bool2 == null || !bool2.booleanValue()) ? "unknown" : LocaleController.getString(R.string.PrivacyValueOnlyBots);
            }
            if (i == 3) {
                return size == 0 ? LocaleController.getString(R.string.P2PNobody) : LocaleController.formatString(R.string.P2PNobodyPlus, Integer.valueOf(size));
            }
            if (size != 0) {
                return LocaleController.formatString(z ? R.string.LastSeenNobodyPremiumPlus : R.string.LastSeenNobodyPlus, Integer.valueOf(size));
            }
            if (z) {
                return LocaleController.getString(R.string.LastSeenNobodyPremium);
            }
            return (bool2 == null || !bool2.booleanValue()) ? LocaleController.getString(R.string.LastSeenNobody) : LocaleController.getString(R.string.PrivacyValueOnlyBots);
        }
        if (i == 3) {
            if (size == 0 && size2 == 0) {
                return LocaleController.getString("P2PContacts", R.string.P2PContacts);
            }
            if (size == 0 || size2 == 0) {
                return size2 != 0 ? LocaleController.formatString(R.string.P2PContactsMinus, Integer.valueOf(size2)) : LocaleController.formatString(R.string.P2PContactsPlus, Integer.valueOf(size));
            }
            return LocaleController.formatString(R.string.P2PContactsMinusPlus, Integer.valueOf(size2), Integer.valueOf(size));
        }
        if (size == 0 && size2 == 0) {
            if (z) {
                return LocaleController.getString(R.string.LastSeenContactsPremium);
            }
            return (bool2 == null || !bool2.booleanValue()) ? LocaleController.getString(R.string.LastSeenContacts) : LocaleController.getString(R.string.PrivacyContactsAndBotUsers);
        }
        if (size != 0 && size2 != 0) {
            return LocaleController.formatString((bool2 == null || !bool2.booleanValue()) ? z ? R.string.LastSeenContactsPremiumMinusPlus : R.string.LastSeenContactsMinusPlus : R.string.PrivacyContactsAndBotUsersMinusPlus, Integer.valueOf(size2), Integer.valueOf(size));
        }
        if (size2 != 0) {
            return LocaleController.formatString((bool2 == null || !bool2.booleanValue()) ? z ? R.string.LastSeenContactsPremiumMinus : R.string.LastSeenContactsMinus : R.string.PrivacyContactsAndBotUsersMinus, Integer.valueOf(size2));
        }
        return LocaleController.formatString((bool2 == null || !bool2.booleanValue()) ? z ? R.string.LastSeenContactsPremiumPlus : R.string.LastSeenContactsPlus : R.string.PrivacyContactsAndBotUsersPlus, Integer.valueOf(size));
    }

    private void initPassword() {
        TwoStepVerificationActivity.initPasswordNewAlgo(this.currentPassword);
        if (!getUserConfig().hasSecureData && this.currentPassword.has_secure_values) {
            getUserConfig().hasSecureData = true;
            getUserConfig().saveConfig(false);
            updateRows();
            return;
        }
        TL_account.Password password = this.currentPassword;
        if (password != null) {
            int i = this.emailLoginRow;
            String str = password.login_email_pattern;
            boolean z = str != null && i == -1;
            boolean z2 = str == null && i != -1;
            if (z || z2) {
                updateRows(false);
                ListAdapter listAdapter = this.listAdapter;
                if (listAdapter != null) {
                    if (z) {
                        listAdapter.notifyItemInserted(this.emailLoginRow);
                    } else {
                        listAdapter.notifyItemRemoved(i);
                    }
                }
            }
        }
        ListAdapter listAdapter2 = this.listAdapter;
        if (listAdapter2 != null) {
            listAdapter2.lambda$onBindViewHolder$31(this.passwordRow);
        }
    }

    public void lambda$createView$10(AlertDialog alertDialog, int i) {
        AlertDialog alertDialogShow = new AlertDialog.Builder(getParentActivity(), 3, null).show();
        this.progressDialog = alertDialogShow;
        alertDialogShow.canCacnel = false;
        if (this.currentSync != this.newSync) {
            UserConfig userConfig = getUserConfig();
            boolean z = this.newSync;
            userConfig.syncContacts = z;
            this.currentSync = z;
            getUserConfig().saveConfig(false);
        }
        getContactsController().deleteAllContacts(new PrivacySettingsActivity$$ExternalSyntheticLambda1(this, 0));
    }

    public void lambda$createView$11(TextCheckCell textCheckCell) {
        boolean z = !this.newSuggest;
        this.newSuggest = z;
        textCheckCell.setChecked(z);
    }

    public void lambda$createView$12(TextCheckCell textCheckCell, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda5(9, this, textCheckCell));
    }

    public void lambda$createView$13(TextCheckCell textCheckCell, AlertDialog alertDialog, int i) {
        TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
        boolean[] zArr = this.clear;
        tL_payments_clearSavedInfo.credentials = zArr[1];
        tL_payments_clearSavedInfo.info = zArr[0];
        getUserConfig().tmpPassword = null;
        getUserConfig().saveConfig(false);
        getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new LinkManager$$ExternalSyntheticLambda15(13, this, textCheckCell));
    }

    public void lambda$createView$14() {
        this.listAdapter.notifyDataSetChanged();
        this.secretMapUpdate = true;
    }

    public void lambda$createView$15(View view) {
        CheckBoxCell checkBoxCell = (CheckBoxCell) view;
        int iIntValue = ((Integer) checkBoxCell.getTag()).intValue();
        boolean[] zArr = this.clear;
        boolean z = !zArr[iIntValue];
        zArr[iIntValue] = z;
        checkBoxCell.setChecked(z, true);
    }

    public static void lambda$createView$16(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public void lambda$createView$17(AlertDialog alertDialog, int i) {
        String string;
        TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
        boolean[] zArr = this.clear;
        tL_payments_clearSavedInfo.credentials = zArr[1];
        tL_payments_clearSavedInfo.info = zArr[0];
        getUserConfig().tmpPassword = null;
        getUserConfig().saveConfig(false);
        getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new PassportActivity$$ExternalSyntheticLambda3(20));
        boolean[] zArr2 = this.clear;
        boolean z = zArr2[0];
        if (z && zArr2[1]) {
            string = LocaleController.getString("PrivacyPaymentsPaymentShippingCleared", R.string.PrivacyPaymentsPaymentShippingCleared);
        } else if (z) {
            string = LocaleController.getString("PrivacyPaymentsShippingInfoCleared", R.string.PrivacyPaymentsShippingInfoCleared);
        } else if (!zArr2[1]) {
            return;
        } else {
            string = LocaleController.getString("PrivacyPaymentsPaymentInfoCleared", R.string.PrivacyPaymentsPaymentInfoCleared);
        }
        BulletinFactory.of(this).createSimpleBulletin(R.raw.chats_infotip, string).show();
    }

    public void lambda$createView$18(AlertDialog alertDialog, int i) {
        try {
            Dialog dialog = this.visibleDialog;
            if (dialog != null) {
                dialog.dismiss();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setTitle(LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle));
        builder.setMessage(LocaleController.getString("PrivacyPaymentsClearAlert", R.string.PrivacyPaymentsClearAlert));
        builder.setPositiveButton(LocaleController.getString("ClearButton", R.string.ClearButton), new PrivacySettingsActivity$$ExternalSyntheticLambda7(this, 2));
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        showDialog(builder.create());
        AlertDialog alertDialogCreate = builder.create();
        showDialog(alertDialogCreate);
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public void lambda$createView$19(Context context, View view, int i) {
        String str;
        if (view.isEnabled()) {
            if (i == this.autoDeleteMesages) {
                if (getUserConfig().getGlobalTTl() >= 0) {
                    presentFragment(new AutoDeleteMessagesActivity());
                    return;
                }
                return;
            }
            if (i == this.blockedRow) {
                presentFragment(new PrivacyUsersActivity());
                return;
            }
            if (i == this.sessionsRow) {
                this.devicesActivityPreload.resetFragment();
                presentFragment(this.devicesActivityPreload);
                return;
            }
            if (i == this.webSessionsRow) {
                this.webSessionsActivityPreload.resetFragment();
                presentFragment(this.webSessionsActivityPreload);
                return;
            }
            int i2 = 4;
            if (i == this.deleteAccountRow) {
                if (getParentActivity() == null) {
                    return;
                }
                int deleteAccountTTL = getContactsController().getDeleteAccountTTL();
                if (deleteAccountTTL <= 31) {
                    i2 = 0;
                } else if (deleteAccountTTL <= 93) {
                    i2 = 1;
                } else if (deleteAccountTTL <= 182) {
                    i2 = 2;
                } else if (deleteAccountTTL != 548) {
                    i2 = deleteAccountTTL == 730 ? 5 : 3;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                builder.setTitle(LocaleController.getString("DeleteAccountTitle", R.string.DeleteAccountTitle));
                String[] strArr = {LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.formatPluralString("Months", 3, new Object[0]), LocaleController.formatPluralString("Months", 6, new Object[0]), LocaleController.formatPluralString("Months", 12, new Object[0]), LocaleController.formatPluralString("Months", 18, new Object[0]), LocaleController.formatPluralString("Months", 24, new Object[0])};
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(1);
                builder.setView(linearLayout);
                int i3 = 0;
                while (i3 < 6) {
                    RadioColorCell radioColorCell = new RadioColorCell(getParentActivity(), null);
                    radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    radioColorCell.setTag(Integer.valueOf(i3));
                    radioColorCell.radioButton.setColor(Theme.getColor(null, Theme.key_radioBackground, false), Theme.getColor(null, Theme.key_dialogRadioBackgroundChecked, false));
                    radioColorCell.setTextAndValue(strArr[i3], i2 == i3);
                    linearLayout.addView(radioColorCell);
                    radioColorCell.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda91(20, this, builder));
                    i3++;
                }
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                showDialog(builder.create());
                return;
            }
            if (i == this.lastSeenRow) {
                presentFragment(new PrivacyControlActivity(0));
                return;
            }
            if (i == this.phoneNumberRow) {
                presentFragment(new PrivacyControlActivity(6));
                return;
            }
            if (i == this.groupsRow) {
                presentFragment(new PrivacyControlActivity(1));
                return;
            }
            if (i == this.callsRow) {
                presentFragment(new PrivacyControlActivity(2));
                return;
            }
            if (i == this.profilePhotoRow) {
                presentFragment(new PrivacyControlActivity(4));
                return;
            }
            if (i == this.bioRow) {
                presentFragment(new PrivacyControlActivity(9));
                return;
            }
            if (i == this.musicRow) {
                presentFragment(new PrivacyControlActivity(14));
                return;
            }
            if (i == this.birthdayRow) {
                presentFragment(new PrivacyControlActivity(11));
                return;
            }
            if (i == this.giftsRow) {
                presentFragment(new PrivacyControlActivity(12));
                return;
            }
            if (i == this.forwardsRow) {
                presentFragment(new PrivacyControlActivity(5));
                return;
            }
            if (i == this.voicesRow) {
                presentFragment(new PrivacyControlActivity(8));
                return;
            }
            if (i == this.noncontactsRow) {
                presentFragment(new PrivacyControlActivity(10));
                return;
            }
            if (i == this.emailLoginRow) {
                TL_account.Password password = this.currentPassword;
                if (password == null || (str = password.login_email_pattern) == null) {
                    return;
                }
                SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(str);
                int iIndexOf = this.currentPassword.login_email_pattern.indexOf(42);
                int iLastIndexOf = this.currentPassword.login_email_pattern.lastIndexOf(42);
                if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                    TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                    textStyleRun.flags |= 256;
                    textStyleRun.start = iIndexOf;
                    int i4 = iLastIndexOf + 1;
                    textStyleRun.end = i4;
                    spannableStringBuilderValueOf.setSpan(new TextStyleSpan(textStyleRun), iIndexOf, i4, 0);
                }
                new AlertDialog.Builder(context, 0, null).setTitle(spannableStringBuilderValueOf).setMessage(LocaleController.getString(R.string.EmailLoginChangeMessage)).setPositiveButton(LocaleController.getString(R.string.ChangeEmail), new PrivacySettingsActivity$$ExternalSyntheticLambda7(this, 0)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
                return;
            }
            if (i == this.passwordRow) {
                TL_account.Password password2 = this.currentPassword;
                if (password2 == null) {
                    return;
                }
                if (!TwoStepVerificationActivity.canHandleCurrentPassword(password2, false)) {
                    AlertsCreator.showUpdateAppAlert(getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                }
                TL_account.Password password3 = this.currentPassword;
                if (!password3.has_password) {
                    presentFragment(new TwoStepVerificationSetupActivity(TextUtils.isEmpty(password3.email_unconfirmed_pattern) ? 6 : 5, this.currentPassword));
                    return;
                }
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                twoStepVerificationActivity.setPassword(this.currentPassword);
                presentFragment(twoStepVerificationActivity);
                return;
            }
            if (i == this.passkeysRow) {
                if (Build.VERSION.SDK_INT < 28 || !BuildVars.SUPPORTS_PASSKEYS) {
                    return;
                }
                ArrayList<TL_account.Passkey> arrayList = this.currentPasskeys;
                if (arrayList == null || arrayList.size() <= 0) {
                    PasskeysActivity.showLearnSheet(context, this.currentAccount, this.resourceProvider, true);
                    return;
                } else {
                    presentFragment(new PasskeysActivity(this.currentPasskeys));
                    return;
                }
            }
            if (i == this.passcodeRow) {
                presentFragment(PasscodeActivity.determineOpenFragment());
                return;
            }
            if (i == this.secretWebpageRow) {
                if (getMessagesController().secretWebpagePreview == 1) {
                    getMessagesController().secretWebpagePreview = 0;
                } else {
                    getMessagesController().secretWebpagePreview = 1;
                }
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", getMessagesController().secretWebpagePreview).commit();
                if (view instanceof TextCheckCell) {
                    ((TextCheckCell) view).setChecked(getMessagesController().secretWebpagePreview == 1);
                    return;
                }
                return;
            }
            if (i == this.contactsDeleteRow) {
                if (getParentActivity() == null) {
                    return;
                }
                AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity(), 0, null);
                builder2.setTitle(LocaleController.getString("SyncContactsDeleteTitle", R.string.SyncContactsDeleteTitle));
                builder2.setMessage(AndroidUtilities.replaceTags(LocaleController.getString("SyncContactsDeleteText", R.string.SyncContactsDeleteText)));
                builder2.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                builder2.setPositiveButton(LocaleController.getString("Delete", R.string.Delete), new PrivacySettingsActivity$$ExternalSyntheticLambda7(this, 5));
                AlertDialog alertDialogCreate = builder2.create();
                showDialog(alertDialogCreate);
                TextView textView = (TextView) alertDialogCreate.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                    return;
                }
                return;
            }
            if (i == this.contactsSuggestRow) {
                TextCheckCell textCheckCell = (TextCheckCell) view;
                if (!this.newSuggest) {
                    this.newSuggest = true;
                    textCheckCell.setChecked(true);
                    return;
                }
                AlertDialog.Builder builder3 = new AlertDialog.Builder(getParentActivity(), 0, null);
                builder3.setTitle(LocaleController.getString("SuggestContactsTitle", R.string.SuggestContactsTitle));
                builder3.setMessage(LocaleController.getString("SuggestContactsAlert", R.string.SuggestContactsAlert));
                builder3.setPositiveButton(LocaleController.getString("MuteDisable", R.string.MuteDisable), new TodoItemMenu$$ExternalSyntheticLambda7(11, this, textCheckCell));
                builder3.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                AlertDialog alertDialogCreate2 = builder3.create();
                showDialog(alertDialogCreate2);
                TextView textView2 = (TextView) alertDialogCreate2.getButton(-1);
                if (textView2 != null) {
                    textView2.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                    return;
                }
                return;
            }
            if (i == this.newChatsRow) {
                boolean z = !this.archiveChats;
                this.archiveChats = z;
                ((TextCheckCell) view).setChecked(z);
                return;
            }
            if (i == this.contactsSyncRow) {
                boolean z2 = !this.newSync;
                this.newSync = z2;
                if (view instanceof TextCheckCell) {
                    ((TextCheckCell) view).setChecked(z2);
                    return;
                }
                return;
            }
            if (i == this.secretMapRow) {
                AlertsCreator.showSecretLocationAlert(getParentActivity(), this.currentAccount, new PrivacySettingsActivity$$ExternalSyntheticLambda1(this, 1), false, null);
                return;
            }
            if (i != this.paymentsClearRow) {
                if (i == this.passportRow) {
                    presentFragment(new PassportActivity(5, 0L, "", "", (String) null, (String) null, (String) null, (TL_account.authorizationForm) null, (TL_account.Password) null));
                    return;
                } else {
                    if (i == this.botsBiometryRow) {
                        presentFragment(new BotBiometrySettings());
                        return;
                    }
                    return;
                }
            }
            AlertDialog.Builder builder4 = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder4.setTitle(LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle));
            builder4.setMessage(LocaleController.getString("PrivacyPaymentsClearAlertText", R.string.PrivacyPaymentsClearAlertText));
            LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
            linearLayout2.setOrientation(1);
            builder4.setView(linearLayout2);
            int i5 = 0;
            while (i5 < 2) {
                String string = i5 == 0 ? LocaleController.getString("PrivacyClearShipping", R.string.PrivacyClearShipping) : LocaleController.getString("PrivacyClearPayment", R.string.PrivacyClearPayment);
                this.clear[i5] = true;
                CheckBoxCell checkBoxCell = new CheckBoxCell(getParentActivity(), 1, 21, false, null);
                checkBoxCell.setTag(Integer.valueOf(i5));
                checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                checkBoxCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                linearLayout2.addView(checkBoxCell, LayoutHelper.createLinear(-1, 50));
                checkBoxCell.setText(string, null, true, false, false);
                checkBoxCell.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
                checkBoxCell.setOnClickListener(new PollItemMenu$$ExternalSyntheticLambda14(this, 3));
                i5++;
            }
            builder4.setPositiveButton(LocaleController.getString("ClearButton", R.string.ClearButton), new PrivacySettingsActivity$$ExternalSyntheticLambda7(this, 1));
            builder4.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            showDialog(builder4.create());
            AlertDialog alertDialogCreate3 = builder4.create();
            showDialog(alertDialogCreate3);
            TextView textView3 = (TextView) alertDialogCreate3.getButton(-1);
            if (textView3 != null) {
                textView3.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            }
        }
    }

    public void lambda$createView$20(ArrayList arrayList) {
        this.biometryBots.clear();
        this.biometryBots.addAll(arrayList);
        updateRows(true);
    }

    public void lambda$createView$4(AlertDialog alertDialog, TLObject tLObject, TL_account.setAccountTTL setaccountttl) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            this.deleteAccountUpdate = true;
            getContactsController().setDeleteAccountTTL(setaccountttl.ttl.days);
            this.listAdapter.notifyDataSetChanged();
        }
    }

    public void lambda$createView$5(AlertDialog alertDialog, TL_account.setAccountTTL setaccountttl, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda23(17, this, alertDialog, tLObject, setaccountttl));
    }

    public void lambda$createView$6(AlertDialog.Builder builder, View view) {
        int i;
        builder.getDismissRunnable().run();
        Integer num = (Integer) view.getTag();
        if (num.intValue() == 0) {
            i = 30;
        } else if (num.intValue() == 1) {
            i = 90;
        } else if (num.intValue() == 2) {
            i = 182;
        } else if (num.intValue() == 3) {
            i = 365;
        } else if (num.intValue() == 4) {
            i = 548;
        } else {
            i = num.intValue() == 5 ? 730 : 0;
        }
        AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3, null);
        alertDialog.canCacnel = false;
        alertDialog.show();
        TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
        TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
        setaccountttl.ttl = tL_accountDaysTTL;
        tL_accountDaysTTL.days = i;
        getConnectionsManager().sendRequest(setaccountttl, new ProfileActivity$$ExternalSyntheticLambda2(this, alertDialog, setaccountttl, 5));
    }

    public void lambda$createView$7() {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), null);
        lottieLayout.setAnimation(R.raw.email_check_inbox, new String[0]);
        lottieLayout.textView.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        Bulletin.make(this, lottieLayout, 1500).show();
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        loadPasswordSettings();
    }

    public void lambda$createView$8(AlertDialog alertDialog, int i) {
        presentFragment(new LoginActivity().changeEmail(new PrivacySettingsActivity$$ExternalSyntheticLambda1(this, 2)));
    }

    public void lambda$createView$9() {
        this.progressDialog.dismiss();
    }

    public void lambda$loadPasskeys$23(TL_account.Passkeys passkeys, TLRPC.TL_error tL_error) {
        if (passkeys != null) {
            this.currentPasskeys = passkeys.passkeys;
            updateRows();
        }
    }

    public void lambda$loadPasswordSettings$21(TL_account.Password password) {
        this.currentPassword = password;
        initPassword();
    }

    public void lambda$loadPasswordSettings$22(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda5(8, this, (TL_account.Password) tLObject));
        }
    }

    public void lambda$onFragmentCreate$0() {
        int i;
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter == null || (i = this.sessionsRow) < 0) {
            return;
        }
        listAdapter.lambda$onBindViewHolder$31(i);
    }

    public void lambda$onFragmentCreate$1() {
        if (this.listAdapter != null) {
            int sessionsCount = this.webSessionsActivityPreload.getSessionsCount();
            if (this.webSessionsRow >= 0 || sessionsCount <= 0) {
                return;
            }
            updateRows();
        }
    }

    public static void lambda$onFragmentDestroy$2(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void lambda$onFragmentDestroy$3(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    private void loadPasskeys() {
        getConnectionsManager().sendRequestTyped(new TL_account.getPasskeys(), new AiTonesController$$ExternalSyntheticLambda0(), new LinkManager$$ExternalSyntheticLambda6(this, 18));
    }

    private void loadPasswordSettings() {
        getConnectionsManager().sendRequest(new TL_account.getPassword(), new LinkManager$$ExternalSyntheticLambda10(this, 20), 10);
    }

    private void updateRows() {
        updateRows(true);
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacySettings));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    PrivacySettingsActivity.this.finishFragment();
                }
            }
        });
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isRightLayout) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, i, false) {
            {
                super(i, z);
            }

            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        };
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setLayoutAnimation(null);
        this.listView.lambda$onCellEnter$52(null);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda5(12, this, context));
        BotBiometry.getBots(getContext(), this.currentAccount, new PollItemMenu$$ExternalSyntheticLambda15(this, 18));
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        ListAdapter listAdapter;
        if (i == NotificationCenter.privacyRulesUpdated) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
            if (globalPrivacySettings != null) {
                this.archiveChats = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                this.noncontactsValue = globalPrivacySettings.new_noncontact_peers_require_premium;
                this.feeValue = (globalPrivacySettings.flags & 32) != 0;
            }
            ListAdapter listAdapter2 = this.listAdapter;
            if (listAdapter2 != null) {
                listAdapter2.notifyDataSetChanged();
            }
        } else if (i == NotificationCenter.blockedUsersDidLoad) {
            this.listAdapter.lambda$onBindViewHolder$31(this.blockedRow);
        } else if (i == NotificationCenter.didSetOrRemoveTwoStepPassword) {
            if (objArr.length > 0) {
                this.currentPassword = (TL_account.Password) objArr[0];
                ListAdapter listAdapter3 = this.listAdapter;
                if (listAdapter3 != null) {
                    listAdapter3.lambda$onBindViewHolder$31(this.passwordRow);
                }
            } else {
                this.currentPassword = null;
                loadPasswordSettings();
                updateRows();
            }
        }
        if (i != NotificationCenter.didUpdateGlobalAutoDeleteTimer || (listAdapter = this.listAdapter) == null) {
            return;
        }
        listAdapter.lambda$onBindViewHolder$31(this.autoDeleteMesages);
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{TextSettingsCell.class, HeaderCell.class, TextCheckCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        int i = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrack));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrackChecked));
        return arrayList;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        getContactsController().loadPrivacySettings();
        getMessagesController().getBlockedPeers(true);
        boolean z = getUserConfig().syncContacts;
        this.newSync = z;
        this.currentSync = z;
        boolean z2 = getUserConfig().suggestContacts;
        this.newSuggest = z2;
        this.currentSuggest = z2;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
        if (globalPrivacySettings != null) {
            this.archiveChats = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
            this.noncontactsValue = globalPrivacySettings.new_noncontact_peers_require_premium;
            this.feeValue = (globalPrivacySettings.flags & 32) != 0;
        }
        updateRows();
        loadPasswordSettings();
        loadPasskeys();
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.blockedUsersDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        getNotificationCenter().addObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
        getUserConfig().loadGlobalTTl();
        SessionsActivity sessionsActivity = new SessionsActivity(0);
        this.devicesActivityPreload = sessionsActivity;
        sessionsActivity.setDelegate(new PrivacySettingsActivity$$ExternalSyntheticLambda7(this, 3));
        this.devicesActivityPreload.lambda$loadSessions$24(false);
        SessionsActivity sessionsActivity2 = new SessionsActivity(1);
        this.webSessionsActivityPreload = sessionsActivity2;
        sessionsActivity2.setDelegate(new PrivacySettingsActivity$$ExternalSyntheticLambda7(this, 4));
        this.webSessionsActivityPreload.lambda$loadSessions$24(false);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        boolean z;
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        getNotificationCenter().removeObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
        boolean z2 = true;
        if (this.currentSync != this.newSync) {
            UserConfig userConfig = getUserConfig();
            boolean z3 = this.newSync;
            userConfig.syncContacts = z3;
            if (z3 && ContactsController.hasContactsPermission()) {
                getContactsController().forceImportContacts();
                if (getParentActivity() != null) {
                    Toast.makeText(getParentActivity(), LocaleController.getString("SyncContactsAdded", R.string.SyncContactsAdded), 0).show();
                }
            }
            z = true;
        } else {
            z = false;
        }
        boolean z4 = this.newSuggest;
        if (z4 != this.currentSuggest) {
            if (!z4) {
                getMediaDataController().clearTopPeers();
            }
            getUserConfig().suggestContacts = this.newSuggest;
            TLRPC.TL_contacts_toggleTopPeers tL_contacts_toggleTopPeers = new TLRPC.TL_contacts_toggleTopPeers();
            tL_contacts_toggleTopPeers.enabled = this.newSuggest;
            getConnectionsManager().sendRequest(tL_contacts_toggleTopPeers, new PassportActivity$$ExternalSyntheticLambda3(21));
            z = true;
        }
        TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
        if (globalPrivacySettings != null) {
            boolean z5 = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
            boolean z6 = this.archiveChats;
            if (z5 != z6) {
                globalPrivacySettings.archive_and_mute_new_noncontact_peers = z6;
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
                TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().getGlobalPrivacySettings();
                setglobalprivacysettings.settings = globalPrivacySettings2;
                if (globalPrivacySettings2 == null) {
                    setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
                }
                setglobalprivacysettings.settings.archive_and_mute_new_noncontact_peers = this.archiveChats;
                getConnectionsManager().sendRequest(setglobalprivacysettings, new PassportActivity$$ExternalSyntheticLambda3(22));
            } else {
                z2 = z;
            }
        } else {
            z2 = z;
        }
        if (z2) {
            getUserConfig().saveConfig(false);
        }
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    public PrivacySettingsActivity setCurrentPassword(TL_account.Password password) {
        this.currentPassword = password;
        if (password != null) {
            initPassword();
        }
        return this;
    }

    public void updateRows(boolean z) {
        this.passkeysRow = -1;
        this.securitySectionRow = 0;
        this.passwordRow = 1;
        this.autoDeleteMesages = 2;
        this.rowCount = 4;
        this.passcodeRow = 3;
        if (getMessagesController().config.settingsDisplayPasskeys.get() && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS) {
            int i = this.rowCount;
            this.rowCount = i + 1;
            this.passkeysRow = i;
        }
        TL_account.Password password = this.currentPassword;
        if (password == null ? !SharedConfig.hasEmailLogin : password.login_email_pattern == null) {
            this.emailLoginRow = -1;
        } else {
            int i2 = this.rowCount;
            this.rowCount = i2 + 1;
            this.emailLoginRow = i2;
        }
        int i3 = this.rowCount;
        this.rowCount = i3 + 1;
        this.blockedRow = i3;
        if (password != null) {
            boolean z2 = password.login_email_pattern != null;
            if (SharedConfig.hasEmailLogin != z2) {
                SharedConfig.hasEmailLogin = z2;
                SharedConfig.saveConfig();
            }
        }
        int i4 = this.rowCount;
        this.sessionsRow = i4;
        this.sessionsDetailRow = i4 + 1;
        this.privacySectionRow = i4 + 2;
        this.phoneNumberRow = i4 + 3;
        this.lastSeenRow = i4 + 4;
        this.profilePhotoRow = i4 + 5;
        this.forwardsRow = i4 + 6;
        this.rowCount = i4 + 8;
        this.callsRow = i4 + 7;
        this.groupsDetailRow = -1;
        if (!getMessagesController().premiumFeaturesBlocked() || getUserConfig().isPremium()) {
            int i5 = this.rowCount;
            this.voicesRow = i5;
            this.rowCount = i5 + 2;
            this.noncontactsRow = i5 + 1;
        } else {
            this.voicesRow = -1;
            this.noncontactsRow = -1;
        }
        int i6 = this.rowCount;
        this.birthdayRow = i6;
        this.giftsRow = i6 + 1;
        this.bioRow = i6 + 2;
        this.musicRow = i6 + 3;
        this.groupsRow = i6 + 4;
        this.rowCount = i6 + 6;
        this.privacyShadowRow = i6 + 5;
        if (getMessagesController().autoarchiveAvailable || getUserConfig().isPremium()) {
            int i7 = this.rowCount;
            this.newChatsHeaderRow = i7;
            this.newChatsRow = i7 + 1;
            this.rowCount = i7 + 3;
            this.newChatsSectionRow = i7 + 2;
        } else {
            this.newChatsHeaderRow = -1;
            this.newChatsRow = -1;
            this.newChatsSectionRow = -1;
        }
        int i8 = this.rowCount;
        this.advancedSectionRow = i8;
        this.deleteAccountRow = i8 + 1;
        this.deleteAccountDetailRow = i8 + 2;
        this.rowCount = i8 + 4;
        this.botsSectionRow = i8 + 3;
        if (getUserConfig().hasSecureData) {
            int i9 = this.rowCount;
            this.rowCount = i9 + 1;
            this.passportRow = i9;
        } else {
            this.passportRow = -1;
        }
        int i10 = this.rowCount;
        this.rowCount = i10 + 1;
        this.paymentsClearRow = i10;
        if (this.biometryBots.isEmpty()) {
            this.botsBiometryRow = -1;
        } else {
            int i11 = this.rowCount;
            this.rowCount = i11 + 1;
            this.botsBiometryRow = i11;
        }
        SessionsActivity sessionsActivity = this.webSessionsActivityPreload;
        if (sessionsActivity == null || sessionsActivity.getSessionsCount() <= 0) {
            this.webSessionsRow = -1;
            this.botsDetailRow = -1;
            int i12 = this.rowCount;
            this.rowCount = i12 + 1;
            this.botsAndWebsitesShadowRow = i12;
        } else {
            int i13 = this.rowCount;
            this.webSessionsRow = i13;
            this.rowCount = i13 + 2;
            this.botsDetailRow = i13 + 1;
            this.botsAndWebsitesShadowRow = -1;
        }
        int i14 = this.rowCount;
        this.contactsSectionRow = i14;
        this.contactsDeleteRow = i14 + 1;
        this.contactsSyncRow = i14 + 2;
        this.contactsSuggestRow = i14 + 3;
        this.contactsDetailRow = i14 + 4;
        this.secretSectionRow = i14 + 5;
        this.secretMapRow = i14 + 6;
        this.secretWebpageRow = i14 + 7;
        this.rowCount = i14 + 9;
        this.secretDetailRow = i14 + 8;
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter == null || !z) {
            return;
        }
        listAdapter.notifyDataSetChanged();
    }
}
