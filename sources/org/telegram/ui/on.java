package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ThemeEditorView;
public final class on implements org.telegram.ui.ActionBar.d6, org.telegram.ui.Components.kc0 {
    public BitmapShader E;
    public boolean F;
    public AnimatorSet H;
    public org.telegram.ui.ActionBar.f5 I;
    public org.telegram.ui.ActionBar.f5 J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public Bitmap P;
    public int Q;
    public boolean R;
    public boolean S;
    public final qn V;
    public SparseIntArray e;
    public org.telegram.ui.ActionBar.c4 f39926f;
    public TLRPC.WallPaper h;
    public Drawable f39927n;
    public ValueAnimator f39928r;
    public Bitmap f39929s;
    public Bitmap v;
    public Canvas f39931x;
    public BitmapShader f39932y;
    public final HashMap f39923a = new HashMap();
    public final HashMap f39924b = new HashMap();
    public final Matrix f39925c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint f39930w = new Paint();
    public final Rect T = new Rect();
    public final Rect U = new Rect();
    public boolean G = org.telegram.ui.ActionBar.h6.I.q();

    public on(qn qnVar) {
        int i10;
        int i11;
        this.V = qnVar;
        if (i(false)) {
            i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            this.f39926f = ChatThemeController.getInstance(i10).getDialogTheme(qnVar.T5);
            i11 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
            TLRPC.WallPaper dialogWallpaper = ChatThemeController.getInstance(i11).getDialogWallpaper(qnVar.T5);
            this.h = dialogWallpaper;
            org.telegram.ui.ActionBar.c4 c4Var = this.f39926f;
            if (c4Var != null || dialogWallpaper != null) {
                l(c4Var, dialogWallpaper, false);
                AndroidUtilities.runOnUIThread(new ah.j(25));
            }
        }
        if (ThemeEditorView.f24383n == null) {
            org.telegram.ui.ActionBar.h6.o1(true, true);
            return;
        }
        AndroidUtilities.runOnUIThread(new ah.j(25));
    }

