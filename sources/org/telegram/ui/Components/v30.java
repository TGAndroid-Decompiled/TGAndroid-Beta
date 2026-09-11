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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.PhotoViewer;
public final class v30 extends View implements GestureDetector.OnGestureListener {
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
    public u30 W;
    public final Paint f31072a;
    public ValueAnimator f31073a0;
    public final ArrayList f31074b;
    public ValueAnimator f31075b0;
    public final ArrayList f31076c;
    public float f31077c0;
    public final ArrayList d;
    public final ArrayList f31078e;
    public int f31079f;
    public long h;
    public final int f31080n;
    public final int f31081r;
    public final int f31082s;
    public final int v;
    public int f31083w;
    public float f31084x;
    public float f31085y;

    public v30(ContextThemeWrapper contextThemeWrapper, int i10) {
        super(contextThemeWrapper);
        Paint paint = new Paint();
        this.f31072a = paint;
        this.f31074b = new ArrayList();
        this.f31076c = new ArrayList();
        this.d = new ArrayList();
        this.f31078e = new ArrayList();
        this.f31085y = 1.0f;
        this.E = 0.0f;
        this.L = -1;
        this.S = true;
        this.T = -1;
        this.V = true;
        this.O = new GestureDetector(contextThemeWrapper, this);
        this.N = new Scroller(contextThemeWrapper);
        this.f31080n = AndroidUtilities.dp(42.0f);
        this.f31081r = AndroidUtilities.dp(56.0f);
        this.v = AndroidUtilities.dp(1.0f);
        this.f31082s = i10;
        paint.setColor(2130706432);
    }

    private ImageReceiver getFreeReceiver() {
        ImageReceiver imageReceiver;
        ArrayList arrayList = this.f31074b;
        if (arrayList.isEmpty()) {
            imageReceiver = new ImageReceiver(this);
            imageReceiver.setAllowLoadingOnAttachedOnly(false);
        } else {
            arrayList.remove(0);
            imageReceiver = (ImageReceiver) arrayList.get(0);
        }
        this.f31076c.add(imageReceiver);
        imageReceiver.setCurrentAccount(((org.telegram.ui.us0) this.W).f41215a.T);
        return imageReceiver;
    }

    private int getMaxScrollX() {
        return ((this.v * 2) + this.f31080n) * this.f31079f;
    }

    private int getMinScrollX() {
        return ((this.v * 2) + this.f31080n) * (-((this.d.size() - this.f31079f) - 1));
    }

