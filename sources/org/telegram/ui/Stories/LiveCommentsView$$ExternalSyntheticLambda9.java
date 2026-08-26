package org.telegram.ui.Stories;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.RecyclerListView;

public final class LiveCommentsView$$ExternalSyntheticLambda9 implements Utilities.Callback2Return, RecyclerListView.OnItemClickListenerExtended {
    public final PeerStoriesView.AnonymousClass10 f$0;

    public LiveCommentsView$$ExternalSyntheticLambda9(PeerStoriesView.AnonymousClass10 anonymousClass10) {
        this.f$0 = anonymousClass10;
    }

    @Override
    public boolean hasDoubleTap(View view) {
        return false;
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        PeerStoriesView.AnonymousClass10 anonymousClass10 = this.f$0;
        LiveCommentsView.TopSender topSender = ((LiveCommentsView.LiveTopSenderView) view).sender;
        int i5 = anonymousClass10.currentAccount;
        int currentTime = ConnectionsManager.getInstance(i5).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i6 = 0;
        while (true) {
            if (i6 >= topSender.messages.size()) {
                break;
            }
            LiveCommentsView.Message message = (LiveCommentsView.Message) topSender.messages.get(i6);
            long j = message.stars;
            if (j > 0 && currentTime - message.date <= HighlightMessageSheet.getTierOption(i5, (int) j, 0)) {
                hashSet.add(Integer.valueOf(message.id));
            }
            i6++;
        }
        LivePlayer livePlayer = anonymousClass10.livePlayer;
        long sendPaidMessagesStars = livePlayer != null ? livePlayer.getSendPaidMessagesStars() : 0L;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            arrayList = anonymousClass10.messages;
            i2 = -1;
            if (i7 >= arrayList.size()) {
                i3 = -1;
                break;
            }
            LiveCommentsView.Message message2 = (LiveCommentsView.Message) arrayList.get(i7);
            if (message2.fromAdmin || !message2.isReaction || message2.stars >= sendPaidMessagesStars) {
                if (hashSet.contains(Integer.valueOf(message2.id)) && (anonymousClass10.highlightingDialog != topSender.dialogId || (i4 = anonymousClass10.highlightingMessageId) == 0 || message2.id < i4)) {
                    i3 = message2.id;
                    break;
                }
                i8++;
            }
            i7++;
        }
        if (i3 < 0) {
            int i9 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                LiveCommentsView.Message message3 = (LiveCommentsView.Message) arrayList.get(i10);
                if (message3.fromAdmin || !message3.isReaction || message3.stars >= sendPaidMessagesStars) {
                    if (hashSet.contains(Integer.valueOf(message3.id))) {
                        i2 = message3.id;
                        break;
                    }
                    i9++;
                }
            }
            i8 = i9;
        } else {
            i2 = i3;
        }
        if (i2 < 0) {
            return;
        }
        anonymousClass10.highlightingDialog = topSender.dialogId;
        anonymousClass10.highlightingMessageId = i2;
        anonymousClass10.callHighlight = true;
        ChatActivity.AnonymousClass34 anonymousClass34 = anonymousClass10.listView;
        RecyclerView.ItemAnimator itemAnimator = anonymousClass34.getItemAnimator();
        anonymousClass34.setItemAnimator(null);
        anonymousClass10.layoutManager.scrollToPositionWithOffset(i8, anonymousClass34.getHeight() / 2, true);
        anonymousClass10.adapter.notifyItemChanged(i8);
        anonymousClass34.setItemAnimator(itemAnimator);
    }

    @Override
    public Object run(Object obj, Object obj2) {
        return this.f$0.lambda$openStarsSheet$11((Long) obj2);
    }
}
