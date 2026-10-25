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
public final class s implements org.telegram.ui.ActionBar.b2, am0, id0, jd0, kd0, oe.f, ImageReceiver.ImageReceiverDelegate, e5, r0.n, wh.a, t0.e, bm0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.v5, di.u9, org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.m1, xh.k {
    public final int f32349a;
    public final Object f32350b;

    public s(Object obj, int i10) {
        this.f32349a = i10;
        this.f32350b = obj;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        int i12;
        q8 q8Var = (q8) this.f32350b;
        int i13 = i10 * 60;
        if (i10 == 0) {
            i12 = 71;
        } else {
            i12 = 70;
        }
        q8Var.T0(i13, i12);
    }

    @Override
    public void G0(long j10, int i10, di.s3 s3Var) {
        s3Var.run();
    }

    @Override
    public void P() {
        j6 j6Var = (j6) this.f32350b;
        j6Var.b();
        j6Var.e();
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        kb kbVar = ((lb) this.f32350b).f30151a;
        if (kbVar != null) {
            kbVar.setPadding(defaultWindowInsets.f13450a, defaultWindowInsets.f13451b, defaultWindowInsets.f13452c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.k1.f47114b;
    }

    @Override
    public boolean c(int i10, View view) {
        Object O;
        nk nkVar = (nk) this.f32350b;
        s4.h0 adapter = nkVar.f31032r.getAdapter();
        gk gkVar = nkVar.v;
        if (adapter == gkVar) {
            O = gkVar.E(i10);
        } else {
            mk mkVar = nkVar.f31036y;
            O = mkVar.O(mkVar.S(i10), mkVar.Q(i10));
        }
        return nkVar.S(view, O);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public boolean d(t0.i iVar, int i10, Bundle bundle) {
        ng ngVar = (ng) this.f32350b;
        ChatActivityEnterView chatActivityEnterView = ngVar.d;
        if (chatActivityEnterView.f25938p5) {
            return true;
        }
        int i11 = n0.a.f18563a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f48686a.b();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = iVar.f48686a;
        if (!hVar.getDescription().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, hVar.a())) {
            ngVar.m(hVar.a(), hVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            g5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new p1(10, ngVar, iVar), chatActivityEnterView.W3);
            return true;
        } else {
            ngVar.o(iVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.f32349a;
        Object obj = this.f32350b;
        switch (i10) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new n6((z6) obj, 1));
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
        int i11 = this.f32349a;
        org.telegram.messenger.o5.a(this, i10, str, drawable);
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        g0.P((g0) this.f32350b, view, i10, f7);
    }

    @Override
    public String f(int i10) {
        return ((String[]) this.f32350b)[i10];
    }

    @Override
    public void g(int i10) {
        xq xqVar = ((yq) this.f32350b).f35111a;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                xqVar.w();
                return;
            }
            return;
        }
        if (i10 != 2) {
            z10 = false;
        }
        xqVar.k(z10);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f32349a) {
            case 0:
                y.S((y) this.f32350b, e2Var);
                return;
            case 2:
                ((m4.v0) this.f32350b).run();
                return;
            case 3:
                ((bi.r3) this.f32350b).run();
                return;
            case 4:
                ((ag.q0) this.f32350b).run();
                return;
            case 5:
                ((x1) this.f32350b).run();
                return;
            case 6:
                ((ls) this.f32350b).run();
                return;
            case 8:
                ((s2) this.f32350b).run();
                return;
            case 17:
                ((gg) this.f32350b).f28564a.U0.r();
                return;
            case 19:
                ((org.telegram.ui.ip) this.f32350b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((go) this.f32350b).f30213b.dismiss();
                return;
            case 24:
                ((in) this.f32350b).f29319a.E.r();
                return;
            default:
                ((pu) this.f32350b).f31702a.d.r();
                return;
        }
    }

    @Override
    public boolean i1(long j10, int i10, int i11, int i12, di.v9 v9Var) {
        lo loVar = (lo) ((org.telegram.ui.Cells.q6) this.f32350b).T;
        ImageReceiver imageReceiver = loVar.f34981a;
        v9Var.f9271c = imageReceiver;
        v9Var.f9277l = imageReceiver;
        org.telegram.ui.Cells.q6 q6Var = loVar.G;
        v9Var.f9278m = q6Var;
        boolean z10 = q6Var.f9330w;
        lo loVar2 = loVar.K.e;
        v9Var.f9269a = loVar2;
        v9Var.f9276k = loVar2.getAlpha();
        v9Var.h = 0.0f;
        v9Var.f9274i = AndroidUtilities.displaySize.y;
        v9Var.f9273g = (View) loVar.getParent();
        return true;
    }

    @Override
    public boolean j() {
        return false;
    }

    @Override
    public boolean k(float f7) {
        return false;
    }

    @Override
    public void m(int i10) {
        a3 a3Var = (a3) this.f32350b;
        if (i10 == 0) {
            a3Var.run();
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var = ((js) this.f32350b).f29710a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && o1Var != null && o1Var.isShowing()) {
            o1Var.d(true);
        }
    }

    @Override
    public void o(xh.g gVar, float f7, float f10) {
        ((lu) this.f32350b).c(gVar, f7, f10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f32349a;
        org.telegram.messenger.o5.b(this, imageReceiver);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        dm dmVar = (dm) this.f32350b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = dmVar.e;
        ti tiVar = chatAttachAlertPhotoLayout.f30213b;
        if (dmVar.f27558a != null && !tiVar.V && chatAttachAlertPhotoLayout.P != null) {
            ChatAttachAlertPhotoLayout.f26013q1 = false;
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
                    int i13 = ChatAttachAlertPhotoLayout.f26017u1;
                    ChatAttachAlertPhotoLayout.f26017u1 = i13 - 1;
                    photoEntry = new MediaController.PhotoEntry(0, i13, 0L, dmVar.f27558a.getAbsolutePath(), 0, true, i12, i11, 0L);
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
            int i132 = ChatAttachAlertPhotoLayout.f26017u1;
            ChatAttachAlertPhotoLayout.f26017u1 = i132 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i132, 0L, dmVar.f27558a.getAbsolutePath(), 0, true, i122, i11, 0L);
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
    public void p(Canvas canvas, int i10) {
        ((ub) this.f32350b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override
    public void q(md0 md0Var, int i10) {
        org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) this.f32350b;
        try {
            if (i10 == 0) {
                y3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
            } else {
                y3Var.setText(LocaleController.getString(R.string.SetAutoDeleteTimer));
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public void a() {
    }

    @Override
    public void l() {
    }

    @Override
    public void b(boolean z10) {
    }

    @Override
    public void i(boolean z10) {
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
