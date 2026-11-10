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
public final class gp0 implements ls {
    public final String f46138a;
    public final org.telegram.messenger.j20 f46139b;
    public final org.telegram.messenger.gf f46140c;
    public final boolean d;
    public final int f46141e;
    public final int f46142f;
    public final boolean f46143g;
    public final PhotoViewer h;

    public gp0(PhotoViewer photoViewer, String str, org.telegram.messenger.j20 j20Var, org.telegram.messenger.gf gfVar, boolean z9, int i7, int i10, boolean z10) {
        this.h = photoViewer;
        this.f46138a = str;
        this.f46139b = j20Var;
        this.f46140c = gfVar;
        this.d = z9;
        this.f46141e = i7;
        this.f46142f = i10;
        this.f46143g = z10;
    }

    @Override
    public final org.telegram.messenger.ij A() {
        return null;
    }

    @Override
    public final boolean B() {
        if (this.h.f41547w7 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final boolean E(TLRPC.Document document) {
        return false;
    }

    @Override
    public final String G(boolean z9) {
        return null;
    }

    @Override
    public final boolean I() {
        return false;
    }

    @Override
    public final boolean J() {
        if (this.h.f41511s7 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        return false;
    }

    @Override
    public final void O(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f41537v7 = true;
        R();
        photoViewer.f41472o5.p(this.f46138a, this.f46139b, str, null, true, 0L, null, null, photoViewer.r1(), this.f46140c.f26850c, null, null);
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
        ns p10 = ns.p();
        ImageReceiver imageReceiver = p10.A;
        org.telegram.messenger.gf gfVar = this.f46140c;
        if (gfVar.f26850c != null) {
            try {
                new File(gfVar.f26850c).delete();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            gfVar.f26850c = null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (imageReceiver != null) {
            imageReceiver.setAlpha(1.0f);
            imageReceiver.y0(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
            imageReceiver.h(canvas, null);
        }
        if (p10.C != null) {
            canvas.save();
            canvas.scale(createBitmap.getWidth() / p10.C.getWidth(), createBitmap.getHeight() / p10.C.getHeight());
            p10.C.setAlpha(1.0f);
            Path path = new Path();
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, p10.C.getWidth(), p10.C.getHeight());
            path.addRoundRect(rectF, p10.C.getWidth() / 8.0f, p10.C.getHeight() / 8.0f, Path.Direction.CW);
            canvas.clipPath(path);
            p10.C.draw(canvas);
            canvas.restore();
        }
        Drawable[] drawableArr = PhotoViewer.Y8;
        PhotoViewer photoViewer = this.h;
        TLRPC.PhotoSize a02 = org.telegram.messenger.gc.a0(createBitmap, photoViewer.b1(), 512.0f, 512.0f, 83);
        org.telegram.messenger.w7.G(photoViewer.T);
        gfVar.f26850c = org.telegram.messenger.w7.J(a02, null, true, true).toString();
    }

    @Override
    public final long a() {
        return this.h.D5;
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
    public final boolean k(int i7) {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.k60 m(bi.x5 x5Var) {
        return null;
    }

    @Override
    public final void n(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f41537v7 = true;
        R();
        photoViewer.f41472o5.p(this.f46138a, this.f46139b, str, null, false, 0L, null, null, photoViewer.r1(), this.f46140c.f26850c, null, photoViewer.f41547w7);
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final void u(CharSequence charSequence, String str, org.telegram.ui.Components.ex exVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f41537v7 = true;
        R();
        photoViewer.f41472o5.p(this.f46138a, this.f46139b, str, charSequence, false, 0L, null, null, photoViewer.r1(), this.f46140c.f26850c, exVar, null);
    }

    @Override
    public final void w(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f41537v7 = true;
        R();
        photoViewer.f41472o5.p(this.f46138a, this.f46139b, str, null, false, 0L, stickerSet, photoViewer.f41511s7, photoViewer.r1(), this.f46140c.f26850c, null, null);
    }

    @Override
    public final boolean y() {
        xq0 xq0Var;
        TLRPC.Chat chat;
        PhotoViewer photoViewer = this.h;
        cn cnVar = photoViewer.f41438k4;
        if ((cnVar == null || (chat = cnVar.f44473e) == null || org.telegram.messenger.t3.t(chat)) && (xq0Var = photoViewer.d) != null) {
            if (!xq0Var.Q() || photoViewer.f41438k4 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void z(String str) {
        PhotoViewer photoViewer = this.h;
        xq0 xq0Var = photoViewer.d;
        if (xq0Var != null) {
            boolean Q = xq0Var.Q();
            org.telegram.messenger.gf gfVar = this.f46140c;
            if (Q) {
                if (photoViewer.f41438k4 == null) {
                    return;
                }
                photoViewer.f41537v7 = true;
                R();
                photoViewer.f41472o5.p(this.f46138a, this.f46139b, str, null, false, photoViewer.f41438k4.a(), null, null, photoViewer.r1(), gfVar.f26850c, null, null);
                return;
            }
            photoViewer.f41537v7 = true;
            R();
            gfVar.h = this.f46138a;
            photoViewer.d.o(photoViewer.O4, this.f46139b, this.d, this.f46141e, this.f46142f, this.f46143g);
            org.telegram.messenger.qs.f(org.telegram.messenger.p10.f24474s0).m(org.telegram.messenger.qs.f25078s3, Boolean.TRUE);
        }
    }

    @Override
    public final void C(TLRPC.Document document) {
    }

    @Override
    public final void F(TLRPC.Document document) {
    }

    @Override
    public final void H(TLRPC.Document document) {
    }

    @Override
    public final void i(org.telegram.messenger.zy zyVar) {
    }

    @Override
    public final void o(TLRPC.Document document) {
    }

    @Override
    public final void q(TLRPC.Document document) {
    }

    @Override
    public final void v(TLRPC.Document document) {
    }

    @Override
    public final void K() {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z9) {
    }

    @Override
    public final void x(TLObject tLObject, Object obj) {
    }

    @Override
    public final void s(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z9, int i7, int i10) {
    }
}
