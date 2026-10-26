package org.telegram.ui.Components;

import android.os.Trace;
public final class ub1 implements Runnable {
    public final long f33345a;

    @Override
    public final void run() {
        long j10 = this.f33345a;
        Trace.beginSection("WidgetSandbox:Destroy");
        try {
            WidgetSandboxNative.destroy(j10);
        } finally {
            Trace.endSection();
        }
    }
}
