package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.MessageObject;
public final class ta0 extends org.telegram.ui.Cells.t1 {
    public final va0 Be;

    public ta0(va0 va0Var, Context context, int i9, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, false, chatMessageSharedResources, b6Var);
        this.Be = va0Var;
    }

    @Override
    public final void X3(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10, boolean z11, boolean z12, boolean z13) {
        super.X3(messageObject, groupedMessages, z10, z11, z12, z13);
        wa0.b(this.Be.f33339c, this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.Be.f33339c.f34172f.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        wa0.b(this.Be.f33339c, this);
    }

    @Override
    public final void invalidate(int i9, int i10, int i11, int i12) {
        super.invalidate(i9, i10, i11, i12);
        this.Be.f33339c.f34172f.invalidate();
    }
}
