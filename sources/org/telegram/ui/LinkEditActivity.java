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
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
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
import org.telegram.ui.Components.SlideChooseView;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;

public final class LinkEditActivity extends BaseFragment {
    public AnonymousClass7 approveCell;
    public TextInfoPrivacyCell approveHintCell;
    public FrameLayout buttonLayout;
    public Callback callback;
    public final long chatId;
    public TextView createTextView;
    public int currentInviteDate;
    public final int[] defaultDates;
    public final int[] defaultUses;
    public final ArrayList dispalyedDates;
    public final ArrayList dispalyedUses;
    public TextInfoPrivacyCell divider;
    public TextInfoPrivacyCell dividerName;
    public TextInfoPrivacyCell dividerUses;
    public boolean ignoreSet;
    public TLRPC.TL_chatInviteExported inviteToEdit;
    public boolean loading;
    public AnonymousClass5 nameEditText;
    public AlertDialog progressDialog;
    public TextSettingsCell revokeLink;
    public SectionsScrollView scrollView;
    public int shakeDp;
    public TextCheckCell subCell;
    public AnonymousClass8 subEditPriceCell;
    public TextInfoPrivacyCell subInfoCell;
    public TextView subPriceView;
    public SlideChooseView timeChooseView;
    public TextView timeEditText;
    public HeaderCell timeHeaderCell;
    public final int type;
    public SlideChooseView usesChooseView;
    public AnonymousClass5 usesEditText;
    public HeaderCell usesHeaderCell;

    public final class AnonymousClass7 extends TextCheckCell {
        @Override
        public final void onDraw(Canvas canvas) {
            canvas.save();
            canvas.clipRect(0, 0, getWidth(), getHeight());
            super.onDraw(canvas);
            canvas.restore();
        }
    }

    public interface Callback {
        void onLinkCreated(TLObject tLObject);

        void onLinkEdited(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject);

        void revokeLink(TLRPC.TL_chatInviteExported tL_chatInviteExported);
    }

    public LinkEditActivity(int i, long j) {
        super(null);
        this.shakeDp = -3;
        this.dispalyedDates = new ArrayList();
        this.defaultDates = new int[]{3600, 86400, 604800};
        this.dispalyedUses = new ArrayList();
        this.defaultUses = new int[]{1, 10, 100};
        this.type = i;
        this.chatId = j;
    }

    public final void chooseDate(int i) {
        int[] iArr;
        long j = i;
        this.timeEditText.setText(LocaleController.formatDateAudio(j, false));
        int currentTime = i - getConnectionsManager().getCurrentTime();
        ArrayList arrayList = this.dispalyedDates;
        arrayList.clear();
        int iM = 0;
        boolean z = false;
        int length = 0;
        while (true) {
            iArr = this.defaultDates;
            if (iM >= iArr.length) {
                break;
            }
            if (!z && currentTime < iArr[iM]) {
                arrayList.add(Integer.valueOf(currentTime));
                length = iM;
                z = true;
            }
            iM = LocationController$$ExternalSyntheticOutline0.m(iArr[iM], iM, 1, arrayList);
        }
        if (!z) {
            arrayList.add(Integer.valueOf(currentTime));
            length = iArr.length;
        }
        int size = arrayList.size();
        int i2 = size + 1;
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == size) {
                strArr[i3] = LocaleController.getString(R.string.NoLimit);
            } else if (((Integer) arrayList.get(i3)).intValue() == iArr[0]) {
                strArr[i3] = LocaleController.formatPluralString("Hours", 1, new Object[0]);
            } else if (((Integer) arrayList.get(i3)).intValue() == iArr[1]) {
                strArr[i3] = LocaleController.formatPluralString("Days", 1, new Object[0]);
            } else if (((Integer) arrayList.get(i3)).intValue() == iArr[2]) {
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
        this.timeChooseView.setOptions(length, null, strArr);
    }

