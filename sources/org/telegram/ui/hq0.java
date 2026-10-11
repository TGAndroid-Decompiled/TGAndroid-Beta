package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class hq0 extends org.telegram.ui.Components.rm0 {
    public final Context f38493c;
    public final jq0 d;

    public hq0(jq0 jq0Var, Context context) {
        this.d = jq0Var;
        this.f38493c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        jq0 jq0Var = this.d;
        ArrayList arrayList = jq0Var.d;
        if (arrayList != null) {
            return (int) Math.ceil(arrayList.size() / jq0Var.f39103f);
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) d1Var.f47748a;
        jq0 jq0Var = this.d;
        y5Var.setAlbumsCount(jq0Var.f39103f);
        int i11 = 0;
        while (true) {
            int i12 = jq0Var.f39103f;
            if (i11 < i12) {
                int i13 = (i12 * i10) + i11;
                if (i13 < jq0Var.d.size()) {
                    y5Var.a(i11, (MediaController.AlbumEntry) jq0Var.d.get(i13));
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
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f38493c;
        ?? frameLayout = new FrameLayout(context);
        frameLayout.f23766e = new Paint();
        frameLayout.f23764b = new MediaController.AlbumEntry[4];
        frameLayout.f23763a = new org.telegram.ui.Cells.w5[4];
        for (int i11 = 0; i11 < 4; i11++) {
            frameLayout.f23763a[i11] = new org.telegram.ui.Cells.w5(frameLayout, context);
            frameLayout.addView(frameLayout.f23763a[i11]);
            frameLayout.f23763a[i11].setVisibility(4);
            frameLayout.f23763a[i11].setTag(Integer.valueOf(i11));
            frameLayout.f23763a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 9));
        }
        frameLayout.setDelegate(new gq0(this, 0));
        return new s4.d1(frameLayout);
    }
}
