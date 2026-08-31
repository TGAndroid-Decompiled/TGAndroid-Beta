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
public final class t implements org.telegram.ui.ActionBar.c2, kl0, uc0, vc0, wc0, xd.d, ImageReceiver.ImageReceiverDelegate, y4, r0.o, ih.a, t0.e, ll0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.r5, oh.e9, org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.n1, jh.o {
    public final int f31210a;
    public final Object f31211b;

    public t(Object obj, int i10) {
        this.f31210a = i10;
        this.f31211b = obj;
    }

    @Override
    public void E() {
        b6 b6Var = (b6) this.f31211b;
        b6Var.b();
        b6Var.e();
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        int i12;
        g8 g8Var = (g8) this.f31211b;
        int i13 = i10 * 60;
        if (i10 == 0) {
            i12 = 71;
        } else {
            i12 = 70;
        }
        g8Var.Q0(i13, i12);
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        bb bbVar = ((cb) this.f31211b).f25905a;
        if (bbVar != null) {
            bbVar.setPadding(defaultWindowInsets.f7757a, defaultWindowInsets.f7758b, defaultWindowInsets.f7759c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.m1.f46451b;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void b0(long j10, int i10, oh.l3 l3Var) {
        l3Var.run();
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        h0.P((h0) this.f31211b, view, i10, f10);
    }

    @Override
    public boolean d(t0.i iVar, int i10, Bundle bundle) {
        dg dgVar = (dg) this.f31211b;
        ChatActivityEnterView chatActivityEnterView = dgVar.d;
        if (chatActivityEnterView.f24619h5) {
            return true;
        }
        int i11 = n0.a.f15172a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f47829a.b();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = iVar.f47829a;
        if (!hVar.getDescription().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, hVar.a())) {
            dgVar.m(hVar.a(), hVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            z4.M(chatActivityEnterView.K2, chatActivityEnterView.L2.a(), new o1(10, dgVar, iVar), chatActivityEnterView.S3);
            return true;
        } else {
            dgVar.o(iVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        int i10 = this.f31210a;
        Object obj = this.f31211b;
        switch (i10) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new f6((r6) obj, 1));
                duration.start();
                return;
            default:
                p9 p9Var = (p9) obj;
                p9Var.getClass();
                if (z4 && !z10) {
                    p9Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.f31210a;
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        return ((String[]) this.f31211b)[i10];
    }

    @Override
    public boolean f(int i10, View view) {
        Object O;
        jk jkVar = (jk) this.f31211b;
        f2.p0 adapter = jkVar.f28143r.getAdapter();
        bk bkVar = jkVar.v;
        if (adapter == bkVar) {
            O = bkVar.E(i10);
        } else {
            ik ikVar = jkVar.f28147y;
            O = ikVar.O(ikVar.S(i10), ikVar.Q(i10));
        }
        return jkVar.P(view, O);
    }

    @Override
    public void g(int i10) {
        u2 u2Var = (u2) this.f31211b;
        if (i10 == 0) {
            u2Var.run();
        }
    }

    @Override
    public void h(int i10) {
        lq lqVar = ((mq) this.f31211b).f29184a;
        boolean z4 = true;
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                lqVar.x();
                return;
            }
            return;
        }
        if (i10 != 2) {
            z4 = false;
        }
        lqVar.k(z4);
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f31210a) {
            case 0:
                z.S((z) this.f31211b, d2Var);
                return;
            case 2:
                ((org.telegram.ui.ih) this.f31211b).run();
                return;
            case 3:
                ((hg.y1) this.f31211b).run();
                return;
            case 4:
                ((lf.j0) this.f31211b).run();
                return;
            case 5:
                ((u1) this.f31211b).run();
                return;
            case 6:
                ((zr) this.f31211b).run();
                return;
            case 8:
                ((o2) this.f31211b).run();
                return;
            case 17:
                ((xf) this.f31211b).f33058a.R0.r();
                return;
            case 19:
                ((org.telegram.ui.mp) this.f31211b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((sn) this.f31211b).f26546b.dismiss();
                return;
            default:
                ((wm) this.f31211b).f32797a.B.r();
                return;
        }
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public boolean k1(long j10, int i10, int i11, int i12, oh.f9 f9Var) {
        xn xnVar = (xn) ((org.telegram.ui.Cells.l6) this.f31211b).T;
        ImageReceiver imageReceiver = xnVar.f29998a;
        f9Var.f17146c = imageReceiver;
        f9Var.f17153l = imageReceiver;
        org.telegram.ui.Cells.l6 l6Var = xnVar.D;
        f9Var.f17154m = l6Var;
        boolean z4 = l6Var.f17242w;
        xn xnVar2 = xnVar.H.f25668e;
        f9Var.f17144a = xnVar2;
        f9Var.f17152k = xnVar2.getAlpha();
        f9Var.h = 0.0f;
        f9Var.f17150i = AndroidUtilities.displaySize.y;
        f9Var.f17149g = (View) xnVar.getParent();
        return true;
    }

    @Override
    public boolean l(float f10) {
        return false;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var = ((xr) this.f31211b).f33166a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && p1Var != null && p1Var.isShowing()) {
            p1Var.d(true);
        }
    }

    @Override
    public void o(jh.k kVar, float f10, float f11) {
        ((zt) this.f31211b).c(kVar, f10, f11);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f31210a;
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        BitmapFactory.Options options;
        ol olVar = (ol) this.f31211b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = olVar.f29795e;
        mi miVar = chatAttachAlertPhotoLayout.f26546b;
        if (olVar.f29792a != null && !miVar.S && chatAttachAlertPhotoLayout.M != null) {
            ChatAttachAlertPhotoLayout.f24736n1 = false;
            try {
                options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(new File(str).getAbsolutePath(), options);
                i10 = options.outWidth;
            } catch (Exception unused) {
                i10 = 0;
            }
            try {
                i11 = options.outHeight;
            } catch (Exception unused2) {
                i11 = 0;
                int i12 = i10;
                int i13 = ChatAttachAlertPhotoLayout.f24740r1;
                ChatAttachAlertPhotoLayout.f24740r1 = i13 - 1;
                photoEntry = new MediaController.PhotoEntry(0, i13, 0L, olVar.f29792a.getAbsolutePath(), 0, true, i12, i11, 0L);
                photoEntry.duration = (int) (((float) j10) / 1000.0f);
                photoEntry.thumbPath = str;
                if (miVar.N0 != 0) {
                    MediaController.CropState cropState = new MediaController.CropState();
                    photoEntry.cropState = cropState;
                    cropState.mirrored = true;
                    cropState.freeform = false;
                    cropState.lockedAspectRatio = 1.0f;
                }
                chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
            }
            int i122 = i10;
            int i132 = ChatAttachAlertPhotoLayout.f24740r1;
            ChatAttachAlertPhotoLayout.f24740r1 = i132 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i132, 0L, olVar.f29792a.getAbsolutePath(), 0, true, i122, i11, 0L);
            photoEntry.duration = (int) (((float) j10) / 1000.0f);
            photoEntry.thumbPath = str;
            if (miVar.N0 != 0 && chatAttachAlertPhotoLayout.M.isFrontface()) {
                MediaController.CropState cropState2 = new MediaController.CropState();
                photoEntry.cropState = cropState2;
                cropState2.mirrored = true;
                cropState2.freeform = false;
                cropState2.lockedAspectRatio = 1.0f;
            }
            chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
        }
    }

    @Override
    public void p(Canvas canvas, int i10) {
        ((nb) this.f31211b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override
    public void q(yc0 yc0Var, int i10) {
        org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) this.f31211b;
        try {
            if (i10 == 0) {
                t3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
            } else {
                t3Var.setText(LocaleController.getString(R.string.SetAutoDeleteTimer));
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public void a() {
    }

    @Override
    public void b(boolean z4) {
    }

    @Override
    public void i(boolean z4) {
    }

    @Override
    public void m() {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
