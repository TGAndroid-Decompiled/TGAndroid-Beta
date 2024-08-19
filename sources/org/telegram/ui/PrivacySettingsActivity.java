package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$PrivacyRule;
import org.telegram.tgnet.TLRPC$TL_accountDaysTTL;
import org.telegram.tgnet.TLRPC$TL_account_authorizationForm;
import org.telegram.tgnet.TLRPC$TL_account_getPassword;
import org.telegram.tgnet.TLRPC$TL_account_setAccountTTL;
import org.telegram.tgnet.TLRPC$TL_boolTrue;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_globalPrivacySettings;
import org.telegram.tgnet.TLRPC$TL_payments_clearSavedInfo;
import org.telegram.tgnet.TLRPC$TL_privacyValueAllowAll;
import org.telegram.tgnet.TLRPC$TL_privacyValueAllowChatParticipants;
import org.telegram.tgnet.TLRPC$TL_privacyValueAllowPremium;
import org.telegram.tgnet.TLRPC$TL_privacyValueAllowUsers;
import org.telegram.tgnet.TLRPC$TL_privacyValueDisallowAll;
import org.telegram.tgnet.TLRPC$TL_privacyValueDisallowChatParticipants;
import org.telegram.tgnet.TLRPC$TL_privacyValueDisallowUsers;
import org.telegram.tgnet.TLRPC$account_Password;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
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
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.bots.BotBiometry;
import org.telegram.ui.bots.BotBiometrySettings;

