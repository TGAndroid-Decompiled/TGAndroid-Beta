package org.telegram.ui;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Business.ChatbotsActivity;
import org.telegram.ui.Business.ChatbotsActivity$$ExternalSyntheticLambda5;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.CreateBotAlert$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.PasscodeView;
import org.telegram.ui.Components.SearchField;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.UsersAlertBase;
import org.telegram.ui.Components.poll.PollAddOptionFieldLayout;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.iv.RichEditText;

public final class ChatActivity$$ExternalSyntheticLambda380 implements TextView.OnEditorActionListener {
    public final int $r8$classId;
    public final Object f$0;

    public ChatActivity$$ExternalSyntheticLambda380(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        ChatMessageCell chatMessageCell;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                if (i == 6) {
                    PollAddOptionFieldLayout pollAddOptionFieldLayout = chatActivity.pollAddOptionFieldLayout;
                    if (pollAddOptionFieldLayout != null && (chatMessageCell = pollAddOptionFieldLayout.cellToWatch) != null) {
                        chatActivity.pollAddOptionModeComplete(chatMessageCell);
                        return true;
                    }
                } else {
                    chatActivity.getClass();
                }
                return false;
            case 1:
                ChatbotsActivity chatbotsActivity = (ChatbotsActivity) this.f$0;
                boolean z = false;
                if (i == 6) {
                    chatbotsActivity.scheduledLoading = false;
                    ChatbotsActivity$$ExternalSyntheticLambda5 chatbotsActivity$$ExternalSyntheticLambda5 = chatbotsActivity.search;
                    AndroidUtilities.cancelRunOnUIThread(chatbotsActivity$$ExternalSyntheticLambda5);
                    z = true;
                    if (TextUtils.isEmpty(chatbotsActivity.editText.getText())) {
                        chatbotsActivity.lastQuery = null;
                        chatbotsActivity.searchHelper.clear();
                        chatbotsActivity.listView.adapter.update(true);
                    } else {
                        AndroidUtilities.runOnUIThread(chatbotsActivity$$ExternalSyntheticLambda5);
                    }
                    chatbotsActivity.updateSearchLoading();
                }
                return z;
            case 2:
                ChangeUsernameActivity.InputCell inputCell = (ChangeUsernameActivity.InputCell) this.f$0;
                if (i == 6) {
                    ActionBarMenuItem actionBarMenuItem = ChangeUsernameActivity.this.doneButton;
                    if (actionBarMenuItem != null) {
                        actionBarMenuItem.performClick();
                        return true;
                    }
                } else {
                    inputCell.getClass();
                }
                return false;
            case 3:
                ChatEditActivity chatEditActivity = (ChatEditActivity) this.f$0;
                if (i == 6) {
                    ActionBarMenuItem actionBarMenuItem2 = chatEditActivity.doneButton;
                    if (actionBarMenuItem2 != null) {
                        actionBarMenuItem2.performClick();
                        return true;
                    }
                } else {
                    chatEditActivity.getClass();
                }
                return false;
            case 4:
                CodeFieldContainer codeFieldContainer = (CodeFieldContainer) this.f$0;
                if (i == 5) {
                    codeFieldContainer.processNextPressed();
                    return true;
                }
                codeFieldContainer.getClass();
                return false;
            case 5:
                if (i != 6) {
                    return false;
                }
                ((ChatUsersActivity$$ExternalSyntheticLambda13) this.f$0).run();
                return true;
            case 6:
                if (i != 5) {
                    return false;
                }
                EditTextCell editTextCell = (EditTextCell) this.f$0;
                editTextCell.editText.requestFocus();
                EditTextCell.AnonymousClass2 anonymousClass2 = editTextCell.editText;
                anonymousClass2.setSelection(anonymousClass2.length());
                return true;
            case 7:
                if (i != 6) {
                    return false;
                }
                ((CreateBotAlert$$ExternalSyntheticLambda2) this.f$0).run();
                return true;
            case 8:
                PasscodeView passcodeView = (PasscodeView) this.f$0;
                if (i == 6) {
                    passcodeView.processDone(false);
                    return true;
                }
                passcodeView.getClass();
                return false;
            case 9:
                AlertsCreator.AnonymousClass57 anonymousClass57 = (AlertsCreator.AnonymousClass57) this.f$0;
                if (i != 6) {
                    return false;
                }
                anonymousClass57.clearButton.background.callOnClick();
                return true;
            case 10:
                SearchField searchField = (SearchField) this.f$0;
                searchField.getClass();
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                UsersSelectActivity.AnonymousClass4 anonymousClass4 = searchField.searchEditText;
                anonymousClass4.hideActionMode();
                AndroidUtilities.hideKeyboard(anonymousClass4);
                return false;
            case 11:
                ShareAlert shareAlert = (ShareAlert) this.f$0;
                shareAlert.getClass();
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(shareAlert.searchView.editText);
                return false;
            case 12:
                if (i != 6) {
                    return false;
                }
                ((AlertDialog) this.f$0).getButton(-1).callOnClick();
                return true;
            case 13:
                ThemeEditorView.EditorAlert.SearchField searchField2 = (ThemeEditorView.EditorAlert.SearchField) this.f$0;
                searchField2.getClass();
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(searchField2.searchEditText);
                return false;
            case 14:
                UsersAlertBase.SearchField searchField3 = (UsersAlertBase.SearchField) this.f$0;
                searchField3.getClass();
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(searchField3.searchEditText);
                return false;
            case 15:
                GroupCreateActivity groupCreateActivity = (GroupCreateActivity) this.f$0;
                if (i != 6) {
                    groupCreateActivity.getClass();
                } else if (groupCreateActivity.onDonePressed()) {
                    return true;
                }
                return false;
            case 16:
                LoginActivity.LoginActivityPasswordView loginActivityPasswordView = (LoginActivity.LoginActivityPasswordView) this.f$0;
                if (i == 5) {
                    loginActivityPasswordView.onNextPressed(null);
                    return true;
                }
                loginActivityPasswordView.getClass();
                return false;
            case 17:
                LoginActivity.LoginActivityPhraseView loginActivityPhraseView = (LoginActivity.LoginActivityPhraseView) this.f$0;
                if (i == 5) {
                    loginActivityPhraseView.onNextPressed(null);
                    return true;
                }
                loginActivityPhraseView.getClass();
                return false;
            case 18:
                LoginActivity.LoginActivitySetupEmail loginActivitySetupEmail = (LoginActivity.LoginActivitySetupEmail) this.f$0;
                if (i == 5) {
                    loginActivitySetupEmail.onNextPressed(null);
                    return true;
                }
                loginActivitySetupEmail.getClass();
                return false;
            case 19:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f$0;
                int i2 = passcodeActivity.passcodeSetStep;
                if (i2 == 0) {
                    passcodeActivity.processNext();
                    return true;
                }
                if (i2 != 1) {
                    return false;
                }
                passcodeActivity.processDone$8();
                return true;
            case 20:
                PassportActivity.PhoneConfirmationView phoneConfirmationView = (PassportActivity.PhoneConfirmationView) this.f$0;
                if (i == 5) {
                    phoneConfirmationView.onNextPressed(null);
                    return true;
                }
                phoneConfirmationView.getClass();
                return false;
            case 21:
                ProxySettingsActivity proxySettingsActivity = (ProxySettingsActivity) this.f$0;
                proxySettingsActivity.getClass();
                if (i != 5) {
                    if (i != 6) {
                        return false;
                    }
                    proxySettingsActivity.finishFragment();
                    return true;
                }
                int iIntValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = proxySettingsActivity.inputFields;
                if (iIntValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                editTextBoldCursorArr[iIntValue].requestFocus();
                return true;
            case 22:
                SelectChatUserSheet selectChatUserSheet = (SelectChatUserSheet) this.f$0;
                selectChatUserSheet.getClass();
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(selectChatUserSheet.searchEdit);
                return false;
            case 23:
                BotStarsActivity botStarsActivity = (BotStarsActivity) this.f$0;
                if (i == 5) {
                    botStarsActivity.withdraw();
                    return true;
                }
                botStarsActivity.getClass();
                return false;
            case 24:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f$0;
                twoStepVerificationActivity.getClass();
                if (i != 5 && i != 6) {
                    return false;
                }
                twoStepVerificationActivity.processDone$12();
                return true;
            default:
                RichEditText richEditText = (RichEditText) this.f$0;
                if (i != 5) {
                    richEditText.getClass();
                    return false;
                }
                RichEditText.Listener listener = richEditText.listener;
                if (listener == null || richEditText.allowNewlines) {
                    return false;
                }
                if (richEditText.softEnterNewline) {
                    int iMax = Math.max(0, richEditText.getSelectionStart());
                    int iMax2 = Math.max(0, richEditText.getSelectionEnd());
                    if (iMax > iMax2) {
                        iMax2 = iMax;
                        iMax = iMax2;
                    }
                    richEditText.insertingNewline = true;
                    richEditText.getText().replace(iMax, iMax2, "\n");
                    richEditText.insertingNewline = false;
                    richEditText.setSelection(iMax + 1);
                } else {
                    listener.onEnterPressed(richEditText);
                }
                return true;
        }
    }
}
