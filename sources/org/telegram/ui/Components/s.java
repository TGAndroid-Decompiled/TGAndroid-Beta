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
public final class s implements org.telegram.ui.ActionBar.b2, bl0, qc0, rc0, sc0, le.f, ImageReceiver.ImageReceiverDelegate, b5, r0.n, uh.a, t0.f, cl0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.q5, ai.fc, org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.m1, vh.l {
    public final int f27725a;
    public final Object f27726b;

    public s(Object obj, int i10) {
        this.f27725a = i10;
        this.f27726b = obj;
    }

    @Override
    public void E() {
        e6 e6Var = (e6) this.f27726b;
        e6Var.b();
        e6Var.e();
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        int i12;
        l8 l8Var = (l8) this.f27726b;
        int i13 = i10 * 60;
        if (i10 == 0) {
            i12 = 71;
        } else {
            i12 = 70;
        }
        l8Var.U0(i13, i12);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        ib ibVar = ((jb) this.f27726b).f25198a;
        if (ibVar != null) {
            ibVar.setPadding(defaultWindowInsets.f10591a, defaultWindowInsets.f10592b, defaultWindowInsets.f10593c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.l1.f41876b;
    }

    @Override
    public void Z(long j3, int i10, ai.e5 e5Var) {
        e5Var.run();
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        g0.P((g0) this.f27726b, view, i10, f7);
    }

    @Override
    public boolean d(int i10, View view) {
        Object O;
        ok okVar = (ok) this.f27726b;
        s4.h0 adapter = okVar.f26763r.getAdapter();
        hk hkVar = okVar.v;
        if (adapter == hkVar) {
            O = hkVar.E(i10);
        } else {
            nk nkVar = okVar.f26767y;
            O = nkVar.O(nkVar.S(i10), nkVar.Q(i10));
        }
        return okVar.P(view, O);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.f27725a;
        Object obj = this.f27726b;
        switch (i10) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new i6((u6) obj, 1));
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
        int i11 = this.f27725a;
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        return ((String[]) this.f27726b)[i10];
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f27725a) {
            case 0:
                y.S((y) this.f27726b, c2Var);
                return;
            case 2:
                ((org.telegram.ui.ActionBar.o5) this.f27726b).run();
                return;
            case 3:
                ((ai.j) this.f27726b).run();
                return;
            case 4:
                ((ai.cb) this.f27726b).run();
                return;
            case 5:
                ((t1) this.f27726b).run();
                return;
            case 6:
                ((zr) this.f27726b).run();
                return;
            case 8:
                ((p2) this.f27726b).run();
                return;
            case 17:
                ((fg) this.f27726b).f23908a.U0.r();
                return;
            case 19:
                ((org.telegram.ui.wh) this.f27726b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((un) this.f27726b).f26460b.dismiss();
                return;
            default:
                ((xm) this.f27726b).f29942a.E.r();
                return;
        }
    }

    @Override
    public boolean f1(long j3, int i10, int i11, int i12, ai.gc gcVar) {
        zn znVar = (zn) ((org.telegram.ui.Cells.l6) this.f27726b).T;
        ImageReceiver imageReceiver = znVar.f28301a;
        gcVar.f917c = imageReceiver;
        gcVar.f923l = imageReceiver;
        org.telegram.ui.Cells.l6 l6Var = znVar.G;
        gcVar.f924m = l6Var;
        boolean z10 = l6Var.f668w;
        zn znVar2 = znVar.K.e;
        gcVar.f915a = znVar2;
        gcVar.f922k = znVar2.getAlpha();
        gcVar.h = 0.0f;
        gcVar.f920i = AndroidUtilities.displaySize.y;
        gcVar.f919g = (View) znVar.getParent();
        return true;
    }

    @Override
    public boolean h(t0.j jVar, int i10, Bundle bundle) {
        lg lgVar = (lg) this.f27726b;
        ChatActivityEnterView chatActivityEnterView = lgVar.d;
        if (chatActivityEnterView.f21809k5) {
            return true;
        }
        int i11 = n0.a.f14855a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                jVar.f43023a.d();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.i iVar = jVar.f43023a;
        if (!iVar.getDescription().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, iVar.c())) {
            lgVar.m(iVar.c(), iVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            c5.M(chatActivityEnterView.N2, chatActivityEnterView.O2.a(), new mf(1, lgVar, jVar), chatActivityEnterView.V3);
            return true;
        } else {
            lgVar.o(jVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public void j(vh.h hVar, float f7, float f10) {
        ((du) this.f27726b).c(hVar, f7, f10);
    }

    @Override
    public boolean k(float f7) {
        return false;
    }

    @Override
    public void m(int i10) {
        lq lqVar = ((mq) this.f27726b).f26240a;
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
        w2 w2Var = (w2) this.f27726b;
        if (i10 == 0) {
            w2Var.run();
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var = ((xr) this.f27726b).f29976a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && o1Var != null && o1Var.isShowing()) {
            o1Var.d(true);
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f27725a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        BitmapFactory.Options options;
        rl rlVar = (rl) this.f27726b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = rlVar.e;
        vi viVar = chatAttachAlertPhotoLayout.f26460b;
        if (rlVar.f27638a != null && !viVar.V && chatAttachAlertPhotoLayout.P != null) {
            ChatAttachAlertPhotoLayout.f21908q1 = false;
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
                int i13 = ChatAttachAlertPhotoLayout.f21912u1;
                ChatAttachAlertPhotoLayout.f21912u1 = i13 - 1;
                photoEntry = new MediaController.PhotoEntry(0, i13, 0L, rlVar.f27638a.getAbsolutePath(), 0, true, i12, i11, 0L);
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
            int i132 = ChatAttachAlertPhotoLayout.f21912u1;
            ChatAttachAlertPhotoLayout.f21912u1 = i132 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i132, 0L, rlVar.f27638a.getAbsolutePath(), 0, true, i122, i11, 0L);
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
        ((sb) this.f27726b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override
    public void q(uc0 uc0Var, int i10) {
        org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) this.f27726b;
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
    public void a() {
    }

    @Override
    public void b(boolean z10) {
    }

    @Override
    public void g(boolean z10) {
    }

    @Override
    public void l() {
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
