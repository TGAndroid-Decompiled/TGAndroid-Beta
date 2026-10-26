package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.MessageObject;
public final class ec0 extends org.telegram.ui.Cells.s1 {
    public final gc0 He;

    public ec0(gc0 gc0Var, Context context, int i10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, false, chatMessageSharedResources, u6Var);
        this.He = gc0Var;
    }

    @Override
    public final void Z3(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10, boolean z11, boolean z12, boolean z13) {
        super.Z3(messageObject, groupedMessages, z10, z11, z12, z13);
        hc0.b(this.He.f28535c, this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.He.f28535c.f28920f.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        hc0.b(this.He.f28535c, this);
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        this.He.f28535c.f28920f.invalidate();
    }
}
