package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.MultiContactsSelectorBottomSheet;
import org.telegram.ui.TopicsFragment;

public final class ChatActivityEnterView$$ExternalSyntheticLambda84 implements MultiContactsSelectorBottomSheet.SelectorListener, DialogsActivity.DialogsActivityDelegate {
    public final ChatActivityEnterView f$0;
    public final MessageObject f$1;
    public final TL_keyboard.TL_buttonTypeRequestPeer f$2;

    public ChatActivityEnterView$$ExternalSyntheticLambda84(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.f$0 = chatActivityEnterView;
        this.f$1 = messageObject;
        this.f$2 = tL_buttonTypeRequestPeer;
    }

    @Override
    public boolean canSelectStories() {
        return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        return this.f$0.lambda$didPressedBotButton$96(this.f$1, this.f$2, dialogsActivity, arrayList, charSequence, z, z2, i, i2, topicsFragment);
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity);
    }

    @Override
    public void onUserSelected(List list) {
        this.f$0.lambda$didPressedBotButton$95(this.f$1, this.f$2, list);
    }
}
