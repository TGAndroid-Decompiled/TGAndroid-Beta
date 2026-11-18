package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ma;
import di.n4;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.sb1;
public final class f1 extends FrameLayout {
    public final ph0 f40866a;
    public final ph0 f40867b;
    public final org.telegram.ui.Cells.y f40868c;
    public org.telegram.ui.Components.g2 d;
    public e1 f40869e;
    public int f40870f;

    public f1(Context context) {
        super(context);
        this.f40870f = 0;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.f40866a = imageView;
        ?? imageView2 = new ImageView(context);
        this.f40867b = imageView2;
        imageView.f(2131624225, 37, 37, null);
        imageView2.f(2131624215, 37, 37, null);
        imageView2.setAlpha(0.0f);
        addView((View) imageView, ma.c(37.0f, 37));
        addView((View) imageView2, ma.c(37.0f, 37));
        org.telegram.ui.Cells.y j02 = n6.j0(org.telegram.messenger.g0.L(37.0f), 0, i0.a.o(-1, 76));
        this.f40868c = j02;
        j02.setCallback(this);
        setClickable(true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i7;
        e1 e1Var;
        int action = motionEvent.getAction();
        int i10 = 0;
        if (action != 0) {
            if (action != 1) {
                if (action == 3 && (e1Var = this.f40869e) != null) {
                    f1[] f1VarArr = (f1[]) ((n4) ((org.telegram.ui.ActionBar.p) e1Var).f29844b).d;
                    int length = f1VarArr.length;
                    while (i10 < length) {
                        f1 f1Var = f1VarArr[i10];
                        ph0 ph0Var = f1Var.f40866a;
                        ph0 ph0Var2 = f1Var.f40867b;
                        ph0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        ph0Var2.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        i10++;
                    }
                }
            } else {
                e1 e1Var2 = this.f40869e;
                if (e1Var2 != null) {
                    f1[] f1VarArr2 = (f1[]) ((n4) ((org.telegram.ui.ActionBar.p) e1Var2).f29844b).d;
                    for (int i11 = 0; i11 <= this.f40870f; i11++) {
                        f1 f1Var2 = f1VarArr2[i11];
                        ph0 ph0Var3 = f1Var2.f40866a;
                        ph0 ph0Var4 = f1Var2.f40867b;
                        ph0Var3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        ph0Var4.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
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
                    int i14 = this.f40870f + 1;
                    n4 n4Var = (n4) g2Var.f35295b;
                    Context context = (Context) g2Var.f35296c;
                    if (i14 >= 4) {
                        ?? imageView = new ImageView(context);
                        int L = org.telegram.messenger.g0.L(133.0f);
                        imageView.f(2131624175, 133, 133, null);
                        int[] iArr2 = new int[2];
                        n4Var.getLocationOnScreen(iArr2);
                        int i15 = iArr2[0];
                        int i16 = iArr2[1];
                        n4Var.addView((View) imageView, ma.c(133.0f, 133));
                        float f10 = L / 2.0f;
                        imageView.setTranslationX((width - i15) - f10);
                        imageView.setTranslationY((height - i16) - f10);
                        imageView.setOnAnimationEndListener(new d1(n4Var, imageView, 0));
                        imageView.d();
                    }
                    sb1 sb1Var = (sb1) n4Var.f9372e;
                    if (sb1Var != null) {
                        sb1Var.f51962b.M = i14;
                    }
                }
            }
        } else {
            e1 e1Var3 = this.f40869e;
            if (e1Var3 != null) {
                f1[] f1VarArr3 = (f1[]) ((n4) ((org.telegram.ui.ActionBar.p) e1Var3).f29844b).d;
                while (true) {
                    i7 = this.f40870f;
                    if (i10 > i7) {
                        break;
                    }
                    f1 f1Var3 = f1VarArr3[i10];
                    ph0 ph0Var5 = f1Var3.f40866a;
                    ph0 ph0Var6 = f1Var3.f40867b;
                    ph0Var5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    ph0Var6.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i10++;
                }
                for (int i17 = i7 + 1; i17 < f1VarArr3.length; i17++) {
                    f1 f1Var4 = f1VarArr3[i17];
                    ph0 ph0Var7 = f1Var4.f40866a;
                    ph0 ph0Var8 = f1Var4.f40867b;
                    ph0Var7.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    ph0Var8.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.y yVar = this.f40868c;
        if (yVar != null) {
            yVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.f40868c;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.y yVar = this.f40868c;
        yVar.setBounds(0, 0, width, height);
        yVar.draw(canvas);
    }

    public void setAllStarsProvider(e1 e1Var) {
        this.f40869e = e1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f40868c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
