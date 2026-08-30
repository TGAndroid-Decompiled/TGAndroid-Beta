package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class uh0 extends tp {
    public final ArrayList f29222c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f29223f;
    public p9 f29224g;
    public final vh0 h;

    public uh0(vh0 vh0Var, Context context, org.telegram.ui.tz0 tz0Var) {
        this.h = vh0Var;
        this.e = context;
        this.f29224g = tz0Var;
        Paint paint = new Paint(1);
        this.f29223f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(m2.h hVar, Object obj) {
        rh0 rh0Var = (rh0) obj;
        View view = rh0Var.f28468b;
        if (view != null) {
            hVar.removeView(view);
        }
        if (rh0Var.f28467a) {
            return;
        }
        ph0 ph0Var = rh0Var.f28469c;
        if (ph0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = ph0Var.getImageReceiver().getDrawable();
            if (drawable instanceof y5) {
                ((y5) drawable).w(ph0Var);
            }
        }
        ph0Var.setRoundRadius(0);
        hVar.removeView(ph0Var);
        ph0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f29222c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f29222c.indexOf((rh0) obj);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uh0.e(m2.h, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        rh0 rh0Var = (rh0) obj;
        if (rh0Var.f28467a) {
            if (view == rh0Var.f28468b) {
                return true;
            }
            return false;
        } else if (view == rh0Var.f28469c) {
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
        ArrayList arrayList2 = this.f29222c;
        arrayList2.clear();
        arrayList.clear();
        vh0 vh0Var = this.h;
        int size = vh0Var.U0.size();
        if (vh0Var.f29476f1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = vh0Var.P0;
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
        vh0 vh0Var = this.h;
        int size = vh0Var.U0.size();
        if (vh0Var.f29476f1) {
            size++;
        }
        if (size >= 2) {
            return vh0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
