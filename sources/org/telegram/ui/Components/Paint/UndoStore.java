package org.telegram.ui.Components.Paint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.HintView$1$$ExternalSyntheticLambda0;

public final class UndoStore {
    public UndoStoreDelegate delegate;
    public final HashMap uuidToOperationMap = new HashMap();
    public final ArrayList operations = new ArrayList();

    public interface UndoStoreDelegate {
        void historyChanged();
    }

    public final boolean canUndo() {
        return !this.operations.isEmpty();
    }

    public final void notifyOfHistoryChanges() {
        AndroidUtilities.runOnUIThread(new HintView$1$$ExternalSyntheticLambda0(this, 29));
    }

    public final void undo() {
        ArrayList arrayList = this.operations;
        if (arrayList.size() == 0) {
            return;
        }
        int size = arrayList.size() - 1;
        UUID uuid = (UUID) arrayList.get(size);
        HashMap map = this.uuidToOperationMap;
        Runnable runnable = (Runnable) map.get(uuid);
        map.remove(uuid);
        arrayList.remove(size);
        runnable.run();
        notifyOfHistoryChanges();
    }
}
