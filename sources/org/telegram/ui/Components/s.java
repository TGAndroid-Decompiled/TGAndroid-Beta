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
public final class s implements org.telegram.ui.ActionBar.a2, nl0, cd0, dd0, ed0, le.f, ImageReceiver.ImageReceiverDelegate, d5, r0.n, uh.a, t0.e, ol0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.r5, ai.fc, org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.l1, vh.k {
    public final int f30555a;
    public final Object f30556b;

    public s(Object obj, int i10) {
        this.f30555a = i10;
        this.f30556b = obj;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        int i12;
        n8 n8Var = (n8) this.f30556b;
        int i13 = i10 * 60;
        if (i10 == 0) {
            i12 = 71;
        } else {
            i12 = 70;
        }
        n8Var.U0(i13, i12);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        lb lbVar = ((mb) this.f30556b).f28571a;
        if (lbVar != null) {
            lbVar.setPadding(defaultWindowInsets.f11526a, defaultWindowInsets.f11527b, defaultWindowInsets.f11528c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.l1.f45616b;
    }

    @Override
    public void a0(long j3, int i10, ai.d5 d5Var) {
        d5Var.run();
    }

    @Override
    public void b(vh.g gVar, float f7, float f10) {
        ((gu) this.f30556b).c(gVar, f7, f10);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        g0.N((g0) this.f30556b, view, i10, f7);
    }

    @Override
    public boolean d(int i10, View view) {
        Object O;
        rk rkVar = (rk) this.f30556b;
        s4.h0 adapter = rkVar.f30439r.getAdapter();
        kk kkVar = rkVar.v;
        if (adapter == kkVar) {
            O = kkVar.E(i10);
        } else {
            qk qkVar = rkVar.f30443y;
            O = qkVar.O(qkVar.S(i10), qkVar.Q(i10));
        }
        return rkVar.N(view, O);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.f30555a;
        Object obj = this.f30556b;
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
        int i11 = this.f30555a;
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        return ((String[]) this.f30556b)[i10];
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f30555a) {
            case 0:
                y.Q((y) this.f30556b, b2Var);
                return;
            case 2:
                ((org.telegram.ui.ActionBar.m5) this.f30556b).run();
                return;
            case 3:
                ((ai.j) this.f30556b).run();
                return;
            case 4:
                ((ai.cb) this.f30556b).run();
                return;
            case 5:
                ((t1) this.f30556b).run();
                return;
            case 6:
                ((cs) this.f30556b).run();
                return;
            case 8:
                ((p2) this.f30556b).run();
                return;
            case 17:
                ((ig) this.f30556b).f27406a.U0.r();
                return;
            case 19:
                ((be) this.f30556b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((xn) this.f30556b).f29648b.dismiss();
                return;
            default:
                ((an) this.f30556b).f24581a.E.r();
                return;
        }
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    public boolean i1(long j3, int i10, int i11, int i12, ai.gc gcVar) {
        co coVar = (co) ((org.telegram.ui.Cells.m6) this.f30556b).T;
        ImageReceiver imageReceiver = coVar.f32493a;
        gcVar.f991c = imageReceiver;
        gcVar.f998l = imageReceiver;
        org.telegram.ui.Cells.m6 m6Var = coVar.G;
        gcVar.f999m = m6Var;
        boolean z10 = m6Var.f731w;
        co coVar2 = coVar.K.f27186e;
        gcVar.f989a = coVar2;
        gcVar.f997k = coVar2.getAlpha();
        gcVar.h = 0.0f;
        gcVar.f995i = AndroidUtilities.displaySize.y;
        gcVar.f994g = (View) coVar.getParent();
        return true;
    }

    @Override
    public boolean j(float f7) {
        return false;
    }

    @Override
    public boolean l(t0.i iVar, int i10, Bundle bundle) {
        og ogVar = (og) this.f30556b;
        ChatActivityEnterView chatActivityEnterView = ogVar.d;
        if (chatActivityEnterView.f23924l5) {
            return true;
        }
        int i11 = n0.a.f16484a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f46888a.d();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = iVar.f46888a;
        if (!hVar.getDescription().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, hVar.c())) {
            ogVar.m(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            e5.M(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new w2(4, ogVar, iVar), chatActivityEnterView.W3);
            return true;
        } else {
            ogVar.o(iVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public void m(int i10) {
        oq oqVar = ((pq) this.f30556b).f29714a;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                oqVar.y();
                return;
            }
            return;
        }
        if (i10 != 2) {
            z10 = false;
        }
        oqVar.d(z10);
    }

    @Override
    public void n(int i10) {
        x2 x2Var = (x2) this.f30556b;
        if (i10 == 0) {
            x2Var.run();
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var = ((as) this.f30556b).f24654a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && n1Var != null && n1Var.isShowing()) {
            n1Var.d(true);
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f30555a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        BitmapFactory.Options options;
        ul ulVar = (ul) this.f30556b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ulVar.f31400e;
        xi xiVar = chatAttachAlertPhotoLayout.f29648b;
        if (ulVar.f31397a != null && !xiVar.V && chatAttachAlertPhotoLayout.P != null) {
            ChatAttachAlertPhotoLayout.f24022q1 = false;
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
                int i13 = ChatAttachAlertPhotoLayout.f24026u1;
                ChatAttachAlertPhotoLayout.f24026u1 = i13 - 1;
                photoEntry = new MediaController.PhotoEntry(0, i13, 0L, ulVar.f31397a.getAbsolutePath(), 0, true, i12, i11, 0L);
                photoEntry.duration = (int) (((float) j3) / 1000.0f);
                photoEntry.thumbPath = str;
                if (xiVar.Q0 != 0) {
                    MediaController.CropState cropState = new MediaController.CropState();
                    photoEntry.cropState = cropState;
                    cropState.mirrored = true;
                    cropState.freeform = false;
                    cropState.lockedAspectRatio = 1.0f;
                }
                chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
            }
            int i122 = i10;
            int i132 = ChatAttachAlertPhotoLayout.f24026u1;
            ChatAttachAlertPhotoLayout.f24026u1 = i132 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i132, 0L, ulVar.f31397a.getAbsolutePath(), 0, true, i122, i11, 0L);
            photoEntry.duration = (int) (((float) j3) / 1000.0f);
            photoEntry.thumbPath = str;
            if (xiVar.Q0 != 0 && chatAttachAlertPhotoLayout.P.isFrontface()) {
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
        ((vb) this.f30556b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override
    public void q(gd0 gd0Var, int i10) {
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) this.f30556b;
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
    public void z() {
        g6 g6Var = (g6) this.f30556b;
        g6Var.b();
        g6Var.e();
    }

    @Override
    public void a() {
    }

    @Override
    public void f(boolean z10) {
    }

    @Override
    public void h(boolean z10) {
    }

    @Override
    public void k() {
    }

    @Override
    public void s0(View view, float f7, float f10) {
    }
}
