package org.telegram.ui.Components;

import android.os.Trace;
public final class zb1 implements Runnable {
    public final long f35311a;

    @Override
    public final void run() {
        long j10 = this.f35311a;
        Trace.beginSection("WidgetSandbox:Destroy");
        try {
            WidgetSandboxNative.destroy(j10);
        } finally {
            Trace.endSection();
        }
    }
}
