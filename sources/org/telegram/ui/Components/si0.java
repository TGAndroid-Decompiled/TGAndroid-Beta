package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class si0 extends lq {
    public final ArrayList f30808c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context f30809e;
    public final Paint f30810f;
    public y9 f30811g;
    public final ti0 h;

    public si0(ti0 ti0Var, Context context, org.telegram.ui.l01 l01Var) {
        this.h = ti0Var;
        this.f30809e = context;
        this.f30811g = l01Var;
        Paint paint = new Paint(1);
        this.f30810f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        pi0 pi0Var = (pi0) obj;
        View view = pi0Var.f29868b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (pi0Var.f29867a) {
            return;
        }
        ni0 ni0Var = pi0Var.f29869c;
        if (ni0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = ni0Var.getImageReceiver().getDrawable();
            if (drawable instanceof f6) {
                ((f6) drawable).w(ni0Var);
            }
        }
        ni0Var.setRoundRadius(0);
        gVar.removeView(ni0Var);
        ni0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f30808c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f30808c.indexOf((pi0) obj);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.si0.e(z4.g, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        pi0 pi0Var = (pi0) obj;
        if (pi0Var.f29867a) {
            if (view == pi0Var.f29868b) {
                return true;
            }
            return false;
        } else if (view == pi0Var.f29869c) {
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
                ((y9) arrayList.get(i10)).getImageReceiver().cancelLoadImage();
            }
            i10++;
        }
        ArrayList arrayList2 = this.f30808c;
        arrayList2.clear();
        arrayList.clear();
        ti0 ti0Var = this.h;
        int size = ti0Var.X0.size();
        if (ti0Var.f31198i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = ti0Var.S0;
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
        ti0 ti0Var = this.h;
        int size = ti0Var.X0.size();
        if (ti0Var.f31198i1) {
            size++;
        }
        if (size >= 2) {
            return ti0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
