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

public final class s implements org.telegram.ui.ActionBar.a2, qk0, bc0, cc0, dc0, ud.d, ImageReceiver.ImageReceiverDelegate, x4, r0.o, dh.a, t0.f, rk0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.o5, jh.e9, org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.l1, eh.o {

    public final int f32282a;

    public final Object f32283b;

    public s(Object obj, int i10) {
        this.f32282a = i10;
        this.f32283b = obj;
    }

    @Override
    public boolean E() {
        return false;
    }

    @Override
    public boolean G(float f10) {
        return false;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        ((f8) this.f32283b).V0(i10 * 60, i10 == 0 ? 71 : 70);
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        ab abVar = (ab) this.f32283b;
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        za zaVar = abVar.f26710a;
        if (zaVar != null) {
            zaVar.setPadding(defaultWindowInsets.f10489a, defaultWindowInsets.f10490b, defaultWindowInsets.f10491c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.m1.f46618b;
    }

    @Override
    public boolean a(int i10, View view) {
        Object objO;
        bk bkVar = (bk) this.f32283b;
        f2.q0 adapter = bkVar.f27115r.getAdapter();
        uj ujVar = bkVar.v;
        if (adapter == ujVar) {
            objO = ujVar.E(i10);
        } else {
            ak akVar = bkVar.f27119y;
            objO = akVar.O(akVar.S(i10), akVar.Q(i10));
        }
        return bkVar.P(view, objO);
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        g0.P((g0) this.f32283b, view, i10, f10);
    }

    @Override
    public boolean d(t0.j jVar, int i10, Bundle bundle) {
        zf zfVar = (zf) this.f32283b;
        ChatActivityEnterView chatActivityEnterView = zfVar.d;
        if (chatActivityEnterView.f26115g5) {
            return true;
        }
        int i11 = n0.a.f18072a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                jVar.f48003a.f();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.i iVar = jVar.f48003a;
        if (!iVar.k().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, iVar.c())) {
            zfVar.m(iVar.c(), iVar.k().getMimeType(0));
            return true;
        }
        if (chatActivityEnterView.c()) {
            y4.M(chatActivityEnterView.J2, chatActivityEnterView.K2.a(), new g1(11, zfVar, jVar), chatActivityEnterView.R3);
            return true;
        }
        zfVar.o(jVar, true, 0, 0);
        return true;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.f32282a;
        Object obj = this.f32283b;
        switch (i10) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new e6((q6) obj, 1));
                duration.start();
                break;
            default:
                n9 n9Var = (n9) obj;
                n9Var.getClass();
                if (z10 && !z11) {
                    n9Var.a();
                    break;
                }
                break;
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.f32282a;
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f32282a) {
            case 0:
                y.S((y) this.f32283b, b2Var);
                break;
            case 2:
                ((org.telegram.ui.yf) this.f32283b).run();
                break;
            case 3:
                ((cg.b2) this.f32283b).run();
                break;
            case 4:
                ((gf.k0) this.f32283b).run();
                break;
            case 5:
                ((s1) this.f32283b).run();
                break;
            case 6:
                ((nr) this.f32283b).run();
                break;
            case 8:
                ((m2) this.f32283b).run();
                break;
            case 17:
                ((tf) this.f32283b).f32761a.Q0.s();
                break;
            case 19:
                ((org.telegram.ui.yq) this.f32283b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                break;
            case 23:
                ((in) this.f32283b).f34900b.dismiss();
                break;
            default:
                ((lm) this.f32283b).f30412a.A.s();
                break;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public String g(int i10) {
        return ((String[]) this.f32283b)[i10];
    }

    @Override
    public void g1(long j10, int i10, jh.l3 l3Var) {
        l3Var.run();
    }

    @Override
    public void h(int i10) {
        zp zpVar = ((aq) this.f32283b).f26795a;
        if (i10 == 1 || i10 == 2) {
            zpVar.g(i10 == 2);
        } else if (i10 == 3) {
            zpVar.n();
        }
    }

    @Override
    public void i(eh.k kVar, float f10, float f11) {
        ((nt) this.f32283b).c(kVar, f10, f11);
    }

    @Override
    public void j(int i10) {
        u2 u2Var = (u2) this.f32283b;
        if (i10 == 0) {
            u2Var.run();
        }
    }

    @Override
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var = ((lr) this.f32283b).f30453a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && n1Var != null && n1Var.isShowing()) {
            n1Var.d(true);
        }
    }

    @Override
    public void l(Canvas canvas, int i10) {
        ((jb) this.f32283b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override
    public void l1() {
        a6 a6Var = (a6) this.f32283b;
        a6Var.b();
        a6Var.e();
    }

    @Override
    public void m(fc0 fc0Var, int i10) {
        org.telegram.ui.Cells.r3 r3Var = (org.telegram.ui.Cells.r3) this.f32283b;
        try {
            if (i10 == 0) {
                r3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
            } else {
                r3Var.setText(LocaleController.getString(R.string.SetAutoDeleteTimer));
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f32282a;
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        int i10;
        int i11;
        el elVar = (el) this.f32283b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = elVar.f28078e;
        gi giVar = chatAttachAlertPhotoLayout.f34900b;
        if (elVar.f28075a == null || giVar.R || chatAttachAlertPhotoLayout.L == null) {
            return;
        }
        ChatAttachAlertPhotoLayout.f26237m1 = false;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(new File(str).getAbsolutePath(), options);
            i10 = options.outWidth;
            try {
                i11 = options.outHeight;
            } catch (Exception unused) {
                i11 = 0;
            }
        } catch (Exception unused2) {
            i10 = 0;
        }
        int i12 = i10;
        int i13 = ChatAttachAlertPhotoLayout.f26241q1;
        ChatAttachAlertPhotoLayout.f26241q1 = i13 - 1;
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i13, 0L, elVar.f28075a.getAbsolutePath(), 0, true, i12, i11, 0L);
        photoEntry.duration = (int) (j10 / 1000.0f);
        photoEntry.thumbPath = str;
        if (giVar.M0 != 0 && chatAttachAlertPhotoLayout.L.isFrontface()) {
            MediaController.CropState cropState = new MediaController.CropState();
            photoEntry.cropState = cropState;
            cropState.mirrored = true;
            cropState.freeform = false;
            cropState.lockedAspectRatio = 1.0f;
        }
        chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
    }

    @Override
    public boolean y0(long j10, int i10, int i11, int i12, jh.f9 f9Var) {
        nn nnVar = (nn) ((org.telegram.ui.Cells.i6) this.f32283b).T;
        ImageReceiver imageReceiver = nnVar.f30898a;
        f9Var.f13335c = imageReceiver;
        f9Var.f13342l = imageReceiver;
        org.telegram.ui.Cells.i6 i6Var = nnVar.C;
        f9Var.f13343m = i6Var;
        boolean z10 = i6Var.f13410w;
        nn nnVar2 = nnVar.G.f32217e;
        f9Var.f13333a = nnVar2;
        f9Var.f13341k = nnVar2.getAlpha();
        f9Var.h = 0.0f;
        f9Var.f13339i = AndroidUtilities.displaySize.y;
        f9Var.f13338g = (View) nnVar.getParent();
        return true;
    }

    @Override
    public void A(boolean z10) {
    }

    @Override
    public void K() {
    }

    @Override
    public void b() {
    }

    @Override
    public void e(boolean z10) {
    }

    @Override
    public void c0(View view, float f10, float f11) {
    }
}
