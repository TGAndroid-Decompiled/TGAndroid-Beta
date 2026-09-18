package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.MessageObject;
public final class vb0 extends org.telegram.ui.Cells.u1 {
    public final xb0 Ge;

    public vb0(xb0 xb0Var, Context context, int i10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, false, chatMessageSharedResources, e6Var);
        this.Ge = xb0Var;
    }

    @Override
    public final void X3(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10, boolean z11, boolean z12, boolean z13) {
        super.X3(messageObject, groupedMessages, z10, z11, z12, z13);
        yb0.b(this.Ge.f30302c, this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.Ge.f30302c.f30538f.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        yb0.b(this.Ge.f30302c, this);
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        this.Ge.f30302c.f30538f.invalidate();
    }
}
