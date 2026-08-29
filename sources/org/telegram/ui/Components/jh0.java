package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class jh0 extends pp {
    public final ArrayList f29664c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context f29665e;
    public final Paint f29666f;
    public t9 f29667g;
    public final kh0 h;

    public jh0(kh0 kh0Var, Context context, org.telegram.ui.iz0 iz0Var) {
        this.h = kh0Var;
        this.f29665e = context;
        this.f29667g = iz0Var;
        Paint paint = new Paint(1);
        this.f29666f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        gh0 gh0Var = (gh0) obj;
        View view = gh0Var.f28887b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (gh0Var.f28886a) {
            return;
        }
        eh0 eh0Var = gh0Var.f28888c;
        if (eh0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = eh0Var.getImageReceiver().getDrawable();
            if (drawable instanceof c6) {
                ((c6) drawable).w(eh0Var);
            }
        }
        eh0Var.setRoundRadius(0);
        gVar.removeView(eh0Var);
        eh0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f29664c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f29664c.indexOf((gh0) obj);
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
        MessagesController.DialogPhotos dialogPhotos = this.h.O0;
        if (dialogPhotos == null) {
            count = 0;
        } else {
            count = dialogPhotos.getCount();
        }
        sb2.append(count);
        return sb2.toString();
    }

    @Override
    public final java.lang.Object e(m2.g r42, int r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jh0.e(m2.g, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        gh0 gh0Var = (gh0) obj;
        if (gh0Var.f28886a) {
            if (view == gh0Var.f28887b) {
                return true;
            }
            return false;
        } else if (view == gh0Var.f28888c) {
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
                ((t9) arrayList.get(i10)).getImageReceiver().cancelLoadImage();
            }
            i10++;
        }
        ArrayList arrayList2 = this.f29664c;
        arrayList2.clear();
        arrayList.clear();
        kh0 kh0Var = this.h;
        int size = kh0Var.T0.size();
        if (kh0Var.f30050e1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = kh0Var.O0;
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
        kh0 kh0Var = this.h;
        int size = kh0Var.T0.size();
        if (kh0Var.f30050e1) {
            size++;
        }
        if (size >= 2) {
            return kh0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
