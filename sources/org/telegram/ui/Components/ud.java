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
public final class ud extends FrameLayout {
    public final int f39997a;
    public final ChatActivityEnterView f39998b;

    public ud(ChatActivityEnterView chatActivityEnterView, Context context, int i7) {
        super(context);
        this.f39997a = i7;
        this.f39998b = chatActivityEnterView;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        fh.g gVar;
        gh.a aVar;
        fh.g gVar2;
        switch (this.f39997a) {
            case 3:
                ChatActivityEnterView chatActivityEnterView = this.f39998b;
                if (chatActivityEnterView.C1) {
                    float f13 = chatActivityEnterView.H1;
                    float f14 = 0.0f;
                    if (f13 > 0.0f) {
                        Paint paint = chatActivityEnterView.G1;
                        int[] iArr = chatActivityEnterView.K1;
                        int[] iArr2 = chatActivityEnterView.J1;
                        float f15 = 1.0f;
                        float i7 = Utilities.i(f13 * 1.25f, 1.0f, 0.0f);
                        float i10 = Utilities.i((f13 - 0.18f) * 1.25f, 1.0f, 0.0f);
                        float height = getHeight();
                        float min = Math.min(height - org.telegram.messenger.g0.L(44.0f), chatActivityEnterView.O0(this));
                        float width = getWidth() - org.telegram.messenger.g0.L(2.5f);
                        he heVar = chatActivityEnterView.K0;
                        int i11 = 0;
                        if (heVar != null && heVar.getVisibility() == 0) {
                            f10 = 44.0f;
                            RectF rectF = org.telegram.messenger.g0.P;
                            heVar.f(rectF);
                            heVar.getLocationInWindow(iArr2);
                            getLocationInWindow(iArr);
                            float f16 = (iArr2[0] - iArr[0]) + rectF.left;
                            if (f16 > org.telegram.messenger.g0.L(120.0f)) {
                                width = f16 - org.telegram.messenger.g0.L(6.0f);
                            }
                        } else {
                            f10 = 44.0f;
                        }
                        float f17 = 22.0f;
                        if (chatActivityEnterView.E1 == null && chatActivityEnterView.D1 != null) {
                            jh.f r02 = chatActivityEnterView.r0();
                            if (r02 != null && (gVar2 = r02.h) != null) {
                                aVar = gVar2.f11354w;
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                fh.g c10 = chatActivityEnterView.D1.c(this, aVar, false);
                                chatActivityEnterView.E1 = c10;
                                c10.r(org.telegram.messenger.g0.L(22.0f));
                                fh.g c11 = chatActivityEnterView.D1.c(this, aVar, false);
                                chatActivityEnterView.F1 = c11;
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
                                    gVar = chatActivityEnterView.E1;
                                } else {
                                    gVar = chatActivityEnterView.F1;
                                }
                                if (gVar != null) {
                                    gVar.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    gVar.setAlpha((int) (f11 * 255.0f));
                                    gVar.draw(canvas);
                                } else {
                                    paint.setColor(org.telegram.ui.ActionBar.j6.r1(f11, chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.Je)));
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
        he heVar;
        float x10;
        switch (this.f39997a) {
            case 2:
                if (motionEvent.getAction() != 10) {
                    float x11 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    for (int i7 = 0; i7 < getChildCount(); i7++) {
                        View childAt = getChildAt(i7);
                        if (childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f) {
                            float x12 = childAt.getX() + childAt.getWidth();
                            if (childAt == this.f39998b.K0) {
                                x10 = x12 - heVar.l();
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
        switch (this.f39997a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f39998b;
                ki.o3 o3Var = chatActivityEnterView.f32233l0;
                if (o3Var != null && o3Var.getVisibility() == 0) {
                    return chatActivityEnterView.f32233l0.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f39998b;
                if (chatActivityEnterView2.K && chatActivityEnterView2.M6 != 2) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
        }
    }

    @Override
    public boolean drawChild(final Canvas canvas, final View view, final long j3) {
        switch (this.f39997a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.f39998b;
                if (view != null && view == chatActivityEnterView.F0) {
                    return chatActivityEnterView.l0(canvas, new org.telegram.messenger.r10() {
                        @Override
                        public final Object run() {
                            Boolean valueOf;
                            valueOf = Boolean.valueOf(super/*android.widget.FrameLayout*/.drawChild(canvas, view, j3));
                            return valueOf;
                        }
                    });
                }
                if (chatActivityEnterView.R5 && view == chatActivityEnterView.f32193f1) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = this.f39998b;
                if (view == chatActivityEnterView2.K0 && chatActivityEnterView2.f32213i0) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f39997a) {
            case 3:
                if (!this.f39998b.C1 && super.hasOverlappingRendering()) {
                    return true;
                }
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f39997a) {
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                ChatActivityEnterView chatActivityEnterView = this.f39998b;
                if (!chatActivityEnterView.C0.isEmpty()) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        View childAt = getChildAt(i13);
                        Float f10 = (Float) chatActivityEnterView.C0.get(childAt);
                        if (f10 != null) {
                            childAt.setTranslationX(f10.floatValue() - childAt.getLeft());
                            childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(er.f34420f).start();
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
        switch (this.f39997a) {
            case 1:
                super.onMeasure(i7, i10);
                int max = Math.max(org.telegram.messenger.g0.L(44.0f), getMeasuredHeight());
                ChatActivityEnterView chatActivityEnterView = this.f39998b;
                te.c cVar = chatActivityEnterView.E6;
                float f10 = cVar.f57087f;
                if (f10 > 0.0f) {
                    if (cVar.h) {
                        f10 = cVar.f57088g;
                    }
                    float f11 = max;
                    if (f10 != f11) {
                        cVar.d = chatActivityEnterView.s0();
                        cVar.f57086e = 0L;
                        er erVar = pi.k.V;
                        if (chatActivityEnterView.f32325y1 > 0 && SystemClock.uptimeMillis() < chatActivityEnterView.f32325y1 && (r12 = chatActivityEnterView.f32332z1) != 0) {
                            erVar = r12;
                        }
                        cVar.f57085c = erVar;
                    }
                    cVar.a(f11);
                } else {
                    cVar.c(max);
                }
                chatActivityEnterView.Q();
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f39997a) {
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
        switch (this.f39997a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.f39998b;
                if (chatActivityEnterView.K && chatActivityEnterView.M6 != 2) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f39997a) {
            case 3:
                super.setVisibility(i7);
                this.f39998b.j2(true);
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }
}
