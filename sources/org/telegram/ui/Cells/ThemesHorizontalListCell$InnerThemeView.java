package org.telegram.ui.Cells;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import b8.mf;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.la0;
public class ThemesHorizontalListCell$InnerThemeView extends FrameLayout {
    public static final int f28909c0 = 0;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public ObjectAnimator M;
    public float N;
    public final ArgbEvaluator O;
    public Drawable P;
    public final Paint Q;
    public BitmapShader R;
    public boolean S;
    public final Matrix T;
    public Drawable U;
    public int V;
    public long W;
    public final RadioButton f28910a;
    public boolean f28911a0;
    public org.telegram.ui.ActionBar.j6 f28912b;
    public final ga f28913b0;
    public final RectF f28914c;
    public final Paint d;
    public Drawable f28915e;
    public final TextPaint f28916f;
    public final Drawable h;
    public final Drawable f28917n;
    public boolean f28918r;
    public boolean f28919s;
    public float f28920w;
    public int f28921x;
    public int f28922y;

    public ThemesHorizontalListCell$InnerThemeView(ga gaVar, Context context) {
        super(context);
        this.f28913b0 = gaVar;
        this.f28914c = new RectF();
        this.d = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f28916f = textPaint;
        this.O = new ArgbEvaluator();
        this.Q = new Paint(3);
        this.T = new Matrix();
        setWillNotDraw(false);
        this.h = context.getResources().getDrawable(2131231981).mutate();
        this.f28917n = k2.p1.g(context, 2131231982);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        RadioButton radioButton = new RadioButton(context);
        this.f28910a = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        addView(radioButton, mf.d(22, 22.0f, 51, 27.0f, 75.0f, 0.0f, 0.0f));
    }

