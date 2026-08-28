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
public final class ej implements org.telegram.ui.ActionBar.t0, org.telegram.ui.ActionBar.b6, ju0, cm {
    public final qn f37967a;

    public ej(qn qnVar) {
        this.f37967a = qnVar;
    }

    @Override
    public TextureView G() {
        return this.f37967a.f42072s8;
    }

    @Override
    public ColorFilter H() {
        return org.telegram.ui.ActionBar.f6.f23317v3;
    }

    @Override
    public void L(String str) {
        this.f37967a.da(str, false);
    }

    @Override
    public int N0(int i9) {
        return this.f37967a.getThemedColor(i9);
    }

    @Override
    public Paint O(String str) {
        return org.telegram.ui.ActionBar.f6.S0(str);
    }

    @Override
    public void P0(int i9) {
        this.f37967a.j(i9, 0, true, 0, true, 0);
    }

    @Override
    public boolean a() {
        return org.telegram.ui.ActionBar.f6.I.q();
    }

    @Override
    public void d() {
        org.telegram.ui.Components.ll0.d(new re(this.f37967a, 2));
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public void o(float f10, float f11, int i9, int i10) {
        org.telegram.ui.ActionBar.f6.q(f10, f11, i9, i10);
    }

    @Override
    public int p0(int i9) {
        return N0(i9);
    }

    @Override
    public int q1(int i9) {
        return N0(i9);
    }

    @Override
    public boolean t0() {
        return false;
    }

    @Override
    public void x0(MessageObject messageObject) {
        qn qnVar = this.f37967a;
        qnVar.f42077t0.I0(true);
        qnVar.f42077t0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            qnVar.T0.removeView(qnVar.f42032p8);
            qnVar.f42032p8 = null;
            qnVar.f42072s8 = null;
            qnVar.f42058r8 = null;
        }
        for (int i9 = 0; i9 < qnVar.f42077t0.getChildCount(); i9++) {
            if (qnVar.f42077t0.getChildAt(i9) instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) qnVar.f42077t0.getChildAt(i9);
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                    t1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override
    public void y(MessageObject messageObject) {
        Bitmap bitmap;
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i9 = 0; i9 < this.f37967a.f42077t0.getChildCount(); i9++) {
                if (this.f37967a.f42077t0.getChildAt(i9) instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f37967a.f42077t0.getChildAt(i9);
                    if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.x5 animation = t1Var.getPhotoImage().getAnimation();
                        if (animation.X) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                jk jkVar = this.f37967a.f42074sa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                mu0 mu0Var = jkVar.d;
                                if (mu0Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = mu0Var.f40533b.getBitmap(width, height);
                                }
                                new Canvas(m10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th) {
                                FileLog.e(th);
                            }
                        }
                    }
                }
            }
            this.f37967a.N7(true);
            MediaController mediaController = MediaController.getInstance();
            qn qnVar = this.f37967a;
            mediaController.setTextureView(qnVar.f42072s8, qnVar.f42058r8, qnVar.f42032p8, true);
        }
        this.f37967a.f42077t0.invalidate();
    }

    @Override
    public void c() {
    }

    @Override
    public void D(boolean z10, boolean z11) {
    }

    @Override
    public void c1(int i9, int i10) {
    }
}
