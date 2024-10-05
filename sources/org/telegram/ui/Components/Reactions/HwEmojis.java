package org.telegram.ui.Components.Reactions;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;

public abstract class HwEmojis {
    private static Boolean isWeakDevice;
    private static Runnable task;
    private static final Set hwViews = new HashSet();
    private static volatile boolean hwEnabled = false;
    private static boolean firstOpen = true;
    private static boolean isPreparing = false;
    private static boolean isCascade = false;
    private static boolean isBeforePreparing = false;

    public static void beforePreparing() {
        ImageLoader.getInstance().getCacheOutQueue().pause();
        isBeforePreparing = true;
    }

    public static void disableHw() {
        ImageLoader.getInstance().getCacheOutQueue().resume();
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

    public static void enableHw() {
        ImageLoader.getInstance().getCacheOutQueue().pause();
        hwEnabled = true;
        isPreparing = false;
        isBeforePreparing = false;
    }

    public static void exec() {
        Runnable runnable = task;
        if (runnable != null) {
            runnable.run();
            task = null;
        }
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

    public static boolean isCascade() {
        return isCascade;
    }

    public static boolean isFirstOpen() {
        return firstOpen;
    }

    public static boolean isHwEnabled() {
        return hwEnabled;
    }

    public static boolean isHwEnabledOrPreparing() {
        return hwEnabled || isPreparing || isBeforePreparing;
    }

    public static boolean isPreparing() {
        return isPreparing;
    }

    public static void prepare(Runnable runnable, boolean z) {
        isCascade = z;
        isPreparing = true;
        isBeforePreparing = false;
        if (firstOpen) {
            firstOpen = false;
        }
        task = runnable;
    }
}
