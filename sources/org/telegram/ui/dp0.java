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
public final class dp0 implements ls {
    public final String f47209a;
    public final org.telegram.messenger.d20 f47210b;
    public final org.telegram.messenger.ef f47211c;
    public final boolean d;
    public final int f47212e;
    public final int f47213f;
    public final boolean f47214g;
    public final PhotoViewer h;

    public dp0(PhotoViewer photoViewer, String str, org.telegram.messenger.d20 d20Var, org.telegram.messenger.ef efVar, boolean z10, int i7, int i10, boolean z11) {
        this.h = photoViewer;
        this.f47209a = str;
        this.f47210b = d20Var;
        this.f47211c = efVar;
        this.d = z10;
        this.f47212e = i7;
        this.f47213f = i10;
        this.f47214g = z11;
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
    public final org.telegram.ui.Components.x60 D(ai.h0 h0Var) {
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
        if (this.h.f43518z7 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void K(CharSequence charSequence, String str, org.telegram.ui.Components.ph phVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.C7 = true;
        R();
        photoViewer.f43423p5.p(this.f47209a, this.f47210b, str, charSequence, false, 0L, null, null, photoViewer.r1(), this.f47211c.f27964c, phVar, null);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        return false;
    }

    @Override
    public final void O(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.C7 = true;
        R();
        photoViewer.f43423p5.p(this.f47209a, this.f47210b, str, null, true, 0L, null, null, photoViewer.r1(), this.f47211c.f27964c, null, null);
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
        org.telegram.messenger.ef efVar = this.f47211c;
        if (efVar.f27964c != null) {
            try {
                new File(efVar.f27964c).delete();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            efVar.f27964c = null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (imageReceiver != null) {
            imageReceiver.setAlpha(1.0f);
            imageReceiver.z0(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
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
        Drawable[] drawableArr = PhotoViewer.f43272f9;
        PhotoViewer photoViewer = this.h;
        TLRPC.PhotoSize a02 = org.telegram.messenger.ec.a0(createBitmap, photoViewer.c1(), 512.0f, 512.0f, 83);
        org.telegram.messenger.w7.G(photoViewer.U);
        efVar.f27964c = org.telegram.messenger.w7.J(a02, null, true, true).toString();
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
    public final boolean k(int i7) {
        return false;
    }

    @Override
    public final void m(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.C7 = true;
        R();
        photoViewer.f43423p5.p(this.f47209a, this.f47210b, str, null, false, 0L, null, null, photoViewer.r1(), this.f47211c.f27964c, null, photoViewer.D7);
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.C7 = true;
        R();
        photoViewer.f43423p5.p(this.f47209a, this.f47210b, str, null, false, 0L, stickerSet, photoViewer.f43518z7, photoViewer.r1(), this.f47211c.f27964c, null, null);
    }

    @Override
    public final boolean w() {
        uq0 uq0Var;
        TLRPC.Chat chat;
        PhotoViewer photoViewer = this.h;
        bn bnVar = photoViewer.f43388l4;
        if ((bnVar == null || (chat = bnVar.f46173e) == null || org.telegram.messenger.v3.t(chat)) && (uq0Var = photoViewer.d) != null) {
            if (!uq0Var.Q() || photoViewer.f43388l4 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void x(String str) {
        PhotoViewer photoViewer = this.h;
        uq0 uq0Var = photoViewer.d;
        if (uq0Var != null) {
            boolean Q = uq0Var.Q();
            org.telegram.messenger.ef efVar = this.f47211c;
            if (Q) {
                if (photoViewer.f43388l4 == null) {
                    return;
                }
                photoViewer.C7 = true;
                R();
                photoViewer.f43423p5.p(this.f47209a, this.f47210b, str, null, false, photoViewer.f43388l4.a(), null, null, photoViewer.r1(), efVar.f27964c, null, null);
                return;
            }
            photoViewer.C7 = true;
            R();
            efVar.h = this.f47209a;
            photoViewer.d.o(photoViewer.P4, this.f47210b, this.d, this.f47212e, this.f47213f, this.f47214g);
            org.telegram.messenger.ks.f(org.telegram.messenger.i10.f24637t0).m(org.telegram.messenger.ks.f25300u3, Boolean.TRUE);
        }
    }

    @Override
    public final org.telegram.messenger.fj y() {
        return null;
    }

    @Override
    public final boolean z() {
        if (this.h.D7 != null) {
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
    public final void i(org.telegram.messenger.sy syVar) {
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
    public final void L() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
    }

    @Override
    public final void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
    }
}
