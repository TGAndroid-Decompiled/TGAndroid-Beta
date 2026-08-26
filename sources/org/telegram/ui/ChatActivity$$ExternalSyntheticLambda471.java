package org.telegram.ui;

import android.app.Activity;
import java.io.Serializable;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;

public final class ChatActivity$$ExternalSyntheticLambda471 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final boolean f$3;

    public ChatActivity$$ExternalSyntheticLambda471(Object obj, Object obj2, Object obj3, boolean z, int i) {
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
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                chatActivity.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda488(chatActivity, (ChatActivity.AnonymousClass127) this.f$1, tLObject, (ChatActivity$$ExternalSyntheticLambda301) this.f$2, this.f$3, 0));
                break;
            case 1:
                ChannelMonetizationLayout channelMonetizationLayout = (ChannelMonetizationLayout) this.f$0;
                channelMonetizationLayout.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda482(channelMonetizationLayout, tL_error, (TwoStepVerificationActivity) this.f$1, (Activity) this.f$2, this.f$3, tLObject, 8));
                break;
            case 2:
                ChatEditTypeActivity.UsernamesListView.AnonymousClass1 anonymousClass1 = (ChatEditTypeActivity.UsernamesListView.AnonymousClass1) this.f$0;
                anonymousClass1.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda482(anonymousClass1, (TLRPC.TL_channels_toggleUsername) this.f$1, tLObject, (TLRPC.TL_username) this.f$2, this.f$3, tL_error, 9));
                break;
            case 3:
                EmojiView.GifSearchPreloader gifSearchPreloader = (EmojiView.GifSearchPreloader) this.f$0;
                gifSearchPreloader.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda488(gifSearchPreloader, (String) this.f$1, this.f$3, (String) this.f$2, tLObject));
                break;
            case 4:
                CreateGroupCallSheet createGroupCallSheet = (CreateGroupCallSheet) this.f$0;
                createGroupCallSheet.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda482(createGroupCallSheet, tLObject, (ButtonWithCounterView) this.f$1, this.f$3, (HashSet) this.f$2, tL_error, 11));
                break;
            default:
                EmojiBottomSheet.GifPage.GifAdapter gifAdapter = (EmojiBottomSheet.GifPage.GifAdapter) this.f$0;
                gifAdapter.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda488((Object) gifAdapter, tLObject, this.f$3, this.f$1, this.f$2, 20));
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda471(Object obj, Object obj2, boolean z, Serializable serializable, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = z;
        this.f$2 = serializable;
    }

    public ChatActivity$$ExternalSyntheticLambda471(EmojiBottomSheet.GifPage.GifAdapter gifAdapter, boolean z, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.$r8$classId = 5;
        this.f$0 = gifAdapter;
        this.f$3 = z;
        this.f$1 = tL_messages_getInlineBotResults;
        this.f$2 = str;
    }
}
