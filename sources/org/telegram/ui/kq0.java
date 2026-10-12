package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class kq0 extends org.telegram.ui.Components.vm0 {
    public final Context f39566c;
    public final mq0 d;

    public kq0(mq0 mq0Var, Context context) {
        this.d = mq0Var;
        this.f39566c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        mq0 mq0Var = this.d;
        ArrayList arrayList = mq0Var.d;
        if (arrayList != null) {
            return (int) Math.ceil(arrayList.size() / mq0Var.f40114f);
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) d1Var.f47897a;
        mq0 mq0Var = this.d;
        y5Var.setAlbumsCount(mq0Var.f40114f);
        int i11 = 0;
        while (true) {
            int i12 = mq0Var.f40114f;
            if (i11 < i12) {
                int i13 = (i12 * i10) + i11;
                if (i13 < mq0Var.d.size()) {
                    y5Var.a(i11, (MediaController.AlbumEntry) mq0Var.d.get(i13));
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
        Context context = this.f39566c;
        ?? frameLayout = new FrameLayout(context);
        frameLayout.f23540e = new Paint();
        frameLayout.f23538b = new MediaController.AlbumEntry[4];
        frameLayout.f23537a = new org.telegram.ui.Cells.w5[4];
        for (int i11 = 0; i11 < 4; i11++) {
            frameLayout.f23537a[i11] = new org.telegram.ui.Cells.w5(frameLayout, context);
            frameLayout.addView(frameLayout.f23537a[i11]);
            frameLayout.f23537a[i11].setVisibility(4);
            frameLayout.f23537a[i11].setTag(Integer.valueOf(i11));
            frameLayout.f23537a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 9));
        }
        frameLayout.setDelegate(new jq0(this, 0));
        return new s4.d1(frameLayout);
    }
}
