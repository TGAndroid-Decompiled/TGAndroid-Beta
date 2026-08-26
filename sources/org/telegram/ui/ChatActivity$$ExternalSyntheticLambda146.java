package org.telegram.ui;

import android.text.style.CharacterStyle;
import java.io.Serializable;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ChatMessageCell;

public final class ChatActivity$$ExternalSyntheticLambda146 implements Utilities.Callback2 {
    public final int $r8$classId = 0;
    public final ChatActivity f$0;
    public final Browser.Progress f$1;
    public final ChatMessageCell f$2;
    public final Serializable f$3;
    public final Object f$4;

    public ChatActivity$$ExternalSyntheticLambda146(ChatActivity chatActivity, Browser.Progress progress, ChatMessageCell chatMessageCell, String str, CharacterStyle characterStyle) {
        this.f$0 = chatActivity;
        this.f$1 = progress;
        this.f$2 = chatMessageCell;
        this.f$3 = str;
        this.f$4 = characterStyle;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = this.f$0;
                String str = (String) this.f$3;
                CharacterStyle characterStyle = (CharacterStyle) this.f$4;
                chatActivity.lambda$didLongPressUsername$431(this.f$1, this.f$2, str, characterStyle, (TLObject) obj, (Boolean) obj2);
                break;
            default:
                this.f$0.lambda$loadFullRichMessage$393(this.f$1, (int[]) this.f$3, this.f$2, (MessageObject) this.f$4, (TLRPC.messages_Messages) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda146(ChatActivity chatActivity, Browser.Progress progress, int[] iArr, ChatMessageCell chatMessageCell, MessageObject messageObject) {
        this.f$0 = chatActivity;
        this.f$1 = progress;
        this.f$3 = iArr;
        this.f$2 = chatMessageCell;
        this.f$4 = messageObject;
    }
}
