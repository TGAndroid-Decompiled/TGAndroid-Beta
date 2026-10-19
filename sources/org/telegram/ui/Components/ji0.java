package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class ji0 extends fq {
    public final ArrayList f27535c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f27536f;
    public w9 f27537g;
    public final ki0 h;

    public ji0(ki0 ki0Var, Context context, org.telegram.ui.oz0 oz0Var) {
        this.h = ki0Var;
        this.e = context;
        this.f27537g = oz0Var;
        Paint paint = new Paint(1);
        this.f27536f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gi0 gi0Var = (gi0) obj;
        View view = gi0Var.f26597b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (gi0Var.f26596a) {
            return;
        }
        ei0 ei0Var = gi0Var.f26598c;
        if (ei0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = ei0Var.getImageReceiver().getDrawable();
            if (drawable instanceof e6) {
                ((e6) drawable).w(ei0Var);
            }
        }
        ei0Var.setRoundRadius(0);
        gVar.removeView(ei0Var);
        ei0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f27535c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f27535c.indexOf((gi0) obj);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ji0.e(z4.g, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        gi0 gi0Var = (gi0) obj;
        if (gi0Var.f26596a) {
            if (view == gi0Var.f26597b) {
                return true;
            }
            return false;
        } else if (view == gi0Var.f26598c) {
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
        ArrayList arrayList2 = this.f27535c;
        arrayList2.clear();
        arrayList.clear();
        ki0 ki0Var = this.h;
        int size = ki0Var.X0.size();
        if (ki0Var.f27871i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = ki0Var.S0;
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
        ki0 ki0Var = this.h;
        int size = ki0Var.X0.size();
        if (ki0Var.f27871i1) {
            size++;
        }
        if (size >= 2) {
            return ki0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
