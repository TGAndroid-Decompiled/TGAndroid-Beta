package org.telegram.ui;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class jw implements Runnable {
    public final int f35373a = 0;
    public final boolean f35374b;
    public final long f35375c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;
    public final TLObject f35376f;
    public final TLObject h;

    public jw(qy qyVar, TLRPC.Chat chat, long j10, boolean z4, TLRPC.User user, boolean z10) {
        this.e = qyVar;
        this.f35376f = chat;
        this.f35375c = j10;
        this.f35374b = z4;
        this.h = user;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f35373a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f35376f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.e;
        switch (i10) {
            case 0:
                qy qyVar = (qy) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f35375c;
                boolean z4 = this.f35374b;
                if (chat != null) {
                    qyVar.getClass();
                    if (ChatObject.isNotInChat(chat)) {
                        qyVar.getMessagesController().deleteDialog(j10, 0, z4);
                    } else {
                        qyVar.getMessagesController().deleteParticipantFromChat(-j10, qyVar.getMessagesController().getUser(Long.valueOf(qyVar.getUserConfig().getClientUserId())), (TLRPC.Chat) null, z4, z4);
                    }
                } else {
                    qyVar.getMessagesController().deleteDialog(j10, 0, z4);
                    if (user != null && user.bot && this.d) {
                        qyVar.getMessagesController().blockPeer(user.f19306id);
                    }
                }
                qyVar.getMessagesController().checkIfFolderEmpty(qyVar.S2);
                return;
            default:
                ph.da daVar = (ph.da) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f35374b;
                long j11 = this.f35375c;
                if (!z10) {
                    nh.e1.T = new nh.e1(daVar.f41513b, daVar.f41517c, storyItem, j11, storyItem.f19394id, z10, inputGroupCall, true, this.d);
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
                U.getOrCreateStoryViewer().G(daVar.f41513b, storyItem, null);
                NotificationCenter.getInstance(daVar.f41517c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.f19176id));
                return;
        }
    }

    public jw(ph.da daVar, boolean z4, TL_stories.StoryItem storyItem, long j10, TLRPC.InputGroupCall inputGroupCall, boolean z10) {
        this.e = daVar;
        this.f35374b = z4;
        this.f35376f = storyItem;
        this.f35375c = j10;
        this.h = inputGroupCall;
        this.d = z10;
    }
}
