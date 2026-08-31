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
    public final int f37940a = 0;
    public final boolean f37941b;
    public final long f37942c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate f37943e;
    public final TLObject f37944f;
    public final TLObject h;

    public iw(py pyVar, TLRPC.Chat chat, long j10, boolean z4, TLRPC.User user, boolean z10) {
        this.f37943e = pyVar;
        this.f37944f = chat;
        this.f37942c = j10;
        this.f37941b = z4;
        this.h = user;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f37940a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f37944f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f37943e;
        switch (i10) {
            case 0:
                py pyVar = (py) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.f37942c;
                boolean z4 = this.f37941b;
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
                        pyVar.getMessagesController().blockPeer(user.f20990id);
                    }
                }
                pyVar.getMessagesController().checkIfFolderEmpty(pyVar.S2);
                return;
            default:
                qh.ca caVar = (qh.ca) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.f37941b;
                long j11 = this.f37942c;
                if (!z10) {
                    oh.e1.T = new oh.e1(caVar.f45077b, caVar.f45081c, storyItem, j11, storyItem.f21080id, z10, inputGroupCall, true, this.d);
                }
                qh.x9 x9Var = caVar.C;
                if (x9Var != null) {
                    x9Var.f(false);
                }
                caVar.C = null;
                caVar.G = 0;
                RectF rectF = caVar.E;
                Point point = AndroidUtilities.displaySize;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                caVar.D = AndroidUtilities.dp(8.0f);
                caVar.q(true);
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                storyItem.dialogId = j11;
                storyItem.justUploaded = true;
                U.getOrCreateStoryViewer().G(caVar.f45077b, storyItem, null);
                NotificationCenter.getInstance(caVar.f45081c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.f20860id));
                return;
        }
    }

    public iw(qh.ca caVar, boolean z4, TL_stories.StoryItem storyItem, long j10, TLRPC.InputGroupCall inputGroupCall, boolean z10) {
        this.f37943e = caVar;
        this.f37941b = z4;
        this.f37944f = storyItem;
        this.f37942c = j10;
        this.h = inputGroupCall;
        this.d = z10;
    }
}
