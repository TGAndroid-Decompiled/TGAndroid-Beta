package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.utils.BitmapsCache;
import org.telegram.ui.CastSync;

public final class AnimatedFileDrawable$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final AnimatedFileDrawable f$0;

    public AnimatedFileDrawable$$ExternalSyntheticLambda0(AnimatedFileDrawable animatedFileDrawable, int i) {
        this.$r8$classId = i;
        this.f$0 = animatedFileDrawable;
    }

    @Override
    public final void run() {
        boolean z;
        int i;
        boolean z2;
        AnimatedFileDrawableStream animatedFileDrawableStream;
        boolean z3;
        View view;
        switch (this.$r8$classId) {
            case 0:
                this.f$0.checkChoreographerInternal();
                return;
            case 1:
                this.f$0.getClass();
                return;
            case 2:
                AnimatedFileDrawable animatedFileDrawable = this.f$0;
                animatedFileDrawable.chekDestroyDecoder();
                animatedFileDrawable.loadFrameTask = null;
                if (animatedFileDrawable.pendingSeekToUI >= 0 && animatedFileDrawable.pendingSeekTo == -1) {
                    animatedFileDrawable.pendingSeekToUI = -1L;
                }
                animatedFileDrawable.scheduleNextGetFrame(false);
                animatedFileDrawable.invalidateInternal();
                return;
            case 3:
                AnimatedFileDrawable animatedFileDrawable2 = this.f$0;
                if (animatedFileDrawable2.isRecycled || animatedFileDrawable2.destroyWhenDone || animatedFileDrawable2.generatingCache || animatedFileDrawable2.cacheGenRunnable != null) {
                    return;
                }
                animatedFileDrawable2.startTime = System.currentTimeMillis();
                if (RLottieDrawable.lottieCacheGenerateQueue == null) {
                    RLottieDrawable.lottieCacheGenerateQueue = new DispatchQueue("cache generator queue");
                }
                animatedFileDrawable2.generatingCache = true;
                animatedFileDrawable2.loadFrameTask = null;
                BitmapsCache.taskCounter++;
                DispatchQueue dispatchQueue = RLottieDrawable.lottieCacheGenerateQueue;
                AnimatedFileDrawable$$ExternalSyntheticLambda0 animatedFileDrawable$$ExternalSyntheticLambda0 = new AnimatedFileDrawable$$ExternalSyntheticLambda0(animatedFileDrawable2, 7);
                animatedFileDrawable2.cacheGenRunnable = animatedFileDrawable$$ExternalSyntheticLambda0;
                dispatchQueue.postRunnable(animatedFileDrawable$$ExternalSyntheticLambda0);
                return;
            case 4:
                AnimatedFileDrawable animatedFileDrawable3 = this.f$0;
                animatedFileDrawable3.chekDestroyDecoder();
                if (animatedFileDrawable3.stream != null && animatedFileDrawable3.pendingRemoveLoading) {
                    FileLoader.getInstance(animatedFileDrawable3.currentAccount).removeLoadingVideo(animatedFileDrawable3.stream.getDocument(), false, false);
                }
                int i2 = animatedFileDrawable3.pendingRemoveLoadingFramesReset;
                if (i2 <= 0) {
                    animatedFileDrawable3.pendingRemoveLoading = true;
                } else {
                    animatedFileDrawable3.pendingRemoveLoadingFramesReset = i2 - 1;
                }
                if (animatedFileDrawable3.forceDecodeAfterNextFrame) {
                    animatedFileDrawable3.forceDecodeAfterNextFrame = false;
                } else {
                    animatedFileDrawable3.singleFrameDecoded = true;
                }
                animatedFileDrawable3.loadFrameTask = null;
                if (animatedFileDrawable3.pendingSeekToUI >= 0) {
                    animatedFileDrawable3.nextRenderingBuffer = animatedFileDrawable3.backgroundBuffer;
                    animatedFileDrawable3.nextRenderingBuffer2 = null;
                } else if (animatedFileDrawable3.PRERENDER_FRAME) {
                    AnimatedFileBuffer animatedFileBuffer = animatedFileDrawable3.nextRenderingBuffer;
                    if (animatedFileBuffer == null && animatedFileDrawable3.nextRenderingBuffer2 == null) {
                        animatedFileDrawable3.nextRenderingBuffer = animatedFileDrawable3.backgroundBuffer;
                    } else if (animatedFileBuffer == null) {
                        animatedFileDrawable3.nextRenderingBuffer = animatedFileDrawable3.nextRenderingBuffer2;
                        animatedFileDrawable3.nextRenderingBuffer2 = animatedFileDrawable3.backgroundBuffer;
                    } else {
                        animatedFileDrawable3.nextRenderingBuffer2 = animatedFileDrawable3.backgroundBuffer;
                    }
                } else {
                    animatedFileDrawable3.nextRenderingBuffer = animatedFileDrawable3.backgroundBuffer;
                }
                animatedFileDrawable3.backgroundBuffer = null;
                if (animatedFileDrawable3.isRestarted) {
                    animatedFileDrawable3.isRestarted = false;
                    animatedFileDrawable3.repeatCount++;
                    animatedFileDrawable3.checkRepeat();
                }
                if (animatedFileDrawable3.metaData[3] < animatedFileDrawable3.lastTimeStamp) {
                    float f = animatedFileDrawable3.startTime;
                    animatedFileDrawable3.lastTimeStamp = f > 0.0f ? (int) (f * 1000.0f) : 0;
                }
                if (animatedFileDrawable3.pendingSeekToUI >= 0 && animatedFileDrawable3.pendingSeekTo == -1) {
                    animatedFileDrawable3.pendingSeekToUI = -1L;
                }
                animatedFileDrawable3.lastTimeStamp = animatedFileDrawable3.metaData[3];
                int size = animatedFileDrawable3.secondParentViews.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((View) animatedFileDrawable3.secondParentViews.get(i3)).invalidate();
                }
                if ((!animatedFileDrawable3.isRunning && animatedFileDrawable3.decodeSingleFrame) || (animatedFileDrawable3.renderingBuffer == null && animatedFileDrawable3.nextRenderingBuffer != null)) {
                    animatedFileDrawable3.invalidateInternal();
                }
                animatedFileDrawable3.scheduleNextGetFrame(false);
                return;
            case 5:
                AnimatedFileDrawable animatedFileDrawable4 = this.f$0;
                if (animatedFileDrawable4.isRecycled) {
                    AndroidUtilities.runOnUIThread(animatedFileDrawable4.uiRunnable);
                    return;
                }
                boolean z4 = true;
                if (!animatedFileDrawable4.decoderCreated && animatedFileDrawable4.mDecoder == null) {
                    animatedFileDrawable4.mDecoder = AnimatedFileNative.createDecoderFrom(animatedFileDrawable4.path.getAbsolutePath(), animatedFileDrawable4.metaData, animatedFileDrawable4.currentAccount, animatedFileDrawable4.streamFileSize, animatedFileDrawable4.stream, false);
                    animatedFileDrawable4.ptrFail = animatedFileDrawable4.mDecoder == null && (!animatedFileDrawable4.isWebmSticker || animatedFileDrawable4.decoderTryCount > 15);
                    if (animatedFileDrawable4.mDecoder != null) {
                        int[] iArr = animatedFileDrawable4.metaData;
                        if (iArr[0] > 3840 || iArr[1] > 3840) {
                            animatedFileDrawable4.mDecoder.recycle();
                            animatedFileDrawable4.mDecoder = null;
                        }
                    }
                    animatedFileDrawable4.adaptRenderingSize();
                    animatedFileDrawable4.updateScaleFactor();
                    if (animatedFileDrawable4.isWebmSticker && animatedFileDrawable4.mDecoder == null) {
                        int i4 = animatedFileDrawable4.decoderTryCount;
                        animatedFileDrawable4.decoderTryCount = i4 + 1;
                        if (i4 > 15) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else {
                        z3 = true;
                    }
                    animatedFileDrawable4.decoderCreated = z3;
                    AndroidUtilities.runOnUIThread(new AnimatedFileDrawable$$ExternalSyntheticLambda0(animatedFileDrawable4, 0));
                }
                try {
                    if (animatedFileDrawable4.bitmapsCache != null) {
                        if (animatedFileDrawable4.backgroundBuffer == null) {
                            if (animatedFileDrawable4.unusedBuffers.isEmpty()) {
                                animatedFileDrawable4.backgroundBuffer = new AnimatedFileBuffer(Bitmap.createBitmap(animatedFileDrawable4.renderingWidth, animatedFileDrawable4.renderingHeight, Bitmap.Config.ARGB_8888));
                            } else {
                                animatedFileDrawable4.backgroundBuffer = (AnimatedFileBuffer) animatedFileDrawable4.unusedBuffers.remove(0);
                            }
                        }
                        if (animatedFileDrawable4.cacheMetadata == null) {
                            animatedFileDrawable4.cacheMetadata = new CastSync.AnonymousClass1();
                        }
                        System.currentTimeMillis();
                        CastSync.AnonymousClass1 anonymousClass1 = animatedFileDrawable4.cacheMetadata;
                        int i5 = anonymousClass1.val$type;
                        BitmapsCache bitmapsCache = animatedFileDrawable4.bitmapsCache;
                        int frame = bitmapsCache.getFrame(animatedFileDrawable4.backgroundBuffer.bitmap, bitmapsCache.frameIndex);
                        anonymousClass1.val$type = bitmapsCache.frameIndex;
                        if (bitmapsCache.cacheCreated && !bitmapsCache.frameOffsets.isEmpty()) {
                            int i6 = bitmapsCache.frameIndex + 1;
                            bitmapsCache.frameIndex = i6;
                            if (i6 >= bitmapsCache.frameOffsets.size()) {
                                bitmapsCache.frameIndex = 0;
                            }
                        }
                        if (frame != -1 && animatedFileDrawable4.cacheMetadata.val$type < i5) {
                            animatedFileDrawable4.isRestarted = true;
                        }
                        int[] iArr2 = animatedFileDrawable4.metaData;
                        AnimatedFileBuffer animatedFileBuffer2 = animatedFileDrawable4.backgroundBuffer;
                        int iMax = animatedFileDrawable4.cacheMetadata.val$type * Math.max(16, iArr2[4] / Math.max(1, animatedFileDrawable4.bitmapsCache.frameOffsets.size()));
                        animatedFileBuffer2.time = iMax;
                        iArr2[3] = iMax;
                        animatedFileDrawable4.backgroundBuffer.opaque = false;
                        BitmapsCache bitmapsCache2 = animatedFileDrawable4.bitmapsCache;
                        if (!bitmapsCache2.cacheCreated || !bitmapsCache2.fileExist) {
                            AndroidUtilities.runOnUIThread(animatedFileDrawable4.uiRunnableGenerateCache);
                        }
                        if (frame == -1) {
                            AndroidUtilities.runOnUIThread(animatedFileDrawable4.uiRunnableNoFrame);
                            return;
                        } else {
                            AndroidUtilities.runOnUIThread(animatedFileDrawable4.uiRunnable);
                            return;
                        }
                    }
                    if (animatedFileDrawable4.mDecoder == null) {
                        int[] iArr3 = animatedFileDrawable4.metaData;
                        if (iArr3[0] != 0 && iArr3[1] != 0) {
                            AndroidUtilities.runOnUIThread(animatedFileDrawable4.uiRunnableNoFrame);
                            return;
                        }
                    }
                    if (animatedFileDrawable4.backgroundBuffer == null) {
                        int[] iArr4 = animatedFileDrawable4.metaData;
                        if (iArr4[0] <= 0 || iArr4[1] <= 0) {
                            if (animatedFileDrawable4.pendingSeekTo >= 0) {
                                animatedFileDrawable4.metaData[3] = (int) animatedFileDrawable4.pendingSeekTo;
                                long j = animatedFileDrawable4.pendingSeekTo;
                                synchronized (animatedFileDrawable4.sync) {
                                    animatedFileDrawable4.pendingSeekTo = -1L;
                                    break;
                                }
                                animatedFileDrawableStream = animatedFileDrawable4.stream;
                                if (animatedFileDrawableStream != null) {
                                    animatedFileDrawableStream.reset();
                                }
                                animatedFileDrawable4.mDecoder.seekToMs(j, true);
                                z = true;
                            } else {
                                z = false;
                            }
                            if (animatedFileDrawable4.backgroundBuffer != null) {
                                System.currentTimeMillis();
                                if (animatedFileDrawable4.mDecoder.getVideoFrame(animatedFileDrawable4.backgroundBuffer.bitmap, false, animatedFileDrawable4.startTime, animatedFileDrawable4.endTime, animatedFileDrawable4.loop) == 0) {
                                    AndroidUtilities.runOnUIThread(animatedFileDrawable4.uiRunnableNoFrame);
                                    return;
                                }
                                if (!animatedFileDrawable4.isStaticVideoDetected) {
                                    if (animatedFileDrawable4.mDecoder.mMetaData[7] == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    animatedFileDrawable4.isStaticVideoDetected = z2;
                                }
                                i = animatedFileDrawable4.metaData[3];
                                if (i < animatedFileDrawable4.lastTimeStamp) {
                                    animatedFileDrawable4.isRestarted = true;
                                }
                                if (z) {
                                    animatedFileDrawable4.lastTimeStamp = i;
                                }
                                AnimatedFileBuffer animatedFileBuffer3 = animatedFileDrawable4.backgroundBuffer;
                                animatedFileBuffer3.time = i;
                                if (animatedFileDrawable4.mDecoder.mMetaData[6] != 1) {
                                    z4 = false;
                                }
                                animatedFileBuffer3.opaque = z4;
                            }
                        } else {
                            try {
                                if (animatedFileDrawable4.unusedBuffers.isEmpty()) {
                                    int[] iArr5 = animatedFileDrawable4.metaData;
                                    float f2 = iArr5[0];
                                    float f3 = animatedFileDrawable4.scaleFactor;
                                    animatedFileDrawable4.backgroundBuffer = new AnimatedFileBuffer(Bitmap.createBitmap((int) (f2 * f3), (int) (iArr5[1] * f3), Bitmap.Config.ARGB_8888));
                                } else {
                                    animatedFileDrawable4.backgroundBuffer = (AnimatedFileBuffer) animatedFileDrawable4.unusedBuffers.remove(0);
                                }
                            } catch (Throwable th) {
                                FileLog.e(th);
                            }
                            if (animatedFileDrawable4.pendingSeekTo >= 0) {
                                animatedFileDrawable4.metaData[3] = (int) animatedFileDrawable4.pendingSeekTo;
                                long j2 = animatedFileDrawable4.pendingSeekTo;
                                synchronized (animatedFileDrawable4.sync) {
                                    animatedFileDrawable4.pendingSeekTo = -1L;
                                    animatedFileDrawableStream = animatedFileDrawable4.stream;
                                    if (animatedFileDrawableStream != null) {
                                        animatedFileDrawableStream.reset();
                                    }
                                    animatedFileDrawable4.mDecoder.seekToMs(j2, true);
                                    z = true;
                                }
                            } else {
                                z = false;
                            }
                            if (animatedFileDrawable4.backgroundBuffer != null) {
                                System.currentTimeMillis();
                                if (animatedFileDrawable4.mDecoder.getVideoFrame(animatedFileDrawable4.backgroundBuffer.bitmap, false, animatedFileDrawable4.startTime, animatedFileDrawable4.endTime, animatedFileDrawable4.loop) == 0) {
                                    AndroidUtilities.runOnUIThread(animatedFileDrawable4.uiRunnableNoFrame);
                                    return;
                                }
                                if (!animatedFileDrawable4.isStaticVideoDetected) {
                                    if (animatedFileDrawable4.mDecoder.mMetaData[7] == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    animatedFileDrawable4.isStaticVideoDetected = z2;
                                }
                                i = animatedFileDrawable4.metaData[3];
                                if (i < animatedFileDrawable4.lastTimeStamp) {
                                    animatedFileDrawable4.isRestarted = true;
                                }
                                if (z) {
                                    animatedFileDrawable4.lastTimeStamp = i;
                                }
                                AnimatedFileBuffer animatedFileBuffer4 = animatedFileDrawable4.backgroundBuffer;
                                animatedFileBuffer4.time = i;
                                if (animatedFileDrawable4.mDecoder.mMetaData[6] != 1) {
                                    z4 = false;
                                }
                                animatedFileBuffer4.opaque = z4;
                            }
                        }
                    } else {
                        if (animatedFileDrawable4.pendingSeekTo >= 0) {
                            animatedFileDrawable4.metaData[3] = (int) animatedFileDrawable4.pendingSeekTo;
                            long j3 = animatedFileDrawable4.pendingSeekTo;
                            synchronized (animatedFileDrawable4.sync) {
                                animatedFileDrawable4.pendingSeekTo = -1L;
                                animatedFileDrawableStream = animatedFileDrawable4.stream;
                                if (animatedFileDrawableStream != null) {
                                    animatedFileDrawableStream.reset();
                                }
                                animatedFileDrawable4.mDecoder.seekToMs(j3, true);
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        if (animatedFileDrawable4.backgroundBuffer != null) {
                            System.currentTimeMillis();
                            if (animatedFileDrawable4.mDecoder.getVideoFrame(animatedFileDrawable4.backgroundBuffer.bitmap, false, animatedFileDrawable4.startTime, animatedFileDrawable4.endTime, animatedFileDrawable4.loop) == 0) {
                                AndroidUtilities.runOnUIThread(animatedFileDrawable4.uiRunnableNoFrame);
                                return;
                            }
                            if (!animatedFileDrawable4.isStaticVideoDetected) {
                                if (animatedFileDrawable4.mDecoder.mMetaData[7] == 1) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                animatedFileDrawable4.isStaticVideoDetected = z2;
                            }
                            i = animatedFileDrawable4.metaData[3];
                            if (i < animatedFileDrawable4.lastTimeStamp) {
                                animatedFileDrawable4.isRestarted = true;
                            }
                            if (z) {
                                animatedFileDrawable4.lastTimeStamp = i;
                            }
                            AnimatedFileBuffer animatedFileBuffer5 = animatedFileDrawable4.backgroundBuffer;
                            animatedFileBuffer5.time = i;
                            if (animatedFileDrawable4.mDecoder.mMetaData[6] != 1) {
                                z4 = false;
                            }
                            animatedFileBuffer5.opaque = z4;
                        }
                    }
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                AndroidUtilities.runOnUIThread(animatedFileDrawable4.uiRunnable);
                return;
            case 6:
                AnimatedFileDrawable animatedFileDrawable5 = this.f$0;
                ArrayList arrayList = animatedFileDrawable5.secondParentViews;
                int size2 = arrayList.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    ((View) arrayList.get(i7)).invalidate();
                }
                if ((arrayList.isEmpty() || animatedFileDrawable5.invalidateParentViewWithSecond) && (view = animatedFileDrawable5.parentView) != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                AnimatedFileDrawable animatedFileDrawable6 = this.f$0;
                animatedFileDrawable6.bitmapsCache.createCache();
                AndroidUtilities.runOnUIThread(new AnimatedFileDrawable$$ExternalSyntheticLambda0(animatedFileDrawable6, 8));
                return;
            default:
                AnimatedFileDrawable animatedFileDrawable7 = this.f$0;
                if (animatedFileDrawable7.cacheGenRunnable != null) {
                    BitmapsCache.decrementTaskCounter();
                    animatedFileDrawable7.cacheGenRunnable = null;
                }
                animatedFileDrawable7.generatingCache = false;
                animatedFileDrawable7.chekDestroyDecoder();
                animatedFileDrawable7.scheduleNextGetFrame(false);
                return;
        }
    }
}
