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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ThemeEditorView;
public final class co implements org.telegram.ui.ActionBar.c6, org.telegram.ui.Components.rc0 {
    public BitmapShader E;
    public boolean F;
    public AnimatorSet H;
    public org.telegram.ui.ActionBar.d5 I;
    public org.telegram.ui.ActionBar.d5 J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public Bitmap P;
    public int Q;
    public boolean R;
    public boolean S;
    public final fo V;
    public SparseIntArray e;
    public org.telegram.ui.ActionBar.b4 f34740f;
    public TLRPC.WallPaper h;
    public Drawable f34741n;
    public ValueAnimator f34742r;
    public Bitmap f34743s;
    public Bitmap v;
    public Canvas f34745x;
    public BitmapShader f34746y;
    public final HashMap f34737a = new HashMap();
    public final HashMap f34738b = new HashMap();
    public final Matrix f34739c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint f34744w = new Paint();
    public final Rect T = new Rect();
    public final Rect U = new Rect();
    public boolean G = org.telegram.ui.ActionBar.g6.I.q();

    public co(fo foVar) {
        int i10;
        int i11;
        this.V = foVar;
        if (h(false)) {
            i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            this.f34740f = ChatThemeController.getInstance(i10).getDialogTheme(foVar.T5);
            i11 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            TLRPC.WallPaper dialogWallpaper = ChatThemeController.getInstance(i11).getDialogWallpaper(foVar.T5);
            this.h = dialogWallpaper;
            org.telegram.ui.ActionBar.b4 b4Var = this.f34740f;
            if (b4Var != null || dialogWallpaper != null) {
                j(b4Var, dialogWallpaper, false);
                AndroidUtilities.runOnUIThread(new ah.j(21));
            }
        }
        if (ThemeEditorView.f23027n == null) {
            org.telegram.ui.ActionBar.g6.o1(true, true);
            return;
        }
        AndroidUtilities.runOnUIThread(new ah.j(21));
    }

    @Override
    public final int E0(int i10) {
        int indexOfKey;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        if (this.f34740f == null) {
            return org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        }
        int indexOfKey3 = this.d.indexOfKey(i10);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i11 = org.telegram.ui.ActionBar.g6.rl.get(i10);
        if (i11 >= 0 && (indexOfKey = this.d.indexOfKey(i11)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.g6.x0(null, i10, false);
    }

    @Override
    public final Paint F(String str) {
        if (this.f34740f == null && this.f34741n == null) {
            return null;
        }
        return (Paint) this.f34738b.get(str);
    }

    @Override
    public final void M0(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i10, i11);
        }
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.g6.I.q();
    }

