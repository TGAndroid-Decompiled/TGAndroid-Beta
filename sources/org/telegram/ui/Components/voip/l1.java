package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.wg1;
public final class l1 extends FrameLayout {
    public final aj0 f33830a;
    public final aj0 f33831b;
    public final org.telegram.ui.Cells.z f33832c;
    public org.telegram.ui.Components.j1 d;
    public k1 f33833e;
    public int f33834f;

    public l1(Context context) {
        super(context);
        this.f33834f = 0;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.f33830a = imageView;
        ?? imageView2 = new ImageView(context);
        this.f33831b = imageView2;
        imageView.f(R.raw.star_stroke, 37, 37, null);
        imageView2.f(R.raw.star_fill, 37, 37, null);
        imageView2.setAlpha(0.0f);
        addView((View) imageView, f6.c(37.0f, 37));
        addView((View) imageView2, f6.c(37.0f, 37));
        org.telegram.ui.Cells.z h02 = g6.h0(AndroidUtilities.dp(37.0f), 0, i0.a.k(-1, 76));
        this.f33832c = h02;
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
                if (action == 3 && (k1Var = this.f33833e) != null) {
                    l1[] l1VarArr = ((m1) ((l4.s0) k1Var).f14423b).f33853c;
                    int length = l1VarArr.length;
                    while (i11 < length) {
                        l1 l1Var = l1VarArr[i11];
                        aj0 aj0Var = l1Var.f33830a;
                        aj0 aj0Var2 = l1Var.f33831b;
                        aj0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        aj0Var2.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        i11++;
                    }
                }
            } else {
                k1 k1Var2 = this.f33833e;
                if (k1Var2 != null) {
                    l1[] l1VarArr2 = ((m1) ((l4.s0) k1Var2).f14423b).f33853c;
                    for (int i12 = 0; i12 <= this.f33834f; i12++) {
                        l1 l1Var2 = l1VarArr2[i12];
                        aj0 aj0Var3 = l1Var2.f33830a;
                        aj0 aj0Var4 = l1Var2.f33831b;
                        aj0Var3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        aj0Var4.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    }
                }
                if (this.d != null) {
                    int[] iArr = new int[2];
                    getLocationOnScreen(iArr);
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    org.telegram.ui.Components.j1 j1Var = this.d;
                    float width = (getWidth() / 2.0f) + i13;
                    float height = (getHeight() / 2.0f) + i14;
                    int i15 = this.f33834f + 1;
                    m1 m1Var = (m1) j1Var.f29521b;
                    Context context = (Context) j1Var.f29522c;
                    if (i15 >= 4) {
                        ?? imageView = new ImageView(context);
                        int dp = AndroidUtilities.dp(133.0f);
                        imageView.f(R.raw.rate, 133, 133, null);
                        int[] iArr2 = new int[2];
                        m1Var.getLocationOnScreen(iArr2);
                        int i16 = iArr2[0];
                        int i17 = iArr2[1];
                        m1Var.addView((View) imageView, f6.c(133.0f, 133));
                        float f9 = width - i16;
                        float f10 = dp / 2.0f;
                        imageView.setTranslationX(f9 - f10);
                        imageView.setTranslationY((height - i17) - f10);
                        imageView.setOnAnimationEndListener(new i1(m1Var, imageView, 0));
                        imageView.d();
                    }
                    wg1 wg1Var = m1Var.d;
                    if (wg1Var != null) {
                        wg1Var.f44308b.H = i15;
                    }
                }
            }
        } else {
            k1 k1Var3 = this.f33833e;
            if (k1Var3 != null) {
                l1[] l1VarArr3 = ((m1) ((l4.s0) k1Var3).f14423b).f33853c;
                while (true) {
                    i10 = this.f33834f;
                    if (i11 > i10) {
                        break;
                    }
                    l1 l1Var3 = l1VarArr3[i11];
                    aj0 aj0Var5 = l1Var3.f33830a;
                    aj0 aj0Var6 = l1Var3.f33831b;
                    aj0Var5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    aj0Var6.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i11++;
                }
                for (int i18 = i10 + 1; i18 < l1VarArr3.length; i18++) {
                    l1 l1Var4 = l1VarArr3[i18];
                    aj0 aj0Var7 = l1Var4.f33830a;
                    aj0 aj0Var8 = l1Var4.f33831b;
                    aj0Var7.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    aj0Var8.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.z zVar = this.f33832c;
        if (zVar != null) {
            zVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.f33832c;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.z zVar = this.f33832c;
        zVar.setBounds(0, 0, width, height);
        zVar.draw(canvas);
    }

    public void setAllStarsProvider(k1 k1Var) {
        this.f33833e = k1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f33832c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
