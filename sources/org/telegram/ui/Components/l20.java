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
public final class l20 extends View implements GestureDetector.OnGestureListener {
    public float D;
    public float E;
    public int F;
    public long G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final Scroller N;
    public final GestureDetector O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public boolean V;
    public k20 W;
    public final Paint f35479a;
    public ValueAnimator f35480a0;
    public final ArrayList f35481b;
    public ValueAnimator f35482b0;
    public final ArrayList f35483c;
    public float f35484c0;
    public final ArrayList d;
    public final ArrayList f35485e;
    public int f35486f;
    public long h;
    public final int f35487n;
    public final int f35488r;
    public final int f35489s;
    public final int f35490w;
    public int f35491x;
    public float f35492y;

    public l20(ContextThemeWrapper contextThemeWrapper, int i7) {
        super(contextThemeWrapper);
        Paint paint = new Paint();
        this.f35479a = paint;
        this.f35481b = new ArrayList();
        this.f35483c = new ArrayList();
        this.d = new ArrayList();
        this.f35485e = new ArrayList();
        this.D = 1.0f;
        this.E = 0.0f;
        this.L = -1;
        this.S = true;
        this.T = -1;
        this.V = true;
        this.O = new GestureDetector(contextThemeWrapper, this);
        this.N = new Scroller(contextThemeWrapper);
        this.f35487n = org.telegram.messenger.g0.L(42.0f);
        this.f35488r = org.telegram.messenger.g0.L(56.0f);
        this.f35490w = org.telegram.messenger.g0.L(1.0f);
        this.f35489s = i7;
        paint.setColor(2130706432);
    }

    private ImageReceiver getFreeReceiver() {
        ImageReceiver imageReceiver;
        ArrayList arrayList = this.f35481b;
        if (arrayList.isEmpty()) {
            imageReceiver = new ImageReceiver(this);
            imageReceiver.f21233z1 = false;
        } else {
            arrayList.remove(0);
            imageReceiver = (ImageReceiver) arrayList.get(0);
        }
        this.f35483c.add(imageReceiver);
        imageReceiver.d = ((org.telegram.ui.so0) this.W).f49787a.T;
        return imageReceiver;
    }

    private int getMaxScrollX() {
        return ((this.f35490w * 2) + this.f35487n) * this.f35486f;
    }

    private int getMinScrollX() {
        return ((this.f35490w * 2) + this.f35487n) * (-((this.d.size() - this.f35486f) - 1));
    }

