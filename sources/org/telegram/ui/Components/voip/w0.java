package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.id1;
import w7.b6;
public final class w0 extends FrameLayout {
    public final fi0 f31766a;
    public final fi0 f31767b;
    public final org.telegram.ui.Cells.y f31768c;
    public org.telegram.ui.Components.f2 d;
    public v0 e;
    public int f31769f;

    public w0(Context context) {
        super(context);
        this.f31769f = 0;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.f31766a = imageView;
        ?? imageView2 = new ImageView(context);
        this.f31767b = imageView2;
        imageView.f(2131624222, 37, 37, null);
        imageView2.f(2131624212, 37, 37, null);
        imageView2.setAlpha(0.0f);
        addView((View) imageView, b6.c(37.0f, 37));
        addView((View) imageView2, b6.c(37.0f, 37));
        org.telegram.ui.Cells.y j02 = t6.j0(org.telegram.messenger.i0.L(37.0f), 0, i0.b.o(-1, 76));
        this.f31768c = j02;
        j02.setCallback(this);
        setClickable(true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        v0 v0Var;
        int action = motionEvent.getAction();
        int i11 = 0;
        if (action != 0) {
            if (action != 1) {
                if (action == 3 && (v0Var = this.e) != null) {
                    w0[] w0VarArr = (w0[]) ((jg.b1) ((mg.l) v0Var).f13183b).d;
                    int length = w0VarArr.length;
                    while (i11 < length) {
                        w0 w0Var = w0VarArr[i11];
                        fi0 fi0Var = w0Var.f31766a;
                        fi0 fi0Var2 = w0Var.f31767b;
                        fi0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        fi0Var2.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        i11++;
                    }
                }
            } else {
                v0 v0Var2 = this.e;
                if (v0Var2 != null) {
                    w0[] w0VarArr2 = (w0[]) ((jg.b1) ((mg.l) v0Var2).f13183b).d;
                    for (int i12 = 0; i12 <= this.f31769f; i12++) {
                        w0 w0Var2 = w0VarArr2[i12];
                        fi0 fi0Var3 = w0Var2.f31766a;
                        fi0 fi0Var4 = w0Var2.f31767b;
                        fi0Var3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        fi0Var4.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    }
                }
                if (this.d != null) {
                    int[] iArr = new int[2];
                    getLocationOnScreen(iArr);
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    org.telegram.ui.Components.f2 f2Var = this.d;
                    float width = (getWidth() / 2.0f) + i13;
                    float height = (getHeight() / 2.0f) + i14;
                    int i15 = this.f31769f + 1;
                    jg.b1 b1Var = (jg.b1) f2Var.f26041b;
                    Context context = (Context) f2Var.f26042c;
                    if (i15 >= 4) {
                        ?? imageView = new ImageView(context);
                        int L = org.telegram.messenger.i0.L(133.0f);
                        imageView.f(2131624172, 133, 133, null);
                        int[] iArr2 = new int[2];
                        b1Var.getLocationOnScreen(iArr2);
                        int i16 = iArr2[0];
                        int i17 = iArr2[1];
                        b1Var.addView((View) imageView, b6.c(133.0f, 133));
                        float f7 = L / 2.0f;
                        imageView.setTranslationX((width - i16) - f7);
                        imageView.setTranslationY((height - i17) - f7);
                        imageView.setOnAnimationEndListener(new u0(b1Var, imageView, 0));
                        imageView.d();
                    }
                    id1 id1Var = (id1) b1Var.e;
                    if (id1Var != null) {
                        id1Var.f38008b.L = i15;
                    }
                }
            }
        } else {
            v0 v0Var3 = this.e;
            if (v0Var3 != null) {
                w0[] w0VarArr3 = (w0[]) ((jg.b1) ((mg.l) v0Var3).f13183b).d;
                while (true) {
                    i10 = this.f31769f;
                    if (i11 > i10) {
                        break;
                    }
                    w0 w0Var3 = w0VarArr3[i11];
                    fi0 fi0Var5 = w0Var3.f31766a;
                    fi0 fi0Var6 = w0Var3.f31767b;
                    fi0Var5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    fi0Var6.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i11++;
                }
                for (int i18 = i10 + 1; i18 < w0VarArr3.length; i18++) {
                    w0 w0Var4 = w0VarArr3[i18];
                    fi0 fi0Var7 = w0Var4.f31766a;
                    fi0 fi0Var8 = w0Var4.f31767b;
                    fi0Var7.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    fi0Var8.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.y yVar = this.f31768c;
        if (yVar != null) {
            yVar.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.f31768c;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.y yVar = this.f31768c;
        yVar.setBounds(0, 0, width, height);
        yVar.draw(canvas);
    }

    public void setAllStarsProvider(v0 v0Var) {
        this.e = v0Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f31768c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
