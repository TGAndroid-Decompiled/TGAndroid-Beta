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
public final class lj implements org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.d6, tu0, org.telegram.ui.Components.p60, gm {
    public final sn f38881a;

    public lj(sn snVar) {
        this.f38881a = snVar;
    }

    @Override
    public void D0(int i10) {
        this.f38881a.j(i10, 0, true, 0, true, 0);
    }

    @Override
    public int I(int i10) {
        return u(i10);
    }

    @Override
    public TextureView U() {
        return this.f38881a.f41449w8;
    }

    @Override
    public boolean a() {
        return org.telegram.ui.ActionBar.h6.I.q();
    }

    @Override
    public void b0(String str) {
        this.f38881a.ia(str, false);
    }

    @Override
    public void d(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
    }

    @Override
    public void f() {
        org.telegram.ui.Components.ym0.d(new ye(this.f38881a, 2));
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public ColorFilter j() {
        return org.telegram.ui.ActionBar.h6.f21323v3;
    }

    @Override
    public void m0(MessageObject messageObject) {
        sn snVar = this.f38881a;
        snVar.f41454x0.I0(true);
        snVar.f41454x0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            snVar.X0.removeView(snVar.f41410t8);
            snVar.f41410t8 = null;
            snVar.f41449w8 = null;
            snVar.f41435v8 = null;
        }
        for (int i10 = 0; i10 < snVar.f41454x0.getChildCount(); i10++) {
            if (snVar.f41454x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) snVar.f41454x0.getChildAt(i10);
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                    u1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override
    public Paint n(String str) {
        return org.telegram.ui.ActionBar.h6.T0(str);
    }

    @Override
    public int r(int i10) {
        return u(i10);
    }

    @Override
    public boolean s() {
        return false;
    }

    @Override
    public int u(int i10) {
        return this.f38881a.getThemedColor(i10);
    }

    @Override
    public void z(MessageObject messageObject) {
        Bitmap bitmap;
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.f38881a.f41454x0.getChildCount(); i10++) {
                if (this.f38881a.f41454x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f38881a.f41454x0.getChildAt(i10);
                    if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.e6 animation = u1Var.getPhotoImage().getAnimation();
                        if (animation.f25828b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                qk qkVar = this.f38881a.f41450wa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                wu0 wu0Var = qkVar.d;
                                if (wu0Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = wu0Var.f42957b.getBitmap(width, height);
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
            this.f38881a.Q7(true);
            MediaController mediaController = MediaController.getInstance();
            sn snVar = this.f38881a;
            mediaController.setTextureView(snVar.f41449w8, snVar.f41435v8, snVar.f41410t8, true);
        }
        this.f38881a.f41454x0.invalidate();
    }

    @Override
    public void e() {
    }

    @Override
    public void B(int i10, int i11) {
    }

    @Override
    public void J(boolean z10, boolean z11) {
    }
}
