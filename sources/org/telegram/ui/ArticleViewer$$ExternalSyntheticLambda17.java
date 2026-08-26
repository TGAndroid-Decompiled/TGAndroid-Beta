package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class ArticleViewer$$ExternalSyntheticLambda17 implements Utilities.Callback2 {
    public final int $r8$classId = 1;
    public final FrameLayout f$0;
    public final int f$1;
    public final Object f$2;
    public final Object f$3;

    public ArticleViewer$$ExternalSyntheticLambda17(int i, Context context, BottomSheet bottomSheet, ButtonWithCounterView buttonWithCounterView) {
        this.f$0 = buttonWithCounterView;
        this.f$2 = context;
        this.f$3 = bottomSheet;
        this.f$1 = i;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) this.f$2;
                TLRPC.Chat chat = (TLRPC.Chat) this.f$3;
                ArticleViewer.lambda$joinChannel$65((ArticleViewer.BlockChannelCell) this.f$0, this.f$1, tL_channels_joinChannel, chat, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ButtonWithCounterView buttonWithCounterView = (ButtonWithCounterView) this.f$0;
                BottomSheet bottomSheet = (BottomSheet) this.f$3;
                int i = this.f$1;
                PasskeysActivity.lambda$showLearnSheet$8(buttonWithCounterView, (Context) this.f$2, bottomSheet, i, (TL_account.Passkey) obj, (String) obj2);
                break;
        }
    }

    public ArticleViewer$$ExternalSyntheticLambda17(ArticleViewer.BlockChannelCell blockChannelCell, int i, TLRPC.TL_channels_joinChannel tL_channels_joinChannel, TLRPC.Chat chat) {
        this.f$0 = blockChannelCell;
        this.f$1 = i;
        this.f$2 = tL_channels_joinChannel;
        this.f$3 = chat;
    }
}
