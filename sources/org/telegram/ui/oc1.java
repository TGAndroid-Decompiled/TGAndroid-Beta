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
public class oc1 extends org.telegram.ui.ActionBar.o2 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public final int A;
    public mb1 A0;
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
    public nc1 E1;
    public final long F;
    public org.telegram.ui.Components.o71[] F0;
    public long F1;
    public final long G;
    public org.telegram.ui.Components.o71[] G0;
    public boolean G1;
    public final long H;
    public final FrameLayout[] H0;
    public boolean H1;
    public final float I;
    public final TextView[] I0;
    public boolean I1;
    public final String J;
    public final TextView[] J0;
    public org.telegram.ui.Components.mi0 J1;
    public final int K;
    public final FrameLayout[] K0;
    public org.telegram.ui.ActionBar.w0 K1;
    public long L;
    public va1 L0;
    public ValueAnimator L1;
    public l90 M;
    public mc1 M0;
    public bh.g M1;
    public final org.telegram.ui.ActionBar.n5 N;
    public f2.m0 N0;
    public lb1 N1;
    public final org.telegram.ui.ActionBar.n5 O;
    public org.telegram.ui.Cells.m4 O0;
    public final org.telegram.ui.Components.u10 O1;
    public final org.telegram.ui.ActionBar.n5 P;
    public org.telegram.ui.Cells.j0 P0;
    public boolean P1;
    public final org.telegram.ui.ActionBar.n5 Q;
    public ArrayList Q0;
    public boolean Q1;
    public org.telegram.ui.Components.cq R;
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
    public kh.h6 W;
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
    public final ob1 f41056a;
    public final org.telegram.ui.ActionBar.e6 f41057a0;
    public int f41058a1;
    public TextView a2;
    public final int f41059b;
    public final boolean f41060b0;
    public int f41061b1;
    public WeakReference f41062b2;
    public Scroller f41063c;
    public final boolean f41064c0;
    public int f41065c1;
    public BitmapDrawable f41066c2;
    public final boolean d;
    public final boolean f41067d0;
    public int f41068d1;
    public gc f41069d2;
    public org.telegram.ui.Components.pl f41070e;
    public ArrayList f41071e0;
    public int f41072e1;
    public float f41073e2;
    public org.telegram.ui.ActionBar.w0 f41074f;
    public m2.g f41075f0;
    public int f41076f1;
    public ValueAnimator f41077f2;
    public fh.v f41078g0;
    public int f41079g1;
    public TextView h;
    public UndoView f41080h0;
    public float f41081h1;
    public FrameLayout f41082i0;
    public float f41083i1;
    public org.telegram.ui.Components.wk0 f41084j0;
    public float f41085j1;
    public gc1 f41086k0;
    public float f41087k1;
    public org.telegram.ui.Components.j10 f41088l0;
    public fc1 l1;
    public MessageObject m0;
    public org.telegram.ui.Components.eq f41089m1;
    public int f41090n;
    public boolean f41091n0;
    public AnimatorSet f41092n1;
    public org.telegram.ui.ActionBar.k f41093o0;
    public final PorterDuff.Mode f41094o1;
    public org.telegram.ui.ActionBar.r0 f41095p0;
    public int f41096p1;
    public ib1 f41097q0;
    public org.telegram.ui.Components.i9 f41098q1;
    public Drawable f41099r;
    public kc1 f41100r0;
    public org.telegram.ui.Components.q71 f41101r1;
    public final org.telegram.ui.ActionBar.d6 f41102s;
    public final dc1[] f41103s0;
    public Bitmap f41104s1;
    public dc1 f41105t0;
    public Bitmap f41106t1;
    public FrameLayout f41107u0;
    public float f41108u1;
    public boolean v;
    public FrameLayout f41109v0;
    public ec1 f41110v1;
    public final int f41111w;
    public org.telegram.ui.Components.s30 f41112w0;
    public ec1 f41113w1;
    public final int f41114x;
    public AnimatorSet f41115x0;
    public Object f41116x1;
    public final int f41117y;
    public t4 f41118y0;
    public Bitmap f41119y1;
    public mb1 f41120z0;
    public boolean f41121z1;

    public oc1(Object obj, Bitmap bitmap, boolean z10) {
        super(null);
        this.f41056a = new ob1(this);
        this.d = true;
        this.f41090n = 1;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(this, 0, false);
        this.N = n5Var;
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(this, 0, true);
        this.O = n5Var2;
        org.telegram.ui.ActionBar.n5 n5Var3 = new org.telegram.ui.ActionBar.n5(this, 1, false);
        this.P = n5Var3;
        org.telegram.ui.ActionBar.n5 n5Var4 = new org.telegram.ui.ActionBar.n5(this, 1, true);
        this.Q = n5Var4;
        this.T = -1;
        this.U = new ab1(this, 0);
        this.f41103s0 = new dc1[2];
        this.H0 = new FrameLayout[2];
        this.I0 = new TextView[2];
        this.J0 = new TextView[2];
        this.K0 = new FrameLayout[2];
        this.R0 = new HashMap();
        this.f41081h1 = 0.5f;
        this.f41085j1 = 0.0f;
        this.f41094o1 = PorterDuff.Mode.SRC_IN;
        this.f41108u1 = 1.0f;
        this.C1 = "640_360";
        this.D1 = 1920;
        this.G1 = true;
        this.O1 = new org.telegram.ui.Components.u10(getParentActivity(), new qb1(this));
        this.P1 = false;
        this.Q1 = false;
        this.f41059b = 2;
        this.f41116x1 = obj;
        this.f41119y1 = bitmap;
        this.f41121z1 = z10;
        if (obj instanceof xh1) {
            xh1 xh1Var = (xh1) obj;
            this.A1 = xh1Var.f44527j;
            TLRPC.TL_wallPaper tL_wallPaper = xh1Var.f44525g;
            this.S0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f10 = xh1Var.h;
                this.f41081h1 = f10;
                if (f10 < 0.0f && !org.telegram.ui.ActionBar.f6.I.q()) {
                    this.f41081h1 *= -1.0f;
                }
            }
        }
        n5Var.v = true;
        n5Var3.v = true;
        n5Var2.v = true;
        n5Var4.v = true;
    }

    public static void T(oc1 oc1Var) {
        org.telegram.ui.ActionBar.d6 k10;
        org.telegram.ui.ActionBar.e6 e6Var = org.telegram.ui.ActionBar.f6.M;
        if (e6Var == null) {
            return;
        }
        int i9 = e6Var.V;
        if (i9 >= 0) {
            k10 = (org.telegram.ui.ActionBar.d6) e6Var.W.get(i9);
        } else {
            k10 = e6Var.k(false);
        }
        if (oc1Var.f41102s != null) {
            oc1Var.W0();
            org.telegram.ui.ActionBar.f6.t1(oc1Var.f41057a0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.f6.M != null) {
                org.telegram.ui.ActionBar.f6.O = false;
                org.telegram.ui.ActionBar.f6.P = false;
                org.telegram.ui.ActionBar.f6.M = null;
            }
            org.telegram.ui.ActionBar.f6.t(oc1Var.f41057a0, true, oc1Var.f41060b0);
            ((ActionBarLayout) oc1Var.parentLayout).U(false, false);
        } else {
            ((ActionBarLayout) oc1Var.parentLayout).U(false, false);
            File file = new File(oc1Var.f41057a0.f22908b);
            org.telegram.ui.ActionBar.e6 e6Var2 = oc1Var.f41057a0;
            org.telegram.ui.ActionBar.f6.u(file, e6Var2.f22906a, e6Var2.B, false);
            MessagesController.getInstance(oc1Var.f41057a0.A).saveTheme(oc1Var.f41057a0, null, false, false);
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", oc1Var.f41057a0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) oc1Var.getParentLayout().getFragmentStack().get(Math.max(0, oc1Var.getParentLayout().getFragmentStack().size() - 2));
        oc1Var.finishFragment();
        if (oc1Var.f41059b == 0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didApplyNewTheme, e6Var, k10, Boolean.valueOf(oc1Var.f41067d0));
        }
        org.telegram.ui.ActionBar.f6.F1(o2Var);
    }

    public static void U(oc1 oc1Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = oc1Var.R0;
        org.telegram.ui.ActionBar.d6 d6Var = oc1Var.f41102s;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            oc1Var.Q0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z10 = false;
            for (int i9 = 0; i9 < size; i9++) {
                if (tL_wallPapers.wallpapers.get(i9) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i9);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f22386id))) {
                            oc1Var.Q0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.f22386id), tL_wallPaper2);
                        }
                        if (d6Var != null && (str = d6Var.f22878o) != null && str.equals(tL_wallPaper2.slug)) {
                            oc1Var.S0 = tL_wallPaper2;
                            oc1Var.b1(false);
                            oc1Var.j1();
                        } else if (d6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = oc1Var.S0;
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
            if (!z10 && (tL_wallPaper = oc1Var.S0) != null) {
                oc1Var.Q0.add(0, tL_wallPaper);
            }
            mc1 mc1Var = oc1Var.M0;
            if (mc1Var != null) {
                mc1Var.l();
            }
            MessagesStorage.getInstance(oc1Var.currentAccount).putWallpapers(tL_wallPapers.wallpapers, 1);
        }
        if (oc1Var.S0 == null && d6Var != null && !TextUtils.isEmpty(d6Var.f22878o)) {
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = d6Var.f22878o;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(oc1Var.currentAccount).bindRequestToGuid(oc1Var.getConnectionsManager().sendRequest(getwallpaper, new gb1(oc1Var, 0)), oc1Var.classGuid);
        }
    }

    public static void V(oc1 oc1Var) {
        org.telegram.ui.Components.pl plVar = oc1Var.f41070e;
        int i9 = 0;
        if (plVar != null) {
            plVar.B(oc1Var.getThemedColor(org.telegram.ui.ActionBar.f6.G8));
            oc1Var.f41070e.G(oc1Var.getThemedColor(org.telegram.ui.ActionBar.f6.E8), false);
        }
        Drawable drawable = oc1Var.f41099r;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(oc1Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6), PorterDuff.Mode.MULTIPLY));
        }
        t4 t4Var = oc1Var.f41118y0;
        if (t4Var != null) {
            t4Var.invalidate();
        }
        if (oc1Var.l1 != null) {
            org.telegram.ui.ActionBar.b5 b5Var = oc1Var.parentLayout;
            if (b5Var != null && b5Var.getBottomSheet() != null) {
                oc1Var.parentLayout.getBottomSheet().fixNavigationBar(oc1Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5));
                if (oc1Var.f41059b == 2 && oc1Var.F1 != 0) {
                    oc1Var.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            } else {
                oc1Var.setNavigationBarColor(oc1Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5));
            }
        }
        if (oc1Var.F0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.o71[] o71VarArr = oc1Var.F0;
                if (i10 >= o71VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.o71 o71Var = o71VarArr[i10];
                if (o71Var != null) {
                    o71Var.invalidate();
                }
                i10++;
            }
        }
        if (oc1Var.G0 != null) {
            while (true) {
                org.telegram.ui.Components.o71[] o71VarArr2 = oc1Var.G0;
                if (i9 >= o71VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.o71 o71Var2 = o71VarArr2[i9];
                if (o71Var2 != null) {
                    o71Var2.invalidate();
                }
                i9++;
            }
        }
        TextView textView = oc1Var.a2;
        if (textView != null) {
            textView.setTextColor(oc1Var.getThemedColor(org.telegram.ui.ActionBar.f6.G6));
        }
        org.telegram.ui.Components.cq cqVar = oc1Var.R;
        if (cqVar != null) {
            cqVar.invalidate();
        }
        org.telegram.ui.Components.j10 j10Var = oc1Var.f41088l0;
        if (j10Var != null) {
            j10Var.g();
        }
    }

    public static void W(oc1 oc1Var, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (oc1Var.getParentActivity() == null) {
            return;
        }
        zf.j0 j0Var = new zf.j0(23, oc1Var.currentAccount, oc1Var.getParentActivity(), oc1Var, oc1Var.f41056a);
        j0Var.G1(canApplyBoost);
        j0Var.F1(oc1Var.R1, true);
        j0Var.H1(oc1Var.F1);
        if (!oc1Var.U0()) {
            j0Var.M0 = new ab1(oc1Var, 1);
        }
        oc1Var.showDialog(j0Var);
    }

    public final void M0() {
        AnimatorSet animatorSet = this.f41115x0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f41115x0 = animatorSet2;
        if (this.A1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f41105t0, View.SCALE_X, this.f41108u1), ObjectAnimator.ofFloat(this.f41105t0, View.SCALE_Y, this.f41108u1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f41105t0, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f41105t0, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f41105t0, View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f41105t0, View.TRANSLATION_Y, 0.0f));
        }
        this.f41115x0.setInterpolator(org.telegram.ui.Components.gr.f28845g);
        this.f41115x0.addListener(new sb1(this, 1));
        this.f41115x0.start();
    }

    public final void N0(boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oc1.N0(boolean):void");
    }

    public final void O0(boolean z10) {
        int i9 = this.f41059b;
        if (i9 == 2) {
            if (!z10) {
                finishFragment();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.f6.o();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        org.telegram.ui.ActionBar.d6 d6Var = this.f41102s;
        if (i9 == 1) {
            if (this.f41064c0) {
                d6Var.f22868c = this.f41111w;
                d6Var.d = this.f41114x;
                d6Var.f22869e = this.f41117y;
                d6Var.f22870f = this.A;
                d6Var.f22871g = this.B;
                d6Var.h = this.C;
                d6Var.f22872i = this.D;
                d6Var.f22873j = this.E;
                d6Var.f22874k = this.F;
                d6Var.f22875l = this.G;
                d6Var.f22876m = this.H;
                d6Var.f22877n = this.K;
                d6Var.f22878o = this.J;
                d6Var.f22879p = this.I;
            }
            org.telegram.ui.ActionBar.f6.t1(this.f41057a0, false, true, false, false, false);
        } else {
            if (d6Var != null) {
                org.telegram.ui.ActionBar.f6.t1(this.f41057a0, false, this.f41067d0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).U(false, false);
            if (this.f41067d0) {
                org.telegram.ui.ActionBar.e6 e6Var = this.f41057a0;
                if (e6Var.f22908b != null && org.telegram.ui.ActionBar.f6.H.get(e6Var.m()) == null) {
                    new File(e6Var.f22908b).delete();
                }
            }
        }
        if (!z10) {
            finishFragment();
        }
    }

    public final BitmapDrawable P0(Drawable drawable) {
        WeakReference weakReference = this.f41062b2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.f41066c2;
        }
        WeakReference weakReference2 = this.f41062b2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f41062b2 = null;
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            this.f41062b2 = new WeakReference(drawable);
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
            this.f41066c2 = bitmapDrawable;
            bitmapDrawable.setFilterBitmap(true);
            return this.f41066c2;
        }
        this.f41066c2 = null;
        return null;
    }

    public final boolean Q0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oc1.Q0(boolean):boolean");
    }

    public final int R0() {
        if (ChatObject.isChannelAndNotMegaGroup(-this.F1, this.currentAccount)) {
            return getMessagesController().channelCustomWallpaperLevelMin;
        }
        return getMessagesController().groupCustomWallpaperLevelMin;
    }

    public final ArrayList S0() {
        sx0 sx0Var = new sx0(7, this);
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f41082i0;
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(frameLayout, 1, null, null, null, sx0Var, i9));
        m2.g gVar = this.f41075f0;
        int i10 = org.telegram.ui.ActionBar.f6.f23269s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(gVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.f6.f23287t8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 256, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.f6.A8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar2, 128, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.f6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.f6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41093o0, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41093o0, 128, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41093o0, 1024, null, null, null, null, org.telegram.ui.ActionBar.f6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41093o0, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41093o0, Integer.MIN_VALUE, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41093o0, 1073741824, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41084j0, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 32768, null, null, null, null, i10));
        if (!this.d) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.X, 1, null, null, null, null, i9));
            TextView textView = this.Z;
            int i13 = org.telegram.ui.ActionBar.f6.Ae;
            arrayList.add(new org.telegram.ui.ActionBar.h6(textView, 4, null, null, null, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.Y, 4, null, null, null, null, i13));
        }
        org.telegram.ui.Components.cq cqVar = this.R;
        if (cqVar != null) {
            org.telegram.ui.ActionBar.w0 w0Var = cqVar.E;
            EditTextBoldCursor[] editTextBoldCursorArr = cqVar.A;
            for (int i14 = 0; i14 < editTextBoldCursorArr.length; i14++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i14];
                int i15 = org.telegram.ui.ActionBar.f6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.h6(editTextBoldCursor, 4, null, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.h6(editTextBoldCursorArr[i14], 16777216, null, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.h6(editTextBoldCursorArr[i14], 8388608, null, null, null, null, org.telegram.ui.ActionBar.f6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(editTextBoldCursorArr[i14], 8390656, null, null, null, null, org.telegram.ui.ActionBar.f6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(editTextBoldCursorArr[i14], 32, null, null, null, null, org.telegram.ui.ActionBar.f6.f23127k6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(editTextBoldCursorArr[i14], 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.f23144l6));
            }
            org.telegram.ui.ActionBar.l0 l0Var = cqVar.B;
            int i16 = org.telegram.ui.ActionBar.f6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.h6(l0Var, 8, null, null, null, null, i16));
            org.telegram.ui.ActionBar.l0 l0Var2 = cqVar.B;
            int i17 = org.telegram.ui.ActionBar.f6.I5;
            arrayList.add(new org.telegram.ui.ActionBar.h6(l0Var2, 32, null, null, null, null, i17));
            if (w0Var != null) {
                org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(cqVar, 3);
                arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var, 0, null, null, null, s6Var, i16));
                arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var, 0, null, null, null, s6Var, i17));
                arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.H0;
        if (frameLayoutArr != null) {
            for (int i18 = 0; i18 < frameLayoutArr.length; i18++) {
                arrayList.add(new org.telegram.ui.ActionBar.h6(frameLayoutArr[i18], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23089i3}, null, org.telegram.ui.ActionBar.f6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.h6(frameLayoutArr[i18], 0, null, org.telegram.ui.ActionBar.f6.f23105j2, null, null, org.telegram.ui.ActionBar.f6.Sd));
            }
            int i19 = 0;
            while (true) {
                FrameLayout[] frameLayoutArr2 = this.K0;
                if (i19 >= frameLayoutArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.h6(frameLayoutArr2[i19], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23089i3}, null, org.telegram.ui.ActionBar.f6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.h6(frameLayoutArr2[i19], 0, null, org.telegram.ui.ActionBar.f6.f23105j2, null, null, org.telegram.ui.ActionBar.f6.Sd));
                i19++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41118y0, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23089i3}, null, org.telegram.ui.ActionBar.f6.Td));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41118y0, 0, null, org.telegram.ui.ActionBar.f6.f23105j2, null, null, org.telegram.ui.ActionBar.f6.Sd));
            int i20 = 0;
            while (true) {
                TextView[] textViewArr = this.J0;
                if (i20 >= textViewArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.h6(textViewArr[i20], 4, null, null, null, null, org.telegram.ui.ActionBar.f6.Ae));
                i20++;
            }
            int i21 = 0;
            while (true) {
                TextView[] textViewArr2 = this.I0;
                if (i21 >= textViewArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.h6(textViewArr2[i21], 4, null, null, null, null, org.telegram.ui.ActionBar.f6.Ae));
                i21++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.P0, 0, new Class[]{org.telegram.ui.Components.pn0.class}, new String[]{"innerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Ti));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.P0, 0, new Class[]{org.telegram.ui.Components.pn0.class}, new String[]{"outerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Vi));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.O0, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23159m3, org.telegram.ui.ActionBar.f6.f23226q3}, null, org.telegram.ui.ActionBar.f6.f23252ra));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23176n3, org.telegram.ui.ActionBar.f6.f23245r3}, null, org.telegram.ui.ActionBar.f6.f23006dc));
            Drawable[] drawableArr = org.telegram.ui.ActionBar.f6.f23159m3.f22864y;
            int i22 = org.telegram.ui.ActionBar.f6.f23289ta;
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr, null, i22));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.f6.f23226q3.f22864y, null, i22));
            org.telegram.ui.ActionBar.n5 n5Var = this.N;
            org.telegram.ui.ActionBar.n5 n5Var2 = this.P;
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{n5Var, n5Var2}, null, org.telegram.ui.ActionBar.f6.Aa));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{n5Var, n5Var2}, null, org.telegram.ui.ActionBar.f6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{n5Var, n5Var2}, null, org.telegram.ui.ActionBar.f6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{n5Var, n5Var2}, null, org.telegram.ui.ActionBar.f6.Fa));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23209p3, org.telegram.ui.ActionBar.f6.f23282t3}, null, org.telegram.ui.ActionBar.f6.Ba));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.f6.f23194o3.f22864y;
            int i23 = org.telegram.ui.ActionBar.f6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr2, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.f6.f23264s3.f22864y, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.ec));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.fc));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23366y3}, null, org.telegram.ui.ActionBar.f6.Ja));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23383z3}, null, org.telegram.ui.ActionBar.f6.Ka));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.A3, org.telegram.ui.ActionBar.f6.C3}, null, org.telegram.ui.ActionBar.f6.La));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.B3, org.telegram.ui.ActionBar.f6.D3}, null, org.telegram.ui.ActionBar.f6.Ma));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.F3, org.telegram.ui.ActionBar.f6.G3}, null, org.telegram.ui.ActionBar.f6.f23273sc));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Uc));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22951ab));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Wc));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22988cb));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Yc));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23005db));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22953ad));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23042fb));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.nd));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23272sb));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23201od));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41097q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23184nb));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.f23072h5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.f23091i5));
        for (int i24 = 0; i24 < arrayList.size(); i24++) {
            ((org.telegram.ui.ActionBar.h6) arrayList.get(i24)).f23506o = this.f41056a;
        }
        return arrayList;
    }

    public final boolean T0(int i9) {
        int B0;
        long j10;
        if (this.f41064c0) {
            return false;
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.f41102s;
        if (i9 == 1 || i9 == 2) {
            long j11 = this.E;
            if (j11 != 0) {
                if (j11 != d6Var.f22873j) {
                    return true;
                }
            } else {
                int B02 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Nd);
                int i10 = (int) d6Var.f22873j;
                if (i10 == 0) {
                    i10 = B02;
                }
                if (i10 != B02) {
                    return true;
                }
            }
            long j12 = this.H;
            long j13 = this.G;
            long j14 = this.F;
            if (j14 == 0 && j13 == 0 && j12 == 0) {
                for (int i11 = 0; i11 < 3; i11++) {
                    if (i11 == 0) {
                        B0 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Od);
                        j10 = d6Var.f22874k;
                    } else if (i11 == 1) {
                        B0 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Pd);
                        j10 = d6Var.f22875l;
                    } else {
                        B0 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Qd);
                        j10 = d6Var.f22876m;
                    }
                    int i12 = (int) j10;
                    if (i12 == 0 && j10 != 0) {
                        i12 = 0;
                    } else if (i12 == 0) {
                        i12 = B0;
                    }
                    if (i12 != B0) {
                        return true;
                    }
                }
            } else if (j14 != d6Var.f22874k || j13 != d6Var.f22875l || j12 != d6Var.f22876m) {
                return true;
            }
            if (d6Var.f22877n != this.K) {
                return true;
            }
        }
        if (i9 == 1 || i9 == 3) {
            if (this.f41111w != d6Var.d) {
                return true;
            }
            int i13 = this.f41117y;
            if (i13 != 0) {
                if (i13 != d6Var.f22869e) {
                    return true;
                }
            } else {
                int i14 = d6Var.f22869e;
                if (i14 != 0 && i14 != d6Var.f22868c) {
                    return true;
                }
            }
            int i15 = this.A;
            if (i15 != 0) {
                if (i15 != d6Var.f22870f) {
                    return true;
                }
            } else if (d6Var.f22870f != 0) {
                return true;
            }
            int i16 = this.B;
            if (i16 != 0) {
                if (i16 != d6Var.f22871g) {
                    return true;
                }
            } else if (d6Var.f22871g != 0) {
                return true;
            }
            int i17 = this.C;
            if (i17 != 0) {
                if (i17 != d6Var.h) {
                    return true;
                }
            } else if (d6Var.h != 0) {
                return true;
            }
            if (this.D != d6Var.f22872i) {
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
        float f10;
        bh.g gVar = this.M1;
        if (gVar != null) {
            gVar.invalidate();
        }
        FrameLayout frameLayout = this.f41107u0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                this.f41107u0.getChildAt(i9).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.f41109v0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                this.f41109v0.getChildAt(i10).invalidate();
            }
        }
        if (this.F0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.o71[] o71VarArr = this.F0;
                if (i11 >= o71VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.o71 o71Var = o71VarArr[i11];
                if (o71Var != null) {
                    if (this.I1) {
                        f10 = this.f41085j1 * this.f41087k1;
                    } else {
                        f10 = 0.0f;
                    }
                    o71Var.setDimAmount(f10);
                    this.F0[i11].invalidate();
                }
                i11++;
            }
        }
        if (this.f41084j0 != null) {
            for (int i12 = 0; i12 < this.f41084j0.getChildCount(); i12++) {
                View childAt = this.f41084j0.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.w0) {
                    d1((org.telegram.ui.Cells.w0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.f41097q0 != null) {
            for (int i13 = 0; i13 < this.f41097q0.getChildCount(); i13++) {
                View childAt2 = this.f41097q0.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                    d1((org.telegram.ui.Cells.w0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        ec1 ec1Var = this.f41110v1;
        if (ec1Var != null) {
            ec1Var.invalidate();
        }
        ec1 ec1Var2 = this.f41113w1;
        if (ec1Var2 != null) {
            ec1Var2.invalidate();
        }
        t4 t4Var = this.f41118y0;
        if (t4Var != null) {
            t4Var.invalidate();
        }
    }

    public final void W0() {
        org.telegram.ui.ActionBar.d6 d6Var = this.f41102s;
        if (d6Var != null && !TextUtils.isEmpty(d6Var.f22878o)) {
            try {
                File d = d6Var.d();
                Drawable background = this.f41105t0.getBackground();
                Bitmap bitmap = this.f41105t0.getImageReceiver().getBitmap();
                if (background instanceof org.telegram.ui.Components.jb0) {
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
                paint.setColorFilter(new PorterDuffColorFilter(this.f41076f1, this.f41094o1));
                paint.setAlpha((int) (this.f41081h1 * 255.0f));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                FileOutputStream fileOutputStream2 = new FileOutputStream(d);
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
                fileOutputStream2.close();
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
    }

    public final void X0() {
        Y0(2, true);
    }

    public final void Y0(int i9, boolean z10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (getParentActivity() != null && this.f41090n != i9 && this.f41092n1 == null && (d6Var = this.f41102s) != null) {
            if (z10 && i9 == 2 && (org.telegram.ui.ActionBar.f6.Z0() || d6Var.f22873j == 4294967296L)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ChangeChatBackground);
                if (org.telegram.ui.ActionBar.f6.Z0() && (!org.telegram.ui.ActionBar.f6.Z0() || org.telegram.ui.ActionBar.f6.I.f22914e0.d == 0)) {
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ChangeWallpaperToColor);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Change), new cb1(this, 7));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                } else {
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ChangeColorToColor);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new cb1(this, 5));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Continue), new cb1(this, 6));
                }
                showDialog(alertDialog$Builder.f22702a);
                return;
            }
            int i17 = this.f41090n;
            this.f41090n = i9;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 == 3) {
                        this.h.setText(LocaleController.getString(R.string.ColorPickerMyMessages));
                        if (d6Var.f22870f != 0) {
                            if (d6Var.h != 0) {
                                i16 = 4;
                            } else if (d6Var.f22871g != 0) {
                                i16 = 3;
                            } else {
                                i16 = 2;
                            }
                        } else {
                            i16 = 1;
                        }
                        org.telegram.ui.Components.cq cqVar = this.R;
                        T0(3);
                        cqVar.f(2, 4, i16, true);
                        this.R.e(d6Var.h, 3);
                        this.R.e(d6Var.f22871g, 2);
                        this.R.e(d6Var.f22870f, 1);
                        org.telegram.ui.Components.cq cqVar2 = this.R;
                        int i18 = d6Var.f22869e;
                        if (i18 == 0) {
                            i18 = d6Var.f22868c;
                        }
                        cqVar2.e(i18, 0);
                        this.G0[1].b(0, d6Var.f22869e);
                        this.G0[1].b(1, d6Var.f22870f);
                        this.G0[1].b(2, d6Var.f22871g);
                        this.G0[1].b(3, d6Var.h);
                        if (d6Var.f22871g != 0) {
                            if (i17 == 1) {
                                this.f41100r0.o(0);
                            } else {
                                this.f41100r0.m(0);
                            }
                        } else if (i17 == 2) {
                            this.f41100r0.u(0);
                        }
                        this.f41097q0.v0(0, AndroidUtilities.dp(60.0f), null);
                        e1();
                    }
                } else {
                    this.h.setText(LocaleController.getString(R.string.ColorPickerBackground));
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.Nd);
                    int i19 = org.telegram.ui.ActionBar.f6.Od;
                    if (org.telegram.ui.ActionBar.f6.c1(i19)) {
                        i11 = getThemedColor(i19);
                    } else {
                        i11 = 0;
                    }
                    int i20 = org.telegram.ui.ActionBar.f6.Pd;
                    if (org.telegram.ui.ActionBar.f6.c1(i20)) {
                        i12 = getThemedColor(i20);
                    } else {
                        i12 = 0;
                    }
                    int i21 = org.telegram.ui.ActionBar.f6.Qd;
                    if (org.telegram.ui.ActionBar.f6.c1(i21)) {
                        i13 = getThemedColor(i21);
                    } else {
                        i13 = 0;
                    }
                    long j10 = d6Var.f22874k;
                    int i22 = (int) j10;
                    if (i22 == 0 && j10 != 0) {
                        i11 = 0;
                    }
                    long j11 = d6Var.f22875l;
                    int i23 = (int) j11;
                    if (i23 == 0 && j11 != 0) {
                        i12 = 0;
                    }
                    long j12 = d6Var.f22876m;
                    int i24 = (int) j12;
                    if (i24 == 0 && j12 != 0) {
                        i13 = 0;
                    }
                    int i25 = (int) d6Var.f22873j;
                    if (i22 == 0 && i11 == 0) {
                        i14 = i23;
                        i15 = 1;
                    } else if (i24 == 0 && i13 == 0) {
                        if (i23 == 0 && i12 == 0) {
                            i14 = i23;
                            i15 = 2;
                        } else {
                            i14 = i23;
                            i15 = 3;
                        }
                    } else {
                        i14 = i23;
                        i15 = 4;
                    }
                    org.telegram.ui.Components.cq cqVar3 = this.R;
                    T0(2);
                    cqVar3.f(2, 4, i15, false);
                    org.telegram.ui.Components.cq cqVar4 = this.R;
                    if (i24 == 0) {
                        i24 = i13;
                    }
                    cqVar4.e(i24, 3);
                    org.telegram.ui.Components.cq cqVar5 = this.R;
                    if (i14 != 0) {
                        i12 = i14;
                    }
                    cqVar5.e(i12, 2);
                    org.telegram.ui.Components.cq cqVar6 = this.R;
                    if (i22 == 0) {
                        i22 = i11;
                    }
                    cqVar6.e(i22, 1);
                    org.telegram.ui.Components.cq cqVar7 = this.R;
                    if (i25 != 0) {
                        themedColor = i25;
                    }
                    cqVar7.e(themedColor, 0);
                    if (i17 != 1 && d6Var.f22871g != 0) {
                        this.f41100r0.m(0);
                    } else {
                        this.f41100r0.o(0);
                    }
                    this.f41097q0.v0(0, AndroidUtilities.dp(60.0f), null);
                }
            } else {
                this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
                if (d6Var.d != 0) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                org.telegram.ui.Components.cq cqVar8 = this.R;
                T0(1);
                cqVar8.f(1, 2, i10, false);
                this.R.e(d6Var.f22868c, 0);
                int i26 = d6Var.d;
                if (i26 != 0) {
                    this.R.e(i26, 1);
                }
                if (i17 == 2 || (i17 == 3 && d6Var.f22871g != 0)) {
                    this.f41100r0.u(0);
                }
            }
            if (i9 != 1 && i9 != 3) {
                this.R.setMinBrightness(0.0f);
                this.R.setMaxBrightness(1.0f);
                return;
            }
            if (i17 == 2 && this.H0[1].getVisibility() == 0) {
                f1(0, true, true);
            }
            if (i9 == 1) {
                if (this.f41057a0.q()) {
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

    public final void Z0(int i9) {
        TLRPC.TL_wallPaper tL_wallPaper;
        if (i9 >= 0 && i9 < this.Q0.size()) {
            tL_wallPaper = (TLRPC.TL_wallPaper) this.Q0.get(i9);
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
        dc1[] dc1VarArr = this.f41103s0;
        dc1 dc1Var = dc1VarArr[0];
        dc1 dc1Var2 = dc1VarArr[1];
        dc1VarArr[0] = dc1Var2;
        dc1VarArr[1] = dc1Var;
        this.f41095p0.removeView(dc1Var2);
        this.f41095p0.addView(dc1VarArr[0], this.f41095p0.indexOfChild(dc1VarArr[1]) + 1);
        dc1 dc1Var3 = dc1VarArr[0];
        this.f41105t0 = dc1Var3;
        dc1Var3.setBackground(dc1VarArr[1].getBackground());
        k1();
        dc1VarArr[1].setVisibility(0);
        dc1VarArr[1].setAlpha(1.0f);
        this.f41105t0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Y1 = ofFloat;
        ofFloat.addUpdateListener(new qi(2, this));
        this.Y1.addListener(new sb1(this, 0));
        this.Y1.setInterpolator(org.telegram.ui.Components.gr.f28844f);
        this.Y1.setDuration(300L);
        this.Y1.start();
        this.f41105t0.getImageReceiver().setCrossfadeDuration(300);
        this.f41105t0.getImageReceiver().setImage(ImageLocation.getForDocument(tL_wallPaper2.document), this.C1, null, null, null, tL_wallPaper2.document.size, "jpg", tL_wallPaper2, 1);
        this.f41105t0.d();
        this.S0 = tL_wallPaper2;
        this.A1 = this.F0[2].f31317s;
        j1();
    }

    public final void a1(int i9, int i10, boolean z10) {
        org.telegram.ui.Components.jb0 jb0Var;
        if (i10 == 0) {
            this.V0 = i9;
        } else if (i10 == 1) {
            this.X0 = i9;
        } else if (i10 == 2) {
            this.Y0 = i9;
        } else if (i10 == 3) {
            this.Z0 = i9;
        }
        m1(z10);
        if (this.F0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.o71[] o71VarArr = this.F0;
                if (i11 >= o71VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.o71 o71Var = o71VarArr[i11];
                if (o71Var != null) {
                    o71Var.b(i10, i9);
                }
                i11++;
            }
        }
        if (this.Y0 != 0) {
            if (this.P0 != null && org.telegram.ui.ActionBar.f6.I.q()) {
                this.P0.setTwoSided(true);
            }
            Drawable background = this.f41105t0.getBackground();
            if (background instanceof org.telegram.ui.Components.jb0) {
                jb0Var = (org.telegram.ui.Components.jb0) background;
            } else {
                jb0Var = new org.telegram.ui.Components.jb0();
                jb0Var.r(this.f41105t0);
                if (this.f41121z1) {
                    jb0Var.m(false);
                }
            }
            jb0Var.n(this.V0, this.X0, this.Y0, this.Z0);
            this.f41105t0.setBackground(jb0Var);
            this.f41076f1 = jb0Var.f();
            this.f41079g1 = 754974720;
        } else if (this.X0 != 0) {
            this.f41105t0.setBackground(new GradientDrawable(org.telegram.ui.Components.n9.d(this.f41068d1), new int[]{this.V0, this.X0}));
            int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(this.V0, this.X0));
            this.f41079g1 = patternColor;
            this.f41076f1 = patternColor;
        } else {
            this.f41105t0.setBackgroundColor(this.V0);
            int patternColor2 = AndroidUtilities.getPatternColor(this.V0);
            this.f41079g1 = patternColor2;
            this.f41076f1 = patternColor2;
        }
        int i12 = org.telegram.ui.ActionBar.f6.f23150lc;
        boolean c12 = org.telegram.ui.ActionBar.f6.c1(i12);
        ob1 ob1Var = this.f41056a;
        if (c12 && !(this.f41105t0.getBackground() instanceof org.telegram.ui.Components.jb0)) {
            if (org.telegram.ui.ActionBar.f6.s0() instanceof org.telegram.ui.Components.jb0) {
                getThemedColor(i12);
                ob1Var.b(this.f41105t0.getBackground(), this.f41105t0.getBackground(), Float.valueOf(this.f41081h1));
            }
        } else {
            ob1Var.b(this.f41105t0.getBackground(), this.f41105t0.getBackground(), Float.valueOf(this.f41081h1));
        }
        ImageView imageView = this.B0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.f23097ic), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.C0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.f23097ic), PorterDuff.Mode.MULTIPLY));
        }
        dc1 dc1Var = this.f41105t0;
        if (dc1Var != null) {
            dc1Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f41076f1, this.f41094o1));
            this.f41105t0.getImageReceiver().setAlpha(Math.abs(this.f41081h1));
            this.f41105t0.invalidate();
            if (org.telegram.ui.ActionBar.f6.I.q() && (this.f41105t0.getBackground() instanceof org.telegram.ui.Components.jb0)) {
                org.telegram.ui.Cells.j0 j0Var = this.P0;
                if (j0Var != null) {
                    j0Var.setTwoSided(true);
                }
                if (this.f41081h1 < 0.0f) {
                    this.f41105t0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.jb0) this.f41105t0.getBackground()).f29698k);
                }
            } else {
                this.f41105t0.getImageReceiver().setGradientBitmap(null);
                org.telegram.ui.Cells.j0 j0Var2 = this.P0;
                if (j0Var2 != null) {
                    j0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.j0 j0Var3 = this.P0;
            if (j0Var3 != null) {
                j0Var3.setProgress(this.f41081h1);
            }
        }
        ib1 ib1Var = this.f41097q0;
        if (ib1Var != null) {
            ib1Var.f1();
        }
        FrameLayout frameLayout = this.f41107u0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                this.f41107u0.getChildAt(i13).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.f41109v0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                this.f41109v0.getChildAt(i14).invalidate();
            }
        }
    }

    public final void b1(boolean z10) {
        org.telegram.ui.Components.jb0 jb0Var;
        org.telegram.ui.Components.jb0 jb0Var2;
        int i9;
        int g10;
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.ActionBar.d6 d6Var = this.f41102s;
        int i10 = this.f41059b;
        if (i10 == 0 && d6Var == null) {
            this.f41105t0.setBackground(org.telegram.ui.ActionBar.f6.r0());
        } else {
            TLRPC.PhotoSize photoSize2 = null;
            BitmapDrawable bitmapDrawable = null;
            if (i10 == 2) {
                Object obj = this.f41116x1;
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
                    dc1 dc1Var = this.f41105t0;
                    dc1Var.f31328a.setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.C1, ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    dc1Var.d();
                } else if (obj instanceof xh1) {
                    xh1 xh1Var = (xh1) obj;
                    int i11 = xh1Var.f44524f;
                    int i12 = xh1Var.f44523e;
                    int i13 = xh1Var.d;
                    int i14 = xh1Var.f44522c;
                    int i15 = xh1Var.f44521b;
                    this.f41068d1 = i11;
                    a1(i15, 0, false);
                    if (i14 != 0) {
                        a1(i14, 1, false);
                    }
                    a1(i13, 2, false);
                    a1(i12, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.S0;
                    if (tL_wallPaper2 != null) {
                        dc1 dc1Var2 = this.f41105t0;
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                        String str = this.C1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.S0;
                        dc1Var2.k(forDocument, str, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                    } else if ("d".equals(xh1Var.f44520a)) {
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        Point point2 = AndroidUtilities.displaySize;
                        int max = Math.max(point2.x, point2.y);
                        if (Build.VERSION.SDK_INT >= 29) {
                            g10 = 1459617792;
                        } else {
                            g10 = org.telegram.ui.Components.jb0.g(i15, i14, i13, i12);
                        }
                        this.f41105t0.setImageBitmap(SvgHelper.getBitmap(R.raw.default_pattern, min, max, g10));
                    }
                } else if (obj instanceof yh1) {
                    Bitmap bitmap = this.f41119y1;
                    if (bitmap != null) {
                        this.f41105t0.setImageBitmap(bitmap);
                    } else {
                        yh1 yh1Var = (yh1) obj;
                        File file = yh1Var.f44880e;
                        if (file != null) {
                            this.f41105t0.f(file.getAbsolutePath(), this.C1, null);
                        } else {
                            File file2 = yh1Var.d;
                            if (file2 != null) {
                                this.f41105t0.f(file2.getAbsolutePath(), this.C1, null);
                            } else if ("t".equals(yh1Var.f44877a)) {
                                dc1 dc1Var3 = this.f41105t0;
                                dc1Var3.setImageDrawable(org.telegram.ui.ActionBar.f6.W0(dc1Var3, false));
                            } else {
                                int i16 = yh1Var.f44878b;
                                if (i16 != 0) {
                                    this.f41105t0.setImageResource(i16);
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
                            i9 = photoSize2.size;
                        } else {
                            i9 = 0;
                        }
                        this.f41105t0.k(ImageLocation.getForPhoto(photoSize2, searchImage.photo), this.C1, ImageLocation.getForPhoto(closestPhotoSizeWithSize, searchImage.photo), "100_100_b", i9, "jpg", searchImage, 1);
                    } else {
                        dc1 dc1Var4 = this.f41105t0;
                        String str2 = searchImage.imageUrl;
                        String str3 = this.C1;
                        String str4 = searchImage.thumbUrl;
                        dc1Var4.getClass();
                        dc1Var4.m(ImageLocation.getForPath(str2), str3, ImageLocation.getForPath(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (d6Var == null) {
                this.f41105t0.setBackground(org.telegram.ui.ActionBar.f6.r0());
            } else {
                org.telegram.ui.Components.i9 i9Var = this.f41098q1;
                if (i9Var != null) {
                    i9Var.dispose();
                    this.f41098q1 = null;
                }
                int B0 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Nd);
                int i17 = (int) d6Var.f22873j;
                if (i17 != 0) {
                    B0 = i17;
                }
                int B02 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Od);
                long j10 = d6Var.f22874k;
                int i18 = (int) j10;
                if (i18 == 0 && j10 != 0) {
                    B02 = 0;
                } else if (i18 != 0) {
                    B02 = i18;
                }
                int B03 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Pd);
                long j11 = d6Var.f22875l;
                int i19 = (int) j11;
                if (i19 == 0 && j11 != 0) {
                    B03 = 0;
                } else if (i19 != 0) {
                    B03 = i19;
                }
                int B04 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Qd);
                long j12 = d6Var.f22876m;
                int i20 = (int) j12;
                if (i20 == 0 && j12 != 0) {
                    B04 = 0;
                } else if (i20 != 0) {
                    B04 = i20;
                }
                if (!TextUtils.isEmpty(d6Var.f22878o) && !org.telegram.ui.ActionBar.f6.Z0()) {
                    if (B03 != 0) {
                        Drawable background = this.f41105t0.getBackground();
                        if (background instanceof org.telegram.ui.Components.jb0) {
                            jb0Var2 = (org.telegram.ui.Components.jb0) background;
                        } else {
                            org.telegram.ui.Components.jb0 jb0Var3 = new org.telegram.ui.Components.jb0();
                            jb0Var3.r(this.f41105t0);
                            jb0Var2 = jb0Var3;
                            if (this.f41121z1) {
                                jb0Var3.m(false);
                                jb0Var2 = jb0Var3;
                            }
                        }
                        jb0Var2.n(B0, B02, B03, B04);
                        jb0Var = jb0Var2;
                    } else if (B02 != 0) {
                        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(org.telegram.ui.Components.n9.d(d6Var.f22877n), new int[]{B0, B02});
                        this.f41098q1 = n9Var.f(m5.c0.m(0.5f, 3), new wb1(this, 0), 100L);
                        jb0Var = n9Var;
                    } else {
                        jb0Var = new ColorDrawable(B0);
                    }
                    this.f41105t0.setBackground(jb0Var);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.S0;
                    if (tL_wallPaper4 != null) {
                        dc1 dc1Var5 = this.f41105t0;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(tL_wallPaper4.document);
                        String str5 = this.C1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.S0;
                        dc1Var5.k(forDocument2, str5, null, null, tL_wallPaper5.document.size, "jpg", tL_wallPaper5, 1);
                    }
                } else {
                    Drawable s02 = org.telegram.ui.ActionBar.f6.s0();
                    if (s02 != null) {
                        if (s02 instanceof org.telegram.ui.Components.jb0) {
                            ((org.telegram.ui.Components.jb0) s02).r(this.f41105t0);
                        }
                        this.f41105t0.setBackground(s02);
                    }
                }
                if (B02 == 0) {
                    int patternColor = AndroidUtilities.getPatternColor(B0);
                    this.f41079g1 = patternColor;
                    this.f41076f1 = patternColor;
                } else if (B03 != 0) {
                    this.f41076f1 = org.telegram.ui.Components.jb0.g(B0, B02, B03, B04);
                    this.f41079g1 = 754974720;
                } else {
                    int patternColor2 = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(B0, B02));
                    this.f41079g1 = patternColor2;
                    this.f41076f1 = patternColor2;
                }
                dc1 dc1Var6 = this.f41105t0;
                if (dc1Var6 != null) {
                    dc1Var6.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f41076f1, this.f41094o1));
                    this.f41105t0.getImageReceiver().setAlpha(Math.abs(this.f41081h1));
                    this.f41105t0.invalidate();
                    if (org.telegram.ui.ActionBar.f6.I.q() && (this.f41105t0.getBackground() instanceof org.telegram.ui.Components.jb0)) {
                        org.telegram.ui.Cells.j0 j0Var = this.P0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                        if (this.f41081h1 < 0.0f) {
                            this.f41105t0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.jb0) this.f41105t0.getBackground()).f29698k);
                        }
                    } else {
                        this.f41105t0.getImageReceiver().setGradientBitmap(null);
                        org.telegram.ui.Cells.j0 j0Var2 = this.P0;
                        if (j0Var2 != null) {
                            j0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.j0 j0Var3 = this.P0;
                    if (j0Var3 != null) {
                        j0Var3.setProgress(this.f41081h1);
                    }
                }
                if (this.F0 != null) {
                    int i21 = 0;
                    while (true) {
                        org.telegram.ui.Components.o71[] o71VarArr = this.F0;
                        if (i21 >= o71VarArr.length) {
                            break;
                        }
                        o71VarArr[i21].b(0, B0);
                        this.F0[i21].b(1, B02);
                        this.F0[i21].b(2, B03);
                        this.F0[i21].b(3, B04);
                        i21++;
                    }
                }
                ImageView imageView = this.B0;
                if (imageView != null) {
                    imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.f23097ic), PorterDuff.Mode.MULTIPLY));
                }
                ImageView imageView2 = this.C0;
                if (imageView2 != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.f23097ic), PorterDuff.Mode.MULTIPLY));
                }
                V0();
            }
        }
        this.f41121z1 = false;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oc1.createView(android.content.Context):android.view.View");
    }

    public final void d1(org.telegram.ui.Cells.w0 w0Var) {
        ob1 ob1Var;
        float f10;
        if (this.f41105t0 == null) {
            return;
        }
        Bitmap bitmap = this.f41056a.f41049r;
        float f11 = 0.0f;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f10 = ((this.f41105t0.getMeasuredWidth() - (Math.max(this.f41105t0.getMeasuredWidth() / width, this.f41105t0.getMeasuredHeight() / ob1Var.f41049r.getHeight()) * width)) / 2.0f) + this.T1 + 0.0f;
        } else {
            f10 = this.T1 + 0.0f;
        }
        float y10 = w0Var.getY() - ((-this.f41105t0.F) + 0.0f);
        int measuredHeight = this.f41105t0.getMeasuredHeight();
        if (this.I1) {
            f11 = this.f41085j1 * this.f41087k1;
        }
        w0Var.f25867s0 = true;
        w0Var.f25864r0 = measuredHeight;
        w0Var.f25859p0 = y10;
        w0Var.f25861q0 = f10;
        w0Var.O1 = f11;
        w0Var.P1.setColor(i0.a.k(-16777216, (int) (f11 * 255.0f)));
        w0Var.invalidate();
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i9 == NotificationCenter.chatWasBoostedByUser) {
            if (this.F1 == ((Long) objArr[2]).longValue()) {
                this.R1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                h1(true);
            }
        } else if (i9 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.wk0 wk0Var = this.f41084j0;
            if (wk0Var != null) {
                int childCount = wk0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = this.f41084j0.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) childAt).a0(0, true);
                    }
                }
            }
        } else if (i9 == NotificationCenter.invalidateMotionBackground) {
            ib1 ib1Var = this.f41097q0;
            if (ib1Var != null) {
                ib1Var.f1();
            }
        } else if (i9 == NotificationCenter.didSetNewWallpapper) {
            if (this.f41095p0 != null) {
                b1(true);
            }
        } else if (i9 == NotificationCenter.wallpapersNeedReload) {
            Object obj = this.f41116x1;
            if (obj instanceof yh1) {
                yh1 yh1Var = (yh1) obj;
                if (yh1Var.f44877a == null) {
                    yh1Var.f44877a = (String) objArr[0];
                }
            }
        } else {
            long j10 = 0;
            if (i9 == NotificationCenter.wallpapersDidLoad) {
                ArrayList arrayList = (ArrayList) objArr[0];
                this.Q0.clear();
                HashMap hashMap = this.R0;
                hashMap.clear();
                int size = arrayList.size();
                boolean z10 = false;
                for (int i12 = 0; i12 < size; i12++) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i12);
                    if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                        TLRPC.Document document = wallPaper.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f22386id))) {
                            this.Q0.add(wallPaper);
                            hashMap.put(Long.valueOf(wallPaper.document.f22386id), wallPaper);
                        }
                        org.telegram.ui.ActionBar.d6 d6Var = this.f41102s;
                        if (d6Var != null && (str = d6Var.f22878o) != null && str.equals(wallPaper.slug)) {
                            this.S0 = (TLRPC.TL_wallPaper) wallPaper;
                            b1(false);
                            j1();
                        } else if (d6Var == null) {
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
                mc1 mc1Var = this.M0;
                if (mc1Var != null) {
                    mc1Var.l();
                }
                int size2 = arrayList.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i13);
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        j10 = MediaDataController.calcHash(j10, wallPaper2.f22532id);
                    }
                }
                TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
                getwallpapers.hash = j10;
                ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new gb1(this, 1)), this.classGuid);
            } else if (i9 == NotificationCenter.wallpaperSettedToUser && this.F1 != 0) {
                finishFragment();
            }
        }
    }

    public final void e1() {
        if (this.f41095p0 != null && this.G0 != null && this.f41102s.f22871g != 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("bganimationhint", false)) {
                if (this.f41112w0 == null) {
                    org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(getParentActivity(), 8);
                    this.f41112w0 = s30Var;
                    s30Var.setShowingDuration(5000L);
                    this.f41112w0.setAlpha(0.0f);
                    this.f41112w0.setVisibility(4);
                    this.f41112w0.setText(LocaleController.getString(R.string.BackgroundAnimateInfo));
                    this.f41112w0.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                    this.f41078g0.addView(this.f41112w0, g7.e6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                AndroidUtilities.runOnUIThread(new n21(13, this, globalMainSettings), 500L);
            }
        }
    }

    public final void f1(int i9, boolean z10, boolean z11) {
        boolean z12;
        char c10;
        char c11;
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
        char c12 = 0;
        if (z10 && i9 == 1 && this.S0 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i16 = this.f41059b;
        if (z10) {
            if (i9 == 0) {
                if (i16 == 2) {
                    this.W0 = this.V0;
                    int i17 = this.X0;
                    this.f41058a1 = i17;
                    int i18 = this.Y0;
                    this.f41061b1 = i18;
                    int i19 = this.Z0;
                    this.f41065c1 = i19;
                    this.f41072e1 = this.K;
                    if (i19 != 0) {
                        i15 = 4;
                    } else if (i18 != 0) {
                        i15 = 3;
                    } else if (i17 != 0) {
                        i15 = 2;
                    } else {
                        i15 = 1;
                    }
                    this.R.f(0, 4, i15, false);
                    this.R.e(this.Z0, 3);
                    this.R.e(this.Y0, 2);
                    this.R.e(this.X0, 1);
                    this.R.e(this.V0, 0);
                }
            } else {
                this.T0 = this.S0;
                this.f41083i1 = this.f41081h1;
                this.M0.l();
                ArrayList arrayList = this.Q0;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.S0;
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
                    this.N0.h1(i14, (this.L0.getMeasuredWidth() - AndroidUtilities.dp(124.0f)) / 2);
                }
            }
        }
        if (i16 == 1 || i16 == 2) {
            org.telegram.ui.Components.o71[] o71VarArr = this.F0;
            if (z12) {
                c10 = 2;
            } else {
                c10 = 0;
            }
            o71VarArr[c10].setVisibility(0);
        }
        if (i9 == 1) {
            org.telegram.ui.Cells.j0 j0Var = this.P0;
            if (!j0Var.H) {
                float f20 = this.f41081h1;
                if (f20 < 0.0f) {
                    float f21 = -f20;
                    this.f41081h1 = f21;
                    j0Var.setProgress(f21);
                }
            }
        }
        int i20 = 58;
        float f22 = 1.0f;
        FrameLayout[] frameLayoutArr = this.H0;
        if (z11) {
            this.f41092n1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            if (i9 == 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (z10) {
                frameLayoutArr[i9].setVisibility(0);
                if (i16 == 1) {
                    ib1 ib1Var = this.f41097q0;
                    Property property = View.TRANSLATION_Y;
                    if (i9 == 1) {
                        f17 = -AndroidUtilities.dp(21.0f);
                    } else {
                        f17 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(ib1Var, property, f17));
                    org.telegram.ui.Components.o71 o71Var = this.F0[2];
                    Property property2 = View.ALPHA;
                    if (z12) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(o71Var, property2, f18));
                    org.telegram.ui.Components.o71 o71Var2 = this.F0[0];
                    if (z12) {
                        f19 = 0.0f;
                    } else {
                        f19 = 1.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(o71Var2, property2, f19));
                    if (i9 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i9], property2, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i9].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i11], property2, 0.0f));
                    }
                    AndroidUtilities.hideKeyboard(this.R.A[1]);
                } else if (i16 == 2) {
                    ib1 ib1Var2 = this.f41097q0;
                    Property property3 = View.TRANSLATION_Y;
                    int i21 = -frameLayoutArr[i9].getMeasuredHeight();
                    if (this.f41113w1 == null) {
                        i20 = 0;
                    }
                    int dp = AndroidUtilities.dp(i20 + 72) + i21;
                    if (U0()) {
                        i12 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i12 = 0;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(ib1Var2, property3, dp + i12));
                    org.telegram.ui.Components.o71 o71Var3 = this.F0[2];
                    Property property4 = View.ALPHA;
                    if (z12) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(o71Var3, property4, f16));
                    org.telegram.ui.Components.o71 o71Var4 = this.F0[0];
                    if (z12) {
                        f22 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(o71Var4, property4, f22));
                    if (frameLayoutArr[i11].getVisibility() == 0) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i11], property4, 0.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i9], property4, 0.0f, 1.0f));
                        frameLayoutArr[i9].setTranslationY(0.0f);
                    } else {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i9], property3, frameLayout3.getMeasuredHeight(), 0.0f));
                    }
                } else {
                    if (i9 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i9], View.ALPHA, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i9].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i11], View.ALPHA, 0.0f));
                    }
                    AndroidUtilities.hideKeyboard(this.R.A[1]);
                }
            } else {
                ib1 ib1Var3 = this.f41097q0;
                Property property5 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(ib1Var3, property5, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i9], property5, frameLayout2.getMeasuredHeight()));
                org.telegram.ui.Components.o71 o71Var5 = this.F0[0];
                Property property6 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(o71Var5, property6, 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.F0[2], property6, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.f41105t0, property6, 1.0f));
            }
            this.f41092n1.playTogether(arrayList2);
            this.f41092n1.addListener(new vb1(this, z10, i11, i9, z12));
            this.f41092n1.setInterpolator(org.telegram.ui.Components.gr.f28845g);
            this.f41092n1.setDuration(200L);
            this.f41092n1.start();
            return;
        }
        if (i9 == 0) {
            c11 = 1;
        } else {
            c11 = 0;
        }
        if (z10) {
            frameLayoutArr[i9].setVisibility(0);
            if (i16 == 1) {
                ib1 ib1Var4 = this.f41097q0;
                if (i9 == 1) {
                    f13 = -AndroidUtilities.dp(21.0f);
                } else {
                    f13 = 0.0f;
                }
                ib1Var4.setTranslationY(f13);
                org.telegram.ui.Components.o71 o71Var6 = this.F0[2];
                if (z12) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                o71Var6.setAlpha(f14);
                org.telegram.ui.Components.o71 o71Var7 = this.F0[0];
                if (z12) {
                    f15 = 0.0f;
                } else {
                    f15 = 1.0f;
                }
                o71Var7.setAlpha(f15);
                if (i9 == 1) {
                    frameLayoutArr[i9].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i9].setAlpha(1.0f);
                    frameLayoutArr[c11].setAlpha(0.0f);
                }
                AndroidUtilities.hideKeyboard(this.R.A[1]);
            } else if (i16 == 2) {
                ib1 ib1Var5 = this.f41097q0;
                if (i9 == 0) {
                    f10 = 343.0f;
                } else {
                    f10 = 316.0f;
                }
                int i22 = -AndroidUtilities.dp(f10);
                if (this.f41113w1 == null) {
                    i20 = 0;
                }
                int dp2 = AndroidUtilities.dp(i20 + 72) + i22;
                if (U0()) {
                    i10 = AndroidUtilities.navigationBarHeight;
                } else {
                    i10 = 0;
                }
                ib1Var5.setTranslationY(dp2 + i10);
                org.telegram.ui.Components.o71 o71Var8 = this.F0[2];
                if (z12) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                o71Var8.setAlpha(f11);
                org.telegram.ui.Components.o71 o71Var9 = this.F0[0];
                if (z12) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                o71Var9.setAlpha(f12);
                if (frameLayoutArr[c11].getVisibility() == 0) {
                    frameLayoutArr[c11].setAlpha(0.0f);
                    frameLayoutArr[i9].setAlpha(1.0f);
                    frameLayoutArr[i9].setTranslationY(0.0f);
                } else {
                    frameLayoutArr[i9].setTranslationY(0.0f);
                }
            } else {
                if (i9 == 1) {
                    frameLayoutArr[i9].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i9].setAlpha(1.0f);
                    frameLayoutArr[c11].setAlpha(0.0f);
                }
                AndroidUtilities.hideKeyboard(this.R.A[1]);
            }
        } else {
            this.f41097q0.setTranslationY(0.0f);
            frameLayoutArr[i9].setTranslationY(frameLayout.getMeasuredHeight());
            this.F0[0].setAlpha(1.0f);
            this.F0[2].setAlpha(1.0f);
            this.f41105t0.setAlpha(1.0f);
        }
        if (z10 && frameLayoutArr[c11].getVisibility() == 0) {
            frameLayoutArr[c11].setAlpha(1.0f);
            frameLayoutArr[c11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i9].setVisibility(4);
        }
        if (i16 != 1 && i16 != 2) {
            if (i9 == 1) {
                frameLayoutArr[c11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.o71[] o71VarArr2 = this.F0;
        if (!z12) {
            c12 = 2;
        }
        o71VarArr2[c12].setVisibility(4);
    }

    public final void g1() {
        Window window;
        if (this.f41069d2 != null) {
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
        float f10 = iArr[0];
        float f11 = iArr[1];
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        gc gcVar = new gc(this, getParentActivity(), canvas, (this.K1.getMeasuredWidth() / 2.0f) + f10, (this.K1.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 2);
        this.f41069d2 = gcVar;
        gcVar.setOnTouchListener(new jh.d(2));
        this.f41073e2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f41077f2 = ofFloat;
        ofFloat.addUpdateListener(new kh.fb(this, 3));
        this.f41077f2.addListener(new sb1(this, 4));
        this.f41077f2.setDuration(400L);
        this.f41077f2.setInterpolator(org.telegram.ui.Components.xs.f34754e);
        this.f41077f2.start();
        frameLayout.addView(this.f41069d2, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new ab1(this, 2));
    }

    @Override
    public final int getObserverTag() {
        return this.f41096p1;
    }

    @Override
    public final org.telegram.ui.ActionBar.b6 getResourceProvider() {
        return this.f41056a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.H1) {
            return S0();
        }
        return super.getThemeDescriptions();
    }

    public final void h1(boolean z10) {
        int i9 = (this.F1 > 0L ? 1 : (this.F1 == 0L ? 0 : -1));
        if (i9 > 0) {
            this.f41110v1.d(LocaleController.getString(R.string.ApplyWallpaperForMe));
        } else if (i9 < 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.F1));
            if (chat != null) {
                this.f41110v1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, chat.title));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.R1;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                    if (this.f41089m1 == null) {
                        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.mini_switch_lock, 0);
                        this.f41089m1 = eqVar;
                        eqVar.setTopOffset(1);
                    }
                    spannableStringBuilder.setSpan(this.f41089m1, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", R0(), new Object[0]));
                    this.f41110v1.c(spannableStringBuilder, z10);
                    return;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.R1;
                if (tL_premium_boostsStatus2 == null) {
                    if (this.F1 < 0 && !this.P1 && !this.Q1 && tL_premium_boostsStatus2 == null) {
                        this.P1 = true;
                        getMessagesController().getBoostsController().getBoostsStats(this.F1, new fb1(this, 0));
                        return;
                    }
                    return;
                }
                this.f41110v1.c(null, z10);
                return;
            }
            this.f41110v1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, LocaleController.getString(R.string.AccDescrChannel).toLowerCase()));
        } else {
            this.f41110v1.d(LocaleController.getString(R.string.ApplyWallpaper));
        }
    }

    public final void i1() {
        if (this.B1 && this.f41104s1 == null) {
            Bitmap bitmap = this.f41119y1;
            if (bitmap != null) {
                this.f41106t1 = bitmap;
                this.f41104s1 = Utilities.blurWallpaper(bitmap);
            } else {
                ImageReceiver imageReceiver = this.f41105t0.getImageReceiver();
                if (imageReceiver.hasNotThumb() || imageReceiver.hasStaticThumb()) {
                    this.f41106t1 = imageReceiver.getBitmap();
                    this.f41104s1 = Utilities.blurWallpaper(imageReceiver.getBitmap());
                }
            }
        }
        if (this.B1) {
            Bitmap bitmap2 = this.f41104s1;
            if (bitmap2 != null) {
                this.f41105t0.setImageBitmap(bitmap2);
                return;
            }
            return;
        }
        b1(false);
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.f41059b == 2) {
            if (this.W1 && motionEvent != null) {
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
        int i9;
        long j10;
        File file;
        String str;
        float f10;
        FrameLayout frameLayout;
        float f11;
        Object obj = this.S0;
        if (obj == null) {
            obj = this.f41116x1;
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
                    i9 = closestPhotoSizeWithSize.size;
                } else {
                    httpFilePath = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                    name = httpFilePath.getName();
                    i9 = searchImage.size;
                }
                j10 = i9;
                String str2 = name;
                file = httpFilePath;
                str = str2;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            }
            boolean exists = file.exists();
            int i10 = this.f41059b;
            if (exists) {
                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                this.f41105t0.invalidate();
                if (i10 == 2) {
                    if (j10 != 0 && this.F1 == 0) {
                        this.f41093o0.setSubtitle(AndroidUtilities.formatFileSize(j10));
                    } else {
                        this.f41093o0.setSubtitle(null);
                    }
                }
            } else {
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(str, null, this);
                if (i10 == 2 && this.F1 == 0) {
                    this.f41093o0.setSubtitle(LocaleController.getString(R.string.LoadingFullImage));
                }
                this.f41105t0.invalidate();
            }
            float f12 = 0.5f;
            if (this.S0 == null && (frameLayout = this.f41107u0) != null) {
                if (exists) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.5f;
                }
                frameLayout.setAlpha(f11);
            }
            if (i10 == 0) {
                this.Y.setEnabled(exists);
                TextView textView = this.Y;
                if (exists) {
                    f12 = 1.0f;
                }
                textView.setAlpha(f12);
            } else if (i10 == 2) {
                this.f41118y0.setEnabled(exists);
                ec1 ec1Var = this.f41110v1;
                if (ec1Var != null) {
                    if (exists) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.5f;
                    }
                    ec1Var.setAlpha(f10);
                }
                ec1 ec1Var2 = this.f41113w1;
                if (ec1Var2 != null) {
                    if (exists) {
                        f12 = 1.0f;
                    }
                    ec1Var2.setAlpha(f12);
                }
            } else {
                this.f41074f.setEnabled(exists);
                org.telegram.ui.ActionBar.w0 w0Var = this.f41074f;
                if (exists) {
                    f12 = 1.0f;
                }
                w0Var.setAlpha(f12);
            }
        }
    }

    public final void k1() {
        this.f41105t0.getImageReceiver().setAlpha(Math.abs(this.f41081h1));
        this.f41105t0.invalidate();
        this.L0.f1();
        if (this.f41081h1 >= 0.0f) {
            this.f41105t0.getImageReceiver().setGradientBitmap(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f41105t0.getImageReceiver().setBlendMode(null);
            }
            if (this.f41105t0.getBackground() instanceof org.telegram.ui.Components.jb0) {
                this.f41105t0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.jb0) this.f41105t0.getBackground()).f29698k);
            }
        }
        this.f41056a.b(this.f41105t0.getBackground(), this.f41105t0.getBackground(), Float.valueOf(this.f41081h1));
        V0();
    }

    public final void l1() {
        char c10;
        float f10;
        boolean z10;
        boolean z11;
        float f11;
        float f12 = 1.0f;
        float f13 = 0.0f;
        int i9 = this.f41059b;
        if (i9 != 1 && i9 != 2) {
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
            org.telegram.ui.Components.o71 o71Var = this.F0[0];
            if (this.S0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            o71Var.setEnabled(z11);
            if (this.S0 != null) {
                this.F0[0].setVisibility(0);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            int dp = (AndroidUtilities.dp(9.0f) + ((FrameLayout.LayoutParams) this.F0[1].getLayoutParams()).width) / 2;
            org.telegram.ui.Components.o71 o71Var2 = this.F0[0];
            Property property = View.ALPHA;
            if (this.S0 == null) {
                f12 = 0.0f;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(o71Var2, property, f12));
            org.telegram.ui.Components.o71 o71Var3 = this.F0[0];
            Property property2 = View.TRANSLATION_X;
            if (this.S0 != null) {
                f11 = 0.0f;
            } else {
                f11 = dp;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(o71Var3, property2, f11));
            org.telegram.ui.Components.o71 o71Var4 = this.F0[1];
            if (this.S0 == null) {
                f13 = -dp;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(o71Var4, property2, f13));
            animatorSet.setInterpolator(org.telegram.ui.Components.gr.f28845g);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new ub1(this));
            animatorSet.start();
            return;
        }
        if (this.S0 == null && (this.f41116x1 instanceof xh1)) {
            this.F0[2].a(false, true);
        }
        org.telegram.ui.Components.o71[] o71VarArr = this.F0;
        if (this.S0 != null) {
            c10 = 2;
        } else {
            c10 = 0;
        }
        o71VarArr[c10].setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        org.telegram.ui.Components.o71 o71Var5 = this.F0[2];
        Property property3 = View.ALPHA;
        if (this.S0 != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(o71Var5, property3, f10);
        org.telegram.ui.Components.o71 o71Var6 = this.F0[0];
        if (this.S0 != null) {
            f12 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(o71Var6, property3, f12));
        animatorSet2.addListener(new tb1(this));
        animatorSet2.setInterpolator(org.telegram.ui.Components.gr.f28845g);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }

    public final void m1(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oc1.m1(boolean):void");
    }

    public final void n1() {
        int childCount = this.L0.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = this.L0.getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.k5) {
                ((org.telegram.ui.Cells.k5) childAt).u(true);
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
            this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5));
            if (this.f41059b == 2 && this.F1 != 0) {
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
        int i9 = this.f41059b;
        if (i9 == 1 || i9 == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i9 == 2 || i9 == 1) {
            org.telegram.ui.ActionBar.f6.N = true;
        }
        if (i9 == 0 && this.f41102s == null) {
            this.A1 = org.telegram.ui.ActionBar.f6.f23086i0;
        } else {
            Point point = AndroidUtilities.displaySize;
            int min = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            int max = Math.max(point2.x, point2.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / AndroidUtilities.density));
            sb2.append("_");
            this.C1 = aa.d.l((int) (max / AndroidUtilities.density), "_f", sb2);
            Point point3 = AndroidUtilities.displaySize;
            this.D1 = Math.max(point3.x, point3.y);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            this.f41096p1 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
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
        fh.v vVar = this.f41078g0;
        if (vVar != null && this.M != null) {
            vVar.getViewTreeObserver().removeOnGlobalLayoutListener(this.M);
        }
        int i9 = this.f41059b;
        if ((i9 == 2 || i9 == 1) && this.l1 == null) {
            AndroidUtilities.runOnUIThread(new lj0(6));
        }
        if (i9 == 2) {
            Bitmap bitmap = this.f41104s1;
            if (bitmap != null) {
                bitmap.recycle();
                this.f41104s1 = null;
            }
            this.f41056a.b(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        } else if (i9 == 1 || i9 == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i9 != 0 || this.f41102s != null) {
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
            this.f41101r1.c(false);
        }
        org.telegram.ui.ActionBar.f6.f22958b = false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        gc1 gc1Var = this.f41086k0;
        if (gc1Var != null) {
            gc1Var.l();
        }
        kc1 kc1Var = this.f41100r0;
        if (kc1Var != null) {
            kc1Var.l();
        }
        if (this.A1) {
            this.f41101r1.c(true);
        }
        org.telegram.ui.ActionBar.f6.f22958b = true;
    }

    @Override
    public final void onSuccessDownload(String str) {
        j1();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (!z10 && this.f41059b == 2) {
            this.f41056a.b(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.b6 b6Var) {
        this.f41056a.f41043a = b6Var;
    }

    public oc1(org.telegram.ui.ActionBar.e6 e6Var, boolean z10, int i9, boolean z11, boolean z12) {
        super(null);
        this.f41056a = new ob1(this);
        this.d = true;
        this.f41090n = 1;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(this, 0, false);
        this.N = n5Var;
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(this, 0, true);
        this.O = n5Var2;
        org.telegram.ui.ActionBar.n5 n5Var3 = new org.telegram.ui.ActionBar.n5(this, 1, false);
        this.P = n5Var3;
        org.telegram.ui.ActionBar.n5 n5Var4 = new org.telegram.ui.ActionBar.n5(this, 1, true);
        this.Q = n5Var4;
        this.T = -1;
        this.U = new ab1(this, 0);
        this.f41103s0 = new dc1[2];
        this.H0 = new FrameLayout[2];
        this.I0 = new TextView[2];
        this.J0 = new TextView[2];
        this.K0 = new FrameLayout[2];
        this.R0 = new HashMap();
        this.f41081h1 = 0.5f;
        this.f41085j1 = 0.0f;
        this.f41094o1 = PorterDuff.Mode.SRC_IN;
        this.f41108u1 = 1.0f;
        this.C1 = "640_360";
        this.D1 = 1920;
        this.G1 = true;
        this.O1 = new org.telegram.ui.Components.u10(getParentActivity(), new qb1(this));
        this.P1 = false;
        this.Q1 = false;
        this.f41059b = i9;
        this.f41060b0 = z12;
        this.f41057a0 = e6Var;
        this.f41067d0 = z10;
        this.f41064c0 = z11;
        if (i9 == 1) {
            org.telegram.ui.ActionBar.d6 k10 = e6Var.k(!z11);
            this.f41102s = k10;
            if (k10 != null) {
                this.d = false;
                this.f41111w = k10.f22868c;
                this.f41114x = k10.d;
                this.f41117y = k10.f22869e;
                this.A = k10.f22870f;
                this.B = k10.f22871g;
                this.C = k10.h;
                this.D = k10.f22872i;
                this.E = k10.f22873j;
                this.F = k10.f22874k;
                this.G = k10.f22875l;
                this.H = k10.f22876m;
                this.I = k10.f22879p;
                this.J = k10.f22878o;
                this.K = k10.f22877n;
            }
        } else {
            if (i9 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.d6 k11 = e6Var.k(false);
            this.f41102s = k11;
            if (k11 != null) {
                this.S0 = k11.f22882s;
            }
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.f41102s;
        if (d6Var != null) {
            this.A1 = d6Var.f22880q;
            if (!TextUtils.isEmpty(d6Var.f22878o)) {
                this.f41081h1 = this.f41102s.f22879p;
            }
            org.telegram.ui.ActionBar.f6.M = org.telegram.ui.ActionBar.f6.A0();
            org.telegram.ui.ActionBar.f6.O = true;
            org.telegram.ui.ActionBar.f6.P = true;
            org.telegram.ui.ActionBar.f6.t(e6Var, false, false);
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

    public oc1(org.telegram.ui.ActionBar.e6 e6Var) {
        this(e6Var, false, 0, false, false);
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
