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
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.sb1;
public final class c1 extends FrameLayout {
    public final dh0 f39213a;
    public final dh0 f39214b;
    public final org.telegram.ui.Cells.y f39215c;
    public org.telegram.ui.Components.f2 d;
    public b1 f39216e;
    public int f39217f;

    public c1(Context context) {
        super(context);
        this.f39217f = 0;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.f39213a = imageView;
        ?? imageView2 = new ImageView(context);
        this.f39214b = imageView2;
        imageView.f(2131624224, 37, 37, null);
        imageView2.f(2131624214, 37, 37, null);
        imageView2.setAlpha(0.0f);
        addView((View) imageView, ha.c(37.0f, 37));
        addView((View) imageView2, ha.c(37.0f, 37));
        org.telegram.ui.Cells.y j02 = l6.j0(org.telegram.messenger.g0.L(37.0f), 0, i0.a.o(-1, 76));
        this.f39215c = j02;
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
                if (action == 3 && (b1Var = this.f39216e) != null) {
                    c1[] c1VarArr = (c1[]) ((m5) ((m3) b1Var).f28294b).d;
                    int length = c1VarArr.length;
                    while (i10 < length) {
                        c1 c1Var = c1VarArr[i10];
                        dh0 dh0Var = c1Var.f39213a;
                        dh0 dh0Var2 = c1Var.f39214b;
                        dh0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        dh0Var2.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        i10++;
                    }
                }
            } else {
                b1 b1Var2 = this.f39216e;
                if (b1Var2 != null) {
                    c1[] c1VarArr2 = (c1[]) ((m5) ((m3) b1Var2).f28294b).d;
                    for (int i11 = 0; i11 <= this.f39217f; i11++) {
                        c1 c1Var2 = c1VarArr2[i11];
                        dh0 dh0Var3 = c1Var2.f39213a;
                        dh0 dh0Var4 = c1Var2.f39214b;
                        dh0Var3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        dh0Var4.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
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
                    int i14 = this.f39217f + 1;
                    m5 m5Var = (m5) f2Var.f33561b;
                    Context context = (Context) f2Var.f33562c;
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
                    sb1 sb1Var = (sb1) m5Var.f4328e;
                    if (sb1Var != null) {
                        sb1Var.f49860b.L = i14;
                    }
                }
            }
        } else {
            b1 b1Var3 = this.f39216e;
            if (b1Var3 != null) {
                c1[] c1VarArr3 = (c1[]) ((m5) ((m3) b1Var3).f28294b).d;
                while (true) {
                    i7 = this.f39217f;
                    if (i10 > i7) {
                        break;
                    }
                    c1 c1Var3 = c1VarArr3[i10];
                    dh0 dh0Var5 = c1Var3.f39213a;
                    dh0 dh0Var6 = c1Var3.f39214b;
                    dh0Var5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    dh0Var6.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i10++;
                }
                for (int i17 = i7 + 1; i17 < c1VarArr3.length; i17++) {
                    c1 c1Var4 = c1VarArr3[i17];
                    dh0 dh0Var7 = c1Var4.f39213a;
                    dh0 dh0Var8 = c1Var4.f39214b;
                    dh0Var7.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    dh0Var8.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.y yVar = this.f39215c;
        if (yVar != null) {
            yVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.f39215c;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.y yVar = this.f39215c;
        yVar.setBounds(0, 0, width, height);
        yVar.draw(canvas);
    }

    public void setAllStarsProvider(b1 b1Var) {
        this.f39216e = b1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f39215c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
