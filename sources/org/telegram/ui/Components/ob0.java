package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.MessageObject;
public final class ob0 extends org.telegram.ui.Cells.s1 {
    public final qb0 Ce;

    public ob0(qb0 qb0Var, Context context, int i10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, false, chatMessageSharedResources, f6Var);
        this.Ce = qb0Var;
    }

    @Override
    public final void X3(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z4, boolean z10, boolean z11, boolean z12) {
        super.X3(messageObject, groupedMessages, z4, z10, z11, z12);
        rb0.b(this.Ce.f28139c, this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.Ce.f28139c.f28443f.invalidate();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        rb0.b(this.Ce.f28139c, this);
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        this.Ce.f28139c.f28443f.invalidate();
    }
}
