package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class ChatActivity$$ExternalSyntheticLambda451 implements PollCreateActivity.PollCreateActivityDelegate, DialogsActivity.DialogsActivityDelegate {
    public final Object f$0;
    public final boolean f$1;
    public final Object f$2;
    public final int f$3;

    public ChatActivity$$ExternalSyntheticLambda451(ChatActivity chatActivity, boolean z, MessageObject messageObject, int i) {
        this.f$0 = chatActivity;
        this.f$1 = z;
        this.f$2 = messageObject;
        this.f$3 = i;
    }

    @Override
    public boolean canSelectStories() {
        return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        return ((LaunchActivity) this.f$0).lambda$runLinkRequest$91(this.f$1, this.f$3, (String) this.f$2, dialogsActivity, arrayList, charSequence, z, z2, i, i2, topicsFragment);
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity);
    }

    @Override
    public void sendPoll(TLRPC.MessageMedia messageMedia, ArrayList arrayList, boolean z, int i) {
        ((ChatActivity) this.f$0).lambda$processSelectedOption$339(this.f$1, (MessageObject) this.f$2, this.f$3, messageMedia, arrayList, z, i);
    }

    public ChatActivity$$ExternalSyntheticLambda451(LaunchActivity launchActivity, boolean z, int i, String str) {
        this.f$0 = launchActivity;
        this.f$1 = z;
        this.f$3 = i;
        this.f$2 = str;
    }
}
