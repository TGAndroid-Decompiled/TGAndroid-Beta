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
public class qc1 extends org.telegram.ui.ActionBar.o2 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public final int A;
    public nb1 A0;
    public boolean A1;
    public final int B;
    public ImageView B0;
    public boolean B1;
    public final int C;
    public ImageView C0;
    public String C1;
    public final boolean D;
    public AnimatorSet D0;
    public int D1;
    public final long E;
    public AnimatorSet E0;
    public pc1 E1;
    public final long F;
    public org.telegram.ui.Components.a81[] F0;
    public long F1;
    public final long G;
    public org.telegram.ui.Components.a81[] G0;
    public boolean G1;
    public final long H;
    public final FrameLayout[] H0;
    public boolean H1;
    public final float I;
    public final TextView[] I0;
    public boolean I1;
    public final String J;
    public final TextView[] J0;
    public org.telegram.ui.Components.xi0 J1;
    public final int K;
    public final FrameLayout[] K0;
    public org.telegram.ui.ActionBar.w0 K1;
    public long L;
    public wa1 L0;
    public ValueAnimator L1;
    public p90 M;
    public oc1 M0;
    public bg.u1 M1;
    public final org.telegram.ui.ActionBar.n5 N;
    public f2.j0 N0;
    public mb1 N1;
    public final org.telegram.ui.ActionBar.n5 O;
    public org.telegram.ui.Cells.k4 O0;
    public final org.telegram.ui.Components.f20 O1;
    public final org.telegram.ui.ActionBar.n5 P;
    public org.telegram.ui.Cells.j0 P0;
    public boolean P1;
    public final org.telegram.ui.ActionBar.n5 Q;
    public ArrayList Q0;
    public boolean Q1;
    public org.telegram.ui.Components.gq R;
    public final HashMap R0;
    public TL_stories.TL_premium_boostsStatus R1;
    public int S;
    public TLRPC.TL_wallPaper S0;
    public float S1;
    public int T;
    public TLRPC.TL_wallPaper T0;
    public float T1;
    public final Runnable U;
    public TLRPC.TL_wallPaper U0;
    public float U1;
    public boolean V;
    public int V0;
    public float V1;
    public cg.i0 W;
    public int W0;
    public boolean W1;
    public FrameLayout X;
    public int X0;
    public int X1;
    public TextView Y;
    public int Y0;
    public ValueAnimator Y1;
    public TextView Z;
    public int Z0;
    public boolean Z1;
    public final pb1 f41623a;
    public final org.telegram.ui.ActionBar.f6 f41624a0;
    public int f41625a1;
    public TextView a2;
    public final int f41626b;
    public final boolean f41627b0;
    public int f41628b1;
    public WeakReference f41629b2;
    public Scroller f41630c;
    public final boolean f41631c0;
    public int f41632c1;
    public BitmapDrawable f41633c2;
    public final boolean d;
    public final boolean f41634d0;
    public int f41635d1;
    public fc f41636d2;
    public org.telegram.ui.Components.tl f41637e;
    public ArrayList f41638e0;
    public int f41639e1;
    public float f41640e2;
    public org.telegram.ui.ActionBar.w0 f41641f;
    public m2.g f41642f0;
    public int f41643f1;
    public ValueAnimator f41644f2;
    public bg.d1 f41645g0;
    public int f41646g1;
    public TextView h;
    public UndoView f41647h0;
    public float f41648h1;
    public FrameLayout f41649i0;
    public float f41650i1;
    public org.telegram.ui.Components.jl0 f41651j0;
    public float f41652j1;
    public ic1 f41653k0;
    public float f41654k1;
    public org.telegram.ui.Components.u10 f41655l0;
    public hc1 l1;
    public MessageObject m0;
    public org.telegram.ui.Components.iq f41656m1;
    public int f41657n;
    public boolean f41658n0;
    public AnimatorSet f41659n1;
    public org.telegram.ui.ActionBar.l f41660o0;
    public final PorterDuff.Mode f41661o1;
    public org.telegram.ui.ActionBar.r0 f41662p0;
    public int f41663p1;
    public jb1 f41664q0;
    public org.telegram.ui.Components.n9 f41665q1;
    public Drawable f41666r;
    public mc1 f41667r0;
    public org.telegram.ui.Components.c81 f41668r1;
    public final org.telegram.ui.ActionBar.e6 f41669s;
    public final fc1[] f41670s0;
    public Bitmap f41671s1;
    public fc1 f41672t0;
    public Bitmap f41673t1;
    public FrameLayout f41674u0;
    public float f41675u1;
    public boolean v;
    public FrameLayout f41676v0;
    public gc1 f41677v1;
    public final int f41678w;
    public org.telegram.ui.Components.g40 f41679w0;
    public gc1 f41680w1;
    public final int f41681x;
    public AnimatorSet f41682x0;
    public Object f41683x1;
    public final int f41684y;
    public u4 f41685y0;
    public Bitmap f41686y1;
    public nb1 f41687z0;
    public boolean f41688z1;

    public qc1(Object obj, Bitmap bitmap, boolean z10) {
        super(null);
        this.f41623a = new pb1(this);
        this.d = true;
        this.f41657n = 1;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(this, 0, false);
        this.N = n5Var;
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(this, 0, true);
        this.O = n5Var2;
        org.telegram.ui.ActionBar.n5 n5Var3 = new org.telegram.ui.ActionBar.n5(this, 1, false);
        this.P = n5Var3;
        org.telegram.ui.ActionBar.n5 n5Var4 = new org.telegram.ui.ActionBar.n5(this, 1, true);
        this.Q = n5Var4;
        this.T = -1;
        this.U = new bb1(this, 0);
        this.f41670s0 = new fc1[2];
        this.H0 = new FrameLayout[2];
        this.I0 = new TextView[2];
        this.J0 = new TextView[2];
        this.K0 = new FrameLayout[2];
        this.R0 = new HashMap();
        this.f41648h1 = 0.5f;
        this.f41652j1 = 0.0f;
        this.f41661o1 = PorterDuff.Mode.SRC_IN;
        this.f41675u1 = 1.0f;
        this.C1 = "640_360";
        this.D1 = 1920;
        this.G1 = true;
        this.O1 = new org.telegram.ui.Components.f20(getParentActivity(), new rb1(this));
        this.P1 = false;
        this.Q1 = false;
        this.f41626b = 2;
        this.f41683x1 = obj;
        this.f41686y1 = bitmap;
        this.f41688z1 = z10;
        if (obj instanceof zh1) {
            zh1 zh1Var = (zh1) obj;
            this.A1 = zh1Var.f45232j;
            TLRPC.TL_wallPaper tL_wallPaper = zh1Var.f45230g;
            this.S0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f9 = zh1Var.h;
                this.f41648h1 = f9;
                if (f9 < 0.0f && !org.telegram.ui.ActionBar.g6.I.q()) {
                    this.f41648h1 *= -1.0f;
                }
            }
        }
        n5Var.v = true;
        n5Var3.v = true;
        n5Var2.v = true;
        n5Var4.v = true;
    }

    public static void U(qc1 qc1Var) {
        org.telegram.ui.ActionBar.e6 k9;
        org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.M;
        if (f6Var == null) {
            return;
        }
        int i10 = f6Var.V;
        if (i10 >= 0) {
            k9 = (org.telegram.ui.ActionBar.e6) f6Var.W.get(i10);
        } else {
            k9 = f6Var.k(false);
        }
        if (qc1Var.f41669s != null) {
            qc1Var.W0();
            org.telegram.ui.ActionBar.g6.t1(qc1Var.f41624a0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.g6.M != null) {
                org.telegram.ui.ActionBar.g6.O = false;
                org.telegram.ui.ActionBar.g6.P = false;
                org.telegram.ui.ActionBar.g6.M = null;
            }
            org.telegram.ui.ActionBar.g6.t(qc1Var.f41624a0, true, qc1Var.f41627b0);
            ((ActionBarLayout) qc1Var.parentLayout).U(false, false);
        } else {
            ((ActionBarLayout) qc1Var.parentLayout).U(false, false);
            File file = new File(qc1Var.f41624a0.f22943b);
            org.telegram.ui.ActionBar.f6 f6Var2 = qc1Var.f41624a0;
            org.telegram.ui.ActionBar.g6.u(file, f6Var2.f22941a, f6Var2.B, false);
            MessagesController.getInstance(qc1Var.f41624a0.A).saveTheme(qc1Var.f41624a0, null, false, false);
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", qc1Var.f41624a0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) qc1Var.getParentLayout().getFragmentStack().get(Math.max(0, qc1Var.getParentLayout().getFragmentStack().size() - 2));
        qc1Var.finishFragment();
        if (qc1Var.f41626b == 0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didApplyNewTheme, f6Var, k9, Boolean.valueOf(qc1Var.f41634d0));
        }
        org.telegram.ui.ActionBar.g6.F1(o2Var);
    }

    public static void V(qc1 qc1Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = qc1Var.R0;
        org.telegram.ui.ActionBar.e6 e6Var = qc1Var.f41669s;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            qc1Var.Q0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_wallPapers.wallpapers.get(i10) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i10);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f22398id))) {
                            qc1Var.Q0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.f22398id), tL_wallPaper2);
                        }
                        if (e6Var != null && (str = e6Var.f22914o) != null && str.equals(tL_wallPaper2.slug)) {
                            qc1Var.S0 = tL_wallPaper2;
                            qc1Var.b1(false);
                            qc1Var.j1();
                        } else if (e6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = qc1Var.S0;
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
            if (!z10 && (tL_wallPaper = qc1Var.S0) != null) {
                qc1Var.Q0.add(0, tL_wallPaper);
            }
            oc1 oc1Var = qc1Var.M0;
            if (oc1Var != null) {
                oc1Var.l();
            }
            MessagesStorage.getInstance(qc1Var.currentAccount).putWallpapers(tL_wallPapers.wallpapers, 1);
        }
        if (qc1Var.S0 == null && e6Var != null && !TextUtils.isEmpty(e6Var.f22914o)) {
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = e6Var.f22914o;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(qc1Var.currentAccount).bindRequestToGuid(qc1Var.getConnectionsManager().sendRequest(getwallpaper, new hb1(qc1Var, 0)), qc1Var.classGuid);
        }
    }

    public static void W(qc1 qc1Var) {
        org.telegram.ui.Components.tl tlVar = qc1Var.f41637e;
        int i10 = 0;
        if (tlVar != null) {
            tlVar.B(qc1Var.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
            qc1Var.f41637e.G(qc1Var.getThemedColor(org.telegram.ui.ActionBar.g6.E8), false);
        }
        Drawable drawable = qc1Var.f41666r;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(qc1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6), PorterDuff.Mode.MULTIPLY));
        }
        u4 u4Var = qc1Var.f41685y0;
        if (u4Var != null) {
            u4Var.invalidate();
        }
        if (qc1Var.l1 != null) {
            org.telegram.ui.ActionBar.b5 b5Var = qc1Var.parentLayout;
            if (b5Var != null && b5Var.getBottomSheet() != null) {
                qc1Var.parentLayout.getBottomSheet().fixNavigationBar(qc1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5));
                if (qc1Var.f41626b == 2 && qc1Var.F1 != 0) {
                    qc1Var.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            } else {
                qc1Var.setNavigationBarColor(qc1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5));
            }
        }
        if (qc1Var.F0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.a81[] a81VarArr = qc1Var.F0;
                if (i11 >= a81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.a81 a81Var = a81VarArr[i11];
                if (a81Var != null) {
                    a81Var.invalidate();
                }
                i11++;
            }
        }
        if (qc1Var.G0 != null) {
            while (true) {
                org.telegram.ui.Components.a81[] a81VarArr2 = qc1Var.G0;
                if (i10 >= a81VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.a81 a81Var2 = a81VarArr2[i10];
                if (a81Var2 != null) {
                    a81Var2.invalidate();
                }
                i10++;
            }
        }
        TextView textView = qc1Var.a2;
        if (textView != null) {
            textView.setTextColor(qc1Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
        }
        org.telegram.ui.Components.gq gqVar = qc1Var.R;
        if (gqVar != null) {
            gqVar.invalidate();
        }
        org.telegram.ui.Components.u10 u10Var = qc1Var.f41655l0;
        if (u10Var != null) {
            u10Var.g();
        }
    }

    public static void X(qc1 qc1Var, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (qc1Var.getParentActivity() == null) {
            return;
        }
        cg.v0 v0Var = new cg.v0(23, qc1Var.currentAccount, qc1Var.getParentActivity(), qc1Var, qc1Var.f41623a);
        v0Var.G1(canApplyBoost);
        v0Var.F1(qc1Var.R1, true);
        v0Var.H1(qc1Var.F1);
        if (!qc1Var.U0()) {
            v0Var.M0 = new bb1(qc1Var, 1);
        }
        qc1Var.showDialog(v0Var);
    }

    public final void M0() {
        AnimatorSet animatorSet = this.f41682x0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f41682x0 = animatorSet2;
        if (this.A1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f41672t0, View.SCALE_X, this.f41675u1), ObjectAnimator.ofFloat(this.f41672t0, View.SCALE_Y, this.f41675u1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f41672t0, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f41672t0, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f41672t0, View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f41672t0, View.TRANSLATION_Y, 0.0f));
        }
        this.f41682x0.setInterpolator(org.telegram.ui.Components.jr.f29801g);
        this.f41682x0.addListener(new tb1(this, 1));
        this.f41682x0.start();
    }

    public final void N0(boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qc1.N0(boolean):void");
    }

    public final void O0(boolean z10) {
        int i10 = this.f41626b;
        if (i10 == 2) {
            if (!z10) {
                finishFragment();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.g6.o();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        org.telegram.ui.ActionBar.e6 e6Var = this.f41669s;
        if (i10 == 1) {
            if (this.f41631c0) {
                e6Var.f22904c = this.f41678w;
                e6Var.d = this.f41681x;
                e6Var.f22905e = this.f41684y;
                e6Var.f22906f = this.A;
                e6Var.f22907g = this.B;
                e6Var.h = this.C;
                e6Var.f22908i = this.D;
                e6Var.f22909j = this.E;
                e6Var.f22910k = this.F;
                e6Var.f22911l = this.G;
                e6Var.f22912m = this.H;
                e6Var.f22913n = this.K;
                e6Var.f22914o = this.J;
                e6Var.f22915p = this.I;
            }
            org.telegram.ui.ActionBar.g6.t1(this.f41624a0, false, true, false, false, false);
        } else {
            if (e6Var != null) {
                org.telegram.ui.ActionBar.g6.t1(this.f41624a0, false, this.f41634d0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).U(false, false);
            if (this.f41634d0) {
                org.telegram.ui.ActionBar.f6 f6Var = this.f41624a0;
                if (f6Var.f22943b != null && org.telegram.ui.ActionBar.g6.H.get(f6Var.m()) == null) {
                    new File(f6Var.f22943b).delete();
                }
            }
        }
        if (!z10) {
            finishFragment();
        }
    }

    public final BitmapDrawable P0(Drawable drawable) {
        WeakReference weakReference = this.f41629b2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.f41633c2;
        }
        WeakReference weakReference2 = this.f41629b2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f41629b2 = null;
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            this.f41629b2 = new WeakReference(drawable);
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
            this.f41633c2 = bitmapDrawable;
            bitmapDrawable.setFilterBitmap(true);
            return this.f41633c2;
        }
        this.f41633c2 = null;
        return null;
    }

    public final boolean Q0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qc1.Q0(boolean):boolean");
    }

    public final int R0() {
        if (ChatObject.isChannelAndNotMegaGroup(-this.F1, this.currentAccount)) {
            return getMessagesController().channelCustomWallpaperLevelMin;
        }
        return getMessagesController().groupCustomWallpaperLevelMin;
    }

    public final ArrayList S0() {
        rx0 rx0Var = new rx0(7, this);
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f41649i0;
        int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(frameLayout, 1, null, null, null, rx0Var, i10));
        m2.g gVar = this.f41642f0;
        int i11 = org.telegram.ui.ActionBar.g6.f23329s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(gVar, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i11));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.g6.f23348t8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 256, null, null, null, null, i12));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.g6.A8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar2, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41660o0, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41660o0, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41660o0, 1024, null, null, null, null, org.telegram.ui.ActionBar.g6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41660o0, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41660o0, Integer.MIN_VALUE, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41660o0, 1073741824, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41651j0, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 32768, null, null, null, null, i11));
        if (!this.d) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.X, 1, null, null, null, null, i10));
            TextView textView = this.Z;
            int i14 = org.telegram.ui.ActionBar.g6.Ae;
            arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 4, null, null, null, null, i14));
        }
        org.telegram.ui.Components.gq gqVar = this.R;
        if (gqVar != null) {
            org.telegram.ui.ActionBar.w0 w0Var = gqVar.E;
            EditTextBoldCursor[] editTextBoldCursorArr = gqVar.A;
            for (int i15 = 0; i15 < editTextBoldCursorArr.length; i15++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.g6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursorArr[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursorArr[i15], 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursorArr[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.g6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursorArr[i15], 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f23189k6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursorArr[i15], 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f23206l6));
            }
            org.telegram.ui.ActionBar.m0 m0Var = gqVar.B;
            int i17 = org.telegram.ui.ActionBar.g6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.i6(m0Var, 8, null, null, null, null, i17));
            org.telegram.ui.ActionBar.m0 m0Var2 = gqVar.B;
            int i18 = org.telegram.ui.ActionBar.g6.I5;
            arrayList.add(new org.telegram.ui.ActionBar.i6(m0Var2, 32, null, null, null, null, i18));
            if (w0Var != null) {
                org.telegram.ui.Components.x6 x6Var = new org.telegram.ui.Components.x6(gqVar, 3);
                arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var, 0, null, null, null, x6Var, i17));
                arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var, 0, null, null, null, x6Var, i18));
                arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.H0;
        if (frameLayoutArr != null) {
            for (int i19 = 0; i19 < frameLayoutArr.length; i19++) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(frameLayoutArr[i19], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23149i3}, null, org.telegram.ui.ActionBar.g6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.i6(frameLayoutArr[i19], 0, null, org.telegram.ui.ActionBar.g6.f23166j2, null, null, org.telegram.ui.ActionBar.g6.Sd));
            }
            int i20 = 0;
            while (true) {
                FrameLayout[] frameLayoutArr2 = this.K0;
                if (i20 >= frameLayoutArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.i6(frameLayoutArr2[i20], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23149i3}, null, org.telegram.ui.ActionBar.g6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.i6(frameLayoutArr2[i20], 0, null, org.telegram.ui.ActionBar.g6.f23166j2, null, null, org.telegram.ui.ActionBar.g6.Sd));
                i20++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41685y0, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23149i3}, null, org.telegram.ui.ActionBar.g6.Td));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41685y0, 0, null, org.telegram.ui.ActionBar.g6.f23166j2, null, null, org.telegram.ui.ActionBar.g6.Sd));
            int i21 = 0;
            while (true) {
                TextView[] textViewArr = this.J0;
                if (i21 >= textViewArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.i6(textViewArr[i21], 4, null, null, null, null, org.telegram.ui.ActionBar.g6.Ae));
                i21++;
            }
            int i22 = 0;
            while (true) {
                TextView[] textViewArr2 = this.I0;
                if (i22 >= textViewArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.i6(textViewArr2[i22], 4, null, null, null, null, org.telegram.ui.ActionBar.g6.Ae));
                i22++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.P0, 0, new Class[]{org.telegram.ui.Components.ao0.class}, new String[]{"innerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Ti));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.P0, 0, new Class[]{org.telegram.ui.Components.ao0.class}, new String[]{"outerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Vi));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.O0, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23220m3, org.telegram.ui.ActionBar.g6.f23292q3}, null, org.telegram.ui.ActionBar.g6.f23313ra));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23238n3, org.telegram.ui.ActionBar.g6.f23308r3}, null, org.telegram.ui.ActionBar.g6.f23067dc));
            Drawable[] drawableArr = org.telegram.ui.ActionBar.g6.f23220m3.f22881y;
            int i23 = org.telegram.ui.ActionBar.g6.f23350ta;
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, drawableArr, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.f23292q3.f22881y, null, i23));
            org.telegram.ui.ActionBar.n5 n5Var = this.N;
            org.telegram.ui.ActionBar.n5 n5Var2 = this.P;
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{n5Var, n5Var2}, null, org.telegram.ui.ActionBar.g6.Aa));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{n5Var, n5Var2}, null, org.telegram.ui.ActionBar.g6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{n5Var, n5Var2}, null, org.telegram.ui.ActionBar.g6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{n5Var, n5Var2}, null, org.telegram.ui.ActionBar.g6.Fa));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23275p3, org.telegram.ui.ActionBar.g6.f23343t3}, null, org.telegram.ui.ActionBar.g6.Ba));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.g6.f23257o3.f22881y;
            int i24 = org.telegram.ui.ActionBar.g6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, drawableArr2, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.f23324s3.f22881y, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23086ec));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23104fc));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23430y3}, null, org.telegram.ui.ActionBar.g6.Ja));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23447z3}, null, org.telegram.ui.ActionBar.g6.Ka));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.A3, org.telegram.ui.ActionBar.g6.C3}, null, org.telegram.ui.ActionBar.g6.La));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.B3, org.telegram.ui.ActionBar.g6.D3}, null, org.telegram.ui.ActionBar.g6.Ma));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.F3, org.telegram.ui.ActionBar.g6.G3}, null, org.telegram.ui.ActionBar.g6.f23333sc));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Uc));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23013ab));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Wc));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23049cb));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Yc));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23066db));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23015ad));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23103fb));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23248nd));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23332sb));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23266od));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41664q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23246nb));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.f23133h5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.f23151i5));
        for (int i25 = 0; i25 < arrayList.size(); i25++) {
            ((org.telegram.ui.ActionBar.i6) arrayList.get(i25)).f23544o = this.f41623a;
        }
        return arrayList;
    }

    public final boolean T0(int i10) {
        int B0;
        long j10;
        if (this.f41631c0) {
            return false;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f41669s;
        if (i10 == 1 || i10 == 2) {
            long j11 = this.E;
            if (j11 != 0) {
                if (j11 != e6Var.f22909j) {
                    return true;
                }
            } else {
                int B02 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Nd);
                int i11 = (int) e6Var.f22909j;
                if (i11 == 0) {
                    i11 = B02;
                }
                if (i11 != B02) {
                    return true;
                }
            }
            long j12 = this.H;
            long j13 = this.G;
            long j14 = this.F;
            if (j14 == 0 && j13 == 0 && j12 == 0) {
                for (int i12 = 0; i12 < 3; i12++) {
                    if (i12 == 0) {
                        B0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Od);
                        j10 = e6Var.f22910k;
                    } else if (i12 == 1) {
                        B0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Pd);
                        j10 = e6Var.f22911l;
                    } else {
                        B0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Qd);
                        j10 = e6Var.f22912m;
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
            } else if (j14 != e6Var.f22910k || j13 != e6Var.f22911l || j12 != e6Var.f22912m) {
                return true;
            }
            if (e6Var.f22913n != this.K) {
                return true;
            }
        }
        if (i10 == 1 || i10 == 3) {
            if (this.f41678w != e6Var.d) {
                return true;
            }
            int i14 = this.f41684y;
            if (i14 != 0) {
                if (i14 != e6Var.f22905e) {
                    return true;
                }
            } else {
                int i15 = e6Var.f22905e;
                if (i15 != 0 && i15 != e6Var.f22904c) {
                    return true;
                }
            }
            int i16 = this.A;
            if (i16 != 0) {
                if (i16 != e6Var.f22906f) {
                    return true;
                }
            } else if (e6Var.f22906f != 0) {
                return true;
            }
            int i17 = this.B;
            if (i17 != 0) {
                if (i17 != e6Var.f22907g) {
                    return true;
                }
            } else if (e6Var.f22907g != 0) {
                return true;
            }
            int i18 = this.C;
            if (i18 != 0) {
                if (i18 != e6Var.h) {
                    return true;
                }
            } else if (e6Var.h != 0) {
                return true;
            }
            if (this.D != e6Var.f22908i) {
                return true;
            }
        }
        return false;
    }

    public boolean U0() {
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && b5Var.getBottomSheet() != null) {
            return true;
        }
        return false;
    }

    public final void V0() {
        float f9;
        bg.u1 u1Var = this.M1;
        if (u1Var != null) {
            u1Var.invalidate();
        }
        FrameLayout frameLayout = this.f41674u0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f41674u0.getChildAt(i10).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.f41676v0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                this.f41676v0.getChildAt(i11).invalidate();
            }
        }
        if (this.F0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.a81[] a81VarArr = this.F0;
                if (i12 >= a81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.a81 a81Var = a81VarArr[i12];
                if (a81Var != null) {
                    if (this.I1) {
                        f9 = this.f41652j1 * this.f41654k1;
                    } else {
                        f9 = 0.0f;
                    }
                    a81Var.setDimAmount(f9);
                    this.F0[i12].invalidate();
                }
                i12++;
            }
        }
        if (this.f41651j0 != null) {
            for (int i13 = 0; i13 < this.f41651j0.getChildCount(); i13++) {
                View childAt = this.f41651j0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.v0) {
                    d1((org.telegram.ui.Cells.v0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.f41664q0 != null) {
            for (int i14 = 0; i14 < this.f41664q0.getChildCount(); i14++) {
                View childAt2 = this.f41664q0.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                    d1((org.telegram.ui.Cells.v0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        gc1 gc1Var = this.f41677v1;
        if (gc1Var != null) {
            gc1Var.invalidate();
        }
        gc1 gc1Var2 = this.f41680w1;
        if (gc1Var2 != null) {
            gc1Var2.invalidate();
        }
        u4 u4Var = this.f41685y0;
        if (u4Var != null) {
            u4Var.invalidate();
        }
    }

    public final void W0() {
        org.telegram.ui.ActionBar.e6 e6Var = this.f41669s;
        if (e6Var != null && !TextUtils.isEmpty(e6Var.f22914o)) {
            try {
                File d = e6Var.d();
                Drawable background = this.f41672t0.getBackground();
                Bitmap bitmap = this.f41672t0.getImageReceiver().getBitmap();
                if (background instanceof org.telegram.ui.Components.yb0) {
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
                paint.setColorFilter(new PorterDuffColorFilter(this.f41643f1, this.f41661o1));
                paint.setAlpha((int) (this.f41648h1 * 255.0f));
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

    public final void Y0(int i10, boolean z10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (getParentActivity() != null && this.f41657n != i10 && this.f41659n1 == null && (e6Var = this.f41669s) != null) {
            if (z10 && i10 == 2 && (org.telegram.ui.ActionBar.g6.Z0() || e6Var.f22909j == 4294967296L)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.ChangeChatBackground);
                if (org.telegram.ui.ActionBar.g6.Z0() && (!org.telegram.ui.ActionBar.g6.Z0() || org.telegram.ui.ActionBar.g6.I.f22949e0.d == 0)) {
                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ChangeWallpaperToColor);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Change), new db1(this, 7));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                } else {
                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ChangeColorToColor);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new db1(this, 5));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Continue), new db1(this, 6));
                }
                showDialog(alertDialog$Builder.f22714a);
                return;
            }
            int i18 = this.f41657n;
            this.f41657n = i10;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        this.h.setText(LocaleController.getString(R.string.ColorPickerMyMessages));
                        if (e6Var.f22906f != 0) {
                            if (e6Var.h != 0) {
                                i17 = 4;
                            } else if (e6Var.f22907g != 0) {
                                i17 = 3;
                            } else {
                                i17 = 2;
                            }
                        } else {
                            i17 = 1;
                        }
                        org.telegram.ui.Components.gq gqVar = this.R;
                        T0(3);
                        gqVar.f(2, 4, i17, true);
                        this.R.e(e6Var.h, 3);
                        this.R.e(e6Var.f22907g, 2);
                        this.R.e(e6Var.f22906f, 1);
                        org.telegram.ui.Components.gq gqVar2 = this.R;
                        int i19 = e6Var.f22905e;
                        if (i19 == 0) {
                            i19 = e6Var.f22904c;
                        }
                        gqVar2.e(i19, 0);
                        this.G0[1].b(0, e6Var.f22905e);
                        this.G0[1].b(1, e6Var.f22906f);
                        this.G0[1].b(2, e6Var.f22907g);
                        this.G0[1].b(3, e6Var.h);
                        if (e6Var.f22907g != 0) {
                            if (i18 == 1) {
                                this.f41667r0.o(0);
                            } else {
                                this.f41667r0.m(0);
                            }
                        } else if (i18 == 2) {
                            this.f41667r0.u(0);
                        }
                        this.f41664q0.v0(0, AndroidUtilities.dp(60.0f), null);
                        e1();
                    }
                } else {
                    this.h.setText(LocaleController.getString(R.string.ColorPickerBackground));
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.Nd);
                    int i20 = org.telegram.ui.ActionBar.g6.Od;
                    if (org.telegram.ui.ActionBar.g6.c1(i20)) {
                        i12 = getThemedColor(i20);
                    } else {
                        i12 = 0;
                    }
                    int i21 = org.telegram.ui.ActionBar.g6.Pd;
                    if (org.telegram.ui.ActionBar.g6.c1(i21)) {
                        i13 = getThemedColor(i21);
                    } else {
                        i13 = 0;
                    }
                    int i22 = org.telegram.ui.ActionBar.g6.Qd;
                    if (org.telegram.ui.ActionBar.g6.c1(i22)) {
                        i14 = getThemedColor(i22);
                    } else {
                        i14 = 0;
                    }
                    long j10 = e6Var.f22910k;
                    int i23 = (int) j10;
                    if (i23 == 0 && j10 != 0) {
                        i12 = 0;
                    }
                    long j11 = e6Var.f22911l;
                    int i24 = (int) j11;
                    if (i24 == 0 && j11 != 0) {
                        i13 = 0;
                    }
                    long j12 = e6Var.f22912m;
                    int i25 = (int) j12;
                    if (i25 == 0 && j12 != 0) {
                        i14 = 0;
                    }
                    int i26 = (int) e6Var.f22909j;
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
                    org.telegram.ui.Components.gq gqVar3 = this.R;
                    T0(2);
                    gqVar3.f(2, 4, i16, false);
                    org.telegram.ui.Components.gq gqVar4 = this.R;
                    if (i25 == 0) {
                        i25 = i14;
                    }
                    gqVar4.e(i25, 3);
                    org.telegram.ui.Components.gq gqVar5 = this.R;
                    if (i15 != 0) {
                        i13 = i15;
                    }
                    gqVar5.e(i13, 2);
                    org.telegram.ui.Components.gq gqVar6 = this.R;
                    if (i23 == 0) {
                        i23 = i12;
                    }
                    gqVar6.e(i23, 1);
                    org.telegram.ui.Components.gq gqVar7 = this.R;
                    if (i26 != 0) {
                        themedColor = i26;
                    }
                    gqVar7.e(themedColor, 0);
                    if (i18 != 1 && e6Var.f22907g != 0) {
                        this.f41667r0.m(0);
                    } else {
                        this.f41667r0.o(0);
                    }
                    this.f41664q0.v0(0, AndroidUtilities.dp(60.0f), null);
                }
            } else {
                this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
                if (e6Var.d != 0) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                org.telegram.ui.Components.gq gqVar8 = this.R;
                T0(1);
                gqVar8.f(1, 2, i11, false);
                this.R.e(e6Var.f22904c, 0);
                int i27 = e6Var.d;
                if (i27 != 0) {
                    this.R.e(i27, 1);
                }
                if (i18 == 2 || (i18 == 3 && e6Var.f22907g != 0)) {
                    this.f41667r0.u(0);
                }
            }
            if (i10 != 1 && i10 != 3) {
                this.R.setMinBrightness(0.0f);
                this.R.setMaxBrightness(1.0f);
                return;
            }
            if (i18 == 2 && this.H0[1].getVisibility() == 0) {
                f1(0, true, true);
            }
            if (i10 == 1) {
                if (this.f41624a0.q()) {
                    this.R.setMinBrightness(0.2f);
                    return;
                }
                this.R.setMinBrightness(0.05f);
                this.R.setMaxBrightness(0.8f);
                return;
            }
            this.R.setMinBrightness(0.0f);
            this.R.setMaxBrightness(1.0f);
        }
    }

    public final void Z0(int i10) {
        TLRPC.TL_wallPaper tL_wallPaper;
        if (i10 >= 0 && i10 < this.Q0.size()) {
            tL_wallPaper = (TLRPC.TL_wallPaper) this.Q0.get(i10);
        } else {
            tL_wallPaper = this.U0;
        }
        TLRPC.TL_wallPaper tL_wallPaper2 = tL_wallPaper;
        if (tL_wallPaper2 == null) {
            return;
        }
        ValueAnimator valueAnimator = this.Y1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.Y1.cancel();
        }
        fc1[] fc1VarArr = this.f41670s0;
        fc1 fc1Var = fc1VarArr[0];
        fc1 fc1Var2 = fc1VarArr[1];
        fc1VarArr[0] = fc1Var2;
        fc1VarArr[1] = fc1Var;
        this.f41662p0.removeView(fc1Var2);
        this.f41662p0.addView(fc1VarArr[0], this.f41662p0.indexOfChild(fc1VarArr[1]) + 1);
        fc1 fc1Var3 = fc1VarArr[0];
        this.f41672t0 = fc1Var3;
        fc1Var3.setBackground(fc1VarArr[1].getBackground());
        k1();
        fc1VarArr[1].setVisibility(0);
        fc1VarArr[1].setAlpha(1.0f);
        this.f41672t0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Y1 = ofFloat;
        ofFloat.addUpdateListener(new ti(2, this));
        this.Y1.addListener(new tb1(this, 0));
        this.Y1.setInterpolator(org.telegram.ui.Components.jr.f29800f);
        this.Y1.setDuration(300L);
        this.Y1.start();
        this.f41672t0.getImageReceiver().setCrossfadeDuration(300);
        this.f41672t0.getImageReceiver().setImage(ImageLocation.getForDocument(tL_wallPaper2.document), this.C1, null, null, null, tL_wallPaper2.document.size, "jpg", tL_wallPaper2, 1);
        this.f41672t0.d();
        this.S0 = tL_wallPaper2;
        this.A1 = this.F0[2].f26703s;
        j1();
    }

    public final void a1(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.yb0 yb0Var;
        if (i11 == 0) {
            this.V0 = i10;
        } else if (i11 == 1) {
            this.X0 = i10;
        } else if (i11 == 2) {
            this.Y0 = i10;
        } else if (i11 == 3) {
            this.Z0 = i10;
        }
        m1(z10);
        if (this.F0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.a81[] a81VarArr = this.F0;
                if (i12 >= a81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.a81 a81Var = a81VarArr[i12];
                if (a81Var != null) {
                    a81Var.b(i11, i10);
                }
                i12++;
            }
        }
        if (this.Y0 != 0) {
            if (this.P0 != null && org.telegram.ui.ActionBar.g6.I.q()) {
                this.P0.setTwoSided(true);
            }
            Drawable background = this.f41672t0.getBackground();
            if (background instanceof org.telegram.ui.Components.yb0) {
                yb0Var = (org.telegram.ui.Components.yb0) background;
            } else {
                yb0Var = new org.telegram.ui.Components.yb0();
                yb0Var.r(this.f41672t0);
                if (this.f41688z1) {
                    yb0Var.m(false);
                }
            }
            yb0Var.n(this.V0, this.X0, this.Y0, this.Z0);
            this.f41672t0.setBackground(yb0Var);
            this.f41643f1 = yb0Var.f();
            this.f41646g1 = 754974720;
        } else if (this.X0 != 0) {
            this.f41672t0.setBackground(new GradientDrawable(org.telegram.ui.Components.s9.d(this.f41635d1), new int[]{this.V0, this.X0}));
            int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(this.V0, this.X0));
            this.f41646g1 = patternColor;
            this.f41643f1 = patternColor;
        } else {
            this.f41672t0.setBackgroundColor(this.V0);
            int patternColor2 = AndroidUtilities.getPatternColor(this.V0);
            this.f41646g1 = patternColor2;
            this.f41643f1 = patternColor2;
        }
        int i13 = org.telegram.ui.ActionBar.g6.lc;
        boolean c12 = org.telegram.ui.ActionBar.g6.c1(i13);
        pb1 pb1Var = this.f41623a;
        if (c12 && !(this.f41672t0.getBackground() instanceof org.telegram.ui.Components.yb0)) {
            if (org.telegram.ui.ActionBar.g6.s0() instanceof org.telegram.ui.Components.yb0) {
                getThemedColor(i13);
                pb1Var.b(this.f41672t0.getBackground(), this.f41672t0.getBackground(), Float.valueOf(this.f41648h1));
            }
        } else {
            pb1Var.b(this.f41672t0.getBackground(), this.f41672t0.getBackground(), Float.valueOf(this.f41648h1));
        }
        ImageView imageView = this.B0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f23158ic), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.C0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f23158ic), PorterDuff.Mode.MULTIPLY));
        }
        fc1 fc1Var = this.f41672t0;
        if (fc1Var != null) {
            fc1Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f41643f1, this.f41661o1));
            this.f41672t0.getImageReceiver().setAlpha(Math.abs(this.f41648h1));
            this.f41672t0.invalidate();
            if (org.telegram.ui.ActionBar.g6.I.q() && (this.f41672t0.getBackground() instanceof org.telegram.ui.Components.yb0)) {
                org.telegram.ui.Cells.j0 j0Var = this.P0;
                if (j0Var != null) {
                    j0Var.setTwoSided(true);
                }
                if (this.f41648h1 < 0.0f) {
                    this.f41672t0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.yb0) this.f41672t0.getBackground()).f35026k);
                }
            } else {
                this.f41672t0.getImageReceiver().setGradientBitmap(null);
                org.telegram.ui.Cells.j0 j0Var2 = this.P0;
                if (j0Var2 != null) {
                    j0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.j0 j0Var3 = this.P0;
            if (j0Var3 != null) {
                j0Var3.setProgress(this.f41648h1);
            }
        }
        jb1 jb1Var = this.f41664q0;
        if (jb1Var != null) {
            jb1Var.f1();
        }
        FrameLayout frameLayout = this.f41674u0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                this.f41674u0.getChildAt(i14).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.f41676v0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                this.f41676v0.getChildAt(i15).invalidate();
            }
        }
    }

    public final void b1(boolean z10) {
        org.telegram.ui.Components.yb0 yb0Var;
        org.telegram.ui.Components.yb0 yb0Var2;
        int i10;
        int g10;
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.ActionBar.e6 e6Var = this.f41669s;
        int i11 = this.f41626b;
        if (i11 == 0 && e6Var == null) {
            this.f41672t0.setBackground(org.telegram.ui.ActionBar.g6.r0());
        } else {
            TLRPC.PhotoSize photoSize2 = null;
            BitmapDrawable bitmapDrawable = null;
            if (i11 == 2) {
                Object obj = this.f41683x1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    if (z10) {
                        photoSize = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, 100);
                    } else {
                        photoSize = null;
                    }
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        bitmapDrawable = new BitmapDrawable(ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, "b"));
                    }
                    fc1 fc1Var = this.f41672t0;
                    fc1Var.f32903a.setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.C1, ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    fc1Var.d();
                } else if (obj instanceof zh1) {
                    zh1 zh1Var = (zh1) obj;
                    int i12 = zh1Var.f45229f;
                    int i13 = zh1Var.f45228e;
                    int i14 = zh1Var.d;
                    int i15 = zh1Var.f45227c;
                    int i16 = zh1Var.f45226b;
                    this.f41635d1 = i12;
                    a1(i16, 0, false);
                    if (i15 != 0) {
                        a1(i15, 1, false);
                    }
                    a1(i14, 2, false);
                    a1(i13, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.S0;
                    if (tL_wallPaper2 != null) {
                        fc1 fc1Var2 = this.f41672t0;
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                        String str = this.C1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.S0;
                        fc1Var2.k(forDocument, str, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                    } else if ("d".equals(zh1Var.f45225a)) {
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        Point point2 = AndroidUtilities.displaySize;
                        int max = Math.max(point2.x, point2.y);
                        if (Build.VERSION.SDK_INT >= 29) {
                            g10 = 1459617792;
                        } else {
                            g10 = org.telegram.ui.Components.yb0.g(i16, i15, i14, i13);
                        }
                        this.f41672t0.setImageBitmap(SvgHelper.getBitmap(R.raw.default_pattern, min, max, g10));
                    }
                } else if (obj instanceof ai1) {
                    Bitmap bitmap = this.f41686y1;
                    if (bitmap != null) {
                        this.f41672t0.setImageBitmap(bitmap);
                    } else {
                        ai1 ai1Var = (ai1) obj;
                        File file = ai1Var.f36560e;
                        if (file != null) {
                            this.f41672t0.f(file.getAbsolutePath(), this.C1, null);
                        } else {
                            File file2 = ai1Var.d;
                            if (file2 != null) {
                                this.f41672t0.f(file2.getAbsolutePath(), this.C1, null);
                            } else if ("t".equals(ai1Var.f36557a)) {
                                fc1 fc1Var3 = this.f41672t0;
                                fc1Var3.setImageDrawable(org.telegram.ui.ActionBar.g6.W0(fc1Var3, false));
                            } else {
                                int i17 = ai1Var.f36558b;
                                if (i17 != 0) {
                                    this.f41672t0.setImageResource(i17);
                                }
                            }
                        }
                    }
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    TLRPC.Photo photo = searchImage.photo;
                    if (photo != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, this.D1, true);
                        if (closestPhotoSizeWithSize2 != closestPhotoSizeWithSize) {
                            photoSize2 = closestPhotoSizeWithSize2;
                        }
                        if (photoSize2 != null) {
                            i10 = photoSize2.size;
                        } else {
                            i10 = 0;
                        }
                        this.f41672t0.k(ImageLocation.getForPhoto(photoSize2, searchImage.photo), this.C1, ImageLocation.getForPhoto(closestPhotoSizeWithSize, searchImage.photo), "100_100_b", i10, "jpg", searchImage, 1);
                    } else {
                        fc1 fc1Var4 = this.f41672t0;
                        String str2 = searchImage.imageUrl;
                        String str3 = this.C1;
                        String str4 = searchImage.thumbUrl;
                        fc1Var4.getClass();
                        fc1Var4.m(ImageLocation.getForPath(str2), str3, ImageLocation.getForPath(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (e6Var == null) {
                this.f41672t0.setBackground(org.telegram.ui.ActionBar.g6.r0());
            } else {
                org.telegram.ui.Components.n9 n9Var = this.f41665q1;
                if (n9Var != null) {
                    n9Var.dispose();
                    this.f41665q1 = null;
                }
                int B0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Nd);
                int i18 = (int) e6Var.f22909j;
                if (i18 != 0) {
                    B0 = i18;
                }
                int B02 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Od);
                long j10 = e6Var.f22910k;
                int i19 = (int) j10;
                if (i19 == 0 && j10 != 0) {
                    B02 = 0;
                } else if (i19 != 0) {
                    B02 = i19;
                }
                int B03 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Pd);
                long j11 = e6Var.f22911l;
                int i20 = (int) j11;
                if (i20 == 0 && j11 != 0) {
                    B03 = 0;
                } else if (i20 != 0) {
                    B03 = i20;
                }
                int B04 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Qd);
                long j12 = e6Var.f22912m;
                int i21 = (int) j12;
                if (i21 == 0 && j12 != 0) {
                    B04 = 0;
                } else if (i21 != 0) {
                    B04 = i21;
                }
                if (!TextUtils.isEmpty(e6Var.f22914o) && !org.telegram.ui.ActionBar.g6.Z0()) {
                    if (B03 != 0) {
                        Drawable background = this.f41672t0.getBackground();
                        if (background instanceof org.telegram.ui.Components.yb0) {
                            yb0Var2 = (org.telegram.ui.Components.yb0) background;
                        } else {
                            org.telegram.ui.Components.yb0 yb0Var3 = new org.telegram.ui.Components.yb0();
                            yb0Var3.r(this.f41672t0);
                            yb0Var2 = yb0Var3;
                            if (this.f41688z1) {
                                yb0Var3.m(false);
                                yb0Var2 = yb0Var3;
                            }
                        }
                        yb0Var2.n(B0, B02, B03, B04);
                        yb0Var = yb0Var2;
                    } else if (B02 != 0) {
                        org.telegram.ui.Components.s9 s9Var = new org.telegram.ui.Components.s9(org.telegram.ui.Components.s9.d(e6Var.f22913n), new int[]{B0, B02});
                        this.f41665q1 = s9Var.f(o1.a.F(0.5f, 3), new xb1(this, 0), 100L);
                        yb0Var = s9Var;
                    } else {
                        yb0Var = new ColorDrawable(B0);
                    }
                    this.f41672t0.setBackground(yb0Var);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.S0;
                    if (tL_wallPaper4 != null) {
                        fc1 fc1Var5 = this.f41672t0;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(tL_wallPaper4.document);
                        String str5 = this.C1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.S0;
                        fc1Var5.k(forDocument2, str5, null, null, tL_wallPaper5.document.size, "jpg", tL_wallPaper5, 1);
                    }
                } else {
                    Drawable s02 = org.telegram.ui.ActionBar.g6.s0();
                    if (s02 != null) {
                        if (s02 instanceof org.telegram.ui.Components.yb0) {
                            ((org.telegram.ui.Components.yb0) s02).r(this.f41672t0);
                        }
                        this.f41672t0.setBackground(s02);
                    }
                }
                if (B02 == 0) {
                    int patternColor = AndroidUtilities.getPatternColor(B0);
                    this.f41646g1 = patternColor;
                    this.f41643f1 = patternColor;
                } else if (B03 != 0) {
                    this.f41643f1 = org.telegram.ui.Components.yb0.g(B0, B02, B03, B04);
                    this.f41646g1 = 754974720;
                } else {
                    int patternColor2 = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(B0, B02));
                    this.f41646g1 = patternColor2;
                    this.f41643f1 = patternColor2;
                }
                fc1 fc1Var6 = this.f41672t0;
                if (fc1Var6 != null) {
                    fc1Var6.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f41643f1, this.f41661o1));
                    this.f41672t0.getImageReceiver().setAlpha(Math.abs(this.f41648h1));
                    this.f41672t0.invalidate();
                    if (org.telegram.ui.ActionBar.g6.I.q() && (this.f41672t0.getBackground() instanceof org.telegram.ui.Components.yb0)) {
                        org.telegram.ui.Cells.j0 j0Var = this.P0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                        if (this.f41648h1 < 0.0f) {
                            this.f41672t0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.yb0) this.f41672t0.getBackground()).f35026k);
                        }
                    } else {
                        this.f41672t0.getImageReceiver().setGradientBitmap(null);
                        org.telegram.ui.Cells.j0 j0Var2 = this.P0;
                        if (j0Var2 != null) {
                            j0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.j0 j0Var3 = this.P0;
                    if (j0Var3 != null) {
                        j0Var3.setProgress(this.f41648h1);
                    }
                }
                if (this.F0 != null) {
                    int i22 = 0;
                    while (true) {
                        org.telegram.ui.Components.a81[] a81VarArr = this.F0;
                        if (i22 >= a81VarArr.length) {
                            break;
                        }
                        a81VarArr[i22].b(0, B0);
                        this.F0[i22].b(1, B02);
                        this.F0[i22].b(2, B03);
                        this.F0[i22].b(3, B04);
                        i22++;
                    }
                }
                ImageView imageView = this.B0;
                if (imageView != null) {
                    imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f23158ic), PorterDuff.Mode.MULTIPLY));
                }
                ImageView imageView2 = this.C0;
                if (imageView2 != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f23158ic), PorterDuff.Mode.MULTIPLY));
                }
                V0();
            }
        }
        this.f41688z1 = false;
    }

    public final void c1(long j10) {
        boolean z10;
        this.F1 = j10;
        if (j10 != 0 && j10 != getUserConfig().getClientUserId()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.G1 = z10;
    }

    @Override
    public final android.view.View createView(android.content.Context r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qc1.createView(android.content.Context):android.view.View");
    }

    public final void d1(org.telegram.ui.Cells.v0 v0Var) {
        pb1 pb1Var;
        float f9;
        if (this.f41672t0 == null) {
            return;
        }
        Bitmap bitmap = this.f41623a.f41360r;
        float f10 = 0.0f;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f9 = ((this.f41672t0.getMeasuredWidth() - (Math.max(this.f41672t0.getMeasuredWidth() / width, this.f41672t0.getMeasuredHeight() / pb1Var.f41360r.getHeight()) * width)) / 2.0f) + this.T1 + 0.0f;
        } else {
            f9 = this.T1 + 0.0f;
        }
        float y8 = v0Var.getY() - ((-this.f41672t0.F) + 0.0f);
        int measuredHeight = this.f41672t0.getMeasuredHeight();
        if (this.I1) {
            f10 = this.f41652j1 * this.f41654k1;
        }
        v0Var.f25800s0 = true;
        v0Var.f25797r0 = measuredHeight;
        v0Var.f25792p0 = y8;
        v0Var.f25794q0 = f9;
        v0Var.O1 = f10;
        v0Var.P1.setColor(i0.a.k(-16777216, (int) (f10 * 255.0f)));
        v0Var.invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (this.F1 == ((Long) objArr[2]).longValue()) {
                this.R1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                h1(true);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.jl0 jl0Var = this.f41651j0;
            if (jl0Var != null) {
                int childCount = jl0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f41651j0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.p2) {
                        ((org.telegram.ui.Cells.p2) childAt).b0(0, true);
                    }
                }
            }
        } else if (i10 == NotificationCenter.invalidateMotionBackground) {
            jb1 jb1Var = this.f41664q0;
            if (jb1Var != null) {
                jb1Var.f1();
            }
        } else if (i10 == NotificationCenter.didSetNewWallpapper) {
            if (this.f41662p0 != null) {
                b1(true);
            }
        } else if (i10 == NotificationCenter.wallpapersNeedReload) {
            Object obj = this.f41683x1;
            if (obj instanceof ai1) {
                ai1 ai1Var = (ai1) obj;
                if (ai1Var.f36557a == null) {
                    ai1Var.f36557a = (String) objArr[0];
                }
            }
        } else {
            long j10 = 0;
            if (i10 == NotificationCenter.wallpapersDidLoad) {
                ArrayList arrayList = (ArrayList) objArr[0];
                this.Q0.clear();
                HashMap hashMap = this.R0;
                hashMap.clear();
                int size = arrayList.size();
                boolean z10 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i13);
                    if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                        TLRPC.Document document = wallPaper.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f22398id))) {
                            this.Q0.add(wallPaper);
                            hashMap.put(Long.valueOf(wallPaper.document.f22398id), wallPaper);
                        }
                        org.telegram.ui.ActionBar.e6 e6Var = this.f41669s;
                        if (e6Var != null && (str = e6Var.f22914o) != null && str.equals(wallPaper.slug)) {
                            this.S0 = (TLRPC.TL_wallPaper) wallPaper;
                            b1(false);
                            j1();
                        } else if (e6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper2 = this.S0;
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
                if (!z10 && (tL_wallPaper = this.S0) != null) {
                    this.Q0.add(0, tL_wallPaper);
                }
                oc1 oc1Var = this.M0;
                if (oc1Var != null) {
                    oc1Var.l();
                }
                int size2 = arrayList.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i14);
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        j10 = MediaDataController.calcHash(j10, wallPaper2.f22544id);
                    }
                }
                TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
                getwallpapers.hash = j10;
                ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new hb1(this, 1)), this.classGuid);
            } else if (i10 == NotificationCenter.wallpaperSettedToUser && this.F1 != 0) {
                finishFragment();
            }
        }
    }

    public final void e1() {
        if (this.f41662p0 != null && this.G0 != null && this.f41669s.f22907g != 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("bganimationhint", false)) {
                if (this.f41679w0 == null) {
                    org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(getParentActivity(), 8);
                    this.f41679w0 = g40Var;
                    g40Var.setShowingDuration(5000L);
                    this.f41679w0.setAlpha(0.0f);
                    this.f41679w0.setVisibility(4);
                    this.f41679w0.setText(LocaleController.getString(R.string.BackgroundAnimateInfo));
                    this.f41679w0.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                    this.f41645g0.addView(this.f41679w0, i7.f6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                AndroidUtilities.runOnUIThread(new t31(10, this, globalMainSettings), 500L);
            }
        }
    }

    public final void f1(int i10, boolean z10, boolean z11) {
        boolean z12;
        char c3;
        char c6;
        FrameLayout frameLayout;
        float f9;
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
        char c10 = 0;
        if (z10 && i10 == 1 && this.S0 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i17 = this.f41626b;
        if (z10) {
            if (i10 == 0) {
                if (i17 == 2) {
                    this.W0 = this.V0;
                    int i18 = this.X0;
                    this.f41625a1 = i18;
                    int i19 = this.Y0;
                    this.f41628b1 = i19;
                    int i20 = this.Z0;
                    this.f41632c1 = i20;
                    this.f41639e1 = this.K;
                    if (i20 != 0) {
                        i16 = 4;
                    } else if (i19 != 0) {
                        i16 = 3;
                    } else if (i18 != 0) {
                        i16 = 2;
                    } else {
                        i16 = 1;
                    }
                    this.R.f(0, 4, i16, false);
                    this.R.e(this.Z0, 3);
                    this.R.e(this.Y0, 2);
                    this.R.e(this.X0, 1);
                    this.R.e(this.V0, 0);
                }
            } else {
                this.T0 = this.S0;
                this.f41650i1 = this.f41648h1;
                this.M0.l();
                ArrayList arrayList = this.Q0;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.S0;
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
                    this.N0.h1(i15, (this.L0.getMeasuredWidth() - AndroidUtilities.dp(124.0f)) / 2);
                }
            }
        }
        if (i17 == 1 || i17 == 2) {
            org.telegram.ui.Components.a81[] a81VarArr = this.F0;
            if (z12) {
                c3 = 2;
            } else {
                c3 = 0;
            }
            a81VarArr[c3].setVisibility(0);
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.j0 j0Var = this.P0;
            if (!j0Var.H) {
                float f19 = this.f41648h1;
                if (f19 < 0.0f) {
                    float f20 = -f19;
                    this.f41648h1 = f20;
                    j0Var.setProgress(f20);
                }
            }
        }
        int i21 = 58;
        float f21 = 1.0f;
        FrameLayout[] frameLayoutArr = this.H0;
        if (z11) {
            this.f41659n1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            if (i10 == 0) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            if (z10) {
                frameLayoutArr[i10].setVisibility(0);
                if (i17 == 1) {
                    jb1 jb1Var = this.f41664q0;
                    Property property = View.TRANSLATION_Y;
                    if (i10 == 1) {
                        f16 = -AndroidUtilities.dp(21.0f);
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(jb1Var, property, f16));
                    org.telegram.ui.Components.a81 a81Var = this.F0[2];
                    Property property2 = View.ALPHA;
                    if (z12) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(a81Var, property2, f17));
                    org.telegram.ui.Components.a81 a81Var2 = this.F0[0];
                    if (z12) {
                        f18 = 0.0f;
                    } else {
                        f18 = 1.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(a81Var2, property2, f18));
                    if (i10 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property2, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i12], property2, 0.0f));
                    }
                    AndroidUtilities.hideKeyboard(this.R.A[1]);
                } else if (i17 == 2) {
                    jb1 jb1Var2 = this.f41664q0;
                    Property property3 = View.TRANSLATION_Y;
                    int i22 = -frameLayoutArr[i10].getMeasuredHeight();
                    if (this.f41680w1 == null) {
                        i21 = 0;
                    }
                    int dp = AndroidUtilities.dp(i21 + 72) + i22;
                    if (U0()) {
                        i13 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i13 = 0;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(jb1Var2, property3, dp + i13));
                    org.telegram.ui.Components.a81 a81Var3 = this.F0[2];
                    Property property4 = View.ALPHA;
                    if (z12) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(a81Var3, property4, f15));
                    org.telegram.ui.Components.a81 a81Var4 = this.F0[0];
                    if (z12) {
                        f21 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(a81Var4, property4, f21));
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
                    AndroidUtilities.hideKeyboard(this.R.A[1]);
                }
            } else {
                jb1 jb1Var3 = this.f41664q0;
                Property property5 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(jb1Var3, property5, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property5, frameLayout2.getMeasuredHeight()));
                org.telegram.ui.Components.a81 a81Var5 = this.F0[0];
                Property property6 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(a81Var5, property6, 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.F0[2], property6, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.f41672t0, property6, 1.0f));
            }
            this.f41659n1.playTogether(arrayList2);
            this.f41659n1.addListener(new wb1(this, z10, i12, i10, z12));
            this.f41659n1.setInterpolator(org.telegram.ui.Components.jr.f29801g);
            this.f41659n1.setDuration(200L);
            this.f41659n1.start();
            return;
        }
        if (i10 == 0) {
            c6 = 1;
        } else {
            c6 = 0;
        }
        if (z10) {
            frameLayoutArr[i10].setVisibility(0);
            if (i17 == 1) {
                jb1 jb1Var4 = this.f41664q0;
                if (i10 == 1) {
                    f12 = -AndroidUtilities.dp(21.0f);
                } else {
                    f12 = 0.0f;
                }
                jb1Var4.setTranslationY(f12);
                org.telegram.ui.Components.a81 a81Var6 = this.F0[2];
                if (z12) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                a81Var6.setAlpha(f13);
                org.telegram.ui.Components.a81 a81Var7 = this.F0[0];
                if (z12) {
                    f14 = 0.0f;
                } else {
                    f14 = 1.0f;
                }
                a81Var7.setAlpha(f14);
                if (i10 == 1) {
                    frameLayoutArr[i10].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    frameLayoutArr[c6].setAlpha(0.0f);
                }
                AndroidUtilities.hideKeyboard(this.R.A[1]);
            } else if (i17 == 2) {
                jb1 jb1Var5 = this.f41664q0;
                if (i10 == 0) {
                    f9 = 343.0f;
                } else {
                    f9 = 316.0f;
                }
                int i23 = -AndroidUtilities.dp(f9);
                if (this.f41680w1 == null) {
                    i21 = 0;
                }
                int dp2 = AndroidUtilities.dp(i21 + 72) + i23;
                if (U0()) {
                    i11 = AndroidUtilities.navigationBarHeight;
                } else {
                    i11 = 0;
                }
                jb1Var5.setTranslationY(dp2 + i11);
                org.telegram.ui.Components.a81 a81Var8 = this.F0[2];
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                a81Var8.setAlpha(f10);
                org.telegram.ui.Components.a81 a81Var9 = this.F0[0];
                if (z12) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                a81Var9.setAlpha(f11);
                if (frameLayoutArr[c6].getVisibility() == 0) {
                    frameLayoutArr[c6].setAlpha(0.0f);
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
                    frameLayoutArr[c6].setAlpha(0.0f);
                }
                AndroidUtilities.hideKeyboard(this.R.A[1]);
            }
        } else {
            this.f41664q0.setTranslationY(0.0f);
            frameLayoutArr[i10].setTranslationY(frameLayout.getMeasuredHeight());
            this.F0[0].setAlpha(1.0f);
            this.F0[2].setAlpha(1.0f);
            this.f41672t0.setAlpha(1.0f);
        }
        if (z10 && frameLayoutArr[c6].getVisibility() == 0) {
            frameLayoutArr[c6].setAlpha(1.0f);
            frameLayoutArr[c6].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        if (i17 != 1 && i17 != 2) {
            if (i10 == 1) {
                frameLayoutArr[c6].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.a81[] a81VarArr2 = this.F0;
        if (!z12) {
            c10 = 2;
        }
        a81VarArr2[c10].setVisibility(4);
    }

    public final void g1() {
        Window window;
        if (this.f41636d2 != null) {
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
        this.K1.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.K1.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        this.K1.getLocationInWindow(iArr);
        float f9 = iArr[0];
        float f10 = iArr[1];
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        fc fcVar = new fc(this, getParentActivity(), canvas, (this.K1.getMeasuredWidth() / 2.0f) + f9, (this.K1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f9, f10, 2);
        this.f41636d2 = fcVar;
        fcVar.setOnTouchListener(new mh.d(2));
        this.f41640e2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f41644f2 = ofFloat;
        ofFloat.addUpdateListener(new nh.qa(this, 3));
        this.f41644f2.addListener(new tb1(this, 4));
        this.f41644f2.setDuration(400L);
        this.f41644f2.setInterpolator(org.telegram.ui.Components.ct.f27567e);
        this.f41644f2.start();
        frameLayout.addView(this.f41636d2, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new bb1(this, 2));
    }

    @Override
    public final int getObserverTag() {
        return this.f41663p1;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.f41623a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.H1) {
            return S0();
        }
        return super.getThemeDescriptions();
    }

    public final void h1(boolean z10) {
        int i10 = (this.F1 > 0L ? 1 : (this.F1 == 0L ? 0 : -1));
        if (i10 > 0) {
            this.f41677v1.d(LocaleController.getString(R.string.ApplyWallpaperForMe));
        } else if (i10 < 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.F1));
            if (chat != null) {
                this.f41677v1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, chat.title));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.R1;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                    if (this.f41656m1 == null) {
                        org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(R.drawable.mini_switch_lock, 0);
                        this.f41656m1 = iqVar;
                        iqVar.setTopOffset(1);
                    }
                    spannableStringBuilder.setSpan(this.f41656m1, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", R0(), new Object[0]));
                    this.f41677v1.c(spannableStringBuilder, z10);
                    return;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.R1;
                if (tL_premium_boostsStatus2 == null) {
                    if (this.F1 < 0 && !this.P1 && !this.Q1 && tL_premium_boostsStatus2 == null) {
                        this.P1 = true;
                        getMessagesController().getBoostsController().getBoostsStats(this.F1, new gb1(this, 0));
                        return;
                    }
                    return;
                }
                this.f41677v1.c(null, z10);
                return;
            }
            this.f41677v1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, LocaleController.getString(R.string.AccDescrChannel).toLowerCase()));
        } else {
            this.f41677v1.d(LocaleController.getString(R.string.ApplyWallpaper));
        }
    }

    public final void i1() {
        if (this.B1 && this.f41671s1 == null) {
            Bitmap bitmap = this.f41686y1;
            if (bitmap != null) {
                this.f41673t1 = bitmap;
                this.f41671s1 = Utilities.blurWallpaper(bitmap);
            } else {
                ImageReceiver imageReceiver = this.f41672t0.getImageReceiver();
                if (imageReceiver.hasNotThumb() || imageReceiver.hasStaticThumb()) {
                    this.f41673t1 = imageReceiver.getBitmap();
                    this.f41671s1 = Utilities.blurWallpaper(imageReceiver.getBitmap());
                }
            }
        }
        if (this.B1) {
            Bitmap bitmap2 = this.f41671s1;
            if (bitmap2 != null) {
                this.f41672t0.setImageBitmap(bitmap2);
                return;
            }
            return;
        }
        b1(false);
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.f41626b == 2) {
            if (this.W1 && motionEvent != null) {
                if (motionEvent.getY() > org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) {
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
        float f9;
        FrameLayout frameLayout;
        float f10;
        Object obj = this.S0;
        if (obj == null) {
            obj = this.f41683x1;
        }
        boolean z10 = obj instanceof TLRPC.TL_wallPaper;
        if (z10 || (obj instanceof MediaController.SearchImage)) {
            if (z10) {
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
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.D1, true);
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
            int i11 = this.f41626b;
            if (exists) {
                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                this.f41672t0.invalidate();
                if (i11 == 2) {
                    if (j10 != 0 && this.F1 == 0) {
                        this.f41660o0.setSubtitle(AndroidUtilities.formatFileSize(j10));
                    } else {
                        this.f41660o0.setSubtitle(null);
                    }
                }
            } else {
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(str, null, this);
                if (i11 == 2 && this.F1 == 0) {
                    this.f41660o0.setSubtitle(LocaleController.getString(R.string.LoadingFullImage));
                }
                this.f41672t0.invalidate();
            }
            float f11 = 0.5f;
            if (this.S0 == null && (frameLayout = this.f41674u0) != null) {
                if (exists) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                frameLayout.setAlpha(f10);
            }
            if (i11 == 0) {
                this.Y.setEnabled(exists);
                TextView textView = this.Y;
                if (exists) {
                    f11 = 1.0f;
                }
                textView.setAlpha(f11);
            } else if (i11 == 2) {
                this.f41685y0.setEnabled(exists);
                gc1 gc1Var = this.f41677v1;
                if (gc1Var != null) {
                    if (exists) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.5f;
                    }
                    gc1Var.setAlpha(f9);
                }
                gc1 gc1Var2 = this.f41680w1;
                if (gc1Var2 != null) {
                    if (exists) {
                        f11 = 1.0f;
                    }
                    gc1Var2.setAlpha(f11);
                }
            } else {
                this.f41641f.setEnabled(exists);
                org.telegram.ui.ActionBar.w0 w0Var = this.f41641f;
                if (exists) {
                    f11 = 1.0f;
                }
                w0Var.setAlpha(f11);
            }
        }
    }

    public final void k1() {
        this.f41672t0.getImageReceiver().setAlpha(Math.abs(this.f41648h1));
        this.f41672t0.invalidate();
        this.L0.f1();
        if (this.f41648h1 >= 0.0f) {
            this.f41672t0.getImageReceiver().setGradientBitmap(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f41672t0.getImageReceiver().setBlendMode(null);
            }
            if (this.f41672t0.getBackground() instanceof org.telegram.ui.Components.yb0) {
                this.f41672t0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.yb0) this.f41672t0.getBackground()).f35026k);
            }
        }
        this.f41623a.b(this.f41672t0.getBackground(), this.f41672t0.getBackground(), Float.valueOf(this.f41648h1));
        V0();
    }

    public final void l1() {
        char c3;
        float f9;
        boolean z10;
        boolean z11;
        float f10;
        float f11 = 1.0f;
        float f12 = 0.0f;
        int i10 = this.f41626b;
        if (i10 != 1 && i10 != 2) {
            boolean isEnabled = this.F0[0].isEnabled();
            TLRPC.TL_wallPaper tL_wallPaper = this.S0;
            if (tL_wallPaper != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (isEnabled == z10) {
                return;
            }
            if (tL_wallPaper == null) {
                this.F0[0].a(false, true);
            }
            org.telegram.ui.Components.a81 a81Var = this.F0[0];
            if (this.S0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            a81Var.setEnabled(z11);
            if (this.S0 != null) {
                this.F0[0].setVisibility(0);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            int dp = (AndroidUtilities.dp(9.0f) + ((FrameLayout.LayoutParams) this.F0[1].getLayoutParams()).width) / 2;
            org.telegram.ui.Components.a81 a81Var2 = this.F0[0];
            Property property = View.ALPHA;
            if (this.S0 == null) {
                f11 = 0.0f;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(a81Var2, property, f11));
            org.telegram.ui.Components.a81 a81Var3 = this.F0[0];
            Property property2 = View.TRANSLATION_X;
            if (this.S0 != null) {
                f10 = 0.0f;
            } else {
                f10 = dp;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(a81Var3, property2, f10));
            org.telegram.ui.Components.a81 a81Var4 = this.F0[1];
            if (this.S0 == null) {
                f12 = -dp;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(a81Var4, property2, f12));
            animatorSet.setInterpolator(org.telegram.ui.Components.jr.f29801g);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new vb1(this));
            animatorSet.start();
            return;
        }
        if (this.S0 == null && (this.f41683x1 instanceof zh1)) {
            this.F0[2].a(false, true);
        }
        org.telegram.ui.Components.a81[] a81VarArr = this.F0;
        if (this.S0 != null) {
            c3 = 2;
        } else {
            c3 = 0;
        }
        a81VarArr[c3].setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        org.telegram.ui.Components.a81 a81Var5 = this.F0[2];
        Property property3 = View.ALPHA;
        if (this.S0 != null) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a81Var5, property3, f9);
        org.telegram.ui.Components.a81 a81Var6 = this.F0[0];
        if (this.S0 != null) {
            f11 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(a81Var6, property3, f11));
        animatorSet2.addListener(new ub1(this));
        animatorSet2.setInterpolator(org.telegram.ui.Components.jr.f29801g);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }

    public final void m1(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qc1.m1(boolean):void");
    }

    public final void n1() {
        int childCount = this.L0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.L0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.i5) {
                ((org.telegram.ui.Cells.i5) childAt).u(true);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!Q0(z10)) {
            return false;
        }
        O0(true);
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBottomSheetCreated() {
        super.onBottomSheetCreated();
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && b5Var.getBottomSheet() != null) {
            this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5));
            if (this.f41626b == 2 && this.F1 != 0) {
                this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        j1();
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.invalidateMotionBackground);
        getNotificationCenter().addObserver(this, NotificationCenter.wallpaperSettedToUser);
        int i10 = this.f41626b;
        if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 == 2 || i10 == 1) {
            org.telegram.ui.ActionBar.g6.N = true;
        }
        if (i10 == 0 && this.f41669s == null) {
            this.A1 = org.telegram.ui.ActionBar.g6.f23146i0;
        } else {
            Point point = AndroidUtilities.displaySize;
            int min = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            int max = Math.max(point2.x, point2.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / AndroidUtilities.density));
            sb2.append("_");
            this.C1 = a4.w.l((int) (max / AndroidUtilities.density), "_f", sb2);
            Point point3 = AndroidUtilities.displaySize;
            this.D1 = Math.max(point3.x, point3.y);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            this.f41663p1 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
            if (this.Q0 == null) {
                this.Q0 = new ArrayList();
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
        bg.d1 d1Var = this.f41645g0;
        if (d1Var != null && this.M != null) {
            d1Var.getViewTreeObserver().removeOnGlobalLayoutListener(this.M);
        }
        int i10 = this.f41626b;
        if ((i10 == 2 || i10 == 1) && this.l1 == null) {
            AndroidUtilities.runOnUIThread(new ef0(8));
        }
        if (i10 == 2) {
            Bitmap bitmap = this.f41671s1;
            if (bitmap != null) {
                bitmap.recycle();
                this.f41671s1 = null;
            }
            this.f41623a.b(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        } else if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 != 0 || this.f41669s != null) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
        }
        super.onFragmentDestroy();
        P0(null);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.A1) {
            this.f41668r1.c(false);
        }
        org.telegram.ui.ActionBar.g6.f23020b = false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        ic1 ic1Var = this.f41653k0;
        if (ic1Var != null) {
            ic1Var.l();
        }
        mc1 mc1Var = this.f41667r0;
        if (mc1Var != null) {
            mc1Var.l();
        }
        if (this.A1) {
            this.f41668r1.c(true);
        }
        org.telegram.ui.ActionBar.g6.f23020b = true;
    }

    @Override
    public final void onSuccessDownload(String str) {
        j1();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (!z10 && this.f41626b == 2) {
            this.f41623a.b(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.c6 c6Var) {
        this.f41623a.f41354a = c6Var;
    }

    public qc1(org.telegram.ui.ActionBar.f6 f6Var, boolean z10, int i10, boolean z11, boolean z12) {
        super(null);
        this.f41623a = new pb1(this);
        this.d = true;
        this.f41657n = 1;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(this, 0, false);
        this.N = n5Var;
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(this, 0, true);
        this.O = n5Var2;
        org.telegram.ui.ActionBar.n5 n5Var3 = new org.telegram.ui.ActionBar.n5(this, 1, false);
        this.P = n5Var3;
        org.telegram.ui.ActionBar.n5 n5Var4 = new org.telegram.ui.ActionBar.n5(this, 1, true);
        this.Q = n5Var4;
        this.T = -1;
        this.U = new bb1(this, 0);
        this.f41670s0 = new fc1[2];
        this.H0 = new FrameLayout[2];
        this.I0 = new TextView[2];
        this.J0 = new TextView[2];
        this.K0 = new FrameLayout[2];
        this.R0 = new HashMap();
        this.f41648h1 = 0.5f;
        this.f41652j1 = 0.0f;
        this.f41661o1 = PorterDuff.Mode.SRC_IN;
        this.f41675u1 = 1.0f;
        this.C1 = "640_360";
        this.D1 = 1920;
        this.G1 = true;
        this.O1 = new org.telegram.ui.Components.f20(getParentActivity(), new rb1(this));
        this.P1 = false;
        this.Q1 = false;
        this.f41626b = i10;
        this.f41627b0 = z12;
        this.f41624a0 = f6Var;
        this.f41634d0 = z10;
        this.f41631c0 = z11;
        if (i10 == 1) {
            org.telegram.ui.ActionBar.e6 k9 = f6Var.k(!z11);
            this.f41669s = k9;
            if (k9 != null) {
                this.d = false;
                this.f41678w = k9.f22904c;
                this.f41681x = k9.d;
                this.f41684y = k9.f22905e;
                this.A = k9.f22906f;
                this.B = k9.f22907g;
                this.C = k9.h;
                this.D = k9.f22908i;
                this.E = k9.f22909j;
                this.F = k9.f22910k;
                this.G = k9.f22911l;
                this.H = k9.f22912m;
                this.I = k9.f22915p;
                this.J = k9.f22914o;
                this.K = k9.f22913n;
            }
        } else {
            if (i10 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.e6 k10 = f6Var.k(false);
            this.f41669s = k10;
            if (k10 != null) {
                this.S0 = k10.f22918s;
            }
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f41669s;
        if (e6Var != null) {
            this.A1 = e6Var.f22916q;
            if (!TextUtils.isEmpty(e6Var.f22914o)) {
                this.f41648h1 = this.f41669s.f22915p;
            }
            org.telegram.ui.ActionBar.g6.M = org.telegram.ui.ActionBar.g6.A0();
            org.telegram.ui.ActionBar.g6.O = true;
            org.telegram.ui.ActionBar.g6.P = true;
            org.telegram.ui.ActionBar.g6.t(f6Var, false, false);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.goingToPreviewTheme, new Object[0]);
        n5Var.v = true;
        n5Var3.v = true;
        n5Var2.v = true;
        n5Var4.v = true;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
    }

    public qc1(org.telegram.ui.ActionBar.f6 f6Var) {
        this(f6Var, false, 0, false, false);
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
