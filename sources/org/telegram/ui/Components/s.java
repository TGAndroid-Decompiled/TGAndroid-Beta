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
public final class s implements org.telegram.ui.ActionBar.z1, lm0, ud0, vd0, wd0, me.f, ImageReceiver.ImageReceiverDelegate, f5, r0.n, uh.a, t0.e, mm0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.r5, ai.gc, org.telegram.ui.ActionBar.q0, org.telegram.ui.ActionBar.k1, vh.k {
    public final int f30286a;
    public final Object f30287b;

    public s(Object obj, int i10) {
        this.f30286a = i10;
        this.f30287b = obj;
    }

    @Override
    public void A() {
        i6 i6Var = (i6) this.f30287b;
        i6Var.b();
        i6Var.e();
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        int i12;
        p8 p8Var = (p8) this.f30287b;
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
        mb mbVar = ((nb) this.f30287b).f28771a;
        if (mbVar != null) {
            mbVar.setPadding(defaultWindowInsets.f11574a, defaultWindowInsets.f11575b, defaultWindowInsets.f11576c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.k1.f46991b;
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
        g0.Q((g0) this.f30287b, view, i10, f7);
    }

    @Override
    public boolean d(int i10, View view) {
        Object O;
        uk ukVar = (uk) this.f30287b;
        s4.i0 adapter = ukVar.f31194r.getAdapter();
        nk nkVar = ukVar.v;
        if (adapter == nkVar) {
            O = nkVar.E(i10);
        } else {
            tk tkVar = ukVar.f31198y;
            O = tkVar.O(tkVar.S(i10), tkVar.Q(i10));
        }
        return ukVar.S(view, O);
    }

    @Override
    public boolean d1(long j3, int i10, int i11, int i12, ai.hc hcVar) {
        so soVar = (so) ((org.telegram.ui.Cells.m6) this.f30287b).T;
        ImageReceiver imageReceiver = soVar.f33001a;
        hcVar.f1105c = imageReceiver;
        hcVar.f1112l = imageReceiver;
        org.telegram.ui.Cells.m6 m6Var = soVar.G;
        hcVar.f1113m = m6Var;
        boolean z10 = m6Var.f855w;
        so soVar2 = soVar.K.f32504e;
        hcVar.f1103a = soVar2;
        hcVar.f1111k = soVar2.getAlpha();
        hcVar.h = 0.0f;
        hcVar.f1109i = AndroidUtilities.displaySize.y;
        hcVar.f1108g = (View) soVar.getParent();
        return true;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.f30286a;
        Object obj = this.f30287b;
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
        int i11 = this.f30286a;
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        return ((String[]) this.f30287b)[i10];
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f30286a) {
            case 0:
                y.T((y) this.f30287b, a2Var);
                return;
            case 2:
                ((org.telegram.ui.ActionBar.l5) this.f30287b).run();
                return;
            case 3:
                ((ai.j) this.f30287b).run();
                return;
            case 4:
                ((ai.db) this.f30287b).run();
                return;
            case 5:
                ((u1) this.f30287b).run();
                return;
            case 6:
                ((rs) this.f30287b).run();
                return;
            case 8:
                ((r2) this.f30287b).run();
                return;
            case 17:
                ((lg) this.f30287b).f28188a.U0.s();
                return;
            case 19:
                ((md) this.f30287b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((no) this.f30287b).f30574b.dismiss();
                return;
            case 24:
                ((pn) this.f30287b).f29554a.E.s();
                return;
            default:
                ((av) this.f30287b).f24493a.d.s();
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
        rg rgVar = (rg) this.f30287b;
        ChatActivityEnterView chatActivityEnterView = rgVar.d;
        if (chatActivityEnterView.O5) {
            return true;
        }
        int i11 = n0.a.f16204a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f48422a.d();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = iVar.f48422a;
        if (!hVar.getDescription().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, hVar.c())) {
            rgVar.m(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            g5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new y2(3, rgVar, iVar), chatActivityEnterView.f23774z4);
            return true;
        } else {
            rgVar.o(iVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public void l(vh.g gVar, float f7, float f10) {
        ((wu) this.f30287b).c(gVar, f7, f10);
    }

    @Override
    public void m(int i10) {
        dr drVar = ((er) this.f30287b).f25765a;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                drVar.y();
                return;
            }
            return;
        }
        if (i10 != 2) {
            z10 = false;
        }
        drVar.l(z10);
    }

    @Override
    public void n(int i10) {
        z2 z2Var = (z2) this.f30287b;
        if (i10 == 0) {
            z2Var.run();
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var = ((ps) this.f30287b).f29580a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && m1Var != null && m1Var.isShowing()) {
            m1Var.d(true);
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f30286a;
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        km kmVar = (km) this.f30287b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kmVar.f27896e;
        aj ajVar = chatAttachAlertPhotoLayout.f30574b;
        if (kmVar.f27893a != null && !ajVar.V && chatAttachAlertPhotoLayout.P != null) {
            ChatAttachAlertPhotoLayout.f23798q1 = false;
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
                    int i13 = ChatAttachAlertPhotoLayout.f23802u1;
                    ChatAttachAlertPhotoLayout.f23802u1 = i13 - 1;
                    photoEntry = new MediaController.PhotoEntry(0, i13, 0L, kmVar.f27893a.getAbsolutePath(), 0, true, i12, i11, 0L);
                    photoEntry.duration = (int) (((float) j3) / 1000.0f);
                    photoEntry.thumbPath = str;
                    if (ajVar.T0 != 0) {
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
            int i132 = ChatAttachAlertPhotoLayout.f23802u1;
            ChatAttachAlertPhotoLayout.f23802u1 = i132 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i132, 0L, kmVar.f27893a.getAbsolutePath(), 0, true, i122, i11, 0L);
            photoEntry.duration = (int) (((float) j3) / 1000.0f);
            photoEntry.thumbPath = str;
            if (ajVar.T0 != 0 && chatAttachAlertPhotoLayout.P.isFrontface()) {
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
        ((wb) this.f30287b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override
    public void q(yd0 yd0Var, int i10) {
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) this.f30287b;
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
