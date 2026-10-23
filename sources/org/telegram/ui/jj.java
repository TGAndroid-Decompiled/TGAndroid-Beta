package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.TextureView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class jj implements org.telegram.ui.ActionBar.r0, uu0, org.telegram.ui.Components.q60, fm {
    public final sn f38591a;

    public jj(sn snVar) {
        this.f38591a = snVar;
    }

    @Override
    public void D0(int i10) {
        this.f38591a.j(i10, 0, true, 0, true, 0);
    }

    @Override
    public TextureView U() {
        return this.f38591a.I8;
    }

    @Override
    public void b0(String str) {
        this.f38591a.ia(str, false);
    }

    @Override
    public void d() {
        org.telegram.ui.Components.cn0.d(new we(this.f38591a, 2));
    }

    @Override
    public void m0(MessageObject messageObject) {
        sn snVar = this.f38591a;
        snVar.f41737x0.I0(true);
        snVar.f41737x0.B0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            snVar.f41561j1.removeView(snVar.F8);
            snVar.F8 = null;
            snVar.I8 = null;
            snVar.H8 = null;
        }
        for (int i10 = 0; i10 < snVar.f41737x0.getChildCount(); i10++) {
            if (snVar.f41737x0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) snVar.f41737x0.getChildAt(i10);
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                    t1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override
    public void z(MessageObject messageObject) {
        Bitmap bitmap;
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.f38591a.f41737x0.getChildCount(); i10++) {
                if (this.f38591a.f41737x0.getChildAt(i10) instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f38591a.f41737x0.getChildAt(i10);
                    if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.e6 animation = t1Var.getPhotoImage().getAnimation();
                        if (animation.f25865b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                pk pkVar = this.f38591a.Ia;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                xu0 xu0Var = pkVar.d;
                                if (xu0Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = xu0Var.f43658b.getBitmap(width, height);
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
            this.f38591a.Q7(true);
            MediaController mediaController = MediaController.getInstance();
            sn snVar = this.f38591a;
            mediaController.setTextureView(snVar.I8, snVar.H8, snVar.F8, true);
        }
        this.f38591a.f41737x0.invalidate();
    }

    @Override
    public void c() {
    }

    @Override
    public void J(boolean z10, boolean z11) {
    }
}
