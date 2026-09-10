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
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.km;
import org.telegram.ui.hi1;
import w7.a6;
public final class m1 extends FrameLayout {
    public final kj0 f28274a;
    public final kj0 f28275b;
    public final org.telegram.ui.Cells.z f28276c;
    public km d;
    public l1 e;
    public int f28277f;

    public m1(Context context) {
        super(context);
        this.f28277f = 0;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.f28274a = imageView;
        ?? imageView2 = new ImageView(context);
        this.f28275b = imageView2;
        imageView.f(R.raw.star_stroke, 37, 37, null);
        imageView2.f(R.raw.star_fill, 37, 37, null);
        imageView2.setAlpha(0.0f);
        addView((View) imageView, a6.c(37.0f, 37));
        addView((View) imageView2, a6.c(37.0f, 37));
        org.telegram.ui.Cells.z h02 = j6.h0(AndroidUtilities.dp(37.0f), 0, i0.a.k(-1, 76));
        this.f28276c = h02;
        h02.setCallback(this);
        setClickable(true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        l1 l1Var;
        int action = motionEvent.getAction();
        int i11 = 0;
        if (action != 0) {
            if (action != 1) {
                if (action == 3 && (l1Var = this.e) != null) {
                    m1[] m1VarArr = ((n1) ((org.telegram.tgnet.j) l1Var).f17386b).f28289c;
                    int length = m1VarArr.length;
                    while (i11 < length) {
                        m1 m1Var = m1VarArr[i11];
                        kj0 kj0Var = m1Var.f28274a;
                        kj0 kj0Var2 = m1Var.f28275b;
                        kj0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        kj0Var2.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        i11++;
                    }
                }
            } else {
                l1 l1Var2 = this.e;
                if (l1Var2 != null) {
                    m1[] m1VarArr2 = ((n1) ((org.telegram.tgnet.j) l1Var2).f17386b).f28289c;
                    for (int i12 = 0; i12 <= this.f28277f; i12++) {
                        m1 m1Var2 = m1VarArr2[i12];
                        kj0 kj0Var3 = m1Var2.f28274a;
                        kj0 kj0Var4 = m1Var2.f28275b;
                        kj0Var3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        kj0Var4.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    }
                }
                if (this.d != null) {
                    int[] iArr = new int[2];
                    getLocationOnScreen(iArr);
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    km kmVar = this.d;
                    float width = (getWidth() / 2.0f) + i13;
                    float height = (getHeight() / 2.0f) + i14;
                    int i15 = this.f28277f + 1;
                    n1 n1Var = (n1) kmVar.f24749b;
                    Context context = (Context) kmVar.f24750c;
                    if (i15 >= 4) {
                        ?? imageView = new ImageView(context);
                        int dp = AndroidUtilities.dp(133.0f);
                        imageView.f(R.raw.rate, 133, 133, null);
                        int[] iArr2 = new int[2];
                        n1Var.getLocationOnScreen(iArr2);
                        int i16 = iArr2[0];
                        int i17 = iArr2[1];
                        n1Var.addView((View) imageView, a6.c(133.0f, 133));
                        float f7 = width - i16;
                        float f10 = dp / 2.0f;
                        imageView.setTranslationX(f7 - f10);
                        imageView.setTranslationY((height - i17) - f10);
                        imageView.setOnAnimationEndListener(new j1(n1Var, imageView, 0));
                        imageView.d();
                    }
                    hi1 hi1Var = n1Var.d;
                    if (hi1Var != null) {
                        hi1Var.f33401b.L = i15;
                    }
                }
            }
        } else {
            l1 l1Var3 = this.e;
            if (l1Var3 != null) {
                m1[] m1VarArr3 = ((n1) ((org.telegram.tgnet.j) l1Var3).f17386b).f28289c;
                while (true) {
                    i10 = this.f28277f;
                    if (i11 > i10) {
                        break;
                    }
                    m1 m1Var3 = m1VarArr3[i11];
                    kj0 kj0Var5 = m1Var3.f28274a;
                    kj0 kj0Var6 = m1Var3.f28275b;
                    kj0Var5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    kj0Var6.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i11++;
                }
                for (int i18 = i10 + 1; i18 < m1VarArr3.length; i18++) {
                    m1 m1Var4 = m1VarArr3[i18];
                    kj0 kj0Var7 = m1Var4.f28274a;
                    kj0 kj0Var8 = m1Var4.f28275b;
                    kj0Var7.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    kj0Var8.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.z zVar = this.f28276c;
        if (zVar != null) {
            zVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.f28276c;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.z zVar = this.f28276c;
        zVar.setBounds(0, 0, width, height);
        zVar.draw(canvas);
    }

    public void setAllStarsProvider(l1 l1Var) {
        this.e = l1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f28276c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
