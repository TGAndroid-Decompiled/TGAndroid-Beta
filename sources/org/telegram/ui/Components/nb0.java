package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.MessageObject;
public final class nb0 extends org.telegram.ui.Cells.t1 {
    public final pb0 Fe;

    public nb0(pb0 pb0Var, Context context, int i10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, false, chatMessageSharedResources, f6Var);
        this.Fe = pb0Var;
    }

    @Override
    public final void X3(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10, boolean z11, boolean z12, boolean z13) {
        super.X3(messageObject, groupedMessages, z10, z11, z12, z13);
        qb0.b(this.Fe.f29346c, this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.Fe.f29346c.f29664f.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        qb0.b(this.Fe.f29346c, this);
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        this.Fe.f29346c.f29664f.invalidate();
    }
}
