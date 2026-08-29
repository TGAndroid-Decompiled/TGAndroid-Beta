package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.MessageObject;
public final class ib0 extends org.telegram.ui.Cells.s1 {
    public final kb0 Be;

    public ib0(kb0 kb0Var, Context context, int i10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, false, chatMessageSharedResources, c6Var);
        this.Be = kb0Var;
    }

    @Override
    public final void X3(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10, boolean z11, boolean z12, boolean z13) {
        super.X3(messageObject, groupedMessages, z10, z11, z12, z13);
        lb0.b(this.Be.f30006c, this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.Be.f30006c.f30277f.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        lb0.b(this.Be.f30006c, this);
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        this.Be.f30006c.f30277f.invalidate();
    }
}
