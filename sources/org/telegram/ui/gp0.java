package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class gp0 extends org.telegram.ui.Components.vk0 {
    public final Context f38589c;
    public final ip0 d;

    public gp0(ip0 ip0Var, Context context) {
        this.d = ip0Var;
        this.f38589c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override
    public final int h() {
        ip0 ip0Var = this.d;
        ArrayList arrayList = ip0Var.d;
        if (arrayList != null) {
            return (int) Math.ceil(arrayList.size() / ip0Var.f39243f);
        }
        return 0;
    }

    @Override
    public final int j(int i9) {
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) q1Var.f5501a;
        ip0 ip0Var = this.d;
        y5Var.setAlbumsCount(ip0Var.f39243f);
        int i10 = 0;
        while (true) {
            int i11 = ip0Var.f39243f;
            if (i10 < i11) {
                int i12 = (i11 * i9) + i10;
                if (i12 < ip0Var.d.size()) {
                    y5Var.a(i10, (MediaController.AlbumEntry) ip0Var.d.get(i12));
                } else {
                    y5Var.a(i10, null);
                }
                i10++;
            } else {
                y5Var.requestLayout();
                return;
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        Context context = this.f38589c;
        ?? frameLayout = new FrameLayout(context);
        frameLayout.f25994e = new Paint();
        frameLayout.f25992b = new MediaController.AlbumEntry[4];
        frameLayout.f25991a = new org.telegram.ui.Cells.w5[4];
        for (int i10 = 0; i10 < 4; i10++) {
            frameLayout.f25991a[i10] = new org.telegram.ui.Cells.w5(frameLayout, context);
            frameLayout.addView(frameLayout.f25991a[i10]);
            frameLayout.f25991a[i10].setVisibility(4);
            frameLayout.f25991a[i10].setTag(Integer.valueOf(i10));
            frameLayout.f25991a[i10].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 9));
        }
        frameLayout.setDelegate(new dl0(this, 1));
        return new f2.q1(frameLayout);
    }
}
