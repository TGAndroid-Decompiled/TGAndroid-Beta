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
public final class f30 extends View implements GestureDetector.OnGestureListener {
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
    public e30 S;
    public ValueAnimator T;
    public ValueAnimator U;
    public float V;
    public final Paint f28245a;
    public final ArrayList f28246b;
    public final ArrayList f28247c;
    public final ArrayList d;
    public final ArrayList f28248e;
    public int f28249f;
    public long h;
    public final int f28250n;
    public final int f28251r;
    public final int f28252s;
    public final int v;
    public int f28253w;
    public float f28254x;
    public float f28255y;

    public f30(ContextThemeWrapper contextThemeWrapper, int i9) {
        super(contextThemeWrapper);
        Paint paint = new Paint();
        this.f28245a = paint;
        this.f28246b = new ArrayList();
        this.f28247c = new ArrayList();
        this.d = new ArrayList();
        this.f28248e = new ArrayList();
        this.f28255y = 1.0f;
        this.A = 0.0f;
        this.H = -1;
        this.O = true;
        this.P = -1;
        this.R = true;
        this.K = new GestureDetector(contextThemeWrapper, this);
        this.J = new Scroller(contextThemeWrapper);
        this.f28250n = AndroidUtilities.dp(42.0f);
        this.f28251r = AndroidUtilities.dp(56.0f);
        this.v = AndroidUtilities.dp(1.0f);
        this.f28252s = i9;
        paint.setColor(2130706432);
    }

    private ImageReceiver getFreeReceiver() {
        ImageReceiver imageReceiver;
        ArrayList arrayList = this.f28246b;
        if (arrayList.isEmpty()) {
            imageReceiver = new ImageReceiver(this);
            imageReceiver.setAllowLoadingOnAttachedOnly(false);
        } else {
            arrayList.remove(0);
            imageReceiver = (ImageReceiver) arrayList.get(0);
        }
        this.f28247c.add(imageReceiver);
        imageReceiver.setCurrentAccount(((org.telegram.ui.sr0) this.S).f42756a.P);
        return imageReceiver;
    }

    private int getMaxScrollX() {
        return ((this.v * 2) + this.f28250n) * this.f28249f;
    }

    private int getMinScrollX() {
        return ((this.v * 2) + this.f28250n) * (-((this.d.size() - this.f28249f) - 1));
    }

