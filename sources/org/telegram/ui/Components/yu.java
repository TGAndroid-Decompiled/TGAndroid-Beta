package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
public final class yu extends at {
    public int I;
    public ArrayList J;
    public final ArrayList K = new ArrayList();
    public final zu L;

    public yu(zu zuVar) {
        this.L = zuVar;
    }

    @Override
    public final void a(Canvas canvas, long j10, int i10, int i11, float f9) {
        boolean z10;
        ArrayList arrayList = this.J;
        if (arrayList == null) {
            return;
        }
        boolean z11 = true;
        if (arrayList.size() > 3 && SharedConfig.getDevicePerformanceClass() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            for (int i12 = 0; i12 < this.J.size(); i12++) {
                av avVar = (av) this.J.get(i12);
                if (avVar.f26896e != 0.0f || avVar.d != null || avVar.getTranslationX() != 0.0f || avVar.getTranslationY() != 0.0f || avVar.getAlpha() != 1.0f) {
                    break;
                }
            }
        }
        z11 = z10;
        if (z11) {
            i(System.currentTimeMillis());
            d(canvas, 1.0f);
            k();
            return;
        }
        super.a(canvas, j10, i10, i11, 1.0f);
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.K;
            if (i10 < arrayList.size()) {
                av avVar = (av) arrayList.get(i10);
                avVar.f26894b.draw(canvas, avVar.f26893a[this.G]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f9) {
        p5 p5Var;
        if (this.J != null) {
            for (int i10 = 0; i10 < this.J.size(); i10++) {
                av avVar = (av) this.J.get(i10);
                y5 y5Var = avVar.f26895c;
                if (y5Var != null && (p5Var = (p5) this.L.f35432y.f29823b.get(y5Var.getDocumentId())) != null && p5Var.f31593k != null && avVar.f26894b != null) {
                    p5Var.setAlpha((int) (avVar.getAlpha() * 255.0f * f9));
                    float width = ((avVar.getWidth() - avVar.getPaddingLeft()) - avVar.getPaddingRight()) / 2.0f;
                    float height = ((avVar.getHeight() - avVar.getPaddingTop()) - avVar.getPaddingBottom()) / 2.0f;
                    float right = (avVar.getRight() + avVar.getLeft()) / 2.0f;
                    float paddingTop = avVar.getPaddingTop() + height;
                    float f10 = avVar.f26896e;
                    float f11 = 1.0f;
                    if (f10 != 0.0f) {
                        f11 = 1.0f * (((1.0f - f10) * 0.2f) + 0.8f);
                    }
                    p5Var.setBounds((int) (right - ((avVar.getScaleX() * width) * f11)), (int) (paddingTop - ((avVar.getScaleY() * height) * f11)), (int) ((avVar.getScaleX() * width * f11) + right), (int) ((avVar.getScaleY() * height * f11) + paddingTop));
                    p5Var.draw(canvas);
                }
            }
        }
    }

    @Override
    public final void g() {
        ViewGroup viewGroup;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.K;
            if (i10 >= arrayList.size()) {
                viewGroup = ((org.telegram.ui.ActionBar.f3) this.L.f35432y).containerView;
                viewGroup.invalidate();
                return;
            }
            ((av) arrayList.get(i10)).f26893a[this.G].release();
            i10++;
        }
    }

    @Override
    public final void i(long j10) {
        p5 p5Var;
        jv jvVar = this.L.f35432y;
        ArrayList arrayList = this.K;
        arrayList.clear();
        for (int i10 = 0; i10 < this.J.size(); i10++) {
            av avVar = (av) this.J.get(i10);
            y5 y5Var = avVar.f26895c;
            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = avVar.f26893a;
            if (y5Var != null && (p5Var = (p5) jvVar.f29823b.get(y5Var.getDocumentId())) != null && p5Var.f31593k != null) {
                p5Var.t(j10);
                lh.x2 x2Var = p5Var.f31593k;
                int i11 = this.G;
                ImageReceiver.BackgroundThreadDrawHolder drawInBackgroundThread = x2Var.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i11], i11);
                backgroundThreadDrawHolderArr[i11] = drawInBackgroundThread;
                drawInBackgroundThread.time = j10;
                p5Var.setAlpha(255);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(avVar.getPaddingLeft() + avVar.getLeft(), avVar.getPaddingTop(), avVar.getRight() - avVar.getPaddingRight(), avVar.getMeasuredHeight() - avVar.getPaddingBottom());
                backgroundThreadDrawHolderArr[i11].setBounds(rect);
                int themedColor = jvVar.getThemedColor(org.telegram.ui.ActionBar.g6.G6);
                if (themedColor != jvVar.Q || jvVar.P == null) {
                    jvVar.Q = themedColor;
                    jvVar.P = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                }
                p5Var.setColorFilter(jvVar.P);
                avVar.f26894b = p5Var.f31593k;
                arrayList.add(avVar);
            }
        }
    }
}
