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
public final class s implements org.telegram.ui.ActionBar.z1, bm0, qd0, rd0, sd0, ne.f, ImageReceiver.ImageReceiverDelegate, f5, r0.n, vh.a, t0.f, cm0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.r5, bi.ob, org.telegram.ui.ActionBar.q0, org.telegram.ui.ActionBar.k1, wh.k {
    public final int f28682a;
    public final Object f28683b;

    public s(Object obj, int i10) {
        this.f28682a = i10;
        this.f28683b = obj;
    }

    @Override
    public boolean G0(long j10, int i10, int i11, int i12, bi.pb pbVar) {
        no noVar = (no) ((org.telegram.ui.Cells.m6) this.f28683b).T;
        ImageReceiver imageReceiver = noVar.f31507a;
        pbVar.f3486c = imageReceiver;
        pbVar.f3492l = imageReceiver;
        org.telegram.ui.Cells.m6 m6Var = noVar.G;
        pbVar.f3493m = m6Var;
        boolean z10 = m6Var.f3346w;
        no noVar2 = noVar.K.e;
        pbVar.f3484a = noVar2;
        pbVar.f3491k = noVar2.getAlpha();
        pbVar.h = 0.0f;
        pbVar.f3489i = AndroidUtilities.displaySize.y;
        pbVar.f3488g = (View) noVar.getParent();
        return true;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        int i12;
        r8 r8Var = (r8) this.f28683b;
        int i13 = i10 * 60;
        if (i10 == 0) {
            i12 = 71;
        } else {
            i12 = 70;
        }
        r8Var.X0(i13, i12);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        mb mbVar = ((nb) this.f28683b).f27336a;
        if (mbVar != null) {
            mbVar.setPadding(defaultWindowInsets.f10892a, defaultWindowInsets.f10893b, defaultWindowInsets.f10894c, defaultWindowInsets.d);
        }
        view.requestLayout();
        return r0.l1.f43496b;
    }

    @Override
    public boolean a(int i10, View view) {
        Object O;
        pk pkVar = (pk) this.f28683b;
        s4.g0 adapter = pkVar.f28042r.getAdapter();
        ik ikVar = pkVar.v;
        if (adapter == ikVar) {
            O = ikVar.E(i10);
        } else {
            ok okVar = pkVar.f28046y;
            O = okVar.O(okVar.S(i10), okVar.Q(i10));
        }
        return pkVar.S(view, O);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        g0.Q((g0) this.f28683b, view, i10, f7);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.f28682a;
        Object obj = this.f28683b;
        switch (i10) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new n6((z6) obj, 1));
                duration.start();
                return;
            default:
                z9 z9Var = (z9) obj;
                z9Var.getClass();
                if (z10 && !z11) {
                    z9Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.f28682a;
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public String e(int i10) {
        return ((String[]) this.f28683b)[i10];
    }

    @Override
    public boolean f(t0.j jVar, int i10, Bundle bundle) {
        og ogVar = (og) this.f28683b;
        ChatActivityEnterView chatActivityEnterView = ogVar.d;
        if (chatActivityEnterView.f22622l5) {
            return true;
        }
        int i11 = n0.a.f15612a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                jVar.f45502a.d();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.i iVar = jVar.f45502a;
        if (!iVar.getDescription().hasMimeType("image/gif") && !SendMessagesHelper.shouldSendWebPAsSticker(null, iVar.c())) {
            ogVar.m(iVar.c(), iVar.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            g5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new u2(5, ogVar, jVar), chatActivityEnterView.W3);
            return true;
        } else {
            ogVar.o(jVar, true, 0, 0);
            return true;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f28682a) {
            case 0:
                y.T((y) this.f28683b, a2Var);
                return;
            case 2:
                ((org.telegram.ui.p6) this.f28683b).run();
                return;
            case 3:
                ((bi.g) this.f28683b).run();
                return;
            case 4:
                ((bi.ma) this.f28683b).run();
                return;
            case 5:
                ((u1) this.f28683b).run();
                return;
            case 6:
                ((ms) this.f28683b).run();
                return;
            case 8:
                ((r2) this.f28683b).run();
                return;
            case 17:
                ((ig) this.f28683b).f25637a.U0.s();
                return;
            case 19:
                ((org.telegram.ui.vp) this.f28683b).run();
                MessagesController.getGlobalMainSettings().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 23:
                ((io) this.f28683b).f27360b.dismiss();
                return;
            case 24:
                ((kn) this.f28683b).f26417a.E.s();
                return;
            default:
                ((tu) this.f28683b).f29192a.d.s();
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
    public void k(int i10) {
        yq yqVar = ((zq) this.f28683b).f31664a;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                yqVar.y();
                return;
            }
            return;
        }
        if (i10 != 2) {
            z10 = false;
        }
        yqVar.k(z10);
    }

    @Override
    public void l(int i10) {
        z2 z2Var = (z2) this.f28683b;
        if (i10 == 0) {
            z2Var.run();
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var = ((ks) this.f28683b).f26477a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && m1Var != null && m1Var.isShowing()) {
            m1Var.d(true);
        }
    }

    @Override
    public void o(wh.g gVar, float f7, float f10) {
        ((pu) this.f28683b).c(gVar, f7, f10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.f28682a;
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        int i10;
        int i11;
        MediaController.PhotoEntry photoEntry;
        em emVar = (em) this.f28683b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = emVar.e;
        vi viVar = chatAttachAlertPhotoLayout.f27360b;
        if (emVar.f24426a != null && !viVar.V && chatAttachAlertPhotoLayout.P != null) {
            ChatAttachAlertPhotoLayout.f22718q1 = false;
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
                    int i13 = ChatAttachAlertPhotoLayout.f22722u1;
                    ChatAttachAlertPhotoLayout.f22722u1 = i13 - 1;
                    photoEntry = new MediaController.PhotoEntry(0, i13, 0L, emVar.f24426a.getAbsolutePath(), 0, true, i12, i11, 0L);
                    photoEntry.duration = (int) (((float) j10) / 1000.0f);
                    photoEntry.thumbPath = str;
                    if (viVar.T0 != 0) {
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
            int i132 = ChatAttachAlertPhotoLayout.f22722u1;
            ChatAttachAlertPhotoLayout.f22722u1 = i132 - 1;
            photoEntry = new MediaController.PhotoEntry(0, i132, 0L, emVar.f24426a.getAbsolutePath(), 0, true, i122, i11, 0L);
            photoEntry.duration = (int) (((float) j10) / 1000.0f);
            photoEntry.thumbPath = str;
            if (viVar.T0 != 0 && chatAttachAlertPhotoLayout.P.isFrontface()) {
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
    public void p(long j10, int i10, bi.r4 r4Var) {
        r4Var.run();
    }

    @Override
    public void q(Canvas canvas, int i10) {
        ((wb) this.f28683b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override
    public void r(ud0 ud0Var, int i10) {
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) this.f28683b;
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
    public void t() {
        i6 i6Var = (i6) this.f28683b;
        i6Var.b();
        i6Var.e();
    }

    @Override
    public void b(boolean z10) {
    }

    @Override
    public void c() {
    }

    @Override
    public void h(boolean z10) {
    }

    @Override
    public void m() {
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
