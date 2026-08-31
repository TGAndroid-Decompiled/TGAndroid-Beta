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
public final class z30 extends View implements GestureDetector.OnGestureListener {
    public float B;
    public int C;
    public long D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public final Scroller K;
    public final GestureDetector L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public boolean S;
    public y30 T;
    public ValueAnimator U;
    public ValueAnimator V;
    public float W;
    public final Paint f33705a;
    public final ArrayList f33706b;
    public final ArrayList f33707c;
    public final ArrayList d;
    public final ArrayList f33708e;
    public int f33709f;
    public long h;
    public final int f33710n;
    public final int f33711r;
    public final int f33712s;
    public final int v;
    public int f33713w;
    public float f33714x;
    public float f33715y;

    public z30(ContextThemeWrapper contextThemeWrapper, int i10) {
        super(contextThemeWrapper);
        Paint paint = new Paint();
        this.f33705a = paint;
        this.f33706b = new ArrayList();
        this.f33707c = new ArrayList();
        this.d = new ArrayList();
        this.f33708e = new ArrayList();
        this.f33715y = 1.0f;
        this.B = 0.0f;
        this.I = -1;
        this.P = true;
        this.Q = -1;
        this.S = true;
        this.L = new GestureDetector(contextThemeWrapper, this);
        this.K = new Scroller(contextThemeWrapper);
        this.f33710n = AndroidUtilities.dp(42.0f);
        this.f33711r = AndroidUtilities.dp(56.0f);
        this.v = AndroidUtilities.dp(1.0f);
        this.f33712s = i10;
        paint.setColor(2130706432);
    }

    private ImageReceiver getFreeReceiver() {
        ImageReceiver imageReceiver;
        ArrayList arrayList = this.f33706b;
        if (arrayList.isEmpty()) {
            imageReceiver = new ImageReceiver(this);
            imageReceiver.setAllowLoadingOnAttachedOnly(false);
        } else {
            arrayList.remove(0);
            imageReceiver = (ImageReceiver) arrayList.get(0);
        }
        this.f33707c.add(imageReceiver);
        imageReceiver.setCurrentAccount(((org.telegram.ui.bs0) this.T).f35585a.Q);
        return imageReceiver;
    }

    private int getMaxScrollX() {
        return ((this.v * 2) + this.f33710n) * this.f33709f;
    }

    private int getMinScrollX() {
        return ((this.v * 2) + this.f33710n) * (-((this.d.size() - this.f33709f) - 1));
    }

