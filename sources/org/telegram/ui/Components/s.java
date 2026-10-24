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
public final class s implements org.telegram.ui.ActionBar.z1, am0, kd0, ld0, md0, ne.f, ImageReceiver.ImageReceiverDelegate, b5, r0.n, vh.a, t0.e, bm0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.q5, ci.v9, org.telegram.ui.ActionBar.q0, org.telegram.ui.ActionBar.k1, wh.k {
    public final int f30388a;
    public final Object f30389b;

    public s(Object obj, int i10) {
        this.f30388a = i10;
        this.f30389b = obj;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        ib ibVar = ((jb) this.f30389b).f27654a;
        if (ibVar != null) {
            ibVar.setPadding(defaultWindowInsets.f12315a, defaultWindowInsets.f12316b, defaultWindowInsets.f12317c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.k1.f45249b;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        int i12;
        m8 m8Var = (m8) this.f30389b;
        int i13 = i10 * 60;
        if (i10 == 0) {
            i12 = 71;
        } else {
            i12 = 70;
        }
        m8Var.H0(i13, i12);
    }

    @Override
    public void E() {
        f6 f6Var = (f6) this.f30389b;
        f6Var.b();
        f6Var.e();
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public boolean Q0(long j10, int i10, int i11, int i12, ci.w9 w9Var) {
        io ioVar = (io) ((org.telegram.ui.Cells.m6) this.f30389b).T;
        ImageReceiver imageReceiver = ioVar.f31064a;
        w9Var.f6069c = imageReceiver;
        w9Var.f6075l = imageReceiver;
        org.telegram.ui.Cells.m6 m6Var = ioVar.G;
        w9Var.f6076m = m6Var;
        boolean z10 = m6Var.f6137w;
        io ioVar2 = ioVar.K.e;
        w9Var.f6067a = ioVar2;
        w9Var.f6074k = ioVar2.getAlpha();
        w9Var.h = 0.0f;
        w9Var.f6072i = AndroidUtilities.displaySize.y;
        w9Var.f6071g = (View) ioVar.getParent();
        return true;
    }

    @Override
    public void X0(long j10, int i10, ci.s3 s3Var) {
        s3Var.run();
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        g0.P((g0) this.f30389b, view, i10, f7);
    }

    @Override
    public boolean d(int i10, View view) {
        Object O;
        lk lkVar = (lk) this.f30389b;
        s4.g0 adapter = lkVar.f28358r.getAdapter();
        ek ekVar = lkVar.v;
        if (adapter == ekVar) {
            O = ekVar.E(i10);
        } else {
            kk kkVar = lkVar.f28362y;
            O = kkVar.O(kkVar.S(i10), kkVar.Q(i10));
        }
        return lkVar.S(view, O);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.f30388a;
        Object obj = this.f30389b;
        switch (i10) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new j6((v6) obj, 1));
                duration.start();
                return;
            default:
                u9 u9Var = (u9) obj;
                u9Var.getClass();
                if (z10 && !z11) {
                    u9Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.f30388a;
        org.telegram.messenger.n5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        return ((String[]) this.f30389b)[i10];
    }

    @Override
    public boolean f(t0.i iVar, int i10, Bundle bundle) {
        lg lgVar = (lg) this.f30389b;
        ChatActivityEnterView chatActivityEnterView = lgVar.d;
        if (chatActivityEnterView.p5) {
            return true;
        }
        int i11 = n0.a.f17055a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f47308a.d();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = iVar.f47308a;
        if (!hVar.getDescription().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, hVar.c())) {
            lgVar.m(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            d5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new o2(7, lgVar, iVar), chatActivityEnterView.W3);
            return true;
        } else {
            lgVar.o(iVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f30388a) {
            case 0:
                y.S((y) this.f30389b, c2Var);
                return;
            case 2:
                ((org.telegram.messenger.camera.i) this.f30389b).run();
                return;
            case 3:
                ((ai.v3) this.f30389b).run();
                return;
            case 4:
                ((ai.wb) this.f30389b).run();
                return;
            case 5:
                ((t1) this.f30389b).run();
                return;
            case 6:
                ((hs) this.f30389b).run();
                return;
            case 8:
                ((p2) this.f30389b).run();
                return;
            case 17:
                ((eg) this.f30389b).f26031a.U0.s();
                return;
            case 19:
                ((ce) this.f30389b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((co) this.f30389b).f27704b.dismiss();
                return;
            case 24:
                ((fn) this.f30389b).f26395a.E.s();
                return;
            default:
                ((mu) this.f30389b).f28697a.d.s();
                return;
        }
    }

    @Override
    public void h(int i10) {
        tq tqVar = ((uq) this.f30389b).f31198a;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                tqVar.u();
                return;
            }
            return;
        }
        if (i10 != 2) {
            z10 = false;
        }
        tqVar.k(z10);
    }

    @Override
    public void i(int i10) {
        w2 w2Var = (w2) this.f30389b;
        if (i10 == 0) {
            w2Var.run();
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var = ((fs) this.f30389b).f26426a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && m1Var != null && m1Var.isShowing()) {
            m1Var.d(true);
        }
    }

    @Override
    public void l(wh.g gVar, float f7, float f10) {
        ((iu) this.f30389b).c(gVar, f7, f10);
    }

    @Override
    public void m(Canvas canvas, int i10) {
        ((sb) this.f30389b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override
    public void n(od0 od0Var, int i10) {
        org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) this.f30389b;
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
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f30388a;
        org.telegram.messenger.n5.b(this, imageReceiver);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        am amVar = (am) this.f30389b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = amVar.e;
        ri riVar = chatAttachAlertPhotoLayout.f27704b;
        if (amVar.f24749a != null && !riVar.V && chatAttachAlertPhotoLayout.P != null) {
            ChatAttachAlertPhotoLayout.f24223q1 = false;
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
                    int i13 = ChatAttachAlertPhotoLayout.f24227u1;
                    ChatAttachAlertPhotoLayout.f24227u1 = i13 - 1;
                    photoEntry = new MediaController.PhotoEntry(0, i13, 0L, amVar.f24749a.getAbsolutePath(), 0, true, i12, i11, 0L);
                    photoEntry.duration = (int) (((float) j10) / 1000.0f);
                    photoEntry.thumbPath = str;
                    if (riVar.T0 != 0) {
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
            int i132 = ChatAttachAlertPhotoLayout.f24227u1;
            ChatAttachAlertPhotoLayout.f24227u1 = i132 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i132, 0L, amVar.f24749a.getAbsolutePath(), 0, true, i122, i11, 0L);
            photoEntry.duration = (int) (((float) j10) / 1000.0f);
            photoEntry.thumbPath = str;
            if (riVar.T0 != 0 && chatAttachAlertPhotoLayout.P.isFrontface()) {
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
    public boolean r() {
        return false;
    }

    @Override
    public boolean u(float f7) {
        return false;
    }

    @Override
    public void a() {
    }

    @Override
    public void b(boolean z10) {
    }

    @Override
    public void k(boolean z10) {
    }

    @Override
    public void x() {
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