    public final int b(int i10, boolean z10) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f34740f == null && this.f34741n == null) {
            return org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        }
        if (!z10 && (sparseIntArray = this.e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        if (sparseIntArray2 != null && (indexOfKey = sparseIntArray2.indexOfKey(i10)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.g6.x0(null, i10, false);
    }

    @Override
    public final int b0(int i10) {
        return E0(i10);
    }

    public final org.telegram.ui.ActionBar.b4 c() {
        return this.f34740f;
    }

    public final Drawable d() {
        Drawable drawable = this.f34741n;
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.g6.t0();
    }

    public final void e() {
        Drawable d5Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.g6.ml.entrySet()) {
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
                    d5Var = new org.telegram.ui.ActionBar.d5(0, false, false, this);
                    break;
                case 1:
                    d5Var = new org.telegram.ui.ActionBar.d5(1, false, false, this);
                    break;
                case 2:
                    d5Var = new org.telegram.ui.ActionBar.d5(1, false, true, this);
                    break;
                case 3:
                    d5Var = new org.telegram.ui.ActionBar.d5(1, true, false, this);
                    break;
                case 4:
                    d5Var = new org.telegram.ui.ActionBar.d5(0, true, true, this);
                    break;
                case 5:
                    d5Var = new org.telegram.ui.ActionBar.d5(1, true, true, this);
                    break;
                case 6:
                    d5Var = new org.telegram.ui.ActionBar.d5(0, false, true, this);
                    break;
                case 7:
                    d5Var = new org.telegram.ui.ActionBar.d5(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    if (constantState != null) {
                        d5Var = constantState.newDrawable().mutate();
                    } else {
                        d5Var = null;
                    }
                    if (d5Var != null) {
                        int intValue = ((Integer) org.telegram.ui.ActionBar.g6.nl.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.g6.x1(E0(intValue), d5Var);
                            break;
                        }
                    }
                    break;
            }
            if (d5Var != null) {
                this.f34737a.put((String) entry.getKey(), d5Var);
            }
        }
    }

    public final void f() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.g6.ol.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.g6.pl.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(E0(intValue));
            }
            this.f34738b.put((String) entry.getKey(), paint);
        }
    }

    @Override
    public final int f1(int i10) {
        return b(i10, false);
    }

    public final void g(android.graphics.drawable.Drawable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.co.g(android.graphics.drawable.Drawable):void");
    }

    @Override
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.f34737a;
        if (!hashMap.isEmpty()) {
            return (Drawable) hashMap.get(str);
        }
        return null;
    }

    public final boolean h(boolean z10) {
        TLRPC.User user;
        fo foVar = this.V;
        if (foVar.h == null) {
            if (z10) {
                if (foVar.e == null && (user = foVar.f35636f) != null && !user.bot) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void i(org.telegram.ui.ActionBar.b4 b4Var, TLRPC.WallPaper wallPaper, boolean z10, Boolean bool, boolean z11) {
        org.telegram.ui.ActionBar.b5 b5Var;
        boolean z12;
        gg.b bVar;
        gg.b bVar2;
        org.telegram.ui.ActionBar.f6 B0;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int b10;
        int b11;
        int b12;
        org.telegram.ui.ActionBar.b5 b5Var2;
        int x02;
        int x03;
        int x04;
        int x05;
        fo foVar = this.V;
        b5Var = ((org.telegram.ui.ActionBar.m2) foVar).parentLayout;
        if (b5Var != null && foVar.f35609ca == null) {
            if (bool != null) {
                z12 = bool.booleanValue();
            } else {
                z12 = this.G;
            }
            if (b4Var != null) {
                bVar = b4Var.f19344c;
            } else {
                bVar = null;
            }
            org.telegram.ui.ActionBar.b4 b4Var2 = this.f34740f;
            if (b4Var2 != null) {
                bVar2 = b4Var2.f19344c;
            } else {
                bVar2 = null;
            }
            TLRPC.WallPaper wallPaper2 = this.h;
            if (!z11) {
                if (h(false)) {
                    if (gg.b.a(bVar2, bVar) && this.G == z12 && ChatThemeController.equals(wallPaper, wallPaper2)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.G = z12;
            if (z12) {
                B0 = org.telegram.ui.ActionBar.g6.J;
            } else {
                B0 = org.telegram.ui.ActionBar.g6.B0();
            }
            org.telegram.ui.ActionBar.a5 a5Var = new org.telegram.ui.ActionBar.a5(B0, B0.Y, B0.q(), !z10);
            org.telegram.ui.ActionBar.b4 b4Var3 = this.f34740f;
            int i10 = -1;
            if (b4Var3 == null && this.h == null) {
                Drawable t02 = org.telegram.ui.ActionBar.g6.t0();
                this.R = t02 instanceof org.telegram.ui.Components.cd0;
                g(t02);
                if (this.R) {
                    x02 = -1;
                } else {
                    x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19695ic, false);
                }
                this.K = x02;
                if (this.R) {
                    x03 = -1;
                } else {
                    x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19714jc, false);
                }
                this.L = x03;
                if (this.R) {
                    x04 = -1;
                } else {
                    x04 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19714jc, false);
                }
                this.M = x04;
                if (this.R) {
                    x05 = -1;
                } else {
                    x05 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19734kc, false);
                }
                this.N = x05;
            } else {
                if (this.R) {
                    Drawable drawable = this.f34741n;
                    if (drawable instanceof org.telegram.ui.Components.cd0) {
                        Bitmap bitmap = ((org.telegram.ui.Components.cd0) drawable).f23700k;
                        this.P = bitmap;
                        if (b4Var3 != null) {
                            TLRPC.ChatTheme chatTheme = b4Var3.d;
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
                Drawable drawable2 = this.f34741n;
                if (drawable2 != null) {
                    g(drawable2);
                }
            }
            this.O = this.Q;
            if (this.R) {
                b10 = -1;
            } else {
                b10 = b(org.telegram.ui.ActionBar.g6.f19695ic, true);
            }
            this.K = b10;
            if (this.R) {
                b11 = -1;
            } else {
                b11 = b(org.telegram.ui.ActionBar.g6.f19714jc, true);
            }
            this.L = b11;
            if (this.R) {
                b12 = -1;
            } else {
                b12 = b(org.telegram.ui.ActionBar.g6.f19714jc, true);
            }
            this.M = b12;
            if (!this.R) {
                i10 = b(org.telegram.ui.ActionBar.g6.f19734kc, true);
            }
            this.N = i10;
            if (b4Var != null || wallPaper != null) {
                int i11 = AndroidUtilities.calcDrawableColor(this.f34741n)[0];
                e();
                f();
            }
            a5Var.f19311f = false;
            if (foVar.T5 < 0) {
                a5Var.f19312g = false;
            }
            a5Var.h = new bi.h4(this, b4Var, wallPaper, z10, 11);
            if (z10) {
                a5Var.f19315k = new zn(this);
                a5Var.f19313i = new xn(this, 0);
                a5Var.f19314j = new xn(this, 1);
            } else {
                if (foVar.X0 != null) {
                    foVar.ic();
                }
                a5Var.h.run();
            }
            a5Var.e = true;
            a5Var.f19317m = this;
            a5Var.f19316l = 250L;
            b5Var2 = ((org.telegram.ui.ActionBar.m2) foVar).parentLayout;
            ((ActionBarLayout) b5Var2).f(a5Var, null);
        }
    }

    public final void j(org.telegram.ui.ActionBar.b4 b4Var, TLRPC.WallPaper wallPaper, boolean z10) {
        Drawable drawable;
        org.telegram.ui.Components.cd0 cd0Var;
        int i10;
        int i11;
        boolean z11;
        org.telegram.ui.Components.cd0 cd0Var2;
        Drawable drawable2;
        int i12;
        char c10;
        org.telegram.ui.ActionBar.f6 O0;
        int i13;
        org.telegram.ui.ActionBar.f6 O02;
        org.telegram.ui.ActionBar.b4 b4Var2 = b4Var;
        fo foVar = this.V;
        if (foVar.f35609ca != null) {
            return;
        }
        this.f34740f = b4Var2;
        this.h = wallPaper;
        if (foVar.fragmentView != null) {
            drawable = foVar.X0.getBackgroundImage();
        } else {
            drawable = null;
        }
        if (drawable instanceof org.telegram.ui.Components.cd0) {
            cd0Var = (org.telegram.ui.Components.cd0) drawable;
        } else {
            cd0Var = null;
        }
        if (cd0Var != null) {
            i10 = cd0Var.f23698i;
        } else {
            i10 = 0;
        }
        if ((b4Var2 == null || b4Var2.f19342a) && wallPaper == null) {
            int indexOfKey = org.telegram.ui.ActionBar.g6.ul.indexOfKey(org.telegram.ui.ActionBar.g6.f19751lc);
            if (indexOfKey >= 0) {
                org.telegram.ui.ActionBar.g6.ul.valueAt(indexOfKey);
            } else {
                int i14 = org.telegram.ui.ActionBar.g6.f19536a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (b4Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.f34738b.clear();
            this.f34737a.clear();
            Drawable t02 = org.telegram.ui.ActionBar.g6.t0();
            if (t02 instanceof org.telegram.ui.Components.cd0) {
                ((org.telegram.ui.Components.cd0) t02).v(i10);
            }
            this.f34741n = null;
            if (org.telegram.ui.ActionBar.g6.I.q() == this.G) {
                O02 = org.telegram.ui.ActionBar.g6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.g6.O0(string) != null && !org.telegram.ui.ActionBar.g6.O0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.g6.O0(string2) != null && org.telegram.ui.ActionBar.g6.O0(string2).q()) {
                    str = string2;
                }
                if (this.G) {
                    O02 = org.telegram.ui.ActionBar.g6.O0(str);
                } else {
                    O02 = org.telegram.ui.ActionBar.g6.O0(str2);
                }
            }
            org.telegram.ui.ActionBar.g6.t(O02, false, this.G);
            g(this.f34741n);
            return;
        }
        if (ApplicationLoader.applicationContext != null) {
            org.telegram.ui.ActionBar.g6.J(ApplicationLoader.applicationContext, false);
        }
        if (b4Var2 != null) {
            i11 = ((org.telegram.ui.ActionBar.m2) this.V).currentAccount;
            this.d = b4Var2.b(i11, this.G ? 1 : 0);
        } else {
            this.d = new SparseIntArray();
        }
        if (!TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(this.h))) {
            Drawable drawable3 = this.f34741n;
            i13 = ((org.telegram.ui.ActionBar.m2) this.V).currentAccount;
            this.f34741n = di.a7.f(drawable3, i13, this.h, this.G);
        } else if (wallPaper != null) {
            this.f34741n = io.d(this.f34741n, wallPaper, this.G);
        } else {
            if (b4Var2.f19342a) {
                org.telegram.ui.ActionBar.f6 e = org.telegram.ui.ActionBar.b4.e(this.G);
                i12 = ((org.telegram.ui.ActionBar.m2) this.V).currentAccount;
                org.telegram.ui.ActionBar.g6.H(e, b4Var2.h(i12, this.G ? 1 : 0), ((org.telegram.ui.ActionBar.a4) b4Var2.f19345f.get(this.G ? 1 : 0)).f19300g, i10, false);
                drawable2 = new ColorDrawable(-16777216);
            } else {
                int E0 = E0(org.telegram.ui.ActionBar.g6.Nd);
                int E02 = E0(org.telegram.ui.ActionBar.g6.Od);
                int E03 = E0(org.telegram.ui.ActionBar.g6.Pd);
                int E04 = E0(org.telegram.ui.ActionBar.g6.Qd);
                org.telegram.ui.Components.cd0 cd0Var3 = new org.telegram.ui.Components.cd0();
                cd0Var3.t(cd0Var3.f23710u, b4Var2.k(this.G ? 1 : 0).settings.intensity);
                TLRPC.Document f7 = b4Var2.f();
                if (cd0Var3.f23713y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    cd0Var3.f23713y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = cd0Var3.f23693c;
                    if (weakReference != null) {
                        cd0Var3.f23713y.setParentView((View) weakReference.get());
                    }
                    if (cd0Var3.T) {
                        cd0Var3.f23713y.onAttachedToWindow();
                    }
                }
                cd0Var3.f23713y.setImage(ImageLocation.getForDocument(f7), "80_80", null, null, null, 0);
                cd0Var3.f23713y.setAutoRepeatCount(1);
                cd0Var3.f23713y.setAutoRepeat(1);
                cd0Var3.o(E0, E02, E03, E04, 0, true);
                cd0Var3.v(i10);
                int f10 = cd0Var3.f();
                boolean z12 = this.G;
                m4.y0 y0Var = new m4.y0(16, this, cd0Var3);
                org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var2.f19345f.get(z12 ? 1 : 0);
                if (a4Var != null && a4Var.f19298c != null) {
                    cd0Var2 = cd0Var3;
                    long i15 = b4Var2.i(z12 ? 1 : 0);
                    TL_stars.StarGift starGift = a4Var.f19298c.gift;
                    TLRPC.Document document = starGift.sticker;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList = starGift.attributes;
                    if (arrayList != null && document == null) {
                        int size = arrayList.size();
                        int i16 = 0;
                        while (i16 < size) {
                            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i16);
                            int i17 = i16 + 1;
                            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                            z11 = z12 ? 1 : 0;
                            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                                document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                                break;
                            } else {
                                z12 = z11;
                                i16 = i17;
                            }
                        }
                    }
                    z11 = z12;
                    TLRPC.Document document2 = document;
                    ImageLocation forDocument = ImageLocation.getForDocument(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver();
                    imageReceiver2.setAllowLoadingOnAttachedOnly(false);
                    imageReceiver2.setImage(forDocument, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.setDelegate(new bi.p1(y0Var, i15, 3));
                    ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver2);
                } else {
                    z11 = z12 ? 1 : 0;
                    cd0Var2 = cd0Var3;
                }
                b4Var2 = b4Var;
                org.telegram.ui.Components.cd0 cd0Var4 = cd0Var2;
                b4Var2.o(this.G ? 1 : 0, new org.telegram.messenger.m2(this, b4Var2, z11, cd0Var4, f10));
                drawable2 = cd0Var4;
            }
            this.f34741n = drawable2;
        }
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            this.H = new AnimatorSet();
            if (cd0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new yn(cd0Var, 0));
                ofFloat.addListener(new ao(cd0Var));
                ofFloat.setDuration(200L);
                this.H.playTogether(ofFloat);
            }
            Drawable drawable4 = this.f34741n;
            if (drawable4 instanceof org.telegram.ui.Components.cd0) {
                org.telegram.ui.Components.cd0 cd0Var5 = (org.telegram.ui.Components.cd0) drawable4;
                cd0Var5.s(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new yn(cd0Var5, 1));
                ofFloat2.addListener(new bo(cd0Var5));
                ofFloat2.setDuration(250L);
                this.H.playTogether(ofFloat2);
            }
            this.H.start();
        }
        if (b4Var2 == null && this.V.T5 >= 0) {
            if (org.telegram.ui.ActionBar.g6.I.q() == this.G) {
                O0 = org.telegram.ui.ActionBar.g6.I;
            } else {
                SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.g6.O0(string3) != null && !org.telegram.ui.ActionBar.g6.O0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.g6.O0(string4) != null && org.telegram.ui.ActionBar.g6.O0(string4).q()) {
                    str = string4;
                }
                if (this.G) {
                    O0 = org.telegram.ui.ActionBar.g6.O0(str);
                } else {
                    O0 = org.telegram.ui.ActionBar.g6.O0(str2);
                }
            }
            c10 = 0;
            org.telegram.ui.ActionBar.g6.t(O0, false, this.G);
        } else {
            c10 = 0;
        }
        int i18 = AndroidUtilities.calcDrawableColor(this.f34741n)[c10];
        e();
        f();
        g(this.f34741n);
        k(1.0f);
    }

    public final void k(float f7) {
        int b10;
        int b11;
        int b12;
        Bitmap bitmap;
        Bitmap bitmap2;
        if (!this.f34738b.isEmpty()) {
            Paint F = F("paintChatActionBackground");
            Paint F2 = F("paintChatActionBackgroundSelected");
            Paint F3 = F("paintChatMessageBackgroundSelected");
            int i10 = this.Q;
            int i11 = -1;
            if (this.R) {
                b10 = -1;
            } else {
                b10 = b(org.telegram.ui.ActionBar.g6.f19695ic, true);
            }
            if (this.R) {
                b11 = -1;
            } else {
                b11 = b(org.telegram.ui.ActionBar.g6.f19714jc, true);
            }
            if (this.R) {
                b12 = -1;
            } else {
                b12 = b(org.telegram.ui.ActionBar.g6.f19714jc, true);
            }
            if (!this.R) {
                i11 = b(org.telegram.ui.ActionBar.g6.f19734kc, true);
            }
            int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            if (i12 != 0) {
                i10 = i0.a.d(f7, this.O, i10);
                b10 = i0.a.d(f7, this.K, b10);
                b11 = i0.a.d(f7, this.L, b11);
                b12 = i0.a.d(f7, this.M, b12);
                i11 = i0.a.d(f7, this.N, i11);
            }
            if (F != null && !this.R) {
                F.setColor(i10);
                F2.setColor(i10);
            }
            Paint F4 = F("paintChatActionText");
            if (F4 != null) {
                ((TextPaint) F4).linkColor = b11;
                F("paintChatActionText").setColor(b10);
                F("paintChatBotButton").setColor(b12);
            }
            org.telegram.ui.ActionBar.g6.x1(b10, getDrawable("drawableMsgStickerCheck"));
            org.telegram.ui.ActionBar.g6.x1(b10, getDrawable("drawableMsgStickerClock"));
            org.telegram.ui.ActionBar.g6.x1(b10, getDrawable("drawableMsgStickerHalfCheck"));
            org.telegram.ui.ActionBar.g6.x1(b10, getDrawable("drawableMsgStickerPinned"));
            org.telegram.ui.ActionBar.g6.x1(b10, getDrawable("drawableMsgStickerReplies"));
            org.telegram.ui.ActionBar.g6.x1(b10, getDrawable("drawableMsgStickerViews"));
            org.telegram.ui.ActionBar.g6.x1(i11, getDrawable("drawableBotInline"));
            org.telegram.ui.ActionBar.g6.x1(i11, getDrawable("drawableBotLink"));
            org.telegram.ui.ActionBar.g6.x1(i11, getDrawable("drawableBotLock"));
            org.telegram.ui.ActionBar.g6.x1(i11, getDrawable("drawable_botInvite"));
            org.telegram.ui.ActionBar.g6.x1(i11, getDrawable("drawableCommentSticker"));
            org.telegram.ui.ActionBar.g6.x1(i11, getDrawable("drawableGoIcon"));
            org.telegram.ui.ActionBar.g6.x1(i11, getDrawable("drawableReplyIcon"));
            org.telegram.ui.ActionBar.g6.x1(i11, getDrawable("drawableShareIcon"));
            if (this.f34745x != null && (bitmap = this.v) != null) {
                Rect rect = this.U;
                Rect rect2 = this.T;
                if (i12 != 0 && (bitmap2 = this.P) != null) {
                    this.F = false;
                    rect2.set(0, 0, bitmap2.getWidth(), this.P.getHeight());
                    rect.set(0, 0, this.f34743s.getWidth(), this.f34743s.getHeight());
                    this.f34745x.drawBitmap(this.P, rect2, rect, (Paint) null);
                    Paint paint = this.f34744w;
                    paint.setAlpha((int) (f7 * 255.0f));
                    rect2.set(0, 0, this.v.getWidth(), this.v.getHeight());
                    rect.set(0, 0, this.f34743s.getWidth(), this.f34743s.getHeight());
                    this.f34745x.drawBitmap(this.v, rect2, rect, paint);
                    if (F != null) {
                        F.setShader(this.f34746y);
                        F2.setShader(this.f34746y);
                    }
                    if (F3 != null) {
                        F3.setShader(this.f34746y);
                        return;
                    }
                    return;
                }
                this.F = true;
                rect2.set(0, 0, bitmap.getWidth(), this.v.getHeight());
                rect.set(0, 0, this.f34743s.getWidth(), this.f34743s.getHeight());
                this.f34745x.drawBitmap(this.v, rect2, rect, (Paint) null);
                if (F != null) {
                    F.setShader(this.E);
                    F2.setShader(this.E);
                }
                if (F3 != null) {
                    F3.setShader(this.E);
                }
            }
        }
    }

    @Override
    public final void l(float f7, float f10, int i10, int i11) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.f34741n != null && (bitmap = this.f34743s) != null && (bitmapShader = this.f34746y) != null) {
            boolean z10 = this.F;
            Matrix matrix = this.f34739c;
            if (z10) {
                org.telegram.ui.ActionBar.g6.r(this.v, this.E, matrix, i10, i11, f7, f10);
                return;
            } else {
                org.telegram.ui.ActionBar.g6.r(bitmap, bitmapShader, matrix, i10, i11, f7, f10);
                return;
            }
        }
        org.telegram.ui.ActionBar.g6.q(f7, f10, i10, i11);
    }

    @Override
    public final boolean m0() {
        if (this.f34741n != null) {
            if (this.f34746y != null) {
                return true;
            }
            return false;
        }
        return org.telegram.ui.ActionBar.g6.b1();
    }

    @Override
    public final ColorFilter w() {
        return org.telegram.ui.ActionBar.g6.f19930v3;
    }
}
