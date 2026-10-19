package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class ml extends zt0 {
    public final ArrayList f39306a;
    public final boolean[] f39307b;
    public final qn f39308c;

    public ml(qn qnVar, ArrayList arrayList, boolean[] zArr) {
        this.f39308c = qnVar;
        this.f39306a = arrayList;
        this.f39307b = zArr;
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
        ArrayList arrayList = this.f39306a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f39307b[size]) {
                arrayList.remove(size);
            }
        }
        this.f39308c.ib(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f39307b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
