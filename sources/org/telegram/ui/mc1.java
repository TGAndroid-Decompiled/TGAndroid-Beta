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
public class mc1 extends org.telegram.ui.ActionBar.n2 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.r40 A0;
    public cc1 A1;
    public AnimatorSet B0;
    public Object B1;
    public z4 C0;
    public Bitmap C1;
    public kb1 D0;
    public boolean D1;
    public final int E;
    public kb1 E0;
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
    public lc1 I1;
    public final long J;
    public org.telegram.ui.Components.d91[] J0;
    public long J1;
    public final long K;
    public org.telegram.ui.Components.d91[] K0;
    public boolean K1;
    public final long L;
    public final FrameLayout[] L0;
    public boolean L1;
    public final float M;
    public final TextView[] M0;
    public boolean M1;
    public final String N;
    public final TextView[] N0;
    public org.telegram.ui.Components.uj0 N1;
    public final int O;
    public final FrameLayout[] O0;
    public org.telegram.ui.ActionBar.u0 O1;
    public long P;
    public ua1 P0;
    public ValueAnimator P1;
    public p90 Q;
    public kc1 Q0;
    public ai.n5 Q1;
    public final org.telegram.ui.ActionBar.p5 R;
    public s4.b0 R0;
    public jb1 R1;
    public final org.telegram.ui.ActionBar.p5 S;
    public org.telegram.ui.Cells.l4 S0;
    public final org.telegram.ui.Components.s20 S1;
    public final org.telegram.ui.ActionBar.p5 T;
    public org.telegram.ui.Cells.j0 T0;
    public boolean T1;
    public final org.telegram.ui.ActionBar.p5 U;
    public ArrayList U0;
    public boolean U1;
    public org.telegram.ui.Components.wq V;
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
    public final mb1 f39078a;
    public ei.g6 f39079a0;
    public int f39080a1;
    public boolean a2;
    public final int f39081b;
    public FrameLayout f39082b0;
    public int f39083b1;
    public int f39084b2;
    public Scroller f39085c;
    public TextView f39086c0;
    public int f39087c1;
    public ValueAnimator f39088c2;
    public final boolean d;
    public TextView f39089d0;
    public int f39090d1;
    public boolean f39091d2;
    public org.telegram.ui.Components.jm e;
    public final org.telegram.ui.ActionBar.g6 f39092e0;
    public int f39093e1;
    public TextView f39094e2;
    public org.telegram.ui.ActionBar.u0 f39095f;
    public final boolean f39096f0;
    public int f39097f1;
    public WeakReference f39098f2;
    public final boolean f39099g0;
    public int f39100g1;
    public BitmapDrawable f39101g2;
    public TextView h;
    public final boolean f39102h0;
    public int f39103h1;
    public nc f39104h2;
    public ArrayList f39105i0;
    public int f39106i1;
    public float f39107i2;
    public z4.g f39108j0;
    public int f39109j1;
    public ValueAnimator f39110j2;
    public ah.v f39111k0;
    public int f39112k1;
    public UndoView f39113l0;
    public float l1;
    public FrameLayout m0;
    public float f39114m1;
    public int f39115n;
    public org.telegram.ui.Components.im0 f39116n0;
    public float f39117n1;
    public ec1 f39118o0;
    public float f39119o1;
    public org.telegram.ui.Components.h20 f39120p0;
    public dc1 f39121p1;
    public MessageObject f39122q0;
    public org.telegram.ui.Components.yq f39123q1;
    public Drawable f39124r;
    public boolean f39125r0;
    public AnimatorSet f39126r1;
    public final org.telegram.ui.ActionBar.f6 f39127s;
    public org.telegram.ui.ActionBar.k f39128s0;
    public final PorterDuff.Mode f39129s1;
    public org.telegram.ui.ActionBar.p0 f39130t0;
    public int f39131t1;
    public hb1 f39132u0;
    public org.telegram.ui.Components.q9 f39133u1;
    public boolean v;
    public ic1 f39134v0;
    public org.telegram.ui.Components.f91 f39135v1;
    public final int f39136w;
    public final bc1[] f39137w0;
    public Bitmap f39138w1;
    public final int f39139x;
    public bc1 f39140x0;
    public Bitmap f39141x1;
    public final int f39142y;
    public FrameLayout f39143y0;
    public float f39144y1;
    public FrameLayout f39145z0;
    public cc1 f39146z1;

    public mc1(Object obj, Bitmap bitmap, boolean z10) {
        super(null);
        this.f39078a = new mb1(this);
        this.d = true;
        this.f39115n = 1;
        org.telegram.ui.ActionBar.p5 p5Var = new org.telegram.ui.ActionBar.p5(this, 0, false);
        this.R = p5Var;
        org.telegram.ui.ActionBar.p5 p5Var2 = new org.telegram.ui.ActionBar.p5(this, 0, true);
        this.S = p5Var2;
        org.telegram.ui.ActionBar.p5 p5Var3 = new org.telegram.ui.ActionBar.p5(this, 1, false);
        this.T = p5Var3;
        org.telegram.ui.ActionBar.p5 p5Var4 = new org.telegram.ui.ActionBar.p5(this, 1, true);
        this.U = p5Var4;
        this.X = -1;
        this.Y = new za1(this, 0);
        this.f39137w0 = new bc1[2];
        this.L0 = new FrameLayout[2];
        this.M0 = new TextView[2];
        this.N0 = new TextView[2];
        this.O0 = new FrameLayout[2];
        this.V0 = new HashMap();
        this.l1 = 0.5f;
        this.f39117n1 = 0.0f;
        this.f39129s1 = PorterDuff.Mode.SRC_IN;
        this.f39144y1 = 1.0f;
        this.G1 = "640_360";
        this.H1 = 1920;
        this.K1 = true;
        this.S1 = new org.telegram.ui.Components.s20(getParentActivity(), new ob1(this));
        this.T1 = false;
        this.U1 = false;
        this.f39081b = 2;
        this.B1 = obj;
        this.C1 = bitmap;
        this.D1 = z10;
        if (obj instanceof uh1) {
            uh1 uh1Var = (uh1) obj;
            this.E1 = uh1Var.f41969j;
            TLRPC.TL_wallPaper tL_wallPaper = uh1Var.f41967g;
            this.W0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f7 = uh1Var.h;
                this.l1 = f7;
                if (f7 < 0.0f && !org.telegram.ui.ActionBar.h6.I.q()) {
                    this.l1 *= -1.0f;
                }
            }
        }
        p5Var.v = true;
        p5Var3.v = true;
        p5Var2.v = true;
        p5Var4.v = true;
    }

    public static void U(mc1 mc1Var, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (mc1Var.getParentActivity() == null) {
            return;
        }
        sg.k0 k0Var = new sg.k0(23, mc1Var.currentAccount, mc1Var.getParentActivity(), mc1Var, mc1Var.f39078a);
        k0Var.H1(canApplyBoost);
        k0Var.G1(mc1Var.V1, true);
        k0Var.I1(mc1Var.J1);
        if (!mc1Var.U0()) {
            k0Var.Q0 = new za1(mc1Var, 1);
        }
        mc1Var.showDialog(k0Var);
    }

    public static void V(mc1 mc1Var) {
        org.telegram.ui.ActionBar.f6 k10;
        org.telegram.ui.ActionBar.g6 g6Var = org.telegram.ui.ActionBar.h6.M;
        if (g6Var == null) {
            return;
        }
        int i10 = g6Var.Z;
        if (i10 >= 0) {
            k10 = (org.telegram.ui.ActionBar.f6) g6Var.f20878a0.get(i10);
        } else {
            k10 = g6Var.k(false);
        }
        if (mc1Var.f39127s != null) {
            mc1Var.W0();
            org.telegram.ui.ActionBar.h6.u1(mc1Var.f39092e0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.h6.M != null) {
                org.telegram.ui.ActionBar.h6.O = false;
                org.telegram.ui.ActionBar.h6.P = false;
                org.telegram.ui.ActionBar.h6.M = null;
            }
            org.telegram.ui.ActionBar.h6.t(mc1Var.f39092e0, true, mc1Var.f39096f0);
            ((ActionBarLayout) mc1Var.parentLayout).U(false, false);
        } else {
            ((ActionBarLayout) mc1Var.parentLayout).U(false, false);
            File file = new File(mc1Var.f39092e0.f20879b);
            org.telegram.ui.ActionBar.g6 g6Var2 = mc1Var.f39092e0;
            org.telegram.ui.ActionBar.h6.u(file, g6Var2.f20877a, g6Var2.F, false);
            MessagesController.getInstance(mc1Var.f39092e0.E).saveTheme(mc1Var.f39092e0, null, false, false);
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", mc1Var.f39092e0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) mc1Var.getParentLayout().getFragmentStack().get(Math.max(0, mc1Var.getParentLayout().getFragmentStack().size() - 2));
        mc1Var.finishFragment();
        if (mc1Var.f39081b == 0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didApplyNewTheme, g6Var, k10, Boolean.valueOf(mc1Var.f39102h0));
        }
        org.telegram.ui.ActionBar.h6.G1(n2Var);
    }

    public static void W(mc1 mc1Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = mc1Var.V0;
        org.telegram.ui.ActionBar.f6 f6Var = mc1Var.f39127s;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            mc1Var.U0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_wallPapers.wallpapers.get(i10) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i10);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f20278id))) {
                            mc1Var.U0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.f20278id), tL_wallPaper2);
                        }
                        if (f6Var != null && (str = f6Var.f20839o) != null && str.equals(tL_wallPaper2.slug)) {
                            mc1Var.W0 = tL_wallPaper2;
                            mc1Var.b1(false);
                            mc1Var.j1();
                        } else if (f6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = mc1Var.W0;
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
            if (!z10 && (tL_wallPaper = mc1Var.W0) != null) {
                mc1Var.U0.add(0, tL_wallPaper);
            }
            kc1 kc1Var = mc1Var.Q0;
            if (kc1Var != null) {
                kc1Var.l();
            }
            MessagesStorage.getInstance(mc1Var.currentAccount).putWallpapers(tL_wallPapers.wallpapers, 1);
        }
        if (mc1Var.W0 == null && f6Var != null && !TextUtils.isEmpty(f6Var.f20839o)) {
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = f6Var.f20839o;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(mc1Var.currentAccount).bindRequestToGuid(mc1Var.getConnectionsManager().sendRequest(getwallpaper, new fb1(mc1Var, 0)), mc1Var.classGuid);
        }
    }

    public static void X(mc1 mc1Var) {
        org.telegram.ui.Components.jm jmVar = mc1Var.e;
        int i10 = 0;
        if (jmVar != null) {
            jmVar.B(mc1Var.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
            mc1Var.e.G(mc1Var.getThemedColor(org.telegram.ui.ActionBar.h6.E8), false);
        }
        Drawable drawable = mc1Var.f39124r;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(mc1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6), PorterDuff.Mode.MULTIPLY));
        }
        z4 z4Var = mc1Var.C0;
        if (z4Var != null) {
            z4Var.invalidate();
        }
        if (mc1Var.f39121p1 != null) {
            org.telegram.ui.ActionBar.d5 d5Var = mc1Var.parentLayout;
            if (d5Var != null && d5Var.getBottomSheet() != null) {
                mc1Var.parentLayout.getBottomSheet().fixNavigationBar(mc1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21057h5));
                if (mc1Var.f39081b == 2 && mc1Var.J1 != 0) {
                    mc1Var.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            } else {
                mc1Var.setNavigationBarColor(mc1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21057h5));
            }
        }
        if (mc1Var.J0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.d91[] d91VarArr = mc1Var.J0;
                if (i11 >= d91VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.d91 d91Var = d91VarArr[i11];
                if (d91Var != null) {
                    d91Var.invalidate();
                }
                i11++;
            }
        }
        if (mc1Var.K0 != null) {
            while (true) {
                org.telegram.ui.Components.d91[] d91VarArr2 = mc1Var.K0;
                if (i10 >= d91VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.d91 d91Var2 = d91VarArr2[i10];
                if (d91Var2 != null) {
                    d91Var2.invalidate();
                }
                i10++;
            }
        }
        TextView textView = mc1Var.f39094e2;
        if (textView != null) {
            textView.setTextColor(mc1Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
        }
        org.telegram.ui.Components.wq wqVar = mc1Var.V;
        if (wqVar != null) {
            wqVar.invalidate();
        }
        org.telegram.ui.Components.h20 h20Var = mc1Var.f39120p0;
        if (h20Var != null) {
            h20Var.g();
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
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f39140x0, View.SCALE_X, this.f39144y1), ObjectAnimator.ofFloat(this.f39140x0, View.SCALE_Y, this.f39144y1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f39140x0, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f39140x0, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f39140x0, View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f39140x0, View.TRANSLATION_Y, 0.0f));
        }
        this.B0.setInterpolator(org.telegram.ui.Components.bs.f25031g);
        this.B0.addListener(new qb1(this, 1));
        this.B0.start();
    }

    public final void N0(boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mc1.N0(boolean):void");
    }

    public final void O0(boolean z10) {
        int i10 = this.f39081b;
        if (i10 == 2) {
            if (!z10) {
                finishFragment();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.h6.o();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        org.telegram.ui.ActionBar.f6 f6Var = this.f39127s;
        if (i10 == 1) {
            if (this.f39099g0) {
                f6Var.f20830c = this.f39136w;
                f6Var.d = this.f39139x;
                f6Var.e = this.f39142y;
                f6Var.f20831f = this.E;
                f6Var.f20832g = this.F;
                f6Var.h = this.G;
                f6Var.f20833i = this.H;
                f6Var.f20834j = this.I;
                f6Var.f20835k = this.J;
                f6Var.f20836l = this.K;
                f6Var.f20837m = this.L;
                f6Var.f20838n = this.O;
                f6Var.f20839o = this.N;
                f6Var.f20840p = this.M;
            }
            org.telegram.ui.ActionBar.h6.u1(this.f39092e0, false, true, false, false, false);
        } else {
            if (f6Var != null) {
                org.telegram.ui.ActionBar.h6.u1(this.f39092e0, false, this.f39102h0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).U(false, false);
            if (this.f39102h0) {
                org.telegram.ui.ActionBar.g6 g6Var = this.f39092e0;
                if (g6Var.f20879b != null && org.telegram.ui.ActionBar.h6.H.get(g6Var.m()) == null) {
                    new File(g6Var.f20879b).delete();
                }
            }
        }
        if (!z10) {
            finishFragment();
        }
    }

    public final BitmapDrawable P0(Drawable drawable) {
        WeakReference weakReference = this.f39098f2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.f39101g2;
        }
        WeakReference weakReference2 = this.f39098f2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f39098f2 = null;
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            this.f39098f2 = new WeakReference(drawable);
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
            this.f39101g2 = bitmapDrawable;
            bitmapDrawable.setFilterBitmap(true);
            return this.f39101g2;
        }
        this.f39101g2 = null;
        return null;
    }

    public final boolean Q0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mc1.Q0(boolean):boolean");
    }

    public final int R0() {
        if (ChatObject.isChannelAndNotMegaGroup(-this.J1, this.currentAccount)) {
            return getMessagesController().channelCustomWallpaperLevelMin;
        }
        return getMessagesController().groupCustomWallpaperLevelMin;
    }

    public final ArrayList S0() {
        by0 by0Var = new by0(6, this);
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.m0;
        int i10 = org.telegram.ui.ActionBar.h6.f20986d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(frameLayout, 1, null, null, null, by0Var, i10));
        z4.g gVar = this.f39108j0;
        int i11 = org.telegram.ui.ActionBar.h6.f21265s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(gVar, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.h6.f21284t8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 256, null, null, null, null, i12));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.h6.A8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar2, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.h6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39128s0, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39128s0, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39128s0, 1024, null, null, null, null, org.telegram.ui.ActionBar.h6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39128s0, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39128s0, Integer.MIN_VALUE, null, null, null, by0Var, org.telegram.ui.ActionBar.h6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39128s0, 1073741824, null, null, null, by0Var, org.telegram.ui.ActionBar.h6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39116n0, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 32768, null, null, null, null, i11));
        if (!this.d) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39082b0, 1, null, null, null, null, i10));
            TextView textView = this.f39089d0;
            int i14 = org.telegram.ui.ActionBar.h6.Ae;
            arrayList.add(new org.telegram.ui.ActionBar.j6(textView, 4, null, null, null, null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39086c0, 4, null, null, null, null, i14));
        }
        org.telegram.ui.Components.wq wqVar = this.V;
        if (wqVar != null) {
            org.telegram.ui.ActionBar.u0 u0Var = wqVar.I;
            EditTextBoldCursor[] editTextBoldCursorArr = wqVar.E;
            for (int i15 = 0; i15 < editTextBoldCursorArr.length; i15++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.h6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.j6(editTextBoldCursorArr[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.j6(editTextBoldCursorArr[i15], 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(editTextBoldCursorArr[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.h6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(editTextBoldCursorArr[i15], 32, null, null, null, null, org.telegram.ui.ActionBar.h6.f21113k6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(editTextBoldCursorArr[i15], 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.f21130l6));
            }
            org.telegram.ui.ActionBar.j0 j0Var = wqVar.F;
            int i17 = org.telegram.ui.ActionBar.h6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.j6(j0Var, 8, null, null, null, null, i17));
            org.telegram.ui.ActionBar.j0 j0Var2 = wqVar.F;
            int i18 = org.telegram.ui.ActionBar.h6.I5;
            arrayList.add(new org.telegram.ui.ActionBar.j6(j0Var2, 32, null, null, null, null, i18));
            if (u0Var != null) {
                org.telegram.ui.Components.z6 z6Var = new org.telegram.ui.Components.z6(wqVar, 3);
                arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var, 0, null, null, null, z6Var, i17));
                arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var, 0, null, null, null, z6Var, i18));
                arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.h6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.L0;
        if (frameLayoutArr != null) {
            for (int i19 = 0; i19 < frameLayoutArr.length; i19++) {
                arrayList.add(new org.telegram.ui.ActionBar.j6(frameLayoutArr[i19], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21072i3}, null, org.telegram.ui.ActionBar.h6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.j6(frameLayoutArr[i19], 0, null, org.telegram.ui.ActionBar.h6.f21089j2, null, null, org.telegram.ui.ActionBar.h6.Sd));
            }
            int i20 = 0;
            while (true) {
                FrameLayout[] frameLayoutArr2 = this.O0;
                if (i20 >= frameLayoutArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.j6(frameLayoutArr2[i20], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21072i3}, null, org.telegram.ui.ActionBar.h6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.j6(frameLayoutArr2[i20], 0, null, org.telegram.ui.ActionBar.h6.f21089j2, null, null, org.telegram.ui.ActionBar.h6.Sd));
                i20++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.C0, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21072i3}, null, org.telegram.ui.ActionBar.h6.Td));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.C0, 0, null, org.telegram.ui.ActionBar.h6.f21089j2, null, null, org.telegram.ui.ActionBar.h6.Sd));
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
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.T0, 0, new Class[]{org.telegram.ui.Components.cp0.class}, new String[]{"innerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Ti));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.T0, 0, new Class[]{org.telegram.ui.Components.cp0.class}, new String[]{"outerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Vi));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.S0, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21146m3, org.telegram.ui.ActionBar.h6.f21221q3}, null, org.telegram.ui.ActionBar.h6.f21247ra));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21166n3, org.telegram.ui.ActionBar.h6.f21240r3}, null, org.telegram.ui.ActionBar.h6.f20991dc));
            Drawable[] drawableArr = org.telegram.ui.ActionBar.h6.f21146m3.A;
            int i23 = org.telegram.ui.ActionBar.h6.f21286ta;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.f21221q3.A, null, i23));
            org.telegram.ui.ActionBar.p5 p5Var = this.R;
            org.telegram.ui.ActionBar.p5 p5Var2 = this.T;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{p5Var, p5Var2}, null, org.telegram.ui.ActionBar.h6.Aa));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{p5Var, p5Var2}, null, org.telegram.ui.ActionBar.h6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{p5Var, p5Var2}, null, org.telegram.ui.ActionBar.h6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{p5Var, p5Var2}, null, org.telegram.ui.ActionBar.h6.Fa));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21204p3, org.telegram.ui.ActionBar.h6.f21279t3}, null, org.telegram.ui.ActionBar.h6.Ba));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.h6.f21186o3.A;
            int i24 = org.telegram.ui.ActionBar.h6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr2, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.f21260s3.A, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21008ec));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.fc));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.y3}, null, org.telegram.ui.ActionBar.h6.Ja));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21388z3}, null, org.telegram.ui.ActionBar.h6.Ka));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.A3, org.telegram.ui.ActionBar.h6.C3}, null, org.telegram.ui.ActionBar.h6.La));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.B3, org.telegram.ui.ActionBar.h6.D3}, null, org.telegram.ui.ActionBar.h6.Ma));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.F3, org.telegram.ui.ActionBar.h6.G3}, null, org.telegram.ui.ActionBar.h6.f21269sc));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Uc));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20932ab));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Wc));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20972cb));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Yc));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.db));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20934ad));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21026fb));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21176nd));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21268sb));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21194od));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39132u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21174nb));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, by0Var, org.telegram.ui.ActionBar.h6.f20987d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, by0Var, org.telegram.ui.ActionBar.h6.f21057h5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, by0Var, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, by0Var, org.telegram.ui.ActionBar.h6.f21074i5));
        for (int i25 = 0; i25 < arrayList.size(); i25++) {
            ((org.telegram.ui.ActionBar.j6) arrayList.get(i25)).f21463o = this.f39078a;
        }
        return arrayList;
    }

    public final boolean T0(int i10) {
        int C0;
        long j10;
        if (this.f39099g0) {
            return false;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f39127s;
        if (i10 == 1 || i10 == 2) {
            long j11 = this.I;
            if (j11 != 0) {
                if (j11 != f6Var.f20834j) {
                    return true;
                }
            } else {
                int C02 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Nd);
                int i11 = (int) f6Var.f20834j;
                if (i11 == 0) {
                    i11 = C02;
                }
                if (i11 != C02) {
                    return true;
                }
            }
            long j12 = this.J;
            int i12 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
            long j13 = this.L;
            long j14 = this.K;
            if (i12 == 0 && j14 == 0 && j13 == 0) {
                for (int i13 = 0; i13 < 3; i13++) {
                    if (i13 == 0) {
                        C0 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Od);
                        j10 = f6Var.f20835k;
                    } else if (i13 == 1) {
                        C0 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Pd);
                        j10 = f6Var.f20836l;
                    } else {
                        C0 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Qd);
                        j10 = f6Var.f20837m;
                    }
                    int i14 = (int) j10;
                    if (i14 == 0 && j10 != 0) {
                        i14 = 0;
                    } else if (i14 == 0) {
                        i14 = C0;
                    }
                    if (i14 != C0) {
                        return true;
                    }
                }
            } else if (j12 != f6Var.f20835k || j14 != f6Var.f20836l || j13 != f6Var.f20837m) {
                return true;
            }
            if (f6Var.f20838n != this.O) {
                return true;
            }
        }
        if (i10 == 1 || i10 == 3) {
            if (this.f39136w != f6Var.d) {
                return true;
            }
            int i15 = this.f39142y;
            if (i15 != 0) {
                if (i15 != f6Var.e) {
                    return true;
                }
            } else {
                int i16 = f6Var.e;
                if (i16 != 0 && i16 != f6Var.f20830c) {
                    return true;
                }
            }
            int i17 = this.E;
            if (i17 != 0) {
                if (i17 != f6Var.f20831f) {
                    return true;
                }
            } else if (f6Var.f20831f != 0) {
                return true;
            }
            int i18 = this.F;
            if (i18 != 0) {
                if (i18 != f6Var.f20832g) {
                    return true;
                }
            } else if (f6Var.f20832g != 0) {
                return true;
            }
            int i19 = this.G;
            if (i19 != 0) {
                if (i19 != f6Var.h) {
                    return true;
                }
            } else if (f6Var.h != 0) {
                return true;
            }
            if (this.H != f6Var.f20833i) {
                return true;
            }
        }
        return false;
    }

    public boolean U0() {
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && d5Var.getBottomSheet() != null) {
            return true;
        }
        return false;
    }

    public final void V0() {
        float f7;
        ai.n5 n5Var = this.Q1;
        if (n5Var != null) {
            n5Var.invalidate();
        }
        FrameLayout frameLayout = this.f39143y0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f39143y0.getChildAt(i10).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.f39145z0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                this.f39145z0.getChildAt(i11).invalidate();
            }
        }
        if (this.J0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.d91[] d91VarArr = this.J0;
                if (i12 >= d91VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.d91 d91Var = d91VarArr[i12];
                if (d91Var != null) {
                    if (this.M1) {
                        f7 = this.f39117n1 * this.f39119o1;
                    } else {
                        f7 = 0.0f;
                    }
                    d91Var.setDimAmount(f7);
                    this.J0[i12].invalidate();
                }
                i12++;
            }
        }
        if (this.f39116n0 != null) {
            for (int i13 = 0; i13 < this.f39116n0.getChildCount(); i13++) {
                View childAt = this.f39116n0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.w0) {
                    d1((org.telegram.ui.Cells.w0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.f39132u0 != null) {
            for (int i14 = 0; i14 < this.f39132u0.getChildCount(); i14++) {
                View childAt2 = this.f39132u0.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                    d1((org.telegram.ui.Cells.w0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        cc1 cc1Var = this.f39146z1;
        if (cc1Var != null) {
            cc1Var.invalidate();
        }
        cc1 cc1Var2 = this.A1;
        if (cc1Var2 != null) {
            cc1Var2.invalidate();
        }
        z4 z4Var = this.C0;
        if (z4Var != null) {
            z4Var.invalidate();
        }
    }

    public final void W0() {
        org.telegram.ui.ActionBar.f6 f6Var = this.f39127s;
        if (f6Var != null && !TextUtils.isEmpty(f6Var.f20839o)) {
            try {
                File d = f6Var.d();
                Drawable background = this.f39140x0.getBackground();
                Bitmap bitmap = this.f39140x0.getImageReceiver().getBitmap();
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
                paint.setColorFilter(new PorterDuffColorFilter(this.f39109j1, this.f39129s1));
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
        if (getParentActivity() != null && this.f39115n != i10 && this.f39126r1 == null && (f6Var = this.f39127s) != null) {
            if (z10 && i10 == 2 && (org.telegram.ui.ActionBar.h6.a1() || f6Var.f20834j == 4294967296L)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.ChangeChatBackground);
                if (org.telegram.ui.ActionBar.h6.a1() && (!org.telegram.ui.ActionBar.h6.a1() || org.telegram.ui.ActionBar.h6.I.f20889i0.d == 0)) {
                    alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.ChangeWallpaperToColor);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Change), new bb1(this, 7));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                } else {
                    alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.ChangeColorToColor);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new bb1(this, 5));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Continue), new bb1(this, 6));
                }
                showDialog(alertDialog$Builder.f20601a);
                return;
            }
            int i18 = this.f39115n;
            this.f39115n = i10;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        this.h.setText(LocaleController.getString(R.string.ColorPickerMyMessages));
                        if (f6Var.f20831f != 0) {
                            if (f6Var.h != 0) {
                                i17 = 4;
                            } else if (f6Var.f20832g != 0) {
                                i17 = 3;
                            } else {
                                i17 = 2;
                            }
                        } else {
                            i17 = 1;
                        }
                        org.telegram.ui.Components.wq wqVar = this.V;
                        T0(3);
                        wqVar.f(2, 4, i17, true);
                        this.V.e(f6Var.h, 3);
                        this.V.e(f6Var.f20832g, 2);
                        this.V.e(f6Var.f20831f, 1);
                        org.telegram.ui.Components.wq wqVar2 = this.V;
                        int i19 = f6Var.e;
                        if (i19 == 0) {
                            i19 = f6Var.f20830c;
                        }
                        wqVar2.e(i19, 0);
                        this.K0[1].b(0, f6Var.e);
                        this.K0[1].b(1, f6Var.f20831f);
                        this.K0[1].b(2, f6Var.f20832g);
                        this.K0[1].b(3, f6Var.h);
                        if (f6Var.f20832g != 0) {
                            if (i18 == 1) {
                                this.f39134v0.o(0);
                            } else {
                                this.f39134v0.m(0);
                            }
                        } else if (i18 == 2) {
                            this.f39134v0.u(0);
                        }
                        this.f39132u0.v0(0, AndroidUtilities.dp(60.0f), null);
                        e1();
                    }
                } else {
                    this.h.setText(LocaleController.getString(R.string.ColorPickerBackground));
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.Nd);
                    int i20 = org.telegram.ui.ActionBar.h6.Od;
                    if (org.telegram.ui.ActionBar.h6.d1(i20)) {
                        i12 = getThemedColor(i20);
                    } else {
                        i12 = 0;
                    }
                    int i21 = org.telegram.ui.ActionBar.h6.Pd;
                    if (org.telegram.ui.ActionBar.h6.d1(i21)) {
                        i13 = getThemedColor(i21);
                    } else {
                        i13 = 0;
                    }
                    int i22 = org.telegram.ui.ActionBar.h6.Qd;
                    if (org.telegram.ui.ActionBar.h6.d1(i22)) {
                        i14 = getThemedColor(i22);
                    } else {
                        i14 = 0;
                    }
                    long j10 = f6Var.f20835k;
                    int i23 = (int) j10;
                    if (i23 == 0 && j10 != 0) {
                        i12 = 0;
                    }
                    long j11 = f6Var.f20836l;
                    int i24 = (int) j11;
                    if (i24 == 0 && j11 != 0) {
                        i13 = 0;
                    }
                    long j12 = f6Var.f20837m;
                    int i25 = (int) j12;
                    if (i25 == 0 && j12 != 0) {
                        i14 = 0;
                    }
                    int i26 = (int) f6Var.f20834j;
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
                    org.telegram.ui.Components.wq wqVar3 = this.V;
                    T0(2);
                    wqVar3.f(2, 4, i16, false);
                    org.telegram.ui.Components.wq wqVar4 = this.V;
                    if (i25 == 0) {
                        i25 = i14;
                    }
                    wqVar4.e(i25, 3);
                    org.telegram.ui.Components.wq wqVar5 = this.V;
                    if (i15 != 0) {
                        i13 = i15;
                    }
                    wqVar5.e(i13, 2);
                    org.telegram.ui.Components.wq wqVar6 = this.V;
                    if (i23 == 0) {
                        i23 = i12;
                    }
                    wqVar6.e(i23, 1);
                    org.telegram.ui.Components.wq wqVar7 = this.V;
                    if (i26 != 0) {
                        themedColor = i26;
                    }
                    wqVar7.e(themedColor, 0);
                    if (i18 != 1 && f6Var.f20832g != 0) {
                        this.f39134v0.m(0);
                    } else {
                        this.f39134v0.o(0);
                    }
                    this.f39132u0.v0(0, AndroidUtilities.dp(60.0f), null);
                }
            } else {
                this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
                if (f6Var.d != 0) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                org.telegram.ui.Components.wq wqVar8 = this.V;
                T0(1);
                wqVar8.f(1, 2, i11, false);
                this.V.e(f6Var.f20830c, 0);
                int i27 = f6Var.d;
                if (i27 != 0) {
                    this.V.e(i27, 1);
                }
                if (i18 == 2 || (i18 == 3 && f6Var.f20832g != 0)) {
                    this.f39134v0.u(0);
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
                if (this.f39092e0.q()) {
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
        ValueAnimator valueAnimator = this.f39088c2;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f39088c2.cancel();
        }
        bc1[] bc1VarArr = this.f39137w0;
        bc1 bc1Var = bc1VarArr[0];
        bc1 bc1Var2 = bc1VarArr[1];
        bc1VarArr[0] = bc1Var2;
        bc1VarArr[1] = bc1Var;
        this.f39130t0.removeView(bc1Var2);
        this.f39130t0.addView(bc1VarArr[0], this.f39130t0.indexOfChild(bc1VarArr[1]) + 1);
        bc1 bc1Var3 = bc1VarArr[0];
        this.f39140x0 = bc1Var3;
        bc1Var3.setBackground(bc1VarArr[1].getBackground());
        k1();
        bc1VarArr[1].setVisibility(0);
        bc1VarArr[1].setAlpha(1.0f);
        this.f39140x0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f39088c2 = ofFloat;
        ofFloat.addUpdateListener(new wi(2, this));
        this.f39088c2.addListener(new qb1(this, 0));
        this.f39088c2.setInterpolator(org.telegram.ui.Components.bs.f25030f);
        this.f39088c2.setDuration(300L);
        this.f39088c2.start();
        this.f39140x0.getImageReceiver().setCrossfadeDuration(300);
        this.f39140x0.getImageReceiver().setImage(ImageLocation.getForDocument(tL_wallPaper2.document), this.G1, null, null, null, tL_wallPaper2.document.size, "jpg", tL_wallPaper2, 1);
        this.f39140x0.d();
        this.W0 = tL_wallPaper2;
        this.E1 = this.J0[2].f25533s;
        j1();
    }

    public final void a1(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.wc0 wc0Var;
        if (i11 == 0) {
            this.Z0 = i10;
        } else if (i11 == 1) {
            this.f39083b1 = i10;
        } else if (i11 == 2) {
            this.f39087c1 = i10;
        } else if (i11 == 3) {
            this.f39090d1 = i10;
        }
        m1(z10);
        if (this.J0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.d91[] d91VarArr = this.J0;
                if (i12 >= d91VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.d91 d91Var = d91VarArr[i12];
                if (d91Var != null) {
                    d91Var.b(i11, i10);
                }
                i12++;
            }
        }
        if (this.f39087c1 != 0) {
            if (this.T0 != null && org.telegram.ui.ActionBar.h6.I.q()) {
                this.T0.setTwoSided(true);
            }
            Drawable background = this.f39140x0.getBackground();
            if (background instanceof org.telegram.ui.Components.wc0) {
                wc0Var = (org.telegram.ui.Components.wc0) background;
            } else {
                wc0Var = new org.telegram.ui.Components.wc0();
                wc0Var.q(this.f39140x0);
                if (this.D1) {
                    wc0Var.m(false);
                }
            }
            wc0Var.n(this.Z0, this.f39083b1, this.f39087c1, this.f39090d1);
            this.f39140x0.setBackground(wc0Var);
            this.f39109j1 = wc0Var.f();
            this.f39112k1 = 754974720;
        } else if (this.f39083b1 != 0) {
            this.f39140x0.setBackground(new GradientDrawable(org.telegram.ui.Components.v9.d(this.f39103h1), new int[]{this.Z0, this.f39083b1}));
            int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(this.Z0, this.f39083b1));
            this.f39112k1 = patternColor;
            this.f39109j1 = patternColor;
        } else {
            this.f39140x0.setBackgroundColor(this.Z0);
            int patternColor2 = AndroidUtilities.getPatternColor(this.Z0);
            this.f39112k1 = patternColor2;
            this.f39109j1 = patternColor2;
        }
        int i13 = org.telegram.ui.ActionBar.h6.f21136lc;
        boolean d12 = org.telegram.ui.ActionBar.h6.d1(i13);
        mb1 mb1Var = this.f39078a;
        if (d12 && !(this.f39140x0.getBackground() instanceof org.telegram.ui.Components.wc0)) {
            if (org.telegram.ui.ActionBar.h6.t0() instanceof org.telegram.ui.Components.wc0) {
                getThemedColor(i13);
                mb1Var.b(this.f39140x0.getBackground(), this.f39140x0.getBackground(), Float.valueOf(this.l1));
            }
        } else {
            mb1Var.b(this.f39140x0.getBackground(), this.f39140x0.getBackground(), Float.valueOf(this.l1));
        }
        ImageView imageView = this.F0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f21080ic), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.G0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f21080ic), PorterDuff.Mode.MULTIPLY));
        }
        bc1 bc1Var = this.f39140x0;
        if (bc1Var != null) {
            bc1Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f39109j1, this.f39129s1));
            this.f39140x0.getImageReceiver().setAlpha(Math.abs(this.l1));
            this.f39140x0.invalidate();
            if (org.telegram.ui.ActionBar.h6.I.q() && (this.f39140x0.getBackground() instanceof org.telegram.ui.Components.wc0)) {
                org.telegram.ui.Cells.j0 j0Var = this.T0;
                if (j0Var != null) {
                    j0Var.setTwoSided(true);
                }
                if (this.l1 < 0.0f) {
                    this.f39140x0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.wc0) this.f39140x0.getBackground()).f32091k);
                }
            } else {
                this.f39140x0.getImageReceiver().setGradientBitmap(null);
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
        hb1 hb1Var = this.f39132u0;
        if (hb1Var != null) {
            hb1Var.f1();
        }
        FrameLayout frameLayout = this.f39143y0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                this.f39143y0.getChildAt(i14).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.f39145z0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                this.f39145z0.getChildAt(i15).invalidate();
            }
        }
    }

    public final void b1(boolean z10) {
        org.telegram.ui.Components.wc0 wc0Var;
        org.telegram.ui.Components.wc0 wc0Var2;
        int i10;
        int g10;
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.ActionBar.f6 f6Var = this.f39127s;
        int i11 = this.f39081b;
        if (i11 == 0 && f6Var == null) {
            this.f39140x0.setBackground(org.telegram.ui.ActionBar.h6.s0());
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
                    bc1 bc1Var = this.f39140x0;
                    bc1Var.f32033a.setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.G1, ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    bc1Var.d();
                } else if (obj instanceof uh1) {
                    uh1 uh1Var = (uh1) obj;
                    int i12 = uh1Var.f41966f;
                    int i13 = uh1Var.e;
                    int i14 = uh1Var.d;
                    int i15 = uh1Var.f41965c;
                    int i16 = uh1Var.f41964b;
                    this.f39103h1 = i12;
                    a1(i16, 0, false);
                    if (i15 != 0) {
                        a1(i15, 1, false);
                    }
                    a1(i14, 2, false);
                    a1(i13, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.W0;
                    if (tL_wallPaper2 != null) {
                        bc1 bc1Var2 = this.f39140x0;
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                        String str = this.G1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.W0;
                        bc1Var2.k(forDocument, str, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                    } else if ("d".equals(uh1Var.f41963a)) {
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        Point point2 = AndroidUtilities.displaySize;
                        int max = Math.max(point2.x, point2.y);
                        if (Build.VERSION.SDK_INT >= 29) {
                            g10 = 1459617792;
                        } else {
                            g10 = org.telegram.ui.Components.wc0.g(i16, i15, i14, i13);
                        }
                        this.f39140x0.setImageBitmap(SvgHelper.getBitmap(R.raw.default_pattern, min, max, g10));
                    }
                } else if (obj instanceof vh1) {
                    Bitmap bitmap = this.C1;
                    if (bitmap != null) {
                        this.f39140x0.setImageBitmap(bitmap);
                    } else {
                        vh1 vh1Var = (vh1) obj;
                        File file = vh1Var.e;
                        if (file != null) {
                            this.f39140x0.f(file.getAbsolutePath(), this.G1, null);
                        } else {
                            File file2 = vh1Var.d;
                            if (file2 != null) {
                                this.f39140x0.f(file2.getAbsolutePath(), this.G1, null);
                            } else if ("t".equals(vh1Var.f42192a)) {
                                bc1 bc1Var3 = this.f39140x0;
                                bc1Var3.setImageDrawable(org.telegram.ui.ActionBar.h6.X0(bc1Var3, false));
                            } else {
                                int i17 = vh1Var.f42193b;
                                if (i17 != 0) {
                                    this.f39140x0.setImageResource(i17);
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
                        this.f39140x0.k(ImageLocation.getForPhoto(photoSize2, searchImage.photo), this.G1, ImageLocation.getForPhoto(closestPhotoSizeWithSize, searchImage.photo), "100_100_b", i10, "jpg", searchImage, 1);
                    } else {
                        bc1 bc1Var4 = this.f39140x0;
                        String str2 = searchImage.imageUrl;
                        String str3 = this.G1;
                        String str4 = searchImage.thumbUrl;
                        bc1Var4.getClass();
                        bc1Var4.m(ImageLocation.getForPath(str2), str3, ImageLocation.getForPath(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (f6Var == null) {
                this.f39140x0.setBackground(org.telegram.ui.ActionBar.h6.s0());
            } else {
                org.telegram.ui.Components.q9 q9Var = this.f39133u1;
                if (q9Var != null) {
                    q9Var.dispose();
                    this.f39133u1 = null;
                }
                int C0 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Nd);
                int i18 = (int) f6Var.f20834j;
                if (i18 != 0) {
                    C0 = i18;
                }
                int C02 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Od);
                long j10 = f6Var.f20835k;
                int i19 = (int) j10;
                if (i19 == 0 && j10 != 0) {
                    C02 = 0;
                } else if (i19 != 0) {
                    C02 = i19;
                }
                int C03 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Pd);
                long j11 = f6Var.f20836l;
                int i20 = (int) j11;
                if (i20 == 0 && j11 != 0) {
                    C03 = 0;
                } else if (i20 != 0) {
                    C03 = i20;
                }
                int C04 = org.telegram.ui.ActionBar.h6.C0(org.telegram.ui.ActionBar.h6.Qd);
                long j12 = f6Var.f20837m;
                int i21 = (int) j12;
                if (i21 == 0 && j12 != 0) {
                    C04 = 0;
                } else if (i21 != 0) {
                    C04 = i21;
                }
                if (!TextUtils.isEmpty(f6Var.f20839o) && !org.telegram.ui.ActionBar.h6.a1()) {
                    if (C03 != 0) {
                        Drawable background = this.f39140x0.getBackground();
                        if (background instanceof org.telegram.ui.Components.wc0) {
                            wc0Var2 = (org.telegram.ui.Components.wc0) background;
                        } else {
                            org.telegram.ui.Components.wc0 wc0Var3 = new org.telegram.ui.Components.wc0();
                            wc0Var3.q(this.f39140x0);
                            wc0Var2 = wc0Var3;
                            if (this.D1) {
                                wc0Var3.m(false);
                                wc0Var2 = wc0Var3;
                            }
                        }
                        wc0Var2.n(C0, C02, C03, C04);
                        wc0Var = wc0Var2;
                    } else if (C02 != 0) {
                        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(org.telegram.ui.Components.v9.d(f6Var.f20838n), new int[]{C0, C02});
                        this.f39133u1 = v9Var.f(ki.t1.u(0.5f, 3), new ub1(this, 0), 100L);
                        wc0Var = v9Var;
                    } else {
                        wc0Var = new ColorDrawable(C0);
                    }
                    this.f39140x0.setBackground(wc0Var);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.W0;
                    if (tL_wallPaper4 != null) {
                        bc1 bc1Var5 = this.f39140x0;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(tL_wallPaper4.document);
                        String str5 = this.G1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.W0;
                        bc1Var5.k(forDocument2, str5, null, null, tL_wallPaper5.document.size, "jpg", tL_wallPaper5, 1);
                    }
                } else {
                    Drawable t02 = org.telegram.ui.ActionBar.h6.t0();
                    if (t02 != null) {
                        if (t02 instanceof org.telegram.ui.Components.wc0) {
                            ((org.telegram.ui.Components.wc0) t02).q(this.f39140x0);
                        }
                        this.f39140x0.setBackground(t02);
                    }
                }
                if (C02 == 0) {
                    int patternColor = AndroidUtilities.getPatternColor(C0);
                    this.f39112k1 = patternColor;
                    this.f39109j1 = patternColor;
                } else if (C03 != 0) {
                    this.f39109j1 = org.telegram.ui.Components.wc0.g(C0, C02, C03, C04);
                    this.f39112k1 = 754974720;
                } else {
                    int patternColor2 = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(C0, C02));
                    this.f39112k1 = patternColor2;
                    this.f39109j1 = patternColor2;
                }
                bc1 bc1Var6 = this.f39140x0;
                if (bc1Var6 != null) {
                    bc1Var6.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f39109j1, this.f39129s1));
                    this.f39140x0.getImageReceiver().setAlpha(Math.abs(this.l1));
                    this.f39140x0.invalidate();
                    if (org.telegram.ui.ActionBar.h6.I.q() && (this.f39140x0.getBackground() instanceof org.telegram.ui.Components.wc0)) {
                        org.telegram.ui.Cells.j0 j0Var = this.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                        if (this.l1 < 0.0f) {
                            this.f39140x0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.wc0) this.f39140x0.getBackground()).f32091k);
                        }
                    } else {
                        this.f39140x0.getImageReceiver().setGradientBitmap(null);
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
                        org.telegram.ui.Components.d91[] d91VarArr = this.J0;
                        if (i22 >= d91VarArr.length) {
                            break;
                        }
                        d91VarArr[i22].b(0, C0);
                        this.J0[i22].b(1, C02);
                        this.J0[i22].b(2, C03);
                        this.J0[i22].b(3, C04);
                        i22++;
                    }
                }
                ImageView imageView = this.F0;
                if (imageView != null) {
                    imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f21080ic), PorterDuff.Mode.MULTIPLY));
                }
                ImageView imageView2 = this.G0;
                if (imageView2 != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f21080ic), PorterDuff.Mode.MULTIPLY));
                }
                V0();
            }
        }
        this.D1 = false;
    }

    public final void c1(long j10) {
        boolean z10;
        this.J1 = j10;
        if (j10 != 0 && j10 != getUserConfig().getClientUserId()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.K1 = z10;
    }

    @Override
    public final android.view.View createView(android.content.Context r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mc1.createView(android.content.Context):android.view.View");
    }

    public final void d1(org.telegram.ui.Cells.w0 w0Var) {
        mb1 mb1Var;
        float f7;
        if (this.f39140x0 == null) {
            return;
        }
        Bitmap bitmap = this.f39078a.f39072r;
        float f10 = 0.0f;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f7 = ((this.f39140x0.getMeasuredWidth() - (Math.max(this.f39140x0.getMeasuredWidth() / width, this.f39140x0.getMeasuredHeight() / mb1Var.f39072r.getHeight()) * width)) / 2.0f) + this.X1 + 0.0f;
        } else {
            f7 = this.X1 + 0.0f;
        }
        float y3 = w0Var.getY() - ((-this.f39140x0.J) + 0.0f);
        int measuredHeight = this.f39140x0.getMeasuredHeight();
        if (this.M1) {
            f10 = this.f39117n1 * this.f39119o1;
        }
        w0Var.f23741w0 = true;
        w0Var.f23738v0 = measuredHeight;
        w0Var.f23734t0 = y3;
        w0Var.f23736u0 = f7;
        w0Var.f23681b2 = f10;
        w0Var.f23684c2.setColor(i0.a.o(-16777216, (int) (f10 * 255.0f)));
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
            org.telegram.ui.Components.im0 im0Var = this.f39116n0;
            if (im0Var != null) {
                int childCount = im0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f39116n0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) childAt).b0(0, true);
                    }
                }
            }
        } else if (i10 == NotificationCenter.invalidateMotionBackground) {
            hb1 hb1Var = this.f39132u0;
            if (hb1Var != null) {
                hb1Var.f1();
            }
        } else if (i10 == NotificationCenter.didSetNewWallpapper) {
            if (this.f39130t0 != null) {
                b1(true);
            }
        } else if (i10 == NotificationCenter.wallpapersNeedReload) {
            Object obj = this.B1;
            if (obj instanceof vh1) {
                vh1 vh1Var = (vh1) obj;
                if (vh1Var.f42192a == null) {
                    vh1Var.f42192a = (String) objArr[0];
                }
            }
        } else {
            long j10 = 0;
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
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f20278id))) {
                            this.U0.add(wallPaper);
                            hashMap.put(Long.valueOf(wallPaper.document.f20278id), wallPaper);
                        }
                        org.telegram.ui.ActionBar.f6 f6Var = this.f39127s;
                        if (f6Var != null && (str = f6Var.f20839o) != null && str.equals(wallPaper.slug)) {
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
                kc1 kc1Var = this.Q0;
                if (kc1Var != null) {
                    kc1Var.l();
                }
                int size2 = arrayList.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i14);
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        j10 = MediaDataController.calcHash(j10, wallPaper2.f20424id);
                    }
                }
                TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
                getwallpapers.hash = j10;
                ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new fb1(this, 1)), this.classGuid);
            } else if (i10 == NotificationCenter.wallpaperSettedToUser && this.J1 != 0) {
                finishFragment();
            }
        }
    }

    public final void e1() {
        if (this.f39130t0 != null && this.K0 != null && this.f39127s.f20832g != 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("bganimationhint", false)) {
                if (this.A0 == null) {
                    org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(getParentActivity(), 8);
                    this.A0 = r40Var;
                    r40Var.setShowingDuration(5000L);
                    this.A0.setAlpha(0.0f);
                    this.A0.setVisibility(4);
                    this.A0.setText(LocaleController.getString(R.string.BackgroundAnimateInfo));
                    this.A0.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                    this.f39111k0.addView(this.A0, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                AndroidUtilities.runOnUIThread(new m71(7, this, globalMainSettings), 500L);
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
        int i17 = this.f39081b;
        if (z10) {
            if (i10 == 0) {
                if (i17 == 2) {
                    this.f39080a1 = this.Z0;
                    int i18 = this.f39083b1;
                    this.f39093e1 = i18;
                    int i19 = this.f39087c1;
                    this.f39097f1 = i19;
                    int i20 = this.f39090d1;
                    this.f39100g1 = i20;
                    this.f39106i1 = this.O;
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
                    this.V.e(this.f39090d1, 3);
                    this.V.e(this.f39087c1, 2);
                    this.V.e(this.f39083b1, 1);
                    this.V.e(this.Z0, 0);
                }
            } else {
                this.X0 = this.W0;
                this.f39114m1 = this.l1;
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
            org.telegram.ui.Components.d91[] d91VarArr = this.J0;
            if (z12) {
                c10 = 2;
            } else {
                c10 = 0;
            }
            d91VarArr[c10].setVisibility(0);
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
            this.f39126r1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            if (i10 == 0) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            if (z10) {
                frameLayoutArr[i10].setVisibility(0);
                if (i17 == 1) {
                    hb1 hb1Var = this.f39132u0;
                    Property property = View.TRANSLATION_Y;
                    if (i10 == 1) {
                        f16 = -AndroidUtilities.dp(21.0f);
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(hb1Var, property, f16));
                    org.telegram.ui.Components.d91 d91Var = this.J0[2];
                    Property property2 = View.ALPHA;
                    if (z12) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(d91Var, property2, f17));
                    org.telegram.ui.Components.d91 d91Var2 = this.J0[0];
                    if (z12) {
                        f18 = 0.0f;
                    } else {
                        f18 = 1.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(d91Var2, property2, f18));
                    if (i10 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property2, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i12], property2, 0.0f));
                    }
                    AndroidUtilities.hideKeyboard(this.V.E[1]);
                } else if (i17 == 2) {
                    hb1 hb1Var2 = this.f39132u0;
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
                    arrayList2.add(ObjectAnimator.ofFloat(hb1Var2, property3, dp + i13));
                    org.telegram.ui.Components.d91 d91Var3 = this.J0[2];
                    Property property4 = View.ALPHA;
                    if (z12) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(d91Var3, property4, f15));
                    org.telegram.ui.Components.d91 d91Var4 = this.J0[0];
                    if (z12) {
                        f21 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(d91Var4, property4, f21));
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
                hb1 hb1Var3 = this.f39132u0;
                Property property5 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(hb1Var3, property5, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property5, frameLayout2.getMeasuredHeight()));
                org.telegram.ui.Components.d91 d91Var5 = this.J0[0];
                Property property6 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(d91Var5, property6, 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.J0[2], property6, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.f39140x0, property6, 1.0f));
            }
            this.f39126r1.playTogether(arrayList2);
            this.f39126r1.addListener(new tb1(this, z10, i12, i10, z12));
            this.f39126r1.setInterpolator(org.telegram.ui.Components.bs.f25031g);
            this.f39126r1.setDuration(200L);
            this.f39126r1.start();
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
                hb1 hb1Var4 = this.f39132u0;
                if (i10 == 1) {
                    f12 = -AndroidUtilities.dp(21.0f);
                } else {
                    f12 = 0.0f;
                }
                hb1Var4.setTranslationY(f12);
                org.telegram.ui.Components.d91 d91Var6 = this.J0[2];
                if (z12) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                d91Var6.setAlpha(f13);
                org.telegram.ui.Components.d91 d91Var7 = this.J0[0];
                if (z12) {
                    f14 = 0.0f;
                } else {
                    f14 = 1.0f;
                }
                d91Var7.setAlpha(f14);
                if (i10 == 1) {
                    frameLayoutArr[i10].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    frameLayoutArr[c11].setAlpha(0.0f);
                }
                AndroidUtilities.hideKeyboard(this.V.E[1]);
            } else if (i17 == 2) {
                hb1 hb1Var5 = this.f39132u0;
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
                hb1Var5.setTranslationY(dp2 + i11);
                org.telegram.ui.Components.d91 d91Var8 = this.J0[2];
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                d91Var8.setAlpha(f10);
                org.telegram.ui.Components.d91 d91Var9 = this.J0[0];
                if (z12) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                d91Var9.setAlpha(f11);
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
            this.f39132u0.setTranslationY(0.0f);
            frameLayoutArr[i10].setTranslationY(frameLayout.getMeasuredHeight());
            this.J0[0].setAlpha(1.0f);
            this.J0[2].setAlpha(1.0f);
            this.f39140x0.setAlpha(1.0f);
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
        org.telegram.ui.Components.d91[] d91VarArr2 = this.J0;
        if (!z12) {
            c12 = 2;
        }
        d91VarArr2[c12].setVisibility(4);
    }

    public final void g1() {
        Window window;
        if (this.f39104h2 != null) {
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
        nc ncVar = new nc(this, getParentActivity(), canvas, (this.O1.getMeasuredWidth() / 2.0f) + f7, (this.O1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 2);
        this.f39104h2 = ncVar;
        ncVar.setOnTouchListener(new di.d(2));
        this.f39107i2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f39110j2 = ofFloat;
        ofFloat.addUpdateListener(new ei.eb(this, 3));
        this.f39110j2.addListener(new qb1(this, 4));
        this.f39110j2.setDuration(400L);
        this.f39110j2.setInterpolator(org.telegram.ui.Components.st.e);
        this.f39110j2.start();
        frameLayout.addView(this.f39104h2, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new za1(this, 2));
    }

    @Override
    public final int getObserverTag() {
        return this.f39131t1;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.f39078a;
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
            this.f39146z1.d(LocaleController.getString(R.string.ApplyWallpaperForMe));
        } else if (i10 < 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.J1));
            if (chat != null) {
                this.f39146z1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, chat.title));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.V1;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                    if (this.f39123q1 == null) {
                        org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(R.drawable.mini_switch_lock, 0);
                        this.f39123q1 = yqVar;
                        yqVar.setTopOffset(1);
                    }
                    spannableStringBuilder.setSpan(this.f39123q1, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", R0(), new Object[0]));
                    this.f39146z1.c(spannableStringBuilder, z10);
                    return;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.V1;
                if (tL_premium_boostsStatus2 == null) {
                    if (this.J1 < 0 && !this.T1 && !this.U1 && tL_premium_boostsStatus2 == null) {
                        this.T1 = true;
                        getMessagesController().getBoostsController().getBoostsStats(this.J1, new cb1(this, 1));
                        return;
                    }
                    return;
                }
                this.f39146z1.c(null, z10);
                return;
            }
            this.f39146z1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, LocaleController.getString(R.string.AccDescrChannel).toLowerCase()));
        } else {
            this.f39146z1.d(LocaleController.getString(R.string.ApplyWallpaper));
        }
    }

    public final void i1() {
        if (this.F1 && this.f39138w1 == null) {
            Bitmap bitmap = this.C1;
            if (bitmap != null) {
                this.f39141x1 = bitmap;
                this.f39138w1 = Utilities.blurWallpaper(bitmap);
            } else {
                ImageReceiver imageReceiver = this.f39140x0.getImageReceiver();
                if (imageReceiver.hasNotThumb() || imageReceiver.hasStaticThumb()) {
                    this.f39141x1 = imageReceiver.getBitmap();
                    this.f39138w1 = Utilities.blurWallpaper(imageReceiver.getBitmap());
                }
            }
        }
        if (this.F1) {
            Bitmap bitmap2 = this.f39138w1;
            if (bitmap2 != null) {
                this.f39140x0.setImageBitmap(bitmap2);
                return;
            }
            return;
        }
        b1(false);
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.f39081b == 2) {
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
        long j10;
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
                    j10 = tL_wallPaper.document.size;
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
                j10 = i10;
                String str2 = name;
                file = httpFilePath;
                str = str2;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            }
            boolean exists = file.exists();
            int i11 = this.f39081b;
            if (exists) {
                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                this.f39140x0.invalidate();
                if (i11 == 2) {
                    if (j10 != 0 && this.J1 == 0) {
                        this.f39128s0.setSubtitle(AndroidUtilities.formatFileSize(j10));
                    } else {
                        this.f39128s0.setSubtitle(null);
                    }
                }
            } else {
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(str, null, this);
                if (i11 == 2 && this.J1 == 0) {
                    this.f39128s0.setSubtitle(LocaleController.getString(R.string.LoadingFullImage));
                }
                this.f39140x0.invalidate();
            }
            float f11 = 0.5f;
            if (this.W0 == null && (frameLayout = this.f39143y0) != null) {
                if (exists) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                frameLayout.setAlpha(f10);
            }
            if (i11 == 0) {
                this.f39086c0.setEnabled(exists);
                TextView textView = this.f39086c0;
                if (exists) {
                    f11 = 1.0f;
                }
                textView.setAlpha(f11);
            } else if (i11 == 2) {
                this.C0.setEnabled(exists);
                cc1 cc1Var = this.f39146z1;
                if (cc1Var != null) {
                    if (exists) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.5f;
                    }
                    cc1Var.setAlpha(f7);
                }
                cc1 cc1Var2 = this.A1;
                if (cc1Var2 != null) {
                    if (exists) {
                        f11 = 1.0f;
                    }
                    cc1Var2.setAlpha(f11);
                }
            } else {
                this.f39095f.setEnabled(exists);
                org.telegram.ui.ActionBar.u0 u0Var = this.f39095f;
                if (exists) {
                    f11 = 1.0f;
                }
                u0Var.setAlpha(f11);
            }
        }
    }

    public final void k1() {
        this.f39140x0.getImageReceiver().setAlpha(Math.abs(this.l1));
        this.f39140x0.invalidate();
        this.P0.f1();
        if (this.l1 >= 0.0f) {
            this.f39140x0.getImageReceiver().setGradientBitmap(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f39140x0.getImageReceiver().setBlendMode(null);
            }
            if (this.f39140x0.getBackground() instanceof org.telegram.ui.Components.wc0) {
                this.f39140x0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.wc0) this.f39140x0.getBackground()).f32091k);
            }
        }
        this.f39078a.b(this.f39140x0.getBackground(), this.f39140x0.getBackground(), Float.valueOf(this.l1));
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
        int i10 = this.f39081b;
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
            org.telegram.ui.Components.d91 d91Var = this.J0[0];
            if (this.W0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            d91Var.setEnabled(z11);
            if (this.W0 != null) {
                this.J0[0].setVisibility(0);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            int dp = (AndroidUtilities.dp(9.0f) + ((FrameLayout.LayoutParams) this.J0[1].getLayoutParams()).width) / 2;
            org.telegram.ui.Components.d91 d91Var2 = this.J0[0];
            Property property = View.ALPHA;
            if (this.W0 == null) {
                f11 = 0.0f;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(d91Var2, property, f11));
            org.telegram.ui.Components.d91 d91Var3 = this.J0[0];
            Property property2 = View.TRANSLATION_X;
            if (this.W0 != null) {
                f10 = 0.0f;
            } else {
                f10 = dp;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(d91Var3, property2, f10));
            org.telegram.ui.Components.d91 d91Var4 = this.J0[1];
            if (this.W0 == null) {
                f12 = -dp;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(d91Var4, property2, f12));
            animatorSet.setInterpolator(org.telegram.ui.Components.bs.f25031g);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new sb1(this));
            animatorSet.start();
            return;
        }
        if (this.W0 == null && (this.B1 instanceof uh1)) {
            this.J0[2].a(false, true);
        }
        org.telegram.ui.Components.d91[] d91VarArr = this.J0;
        if (this.W0 != null) {
            c10 = 2;
        } else {
            c10 = 0;
        }
        d91VarArr[c10].setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        org.telegram.ui.Components.d91 d91Var5 = this.J0[2];
        Property property3 = View.ALPHA;
        if (this.W0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(d91Var5, property3, f7);
        org.telegram.ui.Components.d91 d91Var6 = this.J0[0];
        if (this.W0 != null) {
            f11 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(d91Var6, property3, f11));
        animatorSet2.addListener(new rb1(this));
        animatorSet2.setInterpolator(org.telegram.ui.Components.bs.f25031g);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }

    public final void m1(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mc1.m1(boolean):void");
    }

    public final void n1() {
        int childCount = this.P0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.P0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.j5) {
                ((org.telegram.ui.Cells.j5) childAt).u(true);
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
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && d5Var.getBottomSheet() != null) {
            this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.h6.f21057h5));
            if (this.f39081b == 2 && this.J1 != 0) {
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
        int i10 = this.f39081b;
        if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 == 2 || i10 == 1) {
            org.telegram.ui.ActionBar.h6.N = true;
        }
        if (i10 == 0 && this.f39127s == null) {
            this.E1 = org.telegram.ui.ActionBar.h6.f21069i0;
        } else {
            Point point = AndroidUtilities.displaySize;
            int min = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            int max = Math.max(point2.x, point2.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / AndroidUtilities.density));
            sb2.append("_");
            this.G1 = a1.g.n((int) (max / AndroidUtilities.density), "_f", sb2);
            Point point3 = AndroidUtilities.displaySize;
            this.H1 = Math.max(point3.x, point3.y);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            this.f39131t1 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
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
        ah.v vVar = this.f39111k0;
        if (vVar != null && this.Q != null) {
            vVar.getViewTreeObserver().removeOnGlobalLayoutListener(this.Q);
        }
        int i10 = this.f39081b;
        if ((i10 == 2 || i10 == 1) && this.f39121p1 == null) {
            AndroidUtilities.runOnUIThread(new mj0(5));
        }
        if (i10 == 2) {
            Bitmap bitmap = this.f39138w1;
            if (bitmap != null) {
                bitmap.recycle();
                this.f39138w1 = null;
            }
            this.f39078a.b(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        } else if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 != 0 || this.f39127s != null) {
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
            this.f39135v1.c(false);
        }
        org.telegram.ui.ActionBar.h6.f20940b = false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        ec1 ec1Var = this.f39118o0;
        if (ec1Var != null) {
            ec1Var.l();
        }
        ic1 ic1Var = this.f39134v0;
        if (ic1Var != null) {
            ic1Var.l();
        }
        if (this.E1) {
            this.f39135v1.c(true);
        }
        org.telegram.ui.ActionBar.h6.f20940b = true;
    }

    @Override
    public final void onSuccessDownload(String str) {
        j1();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (!z10 && this.f39081b == 2) {
            this.f39078a.b(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.d6 d6Var) {
        this.f39078a.f39067a = d6Var;
    }

    public mc1(org.telegram.ui.ActionBar.g6 g6Var, boolean z10, int i10, boolean z11, boolean z12) {
        super(null);
        this.f39078a = new mb1(this);
        this.d = true;
        this.f39115n = 1;
        org.telegram.ui.ActionBar.p5 p5Var = new org.telegram.ui.ActionBar.p5(this, 0, false);
        this.R = p5Var;
        org.telegram.ui.ActionBar.p5 p5Var2 = new org.telegram.ui.ActionBar.p5(this, 0, true);
        this.S = p5Var2;
        org.telegram.ui.ActionBar.p5 p5Var3 = new org.telegram.ui.ActionBar.p5(this, 1, false);
        this.T = p5Var3;
        org.telegram.ui.ActionBar.p5 p5Var4 = new org.telegram.ui.ActionBar.p5(this, 1, true);
        this.U = p5Var4;
        this.X = -1;
        this.Y = new za1(this, 0);
        this.f39137w0 = new bc1[2];
        this.L0 = new FrameLayout[2];
        this.M0 = new TextView[2];
        this.N0 = new TextView[2];
        this.O0 = new FrameLayout[2];
        this.V0 = new HashMap();
        this.l1 = 0.5f;
        this.f39117n1 = 0.0f;
        this.f39129s1 = PorterDuff.Mode.SRC_IN;
        this.f39144y1 = 1.0f;
        this.G1 = "640_360";
        this.H1 = 1920;
        this.K1 = true;
        this.S1 = new org.telegram.ui.Components.s20(getParentActivity(), new ob1(this));
        this.T1 = false;
        this.U1 = false;
        this.f39081b = i10;
        this.f39096f0 = z12;
        this.f39092e0 = g6Var;
        this.f39102h0 = z10;
        this.f39099g0 = z11;
        if (i10 == 1) {
            org.telegram.ui.ActionBar.f6 k10 = g6Var.k(!z11);
            this.f39127s = k10;
            if (k10 != null) {
                this.d = false;
                this.f39136w = k10.f20830c;
                this.f39139x = k10.d;
                this.f39142y = k10.e;
                this.E = k10.f20831f;
                this.F = k10.f20832g;
                this.G = k10.h;
                this.H = k10.f20833i;
                this.I = k10.f20834j;
                this.J = k10.f20835k;
                this.K = k10.f20836l;
                this.L = k10.f20837m;
                this.M = k10.f20840p;
                this.N = k10.f20839o;
                this.O = k10.f20838n;
            }
        } else {
            if (i10 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.f6 k11 = g6Var.k(false);
            this.f39127s = k11;
            if (k11 != null) {
                this.W0 = k11.f20843s;
            }
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f39127s;
        if (f6Var != null) {
            this.E1 = f6Var.f20841q;
            if (!TextUtils.isEmpty(f6Var.f20839o)) {
                this.l1 = this.f39127s.f20840p;
            }
            org.telegram.ui.ActionBar.h6.M = org.telegram.ui.ActionBar.h6.B0();
            org.telegram.ui.ActionBar.h6.O = true;
            org.telegram.ui.ActionBar.h6.P = true;
            org.telegram.ui.ActionBar.h6.t(g6Var, false, false);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.goingToPreviewTheme, new Object[0]);
        p5Var.v = true;
        p5Var3.v = true;
        p5Var2.v = true;
        p5Var4.v = true;
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
    }

    public mc1(org.telegram.ui.ActionBar.g6 g6Var) {
        this(g6Var, false, 0, false, false);
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
