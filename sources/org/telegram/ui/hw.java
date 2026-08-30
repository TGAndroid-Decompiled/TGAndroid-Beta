package org.telegram.ui;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class hw implements Runnable {
    public final int f34958a = 0;
    public final boolean f34959b;
    public final long f34960c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final TLObject f34961f;
    public final TLObject h;

    public hw(oy oyVar, TLRPC.Chat chat, long j10, boolean z4, TLRPC.User user, boolean z10) {
        this.e = oyVar;
        this.f34961f = chat;
        this.f34960c = j10;
        this.f34959b = z4;
        this.h = user;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f34958a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f34961f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.e;
        switch (i10) {
            case 0:
                oy oyVar = (oy) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f34960c;
                boolean z4 = this.f34959b;
                if (chat != null) {
                    oyVar.getClass();
                    if (ChatObject.isNotInChat(chat)) {
                        oyVar.getMessagesController().deleteDialog(j10, 0, z4);
                    } else {
                        oyVar.getMessagesController().deleteParticipantFromChat(-j10, oyVar.getMessagesController().getUser(Long.valueOf(oyVar.getUserConfig().getClientUserId())), (TLRPC.Chat) null, z4, z4);
                    }
                } else {
                    oyVar.getMessagesController().deleteDialog(j10, 0, z4);
                    if (user != null && user.bot && this.d) {
                        oyVar.getMessagesController().blockPeer(user.f19331id);
                    }
                }
                oyVar.getMessagesController().checkIfFolderEmpty(oyVar.S2);
                return;
            default:
                ph.da daVar = (ph.da) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f34959b;
                long j11 = this.f34960c;
                if (!z10) {
                    nh.e1.T = new nh.e1(daVar.f41475b, daVar.f41479c, storyItem, j11, storyItem.f19419id, z10, inputGroupCall, true, this.d);
                }
                ph.y9 y9Var = daVar.C;
                if (y9Var != null) {
                    y9Var.f(false);
                }
                daVar.C = null;
                daVar.G = 0;
                RectF rectF = daVar.E;
                Point point = AndroidUtilities.displaySize;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                daVar.D = AndroidUtilities.dp(8.0f);
                daVar.q(true);
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                storyItem.dialogId = j11;
                storyItem.justUploaded = true;
                U.getOrCreateStoryViewer().G(daVar.f41475b, storyItem, null);
                NotificationCenter.getInstance(daVar.f41479c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.f19201id));
                return;
        }
    }

    public hw(ph.da daVar, boolean z4, TL_stories.StoryItem storyItem, long j10, TLRPC.InputGroupCall inputGroupCall, boolean z10) {
        this.e = daVar;
        this.f34959b = z4;
        this.f34961f = storyItem;
        this.f34960c = j10;
        this.h = inputGroupCall;
        this.d = z10;
    }
}
