package org.telegram.ui.Components;

import java.io.File;
import org.telegram.messenger.Utilities;
public final class ml implements Utilities.Callback {
    public final int f29149a;
    public final boolean f29150b;
    public final Object f29151c;
    public final Object d;

    public ml(Object obj, boolean z4, Object obj2, int i10) {
        this.f29149a = i10;
        this.f29151c = obj;
        this.f29150b = z4;
        this.d = obj2;
    }

    @Override
    public final void run(java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ml.run(java.lang.Object):void");
    }

    public ml(ol olVar, File file, boolean z4) {
        this.f29149a = 0;
        this.f29151c = olVar;
        this.d = file;
        this.f29150b = z4;
    }

    public ml(boolean z4, Object obj, Object obj2, int i10) {
        this.f29149a = i10;
        this.f29150b = z4;
        this.f29151c = obj;
        this.d = obj2;
    }
}
