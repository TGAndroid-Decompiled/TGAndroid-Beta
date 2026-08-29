package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.hh1;
public final class z51 extends FrameLayout {
    public final int f35224a;
    public KeyEvent.Callback f35225b;

    public z51(Context context) {
        super(context);
        this.f35224a = 2;
    }

    @Override
    public void addView(View view, int i10, int i11) {
        switch (this.f35224a) {
            case 3:
                super.addView(view, i10, i11);
                ((sg.f) this.f35225b).e();
                return;
            default:
                super.addView(view, i10, i11);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f35224a) {
            case 0:
                b61 b61Var = (b61) this.f35225b;
                Drawable drawable = b61Var.f26986b;
                drawable.setBounds(0, (int) ((b61Var.h - b61.n(b61Var)) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f35224a) {
            case 0:
                b61 b61Var = (b61) this.f35225b;
                if (motionEvent.getAction() == 0 && b61Var.h != 0 && motionEvent.getY() < b61Var.h) {
                    b61Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f35224a) {
            case 0:
                if (!((b61) this.f35225b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 1:
                ((hh1) this.f35225b).P.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setTranslationY(float f9) {
        switch (this.f35224a) {
            case 0:
                super.setTranslationY(f9);
                b61.m((b61) this.f35225b);
                return;
            default:
                super.setTranslationY(f9);
                return;
        }
    }

    public z51(KeyEvent.Callback callback, Context context, int i10) {
        super(context);
        this.f35224a = i10;
        this.f35225b = callback;
    }
}
