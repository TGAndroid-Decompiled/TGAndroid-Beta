package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class np0 extends org.telegram.ui.Components.rl0 {
    public final Context f36706c;
    public final pp0 d;

    public np0(pp0 pp0Var, Context context) {
        this.d = pp0Var;
        this.f36706c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override
    public final int h() {
        pp0 pp0Var = this.d;
        ArrayList arrayList = pp0Var.d;
        if (arrayList != null) {
            return (int) Math.ceil(arrayList.size() / pp0Var.f37430f);
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) l1Var.f5785a;
        pp0 pp0Var = this.d;
        y5Var.setAlbumsCount(pp0Var.f37430f);
        int i11 = 0;
        while (true) {
            int i12 = pp0Var.f37430f;
            if (i11 < i12) {
                int i13 = (i12 * i10) + i11;
                if (i13 < pp0Var.d.size()) {
                    y5Var.a(i11, (MediaController.AlbumEntry) pp0Var.d.get(i13));
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
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f36706c;
        ?? frameLayout = new FrameLayout(context);
        frameLayout.e = new Paint();
        frameLayout.f22616b = new MediaController.AlbumEntry[4];
        frameLayout.f22615a = new org.telegram.ui.Cells.w5[4];
        for (int i11 = 0; i11 < 4; i11++) {
            frameLayout.f22615a[i11] = new org.telegram.ui.Cells.w5(frameLayout, context);
            frameLayout.addView(frameLayout.f22615a[i11]);
            frameLayout.f22615a[i11].setVisibility(4);
            frameLayout.f22615a[i11].setTag(Integer.valueOf(i11));
            frameLayout.f22615a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 9));
        }
        frameLayout.setDelegate(new il0(this, 1));
        return new f2.l1(frameLayout);
    }
}
