package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class mi0 extends iq {
    public final ArrayList f30590c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f30591f;
    public y9 f30592g;
    public final ni0 h;

    public mi0(ni0 ni0Var, Context context, org.telegram.ui.wz0 wz0Var) {
        this.h = ni0Var;
        this.e = context;
        this.f30592g = wz0Var;
        Paint paint = new Paint(1);
        this.f30591f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(a5.m mVar, Object obj) {
        ji0 ji0Var = (ji0) obj;
        View view = ji0Var.f29652b;
        if (view != null) {
            mVar.removeView(view);
        }
        if (ji0Var.f29651a) {
            return;
        }
        hi0 hi0Var = ji0Var.f29653c;
        if (hi0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = hi0Var.getImageReceiver().getDrawable();
            if (drawable instanceof g6) {
                ((g6) drawable).w(hi0Var);
            }
        }
        hi0Var.setRoundRadius(0);
        mVar.removeView(hi0Var);
        hi0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f30590c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f30590c.indexOf((ji0) obj);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mi0.e(a5.m, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        ji0 ji0Var = (ji0) obj;
        if (ji0Var.f29651a) {
            if (view == ji0Var.f29652b) {
                return true;
            }
            return false;
        } else if (view == ji0Var.f29653c) {
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
        ArrayList arrayList2 = this.f30590c;
        arrayList2.clear();
        arrayList.clear();
        ni0 ni0Var = this.h;
        int size = ni0Var.X0.size();
        if (ni0Var.f30992i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = ni0Var.S0;
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
        ni0 ni0Var = this.h;
        int size = ni0Var.X0.size();
        if (ni0Var.f30992i1) {
            size++;
        }
        if (size >= 2) {
            return ni0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
