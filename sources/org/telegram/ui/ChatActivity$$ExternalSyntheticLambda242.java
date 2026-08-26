package org.telegram.ui;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class ChatActivity$$ExternalSyntheticLambda242 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final boolean f$3;
    public final Object f$4;
    public final TLObject f$5;

    public ChatActivity$$ExternalSyntheticLambda242(Object obj, Object obj2, Object obj3, boolean z, Object obj4, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = z;
        this.f$4 = obj4;
        this.f$5 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$parseMarkdownAsync$365((AlertDialog) this.f$1, (boolean[]) this.f$2, this.f$3, (MessageObject) this.f$4, (TLRPC.WebPage) this.f$5);
                break;
            case 1:
                ((ChatEditTypeActivity.UsernamesListView.AnonymousClass1) this.f$0).lambda$onItemClick$2((TLRPC.TL_channels_toggleUsername) this.f$1, (TLObject) this.f$2, (TLRPC.TL_username) this.f$4, this.f$3, (TLRPC.TL_error) this.f$5);
                break;
            case 2:
                ((ChannelMonetizationLayout) this.f$0).lambda$initWithdraw$23((TLRPC.TL_error) this.f$1, (TwoStepVerificationActivity) this.f$2, (Activity) this.f$4, this.f$3, this.f$5);
                break;
            default:
                ((CreateGroupCallSheet) this.f$0).lambda$createCall$5((TLObject) this.f$1, (ButtonWithCounterView) this.f$2, this.f$3, (HashSet) this.f$4, (TLRPC.TL_error) this.f$5);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda242(Object obj, TLObject tLObject, Object obj2, Object obj3, boolean z, TLObject tLObject2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = tLObject;
        this.f$2 = obj2;
        this.f$4 = obj3;
        this.f$3 = z;
        this.f$5 = tLObject2;
    }
}
