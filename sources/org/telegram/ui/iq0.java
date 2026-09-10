package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class iq0 extends org.telegram.ui.Components.ul0 {
    public final Context f33782c;
    public final kq0 d;

    public iq0(kq0 kq0Var, Context context) {
        this.d = kq0Var;
        this.f33782c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        kq0 kq0Var = this.d;
        ArrayList arrayList = kq0Var.d;
        if (arrayList != null) {
            return (int) Math.ceil(arrayList.size() / kq0Var.f34441f);
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) c1Var.f41610a;
        kq0 kq0Var = this.d;
        z5Var.setAlbumsCount(kq0Var.f34441f);
        int i11 = 0;
        while (true) {
            int i12 = kq0Var.f34441f;
            if (i11 < i12) {
                int i13 = (i12 * i10) + i11;
                if (i13 < kq0Var.d.size()) {
                    z5Var.a(i11, (MediaController.AlbumEntry) kq0Var.d.get(i13));
                } else {
                    z5Var.a(i11, null);
                }
                i11++;
            } else {
                z5Var.requestLayout();
                return;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f33782c;
        ?? frameLayout = new FrameLayout(context);
        frameLayout.e = new Paint();
        frameLayout.f20785b = new MediaController.AlbumEntry[4];
        frameLayout.f20784a = new org.telegram.ui.Cells.x5[4];
        for (int i11 = 0; i11 < 4; i11++) {
            frameLayout.f20784a[i11] = new org.telegram.ui.Cells.x5(frameLayout, context);
            frameLayout.addView(frameLayout.f20784a[i11]);
            frameLayout.f20784a[i11].setVisibility(4);
            frameLayout.f20784a[i11].setTag(Integer.valueOf(i11));
            frameLayout.f20784a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 9));
        }
        frameLayout.setDelegate(new ul0(this, 1));
        return new s4.c1(frameLayout);
    }
}
