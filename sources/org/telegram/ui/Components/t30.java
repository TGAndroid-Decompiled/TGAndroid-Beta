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
public final class t30 extends View implements GestureDetector.OnGestureListener {
    public float A;
    public int B;
    public long C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public final Scroller J;
    public final GestureDetector K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;
    public boolean R;
    public s30 S;
    public ValueAnimator T;
    public ValueAnimator U;
    public float V;
    public final Paint f32852a;
    public final ArrayList f32853b;
    public final ArrayList f32854c;
    public final ArrayList d;
    public final ArrayList f32855e;
    public int f32856f;
    public long h;
    public final int f32857n;
    public final int f32858r;
    public final int f32859s;
    public final int v;
    public int f32860w;
    public float f32861x;
    public float f32862y;

    public t30(ContextThemeWrapper contextThemeWrapper, int i10) {
        super(contextThemeWrapper);
        Paint paint = new Paint();
        this.f32852a = paint;
        this.f32853b = new ArrayList();
        this.f32854c = new ArrayList();
        this.d = new ArrayList();
        this.f32855e = new ArrayList();
        this.f32862y = 1.0f;
        this.A = 0.0f;
        this.H = -1;
        this.O = true;
        this.P = -1;
        this.R = true;
        this.K = new GestureDetector(contextThemeWrapper, this);
        this.J = new Scroller(contextThemeWrapper);
        this.f32857n = AndroidUtilities.dp(42.0f);
        this.f32858r = AndroidUtilities.dp(56.0f);
        this.v = AndroidUtilities.dp(1.0f);
        this.f32859s = i10;
        paint.setColor(2130706432);
    }

    private ImageReceiver getFreeReceiver() {
        ImageReceiver imageReceiver;
        ArrayList arrayList = this.f32853b;
        if (arrayList.isEmpty()) {
            imageReceiver = new ImageReceiver(this);
            imageReceiver.setAllowLoadingOnAttachedOnly(false);
        } else {
            arrayList.remove(0);
            imageReceiver = (ImageReceiver) arrayList.get(0);
        }
        this.f32854c.add(imageReceiver);
        imageReceiver.setCurrentAccount(((org.telegram.ui.rr0) this.S).f42193a.P);
        return imageReceiver;
    }

    private int getMaxScrollX() {
        return ((this.v * 2) + this.f32857n) * this.f32856f;
    }

    private int getMinScrollX() {
        return ((this.v * 2) + this.f32857n) * (-((this.d.size() - this.f32856f) - 1));
    }

