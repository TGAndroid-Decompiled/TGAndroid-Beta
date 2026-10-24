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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.ug1;
import w7.z5;
public final class l1 extends FrameLayout {
    public final ak0 f31703a;
    public final ak0 f31704b;
    public final org.telegram.ui.Cells.y f31705c;
    public org.telegram.ui.Components.o2 d;
    public k1 e;
    public int f31706f;

    public l1(Context context) {
        super(context);
        this.f31706f = 0;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.f31703a = imageView;
        ?? imageView2 = new ImageView(context);
        this.f31704b = imageView2;
        imageView.f(R.raw.star_stroke, 37, 37, null);
        imageView2.f(R.raw.star_fill, 37, 37, null);
        imageView2.setAlpha(0.0f);
        addView((View) imageView, z5.c(37.0f, 37));
        addView((View) imageView2, z5.c(37.0f, 37));
        org.telegram.ui.Cells.y i02 = k6.i0(AndroidUtilities.dp(37.0f), 0, i0.a.o(-1, 76));
        this.f31705c = i02;
        i02.setCallback(this);
        setClickable(true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        k1 k1Var;
        int action = motionEvent.getAction();
        int i11 = 0;
        if (action != 0) {
            if (action != 1) {
                if (action == 3 && (k1Var = this.e) != null) {
                    l1[] l1VarArr = ((m1) ((j5.b) k1Var).f14300b).f31717c;
                    int length = l1VarArr.length;
                    while (i11 < length) {
                        l1 l1Var = l1VarArr[i11];
                        ak0 ak0Var = l1Var.f31703a;
                        ak0 ak0Var2 = l1Var.f31704b;
                        ak0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        ak0Var2.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        i11++;
                    }
                }
            } else {
                k1 k1Var2 = this.e;
                if (k1Var2 != null) {
                    l1[] l1VarArr2 = ((m1) ((j5.b) k1Var2).f14300b).f31717c;
                    for (int i12 = 0; i12 <= this.f31706f; i12++) {
                        l1 l1Var2 = l1VarArr2[i12];
                        ak0 ak0Var3 = l1Var2.f31703a;
                        ak0 ak0Var4 = l1Var2.f31704b;
                        ak0Var3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        ak0Var4.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    }
                }
                if (this.d != null) {
                    int[] iArr = new int[2];
                    getLocationOnScreen(iArr);
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    org.telegram.ui.Components.o2 o2Var = this.d;
                    float width = (getWidth() / 2.0f) + i13;
                    float height = (getHeight() / 2.0f) + i14;
                    int i15 = this.f31706f + 1;
                    m1 m1Var = (m1) o2Var.f29135b;
                    Context context = (Context) o2Var.f29136c;
                    if (i15 >= 4) {
                        ?? imageView = new ImageView(context);
                        int dp = AndroidUtilities.dp(133.0f);
                        imageView.f(R.raw.rate, 133, 133, null);
                        int[] iArr2 = new int[2];
                        m1Var.getLocationOnScreen(iArr2);
                        int i16 = iArr2[0];
                        int i17 = iArr2[1];
                        m1Var.addView((View) imageView, z5.c(133.0f, 133));
                        float f7 = width - i16;
                        float f10 = dp / 2.0f;
                        imageView.setTranslationX(f7 - f10);
                        imageView.setTranslationY((height - i17) - f10);
                        imageView.setOnAnimationEndListener(new i1(m1Var, imageView, 0));
                        imageView.d();
                    }
                    ug1 ug1Var = m1Var.d;
                    if (ug1Var != null) {
                        ug1Var.f42429b.L = i15;
                    }
                }
            }
        } else {
            k1 k1Var3 = this.e;
            if (k1Var3 != null) {
                l1[] l1VarArr3 = ((m1) ((j5.b) k1Var3).f14300b).f31717c;
                while (true) {
                    i10 = this.f31706f;
                    if (i11 > i10) {
                        break;
                    }
                    l1 l1Var3 = l1VarArr3[i11];
                    ak0 ak0Var5 = l1Var3.f31703a;
                    ak0 ak0Var6 = l1Var3.f31704b;
                    ak0Var5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    ak0Var6.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i11++;
                }
                for (int i18 = i10 + 1; i18 < l1VarArr3.length; i18++) {
                    l1 l1Var4 = l1VarArr3[i18];
                    ak0 ak0Var7 = l1Var4.f31703a;
                    ak0 ak0Var8 = l1Var4.f31704b;
                    ak0Var7.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    ak0Var8.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.y yVar = this.f31705c;
        if (yVar != null) {
            yVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.f31705c;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.y yVar = this.f31705c;
        yVar.setBounds(0, 0, width, height);
        yVar.draw(canvas);
    }

    public void setAllStarsProvider(k1 k1Var) {
        this.e = k1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f31705c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
