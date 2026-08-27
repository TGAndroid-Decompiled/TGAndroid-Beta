package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
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
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ThemeEditorView;

public final class pn implements org.telegram.ui.ActionBar.c6, org.telegram.ui.Components.cb0 {
    public BitmapShader A;
    public boolean B;
    public AnimatorSet D;
    public org.telegram.ui.ActionBar.d5 E;
    public org.telegram.ui.ActionBar.d5 F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public Bitmap L;
    public int M;
    public boolean N;
    public boolean O;
    public final rn R;

    public SparseIntArray f41394e;

    public org.telegram.ui.ActionBar.b4 f41395f;
    public TLRPC.WallPaper h;

    public Drawable f41396n;

    public ValueAnimator f41397r;

    public Bitmap f41398s;
    public Bitmap v;

    public Canvas f41400x;

    public BitmapShader f41401y;

    public final HashMap f41391a = new HashMap();

    public final HashMap f41392b = new HashMap();

    public final Matrix f41393c = new Matrix();
    public SparseIntArray d = new SparseIntArray();

    public final Paint f41399w = new Paint();
    public final Rect P = new Rect();
    public final Rect Q = new Rect();
    public boolean C = org.telegram.ui.ActionBar.g6.I.q();

    public pn(rn rnVar) {
        this.R = rnVar;
        if (h(false)) {
            this.f41395f = ChatThemeController.getInstance(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount).getDialogTheme(rnVar.P5);
            TLRPC.WallPaper dialogWallpaper = ChatThemeController.getInstance(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount).getDialogWallpaper(rnVar.P5);
            this.h = dialogWallpaper;
            org.telegram.ui.ActionBar.b4 b4Var = this.f41395f;
            if (b4Var != null || dialogWallpaper != null) {
                j(b4Var, dialogWallpaper, false);
            } else if (ThemeEditorView.f26549n == null) {
                org.telegram.ui.ActionBar.g6.n1(true, true);
                return;
            }
        } else if (ThemeEditorView.f26549n == null) {
            org.telegram.ui.ActionBar.g6.n1(true, true);
            return;
        }
        AndroidUtilities.runOnUIThread(new ag.l3(24));
    }

    @Override
    public final ColorFilter F() {
        return org.telegram.ui.ActionBar.g6.f23371v3;
    }

    @Override
    public final Paint N(String str) {
        if (this.f41395f == null && this.f41396n == null) {
            return null;
        }
        return (Paint) this.f41392b.get(str);
    }