    public final void a(int i10, boolean z10) {
        int i11;
        int i12;
        String str;
        String sb2;
        Object obj;
        ArrayList arrayList = this.f31074b;
        ArrayList arrayList2 = this.f31076c;
        if (!z10 && !arrayList2.isEmpty()) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.H = false;
            this.f31084x = 1.0f;
            this.f31085y = 1.0f;
            this.E = 0.0f;
        }
        invalidate();
        if (getMeasuredWidth() != 0) {
            ArrayList arrayList3 = this.d;
            if (!arrayList3.isEmpty()) {
                int measuredWidth = getMeasuredWidth();
                int i13 = this.f31080n;
                int measuredWidth2 = (getMeasuredWidth() / 2) - (i13 / 2);
                int i14 = this.v;
                if (z10) {
                    int size = arrayList2.size();
                    int i15 = 0;
                    i11 = Integer.MIN_VALUE;
                    i12 = Integer.MAX_VALUE;
                    while (i15 < size) {
                        ImageReceiver imageReceiver = (ImageReceiver) arrayList2.get(i15);
                        int param = imageReceiver.getParam();
                        int i16 = ((i13 + i14) * (param - this.f31079f)) + measuredWidth2 + i10;
                        if (i16 > measuredWidth || i16 + i13 < 0) {
                            arrayList.add(imageReceiver);
                            arrayList2.remove(i15);
                            size--;
                            i15--;
                        }
                        i12 = Math.min(i12, param - 1);
                        i11 = Math.max(i11, param + 1);
                        i15++;
                    }
                } else {
                    i11 = this.f31079f;
                    i12 = i11 - 1;
                }
                String str2 = "avatar_";
                int i17 = this.f31081r;
                int i18 = this.f31082s;
                ArrayList arrayList4 = this.f31078e;
                if (i11 != Integer.MIN_VALUE) {
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        int i19 = ((i13 + i14) * (i11 - this.f31079f)) + measuredWidth2 + i10;
                        if (i19 >= measuredWidth) {
                            break;
                        }
                        ImageLocation imageLocation = (ImageLocation) arrayList3.get(i11);
                        ImageReceiver freeReceiver = getFreeReceiver();
                        int i20 = measuredWidth;
                        int i21 = measuredWidth2;
                        freeReceiver.setImageCoords(i19, i18, i13, i17);
                        if (arrayList4.get(0) instanceof MessageObject) {
                            obj = arrayList4.get(i11);
                        } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                            org.telegram.ui.wu0 wu0Var = ((org.telegram.ui.us0) this.W).f41215a.f33599j7;
                            if (wu0Var != null) {
                                obj = wu0Var.g();
                            } else {
                                obj = null;
                            }
                        } else {
                            obj = "avatar_" + ((org.telegram.ui.us0) this.W).f41215a.f33741z5;
                        }
                        freeReceiver.setImage(null, null, imageLocation, "80_80", 0L, null, obj, 1);
                        freeReceiver.setParam(i11);
                        i11++;
                        measuredWidth = i20;
                        measuredWidth2 = i21;
                    }
                }
                int i22 = measuredWidth2;
                if (i12 != Integer.MAX_VALUE) {
                    while (i12 >= 0) {
                        int i23 = ((i13 + i14) * (i12 - this.f31079f)) + i22 + i10 + i13;
                        if (i23 <= 0) {
                            break;
                        }
                        ImageLocation imageLocation2 = (ImageLocation) arrayList3.get(i12);
                        ImageReceiver freeReceiver2 = getFreeReceiver();
                        freeReceiver2.setImageCoords(i23, i18, i13, i17);
                        if (arrayList4.get(0) instanceof MessageObject) {
                            sb2 = arrayList4.get(i12);
                        } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                            org.telegram.ui.wu0 wu0Var2 = ((org.telegram.ui.us0) this.W).f41215a.f33599j7;
                            if (wu0Var2 != null) {
                                sb2 = wu0Var2.g();
                            } else {
                                sb2 = null;
                            }
                        } else {
                            StringBuilder sb3 = new StringBuilder(str2);
                            str = str2;
                            sb3.append(((org.telegram.ui.us0) this.W).f41215a.f33741z5);
                            sb2 = sb3.toString();
                            freeReceiver2.setImage(null, null, imageLocation2, "80_80", 0L, null, sb2, 1);
                            freeReceiver2.setParam(i12);
                            i12--;
                            str2 = str;
                        }
                        str = str2;
                        freeReceiver2.setImage(null, null, imageLocation2, "80_80", 0L, null, sb2, 1);
                        freeReceiver2.setParam(i12);
                        i12--;
                        str2 = str;
                    }
                }
                ValueAnimator valueAnimator = this.f31073a0;
                if (valueAnimator != null && !valueAnimator.isStarted()) {
                    this.f31073a0.start();
                }
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v30.b():void");
    }

    public final boolean c() {
        if (this.U && this.f31075b0 == null) {
            if (this.f31077c0 <= 0.0f && this.V) {
                ValueAnimator valueAnimator = this.f31073a0;
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
            this.f31077c0 = 0.0f;
        }
    }

    public final void e() {
        this.P = false;
        Scroller scroller = this.N;
        if (!scroller.isFinished()) {
            scroller.abortAnimation();
        }
        int i10 = this.T;
        if (i10 >= 0 && i10 < this.f31078e.size()) {
            this.Q = true;
            this.M = false;
            int i11 = this.T;
            this.L = i11;
            this.F = i11;
            this.J = (this.f31080n + this.v) * (this.f31079f - i11);
            this.K = this.f31083w;
            this.f31084x = 1.0f;
            this.T = -1;
            u30 u30Var = this.W;
            if (u30Var != null) {
                PhotoViewer photoViewer = ((org.telegram.ui.us0) u30Var).f41215a;
                if (PhotoViewer.R2(photoViewer.T4)) {
                    photoViewer.Y2 = true;
                    photoViewer.T1(true);
                    photoViewer.B0(0, true);
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
        int i13 = this.f31083w;
        int abs = Math.abs(i13);
        int i14 = this.f31080n;
        int i15 = this.v;
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
        this.T = this.f31079f - i10;
        PhotoViewer photoViewer = ((org.telegram.ui.us0) this.W).f41215a;
        int i18 = photoViewer.P4;
        ArrayList arrayList = photoViewer.f33517a7;
        ArrayList arrayList2 = photoViewer.Y6;
        org.telegram.ui.wu0 wu0Var = photoViewer.f33599j7;
        if (wu0Var != null) {
            list = wu0Var.getAll();
        } else {
            list = null;
        }
        int i19 = this.T;
        if (i18 != i19 && i19 >= 0 && i19 < this.d.size()) {
            Object obj = this.f31078e.get(this.T);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i17 = arrayList2.indexOf((MessageObject) obj);
            } else if (list != null && !list.isEmpty()) {
                i17 = list.indexOf((TL_iv.PageBlock) obj);
            } else if (arrayList != null && !arrayList.isEmpty()) {
                i17 = arrayList.indexOf((ImageLocation) obj);
            }
            if (i17 >= 0) {
                this.R = true;
                ((org.telegram.ui.us0) this.W).a(i17);
            }
        }
        if (!this.P) {
            this.P = true;
            this.Q = false;
        }
        a(this.f31083w, true);
    }

    public int getCount() {
        return this.d.size();
    }

    public int getIndex() {
        return this.f31079f;
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
        float f7;
        float interpolation;
        int i12;
        int i13;
        int i14;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z10 = this.U;
        ArrayList arrayList = this.f31076c;
        if (z10 || !arrayList.isEmpty()) {
            float f10 = this.f31077c0;
            if (!this.V) {
                if (this.U) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
            }
            Paint paint = this.f31072a;
            paint.setAlpha((int) (f10 * 127.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (!arrayList.isEmpty()) {
                int i15 = this.f31083w;
                int i16 = this.f31080n;
                int i17 = (int) (i16 * 2.0f);
                int dp = AndroidUtilities.dp(8.0f);
                int i18 = this.f31079f;
                ArrayList arrayList2 = this.d;
                ImageLocation imageLocation = (ImageLocation) arrayList2.get(i18);
                int i19 = this.f31081r;
                if (imageLocation != null && (photoSize2 = imageLocation.photoSize) != null) {
                    i10 = Math.max(i16, (int) ((i19 / photoSize2.h) * photoSize2.f19894w));
                } else {
                    i10 = i19;
                }
                int min = Math.min(i17, i10);
                float f11 = dp * 2;
                float f12 = this.f31085y;
                int i20 = (int) (f11 * f12);
                int i21 = ((int) ((min - i16) * f12)) + i16 + i20;
                int i22 = this.F;
                if (i22 >= 0 && i22 < arrayList2.size()) {
                    ImageLocation imageLocation2 = (ImageLocation) arrayList2.get(this.F);
                    if (imageLocation2 != null && (photoSize = imageLocation2.photoSize) != null) {
                        i19 = Math.max(i16, (int) ((i19 / photoSize.h) * photoSize.f19894w));
                    }
                } else {
                    i19 = i16;
                }
                int min2 = Math.min(i17, i19);
                float f13 = this.E;
                int i23 = (int) (f11 * f13);
                float f14 = i15;
                float f15 = (((min2 + i23) - i16) / 2) * f13;
                if (this.F > this.f31079f) {
                    i11 = -1;
                } else {
                    i11 = 1;
                }
                int i24 = (int) ((f15 * i11) + f14);
                int i25 = ((int) ((min2 - i16) * f13)) + i16 + i23;
                int measuredWidth = (getMeasuredWidth() - i21) / 2;
                int i26 = 0;
                for (int size = arrayList.size(); i26 < size; size = i14) {
                    ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i26);
                    int param = imageReceiver.getParam();
                    int i27 = this.f31079f;
                    if (param == i27) {
                        imageReceiver.setImageX((i20 / 2) + measuredWidth + i24);
                        imageReceiver.setImageWidth(i21 - i20);
                        i14 = size;
                    } else {
                        int i28 = this.F;
                        int i29 = this.v;
                        if (i28 < i27) {
                            if (param < i27) {
                                if (param <= i28) {
                                    imageReceiver.setImageX(((((i16 + i29) * ((imageReceiver.getParam() - this.f31079f) + 1)) + measuredWidth) - (i29 + i25)) + i24);
                                } else {
                                    imageReceiver.setImageX(((i29 + i16) * (imageReceiver.getParam() - this.f31079f)) + measuredWidth + i24);
                                }
                                i14 = size;
                            } else {
                                i14 = size;
                                imageReceiver.setImageX(((i29 + i16) * ((imageReceiver.getParam() - this.f31079f) - 1)) + measuredWidth + i21 + i29 + i24);
                            }
                        } else {
                            i14 = size;
                            if (param < i27) {
                                imageReceiver.setImageX(((i29 + i16) * (imageReceiver.getParam() - this.f31079f)) + measuredWidth + i24);
                            } else if (param <= i28) {
                                imageReceiver.setImageX(((i29 + i16) * ((imageReceiver.getParam() - this.f31079f) - 1)) + measuredWidth + i21 + i29 + i24);
                            } else {
                                imageReceiver.setImageX(i29 + i25 + ((i16 + i29) * ((imageReceiver.getParam() - this.f31079f) - 2)) + measuredWidth + i21 + i29 + i24);
                            }
                        }
                        if (param == this.F) {
                            imageReceiver.setImageWidth(i25 - i23);
                            imageReceiver.setImageX((int) (imageReceiver.getImageX() + (i23 / 2)));
                        } else {
                            imageReceiver.setImageWidth(i16);
                        }
                    }
                    imageReceiver.setAlpha(this.f31077c0);
                    imageReceiver.setRoundRadius(AndroidUtilities.dp(2.0f));
                    imageReceiver.draw(canvas);
                    i26++;
                }
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = currentTimeMillis - this.G;
                if (j3 > 17) {
                    j3 = 17;
                }
                this.G = currentTimeMillis;
                int i30 = this.L;
                if (i30 >= 0) {
                    float f16 = this.f31084x;
                    if (f16 > 0.0f) {
                        float f17 = (float) j3;
                        if (this.M) {
                            f7 = 100.0f;
                        } else {
                            f7 = 200.0f;
                        }
                        float f18 = f16 - (f17 / f7);
                        this.f31084x = f18;
                        if (i30 == this.f31079f) {
                            float f19 = this.f31085y;
                            if (f19 < 1.0f) {
                                float f20 = (f17 / 200.0f) + f19;
                                this.f31085y = f20;
                                if (f20 > 1.0f) {
                                    this.f31085y = 1.0f;
                                }
                            }
                            this.f31083w = this.K + ((int) Math.ceil(this.f31085y * (this.J - i13)));
                        } else {
                            pr prVar = pr.f29467g;
                            this.E = prVar.getInterpolation(1.0f - f18);
                            if (this.Q) {
                                float f21 = this.f31085y;
                                if (f21 > 0.0f) {
                                    float f22 = f21 - (f17 / 200.0f);
                                    this.f31085y = f22;
                                    if (f22 < 0.0f) {
                                        this.f31085y = 0.0f;
                                    }
                                }
                                this.f31083w = this.K + ((int) Math.ceil(interpolation * (this.J - i12)));
                            } else {
                                this.f31085y = prVar.getInterpolation(this.f31084x);
                                this.f31083w = (int) Math.ceil(this.E * this.J);
                            }
                        }
                        if (this.f31084x <= 0.0f) {
                            this.f31079f = this.L;
                            this.f31084x = 1.0f;
                            this.f31085y = 1.0f;
                            this.E = 0.0f;
                            this.H = false;
                            this.Q = false;
                            this.f31083w = 0;
                            this.L = -1;
                            this.M = false;
                        }
                    }
                    a(this.f31083w, true);
                    invalidate();
                }
                if (this.P) {
                    float f23 = this.f31085y;
                    if (f23 > 0.0f) {
                        float f24 = f23 - (((float) j3) / 200.0f);
                        this.f31085y = f24;
                        if (f24 < 0.0f) {
                            this.f31085y = 0.0f;
                        }
                        invalidate();
                    }
                }
                Scroller scroller = this.N;
                if (!scroller.isFinished()) {
                    if (scroller.computeScrollOffset()) {
                        this.f31083w = scroller.getCurrX();
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
            scroller.fling(this.f31083w, 0, Math.round(f7), 0, getMinScrollX(), getMaxScrollX(), 0, 0);
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
        this.f31083w = (int) (this.f31083w - f7);
        int minScrollX = getMinScrollX();
        int maxScrollX = getMaxScrollX();
        int i10 = this.f31083w;
        if (i10 < minScrollX) {
            this.f31083w = minScrollX;
        } else if (i10 > maxScrollX) {
            this.f31083w = maxScrollX;
        }
        f();
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        List list;
        PhotoViewer photoViewer = ((org.telegram.ui.us0) this.W).f41215a;
        int i10 = photoViewer.P4;
        ArrayList arrayList = photoViewer.f33517a7;
        ArrayList arrayList2 = photoViewer.Y6;
        org.telegram.ui.wu0 wu0Var = photoViewer.f33599j7;
        if (wu0Var != null) {
            list = wu0Var.getAll();
        } else {
            list = null;
        }
        e();
        ArrayList arrayList3 = this.f31076c;
        int size = arrayList3.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            ImageReceiver imageReceiver = (ImageReceiver) arrayList3.get(i11);
            if (imageReceiver.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                int param = imageReceiver.getParam();
                if (param >= 0) {
                    ArrayList arrayList4 = this.f31078e;
                    if (param < arrayList4.size()) {
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            int indexOf = arrayList2.indexOf((MessageObject) arrayList4.get(param));
                            if (i10 != indexOf) {
                                this.f31084x = 1.0f;
                                this.I = true;
                                ((org.telegram.ui.us0) this.W).a(indexOf);
                                return false;
                            }
                        } else if (list != null && !list.isEmpty()) {
                            int indexOf2 = list.indexOf((TL_iv.PageBlock) arrayList4.get(param));
                            if (i10 != indexOf2) {
                                this.f31084x = 1.0f;
                                this.I = true;
                                ((org.telegram.ui.us0) this.W).a(indexOf2);
                                return false;
                            }
                        } else if (arrayList != null && !arrayList.isEmpty()) {
                            int indexOf3 = arrayList.indexOf((ImageLocation) arrayList4.get(param));
                            if (i10 != indexOf3) {
                                this.f31084x = 1.0f;
                                this.I = true;
                                ((org.telegram.ui.us0) this.W).a(indexOf3);
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
            z10 = (this.O.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent)) ? true : true;
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
                ValueAnimator valueAnimator = this.f31073a0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f31073a0 = null;
                }
                ValueAnimator valueAnimator2 = this.f31075b0;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f31075b0 = null;
                }
                this.f31077c0 = 0.0f;
                invalidate();
            }
        }
    }

    public void setDelegate(u30 u30Var) {
        this.W = u30Var;
    }

    public void setMoveProgress(float f7) {
        boolean z10;
        if (!this.P && this.L < 0) {
            int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i10 > 0) {
                this.F = this.f31079f - 1;
            } else {
                this.F = this.f31079f + 1;
            }
            int i11 = this.F;
            ArrayList arrayList = this.d;
            if (i11 >= 0 && i11 < arrayList.size()) {
                this.f31085y = 1.0f - Math.abs(f7);
            } else {
                this.f31085y = 1.0f;
            }
            this.E = 1.0f - this.f31085y;
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.H = z10;
            invalidate();
            if (!arrayList.isEmpty()) {
                if (f7 >= 0.0f || this.f31079f != arrayList.size() - 1) {
                    if (i10 <= 0 || this.f31079f != 0) {
                        int i12 = (int) (f7 * (this.f31080n + this.v));
                        this.f31083w = i12;
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
