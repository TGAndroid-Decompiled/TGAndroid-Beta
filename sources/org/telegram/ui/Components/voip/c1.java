package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.m5;
import c8.ha;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.pb1;
public final class c1 extends FrameLayout {
    public final ch0 f39089a;
    public final ch0 f39090b;
    public final org.telegram.ui.Cells.y f39091c;
    public org.telegram.ui.Components.f2 d;
    public b1 f39092e;
    public int f39093f;

    public c1(Context context) {
        super(context);
        this.f39093f = 0;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.f39089a = imageView;
        ?? imageView2 = new ImageView(context);
        this.f39090b = imageView2;
        imageView.f(2131624224, 37, 37, null);
        imageView2.f(2131624214, 37, 37, null);
        imageView2.setAlpha(0.0f);
        addView((View) imageView, ha.c(37.0f, 37));
        addView((View) imageView2, ha.c(37.0f, 37));
        org.telegram.ui.Cells.y j02 = k6.j0(org.telegram.messenger.g0.L(37.0f), 0, i0.a.o(-1, 76));
        this.f39091c = j02;
        j02.setCallback(this);
        setClickable(true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i7;
        b1 b1Var;
        int action = motionEvent.getAction();
        int i10 = 0;
        if (action != 0) {
            if (action != 1) {
                if (action == 3 && (b1Var = this.f39092e) != null) {
                    c1[] c1VarArr = (c1[]) ((m5) ((m3) b1Var).f28302b).d;
                    int length = c1VarArr.length;
                    while (i10 < length) {
                        c1 c1Var = c1VarArr[i10];
                        ch0 ch0Var = c1Var.f39089a;
                        ch0 ch0Var2 = c1Var.f39090b;
                        ch0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        ch0Var2.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        i10++;
                    }
                }
            } else {
                b1 b1Var2 = this.f39092e;
                if (b1Var2 != null) {
                    c1[] c1VarArr2 = (c1[]) ((m5) ((m3) b1Var2).f28302b).d;
                    for (int i11 = 0; i11 <= this.f39093f; i11++) {
                        c1 c1Var2 = c1VarArr2[i11];
                        ch0 ch0Var3 = c1Var2.f39089a;
                        ch0 ch0Var4 = c1Var2.f39090b;
                        ch0Var3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        ch0Var4.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    }
                }
                if (this.d != null) {
                    int[] iArr = new int[2];
                    getLocationOnScreen(iArr);
                    int i12 = iArr[0];
                    int i13 = iArr[1];
                    org.telegram.ui.Components.f2 f2Var = this.d;
                    float width = (getWidth() / 2.0f) + i12;
                    float height = (getHeight() / 2.0f) + i13;
                    int i14 = this.f39093f + 1;
                    m5 m5Var = (m5) f2Var.f33438b;
                    Context context = (Context) f2Var.f33439c;
                    if (i14 >= 4) {
                        ?? imageView = new ImageView(context);
                        int L = org.telegram.messenger.g0.L(133.0f);
                        imageView.f(2131624174, 133, 133, null);
                        int[] iArr2 = new int[2];
                        m5Var.getLocationOnScreen(iArr2);
                        int i15 = iArr2[0];
                        int i16 = iArr2[1];
                        m5Var.addView((View) imageView, ha.c(133.0f, 133));
                        float f10 = L / 2.0f;
                        imageView.setTranslationX((width - i15) - f10);
                        imageView.setTranslationY((height - i16) - f10);
                        imageView.setOnAnimationEndListener(new a1(m5Var, imageView, 0));
                        imageView.d();
                    }
                    pb1 pb1Var = (pb1) m5Var.f4328e;
                    if (pb1Var != null) {
                        pb1Var.f48774b.L = i14;
                    }
                }
            }
        } else {
            b1 b1Var3 = this.f39092e;
            if (b1Var3 != null) {
                c1[] c1VarArr3 = (c1[]) ((m5) ((m3) b1Var3).f28302b).d;
                while (true) {
                    i7 = this.f39093f;
                    if (i10 > i7) {
                        break;
                    }
                    c1 c1Var3 = c1VarArr3[i10];
                    ch0 ch0Var5 = c1Var3.f39089a;
                    ch0 ch0Var6 = c1Var3.f39090b;
                    ch0Var5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    ch0Var6.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i10++;
                }
                for (int i17 = i7 + 1; i17 < c1VarArr3.length; i17++) {
                    c1 c1Var4 = c1VarArr3[i17];
                    ch0 ch0Var7 = c1Var4.f39089a;
                    ch0 ch0Var8 = c1Var4.f39090b;
                    ch0Var7.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    ch0Var8.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.y yVar = this.f39091c;
        if (yVar != null) {
            yVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.f39091c;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.y yVar = this.f39091c;
        yVar.setBounds(0, 0, width, height);
        yVar.draw(canvas);
    }

    public void setAllStarsProvider(b1 b1Var) {
        this.f39092e = b1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f39091c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