    @Override
    public final int N0(int i10) {
        int iIndexOfKey;
        int iIndexOfKey2;
        SparseIntArray sparseIntArray = this.f41394e;
        if (sparseIntArray != null && (iIndexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.f41394e.valueAt(iIndexOfKey2);
        }
        if (this.f41395f == null) {
            return org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        }
        int iIndexOfKey3 = this.d.indexOfKey(i10);
        if (iIndexOfKey3 >= 0) {
            return this.d.valueAt(iIndexOfKey3);
        }
        int i11 = org.telegram.ui.ActionBar.g6.ol.get(i10);
        return (i11 < 0 || (iIndexOfKey = this.d.indexOfKey(i11)) < 0) ? org.telegram.ui.ActionBar.g6.w0(null, i10, false) : this.d.valueAt(iIndexOfKey);
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.g6.I.q();
    }

    public final int b(int i10, boolean z10) {
        int iIndexOfKey;
        SparseIntArray sparseIntArray;
        int iIndexOfKey2;
        if (this.f41395f == null && this.f41396n == null) {
            return org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        }
        if (!z10 && (sparseIntArray = this.f41394e) != null && (iIndexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.f41394e.valueAt(iIndexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        return (sparseIntArray2 == null || (iIndexOfKey = sparseIntArray2.indexOfKey(i10)) < 0) ? org.telegram.ui.ActionBar.g6.w0(null, i10, false) : this.d.valueAt(iIndexOfKey);
    }

    public final org.telegram.ui.ActionBar.b4 c() {
        return this.f41395f;
    }

    @Override
    public final void c1(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f41394e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i10, i11);
        }
    }

    public final Drawable d() {
        Drawable drawable = this.f41396n;
        return drawable != null ? drawable : org.telegram.ui.ActionBar.g6.s0();
    }

    public final void e() {
        Drawable d5Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.g6.jl.entrySet()) {
            String str = (String) entry.getKey();
            str.getClass();
            switch (str) {
                case "drawableMsgIn":
                    d5Var = new org.telegram.ui.ActionBar.d5(0, false, false, this);
                    break;
                case "drawableMsgInMedia":
                    d5Var = new org.telegram.ui.ActionBar.d5(1, false, false, this);
                    break;
                case "drawableMsgInMediaSelected":
                    d5Var = new org.telegram.ui.ActionBar.d5(1, false, true, this);
                    break;
                case "drawableMsgOutMedia":
                    d5Var = new org.telegram.ui.ActionBar.d5(1, true, false, this);
                    break;
                case "drawableMsgOutSelected":
                    d5Var = new org.telegram.ui.ActionBar.d5(0, true, true, this);
                    break;
                case "drawableMsgOutMediaSelected":
                    d5Var = new org.telegram.ui.ActionBar.d5(1, true, true, this);
                    break;
                case "drawableMsgInSelected":
                    d5Var = new org.telegram.ui.ActionBar.d5(0, false, true, this);
                    break;
                case "drawableMsgOut":
                    d5Var = new org.telegram.ui.ActionBar.d5(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    d5Var = constantState != null ? constantState.newDrawable().mutate() : null;
                    if (d5Var != null) {
                        int iIntValue = ((Integer) org.telegram.ui.ActionBar.g6.kl.get((String) entry.getKey())).intValue();
                        if (iIntValue >= 0) {
                            org.telegram.ui.ActionBar.g6.w1(N0(iIntValue), d5Var);
                        }
                        break;
                    }
                    break;
            }
            if (d5Var != null) {
                this.f41391a.put((String) entry.getKey(), d5Var);
            }
        }
    }

    public final void f() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.g6.ll.entrySet()) {
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
            int iIntValue = ((Integer) org.telegram.ui.ActionBar.g6.ml.get((String) entry.getKey())).intValue();
            if (iIntValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(N0(iIntValue));
            }
            this.f41392b.put((String) entry.getKey(), paint);
        }
    }

