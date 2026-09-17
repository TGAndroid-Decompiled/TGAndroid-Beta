package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class jq0 extends org.telegram.ui.Components.ll0 {
    public final Context f34918c;
    public final lq0 d;

    public jq0(lq0 lq0Var, Context context) {
        this.d = lq0Var;
        this.f34918c = context;
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
            return (int) Math.ceil(arrayList.size() / lq0Var.f35603f);
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) c1Var.f42697a;
        lq0 lq0Var = this.d;
        x5Var.setAlbumsCount(lq0Var.f35603f);
        int i11 = 0;
        while (true) {
            int i12 = lq0Var.f35603f;
            if (i11 < i12) {
                int i13 = (i12 * i10) + i11;
                if (i13 < lq0Var.d.size()) {
                    x5Var.a(i11, (MediaController.AlbumEntry) lq0Var.d.get(i13));
                } else {
                    x5Var.a(i11, null);
                }
                i11++;
            } else {
                x5Var.requestLayout();
                return;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f34918c;
        ?? frameLayout = new FrameLayout(context);
        frameLayout.e = new Paint();
        frameLayout.f21634b = new MediaController.AlbumEntry[4];
        frameLayout.f21633a = new org.telegram.ui.Cells.v5[4];
        for (int i11 = 0; i11 < 4; i11++) {
            frameLayout.f21633a[i11] = new org.telegram.ui.Cells.v5(frameLayout, context);
            frameLayout.addView(frameLayout.f21633a[i11]);
            frameLayout.f21633a[i11].setVisibility(4);
            frameLayout.f21633a[i11].setTag(Integer.valueOf(i11));
            frameLayout.f21633a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 9));
        }
        frameLayout.setDelegate(new nl0(this, 2));
        return new s4.c1(frameLayout);
    }
}
