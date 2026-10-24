package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class mi0 extends eq {
    public final ArrayList f28604c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f28605f;
    public u9 f28606g;
    public final ni0 h;

    public mi0(ni0 ni0Var, Context context, org.telegram.ui.rz0 rz0Var) {
        this.h = ni0Var;
        this.e = context;
        this.f28606g = rz0Var;
        Paint paint = new Paint(1);
        this.f28605f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(z4.h hVar, Object obj) {
        ji0 ji0Var = (ji0) obj;
        View view = ji0Var.f27708b;
        if (view != null) {
            hVar.removeView(view);
        }
        if (ji0Var.f27707a) {
            return;
        }
        hi0 hi0Var = ji0Var.f27709c;
        if (hi0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = hi0Var.getImageReceiver().getDrawable();
            if (drawable instanceof c6) {
                ((c6) drawable).w(hi0Var);
            }
        }
        hi0Var.setRoundRadius(0);
        hVar.removeView(hi0Var);
        hi0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f28604c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f28604c.indexOf((ji0) obj);
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
    public final java.lang.Object e(z4.h r42, int r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mi0.e(z4.h, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        ji0 ji0Var = (ji0) obj;
        if (ji0Var.f27707a) {
            if (view == ji0Var.f27708b) {
                return true;
            }
            return false;
        } else if (view == ji0Var.f27709c) {
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
        ArrayList arrayList2 = this.f28604c;
        arrayList2.clear();
        arrayList.clear();
        ni0 ni0Var = this.h;
        int size = ni0Var.X0.size();
        if (ni0Var.f28927i1) {
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
        if (ni0Var.f28927i1) {
            size++;
        }
        if (size >= 2) {
            return ni0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
