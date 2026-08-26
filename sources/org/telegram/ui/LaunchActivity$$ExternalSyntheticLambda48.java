package org.telegram.ui;

import androidx.collection.LongSparseArray;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Timer;
import org.telegram.tgnet.TLRPC;

public final class LaunchActivity$$ExternalSyntheticLambda48 implements Runnable {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Object f$1;
    public final Serializable f$10;
    public final Object f$2;
    public final boolean f$3;
    public final Object f$4;
    public final int f$5;
    public final Object f$6;
    public final Object f$7;
    public final Object f$8;
    public final long f$9;

    public LaunchActivity$$ExternalSyntheticLambda48(int i, long j, String str, String str2, String str3, TLRPC.Chat chat, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.User user, DialogsActivity dialogsActivity, LaunchActivity launchActivity, boolean z) {
        this.f$0 = launchActivity;
        this.f$1 = str;
        this.f$2 = tL_chatAdminRights;
        this.f$3 = z;
        this.f$4 = str2;
        this.f$5 = i;
        this.f$6 = chat;
        this.f$7 = dialogsActivity;
        this.f$8 = user;
        this.f$9 = j;
        this.f$10 = str3;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((LaunchActivity) this.f$0).lambda$runLinkRequest$74((String) this.f$1, (TLRPC.TL_chatAdminRights) this.f$2, this.f$3, (String) this.f$4, this.f$5, (TLRPC.Chat) this.f$6, (DialogsActivity) this.f$7, (TLRPC.User) this.f$8, this.f$9, (String) this.f$10);
                break;
            default:
                ((MediaDataController) this.f$0).lambda$loadReplyMessagesForMessages$177((Timer.Task) this.f$1, (LongSparseArray) this.f$4, (AtomicInteger) this.f$10, (Runnable) this.f$2, this.f$5, (Timer) this.f$6, (LongSparseArray) this.f$7, (LongSparseArray) this.f$8, this.f$3, this.f$9);
                break;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda48(MediaDataController mediaDataController, Timer.Task task, LongSparseArray longSparseArray, AtomicInteger atomicInteger, Runnable runnable, int i, Timer timer, LongSparseArray longSparseArray2, LongSparseArray longSparseArray3, boolean z, long j) {
        this.f$0 = mediaDataController;
        this.f$1 = task;
        this.f$4 = longSparseArray;
        this.f$10 = atomicInteger;
        this.f$2 = runnable;
        this.f$5 = i;
        this.f$6 = timer;
        this.f$7 = longSparseArray2;
        this.f$8 = longSparseArray3;
        this.f$3 = z;
        this.f$9 = j;
    }
}
