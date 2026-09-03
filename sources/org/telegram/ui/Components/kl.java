package org.telegram.ui.Components;

import java.io.File;
import org.telegram.messenger.Utilities;
public final class kl implements Utilities.Callback {
    public final int f26327a;
    public final boolean f26328b;
    public final Object f26329c;
    public final Object d;

    public kl(Object obj, boolean z4, Object obj2, int i10) {
        this.f26327a = i10;
        this.f26329c = obj;
        this.f26328b = z4;
        this.d = obj2;
    }

    @Override
    public final void run(java.lang.Object r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kl.run(java.lang.Object):void");
    }

    public kl(ml mlVar, File file, boolean z4) {
        this.f26327a = 0;
        this.f26329c = mlVar;
        this.d = file;
        this.f26328b = z4;
    }

    public kl(boolean z4, Object obj, Object obj2, int i10) {
        this.f26327a = i10;
        this.f26328b = z4;
        this.f26329c = obj;
        this.d = obj2;
    }
}
