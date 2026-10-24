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
public class pc1 extends org.telegram.ui.ActionBar.o2 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public FrameLayout A0;
    public fc1 A1;
    public org.telegram.ui.Components.p40 B0;
    public fc1 B1;
    public AnimatorSet C0;
    public Object C1;
    public y4 D0;
    public Bitmap D1;
    public final int E;
    public nb1 E0;
    public boolean E1;
    public final int F;
    public nb1 F0;
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
    public oc1 J1;
    public final long K;
    public org.telegram.ui.Components.m91[] K0;
    public long K1;
    public final long L;
    public org.telegram.ui.Components.m91[] L0;
    public boolean L1;
    public final long M;
    public final FrameLayout[] M0;
    public boolean M1;
    public final float N;
    public final TextView[] N0;
    public boolean N1;
    public final String O;
    public final TextView[] O0;
    public org.telegram.ui.Components.xj0 O1;
    public final int P;
    public final FrameLayout[] P0;
    public org.telegram.ui.ActionBar.u0 P1;
    public long Q;
    public wa1 Q0;
    public ValueAnimator Q1;
    public t90 R;
    public nc1 R0;
    public ai.o5 R1;
    public final org.telegram.ui.ActionBar.s5 S;
    public s4.b0 S0;
    public mb1 S1;
    public final org.telegram.ui.ActionBar.s5 T;
    public org.telegram.ui.Cells.l4 T0;
    public final org.telegram.ui.Components.q20 T1;
    public final org.telegram.ui.ActionBar.s5 U;
    public org.telegram.ui.Cells.i0 U0;
    public boolean U1;
    public final org.telegram.ui.ActionBar.s5 V;
    public ArrayList V0;
    public boolean V1;
    public org.telegram.ui.Components.uq W;
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
    public final pb1 f40442a;
    public boolean f40443a0;
    public int f40444a1;
    public float a2;
    public final int f40445b;
    public ei.g6 f40446b0;
    public int f40447b1;
    public boolean f40448b2;
    public Scroller f40449c;
    public FrameLayout f40450c0;
    public int f40451c1;
    public int f40452c2;
    public final boolean d;
    public TextView f40453d0;
    public int f40454d1;
    public ValueAnimator f40455d2;
    public org.telegram.ui.Components.hm e;
    public TextView f40456e0;
    public int f40457e1;
    public boolean f40458e2;
    public org.telegram.ui.ActionBar.u0 f40459f;
    public final org.telegram.ui.ActionBar.j6 f40460f0;
    public int f40461f1;
    public TextView f40462f2;
    public final boolean f40463g0;
    public int f40464g1;
    public WeakReference f40465g2;
    public TextView h;
    public final boolean f40466h0;
    public int f40467h1;
    public BitmapDrawable f40468h2;
    public final boolean f40469i0;
    public int f40470i1;
    public lc f40471i2;
    public ArrayList f40472j0;
    public int f40473j1;
    public float f40474j2;
    public z4.h f40475k0;
    public int f40476k1;
    public ValueAnimator f40477k2;
    public ah.v f40478l0;
    public int l1;
    public UndoView m0;
    public float f40479m1;
    public int f40480n;
    public FrameLayout f40481n0;
    public float f40482n1;
    public org.telegram.ui.Components.lm0 f40483o0;
    public float f40484o1;
    public hc1 f40485p0;
    public float f40486p1;
    public org.telegram.ui.Components.f20 f40487q0;
    public gc1 f40488q1;
    public Drawable f40489r;
    public MessageObject f40490r0;
    public org.telegram.ui.Components.vq f40491r1;
    public int f40492s;
    public boolean f40493s0;
    public AnimatorSet f40494s1;
    public org.telegram.ui.ActionBar.k f40495t0;
    public final PorterDuff.Mode f40496t1;
    public org.telegram.ui.ActionBar.p0 f40497u0;
    public int f40498u1;
    public final org.telegram.ui.ActionBar.i6 v;
    public kb1 f40499v0;
    public org.telegram.ui.Components.o9 f40500v1;
    public boolean f40501w;
    public lc1 f40502w0;
    public org.telegram.ui.Components.o91 f40503w1;
    public final int f40504x;
    public final ec1[] f40505x0;
    public Bitmap f40506x1;
    public final int f40507y;
    public ec1 f40508y0;
    public Bitmap f40509y1;
    public FrameLayout f40510z0;
    public float f40511z1;

    public pc1(Object obj, Bitmap bitmap, boolean z10) {
        super(null);
        this.f40442a = new pb1(this);
        this.d = true;
        this.f40480n = 1;
        org.telegram.ui.ActionBar.s5 s5Var = new org.telegram.ui.ActionBar.s5(this, 0, false);
        this.S = s5Var;
        org.telegram.ui.ActionBar.s5 s5Var2 = new org.telegram.ui.ActionBar.s5(this, 0, true);
        this.T = s5Var2;
        org.telegram.ui.ActionBar.s5 s5Var3 = new org.telegram.ui.ActionBar.s5(this, 1, false);
        this.U = s5Var3;
        org.telegram.ui.ActionBar.s5 s5Var4 = new org.telegram.ui.ActionBar.s5(this, 1, true);
        this.V = s5Var4;
        this.Y = -1;
        this.Z = new cb1(this, 0);
        this.f40505x0 = new ec1[2];
        this.M0 = new FrameLayout[2];
        this.N0 = new TextView[2];
        this.O0 = new TextView[2];
        this.P0 = new FrameLayout[2];
        this.W0 = new HashMap();
        this.f40479m1 = 0.5f;
        this.f40484o1 = 0.0f;
        this.f40496t1 = PorterDuff.Mode.SRC_IN;
        this.f40511z1 = 1.0f;
        this.H1 = "640_360";
        this.I1 = 1920;
        this.L1 = true;
        this.T1 = new org.telegram.ui.Components.q20(getParentActivity(), new rb1(this));
        this.U1 = false;
        this.V1 = false;
        this.f40445b = 2;
        this.C1 = obj;
        this.D1 = bitmap;
        this.E1 = z10;
        if (obj instanceof yh1) {
            yh1 yh1Var = (yh1) obj;
            this.F1 = yh1Var.f43869j;
            TLRPC.TL_wallPaper tL_wallPaper = yh1Var.f43867g;
            this.X0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f7 = yh1Var.h;
                this.f40479m1 = f7;
                if (f7 < 0.0f && !org.telegram.ui.ActionBar.k6.I.q()) {
                    this.f40479m1 *= -1.0f;
                }
            }
        }
        s5Var.v = true;
        s5Var3.v = true;
        s5Var2.v = true;
        s5Var4.v = true;
    }

    public static void U(pc1 pc1Var, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (pc1Var.getParentActivity() == null) {
            return;
        }
        sg.j0 j0Var = new sg.j0(23, pc1Var.currentAccount, pc1Var.getParentActivity(), pc1Var, pc1Var.f40442a);
        j0Var.K1(canApplyBoost);
        j0Var.J1(pc1Var.W1, true);
        j0Var.L1(pc1Var.K1);
        if (!pc1Var.U0()) {
            j0Var.Q0 = new cb1(pc1Var, 1);
        }
        pc1Var.showDialog(j0Var);
    }

    public static void V(pc1 pc1Var) {
        org.telegram.ui.ActionBar.i6 k10;
        org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.M;
        if (j6Var == null) {
            return;
        }
        int i10 = j6Var.Z;
        if (i10 >= 0) {
            k10 = (org.telegram.ui.ActionBar.i6) j6Var.f21021a0.get(i10);
        } else {
            k10 = j6Var.k(false);
        }
        if (pc1Var.v != null) {
            pc1Var.W0();
            org.telegram.ui.ActionBar.k6.w1(pc1Var.f40460f0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.k6.M != null) {
                org.telegram.ui.ActionBar.k6.O = false;
                org.telegram.ui.ActionBar.k6.P = false;
                org.telegram.ui.ActionBar.k6.M = null;
            }
            org.telegram.ui.ActionBar.k6.t(pc1Var.f40460f0, true, pc1Var.f40463g0);
            ((ActionBarLayout) pc1Var.parentLayout).V(false, false);
        } else {
            ((ActionBarLayout) pc1Var.parentLayout).V(false, false);
            File file = new File(pc1Var.f40460f0.f21022b);
            org.telegram.ui.ActionBar.j6 j6Var2 = pc1Var.f40460f0;
            org.telegram.ui.ActionBar.k6.u(file, j6Var2.f21020a, j6Var2.F, false);
            MessagesController.getInstance(pc1Var.f40460f0.E).saveTheme(pc1Var.f40460f0, null, false, false);
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", pc1Var.f40460f0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) pc1Var.getParentLayout().getFragmentStack().get(Math.max(0, pc1Var.getParentLayout().getFragmentStack().size() - 2));
        pc1Var.finishFragment();
        if (pc1Var.f40445b == 0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didApplyNewTheme, j6Var, k10, Boolean.valueOf(pc1Var.f40469i0));
        }
        org.telegram.ui.ActionBar.k6.J1(o2Var);
    }

    public static void W(pc1 pc1Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = pc1Var.W0;
        org.telegram.ui.ActionBar.i6 i6Var = pc1Var.v;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            pc1Var.V0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_wallPapers.wallpapers.get(i10) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i10);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f20350id))) {
                            pc1Var.V0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.f20350id), tL_wallPaper2);
                        }
                        if (i6Var != null && (str = i6Var.f20976o) != null && str.equals(tL_wallPaper2.slug)) {
                            pc1Var.X0 = tL_wallPaper2;
                            pc1Var.b1(false);
                            pc1Var.j1();
                        } else if (i6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = pc1Var.X0;
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
            if (!z10 && (tL_wallPaper = pc1Var.X0) != null) {
                pc1Var.V0.add(0, tL_wallPaper);
            }
            nc1 nc1Var = pc1Var.R0;
            if (nc1Var != null) {
                nc1Var.l();
            }
            MessagesStorage.getInstance(pc1Var.currentAccount).putWallpapers(tL_wallPapers.wallpapers, 1);
        }
        if (pc1Var.X0 == null && i6Var != null && !TextUtils.isEmpty(i6Var.f20976o)) {
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = i6Var.f20976o;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(pc1Var.currentAccount).bindRequestToGuid(pc1Var.getConnectionsManager().sendRequest(getwallpaper, new ib1(pc1Var, 0)), pc1Var.classGuid);
        }
    }

    public final void L0() {
        AnimatorSet animatorSet = this.C0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.C0 = animatorSet2;
        if (this.F1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f40508y0, View.SCALE_X, this.f40511z1), ObjectAnimator.ofFloat(this.f40508y0, View.SCALE_Y, this.f40511z1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f40508y0, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f40508y0, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f40508y0, View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f40508y0, View.TRANSLATION_Y, 0.0f));
        }
        this.C0.setInterpolator(org.telegram.ui.Components.zr.f33338g);
        this.C0.addListener(new tb1(this, 1));
        this.C0.start();
    }

    public final void M0(boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pc1.M0(boolean):void");
    }

    public final void N0(boolean z10) {
        int i10 = this.f40445b;
        if (i10 == 2) {
            if (!z10) {
                finishFragment();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.k6.o();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        org.telegram.ui.ActionBar.i6 i6Var = this.v;
        if (i10 == 1) {
            if (this.f40466h0) {
                i6Var.f20967c = this.f40504x;
                i6Var.d = this.f40507y;
                i6Var.e = this.E;
                i6Var.f20968f = this.F;
                i6Var.f20969g = this.G;
                i6Var.h = this.H;
                i6Var.f20970i = this.I;
                i6Var.f20971j = this.J;
                i6Var.f20972k = this.K;
                i6Var.f20973l = this.L;
                i6Var.f20974m = this.M;
                i6Var.f20975n = this.P;
                i6Var.f20976o = this.O;
                i6Var.f20977p = this.N;
            }
            org.telegram.ui.ActionBar.k6.w1(this.f40460f0, false, true, false, false, false);
        } else {
            if (i6Var != null) {
                org.telegram.ui.ActionBar.k6.w1(this.f40460f0, false, this.f40469i0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).V(false, false);
            if (this.f40469i0) {
                org.telegram.ui.ActionBar.j6 j6Var = this.f40460f0;
                if (j6Var.f21022b != null && org.telegram.ui.ActionBar.k6.H.get(j6Var.m()) == null) {
                    new File(j6Var.f21022b).delete();
                }
            }
        }
        if (!z10) {
            finishFragment();
        }
    }

    public final BitmapDrawable O0(Drawable drawable) {
        WeakReference weakReference = this.f40465g2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.f40468h2;
        }
        WeakReference weakReference2 = this.f40465g2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f40465g2 = null;
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            this.f40465g2 = new WeakReference(drawable);
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
            this.f40468h2 = bitmapDrawable;
            bitmapDrawable.setFilterBitmap(true);
            return this.f40468h2;
        }
        this.f40468h2 = null;
        return null;
    }

    public final boolean P0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pc1.P0(boolean):boolean");
    }

    public final void Q0() {
        int themedColor;
        org.telegram.ui.Components.hm hmVar = this.e;
        int i10 = 0;
        if (hmVar != null) {
            hmVar.B(getThemedColor(org.telegram.ui.ActionBar.k6.G8));
            this.e.G(getThemedColor(org.telegram.ui.ActionBar.k6.E8), false);
        }
        if (this.f40489r != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6)) != this.f40492s) {
            this.f40492s = themedColor;
            this.f40489r.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        y4 y4Var = this.D0;
        if (y4Var != null) {
            y4Var.invalidate();
        }
        if (this.f40488q1 != null) {
            org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
            if (h5Var != null && h5Var.getBottomSheet() != null) {
                this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5));
                if (this.f40445b == 2 && this.K1 != 0) {
                    this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            } else {
                setNavigationBarColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5));
            }
        }
        if (this.K0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.m91[] m91VarArr = this.K0;
                if (i11 >= m91VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.m91 m91Var = m91VarArr[i11];
                if (m91Var != null) {
                    m91Var.invalidate();
                }
                i11++;
            }
        }
        if (this.L0 != null) {
            while (true) {
                org.telegram.ui.Components.m91[] m91VarArr2 = this.L0;
                if (i10 >= m91VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.m91 m91Var2 = m91VarArr2[i10];
                if (m91Var2 != null) {
                    m91Var2.invalidate();
                }
                i10++;
            }
        }
        TextView textView = this.f40462f2;
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, this.f40442a);
        }
        org.telegram.ui.Components.uq uqVar = this.W;
        if (uqVar != null) {
            uqVar.invalidate();
        }
        org.telegram.ui.Components.f20 f20Var = this.f40487q0;
        if (f20Var != null) {
            f20Var.updateColors();
        }
    }

    public final int R0() {
        if (ChatObject.isChannelAndNotMegaGroup(-this.K1, this.currentAccount)) {
            return getMessagesController().channelCustomWallpaperLevelMin;
        }
        return getMessagesController().groupCustomWallpaperLevelMin;
    }

    public final ArrayList S0() {
        i6 i6Var = new i6(24, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40475k0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21463s8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40495t0, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40495t0, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.E8));
        org.telegram.ui.Components.uq uqVar = this.W;
        if (uqVar != null) {
            org.telegram.ui.ActionBar.u0 u0Var = uqVar.I;
            EditTextBoldCursor[] editTextBoldCursorArr = uqVar.E;
            for (int i10 = 0; i10 < editTextBoldCursorArr.length; i10++) {
                arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursorArr[i10], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursorArr[i10], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21311k6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursorArr[i10], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21328l6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(uqVar.F, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I5));
            if (u0Var != null) {
                org.telegram.ui.Components.x6 x6Var = new org.telegram.ui.Components.x6(uqVar, 2);
                arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, org.telegram.ui.ActionBar.k6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, org.telegram.ui.ActionBar.k6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, org.telegram.ui.ActionBar.k6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, org.telegram.ui.ActionBar.k6.G8));
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
            org.telegram.ui.ActionBar.s5 s5Var = this.S;
            org.telegram.ui.ActionBar.s5 s5Var2 = this.U;
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40499v0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, new Drawable[]{s5Var, s5Var2}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40499v0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, new Drawable[]{s5Var, s5Var2}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40499v0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, new Drawable[]{s5Var, s5Var2}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Fa));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40499v0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Wc));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40499v0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21170cb));
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            ((org.telegram.ui.ActionBar.t6) arrayList.get(i15)).f21869n = this.f40442a;
        }
        return arrayList;
    }

    public final boolean T0(int i10) {
        int D0;
        long j10;
        if (this.f40466h0) {
            return false;
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.v;
        if (i10 == 1 || i10 == 2) {
            long j11 = this.J;
            if (j11 != 0) {
                if (j11 != i6Var.f20971j) {
                    return true;
                }
            } else {
                int D02 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Nd);
                int i11 = (int) i6Var.f20971j;
                if (i11 == 0) {
                    i11 = D02;
                }
                if (i11 != D02) {
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
                        D0 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Od);
                        j10 = i6Var.f20972k;
                    } else if (i13 == 1) {
                        D0 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Pd);
                        j10 = i6Var.f20973l;
                    } else {
                        D0 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Qd);
                        j10 = i6Var.f20974m;
                    }
                    int i14 = (int) j10;
                    if (i14 == 0 && j10 != 0) {
                        i14 = 0;
                    } else if (i14 == 0) {
                        i14 = D0;
                    }
                    if (i14 != D0) {
                        return true;
                    }
                }
            } else if (j12 != i6Var.f20972k || j14 != i6Var.f20973l || j13 != i6Var.f20974m) {
                return true;
            }
            if (i6Var.f20975n != this.P) {
                return true;
            }
        }
        if (i10 == 1 || i10 == 3) {
            if (this.f40504x != i6Var.d) {
                return true;
            }
            int i15 = this.E;
            if (i15 != 0) {
                if (i15 != i6Var.e) {
                    return true;
                }
            } else {
                int i16 = i6Var.e;
                if (i16 != 0 && i16 != i6Var.f20967c) {
                    return true;
                }
            }
            int i17 = this.F;
            if (i17 != 0) {
                if (i17 != i6Var.f20968f) {
                    return true;
                }
            } else if (i6Var.f20968f != 0) {
                return true;
            }
            int i18 = this.G;
            if (i18 != 0) {
                if (i18 != i6Var.f20969g) {
                    return true;
                }
            } else if (i6Var.f20969g != 0) {
                return true;
            }
            int i19 = this.H;
            if (i19 != 0) {
                if (i19 != i6Var.h) {
                    return true;
                }
            } else if (i6Var.h != 0) {
                return true;
            }
            if (this.I != i6Var.f20970i) {
                return true;
            }
        }
        return false;
    }

    public boolean U0() {
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var != null && h5Var.getBottomSheet() != null) {
            return true;
        }
        return false;
    }

    public final void V0() {
        float f7;
        ai.o5 o5Var = this.R1;
        if (o5Var != null) {
            o5Var.invalidate();
        }
        FrameLayout frameLayout = this.f40510z0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f40510z0.getChildAt(i10).invalidate();
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
                org.telegram.ui.Components.m91[] m91VarArr = this.K0;
                if (i12 >= m91VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.m91 m91Var = m91VarArr[i12];
                if (m91Var != null) {
                    if (this.N1) {
                        f7 = this.f40484o1 * this.f40486p1;
                    } else {
                        f7 = 0.0f;
                    }
                    m91Var.setDimAmount(f7);
                    this.K0[i12].invalidate();
                }
                i12++;
            }
        }
        if (this.f40483o0 != null) {
            for (int i13 = 0; i13 < this.f40483o0.getChildCount(); i13++) {
                View childAt = this.f40483o0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.v0) {
                    d1((org.telegram.ui.Cells.v0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.f40499v0 != null) {
            for (int i14 = 0; i14 < this.f40499v0.getChildCount(); i14++) {
                View childAt2 = this.f40499v0.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                    d1((org.telegram.ui.Cells.v0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        fc1 fc1Var = this.A1;
        if (fc1Var != null) {
            fc1Var.invalidate();
        }
        fc1 fc1Var2 = this.B1;
        if (fc1Var2 != null) {
            fc1Var2.invalidate();
        }
        y4 y4Var = this.D0;
        if (y4Var != null) {
            y4Var.invalidate();
        }
    }

    public final void W0() {
        org.telegram.ui.ActionBar.i6 i6Var = this.v;
        if (i6Var != null && !TextUtils.isEmpty(i6Var.f20976o)) {
            try {
                File d = i6Var.d();
                Drawable background = this.f40508y0.getBackground();
                Bitmap bitmap = this.f40508y0.getImageReceiver().getBitmap();
                if (background instanceof org.telegram.ui.Components.wc0) {
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
                paint.setColorFilter(new PorterDuffColorFilter(this.f40476k1, this.f40496t1));
                paint.setAlpha((int) (this.f40479m1 * 255.0f));
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
        org.telegram.ui.ActionBar.i6 i6Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (getParentActivity() != null && this.f40480n != i10 && this.f40494s1 == null && (i6Var = this.v) != null) {
            if (z10 && i10 == 2 && (org.telegram.ui.ActionBar.k6.b1() || i6Var.f20971j == 4294967296L)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.ChangeChatBackground);
                if (org.telegram.ui.ActionBar.k6.b1() && (!org.telegram.ui.ActionBar.k6.b1() || org.telegram.ui.ActionBar.k6.I.f21032i0.d == 0)) {
                    alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ChangeWallpaperToColor);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Change), new eb1(this, 7));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                } else {
                    alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ChangeColorToColor);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new eb1(this, 5));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Continue), new eb1(this, 6));
                }
                showDialog(alertDialog$Builder.f20679a);
                return;
            }
            int i18 = this.f40480n;
            this.f40480n = i10;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        this.h.setText(LocaleController.getString(R.string.ColorPickerMyMessages));
                        if (i6Var.f20968f != 0) {
                            if (i6Var.h != 0) {
                                i17 = 4;
                            } else if (i6Var.f20969g != 0) {
                                i17 = 3;
                            } else {
                                i17 = 2;
                            }
                        } else {
                            i17 = 1;
                        }
                        org.telegram.ui.Components.uq uqVar = this.W;
                        T0(3);
                        uqVar.f(2, 4, i17, true);
                        this.W.e(i6Var.h, 3);
                        this.W.e(i6Var.f20969g, 2);
                        this.W.e(i6Var.f20968f, 1);
                        org.telegram.ui.Components.uq uqVar2 = this.W;
                        int i19 = i6Var.e;
                        if (i19 == 0) {
                            i19 = i6Var.f20967c;
                        }
                        uqVar2.e(i19, 0);
                        this.L0[1].b(0, i6Var.e);
                        this.L0[1].b(1, i6Var.f20968f);
                        this.L0[1].b(2, i6Var.f20969g);
                        this.L0[1].b(3, i6Var.h);
                        if (i6Var.f20969g != 0) {
                            if (i18 == 1) {
                                this.f40502w0.o(0);
                            } else {
                                this.f40502w0.m(0);
                            }
                        } else if (i18 == 2) {
                            this.f40502w0.u(0);
                        }
                        this.f40499v0.v0(0, AndroidUtilities.dp(60.0f), null);
                        e1();
                    }
                } else {
                    this.h.setText(LocaleController.getString(R.string.ColorPickerBackground));
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Nd);
                    int i20 = org.telegram.ui.ActionBar.k6.Od;
                    if (org.telegram.ui.ActionBar.k6.e1(i20)) {
                        i12 = getThemedColor(i20);
                    } else {
                        i12 = 0;
                    }
                    int i21 = org.telegram.ui.ActionBar.k6.Pd;
                    if (org.telegram.ui.ActionBar.k6.e1(i21)) {
                        i13 = getThemedColor(i21);
                    } else {
                        i13 = 0;
                    }
                    int i22 = org.telegram.ui.ActionBar.k6.Qd;
                    if (org.telegram.ui.ActionBar.k6.e1(i22)) {
                        i14 = getThemedColor(i22);
                    } else {
                        i14 = 0;
                    }
                    long j10 = i6Var.f20972k;
                    int i23 = (int) j10;
                    if (i23 == 0 && j10 != 0) {
                        i12 = 0;
                    }
                    long j11 = i6Var.f20973l;
                    int i24 = (int) j11;
                    if (i24 == 0 && j11 != 0) {
                        i13 = 0;
                    }
                    long j12 = i6Var.f20974m;
                    int i25 = (int) j12;
                    if (i25 == 0 && j12 != 0) {
                        i14 = 0;
                    }
                    int i26 = (int) i6Var.f20971j;
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
                    org.telegram.ui.Components.uq uqVar3 = this.W;
                    T0(2);
                    uqVar3.f(2, 4, i16, false);
                    org.telegram.ui.Components.uq uqVar4 = this.W;
                    if (i25 == 0) {
                        i25 = i14;
                    }
                    uqVar4.e(i25, 3);
                    org.telegram.ui.Components.uq uqVar5 = this.W;
                    if (i15 != 0) {
                        i13 = i15;
                    }
                    uqVar5.e(i13, 2);
                    org.telegram.ui.Components.uq uqVar6 = this.W;
                    if (i23 == 0) {
                        i23 = i12;
                    }
                    uqVar6.e(i23, 1);
                    org.telegram.ui.Components.uq uqVar7 = this.W;
                    if (i26 != 0) {
                        themedColor = i26;
                    }
                    uqVar7.e(themedColor, 0);
                    if (i18 != 1 && i6Var.f20969g != 0) {
                        this.f40502w0.m(0);
                    } else {
                        this.f40502w0.o(0);
                    }
                    this.f40499v0.v0(0, AndroidUtilities.dp(60.0f), null);
                }
            } else {
                this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
                if (i6Var.d != 0) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                org.telegram.ui.Components.uq uqVar8 = this.W;
                T0(1);
                uqVar8.f(1, 2, i11, false);
                this.W.e(i6Var.f20967c, 0);
                int i27 = i6Var.d;
                if (i27 != 0) {
                    this.W.e(i27, 1);
                }
                if (i18 == 2 || (i18 == 3 && i6Var.f20969g != 0)) {
                    this.f40502w0.u(0);
                }
            }
            if (i10 != 1 && i10 != 3) {
                this.W.setMinBrightness(0.0f);
                this.W.setMaxBrightness(1.0f);
                return;
            }
            if (i18 == 2 && this.M0[1].getVisibility() == 0) {
                f1(0, true, true);
            }
            if (i10 == 1) {
                if (this.f40460f0.q()) {
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

    public final void Z0(int i10) {
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
        ValueAnimator valueAnimator = this.f40455d2;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f40455d2.cancel();
        }
        ec1[] ec1VarArr = this.f40505x0;
        ec1 ec1Var = ec1VarArr[0];
        ec1 ec1Var2 = ec1VarArr[1];
        ec1VarArr[0] = ec1Var2;
        ec1VarArr[1] = ec1Var;
        this.f40497u0.removeView(ec1Var2);
        this.f40497u0.addView(ec1VarArr[0], this.f40497u0.indexOfChild(ec1VarArr[1]) + 1);
        ec1 ec1Var3 = ec1VarArr[0];
        this.f40508y0 = ec1Var3;
        ec1Var3.setBackground(ec1VarArr[1].getBackground());
        k1();
        ec1VarArr[1].setVisibility(0);
        ec1VarArr[1].setAlpha(1.0f);
        this.f40508y0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f40455d2 = ofFloat;
        ofFloat.addUpdateListener(new ui(2, this));
        this.f40455d2.addListener(new tb1(this, 0));
        this.f40455d2.setInterpolator(org.telegram.ui.Components.zr.f33337f);
        this.f40455d2.setDuration(300L);
        this.f40455d2.start();
        this.f40508y0.getImageReceiver().setCrossfadeDuration(300);
        this.f40508y0.getImageReceiver().setImage(ImageLocation.getForDocument(tL_wallPaper2.document), this.H1, null, null, null, tL_wallPaper2.document.size, "jpg", tL_wallPaper2, 1);
        this.f40508y0.d();
        this.X0 = tL_wallPaper2;
        this.F1 = this.K0[2].f28542s;
        j1();
    }

    public final void a1(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.wc0 wc0Var;
        if (i11 == 0) {
            this.f40444a1 = i10;
        } else if (i11 == 1) {
            this.f40451c1 = i10;
        } else if (i11 == 2) {
            this.f40454d1 = i10;
        } else if (i11 == 3) {
            this.f40457e1 = i10;
        }
        m1(z10);
        if (this.K0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.m91[] m91VarArr = this.K0;
                if (i12 >= m91VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.m91 m91Var = m91VarArr[i12];
                if (m91Var != null) {
                    m91Var.b(i11, i10);
                }
                i12++;
            }
        }
        if (this.f40454d1 != 0) {
            if (this.U0 != null && org.telegram.ui.ActionBar.k6.I.q()) {
                this.U0.setTwoSided(true);
            }
            Drawable background = this.f40508y0.getBackground();
            if (background instanceof org.telegram.ui.Components.wc0) {
                wc0Var = (org.telegram.ui.Components.wc0) background;
            } else {
                wc0Var = new org.telegram.ui.Components.wc0();
                wc0Var.q(this.f40508y0);
                if (this.E1) {
                    wc0Var.m(false);
                }
            }
            wc0Var.n(this.f40444a1, this.f40451c1, this.f40454d1, this.f40457e1);
            this.f40508y0.setBackground(wc0Var);
            this.f40476k1 = wc0Var.f();
            this.l1 = 754974720;
        } else if (this.f40451c1 != 0) {
            this.f40508y0.setBackground(new GradientDrawable(org.telegram.ui.Components.t9.d(this.f40470i1), new int[]{this.f40444a1, this.f40451c1}));
            int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(this.f40444a1, this.f40451c1));
            this.l1 = patternColor;
            this.f40476k1 = patternColor;
        } else {
            this.f40508y0.setBackgroundColor(this.f40444a1);
            int patternColor2 = AndroidUtilities.getPatternColor(this.f40444a1);
            this.l1 = patternColor2;
            this.f40476k1 = patternColor2;
        }
        int i13 = org.telegram.ui.ActionBar.k6.f21334lc;
        boolean e12 = org.telegram.ui.ActionBar.k6.e1(i13);
        pb1 pb1Var = this.f40442a;
        if (e12 && !(this.f40508y0.getBackground() instanceof org.telegram.ui.Components.wc0)) {
            if (org.telegram.ui.ActionBar.k6.t0() instanceof org.telegram.ui.Components.wc0) {
                getThemedColor(i13);
                pb1Var.j(this.f40508y0.getBackground(), this.f40508y0.getBackground(), Float.valueOf(this.f40479m1));
            }
        } else {
            pb1Var.j(this.f40508y0.getBackground(), this.f40508y0.getBackground(), Float.valueOf(this.f40479m1));
        }
        ImageView imageView = this.G0;
        if (imageView != null) {
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f21278ic, pb1Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.H0;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.f21278ic, pb1Var, PorterDuff.Mode.MULTIPLY);
        }
        ec1 ec1Var = this.f40508y0;
        if (ec1Var != null) {
            ec1Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f40476k1, this.f40496t1));
            this.f40508y0.getImageReceiver().setAlpha(Math.abs(this.f40479m1));
            this.f40508y0.invalidate();
            if (org.telegram.ui.ActionBar.k6.I.q() && (this.f40508y0.getBackground() instanceof org.telegram.ui.Components.wc0)) {
                org.telegram.ui.Cells.i0 i0Var = this.U0;
                if (i0Var != null) {
                    i0Var.setTwoSided(true);
                }
                if (this.f40479m1 < 0.0f) {
                    this.f40508y0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.wc0) this.f40508y0.getBackground()).f32200k);
                }
            } else {
                this.f40508y0.getImageReceiver().setGradientBitmap(null);
                org.telegram.ui.Cells.i0 i0Var2 = this.U0;
                if (i0Var2 != null) {
                    i0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.i0 i0Var3 = this.U0;
            if (i0Var3 != null) {
                i0Var3.setProgress(this.f40479m1);
            }
        }
        kb1 kb1Var = this.f40499v0;
        if (kb1Var != null) {
            kb1Var.g1();
        }
        FrameLayout frameLayout = this.f40510z0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                this.f40510z0.getChildAt(i14).invalidate();
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

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21272i5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21255h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21372nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21392od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21466sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21374nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21224fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21132ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21130ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21467sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.La));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21206ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ca));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ba));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Aa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21484ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21189dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21445ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ti));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
    }

    public final void b1(boolean z10) {
        org.telegram.ui.Components.wc0 wc0Var;
        org.telegram.ui.Components.wc0 wc0Var2;
        int i10;
        int g10;
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.ActionBar.i6 i6Var = this.v;
        int i11 = this.f40445b;
        if (i11 == 0 && i6Var == null) {
            this.f40508y0.setBackground(org.telegram.ui.ActionBar.k6.s0());
        } else {
            TLRPC.PhotoSize photoSize2 = null;
            BitmapDrawable bitmapDrawable = null;
            if (i11 == 2) {
                Object obj = this.C1;
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
                    ec1 ec1Var = this.f40508y0;
                    ec1Var.f31064a.setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.H1, ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    ec1Var.d();
                } else if (obj instanceof yh1) {
                    yh1 yh1Var = (yh1) obj;
                    int i12 = yh1Var.f43866f;
                    int i13 = yh1Var.e;
                    int i14 = yh1Var.d;
                    int i15 = yh1Var.f43865c;
                    int i16 = yh1Var.f43864b;
                    this.f40470i1 = i12;
                    a1(i16, 0, false);
                    if (i15 != 0) {
                        a1(i15, 1, false);
                    }
                    a1(i14, 2, false);
                    a1(i13, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.X0;
                    if (tL_wallPaper2 != null) {
                        ec1 ec1Var2 = this.f40508y0;
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                        String str = this.H1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.X0;
                        ec1Var2.k(forDocument, str, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                    } else if ("d".equals(yh1Var.f43863a)) {
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        Point point2 = AndroidUtilities.displaySize;
                        int max = Math.max(point2.x, point2.y);
                        if (Build.VERSION.SDK_INT >= 29) {
                            g10 = 1459617792;
                        } else {
                            g10 = org.telegram.ui.Components.wc0.g(i16, i15, i14, i13);
                        }
                        this.f40508y0.setImageBitmap(SvgHelper.getBitmap(R.raw.default_pattern, min, max, g10));
                    }
                } else if (obj instanceof zh1) {
                    Bitmap bitmap = this.D1;
                    if (bitmap != null) {
                        this.f40508y0.setImageBitmap(bitmap);
                    } else {
                        zh1 zh1Var = (zh1) obj;
                        File file = zh1Var.e;
                        if (file != null) {
                            this.f40508y0.g(file.getAbsolutePath(), this.H1, null);
                        } else {
                            File file2 = zh1Var.d;
                            if (file2 != null) {
                                this.f40508y0.g(file2.getAbsolutePath(), this.H1, null);
                            } else if ("t".equals(zh1Var.f44110a)) {
                                ec1 ec1Var3 = this.f40508y0;
                                ec1Var3.setImageDrawable(org.telegram.ui.ActionBar.k6.Y0(ec1Var3, false));
                            } else {
                                int i17 = zh1Var.f44111b;
                                if (i17 != 0) {
                                    this.f40508y0.setImageResource(i17);
                                }
                            }
                        }
                    }
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    TLRPC.Photo photo = searchImage.photo;
                    if (photo != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, this.I1, true);
                        if (closestPhotoSizeWithSize2 != closestPhotoSizeWithSize) {
                            photoSize2 = closestPhotoSizeWithSize2;
                        }
                        if (photoSize2 != null) {
                            i10 = photoSize2.size;
                        } else {
                            i10 = 0;
                        }
                        this.f40508y0.k(ImageLocation.getForPhoto(photoSize2, searchImage.photo), this.H1, ImageLocation.getForPhoto(closestPhotoSizeWithSize, searchImage.photo), "100_100_b", i10, "jpg", searchImage, 1);
                    } else {
                        ec1 ec1Var4 = this.f40508y0;
                        String str2 = searchImage.imageUrl;
                        String str3 = this.H1;
                        String str4 = searchImage.thumbUrl;
                        ec1Var4.getClass();
                        ec1Var4.m(ImageLocation.getForPath(str2), str3, ImageLocation.getForPath(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (i6Var == null) {
                this.f40508y0.setBackground(org.telegram.ui.ActionBar.k6.s0());
            } else {
                org.telegram.ui.Components.o9 o9Var = this.f40500v1;
                if (o9Var != null) {
                    o9Var.dispose();
                    this.f40500v1 = null;
                }
                int D0 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Nd);
                int i18 = (int) i6Var.f20971j;
                if (i18 != 0) {
                    D0 = i18;
                }
                int D02 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Od);
                long j10 = i6Var.f20972k;
                int i19 = (int) j10;
                if (i19 == 0 && j10 != 0) {
                    D02 = 0;
                } else if (i19 != 0) {
                    D02 = i19;
                }
                int D03 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Pd);
                long j11 = i6Var.f20973l;
                int i20 = (int) j11;
                if (i20 == 0 && j11 != 0) {
                    D03 = 0;
                } else if (i20 != 0) {
                    D03 = i20;
                }
                int D04 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Qd);
                long j12 = i6Var.f20974m;
                int i21 = (int) j12;
                if (i21 == 0 && j12 != 0) {
                    D04 = 0;
                } else if (i21 != 0) {
                    D04 = i21;
                }
                if (!TextUtils.isEmpty(i6Var.f20976o) && !org.telegram.ui.ActionBar.k6.b1()) {
                    if (D03 != 0) {
                        Drawable background = this.f40508y0.getBackground();
                        if (background instanceof org.telegram.ui.Components.wc0) {
                            wc0Var2 = (org.telegram.ui.Components.wc0) background;
                        } else {
                            org.telegram.ui.Components.wc0 wc0Var3 = new org.telegram.ui.Components.wc0();
                            wc0Var3.q(this.f40508y0);
                            wc0Var2 = wc0Var3;
                            if (this.E1) {
                                wc0Var3.m(false);
                                wc0Var2 = wc0Var3;
                            }
                        }
                        wc0Var2.n(D0, D02, D03, D04);
                        wc0Var = wc0Var2;
                    } else if (D02 != 0) {
                        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(org.telegram.ui.Components.t9.d(i6Var.f20975n), new int[]{D0, D02});
                        this.f40500v1 = t9Var.f(ki.t1.Q(0.5f, 3), new xb1(this, 0), 100L);
                        wc0Var = t9Var;
                    } else {
                        wc0Var = new ColorDrawable(D0);
                    }
                    this.f40508y0.setBackground(wc0Var);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.X0;
                    if (tL_wallPaper4 != null) {
                        ec1 ec1Var5 = this.f40508y0;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(tL_wallPaper4.document);
                        String str5 = this.H1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.X0;
                        ec1Var5.k(forDocument2, str5, null, null, tL_wallPaper5.document.size, "jpg", tL_wallPaper5, 1);
                    }
                } else {
                    Drawable t02 = org.telegram.ui.ActionBar.k6.t0();
                    if (t02 != null) {
                        if (t02 instanceof org.telegram.ui.Components.wc0) {
                            ((org.telegram.ui.Components.wc0) t02).q(this.f40508y0);
                        }
                        this.f40508y0.setBackground(t02);
                    }
                }
                if (D02 == 0) {
                    int patternColor = AndroidUtilities.getPatternColor(D0);
                    this.l1 = patternColor;
                    this.f40476k1 = patternColor;
                } else if (D03 != 0) {
                    this.f40476k1 = org.telegram.ui.Components.wc0.g(D0, D02, D03, D04);
                    this.l1 = 754974720;
                } else {
                    int patternColor2 = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(D0, D02));
                    this.l1 = patternColor2;
                    this.f40476k1 = patternColor2;
                }
                ec1 ec1Var6 = this.f40508y0;
                if (ec1Var6 != null) {
                    ec1Var6.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f40476k1, this.f40496t1));
                    this.f40508y0.getImageReceiver().setAlpha(Math.abs(this.f40479m1));
                    this.f40508y0.invalidate();
                    if (org.telegram.ui.ActionBar.k6.I.q() && (this.f40508y0.getBackground() instanceof org.telegram.ui.Components.wc0)) {
                        org.telegram.ui.Cells.i0 i0Var = this.U0;
                        if (i0Var != null) {
                            i0Var.setTwoSided(true);
                        }
                        if (this.f40479m1 < 0.0f) {
                            this.f40508y0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.wc0) this.f40508y0.getBackground()).f32200k);
                        }
                    } else {
                        this.f40508y0.getImageReceiver().setGradientBitmap(null);
                        org.telegram.ui.Cells.i0 i0Var2 = this.U0;
                        if (i0Var2 != null) {
                            i0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.i0 i0Var3 = this.U0;
                    if (i0Var3 != null) {
                        i0Var3.setProgress(this.f40479m1);
                    }
                }
                if (this.K0 != null) {
                    int i22 = 0;
                    while (true) {
                        org.telegram.ui.Components.m91[] m91VarArr = this.K0;
                        if (i22 >= m91VarArr.length) {
                            break;
                        }
                        m91VarArr[i22].b(0, D0);
                        this.K0[i22].b(1, D02);
                        this.K0[i22].b(2, D03);
                        this.K0[i22].b(3, D04);
                        i22++;
                    }
                }
                ImageView imageView = this.G0;
                pb1 pb1Var = this.f40442a;
                if (imageView != null) {
                    org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f21278ic, pb1Var, PorterDuff.Mode.MULTIPLY);
                }
                ImageView imageView2 = this.H0;
                if (imageView2 != null) {
                    org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.f21278ic, pb1Var, PorterDuff.Mode.MULTIPLY);
                }
                V0();
            }
        }
        this.E1 = false;
    }

    public final void c1(long j10) {
        boolean z10;
        this.K1 = j10;
        if (j10 != 0 && j10 != getUserConfig().getClientUserId()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.L1 = z10;
    }

    @Override
    public final android.view.View createView(android.content.Context r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pc1.createView(android.content.Context):android.view.View");
    }

    public final void d1(org.telegram.ui.Cells.v0 v0Var) {
        pb1 pb1Var;
        float f7;
        if (this.f40508y0 == null) {
            return;
        }
        Bitmap bitmap = this.f40442a.f40431i;
        float f10 = 0.0f;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f7 = ((this.f40508y0.getMeasuredWidth() - (Math.max(this.f40508y0.getMeasuredWidth() / width, this.f40508y0.getMeasuredHeight() / pb1Var.f40431i.getHeight()) * width)) / 2.0f) + this.Y1 + 0.0f;
        } else {
            f7 = this.Y1 + 0.0f;
        }
        float y3 = v0Var.getY() - ((-this.f40508y0.J) + 0.0f);
        int measuredHeight = this.f40508y0.getMeasuredHeight();
        if (this.N1) {
            f10 = this.f40484o1 * this.f40486p1;
        }
        v0Var.f23820w0 = true;
        v0Var.f23817v0 = measuredHeight;
        v0Var.f23813t0 = y3;
        v0Var.f23815u0 = f7;
        v0Var.f23760b2 = f10;
        v0Var.f23763c2.setColor(i0.a.o(-16777216, (int) (f10 * 255.0f)));
        v0Var.invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (this.K1 == ((Long) objArr[2]).longValue()) {
                this.W1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                h1(true);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.lm0 lm0Var = this.f40483o0;
            if (lm0Var != null) {
                int childCount = lm0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f40483o0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.q2) {
                        ((org.telegram.ui.Cells.q2) childAt).a0(0, true);
                    }
                }
            }
        } else if (i10 == NotificationCenter.invalidateMotionBackground) {
            kb1 kb1Var = this.f40499v0;
            if (kb1Var != null) {
                kb1Var.g1();
            }
        } else if (i10 == NotificationCenter.didSetNewWallpapper) {
            if (this.f40497u0 != null) {
                b1(true);
            }
        } else if (i10 == NotificationCenter.wallpapersNeedReload) {
            Object obj = this.C1;
            if (obj instanceof zh1) {
                zh1 zh1Var = (zh1) obj;
                if (zh1Var.f44110a == null) {
                    zh1Var.f44110a = (String) objArr[0];
                }
            }
        } else {
            long j10 = 0;
            if (i10 == NotificationCenter.wallpapersDidLoad) {
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
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f20350id))) {
                            this.V0.add(wallPaper);
                            hashMap.put(Long.valueOf(wallPaper.document.f20350id), wallPaper);
                        }
                        org.telegram.ui.ActionBar.i6 i6Var = this.v;
                        if (i6Var != null && (str = i6Var.f20976o) != null && str.equals(wallPaper.slug)) {
                            this.X0 = (TLRPC.TL_wallPaper) wallPaper;
                            b1(false);
                            j1();
                        } else if (i6Var == null) {
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
                nc1 nc1Var = this.R0;
                if (nc1Var != null) {
                    nc1Var.l();
                }
                int size2 = arrayList.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i14);
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        j10 = MediaDataController.calcHash(j10, wallPaper2.f20496id);
                    }
                }
                TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
                getwallpapers.hash = j10;
                ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new ib1(this, 1)), this.classGuid);
            } else if (i10 == NotificationCenter.wallpaperSettedToUser && this.K1 != 0) {
                finishFragment();
            }
        }
    }

    public final void e1() {
        if (this.f40497u0 != null && this.L0 != null && this.v.f20969g != 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("bganimationhint", false)) {
                if (this.B0 == null) {
                    org.telegram.ui.Components.p40 p40Var = new org.telegram.ui.Components.p40(getParentActivity(), 8);
                    this.B0 = p40Var;
                    p40Var.setShowingDuration(5000L);
                    this.B0.setAlpha(0.0f);
                    this.B0.setVisibility(4);
                    this.B0.setText(LocaleController.getString(R.string.BackgroundAnimateInfo));
                    this.B0.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                    this.f40478l0.addView(this.B0, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                AndroidUtilities.runOnUIThread(new n71(7, this, globalMainSettings), 500L);
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
        if (z10 && i10 == 1 && this.X0 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i17 = this.f40445b;
        if (z10) {
            if (i10 == 0) {
                if (i17 == 2) {
                    this.f40447b1 = this.f40444a1;
                    int i18 = this.f40451c1;
                    this.f40461f1 = i18;
                    int i19 = this.f40454d1;
                    this.f40464g1 = i19;
                    int i20 = this.f40457e1;
                    this.f40467h1 = i20;
                    this.f40473j1 = this.P;
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
                    this.W.e(this.f40457e1, 3);
                    this.W.e(this.f40454d1, 2);
                    this.W.e(this.f40451c1, 1);
                    this.W.e(this.f40444a1, 0);
                }
            } else {
                this.Y0 = this.X0;
                this.f40482n1 = this.f40479m1;
                this.R0.l();
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
                    this.S0.h1(i15, (this.Q0.getMeasuredWidth() - AndroidUtilities.dp(124.0f)) / 2);
                }
            }
        }
        if (i17 == 1 || i17 == 2) {
            org.telegram.ui.Components.m91[] m91VarArr = this.K0;
            if (z12) {
                c10 = 2;
            } else {
                c10 = 0;
            }
            m91VarArr[c10].setVisibility(0);
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.i0 i0Var = this.U0;
            if (!i0Var.M) {
                float f19 = this.f40479m1;
                if (f19 < 0.0f) {
                    float f20 = -f19;
                    this.f40479m1 = f20;
                    i0Var.setProgress(f20);
                }
            }
        }
        int i21 = 58;
        float f21 = 1.0f;
        FrameLayout[] frameLayoutArr = this.M0;
        if (z11) {
            this.f40494s1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            if (i10 == 0) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            if (z10) {
                frameLayoutArr[i10].setVisibility(0);
                if (i17 == 1) {
                    kb1 kb1Var = this.f40499v0;
                    Property property = View.TRANSLATION_Y;
                    if (i10 == 1) {
                        f16 = -AndroidUtilities.dp(21.0f);
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(kb1Var, property, f16));
                    org.telegram.ui.Components.m91 m91Var = this.K0[2];
                    Property property2 = View.ALPHA;
                    if (z12) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(m91Var, property2, f17));
                    org.telegram.ui.Components.m91 m91Var2 = this.K0[0];
                    if (z12) {
                        f18 = 0.0f;
                    } else {
                        f18 = 1.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(m91Var2, property2, f18));
                    if (i10 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property2, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i12], property2, 0.0f));
                    }
                    AndroidUtilities.hideKeyboard(this.W.E[1]);
                } else if (i17 == 2) {
                    kb1 kb1Var2 = this.f40499v0;
                    Property property3 = View.TRANSLATION_Y;
                    int i22 = -frameLayoutArr[i10].getMeasuredHeight();
                    if (this.B1 == null) {
                        i21 = 0;
                    }
                    int dp = AndroidUtilities.dp(i21 + 72) + i22;
                    if (U0()) {
                        i13 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i13 = 0;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(kb1Var2, property3, dp + i13));
                    org.telegram.ui.Components.m91 m91Var3 = this.K0[2];
                    Property property4 = View.ALPHA;
                    if (z12) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(m91Var3, property4, f15));
                    org.telegram.ui.Components.m91 m91Var4 = this.K0[0];
                    if (z12) {
                        f21 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(m91Var4, property4, f21));
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
                    AndroidUtilities.hideKeyboard(this.W.E[1]);
                }
            } else {
                kb1 kb1Var3 = this.f40499v0;
                Property property5 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(kb1Var3, property5, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property5, frameLayout2.getMeasuredHeight()));
                org.telegram.ui.Components.m91 m91Var5 = this.K0[0];
                Property property6 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(m91Var5, property6, 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.K0[2], property6, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.f40508y0, property6, 1.0f));
            }
            this.f40494s1.playTogether(arrayList2);
            this.f40494s1.addListener(new wb1(this, z10, i12, i10, z12));
            this.f40494s1.setInterpolator(org.telegram.ui.Components.zr.f33338g);
            this.f40494s1.setDuration(200L);
            this.f40494s1.start();
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
                kb1 kb1Var4 = this.f40499v0;
                if (i10 == 1) {
                    f12 = -AndroidUtilities.dp(21.0f);
                } else {
                    f12 = 0.0f;
                }
                kb1Var4.setTranslationY(f12);
                org.telegram.ui.Components.m91 m91Var6 = this.K0[2];
                if (z12) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                m91Var6.setAlpha(f13);
                org.telegram.ui.Components.m91 m91Var7 = this.K0[0];
                if (z12) {
                    f14 = 0.0f;
                } else {
                    f14 = 1.0f;
                }
                m91Var7.setAlpha(f14);
                if (i10 == 1) {
                    frameLayoutArr[i10].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    frameLayoutArr[c11].setAlpha(0.0f);
                }
                AndroidUtilities.hideKeyboard(this.W.E[1]);
            } else if (i17 == 2) {
                kb1 kb1Var5 = this.f40499v0;
                if (i10 == 0) {
                    f7 = 343.0f;
                } else {
                    f7 = 316.0f;
                }
                int i23 = -AndroidUtilities.dp(f7);
                if (this.B1 == null) {
                    i21 = 0;
                }
                int dp2 = AndroidUtilities.dp(i21 + 72) + i23;
                if (U0()) {
                    i11 = AndroidUtilities.navigationBarHeight;
                } else {
                    i11 = 0;
                }
                kb1Var5.setTranslationY(dp2 + i11);
                org.telegram.ui.Components.m91 m91Var8 = this.K0[2];
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                m91Var8.setAlpha(f10);
                org.telegram.ui.Components.m91 m91Var9 = this.K0[0];
                if (z12) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                m91Var9.setAlpha(f11);
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
                AndroidUtilities.hideKeyboard(this.W.E[1]);
            }
        } else {
            this.f40499v0.setTranslationY(0.0f);
            frameLayoutArr[i10].setTranslationY(frameLayout.getMeasuredHeight());
            this.K0[0].setAlpha(1.0f);
            this.K0[2].setAlpha(1.0f);
            this.f40508y0.setAlpha(1.0f);
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
        org.telegram.ui.Components.m91[] m91VarArr2 = this.K0;
        if (!z12) {
            c12 = 2;
        }
        m91VarArr2[c12].setVisibility(4);
    }

    public final void g1() {
        Window window;
        if (this.f40471i2 != null) {
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
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        lc lcVar = new lc(this, getParentActivity(), canvas, (this.P1.getMeasuredWidth() / 2.0f) + f7, (this.P1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 2);
        this.f40471i2 = lcVar;
        lcVar.setOnTouchListener(new di.d(2));
        this.f40474j2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f40477k2 = ofFloat;
        ofFloat.addUpdateListener(new ei.eb(this, 3));
        this.f40477k2.addListener(new tb1(this, 4));
        this.f40477k2.setDuration(400L);
        this.f40477k2.setInterpolator(org.telegram.ui.Components.qt.e);
        this.f40477k2.start();
        frameLayout.addView(this.f40471i2, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new cb1(this, 2));
    }

    @Override
    public final int getObserverTag() {
        return this.f40498u1;
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.f40442a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        if (this.M1) {
            return S0();
        }
        return super.getThemeDescriptions();
    }

    public final void h1(boolean z10) {
        int i10 = (this.K1 > 0L ? 1 : (this.K1 == 0L ? 0 : -1));
        if (i10 > 0) {
            this.A1.d(LocaleController.getString(R.string.ApplyWallpaperForMe));
        } else if (i10 < 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.K1));
            if (chat != null) {
                this.A1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, chat.title));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                    if (this.f40491r1 == null) {
                        org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(R.drawable.mini_switch_lock, 0);
                        this.f40491r1 = vqVar;
                        vqVar.setTopOffset(1);
                    }
                    spannableStringBuilder.setSpan(this.f40491r1, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", R0(), new Object[0]));
                    this.A1.c(spannableStringBuilder, z10);
                    return;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.W1;
                if (tL_premium_boostsStatus2 == null) {
                    if (this.K1 < 0 && !this.U1 && !this.V1 && tL_premium_boostsStatus2 == null) {
                        this.U1 = true;
                        getMessagesController().getBoostsController().getBoostsStats(this.K1, new fb1(this, 1));
                        return;
                    }
                    return;
                }
                this.A1.c(null, z10);
                return;
            }
            this.A1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, LocaleController.getString(R.string.AccDescrChannel).toLowerCase()));
        } else {
            this.A1.d(LocaleController.getString(R.string.ApplyWallpaper));
        }
    }

    public final void i1() {
        if (this.G1 && this.f40506x1 == null) {
            Bitmap bitmap = this.D1;
            if (bitmap != null) {
                this.f40509y1 = bitmap;
                this.f40506x1 = Utilities.blurWallpaper(bitmap);
            } else {
                ImageReceiver imageReceiver = this.f40508y0.getImageReceiver();
                if (imageReceiver.hasNotThumb() || imageReceiver.hasStaticThumb()) {
                    this.f40509y1 = imageReceiver.getBitmap();
                    this.f40506x1 = Utilities.blurWallpaper(imageReceiver.getBitmap());
                }
            }
        }
        if (this.G1) {
            Bitmap bitmap2 = this.f40506x1;
            if (bitmap2 != null) {
                this.f40508y0.setImageBitmap(bitmap2);
                return;
            }
            return;
        }
        b1(false);
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.f40445b == 2) {
            if (this.f40448b2 && motionEvent != null) {
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
        float f7;
        FrameLayout frameLayout;
        float f10;
        Object obj = this.X0;
        if (obj == null) {
            obj = this.C1;
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
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.I1, true);
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
            int i11 = this.f40445b;
            if (exists) {
                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                this.f40508y0.invalidate();
                if (i11 == 2) {
                    if (j10 != 0 && this.K1 == 0) {
                        this.f40495t0.setSubtitle(AndroidUtilities.formatFileSize(j10));
                    } else {
                        this.f40495t0.setSubtitle(null);
                    }
                }
            } else {
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(str, null, this);
                if (i11 == 2 && this.K1 == 0) {
                    this.f40495t0.setSubtitle(LocaleController.getString(R.string.LoadingFullImage));
                }
                this.f40508y0.invalidate();
            }
            float f11 = 0.5f;
            if (this.X0 == null && (frameLayout = this.f40510z0) != null) {
                if (exists) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                frameLayout.setAlpha(f10);
            }
            if (i11 == 0) {
                this.f40453d0.setEnabled(exists);
                TextView textView = this.f40453d0;
                if (exists) {
                    f11 = 1.0f;
                }
                textView.setAlpha(f11);
            } else if (i11 == 2) {
                this.D0.setEnabled(exists);
                fc1 fc1Var = this.A1;
                if (fc1Var != null) {
                    if (exists) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.5f;
                    }
                    fc1Var.setAlpha(f7);
                }
                fc1 fc1Var2 = this.B1;
                if (fc1Var2 != null) {
                    if (exists) {
                        f11 = 1.0f;
                    }
                    fc1Var2.setAlpha(f11);
                }
            } else {
                this.f40459f.setEnabled(exists);
                org.telegram.ui.ActionBar.u0 u0Var = this.f40459f;
                if (exists) {
                    f11 = 1.0f;
                }
                u0Var.setAlpha(f11);
            }
        }
    }

    public final void k1() {
        this.f40508y0.getImageReceiver().setAlpha(Math.abs(this.f40479m1));
        this.f40508y0.invalidate();
        this.Q0.g1();
        if (this.f40479m1 >= 0.0f) {
            this.f40508y0.getImageReceiver().setGradientBitmap(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f40508y0.getImageReceiver().setBlendMode(null);
            }
            if (this.f40508y0.getBackground() instanceof org.telegram.ui.Components.wc0) {
                this.f40508y0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.wc0) this.f40508y0.getBackground()).f32200k);
            }
        }
        this.f40442a.j(this.f40508y0.getBackground(), this.f40508y0.getBackground(), Float.valueOf(this.f40479m1));
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
        int i10 = this.f40445b;
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
            org.telegram.ui.Components.m91 m91Var = this.K0[0];
            if (this.X0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            m91Var.setEnabled(z11);
            if (this.X0 != null) {
                this.K0[0].setVisibility(0);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            int dp = (AndroidUtilities.dp(9.0f) + ((FrameLayout.LayoutParams) this.K0[1].getLayoutParams()).width) / 2;
            org.telegram.ui.Components.m91 m91Var2 = this.K0[0];
            Property property = View.ALPHA;
            if (this.X0 == null) {
                f11 = 0.0f;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(m91Var2, property, f11));
            org.telegram.ui.Components.m91 m91Var3 = this.K0[0];
            Property property2 = View.TRANSLATION_X;
            if (this.X0 != null) {
                f10 = 0.0f;
            } else {
                f10 = dp;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(m91Var3, property2, f10));
            org.telegram.ui.Components.m91 m91Var4 = this.K0[1];
            if (this.X0 == null) {
                f12 = -dp;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(m91Var4, property2, f12));
            animatorSet.setInterpolator(org.telegram.ui.Components.zr.f33338g);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new vb1(this));
            animatorSet.start();
            return;
        }
        if (this.X0 == null && (this.C1 instanceof yh1)) {
            this.K0[2].a(false, true);
        }
        org.telegram.ui.Components.m91[] m91VarArr = this.K0;
        if (this.X0 != null) {
            c10 = 2;
        } else {
            c10 = 0;
        }
        m91VarArr[c10].setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        org.telegram.ui.Components.m91 m91Var5 = this.K0[2];
        Property property3 = View.ALPHA;
        if (this.X0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m91Var5, property3, f7);
        org.telegram.ui.Components.m91 m91Var6 = this.K0[0];
        if (this.X0 != null) {
            f11 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(m91Var6, property3, f11));
        animatorSet2.addListener(new ub1(this));
        animatorSet2.setInterpolator(org.telegram.ui.Components.zr.f33338g);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }

    public final void m1(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pc1.m1(boolean):void");
    }

    public final void n1() {
        int childCount = this.Q0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.Q0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.j5) {
                ((org.telegram.ui.Cells.j5) childAt).u(true);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!P0(z10)) {
            return false;
        }
        N0(true);
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBottomSheetCreated() {
        super.onBottomSheetCreated();
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var != null && h5Var.getBottomSheet() != null) {
            this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5));
            if (this.f40445b == 2 && this.K1 != 0) {
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
        int i10 = this.f40445b;
        if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 == 2 || i10 == 1) {
            org.telegram.ui.ActionBar.k6.N = true;
        }
        if (i10 == 0 && this.v == null) {
            this.F1 = org.telegram.ui.ActionBar.k6.f21267i0;
        } else {
            Point point = AndroidUtilities.displaySize;
            int min = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            int max = Math.max(point2.x, point2.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / AndroidUtilities.density));
            sb2.append("_");
            this.H1 = a1.g.n((int) (max / AndroidUtilities.density), "_f", sb2);
            Point point3 = AndroidUtilities.displaySize;
            this.I1 = Math.max(point3.x, point3.y);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            this.f40498u1 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
            if (this.V0 == null) {
                this.V0 = new ArrayList();
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
        ah.v vVar = this.f40478l0;
        if (vVar != null && this.R != null) {
            vVar.getViewTreeObserver().removeOnGlobalLayoutListener(this.R);
        }
        int i10 = this.f40445b;
        if ((i10 == 2 || i10 == 1) && this.f40488q1 == null) {
            AndroidUtilities.runOnUIThread(new hf0(6));
        }
        if (i10 == 2) {
            Bitmap bitmap = this.f40506x1;
            if (bitmap != null) {
                bitmap.recycle();
                this.f40506x1 = null;
            }
            this.f40442a.j(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        } else if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 != 0 || this.v != null) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
        }
        super.onFragmentDestroy();
        O0(null);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.F1) {
            this.f40503w1.c(false);
        }
        org.telegram.ui.ActionBar.k6.f21138b = false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        hc1 hc1Var = this.f40485p0;
        if (hc1Var != null) {
            hc1Var.l();
        }
        lc1 lc1Var = this.f40502w0;
        if (lc1Var != null) {
            lc1Var.l();
        }
        if (this.F1) {
            this.f40503w1.c(true);
        }
        org.telegram.ui.ActionBar.k6.f21138b = true;
    }

    @Override
    public final void onSuccessDownload(String str) {
        j1();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            Q0();
            try {
                z4.h hVar = this.f40475k0;
                if (hVar != null) {
                    AndroidUtilities.setViewPagerEdgeEffectColor(hVar, getThemedColor(org.telegram.ui.ActionBar.k6.f21463s8));
                }
                org.telegram.ui.Cells.i0 i0Var = this.U0;
                if (i0Var != null) {
                    i0Var.setOuterColor(getThemedColor(org.telegram.ui.ActionBar.k6.Vi));
                    this.U0.invalidate();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (!z10 && this.f40445b == 2) {
            this.f40442a.j(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.g6 g6Var) {
        this.f40442a.f40426a = g6Var;
    }

    public pc1(org.telegram.ui.ActionBar.j6 j6Var, boolean z10, int i10, boolean z11, boolean z12) {
        super(null);
        this.f40442a = new pb1(this);
        this.d = true;
        this.f40480n = 1;
        org.telegram.ui.ActionBar.s5 s5Var = new org.telegram.ui.ActionBar.s5(this, 0, false);
        this.S = s5Var;
        org.telegram.ui.ActionBar.s5 s5Var2 = new org.telegram.ui.ActionBar.s5(this, 0, true);
        this.T = s5Var2;
        org.telegram.ui.ActionBar.s5 s5Var3 = new org.telegram.ui.ActionBar.s5(this, 1, false);
        this.U = s5Var3;
        org.telegram.ui.ActionBar.s5 s5Var4 = new org.telegram.ui.ActionBar.s5(this, 1, true);
        this.V = s5Var4;
        this.Y = -1;
        this.Z = new cb1(this, 0);
        this.f40505x0 = new ec1[2];
        this.M0 = new FrameLayout[2];
        this.N0 = new TextView[2];
        this.O0 = new TextView[2];
        this.P0 = new FrameLayout[2];
        this.W0 = new HashMap();
        this.f40479m1 = 0.5f;
        this.f40484o1 = 0.0f;
        this.f40496t1 = PorterDuff.Mode.SRC_IN;
        this.f40511z1 = 1.0f;
        this.H1 = "640_360";
        this.I1 = 1920;
        this.L1 = true;
        this.T1 = new org.telegram.ui.Components.q20(getParentActivity(), new rb1(this));
        this.U1 = false;
        this.V1 = false;
        this.f40445b = i10;
        this.f40463g0 = z12;
        this.f40460f0 = j6Var;
        this.f40469i0 = z10;
        this.f40466h0 = z11;
        if (i10 == 1) {
            org.telegram.ui.ActionBar.i6 k10 = j6Var.k(!z11);
            this.v = k10;
            if (k10 != null) {
                this.d = false;
                this.f40504x = k10.f20967c;
                this.f40507y = k10.d;
                this.E = k10.e;
                this.F = k10.f20968f;
                this.G = k10.f20969g;
                this.H = k10.h;
                this.I = k10.f20970i;
                this.J = k10.f20971j;
                this.K = k10.f20972k;
                this.L = k10.f20973l;
                this.M = k10.f20974m;
                this.N = k10.f20977p;
                this.O = k10.f20976o;
                this.P = k10.f20975n;
            }
        } else {
            if (i10 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.i6 k11 = j6Var.k(false);
            this.v = k11;
            if (k11 != null) {
                this.X0 = k11.f20980s;
            }
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.v;
        if (i6Var != null) {
            this.F1 = i6Var.f20978q;
            if (!TextUtils.isEmpty(i6Var.f20976o)) {
                this.f40479m1 = this.v.f20977p;
            }
            org.telegram.ui.ActionBar.k6.M = org.telegram.ui.ActionBar.k6.C0();
            org.telegram.ui.ActionBar.k6.O = true;
            org.telegram.ui.ActionBar.k6.P = true;
            org.telegram.ui.ActionBar.k6.t(j6Var, false, false);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.goingToPreviewTheme, new Object[0]);
        s5Var.v = true;
        s5Var3.v = true;
        s5Var2.v = true;
        s5Var4.v = true;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
    }

    public pc1(org.telegram.ui.ActionBar.j6 j6Var) {
        this(j6Var, false, 0, false, false);
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
