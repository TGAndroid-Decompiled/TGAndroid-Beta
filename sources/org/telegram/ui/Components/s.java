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
public final class s implements org.telegram.ui.ActionBar.z1, ol0, dd0, ed0, fd0, le.g, ImageReceiver.ImageReceiverDelegate, d5, r0.n, uh.a, t0.e, pl0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.r5, ai.fc, org.telegram.ui.ActionBar.q0, org.telegram.ui.ActionBar.k1, vh.k {
    public final int f28152a;
    public final Object f28153b;

    public s(Object obj, int i10) {
        this.f28152a = i10;
        this.f28153b = obj;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        int i12;
        n8 n8Var = (n8) this.f28153b;
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
        lb lbVar = ((mb) this.f28153b).f26253a;
        if (lbVar != null) {
            lbVar.setPadding(defaultWindowInsets.f10590a, defaultWindowInsets.f10591b, defaultWindowInsets.f10592c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.l1.f42244b;
    }

    @Override
    public void Z(long j3, int i10, ai.d5 d5Var) {
        d5Var.run();
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        g0.P((g0) this.f28153b, view, i10, f7);
    }

    @Override
    public boolean d(int i10, View view) {
        Object O;
        rk rkVar = (rk) this.f28153b;
        s4.h0 adapter = rkVar.f28045r.getAdapter();
        kk kkVar = rkVar.v;
        if (adapter == kkVar) {
            O = kkVar.E(i10);
        } else {
            qk qkVar = rkVar.f28049y;
            O = qkVar.O(qkVar.S(i10), qkVar.Q(i10));
        }
        return rkVar.P(view, O);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.f28152a;
        Object obj = this.f28153b;
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
        int i11 = this.f28152a;
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f28152a) {
            case 0:
                y.S((y) this.f28153b, a2Var);
                return;
            case 2:
                ((org.telegram.ui.ActionBar.l5) this.f28153b).run();
                return;
            case 3:
                ((ai.j) this.f28153b).run();
                return;
            case 4:
                ((ai.cb) this.f28153b).run();
                return;
            case 5:
                ((t1) this.f28153b).run();
                return;
            case 6:
                ((cs) this.f28153b).run();
                return;
            case 8:
                ((p2) this.f28153b).run();
                return;
            case 17:
                ((ig) this.f28153b).f25111a.U0.r();
                return;
            case 19:
                ((ld) this.f28153b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((xn) this.f28153b).f27362b.dismiss();
                return;
            default:
                ((an) this.f28153b).f22660a.E.r();
                return;
        }
    }

    @Override
    public boolean f1(long j3, int i10, int i11, int i12, ai.gc gcVar) {
        co coVar = (co) ((org.telegram.ui.Cells.m6) this.f28153b).T;
        ImageReceiver imageReceiver = coVar.f29863a;
        gcVar.f917c = imageReceiver;
        gcVar.f923l = imageReceiver;
        org.telegram.ui.Cells.m6 m6Var = coVar.G;
        gcVar.f924m = m6Var;
        boolean z10 = m6Var.f674w;
        co coVar2 = coVar.K.e;
        gcVar.f915a = coVar2;
        gcVar.f922k = coVar2.getAlpha();
        gcVar.h = 0.0f;
        gcVar.f920i = AndroidUtilities.displaySize.y;
        gcVar.f919g = (View) coVar.getParent();
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
        return ((String[]) this.f28153b)[i10];
    }

    @Override
    public boolean k(t0.i iVar, int i10, Bundle bundle) {
        og ogVar = (og) this.f28153b;
        ChatActivityEnterView chatActivityEnterView = ogVar.d;
        if (chatActivityEnterView.f22046l5) {
            return true;
        }
        int i11 = n0.a.f15087a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f43396a.d();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = iVar.f43396a;
        if (!hVar.getDescription().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, hVar.c())) {
            ogVar.m(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            e5.M(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new w2(3, ogVar, iVar), chatActivityEnterView.W3);
            return true;
        } else {
            ogVar.o(iVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public void l(vh.g gVar, float f7, float f10) {
        ((gu) this.f28153b).c(gVar, f7, f10);
    }

    @Override
    public void m(int i10) {
        oq oqVar = ((pq) this.f28153b).f27444a;
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
        oqVar.l(z10);
    }

    @Override
    public void n(int i10) {
        x2 x2Var = (x2) this.f28153b;
        if (i10 == 0) {
            x2Var.run();
        }
    }

    @Override
    public void o(Canvas canvas, int i10) {
        ((vb) this.f28153b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f28152a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        BitmapFactory.Options options;
        ul ulVar = (ul) this.f28153b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ulVar.e;
        xi xiVar = chatAttachAlertPhotoLayout.f27362b;
        if (ulVar.f28887a != null && !xiVar.V && chatAttachAlertPhotoLayout.P != null) {
            ChatAttachAlertPhotoLayout.f22142q1 = false;
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
                int i13 = ChatAttachAlertPhotoLayout.f22146u1;
                ChatAttachAlertPhotoLayout.f22146u1 = i13 - 1;
                photoEntry = new MediaController.PhotoEntry(0, i13, 0L, ulVar.f28887a.getAbsolutePath(), 0, true, i12, i11, 0L);
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
            int i132 = ChatAttachAlertPhotoLayout.f22146u1;
            ChatAttachAlertPhotoLayout.f22146u1 = i132 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i132, 0L, ulVar.f28887a.getAbsolutePath(), 0, true, i122, i11, 0L);
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
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var = ((as) this.f28153b).f22706a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && m1Var != null && m1Var.isShowing()) {
            m1Var.d(true);
        }
    }

    @Override
    public void q(hd0 hd0Var, int i10) {
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) this.f28153b;
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
        g6 g6Var = (g6) this.f28153b;
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
