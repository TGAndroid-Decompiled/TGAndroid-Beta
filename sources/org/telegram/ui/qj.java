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
public final class qj implements org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.f6, lv0, org.telegram.ui.Components.f60, mm {
    public final zn f36947a;

    public qj(zn znVar) {
        this.f36947a = znVar;
    }

    @Override
    public void D0(MessageObject messageObject) {
        zn znVar = this.f36947a;
        znVar.f40551x0.J0(true);
        znVar.f40551x0.C0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            znVar.X0.removeView(znVar.f40508t8);
            znVar.f40508t8 = null;
            znVar.f40546w8 = null;
            znVar.f40533v8 = null;
        }
        for (int i10 = 0; i10 < znVar.f40551x0.getChildCount(); i10++) {
            if (znVar.f40551x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) znVar.f40551x0.getChildAt(i10);
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                    u1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override
    public int F0(int i10) {
        return this.f36947a.getThemedColor(i10);
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
            for (int i10 = 0; i10 < this.f36947a.f40551x0.getChildCount(); i10++) {
                if (this.f36947a.f40551x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f36947a.f40551x0.getChildAt(i10);
                    if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.c6 animation = u1Var.getPhotoImage().getAnimation();
                        if (animation.f23189b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                vk vkVar = this.f36947a.f40548wa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                ov0 ov0Var = vkVar.d;
                                if (ov0Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = ov0Var.f36419b.getBitmap(width, height);
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
            this.f36947a.N7(true);
            MediaController mediaController = MediaController.getInstance();
            zn znVar = this.f36947a;
            mediaController.setTextureView(znVar.f40546w8, znVar.f40533v8, znVar.f40508t8, true);
        }
        this.f36947a.f40551x0.invalidate();
    }

    @Override
    public void R0(int i10) {
        this.f36947a.E(i10, 0, 0, 0, true, true);
    }

    @Override
    public boolean a() {
        return org.telegram.ui.ActionBar.j6.I.q();
    }

    @Override
    public void e() {
        org.telegram.ui.Components.om0.d(new af(this.f36947a, 2));
    }

    @Override
    public int f0(int i10) {
        return F0(i10);
    }

    @Override
    public int g1(int i10) {
        return F0(i10);
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public TextureView h0() {
        return this.f36947a.f40546w8;
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override
    public boolean n0() {
        return false;
    }

    @Override
    public void s0(String str) {
        this.f36947a.da(str, false);
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f19437v3;
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
