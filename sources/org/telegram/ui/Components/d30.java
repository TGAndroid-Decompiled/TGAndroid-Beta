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
public final class d30 extends View implements GestureDetector.OnGestureListener {
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
    public c30 W;
    public final Paint f25266a;
    public ValueAnimator f25267a0;
    public final ArrayList f25268b;
    public ValueAnimator f25269b0;
    public final ArrayList f25270c;
    public float f25271c0;
    public final ArrayList d;
    public final ArrayList e;
    public int f25272f;
    public long h;
    public final int f25273n;
    public final int f25274r;
    public final int f25275s;
    public final int f25276w;
    public int f25277x;
    public float f25278y;

    public d30(ContextThemeWrapper contextThemeWrapper, int i10) {
        super(contextThemeWrapper);
        Paint paint = new Paint();
        this.f25266a = paint;
        this.f25268b = new ArrayList();
        this.f25270c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.D = 1.0f;
        this.E = 0.0f;
        this.L = -1;
        this.S = true;
        this.T = -1;
        this.V = true;
        this.O = new GestureDetector(contextThemeWrapper, this);
        this.N = new Scroller(contextThemeWrapper);
        this.f25273n = org.telegram.messenger.i0.L(42.0f);
        this.f25274r = org.telegram.messenger.i0.L(56.0f);
        this.f25276w = org.telegram.messenger.i0.L(1.0f);
        this.f25275s = i10;
        paint.setColor(2130706432);
    }

    private ImageReceiver getFreeReceiver() {
        ImageReceiver imageReceiver;
        ArrayList arrayList = this.f25268b;
        if (arrayList.isEmpty()) {
            imageReceiver = new ImageReceiver(this);
            imageReceiver.f14424z1 = false;
        } else {
            arrayList.remove(0);
            imageReceiver = (ImageReceiver) arrayList.get(0);
        }
        this.f25270c.add(imageReceiver);
        imageReceiver.d = ((org.telegram.ui.dq0) this.W).f36813a.T;
        return imageReceiver;
    }

    private int getMaxScrollX() {
        return ((this.f25276w * 2) + this.f25273n) * this.f25272f;
    }

    private int getMinScrollX() {
        return ((this.f25276w * 2) + this.f25273n) * (-((this.d.size() - this.f25272f) - 1));
    }

