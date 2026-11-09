package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b40 extends FrameLayout {
    public final RectF D;
    public int E;
    public int F;
    public float G;
    public long H;
    public final float[] I;
    public boolean J;
    public final e40 K;
    public final org.telegram.ui.Components.dh0 f43874a;
    public final TextView f43875b;
    public final TLRPC.GroupCallParticipant f43876c;
    public final org.telegram.ui.Components.ah0 d;
    public boolean f43877e;
    public float f43878f;
    public float h;
    public int f43879n;
    public double f43880r;
    public final Paint f43881s;
    public final Paint f43882w;
    public final Path f43883x;
    public final float[] f43884y;

    public b40(e40 e40Var, Context context, TLRPC.GroupCallParticipant groupCallParticipant) {
        super(context);
        Integer num;
        int i7;
        int i10;
        int L;
        int i11;
        int i12;
        this.K = e40Var;
        this.f43881s = new Paint(1);
        Paint paint = new Paint(1);
        this.f43882w = paint;
        this.f43883x = new Path();
        this.f43884y = new float[8];
        this.D = new RectF();
        this.I = new float[3];
        setWillNotDraw(false);
        this.f43876c = groupCallParticipant;
        this.f43880r = org.telegram.messenger.t3.H(groupCallParticipant) / 20000.0f;
        this.G = 1.0f;
        setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        org.telegram.ui.Components.ah0 ah0Var = new org.telegram.ui.Components.ah0(2131624204, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        this.d = ah0Var;
        ?? imageView = new ImageView(context);
        this.f43874a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(ah0Var);
        if (this.f43880r == 0.0d) {
            num = 1;
        } else {
            num = null;
        }
        imageView.setTag(num);
        if (org.telegram.messenger.id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView((View) imageView, c8.ha.d(-2, 40.0f, i7 | 16, 0.0f, 0.0f, 0.0f, 0.0f));
        if (this.f43880r == 0.0d) {
            i10 = 17;
        } else {
            i10 = 34;
        }
        ah0Var.P(i10);
        ah0Var.N(ah0Var.f31828f - 1, false, true);
        TextView textView = new TextView(context);
        this.f43875b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.Vg, null);
        textView.setTextSize(1, 16.0f);
        double H = org.telegram.messenger.t3.H(groupCallParticipant) / 100.0d;
        Locale locale = Locale.US;
        double max = H > 0.0d ? Math.max(H, 1.0d) : 0.0d;
        textView.setText(((int) max) + "%");
        if (org.telegram.messenger.id.f23157a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(43.0f);
        }
        if (org.telegram.messenger.id.f23157a0) {
            i11 = org.telegram.messenger.g0.L(43.0f);
        } else {
            i11 = 0;
        }
        textView.setPadding(L, 0, i11, 0);
        addView(textView, c8.ha.e(-2, -2, (org.telegram.messenger.id.f23157a0 ? 5 : 3) | 16));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
        int H2 = (int) (org.telegram.messenger.t3.H(groupCallParticipant) / 100.0d);
        int i13 = 0;
        while (true) {
            float[] fArr = this.I;
            if (i13 < fArr.length) {
                if (i13 == 0) {
                    i12 = 0;
                } else if (i13 == 1) {
                    i12 = 50;
                } else {
                    i12 = 150;
                }
                if (H2 > i12) {
                    fArr[i13] = 1.0f;
                } else {
                    fArr[i13] = 0.0f;
                }
                i13++;
            } else {
                return;
            }
        }
    }

    public final void a(double d, boolean z9) {
        double d2;
        int i7;
        TLObject M0;
        int i10;
        e40 e40Var = this.K;
        org.telegram.messenger.c cVar = e40Var.f45228k1;
        if (VoIPService.getSharedInstance() != null) {
            this.f43880r = d;
            TLRPC.GroupCallParticipant groupCallParticipant = this.f43876c;
            groupCallParticipant.volume = (int) (d * 20000.0d);
            int i11 = 0;
            groupCallParticipant.volume_by_admin = false;
            groupCallParticipant.flags |= 128;
            double H = org.telegram.messenger.t3.H(groupCallParticipant) / 100.0d;
            Locale locale = Locale.US;
            if (H > 0.0d) {
                d2 = Math.max(H, 1.0d);
            } else {
                d2 = 0.0d;
            }
            this.f43875b.setText(((int) d2) + "%");
            VoIPService.getSharedInstance().setParticipantVolume(groupCallParticipant, groupCallParticipant.volume);
            Integer num = null;
            if (z9) {
                long B1 = org.telegram.messenger.ij.B1(groupCallParticipant.peer);
                if (B1 > 0) {
                    M0 = org.telegram.messenger.qp.s1(cVar.f21765a).a2(Long.valueOf(B1));
                } else {
                    M0 = org.telegram.messenger.qp.s1(cVar.f21765a).M0(Long.valueOf(-B1));
                }
                TLObject tLObject = M0;
                if (groupCallParticipant.volume == 0) {
                    g30 g30Var = e40Var.W4;
                    if (g30Var != null) {
                        g30Var.dismiss();
                        e40Var.W4 = null;
                    }
                    e40Var.f1(true);
                    if (e40Var.S0()) {
                        i10 = 0;
                    } else {
                        i10 = 5;
                    }
                    e40Var.C1(groupCallParticipant, B1, i10);
                } else {
                    VoIPService.getSharedInstance().editCallMember(tLObject, null, null, Integer.valueOf(groupCallParticipant.volume), null, null);
                }
            }
            if (this.f43880r == 0.0d) {
                num = 1;
            }
            org.telegram.ui.Components.dh0 dh0Var = this.f43874a;
            if ((dh0Var.getTag() == null && num != null) || (dh0Var.getTag() != null && num == null)) {
                if (this.f43880r == 0.0d) {
                    i7 = 17;
                } else {
                    i7 = 34;
                }
                org.telegram.ui.Components.ah0 ah0Var = this.d;
                ah0Var.P(i7);
                if (this.f43880r != 0.0d) {
                    i11 = 17;
                }
                ah0Var.M(i11);
                ah0Var.start();
                dh0Var.setTag(num);
            }
        }
    }

    public final boolean b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f43878f = motionEvent.getX();
            this.h = motionEvent.getY();
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2) {
                if (!this.f43877e) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    if (Math.abs(motionEvent.getY() - this.h) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.f43878f) > viewConfiguration.getScaledTouchSlop()) {
                        this.f43877e = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                            int x10 = (int) motionEvent.getX();
                            this.f43879n = x10;
                            if (x10 < 0) {
                                this.f43879n = 0;
                            } else if (x10 > getMeasuredWidth()) {
                                this.f43879n = getMeasuredWidth();
                            }
                            this.J = true;
                            invalidate();
                            return true;
                        }
                    }
                } else if (this.J) {
                    int x11 = (int) motionEvent.getX();
                    this.f43879n = x11;
                    if (x11 < 0) {
                        this.f43879n = 0;
                    } else if (x11 > getMeasuredWidth()) {
                        this.f43879n = getMeasuredWidth();
                    }
                    a(this.f43879n / getMeasuredWidth(), false);
                    invalidate();
                    return true;
                }
            }
        } else {
            this.f43877e = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.h) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int x12 = (int) motionEvent.getX();
                    this.f43879n = x12;
                    if (x12 < 0) {
                        this.f43879n = 0;
                    } else if (x12 > getMeasuredWidth()) {
                        this.f43879n = getMeasuredWidth();
                    }
                    this.J = true;
                }
            }
            if (this.J) {
                if (motionEvent.getAction() == 1) {
                    a(this.f43879n / getMeasuredWidth(), true);
                }
                this.J = false;
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        float L;
        int i10;
        float f11;
        int i11;
        b40 b40Var = this;
        int i12 = b40Var.E;
        double d = b40Var.f43880r;
        if (d < 0.25d) {
            b40Var.E = -3385513;
        } else if (d > 0.25d && d < 0.5d) {
            b40Var.E = -3562181;
        } else if (d >= 0.5d && d <= 0.75d) {
            b40Var.E = -11027349;
        } else {
            b40Var.E = -11688225;
        }
        float f12 = 0.0f;
        float f13 = 1.0f;
        if (i12 == 0) {
            i7 = b40Var.E;
            b40Var.G = 1.0f;
        } else {
            int S0 = org.telegram.messenger.g0.S0(b40Var.G, 1.0f, b40Var.F, i12);
            if (i12 != b40Var.E) {
                b40Var.G = 0.0f;
                b40Var.F = S0;
            }
            i7 = S0;
        }
        Paint paint = b40Var.f43881s;
        paint.setColor(i7);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - b40Var.H;
        if (j3 > 17) {
            j3 = 17;
        }
        b40Var.H = elapsedRealtime;
        float f14 = b40Var.G;
        if (f14 < 1.0f) {
            float f15 = (((float) j3) / 200.0f) + f14;
            b40Var.G = f15;
            if (f15 > 1.0f) {
                b40Var.G = 1.0f;
            } else {
                b40Var.invalidate();
            }
        }
        Path path = b40Var.f43883x;
        path.reset();
        float f16 = 6.0f;
        float L2 = org.telegram.messenger.g0.L(6.0f);
        float[] fArr = b40Var.f43884y;
        fArr[7] = L2;
        fArr[6] = L2;
        int i13 = 1;
        fArr[1] = L2;
        int i14 = 0;
        fArr[0] = L2;
        if (b40Var.f43879n < org.telegram.messenger.g0.L(12.0f)) {
            f10 = Math.max(0.0f, (b40Var.f43879n - org.telegram.messenger.g0.L(6.0f)) / org.telegram.messenger.g0.L(6.0f));
        } else {
            f10 = 1.0f;
        }
        float L3 = org.telegram.messenger.g0.L(6.0f) * f10;
        fArr[5] = L3;
        fArr[4] = L3;
        fArr[3] = L3;
        fArr[2] = L3;
        RectF rectF = b40Var.D;
        rectF.set(0.0f, 0.0f, b40Var.f43879n, b40Var.getMeasuredHeight());
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        path.close();
        Canvas canvas2 = canvas;
        canvas2.drawPath(path, paint);
        int H = (int) (org.telegram.messenger.t3.H(b40Var.f43876c) / 100.0d);
        org.telegram.ui.Components.dh0 dh0Var = b40Var.f43874a;
        int L4 = org.telegram.messenger.g0.L(5.0f) + (dh0Var.getMeasuredWidth() / 2) + dh0Var.getLeft();
        int measuredHeight = (dh0Var.getMeasuredHeight() / 2) + dh0Var.getTop();
        int i15 = 0;
        while (true) {
            float[] fArr2 = b40Var.I;
            if (i15 < fArr2.length) {
                if (i15 == 0) {
                    L = org.telegram.messenger.g0.L(f16);
                    f11 = f12;
                    i11 = i14;
                } else {
                    if (i15 == i13) {
                        L = org.telegram.messenger.g0.L(10.0f);
                        i10 = 50;
                    } else {
                        L = org.telegram.messenger.g0.L(14.0f);
                        i10 = 150;
                    }
                    f11 = f12;
                    i11 = i10;
                }
                float f17 = f13;
                float f18 = fArr2[i15];
                float L5 = (f17 - f18) * org.telegram.messenger.g0.L(2.0f);
                Paint paint2 = b40Var.f43882w;
                paint2.setAlpha((int) (255.0f * f18));
                float f19 = L4;
                float f20 = measuredHeight;
                rectF.set((f19 - L) + L5, (f20 - L) + L5, (f19 + L) - L5, (f20 + L) - L5);
                canvas2.drawArc(rectF, -50.0f, 100.0f, false, paint2);
                if (H > i11) {
                    float f21 = fArr2[i15];
                    if (f21 < f17) {
                        float f22 = (((float) j3) / 180.0f) + f21;
                        fArr2[i15] = f22;
                        if (f22 > f17) {
                            fArr2[i15] = f17;
                        }
                        invalidate();
                    }
                } else {
                    float f23 = fArr2[i15];
                    if (f23 > f11) {
                        float f24 = f23 - (((float) j3) / 180.0f);
                        fArr2[i15] = f24;
                        if (f24 < f11) {
                            fArr2[i15] = f11;
                        }
                        invalidate();
                    }
                }
                i15++;
                b40Var = this;
                canvas2 = canvas;
                f12 = f11;
                f13 = f17;
                f16 = 6.0f;
                i13 = 1;
                i14 = 0;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
        this.f43879n = (int) (View.MeasureSpec.getSize(i7) * this.f43880r);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }
}
