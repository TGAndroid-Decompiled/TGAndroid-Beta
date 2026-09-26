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
public class od1 extends org.telegram.ui.ActionBar.m2 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.j40 A0;
    public ed1 A1;
    public AnimatorSet B0;
    public Object B1;
    public u4 C0;
    public Bitmap C1;
    public mc1 D0;
    public boolean D1;
    public final int E;
    public mc1 E0;
    public boolean E1;
    public final int F;
    public ImageView F0;
    public boolean F1;
    public final int G;
    public ImageView G0;
    public String G1;
    public final boolean H;
    public AnimatorSet H0;
    public int H1;
    public final long I;
    public AnimatorSet I0;
    public nd1 I1;
    public final long J;
    public org.telegram.ui.Components.x81[] J0;
    public long J1;
    public final long K;
    public org.telegram.ui.Components.x81[] K0;
    public boolean K1;
    public final long L;
    public final FrameLayout[] L0;
    public boolean L1;
    public final float M;
    public final TextView[] M0;
    public boolean M1;
    public final String N;
    public final TextView[] N0;
    public org.telegram.ui.Components.ij0 N1;
    public final int O;
    public final FrameLayout[] O0;
    public org.telegram.ui.ActionBar.u0 O1;
    public long P;
    public wb1 P0;
    public ValueAnimator P1;
    public ba0 Q;
    public md1 Q0;
    public t5 Q1;
    public final org.telegram.ui.ActionBar.o5 R;
    public s4.c0 R0;
    public lc1 R1;
    public final org.telegram.ui.ActionBar.o5 S;
    public org.telegram.ui.Cells.m4 S0;
    public final org.telegram.ui.Components.k20 S1;
    public final org.telegram.ui.ActionBar.o5 T;
    public org.telegram.ui.Cells.j0 T0;
    public boolean T1;
    public final org.telegram.ui.ActionBar.o5 U;
    public ArrayList U0;
    public boolean U1;
    public org.telegram.ui.Components.nq V;
    public final HashMap V0;
    public TL_stories.TL_premium_boostsStatus V1;
    public int W;
    public TLRPC.TL_wallPaper W0;
    public float W1;
    public int X;
    public TLRPC.TL_wallPaper X0;
    public float X1;
    public final Runnable Y;
    public TLRPC.TL_wallPaper Y0;
    public float Y1;
    public boolean Z;
    public int Z0;
    public float Z1;
    public final oc1 f36152a;
    public ci.r6 f36153a0;
    public int f36154a1;
    public boolean a2;
    public final int f36155b;
    public FrameLayout f36156b0;
    public int f36157b1;
    public int f36158b2;
    public Scroller f36159c;
    public TextView f36160c0;
    public int f36161c1;
    public ValueAnimator f36162c2;
    public final boolean d;
    public TextView f36163d0;
    public int f36164d1;
    public boolean f36165d2;
    public org.telegram.ui.Components.zl e;
    public final org.telegram.ui.ActionBar.g6 f36166e0;
    public int f36167e1;
    public TextView f36168e2;
    public org.telegram.ui.ActionBar.u0 f36169f;
    public final boolean f36170f0;
    public int f36171f1;
    public WeakReference f36172f2;
    public final boolean f36173g0;
    public int f36174g1;
    public BitmapDrawable f36175g2;
    public TextView h;
    public final boolean f36176h0;
    public int f36177h1;
    public kc f36178h2;
    public ArrayList f36179i0;
    public int f36180i1;
    public float f36181i2;
    public z4.g f36182j0;
    public int f36183j1;
    public ValueAnimator f36184j2;
    public ci.m6 f36185k0;
    public int f36186k1;
    public UndoView f36187l0;
    public float l1;
    public FrameLayout m0;
    public float f36188m1;
    public int f36189n;
    public org.telegram.ui.Components.wl0 f36190n0;
    public float f36191n1;
    public gd1 f36192o0;
    public float f36193o1;
    public org.telegram.ui.Components.z10 f36194p0;
    public fd1 f36195p1;
    public MessageObject f36196q0;
    public org.telegram.ui.Components.pq f36197q1;
    public Drawable f36198r;
    public boolean f36199r0;
    public AnimatorSet f36200r1;
    public final org.telegram.ui.ActionBar.f6 f36201s;
    public org.telegram.ui.ActionBar.k f36202s0;
    public final PorterDuff.Mode f36203s1;
    public org.telegram.ui.ActionBar.p0 f36204t0;
    public int f36205t1;
    public jc1 f36206u0;
    public org.telegram.ui.Components.q9 f36207u1;
    public boolean v;
    public kd1 f36208v0;
    public org.telegram.ui.Components.z81 f36209v1;
    public final int f36210w;
    public final dd1[] f36211w0;
    public Bitmap f36212w1;
    public final int f36213x;
    public dd1 f36214x0;
    public Bitmap f36215x1;
    public final int f36216y;
    public FrameLayout f36217y0;
    public float f36218y1;
    public FrameLayout f36219z0;
    public ed1 f36220z1;

    public od1(Object obj, Bitmap bitmap, boolean z10) {
        super(null);
        this.f36152a = new oc1(this);
        this.d = true;
        this.f36189n = 1;
        org.telegram.ui.ActionBar.o5 o5Var = new org.telegram.ui.ActionBar.o5(this, 0, false);
        this.R = o5Var;
        org.telegram.ui.ActionBar.o5 o5Var2 = new org.telegram.ui.ActionBar.o5(this, 0, true);
        this.S = o5Var2;
        org.telegram.ui.ActionBar.o5 o5Var3 = new org.telegram.ui.ActionBar.o5(this, 1, false);
        this.T = o5Var3;
        org.telegram.ui.ActionBar.o5 o5Var4 = new org.telegram.ui.ActionBar.o5(this, 1, true);
        this.U = o5Var4;
        this.X = -1;
        this.Y = new bc1(this, 0);
        this.f36211w0 = new dd1[2];
        this.L0 = new FrameLayout[2];
        this.M0 = new TextView[2];
        this.N0 = new TextView[2];
        this.O0 = new FrameLayout[2];
        this.V0 = new HashMap();
        this.l1 = 0.5f;
        this.f36191n1 = 0.0f;
        this.f36203s1 = PorterDuff.Mode.SRC_IN;
        this.f36218y1 = 1.0f;
        this.G1 = "640_360";
        this.H1 = 1920;
        this.K1 = true;
        this.S1 = new org.telegram.ui.Components.k20(getParentActivity(), new qc1(this));
        this.T1 = false;
        this.U1 = false;
        this.f36155b = 2;
        this.B1 = obj;
        this.C1 = bitmap;
        this.D1 = z10;
        if (obj instanceof yi1) {
            yi1 yi1Var = (yi1) obj;
            this.E1 = yi1Var.f40173j;
            TLRPC.TL_wallPaper tL_wallPaper = yi1Var.f40171g;
            this.W0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f7 = yi1Var.h;
                this.l1 = f7;
                if (f7 < 0.0f && !org.telegram.ui.ActionBar.h6.I.q()) {
                    this.l1 *= -1.0f;
                }
            }
        }
        o5Var.v = true;
        o5Var3.v = true;
        o5Var2.v = true;
        o5Var4.v = true;
    }

    public static void U(od1 od1Var, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (od1Var.getParentActivity() == null) {
            return;
        }
        rg.j0 j0Var = new rg.j0(23, od1Var.currentAccount, od1Var.getParentActivity(), od1Var, od1Var.f36152a);
        j0Var.G1(canApplyBoost);
        j0Var.F1(od1Var.V1, true);
        j0Var.H1(od1Var.J1);
        if (!od1Var.U0()) {
            j0Var.Q0 = new bc1(od1Var, 1);
        }
        od1Var.showDialog(j0Var);
    }

    public static void V(od1 od1Var) {
        org.telegram.ui.ActionBar.f6 k10;
        org.telegram.ui.ActionBar.g6 g6Var = org.telegram.ui.ActionBar.h6.M;
        if (g6Var == null) {
            return;
        }
        int i10 = g6Var.Z;
        if (i10 >= 0) {
            k10 = (org.telegram.ui.ActionBar.f6) g6Var.f18933a0.get(i10);
        } else {
            k10 = g6Var.k(false);
        }
        if (od1Var.f36201s != null) {
            od1Var.W0();
            org.telegram.ui.ActionBar.h6.t1(od1Var.f36166e0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.h6.M != null) {
                org.telegram.ui.ActionBar.h6.O = false;
                org.telegram.ui.ActionBar.h6.P = false;
                org.telegram.ui.ActionBar.h6.M = null;
            }
            org.telegram.ui.ActionBar.h6.t(od1Var.f36166e0, true, od1Var.f36170f0);
            ((ActionBarLayout) od1Var.parentLayout).U(false, false);
        } else {
            ((ActionBarLayout) od1Var.parentLayout).U(false, false);
            File file = new File(od1Var.f36166e0.f18934b);
            org.telegram.ui.ActionBar.g6 g6Var2 = od1Var.f36166e0;
            org.telegram.ui.ActionBar.h6.u(file, g6Var2.f18932a, g6Var2.F, false);
            MessagesController.getInstance(od1Var.f36166e0.E).saveTheme(od1Var.f36166e0, null, false, false);
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", od1Var.f36166e0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) od1Var.getParentLayout().getFragmentStack().get(Math.max(0, od1Var.getParentLayout().getFragmentStack().size() - 2));
        od1Var.finishFragment();
        if (od1Var.f36155b == 0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didApplyNewTheme, g6Var, k10, Boolean.valueOf(od1Var.f36176h0));
        }
        org.telegram.ui.ActionBar.h6.F1(m2Var);
    }

    public static void W(od1 od1Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = od1Var.V0;
        org.telegram.ui.ActionBar.f6 f6Var = od1Var.f36201s;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            od1Var.U0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_wallPapers.wallpapers.get(i10) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i10);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f18341id))) {
                            od1Var.U0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.f18341id), tL_wallPaper2);
                        }
                        if (f6Var != null && (str = f6Var.f18896o) != null && str.equals(tL_wallPaper2.slug)) {
                            od1Var.W0 = tL_wallPaper2;
                            od1Var.b1(false);
                            od1Var.j1();
                        } else if (f6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = od1Var.W0;
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
            if (!z10 && (tL_wallPaper = od1Var.W0) != null) {
                od1Var.U0.add(0, tL_wallPaper);
            }
            md1 md1Var = od1Var.Q0;
            if (md1Var != null) {
                md1Var.l();
            }
            MessagesStorage.getInstance(od1Var.currentAccount).putWallpapers(tL_wallPapers.wallpapers, 1);
        }
        if (od1Var.W0 == null && f6Var != null && !TextUtils.isEmpty(f6Var.f18896o)) {
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = f6Var.f18896o;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(od1Var.currentAccount).bindRequestToGuid(od1Var.getConnectionsManager().sendRequest(getwallpaper, new hc1(od1Var, 0)), od1Var.classGuid);
        }
    }

    public static void X(od1 od1Var) {
        org.telegram.ui.Components.zl zlVar = od1Var.e;
        int i10 = 0;
        if (zlVar != null) {
            zlVar.B(od1Var.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
            od1Var.e.G(od1Var.getThemedColor(org.telegram.ui.ActionBar.h6.E8), false);
        }
        Drawable drawable = od1Var.f36198r;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(od1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19059d6), PorterDuff.Mode.MULTIPLY));
        }
        u4 u4Var = od1Var.C0;
        if (u4Var != null) {
            u4Var.invalidate();
        }
        if (od1Var.f36195p1 != null) {
            org.telegram.ui.ActionBar.b5 b5Var = od1Var.parentLayout;
            if (b5Var != null && b5Var.getBottomSheet() != null) {
                od1Var.parentLayout.getBottomSheet().fixNavigationBar(od1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19129h5));
                if (od1Var.f36155b == 2 && od1Var.J1 != 0) {
                    od1Var.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            } else {
                od1Var.setNavigationBarColor(od1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19129h5));
            }
        }
        if (od1Var.J0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.x81[] x81VarArr = od1Var.J0;
                if (i11 >= x81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.x81 x81Var = x81VarArr[i11];
                if (x81Var != null) {
                    x81Var.invalidate();
                }
                i11++;
            }
        }
        if (od1Var.K0 != null) {
            while (true) {
                org.telegram.ui.Components.x81[] x81VarArr2 = od1Var.K0;
                if (i10 >= x81VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.x81 x81Var2 = x81VarArr2[i10];
                if (x81Var2 != null) {
                    x81Var2.invalidate();
                }
                i10++;
            }
        }
        TextView textView = od1Var.f36168e2;
        if (textView != null) {
            textView.setTextColor(od1Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
        }
        org.telegram.ui.Components.nq nqVar = od1Var.V;
        if (nqVar != null) {
            nqVar.invalidate();
        }
        org.telegram.ui.Components.z10 z10Var = od1Var.f36194p0;
        if (z10Var != null) {
            z10Var.g();
        }
    }

    public final void M0() {
        AnimatorSet animatorSet = this.B0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.B0 = animatorSet2;
        if (this.E1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f36214x0, View.SCALE_X, this.f36218y1), ObjectAnimator.ofFloat(this.f36214x0, View.SCALE_Y, this.f36218y1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f36214x0, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f36214x0, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f36214x0, View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f36214x0, View.TRANSLATION_Y, 0.0f));
        }
        this.B0.setInterpolator(org.telegram.ui.Components.rr.f28031g);
        this.B0.addListener(new sc1(this, 1));
        this.B0.start();
    }

    public final void N0(boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.od1.N0(boolean):void");
    }

    public final void O0(boolean z10) {
        int i10 = this.f36155b;
        if (i10 == 2) {
            if (!z10) {
                finishFragment();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.h6.o();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        org.telegram.ui.ActionBar.f6 f6Var = this.f36201s;
        if (i10 == 1) {
            if (this.f36173g0) {
                f6Var.f18887c = this.f36210w;
                f6Var.d = this.f36213x;
                f6Var.e = this.f36216y;
                f6Var.f18888f = this.E;
                f6Var.f18889g = this.F;
                f6Var.h = this.G;
                f6Var.f18890i = this.H;
                f6Var.f18891j = this.I;
                f6Var.f18892k = this.J;
                f6Var.f18893l = this.K;
                f6Var.f18894m = this.L;
                f6Var.f18895n = this.O;
                f6Var.f18896o = this.N;
                f6Var.f18897p = this.M;
            }
            org.telegram.ui.ActionBar.h6.t1(this.f36166e0, false, true, false, false, false);
        } else {
            if (f6Var != null) {
                org.telegram.ui.ActionBar.h6.t1(this.f36166e0, false, this.f36176h0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).U(false, false);
            if (this.f36176h0) {
                org.telegram.ui.ActionBar.g6 g6Var = this.f36166e0;
                if (g6Var.f18934b != null && org.telegram.ui.ActionBar.h6.H.get(g6Var.m()) == null) {
                    new File(g6Var.f18934b).delete();
                }
            }
        }
        if (!z10) {
            finishFragment();
        }
    }

    public final BitmapDrawable P0(Drawable drawable) {
        WeakReference weakReference = this.f36172f2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.f36175g2;
        }
        WeakReference weakReference2 = this.f36172f2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f36172f2 = null;
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            this.f36172f2 = new WeakReference(drawable);
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
            this.f36175g2 = bitmapDrawable;
            bitmapDrawable.setFilterBitmap(true);
            return this.f36175g2;
        }
        this.f36175g2 = null;
        return null;
    }

    public final boolean Q0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.od1.Q0(boolean):boolean");
    }

    public final int R0() {
        if (ChatObject.isChannelAndNotMegaGroup(-this.J1, this.currentAccount)) {
            return getMessagesController().channelCustomWallpaperLevelMin;
        }
        return getMessagesController().groupCustomWallpaperLevelMin;
    }

    public final ArrayList S0() {
        oy0 oy0Var = new oy0(7, this);
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.m0;
        int i10 = org.telegram.ui.ActionBar.h6.f19059d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(frameLayout, 1, null, null, null, oy0Var, i10));
        z4.g gVar = this.f36182j0;
        int i11 = org.telegram.ui.ActionBar.h6.f19337s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(gVar, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.h6.f19356t8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 256, null, null, null, null, i12));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.h6.A8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar2, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.h6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36202s0, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36202s0, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36202s0, 1024, null, null, null, null, org.telegram.ui.ActionBar.h6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36202s0, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36202s0, Integer.MIN_VALUE, null, null, null, oy0Var, org.telegram.ui.ActionBar.h6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36202s0, 1073741824, null, null, null, oy0Var, org.telegram.ui.ActionBar.h6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36190n0, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 32768, null, null, null, null, i11));
        if (!this.d) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36156b0, 1, null, null, null, null, i10));
            TextView textView = this.f36163d0;
            int i14 = org.telegram.ui.ActionBar.h6.Ae;
            arrayList.add(new org.telegram.ui.ActionBar.j6(textView, 4, null, null, null, null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36160c0, 4, null, null, null, null, i14));
        }
        org.telegram.ui.Components.nq nqVar = this.V;
        if (nqVar != null) {
            org.telegram.ui.ActionBar.u0 u0Var = nqVar.I;
            EditTextBoldCursor[] editTextBoldCursorArr = nqVar.E;
            for (int i15 = 0; i15 < editTextBoldCursorArr.length; i15++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.h6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.j6(editTextBoldCursorArr[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.j6(editTextBoldCursorArr[i15], 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(editTextBoldCursorArr[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.h6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(editTextBoldCursorArr[i15], 32, null, null, null, null, org.telegram.ui.ActionBar.h6.f19186k6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(editTextBoldCursorArr[i15], 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.f19204l6));
            }
            org.telegram.ui.ActionBar.j0 j0Var = nqVar.F;
            int i17 = org.telegram.ui.ActionBar.h6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.j6(j0Var, 8, null, null, null, null, i17));
            org.telegram.ui.ActionBar.j0 j0Var2 = nqVar.F;
            int i18 = org.telegram.ui.ActionBar.h6.I5;
            arrayList.add(new org.telegram.ui.ActionBar.j6(j0Var2, 32, null, null, null, null, i18));
            if (u0Var != null) {
                org.telegram.ui.Components.y6 y6Var = new org.telegram.ui.Components.y6(nqVar, 3);
                arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var, 0, null, null, null, y6Var, i17));
                arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var, 0, null, null, null, y6Var, i18));
                arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.L0;
        if (frameLayoutArr != null) {
            for (int i19 = 0; i19 < frameLayoutArr.length; i19++) {
                arrayList.add(new org.telegram.ui.ActionBar.j6(frameLayoutArr[i19], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19145i3}, null, org.telegram.ui.ActionBar.h6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.j6(frameLayoutArr[i19], 0, null, org.telegram.ui.ActionBar.h6.f19163j2, null, null, org.telegram.ui.ActionBar.h6.Sd));
            }
            int i20 = 0;
            while (true) {
                FrameLayout[] frameLayoutArr2 = this.O0;
                if (i20 >= frameLayoutArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.j6(frameLayoutArr2[i20], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19145i3}, null, org.telegram.ui.ActionBar.h6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.j6(frameLayoutArr2[i20], 0, null, org.telegram.ui.ActionBar.h6.f19163j2, null, null, org.telegram.ui.ActionBar.h6.Sd));
                i20++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.C0, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19145i3}, null, org.telegram.ui.ActionBar.h6.Td));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.C0, 0, null, org.telegram.ui.ActionBar.h6.f19163j2, null, null, org.telegram.ui.ActionBar.h6.Sd));
            int i21 = 0;
            while (true) {
                TextView[] textViewArr = this.N0;
                if (i21 >= textViewArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.j6(textViewArr[i21], 4, null, null, null, null, org.telegram.ui.ActionBar.h6.Ae));
                i21++;
            }
            int i22 = 0;
            while (true) {
                TextView[] textViewArr2 = this.M0;
                if (i22 >= textViewArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.j6(textViewArr2[i22], 4, null, null, null, null, org.telegram.ui.ActionBar.h6.Ae));
                i22++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.T0, 0, new Class[]{org.telegram.ui.Components.so0.class}, new String[]{"innerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Ti));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.T0, 0, new Class[]{org.telegram.ui.Components.so0.class}, new String[]{"outerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Vi));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.S0, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19220m3, org.telegram.ui.ActionBar.h6.f19295q3}, null, org.telegram.ui.ActionBar.h6.f19320ra));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19240n3, org.telegram.ui.ActionBar.h6.f19313r3}, null, org.telegram.ui.ActionBar.h6.f19065dc));
            Drawable[] drawableArr = org.telegram.ui.ActionBar.h6.f19220m3.f18827y;
            int i23 = org.telegram.ui.ActionBar.h6.ta;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.f19295q3.f18827y, null, i23));
            org.telegram.ui.ActionBar.o5 o5Var = this.R;
            org.telegram.ui.ActionBar.o5 o5Var2 = this.T;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{o5Var, o5Var2}, null, org.telegram.ui.ActionBar.h6.Aa));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{o5Var, o5Var2}, null, org.telegram.ui.ActionBar.h6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{o5Var, o5Var2}, null, org.telegram.ui.ActionBar.h6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{o5Var, o5Var2}, null, org.telegram.ui.ActionBar.h6.Fa));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19276p3, org.telegram.ui.ActionBar.h6.f19351t3}, null, org.telegram.ui.ActionBar.h6.Ba));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.h6.f19257o3.f18827y;
            int i24 = org.telegram.ui.ActionBar.h6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr2, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.f19332s3.f18827y, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.ec));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19100fc));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.y3}, null, org.telegram.ui.ActionBar.h6.Ja));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19458z3}, null, org.telegram.ui.ActionBar.h6.Ka));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.A3, org.telegram.ui.ActionBar.h6.C3}, null, org.telegram.ui.ActionBar.h6.La));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.B3, org.telegram.ui.ActionBar.h6.D3}, null, org.telegram.ui.ActionBar.h6.Ma));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.F3, org.telegram.ui.ActionBar.h6.G3}, null, org.telegram.ui.ActionBar.h6.f19341sc));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Uc));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19007ab));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Wc));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.cb));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Yc));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19064db));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19009ad));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19099fb));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19248nd));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19340sb));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19266od));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36206u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.nb));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, oy0Var, org.telegram.ui.ActionBar.h6.f19060d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, oy0Var, org.telegram.ui.ActionBar.h6.f19129h5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, oy0Var, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, oy0Var, org.telegram.ui.ActionBar.h6.f19147i5));
        for (int i25 = 0; i25 < arrayList.size(); i25++) {
            ((org.telegram.ui.ActionBar.j6) arrayList.get(i25)).f19525o = this.f36152a;
        }
        return arrayList;
    }

    public final boolean T0(int i10) {
        int B0;
        long j3;
        if (this.f36173g0) {
            return false;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f36201s;
        if (i10 == 1 || i10 == 2) {
            long j10 = this.I;
            if (j10 != 0) {
                if (j10 != f6Var.f18891j) {
                    return true;
                }
            } else {
                int B02 = org.telegram.ui.ActionBar.h6.B0(org.telegram.ui.ActionBar.h6.Nd);
                int i11 = (int) f6Var.f18891j;
                if (i11 == 0) {
                    i11 = B02;
                }
                if (i11 != B02) {
                    return true;
                }
            }
            long j11 = this.L;
            long j12 = this.K;
            long j13 = this.J;
            if (j13 == 0 && j12 == 0 && j11 == 0) {
                for (int i12 = 0; i12 < 3; i12++) {
                    if (i12 == 0) {
                        B0 = org.telegram.ui.ActionBar.h6.B0(org.telegram.ui.ActionBar.h6.Od);
                        j3 = f6Var.f18892k;
                    } else if (i12 == 1) {
                        B0 = org.telegram.ui.ActionBar.h6.B0(org.telegram.ui.ActionBar.h6.Pd);
                        j3 = f6Var.f18893l;
                    } else {
                        B0 = org.telegram.ui.ActionBar.h6.B0(org.telegram.ui.ActionBar.h6.Qd);
                        j3 = f6Var.f18894m;
                    }
                    int i13 = (int) j3;
                    if (i13 == 0 && j3 != 0) {
                        i13 = 0;
                    } else if (i13 == 0) {
                        i13 = B0;
                    }
                    if (i13 != B0) {
                        return true;
                    }
                }
            } else if (j13 != f6Var.f18892k || j12 != f6Var.f18893l || j11 != f6Var.f18894m) {
                return true;
            }
            if (f6Var.f18895n != this.O) {
                return true;
            }
        }
        if (i10 == 1 || i10 == 3) {
            if (this.f36210w != f6Var.d) {
                return true;
            }
            int i14 = this.f36216y;
            if (i14 != 0) {
                if (i14 != f6Var.e) {
                    return true;
                }
            } else {
                int i15 = f6Var.e;
                if (i15 != 0 && i15 != f6Var.f18887c) {
                    return true;
                }
            }
            int i16 = this.E;
            if (i16 != 0) {
                if (i16 != f6Var.f18888f) {
                    return true;
                }
            } else if (f6Var.f18888f != 0) {
                return true;
            }
            int i17 = this.F;
            if (i17 != 0) {
                if (i17 != f6Var.f18889g) {
                    return true;
                }
            } else if (f6Var.f18889g != 0) {
                return true;
            }
            int i18 = this.G;
            if (i18 != 0) {
                if (i18 != f6Var.h) {
                    return true;
                }
            } else if (f6Var.h != 0) {
                return true;
            }
            if (this.H != f6Var.f18890i) {
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
        float f7;
        t5 t5Var = this.Q1;
        if (t5Var != null) {
            t5Var.invalidate();
        }
        FrameLayout frameLayout = this.f36217y0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f36217y0.getChildAt(i10).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.f36219z0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                this.f36219z0.getChildAt(i11).invalidate();
            }
        }
        if (this.J0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.x81[] x81VarArr = this.J0;
                if (i12 >= x81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.x81 x81Var = x81VarArr[i12];
                if (x81Var != null) {
                    if (this.M1) {
                        f7 = this.f36191n1 * this.f36193o1;
                    } else {
                        f7 = 0.0f;
                    }
                    x81Var.setDimAmount(f7);
                    this.J0[i12].invalidate();
                }
                i12++;
            }
        }
        if (this.f36190n0 != null) {
            for (int i13 = 0; i13 < this.f36190n0.getChildCount(); i13++) {
                View childAt = this.f36190n0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.w0) {
                    d1((org.telegram.ui.Cells.w0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.f36206u0 != null) {
            for (int i14 = 0; i14 < this.f36206u0.getChildCount(); i14++) {
                View childAt2 = this.f36206u0.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                    d1((org.telegram.ui.Cells.w0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        ed1 ed1Var = this.f36220z1;
        if (ed1Var != null) {
            ed1Var.invalidate();
        }
        ed1 ed1Var2 = this.A1;
        if (ed1Var2 != null) {
            ed1Var2.invalidate();
        }
        u4 u4Var = this.C0;
        if (u4Var != null) {
            u4Var.invalidate();
        }
    }

    public final void W0() {
        org.telegram.ui.ActionBar.f6 f6Var = this.f36201s;
        if (f6Var != null && !TextUtils.isEmpty(f6Var.f18896o)) {
            try {
                File d = f6Var.d();
                Drawable background = this.f36214x0.getBackground();
                Bitmap bitmap = this.f36214x0.getImageReceiver().getBitmap();
                if (background instanceof org.telegram.ui.Components.mc0) {
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
                paint.setColorFilter(new PorterDuffColorFilter(this.f36183j1, this.f36203s1));
                paint.setAlpha((int) (this.l1 * 255.0f));
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
        org.telegram.ui.ActionBar.f6 f6Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (getParentActivity() != null && this.f36189n != i10 && this.f36200r1 == null && (f6Var = this.f36201s) != null) {
            if (z10 && i10 == 2 && (org.telegram.ui.ActionBar.h6.Z0() || f6Var.f18891j == 4294967296L)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.ChangeChatBackground);
                if (org.telegram.ui.ActionBar.h6.Z0() && (!org.telegram.ui.ActionBar.h6.Z0() || org.telegram.ui.ActionBar.h6.I.f18944i0.d == 0)) {
                    alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.ChangeWallpaperToColor);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Change), new dc1(this, 7));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                } else {
                    alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.ChangeColorToColor);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new dc1(this, 5));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Continue), new dc1(this, 6));
                }
                showDialog(alertDialog$Builder.f18661a);
                return;
            }
            int i18 = this.f36189n;
            this.f36189n = i10;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        this.h.setText(LocaleController.getString(R.string.ColorPickerMyMessages));
                        if (f6Var.f18888f != 0) {
                            if (f6Var.h != 0) {
                                i17 = 4;
                            } else if (f6Var.f18889g != 0) {
                                i17 = 3;
                            } else {
                                i17 = 2;
                            }
                        } else {
                            i17 = 1;
                        }
                        org.telegram.ui.Components.nq nqVar = this.V;
                        T0(3);
                        nqVar.f(2, 4, i17, true);
                        this.V.e(f6Var.h, 3);
                        this.V.e(f6Var.f18889g, 2);
                        this.V.e(f6Var.f18888f, 1);
                        org.telegram.ui.Components.nq nqVar2 = this.V;
                        int i19 = f6Var.e;
                        if (i19 == 0) {
                            i19 = f6Var.f18887c;
                        }
                        nqVar2.e(i19, 0);
                        this.K0[1].b(0, f6Var.e);
                        this.K0[1].b(1, f6Var.f18888f);
                        this.K0[1].b(2, f6Var.f18889g);
                        this.K0[1].b(3, f6Var.h);
                        if (f6Var.f18889g != 0) {
                            if (i18 == 1) {
                                this.f36208v0.o(0);
                            } else {
                                this.f36208v0.m(0);
                            }
                        } else if (i18 == 2) {
                            this.f36208v0.u(0);
                        }
                        this.f36206u0.v0(0, AndroidUtilities.dp(60.0f), null);
                        e1();
                    }
                } else {
                    this.h.setText(LocaleController.getString(R.string.ColorPickerBackground));
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.Nd);
                    int i20 = org.telegram.ui.ActionBar.h6.Od;
                    if (org.telegram.ui.ActionBar.h6.c1(i20)) {
                        i12 = getThemedColor(i20);
                    } else {
                        i12 = 0;
                    }
                    int i21 = org.telegram.ui.ActionBar.h6.Pd;
                    if (org.telegram.ui.ActionBar.h6.c1(i21)) {
                        i13 = getThemedColor(i21);
                    } else {
                        i13 = 0;
                    }
                    int i22 = org.telegram.ui.ActionBar.h6.Qd;
                    if (org.telegram.ui.ActionBar.h6.c1(i22)) {
                        i14 = getThemedColor(i22);
                    } else {
                        i14 = 0;
                    }
                    long j3 = f6Var.f18892k;
                    int i23 = (int) j3;
                    if (i23 == 0 && j3 != 0) {
                        i12 = 0;
                    }
                    long j10 = f6Var.f18893l;
                    int i24 = (int) j10;
                    if (i24 == 0 && j10 != 0) {
                        i13 = 0;
                    }
                    long j11 = f6Var.f18894m;
                    int i25 = (int) j11;
                    if (i25 == 0 && j11 != 0) {
                        i14 = 0;
                    }
                    int i26 = (int) f6Var.f18891j;
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
                    org.telegram.ui.Components.nq nqVar3 = this.V;
                    T0(2);
                    nqVar3.f(2, 4, i16, false);
                    org.telegram.ui.Components.nq nqVar4 = this.V;
                    if (i25 == 0) {
                        i25 = i14;
                    }
                    nqVar4.e(i25, 3);
                    org.telegram.ui.Components.nq nqVar5 = this.V;
                    if (i15 != 0) {
                        i13 = i15;
                    }
                    nqVar5.e(i13, 2);
                    org.telegram.ui.Components.nq nqVar6 = this.V;
                    if (i23 == 0) {
                        i23 = i12;
                    }
                    nqVar6.e(i23, 1);
                    org.telegram.ui.Components.nq nqVar7 = this.V;
                    if (i26 != 0) {
                        themedColor = i26;
                    }
                    nqVar7.e(themedColor, 0);
                    if (i18 != 1 && f6Var.f18889g != 0) {
                        this.f36208v0.m(0);
                    } else {
                        this.f36208v0.o(0);
                    }
                    this.f36206u0.v0(0, AndroidUtilities.dp(60.0f), null);
                }
            } else {
                this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
                if (f6Var.d != 0) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                org.telegram.ui.Components.nq nqVar8 = this.V;
                T0(1);
                nqVar8.f(1, 2, i11, false);
                this.V.e(f6Var.f18887c, 0);
                int i27 = f6Var.d;
                if (i27 != 0) {
                    this.V.e(i27, 1);
                }
                if (i18 == 2 || (i18 == 3 && f6Var.f18889g != 0)) {
                    this.f36208v0.u(0);
                }
            }
            if (i10 != 1 && i10 != 3) {
                this.V.setMinBrightness(0.0f);
                this.V.setMaxBrightness(1.0f);
                return;
            }
            if (i18 == 2 && this.L0[1].getVisibility() == 0) {
                f1(0, true, true);
            }
            if (i10 == 1) {
                if (this.f36166e0.q()) {
                    this.V.setMinBrightness(0.2f);
                    return;
                }
                this.V.setMinBrightness(0.05f);
                this.V.setMaxBrightness(0.8f);
                return;
            }
            this.V.setMinBrightness(0.0f);
            this.V.setMaxBrightness(1.0f);
        }
    }

    public final void Z0(int i10) {
        TLRPC.TL_wallPaper tL_wallPaper;
        if (i10 >= 0 && i10 < this.U0.size()) {
            tL_wallPaper = (TLRPC.TL_wallPaper) this.U0.get(i10);
        } else {
            tL_wallPaper = this.Y0;
        }
        TLRPC.TL_wallPaper tL_wallPaper2 = tL_wallPaper;
        if (tL_wallPaper2 == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f36162c2;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f36162c2.cancel();
        }
        dd1[] dd1VarArr = this.f36211w0;
        dd1 dd1Var = dd1VarArr[0];
        dd1 dd1Var2 = dd1VarArr[1];
        dd1VarArr[0] = dd1Var2;
        dd1VarArr[1] = dd1Var;
        this.f36204t0.removeView(dd1Var2);
        this.f36204t0.addView(dd1VarArr[0], this.f36204t0.indexOfChild(dd1VarArr[1]) + 1);
        dd1 dd1Var3 = dd1VarArr[0];
        this.f36214x0 = dd1Var3;
        dd1Var3.setBackground(dd1VarArr[1].getBackground());
        k1();
        dd1VarArr[1].setVisibility(0);
        dd1VarArr[1].setAlpha(1.0f);
        this.f36214x0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f36162c2 = ofFloat;
        ofFloat.addUpdateListener(new zi(2, this));
        this.f36162c2.addListener(new sc1(this, 0));
        this.f36162c2.setInterpolator(org.telegram.ui.Components.rr.f28030f);
        this.f36162c2.setDuration(300L);
        this.f36162c2.start();
        this.f36214x0.getImageReceiver().setCrossfadeDuration(300);
        this.f36214x0.getImageReceiver().setImage(ImageLocation.getForDocument(tL_wallPaper2.document), this.G1, null, null, null, tL_wallPaper2.document.size, "jpg", tL_wallPaper2, 1);
        this.f36214x0.d();
        this.W0 = tL_wallPaper2;
        this.E1 = this.J0[2].f30294s;
        j1();
    }

    public final void a1(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.mc0 mc0Var;
        if (i11 == 0) {
            this.Z0 = i10;
        } else if (i11 == 1) {
            this.f36157b1 = i10;
        } else if (i11 == 2) {
            this.f36161c1 = i10;
        } else if (i11 == 3) {
            this.f36164d1 = i10;
        }
        m1(z10);
        if (this.J0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.x81[] x81VarArr = this.J0;
                if (i12 >= x81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.x81 x81Var = x81VarArr[i12];
                if (x81Var != null) {
                    x81Var.b(i11, i10);
                }
                i12++;
            }
        }
        if (this.f36161c1 != 0) {
            if (this.T0 != null && org.telegram.ui.ActionBar.h6.I.q()) {
                this.T0.setTwoSided(true);
            }
            Drawable background = this.f36214x0.getBackground();
            if (background instanceof org.telegram.ui.Components.mc0) {
                mc0Var = (org.telegram.ui.Components.mc0) background;
            } else {
                mc0Var = new org.telegram.ui.Components.mc0();
                mc0Var.r(this.f36214x0);
                if (this.D1) {
                    mc0Var.m(false);
                }
            }
            mc0Var.n(this.Z0, this.f36157b1, this.f36161c1, this.f36164d1);
            this.f36214x0.setBackground(mc0Var);
            this.f36183j1 = mc0Var.f();
            this.f36186k1 = 754974720;
        } else if (this.f36157b1 != 0) {
            this.f36214x0.setBackground(new GradientDrawable(org.telegram.ui.Components.v9.d(this.f36177h1), new int[]{this.Z0, this.f36157b1}));
            int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(this.Z0, this.f36157b1));
            this.f36186k1 = patternColor;
            this.f36183j1 = patternColor;
        } else {
            this.f36214x0.setBackgroundColor(this.Z0);
            int patternColor2 = AndroidUtilities.getPatternColor(this.Z0);
            this.f36186k1 = patternColor2;
            this.f36183j1 = patternColor2;
        }
        int i13 = org.telegram.ui.ActionBar.h6.f19210lc;
        boolean c12 = org.telegram.ui.ActionBar.h6.c1(i13);
        oc1 oc1Var = this.f36152a;
        if (c12 && !(this.f36214x0.getBackground() instanceof org.telegram.ui.Components.mc0)) {
            if (org.telegram.ui.ActionBar.h6.s0() instanceof org.telegram.ui.Components.mc0) {
                getThemedColor(i13);
                oc1Var.b(this.f36214x0.getBackground(), this.f36214x0.getBackground(), Float.valueOf(this.l1));
            }
        } else {
            oc1Var.b(this.f36214x0.getBackground(), this.f36214x0.getBackground(), Float.valueOf(this.l1));
        }
        ImageView imageView = this.F0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f19154ic), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.G0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f19154ic), PorterDuff.Mode.MULTIPLY));
        }
        dd1 dd1Var = this.f36214x0;
        if (dd1Var != null) {
            dd1Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f36183j1, this.f36203s1));
            this.f36214x0.getImageReceiver().setAlpha(Math.abs(this.l1));
            this.f36214x0.invalidate();
            if (org.telegram.ui.ActionBar.h6.I.q() && (this.f36214x0.getBackground() instanceof org.telegram.ui.Components.mc0)) {
                org.telegram.ui.Cells.j0 j0Var = this.T0;
                if (j0Var != null) {
                    j0Var.setTwoSided(true);
                }
                if (this.l1 < 0.0f) {
                    this.f36214x0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.mc0) this.f36214x0.getBackground()).f26442k);
                }
            } else {
                this.f36214x0.getImageReceiver().setGradientBitmap(null);
                org.telegram.ui.Cells.j0 j0Var2 = this.T0;
                if (j0Var2 != null) {
                    j0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.j0 j0Var3 = this.T0;
            if (j0Var3 != null) {
                j0Var3.setProgress(this.l1);
            }
        }
        jc1 jc1Var = this.f36206u0;
        if (jc1Var != null) {
            jc1Var.f1();
        }
        FrameLayout frameLayout = this.f36217y0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                this.f36217y0.getChildAt(i14).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.f36219z0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                this.f36219z0.getChildAt(i15).invalidate();
            }
        }
    }

    public final void b1(boolean z10) {
        org.telegram.ui.Components.mc0 mc0Var;
        org.telegram.ui.Components.mc0 mc0Var2;
        int i10;
        int g10;
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.ActionBar.f6 f6Var = this.f36201s;
        int i11 = this.f36155b;
        if (i11 == 0 && f6Var == null) {
            this.f36214x0.setBackground(org.telegram.ui.ActionBar.h6.r0());
        } else {
            TLRPC.PhotoSize photoSize2 = null;
            BitmapDrawable bitmapDrawable = null;
            if (i11 == 2) {
                Object obj = this.B1;
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
                    dd1 dd1Var = this.f36214x0;
                    dd1Var.f29942a.setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.G1, ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    dd1Var.d();
                } else if (obj instanceof yi1) {
                    yi1 yi1Var = (yi1) obj;
                    int i12 = yi1Var.f40170f;
                    int i13 = yi1Var.e;
                    int i14 = yi1Var.d;
                    int i15 = yi1Var.f40169c;
                    int i16 = yi1Var.f40168b;
                    this.f36177h1 = i12;
                    a1(i16, 0, false);
                    if (i15 != 0) {
                        a1(i15, 1, false);
                    }
                    a1(i14, 2, false);
                    a1(i13, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.W0;
                    if (tL_wallPaper2 != null) {
                        dd1 dd1Var2 = this.f36214x0;
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                        String str = this.G1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.W0;
                        dd1Var2.k(forDocument, str, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                    } else if ("d".equals(yi1Var.f40167a)) {
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        Point point2 = AndroidUtilities.displaySize;
                        int max = Math.max(point2.x, point2.y);
                        if (Build.VERSION.SDK_INT >= 29) {
                            g10 = 1459617792;
                        } else {
                            g10 = org.telegram.ui.Components.mc0.g(i16, i15, i14, i13);
                        }
                        this.f36214x0.setImageBitmap(SvgHelper.getBitmap(R.raw.default_pattern, min, max, g10));
                    }
                } else if (obj instanceof zi1) {
                    Bitmap bitmap = this.C1;
                    if (bitmap != null) {
                        this.f36214x0.setImageBitmap(bitmap);
                    } else {
                        zi1 zi1Var = (zi1) obj;
                        File file = zi1Var.e;
                        if (file != null) {
                            this.f36214x0.f(file.getAbsolutePath(), this.G1, null);
                        } else {
                            File file2 = zi1Var.d;
                            if (file2 != null) {
                                this.f36214x0.f(file2.getAbsolutePath(), this.G1, null);
                            } else if ("t".equals(zi1Var.f40514a)) {
                                dd1 dd1Var3 = this.f36214x0;
                                dd1Var3.setImageDrawable(org.telegram.ui.ActionBar.h6.W0(dd1Var3, false));
                            } else {
                                int i17 = zi1Var.f40515b;
                                if (i17 != 0) {
                                    this.f36214x0.setImageResource(i17);
                                }
                            }
                        }
                    }
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    TLRPC.Photo photo = searchImage.photo;
                    if (photo != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, this.H1, true);
                        if (closestPhotoSizeWithSize2 != closestPhotoSizeWithSize) {
                            photoSize2 = closestPhotoSizeWithSize2;
                        }
                        if (photoSize2 != null) {
                            i10 = photoSize2.size;
                        } else {
                            i10 = 0;
                        }
                        this.f36214x0.k(ImageLocation.getForPhoto(photoSize2, searchImage.photo), this.G1, ImageLocation.getForPhoto(closestPhotoSizeWithSize, searchImage.photo), "100_100_b", i10, "jpg", searchImage, 1);
                    } else {
                        dd1 dd1Var4 = this.f36214x0;
                        String str2 = searchImage.imageUrl;
                        String str3 = this.G1;
                        String str4 = searchImage.thumbUrl;
                        dd1Var4.getClass();
                        dd1Var4.m(ImageLocation.getForPath(str2), str3, ImageLocation.getForPath(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (f6Var == null) {
                this.f36214x0.setBackground(org.telegram.ui.ActionBar.h6.r0());
            } else {
                org.telegram.ui.Components.q9 q9Var = this.f36207u1;
                if (q9Var != null) {
                    q9Var.dispose();
                    this.f36207u1 = null;
                }
                int B0 = org.telegram.ui.ActionBar.h6.B0(org.telegram.ui.ActionBar.h6.Nd);
                int i18 = (int) f6Var.f18891j;
                if (i18 != 0) {
                    B0 = i18;
                }
                int B02 = org.telegram.ui.ActionBar.h6.B0(org.telegram.ui.ActionBar.h6.Od);
                long j3 = f6Var.f18892k;
                int i19 = (int) j3;
                if (i19 == 0 && j3 != 0) {
                    B02 = 0;
                } else if (i19 != 0) {
                    B02 = i19;
                }
                int B03 = org.telegram.ui.ActionBar.h6.B0(org.telegram.ui.ActionBar.h6.Pd);
                long j10 = f6Var.f18893l;
                int i20 = (int) j10;
                if (i20 == 0 && j10 != 0) {
                    B03 = 0;
                } else if (i20 != 0) {
                    B03 = i20;
                }
                int B04 = org.telegram.ui.ActionBar.h6.B0(org.telegram.ui.ActionBar.h6.Qd);
                long j11 = f6Var.f18894m;
                int i21 = (int) j11;
                if (i21 == 0 && j11 != 0) {
                    B04 = 0;
                } else if (i21 != 0) {
                    B04 = i21;
                }
                if (!TextUtils.isEmpty(f6Var.f18896o) && !org.telegram.ui.ActionBar.h6.Z0()) {
                    if (B03 != 0) {
                        Drawable background = this.f36214x0.getBackground();
                        if (background instanceof org.telegram.ui.Components.mc0) {
                            mc0Var2 = (org.telegram.ui.Components.mc0) background;
                        } else {
                            org.telegram.ui.Components.mc0 mc0Var3 = new org.telegram.ui.Components.mc0();
                            mc0Var3.r(this.f36214x0);
                            mc0Var2 = mc0Var3;
                            if (this.D1) {
                                mc0Var3.m(false);
                                mc0Var2 = mc0Var3;
                            }
                        }
                        mc0Var2.n(B0, B02, B03, B04);
                        mc0Var = mc0Var2;
                    } else if (B02 != 0) {
                        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(org.telegram.ui.Components.v9.d(f6Var.f18895n), new int[]{B0, B02});
                        this.f36207u1 = v9Var.f(n2.e.E(0.5f, 3), new wc1(this, 0), 100L);
                        mc0Var = v9Var;
                    } else {
                        mc0Var = new ColorDrawable(B0);
                    }
                    this.f36214x0.setBackground(mc0Var);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.W0;
                    if (tL_wallPaper4 != null) {
                        dd1 dd1Var5 = this.f36214x0;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(tL_wallPaper4.document);
                        String str5 = this.G1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.W0;
                        dd1Var5.k(forDocument2, str5, null, null, tL_wallPaper5.document.size, "jpg", tL_wallPaper5, 1);
                    }
                } else {
                    Drawable s02 = org.telegram.ui.ActionBar.h6.s0();
                    if (s02 != null) {
                        if (s02 instanceof org.telegram.ui.Components.mc0) {
                            ((org.telegram.ui.Components.mc0) s02).r(this.f36214x0);
                        }
                        this.f36214x0.setBackground(s02);
                    }
                }
                if (B02 == 0) {
                    int patternColor = AndroidUtilities.getPatternColor(B0);
                    this.f36186k1 = patternColor;
                    this.f36183j1 = patternColor;
                } else if (B03 != 0) {
                    this.f36183j1 = org.telegram.ui.Components.mc0.g(B0, B02, B03, B04);
                    this.f36186k1 = 754974720;
                } else {
                    int patternColor2 = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(B0, B02));
                    this.f36186k1 = patternColor2;
                    this.f36183j1 = patternColor2;
                }
                dd1 dd1Var6 = this.f36214x0;
                if (dd1Var6 != null) {
                    dd1Var6.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f36183j1, this.f36203s1));
                    this.f36214x0.getImageReceiver().setAlpha(Math.abs(this.l1));
                    this.f36214x0.invalidate();
                    if (org.telegram.ui.ActionBar.h6.I.q() && (this.f36214x0.getBackground() instanceof org.telegram.ui.Components.mc0)) {
                        org.telegram.ui.Cells.j0 j0Var = this.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                        if (this.l1 < 0.0f) {
                            this.f36214x0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.mc0) this.f36214x0.getBackground()).f26442k);
                        }
                    } else {
                        this.f36214x0.getImageReceiver().setGradientBitmap(null);
                        org.telegram.ui.Cells.j0 j0Var2 = this.T0;
                        if (j0Var2 != null) {
                            j0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.j0 j0Var3 = this.T0;
                    if (j0Var3 != null) {
                        j0Var3.setProgress(this.l1);
                    }
                }
                if (this.J0 != null) {
                    int i22 = 0;
                    while (true) {
                        org.telegram.ui.Components.x81[] x81VarArr = this.J0;
                        if (i22 >= x81VarArr.length) {
                            break;
                        }
                        x81VarArr[i22].b(0, B0);
                        this.J0[i22].b(1, B02);
                        this.J0[i22].b(2, B03);
                        this.J0[i22].b(3, B04);
                        i22++;
                    }
                }
                ImageView imageView = this.F0;
                if (imageView != null) {
                    imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f19154ic), PorterDuff.Mode.MULTIPLY));
                }
                ImageView imageView2 = this.G0;
                if (imageView2 != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f19154ic), PorterDuff.Mode.MULTIPLY));
                }
                V0();
            }
        }
        this.D1 = false;
    }

    public final void c1(long j3) {
        boolean z10;
        this.J1 = j3;
        if (j3 != 0 && j3 != getUserConfig().getClientUserId()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.K1 = z10;
    }

    @Override
    public final android.view.View createView(android.content.Context r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.od1.createView(android.content.Context):android.view.View");
    }

    public final void d1(org.telegram.ui.Cells.w0 w0Var) {
        oc1 oc1Var;
        float f7;
        if (this.f36214x0 == null) {
            return;
        }
        Bitmap bitmap = this.f36152a.f36144r;
        float f10 = 0.0f;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f7 = ((this.f36214x0.getMeasuredWidth() - (Math.max(this.f36214x0.getMeasuredWidth() / width, this.f36214x0.getMeasuredHeight() / oc1Var.f36144r.getHeight()) * width)) / 2.0f) + this.X1 + 0.0f;
        } else {
            f7 = this.X1 + 0.0f;
        }
        float y3 = w0Var.getY() - ((-this.f36214x0.J) + 0.0f);
        int measuredHeight = this.f36214x0.getMeasuredHeight();
        if (this.M1) {
            f10 = this.f36191n1 * this.f36193o1;
        }
        w0Var.f21774w0 = true;
        w0Var.f21771v0 = measuredHeight;
        w0Var.f21767t0 = y3;
        w0Var.f21769u0 = f7;
        w0Var.S1 = f10;
        w0Var.T1.setColor(i0.a.k(-16777216, (int) (f10 * 255.0f)));
        w0Var.invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (this.J1 == ((Long) objArr[2]).longValue()) {
                this.V1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                h1(true);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.wl0 wl0Var = this.f36190n0;
            if (wl0Var != null) {
                int childCount = wl0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f36190n0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.s2) {
                        ((org.telegram.ui.Cells.s2) childAt).b0(0, true);
                    }
                }
            }
        } else if (i10 == NotificationCenter.invalidateMotionBackground) {
            jc1 jc1Var = this.f36206u0;
            if (jc1Var != null) {
                jc1Var.f1();
            }
        } else if (i10 == NotificationCenter.didSetNewWallpapper) {
            if (this.f36204t0 != null) {
                b1(true);
            }
        } else if (i10 == NotificationCenter.wallpapersNeedReload) {
            Object obj = this.B1;
            if (obj instanceof zi1) {
                zi1 zi1Var = (zi1) obj;
                if (zi1Var.f40514a == null) {
                    zi1Var.f40514a = (String) objArr[0];
                }
            }
        } else {
            long j3 = 0;
            if (i10 == NotificationCenter.wallpapersDidLoad) {
                ArrayList arrayList = (ArrayList) objArr[0];
                this.U0.clear();
                HashMap hashMap = this.V0;
                hashMap.clear();
                int size = arrayList.size();
                boolean z10 = false;
                for (int i13 = 0; i13 < size; i13++) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i13);
                    if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                        TLRPC.Document document = wallPaper.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f18341id))) {
                            this.U0.add(wallPaper);
                            hashMap.put(Long.valueOf(wallPaper.document.f18341id), wallPaper);
                        }
                        org.telegram.ui.ActionBar.f6 f6Var = this.f36201s;
                        if (f6Var != null && (str = f6Var.f18896o) != null && str.equals(wallPaper.slug)) {
                            this.W0 = (TLRPC.TL_wallPaper) wallPaper;
                            b1(false);
                            j1();
                        } else if (f6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper2 = this.W0;
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
                if (!z10 && (tL_wallPaper = this.W0) != null) {
                    this.U0.add(0, tL_wallPaper);
                }
                md1 md1Var = this.Q0;
                if (md1Var != null) {
                    md1Var.l();
                }
                int size2 = arrayList.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i14);
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        j3 = MediaDataController.calcHash(j3, wallPaper2.f18487id);
                    }
                }
                TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
                getwallpapers.hash = j3;
                ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new hc1(this, 1)), this.classGuid);
            } else if (i10 == NotificationCenter.wallpaperSettedToUser && this.J1 != 0) {
                finishFragment();
            }
        }
    }

    public final void e1() {
        if (this.f36204t0 != null && this.K0 != null && this.f36201s.f18889g != 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("bganimationhint", false)) {
                if (this.A0 == null) {
                    org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(getParentActivity(), 8);
                    this.A0 = j40Var;
                    j40Var.setShowingDuration(5000L);
                    this.A0.setAlpha(0.0f);
                    this.A0.setVisibility(4);
                    this.A0.setText(LocaleController.getString(R.string.BackgroundAnimateInfo));
                    this.A0.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                    this.f36185k0.addView(this.A0, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                AndroidUtilities.runOnUIThread(new p81(6, this, globalMainSettings), 500L);
            }
        }
    }

    public final void f1(int i10, boolean z10, boolean z11) {
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
        if (z10 && i10 == 1 && this.W0 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i17 = this.f36155b;
        if (z10) {
            if (i10 == 0) {
                if (i17 == 2) {
                    this.f36154a1 = this.Z0;
                    int i18 = this.f36157b1;
                    this.f36167e1 = i18;
                    int i19 = this.f36161c1;
                    this.f36171f1 = i19;
                    int i20 = this.f36164d1;
                    this.f36174g1 = i20;
                    this.f36180i1 = this.O;
                    if (i20 != 0) {
                        i16 = 4;
                    } else if (i19 != 0) {
                        i16 = 3;
                    } else if (i18 != 0) {
                        i16 = 2;
                    } else {
                        i16 = 1;
                    }
                    this.V.f(0, 4, i16, false);
                    this.V.e(this.f36164d1, 3);
                    this.V.e(this.f36161c1, 2);
                    this.V.e(this.f36157b1, 1);
                    this.V.e(this.Z0, 0);
                }
            } else {
                this.X0 = this.W0;
                this.f36188m1 = this.l1;
                this.Q0.l();
                ArrayList arrayList = this.U0;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.W0;
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
                    this.R0.h1(i15, (this.P0.getMeasuredWidth() - AndroidUtilities.dp(124.0f)) / 2);
                }
            }
        }
        if (i17 == 1 || i17 == 2) {
            org.telegram.ui.Components.x81[] x81VarArr = this.J0;
            if (z12) {
                c10 = 2;
            } else {
                c10 = 0;
            }
            x81VarArr[c10].setVisibility(0);
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.j0 j0Var = this.T0;
            if (!j0Var.L) {
                float f19 = this.l1;
                if (f19 < 0.0f) {
                    float f20 = -f19;
                    this.l1 = f20;
                    j0Var.setProgress(f20);
                }
            }
        }
        int i21 = 58;
        float f21 = 1.0f;
        FrameLayout[] frameLayoutArr = this.L0;
        if (z11) {
            this.f36200r1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            if (i10 == 0) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            if (z10) {
                frameLayoutArr[i10].setVisibility(0);
                if (i17 == 1) {
                    jc1 jc1Var = this.f36206u0;
                    Property property = View.TRANSLATION_Y;
                    if (i10 == 1) {
                        f16 = -AndroidUtilities.dp(21.0f);
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(jc1Var, property, f16));
                    org.telegram.ui.Components.x81 x81Var = this.J0[2];
                    Property property2 = View.ALPHA;
                    if (z12) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(x81Var, property2, f17));
                    org.telegram.ui.Components.x81 x81Var2 = this.J0[0];
                    if (z12) {
                        f18 = 0.0f;
                    } else {
                        f18 = 1.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(x81Var2, property2, f18));
                    if (i10 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property2, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i12], property2, 0.0f));
                    }
                    AndroidUtilities.hideKeyboard(this.V.E[1]);
                } else if (i17 == 2) {
                    jc1 jc1Var2 = this.f36206u0;
                    Property property3 = View.TRANSLATION_Y;
                    int i22 = -frameLayoutArr[i10].getMeasuredHeight();
                    if (this.A1 == null) {
                        i21 = 0;
                    }
                    int dp = AndroidUtilities.dp(i21 + 72) + i22;
                    if (U0()) {
                        i13 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i13 = 0;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(jc1Var2, property3, dp + i13));
                    org.telegram.ui.Components.x81 x81Var3 = this.J0[2];
                    Property property4 = View.ALPHA;
                    if (z12) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(x81Var3, property4, f15));
                    org.telegram.ui.Components.x81 x81Var4 = this.J0[0];
                    if (z12) {
                        f21 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(x81Var4, property4, f21));
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
                    AndroidUtilities.hideKeyboard(this.V.E[1]);
                }
            } else {
                jc1 jc1Var3 = this.f36206u0;
                Property property5 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(jc1Var3, property5, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property5, frameLayout2.getMeasuredHeight()));
                org.telegram.ui.Components.x81 x81Var5 = this.J0[0];
                Property property6 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(x81Var5, property6, 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.J0[2], property6, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.f36214x0, property6, 1.0f));
            }
            this.f36200r1.playTogether(arrayList2);
            this.f36200r1.addListener(new vc1(this, z10, i12, i10, z12));
            this.f36200r1.setInterpolator(org.telegram.ui.Components.rr.f28031g);
            this.f36200r1.setDuration(200L);
            this.f36200r1.start();
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
                jc1 jc1Var4 = this.f36206u0;
                if (i10 == 1) {
                    f12 = -AndroidUtilities.dp(21.0f);
                } else {
                    f12 = 0.0f;
                }
                jc1Var4.setTranslationY(f12);
                org.telegram.ui.Components.x81 x81Var6 = this.J0[2];
                if (z12) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                x81Var6.setAlpha(f13);
                org.telegram.ui.Components.x81 x81Var7 = this.J0[0];
                if (z12) {
                    f14 = 0.0f;
                } else {
                    f14 = 1.0f;
                }
                x81Var7.setAlpha(f14);
                if (i10 == 1) {
                    frameLayoutArr[i10].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    frameLayoutArr[c11].setAlpha(0.0f);
                }
                AndroidUtilities.hideKeyboard(this.V.E[1]);
            } else if (i17 == 2) {
                jc1 jc1Var5 = this.f36206u0;
                if (i10 == 0) {
                    f7 = 343.0f;
                } else {
                    f7 = 316.0f;
                }
                int i23 = -AndroidUtilities.dp(f7);
                if (this.A1 == null) {
                    i21 = 0;
                }
                int dp2 = AndroidUtilities.dp(i21 + 72) + i23;
                if (U0()) {
                    i11 = AndroidUtilities.navigationBarHeight;
                } else {
                    i11 = 0;
                }
                jc1Var5.setTranslationY(dp2 + i11);
                org.telegram.ui.Components.x81 x81Var8 = this.J0[2];
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                x81Var8.setAlpha(f10);
                org.telegram.ui.Components.x81 x81Var9 = this.J0[0];
                if (z12) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                x81Var9.setAlpha(f11);
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
                AndroidUtilities.hideKeyboard(this.V.E[1]);
            }
        } else {
            this.f36206u0.setTranslationY(0.0f);
            frameLayoutArr[i10].setTranslationY(frameLayout.getMeasuredHeight());
            this.J0[0].setAlpha(1.0f);
            this.J0[2].setAlpha(1.0f);
            this.f36214x0.setAlpha(1.0f);
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
        org.telegram.ui.Components.x81[] x81VarArr2 = this.J0;
        if (!z12) {
            c12 = 2;
        }
        x81VarArr2[c12].setVisibility(4);
    }

    public final void g1() {
        Window window;
        if (this.f36178h2 != null) {
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
        this.O1.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.O1.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        this.O1.getLocationInWindow(iArr);
        float f7 = iArr[0];
        float f10 = iArr[1];
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        kc kcVar = new kc(this, getParentActivity(), canvas, (this.O1.getMeasuredWidth() / 2.0f) + f7, (this.O1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 2);
        this.f36178h2 = kcVar;
        kcVar.setOnTouchListener(new bi.d(2));
        this.f36181i2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f36184j2 = ofFloat;
        ofFloat.addUpdateListener(new ci.ub(this, 3));
        this.f36184j2.addListener(new sc1(this, 4));
        this.f36184j2.setDuration(400L);
        this.f36184j2.setInterpolator(org.telegram.ui.Components.lt.e);
        this.f36184j2.start();
        frameLayout.addView(this.f36178h2, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new bc1(this, 2));
    }

    @Override
    public final int getObserverTag() {
        return this.f36205t1;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.f36152a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.L1) {
            return S0();
        }
        return super.getThemeDescriptions();
    }

    public final void h1(boolean z10) {
        int i10 = (this.J1 > 0L ? 1 : (this.J1 == 0L ? 0 : -1));
        if (i10 > 0) {
            this.f36220z1.d(LocaleController.getString(R.string.ApplyWallpaperForMe));
        } else if (i10 < 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.J1));
            if (chat != null) {
                this.f36220z1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, chat.title));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.V1;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                    if (this.f36197q1 == null) {
                        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(R.drawable.mini_switch_lock, 0);
                        this.f36197q1 = pqVar;
                        pqVar.setTopOffset(1);
                    }
                    spannableStringBuilder.setSpan(this.f36197q1, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", R0(), new Object[0]));
                    this.f36220z1.c(spannableStringBuilder, z10);
                    return;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.V1;
                if (tL_premium_boostsStatus2 == null) {
                    if (this.J1 < 0 && !this.T1 && !this.U1 && tL_premium_boostsStatus2 == null) {
                        this.T1 = true;
                        getMessagesController().getBoostsController().getBoostsStats(this.J1, new ec1(this, 1));
                        return;
                    }
                    return;
                }
                this.f36220z1.c(null, z10);
                return;
            }
            this.f36220z1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, LocaleController.getString(R.string.AccDescrChannel).toLowerCase()));
        } else {
            this.f36220z1.d(LocaleController.getString(R.string.ApplyWallpaper));
        }
    }

    public final void i1() {
        if (this.F1 && this.f36212w1 == null) {
            Bitmap bitmap = this.C1;
            if (bitmap != null) {
                this.f36215x1 = bitmap;
                this.f36212w1 = Utilities.blurWallpaper(bitmap);
            } else {
                ImageReceiver imageReceiver = this.f36214x0.getImageReceiver();
                if (imageReceiver.hasNotThumb() || imageReceiver.hasStaticThumb()) {
                    this.f36215x1 = imageReceiver.getBitmap();
                    this.f36212w1 = Utilities.blurWallpaper(imageReceiver.getBitmap());
                }
            }
        }
        if (this.F1) {
            Bitmap bitmap2 = this.f36212w1;
            if (bitmap2 != null) {
                this.f36214x0.setImageBitmap(bitmap2);
                return;
            }
            return;
        }
        b1(false);
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.f36155b == 2) {
            if (this.a2 && motionEvent != null) {
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
        long j3;
        File file;
        String str;
        float f7;
        FrameLayout frameLayout;
        float f10;
        Object obj = this.W0;
        if (obj == null) {
            obj = this.B1;
        }
        boolean z10 = obj instanceof TLRPC.TL_wallPaper;
        if (z10 || (obj instanceof MediaController.SearchImage)) {
            if (z10) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                str = FileLoader.getAttachFileName(tL_wallPaper.document);
                if (!TextUtils.isEmpty(str)) {
                    file = FileLoader.getInstance(this.currentAccount).getPathToAttach(tL_wallPaper.document, true);
                    j3 = tL_wallPaper.document.size;
                } else {
                    return;
                }
            } else {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                TLRPC.Photo photo = searchImage.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.H1, true);
                    httpFilePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true);
                    name = FileLoader.getAttachFileName(closestPhotoSizeWithSize);
                    i10 = closestPhotoSizeWithSize.size;
                } else {
                    httpFilePath = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                    name = httpFilePath.getName();
                    i10 = searchImage.size;
                }
                j3 = i10;
                String str2 = name;
                file = httpFilePath;
                str = str2;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            }
            boolean exists = file.exists();
            int i11 = this.f36155b;
            if (exists) {
                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                this.f36214x0.invalidate();
                if (i11 == 2) {
                    if (j3 != 0 && this.J1 == 0) {
                        this.f36202s0.setSubtitle(AndroidUtilities.formatFileSize(j3));
                    } else {
                        this.f36202s0.setSubtitle(null);
                    }
                }
            } else {
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(str, null, this);
                if (i11 == 2 && this.J1 == 0) {
                    this.f36202s0.setSubtitle(LocaleController.getString(R.string.LoadingFullImage));
                }
                this.f36214x0.invalidate();
            }
            float f11 = 0.5f;
            if (this.W0 == null && (frameLayout = this.f36217y0) != null) {
                if (exists) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                frameLayout.setAlpha(f10);
            }
            if (i11 == 0) {
                this.f36160c0.setEnabled(exists);
                TextView textView = this.f36160c0;
                if (exists) {
                    f11 = 1.0f;
                }
                textView.setAlpha(f11);
            } else if (i11 == 2) {
                this.C0.setEnabled(exists);
                ed1 ed1Var = this.f36220z1;
                if (ed1Var != null) {
                    if (exists) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.5f;
                    }
                    ed1Var.setAlpha(f7);
                }
                ed1 ed1Var2 = this.A1;
                if (ed1Var2 != null) {
                    if (exists) {
                        f11 = 1.0f;
                    }
                    ed1Var2.setAlpha(f11);
                }
            } else {
                this.f36169f.setEnabled(exists);
                org.telegram.ui.ActionBar.u0 u0Var = this.f36169f;
                if (exists) {
                    f11 = 1.0f;
                }
                u0Var.setAlpha(f11);
            }
        }
    }

    public final void k1() {
        this.f36214x0.getImageReceiver().setAlpha(Math.abs(this.l1));
        this.f36214x0.invalidate();
        this.P0.f1();
        if (this.l1 >= 0.0f) {
            this.f36214x0.getImageReceiver().setGradientBitmap(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f36214x0.getImageReceiver().setBlendMode(null);
            }
            if (this.f36214x0.getBackground() instanceof org.telegram.ui.Components.mc0) {
                this.f36214x0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.mc0) this.f36214x0.getBackground()).f26442k);
            }
        }
        this.f36152a.b(this.f36214x0.getBackground(), this.f36214x0.getBackground(), Float.valueOf(this.l1));
        V0();
    }

    public final void l1() {
        char c10;
        float f7;
        boolean z10;
        boolean z11;
        float f10;
        float f11 = 1.0f;
        float f12 = 0.0f;
        int i10 = this.f36155b;
        if (i10 != 1 && i10 != 2) {
            boolean isEnabled = this.J0[0].isEnabled();
            TLRPC.TL_wallPaper tL_wallPaper = this.W0;
            if (tL_wallPaper != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (isEnabled == z10) {
                return;
            }
            if (tL_wallPaper == null) {
                this.J0[0].a(false, true);
            }
            org.telegram.ui.Components.x81 x81Var = this.J0[0];
            if (this.W0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            x81Var.setEnabled(z11);
            if (this.W0 != null) {
                this.J0[0].setVisibility(0);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            int dp = (AndroidUtilities.dp(9.0f) + ((FrameLayout.LayoutParams) this.J0[1].getLayoutParams()).width) / 2;
            org.telegram.ui.Components.x81 x81Var2 = this.J0[0];
            Property property = View.ALPHA;
            if (this.W0 == null) {
                f11 = 0.0f;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(x81Var2, property, f11));
            org.telegram.ui.Components.x81 x81Var3 = this.J0[0];
            Property property2 = View.TRANSLATION_X;
            if (this.W0 != null) {
                f10 = 0.0f;
            } else {
                f10 = dp;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(x81Var3, property2, f10));
            org.telegram.ui.Components.x81 x81Var4 = this.J0[1];
            if (this.W0 == null) {
                f12 = -dp;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(x81Var4, property2, f12));
            animatorSet.setInterpolator(org.telegram.ui.Components.rr.f28031g);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new uc1(this));
            animatorSet.start();
            return;
        }
        if (this.W0 == null && (this.B1 instanceof yi1)) {
            this.J0[2].a(false, true);
        }
        org.telegram.ui.Components.x81[] x81VarArr = this.J0;
        if (this.W0 != null) {
            c10 = 2;
        } else {
            c10 = 0;
        }
        x81VarArr[c10].setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        org.telegram.ui.Components.x81 x81Var5 = this.J0[2];
        Property property3 = View.ALPHA;
        if (this.W0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x81Var5, property3, f7);
        org.telegram.ui.Components.x81 x81Var6 = this.J0[0];
        if (this.W0 != null) {
            f11 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(x81Var6, property3, f11));
        animatorSet2.addListener(new tc1(this));
        animatorSet2.setInterpolator(org.telegram.ui.Components.rr.f28031g);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }

    public final void m1(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.od1.m1(boolean):void");
    }

    public final void n1() {
        int childCount = this.P0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.P0.getChildAt(i10);
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
            this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.h6.f19129h5));
            if (this.f36155b == 2 && this.J1 != 0) {
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
        int i10 = this.f36155b;
        if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 == 2 || i10 == 1) {
            org.telegram.ui.ActionBar.h6.N = true;
        }
        if (i10 == 0 && this.f36201s == null) {
            this.E1 = org.telegram.ui.ActionBar.h6.f19142i0;
        } else {
            Point point = AndroidUtilities.displaySize;
            int min = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            int max = Math.max(point2.x, point2.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / AndroidUtilities.density));
            sb2.append("_");
            this.G1 = a4.a.o((int) (max / AndroidUtilities.density), "_f", sb2);
            Point point3 = AndroidUtilities.displaySize;
            this.H1 = Math.max(point3.x, point3.y);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            this.f36205t1 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
            if (this.U0 == null) {
                this.U0 = new ArrayList();
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
        ci.m6 m6Var = this.f36185k0;
        if (m6Var != null && this.Q != null) {
            m6Var.getViewTreeObserver().removeOnGlobalLayoutListener(this.Q);
        }
        int i10 = this.f36155b;
        if ((i10 == 2 || i10 == 1) && this.f36195p1 == null) {
            AndroidUtilities.runOnUIThread(new l21(3));
        }
        if (i10 == 2) {
            Bitmap bitmap = this.f36212w1;
            if (bitmap != null) {
                bitmap.recycle();
                this.f36212w1 = null;
            }
            this.f36152a.b(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        } else if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 != 0 || this.f36201s != null) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
        }
        super.onFragmentDestroy();
        P0(null);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.E1) {
            this.f36209v1.c(false);
        }
        org.telegram.ui.ActionBar.h6.f19015b = false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        gd1 gd1Var = this.f36192o0;
        if (gd1Var != null) {
            gd1Var.l();
        }
        kd1 kd1Var = this.f36208v0;
        if (kd1Var != null) {
            kd1Var.l();
        }
        if (this.E1) {
            this.f36209v1.c(true);
        }
        org.telegram.ui.ActionBar.h6.f19015b = true;
    }

    @Override
    public final void onSuccessDownload(String str) {
        j1();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (!z10 && this.f36155b == 2) {
            this.f36152a.b(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.d6 d6Var) {
        this.f36152a.f36139a = d6Var;
    }

    public od1(org.telegram.ui.ActionBar.g6 g6Var, boolean z10, int i10, boolean z11, boolean z12) {
        super(null);
        this.f36152a = new oc1(this);
        this.d = true;
        this.f36189n = 1;
        org.telegram.ui.ActionBar.o5 o5Var = new org.telegram.ui.ActionBar.o5(this, 0, false);
        this.R = o5Var;
        org.telegram.ui.ActionBar.o5 o5Var2 = new org.telegram.ui.ActionBar.o5(this, 0, true);
        this.S = o5Var2;
        org.telegram.ui.ActionBar.o5 o5Var3 = new org.telegram.ui.ActionBar.o5(this, 1, false);
        this.T = o5Var3;
        org.telegram.ui.ActionBar.o5 o5Var4 = new org.telegram.ui.ActionBar.o5(this, 1, true);
        this.U = o5Var4;
        this.X = -1;
        this.Y = new bc1(this, 0);
        this.f36211w0 = new dd1[2];
        this.L0 = new FrameLayout[2];
        this.M0 = new TextView[2];
        this.N0 = new TextView[2];
        this.O0 = new FrameLayout[2];
        this.V0 = new HashMap();
        this.l1 = 0.5f;
        this.f36191n1 = 0.0f;
        this.f36203s1 = PorterDuff.Mode.SRC_IN;
        this.f36218y1 = 1.0f;
        this.G1 = "640_360";
        this.H1 = 1920;
        this.K1 = true;
        this.S1 = new org.telegram.ui.Components.k20(getParentActivity(), new qc1(this));
        this.T1 = false;
        this.U1 = false;
        this.f36155b = i10;
        this.f36170f0 = z12;
        this.f36166e0 = g6Var;
        this.f36176h0 = z10;
        this.f36173g0 = z11;
        if (i10 == 1) {
            org.telegram.ui.ActionBar.f6 k10 = g6Var.k(!z11);
            this.f36201s = k10;
            if (k10 != null) {
                this.d = false;
                this.f36210w = k10.f18887c;
                this.f36213x = k10.d;
                this.f36216y = k10.e;
                this.E = k10.f18888f;
                this.F = k10.f18889g;
                this.G = k10.h;
                this.H = k10.f18890i;
                this.I = k10.f18891j;
                this.J = k10.f18892k;
                this.K = k10.f18893l;
                this.L = k10.f18894m;
                this.M = k10.f18897p;
                this.N = k10.f18896o;
                this.O = k10.f18895n;
            }
        } else {
            if (i10 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.f6 k11 = g6Var.k(false);
            this.f36201s = k11;
            if (k11 != null) {
                this.W0 = k11.f18900s;
            }
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f36201s;
        if (f6Var != null) {
            this.E1 = f6Var.f18898q;
            if (!TextUtils.isEmpty(f6Var.f18896o)) {
                this.l1 = this.f36201s.f18897p;
            }
            org.telegram.ui.ActionBar.h6.M = org.telegram.ui.ActionBar.h6.A0();
            org.telegram.ui.ActionBar.h6.O = true;
            org.telegram.ui.ActionBar.h6.P = true;
            org.telegram.ui.ActionBar.h6.t(g6Var, false, false);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.goingToPreviewTheme, new Object[0]);
        o5Var.v = true;
        o5Var3.v = true;
        o5Var2.v = true;
        o5Var4.v = true;
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
    }

    public od1(org.telegram.ui.ActionBar.g6 g6Var) {
        this(g6Var, false, 0, false, false);
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
