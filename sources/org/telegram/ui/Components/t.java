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
public final class t implements org.telegram.ui.ActionBar.c2, kl0, zc0, ad0, bd0, le.f, ImageReceiver.ImageReceiverDelegate, c5, r0.n, th.a, t0.e, ll0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.r5, zh.q7, org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.n1, uh.l {
    public final int f27238a;
    public final Object f27239b;

    public t(Object obj, int i10) {
        this.f27238a = i10;
        this.f27239b = obj;
    }

    @Override
    public void H0(long j3, int i10, zh.j2 j2Var) {
        j2Var.run();
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        int i12;
        n8 n8Var = (n8) this.f27239b;
        int i13 = i10 * 60;
        if (i10 == 0) {
            i12 = 71;
        } else {
            i12 = 70;
        }
        n8Var.U0(i13, i12);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        jb jbVar = ((kb) this.f27239b).f24689a;
        if (jbVar != null) {
            jbVar.setPadding(defaultWindowInsets.f10074a, defaultWindowInsets.f10075b, defaultWindowInsets.f10076c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.l1.f41073b;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        i0.P((i0) this.f27239b, view, i10, f7);
    }

    @Override
    public boolean d(int i10, View view) {
        Object O;
        tk tkVar = (tk) this.f27239b;
        s4.h0 adapter = tkVar.f27428r.getAdapter();
        mk mkVar = tkVar.v;
        if (adapter == mkVar) {
            O = mkVar.E(i10);
        } else {
            sk skVar = tkVar.f27432y;
            O = skVar.O(skVar.S(i10), skVar.Q(i10));
        }
        return tkVar.P(view, O);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.f27238a;
        Object obj = this.f27239b;
        switch (i10) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new j6((v6) obj, 1));
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
        int i11 = this.f27238a;
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f27238a) {
            case 0:
                z.S((z) this.f27239b, d2Var);
                return;
            case 2:
                ((org.telegram.ui.da) this.f27239b).run();
                return;
            case 3:
                ((bi.va) this.f27239b).run();
                return;
            case 4:
                ((org.telegram.messenger.w0) this.f27239b).run();
                return;
            case 5:
                ((v1) this.f27239b).run();
                return;
            case 6:
                ((fs) this.f27239b).run();
                return;
            case 8:
                ((r2) this.f27239b).run();
                return;
            case 17:
                ((jg) this.f27239b).f24397a.U0.r();
                return;
            case 19:
                ((ee) this.f27239b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((zn) this.f27239b).f26422b.dismiss();
                return;
            default:
                ((dn) this.f27239b).f22448a.E.r();
                return;
        }
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public boolean h(t0.i iVar, int i10, Bundle bundle) {
        pg pgVar = (pg) this.f27239b;
        ChatActivityEnterView chatActivityEnterView = pgVar.d;
        if (chatActivityEnterView.f20884k5) {
            return true;
        }
        int i11 = n0.a.f13674a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f42070a.d();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = iVar.f42070a;
        if (!hVar.getDescription().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, hVar.c())) {
            pgVar.m(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            d5.M(chatActivityEnterView.N2, chatActivityEnterView.O2.a(), new org.telegram.ui.oe(27, pgVar, iVar), chatActivityEnterView.V3);
            return true;
        } else {
            pgVar.o(iVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public boolean i(float f7) {
        return false;
    }

    @Override
    public String k(int i10) {
        return ((String[]) this.f27239b)[i10];
    }

    @Override
    public void l(uh.h hVar, float f7, float f10) {
        ((hu) this.f27239b).c(hVar, f7, f10);
    }

    @Override
    public void m(int i10) {
        rq rqVar = ((sq) this.f27239b).f27151a;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                rqVar.x();
                return;
            }
            return;
        }
        if (i10 != 2) {
            z10 = false;
        }
        rqVar.k(z10);
    }

    @Override
    public void n(int i10) {
        x2 x2Var = (x2) this.f27239b;
        if (i10 == 0) {
            x2Var.run();
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var = ((ds) this.f27239b).f22472a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && p1Var != null && p1Var.isShowing()) {
            p1Var.d(true);
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f27238a;
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        BitmapFactory.Options options;
        wl wlVar = (wl) this.f27239b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wlVar.e;
        yi yiVar = chatAttachAlertPhotoLayout.f26422b;
        if (wlVar.f28788a != null && !yiVar.V && chatAttachAlertPhotoLayout.P != null) {
            ChatAttachAlertPhotoLayout.f20983q1 = false;
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
                int i13 = ChatAttachAlertPhotoLayout.f20987u1;
                ChatAttachAlertPhotoLayout.f20987u1 = i13 - 1;
                photoEntry = new MediaController.PhotoEntry(0, i13, 0L, wlVar.f28788a.getAbsolutePath(), 0, true, i12, i11, 0L);
                photoEntry.duration = (int) (((float) j3) / 1000.0f);
                photoEntry.thumbPath = str;
                if (yiVar.Q0 != 0) {
                    MediaController.CropState cropState = new MediaController.CropState();
                    photoEntry.cropState = cropState;
                    cropState.mirrored = true;
                    cropState.freeform = false;
                    cropState.lockedAspectRatio = 1.0f;
                }
                chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
            }
            int i122 = i10;
            int i132 = ChatAttachAlertPhotoLayout.f20987u1;
            ChatAttachAlertPhotoLayout.f20987u1 = i132 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i132, 0L, wlVar.f28788a.getAbsolutePath(), 0, true, i122, i11, 0L);
            photoEntry.duration = (int) (((float) j3) / 1000.0f);
            photoEntry.thumbPath = str;
            if (yiVar.Q0 != 0 && chatAttachAlertPhotoLayout.P.isFrontface()) {
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
        ((tb) this.f27239b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override
    public void q(dd0 dd0Var, int i10) {
        org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) this.f27239b;
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
    public void x() {
        f6 f6Var = (f6) this.f27239b;
        f6Var.b();
        f6Var.e();
    }

    @Override
    public boolean y0(long j3, int i10, int i11, int i12, zh.r7 r7Var) {
        fo foVar = (fo) ((org.telegram.ui.Cells.n6) this.f27239b).T;
        ImageReceiver imageReceiver = foVar.f28728a;
        r7Var.f48843c = imageReceiver;
        r7Var.f48849l = imageReceiver;
        org.telegram.ui.Cells.n6 n6Var = foVar.G;
        r7Var.f48850m = n6Var;
        boolean z10 = n6Var.f49066w;
        fo foVar2 = foVar.K.e;
        r7Var.f48841a = foVar2;
        r7Var.f48848k = foVar2.getAlpha();
        r7Var.h = 0.0f;
        r7Var.f48846i = AndroidUtilities.displaySize.y;
        r7Var.f48845g = (View) foVar.getParent();
        return true;
    }

    @Override
    public void a() {
    }

    @Override
    public void b(boolean z10) {
    }

    @Override
    public void e(boolean z10) {
    }

    @Override
    public void j() {
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
