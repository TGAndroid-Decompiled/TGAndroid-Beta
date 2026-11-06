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
public final class dp0 implements is {
    public final String f45121a;
    public final org.telegram.messenger.j20 f45122b;
    public final org.telegram.messenger.gf f45123c;
    public final boolean d;
    public final int f45124e;
    public final int f45125f;
    public final boolean f45126g;
    public final PhotoViewer h;

    public dp0(PhotoViewer photoViewer, String str, org.telegram.messenger.j20 j20Var, org.telegram.messenger.gf gfVar, boolean z9, int i7, int i10, boolean z10) {
        this.h = photoViewer;
        this.f45121a = str;
        this.f45122b = j20Var;
        this.f45123c = gfVar;
        this.d = z9;
        this.f45124e = i7;
        this.f45125f = i10;
        this.f45126g = z10;
    }

    @Override
    public final org.telegram.messenger.ij A() {
        return null;
    }

    @Override
    public final boolean B() {
        if (this.h.f41545w7 != null) {
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
        if (this.h.f41509s7 != null) {
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
        photoViewer.f41535v7 = true;
        R();
        photoViewer.f41470o5.p(this.f45121a, this.f45122b, str, null, true, 0L, null, null, photoViewer.r1(), this.f45123c.f26825c, null, null);
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
        ks p10 = ks.p();
        ImageReceiver imageReceiver = p10.A;
        org.telegram.messenger.gf gfVar = this.f45123c;
        if (gfVar.f26825c != null) {
            try {
                new File(gfVar.f26825c).delete();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            gfVar.f26825c = null;
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
        gfVar.f26825c = org.telegram.messenger.w7.J(a02, null, true, true).toString();
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
        photoViewer.f41535v7 = true;
        R();
        photoViewer.f41470o5.p(this.f45121a, this.f45122b, str, null, false, 0L, null, null, photoViewer.r1(), this.f45123c.f26825c, null, photoViewer.f41545w7);
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final void u(CharSequence charSequence, String str, org.telegram.ui.Components.ex exVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f41535v7 = true;
        R();
        photoViewer.f41470o5.p(this.f45121a, this.f45122b, str, charSequence, false, 0L, null, null, photoViewer.r1(), this.f45123c.f26825c, exVar, null);
    }

    @Override
    public final void w(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f41535v7 = true;
        R();
        photoViewer.f41470o5.p(this.f45121a, this.f45122b, str, null, false, 0L, stickerSet, photoViewer.f41509s7, photoViewer.r1(), this.f45123c.f26825c, null, null);
    }

    @Override
    public final boolean y() {
        uq0 uq0Var;
        TLRPC.Chat chat;
        PhotoViewer photoViewer = this.h;
        an anVar = photoViewer.f41436k4;
        if ((anVar == null || (chat = anVar.f43771e) == null || org.telegram.messenger.t3.t(chat)) && (uq0Var = photoViewer.d) != null) {
            if (!uq0Var.Q() || photoViewer.f41436k4 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void z(String str) {
        PhotoViewer photoViewer = this.h;
        uq0 uq0Var = photoViewer.d;
        if (uq0Var != null) {
            boolean Q = uq0Var.Q();
            org.telegram.messenger.gf gfVar = this.f45123c;
            if (Q) {
                if (photoViewer.f41436k4 == null) {
                    return;
                }
                photoViewer.f41535v7 = true;
                R();
                photoViewer.f41470o5.p(this.f45121a, this.f45122b, str, null, false, photoViewer.f41436k4.a(), null, null, photoViewer.r1(), gfVar.f26825c, null, null);
                return;
            }
            photoViewer.f41535v7 = true;
            R();
            gfVar.h = this.f45121a;
            photoViewer.d.o(photoViewer.O4, this.f45122b, this.d, this.f45124e, this.f45125f, this.f45126g);
            org.telegram.messenger.qs.f(org.telegram.messenger.p10.f24467s0).m(org.telegram.messenger.qs.f25065s3, Boolean.TRUE);
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
