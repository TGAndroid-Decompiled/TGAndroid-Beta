package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import ci.t4;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.i41;
import org.telegram.ui.ib1;
public final class v0 extends FrameLayout {
    public final fh0 f39651a;
    public final fh0 f39652b;
    public final org.telegram.ui.Cells.y f39653c;
    public i41 d;
    public u0 f39654e;
    public int f39655f;

    public v0(Context context) {
        super(context);
        this.f39655f = 0;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.f39651a = imageView;
        ?? imageView2 = new ImageView(context);
        this.f39652b = imageView2;
        imageView.f(2131624224, 37, 37, null);
        imageView2.f(2131624214, 37, 37, null);
        imageView2.setAlpha(0.0f);
        addView((View) imageView, mf.c(37.0f, 37));
        addView((View) imageView2, mf.c(37.0f, 37));
        org.telegram.ui.Cells.y j02 = k6.j0(org.telegram.messenger.g0.L(37.0f), 0, i0.a.o(-1, 76));
        this.f39653c = j02;
        j02.setCallback(this);
        setClickable(true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i3;
        u0 u0Var;
        int action = motionEvent.getAction();
        int i10 = 0;
        if (action != 0) {
            if (action != 1) {
                if (action == 3 && (u0Var = this.f39654e) != null) {
                    v0[] v0VarArr = (v0[]) ((t4) ((e3) u0Var).f27474b).d;
                    int length = v0VarArr.length;
                    while (i10 < length) {
                        v0 v0Var = v0VarArr[i10];
                        fh0 fh0Var = v0Var.f39651a;
                        fh0 fh0Var2 = v0Var.f39652b;
                        fh0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        fh0Var2.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        i10++;
                    }
                }
            } else {
                u0 u0Var2 = this.f39654e;
                if (u0Var2 != null) {
                    v0[] v0VarArr2 = (v0[]) ((t4) ((e3) u0Var2).f27474b).d;
                    for (int i11 = 0; i11 <= this.f39655f; i11++) {
                        v0 v0Var2 = v0VarArr2[i11];
                        fh0 fh0Var3 = v0Var2.f39651a;
                        fh0 fh0Var4 = v0Var2.f39652b;
                        fh0Var3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        fh0Var4.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    }
                }
                if (this.d != null) {
                    int[] iArr = new int[2];
                    getLocationOnScreen(iArr);
                    int i12 = iArr[0];
                    int i13 = iArr[1];
                    i41 i41Var = this.d;
                    float width = (getWidth() / 2.0f) + i12;
                    float height = (getHeight() / 2.0f) + i13;
                    int i14 = this.f39655f + 1;
                    t4 t4Var = (t4) i41Var.f34591b;
                    Context context = (Context) i41Var.f34592c;
                    if (i14 >= 4) {
                        ?? imageView = new ImageView(context);
                        int L = org.telegram.messenger.g0.L(133.0f);
                        imageView.f(2131624174, 133, 133, null);
                        int[] iArr2 = new int[2];
                        t4Var.getLocationOnScreen(iArr2);
                        int i15 = iArr2[0];
                        int i16 = iArr2[1];
                        t4Var.addView((View) imageView, mf.c(133.0f, 133));
                        float f10 = L / 2.0f;
                        imageView.setTranslationX((width - i15) - f10);
                        imageView.setTranslationY((height - i16) - f10);
                        imageView.setOnAnimationEndListener(new t0(t4Var, imageView, 0));
                        imageView.d();
                    }
                    ib1 ib1Var = (ib1) t4Var.f6025e;
                    if (ib1Var != null) {
                        ib1Var.f46232b.M = i14;
                    }
                }
            }
        } else {
            u0 u0Var3 = this.f39654e;
            if (u0Var3 != null) {
                v0[] v0VarArr3 = (v0[]) ((t4) ((e3) u0Var3).f27474b).d;
                while (true) {
                    i3 = this.f39655f;
                    if (i10 > i3) {
                        break;
                    }
                    v0 v0Var3 = v0VarArr3[i10];
                    fh0 fh0Var5 = v0Var3.f39651a;
                    fh0 fh0Var6 = v0Var3.f39652b;
                    fh0Var5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    fh0Var6.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i10++;
                }
                for (int i17 = i3 + 1; i17 < v0VarArr3.length; i17++) {
                    v0 v0Var4 = v0VarArr3[i17];
                    fh0 fh0Var7 = v0Var4.f39651a;
                    fh0 fh0Var8 = v0Var4.f39652b;
                    fh0Var7.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    fh0Var8.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.y yVar = this.f39653c;
        if (yVar != null) {
            yVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.f39653c;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.y yVar = this.f39653c;
        yVar.setBounds(0, 0, width, height);
        yVar.draw(canvas);
    }

    public void setAllStarsProvider(u0 u0Var) {
        this.f39654e = u0Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f39653c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
