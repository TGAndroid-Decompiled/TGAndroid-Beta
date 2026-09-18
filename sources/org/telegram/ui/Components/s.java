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
public final class s implements org.telegram.ui.ActionBar.a2, ll0, zc0, ad0, bd0, le.f, ImageReceiver.ImageReceiverDelegate, d5, r0.n, uh.a, t0.e, ml0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.r5, ai.fc, org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.l1, vh.l {
    public final int f28008a;
    public final Object f28009b;

    public s(Object obj, int i10) {
        this.f28008a = i10;
        this.f28009b = obj;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        int i12;
        n8 n8Var = (n8) this.f28009b;
        int i13 = i10 * 60;
        if (i10 == 0) {
            i12 = 71;
        } else {
            i12 = 70;
        }
        n8Var.U0(i13, i12);
    }

    @Override
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        kb kbVar = ((lb) this.f28009b).f26091a;
        if (kbVar != null) {
            kbVar.setPadding(defaultWindowInsets.f10591a, defaultWindowInsets.f10592b, defaultWindowInsets.f10593c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.m1.f42108b;
    }

    @Override
    public void Z(long j3, int i10, ai.e5 e5Var) {
        e5Var.run();
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        g0.P((g0) this.f28009b, view, i10, f7);
    }

    @Override
    public boolean d(int i10, View view) {
        Object O;
        ok okVar = (ok) this.f28009b;
        s4.h0 adapter = okVar.f26968r.getAdapter();
        hk hkVar = okVar.v;
        if (adapter == hkVar) {
            O = hkVar.E(i10);
        } else {
            nk nkVar = okVar.f26972y;
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
        int i10 = this.f28008a;
        Object obj = this.f28009b;
        switch (i10) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new k6((w6) obj, 1));
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
        int i11 = this.f28008a;
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f28008a) {
            case 0:
                y.S((y) this.f28009b, b2Var);
                return;
            case 2:
                ((org.telegram.ui.ActionBar.n5) this.f28009b).run();
                return;
            case 3:
                ((ai.j) this.f28009b).run();
                return;
            case 4:
                ((ai.cb) this.f28009b).run();
                return;
            case 5:
                ((t1) this.f28009b).run();
                return;
            case 6:
                ((zr) this.f28009b).run();
                return;
            case 8:
                ((p2) this.f28009b).run();
                return;
            case 17:
                ((gg) this.f28009b).f24382a.U0.r();
                return;
            case 19:
                ((zd) this.f28009b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((un) this.f28009b).f26688b.dismiss();
                return;
            default:
                ((xm) this.f28009b).f30344a.E.r();
                return;
        }
    }

    @Override
    public boolean f1(long j3, int i10, int i11, int i12, ai.gc gcVar) {
        zn znVar = (zn) ((org.telegram.ui.Cells.m6) this.f28009b).T;
        ImageReceiver imageReceiver = znVar.f29987a;
        gcVar.f917c = imageReceiver;
        gcVar.f923l = imageReceiver;
        org.telegram.ui.Cells.m6 m6Var = znVar.G;
        gcVar.f924m = m6Var;
        boolean z10 = m6Var.f668w;
        zn znVar2 = znVar.K.e;
        gcVar.f915a = znVar2;
        gcVar.f922k = znVar2.getAlpha();
        gcVar.h = 0.0f;
        gcVar.f920i = AndroidUtilities.displaySize.y;
        gcVar.f919g = (View) znVar.getParent();
        return true;
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
    public String j(int i10) {
        return ((String[]) this.f28009b)[i10];
    }

    @Override
    public boolean k(t0.i iVar, int i10, Bundle bundle) {
        mg mgVar = (mg) this.f28009b;
        ChatActivityEnterView chatActivityEnterView = mgVar.d;
        if (chatActivityEnterView.f21985k5) {
            return true;
        }
        int i11 = n0.a.f15028a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f43258a.d();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = iVar.f43258a;
        if (!hVar.getDescription().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, hVar.c())) {
            mgVar.m(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            e5.M(chatActivityEnterView.N2, chatActivityEnterView.O2.a(), new b3(2, mgVar, iVar), chatActivityEnterView.V3);
            return true;
        } else {
            mgVar.o(iVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public void l(vh.h hVar, float f7, float f10) {
        ((du) this.f28009b).c(hVar, f7, f10);
    }

    @Override
    public void m(int i10) {
        lq lqVar = ((mq) this.f28009b).f26495a;
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
        w2 w2Var = (w2) this.f28009b;
        if (i10 == 0) {
            w2Var.run();
        }
    }

    @Override
    public void o(Canvas canvas, int i10) {
        ((ub) this.f28009b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f28008a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        BitmapFactory.Options options;
        rl rlVar = (rl) this.f28009b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = rlVar.e;
        vi viVar = chatAttachAlertPhotoLayout.f26688b;
        if (rlVar.f27924a != null && !viVar.V && chatAttachAlertPhotoLayout.P != null) {
            ChatAttachAlertPhotoLayout.f22084q1 = false;
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
                int i13 = ChatAttachAlertPhotoLayout.f22088u1;
                ChatAttachAlertPhotoLayout.f22088u1 = i13 - 1;
                photoEntry = new MediaController.PhotoEntry(0, i13, 0L, rlVar.f27924a.getAbsolutePath(), 0, true, i12, i11, 0L);
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
            int i132 = ChatAttachAlertPhotoLayout.f22088u1;
            ChatAttachAlertPhotoLayout.f22088u1 = i132 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i132, 0L, rlVar.f27924a.getAbsolutePath(), 0, true, i122, i11, 0L);
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
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var = ((xr) this.f28009b).f30365a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && n1Var != null && n1Var.isShowing()) {
            n1Var.d(true);
        }
    }

    @Override
    public void q(dd0 dd0Var, int i10) {
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) this.f28009b;
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
    public void u() {
        g6 g6Var = (g6) this.f28009b;
        g6Var.b();
        g6Var.e();
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
    public void i() {
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