    public final void a(int i7, boolean z9) {
        int i10;
        int i11;
        Object obj;
        Object obj2;
        ArrayList arrayList = this.f35481b;
        ArrayList arrayList2 = this.f35483c;
        if (!z9 && !arrayList2.isEmpty()) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.H = false;
            this.f35492y = 1.0f;
            this.D = 1.0f;
            this.E = 0.0f;
        }
        invalidate();
        if (getMeasuredWidth() != 0) {
            ArrayList arrayList3 = this.d;
            if (!arrayList3.isEmpty()) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f35487n;
                int measuredWidth2 = (getMeasuredWidth() / 2) - (i12 / 2);
                int i13 = this.f35490w;
                if (z9) {
                    int size = arrayList2.size();
                    int i14 = 0;
                    i10 = Integer.MIN_VALUE;
                    i11 = Integer.MAX_VALUE;
                    while (i14 < size) {
                        ImageReceiver imageReceiver = (ImageReceiver) arrayList2.get(i14);
                        int i15 = imageReceiver.f21188f;
                        int i16 = ((i12 + i13) * (i15 - this.f35486f)) + measuredWidth2 + i7;
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
                    i10 = this.f35486f;
                    i11 = i10 - 1;
                }
                int i17 = this.f35488r;
                int i18 = this.f35489s;
                ArrayList arrayList4 = this.f35485e;
                if (i10 != Integer.MIN_VALUE) {
                    int size2 = arrayList3.size();
                    while (i10 < size2) {
                        int i19 = ((i12 + i13) * (i10 - this.f35486f)) + measuredWidth2 + i7;
                        if (i19 >= measuredWidth) {
                            break;
                        }
                        org.telegram.messenger.hc hcVar = (org.telegram.messenger.hc) arrayList3.get(i10);
                        ImageReceiver freeReceiver = getFreeReceiver();
                        int i20 = measuredWidth;
                        int i21 = measuredWidth2;
                        freeReceiver.y0(i19, i18, i12, i17);
                        if (arrayList4.get(0) instanceof org.telegram.messenger.ij) {
                            obj2 = arrayList4.get(i10);
                        } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                            org.telegram.ui.pq0 pq0Var = ((org.telegram.ui.so0) this.W).f49787a.i7;
                            if (pq0Var != null) {
                                obj2 = pq0Var.g();
                            } else {
                                obj2 = null;
                            }
                        } else {
                            obj2 = "avatar_" + ((org.telegram.ui.so0) this.W).f49787a.f41539y5;
                        }
                        freeReceiver.r0(null, null, hcVar, "80_80", null, 0L, null, obj2, 1);
                        freeReceiver.f21188f = i10;
                        i10++;
                        measuredWidth = i20;
                        measuredWidth2 = i21;
                    }
                }
                int i22 = measuredWidth2;
                if (i11 != Integer.MAX_VALUE) {
                    while (i11 >= 0) {
                        int i23 = ((i12 + i13) * (i11 - this.f35486f)) + i22 + i7 + i12;
                        if (i23 <= 0) {
                            break;
                        }
                        org.telegram.messenger.hc hcVar2 = (org.telegram.messenger.hc) arrayList3.get(i11);
                        ImageReceiver freeReceiver2 = getFreeReceiver();
                        freeReceiver2.y0(i23, i18, i12, i17);
                        if (arrayList4.get(0) instanceof org.telegram.messenger.ij) {
                            obj = arrayList4.get(i11);
                        } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                            org.telegram.ui.pq0 pq0Var2 = ((org.telegram.ui.so0) this.W).f49787a.i7;
                            if (pq0Var2 != null) {
                                obj = pq0Var2.g();
                            } else {
                                obj = null;
                            }
                        } else {
                            obj = "avatar_" + ((org.telegram.ui.so0) this.W).f49787a.f41539y5;
                        }
                        freeReceiver2.r0(null, null, hcVar2, "80_80", null, 0L, null, obj, 1);
                        freeReceiver2.f21188f = i11;
                        i11--;
                    }
                }
                ValueAnimator valueAnimator = this.f35480a0;
                if (valueAnimator != null && !valueAnimator.isStarted()) {
                    this.f35480a0.start();
                }
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l20.b():void");
    }

    public final boolean c() {
        if (this.U && this.f35482b0 == null) {
            if (this.f35484c0 <= 0.0f && this.V) {
                ValueAnimator valueAnimator = this.f35480a0;
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
        this.U = false;
        if (this.S) {
            this.f35484c0 = 0.0f;
        }
    }

    public final void e() {
        this.P = false;
        Scroller scroller = this.N;
        if (!scroller.isFinished()) {
            scroller.abortAnimation();
        }
        int i7 = this.T;
        if (i7 >= 0 && i7 < this.f35485e.size()) {
            this.Q = true;
            this.M = false;
            int i10 = this.T;
            this.L = i10;
            this.F = i10;
            this.J = (this.f35487n + this.f35490w) * (this.f35486f - i10);
            this.K = this.f35491x;
            this.f35492y = 1.0f;
            this.T = -1;
            k20 k20Var = this.W;
            if (k20Var != null) {
                PhotoViewer photoViewer = ((org.telegram.ui.so0) k20Var).f49787a;
                if (PhotoViewer.O2(photoViewer.S4)) {
                    photoViewer.X2 = true;
                    photoViewer.S1(true);
                    photoViewer.u0(0, true);
                }
            }
        }
        invalidate();
    }

    public final void f() {
        int i7;
        List list;
        int i10;
        int i11;
        int i12 = this.f35491x;
        int abs = Math.abs(i12);
        int i13 = this.f35487n;
        int i14 = this.f35490w;
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
            i7 = (i10 / ((i14 * 2) + i13)) + i11;
        } else {
            i7 = 0;
        }
        this.T = this.f35486f - i7;
        PhotoViewer photoViewer = ((org.telegram.ui.so0) this.W).f49787a;
        int i17 = photoViewer.O4;
        ArrayList arrayList = photoViewer.Z6;
        ArrayList arrayList2 = photoViewer.X6;
        org.telegram.ui.pq0 pq0Var = photoViewer.i7;
        if (pq0Var != null) {
            list = pq0Var.getAll();
        } else {
            list = null;
        }
        int i18 = this.T;
        if (i17 != i18 && i18 >= 0 && i18 < this.d.size()) {
            Object obj = this.f35485e.get(this.T);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i16 = arrayList2.indexOf((org.telegram.messenger.ij) obj);
            } else if (list != null && !list.isEmpty()) {
                i16 = list.indexOf((TL_iv.PageBlock) obj);
            } else if (arrayList != null && !arrayList.isEmpty()) {
                i16 = arrayList.indexOf((org.telegram.messenger.hc) obj);
            }
            if (i16 >= 0) {
                this.R = true;
                ((org.telegram.ui.so0) this.W).a(i16);
            }
        }
        if (!this.P) {
            this.P = true;
            this.Q = false;
        }
        a(this.f35491x, true);
    }

    public int getCount() {
        return this.d.size();
    }

    public int getIndex() {
        return this.f35486f;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.N;
        if (!scroller.isFinished()) {
            scroller.abortAnimation();
        }
        this.L = -1;
        this.M = false;
        return true;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10;
        int i11;
        float f10;
        float interpolation;
        int i12;
        int i13;
        int i14;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z9 = this.U;
        ArrayList arrayList = this.f35483c;
        if (z9 || !arrayList.isEmpty()) {
            float f11 = this.f35484c0;
            if (!this.V) {
                if (this.U) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
            }
            Paint paint = this.f35479a;
            paint.setAlpha((int) (f11 * 127.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i15 = this.f35491x;
                int i16 = this.f35487n;
                float f12 = i16;
                int i17 = (int) (f12 * 2.0f);
                int L = org.telegram.messenger.g0.L(8.0f);
                int i18 = this.f35486f;
                ArrayList arrayList2 = this.d;
                org.telegram.messenger.hc hcVar = (org.telegram.messenger.hc) arrayList2.get(i18);
                int i19 = this.f35488r;
                if (hcVar != null && (photoSize2 = hcVar.f22860k) != null) {
                    i7 = Math.max(i16, (int) ((i19 / photoSize2.h) * photoSize2.f26977w));
                } else {
                    i7 = i19;
                }
                int min = Math.min(i17, i7);
                float f13 = L * 2;
                float f14 = this.D;
                int i20 = ((int) ((min - i16) * f14)) + i16 + ((int) (f13 * f14));
                int i21 = this.F;
                if (i21 >= 0 && i21 < arrayList2.size()) {
                    org.telegram.messenger.hc hcVar2 = (org.telegram.messenger.hc) arrayList2.get(this.F);
                    if (hcVar2 != null && (photoSize = hcVar2.f22860k) != null) {
                        i19 = Math.max(i16, (int) ((i19 / photoSize.h) * photoSize.f26977w));
                    }
                } else {
                    i19 = i16;
                }
                int min2 = Math.min(i17, i19);
                float f15 = this.E;
                int i22 = (int) (f13 * f15);
                float f16 = i15;
                float f17 = (((min2 + i22) - i16) / 2) * f15;
                if (this.F > this.f35486f) {
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
                    int i26 = imageReceiver.f21188f;
                    int i27 = this.f35486f;
                    if (i26 == i27) {
                        imageReceiver.K0 = (i10 / 2) + measuredWidth + i23;
                        imageReceiver.M0 = i20 - i10;
                        i14 = size;
                    } else {
                        int i28 = this.F;
                        i14 = size;
                        int i29 = this.f35490w;
                        if (i28 < i27) {
                            if (i26 < i27) {
                                if (i26 <= i28) {
                                    imageReceiver.K0 = ((((i16 + i29) * ((i26 - i27) + 1)) + measuredWidth) - (i29 + i24)) + i23;
                                } else {
                                    imageReceiver.K0 = ((i29 + i16) * (i26 - i27)) + measuredWidth + i23;
                                }
                            } else {
                                imageReceiver.K0 = ((i29 + i16) * ((i26 - i27) - 1)) + measuredWidth + i20 + i29 + i23;
                            }
                        } else if (i26 < i27) {
                            imageReceiver.K0 = ((i29 + i16) * (i26 - i27)) + measuredWidth + i23;
                        } else if (i26 <= i28) {
                            imageReceiver.K0 = ((i29 + i16) * ((i26 - i27) - 1)) + measuredWidth + i20 + i29 + i23;
                        } else {
                            imageReceiver.K0 = i29 + i24 + ((i16 + i29) * ((i26 - i27) - 2)) + measuredWidth + i20 + i29 + i23;
                        }
                        if (i26 == i28) {
                            imageReceiver.M0 = i24 - i22;
                            imageReceiver.K0 = (int) (imageReceiver.K0 + (i22 / 2));
                        } else {
                            imageReceiver.M0 = f12;
                        }
                    }
                    imageReceiver.setAlpha(this.f35484c0);
                    imageReceiver.J0(org.telegram.messenger.g0.L(2.0f));
                    imageReceiver.h(canvas, null);
                    i25++;
                    size = i14;
                }
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = currentTimeMillis - this.G;
                if (j3 > 17) {
                    j3 = 17;
                }
                this.G = currentTimeMillis;
                int i30 = this.L;
                if (i30 >= 0) {
                    float f18 = this.f35492y;
                    if (f18 > 0.0f) {
                        float f19 = (float) j3;
                        if (this.M) {
                            f10 = 100.0f;
                        } else {
                            f10 = 200.0f;
                        }
                        float f20 = f18 - (f19 / f10);
                        this.f35492y = f20;
                        if (i30 == this.f35486f) {
                            float f21 = this.D;
                            if (f21 < 1.0f) {
                                float f22 = (f19 / 200.0f) + f21;
                                this.D = f22;
                                if (f22 > 1.0f) {
                                    this.D = 1.0f;
                                }
                            }
                            this.f35491x = this.K + ((int) Math.ceil(this.D * (this.J - i13)));
                        } else {
                            xq xqVar = xq.f40311g;
                            this.E = xqVar.getInterpolation(1.0f - f20);
                            if (this.Q) {
                                float f23 = this.D;
                                if (f23 > 0.0f) {
                                    float f24 = f23 - (f19 / 200.0f);
                                    this.D = f24;
                                    if (f24 < 0.0f) {
                                        this.D = 0.0f;
                                    }
                                }
                                this.f35491x = this.K + ((int) Math.ceil(interpolation * (this.J - i12)));
                            } else {
                                this.D = xqVar.getInterpolation(this.f35492y);
                                this.f35491x = (int) Math.ceil(this.E * this.J);
                            }
                        }
                        if (this.f35492y <= 0.0f) {
                            this.f35486f = this.L;
                            this.f35492y = 1.0f;
                            this.D = 1.0f;
                            this.E = 0.0f;
                            this.H = false;
                            this.Q = false;
                            this.f35491x = 0;
                            this.L = -1;
                            this.M = false;
                        }
                    }
                    a(this.f35491x, true);
                    invalidate();
                }
                if (this.P) {
                    float f25 = this.D;
                    if (f25 > 0.0f) {
                        float f26 = f25 - (((float) j3) / 200.0f);
                        this.D = f26;
                        if (f26 < 0.0f) {
                            this.D = 0.0f;
                        }
                        invalidate();
                    }
                }
                Scroller scroller = this.N;
                if (!scroller.isFinished()) {
                    if (scroller.computeScrollOffset()) {
                        this.f35491x = scroller.getCurrX();
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
        Scroller scroller = this.N;
        scroller.abortAnimation();
        if (this.d.size() >= 10) {
            scroller.fling(this.f35491x, 0, Math.round(f10), 0, getMinScrollX(), getMaxScrollX(), 0, 0);
            return false;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        a(0, false);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f35491x = (int) (this.f35491x - f10);
        int minScrollX = getMinScrollX();
        int maxScrollX = getMaxScrollX();
        int i7 = this.f35491x;
        if (i7 < minScrollX) {
            this.f35491x = minScrollX;
        } else if (i7 > maxScrollX) {
            this.f35491x = maxScrollX;
        }
        f();
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        List list;
        PhotoViewer photoViewer = ((org.telegram.ui.so0) this.W).f49787a;
        int i7 = photoViewer.O4;
        ArrayList arrayList = photoViewer.Z6;
        ArrayList arrayList2 = photoViewer.X6;
        org.telegram.ui.pq0 pq0Var = photoViewer.i7;
        if (pq0Var != null) {
            list = pq0Var.getAll();
        } else {
            list = null;
        }
        e();
        ArrayList arrayList3 = this.f35483c;
        int size = arrayList3.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            ImageReceiver imageReceiver = (ImageReceiver) arrayList3.get(i10);
            if (imageReceiver.O(motionEvent.getX(), motionEvent.getY())) {
                int i11 = imageReceiver.f21188f;
                if (i11 >= 0) {
                    ArrayList arrayList4 = this.f35485e;
                    if (i11 < arrayList4.size()) {
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            int indexOf = arrayList2.indexOf((org.telegram.messenger.ij) arrayList4.get(i11));
                            if (i7 != indexOf) {
                                this.f35492y = 1.0f;
                                this.I = true;
                                ((org.telegram.ui.so0) this.W).a(indexOf);
                                return false;
                            }
                        } else if (list != null && !list.isEmpty()) {
                            int indexOf2 = list.indexOf((TL_iv.PageBlock) arrayList4.get(i11));
                            if (i7 != indexOf2) {
                                this.f35492y = 1.0f;
                                this.I = true;
                                ((org.telegram.ui.so0) this.W).a(indexOf2);
                                return false;
                            }
                        } else if (arrayList != null && !arrayList.isEmpty()) {
                            int indexOf3 = arrayList.indexOf((org.telegram.messenger.hc) arrayList4.get(i11));
                            if (i7 != indexOf3) {
                                this.f35492y = 1.0f;
                                this.I = true;
                                ((org.telegram.ui.so0) this.W).a(indexOf3);
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
        boolean z9 = false;
        if (!this.d.isEmpty() && getAlpha() == 1.0f) {
            if (this.O.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent)) {
                z9 = true;
            }
            if (this.P && motionEvent.getAction() == 1 && this.N.isFinished()) {
                e();
            }
        }
        return z9;
    }

    public void setAnimateBackground(boolean z9) {
        this.V = z9;
    }

    public void setAnimationsEnabled(boolean z9) {
        if (this.S != z9) {
            this.S = z9;
            if (!z9) {
                ValueAnimator valueAnimator = this.f35480a0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f35480a0 = null;
                }
                ValueAnimator valueAnimator2 = this.f35482b0;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f35482b0 = null;
                }
                this.f35484c0 = 0.0f;
                invalidate();
            }
        }
    }

    public void setDelegate(k20 k20Var) {
        this.W = k20Var;
    }

    public void setMoveProgress(float f10) {
        boolean z9;
        if (!this.P && this.L < 0) {
            int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i7 > 0) {
                this.F = this.f35486f - 1;
            } else {
                this.F = this.f35486f + 1;
            }
            int i10 = this.F;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                this.D = 1.0f - Math.abs(f10);
            } else {
                this.D = 1.0f;
            }
            this.E = 1.0f - this.D;
            if (i7 != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.H = z9;
            invalidate();
            if (!arrayList.isEmpty()) {
                if (f10 >= 0.0f || this.f35486f != arrayList.size() - 1) {
                    if (i7 <= 0 || this.f35486f != 0) {
                        int i11 = (int) (f10 * (this.f35487n + this.f35490w));
                        this.f35491x = i11;
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
