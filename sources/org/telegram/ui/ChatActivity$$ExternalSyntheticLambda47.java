package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ThanosEffect;

public final class ChatActivity$$ExternalSyntheticLambda47 implements Utilities.Callback0Return {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda47(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final Object run() {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = this.f$0;
                if (LiteMode.isEnabled(65536) && ThanosEffect.supports()) {
                    ThanosEffect thanosEffect = chatActivity.chatListThanosEffect;
                    if (thanosEffect == null || thanosEffect.destroyed) {
                        if (chatActivity.getParentActivity() != null && ThanosEffect.supports() && chatActivity.chatListView != null && chatActivity.contentView != null) {
                            ThanosEffect thanosEffect2 = chatActivity.chatListThanosEffect;
                            if (thanosEffect2 != null) {
                                AndroidUtilities.removeFromParent(thanosEffect2);
                            }
                            ThanosEffect thanosEffect3 = new ThanosEffect(chatActivity.getParentActivity(), new ChatActivity$$ExternalSyntheticLambda7(16, chatActivity, thanosEffectArr));
                            chatActivity.chatListThanosEffect = thanosEffect3;
                            ThanosEffect[] thanosEffectArr = {thanosEffect3};
                            ChatActivity.ChatActivityFragmentView chatActivityFragmentView = chatActivity.contentView;
                            chatActivityFragmentView.addView(thanosEffect3, chatActivityFragmentView.indexOfChild(chatActivity.chatListView) + 1, LayoutHelper.createFrame(-1.0f, -1));
                        }
                    }
                    return chatActivity.chatListThanosEffect;
                }
                return null;
            default:
                this.f$0.getClass();
                return Boolean.valueOf(ThanosEffect.supports() && LiteMode.isEnabled(65536));
        }
    }
}
