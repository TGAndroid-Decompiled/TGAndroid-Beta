package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class ef implements bi.w0 {
    public final int f34283a;
    public final gf f34284b;
    public final FrameLayout f34285c;

    public ef(gf gfVar, FrameLayout frameLayout, int i7) {
        this.f34283a = i7;
        this.f34284b = gfVar;
        this.f34285c = frameLayout;
    }

    @Override
    public final void a(Canvas canvas) {
        org.telegram.ui.aj ajVar;
        org.telegram.ui.aj ajVar2;
        switch (this.f34283a) {
            case 0:
                gf gfVar = this.f34284b;
                gfVar.getClass();
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                this.f34285c.getLocationInWindow(iArr);
                ChatActivityEnterView chatActivityEnterView = gfVar.f34928a;
                st0 st0Var = chatActivityEnterView.U1;
                st0Var.getLocationInWindow(iArr2);
                canvas.save();
                canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
                Drawable backgroundImage = st0Var.getBackgroundImage();
                if (backgroundImage != null) {
                    backgroundImage.draw(canvas);
                }
                org.telegram.ui.an anVar = chatActivityEnterView.f32319x3;
                if (anVar != null) {
                    ajVar = anVar.A0;
                } else {
                    ajVar = null;
                }
                if (ajVar != null && ajVar.getWidth() > 0) {
                    canvas.translate(ajVar.getX(), ajVar.getY());
                    ajVar.draw(canvas);
                }
                canvas.restore();
                return;
            default:
                gf gfVar2 = this.f34284b;
                gfVar2.getClass();
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                this.f34285c.getLocationInWindow(iArr3);
                ChatActivityEnterView chatActivityEnterView2 = gfVar2.f34928a;
                st0 st0Var2 = chatActivityEnterView2.U1;
                st0Var2.getLocationInWindow(iArr4);
                canvas.save();
                canvas.translate(iArr4[0] - iArr3[0], iArr4[1] - iArr3[1]);
                Drawable backgroundImage2 = st0Var2.getBackgroundImage();
                if (backgroundImage2 != null) {
                    backgroundImage2.draw(canvas);
                }
                org.telegram.ui.an anVar2 = chatActivityEnterView2.f32319x3;
                if (anVar2 != null) {
                    ajVar2 = anVar2.A0;
                } else {
                    ajVar2 = null;
                }
                if (ajVar2 != null && ajVar2.getWidth() > 0) {
                    canvas.translate(ajVar2.getX(), ajVar2.getY());
                    ajVar2.draw(canvas);
                }
                canvas.restore();
                return;
        }
    }
}
