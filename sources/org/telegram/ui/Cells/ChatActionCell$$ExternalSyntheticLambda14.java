package org.telegram.ui.Cells;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.utils.BitmapsCache;
import org.telegram.ui.Components.RLottieDrawable;

public final class ChatActionCell$$ExternalSyntheticLambda14 implements Runnable {
    public final int $r8$classId;
    public final RLottieDrawable f$0;

    public ChatActionCell$$ExternalSyntheticLambda14(RLottieDrawable rLottieDrawable, int i) {
        this.$r8$classId = i;
        this.f$0 = rLottieDrawable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.restart(false);
                break;
            case 1:
                this.f$0.start();
                break;
            case 2:
                RLottieDrawable rLottieDrawable = this.f$0;
                rLottieDrawable.loadFrameTask = null;
                rLottieDrawable.decodeFrameFinishedInternal();
                break;
            case 3:
                RLottieDrawable rLottieDrawable2 = this.f$0;
                rLottieDrawable2.getClass();
                try {
                    BitmapsCache bitmapsCache = rLottieDrawable2.bitmapsCache;
                    if (bitmapsCache != null) {
                        bitmapsCache.createCache();
                    }
                    break;
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(rLottieDrawable2.uiRunnableCacheFinished);
                break;
            case 4:
                RLottieDrawable rLottieDrawable3 = this.f$0;
                rLottieDrawable3.singleFrameDecoded = true;
                if ((!rLottieDrawable3.isRunning && rLottieDrawable3.decodeSingleFrame) || (rLottieDrawable3.renderingBitmap == null && rLottieDrawable3.nextRenderingBitmap != null)) {
                    rLottieDrawable3.invalidateInternal();
                }
                rLottieDrawable3.decodeFrameFinishedInternal();
                break;
            case 5:
                RLottieDrawable rLottieDrawable4 = this.f$0;
                if (!rLottieDrawable4.isRecycled && !rLottieDrawable4.destroyWhenDone && rLottieDrawable4.canLoadFrames$1() && rLottieDrawable4.cacheGenerateTask == null) {
                    rLottieDrawable4.generatingCache = true;
                    if (RLottieDrawable.lottieCacheGenerateQueue == null) {
                        RLottieDrawable.lottieCacheGenerateQueue = new DispatchQueue("cache generator queue");
                    }
                    BitmapsCache.taskCounter++;
                    DispatchQueue dispatchQueue = RLottieDrawable.lottieCacheGenerateQueue;
                    ChatActionCell$$ExternalSyntheticLambda14 chatActionCell$$ExternalSyntheticLambda14 = new ChatActionCell$$ExternalSyntheticLambda14(rLottieDrawable4, 3);
                    rLottieDrawable4.cacheGenerateTask = chatActionCell$$ExternalSyntheticLambda14;
                    dispatchQueue.postRunnable(chatActionCell$$ExternalSyntheticLambda14);
                    break;
                }
                break;
            case 6:
                RLottieDrawable rLottieDrawable5 = this.f$0;
                if (rLottieDrawable5.cacheGenerateTask != null) {
                    BitmapsCache.decrementTaskCounter();
                    rLottieDrawable5.cacheGenerateTask = null;
                }
                rLottieDrawable5.generatingCache = false;
                rLottieDrawable5.decodeFrameFinishedInternal();
                Runnable runnable = rLottieDrawable5.whenCacheDone;
                if (runnable != null) {
                    runnable.run();
                    rLottieDrawable5.whenCacheDone = null;
                }
                break;
            case 7:
                RLottieDrawable rLottieDrawable6 = this.f$0;
                int iLoadFrameRunnableImpl = rLottieDrawable6.loadFrameRunnableImpl();
                if (iLoadFrameRunnableImpl == 1) {
                    rLottieDrawable6.retryDelay = 0;
                    AndroidUtilities.runOnUIThread(rLottieDrawable6.uiRunnable);
                } else {
                    Runnable runnable2 = rLottieDrawable6.uiRunnableNoFrame;
                    if (iLoadFrameRunnableImpl == 2) {
                        AndroidUtilities.runOnUIThread(runnable2, rLottieDrawable6.retryDelay);
                        rLottieDrawable6.retryDelay = Math.min((Math.max(rLottieDrawable6.retryDelay, 2) * 3) / 2, 2000);
                    } else if (iLoadFrameRunnableImpl == 3) {
                        AndroidUtilities.runOnUIThread(runnable2);
                    }
                }
                CountDownLatch countDownLatch = rLottieDrawable6.frameWaitSync;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
                break;
            default:
                this.f$0.checkChoreographerInternal$1();
                break;
        }
    }
}
