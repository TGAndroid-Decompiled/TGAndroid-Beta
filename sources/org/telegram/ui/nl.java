package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class nl extends cu0 {
    public final ArrayList f39922a;
    public final boolean[] f39923b;
    public final sn f39924c;

    public nl(sn snVar, ArrayList arrayList, boolean[] zArr) {
        this.f39924c = snVar;
        this.f39922a = arrayList;
        this.f39923b = zArr;
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ArrayList arrayList = this.f39922a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f39923b[size]) {
                arrayList.remove(size);
            }
        }
        this.f39924c.kb(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f39923b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
