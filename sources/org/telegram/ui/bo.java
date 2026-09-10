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
public final class bo implements org.telegram.ui.ActionBar.f6, org.telegram.ui.Components.ac0 {
    public BitmapShader E;
    public boolean F;
    public AnimatorSet H;
    public org.telegram.ui.ActionBar.h5 I;
    public org.telegram.ui.ActionBar.h5 J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public Bitmap P;
    public int Q;
    public boolean R;
    public boolean S;
    public final eo V;
    public SparseIntArray e;
    public org.telegram.ui.ActionBar.f4 f31302f;
    public TLRPC.WallPaper h;
    public Drawable f31303n;
    public ValueAnimator f31304r;
    public Bitmap f31305s;
    public Bitmap v;
    public Canvas f31307x;
    public BitmapShader f31308y;
    public final HashMap f31299a = new HashMap();
    public final HashMap f31300b = new HashMap();
    public final Matrix f31301c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint f31306w = new Paint();
    public final Rect T = new Rect();
    public final Rect U = new Rect();
    public boolean G = org.telegram.ui.ActionBar.j6.I.q();

    public bo(eo eoVar) {
        int i10;
        int i11;
        this.V = eoVar;
        if (h(false)) {
            i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            this.f31302f = ChatThemeController.getInstance(i10).getDialogTheme(eoVar.T5);
            i11 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            TLRPC.WallPaper dialogWallpaper = ChatThemeController.getInstance(i11).getDialogWallpaper(eoVar.T5);
            this.h = dialogWallpaper;
            org.telegram.ui.ActionBar.f4 f4Var = this.f31302f;
            if (f4Var != null || dialogWallpaper != null) {
                j(f4Var, dialogWallpaper, false);
                AndroidUtilities.runOnUIThread(new bi.f0(15));
            }
        }
        if (ThemeEditorView.f21293n == null) {
            org.telegram.ui.ActionBar.j6.n1(true, true);
            return;
        }
        AndroidUtilities.runOnUIThread(new bi.f0(15));
    }

    @Override
    public final Paint F(String str) {
        if (this.f31302f == null && this.f31303n == null) {
            return null;
        }
        return (Paint) this.f31300b.get(str);
    }

    @Override
    public final int F0(int i10) {
        int indexOfKey;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        if (this.f31302f == null) {
            return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        }
        int indexOfKey3 = this.d.indexOfKey(i10);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i11 = org.telegram.ui.ActionBar.j6.ol.get(i10);
        if (i11 >= 0 && (indexOfKey = this.d.indexOfKey(i11)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override
    public final void L0(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i10, i11);
        }
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.j6.I.q();
    }

    public final int b(int i10, boolean z10) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f31302f == null && this.f31303n == null) {
            return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        }
        if (!z10 && (sparseIntArray = this.e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        if (sparseIntArray2 != null && (indexOfKey = sparseIntArray2.indexOfKey(i10)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public final org.telegram.ui.ActionBar.f4 c() {
        return this.f31302f;
    }

    public final Drawable d() {
        Drawable drawable = this.f31303n;
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.j6.s0();
    }

    public final void e() {
        Drawable h5Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.j6.jl.entrySet()) {
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
                    h5Var = new org.telegram.ui.ActionBar.h5(0, false, false, this);
                    break;
                case 1:
                    h5Var = new org.telegram.ui.ActionBar.h5(1, false, false, this);
                    break;
                case 2:
                    h5Var = new org.telegram.ui.ActionBar.h5(1, false, true, this);
                    break;
                case 3:
                    h5Var = new org.telegram.ui.ActionBar.h5(1, true, false, this);
                    break;
                case 4:
                    h5Var = new org.telegram.ui.ActionBar.h5(0, true, true, this);
                    break;
                case 5:
                    h5Var = new org.telegram.ui.ActionBar.h5(1, true, true, this);
                    break;
                case 6:
                    h5Var = new org.telegram.ui.ActionBar.h5(0, false, true, this);
                    break;
                case 7:
                    h5Var = new org.telegram.ui.ActionBar.h5(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    if (constantState != null) {
                        h5Var = constantState.newDrawable().mutate();
                    } else {
                        h5Var = null;
                    }
                    if (h5Var != null) {
                        int intValue = ((Integer) org.telegram.ui.ActionBar.j6.kl.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.j6.w1(F0(intValue), h5Var);
                            break;
                        }
                    }
                    break;
            }
            if (h5Var != null) {
                this.f31299a.put((String) entry.getKey(), h5Var);
            }
        }
    }

    @Override
    public final int e0(int i10) {
        return F0(i10);
    }

    public final void f() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.j6.ll.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.j6.ml.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(F0(intValue));
            }
            this.f31300b.put((String) entry.getKey(), paint);
        }
    }

