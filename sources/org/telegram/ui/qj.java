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
public final class qj implements org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.f6, kv0, pm {
    public final co f39913a;

    public qj(co coVar) {
        this.f39913a = coVar;
    }

    @Override
    public void E0(MessageObject messageObject) {
        co coVar = this.f39913a;
        coVar.f35500x0.I0(true);
        coVar.f35500x0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            coVar.X0.removeView(coVar.f35457t8);
            coVar.f35457t8 = null;
            coVar.f35495w8 = null;
            coVar.f35482v8 = null;
        }
        for (int i10 = 0; i10 < coVar.f35500x0.getChildCount(); i10++) {
            if (coVar.f35500x0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) coVar.f35500x0.getChildAt(i10);
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                    t1Var.getPhotoImage().setVisible(false, true);
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
        return this.f39913a.getThemedColor(i10);
    }

    @Override
    public void H(MessageObject messageObject) {
        Bitmap bitmap;
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.f39913a.f35500x0.getChildCount(); i10++) {
                if (this.f39913a.f35500x0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f39913a.f35500x0.getChildAt(i10);
                    if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.d6 animation = t1Var.getPhotoImage().getAnimation();
                        if (animation.f25270b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                vk vkVar = this.f39913a.f35497wa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                nv0 nv0Var = vkVar.d;
                                if (nv0Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = nv0Var.f39068b.getBitmap(width, height);
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
            this.f39913a.N7(true);
            MediaController mediaController = MediaController.getInstance();
            co coVar = this.f39913a;
            mediaController.setTextureView(coVar.f35495w8, coVar.f35482v8, coVar.f35457t8, true);
        }
        this.f39913a.f35500x0.invalidate();
    }

    @Override
    public void V0(int i10) {
        this.f39913a.F(i10, 0, 0, 0, true, true);
    }

    @Override
    public boolean a() {
        return org.telegram.ui.ActionBar.j6.I.q();
    }

    @Override
    public void e() {
        org.telegram.ui.Components.am0.d(new af(this.f39913a, 2));
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public int h0(int i10) {
        return G0(i10);
    }

    @Override
    public int h1(int i10) {
        return G0(i10);
    }

    @Override
    public TextureView i0() {
        return this.f39913a.f35495w8;
    }

    @Override
    public void l(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override
    public boolean o0() {
        return false;
    }

    @Override
    public void r0(String str) {
        this.f39913a.da(str, false);
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f21014v3;
    }

    @Override
    public void d() {
    }

    @Override
    public void O0(int i10, int i11) {
    }

    @Override
    public void W(boolean z10, boolean z11) {
    }
}
