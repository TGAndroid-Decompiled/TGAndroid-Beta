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
public final class bs0 implements ft {
    public final String f36899a;
    public final VideoEditedInfo f36900b;
    public final MediaController.PhotoEntry f36901c;
    public final boolean d;
    public final int f36902e;
    public final int f36903f;
    public final boolean f36904g;
    public final PhotoViewer h;

    public bs0(PhotoViewer photoViewer, String str, VideoEditedInfo videoEditedInfo, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11) {
        this.h = photoViewer;
        this.f36899a = str;
        this.f36900b = videoEditedInfo;
        this.f36901c = photoEntry;
        this.d = z10;
        this.f36902e = i10;
        this.f36903f = i11;
        this.f36904g = z11;
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
    public final String E(boolean z10) {
        return null;
    }

    @Override
    public final void F(CharSequence charSequence, String str, tm tmVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f35816s7 = true;
        R();
        photoViewer.f35751l5.p(this.f36899a, this.f36900b, str, charSequence, false, 0L, null, null, photoViewer.v1(), this.f36901c.thumbPath, tmVar, null);
    }

    @Override
    public final org.telegram.ui.Components.j70 G(bg.d1 d1Var) {
        return null;
    }

    @Override
    public final boolean I() {
        return false;
    }

    @Override
    public final boolean J() {
        if (this.h.f35789p7 != null) {
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
        photoViewer.f35816s7 = true;
        R();
        photoViewer.f35751l5.p(this.f36899a, this.f36900b, str, null, true, 0L, null, null, photoViewer.v1(), this.f36901c.thumbPath, null, null);
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
        ht q6 = ht.q();
        ImageReceiver imageReceiver = q6.A;
        MediaController.PhotoEntry photoEntry = this.f36901c;
        if (photoEntry.thumbPath != null) {
            try {
                new File(photoEntry.thumbPath).delete();
            } catch (Exception e10) {
                FileLog.e(e10);
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
        Drawable[] drawableArr = PhotoViewer.P8;
        PhotoViewer photoViewer = this.h;
        photoEntry.thumbPath = FileLoader.getInstance(photoViewer.P).getPathToAttach(ImageLoader.scaleAndSaveImage(createBitmap, photoViewer.g1(), 512.0f, 512.0f, 83, false, 101, 101), true).toString();
    }

    @Override
    public final long a() {
        return this.h.A5;
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
        photoViewer.f35816s7 = true;
        R();
        photoViewer.f35751l5.p(this.f36899a, this.f36900b, str, null, false, 0L, null, null, photoViewer.v1(), this.f36901c.thumbPath, null, photoViewer.f35825t7);
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f35816s7 = true;
        R();
        photoViewer.f35751l5.p(this.f36899a, this.f36900b, str, null, false, 0L, stickerSet, photoViewer.f35789p7, photoViewer.v1(), this.f36901c.thumbPath, null, null);
    }

    @Override
    public final boolean w() {
        PhotoViewer photoViewer = this.h;
        xt0 xt0Var = photoViewer.d;
        if (xt0Var != null) {
            if (!xt0Var.P() || photoViewer.f35715h4 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void x(String str) {
        PhotoViewer photoViewer = this.h;
        xt0 xt0Var = photoViewer.d;
        if (xt0Var != null) {
            boolean P = xt0Var.P();
            MediaController.PhotoEntry photoEntry = this.f36901c;
            if (P) {
                if (photoViewer.f35715h4 == null) {
                    return;
                }
                photoViewer.f35816s7 = true;
                R();
                photoViewer.f35751l5.p(this.f36899a, this.f36900b, str, null, false, photoViewer.f35715h4.a(), null, null, photoViewer.v1(), photoEntry.thumbPath, null, null);
                return;
            }
            photoViewer.f35816s7 = true;
            R();
            photoEntry.imagePath = this.f36899a;
            photoViewer.d.o(photoViewer.L4, this.f36900b, this.d, this.f36902e, this.f36903f, this.f36904g);
            NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.TRUE);
        }
    }

    @Override
    public final MessageObject y() {
        return null;
    }

    @Override
    public final boolean z() {
        if (this.h.f35825t7 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void A(TLRPC.Document document) {
    }

    @Override
    public final void D(TLRPC.Document document) {
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
    public final void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override
    public final void n(TLRPC.Document document) {
    }

    @Override
    public final void p(TLRPC.Document document) {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void t(TLRPC.Document document) {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
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
