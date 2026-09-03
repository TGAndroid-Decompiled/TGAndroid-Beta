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
public final class mj implements org.telegram.ui.ActionBar.t0, org.telegram.ui.ActionBar.g6, yu0, km {
    public final xn f38989a;

    public mj(xn xnVar) {
        this.f38989a = xnVar;
    }

    @Override
    public int B0(int i10) {
        return this.f38989a.getThemedColor(i10);
    }

    @Override
    public Paint F(String str) {
        return org.telegram.ui.ActionBar.k6.S0(str);
    }

    @Override
    public void G(MessageObject messageObject) {
        Bitmap bitmap;
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.f38989a.f43340u0.getChildCount(); i10++) {
                if (this.f38989a.f43340u0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f38989a.f43340u0.getChildAt(i10);
                    if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.y5 animation = t1Var.getPhotoImage().getAnimation();
                        if (animation.Y) {
                            animation.stop();
                        }
                        Bitmap m9 = animation.m();
                        if (m9 != null) {
                            try {
                                sk skVar = this.f38989a.f43337ta;
                                int width = m9.getWidth();
                                int height = m9.getHeight();
                                bv0 bv0Var = skVar.d;
                                if (bv0Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = bv0Var.f35607b.getBitmap(width, height);
                                }
                                new Canvas(m9).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                    }
                }
            }
            this.f38989a.N7(true);
            MediaController mediaController = MediaController.getInstance();
            xn xnVar = this.f38989a;
            mediaController.setTextureView(xnVar.f43336t8, xnVar.f43326s8, xnVar.f43300q8, true);
        }
        this.f38989a.f43340u0.invalidate();
    }

    @Override
    public void O0(int i10) {
        this.f38989a.j(i10, 0, true, 0, true, 0);
    }

    @Override
    public int Z0(int i10) {
        return B0(i10);
    }

    @Override
    public boolean a() {
        return org.telegram.ui.ActionBar.k6.I.q();
    }

    @Override
    public void e() {
        org.telegram.ui.Components.im0.d(new we(this.f38989a, 2));
    }

    @Override
    public int e0(int i10) {
        return B0(i10);
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public TextureView h0() {
        return this.f38989a.f43336t8;
    }

    @Override
    public void l(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.k6.q(f10, f11, i10, i11);
    }

    @Override
    public boolean o0() {
        return false;
    }

    @Override
    public void t0(String str) {
        this.f38989a.da(str, false);
    }

    @Override
    public ColorFilter w() {
        return org.telegram.ui.ActionBar.k6.f21978v3;
    }

    @Override
    public void y0(MessageObject messageObject) {
        xn xnVar = this.f38989a;
        xnVar.f43340u0.I0(true);
        xnVar.f43340u0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            xnVar.U0.removeView(xnVar.f43300q8);
            xnVar.f43300q8 = null;
            xnVar.f43336t8 = null;
            xnVar.f43326s8 = null;
        }
        for (int i10 = 0; i10 < xnVar.f43340u0.getChildCount(); i10++) {
            if (xnVar.f43340u0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) xnVar.f43340u0.getChildAt(i10);
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                    t1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override
    public void c() {
    }

    @Override
    public void J0(int i10, int i11) {
    }

    @Override
    public void W(boolean z4, boolean z10) {
    }
}
