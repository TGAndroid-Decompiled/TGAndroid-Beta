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
public class m91 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.z5, org.telegram.messenger.us {
    public FrameLayout A0;
    public d91 A1;
    public org.telegram.ui.Components.q30 B0;
    public d91 B1;
    public AnimatorSet C0;
    public Object C1;
    public final int D;
    public ig.s D0;
    public Bitmap D1;
    public final int E;
    public l81 E0;
    public boolean E1;
    public final int F;
    public l81 F0;
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
    public l91 J1;
    public final long K;
    public org.telegram.ui.Components.x71[] K0;
    public long K1;
    public final long L;
    public org.telegram.ui.Components.x71[] L0;
    public boolean L1;
    public final long M;
    public final FrameLayout[] M0;
    public boolean M1;
    public final float N;
    public final TextView[] N0;
    public boolean N1;
    public final String O;
    public final TextView[] O0;
    public org.telegram.ui.Components.bi0 O1;
    public final int P;
    public final FrameLayout[] P0;
    public org.telegram.ui.ActionBar.t0 P1;
    public long Q;
    public w71 Q0;
    public ValueAnimator Q1;
    public z80 R;
    public k91 R0;
    public jg.b1 R1;
    public final org.telegram.ui.ActionBar.a6 S;
    public s4.a0 S0;
    public k81 S1;
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
    public final n81 f39537a;
    public boolean f39538a0;
    public int f39539a1;
    public float a2;
    public final int f39540b;
    public kg.f0 f39541b0;
    public int f39542b1;
    public boolean f39543b2;
    public Scroller f39544c;
    public FrameLayout f39545c0;
    public int f39546c1;
    public int f39547c2;
    public final boolean d;
    public TextView f39548d0;
    public int f39549d1;
    public ValueAnimator f39550d2;
    public org.telegram.ui.Components.tl e;
    public TextView f39551e0;
    public int f39552e1;
    public boolean f39553e2;
    public org.telegram.ui.ActionBar.t0 f39554f;
    public final org.telegram.ui.ActionBar.s6 f39555f0;
    public int f39556f1;
    public TextView f39557f2;
    public final boolean f39558g0;
    public int f39559g1;
    public WeakReference f39560g2;
    public TextView h;
    public final boolean f39561h0;
    public int f39562h1;
    public BitmapDrawable f39563h2;
    public final boolean f39564i0;
    public int f39565i1;
    public ic f39566i2;
    public ArrayList f39567j0;
    public int f39568j1;
    public float f39569j2;
    public z4.g f39570k0;
    public int f39571k1;
    public ValueAnimator f39572k2;
    public fg.i f39573l0;
    public int l1;
    public UndoView m0;
    public float f39574m1;
    public int f39575n;
    public FrameLayout f39576n0;
    public float f39577n1;
    public org.telegram.ui.Components.tk0 f39578o0;
    public float f39579o1;
    public fg.j f39580p0;
    public float f39581p1;
    public org.telegram.ui.Components.f10 f39582q0;
    public e91 f39583q1;
    public Drawable f39584r;
    public org.telegram.messenger.jj f39585r0;
    public org.telegram.ui.Components.dq f39586r1;
    public int f39587s;
    public boolean f39588s0;
    public AnimatorSet f39589s1;
    public org.telegram.ui.ActionBar.l f39590t0;
    public final PorterDuff.Mode f39591t1;
    public org.telegram.ui.ActionBar.m0 f39592u0;
    public int f39593u1;
    public i81 f39594v0;
    public org.telegram.ui.Components.a9 f39595v1;
    public final org.telegram.ui.ActionBar.r6 f39596w;
    public i91 f39597w0;
    public org.telegram.ui.Components.z71 f39598w1;
    public boolean f39599x;
    public final c91[] f39600x0;
    public Bitmap f39601x1;
    public final int f39602y;
    public c91 f39603y0;
    public Bitmap f39604y1;
    public FrameLayout f39605z0;
    public float f39606z1;

