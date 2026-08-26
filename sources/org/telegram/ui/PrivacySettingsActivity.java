package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
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
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.SimpleTextView;
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
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.bots.BotBiometry;
import org.telegram.ui.bots.BotBiometrySettings;

public final class PrivacySettingsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public int advancedSectionRow;
    public boolean archiveChats;
    public int autoDeleteMesages;
    public int bioRow;
    public final ArrayList biometryBots;
    public int birthdayRow;
    public int blockedRow;
    public int botsAndWebsitesShadowRow;
    public int botsBiometryRow;
    public int botsDetailRow;
    public int botsSectionRow;
    public int callsRow;
    public final boolean[] clear;
    public int contactsDeleteRow;
    public int contactsDetailRow;
    public int contactsSectionRow;
    public int contactsSuggestRow;
    public int contactsSyncRow;
    public ArrayList currentPasskeys;
    public TL_account.Password currentPassword;
    public boolean currentSuggest;
    public boolean currentSync;
    public int deleteAccountDetailRow;
    public int deleteAccountRow;
    public boolean deleteAccountUpdate;
    public SessionsActivity devicesActivityPreload;
    public int emailLoginRow;
    public boolean feeValue;
    public int forwardsRow;
    public int giftsRow;
    public int groupsDetailRow;
    public int groupsRow;
    public int lastSeenRow;
    public ListAdapter listAdapter;
    public RecyclerListView listView;
    public int musicRow;
    public int newChatsHeaderRow;
    public int newChatsRow;
    public int newChatsSectionRow;
    public boolean newSuggest;
    public boolean newSync;
    public int noncontactsRow;
    public boolean noncontactsValue;
    public int passcodeRow;
    public int passkeysRow;
    public int passportRow;
    public int passwordRow;
    public int paymentsClearRow;
    public int phoneNumberRow;
    public SpannableString premiumStar;
    public int privacySectionRow;
    public int privacyShadowRow;
    public int profilePhotoRow;
    public AlertDialog progressDialog;
    public int rowCount;
    public int secretDetailRow;
    public int secretMapRow;
    public boolean secretMapUpdate;
    public int secretSectionRow;
    public int secretWebpageRow;
    public int sessionsDetailRow;
    public int sessionsRow;
    public int voicesRow;
    public SessionsActivity webSessionsActivityPreload;
    public int webSessionsRow;

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return PrivacySettingsActivity.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            PrivacySettingsActivity privacySettingsActivity = PrivacySettingsActivity.this;
            if (i == privacySettingsActivity.passportRow || i == privacySettingsActivity.lastSeenRow || i == privacySettingsActivity.phoneNumberRow || i == privacySettingsActivity.deleteAccountRow || i == privacySettingsActivity.webSessionsRow || i == privacySettingsActivity.groupsRow || i == privacySettingsActivity.paymentsClearRow || i == privacySettingsActivity.secretMapRow || i == privacySettingsActivity.contactsDeleteRow || i == privacySettingsActivity.botsBiometryRow) {
                return 0;
            }
            if (i == privacySettingsActivity.privacyShadowRow || i == privacySettingsActivity.deleteAccountDetailRow || i == privacySettingsActivity.groupsDetailRow || i == privacySettingsActivity.sessionsDetailRow || i == privacySettingsActivity.secretDetailRow || i == privacySettingsActivity.botsDetailRow || i == privacySettingsActivity.contactsDetailRow || i == privacySettingsActivity.newChatsSectionRow) {
                return 1;
            }
            if (i == 0 || i == privacySettingsActivity.advancedSectionRow || i == privacySettingsActivity.privacySectionRow || i == privacySettingsActivity.secretSectionRow || i == privacySettingsActivity.botsSectionRow || i == privacySettingsActivity.contactsSectionRow || i == privacySettingsActivity.newChatsHeaderRow) {
                return 2;
            }
            if (i == privacySettingsActivity.secretWebpageRow || i == privacySettingsActivity.contactsSyncRow || i == privacySettingsActivity.contactsSuggestRow || i == privacySettingsActivity.newChatsRow) {
                return 3;
            }
            if (i == privacySettingsActivity.botsAndWebsitesShadowRow) {
                return 4;
            }
            return (i == privacySettingsActivity.autoDeleteMesages || i == privacySettingsActivity.sessionsRow || i == privacySettingsActivity.emailLoginRow || i == privacySettingsActivity.passwordRow || i == privacySettingsActivity.passkeysRow || i == privacySettingsActivity.passcodeRow || i == privacySettingsActivity.blockedRow) ? 5 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            PrivacySettingsActivity privacySettingsActivity = PrivacySettingsActivity.this;
            return adapterPosition == privacySettingsActivity.passcodeRow || adapterPosition == privacySettingsActivity.passwordRow || adapterPosition == privacySettingsActivity.passkeysRow || adapterPosition == privacySettingsActivity.blockedRow || adapterPosition == privacySettingsActivity.sessionsRow || adapterPosition == privacySettingsActivity.secretWebpageRow || adapterPosition == privacySettingsActivity.webSessionsRow || (adapterPosition == privacySettingsActivity.groupsRow && !privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(1)) || ((adapterPosition == privacySettingsActivity.lastSeenRow && !privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(0)) || ((adapterPosition == privacySettingsActivity.callsRow && !privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(2)) || ((adapterPosition == privacySettingsActivity.profilePhotoRow && !privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(4)) || ((adapterPosition == privacySettingsActivity.bioRow && !privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(9)) || ((adapterPosition == privacySettingsActivity.musicRow && !privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(14)) || ((adapterPosition == privacySettingsActivity.birthdayRow && !privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(11)) || ((adapterPosition == privacySettingsActivity.giftsRow && !privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(12)) || ((adapterPosition == privacySettingsActivity.forwardsRow && !privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(5)) || ((adapterPosition == privacySettingsActivity.phoneNumberRow && !privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(6)) || ((adapterPosition == privacySettingsActivity.voicesRow && !privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(8)) || adapterPosition == privacySettingsActivity.noncontactsRow || ((adapterPosition == privacySettingsActivity.deleteAccountRow && !privacySettingsActivity.getContactsController().getLoadingDeleteInfo()) || ((adapterPosition == privacySettingsActivity.newChatsRow && !privacySettingsActivity.getContactsController().getLoadingGlobalSettings()) || adapterPosition == privacySettingsActivity.emailLoginRow || adapterPosition == privacySettingsActivity.paymentsClearRow || adapterPosition == privacySettingsActivity.secretMapRow || adapterPosition == privacySettingsActivity.contactsSyncRow || adapterPosition == privacySettingsActivity.passportRow || adapterPosition == privacySettingsActivity.contactsDeleteRow || adapterPosition == privacySettingsActivity.contactsSuggestRow || adapterPosition == privacySettingsActivity.autoDeleteMesages || adapterPosition == privacySettingsActivity.botsBiometryRow))))))))))));
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
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
            boolean z3;
            CharSequence charSequence;
            String str4;
            String str5;
            String tTLString;
            boolean z4 = true;
            boolean z5 = false;
            int i5 = viewHolder.mItemViewType;
            PrivacySettingsActivity privacySettingsActivity = PrivacySettingsActivity.this;
            int i6 = 16;
            String pluralString = null;
            View view = viewHolder.itemView;
            if (i5 == 0) {
                boolean z6 = view.getTag() != null && ((Integer) view.getTag()).intValue() == i;
                view.setTag(Integer.valueOf(i));
                TextSettingsCell textSettingsCell = (TextSettingsCell) view;
                textSettingsCell.setBetterLayout(true);
                if (i == privacySettingsActivity.webSessionsRow) {
                    textSettingsCell.setText(LocaleController.getString("WebSessionsTitle", R.string.WebSessionsTitle), false);
                } else {
                    if (i == privacySettingsActivity.phoneNumberRow) {
                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(6)) {
                            z = true;
                            i6 = 30;
                        } else {
                            pluralString = PrivacySettingsActivity.formatRulesString(6, privacySettingsActivity.getAccountInstance());
                            z = false;
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("PrivacyPhone", R.string.PrivacyPhone), pluralString, false, true);
                    } else if (i == privacySettingsActivity.lastSeenRow) {
                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(0)) {
                            z = true;
                            i6 = 30;
                        } else {
                            pluralString = PrivacySettingsActivity.formatRulesString(0, privacySettingsActivity.getAccountInstance());
                            z = false;
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("PrivacyLastSeen", R.string.PrivacyLastSeen), pluralString, false, true);
                    } else if (i == privacySettingsActivity.groupsRow) {
                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(1)) {
                            z = true;
                            i6 = 30;
                        } else {
                            pluralString = PrivacySettingsActivity.formatRulesString(1, privacySettingsActivity.getAccountInstance());
                            z = false;
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString(R.string.PrivacyInvites), pluralString, false, false);
                    } else if (i == privacySettingsActivity.callsRow) {
                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(2)) {
                            z = true;
                            i6 = 30;
                        } else {
                            pluralString = PrivacySettingsActivity.formatRulesString(2, privacySettingsActivity.getAccountInstance());
                            z = false;
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("Calls", R.string.Calls), pluralString, false, true);
                    } else if (i == privacySettingsActivity.profilePhotoRow) {
                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(4)) {
                            z = true;
                            i6 = 30;
                        } else {
                            pluralString = PrivacySettingsActivity.formatRulesString(4, privacySettingsActivity.getAccountInstance());
                            z = false;
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("PrivacyProfilePhoto", R.string.PrivacyProfilePhoto), pluralString, false, true);
                    } else if (i == privacySettingsActivity.bioRow) {
                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(9)) {
                            z = true;
                            i6 = 30;
                        } else {
                            pluralString = PrivacySettingsActivity.formatRulesString(9, privacySettingsActivity.getAccountInstance());
                            z = false;
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("PrivacyBio", R.string.PrivacyBio), pluralString, false, true);
                    } else if (i == privacySettingsActivity.musicRow) {
                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(14)) {
                            z = true;
                            i6 = 30;
                        } else {
                            pluralString = PrivacySettingsActivity.formatRulesString(14, privacySettingsActivity.getAccountInstance());
                            z = false;
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString(R.string.PrivacyMusic), pluralString, false, true);
                    } else if (i == privacySettingsActivity.birthdayRow) {
                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(11)) {
                            z = true;
                            i6 = 30;
                        } else {
                            pluralString = PrivacySettingsActivity.formatRulesString(11, privacySettingsActivity.getAccountInstance());
                            z = false;
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString(R.string.PrivacyBirthday), pluralString, false, true);
                    } else if (i == privacySettingsActivity.giftsRow) {
                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(12)) {
                            z = true;
                            i6 = 30;
                        } else {
                            pluralString = PrivacySettingsActivity.formatRulesString(12, privacySettingsActivity.getAccountInstance());
                            z = false;
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString(R.string.PrivacyGifts), pluralString, false, true);
                    } else if (i == privacySettingsActivity.forwardsRow) {
                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(5)) {
                            z = true;
                            i6 = 30;
                        } else {
                            pluralString = PrivacySettingsActivity.formatRulesString(5, privacySettingsActivity.getAccountInstance());
                            z = false;
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("PrivacyForwards", R.string.PrivacyForwards), pluralString, false, true);
                    } else if (i == privacySettingsActivity.voicesRow) {
                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(8)) {
                            string2 = null;
                            z2 = true;
                            i6 = 30;
                        } else {
                            string2 = !privacySettingsActivity.getUserConfig().isPremium() ? LocaleController.getString(R.string.P2PEverybody) : PrivacySettingsActivity.formatRulesString(8, privacySettingsActivity.getAccountInstance());
                            z2 = false;
                        }
                        textSettingsCell.setTextAndValue(PrivacySettingsActivity.access$5500(privacySettingsActivity, LocaleController.getString(R.string.PrivacyVoiceMessages)), string2, false, privacySettingsActivity.noncontactsRow != -1);
                        textSettingsCell.getValueImageView().setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayIcon, false), PorterDuff.Mode.MULTIPLY));
                        z5 = z2;
                    } else if (i == privacySettingsActivity.noncontactsRow) {
                        if (privacySettingsActivity.feeValue) {
                            i2 = R.string.ContactsAndFee;
                        } else {
                            i2 = privacySettingsActivity.noncontactsValue ? R.string.ContactsAndPremium : R.string.P2PEverybody;
                        }
                        textSettingsCell.setTextAndValue((!privacySettingsActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium || privacySettingsActivity.getMessagesController().starsPaidMessagesAvailable) ? PrivacySettingsActivity.access$5500(privacySettingsActivity, LocaleController.getString(R.string.PrivacyMessages)) : LocaleController.getString(R.string.PrivacyMessages), LocaleController.getString(i2), false, privacySettingsActivity.musicRow != -1);
                    } else if (i == privacySettingsActivity.passportRow) {
                        textSettingsCell.setText(LocaleController.getString("TelegramPassport", R.string.TelegramPassport), true);
                    } else if (i == privacySettingsActivity.deleteAccountRow) {
                        if (privacySettingsActivity.getContactsController().getLoadingDeleteInfo()) {
                            z = true;
                        } else {
                            int deleteAccountTTL = privacySettingsActivity.getContactsController().getDeleteAccountTTL();
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
                        textSettingsCell.setTextAndValue(LocaleController.getString("DeleteAccountIfAwayFor3", R.string.DeleteAccountIfAwayFor3), pluralString, privacySettingsActivity.deleteAccountUpdate, false);
                        privacySettingsActivity.deleteAccountUpdate = false;
                    } else if (i == privacySettingsActivity.paymentsClearRow) {
                        textSettingsCell.setText(LocaleController.getString("PrivacyPaymentsClear", R.string.PrivacyPaymentsClear), true);
                    } else if (i == privacySettingsActivity.botsBiometryRow) {
                        textSettingsCell.setText(LocaleController.getString(R.string.PrivacyBiometryBotsButton), true);
                    } else if (i == privacySettingsActivity.secretMapRow) {
                        int i7 = SharedConfig.mapPreviewType;
                        if (i7 == 0) {
                            string = LocaleController.getString("MapPreviewProviderTelegram", R.string.MapPreviewProviderTelegram);
                        } else if (i7 != 1) {
                            string = i7 != 2 ? LocaleController.getString("MapPreviewProviderYandex", R.string.MapPreviewProviderYandex) : LocaleController.getString("MapPreviewProviderNobody", R.string.MapPreviewProviderNobody);
                        } else {
                            string = LocaleController.getString("MapPreviewProviderGoogle", R.string.MapPreviewProviderGoogle);
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("MapPreviewProvider", R.string.MapPreviewProvider), string, privacySettingsActivity.secretMapUpdate, true);
                        privacySettingsActivity.secretMapUpdate = false;
                    } else if (i == privacySettingsActivity.contactsDeleteRow) {
                        textSettingsCell.setText(LocaleController.getString("SyncContactsDelete", R.string.SyncContactsDelete), true);
                    }
                    z5 = z;
                }
                textSettingsCell.drawLoading = z5;
                textSettingsCell.loadingSize = i6;
                if (z6) {
                    textSettingsCell.measureDelay = true;
                } else {
                    textSettingsCell.drawLoadingProgress = z5 ? 1.0f : 0.0f;
                }
                textSettingsCell.invalidate();
                return;
            }
            if (i5 == 1) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                if (i == privacySettingsActivity.deleteAccountDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString("DeleteAccountHelp", R.string.DeleteAccountHelp));
                    return;
                }
                if (i == privacySettingsActivity.groupsDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString("GroupsAndChannelsHelp", R.string.GroupsAndChannelsHelp));
                    return;
                }
                if (i == privacySettingsActivity.sessionsDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString("SessionsSettingsInfo", R.string.SessionsSettingsInfo));
                    return;
                }
                if (i == privacySettingsActivity.secretDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString("SecretWebPageInfo", R.string.SecretWebPageInfo));
                    return;
                }
                if (i == privacySettingsActivity.botsDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString("PrivacyBotsInfo", R.string.PrivacyBotsInfo));
                    return;
                }
                if (i == privacySettingsActivity.privacyShadowRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyInvitesInfo));
                    return;
                } else if (i == privacySettingsActivity.contactsDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString("SuggestContactsInfo", R.string.SuggestContactsInfo));
                    return;
                } else {
                    if (i == privacySettingsActivity.newChatsSectionRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString("ArchiveAndMuteInfo", R.string.ArchiveAndMuteInfo));
                        return;
                    }
                    return;
                }
            }
            if (i5 == 2) {
                HeaderCell headerCell = (HeaderCell) view;
                if (i == privacySettingsActivity.privacySectionRow) {
                    headerCell.setText(LocaleController.getString("PrivacyTitle", R.string.PrivacyTitle));
                    return;
                }
                if (i == 0) {
                    headerCell.setText(LocaleController.getString("SecurityTitle", R.string.SecurityTitle));
                    return;
                }
                if (i == privacySettingsActivity.advancedSectionRow) {
                    headerCell.setText(LocaleController.getString("DeleteMyAccount", R.string.DeleteMyAccount));
                    return;
                }
                if (i == privacySettingsActivity.secretSectionRow) {
                    headerCell.setText(LocaleController.getString("SecretChat", R.string.SecretChat));
                    return;
                }
                if (i == privacySettingsActivity.botsSectionRow) {
                    headerCell.setText(LocaleController.getString("PrivacyBots", R.string.PrivacyBots));
                    return;
                } else if (i == privacySettingsActivity.contactsSectionRow) {
                    headerCell.setText(LocaleController.getString("Contacts", R.string.Contacts));
                    return;
                } else {
                    if (i == privacySettingsActivity.newChatsHeaderRow) {
                        headerCell.setText(LocaleController.getString("NewChatsFromNonContacts", R.string.NewChatsFromNonContacts));
                        return;
                    }
                    return;
                }
            }
            if (i5 == 3) {
                TextCheckCell textCheckCell = (TextCheckCell) view;
                if (i == privacySettingsActivity.secretWebpageRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("SecretWebPage", R.string.SecretWebPage), privacySettingsActivity.getMessagesController().secretWebpagePreview == 1, false);
                    return;
                }
                if (i == privacySettingsActivity.contactsSyncRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("SyncContacts", R.string.SyncContacts), privacySettingsActivity.newSync, true);
                    return;
                } else if (i == privacySettingsActivity.contactsSuggestRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("SuggestContacts", R.string.SuggestContacts), privacySettingsActivity.newSuggest, false);
                    return;
                } else {
                    if (i == privacySettingsActivity.newChatsRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString("ArchiveAndMute", R.string.ArchiveAndMute), privacySettingsActivity.archiveChats, false);
                        return;
                    }
                    return;
                }
            }
            if (i5 != 5) {
                return;
            }
            TextCell textCell = (TextCell) view;
            boolean z7 = view.getTag() != null && ((Integer) view.getTag()).intValue() == i;
            view.setTag(Integer.valueOf(i));
            textCell.setPrioritizeTitleOverValue(false);
            if (i == privacySettingsActivity.autoDeleteMesages) {
                int globalTTl = privacySettingsActivity.getUserConfig().getGlobalTTl();
                if (globalTTl == -1) {
                    tTLString = null;
                } else {
                    tTLString = globalTTl > 0 ? LocaleController.formatTTLString(globalTTl * 60) : LocaleController.getString("PasswordOff", R.string.PasswordOff);
                    z4 = false;
                }
                textCell.setTextAndValueAndIcon(LocaleController.getString("AutoDeleteMessages", R.string.AutoDeleteMessages), tTLString, true, R.drawable.msg2_autodelete, true);
            } else {
                String str6 = "";
                if (i != privacySettingsActivity.sessionsRow) {
                    int i8 = privacySettingsActivity.emailLoginRow;
                    AnimatedTextView animatedTextView = textCell.valueTextView;
                    if (i == i8) {
                        TL_account.Password password = privacySettingsActivity.currentPassword;
                        if (password == null) {
                            z3 = true;
                            charSequence = str6;
                        } else {
                            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(password.login_email_pattern);
                            int iIndexOf = privacySettingsActivity.currentPassword.login_email_pattern.indexOf(42);
                            int iLastIndexOf = privacySettingsActivity.currentPassword.login_email_pattern.lastIndexOf(42);
                            if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                                TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                                textStyleRun.flags |= 256;
                                textStyleRun.start = iIndexOf;
                                int i9 = iLastIndexOf + 1;
                                textStyleRun.end = i9;
                                spannableStringBuilderValueOf.setSpan(new TextStyleSpan(textStyleRun, 0), iIndexOf, i9, 0);
                            }
                            z3 = false;
                            charSequence = spannableStringBuilderValueOf;
                        }
                        textCell.setPrioritizeTitleOverValue(true);
                        String string7 = LocaleController.getString(R.string.EmailLogin);
                        int i10 = R.drawable.msg2_email;
                        textCell.imageLeft = 16;
                        textCell.offsetFromImage = 58;
                        SimpleTextView simpleTextView = textCell.textView;
                        simpleTextView.setText(string7, false);
                        simpleTextView.setRightDrawable((Drawable) null);
                        SimpleTextView simpleTextView2 = textCell.valueSpoilersTextView;
                        simpleTextView2.setVisibility(0);
                        simpleTextView2.setText(charSequence, false);
                        animatedTextView.setVisibility(8);
                        textCell.valueImageView.setVisibility(8);
                        RLottieImageView rLottieImageView = textCell.imageView;
                        rLottieImageView.setVisibility(0);
                        rLottieImageView.setTranslationX(0.0f);
                        rLottieImageView.setTranslationY(0.0f);
                        rLottieImageView.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                        rLottieImageView.setImageResource(i10);
                        textCell.needDivider = true;
                        textCell.setWillNotDraw(false);
                        Switch r1 = textCell.checkBox;
                        if (r1 != null) {
                            r1.setVisibility(8);
                        }
                        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = textCell.emojiDrawable;
                        if (swapAnimatedEmojiDrawable != null) {
                            swapAnimatedEmojiDrawable.set((Drawable) null, false);
                        }
                        z5 = z3;
                    } else if (i == privacySettingsActivity.passwordRow) {
                        int i11 = R.drawable.menu_2sv;
                        TL_account.Password password2 = privacySettingsActivity.currentPassword;
                        if (password2 == null) {
                            i4 = i11;
                            str3 = "";
                        } else {
                            if (password2.has_password) {
                                i11 = R.drawable.menu_2sv_on;
                                string6 = LocaleController.getString(R.string.PasswordOn);
                            } else {
                                string6 = LocaleController.getString(R.string.PasswordOff);
                            }
                            i4 = i11;
                            str3 = string6;
                            z4 = false;
                        }
                        textCell.setTextAndValueAndIcon(LocaleController.getString(R.string.TwoStepVerification), str3, true, i4, true);
                    } else if (i == privacySettingsActivity.passkeysRow) {
                        ArrayList arrayList = privacySettingsActivity.currentPasskeys;
                        if (arrayList == null) {
                            str2 = "";
                        } else {
                            if (arrayList.size() == 1 && animatedTextView.getPaint().measureText(((TL_account.Passkey) privacySettingsActivity.currentPasskeys.get(0)).name) < AndroidUtilities.displaySize.x / 3.0f) {
                                string5 = ((TL_account.Passkey) privacySettingsActivity.currentPasskeys.get(0)).name;
                            } else if (privacySettingsActivity.currentPasskeys.size() > 0) {
                                string5 = privacySettingsActivity.currentPasskeys.size() + "";
                            } else {
                                string5 = LocaleController.getString(R.string.PasswordOff);
                            }
                            str2 = string5;
                            z4 = false;
                        }
                        textCell.setTextAndValueAndIcon(LocaleController.getString(R.string.Passkey), str2, true, R.drawable.msg2_permissions, true);
                    } else if (i == privacySettingsActivity.passcodeRow) {
                        if (SharedConfig.passcodeHash.length() != 0) {
                            string4 = LocaleController.getString(R.string.PasswordOn);
                            i3 = R.drawable.msg2_secret;
                        } else {
                            string4 = LocaleController.getString(R.string.PasswordOff);
                            i3 = R.drawable.msg2_secret;
                        }
                        textCell.setTextAndValueAndIcon(LocaleController.getString(R.string.Passcode), string4, true, i3, true);
                    } else if (i == privacySettingsActivity.blockedRow) {
                        int i12 = privacySettingsActivity.getMessagesController().totalBlockedCount;
                        if (i12 == 0) {
                            string3 = LocaleController.getString("BlockedEmpty", R.string.BlockedEmpty);
                        } else {
                            if (i12 > 0) {
                                string3 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(i12));
                            } else {
                                str = "";
                            }
                            textCell.setTextAndValueAndIcon(LocaleController.getString("BlockedUsers", R.string.BlockedUsers), str, true, R.drawable.msg2_block2, true);
                        }
                        str = string3;
                        z4 = false;
                        textCell.setTextAndValueAndIcon(LocaleController.getString("BlockedUsers", R.string.BlockedUsers), str, true, R.drawable.msg2_block2, true);
                    }
                    textCell.setDrawLoading(16, z5, z7);
                }
                if (privacySettingsActivity.devicesActivityPreload.getSessionsCount() == 0) {
                    if (privacySettingsActivity.getMessagesController().lastKnownSessionsCount == 0) {
                        str5 = "";
                    } else {
                        str4 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(privacySettingsActivity.getMessagesController().lastKnownSessionsCount));
                    }
                    privacySettingsActivity.getMessagesController().lastKnownSessionsCount = privacySettingsActivity.devicesActivityPreload.getSessionsCount();
                    textCell.setTextAndValueAndIcon(LocaleController.getString(R.string.SessionsTitle), str5, true, R.drawable.msg2_devices, false);
                } else {
                    str4 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(privacySettingsActivity.devicesActivityPreload.getSessionsCount()));
                }
                str5 = str4;
                z4 = false;
                privacySettingsActivity.getMessagesController().lastKnownSessionsCount = privacySettingsActivity.devicesActivityPreload.getSessionsCount();
                textCell.setTextAndValueAndIcon(LocaleController.getString(R.string.SessionsTitle), str5, true, R.drawable.msg2_devices, false);
            }
            z5 = z4;
            textCell.setDrawLoading(16, z5, z7);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textSettingsCell;
            View headerCell;
            Context context = this.mContext;
            if (i == 0) {
                textSettingsCell = new TextSettingsCell(context, 0, null);
            } else {
                if (i != 1) {
                    if (i == 2) {
                        headerCell = new HeaderCell(context);
                    } else if (i != 4) {
                        headerCell = i != 5 ? new TextCheckCell(context) : new TextCell(context);
                    } else {
                        textSettingsCell = new ShadowSectionCell(context, (Object) null);
                    }
                    return new RecyclerListView.Holder(headerCell);
                }
                textSettingsCell = new TextInfoPrivacyCell(context, 24, null);
            }
            headerCell = textSettingsCell;
            return new RecyclerListView.Holder(headerCell);
        }
    }

    public PrivacySettingsActivity() {
        super(null);
        this.biometryBots = new ArrayList();
        this.clear = new boolean[2];
    }

    public static SpannableStringBuilder access$5500(PrivacySettingsActivity privacySettingsActivity, String str) {
        if (privacySettingsActivity.premiumStar == null) {
            privacySettingsActivity.premiumStar = new SpannableString("★");
            AnimatedEmojiDrawable.WrapSizeDrawable wrapSizeDrawable = new AnimatedEmojiDrawable.WrapSizeDrawable(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), PremiumGradient.getInstance().premiumStarMenuDrawable);
            wrapSizeDrawable.setBounds(0, 0, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
            privacySettingsActivity.premiumStar.setSpan(new ImageSpan(wrapSizeDrawable, 2), 0, privacySettingsActivity.premiumStar.length(), 17);
        }
        return new SpannableStringBuilder(str).append((CharSequence) " \u2009").append((CharSequence) privacySettingsActivity.premiumStar);
    }

    public static String formatRulesString(int i, AccountInstance accountInstance) {
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

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacySettings));
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 15));
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isRightLayout) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setLayoutManager(new PhotoViewer.AnonymousClass36(i, 15, false));
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setLayoutAnimation(null);
        this.listView.setItemAnimator(null);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda0(20, this, context));
        BotBiometry.getBots(getParentActivity(), this.currentAccount, new PollItemMenu$$ExternalSyntheticLambda14(this, 25));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
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
                listAdapter2.mObservable.notifyChanged();
            }
        } else if (i == NotificationCenter.blockedUsersDidLoad) {
            this.listAdapter.notifyItemChanged(this.blockedRow);
        } else if (i == NotificationCenter.didSetOrRemoveTwoStepPassword) {
            if (objArr.length > 0) {
                this.currentPassword = (TL_account.Password) objArr[0];
                ListAdapter listAdapter3 = this.listAdapter;
                if (listAdapter3 != null) {
                    listAdapter3.notifyItemChanged(this.passwordRow);
                }
            } else {
                this.currentPassword = null;
                loadPasswordSettings();
                updateRows(true);
            }
        }
        if (i != NotificationCenter.didUpdateGlobalAutoDeleteTimer || (listAdapter = this.listAdapter) == null) {
            return;
        }
        listAdapter.notifyItemChanged(this.autoDeleteMesages);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
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

    public final void initPassword() {
        TwoStepVerificationActivity.initPasswordNewAlgo(this.currentPassword);
        if (!getUserConfig().hasSecureData && this.currentPassword.has_secure_values) {
            getUserConfig().hasSecureData = true;
            getUserConfig().saveConfig(false);
            updateRows(true);
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
                    RecyclerView.AdapterDataObservable adapterDataObservable = listAdapter.mObservable;
                    if (z) {
                        adapterDataObservable.notifyItemRangeInserted(this.emailLoginRow, 1);
                    } else {
                        adapterDataObservable.notifyItemRangeRemoved(i, 1);
                    }
                }
            }
        }
        ListAdapter listAdapter2 = this.listAdapter;
        if (listAdapter2 != null) {
            listAdapter2.notifyItemChanged(this.passwordRow);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$createView$19(Context context, View view, int i) {
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
                String string = LocaleController.getString("DeleteAccountTitle", R.string.DeleteAccountTitle);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                String[] strArr = {LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.formatPluralString("Months", 3, new Object[0]), LocaleController.formatPluralString("Months", 6, new Object[0]), LocaleController.formatPluralString("Months", 12, new Object[0]), LocaleController.formatPluralString("Months", 18, new Object[0]), LocaleController.formatPluralString("Months", 24, new Object[0])};
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(1);
                builder.setView(linearLayout);
                int i3 = 0;
                while (i3 < 6) {
                    RadioColorCell radioColorCell = new RadioColorCell(getParentActivity(), null);
                    radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    radioColorCell.setTag(Integer.valueOf(i3));
                    radioColorCell.setCheckColor(Theme.getColor(null, Theme.key_radioBackground, false), Theme.getColor(null, Theme.key_dialogRadioBackgroundChecked, false));
                    radioColorCell.setTextAndValue(strArr[i3], i2 == i3);
                    linearLayout.addView(radioColorCell);
                    radioColorCell.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda52(4, this, builder));
                    i3++;
                }
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog);
                return;
            }
            if (i == this.lastSeenRow) {
                presentFragment(new PrivacyControlActivity(0, false));
                return;
            }
            if (i == this.phoneNumberRow) {
                presentFragment(new PrivacyControlActivity(6, false));
                return;
            }
            if (i == this.groupsRow) {
                presentFragment(new PrivacyControlActivity(1, false));
                return;
            }
            if (i == this.callsRow) {
                presentFragment(new PrivacyControlActivity(2, false));
                return;
            }
            if (i == this.profilePhotoRow) {
                presentFragment(new PrivacyControlActivity(4, false));
                return;
            }
            if (i == this.bioRow) {
                presentFragment(new PrivacyControlActivity(9, false));
                return;
            }
            if (i == this.musicRow) {
                presentFragment(new PrivacyControlActivity(14, false));
                return;
            }
            if (i == this.birthdayRow) {
                presentFragment(new PrivacyControlActivity(11, false));
                return;
            }
            if (i == this.giftsRow) {
                presentFragment(new PrivacyControlActivity(12, false));
                return;
            }
            if (i == this.forwardsRow) {
                presentFragment(new PrivacyControlActivity(5, false));
                return;
            }
            if (i == this.voicesRow) {
                presentFragment(new PrivacyControlActivity(8, false));
                return;
            }
            if (i == this.noncontactsRow) {
                presentFragment(new PrivacyControlActivity(10, false));
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
                    spannableStringBuilderValueOf.setSpan(new TextStyleSpan(textStyleRun, 0), iIndexOf, i4, 0);
                }
                AlertDialog.Builder builder2 = new AlertDialog.Builder(context, 0, null);
                AlertDialog alertDialog2 = builder2.alertDialog;
                alertDialog2.title = spannableStringBuilderValueOf;
                alertDialog2.message = LocaleController.getString(R.string.EmailLoginChangeMessage);
                builder2.setPositiveButton(LocaleController.getString(R.string.ChangeEmail), new PrivacySettingsActivity$$ExternalSyntheticLambda3(this, 4));
                ArticleViewer.IBlock.CC.m(R.string.Cancel, builder2, (AlertDialog.OnButtonClickListener) null);
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
                twoStepVerificationActivity.currentPassword = this.currentPassword;
                twoStepVerificationActivity.passwordEntered = false;
                presentFragment(twoStepVerificationActivity);
                return;
            }
            if (i == this.passkeysRow) {
                if (Build.VERSION.SDK_INT < 28 || !BuildVars.SUPPORTS_PASSKEYS) {
                    return;
                }
                ArrayList arrayList = this.currentPasskeys;
                if (arrayList == null || arrayList.size() <= 0) {
                    PasskeysActivity.showLearnSheet(this.currentAccount, context, this.resourceProvider, true);
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
                AlertDialog.Builder builder3 = new AlertDialog.Builder(getParentActivity(), 0, null);
                String string2 = LocaleController.getString("SyncContactsDeleteTitle", R.string.SyncContactsDeleteTitle);
                AlertDialog alertDialog3 = builder3.alertDialog;
                alertDialog3.title = string2;
                alertDialog3.message = AndroidUtilities.replaceTags(LocaleController.getString("SyncContactsDeleteText", R.string.SyncContactsDeleteText));
                builder3.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                builder3.setPositiveButton(LocaleController.getString("Delete", R.string.Delete), new PrivacySettingsActivity$$ExternalSyntheticLambda3(this, 5));
                showDialog(alertDialog3);
                TextView textView = (TextView) alertDialog3.getButton(-1);
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
                AlertDialog.Builder builder4 = new AlertDialog.Builder(getParentActivity(), 0, null);
                String string3 = LocaleController.getString("SuggestContactsTitle", R.string.SuggestContactsTitle);
                AlertDialog alertDialog4 = builder4.alertDialog;
                alertDialog4.title = string3;
                alertDialog4.message = LocaleController.getString("SuggestContactsAlert", R.string.SuggestContactsAlert);
                builder4.setPositiveButton(LocaleController.getString("MuteDisable", R.string.MuteDisable), new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(13, this, textCheckCell));
                builder4.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                showDialog(alertDialog4);
                TextView textView2 = (TextView) alertDialog4.getButton(-1);
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
                AlertsCreator.showSecretLocationAlert(getParentActivity(), this.currentAccount, new PrivacySettingsActivity$$ExternalSyntheticLambda10(this, 0), false, null);
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
            AlertDialog.Builder builder5 = new AlertDialog.Builder(getParentActivity(), 0, null);
            String string4 = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
            AlertDialog alertDialog5 = builder5.alertDialog;
            alertDialog5.title = string4;
            alertDialog5.message = LocaleController.getString("PrivacyPaymentsClearAlertText", R.string.PrivacyPaymentsClearAlertText);
            LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
            linearLayout2.setOrientation(1);
            builder5.setView(linearLayout2);
            int i5 = 0;
            while (i5 < 2) {
                String string5 = i5 == 0 ? LocaleController.getString("PrivacyClearShipping", R.string.PrivacyClearShipping) : LocaleController.getString("PrivacyClearPayment", R.string.PrivacyClearPayment);
                this.clear[i5] = true;
                CheckBoxCell checkBoxCell = new CheckBoxCell(getParentActivity(), 1, 21, false, null);
                checkBoxCell.setTag(Integer.valueOf(i5));
                checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                checkBoxCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                linearLayout2.addView(checkBoxCell, LayoutHelper.createLinear(-1, 50));
                checkBoxCell.setText(string5, null, true, false, false);
                checkBoxCell.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
                checkBoxCell.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda4(this, 24));
                i5++;
            }
            builder5.setPositiveButton(LocaleController.getString("ClearButton", R.string.ClearButton), new PrivacySettingsActivity$$ExternalSyntheticLambda3(this, 1));
            builder5.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            showDialog(alertDialog5);
            showDialog(alertDialog5);
            TextView textView3 = (TextView) alertDialog5.getButton(-1);
            if (textView3 != null) {
                textView3.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            }
        }
    }

    public final void loadPasswordSettings() {
        getConnectionsManager().sendRequest(new TL_account.getPassword(), new LinkManager$$ExternalSyntheticLambda3(this, 21), 10);
    }

    @Override
    public final boolean onFragmentCreate() {
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
        updateRows(true);
        loadPasswordSettings();
        getConnectionsManager().sendRequestTyped(new TL_account.getPasskeys(), new AiTonesController$$ExternalSyntheticLambda0(), new LinkManager$$ExternalSyntheticLambda1(this, 4));
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.blockedUsersDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        getNotificationCenter().addObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
        getUserConfig().loadGlobalTTl();
        SessionsActivity sessionsActivity = new SessionsActivity(0);
        this.devicesActivityPreload = sessionsActivity;
        sessionsActivity.delegate = new PrivacySettingsActivity$$ExternalSyntheticLambda3(this, 0);
        sessionsActivity.loadSessions(false);
        SessionsActivity sessionsActivity2 = new SessionsActivity(1);
        this.webSessionsActivityPreload = sessionsActivity2;
        sessionsActivity2.delegate = new PrivacySettingsActivity$$ExternalSyntheticLambda3(this, 3);
        sessionsActivity2.loadSessions(false);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
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
            getConnectionsManager().sendRequest(tL_contacts_toggleTopPeers, new PassportActivity$$ExternalSyntheticLambda1(1));
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
                getConnectionsManager().sendRequest(setglobalprivacysettings, new PassportActivity$$ExternalSyntheticLambda1(1));
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
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
    }

    public final void updateRows(boolean z) {
        this.passkeysRow = -1;
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
        listAdapter.mObservable.notifyChanged();
    }
}