    public final void a() {
        int i3;
        org.telegram.ui.ActionBar.j6 j6Var = this.f28912b;
        if (j6Var.T && j6Var.Z == org.telegram.ui.ActionBar.k6.f28056n) {
            i3 = -1;
        } else {
            i3 = j6Var.R;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.h.setColorFilter(new PorterDuffColorFilter(i3, mode));
        this.f28917n.setColorFilter(new PorterDuffColorFilter(this.f28912b.p(), mode));
        double[] dArr = null;
        if (this.f28912b.f27677b == null) {
            d(false);
            this.f28915e = null;
        } else {
            this.f28915e = getResources().getDrawable(2131232575).mutate();
            int o10 = this.f28912b.o();
            this.E = o10;
            this.J = o10;
        }
        this.R = null;
        this.P = null;
        org.telegram.ui.ActionBar.j6 j6Var2 = this.f28912b;
        int i10 = j6Var2.N;
        if (i10 != 0 && j6Var2.O != 0) {
            int o11 = this.f28912b.o();
            org.telegram.ui.ActionBar.j6 j6Var3 = this.f28912b;
            la0 la0Var = new la0(true, o11, j6Var3.N, j6Var3.O, j6Var3.P);
            la0Var.v(org.telegram.messenger.g0.L(6.0f));
            this.P = la0Var;
            dArr = org.telegram.messenger.g0.e3(Color.red(this.f28912b.o()), Color.green(this.f28912b.o()), Color.blue(this.f28912b.o()));
        } else if (i10 != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{this.f28912b.o(), this.f28912b.N});
            gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(6.0f));
            this.P = gradientDrawable;
            dArr = org.telegram.messenger.g0.e3(Color.red(this.f28912b.o()), Color.green(this.f28912b.o()), Color.blue(this.f28912b.o()));
        } else if (j6Var2.Q <= 0 && j6Var2.f27679c == null) {
            if (j6Var2.o() != 0) {
                dArr = org.telegram.messenger.g0.e3(Color.red(this.f28912b.o()), Color.green(this.f28912b.o()), Color.blue(this.f28912b.o()));
            }
        } else {
            org.telegram.ui.ActionBar.j6 j6Var4 = this.f28912b;
            Bitmap e12 = org.telegram.messenger.g0.e1(org.telegram.messenger.g0.L(76.0f), org.telegram.messenger.g0.L(97.0f), j6Var4.f27679c, j6Var4.f27677b, j6Var4.Q);
            if (e12 != null) {
                this.P = new BitmapDrawable(e12);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(e12, tileMode, tileMode);
                this.R = bitmapShader;
                this.Q.setShader(bitmapShader);
                int[] q10 = org.telegram.messenger.g0.q(this.P);
                dArr = org.telegram.messenger.g0.e3(Color.red(q10[0]), Color.green(q10[0]), Color.blue(q10[0]));
            }
        }
        if (dArr != null && dArr[1] <= 0.10000000149011612d && dArr[2] >= 0.9599999785423279d) {
            this.S = true;
        } else {
            this.S = false;
        }
        if (this.f28912b.o() == 0 && this.f28912b.U && this.P == null) {
            la0 S = org.telegram.ui.ActionBar.k6.S(100, 200);
            this.P = S;
            S.v(org.telegram.messenger.g0.L(6.0f));
        }
        invalidate();
    }

    public final int b(int i3, int i10) {
        float f10 = this.N;
        if (f10 == 1.0f) {
            return i10;
        }
        return ((Integer) this.O.evaluate(f10, Integer.valueOf(i3), Integer.valueOf(i10))).intValue();
    }

    public final boolean c() {
        char c2;
        int h;
        int intValue;
        String[] split;
        HashMap hashMap = this.f28913b0.i3;
        org.telegram.ui.ActionBar.j6 j6Var = this.f28912b;
        if (j6Var == null || j6Var.f27677b == null) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.f28912b.f27677b));
            int i3 = 0;
            boolean z10 = false;
            while (true) {
                int read = fileInputStream.read(ga.f29277q3);
                char c10 = 65535;
                if (read == -1) {
                    break;
                }
                int i10 = i3;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i11 >= read) {
                        break;
                    }
                    byte[] bArr = ga.f29277q3;
                    if (bArr[i11] == 10) {
                        int i13 = i11 - i12;
                        int i14 = i13 + 1;
                        String str = new String(bArr, i12, i13, "UTF-8");
                        if (str.startsWith("WLS=")) {
                            String substring = str.substring(4);
                            Uri parse = Uri.parse(substring);
                            this.f28912b.f27682e = parse.getQueryParameter("slug");
                            org.telegram.ui.ActionBar.j6 j6Var2 = this.f28912b;
                            File h7 = org.telegram.messenger.t0.h();
                            j6Var2.f27679c = new File(h7, Utilities.a(substring) + ".wp").getAbsolutePath();
                            String queryParameter = parse.getQueryParameter("mode");
                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= split.length) {
                                        break;
                                    } else if ("blur".equals(split[i15])) {
                                        this.f28912b.h = true;
                                        break;
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                try {
                                    String queryParameter2 = parse.getQueryParameter("bg_color");
                                    if (!TextUtils.isEmpty(queryParameter2)) {
                                        this.f28912b.f27692r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                        if (queryParameter2.length() >= 13 && org.telegram.messenger.g0.S1(queryParameter2.charAt(6))) {
                                            this.f28912b.f27693s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                        }
                                        if (queryParameter2.length() >= 20 && org.telegram.messenger.g0.S1(queryParameter2.charAt(13))) {
                                            this.f28912b.f27694w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                        }
                                        if (queryParameter2.length() == 27 && org.telegram.messenger.g0.S1(queryParameter2.charAt(20))) {
                                            this.f28912b.f27695x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                                try {
                                    String queryParameter3 = parse.getQueryParameter("rotation");
                                    if (!TextUtils.isEmpty(queryParameter3)) {
                                        this.f28912b.f27696y = Utilities.z(queryParameter3).intValue();
                                    }
                                } catch (Exception unused2) {
                                }
                                String queryParameter4 = parse.getQueryParameter("intensity");
                                if (!TextUtils.isEmpty(queryParameter4)) {
                                    this.f28912b.E = Utilities.z(queryParameter4).intValue();
                                }
                                org.telegram.ui.ActionBar.j6 j6Var3 = this.f28912b;
                                if (j6Var3.E == 0) {
                                    j6Var3.E = 50;
                                }
                            }
                            c2 = 65535;
                        } else if (str.startsWith("WPS")) {
                            this.f28912b.Q = i14 + i10;
                            z10 = true;
                            break;
                        } else {
                            int indexOf = str.indexOf(61);
                            c2 = 65535;
                            if (indexOf != -1 && ((h = org.telegram.ui.ActionBar.u4.h(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.k6.f28143ra || h == org.telegram.ui.ActionBar.k6.f28086ob || h == org.telegram.ui.ActionBar.k6.Be || h == org.telegram.ui.ActionBar.k6.Ce || h == org.telegram.ui.ActionBar.k6.De || h == org.telegram.ui.ActionBar.k6.Ee)) {
                                String substring2 = str.substring(indexOf + 1);
                                if (substring2.length() > 0 && substring2.charAt(0) == '#') {
                                    try {
                                        intValue = Color.parseColor(substring2);
                                    } catch (Exception unused3) {
                                        intValue = Utilities.z(substring2).intValue();
                                    }
                                } else {
                                    intValue = Utilities.z(substring2).intValue();
                                }
                                if (h == org.telegram.ui.ActionBar.k6.f28143ra) {
                                    this.f28912b.R = intValue;
                                } else if (h == org.telegram.ui.ActionBar.k6.f28086ob) {
                                    this.f28912b.S = intValue;
                                } else if (h == org.telegram.ui.ActionBar.k6.Be) {
                                    this.f28912b.M = intValue;
                                } else if (h == org.telegram.ui.ActionBar.k6.Ce) {
                                    this.f28912b.N = intValue;
                                } else if (h == org.telegram.ui.ActionBar.k6.De) {
                                    this.f28912b.O = intValue;
                                } else if (h == org.telegram.ui.ActionBar.k6.Ee) {
                                    this.f28912b.P = intValue;
                                }
                            }
                        }
                        i12 += i14;
                        i10 += i14;
                    } else {
                        c2 = c10;
                    }
                    i11++;
                    c10 = c2;
                }
                if (z10 || i3 == i10) {
                    break;
                }
                fileInputStream.getChannel().position(i10);
                i3 = i10;
            }
            fileInputStream.close();
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        org.telegram.ui.ActionBar.j6 j6Var4 = this.f28912b;
        if (j6Var4.f27679c != null && !j6Var4.f27684f && !new File(this.f28912b.f27679c).exists()) {
            if (hashMap.containsKey(this.f28912b)) {
                return false;
            }
            org.telegram.ui.ActionBar.j6 j6Var5 = this.f28912b;
            hashMap.put(j6Var5, j6Var5.f27682e);
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            org.telegram.ui.ActionBar.j6 j6Var6 = this.f28912b;
            tL_inputWallPaperSlug.slug = j6Var6.f27682e;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(j6Var6.F).sendRequest(getwallpaper, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    int i16 = ThemesHorizontalListCell$InnerThemeView.f28909c0;
                    org.telegram.messenger.g0.h3(new ea(0, ThemesHorizontalListCell$InnerThemeView.this, tLObject));
                }
            });
            return false;
        }
        this.f28912b.U = true;
        return true;
    }

    public final void d(boolean z10) {
        int i3;
        int i10;
        int i11;
        this.H = this.f28921x;
        this.I = this.f28922y;
        this.J = this.E;
        this.K = this.F;
        int i12 = 0;
        org.telegram.ui.ActionBar.g6 k10 = this.f28912b.k(false);
        if (k10 != null) {
            i12 = k10.f27527c;
            i10 = k10.f27528e;
            if (i10 == 0) {
                i10 = i12;
            }
            i3 = (int) k10.f27532j;
            if (i3 == 0) {
                i3 = i12;
            }
        } else {
            i3 = 0;
            i10 = 0;
        }
        org.telegram.ui.ActionBar.j6 j6Var = this.f28912b;
        if (j6Var.T && j6Var.Z == org.telegram.ui.ActionBar.k6.f28056n) {
            i11 = -1;
        } else {
            i11 = j6Var.R;
        }
        this.f28921x = org.telegram.ui.ActionBar.k6.C(j6Var, i12, i11);
        org.telegram.ui.ActionBar.j6 j6Var2 = this.f28912b;
        this.f28922y = org.telegram.ui.ActionBar.k6.C(j6Var2, i10, j6Var2.p());
        org.telegram.ui.ActionBar.j6 j6Var3 = this.f28912b;
        this.E = org.telegram.ui.ActionBar.k6.C(j6Var3, i3, j6Var3.o());
        this.F = this.f28922y;
        this.G = this.f28912b.Z;
        ObjectAnimator objectAnimator = this.M;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z10) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "accentState", 0.0f, 1.0f);
            this.M = ofFloat;
            ofFloat.setDuration(200L);
            this.M.start();
            return;
        }
        setAccentState(1.0f);
    }

    public float getAccentState() {
        return this.N;
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.ActionBar.j6 D0;
        boolean z10;
        TLRPC.TL_theme tL_theme;
        super.onAttachedToWindow();
        ga gaVar = this.f28913b0;
        if (gaVar.f29285n3 == 1) {
            D0 = org.telegram.ui.ActionBar.k6.J;
        } else {
            D0 = org.telegram.ui.ActionBar.k6.D0();
        }
        if (this.f28912b == D0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28910a.a(z10, false);
        org.telegram.ui.ActionBar.j6 j6Var = this.f28912b;
        if (j6Var != null && (tL_theme = j6Var.G) != null && !j6Var.V) {
            if (!gaVar.f29280h3.containsKey(org.telegram.messenger.w7.r(null, tL_theme.document)) && !gaVar.i3.containsKey(this.f28912b)) {
                this.f28912b.V = true;
                this.f28920w = 0.0f;
                c();
                a();
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        float f10;
        int i10;
        float f11;
        float f12;
        if (this.G != this.f28912b.Z) {
            d(true);
        }
        if (this.f28919s) {
            i3 = org.telegram.messenger.g0.L(22.0f);
        } else {
            i3 = 0;
        }
        int L = org.telegram.messenger.g0.L(11.0f);
        float f13 = i3;
        float f14 = L;
        float L2 = org.telegram.messenger.g0.L(97.0f) + L;
        RectF rectF = this.f28914c;
        rectF.set(f13, f14, org.telegram.messenger.g0.L(76.0f) + i3, L2);
        String n4 = this.f28912b.n();
        if (n4.toLowerCase().endsWith(".attheme")) {
            n4 = n4.substring(0, n4.lastIndexOf(46));
        }
        int measuredWidth = getMeasuredWidth();
        if (this.f28919s) {
            f10 = 10.0f;
        } else {
            f10 = 15.0f;
        }
        int L3 = measuredWidth - org.telegram.messenger.g0.L(f10);
        if (this.f28918r) {
            i10 = org.telegram.messenger.g0.L(7.0f);
        } else {
            i10 = 0;
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint = this.f28916f;
        String charSequence = TextUtils.ellipsize(n4, textPaint, L3 - i10, truncateAt).toString();
        textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        canvas.drawText(charSequence, ((org.telegram.messenger.g0.L(76.0f) - ((int) Math.ceil(textPaint.measureText(charSequence)))) / 2) + i3, org.telegram.messenger.g0.L(131.0f), textPaint);
        org.telegram.ui.ActionBar.j6 j6Var = this.f28912b;
        TLRPC.TL_theme tL_theme = j6Var.G;
        Paint paint = this.d;
        RadioButton radioButton = this.f28910a;
        if (tL_theme != null && (tL_theme.document == null || !j6Var.V)) {
            f11 = 6.0f;
            f12 = 1.0f;
        } else {
            paint.setColor(b(this.J, this.E));
            boolean z10 = this.L;
            Drawable drawable = this.f28917n;
            Drawable drawable2 = this.h;
            if (z10) {
                f11 = 6.0f;
                f12 = 1.0f;
                int b10 = b(this.H, this.f28921x);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable2.setColorFilter(new PorterDuffColorFilter(b10, mode));
                drawable.setColorFilter(new PorterDuffColorFilter(b(this.I, this.f28922y), mode));
                this.L = false;
            } else {
                f11 = 6.0f;
                f12 = 1.0f;
            }
            Drawable drawable3 = this.P;
            if (drawable3 != null) {
                if (this.R != null) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable3;
                    float width = bitmapDrawable.getBitmap().getWidth();
                    float height = bitmapDrawable.getBitmap().getHeight();
                    float width2 = width / rectF.width();
                    float height2 = height / rectF.height();
                    Matrix matrix = this.T;
                    matrix.reset();
                    float min = f12 / Math.min(width2, height2);
                    float f15 = width / height2;
                    if (f15 > rectF.width()) {
                        matrix.setTranslate(f13 - ((f15 - rectF.width()) / 2.0f), f14);
                    } else {
                        matrix.setTranslate(f13, f14 - (((height / width2) - rectF.height()) / 2.0f));
                    }
                    matrix.preScale(min, min);
                    this.R.setLocalMatrix(matrix);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), this.Q);
                } else {
                    drawable3.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    this.P.draw(canvas);
                }
            } else {
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), paint);
            }
            radioButton.b(1728053247, -1);
            org.telegram.ui.ActionBar.j6 j6Var2 = this.f28912b;
            if (j6Var2.Y != 0) {
                if ("Day".equals(j6Var2.f27675a) || "Arctic Blue".equals(this.f28912b.f27675a)) {
                    radioButton.b(-5000269, b(this.K, this.F));
                    org.telegram.ui.ActionBar.k6.X1.setColor(733001146);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.ui.ActionBar.k6.X1);
                }
            } else if (this.S) {
                radioButton.b(-5000269, j6Var2.p());
                org.telegram.ui.ActionBar.k6.X1.setColor(733001146);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.ui.ActionBar.k6.X1);
            }
            drawable2.setBounds(org.telegram.messenger.g0.L(f11) + i3, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(49.0f) + i3, org.telegram.messenger.g0.L(36.0f));
            drawable2.draw(canvas);
            drawable.setBounds(org.telegram.messenger.g0.L(27.0f) + i3, org.telegram.messenger.g0.L(41.0f), org.telegram.messenger.g0.L(70.0f) + i3, org.telegram.messenger.g0.L(55.0f));
            drawable.draw(canvas);
            if (this.f28915e != null && this.f28913b0.f29285n3 == 0) {
                int L4 = ((int) rectF.right) - org.telegram.messenger.g0.L(16.0f);
                int L5 = org.telegram.messenger.g0.L(f11) + ((int) rectF.top);
                Drawable drawable4 = this.f28915e;
                drawable4.setBounds(L4, L5, drawable4.getIntrinsicWidth() + L4, this.f28915e.getIntrinsicHeight() + L5);
                this.f28915e.draw(canvas);
            }
        }
        org.telegram.ui.ActionBar.j6 j6Var3 = this.f28912b;
        TLRPC.TL_theme tL_theme2 = j6Var3.G;
        if (tL_theme2 != null && tL_theme2.document == null) {
            radioButton.setAlpha(0.0f);
            org.telegram.ui.ActionBar.k6.X1.setColor(733001146);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.ui.ActionBar.k6.X1);
            if (this.U != null) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E6, false);
                if (this.V != x02) {
                    Drawable drawable5 = this.U;
                    this.V = x02;
                    org.telegram.ui.ActionBar.k6.C1(x02, drawable5);
                }
                int centerX = (int) (rectF.centerX() - (this.U.getIntrinsicWidth() / 2));
                int centerY = (int) (rectF.centerY() - (this.U.getIntrinsicHeight() / 2));
                Drawable drawable6 = this.U;
                drawable6.setBounds(centerX, centerY, drawable6.getIntrinsicWidth() + centerX, this.U.getIntrinsicHeight() + centerY);
                this.U.draw(canvas);
            }
        } else if ((tL_theme2 != null && !j6Var3.V) || this.f28920w > 0.0f) {
            radioButton.setAlpha(f12 - this.f28920w);
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27824a7, false));
            paint.setAlpha((int) (this.f28920w * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), paint);
            if (this.U != null) {
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E6, false);
                if (this.V != x03) {
                    Drawable drawable7 = this.U;
                    this.V = x03;
                    org.telegram.ui.ActionBar.k6.C1(x03, drawable7);
                }
                int centerX2 = (int) (rectF.centerX() - (this.U.getIntrinsicWidth() / 2));
                int centerY2 = (int) (rectF.centerY() - (this.U.getIntrinsicHeight() / 2));
                this.U.setAlpha((int) (this.f28920w * 255.0f));
                Drawable drawable8 = this.U;
                drawable8.setBounds(centerX2, centerY2, drawable8.getIntrinsicWidth() + centerX2, this.U.getIntrinsicHeight() + centerY2);
                this.U.draw(canvas);
            }
            if (this.f28912b.V) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long min2 = Math.min(17L, elapsedRealtime - this.W);
                this.W = elapsedRealtime;
                float f16 = this.f28920w - (((float) min2) / 180.0f);
                this.f28920w = f16;
                if (f16 < 0.0f) {
                    this.f28920w = 0.0f;
                }
                invalidate();
            }
        } else if (radioButton.getAlpha() != f12) {
            radioButton.setAlpha(f12);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String n4 = this.f28912b.n();
        if (n4.toLowerCase().endsWith(".attheme")) {
            n4 = n4.substring(0, n4.lastIndexOf(46));
        }
        accessibilityNodeInfo.setText(n4);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setChecked(this.f28910a.f31589f);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, bd.M0(2131754839, null)));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12 = 22;
        if (this.f28918r) {
            i11 = 22;
        } else {
            i11 = 15;
        }
        int i13 = i11 + 76;
        if (!this.f28919s) {
            i12 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i13 + i12), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(148.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.j6 j6Var;
        if (this.f28915e != null && (j6Var = this.f28912b) != null && (j6Var.G == null || j6Var.V)) {
            ga gaVar = this.f28913b0;
            if (gaVar.f29285n3 == 0) {
                int action = motionEvent.getAction();
                if (action == 0 || action == 1) {
                    float x10 = motionEvent.getX();
                    float y9 = motionEvent.getY();
                    RectF rectF = this.f28914c;
                    if (x10 > rectF.centerX() && y9 < rectF.centerY() - org.telegram.messenger.g0.L(10.0f)) {
                        if (action == 0) {
                            this.f28911a0 = true;
                        } else {
                            try {
                                performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                            gaVar.C1(this.f28912b);
                        }
                    }
                    if (action == 1) {
                        this.f28911a0 = false;
                    }
                }
                return this.f28911a0;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentState(float f10) {
        this.N = f10;
        this.L = true;
        invalidate();
    }
}
