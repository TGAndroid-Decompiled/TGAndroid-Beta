package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class ai0 extends vp {
    public final ArrayList f22664c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f22665f;
    public v9 f22666g;
    public final bi0 h;

    public ai0(bi0 bi0Var, Context context, org.telegram.ui.m01 m01Var) {
        this.h = bi0Var;
        this.e = context;
        this.f22666g = m01Var;
        Paint paint = new Paint(1);
        this.f22665f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        xh0 xh0Var = (xh0) obj;
        View view = xh0Var.f30323b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (xh0Var.f30322a) {
            return;
        }
        vh0 vh0Var = xh0Var.f30324c;
        if (vh0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = vh0Var.getImageReceiver().getDrawable();
            if (drawable instanceof c6) {
                ((c6) drawable).w(vh0Var);
            }
        }
        vh0Var.setRoundRadius(0);
        gVar.removeView(vh0Var);
        vh0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f22664c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f22664c.indexOf((xh0) obj);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ai0.e(z4.g, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        xh0 xh0Var = (xh0) obj;
        if (xh0Var.f30322a) {
            if (view == xh0Var.f30323b) {
                return true;
            }
            return false;
        } else if (view == xh0Var.f30324c) {
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
                ((v9) arrayList.get(i10)).getImageReceiver().cancelLoadImage();
            }
            i10++;
        }
        ArrayList arrayList2 = this.f22664c;
        arrayList2.clear();
        arrayList.clear();
        bi0 bi0Var = this.h;
        int size = bi0Var.X0.size();
        if (bi0Var.f23008i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = bi0Var.S0;
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
        bi0 bi0Var = this.h;
        int size = bi0Var.X0.size();
        if (bi0Var.f23008i1) {
            size++;
        }
        if (size >= 2) {
            return bi0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
