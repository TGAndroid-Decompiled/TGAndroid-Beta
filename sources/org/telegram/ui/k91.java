package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Scroller;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
public class k91 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.z5, org.telegram.messenger.vs {
    public FrameLayout A0;
    public b91 A1;
    public org.telegram.ui.Components.q30 B0;
    public b91 B1;
    public AnimatorSet C0;
    public Object C1;
    public final int D;
    public ig.s D0;
    public Bitmap D1;
    public final int E;
    public j81 E0;
    public boolean E1;
    public final int F;
    public j81 F0;
    public boolean F1;
    public final int G;
    public ImageView G0;
    public boolean G1;
    public final int H;
    public ImageView H0;
    public String H1;
    public final boolean I;
    public AnimatorSet I0;
    public int I1;
    public final long J;
    public AnimatorSet J0;
    public j91 J1;
    public final long K;
    public org.telegram.ui.Components.y71[] K0;
    public long K1;
    public final long L;
    public org.telegram.ui.Components.y71[] L0;
    public boolean L1;
    public final long M;
    public final FrameLayout[] M0;
    public boolean M1;
    public final float N;
    public final TextView[] N0;
    public boolean N1;
    public final String O;
    public final TextView[] O0;
    public org.telegram.ui.Components.ci0 O1;
    public final int P;
    public final FrameLayout[] P0;
    public org.telegram.ui.ActionBar.t0 P1;
    public long Q;
    public u71 Q0;
    public ValueAnimator Q1;
    public y80 R;
    public i91 R0;
    public jg.b1 R1;
    public final org.telegram.ui.ActionBar.a6 S;
    public s4.a0 S0;
    public i81 S1;
    public final org.telegram.ui.ActionBar.a6 T;
    public org.telegram.ui.Cells.p4 T0;
    public final org.telegram.ui.Components.p10 T1;
    public final org.telegram.ui.ActionBar.a6 U;
    public org.telegram.ui.Cells.h0 U0;
    public boolean U1;
    public final org.telegram.ui.ActionBar.a6 V;
    public ArrayList V0;
    public boolean V1;
    public org.telegram.ui.Components.cq W;
    public final HashMap W0;
    public TL_stories.TL_premium_boostsStatus W1;
    public int X;
    public TLRPC.TL_wallPaper X0;
    public float X1;
    public int Y;
    public TLRPC.TL_wallPaper Y0;
    public float Y1;
    public final Runnable Z;
    public TLRPC.TL_wallPaper Z0;
    public float Z1;
    public final l81 f38712a;
    public boolean f38713a0;
    public int f38714a1;
    public float a2;
    public final int f38715b;
    public kg.f0 f38716b0;
    public int f38717b1;
    public boolean f38718b2;
    public Scroller f38719c;
    public FrameLayout f38720c0;
    public int f38721c1;
    public int f38722c2;
    public final boolean d;
    public TextView f38723d0;
    public int f38724d1;
    public ValueAnimator f38725d2;
    public org.telegram.ui.Components.tl e;
    public TextView f38726e0;
    public int f38727e1;
    public boolean f38728e2;
    public org.telegram.ui.ActionBar.t0 f38729f;
    public final org.telegram.ui.ActionBar.s6 f38730f0;
    public int f38731f1;
    public TextView f38732f2;
    public final boolean f38733g0;
    public int f38734g1;
    public WeakReference f38735g2;
    public TextView h;
    public final boolean f38736h0;
    public int f38737h1;
    public BitmapDrawable f38738h2;
    public final boolean f38739i0;
    public int f38740i1;
    public ic f38741i2;
    public ArrayList f38742j0;
    public int f38743j1;
    public float f38744j2;
    public z4.g f38745k0;
    public int f38746k1;
    public ValueAnimator f38747k2;
    public fg.i f38748l0;
    public int l1;
    public UndoView m0;
    public float f38749m1;
    public int f38750n;
    public FrameLayout f38751n0;
    public float f38752n1;
    public org.telegram.ui.Components.uk0 f38753o0;
    public float f38754o1;
    public fg.j f38755p0;
    public float f38756p1;
    public org.telegram.ui.Components.f10 f38757q0;
    public c91 f38758q1;
    public Drawable f38759r;
    public org.telegram.messenger.kj f38760r0;
    public org.telegram.ui.Components.dq f38761r1;
    public int f38762s;
    public boolean f38763s0;
    public AnimatorSet f38764s1;
    public org.telegram.ui.ActionBar.l f38765t0;
    public final PorterDuff.Mode f38766t1;
    public org.telegram.ui.ActionBar.m0 f38767u0;
    public int f38768u1;
    public g81 f38769v0;
    public org.telegram.ui.Components.a9 f38770v1;
    public final org.telegram.ui.ActionBar.r6 f38771w;
    public g91 f38772w0;
    public org.telegram.ui.Components.a81 f38773w1;
    public boolean f38774x;
    public final a91[] f38775x0;
    public Bitmap f38776x1;
    public final int f38777y;
    public a91 f38778y0;
    public Bitmap f38779y1;
    public FrameLayout f38780z0;
    public float f38781z1;

