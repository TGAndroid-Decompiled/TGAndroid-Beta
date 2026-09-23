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
public final class nj implements org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.d6, ev0, lm {
    public final xn f35543a;

    public nj(xn xnVar) {
        this.f35543a = xnVar;
    }

    @Override
    public void E0(MessageObject messageObject) {
        xn xnVar = this.f35543a;
        xnVar.f39596x0.I0(true);
        xnVar.f39596x0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            xnVar.X0.removeView(xnVar.f39553t8);
            xnVar.f39553t8 = null;
            xnVar.f39591w8 = null;
            xnVar.f39578v8 = null;
        }
        for (int i10 = 0; i10 < xnVar.f39596x0.getChildCount(); i10++) {
            if (xnVar.f39596x0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) xnVar.f39596x0.getChildAt(i10);
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                    t1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.h6.S0(str);
    }

    @Override
    public int G0(int i10) {
        return this.f35543a.getThemedColor(i10);
    }

    @Override
    public void H(MessageObject messageObject) {
        Bitmap bitmap;
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.f35543a.f39596x0.getChildCount(); i10++) {
                if (this.f35543a.f39596x0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f35543a.f39596x0.getChildAt(i10);
                    if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.d6 animation = t1Var.getPhotoImage().getAnimation();
                        if (animation.f23253b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                sk skVar = this.f35543a.f39593wa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                hv0 hv0Var = skVar.d;
                                if (hv0Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = hv0Var.f33934b.getBitmap(width, height);
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
            this.f35543a.N7(true);
            MediaController mediaController = MediaController.getInstance();
            xn xnVar = this.f35543a;
            mediaController.setTextureView(xnVar.f39591w8, xnVar.f39578v8, xnVar.f39553t8, true);
        }
        this.f35543a.f39596x0.invalidate();
    }

    @Override
    public void S0(int i10) {
        this.f35543a.F(i10, 0, 0, 0, true, true);
    }

    @Override
    public boolean a() {
        return org.telegram.ui.ActionBar.h6.I.q();
    }

    @Override
    public void e() {
        org.telegram.ui.Components.bm0.d(new ze(this.f35543a, 2));
    }

    @Override
    public int g0(int i10) {
        return G0(i10);
    }

    @Override
    public int g1(int i10) {
        return G0(i10);
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public TextureView j0() {
        return this.f35543a.f39591w8;
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
    }

    @Override
    public boolean p0() {
        return false;
    }

    @Override
    public void s0(String str) {
        this.f35543a.da(str, false);
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.h6.f19115v3;
    }

    @Override
    public void c() {
    }

    @Override
    public void L0(int i10, int i11) {
    }

    @Override
    public void W(boolean z10, boolean z11) {
    }
}
