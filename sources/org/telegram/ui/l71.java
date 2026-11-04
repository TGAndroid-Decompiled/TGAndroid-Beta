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
public class l71 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.x5, org.telegram.messenger.cs {
    public FrameLayout A0;
    public float A1;
    public FrameLayout B0;
    public c71 B1;
    public org.telegram.ui.Components.u20 C0;
    public c71 C1;
    public AnimatorSet D0;
    public Object D1;
    public final int E;
    public v4 E0;
    public Bitmap E1;
    public final int F;
    public j61 F0;
    public boolean F1;
    public final int G;
    public j61 G0;
    public boolean G1;
    public final int H;
    public ImageView H0;
    public boolean H1;
    public final int I;
    public ImageView I0;
    public String I1;
    public final boolean J;
    public AnimatorSet J0;
    public int J1;
    public final long K;
    public AnimatorSet K0;
    public k71 K1;
    public final long L;
    public org.telegram.ui.Components.o61[] L0;
    public long L1;
    public final long M;
    public org.telegram.ui.Components.o61[] M0;
    public boolean M1;
    public final long N;
    public final FrameLayout[] N0;
    public boolean N1;
    public final float O;
    public final TextView[] O0;
    public boolean O1;
    public final String P;
    public final TextView[] P0;
    public org.telegram.ui.Components.ch0 P1;
    public final int Q;
    public final FrameLayout[] Q0;
    public org.telegram.ui.ActionBar.q0 Q1;
    public long R;
    public u51 R0;
    public ValueAnimator R1;
    public s70 S;
    public j71 S0;
    public ci.t4 S1;
    public final org.telegram.ui.ActionBar.p5 T;
    public u4.b0 T0;
    public i61 T1;
    public final org.telegram.ui.ActionBar.p5 U;
    public org.telegram.ui.Cells.n4 U0;
    public final org.telegram.ui.Components.v00 U1;
    public final org.telegram.ui.ActionBar.p5 V;
    public org.telegram.ui.Cells.h0 V0;
    public boolean V1;
    public final org.telegram.ui.ActionBar.p5 W;
    public ArrayList W0;
    public boolean W1;
    public org.telegram.ui.Components.vp X;
    public final HashMap X0;
    public TL_stories.TL_premium_boostsStatus X1;
    public int Y;
    public TLRPC.TL_wallPaper Y0;
    public float Y1;
    public int Z;
    public TLRPC.TL_wallPaper Z0;
    public float Z1;
    public final l61 f47141a;
    public final Runnable f47142a0;
    public TLRPC.TL_wallPaper f47143a1;
    public float f47144a2;
    public final int f47145b;
    public boolean f47146b0;
    public int f47147b1;
    public float f47148b2;
    public Scroller f47149c;
    public gi.n5 f47150c0;
    public int f47151c1;
    public boolean c2;
    public final boolean d;
    public FrameLayout f47152d0;
    public int f47153d1;
    public int f47154d2;
    public gi.u2 f47155e;
    public TextView f47156e0;
    public int f47157e1;
    public ValueAnimator f47158e2;
    public org.telegram.ui.ActionBar.q0 f47159f;
    public TextView f47160f0;
    public int f47161f1;
    public boolean f47162f2;
    public final org.telegram.ui.ActionBar.j6 f47163g0;
    public int f47164g1;
    public TextView f47165g2;
    public TextView h;
    public final boolean f47166h0;
    public int f47167h1;
    public WeakReference f47168h2;
    public final boolean f47169i0;
    public int f47170i1;
    public BitmapDrawable f47171i2;
    public final boolean f47172j0;
    public int f47173j1;
    public ac f47174j2;
    public ArrayList f47175k0;
    public int k1;
    public float f47176k2;
    public b5.l f47177l0;
    public int f47178l1;
    public ValueAnimator f47179l2;
    public n61 m0;
    public int m1;
    public int f47180n;
    public UndoView f47181n0;
    public float f47182n1;
    public FrameLayout f47183o0;
    public float f47184o1;
    public org.telegram.ui.Components.tj0 f47185p0;
    public float f47186p1;
    public n4 f47187q0;
    public float f47188q1;
    public Drawable f47189r;
    public org.telegram.ui.Components.l00 f47190r0;
    public d71 f47191r1;
    public int f47192s;
    public org.telegram.messenger.zi f47193s0;
    public org.telegram.ui.Components.wp f47194s1;
    public boolean f47195t0;
    public AnimatorSet f47196t1;
    public org.telegram.ui.ActionBar.k f47197u0;
    public final PorterDuff.Mode f47198u1;
    public org.telegram.ui.ActionBar.k0 f47199v0;
    public int f47200v1;
    public final org.telegram.ui.ActionBar.g6 f47201w;
    public g61 f47202w0;
    public org.telegram.ui.Components.d9 f47203w1;
    public boolean f47204x;
    public h71 f47205x0;
    public org.telegram.ui.Components.q61 f47206x1;
    public final int f47207y;
    public final b71[] f47208y0;
    public Bitmap f47209y1;
    public b71 f47210z0;
    public Bitmap f47211z1;

