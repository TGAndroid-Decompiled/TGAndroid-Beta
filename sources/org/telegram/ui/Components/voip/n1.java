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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.bi1;
import w7.y5;
public final class n1 extends FrameLayout {
    public final nj0 f29472a;
    public final nj0 f29473b;
    public final org.telegram.ui.Cells.z f29474c;
    public org.telegram.ui.Components.a3 d;
    public m1 e;
    public int f29475f;

    public n1(Context context) {
        super(context);
        this.f29475f = 0;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.f29472a = imageView;
        ?? imageView2 = new ImageView(context);
        this.f29473b = imageView2;
        imageView.f(R.raw.star_stroke, 37, 37, null);
        imageView2.f(R.raw.star_fill, 37, 37, null);
        imageView2.setAlpha(0.0f);
        addView((View) imageView, y5.c(37.0f, 37));
        addView((View) imageView2, y5.c(37.0f, 37));
        org.telegram.ui.Cells.z h02 = j6.h0(AndroidUtilities.dp(37.0f), 0, i0.a.k(-1, 76));
        this.f29474c = h02;
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
                    n1[] n1VarArr = ((o1) ((k2.v) m1Var).f13386b).f29484c;
                    int length = n1VarArr.length;
                    while (i11 < length) {
                        n1 n1Var = n1VarArr[i11];
                        nj0 nj0Var = n1Var.f29472a;
                        nj0 nj0Var2 = n1Var.f29473b;
                        nj0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        nj0Var2.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        i11++;
                    }
                }
            } else {
                m1 m1Var2 = this.e;
                if (m1Var2 != null) {
                    n1[] n1VarArr2 = ((o1) ((k2.v) m1Var2).f13386b).f29484c;
                    for (int i12 = 0; i12 <= this.f29475f; i12++) {
                        n1 n1Var2 = n1VarArr2[i12];
                        nj0 nj0Var3 = n1Var2.f29472a;
                        nj0 nj0Var4 = n1Var2.f29473b;
                        nj0Var3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        nj0Var4.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    }
                }
                if (this.d != null) {
                    int[] iArr = new int[2];
                    getLocationOnScreen(iArr);
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    org.telegram.ui.Components.a3 a3Var = this.d;
                    float width = (getWidth() / 2.0f) + i13;
                    float height = (getHeight() / 2.0f) + i14;
                    int i15 = this.f29475f + 1;
                    o1 o1Var = (o1) a3Var.f22524b;
                    Context context = (Context) a3Var.f22525c;
                    if (i15 >= 4) {
                        ?? imageView = new ImageView(context);
                        int dp = AndroidUtilities.dp(133.0f);
                        imageView.f(R.raw.rate, 133, 133, null);
                        int[] iArr2 = new int[2];
                        o1Var.getLocationOnScreen(iArr2);
                        int i16 = iArr2[0];
                        int i17 = iArr2[1];
                        o1Var.addView((View) imageView, y5.c(133.0f, 133));
                        float f7 = width - i16;
                        float f10 = dp / 2.0f;
                        imageView.setTranslationX(f7 - f10);
                        imageView.setTranslationY((height - i17) - f10);
                        imageView.setOnAnimationEndListener(new k1(o1Var, imageView, 0));
                        imageView.d();
                    }
                    bi1 bi1Var = o1Var.d;
                    if (bi1Var != null) {
                        bi1Var.f32489b.L = i15;
                    }
                }
            }
        } else {
            m1 m1Var3 = this.e;
            if (m1Var3 != null) {
                n1[] n1VarArr3 = ((o1) ((k2.v) m1Var3).f13386b).f29484c;
                while (true) {
                    i10 = this.f29475f;
                    if (i11 > i10) {
                        break;
                    }
                    n1 n1Var3 = n1VarArr3[i11];
                    nj0 nj0Var5 = n1Var3.f29472a;
                    nj0 nj0Var6 = n1Var3.f29473b;
                    nj0Var5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    nj0Var6.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i11++;
                }
                for (int i18 = i10 + 1; i18 < n1VarArr3.length; i18++) {
                    n1 n1Var4 = n1VarArr3[i18];
                    nj0 nj0Var7 = n1Var4.f29472a;
                    nj0 nj0Var8 = n1Var4.f29473b;
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
        org.telegram.ui.Cells.z zVar = this.f29474c;
        if (zVar != null) {
            zVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.f29474c;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.z zVar = this.f29474c;
        zVar.setBounds(0, 0, width, height);
        zVar.draw(canvas);
    }

    public void setAllStarsProvider(m1 m1Var) {
        this.e = m1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f29474c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
