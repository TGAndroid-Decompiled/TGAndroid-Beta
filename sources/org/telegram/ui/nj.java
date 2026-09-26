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
public final class nj implements org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.d6, dv0, org.telegram.ui.Components.g60, km {
    public final wn f35903a;

    public nj(wn wnVar) {
        this.f35903a = wnVar;
    }

    @Override
    public void E0(MessageObject messageObject) {
        wn wnVar = this.f35903a;
        wnVar.f39694x0.I0(true);
        wnVar.f39694x0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            wnVar.X0.removeView(wnVar.f39651t8);
            wnVar.f39651t8 = null;
            wnVar.f39689w8 = null;
            wnVar.f39676v8 = null;
        }
        for (int i10 = 0; i10 < wnVar.f39694x0.getChildCount(); i10++) {
            if (wnVar.f39694x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) wnVar.f39694x0.getChildAt(i10);
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                    u1Var.getPhotoImage().setVisible(false, true);
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
        return this.f35903a.getThemedColor(i10);
    }

    @Override
    public void H(MessageObject messageObject) {
        Bitmap bitmap;
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.f35903a.f39694x0.getChildCount(); i10++) {
                if (this.f35903a.f39694x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f35903a.f39694x0.getChildAt(i10);
                    if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.d6 animation = u1Var.getPhotoImage().getAnimation();
                        if (animation.f23516b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                sk skVar = this.f35903a.f39691wa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                gv0 gv0Var = skVar.d;
                                if (gv0Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = gv0Var.f34066b.getBitmap(width, height);
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
            this.f35903a.N7(true);
            MediaController mediaController = MediaController.getInstance();
            wn wnVar = this.f35903a;
            mediaController.setTextureView(wnVar.f39689w8, wnVar.f39676v8, wnVar.f39651t8, true);
        }
        this.f35903a.f39694x0.invalidate();
    }

    @Override
    public void S0(int i10) {
        this.f35903a.F(i10, 0, 0, 0, true, true);
    }

    @Override
    public boolean a() {
        return org.telegram.ui.ActionBar.h6.I.q();
    }

    @Override
    public void e() {
        org.telegram.ui.Components.nm0.d(new ze(this.f35903a, 2));
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
        return this.f35903a.f39689w8;
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
        this.f35903a.da(str, false);
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.h6.f19387v3;
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
