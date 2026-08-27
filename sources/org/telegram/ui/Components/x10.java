package org.telegram.ui.Components;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.PhotoViewer;

public final class x10 {

    public static final int f34418x;

    public static final int f34419y;

    public final int f34420a;

    public final int f34421b;

    public final int f34422c;
    public final int d;

    public final int f34423e;

    public final androidx.mediarouter.app.c f34424f;

    public final w10 f34425g;
    public v10 h;

    public boolean f34426i;

    public boolean f34427j;

    public boolean f34428k;

    public boolean f34429l;

    public boolean f34430m;

    public MotionEvent f34431n;

    public MotionEvent f34432o;

    public MotionEvent f34433p;

    public boolean f34434q;

    public float f34435r;

    public float f34436s;

    public float f34437t;

    public float f34438u;
    public boolean v;

    public VelocityTracker f34439w;

    static {
        ViewConfiguration.getLongPressTimeout();
        f34418x = ViewConfiguration.getTapTimeout();
        f34419y = ViewConfiguration.getDoubleTapTimeout();
    }

    public x10(Context context, PhotoViewer photoViewer) {
        this(context, (w10) photoViewer);
    }

    public final boolean a(MotionEvent motionEvent) {
        w10 w10Var;
        androidx.mediarouter.app.c cVar;
        boolean z10;
        MotionEvent motionEvent2;
        long j10;
        long j11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.ui.ht0 ht0Var;
        MessageObject messageObject;
        org.telegram.ui.ht0 ht0Var2;
        v10 v10Var;
        boolean zOnScroll;
        boolean z15;
        int action = motionEvent.getAction();
        MotionEvent motionEvent3 = this.f34432o;
        if (motionEvent3 != null) {
            motionEvent3.recycle();
        }
        this.f34432o = MotionEvent.obtain(motionEvent);
        if (this.f34439w == null) {
            this.f34439w = VelocityTracker.obtain();
        }
        this.f34439w.addMovement(motionEvent);
        int i10 = action & 255;
        boolean z16 = i10 == 6;
        int actionIndex = z16 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float x8 = 0.0f;
        float y10 = 0.0f;
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (actionIndex != i11) {
                x8 += motionEvent.getX(i11);
                y10 += motionEvent.getY(i11);
            }
        }
        float f10 = z16 ? pointerCount - 1 : pointerCount;
        float f11 = x8 / f10;
        float f12 = y10 / f10;
        w10 w10Var2 = this.f34425g;
        androidx.mediarouter.app.c cVar2 = this.f34424f;
        if (i10 != 0) {
            if (i10 == 1) {
                boolean zOnFling = false;
                this.f34426i = false;
                w10Var2.b1();
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                if (!this.f34434q) {
                    if (this.f34428k) {
                        cVar2.removeMessages(3);
                        this.f34428k = false;
                    } else if (this.f34429l) {
                        boolean zOnSingleTapUp = w10Var2.onSingleTapUp(motionEvent);
                        if (this.f34427j && (v10Var = this.h) != null) {
                            ((PhotoViewer) v10Var).Z1(motionEvent);
                        }
                        zOnFling = zOnSingleTapUp;
                    } else {
                        VelocityTracker velocityTracker = this.f34439w;
                        int pointerId = motionEvent.getPointerId(0);
                        velocityTracker.computeCurrentVelocity(1000, this.f34423e);
                        float yVelocity = velocityTracker.getYVelocity(pointerId);
                        float xVelocity = velocityTracker.getXVelocity(pointerId);
                        if (Math.abs(yVelocity) > this.d || Math.abs(xVelocity) > this.d) {
                            zOnFling = w10Var2.onFling(this.f34431n, motionEvent, xVelocity, yVelocity);
                        }
                    }
                    zOnFling = false;
                }
                MotionEvent motionEvent4 = this.f34433p;
                if (motionEvent4 != null) {
                    motionEvent4.recycle();
                }
                this.f34433p = motionEventObtain;
                VelocityTracker velocityTracker2 = this.f34439w;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f34439w = null;
                }
                this.f34434q = false;
                this.f34427j = false;
                cVar2.removeMessages(1);
                cVar2.removeMessages(2);
                return zOnFling;
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    cVar2.removeMessages(1);
                    cVar2.removeMessages(2);
                    cVar2.removeMessages(3);
                    this.f34439w.recycle();
                    this.f34439w = null;
                    this.f34434q = false;
                    this.f34426i = false;
                    this.f34429l = false;
                    this.f34430m = false;
                    this.f34427j = false;
                    this.f34428k = false;
                    return false;
                }
                if (i10 == 5) {
                    this.f34435r = f11;
                    this.f34437t = f11;
                    this.f34436s = f12;
                    this.f34438u = f12;
                    cVar2.removeMessages(1);
                    cVar2.removeMessages(2);
                    cVar2.removeMessages(3);
                    this.f34434q = false;
                    this.f34429l = false;
                    this.f34430m = false;
                    this.f34427j = false;
                    this.f34428k = false;
                    return false;
                }
                if (i10 != 6) {
                    return false;
                }
                this.f34435r = f11;
                this.f34437t = f11;
                this.f34436s = f12;
                this.f34438u = f12;
                this.f34439w.computeCurrentVelocity(1000, this.f34423e);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = this.f34439w.getXVelocity(pointerId2);
                float yVelocity2 = this.f34439w.getYVelocity(pointerId2);
                for (int i12 = 0; i12 < pointerCount; i12++) {
                    if (i12 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i12);
                        if ((this.f34439w.getYVelocity(pointerId3) * yVelocity2) + (this.f34439w.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            this.f34439w.clear();
                            return false;
                        }
                    }
                }
                return false;
            }
            if (this.f34428k) {
                return false;
            }
            int i13 = Build.VERSION.SDK_INT;
            int i14 = 29;
            int classification = i13 >= 29 ? motionEvent.getClassification() : 0;
            boolean zHasMessages = cVar2.hasMessages(2);
            float f13 = this.f34435r - f11;
            float f14 = this.f34436s - f12;
            if (this.f34434q) {
                zHasMessages = zHasMessages;
                zOnScroll = false;
            } else {
                if (this.f34429l) {
                    int i15 = (int) (f11 - this.f34437t);
                    int i16 = (int) (f12 - this.f34438u);
                    int i17 = (i16 * i16) + (i15 * i15);
                    boolean z17 = i13 >= 29 && classification == 1;
                    int i18 = this.f34420a;
                    if (zHasMessages && z17) {
                        if (i17 > i18) {
                            cVar2.removeMessages(2);
                            cVar2.sendMessageDelayed(cVar2.obtainMessage(2, 0, 0), (long) (ViewConfiguration.getLongPressTimeout() * 2.0f));
                        }
                        i18 = (int) (i18 * 4.0f);
                    } else {
                        i17 = i17;
                        zHasMessages = zHasMessages;
                    }
                    int i19 = i17;
                    if (i19 > i18) {
                        zOnScroll = w10Var2.onScroll(this.f34431n, motionEvent, f13, f14);
                        this.f34435r = f11;
                        this.f34436s = f12;
                        z15 = false;
                        this.f34429l = false;
                        cVar2.removeMessages(3);
                        cVar2.removeMessages(1);
                        cVar2.removeMessages(2);
                    } else {
                        z15 = false;
                        zOnScroll = false;
                    }
                    if (i19 > this.f34421b) {
                        this.f34430m = z15;
                    }
                } else {
                    zHasMessages = zHasMessages;
                    if (Math.abs(f13) >= 1.0f || Math.abs(f14) >= 1.0f) {
                        zOnScroll = w10Var2.onScroll(this.f34431n, motionEvent, f13, f14);
                        this.f34435r = f11;
                        this.f34436s = f12;
                    } else {
                        zOnScroll = false;
                    }
                }
                i14 = 29;
            }
            if (i13 >= i14 && classification == 2 && zHasMessages) {
                cVar2.removeMessages(2);
                cVar2.sendMessage(cVar2.obtainMessage(2, 0, 0));
            }
            return zOnScroll;
        }
        this.f34427j = false;
        v10 v10Var2 = this.h;
        if (v10Var2 != null) {
            PhotoViewer photoViewer = (PhotoViewer) v10Var2;
            if (photoViewer.J0.getVisibility() != 0) {
                boolean[] zArr = photoViewer.f35747s1;
                if (!zArr[0] && !zArr[1]) {
                    float x10 = motionEvent.getX();
                    int iMin = Math.min(135, photoViewer.f35583a0.getMeasuredWidth() / 8);
                    if ((x10 < iMin || x10 > photoViewer.f35583a0.getMeasuredWidth() - iMin) && (messageObject = photoViewer.P4) != null && ((!messageObject.isVideo() && ((ht0Var2 = photoViewer.f35591b0) == null || !ht0Var2.f27746x)) || SystemClock.elapsedRealtime() - photoViewer.f35728q1 < 500 || !photoViewer.q0(motionEvent))) {
                        this.f34427j = true;
                        w10Var = w10Var2;
                        cVar = cVar2;
                        z10 = false;
                    }
                }
            }
            boolean zHasMessages2 = cVar2.hasMessages(3);
            if (zHasMessages2) {
                cVar2.removeMessages(3);
            }
            MotionEvent motionEvent5 = this.f34431n;
            int i20 = f34419y;
            if (motionEvent5 == null || (motionEvent2 = this.f34433p) == null || !zHasMessages2 || !this.f34430m) {
                w10Var = w10Var2;
            } else {
                long eventTime = motionEvent.getEventTime() - motionEvent2.getEventTime();
                if (eventTime <= i20 && eventTime >= 40) {
                    int x11 = ((int) motionEvent5.getX()) - ((int) motionEvent.getX());
                    int y11 = ((int) motionEvent5.getY()) - ((int) motionEvent.getY());
                    if ((y11 * y11) + (x11 * x11) < this.f34422c) {
                        this.f34434q = true;
                        v10 v10Var3 = this.h;
                        MotionEvent motionEvent6 = this.f34431n;
                        PhotoViewer photoViewer2 = (PhotoViewer) v10Var3;
                        if ((photoViewer2.B2 != null || ((ht0Var = photoViewer2.f35591b0) != null && ht0Var.f27746x)) && photoViewer2.f35651h3) {
                            long jO1 = photoViewer2.o1();
                            j10 = 0;
                            long jA1 = photoViewer2.A1();
                            float x12 = motionEvent6.getX();
                            int iK1 = photoViewer2.k1(photoViewer2.f35731q4) / 3;
                            float f15 = iK1 * 2;
                            if (photoViewer2.q0(motionEvent6)) {
                                long j12 = x12 >= f15 ? jO1 + 10000 : x12 < ((float) iK1) ? jO1 - 10000 : jO1;
                                if (jO1 != j12) {
                                    if (j12 > jA1) {
                                        j11 = jA1;
                                    } else {
                                        if (j12 < 0) {
                                            z11 = j12 >= -9000;
                                            j11 = 0;
                                        } else {
                                            j11 = j12;
                                        }
                                        if (z11) {
                                            photoViewer2.f35774v1.e(true);
                                            c61 c61Var = photoViewer2.f35774v1;
                                            if (x12 < iK1) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            c61Var.d(z12);
                                            c61 c61Var2 = photoViewer2.f35774v1;
                                            long j13 = c61Var2.f27342o + 10000;
                                            c61Var2.f27342o = j13;
                                            c61Var2.f27343p = LocaleController.formatPluralString("Seconds", (int) (j13 / 1000), new Object[0]);
                                            photoViewer2.t2(j11);
                                            photoViewer2.f35583a0.invalidate();
                                            photoViewer2.f35694m3.h(j11 / jA1, true);
                                            photoViewer2.f35704n3.invalidate();
                                        }
                                        cVar = cVar2;
                                    }
                                    z11 = true;
                                    if (z11) {
                                        photoViewer2.f35774v1.e(true);
                                        c61 c61Var3 = photoViewer2.f35774v1;
                                        if (x12 < iK1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        c61Var3.d(z12);
                                        c61 c61Var4 = photoViewer2.f35774v1;
                                        long j14 = c61Var4.f27342o + 10000;
                                        c61Var4.f27342o = j14;
                                        c61Var4.f27343p = LocaleController.formatPluralString("Seconds", (int) (j14 / 1000), new Object[0]);
                                        photoViewer2.t2(j11);
                                        photoViewer2.f35583a0.invalidate();
                                        photoViewer2.f35694m3.h(j11 / jA1, true);
                                        photoViewer2.f35704n3.invalidate();
                                    }
                                    cVar = cVar2;
                                }
                                z13 = true;
                                this.h.getClass();
                                z10 = z13;
                            }
                        } else {
                            j10 = 0;
                        }
                        if (photoViewer2.E6 && ((photoViewer2.W5 != 1.0f || (photoViewer2.U5 == 0.0f && photoViewer2.T5 == 0.0f)) && photoViewer2.f35672j6 == j10 && photoViewer2.f35670j4 == 0)) {
                            org.telegram.ui.yt0 yt0Var = photoViewer2.S0[0];
                            if (yt0Var == null || !yt0Var.f44911p || yt0Var.h == -1) {
                                cVar = cVar2;
                            } else {
                                cVar = cVar2;
                                if (Math.sqrt(Math.pow(((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) / 2.0f) - motionEvent6.getY(), 2.0d) + Math.pow((AndroidUtilities.displaySize.x / 2.0f) - motionEvent6.getX(), 2.0d)) < AndroidUtilities.dp(40.0f)) {
                                }
                                this.h.getClass();
                                z10 = z13;
                            }
                            if (photoViewer2.W5 == 1.0f) {
                                float fC = org.telegram.messenger.rl.c(3.0f, photoViewer2.W5, (motionEvent6.getX() - (photoViewer2.k1(photoViewer2.f35731q4) / 2)) - photoViewer2.T5, motionEvent6.getX() - (photoViewer2.k1(photoViewer2.f35731q4) / 2));
                                float fC2 = org.telegram.messenger.rl.c(3.0f, photoViewer2.W5, (motionEvent6.getY() - (photoViewer2.i1() / 2)) - photoViewer2.U5, motionEvent6.getY() - (photoViewer2.i1() / 2));
                                photoViewer2.w3(3.0f);
                                float f16 = photoViewer2.A6;
                                if (fC < f16) {
                                    fC = f16;
                                } else {
                                    f16 = photoViewer2.B6;
                                    if (fC > f16) {
                                        fC = f16;
                                    }
                                }
                                float f17 = photoViewer2.C6;
                                if (fC2 < f17) {
                                    fC2 = f17;
                                } else {
                                    f17 = photoViewer2.D6;
                                    if (fC2 > f17) {
                                        fC2 = f17;
                                    }
                                }
                                z14 = true;
                                photoViewer2.j0(3.0f, fC, fC2, true);
                            } else {
                                z14 = true;
                                photoViewer2.j0(1.0f, 0.0f, 0.0f, true);
                            }
                            photoViewer2.K6 = z14;
                            photoViewer2.D1();
                            z13 = true;
                            this.h.getClass();
                            z10 = z13;
                        } else {
                            cVar = cVar2;
                        }
                        z13 = false;
                        this.h.getClass();
                        z10 = z13;
                    }
                }
                w10Var = w10Var2;
            }
            cVar = cVar2;
            cVar.sendEmptyMessageDelayed(3, i20);
            z10 = false;
        } else {
            w10Var = w10Var2;
            cVar = cVar2;
            z10 = false;
        }
        this.f34435r = f11;
        this.f34437t = f11;
        this.f34436s = f12;
        this.f34438u = f12;
        MotionEvent motionEvent7 = this.f34431n;
        if (motionEvent7 != null) {
            motionEvent7.recycle();
        }
        this.f34431n = MotionEvent.obtain(motionEvent);
        this.f34429l = true;
        this.f34430m = true;
        this.f34426i = true;
        this.f34428k = false;
        if (this.v) {
            cVar.removeMessages(2);
            cVar.sendMessageDelayed(cVar.obtainMessage(2, 0, 0), ViewConfiguration.getLongPressTimeout());
        }
        cVar.sendEmptyMessageAtTime(1, this.f34431n.getDownTime() + ((long) f34418x));
        return w10Var.onDown(motionEvent) | z10;
    }

    public final void b() {
        this.v = false;
    }

    public x10(Context context, w10 w10Var) {
        int scaledTouchSlop;
        int touchSlop;
        int i10;
        this.f34424f = new androidx.mediarouter.app.c(this, 6);
        this.f34425g = w10Var;
        if (w10Var instanceof v10) {
            this.h = (v10) w10Var;
        }
        this.v = true;
        if (context == null) {
            touchSlop = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.f34423e = ViewConfiguration.getMaximumFlingVelocity();
            i10 = 100;
            scaledTouchSlop = touchSlop;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f34423e = viewConfiguration.getScaledMaximumFlingVelocity();
            touchSlop = scaledTouchSlop2;
            i10 = scaledDoubleTapSlop;
        }
        this.f34420a = touchSlop * touchSlop;
        this.f34421b = scaledTouchSlop * scaledTouchSlop;
        this.f34422c = i10 * i10;
    }
}
