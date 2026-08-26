package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;

public final class ChatActivity$$ExternalSyntheticLambda310 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final String f$1;

    public ChatActivity$$ExternalSyntheticLambda310(ChatActivity chatActivity, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = this.f$0;
                chatActivity.getClass();
                if (bool.booleanValue()) {
                    boolean zBooleanValue = bool2.booleanValue();
                    String str = this.f$1;
                    if (zBooleanValue) {
                        chatActivity.getMessagesController().addWebBrowserException(str, false);
                    }
                    chatActivity.getParentActivity();
                    Browser.openInTelegramBrowser(str);
                }
                break;
            default:
                ChatActivity chatActivity2 = this.f$0;
                chatActivity2.getClass();
                if (bool.booleanValue()) {
                    boolean zBooleanValue2 = bool2.booleanValue();
                    String str2 = this.f$1;
                    if (zBooleanValue2) {
                        chatActivity2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    Browser.openInExternalBrowser(chatActivity2.getParentActivity(), str2, false, null);
                }
                break;
        }
    }
}
