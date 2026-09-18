package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class oh0 extends vp {
    public final ArrayList f26737c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f26738f;
    public u9 f26739g;
    public final ph0 h;

    public oh0(ph0 ph0Var, Context context, org.telegram.ui.o01 o01Var) {
        this.h = ph0Var;
        this.e = context;
        this.f26739g = o01Var;
        Paint paint = new Paint(1);
        this.f26738f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        lh0 lh0Var = (lh0) obj;
        View view = lh0Var.f25906b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (lh0Var.f25905a) {
            return;
        }
        jh0 jh0Var = lh0Var.f25907c;
        if (jh0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = jh0Var.getImageReceiver().getDrawable();
            if (drawable instanceof b6) {
                ((b6) drawable).w(jh0Var);
            }
        }
        jh0Var.setRoundRadius(0);
        gVar.removeView(jh0Var);
        jh0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f26737c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f26737c.indexOf((lh0) obj);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oh0.e(z4.g, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        lh0 lh0Var = (lh0) obj;
        if (lh0Var.f25905a) {
            if (view == lh0Var.f25906b) {
                return true;
            }
            return false;
        } else if (view == lh0Var.f25907c) {
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
                ((u9) arrayList.get(i10)).getImageReceiver().cancelLoadImage();
            }
            i10++;
        }
        ArrayList arrayList2 = this.f26737c;
        arrayList2.clear();
        arrayList.clear();
        ph0 ph0Var = this.h;
        int size = ph0Var.X0.size();
        if (ph0Var.f27040i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = ph0Var.S0;
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
        ph0 ph0Var = this.h;
        int size = ph0Var.X0.size();
        if (ph0Var.f27040i1) {
            size++;
        }
        if (size >= 2) {
            return ph0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
