package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class ml extends pt0 {
    public final ArrayList f40595a;
    public final boolean[] f40596b;
    public final tn f40597c;

    public ml(tn tnVar, ArrayList arrayList, boolean[] zArr) {
        this.f40597c = tnVar;
        this.f40595a = arrayList;
        this.f40596b = zArr;
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
        ArrayList arrayList = this.f40595a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f40596b[size]) {
                arrayList.remove(size);
            }
        }
        this.f40597c.eb(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f40596b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
