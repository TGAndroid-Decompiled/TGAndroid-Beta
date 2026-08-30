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
public final class t implements org.telegram.ui.ActionBar.c2, jl0, sc0, tc0, uc0, xd.d, ImageReceiver.ImageReceiverDelegate, y4, r0.o, hh.a, t0.e, kl0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.r5, nh.e9, org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.n1, ih.o {
    public final int f28844a;
    public final Object f28845b;

    public t(Object obj, int i10) {
        this.f28844a = i10;
        this.f28845b = obj;
    }

    @Override
    public void D0(long j10, int i10, nh.k3 k3Var) {
        k3Var.run();
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        int i12;
        g8 g8Var = (g8) this.f28845b;
        int i13 = i10 * 60;
        if (i10 == 0) {
            i12 = 71;
        } else {
            i12 = 70;
        }
        g8Var.U0(i13, i12);
    }

    @Override
    public r0.m1 N0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        bb bbVar = ((cb) this.f28845b).f23955a;
        if (bbVar != null) {
            bbVar.setPadding(defaultWindowInsets.f7213a, defaultWindowInsets.f7214b, defaultWindowInsets.f7215c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.m1.f43129b;
    }

    @Override
    public boolean X0(long j10, int i10, int i11, int i12, nh.f9 f9Var) {
        vn vnVar = (vn) ((org.telegram.ui.Cells.l6) this.f28845b).T;
        ImageReceiver imageReceiver = vnVar.f27785a;
        f9Var.f15334c = imageReceiver;
        f9Var.f15340l = imageReceiver;
        org.telegram.ui.Cells.l6 l6Var = vnVar.D;
        f9Var.f15341m = l6Var;
        boolean z4 = l6Var.f15438w;
        vn vnVar2 = vnVar.H.e;
        f9Var.f15332a = vnVar2;
        f9Var.f15339k = vnVar2.getAlpha();
        f9Var.h = 0.0f;
        f9Var.f15337i = AndroidUtilities.displaySize.y;
        f9Var.f15336g = (View) vnVar.getParent();
        return true;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        h0.P((h0) this.f28845b, view, i10, f10);
    }

    @Override
    public boolean d(t0.i iVar, int i10, Bundle bundle) {
        dg dgVar = (dg) this.f28845b;
        ChatActivityEnterView chatActivityEnterView = dgVar.d;
        if (chatActivityEnterView.f22779h5) {
            return true;
        }
        int i11 = n0.a.f14198a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f44430a.b();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = iVar.f44430a;
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
        int i10 = this.f28844a;
        Object obj = this.f28845b;
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
        int i11 = this.f28844a;
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        return ((String[]) this.f28845b)[i10];
    }

    @Override
    public boolean e1(View view) {
        return false;
    }

    @Override
    public boolean f(int i10, View view) {
        Object O;
        hk hkVar = (hk) this.f28845b;
        f2.o0 adapter = hkVar.f25434r.getAdapter();
        zj zjVar = hkVar.v;
        if (adapter == zjVar) {
            O = zjVar.E(i10);
        } else {
            gk gkVar = hkVar.f25438y;
            O = gkVar.O(gkVar.S(i10), gkVar.Q(i10));
        }
        return hkVar.P(view, O);
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f28844a) {
            case 0:
                z.S((z) this.f28845b, d2Var);
                return;
            case 2:
                ((org.telegram.ui.ih) this.f28845b).run();
                return;
            case 3:
                ((gg.y1) this.f28845b).run();
                return;
            case 4:
                ((lf.j0) this.f28845b).run();
                return;
            case 5:
                ((u1) this.f28845b).run();
                return;
            case 6:
                ((xr) this.f28845b).run();
                return;
            case 8:
                ((o2) this.f28845b).run();
                return;
            case 17:
                ((xf) this.f28845b).f30668a.R0.r();
                return;
            case 19:
                ((org.telegram.ui.hp) this.f28845b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((qn) this.f28845b).f24278b.dismiss();
                return;
            default:
                ((um) this.f28845b).f29251a.B.r();
                return;
        }
    }

    @Override
    public boolean j(float f10) {
        return false;
    }

    @Override
    public void l(int i10) {
        jq jqVar = ((kq) this.f28845b).f26354a;
        boolean z4 = true;
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                jqVar.z();
                return;
            }
            return;
        }
        if (i10 != 2) {
            z4 = false;
        }
        jqVar.k(z4);
    }

    @Override
    public void m(int i10) {
        u2 u2Var = (u2) this.f28845b;
        if (i10 == 0) {
            u2Var.run();
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var = ((vr) this.f28845b).f30077a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && p1Var != null && p1Var.isShowing()) {
            p1Var.d(true);
        }
    }

    @Override
    public void o(ih.k kVar, float f10, float f11) {
        ((xt) this.f28845b).c(kVar, f10, f11);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f28844a;
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        BitmapFactory.Options options;
        nl nlVar = (nl) this.f28845b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = nlVar.e;
        li liVar = chatAttachAlertPhotoLayout.f24278b;
        if (nlVar.f27309a != null && !liVar.S && chatAttachAlertPhotoLayout.M != null) {
            ChatAttachAlertPhotoLayout.f22894n1 = false;
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
                int i13 = ChatAttachAlertPhotoLayout.f22898r1;
                ChatAttachAlertPhotoLayout.f22898r1 = i13 - 1;
                photoEntry = new MediaController.PhotoEntry(0, i13, 0L, nlVar.f27309a.getAbsolutePath(), 0, true, i12, i11, 0L);
                photoEntry.duration = (int) (((float) j10) / 1000.0f);
                photoEntry.thumbPath = str;
                if (liVar.N0 != 0) {
                    MediaController.CropState cropState = new MediaController.CropState();
                    photoEntry.cropState = cropState;
                    cropState.mirrored = true;
                    cropState.freeform = false;
                    cropState.lockedAspectRatio = 1.0f;
                }
                chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
            }
            int i122 = i10;
            int i132 = ChatAttachAlertPhotoLayout.f22898r1;
            ChatAttachAlertPhotoLayout.f22898r1 = i132 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i132, 0L, nlVar.f27309a.getAbsolutePath(), 0, true, i122, i11, 0L);
            photoEntry.duration = (int) (((float) j10) / 1000.0f);
            photoEntry.thumbPath = str;
            if (liVar.N0 != 0 && chatAttachAlertPhotoLayout.M.isFrontface()) {
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
        ((nb) this.f28845b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override
    public void q(wc0 wc0Var, int i10) {
        org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) this.f28845b;
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
    public void u() {
        b6 b6Var = (b6) this.f28845b;
        b6Var.b();
        b6Var.e();
    }

    @Override
    public void a() {
    }

    @Override
    public void b(boolean z4) {
    }

    @Override
    public void g(boolean z4) {
    }

    @Override
    public void k() {
    }

    @Override
    public void o0(View view, float f10, float f11) {
    }
}
