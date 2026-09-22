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
public final class s implements org.telegram.ui.ActionBar.a2, nl0, bd0, cd0, dd0, le.f, ImageReceiver.ImageReceiverDelegate, c5, r0.n, uh.a, t0.e, ol0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.s5, ai.fc, org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.l1, vh.k {
    public final int f28078a;
    public final Object f28079b;

    public s(Object obj, int i10) {
        this.f28078a = i10;
        this.f28079b = obj;
    }

    @Override
    public void A() {
        f6 f6Var = (f6) this.f28079b;
        f6Var.b();
        f6Var.e();
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        int i12;
        m8 m8Var = (m8) this.f28079b;
        int i13 = i10 * 60;
        if (i10 == 0) {
            i12 = 71;
        } else {
            i12 = 70;
        }
        m8Var.U0(i13, i12);
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        jb jbVar = ((kb) this.f28079b).f25661a;
        if (jbVar != null) {
            jbVar.setPadding(defaultWindowInsets.f10592a, defaultWindowInsets.f10593b, defaultWindowInsets.f10594c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.l1.f42174b;
    }

    @Override
    public void Z(long j3, int i10, ai.e5 e5Var) {
        e5Var.run();
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        g0.P((g0) this.f28079b, view, i10, f7);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public boolean d(int i10, View view) {
        Object O;
        ok okVar = (ok) this.f28079b;
        s4.h0 adapter = okVar.f27117r.getAdapter();
        hk hkVar = okVar.v;
        if (adapter == hkVar) {
            O = hkVar.E(i10);
        } else {
            nk nkVar = okVar.f27121y;
            O = nkVar.O(nkVar.S(i10), nkVar.Q(i10));
        }
        return okVar.P(view, O);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.f28078a;
        Object obj = this.f28079b;
        switch (i10) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new j6((v6) obj, 1));
                duration.start();
                return;
            default:
                v9 v9Var = (v9) obj;
                v9Var.getClass();
                if (z10 && !z11) {
                    v9Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.f28078a;
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        return ((String[]) this.f28079b)[i10];
    }

    @Override
    public boolean f(t0.i iVar, int i10, Bundle bundle) {
        mg mgVar = (mg) this.f28079b;
        ChatActivityEnterView chatActivityEnterView = mgVar.d;
        if (chatActivityEnterView.f22039l5) {
            return true;
        }
        int i11 = n0.a.f15082a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f43323a.d();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = iVar.f43323a;
        if (!hVar.getDescription().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, hVar.c())) {
            mgVar.m(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            d5.M(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new a3(2, mgVar, iVar), chatActivityEnterView.W3);
            return true;
        } else {
            mgVar.o(iVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public boolean f1(long j3, int i10, int i11, int i12, ai.gc gcVar) {
        zn znVar = (zn) ((org.telegram.ui.Cells.n6) this.f28079b).T;
        ImageReceiver imageReceiver = znVar.f29034a;
        gcVar.f914c = imageReceiver;
        gcVar.f920l = imageReceiver;
        org.telegram.ui.Cells.n6 n6Var = znVar.G;
        gcVar.f921m = n6Var;
        boolean z10 = n6Var.f665w;
        zn znVar2 = znVar.K.e;
        gcVar.f912a = znVar2;
        gcVar.f919k = znVar2.getAlpha();
        gcVar.h = 0.0f;
        gcVar.f917i = AndroidUtilities.displaySize.y;
        gcVar.f916g = (View) znVar.getParent();
        return true;
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
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f28078a) {
            case 0:
                y.S((y) this.f28079b, b2Var);
                return;
            case 2:
                ((org.telegram.ui.ActionBar.n5) this.f28079b).run();
                return;
            case 3:
                ((ai.j) this.f28079b).run();
                return;
            case 4:
                ((ai.cb) this.f28079b).run();
                return;
            case 5:
                ((t1) this.f28079b).run();
                return;
            case 6:
                ((zr) this.f28079b).run();
                return;
            case 8:
                ((p2) this.f28079b).run();
                return;
            case 17:
                ((gg) this.f28079b).f24517a.U0.r();
                return;
            case 19:
                ((tc) this.f28079b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((un) this.f28079b).f26786b.dismiss();
                return;
            case 24:
                ((xm) this.f28079b).f30349a.E.r();
                return;
            default:
                ((hu) this.f28079b).f24891a.d.r();
                return;
        }
    }

    @Override
    public void l(vh.g gVar, float f7, float f10) {
        ((du) this.f28079b).c(gVar, f7, f10);
    }

    @Override
    public void m(int i10) {
        lq lqVar = ((mq) this.f28079b).f26516a;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                lqVar.y();
                return;
            }
            return;
        }
        if (i10 != 2) {
            z10 = false;
        }
        lqVar.l(z10);
    }

    @Override
    public void n(int i10) {
        w2 w2Var = (w2) this.f28079b;
        if (i10 == 0) {
            w2Var.run();
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var = ((xr) this.f28079b).f30400a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && n1Var != null && n1Var.isShowing()) {
            n1Var.d(true);
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f28078a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        BitmapFactory.Options options;
        rl rlVar = (rl) this.f28079b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = rlVar.e;
        vi viVar = chatAttachAlertPhotoLayout.f26786b;
        if (rlVar.f28005a != null && !viVar.V && chatAttachAlertPhotoLayout.P != null) {
            ChatAttachAlertPhotoLayout.f22135q1 = false;
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
                int i13 = ChatAttachAlertPhotoLayout.f22139u1;
                ChatAttachAlertPhotoLayout.f22139u1 = i13 - 1;
                photoEntry = new MediaController.PhotoEntry(0, i13, 0L, rlVar.f28005a.getAbsolutePath(), 0, true, i12, i11, 0L);
                photoEntry.duration = (int) (((float) j3) / 1000.0f);
                photoEntry.thumbPath = str;
                if (viVar.Q0 != 0) {
                    MediaController.CropState cropState = new MediaController.CropState();
                    photoEntry.cropState = cropState;
                    cropState.mirrored = true;
                    cropState.freeform = false;
                    cropState.lockedAspectRatio = 1.0f;
                }
                chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
            }
            int i122 = i10;
            int i132 = ChatAttachAlertPhotoLayout.f22139u1;
            ChatAttachAlertPhotoLayout.f22139u1 = i132 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i132, 0L, rlVar.f28005a.getAbsolutePath(), 0, true, i122, i11, 0L);
            photoEntry.duration = (int) (((float) j3) / 1000.0f);
            photoEntry.thumbPath = str;
            if (viVar.Q0 != 0 && chatAttachAlertPhotoLayout.P.isFrontface()) {
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
        ((tb) this.f28079b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override
    public void q(fd0 fd0Var, int i10) {
        org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) this.f28079b;
        try {
            if (i10 == 0) {
                v3Var.setText(LocaleController.getString(R.string.DisableAutoDeleteTimer));
            } else {
                v3Var.setText(LocaleController.getString(R.string.SetAutoDeleteTimer));
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
    public void q0(View view, float f7, float f10) {
    }
}
