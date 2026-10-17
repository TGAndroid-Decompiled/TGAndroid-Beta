package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class ol extends bu0 {
    public final ArrayList f39841a;
    public final boolean[] f39842b;
    public final sn f39843c;

    public ol(sn snVar, ArrayList arrayList, boolean[] zArr) {
        this.f39843c = snVar;
        this.f39841a = arrayList;
        this.f39842b = zArr;
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
        ArrayList arrayList = this.f39841a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f39842b[size]) {
                arrayList.remove(size);
            }
        }
        this.f39843c.ib(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f39842b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
