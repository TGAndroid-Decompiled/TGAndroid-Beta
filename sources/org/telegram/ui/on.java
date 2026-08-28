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
public final class on implements org.telegram.ui.ActionBar.b6, org.telegram.ui.Components.ya0 {
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
    public final qn R;
    public SparseIntArray f41204e;
    public org.telegram.ui.ActionBar.b4 f41205f;
    public TLRPC.WallPaper h;
    public Drawable f41206n;
    public ValueAnimator f41207r;
    public Bitmap f41208s;
    public Bitmap v;
    public Canvas f41210x;
    public BitmapShader f41211y;
    public final HashMap f41201a = new HashMap();
    public final HashMap f41202b = new HashMap();
    public final Matrix f41203c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint f41209w = new Paint();
    public final Rect P = new Rect();
    public final Rect Q = new Rect();
    public boolean C = org.telegram.ui.ActionBar.f6.I.q();

    public on(qn qnVar) {
        int i9;
        int i10;
        this.R = qnVar;
        if (h(false)) {
            i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            this.f41205f = ChatThemeController.getInstance(i9).getDialogTheme(qnVar.P5);
            i10 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            TLRPC.WallPaper dialogWallpaper = ChatThemeController.getInstance(i10).getDialogWallpaper(qnVar.P5);
            this.h = dialogWallpaper;
            org.telegram.ui.ActionBar.b4 b4Var = this.f41205f;
            if (b4Var != null || dialogWallpaper != null) {
                j(b4Var, dialogWallpaper, false);
                AndroidUtilities.runOnUIThread(new bg.d2(25));
            }
        }
        if (ThemeEditorView.f26553n == null) {
            org.telegram.ui.ActionBar.f6.n1(true, true);
            return;
        }
        AndroidUtilities.runOnUIThread(new bg.d2(25));
    }

    @Override
    public final ColorFilter H() {
        return org.telegram.ui.ActionBar.f6.f23317v3;
    }

