package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.TextureView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class kj implements org.telegram.ui.ActionBar.t0, yu0, org.telegram.ui.Components.r60, gm {
    public final un f40955a;

    public kj(un unVar) {
        this.f40955a = unVar;
    }

    @Override
    public void B0(MessageObject messageObject) {
        un unVar = this.f40955a;
        unVar.f44471x0.I0(true);
        unVar.f44471x0.C0();
        if (MediaController.getInstance().isPlayingMessage(messageObject)) {
            unVar.f44295j1.removeView(unVar.F8);
            unVar.F8 = null;
            unVar.I8 = null;
            unVar.H8 = null;
        }
        for (int i10 = 0; i10 < unVar.f44471x0.getChildCount(); i10++) {
            if (unVar.f44471x0.getChildAt(i10) instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) unVar.f44471x0.getChildAt(i10);
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
            for (int i10 = 0; i10 < this.f40955a.f44471x0.getChildCount(); i10++) {
                if (this.f40955a.f44471x0.getChildAt(i10) instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f40955a.f44471x0.getChildAt(i10);
                    if (s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.g6 animation = s1Var.getPhotoImage().getAnimation();
                        if (animation.f28437b0) {
                            animation.stop();
                        }
                        Bitmap m10 = animation.m();
                        if (m10 != null) {
                            try {
                                qk qkVar = this.f40955a.Ia;
                                int width = m10.getWidth();
                                int height = m10.getHeight();
                                bv0 bv0Var = qkVar.d;
                                if (bv0Var == null) {
                                    bitmap = null;
                                } else {
                                    bitmap = bv0Var.f38176b.getBitmap(width, height);
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
            this.f40955a.U7(true);
            MediaController mediaController = MediaController.getInstance();
            un unVar = this.f40955a;
            mediaController.setTextureView(unVar.I8, unVar.H8, unVar.F8, true);
        }
        this.f40955a.f44471x0.invalidate();
    }

    @Override
    public void Q0(int i10) {
        this.f40955a.j(i10, 0, true, 0, true, 0);
    }

    @Override
    public void b() {
        org.telegram.ui.Components.hn0.d(new we(this.f40955a, 2));
    }

    @Override
    public TextureView f0() {
        return this.f40955a.I8;
    }

    @Override
    public void p0(String str) {
        this.f40955a.na(str, false);
    }

    @Override
    public void a() {
    }

    @Override
    public void T(boolean z10, boolean z11) {
    }
}