public class PrivacySettingsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private int advancedSectionRow;
    private boolean archiveChats;
    private int autoDeleteMesages;
    private int bioRow;
    private int birthdayRow;
    private int blockedRow;
    private int botsAndWebsitesShadowRow;
    private int botsBiometryRow;
    private int botsDetailRow;
    private int botsSectionRow;
    private int callsRow;
    private int contactsDeleteRow;
    private int contactsDetailRow;
    private int contactsSectionRow;
    private int contactsSuggestRow;
    private int contactsSyncRow;
    private TLRPC$account_Password currentPassword;
    private boolean currentSuggest;
    private boolean currentSync;
    private int deleteAccountDetailRow;
    private int deleteAccountRow;
    private boolean deleteAccountUpdate;
    private SessionsActivity devicesActivityPreload;
    private int emailLoginRow;
    private int forwardsRow;
    private int groupsDetailRow;
    private int groupsRow;
    private int lastSeenRow;
    private LinearLayoutManager layoutManager;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private int newChatsHeaderRow;
    private int newChatsRow;
    private int newChatsSectionRow;
    private boolean newSuggest;
    private boolean newSync;
    private int noncontactsRow;
    private boolean noncontactsValue;
    private int passcodeRow;
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
    private final ArrayList<BotBiometry.Bot> biometryBots = new ArrayList<>();
    private boolean[] clear = new boolean[2];

    public static void lambda$createView$16(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$onFragmentDestroy$2(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$onFragmentDestroy$3(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
        TLRPC$TL_globalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
        if (globalPrivacySettings != null) {
            this.archiveChats = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
            this.noncontactsValue = globalPrivacySettings.new_noncontact_peers_require_premium;
        }
        updateRows();
        loadPasswordSettings();
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.blockedUsersDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        getNotificationCenter().addObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
        getUserConfig().loadGlobalTTl();
        SessionsActivity sessionsActivity = new SessionsActivity(0);
        this.devicesActivityPreload = sessionsActivity;
        sessionsActivity.setDelegate(new SessionsActivity.Delegate() {
            @Override
            public final void sessionsLoaded() {
                PrivacySettingsActivity.this.lambda$onFragmentCreate$0();
            }
        });
        this.devicesActivityPreload.lambda$loadSessions$17(false);
        SessionsActivity sessionsActivity2 = new SessionsActivity(1);
        this.webSessionsActivityPreload = sessionsActivity2;
        sessionsActivity2.setDelegate(new SessionsActivity.Delegate() {
            @Override
            public final void sessionsLoaded() {
                PrivacySettingsActivity.this.lambda$onFragmentCreate$1();
            }
        });
        this.webSessionsActivityPreload.lambda$loadSessions$17(false);
        return true;
    }

    public void lambda$onFragmentCreate$0() {
        int i;
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter == null || (i = this.sessionsRow) < 0) {
            return;
        }
        listAdapter.notifyItemChanged(i);
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

    @Override
    public void onFragmentDestroy() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PrivacySettingsActivity.onFragmentDestroy():void");
    }

    @Override
    public View createView(final Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString("PrivacySettings", R.string.PrivacySettings));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    PrivacySettingsActivity.this.lambda$onBackPressed$308();
                }
            }
        });
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false) {
            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        };
        this.layoutManager = linearLayoutManager;
        recyclerListView.setLayoutManager(linearLayoutManager);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setLayoutAnimation(null);
        this.listView.setItemAnimator(null);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                PrivacySettingsActivity.this.lambda$createView$19(context, view, i);
            }
        });
        BotBiometry.getBots(getContext(), this.currentAccount, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                PrivacySettingsActivity.this.lambda$createView$20((ArrayList) obj);
            }
        });
        return this.fragmentView;
    }

    public void lambda$createView$19(Context context, View view, int i) {
        String string;
        String str;
        if (view.isEnabled()) {
            if (i == this.autoDeleteMesages && getUserConfig().getGlobalTTl() >= 0) {
                presentFragment(new AutoDeleteMessagesActivity());
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
            int i2 = 2;
            if (i == this.deleteAccountRow) {
                if (getParentActivity() == null) {
                    return;
                }
                int deleteAccountTTL = getContactsController().getDeleteAccountTTL();
                if (deleteAccountTTL <= 31) {
                    i2 = 0;
                } else if (deleteAccountTTL <= 93) {
                    i2 = 1;
                } else if (deleteAccountTTL > 182) {
                    i2 = 3;
                }
                final AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                builder.setTitle(LocaleController.getString("DeleteAccountTitle", R.string.DeleteAccountTitle));
                String[] strArr = {LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.formatPluralString("Months", 3, new Object[0]), LocaleController.formatPluralString("Months", 6, new Object[0]), LocaleController.formatPluralString("Years", 1, new Object[0]), LocaleController.getString("OneAndHalfYear")};
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(1);
                builder.setView(linearLayout);
                int i3 = 0;
                while (i3 < 5) {
                    RadioColorCell radioColorCell = new RadioColorCell(getParentActivity());
                    radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    radioColorCell.setTag(Integer.valueOf(i3));
                    radioColorCell.setCheckColor(Theme.getColor(Theme.key_radioBackground), Theme.getColor(Theme.key_dialogRadioBackgroundChecked));
                    radioColorCell.setTextAndValue(strArr[i3], i2 == i3);
                    linearLayout.addView(radioColorCell);
                    radioColorCell.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            PrivacySettingsActivity.this.lambda$createView$6(builder, view2);
                        }
                    });
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
            if (i == this.birthdayRow) {
                presentFragment(new PrivacyControlActivity(11));
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
                TLRPC$account_Password tLRPC$account_Password = this.currentPassword;
                if (tLRPC$account_Password == null || (str = tLRPC$account_Password.login_email_pattern) == null) {
                    return;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                int indexOf = this.currentPassword.login_email_pattern.indexOf(42);
                int lastIndexOf = this.currentPassword.login_email_pattern.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                    textStyleRun.flags |= 256;
                    textStyleRun.start = indexOf;
                    int i4 = lastIndexOf + 1;
                    textStyleRun.end = i4;
                    valueOf.setSpan(new TextStyleSpan(textStyleRun), indexOf, i4, 0);
                }
                new AlertDialog.Builder(context).setTitle(valueOf).setMessage(LocaleController.getString(R.string.EmailLoginChangeMessage)).setPositiveButton(LocaleController.getString(R.string.ChangeEmail), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        PrivacySettingsActivity.this.lambda$createView$8(dialogInterface, i5);
                    }
                }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
                return;
            }
            if (i == this.passwordRow) {
                TLRPC$account_Password tLRPC$account_Password2 = this.currentPassword;
                if (tLRPC$account_Password2 == null) {
                    return;
                }
                if (!TwoStepVerificationActivity.canHandleCurrentPassword(tLRPC$account_Password2, false)) {
                    AlertsCreator.showUpdateAppAlert(getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                }
                TLRPC$account_Password tLRPC$account_Password3 = this.currentPassword;
                if (tLRPC$account_Password3.has_password) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    twoStepVerificationActivity.setPassword(this.currentPassword);
                    presentFragment(twoStepVerificationActivity);
                    return;
                }
                presentFragment(new TwoStepVerificationSetupActivity(TextUtils.isEmpty(tLRPC$account_Password3.email_unconfirmed_pattern) ? 6 : 5, this.currentPassword));
                return;
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
                AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity());
                builder2.setTitle(LocaleController.getString("SyncContactsDeleteTitle", R.string.SyncContactsDeleteTitle));
                builder2.setMessage(AndroidUtilities.replaceTags(LocaleController.getString("SyncContactsDeleteText", R.string.SyncContactsDeleteText)));
                builder2.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                builder2.setPositiveButton(LocaleController.getString("Delete", R.string.Delete), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        PrivacySettingsActivity.this.lambda$createView$10(dialogInterface, i5);
                    }
                });
                AlertDialog create = builder2.create();
                showDialog(create);
                TextView textView = (TextView) create.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                    return;
                }
                return;
            }
            if (i == this.contactsSuggestRow) {
                final TextCheckCell textCheckCell = (TextCheckCell) view;
                if (this.newSuggest) {
                    AlertDialog.Builder builder3 = new AlertDialog.Builder(getParentActivity());
                    builder3.setTitle(LocaleController.getString("SuggestContactsTitle", R.string.SuggestContactsTitle));
                    builder3.setMessage(LocaleController.getString("SuggestContactsAlert", R.string.SuggestContactsAlert));
                    builder3.setPositiveButton(LocaleController.getString("MuteDisable", R.string.MuteDisable), new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i5) {
                            PrivacySettingsActivity.this.lambda$createView$13(textCheckCell, dialogInterface, i5);
                        }
                    });
                    builder3.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                    AlertDialog create2 = builder3.create();
                    showDialog(create2);
                    TextView textView2 = (TextView) create2.getButton(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                        return;
                    }
                    return;
                }
                this.newSuggest = true;
                textCheckCell.setChecked(true);
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
                AlertsCreator.showSecretLocationAlert(getParentActivity(), this.currentAccount, new Runnable() {
                    @Override
                    public final void run() {
                        PrivacySettingsActivity.this.lambda$createView$14();
                    }
                }, false, null);
                return;
            }
            if (i == this.paymentsClearRow) {
                AlertDialog.Builder builder4 = new AlertDialog.Builder(getParentActivity());
                builder4.setTitle(LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle));
                builder4.setMessage(LocaleController.getString("PrivacyPaymentsClearAlertText", R.string.PrivacyPaymentsClearAlertText));
                LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
                linearLayout2.setOrientation(1);
                builder4.setView(linearLayout2);
                for (int i5 = 0; i5 < 2; i5++) {
                    if (i5 == 0) {
                        string = LocaleController.getString("PrivacyClearShipping", R.string.PrivacyClearShipping);
                    } else {
                        string = LocaleController.getString("PrivacyClearPayment", R.string.PrivacyClearPayment);
                    }
                    this.clear[i5] = true;
                    CheckBoxCell checkBoxCell = new CheckBoxCell(getParentActivity(), 1, 21, null);
                    checkBoxCell.setTag(Integer.valueOf(i5));
                    checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    checkBoxCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    linearLayout2.addView(checkBoxCell, LayoutHelper.createLinear(-1, 50));
                    checkBoxCell.setText(string, null, true, false);
                    checkBoxCell.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
                    checkBoxCell.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            PrivacySettingsActivity.this.lambda$createView$15(view2);
                        }
                    });
                }
                builder4.setPositiveButton(LocaleController.getString("ClearButton", R.string.ClearButton), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i6) {
                        PrivacySettingsActivity.this.lambda$createView$18(dialogInterface, i6);
                    }
                });
                builder4.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                showDialog(builder4.create());
                AlertDialog create3 = builder4.create();
                showDialog(create3);
                TextView textView3 = (TextView) create3.getButton(-1);
                if (textView3 != null) {
                    textView3.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                    return;
                }
                return;
            }
            if (i == this.passportRow) {
                presentFragment(new PassportActivity(5, 0L, "", "", (String) null, (String) null, (String) null, (TLRPC$TL_account_authorizationForm) null, (TLRPC$account_Password) null));
            } else if (i == this.botsBiometryRow) {
                presentFragment(new BotBiometrySettings());
            }
        }
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
        } else {
            i = num.intValue() == 4 ? 548 : 0;
        }
        final AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3);
        alertDialog.setCanCancel(false);
        alertDialog.show();
        final TLRPC$TL_account_setAccountTTL tLRPC$TL_account_setAccountTTL = new TLRPC$TL_account_setAccountTTL();
        TLRPC$TL_accountDaysTTL tLRPC$TL_accountDaysTTL = new TLRPC$TL_accountDaysTTL();
        tLRPC$TL_account_setAccountTTL.ttl = tLRPC$TL_accountDaysTTL;
        tLRPC$TL_accountDaysTTL.days = i;
        getConnectionsManager().sendRequest(tLRPC$TL_account_setAccountTTL, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                PrivacySettingsActivity.this.lambda$createView$5(alertDialog, tLRPC$TL_account_setAccountTTL, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$createView$5(final AlertDialog alertDialog, final TLRPC$TL_account_setAccountTTL tLRPC$TL_account_setAccountTTL, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PrivacySettingsActivity.this.lambda$createView$4(alertDialog, tLObject, tLRPC$TL_account_setAccountTTL);
            }
        });
    }

    public void lambda$createView$4(AlertDialog alertDialog, TLObject tLObject, TLRPC$TL_account_setAccountTTL tLRPC$TL_account_setAccountTTL) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject instanceof TLRPC$TL_boolTrue) {
            this.deleteAccountUpdate = true;
            getContactsController().setDeleteAccountTTL(tLRPC$TL_account_setAccountTTL.ttl.days);
            this.listAdapter.notifyDataSetChanged();
        }
    }

    public void lambda$createView$8(DialogInterface dialogInterface, int i) {
        presentFragment(new LoginActivity().changeEmail(new Runnable() {
            @Override
            public final void run() {
                PrivacySettingsActivity.this.lambda$createView$7();
            }
        }));
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

    public void lambda$createView$10(DialogInterface dialogInterface, int i) {
        AlertDialog show = new AlertDialog.Builder(getParentActivity(), 3, null).show();
        this.progressDialog = show;
        show.setCanCancel(false);
        if (this.currentSync != this.newSync) {
            UserConfig userConfig = getUserConfig();
            boolean z = this.newSync;
            userConfig.syncContacts = z;
            this.currentSync = z;
            getUserConfig().saveConfig(false);
        }
        getContactsController().deleteAllContacts(new Runnable() {
            @Override
            public final void run() {
                PrivacySettingsActivity.this.lambda$createView$9();
            }
        });
    }

    public void lambda$createView$9() {
        this.progressDialog.dismiss();
    }

    public void lambda$createView$13(final TextCheckCell textCheckCell, DialogInterface dialogInterface, int i) {
        TLRPC$TL_payments_clearSavedInfo tLRPC$TL_payments_clearSavedInfo = new TLRPC$TL_payments_clearSavedInfo();
        boolean[] zArr = this.clear;
        tLRPC$TL_payments_clearSavedInfo.credentials = zArr[1];
        tLRPC$TL_payments_clearSavedInfo.info = zArr[0];
        getUserConfig().tmpPassword = null;
        getUserConfig().saveConfig(false);
        getConnectionsManager().sendRequest(tLRPC$TL_payments_clearSavedInfo, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                PrivacySettingsActivity.this.lambda$createView$12(textCheckCell, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$createView$12(final TextCheckCell textCheckCell, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PrivacySettingsActivity.this.lambda$createView$11(textCheckCell);
            }
        });
    }

    public void lambda$createView$11(TextCheckCell textCheckCell) {
        boolean z = !this.newSuggest;
        this.newSuggest = z;
        textCheckCell.setChecked(z);
    }

    public void lambda$createView$14() {
        this.listAdapter.notifyDataSetChanged();
        this.secretMapUpdate = true;
    }

    public void lambda$createView$15(View view) {
        CheckBoxCell checkBoxCell = (CheckBoxCell) view;
        int intValue = ((Integer) checkBoxCell.getTag()).intValue();
        boolean[] zArr = this.clear;
        boolean z = !zArr[intValue];
        zArr[intValue] = z;
        checkBoxCell.setChecked(z, true);
    }

    public void lambda$createView$18(DialogInterface dialogInterface, int i) {
        try {
            Dialog dialog = this.visibleDialog;
            if (dialog != null) {
                dialog.dismiss();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle));
        builder.setMessage(LocaleController.getString("PrivacyPaymentsClearAlert", R.string.PrivacyPaymentsClearAlert));
        builder.setPositiveButton(LocaleController.getString("ClearButton", R.string.ClearButton), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface2, int i2) {
                PrivacySettingsActivity.this.lambda$createView$17(dialogInterface2, i2);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        showDialog(builder.create());
        AlertDialog create = builder.create();
        showDialog(create);
        TextView textView = (TextView) create.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
    }

    public void lambda$createView$17(DialogInterface dialogInterface, int i) {
        String string;
        TLRPC$TL_payments_clearSavedInfo tLRPC$TL_payments_clearSavedInfo = new TLRPC$TL_payments_clearSavedInfo();
        boolean[] zArr = this.clear;
        tLRPC$TL_payments_clearSavedInfo.credentials = zArr[1];
        tLRPC$TL_payments_clearSavedInfo.info = zArr[0];
        getUserConfig().tmpPassword = null;
        getUserConfig().saveConfig(false);
        getConnectionsManager().sendRequest(tLRPC$TL_payments_clearSavedInfo, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                PrivacySettingsActivity.lambda$createView$16(tLObject, tLRPC$TL_error);
            }
        });
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

    public void lambda$createView$20(ArrayList arrayList) {
        this.biometryBots.clear();
        this.biometryBots.addAll(arrayList);
        updateRows(true);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        ListAdapter listAdapter;
        if (i == NotificationCenter.privacyRulesUpdated) {
            TLRPC$TL_globalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
            if (globalPrivacySettings != null) {
                this.archiveChats = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                this.noncontactsValue = globalPrivacySettings.new_noncontact_peers_require_premium;
            }
            ListAdapter listAdapter2 = this.listAdapter;
            if (listAdapter2 != null) {
                listAdapter2.notifyDataSetChanged();
            }
        } else if (i == NotificationCenter.blockedUsersDidLoad) {
            this.listAdapter.notifyItemChanged(this.blockedRow);
        } else if (i == NotificationCenter.didSetOrRemoveTwoStepPassword) {
            if (objArr.length > 0) {
                this.currentPassword = (TLRPC$account_Password) objArr[0];
                ListAdapter listAdapter3 = this.listAdapter;
                if (listAdapter3 != null) {
                    listAdapter3.notifyItemChanged(this.passwordRow);
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
        listAdapter.notifyItemChanged(this.autoDeleteMesages);
    }

    private void updateRows() {
        updateRows(true);
    }

    private void updateRows(boolean z) {
        this.securitySectionRow = 0;
        this.passwordRow = 1;
        this.autoDeleteMesages = 2;
        this.rowCount = 4;
        this.passcodeRow = 3;
        TLRPC$account_Password tLRPC$account_Password = this.currentPassword;
        if (tLRPC$account_Password == null ? SharedConfig.hasEmailLogin : tLRPC$account_Password.login_email_pattern != null) {
            this.rowCount = 5;
            this.emailLoginRow = 4;
        } else {
            this.emailLoginRow = -1;
        }
        int i = this.rowCount;
        this.rowCount = i + 1;
        this.blockedRow = i;
        if (tLRPC$account_Password != null) {
            boolean z2 = tLRPC$account_Password.login_email_pattern != null;
            if (SharedConfig.hasEmailLogin != z2) {
                SharedConfig.hasEmailLogin = z2;
                SharedConfig.saveConfig();
            }
        }
        int i2 = this.rowCount;
        this.sessionsRow = i2;
        this.sessionsDetailRow = i2 + 1;
        this.privacySectionRow = i2 + 2;
        this.phoneNumberRow = i2 + 3;
        this.lastSeenRow = i2 + 4;
        this.profilePhotoRow = i2 + 5;
        this.forwardsRow = i2 + 6;
        this.rowCount = i2 + 8;
        this.callsRow = i2 + 7;
        this.groupsDetailRow = -1;
        if (!getMessagesController().premiumFeaturesBlocked() || getUserConfig().isPremium()) {
            int i3 = this.rowCount;
            this.voicesRow = i3;
            this.rowCount = i3 + 2;
            this.noncontactsRow = i3 + 1;
        } else {
            this.voicesRow = -1;
            this.noncontactsRow = -1;
        }
        int i4 = this.rowCount;
        this.birthdayRow = i4;
        this.bioRow = i4 + 1;
        this.groupsRow = i4 + 2;
        this.rowCount = i4 + 4;
        this.privacyShadowRow = i4 + 3;
        if (getMessagesController().autoarchiveAvailable || getUserConfig().isPremium()) {
            int i5 = this.rowCount;
            this.newChatsHeaderRow = i5;
            this.newChatsRow = i5 + 1;
            this.rowCount = i5 + 3;
            this.newChatsSectionRow = i5 + 2;
        } else {
            this.newChatsHeaderRow = -1;
            this.newChatsRow = -1;
            this.newChatsSectionRow = -1;
        }
        int i6 = this.rowCount;
        this.advancedSectionRow = i6;
        this.deleteAccountRow = i6 + 1;
        this.deleteAccountDetailRow = i6 + 2;
        this.rowCount = i6 + 4;
        this.botsSectionRow = i6 + 3;
        if (getUserConfig().hasSecureData) {
            int i7 = this.rowCount;
            this.rowCount = i7 + 1;
            this.passportRow = i7;
        } else {
            this.passportRow = -1;
        }
        int i8 = this.rowCount;
        this.rowCount = i8 + 1;
        this.paymentsClearRow = i8;
        if (!this.biometryBots.isEmpty()) {
            int i9 = this.rowCount;
            this.rowCount = i9 + 1;
            this.botsBiometryRow = i9;
        } else {
            this.botsBiometryRow = -1;
        }
        SessionsActivity sessionsActivity = this.webSessionsActivityPreload;
        if (sessionsActivity != null && sessionsActivity.getSessionsCount() > 0) {
            int i10 = this.rowCount;
            this.webSessionsRow = i10;
            this.rowCount = i10 + 2;
            this.botsDetailRow = i10 + 1;
            this.botsAndWebsitesShadowRow = -1;
        } else {
            this.webSessionsRow = -1;
            this.botsDetailRow = -1;
            int i11 = this.rowCount;
            this.rowCount = i11 + 1;
            this.botsAndWebsitesShadowRow = i11;
        }
        int i12 = this.rowCount;
        this.contactsSectionRow = i12;
        this.contactsDeleteRow = i12 + 1;
        this.contactsSyncRow = i12 + 2;
        this.contactsSuggestRow = i12 + 3;
        this.contactsDetailRow = i12 + 4;
        this.secretSectionRow = i12 + 5;
        this.secretMapRow = i12 + 6;
        this.secretWebpageRow = i12 + 7;
        this.rowCount = i12 + 9;
        this.secretDetailRow = i12 + 8;
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter == null || !z) {
            return;
        }
        listAdapter.notifyDataSetChanged();
    }

    public PrivacySettingsActivity setCurrentPassword(TLRPC$account_Password tLRPC$account_Password) {
        this.currentPassword = tLRPC$account_Password;
        if (tLRPC$account_Password != null) {
            initPassword();
        }
        return this;
    }

    private void initPassword() {
        TwoStepVerificationActivity.initPasswordNewAlgo(this.currentPassword);
        if (!getUserConfig().hasSecureData && this.currentPassword.has_secure_values) {
            getUserConfig().hasSecureData = true;
            getUserConfig().saveConfig(false);
            updateRows();
            return;
        }
        TLRPC$account_Password tLRPC$account_Password = this.currentPassword;
        if (tLRPC$account_Password != null) {
            int i = this.emailLoginRow;
            String str = tLRPC$account_Password.login_email_pattern;
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
            listAdapter2.notifyItemChanged(this.passwordRow);
        }
    }

    private void loadPasswordSettings() {
        getConnectionsManager().sendRequest(new TLRPC$TL_account_getPassword(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                PrivacySettingsActivity.this.lambda$loadPasswordSettings$22(tLObject, tLRPC$TL_error);
            }
        }, 10);
    }

    public void lambda$loadPasswordSettings$22(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            final TLRPC$account_Password tLRPC$account_Password = (TLRPC$account_Password) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PrivacySettingsActivity.this.lambda$loadPasswordSettings$21(tLRPC$account_Password);
                }
            });
        }
    }

    public void lambda$loadPasswordSettings$21(TLRPC$account_Password tLRPC$account_Password) {
        this.currentPassword = tLRPC$account_Password;
        initPassword();
    }

    public static String formatRulesString(AccountInstance accountInstance, int i) {
        ArrayList<TLRPC$PrivacyRule> privacyRules = accountInstance.getContactsController().getPrivacyRules(i);
        if (privacyRules == null || privacyRules.size() == 0) {
            if (i == 3) {
                return LocaleController.getString("P2PNobody", R.string.P2PNobody);
            }
            return LocaleController.getString("LastSeenNobody", R.string.LastSeenNobody);
        }
        char c = 65535;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        for (int i4 = 0; i4 < privacyRules.size(); i4++) {
            TLRPC$PrivacyRule tLRPC$PrivacyRule = privacyRules.get(i4);
            if (tLRPC$PrivacyRule instanceof TLRPC$TL_privacyValueAllowChatParticipants) {
                TLRPC$TL_privacyValueAllowChatParticipants tLRPC$TL_privacyValueAllowChatParticipants = (TLRPC$TL_privacyValueAllowChatParticipants) tLRPC$PrivacyRule;
                int size = tLRPC$TL_privacyValueAllowChatParticipants.chats.size();
                for (int i5 = 0; i5 < size; i5++) {
                    TLRPC$Chat chat = accountInstance.getMessagesController().getChat(tLRPC$TL_privacyValueAllowChatParticipants.chats.get(i5));
                    if (chat != null) {
                        i3 += chat.participants_count;
                    }
                }
            } else if (tLRPC$PrivacyRule instanceof TLRPC$TL_privacyValueDisallowChatParticipants) {
                TLRPC$TL_privacyValueDisallowChatParticipants tLRPC$TL_privacyValueDisallowChatParticipants = (TLRPC$TL_privacyValueDisallowChatParticipants) tLRPC$PrivacyRule;
                int size2 = tLRPC$TL_privacyValueDisallowChatParticipants.chats.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    TLRPC$Chat chat2 = accountInstance.getMessagesController().getChat(tLRPC$TL_privacyValueDisallowChatParticipants.chats.get(i6));
                    if (chat2 != null) {
                        i2 += chat2.participants_count;
                    }
                }
            } else if (tLRPC$PrivacyRule instanceof TLRPC$TL_privacyValueAllowUsers) {
                i3 += ((TLRPC$TL_privacyValueAllowUsers) tLRPC$PrivacyRule).users.size();
            } else if (tLRPC$PrivacyRule instanceof TLRPC$TL_privacyValueDisallowUsers) {
                i2 += ((TLRPC$TL_privacyValueDisallowUsers) tLRPC$PrivacyRule).users.size();
            } else if (tLRPC$PrivacyRule instanceof TLRPC$TL_privacyValueAllowPremium) {
                z = true;
            } else if (c == 65535) {
                if (tLRPC$PrivacyRule instanceof TLRPC$TL_privacyValueAllowAll) {
                    c = 0;
                } else {
                    c = tLRPC$PrivacyRule instanceof TLRPC$TL_privacyValueDisallowAll ? (char) 1 : (char) 2;
                }
            }
        }
        if (c == 0 || (c == 65535 && i2 > 0)) {
            return i == 3 ? i2 == 0 ? LocaleController.getString("P2PEverybody", R.string.P2PEverybody) : LocaleController.formatString("P2PEverybodyMinus", R.string.P2PEverybodyMinus, Integer.valueOf(i2)) : i2 == 0 ? LocaleController.getString("LastSeenEverybody", R.string.LastSeenEverybody) : LocaleController.formatString("LastSeenEverybodyMinus", R.string.LastSeenEverybodyMinus, Integer.valueOf(i2));
        }
        if (c != 2 && (c != 65535 || i2 <= 0 || i3 <= 0)) {
            if (c != 1 && i3 <= 0) {
                return "unknown";
            }
            if (i == 3) {
                return i3 == 0 ? LocaleController.getString("P2PNobody", R.string.P2PNobody) : LocaleController.formatString("P2PNobodyPlus", R.string.P2PNobodyPlus, Integer.valueOf(i3));
            }
            if (i3 == 0) {
                return LocaleController.getString(z ? R.string.LastSeenNobodyPremium : R.string.LastSeenNobody);
            }
            return LocaleController.formatString(z ? R.string.LastSeenNobodyPremiumPlus : R.string.LastSeenNobodyPlus, Integer.valueOf(i3));
        }
        if (i == 3) {
            if (i3 == 0 && i2 == 0) {
                return LocaleController.getString("P2PContacts", R.string.P2PContacts);
            }
            return (i3 == 0 || i2 == 0) ? i2 != 0 ? LocaleController.formatString(R.string.P2PContactsMinus, Integer.valueOf(i2)) : LocaleController.formatString(R.string.P2PContactsPlus, Integer.valueOf(i3)) : LocaleController.formatString(R.string.P2PContactsMinusPlus, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        if (i3 == 0 && i2 == 0) {
            return LocaleController.getString(z ? R.string.LastSeenContactsPremium : R.string.LastSeenContacts);
        }
        if (i3 != 0 && i2 != 0) {
            return LocaleController.formatString(z ? R.string.LastSeenContactsPremiumMinusPlus : R.string.LastSeenContactsMinusPlus, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        if (i2 != 0) {
            return LocaleController.formatString(z ? R.string.LastSeenContactsPremiumMinus : R.string.LastSeenContactsMinus, Integer.valueOf(i2));
        }
        return LocaleController.formatString(z ? R.string.LastSeenContactsPremiumPlus : R.string.LastSeenContactsPlus, Integer.valueOf(i3));
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            if (adapterPosition == PrivacySettingsActivity.this.passcodeRow || adapterPosition == PrivacySettingsActivity.this.passwordRow || adapterPosition == PrivacySettingsActivity.this.blockedRow || adapterPosition == PrivacySettingsActivity.this.sessionsRow || adapterPosition == PrivacySettingsActivity.this.secretWebpageRow || adapterPosition == PrivacySettingsActivity.this.webSessionsRow) {
                return true;
            }
            if (adapterPosition == PrivacySettingsActivity.this.groupsRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(1)) {
                return true;
            }
            if (adapterPosition == PrivacySettingsActivity.this.lastSeenRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(0)) {
                return true;
            }
            if (adapterPosition == PrivacySettingsActivity.this.callsRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(2)) {
                return true;
            }
            if (adapterPosition == PrivacySettingsActivity.this.profilePhotoRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(4)) {
                return true;
            }
            if (adapterPosition == PrivacySettingsActivity.this.bioRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(9)) {
                return true;
            }
            if (adapterPosition == PrivacySettingsActivity.this.birthdayRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(11)) {
                return true;
            }
            if (adapterPosition == PrivacySettingsActivity.this.forwardsRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(5)) {
                return true;
            }
            if (adapterPosition == PrivacySettingsActivity.this.phoneNumberRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(6)) {
                return true;
            }
            if ((adapterPosition == PrivacySettingsActivity.this.voicesRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(8)) || adapterPosition == PrivacySettingsActivity.this.noncontactsRow) {
                return true;
            }
            if (adapterPosition != PrivacySettingsActivity.this.deleteAccountRow || PrivacySettingsActivity.this.getContactsController().getLoadingDeleteInfo()) {
                return (adapterPosition == PrivacySettingsActivity.this.newChatsRow && !PrivacySettingsActivity.this.getContactsController().getLoadingGlobalSettings()) || adapterPosition == PrivacySettingsActivity.this.emailLoginRow || adapterPosition == PrivacySettingsActivity.this.paymentsClearRow || adapterPosition == PrivacySettingsActivity.this.secretMapRow || adapterPosition == PrivacySettingsActivity.this.contactsSyncRow || adapterPosition == PrivacySettingsActivity.this.passportRow || adapterPosition == PrivacySettingsActivity.this.contactsDeleteRow || adapterPosition == PrivacySettingsActivity.this.contactsSuggestRow || adapterPosition == PrivacySettingsActivity.this.autoDeleteMesages || adapterPosition == PrivacySettingsActivity.this.botsBiometryRow;
            }
            return true;
        }

        @Override
        public int getItemCount() {
            return PrivacySettingsActivity.this.rowCount;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textSettingsCell;
            if (i == 0) {
                textSettingsCell = new TextSettingsCell(this.mContext);
                textSettingsCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            } else if (i == 1) {
                textSettingsCell = new TextInfoPrivacyCell(this.mContext);
            } else if (i == 2) {
                textSettingsCell = new HeaderCell(this.mContext);
                textSettingsCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            } else if (i == 4) {
                textSettingsCell = new ShadowSectionCell(this.mContext);
            } else if (i == 5) {
                textSettingsCell = new TextCell(this.mContext);
                textSettingsCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            } else {
                textSettingsCell = new TextCheckCell(this.mContext);
                textSettingsCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            }
            return new RecyclerListView.Holder(textSettingsCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            boolean z;
            String str;
            String format;
            String string2;
            int i2;
            String string3;
            String str2;
            String str3;
            String format2;
            String str4;
            String string4;
            String str5;
            boolean z2 = false;
            int itemViewType = viewHolder.getItemViewType();
            String str6 = null;
            int i3 = 16;
            if (itemViewType == 0) {
                boolean z3 = viewHolder.itemView.getTag() != null && ((Integer) viewHolder.itemView.getTag()).intValue() == i;
                viewHolder.itemView.setTag(Integer.valueOf(i));
                TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                if (i != PrivacySettingsActivity.this.webSessionsRow) {
                    if (i == PrivacySettingsActivity.this.phoneNumberRow) {
                        if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(6)) {
                            z2 = true;
                            i3 = 30;
                        } else {
                            str6 = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 6);
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("PrivacyPhone", R.string.PrivacyPhone), str6, true);
                    } else if (i == PrivacySettingsActivity.this.lastSeenRow) {
                        if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(0)) {
                            z2 = true;
                            i3 = 30;
                        } else {
                            str6 = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 0);
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("PrivacyLastSeen", R.string.PrivacyLastSeen), str6, true);
                    } else {
                        if (i == PrivacySettingsActivity.this.groupsRow) {
                            if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(1)) {
                                i3 = 30;
                            } else {
                                str6 = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 1);
                                r3 = false;
                            }
                            textSettingsCell.setTextAndValue(LocaleController.getString(R.string.PrivacyInvites), str6, false);
                        } else if (i == PrivacySettingsActivity.this.callsRow) {
                            if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(2)) {
                                z2 = true;
                                i3 = 30;
                            } else {
                                str6 = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 2);
                            }
                            textSettingsCell.setTextAndValue(LocaleController.getString("Calls", R.string.Calls), str6, true);
                        } else if (i == PrivacySettingsActivity.this.profilePhotoRow) {
                            if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(4)) {
                                z2 = true;
                                i3 = 30;
                            } else {
                                str6 = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 4);
                            }
                            textSettingsCell.setTextAndValue(LocaleController.getString("PrivacyProfilePhoto", R.string.PrivacyProfilePhoto), str6, true);
                        } else if (i == PrivacySettingsActivity.this.bioRow) {
                            if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(9)) {
                                z2 = true;
                                i3 = 30;
                            } else {
                                str6 = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 9);
                            }
                            textSettingsCell.setTextAndValue(LocaleController.getString("PrivacyBio", R.string.PrivacyBio), str6, true);
                        } else if (i == PrivacySettingsActivity.this.birthdayRow) {
                            if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(11)) {
                                z2 = true;
                                i3 = 30;
                            } else {
                                str6 = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 11);
                            }
                            textSettingsCell.setTextAndValue(LocaleController.getString(R.string.PrivacyBirthday), str6, true);
                        } else if (i == PrivacySettingsActivity.this.forwardsRow) {
                            if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(5)) {
                                z2 = true;
                                i3 = 30;
                            } else {
                                str6 = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 5);
                            }
                            textSettingsCell.setTextAndValue(LocaleController.getString("PrivacyForwards", R.string.PrivacyForwards), str6, true);
                        } else if (i == PrivacySettingsActivity.this.voicesRow) {
                            if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivacyInfo(8)) {
                                z = true;
                                i3 = 30;
                            } else {
                                if (!PrivacySettingsActivity.this.getUserConfig().isPremium()) {
                                    str6 = LocaleController.getString(R.string.P2PEverybody);
                                } else {
                                    str6 = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 8);
                                }
                                z = false;
                            }
                            textSettingsCell.setTextAndValue(PrivacySettingsActivity.this.addPremiumStar(LocaleController.getString(R.string.PrivacyVoiceMessages)), str6, PrivacySettingsActivity.this.noncontactsRow != -1);
                            textSettingsCell.getValueImageView().setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayIcon), PorterDuff.Mode.MULTIPLY));
                            z2 = z;
                        } else if (i == PrivacySettingsActivity.this.noncontactsRow) {
                            textSettingsCell.setTextAndValue(PrivacySettingsActivity.this.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium ? LocaleController.getString(R.string.PrivacyMessages) : PrivacySettingsActivity.this.addPremiumStar(LocaleController.getString(R.string.PrivacyMessages)), LocaleController.getString(PrivacySettingsActivity.this.noncontactsValue ? R.string.ContactsAndPremium : R.string.P2PEverybody), PrivacySettingsActivity.this.bioRow != -1);
                        } else if (i != PrivacySettingsActivity.this.passportRow) {
                            if (i == PrivacySettingsActivity.this.deleteAccountRow) {
                                if (!PrivacySettingsActivity.this.getContactsController().getLoadingDeleteInfo()) {
                                    int deleteAccountTTL = PrivacySettingsActivity.this.getContactsController().getDeleteAccountTTL();
                                    if (deleteAccountTTL <= 182) {
                                        str6 = LocaleController.formatPluralString("Months", deleteAccountTTL / 30, new Object[0]);
                                    } else if (deleteAccountTTL == 365) {
                                        str6 = LocaleController.formatPluralString("Years", deleteAccountTTL / 365, new Object[0]);
                                    } else if (deleteAccountTTL == 548) {
                                        str6 = LocaleController.getString(R.string.OneAndHalfYear);
                                    } else {
                                        str6 = LocaleController.formatPluralString("Days", deleteAccountTTL, new Object[0]);
                                    }
                                    r3 = false;
                                }
                                textSettingsCell.setTextAndValue(LocaleController.getString("DeleteAccountIfAwayFor3", R.string.DeleteAccountIfAwayFor3), str6, PrivacySettingsActivity.this.deleteAccountUpdate, false);
                                PrivacySettingsActivity.this.deleteAccountUpdate = false;
                            } else if (i != PrivacySettingsActivity.this.paymentsClearRow) {
                                if (i != PrivacySettingsActivity.this.botsBiometryRow) {
                                    if (i != PrivacySettingsActivity.this.secretMapRow) {
                                        if (i == PrivacySettingsActivity.this.contactsDeleteRow) {
                                            textSettingsCell.setText(LocaleController.getString("SyncContactsDelete", R.string.SyncContactsDelete), true);
                                        }
                                    } else {
                                        int i4 = SharedConfig.mapPreviewType;
                                        if (i4 == 0) {
                                            string = LocaleController.getString("MapPreviewProviderTelegram", R.string.MapPreviewProviderTelegram);
                                        } else if (i4 == 1) {
                                            string = LocaleController.getString("MapPreviewProviderGoogle", R.string.MapPreviewProviderGoogle);
                                        } else if (i4 == 2) {
                                            string = LocaleController.getString("MapPreviewProviderNobody", R.string.MapPreviewProviderNobody);
                                        } else {
                                            string = LocaleController.getString("MapPreviewProviderYandex", R.string.MapPreviewProviderYandex);
                                        }
                                        textSettingsCell.setTextAndValue(LocaleController.getString("MapPreviewProvider", R.string.MapPreviewProvider), string, PrivacySettingsActivity.this.secretMapUpdate, true);
                                        PrivacySettingsActivity.this.secretMapUpdate = false;
                                    }
                                } else {
                                    textSettingsCell.setText(LocaleController.getString(R.string.PrivacyBiometryBotsButton), true);
                                }
                            } else {
                                textSettingsCell.setText(LocaleController.getString("PrivacyPaymentsClear", R.string.PrivacyPaymentsClear), true);
                            }
                        } else {
                            textSettingsCell.setText(LocaleController.getString("TelegramPassport", R.string.TelegramPassport), true);
                        }
                        z2 = r3;
                    }
                } else {
                    textSettingsCell.setText(LocaleController.getString("WebSessionsTitle", R.string.WebSessionsTitle), false);
                }
                textSettingsCell.setDrawLoading(z2, i3, z3);
                return;
            }
            if (itemViewType == 1) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(this.mContext, i == getItemCount() - 1 ? R.drawable.greydivider_bottom : R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                if (i != PrivacySettingsActivity.this.deleteAccountDetailRow) {
                    if (i != PrivacySettingsActivity.this.groupsDetailRow) {
                        if (i != PrivacySettingsActivity.this.sessionsDetailRow) {
                            if (i != PrivacySettingsActivity.this.secretDetailRow) {
                                if (i != PrivacySettingsActivity.this.botsDetailRow) {
                                    if (i != PrivacySettingsActivity.this.privacyShadowRow) {
                                        if (i != PrivacySettingsActivity.this.contactsDetailRow) {
                                            if (i == PrivacySettingsActivity.this.newChatsSectionRow) {
                                                textInfoPrivacyCell.setText(LocaleController.getString("ArchiveAndMuteInfo", R.string.ArchiveAndMuteInfo));
                                                return;
                                            }
                                            return;
                                        }
                                        textInfoPrivacyCell.setText(LocaleController.getString("SuggestContactsInfo", R.string.SuggestContactsInfo));
                                        return;
                                    }
                                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyInvitesInfo));
                                    return;
                                }
                                textInfoPrivacyCell.setText(LocaleController.getString("PrivacyBotsInfo", R.string.PrivacyBotsInfo));
                                return;
                            }
                            textInfoPrivacyCell.setText(LocaleController.getString("SecretWebPageInfo", R.string.SecretWebPageInfo));
                            return;
                        }
                        textInfoPrivacyCell.setText(LocaleController.getString("SessionsSettingsInfo", R.string.SessionsSettingsInfo));
                        return;
                    }
                    textInfoPrivacyCell.setText(LocaleController.getString("GroupsAndChannelsHelp", R.string.GroupsAndChannelsHelp));
                    return;
                }
                textInfoPrivacyCell.setText(LocaleController.getString("DeleteAccountHelp", R.string.DeleteAccountHelp));
                return;
            }
            if (itemViewType == 2) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (i != PrivacySettingsActivity.this.privacySectionRow) {
                    if (i != PrivacySettingsActivity.this.securitySectionRow) {
                        if (i != PrivacySettingsActivity.this.advancedSectionRow) {
                            if (i != PrivacySettingsActivity.this.secretSectionRow) {
                                if (i != PrivacySettingsActivity.this.botsSectionRow) {
                                    if (i != PrivacySettingsActivity.this.contactsSectionRow) {
                                        if (i == PrivacySettingsActivity.this.newChatsHeaderRow) {
                                            headerCell.setText(LocaleController.getString("NewChatsFromNonContacts", R.string.NewChatsFromNonContacts));
                                            return;
                                        }
                                        return;
                                    }
                                    headerCell.setText(LocaleController.getString("Contacts", R.string.Contacts));
                                    return;
                                }
                                headerCell.setText(LocaleController.getString("PrivacyBots", R.string.PrivacyBots));
                                return;
                            }
                            headerCell.setText(LocaleController.getString("SecretChat", R.string.SecretChat));
                            return;
                        }
                        headerCell.setText(LocaleController.getString("DeleteMyAccount", R.string.DeleteMyAccount));
                        return;
                    }
                    headerCell.setText(LocaleController.getString("SecurityTitle", R.string.SecurityTitle));
                    return;
                }
                headerCell.setText(LocaleController.getString("PrivacyTitle", R.string.PrivacyTitle));
                return;
            }
            if (itemViewType == 3) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                if (i != PrivacySettingsActivity.this.secretWebpageRow) {
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
                textCheckCell.setTextAndCheck(LocaleController.getString("SecretWebPage", R.string.SecretWebPage), PrivacySettingsActivity.this.getMessagesController().secretWebpagePreview == 1, false);
                return;
            }
            if (itemViewType != 5) {
                return;
            }
            View view = viewHolder.itemView;
            TextCell textCell = (TextCell) view;
            boolean z4 = view.getTag() != null && ((Integer) viewHolder.itemView.getTag()).intValue() == i;
            viewHolder.itemView.setTag(Integer.valueOf(i));
            textCell.setPrioritizeTitleOverValue(false);
            if (i != PrivacySettingsActivity.this.autoDeleteMesages) {
                String str7 = "";
                if (i == PrivacySettingsActivity.this.sessionsRow) {
                    if (PrivacySettingsActivity.this.devicesActivityPreload.getSessionsCount() == 0) {
                        if (PrivacySettingsActivity.this.getMessagesController().lastKnownSessionsCount == 0) {
                            str4 = "";
                            PrivacySettingsActivity.this.getMessagesController().lastKnownSessionsCount = PrivacySettingsActivity.this.devicesActivityPreload.getSessionsCount();
                            textCell.setTextAndValueAndIcon(LocaleController.getString("SessionsTitle", R.string.SessionsTitle), str4, true, R.drawable.msg2_devices, false);
                        } else {
                            format2 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(PrivacySettingsActivity.this.getMessagesController().lastKnownSessionsCount));
                        }
                    } else {
                        format2 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(PrivacySettingsActivity.this.devicesActivityPreload.getSessionsCount()));
                    }
                    str4 = format2;
                    r3 = false;
                    PrivacySettingsActivity.this.getMessagesController().lastKnownSessionsCount = PrivacySettingsActivity.this.devicesActivityPreload.getSessionsCount();
                    textCell.setTextAndValueAndIcon(LocaleController.getString("SessionsTitle", R.string.SessionsTitle), str4, true, R.drawable.msg2_devices, false);
                } else {
                    if (i == PrivacySettingsActivity.this.emailLoginRow) {
                        if (PrivacySettingsActivity.this.currentPassword == null) {
                            z2 = true;
                            str3 = str7;
                        } else {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(PrivacySettingsActivity.this.currentPassword.login_email_pattern);
                            int indexOf = PrivacySettingsActivity.this.currentPassword.login_email_pattern.indexOf(42);
                            int lastIndexOf = PrivacySettingsActivity.this.currentPassword.login_email_pattern.lastIndexOf(42);
                            str3 = valueOf;
                            str3 = valueOf;
                            str3 = valueOf;
                            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                                textStyleRun.flags |= 256;
                                textStyleRun.start = indexOf;
                                int i5 = lastIndexOf + 1;
                                textStyleRun.end = i5;
                                valueOf.setSpan(new TextStyleSpan(textStyleRun), indexOf, i5, 0);
                                str3 = valueOf;
                            }
                        }
                        textCell.setPrioritizeTitleOverValue(true);
                        textCell.setTextAndSpoilersValueAndIcon(LocaleController.getString(R.string.EmailLogin), str3, R.drawable.msg2_email, true);
                    } else if (i == PrivacySettingsActivity.this.passwordRow) {
                        if (PrivacySettingsActivity.this.currentPassword == null) {
                            str2 = "";
                        } else {
                            if (PrivacySettingsActivity.this.currentPassword.has_password) {
                                string3 = LocaleController.getString("PasswordOn", R.string.PasswordOn);
                            } else {
                                string3 = LocaleController.getString("PasswordOff", R.string.PasswordOff);
                            }
                            str2 = string3;
                            r3 = false;
                        }
                        textCell.setTextAndValueAndIcon(LocaleController.getString("TwoStepVerification", R.string.TwoStepVerification), str2, true, R.drawable.msg2_permissions, true);
                    } else if (i != PrivacySettingsActivity.this.passcodeRow) {
                        if (i == PrivacySettingsActivity.this.blockedRow) {
                            int i6 = PrivacySettingsActivity.this.getMessagesController().totalBlockedCount;
                            if (i6 == 0) {
                                format = LocaleController.getString("BlockedEmpty", R.string.BlockedEmpty);
                            } else if (i6 > 0) {
                                format = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(i6));
                            } else {
                                str = "";
                                textCell.setTextAndValueAndIcon(LocaleController.getString("BlockedUsers", R.string.BlockedUsers), str, true, R.drawable.msg2_block2, true);
                            }
                            str = format;
                            r3 = false;
                            textCell.setTextAndValueAndIcon(LocaleController.getString("BlockedUsers", R.string.BlockedUsers), str, true, R.drawable.msg2_block2, true);
                        }
                    } else {
                        if (SharedConfig.passcodeHash.length() != 0) {
                            string2 = LocaleController.getString("PasswordOn", R.string.PasswordOn);
                            i2 = R.drawable.msg2_secret;
                        } else {
                            string2 = LocaleController.getString("PasswordOff", R.string.PasswordOff);
                            i2 = R.drawable.msg2_secret;
                        }
                        textCell.setTextAndValueAndIcon(LocaleController.getString("Passcode", R.string.Passcode), string2, true, i2, true);
                    }
                    textCell.setDrawLoading(z2, 16, z4);
                }
            } else {
                int globalTTl = PrivacySettingsActivity.this.getUserConfig().getGlobalTTl();
                if (globalTTl == -1) {
                    str5 = null;
                } else {
                    if (globalTTl > 0) {
                        string4 = LocaleController.formatTTLString(globalTTl * 60);
                    } else {
                        string4 = LocaleController.getString("PasswordOff", R.string.PasswordOff);
                    }
                    str5 = string4;
                    r3 = false;
                }
                textCell.setTextAndValueAndIcon(LocaleController.getString("AutoDeleteMessages", R.string.AutoDeleteMessages), str5, true, R.drawable.msg2_autodelete, true);
            }
            z2 = r3;
            textCell.setDrawLoading(z2, 16, z4);
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
            return (i == PrivacySettingsActivity.this.autoDeleteMesages || i == PrivacySettingsActivity.this.sessionsRow || i == PrivacySettingsActivity.this.emailLoginRow || i == PrivacySettingsActivity.this.passwordRow || i == PrivacySettingsActivity.this.passcodeRow || i == PrivacySettingsActivity.this.blockedRow) ? 5 : 0;
        }
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

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{TextSettingsCell.class, HeaderCell.class, TextCheckCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        ActionBar actionBar = this.actionBar;
        int i = ThemeDescription.FLAG_BACKGROUND;
        int i2 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, i, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrack));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrackChecked));
        return arrayList;
    }
}
