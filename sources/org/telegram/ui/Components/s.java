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
public final class s implements org.telegram.ui.ActionBar.a2, fm0, qd0, rd0, sd0, me.f, ImageReceiver.ImageReceiverDelegate, f5, r0.n, uh.a, t0.e, gm0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.r5, ai.gc, org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.l1, vh.k {
    public final int f30552a;
    public final Object f30553b;

    public s(Object obj, int i10) {
        this.f30552a = i10;
        this.f30553b = obj;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        int i12;
        p8 p8Var = (p8) this.f30553b;
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
        nb nbVar = ((ob) this.f30553b).f29445a;
        if (nbVar != null) {
            nbVar.setPadding(defaultWindowInsets.f11576a, defaultWindowInsets.f11577b, defaultWindowInsets.f11578c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.k1.f46774b;
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
        g0.Q((g0) this.f30553b, view, i10, f7);
    }

    @Override
    public boolean d(int i10, View view) {
        Object O;
        sk skVar = (sk) this.f30553b;
        s4.i0 adapter = skVar.f30837r.getAdapter();
        lk lkVar = skVar.v;
        if (adapter == lkVar) {
            O = lkVar.E(i10);
        } else {
            rk rkVar = skVar.f30841y;
            O = rkVar.O(rkVar.S(i10), rkVar.Q(i10));
        }
        return skVar.S(view, O);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.f30552a;
        Object obj = this.f30553b;
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
        int i11 = this.f30552a;
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public boolean e1(long j3, int i10, int i11, int i12, ai.hc hcVar) {
        qo qoVar = (qo) ((org.telegram.ui.Cells.m6) this.f30553b).T;
        ImageReceiver imageReceiver = qoVar.f33156a;
        hcVar.f1107c = imageReceiver;
        hcVar.f1114l = imageReceiver;
        org.telegram.ui.Cells.m6 m6Var = qoVar.G;
        hcVar.f1115m = m6Var;
        boolean z10 = m6Var.f857w;
        qo qoVar2 = qoVar.K.f31561e;
        hcVar.f1105a = qoVar2;
        hcVar.f1113k = qoVar2.getAlpha();
        hcVar.h = 0.0f;
        hcVar.f1111i = AndroidUtilities.displaySize.y;
        hcVar.f1110g = (View) qoVar.getParent();
        return true;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f30552a) {
            case 0:
                y.T((y) this.f30553b, b2Var);
                return;
            case 2:
                ((org.telegram.ui.ActionBar.n5) this.f30553b).run();
                return;
            case 3:
                ((ai.j) this.f30553b).run();
                return;
            case 4:
                ((ai.db) this.f30553b).run();
                return;
            case 5:
                ((u1) this.f30553b).run();
                return;
            case 6:
                ((ps) this.f30553b).run();
                return;
            case 8:
                ((r2) this.f30553b).run();
                return;
            case 17:
                ((jg) this.f30553b).f27710a.U0.s();
                return;
            case 19:
                ((ea) this.f30553b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((lo) this.f30553b).f30173b.dismiss();
                return;
            case 24:
                ((nn) this.f30553b).f29213a.E.s();
                return;
            default:
                ((xu) this.f30553b).f33009a.d.s();
                return;
        }
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public boolean h(float f7) {
        return false;
    }

    @Override
    public String i(int i10) {
        return ((String[]) this.f30553b)[i10];
    }

    @Override
    public boolean k(t0.i iVar, int i10, Bundle bundle) {
        pg pgVar = (pg) this.f30553b;
        ChatActivityEnterView chatActivityEnterView = pgVar.d;
        if (chatActivityEnterView.f23923l5) {
            return true;
        }
        int i11 = n0.a.f16456a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f48189a.d();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = iVar.f48189a;
        if (!hVar.getDescription().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, hVar.c())) {
            pgVar.m(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            g5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new y2(3, pgVar, iVar), chatActivityEnterView.W3);
            return true;
        } else {
            pgVar.o(iVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public void l(vh.g gVar, float f7, float f10) {
        ((tu) this.f30553b).c(gVar, f7, f10);
    }

    @Override
    public void m(int i10) {
        br brVar = ((cr) this.f30553b).f25484a;
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
        z2 z2Var = (z2) this.f30553b;
        if (i10 == 0) {
            z2Var.run();
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var = ((ns) this.f30553b).f29275a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && n1Var != null && n1Var.isShowing()) {
            n1Var.d(true);
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f30552a;
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        im imVar = (im) this.f30553b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = imVar.f27434e;
        yi yiVar = chatAttachAlertPhotoLayout.f30173b;
        if (imVar.f27431a != null && !yiVar.V && chatAttachAlertPhotoLayout.P != null) {
            ChatAttachAlertPhotoLayout.f24021q1 = false;
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
                    int i13 = ChatAttachAlertPhotoLayout.f24025u1;
                    ChatAttachAlertPhotoLayout.f24025u1 = i13 - 1;
                    photoEntry = new MediaController.PhotoEntry(0, i13, 0L, imVar.f27431a.getAbsolutePath(), 0, true, i12, i11, 0L);
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
            int i132 = ChatAttachAlertPhotoLayout.f24025u1;
            ChatAttachAlertPhotoLayout.f24025u1 = i132 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i132, 0L, imVar.f27431a.getAbsolutePath(), 0, true, i122, i11, 0L);
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
    public void p() {
        i6 i6Var = (i6) this.f30553b;
        i6Var.b();
        i6Var.e();
    }

    @Override
    public void q(Canvas canvas, int i10) {
        ((xb) this.f30553b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override
    public void r(ud0 ud0Var, int i10) {
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) this.f30553b;
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
    public void e(boolean z10) {
    }

    @Override
    public void j() {
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