    @Override
    public final int f1(int i10) {
        return b(i10, false);
    }

    public final void g(android.graphics.drawable.Drawable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bo.g(android.graphics.drawable.Drawable):void");
    }

    @Override
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.f31299a;
        if (!hashMap.isEmpty()) {
            return (Drawable) hashMap.get(str);
        }
        return null;
    }

    public final boolean h(boolean z10) {
        TLRPC.User user;
        eo eoVar = this.V;
        if (eoVar.h == null) {
            if (z10) {
                if (eoVar.e == null && (user = eoVar.f32318f) != null && !user.bot) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void i(org.telegram.ui.ActionBar.f4 f4Var, TLRPC.WallPaper wallPaper, boolean z10, Boolean bool, boolean z11) {
        org.telegram.ui.ActionBar.f5 f5Var;
        boolean z12;
        eg.b bVar;
        eg.b bVar2;
        org.telegram.ui.ActionBar.i6 A0;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int b10;
        int b11;
        int b12;
        org.telegram.ui.ActionBar.f5 f5Var2;
        int w02;
        int w03;
        int w04;
        int w05;
        eo eoVar = this.V;
        f5Var = ((org.telegram.ui.ActionBar.p2) eoVar).parentLayout;
        if (f5Var != null && eoVar.f32292ca == null) {
            if (bool != null) {
                z12 = bool.booleanValue();
            } else {
                z12 = this.G;
            }
            if (f4Var != null) {
                bVar = f4Var.f17716c;
            } else {
                bVar = null;
            }
            org.telegram.ui.ActionBar.f4 f4Var2 = this.f31302f;
            if (f4Var2 != null) {
                bVar2 = f4Var2.f17716c;
            } else {
                bVar2 = null;
            }
            TLRPC.WallPaper wallPaper2 = this.h;
            if (!z11) {
                if (h(false)) {
                    if (eg.b.a(bVar2, bVar) && this.G == z12 && ChatThemeController.equals(wallPaper, wallPaper2)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.G = z12;
            if (z12) {
                A0 = org.telegram.ui.ActionBar.j6.J;
            } else {
                A0 = org.telegram.ui.ActionBar.j6.A0();
            }
            org.telegram.ui.ActionBar.e5 e5Var = new org.telegram.ui.ActionBar.e5(A0, A0.Y, A0.q(), !z10);
            org.telegram.ui.ActionBar.f4 f4Var3 = this.f31302f;
            int i10 = -1;
            if (f4Var3 == null && this.h == null) {
                Drawable s02 = org.telegram.ui.ActionBar.j6.s0();
                this.R = s02 instanceof org.telegram.ui.Components.lc0;
                g(s02);
                if (this.R) {
                    w02 = -1;
                } else {
                    w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18023ic, false);
                }
                this.K = w02;
                if (this.R) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18041jc, false);
                }
                this.L = w03;
                if (this.R) {
                    w04 = -1;
                } else {
                    w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18041jc, false);
                }
                this.M = w04;
                if (this.R) {
                    w05 = -1;
                } else {
                    w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18061kc, false);
                }
                this.N = w05;
            } else {
                if (this.R) {
                    Drawable drawable = this.f31303n;
                    if (drawable instanceof org.telegram.ui.Components.lc0) {
                        Bitmap bitmap = ((org.telegram.ui.Components.lc0) drawable).f24949k;
                        this.P = bitmap;
                        if (f4Var3 != null) {
                            TLRPC.ChatTheme chatTheme = f4Var3.d;
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
                Drawable drawable2 = this.f31303n;
                if (drawable2 != null) {
                    g(drawable2);
                }
            }
            this.O = this.Q;
            if (this.R) {
                b10 = -1;
            } else {
                b10 = b(org.telegram.ui.ActionBar.j6.f18023ic, true);
            }
            this.K = b10;
            if (this.R) {
                b11 = -1;
            } else {
                b11 = b(org.telegram.ui.ActionBar.j6.f18041jc, true);
            }
            this.L = b11;
            if (this.R) {
                b12 = -1;
            } else {
                b12 = b(org.telegram.ui.ActionBar.j6.f18041jc, true);
            }
            this.M = b12;
            if (!this.R) {
                i10 = b(org.telegram.ui.ActionBar.j6.f18061kc, true);
            }
            this.N = i10;
            if (f4Var != null || wallPaper != null) {
                int i11 = AndroidUtilities.calcDrawableColor(this.f31303n)[0];
                e();
                f();
            }
            e5Var.f17685f = false;
            if (eoVar.T5 < 0) {
                e5Var.f17686g = false;
            }
            e5Var.h = new bi.g2(this, f4Var, wallPaper, z10, 12);
            if (z10) {
                e5Var.f17689k = new yn(this);
                e5Var.f17687i = new wn(this, 0);
                e5Var.f17688j = new wn(this, 1);
            } else {
                if (eoVar.X0 != null) {
                    eoVar.ec();
                }
                e5Var.h.run();
            }
            e5Var.e = true;
            e5Var.f17691m = this;
            e5Var.f17690l = 250L;
            f5Var2 = ((org.telegram.ui.ActionBar.p2) eoVar).parentLayout;
            ((ActionBarLayout) f5Var2).f(e5Var, null);
        }
    }

    public final void j(org.telegram.ui.ActionBar.f4 f4Var, TLRPC.WallPaper wallPaper, boolean z10) {
        Drawable drawable;
        org.telegram.ui.Components.lc0 lc0Var;
        int i10;
        int i11;
        boolean z11;
        Drawable drawable2;
        int i12;
        char c10;
        org.telegram.ui.ActionBar.i6 N0;
        int i13;
        org.telegram.ui.ActionBar.i6 N02;
        org.telegram.ui.ActionBar.f4 f4Var2 = f4Var;
        eo eoVar = this.V;
        if (eoVar.f32292ca != null) {
            return;
        }
        this.f31302f = f4Var2;
        this.h = wallPaper;
        if (eoVar.fragmentView != null) {
            drawable = eoVar.X0.getBackgroundImage();
        } else {
            drawable = null;
        }
        if (drawable instanceof org.telegram.ui.Components.lc0) {
            lc0Var = (org.telegram.ui.Components.lc0) drawable;
        } else {
            lc0Var = null;
        }
        if (lc0Var != null) {
            i10 = lc0Var.f24947i;
        } else {
            i10 = 0;
        }
        if ((f4Var2 == null || f4Var2.f17714a) && wallPaper == null) {
            int indexOfKey = org.telegram.ui.ActionBar.j6.rl.indexOfKey(org.telegram.ui.ActionBar.j6.f18079lc);
            if (indexOfKey >= 0) {
                org.telegram.ui.ActionBar.j6.rl.valueAt(indexOfKey);
            } else {
                int i14 = org.telegram.ui.ActionBar.j6.f17865a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (f4Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.f31300b.clear();
            this.f31299a.clear();
            Drawable s02 = org.telegram.ui.ActionBar.j6.s0();
            if (s02 instanceof org.telegram.ui.Components.lc0) {
                ((org.telegram.ui.Components.lc0) s02).v(i10);
            }
            this.f31303n = null;
            if (org.telegram.ui.ActionBar.j6.I.q() == this.G) {
                N02 = org.telegram.ui.ActionBar.j6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string) != null && !org.telegram.ui.ActionBar.j6.N0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string2) != null && org.telegram.ui.ActionBar.j6.N0(string2).q()) {
                    str = string2;
                }
                if (this.G) {
                    N02 = org.telegram.ui.ActionBar.j6.N0(str);
                } else {
                    N02 = org.telegram.ui.ActionBar.j6.N0(str2);
                }
            }
            org.telegram.ui.ActionBar.j6.t(N02, false, this.G);
            g(this.f31303n);
            return;
        }
        if (ApplicationLoader.applicationContext != null) {
            org.telegram.ui.ActionBar.j6.J(ApplicationLoader.applicationContext, false);
        }
        if (f4Var2 != null) {
            i11 = ((org.telegram.ui.ActionBar.p2) this.V).currentAccount;
            this.d = f4Var2.b(i11, this.G ? 1 : 0);
        } else {
            this.d = new SparseIntArray();
        }
        if (!TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(this.h))) {
            Drawable drawable3 = this.f31303n;
            i13 = ((org.telegram.ui.ActionBar.p2) this.V).currentAccount;
            this.f31303n = bi.e8.f(drawable3, i13, this.h, this.G);
        } else if (wallPaper != null) {
            this.f31303n = ho.d(this.f31303n, wallPaper, this.G);
        } else {
            if (f4Var2.f17714a) {
                org.telegram.ui.ActionBar.i6 e = org.telegram.ui.ActionBar.f4.e(this.G);
                i12 = ((org.telegram.ui.ActionBar.p2) this.V).currentAccount;
                org.telegram.ui.ActionBar.j6.H(e, f4Var2.h(i12, this.G ? 1 : 0), ((org.telegram.ui.ActionBar.e4) f4Var2.f17717f.get(this.G ? 1 : 0)).f17674g, i10, false);
                drawable2 = new ColorDrawable(-16777216);
            } else {
                int F0 = F0(org.telegram.ui.ActionBar.j6.Nd);
                int F02 = F0(org.telegram.ui.ActionBar.j6.Od);
                int F03 = F0(org.telegram.ui.ActionBar.j6.Pd);
                int F04 = F0(org.telegram.ui.ActionBar.j6.Qd);
                org.telegram.ui.Components.lc0 lc0Var2 = new org.telegram.ui.Components.lc0();
                lc0Var2.t(lc0Var2.f24959u, f4Var2.k(this.G ? 1 : 0).settings.intensity);
                TLRPC.Document f7 = f4Var2.f();
                if (lc0Var2.f24962y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    lc0Var2.f24962y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = lc0Var2.f24942c;
                    if (weakReference != null) {
                        lc0Var2.f24962y.setParentView((View) weakReference.get());
                    }
                    if (lc0Var2.T) {
                        lc0Var2.f24962y.onAttachedToWindow();
                    }
                }
                lc0Var2.f24962y.setImage(ImageLocation.getForDocument(f7), "80_80", null, null, null, 0);
                lc0Var2.f24962y.setAutoRepeatCount(1);
                lc0Var2.f24962y.setAutoRepeat(1);
                lc0Var2.o(F0, F02, F03, F04, 0, true);
                lc0Var2.v(i10);
                int f10 = lc0Var2.f();
                boolean z12 = this.G;
                oe oeVar = new oe(7, this, lc0Var2);
                org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) f4Var2.f17717f.get(z12 ? 1 : 0);
                if (e4Var != null && e4Var.f17672c != null) {
                    long i15 = f4Var2.i(z12 ? 1 : 0);
                    TL_stars.StarGift starGift = e4Var.f17672c.gift;
                    TLRPC.Document document = starGift.sticker;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList = starGift.attributes;
                    if (arrayList != null && document == null) {
                        int size = arrayList.size();
                        z11 = z12 ? 1 : 0;
                        int i16 = 0;
                        while (true) {
                            if (i16 >= size) {
                                break;
                            }
                            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i16);
                            int i17 = i16 + 1;
                            int i18 = size;
                            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                                document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                                break;
                            } else {
                                size = i18;
                                i16 = i17;
                            }
                        }
                    } else {
                        z11 = z12 ? 1 : 0;
                    }
                    TLRPC.Document document2 = document;
                    ImageLocation forDocument = ImageLocation.getForDocument(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver();
                    imageReceiver2.setAllowLoadingOnAttachedOnly(false);
                    imageReceiver2.setImage(forDocument, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.setDelegate(new bi.za(oeVar, i15, 2));
                    ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver2);
                } else {
                    z11 = z12 ? 1 : 0;
                }
                f4Var2 = f4Var;
                f4Var2.o(this.G ? 1 : 0, new org.telegram.messenger.n2(this, f4Var2, z11, lc0Var2, f10));
                drawable2 = lc0Var2;
            }
            this.f31303n = drawable2;
        }
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            this.H = new AnimatorSet();
            if (lc0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new xn(lc0Var, 0));
                ofFloat.addListener(new zn(lc0Var));
                ofFloat.setDuration(200L);
                this.H.playTogether(ofFloat);
            }
            Drawable drawable4 = this.f31303n;
            if (drawable4 instanceof org.telegram.ui.Components.lc0) {
                org.telegram.ui.Components.lc0 lc0Var3 = (org.telegram.ui.Components.lc0) drawable4;
                lc0Var3.s(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new xn(lc0Var3, 1));
                ofFloat2.addListener(new ao(lc0Var3));
                ofFloat2.setDuration(250L);
                this.H.playTogether(ofFloat2);
            }
            this.H.start();
        }
        if (f4Var2 == null && this.V.T5 >= 0) {
            if (org.telegram.ui.ActionBar.j6.I.q() == this.G) {
                N0 = org.telegram.ui.ActionBar.j6.I;
            } else {
                SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string3) != null && !org.telegram.ui.ActionBar.j6.N0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string4) != null && org.telegram.ui.ActionBar.j6.N0(string4).q()) {
                    str = string4;
                }
                if (this.G) {
                    N0 = org.telegram.ui.ActionBar.j6.N0(str);
                } else {
                    N0 = org.telegram.ui.ActionBar.j6.N0(str2);
                }
            }
            c10 = 0;
            org.telegram.ui.ActionBar.j6.t(N0, false, this.G);
        } else {
            c10 = 0;
        }
        int i19 = AndroidUtilities.calcDrawableColor(this.f31303n)[c10];
        e();
        f();
        g(this.f31303n);
        k(1.0f);
    }

    public final void k(float f7) {
        int b10;
        int b11;
        int b12;
        Bitmap bitmap;
        Bitmap bitmap2;
        if (!this.f31300b.isEmpty()) {
            Paint F = F("paintChatActionBackground");
            Paint F2 = F("paintChatActionBackgroundSelected");
            Paint F3 = F("paintChatMessageBackgroundSelected");
            int i10 = this.Q;
            int i11 = -1;
            if (this.R) {
                b10 = -1;
            } else {
                b10 = b(org.telegram.ui.ActionBar.j6.f18023ic, true);
            }
            if (this.R) {
                b11 = -1;
            } else {
                b11 = b(org.telegram.ui.ActionBar.j6.f18041jc, true);
            }
            if (this.R) {
                b12 = -1;
            } else {
                b12 = b(org.telegram.ui.ActionBar.j6.f18041jc, true);
            }
            if (!this.R) {
                i11 = b(org.telegram.ui.ActionBar.j6.f18061kc, true);
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
            org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerCheck"));
            org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerClock"));
            org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerHalfCheck"));
            org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerPinned"));
            org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerReplies"));
            org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerViews"));
            org.telegram.ui.ActionBar.j6.w1(i11, getDrawable("drawableBotInline"));
            org.telegram.ui.ActionBar.j6.w1(i11, getDrawable("drawableBotLink"));
            org.telegram.ui.ActionBar.j6.w1(i11, getDrawable("drawableBotLock"));
            org.telegram.ui.ActionBar.j6.w1(i11, getDrawable("drawable_botInvite"));
            org.telegram.ui.ActionBar.j6.w1(i11, getDrawable("drawableCommentSticker"));
            org.telegram.ui.ActionBar.j6.w1(i11, getDrawable("drawableGoIcon"));
            org.telegram.ui.ActionBar.j6.w1(i11, getDrawable("drawableReplyIcon"));
            org.telegram.ui.ActionBar.j6.w1(i11, getDrawable("drawableShareIcon"));
            if (this.f31307x != null && (bitmap = this.v) != null) {
                Rect rect = this.U;
                Rect rect2 = this.T;
                if (i12 != 0 && (bitmap2 = this.P) != null) {
                    this.F = false;
                    rect2.set(0, 0, bitmap2.getWidth(), this.P.getHeight());
                    rect.set(0, 0, this.f31305s.getWidth(), this.f31305s.getHeight());
                    this.f31307x.drawBitmap(this.P, rect2, rect, (Paint) null);
                    Paint paint = this.f31306w;
                    paint.setAlpha((int) (f7 * 255.0f));
                    rect2.set(0, 0, this.v.getWidth(), this.v.getHeight());
                    rect.set(0, 0, this.f31305s.getWidth(), this.f31305s.getHeight());
                    this.f31307x.drawBitmap(this.v, rect2, rect, paint);
                    if (F != null) {
                        F.setShader(this.f31308y);
                        F2.setShader(this.f31308y);
                    }
                    if (F3 != null) {
                        F3.setShader(this.f31308y);
                        return;
                    }
                    return;
                }
                this.F = true;
                rect2.set(0, 0, bitmap.getWidth(), this.v.getHeight());
                rect.set(0, 0, this.f31305s.getWidth(), this.f31305s.getHeight());
                this.f31307x.drawBitmap(this.v, rect2, rect, (Paint) null);
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
        if (this.f31303n != null && (bitmap = this.f31305s) != null && (bitmapShader = this.f31308y) != null) {
            boolean z10 = this.F;
            Matrix matrix = this.f31301c;
            if (z10) {
                org.telegram.ui.ActionBar.j6.r(this.v, this.E, matrix, i10, i11, f7, f10);
                return;
            } else {
                org.telegram.ui.ActionBar.j6.r(bitmap, bitmapShader, matrix, i10, i11, f7, f10);
                return;
            }
        }
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override
    public final boolean m0() {
        if (this.f31303n != null) {
            if (this.f31308y != null) {
                return true;
            }
            return false;
        }
        return org.telegram.ui.ActionBar.j6.a1();
    }

    @Override
    public final ColorFilter w() {
        return org.telegram.ui.ActionBar.j6.f18251v3;
    }
}
