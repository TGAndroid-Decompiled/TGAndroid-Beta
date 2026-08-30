package org.telegram.ui.Components;

import java.io.File;
import org.telegram.messenger.Utilities;
public final class ll implements Utilities.Callback {
    public final int f26787a;
    public final boolean f26788b;
    public final Object f26789c;
    public final Object d;

    public ll(Object obj, boolean z4, Object obj2, int i10) {
        this.f26787a = i10;
        this.f26789c = obj;
        this.f26788b = z4;
        this.d = obj2;
    }

    @Override
    public final void run(java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ll.run(java.lang.Object):void");
    }

    public ll(nl nlVar, File file, boolean z4) {
        this.f26787a = 0;
        this.f26789c = nlVar;
        this.d = file;
        this.f26788b = z4;
    }

    public ll(boolean z4, Object obj, Object obj2, int i10) {
        this.f26787a = i10;
        this.f26788b = z4;
        this.f26789c = obj;
        this.d = obj2;
    }
}
