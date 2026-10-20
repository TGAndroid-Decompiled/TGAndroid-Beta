package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class ki0 extends fq {
    public final ArrayList f27882c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f27883f;
    public w9 f27884g;
    public final li0 h;

    public ki0(li0 li0Var, Context context, org.telegram.ui.oz0 oz0Var) {
        this.h = li0Var;
        this.e = context;
        this.f27884g = oz0Var;
        Paint paint = new Paint(1);
        this.f27883f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        hi0 hi0Var = (hi0) obj;
        View view = hi0Var.f26898b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (hi0Var.f26897a) {
            return;
        }
        fi0 fi0Var = hi0Var.f26899c;
        if (fi0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = fi0Var.getImageReceiver().getDrawable();
            if (drawable instanceof e6) {
                ((e6) drawable).w(fi0Var);
            }
        }
        fi0Var.setRoundRadius(0);
        gVar.removeView(fi0Var);
        fi0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f27882c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f27882c.indexOf((hi0) obj);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ki0.e(z4.g, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        hi0 hi0Var = (hi0) obj;
        if (hi0Var.f26897a) {
            if (view == hi0Var.f26898b) {
                return true;
            }
            return false;
        } else if (view == hi0Var.f26899c) {
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
        ArrayList arrayList2 = this.f27882c;
        arrayList2.clear();
        arrayList.clear();
        li0 li0Var = this.h;
        int size = li0Var.X0.size();
        if (li0Var.f28184i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = li0Var.S0;
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
        li0 li0Var = this.h;
        int size = li0Var.X0.size();
        if (li0Var.f28184i1) {
            size++;
        }
        if (size >= 2) {
            return li0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
