package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.tg1;

public final class k1 extends FrameLayout {

    public final ri0 f33682a;

    public final ri0 f33683b;

    public final org.telegram.ui.Cells.z f33684c;
    public org.telegram.ui.Components.g1 d;

    public j1 f33685e;

    public int f33686f;

    public k1(Context context) {
        super(context);
        this.f33686f = 0;
        setWillNotDraw(false);
        ri0 ri0Var = new ri0(context);
        this.f33682a = ri0Var;
        ri0 ri0Var2 = new ri0(context);
        this.f33683b = ri0Var2;
        ri0Var.f(R.raw.star_stroke, 37, 37, null);
        ri0Var2.f(R.raw.star_fill, 37, 37, null);
        ri0Var2.setAlpha(0.0f);
        addView(ri0Var, z5.c(37.0f, 37));
        addView(ri0Var2, z5.c(37.0f, 37));
        org.telegram.ui.Cells.z zVarH0 = g6.h0(AndroidUtilities.dp(37.0f), 0, i0.b.k(-1, 76));
        this.f33684c = zVarH0;
        zVarH0.setCallback(this);
        setClickable(true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        j1 j1Var;
        int action = motionEvent.getAction();
        int i11 = 0;
        if (action == 0) {
            j1 j1Var2 = this.f33685e;
            if (j1Var2 != null) {
                k1[] k1VarArr = ((l1) ((lh.p) j1Var2).f16499b).f33701c;
                while (true) {
                    i10 = this.f33686f;
                    if (i11 > i10) {
                        break;
                    }
                    k1 k1Var = k1VarArr[i11];
                    ri0 ri0Var = k1Var.f33682a;
                    ri0 ri0Var2 = k1Var.f33683b;
                    ri0Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    ri0Var2.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i11++;
                }
                for (int i12 = i10 + 1; i12 < k1VarArr.length; i12++) {
                    k1 k1Var2 = k1VarArr[i12];
                    ri0 ri0Var3 = k1Var2.f33682a;
                    ri0 ri0Var4 = k1Var2.f33683b;
                    ri0Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    ri0Var4.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        } else if (action == 1) {
            j1 j1Var3 = this.f33685e;
            if (j1Var3 != null) {
                k1[] k1VarArr2 = ((l1) ((lh.p) j1Var3).f16499b).f33701c;
                for (int i13 = 0; i13 <= this.f33686f; i13++) {
                    k1 k1Var3 = k1VarArr2[i13];
                    ri0 ri0Var5 = k1Var3.f33682a;
                    ri0 ri0Var6 = k1Var3.f33683b;
                    ri0Var5.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    ri0Var6.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
            if (this.d != null) {
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                int i14 = iArr[0];
                int i15 = iArr[1];
                org.telegram.ui.Components.g1 g1Var = this.d;
                float width = (getWidth() / 2.0f) + i14;
                float height = (getHeight() / 2.0f) + i15;
                int i16 = this.f33686f + 1;
                l1 l1Var = (l1) g1Var.f28496b;
                Context context = (Context) g1Var.f28497c;
                if (i16 >= 4) {
                    ri0 ri0Var7 = new ri0(context);
                    int iDp = AndroidUtilities.dp(133.0f);
                    ri0Var7.f(R.raw.rate, 133, 133, null);
                    int[] iArr2 = new int[2];
                    l1Var.getLocationOnScreen(iArr2);
                    int i17 = iArr2[0];
                    int i18 = iArr2[1];
                    l1Var.addView(ri0Var7, z5.c(133.0f, 133));
                    float f10 = width - i17;
                    float f11 = iDp / 2.0f;
                    ri0Var7.setTranslationX(f10 - f11);
                    ri0Var7.setTranslationY((height - i18) - f11);
                    ri0Var7.setOnAnimationEndListener(new h1(l1Var, ri0Var7, 0));
                    ri0Var7.d();
                }
                tg1 tg1Var = l1Var.d;
                if (tg1Var != null) {
                    tg1Var.f42940b.H = i16;
                }
            }
        } else if (action == 3 && (j1Var = this.f33685e) != null) {
            k1[] k1VarArr3 = ((l1) ((lh.p) j1Var).f16499b).f33701c;
            int length = k1VarArr3.length;
            while (i11 < length) {
                k1 k1Var4 = k1VarArr3[i11];
                ri0 ri0Var8 = k1Var4.f33682a;
                ri0 ri0Var9 = k1Var4.f33683b;
                ri0Var8.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                ri0Var9.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                i11++;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.z zVar = this.f33684c;
        if (zVar != null) {
            zVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.f33684c;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.z zVar = this.f33684c;
        zVar.setBounds(0, 0, width, height);
        zVar.draw(canvas);
    }

    public void setAllStarsProvider(j1 j1Var) {
        this.f33685e = j1Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.f33684c == drawable || super.verifyDrawable(drawable);
    }
}
