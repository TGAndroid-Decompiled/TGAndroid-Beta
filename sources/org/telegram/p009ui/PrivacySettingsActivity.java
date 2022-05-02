package org.telegram.p009ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
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
import org.telegram.messenger.C0890R;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C0945ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Cells.CheckBoxCell;
import org.telegram.p009ui.Cells.HeaderCell;
import org.telegram.p009ui.Cells.RadioColorCell;
import org.telegram.p009ui.Cells.TextCheckCell;
import org.telegram.p009ui.Cells.TextInfoPrivacyCell;
import org.telegram.p009ui.Cells.TextSettingsCell;
import org.telegram.p009ui.Components.AlertsCreator;
import org.telegram.p009ui.Components.BulletinFactory;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$PrivacyRule;
import org.telegram.tgnet.TLRPC$TL_accountDaysTTL;
import org.telegram.tgnet.TLRPC$TL_account_authorizationForm;
import org.telegram.tgnet.TLRPC$TL_account_getPassword;
import org.telegram.tgnet.TLRPC$TL_account_password;
import org.telegram.tgnet.TLRPC$TL_account_setAccountTTL;
import org.telegram.tgnet.TLRPC$TL_boolTrue;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_globalPrivacySettings;
import org.telegram.tgnet.TLRPC$TL_payments_clearSavedInfo;
import org.telegram.tgnet.TLRPC$TL_privacyValueAllowAll;
import org.telegram.tgnet.TLRPC$TL_privacyValueAllowChatParticipants;
import org.telegram.tgnet.TLRPC$TL_privacyValueAllowUsers;
import org.telegram.tgnet.TLRPC$TL_privacyValueDisallowAll;
import org.telegram.tgnet.TLRPC$TL_privacyValueDisallowChatParticipants;
import org.telegram.tgnet.TLRPC$TL_privacyValueDisallowUsers;

