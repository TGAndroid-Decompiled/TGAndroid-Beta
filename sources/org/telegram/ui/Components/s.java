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
public final class s implements org.telegram.ui.ActionBar.z1, bm0, md0, nd0, od0, ne.f, ImageReceiver.ImageReceiverDelegate, d5, r0.n, vh.a, t0.e, cm0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.q5, ci.v9, org.telegram.ui.ActionBar.q0, org.telegram.ui.ActionBar.k1, wh.k {
    public final int f30300a;
    public final Object f30301b;

    public s(Object obj, int i10) {
        this.f30300a = i10;
        this.f30301b = obj;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        kb kbVar = ((lb) this.f30301b).f28320a;
        if (kbVar != null) {
            kbVar.setPadding(defaultWindowInsets.f12315a, defaultWindowInsets.f12316b, defaultWindowInsets.f12317c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.k1.f45250b;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        int i12;
        o8 o8Var = (o8) this.f30301b;
        int i13 = i10 * 60;
        if (i10 == 0) {
            i12 = 71;
        } else {
            i12 = 70;
        }
        o8Var.H0(i13, i12);
    }

    @Override
    public void E() {
        h6 h6Var = (h6) this.f30301b;
        h6Var.b();
        h6Var.e();
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public boolean Q0(long j10, int i10, int i11, int i12, ci.w9 w9Var) {
        ko koVar = (ko) ((org.telegram.ui.Cells.m6) this.f30301b).T;
        ImageReceiver imageReceiver = koVar.f32195a;
        w9Var.f6069c = imageReceiver;
        w9Var.f6075l = imageReceiver;
        org.telegram.ui.Cells.m6 m6Var = koVar.G;
        w9Var.f6076m = m6Var;
        boolean z10 = m6Var.f6137w;
        ko koVar2 = koVar.K.e;
        w9Var.f6067a = koVar2;
        w9Var.f6074k = koVar2.getAlpha();
        w9Var.h = 0.0f;
        w9Var.f6072i = AndroidUtilities.displaySize.y;
        w9Var.f6071g = (View) koVar.getParent();
        return true;
    }

    @Override
    public void X0(long j10, int i10, ci.s3 s3Var) {
        s3Var.run();
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        g0.P((g0) this.f30301b, view, i10, f7);
    }

    @Override
    public boolean d(int i10, View view) {
        Object O;
        nk nkVar = (nk) this.f30301b;
        s4.g0 adapter = nkVar.f28977r.getAdapter();
        gk gkVar = nkVar.v;
        if (adapter == gkVar) {
            O = gkVar.E(i10);
        } else {
            mk mkVar = nkVar.f28981y;
            O = mkVar.O(mkVar.S(i10), mkVar.Q(i10));
        }
        return nkVar.S(view, O);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.f30300a;
        Object obj = this.f30301b;
        switch (i10) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new l6((x6) obj, 1));
                duration.start();
                return;
            default:
                w9 w9Var = (w9) obj;
                w9Var.getClass();
                if (z10 && !z11) {
                    w9Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.f30300a;
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        return ((String[]) this.f30301b)[i10];
    }

    @Override
    public boolean f(t0.i iVar, int i10, Bundle bundle) {
        ng ngVar = (ng) this.f30301b;
        ChatActivityEnterView chatActivityEnterView = ngVar.d;
        if (chatActivityEnterView.p5) {
            return true;
        }
        int i11 = n0.a.f17055a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f47309a.d();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = iVar.f47309a;
        if (!hVar.getDescription().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, hVar.c())) {
            ngVar.m(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            f5.M(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new p2(7, ngVar, iVar), chatActivityEnterView.W3);
            return true;
        } else {
            ngVar.o(iVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f30300a) {
            case 0:
                y.S((y) this.f30301b, c2Var);
                return;
            case 2:
                ((org.telegram.messenger.camera.i) this.f30301b).run();
                return;
            case 3:
                ((ai.v3) this.f30301b).run();
                return;
            case 4:
                ((ai.wb) this.f30301b).run();
                return;
            case 5:
                ((t1) this.f30301b).run();
                return;
            case 6:
                ((js) this.f30301b).run();
                return;
            case 8:
                ((q2) this.f30301b).run();
                return;
            case 17:
                ((gg) this.f30301b).f26605a.U0.s();
                return;
            case 19:
                ((ee) this.f30301b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((fo) this.f30301b).f28366b.dismiss();
                return;
            case 24:
                ((hn) this.f30301b).f26987a.E.s();
                return;
            default:
                ((ou) this.f30301b).f29314a.d.s();
                return;
        }
    }

    @Override
    public void h(int i10) {
        vq vqVar = ((wq) this.f30301b).f32315a;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                vqVar.u();
                return;
            }
            return;
        }
        if (i10 != 2) {
            z10 = false;
        }
        vqVar.k(z10);
    }

    @Override
    public void i(int i10) {
        x2 x2Var = (x2) this.f30301b;
        if (i10 == 0) {
            x2Var.run();
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var = ((hs) this.f30301b).f27042a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && m1Var != null && m1Var.isShowing()) {
            m1Var.d(true);
        }
    }

    @Override
    public void l(wh.g gVar, float f7, float f10) {
        ((ku) this.f30301b).c(gVar, f7, f10);
    }

    @Override
    public void m(Canvas canvas, int i10) {
        ((ub) this.f30301b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override
    public void n(qd0 qd0Var, int i10) {
        org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) this.f30301b;
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
        int i10 = this.f30300a;
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        cm cmVar = (cm) this.f30301b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = cmVar.e;
        ti tiVar = chatAttachAlertPhotoLayout.f28366b;
        if (cmVar.f25377a != null && !tiVar.V && chatAttachAlertPhotoLayout.P != null) {
            ChatAttachAlertPhotoLayout.f24222q1 = false;
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
                    int i13 = ChatAttachAlertPhotoLayout.f24226u1;
                    ChatAttachAlertPhotoLayout.f24226u1 = i13 - 1;
                    photoEntry = new MediaController.PhotoEntry(0, i13, 0L, cmVar.f25377a.getAbsolutePath(), 0, true, i12, i11, 0L);
                    photoEntry.duration = (int) (((float) j10) / 1000.0f);
                    photoEntry.thumbPath = str;
                    if (tiVar.T0 != 0) {
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
            int i132 = ChatAttachAlertPhotoLayout.f24226u1;
            ChatAttachAlertPhotoLayout.f24226u1 = i132 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i132, 0L, cmVar.f25377a.getAbsolutePath(), 0, true, i122, i11, 0L);
            photoEntry.duration = (int) (((float) j10) / 1000.0f);
            photoEntry.thumbPath = str;
            if (tiVar.T0 != 0 && chatAttachAlertPhotoLayout.P.isFrontface()) {
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
