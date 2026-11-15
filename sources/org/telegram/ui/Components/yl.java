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
public final class yl extends v4.n0 implements eh.a {
    public Drawable f42032a;
    public final Path f42033b = new Path();
    public final Drawable f42034c;
    public final ql d;
    public final ChatAttachAlertPhotoLayout f42035e;

    public yl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, ql qlVar) {
        this.f42035e = chatAttachAlertPhotoLayout;
        this.d = qlVar;
        this.f42034c = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(2131230927).mutate();
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
        xl xlVar;
        boolean z10;
        boolean z11;
        boolean z12;
        xl xlVar2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f42035e;
        if (!chatAttachAlertPhotoLayout.f32378e0 && !chatAttachAlertPhotoLayout.f32374c0 && chatAttachAlertPhotoLayout.H.f33015e && !chatAttachAlertPhotoLayout.P0 && !chatAttachAlertPhotoLayout.Q0) {
            v4.e1 K = recyclerView.K(0);
            if (K != null) {
                top = K.f58535a.getTop();
            } else {
                K = recyclerView.K(chatAttachAlertPhotoLayout.N0);
                if (K != null) {
                    top = (K.f58535a.getTop() - org.telegram.messenger.g0.L(2.0f)) - chatAttachAlertPhotoLayout.L0;
                } else if (aVar != null) {
                    aVar.f8087a = true;
                    return;
                } else {
                    return;
                }
            }
            int left = K.f58535a.getLeft();
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
                Drawable drawable = this.f42034c;
                if (aVar != null) {
                    if (this.f42032a != null && ((xlVar2 = chatAttachAlertPhotoLayout.Q) == null || !xlVar2.isInited() || chatAttachAlertPhotoLayout.O)) {
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
                    Path path = this.f42033b;
                    path.rewind();
                    float f10 = left;
                    float f11 = top;
                    path.addRoundRect(f10, f11, i10 + L2, L + L2, L2, L2, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (this.f42032a != null && ((xlVar = chatAttachAlertPhotoLayout.Q) == null || !xlVar.isInited() || chatAttachAlertPhotoLayout.O)) {
                        this.f42032a.setBounds(left, top, i10, L);
                        this.f42032a.draw(canvas);
                    }
                    xl xlVar3 = chatAttachAlertPhotoLayout.Q;
                    if (xlVar3 != null) {
                        xlVar3.f41722b = true;
                        canvas.save();
                        canvas.clipRect(left, top, i10, L);
                        canvas.translate(f10, f11);
                        chatAttachAlertPhotoLayout.Q.draw(canvas);
                        canvas.restore();
                        chatAttachAlertPhotoLayout.Q.f41722b = false;
                    }
                    if (drawable != null) {
                        int L3 = org.telegram.messenger.g0.L(24.0f);
                        int z13 = org.telegram.messenger.k5.z(7.0f, i10, L3);
                        int L4 = org.telegram.messenger.g0.L(7.0f) + top;
                        drawable.setBounds(z13, L4, z13 + L3, L3 + L4);
                        drawable.draw(canvas);
                    }
                    canvas.restore();
                    chatAttachAlertPhotoLayout.F.invalidate();
                }
            }
        } else if (aVar != null) {
            aVar.f8087a = true;
        }
    }

    public final void i() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f42035e;
        if (bitmap != null) {
            this.f42032a = new BitmapDrawable(chatAttachAlertPhotoLayout.getContext().getResources(), bitmap);
        } else {
            this.f42032a = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(2131231492).mutate();
        }
        ql qlVar = chatAttachAlertPhotoLayout.F;
        if (qlVar != null) {
            qlVar.invalidate();
        }
    }
}
