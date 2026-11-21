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
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.sb1;
public final class f1 extends FrameLayout {
    public final rh0 f41001a;
    public final rh0 f41002b;
    public final org.telegram.ui.Cells.y f41003c;
    public org.telegram.ui.Components.h2 d;
    public e1 f41004e;
    public int f41005f;

    public f1(Context context) {
        super(context);
        this.f41005f = 0;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.f41001a = imageView;
        ?? imageView2 = new ImageView(context);
        this.f41002b = imageView2;
        imageView.f(2131624225, 37, 37, null);
        imageView2.f(2131624215, 37, 37, null);
        imageView2.setAlpha(0.0f);
        addView((View) imageView, ma.c(37.0f, 37));
        addView((View) imageView2, ma.c(37.0f, 37));
        org.telegram.ui.Cells.y j02 = m6.j0(org.telegram.messenger.g0.L(37.0f), 0, i0.a.o(-1, 76));
        this.f41003c = j02;
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
                if (action == 3 && (e1Var = this.f41004e) != null) {
                    f1[] f1VarArr = (f1[]) ((n4) ((org.telegram.tgnet.u) e1Var).f28699b).d;
                    int length = f1VarArr.length;
                    while (i10 < length) {
                        f1 f1Var = f1VarArr[i10];
                        rh0 rh0Var = f1Var.f41001a;
                        rh0 rh0Var2 = f1Var.f41002b;
                        rh0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        rh0Var2.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        i10++;
                    }
                }
            } else {
                e1 e1Var2 = this.f41004e;
                if (e1Var2 != null) {
                    f1[] f1VarArr2 = (f1[]) ((n4) ((org.telegram.tgnet.u) e1Var2).f28699b).d;
                    for (int i11 = 0; i11 <= this.f41005f; i11++) {
                        f1 f1Var2 = f1VarArr2[i11];
                        rh0 rh0Var3 = f1Var2.f41001a;
                        rh0 rh0Var4 = f1Var2.f41002b;
                        rh0Var3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        rh0Var4.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    }
                }
                if (this.d != null) {
                    int[] iArr = new int[2];
                    getLocationOnScreen(iArr);
                    int i12 = iArr[0];
                    int i13 = iArr[1];
                    org.telegram.ui.Components.h2 h2Var = this.d;
                    float width = (getWidth() / 2.0f) + i12;
                    float height = (getHeight() / 2.0f) + i13;
                    int i14 = this.f41005f + 1;
                    n4 n4Var = (n4) h2Var.f35754b;
                    Context context = (Context) h2Var.f35755c;
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
                    sb1 sb1Var = (sb1) n4Var.f9394e;
                    if (sb1Var != null) {
                        sb1Var.f52002b.M = i14;
                    }
                }
            }
        } else {
            e1 e1Var3 = this.f41004e;
            if (e1Var3 != null) {
                f1[] f1VarArr3 = (f1[]) ((n4) ((org.telegram.tgnet.u) e1Var3).f28699b).d;
                while (true) {
                    i7 = this.f41005f;
                    if (i10 > i7) {
                        break;
                    }
                    f1 f1Var3 = f1VarArr3[i10];
                    rh0 rh0Var5 = f1Var3.f41001a;
                    rh0 rh0Var6 = f1Var3.f41002b;
                    rh0Var5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    rh0Var6.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i10++;
                }
                for (int i17 = i7 + 1; i17 < f1VarArr3.length; i17++) {
                    f1 f1Var4 = f1VarArr3[i17];
                    rh0 rh0Var7 = f1Var4.f41001a;
                    rh0 rh0Var8 = f1Var4.f41002b;
                    rh0Var7.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    rh0Var8.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.y yVar = this.f41003c;
        if (yVar != null) {
            yVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.f41003c;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.y yVar = this.f41003c;
        yVar.setBounds(0, 0, width, height);
        yVar.draw(canvas);
    }

    public void setAllStarsProvider(e1 e1Var) {
        this.f41004e = e1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f41003c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
