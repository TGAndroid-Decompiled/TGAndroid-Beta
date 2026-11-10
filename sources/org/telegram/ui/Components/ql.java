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
public final class ql extends v4.m0 implements eh.a {
    public Drawable f37317a;
    public final Path f37318b = new Path();
    public final Drawable f37319c;
    public final il d;
    public final ChatAttachAlertPhotoLayout f37320e;

    public ql(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, il ilVar) {
        this.f37320e = chatAttachAlertPhotoLayout;
        this.d = ilVar;
        this.f37319c = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(2131230927).mutate();
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
        pl plVar;
        boolean z9;
        boolean z10;
        boolean z11;
        pl plVar2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f37320e;
        if (!chatAttachAlertPhotoLayout.f31215d0 && !chatAttachAlertPhotoLayout.f31211b0 && chatAttachAlertPhotoLayout.G.f38019e && !chatAttachAlertPhotoLayout.O0 && !chatAttachAlertPhotoLayout.P0) {
            v4.d1 K = recyclerView.K(0);
            if (K != null) {
                top = K.f57052a.getTop();
            } else {
                K = recyclerView.K(chatAttachAlertPhotoLayout.M0);
                if (K != null) {
                    top = (K.f57052a.getTop() - org.telegram.messenger.g0.L(2.0f)) - chatAttachAlertPhotoLayout.K0;
                } else if (aVar != null) {
                    aVar.f8703a = true;
                    return;
                } else {
                    return;
                }
            }
            int left = K.f57052a.getLeft();
            int i7 = chatAttachAlertPhotoLayout.K0;
            int i10 = left + i7;
            int L = org.telegram.messenger.g0.L(2.0f) + (i7 * 2) + top;
            if (aVar != null) {
                aVar.a(left);
                aVar.a(top);
                aVar.a(i10);
                aVar.a(L);
            }
            if (rectF == null || rectF.intersects(left, top, i10, L)) {
                Drawable drawable = this.f37319c;
                if (aVar != null) {
                    if (this.f37317a != null && ((plVar2 = chatAttachAlertPhotoLayout.P) == null || !plVar2.isInited() || chatAttachAlertPhotoLayout.N)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    aVar.b(z9);
                    if (chatAttachAlertPhotoLayout.P != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    aVar.b(z10);
                    if (drawable != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    aVar.b(z11);
                }
                if (canvas != null) {
                    float L2 = org.telegram.messenger.g0.L(16.0f);
                    Path path = this.f37318b;
                    path.rewind();
                    float f10 = left;
                    float f11 = top;
                    path.addRoundRect(f10, f11, i10 + L2, L + L2, L2, L2, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (this.f37317a != null && ((plVar = chatAttachAlertPhotoLayout.P) == null || !plVar.isInited() || chatAttachAlertPhotoLayout.N)) {
                        this.f37317a.setBounds(left, top, i10, L);
                        this.f37317a.draw(canvas);
                    }
                    pl plVar3 = chatAttachAlertPhotoLayout.P;
                    if (plVar3 != null) {
                        plVar3.f37007b = true;
                        canvas.save();
                        canvas.clipRect(left, top, i10, L);
                        canvas.translate(f10, f11);
                        chatAttachAlertPhotoLayout.P.draw(canvas);
                        canvas.restore();
                        chatAttachAlertPhotoLayout.P.f37007b = false;
                    }
                    if (drawable != null) {
                        int L3 = org.telegram.messenger.g0.L(24.0f);
                        int z12 = org.telegram.messenger.k5.z(7.0f, i10, L3);
                        int L4 = org.telegram.messenger.g0.L(7.0f) + top;
                        drawable.setBounds(z12, L4, z12 + L3, L3 + L4);
                        drawable.draw(canvas);
                    }
                    canvas.restore();
                    chatAttachAlertPhotoLayout.E.invalidate();
                }
            }
        } else if (aVar != null) {
            aVar.f8703a = true;
        }
    }

    public final void i() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f37320e;
        if (bitmap != null) {
            this.f37317a = new BitmapDrawable(chatAttachAlertPhotoLayout.getContext().getResources(), bitmap);
        } else {
            this.f37317a = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(2131231492).mutate();
        }
        il ilVar = chatAttachAlertPhotoLayout.E;
        if (ilVar != null) {
            ilVar.invalidate();
        }
    }
}
