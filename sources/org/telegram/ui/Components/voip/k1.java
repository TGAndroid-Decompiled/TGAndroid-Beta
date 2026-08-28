package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.ug1;
public final class k1 extends FrameLayout {
    public final pi0 f33632a;
    public final pi0 f33633b;
    public final org.telegram.ui.Cells.z f33634c;
    public org.telegram.ui.Components.g1 d;
    public j1 f33635e;
    public int f33636f;

    public k1(Context context) {
        super(context);
        this.f33636f = 0;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.f33632a = imageView;
        ?? imageView2 = new ImageView(context);
        this.f33633b = imageView2;
        imageView.f(R.raw.star_stroke, 37, 37, null);
        imageView2.f(R.raw.star_fill, 37, 37, null);
        imageView2.setAlpha(0.0f);
        addView((View) imageView, e6.c(37.0f, 37));
        addView((View) imageView2, e6.c(37.0f, 37));
        org.telegram.ui.Cells.z h02 = f6.h0(AndroidUtilities.dp(37.0f), 0, i0.a.k(-1, 76));
        this.f33634c = h02;
        h02.setCallback(this);
        setClickable(true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i9;
        j1 j1Var;
        int action = motionEvent.getAction();
        int i10 = 0;
        if (action != 0) {
            if (action != 1) {
                if (action == 3 && (j1Var = this.f33635e) != null) {
                    k1[] k1VarArr = ((l1) ((kh.p) j1Var).f15813b).f33651c;
                    int length = k1VarArr.length;
                    while (i10 < length) {
                        k1 k1Var = k1VarArr[i10];
                        pi0 pi0Var = k1Var.f33632a;
                        pi0 pi0Var2 = k1Var.f33633b;
                        pi0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        pi0Var2.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        i10++;
                    }
                }
            } else {
                j1 j1Var2 = this.f33635e;
                if (j1Var2 != null) {
                    k1[] k1VarArr2 = ((l1) ((kh.p) j1Var2).f15813b).f33651c;
                    for (int i11 = 0; i11 <= this.f33636f; i11++) {
                        k1 k1Var2 = k1VarArr2[i11];
                        pi0 pi0Var3 = k1Var2.f33632a;
                        pi0 pi0Var4 = k1Var2.f33633b;
                        pi0Var3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        pi0Var4.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    }
                }
                if (this.d != null) {
                    int[] iArr = new int[2];
                    getLocationOnScreen(iArr);
                    int i12 = iArr[0];
                    int i13 = iArr[1];
                    org.telegram.ui.Components.g1 g1Var = this.d;
                    float width = (getWidth() / 2.0f) + i12;
                    float height = (getHeight() / 2.0f) + i13;
                    int i14 = this.f33636f + 1;
                    l1 l1Var = (l1) g1Var.f28625b;
                    Context context = (Context) g1Var.f28626c;
                    if (i14 >= 4) {
                        ?? imageView = new ImageView(context);
                        int dp = AndroidUtilities.dp(133.0f);
                        imageView.f(R.raw.rate, 133, 133, null);
                        int[] iArr2 = new int[2];
                        l1Var.getLocationOnScreen(iArr2);
                        int i15 = iArr2[0];
                        int i16 = iArr2[1];
                        l1Var.addView((View) imageView, e6.c(133.0f, 133));
                        float f10 = width - i15;
                        float f11 = dp / 2.0f;
                        imageView.setTranslationX(f10 - f11);
                        imageView.setTranslationY((height - i16) - f11);
                        imageView.setOnAnimationEndListener(new h1(l1Var, imageView, 0));
                        imageView.d();
                    }
                    ug1 ug1Var = l1Var.d;
                    if (ug1Var != null) {
                        ug1Var.f43258b.H = i14;
                    }
                }
            }
        } else {
            j1 j1Var3 = this.f33635e;
            if (j1Var3 != null) {
                k1[] k1VarArr3 = ((l1) ((kh.p) j1Var3).f15813b).f33651c;
                while (true) {
                    i9 = this.f33636f;
                    if (i10 > i9) {
                        break;
                    }
                    k1 k1Var3 = k1VarArr3[i10];
                    pi0 pi0Var5 = k1Var3.f33632a;
                    pi0 pi0Var6 = k1Var3.f33633b;
                    pi0Var5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    pi0Var6.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i10++;
                }
                for (int i17 = i9 + 1; i17 < k1VarArr3.length; i17++) {
                    k1 k1Var4 = k1VarArr3[i17];
                    pi0 pi0Var7 = k1Var4.f33632a;
                    pi0 pi0Var8 = k1Var4.f33633b;
                    pi0Var7.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    pi0Var8.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.z zVar = this.f33634c;
        if (zVar != null) {
            zVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.f33634c;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.z zVar = this.f33634c;
        zVar.setBounds(0, 0, width, height);
        zVar.draw(canvas);
    }

    public void setAllStarsProvider(j1 j1Var) {
        this.f33635e = j1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f33634c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
