package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class ql extends iu0 {
    public final ArrayList f42743a;
    public final boolean[] f42744b;
    public final wn f42745c;

    public ql(wn wnVar, ArrayList arrayList, boolean[] zArr) {
        this.f42745c = wnVar;
        this.f42743a = arrayList;
        this.f42744b = zArr;
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
        ArrayList arrayList = this.f42743a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f42744b[size]) {
                arrayList.remove(size);
            }
        }
        this.f42745c.tb(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f42744b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
