package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class ui0 extends lq {
    public final ArrayList f31461c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context f31462e;
    public final Paint f31463f;
    public y9 f31464g;
    public final vi0 h;

    public ui0(vi0 vi0Var, Context context, org.telegram.ui.k01 k01Var) {
        this.h = vi0Var;
        this.f31462e = context;
        this.f31464g = k01Var;
        Paint paint = new Paint(1);
        this.f31463f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        ri0 ri0Var = (ri0) obj;
        View view = ri0Var.f30463b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (ri0Var.f30462a) {
            return;
        }
        pi0 pi0Var = ri0Var.f30464c;
        if (pi0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = pi0Var.getImageReceiver().getDrawable();
            if (drawable instanceof f6) {
                ((f6) drawable).w(pi0Var);
            }
        }
        pi0Var.setRoundRadius(0);
        gVar.removeView(pi0Var);
        pi0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f31461c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f31461c.indexOf((ri0) obj);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ui0.e(z4.g, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        ri0 ri0Var = (ri0) obj;
        if (ri0Var.f30462a) {
            if (view == ri0Var.f30463b) {
                return true;
            }
            return false;
        } else if (view == ri0Var.f30464c) {
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
        ArrayList arrayList2 = this.f31461c;
        arrayList2.clear();
        arrayList.clear();
        vi0 vi0Var = this.h;
        int size = vi0Var.X0.size();
        if (vi0Var.f31811i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = vi0Var.S0;
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
        vi0 vi0Var = this.h;
        int size = vi0Var.X0.size();
        if (vi0Var.f31811i1) {
            size++;
        }
        if (size >= 2) {
            return vi0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
