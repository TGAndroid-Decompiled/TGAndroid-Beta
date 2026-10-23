package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.MessageObject;
public final class ic0 extends org.telegram.ui.Cells.t1 {
    public final kc0 Ge;

    public ic0(kc0 kc0Var, Context context, int i10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, false, chatMessageSharedResources, g6Var);
        this.Ge = kc0Var;
    }

    @Override
    public final void W3(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10, boolean z11, boolean z12, boolean z13) {
        super.W3(messageObject, groupedMessages, z10, z11, z12, z13);
        lc0.b(this.Ge.f28004c, this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.Ge.f28004c.f28341f.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        lc0.b(this.Ge.f28004c, this);
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        this.Ge.f28004c.f28341f.invalidate();
    }
}