    public final void a(int i10, boolean z10) {
        int i11;
        int i12;
        String str;
        String sb2;
        Object obj;
        ArrayList arrayList = this.f32853b;
        ArrayList arrayList2 = this.f32854c;
        if (!z10 && !arrayList2.isEmpty()) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.D = false;
            this.f32861x = 1.0f;
            this.f32862y = 1.0f;
            this.A = 0.0f;
        }
        invalidate();
        if (getMeasuredWidth() != 0) {
            ArrayList arrayList3 = this.d;
            if (!arrayList3.isEmpty()) {
                int measuredWidth = getMeasuredWidth();
                int i13 = this.f32857n;
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
                        int i16 = ((i13 + i14) * (param - this.f32856f)) + measuredWidth2 + i10;
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
                    i11 = this.f32856f;
                    i12 = i11 - 1;
                }
                String str2 = "avatar_";
                int i17 = this.f32858r;
                int i18 = this.f32859s;
                ArrayList arrayList4 = this.f32855e;
                if (i11 != Integer.MIN_VALUE) {
                    int size2 = arrayList3.size();
                    while (i11 < size2) {
                        int i19 = ((i13 + i14) * (i11 - this.f32856f)) + measuredWidth2 + i10;
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
                            org.telegram.ui.tt0 tt0Var = ((org.telegram.ui.rr0) this.S).f42193a.f35700f7;
                            if (tt0Var != null) {
                                obj = tt0Var.g();
                            } else {
                                obj = null;
                            }
                        } else {
                            obj = "avatar_" + ((org.telegram.ui.rr0) this.S).f42193a.f35841v5;
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
                        int i23 = ((i13 + i14) * (i12 - this.f32856f)) + i22 + i10 + i13;
                        if (i23 <= 0) {
                            break;
                        }
                        ImageLocation imageLocation2 = (ImageLocation) arrayList3.get(i12);
                        ImageReceiver freeReceiver2 = getFreeReceiver();
                        freeReceiver2.setImageCoords(i23, i18, i13, i17);
                        if (arrayList4.get(0) instanceof MessageObject) {
                            sb2 = arrayList4.get(i12);
                        } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                            org.telegram.ui.tt0 tt0Var2 = ((org.telegram.ui.rr0) this.S).f42193a.f35700f7;
                            if (tt0Var2 != null) {
                                sb2 = tt0Var2.g();
                            } else {
                                sb2 = null;
                            }
                        } else {
                            StringBuilder sb3 = new StringBuilder(str2);
                            str = str2;
                            sb3.append(((org.telegram.ui.rr0) this.S).f42193a.f35841v5);
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
                ValueAnimator valueAnimator = this.T;
                if (valueAnimator != null && !valueAnimator.isStarted()) {
                    this.T.start();
                }
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t30.b():void");
    }

    public final boolean c() {
        if (this.Q && this.U == null) {
            if (this.V <= 0.0f && this.R) {
                ValueAnimator valueAnimator = this.T;
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
        this.Q = false;
        if (this.O) {
            this.V = 0.0f;
        }
    }

    public final void e() {
        this.L = false;
        Scroller scroller = this.J;
        if (!scroller.isFinished()) {
            scroller.abortAnimation();
        }
        int i10 = this.P;
        if (i10 >= 0 && i10 < this.f32855e.size()) {
            this.M = true;
            this.I = false;
            int i11 = this.P;
            this.H = i11;
            this.B = i11;
            this.F = (this.f32857n + this.v) * (this.f32856f - i11);
            this.G = this.f32860w;
            this.f32861x = 1.0f;
            this.P = -1;
            s30 s30Var = this.S;
            if (s30Var != null) {
                PhotoViewer photoViewer = ((org.telegram.ui.rr0) s30Var).f42193a;
                if (PhotoViewer.R2(photoViewer.P4)) {
                    photoViewer.U2 = true;
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
        int i13 = this.f32860w;
        int abs = Math.abs(i13);
        int i14 = this.f32857n;
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
        this.P = this.f32856f - i10;
        PhotoViewer photoViewer = ((org.telegram.ui.rr0) this.S).f42193a;
        int i18 = photoViewer.L4;
        ArrayList arrayList = photoViewer.W6;
        ArrayList arrayList2 = photoViewer.U6;
        org.telegram.ui.tt0 tt0Var = photoViewer.f35700f7;
        if (tt0Var != null) {
            list = tt0Var.getAll();
        } else {
            list = null;
        }
        int i19 = this.P;
        if (i18 != i19 && i19 >= 0 && i19 < this.d.size()) {
            Object obj = this.f32855e.get(this.P);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i17 = arrayList2.indexOf((MessageObject) obj);
            } else if (list != null && !list.isEmpty()) {
                i17 = list.indexOf((TL_iv.PageBlock) obj);
            } else if (arrayList != null && !arrayList.isEmpty()) {
                i17 = arrayList.indexOf((ImageLocation) obj);
            }
            if (i17 >= 0) {
                this.N = true;
                ((org.telegram.ui.rr0) this.S).a(i17);
            }
        }
        if (!this.L) {
            this.L = true;
            this.M = false;
        }
        a(this.f32860w, true);
    }

    public int getCount() {
        return this.d.size();
    }

    public int getIndex() {
        return this.f32856f;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.J;
        if (!scroller.isFinished()) {
            scroller.abortAnimation();
        }
        this.H = -1;
        this.I = false;
        return true;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f9;
        float interpolation;
        int i12;
        int i13;
        int i14;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z10 = this.Q;
        ArrayList arrayList = this.f32854c;
        if (z10 || !arrayList.isEmpty()) {
            float f10 = this.V;
            if (!this.R) {
                if (this.Q) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
            }
            Paint paint = this.f32852a;
            paint.setAlpha((int) (f10 * 127.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (!arrayList.isEmpty()) {
                int i15 = this.f32860w;
                int i16 = this.f32857n;
                int i17 = (int) (i16 * 2.0f);
                int dp = AndroidUtilities.dp(8.0f);
                int i18 = this.f32856f;
                ArrayList arrayList2 = this.d;
                ImageLocation imageLocation = (ImageLocation) arrayList2.get(i18);
                int i19 = this.f32858r;
                if (imageLocation != null && (photoSize2 = imageLocation.photoSize) != null) {
                    i10 = Math.max(i16, (int) ((i19 / photoSize2.h) * photoSize2.f22417w));
                } else {
                    i10 = i19;
                }
                int min = Math.min(i17, i10);
                float f11 = dp * 2;
                float f12 = this.f32862y;
                int i20 = (int) (f11 * f12);
                int i21 = ((int) ((min - i16) * f12)) + i16 + i20;
                int i22 = this.B;
                if (i22 >= 0 && i22 < arrayList2.size()) {
                    ImageLocation imageLocation2 = (ImageLocation) arrayList2.get(this.B);
                    if (imageLocation2 != null && (photoSize = imageLocation2.photoSize) != null) {
                        i19 = Math.max(i16, (int) ((i19 / photoSize.h) * photoSize.f22417w));
                    }
                } else {
                    i19 = i16;
                }
                int min2 = Math.min(i17, i19);
                float f13 = this.A;
                int i23 = (int) (f11 * f13);
                float f14 = i15;
                float f15 = (((min2 + i23) - i16) / 2) * f13;
                if (this.B > this.f32856f) {
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
                    int i27 = this.f32856f;
                    if (param == i27) {
                        imageReceiver.setImageX((i20 / 2) + measuredWidth + i24);
                        imageReceiver.setImageWidth(i21 - i20);
                        i14 = size;
                    } else {
                        int i28 = this.B;
                        int i29 = this.v;
                        if (i28 < i27) {
                            if (param < i27) {
                                if (param <= i28) {
                                    imageReceiver.setImageX(((((i16 + i29) * ((imageReceiver.getParam() - this.f32856f) + 1)) + measuredWidth) - (i29 + i25)) + i24);
                                } else {
                                    imageReceiver.setImageX(((i29 + i16) * (imageReceiver.getParam() - this.f32856f)) + measuredWidth + i24);
                                }
                                i14 = size;
                            } else {
                                i14 = size;
                                imageReceiver.setImageX(((i29 + i16) * ((imageReceiver.getParam() - this.f32856f) - 1)) + measuredWidth + i21 + i29 + i24);
                            }
                        } else {
                            i14 = size;
                            if (param < i27) {
                                imageReceiver.setImageX(((i29 + i16) * (imageReceiver.getParam() - this.f32856f)) + measuredWidth + i24);
                            } else if (param <= i28) {
                                imageReceiver.setImageX(((i29 + i16) * ((imageReceiver.getParam() - this.f32856f) - 1)) + measuredWidth + i21 + i29 + i24);
                            } else {
                                imageReceiver.setImageX(i29 + i25 + ((i16 + i29) * ((imageReceiver.getParam() - this.f32856f) - 2)) + measuredWidth + i21 + i29 + i24);
                            }
                        }
                        if (param == this.B) {
                            imageReceiver.setImageWidth(i25 - i23);
                            imageReceiver.setImageX((int) (imageReceiver.getImageX() + (i23 / 2)));
                        } else {
                            imageReceiver.setImageWidth(i16);
                        }
                    }
                    imageReceiver.setAlpha(this.V);
                    imageReceiver.setRoundRadius(AndroidUtilities.dp(2.0f));
                    imageReceiver.draw(canvas);
                    i26++;
                }
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - this.C;
                if (j10 > 17) {
                    j10 = 17;
                }
                this.C = currentTimeMillis;
                int i30 = this.H;
                if (i30 >= 0) {
                    float f16 = this.f32861x;
                    if (f16 > 0.0f) {
                        float f17 = (float) j10;
                        if (this.I) {
                            f9 = 100.0f;
                        } else {
                            f9 = 200.0f;
                        }
                        float f18 = f16 - (f17 / f9);
                        this.f32861x = f18;
                        if (i30 == this.f32856f) {
                            float f19 = this.f32862y;
                            if (f19 < 1.0f) {
                                float f20 = (f17 / 200.0f) + f19;
                                this.f32862y = f20;
                                if (f20 > 1.0f) {
                                    this.f32862y = 1.0f;
                                }
                            }
                            this.f32860w = this.G + ((int) Math.ceil(this.f32862y * (this.F - i13)));
                        } else {
                            jr jrVar = jr.f29801g;
                            this.A = jrVar.getInterpolation(1.0f - f18);
                            if (this.M) {
                                float f21 = this.f32862y;
                                if (f21 > 0.0f) {
                                    float f22 = f21 - (f17 / 200.0f);
                                    this.f32862y = f22;
                                    if (f22 < 0.0f) {
                                        this.f32862y = 0.0f;
                                    }
                                }
                                this.f32860w = this.G + ((int) Math.ceil(interpolation * (this.F - i12)));
                            } else {
                                this.f32862y = jrVar.getInterpolation(this.f32861x);
                                this.f32860w = (int) Math.ceil(this.A * this.F);
                            }
                        }
                        if (this.f32861x <= 0.0f) {
                            this.f32856f = this.H;
                            this.f32861x = 1.0f;
                            this.f32862y = 1.0f;
                            this.A = 0.0f;
                            this.D = false;
                            this.M = false;
                            this.f32860w = 0;
                            this.H = -1;
                            this.I = false;
                        }
                    }
                    a(this.f32860w, true);
                    invalidate();
                }
                if (this.L) {
                    float f23 = this.f32862y;
                    if (f23 > 0.0f) {
                        float f24 = f23 - (((float) j10) / 200.0f);
                        this.f32862y = f24;
                        if (f24 < 0.0f) {
                            this.f32862y = 0.0f;
                        }
                        invalidate();
                    }
                }
                Scroller scroller = this.J;
                if (!scroller.isFinished()) {
                    if (scroller.computeScrollOffset()) {
                        this.f32860w = scroller.getCurrX();
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
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        Scroller scroller = this.J;
        scroller.abortAnimation();
        if (this.d.size() >= 10) {
            scroller.fling(this.f32860w, 0, Math.round(f9), 0, getMinScrollX(), getMaxScrollX(), 0, 0);
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
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        this.f32860w = (int) (this.f32860w - f9);
        int minScrollX = getMinScrollX();
        int maxScrollX = getMaxScrollX();
        int i10 = this.f32860w;
        if (i10 < minScrollX) {
            this.f32860w = minScrollX;
        } else if (i10 > maxScrollX) {
            this.f32860w = maxScrollX;
        }
        f();
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        List list;
        PhotoViewer photoViewer = ((org.telegram.ui.rr0) this.S).f42193a;
        int i10 = photoViewer.L4;
        ArrayList arrayList = photoViewer.W6;
        ArrayList arrayList2 = photoViewer.U6;
        org.telegram.ui.tt0 tt0Var = photoViewer.f35700f7;
        if (tt0Var != null) {
            list = tt0Var.getAll();
        } else {
            list = null;
        }
        e();
        ArrayList arrayList3 = this.f32854c;
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
                    ArrayList arrayList4 = this.f32855e;
                    if (param < arrayList4.size()) {
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            int indexOf = arrayList2.indexOf((MessageObject) arrayList4.get(param));
                            if (i10 != indexOf) {
                                this.f32861x = 1.0f;
                                this.E = true;
                                ((org.telegram.ui.rr0) this.S).a(indexOf);
                                return false;
                            }
                        } else if (list != null && !list.isEmpty()) {
                            int indexOf2 = list.indexOf((TL_iv.PageBlock) arrayList4.get(param));
                            if (i10 != indexOf2) {
                                this.f32861x = 1.0f;
                                this.E = true;
                                ((org.telegram.ui.rr0) this.S).a(indexOf2);
                                return false;
                            }
                        } else if (arrayList != null && !arrayList.isEmpty()) {
                            int indexOf3 = arrayList.indexOf((ImageLocation) arrayList4.get(param));
                            if (i10 != indexOf3) {
                                this.f32861x = 1.0f;
                                this.E = true;
                                ((org.telegram.ui.rr0) this.S).a(indexOf3);
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
            z10 = (this.K.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent)) ? true : true;
            if (this.L && motionEvent.getAction() == 1 && this.J.isFinished()) {
                e();
            }
        }
        return z10;
    }

    public void setAnimateBackground(boolean z10) {
        this.R = z10;
    }

    public void setAnimationsEnabled(boolean z10) {
        if (this.O != z10) {
            this.O = z10;
            if (!z10) {
                ValueAnimator valueAnimator = this.T;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.T = null;
                }
                ValueAnimator valueAnimator2 = this.U;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.U = null;
                }
                this.V = 0.0f;
                invalidate();
            }
        }
    }

    public void setDelegate(s30 s30Var) {
        this.S = s30Var;
    }

    public void setMoveProgress(float f9) {
        boolean z10;
        if (!this.L && this.H < 0) {
            int i10 = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
            if (i10 > 0) {
                this.B = this.f32856f - 1;
            } else {
                this.B = this.f32856f + 1;
            }
            int i11 = this.B;
            ArrayList arrayList = this.d;
            if (i11 >= 0 && i11 < arrayList.size()) {
                this.f32862y = 1.0f - Math.abs(f9);
            } else {
                this.f32862y = 1.0f;
            }
            this.A = 1.0f - this.f32862y;
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.D = z10;
            invalidate();
            if (!arrayList.isEmpty()) {
                if (f9 >= 0.0f || this.f32856f != arrayList.size() - 1) {
                    if (i10 <= 0 || this.f32856f != 0) {
                        int i12 = (int) (f9 * (this.f32857n + this.v));
                        this.f32860w = i12;
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
