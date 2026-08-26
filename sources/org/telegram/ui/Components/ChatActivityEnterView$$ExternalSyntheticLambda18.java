package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.bots.BotKeyboardView;

public final class ChatActivityEnterView$$ExternalSyntheticLambda18 implements AlertDialog.OnButtonClickListener, EditTextCaption.EditTextCaptionDelegate, ActionBarPopupWindow.OnDispatchKeyEventListener, BotKeyboardView.BotKeyboardViewDelegate {
    public final ChatActivityEnterView f$0;

    public ChatActivityEnterView$$ExternalSyntheticLambda18(ChatActivityEnterView chatActivityEnterView) {
        this.f$0 = chatActivityEnterView;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$new$2(alertDialog, i);
    }

    @Override
    public void onDispatchKeyEvent(KeyEvent keyEvent) {
        this.f$0.lambda$onSendLongClick$39(keyEvent);
    }

    @Override
    public void onSpansChanged() {
        this.f$0.lambda$createMessageEditText$51();
    }
}
