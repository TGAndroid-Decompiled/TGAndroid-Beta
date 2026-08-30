package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.b6;
import lh.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.ih1;
public final class k1 extends FrameLayout {
    public final jj0 f29746a;
    public final jj0 f29747b;
    public final org.telegram.ui.Cells.z f29748c;
    public org.telegram.ui.Components.o1 d;
    public j1 e;
    public int f29749f;

    public k1(Context context) {
        super(context);
        this.f29749f = 0;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.f29746a = imageView;
        ?? imageView2 = new ImageView(context);
        this.f29747b = imageView2;
        imageView.f(R.raw.star_stroke, 37, 37, null);
        imageView2.f(R.raw.star_fill, 37, 37, null);
        imageView2.setAlpha(0.0f);
        addView((View) imageView, b6.c(37.0f, 37));
        addView((View) imageView2, b6.c(37.0f, 37));
        org.telegram.ui.Cells.z h02 = j6.h0(AndroidUtilities.dp(37.0f), 0, i0.a.k(-1, 76));
        this.f29748c = h02;
        h02.setCallback(this);
        setClickable(true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        j1 j1Var;
        int action = motionEvent.getAction();
        int i11 = 0;
        if (action != 0) {
            if (action != 1) {
                if (action == 3 && (j1Var = this.e) != null) {
                    k1[] k1VarArr = ((l1) ((m5) j1Var).f12799b).f29763c;
                    int length = k1VarArr.length;
                    while (i11 < length) {
                        k1 k1Var = k1VarArr[i11];
                        jj0 jj0Var = k1Var.f29746a;
                        jj0 jj0Var2 = k1Var.f29747b;
                        jj0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        jj0Var2.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        i11++;
                    }
                }
            } else {
                j1 j1Var2 = this.e;
                if (j1Var2 != null) {
                    k1[] k1VarArr2 = ((l1) ((m5) j1Var2).f12799b).f29763c;
                    for (int i12 = 0; i12 <= this.f29749f; i12++) {
                        k1 k1Var2 = k1VarArr2[i12];
                        jj0 jj0Var3 = k1Var2.f29746a;
                        jj0 jj0Var4 = k1Var2.f29747b;
                        jj0Var3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        jj0Var4.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    }
                }
                if (this.d != null) {
                    int[] iArr = new int[2];
                    getLocationOnScreen(iArr);
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    org.telegram.ui.Components.o1 o1Var = this.d;
                    float width = (getWidth() / 2.0f) + i13;
                    float height = (getHeight() / 2.0f) + i14;
                    int i15 = this.f29749f + 1;
                    l1 l1Var = (l1) o1Var.f27423b;
                    Context context = (Context) o1Var.f27424c;
                    if (i15 >= 4) {
                        ?? imageView = new ImageView(context);
                        int dp = AndroidUtilities.dp(133.0f);
                        imageView.f(R.raw.rate, 133, 133, null);
                        int[] iArr2 = new int[2];
                        l1Var.getLocationOnScreen(iArr2);
                        int i16 = iArr2[0];
                        int i17 = iArr2[1];
                        l1Var.addView((View) imageView, b6.c(133.0f, 133));
                        float f10 = width - i16;
                        float f11 = dp / 2.0f;
                        imageView.setTranslationX(f10 - f11);
                        imageView.setTranslationY((height - i17) - f11);
                        imageView.setOnAnimationEndListener(new h1(l1Var, imageView, 0));
                        imageView.d();
                    }
                    ih1 ih1Var = l1Var.d;
                    if (ih1Var != null) {
                        ih1Var.f35125b.I = i15;
                    }
                }
            }
        } else {
            j1 j1Var3 = this.e;
            if (j1Var3 != null) {
                k1[] k1VarArr3 = ((l1) ((m5) j1Var3).f12799b).f29763c;
                while (true) {
                    i10 = this.f29749f;
                    if (i11 > i10) {
                        break;
                    }
                    k1 k1Var3 = k1VarArr3[i11];
                    jj0 jj0Var5 = k1Var3.f29746a;
                    jj0 jj0Var6 = k1Var3.f29747b;
                    jj0Var5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    jj0Var6.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i11++;
                }
                for (int i18 = i10 + 1; i18 < k1VarArr3.length; i18++) {
                    k1 k1Var4 = k1VarArr3[i18];
                    jj0 jj0Var7 = k1Var4.f29746a;
                    jj0 jj0Var8 = k1Var4.f29747b;
                    jj0Var7.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    jj0Var8.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.z zVar = this.f29748c;
        if (zVar != null) {
            zVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.f29748c;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.z zVar = this.f29748c;
        zVar.setBounds(0, 0, width, height);
        zVar.draw(canvas);
    }

    public void setAllStarsProvider(j1 j1Var) {
        this.e = j1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f29748c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
