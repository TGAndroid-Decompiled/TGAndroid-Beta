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
public final class s implements org.telegram.ui.ActionBar.z1, gm0, qd0, rd0, sd0, me.f, ImageReceiver.ImageReceiverDelegate, f5, r0.n, uh.a, t0.e, hm0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.r5, ai.gc, org.telegram.ui.ActionBar.q0, org.telegram.ui.ActionBar.k1, vh.k {
    public final int f30679a;
    public final Object f30680b;

    public s(Object obj, int i10) {
        this.f30679a = i10;
        this.f30680b = obj;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        int i12;
        p8 p8Var = (p8) this.f30680b;
        int i13 = i10 * 60;
        if (i10 == 0) {
            i12 = 71;
        } else {
            i12 = 70;
        }
        p8Var.Q0(i13, i12);
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        mb mbVar = ((nb) this.f30680b).f29140a;
        if (mbVar != null) {
            mbVar.setPadding(defaultWindowInsets.f11575a, defaultWindowInsets.f11576b, defaultWindowInsets.f11577c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.k1.f46900b;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void Z(long j3, int i10, ai.e5 e5Var) {
        e5Var.run();
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        g0.Q((g0) this.f30680b, view, i10, f7);
    }

    @Override
    public boolean d(int i10, View view) {
        Object O;
        sk skVar = (sk) this.f30680b;
        s4.i0 adapter = skVar.f30890r.getAdapter();
        lk lkVar = skVar.v;
        if (adapter == lkVar) {
            O = lkVar.E(i10);
        } else {
            rk rkVar = skVar.f30894y;
            O = rkVar.O(rkVar.S(i10), rkVar.Q(i10));
        }
        return skVar.S(view, O);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.f30679a;
        Object obj = this.f30680b;
        switch (i10) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new m6((y6) obj, 1));
                duration.start();
                return;
            default:
                y9 y9Var = (y9) obj;
                y9Var.getClass();
                if (z10 && !z11) {
                    y9Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.f30679a;
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        return ((String[]) this.f30680b)[i10];
    }

    @Override
    public boolean e1(long j3, int i10, int i11, int i12, ai.hc hcVar) {
        qo qoVar = (qo) ((org.telegram.ui.Cells.m6) this.f30680b).T;
        ImageReceiver imageReceiver = qoVar.f33188a;
        hcVar.f1107c = imageReceiver;
        hcVar.f1114l = imageReceiver;
        org.telegram.ui.Cells.m6 m6Var = qoVar.G;
        hcVar.f1115m = m6Var;
        boolean z10 = m6Var.f857w;
        qo qoVar2 = qoVar.K.f31675e;
        hcVar.f1105a = qoVar2;
        hcVar.f1113k = qoVar2.getAlpha();
        hcVar.h = 0.0f;
        hcVar.f1111i = AndroidUtilities.displaySize.y;
        hcVar.f1110g = (View) qoVar.getParent();
        return true;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f30679a) {
            case 0:
                y.T((y) this.f30680b, a2Var);
                return;
            case 2:
                ((org.telegram.ui.ActionBar.l5) this.f30680b).run();
                return;
            case 3:
                ((ai.j) this.f30680b).run();
                return;
            case 4:
                ((ai.db) this.f30680b).run();
                return;
            case 5:
                ((u1) this.f30680b).run();
                return;
            case 6:
                ((qs) this.f30680b).run();
                return;
            case 8:
                ((r2) this.f30680b).run();
                return;
            case 17:
                ((jg) this.f30680b).f27725a.U0.s();
                return;
            case 19:
                ((wc) this.f30680b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((lo) this.f30680b).f30245b.dismiss();
                return;
            case 24:
                ((nn) this.f30680b).f29196a.E.s();
                return;
            default:
                ((yu) this.f30680b).f33461a.d.s();
                return;
        }
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public boolean i(float f7) {
        return false;
    }

    @Override
    public boolean k(t0.i iVar, int i10, Bundle bundle) {
        pg pgVar = (pg) this.f30680b;
        ChatActivityEnterView chatActivityEnterView = pgVar.d;
        if (chatActivityEnterView.f23951l5) {
            return true;
        }
        int i11 = n0.a.f16538a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f48315a.d();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = iVar.f48315a;
        if (!hVar.getDescription().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, hVar.c())) {
            pgVar.m(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            g5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new y2(4, pgVar, iVar), chatActivityEnterView.W3);
            return true;
        } else {
            pgVar.o(iVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public void l(vh.g gVar, float f7, float f10) {
        ((uu) this.f30680b).c(gVar, f7, f10);
    }

    @Override
    public void m(int i10) {
        br brVar = ((cr) this.f30680b).f25449a;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                brVar.y();
                return;
            }
            return;
        }
        if (i10 != 2) {
            z10 = false;
        }
        brVar.l(z10);
    }

    @Override
    public void n(int i10) {
        z2 z2Var = (z2) this.f30680b;
        if (i10 == 0) {
            z2Var.run();
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var = ((os) this.f30680b).f29625a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && m1Var != null && m1Var.isShowing()) {
            m1Var.d(true);
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f30679a;
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        im imVar = (im) this.f30680b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = imVar.f27468e;
        yi yiVar = chatAttachAlertPhotoLayout.f30245b;
        if (imVar.f27465a != null && !yiVar.V && chatAttachAlertPhotoLayout.P != null) {
            ChatAttachAlertPhotoLayout.f24049q1 = false;
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(new File(str).getAbsolutePath(), options);
                i10 = options.outWidth;
                try {
                    i11 = options.outHeight;
                } catch (Exception unused) {
                    i11 = 0;
                    int i12 = i10;
                    int i13 = ChatAttachAlertPhotoLayout.f24053u1;
                    ChatAttachAlertPhotoLayout.f24053u1 = i13 - 1;
                    photoEntry = new MediaController.PhotoEntry(0, i13, 0L, imVar.f27465a.getAbsolutePath(), 0, true, i12, i11, 0L);
                    photoEntry.duration = (int) (((float) j3) / 1000.0f);
                    photoEntry.thumbPath = str;
                    if (yiVar.T0 != 0) {
                        MediaController.CropState cropState = new MediaController.CropState();
                        photoEntry.cropState = cropState;
                        cropState.mirrored = true;
                        cropState.freeform = false;
                        cropState.lockedAspectRatio = 1.0f;
                    }
                    chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
                }
            } catch (Exception unused2) {
                i10 = 0;
            }
            int i122 = i10;
            int i132 = ChatAttachAlertPhotoLayout.f24053u1;
            ChatAttachAlertPhotoLayout.f24053u1 = i132 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i132, 0L, imVar.f27465a.getAbsolutePath(), 0, true, i122, i11, 0L);
            photoEntry.duration = (int) (((float) j3) / 1000.0f);
            photoEntry.thumbPath = str;
            if (yiVar.T0 != 0 && chatAttachAlertPhotoLayout.P.isFrontface()) {
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
        ((wb) this.f30680b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override
    public void q(ud0 ud0Var, int i10) {
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) this.f30680b;
        try {
            if (i10 == 0) {
                u3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
            } else {
                u3Var.setText(LocaleController.getString(R.string.SetAutoDeleteTimer));
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public void y() {
        i6 i6Var = (i6) this.f30680b;
        i6Var.b();
        i6Var.e();
    }

    @Override
    public void a() {
    }

    @Override
    public void b(boolean z10) {
    }

    @Override
    public void g(boolean z10) {
    }

    @Override
    public void j() {
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
