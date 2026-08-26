package org.telegram.ui;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class ChatActivity$$ExternalSyntheticLambda81 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final boolean f$3;

    public ChatActivity$$ExternalSyntheticLambda81(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$didLongPressUsername$433((Browser.Progress) this.f$1, (Utilities.Callback2) this.f$2, this.f$3, tLObject, tL_error);
                break;
            case 1:
                ((ChatEditTypeActivity.UsernamesListView.AnonymousClass1) this.f$0).lambda$onItemClick$3((TLRPC.TL_channels_toggleUsername) this.f$1, (TLRPC.TL_username) this.f$2, this.f$3, tLObject, tL_error);
                break;
            case 2:
                ((ChannelMonetizationLayout) this.f$0).lambda$initWithdraw$24((TwoStepVerificationActivity) this.f$1, (Activity) this.f$2, this.f$3, tLObject, tL_error);
                break;
            case 3:
                ((ChatActivity) this.f$0).lambda$showRequestUrlAlert$386((String) this.f$1, (TLRPC.TL_messages_requestUrlAuth) this.f$2, this.f$3, tLObject, tL_error);
                break;
            default:
                ((CreateGroupCallSheet) this.f$0).lambda$createCall$6((ButtonWithCounterView) this.f$1, this.f$3, (HashSet) this.f$2, tLObject, tL_error);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda81(CreateGroupCallSheet createGroupCallSheet, ButtonWithCounterView buttonWithCounterView, boolean z, HashSet hashSet) {
        this.$r8$classId = 4;
        this.f$0 = createGroupCallSheet;
        this.f$1 = buttonWithCounterView;
        this.f$3 = z;
        this.f$2 = hashSet;
    }
}
