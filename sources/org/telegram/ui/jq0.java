package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class jq0 extends org.telegram.ui.Components.xl0 {
    public final Context f34997c;
    public final lq0 d;

    public jq0(lq0 lq0Var, Context context) {
        this.d = lq0Var;
        this.f34997c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        lq0 lq0Var = this.d;
        ArrayList arrayList = lq0Var.d;
        if (arrayList != null) {
            return (int) Math.ceil(arrayList.size() / lq0Var.f35531f);
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) c1Var.f42995a;
        lq0 lq0Var = this.d;
        z5Var.setAlbumsCount(lq0Var.f35531f);
        int i11 = 0;
        while (true) {
            int i12 = lq0Var.f35531f;
            if (i11 < i12) {
                int i13 = (i12 * i10) + i11;
                if (i13 < lq0Var.d.size()) {
                    z5Var.a(i11, (MediaController.AlbumEntry) lq0Var.d.get(i13));
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
        Context context = this.f34997c;
        ?? frameLayout = new FrameLayout(context);
        frameLayout.e = new Paint();
        frameLayout.f21931b = new MediaController.AlbumEntry[4];
        frameLayout.f21930a = new org.telegram.ui.Cells.x5[4];
        for (int i11 = 0; i11 < 4; i11++) {
            frameLayout.f21930a[i11] = new org.telegram.ui.Cells.x5(frameLayout, context);
            frameLayout.addView(frameLayout.f21930a[i11]);
            frameLayout.f21930a[i11].setVisibility(4);
            frameLayout.f21930a[i11].setTag(Integer.valueOf(i11));
            frameLayout.f21930a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 9));
        }
        frameLayout.setDelegate(new ol0(this, 2));
        return new s4.c1(frameLayout);
    }
}
