package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class jl extends rt0 {
    public final ArrayList f39523a;
    public final boolean[] f39524b;
    public final qn f39525c;

    public jl(qn qnVar, ArrayList arrayList, boolean[] zArr) {
        this.f39525c = qnVar;
        this.f39523a = arrayList;
        this.f39524b = zArr;
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i9) {
        return null;
    }

    @Override
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        ArrayList arrayList = this.f39523a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f39524b[size]) {
                arrayList.remove(size);
            }
        }
        this.f39525c.eb(arrayList, i10, z10, z11);
    }

    @Override
    public final boolean x(int i9) {
        return this.f39524b[i9];
    }

    @Override
    public final int k(int i9, VideoEditedInfo videoEditedInfo) {
        return i9;
    }
}
