package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.PhotoViewer;
public final class h20 extends View implements GestureDetector.OnGestureListener {
    public float E;
    public float F;
    public int G;
    public long H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public final Scroller O;
    public final GestureDetector P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public boolean V;
    public boolean W;
    public final Paint f34268a;
    public g20 f34269a0;
    public final ArrayList f34270b;
    public ValueAnimator f34271b0;
    public final ArrayList f34272c;
    public ValueAnimator f34273c0;
    public final ArrayList d;
    public float f34274d0;
    public final ArrayList f34275e;
    public int f34276f;
    public long h;
    public final int f34277n;
    public final int f34278r;
    public final int f34279s;
    public final int f34280w;
    public int f34281x;
    public float f34282y;

    public h20(ContextThemeWrapper contextThemeWrapper, int i3) {
        super(contextThemeWrapper);
        Paint paint = new Paint();
        this.f34268a = paint;
        this.f34270b = new ArrayList();
        this.f34272c = new ArrayList();
        this.d = new ArrayList();
        this.f34275e = new ArrayList();
        this.E = 1.0f;
        this.F = 0.0f;
        this.M = -1;
        this.T = true;
        this.U = -1;
        this.W = true;
        this.P = new GestureDetector(contextThemeWrapper, this);
        this.O = new Scroller(contextThemeWrapper);
        this.f34277n = org.telegram.messenger.g0.L(42.0f);
        this.f34278r = org.telegram.messenger.g0.L(56.0f);
        this.f34280w = org.telegram.messenger.g0.L(1.0f);
        this.f34279s = i3;
        paint.setColor(2130706432);
    }

    private ImageReceiver getFreeReceiver() {
        ImageReceiver imageReceiver;
        ArrayList arrayList = this.f34270b;
        if (arrayList.isEmpty()) {
            imageReceiver = new ImageReceiver(this);
            imageReceiver.A1 = false;
        } else {
            arrayList.remove(0);
            imageReceiver = (ImageReceiver) arrayList.get(0);
        }
        this.f34272c.add(imageReceiver);
        imageReceiver.d = ((org.telegram.ui.ko0) this.f34269a0).f46994a.U;
        return imageReceiver;
    }

    private int getMaxScrollX() {
        return ((this.f34280w * 2) + this.f34277n) * this.f34276f;
    }

    private int getMinScrollX() {
        return ((this.f34280w * 2) + this.f34277n) * (-((this.d.size() - this.f34276f) - 1));
    }

