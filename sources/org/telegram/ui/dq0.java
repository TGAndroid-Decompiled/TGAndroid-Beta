package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class dq0 extends org.telegram.ui.Components.yl0 {
    public final Context f35824c;
    public final fq0 d;

    public dq0(fq0 fq0Var, Context context) {
        this.d = fq0Var;
        this.f35824c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        fq0 fq0Var = this.d;
        ArrayList arrayList = fq0Var.d;
        if (arrayList != null) {
            return (int) Math.ceil(arrayList.size() / fq0Var.f36364f);
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) c1Var.f46523a;
        fq0 fq0Var = this.d;
        y5Var.setAlbumsCount(fq0Var.f36364f);
        int i11 = 0;
        while (true) {
            int i12 = fq0Var.f36364f;
            if (i11 < i12) {
                int i13 = (i12 * i10) + i11;
                if (i13 < fq0Var.d.size()) {
                    y5Var.a(i11, (MediaController.AlbumEntry) fq0Var.d.get(i13));
                } else {
                    y5Var.a(i11, null);
                }
                i11++;
            } else {
                y5Var.requestLayout();
                return;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f35824c;
        ?? frameLayout = new FrameLayout(context);
        frameLayout.f23765e = new Paint();
        frameLayout.f23763b = new MediaController.AlbumEntry[4];
        frameLayout.f23762a = new org.telegram.ui.Cells.w5[4];
        for (int i11 = 0; i11 < 4; i11++) {
            frameLayout.f23762a[i11] = new org.telegram.ui.Cells.w5(frameLayout, context);
            frameLayout.addView(frameLayout.f23762a[i11]);
            frameLayout.f23762a[i11].setVisibility(4);
            frameLayout.f23762a[i11].setTag(Integer.valueOf(i11));
            frameLayout.f23762a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 9));
        }
        frameLayout.setDelegate(new jl0(this, 2));
        return new s4.c1(frameLayout);
    }
}