    public l71(Object obj, Bitmap bitmap, boolean z10) {
        super(null);
        this.f47141a = new l61(this);
        this.d = true;
        this.f47180n = 1;
        org.telegram.ui.ActionBar.p5 p5Var = new org.telegram.ui.ActionBar.p5(this, 0, false);
        this.T = p5Var;
        org.telegram.ui.ActionBar.p5 p5Var2 = new org.telegram.ui.ActionBar.p5(this, 0, true);
        this.U = p5Var2;
        org.telegram.ui.ActionBar.p5 p5Var3 = new org.telegram.ui.ActionBar.p5(this, 1, false);
        this.V = p5Var3;
        org.telegram.ui.ActionBar.p5 p5Var4 = new org.telegram.ui.ActionBar.p5(this, 1, true);
        this.W = p5Var4;
        this.Z = -1;
        this.f47142a0 = new y51(this, 0);
        this.f47208y0 = new b71[2];
        this.N0 = new FrameLayout[2];
        this.O0 = new TextView[2];
        this.P0 = new TextView[2];
        this.Q0 = new FrameLayout[2];
        this.X0 = new HashMap();
        this.f47182n1 = 0.5f;
        this.f47186p1 = 0.0f;
        this.f47198u1 = PorterDuff.Mode.SRC_IN;
        this.A1 = 1.0f;
        this.I1 = "640_360";
        this.J1 = 1920;
        this.M1 = true;
        this.U1 = new org.telegram.ui.Components.v00(getParentActivity(), new o61(this));
        this.V1 = false;
        this.W1 = false;
        this.f47145b = 2;
        this.D1 = obj;
        this.E1 = bitmap;
        this.F1 = z10;
        if (obj instanceof kc1) {
            kc1 kc1Var = (kc1) obj;
            this.G1 = kc1Var.f46904j;
            TLRPC.TL_wallPaper tL_wallPaper = kc1Var.f46902g;
            this.Y0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f10 = kc1Var.h;
                this.f47182n1 = f10;
                if (f10 < 0.0f && !org.telegram.ui.ActionBar.k6.I.q()) {
                    this.f47182n1 *= -1.0f;
                }
            }
        }
        p5Var.v = true;
        p5Var3.v = true;
        p5Var2.v = true;
        p5Var4.v = true;
    }

    public static void Z(l71 l71Var, org.telegram.messenger.e3 e3Var) {
        if (l71Var.getParentActivity() == null) {
            return;
        }
        vg.i0 i0Var = new vg.i0(23, l71Var.currentAccount, l71Var.getParentActivity(), l71Var, l71Var.f47141a);
        i0Var.A1(e3Var);
        i0Var.z1(l71Var.X1, true);
        i0Var.B1(l71Var.L1);
        if (!l71Var.Z0()) {
            i0Var.J2 = new y51(l71Var, 1);
        }
        l71Var.showDialog(i0Var);
    }

    public static void a0(l71 l71Var) {
        org.telegram.ui.ActionBar.g6 k10;
        org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.M;
        if (j6Var == null) {
            return;
        }
        int i3 = j6Var.f27676a0;
        if (i3 >= 0) {
            k10 = (org.telegram.ui.ActionBar.g6) j6Var.f27678b0.get(i3);
        } else {
            k10 = j6Var.k(false);
        }
        if (l71Var.f47201w != null) {
            l71Var.b1();
            org.telegram.ui.ActionBar.k6.z1(l71Var.f47163g0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.k6.M != null) {
                org.telegram.ui.ActionBar.k6.O = false;
                org.telegram.ui.ActionBar.k6.P = false;
                org.telegram.ui.ActionBar.k6.M = null;
            }
            org.telegram.ui.ActionBar.k6.u(l71Var.f47163g0, true, l71Var.f47166h0);
            ((ActionBarLayout) l71Var.parentLayout).X(false, false);
        } else {
            ((ActionBarLayout) l71Var.parentLayout).X(false, false);
            File file = new File(l71Var.f47163g0.f27677b);
            org.telegram.ui.ActionBar.j6 j6Var2 = l71Var.f47163g0;
            org.telegram.ui.ActionBar.k6.v(file, j6Var2.f27675a, j6Var2.G, false);
            org.telegram.messenger.hp.s1(l71Var.f47163g0.F).x4(l71Var.f47163g0, null, false, false);
            SharedPreferences.Editor edit = org.telegram.messenger.t0.f25457b.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", l71Var.f47163g0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) l71Var.getParentLayout().getFragmentStack().get(Math.max(0, l71Var.getParentLayout().getFragmentStack().size() - 2));
        l71Var.finishFragment();
        if (l71Var.f47145b == 0) {
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23284p4, j6Var, k10, Boolean.valueOf(l71Var.f47172j0));
        }
        org.telegram.ui.ActionBar.k6.M1(d2Var);
    }

    public static void b0(l71 l71Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = l71Var.X0;
        org.telegram.ui.ActionBar.g6 g6Var = l71Var.f47201w;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            l71Var.W0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z10 = false;
            for (int i3 = 0; i3 < size; i3++) {
                if (tL_wallPapers.wallpapers.get(i3) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i3);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f27007id))) {
                            l71Var.W0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.f27007id), tL_wallPaper2);
                        }
                        if (g6Var != null && (str = g6Var.f27537o) != null && str.equals(tL_wallPaper2.slug)) {
                            l71Var.Y0 = tL_wallPaper2;
                            l71Var.g1(false);
                            l71Var.o1();
                        } else if (g6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = l71Var.Y0;
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
            if (!z10 && (tL_wallPaper = l71Var.Y0) != null) {
                l71Var.W0.add(0, tL_wallPaper);
            }
            j71 j71Var = l71Var.S0;
            if (j71Var != null) {
                j71Var.f();
            }
            org.telegram.messenger.qr.a0(l71Var.currentAccount).p1(1, tL_wallPapers.wallpapers);
        }
        if (l71Var.Y0 == null && g6Var != null && !TextUtils.isEmpty(g6Var.f27537o)) {
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = g6Var.f27537o;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(l71Var.currentAccount).bindRequestToGuid(l71Var.getConnectionsManager().sendRequest(getwallpaper, new e61(l71Var, 0)), l71Var.classGuid);
        }
    }

    @Override
    public final void C(boolean z10) {
        o1();
    }

    @Override
    public final void M(String str) {
        o1();
    }

    public final void Q0() {
        AnimatorSet animatorSet = this.D0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.D0 = animatorSet2;
        if (this.G1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f47210z0, View.SCALE_X, this.A1), ObjectAnimator.ofFloat(this.f47210z0, View.SCALE_Y, this.A1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f47210z0, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f47210z0, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f47210z0, View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f47210z0, View.TRANSLATION_Y, 0.0f));
        }
        this.D0.setInterpolator(org.telegram.ui.Components.xq.f40453g);
        this.D0.addListener(new q61(this, 1));
        this.D0.start();
    }

    public final void R0(boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l71.R0(boolean):void");
    }

    public final void S0(boolean z10) {
        int i3 = this.f47145b;
        if (i3 == 2) {
            if (!z10) {
                finishFragment();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.k6.p();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23351z4);
        org.telegram.ui.ActionBar.g6 g6Var = this.f47201w;
        if (i3 == 1) {
            if (this.f47169i0) {
                g6Var.f27527c = this.f47207y;
                g6Var.d = this.E;
                g6Var.f27528e = this.F;
                g6Var.f27529f = this.G;
                g6Var.f27530g = this.H;
                g6Var.h = this.I;
                g6Var.f27531i = this.J;
                g6Var.f27532j = this.K;
                g6Var.f27533k = this.L;
                g6Var.f27534l = this.M;
                g6Var.f27535m = this.N;
                g6Var.f27536n = this.Q;
                g6Var.f27537o = this.P;
                g6Var.f27538p = this.O;
            }
            org.telegram.ui.ActionBar.k6.z1(this.f47163g0, false, true, false, false, false);
        } else {
            if (g6Var != null) {
                org.telegram.ui.ActionBar.k6.z1(this.f47163g0, false, this.f47172j0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).X(false, false);
            if (this.f47172j0) {
                org.telegram.ui.ActionBar.j6 j6Var = this.f47163g0;
                if (j6Var.f27677b != null && org.telegram.ui.ActionBar.k6.H.get(j6Var.m()) == null) {
                    new File(j6Var.f27677b).delete();
                }
            }
        }
        if (!z10) {
            finishFragment();
        }
    }

    public final BitmapDrawable T0(Drawable drawable) {
        WeakReference weakReference = this.f47168h2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.f47171i2;
        }
        WeakReference weakReference2 = this.f47168h2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f47168h2 = null;
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            this.f47168h2 = new WeakReference(drawable);
            int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, intrinsicWidth, 24);
            ColorFilter colorFilter = drawable.getColorFilter();
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.3f);
            org.telegram.messenger.g0.n2(colorMatrix, 0.94f);
            drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            drawable.draw(new Canvas(createBitmap));
            drawable.setColorFilter(colorFilter);
            Utilities.blurBitmap(createBitmap, 3);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getParentActivity().getResources(), createBitmap);
            this.f47171i2 = bitmapDrawable;
            bitmapDrawable.setFilterBitmap(true);
            return this.f47171i2;
        }
        this.f47171i2 = null;
        return null;
    }

    public final boolean U0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l71.U0(boolean):boolean");
    }

    public final void V0() {
        int themedColor;
        gi.u2 u2Var = this.f47155e;
        int i3 = 0;
        if (u2Var != null) {
            u2Var.H(getThemedColor(org.telegram.ui.ActionBar.k6.G8));
            this.f47155e.O(getThemedColor(org.telegram.ui.ActionBar.k6.E8), false);
        }
        if (this.f47189r != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6)) != this.f47192s) {
            this.f47192s = themedColor;
            this.f47189r.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        v4 v4Var = this.E0;
        if (v4Var != null) {
            v4Var.invalidate();
        }
        if (this.f47191r1 != null) {
            org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
            if (q4Var != null && q4Var.getBottomSheet() != null) {
                this.parentLayout.getBottomSheet().O(getThemedColor(org.telegram.ui.ActionBar.k6.f27954h5));
                if (this.f47145b == 2 && this.L1 != 0) {
                    this.parentLayout.getBottomSheet().E0(-16777216);
                }
            } else {
                setNavigationBarColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27954h5));
            }
        }
        if (this.L0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.o61[] o61VarArr = this.L0;
                if (i10 >= o61VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.o61 o61Var = o61VarArr[i10];
                if (o61Var != null) {
                    o61Var.invalidate();
                }
                i10++;
            }
        }
        if (this.M0 != null) {
            while (true) {
                org.telegram.ui.Components.o61[] o61VarArr2 = this.M0;
                if (i3 >= o61VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.o61 o61Var2 = o61VarArr2[i3];
                if (o61Var2 != null) {
                    o61Var2.invalidate();
                }
                i3++;
            }
        }
        TextView textView = this.f47165g2;
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, this.f47141a);
        }
        org.telegram.ui.Components.vp vpVar = this.X;
        if (vpVar != null) {
            vpVar.invalidate();
        }
        org.telegram.ui.Components.l00 l00Var = this.f47190r0;
        if (l00Var != null) {
            l00Var.updateColors();
        }
    }

    public final int W0() {
        if (org.telegram.messenger.t3.U(this.currentAccount, -this.L1)) {
            return getMessagesController().f23136u5;
        }
        return getMessagesController().f23184z5;
    }

    public final ArrayList X0() {
        h6 h6Var = new h6(23, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47177l0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28160s8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47197u0, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47197u0, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.E8));
        org.telegram.ui.Components.vp vpVar = this.X;
        if (vpVar != null) {
            org.telegram.ui.ActionBar.q0 q0Var = vpVar.J;
            EditTextBoldCursor[] editTextBoldCursorArr = vpVar.F;
            for (int i3 = 0; i3 < editTextBoldCursorArr.length; i3++) {
                arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursorArr[i3], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursorArr[i3], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28007k6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursorArr[i3], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28026l6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(vpVar.G, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I5));
            if (q0Var != null) {
                org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(vpVar, 2);
                arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.k6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.k6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.k6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.k6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.N0;
        if (frameLayoutArr != null) {
            for (int i10 = 0; i10 < frameLayoutArr.length; i10++) {
            }
            for (int i11 = 0; i11 < this.Q0.length; i11++) {
            }
            for (int i12 = 0; i12 < this.P0.length; i12++) {
            }
            for (int i13 = 0; i13 < this.O0.length; i13++) {
            }
            org.telegram.ui.ActionBar.p5 p5Var = this.T;
            org.telegram.ui.ActionBar.p5 p5Var2 = this.V;
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47202w0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{p5Var, p5Var2}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28144rb));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47202w0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{p5Var, p5Var2}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28163sb));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47202w0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{p5Var, p5Var2}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28182tb));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47202w0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kd));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47202w0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qb));
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ((org.telegram.ui.ActionBar.t6) arrayList.get(i14)).f28667n = this.f47141a;
        }
        return arrayList;
    }

    public final boolean Y0(int i3) {
        int E0;
        long j10;
        if (this.f47169i0) {
            return false;
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.f47201w;
        if (i3 == 1 || i3 == 2) {
            long j11 = this.K;
            if (j11 != 0) {
                if (j11 != g6Var.f27532j) {
                    return true;
                }
            } else {
                int E02 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Be);
                int i10 = (int) g6Var.f27532j;
                if (i10 == 0) {
                    i10 = E02;
                }
                if (i10 != E02) {
                    return true;
                }
            }
            long j12 = this.L;
            int i11 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
            long j13 = this.N;
            long j14 = this.M;
            if (i11 == 0 && j14 == 0 && j13 == 0) {
                for (int i12 = 0; i12 < 3; i12++) {
                    if (i12 == 0) {
                        E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ce);
                        j10 = g6Var.f27533k;
                    } else if (i12 == 1) {
                        E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.De);
                        j10 = g6Var.f27534l;
                    } else {
                        E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ee);
                        j10 = g6Var.f27535m;
                    }
                    int i13 = (int) j10;
                    if (i13 == 0 && j10 != 0) {
                        i13 = 0;
                    } else if (i13 == 0) {
                        i13 = E0;
                    }
                    if (i13 != E0) {
                        return true;
                    }
                }
            } else if (j12 != g6Var.f27533k || j14 != g6Var.f27534l || j13 != g6Var.f27535m) {
                return true;
            }
            if (g6Var.f27536n != this.Q) {
                return true;
            }
        }
        if (i3 == 1 || i3 == 3) {
            if (this.f47207y != g6Var.d) {
                return true;
            }
            int i14 = this.F;
            if (i14 != 0) {
                if (i14 != g6Var.f27528e) {
                    return true;
                }
            } else {
                int i15 = g6Var.f27528e;
                if (i15 != 0 && i15 != g6Var.f27527c) {
                    return true;
                }
            }
            int i16 = this.G;
            if (i16 != 0) {
                if (i16 != g6Var.f27529f) {
                    return true;
                }
            } else if (g6Var.f27529f != 0) {
                return true;
            }
            int i17 = this.H;
            if (i17 != 0) {
                if (i17 != g6Var.f27530g) {
                    return true;
                }
            } else if (g6Var.f27530g != 0) {
                return true;
            }
            int i18 = this.I;
            if (i18 != 0) {
                if (i18 != g6Var.h) {
                    return true;
                }
            } else if (g6Var.h != 0) {
                return true;
            }
            if (this.J != g6Var.f27531i) {
                return true;
            }
        }
        return false;
    }

    public boolean Z0() {
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && q4Var.getBottomSheet() != null) {
            return true;
        }
        return false;
    }

    public final void a1() {
        float f10;
        ci.t4 t4Var = this.S1;
        if (t4Var != null) {
            t4Var.invalidate();
        }
        FrameLayout frameLayout = this.A0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                this.A0.getChildAt(i3).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.B0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                this.B0.getChildAt(i10).invalidate();
            }
        }
        if (this.L0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.o61[] o61VarArr = this.L0;
                if (i11 >= o61VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.o61 o61Var = o61VarArr[i11];
                if (o61Var != null) {
                    if (this.O1) {
                        f10 = this.f47186p1 * this.f47188q1;
                    } else {
                        f10 = 0.0f;
                    }
                    o61Var.setDimAmount(f10);
                    this.L0[i11].invalidate();
                }
                i11++;
            }
        }
        if (this.f47185p0 != null) {
            for (int i12 = 0; i12 < this.f47185p0.getChildCount(); i12++) {
                View childAt = this.f47185p0.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.t0) {
                    i1((org.telegram.ui.Cells.t0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.f47202w0 != null) {
            for (int i13 = 0; i13 < this.f47202w0.getChildCount(); i13++) {
                View childAt2 = this.f47202w0.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.t0) {
                    i1((org.telegram.ui.Cells.t0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        c71 c71Var = this.B1;
        if (c71Var != null) {
            c71Var.invalidate();
        }
        c71 c71Var2 = this.C1;
        if (c71Var2 != null) {
            c71Var2.invalidate();
        }
        v4 v4Var = this.E0;
        if (v4Var != null) {
            v4Var.invalidate();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27971i5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27954h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27848bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27942gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27850be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27943gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28295zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28277yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28258xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28126qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28106pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28086ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28181ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28143ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
    }

    public final void b1() {
        org.telegram.ui.ActionBar.g6 g6Var = this.f47201w;
        if (g6Var != null && !TextUtils.isEmpty(g6Var.f27537o)) {
            try {
                File e10 = g6Var.e();
                Drawable background = this.f47210z0.getBackground();
                Bitmap n4 = this.f47210z0.getImageReceiver().n();
                if (background instanceof org.telegram.ui.Components.la0) {
                    FileOutputStream fileOutputStream = new FileOutputStream(e10);
                    n4.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                    fileOutputStream.close();
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(n4.getWidth(), n4.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                background.setBounds(0, 0, n4.getWidth(), n4.getHeight());
                background.draw(canvas);
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(this.f47178l1, this.f47198u1));
                paint.setAlpha((int) (this.f47182n1 * 255.0f));
                canvas.drawBitmap(n4, 0.0f, 0.0f, paint);
                FileOutputStream fileOutputStream2 = new FileOutputStream(e10);
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
                fileOutputStream2.close();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
    }

    public final void c1() {
        d1(2, true);
    }

    @Override
    public final android.view.View createView(android.content.Context r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l71.createView(android.content.Context):android.view.View");
    }

    public final void d1(int i3, boolean z10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (getParentActivity() != null && this.f47180n != i3 && this.f47196t1 == null && (g6Var = this.f47201w) != null) {
            if (z10 && i3 == 2 && (org.telegram.ui.ActionBar.k6.c1() || g6Var.f27532j == 4294967296L)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = org.telegram.messenger.bd.M0(2131752550, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                if (org.telegram.ui.ActionBar.k6.c1() && (!org.telegram.ui.ActionBar.k6.c1() || org.telegram.ui.ActionBar.k6.I.f27689j0.d == 0)) {
                    s1Var.U = org.telegram.messenger.bd.M0(2131752529, null);
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752552, null), new a61(this, 7));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                } else {
                    s1Var.U = org.telegram.messenger.bd.M0(2131752549, null);
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746128, null), new a61(this, 5));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751771, null), new a61(this, 6));
                }
                showDialog(s1Var);
                return;
            }
            int i17 = this.f47180n;
            this.f47180n = i3;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        this.h.setText(org.telegram.messenger.bd.M0(2131752014, null));
                        if (g6Var.f27529f != 0) {
                            if (g6Var.h != 0) {
                                i16 = 4;
                            } else if (g6Var.f27530g != 0) {
                                i16 = 3;
                            } else {
                                i16 = 2;
                            }
                        } else {
                            i16 = 1;
                        }
                        org.telegram.ui.Components.vp vpVar = this.X;
                        Y0(3);
                        vpVar.f(2, 4, i16, true);
                        this.X.e(g6Var.h, 3);
                        this.X.e(g6Var.f27530g, 2);
                        this.X.e(g6Var.f27529f, 1);
                        org.telegram.ui.Components.vp vpVar2 = this.X;
                        int i18 = g6Var.f27528e;
                        if (i18 == 0) {
                            i18 = g6Var.f27527c;
                        }
                        vpVar2.e(i18, 0);
                        this.M0[1].b(0, g6Var.f27528e);
                        this.M0[1].b(1, g6Var.f27529f);
                        this.M0[1].b(2, g6Var.f27530g);
                        this.M0[1].b(3, g6Var.h);
                        if (g6Var.f27530g != 0) {
                            if (i17 == 1) {
                                this.f47205x0.i(0);
                            } else {
                                this.f47205x0.g(0);
                            }
                        } else if (i17 == 2) {
                            this.f47205x0.s(0);
                        }
                        this.f47202w0.w0(0, org.telegram.messenger.g0.L(60.0f), null);
                        j1();
                    }
                    i10 = i17;
                } else {
                    this.h.setText(org.telegram.messenger.bd.M0(2131752016, null));
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Be);
                    int i19 = org.telegram.ui.ActionBar.k6.Ce;
                    if (org.telegram.ui.ActionBar.k6.f1(i19)) {
                        i12 = getThemedColor(i19);
                    } else {
                        i12 = 0;
                    }
                    int i20 = org.telegram.ui.ActionBar.k6.De;
                    if (org.telegram.ui.ActionBar.k6.f1(i20)) {
                        i13 = getThemedColor(i20);
                    } else {
                        i13 = 0;
                    }
                    int i21 = org.telegram.ui.ActionBar.k6.Ee;
                    if (org.telegram.ui.ActionBar.k6.f1(i21)) {
                        i14 = getThemedColor(i21);
                    } else {
                        i14 = 0;
                    }
                    long j10 = g6Var.f27533k;
                    int i22 = (int) j10;
                    if (i22 == 0 && j10 != 0) {
                        i12 = 0;
                    }
                    long j11 = g6Var.f27534l;
                    int i23 = (int) j11;
                    if (i23 == 0 && j11 != 0) {
                        i13 = 0;
                    }
                    long j12 = g6Var.f27535m;
                    int i24 = (int) j12;
                    if (i24 == 0 && j12 != 0) {
                        i14 = 0;
                    }
                    int i25 = (int) g6Var.f27532j;
                    if (i22 == 0 && i12 == 0) {
                        i15 = 1;
                    } else if (i24 == 0 && i14 == 0) {
                        if (i23 == 0 && i13 == 0) {
                            i15 = 2;
                        } else {
                            i15 = 3;
                        }
                    } else {
                        i15 = 4;
                    }
                    org.telegram.ui.Components.vp vpVar3 = this.X;
                    Y0(2);
                    vpVar3.f(2, 4, i15, false);
                    org.telegram.ui.Components.vp vpVar4 = this.X;
                    if (i24 == 0) {
                        i24 = i14;
                    }
                    vpVar4.e(i24, 3);
                    org.telegram.ui.Components.vp vpVar5 = this.X;
                    if (i23 == 0) {
                        i23 = i13;
                    }
                    vpVar5.e(i23, 2);
                    org.telegram.ui.Components.vp vpVar6 = this.X;
                    if (i22 == 0) {
                        i22 = i12;
                    }
                    vpVar6.e(i22, 1);
                    org.telegram.ui.Components.vp vpVar7 = this.X;
                    if (i25 != 0) {
                        themedColor = i25;
                    }
                    vpVar7.e(themedColor, 0);
                    i10 = i17;
                    if (i10 != 1 && g6Var.f27530g != 0) {
                        this.f47205x0.g(0);
                    } else {
                        this.f47205x0.i(0);
                    }
                    this.f47202w0.w0(0, org.telegram.messenger.g0.L(60.0f), null);
                }
            } else {
                i10 = i17;
                this.h.setText(org.telegram.messenger.bd.M0(2131752015, null));
                if (g6Var.d != 0) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                org.telegram.ui.Components.vp vpVar8 = this.X;
                Y0(1);
                vpVar8.f(1, 2, i11, false);
                this.X.e(g6Var.f27527c, 0);
                int i26 = g6Var.d;
                if (i26 != 0) {
                    this.X.e(i26, 1);
                }
                if (i10 == 2 || (i10 == 3 && g6Var.f27530g != 0)) {
                    this.f47205x0.s(0);
                }
            }
            if (i3 != 1 && i3 != 3) {
                this.X.setMinBrightness(0.0f);
                this.X.setMaxBrightness(1.0f);
                return;
            }
            if (i10 == 2 && this.N0[1].getVisibility() == 0) {
                k1(0, true, true);
            }
            if (i3 == 1) {
                if (this.f47163g0.q()) {
                    this.X.setMinBrightness(0.2f);
                    return;
                }
                this.X.setMinBrightness(0.05f);
                this.X.setMaxBrightness(0.8f);
                return;
            }
            this.X.setMinBrightness(0.0f);
            this.X.setMaxBrightness(1.0f);
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i3 == org.telegram.messenger.hs.f23283p3) {
            if (this.L1 == ((Long) objArr[2]).longValue()) {
                this.X1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                m1(true);
            }
        } else if (i3 == org.telegram.messenger.hs.f23246i4) {
            org.telegram.ui.Components.tj0 tj0Var = this.f47185p0;
            if (tj0Var != null) {
                int childCount = tj0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = this.f47185p0.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.t2) {
                        ((org.telegram.ui.Cells.t2) childAt).i0(0, true);
                    }
                }
            }
        } else if (i3 == org.telegram.messenger.hs.f23252j4) {
            g61 g61Var = this.f47202w0;
            if (g61Var != null) {
                g61Var.g1();
            }
        } else if (i3 == org.telegram.messenger.hs.f23351z4) {
            if (this.f47199v0 != null) {
                g1(true);
            }
        } else if (i3 == org.telegram.messenger.hs.f23229f4) {
            Object obj = this.D1;
            if (obj instanceof lc1) {
                lc1 lc1Var = (lc1) obj;
                if (lc1Var.f47301a == null) {
                    lc1Var.f47301a = (String) objArr[0];
                }
            }
        } else {
            long j10 = 0;
            if (i3 == org.telegram.messenger.hs.f23223e4) {
                ArrayList arrayList = (ArrayList) objArr[0];
                this.W0.clear();
                HashMap hashMap = this.X0;
                hashMap.clear();
                int size = arrayList.size();
                boolean z10 = false;
                for (int i12 = 0; i12 < size; i12++) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i12);
                    if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                        TLRPC.Document document = wallPaper.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f27007id))) {
                            this.W0.add(wallPaper);
                            hashMap.put(Long.valueOf(wallPaper.document.f27007id), wallPaper);
                        }
                        org.telegram.ui.ActionBar.g6 g6Var = this.f47201w;
                        if (g6Var != null && (str = g6Var.f27537o) != null && str.equals(wallPaper.slug)) {
                            this.Y0 = (TLRPC.TL_wallPaper) wallPaper;
                            g1(false);
                            o1();
                        } else if (g6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper2 = this.Y0;
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
                if (!z10 && (tL_wallPaper = this.Y0) != null) {
                    this.W0.add(0, tL_wallPaper);
                }
                j71 j71Var = this.S0;
                if (j71Var != null) {
                    j71Var.f();
                }
                int size2 = arrayList.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i13);
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        j10 = org.telegram.messenger.li.p(j10, wallPaper2.f27155id);
                    }
                }
                TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
                getwallpapers.hash = j10;
                ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new e61(this, 1)), this.classGuid);
            } else if (i3 == org.telegram.messenger.hs.f23318u5 && this.L1 != 0) {
                finishFragment();
            }
        }
    }

    public final void e1(int i3) {
        TLRPC.TL_wallPaper tL_wallPaper;
        if (i3 >= 0 && i3 < this.W0.size()) {
            tL_wallPaper = (TLRPC.TL_wallPaper) this.W0.get(i3);
        } else {
            tL_wallPaper = this.f47143a1;
        }
        TLRPC.TL_wallPaper tL_wallPaper2 = tL_wallPaper;
        if (tL_wallPaper2 == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f47158e2;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f47158e2.cancel();
        }
        b71[] b71VarArr = this.f47208y0;
        b71 b71Var = b71VarArr[0];
        b71 b71Var2 = b71VarArr[1];
        b71VarArr[0] = b71Var2;
        b71VarArr[1] = b71Var;
        this.f47199v0.removeView(b71Var2);
        this.f47199v0.addView(b71VarArr[0], this.f47199v0.indexOfChild(b71VarArr[1]) + 1);
        b71 b71Var3 = b71VarArr[0];
        this.f47210z0 = b71Var3;
        b71Var3.setBackground(b71VarArr[1].getBackground());
        p1();
        b71VarArr[1].setVisibility(0);
        b71VarArr[1].setAlpha(1.0f);
        this.f47210z0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f47158e2 = ofFloat;
        ofFloat.addUpdateListener(new ei(2, this));
        this.f47158e2.addListener(new q61(this, 0));
        this.f47158e2.setInterpolator(org.telegram.ui.Components.xq.f40452f);
        this.f47158e2.setDuration(300L);
        this.f47158e2.start();
        this.f47210z0.getImageReceiver().f21271t1 = 300;
        this.f47210z0.getImageReceiver().r0(org.telegram.messenger.ac.b(tL_wallPaper2.document), this.I1, null, null, null, tL_wallPaper2.document.size, "jpg", tL_wallPaper2, 1);
        this.f47210z0.d();
        this.Y0 = tL_wallPaper2;
        this.G1 = this.L0[2].f36767s;
        o1();
    }

    public final void f1(int i3, int i10, boolean z10) {
        org.telegram.ui.Components.la0 la0Var;
        if (i10 == 0) {
            this.f47147b1 = i3;
        } else if (i10 == 1) {
            this.f47153d1 = i3;
        } else if (i10 == 2) {
            this.f47157e1 = i3;
        } else if (i10 == 3) {
            this.f47161f1 = i3;
        }
        r1(z10);
        if (this.L0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.o61[] o61VarArr = this.L0;
                if (i11 >= o61VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.o61 o61Var = o61VarArr[i11];
                if (o61Var != null) {
                    o61Var.b(i10, i3);
                }
                i11++;
            }
        }
        if (this.f47157e1 != 0) {
            if (this.V0 != null && org.telegram.ui.ActionBar.k6.I.q()) {
                this.V0.setTwoSided(true);
            }
            Drawable background = this.f47210z0.getBackground();
            if (background instanceof org.telegram.ui.Components.la0) {
                la0Var = (org.telegram.ui.Components.la0) background;
            } else {
                la0Var = new org.telegram.ui.Components.la0();
                la0Var.q(this.f47210z0);
                if (this.F1) {
                    la0Var.m(false);
                }
            }
            la0Var.n(this.f47147b1, this.f47153d1, this.f47157e1, this.f47161f1);
            this.f47210z0.setBackground(la0Var);
            this.f47178l1 = la0Var.f();
            this.m1 = 754974720;
        } else if (this.f47153d1 != 0) {
            this.f47210z0.setBackground(new GradientDrawable(org.telegram.ui.Components.j9.d(this.f47173j1), new int[]{this.f47147b1, this.f47153d1}));
            int V0 = org.telegram.messenger.g0.V0(org.telegram.messenger.g0.w0(this.f47147b1, this.f47153d1), false);
            this.m1 = V0;
            this.f47178l1 = V0;
        } else {
            this.f47210z0.setBackgroundColor(this.f47147b1);
            int V02 = org.telegram.messenger.g0.V0(this.f47147b1, false);
            this.m1 = V02;
            this.f47178l1 = V02;
        }
        int i12 = org.telegram.ui.ActionBar.k6.Zc;
        boolean f12 = org.telegram.ui.ActionBar.k6.f1(i12);
        l61 l61Var = this.f47141a;
        if (f12 && !(this.f47210z0.getBackground() instanceof org.telegram.ui.Components.la0)) {
            if (org.telegram.ui.ActionBar.k6.t0() instanceof org.telegram.ui.Components.la0) {
                getThemedColor(i12);
                l61Var.k(this.f47210z0.getBackground(), this.f47210z0.getBackground(), Float.valueOf(this.f47182n1));
            }
        } else {
            l61Var.k(this.f47210z0.getBackground(), this.f47210z0.getBackground(), Float.valueOf(this.f47182n1));
        }
        ImageView imageView = this.H0;
        if (imageView != null) {
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Wc, l61Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.I0;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.Wc, l61Var, PorterDuff.Mode.MULTIPLY);
        }
        b71 b71Var = this.f47210z0;
        if (b71Var != null) {
            b71Var.getImageReceiver().f21261p1 = new PorterDuffColorFilter(this.f47178l1, this.f47198u1);
            this.f47210z0.getImageReceiver().setAlpha(Math.abs(this.f47182n1));
            this.f47210z0.invalidate();
            if (org.telegram.ui.ActionBar.k6.I.q() && (this.f47210z0.getBackground() instanceof org.telegram.ui.Components.la0)) {
                org.telegram.ui.Cells.h0 h0Var = this.V0;
                if (h0Var != null) {
                    h0Var.setTwoSided(true);
                }
                if (this.f47182n1 < 0.0f) {
                    this.f47210z0.getImageReceiver().m0(((org.telegram.ui.Components.la0) this.f47210z0.getBackground()).f35658k);
                }
            } else {
                this.f47210z0.getImageReceiver().m0(null);
                org.telegram.ui.Cells.h0 h0Var2 = this.V0;
                if (h0Var2 != null) {
                    h0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.h0 h0Var3 = this.V0;
            if (h0Var3 != null) {
                h0Var3.setProgress(this.f47182n1);
            }
        }
        g61 g61Var = this.f47202w0;
        if (g61Var != null) {
            g61Var.g1();
        }
        FrameLayout frameLayout = this.A0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                this.A0.getChildAt(i13).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.B0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                this.B0.getChildAt(i14).invalidate();
            }
        }
    }

    public final void g1(boolean z10) {
        org.telegram.ui.Components.la0 la0Var;
        org.telegram.ui.Components.la0 la0Var2;
        int i3;
        int g7;
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.ActionBar.g6 g6Var = this.f47201w;
        int i10 = this.f47145b;
        if (i10 == 0 && g6Var == null) {
            this.f47210z0.setBackground(org.telegram.ui.ActionBar.k6.s0());
        } else {
            TLRPC.PhotoSize photoSize2 = null;
            BitmapDrawable bitmapDrawable = null;
            if (i10 == 2) {
                Object obj = this.D1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    if (z10) {
                        photoSize = org.telegram.messenger.w7.w(tL_wallPaper.document.thumbs, 100, false, null, false);
                    } else {
                        photoSize = null;
                    }
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        bitmapDrawable = new BitmapDrawable(org.telegram.messenger.zb.F("b", photoSize.bytes));
                    }
                    b71 b71Var = this.f47210z0;
                    b71Var.f35342a.r0(org.telegram.messenger.ac.b(tL_wallPaper.document), this.I1, org.telegram.messenger.ac.c(photoSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    b71Var.d();
                } else if (obj instanceof kc1) {
                    kc1 kc1Var = (kc1) obj;
                    int i11 = kc1Var.f46901f;
                    int i12 = kc1Var.f46900e;
                    int i13 = kc1Var.d;
                    int i14 = kc1Var.f46899c;
                    int i15 = kc1Var.f46898b;
                    this.f47173j1 = i11;
                    f1(i15, 0, false);
                    if (i14 != 0) {
                        f1(i14, 1, false);
                    }
                    f1(i13, 2, false);
                    f1(i12, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.Y0;
                    if (tL_wallPaper2 != null) {
                        b71 b71Var2 = this.f47210z0;
                        org.telegram.messenger.ac b10 = org.telegram.messenger.ac.b(tL_wallPaper2.document);
                        String str = this.I1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.Y0;
                        b71Var2.g(1, tL_wallPaper3.document.size, tL_wallPaper3, str, null, "jpg", b10, null);
                    } else if ("d".equals(kc1Var.f46897a)) {
                        Point point = org.telegram.messenger.g0.f22608q;
                        int min = Math.min(point.x, point.y);
                        int max = Math.max(point.x, point.y);
                        if (Build.VERSION.SDK_INT >= 29) {
                            g7 = 1459617792;
                        } else {
                            g7 = org.telegram.ui.Components.la0.g(i15, i14, i13, i12);
                        }
                        this.f47210z0.setImageBitmap(org.telegram.messenger.kz.d(2131623997, min, max, g7));
                    }
                } else if (obj instanceof lc1) {
                    Bitmap bitmap = this.E1;
                    if (bitmap != null) {
                        this.f47210z0.setImageBitmap(bitmap);
                    } else {
                        lc1 lc1Var = (lc1) obj;
                        File file = lc1Var.f47304e;
                        if (file != null) {
                            this.f47210z0.h(file.getAbsolutePath(), this.I1, null);
                        } else {
                            File file2 = lc1Var.d;
                            if (file2 != null) {
                                this.f47210z0.h(file2.getAbsolutePath(), this.I1, null);
                            } else if ("t".equals(lc1Var.f47301a)) {
                                b71 b71Var3 = this.f47210z0;
                                b71Var3.setImageDrawable(org.telegram.ui.ActionBar.k6.Z0(b71Var3, false));
                            } else {
                                int i16 = lc1Var.f47302b;
                                if (i16 != 0) {
                                    this.f47210z0.setImageResource(i16);
                                }
                            }
                        }
                    }
                } else if (obj instanceof org.telegram.messenger.bf) {
                    org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) obj;
                    TLRPC.Photo photo = bfVar.K;
                    if (photo != null) {
                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, 100, false, null, false);
                        TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(bfVar.K.sizes, this.J1, true, null, false);
                        if (w11 != w10) {
                            photoSize2 = w11;
                        }
                        if (photoSize2 != null) {
                            i3 = photoSize2.size;
                        } else {
                            i3 = 0;
                        }
                        this.f47210z0.g(1, i3, bfVar, this.I1, "100_100_b", "jpg", org.telegram.messenger.ac.i(photoSize2, bfVar.K), org.telegram.messenger.ac.i(w10, bfVar.K));
                    } else {
                        b71 b71Var4 = this.f47210z0;
                        String str2 = bfVar.C;
                        String str3 = this.I1;
                        String str4 = bfVar.D;
                        b71Var4.getClass();
                        b71Var4.n(org.telegram.messenger.ac.g(str2), str3, org.telegram.messenger.ac.g(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (g6Var == null) {
                this.f47210z0.setBackground(org.telegram.ui.ActionBar.k6.s0());
            } else {
                org.telegram.ui.Components.d9 d9Var = this.f47203w1;
                if (d9Var != null) {
                    d9Var.dispose();
                    this.f47203w1 = null;
                }
                int E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Be);
                int i17 = (int) g6Var.f27532j;
                if (i17 != 0) {
                    E0 = i17;
                }
                int E02 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ce);
                long j10 = g6Var.f27533k;
                int i18 = (int) j10;
                if (i18 == 0 && j10 != 0) {
                    E02 = 0;
                } else if (i18 != 0) {
                    E02 = i18;
                }
                int E03 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.De);
                long j11 = g6Var.f27534l;
                int i19 = (int) j11;
                if (i19 == 0 && j11 != 0) {
                    E03 = 0;
                } else if (i19 != 0) {
                    E03 = i19;
                }
                int E04 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ee);
                long j12 = g6Var.f27535m;
                int i20 = (int) j12;
                if (i20 == 0 && j12 != 0) {
                    E04 = 0;
                } else if (i20 != 0) {
                    E04 = i20;
                }
                if (!TextUtils.isEmpty(g6Var.f27537o) && !org.telegram.ui.ActionBar.k6.c1()) {
                    if (E03 != 0) {
                        Drawable background = this.f47210z0.getBackground();
                        if (background instanceof org.telegram.ui.Components.la0) {
                            la0Var2 = (org.telegram.ui.Components.la0) background;
                        } else {
                            org.telegram.ui.Components.la0 la0Var3 = new org.telegram.ui.Components.la0();
                            la0Var3.q(this.f47210z0);
                            la0Var2 = la0Var3;
                            if (this.F1) {
                                la0Var3.m(false);
                                la0Var2 = la0Var3;
                            }
                        }
                        la0Var2.n(E0, E02, E03, E04);
                        la0Var = la0Var2;
                    } else if (E02 != 0) {
                        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9(org.telegram.ui.Components.j9.d(g6Var.f27536n), new int[]{E0, E02});
                        this.f47203w1 = j9Var.f(org.telegram.ui.Components.i9.w(0.5f, 3), new u61(this, 0), 100L);
                        la0Var = j9Var;
                    } else {
                        la0Var = new ColorDrawable(E0);
                    }
                    this.f47210z0.setBackground(la0Var);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.Y0;
                    if (tL_wallPaper4 != null) {
                        b71 b71Var5 = this.f47210z0;
                        org.telegram.messenger.ac b11 = org.telegram.messenger.ac.b(tL_wallPaper4.document);
                        String str5 = this.I1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.Y0;
                        b71Var5.g(1, tL_wallPaper5.document.size, tL_wallPaper5, str5, null, "jpg", b11, null);
                    }
                } else {
                    Drawable t02 = org.telegram.ui.ActionBar.k6.t0();
                    if (t02 != null) {
                        if (t02 instanceof org.telegram.ui.Components.la0) {
                            ((org.telegram.ui.Components.la0) t02).q(this.f47210z0);
                        }
                        this.f47210z0.setBackground(t02);
                    }
                }
                if (E02 == 0) {
                    int V0 = org.telegram.messenger.g0.V0(E0, false);
                    this.m1 = V0;
                    this.f47178l1 = V0;
                } else if (E03 != 0) {
                    this.f47178l1 = org.telegram.ui.Components.la0.g(E0, E02, E03, E04);
                    this.m1 = 754974720;
                } else {
                    int V02 = org.telegram.messenger.g0.V0(org.telegram.messenger.g0.w0(E0, E02), false);
                    this.m1 = V02;
                    this.f47178l1 = V02;
                }
                b71 b71Var6 = this.f47210z0;
                if (b71Var6 != null) {
                    b71Var6.getImageReceiver().f21261p1 = new PorterDuffColorFilter(this.f47178l1, this.f47198u1);
                    this.f47210z0.getImageReceiver().setAlpha(Math.abs(this.f47182n1));
                    this.f47210z0.invalidate();
                    if (org.telegram.ui.ActionBar.k6.I.q() && (this.f47210z0.getBackground() instanceof org.telegram.ui.Components.la0)) {
                        org.telegram.ui.Cells.h0 h0Var = this.V0;
                        if (h0Var != null) {
                            h0Var.setTwoSided(true);
                        }
                        if (this.f47182n1 < 0.0f) {
                            this.f47210z0.getImageReceiver().m0(((org.telegram.ui.Components.la0) this.f47210z0.getBackground()).f35658k);
                        }
                    } else {
                        this.f47210z0.getImageReceiver().m0(null);
                        org.telegram.ui.Cells.h0 h0Var2 = this.V0;
                        if (h0Var2 != null) {
                            h0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.h0 h0Var3 = this.V0;
                    if (h0Var3 != null) {
                        h0Var3.setProgress(this.f47182n1);
                    }
                }
                if (this.L0 != null) {
                    int i21 = 0;
                    while (true) {
                        org.telegram.ui.Components.o61[] o61VarArr = this.L0;
                        if (i21 >= o61VarArr.length) {
                            break;
                        }
                        o61VarArr[i21].b(0, E0);
                        this.L0[i21].b(1, E02);
                        this.L0[i21].b(2, E03);
                        this.L0[i21].b(3, E04);
                        i21++;
                    }
                }
                ImageView imageView = this.H0;
                l61 l61Var = this.f47141a;
                if (imageView != null) {
                    org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Wc, l61Var, PorterDuff.Mode.MULTIPLY);
                }
                ImageView imageView2 = this.I0;
                if (imageView2 != null) {
                    org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.Wc, l61Var, PorterDuff.Mode.MULTIPLY);
                }
                a1();
            }
        }
        this.F1 = false;
    }

    @Override
    public final int getObserverTag() {
        return this.f47200v1;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.f47141a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.N1) {
            return X0();
        }
        return super.getThemeDescriptions();
    }

    public final void h1(long j10) {
        boolean z10;
        this.L1 = j10;
        if (j10 != 0 && j10 != getUserConfig().e()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.M1 = z10;
    }

    public final void i1(org.telegram.ui.Cells.t0 t0Var) {
        l61 l61Var;
        float f10;
        if (this.f47210z0 == null) {
            return;
        }
        Bitmap bitmap = this.f47141a.f47121i;
        float f11 = 0.0f;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f10 = ((this.f47210z0.getMeasuredWidth() - (Math.max(this.f47210z0.getMeasuredWidth() / width, this.f47210z0.getMeasuredHeight() / l61Var.f47121i.getHeight()) * width)) / 2.0f) + this.Z1 + 0.0f;
        } else {
            f10 = this.Z1 + 0.0f;
        }
        float y9 = t0Var.getY() - ((-this.f47210z0.K) + 0.0f);
        int measuredHeight = this.f47210z0.getMeasuredHeight();
        if (this.O1) {
            f11 = this.f47186p1 * this.f47188q1;
        }
        t0Var.f30437x0 = true;
        t0Var.f30434w0 = measuredHeight;
        t0Var.f30429u0 = y9;
        t0Var.f30431v0 = f10;
        t0Var.c2 = f11;
        t0Var.f30380d2.setColor(i0.a.o(-16777216, (int) (f11 * 255.0f)));
        t0Var.invalidate();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.f47145b == 2) {
            if (this.c2 && motionEvent != null) {
                if (motionEvent.getY() > org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final void j1() {
        if (this.f47199v0 != null && this.M0 != null && this.f47201w.f27530g != 0) {
            SharedPreferences e12 = org.telegram.messenger.hp.e1();
            if (!e12.getBoolean("bganimationhint", false)) {
                if (this.C0 == null) {
                    org.telegram.ui.Components.u20 u20Var = new org.telegram.ui.Components.u20(getParentActivity(), 8);
                    this.C0 = u20Var;
                    u20Var.setShowingDuration(5000L);
                    this.C0.setAlpha(0.0f);
                    this.C0.setVisibility(4);
                    this.C0.setText(org.telegram.messenger.bd.M0(2131753751, null));
                    this.C0.setExtraTranslationY(org.telegram.messenger.g0.L(6.0f));
                    this.m0.addView(this.C0, b8.mf.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                org.telegram.messenger.g0.i3(new qv0(19, this, e12), 500L);
            }
        }
    }

    public final void k1(int i3, boolean z10, boolean z11) {
        boolean z12;
        char c2;
        char c10;
        FrameLayout frameLayout;
        float f10;
        int i10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i11;
        FrameLayout frameLayout2;
        int i12;
        float f16;
        FrameLayout frameLayout3;
        float f17;
        float f18;
        float f19;
        int i13;
        int i14;
        int i15;
        char c11 = 0;
        if (z10 && i3 == 1 && this.Y0 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i16 = this.f47145b;
        if (z10) {
            if (i3 == 0) {
                if (i16 == 2) {
                    this.f47151c1 = this.f47147b1;
                    int i17 = this.f47153d1;
                    this.f47164g1 = i17;
                    int i18 = this.f47157e1;
                    this.f47167h1 = i18;
                    int i19 = this.f47161f1;
                    this.f47170i1 = i19;
                    this.k1 = this.Q;
                    if (i19 != 0) {
                        i15 = 4;
                    } else if (i18 != 0) {
                        i15 = 3;
                    } else if (i17 != 0) {
                        i15 = 2;
                    } else {
                        i15 = 1;
                    }
                    this.X.f(0, 4, i15, false);
                    this.X.e(this.f47161f1, 3);
                    this.X.e(this.f47157e1, 2);
                    this.X.e(this.f47153d1, 1);
                    this.X.e(this.f47147b1, 0);
                }
            } else {
                this.Z0 = this.Y0;
                this.f47184o1 = this.f47182n1;
                this.S0.f();
                ArrayList arrayList = this.W0;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.Y0;
                    if (tL_wallPaper == null) {
                        i14 = 0;
                    } else {
                        int indexOf = arrayList.indexOf(tL_wallPaper);
                        if (i16 == 2) {
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        i14 = indexOf + i13;
                    }
                    this.T0.h1(i14, (this.R0.getMeasuredWidth() - org.telegram.messenger.g0.L(124.0f)) / 2);
                }
            }
        }
        if (i16 == 1 || i16 == 2) {
            org.telegram.ui.Components.o61[] o61VarArr = this.L0;
            if (z12) {
                c2 = 2;
            } else {
                c2 = 0;
            }
            o61VarArr[c2].setVisibility(0);
        }
        if (i3 == 1) {
            org.telegram.ui.Cells.h0 h0Var = this.V0;
            if (!h0Var.N) {
                float f20 = this.f47182n1;
                if (f20 < 0.0f) {
                    float f21 = -f20;
                    this.f47182n1 = f21;
                    h0Var.setProgress(f21);
                }
            }
        }
        int i20 = 58;
        float f22 = 1.0f;
        FrameLayout[] frameLayoutArr = this.N0;
        if (z11) {
            this.f47196t1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            if (i3 == 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (z10) {
                frameLayoutArr[i3].setVisibility(0);
                if (i16 == 1) {
                    g61 g61Var = this.f47202w0;
                    Property property = View.TRANSLATION_Y;
                    if (i3 == 1) {
                        f17 = -org.telegram.messenger.g0.L(21.0f);
                    } else {
                        f17 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(g61Var, property, f17));
                    org.telegram.ui.Components.o61 o61Var = this.L0[2];
                    Property property2 = View.ALPHA;
                    if (z12) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(o61Var, property2, f18));
                    org.telegram.ui.Components.o61 o61Var2 = this.L0[0];
                    if (z12) {
                        f19 = 0.0f;
                    } else {
                        f19 = 1.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(o61Var2, property2, f19));
                    if (i3 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i3], property2, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i3].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i11], property2, 0.0f));
                    }
                    org.telegram.messenger.g0.v1(this.X.F[1]);
                } else if (i16 == 2) {
                    g61 g61Var2 = this.f47202w0;
                    Property property3 = View.TRANSLATION_Y;
                    int i21 = -frameLayoutArr[i3].getMeasuredHeight();
                    if (this.C1 == null) {
                        i20 = 0;
                    }
                    int L = org.telegram.messenger.g0.L(i20 + 72) + i21;
                    if (Z0()) {
                        i12 = org.telegram.messenger.g0.f22603n;
                    } else {
                        i12 = 0;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(g61Var2, property3, L + i12));
                    org.telegram.ui.Components.o61 o61Var3 = this.L0[2];
                    Property property4 = View.ALPHA;
                    if (z12) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(o61Var3, property4, f16));
                    org.telegram.ui.Components.o61 o61Var4 = this.L0[0];
                    if (z12) {
                        f22 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(o61Var4, property4, f22));
                    if (frameLayoutArr[i11].getVisibility() == 0) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i11], property4, 0.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i3], property4, 0.0f, 1.0f));
                        frameLayoutArr[i3].setTranslationY(0.0f);
                    } else {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i3], property3, frameLayout3.getMeasuredHeight(), 0.0f));
                    }
                } else {
                    if (i3 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i3], View.ALPHA, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i3].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i11], View.ALPHA, 0.0f));
                    }
                    org.telegram.messenger.g0.v1(this.X.F[1]);
                }
            } else {
                g61 g61Var3 = this.f47202w0;
                Property property5 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(g61Var3, property5, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i3], property5, frameLayout2.getMeasuredHeight()));
                org.telegram.ui.Components.o61 o61Var5 = this.L0[0];
                Property property6 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(o61Var5, property6, 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.L0[2], property6, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.f47210z0, property6, 1.0f));
            }
            this.f47196t1.playTogether(arrayList2);
            this.f47196t1.addListener(new t61(this, z10, i11, i3, z12));
            this.f47196t1.setInterpolator(org.telegram.ui.Components.xq.f40453g);
            this.f47196t1.setDuration(200L);
            this.f47196t1.start();
            return;
        }
        if (i3 == 0) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        if (z10) {
            frameLayoutArr[i3].setVisibility(0);
            if (i16 == 1) {
                g61 g61Var4 = this.f47202w0;
                if (i3 == 1) {
                    f13 = -org.telegram.messenger.g0.L(21.0f);
                } else {
                    f13 = 0.0f;
                }
                g61Var4.setTranslationY(f13);
                org.telegram.ui.Components.o61 o61Var6 = this.L0[2];
                if (z12) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                o61Var6.setAlpha(f14);
                org.telegram.ui.Components.o61 o61Var7 = this.L0[0];
                if (z12) {
                    f15 = 0.0f;
                } else {
                    f15 = 1.0f;
                }
                o61Var7.setAlpha(f15);
                if (i3 == 1) {
                    frameLayoutArr[i3].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i3].setAlpha(1.0f);
                    frameLayoutArr[c10].setAlpha(0.0f);
                }
                org.telegram.messenger.g0.v1(this.X.F[1]);
            } else if (i16 == 2) {
                g61 g61Var5 = this.f47202w0;
                if (i3 == 0) {
                    f10 = 343.0f;
                } else {
                    f10 = 316.0f;
                }
                int i22 = -org.telegram.messenger.g0.L(f10);
                if (this.C1 == null) {
                    i20 = 0;
                }
                int L2 = org.telegram.messenger.g0.L(i20 + 72) + i22;
                if (Z0()) {
                    i10 = org.telegram.messenger.g0.f22603n;
                } else {
                    i10 = 0;
                }
                g61Var5.setTranslationY(L2 + i10);
                org.telegram.ui.Components.o61 o61Var8 = this.L0[2];
                if (z12) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                o61Var8.setAlpha(f11);
                org.telegram.ui.Components.o61 o61Var9 = this.L0[0];
                if (z12) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                o61Var9.setAlpha(f12);
                if (frameLayoutArr[c10].getVisibility() == 0) {
                    frameLayoutArr[c10].setAlpha(0.0f);
                    frameLayoutArr[i3].setAlpha(1.0f);
                    frameLayoutArr[i3].setTranslationY(0.0f);
                } else {
                    frameLayoutArr[i3].setTranslationY(0.0f);
                }
            } else {
                if (i3 == 1) {
                    frameLayoutArr[i3].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i3].setAlpha(1.0f);
                    frameLayoutArr[c10].setAlpha(0.0f);
                }
                org.telegram.messenger.g0.v1(this.X.F[1]);
            }
        } else {
            this.f47202w0.setTranslationY(0.0f);
            frameLayoutArr[i3].setTranslationY(frameLayout.getMeasuredHeight());
            this.L0[0].setAlpha(1.0f);
            this.L0[2].setAlpha(1.0f);
            this.f47210z0.setAlpha(1.0f);
        }
        if (z10 && frameLayoutArr[c10].getVisibility() == 0) {
            frameLayoutArr[c10].setAlpha(1.0f);
            frameLayoutArr[c10].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i3].setVisibility(4);
        }
        if (i16 != 1 && i16 != 2) {
            if (i3 == 1) {
                frameLayoutArr[c10].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.o61[] o61VarArr2 = this.L0;
        if (!z12) {
            c11 = 2;
        }
        o61VarArr2[c11].setVisibility(4);
    }

    public final void l1() {
        Window window;
        if (this.f47174j2 != null) {
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
        this.Q1.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.Q1.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        this.Q1.getLocationInWindow(iArr);
        float f10 = iArr[0];
        float f11 = iArr[1];
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.f22603n;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        ac acVar = new ac(this, getParentActivity(), canvas, (this.Q1.getMeasuredWidth() / 2.0f) + f10, (this.Q1.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 2);
        this.f47174j2 = acVar;
        acVar.setOnTouchListener(new fi.a(2));
        this.f47176k2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f47179l2 = ofFloat;
        ofFloat.addUpdateListener(new gi.ea(this, 3));
        this.f47179l2.addListener(new q61(this, 4));
        this.f47179l2.setDuration(400L);
        this.f47179l2.setInterpolator(org.telegram.ui.Components.ks.f35477e);
        this.f47179l2.start();
        frameLayout.addView(this.f47174j2, new ViewGroup.LayoutParams(-1, -1));
        org.telegram.messenger.g0.h3(new y51(this, 2));
    }

    public final void m1(boolean z10) {
        int i3 = (this.L1 > 0L ? 1 : (this.L1 == 0L ? 0 : -1));
        if (i3 > 0) {
            this.B1.d(org.telegram.messenger.bd.M0(2131754212, null));
        } else if (i3 < 0) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.L1));
            if (M0 != null) {
                this.B1.d(org.telegram.messenger.bd.a0(null, null, 2131754213, M0.title));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < W0()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                    if (this.f47194s1 == null) {
                        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131231976, 0);
                        this.f47194s1 = wpVar;
                        wpVar.f40044n = 1;
                    }
                    spannableStringBuilder.setSpan(this.f47194s1, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.bd.G(W0(), "ReactionLevelRequiredBtn", new Object[0]));
                    this.B1.c(spannableStringBuilder, z10);
                    return;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.X1;
                if (tL_premium_boostsStatus2 == null) {
                    if (this.L1 < 0 && !this.V1 && !this.W1 && tL_premium_boostsStatus2 == null) {
                        this.V1 = true;
                        getMessagesController().G0().a(this.L1, new b61(this, 1));
                        return;
                    }
                    return;
                }
                this.B1.c(null, z10);
                return;
            }
            this.B1.d(org.telegram.messenger.bd.a0(null, null, 2131754213, org.telegram.messenger.bd.M0(2131754904, null).toLowerCase()));
        } else {
            this.B1.d(org.telegram.messenger.bd.M0(2131754214, null));
        }
    }

    public final void n1() {
        if (this.H1 && this.f47209y1 == null) {
            Bitmap bitmap = this.E1;
            if (bitmap != null) {
                this.f47211z1 = bitmap;
                this.f47209y1 = Utilities.e(bitmap);
            } else {
                ImageReceiver imageReceiver = this.f47210z0.getImageReceiver();
                if (imageReceiver.L() || imageReceiver.f21256n0 != null) {
                    this.f47211z1 = imageReceiver.n();
                    this.f47209y1 = Utilities.e(imageReceiver.n());
                }
            }
        }
        if (this.H1) {
            Bitmap bitmap2 = this.f47209y1;
            if (bitmap2 != null) {
                this.f47210z0.setImageBitmap(bitmap2);
                return;
            }
            return;
        }
        g1(false);
    }

    public final void o1() {
        File A;
        String name;
        int i3;
        long j10;
        File file;
        String str;
        float f10;
        FrameLayout frameLayout;
        float f11;
        Object obj = this.Y0;
        if (obj == null) {
            obj = this.D1;
        }
        boolean z10 = obj instanceof TLRPC.TL_wallPaper;
        if (z10 || (obj instanceof org.telegram.messenger.bf)) {
            if (z10) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                str = org.telegram.messenger.w7.r(null, tL_wallPaper.document);
                if (!TextUtils.isEmpty(str)) {
                    org.telegram.messenger.w7.G(this.currentAccount);
                    file = org.telegram.messenger.w7.K(tL_wallPaper.document, null, true, true);
                    j10 = tL_wallPaper.document.size;
                } else {
                    return;
                }
            } else {
                org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) obj;
                TLRPC.Photo photo = bfVar.K;
                if (photo != null) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, this.J1, true, null, false);
                    org.telegram.messenger.w7.G(this.currentAccount);
                    A = org.telegram.messenger.w7.K(w10, null, true, true);
                    name = org.telegram.messenger.w7.r(null, w10);
                    i3 = w10.size;
                } else {
                    A = org.telegram.messenger.zb.A(bfVar.C);
                    name = A.getName();
                    i3 = bfVar.G;
                }
                j10 = i3;
                String str2 = name;
                file = A;
                str = str2;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            }
            boolean exists = file.exists();
            int i10 = this.f47145b;
            if (exists) {
                org.telegram.messenger.z5.q(this.currentAccount).v(this);
                this.f47210z0.invalidate();
                if (i10 == 2) {
                    if (j10 != 0 && this.L1 == 0) {
                        this.f47197u0.setSubtitle(org.telegram.messenger.g0.i0(j10, false, false));
                    } else {
                        this.f47197u0.setSubtitle(null);
                    }
                }
            } else {
                org.telegram.messenger.z5.q(this.currentAccount).a(str, null, this);
                if (i10 == 2 && this.L1 == 0) {
                    this.f47197u0.setSubtitle(org.telegram.messenger.bd.M0(2131748786, null));
                }
                this.f47210z0.invalidate();
            }
            float f12 = 0.5f;
            if (this.Y0 == null && (frameLayout = this.A0) != null) {
                if (exists) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.5f;
                }
                frameLayout.setAlpha(f11);
            }
            if (i10 == 0) {
                this.f47156e0.setEnabled(exists);
                TextView textView = this.f47156e0;
                if (exists) {
                    f12 = 1.0f;
                }
                textView.setAlpha(f12);
            } else if (i10 == 2) {
                this.E0.setEnabled(exists);
                c71 c71Var = this.B1;
                if (c71Var != null) {
                    if (exists) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.5f;
                    }
                    c71Var.setAlpha(f10);
                }
                c71 c71Var2 = this.C1;
                if (c71Var2 != null) {
                    if (exists) {
                        f12 = 1.0f;
                    }
                    c71Var2.setAlpha(f12);
                }
            } else {
                this.f47159f.setEnabled(exists);
                org.telegram.ui.ActionBar.q0 q0Var = this.f47159f;
                if (exists) {
                    f12 = 1.0f;
                }
                q0Var.setAlpha(f12);
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
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && q4Var.getBottomSheet() != null) {
            this.parentLayout.getBottomSheet().O(getThemedColor(org.telegram.ui.ActionBar.k6.f27954h5));
            if (this.f47145b == 2 && this.L1 != 0) {
                this.parentLayout.getBottomSheet().E0(-16777216);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.f23283p3);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23246i4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23252j4);
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23318u5);
        int i3 = this.f47145b;
        if (i3 == 1 || i3 == 0) {
            org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23351z4);
        }
        if (i3 == 2 || i3 == 1) {
            org.telegram.ui.ActionBar.k6.N = true;
        }
        if (i3 == 0 && this.f47201w == null) {
            this.G1 = org.telegram.ui.ActionBar.k6.f27967i0;
        } else {
            Point point = org.telegram.messenger.g0.f22608q;
            int min = Math.min(point.x, point.y);
            int max = Math.max(point.x, point.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / org.telegram.messenger.g0.f22607p));
            sb2.append("_");
            this.I1 = a1.g.o((int) (max / org.telegram.messenger.g0.f22607p), "_f", sb2);
            this.J1 = Math.max(point.x, point.y);
            org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23229f4);
            org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23223e4);
            this.f47200v1 = org.telegram.messenger.z5.q(this.currentAccount).k();
            if (this.W0 == null) {
                this.W0 = new ArrayList();
                org.telegram.messenger.qr.a0(this.currentAccount).p0();
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23283p3);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23252j4);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23318u5);
        n61 n61Var = this.m0;
        if (n61Var != null && this.S != null) {
            n61Var.getViewTreeObserver().removeOnGlobalLayoutListener(this.S);
        }
        int i3 = this.f47145b;
        if ((i3 == 2 || i3 == 1) && this.f47191r1 == null) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.go(29));
        }
        int i10 = org.telegram.messenger.hs.f23351z4;
        if (i3 == 2) {
            Bitmap bitmap = this.f47209y1;
            if (bitmap != null) {
                bitmap.recycle();
                this.f47209y1 = null;
            }
            this.f47141a.k(null, null, null);
            org.telegram.messenger.hs.e().k(i10, new Object[0]);
        } else if (i3 == 1 || i3 == 0) {
            org.telegram.messenger.hs.e().n(this, i10);
        }
        if (i3 != 0 || this.f47201w != null) {
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23229f4);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23223e4);
        }
        super.onFragmentDestroy();
        T0(null);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.G1) {
            this.f47206x1.c(false);
        }
        org.telegram.ui.ActionBar.k6.f27835b = false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        n4 n4Var = this.f47187q0;
        if (n4Var != null) {
            n4Var.f();
        }
        h71 h71Var = this.f47205x0;
        if (h71Var != null) {
            h71Var.f();
        }
        if (this.G1) {
            this.f47206x1.c(true);
        }
        org.telegram.ui.ActionBar.k6.f27835b = true;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            V0();
            try {
                b5.l lVar = this.f47177l0;
                if (lVar != null) {
                    org.telegram.messenger.g0.C3(lVar, getThemedColor(org.telegram.ui.ActionBar.k6.f28160s8));
                }
                org.telegram.ui.Cells.h0 h0Var = this.V0;
                if (h0Var != null) {
                    h0Var.setOuterColor(getThemedColor(org.telegram.ui.ActionBar.k6.Jj));
                    this.V0.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (!z10 && this.f47145b == 2) {
            this.f47141a.k(null, null, null);
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23351z4, new Object[0]);
        }
    }

    public final void p1() {
        this.f47210z0.getImageReceiver().setAlpha(Math.abs(this.f47182n1));
        this.f47210z0.invalidate();
        this.R0.g1();
        if (this.f47182n1 >= 0.0f) {
            this.f47210z0.getImageReceiver().m0(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f47210z0.getImageReceiver().Z(null);
            }
            if (this.f47210z0.getBackground() instanceof org.telegram.ui.Components.la0) {
                this.f47210z0.getImageReceiver().m0(((org.telegram.ui.Components.la0) this.f47210z0.getBackground()).f35658k);
            }
        }
        this.f47141a.k(this.f47210z0.getBackground(), this.f47210z0.getBackground(), Float.valueOf(this.f47182n1));
        a1();
    }

    public final void q1() {
        char c2;
        float f10;
        boolean z10;
        boolean z11;
        float f11;
        float f12 = 1.0f;
        float f13 = 0.0f;
        int i3 = this.f47145b;
        if (i3 != 1 && i3 != 2) {
            boolean isEnabled = this.L0[0].isEnabled();
            TLRPC.TL_wallPaper tL_wallPaper = this.Y0;
            if (tL_wallPaper != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (isEnabled == z10) {
                return;
            }
            if (tL_wallPaper == null) {
                this.L0[0].a(false, true);
            }
            org.telegram.ui.Components.o61 o61Var = this.L0[0];
            if (this.Y0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            o61Var.setEnabled(z11);
            if (this.Y0 != null) {
                this.L0[0].setVisibility(0);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            int L = (org.telegram.messenger.g0.L(9.0f) + ((FrameLayout.LayoutParams) this.L0[1].getLayoutParams()).width) / 2;
            org.telegram.ui.Components.o61 o61Var2 = this.L0[0];
            Property property = View.ALPHA;
            if (this.Y0 == null) {
                f12 = 0.0f;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(o61Var2, property, f12));
            org.telegram.ui.Components.o61 o61Var3 = this.L0[0];
            Property property2 = View.TRANSLATION_X;
            if (this.Y0 != null) {
                f11 = 0.0f;
            } else {
                f11 = L;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(o61Var3, property2, f11));
            org.telegram.ui.Components.o61 o61Var4 = this.L0[1];
            if (this.Y0 == null) {
                f13 = -L;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(o61Var4, property2, f13));
            animatorSet.setInterpolator(org.telegram.ui.Components.xq.f40453g);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new s61(this));
            animatorSet.start();
            return;
        }
        if (this.Y0 == null && (this.D1 instanceof kc1)) {
            this.L0[2].a(false, true);
        }
        org.telegram.ui.Components.o61[] o61VarArr = this.L0;
        if (this.Y0 != null) {
            c2 = 2;
        } else {
            c2 = 0;
        }
        o61VarArr[c2].setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        org.telegram.ui.Components.o61 o61Var5 = this.L0[2];
        Property property3 = View.ALPHA;
        if (this.Y0 != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o61Var5, property3, f10);
        org.telegram.ui.Components.o61 o61Var6 = this.L0[0];
        if (this.Y0 != null) {
            f12 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(o61Var6, property3, f12));
        animatorSet2.addListener(new r61(this));
        animatorSet2.setInterpolator(org.telegram.ui.Components.xq.f40453g);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }

    public final void r1(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l71.r1(boolean):void");
    }

    public final void s1() {
        int childCount = this.R0.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.R0.getChildAt(i3);
            if (childAt instanceof org.telegram.ui.Cells.i5) {
                ((org.telegram.ui.Cells.i5) childAt).w(true);
            }
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f47141a.f47115a = e6Var;
    }

    public l71(org.telegram.ui.ActionBar.j6 j6Var, boolean z10, int i3, boolean z11, boolean z12) {
        super(null);
        this.f47141a = new l61(this);
        this.d = true;
        this.f47180n = 1;
        org.telegram.ui.ActionBar.p5 p5Var = new org.telegram.ui.ActionBar.p5(this, 0, false);
        this.T = p5Var;
        org.telegram.ui.ActionBar.p5 p5Var2 = new org.telegram.ui.ActionBar.p5(this, 0, true);
        this.U = p5Var2;
        org.telegram.ui.ActionBar.p5 p5Var3 = new org.telegram.ui.ActionBar.p5(this, 1, false);
        this.V = p5Var3;
        org.telegram.ui.ActionBar.p5 p5Var4 = new org.telegram.ui.ActionBar.p5(this, 1, true);
        this.W = p5Var4;
        this.Z = -1;
        this.f47142a0 = new y51(this, 0);
        this.f47208y0 = new b71[2];
        this.N0 = new FrameLayout[2];
        this.O0 = new TextView[2];
        this.P0 = new TextView[2];
        this.Q0 = new FrameLayout[2];
        this.X0 = new HashMap();
        this.f47182n1 = 0.5f;
        this.f47186p1 = 0.0f;
        this.f47198u1 = PorterDuff.Mode.SRC_IN;
        this.A1 = 1.0f;
        this.I1 = "640_360";
        this.J1 = 1920;
        this.M1 = true;
        this.U1 = new org.telegram.ui.Components.v00(getParentActivity(), new o61(this));
        this.V1 = false;
        this.W1 = false;
        this.f47145b = i3;
        this.f47166h0 = z12;
        this.f47163g0 = j6Var;
        this.f47172j0 = z10;
        this.f47169i0 = z11;
        if (i3 == 1) {
            org.telegram.ui.ActionBar.g6 k10 = j6Var.k(!z11);
            this.f47201w = k10;
            if (k10 != null) {
                this.d = false;
                this.f47207y = k10.f27527c;
                this.E = k10.d;
                this.F = k10.f27528e;
                this.G = k10.f27529f;
                this.H = k10.f27530g;
                this.I = k10.h;
                this.J = k10.f27531i;
                this.K = k10.f27532j;
                this.L = k10.f27533k;
                this.M = k10.f27534l;
                this.N = k10.f27535m;
                this.O = k10.f27538p;
                this.P = k10.f27537o;
                this.Q = k10.f27536n;
            }
        } else {
            if (i3 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.g6 k11 = j6Var.k(false);
            this.f47201w = k11;
            if (k11 != null) {
                this.Y0 = k11.f27541s;
            }
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.f47201w;
        if (g6Var != null) {
            this.G1 = g6Var.f27539q;
            if (!TextUtils.isEmpty(g6Var.f27537o)) {
                this.f47182n1 = this.f47201w.f27538p;
            }
            org.telegram.ui.ActionBar.k6.M = org.telegram.ui.ActionBar.k6.D0();
            org.telegram.ui.ActionBar.k6.O = true;
            org.telegram.ui.ActionBar.k6.P = true;
            org.telegram.ui.ActionBar.k6.u(j6Var, false, false);
        }
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23317u4, new Object[0]);
        p5Var.v = true;
        p5Var3.v = true;
        p5Var2.v = true;
        p5Var4.v = true;
    }

    @Override
    public final void i(long j10, long j11) {
    }

    @Override
    public final void o(long j10, long j11) {
    }

    public l71(org.telegram.ui.ActionBar.j6 j6Var) {
        this(j6Var, false, 0, false, false);
    }
}
