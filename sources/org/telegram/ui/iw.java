package org.telegram.ui;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class iw implements Runnable {
    public final int f37785a = 0;
    public final boolean f37786b;
    public final long f37787c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate f37788e;
    public final TLObject f37789f;
    public final TLObject h;

    public iw(py pyVar, TLRPC.Chat chat, long j10, boolean z4, TLRPC.User user, boolean z10) {
        this.f37788e = pyVar;
        this.f37789f = chat;
        this.f37787c = j10;
        this.f37786b = z4;
        this.h = user;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f37785a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f37789f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f37788e;
        switch (i10) {
            case 0:
                py pyVar = (py) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f37787c;
                boolean z4 = this.f37786b;
                if (chat != null) {
                    pyVar.getClass();
                    if (ChatObject.isNotInChat(chat)) {
                        pyVar.getMessagesController().deleteDialog(j10, 0, z4);
                    } else {
                        pyVar.getMessagesController().deleteParticipantFromChat(-j10, pyVar.getMessagesController().getUser(Long.valueOf(pyVar.getUserConfig().getClientUserId())), (TLRPC.Chat) null, z4, z4);
                    }
                } else {
                    pyVar.getMessagesController().deleteDialog(j10, 0, z4);
                    if (user != null && user.bot && this.d) {
                        pyVar.getMessagesController().blockPeer(user.f20992id);
                    }
                }
                pyVar.getMessagesController().checkIfFolderEmpty(pyVar.S2);
                return;
            default:
                qh.ba baVar = (qh.ba) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f37786b;
                long j11 = this.f37787c;
                if (!z10) {
                    oh.e1.T = new oh.e1(baVar.f45043b, baVar.f45047c, storyItem, j11, storyItem.f21082id, z10, inputGroupCall, true, this.d);
                }
                qh.w9 w9Var = baVar.C;
                if (w9Var != null) {
                    w9Var.f(false);
                }
                baVar.C = null;
                baVar.G = 0;
                RectF rectF = baVar.E;
                Point point = AndroidUtilities.displaySize;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                baVar.D = AndroidUtilities.dp(8.0f);
                baVar.q(true);
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                storyItem.dialogId = j11;
                storyItem.justUploaded = true;
                U.getOrCreateStoryViewer().G(baVar.f45043b, storyItem, null);
                NotificationCenter.getInstance(baVar.f45047c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.f20862id));
                return;
        }
    }

    public iw(qh.ba baVar, boolean z4, TL_stories.StoryItem storyItem, long j10, TLRPC.InputGroupCall inputGroupCall, boolean z10) {
        this.f37788e = baVar;
        this.f37786b = z4;
        this.f37789f = storyItem;
        this.f37787c = j10;
        this.h = inputGroupCall;
        this.d = z10;
    }
}
