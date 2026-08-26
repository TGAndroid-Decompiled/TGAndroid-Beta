package org.telegram.ui.Components;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;

public class PostRunnableHolder {
    private final HashMap<Runnable, Runnable> wrappedRunnable = new HashMap<>();

    public void lambda$post$0(Runnable runnable) {
        runnable.run();
        this.wrappedRunnable.remove(runnable);
    }

    public void cancel(Runnable runnable) {
        Runnable runnableRemove = this.wrappedRunnable.remove(runnable);
        if (runnableRemove != null) {
            AndroidUtilities.cancelRunOnUIThread(runnableRemove);
        }
    }

    public void clear() {
        Iterator<Map.Entry<Runnable, Runnable>> it = this.wrappedRunnable.entrySet().iterator();
        while (it.hasNext()) {
            AndroidUtilities.cancelRunOnUIThread(it.next().getValue());
        }
        this.wrappedRunnable.clear();
    }

    public void post(Runnable runnable) {
        post(runnable, 0L);
    }

    public void post(Runnable runnable, long j) {
        cancel(runnable);
        UndoView$$ExternalSyntheticLambda3 undoView$$ExternalSyntheticLambda3 = new UndoView$$ExternalSyntheticLambda3(5, this, runnable);
        this.wrappedRunnable.put(runnable, undoView$$ExternalSyntheticLambda3);
        if (j > 0) {
            AndroidUtilities.runOnUIThread(undoView$$ExternalSyntheticLambda3, j);
        } else {
            AndroidUtilities.runOnUIThread(undoView$$ExternalSyntheticLambda3);
        }
    }
}