    public final void a(int i9, boolean z10) {
        int i10;
        int i11;
        String str;
        String sb2;
        Object obj;
        ArrayList arrayList = this.f28246b;
        ArrayList arrayList2 = this.f28247c;
        if (!z10 && !arrayList2.isEmpty()) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.D = false;
            this.f28254x = 1.0f;
            this.f28255y = 1.0f;
            this.A = 0.0f;
        }
        invalidate();
        if (getMeasuredWidth() != 0) {
            ArrayList arrayList3 = this.d;
            if (!arrayList3.isEmpty()) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f28250n;
                int measuredWidth2 = (getMeasuredWidth() / 2) - (i12 / 2);
                int i13 = this.v;
                if (z10) {
                    int size = arrayList2.size();
                    int i14 = 0;
                    i10 = Integer.MIN_VALUE;
                    i11 = Integer.MAX_VALUE;
                    while (i14 < size) {
                        ImageReceiver imageReceiver = (ImageReceiver) arrayList2.get(i14);
                        int param = imageReceiver.getParam();
                        int i15 = ((i12 + i13) * (param - this.f28249f)) + measuredWidth2 + i9;
                        if (i15 > measuredWidth || i15 + i12 < 0) {
                            arrayList.add(imageReceiver);
                            arrayList2.remove(i14);
                            size--;
                            i14--;
                        }
                        i11 = Math.min(i11, param - 1);
                        i10 = Math.max(i10, param + 1);
                        i14++;
                    }
                } else {
                    i10 = this.f28249f;
                    i11 = i10 - 1;
                }
                String str2 = "avatar_";
                int i16 = this.f28251r;
                int i17 = this.f28252s;
                ArrayList arrayList4 = this.f28248e;
                if (i10 != Integer.MIN_VALUE) {
                    int size2 = arrayList3.size();
                    while (i10 < size2) {
                        int i18 = ((i12 + i13) * (i10 - this.f28249f)) + measuredWidth2 + i9;
                        if (i18 >= measuredWidth) {
                            break;
                        }
                        ImageLocation imageLocation = (ImageLocation) arrayList3.get(i10);
                        ImageReceiver freeReceiver = getFreeReceiver();
                        int i19 = measuredWidth;
                        int i20 = measuredWidth2;
                        freeReceiver.setImageCoords(i18, i17, i12, i16);
                        if (arrayList4.get(0) instanceof MessageObject) {
                            obj = arrayList4.get(i10);
                        } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                            org.telegram.ui.vt0 vt0Var = ((org.telegram.ui.sr0) this.S).f42756a.f35634f7;
                            if (vt0Var != null) {
                                obj = vt0Var.g();
                            } else {
                                obj = null;
                            }
                        } else {
                            obj = "avatar_" + ((org.telegram.ui.sr0) this.S).f42756a.f35774v5;
                        }
                        freeReceiver.setImage(null, null, imageLocation, "80_80", 0L, null, obj, 1);
                        freeReceiver.setParam(i10);
                        i10++;
                        measuredWidth = i19;
                        measuredWidth2 = i20;
                    }
                }
                int i21 = measuredWidth2;
                if (i11 != Integer.MAX_VALUE) {
                    while (i11 >= 0) {
                        int i22 = ((i12 + i13) * (i11 - this.f28249f)) + i21 + i9 + i12;
                        if (i22 <= 0) {
                            break;
                        }
                        ImageLocation imageLocation2 = (ImageLocation) arrayList3.get(i11);
                        ImageReceiver freeReceiver2 = getFreeReceiver();
                        freeReceiver2.setImageCoords(i22, i17, i12, i16);
                        if (arrayList4.get(0) instanceof MessageObject) {
                            sb2 = arrayList4.get(i11);
                        } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                            org.telegram.ui.vt0 vt0Var2 = ((org.telegram.ui.sr0) this.S).f42756a.f35634f7;
                            if (vt0Var2 != null) {
                                sb2 = vt0Var2.g();
                            } else {
                                sb2 = null;
                            }
                        } else {
                            StringBuilder sb3 = new StringBuilder(str2);
                            str = str2;
                            sb3.append(((org.telegram.ui.sr0) this.S).f42756a.f35774v5);
                            sb2 = sb3.toString();
                            freeReceiver2.setImage(null, null, imageLocation2, "80_80", 0L, null, sb2, 1);
                            freeReceiver2.setParam(i11);
                            i11--;
                            str2 = str;
                        }
                        str = str2;
                        freeReceiver2.setImage(null, null, imageLocation2, "80_80", 0L, null, sb2, 1);
                        freeReceiver2.setParam(i11);
                        i11--;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f30.b():void");
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
        int i9 = this.P;
        if (i9 >= 0 && i9 < this.f28248e.size()) {
            this.M = true;
            this.I = false;
            int i10 = this.P;
            this.H = i10;
            this.B = i10;
            this.F = (this.f28250n + this.v) * (this.f28249f - i10);
            this.G = this.f28253w;
            this.f28254x = 1.0f;
            this.P = -1;
            e30 e30Var = this.S;
            if (e30Var != null) {
                PhotoViewer photoViewer = ((org.telegram.ui.sr0) e30Var).f42756a;
                if (PhotoViewer.R2(photoViewer.P4)) {
                    photoViewer.U2 = true;
                    photoViewer.T1(true);
                    photoViewer.A0(0, true);
                }
            }
        }
        invalidate();
    }