    public final void a(int i3, boolean z10) {
        int i10;
        int i11;
        Object obj;
        Object obj2;
        ArrayList arrayList = this.f34270b;
        ArrayList arrayList2 = this.f34272c;
        if (!z10 && !arrayList2.isEmpty()) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.I = false;
            this.f34282y = 1.0f;
            this.E = 1.0f;
            this.F = 0.0f;
        }
        invalidate();
        if (getMeasuredWidth() != 0) {
            ArrayList arrayList3 = this.d;
            if (!arrayList3.isEmpty()) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f34277n;
                int measuredWidth2 = (getMeasuredWidth() / 2) - (i12 / 2);
                int i13 = this.f34280w;
                if (z10) {
                    int size = arrayList2.size();
                    int i14 = 0;
                    i10 = Integer.MIN_VALUE;
                    i11 = Integer.MAX_VALUE;
                    while (i14 < size) {
                        ImageReceiver imageReceiver = (ImageReceiver) arrayList2.get(i14);
                        int i15 = imageReceiver.f21241f;
                        int i16 = ((i12 + i13) * (i15 - this.f34276f)) + measuredWidth2 + i3;
                        if (i16 > measuredWidth || i16 + i12 < 0) {
                            arrayList.add(imageReceiver);
                            arrayList2.remove(i14);
                            size--;
                            i14--;
                        }
                        i11 = Math.min(i11, i15 - 1);
                        i10 = Math.max(i10, i15 + 1);
                        i14++;
                    }
                } else {
                    i10 = this.f34276f;
                    i11 = i10 - 1;
                }
                int i17 = this.f34278r;
                int i18 = this.f34279s;
                ArrayList arrayList4 = this.f34275e;
                if (i10 != Integer.MIN_VALUE) {
                    int size2 = arrayList3.size();
                    while (i10 < size2) {
                        int i19 = ((i12 + i13) * (i10 - this.f34276f)) + measuredWidth2 + i3;
                        if (i19 >= measuredWidth) {
                            break;
                        }
                        org.telegram.messenger.ac acVar = (org.telegram.messenger.ac) arrayList3.get(i10);
                        ImageReceiver freeReceiver = getFreeReceiver();
                        int i20 = measuredWidth;
                        int i21 = measuredWidth2;
                        freeReceiver.y0(i19, i18, i12, i17);
                        if (arrayList4.get(0) instanceof org.telegram.messenger.zi) {
                            obj2 = arrayList4.get(i10);
                        } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                            org.telegram.ui.hq0 hq0Var = ((org.telegram.ui.ko0) this.f34269a0).f46994a.f41468k7;
                            if (hq0Var != null) {
                                obj2 = hq0Var.g();
                            } else {
                                obj2 = null;
                            }
                        } else {
                            obj2 = "avatar_" + ((org.telegram.ui.ko0) this.f34269a0).f46994a.A5;
                        }
                        freeReceiver.r0(null, null, acVar, "80_80", null, 0L, null, obj2, 1);
                        freeReceiver.f21241f = i10;
                        i10++;
                        measuredWidth = i20;
                        measuredWidth2 = i21;
                    }
                }
                int i22 = measuredWidth2;
                if (i11 != Integer.MAX_VALUE) {
                    while (i11 >= 0) {
                        int i23 = ((i12 + i13) * (i11 - this.f34276f)) + i22 + i3 + i12;
                        if (i23 <= 0) {
                            break;
                        }
                        org.telegram.messenger.ac acVar2 = (org.telegram.messenger.ac) arrayList3.get(i11);
                        ImageReceiver freeReceiver2 = getFreeReceiver();
                        freeReceiver2.y0(i23, i18, i12, i17);
                        if (arrayList4.get(0) instanceof org.telegram.messenger.zi) {
                            obj = arrayList4.get(i11);
                        } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                            org.telegram.ui.hq0 hq0Var2 = ((org.telegram.ui.ko0) this.f34269a0).f46994a.f41468k7;
                            if (hq0Var2 != null) {
                                obj = hq0Var2.g();
                            } else {
                                obj = null;
                            }
                        } else {
                            obj = "avatar_" + ((org.telegram.ui.ko0) this.f34269a0).f46994a.A5;
                        }
                        freeReceiver2.r0(null, null, acVar2, "80_80", null, 0L, null, obj, 1);
                        freeReceiver2.f21241f = i11;
                        i11--;
                    }
                }
                ValueAnimator valueAnimator = this.f34271b0;
                if (valueAnimator != null && !valueAnimator.isStarted()) {
                    this.f34271b0.start();
                }
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h20.b():void");
    }

    public final boolean c() {
        if (this.V && this.f34273c0 == null) {
            if (this.f34274d0 <= 0.0f && this.W) {
                ValueAnimator valueAnimator = this.f34271b0;
                if (valueAnimator != null && valueAnimator.isStarted()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void d() {
        this.V = false;
        if (this.T) {
            this.f34274d0 = 0.0f;
        }
    }

    public final void e() {
        this.Q = false;
        Scroller scroller = this.O;
        if (!scroller.isFinished()) {
            scroller.abortAnimation();
        }
        int i3 = this.U;
        if (i3 >= 0 && i3 < this.f34275e.size()) {
            this.R = true;
            this.N = false;
            int i10 = this.U;
            this.M = i10;
            this.G = i10;
            this.K = (this.f34277n + this.f34280w) * (this.f34276f - i10);
            this.L = this.f34281x;
            this.f34282y = 1.0f;
            this.U = -1;
            g20 g20Var = this.f34269a0;
            if (g20Var != null) {
                PhotoViewer photoViewer = ((org.telegram.ui.ko0) g20Var).f46994a;
                if (PhotoViewer.U2(photoViewer.U4)) {
                    photoViewer.Z2 = true;
                    photoViewer.X1(true);
                    photoViewer.C0(0, true);
                }
            }
        }
        invalidate();
    }

    public final void f() {
        int i3;
        List list;
        int i10;
        int i11;
        int i12 = this.f34281x;
        int abs = Math.abs(i12);
        int i13 = this.f34277n;
        int i14 = this.f34280w;
        int i15 = (i13 / 2) + i14;
        int i16 = -1;
        if (abs > i15) {
            if (i12 > 0) {
                i10 = i12 - i15;
                i11 = 1;
            } else {
                i10 = i12 + i15;
                i11 = -1;
            }
            i3 = (i10 / ((i14 * 2) + i13)) + i11;
        } else {
            i3 = 0;
        }
        this.U = this.f34276f - i3;
        PhotoViewer photoViewer = ((org.telegram.ui.ko0) this.f34269a0).f46994a;
        int i17 = photoViewer.Q4;
        ArrayList arrayList = photoViewer.f41389b7;
        ArrayList arrayList2 = photoViewer.Z6;
        org.telegram.ui.hq0 hq0Var = photoViewer.f41468k7;
        if (hq0Var != null) {
            list = hq0Var.getAll();
        } else {
            list = null;
        }
        int i18 = this.U;
        if (i17 != i18 && i18 >= 0 && i18 < this.d.size()) {
            Object obj = this.f34275e.get(this.U);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i16 = arrayList2.indexOf((org.telegram.messenger.zi) obj);
            } else if (list != null && !list.isEmpty()) {
                i16 = list.indexOf((TL_iv.PageBlock) obj);
            } else if (arrayList != null && !arrayList.isEmpty()) {
                i16 = arrayList.indexOf((org.telegram.messenger.ac) obj);
            }
            if (i16 >= 0) {
                this.S = true;
                ((org.telegram.ui.ko0) this.f34269a0).a(i16);
            }
        }
        if (!this.Q) {
            this.Q = true;
            this.R = false;
        }
        a(this.f34281x, true);
    }

    public int getCount() {
        return this.d.size();
    }

    public int getIndex() {
        return this.f34276f;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.O;
        if (!scroller.isFinished()) {
            scroller.abortAnimation();
        }
        this.M = -1;
        this.N = false;
        return true;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        int i10;
        int i11;
        float f10;
        float interpolation;
        int i12;
        int i13;
        int i14;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z10 = this.V;
        ArrayList arrayList = this.f34272c;
        if (z10 || !arrayList.isEmpty()) {
            float f11 = this.f34274d0;
            if (!this.W) {
                if (this.V) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
            }
            Paint paint = this.f34268a;
            paint.setAlpha((int) (f11 * 127.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i15 = this.f34281x;
                int i16 = this.f34277n;
                float f12 = i16;
                int i17 = (int) (f12 * 2.0f);
                int L = org.telegram.messenger.g0.L(8.0f);
                int i18 = this.f34276f;
                ArrayList arrayList2 = this.d;
                org.telegram.messenger.ac acVar = (org.telegram.messenger.ac) arrayList2.get(i18);
                int i19 = this.f34278r;
                if (acVar != null && (photoSize2 = acVar.f21492k) != null) {
                    i3 = Math.max(i16, (int) ((i19 / photoSize2.h) * photoSize2.f27026w));
                } else {
                    i3 = i19;
                }
                int min = Math.min(i17, i3);
                float f13 = L * 2;
                float f14 = this.E;
                int i20 = ((int) ((min - i16) * f14)) + i16 + ((int) (f13 * f14));
                int i21 = this.G;
                if (i21 >= 0 && i21 < arrayList2.size()) {
                    org.telegram.messenger.ac acVar2 = (org.telegram.messenger.ac) arrayList2.get(this.G);
                    if (acVar2 != null && (photoSize = acVar2.f21492k) != null) {
                        i19 = Math.max(i16, (int) ((i19 / photoSize.h) * photoSize.f27026w));
                    }
                } else {
                    i19 = i16;
                }
                int min2 = Math.min(i17, i19);
                float f15 = this.F;
                int i22 = (int) (f13 * f15);
                float f16 = i15;
                float f17 = (((min2 + i22) - i16) / 2) * f15;
                if (this.G > this.f34276f) {
                    i11 = -1;
                } else {
                    i11 = 1;
                }
                int i23 = (int) ((f17 * i11) + f16);
                int i24 = ((int) ((min2 - i16) * f15)) + i16 + i22;
                int measuredWidth = (getMeasuredWidth() - i20) / 2;
                int i25 = 0;
                while (i25 < size) {
                    ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i25);
                    int i26 = imageReceiver.f21241f;
                    int i27 = this.f34276f;
                    if (i26 == i27) {
                        imageReceiver.L0 = (i10 / 2) + measuredWidth + i23;
                        imageReceiver.N0 = i20 - i10;
                        i14 = size;
                    } else {
                        int i28 = this.G;
                        i14 = size;
                        int i29 = this.f34280w;
                        if (i28 < i27) {
                            if (i26 < i27) {
                                if (i26 <= i28) {
                                    imageReceiver.L0 = ((((i16 + i29) * ((i26 - i27) + 1)) + measuredWidth) - (i29 + i24)) + i23;
                                } else {
                                    imageReceiver.L0 = ((i29 + i16) * (i26 - i27)) + measuredWidth + i23;
                                }
                            } else {
                                imageReceiver.L0 = ((i29 + i16) * ((i26 - i27) - 1)) + measuredWidth + i20 + i29 + i23;
                            }
                        } else if (i26 < i27) {
                            imageReceiver.L0 = ((i29 + i16) * (i26 - i27)) + measuredWidth + i23;
                        } else if (i26 <= i28) {
                            imageReceiver.L0 = ((i29 + i16) * ((i26 - i27) - 1)) + measuredWidth + i20 + i29 + i23;
                        } else {
                            imageReceiver.L0 = i29 + i24 + ((i16 + i29) * ((i26 - i27) - 2)) + measuredWidth + i20 + i29 + i23;
                        }
                        if (i26 == i28) {
                            imageReceiver.N0 = i24 - i22;
                            imageReceiver.L0 = (int) (imageReceiver.L0 + (i22 / 2));
                        } else {
                            imageReceiver.N0 = f12;
                        }
                    }
                    imageReceiver.setAlpha(this.f34274d0);
                    imageReceiver.J0(org.telegram.messenger.g0.L(2.0f));
                    imageReceiver.h(canvas, null);
                    i25++;
                    size = i14;
                }
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - this.H;
                if (j10 > 17) {
                    j10 = 17;
                }
                this.H = currentTimeMillis;
                int i30 = this.M;
                if (i30 >= 0) {
                    float f18 = this.f34282y;
                    if (f18 > 0.0f) {
                        float f19 = (float) j10;
                        if (this.N) {
                            f10 = 100.0f;
                        } else {
                            f10 = 200.0f;
                        }
                        float f20 = f18 - (f19 / f10);
                        this.f34282y = f20;
                        if (i30 == this.f34276f) {
                            float f21 = this.E;
                            if (f21 < 1.0f) {
                                float f22 = (f19 / 200.0f) + f21;
                                this.E = f22;
                                if (f22 > 1.0f) {
                                    this.E = 1.0f;
                                }
                            }
                            this.f34281x = this.L + ((int) Math.ceil(this.E * (this.K - i13)));
                        } else {
                            xq xqVar = xq.f40453g;
                            this.F = xqVar.getInterpolation(1.0f - f20);
                            if (this.R) {
                                float f23 = this.E;
                                if (f23 > 0.0f) {
                                    float f24 = f23 - (f19 / 200.0f);
                                    this.E = f24;
                                    if (f24 < 0.0f) {
                                        this.E = 0.0f;
                                    }
                                }
                                this.f34281x = this.L + ((int) Math.ceil(interpolation * (this.K - i12)));
                            } else {
                                this.E = xqVar.getInterpolation(this.f34282y);
                                this.f34281x = (int) Math.ceil(this.F * this.K);
                            }
                        }
                        if (this.f34282y <= 0.0f) {
                            this.f34276f = this.M;
                            this.f34282y = 1.0f;
                            this.E = 1.0f;
                            this.F = 0.0f;
                            this.I = false;
                            this.R = false;
                            this.f34281x = 0;
                            this.M = -1;
                            this.N = false;
                        }
                    }
                    a(this.f34281x, true);
                    invalidate();
                }
                if (this.Q) {
                    float f25 = this.E;
                    if (f25 > 0.0f) {
                        float f26 = f25 - (((float) j10) / 200.0f);
                        this.E = f26;
                        if (f26 < 0.0f) {
                            this.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                Scroller scroller = this.O;
                if (!scroller.isFinished()) {
                    if (scroller.computeScrollOffset()) {
                        this.f34281x = scroller.getCurrX();
                        f();
                        invalidate();
                    }
                    if (scroller.isFinished()) {
                        e();
                    }
                }
            }
        }
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        Scroller scroller = this.O;
        scroller.abortAnimation();
        if (this.d.size() >= 10) {
            scroller.fling(this.f34281x, 0, Math.round(f10), 0, getMinScrollX(), getMaxScrollX(), 0, 0);
            return false;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        a(0, false);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f34281x = (int) (this.f34281x - f10);
        int minScrollX = getMinScrollX();
        int maxScrollX = getMaxScrollX();
        int i3 = this.f34281x;
        if (i3 < minScrollX) {
            this.f34281x = minScrollX;
        } else if (i3 > maxScrollX) {
            this.f34281x = maxScrollX;
        }
        f();
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        List list;
        PhotoViewer photoViewer = ((org.telegram.ui.ko0) this.f34269a0).f46994a;
        int i3 = photoViewer.Q4;
        ArrayList arrayList = photoViewer.f41389b7;
        ArrayList arrayList2 = photoViewer.Z6;
        org.telegram.ui.hq0 hq0Var = photoViewer.f41468k7;
        if (hq0Var != null) {
            list = hq0Var.getAll();
        } else {
            list = null;
        }
        e();
        ArrayList arrayList3 = this.f34272c;
        int size = arrayList3.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            ImageReceiver imageReceiver = (ImageReceiver) arrayList3.get(i10);
            if (imageReceiver.O(motionEvent.getX(), motionEvent.getY())) {
                int i11 = imageReceiver.f21241f;
                if (i11 >= 0) {
                    ArrayList arrayList4 = this.f34275e;
                    if (i11 < arrayList4.size()) {
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            int indexOf = arrayList2.indexOf((org.telegram.messenger.zi) arrayList4.get(i11));
                            if (i3 != indexOf) {
                                this.f34282y = 1.0f;
                                this.J = true;
                                ((org.telegram.ui.ko0) this.f34269a0).a(indexOf);
                                return false;
                            }
                        } else if (list != null && !list.isEmpty()) {
                            int indexOf2 = list.indexOf((TL_iv.PageBlock) arrayList4.get(i11));
                            if (i3 != indexOf2) {
                                this.f34282y = 1.0f;
                                this.J = true;
                                ((org.telegram.ui.ko0) this.f34269a0).a(indexOf2);
                                return false;
                            }
                        } else if (arrayList != null && !arrayList.isEmpty()) {
                            int indexOf3 = arrayList.indexOf((org.telegram.messenger.ac) arrayList4.get(i11));
                            if (i3 != indexOf3) {
                                this.f34282y = 1.0f;
                                this.J = true;
                                ((org.telegram.ui.ko0) this.f34269a0).a(indexOf3);
                                return false;
                            }
                        }
                    }
                }
                return true;
            }
            i10++;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        if (!this.d.isEmpty() && getAlpha() == 1.0f) {
            if (this.P.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent)) {
                z10 = true;
            }
            if (this.Q && motionEvent.getAction() == 1 && this.O.isFinished()) {
                e();
            }
        }
        return z10;
    }

    public void setAnimateBackground(boolean z10) {
        this.W = z10;
    }

    public void setAnimationsEnabled(boolean z10) {
        if (this.T != z10) {
            this.T = z10;
            if (!z10) {
                ValueAnimator valueAnimator = this.f34271b0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f34271b0 = null;
                }
                ValueAnimator valueAnimator2 = this.f34273c0;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f34273c0 = null;
                }
                this.f34274d0 = 0.0f;
                invalidate();
            }
        }
    }

    public void setDelegate(g20 g20Var) {
        this.f34269a0 = g20Var;
    }

    public void setMoveProgress(float f10) {
        boolean z10;
        if (!this.Q && this.M < 0) {
            int i3 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i3 > 0) {
                this.G = this.f34276f - 1;
            } else {
                this.G = this.f34276f + 1;
            }
            int i10 = this.G;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                this.E = 1.0f - Math.abs(f10);
            } else {
                this.E = 1.0f;
            }
            this.F = 1.0f - this.E;
            if (i3 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.I = z10;
            invalidate();
            if (!arrayList.isEmpty()) {
                if (f10 >= 0.0f || this.f34276f != arrayList.size() - 1) {
                    if (i3 <= 0 || this.f34276f != 0) {
                        int i11 = (int) (f10 * (this.f34277n + this.f34280w));
                        this.f34281x = i11;
                        a(i11, true);
                    }
                }
            }
        }
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
