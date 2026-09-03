package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.MessageObject;
public final class pb0 extends org.telegram.ui.Cells.t1 {
    public final rb0 Ce;

    public pb0(rb0 rb0Var, Context context, int i10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, false, chatMessageSharedResources, g6Var);
        this.Ce = rb0Var;
    }

    @Override
    public final void X3(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z4, boolean z10, boolean z11, boolean z12) {
        super.X3(messageObject, groupedMessages, z4, z10, z11, z12);
        sb0.b(this.Ce.f30719c, this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.Ce.f30719c.f31031f.invalidate();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        sb0.b(this.Ce.f30719c, this);
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        this.Ce.f30719c.f31031f.invalidate();
    }
}
