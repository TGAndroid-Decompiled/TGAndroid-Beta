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
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ThemeEditorView;
public final class an implements org.telegram.ui.ActionBar.h6, org.telegram.ui.Components.ea0 {
    public Bitmap A;
    public int B;
    public boolean C;
    public boolean D;
    public final cn G;
    public SparseIntArray f43728e;
    public org.telegram.ui.ActionBar.s3 f43729f;
    public TLRPC.WallPaper f43730g;
    public Drawable h;
    public ValueAnimator f43731i;
    public Bitmap f43732j;
    public Bitmap f43733k;
    public Canvas f43735m;
    public BitmapShader f43736n;
    public BitmapShader f43737o;
    public boolean f43738p;
    public AnimatorSet f43740r;
    public boolean f43741s;
    public org.telegram.ui.ActionBar.u4 f43742t;
    public org.telegram.ui.ActionBar.u4 f43743u;
    public int v;
    public int f43744w;
    public int f43745x;
    public int f43746y;
    public int f43747z;
    public final HashMap f43725a = new HashMap();
    public final HashMap f43726b = new HashMap();
    public final Matrix f43727c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint f43734l = new Paint();
    public final Rect E = new Rect();
    public final Rect F = new Rect();
    public boolean f43739q = org.telegram.ui.ActionBar.m6.I.q();

    public an(cn cnVar) {
        int i7;
        int i10;
        this.G = cnVar;
        boolean z9 = false;
        if (q(false)) {
            i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            this.f43729f = org.telegram.messenger.d4.f(i7).c(cnVar.f44545j6);
            i10 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            TLRPC.WallPaper d = org.telegram.messenger.d4.f(i10).d(cnVar.f44545j6);
            this.f43730g = d;
            org.telegram.ui.ActionBar.s3 s3Var = this.f43729f;
            if (s3Var != null || d != null) {
                s(s3Var, d, false);
                z9 = true;
            }
        }
        if (!z9) {
            t();
        }
        if (!z9 && ThemeEditorView.f31582p == null) {
            org.telegram.ui.ActionBar.m6.t1(true, true);
        } else {
            org.telegram.messenger.g0.h3(new org.telegram.messenger.rc(16));
        }
    }

    @Override
    public final boolean a() {
        SparseIntArray sparseIntArray = this.d;
        if (sparseIntArray != null && sparseIntArray.size() > 0) {
            return this.f43739q;
        }
        return org.telegram.ui.ActionBar.m6.I.q();
    }

