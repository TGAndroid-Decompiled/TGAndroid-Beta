package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class ai0 extends xp {
    public final ArrayList f22658c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f22659f;
    public w9 f22660g;
    public final bi0 h;

    public ai0(bi0 bi0Var, Context context, org.telegram.ui.d01 d01Var) {
        this.h = bi0Var;
        this.e = context;
        this.f22660g = d01Var;
        Paint paint = new Paint(1);
        this.f22659f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        xh0 xh0Var = (xh0) obj;
        View view = xh0Var.f30381b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (xh0Var.f30380a) {
            return;
        }
        vh0 vh0Var = xh0Var.f30382c;
        if (vh0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = vh0Var.getImageReceiver().getDrawable();
            if (drawable instanceof d6) {
                ((d6) drawable).w(vh0Var);
            }
        }
        vh0Var.setRoundRadius(0);
        gVar.removeView(vh0Var);
        vh0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f22658c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f22658c.indexOf((xh0) obj);
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
        if (xh0Var.f30380a) {
            if (view == xh0Var.f30381b) {
                return true;
            }
            return false;
        } else if (view == xh0Var.f30382c) {
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
        ArrayList arrayList2 = this.f22658c;
        arrayList2.clear();
        arrayList.clear();
        bi0 bi0Var = this.h;
        int size = bi0Var.X0.size();
        if (bi0Var.f22986i1) {
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
        if (bi0Var.f22986i1) {
            size++;
        }
        if (size >= 2) {
            return bi0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
