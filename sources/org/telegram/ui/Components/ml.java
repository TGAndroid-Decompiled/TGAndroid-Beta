package org.telegram.ui.Components;

import java.io.File;
import org.telegram.messenger.Utilities;
public final class ml implements Utilities.Callback {
    public final int f29150a;
    public final boolean f29151b;
    public final Object f29152c;
    public final Object d;

    public ml(Object obj, boolean z4, Object obj2, int i10) {
        this.f29150a = i10;
        this.f29152c = obj;
        this.f29151b = z4;
        this.d = obj2;
    }

    @Override
    public final void run(java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ml.run(java.lang.Object):void");
    }

    public ml(ol olVar, File file, boolean z4) {
        this.f29150a = 0;
        this.f29152c = olVar;
        this.d = file;
        this.f29151b = z4;
    }

    public ml(boolean z4, Object obj, Object obj2, int i10) {
        this.f29150a = i10;
        this.f29151b = z4;
        this.f29152c = obj;
        this.d = obj2;
    }
}
