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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.mf;
import org.telegram.ui.ci1;
import w7.x5;
public final class n1 extends FrameLayout {
    public final aj0 f29104a;
    public final aj0 f29105b;
    public final org.telegram.ui.Cells.z f29106c;
    public mf d;
    public m1 e;
    public int f29107f;

    public n1(Context context) {
        super(context);
        this.f29107f = 0;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.f29104a = imageView;
        ?? imageView2 = new ImageView(context);
        this.f29105b = imageView2;
        imageView.f(R.raw.star_stroke, 37, 37, null);
        imageView2.f(R.raw.star_fill, 37, 37, null);
        imageView2.setAlpha(0.0f);
        addView((View) imageView, x5.c(37.0f, 37));
        addView((View) imageView2, x5.c(37.0f, 37));
        org.telegram.ui.Cells.z h02 = i6.h0(AndroidUtilities.dp(37.0f), 0, i0.a.k(-1, 76));
        this.f29106c = h02;
        h02.setCallback(this);
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
                if (action == 3 && (m1Var = this.e) != null) {
                    n1[] n1VarArr = ((o1) ((k2.v) m1Var).f13386b).f29116c;
                    int length = n1VarArr.length;
                    while (i11 < length) {
                        n1 n1Var = n1VarArr[i11];
                        aj0 aj0Var = n1Var.f29104a;
                        aj0 aj0Var2 = n1Var.f29105b;
                        aj0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        aj0Var2.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        i11++;
                    }
                }
            } else {
                m1 m1Var2 = this.e;
                if (m1Var2 != null) {
                    n1[] n1VarArr2 = ((o1) ((k2.v) m1Var2).f13386b).f29116c;
                    for (int i12 = 0; i12 <= this.f29107f; i12++) {
                        n1 n1Var2 = n1VarArr2[i12];
                        aj0 aj0Var3 = n1Var2.f29104a;
                        aj0 aj0Var4 = n1Var2.f29105b;
                        aj0Var3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        aj0Var4.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    }
                }
                if (this.d != null) {
                    int[] iArr = new int[2];
                    getLocationOnScreen(iArr);
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    mf mfVar = this.d;
                    float width = (getWidth() / 2.0f) + i13;
                    float height = (getHeight() / 2.0f) + i14;
                    int i15 = this.f29107f + 1;
                    o1 o1Var = (o1) mfVar.f26153b;
                    Context context = (Context) mfVar.f26154c;
                    if (i15 >= 4) {
                        ?? imageView = new ImageView(context);
                        int dp = AndroidUtilities.dp(133.0f);
                        imageView.f(R.raw.rate, 133, 133, null);
                        int[] iArr2 = new int[2];
                        o1Var.getLocationOnScreen(iArr2);
                        int i16 = iArr2[0];
                        int i17 = iArr2[1];
                        o1Var.addView((View) imageView, x5.c(133.0f, 133));
                        float f7 = width - i16;
                        float f10 = dp / 2.0f;
                        imageView.setTranslationX(f7 - f10);
                        imageView.setTranslationY((height - i17) - f10);
                        imageView.setOnAnimationEndListener(new k1(o1Var, imageView, 0));
                        imageView.d();
                    }
                    ci1 ci1Var = o1Var.d;
                    if (ci1Var != null) {
                        ci1Var.f32806b.L = i15;
                    }
                }
            }
        } else {
            m1 m1Var3 = this.e;
            if (m1Var3 != null) {
                n1[] n1VarArr3 = ((o1) ((k2.v) m1Var3).f13386b).f29116c;
                while (true) {
                    i10 = this.f29107f;
                    if (i11 > i10) {
                        break;
                    }
                    n1 n1Var3 = n1VarArr3[i11];
                    aj0 aj0Var5 = n1Var3.f29104a;
                    aj0 aj0Var6 = n1Var3.f29105b;
                    aj0Var5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    aj0Var6.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i11++;
                }
                for (int i18 = i10 + 1; i18 < n1VarArr3.length; i18++) {
                    n1 n1Var4 = n1VarArr3[i18];
                    aj0 aj0Var7 = n1Var4.f29104a;
                    aj0 aj0Var8 = n1Var4.f29105b;
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
        org.telegram.ui.Cells.z zVar = this.f29106c;
        if (zVar != null) {
            zVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.f29106c;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.z zVar = this.f29106c;
        zVar.setBounds(0, 0, width, height);
        zVar.draw(canvas);
    }

    public void setAllStarsProvider(m1 m1Var) {
        this.e = m1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f29106c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
