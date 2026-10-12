package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class vi0 extends nq {
    public final ArrayList f31526c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context f31527e;
    public final Paint f31528f;
    public y9 f31529g;
    public final wi0 h;

    public vi0(wi0 wi0Var, Context context, org.telegram.ui.n01 n01Var) {
        this.h = wi0Var;
        this.f31527e = context;
        this.f31529g = n01Var;
        Paint paint = new Paint(1);
        this.f31528f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        si0 si0Var = (si0) obj;
        View view = si0Var.f30575b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (si0Var.f30574a) {
            return;
        }
        qi0 qi0Var = si0Var.f30576c;
        if (qi0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = qi0Var.getImageReceiver().getDrawable();
            if (drawable instanceof f6) {
                ((f6) drawable).w(qi0Var);
            }
        }
        qi0Var.setRoundRadius(0);
        gVar.removeView(qi0Var);
        qi0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f31526c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f31526c.indexOf((si0) obj);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vi0.e(z4.g, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        si0 si0Var = (si0) obj;
        if (si0Var.f30574a) {
            if (view == si0Var.f30575b) {
                return true;
            }
            return false;
        } else if (view == si0Var.f30576c) {
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
        ArrayList arrayList2 = this.f31526c;
        arrayList2.clear();
        arrayList.clear();
        wi0 wi0Var = this.h;
        int size = wi0Var.X0.size();
        if (wi0Var.f32411i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = wi0Var.S0;
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
        wi0 wi0Var = this.h;
        int size = wi0Var.X0.size();
        if (wi0Var.f32411i1) {
            size++;
        }
        if (size >= 2) {
            return wi0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
