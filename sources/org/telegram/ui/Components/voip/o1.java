package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.xg1;
public final class o1 extends FrameLayout {
    public final bk0 f34095a;
    public final bk0 f34096b;
    public final org.telegram.ui.Cells.y f34097c;
    public k1 d;
    public n1 e;
    public int f34098f;

    public o1(Context context) {
        super(context);
        this.f34098f = 0;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.f34095a = imageView;
        ?? imageView2 = new ImageView(context);
        this.f34096b = imageView2;
        imageView.f(R.raw.star_stroke, 37, 37, null);
        imageView2.f(R.raw.star_fill, 37, 37, null);
        imageView2.setAlpha(0.0f);
        addView((View) imageView, kb1.g(37.0f, 37));
        addView((View) imageView2, kb1.g(37.0f, 37));
        org.telegram.ui.Cells.y i02 = y6.i0(AndroidUtilities.dp(37.0f), 0, i0.a.o(-1, 76));
        this.f34097c = i02;
        i02.setCallback(this);
        setClickable(true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        n1 n1Var;
        int action = motionEvent.getAction();
        int i11 = 0;
        if (action != 0) {
            if (action != 1) {
                if (action == 3 && (n1Var = this.e) != null) {
                    o1[] o1VarArr = ((p1) ((j1) n1Var).f33980b).f34108c;
                    int length = o1VarArr.length;
                    while (i11 < length) {
                        o1 o1Var = o1VarArr[i11];
                        bk0 bk0Var = o1Var.f34095a;
                        bk0 bk0Var2 = o1Var.f34096b;
                        bk0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        bk0Var2.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        i11++;
                    }
                }
            } else {
                n1 n1Var2 = this.e;
                if (n1Var2 != null) {
                    o1[] o1VarArr2 = ((p1) ((j1) n1Var2).f33980b).f34108c;
                    for (int i12 = 0; i12 <= this.f34098f; i12++) {
                        o1 o1Var2 = o1VarArr2[i12];
                        bk0 bk0Var3 = o1Var2.f34095a;
                        bk0 bk0Var4 = o1Var2.f34096b;
                        bk0Var3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        bk0Var4.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    }
                }
                if (this.d != null) {
                    int[] iArr = new int[2];
                    getLocationOnScreen(iArr);
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    k1 k1Var = this.d;
                    float width = (getWidth() / 2.0f) + i13;
                    float height = (getHeight() / 2.0f) + i14;
                    int i15 = this.f34098f + 1;
                    p1 p1Var = (p1) k1Var.f33990c;
                    Context context = (Context) k1Var.f33989b;
                    if (i15 >= 4) {
                        ?? imageView = new ImageView(context);
                        int dp = AndroidUtilities.dp(133.0f);
                        imageView.f(R.raw.rate, 133, 133, null);
                        int[] iArr2 = new int[2];
                        p1Var.getLocationOnScreen(iArr2);
                        int i16 = iArr2[0];
                        int i17 = iArr2[1];
                        p1Var.addView((View) imageView, kb1.g(133.0f, 133));
                        float f7 = width - i16;
                        float f10 = dp / 2.0f;
                        imageView.setTranslationX(f7 - f10);
                        imageView.setTranslationY((height - i17) - f10);
                        imageView.setOnAnimationEndListener(new l1(p1Var, imageView, 0));
                        imageView.d();
                    }
                    xg1 xg1Var = p1Var.d;
                    if (xg1Var != null) {
                        xg1Var.f45683b.L = i15;
                    }
                }
            }
        } else {
            n1 n1Var3 = this.e;
            if (n1Var3 != null) {
                o1[] o1VarArr3 = ((p1) ((j1) n1Var3).f33980b).f34108c;
                while (true) {
                    i10 = this.f34098f;
                    if (i11 > i10) {
                        break;
                    }
                    o1 o1Var3 = o1VarArr3[i11];
                    bk0 bk0Var5 = o1Var3.f34095a;
                    bk0 bk0Var6 = o1Var3.f34096b;
                    bk0Var5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    bk0Var6.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i11++;
                }
                for (int i18 = i10 + 1; i18 < o1VarArr3.length; i18++) {
                    o1 o1Var4 = o1VarArr3[i18];
                    bk0 bk0Var7 = o1Var4.f34095a;
                    bk0 bk0Var8 = o1Var4.f34096b;
                    bk0Var7.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    bk0Var8.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.y yVar = this.f34097c;
        if (yVar != null) {
            yVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.f34097c;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.y yVar = this.f34097c;
        yVar.setBounds(0, 0, width, height);
        yVar.draw(canvas);
    }

    public void setAllStarsProvider(n1 n1Var) {
        this.e = n1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f34097c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