    public final void a(int i10, boolean z4) {
        int i11;
        int i12;
        String str;
        String sb;
        Object obj;
        ArrayList arrayList = this.f33706b;
        ArrayList arrayList2 = this.f33707c;
        if (!z4 && !arrayList2.isEmpty()) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.E = false;
            this.f33714x = 1.0f;
            this.f33715y = 1.0f;
            this.B = 0.0f;
        }
        invalidate();
        if (getMeasuredWidth() != 0) {
            ArrayList arrayList3 = this.d;
            if (!arrayList3.isEmpty()) {
                int measuredWidth = getMeasuredWidth();
                int i13 = this.f33710n;
                int measuredWidth2 = (getMeasuredWidth() / 2) - (i13 / 2);
                int i14 = this.v;
                if (z4) {
                    int size = arrayList2.size();
                    int i15 = 0;
                    i11 = Integer.MIN_VALUE;
                    i12 = Integer.MAX_VALUE;
                    while (i15 < size) {
                        ImageReceiver imageReceiver = (ImageReceiver) arrayList2.get(i15);
                        int param = imageReceiver.getParam();
                        int i16 = ((i13 + i14) * (param - this.f33709f)) + measuredWidth2 + i10;
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
                    i11 = this.f33709f;
                    i12 = i11 - 1;
                }
                String str2 = "avatar_";
                int i17 = this.f33711r;
                int i18 = this.f33712s;
                ArrayList arrayList4 = this.f33708e;
                if (i11 != Integer.MIN_VALUE) {
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        int i19 = ((i13 + i14) * (i11 - this.f33709f)) + measuredWidth2 + i10;
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
                            org.telegram.ui.fu0 fu0Var = ((org.telegram.ui.bs0) this.T).f35585a.f34283g7;
                            if (fu0Var != null) {
                                obj = fu0Var.g();
                            } else {
                                obj = null;
                            }
                        } else {
                            obj = "avatar_" + ((org.telegram.ui.bs0) this.T).f35585a.f34425w5;
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
                        int i23 = ((i13 + i14) * (i12 - this.f33709f)) + i22 + i10 + i13;
                        if (i23 <= 0) {
                            break;
                        }
                        ImageLocation imageLocation2 = (ImageLocation) arrayList3.get(i12);
                        ImageReceiver freeReceiver2 = getFreeReceiver();
                        freeReceiver2.setImageCoords(i23, i18, i13, i17);
                        if (arrayList4.get(0) instanceof MessageObject) {
                            sb = arrayList4.get(i12);
                        } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                            org.telegram.ui.fu0 fu0Var2 = ((org.telegram.ui.bs0) this.T).f35585a.f34283g7;
                            if (fu0Var2 != null) {
                                sb = fu0Var2.g();
                            } else {
                                sb = null;
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder(str2);
                            str = str2;
                            sb2.append(((org.telegram.ui.bs0) this.T).f35585a.f34425w5);
                            sb = sb2.toString();
                            freeReceiver2.setImage(null, null, imageLocation2, "80_80", 0L, null, sb, 1);
                            freeReceiver2.setParam(i12);
                            i12--;
                            str2 = str;
                        }
                        str = str2;
                        freeReceiver2.setImage(null, null, imageLocation2, "80_80", 0L, null, sb, 1);
                        freeReceiver2.setParam(i12);
                        i12--;
                        str2 = str;
                    }
                }
                ValueAnimator valueAnimator = this.U;
                if (valueAnimator != null && !valueAnimator.isStarted()) {
                    this.U.start();
                }
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z30.b():void");
    }

    public final boolean c() {
        if (this.R && this.V == null) {
            if (this.W <= 0.0f && this.S) {
                ValueAnimator valueAnimator = this.U;
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
        this.R = false;
        if (this.P) {
            this.W = 0.0f;
        }
    }

    public final void e() {
        this.M = false;
        Scroller scroller = this.K;
        if (!scroller.isFinished()) {
            scroller.abortAnimation();
        }
        int i10 = this.Q;
        if (i10 >= 0 && i10 < this.f33708e.size()) {
            this.N = true;
            this.J = false;
            int i11 = this.Q;
            this.I = i11;
            this.C = i11;
            this.G = (this.f33710n + this.v) * (this.f33709f - i11);
            this.H = this.f33713w;
            this.f33714x = 1.0f;
            this.Q = -1;
            y30 y30Var = this.T;
            if (y30Var != null) {
                PhotoViewer photoViewer = ((org.telegram.ui.bs0) y30Var).f35585a;
                if (PhotoViewer.R2(photoViewer.Q4)) {
                    photoViewer.V2 = true;
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
        int i13 = this.f33713w;
        int abs = Math.abs(i13);
        int i14 = this.f33710n;
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
        this.Q = this.f33709f - i10;
        PhotoViewer photoViewer = ((org.telegram.ui.bs0) this.T).f35585a;
        int i18 = photoViewer.M4;
        ArrayList arrayList = photoViewer.X6;
        ArrayList arrayList2 = photoViewer.V6;
        org.telegram.ui.fu0 fu0Var = photoViewer.f34283g7;
        if (fu0Var != null) {
            list = fu0Var.getAll();
        } else {
            list = null;
        }
        int i19 = this.Q;
        if (i18 != i19 && i19 >= 0 && i19 < this.d.size()) {
            Object obj = this.f33708e.get(this.Q);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i17 = arrayList2.indexOf((MessageObject) obj);
            } else if (list != null && !list.isEmpty()) {
                i17 = list.indexOf((TL_iv.PageBlock) obj);
            } else if (arrayList != null && !arrayList.isEmpty()) {
                i17 = arrayList.indexOf((ImageLocation) obj);
            }
            if (i17 >= 0) {
                this.O = true;
                ((org.telegram.ui.bs0) this.T).a(i17);
            }
        }
        if (!this.M) {
            this.M = true;
            this.N = false;
        }
        a(this.f33713w, true);
    }

    public int getCount() {
        return this.d.size();
    }

    public int getIndex() {
        return this.f33709f;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.K;
        if (!scroller.isFinished()) {
            scroller.abortAnimation();
        }
        this.I = -1;
        this.J = false;
        return true;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f10;
        float interpolation;
        int i12;
        int i13;
        int i14;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z4 = this.R;
        ArrayList arrayList = this.f33707c;
        if (z4 || !arrayList.isEmpty()) {
            float f11 = this.W;
            if (!this.S) {
                if (this.R) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
            }
            Paint paint = this.f33705a;
            paint.setAlpha((int) (f11 * 127.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (!arrayList.isEmpty()) {
                int i15 = this.f33713w;
                int i16 = this.f33710n;
                int i17 = (int) (i16 * 2.0f);
                int dp = AndroidUtilities.dp(8.0f);
                int i18 = this.f33709f;
                ArrayList arrayList2 = this.d;
                ImageLocation imageLocation = (ImageLocation) arrayList2.get(i18);
                int i19 = this.f33711r;
                if (imageLocation != null && (photoSize2 = imageLocation.photoSize) != null) {
                    i10 = Math.max(i16, (int) ((i19 / photoSize2.h) * photoSize2.f20868w));
                } else {
                    i10 = i19;
                }
                int min = Math.min(i17, i10);
                float f12 = dp * 2;
                float f13 = this.f33715y;
                int i20 = (int) (f12 * f13);
                int i21 = ((int) ((min - i16) * f13)) + i16 + i20;
                int i22 = this.C;
                if (i22 >= 0 && i22 < arrayList2.size()) {
                    ImageLocation imageLocation2 = (ImageLocation) arrayList2.get(this.C);
                    if (imageLocation2 != null && (photoSize = imageLocation2.photoSize) != null) {
                        i19 = Math.max(i16, (int) ((i19 / photoSize.h) * photoSize.f20868w));
                    }
                } else {
                    i19 = i16;
                }
                int min2 = Math.min(i17, i19);
                float f14 = this.B;
                int i23 = (int) (f12 * f14);
                float f15 = i15;
                float f16 = (((min2 + i23) - i16) / 2) * f14;
                if (this.C > this.f33709f) {
                    i11 = -1;
                } else {
                    i11 = 1;
                }
                int i24 = (int) ((f16 * i11) + f15);
                int i25 = ((int) ((min2 - i16) * f14)) + i16 + i23;
                int measuredWidth = (getMeasuredWidth() - i21) / 2;
                int i26 = 0;
                for (int size = arrayList.size(); i26 < size; size = i14) {
                    ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i26);
                    int param = imageReceiver.getParam();
                    int i27 = this.f33709f;
                    if (param == i27) {
                        imageReceiver.setImageX((i20 / 2) + measuredWidth + i24);
                        imageReceiver.setImageWidth(i21 - i20);
                        i14 = size;
                    } else {
                        int i28 = this.C;
                        int i29 = this.v;
                        if (i28 < i27) {
                            if (param < i27) {
                                if (param <= i28) {
                                    imageReceiver.setImageX(((((i16 + i29) * ((imageReceiver.getParam() - this.f33709f) + 1)) + measuredWidth) - (i29 + i25)) + i24);
                                } else {
                                    imageReceiver.setImageX(((i29 + i16) * (imageReceiver.getParam() - this.f33709f)) + measuredWidth + i24);
                                }
                                i14 = size;
                            } else {
                                i14 = size;
                                imageReceiver.setImageX(((i29 + i16) * ((imageReceiver.getParam() - this.f33709f) - 1)) + measuredWidth + i21 + i29 + i24);
                            }
                        } else {
                            i14 = size;
                            if (param < i27) {
                                imageReceiver.setImageX(((i29 + i16) * (imageReceiver.getParam() - this.f33709f)) + measuredWidth + i24);
                            } else if (param <= i28) {
                                imageReceiver.setImageX(((i29 + i16) * ((imageReceiver.getParam() - this.f33709f) - 1)) + measuredWidth + i21 + i29 + i24);
                            } else {
                                imageReceiver.setImageX(i29 + i25 + ((i16 + i29) * ((imageReceiver.getParam() - this.f33709f) - 2)) + measuredWidth + i21 + i29 + i24);
                            }
                        }
                        if (param == this.C) {
                            imageReceiver.setImageWidth(i25 - i23);
                            imageReceiver.setImageX((int) (imageReceiver.getImageX() + (i23 / 2)));
                        } else {
                            imageReceiver.setImageWidth(i16);
                        }
                    }
                    imageReceiver.setAlpha(this.W);
                    imageReceiver.setRoundRadius(AndroidUtilities.dp(2.0f));
                    imageReceiver.draw(canvas);
                    i26++;
                }
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - this.D;
                if (j10 > 17) {
                    j10 = 17;
                }
                this.D = currentTimeMillis;
                int i30 = this.I;
                if (i30 >= 0) {
                    float f17 = this.f33714x;
                    if (f17 > 0.0f) {
                        float f18 = (float) j10;
                        if (this.J) {
                            f10 = 100.0f;
                        } else {
                            f10 = 200.0f;
                        }
                        float f19 = f17 - (f18 / f10);
                        this.f33714x = f19;
                        if (i30 == this.f33709f) {
                            float f20 = this.f33715y;
                            if (f20 < 1.0f) {
                                float f21 = (f18 / 200.0f) + f20;
                                this.f33715y = f21;
                                if (f21 > 1.0f) {
                                    this.f33715y = 1.0f;
                                }
                            }
                            this.f33713w = this.H + ((int) Math.ceil(this.f33715y * (this.G - i13)));
                        } else {
                            pr prVar = pr.f30184g;
                            this.B = prVar.getInterpolation(1.0f - f19);
                            if (this.N) {
                                float f22 = this.f33715y;
                                if (f22 > 0.0f) {
                                    float f23 = f22 - (f18 / 200.0f);
                                    this.f33715y = f23;
                                    if (f23 < 0.0f) {
                                        this.f33715y = 0.0f;
                                    }
                                }
                                this.f33713w = this.H + ((int) Math.ceil(interpolation * (this.G - i12)));
                            } else {
                                this.f33715y = prVar.getInterpolation(this.f33714x);
                                this.f33713w = (int) Math.ceil(this.B * this.G);
                            }
                        }
                        if (this.f33714x <= 0.0f) {
                            this.f33709f = this.I;
                            this.f33714x = 1.0f;
                            this.f33715y = 1.0f;
                            this.B = 0.0f;
                            this.E = false;
                            this.N = false;
                            this.f33713w = 0;
                            this.I = -1;
                            this.J = false;
                        }
                    }
                    a(this.f33713w, true);
                    invalidate();
                }
                if (this.M) {
                    float f24 = this.f33715y;
                    if (f24 > 0.0f) {
                        float f25 = f24 - (((float) j10) / 200.0f);
                        this.f33715y = f25;
                        if (f25 < 0.0f) {
                            this.f33715y = 0.0f;
                        }
                        invalidate();
                    }
                }
                Scroller scroller = this.K;
                if (!scroller.isFinished()) {
                    if (scroller.computeScrollOffset()) {
                        this.f33713w = scroller.getCurrX();
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
        Scroller scroller = this.K;
        scroller.abortAnimation();
        if (this.d.size() >= 10) {
            scroller.fling(this.f33713w, 0, Math.round(f10), 0, getMinScrollX(), getMaxScrollX(), 0, 0);
            return false;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        a(0, false);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f33713w = (int) (this.f33713w - f10);
        int minScrollX = getMinScrollX();
        int maxScrollX = getMaxScrollX();
        int i10 = this.f33713w;
        if (i10 < minScrollX) {
            this.f33713w = minScrollX;
        } else if (i10 > maxScrollX) {
            this.f33713w = maxScrollX;
        }
        f();
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        List list;
        PhotoViewer photoViewer = ((org.telegram.ui.bs0) this.T).f35585a;
        int i10 = photoViewer.M4;
        ArrayList arrayList = photoViewer.X6;
        ArrayList arrayList2 = photoViewer.V6;
        org.telegram.ui.fu0 fu0Var = photoViewer.f34283g7;
        if (fu0Var != null) {
            list = fu0Var.getAll();
        } else {
            list = null;
        }
        e();
        ArrayList arrayList3 = this.f33707c;
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
                    ArrayList arrayList4 = this.f33708e;
                    if (param < arrayList4.size()) {
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            int indexOf = arrayList2.indexOf((MessageObject) arrayList4.get(param));
                            if (i10 != indexOf) {
                                this.f33714x = 1.0f;
                                this.F = true;
                                ((org.telegram.ui.bs0) this.T).a(indexOf);
                                return false;
                            }
                        } else if (list != null && !list.isEmpty()) {
                            int indexOf2 = list.indexOf((TL_iv.PageBlock) arrayList4.get(param));
                            if (i10 != indexOf2) {
                                this.f33714x = 1.0f;
                                this.F = true;
                                ((org.telegram.ui.bs0) this.T).a(indexOf2);
                                return false;
                            }
                        } else if (arrayList != null && !arrayList.isEmpty()) {
                            int indexOf3 = arrayList.indexOf((ImageLocation) arrayList4.get(param));
                            if (i10 != indexOf3) {
                                this.f33714x = 1.0f;
                                this.F = true;
                                ((org.telegram.ui.bs0) this.T).a(indexOf3);
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
        boolean z4 = false;
        if (!this.d.isEmpty() && getAlpha() == 1.0f) {
            z4 = (this.L.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent)) ? true : true;
            if (this.M && motionEvent.getAction() == 1 && this.K.isFinished()) {
                e();
            }
        }
        return z4;
    }

    public void setAnimateBackground(boolean z4) {
        this.S = z4;
    }

    public void setAnimationsEnabled(boolean z4) {
        if (this.P != z4) {
            this.P = z4;
            if (!z4) {
                ValueAnimator valueAnimator = this.U;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.U = null;
                }
                ValueAnimator valueAnimator2 = this.V;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.V = null;
                }
                this.W = 0.0f;
                invalidate();
            }
        }
    }

    public void setDelegate(y30 y30Var) {
        this.T = y30Var;
    }

    public void setMoveProgress(float f10) {
        boolean z4;
        if (!this.M && this.I < 0) {
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i10 > 0) {
                this.C = this.f33709f - 1;
            } else {
                this.C = this.f33709f + 1;
            }
            int i11 = this.C;
            ArrayList arrayList = this.d;
            if (i11 >= 0 && i11 < arrayList.size()) {
                this.f33715y = 1.0f - Math.abs(f10);
            } else {
                this.f33715y = 1.0f;
            }
            this.B = 1.0f - this.f33715y;
            if (i10 != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.E = z4;
            invalidate();
            if (!arrayList.isEmpty()) {
                if (f10 >= 0.0f || this.f33709f != arrayList.size() - 1) {
                    if (i10 <= 0 || this.f33709f != 0) {
                        int i12 = (int) (f10 * (this.f33710n + this.v));
                        this.f33713w = i12;
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
