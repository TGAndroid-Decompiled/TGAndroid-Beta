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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
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
public class jd1 extends org.telegram.ui.ActionBar.p2 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public gc1 A0;
    public boolean A1;
    public final int B;
    public gc1 B0;
    public boolean B1;
    public final int C;
    public ImageView C0;
    public boolean C1;
    public final int D;
    public ImageView D0;
    public String D1;
    public final boolean E;
    public AnimatorSet E0;
    public int E1;
    public final long F;
    public AnimatorSet F0;
    public id1 F1;
    public final long G;
    public org.telegram.ui.Components.m81[] G0;
    public long G1;
    public final long H;
    public org.telegram.ui.Components.m81[] H0;
    public boolean H1;
    public final long I;
    public final FrameLayout[] I0;
    public boolean I1;
    public final float J;
    public final TextView[] J0;
    public boolean J1;
    public final String K;
    public final TextView[] K0;
    public org.telegram.ui.Components.hj0 K1;
    public final int L;
    public final FrameLayout[] L0;
    public org.telegram.ui.ActionBar.w0 L1;
    public long M;
    public qb1 M0;
    public ValueAnimator M1;
    public y90 N;
    public hd1 N0;
    public eg.q1 N1;
    public final org.telegram.ui.ActionBar.r5 O;
    public f2.j0 O0;
    public fc1 O1;
    public final org.telegram.ui.ActionBar.r5 P;
    public org.telegram.ui.Cells.m4 P0;
    public final org.telegram.ui.Components.l20 P1;
    public final org.telegram.ui.ActionBar.r5 Q;
    public org.telegram.ui.Cells.j0 Q0;
    public boolean Q1;
    public final org.telegram.ui.ActionBar.r5 R;
    public ArrayList R0;
    public boolean R1;
    public org.telegram.ui.Components.mq S;
    public final HashMap S0;
    public TL_stories.TL_premium_boostsStatus S1;
    public int T;
    public TLRPC.TL_wallPaper T0;
    public float T1;
    public int U;
    public TLRPC.TL_wallPaper U0;
    public float U1;
    public final Runnable V;
    public TLRPC.TL_wallPaper V0;
    public float V1;
    public boolean W;
    public int W0;
    public float W1;
    public fg.i0 X;
    public int X0;
    public boolean X1;
    public FrameLayout Y;
    public int Y0;
    public int Y1;
    public TextView Z;
    public int Z0;
    public ValueAnimator Z1;
    public final ic1 f37961a;
    public TextView f37962a0;
    public int f37963a1;
    public boolean a2;
    public final int f37964b;
    public final org.telegram.ui.ActionBar.j6 f37965b0;
    public int f37966b1;
    public TextView f37967b2;
    public Scroller f37968c;
    public final boolean f37969c0;
    public int f37970c1;
    public WeakReference f37971c2;
    public final boolean d;
    public final boolean f37972d0;
    public int f37973d1;
    public BitmapDrawable f37974d2;
    public org.telegram.ui.Components.wl f37975e;
    public final boolean f37976e0;
    public int f37977e1;
    public jc f37978e2;
    public org.telegram.ui.ActionBar.w0 f37979f;
    public ArrayList f37980f0;
    public int f37981f1;
    public float f37982f2;
    public m2.h f37983g0;
    public int f37984g1;
    public ValueAnimator f37985g2;
    public TextView h;
    public mc1 f37986h0;
    public int f37987h1;
    public UndoView f37988i0;
    public float f37989i1;
    public FrameLayout f37990j0;
    public float f37991j1;
    public org.telegram.ui.Components.sl0 f37992k0;
    public float f37993k1;
    public bd1 f37994l0;
    public float l1;
    public org.telegram.ui.Components.a20 m0;
    public ad1 f37995m1;
    public int f37996n;
    public MessageObject f37997n0;
    public org.telegram.ui.Components.oq f37998n1;
    public boolean f37999o0;
    public AnimatorSet f38000o1;
    public org.telegram.ui.ActionBar.k f38001p0;
    public final PorterDuff.Mode f38002p1;
    public org.telegram.ui.ActionBar.r0 f38003q0;
    public int f38004q1;
    public Drawable f38005r;
    public dc1 f38006r0;
    public org.telegram.ui.Components.j9 f38007r1;
    public final org.telegram.ui.ActionBar.i6 f38008s;
    public fd1 f38009s0;
    public org.telegram.ui.Components.o81 f38010s1;
    public final yc1[] f38011t0;
    public Bitmap f38012t1;
    public yc1 f38013u0;
    public Bitmap f38014u1;
    public boolean v;
    public FrameLayout f38015v0;
    public float f38016v1;
    public final int f38017w;
    public FrameLayout f38018w0;
    public zc1 f38019w1;
    public final int f38020x;
    public org.telegram.ui.Components.m40 f38021x0;
    public zc1 f38022x1;
    public final int f38023y;
    public AnimatorSet f38024y0;
    public Object f38025y1;
    public w4 f38026z0;
    public Bitmap f38027z1;

    public jd1(Object obj, Bitmap bitmap, boolean z4) {
        super(null);
        this.f37961a = new ic1(this);
        this.d = true;
        this.f37996n = 1;
        org.telegram.ui.ActionBar.r5 r5Var = new org.telegram.ui.ActionBar.r5(this, 0, false);
        this.O = r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2 = new org.telegram.ui.ActionBar.r5(this, 0, true);
        this.P = r5Var2;
        org.telegram.ui.ActionBar.r5 r5Var3 = new org.telegram.ui.ActionBar.r5(this, 1, false);
        this.Q = r5Var3;
        org.telegram.ui.ActionBar.r5 r5Var4 = new org.telegram.ui.ActionBar.r5(this, 1, true);
        this.R = r5Var4;
        this.U = -1;
        this.V = new vb1(this, 0);
        this.f38011t0 = new yc1[2];
        this.I0 = new FrameLayout[2];
        this.J0 = new TextView[2];
        this.K0 = new TextView[2];
        this.L0 = new FrameLayout[2];
        this.S0 = new HashMap();
        this.f37989i1 = 0.5f;
        this.f37993k1 = 0.0f;
        this.f38002p1 = PorterDuff.Mode.SRC_IN;
        this.f38016v1 = 1.0f;
        this.D1 = "640_360";
        this.E1 = 1920;
        this.H1 = true;
        this.P1 = new org.telegram.ui.Components.l20(getParentActivity(), new kc1(this));
        this.Q1 = false;
        this.R1 = false;
        this.f37964b = 2;
        this.f38025y1 = obj;
        this.f38027z1 = bitmap;
        this.A1 = z4;
        if (obj instanceof vi1) {
            vi1 vi1Var = (vi1) obj;
            this.B1 = vi1Var.f42159j;
            TLRPC.TL_wallPaper tL_wallPaper = vi1Var.f42157g;
            this.T0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f10 = vi1Var.h;
                this.f37989i1 = f10;
                if (f10 < 0.0f && !org.telegram.ui.ActionBar.k6.I.q()) {
                    this.f37989i1 *= -1.0f;
                }
            }
        }
        r5Var.v = true;
        r5Var3.v = true;
        r5Var2.v = true;
        r5Var4.v = true;
    }

    public static void U(jd1 jd1Var) {
        org.telegram.ui.ActionBar.i6 k10;
        org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.M;
        if (j6Var == null) {
            return;
        }
        int i10 = j6Var.W;
        if (i10 >= 0) {
            k10 = (org.telegram.ui.ActionBar.i6) j6Var.X.get(i10);
        } else {
            k10 = j6Var.k(false);
        }
        if (jd1Var.f38008s != null) {
            jd1Var.W0();
            org.telegram.ui.ActionBar.k6.t1(jd1Var.f37965b0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.k6.M != null) {
                org.telegram.ui.ActionBar.k6.O = false;
                org.telegram.ui.ActionBar.k6.P = false;
                org.telegram.ui.ActionBar.k6.M = null;
            }
            org.telegram.ui.ActionBar.k6.t(jd1Var.f37965b0, true, jd1Var.f37969c0);
            ((ActionBarLayout) jd1Var.parentLayout).U(false, false);
        } else {
            ((ActionBarLayout) jd1Var.parentLayout).U(false, false);
            File file = new File(jd1Var.f37965b0.f21507b);
            org.telegram.ui.ActionBar.j6 j6Var2 = jd1Var.f37965b0;
            org.telegram.ui.ActionBar.k6.u(file, j6Var2.f21505a, j6Var2.C, false);
            MessagesController.getInstance(jd1Var.f37965b0.B).saveTheme(jd1Var.f37965b0, null, false, false);
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", jd1Var.f37965b0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) jd1Var.getParentLayout().getFragmentStack().get(Math.max(0, jd1Var.getParentLayout().getFragmentStack().size() - 2));
        jd1Var.finishFragment();
        if (jd1Var.f37964b == 0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didApplyNewTheme, j6Var, k10, Boolean.valueOf(jd1Var.f37976e0));
        }
        org.telegram.ui.ActionBar.k6.F1(p2Var);
    }

    public static void V(jd1 jd1Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = jd1Var.S0;
        org.telegram.ui.ActionBar.i6 i6Var = jd1Var.f38008s;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            jd1Var.R0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z4 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_wallPapers.wallpapers.get(i10) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i10);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f20851id))) {
                            jd1Var.R0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.f20851id), tL_wallPaper2);
                        }
                        if (i6Var != null && (str = i6Var.f21481o) != null && str.equals(tL_wallPaper2.slug)) {
                            jd1Var.T0 = tL_wallPaper2;
                            jd1Var.b1(false);
                            jd1Var.j1();
                        } else if (i6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = jd1Var.T0;
                            if (tL_wallPaper3 != null) {
                                String str2 = tL_wallPaper3.slug;
                                if (str2 != null) {
                                    if (!str2.equals(tL_wallPaper2.slug)) {
                                    }
                                }
                            }
                        }
                        z4 = true;
                    }
                }
            }
            if (!z4 && (tL_wallPaper = jd1Var.T0) != null) {
                jd1Var.R0.add(0, tL_wallPaper);
            }
            hd1 hd1Var = jd1Var.N0;
            if (hd1Var != null) {
                hd1Var.l();
            }
            MessagesStorage.getInstance(jd1Var.currentAccount).putWallpapers(tL_wallPapers.wallpapers, 1);
        }
        if (jd1Var.T0 == null && i6Var != null && !TextUtils.isEmpty(i6Var.f21481o)) {
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = i6Var.f21481o;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(jd1Var.currentAccount).bindRequestToGuid(jd1Var.getConnectionsManager().sendRequest(getwallpaper, new bc1(jd1Var, 0)), jd1Var.classGuid);
        }
    }

    public static void W(jd1 jd1Var) {
        org.telegram.ui.Components.wl wlVar = jd1Var.f37975e;
        int i10 = 0;
        if (wlVar != null) {
            wlVar.B(jd1Var.getThemedColor(org.telegram.ui.ActionBar.k6.G8));
            jd1Var.f37975e.G(jd1Var.getThemedColor(org.telegram.ui.ActionBar.k6.E8), false);
        }
        Drawable drawable = jd1Var.f38005r;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(jd1Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21661d6), PorterDuff.Mode.MULTIPLY));
        }
        w4 w4Var = jd1Var.f38026z0;
        if (w4Var != null) {
            w4Var.invalidate();
        }
        if (jd1Var.f37995m1 != null) {
            org.telegram.ui.ActionBar.f5 f5Var = jd1Var.parentLayout;
            if (f5Var != null && f5Var.getBottomSheet() != null) {
                jd1Var.parentLayout.getBottomSheet().fixNavigationBar(jd1Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21733h5));
                if (jd1Var.f37964b == 2 && jd1Var.G1 != 0) {
                    jd1Var.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            } else {
                jd1Var.setNavigationBarColor(jd1Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21733h5));
            }
        }
        if (jd1Var.G0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.m81[] m81VarArr = jd1Var.G0;
                if (i11 >= m81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.m81 m81Var = m81VarArr[i11];
                if (m81Var != null) {
                    m81Var.invalidate();
                }
                i11++;
            }
        }
        if (jd1Var.H0 != null) {
            while (true) {
                org.telegram.ui.Components.m81[] m81VarArr2 = jd1Var.H0;
                if (i10 >= m81VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.m81 m81Var2 = m81VarArr2[i10];
                if (m81Var2 != null) {
                    m81Var2.invalidate();
                }
                i10++;
            }
        }
        TextView textView = jd1Var.f37967b2;
        if (textView != null) {
            textView.setTextColor(jd1Var.getThemedColor(org.telegram.ui.ActionBar.k6.G6));
        }
        org.telegram.ui.Components.mq mqVar = jd1Var.S;
        if (mqVar != null) {
            mqVar.invalidate();
        }
        org.telegram.ui.Components.a20 a20Var = jd1Var.m0;
        if (a20Var != null) {
            a20Var.g();
        }
    }

    public static void X(jd1 jd1Var, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (jd1Var.getParentActivity() == null) {
            return;
        }
        fg.v0 v0Var = new fg.v0(23, jd1Var.currentAccount, jd1Var.getParentActivity(), jd1Var, jd1Var.f37961a);
        v0Var.G1(canApplyBoost);
        v0Var.F1(jd1Var.S1, true);
        v0Var.H1(jd1Var.G1);
        if (!jd1Var.U0()) {
            v0Var.N0 = new vb1(jd1Var, 1);
        }
        jd1Var.showDialog(v0Var);
    }

    public final void M0() {
        AnimatorSet animatorSet = this.f38024y0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f38024y0 = animatorSet2;
        if (this.B1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f38013u0, View.SCALE_X, this.f38016v1), ObjectAnimator.ofFloat(this.f38013u0, View.SCALE_Y, this.f38016v1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f38013u0, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f38013u0, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f38013u0, View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f38013u0, View.TRANSLATION_Y, 0.0f));
        }
        this.f38024y0.setInterpolator(org.telegram.ui.Components.pr.f30169g);
        this.f38024y0.addListener(new nc1(this, 1));
        this.f38024y0.start();
    }

    public final void N0(boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jd1.N0(boolean):void");
    }

    public final void O0(boolean z4) {
        int i10 = this.f37964b;
        if (i10 == 2) {
            if (!z4) {
                finishFragment();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.k6.o();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        org.telegram.ui.ActionBar.i6 i6Var = this.f38008s;
        if (i10 == 1) {
            if (this.f37972d0) {
                i6Var.f21471c = this.f38017w;
                i6Var.d = this.f38020x;
                i6Var.f21472e = this.f38023y;
                i6Var.f21473f = this.B;
                i6Var.f21474g = this.C;
                i6Var.h = this.D;
                i6Var.f21475i = this.E;
                i6Var.f21476j = this.F;
                i6Var.f21477k = this.G;
                i6Var.f21478l = this.H;
                i6Var.f21479m = this.I;
                i6Var.f21480n = this.L;
                i6Var.f21481o = this.K;
                i6Var.f21482p = this.J;
            }
            org.telegram.ui.ActionBar.k6.t1(this.f37965b0, false, true, false, false, false);
        } else {
            if (i6Var != null) {
                org.telegram.ui.ActionBar.k6.t1(this.f37965b0, false, this.f37976e0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).U(false, false);
            if (this.f37976e0) {
                org.telegram.ui.ActionBar.j6 j6Var = this.f37965b0;
                if (j6Var.f21507b != null && org.telegram.ui.ActionBar.k6.H.get(j6Var.m()) == null) {
                    new File(j6Var.f21507b).delete();
                }
            }
        }
        if (!z4) {
            finishFragment();
        }
    }

    public final BitmapDrawable P0(Drawable drawable) {
        WeakReference weakReference = this.f37971c2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.f37974d2;
        }
        WeakReference weakReference2 = this.f37971c2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f37971c2 = null;
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            this.f37971c2 = new WeakReference(drawable);
            int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, intrinsicWidth, 24);
            ColorFilter colorFilter = drawable.getColorFilter();
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.3f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.94f);
            drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            drawable.draw(new Canvas(createBitmap));
            drawable.setColorFilter(colorFilter);
            Utilities.blurBitmap(createBitmap, 3);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getParentActivity().getResources(), createBitmap);
            this.f37974d2 = bitmapDrawable;
            bitmapDrawable.setFilterBitmap(true);
            return this.f37974d2;
        }
        this.f37974d2 = null;
        return null;
    }

    public final boolean Q0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jd1.Q0(boolean):boolean");
    }

    public final int R0() {
        if (ChatObject.isChannelAndNotMegaGroup(-this.G1, this.currentAccount)) {
            return getMessagesController().channelCustomWallpaperLevelMin;
        }
        return getMessagesController().groupCustomWallpaperLevelMin;
    }

    public final ArrayList S0() {
        jy0 jy0Var = new jy0(7, this);
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f37990j0;
        int i10 = org.telegram.ui.ActionBar.k6.f21661d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(frameLayout, 1, null, null, null, jy0Var, i10));
        m2.h hVar = this.f37983g0;
        int i11 = org.telegram.ui.ActionBar.k6.f21932s8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(hVar, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.k6.f21948t8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 256, null, null, null, null, i12));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.k6.A8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar2, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.k6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38001p0, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38001p0, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38001p0, 1024, null, null, null, null, org.telegram.ui.ActionBar.k6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38001p0, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38001p0, Integer.MIN_VALUE, null, null, null, jy0Var, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38001p0, 1073741824, null, null, null, jy0Var, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37992k0, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 32768, null, null, null, null, i11));
        if (!this.d) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.Y, 1, null, null, null, null, i10));
            TextView textView = this.f37962a0;
            int i14 = org.telegram.ui.ActionBar.k6.Ae;
            arrayList.add(new org.telegram.ui.ActionBar.m6(textView, 4, null, null, null, null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 4, null, null, null, null, i14));
        }
        org.telegram.ui.Components.mq mqVar = this.S;
        if (mqVar != null) {
            org.telegram.ui.ActionBar.w0 w0Var = mqVar.F;
            EditTextBoldCursor[] editTextBoldCursorArr = mqVar.B;
            for (int i15 = 0; i15 < editTextBoldCursorArr.length; i15++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.k6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.m6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.m6(editTextBoldCursorArr[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.m6(editTextBoldCursorArr[i15], 8388608, null, null, null, null, org.telegram.ui.ActionBar.k6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(editTextBoldCursorArr[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.k6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(editTextBoldCursorArr[i15], 32, null, null, null, null, org.telegram.ui.ActionBar.k6.f21787k6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(editTextBoldCursorArr[i15], 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.f21805l6));
            }
            org.telegram.ui.ActionBar.l0 l0Var = mqVar.C;
            int i17 = org.telegram.ui.ActionBar.k6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.m6(l0Var, 8, null, null, null, null, i17));
            org.telegram.ui.ActionBar.l0 l0Var2 = mqVar.C;
            int i18 = org.telegram.ui.ActionBar.k6.I5;
            arrayList.add(new org.telegram.ui.ActionBar.m6(l0Var2, 32, null, null, null, null, i18));
            if (w0Var != null) {
                org.telegram.ui.Components.t6 t6Var = new org.telegram.ui.Components.t6(mqVar, 3);
                arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var, 0, null, null, null, t6Var, i17));
                arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var, 0, null, null, null, t6Var, i18));
                arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.I0;
        if (frameLayoutArr != null) {
            for (int i19 = 0; i19 < frameLayoutArr.length; i19++) {
                arrayList.add(new org.telegram.ui.ActionBar.m6(frameLayoutArr[i19], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21749i3}, null, org.telegram.ui.ActionBar.k6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.m6(frameLayoutArr[i19], 0, null, org.telegram.ui.ActionBar.k6.f21765j2, null, null, org.telegram.ui.ActionBar.k6.Sd));
            }
            int i20 = 0;
            while (true) {
                FrameLayout[] frameLayoutArr2 = this.L0;
                if (i20 >= frameLayoutArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.m6(frameLayoutArr2[i20], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21749i3}, null, org.telegram.ui.ActionBar.k6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.m6(frameLayoutArr2[i20], 0, null, org.telegram.ui.ActionBar.k6.f21765j2, null, null, org.telegram.ui.ActionBar.k6.Sd));
                i20++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38026z0, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21749i3}, null, org.telegram.ui.ActionBar.k6.Td));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38026z0, 0, null, org.telegram.ui.ActionBar.k6.f21765j2, null, null, org.telegram.ui.ActionBar.k6.Sd));
            int i21 = 0;
            while (true) {
                TextView[] textViewArr = this.K0;
                if (i21 >= textViewArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.m6(textViewArr[i21], 4, null, null, null, null, org.telegram.ui.ActionBar.k6.Ae));
                i21++;
            }
            int i22 = 0;
            while (true) {
                TextView[] textViewArr2 = this.J0;
                if (i22 >= textViewArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.m6(textViewArr2[i22], 4, null, null, null, null, org.telegram.ui.ActionBar.k6.Ae));
                i22++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.Q0, 0, new Class[]{org.telegram.ui.Components.ko0.class}, new String[]{"innerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Ti));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.Q0, 0, new Class[]{org.telegram.ui.Components.ko0.class}, new String[]{"outerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Vi));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.P0, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21820m3, org.telegram.ui.ActionBar.k6.f21893q3}, null, org.telegram.ui.ActionBar.k6.f21918ra));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21838n3, org.telegram.ui.ActionBar.k6.f21911r3}, null, org.telegram.ui.ActionBar.k6.f21667dc));
            Drawable[] drawableArr = org.telegram.ui.ActionBar.k6.f21820m3.f21442y;
            int i23 = org.telegram.ui.ActionBar.k6.f21949ta;
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.k6.f21893q3.f21442y, null, i23));
            org.telegram.ui.ActionBar.r5 r5Var = this.O;
            org.telegram.ui.ActionBar.r5 r5Var2 = this.Q;
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{r5Var, r5Var2}, null, org.telegram.ui.ActionBar.k6.Aa));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{r5Var, r5Var2}, null, org.telegram.ui.ActionBar.k6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{r5Var, r5Var2}, null, org.telegram.ui.ActionBar.k6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{r5Var, r5Var2}, null, org.telegram.ui.ActionBar.k6.Fa));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21874p3, org.telegram.ui.ActionBar.k6.f21944t3}, null, org.telegram.ui.ActionBar.k6.Ba));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.k6.f21856o3.f21442y;
            int i24 = org.telegram.ui.ActionBar.k6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr2, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.k6.f21928s3.f21442y, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21685ec));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21703fc));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f22035y3}, null, org.telegram.ui.ActionBar.k6.Ja));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f22053z3}, null, org.telegram.ui.ActionBar.k6.Ka));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.A3, org.telegram.ui.ActionBar.k6.C3}, null, org.telegram.ui.ActionBar.k6.La));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.B3, org.telegram.ui.ActionBar.k6.D3}, null, org.telegram.ui.ActionBar.k6.Ma));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.F3, org.telegram.ui.ActionBar.k6.G3}, null, org.telegram.ui.ActionBar.k6.f21934sc));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Uc));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21611ab));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Wc));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21648cb));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Yc));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21666db));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21613ad));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21702fb));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21847nd));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.sb));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21865od));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38006r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21846nb));
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.k6.f21662d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.k6.f21733h5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.k6.f21751i5));
        for (int i25 = 0; i25 < arrayList.size(); i25++) {
            ((org.telegram.ui.ActionBar.m6) arrayList.get(i25)).f22153o = this.f37961a;
        }
        return arrayList;
    }

    public final boolean T0(int i10) {
        int B0;
        long j10;
        if (this.f37972d0) {
            return false;
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.f38008s;
        if (i10 == 1 || i10 == 2) {
            long j11 = this.F;
            if (j11 != 0) {
                if (j11 != i6Var.f21476j) {
                    return true;
                }
            } else {
                int B02 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Nd);
                int i11 = (int) i6Var.f21476j;
                if (i11 == 0) {
                    i11 = B02;
                }
                if (i11 != B02) {
                    return true;
                }
            }
            long j12 = this.I;
            long j13 = this.H;
            long j14 = this.G;
            if (j14 == 0 && j13 == 0 && j12 == 0) {
                for (int i12 = 0; i12 < 3; i12++) {
                    if (i12 == 0) {
                        B0 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Od);
                        j10 = i6Var.f21477k;
                    } else if (i12 == 1) {
                        B0 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Pd);
                        j10 = i6Var.f21478l;
                    } else {
                        B0 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Qd);
                        j10 = i6Var.f21479m;
                    }
                    int i13 = (int) j10;
                    if (i13 == 0 && j10 != 0) {
                        i13 = 0;
                    } else if (i13 == 0) {
                        i13 = B0;
                    }
                    if (i13 != B0) {
                        return true;
                    }
                }
            } else if (j14 != i6Var.f21477k || j13 != i6Var.f21478l || j12 != i6Var.f21479m) {
                return true;
            }
            if (i6Var.f21480n != this.L) {
                return true;
            }
        }
        if (i10 == 1 || i10 == 3) {
            if (this.f38017w != i6Var.d) {
                return true;
            }
            int i14 = this.f38023y;
            if (i14 != 0) {
                if (i14 != i6Var.f21472e) {
                    return true;
                }
            } else {
                int i15 = i6Var.f21472e;
                if (i15 != 0 && i15 != i6Var.f21471c) {
                    return true;
                }
            }
            int i16 = this.B;
            if (i16 != 0) {
                if (i16 != i6Var.f21473f) {
                    return true;
                }
            } else if (i6Var.f21473f != 0) {
                return true;
            }
            int i17 = this.C;
            if (i17 != 0) {
                if (i17 != i6Var.f21474g) {
                    return true;
                }
            } else if (i6Var.f21474g != 0) {
                return true;
            }
            int i18 = this.D;
            if (i18 != 0) {
                if (i18 != i6Var.h) {
                    return true;
                }
            } else if (i6Var.h != 0) {
                return true;
            }
            if (this.E != i6Var.f21475i) {
                return true;
            }
        }
        return false;
    }

    public boolean U0() {
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && f5Var.getBottomSheet() != null) {
            return true;
        }
        return false;
    }

    public final void V0() {
        float f10;
        eg.q1 q1Var = this.N1;
        if (q1Var != null) {
            q1Var.invalidate();
        }
        FrameLayout frameLayout = this.f38015v0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f38015v0.getChildAt(i10).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.f38018w0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                this.f38018w0.getChildAt(i11).invalidate();
            }
        }
        if (this.G0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.m81[] m81VarArr = this.G0;
                if (i12 >= m81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.m81 m81Var = m81VarArr[i12];
                if (m81Var != null) {
                    if (this.J1) {
                        f10 = this.f37993k1 * this.l1;
                    } else {
                        f10 = 0.0f;
                    }
                    m81Var.setDimAmount(f10);
                    this.G0[i12].invalidate();
                }
                i12++;
            }
        }
        if (this.f37992k0 != null) {
            for (int i13 = 0; i13 < this.f37992k0.getChildCount(); i13++) {
                View childAt = this.f37992k0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.v0) {
                    d1((org.telegram.ui.Cells.v0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.f38006r0 != null) {
            for (int i14 = 0; i14 < this.f38006r0.getChildCount(); i14++) {
                View childAt2 = this.f38006r0.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                    d1((org.telegram.ui.Cells.v0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        zc1 zc1Var = this.f38019w1;
        if (zc1Var != null) {
            zc1Var.invalidate();
        }
        zc1 zc1Var2 = this.f38022x1;
        if (zc1Var2 != null) {
            zc1Var2.invalidate();
        }
        w4 w4Var = this.f38026z0;
        if (w4Var != null) {
            w4Var.invalidate();
        }
    }

    public final void W0() {
        org.telegram.ui.ActionBar.i6 i6Var = this.f38008s;
        if (i6Var != null && !TextUtils.isEmpty(i6Var.f21481o)) {
            try {
                File d = i6Var.d();
                Drawable background = this.f38013u0.getBackground();
                Bitmap bitmap = this.f38013u0.getImageReceiver().getBitmap();
                if (background instanceof org.telegram.ui.Components.fc0) {
                    FileOutputStream fileOutputStream = new FileOutputStream(d);
                    bitmap.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                    fileOutputStream.close();
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                background.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                background.draw(canvas);
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(this.f37984g1, this.f38002p1));
                paint.setAlpha((int) (this.f37989i1 * 255.0f));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                FileOutputStream fileOutputStream2 = new FileOutputStream(d);
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
                fileOutputStream2.close();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
    }

    public final void X0() {
        Y0(2, true);
    }

    public final void Y0(int i10, boolean z4) {
        org.telegram.ui.ActionBar.i6 i6Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (getParentActivity() != null && this.f37996n != i10 && this.f38000o1 == null && (i6Var = this.f38008s) != null) {
            if (z4 && i10 == 2 && (org.telegram.ui.ActionBar.k6.Z0() || i6Var.f21476j == 4294967296L)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.ChangeChatBackground);
                if (org.telegram.ui.ActionBar.k6.Z0() && (!org.telegram.ui.ActionBar.k6.Z0() || org.telegram.ui.ActionBar.k6.I.f21515f0.d == 0)) {
                    alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.ChangeWallpaperToColor);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Change), new xb1(this, 7));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                } else {
                    alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.ChangeColorToColor);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new xb1(this, 5));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Continue), new xb1(this, 6));
                }
                showDialog(alertDialog$Builder.f21168a);
                return;
            }
            int i18 = this.f37996n;
            this.f37996n = i10;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        this.h.setText(LocaleController.getString(R.string.ColorPickerMyMessages));
                        if (i6Var.f21473f != 0) {
                            if (i6Var.h != 0) {
                                i17 = 4;
                            } else if (i6Var.f21474g != 0) {
                                i17 = 3;
                            } else {
                                i17 = 2;
                            }
                        } else {
                            i17 = 1;
                        }
                        org.telegram.ui.Components.mq mqVar = this.S;
                        T0(3);
                        mqVar.f(2, 4, i17, true);
                        this.S.e(i6Var.h, 3);
                        this.S.e(i6Var.f21474g, 2);
                        this.S.e(i6Var.f21473f, 1);
                        org.telegram.ui.Components.mq mqVar2 = this.S;
                        int i19 = i6Var.f21472e;
                        if (i19 == 0) {
                            i19 = i6Var.f21471c;
                        }
                        mqVar2.e(i19, 0);
                        this.H0[1].b(0, i6Var.f21472e);
                        this.H0[1].b(1, i6Var.f21473f);
                        this.H0[1].b(2, i6Var.f21474g);
                        this.H0[1].b(3, i6Var.h);
                        if (i6Var.f21474g != 0) {
                            if (i18 == 1) {
                                this.f38009s0.o(0);
                            } else {
                                this.f38009s0.m(0);
                            }
                        } else if (i18 == 2) {
                            this.f38009s0.u(0);
                        }
                        this.f38006r0.v0(0, AndroidUtilities.dp(60.0f), null);
                        e1();
                    }
                } else {
                    this.h.setText(LocaleController.getString(R.string.ColorPickerBackground));
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Nd);
                    int i20 = org.telegram.ui.ActionBar.k6.Od;
                    if (org.telegram.ui.ActionBar.k6.c1(i20)) {
                        i12 = getThemedColor(i20);
                    } else {
                        i12 = 0;
                    }
                    int i21 = org.telegram.ui.ActionBar.k6.Pd;
                    if (org.telegram.ui.ActionBar.k6.c1(i21)) {
                        i13 = getThemedColor(i21);
                    } else {
                        i13 = 0;
                    }
                    int i22 = org.telegram.ui.ActionBar.k6.Qd;
                    if (org.telegram.ui.ActionBar.k6.c1(i22)) {
                        i14 = getThemedColor(i22);
                    } else {
                        i14 = 0;
                    }
                    long j10 = i6Var.f21477k;
                    int i23 = (int) j10;
                    if (i23 == 0 && j10 != 0) {
                        i12 = 0;
                    }
                    long j11 = i6Var.f21478l;
                    int i24 = (int) j11;
                    if (i24 == 0 && j11 != 0) {
                        i13 = 0;
                    }
                    long j12 = i6Var.f21479m;
                    int i25 = (int) j12;
                    if (i25 == 0 && j12 != 0) {
                        i14 = 0;
                    }
                    int i26 = (int) i6Var.f21476j;
                    if (i23 == 0 && i12 == 0) {
                        i15 = i24;
                        i16 = 1;
                    } else if (i25 == 0 && i14 == 0) {
                        if (i24 == 0 && i13 == 0) {
                            i15 = i24;
                            i16 = 2;
                        } else {
                            i15 = i24;
                            i16 = 3;
                        }
                    } else {
                        i15 = i24;
                        i16 = 4;
                    }
                    org.telegram.ui.Components.mq mqVar3 = this.S;
                    T0(2);
                    mqVar3.f(2, 4, i16, false);
                    org.telegram.ui.Components.mq mqVar4 = this.S;
                    if (i25 == 0) {
                        i25 = i14;
                    }
                    mqVar4.e(i25, 3);
                    org.telegram.ui.Components.mq mqVar5 = this.S;
                    if (i15 != 0) {
                        i13 = i15;
                    }
                    mqVar5.e(i13, 2);
                    org.telegram.ui.Components.mq mqVar6 = this.S;
                    if (i23 == 0) {
                        i23 = i12;
                    }
                    mqVar6.e(i23, 1);
                    org.telegram.ui.Components.mq mqVar7 = this.S;
                    if (i26 != 0) {
                        themedColor = i26;
                    }
                    mqVar7.e(themedColor, 0);
                    if (i18 != 1 && i6Var.f21474g != 0) {
                        this.f38009s0.m(0);
                    } else {
                        this.f38009s0.o(0);
                    }
                    this.f38006r0.v0(0, AndroidUtilities.dp(60.0f), null);
                }
            } else {
                this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
                if (i6Var.d != 0) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                org.telegram.ui.Components.mq mqVar8 = this.S;
                T0(1);
                mqVar8.f(1, 2, i11, false);
                this.S.e(i6Var.f21471c, 0);
                int i27 = i6Var.d;
                if (i27 != 0) {
                    this.S.e(i27, 1);
                }
                if (i18 == 2 || (i18 == 3 && i6Var.f21474g != 0)) {
                    this.f38009s0.u(0);
                }
            }
            if (i10 != 1 && i10 != 3) {
                this.S.setMinBrightness(0.0f);
                this.S.setMaxBrightness(1.0f);
                return;
            }
            if (i18 == 2 && this.I0[1].getVisibility() == 0) {
                f1(0, true, true);
            }
            if (i10 == 1) {
                if (this.f37965b0.q()) {
                    this.S.setMinBrightness(0.2f);
                    return;
                }
                this.S.setMinBrightness(0.05f);
                this.S.setMaxBrightness(0.8f);
                return;
            }
            this.S.setMinBrightness(0.0f);
            this.S.setMaxBrightness(1.0f);
        }
    }

    public final void Z0(int i10) {
        TLRPC.TL_wallPaper tL_wallPaper;
        if (i10 >= 0 && i10 < this.R0.size()) {
            tL_wallPaper = (TLRPC.TL_wallPaper) this.R0.get(i10);
        } else {
            tL_wallPaper = this.V0;
        }
        TLRPC.TL_wallPaper tL_wallPaper2 = tL_wallPaper;
        if (tL_wallPaper2 == null) {
            return;
        }
        ValueAnimator valueAnimator = this.Z1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.Z1.cancel();
        }
        yc1[] yc1VarArr = this.f38011t0;
        yc1 yc1Var = yc1VarArr[0];
        yc1 yc1Var2 = yc1VarArr[1];
        yc1VarArr[0] = yc1Var2;
        yc1VarArr[1] = yc1Var;
        this.f38003q0.removeView(yc1Var2);
        this.f38003q0.addView(yc1VarArr[0], this.f38003q0.indexOfChild(yc1VarArr[1]) + 1);
        yc1 yc1Var3 = yc1VarArr[0];
        this.f38013u0 = yc1Var3;
        yc1Var3.setBackground(yc1VarArr[1].getBackground());
        k1();
        yc1VarArr[1].setVisibility(0);
        yc1VarArr[1].setAlpha(1.0f);
        this.f38013u0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Z1 = ofFloat;
        ofFloat.addUpdateListener(new yi(2, this));
        this.Z1.addListener(new nc1(this, 0));
        this.Z1.setInterpolator(org.telegram.ui.Components.pr.f30168f);
        this.Z1.setDuration(300L);
        this.Z1.start();
        this.f38013u0.getImageReceiver().setCrossfadeDuration(300);
        this.f38013u0.getImageReceiver().setImage(ImageLocation.getForDocument(tL_wallPaper2.document), this.D1, null, null, null, tL_wallPaper2.document.size, "jpg", tL_wallPaper2, 1);
        this.f38013u0.d();
        this.T0 = tL_wallPaper2;
        this.B1 = this.G0[2].f29009s;
        j1();
    }

    public final void a1(int i10, int i11, boolean z4) {
        org.telegram.ui.Components.fc0 fc0Var;
        if (i11 == 0) {
            this.W0 = i10;
        } else if (i11 == 1) {
            this.Y0 = i10;
        } else if (i11 == 2) {
            this.Z0 = i10;
        } else if (i11 == 3) {
            this.f37963a1 = i10;
        }
        m1(z4);
        if (this.G0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.m81[] m81VarArr = this.G0;
                if (i12 >= m81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.m81 m81Var = m81VarArr[i12];
                if (m81Var != null) {
                    m81Var.b(i11, i10);
                }
                i12++;
            }
        }
        if (this.Z0 != 0) {
            if (this.Q0 != null && org.telegram.ui.ActionBar.k6.I.q()) {
                this.Q0.setTwoSided(true);
            }
            Drawable background = this.f38013u0.getBackground();
            if (background instanceof org.telegram.ui.Components.fc0) {
                fc0Var = (org.telegram.ui.Components.fc0) background;
            } else {
                fc0Var = new org.telegram.ui.Components.fc0();
                fc0Var.r(this.f38013u0);
                if (this.A1) {
                    fc0Var.m(false);
                }
            }
            fc0Var.n(this.W0, this.Y0, this.Z0, this.f37963a1);
            this.f38013u0.setBackground(fc0Var);
            this.f37984g1 = fc0Var.f();
            this.f37987h1 = 754974720;
        } else if (this.Y0 != 0) {
            this.f38013u0.setBackground(new GradientDrawable(org.telegram.ui.Components.o9.d(this.f37977e1), new int[]{this.W0, this.Y0}));
            int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(this.W0, this.Y0));
            this.f37987h1 = patternColor;
            this.f37984g1 = patternColor;
        } else {
            this.f38013u0.setBackgroundColor(this.W0);
            int patternColor2 = AndroidUtilities.getPatternColor(this.W0);
            this.f37987h1 = patternColor2;
            this.f37984g1 = patternColor2;
        }
        int i13 = org.telegram.ui.ActionBar.k6.f21811lc;
        boolean c12 = org.telegram.ui.ActionBar.k6.c1(i13);
        ic1 ic1Var = this.f37961a;
        if (c12 && !(this.f38013u0.getBackground() instanceof org.telegram.ui.Components.fc0)) {
            if (org.telegram.ui.ActionBar.k6.s0() instanceof org.telegram.ui.Components.fc0) {
                getThemedColor(i13);
                ic1Var.b(this.f38013u0.getBackground(), this.f38013u0.getBackground(), Float.valueOf(this.f37989i1));
            }
        } else {
            ic1Var.b(this.f38013u0.getBackground(), this.f38013u0.getBackground(), Float.valueOf(this.f37989i1));
        }
        ImageView imageView = this.C0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.ic), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.D0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.ic), PorterDuff.Mode.MULTIPLY));
        }
        yc1 yc1Var = this.f38013u0;
        if (yc1Var != null) {
            yc1Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f37984g1, this.f38002p1));
            this.f38013u0.getImageReceiver().setAlpha(Math.abs(this.f37989i1));
            this.f38013u0.invalidate();
            if (org.telegram.ui.ActionBar.k6.I.q() && (this.f38013u0.getBackground() instanceof org.telegram.ui.Components.fc0)) {
                org.telegram.ui.Cells.j0 j0Var = this.Q0;
                if (j0Var != null) {
                    j0Var.setTwoSided(true);
                }
                if (this.f37989i1 < 0.0f) {
                    this.f38013u0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.fc0) this.f38013u0.getBackground()).f26878k);
                }
            } else {
                this.f38013u0.getImageReceiver().setGradientBitmap(null);
                org.telegram.ui.Cells.j0 j0Var2 = this.Q0;
                if (j0Var2 != null) {
                    j0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.j0 j0Var3 = this.Q0;
            if (j0Var3 != null) {
                j0Var3.setProgress(this.f37989i1);
            }
        }
        dc1 dc1Var = this.f38006r0;
        if (dc1Var != null) {
            dc1Var.e1();
        }
        FrameLayout frameLayout = this.f38015v0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                this.f38015v0.getChildAt(i14).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.f38018w0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                this.f38018w0.getChildAt(i15).invalidate();
            }
        }
    }

    public final void b1(boolean z4) {
        org.telegram.ui.Components.fc0 fc0Var;
        org.telegram.ui.Components.fc0 fc0Var2;
        int i10;
        int g10;
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.ActionBar.i6 i6Var = this.f38008s;
        int i11 = this.f37964b;
        if (i11 == 0 && i6Var == null) {
            this.f38013u0.setBackground(org.telegram.ui.ActionBar.k6.r0());
        } else {
            TLRPC.PhotoSize photoSize2 = null;
            BitmapDrawable bitmapDrawable = null;
            if (i11 == 2) {
                Object obj = this.f38025y1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    if (z4) {
                        photoSize = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, 100);
                    } else {
                        photoSize = null;
                    }
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        bitmapDrawable = new BitmapDrawable(ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, "b"));
                    }
                    yc1 yc1Var = this.f38013u0;
                    yc1Var.f30011a.setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.D1, ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    yc1Var.d();
                } else if (obj instanceof vi1) {
                    vi1 vi1Var = (vi1) obj;
                    int i12 = vi1Var.f42156f;
                    int i13 = vi1Var.f42155e;
                    int i14 = vi1Var.d;
                    int i15 = vi1Var.f42154c;
                    int i16 = vi1Var.f42153b;
                    this.f37977e1 = i12;
                    a1(i16, 0, false);
                    if (i15 != 0) {
                        a1(i15, 1, false);
                    }
                    a1(i14, 2, false);
                    a1(i13, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.T0;
                    if (tL_wallPaper2 != null) {
                        yc1 yc1Var2 = this.f38013u0;
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                        String str = this.D1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.T0;
                        yc1Var2.k(forDocument, str, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                    } else if ("d".equals(vi1Var.f42152a)) {
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        Point point2 = AndroidUtilities.displaySize;
                        int max = Math.max(point2.x, point2.y);
                        if (Build.VERSION.SDK_INT >= 29) {
                            g10 = 1459617792;
                        } else {
                            g10 = org.telegram.ui.Components.fc0.g(i16, i15, i14, i13);
                        }
                        this.f38013u0.setImageBitmap(SvgHelper.getBitmap(R.raw.default_pattern, min, max, g10));
                    }
                } else if (obj instanceof wi1) {
                    Bitmap bitmap = this.f38027z1;
                    if (bitmap != null) {
                        this.f38013u0.setImageBitmap(bitmap);
                    } else {
                        wi1 wi1Var = (wi1) obj;
                        File file = wi1Var.f42790e;
                        if (file != null) {
                            this.f38013u0.f(file.getAbsolutePath(), this.D1, null);
                        } else {
                            File file2 = wi1Var.d;
                            if (file2 != null) {
                                this.f38013u0.f(file2.getAbsolutePath(), this.D1, null);
                            } else if ("t".equals(wi1Var.f42787a)) {
                                yc1 yc1Var3 = this.f38013u0;
                                yc1Var3.setImageDrawable(org.telegram.ui.ActionBar.k6.W0(yc1Var3, false));
                            } else {
                                int i17 = wi1Var.f42788b;
                                if (i17 != 0) {
                                    this.f38013u0.setImageResource(i17);
                                }
                            }
                        }
                    }
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    TLRPC.Photo photo = searchImage.photo;
                    if (photo != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, this.E1, true);
                        if (closestPhotoSizeWithSize2 != closestPhotoSizeWithSize) {
                            photoSize2 = closestPhotoSizeWithSize2;
                        }
                        if (photoSize2 != null) {
                            i10 = photoSize2.size;
                        } else {
                            i10 = 0;
                        }
                        this.f38013u0.k(ImageLocation.getForPhoto(photoSize2, searchImage.photo), this.D1, ImageLocation.getForPhoto(closestPhotoSizeWithSize, searchImage.photo), "100_100_b", i10, "jpg", searchImage, 1);
                    } else {
                        yc1 yc1Var4 = this.f38013u0;
                        String str2 = searchImage.imageUrl;
                        String str3 = this.D1;
                        String str4 = searchImage.thumbUrl;
                        yc1Var4.getClass();
                        yc1Var4.m(ImageLocation.getForPath(str2), str3, ImageLocation.getForPath(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (i6Var == null) {
                this.f38013u0.setBackground(org.telegram.ui.ActionBar.k6.r0());
            } else {
                org.telegram.ui.Components.j9 j9Var = this.f38007r1;
                if (j9Var != null) {
                    j9Var.dispose();
                    this.f38007r1 = null;
                }
                int B0 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Nd);
                int i18 = (int) i6Var.f21476j;
                if (i18 != 0) {
                    B0 = i18;
                }
                int B02 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Od);
                long j10 = i6Var.f21477k;
                int i19 = (int) j10;
                if (i19 == 0 && j10 != 0) {
                    B02 = 0;
                } else if (i19 != 0) {
                    B02 = i19;
                }
                int B03 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Pd);
                long j11 = i6Var.f21478l;
                int i20 = (int) j11;
                if (i20 == 0 && j11 != 0) {
                    B03 = 0;
                } else if (i20 != 0) {
                    B03 = i20;
                }
                int B04 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Qd);
                long j12 = i6Var.f21479m;
                int i21 = (int) j12;
                if (i21 == 0 && j12 != 0) {
                    B04 = 0;
                } else if (i21 != 0) {
                    B04 = i21;
                }
                if (!TextUtils.isEmpty(i6Var.f21481o) && !org.telegram.ui.ActionBar.k6.Z0()) {
                    if (B03 != 0) {
                        Drawable background = this.f38013u0.getBackground();
                        if (background instanceof org.telegram.ui.Components.fc0) {
                            fc0Var2 = (org.telegram.ui.Components.fc0) background;
                        } else {
                            org.telegram.ui.Components.fc0 fc0Var3 = new org.telegram.ui.Components.fc0();
                            fc0Var3.r(this.f38013u0);
                            fc0Var2 = fc0Var3;
                            if (this.A1) {
                                fc0Var3.m(false);
                                fc0Var2 = fc0Var3;
                            }
                        }
                        fc0Var2.n(B0, B02, B03, B04);
                        fc0Var = fc0Var2;
                    } else if (B02 != 0) {
                        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(org.telegram.ui.Components.o9.d(i6Var.f21480n), new int[]{B0, B02});
                        this.f38007r1 = o9Var.f(org.telegram.ui.Cells.f1.t(0.5f, 3), new rc1(this, 0), 100L);
                        fc0Var = o9Var;
                    } else {
                        fc0Var = new ColorDrawable(B0);
                    }
                    this.f38013u0.setBackground(fc0Var);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.T0;
                    if (tL_wallPaper4 != null) {
                        yc1 yc1Var5 = this.f38013u0;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(tL_wallPaper4.document);
                        String str5 = this.D1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.T0;
                        yc1Var5.k(forDocument2, str5, null, null, tL_wallPaper5.document.size, "jpg", tL_wallPaper5, 1);
                    }
                } else {
                    Drawable s02 = org.telegram.ui.ActionBar.k6.s0();
                    if (s02 != null) {
                        if (s02 instanceof org.telegram.ui.Components.fc0) {
                            ((org.telegram.ui.Components.fc0) s02).r(this.f38013u0);
                        }
                        this.f38013u0.setBackground(s02);
                    }
                }
                if (B02 == 0) {
                    int patternColor = AndroidUtilities.getPatternColor(B0);
                    this.f37987h1 = patternColor;
                    this.f37984g1 = patternColor;
                } else if (B03 != 0) {
                    this.f37984g1 = org.telegram.ui.Components.fc0.g(B0, B02, B03, B04);
                    this.f37987h1 = 754974720;
                } else {
                    int patternColor2 = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(B0, B02));
                    this.f37987h1 = patternColor2;
                    this.f37984g1 = patternColor2;
                }
                yc1 yc1Var6 = this.f38013u0;
                if (yc1Var6 != null) {
                    yc1Var6.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f37984g1, this.f38002p1));
                    this.f38013u0.getImageReceiver().setAlpha(Math.abs(this.f37989i1));
                    this.f38013u0.invalidate();
                    if (org.telegram.ui.ActionBar.k6.I.q() && (this.f38013u0.getBackground() instanceof org.telegram.ui.Components.fc0)) {
                        org.telegram.ui.Cells.j0 j0Var = this.Q0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                        if (this.f37989i1 < 0.0f) {
                            this.f38013u0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.fc0) this.f38013u0.getBackground()).f26878k);
                        }
                    } else {
                        this.f38013u0.getImageReceiver().setGradientBitmap(null);
                        org.telegram.ui.Cells.j0 j0Var2 = this.Q0;
                        if (j0Var2 != null) {
                            j0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.j0 j0Var3 = this.Q0;
                    if (j0Var3 != null) {
                        j0Var3.setProgress(this.f37989i1);
                    }
                }
                if (this.G0 != null) {
                    int i22 = 0;
                    while (true) {
                        org.telegram.ui.Components.m81[] m81VarArr = this.G0;
                        if (i22 >= m81VarArr.length) {
                            break;
                        }
                        m81VarArr[i22].b(0, B0);
                        this.G0[i22].b(1, B02);
                        this.G0[i22].b(2, B03);
                        this.G0[i22].b(3, B04);
                        i22++;
                    }
                }
                ImageView imageView = this.C0;
                if (imageView != null) {
                    imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.ic), PorterDuff.Mode.MULTIPLY));
                }
                ImageView imageView2 = this.D0;
                if (imageView2 != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.ic), PorterDuff.Mode.MULTIPLY));
                }
                V0();
            }
        }
        this.A1 = false;
    }

    public final void c1(long j10) {
        boolean z4;
        this.G1 = j10;
        if (j10 != 0 && j10 != getUserConfig().getClientUserId()) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.H1 = z4;
    }

    @Override
    public final android.view.View createView(android.content.Context r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jd1.createView(android.content.Context):android.view.View");
    }

    public final void d1(org.telegram.ui.Cells.v0 v0Var) {
        ic1 ic1Var;
        float f10;
        if (this.f38013u0 == null) {
            return;
        }
        Bitmap bitmap = this.f37961a.f37631r;
        float f11 = 0.0f;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f10 = ((this.f38013u0.getMeasuredWidth() - (Math.max(this.f38013u0.getMeasuredWidth() / width, this.f38013u0.getMeasuredHeight() / ic1Var.f37631r.getHeight()) * width)) / 2.0f) + this.U1 + 0.0f;
        } else {
            f10 = this.U1 + 0.0f;
        }
        float y10 = v0Var.getY() - ((-this.f38013u0.G) + 0.0f);
        int measuredHeight = this.f38013u0.getMeasuredHeight();
        if (this.J1) {
            f11 = this.f37993k1 * this.l1;
        }
        v0Var.f24285t0 = true;
        v0Var.f24283s0 = measuredHeight;
        v0Var.f24277q0 = y10;
        v0Var.f24280r0 = f10;
        v0Var.P1 = f11;
        v0Var.Q1.setColor(i0.a.k(-16777216, (int) (f11 * 255.0f)));
        v0Var.invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (this.G1 == ((Long) objArr[2]).longValue()) {
                this.S1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                h1(true);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.sl0 sl0Var = this.f37992k0;
            if (sl0Var != null) {
                int childCount = sl0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f37992k0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) childAt).b0(0, true);
                    }
                }
            }
        } else if (i10 == NotificationCenter.invalidateMotionBackground) {
            dc1 dc1Var = this.f38006r0;
            if (dc1Var != null) {
                dc1Var.e1();
            }
        } else if (i10 == NotificationCenter.didSetNewWallpapper) {
            if (this.f38003q0 != null) {
                b1(true);
            }
        } else if (i10 == NotificationCenter.wallpapersNeedReload) {
            Object obj = this.f38025y1;
            if (obj instanceof wi1) {
                wi1 wi1Var = (wi1) obj;
                if (wi1Var.f42787a == null) {
                    wi1Var.f42787a = (String) objArr[0];
                }
            }
        } else {
            long j10 = 0;
            if (i10 == NotificationCenter.wallpapersDidLoad) {
                ArrayList arrayList = (ArrayList) objArr[0];
                this.R0.clear();
                HashMap hashMap = this.S0;
                hashMap.clear();
                int size = arrayList.size();
                boolean z4 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i13);
                    if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                        TLRPC.Document document = wallPaper.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f20851id))) {
                            this.R0.add(wallPaper);
                            hashMap.put(Long.valueOf(wallPaper.document.f20851id), wallPaper);
                        }
                        org.telegram.ui.ActionBar.i6 i6Var = this.f38008s;
                        if (i6Var != null && (str = i6Var.f21481o) != null && str.equals(wallPaper.slug)) {
                            this.T0 = (TLRPC.TL_wallPaper) wallPaper;
                            b1(false);
                            j1();
                        } else if (i6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper2 = this.T0;
                            if (tL_wallPaper2 != null) {
                                String str2 = tL_wallPaper2.slug;
                                if (str2 != null) {
                                    if (!str2.equals(wallPaper.slug)) {
                                    }
                                }
                            }
                        }
                        z4 = true;
                    }
                }
                if (!z4 && (tL_wallPaper = this.T0) != null) {
                    this.R0.add(0, tL_wallPaper);
                }
                hd1 hd1Var = this.N0;
                if (hd1Var != null) {
                    hd1Var.l();
                }
                int size2 = arrayList.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i14);
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        j10 = MediaDataController.calcHash(j10, wallPaper2.f20997id);
                    }
                }
                TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
                getwallpapers.hash = j10;
                ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new bc1(this, 1)), this.classGuid);
            } else if (i10 == NotificationCenter.wallpaperSettedToUser && this.G1 != 0) {
                finishFragment();
            }
        }
    }

    public final void e1() {
        if (this.f38003q0 != null && this.H0 != null && this.f38008s.f21474g != 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("bganimationhint", false)) {
                if (this.f38021x0 == null) {
                    org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(getParentActivity(), 8);
                    this.f38021x0 = m40Var;
                    m40Var.setShowingDuration(5000L);
                    this.f38021x0.setAlpha(0.0f);
                    this.f38021x0.setVisibility(4);
                    this.f38021x0.setText(LocaleController.getString(R.string.BackgroundAnimateInfo));
                    this.f38021x0.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                    this.f37986h0.addView(this.f38021x0, k7.c6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                AndroidUtilities.runOnUIThread(new h21(17, this, globalMainSettings), 500L);
            }
        }
    }

    public final void f1(int i10, boolean z4, boolean z10) {
        boolean z11;
        char c3;
        char c10;
        FrameLayout frameLayout;
        float f10;
        int i11;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i12;
        FrameLayout frameLayout2;
        int i13;
        float f16;
        FrameLayout frameLayout3;
        float f17;
        float f18;
        float f19;
        int i14;
        int i15;
        int i16;
        char c11 = 0;
        if (z4 && i10 == 1 && this.T0 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i17 = this.f37964b;
        if (z4) {
            if (i10 == 0) {
                if (i17 == 2) {
                    this.X0 = this.W0;
                    int i18 = this.Y0;
                    this.f37966b1 = i18;
                    int i19 = this.Z0;
                    this.f37970c1 = i19;
                    int i20 = this.f37963a1;
                    this.f37973d1 = i20;
                    this.f37981f1 = this.L;
                    if (i20 != 0) {
                        i16 = 4;
                    } else if (i19 != 0) {
                        i16 = 3;
                    } else if (i18 != 0) {
                        i16 = 2;
                    } else {
                        i16 = 1;
                    }
                    this.S.f(0, 4, i16, false);
                    this.S.e(this.f37963a1, 3);
                    this.S.e(this.Z0, 2);
                    this.S.e(this.Y0, 1);
                    this.S.e(this.W0, 0);
                }
            } else {
                this.U0 = this.T0;
                this.f37991j1 = this.f37989i1;
                this.N0.l();
                ArrayList arrayList = this.R0;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.T0;
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
                    this.O0.h1(i15, (this.M0.getMeasuredWidth() - AndroidUtilities.dp(124.0f)) / 2);
                }
            }
        }
        if (i17 == 1 || i17 == 2) {
            org.telegram.ui.Components.m81[] m81VarArr = this.G0;
            if (z11) {
                c3 = 2;
            } else {
                c3 = 0;
            }
            m81VarArr[c3].setVisibility(0);
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.j0 j0Var = this.Q0;
            if (!j0Var.I) {
                float f20 = this.f37989i1;
                if (f20 < 0.0f) {
                    float f21 = -f20;
                    this.f37989i1 = f21;
                    j0Var.setProgress(f21);
                }
            }
        }
        int i21 = 58;
        float f22 = 1.0f;
        FrameLayout[] frameLayoutArr = this.I0;
        if (z10) {
            this.f38000o1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            if (i10 == 0) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            if (z4) {
                frameLayoutArr[i10].setVisibility(0);
                if (i17 == 1) {
                    dc1 dc1Var = this.f38006r0;
                    Property property = View.TRANSLATION_Y;
                    if (i10 == 1) {
                        f17 = -AndroidUtilities.dp(21.0f);
                    } else {
                        f17 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(dc1Var, property, f17));
                    org.telegram.ui.Components.m81 m81Var = this.G0[2];
                    Property property2 = View.ALPHA;
                    if (z11) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(m81Var, property2, f18));
                    org.telegram.ui.Components.m81 m81Var2 = this.G0[0];
                    if (z11) {
                        f19 = 0.0f;
                    } else {
                        f19 = 1.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(m81Var2, property2, f19));
                    if (i10 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property2, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i12], property2, 0.0f));
                    }
                    AndroidUtilities.hideKeyboard(this.S.B[1]);
                } else if (i17 == 2) {
                    dc1 dc1Var2 = this.f38006r0;
                    Property property3 = View.TRANSLATION_Y;
                    int i22 = -frameLayoutArr[i10].getMeasuredHeight();
                    if (this.f38022x1 == null) {
                        i21 = 0;
                    }
                    int dp = AndroidUtilities.dp(i21 + 72) + i22;
                    if (U0()) {
                        i13 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i13 = 0;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(dc1Var2, property3, dp + i13));
                    org.telegram.ui.Components.m81 m81Var3 = this.G0[2];
                    Property property4 = View.ALPHA;
                    if (z11) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(m81Var3, property4, f16));
                    org.telegram.ui.Components.m81 m81Var4 = this.G0[0];
                    if (z11) {
                        f22 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(m81Var4, property4, f22));
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
                    AndroidUtilities.hideKeyboard(this.S.B[1]);
                }
            } else {
                dc1 dc1Var3 = this.f38006r0;
                Property property5 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(dc1Var3, property5, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property5, frameLayout2.getMeasuredHeight()));
                org.telegram.ui.Components.m81 m81Var5 = this.G0[0];
                Property property6 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(m81Var5, property6, 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.G0[2], property6, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.f38013u0, property6, 1.0f));
            }
            this.f38000o1.playTogether(arrayList2);
            this.f38000o1.addListener(new qc1(this, z4, i12, i10, z11));
            this.f38000o1.setInterpolator(org.telegram.ui.Components.pr.f30169g);
            this.f38000o1.setDuration(200L);
            this.f38000o1.start();
            return;
        }
        if (i10 == 0) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        if (z4) {
            frameLayoutArr[i10].setVisibility(0);
            if (i17 == 1) {
                dc1 dc1Var4 = this.f38006r0;
                if (i10 == 1) {
                    f13 = -AndroidUtilities.dp(21.0f);
                } else {
                    f13 = 0.0f;
                }
                dc1Var4.setTranslationY(f13);
                org.telegram.ui.Components.m81 m81Var6 = this.G0[2];
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                m81Var6.setAlpha(f14);
                org.telegram.ui.Components.m81 m81Var7 = this.G0[0];
                if (z11) {
                    f15 = 0.0f;
                } else {
                    f15 = 1.0f;
                }
                m81Var7.setAlpha(f15);
                if (i10 == 1) {
                    frameLayoutArr[i10].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    frameLayoutArr[c10].setAlpha(0.0f);
                }
                AndroidUtilities.hideKeyboard(this.S.B[1]);
            } else if (i17 == 2) {
                dc1 dc1Var5 = this.f38006r0;
                if (i10 == 0) {
                    f10 = 343.0f;
                } else {
                    f10 = 316.0f;
                }
                int i23 = -AndroidUtilities.dp(f10);
                if (this.f38022x1 == null) {
                    i21 = 0;
                }
                int dp2 = AndroidUtilities.dp(i21 + 72) + i23;
                if (U0()) {
                    i11 = AndroidUtilities.navigationBarHeight;
                } else {
                    i11 = 0;
                }
                dc1Var5.setTranslationY(dp2 + i11);
                org.telegram.ui.Components.m81 m81Var8 = this.G0[2];
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                m81Var8.setAlpha(f11);
                org.telegram.ui.Components.m81 m81Var9 = this.G0[0];
                if (z11) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                m81Var9.setAlpha(f12);
                if (frameLayoutArr[c10].getVisibility() == 0) {
                    frameLayoutArr[c10].setAlpha(0.0f);
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
                    frameLayoutArr[c10].setAlpha(0.0f);
                }
                AndroidUtilities.hideKeyboard(this.S.B[1]);
            }
        } else {
            this.f38006r0.setTranslationY(0.0f);
            frameLayoutArr[i10].setTranslationY(frameLayout.getMeasuredHeight());
            this.G0[0].setAlpha(1.0f);
            this.G0[2].setAlpha(1.0f);
            this.f38013u0.setAlpha(1.0f);
        }
        if (z4 && frameLayoutArr[c10].getVisibility() == 0) {
            frameLayoutArr[c10].setAlpha(1.0f);
            frameLayoutArr[c10].setVisibility(4);
        } else if (!z4) {
            frameLayoutArr[i10].setVisibility(4);
        }
        if (i17 != 1 && i17 != 2) {
            if (i10 == 1) {
                frameLayoutArr[c10].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.m81[] m81VarArr2 = this.G0;
        if (!z11) {
            c11 = 2;
        }
        m81VarArr2[c11].setVisibility(4);
    }

    public final void g1() {
        Window window;
        if (this.f37978e2 != null) {
            return;
        }
        if (U0()) {
            window = this.parentLayout.getBottomSheet().getWindow();
        } else {
            window = getParentActivity().getWindow();
        }
        FrameLayout frameLayout = (FrameLayout) window.getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.L1.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.L1.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        this.L1.getLocationInWindow(iArr);
        float f10 = iArr[0];
        float f11 = iArr[1];
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        jc jcVar = new jc(this, getParentActivity(), canvas, (this.L1.getMeasuredWidth() / 2.0f) + f10, (this.L1.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 2);
        this.f37978e2 = jcVar;
        jcVar.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
        this.f37982f2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f37985g2 = ofFloat;
        ofFloat.addUpdateListener(new kc(this, 2));
        this.f37985g2.addListener(new nc1(this, 4));
        this.f37985g2.setDuration(400L);
        this.f37985g2.setInterpolator(org.telegram.ui.Components.jt.f28179e);
        this.f37985g2.start();
        frameLayout.addView(this.f37978e2, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new vb1(this, 2));
    }

    @Override
    public final int getObserverTag() {
        return this.f38004q1;
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.f37961a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.I1) {
            return S0();
        }
        return super.getThemeDescriptions();
    }

    public final void h1(boolean z4) {
        int i10 = (this.G1 > 0L ? 1 : (this.G1 == 0L ? 0 : -1));
        if (i10 > 0) {
            this.f38019w1.d(LocaleController.getString(R.string.ApplyWallpaperForMe));
        } else if (i10 < 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.G1));
            if (chat != null) {
                this.f38019w1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, chat.title));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.S1;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                    if (this.f37998n1 == null) {
                        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.mini_switch_lock, 0);
                        this.f37998n1 = oqVar;
                        oqVar.setTopOffset(1);
                    }
                    spannableStringBuilder.setSpan(this.f37998n1, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", R0(), new Object[0]));
                    this.f38019w1.c(spannableStringBuilder, z4);
                    return;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.S1;
                if (tL_premium_boostsStatus2 == null) {
                    if (this.G1 < 0 && !this.Q1 && !this.R1 && tL_premium_boostsStatus2 == null) {
                        this.Q1 = true;
                        getMessagesController().getBoostsController().getBoostsStats(this.G1, new ac1(this, 0));
                        return;
                    }
                    return;
                }
                this.f38019w1.c(null, z4);
                return;
            }
            this.f38019w1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, LocaleController.getString(R.string.AccDescrChannel).toLowerCase()));
        } else {
            this.f38019w1.d(LocaleController.getString(R.string.ApplyWallpaper));
        }
    }

    public final void i1() {
        if (this.C1 && this.f38012t1 == null) {
            Bitmap bitmap = this.f38027z1;
            if (bitmap != null) {
                this.f38014u1 = bitmap;
                this.f38012t1 = Utilities.blurWallpaper(bitmap);
            } else {
                ImageReceiver imageReceiver = this.f38013u0.getImageReceiver();
                if (imageReceiver.hasNotThumb() || imageReceiver.hasStaticThumb()) {
                    this.f38014u1 = imageReceiver.getBitmap();
                    this.f38012t1 = Utilities.blurWallpaper(imageReceiver.getBitmap());
                }
            }
        }
        if (this.C1) {
            Bitmap bitmap2 = this.f38012t1;
            if (bitmap2 != null) {
                this.f38013u0.setImageBitmap(bitmap2);
                return;
            }
            return;
        }
        b1(false);
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.f37964b == 2) {
            if (this.X1 && motionEvent != null) {
                if (motionEvent.getY() > org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final void j1() {
        File httpFilePath;
        String name;
        int i10;
        long j10;
        File file;
        String str;
        float f10;
        FrameLayout frameLayout;
        float f11;
        Object obj = this.T0;
        if (obj == null) {
            obj = this.f38025y1;
        }
        boolean z4 = obj instanceof TLRPC.TL_wallPaper;
        if (z4 || (obj instanceof MediaController.SearchImage)) {
            if (z4) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                str = FileLoader.getAttachFileName(tL_wallPaper.document);
                if (!TextUtils.isEmpty(str)) {
                    file = FileLoader.getInstance(this.currentAccount).getPathToAttach(tL_wallPaper.document, true);
                    j10 = tL_wallPaper.document.size;
                } else {
                    return;
                }
            } else {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                TLRPC.Photo photo = searchImage.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.E1, true);
                    httpFilePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true);
                    name = FileLoader.getAttachFileName(closestPhotoSizeWithSize);
                    i10 = closestPhotoSizeWithSize.size;
                } else {
                    httpFilePath = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                    name = httpFilePath.getName();
                    i10 = searchImage.size;
                }
                j10 = i10;
                String str2 = name;
                file = httpFilePath;
                str = str2;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            }
            boolean exists = file.exists();
            int i11 = this.f37964b;
            if (exists) {
                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                this.f38013u0.invalidate();
                if (i11 == 2) {
                    if (j10 != 0 && this.G1 == 0) {
                        this.f38001p0.setSubtitle(AndroidUtilities.formatFileSize(j10));
                    } else {
                        this.f38001p0.setSubtitle(null);
                    }
                }
            } else {
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(str, null, this);
                if (i11 == 2 && this.G1 == 0) {
                    this.f38001p0.setSubtitle(LocaleController.getString(R.string.LoadingFullImage));
                }
                this.f38013u0.invalidate();
            }
            float f12 = 0.5f;
            if (this.T0 == null && (frameLayout = this.f38015v0) != null) {
                if (exists) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.5f;
                }
                frameLayout.setAlpha(f11);
            }
            if (i11 == 0) {
                this.Z.setEnabled(exists);
                TextView textView = this.Z;
                if (exists) {
                    f12 = 1.0f;
                }
                textView.setAlpha(f12);
            } else if (i11 == 2) {
                this.f38026z0.setEnabled(exists);
                zc1 zc1Var = this.f38019w1;
                if (zc1Var != null) {
                    if (exists) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.5f;
                    }
                    zc1Var.setAlpha(f10);
                }
                zc1 zc1Var2 = this.f38022x1;
                if (zc1Var2 != null) {
                    if (exists) {
                        f12 = 1.0f;
                    }
                    zc1Var2.setAlpha(f12);
                }
            } else {
                this.f37979f.setEnabled(exists);
                org.telegram.ui.ActionBar.w0 w0Var = this.f37979f;
                if (exists) {
                    f12 = 1.0f;
                }
                w0Var.setAlpha(f12);
            }
        }
    }

    public final void k1() {
        this.f38013u0.getImageReceiver().setAlpha(Math.abs(this.f37989i1));
        this.f38013u0.invalidate();
        this.M0.e1();
        if (this.f37989i1 >= 0.0f) {
            this.f38013u0.getImageReceiver().setGradientBitmap(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f38013u0.getImageReceiver().setBlendMode(null);
            }
            if (this.f38013u0.getBackground() instanceof org.telegram.ui.Components.fc0) {
                this.f38013u0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.fc0) this.f38013u0.getBackground()).f26878k);
            }
        }
        this.f37961a.b(this.f38013u0.getBackground(), this.f38013u0.getBackground(), Float.valueOf(this.f37989i1));
        V0();
    }

    public final void l1() {
        char c3;
        float f10;
        boolean z4;
        boolean z10;
        float f11;
        float f12 = 1.0f;
        float f13 = 0.0f;
        int i10 = this.f37964b;
        if (i10 != 1 && i10 != 2) {
            boolean isEnabled = this.G0[0].isEnabled();
            TLRPC.TL_wallPaper tL_wallPaper = this.T0;
            if (tL_wallPaper != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (isEnabled == z4) {
                return;
            }
            if (tL_wallPaper == null) {
                this.G0[0].a(false, true);
            }
            org.telegram.ui.Components.m81 m81Var = this.G0[0];
            if (this.T0 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            m81Var.setEnabled(z10);
            if (this.T0 != null) {
                this.G0[0].setVisibility(0);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            int dp = (AndroidUtilities.dp(9.0f) + ((FrameLayout.LayoutParams) this.G0[1].getLayoutParams()).width) / 2;
            org.telegram.ui.Components.m81 m81Var2 = this.G0[0];
            Property property = View.ALPHA;
            if (this.T0 == null) {
                f12 = 0.0f;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(m81Var2, property, f12));
            org.telegram.ui.Components.m81 m81Var3 = this.G0[0];
            Property property2 = View.TRANSLATION_X;
            if (this.T0 != null) {
                f11 = 0.0f;
            } else {
                f11 = dp;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(m81Var3, property2, f11));
            org.telegram.ui.Components.m81 m81Var4 = this.G0[1];
            if (this.T0 == null) {
                f13 = -dp;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(m81Var4, property2, f13));
            animatorSet.setInterpolator(org.telegram.ui.Components.pr.f30169g);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new pc1(this));
            animatorSet.start();
            return;
        }
        if (this.T0 == null && (this.f38025y1 instanceof vi1)) {
            this.G0[2].a(false, true);
        }
        org.telegram.ui.Components.m81[] m81VarArr = this.G0;
        if (this.T0 != null) {
            c3 = 2;
        } else {
            c3 = 0;
        }
        m81VarArr[c3].setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        org.telegram.ui.Components.m81 m81Var5 = this.G0[2];
        Property property3 = View.ALPHA;
        if (this.T0 != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m81Var5, property3, f10);
        org.telegram.ui.Components.m81 m81Var6 = this.G0[0];
        if (this.T0 != null) {
            f12 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(m81Var6, property3, f12));
        animatorSet2.addListener(new oc1(this));
        animatorSet2.setInterpolator(org.telegram.ui.Components.pr.f30169g);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }

    public final void m1(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jd1.m1(boolean):void");
    }

    public final void n1() {
        int childCount = this.M0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.M0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.k5) {
                ((org.telegram.ui.Cells.k5) childAt).u(true);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (!Q0(z4)) {
            return false;
        }
        O0(true);
        return super.onBackPressed(z4);
    }

    @Override
    public final void onBottomSheetCreated() {
        super.onBottomSheetCreated();
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && f5Var.getBottomSheet() != null) {
            this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.k6.f21733h5));
            if (this.f37964b == 2 && this.G1 != 0) {
                this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
        j1();
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.invalidateMotionBackground);
        getNotificationCenter().addObserver(this, NotificationCenter.wallpaperSettedToUser);
        int i10 = this.f37964b;
        if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 == 2 || i10 == 1) {
            org.telegram.ui.ActionBar.k6.N = true;
        }
        if (i10 == 0 && this.f38008s == null) {
            this.B1 = org.telegram.ui.ActionBar.k6.f21746i0;
        } else {
            Point point = AndroidUtilities.displaySize;
            int min = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            int max = Math.max(point2.x, point2.y);
            StringBuilder sb = new StringBuilder();
            sb.append((int) (min / AndroidUtilities.density));
            sb.append("_");
            this.D1 = android.support.v4.media.a.m((int) (max / AndroidUtilities.density), "_f", sb);
            Point point3 = AndroidUtilities.displaySize;
            this.E1 = Math.max(point3.x, point3.y);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            this.f38004q1 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
            if (this.R0 == null) {
                this.R0 = new ArrayList();
                MessagesStorage.getInstance(this.currentAccount).getWallpapers();
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.invalidateMotionBackground);
        getNotificationCenter().removeObserver(this, NotificationCenter.wallpaperSettedToUser);
        mc1 mc1Var = this.f37986h0;
        if (mc1Var != null && this.N != null) {
            mc1Var.getViewTreeObserver().removeOnGlobalLayoutListener(this.N);
        }
        int i10 = this.f37964b;
        if ((i10 == 2 || i10 == 1) && this.f37995m1 == null) {
            AndroidUtilities.runOnUIThread(new sj0(6));
        }
        if (i10 == 2) {
            Bitmap bitmap = this.f38012t1;
            if (bitmap != null) {
                bitmap.recycle();
                this.f38012t1 = null;
            }
            this.f37961a.b(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        } else if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 != 0 || this.f38008s != null) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
        }
        super.onFragmentDestroy();
        P0(null);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.B1) {
            this.f38010s1.c(false);
        }
        org.telegram.ui.ActionBar.k6.f21618b = false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        bd1 bd1Var = this.f37994l0;
        if (bd1Var != null) {
            bd1Var.l();
        }
        fd1 fd1Var = this.f38009s0;
        if (fd1Var != null) {
            fd1Var.l();
        }
        if (this.B1) {
            this.f38010s1.c(true);
        }
        org.telegram.ui.ActionBar.k6.f21618b = true;
    }

    @Override
    public final void onSuccessDownload(String str) {
        j1();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        super.onTransitionAnimationStart(z4, z10);
        if (!z4 && this.f37964b == 2) {
            this.f37961a.b(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.g6 g6Var) {
        this.f37961a.f37625a = g6Var;
    }

    public jd1(org.telegram.ui.ActionBar.j6 j6Var, boolean z4, int i10, boolean z10, boolean z11) {
        super(null);
        this.f37961a = new ic1(this);
        this.d = true;
        this.f37996n = 1;
        org.telegram.ui.ActionBar.r5 r5Var = new org.telegram.ui.ActionBar.r5(this, 0, false);
        this.O = r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2 = new org.telegram.ui.ActionBar.r5(this, 0, true);
        this.P = r5Var2;
        org.telegram.ui.ActionBar.r5 r5Var3 = new org.telegram.ui.ActionBar.r5(this, 1, false);
        this.Q = r5Var3;
        org.telegram.ui.ActionBar.r5 r5Var4 = new org.telegram.ui.ActionBar.r5(this, 1, true);
        this.R = r5Var4;
        this.U = -1;
        this.V = new vb1(this, 0);
        this.f38011t0 = new yc1[2];
        this.I0 = new FrameLayout[2];
        this.J0 = new TextView[2];
        this.K0 = new TextView[2];
        this.L0 = new FrameLayout[2];
        this.S0 = new HashMap();
        this.f37989i1 = 0.5f;
        this.f37993k1 = 0.0f;
        this.f38002p1 = PorterDuff.Mode.SRC_IN;
        this.f38016v1 = 1.0f;
        this.D1 = "640_360";
        this.E1 = 1920;
        this.H1 = true;
        this.P1 = new org.telegram.ui.Components.l20(getParentActivity(), new kc1(this));
        this.Q1 = false;
        this.R1 = false;
        this.f37964b = i10;
        this.f37969c0 = z11;
        this.f37965b0 = j6Var;
        this.f37976e0 = z4;
        this.f37972d0 = z10;
        if (i10 == 1) {
            org.telegram.ui.ActionBar.i6 k10 = j6Var.k(!z10);
            this.f38008s = k10;
            if (k10 != null) {
                this.d = false;
                this.f38017w = k10.f21471c;
                this.f38020x = k10.d;
                this.f38023y = k10.f21472e;
                this.B = k10.f21473f;
                this.C = k10.f21474g;
                this.D = k10.h;
                this.E = k10.f21475i;
                this.F = k10.f21476j;
                this.G = k10.f21477k;
                this.H = k10.f21478l;
                this.I = k10.f21479m;
                this.J = k10.f21482p;
                this.K = k10.f21481o;
                this.L = k10.f21480n;
            }
        } else {
            if (i10 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.i6 k11 = j6Var.k(false);
            this.f38008s = k11;
            if (k11 != null) {
                this.T0 = k11.f21485s;
            }
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.f38008s;
        if (i6Var != null) {
            this.B1 = i6Var.f21483q;
            if (!TextUtils.isEmpty(i6Var.f21481o)) {
                this.f37989i1 = this.f38008s.f21482p;
            }
            org.telegram.ui.ActionBar.k6.M = org.telegram.ui.ActionBar.k6.A0();
            org.telegram.ui.ActionBar.k6.O = true;
            org.telegram.ui.ActionBar.k6.P = true;
            org.telegram.ui.ActionBar.k6.t(j6Var, false, false);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.goingToPreviewTheme, new Object[0]);
        r5Var.v = true;
        r5Var3.v = true;
        r5Var2.v = true;
        r5Var4.v = true;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
    }

    public jd1(org.telegram.ui.ActionBar.j6 j6Var) {
        this(j6Var, false, 0, false, false);
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
