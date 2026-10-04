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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.uh1;
import w7.z5;
public final class o1 extends FrameLayout {
    public final nj0 f32042a;
    public final nj0 f32043b;
    public final org.telegram.ui.Cells.z f32044c;
    public org.telegram.ui.Components.w2 d;
    public n1 f32045e;
    public int f32046f;

    public o1(Context context) {
        super(context);
        this.f32046f = 0;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.f32042a = imageView;
        ?? imageView2 = new ImageView(context);
        this.f32043b = imageView2;
        imageView.f(R.raw.star_stroke, 37, 37, null);
        imageView2.f(R.raw.star_fill, 37, 37, null);
        imageView2.setAlpha(0.0f);
        addView((View) imageView, z5.c(37.0f, 37));
        addView((View) imageView2, z5.c(37.0f, 37));
        org.telegram.ui.Cells.z h02 = i6.h0(AndroidUtilities.dp(37.0f), 0, i0.a.k(-1, 76));
        this.f32044c = h02;
        h02.setCallback(this);
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
                if (action == 3 && (n1Var = this.f32045e) != null) {
                    o1[] o1VarArr = ((p1) ((k2.v) n1Var).f14538b).f32076c;
                    int length = o1VarArr.length;
                    while (i11 < length) {
                        o1 o1Var = o1VarArr[i11];
                        nj0 nj0Var = o1Var.f32042a;
                        nj0 nj0Var2 = o1Var.f32043b;
                        nj0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        nj0Var2.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        i11++;
                    }
                }
            } else {
                n1 n1Var2 = this.f32045e;
                if (n1Var2 != null) {
                    o1[] o1VarArr2 = ((p1) ((k2.v) n1Var2).f14538b).f32076c;
                    for (int i12 = 0; i12 <= this.f32046f; i12++) {
                        o1 o1Var2 = o1VarArr2[i12];
                        nj0 nj0Var3 = o1Var2.f32042a;
                        nj0 nj0Var4 = o1Var2.f32043b;
                        nj0Var3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        nj0Var4.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    }
                }
                if (this.d != null) {
                    int[] iArr = new int[2];
                    getLocationOnScreen(iArr);
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    org.telegram.ui.Components.w2 w2Var = this.d;
                    float width = (getWidth() / 2.0f) + i13;
                    float height = (getHeight() / 2.0f) + i14;
                    int i15 = this.f32046f + 1;
                    p1 p1Var = (p1) w2Var.f32447b;
                    Context context = (Context) w2Var.f32448c;
                    if (i15 >= 4) {
                        ?? imageView = new ImageView(context);
                        int dp = AndroidUtilities.dp(133.0f);
                        imageView.f(R.raw.rate, 133, 133, null);
                        int[] iArr2 = new int[2];
                        p1Var.getLocationOnScreen(iArr2);
                        int i16 = iArr2[0];
                        int i17 = iArr2[1];
                        p1Var.addView((View) imageView, z5.c(133.0f, 133));
                        float f7 = width - i16;
                        float f10 = dp / 2.0f;
                        imageView.setTranslationX(f7 - f10);
                        imageView.setTranslationY((height - i17) - f10);
                        imageView.setOnAnimationEndListener(new l1(p1Var, imageView, 0));
                        imageView.d();
                    }
                    uh1 uh1Var = p1Var.d;
                    if (uh1Var != null) {
                        uh1Var.f41238b.L = i15;
                    }
                }
            }
        } else {
            n1 n1Var3 = this.f32045e;
            if (n1Var3 != null) {
                o1[] o1VarArr3 = ((p1) ((k2.v) n1Var3).f14538b).f32076c;
                while (true) {
                    i10 = this.f32046f;
                    if (i11 > i10) {
                        break;
                    }
                    o1 o1Var3 = o1VarArr3[i11];
                    nj0 nj0Var5 = o1Var3.f32042a;
                    nj0 nj0Var6 = o1Var3.f32043b;
                    nj0Var5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    nj0Var6.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i11++;
                }
                for (int i18 = i10 + 1; i18 < o1VarArr3.length; i18++) {
                    o1 o1Var4 = o1VarArr3[i18];
                    nj0 nj0Var7 = o1Var4.f32042a;
                    nj0 nj0Var8 = o1Var4.f32043b;
                    nj0Var7.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    nj0Var8.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.z zVar = this.f32044c;
        if (zVar != null) {
            zVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.f32044c;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.z zVar = this.f32044c;
        zVar.setBounds(0, 0, width, height);
        zVar.draw(canvas);
    }

    public void setAllStarsProvider(n1 n1Var) {
        this.f32045e = n1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f32044c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
