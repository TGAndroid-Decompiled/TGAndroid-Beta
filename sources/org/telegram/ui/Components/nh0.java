package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
public final class nh0 extends vp {
    public final ArrayList f26457c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f26458f;
    public u9 f26459g;
    public final oh0 h;

    public nh0(oh0 oh0Var, Context context, org.telegram.ui.n01 n01Var) {
        this.h = oh0Var;
        this.e = context;
        this.f26459g = n01Var;
        Paint paint = new Paint(1);
        this.f26458f = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        kh0 kh0Var = (kh0) obj;
        View view = kh0Var.f25605b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (kh0Var.f25604a) {
            return;
        }
        ih0 ih0Var = kh0Var.f25606c;
        if (ih0Var.getImageReceiver().hasStaticThumb()) {
            Drawable drawable = ih0Var.getImageReceiver().getDrawable();
            if (drawable instanceof b6) {
                ((b6) drawable).w(ih0Var);
            }
        }
        ih0Var.setRoundRadius(0);
        gVar.removeView(ih0Var);
        ih0Var.getImageReceiver().cancelLoadImage();
    }

    @Override
    public final int b() {
        return this.f26457c.size();
    }

    @Override
    public final int c(Object obj) {
        int indexOf = this.f26457c.indexOf((kh0) obj);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nh0.e(z4.g, int):java.lang.Object");
    }

    @Override
    public final boolean f(View view, Object obj) {
        kh0 kh0Var = (kh0) obj;
        if (kh0Var.f25604a) {
            if (view == kh0Var.f25605b) {
                return true;
            }
            return false;
        } else if (view == kh0Var.f25606c) {
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
        ArrayList arrayList2 = this.f26457c;
        arrayList2.clear();
        arrayList.clear();
        oh0 oh0Var = this.h;
        int size = oh0Var.X0.size();
        if (oh0Var.f26792i1) {
            size++;
        }
        MessagesController.DialogPhotos dialogPhotos = oh0Var.S0;
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
        oh0 oh0Var = this.h;
        int size = oh0Var.X0.size();
        if (oh0Var.f26792i1) {
            size++;
        }
        if (size >= 2) {
            return oh0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
