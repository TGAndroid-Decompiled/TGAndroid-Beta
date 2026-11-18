package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class de extends FrameLayout {
    public final int f34382a;
    public final ChatActivityEnterView f34383b;

    public de(ChatActivityEnterView chatActivityEnterView, Context context, int i7) {
        super(context);
        this.f34382a = i7;
        this.f34383b = chatActivityEnterView;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        fh.g gVar;
        gh.a aVar;
        fh.g gVar2;
        switch (this.f34382a) {
            case 3:
                ChatActivityEnterView chatActivityEnterView = this.f34383b;
                if (chatActivityEnterView.I1) {
                    float f13 = chatActivityEnterView.N1;
                    float f14 = 0.0f;
                    if (f13 > 0.0f) {
                        Paint paint = chatActivityEnterView.M1;
                        int[] iArr = chatActivityEnterView.Q1;
                        int[] iArr2 = chatActivityEnterView.P1;
                        float f15 = 1.0f;
                        float i7 = Utilities.i(f13 * 1.25f, 1.0f, 0.0f);
                        float i10 = Utilities.i((f13 - 0.18f) * 1.25f, 1.0f, 0.0f);
                        float height = getHeight();
                        float min = Math.min(height - org.telegram.messenger.g0.L(44.0f), chatActivityEnterView.W0(this));
                        float width = getWidth() - org.telegram.messenger.g0.L(2.5f);
                        re reVar = chatActivityEnterView.K0;
                        int i11 = 0;
                        if (reVar != null && reVar.getVisibility() == 0) {
                            f10 = 44.0f;
                            RectF rectF = org.telegram.messenger.g0.P;
                            reVar.f(rectF);
                            reVar.getLocationInWindow(iArr2);
                            getLocationInWindow(iArr);
                            float f16 = (iArr2[0] - iArr[0]) + rectF.left;
                            if (f16 > org.telegram.messenger.g0.L(120.0f)) {
                                width = f16 - org.telegram.messenger.g0.L(6.0f);
                            }
                        } else {
                            f10 = 44.0f;
                        }
                        float f17 = 22.0f;
                        if (chatActivityEnterView.K1 == null && chatActivityEnterView.J1 != null) {
                            jh.f z02 = chatActivityEnterView.z0();
                            if (z02 != null && (gVar2 = z02.f17778n) != null) {
                                aVar = gVar2.f11671w;
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                fh.g c10 = chatActivityEnterView.J1.c(this, aVar, false);
                                chatActivityEnterView.K1 = c10;
                                c10.r(org.telegram.messenger.g0.L(22.0f));
                                fh.g c11 = chatActivityEnterView.J1.c(this, aVar, false);
                                chatActivityEnterView.L1 = c11;
                                c11.r(org.telegram.messenger.g0.L(22.0f));
                            }
                        }
                        while (i11 < 2) {
                            if (i11 == 0) {
                                f11 = i7;
                            } else {
                                f11 = i10;
                            }
                            if (f11 <= f14) {
                                f12 = f17;
                            } else {
                                if (i11 == 0) {
                                    f12 = f17;
                                    org.telegram.messenger.g0.P.set(f14, height - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), height);
                                } else {
                                    f12 = f17;
                                    org.telegram.messenger.g0.P.set(org.telegram.messenger.g0.L(48.0f), min, width, height);
                                }
                                float T1 = org.telegram.messenger.g0.T1(0.92f, f15, f11);
                                canvas.save();
                                RectF rectF2 = org.telegram.messenger.g0.P;
                                canvas.scale(T1, T1, rectF2.centerX(), height - (org.telegram.messenger.g0.L(f10) / 2.0f));
                                if (i11 == 0) {
                                    gVar = chatActivityEnterView.K1;
                                } else {
                                    gVar = chatActivityEnterView.L1;
                                }
                                if (gVar != null) {
                                    gVar.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    gVar.setAlpha((int) (f11 * 255.0f));
                                    gVar.draw(canvas);
                                } else {
                                    paint.setColor(org.telegram.ui.ActionBar.n6.r1(f11, chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.Je)));
                                    canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(f12), paint);
                                }
                                canvas.restore();
                            }
                            i11++;
                            f17 = f12;
                            f14 = 0.0f;
                            f15 = 1.0f;
                        }
                    }
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        re reVar;
        float x10;
        switch (this.f34382a) {
            case 2:
                if (motionEvent.getAction() != 10) {
                    float x11 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    for (int i7 = 0; i7 < getChildCount(); i7++) {
                        View childAt = getChildAt(i7);
                        if (childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f) {
                            float x12 = childAt.getX() + childAt.getWidth();
                            if (childAt == this.f34383b.K0) {
                                x10 = x12 - reVar.l();
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
        switch (this.f34382a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f34383b;
                ki.j3 j3Var = chatActivityEnterView.f32628l0;
                if (j3Var != null && j3Var.getVisibility() == 0) {
                    return chatActivityEnterView.f32628l0.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f34383b;
                if (chatActivityEnterView2.K && chatActivityEnterView2.f32641m7 != 2) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
        }
    }

    @Override
    public boolean drawChild(final Canvas canvas, final View view, final long j3) {
        switch (this.f34382a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f34383b;
                if (view != null && view == chatActivityEnterView.F0) {
                    return chatActivityEnterView.s0(canvas, new org.telegram.messenger.p10() {
                        @Override
                        public final Object run() {
                            Boolean valueOf;
                            valueOf = Boolean.valueOf(super/*android.widget.FrameLayout*/.drawChild(canvas, view, j3));
                            return valueOf;
                        }
                    });
                }
                if (chatActivityEnterView.X5 && view == chatActivityEnterView.f32584f1) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f34383b;
                if (view == chatActivityEnterView2.K0 && chatActivityEnterView2.f32606i0) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f34382a) {
            case 3:
                if (!this.f34383b.I1 && super.hasOverlappingRendering()) {
                    return true;
                }
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f34382a) {
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                ChatActivityEnterView chatActivityEnterView = this.f34383b;
                if (!chatActivityEnterView.C0.isEmpty()) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        View childAt = getChildAt(i13);
                        Float f10 = (Float) chatActivityEnterView.C0.get(childAt);
                        if (f10 != null) {
                            childAt.setTranslationX(f10.floatValue() - childAt.getLeft());
                            childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(lr.f37208f).start();
                        }
                    }
                    chatActivityEnterView.C0.clear();
                    return;
                }
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        ?? r12;
        switch (this.f34382a) {
            case 1:
                super.onMeasure(i7, i10);
                int max = Math.max(org.telegram.messenger.g0.L(44.0f), getMeasuredHeight());
                ChatActivityEnterView chatActivityEnterView = this.f34383b;
                te.c cVar = chatActivityEnterView.f32581e7;
                float f10 = cVar.f57663f;
                if (f10 > 0.0f) {
                    if (cVar.h) {
                        f10 = cVar.f57664g;
                    }
                    float f11 = max;
                    if (f10 != f11) {
                        cVar.d = chatActivityEnterView.A0();
                        cVar.f57662e = 0L;
                        lr lrVar = pi.k.V;
                        if (chatActivityEnterView.E1 > 0 && SystemClock.uptimeMillis() < chatActivityEnterView.E1 && (r12 = chatActivityEnterView.F1) != 0) {
                            lrVar = r12;
                        }
                        cVar.f57661c = lrVar;
                    }
                    cVar.a(f11);
                } else {
                    cVar.c(max);
                }
                chatActivityEnterView.S();
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f34382a) {
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
        switch (this.f34382a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f34383b;
                if (chatActivityEnterView.K && chatActivityEnterView.f32641m7 != 2) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f34382a) {
            case 3:
                super.setVisibility(i7);
                this.f34383b.t2(true);
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }
}
