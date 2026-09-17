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
public final class t implements org.telegram.ui.ActionBar.a2, al0, rc0, sc0, tc0, le.f, ImageReceiver.ImageReceiverDelegate, d5, r0.n, vh.a, t0.f, bl0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.q5, bi.lb, org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.l1, wh.l {
    public final int f30481a;
    public final Object f30482b;

    public t(Object obj, int i10) {
        this.f30481a = i10;
        this.f30482b = obj;
    }

    @Override
    public boolean H0(long j3, int i10, int i11, int i12, bi.mb mbVar) {
        yn ynVar = (yn) ((org.telegram.ui.Cells.l6) this.f30482b).T;
        ImageReceiver imageReceiver = ynVar.f32504a;
        mbVar.f3362c = imageReceiver;
        mbVar.f3369l = imageReceiver;
        org.telegram.ui.Cells.l6 l6Var = ynVar.G;
        mbVar.f3370m = l6Var;
        boolean z10 = l6Var.f3193w;
        yn ynVar2 = ynVar.K.f25073e;
        mbVar.f3360a = ynVar2;
        mbVar.f3368k = ynVar2.getAlpha();
        mbVar.h = 0.0f;
        mbVar.f3366i = AndroidUtilities.displaySize.y;
        mbVar.f3365g = (View) ynVar.getParent();
        return true;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        int i12;
        p8 p8Var = (p8) this.f30482b;
        int i13 = i10 * 60;
        if (i10 == 0) {
            i12 = 71;
        } else {
            i12 = 70;
        }
        p8Var.Y0(i13, i12);
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        kb kbVar = ((lb) this.f30482b).f28156a;
        if (kbVar != null) {
            kbVar.setPadding(defaultWindowInsets.f11451a, defaultWindowInsets.f11452b, defaultWindowInsets.f11453c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.l1.f44739b;
    }

    @Override
    public boolean a(int i10, View view) {
        Object O;
        ok okVar = (ok) this.f30482b;
        s4.h0 adapter = okVar.f29120r.getAdapter();
        hk hkVar = okVar.v;
        if (adapter == hkVar) {
            O = hkVar.E(i10);
        } else {
            nk nkVar = okVar.f29124y;
            O = nkVar.O(nkVar.S(i10), nkVar.Q(i10));
        }
        return okVar.P(view, O);
    }

    @Override
    public void b(int i10) {
        x2 x2Var = (x2) this.f30482b;
        if (i10 == 0) {
            x2Var.run();
        }
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        h0.P((h0) this.f30482b, view, i10, f7);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.f30481a;
        Object obj = this.f30482b;
        switch (i10) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new l6((x6) obj, 1));
                duration.start();
                return;
            default:
                x9 x9Var = (x9) obj;
                x9Var.getClass();
                if (z10 && !z11) {
                    x9Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.f30481a;
        org.telegram.messenger.g5.a(this, i10, str, drawable);
    }

    @Override
    public String f(int i10) {
        return ((String[]) this.f30482b)[i10];
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f30481a) {
            case 0:
                z.S((z) this.f30482b, b2Var);
                return;
            case 2:
                ((org.telegram.ui.ActionBar.n5) this.f30482b).run();
                return;
            case 3:
                ((bi.g) this.f30482b).run();
                return;
            case 4:
                ((bi.ia) this.f30482b).run();
                return;
            case 5:
                ((u1) this.f30482b).run();
                return;
            case 6:
                ((yr) this.f30482b).run();
                return;
            case 8:
                ((q2) this.f30482b).run();
                return;
            case 17:
                ((hg) this.f30482b).f26758a.U0.r();
                return;
            case 19:
                ((uc) this.f30482b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((tn) this.f30482b).f28781b.dismiss();
                return;
            default:
                ((wm) this.f30482b).f32319a.E.r();
                return;
        }
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public boolean j(float f7) {
        return false;
    }

    @Override
    public boolean l(t0.j jVar, int i10, Bundle bundle) {
        ng ngVar = (ng) this.f30482b;
        ChatActivityEnterView chatActivityEnterView = ngVar.d;
        if (chatActivityEnterView.f23758k5) {
            return true;
        }
        int i11 = n0.a.f16365a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                jVar.f46451a.d();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.i iVar = jVar.f46451a;
        if (!iVar.getDescription().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, iVar.c())) {
            ngVar.m(iVar.c(), iVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            e5.M(chatActivityEnterView.N2, chatActivityEnterView.O2.a(), new b3(2, ngVar, jVar), chatActivityEnterView.V3);
            return true;
        } else {
            ngVar.o(jVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public void m(int i10) {
        kq kqVar = ((lq) this.f30482b).f28304a;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                kqVar.z();
                return;
            }
            return;
        }
        if (i10 != 2) {
            z10 = false;
        }
        kqVar.k(z10);
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var = ((wr) this.f30482b).f32350a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && n1Var != null && n1Var.isShowing()) {
            n1Var.d(true);
        }
    }

    @Override
    public void o(wh.h hVar, float f7, float f10) {
        ((bu) this.f30482b).c(hVar, f7, f10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f30481a;
        org.telegram.messenger.g5.b(this, imageReceiver);
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        BitmapFactory.Options options;
        rl rlVar = (rl) this.f30482b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = rlVar.f30072e;
        vi viVar = chatAttachAlertPhotoLayout.f28781b;
        if (rlVar.f30069a != null && !viVar.V && chatAttachAlertPhotoLayout.P != null) {
            ChatAttachAlertPhotoLayout.f23859q1 = false;
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
                int i13 = ChatAttachAlertPhotoLayout.f23863u1;
                ChatAttachAlertPhotoLayout.f23863u1 = i13 - 1;
                photoEntry = new MediaController.PhotoEntry(0, i13, 0L, rlVar.f30069a.getAbsolutePath(), 0, true, i12, i11, 0L);
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
            int i132 = ChatAttachAlertPhotoLayout.f23863u1;
            ChatAttachAlertPhotoLayout.f23863u1 = i132 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i132, 0L, rlVar.f30069a.getAbsolutePath(), 0, true, i122, i11, 0L);
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
    public void p(long j3, int i10, bi.p4 p4Var) {
        p4Var.run();
    }

    @Override
    public void q() {
        g6 g6Var = (g6) this.f30482b;
        g6Var.b();
        g6Var.e();
    }

    @Override
    public void r(Canvas canvas, int i10) {
        ((ub) this.f30482b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override
    public void s(vc0 vc0Var, int i10) {
        org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) this.f30482b;
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
    public void c() {
    }

    @Override
    public void e(boolean z10) {
    }

    @Override
    public void h(boolean z10) {
    }

    @Override
    public void k() {
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
