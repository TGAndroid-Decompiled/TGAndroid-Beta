package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.bots.BotKeyboardView;

public final class ChatActivityEnterView$$ExternalSyntheticLambda30 implements BotKeyboardView.BotKeyboardViewDelegate, AlertDialog.OnButtonClickListener, EditTextCaption.EditTextCaptionDelegate, ActionBarPopupWindow.OnDispatchKeyEventListener {
    public final ChatActivityEnterView f$0;

    public ChatActivityEnterView$$ExternalSyntheticLambda30(ChatActivityEnterView chatActivityEnterView) {
        this.f$0 = chatActivityEnterView;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        ChatActivityEnterView chatActivityEnterView = this.f$0;
        chatActivityEnterView.clearRichDraft();
        ChatActivityEnterView.AnonymousClass50 anonymousClass50 = chatActivityEnterView.messageEditText;
        if (anonymousClass50 != null) {
            anonymousClass50.setText("");
        }
    }

    @Override
    public void onDispatchKeyEvent(KeyEvent keyEvent) {
        ChatActivityEnterView.AnonymousClass44 anonymousClass44;
        ChatActivityEnterView chatActivityEnterView = this.f$0;
        chatActivityEnterView.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (anonymousClass44 = chatActivityEnterView.sendPopupWindow) != null && anonymousClass44.isShowing()) {
            chatActivityEnterView.sendPopupWindow.dismiss();
        }
    }

    @Override
    public void onSpansChanged() {
        ChatActivityEnterView chatActivityEnterView = this.f$0;
        chatActivityEnterView.messageEditText.invalidateEffects();
        ChatActivityEnterView.ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
        if (chatActivityEnterViewDelegate != null) {
            chatActivityEnterViewDelegate.onTextSpansChanged(chatActivityEnterView.messageEditText.getTextToUse());
        }
    }
}
