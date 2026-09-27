package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class at0 implements ot {
    public final String f32141a;
    public final VideoEditedInfo f32142b;
    public final MediaController.PhotoEntry f32143c;
    public final boolean d;
    public final int e;
    public final int f32144f;
    public final boolean f32145g;
    public final PhotoViewer h;

    public at0(PhotoViewer photoViewer, String str, VideoEditedInfo videoEditedInfo, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11) {
        this.h = photoViewer;
        this.f32141a = str;
        this.f32142b = videoEditedInfo;
        this.f32143c = photoEntry;
        this.d = z10;
        this.e = i10;
        this.f32144f = i11;
        this.f32145g = z11;
    }

    @Override
    public final MessageObject A() {
        return null;
    }

    @Override
    public final boolean B() {
        if (this.h.f31401x7 != null) {
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
    public final String G(boolean z10) {
        return null;
    }

    @Override
    public final boolean I() {
        return false;
    }

    @Override
    public final boolean J() {
        if (this.h.f31363t7 != null) {
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
        photoViewer.f31391w7 = true;
        R();
        photoViewer.p5.p(this.f32141a, this.f32142b, str, null, true, 0L, null, null, photoViewer.v1(), this.f32143c.thumbPath, null, null);
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
        qt q6 = qt.q();
        ImageReceiver imageReceiver = q6.A;
        MediaController.PhotoEntry photoEntry = this.f32143c;
        if (photoEntry.thumbPath != null) {
            try {
                new File(photoEntry.thumbPath).delete();
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoEntry.thumbPath = null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (imageReceiver != null) {
            imageReceiver.setAlpha(1.0f);
            imageReceiver.setImageCoords(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
            imageReceiver.draw(canvas);
        }
        if (q6.C != null) {
            canvas.save();
            canvas.scale(createBitmap.getWidth() / q6.C.getWidth(), createBitmap.getHeight() / q6.C.getHeight());
            q6.C.setAlpha(1.0f);
            Path path = new Path();
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, q6.C.getWidth(), q6.C.getHeight());
            path.addRoundRect(rectF, q6.C.getWidth() / 8.0f, q6.C.getHeight() / 8.0f, Path.Direction.CW);
            canvas.clipPath(path);
            q6.C.draw(canvas);
            canvas.restore();
        }
        Drawable[] drawableArr = PhotoViewer.U8;
        PhotoViewer photoViewer = this.h;
        photoEntry.thumbPath = FileLoader.getInstance(photoViewer.T).getPathToAttach(ImageLoader.scaleAndSaveImage(createBitmap, photoViewer.g1(), 512.0f, 512.0f, 83, false, 101, 101), true).toString();
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
    public final void f(CharSequence charSequence, String str, et etVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f31391w7 = true;
        R();
        photoViewer.p5.p(this.f32141a, this.f32142b, str, charSequence, false, 0L, null, null, photoViewer.v1(), this.f32143c.thumbPath, etVar, null);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final TLRPC.PollAnswer h() {
        return null;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final org.telegram.ui.Components.a80 j(ci.m6 m6Var) {
        return null;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean m(int i10) {
        return false;
    }

    @Override
    public final void o(String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f31391w7 = true;
        R();
        photoViewer.p5.p(this.f32141a, this.f32142b, str, null, false, 0L, null, null, photoViewer.v1(), this.f32143c.thumbPath, null, photoViewer.f31401x7);
    }

    @Override
    public final boolean q() {
        return true;
    }

    @Override
    public final void w(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f31391w7 = true;
        R();
        photoViewer.p5.p(this.f32141a, this.f32142b, str, null, false, 0L, stickerSet, photoViewer.f31363t7, photoViewer.v1(), this.f32143c.thumbPath, null, null);
    }

    @Override
    public final boolean y() {
        PhotoViewer photoViewer = this.h;
        wu0 wu0Var = photoViewer.d;
        if (wu0Var != null) {
            if (!wu0Var.P() || photoViewer.l4 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void z(String str) {
        PhotoViewer photoViewer = this.h;
        wu0 wu0Var = photoViewer.d;
        if (wu0Var != null) {
            boolean P = wu0Var.P();
            MediaController.PhotoEntry photoEntry = this.f32143c;
            if (P) {
                if (photoViewer.l4 == null) {
                    return;
                }
                photoViewer.f31391w7 = true;
                R();
                photoViewer.p5.p(this.f32141a, this.f32142b, str, null, false, photoViewer.l4.a(), null, null, photoViewer.v1(), photoEntry.thumbPath, null, null);
                return;
            }
            photoViewer.f31391w7 = true;
            R();
            photoEntry.imagePath = this.f32141a;
            photoViewer.d.o(photoViewer.P4, this.f32142b, this.d, this.e, this.f32144f, this.f32145g);
            NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.TRUE);
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
    public final void K() {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void k(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override
    public final void p(TLRPC.Document document) {
    }

    @Override
    public final void r(TLRPC.Document document) {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void v(TLRPC.Document document) {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void x(TLObject tLObject, Object obj) {
    }

    @Override
    public final void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
