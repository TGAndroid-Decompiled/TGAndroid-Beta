package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class wh0 extends vp {
    public final ArrayList f32750c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context f32751e;
    public final Paint f32752f;
    public p9 f32753g;
    public final xh0 h;

    public wh0(xh0 xh0Var, Context context, org.telegram.ui.vz0 vz0Var) {
        this.h = xh0Var;
        this.f32751e = context;
        this.f32753g = vz0Var;
        Paint paint = new Paint(1);
        this.f32752f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(m2.h hVar, Object obj) {
        th0 th0Var = (th0) obj;
        View view = th0Var.f31341b;
        if (view != null) {
            hVar.removeView(view);
        }
        if (th0Var.f31340a) {
            return;
        }
        rh0 rh0Var = th0Var.f31342c;
        if (rh0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = rh0Var.getImageReceiver().getDrawable();
            if (drawable instanceof y5) {
                ((y5) drawable).w(rh0Var);
            }
        }
        rh0Var.setRoundRadius(0);
        hVar.removeView(rh0Var);
        rh0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f32750c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f32750c.indexOf((th0) obj);
        if (indexOf == -1) {
            return -2;
        }
        return indexOf;
    }

    @Override
    public final CharSequence d(int i10) {
        int count;
        StringBuilder sb = new StringBuilder();
        sb.append(k(i10) + 1);
        sb.append("/");
        MessagesController.DialogPhotos dialogPhotos = this.h.P0;
        if (dialogPhotos == null) {
            count = 0;
        } else {
            count = dialogPhotos.getCount();
        }
        sb.append(count);
        return sb.toString();
    }

    @Override
    public final java.lang.Object e(m2.h r42, int r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wh0.e(m2.h, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        th0 th0Var = (th0) obj;
        if (th0Var.f31340a) {
            if (view == th0Var.f31341b) {
                return true;
            }
            return false;
        } else if (view == th0Var.f31342c) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final void g() {
        ArrayList arrayList;
        int count;
        int i10 = 0;
        while (true) {
            arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((p9) arrayList.get(i10)).getImageReceiver().cancelLoadImage();
            }
            i10++;
        }
        ArrayList arrayList2 = this.f32750c;
        arrayList2.clear();
        arrayList.clear();
        xh0 xh0Var = this.h;
        int size = xh0Var.U0.size();
        if (xh0Var.f33088f1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = xh0Var.P0;
        if (dialogPhotos == null) {
            count = 0;
        } else {
            count = dialogPhotos.getCount();
        }
        int j10 = (j() * 2) + Math.max(count, size);
        for (int i11 = 0; i11 < j10; i11++) {
            arrayList2.add(new Object());
            arrayList.add(null);
        }
        super.g();
    }

    @Override
    public final int j() {
        xh0 xh0Var = this.h;
        int size = xh0Var.U0.size();
        if (xh0Var.f33088f1) {
            size++;
        }
        if (size >= 2) {
            return xh0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