    public k91(Object obj, Bitmap bitmap, boolean z10) {
        super(null);
        this.f38712a = new l81(this);
        this.d = true;
        this.f38750n = 1;
        org.telegram.ui.ActionBar.a6 a6Var = new org.telegram.ui.ActionBar.a6(this, 0, false);
        this.S = a6Var;
        org.telegram.ui.ActionBar.a6 a6Var2 = new org.telegram.ui.ActionBar.a6(this, 0, true);
        this.T = a6Var2;
        org.telegram.ui.ActionBar.a6 a6Var3 = new org.telegram.ui.ActionBar.a6(this, 1, false);
        this.U = a6Var3;
        org.telegram.ui.ActionBar.a6 a6Var4 = new org.telegram.ui.ActionBar.a6(this, 1, true);
        this.V = a6Var4;
        this.Y = -1;
        this.Z = new y71(this, 0);
        this.f38775x0 = new a91[2];
        this.M0 = new FrameLayout[2];
        this.N0 = new TextView[2];
        this.O0 = new TextView[2];
        this.P0 = new FrameLayout[2];
        this.W0 = new HashMap();
        this.f38749m1 = 0.5f;
        this.f38754o1 = 0.0f;
        this.f38766t1 = PorterDuff.Mode.SRC_IN;
        this.f38781z1 = 1.0f;
        this.H1 = "640_360";
        this.I1 = 1920;
        this.L1 = true;
        this.T1 = new org.telegram.ui.Components.p10(getParentActivity(), new n81(this));
        this.U1 = false;
        this.V1 = false;
        this.f38715b = 2;
        this.C1 = obj;
        this.D1 = bitmap;
        this.E1 = z10;
        if (obj instanceof ke1) {
            ke1 ke1Var = (ke1) obj;
            this.F1 = ke1Var.f38865j;
            TLRPC.TL_wallPaper tL_wallPaper = ke1Var.f38863g;
            this.X0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f7 = ke1Var.h;
                this.f38749m1 = f7;
                if (f7 < 0.0f && !org.telegram.ui.ActionBar.t6.I.q()) {
                    this.f38749m1 *= -1.0f;
                }
            }
        }
        a6Var.v = true;
        a6Var3.v = true;
        a6Var2.v = true;
        a6Var4.v = true;
    }

    public static void Z(k91 k91Var, org.telegram.messenger.h3 h3Var) {
        if (k91Var.getParentActivity() == null) {
            return;
        }
        kg.q0 q0Var = new kg.q0(23, k91Var.currentAccount, k91Var.getParentActivity(), k91Var, k91Var.f38712a);
        q0Var.A1(h3Var);
        q0Var.z1(k91Var.W1, true);
        q0Var.B1(k91Var.K1);
        if (!k91Var.Z0()) {
            q0Var.I2 = new y71(k91Var, 1);
        }
        k91Var.showDialog(q0Var);
    }

    public static void a0(k91 k91Var) {
        org.telegram.ui.ActionBar.r6 k10;
        org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.M;
        if (s6Var == null) {
            return;
        }
        int i10 = s6Var.Z;
        if (i10 >= 0) {
            k10 = (org.telegram.ui.ActionBar.r6) s6Var.f20803a0.get(i10);
        } else {
            k10 = s6Var.k(false);
        }
        if (k91Var.f38771w != null) {
            k91Var.b1();
            org.telegram.ui.ActionBar.t6.z1(k91Var.f38730f0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.t6.M != null) {
                org.telegram.ui.ActionBar.t6.O = false;
                org.telegram.ui.ActionBar.t6.P = false;
                org.telegram.ui.ActionBar.t6.M = null;
            }
            org.telegram.ui.ActionBar.t6.u(k91Var.f38730f0, true, k91Var.f38733g0);
            ((ActionBarLayout) k91Var.parentLayout).W(false, false);
        } else {
            ((ActionBarLayout) k91Var.parentLayout).W(false, false);
            File file = new File(k91Var.f38730f0.f20804b);
            org.telegram.ui.ActionBar.s6 s6Var2 = k91Var.f38730f0;
            org.telegram.ui.ActionBar.t6.v(file, s6Var2.f20802a, s6Var2.F, false);
            org.telegram.messenger.wp.r1(k91Var.f38730f0.E).u4(k91Var.f38730f0, null, false, false);
            SharedPreferences.Editor edit = org.telegram.messenger.w0.f18945b.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", k91Var.f38730f0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) k91Var.getParentLayout().getFragmentStack().get(Math.max(0, k91Var.getParentLayout().getFragmentStack().size() - 2));
        k91Var.finishFragment();
        if (k91Var.f38715b == 0) {
            org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14765p4, s6Var, k10, Boolean.valueOf(k91Var.f38739i0));
        }
        org.telegram.ui.ActionBar.t6.M1(k2Var);
    }

    public static void b0(k91 k91Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = k91Var.W0;
        org.telegram.ui.ActionBar.r6 r6Var = k91Var.f38771w;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            k91Var.V0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_wallPapers.wallpapers.get(i10) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i10);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f19800id))) {
                            k91Var.V0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.f19800id), tL_wallPaper2);
                        }
                        if (r6Var != null && (str = r6Var.f20742o) != null && str.equals(tL_wallPaper2.slug)) {
                            k91Var.X0 = tL_wallPaper2;
                            k91Var.g1(false);
                            k91Var.o1();
                        } else if (r6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = k91Var.X0;
                            if (tL_wallPaper3 != null) {
                                String str2 = tL_wallPaper3.slug;
                                if (str2 != null) {
                                    if (!str2.equals(tL_wallPaper2.slug)) {
                                    }
                                }
                            }
                        }
                        z10 = true;
                    }
                }
            }
            if (!z10 && (tL_wallPaper = k91Var.X0) != null) {
                k91Var.V0.add(0, tL_wallPaper);
            }
            i91 i91Var = k91Var.R0;
            if (i91Var != null) {
                i91Var.f();
            }
            org.telegram.messenger.is.a0(k91Var.currentAccount).p1(1, tL_wallPapers.wallpapers);
        }
        if (k91Var.X0 == null && r6Var != null && !TextUtils.isEmpty(r6Var.f20742o)) {
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = r6Var.f20742o;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(k91Var.currentAccount).bindRequestToGuid(k91Var.getConnectionsManager().sendRequest(getwallpaper, new e81(k91Var, 0)), k91Var.classGuid);
        }
    }

    @Override
    public final void D(boolean z10) {
        o1();
    }

    @Override
    public final void N(String str) {
        o1();
    }

    public final void Q0() {
        AnimatorSet animatorSet = this.C0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.C0 = animatorSet2;
        if (this.F1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f38778y0, View.SCALE_X, this.f38781z1), ObjectAnimator.ofFloat(this.f38778y0, View.SCALE_Y, this.f38781z1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f38778y0, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f38778y0, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f38778y0, View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f38778y0, View.TRANSLATION_Y, 0.0f));
        }
        this.C0.setInterpolator(org.telegram.ui.Components.gr.f26524g);
        this.C0.addListener(new p81(this, 1));
        this.C0.start();
    }

    public final void R0(boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k91.R0(boolean):void");
    }

    public final void S0(boolean z10) {
        int i10 = this.f38715b;
        if (i10 == 2) {
            if (!z10) {
                finishFragment();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.t6.p();
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14831z4);
        org.telegram.ui.ActionBar.r6 r6Var = this.f38771w;
        if (i10 == 1) {
            if (this.f38736h0) {
                r6Var.f20733c = this.f38777y;
                r6Var.d = this.D;
                r6Var.e = this.E;
                r6Var.f20734f = this.F;
                r6Var.f20735g = this.G;
                r6Var.h = this.H;
                r6Var.f20736i = this.I;
                r6Var.f20737j = this.J;
                r6Var.f20738k = this.K;
                r6Var.f20739l = this.L;
                r6Var.f20740m = this.M;
                r6Var.f20741n = this.P;
                r6Var.f20742o = this.O;
                r6Var.f20743p = this.N;
            }
            org.telegram.ui.ActionBar.t6.z1(this.f38730f0, false, true, false, false, false);
        } else {
            if (r6Var != null) {
                org.telegram.ui.ActionBar.t6.z1(this.f38730f0, false, this.f38739i0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).W(false, false);
            if (this.f38739i0) {
                org.telegram.ui.ActionBar.s6 s6Var = this.f38730f0;
                if (s6Var.f20804b != null && org.telegram.ui.ActionBar.t6.H.get(s6Var.m()) == null) {
                    new File(s6Var.f20804b).delete();
                }
            }
        }
        if (!z10) {
            finishFragment();
        }
    }

    public final BitmapDrawable T0(Drawable drawable) {
        WeakReference weakReference = this.f38735g2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.f38738h2;
        }
        WeakReference weakReference2 = this.f38735g2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f38735g2 = null;
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            this.f38735g2 = new WeakReference(drawable);
            int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, intrinsicWidth, 24);
            ColorFilter colorFilter = drawable.getColorFilter();
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.3f);
            org.telegram.messenger.i0.n2(colorMatrix, 0.94f);
            drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            drawable.draw(new Canvas(createBitmap));
            drawable.setColorFilter(colorFilter);
            Utilities.blurBitmap(createBitmap, 3);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getParentActivity().getResources(), createBitmap);
            this.f38738h2 = bitmapDrawable;
            bitmapDrawable.setFilterBitmap(true);
            return this.f38738h2;
        }
        this.f38738h2 = null;
        return null;
    }

    public final boolean U0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k91.U0(boolean):boolean");
    }

    public final void V0() {
        int themedColor;
        org.telegram.ui.Components.tl tlVar = this.e;
        int i10 = 0;
        if (tlVar != null) {
            tlVar.H(getThemedColor(org.telegram.ui.ActionBar.t6.G8));
            this.e.O(getThemedColor(org.telegram.ui.ActionBar.t6.E8), false);
        }
        if (this.f38759r != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6)) != this.f38762s) {
            this.f38762s = themedColor;
            this.f38759r.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        ig.s sVar = this.D0;
        if (sVar != null) {
            sVar.invalidate();
        }
        if (this.f38758q1 != null) {
            org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
            if (z4Var != null && z4Var.getBottomSheet() != null) {
                this.parentLayout.getBottomSheet().P(getThemedColor(org.telegram.ui.ActionBar.t6.f21002h5));
                if (this.f38715b == 2 && this.K1 != 0) {
                    this.parentLayout.getBottomSheet().E0(-16777216);
                }
            } else {
                setNavigationBarColor(getThemedColor(org.telegram.ui.ActionBar.t6.f21002h5));
            }
        }
        if (this.K0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.y71[] y71VarArr = this.K0;
                if (i11 >= y71VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.y71 y71Var = y71VarArr[i11];
                if (y71Var != null) {
                    y71Var.invalidate();
                }
                i11++;
            }
        }
        if (this.L0 != null) {
            while (true) {
                org.telegram.ui.Components.y71[] y71VarArr2 = this.L0;
                if (i10 >= y71VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.y71 y71Var2 = y71VarArr2[i10];
                if (y71Var2 != null) {
                    y71Var2.invalidate();
                }
                i10++;
            }
        }
        TextView textView = this.f38732f2;
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, this.f38712a);
        }
        org.telegram.ui.Components.cq cqVar = this.W;
        if (cqVar != null) {
            cqVar.invalidate();
        }
        org.telegram.ui.Components.f10 f10Var = this.f38757q0;
        if (f10Var != null) {
            f10Var.updateColors();
        }
    }

    public final int W0() {
        if (org.telegram.messenger.w3.U(this.currentAccount, -this.K1)) {
            return getMessagesController().f19269v5;
        }
        return getMessagesController().A5;
    }

    public final ArrayList X0() {
        g6 g6Var = new g6(23, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38745k0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21207s8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38765t0, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38765t0, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.E8));
        org.telegram.ui.Components.cq cqVar = this.W;
        if (cqVar != null) {
            org.telegram.ui.ActionBar.t0 t0Var = cqVar.I;
            EditTextBoldCursor[] editTextBoldCursorArr = cqVar.E;
            for (int i10 = 0; i10 < editTextBoldCursorArr.length; i10++) {
                arrayList.add(new org.telegram.ui.ActionBar.c7(editTextBoldCursorArr[i10], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(editTextBoldCursorArr[i10], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21059k6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(editTextBoldCursorArr[i10], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21077l6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.c7(cqVar.F, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.I5));
            if (t0Var != null) {
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(cqVar, 2);
                arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, org.telegram.ui.ActionBar.t6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, org.telegram.ui.ActionBar.t6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, org.telegram.ui.ActionBar.t6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, org.telegram.ui.ActionBar.t6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.M0;
        if (frameLayoutArr != null) {
            for (int i11 = 0; i11 < frameLayoutArr.length; i11++) {
            }
            for (int i12 = 0; i12 < this.P0.length; i12++) {
            }
            for (int i13 = 0; i13 < this.O0.length; i13++) {
            }
            for (int i14 = 0; i14 < this.N0.length; i14++) {
            }
            org.telegram.ui.ActionBar.a6 a6Var = this.S;
            org.telegram.ui.ActionBar.a6 a6Var2 = this.U;
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38769v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{a6Var, a6Var2}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21192rb));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38769v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{a6Var, a6Var2}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21210sb));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38769v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{a6Var, a6Var2}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21229tb));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38769v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Kd));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38769v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Qb));
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            ((org.telegram.ui.ActionBar.c7) arrayList.get(i15)).f20243n = this.f38712a;
        }
        return arrayList;
    }

    public final boolean Y0(int i10) {
        int E0;
        long j10;
        if (this.f38736h0) {
            return false;
        }
        org.telegram.ui.ActionBar.r6 r6Var = this.f38771w;
        if (i10 == 1 || i10 == 2) {
            long j11 = this.J;
            if (j11 != 0) {
                if (j11 != r6Var.f20737j) {
                    return true;
                }
            } else {
                int E02 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Be);
                int i11 = (int) r6Var.f20737j;
                if (i11 == 0) {
                    i11 = E02;
                }
                if (i11 != E02) {
                    return true;
                }
            }
            long j12 = this.K;
            int i12 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
            long j13 = this.M;
            long j14 = this.L;
            if (i12 == 0 && j14 == 0 && j13 == 0) {
                for (int i13 = 0; i13 < 3; i13++) {
                    if (i13 == 0) {
                        E0 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ce);
                        j10 = r6Var.f20738k;
                    } else if (i13 == 1) {
                        E0 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.De);
                        j10 = r6Var.f20739l;
                    } else {
                        E0 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ee);
                        j10 = r6Var.f20740m;
                    }
                    int i14 = (int) j10;
                    if (i14 == 0 && j10 != 0) {
                        i14 = 0;
                    } else if (i14 == 0) {
                        i14 = E0;
                    }
                    if (i14 != E0) {
                        return true;
                    }
                }
            } else if (j12 != r6Var.f20738k || j14 != r6Var.f20739l || j13 != r6Var.f20740m) {
                return true;
            }
            if (r6Var.f20741n != this.P) {
                return true;
            }
        }
        if (i10 == 1 || i10 == 3) {
            if (this.f38777y != r6Var.d) {
                return true;
            }
            int i15 = this.E;
            if (i15 != 0) {
                if (i15 != r6Var.e) {
                    return true;
                }
            } else {
                int i16 = r6Var.e;
                if (i16 != 0 && i16 != r6Var.f20733c) {
                    return true;
                }
            }
            int i17 = this.F;
            if (i17 != 0) {
                if (i17 != r6Var.f20734f) {
                    return true;
                }
            } else if (r6Var.f20734f != 0) {
                return true;
            }
            int i18 = this.G;
            if (i18 != 0) {
                if (i18 != r6Var.f20735g) {
                    return true;
                }
            } else if (r6Var.f20735g != 0) {
                return true;
            }
            int i19 = this.H;
            if (i19 != 0) {
                if (i19 != r6Var.h) {
                    return true;
                }
            } else if (r6Var.h != 0) {
                return true;
            }
            if (this.I != r6Var.f20736i) {
                return true;
            }
        }
        return false;
    }

    public boolean Z0() {
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && z4Var.getBottomSheet() != null) {
            return true;
        }
        return false;
    }

    public final void a1() {
        float f7;
        jg.b1 b1Var = this.R1;
        if (b1Var != null) {
            b1Var.invalidate();
        }
        FrameLayout frameLayout = this.f38780z0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f38780z0.getChildAt(i10).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.A0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                this.A0.getChildAt(i11).invalidate();
            }
        }
        if (this.K0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.y71[] y71VarArr = this.K0;
                if (i12 >= y71VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.y71 y71Var = y71VarArr[i12];
                if (y71Var != null) {
                    if (this.N1) {
                        f7 = this.f38754o1 * this.f38756p1;
                    } else {
                        f7 = 0.0f;
                    }
                    y71Var.setDimAmount(f7);
                    this.K0[i12].invalidate();
                }
                i12++;
            }
        }
        if (this.f38753o0 != null) {
            for (int i13 = 0; i13 < this.f38753o0.getChildCount(); i13++) {
                View childAt = this.f38753o0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.s0) {
                    i1((org.telegram.ui.Cells.s0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.f38769v0 != null) {
            for (int i14 = 0; i14 < this.f38769v0.getChildCount(); i14++) {
                View childAt2 = this.f38769v0.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.s0) {
                    i1((org.telegram.ui.Cells.s0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        b91 b91Var = this.A1;
        if (b91Var != null) {
            b91Var.invalidate();
        }
        b91 b91Var2 = this.B1;
        if (b91Var2 != null) {
            b91Var2.invalidate();
        }
        ig.s sVar = this.D0;
        if (sVar != null) {
            sVar.invalidate();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21002h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20898bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20919ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20900be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20991gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21317yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21175qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21157pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21140ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21228ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21191ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Hj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B8));
    }

    public final void b1() {
        org.telegram.ui.ActionBar.r6 r6Var = this.f38771w;
        if (r6Var != null && !TextUtils.isEmpty(r6Var.f20742o)) {
            try {
                File e = r6Var.e();
                Drawable background = this.f38778y0.getBackground();
                Bitmap n10 = this.f38778y0.getImageReceiver().n();
                if (background instanceof org.telegram.ui.Components.jb0) {
                    FileOutputStream fileOutputStream = new FileOutputStream(e);
                    n10.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                    fileOutputStream.close();
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(n10.getWidth(), n10.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                background.setBounds(0, 0, n10.getWidth(), n10.getHeight());
                background.draw(canvas);
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(this.f38746k1, this.f38766t1));
                paint.setAlpha((int) (this.f38749m1 * 255.0f));
                canvas.drawBitmap(n10, 0.0f, 0.0f, paint);
                FileOutputStream fileOutputStream2 = new FileOutputStream(e);
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
                fileOutputStream2.close();
            } catch (Throwable th2) {
                org.telegram.messenger.f8.g(th2, true);
            }
        }
    }

    public final void c1() {
        d1(2, true);
    }

    @Override
    public final android.view.View createView(android.content.Context r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k91.createView(android.content.Context):android.view.View");
    }

    public final void d1(int i10, boolean z10) {
        org.telegram.ui.ActionBar.r6 r6Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (getParentActivity() != null && this.f38750n != i10 && this.f38764s1 == null && (r6Var = this.f38771w) != null) {
            if (z10 && i10 == 2 && (org.telegram.ui.ActionBar.t6.c1() || r6Var.f20737j == 4294967296L)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String L0 = org.telegram.messenger.dd.L0(2131752550, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                if (org.telegram.ui.ActionBar.t6.c1() && (!org.telegram.ui.ActionBar.t6.c1() || org.telegram.ui.ActionBar.t6.I.f20814i0.d == 0)) {
                    x1Var.T = org.telegram.messenger.dd.L0(2131752529, null);
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752552, null), new a81(this, 7));
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                } else {
                    x1Var.T = org.telegram.messenger.dd.L0(2131752549, null);
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131746135, null), new a81(this, 5));
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131751771, null), new a81(this, 6));
                }
                showDialog(x1Var);
                return;
            }
            int i18 = this.f38750n;
            this.f38750n = i10;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        this.h.setText(org.telegram.messenger.dd.L0(2131752014, null));
                        if (r6Var.f20734f != 0) {
                            if (r6Var.h != 0) {
                                i17 = 4;
                            } else if (r6Var.f20735g != 0) {
                                i17 = 3;
                            } else {
                                i17 = 2;
                            }
                        } else {
                            i17 = 1;
                        }
                        org.telegram.ui.Components.cq cqVar = this.W;
                        Y0(3);
                        cqVar.f(2, 4, i17, true);
                        this.W.e(r6Var.h, 3);
                        this.W.e(r6Var.f20735g, 2);
                        this.W.e(r6Var.f20734f, 1);
                        org.telegram.ui.Components.cq cqVar2 = this.W;
                        int i19 = r6Var.e;
                        if (i19 == 0) {
                            i19 = r6Var.f20733c;
                        }
                        cqVar2.e(i19, 0);
                        this.L0[1].b(0, r6Var.e);
                        this.L0[1].b(1, r6Var.f20734f);
                        this.L0[1].b(2, r6Var.f20735g);
                        this.L0[1].b(3, r6Var.h);
                        if (r6Var.f20735g != 0) {
                            if (i18 == 1) {
                                this.f38772w0.i(0);
                            } else {
                                this.f38772w0.g(0);
                            }
                        } else if (i18 == 2) {
                            this.f38772w0.s(0);
                        }
                        this.f38769v0.w0(0, org.telegram.messenger.i0.L(60.0f), null);
                        j1();
                    }
                    i11 = i18;
                } else {
                    this.h.setText(org.telegram.messenger.dd.L0(2131752016, null));
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.Be);
                    int i20 = org.telegram.ui.ActionBar.t6.Ce;
                    if (org.telegram.ui.ActionBar.t6.f1(i20)) {
                        i13 = getThemedColor(i20);
                    } else {
                        i13 = 0;
                    }
                    int i21 = org.telegram.ui.ActionBar.t6.De;
                    if (org.telegram.ui.ActionBar.t6.f1(i21)) {
                        i14 = getThemedColor(i21);
                    } else {
                        i14 = 0;
                    }
                    int i22 = org.telegram.ui.ActionBar.t6.Ee;
                    if (org.telegram.ui.ActionBar.t6.f1(i22)) {
                        i15 = getThemedColor(i22);
                    } else {
                        i15 = 0;
                    }
                    long j10 = r6Var.f20738k;
                    int i23 = (int) j10;
                    if (i23 == 0 && j10 != 0) {
                        i13 = 0;
                    }
                    long j11 = r6Var.f20739l;
                    int i24 = (int) j11;
                    if (i24 == 0 && j11 != 0) {
                        i14 = 0;
                    }
                    long j12 = r6Var.f20740m;
                    int i25 = (int) j12;
                    if (i25 == 0 && j12 != 0) {
                        i15 = 0;
                    }
                    int i26 = (int) r6Var.f20737j;
                    if (i23 == 0 && i13 == 0) {
                        i16 = 1;
                    } else if (i25 == 0 && i15 == 0) {
                        if (i24 == 0 && i14 == 0) {
                            i16 = 2;
                        } else {
                            i16 = 3;
                        }
                    } else {
                        i16 = 4;
                    }
                    org.telegram.ui.Components.cq cqVar3 = this.W;
                    Y0(2);
                    cqVar3.f(2, 4, i16, false);
                    org.telegram.ui.Components.cq cqVar4 = this.W;
                    if (i25 == 0) {
                        i25 = i15;
                    }
                    cqVar4.e(i25, 3);
                    org.telegram.ui.Components.cq cqVar5 = this.W;
                    if (i24 == 0) {
                        i24 = i14;
                    }
                    cqVar5.e(i24, 2);
                    org.telegram.ui.Components.cq cqVar6 = this.W;
                    if (i23 == 0) {
                        i23 = i13;
                    }
                    cqVar6.e(i23, 1);
                    org.telegram.ui.Components.cq cqVar7 = this.W;
                    if (i26 != 0) {
                        themedColor = i26;
                    }
                    cqVar7.e(themedColor, 0);
                    i11 = i18;
                    if (i11 != 1 && r6Var.f20735g != 0) {
                        this.f38772w0.g(0);
                    } else {
                        this.f38772w0.i(0);
                    }
                    this.f38769v0.w0(0, org.telegram.messenger.i0.L(60.0f), null);
                }
            } else {
                i11 = i18;
                this.h.setText(org.telegram.messenger.dd.L0(2131752015, null));
                if (r6Var.d != 0) {
                    i12 = 2;
                } else {
                    i12 = 1;
                }
                org.telegram.ui.Components.cq cqVar8 = this.W;
                Y0(1);
                cqVar8.f(1, 2, i12, false);
                this.W.e(r6Var.f20733c, 0);
                int i27 = r6Var.d;
                if (i27 != 0) {
                    this.W.e(i27, 1);
                }
                if (i11 == 2 || (i11 == 3 && r6Var.f20735g != 0)) {
                    this.f38772w0.s(0);
                }
            }
            if (i10 != 1 && i10 != 3) {
                this.W.setMinBrightness(0.0f);
                this.W.setMaxBrightness(1.0f);
                return;
            }
            if (i11 == 2 && this.M0[1].getVisibility() == 0) {
                k1(0, true, true);
            }
            if (i10 == 1) {
                if (this.f38730f0.q()) {
                    this.W.setMinBrightness(0.2f);
                    return;
                }
                this.W.setMinBrightness(0.05f);
                this.W.setMaxBrightness(0.8f);
                return;
            }
            this.W.setMinBrightness(0.0f);
            this.W.setMaxBrightness(1.0f);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i10 == org.telegram.messenger.at.f14764p3) {
            if (this.K1 == ((Long) objArr[2]).longValue()) {
                this.W1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                m1(true);
            }
        } else if (i10 == org.telegram.messenger.at.f14726i4) {
            org.telegram.ui.Components.uk0 uk0Var = this.f38753o0;
            if (uk0Var != null) {
                int childCount = uk0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f38753o0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.v2) {
                        ((org.telegram.ui.Cells.v2) childAt).i0(0, true);
                    }
                }
            }
        } else if (i10 == org.telegram.messenger.at.f14732j4) {
            g81 g81Var = this.f38769v0;
            if (g81Var != null) {
                g81Var.g1();
            }
        } else if (i10 == org.telegram.messenger.at.f14831z4) {
            if (this.f38767u0 != null) {
                g1(true);
            }
        } else if (i10 == org.telegram.messenger.at.f14708f4) {
            Object obj = this.C1;
            if (obj instanceof le1) {
                le1 le1Var = (le1) obj;
                if (le1Var.f39263a == null) {
                    le1Var.f39263a = (String) objArr[0];
                }
            }
        } else {
            long j10 = 0;
            if (i10 == org.telegram.messenger.at.f14702e4) {
                ArrayList arrayList = (ArrayList) objArr[0];
                this.V0.clear();
                HashMap hashMap = this.W0;
                hashMap.clear();
                int size = arrayList.size();
                boolean z10 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i13);
                    if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                        TLRPC.Document document = wallPaper.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f19800id))) {
                            this.V0.add(wallPaper);
                            hashMap.put(Long.valueOf(wallPaper.document.f19800id), wallPaper);
                        }
                        org.telegram.ui.ActionBar.r6 r6Var = this.f38771w;
                        if (r6Var != null && (str = r6Var.f20742o) != null && str.equals(wallPaper.slug)) {
                            this.X0 = (TLRPC.TL_wallPaper) wallPaper;
                            g1(false);
                            o1();
                        } else if (r6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper2 = this.X0;
                            if (tL_wallPaper2 != null) {
                                String str2 = tL_wallPaper2.slug;
                                if (str2 != null) {
                                    if (!str2.equals(wallPaper.slug)) {
                                    }
                                }
                            }
                        }
                        z10 = true;
                    }
                }
                if (!z10 && (tL_wallPaper = this.X0) != null) {
                    this.V0.add(0, tL_wallPaper);
                }
                i91 i91Var = this.R0;
                if (i91Var != null) {
                    i91Var.f();
                }
                int size2 = arrayList.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i14);
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        j10 = org.telegram.messenger.vi.p(j10, wallPaper2.f19948id);
                    }
                }
                TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
                getwallpapers.hash = j10;
                ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new e81(this, 1)), this.classGuid);
            } else if (i10 == org.telegram.messenger.at.f14799u5 && this.K1 != 0) {
                finishFragment();
            }
        }
    }

    public final void e1(int i10) {
        TLRPC.TL_wallPaper tL_wallPaper;
        if (i10 >= 0 && i10 < this.V0.size()) {
            tL_wallPaper = (TLRPC.TL_wallPaper) this.V0.get(i10);
        } else {
            tL_wallPaper = this.Z0;
        }
        TLRPC.TL_wallPaper tL_wallPaper2 = tL_wallPaper;
        if (tL_wallPaper2 == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f38725d2;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f38725d2.cancel();
        }
        a91[] a91VarArr = this.f38775x0;
        a91 a91Var = a91VarArr[0];
        a91 a91Var2 = a91VarArr[1];
        a91VarArr[0] = a91Var2;
        a91VarArr[1] = a91Var;
        this.f38767u0.removeView(a91Var2);
        this.f38767u0.addView(a91VarArr[0], this.f38767u0.indexOfChild(a91VarArr[1]) + 1);
        a91 a91Var3 = a91VarArr[0];
        this.f38778y0 = a91Var3;
        a91Var3.setBackground(a91VarArr[1].getBackground());
        p1();
        a91VarArr[1].setVisibility(0);
        a91VarArr[1].setAlpha(1.0f);
        this.f38778y0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f38725d2 = ofFloat;
        ofFloat.addUpdateListener(new cj(2, this));
        this.f38725d2.addListener(new p81(this, 0));
        this.f38725d2.setInterpolator(org.telegram.ui.Components.gr.f26523f);
        this.f38725d2.setDuration(300L);
        this.f38725d2.start();
        this.f38778y0.getImageReceiver().f14408s1 = 300;
        this.f38778y0.getImageReceiver().r0(org.telegram.messenger.jc.b(tL_wallPaper2.document), this.H1, null, null, null, tL_wallPaper2.document.size, "jpg", tL_wallPaper2, 1);
        this.f38778y0.d();
        this.X0 = tL_wallPaper2;
        this.F1 = this.K0[2].f32768s;
        o1();
    }

    public final void f1(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.jb0 jb0Var;
        if (i11 == 0) {
            this.f38714a1 = i10;
        } else if (i11 == 1) {
            this.f38721c1 = i10;
        } else if (i11 == 2) {
            this.f38724d1 = i10;
        } else if (i11 == 3) {
            this.f38727e1 = i10;
        }
        r1(z10);
        if (this.K0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.y71[] y71VarArr = this.K0;
                if (i12 >= y71VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.y71 y71Var = y71VarArr[i12];
                if (y71Var != null) {
                    y71Var.b(i11, i10);
                }
                i12++;
            }
        }
        if (this.f38724d1 != 0) {
            if (this.U0 != null && org.telegram.ui.ActionBar.t6.I.q()) {
                this.U0.setTwoSided(true);
            }
            Drawable background = this.f38778y0.getBackground();
            if (background instanceof org.telegram.ui.Components.jb0) {
                jb0Var = (org.telegram.ui.Components.jb0) background;
            } else {
                jb0Var = new org.telegram.ui.Components.jb0();
                jb0Var.q(this.f38778y0);
                if (this.E1) {
                    jb0Var.m(false);
                }
            }
            jb0Var.n(this.f38714a1, this.f38721c1, this.f38724d1, this.f38727e1);
            this.f38778y0.setBackground(jb0Var);
            this.f38746k1 = jb0Var.f();
            this.l1 = 754974720;
        } else if (this.f38721c1 != 0) {
            this.f38778y0.setBackground(new GradientDrawable(org.telegram.ui.Components.f9.d(this.f38740i1), new int[]{this.f38714a1, this.f38721c1}));
            int V0 = org.telegram.messenger.i0.V0(org.telegram.messenger.i0.w0(this.f38714a1, this.f38721c1), false);
            this.l1 = V0;
            this.f38746k1 = V0;
        } else {
            this.f38778y0.setBackgroundColor(this.f38714a1);
            int V02 = org.telegram.messenger.i0.V0(this.f38714a1, false);
            this.l1 = V02;
            this.f38746k1 = V02;
        }
        int i13 = org.telegram.ui.ActionBar.t6.Zc;
        boolean f12 = org.telegram.ui.ActionBar.t6.f1(i13);
        l81 l81Var = this.f38712a;
        if (f12 && !(this.f38778y0.getBackground() instanceof org.telegram.ui.Components.jb0)) {
            if (org.telegram.ui.ActionBar.t6.t0() instanceof org.telegram.ui.Components.jb0) {
                getThemedColor(i13);
                l81Var.k(this.f38778y0.getBackground(), this.f38778y0.getBackground(), Float.valueOf(this.f38749m1));
            }
        } else {
            l81Var.k(this.f38778y0.getBackground(), this.f38778y0.getBackground(), Float.valueOf(this.f38749m1));
        }
        ImageView imageView = this.G0;
        if (imageView != null) {
            org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.Wc, l81Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.H0;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.Wc, l81Var, PorterDuff.Mode.MULTIPLY);
        }
        a91 a91Var = this.f38778y0;
        if (a91Var != null) {
            a91Var.getImageReceiver().f14398o1 = new PorterDuffColorFilter(this.f38746k1, this.f38766t1);
            this.f38778y0.getImageReceiver().setAlpha(Math.abs(this.f38749m1));
            this.f38778y0.invalidate();
            if (org.telegram.ui.ActionBar.t6.I.q() && (this.f38778y0.getBackground() instanceof org.telegram.ui.Components.jb0)) {
                org.telegram.ui.Cells.h0 h0Var = this.U0;
                if (h0Var != null) {
                    h0Var.setTwoSided(true);
                }
                if (this.f38749m1 < 0.0f) {
                    this.f38778y0.getImageReceiver().m0(((org.telegram.ui.Components.jb0) this.f38778y0.getBackground()).f27342k);
                }
            } else {
                this.f38778y0.getImageReceiver().m0(null);
                org.telegram.ui.Cells.h0 h0Var2 = this.U0;
                if (h0Var2 != null) {
                    h0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.h0 h0Var3 = this.U0;
            if (h0Var3 != null) {
                h0Var3.setProgress(this.f38749m1);
            }
        }
        g81 g81Var = this.f38769v0;
        if (g81Var != null) {
            g81Var.g1();
        }
        FrameLayout frameLayout = this.f38780z0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                this.f38780z0.getChildAt(i14).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.A0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                this.A0.getChildAt(i15).invalidate();
            }
        }
    }

    public final void g1(boolean z10) {
        org.telegram.ui.Components.jb0 jb0Var;
        org.telegram.ui.Components.jb0 jb0Var2;
        int i10;
        int g10;
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.ActionBar.r6 r6Var = this.f38771w;
        int i11 = this.f38715b;
        if (i11 == 0 && r6Var == null) {
            this.f38778y0.setBackground(org.telegram.ui.ActionBar.t6.s0());
        } else {
            TLRPC.PhotoSize photoSize2 = null;
            BitmapDrawable bitmapDrawable = null;
            if (i11 == 2) {
                Object obj = this.C1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    if (z10) {
                        photoSize = org.telegram.messenger.b8.w(tL_wallPaper.document.thumbs, 100, false, null, false);
                    } else {
                        photoSize = null;
                    }
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        bitmapDrawable = new BitmapDrawable(org.telegram.messenger.ic.F("b", photoSize.bytes));
                    }
                    a91 a91Var = this.f38778y0;
                    a91Var.f26357a.r0(org.telegram.messenger.jc.b(tL_wallPaper.document), this.H1, org.telegram.messenger.jc.c(photoSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    a91Var.d();
                } else if (obj instanceof ke1) {
                    ke1 ke1Var = (ke1) obj;
                    int i12 = ke1Var.f38862f;
                    int i13 = ke1Var.e;
                    int i14 = ke1Var.d;
                    int i15 = ke1Var.f38861c;
                    int i16 = ke1Var.f38860b;
                    this.f38740i1 = i12;
                    f1(i16, 0, false);
                    if (i15 != 0) {
                        f1(i15, 1, false);
                    }
                    f1(i14, 2, false);
                    f1(i13, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.X0;
                    if (tL_wallPaper2 != null) {
                        a91 a91Var2 = this.f38778y0;
                        org.telegram.messenger.jc b10 = org.telegram.messenger.jc.b(tL_wallPaper2.document);
                        String str = this.H1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.X0;
                        a91Var2.g(1, tL_wallPaper3.document.size, tL_wallPaper3, str, null, "jpg", b10, null);
                    } else if ("d".equals(ke1Var.f38859a)) {
                        Point point = org.telegram.messenger.i0.f16172q;
                        int min = Math.min(point.x, point.y);
                        int max = Math.max(point.x, point.y);
                        if (Build.VERSION.SDK_INT >= 29) {
                            g10 = 1459617792;
                        } else {
                            g10 = org.telegram.ui.Components.jb0.g(i16, i15, i14, i13);
                        }
                        this.f38778y0.setImageBitmap(org.telegram.messenger.e00.d(2131623997, min, max, g10));
                    }
                } else if (obj instanceof le1) {
                    Bitmap bitmap = this.D1;
                    if (bitmap != null) {
                        this.f38778y0.setImageBitmap(bitmap);
                    } else {
                        le1 le1Var = (le1) obj;
                        File file = le1Var.e;
                        if (file != null) {
                            this.f38778y0.h(file.getAbsolutePath(), this.H1, null);
                        } else {
                            File file2 = le1Var.d;
                            if (file2 != null) {
                                this.f38778y0.h(file2.getAbsolutePath(), this.H1, null);
                            } else if ("t".equals(le1Var.f39263a)) {
                                a91 a91Var3 = this.f38778y0;
                                a91Var3.setImageDrawable(org.telegram.ui.ActionBar.t6.Z0(a91Var3, false));
                            } else {
                                int i17 = le1Var.f39264b;
                                if (i17 != 0) {
                                    this.f38778y0.setImageResource(i17);
                                }
                            }
                        }
                    }
                } else if (obj instanceof org.telegram.messenger.jf) {
                    org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                    TLRPC.Photo photo = jfVar.K;
                    if (photo != null) {
                        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(photo.sizes, 100, false, null, false);
                        TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(jfVar.K.sizes, this.I1, true, null, false);
                        if (w10 != w9) {
                            photoSize2 = w10;
                        }
                        if (photoSize2 != null) {
                            i10 = photoSize2.size;
                        } else {
                            i10 = 0;
                        }
                        this.f38778y0.g(1, i10, jfVar, this.H1, "100_100_b", "jpg", org.telegram.messenger.jc.i(photoSize2, jfVar.K), org.telegram.messenger.jc.i(w9, jfVar.K));
                    } else {
                        a91 a91Var4 = this.f38778y0;
                        String str2 = jfVar.C;
                        String str3 = this.H1;
                        String str4 = jfVar.D;
                        a91Var4.getClass();
                        a91Var4.n(org.telegram.messenger.jc.g(str2), str3, org.telegram.messenger.jc.g(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (r6Var == null) {
                this.f38778y0.setBackground(org.telegram.ui.ActionBar.t6.s0());
            } else {
                org.telegram.ui.Components.a9 a9Var = this.f38770v1;
                if (a9Var != null) {
                    a9Var.dispose();
                    this.f38770v1 = null;
                }
                int E0 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Be);
                int i18 = (int) r6Var.f20737j;
                if (i18 != 0) {
                    E0 = i18;
                }
                int E02 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ce);
                long j10 = r6Var.f20738k;
                int i19 = (int) j10;
                if (i19 == 0 && j10 != 0) {
                    E02 = 0;
                } else if (i19 != 0) {
                    E02 = i19;
                }
                int E03 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.De);
                long j11 = r6Var.f20739l;
                int i20 = (int) j11;
                if (i20 == 0 && j11 != 0) {
                    E03 = 0;
                } else if (i20 != 0) {
                    E03 = i20;
                }
                int E04 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ee);
                long j12 = r6Var.f20740m;
                int i21 = (int) j12;
                if (i21 == 0 && j12 != 0) {
                    E04 = 0;
                } else if (i21 != 0) {
                    E04 = i21;
                }
                if (!TextUtils.isEmpty(r6Var.f20742o) && !org.telegram.ui.ActionBar.t6.c1()) {
                    if (E03 != 0) {
                        Drawable background = this.f38778y0.getBackground();
                        if (background instanceof org.telegram.ui.Components.jb0) {
                            jb0Var2 = (org.telegram.ui.Components.jb0) background;
                        } else {
                            org.telegram.ui.Components.jb0 jb0Var3 = new org.telegram.ui.Components.jb0();
                            jb0Var3.q(this.f38778y0);
                            jb0Var2 = jb0Var3;
                            if (this.E1) {
                                jb0Var3.m(false);
                                jb0Var2 = jb0Var3;
                            }
                        }
                        jb0Var2.n(E0, E02, E03, E04);
                        jb0Var = jb0Var2;
                    } else if (E02 != 0) {
                        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9(org.telegram.ui.Components.f9.d(r6Var.f20741n), new int[]{E0, E02});
                        this.f38770v1 = f9Var.f(k2.m0.j0(0.5f, 3), new t81(this, 0), 100L);
                        jb0Var = f9Var;
                    } else {
                        jb0Var = new ColorDrawable(E0);
                    }
                    this.f38778y0.setBackground(jb0Var);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.X0;
                    if (tL_wallPaper4 != null) {
                        a91 a91Var5 = this.f38778y0;
                        org.telegram.messenger.jc b11 = org.telegram.messenger.jc.b(tL_wallPaper4.document);
                        String str5 = this.H1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.X0;
                        a91Var5.g(1, tL_wallPaper5.document.size, tL_wallPaper5, str5, null, "jpg", b11, null);
                    }
                } else {
                    Drawable t02 = org.telegram.ui.ActionBar.t6.t0();
                    if (t02 != null) {
                        if (t02 instanceof org.telegram.ui.Components.jb0) {
                            ((org.telegram.ui.Components.jb0) t02).q(this.f38778y0);
                        }
                        this.f38778y0.setBackground(t02);
                    }
                }
                if (E02 == 0) {
                    int V0 = org.telegram.messenger.i0.V0(E0, false);
                    this.l1 = V0;
                    this.f38746k1 = V0;
                } else if (E03 != 0) {
                    this.f38746k1 = org.telegram.ui.Components.jb0.g(E0, E02, E03, E04);
                    this.l1 = 754974720;
                } else {
                    int V02 = org.telegram.messenger.i0.V0(org.telegram.messenger.i0.w0(E0, E02), false);
                    this.l1 = V02;
                    this.f38746k1 = V02;
                }
                a91 a91Var6 = this.f38778y0;
                if (a91Var6 != null) {
                    a91Var6.getImageReceiver().f14398o1 = new PorterDuffColorFilter(this.f38746k1, this.f38766t1);
                    this.f38778y0.getImageReceiver().setAlpha(Math.abs(this.f38749m1));
                    this.f38778y0.invalidate();
                    if (org.telegram.ui.ActionBar.t6.I.q() && (this.f38778y0.getBackground() instanceof org.telegram.ui.Components.jb0)) {
                        org.telegram.ui.Cells.h0 h0Var = this.U0;
                        if (h0Var != null) {
                            h0Var.setTwoSided(true);
                        }
                        if (this.f38749m1 < 0.0f) {
                            this.f38778y0.getImageReceiver().m0(((org.telegram.ui.Components.jb0) this.f38778y0.getBackground()).f27342k);
                        }
                    } else {
                        this.f38778y0.getImageReceiver().m0(null);
                        org.telegram.ui.Cells.h0 h0Var2 = this.U0;
                        if (h0Var2 != null) {
                            h0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.h0 h0Var3 = this.U0;
                    if (h0Var3 != null) {
                        h0Var3.setProgress(this.f38749m1);
                    }
                }
                if (this.K0 != null) {
                    int i22 = 0;
                    while (true) {
                        org.telegram.ui.Components.y71[] y71VarArr = this.K0;
                        if (i22 >= y71VarArr.length) {
                            break;
                        }
                        y71VarArr[i22].b(0, E0);
                        this.K0[i22].b(1, E02);
                        this.K0[i22].b(2, E03);
                        this.K0[i22].b(3, E04);
                        i22++;
                    }
                }
                ImageView imageView = this.G0;
                l81 l81Var = this.f38712a;
                if (imageView != null) {
                    org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.Wc, l81Var, PorterDuff.Mode.MULTIPLY);
                }
                ImageView imageView2 = this.H0;
                if (imageView2 != null) {
                    org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.Wc, l81Var, PorterDuff.Mode.MULTIPLY);
                }
                a1();
            }
        }
        this.E1 = false;
    }

    @Override
    public final int getObserverTag() {
        return this.f38768u1;
    }

    @Override
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.f38712a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.M1) {
            return X0();
        }
        return super.getThemeDescriptions();
    }

    public final void h1(long j10) {
        boolean z10;
        this.K1 = j10;
        if (j10 != 0 && j10 != getUserConfig().e()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.L1 = z10;
    }

    public final void i1(org.telegram.ui.Cells.s0 s0Var) {
        l81 l81Var;
        float f7;
        if (this.f38778y0 == null) {
            return;
        }
        Bitmap bitmap = this.f38712a.f39144i;
        float f10 = 0.0f;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f7 = ((this.f38778y0.getMeasuredWidth() - (Math.max(this.f38778y0.getMeasuredWidth() / width, this.f38778y0.getMeasuredHeight() / l81Var.f39144i.getHeight()) * width)) / 2.0f) + this.Y1 + 0.0f;
        } else {
            f7 = this.Y1 + 0.0f;
        }
        float y3 = s0Var.getY() - ((-this.f38778y0.J) + 0.0f);
        int measuredHeight = this.f38778y0.getMeasuredHeight();
        if (this.N1) {
            f10 = this.f38754o1 * this.f38756p1;
        }
        s0Var.f22956w0 = true;
        s0Var.f22953v0 = measuredHeight;
        s0Var.f22949t0 = y3;
        s0Var.f22951u0 = f7;
        s0Var.f22896b2 = f10;
        s0Var.f22899c2.setColor(i0.b.o(-16777216, (int) (f10 * 255.0f)));
        s0Var.invalidate();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.f38715b == 2) {
            if (this.f38718b2 && motionEvent != null) {
                if (motionEvent.getY() > org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16166m) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final void j1() {
        if (this.f38767u0 != null && this.L0 != null && this.f38771w.f20735g != 0) {
            SharedPreferences d12 = org.telegram.messenger.wp.d1();
            if (!d12.getBoolean("bganimationhint", false)) {
                if (this.B0 == null) {
                    org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(getParentActivity(), 8);
                    this.B0 = q30Var;
                    q30Var.setShowingDuration(5000L);
                    this.B0.setAlpha(0.0f);
                    this.B0.setVisibility(4);
                    this.B0.setText(org.telegram.messenger.dd.L0(2131753751, null));
                    this.B0.setExtraTranslationY(org.telegram.messenger.i0.L(6.0f));
                    this.f38748l0.addView(this.B0, w7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                org.telegram.messenger.i0.h3(new y01(8, this, d12), 500L);
            }
        }
    }

    public final void k1(int i10, boolean z10, boolean z11) {
        boolean z12;
        char c10;
        char c11;
        FrameLayout frameLayout;
        float f7;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i12;
        FrameLayout frameLayout2;
        int i13;
        float f15;
        FrameLayout frameLayout3;
        float f16;
        float f17;
        float f18;
        int i14;
        int i15;
        int i16;
        char c12 = 0;
        if (z10 && i10 == 1 && this.X0 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i17 = this.f38715b;
        if (z10) {
            if (i10 == 0) {
                if (i17 == 2) {
                    this.f38717b1 = this.f38714a1;
                    int i18 = this.f38721c1;
                    this.f38731f1 = i18;
                    int i19 = this.f38724d1;
                    this.f38734g1 = i19;
                    int i20 = this.f38727e1;
                    this.f38737h1 = i20;
                    this.f38743j1 = this.P;
                    if (i20 != 0) {
                        i16 = 4;
                    } else if (i19 != 0) {
                        i16 = 3;
                    } else if (i18 != 0) {
                        i16 = 2;
                    } else {
                        i16 = 1;
                    }
                    this.W.f(0, 4, i16, false);
                    this.W.e(this.f38727e1, 3);
                    this.W.e(this.f38724d1, 2);
                    this.W.e(this.f38721c1, 1);
                    this.W.e(this.f38714a1, 0);
                }
            } else {
                this.Y0 = this.X0;
                this.f38752n1 = this.f38749m1;
                this.R0.f();
                ArrayList arrayList = this.V0;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.X0;
                    if (tL_wallPaper == null) {
                        i15 = 0;
                    } else {
                        int indexOf = arrayList.indexOf(tL_wallPaper);
                        if (i17 == 2) {
                            i14 = 1;
                        } else {
                            i14 = 0;
                        }
                        i15 = indexOf + i14;
                    }
                    this.S0.h1(i15, (this.Q0.getMeasuredWidth() - org.telegram.messenger.i0.L(124.0f)) / 2);
                }
            }
        }
        if (i17 == 1 || i17 == 2) {
            org.telegram.ui.Components.y71[] y71VarArr = this.K0;
            if (z12) {
                c10 = 2;
            } else {
                c10 = 0;
            }
            y71VarArr[c10].setVisibility(0);
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.h0 h0Var = this.U0;
            if (!h0Var.M) {
                float f19 = this.f38749m1;
                if (f19 < 0.0f) {
                    float f20 = -f19;
                    this.f38749m1 = f20;
                    h0Var.setProgress(f20);
                }
            }
        }
        int i21 = 58;
        float f21 = 1.0f;
        FrameLayout[] frameLayoutArr = this.M0;
        if (z11) {
            this.f38764s1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            if (i10 == 0) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            if (z10) {
                frameLayoutArr[i10].setVisibility(0);
                if (i17 == 1) {
                    g81 g81Var = this.f38769v0;
                    Property property = View.TRANSLATION_Y;
                    if (i10 == 1) {
                        f16 = -org.telegram.messenger.i0.L(21.0f);
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(g81Var, property, f16));
                    org.telegram.ui.Components.y71 y71Var = this.K0[2];
                    Property property2 = View.ALPHA;
                    if (z12) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(y71Var, property2, f17));
                    org.telegram.ui.Components.y71 y71Var2 = this.K0[0];
                    if (z12) {
                        f18 = 0.0f;
                    } else {
                        f18 = 1.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(y71Var2, property2, f18));
                    if (i10 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property2, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i12], property2, 0.0f));
                    }
                    org.telegram.messenger.i0.v1(this.W.E[1]);
                } else if (i17 == 2) {
                    g81 g81Var2 = this.f38769v0;
                    Property property3 = View.TRANSLATION_Y;
                    int i22 = -frameLayoutArr[i10].getMeasuredHeight();
                    if (this.B1 == null) {
                        i21 = 0;
                    }
                    int L = org.telegram.messenger.i0.L(i21 + 72) + i22;
                    if (Z0()) {
                        i13 = org.telegram.messenger.i0.f16167n;
                    } else {
                        i13 = 0;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(g81Var2, property3, L + i13));
                    org.telegram.ui.Components.y71 y71Var3 = this.K0[2];
                    Property property4 = View.ALPHA;
                    if (z12) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(y71Var3, property4, f15));
                    org.telegram.ui.Components.y71 y71Var4 = this.K0[0];
                    if (z12) {
                        f21 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(y71Var4, property4, f21));
                    if (frameLayoutArr[i12].getVisibility() == 0) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i12], property4, 0.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property4, 0.0f, 1.0f));
                        frameLayoutArr[i10].setTranslationY(0.0f);
                    } else {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property3, frameLayout3.getMeasuredHeight(), 0.0f));
                    }
                } else {
                    if (i10 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], View.ALPHA, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i12], View.ALPHA, 0.0f));
                    }
                    org.telegram.messenger.i0.v1(this.W.E[1]);
                }
            } else {
                g81 g81Var3 = this.f38769v0;
                Property property5 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(g81Var3, property5, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property5, frameLayout2.getMeasuredHeight()));
                org.telegram.ui.Components.y71 y71Var5 = this.K0[0];
                Property property6 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(y71Var5, property6, 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.K0[2], property6, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.f38778y0, property6, 1.0f));
            }
            this.f38764s1.playTogether(arrayList2);
            this.f38764s1.addListener(new s81(this, z10, i12, i10, z12));
            this.f38764s1.setInterpolator(org.telegram.ui.Components.gr.f26524g);
            this.f38764s1.setDuration(200L);
            this.f38764s1.start();
            return;
        }
        if (i10 == 0) {
            c11 = 1;
        } else {
            c11 = 0;
        }
        if (z10) {
            frameLayoutArr[i10].setVisibility(0);
            if (i17 == 1) {
                g81 g81Var4 = this.f38769v0;
                if (i10 == 1) {
                    f12 = -org.telegram.messenger.i0.L(21.0f);
                } else {
                    f12 = 0.0f;
                }
                g81Var4.setTranslationY(f12);
                org.telegram.ui.Components.y71 y71Var6 = this.K0[2];
                if (z12) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                y71Var6.setAlpha(f13);
                org.telegram.ui.Components.y71 y71Var7 = this.K0[0];
                if (z12) {
                    f14 = 0.0f;
                } else {
                    f14 = 1.0f;
                }
                y71Var7.setAlpha(f14);
                if (i10 == 1) {
                    frameLayoutArr[i10].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    frameLayoutArr[c11].setAlpha(0.0f);
                }
                org.telegram.messenger.i0.v1(this.W.E[1]);
            } else if (i17 == 2) {
                g81 g81Var5 = this.f38769v0;
                if (i10 == 0) {
                    f7 = 343.0f;
                } else {
                    f7 = 316.0f;
                }
                int i23 = -org.telegram.messenger.i0.L(f7);
                if (this.B1 == null) {
                    i21 = 0;
                }
                int L2 = org.telegram.messenger.i0.L(i21 + 72) + i23;
                if (Z0()) {
                    i11 = org.telegram.messenger.i0.f16167n;
                } else {
                    i11 = 0;
                }
                g81Var5.setTranslationY(L2 + i11);
                org.telegram.ui.Components.y71 y71Var8 = this.K0[2];
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                y71Var8.setAlpha(f10);
                org.telegram.ui.Components.y71 y71Var9 = this.K0[0];
                if (z12) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                y71Var9.setAlpha(f11);
                if (frameLayoutArr[c11].getVisibility() == 0) {
                    frameLayoutArr[c11].setAlpha(0.0f);
                    frameLayoutArr[i10].setAlpha(1.0f);
                    frameLayoutArr[i10].setTranslationY(0.0f);
                } else {
                    frameLayoutArr[i10].setTranslationY(0.0f);
                }
            } else {
                if (i10 == 1) {
                    frameLayoutArr[i10].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    frameLayoutArr[c11].setAlpha(0.0f);
                }
                org.telegram.messenger.i0.v1(this.W.E[1]);
            }
        } else {
            this.f38769v0.setTranslationY(0.0f);
            frameLayoutArr[i10].setTranslationY(frameLayout.getMeasuredHeight());
            this.K0[0].setAlpha(1.0f);
            this.K0[2].setAlpha(1.0f);
            this.f38778y0.setAlpha(1.0f);
        }
        if (z10 && frameLayoutArr[c11].getVisibility() == 0) {
            frameLayoutArr[c11].setAlpha(1.0f);
            frameLayoutArr[c11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        if (i17 != 1 && i17 != 2) {
            if (i10 == 1) {
                frameLayoutArr[c11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.y71[] y71VarArr2 = this.K0;
        if (!z12) {
            c12 = 2;
        }
        y71VarArr2[c12].setVisibility(4);
    }

    public final void l1() {
        Window window;
        if (this.f38741i2 != null) {
            return;
        }
        if (Z0()) {
            window = this.parentLayout.getBottomSheet().getWindow();
        } else {
            window = getParentActivity().getWindow();
        }
        FrameLayout frameLayout = (FrameLayout) window.getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.P1.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.P1.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        this.P1.getLocationInWindow(iArr);
        float f7 = iArr[0];
        float f10 = iArr[1];
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.i0.f16167n;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        ic icVar = new ic(this, getParentActivity(), canvas, (this.P1.getMeasuredWidth() / 2.0f) + f7, (this.P1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 2);
        this.f38741i2 = icVar;
        icVar.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
        this.f38744j2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f38747k2 = ofFloat;
        ofFloat.addUpdateListener(new jc(this, 2));
        this.f38747k2.addListener(new p81(this, 4));
        this.f38747k2.setDuration(400L);
        this.f38747k2.setInterpolator(org.telegram.ui.Components.vs.e);
        this.f38747k2.start();
        frameLayout.addView(this.f38741i2, new ViewGroup.LayoutParams(-1, -1));
        org.telegram.messenger.i0.g3(new y71(this, 2));
    }

    public final void m1(boolean z10) {
        int i10 = (this.K1 > 0L ? 1 : (this.K1 == 0L ? 0 : -1));
        if (i10 > 0) {
            this.A1.d(org.telegram.messenger.dd.L0(2131754212, null));
        } else if (i10 < 0) {
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-this.K1));
            if (L0 != null) {
                this.A1.d(org.telegram.messenger.dd.a0(null, null, 2131754213, L0.title));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < W0()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                    if (this.f38761r1 == null) {
                        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(2131231975, 0);
                        this.f38761r1 = dqVar;
                        dqVar.f25567n = 1;
                    }
                    spannableStringBuilder.setSpan(this.f38761r1, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.dd.G(W0(), "ReactionLevelRequiredBtn", new Object[0]));
                    this.A1.c(spannableStringBuilder, z10);
                    return;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.W1;
                if (tL_premium_boostsStatus2 == null) {
                    if (this.K1 < 0 && !this.U1 && !this.V1 && tL_premium_boostsStatus2 == null) {
                        this.U1 = true;
                        getMessagesController().G0().a(this.K1, new b81(this, 1));
                        return;
                    }
                    return;
                }
                this.A1.c(null, z10);
                return;
            }
            this.A1.d(org.telegram.messenger.dd.a0(null, null, 2131754213, org.telegram.messenger.dd.L0(2131754904, null).toLowerCase()));
        } else {
            this.A1.d(org.telegram.messenger.dd.L0(2131754214, null));
        }
    }

    public final void n1() {
        if (this.G1 && this.f38776x1 == null) {
            Bitmap bitmap = this.D1;
            if (bitmap != null) {
                this.f38779y1 = bitmap;
                this.f38776x1 = Utilities.e(bitmap);
            } else {
                ImageReceiver imageReceiver = this.f38778y0.getImageReceiver();
                if (imageReceiver.L() || imageReceiver.m0 != null) {
                    this.f38779y1 = imageReceiver.n();
                    this.f38776x1 = Utilities.e(imageReceiver.n());
                }
            }
        }
        if (this.G1) {
            Bitmap bitmap2 = this.f38776x1;
            if (bitmap2 != null) {
                this.f38778y0.setImageBitmap(bitmap2);
                return;
            }
            return;
        }
        g1(false);
    }

    public final void o1() {
        File A;
        String name;
        int i10;
        long j10;
        File file;
        String str;
        float f7;
        FrameLayout frameLayout;
        float f10;
        Object obj = this.X0;
        if (obj == null) {
            obj = this.C1;
        }
        boolean z10 = obj instanceof TLRPC.TL_wallPaper;
        if (z10 || (obj instanceof org.telegram.messenger.jf)) {
            if (z10) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                str = org.telegram.messenger.b8.r(null, tL_wallPaper.document);
                if (!TextUtils.isEmpty(str)) {
                    org.telegram.messenger.b8.G(this.currentAccount);
                    file = org.telegram.messenger.b8.K(tL_wallPaper.document, null, true, true);
                    j10 = tL_wallPaper.document.size;
                } else {
                    return;
                }
            } else {
                org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                TLRPC.Photo photo = jfVar.K;
                if (photo != null) {
                    TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(photo.sizes, this.I1, true, null, false);
                    org.telegram.messenger.b8.G(this.currentAccount);
                    A = org.telegram.messenger.b8.K(w9, null, true, true);
                    name = org.telegram.messenger.b8.r(null, w9);
                    i10 = w9.size;
                } else {
                    A = org.telegram.messenger.ic.A(jfVar.C);
                    name = A.getName();
                    i10 = jfVar.G;
                }
                j10 = i10;
                String str2 = name;
                file = A;
                str = str2;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            }
            boolean exists = file.exists();
            int i11 = this.f38715b;
            if (exists) {
                org.telegram.messenger.b6.q(this.currentAccount).v(this);
                this.f38778y0.invalidate();
                if (i11 == 2) {
                    if (j10 != 0 && this.K1 == 0) {
                        this.f38765t0.setSubtitle(org.telegram.messenger.i0.i0(j10, false, false));
                    } else {
                        this.f38765t0.setSubtitle(null);
                    }
                }
            } else {
                org.telegram.messenger.b6.q(this.currentAccount).a(str, null, this);
                if (i11 == 2 && this.K1 == 0) {
                    this.f38765t0.setSubtitle(org.telegram.messenger.dd.L0(2131748788, null));
                }
                this.f38778y0.invalidate();
            }
            float f11 = 0.5f;
            if (this.X0 == null && (frameLayout = this.f38780z0) != null) {
                if (exists) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                frameLayout.setAlpha(f10);
            }
            if (i11 == 0) {
                this.f38723d0.setEnabled(exists);
                TextView textView = this.f38723d0;
                if (exists) {
                    f11 = 1.0f;
                }
                textView.setAlpha(f11);
            } else if (i11 == 2) {
                this.D0.setEnabled(exists);
                b91 b91Var = this.A1;
                if (b91Var != null) {
                    if (exists) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.5f;
                    }
                    b91Var.setAlpha(f7);
                }
                b91 b91Var2 = this.B1;
                if (b91Var2 != null) {
                    if (exists) {
                        f11 = 1.0f;
                    }
                    b91Var2.setAlpha(f11);
                }
            } else {
                this.f38729f.setEnabled(exists);
                org.telegram.ui.ActionBar.t0 t0Var = this.f38729f;
                if (exists) {
                    f11 = 1.0f;
                }
                t0Var.setAlpha(f11);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!U0(z10)) {
            return false;
        }
        S0(true);
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBottomSheetCreated() {
        super.onBottomSheetCreated();
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && z4Var.getBottomSheet() != null) {
            this.parentLayout.getBottomSheet().P(getThemedColor(org.telegram.ui.ActionBar.t6.f21002h5));
            if (this.f38715b == 2 && this.K1 != 0) {
                this.parentLayout.getBottomSheet().E0(-16777216);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14764p3);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14726i4);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14732j4);
        getNotificationCenter().c(this, org.telegram.messenger.at.f14799u5);
        int i10 = this.f38715b;
        if (i10 == 1 || i10 == 0) {
            org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14831z4);
        }
        if (i10 == 2 || i10 == 1) {
            org.telegram.ui.ActionBar.t6.N = true;
        }
        if (i10 == 0 && this.f38771w == null) {
            this.F1 = org.telegram.ui.ActionBar.t6.f21015i0;
        } else {
            Point point = org.telegram.messenger.i0.f16172q;
            int min = Math.min(point.x, point.y);
            int max = Math.max(point.x, point.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / org.telegram.messenger.i0.f16171p));
            sb2.append("_");
            this.H1 = a1.g.p(sb2, (int) (max / org.telegram.messenger.i0.f16171p), "_f");
            this.I1 = Math.max(point.x, point.y);
            org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14708f4);
            org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14702e4);
            this.f38768u1 = org.telegram.messenger.b6.q(this.currentAccount).k();
            if (this.V0 == null) {
                this.V0 = new ArrayList();
                org.telegram.messenger.is.a0(this.currentAccount).p0();
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14764p3);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14726i4);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14732j4);
        getNotificationCenter().n(this, org.telegram.messenger.at.f14799u5);
        fg.i iVar = this.f38748l0;
        if (iVar != null && this.R != null) {
            iVar.getViewTreeObserver().removeOnGlobalLayoutListener(this.R);
        }
        int i10 = this.f38715b;
        if ((i10 == 2 || i10 == 1) && this.f38758q1 == null) {
            org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.n0(16));
        }
        int i11 = org.telegram.messenger.at.f14831z4;
        if (i10 == 2) {
            Bitmap bitmap = this.f38776x1;
            if (bitmap != null) {
                bitmap.recycle();
                this.f38776x1 = null;
            }
            this.f38712a.k(null, null, null);
            org.telegram.messenger.at.e().k(i11, new Object[0]);
        } else if (i10 == 1 || i10 == 0) {
            org.telegram.messenger.at.e().n(this, i11);
        }
        if (i10 != 0 || this.f38771w != null) {
            org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14708f4);
            org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14702e4);
        }
        super.onFragmentDestroy();
        T0(null);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.F1) {
            this.f38773w1.c(false);
        }
        org.telegram.ui.ActionBar.t6.f20885b = false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        fg.j jVar = this.f38755p0;
        if (jVar != null) {
            jVar.f();
        }
        g91 g91Var = this.f38772w0;
        if (g91Var != null) {
            g91Var.f();
        }
        if (this.F1) {
            this.f38773w1.c(true);
        }
        org.telegram.ui.ActionBar.t6.f20885b = true;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            V0();
            try {
                z4.g gVar = this.f38745k0;
                if (gVar != null) {
                    org.telegram.messenger.i0.B3(gVar, getThemedColor(org.telegram.ui.ActionBar.t6.f21207s8));
                }
                org.telegram.ui.Cells.h0 h0Var = this.U0;
                if (h0Var != null) {
                    h0Var.setOuterColor(getThemedColor(org.telegram.ui.ActionBar.t6.Jj));
                    this.U0.invalidate();
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (!z10 && this.f38715b == 2) {
            this.f38712a.k(null, null, null);
            org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14831z4, new Object[0]);
        }
    }

    public final void p1() {
        this.f38778y0.getImageReceiver().setAlpha(Math.abs(this.f38749m1));
        this.f38778y0.invalidate();
        this.Q0.g1();
        if (this.f38749m1 >= 0.0f) {
            this.f38778y0.getImageReceiver().m0(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f38778y0.getImageReceiver().Z(null);
            }
            if (this.f38778y0.getBackground() instanceof org.telegram.ui.Components.jb0) {
                this.f38778y0.getImageReceiver().m0(((org.telegram.ui.Components.jb0) this.f38778y0.getBackground()).f27342k);
            }
        }
        this.f38712a.k(this.f38778y0.getBackground(), this.f38778y0.getBackground(), Float.valueOf(this.f38749m1));
        a1();
    }

    public final void q1() {
        char c10;
        float f7;
        boolean z10;
        boolean z11;
        float f10;
        float f11 = 1.0f;
        float f12 = 0.0f;
        int i10 = this.f38715b;
        if (i10 != 1 && i10 != 2) {
            boolean isEnabled = this.K0[0].isEnabled();
            TLRPC.TL_wallPaper tL_wallPaper = this.X0;
            if (tL_wallPaper != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (isEnabled == z10) {
                return;
            }
            if (tL_wallPaper == null) {
                this.K0[0].a(false, true);
            }
            org.telegram.ui.Components.y71 y71Var = this.K0[0];
            if (this.X0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            y71Var.setEnabled(z11);
            if (this.X0 != null) {
                this.K0[0].setVisibility(0);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            int L = (org.telegram.messenger.i0.L(9.0f) + ((FrameLayout.LayoutParams) this.K0[1].getLayoutParams()).width) / 2;
            org.telegram.ui.Components.y71 y71Var2 = this.K0[0];
            Property property = View.ALPHA;
            if (this.X0 == null) {
                f11 = 0.0f;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(y71Var2, property, f11));
            org.telegram.ui.Components.y71 y71Var3 = this.K0[0];
            Property property2 = View.TRANSLATION_X;
            if (this.X0 != null) {
                f10 = 0.0f;
            } else {
                f10 = L;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(y71Var3, property2, f10));
            org.telegram.ui.Components.y71 y71Var4 = this.K0[1];
            if (this.X0 == null) {
                f12 = -L;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(y71Var4, property2, f12));
            animatorSet.setInterpolator(org.telegram.ui.Components.gr.f26524g);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new r81(this));
            animatorSet.start();
            return;
        }
        if (this.X0 == null && (this.C1 instanceof ke1)) {
            this.K0[2].a(false, true);
        }
        org.telegram.ui.Components.y71[] y71VarArr = this.K0;
        if (this.X0 != null) {
            c10 = 2;
        } else {
            c10 = 0;
        }
        y71VarArr[c10].setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        org.telegram.ui.Components.y71 y71Var5 = this.K0[2];
        Property property3 = View.ALPHA;
        if (this.X0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y71Var5, property3, f7);
        org.telegram.ui.Components.y71 y71Var6 = this.K0[0];
        if (this.X0 != null) {
            f11 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(y71Var6, property3, f11));
        animatorSet2.addListener(new q81(this));
        animatorSet2.setInterpolator(org.telegram.ui.Components.gr.f26524g);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }

    public final void r1(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k91.r1(boolean):void");
    }

    public final void s1() {
        int childCount = this.Q0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.Q0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.n5) {
                ((org.telegram.ui.Cells.n5) childAt).w(true);
            }
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.p6 p6Var) {
        this.f38712a.f39139a = p6Var;
    }

    public k91(org.telegram.ui.ActionBar.s6 s6Var, boolean z10, int i10, boolean z11, boolean z12) {
        super(null);
        this.f38712a = new l81(this);
        this.d = true;
        this.f38750n = 1;
        org.telegram.ui.ActionBar.a6 a6Var = new org.telegram.ui.ActionBar.a6(this, 0, false);
        this.S = a6Var;
        org.telegram.ui.ActionBar.a6 a6Var2 = new org.telegram.ui.ActionBar.a6(this, 0, true);
        this.T = a6Var2;
        org.telegram.ui.ActionBar.a6 a6Var3 = new org.telegram.ui.ActionBar.a6(this, 1, false);
        this.U = a6Var3;
        org.telegram.ui.ActionBar.a6 a6Var4 = new org.telegram.ui.ActionBar.a6(this, 1, true);
        this.V = a6Var4;
        this.Y = -1;
        this.Z = new y71(this, 0);
        this.f38775x0 = new a91[2];
        this.M0 = new FrameLayout[2];
        this.N0 = new TextView[2];
        this.O0 = new TextView[2];
        this.P0 = new FrameLayout[2];
        this.W0 = new HashMap();
        this.f38749m1 = 0.5f;
        this.f38754o1 = 0.0f;
        this.f38766t1 = PorterDuff.Mode.SRC_IN;
        this.f38781z1 = 1.0f;
        this.H1 = "640_360";
        this.I1 = 1920;
        this.L1 = true;
        this.T1 = new org.telegram.ui.Components.p10(getParentActivity(), new n81(this));
        this.U1 = false;
        this.V1 = false;
        this.f38715b = i10;
        this.f38733g0 = z12;
        this.f38730f0 = s6Var;
        this.f38739i0 = z10;
        this.f38736h0 = z11;
        if (i10 == 1) {
            org.telegram.ui.ActionBar.r6 k10 = s6Var.k(!z11);
            this.f38771w = k10;
            if (k10 != null) {
                this.d = false;
                this.f38777y = k10.f20733c;
                this.D = k10.d;
                this.E = k10.e;
                this.F = k10.f20734f;
                this.G = k10.f20735g;
                this.H = k10.h;
                this.I = k10.f20736i;
                this.J = k10.f20737j;
                this.K = k10.f20738k;
                this.L = k10.f20739l;
                this.M = k10.f20740m;
                this.N = k10.f20743p;
                this.O = k10.f20742o;
                this.P = k10.f20741n;
            }
        } else {
            if (i10 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.r6 k11 = s6Var.k(false);
            this.f38771w = k11;
            if (k11 != null) {
                this.X0 = k11.f20746s;
            }
        }
        org.telegram.ui.ActionBar.r6 r6Var = this.f38771w;
        if (r6Var != null) {
            this.F1 = r6Var.f20744q;
            if (!TextUtils.isEmpty(r6Var.f20742o)) {
                this.f38749m1 = this.f38771w.f20743p;
            }
            org.telegram.ui.ActionBar.t6.M = org.telegram.ui.ActionBar.t6.D0();
            org.telegram.ui.ActionBar.t6.O = true;
            org.telegram.ui.ActionBar.t6.P = true;
            org.telegram.ui.ActionBar.t6.u(s6Var, false, false);
        }
        org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14798u4, new Object[0]);
        a6Var.v = true;
        a6Var3.v = true;
        a6Var2.v = true;
        a6Var4.v = true;
    }

    @Override
    public final void i(long j10, long j11) {
    }

    @Override
    public final void o(long j10, long j11) {
    }

    public k91(org.telegram.ui.ActionBar.s6 s6Var) {
        this(s6Var, false, 0, false, false);
    }
}
