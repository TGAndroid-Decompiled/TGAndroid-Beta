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
public final class oj implements org.telegram.ui.ActionBar.t0, org.telegram.ui.ActionBar.f6, yu0, mm {
    public final zn f36827a;

    public oj(zn znVar) {
        this.f36827a = znVar;
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
            for (int i10 = 0; i10 < this.f36827a.f40759u0.getChildCount(); i10++) {
                if (this.f36827a.f40759u0.getChildAt(i10) instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f36827a.f40759u0.getChildAt(i10);
                    if (s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.y5 animation = s1Var.getPhotoImage().getAnimation();
                        if (animation.Y) {
                            animation.stop();
                        }
                        Bitmap m9 = animation.m();
                        if (m9 != null) {
                            try {
                                uk ukVar = this.f36827a.f40756ta;
                                int width = m9.getWidth();
                                int height = m9.getHeight();
                                bv0 bv0Var = ukVar.d;
                                if (bv0Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = bv0Var.f32949b.getBitmap(width, height);
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
            this.f36827a.N7(true);
            MediaController mediaController = MediaController.getInstance();
            zn znVar = this.f36827a;
            mediaController.setTextureView(znVar.f40755t8, znVar.f40745s8, znVar.f40719q8, true);
        }
        this.f36827a.f40759u0.invalidate();
    }

    @Override
    public void O0(int i10) {
        this.f36827a.j(i10, 0, true, 0, true, 0);
    }

    @Override
    public boolean a() {
        return org.telegram.ui.ActionBar.j6.I.q();
    }

    @Override
    public int d0(int i10) {
        return x0(i10);
    }

    @Override
    public void e() {
        org.telegram.ui.Components.hm0.d(new ye(this.f36827a, 2));
    }

    @Override
    public TextureView e0() {
        return this.f36827a.f40755t8;
    }

    @Override
    public int f1(int i10) {
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
    public void o0(String str) {
        this.f36827a.da(str, false);
    }

    @Override
    public void w0(MessageObject messageObject) {
        zn znVar = this.f36827a;
        znVar.f40759u0.I0(true);
        znVar.f40759u0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            znVar.U0.removeView(znVar.f40719q8);
            znVar.f40719q8 = null;
            znVar.f40755t8 = null;
            znVar.f40745s8 = null;
        }
        for (int i10 = 0; i10 < znVar.f40759u0.getChildCount(); i10++) {
            if (znVar.f40759u0.getChildAt(i10) instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) znVar.f40759u0.getChildAt(i10);
                if (s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == messageObject.getId()) {
                    s1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f20197v3;
    }

    @Override
    public int x0(int i10) {
        return this.f36827a.getThemedColor(i10);
    }

    @Override
    public void c() {
    }

    @Override
    public void J0(int i10, int i11) {
    }

    @Override
    public void X(boolean z4, boolean z10) {
    }
}
