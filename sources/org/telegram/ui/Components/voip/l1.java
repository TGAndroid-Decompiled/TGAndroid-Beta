package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.c6;
import mh.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.kh1;
public final class l1 extends FrameLayout {
    public final lj0 f32174a;
    public final lj0 f32175b;
    public final org.telegram.ui.Cells.z f32176c;
    public org.telegram.ui.Components.o1 d;
    public k1 f32177e;
    public int f32178f;

    public l1(Context context) {
        super(context);
        this.f32178f = 0;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.f32174a = imageView;
        ?? imageView2 = new ImageView(context);
        this.f32175b = imageView2;
        imageView.f(R.raw.star_stroke, 37, 37, null);
        imageView2.f(R.raw.star_fill, 37, 37, null);
        imageView2.setAlpha(0.0f);
        addView((View) imageView, c6.c(37.0f, 37));
        addView((View) imageView2, c6.c(37.0f, 37));
        org.telegram.ui.Cells.z h02 = k6.h0(AndroidUtilities.dp(37.0f), 0, i0.a.k(-1, 76));
        this.f32176c = h02;
        h02.setCallback(this);
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
                if (action == 3 && (k1Var = this.f32177e) != null) {
                    l1[] l1VarArr = ((m1) ((m5) k1Var).f14450b).f32191c;
                    int length = l1VarArr.length;
                    while (i11 < length) {
                        l1 l1Var = l1VarArr[i11];
                        lj0 lj0Var = l1Var.f32174a;
                        lj0 lj0Var2 = l1Var.f32175b;
                        lj0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        lj0Var2.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        i11++;
                    }
                }
            } else {
                k1 k1Var2 = this.f32177e;
                if (k1Var2 != null) {
                    l1[] l1VarArr2 = ((m1) ((m5) k1Var2).f14450b).f32191c;
                    for (int i12 = 0; i12 <= this.f32178f; i12++) {
                        l1 l1Var2 = l1VarArr2[i12];
                        lj0 lj0Var3 = l1Var2.f32174a;
                        lj0 lj0Var4 = l1Var2.f32175b;
                        lj0Var3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        lj0Var4.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
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
                    int i15 = this.f32178f + 1;
                    m1 m1Var = (m1) o1Var.f29647b;
                    Context context = (Context) o1Var.f29648c;
                    if (i15 >= 4) {
                        ?? imageView = new ImageView(context);
                        int dp = AndroidUtilities.dp(133.0f);
                        imageView.f(R.raw.rate, 133, 133, null);
                        int[] iArr2 = new int[2];
                        m1Var.getLocationOnScreen(iArr2);
                        int i16 = iArr2[0];
                        int i17 = iArr2[1];
                        m1Var.addView((View) imageView, c6.c(133.0f, 133));
                        float f10 = width - i16;
                        float f11 = dp / 2.0f;
                        imageView.setTranslationX(f10 - f11);
                        imageView.setTranslationY((height - i17) - f11);
                        imageView.setOnAnimationEndListener(new i1(m1Var, imageView, 0));
                        imageView.d();
                    }
                    kh1 kh1Var = m1Var.d;
                    if (kh1Var != null) {
                        kh1Var.f38416b.I = i15;
                    }
                }
            }
        } else {
            k1 k1Var3 = this.f32177e;
            if (k1Var3 != null) {
                l1[] l1VarArr3 = ((m1) ((m5) k1Var3).f14450b).f32191c;
                while (true) {
                    i10 = this.f32178f;
                    if (i11 > i10) {
                        break;
                    }
                    l1 l1Var3 = l1VarArr3[i11];
                    lj0 lj0Var5 = l1Var3.f32174a;
                    lj0 lj0Var6 = l1Var3.f32175b;
                    lj0Var5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    lj0Var6.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i11++;
                }
                for (int i18 = i10 + 1; i18 < l1VarArr3.length; i18++) {
                    l1 l1Var4 = l1VarArr3[i18];
                    lj0 lj0Var7 = l1Var4.f32174a;
                    lj0 lj0Var8 = l1Var4.f32175b;
                    lj0Var7.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    lj0Var8.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.z zVar = this.f32176c;
        if (zVar != null) {
            zVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.f32176c;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.z zVar = this.f32176c;
        zVar.setBounds(0, 0, width, height);
        zVar.draw(canvas);
    }

    public void setAllStarsProvider(k1 k1Var) {
        this.f32177e = k1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f32176c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
