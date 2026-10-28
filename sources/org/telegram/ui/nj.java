package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.TextureView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class nj implements org.telegram.ui.ActionBar.t0, av0, org.telegram.ui.Components.s60, im {
    public final wn f41813a;

    public nj(wn wnVar) {
        this.f41813a = wnVar;
    }

    @Override
    public void B0(MessageObject messageObject) {
        wn wnVar = this.f41813a;
        wnVar.f45339x0.I0(true);
        wnVar.f45339x0.C0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            wnVar.f45163j1.removeView(wnVar.J8);
            wnVar.J8 = null;
            wnVar.M8 = null;
            wnVar.L8 = null;
        }
        for (int i10 = 0; i10 < wnVar.f45339x0.getChildCount(); i10++) {
            if (wnVar.f45339x0.getChildAt(i10) instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) wnVar.f45339x0.getChildAt(i10);
                if (s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == messageObject.getId()) {
                    s1Var.getPhotoImage().setVisible(false, true);
                }
            }
        }
    }

    @Override
    public void E(MessageObject messageObject) {
        Bitmap bitmap;
        if (messageObject == null) {
            return;
        }
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            for (int i10 = 0; i10 < this.f41813a.f45339x0.getChildCount(); i10++) {
                if (this.f41813a.f45339x0.getChildAt(i10) instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f41813a.f45339x0.getChildAt(i10);
                    if (s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.g6 animation = s1Var.getPhotoImage().getAnimation();
                        if (animation.f28410b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                sk skVar = this.f41813a.Ma;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                dv0 dv0Var = skVar.d;
                                if (dv0Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = dv0Var.f38693b.getBitmap(width, height);
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
            this.f41813a.W7(true);
            MediaController mediaController = MediaController.getInstance();
            wn wnVar = this.f41813a;
            mediaController.setTextureView(wnVar.M8, wnVar.L8, wnVar.J8, true);
        }
        this.f41813a.f45339x0.invalidate();
    }

    @Override
    public void Q0(int i10) {
        this.f41813a.j(i10, 0, true, 0, true, 0);
    }

    @Override
    public void b() {
        org.telegram.ui.Components.in0.d(new xe(this.f41813a, 2));
    }

    @Override
    public TextureView f0() {
        return this.f41813a.M8;
    }

    @Override
    public void p0(String str) {
        this.f41813a.qa(str, false);
    }

    @Override
    public void a() {
    }

    @Override
    public void T(boolean z10, boolean z11) {
    }
}
