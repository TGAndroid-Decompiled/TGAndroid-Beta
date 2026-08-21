package org.telegram.ui.Components;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;

public class PostRunnableHolder {
    private final HashMap wrappedRunnable = new HashMap();

    public void post(final Runnable runnable, long j) {
        cancel(runnable);
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                PostRunnableHolder.m2575$r8$lambda$lDJ5QuXANnbRC3hW4n6peU24c(this.f$0, runnable);
            }
        };
        this.wrappedRunnable.put(runnable, runnable2);
        if (j > 0) {
            AndroidUtilities.runOnUIThread(runnable2, j);
        } else {
            AndroidUtilities.runOnUIThread(runnable2);
        }
    }

    public static void m2575$r8$lambda$lDJ5QuXANnbRC3hW4n6peU24c(PostRunnableHolder postRunnableHolder, Runnable runnable) {
        postRunnableHolder.getClass();
        runnable.run();
        postRunnableHolder.wrappedRunnable.remove(runnable);
    }

    public void cancel(Runnable runnable) {
        Runnable runnable2 = (Runnable) this.wrappedRunnable.remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    public void clear() {
        Iterator it = this.wrappedRunnable.entrySet().iterator();
        while (it.hasNext()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) ((Map.Entry) it.next()).getValue());
        }
        this.wrappedRunnable.clear();
    }
}
