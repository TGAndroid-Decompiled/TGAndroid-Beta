package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class StickersDialogs$$ExternalSyntheticLambda2 implements AlertDialog.OnButtonClickListener, RecyclerListView.OnItemClickListenerExtended, RecyclerListView.OnItemLongClickListenerExtended {
    public final Object f$0;
    public final Object f$1;

    public StickersDialogs$$ExternalSyntheticLambda2(Object obj, Object obj2) {
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public boolean hasDoubleTap(View view, int i) {
        return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        StickersDialogs.lambda$showDeleteForEveryOneDialog$7((Runnable) this.f$0, (TLRPC.StickerSet) this.f$1, alertDialog, i);
    }

    @Override
    public void onDoubleTap(View view, int i, float f, float f2) {
        RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        ((UniversalRecyclerView) this.f$0).lambda$new$0((Utilities.Callback5) this.f$1, view, i, f, f2);
    }

    @Override
    public void onLongClickRelease() {
        RecyclerListView.OnItemLongClickListenerExtended.CC.$default$onLongClickRelease(this);
    }

    @Override
    public void onMove(float f, float f2) {
        RecyclerListView.OnItemLongClickListenerExtended.CC.$default$onMove(this, f, f2);
    }

    @Override
    public boolean mo2353onItemClick(View view, int i, float f, float f2) {
        return ((UniversalRecyclerView) this.f$0).lambda$new$1((Utilities.Callback5Return) this.f$1, view, i, f, f2);
    }
}
