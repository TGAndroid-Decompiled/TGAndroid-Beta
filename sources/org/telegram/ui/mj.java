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
public final class mj implements org.telegram.ui.ActionBar.t0, org.telegram.ui.ActionBar.f6, ru0, km {
    public final xn f36335a;

    public mj(xn xnVar) {
        this.f36335a = xnVar;
    }

    @Override
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override
    public void H(MessageObject messageObject) {
        Bitmap bitmap;
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.f36335a.f40193u0.getChildCount(); i10++) {
                if (this.f36335a.f40193u0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f36335a.f40193u0.getChildAt(i10);
                    if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.y5 animation = t1Var.getPhotoImage().getAnimation();
                        if (animation.Y) {
                            animation.stop();
                        }
                        Bitmap m9 = animation.m();
                        if (m9 != null) {
                            try {
                                sk skVar = this.f36335a.f40190ta;
                                int width = m9.getWidth();
                                int height = m9.getHeight();
                                uu0 uu0Var = skVar.d;
                                if (uu0Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = uu0Var.f39004b.getBitmap(width, height);
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
            this.f36335a.N7(true);
            MediaController mediaController = MediaController.getInstance();
            xn xnVar = this.f36335a;
            mediaController.setTextureView(xnVar.f40189t8, xnVar.f40179s8, xnVar.f40153q8, true);
        }
        this.f36335a.f40193u0.invalidate();
    }

    @Override
    public void Q0(int i10) {
        this.f36335a.j(i10, 0, true, 0, true, 0);
    }

    @Override
    public boolean a() {
        return org.telegram.ui.ActionBar.j6.I.q();
    }

    @Override
    public int c0(int i10) {
        return x0(i10);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.im0.d(new we(this.f36335a, 2));
    }

    @Override
    public TextureView f0() {
        return this.f36335a.f40189t8;
    }

    @Override
    public int g1(int i10) {
        return x0(i10);
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public void l(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f10, f11, i10, i11);
    }

    @Override
    public boolean m0() {
        return false;
    }

    @Override
    public void r0(String str) {
        this.f36335a.da(str, false);
    }

    @Override
    public void w0(MessageObject messageObject) {
        xn xnVar = this.f36335a;
        xnVar.f40193u0.I0(true);
        xnVar.f40193u0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            xnVar.U0.removeView(xnVar.f40153q8);
            xnVar.f40153q8 = null;
            xnVar.f40189t8 = null;
            xnVar.f40179s8 = null;
        }
        for (int i10 = 0; i10 < xnVar.f40193u0.getChildCount(); i10++) {
            if (xnVar.f40193u0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) xnVar.f40193u0.getChildAt(i10);
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                    t1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f20222v3;
    }

    @Override
    public int x0(int i10) {
        return this.f36335a.getThemedColor(i10);
    }

    @Override
    public void c() {
    }

    @Override
    public void K0(int i10, int i11) {
    }

    @Override
    public void X(boolean z4, boolean z10) {
    }
}
