package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class ml extends zt0 {
    public final ArrayList f39302a;
    public final boolean[] f39303b;
    public final qn f39304c;

    public ml(qn qnVar, ArrayList arrayList, boolean[] zArr) {
        this.f39304c = qnVar;
        this.f39302a = arrayList;
        this.f39303b = zArr;
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
        ArrayList arrayList = this.f39302a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f39303b[size]) {
                arrayList.remove(size);
            }
        }
        this.f39304c.ib(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f39303b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
