package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

public final class hp0 extends org.telegram.ui.Components.yk0 {

    public final Context f38879c;
    public final jp0 d;

    public hp0(jp0 jp0Var, Context context) {
        this.d = jp0Var;
        this.f38879c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override
    public final int h() {
        jp0 jp0Var = this.d;
        ArrayList arrayList = jp0Var.d;
        if (arrayList != null) {
            return (int) Math.ceil(arrayList.size() / jp0Var.f39465f);
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) o1Var.f5789a;
        jp0 jp0Var = this.d;
        v5Var.setAlbumsCount(jp0Var.f39465f);
        int i11 = 0;
        while (true) {
            int i12 = jp0Var.f39465f;
            if (i11 >= i12) {
                v5Var.requestLayout();
                return;
            }
            int i13 = (i12 * i10) + i11;
            if (i13 < jp0Var.d.size()) {
                v5Var.a(i11, (MediaController.AlbumEntry) jp0Var.d.get(i13));
            } else {
                v5Var.a(i11, null);
            }
            i11++;
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f38879c;
        org.telegram.ui.Cells.v5 v5Var = new org.telegram.ui.Cells.v5(context);
        v5Var.f25808e = new Paint();
        v5Var.f25806b = new MediaController.AlbumEntry[4];
        v5Var.f25805a = new org.telegram.ui.Cells.t5[4];
        for (int i11 = 0; i11 < 4; i11++) {
            v5Var.f25805a[i11] = new org.telegram.ui.Cells.t5(v5Var, context);
            v5Var.addView(v5Var.f25805a[i11]);
            v5Var.f25805a[i11].setVisibility(4);
            v5Var.f25805a[i11].setTag(Integer.valueOf(i11));
            v5Var.f25805a[i11].setOnClickListener(new org.telegram.ui.Cells.a(v5Var, 9));
        }
        v5Var.setDelegate(new dl0(this, 1));
        return new org.telegram.ui.Components.lk0(v5Var);
    }
}
