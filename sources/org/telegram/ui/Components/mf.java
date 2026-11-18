package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class mf implements bi.w0 {
    public final int f37448a;
    public final pf f37449b;
    public final FrameLayout f37450c;

    public mf(pf pfVar, FrameLayout frameLayout, int i7) {
        this.f37448a = i7;
        this.f37449b = pfVar;
        this.f37450c = frameLayout;
    }

    @Override
    public final void a(Canvas canvas) {
        org.telegram.ui.bj bjVar;
        org.telegram.ui.bj bjVar2;
        switch (this.f37448a) {
            case 0:
                pf pfVar = this.f37449b;
                pfVar.getClass();
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                this.f37450c.getLocationInWindow(iArr);
                ChatActivityEnterView chatActivityEnterView = pfVar.f38384a;
                au0 au0Var = chatActivityEnterView.f32542a2;
                au0Var.getLocationInWindow(iArr2);
                canvas.save();
                canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
                Drawable backgroundImage = au0Var.getBackgroundImage();
                if (backgroundImage != null) {
                    backgroundImage.draw(canvas);
                }
                org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
                if (bnVar != null) {
                    bjVar = bnVar.A0;
                } else {
                    bjVar = null;
                }
                if (bjVar != null && bjVar.getWidth() > 0) {
                    canvas.translate(bjVar.getX(), bjVar.getY());
                    bjVar.draw(canvas);
                }
                canvas.restore();
                return;
            default:
                pf pfVar2 = this.f37449b;
                pfVar2.getClass();
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                this.f37450c.getLocationInWindow(iArr3);
                ChatActivityEnterView chatActivityEnterView2 = pfVar2.f38384a;
                au0 au0Var2 = chatActivityEnterView2.f32542a2;
                au0Var2.getLocationInWindow(iArr4);
                canvas.save();
                canvas.translate(iArr4[0] - iArr3[0], iArr4[1] - iArr3[1]);
                Drawable backgroundImage2 = au0Var2.getBackgroundImage();
                if (backgroundImage2 != null) {
                    backgroundImage2.draw(canvas);
                }
                org.telegram.ui.bn bnVar2 = chatActivityEnterView2.D3;
                if (bnVar2 != null) {
                    bjVar2 = bnVar2.A0;
                } else {
                    bjVar2 = null;
                }
                if (bjVar2 != null && bjVar2.getWidth() > 0) {
                    canvas.translate(bjVar2.getX(), bjVar2.getY());
                    bjVar2.draw(canvas);
                }
                canvas.restore();
                return;
        }
    }
}