    public final void a(int i10, boolean z10) {
        int i11;
        int i12;
        Object obj;
        Object obj2;
        ArrayList arrayList = this.f25268b;
        ArrayList arrayList2 = this.f25270c;
        if (!z10 && !arrayList2.isEmpty()) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.H = false;
            this.f25278y = 1.0f;
            this.D = 1.0f;
            this.E = 0.0f;
        }
        invalidate();
        if (getMeasuredWidth() != 0) {
            ArrayList arrayList3 = this.d;
            if (!arrayList3.isEmpty()) {
                int measuredWidth = getMeasuredWidth();
                int i13 = this.f25273n;
                int measuredWidth2 = (getMeasuredWidth() / 2) - (i13 / 2);
                int i14 = this.f25276w;
                if (z10) {
                    int size = arrayList2.size();
                    int i15 = 0;
                    i11 = Integer.MIN_VALUE;
                    i12 = Integer.MAX_VALUE;
                    while (i15 < size) {
                        ImageReceiver imageReceiver = (ImageReceiver) arrayList2.get(i15);
                        int i16 = imageReceiver.f14378f;
                        int i17 = ((i13 + i14) * (i16 - this.f25272f)) + measuredWidth2 + i10;
                        if (i17 > measuredWidth || i17 + i13 < 0) {
                            arrayList.add(imageReceiver);
                            arrayList2.remove(i15);
                            size--;
                            i15--;
                        }
                        i12 = Math.min(i12, i16 - 1);
                        i11 = Math.max(i11, i16 + 1);
                        i15++;
                    }
                } else {
                    i11 = this.f25272f;
                    i12 = i11 - 1;
                }
                int i18 = this.f25274r;
                int i19 = this.f25275s;
                ArrayList arrayList4 = this.e;
                if (i11 != Integer.MIN_VALUE) {
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        int i20 = ((i13 + i14) * (i11 - this.f25272f)) + measuredWidth2 + i10;
                        if (i20 >= measuredWidth) {
                            break;
                        }
                        org.telegram.messenger.ic icVar = (org.telegram.messenger.ic) arrayList3.get(i11);
                        ImageReceiver freeReceiver = getFreeReceiver();
                        int i21 = measuredWidth;
                        int i22 = measuredWidth2;
                        freeReceiver.y0(i20, i19, i13, i18);
                        if (arrayList4.get(0) instanceof org.telegram.messenger.jj) {
                            obj2 = arrayList4.get(i11);
                        } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                            org.telegram.ui.bs0 bs0Var = ((org.telegram.ui.dq0) this.W).f36813a.f33521j7;
                            if (bs0Var != null) {
                                obj2 = bs0Var.g();
                            } else {
                                obj2 = null;
                            }
                        } else {
                            obj2 = "avatar_" + ((org.telegram.ui.dq0) this.W).f36813a.f33663z5;
                        }
                        freeReceiver.r0(null, null, icVar, "80_80", null, 0L, null, obj2, 1);
                        freeReceiver.f14378f = i11;
                        i11++;
                        measuredWidth = i21;
                        measuredWidth2 = i22;
                    }
                }
                int i23 = measuredWidth2;
                if (i12 != Integer.MAX_VALUE) {
                    while (i12 >= 0) {
                        int i24 = ((i13 + i14) * (i12 - this.f25272f)) + i23 + i10 + i13;
                        if (i24 <= 0) {
                            break;
                        }
                        org.telegram.messenger.ic icVar2 = (org.telegram.messenger.ic) arrayList3.get(i12);
                        ImageReceiver freeReceiver2 = getFreeReceiver();
                        freeReceiver2.y0(i24, i19, i13, i18);
                        if (arrayList4.get(0) instanceof org.telegram.messenger.jj) {
                            obj = arrayList4.get(i12);
                        } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                            org.telegram.ui.bs0 bs0Var2 = ((org.telegram.ui.dq0) this.W).f36813a.f33521j7;
                            if (bs0Var2 != null) {
                                obj = bs0Var2.g();
                            } else {
                                obj = null;
                            }
                        } else {
                            obj = "avatar_" + ((org.telegram.ui.dq0) this.W).f36813a.f33663z5;
                        }
                        freeReceiver2.r0(null, null, icVar2, "80_80", null, 0L, null, obj, 1);
                        freeReceiver2.f14378f = i12;
                        i12--;
                    }
                }
                ValueAnimator valueAnimator = this.f25267a0;
                if (valueAnimator != null && !valueAnimator.isStarted()) {
                    this.f25267a0.start();
                }
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d30.b():void");
    }

    public final boolean c() {
        if (this.U && this.f25269b0 == null) {
            if (this.f25271c0 <= 0.0f && this.V) {
                ValueAnimator valueAnimator = this.f25267a0;
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
            this.f25271c0 = 0.0f;
        }
    }

    public final void e() {
        this.P = false;
        Scroller scroller = this.N;
        if (!scroller.isFinished()) {
            scroller.abortAnimation();
        }
        int i10 = this.T;
        if (i10 >= 0 && i10 < this.e.size()) {
            this.Q = true;
            this.M = false;
            int i11 = this.T;
            this.L = i11;
            this.F = i11;
            this.J = (this.f25273n + this.f25276w) * (this.f25272f - i11);
            this.K = this.f25277x;
            this.f25278y = 1.0f;
            this.T = -1;
            c30 c30Var = this.W;
            if (c30Var != null) {
                PhotoViewer photoViewer = ((org.telegram.ui.dq0) c30Var).f36813a;
                if (PhotoViewer.U2(photoViewer.T4)) {
                    photoViewer.Y2 = true;
                    photoViewer.X1(true);
                    photoViewer.C0(0, true);
                }
            }
        }
        invalidate();
    }

    public final void f() {
        int i10;
        List list;
        int i11;
        int i12;
        int i13 = this.f25277x;
        int abs = Math.abs(i13);
        int i14 = this.f25273n;
        int i15 = this.f25276w;
        int i16 = (i14 / 2) + i15;
        int i17 = -1;
        if (abs > i16) {
            if (i13 > 0) {
                i11 = i13 - i16;
                i12 = 1;
            } else {
                i11 = i13 + i16;
                i12 = -1;
            }
            i10 = (i11 / ((i15 * 2) + i14)) + i12;
        } else {
            i10 = 0;
        }
        this.T = this.f25272f - i10;
        PhotoViewer photoViewer = ((org.telegram.ui.dq0) this.W).f36813a;
        int i18 = photoViewer.P4;
        ArrayList arrayList = photoViewer.f33439a7;
        ArrayList arrayList2 = photoViewer.Y6;
        org.telegram.ui.bs0 bs0Var = photoViewer.f33521j7;
        if (bs0Var != null) {
            list = bs0Var.getAll();
        } else {
            list = null;
        }
        int i19 = this.T;
        if (i18 != i19 && i19 >= 0 && i19 < this.d.size()) {
            Object obj = this.e.get(this.T);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i17 = arrayList2.indexOf((org.telegram.messenger.jj) obj);
            } else if (list != null && !list.isEmpty()) {
                i17 = list.indexOf((TL_iv.PageBlock) obj);
            } else if (arrayList != null && !arrayList.isEmpty()) {
                i17 = arrayList.indexOf((org.telegram.messenger.ic) obj);
            }
            if (i17 >= 0) {
                this.R = true;
                ((org.telegram.ui.dq0) this.W).a(i17);
            }
        }
        if (!this.P) {
            this.P = true;
            this.Q = false;
        }
        a(this.f25277x, true);
    }

    public int getCount() {
        return this.d.size();
    }

    public int getIndex() {
        return this.f25272f;
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
        int i10;
        int i11;
        int i12;
        float f7;
        float interpolation;
        int i13;
        int i14;
        int i15;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z10 = this.U;
        ArrayList arrayList = this.f25270c;
        if (z10 || !arrayList.isEmpty()) {
            float f10 = this.f25271c0;
            if (!this.V) {
                if (this.U) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
            }
            Paint paint = this.f25266a;
            paint.setAlpha((int) (f10 * 127.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i16 = this.f25277x;
                int i17 = this.f25273n;
                float f11 = i17;
                int i18 = (int) (f11 * 2.0f);
                int L = org.telegram.messenger.i0.L(8.0f);
                int i19 = this.f25272f;
                ArrayList arrayList2 = this.d;
                org.telegram.messenger.ic icVar = (org.telegram.messenger.ic) arrayList2.get(i19);
                int i20 = this.f25274r;
                if (icVar != null && (photoSize2 = icVar.f16104k) != null) {
                    i10 = Math.max(i17, (int) ((i20 / photoSize2.h) * photoSize2.f19818w));
                } else {
                    i10 = i20;
                }
                int min = Math.min(i18, i10);
                float f12 = L * 2;
                float f13 = this.D;
                int i21 = ((int) ((min - i17) * f13)) + i17 + ((int) (f12 * f13));
                int i22 = this.F;
                if (i22 >= 0 && i22 < arrayList2.size()) {
                    org.telegram.messenger.ic icVar2 = (org.telegram.messenger.ic) arrayList2.get(this.F);
                    if (icVar2 != null && (photoSize = icVar2.f16104k) != null) {
                        i20 = Math.max(i17, (int) ((i20 / photoSize.h) * photoSize.f19818w));
                    }
                } else {
                    i20 = i17;
                }
                int min2 = Math.min(i18, i20);
                float f14 = this.E;
                int i23 = (int) (f12 * f14);
                float f15 = i16;
                float f16 = (((min2 + i23) - i17) / 2) * f14;
                if (this.F > this.f25272f) {
                    i12 = -1;
                } else {
                    i12 = 1;
                }
                int i24 = (int) ((f16 * i12) + f15);
                int i25 = ((int) ((min2 - i17) * f14)) + i17 + i23;
                int measuredWidth = (getMeasuredWidth() - i21) / 2;
                int i26 = 0;
                while (i26 < size) {
                    ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i26);
                    int i27 = imageReceiver.f14378f;
                    int i28 = this.f25272f;
                    if (i27 == i28) {
                        imageReceiver.K0 = (i11 / 2) + measuredWidth + i24;
                        imageReceiver.M0 = i21 - i11;
                        i15 = size;
                    } else {
                        int i29 = this.F;
                        i15 = size;
                        int i30 = this.f25276w;
                        if (i29 < i28) {
                            if (i27 < i28) {
                                if (i27 <= i29) {
                                    imageReceiver.K0 = ((((i17 + i30) * ((i27 - i28) + 1)) + measuredWidth) - (i30 + i25)) + i24;
                                } else {
                                    imageReceiver.K0 = ((i30 + i17) * (i27 - i28)) + measuredWidth + i24;
                                }
                            } else {
                                imageReceiver.K0 = ((i30 + i17) * ((i27 - i28) - 1)) + measuredWidth + i21 + i30 + i24;
                            }
                        } else if (i27 < i28) {
                            imageReceiver.K0 = ((i30 + i17) * (i27 - i28)) + measuredWidth + i24;
                        } else if (i27 <= i29) {
                            imageReceiver.K0 = ((i30 + i17) * ((i27 - i28) - 1)) + measuredWidth + i21 + i30 + i24;
                        } else {
                            imageReceiver.K0 = i30 + i25 + ((i17 + i30) * ((i27 - i28) - 2)) + measuredWidth + i21 + i30 + i24;
                        }
                        if (i27 == i29) {
                            imageReceiver.M0 = i25 - i23;
                            imageReceiver.K0 = (int) (imageReceiver.K0 + (i23 / 2));
                        } else {
                            imageReceiver.M0 = f11;
                        }
                    }
                    imageReceiver.setAlpha(this.f25271c0);
                    imageReceiver.J0(org.telegram.messenger.i0.L(2.0f));
                    imageReceiver.h(canvas, null);
                    i26++;
                    size = i15;
                }
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - this.G;
                if (j10 > 17) {
                    j10 = 17;
                }
                this.G = currentTimeMillis;
                int i31 = this.L;
                if (i31 >= 0) {
                    float f17 = this.f25278y;
                    if (f17 > 0.0f) {
                        float f18 = (float) j10;
                        if (this.M) {
                            f7 = 100.0f;
                        } else {
                            f7 = 200.0f;
                        }
                        float f19 = f17 - (f18 / f7);
                        this.f25278y = f19;
                        if (i31 == this.f25272f) {
                            float f20 = this.D;
                            if (f20 < 1.0f) {
                                float f21 = (f18 / 200.0f) + f20;
                                this.D = f21;
                                if (f21 > 1.0f) {
                                    this.D = 1.0f;
                                }
                            }
                            this.f25277x = this.K + ((int) Math.ceil(this.D * (this.J - i14)));
                        } else {
                            gr grVar = gr.f26496g;
                            this.E = grVar.getInterpolation(1.0f - f19);
                            if (this.Q) {
                                float f22 = this.D;
                                if (f22 > 0.0f) {
                                    float f23 = f22 - (f18 / 200.0f);
                                    this.D = f23;
                                    if (f23 < 0.0f) {
                                        this.D = 0.0f;
                                    }
                                }
                                this.f25277x = this.K + ((int) Math.ceil(interpolation * (this.J - i13)));
                            } else {
                                this.D = grVar.getInterpolation(this.f25278y);
                                this.f25277x = (int) Math.ceil(this.E * this.J);
                            }
                        }
                        if (this.f25278y <= 0.0f) {
                            this.f25272f = this.L;
                            this.f25278y = 1.0f;
                            this.D = 1.0f;
                            this.E = 0.0f;
                            this.H = false;
                            this.Q = false;
                            this.f25277x = 0;
                            this.L = -1;
                            this.M = false;
                        }
                    }
                    a(this.f25277x, true);
                    invalidate();
                }
                if (this.P) {
                    float f24 = this.D;
                    if (f24 > 0.0f) {
                        float f25 = f24 - (((float) j10) / 200.0f);
                        this.D = f25;
                        if (f25 < 0.0f) {
                            this.D = 0.0f;
                        }
                        invalidate();
                    }
                }
                Scroller scroller = this.N;
                if (!scroller.isFinished()) {
                    if (scroller.computeScrollOffset()) {
                        this.f25277x = scroller.getCurrX();
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
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        Scroller scroller = this.N;
        scroller.abortAnimation();
        if (this.d.size() >= 10) {
            scroller.fling(this.f25277x, 0, Math.round(f7), 0, getMinScrollX(), getMaxScrollX(), 0, 0);
            return false;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a(0, false);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        this.f25277x = (int) (this.f25277x - f7);
        int minScrollX = getMinScrollX();
        int maxScrollX = getMaxScrollX();
        int i10 = this.f25277x;
        if (i10 < minScrollX) {
            this.f25277x = minScrollX;
        } else if (i10 > maxScrollX) {
            this.f25277x = maxScrollX;
        }
        f();
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        List list;
        PhotoViewer photoViewer = ((org.telegram.ui.dq0) this.W).f36813a;
        int i10 = photoViewer.P4;
        ArrayList arrayList = photoViewer.f33439a7;
        ArrayList arrayList2 = photoViewer.Y6;
        org.telegram.ui.bs0 bs0Var = photoViewer.f33521j7;
        if (bs0Var != null) {
            list = bs0Var.getAll();
        } else {
            list = null;
        }
        e();
        ArrayList arrayList3 = this.f25270c;
        int size = arrayList3.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            ImageReceiver imageReceiver = (ImageReceiver) arrayList3.get(i11);
            if (imageReceiver.O(motionEvent.getX(), motionEvent.getY())) {
                int i12 = imageReceiver.f14378f;
                if (i12 >= 0) {
                    ArrayList arrayList4 = this.e;
                    if (i12 < arrayList4.size()) {
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            int indexOf = arrayList2.indexOf((org.telegram.messenger.jj) arrayList4.get(i12));
                            if (i10 != indexOf) {
                                this.f25278y = 1.0f;
                                this.I = true;
                                ((org.telegram.ui.dq0) this.W).a(indexOf);
                                return false;
                            }
                        } else if (list != null && !list.isEmpty()) {
                            int indexOf2 = list.indexOf((TL_iv.PageBlock) arrayList4.get(i12));
                            if (i10 != indexOf2) {
                                this.f25278y = 1.0f;
                                this.I = true;
                                ((org.telegram.ui.dq0) this.W).a(indexOf2);
                                return false;
                            }
                        } else if (arrayList != null && !arrayList.isEmpty()) {
                            int indexOf3 = arrayList.indexOf((org.telegram.messenger.ic) arrayList4.get(i12));
                            if (i10 != indexOf3) {
                                this.f25278y = 1.0f;
                                this.I = true;
                                ((org.telegram.ui.dq0) this.W).a(indexOf3);
                                return false;
                            }
                        }
                    }
                }
                return true;
            }
            i11++;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        if (!this.d.isEmpty() && getAlpha() == 1.0f) {
            if (this.O.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent)) {
                z10 = true;
            }
            if (this.P && motionEvent.getAction() == 1 && this.N.isFinished()) {
                e();
            }
        }
        return z10;
    }

    public void setAnimateBackground(boolean z10) {
        this.V = z10;
    }

    public void setAnimationsEnabled(boolean z10) {
        if (this.S != z10) {
            this.S = z10;
            if (!z10) {
                ValueAnimator valueAnimator = this.f25267a0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f25267a0 = null;
                }
                ValueAnimator valueAnimator2 = this.f25269b0;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f25269b0 = null;
                }
                this.f25271c0 = 0.0f;
                invalidate();
            }
        }
    }

    public void setDelegate(c30 c30Var) {
        this.W = c30Var;
    }

    public void setMoveProgress(float f7) {
        boolean z10;
        if (!this.P && this.L < 0) {
            int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i10 > 0) {
                this.F = this.f25272f - 1;
            } else {
                this.F = this.f25272f + 1;
            }
            int i11 = this.F;
            ArrayList arrayList = this.d;
            if (i11 >= 0 && i11 < arrayList.size()) {
                this.D = 1.0f - Math.abs(f7);
            } else {
                this.D = 1.0f;
            }
            this.E = 1.0f - this.D;
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.H = z10;
            invalidate();
            if (!arrayList.isEmpty()) {
                if (f7 >= 0.0f || this.f25272f != arrayList.size() - 1) {
                    if (i10 <= 0 || this.f25272f != 0) {
                        int i12 = (int) (f7 * (this.f25273n + this.f25276w));
                        this.f25277x = i12;
                        a(i12, true);
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
