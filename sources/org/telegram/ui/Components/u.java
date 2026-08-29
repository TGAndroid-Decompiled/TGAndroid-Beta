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
public final class u implements org.telegram.ui.ActionBar.b2, al0, mc0, nc0, oc0, vd.e, ImageReceiver.ImageReceiverDelegate, b5, r0.o, fh.a, t0.e, bl0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.p5, lh.e9, org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.m1, gh.o {
    public final int f33066a;
    public final Object f33067b;

    public u(Object obj, int i10) {
        this.f33066a = i10;
        this.f33067b = obj;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        int i12;
        l8 l8Var = (l8) this.f33067b;
        int i13 = i10 * 60;
        if (i10 == 0) {
            i12 = 71;
        } else {
            i12 = 70;
        }
        l8Var.T0(i13, i12);
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        gb gbVar = ((hb) this.f33067b).f29158a;
        if (gbVar != null) {
            gbVar.setPadding(defaultWindowInsets.f8186a, defaultWindowInsets.f8187b, defaultWindowInsets.f8188c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.m1.f46842b;
    }

    @Override
    public boolean K0(long j10, int i10, int i11, int i12, lh.f9 f9Var) {
        tn tnVar = (tn) ((org.telegram.ui.Cells.j6) this.f33067b).T;
        ImageReceiver imageReceiver = tnVar.f32903a;
        f9Var.f15603c = imageReceiver;
        f9Var.f15610l = imageReceiver;
        org.telegram.ui.Cells.j6 j6Var = tnVar.C;
        f9Var.f15611m = j6Var;
        boolean z10 = j6Var.f15684w;
        tn tnVar2 = tnVar.G.f34790e;
        f9Var.f15601a = tnVar2;
        f9Var.f15609k = tnVar2.getAlpha();
        f9Var.h = 0.0f;
        f9Var.f15607i = AndroidUtilities.displaySize.y;
        f9Var.f15606g = (View) tnVar.getParent();
        return true;
    }

    @Override
    public void b(float f9, float f10, int i10, View view) {
        i0.P((i0) this.f33067b, view, i10, f9);
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c(int i10, View view) {
        Object O;
        jk jkVar = (jk) this.f33067b;
        f2.p0 adapter = jkVar.f29678r.getAdapter();
        bk bkVar = jkVar.v;
        if (adapter == bkVar) {
            O = bkVar.E(i10);
        } else {
            ik ikVar = jkVar.f29682y;
            O = ikVar.O(ikVar.S(i10), ikVar.Q(i10));
        }
        return jkVar.P(view, O);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.f33066a;
        Object obj = this.f33067b;
        switch (i10) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new j6((v6) obj, 1));
                duration.start();
                return;
            default:
                t9 t9Var = (t9) obj;
                t9Var.getClass();
                if (z10 && !z11) {
                    t9Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.f33066a;
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        return ((String[]) this.f33067b)[i10];
    }

    @Override
    public boolean f(t0.i iVar, int i10, Bundle bundle) {
        gg ggVar = (gg) this.f33067b;
        ChatActivityEnterView chatActivityEnterView = ggVar.d;
        if (chatActivityEnterView.f26130g5) {
            return true;
        }
        int i11 = n0.a.f17073a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f48084a.d();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = iVar.f48084a;
        if (!hVar.getDescription().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, hVar.c())) {
            ggVar.m(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            c5.M(chatActivityEnterView.J2, chatActivityEnterView.K2.a(), new j1(11, ggVar, iVar), chatActivityEnterView.R3);
            return true;
        } else {
            ggVar.o(iVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f33066a) {
            case 0:
                a0.S((a0) this.f33067b, c2Var);
                return;
            case 2:
                ((org.telegram.ui.gg) this.f33067b).run();
                return;
            case 3:
                ((eg.z1) this.f33067b).run();
                return;
            case 4:
                ((jf.j0) this.f33067b).run();
                return;
            case 5:
                ((w1) this.f33067b).run();
                return;
            case 6:
                ((tr) this.f33067b).run();
                return;
            case 8:
                ((p2) this.f33067b).run();
                return;
            case 17:
                ((ag) this.f33067b).f26766a.Q0.r();
                return;
            case 19:
                ((z2) this.f33067b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((on) this.f33067b).f28403b.dismiss();
                return;
            default:
                ((sm) this.f33067b).f32689a.A.r();
                return;
        }
    }

    @Override
    public void i(int i10) {
        fq fqVar = ((gq) this.f33067b).f28946a;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                fqVar.q();
                return;
            }
            return;
        }
        if (i10 != 2) {
            z10 = false;
        }
        fqVar.i(z10);
    }

    @Override
    public boolean j() {
        return false;
    }

    @Override
    public boolean k(float f9) {
        return false;
    }

    @Override
    public void l1(long j10, int i10, lh.j3 j3Var) {
        j3Var.run();
    }

    @Override
    public void m(gh.k kVar, float f9, float f10) {
        ((ut) this.f33067b).c(kVar, f9, f10);
    }

    @Override
    public void n(int i10) {
        x2 x2Var = (x2) this.f33067b;
        if (i10 == 0) {
            x2Var.run();
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var = ((rr) this.f33067b).f32370a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && o1Var != null && o1Var.isShowing()) {
            o1Var.d(true);
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f33066a;
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        BitmapFactory.Options options;
        ml mlVar = (ml) this.f33067b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = mlVar.f30724e;
        ni niVar = chatAttachAlertPhotoLayout.f28403b;
        if (mlVar.f30721a != null && !niVar.R && chatAttachAlertPhotoLayout.L != null) {
            ChatAttachAlertPhotoLayout.f26252m1 = false;
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
                int i13 = ChatAttachAlertPhotoLayout.f26256q1;
                ChatAttachAlertPhotoLayout.f26256q1 = i13 - 1;
                photoEntry = new MediaController.PhotoEntry(0, i13, 0L, mlVar.f30721a.getAbsolutePath(), 0, true, i12, i11, 0L);
                photoEntry.duration = (int) (((float) j10) / 1000.0f);
                photoEntry.thumbPath = str;
                if (niVar.M0 != 0) {
                    MediaController.CropState cropState = new MediaController.CropState();
                    photoEntry.cropState = cropState;
                    cropState.mirrored = true;
                    cropState.freeform = false;
                    cropState.lockedAspectRatio = 1.0f;
                }
                chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
            }
            int i122 = i10;
            int i132 = ChatAttachAlertPhotoLayout.f26256q1;
            ChatAttachAlertPhotoLayout.f26256q1 = i132 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i132, 0L, mlVar.f30721a.getAbsolutePath(), 0, true, i122, i11, 0L);
            photoEntry.duration = (int) (((float) j10) / 1000.0f);
            photoEntry.thumbPath = str;
            if (niVar.M0 != 0 && chatAttachAlertPhotoLayout.L.isFrontface()) {
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
        ((rb) this.f33067b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override
    public void q(qc0 qc0Var, int i10) {
        org.telegram.ui.Cells.r3 r3Var = (org.telegram.ui.Cells.r3) this.f33067b;
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
    public void w() {
        f6 f6Var = (f6) this.f33067b;
        f6Var.b();
        f6Var.e();
    }

    @Override
    public void a() {
    }

    @Override
    public void d(boolean z10) {
    }

    @Override
    public void h(boolean z10) {
    }

    @Override
    public void l() {
    }

    @Override
    public void o0(View view, float f9, float f10) {
    }
}