    public final void chooseUses(int i) {
        int[] iArr;
        int i2;
        ArrayList arrayList = this.dispalyedUses;
        arrayList.clear();
        int iM = 0;
        boolean z = false;
        int length = 0;
        while (true) {
            iArr = this.defaultUses;
            if (iM >= iArr.length) {
                break;
            }
            if (!z && i <= (i2 = iArr[iM])) {
                if (i != i2) {
                    arrayList.add(Integer.valueOf(i));
                }
                length = iM;
                z = true;
            }
            iM = LocationController$$ExternalSyntheticOutline0.m(iArr[iM], iM, 1, arrayList);
        }
        if (!z) {
            arrayList.add(Integer.valueOf(i));
            length = iArr.length;
        }
        int size = arrayList.size();
        int i3 = size + 1;
        String[] strArr = new String[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 == size) {
                strArr[i4] = LocaleController.getString(R.string.NoLimit);
            } else {
                strArr[i4] = ((Integer) arrayList.get(i4)).toString();
            }
        }
        this.usesChooseView.setOptions(length, null, strArr);
    }

    @Override
    public final View createView(Context context) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        int i = 3;
        int i2 = 4;
        final int i3 = 0;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i4 = this.type;
        if (i4 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewLink));
        } else if (i4 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditLink));
        }
        this.actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 28));
        TextView textView = new TextView(context);
        this.createTextView = textView;
        textView.setBackground(new AnonymousClass2(0));
        this.createTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.createTextView.setGravity(17);
        this.createTextView.setOnClickListener(new View.OnClickListener(this) {
            public final LinkEditActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                long j;
                boolean z;
                switch (i3) {
                    case 0:
                        final LinkEditActivity linkEditActivity = this.f$0;
                        if (!linkEditActivity.loading) {
                            int selectedIndex = linkEditActivity.timeChooseView.getSelectedIndex();
                            ArrayList arrayList = linkEditActivity.dispalyedDates;
                            if (selectedIndex < arrayList.size() && ((Integer) arrayList.get(selectedIndex)).intValue() < 0) {
                                AndroidUtilities.shakeView(linkEditActivity.timeEditText);
                                Vibrator vibrator = (Vibrator) linkEditActivity.timeEditText.getContext().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                            } else {
                                TextCheckCell textCheckCell = linkEditActivity.subCell;
                                if (textCheckCell == null || !textCheckCell.checkBox.isChecked) {
                                    j = 0;
                                } else {
                                    try {
                                        j = Long.parseLong(linkEditActivity.subEditPriceCell.editText.getText().toString());
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        j = 0;
                                    }
                                }
                                ArrayList arrayList2 = linkEditActivity.dispalyedUses;
                                long j2 = linkEditActivity.chatId;
                                int i5 = linkEditActivity.type;
                                if (i5 == 0) {
                                    AlertDialog alertDialog = linkEditActivity.progressDialog;
                                    if (alertDialog != null) {
                                        alertDialog.dismiss();
                                    }
                                    linkEditActivity.loading = true;
                                    AlertDialog alertDialog2 = new AlertDialog(linkEditActivity.getParentActivity(), 3, null);
                                    linkEditActivity.progressDialog = alertDialog2;
                                    AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog2.showRunnable;
                                    AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                                    AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 500L);
                                    TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                    tL_messages_exportChatInvite.peer = linkEditActivity.getMessagesController().getInputPeer(-j2);
                                    tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                    int selectedIndex2 = linkEditActivity.timeChooseView.getSelectedIndex();
                                    tL_messages_exportChatInvite.flags |= 1;
                                    if (selectedIndex2 < arrayList.size()) {
                                        tL_messages_exportChatInvite.expire_date = linkEditActivity.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(selectedIndex2)).intValue();
                                    } else {
                                        tL_messages_exportChatInvite.expire_date = 0;
                                    }
                                    int selectedIndex3 = linkEditActivity.usesChooseView.getSelectedIndex();
                                    tL_messages_exportChatInvite.flags |= 2;
                                    if (selectedIndex3 < arrayList2.size()) {
                                        tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList2.get(selectedIndex3)).intValue();
                                    } else {
                                        tL_messages_exportChatInvite.usage_limit = 0;
                                    }
                                    LinkEditActivity.AnonymousClass7 anonymousClass7 = linkEditActivity.approveCell;
                                    boolean z2 = anonymousClass7 != null && anonymousClass7.checkBox.isChecked;
                                    tL_messages_exportChatInvite.request_needed = z2;
                                    if (z2) {
                                        tL_messages_exportChatInvite.usage_limit = 0;
                                    }
                                    String string = linkEditActivity.nameEditText.getText().toString();
                                    tL_messages_exportChatInvite.title = string;
                                    if (!TextUtils.isEmpty(string)) {
                                        tL_messages_exportChatInvite.flags |= 16;
                                    }
                                    if (j > 0) {
                                        tL_messages_exportChatInvite.flags |= 32;
                                        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                        tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                        tL_starsSubscriptionPricing.period = linkEditActivity.getConnectionsManager().isTestBackend() ? 300 : 2592000;
                                        tL_messages_exportChatInvite.subscription_pricing.amount = j;
                                    }
                                    final int i6 = 0;
                                    linkEditActivity.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() {
                                        @Override
                                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                            switch (i6) {
                                                case 0:
                                                    final LinkEditActivity linkEditActivity2 = linkEditActivity;
                                                    final int i7 = 0;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (i7) {
                                                                case 0:
                                                                    LinkEditActivity linkEditActivity3 = linkEditActivity2;
                                                                    linkEditActivity3.loading = false;
                                                                    AlertDialog alertDialog3 = linkEditActivity3.progressDialog;
                                                                    if (alertDialog3 != null) {
                                                                        alertDialog3.dismiss();
                                                                    }
                                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                                    if (tL_error2 != null) {
                                                                        AlertsCreator.showSimpleAlert(linkEditActivity3, null, tL_error2.text, null);
                                                                    } else {
                                                                        LinkEditActivity.Callback callback = linkEditActivity3.callback;
                                                                        if (callback != null) {
                                                                            callback.onLinkCreated(tLObject);
                                                                        }
                                                                        linkEditActivity3.finishFragment();
                                                                    }
                                                                    break;
                                                                default:
                                                                    LinkEditActivity linkEditActivity4 = linkEditActivity2;
                                                                    linkEditActivity4.loading = false;
                                                                    AlertDialog alertDialog4 = linkEditActivity4.progressDialog;
                                                                    if (alertDialog4 != null) {
                                                                        alertDialog4.dismiss();
                                                                    }
                                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                                    if (tL_error3 != null) {
                                                                        AlertsCreator.showSimpleAlert(linkEditActivity4, null, tL_error3.text, null);
                                                                    } else {
                                                                        TLObject tLObject2 = tLObject;
                                                                        if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                            linkEditActivity4.inviteToEdit = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                        }
                                                                        LinkEditActivity.Callback callback2 = linkEditActivity4.callback;
                                                                        if (callback2 != null) {
                                                                            callback2.onLinkEdited(linkEditActivity4.inviteToEdit, tLObject2);
                                                                        }
                                                                        linkEditActivity4.finishFragment();
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final LinkEditActivity linkEditActivity3 = linkEditActivity;
                                                    final int i8 = 1;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (i8) {
                                                                case 0:
                                                                    LinkEditActivity linkEditActivity4 = linkEditActivity3;
                                                                    linkEditActivity4.loading = false;
                                                                    AlertDialog alertDialog3 = linkEditActivity4.progressDialog;
                                                                    if (alertDialog3 != null) {
                                                                        alertDialog3.dismiss();
                                                                    }
                                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                                    if (tL_error2 != null) {
                                                                        AlertsCreator.showSimpleAlert(linkEditActivity4, null, tL_error2.text, null);
                                                                    } else {
                                                                        LinkEditActivity.Callback callback = linkEditActivity4.callback;
                                                                        if (callback != null) {
                                                                            callback.onLinkCreated(tLObject);
                                                                        }
                                                                        linkEditActivity4.finishFragment();
                                                                    }
                                                                    break;
                                                                default:
                                                                    LinkEditActivity linkEditActivity5 = linkEditActivity3;
                                                                    linkEditActivity5.loading = false;
                                                                    AlertDialog alertDialog4 = linkEditActivity5.progressDialog;
                                                                    if (alertDialog4 != null) {
                                                                        alertDialog4.dismiss();
                                                                    }
                                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                                    if (tL_error3 != null) {
                                                                        AlertsCreator.showSimpleAlert(linkEditActivity5, null, tL_error3.text, null);
                                                                    } else {
                                                                        TLObject tLObject2 = tLObject;
                                                                        if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                            linkEditActivity5.inviteToEdit = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                        }
                                                                        LinkEditActivity.Callback callback2 = linkEditActivity5.callback;
                                                                        if (callback2 != null) {
                                                                            callback2.onLinkEdited(linkEditActivity5.inviteToEdit, tLObject2);
                                                                        }
                                                                        linkEditActivity5.finishFragment();
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                            }
                                        }
                                    });
                                } else if (i5 == 1) {
                                    AlertDialog alertDialog3 = linkEditActivity.progressDialog;
                                    if (alertDialog3 != null) {
                                        alertDialog3.dismiss();
                                    }
                                    TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                    tL_messages_editExportedChatInvite.link = linkEditActivity.inviteToEdit.link;
                                    tL_messages_editExportedChatInvite.revoked = false;
                                    tL_messages_editExportedChatInvite.peer = linkEditActivity.getMessagesController().getInputPeer(-j2);
                                    int selectedIndex4 = linkEditActivity.timeChooseView.getSelectedIndex();
                                    if (selectedIndex4 < arrayList.size()) {
                                        if (linkEditActivity.currentInviteDate != ((Integer) arrayList.get(selectedIndex4)).intValue()) {
                                            tL_messages_editExportedChatInvite.flags |= 1;
                                            tL_messages_editExportedChatInvite.expire_date = linkEditActivity.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(selectedIndex4)).intValue();
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                    } else if (linkEditActivity.currentInviteDate != 0) {
                                        tL_messages_editExportedChatInvite.flags |= 1;
                                        tL_messages_editExportedChatInvite.expire_date = 0;
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    int selectedIndex5 = linkEditActivity.usesChooseView.getSelectedIndex();
                                    if (selectedIndex5 < arrayList2.size()) {
                                        int iIntValue = ((Integer) arrayList2.get(selectedIndex5)).intValue();
                                        if (linkEditActivity.inviteToEdit.usage_limit != iIntValue) {
                                            tL_messages_editExportedChatInvite.flags |= 2;
                                            tL_messages_editExportedChatInvite.usage_limit = iIntValue;
                                            z = true;
                                        }
                                    } else if (linkEditActivity.inviteToEdit.usage_limit != 0) {
                                        tL_messages_editExportedChatInvite.flags |= 2;
                                        tL_messages_editExportedChatInvite.usage_limit = 0;
                                        z = true;
                                    }
                                    boolean z3 = linkEditActivity.inviteToEdit.request_needed;
                                    LinkEditActivity.AnonymousClass7 anonymousClass8 = linkEditActivity.approveCell;
                                    if (z3 != (anonymousClass8 != null && anonymousClass8.checkBox.isChecked)) {
                                        int i7 = tL_messages_editExportedChatInvite.flags;
                                        tL_messages_editExportedChatInvite.flags = i7 | 8;
                                        boolean z4 = anonymousClass8 != null && anonymousClass8.checkBox.isChecked;
                                        tL_messages_editExportedChatInvite.request_needed = z4;
                                        if (z4) {
                                            tL_messages_editExportedChatInvite.flags = i7 | 10;
                                            tL_messages_editExportedChatInvite.usage_limit = 0;
                                        }
                                        z = true;
                                    }
                                    String string2 = linkEditActivity.nameEditText.getText().toString();
                                    if (!TextUtils.equals(linkEditActivity.inviteToEdit.title, string2)) {
                                        tL_messages_editExportedChatInvite.title = string2;
                                        tL_messages_editExportedChatInvite.flags |= 16;
                                        z = true;
                                    }
                                    if (!z) {
                                        linkEditActivity.finishFragment();
                                    } else {
                                        linkEditActivity.loading = true;
                                        AlertDialog alertDialog4 = new AlertDialog(linkEditActivity.getParentActivity(), 3, null);
                                        linkEditActivity.progressDialog = alertDialog4;
                                        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda2 = alertDialog4.showRunnable;
                                        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda2);
                                        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda2, 500L);
                                        final int i8 = 1;
                                        linkEditActivity.getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() {
                                            @Override
                                            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                switch (i8) {
                                                    case 0:
                                                        final LinkEditActivity linkEditActivity2 = linkEditActivity;
                                                        final int i9 = 0;
                                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                                            @Override
                                                            public final void run() {
                                                                switch (i9) {
                                                                    case 0:
                                                                        LinkEditActivity linkEditActivity4 = linkEditActivity2;
                                                                        linkEditActivity4.loading = false;
                                                                        AlertDialog alertDialog5 = linkEditActivity4.progressDialog;
                                                                        if (alertDialog5 != null) {
                                                                            alertDialog5.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            AlertsCreator.showSimpleAlert(linkEditActivity4, null, tL_error2.text, null);
                                                                        } else {
                                                                            LinkEditActivity.Callback callback = linkEditActivity4.callback;
                                                                            if (callback != null) {
                                                                                callback.onLinkCreated(tLObject);
                                                                            }
                                                                            linkEditActivity4.finishFragment();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        LinkEditActivity linkEditActivity5 = linkEditActivity2;
                                                                        linkEditActivity5.loading = false;
                                                                        AlertDialog alertDialog6 = linkEditActivity5.progressDialog;
                                                                        if (alertDialog6 != null) {
                                                                            alertDialog6.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            AlertsCreator.showSimpleAlert(linkEditActivity5, null, tL_error3.text, null);
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                linkEditActivity5.inviteToEdit = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            LinkEditActivity.Callback callback2 = linkEditActivity5.callback;
                                                                            if (callback2 != null) {
                                                                                callback2.onLinkEdited(linkEditActivity5.inviteToEdit, tLObject2);
                                                                            }
                                                                            linkEditActivity5.finishFragment();
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        break;
                                                    default:
                                                        final LinkEditActivity linkEditActivity3 = linkEditActivity;
                                                        final int i10 = 1;
                                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                                            @Override
                                                            public final void run() {
                                                                switch (i10) {
                                                                    case 0:
                                                                        LinkEditActivity linkEditActivity4 = linkEditActivity3;
                                                                        linkEditActivity4.loading = false;
                                                                        AlertDialog alertDialog5 = linkEditActivity4.progressDialog;
                                                                        if (alertDialog5 != null) {
                                                                            alertDialog5.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            AlertsCreator.showSimpleAlert(linkEditActivity4, null, tL_error2.text, null);
                                                                        } else {
                                                                            LinkEditActivity.Callback callback = linkEditActivity4.callback;
                                                                            if (callback != null) {
                                                                                callback.onLinkCreated(tLObject);
                                                                            }
                                                                            linkEditActivity4.finishFragment();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        LinkEditActivity linkEditActivity5 = linkEditActivity3;
                                                                        linkEditActivity5.loading = false;
                                                                        AlertDialog alertDialog6 = linkEditActivity5.progressDialog;
                                                                        if (alertDialog6 != null) {
                                                                            alertDialog6.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            AlertsCreator.showSimpleAlert(linkEditActivity5, null, tL_error3.text, null);
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                linkEditActivity5.inviteToEdit = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            LinkEditActivity.Callback callback2 = linkEditActivity5.callback;
                                                                            if (callback2 != null) {
                                                                                callback2.onLinkEdited(linkEditActivity5.inviteToEdit, tLObject2);
                                                                            }
                                                                            linkEditActivity5.finishFragment();
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        LinkEditActivity linkEditActivity2 = this.f$0;
                        AlertDialog.Builder builder = new AlertDialog.Builder(linkEditActivity2.getParentActivity(), 0, null);
                        String string3 = LocaleController.getString(R.string.RevokeAlert);
                        AlertDialog alertDialog5 = builder.alertDialog;
                        alertDialog5.message = string3;
                        alertDialog5.title = LocaleController.getString(R.string.RevokeLink);
                        builder.setPositiveButton(LocaleController.getString(R.string.RevokeButton), new LinkEditActivity$$ExternalSyntheticLambda3(linkEditActivity2, 1));
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                        linkEditActivity2.showDialog(alertDialog5);
                        break;
                }
            }
        });
        this.createTextView.setSingleLine();
        if (i4 == 0) {
            this.createTextView.setText(LocaleController.getString(R.string.CreateLinkHeaderNoCaps));
        } else if (i4 == 1) {
            this.createTextView.setText(LocaleController.getString(R.string.SaveLinkHeaderNoCaps));
        }
        this.createTextView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        this.createTextView.setTextSize(1, 14.0f);
        this.createTextView.setTypeface(AndroidUtilities.bold());
        this.createTextView.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        ScaleStateListAnimator.apply(this.createTextView, 0.1f, 1.5f);
        this.actionBar.addView(this.createTextView, LayoutHelper.createFrame(-2, ActionBar.getCurrentActionBarHeight() / AndroidUtilities.density, 8388693, 0.0f, 0.0f, 12.0f, 0.0f));
        GLIconSettingsView gLIconSettingsView = new GLIconSettingsView(context) {
            @Override
            public final void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                LinkEditActivity.this.getClass();
            }

            @Override
            public final void onMeasure(int i5, int i6) {
                super.onMeasure(i5, i6);
            }
        };
        SectionsScrollView sectionsScrollView = new SectionsScrollView(context, gLIconSettingsView, this.resourceProvider, true);
        this.scrollView = sectionsScrollView;
        this.actionBar.setAdaptiveBackground(sectionsScrollView);
        LoginActivity.AnonymousClass2 anonymousClass2 = new LoginActivity.AnonymousClass2(this, context, i2);
        this.fragmentView = anonymousClass2;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        layoutTransition.setInterpolator(2, cubicBezierInterpolator);
        layoutTransition.setInterpolator(0, cubicBezierInterpolator);
        layoutTransition.setInterpolator(4, cubicBezierInterpolator);
        layoutTransition.setInterpolator(1, cubicBezierInterpolator);
        layoutTransition.setInterpolator(3, cubicBezierInterpolator);
        gLIconSettingsView.setLayoutTransition(layoutTransition);
        gLIconSettingsView.setOrientation(1);
        gLIconSettingsView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(91.0f));
        this.scrollView.addView(gLIconSettingsView);
        HeaderCell headerCell = new HeaderCell(context);
        this.timeHeaderCell = headerCell;
        headerCell.setText(LocaleController.getString(R.string.LimitByPeriod));
        gLIconSettingsView.addView(this.timeHeaderCell);
        SlideChooseView slideChooseView = new SlideChooseView(context, null);
        this.timeChooseView = slideChooseView;
        gLIconSettingsView.addView(slideChooseView);
        TextView textView2 = new TextView(context);
        this.timeEditText = textView2;
        textView2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.timeEditText.setGravity(16);
        this.timeEditText.setTextSize(1, 16.0f);
        this.timeEditText.setHint(LocaleController.getString(R.string.TimeLimitHint));
        this.timeEditText.setOnClickListener(new IntroActivity$$ExternalSyntheticLambda1(20, this, context));
        this.timeChooseView.setCallback(new LinkEditActivity$$ExternalSyntheticLambda3(this, i3));
        ArrayList arrayList = this.dispalyedDates;
        arrayList.clear();
        int iM = 0;
        while (true) {
            int[] iArr = this.defaultDates;
            if (iM >= iArr.length) {
                break;
            }
            iM = LocationController$$ExternalSyntheticOutline0.m(iArr[iM], iM, 1, arrayList);
        }
        this.timeChooseView.setOptions(3, null, LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Days", 1, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.getString(R.string.NoLimit));
        gLIconSettingsView.addView(this.timeEditText, LayoutHelper.createLinear(-1, 50));
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        this.divider = textInfoPrivacyCell;
        textInfoPrivacyCell.setText(LocaleController.getString(R.string.TimeLimitHelp));
        gLIconSettingsView.addView(this.divider);
        HeaderCell headerCell2 = new HeaderCell(context);
        this.usesHeaderCell = headerCell2;
        headerCell2.setText(LocaleController.getString(R.string.LimitNumberOfUses));
        gLIconSettingsView.addView(this.usesHeaderCell);
        SlideChooseView slideChooseView2 = new SlideChooseView(context, null);
        this.usesChooseView = slideChooseView2;
        slideChooseView2.setCallback(new LinkEditActivity$$ExternalSyntheticLambda3(this, i));
        resetUses();
        gLIconSettingsView.addView(this.usesChooseView);
        ?? r2 = new EditText(context) {
            @Override
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                switch (i3) {
                    case 0:
                        if (motionEvent.getAction() == 1) {
                            setCursorVisible(true);
                        }
                        break;
                    default:
                        if (motionEvent.getAction() == 1) {
                            setCursorVisible(true);
                        }
                        break;
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.usesEditText = r2;
        r2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        setGravity(16);
        setTextSize(1, 16.0f);
        setHint(LocaleController.getString(R.string.UsesLimitHint));
        setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        setInputType(2);
        addTextChangedListener(new TextWatcher(this) {
            public final LinkEditActivity this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void afterTextChanged(Editable editable) {
                switch (i3) {
                    case 0:
                        LinkEditActivity linkEditActivity = this.this$0;
                        if (!linkEditActivity.ignoreSet) {
                            if (editable.toString().equals("0")) {
                                linkEditActivity.usesEditText.setText("");
                            } else {
                                try {
                                    int i5 = Integer.parseInt(editable.toString());
                                    if (i5 <= 100000) {
                                        linkEditActivity.chooseUses(i5);
                                    } else {
                                        linkEditActivity.resetUses();
                                    }
                                } catch (NumberFormatException unused) {
                                    linkEditActivity.resetUses();
                                    return;
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        Emoji.replaceEmoji(editable, getPaint().getFontMetricsInt(), false);
                        break;
                }
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                int i8 = i3;
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                int i8 = i3;
            }

            private final void beforeTextChanged$org$telegram$ui$LinkEditActivity$10(int i5, int i6, int i7, CharSequence charSequence) {
            }

            private final void beforeTextChanged$org$telegram$ui$LinkEditActivity$6(int i5, int i6, int i7, CharSequence charSequence) {
            }

            private final void onTextChanged$org$telegram$ui$LinkEditActivity$10(int i5, int i6, int i7, CharSequence charSequence) {
            }

            private final void onTextChanged$org$telegram$ui$LinkEditActivity$6(int i5, int i6, int i7, CharSequence charSequence) {
            }
        });
        gLIconSettingsView.addView(this.usesEditText, LayoutHelper.createLinear(-1, 50));
        TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        this.dividerUses = textInfoPrivacyCell2;
        textInfoPrivacyCell2.setText(LocaleController.getString(R.string.UsesLimitHelp));
        gLIconSettingsView.addView(this.dividerUses);
        MessagesController messagesController = getMessagesController();
        long j = this.chatId;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j));
        boolean z = (!ChatObject.isPublic(chat) || chat.join_request || chat.join_to_send) ? false : true;
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(context);
        this.approveCell = anonymousClass7;
        int i5 = Theme.key_windowBackgroundWhite;
        anonymousClass7.setBackgroundColor(Theme.getColor(null, i5, false));
        this.approveCell.setTag(Integer.valueOf(i5));
        this.approveCell.setTextAndCheck(LocaleController.getString(R.string.ApproveNewMembers2), false, false);
        this.approveCell.setOnClickListener(new LinkEditActivity$$ExternalSyntheticLambda5(i3, this, z));
        gLIconSettingsView.addView(this.approveCell, LayoutHelper.createLinear(-1, 56));
        TextInfoPrivacyCell textInfoPrivacyCell3 = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        this.approveHintCell = textInfoPrivacyCell3;
        if (z) {
            this.approveCell.setCheckBoxIcon(R.drawable.permission_locked);
            this.approveHintCell.setText(LocaleController.getString(R.string.ApproveNewMembersUnavailablePublicGroup));
        } else {
            textInfoPrivacyCell3.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        }
        gLIconSettingsView.addView(this.approveHintCell);
        if (chat == null || chat.username == null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j);
            if ((this.inviteToEdit == null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j))) && chatFull != null && chatFull.paid_media_allowed) || ((tL_chatInviteExported = this.inviteToEdit) != null && tL_chatInviteExported.subscription_pricing != null)) {
                TextCheckCell textCheckCell = new TextCheckCell(context);
                this.subCell = textCheckCell;
                textCheckCell.setBackgroundColor(Theme.getColor(null, i5, false));
                this.subCell.setDrawCheckRipple(true);
                this.subCell.setTextAndCheck(LocaleController.getString(R.string.RequireMonthlyFee), false, true);
                if (this.inviteToEdit != null) {
                    this.subCell.setCheckBoxIcon(R.drawable.permission_locked);
                    this.subCell.setEnabled(false);
                }
                this.subCell.setOnClickListener(new IntroActivity$$ExternalSyntheticLambda1(21, this, new Runnable[1]));
                gLIconSettingsView.addView(this.subCell, LayoutHelper.createLinear(-1, 48));
                TextView textView3 = new TextView(context);
                this.subPriceView = textView3;
                textView3.setTextSize(1, 16.0f);
                this.subPriceView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText3, false));
                ?? r3 = new EditTextCell(context, LocaleController.getString(getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceHintTest5Minutes : R.string.RequireMonthlyFeePriceHint), this.resourceProvider) {
                    public boolean ignoreTextChanged;

                    @Override
                    public final void onTextChanged(Editable editable) {
                        if (this.ignoreTextChanged) {
                            return;
                        }
                        boolean zIsEmpty = TextUtils.isEmpty(editable);
                        LinkEditActivity linkEditActivity = LinkEditActivity.this;
                        if (zIsEmpty) {
                            linkEditActivity.subPriceView.setText("");
                            return;
                        }
                        try {
                            long j2 = Long.parseLong(editable.toString());
                            if (j2 > linkEditActivity.getMessagesController().starsSubscriptionAmountMax) {
                                this.ignoreTextChanged = true;
                                j2 = linkEditActivity.getMessagesController().starsSubscriptionAmountMax;
                                setText(Long.toString(j2));
                                this.ignoreTextChanged = false;
                            }
                            linkEditActivity.subPriceView.setText(LocaleController.formatString(linkEditActivity.getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceTest5Minutes : R.string.RequireMonthlyFeePrice, BillingController.getInstance().formatCurrency((long) ((j2 / 1000.0d) * ((double) MessagesController.getInstance(((BaseFragment) linkEditActivity).currentAccount).starsUsdWithdrawRate1000)), "USD")));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                };
                this.subEditPriceCell = r3;
                r3.editText.setInputType(2);
                this.subEditPriceCell.editText.setRawInputType(2);
                setBackgroundColor(getThemedColor(i5));
                hideKeyboardOnEnter();
                addView(this.subPriceView, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                AnonymousClass8 anonymousClass8 = this.subEditPriceCell;
                Drawable drawableMutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                anonymousClass8.getClass();
                ImageView imageView = new ImageView(anonymousClass8.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(drawableMutate);
                anonymousClass8.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                EditTextCell.AnonymousClass2 anonymousClass3 = anonymousClass8.editText;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) anonymousClass3.getLayoutParams();
                layoutParams.leftMargin = AndroidUtilities.dp(24.0f);
                anonymousClass3.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(AndroidUtilities.dp(-1.0f));
                imageView.setTranslationX(AndroidUtilities.dp(1.0f));
                gLIconSettingsView.addView(this.subEditPriceCell, LayoutHelper.createLinear(-1, 48));
                setVisibility(8);
                TextInfoPrivacyCell textInfoPrivacyCell4 = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
                this.subInfoCell = textInfoPrivacyCell4;
                if (this.inviteToEdit != null) {
                    textInfoPrivacyCell4.setText(LocaleController.getString(R.string.RequireMonthlyFeeInfoFrozen));
                } else {
                    textInfoPrivacyCell4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.RequireMonthlyFeeInfo), new LinkEditActivity$$ExternalSyntheticLambda7(this, i3)));
                }
                gLIconSettingsView.addView(this.subInfoCell, LayoutHelper.createLinear(-1, -2));
            }
        }
        final int i6 = 1;
        ?? r4 = new EditText(context) {
            @Override
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                switch (i6) {
                    case 0:
                        if (motionEvent.getAction() == 1) {
                            setCursorVisible(true);
                        }
                        break;
                    default:
                        if (motionEvent.getAction() == 1) {
                            setCursorVisible(true);
                        }
                        break;
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.nameEditText = r4;
        r4.addTextChangedListener(new TextWatcher(this) {
            public final LinkEditActivity this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void afterTextChanged(Editable editable) {
                switch (i6) {
                    case 0:
                        LinkEditActivity linkEditActivity = this.this$0;
                        if (!linkEditActivity.ignoreSet) {
                            if (editable.toString().equals("0")) {
                                linkEditActivity.usesEditText.setText("");
                            } else {
                                try {
                                    int i7 = Integer.parseInt(editable.toString());
                                    if (i7 <= 100000) {
                                        linkEditActivity.chooseUses(i7);
                                    } else {
                                        linkEditActivity.resetUses();
                                    }
                                } catch (NumberFormatException unused) {
                                    linkEditActivity.resetUses();
                                    return;
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        Emoji.replaceEmoji(editable, getPaint().getFontMetricsInt(), false);
                        break;
                }
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
                int i10 = i6;
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
                int i10 = i6;
            }

            private final void beforeTextChanged$org$telegram$ui$LinkEditActivity$10(int i7, int i8, int i9, CharSequence charSequence) {
            }

            private final void beforeTextChanged$org$telegram$ui$LinkEditActivity$6(int i7, int i8, int i9, CharSequence charSequence) {
            }

            private final void onTextChanged$org$telegram$ui$LinkEditActivity$10(int i7, int i8, int i9, CharSequence charSequence) {
            }

            private final void onTextChanged$org$telegram$ui$LinkEditActivity$6(int i7, int i8, int i9, CharSequence charSequence) {
            }
        });
        setCursorVisible(false);
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        setGravity(16);
        setHint(LocaleController.getString(R.string.LinkNameHint));
        AnonymousClass5 anonymousClass5 = this.nameEditText;
        int i7 = Theme.key_windowBackgroundWhiteGrayText;
        anonymousClass5.setHintTextColor(Theme.getColor(null, i7, false));
        setLines(1);
        setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        setSingleLine();
        AnonymousClass5 anonymousClass6 = this.nameEditText;
        int i8 = Theme.key_windowBackgroundWhiteBlackText;
        anonymousClass6.setTextColor(Theme.getColor(null, i8, false));
        setTextSize(1, 16.0f);
        gLIconSettingsView.addView(this.nameEditText, LayoutHelper.createLinear(-1, 50));
        TextInfoPrivacyCell textInfoPrivacyCell5 = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        this.dividerName = textInfoPrivacyCell5;
        textInfoPrivacyCell5.setText(LocaleController.getString(R.string.LinkNameHelp));
        gLIconSettingsView.addView(this.dividerName);
        if (i4 == 1) {
            TextSettingsCell textSettingsCell = new TextSettingsCell(context, 0, null);
            this.revokeLink = textSettingsCell;
            textSettingsCell.setBackgroundColor(Theme.getColor(null, i5, false));
            this.revokeLink.setText(LocaleController.getString(R.string.RevokeLink), false);
            this.revokeLink.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
            final int i9 = 1;
            this.revokeLink.setOnClickListener(new View.OnClickListener(this) {
                public final LinkEditActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    long j2;
                    boolean z2;
                    switch (i9) {
                        case 0:
                            final LinkEditActivity linkEditActivity = this.f$0;
                            if (!linkEditActivity.loading) {
                                int selectedIndex = linkEditActivity.timeChooseView.getSelectedIndex();
                                ArrayList arrayList2 = linkEditActivity.dispalyedDates;
                                if (selectedIndex < arrayList2.size() && ((Integer) arrayList2.get(selectedIndex)).intValue() < 0) {
                                    AndroidUtilities.shakeView(linkEditActivity.timeEditText);
                                    Vibrator vibrator = (Vibrator) linkEditActivity.timeEditText.getContext().getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                    }
                                } else {
                                    TextCheckCell textCheckCell2 = linkEditActivity.subCell;
                                    if (textCheckCell2 == null || !textCheckCell2.checkBox.isChecked) {
                                        j2 = 0;
                                    } else {
                                        try {
                                            j2 = Long.parseLong(linkEditActivity.subEditPriceCell.editText.getText().toString());
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                            j2 = 0;
                                        }
                                    }
                                    ArrayList arrayList3 = linkEditActivity.dispalyedUses;
                                    long j3 = linkEditActivity.chatId;
                                    int i10 = linkEditActivity.type;
                                    if (i10 == 0) {
                                        AlertDialog alertDialog = linkEditActivity.progressDialog;
                                        if (alertDialog != null) {
                                            alertDialog.dismiss();
                                        }
                                        linkEditActivity.loading = true;
                                        AlertDialog alertDialog2 = new AlertDialog(linkEditActivity.getParentActivity(), 3, null);
                                        linkEditActivity.progressDialog = alertDialog2;
                                        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog2.showRunnable;
                                        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                                        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 500L);
                                        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                        tL_messages_exportChatInvite.peer = linkEditActivity.getMessagesController().getInputPeer(-j3);
                                        tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                        int selectedIndex2 = linkEditActivity.timeChooseView.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 1;
                                        if (selectedIndex2 < arrayList2.size()) {
                                            tL_messages_exportChatInvite.expire_date = linkEditActivity.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex2)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.expire_date = 0;
                                        }
                                        int selectedIndex3 = linkEditActivity.usesChooseView.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 2;
                                        if (selectedIndex3 < arrayList3.size()) {
                                            tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList3.get(selectedIndex3)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        LinkEditActivity.AnonymousClass7 anonymousClass9 = linkEditActivity.approveCell;
                                        boolean z3 = anonymousClass9 != null && anonymousClass9.checkBox.isChecked;
                                        tL_messages_exportChatInvite.request_needed = z3;
                                        if (z3) {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        String string = linkEditActivity.nameEditText.getText().toString();
                                        tL_messages_exportChatInvite.title = string;
                                        if (!TextUtils.isEmpty(string)) {
                                            tL_messages_exportChatInvite.flags |= 16;
                                        }
                                        if (j2 > 0) {
                                            tL_messages_exportChatInvite.flags |= 32;
                                            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                            tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                            tL_starsSubscriptionPricing.period = linkEditActivity.getConnectionsManager().isTestBackend() ? 300 : 2592000;
                                            tL_messages_exportChatInvite.subscription_pricing.amount = j2;
                                        }
                                        final int i11 = 0;
                                        linkEditActivity.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() {
                                            @Override
                                            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                switch (i11) {
                                                    case 0:
                                                        final LinkEditActivity linkEditActivity2 = linkEditActivity;
                                                        final int i12 = 0;
                                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                                            @Override
                                                            public final void run() {
                                                                switch (i12) {
                                                                    case 0:
                                                                        LinkEditActivity linkEditActivity4 = linkEditActivity2;
                                                                        linkEditActivity4.loading = false;
                                                                        AlertDialog alertDialog5 = linkEditActivity4.progressDialog;
                                                                        if (alertDialog5 != null) {
                                                                            alertDialog5.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            AlertsCreator.showSimpleAlert(linkEditActivity4, null, tL_error2.text, null);
                                                                        } else {
                                                                            LinkEditActivity.Callback callback = linkEditActivity4.callback;
                                                                            if (callback != null) {
                                                                                callback.onLinkCreated(tLObject);
                                                                            }
                                                                            linkEditActivity4.finishFragment();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        LinkEditActivity linkEditActivity5 = linkEditActivity2;
                                                                        linkEditActivity5.loading = false;
                                                                        AlertDialog alertDialog6 = linkEditActivity5.progressDialog;
                                                                        if (alertDialog6 != null) {
                                                                            alertDialog6.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            AlertsCreator.showSimpleAlert(linkEditActivity5, null, tL_error3.text, null);
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                linkEditActivity5.inviteToEdit = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            LinkEditActivity.Callback callback2 = linkEditActivity5.callback;
                                                                            if (callback2 != null) {
                                                                                callback2.onLinkEdited(linkEditActivity5.inviteToEdit, tLObject2);
                                                                            }
                                                                            linkEditActivity5.finishFragment();
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        break;
                                                    default:
                                                        final LinkEditActivity linkEditActivity3 = linkEditActivity;
                                                        final int i13 = 1;
                                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                                            @Override
                                                            public final void run() {
                                                                switch (i13) {
                                                                    case 0:
                                                                        LinkEditActivity linkEditActivity4 = linkEditActivity3;
                                                                        linkEditActivity4.loading = false;
                                                                        AlertDialog alertDialog5 = linkEditActivity4.progressDialog;
                                                                        if (alertDialog5 != null) {
                                                                            alertDialog5.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            AlertsCreator.showSimpleAlert(linkEditActivity4, null, tL_error2.text, null);
                                                                        } else {
                                                                            LinkEditActivity.Callback callback = linkEditActivity4.callback;
                                                                            if (callback != null) {
                                                                                callback.onLinkCreated(tLObject);
                                                                            }
                                                                            linkEditActivity4.finishFragment();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        LinkEditActivity linkEditActivity5 = linkEditActivity3;
                                                                        linkEditActivity5.loading = false;
                                                                        AlertDialog alertDialog6 = linkEditActivity5.progressDialog;
                                                                        if (alertDialog6 != null) {
                                                                            alertDialog6.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            AlertsCreator.showSimpleAlert(linkEditActivity5, null, tL_error3.text, null);
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                linkEditActivity5.inviteToEdit = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            LinkEditActivity.Callback callback2 = linkEditActivity5.callback;
                                                                            if (callback2 != null) {
                                                                                callback2.onLinkEdited(linkEditActivity5.inviteToEdit, tLObject2);
                                                                            }
                                                                            linkEditActivity5.finishFragment();
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        break;
                                                }
                                            }
                                        });
                                    } else if (i10 == 1) {
                                        AlertDialog alertDialog3 = linkEditActivity.progressDialog;
                                        if (alertDialog3 != null) {
                                            alertDialog3.dismiss();
                                        }
                                        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                        tL_messages_editExportedChatInvite.link = linkEditActivity.inviteToEdit.link;
                                        tL_messages_editExportedChatInvite.revoked = false;
                                        tL_messages_editExportedChatInvite.peer = linkEditActivity.getMessagesController().getInputPeer(-j3);
                                        int selectedIndex4 = linkEditActivity.timeChooseView.getSelectedIndex();
                                        if (selectedIndex4 < arrayList2.size()) {
                                            if (linkEditActivity.currentInviteDate != ((Integer) arrayList2.get(selectedIndex4)).intValue()) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = linkEditActivity.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex4)).intValue();
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                        } else if (linkEditActivity.currentInviteDate != 0) {
                                            tL_messages_editExportedChatInvite.flags |= 1;
                                            tL_messages_editExportedChatInvite.expire_date = 0;
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        int selectedIndex5 = linkEditActivity.usesChooseView.getSelectedIndex();
                                        if (selectedIndex5 < arrayList3.size()) {
                                            int iIntValue = ((Integer) arrayList3.get(selectedIndex5)).intValue();
                                            if (linkEditActivity.inviteToEdit.usage_limit != iIntValue) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = iIntValue;
                                                z2 = true;
                                            }
                                        } else if (linkEditActivity.inviteToEdit.usage_limit != 0) {
                                            tL_messages_editExportedChatInvite.flags |= 2;
                                            tL_messages_editExportedChatInvite.usage_limit = 0;
                                            z2 = true;
                                        }
                                        boolean z4 = linkEditActivity.inviteToEdit.request_needed;
                                        LinkEditActivity.AnonymousClass7 anonymousClass10 = linkEditActivity.approveCell;
                                        if (z4 != (anonymousClass10 != null && anonymousClass10.checkBox.isChecked)) {
                                            int i12 = tL_messages_editExportedChatInvite.flags;
                                            tL_messages_editExportedChatInvite.flags = i12 | 8;
                                            boolean z5 = anonymousClass10 != null && anonymousClass10.checkBox.isChecked;
                                            tL_messages_editExportedChatInvite.request_needed = z5;
                                            if (z5) {
                                                tL_messages_editExportedChatInvite.flags = i12 | 10;
                                                tL_messages_editExportedChatInvite.usage_limit = 0;
                                            }
                                            z2 = true;
                                        }
                                        String string2 = linkEditActivity.nameEditText.getText().toString();
                                        if (!TextUtils.equals(linkEditActivity.inviteToEdit.title, string2)) {
                                            tL_messages_editExportedChatInvite.title = string2;
                                            tL_messages_editExportedChatInvite.flags |= 16;
                                            z2 = true;
                                        }
                                        if (!z2) {
                                            linkEditActivity.finishFragment();
                                        } else {
                                            linkEditActivity.loading = true;
                                            AlertDialog alertDialog4 = new AlertDialog(linkEditActivity.getParentActivity(), 3, null);
                                            linkEditActivity.progressDialog = alertDialog4;
                                            AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda2 = alertDialog4.showRunnable;
                                            AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda2);
                                            AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda2, 500L);
                                            final int i13 = 1;
                                            linkEditActivity.getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() {
                                                @Override
                                                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                    switch (i13) {
                                                        case 0:
                                                            final LinkEditActivity linkEditActivity2 = linkEditActivity;
                                                            final int i14 = 0;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    switch (i14) {
                                                                        case 0:
                                                                            LinkEditActivity linkEditActivity4 = linkEditActivity2;
                                                                            linkEditActivity4.loading = false;
                                                                            AlertDialog alertDialog5 = linkEditActivity4.progressDialog;
                                                                            if (alertDialog5 != null) {
                                                                                alertDialog5.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            if (tL_error2 != null) {
                                                                                AlertsCreator.showSimpleAlert(linkEditActivity4, null, tL_error2.text, null);
                                                                            } else {
                                                                                LinkEditActivity.Callback callback = linkEditActivity4.callback;
                                                                                if (callback != null) {
                                                                                    callback.onLinkCreated(tLObject);
                                                                                }
                                                                                linkEditActivity4.finishFragment();
                                                                            }
                                                                            break;
                                                                        default:
                                                                            LinkEditActivity linkEditActivity5 = linkEditActivity2;
                                                                            linkEditActivity5.loading = false;
                                                                            AlertDialog alertDialog6 = linkEditActivity5.progressDialog;
                                                                            if (alertDialog6 != null) {
                                                                                alertDialog6.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error3 = tL_error;
                                                                            if (tL_error3 != null) {
                                                                                AlertsCreator.showSimpleAlert(linkEditActivity5, null, tL_error3.text, null);
                                                                            } else {
                                                                                TLObject tLObject2 = tLObject;
                                                                                if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                    linkEditActivity5.inviteToEdit = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                }
                                                                                LinkEditActivity.Callback callback2 = linkEditActivity5.callback;
                                                                                if (callback2 != null) {
                                                                                    callback2.onLinkEdited(linkEditActivity5.inviteToEdit, tLObject2);
                                                                                }
                                                                                linkEditActivity5.finishFragment();
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final LinkEditActivity linkEditActivity3 = linkEditActivity;
                                                            final int i15 = 1;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    switch (i15) {
                                                                        case 0:
                                                                            LinkEditActivity linkEditActivity4 = linkEditActivity3;
                                                                            linkEditActivity4.loading = false;
                                                                            AlertDialog alertDialog5 = linkEditActivity4.progressDialog;
                                                                            if (alertDialog5 != null) {
                                                                                alertDialog5.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            if (tL_error2 != null) {
                                                                                AlertsCreator.showSimpleAlert(linkEditActivity4, null, tL_error2.text, null);
                                                                            } else {
                                                                                LinkEditActivity.Callback callback = linkEditActivity4.callback;
                                                                                if (callback != null) {
                                                                                    callback.onLinkCreated(tLObject);
                                                                                }
                                                                                linkEditActivity4.finishFragment();
                                                                            }
                                                                            break;
                                                                        default:
                                                                            LinkEditActivity linkEditActivity5 = linkEditActivity3;
                                                                            linkEditActivity5.loading = false;
                                                                            AlertDialog alertDialog6 = linkEditActivity5.progressDialog;
                                                                            if (alertDialog6 != null) {
                                                                                alertDialog6.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error3 = tL_error;
                                                                            if (tL_error3 != null) {
                                                                                AlertsCreator.showSimpleAlert(linkEditActivity5, null, tL_error3.text, null);
                                                                            } else {
                                                                                TLObject tLObject2 = tLObject;
                                                                                if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                    linkEditActivity5.inviteToEdit = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                }
                                                                                LinkEditActivity.Callback callback2 = linkEditActivity5.callback;
                                                                                if (callback2 != null) {
                                                                                    callback2.onLinkEdited(linkEditActivity5.inviteToEdit, tLObject2);
                                                                                }
                                                                                linkEditActivity5.finishFragment();
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                }
                                break;
                            }
                            break;
                        default:
                            LinkEditActivity linkEditActivity2 = this.f$0;
                            AlertDialog.Builder builder = new AlertDialog.Builder(linkEditActivity2.getParentActivity(), 0, null);
                            String string3 = LocaleController.getString(R.string.RevokeAlert);
                            AlertDialog alertDialog5 = builder.alertDialog;
                            alertDialog5.message = string3;
                            alertDialog5.title = LocaleController.getString(R.string.RevokeLink);
                            builder.setPositiveButton(LocaleController.getString(R.string.RevokeButton), new LinkEditActivity$$ExternalSyntheticLambda3(linkEditActivity2, 1));
                            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                            linkEditActivity2.showDialog(alertDialog5);
                            break;
                    }
                }
            });
            gLIconSettingsView.addView(this.revokeLink);
        }
        anonymousClass2.addView(this.scrollView, LayoutHelper.createFrame(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.buttonLayout = frameLayout;
        int i10 = Theme.key_windowBackgroundGray;
        frameLayout.setBackgroundColor(getThemedColor(i10));
        new KeyboardNotifier(anonymousClass2, false, new LinkEditActivity$$ExternalSyntheticLambda9(i3));
        anonymousClass2.addView(this.buttonLayout, LayoutHelper.createFrame(-1, -2, 80));
        this.timeHeaderCell.setBackgroundColor(Theme.getColor(null, i5, false));
        this.timeChooseView.setBackgroundColor(Theme.getColor(null, i5, false));
        this.timeEditText.setBackgroundColor(Theme.getColor(null, i5, false));
        this.usesHeaderCell.setBackgroundColor(Theme.getColor(null, i5, false));
        this.usesChooseView.setBackgroundColor(Theme.getColor(null, i5, false));
        setBackgroundColor(Theme.getColor(null, i5, false));
        setBackgroundColor(Theme.getColor(null, i5, false));
        anonymousClass2.setBackgroundColor(Theme.getColor(null, i10, false));
        setTextColor(Theme.getColor(null, i8, false));
        setHintTextColor(Theme.getColor(null, i7, false));
        this.timeEditText.setTextColor(Theme.getColor(null, i8, false));
        this.timeEditText.setHintTextColor(Theme.getColor(null, i7, false));
        setCursorVisible(false);
        setInviteToEdit(this.inviteToEdit);
        anonymousClass2.setClipChildren(false);
        this.scrollView.setClipChildren(false);
        gLIconSettingsView.setClipChildren(false);
        return anonymousClass2;
    }

    @Override
    public final void finishFragment() {
        this.scrollView.getLayoutParams().height = this.scrollView.getHeight();
        super.finishFragment();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        QrActivity$$ExternalSyntheticLambda9 qrActivity$$ExternalSyntheticLambda9 = new QrActivity$$ExternalSyntheticLambda9(3, this);
        ArrayList arrayList = new ArrayList();
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
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_featuredStickers_addButton));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_featuredStickers_addButtonPressed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_featuredStickers_buttonText));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_text_RedRegular));
        return arrayList;
    }

    public final void resetUses() {
        ArrayList arrayList = this.dispalyedUses;
        arrayList.clear();
        int iM = 0;
        while (true) {
            int[] iArr = this.defaultUses;
            if (iM >= iArr.length) {
                this.usesChooseView.setOptions(3, null, "1", "10", "100", LocaleController.getString(R.string.NoLimit));
                return;
            }
            iM = LocationController$$ExternalSyntheticOutline0.m(iArr[iM], iM, 1, arrayList);
        }
    }

    public final void setInviteToEdit(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.inviteToEdit = tL_chatInviteExported;
        if (this.fragmentView == null || tL_chatInviteExported == null) {
            return;
        }
        int i = tL_chatInviteExported.expire_date;
        if (i > 0) {
            chooseDate(i);
            this.currentInviteDate = ((Integer) this.dispalyedDates.get(this.timeChooseView.getSelectedIndex())).intValue();
        } else {
            this.currentInviteDate = 0;
        }
        int i2 = tL_chatInviteExported.usage_limit;
        if (i2 > 0) {
            chooseUses(i2);
            setText(Integer.toString(tL_chatInviteExported.usage_limit));
        }
        AnonymousClass7 anonymousClass7 = this.approveCell;
        if (anonymousClass7 != null) {
            anonymousClass7.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            this.approveCell.setChecked(tL_chatInviteExported.request_needed);
        }
        setUsesVisible(!tL_chatInviteExported.request_needed);
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, getPaint().getFontMetricsInt(), false);
            setText(spannableStringBuilder);
        }
        TextCheckCell textCheckCell = this.subCell;
        if (textCheckCell != null) {
            textCheckCell.setChecked(tL_chatInviteExported.subscription_pricing != null);
        }
        if (tL_chatInviteExported.subscription_pricing != null) {
            AnonymousClass7 anonymousClass8 = this.approveCell;
            if (anonymousClass8 != null) {
                anonymousClass8.setChecked(false);
                this.approveCell.setCheckBoxIcon(R.drawable.permission_locked);
            }
            TextInfoPrivacyCell textInfoPrivacyCell = this.approveHintCell;
            if (textInfoPrivacyCell != null) {
                textInfoPrivacyCell.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
            }
        }
        AnonymousClass8 anonymousClass9 = this.subEditPriceCell;
        if (anonymousClass9 != null) {
            anonymousClass9.setVisibility(tL_chatInviteExported.subscription_pricing != null ? 0 : 8);
            setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
            this.subEditPriceCell.editText.setClickable(false);
            this.subEditPriceCell.editText.setFocusable(false);
            this.subEditPriceCell.editText.setFocusableInTouchMode(false);
            this.subEditPriceCell.editText.setLongClickable(false);
        }
    }

    public final void setUsesVisible(boolean z) {
        this.usesHeaderCell.setVisibility(z ? 0 : 8);
        this.usesChooseView.setVisibility(z ? 0 : 8);
        setVisibility(z ? 0 : 8);
        this.dividerUses.setVisibility(z ? 0 : 8);
    }

    public final class AnonymousClass2 extends Drawable {
        public final int $r8$classId;
        public final Paint p;

        public AnonymousClass2(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    Paint paint = new Paint(1);
                    this.p = paint;
                    paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 1593835520);
                    break;
                default:
                    this.p = new Paint(1);
                    break;
            }
        }

        @Override
        public final void draw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    Paint paint = this.p;
                    paint.setColor(Theme.getColor(null, Theme.key_telegram_color, false));
                    canvas.drawRoundRect(getBounds().left, getBounds().exactCenterY() - AndroidUtilities.dp(14.0f), getBounds().right, getBounds().exactCenterY() + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                    break;
                default:
                    canvas.drawCircle(getBounds().centerX(), getBounds().centerY() - AndroidUtilities.dp(1.0f), (getBounds().width() - AndroidUtilities.dp(8.0f)) / 2.0f, this.p);
                    break;
            }
        }

        @Override
        public final int getOpacity() {
            switch (this.$r8$classId) {
            }
            return 0;
        }

        @Override
        public final void setAlpha(int i) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                default:
                    this.p.setAlpha(i);
                    break;
            }
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
            int i = this.$r8$classId;
        }

        private final void setAlpha$org$telegram$ui$LinkEditActivity$2(int i) {
        }

        private final void setColorFilter$org$telegram$ui$ActionBar$RoundVideoShadow(ColorFilter colorFilter) {
        }

        private final void setColorFilter$org$telegram$ui$LinkEditActivity$2(ColorFilter colorFilter) {
        }
    }
}