public class PrivacySettingsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private int advancedSectionRow;
    private boolean archiveChats;
    private int blockedRow;
    private int botsDetailRow;
    private int botsSectionRow;
    private int callsRow;
    private boolean[] clear = new boolean[2];
    private int contactsDeleteRow;
    private int contactsDetailRow;
    private int contactsSectionRow;
    private int contactsSuggestRow;
    private int contactsSyncRow;
    private TLRPC$TL_account_password currentPassword;
    private boolean currentSuggest;
    private boolean currentSync;
    private int deleteAccountDetailRow;
    private int deleteAccountRow;
    private int forwardsRow;
    private int groupsDetailRow;
    private int groupsRow;
    private int lastSeenRow;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private int newChatsHeaderRow;
    private int newChatsRow;
    private int newChatsSectionRow;
    private boolean newSuggest;
    private boolean newSync;
    private int passcodeRow;
    private int passportRow;
    private int passwordRow;
    private int paymentsClearRow;
    private int phoneNumberRow;
    private int privacySectionRow;
    private int profilePhotoRow;
    private AlertDialog progressDialog;
    private int rowCount;
    private int secretDetailRow;
    private int secretMapRow;
    private int secretSectionRow;
    private int secretWebpageRow;
    private int securitySectionRow;
    private int sessionsDetailRow;
    private int sessionsRow;
    private int webSessionsRow;

    public static void lambda$createView$12(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$onFragmentDestroy$0(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$onFragmentDestroy$1(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
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
        }
        updateRows();
        loadPasswordSettings();
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.blockedUsersDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.PrivacySettingsActivity.onFragmentDestroy():void");
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(C0890R.C0891drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString("PrivacySettings", C0890R.string.PrivacySettings));
        this.actionBar.setActionBarMenuOnItemClick(new C0945ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    PrivacySettingsActivity.this.finishFragment();
                }
            }
        });
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setLayoutManager(new LinearLayoutManager(this, context, 1, false) {
            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        });
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setItemAnimator(null);
        this.listView.setLayoutAnimation(null);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                PrivacySettingsActivity.this.lambda$createView$15(view, i);
            }
        });
        return this.fragmentView;
    }

    public void lambda$createView$15(View view, int i) {
        String str;
        if (view.isEnabled()) {
            if (i == this.blockedRow) {
                presentFragment(new PrivacyUsersActivity());
                return;
            }
            boolean z = false;
            if (i == this.sessionsRow) {
                presentFragment(new SessionsActivity(0));
            } else if (i == this.webSessionsRow) {
                presentFragment(new SessionsActivity(1));
            } else {
                int i2 = 6;
                if (i == this.deleteAccountRow) {
                    if (getParentActivity() != null) {
                        int deleteAccountTTL = getContactsController().getDeleteAccountTTL();
                        int i3 = deleteAccountTTL <= 31 ? 0 : deleteAccountTTL <= 93 ? 1 : deleteAccountTTL <= 182 ? 2 : 3;
                        final AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                        builder.setTitle(LocaleController.getString("DeleteAccountTitle", C0890R.string.DeleteAccountTitle));
                        String[] strArr = {LocaleController.formatPluralString("Months", 1), LocaleController.formatPluralString("Months", 3), LocaleController.formatPluralString("Months", 6), LocaleController.formatPluralString("Years", 1)};
                        LinearLayout linearLayout = new LinearLayout(getParentActivity());
                        linearLayout.setOrientation(1);
                        builder.setView(linearLayout);
                        int i4 = 0;
                        while (i4 < 4) {
                            RadioColorCell radioColorCell = new RadioColorCell(getParentActivity());
                            radioColorCell.setPadding(AndroidUtilities.m34dp(4.0f), 0, AndroidUtilities.m34dp(4.0f), 0);
                            radioColorCell.setTag(Integer.valueOf(i4));
                            radioColorCell.setCheckColor(Theme.getColor("radioBackground"), Theme.getColor("dialogRadioBackgroundChecked"));
                            radioColorCell.setTextAndValue(strArr[i4], i3 == i4);
                            linearLayout.addView(radioColorCell);
                            radioColorCell.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view2) {
                                    PrivacySettingsActivity.this.lambda$createView$4(builder, view2);
                                }
                            });
                            i4++;
                        }
                        builder.setNegativeButton(LocaleController.getString("Cancel", C0890R.string.Cancel), null);
                        showDialog(builder.create());
                    }
                } else if (i == this.lastSeenRow) {
                    presentFragment(new PrivacyControlActivity(0));
                } else if (i == this.phoneNumberRow) {
                    presentFragment(new PrivacyControlActivity(6));
                } else if (i == this.groupsRow) {
                    presentFragment(new PrivacyControlActivity(1));
                } else if (i == this.callsRow) {
                    presentFragment(new PrivacyControlActivity(2));
                } else if (i == this.profilePhotoRow) {
                    presentFragment(new PrivacyControlActivity(4));
                } else if (i == this.forwardsRow) {
                    presentFragment(new PrivacyControlActivity(5));
                } else if (i == this.passwordRow) {
                    TLRPC$TL_account_password tLRPC$TL_account_password = this.currentPassword;
                    if (tLRPC$TL_account_password != null) {
                        if (!TwoStepVerificationActivity.canHandleCurrentPassword(tLRPC$TL_account_password, false)) {
                            AlertsCreator.showUpdateAppAlert(getParentActivity(), LocaleController.getString("UpdateAppAlert", C0890R.string.UpdateAppAlert), true);
                        }
                        TLRPC$TL_account_password tLRPC$TL_account_password2 = this.currentPassword;
                        if (tLRPC$TL_account_password2.has_password) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.setPassword(this.currentPassword);
                            presentFragment(twoStepVerificationActivity);
                            return;
                        }
                        if (!TextUtils.isEmpty(tLRPC$TL_account_password2.email_unconfirmed_pattern)) {
                            i2 = 5;
                        }
                        presentFragment(new TwoStepVerificationSetupActivity(i2, this.currentPassword));
                    }
                } else if (i == this.passcodeRow) {
                    presentFragment(PasscodeActivity.determineOpenFragment());
                } else if (i == this.secretWebpageRow) {
                    if (getMessagesController().secretWebpagePreview == 1) {
                        getMessagesController().secretWebpagePreview = 0;
                    } else {
                        getMessagesController().secretWebpagePreview = 1;
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", getMessagesController().secretWebpagePreview).commit();
                    if (view instanceof TextCheckCell) {
                        TextCheckCell textCheckCell = (TextCheckCell) view;
                        if (getMessagesController().secretWebpagePreview == 1) {
                            z = true;
                        }
                        textCheckCell.setChecked(z);
                    }
                } else if (i == this.contactsDeleteRow) {
                    if (getParentActivity() != null) {
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity());
                        builder2.setTitle(LocaleController.getString("SyncContactsDeleteTitle", C0890R.string.SyncContactsDeleteTitle));
                        builder2.setMessage(AndroidUtilities.replaceTags(LocaleController.getString("SyncContactsDeleteText", C0890R.string.SyncContactsDeleteText)));
                        builder2.setNegativeButton(LocaleController.getString("Cancel", C0890R.string.Cancel), null);
                        builder2.setPositiveButton(LocaleController.getString("Delete", C0890R.string.Delete), new DialogInterface.OnClickListener() {
                            @Override
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                PrivacySettingsActivity.this.lambda$createView$6(dialogInterface, i5);
                            }
                        });
                        AlertDialog create = builder2.create();
                        showDialog(create);
                        TextView textView = (TextView) create.getButton(-1);
                        if (textView != null) {
                            textView.setTextColor(Theme.getColor("dialogTextRed2"));
                        }
                    }
                } else if (i == this.contactsSuggestRow) {
                    final TextCheckCell textCheckCell2 = (TextCheckCell) view;
                    if (this.newSuggest) {
                        AlertDialog.Builder builder3 = new AlertDialog.Builder(getParentActivity());
                        builder3.setTitle(LocaleController.getString("SuggestContactsTitle", C0890R.string.SuggestContactsTitle));
                        builder3.setMessage(LocaleController.getString("SuggestContactsAlert", C0890R.string.SuggestContactsAlert));
                        builder3.setPositiveButton(LocaleController.getString("MuteDisable", C0890R.string.MuteDisable), new DialogInterface.OnClickListener() {
                            @Override
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                PrivacySettingsActivity.this.lambda$createView$9(textCheckCell2, dialogInterface, i5);
                            }
                        });
                        builder3.setNegativeButton(LocaleController.getString("Cancel", C0890R.string.Cancel), null);
                        AlertDialog create2 = builder3.create();
                        showDialog(create2);
                        TextView textView2 = (TextView) create2.getButton(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(Theme.getColor("dialogTextRed2"));
                            return;
                        }
                        return;
                    }
                    this.newSuggest = true;
                    textCheckCell2.setChecked(true);
                } else if (i == this.newChatsRow) {
                    boolean z2 = !this.archiveChats;
                    this.archiveChats = z2;
                    ((TextCheckCell) view).setChecked(z2);
                } else if (i == this.contactsSyncRow) {
                    boolean z3 = !this.newSync;
                    this.newSync = z3;
                    if (view instanceof TextCheckCell) {
                        ((TextCheckCell) view).setChecked(z3);
                    }
                } else if (i == this.secretMapRow) {
                    AlertsCreator.showSecretLocationAlert(getParentActivity(), this.currentAccount, new Runnable() {
                        @Override
                        public final void run() {
                            PrivacySettingsActivity.this.lambda$createView$10();
                        }
                    }, false, null);
                } else if (i == this.paymentsClearRow) {
                    AlertDialog.Builder builder4 = new AlertDialog.Builder(getParentActivity());
                    builder4.setTitle(LocaleController.getString("PrivacyPaymentsClearAlertTitle", C0890R.string.PrivacyPaymentsClearAlertTitle));
                    builder4.setMessage(LocaleController.getString("PrivacyPaymentsClearAlertText", C0890R.string.PrivacyPaymentsClearAlertText));
                    LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
                    linearLayout2.setOrientation(1);
                    builder4.setView(linearLayout2);
                    int i5 = 0;
                    for (int i6 = 2; i5 < i6; i6 = 2) {
                        if (i5 == 0) {
                            str = LocaleController.getString("PrivacyClearShipping", C0890R.string.PrivacyClearShipping);
                        } else {
                            str = LocaleController.getString("PrivacyClearPayment", C0890R.string.PrivacyClearPayment);
                        }
                        this.clear[i5] = true;
                        CheckBoxCell checkBoxCell = new CheckBoxCell(getParentActivity(), 1, 21, null);
                        checkBoxCell.setTag(Integer.valueOf(i5));
                        checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                        checkBoxCell.setPadding(AndroidUtilities.m34dp(4.0f), 0, AndroidUtilities.m34dp(4.0f), 0);
                        linearLayout2.addView(checkBoxCell, LayoutHelper.createLinear(-1, 50));
                        checkBoxCell.setText(str, null, true, false);
                        checkBoxCell.setTextColor(Theme.getColor("dialogTextBlack"));
                        checkBoxCell.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view2) {
                                PrivacySettingsActivity.this.lambda$createView$11(view2);
                            }
                        });
                        i5++;
                    }
                    builder4.setPositiveButton(LocaleController.getString("ClearButton", C0890R.string.ClearButton), new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i7) {
                            PrivacySettingsActivity.this.lambda$createView$14(dialogInterface, i7);
                        }
                    });
                    builder4.setNegativeButton(LocaleController.getString("Cancel", C0890R.string.Cancel), null);
                    showDialog(builder4.create());
                    AlertDialog create3 = builder4.create();
                    showDialog(create3);
                    TextView textView3 = (TextView) create3.getButton(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(Theme.getColor("dialogTextRed2"));
                    }
                } else if (i == this.passportRow) {
                    presentFragment(new PassportActivity(5, 0L, "", "", (String) null, (String) null, (String) null, (TLRPC$TL_account_authorizationForm) null, (TLRPC$TL_account_password) null));
                }
            }
        }
    }

    public void lambda$createView$4(AlertDialog.Builder builder, View view) {
        int i;
        builder.getDismissRunnable().run();
        Integer num = (Integer) view.getTag();
        if (num.intValue() == 0) {
            i = 30;
        } else if (num.intValue() == 1) {
            i = 90;
        } else if (num.intValue() == 2) {
            i = 182;
        } else {
            i = num.intValue() == 3 ? 365 : 0;
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
                PrivacySettingsActivity.this.lambda$createView$3(alertDialog, tLRPC$TL_account_setAccountTTL, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$createView$3(final AlertDialog alertDialog, final TLRPC$TL_account_setAccountTTL tLRPC$TL_account_setAccountTTL, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PrivacySettingsActivity.this.lambda$createView$2(alertDialog, tLObject, tLRPC$TL_account_setAccountTTL);
            }
        });
    }

    public void lambda$createView$2(AlertDialog alertDialog, TLObject tLObject, TLRPC$TL_account_setAccountTTL tLRPC$TL_account_setAccountTTL) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.m30e(e);
        }
        if (tLObject instanceof TLRPC$TL_boolTrue) {
            getContactsController().setDeleteAccountTTL(tLRPC$TL_account_setAccountTTL.ttl.days);
            this.listAdapter.notifyDataSetChanged();
        }
    }

    public void lambda$createView$6(DialogInterface dialogInterface, int i) {
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
                PrivacySettingsActivity.this.lambda$createView$5();
            }
        });
    }

    public void lambda$createView$5() {
        this.progressDialog.dismiss();
    }

    public void lambda$createView$9(final TextCheckCell textCheckCell, DialogInterface dialogInterface, int i) {
        TLRPC$TL_payments_clearSavedInfo tLRPC$TL_payments_clearSavedInfo = new TLRPC$TL_payments_clearSavedInfo();
        boolean[] zArr = this.clear;
        tLRPC$TL_payments_clearSavedInfo.credentials = zArr[1];
        tLRPC$TL_payments_clearSavedInfo.info = zArr[0];
        getUserConfig().tmpPassword = null;
        getUserConfig().saveConfig(false);
        getConnectionsManager().sendRequest(tLRPC$TL_payments_clearSavedInfo, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                PrivacySettingsActivity.this.lambda$createView$8(textCheckCell, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$createView$8(final TextCheckCell textCheckCell, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PrivacySettingsActivity.this.lambda$createView$7(textCheckCell);
            }
        });
    }

    public void lambda$createView$7(TextCheckCell textCheckCell) {
        boolean z = !this.newSuggest;
        this.newSuggest = z;
        textCheckCell.setChecked(z);
    }

    public void lambda$createView$10() {
        this.listAdapter.notifyDataSetChanged();
    }

    public void lambda$createView$11(View view) {
        CheckBoxCell checkBoxCell = (CheckBoxCell) view;
        int intValue = ((Integer) checkBoxCell.getTag()).intValue();
        boolean[] zArr = this.clear;
        zArr[intValue] = !zArr[intValue];
        checkBoxCell.setChecked(zArr[intValue], true);
    }

    public void lambda$createView$14(DialogInterface dialogInterface, int i) {
        try {
            Dialog dialog = this.visibleDialog;
            if (dialog != null) {
                dialog.dismiss();
            }
        } catch (Exception e) {
            FileLog.m30e(e);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString("PrivacyPaymentsClearAlertTitle", C0890R.string.PrivacyPaymentsClearAlertTitle));
        builder.setMessage(LocaleController.getString("PrivacyPaymentsClearAlert", C0890R.string.PrivacyPaymentsClearAlert));
        builder.setPositiveButton(LocaleController.getString("ClearButton", C0890R.string.ClearButton), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface2, int i2) {
                PrivacySettingsActivity.this.lambda$createView$13(dialogInterface2, i2);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", C0890R.string.Cancel), null);
        showDialog(builder.create());
        AlertDialog create = builder.create();
        showDialog(create);
        TextView textView = (TextView) create.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor("dialogTextRed2"));
        }
    }

    public void lambda$createView$13(DialogInterface dialogInterface, int i) {
        String str;
        TLRPC$TL_payments_clearSavedInfo tLRPC$TL_payments_clearSavedInfo = new TLRPC$TL_payments_clearSavedInfo();
        boolean[] zArr = this.clear;
        tLRPC$TL_payments_clearSavedInfo.credentials = zArr[1];
        tLRPC$TL_payments_clearSavedInfo.info = zArr[0];
        getUserConfig().tmpPassword = null;
        getUserConfig().saveConfig(false);
        getConnectionsManager().sendRequest(tLRPC$TL_payments_clearSavedInfo, PrivacySettingsActivity$$ExternalSyntheticLambda15.INSTANCE);
        boolean[] zArr2 = this.clear;
        if (zArr2[0] && zArr2[1]) {
            str = LocaleController.getString("PrivacyPaymentsPaymentShippingCleared", C0890R.string.PrivacyPaymentsPaymentShippingCleared);
        } else if (zArr2[0]) {
            str = LocaleController.getString("PrivacyPaymentsShippingInfoCleared", C0890R.string.PrivacyPaymentsShippingInfoCleared);
        } else if (zArr2[1]) {
            str = LocaleController.getString("PrivacyPaymentsPaymentInfoCleared", C0890R.string.PrivacyPaymentsPaymentInfoCleared);
        } else {
            return;
        }
        BulletinFactory.m13of(this).createSimpleBulletin(C0890R.raw.chats_infotip, str).show();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.privacyRulesUpdated) {
            TLRPC$TL_globalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
            if (globalPrivacySettings != null) {
                this.archiveChats = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
            }
            ListAdapter listAdapter = this.listAdapter;
            if (listAdapter != null) {
                listAdapter.notifyDataSetChanged();
            }
        } else if (i == NotificationCenter.blockedUsersDidLoad) {
            this.listAdapter.notifyItemChanged(this.blockedRow);
        } else if (i != NotificationCenter.didSetOrRemoveTwoStepPassword) {
        } else {
            if (objArr.length > 0) {
                this.currentPassword = (TLRPC$TL_account_password) objArr[0];
                ListAdapter listAdapter2 = this.listAdapter;
                if (listAdapter2 != null) {
                    listAdapter2.notifyItemChanged(this.passwordRow);
                    return;
                }
                return;
            }
            this.currentPassword = null;
            loadPasswordSettings();
            updateRows();
        }
    }

    private void updateRows() {
        this.rowCount = 0;
        int i = 0 + 1;
        this.rowCount = i;
        this.privacySectionRow = 0;
        int i2 = i + 1;
        this.rowCount = i2;
        this.blockedRow = i;
        int i3 = i2 + 1;
        this.rowCount = i3;
        this.phoneNumberRow = i2;
        int i4 = i3 + 1;
        this.rowCount = i4;
        this.lastSeenRow = i3;
        int i5 = i4 + 1;
        this.rowCount = i5;
        this.profilePhotoRow = i4;
        int i6 = i5 + 1;
        this.rowCount = i6;
        this.forwardsRow = i5;
        int i7 = i6 + 1;
        this.rowCount = i7;
        this.callsRow = i6;
        int i8 = i7 + 1;
        this.rowCount = i8;
        this.groupsRow = i7;
        int i9 = i8 + 1;
        this.rowCount = i9;
        this.groupsDetailRow = i8;
        int i10 = i9 + 1;
        this.rowCount = i10;
        this.securitySectionRow = i9;
        int i11 = i10 + 1;
        this.rowCount = i11;
        this.passcodeRow = i10;
        int i12 = i11 + 1;
        this.rowCount = i12;
        this.passwordRow = i11;
        int i13 = i12 + 1;
        this.rowCount = i13;
        this.sessionsRow = i12;
        this.rowCount = i13 + 1;
        this.sessionsDetailRow = i13;
        if (getMessagesController().autoarchiveAvailable) {
            int i14 = this.rowCount;
            int i15 = i14 + 1;
            this.rowCount = i15;
            this.newChatsHeaderRow = i14;
            int i16 = i15 + 1;
            this.rowCount = i16;
            this.newChatsRow = i15;
            this.rowCount = i16 + 1;
            this.newChatsSectionRow = i16;
        } else {
            this.newChatsHeaderRow = -1;
            this.newChatsRow = -1;
            this.newChatsSectionRow = -1;
        }
        int i17 = this.rowCount;
        int i18 = i17 + 1;
        this.rowCount = i18;
        this.advancedSectionRow = i17;
        int i19 = i18 + 1;
        this.rowCount = i19;
        this.deleteAccountRow = i18;
        int i20 = i19 + 1;
        this.rowCount = i20;
        this.deleteAccountDetailRow = i19;
        this.rowCount = i20 + 1;
        this.botsSectionRow = i20;
        if (getUserConfig().hasSecureData) {
            int i21 = this.rowCount;
            this.rowCount = i21 + 1;
            this.passportRow = i21;
        } else {
            this.passportRow = -1;
        }
        int i22 = this.rowCount;
        int i23 = i22 + 1;
        this.rowCount = i23;
        this.paymentsClearRow = i22;
        int i24 = i23 + 1;
        this.rowCount = i24;
        this.webSessionsRow = i23;
        int i25 = i24 + 1;
        this.rowCount = i25;
        this.botsDetailRow = i24;
        int i26 = i25 + 1;
        this.rowCount = i26;
        this.contactsSectionRow = i25;
        int i27 = i26 + 1;
        this.rowCount = i27;
        this.contactsDeleteRow = i26;
        int i28 = i27 + 1;
        this.rowCount = i28;
        this.contactsSyncRow = i27;
        int i29 = i28 + 1;
        this.rowCount = i29;
        this.contactsSuggestRow = i28;
        int i30 = i29 + 1;
        this.rowCount = i30;
        this.contactsDetailRow = i29;
        int i31 = i30 + 1;
        this.rowCount = i31;
        this.secretSectionRow = i30;
        int i32 = i31 + 1;
        this.rowCount = i32;
        this.secretMapRow = i31;
        int i33 = i32 + 1;
        this.rowCount = i33;
        this.secretWebpageRow = i32;
        this.rowCount = i33 + 1;
        this.secretDetailRow = i33;
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    private void loadPasswordSettings() {
        getConnectionsManager().sendRequest(new TLRPC$TL_account_getPassword(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                PrivacySettingsActivity.this.lambda$loadPasswordSettings$17(tLObject, tLRPC$TL_error);
            }
        }, 10);
    }

    public void lambda$loadPasswordSettings$17(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            final TLRPC$TL_account_password tLRPC$TL_account_password = (TLRPC$TL_account_password) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PrivacySettingsActivity.this.lambda$loadPasswordSettings$16(tLRPC$TL_account_password);
                }
            });
        }
    }

    public void lambda$loadPasswordSettings$16(TLRPC$TL_account_password tLRPC$TL_account_password) {
        this.currentPassword = tLRPC$TL_account_password;
        TwoStepVerificationActivity.initPasswordNewAlgo(tLRPC$TL_account_password);
        if (getUserConfig().hasSecureData || !tLRPC$TL_account_password.has_secure_values) {
            ListAdapter listAdapter = this.listAdapter;
            if (listAdapter != null) {
                listAdapter.notifyItemChanged(this.passwordRow);
                return;
            }
            return;
        }
        getUserConfig().hasSecureData = true;
        getUserConfig().saveConfig(false);
        updateRows();
    }

    public static String formatRulesString(AccountInstance accountInstance, int i) {
        ArrayList<TLRPC$PrivacyRule> privacyRules = accountInstance.getContactsController().getPrivacyRules(i);
        if (privacyRules.size() != 0) {
            char c = 65535;
            int i2 = 0;
            int i3 = 0;
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
                } else if (c == 65535) {
                    if (tLRPC$PrivacyRule instanceof TLRPC$TL_privacyValueAllowAll) {
                        c = 0;
                    } else {
                        c = tLRPC$PrivacyRule instanceof TLRPC$TL_privacyValueDisallowAll ? (char) 1 : (char) 2;
                    }
                }
            }
            if (c == 0 || (c == 65535 && i2 > 0)) {
                return i == 3 ? i2 == 0 ? LocaleController.getString("P2PEverybody", C0890R.string.P2PEverybody) : LocaleController.formatString("P2PEverybodyMinus", C0890R.string.P2PEverybodyMinus, Integer.valueOf(i2)) : i2 == 0 ? LocaleController.getString("LastSeenEverybody", C0890R.string.LastSeenEverybody) : LocaleController.formatString("LastSeenEverybodyMinus", C0890R.string.LastSeenEverybodyMinus, Integer.valueOf(i2));
            }
            if (c != 2 && (c != 65535 || i2 <= 0 || i3 <= 0)) {
                return (c == 1 || i3 > 0) ? i == 3 ? i3 == 0 ? LocaleController.getString("P2PNobody", C0890R.string.P2PNobody) : LocaleController.formatString("P2PNobodyPlus", C0890R.string.P2PNobodyPlus, Integer.valueOf(i3)) : i3 == 0 ? LocaleController.getString("LastSeenNobody", C0890R.string.LastSeenNobody) : LocaleController.formatString("LastSeenNobodyPlus", C0890R.string.LastSeenNobodyPlus, Integer.valueOf(i3)) : "unknown";
            }
            if (i == 3) {
                if (i3 == 0 && i2 == 0) {
                    return LocaleController.getString("P2PContacts", C0890R.string.P2PContacts);
                }
                return (i3 == 0 || i2 == 0) ? i2 != 0 ? LocaleController.formatString("P2PContactsMinus", C0890R.string.P2PContactsMinus, Integer.valueOf(i2)) : LocaleController.formatString("P2PContactsPlus", C0890R.string.P2PContactsPlus, Integer.valueOf(i3)) : LocaleController.formatString("P2PContactsMinusPlus", C0890R.string.P2PContactsMinusPlus, Integer.valueOf(i2), Integer.valueOf(i3));
            } else if (i3 == 0 && i2 == 0) {
                return LocaleController.getString("LastSeenContacts", C0890R.string.LastSeenContacts);
            } else {
                return (i3 == 0 || i2 == 0) ? i2 != 0 ? LocaleController.formatString("LastSeenContactsMinus", C0890R.string.LastSeenContactsMinus, Integer.valueOf(i2)) : LocaleController.formatString("LastSeenContactsPlus", C0890R.string.LastSeenContactsPlus, Integer.valueOf(i3)) : LocaleController.formatString("LastSeenContactsMinusPlus", C0890R.string.LastSeenContactsMinusPlus, Integer.valueOf(i2), Integer.valueOf(i3));
            }
        } else if (i == 3) {
            return LocaleController.getString("P2PNobody", C0890R.string.P2PNobody);
        } else {
            return LocaleController.getString("LastSeenNobody", C0890R.string.LastSeenNobody);
        }
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
            return adapterPosition == PrivacySettingsActivity.this.passcodeRow || adapterPosition == PrivacySettingsActivity.this.passwordRow || adapterPosition == PrivacySettingsActivity.this.blockedRow || adapterPosition == PrivacySettingsActivity.this.sessionsRow || adapterPosition == PrivacySettingsActivity.this.secretWebpageRow || adapterPosition == PrivacySettingsActivity.this.webSessionsRow || (adapterPosition == PrivacySettingsActivity.this.groupsRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivicyInfo(1)) || ((adapterPosition == PrivacySettingsActivity.this.lastSeenRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivicyInfo(0)) || ((adapterPosition == PrivacySettingsActivity.this.callsRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivicyInfo(2)) || ((adapterPosition == PrivacySettingsActivity.this.profilePhotoRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivicyInfo(4)) || ((adapterPosition == PrivacySettingsActivity.this.forwardsRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivicyInfo(5)) || ((adapterPosition == PrivacySettingsActivity.this.phoneNumberRow && !PrivacySettingsActivity.this.getContactsController().getLoadingPrivicyInfo(6)) || ((adapterPosition == PrivacySettingsActivity.this.deleteAccountRow && !PrivacySettingsActivity.this.getContactsController().getLoadingDeleteInfo()) || ((adapterPosition == PrivacySettingsActivity.this.newChatsRow && !PrivacySettingsActivity.this.getContactsController().getLoadingGlobalSettings()) || adapterPosition == PrivacySettingsActivity.this.paymentsClearRow || adapterPosition == PrivacySettingsActivity.this.secretMapRow || adapterPosition == PrivacySettingsActivity.this.contactsSyncRow || adapterPosition == PrivacySettingsActivity.this.passportRow || adapterPosition == PrivacySettingsActivity.this.contactsDeleteRow || adapterPosition == PrivacySettingsActivity.this.contactsSuggestRow)))))));
        }

        @Override
        public int getItemCount() {
            return PrivacySettingsActivity.this.rowCount;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 0) {
                view = new TextSettingsCell(this.mContext);
                view.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            } else if (i == 1) {
                view = new TextInfoPrivacyCell(this.mContext);
            } else if (i != 2) {
                view = new TextCheckCell(this.mContext);
                view.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            } else {
                view = new HeaderCell(this.mContext);
                view.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            }
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String str;
            int itemViewType = viewHolder.getItemViewType();
            boolean z = false;
            boolean z2 = true;
            if (itemViewType == 0) {
                String str2 = null;
                int i2 = 16;
                boolean z3 = viewHolder.itemView.getTag() != null && ((Integer) viewHolder.itemView.getTag()).intValue() == i;
                viewHolder.itemView.setTag(Integer.valueOf(i));
                TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                if (i == PrivacySettingsActivity.this.blockedRow) {
                    int i3 = PrivacySettingsActivity.this.getMessagesController().totalBlockedCount;
                    if (i3 == 0) {
                        textSettingsCell.setTextAndValue(LocaleController.getString("BlockedUsers", C0890R.string.BlockedUsers), LocaleController.getString("BlockedEmpty", C0890R.string.BlockedEmpty), true);
                    } else if (i3 > 0) {
                        textSettingsCell.setTextAndValue(LocaleController.getString("BlockedUsers", C0890R.string.BlockedUsers), String.format("%d", Integer.valueOf(i3)), true);
                    } else {
                        textSettingsCell.setText(LocaleController.getString("BlockedUsers", C0890R.string.BlockedUsers), true);
                        z = true;
                    }
                } else if (i == PrivacySettingsActivity.this.sessionsRow) {
                    textSettingsCell.setText(LocaleController.getString("SessionsTitle", C0890R.string.SessionsTitle), false);
                } else if (i == PrivacySettingsActivity.this.webSessionsRow) {
                    textSettingsCell.setText(LocaleController.getString("WebSessionsTitle", C0890R.string.WebSessionsTitle), false);
                } else if (i == PrivacySettingsActivity.this.passwordRow) {
                    if (PrivacySettingsActivity.this.currentPassword == null) {
                        z = true;
                    } else if (PrivacySettingsActivity.this.currentPassword.has_password) {
                        str2 = LocaleController.getString("PasswordOn", C0890R.string.PasswordOn);
                    } else {
                        str2 = LocaleController.getString("PasswordOff", C0890R.string.PasswordOff);
                    }
                    textSettingsCell.setTextAndValue(LocaleController.getString("TwoStepVerification", C0890R.string.TwoStepVerification), str2, true);
                } else if (i == PrivacySettingsActivity.this.passcodeRow) {
                    textSettingsCell.setText(LocaleController.getString("Passcode", C0890R.string.Passcode), true);
                } else if (i == PrivacySettingsActivity.this.phoneNumberRow) {
                    if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivicyInfo(6)) {
                        z = true;
                        i2 = 30;
                    } else {
                        str2 = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 6);
                    }
                    textSettingsCell.setTextAndValue(LocaleController.getString("PrivacyPhone", C0890R.string.PrivacyPhone), str2, true);
                } else if (i == PrivacySettingsActivity.this.lastSeenRow) {
                    if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivicyInfo(0)) {
                        z = true;
                        i2 = 30;
                    } else {
                        str2 = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 0);
                    }
                    textSettingsCell.setTextAndValue(LocaleController.getString("PrivacyLastSeen", C0890R.string.PrivacyLastSeen), str2, true);
                } else {
                    if (i == PrivacySettingsActivity.this.groupsRow) {
                        if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivicyInfo(1)) {
                            i2 = 30;
                        } else {
                            str2 = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 1);
                            z2 = false;
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("GroupsAndChannels", C0890R.string.GroupsAndChannels), str2, false);
                    } else if (i == PrivacySettingsActivity.this.callsRow) {
                        if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivicyInfo(2)) {
                            z = true;
                            i2 = 30;
                        } else {
                            str2 = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 2);
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("Calls", C0890R.string.Calls), str2, true);
                    } else if (i == PrivacySettingsActivity.this.profilePhotoRow) {
                        if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivicyInfo(4)) {
                            z = true;
                            i2 = 30;
                        } else {
                            str2 = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 4);
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("PrivacyProfilePhoto", C0890R.string.PrivacyProfilePhoto), str2, true);
                    } else if (i == PrivacySettingsActivity.this.forwardsRow) {
                        if (PrivacySettingsActivity.this.getContactsController().getLoadingPrivicyInfo(5)) {
                            z = true;
                            i2 = 30;
                        } else {
                            str2 = PrivacySettingsActivity.formatRulesString(PrivacySettingsActivity.this.getAccountInstance(), 5);
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("PrivacyForwards", C0890R.string.PrivacyForwards), str2, true);
                    } else if (i == PrivacySettingsActivity.this.passportRow) {
                        textSettingsCell.setText(LocaleController.getString("TelegramPassport", C0890R.string.TelegramPassport), true);
                    } else if (i == PrivacySettingsActivity.this.deleteAccountRow) {
                        if (!PrivacySettingsActivity.this.getContactsController().getLoadingDeleteInfo()) {
                            int deleteAccountTTL = PrivacySettingsActivity.this.getContactsController().getDeleteAccountTTL();
                            if (deleteAccountTTL <= 182) {
                                str2 = LocaleController.formatPluralString("Months", deleteAccountTTL / 30);
                            } else if (deleteAccountTTL == 365) {
                                str2 = LocaleController.formatPluralString("Years", deleteAccountTTL / 365);
                            } else {
                                str2 = LocaleController.formatPluralString("Days", deleteAccountTTL);
                            }
                            z2 = false;
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("DeleteAccountIfAwayFor3", C0890R.string.DeleteAccountIfAwayFor3), str2, false);
                    } else if (i == PrivacySettingsActivity.this.paymentsClearRow) {
                        textSettingsCell.setText(LocaleController.getString("PrivacyPaymentsClear", C0890R.string.PrivacyPaymentsClear), true);
                    } else if (i == PrivacySettingsActivity.this.secretMapRow) {
                        int i4 = SharedConfig.mapPreviewType;
                        if (i4 == 0) {
                            str = LocaleController.getString("MapPreviewProviderTelegram", C0890R.string.MapPreviewProviderTelegram);
                        } else if (i4 == 1) {
                            str = LocaleController.getString("MapPreviewProviderGoogle", C0890R.string.MapPreviewProviderGoogle);
                        } else if (i4 != 2) {
                            str = LocaleController.getString("MapPreviewProviderYandex", C0890R.string.MapPreviewProviderYandex);
                        } else {
                            str = LocaleController.getString("MapPreviewProviderNobody", C0890R.string.MapPreviewProviderNobody);
                        }
                        textSettingsCell.setTextAndValue(LocaleController.getString("MapPreviewProvider", C0890R.string.MapPreviewProvider), str, true);
                    } else if (i == PrivacySettingsActivity.this.contactsDeleteRow) {
                        textSettingsCell.setText(LocaleController.getString("SyncContactsDelete", C0890R.string.SyncContactsDelete), true);
                    }
                    z = z2;
                }
                textSettingsCell.setDrawLoading(z, i2, z3);
            } else if (itemViewType == 1) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                if (i == PrivacySettingsActivity.this.deleteAccountDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString("DeleteAccountHelp", C0890R.string.DeleteAccountHelp));
                    textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, (int) C0890R.C0891drawable.greydivider, "windowBackgroundGrayShadow"));
                } else if (i == PrivacySettingsActivity.this.groupsDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString("GroupsAndChannelsHelp", C0890R.string.GroupsAndChannelsHelp));
                    textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, (int) C0890R.C0891drawable.greydivider, "windowBackgroundGrayShadow"));
                } else if (i == PrivacySettingsActivity.this.sessionsDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString("SessionsInfo", C0890R.string.SessionsInfo));
                    textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, (int) C0890R.C0891drawable.greydivider, "windowBackgroundGrayShadow"));
                } else if (i == PrivacySettingsActivity.this.secretDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString("SecretWebPageInfo", C0890R.string.SecretWebPageInfo));
                    textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, (int) C0890R.C0891drawable.greydivider, "windowBackgroundGrayShadow"));
                } else if (i == PrivacySettingsActivity.this.botsDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString("PrivacyBotsInfo", C0890R.string.PrivacyBotsInfo));
                    textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, (int) C0890R.C0891drawable.greydivider, "windowBackgroundGrayShadow"));
                } else if (i == PrivacySettingsActivity.this.contactsDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString("SuggestContactsInfo", C0890R.string.SuggestContactsInfo));
                    textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, (int) C0890R.C0891drawable.greydivider, "windowBackgroundGrayShadow"));
                } else if (i == PrivacySettingsActivity.this.newChatsSectionRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString("ArchiveAndMuteInfo", C0890R.string.ArchiveAndMuteInfo));
                    textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, (int) C0890R.C0891drawable.greydivider, "windowBackgroundGrayShadow"));
                }
            } else if (itemViewType == 2) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (i == PrivacySettingsActivity.this.privacySectionRow) {
                    headerCell.setText(LocaleController.getString("PrivacyTitle", C0890R.string.PrivacyTitle));
                } else if (i == PrivacySettingsActivity.this.securitySectionRow) {
                    headerCell.setText(LocaleController.getString("SecurityTitle", C0890R.string.SecurityTitle));
                } else if (i == PrivacySettingsActivity.this.advancedSectionRow) {
                    headerCell.setText(LocaleController.getString("DeleteMyAccount", C0890R.string.DeleteMyAccount));
                } else if (i == PrivacySettingsActivity.this.secretSectionRow) {
                    headerCell.setText(LocaleController.getString("SecretChat", C0890R.string.SecretChat));
                } else if (i == PrivacySettingsActivity.this.botsSectionRow) {
                    headerCell.setText(LocaleController.getString("PrivacyBots", C0890R.string.PrivacyBots));
                } else if (i == PrivacySettingsActivity.this.contactsSectionRow) {
                    headerCell.setText(LocaleController.getString("Contacts", C0890R.string.Contacts));
                } else if (i == PrivacySettingsActivity.this.newChatsHeaderRow) {
                    headerCell.setText(LocaleController.getString("NewChatsFromNonContacts", C0890R.string.NewChatsFromNonContacts));
                }
            } else if (itemViewType == 3) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                if (i == PrivacySettingsActivity.this.secretWebpageRow) {
                    String string = LocaleController.getString("SecretWebPage", C0890R.string.SecretWebPage);
                    if (PrivacySettingsActivity.this.getMessagesController().secretWebpagePreview != 1) {
                        z2 = false;
                    }
                    textCheckCell.setTextAndCheck(string, z2, false);
                } else if (i == PrivacySettingsActivity.this.contactsSyncRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("SyncContacts", C0890R.string.SyncContacts), PrivacySettingsActivity.this.newSync, true);
                } else if (i == PrivacySettingsActivity.this.contactsSuggestRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("SuggestContacts", C0890R.string.SuggestContacts), PrivacySettingsActivity.this.newSuggest, false);
                } else if (i == PrivacySettingsActivity.this.newChatsRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString("ArchiveAndMute", C0890R.string.ArchiveAndMute), PrivacySettingsActivity.this.archiveChats, false);
                }
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (i == PrivacySettingsActivity.this.passportRow || i == PrivacySettingsActivity.this.lastSeenRow || i == PrivacySettingsActivity.this.phoneNumberRow || i == PrivacySettingsActivity.this.blockedRow || i == PrivacySettingsActivity.this.deleteAccountRow || i == PrivacySettingsActivity.this.sessionsRow || i == PrivacySettingsActivity.this.webSessionsRow || i == PrivacySettingsActivity.this.passwordRow || i == PrivacySettingsActivity.this.passcodeRow || i == PrivacySettingsActivity.this.groupsRow || i == PrivacySettingsActivity.this.paymentsClearRow || i == PrivacySettingsActivity.this.secretMapRow || i == PrivacySettingsActivity.this.contactsDeleteRow) {
                return 0;
            }
            if (i == PrivacySettingsActivity.this.deleteAccountDetailRow || i == PrivacySettingsActivity.this.groupsDetailRow || i == PrivacySettingsActivity.this.sessionsDetailRow || i == PrivacySettingsActivity.this.secretDetailRow || i == PrivacySettingsActivity.this.botsDetailRow || i == PrivacySettingsActivity.this.contactsDetailRow || i == PrivacySettingsActivity.this.newChatsSectionRow) {
                return 1;
            }
            if (i == PrivacySettingsActivity.this.securitySectionRow || i == PrivacySettingsActivity.this.advancedSectionRow || i == PrivacySettingsActivity.this.privacySectionRow || i == PrivacySettingsActivity.this.secretSectionRow || i == PrivacySettingsActivity.this.botsSectionRow || i == PrivacySettingsActivity.this.contactsSectionRow || i == PrivacySettingsActivity.this.newChatsHeaderRow) {
                return 2;
            }
            return (i == PrivacySettingsActivity.this.secretWebpageRow || i == PrivacySettingsActivity.this.contactsSyncRow || i == PrivacySettingsActivity.this.contactsSuggestRow || i == PrivacySettingsActivity.this.newChatsRow) ? 3 : 0;
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{TextSettingsCell.class, HeaderCell.class, TextCheckCell.class}, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "actionBarDefaultTitle"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, "divider"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteValueText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueHeader"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText4"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "switchTrack"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "switchTrackChecked"));
        return arrayList;
    }
}
