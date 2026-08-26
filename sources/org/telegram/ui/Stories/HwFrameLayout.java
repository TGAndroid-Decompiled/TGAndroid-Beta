package org.telegram.ui.Stories;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SharedConfig;

public abstract class HwFrameLayout extends FrameLayout {
    public final boolean isFastDevice;
    public static final HashSet hwViews = new HashSet();
    public static boolean hwEnabled = false;

    public HwFrameLayout(Context context) {
        super(context);
        this.isFastDevice = SharedConfig.getDevicePerformanceClass() == 2;
    }

    public final void disableHwAcceleration(boolean z) {
        hwEnabled = false;
        if (z) {
            setLayerType(0, null);
        }
        HashSet hashSet = hwViews;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        hashSet.clear();
    }

    @Override
    public final void invalidate() {
        if (hwEnabled) {
            hwViews.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (hwEnabled) {
            hwViews.add(this);
        } else {
            super.invalidate(i, i2, i3, i4);
        }
    }
}
