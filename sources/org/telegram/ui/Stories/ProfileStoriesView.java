package org.telegram.ui.Stories;

import a5.f;
import a9.i;
import ag.r1;
import ag.t2;
import ag.u;
import ag.x1;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.OvershootInterpolator;
import com.google.android.recaptcha.internal.a;
import h7.y;
import i0.b;
import java.util.ArrayList;
import java.util.Collections;
import jh.f4;
import jh.g4;
import jh.j7;
import jh.l7;
import jh.r6;
import jh.s6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.iz0;
import org.telegram.ui.oy0;

public class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {

    public static final int f36200o0 = 0;
    public boolean A;
    public boolean B;
    public float C;
    public float D;
    public float E;
    public int F;
    public r6 G;
    public final j7 H;
    public final s6 I;
    public float J;
    public float K;
    public final RectF L;
    public final RectF M;
    public final RectF N;
    public final Path O;
    public final y5 P;
    public final y5 Q;
    public final y5 R;
    public float S;
    public ValueAnimator T;
    public final Path U;
    public final Matrix V;
    public final PathMeasure W;

    public final Paint f36201a;

    public final Path f36202a0;

    public final Paint f36203b;

    public float f36204b0;

    public final int f36205c;

    public float f36206c0;
    public final long d;

    public float f36207d0;

    public final boolean f36208e;

    public float f36209e0;

    public final View f36210f;

    public float f36211f0;

    public boolean f36212g0;
    public final iz0 h;

    public final y5 f36213h0;

    public final y5 f36214i0;

    public final i f36215j0;

    public final f4 f36216k0;

    public long f36217l0;
    public float m0;

    public final i6 f36218n;

    public float f36219n0;

    public int f36220r;

    public int f36221s;
    public g4 v;

    public final ArrayList f36222w;

    public boolean f36223x;

    public si0 f36224y;

