package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class pd extends FrameLayout {
    public final int f29342a;
    public final ChatActivityEnterView f29343b;

    public pd(ChatActivityEnterView chatActivityEnterView, Context context, int i10) {
        super(context);
        this.f29342a = i10;
        this.f29343b = chatActivityEnterView;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f29342a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f29343b;
                xh.a3 a3Var = chatActivityEnterView.f23736k0;
                if (a3Var != null && a3Var.getVisibility() == 0) {
                    return chatActivityEnterView.f23736k0.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f29343b;
                if (chatActivityEnterView2.J && chatActivityEnterView2.f23781r5 != 2) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
        }
    }

    @Override
    public boolean drawChild(final Canvas canvas, final View view, final long j10) {
        switch (this.f29342a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f29343b;
                if (view != null && view == chatActivityEnterView.E0) {
                    return chatActivityEnterView.b0(canvas, new org.telegram.messenger.i20() {
                        @Override
                        public final Object run() {
                            Boolean valueOf;
                            valueOf = Boolean.valueOf(super/*android.widget.FrameLayout*/.drawChild(canvas, view, j10));
                            return valueOf;
                        }
                    });
                }
                if (chatActivityEnterView.f23824z4 && view == chatActivityEnterView.f23700e1) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f29343b;
                if (view == chatActivityEnterView2.J0 && chatActivityEnterView2.f23718h0) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f29342a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                ChatActivityEnterView chatActivityEnterView = this.f29343b;
                if (!chatActivityEnterView.B0.isEmpty()) {
                    for (int i14 = 0; i14 < getChildCount(); i14++) {
                        View childAt = getChildAt(i14);
                        Float f7 = (Float) chatActivityEnterView.B0.get(childAt);
                        if (f7 != null) {
                            childAt.setTranslationX(f7.floatValue() - childAt.getLeft());
                            childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(gr.f26495f).start();
                        }
                    }
                    chatActivityEnterView.B0.clear();
                    return;
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f29342a) {
            case 1:
                super.onMeasure(i10, i11);
                int max = Math.max(org.telegram.messenger.i0.L(44.0f), getMeasuredHeight());
                ChatActivityEnterView chatActivityEnterView = this.f29343b;
                fe.f fVar = chatActivityEnterView.f23735j5;
                if (fVar.f7031f > 0.0f) {
                    fVar.a(max);
                } else {
                    fVar.c(max);
                }
                chatActivityEnterView.I();
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f29342a) {
            case 2:
                super.onSizeChanged(i10, i11, i12, i13);
                setPivotX(i10 - org.telegram.messenger.i0.L(22.0f));
                setPivotY(i11 - org.telegram.messenger.i0.L(22.0f));
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f29342a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f29343b;
                if (chatActivityEnterView.J && chatActivityEnterView.f23781r5 != 2) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f29342a) {
            case 3:
                super.setVisibility(i10);
                this.f29343b.O1(true);
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
