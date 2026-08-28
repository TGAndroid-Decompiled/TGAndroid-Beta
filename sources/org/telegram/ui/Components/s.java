package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.camera.CameraController;
public final class s implements org.telegram.ui.ActionBar.b2, nk0, xb0, yb0, zb0, td.d, ImageReceiver.ImageReceiverDelegate, x4, r0.o, ch.a, t0.f, ok0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.r5, ih.i9, org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.m1, dh.q {
    public final int f32324a;
    public final Object f32325b;

    public s(Object obj, int i9) {
        this.f32324a = i9;
        this.f32325b = obj;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        int i11;
        g8 g8Var = (g8) this.f32325b;
        int i12 = i9 * 60;
        if (i9 == 0) {
            i11 = 71;
        } else {
            i11 = 70;
        }
        g8Var.V0(i12, i11);
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean I(float f10) {
        return false;
    }

    @Override
    public r0.m1 L0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        bb bbVar = ((cb) this.f32325b).f27452a;
        if (bbVar != null) {
            bbVar.setPadding(defaultWindowInsets.f10848a, defaultWindowInsets.f10849b, defaultWindowInsets.f10850c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.m1.f46928b;
    }

    @Override
    public void T(long j10, int i9, ih.n3 n3Var) {
        n3Var.run();
    }

    @Override
    public boolean a(int i9, View view) {
        Object O;
        fk fkVar = (fk) this.f32325b;
        f2.r0 adapter = fkVar.f28459r.getAdapter();
        yj yjVar = fkVar.v;
        if (adapter == yjVar) {
            O = yjVar.E(i9);
        } else {
            ek ekVar = fkVar.f28463y;
            O = ekVar.O(ekVar.S(i9), ekVar.Q(i9));
        }
        return fkVar.O(view, O);
    }

    @Override
    public void c(float f10, float f11, int i9, View view) {
        g0.O((g0) this.f32325b, view, i9, f10);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i9 = this.f32324a;
        Object obj = this.f32325b;
        switch (i9) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new e6((q6) obj, 1));
                duration.start();
                return;
            default:
                o9 o9Var = (o9) obj;
                o9Var.getClass();
                if (z10 && !z11) {
                    o9Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public void didSetImageBitmap(int i9, String str, Drawable drawable) {
        int i10 = this.f32324a;
        org.telegram.messenger.g5.a(this, i9, str, drawable);
    }

    @Override
    public void e(dh.l lVar, float f10, float f11) {
        ((ot) this.f32325b).c(lVar, f10, f11);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f32324a) {
            case 0:
                y.R((y) this.f32325b, c2Var);
                return;
            case 2:
                ((org.telegram.ui.k6) this.f32325b).run();
                return;
            case 3:
                ((bg.i2) this.f32325b).run();
                return;
            case 4:
                ((ff.k0) this.f32325b).run();
                return;
            case 5:
                ((s1) this.f32325b).run();
                return;
            case 6:
                ((pr) this.f32325b).run();
                return;
            case 8:
                ((m2) this.f32325b).run();
                return;
            case 17:
                ((xf) this.f32325b).f34670a.Q0.r();
                return;
            case 19:
                ((org.telegram.ui.wq) this.f32325b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((jn) this.f32325b).f27493b.dismiss();
                return;
            default:
                ((nm) this.f32325b).f31128a.A.r();
                return;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public String g(int i9) {
        return ((String[]) this.f32325b)[i9];
    }

    @Override
    public boolean h(t0.j jVar, int i9, Bundle bundle) {
        dg dgVar = (dg) this.f32325b;
        ChatActivityEnterView chatActivityEnterView = dgVar.d;
        if (chatActivityEnterView.f26119g5) {
            return true;
        }
        int i10 = n0.a.f18247a;
        if (Build.VERSION.SDK_INT >= 25 && (i9 & 1) != 0) {
            try {
                jVar.f47592a.f();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.i iVar = jVar.f47592a;
        if (!iVar.j().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, iVar.c())) {
            dgVar.m(iVar.c(), iVar.j().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            y4.M(chatActivityEnterView.J2, chatActivityEnterView.K2.a(), new g1(11, dgVar, jVar), chatActivityEnterView.R3);
            return true;
        } else {
            dgVar.o(jVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public void i(int i9) {
        bq bqVar = ((cq) this.f32325b).f27543a;
        boolean z10 = true;
        if (i9 != 1 && i9 != 2) {
            if (i9 == 3) {
                bqVar.k();
                return;
            }
            return;
        }
        if (i9 != 2) {
            z10 = false;
        }
        bqVar.e(z10);
    }

    @Override
    public void j(int i9) {
        u2 u2Var = (u2) this.f32325b;
        if (i9 == 0) {
            u2Var.run();
        }
    }

    @Override
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var = ((nr) this.f32325b).f31170a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && o1Var != null && o1Var.isShowing()) {
            o1Var.d(true);
        }
    }

    @Override
    public void l(Canvas canvas, int i9) {
        ((lb) this.f32325b).dispatchDrawImplBlur(canvas, i9);
    }

    @Override
    public void m(bc0 bc0Var, int i9) {
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) this.f32325b;
        try {
            if (i9 == 0) {
                u3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
            } else {
                u3Var.setText(LocaleController.getString(R.string.SetAutoDeleteTimer));
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public void n1() {
        a6 a6Var = (a6) this.f32325b;
        a6Var.b();
        a6Var.e();
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i9 = this.f32324a;
        org.telegram.messenger.g5.b(this, imageReceiver);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        int i9;
        int i10;
        MediaController.PhotoEntry photoEntry;
        BitmapFactory.Options options;
        il ilVar = (il) this.f32325b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ilVar.f29454e;
        ki kiVar = chatAttachAlertPhotoLayout.f27493b;
        if (ilVar.f29451a != null && !kiVar.R && chatAttachAlertPhotoLayout.L != null) {
            ChatAttachAlertPhotoLayout.f26241m1 = false;
            try {
                options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(new File(str).getAbsolutePath(), options);
                i9 = options.outWidth;
            } catch (Exception unused) {
                i9 = 0;
            }
            try {
                i10 = options.outHeight;
            } catch (Exception unused2) {
                i10 = 0;
                int i11 = i9;
                int i12 = ChatAttachAlertPhotoLayout.f26245q1;
                ChatAttachAlertPhotoLayout.f26245q1 = i12 - 1;
                photoEntry = new MediaController.PhotoEntry(0, i12, 0L, ilVar.f29451a.getAbsolutePath(), 0, true, i11, i10, 0L);
                photoEntry.duration = (int) (((float) j10) / 1000.0f);
                photoEntry.thumbPath = str;
                if (kiVar.M0 != 0) {
                    MediaController.CropState cropState = new MediaController.CropState();
                    photoEntry.cropState = cropState;
                    cropState.mirrored = true;
                    cropState.freeform = false;
                    cropState.lockedAspectRatio = 1.0f;
                }
                chatAttachAlertPhotoLayout.i0(photoEntry, false, false);
            }
            int i112 = i9;
            int i122 = ChatAttachAlertPhotoLayout.f26245q1;
            ChatAttachAlertPhotoLayout.f26245q1 = i122 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i122, 0L, ilVar.f29451a.getAbsolutePath(), 0, true, i112, i10, 0L);
            photoEntry.duration = (int) (((float) j10) / 1000.0f);
            photoEntry.thumbPath = str;
            if (kiVar.M0 != 0 && chatAttachAlertPhotoLayout.L.isFrontface()) {
                MediaController.CropState cropState2 = new MediaController.CropState();
                photoEntry.cropState = cropState2;
                cropState2.mirrored = true;
                cropState2.freeform = false;
                cropState2.lockedAspectRatio = 1.0f;
            }
            chatAttachAlertPhotoLayout.i0(photoEntry, false, false);
        }
    }

    @Override
    public boolean y0(long j10, int i9, int i10, int i11, ih.j9 j9Var) {
        pn pnVar = (pn) ((org.telegram.ui.Cells.l6) this.f32325b).T;
        ImageReceiver imageReceiver = pnVar.f31328a;
        j9Var.f11644c = imageReceiver;
        j9Var.f11651l = imageReceiver;
        org.telegram.ui.Cells.l6 l6Var = pnVar.C;
        j9Var.f11652m = l6Var;
        boolean z10 = l6Var.f11735w;
        pn pnVar2 = pnVar.G.f32731e;
        j9Var.f11642a = pnVar2;
        j9Var.f11650k = pnVar2.getAlpha();
        j9Var.h = 0.0f;
        j9Var.f11648i = AndroidUtilities.displaySize.y;
        j9Var.f11647g = (View) pnVar.getParent();
        return true;
    }

    @Override
    public void D(boolean z10) {
    }

    @Override
    public void L() {
    }

    @Override
    public void b() {
    }

    @Override
    public void d(boolean z10) {
    }

    @Override
    public void g0(View view, float f10, float f11) {
    }
}