    public ProfileStoriesView(Context context, int i10, long j10, boolean z10, View view, iz0 iz0Var, c6 c6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f36201a = paint;
        Paint paint2 = new Paint(1);
        this.f36203b = paint2;
        Paint paint3 = new Paint(1);
        i6 i6Var = new i6(false, true, true, false);
        this.f36218n = i6Var;
        Paint paint4 = new Paint(1);
        this.f36222w = new ArrayList();
        Paint paint5 = new Paint(1);
        this.C = 1.0f;
        this.D = 1.0f;
        this.H = new j7(this);
        this.L = new RectF();
        this.M = new RectF();
        this.N = new RectF();
        this.O = new Path();
        er erVar = er.h;
        this.P = new y5(this, 0L, 480L, erVar);
        this.Q = new y5(this, 0L, 240L, erVar);
        this.R = new y5(this, 0L, 150L, er.f28122f);
        this.S = 1.0f;
        this.U = new Path();
        this.V = new Matrix();
        this.W = new PathMeasure();
        this.f36202a0 = new Path();
        this.f36213h0 = new y5(this, 0L, 350L, erVar);
        this.f36214i0 = new y5(this, 0L, 350L, erVar);
        final oy0 oy0Var = (oy0) this;
        this.f36215j0 = new i(oy0Var, 22);
        final int i11 = 0;
        this.f36216k0 = new Runnable() {
            @Override
            public final void run() {
                int i12 = i11;
                oy0 oy0Var2 = oy0Var;
                switch (i12) {
                    case 0:
                        int i13 = ProfileStoriesView.f36200o0;
                        oy0Var2.f41215q0.w4(false);
                        break;
                    default:
                        oy0Var2.invalidate();
                        break;
                }
            }
        };
        this.f36205c = i10;
        this.d = j10;
        this.f36208e = z10;
        this.f36210f = view;
        this.h = iz0Var;
        final int i12 = 1;
        iz0Var.getImageReceiver().setVisibleInvalidate(new Runnable() {
            @Override
            public final void run() {
                int i13 = i12;
                oy0 oy0Var2 = oy0Var;
                switch (i13) {
                    case 0:
                        int i14 = ProfileStoriesView.f36200o0;
                        oy0Var2.f41215q0.w4(false);
                        break;
                    default:
                        oy0Var2.invalidate();
                        break;
                }
            }
        });
        this.I = MessagesController.getInstance(i10).getStoriesController();
        paint.setColor(1526726655);
        paint.getAlpha();
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(g6.v0(g6.nk, c6Var));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(g6.v0(g6.f23053d6, c6Var));
        i6Var.t(AndroidUtilities.dp(18.0f));
        i6Var.k(0.4f, 320L, erVar);
        i6Var.u(AndroidUtilities.bold());
        i6Var.r(-1);
        i6Var.n(true);
        i6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static g4 d(g4 g4Var, g4 g4Var2, g4 g4Var3) {
        if (g4Var3 == null) {
            return null;
        }
        RectF rectF = g4Var3.f13365n;
        if (g4Var == null && g4Var2 == null) {
            return null;
        }
        if (g4Var != null) {
            RectF rectF2 = g4Var.f13365n;
            if (g4Var2 != null) {
                RectF rectF3 = g4Var2.f13365n;
                return Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left)) ? g4Var : g4Var2;
            }
        }
        return g4Var != null ? g4Var : g4Var2;
    }

    private float getExpandRight() {
        return this.f36209e0 - (this.f36213h0.e(this.f36212g0) * AndroidUtilities.dp(71.0f));
    }

    public final void a(Canvas canvas, g4 g4Var, g4 g4Var2) {
        if (g4Var2 == null) {
            return;
        }
        RectF rectF = g4Var2.f13364m;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        float f10 = -(AndroidUtilities.dpf2(1.66f) * g4Var2.f13361j);
        rectF2.inset(f10, f10);
        float fCenterX = rectF.centerX();
        float fWidth = rectF.width() / 2.0f;
        RectF rectF3 = g4Var.f13364m;
        float fCenterX2 = rectF3.centerX();
        float fWidth2 = rectF3.width() / 2.0f;
        Path path = this.O;
        path.rewind();
        if (fCenterX > fCenterX2) {
            float degrees = (float) Math.toDegrees(Math.acos(Math.abs((((fCenterX2 + fWidth2) + (fCenterX - fWidth)) / 2.0f) - fCenterX2) / fWidth2));
            path.arcTo(rectF2, 180.0f + degrees, (-degrees) * 2.0f);
            path.arcTo(rectF3, degrees, 360.0f - (2.0f * degrees));
        } else {
            float degrees2 = (float) Math.toDegrees(Math.acos(Math.abs((((fCenterX2 - fWidth2) + (fCenterX + fWidth)) / 2.0f) - fCenterX2) / fWidth2));
            float f11 = 2.0f * degrees2;
            path.arcTo(rectF2, -degrees2, f11);
            path.arcTo(rectF3, 180.0f - degrees2, -(360.0f - f11));
        }
        path.close();
        canvas.save();
        canvas.clipPath(path);
    }

    public final void b(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        if (!ChatObject.isForum(UserConfig.selectedAccount, this.d)) {
            canvas.drawArc(rectF, f10, f11, false, paint);
            return;
        }
        float fHeight = rectF.height() * 0.32f;
        if (Math.abs(f11) == 360.0f) {
            canvas.drawRoundRect(rectF, fHeight, fHeight, paint);
            return;
        }
        float f12 = f10 + f11;
        float f13 = (((int) f12) / 90) * 90;
        float f14 = (-199.0f) + f13;
        Path path = this.U;
        path.rewind();
        path.addRoundRect(rectF, fHeight, fHeight, Path.Direction.CW);
        Matrix matrix = this.V;
        matrix.reset();
        matrix.postRotate(f13, rectF.centerX(), rectF.centerY());
        path.transform(matrix);
        PathMeasure pathMeasure = this.W;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        Path path2 = this.f36202a0;
        path2.reset();
        pathMeasure.getSegment(((f12 - f14) / 360.0f) * length, length * (((f12 - f11) - f14) / 360.0f), path2, true);
        path2.rLineTo(0.0f, 0.0f);
        canvas.drawPath(path2, paint);
    }

    public final void c(Canvas canvas, g4 g4Var, g4 g4Var2, g4 g4Var3, Paint paint) {
        double degrees;
        g4 g4Var4 = g4Var;
        RectF rectF = g4Var2.f13365n;
        if (g4Var4 == null && g4Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (g4Var4 != null) {
            RectF rectF2 = g4Var4.f13365n;
            if (g4Var3 != null) {
                RectF rectF3 = g4Var3.f13365n;
                float fCenterX = rectF2.centerX();
                float fWidth = rectF2.width() / 2.0f;
                float fCenterX2 = rectF.centerX();
                float fWidth2 = rectF.width() / 2.0f;
                float fCenterX3 = rectF3.centerX();
                float fWidth3 = rectF3.width() / 2.0f;
                boolean z10 = fCenterX > fCenterX2;
                if (z10) {
                    degrees = Math.toDegrees(Math.acos(Math.abs((((fCenterX2 + fWidth2) + (fCenterX - fWidth)) / 2.0f) - fCenterX2) / fWidth2));
                } else {
                    degrees = Math.toDegrees(Math.acos(Math.abs((((fCenterX2 - fWidth2) + (fCenterX + fWidth)) / 2.0f) - fCenterX2) / fWidth2));
                }
                float f10 = (float) degrees;
                boolean z11 = fCenterX3 > fCenterX2;
                float degrees2 = (float) (z11 ? Math.toDegrees(Math.acos(Math.abs((((fCenterX2 + fWidth2) + (fCenterX3 - fWidth3)) / 2.0f) - fCenterX2) / fWidth2)) : Math.toDegrees(Math.acos(Math.abs((((fCenterX2 - fWidth2) + (fCenterX3 + fWidth3)) / 2.0f) - fCenterX2) / fWidth2)));
                if (z10 && z11) {
                    float fMax = Math.max(f10, degrees2);
                    b(fMax, 360.0f - (2.0f * fMax), canvas, paint, rectF);
                    return;
                } else if (z10) {
                    b(degrees2 + 180.0f, 180.0f - (f10 + degrees2), canvas, paint, rectF);
                    b(f10, (180.0f - degrees2) - f10, canvas, paint, rectF);
                    return;
                } else if (z11) {
                    b(f10 + 180.0f, 180.0f - (degrees2 + f10), canvas, paint, rectF);
                    b(degrees2, (180.0f - degrees2) - f10, canvas, paint, rectF);
                    return;
                } else {
                    float fMax2 = Math.max(f10, degrees2);
                    b(fMax2 + 180.0f, 360.0f - (fMax2 * 2.0f), canvas, paint, rectF);
                    return;
                }
            }
        }
        if (g4Var4 == null && g4Var3 == null) {
            return;
        }
        if (g4Var4 == null) {
            g4Var4 = g4Var3;
        }
        float fCenterX4 = g4Var4.f13365n.centerX();
        float fWidth4 = g4Var4.f13365n.width() / 2.0f;
        float fCenterX5 = rectF.centerX();
        float fWidth5 = rectF.width() / 2.0f;
        if (Math.abs(fCenterX4 - fCenterX5) > fWidth4 + fWidth5) {
            b(0.0f, 360.0f, canvas, paint, rectF);
        } else if (fCenterX4 > fCenterX5) {
            float degrees3 = (float) Math.toDegrees(Math.acos(Math.abs((((fCenterX5 + fWidth5) + (fCenterX4 - fWidth4)) / 2.0f) - fCenterX5) / fWidth5));
            b(degrees3, 360.0f - (2.0f * degrees3), canvas, paint, rectF);
        } else {
            float degrees4 = (float) Math.toDegrees(Math.acos(Math.abs((((fCenterX5 - fWidth5) + (fCenterX4 + fWidth4)) / 2.0f) - fCenterX5) / fWidth5));
            b(degrees4 + 180.0f, 360.0f - (degrees4 * 2.0f), canvas, paint, rectF);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesUpdated) {
            f(true, true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        y5 y5Var;
        Paint paint;
        Paint paint2;
        RectF rectF;
        ArrayList arrayList2;
        float f10;
        float f11;
        float f12;
        float f13;
        ProfileStoriesView profileStoriesView;
        float f14;
        float f15;
        g4 g4Var;
        g4 g4Var2;
        Paint paint3;
        ProfileStoriesView profileStoriesView2;
        ArrayList arrayList3;
        boolean z10;
        float f16;
        float f17;
        ProfileStoriesView profileStoriesView3;
        RectF rectF2;
        float f18;
        Paint paint4;
        iz0 iz0Var;
        ArrayList arrayList4;
        float size;
        r6 r6Var;
        ProfileStoriesView profileStoriesView4 = this;
        Canvas canvas2 = canvas;
        float fD = profileStoriesView4.f36214i0.d(profileStoriesView4.f36206c0, false);
        View view = profileStoriesView4.f36210f;
        float fClamp = Utilities.clamp((view.getScaleX() - 1.0f) / 0.4f, 1.0f, 0.0f);
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(3.5f), fClamp) * profileStoriesView4.D;
        float scaleX = (view.getScaleX() * fLerp) + view.getX();
        float scaleY = (view.getScaleY() * fLerp) + view.getY();
        float f19 = fLerp * 2.0f;
        float scaleX2 = view.getScaleX() * (view.getWidth() - f19);
        float scaleY2 = (view.getScaleY() * (view.getHeight() - f19)) + scaleY;
        RectF rectF3 = profileStoriesView4.L;
        rectF3.set(scaleX, scaleY, scaleX2 + scaleX, scaleY2);
        float f20 = profileStoriesView4.f36204b0;
        int i10 = 0;
        while (true) {
            arrayList = profileStoriesView4.f36222w;
            if (i10 >= arrayList.size()) {
                break;
            }
            g4 g4Var3 = (g4) arrayList.get(i10);
            float fD2 = g4Var3.h.d(g4Var3.f13357e, false);
            g4Var3.f13361j = fD2;
            if (fD2 > 0.0f || g4Var3.f13357e > 0.0f) {
                g4Var3.f13360i = g4Var3.f13359g.d(g4Var3.f13356c, false);
                g4Var3.f13362k = g4Var3.f13358f.e(g4Var3.d);
                if (i10 > 0 && ((g4) arrayList.get(i10 - 1)).f13360i > g4Var3.f13360i) {
                    Collections.sort(arrayList, new f(28));
                    break;
                }
            } else {
                g4Var3.f13355b.onDetachedFromWindow();
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        float fClamp2 = Utilities.clamp(1.0f - (profileStoriesView4.J / 0.2f), 1.0f, 0.0f);
        s6 s6Var = profileStoriesView4.I;
        long j10 = profileStoriesView4.d;
        boolean zN = s6Var.N(j10);
        boolean zK = s6Var.K(j10);
        y5 y5Var2 = profileStoriesView4.R;
        if (!zK && (r6Var = profileStoriesView4.G) != null && r6Var.v) {
            profileStoriesView4.A = false;
            profileStoriesView4.B = false;
            y5Var2.getClass();
            y5Var2.d(0.0f, true);
        }
        float fLerp2 = AndroidUtilities.lerp(0.0f, y5Var2.e((zK && !zN) || (profileStoriesView4.A && !profileStoriesView4.B)), profileStoriesView4.E);
        canvas2.save();
        float f21 = profileStoriesView4.C;
        canvas2.scale(f21, f21, rectF3.centerX(), rectF3.centerY());
        float fLerp3 = AndroidUtilities.lerp(rectF3.centerY(), profileStoriesView4.f36211f0, profileStoriesView4.J);
        profileStoriesView4.G = null;
        y5 y5Var3 = profileStoriesView4.Q;
        y5 y5Var4 = profileStoriesView4.P;
        iz0 iz0Var2 = profileStoriesView4.h;
        j7 j7Var = profileStoriesView4.H;
        RectF rectF4 = profileStoriesView4.M;
        if (fLerp2 > 0.0f) {
            rectF4.set(rectF3);
            rectF4.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
            Paint paintA = j7Var.a(rectF4);
            if (profileStoriesView4.f36224y == null) {
                si0 si0Var = new si0(profileStoriesView4);
                profileStoriesView4.f36224y = si0Var;
                si0Var.d(null, true, false);
                profileStoriesView4.f36224y.f32471u = ChatObject.isForum(UserConfig.selectedAccount, j10);
            }
            if (!s6Var.K(j10) || s6Var.N(j10)) {
                size = 1.0f;
            } else {
                ArrayList arrayListE = s6Var.E(j10);
                if (arrayListE != null) {
                    if (arrayListE.size() > 0) {
                        profileStoriesView4.G = (r6) arrayListE.get(0);
                    }
                    float f22 = 0.0f;
                    for (int i11 = 0; i11 < arrayListE.size(); i11++) {
                        f22 += ((r6) arrayListE.get(i11)).h;
                    }
                    size = f22 / arrayListE.size();
                } else {
                    size = 0.0f;
                }
            }
            profileStoriesView4.f36224y.f32467q = 0;
            int alpha = paintA.getAlpha();
            paintA.setAlpha((int) (alpha * fClamp2 * fLerp2));
            paintA.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
            si0 si0Var2 = profileStoriesView4.f36224y;
            si0Var2.f32470t = paintA;
            si0Var2.f((int) rectF4.left, (int) rectF4.top, (int) rectF4.right, (int) rectF4.bottom);
            y5Var = y5Var3;
            profileStoriesView4.f36224y.e(Utilities.clamp(size, 1.0f, 0.0f), true);
            if (iz0Var2.M) {
                profileStoriesView4.f36224y.a(canvas2);
            }
            paintA.setAlpha(alpha);
            profileStoriesView4.A = true;
            boolean z11 = profileStoriesView4.B;
            boolean z12 = profileStoriesView4.f36224y.f32457f >= 0.98f;
            profileStoriesView4.B = z12;
            if (z11 != z12) {
                y5Var4.d(profileStoriesView4.f36221s, true);
                y5Var.d(profileStoriesView4.f36220r, true);
                AnimatorSet animatorSet = new AnimatorSet();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.05f);
                valueAnimatorOfFloat.setDuration(100L);
                valueAnimatorOfFloat.setInterpolator(er.f28123g);
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.05f, 1.0f);
                valueAnimatorOfFloat2.setDuration(250L);
                valueAnimatorOfFloat2.setInterpolator(new OvershootInterpolator());
                u uVar = new u(profileStoriesView4, 22);
                valueAnimatorOfFloat.addUpdateListener(uVar);
                valueAnimatorOfFloat2.addUpdateListener(uVar);
                animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                animatorSet.addListener(new r1(profileStoriesView4, 17));
                animatorSet.start();
            }
            paint = paintA;
        } else {
            fD = fD;
            j10 = j10;
            j7Var = j7Var;
            y5Var = y5Var3;
            profileStoriesView4.A = false;
            paint = null;
        }
        Paint paint5 = profileStoriesView4.f36201a;
        Paint paint6 = profileStoriesView4.f36203b;
        RectF rectF5 = profileStoriesView4.N;
        if (fLerp2 < 1.0f) {
            f10 = 12.0f;
            f11 = 255.0f;
            float fClamp3 = Utilities.clamp(1.0f - (profileStoriesView4.J / 0.2f), 1.0f, 0.0f) * (1.0f - fLerp2);
            f12 = 1.5f;
            float fD3 = y5Var4.d(profileStoriesView4.f36221s, false);
            float fD4 = y5Var.d(profileStoriesView4.f36220r, false);
            if (zN) {
                rectF4.set(rectF3);
                rectF4.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
                if (l7.d == null) {
                    c20 c20Var = new c20();
                    l7.d = c20Var;
                    c20Var.f27290a = true;
                    c20Var.f27291b = true;
                    int iW0 = g6.w0(null, g6.xj, false);
                    int iW1 = g6.w0(null, g6.f23284q7, false);
                    l7.d.d(b.d(0.25f, iW0, iW1), iW1, 0, 0);
                    l7.d.f27292c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    l7.d.f27292c.setStyle(Paint.Style.STROKE);
                    l7.d.f27292c.setStrokeCap(Paint.Cap.ROUND);
                }
                l7.d.b(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom);
                Paint paint7 = l7.d.f27292c;
                paint7.setStrokeWidth(AndroidUtilities.dp(2.0f));
                paint7.setAlpha((int) (fClamp3 * 255.0f));
                if (ChatObject.isForum(UserConfig.selectedAccount, j10)) {
                    float fHeight = rectF4.height() * 0.32f;
                    canvas2.drawRoundRect(rectF4, fHeight, fHeight, paint7);
                } else {
                    canvas2.drawCircle(rectF4.centerX(), rectF4.centerY(), rectF4.width() / 2.0f, paint7);
                }
            } else if ((profileStoriesView4.v != null || profileStoriesView4.F > 0) && fClamp3 > 0.0f) {
                rectF4.set(rectF3);
                rectF4.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
                rectF5.set(rectF3);
                rectF5.inset(-AndroidUtilities.dpf2(3.41f), -AndroidUtilities.dpf2(3.41f));
                AndroidUtilities.lerp(rectF4, rectF5, fClamp, rectF5);
                float f23 = fClamp3;
                Paint paintA2 = paint;
                float fLerp4 = AndroidUtilities.lerp(0.0f, (float) ((((double) AndroidUtilities.dpf2(4.23f)) / (((double) rectF3.width()) * 3.141592653589793d)) * 360.0d), Utilities.clamp(fD3 - 1.0f, 1.0f, 0.0f) * f23);
                int iMin = Math.min(profileStoriesView4.f36221s, 50);
                float fMin = Math.min(fD3, 50.0f);
                int i12 = iMin > 20 ? 3 : 5;
                if (iMin <= 1) {
                    i12 = 0;
                }
                float fLerp5 = AndroidUtilities.lerp(i12 * 2, fLerp4, fClamp);
                float fMax = (360.0f - (Math.max(0.0f, fMin) * fLerp5)) / Math.max(1.0f, fMin);
                paint5.setColor(b.d(profileStoriesView4.K, 1526726655, 973078528));
                paint5.getAlpha();
                float f24 = (-90.0f) - (fLerp5 / 2.0f);
                boolean z13 = false;
                int i13 = 0;
                while (i13 < iMin) {
                    if (i13 < arrayList.size()) {
                        arrayList4 = arrayList;
                        iz0Var = iz0Var2;
                        if (((g4) arrayList4.get(i13)).f13363l) {
                            z13 = true;
                        }
                    } else {
                        iz0Var = iz0Var2;
                        arrayList4 = arrayList;
                    }
                    i13++;
                    arrayList = arrayList4;
                    iz0Var2 = iz0Var;
                }
                iz0 iz0Var3 = iz0Var2;
                ArrayList arrayList5 = arrayList;
                if (z13) {
                    RectF rectF6 = AndroidUtilities.rectTmp;
                    rectF6.set(rectF5);
                    rectF6.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                    canvas2.saveLayerAlpha(rectF6, 255, 31);
                    float fA = a.A(profileStoriesView4.S, 1.0f, 2.5f, 1.0f);
                    if (fA != 1.0f) {
                        canvas2.save();
                        canvas2.scale(fA, fA, rectF4.centerX(), rectF4.centerY());
                    }
                    int alpha2 = paint6.getAlpha();
                    paint6.setAlpha((int) (alpha2 * f23));
                    rectF6.set(rectF5);
                    rectF6.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                    paint6.setStrokeWidth(AndroidUtilities.dpf2(2.5f));
                    profileStoriesView4.b(0.0f, 360.0f, canvas2, paint6, rectF5);
                    paint6.setAlpha(alpha2);
                    if (fA != 1.0f) {
                        canvas2.restore();
                    }
                    arrayList2 = arrayList5;
                    rectF = rectF4;
                    paint2 = paint6;
                    profileStoriesView4 = profileStoriesView4;
                    f13 = f23;
                    paint = paintA2;
                    rectF5 = rectF5;
                } else {
                    ProfileStoriesView profileStoriesView5 = profileStoriesView4;
                    Paint paint8 = paint6;
                    RectF rectF7 = rectF5;
                    RectF rectF8 = rectF4;
                    int i14 = 0;
                    while (true) {
                        arrayList3 = arrayList5;
                        if (i14 >= iMin) {
                            break;
                        }
                        float f25 = i14;
                        Paint paint9 = paint8;
                        float f26 = fLerp5;
                        float fClamp4 = 1.0f - Utilities.clamp(fD4 - f25, 1.0f, 0.0f);
                        float fClamp5 = 1.0f - Utilities.clamp((iMin - fMin) - f25, 1.0f, 0.0f);
                        if (fClamp5 < 0.0f) {
                            profileStoriesView3 = profileStoriesView5;
                            arrayList5 = arrayList3;
                            rectF8 = rectF8;
                            iMin = iMin;
                            f18 = f24;
                            f17 = f23;
                            rectF2 = rectF7;
                            i14 = i14;
                        } else {
                            float fA2 = i14 == 0 ? a.A(profileStoriesView5.S, 1.0f, 2.5f, 1.0f) : 1.0f;
                            if (fA2 != 1.0f) {
                                canvas2.save();
                                canvas2.scale(fA2, fA2, rectF8.centerX(), rectF8.centerY());
                            }
                            boolean z14 = i14 < arrayList3.size() && ((g4) arrayList3.get(i14)).f13363l;
                            if (fClamp4 < 1.0f) {
                                j7 j7Var2 = j7Var;
                                if (z14) {
                                    paint4 = paint9;
                                } else {
                                    paintA2 = j7Var2.a(rectF8);
                                    paint4 = paintA2;
                                }
                                z10 = z14;
                                int alpha3 = paint4.getAlpha();
                                f17 = f23;
                                Paint paint10 = paint4;
                                paint10.setAlpha((int) y1.z(1.0f, fClamp4, alpha3, f17));
                                paint10.setStrokeWidth(AndroidUtilities.dpf2(z10 ? 3.0f : 2.33f));
                                ProfileStoriesView profileStoriesView6 = profileStoriesView5;
                                f16 = f24;
                                arrayList5 = arrayList3;
                                j7Var = j7Var2;
                                profileStoriesView6.b(f16, (-fMax) * fClamp5, canvas2, paint10, rectF8);
                                paint10.setAlpha(alpha3);
                            } else {
                                arrayList5 = arrayList3;
                                z10 = z14;
                                f16 = f24;
                                f17 = f23;
                            }
                            if (fClamp4 > 0.0f) {
                                Paint paint11 = z10 ? paint9 : paint5;
                                int alpha4 = paint11.getAlpha();
                                paint11.setAlpha((int) (alpha4 * fClamp4 * f17));
                                paint11.setStrokeWidth(AndroidUtilities.dpf2(z10 ? 3.0f : 1.5f));
                                profileStoriesView3 = this;
                                canvas2 = canvas;
                                rectF2 = rectF7;
                                profileStoriesView3.b(f16, (-fMax) * fClamp5, canvas2, paint11, rectF2);
                                paint11.setAlpha(alpha4);
                            } else {
                                profileStoriesView3 = this;
                                canvas2 = canvas;
                                rectF2 = rectF7;
                            }
                            if (fA2 != 1.0f) {
                                canvas2.restore();
                            }
                            f18 = f16 - ((f26 * fClamp5) + (fMax * fClamp5));
                        }
                        i14++;
                        f24 = f18;
                        rectF7 = rectF2;
                        f23 = f17;
                        rectF8 = rectF8;
                        fLerp5 = f26;
                        iMin = iMin;
                        profileStoriesView5 = profileStoriesView3;
                        paint8 = paint9;
                    }
                    arrayList2 = arrayList3;
                    rectF = rectF8;
                    paint2 = paint8;
                    profileStoriesView4 = profileStoriesView5;
                    f13 = f23;
                    rectF5 = rectF7;
                    paint = paintA2;
                }
                if (z13) {
                    l7.k(canvas2, rectF5, f13, iz0Var3.getImageReceiver().getVisible(), profileStoriesView4.E);
                    canvas2.restore();
                }
            }
            paint2 = paint6;
            rectF = rectF4;
            f13 = fClamp3;
            arrayList2 = arrayList;
            paint = paint;
        } else {
            paint2 = paint6;
            rectF = rectF4;
            arrayList2 = arrayList;
            f10 = 12.0f;
            f11 = 255.0f;
            f12 = 1.5f;
            f13 = fClamp2;
        }
        profileStoriesView4.getExpandRight();
        if (profileStoriesView4.J > 0.0f) {
            ArrayList arrayList6 = arrayList2;
            j7 j7Var3 = j7Var;
            Paint paint12 = paint2;
            if (f13 < 1.0f) {
                for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                    float f27 = ((g4) arrayList6.get(i15)).f13361j;
                    AndroidUtilities.dp(14.0f);
                }
                float fMax2 = f20;
                int i16 = 0;
                float f28 = 0.0f;
                while (i16 < arrayList6.size()) {
                    g4 g4Var4 = (g4) arrayList6.get(i16);
                    float f29 = g4Var4.f13361j;
                    RectF rectF9 = g4Var4.f13365n;
                    int i17 = i16;
                    float f30 = g4Var4.f13362k;
                    float fDp = (AndroidUtilities.dp(28.0f) / 2.0f) * f29;
                    float f31 = profileStoriesView4.f36204b0 + fDp + f28;
                    float fDp2 = f28 + (AndroidUtilities.dp(18.0f) * f29);
                    float f32 = f31 + fDp;
                    fMax2 = Math.max(fMax2, f32);
                    rectF.set(f31 - fDp, fLerp3 - fDp, f32, fLerp3 + fDp);
                    float f33 = profileStoriesView4.J;
                    float fLerp6 = AndroidUtilities.lerp(rectF3.centerX(), rectF.centerX(), f33);
                    float fLerp7 = AndroidUtilities.lerp(rectF3.centerY(), rectF.centerY(), f33);
                    float fLerp8 = AndroidUtilities.lerp(Math.min(rectF3.width(), rectF3.height()), Math.min(rectF.width(), rectF.height()), f33) / 2.0f;
                    rectF5.set(fLerp6 - fLerp8, fLerp7 - fLerp8, fLerp6 + fLerp8, fLerp7 + fLerp8);
                    g4Var4.f13364m.set(rectF5);
                    rectF9.set(rectF5);
                    float f34 = (-AndroidUtilities.lerp(AndroidUtilities.dpf2(2.66f), AndroidUtilities.lerp(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dpf2(2.33f), profileStoriesView4.J), profileStoriesView4.J * f30)) * f29;
                    rectF9.inset(f34, f34);
                    i16 = i17 + 1;
                    f28 = fDp2;
                    f13 = f13;
                }
                float f35 = f13;
                f14 = 18.0f;
                paint5.setColor(b.d(profileStoriesView4.J, 1526726655, -2135178036));
                paint5.getAlpha();
                Paint paintA3 = j7Var3.a(rectF);
                paintA3.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(f12), profileStoriesView4.J));
                paint5.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f12), profileStoriesView4.J));
                paint12.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f12), profileStoriesView4.J));
                int i18 = 0;
                while (i18 < arrayList6.size()) {
                    g4 g4Var5 = (g4) arrayList6.get(i18);
                    int i19 = i18 - 2;
                    g4 g4Var6 = i19 >= 0 ? (g4) arrayList6.get(i19) : null;
                    int i20 = i18 - 1;
                    g4 g4VarD = d(g4Var6, i20 >= 0 ? (g4) arrayList6.get(i20) : null, g4Var5);
                    int i21 = i18 + 1;
                    int i22 = i18 + 2;
                    g4 g4VarD2 = d(i21 < arrayList6.size() ? (g4) arrayList6.get(i21) : null, i22 < arrayList6.size() ? (g4) arrayList6.get(i22) : null, g4Var5);
                    if (g4VarD != null) {
                        RectF rectF10 = g4VarD.f13365n;
                        float fCenterX = rectF10.centerX();
                        RectF rectF11 = g4Var5.f13365n;
                        RectF rectF12 = g4Var5.f13365n;
                        if (Math.abs(fCenterX - rectF11.centerX()) < Math.abs((rectF12.width() / 2.0f) - (rectF10.width() / 2.0f)) || Math.abs(rectF10.centerX() - rectF12.centerX()) > (rectF12.width() / 2.0f) + (rectF10.width() / 2.0f)) {
                            g4Var = null;
                        } else {
                            g4Var = g4VarD;
                        }
                    } else {
                        g4Var = g4VarD;
                    }
                    if (g4VarD2 != null) {
                        RectF rectF13 = g4VarD2.f13365n;
                        float fCenterX2 = rectF13.centerX();
                        RectF rectF14 = g4Var5.f13365n;
                        RectF rectF15 = g4Var5.f13365n;
                        if (Math.abs(fCenterX2 - rectF14.centerX()) < Math.abs((rectF15.width() / 2.0f) - (rectF13.width() / 2.0f)) || Math.abs(rectF13.centerX() - rectF15.centerX()) > (rectF15.width() / 2.0f) + (rectF13.width() / 2.0f)) {
                            g4Var2 = null;
                        } else {
                            g4Var2 = g4VarD2;
                        }
                    } else {
                        g4Var2 = g4VarD2;
                    }
                    if (g4Var5.f13362k < 1.0f) {
                        int alpha5 = paintA3.getAlpha();
                        paintA3.setAlpha((int) ((1.0f - f35) * (1.0f - g4Var5.f13362k) * alpha5 * g4Var5.f13361j));
                        profileStoriesView4.c(canvas, g4Var, g4Var5, g4Var2, paintA3);
                        paint3 = paintA3;
                        paint3.setAlpha(alpha5);
                    } else {
                        paint3 = paintA3;
                    }
                    if (g4Var5.f13362k > 0.0f) {
                        Paint paint13 = g4Var5.f13363l ? paint12 : paint5;
                        int alpha6 = paint13.getAlpha();
                        paint13.setAlpha((int) ((1.0f - f35) * alpha6 * g4Var5.f13361j * g4Var5.f13362k));
                        c(canvas, g4Var, g4Var5, g4Var2, paint13);
                        profileStoriesView2 = this;
                        paint13.setAlpha(alpha6);
                    } else {
                        profileStoriesView2 = this;
                    }
                    i18 = i21;
                    paintA3 = paint3;
                    profileStoriesView4 = profileStoriesView2;
                }
                profileStoriesView = profileStoriesView4;
                Paint paint14 = paintA3;
                canvas.saveLayerAlpha(0.0f, 0.0f, profileStoriesView.getWidth(), profileStoriesView.getHeight(), (int) ((1.0f - f35) * profileStoriesView.J * f11), 31);
                canvas2 = canvas;
                for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
                    g4 g4Var7 = (g4) arrayList6.get(size2);
                    ImageReceiver imageReceiver = g4Var7.f13355b;
                    ImageReceiver imageReceiver2 = g4Var7.f13355b;
                    if (imageReceiver.getVisible()) {
                        int saveCount = canvas2.getSaveCount();
                        int i23 = size2 - 1;
                        g4 g4Var8 = i23 >= 0 ? (g4) arrayList6.get(i23) : null;
                        int i24 = size2 - 2;
                        profileStoriesView.a(canvas2, g4Var7, d(g4Var8, i24 >= 0 ? (g4) arrayList6.get(i24) : null, g4Var7));
                        imageReceiver2.setImageCoords(g4Var7.f13364m);
                        imageReceiver2.draw(canvas2);
                        canvas2.restoreToCount(saveCount);
                    }
                }
                canvas2.restore();
                paint = paint14;
                f15 = fMax2;
            } else {
                profileStoriesView = profileStoriesView4;
                f14 = 18.0f;
                f15 = f20;
            }
        } else {
            profileStoriesView = profileStoriesView4;
            f14 = 18.0f;
            f15 = f20;
        }
        if (paint != null) {
            paint.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
        }
        canvas2.restore();
        float fMax3 = Math.max(0.0f, (profileStoriesView.J - 0.5f) * 2.0f);
        if (fMax3 > 0.0f) {
            float fLerp9 = AndroidUtilities.lerp(rectF3.right + AndroidUtilities.dp(16.0f), f15 + AndroidUtilities.dp(f10), profileStoriesView.J);
            float fLerp10 = AndroidUtilities.lerp(profileStoriesView.getWidth(), fD, profileStoriesView.J);
            float fLerp11 = AndroidUtilities.lerp(rectF3.centerY(), profileStoriesView.f36207d0, profileStoriesView.J);
            int iDp = (int) (fLerp11 + AndroidUtilities.dp(f14));
            i6 i6Var = profileStoriesView.f36218n;
            i6Var.setBounds((int) fLerp9, (int) (fLerp11 - AndroidUtilities.dp(f14)), (int) fLerp10, iDp);
            i6Var.f29257w = (int) (fMax3 * f11);
            i6Var.draw(canvas2);
        }
    }

    public final void f(boolean z10, boolean z11) {
        ArrayList<TL_stories.StoryItem> arrayList;
        int i10;
        int i11;
        ArrayList arrayList2;
        s6 s6Var;
        int i12;
        int i13;
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor color;
        TLRPC.PeerColor peerColor;
        int i14;
        MessagesController.PeerColors peerColors2;
        MessagesController.PeerColor color2;
        TLRPC.PeerColor peerColor2;
        TL_stories.StoryItem storyItem;
        int i15;
        int i16;
        int i17;
        if (this.f36208e) {
            return;
        }
        int i18 = this.f36205c;
        long clientUserId = UserConfig.getInstance(i18).getClientUserId();
        long j10 = this.d;
        int i19 = 0;
        boolean z12 = j10 == clientUserId;
        int currentTime = ConnectionsManager.getInstance(i18).getCurrentTime();
        TL_stories.PeerStories peerStoriesZ = MessagesController.getInstance(i18).getStoriesController().z(j10);
        TL_stories.PeerStories peerStoriesY = MessagesController.getInstance(i18).getStoriesController().y(j10);
        TL_stories.PeerStories peerStories = j10 == 0 ? null : peerStoriesZ;
        int iMax = peerStoriesZ != null ? Math.max(0, peerStoriesZ.max_read_id) : 0;
        if (peerStoriesY != null) {
            iMax = Math.max(iMax, peerStoriesY.max_read_id);
        }
        if (peerStories == null || (arrayList = peerStories.stories) == null) {
            arrayList = new ArrayList<>();
        }
        ArrayList arrayList3 = new ArrayList();
        int i20 = this.f36220r;
        this.f36220r = 0;
        boolean z13 = z12;
        int i21 = 0;
        while (i19 < arrayList.size()) {
            TL_stories.StoryItem storyItem2 = arrayList.get(i19);
            int i22 = i19;
            if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                if (storyItem2.f22617id > iMax) {
                    this.f36220r++;
                }
                i21++;
            }
            i19 = i22 + 1;
        }
        int i23 = 0;
        while (true) {
            i10 = i20;
            if (i23 >= arrayList.size()) {
                i11 = 3;
                break;
            }
            TL_stories.StoryItem storyItem3 = arrayList.get(i23);
            if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                i17 = i23;
            } else {
                if (storyItem3 instanceof TL_stories.TL_storyItemSkipped) {
                    int i24 = storyItem3.f22617id;
                    i17 = i23;
                    if (peerStoriesY == null) {
                        storyItem3 = storyItem3;
                        break;
                    }
                    int i25 = 0;
                    while (true) {
                        if (i25 >= peerStoriesY.stories.size()) {
                            storyItem3 = storyItem3;
                            break;
                        } else {
                            if (peerStoriesY.stories.get(i25).f22617id == i24) {
                                storyItem3 = peerStoriesY.stories.get(i25);
                                break;
                            }
                            i25++;
                        }
                    }
                    boolean z14 = storyItem3 instanceof TL_stories.TL_storyItemSkipped;
                    if (z14) {
                        if (peerStoriesZ != null) {
                            for (int i26 = 0; i26 < peerStoriesZ.stories.size(); i26++) {
                                if (peerStoriesZ.stories.get(i26).f22617id == i24) {
                                    peerStoriesZ.stories.get(i26);
                                    break;
                                }
                            }
                        }
                    } else if (z14) {
                        continue;
                    }
                } else {
                    i17 = i23;
                }
                int i27 = storyItem3.expire_date;
                if ((i27 == 0 || currentTime <= i27) && (z13 || storyItem3.f22617id > iMax)) {
                    arrayList3.add(storyItem3);
                    i11 = 3;
                    if (arrayList3.size() >= 3) {
                        break;
                    }
                }
            }
            i23 = i17 + 1;
            i20 = i10;
        }
        if (arrayList3.size() < i11) {
            for (int i28 = 0; i28 < arrayList.size(); i28 = i15 + 1) {
                TL_stories.StoryItem storyItem4 = arrayList.get(i28);
                if (storyItem4 instanceof TL_stories.TL_storyItemSkipped) {
                    int i29 = storyItem4.f22617id;
                    i15 = i28;
                    if (peerStoriesY != null) {
                        for (int i30 = 0; i30 < peerStoriesY.stories.size(); i30++) {
                            if (peerStoriesY.stories.get(i30).f22617id == i29) {
                                storyItem4 = peerStoriesY.stories.get(i30);
                                break;
                            }
                        }
                    }
                    boolean z15 = storyItem4 instanceof TL_stories.TL_storyItemSkipped;
                    if (!z15) {
                        if (z15) {
                            break;
                        }
                    } else if (peerStoriesZ != null) {
                        for (int i31 = 0; i31 < peerStoriesZ.stories.size(); i31++) {
                            if (peerStoriesZ.stories.get(i31).f22617id == i29) {
                                peerStoriesZ.stories.get(i31);
                                break;
                            }
                        }
                    }
                } else {
                    i15 = i28;
                }
                if (!(storyItem4 instanceof TL_stories.TL_storyItemDeleted) && (((i16 = storyItem4.expire_date) == 0 || currentTime <= i16) && !arrayList3.contains(storyItem4))) {
                    arrayList3.add(storyItem4);
                    if (arrayList3.size() >= 3) {
                        break;
                    }
                }
            }
        }
        int i32 = 0;
        while (true) {
            arrayList2 = this.f36222w;
            int size = arrayList2.size();
            s6Var = this.I;
            i12 = -1;
            if (i32 >= size) {
                break;
            }
            g4 g4Var = (g4) arrayList2.get(i32);
            int i33 = 0;
            while (true) {
                if (i33 >= arrayList3.size()) {
                    i33 = -1;
                    storyItem = null;
                    break;
                } else {
                    storyItem = (TL_stories.StoryItem) arrayList3.get(i33);
                    if (storyItem.f22617id == g4Var.f13354a) {
                        break;
                    } else {
                        i33++;
                    }
                }
            }
            if (i33 == -1) {
                g4Var.f13357e = 0.0f;
            } else {
                g4Var.f13356c = i33;
                g4Var.d = z13 || !(peerStories == null || storyItem == null || storyItem.f22617id > s6Var.x(j10));
            }
            if (!z10) {
                g4Var.f13358f.f(g4Var.d, true);
                g4Var.f13359g.d(g4Var.f13356c, true);
                g4Var.h.d(g4Var.f13357e, true);
            }
            i32++;
        }
        int i34 = 0;
        while (i34 < arrayList3.size()) {
            TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) arrayList3.get(i34);
            int i35 = 0;
            while (true) {
                if (i35 >= arrayList2.size()) {
                    i35 = -1;
                    break;
                } else if (((g4) arrayList2.get(i35)).f13354a == storyItem5.f22617id) {
                    break;
                } else {
                    i35++;
                }
            }
            if (i35 == i12) {
                storyItem5.dialogId = j10;
                g4 g4Var2 = new g4(this, storyItem5);
                g4Var2.f13356c = i34;
                g4Var2.f13357e = 1.0f;
                y5 y5Var = g4Var2.h;
                y5Var.d(0.0f, true);
                boolean z16 = z13 || (peerStories != null && storyItem5.f22617id <= peerStories.max_read_id);
                g4Var2.d = z16;
                if (!z10) {
                    g4Var2.f13358f.f(z16, true);
                    g4Var2.f13359g.d(g4Var2.f13356c, true);
                    y5Var.d(g4Var2.f13357e, true);
                }
                arrayList2.add(g4Var2);
            }
            i34++;
            i12 = -1;
        }
        this.v = null;
        for (int i36 = 0; i36 < arrayList2.size(); i36++) {
            g4 g4Var3 = (g4) arrayList2.get(i36);
            if (g4Var3.f13357e > 0.0f) {
                this.v = g4Var3;
                break;
            }
        }
        ArrayList arrayListE = s6Var.E(j10);
        this.F = arrayListE == null ? 0 : arrayListE.size();
        int iMax2 = Math.max(arrayList3.size(), i21);
        int i37 = (iMax2 != 0 || this.F == 0) ? iMax2 : 1;
        if (z11 && z10 && i37 == this.f36221s + 1 && this.f36220r == i10 + 1) {
            ValueAnimator valueAnimator = this.T;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean[] zArr = {false};
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.T = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new t2(5, this, zArr));
            this.T.addListener(new x1(5, this, zArr));
            this.T.setInterpolator(new OvershootInterpolator(3.0f));
            this.T.setDuration(400L);
            this.T.setStartDelay(120L);
            this.T.start();
        }
        this.f36221s = i37;
        this.f36218n.q(i37 > 0 ? LocaleController.formatPluralString("Stories", i37, new Object[0]) : "", z10 && !LocaleController.isRTL, true);
        j7 j7Var = this.H;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(j10));
            if (user != null) {
                TLRPC.EmojiStatus emojiStatus = user.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    j7Var.c(MessagesController.PeerColor.fromCollectible(emojiStatus), z10);
                } else {
                    if (user != null) {
                        j7Var.getClass();
                        peerColor2 = user.profile_color;
                        if (peerColor2 != null) {
                            i14 = peerColor2.color;
                        } else {
                            i14 = -1;
                        }
                    } else {
                        i14 = -1;
                    }
                    peerColors2 = MessagesController.getInstance(j7Var.f13557a).profilePeerColors;
                    if (peerColors2 == null) {
                        color2 = null;
                    } else {
                        color2 = peerColors2.getColor(i14);
                    }
                    j7Var.c(color2, z10);
                }
            } else {
                if (user != null) {
                    j7Var.getClass();
                    peerColor2 = user.profile_color;
                    if (peerColor2 != null) {
                        i14 = peerColor2.color;
                    } else {
                        i14 = -1;
                    }
                } else {
                    i14 = -1;
                }
                peerColors2 = MessagesController.getInstance(j7Var.f13557a).profilePeerColors;
                if (peerColors2 == null) {
                    color2 = null;
                } else {
                    color2 = peerColors2.getColor(i14);
                }
                j7Var.c(color2, z10);
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-j10));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                    j7Var.c(MessagesController.PeerColor.fromCollectible(emojiStatus2), z10);
                } else {
                    if (chat != null) {
                        j7Var.getClass();
                        peerColor = chat.profile_color;
                        if (peerColor != null) {
                            i13 = peerColor.color;
                        } else {
                            i13 = -1;
                        }
                    } else {
                        i13 = -1;
                    }
                    peerColors = MessagesController.getInstance(j7Var.f13557a).profilePeerColors;
                    if (peerColors == null) {
                        color = null;
                    } else {
                        color = peerColors.getColor(i13);
                    }
                    j7Var.c(color, z10);
                }
            } else {
                if (chat != null) {
                    j7Var.getClass();
                    peerColor = chat.profile_color;
                    if (peerColor != null) {
                        i13 = peerColor.color;
                    } else {
                        i13 = -1;
                    }
                } else {
                    i13 = -1;
                }
                peerColors = MessagesController.getInstance(j7Var.f13557a).profilePeerColors;
                if (peerColors == null) {
                    color = null;
                } else {
                    color = peerColors.getColor(i13);
                }
                j7Var.c(color, z10);
            }
        }
        invalidate();
    }

    public float getFragmentTransitionProgress() {
        return this.E;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36223x = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f36222w;
            if (i10 >= arrayList.size()) {
                NotificationCenter.getInstance(this.f36205c).addObserver(this, NotificationCenter.storiesUpdated);
                return;
            } else {
                ((g4) arrayList.get(i10)).f13355b.onAttachedToWindow();
                i10++;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.f36223x = false;
        while (true) {
            ArrayList arrayList = this.f36222w;
            if (i10 >= arrayList.size()) {
                NotificationCenter.getInstance(this.f36205c).removeObserver(this, NotificationCenter.storiesUpdated);
                return;
            } else {
                ((g4) arrayList.get(i10)).f13355b.onDetachedFromWindow();
                i10++;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zContains;
        if (this.J < 0.9f) {
            zContains = this.M.contains(motionEvent.getX(), motionEvent.getY());
        } else {
            zContains = motionEvent.getX() >= this.f36204b0 && motionEvent.getX() <= this.f36206c0 && Math.abs(motionEvent.getY() - this.f36207d0) < ((float) AndroidUtilities.dp(32.0f));
        }
        f4 f4Var = this.f36216k0;
        if (zContains && motionEvent.getAction() == 0) {
            this.f36217l0 = System.currentTimeMillis();
            this.m0 = motionEvent.getX();
            this.f36219n0 = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(f4Var);
            AndroidUtilities.runOnUIThread(f4Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(f4Var);
            if (zContains && System.currentTimeMillis() - this.f36217l0 <= ViewConfiguration.getTapTimeout() && y.a(this.m0, this.f36219n0, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f)) {
                s6 s6Var = this.I;
                long j10 = this.d;
                if (s6Var.K(j10) || s6Var.I(j10) || !this.f36222w.isEmpty()) {
                    e(this.f36215j0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.f36217l0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(f4Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f10) {
        if (g6.I.q()) {
            return;
        }
        this.K = f10;
        invalidate();
    }

    public void setExpandProgress(float f10) {
        if (this.J != f10) {
            this.J = f10;
            invalidate();
        }
    }

    public void setFragmentTransitionProgress(float f10) {
        if (this.E == f10) {
            return;
        }
        this.E = f10;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f10) {
        if (this.D == f10) {
            return;
        }
        this.D = f10;
        invalidate();
    }

    public void setStories(TL_stories.PeerStories peerStories) {
        f(true, false);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f36218n || super.verifyDrawable(drawable);
    }

    public void e(i iVar) {
    }
}
