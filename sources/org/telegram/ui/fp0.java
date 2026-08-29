package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class fp0 extends org.telegram.ui.Components.il0 {
    public final Context f38221c;
    public final hp0 d;

    public fp0(hp0 hp0Var, Context context) {
        this.d = hp0Var;
        this.f38221c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override
    public final int h() {
        hp0 hp0Var = this.d;
        ArrayList arrayList = hp0Var.d;
        if (arrayList != null) {
            return (int) Math.ceil(arrayList.size() / hp0Var.f38988f);
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        org.telegram.ui.Cells.w5 w5Var = (org.telegram.ui.Cells.w5) n1Var.f6432a;
        hp0 hp0Var = this.d;
        w5Var.setAlbumsCount(hp0Var.f38988f);
        int i11 = 0;
        while (true) {
            int i12 = hp0Var.f38988f;
            if (i11 < i12) {
                int i13 = (i12 * i10) + i11;
                if (i13 < hp0Var.d.size()) {
                    w5Var.a(i11, (MediaController.AlbumEntry) hp0Var.d.get(i13));
                } else {
                    w5Var.a(i11, null);
                }
                i11++;
            } else {
                w5Var.requestLayout();
                return;
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f38221c;
        ?? frameLayout = new FrameLayout(context);
        frameLayout.f25869e = new Paint();
        frameLayout.f25867b = new MediaController.AlbumEntry[4];
        frameLayout.f25866a = new org.telegram.ui.Cells.u5[4];
        for (int i11 = 0; i11 < 4; i11++) {
            frameLayout.f25866a[i11] = new org.telegram.ui.Cells.u5(frameLayout, context);
            frameLayout.addView(frameLayout.f25866a[i11]);
            frameLayout.f25866a[i11].setVisibility(4);
            frameLayout.f25866a[i11].setTag(Integer.valueOf(i11));
            frameLayout.f25866a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 9));
        }
        frameLayout.setDelegate(new zk0(this, 1));
        return new f2.n1(frameLayout);
    }
}
