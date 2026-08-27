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
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.PhotoViewer;

public final class k30 extends View implements GestureDetector.OnGestureListener {
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
    public j30 S;
    public ValueAnimator T;
    public ValueAnimator U;
    public float V;

    public final Paint f29930a;

    public final ArrayList f29931b;

    public final ArrayList f29932c;
    public final ArrayList d;

    public final ArrayList f29933e;

    public int f29934f;
    public long h;

    public final int f29935n;

    public final int f29936r;

    public final int f29937s;
    public final int v;

    public int f29938w;

    public float f29939x;

    public float f29940y;

    public k30(ContextThemeWrapper contextThemeWrapper, int i10) {
        super(contextThemeWrapper);
        Paint paint = new Paint();
        this.f29930a = paint;
        this.f29931b = new ArrayList();
        this.f29932c = new ArrayList();
        this.d = new ArrayList();
        this.f29933e = new ArrayList();
        this.f29940y = 1.0f;
        this.A = 0.0f;
        this.H = -1;
        this.O = true;
        this.P = -1;
        this.R = true;
        this.K = new GestureDetector(contextThemeWrapper, this);
        this.J = new Scroller(contextThemeWrapper);
        this.f29935n = AndroidUtilities.dp(42.0f);
        this.f29936r = AndroidUtilities.dp(56.0f);
        this.v = AndroidUtilities.dp(1.0f);
        this.f29937s = i10;
        paint.setColor(2130706432);
    }

    private ImageReceiver getFreeReceiver() {
        ImageReceiver imageReceiver;
        ArrayList arrayList = this.f29931b;
        if (arrayList.isEmpty()) {
            imageReceiver = new ImageReceiver(this);
            imageReceiver.setAllowLoadingOnAttachedOnly(false);
        } else {
            ImageReceiver imageReceiver2 = (ImageReceiver) arrayList.get(0);
            arrayList.remove(0);
            imageReceiver = imageReceiver2;
        }
        this.f29932c.add(imageReceiver);
        imageReceiver.setCurrentAccount(((org.telegram.ui.tr0) this.S).f43000a.P);
        return imageReceiver;
    }

    private int getMaxScrollX() {
        return ((this.v * 2) + this.f29935n) * this.f29934f;
    }

    private int getMinScrollX() {
        return ((this.v * 2) + this.f29935n) * (-((this.d.size() - this.f29934f) - 1));
    }

