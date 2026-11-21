package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class nf implements bi.a1 {
    public final int f37860a;
    public final rf f37861b;
    public final FrameLayout f37862c;

    public nf(rf rfVar, FrameLayout frameLayout, int i7) {
        this.f37860a = i7;
        this.f37861b = rfVar;
        this.f37862c = frameLayout;
    }

    @Override
    public final void a(Canvas canvas) {
        org.telegram.ui.bj bjVar;
        org.telegram.ui.bj bjVar2;
        switch (this.f37860a) {
            case 0:
                rf rfVar = this.f37861b;
                rfVar.getClass();
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                this.f37862c.getLocationInWindow(iArr);
                ChatActivityEnterView chatActivityEnterView = rfVar.f39168a;
                du0 du0Var = chatActivityEnterView.f32588c2;
                du0Var.getLocationInWindow(iArr2);
                canvas.save();
                canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
                Drawable backgroundImage = du0Var.getBackgroundImage();
                if (backgroundImage != null) {
                    backgroundImage.draw(canvas);
                }
                org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
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
                rf rfVar2 = this.f37861b;
                rfVar2.getClass();
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                this.f37862c.getLocationInWindow(iArr3);
                ChatActivityEnterView chatActivityEnterView2 = rfVar2.f39168a;
                du0 du0Var2 = chatActivityEnterView2.f32588c2;
                du0Var2.getLocationInWindow(iArr4);
                canvas.save();
                canvas.translate(iArr4[0] - iArr3[0], iArr4[1] - iArr3[1]);
                Drawable backgroundImage2 = du0Var2.getBackgroundImage();
                if (backgroundImage2 != null) {
                    backgroundImage2.draw(canvas);
                }
                org.telegram.ui.bn bnVar2 = chatActivityEnterView2.F3;
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
