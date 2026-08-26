package org.telegram.ui;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SectionsScrollView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SlideChooseView;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;

public class LinkEditActivity extends BaseFragment {
    public static final int CREATE_TYPE = 0;
    public static final int EDIT_TYPE = 1;
    private TextCheckCell approveCell;
    private TextInfoPrivacyCell approveHintCell;
    private FrameLayout buttonLayout;
    private Callback callback;
    private final long chatId;
    private TextView createTextView;
    int currentInviteDate;
    private final int[] defaultDates;
    private final int[] defaultUses;
    private ArrayList<Integer> dispalyedDates;
    private ArrayList<Integer> dispalyedUses;
    private TextInfoPrivacyCell divider;
    private TextInfoPrivacyCell dividerName;
    private TextInfoPrivacyCell dividerUses;
    private boolean finished;
    private boolean firstLayout;
    private boolean ignoreSet;
    TLRPC.TL_chatInviteExported inviteToEdit;
    boolean loading;
    private EditText nameEditText;
    AlertDialog progressDialog;
    private TextSettingsCell revokeLink;
    boolean scrollToEnd;
    boolean scrollToStart;
    private SectionsScrollView scrollView;
    private int shakeDp;
    private TextCheckCell subCell;
    private EditTextCell subEditPriceCell;
    private TextInfoPrivacyCell subInfoCell;
    private TextView subPriceView;
    private SlideChooseView timeChooseView;
    private TextView timeEditText;
    private HeaderCell timeHeaderCell;
    private int type;
    private SlideChooseView usesChooseView;
    private EditText usesEditText;
    private HeaderCell usesHeaderCell;

    public interface Callback {
        void onLinkCreated(TLObject tLObject);

        void onLinkEdited(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject);

        void onLinkRemoved(TLRPC.TL_chatInviteExported tL_chatInviteExported);

        void revokeLink(TLRPC.TL_chatInviteExported tL_chatInviteExported);
    }

    public LinkEditActivity(int i, long j) {
        super(null);
        this.shakeDp = -3;
        this.firstLayout = true;
        this.dispalyedDates = new ArrayList<>();
        this.defaultDates = new int[]{3600, 86400, 604800};
        this.dispalyedUses = new ArrayList<>();
        this.defaultUses = new int[]{1, 10, 100};
        this.type = i;
        this.chatId = j;
    }

