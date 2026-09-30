package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class bi0 extends yp {
    public final ArrayList f22945c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f22946f;
    public w9 f22947g;
    public final ci0 h;

    public bi0(ci0 ci0Var, Context context, org.telegram.ui.d01 d01Var) {
        this.h = ci0Var;
        this.e = context;
        this.f22947g = d01Var;
        Paint paint = new Paint(1);
        this.f22946f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        yh0 yh0Var = (yh0) obj;
        View view = yh0Var.f30717b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (yh0Var.f30716a) {
            return;
        }
        wh0 wh0Var = yh0Var.f30718c;
        if (wh0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = wh0Var.getImageReceiver().getDrawable();
            if (drawable instanceof d6) {
                ((d6) drawable).w(wh0Var);
            }
        }
        wh0Var.setRoundRadius(0);
        gVar.removeView(wh0Var);
        wh0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f22945c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f22945c.indexOf((yh0) obj);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bi0.e(z4.g, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        yh0 yh0Var = (yh0) obj;
        if (yh0Var.f30716a) {
            if (view == yh0Var.f30717b) {
                return true;
            }
            return false;
        } else if (view == yh0Var.f30718c) {
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
        ArrayList arrayList2 = this.f22945c;
        arrayList2.clear();
        arrayList.clear();
        ci0 ci0Var = this.h;
        int size = ci0Var.X0.size();
        if (ci0Var.f23330i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = ci0Var.S0;
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
        ci0 ci0Var = this.h;
        int size = ci0Var.X0.size();
        if (ci0Var.f23330i1) {
            size++;
        }
        if (size >= 2) {
            return ci0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
