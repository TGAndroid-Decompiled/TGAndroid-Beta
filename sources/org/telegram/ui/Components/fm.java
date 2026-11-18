package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
public final class fm extends v4.o0 implements eh.a {
    public Drawable f35137a;
    public final Path f35138b = new Path();
    public final Drawable f35139c;
    public final xl d;
    public final ChatAttachAlertPhotoLayout f35140e;

    public fm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, xl xlVar) {
        this.f35140e = chatAttachAlertPhotoLayout;
        this.d = xlVar;
        this.f35139c = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(2131230927).mutate();
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        h(null, this.d, aVar, rectF);
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        h(canvas, this.d, null, rectF);
    }

    @Override
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        h(canvas, recyclerView, null, null);
    }

    public final void h(Canvas canvas, RecyclerView recyclerView, dh.a aVar, RectF rectF) {
        int top;
        em emVar;
        boolean z10;
        boolean z11;
        boolean z12;
        em emVar2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35140e;
        if (!chatAttachAlertPhotoLayout.f32775e0 && !chatAttachAlertPhotoLayout.f32771c0 && chatAttachAlertPhotoLayout.H.f35925e && !chatAttachAlertPhotoLayout.P0 && !chatAttachAlertPhotoLayout.Q0) {
            v4.f1 K = recyclerView.K(0);
            if (K != null) {
                top = K.f59123a.getTop();
            } else {
                K = recyclerView.K(chatAttachAlertPhotoLayout.N0);
                if (K != null) {
                    top = (K.f59123a.getTop() - org.telegram.messenger.g0.L(2.0f)) - chatAttachAlertPhotoLayout.L0;
                } else if (aVar != null) {
                    aVar.f8369a = true;
                    return;
                } else {
                    return;
                }
            }
            int left = K.f59123a.getLeft();
            int i7 = chatAttachAlertPhotoLayout.L0;
            int i10 = left + i7;
            int L = org.telegram.messenger.g0.L(2.0f) + (i7 * 2) + top;
            if (aVar != null) {
                aVar.a(left);
                aVar.a(top);
                aVar.a(i10);
                aVar.a(L);
            }
            if (rectF == null || rectF.intersects(left, top, i10, L)) {
                Drawable drawable = this.f35139c;
                if (aVar != null) {
                    if (this.f35137a != null && ((emVar2 = chatAttachAlertPhotoLayout.Q) == null || !emVar2.isInited() || chatAttachAlertPhotoLayout.O)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    aVar.b(z10);
                    if (chatAttachAlertPhotoLayout.Q != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    aVar.b(z11);
                    if (drawable != null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    aVar.b(z12);
                }
                if (canvas != null) {
                    float L2 = org.telegram.messenger.g0.L(16.0f);
                    Path path = this.f35138b;
                    path.rewind();
                    float f10 = left;
                    float f11 = top;
                    path.addRoundRect(f10, f11, i10 + L2, L + L2, L2, L2, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (this.f35137a != null && ((emVar = chatAttachAlertPhotoLayout.Q) == null || !emVar.isInited() || chatAttachAlertPhotoLayout.O)) {
                        this.f35137a.setBounds(left, top, i10, L);
                        this.f35137a.draw(canvas);
                    }
                    em emVar3 = chatAttachAlertPhotoLayout.Q;
                    if (emVar3 != null) {
                        emVar3.f34766b = true;
                        canvas.save();
                        canvas.clipRect(left, top, i10, L);
                        canvas.translate(f10, f11);
                        chatAttachAlertPhotoLayout.Q.draw(canvas);
                        canvas.restore();
                        chatAttachAlertPhotoLayout.Q.f34766b = false;
                    }
                    if (drawable != null) {
                        int L3 = org.telegram.messenger.g0.L(24.0f);
                        int z13 = org.telegram.messenger.f3.z(7.0f, i10, L3);
                        int L4 = org.telegram.messenger.g0.L(7.0f) + top;
                        drawable.setBounds(z13, L4, z13 + L3, L3 + L4);
                        drawable.draw(canvas);
                    }
                    canvas.restore();
                    chatAttachAlertPhotoLayout.F.invalidate();
                }
            }
        } else if (aVar != null) {
            aVar.f8369a = true;
        }
    }

    public final void i() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f35140e;
        if (bitmap != null) {
            this.f35137a = new BitmapDrawable(chatAttachAlertPhotoLayout.getContext().getResources(), bitmap);
        } else {
            this.f35137a = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(2131231492).mutate();
        }
        xl xlVar = chatAttachAlertPhotoLayout.F;
        if (xlVar != null) {
            xlVar.invalidate();
        }
    }
}