    public final void g(Drawable drawable) {
        float f10;
        boolean z10;
        float f11;
        int width;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        Drawable drawableC = drawable;
        if (this.R.Y9 != null) {
            return;
        }
        int i10 = AndroidUtilities.calcDrawableColor(drawableC)[0];
        int iB = b(org.telegram.ui.ActionBar.g6.f23203lc, false);
        int i11 = org.telegram.ui.ActionBar.g6.Hc;
        int iB2 = b(i11, false);
        if (iB != 0 && this.h == null) {
            i10 = iB;
        }
        this.M = i10;
        if (drawableC instanceof un) {
            un unVar = (un) drawableC;
            f10 = unVar.f43258f == null ? unVar.d : 0.0f;
            drawableC = unVar.c(false);
        } else {
            f10 = 0.0f;
        }
        boolean z11 = drawableC instanceof org.telegram.ui.Components.nb0;
        boolean z12 = (z11 || (drawableC instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0;
        this.N = z12;
        org.telegram.ui.ActionBar.b4 b4Var = this.f41395f;
        if (b4Var != null) {
            TLRPC.ChatTheme chatTheme = b4Var.d;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                } else {
                    tL_starGiftUnique = null;
                }
            } else {
                tL_starGiftUnique = null;
            }
            if (tL_starGiftUnique == null || !this.C) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        this.O = z12;
        if (z12) {
            boolean z13 = drawableC instanceof BitmapDrawable;
            f11 = 0.0f;
            Rect rect = this.Q;
            Rect rect2 = this.P;
            if (z13) {
                Bitmap bitmap = ((BitmapDrawable) drawableC).getBitmap();
                int height = 40;
                if (bitmap.getWidth() > bitmap.getHeight()) {
                    width = (int) ((40 / bitmap.getWidth()) * bitmap.getHeight());
                } else {
                    height = (int) ((40 / bitmap.getHeight()) * bitmap.getWidth());
                    width = 40;
                }
                this.f41398s = Bitmap.createBitmap(height, width, Bitmap.Config.ARGB_8888);
                this.f41400x = new Canvas(this.f41398s);
                rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                rect.set(0, 0, this.f41398s.getWidth(), this.f41398s.getHeight());
                this.f41400x.drawBitmap(bitmap, rect2, rect, (Paint) null);
                Utilities.blurBitmap(this.f41398s, 3);
                this.f41400x.drawColor(i0.b.k(-16777216, (int) (f10 * 255.0f)));
                Bitmap bitmap2 = this.f41398s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f41401y = new BitmapShader(bitmap2, tileMode, tileMode);
                this.v = Bitmap.createBitmap(this.f41398s);
                this.A = new BitmapShader(this.v, tileMode, tileMode);
                if (Build.VERSION.SDK_INT >= 33) {
                    this.f41401y.setFilterMode(2);
                    this.A.setFilterMode(2);
                }
                this.B = true;
            } else {
                this.f41398s = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
                Bitmap bitmap3 = ((org.telegram.ui.Components.nb0) drawableC).f30929k;
                this.v = bitmap3;
                if (z10) {
                    this.v = Bitmap.createBitmap(bitmap3);
                    new Canvas(this.v).drawColor(-870178270);
                }
                this.f41400x = new Canvas(this.f41398s);
                rect2.set(0, 0, this.v.getWidth(), this.v.getHeight());
                rect.set(0, 0, this.f41398s.getWidth(), this.f41398s.getHeight());
                this.f41400x.drawBitmap(this.v, rect2, rect, (Paint) null);
                this.f41400x.drawColor(i0.b.k(-16777216, (int) (f10 * 255.0f)));
                if (z10) {
                    this.f41400x.drawColor(-870178270);
                }
                Bitmap bitmap4 = this.f41398s;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                this.f41401y = new BitmapShader(bitmap4, tileMode2, tileMode2);
                this.A = new BitmapShader(this.v, tileMode2, tileMode2);
                if (Build.VERSION.SDK_INT >= 33) {
                    this.f41401y.setFilterMode(2);
                    this.A.setFilterMode(2);
                }
                this.B = true;
            }
        } else {
            f11 = 0.0f;
            this.f41398s = null;
            this.f41401y = null;
            this.v = null;
            this.f41400x = null;
            this.B = false;
        }
        Paint paintN = N("paintChatActionBackground");
        Paint paintN2 = N("paintChatActionBackgroundSelected");
        Paint paintN3 = N("paintChatMessageBackgroundSelected");
        HashMap map = this.f41392b;
        if (paintN != null) {
            Paint paint = (Paint) map.get("paintChatActionBackgroundDarken");
            if (paint == null) {
                paint = new Paint(1);
                map.put("paintChatActionBackgroundDarken", paint);
                paint.setColor(0);
            }
            if (this.N) {
                ColorMatrix colorMatrix = new ColorMatrix();
                if (z11) {
                    if (((org.telegram.ui.Components.nb0) drawableC).f30935q >= f11) {
                        colorMatrix.setSaturation(1.6f);
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, this.C ? 0.97f : 0.92f);
                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, this.C ? 0.12f : -0.06f);
                    } else {
                        colorMatrix.setSaturation(1.1f);
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, this.C ? 0.4f : 0.8f);
                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, this.C ? 0.08f : -0.06f);
                    }
                } else {
                    colorMatrix.setSaturation(1.6f);
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, this.C ? 0.9f : 0.84f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, this.C ? 0.04f : 0.06f);
                }
                paintN.setAlpha(255);
                paintN.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                paintN.setShader(this.A);
                paintN.setFilterBitmap(true);
                paintN2.setAlpha(255);
                ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, 0.26f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix2, 0.92f);
                paintN2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                paintN2.setShader(this.A);
                paintN2.setFilterBitmap(true);
                paint.setAlpha(0);
            } else {
                paintN.setColorFilter(null);
                paintN.setShader(null);
                paintN2.setColorFilter(null);
                paintN2.setShader(null);
                paint.setAlpha(21);
            }
        }
        if (paintN3 == null) {
            paintN3 = new Paint(1);
            map.put("paintChatMessageBackgroundSelected", paintN3);
        }
        if (!this.O) {
            if (iB2 == 0) {
                iB2 = N0(i11);
            }
            paintN3.setColor(iB2);
            paintN3.setColorFilter(null);
            paintN3.setShader(null);
            return;
        }
        ColorMatrix colorMatrix3 = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 2.5f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix3, 0.75f);
        paintN3.setAlpha(64);
        paintN3.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
        paintN3.setShader(this.A);
        paintN3.setFilterBitmap(true);
    }

    @Override
    public final Drawable getDrawable(String str) {
        HashMap map = this.f41391a;
        if (map.isEmpty()) {
            return null;
        }
        return (Drawable) map.get(str);
    }

    public final boolean h(boolean z10) {
        TLRPC.User user;
        rn rnVar = this.R;
        if (rnVar.h != null) {
            return false;
        }
        if (z10) {
            return (rnVar.f42026e != null || (user = rnVar.f42039f) == null || user.bot) ? false : true;
        }
        return true;
    }

    public final void i(org.telegram.ui.ActionBar.b4 b4Var, TLRPC.WallPaper wallPaper, boolean z10, Boolean bool, boolean z11) {
        Drawable drawable;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        rn rnVar = this.R;
        if (((org.telegram.ui.ActionBar.n2) rnVar).parentLayout == null || rnVar.Y9 != null) {
            return;
        }
        boolean zBooleanValue = bool != null ? bool.booleanValue() : this.C;
        of.b bVar = b4Var != null ? b4Var.f22782c : null;
        org.telegram.ui.ActionBar.b4 b4Var2 = this.f41395f;
        of.b bVar2 = b4Var2 != null ? b4Var2.f22782c : null;
        TLRPC.WallPaper wallPaper2 = this.h;
        if (!z11) {
            if (!h(false)) {
                return;
            }
            if (of.b.a(bVar2, bVar) && this.C == zBooleanValue && ChatThemeController.equals(wallPaper, wallPaper2)) {
                return;
            }
        }
        this.C = zBooleanValue;
        org.telegram.ui.ActionBar.f6 f6VarA0 = zBooleanValue ? org.telegram.ui.ActionBar.g6.J : org.telegram.ui.ActionBar.g6.A0();
        org.telegram.ui.ActionBar.a5 a5Var = new org.telegram.ui.ActionBar.a5(f6VarA0, f6VarA0.U, f6VarA0.q(), !z10);
        org.telegram.ui.ActionBar.b4 b4Var3 = this.f41395f;
        if (b4Var3 == null && this.h == null) {
            Drawable drawableS0 = org.telegram.ui.ActionBar.g6.s0();
            this.N = drawableS0 instanceof org.telegram.ui.Components.nb0;
            g(drawableS0);
            this.G = this.N ? -1 : org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23150ic, false);
            this.H = this.N ? -1 : org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23168jc, false);
            this.I = this.N ? -1 : org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23168jc, false);
            this.J = this.N ? -1 : org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.kc, false);
        } else if (this.N) {
            Drawable drawable2 = this.f41396n;
            if (drawable2 instanceof org.telegram.ui.Components.nb0) {
                Bitmap bitmap = ((org.telegram.ui.Components.nb0) drawable2).f30929k;
                this.L = bitmap;
                if (b4Var3 != null) {
                    TLRPC.ChatTheme chatTheme = b4Var3.d;
                    if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                        TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        } else {
                            tL_starGiftUnique = null;
                        }
                    } else {
                        tL_starGiftUnique = null;
                    }
                    if (tL_starGiftUnique != null && this.C) {
                        this.L = Bitmap.createBitmap(bitmap);
                        new Canvas(this.L).drawColor(-870178270);
                    }
                }
            } else {
                drawable = this.f41396n;
                if (drawable != null) {
                    g(drawable);
                }
            }
        } else {
            drawable = this.f41396n;
            if (drawable != null) {
                g(drawable);
            }
        }
        this.K = this.M;
        this.G = this.N ? -1 : b(org.telegram.ui.ActionBar.g6.f23150ic, true);
        this.H = this.N ? -1 : b(org.telegram.ui.ActionBar.g6.f23168jc, true);
        this.I = this.N ? -1 : b(org.telegram.ui.ActionBar.g6.f23168jc, true);
        this.J = this.N ? -1 : b(org.telegram.ui.ActionBar.g6.kc, true);
        if (b4Var != null || wallPaper != null) {
            int i10 = AndroidUtilities.calcDrawableColor(this.f41396n)[0];
            e();
            f();
        }
        a5Var.f22727f = false;
        if (rnVar.P5 < 0) {
            a5Var.f22728g = false;
        }
        a5Var.h = new cg.c(this, b4Var, wallPaper, z10, 9);
        if (z10) {
            a5Var.f22731k = new mn(this);
            a5Var.f22729i = new kn(this, 0);
            a5Var.f22730j = new kn(this, 1);
        } else {
            if (rnVar.T0 != null) {
                rnVar.ec();
            }
            a5Var.h.run();
        }
        a5Var.f22726e = true;
        a5Var.f22733m = this;
        a5Var.f22732l = 250L;
        ((ActionBarLayout) ((org.telegram.ui.ActionBar.n2) rnVar).parentLayout).f(a5Var, null);
    }

    public final void j(org.telegram.ui.ActionBar.b4 b4Var, TLRPC.WallPaper wallPaper, boolean z10) {
        boolean z11;
        Drawable colorDrawable;
        char c10;
        org.telegram.ui.ActionBar.f6 f6VarN0;
        org.telegram.ui.ActionBar.f6 f6VarN1;
        org.telegram.ui.ActionBar.b4 b4Var2 = b4Var;
        rn rnVar = this.R;
        if (rnVar.Y9 != null) {
            return;
        }
        this.f41395f = b4Var2;
        this.h = wallPaper;
        Drawable backgroundImage = rnVar.fragmentView != null ? rnVar.T0.getBackgroundImage() : null;
        org.telegram.ui.Components.nb0 nb0Var = backgroundImage instanceof org.telegram.ui.Components.nb0 ? (org.telegram.ui.Components.nb0) backgroundImage : null;
        int i10 = nb0Var != null ? nb0Var.f30927i : 0;
        if ((b4Var2 == null || b4Var2.f22780a) && wallPaper == null) {
            int iIndexOfKey = org.telegram.ui.ActionBar.g6.rl.indexOfKey(org.telegram.ui.ActionBar.g6.f23203lc);
            if (iIndexOfKey >= 0) {
                org.telegram.ui.ActionBar.g6.rl.valueAt(iIndexOfKey);
            } else {
                int i11 = org.telegram.ui.ActionBar.g6.f22993a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (b4Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.f41392b.clear();
            this.f41391a.clear();
            Drawable drawableS0 = org.telegram.ui.ActionBar.g6.s0();
            if (drawableS0 instanceof org.telegram.ui.Components.nb0) {
                ((org.telegram.ui.Components.nb0) drawableS0).v(i10);
            }
            this.f41396n = null;
            if (org.telegram.ui.ActionBar.g6.I.q() == this.C) {
                f6VarN1 = org.telegram.ui.ActionBar.g6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.g6.N0(string) != null && !org.telegram.ui.ActionBar.g6.N0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.g6.N0(string2) != null && org.telegram.ui.ActionBar.g6.N0(string2).q()) {
                    str = string2;
                }
                f6VarN1 = this.C ? org.telegram.ui.ActionBar.g6.N0(str) : org.telegram.ui.ActionBar.g6.N0(str2);
            }
            org.telegram.ui.ActionBar.g6.t(f6VarN1, false, this.C);
            g(this.f41396n);
            return;
        }
        if (ApplicationLoader.applicationContext != null) {
            org.telegram.ui.ActionBar.g6.J(ApplicationLoader.applicationContext, false);
        }
        if (b4Var2 == null) {
            this.d = new SparseIntArray();
        } else {
            this.d = b4Var2.b(((org.telegram.ui.ActionBar.n2) this.R).currentAccount, this.C ? 1 : 0);
        }
        if (!TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(this.h))) {
            this.f41396n = lh.q6.f(this.f41396n, ((org.telegram.ui.ActionBar.n2) this.R).currentAccount, this.h, this.C);
        } else if (wallPaper != null) {
            this.f41396n = un.d(this.f41396n, wallPaper, this.C);
        } else {
            if (b4Var2.f22780a) {
                org.telegram.ui.ActionBar.g6.H(org.telegram.ui.ActionBar.b4.e(this.C), b4Var2.h(((org.telegram.ui.ActionBar.n2) this.R).currentAccount, this.C ? 1 : 0), ((org.telegram.ui.ActionBar.a4) b4Var2.f22784f.get(this.C ? 1 : 0)).f22715g, i10, false);
                colorDrawable = new ColorDrawable(-16777216);
            } else {
                int iN0 = N0(org.telegram.ui.ActionBar.g6.Nd);
                int iN1 = N0(org.telegram.ui.ActionBar.g6.Od);
                int iN2 = N0(org.telegram.ui.ActionBar.g6.Pd);
                int iN3 = N0(org.telegram.ui.ActionBar.g6.Qd);
                org.telegram.ui.Components.nb0 nb0Var2 = new org.telegram.ui.Components.nb0();
                nb0Var2.t(nb0Var2.f30939u, b4Var2.k(this.C ? 1 : 0).settings.intensity);
                TLRPC.Document documentF = b4Var2.f();
                if (nb0Var2.f30942y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    nb0Var2.f30942y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = nb0Var2.f30921c;
                    if (weakReference != null) {
                        nb0Var2.f30942y.setParentView((View) weakReference.get());
                    }
                    if (nb0Var2.T) {
                        nb0Var2.f30942y.onAttachedToWindow();
                    }
                }
                nb0Var2.f30942y.setImage(ImageLocation.getForDocument(documentF), "80_80", null, null, null, 0);
                nb0Var2.f30942y.setAutoRepeatCount(1);
                nb0Var2.f30942y.setAutoRepeat(1);
                nb0Var2.o(iN0, iN1, iN2, iN3, 0, true);
                nb0Var2.v(i10);
                int iF = nb0Var2.f();
                boolean z12 = this.C;
                jh.z1 z1Var = new jh.z1(21, this, nb0Var2);
                org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var2.f22784f.get(z12 ? 1 : 0);
                if (a4Var == null || a4Var.f22712c == null) {
                    z11 = z12 ? 1 : 0;
                } else {
                    long jI = b4Var2.i(z12 ? 1 : 0);
                    TL_stars.StarGift starGift = a4Var.f22712c.gift;
                    TLRPC.Document document = starGift.sticker;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList = starGift.attributes;
                    if (arrayList != null && document == null) {
                        int size = arrayList.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size) {
                                z11 = z12;
                                break;
                            }
                            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i12);
                            int i13 = i12 + 1;
                            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                            z11 = z12 ? 1 : 0;
                            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                                document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                                break;
                            } else {
                                z12 = z11 ? 1 : 0;
                                i12 = i13;
                            }
                        }
                    } else {
                        z11 = z12;
                        break;
                    }
                    TLRPC.Document document2 = document;
                    ImageLocation forDocument = ImageLocation.getForDocument(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver();
                    imageReceiver2.setAllowLoadingOnAttachedOnly(false);
                    imageReceiver2.setImage(forDocument, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.setDelegate(new d3.e(z1Var, jI, 3));
                    ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver2);
                }
                b4Var2 = b4Var;
                b4Var2.o(this.C ? 1 : 0, new org.telegram.messenger.k2(this, b4Var2, z11, nb0Var2, iF));
                colorDrawable = nb0Var2;
            }
            this.f41396n = colorDrawable;
        }
        AnimatorSet animatorSet = this.D;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            this.D = new AnimatorSet();
            if (nb0Var != null) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat.addUpdateListener(new ln(nb0Var, 0));
                valueAnimatorOfFloat.addListener(new nn(nb0Var));
                valueAnimatorOfFloat.setDuration(200L);
                this.D.playTogether(valueAnimatorOfFloat);
            }
            Drawable drawable = this.f41396n;
            if (drawable instanceof org.telegram.ui.Components.nb0) {
                org.telegram.ui.Components.nb0 nb0Var3 = (org.telegram.ui.Components.nb0) drawable;
                nb0Var3.s(0.0f);
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat2.addUpdateListener(new ln(nb0Var3, 1));
                valueAnimatorOfFloat2.addListener(new on(nb0Var3));
                valueAnimatorOfFloat2.setDuration(250L);
                this.D.playTogether(valueAnimatorOfFloat2);
            }
            this.D.start();
        }
        if (b4Var2 != null || this.R.P5 < 0) {
            c10 = 0;
        } else {
            if (org.telegram.ui.ActionBar.g6.I.q() == this.C) {
                f6VarN0 = org.telegram.ui.ActionBar.g6.I;
            } else {
                SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.g6.N0(string3) != null && !org.telegram.ui.ActionBar.g6.N0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.g6.N0(string4) != null && org.telegram.ui.ActionBar.g6.N0(string4).q()) {
                    str = string4;
                }
                f6VarN0 = this.C ? org.telegram.ui.ActionBar.g6.N0(str) : org.telegram.ui.ActionBar.g6.N0(str2);
            }
            c10 = 0;
            org.telegram.ui.ActionBar.g6.t(f6VarN0, false, this.C);
        }
        int i14 = AndroidUtilities.calcDrawableColor(this.f41396n)[c10];
        e();
        f();
        g(this.f41396n);
        k(1.0f);
    }

    public final void k(float f10) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this.f41392b.isEmpty()) {
            return;
        }
        Paint paintN = N("paintChatActionBackground");
        Paint paintN2 = N("paintChatActionBackgroundSelected");
        Paint paintN3 = N("paintChatMessageBackgroundSelected");
        int iD = this.M;
        int iB = this.N ? -1 : b(org.telegram.ui.ActionBar.g6.f23150ic, true);
        int iB2 = this.N ? -1 : b(org.telegram.ui.ActionBar.g6.f23168jc, true);
        int iB3 = this.N ? -1 : b(org.telegram.ui.ActionBar.g6.f23168jc, true);
        int iB4 = this.N ? -1 : b(org.telegram.ui.ActionBar.g6.kc, true);
        if (f10 != 1.0f) {
            iD = i0.b.d(f10, this.K, iD);
            iB = i0.b.d(f10, this.G, iB);
            iB2 = i0.b.d(f10, this.H, iB2);
            iB3 = i0.b.d(f10, this.I, iB3);
            iB4 = i0.b.d(f10, this.J, iB4);
        }
        if (paintN != null && !this.N) {
            paintN.setColor(iD);
            paintN2.setColor(iD);
        }
        Paint paintN4 = N("paintChatActionText");
        if (paintN4 != null) {
            ((TextPaint) paintN4).linkColor = iB2;
            N("paintChatActionText").setColor(iB);
            N("paintChatBotButton").setColor(iB3);
        }
        org.telegram.ui.ActionBar.g6.w1(iB, getDrawable("drawableMsgStickerCheck"));
        org.telegram.ui.ActionBar.g6.w1(iB, getDrawable("drawableMsgStickerClock"));
        org.telegram.ui.ActionBar.g6.w1(iB, getDrawable("drawableMsgStickerHalfCheck"));
        org.telegram.ui.ActionBar.g6.w1(iB, getDrawable("drawableMsgStickerPinned"));
        org.telegram.ui.ActionBar.g6.w1(iB, getDrawable("drawableMsgStickerReplies"));
        org.telegram.ui.ActionBar.g6.w1(iB, getDrawable("drawableMsgStickerViews"));
        org.telegram.ui.ActionBar.g6.w1(iB4, getDrawable("drawableBotInline"));
        org.telegram.ui.ActionBar.g6.w1(iB4, getDrawable("drawableBotLink"));
        org.telegram.ui.ActionBar.g6.w1(iB4, getDrawable("drawableBotLock"));
        org.telegram.ui.ActionBar.g6.w1(iB4, getDrawable("drawable_botInvite"));
        org.telegram.ui.ActionBar.g6.w1(iB4, getDrawable("drawableCommentSticker"));
        org.telegram.ui.ActionBar.g6.w1(iB4, getDrawable("drawableGoIcon"));
        org.telegram.ui.ActionBar.g6.w1(iB4, getDrawable("drawableReplyIcon"));
        org.telegram.ui.ActionBar.g6.w1(iB4, getDrawable("drawableShareIcon"));
        if (this.f41400x == null || (bitmap = this.v) == null) {
            return;
        }
        Rect rect = this.Q;
        Rect rect2 = this.P;
        if (f10 == 1.0f || (bitmap2 = this.L) == null) {
            this.B = true;
            rect2.set(0, 0, bitmap.getWidth(), this.v.getHeight());
            rect.set(0, 0, this.f41398s.getWidth(), this.f41398s.getHeight());
            this.f41400x.drawBitmap(this.v, rect2, rect, (Paint) null);
            if (paintN != null) {
                paintN.setShader(this.A);
                paintN2.setShader(this.A);
            }
            if (paintN3 != null) {
                paintN3.setShader(this.A);
                return;
            }
            return;
        }
        this.B = false;
        rect2.set(0, 0, bitmap2.getWidth(), this.L.getHeight());
        rect.set(0, 0, this.f41398s.getWidth(), this.f41398s.getHeight());
        this.f41400x.drawBitmap(this.L, rect2, rect, (Paint) null);
        Paint paint = this.f41399w;
        paint.setAlpha((int) (f10 * 255.0f));
        rect2.set(0, 0, this.v.getWidth(), this.v.getHeight());
        rect.set(0, 0, this.f41398s.getWidth(), this.f41398s.getHeight());
        this.f41400x.drawBitmap(this.v, rect2, rect, paint);
        if (paintN != null) {
            paintN.setShader(this.f41401y);
            paintN2.setShader(this.f41401y);
        }
        if (paintN3 != null) {
            paintN3.setShader(this.f41401y);
        }
    }

    @Override
    public final void m(float f10, float f11, int i10, int i11) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.f41396n == null || (bitmap = this.f41398s) == null || (bitmapShader = this.f41401y) == null) {
            org.telegram.ui.ActionBar.g6.q(f10, f11, i10, i11);
            return;
        }
        boolean z10 = this.B;
        Matrix matrix = this.f41393c;
        if (z10) {
            org.telegram.ui.ActionBar.g6.r(this.v, this.A, matrix, i10, i11, f10, f11);
        } else {
            org.telegram.ui.ActionBar.g6.r(bitmap, bitmapShader, matrix, i10, i11, f10, f11);
        }
    }

    @Override
    public final int o1(int i10) {
        return b(i10, false);
    }

    @Override
    public final int q0(int i10) {
        return N0(i10);
    }

    @Override
    public final boolean u0() {
        if (this.f41396n != null) {
            return this.f41401y != null;
        }
        return org.telegram.ui.ActionBar.g6.a1();
    }
}
