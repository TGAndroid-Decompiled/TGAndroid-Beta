package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.ChatActivityEnterView;

public final class MessageSendPreview$$ExternalSyntheticLambda11 implements Runnable {
    public final int $r8$classId;
    public final MessageSendPreview f$0;
    public final EditText f$1;

    public MessageSendPreview$$ExternalSyntheticLambda11(MessageSendPreview messageSendPreview, EditText editText, int i) {
        this.$r8$classId = i;
        this.f$0 = messageSendPreview;
        this.f$1 = editText;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                MessageSendPreview messageSendPreview = this.f$0;
                if (!messageSendPreview.focusable) {
                    try {
                        Window window = messageSendPreview.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        messageSendPreview.focusable = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new MessageSendPreview$$ExternalSyntheticLambda11(messageSendPreview, this.f$1, 1), 100L);
                break;
            default:
                MessageSendPreview messageSendPreview2 = this.f$0;
                messageSendPreview2.getClass();
                AndroidUtilities.showKeyboard(this.f$1);
                ChatActivityEnterView.SendButton sendButton = messageSendPreview2.anchorSendButton;
                if (sendButton != null) {
                    int[] iArr = messageSendPreview2.sendButtonInitialPosition;
                    sendButton.getLocationOnScreen(iArr);
                    int i = iArr[0];
                    int width = messageSendPreview2.anchorSendButton.getWidth();
                    ChatActivityEnterView.SendButton sendButton2 = messageSendPreview2.anchorSendButton;
                    sendButton2.getHeight();
                    iArr[0] = zzlb.m(width - sendButton2.width$1(), 6.0f, i);
                    messageSendPreview2.sendButton.setScaleX(messageSendPreview2.anchorSendButton.getScaleX());
                    messageSendPreview2.sendButton.setScaleY(messageSendPreview2.anchorSendButton.getScaleY());
                }
                break;
        }
    }
}
