package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ProfileActivity;

public final class rg0 extends View {
    public float A;
    public qg0 B;
    public final HashSet C;
    public int D;
    public boolean E;
    public boolean F;
    public og0 G;
    public og0 H;
    public og0 I;
    public final float J;
    public final float K;
    public final float L;
    public int M;
    public boolean N;
    public RadialGradient O;
    public final Matrix P;
    public int Q;
    public PorterDuffColorFilter R;
    public og0 S;
    public float T;
    public float U;
    public long V;
    public ng0 W;

    public final ArrayList f32157a;

    public final Paint f32158b;

    public final Paint f32159c;
    public float d;

    public boolean f32160e;

    public float f32161f;
    public final Path h;

    public final Path f32162n;

    public org.telegram.ui.iz0 f32163r;

    public float f32164s;
    public float v;

    public RenderNode f32165w;

    public int f32166x;

    public final int f32167y;

    public rg0(Context context, int i10) {
        super(context);
        this.f32157a = new ArrayList();
        Paint paint = new Paint();
        this.f32158b = paint;
        this.f32159c = new Paint();
        this.f32160e = true;
        this.f32161f = -1.0f;
        this.h = new Path();
        this.f32162n = new Path();
        this.f32166x = 0;
        this.A = 0.0f;
        this.B = null;
        this.C = new HashSet();
        this.D = 6;
        this.G = null;
        this.M = 0;
        this.P = new Matrix();
        this.S = null;
        paint.setColor(-16777216);
        paint.setAlpha(40);
        this.J = AndroidUtilities.dpf2(14.0f);
        float fDpf2 = AndroidUtilities.dpf2(12.0f);
        this.K = fDpf2;
        float fDpf3 = AndroidUtilities.dpf2(8.0f);
        this.L = fDpf3;
        AndroidUtilities.dpf2(4.0f);
        this.f32167y = (int) ((i10 - fDpf2) - fDpf3);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f10 = this.J;
        int i10 = this.f32166x;
        return ((measuredWidth - ((f10 / 2.0f) * (i10 - 1))) - (f10 * 2.0f)) / i10;
    }

