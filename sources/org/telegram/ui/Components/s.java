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
public final class s implements org.telegram.ui.ActionBar.a2, bl0, pc0, qc0, rc0, le.g, ImageReceiver.ImageReceiverDelegate, d5, r0.n, uh.a, t0.e, cl0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.r5, ai.fc, org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.l1, vh.l {
    public final int f27761a;
    public final Object f27762b;

    public s(Object obj, int i10) {
        this.f27761a = i10;
        this.f27762b = obj;
    }

    @Override
    public void E() {
        g6 g6Var = (g6) this.f27762b;
        g6Var.b();
        g6Var.e();
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        int i12;
        n8 n8Var = (n8) this.f27762b;
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
        kb kbVar = ((lb) this.f27762b).f25854a;
        if (kbVar != null) {
            kbVar.setPadding(defaultWindowInsets.f10576a, defaultWindowInsets.f10577b, defaultWindowInsets.f10578c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.l1.f41806b;
    }

    @Override
    public void Z(long j3, int i10, ai.d5 d5Var) {
        d5Var.run();
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        g0.P((g0) this.f27762b, view, i10, f7);
    }

    @Override
    public boolean d(int i10, View view) {
        Object O;
        pk pkVar = (pk) this.f27762b;
        s4.h0 adapter = pkVar.f27068r.getAdapter();
        ik ikVar = pkVar.v;
        if (adapter == ikVar) {
            O = ikVar.E(i10);
        } else {
            ok okVar = pkVar.f27072y;
            O = okVar.O(okVar.S(i10), okVar.Q(i10));
        }
        return pkVar.P(view, O);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.f27761a;
        Object obj = this.f27762b;
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
        int i11 = this.f27761a;
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        return ((String[]) this.f27762b)[i10];
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f27761a) {
            case 0:
                y.S((y) this.f27762b, b2Var);
                return;
            case 2:
                ((org.telegram.ui.ActionBar.m5) this.f27762b).run();
                return;
            case 3:
                ((ai.j) this.f27762b).run();
                return;
            case 4:
                ((ai.cb) this.f27762b).run();
                return;
            case 5:
                ((t1) this.f27762b).run();
                return;
            case 6:
                ((as) this.f27762b).run();
                return;
            case 8:
                ((p2) this.f27762b).run();
                return;
            case 17:
                ((gg) this.f27762b).f24280a.U0.r();
                return;
            case 19:
                ((org.telegram.ui.rh) this.f27762b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((vn) this.f27762b).f26744b.dismiss();
                return;
            default:
                ((ym) this.f27762b).f30315a.E.r();
                return;
        }
    }

    @Override
    public boolean f1(long j3, int i10, int i11, int i12, ai.gc gcVar) {
        ao aoVar = (ao) ((org.telegram.ui.Cells.m6) this.f27762b).T;
        ImageReceiver imageReceiver = aoVar.f29579a;
        gcVar.f915c = imageReceiver;
        gcVar.f921l = imageReceiver;
        org.telegram.ui.Cells.m6 m6Var = aoVar.G;
        gcVar.f922m = m6Var;
        boolean z10 = m6Var.f674w;
        ao aoVar2 = aoVar.K.e;
        gcVar.f913a = aoVar2;
        gcVar.f920k = aoVar2.getAlpha();
        gcVar.h = 0.0f;
        gcVar.f918i = AndroidUtilities.displaySize.y;
        gcVar.f917g = (View) aoVar.getParent();
        return true;
    }

    @Override
    public boolean h(t0.i iVar, int i10, Bundle bundle) {
        mg mgVar = (mg) this.f27762b;
        ChatActivityEnterView chatActivityEnterView = mgVar.d;
        if (chatActivityEnterView.f21773l5) {
            return true;
        }
        int i11 = n0.a.f14820a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                iVar.f42952a.d();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = iVar.f42952a;
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
    public boolean i() {
        return false;
    }

    @Override
    public void j(vh.h hVar, float f7, float f10) {
        ((eu) this.f27762b).c(hVar, f7, f10);
    }

    @Override
    public boolean k(float f7) {
        return false;
    }

    @Override
    public void m(int i10) {
        mq mqVar = ((nq) this.f27762b).f26478a;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                mqVar.y();
                return;
            }
            return;
        }
        if (i10 != 2) {
            z10 = false;
        }
        mqVar.l(z10);
    }

    @Override
    public void n(int i10) {
        w2 w2Var = (w2) this.f27762b;
        if (i10 == 0) {
            w2Var.run();
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var = ((yr) this.f27762b).f30379a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && n1Var != null && n1Var.isShowing()) {
            n1Var.d(true);
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f27761a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        BitmapFactory.Options options;
        sl slVar = (sl) this.f27762b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = slVar.e;
        wi wiVar = chatAttachAlertPhotoLayout.f26744b;
        if (slVar.f27948a != null && !wiVar.V && chatAttachAlertPhotoLayout.P != null) {
            ChatAttachAlertPhotoLayout.f21869q1 = false;
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
                int i13 = ChatAttachAlertPhotoLayout.f21873u1;
                ChatAttachAlertPhotoLayout.f21873u1 = i13 - 1;
                photoEntry = new MediaController.PhotoEntry(0, i13, 0L, slVar.f27948a.getAbsolutePath(), 0, true, i12, i11, 0L);
                photoEntry.duration = (int) (((float) j3) / 1000.0f);
                photoEntry.thumbPath = str;
                if (wiVar.Q0 != 0) {
                    MediaController.CropState cropState = new MediaController.CropState();
                    photoEntry.cropState = cropState;
                    cropState.mirrored = true;
                    cropState.freeform = false;
                    cropState.lockedAspectRatio = 1.0f;
                }
                chatAttachAlertPhotoLayout.j0(photoEntry, false, false);
            }
            int i122 = i10;
            int i132 = ChatAttachAlertPhotoLayout.f21873u1;
            ChatAttachAlertPhotoLayout.f21873u1 = i132 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i132, 0L, slVar.f27948a.getAbsolutePath(), 0, true, i122, i11, 0L);
            photoEntry.duration = (int) (((float) j3) / 1000.0f);
            photoEntry.thumbPath = str;
            if (wiVar.Q0 != 0 && chatAttachAlertPhotoLayout.P.isFrontface()) {
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
        ((ub) this.f27762b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override
    public void q(tc0 tc0Var, int i10) {
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) this.f27762b;
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
    public void l() {
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
