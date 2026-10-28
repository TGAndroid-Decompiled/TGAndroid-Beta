package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class ni0 extends iq {
    public final ArrayList f30925c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f30926f;
    public y9 f30927g;
    public final oi0 h;

    public ni0(oi0 oi0Var, Context context, org.telegram.ui.yz0 yz0Var) {
        this.h = oi0Var;
        this.e = context;
        this.f30927g = yz0Var;
        Paint paint = new Paint(1);
        this.f30926f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(a5.m mVar, Object obj) {
        ki0 ki0Var = (ki0) obj;
        View view = ki0Var.f29965b;
        if (view != null) {
            mVar.removeView(view);
        }
        if (ki0Var.f29964a) {
            return;
        }
        ii0 ii0Var = ki0Var.f29966c;
        if (ii0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = ii0Var.getImageReceiver().getDrawable();
            if (drawable instanceof g6) {
                ((g6) drawable).w(ii0Var);
            }
        }
        ii0Var.setRoundRadius(0);
        mVar.removeView(ii0Var);
        ii0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f30925c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f30925c.indexOf((ki0) obj);
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
    public final java.lang.Object e(a5.m r42, int r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ni0.e(a5.m, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        ki0 ki0Var = (ki0) obj;
        if (ki0Var.f29964a) {
            if (view == ki0Var.f29965b) {
                return true;
            }
            return false;
        } else if (view == ki0Var.f29966c) {
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
        ArrayList arrayList2 = this.f30925c;
        arrayList2.clear();
        arrayList.clear();
        oi0 oi0Var = this.h;
        int size = oi0Var.X0.size();
        if (oi0Var.f31303i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = oi0Var.S0;
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
        oi0 oi0Var = this.h;
        int size = oi0Var.X0.size();
        if (oi0Var.f31303i1) {
            size++;
        }
        if (size >= 2) {
            return oi0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
