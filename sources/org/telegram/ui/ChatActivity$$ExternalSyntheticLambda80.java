package org.telegram.ui;

import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ThanosEffect;
import org.telegram.ui.Stories.recorder.HintView2;

public final class ChatActivity$$ExternalSyntheticLambda80 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ChatActivity$$ExternalSyntheticLambda80(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity.lambda$requestLinkPreview$142((LongSparseArray) this.f$0, (Utilities.Callback2) this.f$1);
                break;
            case 1:
                ((ChannelCreateActivity) this.f$0).lambda$loadAdminedChannels$20((TLObject) this.f$1);
                break;
            case 2:
                ((ChannelCreateActivity) this.f$0).lambda$new$0((TLRPC.TL_error) this.f$1);
                break;
            case 3:
                ((ChannelMonetizationLayout) this.f$0).lambda$initLevel$29((TL_stories.TL_premium_boostsStatus) this.f$1);
                break;
            case 4:
                ((ChannelMonetizationLayout) this.f$0).lambda$loadStarsStats$25((TLRPC.TL_payments_starsRevenueStats) this.f$1);
                break;
            case 5:
                ((ChatActivity) this.f$0).lambda$processSelectedOption$347((TLRPC.TL_messages_sendScheduledMessages) this.f$1);
                break;
            case 6:
                ((ChatActivity) this.f$0).lambda$processSelectedOption$348((TLRPC.TL_error) this.f$1);
                break;
            case 7:
                ((ChatActivity) this.f$0).lambda$getChatThanosEffect$406((ThanosEffect[]) this.f$1);
                break;
            case 8:
                ((ChatActivity) this.f$0).lambda$showBotMessageHint$83((HintView2) this.f$1);
                break;
            case 9:
                ((ChatActivity) this.f$0).lambda$showBotMessageHint$84((ChatMessageCell) this.f$1);
                break;
            case 10:
                ((ChatActivity) this.f$0).lambda$processInlineBotWebView$122((TLRPC.TL_inlineBotWebView) this.f$1);
                break;
            case 11:
                ((ChatActivity) this.f$0).lambda$hideTagSelector$102((ReactionsContainerLayout) this.f$1);
                break;
            case 12:
                ((ChatActivity) this.f$0).lambda$didLongPressCard$423((TLRPC.TL_bankCardOpenUrl) this.f$1);
                break;
            case 13:
                ((ChatActivity) this.f$0).lambda$loadFullRichMessage$392((int[]) this.f$1);
                break;
            case 14:
                ChatActivity.lambda$requestLinkPreview$140((Utilities.Callback2) this.f$1, (TLRPC.WebPage) this.f$0);
                break;
            case 15:
                ((ChatActivity) this.f$0).lambda$openSearchWithChat$370((TLRPC.Chat) this.f$1);
                break;
            case 16:
                ((ChatActivity) this.f$0).lambda$openDiscussionMessageChat$382((ChatActivity$$ExternalSyntheticLambda93) this.f$1);
                break;
            case 17:
                ((ChatEditActivity) this.f$0).lambda$createView$14((TLRPC.Chat) this.f$1);
                break;
            case 18:
                ((ChatEditTypeActivity) this.f$0).lambda$onFragmentCreate$0((TLRPC.TL_error) this.f$1);
                break;
            case 19:
                ((ChatEditTypeActivity) this.f$0).lambda$checkUserName$25((String) this.f$1);
                break;
            case 20:
                ((ChatLinkActivity) this.f$0).lambda$loadChats$16((TLObject) this.f$1);
                break;
            case 21:
                ((ChatLinkActivity) this.f$0).lambda$createView$1((AlertDialog[]) this.f$1);
                break;
            case 22:
                ((ChatUsersActivity) this.f$0).lambda$deletePeer$23((TLRPC.Updates) this.f$1);
                break;
            case 23:
                ContentPreviewViewer.lambda$onTouch$9((RecyclerListView) this.f$0, this.f$1);
                break;
            case 24:
                ((CountrySelectActivity.CountrySearchAdapter) this.f$0).lambda$processSearch$0((String) this.f$1);
                break;
            case 25:
                ((CountrySelectActivity.CountrySearchAdapter) this.f$0).lambda$updateSearchResults$1((ArrayList) this.f$1);
                break;
            case 26:
                ((CreateGroupCallSheet) this.f$0).lambda$createCall$4((TLRPC.Updates) this.f$1);
                break;
            case 27:
                ((DialogsActivity) this.f$0).lambda$performSelectedDialogsAction$105((ArrayList) this.f$1);
                break;
            case 28:
                ((DialogsActivity) this.f$0).lambda$showArchiveHelp$88((BottomSheet[]) this.f$1);
                break;
            default:
                ((DialogsActivity) this.f$0).lambda$createView$15((DialogsActivity.ViewPage) this.f$1);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda80(Utilities.Callback2 callback2, TLRPC.WebPage webPage) {
        this.$r8$classId = 14;
        this.f$1 = callback2;
        this.f$0 = webPage;
    }
}
