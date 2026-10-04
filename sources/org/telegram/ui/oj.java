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
public final class oj implements org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.d6, gv0, org.telegram.ui.Components.i60, km {
    public final yn f39209a;

    public oj(yn ynVar) {
        this.f39209a = ynVar;
    }

    @Override
    public void G0(MessageObject messageObject) {
        yn ynVar = this.f39209a;
        ynVar.f43533v0.J0(true);
        ynVar.f43533v0.C0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            ynVar.V0.removeView(ynVar.f43489r8);
            ynVar.f43489r8 = null;
            ynVar.f43528u8 = null;
            ynVar.f43516t8 = null;
        }
        for (int i10 = 0; i10 < ynVar.f43533v0.getChildCount(); i10++) {
            if (ynVar.f43533v0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) ynVar.f43533v0.getChildAt(i10);
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                    u1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override
    public Paint H(String str) {
        return org.telegram.ui.ActionBar.i6.S0(str);
    }

    @Override
    public int H0(int i10) {
        return this.f39209a.getThemedColor(i10);
    }

    @Override
    public void I(MessageObject messageObject) {
        Bitmap bitmap;
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.f39209a.f43533v0.getChildCount(); i10++) {
                if (this.f39209a.f43533v0.getChildAt(i10) instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f39209a.f43533v0.getChildAt(i10);
                    if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.d6 animation = u1Var.getPhotoImage().getAnimation();
                        if (animation.f25575b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                sk skVar = this.f39209a.f43530ua;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                jv0 jv0Var = skVar.d;
                                if (jv0Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = jv0Var.f37781b.getBitmap(width, height);
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
            this.f39209a.N7(true);
            MediaController mediaController = MediaController.getInstance();
            yn ynVar = this.f39209a;
            mediaController.setTextureView(ynVar.f43528u8, ynVar.f43516t8, ynVar.f43489r8, true);
        }
        this.f39209a.f43533v0.invalidate();
    }

    @Override
    public void S0(int i10) {
        this.f39209a.D(i10, 0, 0, 0, true, true);
    }

    @Override
    public boolean a() {
        return org.telegram.ui.ActionBar.i6.I.q();
    }

    @Override
    public void e() {
        org.telegram.ui.Components.sm0.d(new cf(this.f39209a, 2));
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public int j0(int i10) {
        return H0(i10);
    }

    @Override
    public int j1(int i10) {
        return H0(i10);
    }

    @Override
    public TextureView k0() {
        return this.f39209a.f43528u8;
    }

    @Override
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
    }

    @Override
    public boolean r0() {
        return false;
    }

    @Override
    public void u0(String str) {
        this.f39209a.ca(str, false);
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.f21154v3;
    }

    @Override
    public void c() {
    }

    @Override
    public void L0(int i10, int i11) {
    }

    @Override
    public void X(boolean z10, boolean z11) {
    }
}
