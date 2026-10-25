package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class ol extends gu0 {
    public final ArrayList f42239a;
    public final boolean[] f42240b;
    public final un f42241c;

    public ol(un unVar, ArrayList arrayList, boolean[] zArr) {
        this.f42241c = unVar;
        this.f42239a = arrayList;
        this.f42240b = zArr;
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
        ArrayList arrayList = this.f42239a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f42240b[size]) {
                arrayList.remove(size);
            }
        }
        this.f42241c.pb(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f42240b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
