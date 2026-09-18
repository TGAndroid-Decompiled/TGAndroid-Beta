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
public final class pj implements org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.e6, lv0, mm {
    public final zn f36496a;

    public pj(zn znVar) {
        this.f36496a = znVar;
    }

    @Override
    public void E0(MessageObject messageObject) {
        zn znVar = this.f36496a;
        znVar.f40488x0.J0(true);
        znVar.f40488x0.C0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            znVar.X0.removeView(znVar.f40445t8);
            znVar.f40445t8 = null;
            znVar.f40483w8 = null;
            znVar.f40470v8 = null;
        }
        for (int i10 = 0; i10 < znVar.f40488x0.getChildCount(); i10++) {
            if (znVar.f40488x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) znVar.f40488x0.getChildAt(i10);
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                    u1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override
    public int G0(int i10) {
        return this.f36496a.getThemedColor(i10);
    }

    @Override
    public void H(MessageObject messageObject) {
        Bitmap bitmap;
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.f36496a.f40488x0.getChildCount(); i10++) {
                if (this.f36496a.f40488x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f36496a.f40488x0.getChildAt(i10);
                    if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.d6 animation = u1Var.getPhotoImage().getAnimation();
                        if (animation.f23432b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                uk ukVar = this.f36496a.f40485wa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                ov0 ov0Var = ukVar.d;
                                if (ov0Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = ov0Var.f36264b.getBitmap(width, height);
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
            this.f36496a.N7(true);
            MediaController mediaController = MediaController.getInstance();
            zn znVar = this.f36496a;
            mediaController.setTextureView(znVar.f40483w8, znVar.f40470v8, znVar.f40445t8, true);
        }
        this.f36496a.f40488x0.invalidate();
    }

    @Override
    public void S0(int i10) {
        this.f36496a.F(i10, 0, 0, 0, true, true);
    }

    @Override
    public boolean a() {
        return org.telegram.ui.ActionBar.j6.I.q();
    }

    @Override
    public void e() {
        org.telegram.ui.Components.nm0.d(new af(this.f36496a, 2));
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
        return this.f36496a.f40483w8;
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override
    public boolean p0() {
        return false;
    }

    @Override
    public void s0(String str) {
        this.f36496a.da(str, false);
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f19390v3;
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
