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
public final class zl extends s4.m0 implements ug.a {
    public Drawable f33180a;
    public final Path f33181b = new Path();
    public final Drawable f33182c;
    public final pl d;
    public final ChatAttachAlertPhotoLayout e;

    public zl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, pl plVar) {
        this.e = chatAttachAlertPhotoLayout;
        this.d = plVar;
        this.f33182c = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(2131230927).mutate();
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        h(canvas, this.d, null, rectF);
    }

    @Override
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        h(canvas, recyclerView, null, null);
    }

    @Override
    public final void g(g.y yVar, RectF rectF) {
        h(null, this.d, yVar, rectF);
    }

    public final void h(Canvas canvas, RecyclerView recyclerView, g.y yVar, RectF rectF) {
        int top;
        yl ylVar;
        boolean z10;
        boolean z11;
        boolean z12;
        yl ylVar2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        if (!chatAttachAlertPhotoLayout.f23857d0 && !chatAttachAlertPhotoLayout.f23853b0 && chatAttachAlertPhotoLayout.G.e && !chatAttachAlertPhotoLayout.O0 && !chatAttachAlertPhotoLayout.P0) {
            s4.c1 K = recyclerView.K(0);
            if (K != null) {
                top = K.f47909a.getTop();
            } else {
                K = recyclerView.K(chatAttachAlertPhotoLayout.M0);
                if (K != null) {
                    top = (K.f47909a.getTop() - org.telegram.messenger.i0.L(2.0f)) - chatAttachAlertPhotoLayout.K0;
                } else if (yVar != null) {
                    yVar.f7259b = true;
                    return;
                } else {
                    return;
                }
            }
            int left = K.f47909a.getLeft();
            int i10 = chatAttachAlertPhotoLayout.K0;
            int i11 = left + i10;
            int L = org.telegram.messenger.i0.L(2.0f) + (i10 * 2) + top;
            if (yVar != null) {
                yVar.a(left);
                yVar.a(top);
                yVar.a(i11);
                yVar.a(L);
            }
            if (rectF == null || rectF.intersects(left, top, i11, L)) {
                Drawable drawable = this.f33182c;
                if (yVar != null) {
                    if (this.f33180a != null && ((ylVar2 = chatAttachAlertPhotoLayout.P) == null || !ylVar2.isInited() || chatAttachAlertPhotoLayout.N)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    yVar.b(z10);
                    if (chatAttachAlertPhotoLayout.P != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    yVar.b(z11);
                    if (drawable != null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    yVar.b(z12);
                }
                if (canvas != null) {
                    float L2 = org.telegram.messenger.i0.L(16.0f);
                    Path path = this.f33181b;
                    path.rewind();
                    float f7 = left;
                    float f10 = top;
                    path.addRoundRect(f7, f10, i11 + L2, L + L2, L2, L2, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (this.f33180a != null && ((ylVar = chatAttachAlertPhotoLayout.P) == null || !ylVar.isInited() || chatAttachAlertPhotoLayout.N)) {
                        this.f33180a.setBounds(left, top, i11, L);
                        this.f33180a.draw(canvas);
                    }
                    yl ylVar3 = chatAttachAlertPhotoLayout.P;
                    if (ylVar3 != null) {
                        ylVar3.f32874b = true;
                        canvas.save();
                        canvas.clipRect(left, top, i11, L);
                        canvas.translate(f7, f10);
                        chatAttachAlertPhotoLayout.P.draw(canvas);
                        canvas.restore();
                        chatAttachAlertPhotoLayout.P.f32874b = false;
                    }
                    if (drawable != null) {
                        int L3 = org.telegram.messenger.i0.L(24.0f);
                        int z13 = org.telegram.messenger.m5.z(7.0f, i11, L3);
                        int L4 = org.telegram.messenger.i0.L(7.0f) + top;
                        drawable.setBounds(z13, L4, z13 + L3, L3 + L4);
                        drawable.draw(canvas);
                    }
                    canvas.restore();
                    chatAttachAlertPhotoLayout.E.invalidate();
                }
            }
        } else if (yVar != null) {
            yVar.f7259b = true;
        }
    }

    public final void i() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(org.telegram.messenger.w0.h(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        if (bitmap != null) {
            this.f33180a = new BitmapDrawable(chatAttachAlertPhotoLayout.getContext().getResources(), bitmap);
        } else {
            this.f33180a = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(2131231493).mutate();
        }
        pl plVar = chatAttachAlertPhotoLayout.E;
        if (plVar != null) {
            plVar.invalidate();
        }
    }
}