    @Override
    public final void b(float f10, float f11, int i7, int i10) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.h != null && (bitmap = this.f43732j) != null && (bitmapShader = this.f43736n) != null) {
            boolean z9 = this.f43738p;
            Matrix matrix = this.f43727c;
            if (z9) {
                org.telegram.ui.ActionBar.m6.s(this.f43733k, this.f43737o, matrix, i7, i10, f10, f11);
                return;
            } else {
                org.telegram.ui.ActionBar.m6.s(bitmap, bitmapShader, matrix, i7, i10, f10, f11);
                return;
            }
        }
        org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
    }

    @Override
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.m6.f28222v3;
    }

    @Override
    public final Paint d(String str) {
        if (this.f43729f == null && this.h == null && !this.f43741s) {
            return null;
        }
        return (Paint) this.f43726b.get(str);
    }

    @Override
    public final boolean e() {
        return this.G.R9();
    }

    @Override
    public final int f(int i7) {
        return h(i7);
    }

    @Override
    public final boolean g() {
        if (this.h == null && !this.f43741s) {
            return org.telegram.ui.ActionBar.m6.d1();
        }
        if (this.f43736n != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.f43725a;
        if (!hashMap.isEmpty()) {
            return (Drawable) hashMap.get(str);
        }
        return null;
    }

    @Override
    public final int h(int i7) {
        int indexOfKey;
        Integer z02;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.f43728e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i7)) >= 0) {
            return this.f43728e.valueAt(indexOfKey2);
        }
        if (this.f43741s && (z02 = org.telegram.ui.ActionBar.m6.z0(i7, this)) != null) {
            return z02.intValue();
        }
        if (this.f43729f == null) {
            return org.telegram.ui.ActionBar.m6.v0(i7);
        }
        int indexOfKey3 = this.d.indexOfKey(i7);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i10 = org.telegram.ui.ActionBar.m6.fm.get(i7);
        if (i10 >= 0 && (indexOfKey = this.d.indexOfKey(i10)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.m6.v0(i7);
    }

    @Override
    public final void i(int i7, int i10) {
        SparseIntArray sparseIntArray = this.f43728e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i7, i10);
        }
    }

    @Override
    public final int j(int i7) {
        return k(i7, false);
    }

    public final int k(int i7, boolean z9) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f43729f == null && this.h == null) {
            return org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        }
        if (!z9 && (sparseIntArray = this.f43728e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i7)) >= 0) {
            return this.f43728e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        if (sparseIntArray2 != null && (indexOfKey = sparseIntArray2.indexOfKey(i7)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.m6.x0(null, i7, false);
    }

    public final org.telegram.ui.ActionBar.s3 l() {
        return this.f43729f;
    }

    public final Drawable m() {
        Drawable drawable = this.h;
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.m6.t0();
    }

    public final void n() {
        Drawable u4Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.m6.am.entrySet()) {
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
                    u4Var = new org.telegram.ui.ActionBar.u4(0, false, false, this);
                    break;
                case 1:
                    u4Var = new org.telegram.ui.ActionBar.u4(1, false, false, this);
                    break;
                case 2:
                    u4Var = new org.telegram.ui.ActionBar.u4(1, false, true, this);
                    break;
                case 3:
                    u4Var = new org.telegram.ui.ActionBar.u4(1, true, false, this);
                    break;
                case 4:
                    u4Var = new org.telegram.ui.ActionBar.u4(0, true, true, this);
                    break;
                case 5:
                    u4Var = new org.telegram.ui.ActionBar.u4(1, true, true, this);
                    break;
                case 6:
                    u4Var = new org.telegram.ui.ActionBar.u4(0, false, true, this);
                    break;
                case 7:
                    u4Var = new org.telegram.ui.ActionBar.u4(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    if (constantState != null) {
                        u4Var = constantState.newDrawable().mutate();
                    } else {
                        u4Var = null;
                    }
                    if (u4Var != null) {
                        int intValue = ((Integer) org.telegram.ui.ActionBar.m6.bm.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.m6.C1(h(intValue), u4Var);
                            break;
                        }
                    }
                    break;
            }
            if (u4Var != null) {
                this.f43725a.put((String) entry.getKey(), u4Var);
            }
        }
    }

    public final void o() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.m6.cm.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.m6.dm.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(h(intValue));
            }
            this.f43726b.put((String) entry.getKey(), paint);
        }
    }

    public final void p(android.graphics.drawable.Drawable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.p(android.graphics.drawable.Drawable):void");
    }

    public final boolean q(boolean z9) {
        TLRPC.User user;
        cn cnVar = this.G;
        if (cnVar.h == null) {
            if (z9) {
                if (cnVar.f44473e == null && (user = cnVar.f44487f) != null && !user.bot) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void r(org.telegram.ui.ActionBar.s3 r14, org.telegram.tgnet.TLRPC.WallPaper r15, boolean r16, java.lang.Boolean r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.an.r(org.telegram.ui.ActionBar.s3, org.telegram.tgnet.TLRPC$WallPaper, boolean, java.lang.Boolean, boolean):void");
    }

    public final void s(org.telegram.ui.ActionBar.s3 s3Var, TLRPC.WallPaper wallPaper, boolean z9) {
        Drawable drawable;
        org.telegram.ui.Components.qa0 qa0Var;
        int i7;
        int i10;
        int i11;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.j6 j6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        org.telegram.ui.ActionBar.l6 l6Var;
        boolean z10;
        Drawable drawable2;
        int i12;
        char c10;
        org.telegram.ui.ActionBar.l6 Q0;
        int i13;
        org.telegram.ui.ActionBar.l6 Q02;
        org.telegram.ui.ActionBar.s3 s3Var2 = s3Var;
        cn cnVar = this.G;
        if (cnVar.f44726xa != null) {
            return;
        }
        this.f43729f = s3Var2;
        this.f43730g = wallPaper;
        if (cnVar.fragmentView != null) {
            drawable = cnVar.l1.getBackgroundImage();
        } else {
            drawable = null;
        }
        if (drawable instanceof org.telegram.ui.Components.qa0) {
            qa0Var = (org.telegram.ui.Components.qa0) drawable;
        } else {
            qa0Var = null;
        }
        if (qa0Var != null) {
            i7 = qa0Var.f37213i;
        } else {
            i7 = 0;
        }
        if ((s3Var2 == null || s3Var2.f28485a) && wallPaper == null) {
            int indexOfKey2 = org.telegram.ui.ActionBar.m6.im.indexOfKey(org.telegram.ui.ActionBar.m6.Zc);
            if (indexOfKey2 >= 0) {
                org.telegram.ui.ActionBar.m6.im.valueAt(indexOfKey2);
            } else {
                int i14 = org.telegram.ui.ActionBar.m6.f27826a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (s3Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.f43726b.clear();
            this.f43725a.clear();
            Drawable t02 = org.telegram.ui.ActionBar.m6.t0();
            if (t02 instanceof org.telegram.ui.Components.qa0) {
                ((org.telegram.ui.Components.qa0) t02).u(i7);
            }
            this.h = null;
            if (org.telegram.ui.ActionBar.m6.I.q() == this.f43739q) {
                Q02 = org.telegram.ui.ActionBar.m6.I;
            } else {
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25570b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.m6.Q0(string) != null && !org.telegram.ui.ActionBar.m6.Q0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.m6.Q0(string2) != null && org.telegram.ui.ActionBar.m6.Q0(string2).q()) {
                    str = string2;
                }
                if (this.f43739q) {
                    Q02 = org.telegram.ui.ActionBar.m6.Q0(str);
                } else {
                    Q02 = org.telegram.ui.ActionBar.m6.Q0(str2);
                }
            }
            org.telegram.ui.ActionBar.m6.u(Q02, false, this.f43739q);
            p(this.h);
            this.f43741s = false;
            t();
            return;
        }
        this.f43741s = false;
        if (org.telegram.messenger.t0.f25570b != null) {
            org.telegram.ui.ActionBar.m6.K(org.telegram.messenger.t0.f25570b, false);
        }
        if (s3Var2 != null) {
            i10 = ((org.telegram.ui.ActionBar.f2) this.G).currentAccount;
            boolean z11 = this.f43739q;
            ArrayList arrayList2 = s3Var2.f28489f;
            org.telegram.ui.ActionBar.l6 i15 = s3Var2.i(z11 ? 1 : 0);
            if (i15 == null) {
                int i16 = ((org.telegram.ui.ActionBar.r3) s3Var2.f28489f.get(z11 ? 1 : 0)).d;
                i11 = 0;
                org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) ((ig.a) s3Var2.f28489f.get(z11 ? 1 : 0));
                TLRPC.ThemeSettings b10 = r3Var.b(i16);
                TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.r3) s3Var2.f28489f.get(z11 ? 1 : 0)).f28466b;
                org.telegram.ui.ActionBar.l6 l6Var2 = new org.telegram.ui.ActionBar.l6(org.telegram.ui.ActionBar.m6.Q0(org.telegram.ui.ActionBar.m6.r0(b10)));
                arrayList = arrayList2;
                j6Var = l6Var2.e(r3Var.a(), b10, tL_theme, i10, true);
                l6Var2.u(j6Var.f27609a);
                i15 = l6Var2;
            } else {
                i11 = 0;
                arrayList = arrayList2;
                SparseArray sparseArray = i15.f27766a0;
                if (sparseArray != null) {
                    j6Var = (org.telegram.ui.ActionBar.j6) sparseArray.get(((org.telegram.ui.ActionBar.r3) arrayList.get(z11 ? 1 : 0)).f28468e);
                } else {
                    j6Var = null;
                }
            }
            String[] strArr = new String[1];
            if (i15.f27767b != null) {
                sparseIntArray = org.telegram.ui.ActionBar.m6.T0(new File(i15.f27767b), null, strArr);
            } else {
                String str3 = i15.d;
                if (str3 != null) {
                    sparseIntArray = org.telegram.ui.ActionBar.m6.T0(null, str3, strArr);
                } else {
                    sparseIntArray = new SparseIntArray();
                }
            }
            ((org.telegram.ui.ActionBar.r3) arrayList.get(z11 ? 1 : 0)).f28470g = strArr[i11];
            if (j6Var != null) {
                SparseIntArray clone = sparseIntArray.clone();
                j6Var.d(sparseIntArray, clone);
                ig.b bVar = s3Var2.f28487c;
                if (bVar != null && !TextUtils.isEmpty(bVar.f15479b) && (l6Var = j6Var.f27610b) != null && l6Var.f27767b == null && !l6Var.q()) {
                    org.telegram.ui.ActionBar.j6.h(clone);
                }
                sparseIntArray = clone;
            }
            SparseIntArray sparseIntArray2 = org.telegram.ui.ActionBar.m6.fm;
            for (int i17 = i11; i17 < sparseIntArray2.size(); i17++) {
                int keyAt = sparseIntArray2.keyAt(i17);
                int valueAt = sparseIntArray2.valueAt(i17);
                if (sparseIntArray.indexOfKey(keyAt) < 0 && (indexOfKey = sparseIntArray.indexOfKey(valueAt)) >= 0) {
                    sparseIntArray.put(keyAt, sparseIntArray.valueAt(indexOfKey));
                }
            }
            int[] iArr = org.telegram.ui.ActionBar.m6.em;
            for (int i18 = i11; i18 < iArr.length; i18++) {
                if (sparseIntArray.indexOfKey(i18) < 0) {
                    sparseIntArray.put(i18, iArr[i18]);
                }
            }
            this.d = sparseIntArray;
        } else {
            this.d = new SparseIntArray();
            i11 = 0;
        }
        if (!TextUtils.isEmpty(org.telegram.messenger.d4.j(this.f43730g))) {
            Drawable drawable3 = this.h;
            i13 = ((org.telegram.ui.ActionBar.f2) this.G).currentAccount;
            this.h = fi.y5.f(drawable3, i13, this.f43730g, this.f43739q);
        } else if (wallPaper != null) {
            this.h = fn.d(this.h, wallPaper, this.f43739q);
        } else {
            if (s3Var2.f28485a) {
                org.telegram.ui.ActionBar.l6 d = org.telegram.ui.ActionBar.s3.d(this.f43739q);
                i12 = ((org.telegram.ui.ActionBar.f2) this.G).currentAccount;
                org.telegram.ui.ActionBar.m6.I(d, s3Var2.g(i12, this.f43739q ? 1 : 0), ((org.telegram.ui.ActionBar.r3) s3Var2.f28489f.get(this.f43739q ? 1 : 0)).f28470g, i7, i11);
                drawable2 = new ColorDrawable(-16777216);
            } else {
                int h = h(org.telegram.ui.ActionBar.m6.Be);
                int h7 = h(org.telegram.ui.ActionBar.m6.Ce);
                int h10 = h(org.telegram.ui.ActionBar.m6.De);
                int h11 = h(org.telegram.ui.ActionBar.m6.Ee);
                org.telegram.ui.Components.qa0 qa0Var2 = new org.telegram.ui.Components.qa0();
                qa0Var2.s(s3Var2.j(this.f43739q ? 1 : 0).settings.intensity, qa0Var2.f37225u);
                TLRPC.Document e10 = s3Var2.e();
                if (qa0Var2.f37228y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    qa0Var2.f37228y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = qa0Var2.f37207c;
                    if (weakReference != null) {
                        qa0Var2.f37228y.H0((View) weakReference.get());
                    }
                    if (qa0Var2.T) {
                        qa0Var2.f37228y.P();
                    }
                }
                qa0Var2.f37228y.q0(org.telegram.messenger.hc.b(e10), "80_80", null, null, null, 0);
                qa0Var2.f37228y.X(1);
                qa0Var2.f37228y.W(1);
                qa0Var2.o(h, h7, h10, h11, 0, true);
                qa0Var2.u(i7);
                int f10 = qa0Var2.f();
                boolean z12 = this.f43739q;
                ni.c cVar = new ni.c(16, this, qa0Var2);
                org.telegram.ui.ActionBar.r3 r3Var2 = (org.telegram.ui.ActionBar.r3) s3Var2.f28489f.get(z12 ? 1 : 0);
                if (r3Var2 != null && r3Var2.f28467c != null) {
                    long h12 = s3Var2.h(z12 ? 1 : 0);
                    TL_stars.StarGift starGift = r3Var2.f28467c.gift;
                    TLRPC.Document document = starGift.sticker;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList3 = starGift.attributes;
                    if (arrayList3 != null && document == null) {
                        int size = arrayList3.size();
                        z10 = z12 ? 1 : 0;
                        int i19 = 0;
                        while (true) {
                            if (i19 >= size) {
                                break;
                            }
                            TL_stars.StarGiftAttribute starGiftAttribute = arrayList3.get(i19);
                            int i20 = i19 + 1;
                            int i21 = size;
                            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                                document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                                break;
                            } else {
                                size = i21;
                                i19 = i20;
                            }
                        }
                    } else {
                        z10 = z12 ? 1 : 0;
                    }
                    TLRPC.Document document2 = document;
                    org.telegram.messenger.hc b11 = org.telegram.messenger.hc.b(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver(null);
                    imageReceiver2.f21241z1 = false;
                    imageReceiver2.q0(b11, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.f21200g1 = new di.c1(cVar, h12, 2);
                    org.telegram.messenger.gc.D().M(imageReceiver2, null);
                } else {
                    z10 = z12 ? 1 : 0;
                }
                s3Var2 = s3Var;
                s3Var2.n(this.f43739q ? 1 : 0, new org.telegram.messenger.r6(this, s3Var2, z10, qa0Var2, f10));
                drawable2 = qa0Var2;
            }
            this.h = drawable2;
        }
        AnimatorSet animatorSet = this.f43740r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z9) {
            this.f43740r = new AnimatorSet();
            if (qa0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new wm(qa0Var, 0));
                ofFloat.addListener(new ym(qa0Var));
                ofFloat.setDuration(200L);
                this.f43740r.playTogether(ofFloat);
            }
            Drawable drawable4 = this.h;
            if (drawable4 instanceof org.telegram.ui.Components.qa0) {
                org.telegram.ui.Components.qa0 qa0Var3 = (org.telegram.ui.Components.qa0) drawable4;
                qa0Var3.r(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new wm(qa0Var3, 1));
                ofFloat2.addListener(new zm(qa0Var3));
                ofFloat2.setDuration(250L);
                this.f43740r.playTogether(ofFloat2);
            }
            this.f43740r.start();
        }
        if (s3Var2 == null && this.G.f44545j6 >= 0) {
            if (org.telegram.ui.ActionBar.m6.I.q() == this.f43739q) {
                Q0 = org.telegram.ui.ActionBar.m6.I;
            } else {
                SharedPreferences sharedPreferences2 = org.telegram.messenger.t0.f25570b.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.m6.Q0(string3) != null && !org.telegram.ui.ActionBar.m6.Q0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.m6.Q0(string4) != null && org.telegram.ui.ActionBar.m6.Q0(string4).q()) {
                    str = string4;
                }
                if (this.f43739q) {
                    Q0 = org.telegram.ui.ActionBar.m6.Q0(str);
                } else {
                    Q0 = org.telegram.ui.ActionBar.m6.Q0(str2);
                }
            }
            c10 = 0;
            org.telegram.ui.ActionBar.m6.u(Q0, false, this.f43739q);
        } else {
            c10 = 0;
        }
        int i22 = org.telegram.messenger.g0.q(this.h)[c10];
        n();
        o();
        p(this.h);
        u(1.0f);
    }

    public final void t() {
        boolean z9;
        cn cnVar = this.G;
        if (cnVar.f44726xa == null && this.f43729f == null && this.f43730g == null) {
            if (cnVar.R9() && !org.telegram.messenger.iz.H0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 || this.f43741s) {
                this.f43741s = z9;
                this.f43726b.clear();
                this.f43725a.clear();
                if (z9) {
                    if (org.telegram.messenger.t0.f25570b != null) {
                        org.telegram.ui.ActionBar.m6.K(org.telegram.messenger.t0.f25570b, false);
                    }
                    n();
                    o();
                }
                p(org.telegram.ui.ActionBar.m6.t0());
                u(1.0f);
            }
        }
    }

    public final void u(float f10) {
        int i7;
        int k10;
        int i10;
        int k11;
        int i11;
        int k12;
        Bitmap bitmap;
        Bitmap bitmap2;
        int i12;
        if (!this.f43726b.isEmpty()) {
            Paint d = d("paintChatActionBackground");
            Paint d2 = d("paintChatActionBackgroundSelected");
            Paint d10 = d("paintChatMessageBackgroundSelected");
            int i13 = this.B;
            boolean R9 = this.G.R9();
            int i14 = -1;
            if (this.C) {
                k10 = -1;
            } else {
                if (R9) {
                    i7 = org.telegram.ui.ActionBar.m6.Fa;
                } else {
                    i7 = org.telegram.ui.ActionBar.m6.Wc;
                }
                k10 = k(i7, true);
            }
            if (this.C) {
                k11 = -1;
            } else {
                if (R9) {
                    i10 = org.telegram.ui.ActionBar.m6.Fa;
                } else {
                    i10 = org.telegram.ui.ActionBar.m6.Xc;
                }
                k11 = k(i10, true);
            }
            if (this.C) {
                k12 = -1;
            } else {
                if (R9) {
                    i11 = org.telegram.ui.ActionBar.m6.Ha;
                } else {
                    i11 = org.telegram.ui.ActionBar.m6.Xc;
                }
                k12 = k(i11, true);
            }
            if (!this.C) {
                if (R9) {
                    i12 = org.telegram.ui.ActionBar.m6.Ga;
                } else {
                    i12 = org.telegram.ui.ActionBar.m6.Yc;
                }
                i14 = k(i12, true);
            }
            int i15 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i15 != 0) {
                i13 = i0.a.f(f10, this.f43747z, i13);
                k10 = i0.a.f(f10, this.v, k10);
                k11 = i0.a.f(f10, this.f43744w, k11);
                k12 = i0.a.f(f10, this.f43745x, k12);
                i14 = i0.a.f(f10, this.f43746y, i14);
            }
            if (d != null && !this.C) {
                d.setColor(i13);
                d2.setColor(i13);
            }
            Paint d11 = d("paintChatActionText");
            if (d11 != null) {
                ((TextPaint) d11).linkColor = k11;
                d("paintChatActionText").setColor(k10);
                d("paintChatBotButton").setColor(k12);
            }
            org.telegram.ui.ActionBar.m6.C1(k10, getDrawable("drawableMsgStickerCheck"));
            org.telegram.ui.ActionBar.m6.C1(k10, getDrawable("drawableMsgStickerClock"));
            org.telegram.ui.ActionBar.m6.C1(k10, getDrawable("drawableMsgStickerHalfCheck"));
            org.telegram.ui.ActionBar.m6.C1(k10, getDrawable("drawableMsgStickerPinned"));
            org.telegram.ui.ActionBar.m6.C1(k10, getDrawable("drawableMsgStickerReplies"));
            org.telegram.ui.ActionBar.m6.C1(k10, getDrawable("drawableMsgStickerViews"));
            org.telegram.ui.ActionBar.m6.C1(i14, getDrawable("drawableBotInline"));
            org.telegram.ui.ActionBar.m6.C1(i14, getDrawable("drawableBotLink"));
            org.telegram.ui.ActionBar.m6.C1(i14, getDrawable("drawableBotLock"));
            org.telegram.ui.ActionBar.m6.C1(i14, getDrawable("drawable_botInvite"));
            org.telegram.ui.ActionBar.m6.C1(i14, getDrawable("drawableCommentSticker"));
            org.telegram.ui.ActionBar.m6.C1(i14, getDrawable("drawableGoIcon"));
            org.telegram.ui.ActionBar.m6.C1(i14, getDrawable("drawableReplyIcon"));
            org.telegram.ui.ActionBar.m6.C1(i14, getDrawable("drawableShareIcon"));
            if (this.f43735m != null && (bitmap = this.f43733k) != null) {
                Rect rect = this.F;
                Rect rect2 = this.E;
                if (i15 != 0 && (bitmap2 = this.A) != null) {
                    this.f43738p = false;
                    rect2.set(0, 0, bitmap2.getWidth(), this.A.getHeight());
                    rect.set(0, 0, this.f43732j.getWidth(), this.f43732j.getHeight());
                    this.f43735m.drawBitmap(this.A, rect2, rect, (Paint) null);
                    Paint paint = this.f43734l;
                    paint.setAlpha((int) (f10 * 255.0f));
                    rect2.set(0, 0, this.f43733k.getWidth(), this.f43733k.getHeight());
                    rect.set(0, 0, this.f43732j.getWidth(), this.f43732j.getHeight());
                    this.f43735m.drawBitmap(this.f43733k, rect2, rect, paint);
                    if (d != null) {
                        d.setShader(this.f43736n);
                        d2.setShader(this.f43736n);
                    }
                    if (d10 != null) {
                        d10.setShader(this.f43736n);
                        return;
                    }
                    return;
                }
                this.f43738p = true;
                rect2.set(0, 0, bitmap.getWidth(), this.f43733k.getHeight());
                rect.set(0, 0, this.f43732j.getWidth(), this.f43732j.getHeight());
                this.f43735m.drawBitmap(this.f43733k, rect2, rect, (Paint) null);
                if (d != null) {
                    d.setShader(this.f43737o);
                    d2.setShader(this.f43737o);
                }
                if (d10 != null) {
                    d10.setShader(this.f43737o);
                }
            }
        }
    }
}
