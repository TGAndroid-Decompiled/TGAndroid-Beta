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
public class pd1 extends org.telegram.ui.ActionBar.o2 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.l40 A0;
    public fd1 A1;
    public AnimatorSet B0;
    public Object B1;
    public w4 C0;
    public Bitmap C1;
    public nc1 D0;
    public boolean D1;
    public final int E;
    public nc1 E0;
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
    public od1 I1;
    public final long J;
    public org.telegram.ui.Components.z81[] J0;
    public long J1;
    public final long K;
    public org.telegram.ui.Components.z81[] K0;
    public boolean K1;
    public final long L;
    public final FrameLayout[] L0;
    public boolean L1;
    public final float M;
    public final TextView[] M0;
    public boolean M1;
    public final String N;
    public final TextView[] N0;
    public org.telegram.ui.Components.kj0 N1;
    public final int O;
    public final FrameLayout[] O0;
    public org.telegram.ui.ActionBar.w0 O1;
    public long P;
    public wb1 P0;
    public ValueAnimator P1;
    public da0 Q;
    public nd1 Q0;
    public v5 Q1;
    public final org.telegram.ui.ActionBar.q5 R;
    public s4.c0 R0;
    public mc1 R1;
    public final org.telegram.ui.ActionBar.q5 S;
    public org.telegram.ui.Cells.m4 S0;
    public final org.telegram.ui.Components.m20 S1;
    public final org.telegram.ui.ActionBar.q5 T;
    public org.telegram.ui.Cells.j0 T0;
    public boolean T1;
    public final org.telegram.ui.ActionBar.q5 U;
    public ArrayList U0;
    public boolean U1;
    public org.telegram.ui.Components.oq V;
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
    public final pc1 f36390a;
    public ci.r6 f36391a0;
    public int f36392a1;
    public boolean a2;
    public final int f36393b;
    public FrameLayout f36394b0;
    public int f36395b1;
    public int f36396b2;
    public Scroller f36397c;
    public TextView f36398c0;
    public int f36399c1;
    public ValueAnimator f36400c2;
    public final boolean d;
    public TextView f36401d0;
    public int f36402d1;
    public boolean f36403d2;
    public org.telegram.ui.Components.am e;
    public final org.telegram.ui.ActionBar.h6 f36404e0;
    public int f36405e1;
    public TextView f36406e2;
    public org.telegram.ui.ActionBar.w0 f36407f;
    public final boolean f36408f0;
    public int f36409f1;
    public WeakReference f36410f2;
    public final boolean f36411g0;
    public int f36412g1;
    public BitmapDrawable f36413g2;
    public TextView h;
    public final boolean f36414h0;
    public int f36415h1;
    public mc f36416h2;
    public ArrayList f36417i0;
    public int f36418i1;
    public float f36419i2;
    public z4.g f36420j0;
    public int f36421j1;
    public ValueAnimator f36422j2;
    public ci.m6 f36423k0;
    public int f36424k1;
    public UndoView f36425l0;
    public float l1;
    public FrameLayout m0;
    public float f36426m1;
    public int f36427n;
    public org.telegram.ui.Components.yl0 f36428n0;
    public float f36429n1;
    public hd1 f36430o0;
    public float f36431o1;
    public org.telegram.ui.Components.b20 f36432p0;
    public gd1 f36433p1;
    public MessageObject f36434q0;
    public org.telegram.ui.Components.qq f36435q1;
    public Drawable f36436r;
    public boolean f36437r0;
    public AnimatorSet f36438r1;
    public final org.telegram.ui.ActionBar.g6 f36439s;
    public org.telegram.ui.ActionBar.l f36440s0;
    public final PorterDuff.Mode f36441s1;
    public org.telegram.ui.ActionBar.r0 f36442t0;
    public int f36443t1;
    public jc1 f36444u0;
    public org.telegram.ui.Components.q9 f36445u1;
    public boolean v;
    public ld1 f36446v0;
    public org.telegram.ui.Components.b91 f36447v1;
    public final int f36448w;
    public final ed1[] f36449w0;
    public Bitmap f36450w1;
    public final int f36451x;
    public ed1 f36452x0;
    public Bitmap f36453x1;
    public final int f36454y;
    public FrameLayout f36455y0;
    public float f36456y1;
    public FrameLayout f36457z0;
    public fd1 f36458z1;

    public pd1(Object obj, Bitmap bitmap, boolean z10) {
        super(null);
        this.f36390a = new pc1(this);
        this.d = true;
        this.f36427n = 1;
        org.telegram.ui.ActionBar.q5 q5Var = new org.telegram.ui.ActionBar.q5(this, 0, false);
        this.R = q5Var;
        org.telegram.ui.ActionBar.q5 q5Var2 = new org.telegram.ui.ActionBar.q5(this, 0, true);
        this.S = q5Var2;
        org.telegram.ui.ActionBar.q5 q5Var3 = new org.telegram.ui.ActionBar.q5(this, 1, false);
        this.T = q5Var3;
        org.telegram.ui.ActionBar.q5 q5Var4 = new org.telegram.ui.ActionBar.q5(this, 1, true);
        this.U = q5Var4;
        this.X = -1;
        this.Y = new bc1(this, 0);
        this.f36449w0 = new ed1[2];
        this.L0 = new FrameLayout[2];
        this.M0 = new TextView[2];
        this.N0 = new TextView[2];
        this.O0 = new FrameLayout[2];
        this.V0 = new HashMap();
        this.l1 = 0.5f;
        this.f36429n1 = 0.0f;
        this.f36441s1 = PorterDuff.Mode.SRC_IN;
        this.f36456y1 = 1.0f;
        this.G1 = "640_360";
        this.H1 = 1920;
        this.K1 = true;
        this.S1 = new org.telegram.ui.Components.m20(getParentActivity(), new rc1(this));
        this.T1 = false;
        this.U1 = false;
        this.f36393b = 2;
        this.B1 = obj;
        this.C1 = bitmap;
        this.D1 = z10;
        if (obj instanceof wi1) {
            wi1 wi1Var = (wi1) obj;
            this.E1 = wi1Var.f39358j;
            TLRPC.TL_wallPaper tL_wallPaper = wi1Var.f39356g;
            this.W0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f7 = wi1Var.h;
                this.l1 = f7;
                if (f7 < 0.0f && !org.telegram.ui.ActionBar.i6.I.q()) {
                    this.l1 *= -1.0f;
                }
            }
        }
        q5Var.v = true;
        q5Var3.v = true;
        q5Var2.v = true;
        q5Var4.v = true;
    }

    public static void U(pd1 pd1Var, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (pd1Var.getParentActivity() == null) {
            return;
        }
        rg.j0 j0Var = new rg.j0(23, pd1Var.currentAccount, pd1Var.getParentActivity(), pd1Var, pd1Var.f36390a);
        j0Var.G1(canApplyBoost);
        j0Var.F1(pd1Var.V1, true);
        j0Var.H1(pd1Var.J1);
        if (!pd1Var.U0()) {
            j0Var.Q0 = new bc1(pd1Var, 1);
        }
        pd1Var.showDialog(j0Var);
    }

    public static void V(pd1 pd1Var) {
        org.telegram.ui.ActionBar.g6 k10;
        org.telegram.ui.ActionBar.h6 h6Var = org.telegram.ui.ActionBar.i6.M;
        if (h6Var == null) {
            return;
        }
        int i10 = h6Var.Z;
        if (i10 >= 0) {
            k10 = (org.telegram.ui.ActionBar.g6) h6Var.f18952a0.get(i10);
        } else {
            k10 = h6Var.k(false);
        }
        if (pd1Var.f36439s != null) {
            pd1Var.W0();
            org.telegram.ui.ActionBar.i6.t1(pd1Var.f36404e0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.i6.M != null) {
                org.telegram.ui.ActionBar.i6.O = false;
                org.telegram.ui.ActionBar.i6.P = false;
                org.telegram.ui.ActionBar.i6.M = null;
            }
            org.telegram.ui.ActionBar.i6.t(pd1Var.f36404e0, true, pd1Var.f36408f0);
            ((ActionBarLayout) pd1Var.parentLayout).U(false, false);
        } else {
            ((ActionBarLayout) pd1Var.parentLayout).U(false, false);
            File file = new File(pd1Var.f36404e0.f18953b);
            org.telegram.ui.ActionBar.h6 h6Var2 = pd1Var.f36404e0;
            org.telegram.ui.ActionBar.i6.u(file, h6Var2.f18951a, h6Var2.F, false);
            MessagesController.getInstance(pd1Var.f36404e0.E).saveTheme(pd1Var.f36404e0, null, false, false);
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", pd1Var.f36404e0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) pd1Var.getParentLayout().getFragmentStack().get(Math.max(0, pd1Var.getParentLayout().getFragmentStack().size() - 2));
        pd1Var.finishFragment();
        if (pd1Var.f36393b == 0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didApplyNewTheme, h6Var, k10, Boolean.valueOf(pd1Var.f36414h0));
        }
        org.telegram.ui.ActionBar.i6.F1(o2Var);
    }

    public static void W(pd1 pd1Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = pd1Var.V0;
        org.telegram.ui.ActionBar.g6 g6Var = pd1Var.f36439s;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            pd1Var.U0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_wallPapers.wallpapers.get(i10) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i10);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f18335id))) {
                            pd1Var.U0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.f18335id), tL_wallPaper2);
                        }
                        if (g6Var != null && (str = g6Var.f18917o) != null && str.equals(tL_wallPaper2.slug)) {
                            pd1Var.W0 = tL_wallPaper2;
                            pd1Var.b1(false);
                            pd1Var.j1();
                        } else if (g6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = pd1Var.W0;
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
            if (!z10 && (tL_wallPaper = pd1Var.W0) != null) {
                pd1Var.U0.add(0, tL_wallPaper);
            }
            nd1 nd1Var = pd1Var.Q0;
            if (nd1Var != null) {
                nd1Var.l();
            }
            MessagesStorage.getInstance(pd1Var.currentAccount).putWallpapers(tL_wallPapers.wallpapers, 1);
        }
        if (pd1Var.W0 == null && g6Var != null && !TextUtils.isEmpty(g6Var.f18917o)) {
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = g6Var.f18917o;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(pd1Var.currentAccount).bindRequestToGuid(pd1Var.getConnectionsManager().sendRequest(getwallpaper, new hc1(pd1Var, 0)), pd1Var.classGuid);
        }
    }

    public static void X(pd1 pd1Var) {
        org.telegram.ui.Components.am amVar = pd1Var.e;
        int i10 = 0;
        if (amVar != null) {
            amVar.B(pd1Var.getThemedColor(org.telegram.ui.ActionBar.i6.G8));
            pd1Var.e.G(pd1Var.getThemedColor(org.telegram.ui.ActionBar.i6.E8), false);
        }
        Drawable drawable = pd1Var.f36436r;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(pd1Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6), PorterDuff.Mode.MULTIPLY));
        }
        w4 w4Var = pd1Var.C0;
        if (w4Var != null) {
            w4Var.invalidate();
        }
        if (pd1Var.f36433p1 != null) {
            org.telegram.ui.ActionBar.d5 d5Var = pd1Var.parentLayout;
            if (d5Var != null && d5Var.getBottomSheet() != null) {
                pd1Var.parentLayout.getBottomSheet().fixNavigationBar(pd1Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19128h5));
                if (pd1Var.f36393b == 2 && pd1Var.J1 != 0) {
                    pd1Var.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            } else {
                pd1Var.setNavigationBarColor(pd1Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19128h5));
            }
        }
        if (pd1Var.J0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.z81[] z81VarArr = pd1Var.J0;
                if (i11 >= z81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.z81 z81Var = z81VarArr[i11];
                if (z81Var != null) {
                    z81Var.invalidate();
                }
                i11++;
            }
        }
        if (pd1Var.K0 != null) {
            while (true) {
                org.telegram.ui.Components.z81[] z81VarArr2 = pd1Var.K0;
                if (i10 >= z81VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.z81 z81Var2 = z81VarArr2[i10];
                if (z81Var2 != null) {
                    z81Var2.invalidate();
                }
                i10++;
            }
        }
        TextView textView = pd1Var.f36406e2;
        if (textView != null) {
            textView.setTextColor(pd1Var.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
        }
        org.telegram.ui.Components.oq oqVar = pd1Var.V;
        if (oqVar != null) {
            oqVar.invalidate();
        }
        org.telegram.ui.Components.b20 b20Var = pd1Var.f36432p0;
        if (b20Var != null) {
            b20Var.g();
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
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f36452x0, View.SCALE_X, this.f36456y1), ObjectAnimator.ofFloat(this.f36452x0, View.SCALE_Y, this.f36456y1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f36452x0, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f36452x0, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f36452x0, View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f36452x0, View.TRANSLATION_Y, 0.0f));
        }
        this.B0.setInterpolator(org.telegram.ui.Components.sr.f28360g);
        this.B0.addListener(new tc1(this, 1));
        this.B0.start();
    }

    public final void N0(boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pd1.N0(boolean):void");
    }

    public final void O0(boolean z10) {
        int i10 = this.f36393b;
        if (i10 == 2) {
            if (!z10) {
                finishFragment();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.i6.o();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        org.telegram.ui.ActionBar.g6 g6Var = this.f36439s;
        if (i10 == 1) {
            if (this.f36411g0) {
                g6Var.f18908c = this.f36448w;
                g6Var.d = this.f36451x;
                g6Var.e = this.f36454y;
                g6Var.f18909f = this.E;
                g6Var.f18910g = this.F;
                g6Var.h = this.G;
                g6Var.f18911i = this.H;
                g6Var.f18912j = this.I;
                g6Var.f18913k = this.J;
                g6Var.f18914l = this.K;
                g6Var.f18915m = this.L;
                g6Var.f18916n = this.O;
                g6Var.f18917o = this.N;
                g6Var.f18918p = this.M;
            }
            org.telegram.ui.ActionBar.i6.t1(this.f36404e0, false, true, false, false, false);
        } else {
            if (g6Var != null) {
                org.telegram.ui.ActionBar.i6.t1(this.f36404e0, false, this.f36414h0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).U(false, false);
            if (this.f36414h0) {
                org.telegram.ui.ActionBar.h6 h6Var = this.f36404e0;
                if (h6Var.f18953b != null && org.telegram.ui.ActionBar.i6.H.get(h6Var.m()) == null) {
                    new File(h6Var.f18953b).delete();
                }
            }
        }
        if (!z10) {
            finishFragment();
        }
    }

    public final BitmapDrawable P0(Drawable drawable) {
        WeakReference weakReference = this.f36410f2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.f36413g2;
        }
        WeakReference weakReference2 = this.f36410f2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f36410f2 = null;
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            this.f36410f2 = new WeakReference(drawable);
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
            this.f36413g2 = bitmapDrawable;
            bitmapDrawable.setFilterBitmap(true);
            return this.f36413g2;
        }
        this.f36413g2 = null;
        return null;
    }

    public final boolean Q0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pd1.Q0(boolean):boolean");
    }

    public final int R0() {
        if (ChatObject.isChannelAndNotMegaGroup(-this.J1, this.currentAccount)) {
            return getMessagesController().channelCustomWallpaperLevelMin;
        }
        return getMessagesController().groupCustomWallpaperLevelMin;
    }

    public final ArrayList S0() {
        qy0 qy0Var = new qy0(7, this);
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.m0;
        int i10 = org.telegram.ui.ActionBar.i6.f19057d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(frameLayout, 1, null, null, null, qy0Var, i10));
        z4.g gVar = this.f36420j0;
        int i11 = org.telegram.ui.ActionBar.i6.f19337s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(gVar, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, i11));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.i6.f19356t8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(lVar, 256, null, null, null, null, i12));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.i6.A8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(lVar2, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.i6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.i6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36440s0, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36440s0, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36440s0, 1024, null, null, null, null, org.telegram.ui.ActionBar.i6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36440s0, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36440s0, Integer.MIN_VALUE, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36440s0, 1073741824, null, null, null, qy0Var, org.telegram.ui.ActionBar.i6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36428n0, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 32768, null, null, null, null, i11));
        if (!this.d) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36394b0, 1, null, null, null, null, i10));
            TextView textView = this.f36401d0;
            int i14 = org.telegram.ui.ActionBar.i6.Ae;
            arrayList.add(new org.telegram.ui.ActionBar.k6(textView, 4, null, null, null, null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36398c0, 4, null, null, null, null, i14));
        }
        org.telegram.ui.Components.oq oqVar = this.V;
        if (oqVar != null) {
            org.telegram.ui.ActionBar.w0 w0Var = oqVar.I;
            EditTextBoldCursor[] editTextBoldCursorArr = oqVar.E;
            for (int i15 = 0; i15 < editTextBoldCursorArr.length; i15++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.i6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursorArr[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursorArr[i15], 8388608, null, null, null, null, org.telegram.ui.ActionBar.i6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursorArr[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.i6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursorArr[i15], 32, null, null, null, null, org.telegram.ui.ActionBar.i6.f19185k6));
                arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursorArr[i15], 65568, null, null, null, null, org.telegram.ui.ActionBar.i6.f19203l6));
            }
            org.telegram.ui.ActionBar.l0 l0Var = oqVar.F;
            int i17 = org.telegram.ui.ActionBar.i6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.k6(l0Var, 8, null, null, null, null, i17));
            org.telegram.ui.ActionBar.l0 l0Var2 = oqVar.F;
            int i18 = org.telegram.ui.ActionBar.i6.I5;
            arrayList.add(new org.telegram.ui.ActionBar.k6(l0Var2, 32, null, null, null, null, i18));
            if (w0Var != null) {
                org.telegram.ui.Components.y6 y6Var = new org.telegram.ui.Components.y6(oqVar, 3);
                arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, null, null, null, y6Var, i17));
                arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, null, null, null, y6Var, i18));
                arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.L0;
        if (frameLayoutArr != null) {
            for (int i19 = 0; i19 < frameLayoutArr.length; i19++) {
                arrayList.add(new org.telegram.ui.ActionBar.k6(frameLayoutArr[i19], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f19144i3}, null, org.telegram.ui.ActionBar.i6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.k6(frameLayoutArr[i19], 0, null, org.telegram.ui.ActionBar.i6.f19162j2, null, null, org.telegram.ui.ActionBar.i6.Sd));
            }
            int i20 = 0;
            while (true) {
                FrameLayout[] frameLayoutArr2 = this.O0;
                if (i20 >= frameLayoutArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.k6(frameLayoutArr2[i20], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f19144i3}, null, org.telegram.ui.ActionBar.i6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.k6(frameLayoutArr2[i20], 0, null, org.telegram.ui.ActionBar.i6.f19162j2, null, null, org.telegram.ui.ActionBar.i6.Sd));
                i20++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.C0, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f19144i3}, null, org.telegram.ui.ActionBar.i6.Td));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.C0, 0, null, org.telegram.ui.ActionBar.i6.f19162j2, null, null, org.telegram.ui.ActionBar.i6.Sd));
            int i21 = 0;
            while (true) {
                TextView[] textViewArr = this.N0;
                if (i21 >= textViewArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.k6(textViewArr[i21], 4, null, null, null, null, org.telegram.ui.ActionBar.i6.Ae));
                i21++;
            }
            int i22 = 0;
            while (true) {
                TextView[] textViewArr2 = this.M0;
                if (i22 >= textViewArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.k6(textViewArr2[i22], 4, null, null, null, null, org.telegram.ui.ActionBar.i6.Ae));
                i22++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.T0, 0, new Class[]{org.telegram.ui.Components.to0.class}, new String[]{"innerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Ti));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.T0, 0, new Class[]{org.telegram.ui.Components.to0.class}, new String[]{"outerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Vi));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.S0, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f19219m3, org.telegram.ui.ActionBar.i6.f19294q3}, null, org.telegram.ui.ActionBar.i6.f19320ra));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f19239n3, org.telegram.ui.ActionBar.i6.f19313r3}, null, org.telegram.ui.ActionBar.i6.f19063dc));
            Drawable[] drawableArr = org.telegram.ui.ActionBar.i6.f19219m3.f18871y;
            int i23 = org.telegram.ui.ActionBar.i6.ta;
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.i6.f19294q3.f18871y, null, i23));
            org.telegram.ui.ActionBar.q5 q5Var = this.R;
            org.telegram.ui.ActionBar.q5 q5Var2 = this.T;
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{q5Var, q5Var2}, null, org.telegram.ui.ActionBar.i6.Aa));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{q5Var, q5Var2}, null, org.telegram.ui.ActionBar.i6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{q5Var, q5Var2}, null, org.telegram.ui.ActionBar.i6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{q5Var, q5Var2}, null, org.telegram.ui.ActionBar.i6.Fa));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f19275p3, org.telegram.ui.ActionBar.i6.f19351t3}, null, org.telegram.ui.ActionBar.i6.Ba));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.i6.f19256o3.f18871y;
            int i24 = org.telegram.ui.ActionBar.i6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr2, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.i6.f19332s3.f18871y, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.ec));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19098fc));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.y3}, null, org.telegram.ui.ActionBar.i6.Ja));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f19458z3}, null, org.telegram.ui.ActionBar.i6.Ka));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.A3, org.telegram.ui.ActionBar.i6.C3}, null, org.telegram.ui.ActionBar.i6.La));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.B3, org.telegram.ui.ActionBar.i6.D3}, null, org.telegram.ui.ActionBar.i6.Ma));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.F3, org.telegram.ui.ActionBar.i6.G3}, null, org.telegram.ui.ActionBar.i6.f19341sc));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Uc));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19005ab));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Wc));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.cb));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Yc));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19062db));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19007ad));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19097fb));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19247nd));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19340sb));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19265od));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36444u0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.nb));
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.f19058d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.f19128h5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, qy0Var, org.telegram.ui.ActionBar.i6.f19146i5));
        for (int i25 = 0; i25 < arrayList.size(); i25++) {
            ((org.telegram.ui.ActionBar.k6) arrayList.get(i25)).f19540o = this.f36390a;
        }
        return arrayList;
    }

    public final boolean T0(int i10) {
        int B0;
        long j3;
        if (this.f36411g0) {
            return false;
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.f36439s;
        if (i10 == 1 || i10 == 2) {
            long j10 = this.I;
            if (j10 != 0) {
                if (j10 != g6Var.f18912j) {
                    return true;
                }
            } else {
                int B02 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Nd);
                int i11 = (int) g6Var.f18912j;
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
                        B0 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Od);
                        j3 = g6Var.f18913k;
                    } else if (i12 == 1) {
                        B0 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Pd);
                        j3 = g6Var.f18914l;
                    } else {
                        B0 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Qd);
                        j3 = g6Var.f18915m;
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
            } else if (j13 != g6Var.f18913k || j12 != g6Var.f18914l || j11 != g6Var.f18915m) {
                return true;
            }
            if (g6Var.f18916n != this.O) {
                return true;
            }
        }
        if (i10 == 1 || i10 == 3) {
            if (this.f36448w != g6Var.d) {
                return true;
            }
            int i14 = this.f36454y;
            if (i14 != 0) {
                if (i14 != g6Var.e) {
                    return true;
                }
            } else {
                int i15 = g6Var.e;
                if (i15 != 0 && i15 != g6Var.f18908c) {
                    return true;
                }
            }
            int i16 = this.E;
            if (i16 != 0) {
                if (i16 != g6Var.f18909f) {
                    return true;
                }
            } else if (g6Var.f18909f != 0) {
                return true;
            }
            int i17 = this.F;
            if (i17 != 0) {
                if (i17 != g6Var.f18910g) {
                    return true;
                }
            } else if (g6Var.f18910g != 0) {
                return true;
            }
            int i18 = this.G;
            if (i18 != 0) {
                if (i18 != g6Var.h) {
                    return true;
                }
            } else if (g6Var.h != 0) {
                return true;
            }
            if (this.H != g6Var.f18911i) {
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
        v5 v5Var = this.Q1;
        if (v5Var != null) {
            v5Var.invalidate();
        }
        FrameLayout frameLayout = this.f36455y0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f36455y0.getChildAt(i10).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.f36457z0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                this.f36457z0.getChildAt(i11).invalidate();
            }
        }
        if (this.J0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.z81[] z81VarArr = this.J0;
                if (i12 >= z81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.z81 z81Var = z81VarArr[i12];
                if (z81Var != null) {
                    if (this.M1) {
                        f7 = this.f36429n1 * this.f36431o1;
                    } else {
                        f7 = 0.0f;
                    }
                    z81Var.setDimAmount(f7);
                    this.J0[i12].invalidate();
                }
                i12++;
            }
        }
        if (this.f36428n0 != null) {
            for (int i13 = 0; i13 < this.f36428n0.getChildCount(); i13++) {
                View childAt = this.f36428n0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.w0) {
                    d1((org.telegram.ui.Cells.w0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.f36444u0 != null) {
            for (int i14 = 0; i14 < this.f36444u0.getChildCount(); i14++) {
                View childAt2 = this.f36444u0.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                    d1((org.telegram.ui.Cells.w0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        fd1 fd1Var = this.f36458z1;
        if (fd1Var != null) {
            fd1Var.invalidate();
        }
        fd1 fd1Var2 = this.A1;
        if (fd1Var2 != null) {
            fd1Var2.invalidate();
        }
        w4 w4Var = this.C0;
        if (w4Var != null) {
            w4Var.invalidate();
        }
    }

    public final void W0() {
        org.telegram.ui.ActionBar.g6 g6Var = this.f36439s;
        if (g6Var != null && !TextUtils.isEmpty(g6Var.f18917o)) {
            try {
                File d = g6Var.d();
                Drawable background = this.f36452x0.getBackground();
                Bitmap bitmap = this.f36452x0.getImageReceiver().getBitmap();
                if (background instanceof org.telegram.ui.Components.nc0) {
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
                paint.setColorFilter(new PorterDuffColorFilter(this.f36421j1, this.f36441s1));
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
        org.telegram.ui.ActionBar.g6 g6Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (getParentActivity() != null && this.f36427n != i10 && this.f36438r1 == null && (g6Var = this.f36439s) != null) {
            if (z10 && i10 == 2 && (org.telegram.ui.ActionBar.i6.Z0() || g6Var.f18912j == 4294967296L)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.ChangeChatBackground);
                if (org.telegram.ui.ActionBar.i6.Z0() && (!org.telegram.ui.ActionBar.i6.Z0() || org.telegram.ui.ActionBar.i6.I.f18963i0.d == 0)) {
                    alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.ChangeWallpaperToColor);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Change), new dc1(this, 7));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                } else {
                    alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.ChangeColorToColor);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new dc1(this, 5));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Continue), new dc1(this, 6));
                }
                showDialog(alertDialog$Builder.f18655a);
                return;
            }
            int i18 = this.f36427n;
            this.f36427n = i10;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        this.h.setText(LocaleController.getString(R.string.ColorPickerMyMessages));
                        if (g6Var.f18909f != 0) {
                            if (g6Var.h != 0) {
                                i17 = 4;
                            } else if (g6Var.f18910g != 0) {
                                i17 = 3;
                            } else {
                                i17 = 2;
                            }
                        } else {
                            i17 = 1;
                        }
                        org.telegram.ui.Components.oq oqVar = this.V;
                        T0(3);
                        oqVar.f(2, 4, i17, true);
                        this.V.e(g6Var.h, 3);
                        this.V.e(g6Var.f18910g, 2);
                        this.V.e(g6Var.f18909f, 1);
                        org.telegram.ui.Components.oq oqVar2 = this.V;
                        int i19 = g6Var.e;
                        if (i19 == 0) {
                            i19 = g6Var.f18908c;
                        }
                        oqVar2.e(i19, 0);
                        this.K0[1].b(0, g6Var.e);
                        this.K0[1].b(1, g6Var.f18909f);
                        this.K0[1].b(2, g6Var.f18910g);
                        this.K0[1].b(3, g6Var.h);
                        if (g6Var.f18910g != 0) {
                            if (i18 == 1) {
                                this.f36446v0.o(0);
                            } else {
                                this.f36446v0.m(0);
                            }
                        } else if (i18 == 2) {
                            this.f36446v0.u(0);
                        }
                        this.f36444u0.w0(0, AndroidUtilities.dp(60.0f), null);
                        e1();
                    }
                } else {
                    this.h.setText(LocaleController.getString(R.string.ColorPickerBackground));
                    int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.Nd);
                    int i20 = org.telegram.ui.ActionBar.i6.Od;
                    if (org.telegram.ui.ActionBar.i6.c1(i20)) {
                        i12 = getThemedColor(i20);
                    } else {
                        i12 = 0;
                    }
                    int i21 = org.telegram.ui.ActionBar.i6.Pd;
                    if (org.telegram.ui.ActionBar.i6.c1(i21)) {
                        i13 = getThemedColor(i21);
                    } else {
                        i13 = 0;
                    }
                    int i22 = org.telegram.ui.ActionBar.i6.Qd;
                    if (org.telegram.ui.ActionBar.i6.c1(i22)) {
                        i14 = getThemedColor(i22);
                    } else {
                        i14 = 0;
                    }
                    long j3 = g6Var.f18913k;
                    int i23 = (int) j3;
                    if (i23 == 0 && j3 != 0) {
                        i12 = 0;
                    }
                    long j10 = g6Var.f18914l;
                    int i24 = (int) j10;
                    if (i24 == 0 && j10 != 0) {
                        i13 = 0;
                    }
                    long j11 = g6Var.f18915m;
                    int i25 = (int) j11;
                    if (i25 == 0 && j11 != 0) {
                        i14 = 0;
                    }
                    int i26 = (int) g6Var.f18912j;
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
                    org.telegram.ui.Components.oq oqVar3 = this.V;
                    T0(2);
                    oqVar3.f(2, 4, i16, false);
                    org.telegram.ui.Components.oq oqVar4 = this.V;
                    if (i25 == 0) {
                        i25 = i14;
                    }
                    oqVar4.e(i25, 3);
                    org.telegram.ui.Components.oq oqVar5 = this.V;
                    if (i15 != 0) {
                        i13 = i15;
                    }
                    oqVar5.e(i13, 2);
                    org.telegram.ui.Components.oq oqVar6 = this.V;
                    if (i23 == 0) {
                        i23 = i12;
                    }
                    oqVar6.e(i23, 1);
                    org.telegram.ui.Components.oq oqVar7 = this.V;
                    if (i26 != 0) {
                        themedColor = i26;
                    }
                    oqVar7.e(themedColor, 0);
                    if (i18 != 1 && g6Var.f18910g != 0) {
                        this.f36446v0.m(0);
                    } else {
                        this.f36446v0.o(0);
                    }
                    this.f36444u0.w0(0, AndroidUtilities.dp(60.0f), null);
                }
            } else {
                this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
                if (g6Var.d != 0) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                org.telegram.ui.Components.oq oqVar8 = this.V;
                T0(1);
                oqVar8.f(1, 2, i11, false);
                this.V.e(g6Var.f18908c, 0);
                int i27 = g6Var.d;
                if (i27 != 0) {
                    this.V.e(i27, 1);
                }
                if (i18 == 2 || (i18 == 3 && g6Var.f18910g != 0)) {
                    this.f36446v0.u(0);
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
                if (this.f36404e0.q()) {
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
        ValueAnimator valueAnimator = this.f36400c2;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f36400c2.cancel();
        }
        ed1[] ed1VarArr = this.f36449w0;
        ed1 ed1Var = ed1VarArr[0];
        ed1 ed1Var2 = ed1VarArr[1];
        ed1VarArr[0] = ed1Var2;
        ed1VarArr[1] = ed1Var;
        this.f36442t0.removeView(ed1Var2);
        this.f36442t0.addView(ed1VarArr[0], this.f36442t0.indexOfChild(ed1VarArr[1]) + 1);
        ed1 ed1Var3 = ed1VarArr[0];
        this.f36452x0 = ed1Var3;
        ed1Var3.setBackground(ed1VarArr[1].getBackground());
        k1();
        ed1VarArr[1].setVisibility(0);
        ed1VarArr[1].setAlpha(1.0f);
        this.f36452x0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f36400c2 = ofFloat;
        ofFloat.addUpdateListener(new bj(2, this));
        this.f36400c2.addListener(new tc1(this, 0));
        this.f36400c2.setInterpolator(org.telegram.ui.Components.sr.f28359f);
        this.f36400c2.setDuration(300L);
        this.f36400c2.start();
        this.f36452x0.getImageReceiver().setCrossfadeDuration(300);
        this.f36452x0.getImageReceiver().setImage(ImageLocation.getForDocument(tL_wallPaper2.document), this.G1, null, null, null, tL_wallPaper2.document.size, "jpg", tL_wallPaper2, 1);
        this.f36452x0.d();
        this.W0 = tL_wallPaper2;
        this.E1 = this.J0[2].f30881s;
        j1();
    }

    public final void a1(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.nc0 nc0Var;
        if (i11 == 0) {
            this.Z0 = i10;
        } else if (i11 == 1) {
            this.f36395b1 = i10;
        } else if (i11 == 2) {
            this.f36399c1 = i10;
        } else if (i11 == 3) {
            this.f36402d1 = i10;
        }
        m1(z10);
        if (this.J0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.z81[] z81VarArr = this.J0;
                if (i12 >= z81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.z81 z81Var = z81VarArr[i12];
                if (z81Var != null) {
                    z81Var.b(i11, i10);
                }
                i12++;
            }
        }
        if (this.f36399c1 != 0) {
            if (this.T0 != null && org.telegram.ui.ActionBar.i6.I.q()) {
                this.T0.setTwoSided(true);
            }
            Drawable background = this.f36452x0.getBackground();
            if (background instanceof org.telegram.ui.Components.nc0) {
                nc0Var = (org.telegram.ui.Components.nc0) background;
            } else {
                nc0Var = new org.telegram.ui.Components.nc0();
                nc0Var.r(this.f36452x0);
                if (this.D1) {
                    nc0Var.m(false);
                }
            }
            nc0Var.n(this.Z0, this.f36395b1, this.f36399c1, this.f36402d1);
            this.f36452x0.setBackground(nc0Var);
            this.f36421j1 = nc0Var.f();
            this.f36424k1 = 754974720;
        } else if (this.f36395b1 != 0) {
            this.f36452x0.setBackground(new GradientDrawable(org.telegram.ui.Components.v9.d(this.f36415h1), new int[]{this.Z0, this.f36395b1}));
            int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(this.Z0, this.f36395b1));
            this.f36424k1 = patternColor;
            this.f36421j1 = patternColor;
        } else {
            this.f36452x0.setBackgroundColor(this.Z0);
            int patternColor2 = AndroidUtilities.getPatternColor(this.Z0);
            this.f36424k1 = patternColor2;
            this.f36421j1 = patternColor2;
        }
        int i13 = org.telegram.ui.ActionBar.i6.f19209lc;
        boolean c12 = org.telegram.ui.ActionBar.i6.c1(i13);
        pc1 pc1Var = this.f36390a;
        if (c12 && !(this.f36452x0.getBackground() instanceof org.telegram.ui.Components.nc0)) {
            if (org.telegram.ui.ActionBar.i6.s0() instanceof org.telegram.ui.Components.nc0) {
                getThemedColor(i13);
                pc1Var.b(this.f36452x0.getBackground(), this.f36452x0.getBackground(), Float.valueOf(this.l1));
            }
        } else {
            pc1Var.b(this.f36452x0.getBackground(), this.f36452x0.getBackground(), Float.valueOf(this.l1));
        }
        ImageView imageView = this.F0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.f19153ic), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.G0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.f19153ic), PorterDuff.Mode.MULTIPLY));
        }
        ed1 ed1Var = this.f36452x0;
        if (ed1Var != null) {
            ed1Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f36421j1, this.f36441s1));
            this.f36452x0.getImageReceiver().setAlpha(Math.abs(this.l1));
            this.f36452x0.invalidate();
            if (org.telegram.ui.ActionBar.i6.I.q() && (this.f36452x0.getBackground() instanceof org.telegram.ui.Components.nc0)) {
                org.telegram.ui.Cells.j0 j0Var = this.T0;
                if (j0Var != null) {
                    j0Var.setTwoSided(true);
                }
                if (this.l1 < 0.0f) {
                    this.f36452x0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.nc0) this.f36452x0.getBackground()).f26793k);
                }
            } else {
                this.f36452x0.getImageReceiver().setGradientBitmap(null);
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
        jc1 jc1Var = this.f36444u0;
        if (jc1Var != null) {
            jc1Var.g1();
        }
        FrameLayout frameLayout = this.f36455y0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                this.f36455y0.getChildAt(i14).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.f36457z0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                this.f36457z0.getChildAt(i15).invalidate();
            }
        }
    }

    public final void b1(boolean z10) {
        org.telegram.ui.Components.nc0 nc0Var;
        org.telegram.ui.Components.nc0 nc0Var2;
        int i10;
        int g10;
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.ActionBar.g6 g6Var = this.f36439s;
        int i11 = this.f36393b;
        if (i11 == 0 && g6Var == null) {
            this.f36452x0.setBackground(org.telegram.ui.ActionBar.i6.r0());
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
                    ed1 ed1Var = this.f36452x0;
                    ed1Var.f29894a.setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.G1, ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    ed1Var.d();
                } else if (obj instanceof wi1) {
                    wi1 wi1Var = (wi1) obj;
                    int i12 = wi1Var.f39355f;
                    int i13 = wi1Var.e;
                    int i14 = wi1Var.d;
                    int i15 = wi1Var.f39354c;
                    int i16 = wi1Var.f39353b;
                    this.f36415h1 = i12;
                    a1(i16, 0, false);
                    if (i15 != 0) {
                        a1(i15, 1, false);
                    }
                    a1(i14, 2, false);
                    a1(i13, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.W0;
                    if (tL_wallPaper2 != null) {
                        ed1 ed1Var2 = this.f36452x0;
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                        String str = this.G1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.W0;
                        ed1Var2.k(forDocument, str, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                    } else if ("d".equals(wi1Var.f39352a)) {
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        Point point2 = AndroidUtilities.displaySize;
                        int max = Math.max(point2.x, point2.y);
                        if (Build.VERSION.SDK_INT >= 29) {
                            g10 = 1459617792;
                        } else {
                            g10 = org.telegram.ui.Components.nc0.g(i16, i15, i14, i13);
                        }
                        this.f36452x0.setImageBitmap(SvgHelper.getBitmap(R.raw.default_pattern, min, max, g10));
                    }
                } else if (obj instanceof xi1) {
                    Bitmap bitmap = this.C1;
                    if (bitmap != null) {
                        this.f36452x0.setImageBitmap(bitmap);
                    } else {
                        xi1 xi1Var = (xi1) obj;
                        File file = xi1Var.e;
                        if (file != null) {
                            this.f36452x0.f(file.getAbsolutePath(), this.G1, null);
                        } else {
                            File file2 = xi1Var.d;
                            if (file2 != null) {
                                this.f36452x0.f(file2.getAbsolutePath(), this.G1, null);
                            } else if ("t".equals(xi1Var.f39665a)) {
                                ed1 ed1Var3 = this.f36452x0;
                                ed1Var3.setImageDrawable(org.telegram.ui.ActionBar.i6.W0(ed1Var3, false));
                            } else {
                                int i17 = xi1Var.f39666b;
                                if (i17 != 0) {
                                    this.f36452x0.setImageResource(i17);
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
                        this.f36452x0.k(ImageLocation.getForPhoto(photoSize2, searchImage.photo), this.G1, ImageLocation.getForPhoto(closestPhotoSizeWithSize, searchImage.photo), "100_100_b", i10, "jpg", searchImage, 1);
                    } else {
                        ed1 ed1Var4 = this.f36452x0;
                        String str2 = searchImage.imageUrl;
                        String str3 = this.G1;
                        String str4 = searchImage.thumbUrl;
                        ed1Var4.getClass();
                        ed1Var4.m(ImageLocation.getForPath(str2), str3, ImageLocation.getForPath(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (g6Var == null) {
                this.f36452x0.setBackground(org.telegram.ui.ActionBar.i6.r0());
            } else {
                org.telegram.ui.Components.q9 q9Var = this.f36445u1;
                if (q9Var != null) {
                    q9Var.dispose();
                    this.f36445u1 = null;
                }
                int B0 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Nd);
                int i18 = (int) g6Var.f18912j;
                if (i18 != 0) {
                    B0 = i18;
                }
                int B02 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Od);
                long j3 = g6Var.f18913k;
                int i19 = (int) j3;
                if (i19 == 0 && j3 != 0) {
                    B02 = 0;
                } else if (i19 != 0) {
                    B02 = i19;
                }
                int B03 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Pd);
                long j10 = g6Var.f18914l;
                int i20 = (int) j10;
                if (i20 == 0 && j10 != 0) {
                    B03 = 0;
                } else if (i20 != 0) {
                    B03 = i20;
                }
                int B04 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Qd);
                long j11 = g6Var.f18915m;
                int i21 = (int) j11;
                if (i21 == 0 && j11 != 0) {
                    B04 = 0;
                } else if (i21 != 0) {
                    B04 = i21;
                }
                if (!TextUtils.isEmpty(g6Var.f18917o) && !org.telegram.ui.ActionBar.i6.Z0()) {
                    if (B03 != 0) {
                        Drawable background = this.f36452x0.getBackground();
                        if (background instanceof org.telegram.ui.Components.nc0) {
                            nc0Var2 = (org.telegram.ui.Components.nc0) background;
                        } else {
                            org.telegram.ui.Components.nc0 nc0Var3 = new org.telegram.ui.Components.nc0();
                            nc0Var3.r(this.f36452x0);
                            nc0Var2 = nc0Var3;
                            if (this.D1) {
                                nc0Var3.m(false);
                                nc0Var2 = nc0Var3;
                            }
                        }
                        nc0Var2.n(B0, B02, B03, B04);
                        nc0Var = nc0Var2;
                    } else if (B02 != 0) {
                        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(org.telegram.ui.Components.v9.d(g6Var.f18916n), new int[]{B0, B02});
                        this.f36445u1 = v9Var.f(o0.c.E(0.5f, 3), new xc1(this, 0), 100L);
                        nc0Var = v9Var;
                    } else {
                        nc0Var = new ColorDrawable(B0);
                    }
                    this.f36452x0.setBackground(nc0Var);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.W0;
                    if (tL_wallPaper4 != null) {
                        ed1 ed1Var5 = this.f36452x0;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(tL_wallPaper4.document);
                        String str5 = this.G1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.W0;
                        ed1Var5.k(forDocument2, str5, null, null, tL_wallPaper5.document.size, "jpg", tL_wallPaper5, 1);
                    }
                } else {
                    Drawable s02 = org.telegram.ui.ActionBar.i6.s0();
                    if (s02 != null) {
                        if (s02 instanceof org.telegram.ui.Components.nc0) {
                            ((org.telegram.ui.Components.nc0) s02).r(this.f36452x0);
                        }
                        this.f36452x0.setBackground(s02);
                    }
                }
                if (B02 == 0) {
                    int patternColor = AndroidUtilities.getPatternColor(B0);
                    this.f36424k1 = patternColor;
                    this.f36421j1 = patternColor;
                } else if (B03 != 0) {
                    this.f36421j1 = org.telegram.ui.Components.nc0.g(B0, B02, B03, B04);
                    this.f36424k1 = 754974720;
                } else {
                    int patternColor2 = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(B0, B02));
                    this.f36424k1 = patternColor2;
                    this.f36421j1 = patternColor2;
                }
                ed1 ed1Var6 = this.f36452x0;
                if (ed1Var6 != null) {
                    ed1Var6.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f36421j1, this.f36441s1));
                    this.f36452x0.getImageReceiver().setAlpha(Math.abs(this.l1));
                    this.f36452x0.invalidate();
                    if (org.telegram.ui.ActionBar.i6.I.q() && (this.f36452x0.getBackground() instanceof org.telegram.ui.Components.nc0)) {
                        org.telegram.ui.Cells.j0 j0Var = this.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                        if (this.l1 < 0.0f) {
                            this.f36452x0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.nc0) this.f36452x0.getBackground()).f26793k);
                        }
                    } else {
                        this.f36452x0.getImageReceiver().setGradientBitmap(null);
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
                        org.telegram.ui.Components.z81[] z81VarArr = this.J0;
                        if (i22 >= z81VarArr.length) {
                            break;
                        }
                        z81VarArr[i22].b(0, B0);
                        this.J0[i22].b(1, B02);
                        this.J0[i22].b(2, B03);
                        this.J0[i22].b(3, B04);
                        i22++;
                    }
                }
                ImageView imageView = this.F0;
                if (imageView != null) {
                    imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.f19153ic), PorterDuff.Mode.MULTIPLY));
                }
                ImageView imageView2 = this.G0;
                if (imageView2 != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.f19153ic), PorterDuff.Mode.MULTIPLY));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pd1.createView(android.content.Context):android.view.View");
    }

    public final void d1(org.telegram.ui.Cells.w0 w0Var) {
        pc1 pc1Var;
        float f7;
        if (this.f36452x0 == null) {
            return;
        }
        Bitmap bitmap = this.f36390a.f36382r;
        float f10 = 0.0f;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f7 = ((this.f36452x0.getMeasuredWidth() - (Math.max(this.f36452x0.getMeasuredWidth() / width, this.f36452x0.getMeasuredHeight() / pc1Var.f36382r.getHeight()) * width)) / 2.0f) + this.X1 + 0.0f;
        } else {
            f7 = this.X1 + 0.0f;
        }
        float y3 = w0Var.getY() - ((-this.f36452x0.J) + 0.0f);
        int measuredHeight = this.f36452x0.getMeasuredHeight();
        if (this.M1) {
            f10 = this.f36429n1 * this.f36431o1;
        }
        w0Var.f21777w0 = true;
        w0Var.f21774v0 = measuredHeight;
        w0Var.f21770t0 = y3;
        w0Var.f21772u0 = f7;
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
            org.telegram.ui.Components.yl0 yl0Var = this.f36428n0;
            if (yl0Var != null) {
                int childCount = yl0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f36428n0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.s2) {
                        ((org.telegram.ui.Cells.s2) childAt).b0(0, true);
                    }
                }
            }
        } else if (i10 == NotificationCenter.invalidateMotionBackground) {
            jc1 jc1Var = this.f36444u0;
            if (jc1Var != null) {
                jc1Var.g1();
            }
        } else if (i10 == NotificationCenter.didSetNewWallpapper) {
            if (this.f36442t0 != null) {
                b1(true);
            }
        } else if (i10 == NotificationCenter.wallpapersNeedReload) {
            Object obj = this.B1;
            if (obj instanceof xi1) {
                xi1 xi1Var = (xi1) obj;
                if (xi1Var.f39665a == null) {
                    xi1Var.f39665a = (String) objArr[0];
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
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f18335id))) {
                            this.U0.add(wallPaper);
                            hashMap.put(Long.valueOf(wallPaper.document.f18335id), wallPaper);
                        }
                        org.telegram.ui.ActionBar.g6 g6Var = this.f36439s;
                        if (g6Var != null && (str = g6Var.f18917o) != null && str.equals(wallPaper.slug)) {
                            this.W0 = (TLRPC.TL_wallPaper) wallPaper;
                            b1(false);
                            j1();
                        } else if (g6Var == null) {
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
                nd1 nd1Var = this.Q0;
                if (nd1Var != null) {
                    nd1Var.l();
                }
                int size2 = arrayList.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i14);
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        j3 = MediaDataController.calcHash(j3, wallPaper2.f18481id);
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
        if (this.f36442t0 != null && this.K0 != null && this.f36439s.f18910g != 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("bganimationhint", false)) {
                if (this.A0 == null) {
                    org.telegram.ui.Components.l40 l40Var = new org.telegram.ui.Components.l40(getParentActivity(), 8);
                    this.A0 = l40Var;
                    l40Var.setShowingDuration(5000L);
                    this.A0.setAlpha(0.0f);
                    this.A0.setVisibility(4);
                    this.A0.setText(LocaleController.getString(R.string.BackgroundAnimateInfo));
                    this.A0.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                    this.f36423k0.addView(this.A0, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                AndroidUtilities.runOnUIThread(new fb1(2, this, globalMainSettings), 500L);
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
        int i17 = this.f36393b;
        if (z10) {
            if (i10 == 0) {
                if (i17 == 2) {
                    this.f36392a1 = this.Z0;
                    int i18 = this.f36395b1;
                    this.f36405e1 = i18;
                    int i19 = this.f36399c1;
                    this.f36409f1 = i19;
                    int i20 = this.f36402d1;
                    this.f36412g1 = i20;
                    this.f36418i1 = this.O;
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
                    this.V.e(this.f36402d1, 3);
                    this.V.e(this.f36399c1, 2);
                    this.V.e(this.f36395b1, 1);
                    this.V.e(this.Z0, 0);
                }
            } else {
                this.X0 = this.W0;
                this.f36426m1 = this.l1;
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
            org.telegram.ui.Components.z81[] z81VarArr = this.J0;
            if (z12) {
                c10 = 2;
            } else {
                c10 = 0;
            }
            z81VarArr[c10].setVisibility(0);
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
            this.f36438r1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            if (i10 == 0) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            if (z10) {
                frameLayoutArr[i10].setVisibility(0);
                if (i17 == 1) {
                    jc1 jc1Var = this.f36444u0;
                    Property property = View.TRANSLATION_Y;
                    if (i10 == 1) {
                        f16 = -AndroidUtilities.dp(21.0f);
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(jc1Var, property, f16));
                    org.telegram.ui.Components.z81 z81Var = this.J0[2];
                    Property property2 = View.ALPHA;
                    if (z12) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(z81Var, property2, f17));
                    org.telegram.ui.Components.z81 z81Var2 = this.J0[0];
                    if (z12) {
                        f18 = 0.0f;
                    } else {
                        f18 = 1.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(z81Var2, property2, f18));
                    if (i10 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property2, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i12], property2, 0.0f));
                    }
                    AndroidUtilities.hideKeyboard(this.V.E[1]);
                } else if (i17 == 2) {
                    jc1 jc1Var2 = this.f36444u0;
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
                    org.telegram.ui.Components.z81 z81Var3 = this.J0[2];
                    Property property4 = View.ALPHA;
                    if (z12) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(z81Var3, property4, f15));
                    org.telegram.ui.Components.z81 z81Var4 = this.J0[0];
                    if (z12) {
                        f21 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(z81Var4, property4, f21));
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
                jc1 jc1Var3 = this.f36444u0;
                Property property5 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(jc1Var3, property5, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property5, frameLayout2.getMeasuredHeight()));
                org.telegram.ui.Components.z81 z81Var5 = this.J0[0];
                Property property6 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(z81Var5, property6, 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.J0[2], property6, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.f36452x0, property6, 1.0f));
            }
            this.f36438r1.playTogether(arrayList2);
            this.f36438r1.addListener(new wc1(this, z10, i12, i10, z12));
            this.f36438r1.setInterpolator(org.telegram.ui.Components.sr.f28360g);
            this.f36438r1.setDuration(200L);
            this.f36438r1.start();
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
                jc1 jc1Var4 = this.f36444u0;
                if (i10 == 1) {
                    f12 = -AndroidUtilities.dp(21.0f);
                } else {
                    f12 = 0.0f;
                }
                jc1Var4.setTranslationY(f12);
                org.telegram.ui.Components.z81 z81Var6 = this.J0[2];
                if (z12) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                z81Var6.setAlpha(f13);
                org.telegram.ui.Components.z81 z81Var7 = this.J0[0];
                if (z12) {
                    f14 = 0.0f;
                } else {
                    f14 = 1.0f;
                }
                z81Var7.setAlpha(f14);
                if (i10 == 1) {
                    frameLayoutArr[i10].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    frameLayoutArr[c11].setAlpha(0.0f);
                }
                AndroidUtilities.hideKeyboard(this.V.E[1]);
            } else if (i17 == 2) {
                jc1 jc1Var5 = this.f36444u0;
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
                org.telegram.ui.Components.z81 z81Var8 = this.J0[2];
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                z81Var8.setAlpha(f10);
                org.telegram.ui.Components.z81 z81Var9 = this.J0[0];
                if (z12) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                z81Var9.setAlpha(f11);
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
            this.f36444u0.setTranslationY(0.0f);
            frameLayoutArr[i10].setTranslationY(frameLayout.getMeasuredHeight());
            this.J0[0].setAlpha(1.0f);
            this.J0[2].setAlpha(1.0f);
            this.f36452x0.setAlpha(1.0f);
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
        org.telegram.ui.Components.z81[] z81VarArr2 = this.J0;
        if (!z12) {
            c12 = 2;
        }
        z81VarArr2[c12].setVisibility(4);
    }

    public final void g1() {
        Window window;
        if (this.f36416h2 != null) {
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
        mc mcVar = new mc(this, getParentActivity(), canvas, (this.O1.getMeasuredWidth() / 2.0f) + f7, (this.O1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 2);
        this.f36416h2 = mcVar;
        mcVar.setOnTouchListener(new bi.d(2));
        this.f36419i2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f36422j2 = ofFloat;
        ofFloat.addUpdateListener(new ci.tb(this, 3));
        this.f36422j2.addListener(new tc1(this, 4));
        this.f36422j2.setDuration(400L);
        this.f36422j2.setInterpolator(org.telegram.ui.Components.mt.e);
        this.f36422j2.start();
        frameLayout.addView(this.f36416h2, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new bc1(this, 2));
    }

    @Override
    public final int getObserverTag() {
        return this.f36443t1;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.f36390a;
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
            this.f36458z1.d(LocaleController.getString(R.string.ApplyWallpaperForMe));
        } else if (i10 < 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.J1));
            if (chat != null) {
                this.f36458z1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, chat.title));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.V1;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                    if (this.f36435q1 == null) {
                        org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(R.drawable.mini_switch_lock, 0);
                        this.f36435q1 = qqVar;
                        qqVar.setTopOffset(1);
                    }
                    spannableStringBuilder.setSpan(this.f36435q1, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", R0(), new Object[0]));
                    this.f36458z1.c(spannableStringBuilder, z10);
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
                this.f36458z1.c(null, z10);
                return;
            }
            this.f36458z1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, LocaleController.getString(R.string.AccDescrChannel).toLowerCase()));
        } else {
            this.f36458z1.d(LocaleController.getString(R.string.ApplyWallpaper));
        }
    }

    public final void i1() {
        if (this.F1 && this.f36450w1 == null) {
            Bitmap bitmap = this.C1;
            if (bitmap != null) {
                this.f36453x1 = bitmap;
                this.f36450w1 = Utilities.blurWallpaper(bitmap);
            } else {
                ImageReceiver imageReceiver = this.f36452x0.getImageReceiver();
                if (imageReceiver.hasNotThumb() || imageReceiver.hasStaticThumb()) {
                    this.f36453x1 = imageReceiver.getBitmap();
                    this.f36450w1 = Utilities.blurWallpaper(imageReceiver.getBitmap());
                }
            }
        }
        if (this.F1) {
            Bitmap bitmap2 = this.f36450w1;
            if (bitmap2 != null) {
                this.f36452x0.setImageBitmap(bitmap2);
                return;
            }
            return;
        }
        b1(false);
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.f36393b == 2) {
            if (this.a2 && motionEvent != null) {
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
            int i11 = this.f36393b;
            if (exists) {
                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                this.f36452x0.invalidate();
                if (i11 == 2) {
                    if (j3 != 0 && this.J1 == 0) {
                        this.f36440s0.setSubtitle(AndroidUtilities.formatFileSize(j3));
                    } else {
                        this.f36440s0.setSubtitle(null);
                    }
                }
            } else {
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(str, null, this);
                if (i11 == 2 && this.J1 == 0) {
                    this.f36440s0.setSubtitle(LocaleController.getString(R.string.LoadingFullImage));
                }
                this.f36452x0.invalidate();
            }
            float f11 = 0.5f;
            if (this.W0 == null && (frameLayout = this.f36455y0) != null) {
                if (exists) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                frameLayout.setAlpha(f10);
            }
            if (i11 == 0) {
                this.f36398c0.setEnabled(exists);
                TextView textView = this.f36398c0;
                if (exists) {
                    f11 = 1.0f;
                }
                textView.setAlpha(f11);
            } else if (i11 == 2) {
                this.C0.setEnabled(exists);
                fd1 fd1Var = this.f36458z1;
                if (fd1Var != null) {
                    if (exists) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.5f;
                    }
                    fd1Var.setAlpha(f7);
                }
                fd1 fd1Var2 = this.A1;
                if (fd1Var2 != null) {
                    if (exists) {
                        f11 = 1.0f;
                    }
                    fd1Var2.setAlpha(f11);
                }
            } else {
                this.f36407f.setEnabled(exists);
                org.telegram.ui.ActionBar.w0 w0Var = this.f36407f;
                if (exists) {
                    f11 = 1.0f;
                }
                w0Var.setAlpha(f11);
            }
        }
    }

    public final void k1() {
        this.f36452x0.getImageReceiver().setAlpha(Math.abs(this.l1));
        this.f36452x0.invalidate();
        this.P0.g1();
        if (this.l1 >= 0.0f) {
            this.f36452x0.getImageReceiver().setGradientBitmap(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f36452x0.getImageReceiver().setBlendMode(null);
            }
            if (this.f36452x0.getBackground() instanceof org.telegram.ui.Components.nc0) {
                this.f36452x0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.nc0) this.f36452x0.getBackground()).f26793k);
            }
        }
        this.f36390a.b(this.f36452x0.getBackground(), this.f36452x0.getBackground(), Float.valueOf(this.l1));
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
        int i10 = this.f36393b;
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
            org.telegram.ui.Components.z81 z81Var = this.J0[0];
            if (this.W0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            z81Var.setEnabled(z11);
            if (this.W0 != null) {
                this.J0[0].setVisibility(0);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            int dp = (AndroidUtilities.dp(9.0f) + ((FrameLayout.LayoutParams) this.J0[1].getLayoutParams()).width) / 2;
            org.telegram.ui.Components.z81 z81Var2 = this.J0[0];
            Property property = View.ALPHA;
            if (this.W0 == null) {
                f11 = 0.0f;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(z81Var2, property, f11));
            org.telegram.ui.Components.z81 z81Var3 = this.J0[0];
            Property property2 = View.TRANSLATION_X;
            if (this.W0 != null) {
                f10 = 0.0f;
            } else {
                f10 = dp;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(z81Var3, property2, f10));
            org.telegram.ui.Components.z81 z81Var4 = this.J0[1];
            if (this.W0 == null) {
                f12 = -dp;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(z81Var4, property2, f12));
            animatorSet.setInterpolator(org.telegram.ui.Components.sr.f28360g);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new vc1(this));
            animatorSet.start();
            return;
        }
        if (this.W0 == null && (this.B1 instanceof wi1)) {
            this.J0[2].a(false, true);
        }
        org.telegram.ui.Components.z81[] z81VarArr = this.J0;
        if (this.W0 != null) {
            c10 = 2;
        } else {
            c10 = 0;
        }
        z81VarArr[c10].setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        org.telegram.ui.Components.z81 z81Var5 = this.J0[2];
        Property property3 = View.ALPHA;
        if (this.W0 != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z81Var5, property3, f7);
        org.telegram.ui.Components.z81 z81Var6 = this.J0[0];
        if (this.W0 != null) {
            f11 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(z81Var6, property3, f11));
        animatorSet2.addListener(new uc1(this));
        animatorSet2.setInterpolator(org.telegram.ui.Components.sr.f28360g);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }

    public final void m1(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pd1.m1(boolean):void");
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
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && d5Var.getBottomSheet() != null) {
            this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.i6.f19128h5));
            if (this.f36393b == 2 && this.J1 != 0) {
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
        int i10 = this.f36393b;
        if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 == 2 || i10 == 1) {
            org.telegram.ui.ActionBar.i6.N = true;
        }
        if (i10 == 0 && this.f36439s == null) {
            this.E1 = org.telegram.ui.ActionBar.i6.f19141i0;
        } else {
            Point point = AndroidUtilities.displaySize;
            int min = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            int max = Math.max(point2.x, point2.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / AndroidUtilities.density));
            sb2.append("_");
            this.G1 = a4.a.n((int) (max / AndroidUtilities.density), "_f", sb2);
            Point point3 = AndroidUtilities.displaySize;
            this.H1 = Math.max(point3.x, point3.y);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            this.f36443t1 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
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
        ci.m6 m6Var = this.f36423k0;
        if (m6Var != null && this.Q != null) {
            m6Var.getViewTreeObserver().removeOnGlobalLayoutListener(this.Q);
        }
        int i10 = this.f36393b;
        if ((i10 == 2 || i10 == 1) && this.f36433p1 == null) {
            AndroidUtilities.runOnUIThread(new n21(3));
        }
        if (i10 == 2) {
            Bitmap bitmap = this.f36450w1;
            if (bitmap != null) {
                bitmap.recycle();
                this.f36450w1 = null;
            }
            this.f36390a.b(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        } else if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 != 0 || this.f36439s != null) {
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
            this.f36447v1.c(false);
        }
        org.telegram.ui.ActionBar.i6.f19013b = false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        hd1 hd1Var = this.f36430o0;
        if (hd1Var != null) {
            hd1Var.l();
        }
        ld1 ld1Var = this.f36446v0;
        if (ld1Var != null) {
            ld1Var.l();
        }
        if (this.E1) {
            this.f36447v1.c(true);
        }
        org.telegram.ui.ActionBar.i6.f19013b = true;
    }

    @Override
    public final void onSuccessDownload(String str) {
        j1();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (!z10 && this.f36393b == 2) {
            this.f36390a.b(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f36390a.f36377a = e6Var;
    }

    public pd1(org.telegram.ui.ActionBar.h6 h6Var, boolean z10, int i10, boolean z11, boolean z12) {
        super(null);
        this.f36390a = new pc1(this);
        this.d = true;
        this.f36427n = 1;
        org.telegram.ui.ActionBar.q5 q5Var = new org.telegram.ui.ActionBar.q5(this, 0, false);
        this.R = q5Var;
        org.telegram.ui.ActionBar.q5 q5Var2 = new org.telegram.ui.ActionBar.q5(this, 0, true);
        this.S = q5Var2;
        org.telegram.ui.ActionBar.q5 q5Var3 = new org.telegram.ui.ActionBar.q5(this, 1, false);
        this.T = q5Var3;
        org.telegram.ui.ActionBar.q5 q5Var4 = new org.telegram.ui.ActionBar.q5(this, 1, true);
        this.U = q5Var4;
        this.X = -1;
        this.Y = new bc1(this, 0);
        this.f36449w0 = new ed1[2];
        this.L0 = new FrameLayout[2];
        this.M0 = new TextView[2];
        this.N0 = new TextView[2];
        this.O0 = new FrameLayout[2];
        this.V0 = new HashMap();
        this.l1 = 0.5f;
        this.f36429n1 = 0.0f;
        this.f36441s1 = PorterDuff.Mode.SRC_IN;
        this.f36456y1 = 1.0f;
        this.G1 = "640_360";
        this.H1 = 1920;
        this.K1 = true;
        this.S1 = new org.telegram.ui.Components.m20(getParentActivity(), new rc1(this));
        this.T1 = false;
        this.U1 = false;
        this.f36393b = i10;
        this.f36408f0 = z12;
        this.f36404e0 = h6Var;
        this.f36414h0 = z10;
        this.f36411g0 = z11;
        if (i10 == 1) {
            org.telegram.ui.ActionBar.g6 k10 = h6Var.k(!z11);
            this.f36439s = k10;
            if (k10 != null) {
                this.d = false;
                this.f36448w = k10.f18908c;
                this.f36451x = k10.d;
                this.f36454y = k10.e;
                this.E = k10.f18909f;
                this.F = k10.f18910g;
                this.G = k10.h;
                this.H = k10.f18911i;
                this.I = k10.f18912j;
                this.J = k10.f18913k;
                this.K = k10.f18914l;
                this.L = k10.f18915m;
                this.M = k10.f18918p;
                this.N = k10.f18917o;
                this.O = k10.f18916n;
            }
        } else {
            if (i10 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.g6 k11 = h6Var.k(false);
            this.f36439s = k11;
            if (k11 != null) {
                this.W0 = k11.f18921s;
            }
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.f36439s;
        if (g6Var != null) {
            this.E1 = g6Var.f18919q;
            if (!TextUtils.isEmpty(g6Var.f18917o)) {
                this.l1 = this.f36439s.f18918p;
            }
            org.telegram.ui.ActionBar.i6.M = org.telegram.ui.ActionBar.i6.A0();
            org.telegram.ui.ActionBar.i6.O = true;
            org.telegram.ui.ActionBar.i6.P = true;
            org.telegram.ui.ActionBar.i6.t(h6Var, false, false);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.goingToPreviewTheme, new Object[0]);
        q5Var.v = true;
        q5Var3.v = true;
        q5Var2.v = true;
        q5Var4.v = true;
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
    }

    public pd1(org.telegram.ui.ActionBar.h6 h6Var) {
        this(h6Var, false, 0, false, false);
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
