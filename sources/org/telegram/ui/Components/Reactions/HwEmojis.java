package org.telegram.ui.Components.Reactions;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.DispatchQueuePriority;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;

public abstract class HwEmojis {
    public static Boolean isWeakDevice;
    public static Runnable task;
    public static final HashSet hwViews = new HashSet();
    public static volatile boolean hwEnabled = false;
    public static boolean firstOpen = true;
    public static boolean isPreparing = false;
    public static boolean isCascade = false;
    public static boolean isBeforePreparing = false;

    public static void disableHw() {
        DispatchQueuePriority cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.pauseLatch;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.pauseLatch = null;
        }
        hwEnabled = false;
        isPreparing = false;
        isBeforePreparing = false;
        task = null;
        Iterator it = hwViews.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        hwViews.clear();
    }

    public static boolean grab(View view) {
        if (hwEnabled) {
            hwViews.add(view);
        }
        return hwEnabled;
    }

    public static boolean grabIfWeakDevice(View... viewArr) {
        if (isWeakDevice == null) {
            isWeakDevice = Boolean.valueOf(SharedConfig.getDevicePerformanceClass() != 2);
        }
        if (!isWeakDevice.booleanValue()) {
            return false;
        }
        if (hwEnabled) {
            hwViews.addAll(Arrays.asList(viewArr));
        }
        return hwEnabled;
    }

    public static boolean isHwEnabledOrPreparing() {
        return hwEnabled || isPreparing || isBeforePreparing;
    }
}
