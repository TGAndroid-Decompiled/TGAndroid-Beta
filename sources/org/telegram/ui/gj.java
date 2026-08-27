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

public final class gj implements org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.c6, ku0, em {

    public final rn f38424a;

    public gj(rn rnVar) {
        this.f38424a = rnVar;
    }

    @Override
    public ColorFilter F() {
        return org.telegram.ui.ActionBar.g6.f23371v3;
    }

    @Override
    public TextureView K() {
        return this.f38424a.f42208s8;
    }

    @Override
    public Paint N(String str) {
        return org.telegram.ui.ActionBar.g6.S0(str);
    }

    @Override
    public int N0(int i10) {
        return this.f38424a.getThemedColor(i10);
    }

    @Override
    public void P0(int i10) {
        this.f38424a.j(i10, 0, true, 0, true, 0);
    }

    @Override
    public boolean a() {
        return org.telegram.ui.ActionBar.g6.I.q();
    }

    @Override
    public void d() {
        org.telegram.ui.Components.ol0.d(new re(this.f38424a, 2));
    }

    @Override
    public void g0(String str) {
        this.f38424a.da(str, false);
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public void m(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.g6.q(f10, f11, i10, i11);
    }

    @Override
    public int o1(int i10) {
        return N0(i10);
    }

    @Override
    public int q0(int i10) {
        return N0(i10);
    }

    @Override
    public boolean u0() {
        return false;
    }

    @Override
    public void w0(MessageObject messageObject) {
        rn rnVar = this.f38424a;
        rnVar.f42213t0.I0(true);
        rnVar.f42213t0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            rnVar.T0.removeView(rnVar.f42171p8);
            rnVar.f42171p8 = null;
            rnVar.f42208s8 = null;
            rnVar.f42194r8 = null;
        }
        for (int i10 = 0; i10 < rnVar.f42213t0.getChildCount(); i10++) {
            if (rnVar.f42213t0.getChildAt(i10) instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) rnVar.f42213t0.getChildAt(i10);
                if (s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == messageObject.getId()) {
                    s1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override
    public void y(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.f38424a.f42213t0.getChildCount(); i10++) {
                if (this.f38424a.f42213t0.getChildAt(i10) instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f38424a.f42213t0.getChildAt(i10);
                    if (s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.x5 animation = s1Var.getPhotoImage().getAnimation();
                        if (animation.X) {
                            animation.stop();
                        }
                        Bitmap bitmapM = animation.m();
                        if (bitmapM != null) {
                            try {
                                lk lkVar = this.f38424a.f42210sa;
                                int width = bitmapM.getWidth();
                                int height = bitmapM.getHeight();
                                nu0 nu0Var = lkVar.d;
                                Bitmap bitmap = nu0Var == null ? null : nu0Var.f40941b.getBitmap(width, height);
                                new Canvas(bitmapM).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th) {
                                FileLog.e(th);
                            }
                        }
                    }
                }
            }
            this.f38424a.N7(true);
            MediaController mediaController = MediaController.getInstance();
            rn rnVar = this.f38424a;
            mediaController.setTextureView(rnVar.f42208s8, rnVar.f42194r8, rnVar.f42171p8, true);
        }
        this.f38424a.f42213t0.invalidate();
    }

    @Override
    public void c() {
    }

    @Override
    public void E(boolean z10, boolean z11) {
    }

    @Override
    public void c1(int i10, int i11) {
    }
}
