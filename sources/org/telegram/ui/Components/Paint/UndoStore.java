package org.telegram.ui.Components.Paint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;

public class UndoStore {
    private UndoStoreDelegate delegate;
    private Map uuidToOperationMap = new HashMap();
    private List operations = new ArrayList();

    public interface UndoStoreDelegate {
        void historyChanged();
    }

    public void lambda$notifyOfHistoryChanges$0() {
        UndoStoreDelegate undoStoreDelegate = this.delegate;
        if (undoStoreDelegate != null) {
            undoStoreDelegate.historyChanged();
        }
    }

    private void notifyOfHistoryChanges() {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                UndoStore.this.lambda$notifyOfHistoryChanges$0();
            }
        });
    }

    public boolean canUndo() {
        return !this.operations.isEmpty();
    }

    public UndoStoreDelegate getDelegate() {
        return this.delegate;
    }

    public void registerUndo(UUID uuid, Runnable runnable) {
        this.uuidToOperationMap.put(uuid, runnable);
        this.operations.add(uuid);
        notifyOfHistoryChanges();
    }

    public void reset() {
        this.operations.clear();
        this.uuidToOperationMap.clear();
        notifyOfHistoryChanges();
    }

    public void setDelegate(UndoStoreDelegate undoStoreDelegate) {
        this.delegate = undoStoreDelegate;
    }

    public void undo() {
        if (this.operations.size() == 0) {
            return;
        }
        int size = this.operations.size() - 1;
        UUID uuid = (UUID) this.operations.get(size);
        Runnable runnable = (Runnable) this.uuidToOperationMap.get(uuid);
        this.uuidToOperationMap.remove(uuid);
        this.operations.remove(size);
        runnable.run();
        notifyOfHistoryChanges();
    }

    public void unregisterUndo(UUID uuid) {
        this.uuidToOperationMap.remove(uuid);
        this.operations.remove(uuid);
        notifyOfHistoryChanges();
    }
}
