package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

public final class DeleteMessagesBottomSheet$$ExternalSyntheticLambda4 implements Utilities.IndexedConsumer, MessagesStorage.LongCallback, RecyclerListView.OnItemClickListenerExtended {
    public final int $r8$classId;
    public final DeleteMessagesBottomSheet f$0;

    public DeleteMessagesBottomSheet$$ExternalSyntheticLambda4(DeleteMessagesBottomSheet deleteMessagesBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = deleteMessagesBottomSheet;
    }

    @Override
    public void accept(Object obj, int i) {
        switch (this.$r8$classId) {
            case 1:
                this.f$0.lambda$performDelete$22((TLObject) obj, i);
                break;
            case 2:
                this.f$0.lambda$performDelete$23((TLObject) obj, i);
                break;
            case 3:
                this.f$0.lambda$performDelete$24((TLObject) obj, i);
                break;
            case 4:
                this.f$0.lambda$performDelete$18((TLObject) obj, i);
                break;
            default:
                this.f$0.lambda$performDelete$21((TLObject) obj, i);
                break;
        }
    }

    @Override
    public boolean hasDoubleTap(View view, int i) {
        return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
    }

    @Override
    public void onDoubleTap(View view, int i, float f, float f2) {
        RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        this.f$0.lambda$new$0(view, i, f, f2);
    }

    @Override
    public void run(long j) {
        switch (this.$r8$classId) {
            case 6:
                this.f$0.lambda$proceed$25(j);
                break;
            default:
                this.f$0.lambda$fillItems$12(j);
                break;
        }
    }
}
