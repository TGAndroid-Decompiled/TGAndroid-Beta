package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;

public final class ll extends st0 {

    public final ArrayList f40151a;

    public final boolean[] f40152b;

    public final rn f40153c;

    public ll(rn rnVar, ArrayList arrayList, boolean[] zArr) {
        this.f40153c = rnVar;
        this.f40151a = arrayList;
        this.f40152b = zArr;
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ArrayList arrayList = this.f40151a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f40152b[size]) {
                arrayList.remove(size);
            }
        }
        this.f40153c.eb(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f40152b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
