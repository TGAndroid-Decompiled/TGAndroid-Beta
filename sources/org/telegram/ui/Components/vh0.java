package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class vh0 extends sp {
    public final ArrayList f29478c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f29479f;
    public p9 f29480g;
    public final wh0 h;

    public vh0(wh0 wh0Var, Context context, org.telegram.ui.a01 a01Var) {
        this.h = wh0Var;
        this.e = context;
        this.f29480g = a01Var;
        Paint paint = new Paint(1);
        this.f29479f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(m2.h hVar, Object obj) {
        sh0 sh0Var = (sh0) obj;
        View view = sh0Var.f28746b;
        if (view != null) {
            hVar.removeView(view);
        }
        if (sh0Var.f28745a) {
            return;
        }
        qh0 qh0Var = sh0Var.f28747c;
        if (qh0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = qh0Var.getImageReceiver().getDrawable();
            if (drawable instanceof y5) {
                ((y5) drawable).w(qh0Var);
            }
        }
        qh0Var.setRoundRadius(0);
        hVar.removeView(qh0Var);
        qh0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f29478c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f29478c.indexOf((sh0) obj);
        if (indexOf == -1) {
            return -2;
        }
        return indexOf;
    }

    @Override
    public final CharSequence d(int i10) {
        int count;
        StringBuilder sb = new StringBuilder();
        sb.append(k(i10) + 1);
        sb.append("/");
        MessagesController.DialogPhotos dialogPhotos = this.h.P0;
        if (dialogPhotos == null) {
            count = 0;
        } else {
            count = dialogPhotos.getCount();
        }
        sb.append(count);
        return sb.toString();
    }

    @Override
    public final java.lang.Object e(m2.h r42, int r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vh0.e(m2.h, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        sh0 sh0Var = (sh0) obj;
        if (sh0Var.f28745a) {
            if (view == sh0Var.f28746b) {
                return true;
            }
            return false;
        } else if (view == sh0Var.f28747c) {
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
                ((p9) arrayList.get(i10)).getImageReceiver().cancelLoadImage();
            }
            i10++;
        }
        ArrayList arrayList2 = this.f29478c;
        arrayList2.clear();
        arrayList.clear();
        wh0 wh0Var = this.h;
        int size = wh0Var.U0.size();
        if (wh0Var.f30264f1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = wh0Var.P0;
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
        wh0 wh0Var = this.h;
        int size = wh0Var.U0.size();
        if (wh0Var.f30264f1) {
            size++;
        }
        if (size >= 2) {
            return wh0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
