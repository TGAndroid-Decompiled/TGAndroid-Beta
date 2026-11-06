package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class ud extends FrameLayout {
    public final int f38596a;
    public final ChatActivityEnterView f38597b;

    public ud(ChatActivityEnterView chatActivityEnterView, Context context, int i7) {
        super(context);
        this.f38596a = i7;
        this.f38597b = chatActivityEnterView;
    }

    @Override
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        ge geVar;
        float x10;
        switch (this.f38596a) {
            case 2:
                if (motionEvent.getAction() != 10) {
                    float x11 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    for (int i7 = 0; i7 < getChildCount(); i7++) {
                        View childAt = getChildAt(i7);
                        if (childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f) {
                            float x12 = childAt.getX() + childAt.getWidth();
                            if (childAt == this.f38597b.J0) {
                                x10 = x12 - geVar.l();
                            } else {
                                x10 = childAt.getX();
                            }
                            if (x11 >= x10 && x11 < x12 && y10 >= childAt.getY() && y10 < childAt.getY() + childAt.getHeight()) {
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
        switch (this.f38596a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f38597b;
                hi.r3 r3Var = chatActivityEnterView.f31072k0;
                if (r3Var != null && r3Var.getVisibility() == 0) {
                    return chatActivityEnterView.f31072k0.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f38597b;
                if (chatActivityEnterView2.J && chatActivityEnterView2.f31117r5 != 2) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
        }
    }

    @Override
    public boolean drawChild(final Canvas canvas, final View view, final long j3) {
        switch (this.f38596a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f38597b;
                if (view != null && view == chatActivityEnterView.E0) {
                    return chatActivityEnterView.c0(canvas, new org.telegram.messenger.u10() {
                        @Override
                        public final Object run() {
                            Boolean valueOf;
                            valueOf = Boolean.valueOf(super/*android.widget.FrameLayout*/.drawChild(canvas, view, j3));
                            return valueOf;
                        }
                    });
                }
                if (chatActivityEnterView.f31161z4 && view == chatActivityEnterView.f31037e1) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f38597b;
                if (view == chatActivityEnterView2.J0 && chatActivityEnterView2.f31055h0) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f38596a) {
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                ChatActivityEnterView chatActivityEnterView = this.f38597b;
                if (!chatActivityEnterView.B0.isEmpty()) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        View childAt = getChildAt(i13);
                        Float f10 = (Float) chatActivityEnterView.B0.get(childAt);
                        if (f10 != null) {
                            childAt.setTranslationX(f10.floatValue() - childAt.getLeft());
                            childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(xq.f40345f).start();
                        }
                    }
                    chatActivityEnterView.B0.clear();
                    return;
                }
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f38596a) {
            case 1:
                super.onMeasure(i7, i10);
                int max = Math.max(org.telegram.messenger.g0.L(44.0f), getMeasuredHeight());
                ChatActivityEnterView chatActivityEnterView = this.f38597b;
                te.c cVar = chatActivityEnterView.f31071j5;
                if (cVar.f55400f > 0.0f) {
                    cVar.a(max);
                } else {
                    cVar.c(max);
                }
                chatActivityEnterView.I();
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f38596a) {
            case 2:
                super.onSizeChanged(i7, i10, i11, i12);
                setPivotX(i7 - org.telegram.messenger.g0.L(22.0f));
                setPivotY(i10 - org.telegram.messenger.g0.L(22.0f));
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f38596a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f38597b;
                if (chatActivityEnterView.J && chatActivityEnterView.f31117r5 != 2) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f38596a) {
            case 3:
                super.setVisibility(i7);
                this.f38597b.R1(true);
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }
}
