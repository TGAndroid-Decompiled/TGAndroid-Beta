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
public final class bp0 implements ls {
    public final String f45803a;
    public final org.telegram.messenger.g20 f45804b;
    public final org.telegram.messenger.ff f45805c;
    public final boolean d;
    public final int f45806e;
    public final int f45807f;
    public final boolean f45808g;
    public final PhotoViewer h;

    public bp0(PhotoViewer photoViewer, String str, org.telegram.messenger.g20 g20Var, org.telegram.messenger.ff ffVar, boolean z10, int i7, int i10, boolean z11) {
        this.h = photoViewer;
        this.f45803a = str;
        this.f45804b = g20Var;
        this.f45805c = ffVar;
        this.d = z10;
        this.f45806e = i7;
        this.f45807f = i10;
        this.f45808g = z11;
    }

    @Override
    public final boolean A() {
        if (this.h.f42928x7 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.m60 E(ai.k0 k0Var) {
        return null;
    }

    @Override
    public final String G(boolean z10) {
        return null;
    }

    @Override
    public final boolean I() {
        return false;
    }

    @Override
    public final boolean J() {
        if (this.h.f42890t7 != null) {
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
        photoViewer.f42918w7 = true;
        R();
        photoViewer.f42852p5.p(this.f45803a, this.f45804b, str, null, true, 0L, null, null, photoViewer.r1(), this.f45805c.f27711c, null, null);
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
        org.telegram.messenger.ff ffVar = this.f45805c;
        if (ffVar.f27711c != null) {
            try {
                new File(ffVar.f27711c).delete();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            ffVar.f27711c = null;
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
        Drawable[] drawableArr = PhotoViewer.Z8;
        PhotoViewer photoViewer = this.h;
        TLRPC.PhotoSize a02 = org.telegram.messenger.fc.a0(createBitmap, photoViewer.c1(), 512.0f, 512.0f, 83);
        org.telegram.messenger.w7.G(photoViewer.U);
        ffVar.f27711c = org.telegram.messenger.w7.J(a02, null, true, true).toString();
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
        photoViewer.f42918w7 = true;
        R();
        photoViewer.f42852p5.p(this.f45803a, this.f45804b, str, null, false, 0L, null, null, photoViewer.r1(), this.f45805c.f27711c, null, photoViewer.f42928x7);
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f42918w7 = true;
        R();
        photoViewer.f42852p5.p(this.f45803a, this.f45804b, str, null, false, 0L, stickerSet, photoViewer.f42890t7, photoViewer.r1(), this.f45805c.f27711c, null, null);
    }

    @Override
    public final boolean w() {
        sq0 sq0Var;
        TLRPC.Chat chat;
        PhotoViewer photoViewer = this.h;
        an anVar = photoViewer.f42817l4;
        if ((anVar == null || (chat = anVar.f45172e) == null || org.telegram.messenger.t3.t(chat)) && (sq0Var = photoViewer.d) != null) {
            if (!sq0Var.Q() || photoViewer.f42817l4 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void x(String str) {
        PhotoViewer photoViewer = this.h;
        sq0 sq0Var = photoViewer.d;
        if (sq0Var != null) {
            boolean Q = sq0Var.Q();
            org.telegram.messenger.ff ffVar = this.f45805c;
            if (Q) {
                if (photoViewer.f42817l4 == null) {
                    return;
                }
                photoViewer.f42918w7 = true;
                R();
                photoViewer.f42852p5.p(this.f45803a, this.f45804b, str, null, false, photoViewer.f42817l4.a(), null, null, photoViewer.r1(), ffVar.f27711c, null, null);
                return;
            }
            photoViewer.f42918w7 = true;
            R();
            ffVar.h = this.f45803a;
            photoViewer.d.o(photoViewer.P4, this.f45804b, this.d, this.f45806e, this.f45807f, this.f45808g);
            org.telegram.messenger.ns.f(org.telegram.messenger.m10.f24940t0).m(org.telegram.messenger.ns.f25571s3, Boolean.TRUE);
        }
    }

    @Override
    public final void y(CharSequence charSequence, String str, org.telegram.ui.Components.gh ghVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f42918w7 = true;
        R();
        photoViewer.f42852p5.p(this.f45803a, this.f45804b, str, charSequence, false, 0L, null, null, photoViewer.r1(), this.f45805c.f27711c, ghVar, null);
    }

    @Override
    public final org.telegram.messenger.gj z() {
        return null;
    }

    @Override
    public final void B(TLRPC.Document document) {
    }

    @Override
    public final void F(TLRPC.Document document) {
    }

    @Override
    public final void H(TLRPC.Document document) {
    }

    @Override
    public final void i(org.telegram.messenger.xy xyVar) {
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
    public final void K() {
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
