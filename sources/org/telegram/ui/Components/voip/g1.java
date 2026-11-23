package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.na;
import di.n4;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.qb1;
public final class g1 extends FrameLayout {
    public final qh0 f40896a;
    public final qh0 f40897b;
    public final org.telegram.ui.Cells.y f40898c;
    public org.telegram.ui.Components.g2 d;
    public f1 f40899e;
    public int f40900f;

    public g1(Context context) {
        super(context);
        this.f40900f = 0;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.f40896a = imageView;
        ?? imageView2 = new ImageView(context);
        this.f40897b = imageView2;
        imageView.f(2131624225, 37, 37, null);
        imageView2.f(2131624215, 37, 37, null);
        imageView2.setAlpha(0.0f);
        addView((View) imageView, na.c(37.0f, 37));
        addView((View) imageView2, na.c(37.0f, 37));
        org.telegram.ui.Cells.y j02 = n6.j0(org.telegram.messenger.g0.L(37.0f), 0, i0.a.o(-1, 76));
        this.f40898c = j02;
        j02.setCallback(this);
        setClickable(true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i7;
        f1 f1Var;
        int action = motionEvent.getAction();
        int i10 = 0;
        if (action != 0) {
            if (action != 1) {
                if (action == 3 && (f1Var = this.f40899e) != null) {
                    g1[] g1VarArr = (g1[]) ((n4) ((org.telegram.tgnet.g) f1Var).f28679b).d;
                    int length = g1VarArr.length;
                    while (i10 < length) {
                        g1 g1Var = g1VarArr[i10];
                        qh0 qh0Var = g1Var.f40896a;
                        qh0 qh0Var2 = g1Var.f40897b;
                        qh0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        qh0Var2.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        i10++;
                    }
                }
            } else {
                f1 f1Var2 = this.f40899e;
                if (f1Var2 != null) {
                    g1[] g1VarArr2 = (g1[]) ((n4) ((org.telegram.tgnet.g) f1Var2).f28679b).d;
                    for (int i11 = 0; i11 <= this.f40900f; i11++) {
                        g1 g1Var2 = g1VarArr2[i11];
                        qh0 qh0Var3 = g1Var2.f40896a;
                        qh0 qh0Var4 = g1Var2.f40897b;
                        qh0Var3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        qh0Var4.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    }
                }
                if (this.d != null) {
                    int[] iArr = new int[2];
                    getLocationOnScreen(iArr);
                    int i12 = iArr[0];
                    int i13 = iArr[1];
                    org.telegram.ui.Components.g2 g2Var = this.d;
                    float width = (getWidth() / 2.0f) + i12;
                    float height = (getHeight() / 2.0f) + i13;
                    int i14 = this.f40900f + 1;
                    n4 n4Var = (n4) g2Var.f35281b;
                    Context context = (Context) g2Var.f35282c;
                    if (i14 >= 4) {
                        ?? imageView = new ImageView(context);
                        int L = org.telegram.messenger.g0.L(133.0f);
                        imageView.f(2131624175, 133, 133, null);
                        int[] iArr2 = new int[2];
                        n4Var.getLocationOnScreen(iArr2);
                        int i15 = iArr2[0];
                        int i16 = iArr2[1];
                        n4Var.addView((View) imageView, na.c(133.0f, 133));
                        float f10 = L / 2.0f;
                        imageView.setTranslationX((width - i15) - f10);
                        imageView.setTranslationY((height - i16) - f10);
                        imageView.setOnAnimationEndListener(new e1(n4Var, imageView, 0));
                        imageView.d();
                    }
                    qb1 qb1Var = (qb1) n4Var.f9358e;
                    if (qb1Var != null) {
                        qb1Var.f51400b.M = i14;
                    }
                }
            }
        } else {
            f1 f1Var3 = this.f40899e;
            if (f1Var3 != null) {
                g1[] g1VarArr3 = (g1[]) ((n4) ((org.telegram.tgnet.g) f1Var3).f28679b).d;
                while (true) {
                    i7 = this.f40900f;
                    if (i10 > i7) {
                        break;
                    }
                    g1 g1Var3 = g1VarArr3[i10];
                    qh0 qh0Var5 = g1Var3.f40896a;
                    qh0 qh0Var6 = g1Var3.f40897b;
                    qh0Var5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    qh0Var6.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i10++;
                }
                for (int i17 = i7 + 1; i17 < g1VarArr3.length; i17++) {
                    g1 g1Var4 = g1VarArr3[i17];
                    qh0 qh0Var7 = g1Var4.f40896a;
                    qh0 qh0Var8 = g1Var4.f40897b;
                    qh0Var7.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    qh0Var8.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.y yVar = this.f40898c;
        if (yVar != null) {
            yVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.f40898c;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.y yVar = this.f40898c;
        yVar.setBounds(0, 0, width, height);
        yVar.draw(canvas);
    }

    public void setAllStarsProvider(f1 f1Var) {
        this.f40899e = f1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f40898c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