    public final void f() {
        int i9;
        List list;
        int i10;
        int i11;
        int i12 = this.f28253w;
        int abs = Math.abs(i12);
        int i13 = this.f28250n;
        int i14 = this.v;
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
            i9 = (i10 / ((i14 * 2) + i13)) + i11;
        } else {
            i9 = 0;
        }
        this.P = this.f28249f - i9;
        PhotoViewer photoViewer = ((org.telegram.ui.sr0) this.S).f42756a;
        int i17 = photoViewer.L4;
        ArrayList arrayList = photoViewer.W6;
        ArrayList arrayList2 = photoViewer.U6;
        org.telegram.ui.vt0 vt0Var = photoViewer.f35634f7;
        if (vt0Var != null) {
            list = vt0Var.getAll();
        } else {
            list = null;
        }
        int i18 = this.P;
        if (i17 != i18 && i18 >= 0 && i18 < this.d.size()) {
            Object obj = this.f28248e.get(this.P);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i16 = arrayList2.indexOf((MessageObject) obj);
            } else if (list != null && !list.isEmpty()) {
                i16 = list.indexOf((TL_iv.PageBlock) obj);
            } else if (arrayList != null && !arrayList.isEmpty()) {
                i16 = arrayList.indexOf((ImageLocation) obj);
            }
            if (i16 >= 0) {
                this.N = true;
                ((org.telegram.ui.sr0) this.S).a(i16);
            }
        }
        if (!this.L) {
            this.L = true;
            this.M = false;
        }
        a(this.f28253w, true);
    }

    public int getCount() {
        return this.d.size();
    }

    public int getIndex() {
        return this.f28249f;
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
        int i9;
        int i10;
        float f10;
        float interpolation;
        int i11;
        int i12;
        int i13;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z10 = this.Q;
        ArrayList arrayList = this.f28247c;
        if (z10 || !arrayList.isEmpty()) {
            float f11 = this.V;
            if (!this.R) {
                if (this.Q) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
            }
            Paint paint = this.f28245a;
            paint.setAlpha((int) (f11 * 127.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (!arrayList.isEmpty()) {
                int i14 = this.f28253w;
                int i15 = this.f28250n;
                int i16 = (int) (i15 * 2.0f);
                int dp = AndroidUtilities.dp(8.0f);
                int i17 = this.f28249f;
                ArrayList arrayList2 = this.d;
                ImageLocation imageLocation = (ImageLocation) arrayList2.get(i17);
                int i18 = this.f28251r;
                if (imageLocation != null && (photoSize2 = imageLocation.photoSize) != null) {
                    i9 = Math.max(i15, (int) ((i18 / photoSize2.h) * photoSize2.f22405w));
                } else {
                    i9 = i18;
                }
                int min = Math.min(i16, i9);
                float f12 = dp * 2;
                float f13 = this.f28255y;
                int i19 = (int) (f12 * f13);
                int i20 = ((int) ((min - i15) * f13)) + i15 + i19;
                int i21 = this.B;
                if (i21 >= 0 && i21 < arrayList2.size()) {
                    ImageLocation imageLocation2 = (ImageLocation) arrayList2.get(this.B);
                    if (imageLocation2 != null && (photoSize = imageLocation2.photoSize) != null) {
                        i18 = Math.max(i15, (int) ((i18 / photoSize.h) * photoSize.f22405w));
                    }
                } else {
                    i18 = i15;
                }
                int min2 = Math.min(i16, i18);
                float f14 = this.A;
                int i22 = (int) (f12 * f14);
                float f15 = i14;
                float f16 = (((min2 + i22) - i15) / 2) * f14;
                if (this.B > this.f28249f) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                int i23 = (int) ((f16 * i10) + f15);
                int i24 = ((int) ((min2 - i15) * f14)) + i15 + i22;
                int measuredWidth = (getMeasuredWidth() - i20) / 2;
                int i25 = 0;
                for (int size = arrayList.size(); i25 < size; size = i13) {
                    ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i25);
                    int param = imageReceiver.getParam();
                    int i26 = this.f28249f;
                    if (param == i26) {
                        imageReceiver.setImageX((i19 / 2) + measuredWidth + i23);
                        imageReceiver.setImageWidth(i20 - i19);
                        i13 = size;
                    } else {
                        int i27 = this.B;
                        int i28 = this.v;
                        if (i27 < i26) {
                            if (param < i26) {
                                if (param <= i27) {
                                    imageReceiver.setImageX(((((i15 + i28) * ((imageReceiver.getParam() - this.f28249f) + 1)) + measuredWidth) - (i28 + i24)) + i23);
                                } else {
                                    imageReceiver.setImageX(((i28 + i15) * (imageReceiver.getParam() - this.f28249f)) + measuredWidth + i23);
                                }
                                i13 = size;
                            } else {
                                i13 = size;
                                imageReceiver.setImageX(((i28 + i15) * ((imageReceiver.getParam() - this.f28249f) - 1)) + measuredWidth + i20 + i28 + i23);
                            }
                        } else {
                            i13 = size;
                            if (param < i26) {
                                imageReceiver.setImageX(((i28 + i15) * (imageReceiver.getParam() - this.f28249f)) + measuredWidth + i23);
                            } else if (param <= i27) {
                                imageReceiver.setImageX(((i28 + i15) * ((imageReceiver.getParam() - this.f28249f) - 1)) + measuredWidth + i20 + i28 + i23);
                            } else {
                                imageReceiver.setImageX(i28 + i24 + ((i15 + i28) * ((imageReceiver.getParam() - this.f28249f) - 2)) + measuredWidth + i20 + i28 + i23);
                            }
                        }
                        if (param == this.B) {
                            imageReceiver.setImageWidth(i24 - i22);
                            imageReceiver.setImageX((int) (imageReceiver.getImageX() + (i22 / 2)));
                        } else {
                            imageReceiver.setImageWidth(i15);
                        }
                    }
                    imageReceiver.setAlpha(this.V);
                    imageReceiver.setRoundRadius(AndroidUtilities.dp(2.0f));
                    imageReceiver.draw(canvas);
                    i25++;
                }
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - this.C;
                if (j10 > 17) {
                    j10 = 17;
                }
                this.C = currentTimeMillis;
                int i29 = this.H;
                if (i29 >= 0) {
                    float f17 = this.f28254x;
                    if (f17 > 0.0f) {
                        float f18 = (float) j10;
                        if (this.I) {
                            f10 = 100.0f;
                        } else {
                            f10 = 200.0f;
                        }
                        float f19 = f17 - (f18 / f10);
                        this.f28254x = f19;
                        if (i29 == this.f28249f) {
                            float f20 = this.f28255y;
                            if (f20 < 1.0f) {
                                float f21 = (f18 / 200.0f) + f20;
                                this.f28255y = f21;
                                if (f21 > 1.0f) {
                                    this.f28255y = 1.0f;
                                }
                            }
                            this.f28253w = this.G + ((int) Math.ceil(this.f28255y * (this.F - i12)));
                        } else {
                            gr grVar = gr.f28845g;
                            this.A = grVar.getInterpolation(1.0f - f19);
                            if (this.M) {
                                float f22 = this.f28255y;
                                if (f22 > 0.0f) {
                                    float f23 = f22 - (f18 / 200.0f);
                                    this.f28255y = f23;
                                    if (f23 < 0.0f) {
                                        this.f28255y = 0.0f;
                                    }
                                }
                                this.f28253w = this.G + ((int) Math.ceil(interpolation * (this.F - i11)));
                            } else {
                                this.f28255y = grVar.getInterpolation(this.f28254x);
                                this.f28253w = (int) Math.ceil(this.A * this.F);
                            }
                        }
                        if (this.f28254x <= 0.0f) {
                            this.f28249f = this.H;
                            this.f28254x = 1.0f;
                            this.f28255y = 1.0f;
                            this.A = 0.0f;
                            this.D = false;
                            this.M = false;
                            this.f28253w = 0;
                            this.H = -1;
                            this.I = false;
                        }
                    }
                    a(this.f28253w, true);
                    invalidate();
                }
                if (this.L) {
                    float f24 = this.f28255y;
                    if (f24 > 0.0f) {
                        float f25 = f24 - (((float) j10) / 200.0f);
                        this.f28255y = f25;
                        if (f25 < 0.0f) {
                            this.f28255y = 0.0f;
                        }
                        invalidate();
                    }
                }
                Scroller scroller = this.J;
                if (!scroller.isFinished()) {
                    if (scroller.computeScrollOffset()) {
                        this.f28253w = scroller.getCurrX();
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
        Scroller scroller = this.J;
        scroller.abortAnimation();
        if (this.d.size() >= 10) {
            scroller.fling(this.f28253w, 0, Math.round(f10), 0, getMinScrollX(), getMaxScrollX(), 0, 0);
            return false;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        a(0, false);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f28253w = (int) (this.f28253w - f10);
        int minScrollX = getMinScrollX();
        int maxScrollX = getMaxScrollX();
        int i9 = this.f28253w;
        if (i9 < minScrollX) {
            this.f28253w = minScrollX;
        } else if (i9 > maxScrollX) {
            this.f28253w = maxScrollX;
        }
        f();
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        List list;
        PhotoViewer photoViewer = ((org.telegram.ui.sr0) this.S).f42756a;
        int i9 = photoViewer.L4;
        ArrayList arrayList = photoViewer.W6;
        ArrayList arrayList2 = photoViewer.U6;
        org.telegram.ui.vt0 vt0Var = photoViewer.f35634f7;
        if (vt0Var != null) {
            list = vt0Var.getAll();
        } else {
            list = null;
        }
        e();
        ArrayList arrayList3 = this.f28247c;
        int size = arrayList3.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            ImageReceiver imageReceiver = (ImageReceiver) arrayList3.get(i10);
            if (imageReceiver.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                int param = imageReceiver.getParam();
                if (param >= 0) {
                    ArrayList arrayList4 = this.f28248e;
                    if (param < arrayList4.size()) {
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            int indexOf = arrayList2.indexOf((MessageObject) arrayList4.get(param));
                            if (i9 != indexOf) {
                                this.f28254x = 1.0f;
                                this.E = true;
                                ((org.telegram.ui.sr0) this.S).a(indexOf);
                                return false;
                            }
                        } else if (list != null && !list.isEmpty()) {
                            int indexOf2 = list.indexOf((TL_iv.PageBlock) arrayList4.get(param));
                            if (i9 != indexOf2) {
                                this.f28254x = 1.0f;
                                this.E = true;
                                ((org.telegram.ui.sr0) this.S).a(indexOf2);
                                return false;
                            }
                        } else if (arrayList != null && !arrayList.isEmpty()) {
                            int indexOf3 = arrayList.indexOf((ImageLocation) arrayList4.get(param));
                            if (i9 != indexOf3) {
                                this.f28254x = 1.0f;
                                this.E = true;
                                ((org.telegram.ui.sr0) this.S).a(indexOf3);
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

    public void setDelegate(e30 e30Var) {
        this.S = e30Var;
    }

    public void setMoveProgress(float f10) {
        boolean z10;
        if (!this.L && this.H < 0) {
            int i9 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i9 > 0) {
                this.B = this.f28249f - 1;
            } else {
                this.B = this.f28249f + 1;
            }
            int i10 = this.B;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                this.f28255y = 1.0f - Math.abs(f10);
            } else {
                this.f28255y = 1.0f;
            }
            this.A = 1.0f - this.f28255y;
            if (i9 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.D = z10;
            invalidate();
            if (!arrayList.isEmpty()) {
                if (f10 >= 0.0f || this.f28249f != arrayList.size() - 1) {
                    if (i9 <= 0 || this.f28249f != 0) {
                        int i11 = (int) (f10 * (this.f28250n + this.v));
                        this.f28253w = i11;
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
