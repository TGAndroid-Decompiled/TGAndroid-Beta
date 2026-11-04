package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class sd extends FrameLayout {
    public final int f37985a;
    public final ChatActivityEnterView f37986b;

    public sd(ChatActivityEnterView chatActivityEnterView, Context context, int i3) {
        super(context);
        this.f37985a = i3;
        this.f37986b = chatActivityEnterView;
    }

    @Override
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        ee eeVar;
        float x10;
        switch (this.f37985a) {
            case 2:
                if (motionEvent.getAction() != 10) {
                    float x11 = motionEvent.getX();
                    float y9 = motionEvent.getY();
                    for (int i3 = 0; i3 < getChildCount(); i3++) {
                        View childAt = getChildAt(i3);
                        if (childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f) {
                            float x12 = childAt.getX() + childAt.getWidth();
                            if (childAt == this.f37986b.K0) {
                                x10 = x12 - eeVar.l();
                            } else {
                                x10 = childAt.getX();
                            }
                            if (x11 >= x10 && x11 < x12 && y9 >= childAt.getY() && y9 < childAt.getY() + childAt.getHeight()) {
                            }
                        }
                    }
                    return false;
                }
                return super.dispatchHoverEvent(motionEvent);
            default:
                return super.dispatchHoverEvent(motionEvent);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f37985a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f37986b;
                ii.r3 r3Var = chatActivityEnterView.f31151l0;
                if (r3Var != null && r3Var.getVisibility() == 0) {
                    return chatActivityEnterView.f31151l0.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f37986b;
                if (chatActivityEnterView2.K && chatActivityEnterView2.f31197s5 != 2) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
        }
    }

    @Override
    public boolean drawChild(final Canvas canvas, final View view, final long j10) {
        switch (this.f37985a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f37986b;
                if (view != null && view == chatActivityEnterView.F0) {
                    return chatActivityEnterView.c0(canvas, new org.telegram.messenger.m10() {
                        @Override
                        public final Object run() {
                            Boolean valueOf;
                            valueOf = Boolean.valueOf(super/*android.widget.FrameLayout*/.drawChild(canvas, view, j10));
                            return valueOf;
                        }
                    });
                }
                if (chatActivityEnterView.A4 && view == chatActivityEnterView.f31118f1) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f37986b;
                if (view == chatActivityEnterView2.K0 && chatActivityEnterView2.f31135i0) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f37985a) {
            case 1:
                super.onLayout(z10, i3, i10, i11, i12);
                ChatActivityEnterView chatActivityEnterView = this.f37986b;
                if (!chatActivityEnterView.C0.isEmpty()) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        View childAt = getChildAt(i13);
                        Float f10 = (Float) chatActivityEnterView.C0.get(childAt);
                        if (f10 != null) {
                            childAt.setTranslationX(f10.floatValue() - childAt.getLeft());
                            childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(xq.f40452f).start();
                        }
                    }
                    chatActivityEnterView.C0.clear();
                    return;
                }
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f37985a) {
            case 1:
                super.onMeasure(i3, i10);
                int max = Math.max(org.telegram.messenger.g0.L(44.0f), getMeasuredHeight());
                ChatActivityEnterView chatActivityEnterView = this.f37986b;
                qe.c cVar = chatActivityEnterView.f31150k5;
                if (cVar.f53846f > 0.0f) {
                    cVar.a(max);
                } else {
                    cVar.c(max);
                }
                chatActivityEnterView.I();
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.f37985a) {
            case 2:
                super.onSizeChanged(i3, i10, i11, i12);
                setPivotX(i3 - org.telegram.messenger.g0.L(22.0f));
                setPivotY(i10 - org.telegram.messenger.g0.L(22.0f));
                return;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f37985a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f37986b;
                if (chatActivityEnterView.K && chatActivityEnterView.f31197s5 != 2) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setVisibility(int i3) {
        switch (this.f37985a) {
            case 3:
                super.setVisibility(i3);
                this.f37986b.Q1(true);
                return;
            default:
                super.setVisibility(i3);
                return;
        }
    }
}
