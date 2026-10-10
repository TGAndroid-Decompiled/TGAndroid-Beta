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
import org.telegram.ui.Components.gk0;
import org.telegram.ui.di1;
import w7.x5;
public final class n1 extends FrameLayout {
    public final gk0 f32171a;
    public final gk0 f32172b;
    public final org.telegram.ui.Cells.z f32173c;
    public org.telegram.ui.Components.y2 d;
    public m1 f32174e;
    public int f32175f;

    public n1(Context context) {
        super(context);
        this.f32175f = 0;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.f32171a = imageView;
        ?? imageView2 = new ImageView(context);
        this.f32172b = imageView2;
        imageView.f(R.raw.star_stroke, 37, 37, null);
        imageView2.f(R.raw.star_fill, 37, 37, null);
        imageView2.setAlpha(0.0f);
        addView((View) imageView, x5.d(37.0f, 37));
        addView((View) imageView2, x5.d(37.0f, 37));
        org.telegram.ui.Cells.z i02 = i6.i0(AndroidUtilities.dp(37.0f), 0, i0.a.k(-1, 76));
        this.f32173c = i02;
        i02.setCallback(this);
        setClickable(true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        m1 m1Var;
        int action = motionEvent.getAction();
        int i11 = 0;
        if (action != 0) {
            if (action != 1) {
                if (action == 3 && (m1Var = this.f32174e) != null) {
                    n1[] n1VarArr = ((o1) ((m4.w) m1Var).f16248b).f32184c;
                    int length = n1VarArr.length;
                    while (i11 < length) {
                        n1 n1Var = n1VarArr[i11];
                        gk0 gk0Var = n1Var.f32171a;
                        gk0 gk0Var2 = n1Var.f32172b;
                        gk0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        gk0Var2.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        i11++;
                    }
                }
            } else {
                m1 m1Var2 = this.f32174e;
                if (m1Var2 != null) {
                    n1[] n1VarArr2 = ((o1) ((m4.w) m1Var2).f16248b).f32184c;
                    for (int i12 = 0; i12 <= this.f32175f; i12++) {
                        n1 n1Var2 = n1VarArr2[i12];
                        gk0 gk0Var3 = n1Var2.f32171a;
                        gk0 gk0Var4 = n1Var2.f32172b;
                        gk0Var3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        gk0Var4.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    }
                }
                if (this.d != null) {
                    int[] iArr = new int[2];
                    getLocationOnScreen(iArr);
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    org.telegram.ui.Components.y2 y2Var = this.d;
                    float width = (getWidth() / 2.0f) + i13;
                    float height = (getHeight() / 2.0f) + i14;
                    int i15 = this.f32175f + 1;
                    o1 o1Var = (o1) y2Var.f33082c;
                    Context context = (Context) y2Var.f33081b;
                    if (i15 >= 4) {
                        ?? imageView = new ImageView(context);
                        int dp = AndroidUtilities.dp(133.0f);
                        imageView.f(R.raw.rate, 133, 133, null);
                        int[] iArr2 = new int[2];
                        o1Var.getLocationOnScreen(iArr2);
                        int i16 = iArr2[0];
                        int i17 = iArr2[1];
                        o1Var.addView((View) imageView, x5.d(133.0f, 133));
                        float f7 = width - i16;
                        float f10 = dp / 2.0f;
                        imageView.setTranslationX(f7 - f10);
                        imageView.setTranslationY((height - i17) - f10);
                        imageView.setOnAnimationEndListener(new k1(o1Var, imageView, 0));
                        imageView.d();
                    }
                    di1 di1Var = o1Var.d;
                    if (di1Var != null) {
                        di1Var.f37031b.L = i15;
                    }
                }
            }
        } else {
            m1 m1Var3 = this.f32174e;
            if (m1Var3 != null) {
                n1[] n1VarArr3 = ((o1) ((m4.w) m1Var3).f16248b).f32184c;
                while (true) {
                    i10 = this.f32175f;
                    if (i11 > i10) {
                        break;
                    }
                    n1 n1Var3 = n1VarArr3[i11];
                    gk0 gk0Var5 = n1Var3.f32171a;
                    gk0 gk0Var6 = n1Var3.f32172b;
                    gk0Var5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    gk0Var6.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i11++;
                }
                for (int i18 = i10 + 1; i18 < n1VarArr3.length; i18++) {
                    n1 n1Var4 = n1VarArr3[i18];
                    gk0 gk0Var7 = n1Var4.f32171a;
                    gk0 gk0Var8 = n1Var4.f32172b;
                    gk0Var7.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    gk0Var8.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.z zVar = this.f32173c;
        if (zVar != null) {
            zVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.f32173c;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.z zVar = this.f32173c;
        zVar.setBounds(0, 0, width, height);
        zVar.draw(canvas);
    }

    public void setAllStarsProvider(m1 m1Var) {
        this.f32174e = m1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f32173c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
