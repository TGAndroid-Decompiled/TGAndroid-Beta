package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lq0 implements ht {
    public final String f39359a;
    public final org.telegram.messenger.y20 f39360b;
    public final org.telegram.messenger.ff f39361c;
    public final boolean d;
    public final int e;
    public final int f39362f;
    public final boolean f39363g;
    public final PhotoViewer h;

    public lq0(PhotoViewer photoViewer, String str, org.telegram.messenger.y20 y20Var, org.telegram.messenger.ff ffVar, boolean z10, int i10, int i11, boolean z11) {
        this.h = photoViewer;
        this.f39359a = str;
        this.f39360b = y20Var;
        this.f39361c = ffVar;
        this.d = z10;
        this.e = i10;
        this.f39362f = i11;
        this.f39363g = z11;
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.z60 D(fg.i iVar) {
        return null;
    }

    @Override
    public final String F(boolean z10) {
        return null;
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final boolean I() {
        if (this.h.f33616t7 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean M(TLRPC.Document document) {
        return false;
    }

    @Override
    public final void N(CharSequence charSequence, String str, org.telegram.ui.Components.vg vgVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f33644w7 = true;
        R();
        photoViewer.p5.p(this.f39359a, this.f39360b, str, charSequence, false, 0L, null, null, photoViewer.x1(), this.f39361c.f14604c, vgVar, null);
    }

    @Override
    public final void O(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f33644w7 = true;
        R();
        photoViewer.p5.p(this.f39359a, this.f39360b, str, null, true, 0L, null, null, photoViewer.x1(), this.f39361c.f14604c, null, null);
    }

    @Override
    public final Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override
    public final boolean Q() {
        return true;
    }

    public final void R() {
        kt p5 = kt.p();
        ImageReceiver imageReceiver = p5.A;
        org.telegram.messenger.ff ffVar = this.f39361c;
        if (ffVar.f14604c != null) {
            try {
                new File(ffVar.f14604c).delete();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            ffVar.f14604c = null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (imageReceiver != null) {
            imageReceiver.setAlpha(1.0f);
            imageReceiver.y0(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
            imageReceiver.h(canvas, null);
        }
        if (p5.C != null) {
            canvas.save();
            canvas.scale(createBitmap.getWidth() / p5.C.getWidth(), createBitmap.getHeight() / p5.C.getHeight());
            p5.C.setAlpha(1.0f);
            Path path = new Path();
            path.rewind();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, p5.C.getWidth(), p5.C.getHeight());
            path.addRoundRect(rectF, p5.C.getWidth() / 8.0f, p5.C.getHeight() / 8.0f, Path.Direction.CW);
            canvas.clipPath(path);
            p5.C.draw(canvas);
            canvas.restore();
        }
        Drawable[] drawableArr = PhotoViewer.U8;
        PhotoViewer photoViewer = this.h;
        TLRPC.PhotoSize a02 = org.telegram.messenger.ic.a0(createBitmap, photoViewer.i1(), 512.0f, 512.0f, 83);
        org.telegram.messenger.b8.G(photoViewer.T);
        ffVar.f14604c = org.telegram.messenger.b8.K(a02, null, true, true).toString();
    }

    @Override
    public final long a() {
        return this.h.E5;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final TLRPC.PollAnswer g() {
        return null;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i10) {
        return false;
    }

    @Override
    public final void m(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f33644w7 = true;
        R();
        photoViewer.p5.p(this.f39359a, this.f39360b, str, null, false, 0L, null, null, photoViewer.x1(), this.f39361c.f14604c, null, photoViewer.f33654x7);
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f33644w7 = true;
        R();
        photoViewer.p5.p(this.f39359a, this.f39360b, str, null, false, 0L, stickerSet, photoViewer.f33616t7, photoViewer.x1(), this.f39361c.f14604c, null, null);
    }

    @Override
    public final boolean w() {
        PhotoViewer photoViewer = this.h;
        ds0 ds0Var = photoViewer.d;
        if (ds0Var != null) {
            if (!ds0Var.Q() || photoViewer.l4 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void x(String str) {
        PhotoViewer photoViewer = this.h;
        ds0 ds0Var = photoViewer.d;
        if (ds0Var != null) {
            boolean Q = ds0Var.Q();
            org.telegram.messenger.ff ffVar = this.f39361c;
            if (Q) {
                if (photoViewer.l4 == null) {
                    return;
                }
                photoViewer.f33644w7 = true;
                R();
                photoViewer.p5.p(this.f39359a, this.f39360b, str, null, false, photoViewer.l4.a(), null, null, photoViewer.x1(), ffVar.f14604c, null, null);
                return;
            }
            photoViewer.f33644w7 = true;
            R();
            ffVar.h = this.f39359a;
            photoViewer.d.o(photoViewer.P4, this.f39360b, this.d, this.e, this.f39362f, this.f39363g);
            org.telegram.messenger.at.f(org.telegram.messenger.e20.f15506s0).m(org.telegram.messenger.at.f14783s3, Boolean.TRUE);
        }
    }

    @Override
    public final org.telegram.messenger.kj y() {
        return null;
    }

    @Override
    public final boolean z() {
        if (this.h.f33654x7 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void A(TLRPC.Document document) {
    }

    @Override
    public final void E(TLRPC.Document document) {
    }

    @Override
    public final void G(TLRPC.Document document) {
    }

    @Override
    public final void i(org.telegram.messenger.kz kzVar) {
    }

    @Override
    public final void n(TLRPC.Document document) {
    }

    @Override
    public final void p(TLRPC.Document document) {
    }

    @Override
    public final void t(TLRPC.Document document) {
    }

    @Override
    public final void J() {
    }

    @Override
    public final void K() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
