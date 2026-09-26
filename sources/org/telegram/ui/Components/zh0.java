package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class zh0 extends xp {
    public final ArrayList f30883c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f30884f;
    public w9 f30885g;
    public final ai0 h;

    public zh0(ai0 ai0Var, Context context, org.telegram.ui.d01 d01Var) {
        this.h = ai0Var;
        this.e = context;
        this.f30885g = d01Var;
        Paint paint = new Paint(1);
        this.f30884f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        wh0 wh0Var = (wh0) obj;
        View view = wh0Var.f30001b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (wh0Var.f30000a) {
            return;
        }
        uh0 uh0Var = wh0Var.f30002c;
        if (uh0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = uh0Var.getImageReceiver().getDrawable();
            if (drawable instanceof d6) {
                ((d6) drawable).w(uh0Var);
            }
        }
        uh0Var.setRoundRadius(0);
        gVar.removeView(uh0Var);
        uh0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f30883c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f30883c.indexOf((wh0) obj);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zh0.e(z4.g, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        wh0 wh0Var = (wh0) obj;
        if (wh0Var.f30000a) {
            if (view == wh0Var.f30001b) {
                return true;
            }
            return false;
        } else if (view == wh0Var.f30002c) {
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
        ArrayList arrayList2 = this.f30883c;
        arrayList2.clear();
        arrayList.clear();
        ai0 ai0Var = this.h;
        int size = ai0Var.X0.size();
        if (ai0Var.f22659i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = ai0Var.S0;
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
        ai0 ai0Var = this.h;
        int size = ai0Var.X0.size();
        if (ai0Var.f22659i1) {
            size++;
        }
        if (size >= 2) {
            return ai0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