    public final void a(int i10, boolean z10) {
        int iMax;
        int iMin;
        Object objG;
        Object objG2;
        ArrayList arrayList = this.f29931b;
        ArrayList arrayList2 = this.f29932c;
        if (!z10 && !arrayList2.isEmpty()) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.D = false;
            this.f29939x = 1.0f;
            this.f29940y = 1.0f;
            this.A = 0.0f;
        }
        invalidate();
        if (getMeasuredWidth() != 0) {
            ArrayList arrayList3 = this.d;
            if (arrayList3.isEmpty()) {
                return;
            }
            int measuredWidth = getMeasuredWidth();
            int measuredWidth2 = getMeasuredWidth() / 2;
            int i11 = this.f29935n;
            int i12 = measuredWidth2 - (i11 / 2);
            int i13 = this.v;
            if (z10) {
                int size = arrayList2.size();
                int i14 = 0;
                iMax = Integer.MIN_VALUE;
                iMin = Integer.MAX_VALUE;
                while (i14 < size) {
                    ImageReceiver imageReceiver = (ImageReceiver) arrayList2.get(i14);
                    int param = imageReceiver.getParam();
                    int i15 = ((i11 + i13) * (param - this.f29934f)) + i12 + i10;
                    if (i15 > measuredWidth || i15 + i11 < 0) {
                        arrayList.add(imageReceiver);
                        arrayList2.remove(i14);
                        size--;
                        i14--;
                    }
                    iMin = Math.min(iMin, param - 1);
                    iMax = Math.max(iMax, param + 1);
                    i14++;
                }
            } else {
                iMax = this.f29934f;
                iMin = iMax - 1;
            }
            String str = "avatar_";
            int i16 = this.f29936r;
            int i17 = this.f29937s;
            ArrayList arrayList4 = this.f29933e;
            if (iMax != Integer.MIN_VALUE) {
                int size2 = arrayList3.size();
                while (iMax < size2) {
                    int i18 = ((i11 + i13) * (iMax - this.f29934f)) + i12 + i10;
                    if (i18 >= measuredWidth) {
                        break;
                    }
                    ImageLocation imageLocation = (ImageLocation) arrayList3.get(iMax);
                    ImageReceiver freeReceiver = getFreeReceiver();
                    int i19 = measuredWidth;
                    int i20 = i12;
                    freeReceiver.setImageCoords(i18, i17, i11, i16);
                    if (arrayList4.get(0) instanceof MessageObject) {
                        objG2 = arrayList4.get(iMax);
                    } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                        org.telegram.ui.wt0 wt0Var = ((org.telegram.ui.tr0) this.S).f43000a.f35637f7;
                        objG2 = wt0Var != null ? wt0Var.g() : null;
                    } else {
                        objG2 = "avatar_" + ((org.telegram.ui.tr0) this.S).f43000a.f35777v5;
                    }
                    freeReceiver.setImage(null, null, imageLocation, "80_80", 0L, null, objG2, 1);
                    freeReceiver.setParam(iMax);
                    iMax++;
                    measuredWidth = i19;
                    i12 = i20;
                }
            }
            int i21 = i12;
            if (iMin != Integer.MAX_VALUE) {
                while (iMin >= 0) {
                    int i22 = ((i11 + i13) * (iMin - this.f29934f)) + i21 + i10 + i11;
                    if (i22 <= 0) {
                        break;
                    }
                    ImageLocation imageLocation2 = (ImageLocation) arrayList3.get(iMin);
                    ImageReceiver freeReceiver2 = getFreeReceiver();
                    freeReceiver2.setImageCoords(i22, i17, i11, i16);
                    if (arrayList4.get(0) instanceof MessageObject) {
                        objG = arrayList4.get(iMin);
                    } else {
                        if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                            org.telegram.ui.wt0 wt0Var2 = ((org.telegram.ui.tr0) this.S).f43000a.f35637f7;
                            objG = wt0Var2 != null ? wt0Var2.g() : null;
                        } else {
                            objG = str + ((org.telegram.ui.tr0) this.S).f43000a.f35777v5;
                        }
                        freeReceiver2.setImage(null, null, imageLocation2, "80_80", 0L, null, objG, 1);
                        freeReceiver2.setParam(iMin);
                        iMin--;
                        str = str;
                    }
                    freeReceiver2.setImage(null, null, imageLocation2, "80_80", 0L, null, objG, 1);
                    freeReceiver2.setParam(iMin);
                    iMin--;
                    str = str;
                }
            }
            ValueAnimator valueAnimator = this.T;
            if (valueAnimator == null || valueAnimator.isStarted()) {
                return;
            }
            this.T.start();
        }
    }

    public final void b() {
        long j10;
        char c10;
        Object obj;
        int i10;
        boolean z10;
        TL_iv.PageBlock pageBlock;
        TL_iv.PageBlock pageBlock2;
        TL_iv.PageBlock pageBlock3;
        int i11;
        int i12;
        org.telegram.ui.au0 au0Var;
        boolean z11;
        int i13;
        if (this.N) {
            this.N = false;
            return;
        }
        PhotoViewer photoViewer = ((org.telegram.ui.tr0) this.S).f43000a;
        int size = photoViewer.L4;
        ArrayList arrayList = photoViewer.W6;
        ArrayList arrayList2 = photoViewer.U6;
        org.telegram.ui.wt0 wt0Var = photoViewer.f35637f7;
        List all = wt0Var != null ? wt0Var.getAll() : null;
        int i14 = ((org.telegram.ui.tr0) this.S).f43000a.v;
        this.Q = false;
        long j11 = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (size >= arrayList.size()) {
                size = arrayList.size() - 1;
            }
            ImageLocation imageLocation = (ImageLocation) arrayList.get(size);
            int size2 = arrayList.size();
            this.Q = true;
            j10 = 0;
            i10 = size2;
            z10 = false;
            c10 = 0;
            obj = imageLocation;
        } else if (arrayList2 == null || arrayList2.isEmpty()) {
            j10 = 0;
            c10 = 0;
            if (all == null || all.isEmpty()) {
                obj = null;
                i10 = 0;
                z10 = false;
            } else {
                pageBlock = (TL_iv.PageBlock) all.get(size);
                long j12 = pageBlock.groupId;
                if (j12 != this.h) {
                    this.h = j12;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.h != 0) {
                    this.Q = true;
                    int size3 = all.size();
                    int i15 = size;
                    i10 = 0;
                    while (true) {
                        if (i15 >= size3) {
                            pageBlock2 = pageBlock;
                            pageBlock3 = pageBlock2;
                            break;
                        }
                        pageBlock3 = pageBlock2;
                        if (((TL_iv.PageBlock) all.get(i15)).groupId != this.h) {
                            pageBlock2 = pageBlock;
                            break;
                        }
                        pageBlock2 = pageBlock;
                        i10++;
                        i15++;
                        pageBlock2 = pageBlock3;
                    }
                    for (int i16 = size - 1; i16 >= 0 && ((TL_iv.PageBlock) all.get(i16)).groupId == this.h; i16--) {
                        i10++;
                    }
                    obj = pageBlock3;
                } else {
                    i10 = 0;
                }
            }
        } else {
            if (size >= arrayList2.size()) {
                size = arrayList2.size() - 1;
            }
            MessageObject messageObject = (MessageObject) arrayList2.get(size);
            long groupIdForUse = messageObject.getGroupIdForUse();
            if (groupIdForUse != this.h) {
                this.h = groupIdForUse;
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z12 = arrayList2.size() > 1 && (au0Var = ((org.telegram.ui.tr0) this.S).f43000a.d) != null && au0Var.K();
            if (this.h != 0 || z12) {
                this.Q = true;
                int iMin = Math.min(size + 10, arrayList2.size());
                int i17 = size;
                i11 = 0;
                while (true) {
                    if (i17 >= iMin) {
                        j10 = j11;
                        break;
                    }
                    MessageObject messageObject2 = (MessageObject) arrayList2.get(i17);
                    if (i14 == 0 && !z12) {
                        j10 = j11;
                        if (messageObject2.getGroupIdForUse() != this.h) {
                            break;
                        }
                    } else {
                        j10 = j11;
                    }
                    i11++;
                    i17++;
                    j11 = j10;
                }
                int iMax = Math.max(size - 10, 0);
                int i18 = size - 1;
                while (true) {
                    if (i18 >= iMax) {
                        MessageObject messageObject3 = (MessageObject) arrayList2.get(i18);
                        if (i14 == 0 && !z12) {
                            i12 = size;
                            c10 = 0;
                            if (messageObject3.getGroupIdForUse() != this.h) {
                                break;
                            }
                        } else {
                            i12 = size;
                        }
                        i11++;
                        i18--;
                        size = i12;
                    } else {
                        i12 = size;
                    }
                }
                i10 = i11;
                size = i12;
                obj = messageObject;
            } else {
                i12 = size;
                j10 = 0;
                i11 = 0;
            }
            c10 = 0;
            i10 = i11;
            size = i12;
            obj = messageObject;
        }
        if (obj == null) {
            obj = pageBlock;
            return;
        }
        obj = pageBlock;
        boolean z13 = this.O;
        ArrayList arrayList3 = this.d;
        if (z13) {
            if (this.Q) {
                ValueAnimator valueAnimator = this.U;
                if (valueAnimator != null) {
                    this.U = null;
                    valueAnimator.cancel();
                }
                float f10 = this.V;
                if (f10 < 1.0f && this.T == null) {
                    final int i19 = 1;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, 1.0f);
                    this.T = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.setDuration((long) ((1.0f - this.V) * 200.0f));
                    this.T.addListener(new i30(this, i19));
                    this.T.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                        public final k30 f28914b;

                        {
                            this.f28914b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            switch (i19) {
                                case 0:
                                    k30 k30Var = this.f28914b;
                                    k30Var.getClass();
                                    k30Var.V = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    k30Var.invalidate();
                                    break;
                                default:
                                    k30 k30Var2 = this.f28914b;
                                    k30Var2.getClass();
                                    k30Var2.V = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    k30Var2.invalidate();
                                    break;
                            }
                        }
                    });
                }
            } else {
                ValueAnimator valueAnimator2 = this.T;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.T = null;
                }
                if (this.V > 0.0f && arrayList3.size() > 1) {
                    if (this.U == null) {
                        float[] fArr = new float[2];
                        fArr[c10] = this.V;
                        fArr[1] = 0.0f;
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr);
                        this.U = valueAnimatorOfFloat2;
                        valueAnimatorOfFloat2.setDuration((long) (this.V * 200.0f));
                        final int i20 = 0;
                        this.U.addListener(new i30(this, i20));
                        this.U.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                            public final k30 f28914b;

                            {
                                this.f28914b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                switch (i20) {
                                    case 0:
                                        k30 k30Var = this.f28914b;
                                        k30Var.getClass();
                                        k30Var.V = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        k30Var.invalidate();
                                        break;
                                    default:
                                        k30 k30Var2 = this.f28914b;
                                        k30Var2.getClass();
                                        k30Var2.V = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                        k30Var2.invalidate();
                                        break;
                                }
                            }
                        });
                        this.U.start();
                        return;
                    }
                    return;
                }
            }
        }
        ArrayList arrayList4 = this.f29933e;
        if (z10) {
            z11 = false;
        } else if (i10 == arrayList3.size() && arrayList4.contains(obj)) {
            int iIndexOf = arrayList4.indexOf(obj);
            int i21 = this.f29934f;
            if (i21 == iIndexOf || iIndexOf == -1) {
                z11 = false;
            } else {
                boolean z14 = this.E;
                if (!z14 && !this.D && (iIndexOf == i21 - 1 || iIndexOf == i21 + 1)) {
                    this.I = true;
                    z14 = true;
                }
                int i22 = this.v;
                int i23 = this.f29935n;
                if (z14) {
                    this.H = iIndexOf;
                    this.B = iIndexOf;
                    this.F = (i23 + i22) * (i21 - iIndexOf);
                    this.D = true;
                    z11 = false;
                    this.E = false;
                    this.C = System.currentTimeMillis();
                    invalidate();
                } else {
                    z11 = false;
                    a((i23 + i22) * (i21 - iIndexOf), true);
                    this.f29934f = iIndexOf;
                    this.D = false;
                }
                this.f29938w = z11 ? 1 : 0;
            }
        } else {
            z11 = false;
            z10 = true;
        }
        if (z10) {
            int size4 = arrayList3.size();
            this.E = z11;
            arrayList3.clear();
            arrayList4.clear();
            if (arrayList != null && !arrayList.isEmpty()) {
                arrayList4.addAll(arrayList);
                arrayList3.addAll(arrayList);
                this.f29934f = size;
                this.H = -1;
                this.I = z11;
            } else if (arrayList2 == null || arrayList2.isEmpty()) {
                int i24 = size;
                if (all != null && !all.isEmpty() && this.h != j10) {
                    int size5 = all.size();
                    for (int i25 = i24; i25 < size5; i25++) {
                        TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) all.get(i25);
                        if (pageBlock4.groupId != this.h) {
                            break;
                        }
                        arrayList4.add(pageBlock4);
                        arrayList3.add(ImageLocation.getForObject(pageBlock4.thumb, pageBlock4.thumbObject));
                    }
                    int i26 = 0;
                    this.f29934f = 0;
                    this.H = -1;
                    this.I = false;
                    int i27 = i24 - 1;
                    while (i27 >= 0) {
                        TL_iv.PageBlock pageBlock5 = (TL_iv.PageBlock) all.get(i27);
                        if (pageBlock5.groupId != this.h) {
                            break;
                        }
                        arrayList4.add(i26, pageBlock5);
                        arrayList3.add(i26, ImageLocation.getForObject(pageBlock5.thumb, pageBlock5.thumbObject));
                        this.f29934f++;
                        i27--;
                        i26 = 0;
                    }
                }
            } else {
                org.telegram.ui.au0 au0Var2 = ((org.telegram.ui.tr0) this.S).f43000a.d;
                boolean z15 = (au0Var2 != null && au0Var2.K()) && arrayList2.size() > 1;
                if (this.h != j10 || z15 || i14 != 0) {
                    int iMin2 = Math.min(size + 10, arrayList2.size());
                    int i28 = size;
                    while (true) {
                        if (i28 >= iMin2) {
                            i13 = size;
                            break;
                        }
                        MessageObject messageObject4 = (MessageObject) arrayList2.get(i28);
                        if (i14 == 0 && !z15) {
                            i13 = size;
                            if (messageObject4.getGroupIdForUse() != this.h) {
                                break;
                            }
                        } else {
                            i13 = size;
                        }
                        arrayList4.add(messageObject4);
                        arrayList3.add(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject4.photoThumbs, 56, true), messageObject4.photoThumbsObject));
                        i28++;
                        size = i13;
                    }
                    this.f29934f = 0;
                    this.H = -1;
                    this.I = false;
                    int iMax2 = Math.max(i13 - 10, 0);
                    for (int i29 = i13 - 1; i29 >= iMax2; i29--) {
                        MessageObject messageObject5 = (MessageObject) arrayList2.get(i29);
                        if (i14 == 0 && !z15 && messageObject5.getGroupIdForUse() != this.h) {
                            break;
                        }
                        arrayList4.add(0, messageObject5);
                        arrayList3.add(0, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject5.photoThumbs, 56, true), messageObject5.photoThumbsObject));
                        this.f29934f++;
                    }
                }
            }
            if (arrayList3.size() == 1) {
                arrayList3.clear();
                arrayList4.clear();
            }
            if (arrayList3.size() != size4) {
                requestLayout();
            }
            a(0, false);
        }
    }

    public final boolean c() {
        if (!this.Q || this.U != null) {
            return false;
        }
        if (this.V > 0.0f || !this.R) {
            return true;
        }
        ValueAnimator valueAnimator = this.T;
        return valueAnimator != null && valueAnimator.isStarted();
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
        if (i10 >= 0 && i10 < this.f29933e.size()) {
            this.M = true;
            this.I = false;
            int i11 = this.P;
            this.H = i11;
            this.B = i11;
            this.F = (this.f29935n + this.v) * (this.f29934f - i11);
            this.G = this.f29938w;
            this.f29939x = 1.0f;
            this.P = -1;
            j30 j30Var = this.S;
            if (j30Var != null) {
                PhotoViewer photoViewer = ((org.telegram.ui.tr0) j30Var).f43000a;
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
        int i11;
        int i12;
        int i13 = this.f29938w;
        int iAbs = Math.abs(i13);
        int i14 = this.f29935n;
        int i15 = this.v;
        int i16 = (i14 / 2) + i15;
        int iIndexOf = -1;
        if (iAbs > i16) {
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
        this.P = this.f29934f - i10;
        PhotoViewer photoViewer = ((org.telegram.ui.tr0) this.S).f43000a;
        int i17 = photoViewer.L4;
        ArrayList arrayList = photoViewer.W6;
        ArrayList arrayList2 = photoViewer.U6;
        org.telegram.ui.wt0 wt0Var = photoViewer.f35637f7;
        List all = wt0Var != null ? wt0Var.getAll() : null;
        int i18 = this.P;
        if (i17 != i18 && i18 >= 0 && i18 < this.d.size()) {
            Object obj = this.f29933e.get(this.P);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                iIndexOf = arrayList2.indexOf((MessageObject) obj);
            } else if (all != null && !all.isEmpty()) {
                iIndexOf = all.indexOf((TL_iv.PageBlock) obj);
            } else if (arrayList != null && !arrayList.isEmpty()) {
                iIndexOf = arrayList.indexOf((ImageLocation) obj);
            }
            if (iIndexOf >= 0) {
                this.N = true;
                ((org.telegram.ui.tr0) this.S).a(iIndexOf);
            }
        }
        if (!this.L) {
            this.L = true;
            this.M = false;
        }
        a(this.f29938w, true);
    }

    public int getCount() {
        return this.d.size();
    }

    public int getIndex() {
        return this.f29934f;
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
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z10 = this.Q;
        ArrayList arrayList = this.f29932c;
        if (z10 || !arrayList.isEmpty()) {
            float f10 = this.V;
            if (!this.R) {
                f10 = this.Q ? 1.0f : 0.0f;
            }
            Paint paint = this.f29930a;
            paint.setAlpha((int) (f10 * 127.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (arrayList.isEmpty()) {
                return;
            }
            int i11 = this.f29938w;
            int i12 = this.f29935n;
            int i13 = (int) (i12 * 2.0f);
            int iDp = AndroidUtilities.dp(8.0f);
            int i14 = this.f29934f;
            ArrayList arrayList2 = this.d;
            ImageLocation imageLocation = (ImageLocation) arrayList2.get(i14);
            int iMax = this.f29936r;
            int iMin = Math.min(i13, (imageLocation == null || (photoSize2 = imageLocation.photoSize) == null) ? iMax : Math.max(i12, (int) ((iMax / photoSize2.h) * photoSize2.f22405w)));
            float f11 = iDp * 2;
            float f12 = this.f29940y;
            int i15 = (int) (f11 * f12);
            int i16 = ((int) ((iMin - i12) * f12)) + i12 + i15;
            int i17 = this.B;
            if (i17 < 0 || i17 >= arrayList2.size()) {
                iMax = i12;
            } else {
                ImageLocation imageLocation2 = (ImageLocation) arrayList2.get(this.B);
                if (imageLocation2 != null && (photoSize = imageLocation2.photoSize) != null) {
                    iMax = Math.max(i12, (int) ((iMax / photoSize.h) * photoSize.f22405w));
                }
            }
            int iMin2 = Math.min(i13, iMax);
            float f13 = this.A;
            int i18 = (int) (f11 * f13);
            int i19 = (int) (((((iMin2 + i18) - i12) / 2) * f13 * (this.B > this.f29934f ? -1 : 1)) + i11);
            int i20 = ((int) ((iMin2 - i12) * f13)) + i12 + i18;
            int measuredWidth = (getMeasuredWidth() - i16) / 2;
            int i21 = 0;
            for (int size = arrayList.size(); i21 < size; size = i10) {
                ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i21);
                int param = imageReceiver.getParam();
                int i22 = this.f29934f;
                if (param == i22) {
                    imageReceiver.setImageX((i15 / 2) + measuredWidth + i19);
                    imageReceiver.setImageWidth(i16 - i15);
                    i10 = size;
                } else {
                    int i23 = this.B;
                    int i24 = this.v;
                    if (i23 >= i22) {
                        i10 = size;
                        if (param < i22) {
                            imageReceiver.setImageX(((i24 + i12) * (imageReceiver.getParam() - this.f29934f)) + measuredWidth + i19);
                        } else if (param <= i23) {
                            imageReceiver.setImageX(((i24 + i12) * ((imageReceiver.getParam() - this.f29934f) - 1)) + measuredWidth + i16 + i24 + i19);
                        } else {
                            imageReceiver.setImageX(i24 + i20 + ((i12 + i24) * ((imageReceiver.getParam() - this.f29934f) - 2)) + measuredWidth + i16 + i24 + i19);
                        }
                    } else if (param < i22) {
                        if (param <= i23) {
                            imageReceiver.setImageX(((((i12 + i24) * ((imageReceiver.getParam() - this.f29934f) + 1)) + measuredWidth) - (i24 + i20)) + i19);
                        } else {
                            imageReceiver.setImageX(((i24 + i12) * (imageReceiver.getParam() - this.f29934f)) + measuredWidth + i19);
                        }
                        i10 = size;
                    } else {
                        i10 = size;
                        imageReceiver.setImageX(((i24 + i12) * ((imageReceiver.getParam() - this.f29934f) - 1)) + measuredWidth + i16 + i24 + i19);
                    }
                    if (param == this.B) {
                        imageReceiver.setImageWidth(i20 - i18);
                        imageReceiver.setImageX((int) (imageReceiver.getImageX() + (i18 / 2)));
                    } else {
                        imageReceiver.setImageWidth(i12);
                    }
                }
                imageReceiver.setAlpha(this.V);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(2.0f));
                imageReceiver.draw(canvas);
                i21++;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = jCurrentTimeMillis - this.C;
            if (j10 > 17) {
                j10 = 17;
            }
            this.C = jCurrentTimeMillis;
            int i25 = this.H;
            if (i25 >= 0) {
                float f14 = this.f29939x;
                if (f14 > 0.0f) {
                    float f15 = j10;
                    float f16 = f14 - (f15 / (this.I ? 100.0f : 200.0f));
                    this.f29939x = f16;
                    if (i25 == this.f29934f) {
                        float f17 = this.f29940y;
                        if (f17 < 1.0f) {
                            float f18 = (f15 / 200.0f) + f17;
                            this.f29940y = f18;
                            if (f18 > 1.0f) {
                                this.f29940y = 1.0f;
                            }
                        }
                        int i26 = this.G;
                        this.f29938w = i26 + ((int) Math.ceil(this.f29940y * (this.F - i26)));
                    } else {
                        er erVar = er.f28123g;
                        float interpolation = erVar.getInterpolation(1.0f - f16);
                        this.A = interpolation;
                        if (this.M) {
                            float f19 = this.f29940y;
                            if (f19 > 0.0f) {
                                float f20 = f19 - (f15 / 200.0f);
                                this.f29940y = f20;
                                if (f20 < 0.0f) {
                                    this.f29940y = 0.0f;
                                }
                            }
                            int i27 = this.G;
                            this.f29938w = i27 + ((int) Math.ceil(interpolation * (this.F - i27)));
                        } else {
                            this.f29940y = erVar.getInterpolation(this.f29939x);
                            this.f29938w = (int) Math.ceil(this.A * this.F);
                        }
                    }
                    if (this.f29939x <= 0.0f) {
                        this.f29934f = this.H;
                        this.f29939x = 1.0f;
                        this.f29940y = 1.0f;
                        this.A = 0.0f;
                        this.D = false;
                        this.M = false;
                        this.f29938w = 0;
                        this.H = -1;
                        this.I = false;
                    }
                }
                a(this.f29938w, true);
                invalidate();
            }
            if (this.L) {
                float f21 = this.f29940y;
                if (f21 > 0.0f) {
                    float f22 = f21 - (j10 / 200.0f);
                    this.f29940y = f22;
                    if (f22 < 0.0f) {
                        this.f29940y = 0.0f;
                    }
                    invalidate();
                }
            }
            Scroller scroller = this.J;
            if (scroller.isFinished()) {
                return;
            }
            if (scroller.computeScrollOffset()) {
                this.f29938w = scroller.getCurrX();
                f();
                invalidate();
            }
            if (scroller.isFinished()) {
                e();
            }
        }
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        Scroller scroller = this.J;
        scroller.abortAnimation();
        if (this.d.size() < 10) {
            return false;
        }
        scroller.fling(this.f29938w, 0, Math.round(f10), 0, getMinScrollX(), getMaxScrollX(), 0, 0);
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a(0, false);
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f29938w = (int) (this.f29938w - f10);
        int minScrollX = getMinScrollX();
        int maxScrollX = getMaxScrollX();
        int i10 = this.f29938w;
        if (i10 < minScrollX) {
            this.f29938w = minScrollX;
        } else if (i10 > maxScrollX) {
            this.f29938w = maxScrollX;
        }
        f();
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        PhotoViewer photoViewer = ((org.telegram.ui.tr0) this.S).f43000a;
        int i10 = photoViewer.L4;
        ArrayList arrayList = photoViewer.W6;
        ArrayList arrayList2 = photoViewer.U6;
        org.telegram.ui.wt0 wt0Var = photoViewer.f35637f7;
        List all = wt0Var != null ? wt0Var.getAll() : null;
        e();
        ArrayList arrayList3 = this.f29932c;
        int size = arrayList3.size();
        for (int i11 = 0; i11 < size; i11++) {
            ImageReceiver imageReceiver = (ImageReceiver) arrayList3.get(i11);
            if (imageReceiver.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                int param = imageReceiver.getParam();
                if (param >= 0) {
                    ArrayList arrayList4 = this.f29933e;
                    if (param < arrayList4.size()) {
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            int iIndexOf = arrayList2.indexOf((MessageObject) arrayList4.get(param));
                            if (i10 != iIndexOf) {
                                this.f29939x = 1.0f;
                                this.E = true;
                                ((org.telegram.ui.tr0) this.S).a(iIndexOf);
                                return false;
                            }
                        } else if (all == null || all.isEmpty()) {
                            if (arrayList == null || arrayList.isEmpty()) {
                                break;
                                break;
                            }
                            int iIndexOf2 = arrayList.indexOf((ImageLocation) arrayList4.get(param));
                            if (i10 != iIndexOf2) {
                                this.f29939x = 1.0f;
                                this.E = true;
                                ((org.telegram.ui.tr0) this.S).a(iIndexOf2);
                                return false;
                            }
                        } else {
                            int iIndexOf3 = all.indexOf((TL_iv.PageBlock) arrayList4.get(param));
                            if (i10 != iIndexOf3) {
                                this.f29939x = 1.0f;
                                this.E = true;
                                ((org.telegram.ui.tr0) this.S).a(iIndexOf3);
                                return false;
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        if (!this.d.isEmpty() && getAlpha() == 1.0f) {
            z10 = this.K.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
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
            if (z10) {
                return;
            }
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

    public void setDelegate(j30 j30Var) {
        this.S = j30Var;
    }

    public void setMoveProgress(float f10) {
        if (this.L || this.H >= 0) {
            return;
        }
        if (f10 > 0.0f) {
            this.B = this.f29934f - 1;
        } else {
            this.B = this.f29934f + 1;
        }
        int i10 = this.B;
        ArrayList arrayList = this.d;
        if (i10 < 0 || i10 >= arrayList.size()) {
            this.f29940y = 1.0f;
        } else {
            this.f29940y = 1.0f - Math.abs(f10);
        }
        this.A = 1.0f - this.f29940y;
        this.D = f10 != 0.0f;
        invalidate();
        if (arrayList.isEmpty()) {
            return;
        }
        if (f10 >= 0.0f || this.f29934f != arrayList.size() - 1) {
            if (f10 <= 0.0f || this.f29934f != 0) {
                int i11 = (int) (f10 * (this.f29935n + this.v));
                this.f29938w = i11;
                a(i11, true);
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
