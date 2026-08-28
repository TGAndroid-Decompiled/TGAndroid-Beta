package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class zg0 extends lp {
    public final ArrayList f35305c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context f35306e;
    public final Paint f35307f;
    public o9 f35308g;
    public final ah0 h;

    public zg0(ah0 ah0Var, Context context, org.telegram.ui.iz0 iz0Var) {
        this.h = ah0Var;
        this.f35306e = context;
        this.f35308g = iz0Var;
        Paint paint = new Paint(1);
        this.f35307f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        wg0 wg0Var = (wg0) obj;
        View view = wg0Var.f34225b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (wg0Var.f34224a) {
            return;
        }
        ug0 ug0Var = wg0Var.f34226c;
        if (ug0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = ug0Var.getImageReceiver().getDrawable();
            if (drawable instanceof x5) {
                ((x5) drawable).w(ug0Var);
            }
        }
        ug0Var.setRoundRadius(0);
        gVar.removeView(ug0Var);
        ug0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f35305c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f35305c.indexOf((wg0) obj);
        if (indexOf == -1) {
            return -2;
        }
        return indexOf;
    }

    @Override
    public final CharSequence d(int i9) {
        int count;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k(i9) + 1);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zg0.e(m2.g, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        wg0 wg0Var = (wg0) obj;
        if (wg0Var.f34224a) {
            if (view == wg0Var.f34225b) {
                return true;
            }
            return false;
        } else if (view == wg0Var.f34226c) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final void g() {
        ArrayList arrayList;
        int count;
        int i9 = 0;
        while (true) {
            arrayList = this.d;
            if (i9 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i9) != null) {
                ((o9) arrayList.get(i9)).getImageReceiver().cancelLoadImage();
            }
            i9++;
        }
        ArrayList arrayList2 = this.f35305c;
        arrayList2.clear();
        arrayList.clear();
        ah0 ah0Var = this.h;
        int size = ah0Var.T0.size();
        if (ah0Var.f26799e1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = ah0Var.O0;
        if (dialogPhotos == null) {
            count = 0;
        } else {
            count = dialogPhotos.getCount();
        }
        int j10 = (j() * 2) + Math.max(count, size);
        for (int i10 = 0; i10 < j10; i10++) {
            arrayList2.add(new Object());
            arrayList.add(null);
        }
        super.g();
    }

    @Override
    public final int j() {
        ah0 ah0Var = this.h;
        int size = ah0Var.T0.size();
        if (ah0Var.f26799e1) {
            size++;
        }
        if (size >= 2) {
            return ah0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
