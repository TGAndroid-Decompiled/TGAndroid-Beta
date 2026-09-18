package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class yh0 extends vp {
    public final ArrayList f30581c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f30582f;
    public w9 f30583g;
    public final zh0 h;

    public yh0(zh0 zh0Var, Context context, org.telegram.ui.m01 m01Var) {
        this.h = zh0Var;
        this.e = context;
        this.f30583g = m01Var;
        Paint paint = new Paint(1);
        this.f30582f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        vh0 vh0Var = (vh0) obj;
        View view = vh0Var.f29002b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (vh0Var.f29001a) {
            return;
        }
        th0 th0Var = vh0Var.f29003c;
        if (th0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = th0Var.getImageReceiver().getDrawable();
            if (drawable instanceof d6) {
                ((d6) drawable).w(th0Var);
            }
        }
        th0Var.setRoundRadius(0);
        gVar.removeView(th0Var);
        th0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f30581c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f30581c.indexOf((vh0) obj);
        if (indexOf == -1) {
            return -2;
        }
        return indexOf;
    }

    @Override
    public final CharSequence d(int i10) {
        int count;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k(i10) + 1);
        sb2.append("/");
        MessagesController.DialogPhotos dialogPhotos = this.h.S0;
        if (dialogPhotos == null) {
            count = 0;
        } else {
            count = dialogPhotos.getCount();
        }
        sb2.append(count);
        return sb2.toString();
    }

    @Override
    public final java.lang.Object e(z4.g r42, int r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yh0.e(z4.g, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        vh0 vh0Var = (vh0) obj;
        if (vh0Var.f29001a) {
            if (view == vh0Var.f29002b) {
                return true;
            }
            return false;
        } else if (view == vh0Var.f29003c) {
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
                ((w9) arrayList.get(i10)).getImageReceiver().cancelLoadImage();
            }
            i10++;
        }
        ArrayList arrayList2 = this.f30581c;
        arrayList2.clear();
        arrayList.clear();
        zh0 zh0Var = this.h;
        int size = zh0Var.X0.size();
        if (zh0Var.f30811i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = zh0Var.S0;
        if (dialogPhotos == null) {
            count = 0;
        } else {
            count = dialogPhotos.getCount();
        }
        int j3 = (j() * 2) + Math.max(count, size);
        for (int i11 = 0; i11 < j3; i11++) {
            arrayList2.add(new Object());
            arrayList.add(null);
        }
        super.g();
    }

    @Override
    public final int j() {
        zh0 zh0Var = this.h;
        int size = zh0Var.X0.size();
        if (zh0Var.f30811i1) {
            size++;
        }
        if (size >= 2) {
            return zh0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
