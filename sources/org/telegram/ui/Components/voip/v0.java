package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.kd1;
import w7.b6;
public final class v0 extends FrameLayout {
    public final ei0 f31686a;
    public final ei0 f31687b;
    public final org.telegram.ui.Cells.y f31688c;
    public org.telegram.ui.Components.f2 d;
    public u0 e;
    public int f31689f;

    public v0(Context context) {
        super(context);
        this.f31689f = 0;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.f31686a = imageView;
        ?? imageView2 = new ImageView(context);
        this.f31687b = imageView2;
        imageView.f(2131624222, 37, 37, null);
        imageView2.f(2131624212, 37, 37, null);
        imageView2.setAlpha(0.0f);
        addView((View) imageView, b6.c(37.0f, 37));
        addView((View) imageView2, b6.c(37.0f, 37));
        org.telegram.ui.Cells.y j02 = t6.j0(org.telegram.messenger.i0.L(37.0f), 0, i0.b.o(-1, 76));
        this.f31688c = j02;
        j02.setCallback(this);
        setClickable(true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        u0 u0Var;
        int action = motionEvent.getAction();
        int i11 = 0;
        if (action != 0) {
            if (action != 1) {
                if (action == 3 && (u0Var = this.e) != null) {
                    v0[] v0VarArr = (v0[]) ((jg.b1) ((mg.l) u0Var).f13182b).d;
                    int length = v0VarArr.length;
                    while (i11 < length) {
                        v0 v0Var = v0VarArr[i11];
                        ei0 ei0Var = v0Var.f31686a;
                        ei0 ei0Var2 = v0Var.f31687b;
                        ei0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        ei0Var2.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        i11++;
                    }
                }
            } else {
                u0 u0Var2 = this.e;
                if (u0Var2 != null) {
                    v0[] v0VarArr2 = (v0[]) ((jg.b1) ((mg.l) u0Var2).f13182b).d;
                    for (int i12 = 0; i12 <= this.f31689f; i12++) {
                        v0 v0Var2 = v0VarArr2[i12];
                        ei0 ei0Var3 = v0Var2.f31686a;
                        ei0 ei0Var4 = v0Var2.f31687b;
                        ei0Var3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        ei0Var4.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    }
                }
                if (this.d != null) {
                    int[] iArr = new int[2];
                    getLocationOnScreen(iArr);
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    org.telegram.ui.Components.f2 f2Var = this.d;
                    float width = (getWidth() / 2.0f) + i13;
                    float height = (getHeight() / 2.0f) + i14;
                    int i15 = this.f31689f + 1;
                    jg.b1 b1Var = (jg.b1) f2Var.f25949b;
                    Context context = (Context) f2Var.f25950c;
                    if (i15 >= 4) {
                        ?? imageView = new ImageView(context);
                        int L = org.telegram.messenger.i0.L(133.0f);
                        imageView.f(2131624172, 133, 133, null);
                        int[] iArr2 = new int[2];
                        b1Var.getLocationOnScreen(iArr2);
                        int i16 = iArr2[0];
                        int i17 = iArr2[1];
                        b1Var.addView((View) imageView, b6.c(133.0f, 133));
                        float f7 = L / 2.0f;
                        imageView.setTranslationX((width - i16) - f7);
                        imageView.setTranslationY((height - i17) - f7);
                        imageView.setOnAnimationEndListener(new t0(b1Var, imageView, 0));
                        imageView.d();
                    }
                    kd1 kd1Var = (kd1) b1Var.e;
                    if (kd1Var != null) {
                        kd1Var.f38780b.L = i15;
                    }
                }
            }
        } else {
            u0 u0Var3 = this.e;
            if (u0Var3 != null) {
                v0[] v0VarArr3 = (v0[]) ((jg.b1) ((mg.l) u0Var3).f13182b).d;
                while (true) {
                    i10 = this.f31689f;
                    if (i11 > i10) {
                        break;
                    }
                    v0 v0Var3 = v0VarArr3[i11];
                    ei0 ei0Var5 = v0Var3.f31686a;
                    ei0 ei0Var6 = v0Var3.f31687b;
                    ei0Var5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    ei0Var6.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i11++;
                }
                for (int i18 = i10 + 1; i18 < v0VarArr3.length; i18++) {
                    v0 v0Var4 = v0VarArr3[i18];
                    ei0 ei0Var7 = v0Var4.f31686a;
                    ei0 ei0Var8 = v0Var4.f31687b;
                    ei0Var7.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    ei0Var8.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.y yVar = this.f31688c;
        if (yVar != null) {
            yVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.f31688c;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.y yVar = this.f31688c;
        yVar.setBounds(0, 0, width, height);
        yVar.draw(canvas);
    }

    public void setAllStarsProvider(u0 u0Var) {
        this.e = u0Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f31688c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
