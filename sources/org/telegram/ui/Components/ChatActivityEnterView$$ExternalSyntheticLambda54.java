package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ChatActivityEnterView.AnonymousClass21;

public final class ChatActivityEnterView$$ExternalSyntheticLambda54 implements Utilities.Callback4 {
    public final int $r8$classId;
    public final ChatActivityEnterView f$0;
    public final long f$1;
    public final Theme.ResourcesProvider f$2;

    public ChatActivityEnterView$$ExternalSyntheticLambda54(ChatActivityEnterView chatActivityEnterView, long j, Theme.ResourcesProvider resourcesProvider, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivityEnterView;
        this.f$1 = j;
        this.f$2 = resourcesProvider;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$r8$classId) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView = this.f$0;
                chatActivityEnterView.saveRichDraft((TL_iv.RichMessage) obj);
                if (chatActivityEnterView.isInScheduleMode() && num.intValue() == 0) {
                    AlertsCreator.createScheduleDatePickerDialog(chatActivityEnterView.parentActivity, this.f$1, -1L, 0, chatActivityEnterView.new AnonymousClass21(), null, this.f$2);
                } else {
                    chatActivityEnterView.sendMessageInternal(num.intValue(), bool.booleanValue(), num2.intValue(), true, 0L);
                }
                break;
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView2 = this.f$0;
                chatActivityEnterView2.messageEditText.setText((CharSequence) obj);
                if (chatActivityEnterView2.editingMessageObject != null) {
                    chatActivityEnterView2.doneEditingMessage();
                } else if (chatActivityEnterView2.isInScheduleMode() && num3.intValue() == 0) {
                    AlertsCreator.createScheduleDatePickerDialog(chatActivityEnterView2.parentActivity, this.f$1, -1L, 0, new ChatActivityEnterView.AnonymousClass22(chatActivityEnterView2, 0), null, this.f$2);
                } else {
                    chatActivityEnterView2.sendMessageInternal(num3.intValue(), bool2.booleanValue(), num4.intValue(), true, 0L);
                }
                break;
        }
    }
}
