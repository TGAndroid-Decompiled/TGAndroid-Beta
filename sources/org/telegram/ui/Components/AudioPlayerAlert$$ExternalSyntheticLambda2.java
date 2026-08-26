package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.TopicsFragment;

public final class AudioPlayerAlert$$ExternalSyntheticLambda2 implements DialogsActivity.DialogsActivityDelegate, AlertsCreator.ScheduleDatePickerDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public AudioPlayerAlert$$ExternalSyntheticLambda2(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public boolean canSelectStories() {
        switch (this.$r8$classId) {
            case 0:
                break;
        }
        return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
    }

    @Override
    public void didSelectDate(boolean z, int i, int i2) {
        ((ChatAttachAlertPollLayout) this.f$0).lambda$onPollDoneButtonClick$7((TLRPC.TL_messageMediaPoll) this.f$2, (ArrayList) this.f$1, (Long) this.f$3, z, i, i2);
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        switch (this.$r8$classId) {
            case 0:
                return ((AudioPlayerAlert) this.f$0).lambda$forward$53((ArrayList) this.f$1, (TLRPC.TL_document) this.f$2, (MessageObject) this.f$3, dialogsActivity, arrayList, charSequence, z, z2, i, i2, topicsFragment);
            default:
                return ((ChatAttachAlert.AnonymousClass1) this.f$0).lambda$onWebAppSwitchInlineQuery$5((TLRPC.User) this.f$1, (String) this.f$2, (OverlayActionBarLayoutDialog) this.f$3, dialogsActivity, arrayList, charSequence, z, z2, i, i2, topicsFragment);
        }
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        int i = this.$r8$classId;
        return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity);
    }

    public AudioPlayerAlert$$ExternalSyntheticLambda2(ChatAttachAlertPollLayout chatAttachAlertPollLayout, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList, Long l) {
        this.$r8$classId = 2;
        this.f$0 = chatAttachAlertPollLayout;
        this.f$2 = tL_messageMediaPoll;
        this.f$1 = arrayList;
        this.f$3 = l;
    }
}
