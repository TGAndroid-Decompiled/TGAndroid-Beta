package org.telegram.ui.Cells;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
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
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RadioButton;
public class ThemesHorizontalListCell$InnerThemeView extends FrameLayout {
    public static final int c0 = 0;
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
    public final RadioButton a;
    public boolean a0;
    public bmb b;
    public final f b0;
    public final RectF c;
    public final Paint d;
    public Drawable e;
    public final TextPaint f;
    public final Drawable h;
    public final Drawable n;
    public boolean r;
    public boolean s;
    public float w;
    public int x;
    public int y;

    public ThemesHorizontalListCell$InnerThemeView(f fVar, Context context) {
        super(context);
        this.b0 = fVar;
        this.c = new RectF();
        this.d = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        this.O = new ArgbEvaluator();
        this.Q = new Paint(3);
        this.T = new Matrix();
        setWillNotDraw(false);
        this.h = context.getResources().getDrawable(2131231986).mutate();
        this.n = b10.d(context, 2131231987);
        textPaint.setTextSize(gm.L(13.0f));
        RadioButton radioButton = new RadioButton(context);
        this.a = radioButton;
        radioButton.setSize(gm.L(20.0f));
        addView(radioButton, qoe.d(22, 22.0f, 51, 27.0f, 75.0f, 0.0f, 0.0f));
    }

    public final void a() {
        int i;
        bmb bmbVar = this.b;
        if (bmbVar.T && bmbVar.Z == cmb.n) {
            i = -1;
        } else {
            i = bmbVar.R;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.h.setColorFilter(new PorterDuffColorFilter(i, mode));
        this.n.setColorFilter(new PorterDuffColorFilter(this.b.n(), mode));
        double[] dArr = null;
        if (this.b.b == null) {
            d(false);
            this.e = null;
        } else {
            this.e = getResources().getDrawable(2131232594).mutate();
            int m = this.b.m();
            this.E = m;
            this.J = m;
        }
        this.R = null;
        this.P = null;
        bmb bmbVar2 = this.b;
        if (bmbVar2.N != 0) {
            if (bmbVar2.O != 0) {
                int m2 = this.b.m();
                bmb bmbVar3 = this.b;
                ah7 ah7Var = new ah7(m2, bmbVar3.N, bmbVar3.O, bmbVar3.P, true, false);
                ah7Var.u(gm.L(6.0f));
                this.P = ah7Var;
                dArr = gm.Z2(Color.red(this.b.m()), Color.green(this.b.m()), Color.blue(this.b.m()));
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{this.b.m(), this.b.N});
                gradientDrawable.setCornerRadius(gm.L(6.0f));
                this.P = gradientDrawable;
                dArr = gm.Z2(Color.red(this.b.m()), Color.green(this.b.m()), Color.blue(this.b.m()));
            }
        } else if (bmbVar2.Q <= 0 && bmbVar2.c == null) {
            if (bmbVar2.m() != 0) {
                dArr = gm.Z2(Color.red(this.b.m()), Color.green(this.b.m()), Color.blue(this.b.m()));
            }
        } else {
            bmb bmbVar4 = this.b;
            Bitmap d1 = gm.d1(gm.L(76.0f), gm.L(97.0f), bmbVar4.c, bmbVar4.b, bmbVar4.Q);
            if (d1 != null) {
                this.P = new BitmapDrawable(d1);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(d1, tileMode, tileMode);
                this.R = bitmapShader;
                this.Q.setShader(bitmapShader);
                int[] q = gm.q(this.P);
                dArr = gm.Z2(Color.red(q[0]), Color.green(q[0]), Color.blue(q[0]));
            }
        }
        if (dArr != null && dArr[1] <= 0.10000000149011612d && dArr[2] >= 0.9599999785423279d) {
            this.S = true;
        } else {
            this.S = false;
        }
        if (this.b.m() == 0 && this.b.U && this.P == null) {
            ah7 R = cmb.R(100, 200);
            this.P = R;
            R.u(gm.L(6.0f));
        }
        invalidate();
    }