    public m91(Object obj, Bitmap bitmap, boolean z10) {
        super(null);
        this.f39537a = new n81(this);
        this.d = true;
        this.f39575n = 1;
        org.telegram.ui.ActionBar.a6 a6Var = new org.telegram.ui.ActionBar.a6(this, 0, false);
        this.S = a6Var;
        org.telegram.ui.ActionBar.a6 a6Var2 = new org.telegram.ui.ActionBar.a6(this, 0, true);
        this.T = a6Var2;
        org.telegram.ui.ActionBar.a6 a6Var3 = new org.telegram.ui.ActionBar.a6(this, 1, false);
        this.U = a6Var3;
        org.telegram.ui.ActionBar.a6 a6Var4 = new org.telegram.ui.ActionBar.a6(this, 1, true);
        this.V = a6Var4;
        this.Y = -1;
        this.Z = new a81(this, 0);
        this.f39600x0 = new c91[2];
        this.M0 = new FrameLayout[2];
        this.N0 = new TextView[2];
        this.O0 = new TextView[2];
        this.P0 = new FrameLayout[2];
        this.W0 = new HashMap();
        this.f39574m1 = 0.5f;
        this.f39579o1 = 0.0f;
        this.f39591t1 = PorterDuff.Mode.SRC_IN;
        this.f39606z1 = 1.0f;
        this.H1 = "640_360";
        this.I1 = 1920;
        this.L1 = true;
        this.T1 = new org.telegram.ui.Components.p10(getParentActivity(), new p81(this));
        this.U1 = false;
        this.V1 = false;
        this.f39540b = 2;
        this.C1 = obj;
        this.D1 = bitmap;
        this.E1 = z10;
        if (obj instanceof me1) {
            me1 me1Var = (me1) obj;
            this.F1 = me1Var.f39692j;
            TLRPC.TL_wallPaper tL_wallPaper = me1Var.f39690g;
            this.X0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f7 = me1Var.h;
                this.f39574m1 = f7;
                if (f7 < 0.0f && !org.telegram.ui.ActionBar.t6.I.q()) {
                    this.f39574m1 *= -1.0f;
                }
            }
        }
        a6Var.v = true;
        a6Var3.v = true;
        a6Var2.v = true;
        a6Var4.v = true;
    }

    public static void Y(m91 m91Var, org.telegram.messenger.h3 h3Var) {
        if (m91Var.getParentActivity() == null) {
            return;
        }
        kg.q0 q0Var = new kg.q0(23, m91Var.currentAccount, m91Var.getParentActivity(), m91Var, m91Var.f39537a);
        q0Var.A1(h3Var);
        q0Var.z1(m91Var.W1, true);
        q0Var.B1(m91Var.K1);
        if (!m91Var.Y0()) {
            q0Var.I2 = new a81(m91Var, 1);
        }
        m91Var.showDialog(q0Var);
    }

    public static void Z(m91 m91Var) {
        org.telegram.ui.ActionBar.r6 k10;
        org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.M;
        if (s6Var == null) {
            return;
        }
        int i10 = s6Var.Z;
        if (i10 >= 0) {
            k10 = (org.telegram.ui.ActionBar.r6) s6Var.f20802a0.get(i10);
        } else {
            k10 = s6Var.k(false);
        }
        if (m91Var.f39596w != null) {
            m91Var.a1();
            org.telegram.ui.ActionBar.t6.z1(m91Var.f39555f0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.t6.M != null) {
                org.telegram.ui.ActionBar.t6.O = false;
                org.telegram.ui.ActionBar.t6.P = false;
                org.telegram.ui.ActionBar.t6.M = null;
            }
            org.telegram.ui.ActionBar.t6.u(m91Var.f39555f0, true, m91Var.f39558g0);
            ((ActionBarLayout) m91Var.parentLayout).W(false, false);
        } else {
            ((ActionBarLayout) m91Var.parentLayout).W(false, false);
            File file = new File(m91Var.f39555f0.f20803b);
            org.telegram.ui.ActionBar.s6 s6Var2 = m91Var.f39555f0;
            org.telegram.ui.ActionBar.t6.v(file, s6Var2.f20801a, s6Var2.F, false);
            org.telegram.messenger.vp.r1(m91Var.f39555f0.E).u4(m91Var.f39555f0, null, false, false);
            SharedPreferences.Editor edit = org.telegram.messenger.w0.f19025b.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", m91Var.f39555f0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) m91Var.getParentLayout().getFragmentStack().get(Math.max(0, m91Var.getParentLayout().getFragmentStack().size() - 2));
        m91Var.finishFragment();
        if (m91Var.f39540b == 0) {
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19669p4, s6Var, k10, Boolean.valueOf(m91Var.f39564i0));
        }
        org.telegram.ui.ActionBar.t6.M1(k2Var);
    }

    public static void a0(m91 m91Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = m91Var.W0;
        org.telegram.ui.ActionBar.r6 r6Var = m91Var.f39596w;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            m91Var.V0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_wallPapers.wallpapers.get(i10) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i10);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f19799id))) {
                            m91Var.V0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.f19799id), tL_wallPaper2);
                        }
                        if (r6Var != null && (str = r6Var.f20741o) != null && str.equals(tL_wallPaper2.slug)) {
                            m91Var.X0 = tL_wallPaper2;
                            m91Var.f1(false);
                            m91Var.n1();
                        } else if (r6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = m91Var.X0;
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
            if (!z10 && (tL_wallPaper = m91Var.X0) != null) {
                m91Var.V0.add(0, tL_wallPaper);
            }
            k91 k91Var = m91Var.R0;
            if (k91Var != null) {
                k91Var.f();
            }
            org.telegram.messenger.hs.a0(m91Var.currentAccount).p1(1, tL_wallPapers.wallpapers);
        }
        if (m91Var.X0 == null && r6Var != null && !TextUtils.isEmpty(r6Var.f20741o)) {
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = r6Var.f20741o;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(m91Var.currentAccount).bindRequestToGuid(m91Var.getConnectionsManager().sendRequest(getwallpaper, new g81(m91Var, 0)), m91Var.classGuid);
        }
    }

    @Override
    public final void C(boolean z10) {
        n1();
    }

    @Override
    public final void M(String str) {
        n1();
    }

    public final void P0() {
        AnimatorSet animatorSet = this.C0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.C0 = animatorSet2;
        if (this.F1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f39603y0, View.SCALE_X, this.f39606z1), ObjectAnimator.ofFloat(this.f39603y0, View.SCALE_Y, this.f39606z1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f39603y0, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f39603y0, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f39603y0, View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f39603y0, View.TRANSLATION_Y, 0.0f));
        }
        this.C0.setInterpolator(org.telegram.ui.Components.gr.f26496g);
        this.C0.addListener(new r81(this, 1));
        this.C0.start();
    }

    public final void Q0(boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m91.Q0(boolean):void");
    }

    public final void R0(boolean z10) {
        int i10 = this.f39540b;
        if (i10 == 2) {
            if (!z10) {
                finishFragment();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.t6.p();
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19735z4);
        org.telegram.ui.ActionBar.r6 r6Var = this.f39596w;
        if (i10 == 1) {
            if (this.f39561h0) {
                r6Var.f20732c = this.f39602y;
                r6Var.d = this.D;
                r6Var.e = this.E;
                r6Var.f20733f = this.F;
                r6Var.f20734g = this.G;
                r6Var.h = this.H;
                r6Var.f20735i = this.I;
                r6Var.f20736j = this.J;
                r6Var.f20737k = this.K;
                r6Var.f20738l = this.L;
                r6Var.f20739m = this.M;
                r6Var.f20740n = this.P;
                r6Var.f20741o = this.O;
                r6Var.f20742p = this.N;
            }
            org.telegram.ui.ActionBar.t6.z1(this.f39555f0, false, true, false, false, false);
        } else {
            if (r6Var != null) {
                org.telegram.ui.ActionBar.t6.z1(this.f39555f0, false, this.f39564i0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).W(false, false);
            if (this.f39564i0) {
                org.telegram.ui.ActionBar.s6 s6Var = this.f39555f0;
                if (s6Var.f20803b != null && org.telegram.ui.ActionBar.t6.H.get(s6Var.m()) == null) {
                    new File(s6Var.f20803b).delete();
                }
            }
        }
        if (!z10) {
            finishFragment();
        }
    }

    public final BitmapDrawable S0(Drawable drawable) {
        WeakReference weakReference = this.f39560g2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.f39563h2;
        }
        WeakReference weakReference2 = this.f39560g2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f39560g2 = null;
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            this.f39560g2 = new WeakReference(drawable);
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
            this.f39563h2 = bitmapDrawable;
            bitmapDrawable.setFilterBitmap(true);
            return this.f39563h2;
        }
        this.f39563h2 = null;
        return null;
    }

    public final boolean T0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m91.T0(boolean):boolean");
    }

    public final void U0() {
        int themedColor;
        org.telegram.ui.Components.tl tlVar = this.e;
        int i10 = 0;
        if (tlVar != null) {
            tlVar.H(getThemedColor(org.telegram.ui.ActionBar.t6.G8));
            this.e.O(getThemedColor(org.telegram.ui.ActionBar.t6.E8), false);
        }
        if (this.f39584r != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6)) != this.f39587s) {
            this.f39587s = themedColor;
            this.f39584r.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        ig.s sVar = this.D0;
        if (sVar != null) {
            sVar.invalidate();
        }
        if (this.f39583q1 != null) {
            org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
            if (z4Var != null && z4Var.getBottomSheet() != null) {
                this.parentLayout.getBottomSheet().P(getThemedColor(org.telegram.ui.ActionBar.t6.f21001h5));
                if (this.f39540b == 2 && this.K1 != 0) {
                    this.parentLayout.getBottomSheet().E0(-16777216);
                }
            } else {
                setNavigationBarColor(getThemedColor(org.telegram.ui.ActionBar.t6.f21001h5));
            }
        }
        if (this.K0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.x71[] x71VarArr = this.K0;
                if (i11 >= x71VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.x71 x71Var = x71VarArr[i11];
                if (x71Var != null) {
                    x71Var.invalidate();
                }
                i11++;
            }
        }
        if (this.L0 != null) {
            while (true) {
                org.telegram.ui.Components.x71[] x71VarArr2 = this.L0;
                if (i10 >= x71VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.x71 x71Var2 = x71VarArr2[i10];
                if (x71Var2 != null) {
                    x71Var2.invalidate();
                }
                i10++;
            }
        }
        TextView textView = this.f39557f2;
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, this.f39537a);
        }
        org.telegram.ui.Components.cq cqVar = this.W;
        if (cqVar != null) {
            cqVar.invalidate();
        }
        org.telegram.ui.Components.f10 f10Var = this.f39582q0;
        if (f10Var != null) {
            f10Var.updateColors();
        }
    }

    public final int V0() {
        if (org.telegram.messenger.w3.U(this.currentAccount, -this.K1)) {
            return getMessagesController().f18926v5;
        }
        return getMessagesController().A5;
    }

    public final ArrayList W0() {
        g6 g6Var = new g6(23, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39570k0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21206s8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39590t0, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39590t0, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.E8));
        org.telegram.ui.Components.cq cqVar = this.W;
        if (cqVar != null) {
            org.telegram.ui.ActionBar.t0 t0Var = cqVar.I;
            EditTextBoldCursor[] editTextBoldCursorArr = cqVar.E;
            for (int i10 = 0; i10 < editTextBoldCursorArr.length; i10++) {
                arrayList.add(new org.telegram.ui.ActionBar.c7(editTextBoldCursorArr[i10], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(editTextBoldCursorArr[i10], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21058k6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(editTextBoldCursorArr[i10], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21076l6));
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
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39594v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{a6Var, a6Var2}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21191rb));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39594v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{a6Var, a6Var2}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21209sb));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39594v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{a6Var, a6Var2}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21228tb));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39594v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Kd));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f39594v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Qb));
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            ((org.telegram.ui.ActionBar.c7) arrayList.get(i15)).f20242n = this.f39537a;
        }
        return arrayList;
    }

    public final boolean X0(int i10) {
        int E0;
        long j10;
        if (this.f39561h0) {
            return false;
        }
        org.telegram.ui.ActionBar.r6 r6Var = this.f39596w;
        if (i10 == 1 || i10 == 2) {
            long j11 = this.J;
            if (j11 != 0) {
                if (j11 != r6Var.f20736j) {
                    return true;
                }
            } else {
                int E02 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Be);
                int i11 = (int) r6Var.f20736j;
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
                        j10 = r6Var.f20737k;
                    } else if (i13 == 1) {
                        E0 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.De);
                        j10 = r6Var.f20738l;
                    } else {
                        E0 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ee);
                        j10 = r6Var.f20739m;
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
            } else if (j12 != r6Var.f20737k || j14 != r6Var.f20738l || j13 != r6Var.f20739m) {
                return true;
            }
            if (r6Var.f20740n != this.P) {
                return true;
            }
        }
        if (i10 == 1 || i10 == 3) {
            if (this.f39602y != r6Var.d) {
                return true;
            }
            int i15 = this.E;
            if (i15 != 0) {
                if (i15 != r6Var.e) {
                    return true;
                }
            } else {
                int i16 = r6Var.e;
                if (i16 != 0 && i16 != r6Var.f20732c) {
                    return true;
                }
            }
            int i17 = this.F;
            if (i17 != 0) {
                if (i17 != r6Var.f20733f) {
                    return true;
                }
            } else if (r6Var.f20733f != 0) {
                return true;
            }
            int i18 = this.G;
            if (i18 != 0) {
                if (i18 != r6Var.f20734g) {
                    return true;
                }
            } else if (r6Var.f20734g != 0) {
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
            if (this.I != r6Var.f20735i) {
                return true;
            }
        }
        return false;
    }

    public boolean Y0() {
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && z4Var.getBottomSheet() != null) {
            return true;
        }
        return false;
    }

    public final void Z0() {
        float f7;
        jg.b1 b1Var = this.R1;
        if (b1Var != null) {
            b1Var.invalidate();
        }
        FrameLayout frameLayout = this.f39605z0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f39605z0.getChildAt(i10).invalidate();
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
                org.telegram.ui.Components.x71[] x71VarArr = this.K0;
                if (i12 >= x71VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.x71 x71Var = x71VarArr[i12];
                if (x71Var != null) {
                    if (this.N1) {
                        f7 = this.f39579o1 * this.f39581p1;
                    } else {
                        f7 = 0.0f;
                    }
                    x71Var.setDimAmount(f7);
                    this.K0[i12].invalidate();
                }
                i12++;
            }
        }
        if (this.f39578o0 != null) {
            for (int i13 = 0; i13 < this.f39578o0.getChildCount(); i13++) {
                View childAt = this.f39578o0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.s0) {
                    h1((org.telegram.ui.Cells.s0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.f39594v0 != null) {
            for (int i14 = 0; i14 < this.f39594v0.getChildCount(); i14++) {
                View childAt2 = this.f39594v0.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.s0) {
                    h1((org.telegram.ui.Cells.s0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        d91 d91Var = this.A1;
        if (d91Var != null) {
            d91Var.invalidate();
        }
        d91 d91Var2 = this.B1;
        if (d91Var2 != null) {
            d91Var2.invalidate();
        }
        ig.s sVar = this.D0;
        if (sVar != null) {
            sVar.invalidate();
        }
    }

    public final void a1() {
        org.telegram.ui.ActionBar.r6 r6Var = this.f39596w;
        if (r6Var != null && !TextUtils.isEmpty(r6Var.f20741o)) {
            try {
                File e = r6Var.e();
                Drawable background = this.f39603y0.getBackground();
                Bitmap n10 = this.f39603y0.getImageReceiver().n();
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
                paint.setColorFilter(new PorterDuffColorFilter(this.f39571k1, this.f39591t1));
                paint.setAlpha((int) (this.f39574m1 * 255.0f));
                canvas.drawBitmap(n10, 0.0f, 0.0f, paint);
                FileOutputStream fileOutputStream2 = new FileOutputStream(e);
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
                fileOutputStream2.close();
            } catch (Throwable th2) {
                org.telegram.messenger.f8.g(th2, true);
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21019i5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21001h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20897bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20918ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20899be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20990gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21316yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21174qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21156pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21139ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21227ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21190ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Hj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B8));
    }

    public final void b1() {
        c1(2, true);
    }

    public final void c1(int i10, boolean z10) {
        org.telegram.ui.ActionBar.r6 r6Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (getParentActivity() != null && this.f39575n != i10 && this.f39589s1 == null && (r6Var = this.f39596w) != null) {
            if (z10 && i10 == 2 && (org.telegram.ui.ActionBar.t6.c1() || r6Var.f20736j == 4294967296L)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String L0 = org.telegram.messenger.cd.L0(2131752550, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                if (org.telegram.ui.ActionBar.t6.c1() && (!org.telegram.ui.ActionBar.t6.c1() || org.telegram.ui.ActionBar.t6.I.f20813i0.d == 0)) {
                    x1Var.T = org.telegram.messenger.cd.L0(2131752529, null);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752552, null), new c81(this, 7));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                } else {
                    x1Var.T = org.telegram.messenger.cd.L0(2131752549, null);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746135, null), new c81(this, 5));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751771, null), new c81(this, 6));
                }
                showDialog(x1Var);
                return;
            }
            int i18 = this.f39575n;
            this.f39575n = i10;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        this.h.setText(org.telegram.messenger.cd.L0(2131752014, null));
                        if (r6Var.f20733f != 0) {
                            if (r6Var.h != 0) {
                                i17 = 4;
                            } else if (r6Var.f20734g != 0) {
                                i17 = 3;
                            } else {
                                i17 = 2;
                            }
                        } else {
                            i17 = 1;
                        }
                        org.telegram.ui.Components.cq cqVar = this.W;
                        X0(3);
                        cqVar.f(2, 4, i17, true);
                        this.W.e(r6Var.h, 3);
                        this.W.e(r6Var.f20734g, 2);
                        this.W.e(r6Var.f20733f, 1);
                        org.telegram.ui.Components.cq cqVar2 = this.W;
                        int i19 = r6Var.e;
                        if (i19 == 0) {
                            i19 = r6Var.f20732c;
                        }
                        cqVar2.e(i19, 0);
                        this.L0[1].b(0, r6Var.e);
                        this.L0[1].b(1, r6Var.f20733f);
                        this.L0[1].b(2, r6Var.f20734g);
                        this.L0[1].b(3, r6Var.h);
                        if (r6Var.f20734g != 0) {
                            if (i18 == 1) {
                                this.f39597w0.i(0);
                            } else {
                                this.f39597w0.g(0);
                            }
                        } else if (i18 == 2) {
                            this.f39597w0.s(0);
                        }
                        this.f39594v0.w0(0, org.telegram.messenger.i0.L(60.0f), null);
                        i1();
                    }
                    i11 = i18;
                } else {
                    this.h.setText(org.telegram.messenger.cd.L0(2131752016, null));
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
                    long j10 = r6Var.f20737k;
                    int i23 = (int) j10;
                    if (i23 == 0 && j10 != 0) {
                        i13 = 0;
                    }
                    long j11 = r6Var.f20738l;
                    int i24 = (int) j11;
                    if (i24 == 0 && j11 != 0) {
                        i14 = 0;
                    }
                    long j12 = r6Var.f20739m;
                    int i25 = (int) j12;
                    if (i25 == 0 && j12 != 0) {
                        i15 = 0;
                    }
                    int i26 = (int) r6Var.f20736j;
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
                    X0(2);
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
                    if (i11 != 1 && r6Var.f20734g != 0) {
                        this.f39597w0.g(0);
                    } else {
                        this.f39597w0.i(0);
                    }
                    this.f39594v0.w0(0, org.telegram.messenger.i0.L(60.0f), null);
                }
            } else {
                i11 = i18;
                this.h.setText(org.telegram.messenger.cd.L0(2131752015, null));
                if (r6Var.d != 0) {
                    i12 = 2;
                } else {
                    i12 = 1;
                }
                org.telegram.ui.Components.cq cqVar8 = this.W;
                X0(1);
                cqVar8.f(1, 2, i12, false);
                this.W.e(r6Var.f20732c, 0);
                int i27 = r6Var.d;
                if (i27 != 0) {
                    this.W.e(i27, 1);
                }
                if (i11 == 2 || (i11 == 3 && r6Var.f20734g != 0)) {
                    this.f39597w0.s(0);
                }
            }
            if (i10 != 1 && i10 != 3) {
                this.W.setMinBrightness(0.0f);
                this.W.setMaxBrightness(1.0f);
                return;
            }
            if (i11 == 2 && this.M0[1].getVisibility() == 0) {
                j1(0, true, true);
            }
            if (i10 == 1) {
                if (this.f39555f0.q()) {
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
    public final android.view.View createView(android.content.Context r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m91.createView(android.content.Context):android.view.View");
    }

    public final void d1(int i10) {
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
        ValueAnimator valueAnimator = this.f39550d2;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f39550d2.cancel();
        }
        c91[] c91VarArr = this.f39600x0;
        c91 c91Var = c91VarArr[0];
        c91 c91Var2 = c91VarArr[1];
        c91VarArr[0] = c91Var2;
        c91VarArr[1] = c91Var;
        this.f39592u0.removeView(c91Var2);
        this.f39592u0.addView(c91VarArr[0], this.f39592u0.indexOfChild(c91VarArr[1]) + 1);
        c91 c91Var3 = c91VarArr[0];
        this.f39603y0 = c91Var3;
        c91Var3.setBackground(c91VarArr[1].getBackground());
        o1();
        c91VarArr[1].setVisibility(0);
        c91VarArr[1].setAlpha(1.0f);
        this.f39603y0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f39550d2 = ofFloat;
        ofFloat.addUpdateListener(new cj(2, this));
        this.f39550d2.addListener(new r81(this, 0));
        this.f39550d2.setInterpolator(org.telegram.ui.Components.gr.f26495f);
        this.f39550d2.setDuration(300L);
        this.f39550d2.start();
        this.f39603y0.getImageReceiver().f14407s1 = 300;
        this.f39603y0.getImageReceiver().r0(org.telegram.messenger.ic.b(tL_wallPaper2.document), this.H1, null, null, null, tL_wallPaper2.document.size, "jpg", tL_wallPaper2, 1);
        this.f39603y0.d();
        this.X0 = tL_wallPaper2;
        this.F1 = this.K0[2].f32419s;
        n1();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i10 == org.telegram.messenger.zs.f19668p3) {
            if (this.K1 == ((Long) objArr[2]).longValue()) {
                this.W1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                l1(true);
            }
        } else if (i10 == org.telegram.messenger.zs.f19630i4) {
            org.telegram.ui.Components.tk0 tk0Var = this.f39578o0;
            if (tk0Var != null) {
                int childCount = tk0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f39578o0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.v2) {
                        ((org.telegram.ui.Cells.v2) childAt).i0(0, true);
                    }
                }
            }
        } else if (i10 == org.telegram.messenger.zs.f19636j4) {
            i81 i81Var = this.f39594v0;
            if (i81Var != null) {
                i81Var.g1();
            }
        } else if (i10 == org.telegram.messenger.zs.f19735z4) {
            if (this.f39592u0 != null) {
                f1(true);
            }
        } else if (i10 == org.telegram.messenger.zs.f19612f4) {
            Object obj = this.C1;
            if (obj instanceof ne1) {
                ne1 ne1Var = (ne1) obj;
                if (ne1Var.f39922a == null) {
                    ne1Var.f39922a = (String) objArr[0];
                }
            }
        } else {
            long j10 = 0;
            if (i10 == org.telegram.messenger.zs.f19606e4) {
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
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f19799id))) {
                            this.V0.add(wallPaper);
                            hashMap.put(Long.valueOf(wallPaper.document.f19799id), wallPaper);
                        }
                        org.telegram.ui.ActionBar.r6 r6Var = this.f39596w;
                        if (r6Var != null && (str = r6Var.f20741o) != null && str.equals(wallPaper.slug)) {
                            this.X0 = (TLRPC.TL_wallPaper) wallPaper;
                            f1(false);
                            n1();
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
                k91 k91Var = this.R0;
                if (k91Var != null) {
                    k91Var.f();
                }
                int size2 = arrayList.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i14);
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        j10 = org.telegram.messenger.ui.p(j10, wallPaper2.f19947id);
                    }
                }
                TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
                getwallpapers.hash = j10;
                ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new g81(this, 1)), this.classGuid);
            } else if (i10 == org.telegram.messenger.zs.f19703u5 && this.K1 != 0) {
                finishFragment();
            }
        }
    }

    public final void e1(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.jb0 jb0Var;
        if (i11 == 0) {
            this.f39539a1 = i10;
        } else if (i11 == 1) {
            this.f39546c1 = i10;
        } else if (i11 == 2) {
            this.f39549d1 = i10;
        } else if (i11 == 3) {
            this.f39552e1 = i10;
        }
        q1(z10);
        if (this.K0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.x71[] x71VarArr = this.K0;
                if (i12 >= x71VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.x71 x71Var = x71VarArr[i12];
                if (x71Var != null) {
                    x71Var.b(i11, i10);
                }
                i12++;
            }
        }
        if (this.f39549d1 != 0) {
            if (this.U0 != null && org.telegram.ui.ActionBar.t6.I.q()) {
                this.U0.setTwoSided(true);
            }
            Drawable background = this.f39603y0.getBackground();
            if (background instanceof org.telegram.ui.Components.jb0) {
                jb0Var = (org.telegram.ui.Components.jb0) background;
            } else {
                jb0Var = new org.telegram.ui.Components.jb0();
                jb0Var.q(this.f39603y0);
                if (this.E1) {
                    jb0Var.m(false);
                }
            }
            jb0Var.n(this.f39539a1, this.f39546c1, this.f39549d1, this.f39552e1);
            this.f39603y0.setBackground(jb0Var);
            this.f39571k1 = jb0Var.f();
            this.l1 = 754974720;
        } else if (this.f39546c1 != 0) {
            this.f39603y0.setBackground(new GradientDrawable(org.telegram.ui.Components.f9.d(this.f39565i1), new int[]{this.f39539a1, this.f39546c1}));
            int V0 = org.telegram.messenger.i0.V0(org.telegram.messenger.i0.w0(this.f39539a1, this.f39546c1), false);
            this.l1 = V0;
            this.f39571k1 = V0;
        } else {
            this.f39603y0.setBackgroundColor(this.f39539a1);
            int V02 = org.telegram.messenger.i0.V0(this.f39539a1, false);
            this.l1 = V02;
            this.f39571k1 = V02;
        }
        int i13 = org.telegram.ui.ActionBar.t6.Zc;
        boolean f12 = org.telegram.ui.ActionBar.t6.f1(i13);
        n81 n81Var = this.f39537a;
        if (f12 && !(this.f39603y0.getBackground() instanceof org.telegram.ui.Components.jb0)) {
            if (org.telegram.ui.ActionBar.t6.t0() instanceof org.telegram.ui.Components.jb0) {
                getThemedColor(i13);
                n81Var.k(this.f39603y0.getBackground(), this.f39603y0.getBackground(), Float.valueOf(this.f39574m1));
            }
        } else {
            n81Var.k(this.f39603y0.getBackground(), this.f39603y0.getBackground(), Float.valueOf(this.f39574m1));
        }
        ImageView imageView = this.G0;
        if (imageView != null) {
            org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.Wc, n81Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.H0;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.Wc, n81Var, PorterDuff.Mode.MULTIPLY);
        }
        c91 c91Var = this.f39603y0;
        if (c91Var != null) {
            c91Var.getImageReceiver().f14397o1 = new PorterDuffColorFilter(this.f39571k1, this.f39591t1);
            this.f39603y0.getImageReceiver().setAlpha(Math.abs(this.f39574m1));
            this.f39603y0.invalidate();
            if (org.telegram.ui.ActionBar.t6.I.q() && (this.f39603y0.getBackground() instanceof org.telegram.ui.Components.jb0)) {
                org.telegram.ui.Cells.h0 h0Var = this.U0;
                if (h0Var != null) {
                    h0Var.setTwoSided(true);
                }
                if (this.f39574m1 < 0.0f) {
                    this.f39603y0.getImageReceiver().m0(((org.telegram.ui.Components.jb0) this.f39603y0.getBackground()).f27287k);
                }
            } else {
                this.f39603y0.getImageReceiver().m0(null);
                org.telegram.ui.Cells.h0 h0Var2 = this.U0;
                if (h0Var2 != null) {
                    h0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.h0 h0Var3 = this.U0;
            if (h0Var3 != null) {
                h0Var3.setProgress(this.f39574m1);
            }
        }
        i81 i81Var = this.f39594v0;
        if (i81Var != null) {
            i81Var.g1();
        }
        FrameLayout frameLayout = this.f39605z0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                this.f39605z0.getChildAt(i14).invalidate();
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

    public final void f1(boolean z10) {
        org.telegram.ui.Components.jb0 jb0Var;
        org.telegram.ui.Components.jb0 jb0Var2;
        int i10;
        int g10;
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.ActionBar.r6 r6Var = this.f39596w;
        int i11 = this.f39540b;
        if (i11 == 0 && r6Var == null) {
            this.f39603y0.setBackground(org.telegram.ui.ActionBar.t6.s0());
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
                        bitmapDrawable = new BitmapDrawable(org.telegram.messenger.hc.F("b", photoSize.bytes));
                    }
                    c91 c91Var = this.f39603y0;
                    c91Var.f26292a.r0(org.telegram.messenger.ic.b(tL_wallPaper.document), this.H1, org.telegram.messenger.ic.c(photoSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    c91Var.d();
                } else if (obj instanceof me1) {
                    me1 me1Var = (me1) obj;
                    int i12 = me1Var.f39689f;
                    int i13 = me1Var.e;
                    int i14 = me1Var.d;
                    int i15 = me1Var.f39688c;
                    int i16 = me1Var.f39687b;
                    this.f39565i1 = i12;
                    e1(i16, 0, false);
                    if (i15 != 0) {
                        e1(i15, 1, false);
                    }
                    e1(i14, 2, false);
                    e1(i13, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.X0;
                    if (tL_wallPaper2 != null) {
                        c91 c91Var2 = this.f39603y0;
                        org.telegram.messenger.ic b10 = org.telegram.messenger.ic.b(tL_wallPaper2.document);
                        String str = this.H1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.X0;
                        c91Var2.g(1, tL_wallPaper3.document.size, tL_wallPaper3, str, null, "jpg", b10, null);
                    } else if ("d".equals(me1Var.f39686a)) {
                        Point point = org.telegram.messenger.i0.f16026q;
                        int min = Math.min(point.x, point.y);
                        int max = Math.max(point.x, point.y);
                        if (Build.VERSION.SDK_INT >= 29) {
                            g10 = 1459617792;
                        } else {
                            g10 = org.telegram.ui.Components.jb0.g(i16, i15, i14, i13);
                        }
                        this.f39603y0.setImageBitmap(org.telegram.messenger.d00.d(2131623997, min, max, g10));
                    }
                } else if (obj instanceof ne1) {
                    Bitmap bitmap = this.D1;
                    if (bitmap != null) {
                        this.f39603y0.setImageBitmap(bitmap);
                    } else {
                        ne1 ne1Var = (ne1) obj;
                        File file = ne1Var.e;
                        if (file != null) {
                            this.f39603y0.h(file.getAbsolutePath(), this.H1, null);
                        } else {
                            File file2 = ne1Var.d;
                            if (file2 != null) {
                                this.f39603y0.h(file2.getAbsolutePath(), this.H1, null);
                            } else if ("t".equals(ne1Var.f39922a)) {
                                c91 c91Var3 = this.f39603y0;
                                c91Var3.setImageDrawable(org.telegram.ui.ActionBar.t6.Z0(c91Var3, false));
                            } else {
                                int i17 = ne1Var.f39923b;
                                if (i17 != 0) {
                                    this.f39603y0.setImageResource(i17);
                                }
                            }
                        }
                    }
                } else if (obj instanceof org.telegram.messenger.hf) {
                    org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                    TLRPC.Photo photo = hfVar.K;
                    if (photo != null) {
                        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(photo.sizes, 100, false, null, false);
                        TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(hfVar.K.sizes, this.I1, true, null, false);
                        if (w10 != w9) {
                            photoSize2 = w10;
                        }
                        if (photoSize2 != null) {
                            i10 = photoSize2.size;
                        } else {
                            i10 = 0;
                        }
                        this.f39603y0.g(1, i10, hfVar, this.H1, "100_100_b", "jpg", org.telegram.messenger.ic.i(photoSize2, hfVar.K), org.telegram.messenger.ic.i(w9, hfVar.K));
                    } else {
                        c91 c91Var4 = this.f39603y0;
                        String str2 = hfVar.C;
                        String str3 = this.H1;
                        String str4 = hfVar.D;
                        c91Var4.getClass();
                        c91Var4.o(org.telegram.messenger.ic.g(str2), str3, org.telegram.messenger.ic.g(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (r6Var == null) {
                this.f39603y0.setBackground(org.telegram.ui.ActionBar.t6.s0());
            } else {
                org.telegram.ui.Components.a9 a9Var = this.f39595v1;
                if (a9Var != null) {
                    a9Var.dispose();
                    this.f39595v1 = null;
                }
                int E0 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Be);
                int i18 = (int) r6Var.f20736j;
                if (i18 != 0) {
                    E0 = i18;
                }
                int E02 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ce);
                long j10 = r6Var.f20737k;
                int i19 = (int) j10;
                if (i19 == 0 && j10 != 0) {
                    E02 = 0;
                } else if (i19 != 0) {
                    E02 = i19;
                }
                int E03 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.De);
                long j11 = r6Var.f20738l;
                int i20 = (int) j11;
                if (i20 == 0 && j11 != 0) {
                    E03 = 0;
                } else if (i20 != 0) {
                    E03 = i20;
                }
                int E04 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ee);
                long j12 = r6Var.f20739m;
                int i21 = (int) j12;
                if (i21 == 0 && j12 != 0) {
                    E04 = 0;
                } else if (i21 != 0) {
                    E04 = i21;
                }
                if (!TextUtils.isEmpty(r6Var.f20741o) && !org.telegram.ui.ActionBar.t6.c1()) {
                    if (E03 != 0) {
                        Drawable background = this.f39603y0.getBackground();
                        if (background instanceof org.telegram.ui.Components.jb0) {
                            jb0Var2 = (org.telegram.ui.Components.jb0) background;
                        } else {
                            org.telegram.ui.Components.jb0 jb0Var3 = new org.telegram.ui.Components.jb0();
                            jb0Var3.q(this.f39603y0);
                            jb0Var2 = jb0Var3;
                            if (this.E1) {
                                jb0Var3.m(false);
                                jb0Var2 = jb0Var3;
                            }
                        }
                        jb0Var2.n(E0, E02, E03, E04);
                        jb0Var = jb0Var2;
                    } else if (E02 != 0) {
                        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9(org.telegram.ui.Components.f9.d(r6Var.f20740n), new int[]{E0, E02});
                        this.f39595v1 = f9Var.f(k2.m0.j0(0.5f, 3), new v81(this, 0), 100L);
                        jb0Var = f9Var;
                    } else {
                        jb0Var = new ColorDrawable(E0);
                    }
                    this.f39603y0.setBackground(jb0Var);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.X0;
                    if (tL_wallPaper4 != null) {
                        c91 c91Var5 = this.f39603y0;
                        org.telegram.messenger.ic b11 = org.telegram.messenger.ic.b(tL_wallPaper4.document);
                        String str5 = this.H1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.X0;
                        c91Var5.g(1, tL_wallPaper5.document.size, tL_wallPaper5, str5, null, "jpg", b11, null);
                    }
                } else {
                    Drawable t02 = org.telegram.ui.ActionBar.t6.t0();
                    if (t02 != null) {
                        if (t02 instanceof org.telegram.ui.Components.jb0) {
                            ((org.telegram.ui.Components.jb0) t02).q(this.f39603y0);
                        }
                        this.f39603y0.setBackground(t02);
                    }
                }
                if (E02 == 0) {
                    int V0 = org.telegram.messenger.i0.V0(E0, false);
                    this.l1 = V0;
                    this.f39571k1 = V0;
                } else if (E03 != 0) {
                    this.f39571k1 = org.telegram.ui.Components.jb0.g(E0, E02, E03, E04);
                    this.l1 = 754974720;
                } else {
                    int V02 = org.telegram.messenger.i0.V0(org.telegram.messenger.i0.w0(E0, E02), false);
                    this.l1 = V02;
                    this.f39571k1 = V02;
                }
                c91 c91Var6 = this.f39603y0;
                if (c91Var6 != null) {
                    c91Var6.getImageReceiver().f14397o1 = new PorterDuffColorFilter(this.f39571k1, this.f39591t1);
                    this.f39603y0.getImageReceiver().setAlpha(Math.abs(this.f39574m1));
                    this.f39603y0.invalidate();
                    if (org.telegram.ui.ActionBar.t6.I.q() && (this.f39603y0.getBackground() instanceof org.telegram.ui.Components.jb0)) {
                        org.telegram.ui.Cells.h0 h0Var = this.U0;
                        if (h0Var != null) {
                            h0Var.setTwoSided(true);
                        }
                        if (this.f39574m1 < 0.0f) {
                            this.f39603y0.getImageReceiver().m0(((org.telegram.ui.Components.jb0) this.f39603y0.getBackground()).f27287k);
                        }
                    } else {
                        this.f39603y0.getImageReceiver().m0(null);
                        org.telegram.ui.Cells.h0 h0Var2 = this.U0;
                        if (h0Var2 != null) {
                            h0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.h0 h0Var3 = this.U0;
                    if (h0Var3 != null) {
                        h0Var3.setProgress(this.f39574m1);
                    }
                }
                if (this.K0 != null) {
                    int i22 = 0;
                    while (true) {
                        org.telegram.ui.Components.x71[] x71VarArr = this.K0;
                        if (i22 >= x71VarArr.length) {
                            break;
                        }
                        x71VarArr[i22].b(0, E0);
                        this.K0[i22].b(1, E02);
                        this.K0[i22].b(2, E03);
                        this.K0[i22].b(3, E04);
                        i22++;
                    }
                }
                ImageView imageView = this.G0;
                n81 n81Var = this.f39537a;
                if (imageView != null) {
                    org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.Wc, n81Var, PorterDuff.Mode.MULTIPLY);
                }
                ImageView imageView2 = this.H0;
                if (imageView2 != null) {
                    org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.Wc, n81Var, PorterDuff.Mode.MULTIPLY);
                }
                Z0();
            }
        }
        this.E1 = false;
    }

    public final void g1(long j10) {
        boolean z10;
        this.K1 = j10;
        if (j10 != 0 && j10 != getUserConfig().e()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.L1 = z10;
    }

    @Override
    public final int getObserverTag() {
        return this.f39593u1;
    }

    @Override
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.f39537a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.M1) {
            return W0();
        }
        return super.getThemeDescriptions();
    }

    public final void h1(org.telegram.ui.Cells.s0 s0Var) {
        n81 n81Var;
        float f7;
        if (this.f39603y0 == null) {
            return;
        }
        Bitmap bitmap = this.f39537a.f39873i;
        float f10 = 0.0f;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f7 = ((this.f39603y0.getMeasuredWidth() - (Math.max(this.f39603y0.getMeasuredWidth() / width, this.f39603y0.getMeasuredHeight() / n81Var.f39873i.getHeight()) * width)) / 2.0f) + this.Y1 + 0.0f;
        } else {
            f7 = this.Y1 + 0.0f;
        }
        float y3 = s0Var.getY() - ((-this.f39603y0.J) + 0.0f);
        int measuredHeight = this.f39603y0.getMeasuredHeight();
        if (this.N1) {
            f10 = this.f39579o1 * this.f39581p1;
        }
        s0Var.f22955w0 = true;
        s0Var.f22952v0 = measuredHeight;
        s0Var.f22948t0 = y3;
        s0Var.f22950u0 = f7;
        s0Var.f22895b2 = f10;
        s0Var.f22898c2.setColor(i0.b.o(-16777216, (int) (f10 * 255.0f)));
        s0Var.invalidate();
    }

    public final void i1() {
        if (this.f39592u0 != null && this.L0 != null && this.f39596w.f20734g != 0) {
            SharedPreferences d12 = org.telegram.messenger.vp.d1();
            if (!d12.getBoolean("bganimationhint", false)) {
                if (this.B0 == null) {
                    org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(getParentActivity(), 8);
                    this.B0 = q30Var;
                    q30Var.setShowingDuration(5000L);
                    this.B0.setAlpha(0.0f);
                    this.B0.setVisibility(4);
                    this.B0.setText(org.telegram.messenger.cd.L0(2131753751, null));
                    this.B0.setExtraTranslationY(org.telegram.messenger.i0.L(6.0f));
                    this.f39573l0.addView(this.B0, w7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                org.telegram.messenger.i0.h3(new t11(7, this, d12), 500L);
            }
        }
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.f39540b == 2) {
            if (this.f39543b2 && motionEvent != null) {
                if (motionEvent.getY() > org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16020m) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final void j1(int i10, boolean z10, boolean z11) {
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
        int i17 = this.f39540b;
        if (z10) {
            if (i10 == 0) {
                if (i17 == 2) {
                    this.f39542b1 = this.f39539a1;
                    int i18 = this.f39546c1;
                    this.f39556f1 = i18;
                    int i19 = this.f39549d1;
                    this.f39559g1 = i19;
                    int i20 = this.f39552e1;
                    this.f39562h1 = i20;
                    this.f39568j1 = this.P;
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
                    this.W.e(this.f39552e1, 3);
                    this.W.e(this.f39549d1, 2);
                    this.W.e(this.f39546c1, 1);
                    this.W.e(this.f39539a1, 0);
                }
            } else {
                this.Y0 = this.X0;
                this.f39577n1 = this.f39574m1;
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
            org.telegram.ui.Components.x71[] x71VarArr = this.K0;
            if (z12) {
                c10 = 2;
            } else {
                c10 = 0;
            }
            x71VarArr[c10].setVisibility(0);
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.h0 h0Var = this.U0;
            if (!h0Var.M) {
                float f19 = this.f39574m1;
                if (f19 < 0.0f) {
                    float f20 = -f19;
                    this.f39574m1 = f20;
                    h0Var.setProgress(f20);
                }
            }
        }
        int i21 = 58;
        float f21 = 1.0f;
        FrameLayout[] frameLayoutArr = this.M0;
        if (z11) {
            this.f39589s1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            if (i10 == 0) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            if (z10) {
                frameLayoutArr[i10].setVisibility(0);
                if (i17 == 1) {
                    i81 i81Var = this.f39594v0;
                    Property property = View.TRANSLATION_Y;
                    if (i10 == 1) {
                        f16 = -org.telegram.messenger.i0.L(21.0f);
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(i81Var, property, f16));
                    org.telegram.ui.Components.x71 x71Var = this.K0[2];
                    Property property2 = View.ALPHA;
                    if (z12) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(x71Var, property2, f17));
                    org.telegram.ui.Components.x71 x71Var2 = this.K0[0];
                    if (z12) {
                        f18 = 0.0f;
                    } else {
                        f18 = 1.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(x71Var2, property2, f18));
                    if (i10 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property2, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i12], property2, 0.0f));
                    }
                    org.telegram.messenger.i0.v1(this.W.E[1]);
                } else if (i17 == 2) {
                    i81 i81Var2 = this.f39594v0;
                    Property property3 = View.TRANSLATION_Y;
                    int i22 = -frameLayoutArr[i10].getMeasuredHeight();
                    if (this.B1 == null) {
                        i21 = 0;
                    }
                    int L = org.telegram.messenger.i0.L(i21 + 72) + i22;
                    if (Y0()) {
                        i13 = org.telegram.messenger.i0.f16021n;
                    } else {
                        i13 = 0;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(i81Var2, property3, L + i13));
                    org.telegram.ui.Components.x71 x71Var3 = this.K0[2];
                    Property property4 = View.ALPHA;
                    if (z12) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(x71Var3, property4, f15));
                    org.telegram.ui.Components.x71 x71Var4 = this.K0[0];
                    if (z12) {
                        f21 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(x71Var4, property4, f21));
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
                i81 i81Var3 = this.f39594v0;
                Property property5 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(i81Var3, property5, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property5, frameLayout2.getMeasuredHeight()));
                org.telegram.ui.Components.x71 x71Var5 = this.K0[0];
                Property property6 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(x71Var5, property6, 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.K0[2], property6, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.f39603y0, property6, 1.0f));
            }
            this.f39589s1.playTogether(arrayList2);
            this.f39589s1.addListener(new u81(this, z10, i12, i10, z12));
            this.f39589s1.setInterpolator(org.telegram.ui.Components.gr.f26496g);
            this.f39589s1.setDuration(200L);
            this.f39589s1.start();
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
                i81 i81Var4 = this.f39594v0;
                if (i10 == 1) {
                    f12 = -org.telegram.messenger.i0.L(21.0f);
                } else {
                    f12 = 0.0f;
                }
                i81Var4.setTranslationY(f12);
                org.telegram.ui.Components.x71 x71Var6 = this.K0[2];
                if (z12) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                x71Var6.setAlpha(f13);
                org.telegram.ui.Components.x71 x71Var7 = this.K0[0];
                if (z12) {
                    f14 = 0.0f;
                } else {
                    f14 = 1.0f;
                }
                x71Var7.setAlpha(f14);
                if (i10 == 1) {
                    frameLayoutArr[i10].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    frameLayoutArr[c11].setAlpha(0.0f);
                }
                org.telegram.messenger.i0.v1(this.W.E[1]);
            } else if (i17 == 2) {
                i81 i81Var5 = this.f39594v0;
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
                if (Y0()) {
                    i11 = org.telegram.messenger.i0.f16021n;
                } else {
                    i11 = 0;
                }
                i81Var5.setTranslationY(L2 + i11);
                org.telegram.ui.Components.x71 x71Var8 = this.K0[2];
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                x71Var8.setAlpha(f10);
                org.telegram.ui.Components.x71 x71Var9 = this.K0[0];
                if (z12) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                x71Var9.setAlpha(f11);
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
            this.f39594v0.setTranslationY(0.0f);
            frameLayoutArr[i10].setTranslationY(frameLayout.getMeasuredHeight());
            this.K0[0].setAlpha(1.0f);
            this.K0[2].setAlpha(1.0f);
            this.f39603y0.setAlpha(1.0f);
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
        org.telegram.ui.Components.x71[] x71VarArr2 = this.K0;
        if (!z12) {
            c12 = 2;
        }
        x71VarArr2[c12].setVisibility(4);
    }

    public final void k1() {
        Window window;
        if (this.f39566i2 != null) {
            return;
        }
        if (Y0()) {
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
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.i0.f16021n;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        ic icVar = new ic(this, getParentActivity(), canvas, (this.P1.getMeasuredWidth() / 2.0f) + f7, (this.P1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 2);
        this.f39566i2 = icVar;
        icVar.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
        this.f39569j2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f39572k2 = ofFloat;
        ofFloat.addUpdateListener(new jc(this, 2));
        this.f39572k2.addListener(new r81(this, 4));
        this.f39572k2.setDuration(400L);
        this.f39572k2.setInterpolator(org.telegram.ui.Components.vs.e);
        this.f39572k2.start();
        frameLayout.addView(this.f39566i2, new ViewGroup.LayoutParams(-1, -1));
        org.telegram.messenger.i0.g3(new a81(this, 2));
    }

    public final void l1(boolean z10) {
        int i10 = (this.K1 > 0L ? 1 : (this.K1 == 0L ? 0 : -1));
        if (i10 > 0) {
            this.A1.d(org.telegram.messenger.cd.L0(2131754212, null));
        } else if (i10 < 0) {
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-this.K1));
            if (L0 != null) {
                this.A1.d(org.telegram.messenger.cd.a0(null, null, 2131754213, L0.title));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < V0()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                    if (this.f39586r1 == null) {
                        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(2131231975, 0);
                        this.f39586r1 = dqVar;
                        dqVar.f25507n = 1;
                    }
                    spannableStringBuilder.setSpan(this.f39586r1, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.cd.G(V0(), "ReactionLevelRequiredBtn", new Object[0]));
                    this.A1.c(spannableStringBuilder, z10);
                    return;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.W1;
                if (tL_premium_boostsStatus2 == null) {
                    if (this.K1 < 0 && !this.U1 && !this.V1 && tL_premium_boostsStatus2 == null) {
                        this.U1 = true;
                        getMessagesController().G0().a(this.K1, new d81(this, 1));
                        return;
                    }
                    return;
                }
                this.A1.c(null, z10);
                return;
            }
            this.A1.d(org.telegram.messenger.cd.a0(null, null, 2131754213, org.telegram.messenger.cd.L0(2131754904, null).toLowerCase()));
        } else {
            this.A1.d(org.telegram.messenger.cd.L0(2131754214, null));
        }
    }

    public final void m1() {
        if (this.G1 && this.f39601x1 == null) {
            Bitmap bitmap = this.D1;
            if (bitmap != null) {
                this.f39604y1 = bitmap;
                this.f39601x1 = Utilities.e(bitmap);
            } else {
                ImageReceiver imageReceiver = this.f39603y0.getImageReceiver();
                if (imageReceiver.L() || imageReceiver.m0 != null) {
                    this.f39604y1 = imageReceiver.n();
                    this.f39601x1 = Utilities.e(imageReceiver.n());
                }
            }
        }
        if (this.G1) {
            Bitmap bitmap2 = this.f39601x1;
            if (bitmap2 != null) {
                this.f39603y0.setImageBitmap(bitmap2);
                return;
            }
            return;
        }
        f1(false);
    }

    public final void n1() {
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
        if (z10 || (obj instanceof org.telegram.messenger.hf)) {
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
                org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                TLRPC.Photo photo = hfVar.K;
                if (photo != null) {
                    TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(photo.sizes, this.I1, true, null, false);
                    org.telegram.messenger.b8.G(this.currentAccount);
                    A = org.telegram.messenger.b8.K(w9, null, true, true);
                    name = org.telegram.messenger.b8.r(null, w9);
                    i10 = w9.size;
                } else {
                    A = org.telegram.messenger.hc.A(hfVar.C);
                    name = A.getName();
                    i10 = hfVar.G;
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
            int i11 = this.f39540b;
            if (exists) {
                org.telegram.messenger.b6.q(this.currentAccount).v(this);
                this.f39603y0.invalidate();
                if (i11 == 2) {
                    if (j10 != 0 && this.K1 == 0) {
                        this.f39590t0.setSubtitle(org.telegram.messenger.i0.i0(j10, false, false));
                    } else {
                        this.f39590t0.setSubtitle(null);
                    }
                }
            } else {
                org.telegram.messenger.b6.q(this.currentAccount).a(str, null, this);
                if (i11 == 2 && this.K1 == 0) {
                    this.f39590t0.setSubtitle(org.telegram.messenger.cd.L0(2131748788, null));
                }
                this.f39603y0.invalidate();
            }
            float f11 = 0.5f;
            if (this.X0 == null && (frameLayout = this.f39605z0) != null) {
                if (exists) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                frameLayout.setAlpha(f10);
            }
            if (i11 == 0) {
                this.f39548d0.setEnabled(exists);
                TextView textView = this.f39548d0;
                if (exists) {
                    f11 = 1.0f;
                }
                textView.setAlpha(f11);
            } else if (i11 == 2) {
                this.D0.setEnabled(exists);
                d91 d91Var = this.A1;
                if (d91Var != null) {
                    if (exists) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.5f;
                    }
                    d91Var.setAlpha(f7);
                }
                d91 d91Var2 = this.B1;
                if (d91Var2 != null) {
                    if (exists) {
                        f11 = 1.0f;
                    }
                    d91Var2.setAlpha(f11);
                }
            } else {
                this.f39554f.setEnabled(exists);
                org.telegram.ui.ActionBar.t0 t0Var = this.f39554f;
                if (exists) {
                    f11 = 1.0f;
                }
                t0Var.setAlpha(f11);
            }
        }
    }

    public final void o1() {
        this.f39603y0.getImageReceiver().setAlpha(Math.abs(this.f39574m1));
        this.f39603y0.invalidate();
        this.Q0.g1();
        if (this.f39574m1 >= 0.0f) {
            this.f39603y0.getImageReceiver().m0(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f39603y0.getImageReceiver().Z(null);
            }
            if (this.f39603y0.getBackground() instanceof org.telegram.ui.Components.jb0) {
                this.f39603y0.getImageReceiver().m0(((org.telegram.ui.Components.jb0) this.f39603y0.getBackground()).f27287k);
            }
        }
        this.f39537a.k(this.f39603y0.getBackground(), this.f39603y0.getBackground(), Float.valueOf(this.f39574m1));
        Z0();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!T0(z10)) {
            return false;
        }
        R0(true);
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBottomSheetCreated() {
        super.onBottomSheetCreated();
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && z4Var.getBottomSheet() != null) {
            this.parentLayout.getBottomSheet().P(getThemedColor(org.telegram.ui.ActionBar.t6.f21001h5));
            if (this.f39540b == 2 && this.K1 != 0) {
                this.parentLayout.getBottomSheet().E0(-16777216);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19668p3);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19630i4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19636j4);
        getNotificationCenter().c(this, org.telegram.messenger.zs.f19703u5);
        int i10 = this.f39540b;
        if (i10 == 1 || i10 == 0) {
            org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19735z4);
        }
        if (i10 == 2 || i10 == 1) {
            org.telegram.ui.ActionBar.t6.N = true;
        }
        if (i10 == 0 && this.f39596w == null) {
            this.F1 = org.telegram.ui.ActionBar.t6.f21014i0;
        } else {
            Point point = org.telegram.messenger.i0.f16026q;
            int min = Math.min(point.x, point.y);
            int max = Math.max(point.x, point.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / org.telegram.messenger.i0.f16025p));
            sb2.append("_");
            this.H1 = a1.g.p(sb2, (int) (max / org.telegram.messenger.i0.f16025p), "_f");
            this.I1 = Math.max(point.x, point.y);
            org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19612f4);
            org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19606e4);
            this.f39593u1 = org.telegram.messenger.b6.q(this.currentAccount).k();
            if (this.V0 == null) {
                this.V0 = new ArrayList();
                org.telegram.messenger.hs.a0(this.currentAccount).p0();
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19668p3);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19630i4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19636j4);
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19703u5);
        fg.i iVar = this.f39573l0;
        if (iVar != null && this.R != null) {
            iVar.getViewTreeObserver().removeOnGlobalLayoutListener(this.R);
        }
        int i10 = this.f39540b;
        if ((i10 == 2 || i10 == 1) && this.f39583q1 == null) {
            org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.m0(16));
        }
        int i11 = org.telegram.messenger.zs.f19735z4;
        if (i10 == 2) {
            Bitmap bitmap = this.f39601x1;
            if (bitmap != null) {
                bitmap.recycle();
                this.f39601x1 = null;
            }
            this.f39537a.k(null, null, null);
            org.telegram.messenger.zs.e().k(i11, new Object[0]);
        } else if (i10 == 1 || i10 == 0) {
            org.telegram.messenger.zs.e().n(this, i11);
        }
        if (i10 != 0 || this.f39596w != null) {
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19612f4);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19606e4);
        }
        super.onFragmentDestroy();
        S0(null);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.F1) {
            this.f39598w1.c(false);
        }
        org.telegram.ui.ActionBar.t6.f20884b = false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        fg.j jVar = this.f39580p0;
        if (jVar != null) {
            jVar.f();
        }
        i91 i91Var = this.f39597w0;
        if (i91Var != null) {
            i91Var.f();
        }
        if (this.F1) {
            this.f39598w1.c(true);
        }
        org.telegram.ui.ActionBar.t6.f20884b = true;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            U0();
            try {
                z4.g gVar = this.f39570k0;
                if (gVar != null) {
                    org.telegram.messenger.i0.B3(gVar, getThemedColor(org.telegram.ui.ActionBar.t6.f21206s8));
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
        if (!z10 && this.f39540b == 2) {
            this.f39537a.k(null, null, null);
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19735z4, new Object[0]);
        }
    }

    public final void p1() {
        char c10;
        float f7;
        boolean z10;
        boolean z11;
        float f10;
        float f11 = 1.0f;
        float f12 = 0.0f;
        int i10 = this.f39540b;
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
            org.telegram.ui.Components.x71 x71Var = this.K0[0];
            if (this.X0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            x71Var.setEnabled(z11);
            if (this.X0 != null) {
                this.K0[0].setVisibility(0);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            int L = (org.telegram.messenger.i0.L(9.0f) + ((FrameLayout.LayoutParams) this.K0[1].getLayoutParams()).width) / 2;
            org.telegram.ui.Components.x71 x71Var2 = this.K0[0];
            Property property = View.ALPHA;
            if (this.X0 == null) {
                f11 = 0.0f;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(x71Var2, property, f11));
            org.telegram.ui.Components.x71 x71Var3 = this.K0[0];
            Property property2 = View.TRANSLATION_X;
            if (this.X0 != null) {
                f10 = 0.0f;
            } else {
                f10 = L;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(x71Var3, property2, f10));
            org.telegram.ui.Components.x71 x71Var4 = this.K0[1];
            if (this.X0 == null) {
                f12 = -L;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(x71Var4, property2, f12));
            animatorSet.setInterpolator(org.telegram.ui.Components.gr.f26496g);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new t81(this));
            animatorSet.start();
            return;
        }
        if (this.X0 == null && (this.C1 instanceof me1)) {
            this.K0[2].a(false, true);
        }
        org.telegram.ui.Components.x71[] x71VarArr = this.K0;
        if (this.X0 != null) {
            c10 = 2;
        } else {
            c10 = 0;
        }
        x71VarArr[c10].setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        org.telegram.ui.Components.x71 x71Var5 = this.K0[2];
        Property property3 = View.ALPHA;
        if (this.X0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x71Var5, property3, f7);
        org.telegram.ui.Components.x71 x71Var6 = this.K0[0];
        if (this.X0 != null) {
            f11 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(x71Var6, property3, f11));
        animatorSet2.addListener(new s81(this));
        animatorSet2.setInterpolator(org.telegram.ui.Components.gr.f26496g);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }

    public final void q1(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m91.q1(boolean):void");
    }

    public final void r1() {
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
        this.f39537a.f39868a = p6Var;
    }

    public m91(org.telegram.ui.ActionBar.s6 s6Var, boolean z10, int i10, boolean z11, boolean z12) {
        super(null);
        this.f39537a = new n81(this);
        this.d = true;
        this.f39575n = 1;
        org.telegram.ui.ActionBar.a6 a6Var = new org.telegram.ui.ActionBar.a6(this, 0, false);
        this.S = a6Var;
        org.telegram.ui.ActionBar.a6 a6Var2 = new org.telegram.ui.ActionBar.a6(this, 0, true);
        this.T = a6Var2;
        org.telegram.ui.ActionBar.a6 a6Var3 = new org.telegram.ui.ActionBar.a6(this, 1, false);
        this.U = a6Var3;
        org.telegram.ui.ActionBar.a6 a6Var4 = new org.telegram.ui.ActionBar.a6(this, 1, true);
        this.V = a6Var4;
        this.Y = -1;
        this.Z = new a81(this, 0);
        this.f39600x0 = new c91[2];
        this.M0 = new FrameLayout[2];
        this.N0 = new TextView[2];
        this.O0 = new TextView[2];
        this.P0 = new FrameLayout[2];
        this.W0 = new HashMap();
        this.f39574m1 = 0.5f;
        this.f39579o1 = 0.0f;
        this.f39591t1 = PorterDuff.Mode.SRC_IN;
        this.f39606z1 = 1.0f;
        this.H1 = "640_360";
        this.I1 = 1920;
        this.L1 = true;
        this.T1 = new org.telegram.ui.Components.p10(getParentActivity(), new p81(this));
        this.U1 = false;
        this.V1 = false;
        this.f39540b = i10;
        this.f39558g0 = z12;
        this.f39555f0 = s6Var;
        this.f39564i0 = z10;
        this.f39561h0 = z11;
        if (i10 == 1) {
            org.telegram.ui.ActionBar.r6 k10 = s6Var.k(!z11);
            this.f39596w = k10;
            if (k10 != null) {
                this.d = false;
                this.f39602y = k10.f20732c;
                this.D = k10.d;
                this.E = k10.e;
                this.F = k10.f20733f;
                this.G = k10.f20734g;
                this.H = k10.h;
                this.I = k10.f20735i;
                this.J = k10.f20736j;
                this.K = k10.f20737k;
                this.L = k10.f20738l;
                this.M = k10.f20739m;
                this.N = k10.f20742p;
                this.O = k10.f20741o;
                this.P = k10.f20740n;
            }
        } else {
            if (i10 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.r6 k11 = s6Var.k(false);
            this.f39596w = k11;
            if (k11 != null) {
                this.X0 = k11.f20745s;
            }
        }
        org.telegram.ui.ActionBar.r6 r6Var = this.f39596w;
        if (r6Var != null) {
            this.F1 = r6Var.f20743q;
            if (!TextUtils.isEmpty(r6Var.f20741o)) {
                this.f39574m1 = this.f39596w.f20742p;
            }
            org.telegram.ui.ActionBar.t6.M = org.telegram.ui.ActionBar.t6.D0();
            org.telegram.ui.ActionBar.t6.O = true;
            org.telegram.ui.ActionBar.t6.P = true;
            org.telegram.ui.ActionBar.t6.u(s6Var, false, false);
        }
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19702u4, new Object[0]);
        a6Var.v = true;
        a6Var3.v = true;
        a6Var2.v = true;
        a6Var4.v = true;
    }

    @Override
    public final void i(long j10, long j11) {
    }

    @Override
    public final void n(long j10, long j11) {
    }

    public m91(org.telegram.ui.ActionBar.s6 s6Var) {
        this(s6Var, false, 0, false, false);
    }
}
