package org.telegram.ui.Stories;

import j$.util.Objects;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService$1$$ExternalSyntheticLambda0;

public final class LivePlayer$$ExternalSyntheticLambda13 implements Runnable {
    public final int $r8$classId;
    public final LivePlayer f$0;

    public LivePlayer$$ExternalSyntheticLambda13(LivePlayer livePlayer, int i) {
        this.$r8$classId = i;
        this.f$0 = livePlayer;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.poll();
                break;
            case 1:
                this.f$0.poll2();
                break;
            case 2:
                this.f$0.setEmptyStream(true);
                break;
            case 3:
                LivePlayer livePlayer = this.f$0;
                NotificationCenter.getInstance(livePlayer.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(livePlayer.call.id));
                livePlayer.setPolling(true);
                break;
            case 4:
                this.f$0.storyDeleted();
                break;
            case 5:
                this.f$0.setEmptyStream(true);
                break;
            case 6:
                LivePlayer livePlayer2 = this.f$0;
                if (livePlayer2.instance != null) {
                    DispatchQueue dispatchQueue = Utilities.globalQueue;
                    NativeInstance nativeInstance = livePlayer2.instance;
                    Objects.requireNonNull(nativeInstance);
                    dispatchQueue.postRunnable(new VoIPService$1$$ExternalSyntheticLambda0(nativeInstance, 4));
                    livePlayer2.srcs.clear();
                    livePlayer2.instance = null;
                }
                livePlayer2.init$4();
                break;
            case 7:
                this.f$0.setEmptyStream(true);
                break;
            case 8:
                this.f$0.setEmptyStream(true);
                break;
            case 9:
                LivePlayer livePlayer3 = this.f$0;
                if (livePlayer3.instance != null) {
                    DispatchQueue dispatchQueue2 = Utilities.globalQueue;
                    NativeInstance nativeInstance2 = livePlayer3.instance;
                    Objects.requireNonNull(nativeInstance2);
                    dispatchQueue2.postRunnable(new VoIPService$1$$ExternalSyntheticLambda0(nativeInstance2, 4));
                    livePlayer3.srcs.clear();
                    livePlayer3.instance = null;
                }
                livePlayer3.init$4();
                break;
            case 10:
                this.f$0.poll();
                break;
            default:
                this.f$0.poll2();
                break;
        }
    }
}
