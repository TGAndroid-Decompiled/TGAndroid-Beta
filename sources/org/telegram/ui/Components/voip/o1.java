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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.fi1;
import w7.w5;
public final class o1 extends FrameLayout {
    public final ik0 f31865a;
    public final ik0 f31866b;
    public final org.telegram.ui.Cells.z f31867c;
    public org.telegram.ui.Components.y2 d;
    public n1 f31868e;
    public int f31869f;

    public o1(Context context) {
        super(context);
        this.f31869f = 0;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.f31865a = imageView;
        ?? imageView2 = new ImageView(context);
        this.f31866b = imageView2;
        imageView.f(R.raw.star_stroke, 37, 37, null);
        imageView2.f(R.raw.star_fill, 37, 37, null);
        imageView2.setAlpha(0.0f);
        addView((View) imageView, w5.d(37.0f, 37));
        addView((View) imageView2, w5.d(37.0f, 37));
        org.telegram.ui.Cells.z i02 = h6.i0(AndroidUtilities.dp(37.0f), 0, i0.a.k(-1, 76));
        this.f31867c = i02;
        i02.setCallback(this);
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
                if (action == 3 && (n1Var = this.f31868e) != null) {
                    o1[] o1VarArr = ((p1) ((m4.x) n1Var).f15996b).f31888c;
                    int length = o1VarArr.length;
                    while (i11 < length) {
                        o1 o1Var = o1VarArr[i11];
                        ik0 ik0Var = o1Var.f31865a;
                        ik0 ik0Var2 = o1Var.f31866b;
                        ik0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        ik0Var2.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        i11++;
                    }
                }
            } else {
                n1 n1Var2 = this.f31868e;
                if (n1Var2 != null) {
                    o1[] o1VarArr2 = ((p1) ((m4.x) n1Var2).f15996b).f31888c;
                    for (int i12 = 0; i12 <= this.f31869f; i12++) {
                        o1 o1Var2 = o1VarArr2[i12];
                        ik0 ik0Var3 = o1Var2.f31865a;
                        ik0 ik0Var4 = o1Var2.f31866b;
                        ik0Var3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        ik0Var4.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
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
                    int i15 = this.f31869f + 1;
                    p1 p1Var = (p1) y2Var.f32928c;
                    Context context = (Context) y2Var.f32927b;
                    if (i15 >= 4) {
                        ?? imageView = new ImageView(context);
                        int dp = AndroidUtilities.dp(133.0f);
                        imageView.f(R.raw.rate, 133, 133, null);
                        int[] iArr2 = new int[2];
                        p1Var.getLocationOnScreen(iArr2);
                        int i16 = iArr2[0];
                        int i17 = iArr2[1];
                        p1Var.addView((View) imageView, w5.d(133.0f, 133));
                        float f7 = width - i16;
                        float f10 = dp / 2.0f;
                        imageView.setTranslationX(f7 - f10);
                        imageView.setTranslationY((height - i17) - f10);
                        imageView.setOnAnimationEndListener(new l1(p1Var, imageView, 0));
                        imageView.d();
                    }
                    fi1 fi1Var = p1Var.d;
                    if (fi1Var != null) {
                        fi1Var.f37798b.L = i15;
                    }
                }
            }
        } else {
            n1 n1Var3 = this.f31868e;
            if (n1Var3 != null) {
                o1[] o1VarArr3 = ((p1) ((m4.x) n1Var3).f15996b).f31888c;
                while (true) {
                    i10 = this.f31869f;
                    if (i11 > i10) {
                        break;
                    }
                    o1 o1Var3 = o1VarArr3[i11];
                    ik0 ik0Var5 = o1Var3.f31865a;
                    ik0 ik0Var6 = o1Var3.f31866b;
                    ik0Var5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    ik0Var6.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i11++;
                }
                for (int i18 = i10 + 1; i18 < o1VarArr3.length; i18++) {
                    o1 o1Var4 = o1VarArr3[i18];
                    ik0 ik0Var7 = o1Var4.f31865a;
                    ik0 ik0Var8 = o1Var4.f31866b;
                    ik0Var7.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    ik0Var8.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.z zVar = this.f31867c;
        if (zVar != null) {
            zVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.f31867c;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.z zVar = this.f31867c;
        zVar.setBounds(0, 0, width, height);
        zVar.draw(canvas);
    }

    public void setAllStarsProvider(n1 n1Var) {
        this.f31868e = n1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f31867c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
