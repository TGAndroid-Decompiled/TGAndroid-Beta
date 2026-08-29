package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class hj implements org.telegram.ui.ActionBar.t0, org.telegram.ui.ActionBar.c6, hu0, fm {
    public final tn f38943a;

    public hj(tn tnVar) {
        this.f38943a = tnVar;
    }

    @Override
    public ColorFilter B() {
        return org.telegram.ui.ActionBar.g6.f23380v3;
    }

    @Override
    public int C0(int i10) {
        return this.f38943a.getThemedColor(i10);
    }

    @Override
    public void D(MessageObject messageObject) {
        Bitmap bitmap;
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.f38943a.f42973t0.getChildCount(); i10++) {
                if (this.f38943a.f42973t0.getChildAt(i10) instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f38943a.f42973t0.getChildAt(i10);
                    if (s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.c6 animation = s1Var.getPhotoImage().getAnimation();
                        if (animation.X) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                mk mkVar = this.f38943a.f42970sa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                ku0 ku0Var = mkVar.d;
                                if (ku0Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = ku0Var.f40021b.getBitmap(width, height);
                                }
                                new Canvas(m10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                    }
                }
            }
            this.f38943a.N7(true);
            MediaController mediaController = MediaController.getInstance();
            tn tnVar = this.f38943a;
            mediaController.setTextureView(tnVar.f42968s8, tnVar.f42955r8, tnVar.f42932p8, true);
        }
        this.f38943a.f42973t0.invalidate();
    }

    @Override
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.g6.S0(str);
    }

    @Override
    public void Q0(int i10) {
        this.f38943a.j(i10, 0, true, 0, true, 0);
    }

    @Override
    public boolean a() {
        return org.telegram.ui.ActionBar.g6.I.q();
    }

    @Override
    public TextureView b0() {
        return this.f38943a.f42968s8;
    }

    @Override
    public void e() {
        org.telegram.ui.Components.yl0.d(new pe(this.f38943a, 2));
    }

    @Override
    public int g1(int i10) {
        return C0(i10);
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public int h0(int i10) {
        return C0(i10);
    }

    @Override
    public void l(float f9, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.g6.q(f9, f10, i10, i11);
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public void q0(String str) {
        this.f38943a.da(str, false);
    }

    @Override
    public void x0(MessageObject messageObject) {
        tn tnVar = this.f38943a;
        tnVar.f42973t0.I0(true);
        tnVar.f42973t0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            tnVar.T0.removeView(tnVar.f42932p8);
            tnVar.f42932p8 = null;
            tnVar.f42968s8 = null;
            tnVar.f42955r8 = null;
        }
        for (int i10 = 0; i10 < tnVar.f42973t0.getChildCount(); i10++) {
            if (tnVar.f42973t0.getChildAt(i10) instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) tnVar.f42973t0.getChildAt(i10);
                if (s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == messageObject.getId()) {
                    s1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override
    public void b() {
    }

    @Override
    public void L0(int i10, int i11) {
    }

    @Override
    public void U(boolean z10, boolean z11) {
    }
}
