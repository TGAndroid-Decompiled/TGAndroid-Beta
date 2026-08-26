package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmojiColorPickerWindow;

public final class ChatActivity$$ExternalSyntheticLambda379 implements View.OnKeyListener {
    public final int $r8$classId;
    public final Object f$0;

    public ChatActivity$$ExternalSyntheticLambda379(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                chatActivity.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i != 67 || keyEvent.getAction() != 0 || editTextBoldCursor.length() != 0) {
                    return false;
                }
                chatActivity.pollAddOptionModeClose();
                return true;
            case 1:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) view;
                if (i != 67 || keyEvent.getAction() != 0 || editTextBoldCursor2.length() != 0) {
                    return false;
                }
                ImageView imageView = ((ChatAttachAlertPollLayout.ListAdapter.AnonymousClass6) this.f$0).deleteImageView;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                return true;
            case 2:
                EmojiColorPickerWindow emojiColorPickerWindow = (EmojiColorPickerWindow) this.f$0;
                emojiColorPickerWindow.getClass();
                if (i != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || !emojiColorPickerWindow.isShowing()) {
                    return false;
                }
                emojiColorPickerWindow.dismiss();
                return true;
            case 3:
                PassportActivity passportActivity = (PassportActivity) this.f$0;
                if (i != 67) {
                    passportActivity.getClass();
                } else if (passportActivity.inputFields[2].length() == 0) {
                    passportActivity.inputFields[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor3 = passportActivity.inputFields[1];
                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                    passportActivity.inputFields[1].dispatchKeyEvent(keyEvent);
                    return true;
                }
                return false;
            default:
                EditTextBoldCursor editTextBoldCursor4 = (EditTextBoldCursor) view;
                if (i != 67 || keyEvent.getAction() != 0 || editTextBoldCursor4.length() != 0) {
                    return false;
                }
                ImageView imageView2 = ((PollCreateActivity.ListAdapter.AnonymousClass5) this.f$0).deleteImageView;
                if (imageView2 != null) {
                    imageView2.callOnClick();
                }
                return true;
        }
    }
}
