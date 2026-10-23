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
public final class jj implements org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.d6, ru0, org.telegram.ui.Components.p60, em {
    public final qn f38275a;

    public jj(qn qnVar) {
        this.f38275a = qnVar;
    }

    @Override
    public void D0(int i10) {
        this.f38275a.j(i10, 0, true, 0, true, 0);
    }

    @Override
    public int G(int i10) {
        return w(i10);
    }

    @Override
    public TextureView U() {
        return this.f38275a.f40900w8;
    }

    @Override
    public boolean a() {
        return org.telegram.ui.ActionBar.h6.I.q();
    }

    @Override
    public void b0(String str) {
        this.f38275a.ia(str, false);
    }

    @Override
    public void d(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
    }

    @Override
    public void f() {
        org.telegram.ui.Components.zm0.d(new we(this.f38275a, 2));
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public ColorFilter j() {
        return org.telegram.ui.ActionBar.h6.f21324v3;
    }

    @Override
    public void m0(MessageObject messageObject) {
        qn qnVar = this.f38275a;
        qnVar.f40905x0.I0(true);
        qnVar.f40905x0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            qnVar.X0.removeView(qnVar.f40861t8);
            qnVar.f40861t8 = null;
            qnVar.f40900w8 = null;
            qnVar.f40886v8 = null;
        }
        for (int i10 = 0; i10 < qnVar.f40905x0.getChildCount(); i10++) {
            if (qnVar.f40905x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) qnVar.f40905x0.getChildAt(i10);
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
        return w(i10);
    }

    @Override
    public boolean s() {
        return false;
    }

    @Override
    public int w(int i10) {
        return this.f38275a.getThemedColor(i10);
    }

    @Override
    public void z(MessageObject messageObject) {
        Bitmap bitmap;
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.f38275a.f40905x0.getChildCount(); i10++) {
                if (this.f38275a.f40905x0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f38275a.f40905x0.getChildAt(i10);
                    if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.e6 animation = u1Var.getPhotoImage().getAnimation();
                        if (animation.f25749b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                ok okVar = this.f38275a.f40901wa;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                uu0 uu0Var = okVar.d;
                                if (uu0Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = uu0Var.f42059b.getBitmap(width, height);
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
            this.f38275a.Q7(true);
            MediaController mediaController = MediaController.getInstance();
            qn qnVar = this.f38275a;
            mediaController.setTextureView(qnVar.f40900w8, qnVar.f40886v8, qnVar.f40861t8, true);
        }
        this.f38275a.f40905x0.invalidate();
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
