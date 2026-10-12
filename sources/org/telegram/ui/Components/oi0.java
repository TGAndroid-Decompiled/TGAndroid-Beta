package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class oi0 extends iq {
    public final ArrayList f27964c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f27965f;
    public z9 f27966g;
    public final pi0 h;

    public oi0(pi0 pi0Var, Context context, org.telegram.ui.s01 s01Var) {
        this.h = pi0Var;
        this.e = context;
        this.f27966g = s01Var;
        Paint paint = new Paint(1);
        this.f27965f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        li0 li0Var = (li0) obj;
        View view = li0Var.f27049b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (li0Var.f27048a) {
            return;
        }
        ji0 ji0Var = li0Var.f27050c;
        if (ji0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = ji0Var.getImageReceiver().getDrawable();
            if (drawable instanceof f6) {
                ((f6) drawable).w(ji0Var);
            }
        }
        ji0Var.setRoundRadius(0);
        gVar.removeView(ji0Var);
        ji0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f27964c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f27964c.indexOf((li0) obj);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oi0.e(z4.g, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        li0 li0Var = (li0) obj;
        if (li0Var.f27048a) {
            if (view == li0Var.f27049b) {
                return true;
            }
            return false;
        } else if (view == li0Var.f27050c) {
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
                ((z9) arrayList.get(i10)).getImageReceiver().cancelLoadImage();
            }
            i10++;
        }
        ArrayList arrayList2 = this.f27964c;
        arrayList2.clear();
        arrayList.clear();
        pi0 pi0Var = this.h;
        int size = pi0Var.X0.size();
        if (pi0Var.f28327i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = pi0Var.S0;
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
        pi0 pi0Var = this.h;
        int size = pi0Var.X0.size();
        if (pi0Var.f28327i1) {
            size++;
        }
        if (size >= 2) {
            return pi0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