    public final int b(int i, int i2) {
        float f = this.N;
        if (f == 1.0f) {
            return i2;
        }
        return ((Integer) this.O.evaluate(f, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }

    public final boolean c() {
        int d;
        int intValue;
        String[] split;
        HashMap hashMap = this.b0.i3;
        bmb bmbVar = this.b;
        if (bmbVar != null && bmbVar.b != null) {
            boolean z = true;
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(this.b.b));
                int i = 0;
                boolean z2 = false;
                while (true) {
                    int read = fileInputStream.read(f.q3);
                    if (read == -1) {
                        break;
                    }
                    int i2 = i;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i3 >= read) {
                            break;
                        }
                        byte[] bArr = f.q3;
                        if (bArr[i3] == 10) {
                            int i5 = i3 - i4;
                            int i6 = i5 + 1;
                            String str = new String(bArr, i4, i5, "UTF-8");
                            if (str.startsWith("WLS=")) {
                                String substring = str.substring(4);
                                Uri parse = Uri.parse(substring);
                                this.b.e = parse.getQueryParameter("slug");
                                this.b.c = usc.d(substring).getAbsolutePath();
                                String queryParameter = parse.getQueryParameter("mode");
                                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= split.length) {
                                            break;
                                        } else if ("blur".equals(split[i7])) {
                                            this.b.h = z;
                                            break;
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                                if (!TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                    try {
                                        String queryParameter2 = parse.getQueryParameter("bg_color");
                                        if (!TextUtils.isEmpty(queryParameter2)) {
                                            this.b.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                            if (queryParameter2.length() >= 13 && gm.Q1(queryParameter2.charAt(6))) {
                                                this.b.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                            }
                                            if (queryParameter2.length() >= 20 && gm.Q1(queryParameter2.charAt(13))) {
                                                this.b.w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                            }
                                            if (queryParameter2.length() == 27 && gm.Q1(queryParameter2.charAt(20))) {
                                                this.b.x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                            }
                                        }
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        String queryParameter3 = parse.getQueryParameter("rotation");
                                        if (!TextUtils.isEmpty(queryParameter3)) {
                                            this.b.y = Utilities.z(queryParameter3).intValue();
                                        }
                                    } catch (Exception unused2) {
                                    }
                                    String queryParameter4 = parse.getQueryParameter("intensity");
                                    if (!TextUtils.isEmpty(queryParameter4)) {
                                        this.b.E = Utilities.z(queryParameter4).intValue();
                                    }
                                    bmb bmbVar2 = this.b;
                                    if (bmbVar2.E == 0) {
                                        bmbVar2.E = 50;
                                    }
                                }
                            } else if (str.startsWith("WPS")) {
                                this.b.Q = i6 + i2;
                                z2 = true;
                                break;
                            } else {
                                int indexOf = str.indexOf(61);
                                if (indexOf != -1 && ((d = nxe.d(str.substring(0, indexOf))) == cmb.qa || d == cmb.qb || d == cmb.De || d == cmb.Ee || d == cmb.Fe || d == cmb.Ge)) {
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
                                    if (d == cmb.qa) {
                                        this.b.R = intValue;
                                    } else if (d == cmb.qb) {
                                        this.b.S = intValue;
                                    } else if (d == cmb.De) {
                                        this.b.M = intValue;
                                    } else if (d == cmb.Ee) {
                                        this.b.N = intValue;
                                    } else if (d == cmb.Fe) {
                                        this.b.O = intValue;
                                    } else if (d == cmb.Ge) {
                                        this.b.P = intValue;
                                    }
                                }
                            }
                            i4 += i6;
                            i2 += i6;
                        }
                        i3++;
                        z = true;
                    }
                    if (z2 || i == i2) {
                        break;
                    }
                    fileInputStream.getChannel().position(i2);
                    i = i2;
                    z = true;
                }
                fileInputStream.close();
            } catch (Throwable th) {
                fc4.g(th, true);
            }
            bmb bmbVar3 = this.b;
            if (bmbVar3.c != null && !bmbVar3.f && !new File(this.b.c).exists()) {
                if (!hashMap.containsKey(this.b)) {
                    bmb bmbVar4 = this.b;
                    hashMap.put(bmbVar4, bmbVar4.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    bmb bmbVar5 = this.b;
                    tL_inputWallPaperSlug.slug = bmbVar5.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(bmbVar5.F).sendRequest(getwallpaper, new RequestDelegate() {
                        @Override
                        public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                            int i8 = ThemesHorizontalListCell$InnerThemeView.c0;
                            final ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = ThemesHorizontalListCell$InnerThemeView.this;
                            gm.c3(new Runnable() {
                                @Override
                                public final void run() {
                                    ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView2 = ThemesHorizontalListCell$InnerThemeView.this;
                                    HashMap hashMap2 = themesHorizontalListCell$InnerThemeView2.b0.h3;
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                                        String r = bc4.r(null, wallPaper.document);
                                        if (!hashMap2.containsKey(r)) {
                                            hashMap2.put(r, themesHorizontalListCell$InnerThemeView2.b);
                                            bc4.G(themesHorizontalListCell$InnerThemeView2.b.F).X(wallPaper.document, wallPaper, 1, 1);
                                            return;
                                        }
                                        return;
                                    }
                                    themesHorizontalListCell$InnerThemeView2.b.f = true;
                                }
                            });
                        }
                    });
                    return false;
                }
                return false;
            }
            this.b.U = true;
            return true;
        }
        return false;
    }

    public final void d(boolean z) {
        int i;
        int i2;
        int i3;
        this.H = this.x;
        this.I = this.y;
        this.J = this.E;
        this.K = this.F;
        int i4 = 0;
        amb i5 = this.b.i(false);
        if (i5 != null) {
            i4 = i5.c;
            i2 = i5.e;
            if (i2 == 0) {
                i2 = i4;
            }
            i = (int) i5.j;
            if (i == 0) {
                i = i4;
            }
        } else {
            i = 0;
            i2 = 0;
        }
        bmb bmbVar = this.b;
        if (bmbVar.T && bmbVar.Z == cmb.n) {
            i3 = -1;
        } else {
            i3 = bmbVar.R;
        }
        this.x = cmb.B(bmbVar, i4, i3);
        bmb bmbVar2 = this.b;
        this.y = cmb.B(bmbVar2, i2, bmbVar2.n());
        bmb bmbVar3 = this.b;
        this.E = cmb.B(bmbVar3, i, bmbVar3.m());
        this.F = this.y;
        this.G = this.b.Z;
        ObjectAnimator objectAnimator = this.M;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z) {
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
        bmb B0;
        boolean z;
        TLRPC.TL_theme tL_theme;
        super.onAttachedToWindow();
        f fVar = this.b0;
        if (fVar.n3 == 1) {
            B0 = cmb.J;
        } else {
            B0 = cmb.B0();
        }
        if (this.b == B0) {
            z = true;
        } else {
            z = false;
        }
        this.a.a(z, false);
        bmb bmbVar = this.b;
        if (bmbVar != null && (tL_theme = bmbVar.G) != null && !bmbVar.V) {
            if (!fVar.h3.containsKey(bc4.r(null, tL_theme.document)) && !fVar.i3.containsKey(this.b)) {
                this.b.V = true;
                this.w = 0.0f;
                c();
                a();
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ThemesHorizontalListCell$InnerThemeView.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String l = this.b.l();
        if (l.toLowerCase().endsWith(".attheme")) {
            l = l.substring(0, l.lastIndexOf(46));
        }
        accessibilityNodeInfo.setText(l);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setChecked(this.a.f);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, jb6.M0(2131754838, null)));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = 22;
        if (this.r) {
            i3 = 22;
        } else {
            i3 = 15;
        }
        int i5 = i3 + 76;
        if (!this.s) {
            i4 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(i5 + i4), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(148.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bmb bmbVar;
        if (this.e != null && (bmbVar = this.b) != null && (bmbVar.G == null || bmbVar.V)) {
            f fVar = this.b0;
            if (fVar.n3 == 0) {
                int action = motionEvent.getAction();
                if (action == 0 || action == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    RectF rectF = this.c;
                    if (x > rectF.centerX() && y < rectF.centerY() - gm.L(10.0f)) {
                        if (action == 0) {
                            this.a0 = true;
                        } else {
                            try {
                                performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                            fVar.C1(this.b);
                        }
                    }
                    if (action == 1) {
                        this.a0 = false;
                    }
                }
                return this.a0;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentState(float f) {
        this.N = f;
        this.L = true;
        invalidate();
    }
}
