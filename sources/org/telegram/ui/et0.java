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
public final class et0 implements qt {
    public final String f36170a;
    public final VideoEditedInfo f36171b;
    public final MediaController.PhotoEntry f36172c;
    public final boolean d;
    public final int f36173e;
    public final int f36174f;
    public final boolean f36175g;
    public final PhotoViewer h;

    public et0(PhotoViewer photoViewer, String str, VideoEditedInfo videoEditedInfo, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11) {
        this.h = photoViewer;
        this.f36170a = str;
        this.f36171b = videoEditedInfo;
        this.f36172c = photoEntry;
        this.d = z10;
        this.f36173e = i10;
        this.f36174f = i11;
        this.f36175g = z11;
    }

    @Override
    public final boolean A() {
        if (this.h.f33725x7 != null) {
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
    public final String F(boolean z10) {
        return null;
    }

    @Override
    public final void G(CharSequence charSequence, String str, nf nfVar) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f33715w7 = true;
        R();
        photoViewer.p5.p(this.f36170a, this.f36171b, str, charSequence, false, 0L, null, null, photoViewer.v1(), this.f36172c.thumbPath, nfVar, null);
    }

    @Override
    public final boolean I() {
        return false;
    }

    @Override
    public final boolean J() {
        if (this.h.f33687t7 != null) {
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
        photoViewer.f33715w7 = true;
        R();
        photoViewer.p5.p(this.f36170a, this.f36171b, str, null, true, 0L, null, null, photoViewer.v1(), this.f36172c.thumbPath, null, null);
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
        st q6 = st.q();
        ImageReceiver imageReceiver = q6.A;
        MediaController.PhotoEntry photoEntry = this.f36172c;
        if (photoEntry.thumbPath != null) {
            try {
                new File(photoEntry.thumbPath).delete();
            } catch (Exception e7) {
                FileLog.e(e7);
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
        Drawable[] drawableArr = PhotoViewer.T8;
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
        photoViewer.f33715w7 = true;
        R();
        photoViewer.p5.p(this.f36170a, this.f36171b, str, null, false, 0L, null, null, photoViewer.v1(), this.f36172c.thumbPath, null, photoViewer.f33725x7);
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final org.telegram.ui.Components.n70 t(ah.w wVar) {
        return null;
    }

    @Override
    public final void v(TLRPC.StickerSet stickerSet, String str) {
        PhotoViewer photoViewer = this.h;
        photoViewer.f33715w7 = true;
        R();
        photoViewer.p5.p(this.f36170a, this.f36171b, str, null, false, 0L, stickerSet, photoViewer.f33687t7, photoViewer.v1(), this.f36172c.thumbPath, null, null);
    }

    @Override
    public final boolean x() {
        PhotoViewer photoViewer = this.h;
        av0 av0Var = photoViewer.d;
        if (av0Var != null) {
            if (!av0Var.P() || photoViewer.l4 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void y(String str) {
        PhotoViewer photoViewer = this.h;
        av0 av0Var = photoViewer.d;
        if (av0Var != null) {
            boolean P = av0Var.P();
            MediaController.PhotoEntry photoEntry = this.f36172c;
            if (P) {
                if (photoViewer.l4 == null) {
                    return;
                }
                photoViewer.f33715w7 = true;
                R();
                photoViewer.p5.p(this.f36170a, this.f36171b, str, null, false, photoViewer.l4.a(), null, null, photoViewer.v1(), photoEntry.thumbPath, null, null);
                return;
            }
            photoViewer.f33715w7 = true;
            R();
            photoEntry.imagePath = this.f36170a;
            photoViewer.d.o(photoViewer.P4, this.f36171b, this.d, this.f36173e, this.f36174f, this.f36175g);
            NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.TRUE);
        }
    }

    @Override
    public final MessageObject z() {
        return null;
    }

    @Override
    public final void B(TLRPC.Document document) {
    }

    @Override
    public final void E(TLRPC.Document document) {
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
    public final void u(TLRPC.Document document) {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void w(TLObject tLObject, Object obj) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
