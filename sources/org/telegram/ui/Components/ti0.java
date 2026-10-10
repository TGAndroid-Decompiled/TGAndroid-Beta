package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class ti0 extends lq {
    public final ArrayList f31147c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context f31148e;
    public final Paint f31149f;
    public y9 f31150g;
    public final ui0 h;

    public ti0(ui0 ui0Var, Context context, org.telegram.ui.l01 l01Var) {
        this.h = ui0Var;
        this.f31148e = context;
        this.f31150g = l01Var;
        Paint paint = new Paint(1);
        this.f31149f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        qi0 qi0Var = (qi0) obj;
        View view = qi0Var.f30216b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (qi0Var.f30215a) {
            return;
        }
        oi0 oi0Var = qi0Var.f30217c;
        if (oi0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = oi0Var.getImageReceiver().getDrawable();
            if (drawable instanceof f6) {
                ((f6) drawable).w(oi0Var);
            }
        }
        oi0Var.setRoundRadius(0);
        gVar.removeView(oi0Var);
        oi0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f31147c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f31147c.indexOf((qi0) obj);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti0.e(z4.g, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        qi0 qi0Var = (qi0) obj;
        if (qi0Var.f30215a) {
            if (view == qi0Var.f30216b) {
                return true;
            }
            return false;
        } else if (view == qi0Var.f30217c) {
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
        ArrayList arrayList2 = this.f31147c;
        arrayList2.clear();
        arrayList.clear();
        ui0 ui0Var = this.h;
        int size = ui0Var.X0.size();
        if (ui0Var.f31523i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = ui0Var.S0;
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
        ui0 ui0Var = this.h;
        int size = ui0Var.X0.size();
        if (ui0Var.f31523i1) {
            size++;
        }
        if (size >= 2) {
            return ui0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
