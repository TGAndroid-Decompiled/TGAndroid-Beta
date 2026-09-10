package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class xh0 extends bq {
    public final ArrayList f29044c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f29045f;
    public w9 f29046g;
    public final yh0 h;

    public xh0(yh0 yh0Var, Context context, org.telegram.ui.s01 s01Var) {
        this.h = yh0Var;
        this.e = context;
        this.f29046g = s01Var;
        Paint paint = new Paint(1);
        this.f29045f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        uh0 uh0Var = (uh0) obj;
        View view = uh0Var.f27677b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (uh0Var.f27676a) {
            return;
        }
        sh0 sh0Var = uh0Var.f27678c;
        if (sh0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = sh0Var.getImageReceiver().getDrawable();
            if (drawable instanceof c6) {
                ((c6) drawable).w(sh0Var);
            }
        }
        sh0Var.setRoundRadius(0);
        gVar.removeView(sh0Var);
        sh0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f29044c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f29044c.indexOf((uh0) obj);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xh0.e(z4.g, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        uh0 uh0Var = (uh0) obj;
        if (uh0Var.f27676a) {
            if (view == uh0Var.f27677b) {
                return true;
            }
            return false;
        } else if (view == uh0Var.f27678c) {
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
        ArrayList arrayList2 = this.f29044c;
        arrayList2.clear();
        arrayList.clear();
        yh0 yh0Var = this.h;
        int size = yh0Var.X0.size();
        if (yh0Var.f29337i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = yh0Var.S0;
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
        yh0 yh0Var = this.h;
        int size = yh0Var.X0.size();
        if (yh0Var.f29337i1) {
            size++;
        }
        if (size >= 2) {
            return yh0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