    @Override
    public final int N0(int i9) {
        int indexOfKey;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.f41204e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i9)) >= 0) {
            return this.f41204e.valueAt(indexOfKey2);
        }
        if (this.f41205f == null) {
            return org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        }
        int indexOfKey3 = this.d.indexOfKey(i9);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i10 = org.telegram.ui.ActionBar.f6.ol.get(i9);
        if (i10 >= 0 && (indexOfKey = this.d.indexOfKey(i10)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.f6.w0(null, i9, false);
    }

    @Override
    public final Paint O(String str) {
        if (this.f41205f == null && this.f41206n == null) {
            return null;
        }
        return (Paint) this.f41202b.get(str);
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.f6.I.q();
    }

    public final int b(int i9, boolean z10) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f41205f == null && this.f41206n == null) {
            return org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        }
        if (!z10 && (sparseIntArray = this.f41204e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i9)) >= 0) {
            return this.f41204e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        if (sparseIntArray2 != null && (indexOfKey = sparseIntArray2.indexOfKey(i9)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.f6.w0(null, i9, false);
    }

    public final org.telegram.ui.ActionBar.b4 c() {
        return this.f41205f;
    }

    @Override
    public final void c1(int i9, int i10) {
        SparseIntArray sparseIntArray = this.f41204e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i9, i10);
        }
    }

    public final Drawable d() {
        Drawable drawable = this.f41206n;
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.f6.s0();
    }

    public final void e() {
        Drawable d5Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.f6.jl.entrySet()) {
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
                        int intValue = ((Integer) org.telegram.ui.ActionBar.f6.kl.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.f6.w1(N0(intValue), d5Var);
                            break;
                        }
                    }
                    break;
            }
            if (d5Var != null) {
                this.f41201a.put((String) entry.getKey(), d5Var);
            }
        }
    }

    public final void f() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.f6.ll.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.f6.ml.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(N0(intValue));
            }
            this.f41202b.put((String) entry.getKey(), paint);
        }
    }

    public final void g(android.graphics.drawable.Drawable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.on.g(android.graphics.drawable.Drawable):void");
    }

    @Override
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.f41201a;
        if (!hashMap.isEmpty()) {
            return (Drawable) hashMap.get(str);
        }
        return null;
    }

    public final boolean h(boolean z10) {
        TLRPC.User user;
        qn qnVar = this.R;
        if (qnVar.h == null) {
            if (z10) {
                if (qnVar.f41890e == null && (user = qnVar.f41903f) != null && !user.bot) {
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
        nf.b bVar;
        nf.b bVar2;
        org.telegram.ui.ActionBar.e6 A0;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int b10;
        int b11;
        int b12;
        org.telegram.ui.ActionBar.b5 b5Var2;
        int w02;
        int w03;
        int w04;
        int w05;
        qn qnVar = this.R;
        b5Var = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
        if (b5Var != null && qnVar.Y9 == null) {
            if (bool != null) {
                z12 = bool.booleanValue();
            } else {
                z12 = this.C;
            }
            if (b4Var != null) {
                bVar = b4Var.f22750c;
            } else {
                bVar = null;
            }
            org.telegram.ui.ActionBar.b4 b4Var2 = this.f41205f;
            if (b4Var2 != null) {
                bVar2 = b4Var2.f22750c;
            } else {
                bVar2 = null;
            }
            TLRPC.WallPaper wallPaper2 = this.h;
            if (!z11) {
                if (h(false)) {
                    if (nf.b.a(bVar2, bVar) && this.C == z12 && ChatThemeController.equals(wallPaper, wallPaper2)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.C = z12;
            if (z12) {
                A0 = org.telegram.ui.ActionBar.f6.J;
            } else {
                A0 = org.telegram.ui.ActionBar.f6.A0();
            }
            org.telegram.ui.ActionBar.a5 a5Var = new org.telegram.ui.ActionBar.a5(A0, A0.U, A0.q(), !z10);
            org.telegram.ui.ActionBar.b4 b4Var3 = this.f41205f;
            int i9 = -1;
            if (b4Var3 == null && this.h == null) {
                Drawable s02 = org.telegram.ui.ActionBar.f6.s0();
                this.N = s02 instanceof org.telegram.ui.Components.jb0;
                g(s02);
                if (this.N) {
                    w02 = -1;
                } else {
                    w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23097ic, false);
                }
                this.G = w02;
                if (this.N) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.jc, false);
                }
                this.H = w03;
                if (this.N) {
                    w04 = -1;
                } else {
                    w04 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.jc, false);
                }
                this.I = w04;
                if (this.N) {
                    w05 = -1;
                } else {
                    w05 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23132kc, false);
                }
                this.J = w05;
            } else {
                if (this.N) {
                    Drawable drawable = this.f41206n;
                    if (drawable instanceof org.telegram.ui.Components.jb0) {
                        Bitmap bitmap = ((org.telegram.ui.Components.jb0) drawable).f29698k;
                        this.L = bitmap;
                        if (b4Var3 != null) {
                            TLRPC.ChatTheme chatTheme = b4Var3.d;
                            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                    if (tL_starGiftUnique != null && this.C) {
                                        this.L = Bitmap.createBitmap(bitmap);
                                        new Canvas(this.L).drawColor(-870178270);
                                    }
                                }
                            }
                            tL_starGiftUnique = null;
                            if (tL_starGiftUnique != null) {
                                this.L = Bitmap.createBitmap(bitmap);
                                new Canvas(this.L).drawColor(-870178270);
                            }
                        }
                    }
                }
                Drawable drawable2 = this.f41206n;
                if (drawable2 != null) {
                    g(drawable2);
                }
            }
            this.K = this.M;
            if (this.N) {
                b10 = -1;
            } else {
                b10 = b(org.telegram.ui.ActionBar.f6.f23097ic, true);
            }
            this.G = b10;
            if (this.N) {
                b11 = -1;
            } else {
                b11 = b(org.telegram.ui.ActionBar.f6.jc, true);
            }
            this.H = b11;
            if (this.N) {
                b12 = -1;
            } else {
                b12 = b(org.telegram.ui.ActionBar.f6.jc, true);
            }
            this.I = b12;
            if (!this.N) {
                i9 = b(org.telegram.ui.ActionBar.f6.f23132kc, true);
            }
            this.J = i9;
            if (b4Var != null || wallPaper != null) {
                int i10 = AndroidUtilities.calcDrawableColor(this.f41206n)[0];
                e();
                f();
            }
            a5Var.f22731f = false;
            if (qnVar.P5 < 0) {
                a5Var.f22732g = false;
            }
            a5Var.h = new bg.d(this, b4Var, wallPaper, z10, 10);
            if (z10) {
                a5Var.f22735k = new ln(this);
                a5Var.f22733i = new jn(this, 0);
                a5Var.f22734j = new jn(this, 1);
            } else {
                if (qnVar.T0 != null) {
                    qnVar.ec();
                }
                a5Var.h.run();
            }
            a5Var.f22730e = true;
            a5Var.f22737m = this;
            a5Var.f22736l = 250L;
            b5Var2 = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
            ((ActionBarLayout) b5Var2).f(a5Var, null);
        }
    }

    public final void j(org.telegram.ui.ActionBar.b4 b4Var, TLRPC.WallPaper wallPaper, boolean z10) {
        Drawable drawable;
        org.telegram.ui.Components.jb0 jb0Var;
        int i9;
        int i10;
        boolean z11;
        org.telegram.ui.Components.jb0 jb0Var2;
        Drawable drawable2;
        int i11;
        char c10;
        org.telegram.ui.ActionBar.e6 N0;
        int i12;
        org.telegram.ui.ActionBar.e6 N02;
        org.telegram.ui.ActionBar.b4 b4Var2 = b4Var;
        qn qnVar = this.R;
        if (qnVar.Y9 != null) {
            return;
        }
        this.f41205f = b4Var2;
        this.h = wallPaper;
        if (qnVar.fragmentView != null) {
            drawable = qnVar.T0.getBackgroundImage();
        } else {
            drawable = null;
        }
        if (drawable instanceof org.telegram.ui.Components.jb0) {
            jb0Var = (org.telegram.ui.Components.jb0) drawable;
        } else {
            jb0Var = null;
        }
        if (jb0Var != null) {
            i9 = jb0Var.f29696i;
        } else {
            i9 = 0;
        }
        if ((b4Var2 == null || b4Var2.f22748a) && wallPaper == null) {
            int indexOfKey = org.telegram.ui.ActionBar.f6.rl.indexOfKey(org.telegram.ui.ActionBar.f6.f23150lc);
            if (indexOfKey >= 0) {
                org.telegram.ui.ActionBar.f6.rl.valueAt(indexOfKey);
            } else {
                int i13 = org.telegram.ui.ActionBar.f6.f22941a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (b4Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.f41202b.clear();
            this.f41201a.clear();
            Drawable s02 = org.telegram.ui.ActionBar.f6.s0();
            if (s02 instanceof org.telegram.ui.Components.jb0) {
                ((org.telegram.ui.Components.jb0) s02).v(i9);
            }
            this.f41206n = null;
            if (org.telegram.ui.ActionBar.f6.I.q() == this.C) {
                N02 = org.telegram.ui.ActionBar.f6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.f6.N0(string) != null && !org.telegram.ui.ActionBar.f6.N0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.f6.N0(string2) != null && org.telegram.ui.ActionBar.f6.N0(string2).q()) {
                    str = string2;
                }
                if (this.C) {
                    N02 = org.telegram.ui.ActionBar.f6.N0(str);
                } else {
                    N02 = org.telegram.ui.ActionBar.f6.N0(str2);
                }
            }
            org.telegram.ui.ActionBar.f6.t(N02, false, this.C);
            g(this.f41206n);
            return;
        }
        if (ApplicationLoader.applicationContext != null) {
            org.telegram.ui.ActionBar.f6.J(ApplicationLoader.applicationContext, false);
        }
        if (b4Var2 != null) {
            i10 = ((org.telegram.ui.ActionBar.o2) this.R).currentAccount;
            this.d = b4Var2.b(i10, this.C ? 1 : 0);
        } else {
            this.d = new SparseIntArray();
        }
        if (!TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(this.h))) {
            Drawable drawable3 = this.f41206n;
            i12 = ((org.telegram.ui.ActionBar.o2) this.R).currentAccount;
            this.f41206n = kh.r6.f(drawable3, i12, this.h, this.C);
        } else if (wallPaper != null) {
            this.f41206n = tn.d(this.f41206n, wallPaper, this.C);
        } else {
            if (b4Var2.f22748a) {
                org.telegram.ui.ActionBar.e6 e10 = org.telegram.ui.ActionBar.b4.e(this.C);
                i11 = ((org.telegram.ui.ActionBar.o2) this.R).currentAccount;
                org.telegram.ui.ActionBar.f6.H(e10, b4Var2.h(i11, this.C ? 1 : 0), ((org.telegram.ui.ActionBar.a4) b4Var2.f22752f.get(this.C ? 1 : 0)).f22719g, i9, false);
                drawable2 = new ColorDrawable(-16777216);
            } else {
                int N03 = N0(org.telegram.ui.ActionBar.f6.Nd);
                int N04 = N0(org.telegram.ui.ActionBar.f6.Od);
                int N05 = N0(org.telegram.ui.ActionBar.f6.Pd);
                int N06 = N0(org.telegram.ui.ActionBar.f6.Qd);
                org.telegram.ui.Components.jb0 jb0Var3 = new org.telegram.ui.Components.jb0();
                jb0Var3.t(jb0Var3.f29708u, b4Var2.k(this.C ? 1 : 0).settings.intensity);
                TLRPC.Document f10 = b4Var2.f();
                if (jb0Var3.f29711y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    jb0Var3.f29711y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = jb0Var3.f29690c;
                    if (weakReference != null) {
                        jb0Var3.f29711y.setParentView((View) weakReference.get());
                    }
                    if (jb0Var3.T) {
                        jb0Var3.f29711y.onAttachedToWindow();
                    }
                }
                jb0Var3.f29711y.setImage(ImageLocation.getForDocument(f10), "80_80", null, null, null, 0);
                jb0Var3.f29711y.setAutoRepeatCount(1);
                jb0Var3.f29711y.setAutoRepeat(1);
                jb0Var3.o(N03, N04, N05, N06, 0, true);
                jb0Var3.v(i9);
                int f11 = jb0Var3.f();
                boolean z12 = this.C;
                ih.v3 v3Var = new ih.v3(21, this, jb0Var3);
                org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var2.f22752f.get(z12 ? 1 : 0);
                if (a4Var != null && a4Var.f22716c != null) {
                    jb0Var2 = jb0Var3;
                    long i14 = b4Var2.i(z12 ? 1 : 0);
                    TL_stars.StarGift starGift = a4Var.f22716c.gift;
                    TLRPC.Document document = starGift.sticker;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList = starGift.attributes;
                    if (arrayList != null && document == null) {
                        int size = arrayList.size();
                        int i15 = 0;
                        while (i15 < size) {
                            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i15);
                            int i16 = i15 + 1;
                            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                            z11 = z12 ? 1 : 0;
                            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                                document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                                break;
                            } else {
                                z12 = z11;
                                i15 = i16;
                            }
                        }
                    }
                    z11 = z12;
                    TLRPC.Document document2 = document;
                    ImageLocation forDocument = ImageLocation.getForDocument(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver();
                    imageReceiver2.setAllowLoadingOnAttachedOnly(false);
                    imageReceiver2.setImage(forDocument, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.setDelegate(new d3.e(v3Var, i14, 3));
                    ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver2);
                } else {
                    z11 = z12 ? 1 : 0;
                    jb0Var2 = jb0Var3;
                }
                b4Var2 = b4Var;
                org.telegram.ui.Components.jb0 jb0Var4 = jb0Var2;
                b4Var2.o(this.C ? 1 : 0, new org.telegram.messenger.j2(this, b4Var2, z11, jb0Var4, f11));
                drawable2 = jb0Var4;
            }
            this.f41206n = drawable2;
        }
        AnimatorSet animatorSet = this.D;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            this.D = new AnimatorSet();
            if (jb0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new kn(jb0Var, 0));
                ofFloat.addListener(new mn(jb0Var));
                ofFloat.setDuration(200L);
                this.D.playTogether(ofFloat);
            }
            Drawable drawable4 = this.f41206n;
            if (drawable4 instanceof org.telegram.ui.Components.jb0) {
                org.telegram.ui.Components.jb0 jb0Var5 = (org.telegram.ui.Components.jb0) drawable4;
                jb0Var5.s(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new kn(jb0Var5, 1));
                ofFloat2.addListener(new nn(jb0Var5));
                ofFloat2.setDuration(250L);
                this.D.playTogether(ofFloat2);
            }
            this.D.start();
        }
        if (b4Var2 == null && this.R.P5 >= 0) {
            if (org.telegram.ui.ActionBar.f6.I.q() == this.C) {
                N0 = org.telegram.ui.ActionBar.f6.I;
            } else {
                SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.f6.N0(string3) != null && !org.telegram.ui.ActionBar.f6.N0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.f6.N0(string4) != null && org.telegram.ui.ActionBar.f6.N0(string4).q()) {
                    str = string4;
                }
                if (this.C) {
                    N0 = org.telegram.ui.ActionBar.f6.N0(str);
                } else {
                    N0 = org.telegram.ui.ActionBar.f6.N0(str2);
                }
            }
            c10 = 0;
            org.telegram.ui.ActionBar.f6.t(N0, false, this.C);
        } else {
            c10 = 0;
        }
        int i17 = AndroidUtilities.calcDrawableColor(this.f41206n)[c10];
        e();
        f();
        g(this.f41206n);
        k(1.0f);
    }

    public final void k(float f10) {
        int b10;
        int b11;
        int b12;
        Bitmap bitmap;
        Bitmap bitmap2;
        if (!this.f41202b.isEmpty()) {
            Paint O = O("paintChatActionBackground");
            Paint O2 = O("paintChatActionBackgroundSelected");
            Paint O3 = O("paintChatMessageBackgroundSelected");
            int i9 = this.M;
            int i10 = -1;
            if (this.N) {
                b10 = -1;
            } else {
                b10 = b(org.telegram.ui.ActionBar.f6.f23097ic, true);
            }
            if (this.N) {
                b11 = -1;
            } else {
                b11 = b(org.telegram.ui.ActionBar.f6.jc, true);
            }
            if (this.N) {
                b12 = -1;
            } else {
                b12 = b(org.telegram.ui.ActionBar.f6.jc, true);
            }
            if (!this.N) {
                i10 = b(org.telegram.ui.ActionBar.f6.f23132kc, true);
            }
            int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i11 != 0) {
                i9 = i0.a.d(f10, this.K, i9);
                b10 = i0.a.d(f10, this.G, b10);
                b11 = i0.a.d(f10, this.H, b11);
                b12 = i0.a.d(f10, this.I, b12);
                i10 = i0.a.d(f10, this.J, i10);
            }
            if (O != null && !this.N) {
                O.setColor(i9);
                O2.setColor(i9);
            }
            Paint O4 = O("paintChatActionText");
            if (O4 != null) {
                ((TextPaint) O4).linkColor = b11;
                O("paintChatActionText").setColor(b10);
                O("paintChatBotButton").setColor(b12);
            }
            org.telegram.ui.ActionBar.f6.w1(b10, getDrawable("drawableMsgStickerCheck"));
            org.telegram.ui.ActionBar.f6.w1(b10, getDrawable("drawableMsgStickerClock"));
            org.telegram.ui.ActionBar.f6.w1(b10, getDrawable("drawableMsgStickerHalfCheck"));
            org.telegram.ui.ActionBar.f6.w1(b10, getDrawable("drawableMsgStickerPinned"));
            org.telegram.ui.ActionBar.f6.w1(b10, getDrawable("drawableMsgStickerReplies"));
            org.telegram.ui.ActionBar.f6.w1(b10, getDrawable("drawableMsgStickerViews"));
            org.telegram.ui.ActionBar.f6.w1(i10, getDrawable("drawableBotInline"));
            org.telegram.ui.ActionBar.f6.w1(i10, getDrawable("drawableBotLink"));
            org.telegram.ui.ActionBar.f6.w1(i10, getDrawable("drawableBotLock"));
            org.telegram.ui.ActionBar.f6.w1(i10, getDrawable("drawable_botInvite"));
            org.telegram.ui.ActionBar.f6.w1(i10, getDrawable("drawableCommentSticker"));
            org.telegram.ui.ActionBar.f6.w1(i10, getDrawable("drawableGoIcon"));
            org.telegram.ui.ActionBar.f6.w1(i10, getDrawable("drawableReplyIcon"));
            org.telegram.ui.ActionBar.f6.w1(i10, getDrawable("drawableShareIcon"));
            if (this.f41210x != null && (bitmap = this.v) != null) {
                Rect rect = this.Q;
                Rect rect2 = this.P;
                if (i11 != 0 && (bitmap2 = this.L) != null) {
                    this.B = false;
                    rect2.set(0, 0, bitmap2.getWidth(), this.L.getHeight());
                    rect.set(0, 0, this.f41208s.getWidth(), this.f41208s.getHeight());
                    this.f41210x.drawBitmap(this.L, rect2, rect, (Paint) null);
                    Paint paint = this.f41209w;
                    paint.setAlpha((int) (f10 * 255.0f));
                    rect2.set(0, 0, this.v.getWidth(), this.v.getHeight());
                    rect.set(0, 0, this.f41208s.getWidth(), this.f41208s.getHeight());
                    this.f41210x.drawBitmap(this.v, rect2, rect, paint);
                    if (O != null) {
                        O.setShader(this.f41211y);
                        O2.setShader(this.f41211y);
                    }
                    if (O3 != null) {
                        O3.setShader(this.f41211y);
                        return;
                    }
                    return;
                }
                this.B = true;
                rect2.set(0, 0, bitmap.getWidth(), this.v.getHeight());
                rect.set(0, 0, this.f41208s.getWidth(), this.f41208s.getHeight());
                this.f41210x.drawBitmap(this.v, rect2, rect, (Paint) null);
                if (O != null) {
                    O.setShader(this.A);
                    O2.setShader(this.A);
                }
                if (O3 != null) {
                    O3.setShader(this.A);
                }
            }
        }
    }

    @Override
    public final void o(float f10, float f11, int i9, int i10) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.f41206n != null && (bitmap = this.f41208s) != null && (bitmapShader = this.f41211y) != null) {
            boolean z10 = this.B;
            Matrix matrix = this.f41203c;
            if (z10) {
                org.telegram.ui.ActionBar.f6.r(this.v, this.A, matrix, i9, i10, f10, f11);
                return;
            } else {
                org.telegram.ui.ActionBar.f6.r(bitmap, bitmapShader, matrix, i9, i10, f10, f11);
                return;
            }
        }
        org.telegram.ui.ActionBar.f6.q(f10, f11, i9, i10);
    }

    @Override
    public final int p0(int i9) {
        return N0(i9);
    }

    @Override
    public final int q1(int i9) {
        return b(i9, false);
    }

    @Override
    public final boolean t0() {
        if (this.f41206n != null) {
            if (this.f41211y != null) {
                return true;
            }
            return false;
        }
        return org.telegram.ui.ActionBar.f6.a1();
    }
}