    public static og0 j(int i10, List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            og0 og0Var = (og0) list.get(i11);
            if (!og0Var.f31292o && og0Var.f31280a == i10) {
                return og0Var;
            }
        }
        return null;
    }

    public final void a() {
        og0 og0Var = new og0(this, pg0.E);
        og0Var.f31280a = 14;
        this.f32157a.add(og0Var);
    }

    public final void b() {
        og0 og0Var = new og0(this, pg0.F);
        og0Var.f31280a = 16;
        this.f32157a.add(og0Var);
    }

    public final void c() {
        og0 og0Var = new og0(this, pg0.G);
        og0Var.f31280a = 17;
        this.f32157a.add(og0Var);
    }

    public final void d() {
        if (this.E) {
            return;
        }
        if (this.D == 6) {
            this.f32166x = this.f32157a.size();
            invalidate();
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.C;
        boolean z10 = hashSet.contains(7) && !hashSet.contains(9);
        int i10 = this.D;
        if (i10 == 0) {
            m(0, arrayList);
            m(1, arrayList);
            m(5, arrayList);
            m(6, arrayList);
            n(3, 6, arrayList);
        } else if (i10 == 1) {
            if (z10) {
                m(7, arrayList);
            } else {
                m(10, arrayList);
                n(11, 10, arrayList);
            }
            m(1, arrayList);
            if (!z10) {
                m(2, arrayList);
                if (hashSet.contains(3) && !hashSet.contains(2) && !hashSet.contains(12)) {
                    arrayList.add(k(3));
                }
            }
            n(4, 12, arrayList);
            if (z10) {
                arrayList.add(k(8));
            } else {
                m(12, arrayList);
                n(9, 12, arrayList);
            }
        } else if (i10 == 2) {
            m(0, arrayList);
            m(1, arrayList);
            m(4, arrayList);
            arrayList.add(k(13));
        } else if (i10 == 3 || i10 == 4) {
            if (z10) {
                m(7, arrayList);
            } else {
                m(0, arrayList);
            }
            m(1, arrayList);
            if (z10) {
                arrayList.add(k(8));
            } else {
                m(10, arrayList);
                n(11, 10, arrayList);
                m(12, arrayList);
                m(9, arrayList);
            }
        } else if (i10 == 5) {
            m(0, arrayList);
            m(1, arrayList);
        }
        AndroidUtilities.runOnUIThread(new lg0(1, this, arrayList));
    }

    public final void e() {
        this.E = true;
    }

    public final boolean f() {
        int i10 = this.D;
        return i10 == 1 || i10 == 3;
    }

    public final void g() {
        int i10 = this.M;
        if (i10 == 0) {
            return;
        }
        if (!this.N) {
            this.f32158b.setColor(i10);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth <= 0) {
            return;
        }
        float f10 = this.J;
        float fMax = ((measuredWidth - ((f10 / 2.0f) * Math.max(0, this.f32166x - 1))) - (f10 * 2.0f)) / Math.max(1, this.f32166x);
        RadialGradient radialGradient = new RadialGradient(fMax / 2.0f, this.f32167y / 2.0f, this.N ? fMax * 0.65f : 1.0f, org.telegram.ui.ActionBar.g6.l1(0.8f, this.M), this.M, Shader.TileMode.CLAMP);
        this.O = radialGradient;
        this.f32159c.setShader(radialGradient);
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.W == null) {
            this.W = new ng0(this);
        }
        return this.W;
    }

    public float getRoundRadius() {
        return AndroidUtilities.dp(16.0f);
    }

    public final void h(Canvas canvas, Drawable drawable, float f10) {
        if (drawable == null) {
            return;
        }
        drawable.setColorFilter(this.R);
        drawable.setAlpha((int) (f10 * 255.0f));
        drawable.draw(canvas);
    }

    public final void i() {
        if (this.f32165w != null) {
            this.f32165w = null;
            this.f32163r = null;
            invalidate();
        }
    }

    public final og0 k(int i10) {
        og0 og0VarJ = j(i10, this.f32157a);
        if (og0VarJ != null) {
            if (i10 == 1) {
                p(og0VarJ, false);
            }
            return og0VarJ;
        }
        switch (i10) {
            case 0:
                og0VarJ = new og0(this, pg0.d);
                break;
            case 1:
                og0VarJ = new og0(this);
                p(og0VarJ, false);
                break;
            case 2:
                og0VarJ = new og0(this, pg0.h);
                break;
            case 3:
                og0VarJ = new og0(this, pg0.f31601n);
                og0VarJ.f31297t = true;
                og0VarJ.f31300x = 200;
                break;
            case 4:
                og0VarJ = new og0(this, pg0.f31602r);
                break;
            case 5:
                og0VarJ = new og0(this, pg0.f31603s);
                this.G = og0VarJ;
                og0VarJ.f31297t = true;
                og0VarJ.f31300x = 500;
                break;
            case 6:
                og0VarJ = new og0(this, pg0.v);
                og0VarJ.f31297t = true;
                og0VarJ.f31300x = 500;
                break;
            case 7:
                og0VarJ = new og0(this, pg0.f31604w);
                og0VarJ.f31297t = true;
                og0VarJ.v = 300;
                break;
            case 8:
                og0VarJ = new og0(this, pg0.f31605x);
                og0VarJ.f31297t = true;
                og0VarJ.f31300x = 500;
                break;
            case 9:
                og0VarJ = new og0(this, pg0.f31606y);
                og0VarJ.f31297t = true;
                og0VarJ.f31298u = R.raw.profile_leave;
                og0VarJ.f31300x = 300;
                break;
            case 10:
                og0VarJ = new og0(this, pg0.A);
                og0VarJ.f31297t = true;
                og0VarJ.f31298u = R.raw.profile_voicechat;
                og0VarJ.f31300x = 500;
                break;
            case 11:
                og0VarJ = new og0(this, pg0.B);
                og0VarJ.f31297t = true;
                og0VarJ.f31298u = R.raw.profile_voicechat;
                og0VarJ.f31300x = 500;
                break;
            case 12:
                og0VarJ = new og0(this, pg0.C);
                break;
            case 13:
                og0VarJ = new og0(this, pg0.D);
                og0VarJ.f31297t = true;
                og0VarJ.f31300x = 300;
                break;
        }
        if (og0VarJ != null) {
            og0VarJ.f31280a = i10;
        }
        return og0VarJ;
    }

    public final boolean l() {
        return this.C.contains(5) && this.G != null;
    }

    public final void m(int i10, ArrayList arrayList) {
        if (this.C.contains(Integer.valueOf(i10))) {
            arrayList.add(k(i10));
        }
    }

    public final void n(int i10, int i11, ArrayList arrayList) {
        Integer numValueOf = Integer.valueOf(i10);
        HashSet hashSet = this.C;
        if (!hashSet.contains(numValueOf) || hashSet.contains(Integer.valueOf(i11))) {
            return;
        }
        arrayList.add(k(i10));
    }

    public final void o(int i10, boolean z10) {
        HashSet hashSet = this.C;
        if (z10 ? hashSet.add(Integer.valueOf(i10)) : hashSet.remove(Integer.valueOf(i10))) {
            d();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        og0 og0Var;
        float f14;
        boolean z10;
        boolean z11;
        int i10;
        og0 og0Var2;
        og0 og0Var3;
        float f15 = this.f32161f;
        if (f15 >= 0.0f) {
            float y10 = f15 - getY();
            if (y10 <= 0.0f) {
                return;
            } else {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), y10);
            }
        }
        float f16 = this.A - this.K;
        float f17 = this.L;
        float fMax = Math.max(0.0f, f16 - f17);
        if (fMax <= 0.0f) {
            return;
        }
        float f18 = this.J;
        float f19 = f18 / 2.0f;
        float itemWidth = getItemWidth();
        float roundRadius = getRoundRadius();
        RenderNode renderNode = this.f32165w;
        Path path = this.f32162n;
        if (renderNode != null) {
            path.rewind();
        }
        ArrayList arrayList = this.f32157a;
        int size = arrayList.size();
        og0 og0Var4 = null;
        og0 og0Var5 = null;
        int i11 = 0;
        float f20 = 2.0f;
        while (i11 < size) {
            og0 og0Var6 = (og0) arrayList.get(i11);
            boolean z12 = og0Var6.f31293p;
            float f21 = fMax;
            nc ncVar = og0Var6.f31281b;
            float f22 = f19;
            RectF rectF = og0Var6.d;
            if (!z12) {
                if (!og0Var6.f31292o) {
                    rectF.set(f18, f17, f18 + itemWidth, f17 + f21);
                    f18 += itemWidth + f22;
                    if (og0Var4 == null) {
                        og0Var4 = og0Var6;
                    }
                    og0Var5 = og0Var6;
                }
                y5 y5Var = og0Var6.f31283e;
                RectF rectF2 = og0Var6.f31282c;
                float f23 = f18;
                rg0 rg0Var = og0Var6.f31301y;
                RectF rectF3 = og0Var6.f31284f;
                RectF rectF4 = og0Var6.f31285g;
                og0 og0Var7 = og0Var4;
                if (og0Var6.f31292o) {
                    og0Var6.a();
                } else {
                    boolean z13 = rg0Var.f32160e;
                    float f24 = rg0Var.J;
                    if (z13) {
                        og0Var6.f31291n = false;
                        rectF2.set(rectF);
                        rectF4.set(rectF);
                        rectF3.set(rectF);
                        y5Var.d(1.0f, true);
                    } else {
                        if (rectF3.isEmpty()) {
                            og0Var6.f31291n = true;
                            rectF3.set(rectF);
                            rectF4.set(rectF);
                            boolean z14 = rectF.left - 1.0f <= f24;
                            boolean z15 = rectF.right + 1.0f >= ((float) rg0Var.getMeasuredWidth()) - f24;
                            if (z14 && z15) {
                                og0Var = og0Var5;
                            } else {
                                z11 = z15;
                                og0 og0Var8 = rg0Var.H;
                                if (og0Var8 != null) {
                                    og0Var = og0Var5;
                                    if (og0Var8.f31280a != og0Var6.f31280a) {
                                    }
                                    i10 = og0Var6.f31280a;
                                    if (((i10 != 5 || i10 == 6) && rg0Var.D == 0) || ((i10 == 3 || i10 == 2) && rg0Var.D == 1)) {
                                        z11 = false;
                                        z14 = true;
                                    } else if (z14 && (og0Var3 = rg0Var.H) != null && !og0Var3.f31292o) {
                                        z11 = true;
                                        z14 = false;
                                    } else if (z11 && (og0Var2 = rg0Var.I) != null && !og0Var2.f31292o) {
                                        z11 = false;
                                        z14 = true;
                                    }
                                    if (z14) {
                                        rectF4.left = rectF4.right;
                                    } else if (z11) {
                                        rectF4.right = rectF4.left;
                                    } else {
                                        float fCenterX = rectF3.centerX();
                                        rectF4.right = fCenterX;
                                        rectF4.left = fCenterX;
                                    }
                                    f14 = 0.0f;
                                    z10 = true;
                                    y5Var.d(0.0f, true);
                                } else {
                                    og0Var = og0Var5;
                                }
                                og0 og0Var9 = rg0Var.I;
                                if (og0Var9 != null && og0Var9.f31280a == og0Var6.f31280a) {
                                }
                                i10 = og0Var6.f31280a;
                                if (i10 != 5) {
                                }
                                z11 = false;
                                z14 = true;
                                if (z14) {
                                    rectF4.left = rectF4.right;
                                } else if (z11) {
                                    rectF4.right = rectF4.left;
                                } else {
                                    float fCenterX2 = rectF3.centerX();
                                    rectF4.right = fCenterX2;
                                    rectF4.left = fCenterX2;
                                }
                                f14 = 0.0f;
                                z10 = true;
                                y5Var.d(0.0f, true);
                            }
                            z11 = false;
                            z14 = false;
                            i10 = og0Var6.f31280a;
                            if (i10 != 5) {
                            }
                            z11 = false;
                            z14 = true;
                            if (z14) {
                                rectF4.left = rectF4.right;
                            } else if (z11) {
                                rectF4.right = rectF4.left;
                            } else {
                                float fCenterX3 = rectF3.centerX();
                                rectF4.right = fCenterX3;
                                rectF4.left = fCenterX3;
                            }
                            f14 = 0.0f;
                            z10 = true;
                            y5Var.d(0.0f, true);
                        } else {
                            og0Var = og0Var5;
                            f14 = 0.0f;
                            z10 = true;
                        }
                        if (!rectF.equals(rectF3)) {
                            rectF4.set(rectF2);
                            rectF3.set(rectF);
                            y5Var.d(f14, z10);
                        }
                        og0Var6.a();
                        rectF2.set(rectF);
                    }
                    if (this.f32165w != null) {
                        RectF rectF5 = AndroidUtilities.rectTmp;
                        rectF5.set(rectF);
                        rectF5.inset((1.0f - ncVar.a(0.04f)) * (rectF.width() / 2.0f), (1.0f - ncVar.a(0.04f)) * (rectF.height() / 2.0f));
                        rectF5.inset(-1.0f, -1.0f);
                        path.addRoundRect(rectF5, roundRadius, roundRadius, Path.Direction.CCW);
                    }
                    f18 = f23;
                    og0Var4 = og0Var7;
                    og0Var5 = og0Var;
                }
                og0Var = og0Var5;
                if (this.f32165w != null) {
                    RectF rectF6 = AndroidUtilities.rectTmp;
                    rectF6.set(rectF);
                    rectF6.inset((1.0f - ncVar.a(0.04f)) * (rectF.width() / 2.0f), (1.0f - ncVar.a(0.04f)) * (rectF.height() / 2.0f));
                    rectF6.inset(-1.0f, -1.0f);
                    path.addRoundRect(rectF6, roundRadius, roundRadius, Path.Direction.CCW);
                }
                f18 = f23;
                og0Var4 = og0Var7;
                og0Var5 = og0Var;
            }
            i11++;
            fMax = f21;
            f19 = f22;
            f17 = f17;
            itemWidth = itemWidth;
        }
        this.H = og0Var4;
        this.I = og0Var5;
        float f25 = this.f32167y;
        float fClamp01 = Utilities.clamp01(fMax / f25);
        float fClamp02 = Utilities.clamp01((fClamp01 - 0.2f) / 0.8f);
        if (fClamp02 <= 0.0f) {
            return;
        }
        int i12 = 0;
        while (i12 < size) {
            og0 og0Var10 = (og0) arrayList.get(i12);
            boolean z16 = og0Var10.f31293p;
            nc ncVar2 = og0Var10.f31281b;
            RectF rectF7 = og0Var10.d;
            if (z16) {
                fClamp02 = fClamp02;
                i12 = i12;
            } else {
                RectF rectF8 = AndroidUtilities.rectTmp;
                rectF8.set(rectF7);
                rectF8.inset((1.0f - ncVar2.a(0.04f)) * (rectF7.width() / 2.0f), (1.0f - ncVar2.a(0.04f)) * (rectF7.height() / 2.0f));
                Paint paint = this.f32158b;
                int alpha = paint.getAlpha();
                float fB = (int) (og0Var10.b() * fClamp02 * alpha);
                paint.setAlpha((int) ((this.O != null ? 0.1f : 1.0f) * fB));
                if (!SharedConfig.shadowsInSections || AndroidUtilities.computePerceivedBrightness(this.M) <= 0.72f || this.d >= 0.5f) {
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                } else {
                    paint.setShadowLayer(AndroidUtilities.dpf2(1.5f), 0.0f, 0.0f, org.telegram.ui.ActionBar.g6.l1((fB / 255.0f) * (this.O != null ? 0.1f : 1.0f), 536870912));
                }
                canvas.drawRoundRect(rectF8, roundRadius, roundRadius, paint);
                if (this.O != null) {
                    Paint paint2 = this.f32159c;
                    int alpha2 = paint2.getAlpha();
                    paint2.setAlpha((int) (og0Var10.b() * fClamp02 * alpha2));
                    float f26 = rectF8.left;
                    float f27 = rectF8.top;
                    Matrix matrix = this.P;
                    matrix.setTranslate(f26, f27);
                    this.O.setLocalMatrix(matrix);
                    canvas.drawRoundRect(rectF8, roundRadius, roundRadius, paint2);
                    paint2.setAlpha(alpha2);
                }
                paint.setAlpha(alpha);
            }
            i12++;
            fClamp02 = fClamp02;
        }
        RenderNode renderNode2 = this.f32165w;
        if (renderNode2 != null && Build.VERSION.SDK_INT >= 29 && renderNode2.hasDisplayList() && canvas.isHardwareAccelerated()) {
            canvas.save();
            org.telegram.ui.iz0 iz0Var = this.f32163r;
            if (iz0Var != null) {
                View view = (View) iz0Var.getParent();
                float x8 = view.getX();
                float y11 = view.getY() - getTranslationY();
                float scaleX = view.getScaleX() * view.getWidth();
                float scaleY = view.getScaleY() * view.getHeight();
                Path path2 = this.h;
                path2.rewind();
                path2.addRoundRect(x8, y11, x8 + scaleX, y11 + scaleY, view.getScaleX() * this.f32163r.getRoundRadiusForExpand(), view.getScaleY() * this.f32163r.getRoundRadiusForExpand(), Path.Direction.CCW);
                canvas.clipPath(path2);
            }
            canvas.clipPath(path);
            canvas.translate(0.0f, this.v);
            float f28 = this.f32164s;
            canvas.scale(f28, f28);
            canvas.drawRenderNode(this.f32165w);
            canvas.restore();
        }
        float fClamp03 = Utilities.clamp01((fClamp01 - 0.4f) / 0.6f);
        if (fClamp03 > 0.0f) {
            int i13 = 0;
            while (i13 < size) {
                og0 og0Var11 = (og0) arrayList.get(i13);
                if (og0Var11 != null) {
                    Rect rect = og0Var11.h;
                    RectF rectF9 = og0Var11.d;
                    if (og0Var11.f31293p) {
                        f10 = f25;
                        f11 = fClamp01;
                        f12 = fClamp03;
                    } else {
                        boolean z17 = AndroidUtilities.computePerceivedBrightness(this.M) > 0.72f;
                        float fA = (!z17 || Build.VERSION.SDK_INT >= 31) ? !z17 ? 1.0f : h7.n.a((this.d - 0.75f) / 0.25f, 0.0f, 1.0f) : 0.0f;
                        int iD = i0.b.d(fA, -16777216, -1);
                        if (this.R == null || this.Q != iD) {
                            this.Q = iD;
                            this.R = new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN);
                        }
                        canvas.save();
                        float fB2 = og0Var11.b() * fClamp03;
                        float fCenterX4 = rectF9.centerX();
                        float fCenterY = rectF9.centerY();
                        float f29 = fA;
                        f11 = fClamp01;
                        float fA2 = og0Var11.f31281b.a(0.04f) * f11;
                        canvas.scale(fA2, fA2, fCenterX4, fCenterY);
                        canvas.clipRect(rectF9);
                        float fCenterX5 = rectF9.centerX();
                        rectF9.centerY();
                        float fDp = AndroidUtilities.dp(24.0f);
                        float f30 = fDp * 0.5f;
                        og0Var11.f31289l.q(rectF9.width() - AndroidUtilities.dp(f20));
                        if (og0Var11.f31289l.f31696b.getLineCount() >= 3) {
                            f13 = 0.75f;
                        } else {
                            f13 = og0Var11.f31289l.f31696b.getLineCount() >= 2 ? 0.85f : 1.0f;
                        }
                        og0Var11.f31290m = f13;
                        float fMax2 = Math.max(0.0f, AndroidUtilities.dpf2(1.33f) + com.google.android.recaptcha.internal.a.w(og0Var11.f31289l.j(), og0Var11.f31290m, f25, 3.0f));
                        rect.set((int) (fCenterX5 - f30), (int) fMax2, (int) (fCenterX5 + f30), (int) (fMax2 + fDp));
                        oi0 oi0Var = og0Var11.f31288k;
                        if (oi0Var != null) {
                            oi0Var.setBounds(rect);
                        }
                        Drawable drawable = og0Var11.f31286i;
                        if (drawable != null) {
                            drawable.setBounds(rect);
                        }
                        Drawable drawable2 = og0Var11.f31287j;
                        if (drawable2 != null) {
                            drawable2.setBounds(rect);
                        }
                        float fJ = ((rect.bottom + rect.top) - ((og0Var11.f31289l.j() * og0Var11.f31290m) / f20)) - AndroidUtilities.dp(4.66f);
                        canvas.save();
                        float f31 = og0Var11.f31290m;
                        f10 = f25;
                        canvas.scale(f31, f31, fCenterX4, a9.p.d(og0Var11.f31289l.j(), og0Var11.f31290m, 2.0f, fJ));
                        pz0 pz0Var = og0Var11.f31289l;
                        pz0Var.c(fCenterX4 - (pz0Var.l() / 2.0f), fJ, fB2, iD, canvas);
                        canvas.restore();
                        float f32 = og0Var11.f31294q;
                        if (f32 != 1.0f) {
                            canvas.scale(f32, f32, rect.centerX(), rect.centerY());
                        }
                        float f33 = (1.0f - f29) * fB2;
                        float f34 = f29 * fB2;
                        oi0 oi0Var2 = og0Var11.f31288k;
                        if (oi0Var2 == null) {
                            h(canvas, og0Var11.f31287j, f33);
                            h(canvas, og0Var11.f31286i, f34);
                        } else if (og0Var11.f31280a == 1) {
                            h(canvas, og0Var11.f31287j, f33);
                            h(canvas, og0Var11.f31288k, f34);
                        } else {
                            h(canvas, oi0Var2, fB2);
                        }
                        canvas.restore();
                        if (og0Var11.f31300x > 0 && System.currentTimeMillis() > ((long) og0Var11.f31300x) + og0Var11.f31299w) {
                            og0Var11.f31296s = false;
                        }
                        if (og0Var11.f31296s) {
                            t80 t80Var = og0Var11.f31295r;
                            if (t80Var == null) {
                                t80 t80Var2 = new t80();
                                og0Var11.f31295r = t80Var2;
                                t80Var2.setCallback(this);
                                og0Var11.f31295r.f(org.telegram.ui.ActionBar.g6.l1(0.1f, -1), org.telegram.ui.ActionBar.g6.l1(0.3f, -1), org.telegram.ui.ActionBar.g6.l1(0.35f, -1), org.telegram.ui.ActionBar.g6.l1(0.8f, -1));
                                t80 t80Var3 = og0Var11.f31295r;
                                t80Var3.C = true;
                                t80Var3.f32710w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                            } else if (t80Var.b() || og0Var11.f31295r.c()) {
                                t80 t80Var4 = og0Var11.f31295r;
                                f12 = fClamp03;
                                t80Var4.f32692b = -1L;
                                t80Var4.f32693c = -1L;
                            }
                            f12 = fClamp03;
                        } else {
                            f12 = fClamp03;
                            t80 t80Var5 = og0Var11.f31295r;
                            if (t80Var5 != null && !t80Var5.c() && !og0Var11.f31295r.b()) {
                                og0Var11.f31295r.a();
                            }
                        }
                        t80 t80Var6 = og0Var11.f31295r;
                        if (t80Var6 != null) {
                            t80Var6.d(rectF9);
                            og0Var11.f31295r.h(getRoundRadius());
                            og0Var11.f31295r.setAlpha((int) (fB2 * 255.0f));
                            og0Var11.f31295r.draw(canvas);
                        }
                    }
                } else {
                    f10 = f25;
                    f11 = fClamp01;
                    f12 = fClamp03;
                }
                i13++;
                fClamp03 = f12;
                f25 = f10;
                fClamp01 = f11;
                f20 = 2.0f;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.makeMeasureSpec((int) (this.f32167y + this.L + this.K), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        og0 og0Var;
        if (this.A >= AndroidUtilities.dp(8.0f)) {
            float x8 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.S = null;
                ArrayList arrayList = this.f32157a;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    og0 og0Var2 = (og0) arrayList.get(i10);
                    if (!og0Var2.f31292o && og0Var2.d.contains(x8, y10)) {
                        this.S = og0Var2;
                        this.T = x8;
                        this.U = y10;
                        this.V = System.currentTimeMillis();
                        this.S.f31281b.c(true);
                        break;
                    }
                }
            } else if (action == 2) {
                if (this.S != null && (Math.abs(x8 - this.T) > 20.0f || Math.abs(y10 - this.U) > 20.0f)) {
                    this.S.f31281b.c(false);
                    this.S = null;
                }
            } else if ((action == 1 || action == 3) && (og0Var = this.S) != null) {
                og0Var.f31281b.c(false);
                if (action == 1 && this.S.d.contains(x8, y10)) {
                    if (System.currentTimeMillis() - this.V > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    og0 og0Var3 = this.S;
                    if (og0Var3.f31297t && !og0Var3.f31296s) {
                        og0Var3.f31296s = true;
                        invalidate();
                    }
                    og0 og0Var4 = this.S;
                    int i11 = og0Var4.f31298u;
                    if (i11 != 0) {
                        og0Var4.d(i11, 0, 0);
                    }
                    this.S.f31299w = System.currentTimeMillis();
                    og0 og0Var5 = this.S;
                    qg0 qg0Var = this.B;
                    if (qg0Var != null) {
                        int i12 = og0Var5.v;
                        if (i12 == 0) {
                            int i13 = og0Var5.f31280a;
                            RectF rectF = og0Var5.d;
                            ProfileActivity.Y(((org.telegram.ui.gx0) qg0Var).f38493b, i13, rectF.left, rectF.top);
                        } else {
                            postDelayed(new lg0(2, this, og0Var5), i12);
                        }
                    }
                }
                this.S = null;
                return true;
            }
            if (this.S != null) {
                return true;
            }
        }
        return false;
    }

    public final void p(og0 og0Var, boolean z10) {
        if (!z10) {
            pg0 pg0Var = this.F ? pg0.f31599e : pg0.f31600f;
            og0Var.d(0, pg0Var.f31608b, pg0Var.f31609c);
            og0Var.c(LocaleController.getString(pg0Var.f31607a));
        } else if (this.F) {
            pg0 pg0Var2 = pg0.f31599e;
            og0Var.c(LocaleController.getString(pg0Var2.f31607a));
            og0Var.d(R.raw.profile_unmuting, pg0Var2.f31608b, pg0Var2.f31609c);
        } else {
            pg0 pg0Var3 = pg0.f31600f;
            og0Var.c(LocaleController.getString(pg0Var3.f31607a));
            og0Var.d(R.raw.profile_muting, pg0Var3.f31608b, pg0Var3.f31609c);
        }
    }

    public void setNotifications(boolean z10) {
        boolean z11 = this.F != z10;
        this.F = z10;
        og0 og0VarJ = j(1, this.f32157a);
        if (og0VarJ != null) {
            p(og0VarJ, z11);
            invalidate();
        } else {
            this.C.add(1);
            d();
        }
    }

    public void setOnActionClickListener(qg0 qg0Var) {
        this.B = qg0Var;
    }

    public void setParentExpanded(float f10) {
        if (this.d != f10) {
            this.d = f10;
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || (drawable instanceof t80);
    }
}