    @Override
    public final void B(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i10, i11);
        }
    }

    @Override
    public final int G(int i10) {
        return b(i10, false);
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.h6.I.q();
    }

    public final int b(int i10, boolean z10) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f39926f == null && this.f39927n == null) {
            return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        }
        if (!z10 && (sparseIntArray = this.e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        if (sparseIntArray2 != null && (indexOfKey = sparseIntArray2.indexOfKey(i10)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
    }

    public final org.telegram.ui.ActionBar.c4 c() {
        return this.f39926f;
    }

    @Override
    public final void d(float f7, float f10, int i10, int i11) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.f39927n != null && (bitmap = this.f39929s) != null && (bitmapShader = this.f39932y) != null) {
            boolean z10 = this.F;
            Matrix matrix = this.f39925c;
            if (z10) {
                org.telegram.ui.ActionBar.h6.r(this.v, this.E, matrix, i10, i11, f7, f10);
                return;
            } else {
                org.telegram.ui.ActionBar.h6.r(bitmap, bitmapShader, matrix, i10, i11, f7, f10);
                return;
            }
        }
        org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
    }

    public final Drawable e() {
        Drawable drawable = this.f39927n;
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.h6.t0();
    }

    public final void f() {
        Drawable f5Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.h6.ml.entrySet()) {
            String str = (String) entry.getKey();
            str.getClass();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -2061232504:
                    if (str.equals("drawableMsgIn")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -2005320132:
                    if (str.equals("drawableMsgInMedia")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1656383241:
                    if (str.equals("drawableMsgInMediaSelected")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1451465639:
                    if (str.equals("drawableMsgOutMedia")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1084641786:
                    if (str.equals("drawableMsgOutSelected")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -8170988:
                    if (str.equals("drawableMsgOutMediaSelected")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 300508483:
                    if (str.equals("drawableMsgInSelected")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 526307915:
                    if (str.equals("drawableMsgOut")) {
                        c10 = 7;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    f5Var = new org.telegram.ui.ActionBar.f5(0, false, false, this);
                    break;
                case 1:
                    f5Var = new org.telegram.ui.ActionBar.f5(1, false, false, this);
                    break;
                case 2:
                    f5Var = new org.telegram.ui.ActionBar.f5(1, false, true, this);
                    break;
                case 3:
                    f5Var = new org.telegram.ui.ActionBar.f5(1, true, false, this);
                    break;
                case 4:
                    f5Var = new org.telegram.ui.ActionBar.f5(0, true, true, this);
                    break;
                case 5:
                    f5Var = new org.telegram.ui.ActionBar.f5(1, true, true, this);
                    break;
                case 6:
                    f5Var = new org.telegram.ui.ActionBar.f5(0, false, true, this);
                    break;
                case 7:
                    f5Var = new org.telegram.ui.ActionBar.f5(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    if (constantState != null) {
                        f5Var = constantState.newDrawable().mutate();
                    } else {
                        f5Var = null;
                    }
                    if (f5Var != null) {
                        int intValue = ((Integer) org.telegram.ui.ActionBar.h6.nl.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.h6.x1(w(intValue), f5Var);
                            break;
                        }
                    }
                    break;
            }
            if (f5Var != null) {
                this.f39923a.put((String) entry.getKey(), f5Var);
            }
        }
    }

    public final void g() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.h6.ol.entrySet()) {
            Paint paint2 = (Paint) entry.getValue();
            if (paint2 instanceof TextPaint) {
                paint = new TextPaint();
                paint.setTextSize(paint2.getTextSize());
                paint.setTypeface(paint2.getTypeface());
            } else {
                paint = new Paint();
            }
            if ((paint2.getFlags() & 1) != 0) {
                paint.setFlags(1);
            }
            int intValue = ((Integer) org.telegram.ui.ActionBar.h6.pl.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(w(intValue));
            }
            this.f39924b.put((String) entry.getKey(), paint);
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.f39923a;
        if (!hashMap.isEmpty()) {
            return (Drawable) hashMap.get(str);
        }
        return null;
    }

    public final void h(android.graphics.drawable.Drawable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.on.h(android.graphics.drawable.Drawable):void");
    }

    public final boolean i(boolean z10) {
        TLRPC.User user;
        qn qnVar = this.V;
        if (qnVar.h == null) {
            if (z10) {
                if (qnVar.e == null && (user = qnVar.f40670f) != null && !user.bot) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final ColorFilter j() {
        return org.telegram.ui.ActionBar.h6.f21317v3;
    }

    public final void k(org.telegram.ui.ActionBar.c4 c4Var, TLRPC.WallPaper wallPaper, boolean z10, Boolean bool, boolean z11) {
        org.telegram.ui.ActionBar.d5 d5Var;
        boolean z12;
        gg.b bVar;
        gg.b bVar2;
        org.telegram.ui.ActionBar.g6 B0;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int b10;
        int b11;
        int b12;
        org.telegram.ui.ActionBar.d5 d5Var2;
        int x02;
        int x03;
        int x04;
        int x05;
        qn qnVar = this.V;
        d5Var = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
        if (d5Var != null && qnVar.f40643ca == null) {
            if (bool != null) {
                z12 = bool.booleanValue();
            } else {
                z12 = this.G;
            }
            if (c4Var != null) {
                bVar = c4Var.f20722c;
            } else {
                bVar = null;
            }
            org.telegram.ui.ActionBar.c4 c4Var2 = this.f39926f;
            if (c4Var2 != null) {
                bVar2 = c4Var2.f20722c;
            } else {
                bVar2 = null;
            }
            TLRPC.WallPaper wallPaper2 = this.h;
            if (!z11) {
                if (i(false)) {
                    if (gg.b.a(bVar2, bVar) && this.G == z12 && ChatThemeController.equals(wallPaper, wallPaper2)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.G = z12;
            if (z12) {
                B0 = org.telegram.ui.ActionBar.h6.J;
            } else {
                B0 = org.telegram.ui.ActionBar.h6.B0();
            }
            org.telegram.ui.ActionBar.c5 c5Var = new org.telegram.ui.ActionBar.c5(B0, B0.Y, B0.q(), !z10);
            org.telegram.ui.ActionBar.c4 c4Var3 = this.f39926f;
            int i10 = -1;
            if (c4Var3 == null && this.h == null) {
                Drawable t02 = org.telegram.ui.ActionBar.h6.t0();
                this.R = t02 instanceof org.telegram.ui.Components.wc0;
                h(t02);
                if (this.R) {
                    x02 = -1;
                } else {
                    x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21081ic, false);
                }
                this.K = x02;
                if (this.R) {
                    x03 = -1;
                } else {
                    x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21100jc, false);
                }
                this.L = x03;
                if (this.R) {
                    x04 = -1;
                } else {
                    x04 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21100jc, false);
                }
                this.M = x04;
                if (this.R) {
                    x05 = -1;
                } else {
                    x05 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21120kc, false);
                }
                this.N = x05;
            } else {
                if (this.R) {
                    Drawable drawable = this.f39927n;
                    if (drawable instanceof org.telegram.ui.Components.wc0) {
                        Bitmap bitmap = ((org.telegram.ui.Components.wc0) drawable).f32088k;
                        this.P = bitmap;
                        if (c4Var3 != null) {
                            TLRPC.ChatTheme chatTheme = c4Var3.d;
                            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                    if (tL_starGiftUnique != null && this.G) {
                                        this.P = Bitmap.createBitmap(bitmap);
                                        new Canvas(this.P).drawColor(-870178270);
                                    }
                                }
                            }
                            tL_starGiftUnique = null;
                            if (tL_starGiftUnique != null) {
                                this.P = Bitmap.createBitmap(bitmap);
                                new Canvas(this.P).drawColor(-870178270);
                            }
                        }
                    }
                }
                Drawable drawable2 = this.f39927n;
                if (drawable2 != null) {
                    h(drawable2);
                }
            }
            this.O = this.Q;
            if (this.R) {
                b10 = -1;
            } else {
                b10 = b(org.telegram.ui.ActionBar.h6.f21081ic, true);
            }
            this.K = b10;
            if (this.R) {
                b11 = -1;
            } else {
                b11 = b(org.telegram.ui.ActionBar.h6.f21100jc, true);
            }
            this.L = b11;
            if (this.R) {
                b12 = -1;
            } else {
                b12 = b(org.telegram.ui.ActionBar.h6.f21100jc, true);
            }
            this.M = b12;
            if (!this.R) {
                i10 = b(org.telegram.ui.ActionBar.h6.f21120kc, true);
            }
            this.N = i10;
            if (c4Var != null || wallPaper != null) {
                int i11 = AndroidUtilities.calcDrawableColor(this.f39927n)[0];
                f();
                g();
            }
            c5Var.f20728f = false;
            if (qnVar.T5 < 0) {
                c5Var.f20729g = false;
            }
            c5Var.h = new ai.x9(this, c4Var, wallPaper, z10, 12);
            if (z10) {
                c5Var.f20732k = new ln(this);
                c5Var.f20730i = new jn(this, 0);
                c5Var.f20731j = new jn(this, 1);
            } else {
                if (qnVar.X0 != null) {
                    qnVar.ic();
                }
                c5Var.h.run();
            }
            c5Var.e = true;
            c5Var.f20734m = this;
            c5Var.f20733l = 250L;
            d5Var2 = ((org.telegram.ui.ActionBar.n2) qnVar).parentLayout;
            ((ActionBarLayout) d5Var2).f(c5Var, null);
        }
    }

    public final void l(org.telegram.ui.ActionBar.c4 c4Var, TLRPC.WallPaper wallPaper, boolean z10) {
        Drawable drawable;
        org.telegram.ui.Components.wc0 wc0Var;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.f6 f6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        org.telegram.ui.ActionBar.g6 g6Var;
        boolean z11;
        Drawable drawable2;
        int i13;
        char c10;
        org.telegram.ui.ActionBar.g6 O0;
        int i14;
        org.telegram.ui.ActionBar.g6 O02;
        org.telegram.ui.ActionBar.c4 c4Var2 = c4Var;
        qn qnVar = this.V;
        if (qnVar.f40643ca != null) {
            return;
        }
        this.f39926f = c4Var2;
        this.h = wallPaper;
        if (qnVar.fragmentView != null) {
            drawable = qnVar.X0.getBackgroundImage();
        } else {
            drawable = null;
        }
        if (drawable instanceof org.telegram.ui.Components.wc0) {
            wc0Var = (org.telegram.ui.Components.wc0) drawable;
        } else {
            wc0Var = null;
        }
        if (wc0Var != null) {
            i10 = wc0Var.f32086i;
        } else {
            i10 = 0;
        }
        if ((c4Var2 == null || c4Var2.f20720a) && wallPaper == null) {
            int indexOfKey2 = org.telegram.ui.ActionBar.h6.ul.indexOfKey(org.telegram.ui.ActionBar.h6.f21137lc);
            if (indexOfKey2 >= 0) {
                org.telegram.ui.ActionBar.h6.ul.valueAt(indexOfKey2);
            } else {
                int i15 = org.telegram.ui.ActionBar.h6.f20922a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (c4Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.f39924b.clear();
            this.f39923a.clear();
            Drawable t02 = org.telegram.ui.ActionBar.h6.t0();
            if (t02 instanceof org.telegram.ui.Components.wc0) {
                ((org.telegram.ui.Components.wc0) t02).u(i10);
            }
            this.f39927n = null;
            if (org.telegram.ui.ActionBar.h6.I.q() == this.G) {
                O02 = org.telegram.ui.ActionBar.h6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.h6.O0(string) != null && !org.telegram.ui.ActionBar.h6.O0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.h6.O0(string2) != null && org.telegram.ui.ActionBar.h6.O0(string2).q()) {
                    str = string2;
                }
                if (this.G) {
                    O02 = org.telegram.ui.ActionBar.h6.O0(str);
                } else {
                    O02 = org.telegram.ui.ActionBar.h6.O0(str2);
                }
            }
            org.telegram.ui.ActionBar.h6.t(O02, false, this.G);
            h(this.f39927n);
            return;
        }
        if (ApplicationLoader.applicationContext != null) {
            org.telegram.ui.ActionBar.h6.J(ApplicationLoader.applicationContext, false);
        }
        if (c4Var2 != null) {
            i11 = ((org.telegram.ui.ActionBar.n2) this.V).currentAccount;
            boolean z12 = this.G;
            ArrayList arrayList2 = c4Var2.f20723f;
            org.telegram.ui.ActionBar.g6 i16 = c4Var2.i(z12 ? 1 : 0);
            if (i16 == null) {
                int i17 = ((org.telegram.ui.ActionBar.b4) c4Var2.f20723f.get(z12 ? 1 : 0)).d;
                i12 = 0;
                org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) ((gg.a) c4Var2.f20723f.get(z12 ? 1 : 0));
                TLRPC.ThemeSettings b10 = b4Var.b(i17);
                TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.b4) c4Var2.f20723f.get(z12 ? 1 : 0)).f20690b;
                org.telegram.ui.ActionBar.g6 g6Var2 = new org.telegram.ui.ActionBar.g6(org.telegram.ui.ActionBar.h6.O0(org.telegram.ui.ActionBar.h6.r0(b10)));
                arrayList = arrayList2;
                f6Var = g6Var2.e(b4Var.a(), b10, tL_theme, i11, true);
                g6Var2.u(f6Var.f20829a);
                i16 = g6Var2;
            } else {
                i12 = 0;
                arrayList = arrayList2;
                SparseArray sparseArray = i16.f20879a0;
                if (sparseArray != null) {
                    f6Var = (org.telegram.ui.ActionBar.f6) sparseArray.get(((org.telegram.ui.ActionBar.b4) arrayList.get(z12 ? 1 : 0)).e);
                } else {
                    f6Var = null;
                }
            }
            String[] strArr = new String[1];
            if (i16.f20880b != null) {
                sparseIntArray = org.telegram.ui.ActionBar.h6.R0(new File(i16.f20880b), null, strArr);
            } else {
                String str3 = i16.d;
                if (str3 != null) {
                    sparseIntArray = org.telegram.ui.ActionBar.h6.R0(null, str3, strArr);
                } else {
                    sparseIntArray = new SparseIntArray();
                }
            }
            ((org.telegram.ui.ActionBar.b4) arrayList.get(z12 ? 1 : 0)).f20693g = strArr[i12];
            if (f6Var != null) {
                SparseIntArray clone = sparseIntArray.clone();
                f6Var.c(sparseIntArray, clone);
                gg.b bVar = c4Var2.f20722c;
                if (bVar != null && !TextUtils.isEmpty(bVar.f11049b) && (g6Var = f6Var.f20830b) != null && g6Var.f20880b == null && !g6Var.q()) {
                    org.telegram.ui.ActionBar.f6.g(clone);
                }
                sparseIntArray = clone;
            }
            SparseIntArray sparseIntArray2 = org.telegram.ui.ActionBar.h6.rl;
            for (int i18 = i12; i18 < sparseIntArray2.size(); i18++) {
                int keyAt = sparseIntArray2.keyAt(i18);
                int valueAt = sparseIntArray2.valueAt(i18);
                if (sparseIntArray.indexOfKey(keyAt) < 0 && (indexOfKey = sparseIntArray.indexOfKey(valueAt)) >= 0) {
                    sparseIntArray.put(keyAt, sparseIntArray.valueAt(indexOfKey));
                }
            }
            int[] iArr = org.telegram.ui.ActionBar.h6.ql;
            for (int i19 = i12; i19 < iArr.length; i19++) {
                if (sparseIntArray.indexOfKey(i19) < 0) {
                    sparseIntArray.put(i19, iArr[i19]);
                }
            }
            this.d = sparseIntArray;
        } else {
            this.d = new SparseIntArray();
            i12 = 0;
        }
        if (!TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(this.h))) {
            Drawable drawable3 = this.f39927n;
            i14 = ((org.telegram.ui.ActionBar.n2) this.V).currentAccount;
            this.f39927n = ei.r6.f(drawable3, i14, this.h, this.G);
        } else if (wallPaper != null) {
            this.f39927n = tn.d(this.f39927n, wallPaper, this.G);
        } else {
            if (c4Var2.f20720a) {
                org.telegram.ui.ActionBar.g6 d = org.telegram.ui.ActionBar.c4.d(this.G);
                i13 = ((org.telegram.ui.ActionBar.n2) this.V).currentAccount;
                org.telegram.ui.ActionBar.h6.H(d, c4Var2.g(i13, this.G ? 1 : 0), ((org.telegram.ui.ActionBar.b4) c4Var2.f20723f.get(this.G ? 1 : 0)).f20693g, i10, i12);
                drawable2 = new ColorDrawable(-16777216);
            } else {
                int w9 = w(org.telegram.ui.ActionBar.h6.Nd);
                int w10 = w(org.telegram.ui.ActionBar.h6.Od);
                int w11 = w(org.telegram.ui.ActionBar.h6.Pd);
                int w12 = w(org.telegram.ui.ActionBar.h6.Qd);
                org.telegram.ui.Components.wc0 wc0Var2 = new org.telegram.ui.Components.wc0();
                wc0Var2.s(wc0Var2.f32098u, c4Var2.j(this.G ? 1 : 0).settings.intensity);
                TLRPC.Document e = c4Var2.e();
                if (wc0Var2.f32101y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    wc0Var2.f32101y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = wc0Var2.f32081c;
                    if (weakReference != null) {
                        wc0Var2.f32101y.setParentView((View) weakReference.get());
                    }
                    if (wc0Var2.T) {
                        wc0Var2.f32101y.onAttachedToWindow();
                    }
                }
                wc0Var2.f32101y.setImage(ImageLocation.getForDocument(e), "80_80", null, null, null, 0);
                wc0Var2.f32101y.setAutoRepeatCount(1);
                wc0Var2.f32101y.setAutoRepeat(1);
                wc0Var2.o(w9, w10, w11, w12, 0, true);
                wc0Var2.u(i10);
                int f7 = wc0Var2.f();
                boolean z13 = this.G;
                m4.w0 w0Var = new m4.w0(18, this, wc0Var2);
                org.telegram.ui.ActionBar.b4 b4Var2 = (org.telegram.ui.ActionBar.b4) c4Var2.f20723f.get(z13 ? 1 : 0);
                if (b4Var2 != null && b4Var2.f20691c != null) {
                    long h = c4Var2.h(z13 ? 1 : 0);
                    TL_stars.StarGift starGift = b4Var2.f20691c.gift;
                    TLRPC.Document document = starGift.sticker;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList3 = starGift.attributes;
                    if (arrayList3 != null && document == null) {
                        int size = arrayList3.size();
                        z11 = z13 ? 1 : 0;
                        int i20 = 0;
                        while (true) {
                            if (i20 >= size) {
                                break;
                            }
                            TL_stars.StarGiftAttribute starGiftAttribute = arrayList3.get(i20);
                            int i21 = i20 + 1;
                            int i22 = size;
                            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                                document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                                break;
                            } else {
                                size = i22;
                                i20 = i21;
                            }
                        }
                    } else {
                        z11 = z13 ? 1 : 0;
                    }
                    TLRPC.Document document2 = document;
                    ImageLocation forDocument = ImageLocation.getForDocument(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver();
                    imageReceiver2.setAllowLoadingOnAttachedOnly(false);
                    imageReceiver2.setImage(forDocument, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.setDelegate(new ci.d1(w0Var, h, 3));
                    ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver2);
                } else {
                    z11 = z13 ? 1 : 0;
                }
                c4Var2 = c4Var;
                c4Var2.n(this.G ? 1 : 0, new org.telegram.messenger.m2(this, c4Var2, z11, wc0Var2, f7));
                drawable2 = wc0Var2;
            }
            this.f39927n = drawable2;
        }
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            this.H = new AnimatorSet();
            if (wc0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new kn(wc0Var, 0));
                ofFloat.addListener(new mn(wc0Var));
                ofFloat.setDuration(200L);
                this.H.playTogether(ofFloat);
            }
            Drawable drawable4 = this.f39927n;
            if (drawable4 instanceof org.telegram.ui.Components.wc0) {
                org.telegram.ui.Components.wc0 wc0Var3 = (org.telegram.ui.Components.wc0) drawable4;
                wc0Var3.r(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new kn(wc0Var3, 1));
                ofFloat2.addListener(new nn(wc0Var3));
                ofFloat2.setDuration(250L);
                this.H.playTogether(ofFloat2);
            }
            this.H.start();
        }
        if (c4Var2 == null && this.V.T5 >= 0) {
            if (org.telegram.ui.ActionBar.h6.I.q() == this.G) {
                O0 = org.telegram.ui.ActionBar.h6.I;
            } else {
                SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.h6.O0(string3) != null && !org.telegram.ui.ActionBar.h6.O0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.h6.O0(string4) != null && org.telegram.ui.ActionBar.h6.O0(string4).q()) {
                    str = string4;
                }
                if (this.G) {
                    O0 = org.telegram.ui.ActionBar.h6.O0(str);
                } else {
                    O0 = org.telegram.ui.ActionBar.h6.O0(str2);
                }
            }
            c10 = 0;
            org.telegram.ui.ActionBar.h6.t(O0, false, this.G);
        } else {
            c10 = 0;
        }
        int i23 = AndroidUtilities.calcDrawableColor(this.f39927n)[c10];
        f();
        g();
        h(this.f39927n);
        m(1.0f);
    }

    public final void m(float f7) {
        int b10;
        int b11;
        int b12;
        Bitmap bitmap;
        Bitmap bitmap2;
        if (!this.f39924b.isEmpty()) {
            Paint n10 = n("paintChatActionBackground");
            Paint n11 = n("paintChatActionBackgroundSelected");
            Paint n12 = n("paintChatMessageBackgroundSelected");
            int i10 = this.Q;
            int i11 = -1;
            if (this.R) {
                b10 = -1;
            } else {
                b10 = b(org.telegram.ui.ActionBar.h6.f21081ic, true);
            }
            if (this.R) {
                b11 = -1;
            } else {
                b11 = b(org.telegram.ui.ActionBar.h6.f21100jc, true);
            }
            if (this.R) {
                b12 = -1;
            } else {
                b12 = b(org.telegram.ui.ActionBar.h6.f21100jc, true);
            }
            if (!this.R) {
                i11 = b(org.telegram.ui.ActionBar.h6.f21120kc, true);
            }
            int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            if (i12 != 0) {
                i10 = i0.a.f(f7, this.O, i10);
                b10 = i0.a.f(f7, this.K, b10);
                b11 = i0.a.f(f7, this.L, b11);
                b12 = i0.a.f(f7, this.M, b12);
                i11 = i0.a.f(f7, this.N, i11);
            }
            if (n10 != null && !this.R) {
                n10.setColor(i10);
                n11.setColor(i10);
            }
            Paint n13 = n("paintChatActionText");
            if (n13 != null) {
                ((TextPaint) n13).linkColor = b11;
                n("paintChatActionText").setColor(b10);
                n("paintChatBotButton").setColor(b12);
            }
            org.telegram.ui.ActionBar.h6.x1(b10, getDrawable("drawableMsgStickerCheck"));
            org.telegram.ui.ActionBar.h6.x1(b10, getDrawable("drawableMsgStickerClock"));
            org.telegram.ui.ActionBar.h6.x1(b10, getDrawable("drawableMsgStickerHalfCheck"));
            org.telegram.ui.ActionBar.h6.x1(b10, getDrawable("drawableMsgStickerPinned"));
            org.telegram.ui.ActionBar.h6.x1(b10, getDrawable("drawableMsgStickerReplies"));
            org.telegram.ui.ActionBar.h6.x1(b10, getDrawable("drawableMsgStickerViews"));
            org.telegram.ui.ActionBar.h6.x1(i11, getDrawable("drawableBotInline"));
            org.telegram.ui.ActionBar.h6.x1(i11, getDrawable("drawableBotLink"));
            org.telegram.ui.ActionBar.h6.x1(i11, getDrawable("drawableBotLock"));
            org.telegram.ui.ActionBar.h6.x1(i11, getDrawable("drawable_botInvite"));
            org.telegram.ui.ActionBar.h6.x1(i11, getDrawable("drawableCommentSticker"));
            org.telegram.ui.ActionBar.h6.x1(i11, getDrawable("drawableGoIcon"));
            org.telegram.ui.ActionBar.h6.x1(i11, getDrawable("drawableReplyIcon"));
            org.telegram.ui.ActionBar.h6.x1(i11, getDrawable("drawableShareIcon"));
            if (this.f39931x != null && (bitmap = this.v) != null) {
                Rect rect = this.U;
                Rect rect2 = this.T;
                if (i12 != 0 && (bitmap2 = this.P) != null) {
                    this.F = false;
                    rect2.set(0, 0, bitmap2.getWidth(), this.P.getHeight());
                    rect.set(0, 0, this.f39929s.getWidth(), this.f39929s.getHeight());
                    this.f39931x.drawBitmap(this.P, rect2, rect, (Paint) null);
                    Paint paint = this.f39930w;
                    paint.setAlpha((int) (f7 * 255.0f));
                    rect2.set(0, 0, this.v.getWidth(), this.v.getHeight());
                    rect.set(0, 0, this.f39929s.getWidth(), this.f39929s.getHeight());
                    this.f39931x.drawBitmap(this.v, rect2, rect, paint);
                    if (n10 != null) {
                        n10.setShader(this.f39932y);
                        n11.setShader(this.f39932y);
                    }
                    if (n12 != null) {
                        n12.setShader(this.f39932y);
                        return;
                    }
                    return;
                }
                this.F = true;
                rect2.set(0, 0, bitmap.getWidth(), this.v.getHeight());
                rect.set(0, 0, this.f39929s.getWidth(), this.f39929s.getHeight());
                this.f39931x.drawBitmap(this.v, rect2, rect, (Paint) null);
                if (n10 != null) {
                    n10.setShader(this.E);
                    n11.setShader(this.E);
                }
                if (n12 != null) {
                    n12.setShader(this.E);
                }
            }
        }
    }

    @Override
    public final Paint n(String str) {
        if (this.f39926f == null && this.f39927n == null) {
            return null;
        }
        return (Paint) this.f39924b.get(str);
    }

    @Override
    public final int r(int i10) {
        return w(i10);
    }

    @Override
    public final boolean s() {
        if (this.f39927n != null) {
            if (this.f39932y != null) {
                return true;
            }
            return false;
        }
        return org.telegram.ui.ActionBar.h6.b1();
    }

    @Override
    public final int w(int i10) {
        int indexOfKey;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        if (this.f39926f == null) {
            return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        }
        int indexOfKey3 = this.d.indexOfKey(i10);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i11 = org.telegram.ui.ActionBar.h6.rl.get(i10);
        if (i11 >= 0 && (indexOfKey = this.d.indexOfKey(i11)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
    }
}