    private void chooseDate(int i) {
        long j = i;
        this.timeEditText.setText(LocaleController.formatDateAudio(j, false));
        int currentTime = i - getConnectionsManager().getCurrentTime();
        this.dispalyedDates.clear();
        int iM = 0;
        boolean z = false;
        int length = 0;
        while (true) {
            int[] iArr = this.defaultDates;
            if (iM >= iArr.length) {
                break;
            }
            if (!z && currentTime < iArr[iM]) {
                this.dispalyedDates.add(Integer.valueOf(currentTime));
                length = iM;
                z = true;
            }
            iM = LocationController$$ExternalSyntheticOutline0.m(this.defaultDates[iM], iM, 1, this.dispalyedDates);
        }
        if (!z) {
            this.dispalyedDates.add(Integer.valueOf(currentTime));
            length = this.defaultDates.length;
        }
        int size = this.dispalyedDates.size();
        int i2 = size + 1;
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == size) {
                strArr[i3] = LocaleController.getString(R.string.NoLimit);
            } else if (this.dispalyedDates.get(i3).intValue() == this.defaultDates[0]) {
                strArr[i3] = LocaleController.formatPluralString("Hours", 1, new Object[0]);
            } else if (this.dispalyedDates.get(i3).intValue() == this.defaultDates[1]) {
                strArr[i3] = LocaleController.formatPluralString("Days", 1, new Object[0]);
            } else if (this.dispalyedDates.get(i3).intValue() == this.defaultDates[2]) {
                strArr[i3] = LocaleController.formatPluralString("Weeks", 1, new Object[0]);
            } else {
                long j2 = currentTime;
                if (j2 < 86400) {
                    strArr[i3] = LocaleController.getString(R.string.MessageScheduleToday);
                } else if (j2 < 31449600) {
                    strArr[i3] = LocaleController.getInstance().getFormatterScheduleDay().format(j * 1000);
                } else {
                    strArr[i3] = LocaleController.getInstance().getFormatterYear().format(j * 1000);
                }
            }
        }
        this.timeChooseView.setOptions(length, strArr);
    }

    public void chooseUses(int i) {
        int i2;
        this.dispalyedUses.clear();
        int iM = 0;
        boolean z = false;
        int length = 0;
        while (true) {
            int[] iArr = this.defaultUses;
            if (iM >= iArr.length) {
                break;
            }
            if (!z && i <= (i2 = iArr[iM])) {
                if (i != i2) {
                    this.dispalyedUses.add(Integer.valueOf(i));
                }
                length = iM;
                z = true;
            }
            iM = LocationController$$ExternalSyntheticOutline0.m(this.defaultUses[iM], iM, 1, this.dispalyedUses);
        }
        if (!z) {
            this.dispalyedUses.add(Integer.valueOf(i));
            length = this.defaultUses.length;
        }
        int size = this.dispalyedUses.size();
        int i3 = size + 1;
        String[] strArr = new String[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 == size) {
                strArr[i4] = LocaleController.getString(R.string.NoLimit);
            } else {
                strArr[i4] = this.dispalyedUses.get(i4).toString();
            }
        }
        this.usesChooseView.setOptions(length, strArr);
    }

    public void lambda$createView$0(boolean z, int i, int i2) {
        chooseDate(i);
    }

    public void lambda$createView$1(Context context, View view) {
        AlertsCreator.createDatePickerDialog(context, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new LinkEditActivity$$ExternalSyntheticLambda4(this, 0));
    }

    public void lambda$createView$10(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setMessage(LocaleController.getString(R.string.RevokeAlert));
        builder.setTitle(LocaleController.getString(R.string.RevokeLink));
        builder.setPositiveButton(LocaleController.getString(R.string.RevokeButton), new LinkEditActivity$$ExternalSyntheticLambda4(this, 1));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(builder.create());
    }

    public static void lambda$createView$11(Integer num) {
    }

    public void lambda$createView$2(int i) {
        if (i >= this.dispalyedDates.size()) {
            this.timeEditText.setText("");
            return;
        }
        this.timeEditText.setText(LocaleController.formatDateAudio(getConnectionsManager().getCurrentTime() + this.dispalyedDates.get(i).intValue(), false));
    }

    public void lambda$createView$3(int i) {
        this.usesEditText.clearFocus();
        this.ignoreSet = true;
        if (i < this.dispalyedUses.size()) {
            this.usesEditText.setText(this.dispalyedUses.get(i).toString());
        } else {
            this.usesEditText.setText("");
        }
        this.ignoreSet = false;
    }

    public void lambda$createView$4(boolean z, View view) {
        if (z) {
            return;
        }
        TextCheckCell textCheckCell = this.subCell;
        if (textCheckCell != null && textCheckCell.isChecked()) {
            TextCheckCell textCheckCell2 = this.subCell;
            int i = -this.shakeDp;
            this.shakeDp = i;
            AndroidUtilities.shakeViewSpring(textCheckCell2, i);
            return;
        }
        TextCheckCell textCheckCell3 = (TextCheckCell) view;
        boolean zIsChecked = textCheckCell3.isChecked();
        textCheckCell3.setChecked(!zIsChecked);
        setUsesVisible(zIsChecked);
        this.firstLayout = true;
        if (this.subCell != null) {
            if (textCheckCell3.isChecked()) {
                this.subCell.setChecked(false);
                this.subCell.setCheckBoxIcon(R.drawable.permission_locked);
                this.subEditPriceCell.setVisibility(8);
            } else if (this.inviteToEdit == null) {
                this.subCell.setCheckBoxIcon(0);
            }
        }
    }

    public void lambda$createView$5() {
        this.subEditPriceCell.editText.requestFocus();
        AndroidUtilities.showKeyboard(this.subEditPriceCell.editText);
    }

    public void lambda$createView$6() {
        this.subEditPriceCell.editText.clearFocus();
        AndroidUtilities.hideKeyboard(this.subEditPriceCell.editText);
    }

    public void lambda$createView$7(Runnable[] runnableArr, View view) {
        if (this.inviteToEdit != null) {
            return;
        }
        if (this.approveCell.isChecked()) {
            TextCheckCell textCheckCell = this.approveCell;
            int i = -this.shakeDp;
            this.shakeDp = i;
            AndroidUtilities.shakeViewSpring(textCheckCell, i);
            return;
        }
        TextCheckCell textCheckCell2 = (TextCheckCell) view;
        textCheckCell2.setChecked(!textCheckCell2.isChecked());
        this.subEditPriceCell.setVisibility(textCheckCell2.isChecked() ? 0 : 8);
        AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
        if (!textCheckCell2.isChecked()) {
            this.approveCell.setCheckBoxIcon(0);
            this.approveHintCell.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
            LinkEditActivity$$ExternalSyntheticLambda1 linkEditActivity$$ExternalSyntheticLambda1 = new LinkEditActivity$$ExternalSyntheticLambda1(this, 2);
            runnableArr[0] = linkEditActivity$$ExternalSyntheticLambda1;
            AndroidUtilities.runOnUIThread(linkEditActivity$$ExternalSyntheticLambda1);
            return;
        }
        this.approveCell.setChecked(false);
        this.approveCell.setCheckBoxIcon(R.drawable.permission_locked);
        this.approveHintCell.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
        LinkEditActivity$$ExternalSyntheticLambda1 linkEditActivity$$ExternalSyntheticLambda2 = new LinkEditActivity$$ExternalSyntheticLambda1(this, 0);
        runnableArr[0] = linkEditActivity$$ExternalSyntheticLambda2;
        AndroidUtilities.runOnUIThread(linkEditActivity$$ExternalSyntheticLambda2, 60L);
    }

    public void lambda$createView$8() {
        Browser.openUrl(getContext(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
    }

    public void lambda$createView$9(AlertDialog alertDialog, int i) {
        this.callback.revokeLink(this.inviteToEdit);
        finishFragment();
    }

    public void lambda$getThemeDescriptions$16() {
        TextInfoPrivacyCell textInfoPrivacyCell = this.dividerUses;
        if (textInfoPrivacyCell != null) {
            textInfoPrivacyCell.getContext();
            EditText editText = this.usesEditText;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            editText.setTextColor(Theme.getColor(null, i, false));
            EditText editText2 = this.usesEditText;
            int i2 = Theme.key_windowBackgroundWhiteGrayText;
            editText2.setHintTextColor(Theme.getColor(null, i2, false));
            this.timeEditText.setTextColor(Theme.getColor(null, i, false));
            this.timeEditText.setHintTextColor(Theme.getColor(null, i2, false));
            TextSettingsCell textSettingsCell = this.revokeLink;
            if (textSettingsCell != null) {
                textSettingsCell.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
            }
            this.createTextView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
            this.nameEditText.setTextColor(Theme.getColor(null, i, false));
            this.nameEditText.setHintTextColor(Theme.getColor(null, i2, false));
        }
    }

    public void lambda$onCreateClicked$12(TLRPC.TL_error tL_error, TLObject tLObject) {
        this.loading = false;
        AlertDialog alertDialog = this.progressDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (tL_error != null) {
            AlertsCreator.showSimpleAlert(this, tL_error.text);
            return;
        }
        Callback callback = this.callback;
        if (callback != null) {
            callback.onLinkCreated(tLObject);
        }
        finishFragment();
    }

    public void lambda$onCreateClicked$13(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkEditActivity$$ExternalSyntheticLambda3(this, tL_error, tLObject, 0));
    }

    public void lambda$onCreateClicked$14(TLRPC.TL_error tL_error, TLObject tLObject) {
        this.loading = false;
        AlertDialog alertDialog = this.progressDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (tL_error != null) {
            AlertsCreator.showSimpleAlert(this, tL_error.text);
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_exportedChatInvite) {
            this.inviteToEdit = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject).invite;
        }
        Callback callback = this.callback;
        if (callback != null) {
            callback.onLinkEdited(this.inviteToEdit, tLObject);
        }
        finishFragment();
    }

    public void lambda$onCreateClicked$15(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkEditActivity$$ExternalSyntheticLambda3(this, tL_error, tLObject, 1));
    }

    public void onCreateClicked(View view) {
        long j;
        boolean z;
        if (this.loading) {
            return;
        }
        int selectedIndex = this.timeChooseView.getSelectedIndex();
        if (selectedIndex < this.dispalyedDates.size() && this.dispalyedDates.get(selectedIndex).intValue() < 0) {
            AndroidUtilities.shakeView(this.timeEditText);
            Vibrator vibrator = (Vibrator) this.timeEditText.getContext().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
                return;
            }
            return;
        }
        TextCheckCell textCheckCell = this.subCell;
        if (textCheckCell == null || !textCheckCell.isChecked()) {
            j = 0;
        } else {
            try {
                j = Long.parseLong(this.subEditPriceCell.editText.getText().toString());
            } catch (Exception e) {
                FileLog.e(e);
                j = 0;
            }
        }
        int i = this.type;
        if (i == 0) {
            AlertDialog alertDialog = this.progressDialog;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            this.loading = true;
            AlertDialog alertDialog2 = new AlertDialog(getParentActivity(), 3, null);
            this.progressDialog = alertDialog2;
            alertDialog2.showDelayed(500L);
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.chatId);
            tL_messages_exportChatInvite.legacy_revoke_permanent = false;
            int selectedIndex2 = this.timeChooseView.getSelectedIndex();
            tL_messages_exportChatInvite.flags |= 1;
            if (selectedIndex2 < this.dispalyedDates.size()) {
                tL_messages_exportChatInvite.expire_date = getConnectionsManager().getCurrentTime() + this.dispalyedDates.get(selectedIndex2).intValue();
            } else {
                tL_messages_exportChatInvite.expire_date = 0;
            }
            int selectedIndex3 = this.usesChooseView.getSelectedIndex();
            tL_messages_exportChatInvite.flags |= 2;
            if (selectedIndex3 < this.dispalyedUses.size()) {
                tL_messages_exportChatInvite.usage_limit = this.dispalyedUses.get(selectedIndex3).intValue();
            } else {
                tL_messages_exportChatInvite.usage_limit = 0;
            }
            TextCheckCell textCheckCell2 = this.approveCell;
            boolean z2 = textCheckCell2 != null && textCheckCell2.isChecked();
            tL_messages_exportChatInvite.request_needed = z2;
            if (z2) {
                tL_messages_exportChatInvite.usage_limit = 0;
            }
            String string = this.nameEditText.getText().toString();
            tL_messages_exportChatInvite.title = string;
            if (!TextUtils.isEmpty(string)) {
                tL_messages_exportChatInvite.flags |= 16;
            }
            if (j > 0) {
                tL_messages_exportChatInvite.flags |= 32;
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                tL_starsSubscriptionPricing.period = getConnectionsManager().isTestBackend() ? 300 : 2592000;
                tL_messages_exportChatInvite.subscription_pricing.amount = j;
            }
            final int i2 = 0;
            getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate(this) {
                public final LinkEditActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$onCreateClicked$13(tLObject, tL_error);
                            break;
                        default:
                            this.f$0.lambda$onCreateClicked$15(tLObject, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        if (i == 1) {
            AlertDialog alertDialog3 = this.progressDialog;
            if (alertDialog3 != null) {
                alertDialog3.dismiss();
            }
            TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
            tL_messages_editExportedChatInvite.link = this.inviteToEdit.link;
            tL_messages_editExportedChatInvite.revoked = false;
            tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.chatId);
            int selectedIndex4 = this.timeChooseView.getSelectedIndex();
            if (selectedIndex4 < this.dispalyedDates.size()) {
                if (this.currentInviteDate != this.dispalyedDates.get(selectedIndex4).intValue()) {
                    tL_messages_editExportedChatInvite.flags |= 1;
                    tL_messages_editExportedChatInvite.expire_date = getConnectionsManager().getCurrentTime() + this.dispalyedDates.get(selectedIndex4).intValue();
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.currentInviteDate != 0) {
                tL_messages_editExportedChatInvite.flags |= 1;
                tL_messages_editExportedChatInvite.expire_date = 0;
                z = true;
            } else {
                z = false;
            }
            int selectedIndex5 = this.usesChooseView.getSelectedIndex();
            if (selectedIndex5 < this.dispalyedUses.size()) {
                int iIntValue = this.dispalyedUses.get(selectedIndex5).intValue();
                if (this.inviteToEdit.usage_limit != iIntValue) {
                    tL_messages_editExportedChatInvite.flags |= 2;
                    tL_messages_editExportedChatInvite.usage_limit = iIntValue;
                    z = true;
                }
            } else if (this.inviteToEdit.usage_limit != 0) {
                tL_messages_editExportedChatInvite.flags |= 2;
                tL_messages_editExportedChatInvite.usage_limit = 0;
                z = true;
            }
            boolean z3 = this.inviteToEdit.request_needed;
            TextCheckCell textCheckCell3 = this.approveCell;
            if (z3 != (textCheckCell3 != null && textCheckCell3.isChecked())) {
                tL_messages_editExportedChatInvite.flags |= 8;
                TextCheckCell textCheckCell4 = this.approveCell;
                boolean z4 = textCheckCell4 != null && textCheckCell4.isChecked();
                tL_messages_editExportedChatInvite.request_needed = z4;
                if (z4) {
                    tL_messages_editExportedChatInvite.flags |= 2;
                    tL_messages_editExportedChatInvite.usage_limit = 0;
                }
                z = true;
            }
            String string2 = this.nameEditText.getText().toString();
            if (!TextUtils.equals(this.inviteToEdit.title, string2)) {
                tL_messages_editExportedChatInvite.title = string2;
                tL_messages_editExportedChatInvite.flags |= 16;
                z = true;
            }
            if (!z) {
                finishFragment();
                return;
            }
            this.loading = true;
            AlertDialog alertDialog4 = new AlertDialog(getParentActivity(), 3, null);
            this.progressDialog = alertDialog4;
            alertDialog4.showDelayed(500L);
            final int i3 = 1;
            getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate(this) {
                public final LinkEditActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i3) {
                        case 0:
                            this.f$0.lambda$onCreateClicked$13(tLObject, tL_error);
                            break;
                        default:
                            this.f$0.lambda$onCreateClicked$15(tLObject, tL_error);
                            break;
                    }
                }
            });
        }
    }

    private void resetDates() {
        this.dispalyedDates.clear();
        int iM = 0;
        while (true) {
            int[] iArr = this.defaultDates;
            if (iM >= iArr.length) {
                this.timeChooseView.setOptions(3, LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Days", 1, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.getString(R.string.NoLimit));
                return;
            } else {
                iM = LocationController$$ExternalSyntheticOutline0.m(iArr[iM], iM, 1, this.dispalyedDates);
            }
        }
    }

    public void resetUses() {
        this.dispalyedUses.clear();
        int iM = 0;
        while (true) {
            int[] iArr = this.defaultUses;
            if (iM >= iArr.length) {
                this.usesChooseView.setOptions(3, "1", "10", "100", LocaleController.getString(R.string.NoLimit));
                return;
            } else {
                iM = LocationController$$ExternalSyntheticOutline0.m(iArr[iM], iM, 1, this.dispalyedUses);
            }
        }
    }

    private void setUsesVisible(boolean z) {
        this.usesHeaderCell.setVisibility(z ? 0 : 8);
        this.usesChooseView.setVisibility(z ? 0 : 8);
        this.usesEditText.setVisibility(z ? 0 : 8);
        this.dividerUses.setVisibility(z ? 0 : 8);
    }

    @Override
    public View createView(Context context) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i;
        int i2;
        int i3 = 3;
        int i4 = 2;
        final int i5 = 0;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i6 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        int i7 = this.type;
        if (i7 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewLink));
        } else if (i7 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditLink));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i8) {
                if (i8 == -1) {
                    LinkEditActivity.this.finishFragment();
                    AndroidUtilities.hideKeyboard(LinkEditActivity.this.usesEditText);
                }
            }
        });
        TextView textView = new TextView(context);
        this.createTextView = textView;
        textView.setBackground(new Drawable() {
            final Paint p = new Paint(1);

            @Override
            public void draw(Canvas canvas) {
                this.p.setColor(Theme.getColor(null, Theme.key_telegram_color, false));
                canvas.drawRoundRect(getBounds().left, getBounds().exactCenterY() - AndroidUtilities.dp(14.0f), getBounds().right, AndroidUtilities.dp(14.0f) + getBounds().exactCenterY(), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.p);
            }

            @Override
            public int getOpacity() {
                return 0;
            }

            @Override
            public void setAlpha(int i8) {
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }
        });
        this.createTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.createTextView.setGravity(17);
        this.createTextView.setOnClickListener(new View.OnClickListener(this) {
            public final LinkEditActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        this.f$0.onCreateClicked(view);
                        break;
                    default:
                        this.f$0.lambda$createView$10(view);
                        break;
                }
            }
        });
        this.createTextView.setSingleLine();
        int i8 = this.type;
        if (i8 == 0) {
            this.createTextView.setText(LocaleController.getString(R.string.CreateLinkHeaderNoCaps));
        } else if (i8 == 1) {
            this.createTextView.setText(LocaleController.getString(R.string.SaveLinkHeaderNoCaps));
        }
        this.createTextView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        this.createTextView.setTextSize(1, 14.0f);
        this.createTextView.setTypeface(AndroidUtilities.bold());
        this.createTextView.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        ScaleStateListAnimator.apply(this.createTextView);
        this.actionBar.addView(this.createTextView, LayoutHelper.createFrame(-2, ActionBar.getCurrentActionBarHeight() / AndroidUtilities.density, 8388693, 0.0f, 0.0f, 12.0f, 0.0f));
        SectionsScrollView.SectionsLinearLayout sectionsLinearLayout = new SectionsScrollView.SectionsLinearLayout(context) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                LinkEditActivity.this.firstLayout = false;
            }

            @Override
            public void onMeasure(int i9, int i10) {
                super.onMeasure(i9, i10);
            }
        };
        SectionsScrollView sectionsScrollView = new SectionsScrollView(context, sectionsLinearLayout, this.resourceProvider);
        this.scrollView = sectionsScrollView;
        this.actionBar.setAdaptiveBackground(sectionsScrollView);
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                LinkEditActivity linkEditActivity = LinkEditActivity.this;
                if (linkEditActivity.scrollToEnd) {
                    linkEditActivity.scrollToEnd = false;
                    linkEditActivity.scrollView.smoothScrollTo(0, Math.max(0, LinkEditActivity.this.scrollView.getChildAt(0).getMeasuredHeight() - LinkEditActivity.this.scrollView.getMeasuredHeight()));
                } else if (linkEditActivity.scrollToStart) {
                    linkEditActivity.scrollToStart = false;
                    linkEditActivity.scrollView.smoothScrollTo(0, 0);
                }
            }

            @Override
            public void onLayout(boolean z, int i9, int i10, int i11, int i12) {
                int scrollY = LinkEditActivity.this.scrollView.getScrollY();
                super.onLayout(z, i9, i10, i11, i12);
                if (scrollY != LinkEditActivity.this.scrollView.getScrollY()) {
                    LinkEditActivity linkEditActivity = LinkEditActivity.this;
                    if (linkEditActivity.scrollToEnd) {
                        return;
                    }
                    linkEditActivity.scrollView.setTranslationY(LinkEditActivity.this.scrollView.getScrollY() - scrollY);
                    LinkEditActivity.this.scrollView.animate().cancel();
                    LinkEditActivity.this.scrollView.animate().translationY(0.0f).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
                }
            }

            @Override
            public void onMeasure(int i9, int i10) {
                super.onMeasure(i9, i10);
                measureKeyboardHeight();
                int i11 = this.keyboardHeight;
                if (i11 != 0 && i11 < AndroidUtilities.dp(20.0f)) {
                    LinkEditActivity.this.usesEditText.clearFocus();
                    LinkEditActivity.this.nameEditText.clearFocus();
                }
                LinkEditActivity.this.buttonLayout.setVisibility(this.keyboardHeight > AndroidUtilities.dp(20.0f) ? 8 : 0);
            }
        };
        this.fragmentView = sizeNotifierFrameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        layoutTransition.setInterpolator(2, cubicBezierInterpolator);
        layoutTransition.setInterpolator(0, cubicBezierInterpolator);
        layoutTransition.setInterpolator(4, cubicBezierInterpolator);
        layoutTransition.setInterpolator(1, cubicBezierInterpolator);
        layoutTransition.setInterpolator(3, cubicBezierInterpolator);
        sectionsLinearLayout.setLayoutTransition(layoutTransition);
        sectionsLinearLayout.setOrientation(1);
        sectionsLinearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(91.0f));
        this.scrollView.addView(sectionsLinearLayout);
        HeaderCell headerCell = new HeaderCell(context);
        this.timeHeaderCell = headerCell;
        headerCell.setText(LocaleController.getString(R.string.LimitByPeriod));
        sectionsLinearLayout.addView(this.timeHeaderCell);
        SlideChooseView slideChooseView = new SlideChooseView(context);
        this.timeChooseView = slideChooseView;
        sectionsLinearLayout.addView(slideChooseView);
        TextView textView2 = new TextView(context);
        this.timeEditText = textView2;
        textView2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.timeEditText.setGravity(16);
        this.timeEditText.setTextSize(1, 16.0f);
        this.timeEditText.setHint(LocaleController.getString(R.string.TimeLimitHint));
        this.timeEditText.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda91(9, this, context));
        this.timeChooseView.setCallback(new LinkEditActivity$$ExternalSyntheticLambda4(this, i4));
        resetDates();
        sectionsLinearLayout.addView(this.timeEditText, LayoutHelper.createLinear(-1, 50));
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        this.divider = textInfoPrivacyCell;
        textInfoPrivacyCell.setText(LocaleController.getString(R.string.TimeLimitHelp));
        sectionsLinearLayout.addView(this.divider);
        HeaderCell headerCell2 = new HeaderCell(context);
        this.usesHeaderCell = headerCell2;
        headerCell2.setText(LocaleController.getString(R.string.LimitNumberOfUses));
        sectionsLinearLayout.addView(this.usesHeaderCell);
        SlideChooseView slideChooseView2 = new SlideChooseView(context);
        this.usesChooseView = slideChooseView2;
        slideChooseView2.setCallback(new LinkEditActivity$$ExternalSyntheticLambda4(this, i3));
        resetUses();
        sectionsLinearLayout.addView(this.usesChooseView);
        EditText editText = new EditText(context) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    setCursorVisible(true);
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.usesEditText = editText;
        editText.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.usesEditText.setGravity(16);
        this.usesEditText.setTextSize(1, 16.0f);
        this.usesEditText.setHint(LocaleController.getString(R.string.UsesLimitHint));
        this.usesEditText.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.usesEditText.setInputType(2);
        this.usesEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
                if (LinkEditActivity.this.ignoreSet) {
                    return;
                }
                if (editable.toString().equals("0")) {
                    LinkEditActivity.this.usesEditText.setText("");
                    return;
                }
                try {
                    int i9 = Integer.parseInt(editable.toString());
                    if (i9 > 100000) {
                        LinkEditActivity.this.resetUses();
                    } else {
                        LinkEditActivity.this.chooseUses(i9);
                    }
                } catch (NumberFormatException unused) {
                    LinkEditActivity.this.resetUses();
                }
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
            }
        });
        sectionsLinearLayout.addView(this.usesEditText, LayoutHelper.createLinear(-1, 50));
        TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        this.dividerUses = textInfoPrivacyCell2;
        textInfoPrivacyCell2.setText(LocaleController.getString(R.string.UsesLimitHelp));
        sectionsLinearLayout.addView(this.dividerUses);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        boolean z = (!ChatObject.isPublic(chat) || chat.join_request || chat.join_to_send) ? false : true;
        TextCheckCell textCheckCell = new TextCheckCell(context) {
            @Override
            public void onDraw(Canvas canvas) {
                canvas.save();
                canvas.clipRect(0, 0, getWidth(), getHeight());
                super.onDraw(canvas);
                canvas.restore();
            }
        };
        this.approveCell = textCheckCell;
        int i9 = Theme.key_windowBackgroundWhite;
        textCheckCell.setBackgroundColor(Theme.getColor(null, i9, false));
        this.approveCell.setTag(Integer.valueOf(i9));
        this.approveCell.setTextAndCheck(LocaleController.getString(R.string.ApproveNewMembers2), false, false);
        this.approveCell.setOnClickListener(new LinkEditActivity$$ExternalSyntheticLambda10(this, z, i5));
        sectionsLinearLayout.addView(this.approveCell, LayoutHelper.createLinear(-1, 56));
        TextInfoPrivacyCell textInfoPrivacyCell3 = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        this.approveHintCell = textInfoPrivacyCell3;
        if (z) {
            this.approveCell.setCheckBoxIcon(R.drawable.permission_locked);
            this.approveHintCell.setText(LocaleController.getString(R.string.ApproveNewMembersUnavailablePublicGroup));
        } else {
            textInfoPrivacyCell3.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        }
        sectionsLinearLayout.addView(this.approveHintCell);
        if (chat == null || chat.username == null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.chatId);
            if (!(this.inviteToEdit == null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chatId))) && chatFull != null && chatFull.paid_media_allowed) && ((tL_chatInviteExported = this.inviteToEdit) == null || tL_chatInviteExported.subscription_pricing == null)) {
                i = -2;
                i2 = -1;
            } else {
                TextCheckCell textCheckCell2 = new TextCheckCell(context);
                this.subCell = textCheckCell2;
                textCheckCell2.setBackgroundColor(Theme.getColor(null, i9, false));
                this.subCell.setDrawCheckRipple(true);
                this.subCell.setTextAndCheck(LocaleController.getString(R.string.RequireMonthlyFee), false, true);
                if (this.inviteToEdit != null) {
                    this.subCell.setCheckBoxIcon(R.drawable.permission_locked);
                    this.subCell.setEnabled(false);
                }
                this.subCell.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda91(8, this, new Runnable[1]));
                sectionsLinearLayout.addView(this.subCell, LayoutHelper.createLinear(-1, 48));
                TextView textView3 = new TextView(context);
                this.subPriceView = textView3;
                textView3.setTextSize(1, 16.0f);
                this.subPriceView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText3, false));
                i = -2;
                i2 = -1;
                EditTextCell editTextCell = new EditTextCell(context, LocaleController.getString(getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceHintTest5Minutes : R.string.RequireMonthlyFeePriceHint), false, false, -1, this.resourceProvider) {
                    private boolean ignoreTextChanged;

                    @Override
                    public void onTextChanged(CharSequence charSequence) {
                        if (this.ignoreTextChanged) {
                            return;
                        }
                        if (TextUtils.isEmpty(charSequence)) {
                            LinkEditActivity.this.subPriceView.setText("");
                            return;
                        }
                        try {
                            long j = Long.parseLong(charSequence.toString());
                            if (j > LinkEditActivity.this.getMessagesController().starsSubscriptionAmountMax) {
                                this.ignoreTextChanged = true;
                                j = LinkEditActivity.this.getMessagesController().starsSubscriptionAmountMax;
                                setText(Long.toString(j));
                                this.ignoreTextChanged = false;
                            }
                            LinkEditActivity.this.subPriceView.setText(LocaleController.formatString(LinkEditActivity.this.getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceTest5Minutes : R.string.RequireMonthlyFeePrice, BillingController.getInstance().formatCurrency((long) ((j / 1000.0d) * ((double) MessagesController.getInstance(((BaseFragment) LinkEditActivity.this).currentAccount).starsUsdWithdrawRate1000)), "USD")));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                };
                this.subEditPriceCell = editTextCell;
                editTextCell.editText.setInputType(2);
                this.subEditPriceCell.editText.setRawInputType(2);
                this.subEditPriceCell.setBackgroundColor(getThemedColor(i9));
                this.subEditPriceCell.hideKeyboardOnEnter();
                this.subEditPriceCell.addView(this.subPriceView, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                ImageView leftDrawable = this.subEditPriceCell.setLeftDrawable(getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate());
                leftDrawable.setScaleX(0.83f);
                leftDrawable.setScaleY(0.83f);
                leftDrawable.setTranslationY(AndroidUtilities.dp(-1.0f));
                leftDrawable.setTranslationX(AndroidUtilities.dp(1.0f));
                sectionsLinearLayout.addView(this.subEditPriceCell, LayoutHelper.createLinear(-1, 48));
                this.subEditPriceCell.setVisibility(8);
                TextInfoPrivacyCell textInfoPrivacyCell4 = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
                this.subInfoCell = textInfoPrivacyCell4;
                if (this.inviteToEdit != null) {
                    textInfoPrivacyCell4.setText(LocaleController.getString(R.string.RequireMonthlyFeeInfoFrozen));
                } else {
                    textInfoPrivacyCell4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.RequireMonthlyFeeInfo), new LinkEditActivity$$ExternalSyntheticLambda1(this, i6)));
                }
                sectionsLinearLayout.addView(this.subInfoCell, LayoutHelper.createLinear(-1, -2));
            }
        } else {
            i = -2;
            i2 = -1;
        }
        EditText editText2 = new EditText(context) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    setCursorVisible(true);
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.nameEditText = editText2;
        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
                Emoji.replaceEmoji(editable, LinkEditActivity.this.nameEditText.getPaint().getFontMetricsInt(), false);
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }
        });
        this.nameEditText.setCursorVisible(false);
        this.nameEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.nameEditText.setGravity(16);
        this.nameEditText.setHint(LocaleController.getString(R.string.LinkNameHint));
        EditText editText3 = this.nameEditText;
        int i10 = Theme.key_windowBackgroundWhiteGrayText;
        editText3.setHintTextColor(Theme.getColor(null, i10, false));
        this.nameEditText.setLines(1);
        this.nameEditText.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.nameEditText.setSingleLine();
        EditText editText4 = this.nameEditText;
        int i11 = Theme.key_windowBackgroundWhiteBlackText;
        editText4.setTextColor(Theme.getColor(null, i11, false));
        this.nameEditText.setTextSize(1, 16.0f);
        sectionsLinearLayout.addView(this.nameEditText, LayoutHelper.createLinear(i2, 50));
        TextInfoPrivacyCell textInfoPrivacyCell5 = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        this.dividerName = textInfoPrivacyCell5;
        textInfoPrivacyCell5.setText(LocaleController.getString(R.string.LinkNameHelp));
        sectionsLinearLayout.addView(this.dividerName);
        if (this.type == 1) {
            TextSettingsCell textSettingsCell = new TextSettingsCell(context, null, 0);
            this.revokeLink = textSettingsCell;
            textSettingsCell.setBackgroundColor(Theme.getColor(null, i9, false));
            this.revokeLink.setText(LocaleController.getString(R.string.RevokeLink), false);
            this.revokeLink.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
            this.revokeLink.setOnClickListener(new View.OnClickListener(this) {
                public final LinkEditActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i6) {
                        case 0:
                            this.f$0.onCreateClicked(view);
                            break;
                        default:
                            this.f$0.lambda$createView$10(view);
                            break;
                    }
                }
            });
            sectionsLinearLayout.addView(this.revokeLink);
        }
        sizeNotifierFrameLayout.addView(this.scrollView, LayoutHelper.createFrame(i2, -1.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.buttonLayout = frameLayout;
        int i12 = Theme.key_windowBackgroundGray;
        frameLayout.setBackgroundColor(getThemedColor(i12));
        new KeyboardNotifier(sizeNotifierFrameLayout, false, new LinkEditActivity$$ExternalSyntheticLambda14(0));
        sizeNotifierFrameLayout.addView(this.buttonLayout, LayoutHelper.createFrame(i2, i, 80));
        this.timeHeaderCell.setBackgroundColor(Theme.getColor(null, i9, false));
        this.timeChooseView.setBackgroundColor(Theme.getColor(null, i9, false));
        this.timeEditText.setBackgroundColor(Theme.getColor(null, i9, false));
        this.usesHeaderCell.setBackgroundColor(Theme.getColor(null, i9, false));
        this.usesChooseView.setBackgroundColor(Theme.getColor(null, i9, false));
        this.usesEditText.setBackgroundColor(Theme.getColor(null, i9, false));
        this.nameEditText.setBackgroundColor(Theme.getColor(null, i9, false));
        sizeNotifierFrameLayout.setBackgroundColor(Theme.getColor(null, i12, false));
        this.usesEditText.setTextColor(Theme.getColor(null, i11, false));
        this.usesEditText.setHintTextColor(Theme.getColor(null, i10, false));
        this.timeEditText.setTextColor(Theme.getColor(null, i11, false));
        this.timeEditText.setHintTextColor(Theme.getColor(null, i10, false));
        this.usesEditText.setCursorVisible(false);
        setInviteToEdit(this.inviteToEdit);
        sizeNotifierFrameLayout.setClipChildren(false);
        this.scrollView.setClipChildren(false);
        sectionsLinearLayout.setClipChildren(false);
        return sizeNotifierFrameLayout;
    }

    @Override
    public void finishFragment() {
        this.scrollView.getLayoutParams().height = this.scrollView.getHeight();
        this.finished = true;
        super.finishFragment();
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        IntroActivity$$ExternalSyntheticLambda0 introActivity$$ExternalSyntheticLambda0 = new IntroActivity$$ExternalSyntheticLambda0(this, 20);
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        int i = Theme.key_windowBackgroundWhiteBlueHeader;
        arrayList.add(new ThemeDescription(this.timeHeaderCell, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.usesHeaderCell, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        HeaderCell headerCell = this.timeHeaderCell;
        int i2 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(headerCell, 1, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.usesHeaderCell, 1, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.timeChooseView, 1, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.usesChooseView, 1, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.timeEditText, 1, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.usesEditText, 1, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.revokeLink, 1, null, null, null, null, i2));
        int i3 = Theme.key_windowBackgroundWhiteGrayText4;
        arrayList.add(new ThemeDescription(this.divider, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.dividerUses, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.dividerName, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.actionBar, 1, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_featuredStickers_addButton));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_featuredStickers_addButtonPressed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_featuredStickers_buttonText));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_text_RedRegular));
        return arrayList;
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public void setInviteToEdit(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.inviteToEdit = tL_chatInviteExported;
        if (this.fragmentView == null || tL_chatInviteExported == null) {
            return;
        }
        int i = tL_chatInviteExported.expire_date;
        if (i > 0) {
            chooseDate(i);
            this.currentInviteDate = this.dispalyedDates.get(this.timeChooseView.getSelectedIndex()).intValue();
        } else {
            this.currentInviteDate = 0;
        }
        int i2 = tL_chatInviteExported.usage_limit;
        if (i2 > 0) {
            chooseUses(i2);
            this.usesEditText.setText(Integer.toString(tL_chatInviteExported.usage_limit));
        }
        TextCheckCell textCheckCell = this.approveCell;
        if (textCheckCell != null) {
            textCheckCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            this.approveCell.setChecked(tL_chatInviteExported.request_needed);
        }
        setUsesVisible(!tL_chatInviteExported.request_needed);
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, this.nameEditText.getPaint().getFontMetricsInt(), false);
            this.nameEditText.setText(spannableStringBuilder);
        }
        TextCheckCell textCheckCell2 = this.subCell;
        if (textCheckCell2 != null) {
            textCheckCell2.setChecked(tL_chatInviteExported.subscription_pricing != null);
        }
        if (tL_chatInviteExported.subscription_pricing != null) {
            TextCheckCell textCheckCell3 = this.approveCell;
            if (textCheckCell3 != null) {
                textCheckCell3.setChecked(false);
                this.approveCell.setCheckBoxIcon(R.drawable.permission_locked);
            }
            TextInfoPrivacyCell textInfoPrivacyCell = this.approveHintCell;
            if (textInfoPrivacyCell != null) {
                textInfoPrivacyCell.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
            }
        }
        EditTextCell editTextCell = this.subEditPriceCell;
        if (editTextCell != null) {
            editTextCell.setVisibility(tL_chatInviteExported.subscription_pricing != null ? 0 : 8);
            this.subEditPriceCell.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
            this.subEditPriceCell.editText.setClickable(false);
            this.subEditPriceCell.editText.setFocusable(false);
            this.subEditPriceCell.editText.setFocusableInTouchMode(false);
            this.subEditPriceCell.editText.setLongClickable(false);
        }
    }
}
