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
public class ed1 extends org.telegram.ui.ActionBar.p2 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public bc1 A0;
    public boolean A1;
    public final int B;
    public bc1 B0;
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
    public dd1 F1;
    public final long G;
    public org.telegram.ui.Components.n81[] G0;
    public long G1;
    public final long H;
    public org.telegram.ui.Components.n81[] H0;
    public boolean H1;
    public final long I;
    public final FrameLayout[] I0;
    public boolean I1;
    public final float J;
    public final TextView[] J0;
    public boolean J1;
    public final String K;
    public final TextView[] K0;
    public org.telegram.ui.Components.ij0 K1;
    public final int L;
    public final FrameLayout[] L0;
    public org.telegram.ui.ActionBar.w0 L1;
    public long M;
    public kb1 M0;
    public ValueAnimator M1;
    public y90 N;
    public cd1 N0;
    public eg.q1 N1;
    public final org.telegram.ui.ActionBar.r5 O;
    public f2.j0 O0;
    public ac1 O1;
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
    public final dc1 f36486a;
    public TextView f36487a0;
    public int f36488a1;
    public boolean a2;
    public final int f36489b;
    public final org.telegram.ui.ActionBar.j6 f36490b0;
    public int f36491b1;
    public TextView f36492b2;
    public Scroller f36493c;
    public final boolean f36494c0;
    public int f36495c1;
    public WeakReference f36496c2;
    public final boolean d;
    public final boolean f36497d0;
    public int f36498d1;
    public BitmapDrawable f36499d2;
    public org.telegram.ui.Components.wl f36500e;
    public final boolean f36501e0;
    public int f36502e1;
    public kc f36503e2;
    public org.telegram.ui.ActionBar.w0 f36504f;
    public ArrayList f36505f0;
    public int f36506f1;
    public float f36507f2;
    public m2.h f36508g0;
    public int f36509g1;
    public ValueAnimator f36510g2;
    public TextView h;
    public hc1 f36511h0;
    public int f36512h1;
    public UndoView f36513i0;
    public float f36514i1;
    public FrameLayout f36515j0;
    public float f36516j1;
    public org.telegram.ui.Components.tl0 f36517k0;
    public float f36518k1;
    public wc1 f36519l0;
    public float l1;
    public org.telegram.ui.Components.a20 m0;
    public vc1 f36520m1;
    public int f36521n;
    public MessageObject f36522n0;
    public org.telegram.ui.Components.oq f36523n1;
    public boolean f36524o0;
    public AnimatorSet f36525o1;
    public org.telegram.ui.ActionBar.k f36526p0;
    public final PorterDuff.Mode f36527p1;
    public org.telegram.ui.ActionBar.r0 f36528q0;
    public int f36529q1;
    public Drawable f36530r;
    public xb1 f36531r0;
    public org.telegram.ui.Components.j9 f36532r1;
    public final org.telegram.ui.ActionBar.i6 f36533s;
    public ad1 f36534s0;
    public org.telegram.ui.Components.p81 f36535s1;
    public final tc1[] f36536t0;
    public Bitmap f36537t1;
    public tc1 f36538u0;
    public Bitmap f36539u1;
    public boolean v;
    public FrameLayout f36540v0;
    public float f36541v1;
    public final int f36542w;
    public FrameLayout f36543w0;
    public uc1 f36544w1;
    public final int f36545x;
    public org.telegram.ui.Components.m40 f36546x0;
    public uc1 f36547x1;
    public final int f36548y;
    public AnimatorSet f36549y0;
    public Object f36550y1;
    public w4 f36551z0;
    public Bitmap f36552z1;

    public ed1(Object obj, Bitmap bitmap, boolean z4) {
        super(null);
        this.f36486a = new dc1(this);
        this.d = true;
        this.f36521n = 1;
        org.telegram.ui.ActionBar.r5 r5Var = new org.telegram.ui.ActionBar.r5(this, 0, false);
        this.O = r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2 = new org.telegram.ui.ActionBar.r5(this, 0, true);
        this.P = r5Var2;
        org.telegram.ui.ActionBar.r5 r5Var3 = new org.telegram.ui.ActionBar.r5(this, 1, false);
        this.Q = r5Var3;
        org.telegram.ui.ActionBar.r5 r5Var4 = new org.telegram.ui.ActionBar.r5(this, 1, true);
        this.R = r5Var4;
        this.U = -1;
        this.V = new pb1(this, 0);
        this.f36536t0 = new tc1[2];
        this.I0 = new FrameLayout[2];
        this.J0 = new TextView[2];
        this.K0 = new TextView[2];
        this.L0 = new FrameLayout[2];
        this.S0 = new HashMap();
        this.f36514i1 = 0.5f;
        this.f36518k1 = 0.0f;
        this.f36527p1 = PorterDuff.Mode.SRC_IN;
        this.f36541v1 = 1.0f;
        this.D1 = "640_360";
        this.E1 = 1920;
        this.H1 = true;
        this.P1 = new org.telegram.ui.Components.l20(getParentActivity(), new fc1(this));
        this.Q1 = false;
        this.R1 = false;
        this.f36489b = 2;
        this.f36550y1 = obj;
        this.f36552z1 = bitmap;
        this.A1 = z4;
        if (obj instanceof pi1) {
            pi1 pi1Var = (pi1) obj;
            this.B1 = pi1Var.f40063j;
            TLRPC.TL_wallPaper tL_wallPaper = pi1Var.f40061g;
            this.T0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f10 = pi1Var.h;
                this.f36514i1 = f10;
                if (f10 < 0.0f && !org.telegram.ui.ActionBar.k6.I.q()) {
                    this.f36514i1 *= -1.0f;
                }
            }
        }
        r5Var.v = true;
        r5Var3.v = true;
        r5Var2.v = true;
        r5Var4.v = true;
    }

    public static void U(ed1 ed1Var) {
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
        if (ed1Var.f36533s != null) {
            ed1Var.W0();
            org.telegram.ui.ActionBar.k6.t1(ed1Var.f36490b0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.k6.M != null) {
                org.telegram.ui.ActionBar.k6.O = false;
                org.telegram.ui.ActionBar.k6.P = false;
                org.telegram.ui.ActionBar.k6.M = null;
            }
            org.telegram.ui.ActionBar.k6.t(ed1Var.f36490b0, true, ed1Var.f36494c0);
            ((ActionBarLayout) ed1Var.parentLayout).U(false, false);
        } else {
            ((ActionBarLayout) ed1Var.parentLayout).U(false, false);
            File file = new File(ed1Var.f36490b0.f21505b);
            org.telegram.ui.ActionBar.j6 j6Var2 = ed1Var.f36490b0;
            org.telegram.ui.ActionBar.k6.u(file, j6Var2.f21503a, j6Var2.C, false);
            MessagesController.getInstance(ed1Var.f36490b0.B).saveTheme(ed1Var.f36490b0, null, false, false);
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", ed1Var.f36490b0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) ed1Var.getParentLayout().getFragmentStack().get(Math.max(0, ed1Var.getParentLayout().getFragmentStack().size() - 2));
        ed1Var.finishFragment();
        if (ed1Var.f36489b == 0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didApplyNewTheme, j6Var, k10, Boolean.valueOf(ed1Var.f36501e0));
        }
        org.telegram.ui.ActionBar.k6.F1(p2Var);
    }

    public static void V(ed1 ed1Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = ed1Var.S0;
        org.telegram.ui.ActionBar.i6 i6Var = ed1Var.f36533s;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            ed1Var.R0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z4 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_wallPapers.wallpapers.get(i10) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i10);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f20849id))) {
                            ed1Var.R0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.f20849id), tL_wallPaper2);
                        }
                        if (i6Var != null && (str = i6Var.f21479o) != null && str.equals(tL_wallPaper2.slug)) {
                            ed1Var.T0 = tL_wallPaper2;
                            ed1Var.b1(false);
                            ed1Var.j1();
                        } else if (i6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = ed1Var.T0;
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
            if (!z4 && (tL_wallPaper = ed1Var.T0) != null) {
                ed1Var.R0.add(0, tL_wallPaper);
            }
            cd1 cd1Var = ed1Var.N0;
            if (cd1Var != null) {
                cd1Var.l();
            }
            MessagesStorage.getInstance(ed1Var.currentAccount).putWallpapers(tL_wallPapers.wallpapers, 1);
        }
        if (ed1Var.T0 == null && i6Var != null && !TextUtils.isEmpty(i6Var.f21479o)) {
            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
            tL_inputWallPaperSlug.slug = i6Var.f21479o;
            getwallpaper.wallpaper = tL_inputWallPaperSlug;
            ConnectionsManager.getInstance(ed1Var.currentAccount).bindRequestToGuid(ed1Var.getConnectionsManager().sendRequest(getwallpaper, new vb1(ed1Var, 0)), ed1Var.classGuid);
        }
    }

    public static void W(ed1 ed1Var) {
        org.telegram.ui.Components.wl wlVar = ed1Var.f36500e;
        int i10 = 0;
        if (wlVar != null) {
            wlVar.B(ed1Var.getThemedColor(org.telegram.ui.ActionBar.k6.G8));
            ed1Var.f36500e.G(ed1Var.getThemedColor(org.telegram.ui.ActionBar.k6.E8), false);
        }
        Drawable drawable = ed1Var.f36530r;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(ed1Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6), PorterDuff.Mode.MULTIPLY));
        }
        w4 w4Var = ed1Var.f36551z0;
        if (w4Var != null) {
            w4Var.invalidate();
        }
        if (ed1Var.f36520m1 != null) {
            org.telegram.ui.ActionBar.f5 f5Var = ed1Var.parentLayout;
            if (f5Var != null && f5Var.getBottomSheet() != null) {
                ed1Var.parentLayout.getBottomSheet().fixNavigationBar(ed1Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21731h5));
                if (ed1Var.f36489b == 2 && ed1Var.G1 != 0) {
                    ed1Var.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            } else {
                ed1Var.setNavigationBarColor(ed1Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21731h5));
            }
        }
        if (ed1Var.G0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.n81[] n81VarArr = ed1Var.G0;
                if (i11 >= n81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.n81 n81Var = n81VarArr[i11];
                if (n81Var != null) {
                    n81Var.invalidate();
                }
                i11++;
            }
        }
        if (ed1Var.H0 != null) {
            while (true) {
                org.telegram.ui.Components.n81[] n81VarArr2 = ed1Var.H0;
                if (i10 >= n81VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.n81 n81Var2 = n81VarArr2[i10];
                if (n81Var2 != null) {
                    n81Var2.invalidate();
                }
                i10++;
            }
        }
        TextView textView = ed1Var.f36492b2;
        if (textView != null) {
            textView.setTextColor(ed1Var.getThemedColor(org.telegram.ui.ActionBar.k6.G6));
        }
        org.telegram.ui.Components.mq mqVar = ed1Var.S;
        if (mqVar != null) {
            mqVar.invalidate();
        }
        org.telegram.ui.Components.a20 a20Var = ed1Var.m0;
        if (a20Var != null) {
            a20Var.g();
        }
    }

    public static void X(ed1 ed1Var, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (ed1Var.getParentActivity() == null) {
            return;
        }
        fg.v0 v0Var = new fg.v0(23, ed1Var.currentAccount, ed1Var.getParentActivity(), ed1Var, ed1Var.f36486a);
        v0Var.G1(canApplyBoost);
        v0Var.F1(ed1Var.S1, true);
        v0Var.H1(ed1Var.G1);
        if (!ed1Var.U0()) {
            v0Var.N0 = new pb1(ed1Var, 1);
        }
        ed1Var.showDialog(v0Var);
    }

    public final void M0() {
        AnimatorSet animatorSet = this.f36549y0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f36549y0 = animatorSet2;
        if (this.B1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f36538u0, View.SCALE_X, this.f36541v1), ObjectAnimator.ofFloat(this.f36538u0, View.SCALE_Y, this.f36541v1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f36538u0, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f36538u0, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f36538u0, View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f36538u0, View.TRANSLATION_Y, 0.0f));
        }
        this.f36549y0.setInterpolator(org.telegram.ui.Components.pr.f30184g);
        this.f36549y0.addListener(new ic1(this, 1));
        this.f36549y0.start();
    }

    public final void N0(boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ed1.N0(boolean):void");
    }

    public final void O0(boolean z4) {
        int i10 = this.f36489b;
        if (i10 == 2) {
            if (!z4) {
                finishFragment();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.k6.o();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        org.telegram.ui.ActionBar.i6 i6Var = this.f36533s;
        if (i10 == 1) {
            if (this.f36497d0) {
                i6Var.f21469c = this.f36542w;
                i6Var.d = this.f36545x;
                i6Var.f21470e = this.f36548y;
                i6Var.f21471f = this.B;
                i6Var.f21472g = this.C;
                i6Var.h = this.D;
                i6Var.f21473i = this.E;
                i6Var.f21474j = this.F;
                i6Var.f21475k = this.G;
                i6Var.f21476l = this.H;
                i6Var.f21477m = this.I;
                i6Var.f21478n = this.L;
                i6Var.f21479o = this.K;
                i6Var.f21480p = this.J;
            }
            org.telegram.ui.ActionBar.k6.t1(this.f36490b0, false, true, false, false, false);
        } else {
            if (i6Var != null) {
                org.telegram.ui.ActionBar.k6.t1(this.f36490b0, false, this.f36501e0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).U(false, false);
            if (this.f36501e0) {
                org.telegram.ui.ActionBar.j6 j6Var = this.f36490b0;
                if (j6Var.f21505b != null && org.telegram.ui.ActionBar.k6.H.get(j6Var.m()) == null) {
                    new File(j6Var.f21505b).delete();
                }
            }
        }
        if (!z4) {
            finishFragment();
        }
    }

    public final BitmapDrawable P0(Drawable drawable) {
        WeakReference weakReference = this.f36496c2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.f36499d2;
        }
        WeakReference weakReference2 = this.f36496c2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f36496c2 = null;
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
            this.f36496c2 = new WeakReference(drawable);
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
            this.f36499d2 = bitmapDrawable;
            bitmapDrawable.setFilterBitmap(true);
            return this.f36499d2;
        }
        this.f36499d2 = null;
        return null;
    }

    public final boolean Q0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ed1.Q0(boolean):boolean");
    }

    public final int R0() {
        if (ChatObject.isChannelAndNotMegaGroup(-this.G1, this.currentAccount)) {
            return getMessagesController().channelCustomWallpaperLevelMin;
        }
        return getMessagesController().groupCustomWallpaperLevelMin;
    }

    public final ArrayList S0() {
        ey0 ey0Var = new ey0(7, this);
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f36515j0;
        int i10 = org.telegram.ui.ActionBar.k6.f21659d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(frameLayout, 1, null, null, null, ey0Var, i10));
        m2.h hVar = this.f36508g0;
        int i11 = org.telegram.ui.ActionBar.k6.f21930s8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(hVar, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.k6.f21946t8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 256, null, null, null, null, i12));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.k6.A8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar2, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.k6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36526p0, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36526p0, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36526p0, 1024, null, null, null, null, org.telegram.ui.ActionBar.k6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36526p0, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36526p0, Integer.MIN_VALUE, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36526p0, 1073741824, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36517k0, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 32768, null, null, null, null, i11));
        if (!this.d) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.Y, 1, null, null, null, null, i10));
            TextView textView = this.f36487a0;
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
                arrayList.add(new org.telegram.ui.ActionBar.m6(editTextBoldCursorArr[i15], 32, null, null, null, null, org.telegram.ui.ActionBar.k6.f21785k6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(editTextBoldCursorArr[i15], 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.f21803l6));
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
                arrayList.add(new org.telegram.ui.ActionBar.m6(frameLayoutArr[i19], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21747i3}, null, org.telegram.ui.ActionBar.k6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.m6(frameLayoutArr[i19], 0, null, org.telegram.ui.ActionBar.k6.f21763j2, null, null, org.telegram.ui.ActionBar.k6.Sd));
            }
            int i20 = 0;
            while (true) {
                FrameLayout[] frameLayoutArr2 = this.L0;
                if (i20 >= frameLayoutArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.m6(frameLayoutArr2[i20], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21747i3}, null, org.telegram.ui.ActionBar.k6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.m6(frameLayoutArr2[i20], 0, null, org.telegram.ui.ActionBar.k6.f21763j2, null, null, org.telegram.ui.ActionBar.k6.Sd));
                i20++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36551z0, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21747i3}, null, org.telegram.ui.ActionBar.k6.Td));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36551z0, 0, null, org.telegram.ui.ActionBar.k6.f21763j2, null, null, org.telegram.ui.ActionBar.k6.Sd));
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
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.Q0, 0, new Class[]{org.telegram.ui.Components.lo0.class}, new String[]{"innerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Ti));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.Q0, 0, new Class[]{org.telegram.ui.Components.lo0.class}, new String[]{"outerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Vi));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.P0, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21818m3, org.telegram.ui.ActionBar.k6.f21891q3}, null, org.telegram.ui.ActionBar.k6.f21916ra));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21836n3, org.telegram.ui.ActionBar.k6.f21909r3}, null, org.telegram.ui.ActionBar.k6.f21665dc));
            Drawable[] drawableArr = org.telegram.ui.ActionBar.k6.f21818m3.f21440y;
            int i23 = org.telegram.ui.ActionBar.k6.f21947ta;
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.k6.f21891q3.f21440y, null, i23));
            org.telegram.ui.ActionBar.r5 r5Var = this.O;
            org.telegram.ui.ActionBar.r5 r5Var2 = this.Q;
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{r5Var, r5Var2}, null, org.telegram.ui.ActionBar.k6.Aa));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{r5Var, r5Var2}, null, org.telegram.ui.ActionBar.k6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{r5Var, r5Var2}, null, org.telegram.ui.ActionBar.k6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{r5Var, r5Var2}, null, org.telegram.ui.ActionBar.k6.Fa));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21872p3, org.telegram.ui.ActionBar.k6.f21942t3}, null, org.telegram.ui.ActionBar.k6.Ba));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.k6.f21854o3.f21440y;
            int i24 = org.telegram.ui.ActionBar.k6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr2, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.k6.f21926s3.f21440y, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21683ec));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21701fc));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f22033y3}, null, org.telegram.ui.ActionBar.k6.Ja));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f22051z3}, null, org.telegram.ui.ActionBar.k6.Ka));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.A3, org.telegram.ui.ActionBar.k6.C3}, null, org.telegram.ui.ActionBar.k6.La));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.B3, org.telegram.ui.ActionBar.k6.D3}, null, org.telegram.ui.ActionBar.k6.Ma));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.F3, org.telegram.ui.ActionBar.k6.G3}, null, org.telegram.ui.ActionBar.k6.f21932sc));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Uc));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21609ab));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Wc));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21646cb));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Yc));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21664db));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21611ad));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21700fb));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21845nd));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.sb));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21863od));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36531r0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21844nb));
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, ey0Var, org.telegram.ui.ActionBar.k6.f21660d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, ey0Var, org.telegram.ui.ActionBar.k6.f21731h5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, ey0Var, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, ey0Var, org.telegram.ui.ActionBar.k6.f21749i5));
        for (int i25 = 0; i25 < arrayList.size(); i25++) {
            ((org.telegram.ui.ActionBar.m6) arrayList.get(i25)).f22151o = this.f36486a;
        }
        return arrayList;
    }

    public final boolean T0(int i10) {
        int B0;
        long j10;
        if (this.f36497d0) {
            return false;
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.f36533s;
        if (i10 == 1 || i10 == 2) {
            long j11 = this.F;
            if (j11 != 0) {
                if (j11 != i6Var.f21474j) {
                    return true;
                }
            } else {
                int B02 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Nd);
                int i11 = (int) i6Var.f21474j;
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
                        j10 = i6Var.f21475k;
                    } else if (i12 == 1) {
                        B0 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Pd);
                        j10 = i6Var.f21476l;
                    } else {
                        B0 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Qd);
                        j10 = i6Var.f21477m;
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
            } else if (j14 != i6Var.f21475k || j13 != i6Var.f21476l || j12 != i6Var.f21477m) {
                return true;
            }
            if (i6Var.f21478n != this.L) {
                return true;
            }
        }
        if (i10 == 1 || i10 == 3) {
            if (this.f36542w != i6Var.d) {
                return true;
            }
            int i14 = this.f36548y;
            if (i14 != 0) {
                if (i14 != i6Var.f21470e) {
                    return true;
                }
            } else {
                int i15 = i6Var.f21470e;
                if (i15 != 0 && i15 != i6Var.f21469c) {
                    return true;
                }
            }
            int i16 = this.B;
            if (i16 != 0) {
                if (i16 != i6Var.f21471f) {
                    return true;
                }
            } else if (i6Var.f21471f != 0) {
                return true;
            }
            int i17 = this.C;
            if (i17 != 0) {
                if (i17 != i6Var.f21472g) {
                    return true;
                }
            } else if (i6Var.f21472g != 0) {
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
            if (this.E != i6Var.f21473i) {
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
        FrameLayout frameLayout = this.f36540v0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f36540v0.getChildAt(i10).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.f36543w0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                this.f36543w0.getChildAt(i11).invalidate();
            }
        }
        if (this.G0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.n81[] n81VarArr = this.G0;
                if (i12 >= n81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.n81 n81Var = n81VarArr[i12];
                if (n81Var != null) {
                    if (this.J1) {
                        f10 = this.f36518k1 * this.l1;
                    } else {
                        f10 = 0.0f;
                    }
                    n81Var.setDimAmount(f10);
                    this.G0[i12].invalidate();
                }
                i12++;
            }
        }
        if (this.f36517k0 != null) {
            for (int i13 = 0; i13 < this.f36517k0.getChildCount(); i13++) {
                View childAt = this.f36517k0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.v0) {
                    d1((org.telegram.ui.Cells.v0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.f36531r0 != null) {
            for (int i14 = 0; i14 < this.f36531r0.getChildCount(); i14++) {
                View childAt2 = this.f36531r0.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                    d1((org.telegram.ui.Cells.v0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        uc1 uc1Var = this.f36544w1;
        if (uc1Var != null) {
            uc1Var.invalidate();
        }
        uc1 uc1Var2 = this.f36547x1;
        if (uc1Var2 != null) {
            uc1Var2.invalidate();
        }
        w4 w4Var = this.f36551z0;
        if (w4Var != null) {
            w4Var.invalidate();
        }
    }

    public final void W0() {
        org.telegram.ui.ActionBar.i6 i6Var = this.f36533s;
        if (i6Var != null && !TextUtils.isEmpty(i6Var.f21479o)) {
            try {
                File d = i6Var.d();
                Drawable background = this.f36538u0.getBackground();
                Bitmap bitmap = this.f36538u0.getImageReceiver().getBitmap();
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
                paint.setColorFilter(new PorterDuffColorFilter(this.f36509g1, this.f36527p1));
                paint.setAlpha((int) (this.f36514i1 * 255.0f));
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
        if (getParentActivity() != null && this.f36521n != i10 && this.f36525o1 == null && (i6Var = this.f36533s) != null) {
            if (z4 && i10 == 2 && (org.telegram.ui.ActionBar.k6.Z0() || i6Var.f21474j == 4294967296L)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.ChangeChatBackground);
                if (org.telegram.ui.ActionBar.k6.Z0() && (!org.telegram.ui.ActionBar.k6.Z0() || org.telegram.ui.ActionBar.k6.I.f21513f0.d == 0)) {
                    alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ChangeWallpaperToColor);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Change), new rb1(this, 7));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                } else {
                    alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ChangeColorToColor);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new rb1(this, 5));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Continue), new rb1(this, 6));
                }
                showDialog(alertDialog$Builder.f21166a);
                return;
            }
            int i18 = this.f36521n;
            this.f36521n = i10;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        this.h.setText(LocaleController.getString(R.string.ColorPickerMyMessages));
                        if (i6Var.f21471f != 0) {
                            if (i6Var.h != 0) {
                                i17 = 4;
                            } else if (i6Var.f21472g != 0) {
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
                        this.S.e(i6Var.f21472g, 2);
                        this.S.e(i6Var.f21471f, 1);
                        org.telegram.ui.Components.mq mqVar2 = this.S;
                        int i19 = i6Var.f21470e;
                        if (i19 == 0) {
                            i19 = i6Var.f21469c;
                        }
                        mqVar2.e(i19, 0);
                        this.H0[1].b(0, i6Var.f21470e);
                        this.H0[1].b(1, i6Var.f21471f);
                        this.H0[1].b(2, i6Var.f21472g);
                        this.H0[1].b(3, i6Var.h);
                        if (i6Var.f21472g != 0) {
                            if (i18 == 1) {
                                this.f36534s0.o(0);
                            } else {
                                this.f36534s0.m(0);
                            }
                        } else if (i18 == 2) {
                            this.f36534s0.u(0);
                        }
                        this.f36531r0.v0(0, AndroidUtilities.dp(60.0f), null);
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
                    long j10 = i6Var.f21475k;
                    int i23 = (int) j10;
                    if (i23 == 0 && j10 != 0) {
                        i12 = 0;
                    }
                    long j11 = i6Var.f21476l;
                    int i24 = (int) j11;
                    if (i24 == 0 && j11 != 0) {
                        i13 = 0;
                    }
                    long j12 = i6Var.f21477m;
                    int i25 = (int) j12;
                    if (i25 == 0 && j12 != 0) {
                        i14 = 0;
                    }
                    int i26 = (int) i6Var.f21474j;
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
                    if (i18 != 1 && i6Var.f21472g != 0) {
                        this.f36534s0.m(0);
                    } else {
                        this.f36534s0.o(0);
                    }
                    this.f36531r0.v0(0, AndroidUtilities.dp(60.0f), null);
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
                this.S.e(i6Var.f21469c, 0);
                int i27 = i6Var.d;
                if (i27 != 0) {
                    this.S.e(i27, 1);
                }
                if (i18 == 2 || (i18 == 3 && i6Var.f21472g != 0)) {
                    this.f36534s0.u(0);
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
                if (this.f36490b0.q()) {
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
        tc1[] tc1VarArr = this.f36536t0;
        tc1 tc1Var = tc1VarArr[0];
        tc1 tc1Var2 = tc1VarArr[1];
        tc1VarArr[0] = tc1Var2;
        tc1VarArr[1] = tc1Var;
        this.f36528q0.removeView(tc1Var2);
        this.f36528q0.addView(tc1VarArr[0], this.f36528q0.indexOfChild(tc1VarArr[1]) + 1);
        tc1 tc1Var3 = tc1VarArr[0];
        this.f36538u0 = tc1Var3;
        tc1Var3.setBackground(tc1VarArr[1].getBackground());
        k1();
        tc1VarArr[1].setVisibility(0);
        tc1VarArr[1].setAlpha(1.0f);
        this.f36538u0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Z1 = ofFloat;
        ofFloat.addUpdateListener(new yi(2, this));
        this.Z1.addListener(new ic1(this, 0));
        this.Z1.setInterpolator(org.telegram.ui.Components.pr.f30183f);
        this.Z1.setDuration(300L);
        this.Z1.start();
        this.f36538u0.getImageReceiver().setCrossfadeDuration(300);
        this.f36538u0.getImageReceiver().setImage(ImageLocation.getForDocument(tL_wallPaper2.document), this.D1, null, null, null, tL_wallPaper2.document.size, "jpg", tL_wallPaper2, 1);
        this.f36538u0.d();
        this.T0 = tL_wallPaper2;
        this.B1 = this.G0[2].f29439s;
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
            this.f36488a1 = i10;
        }
        m1(z4);
        if (this.G0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.n81[] n81VarArr = this.G0;
                if (i12 >= n81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.n81 n81Var = n81VarArr[i12];
                if (n81Var != null) {
                    n81Var.b(i11, i10);
                }
                i12++;
            }
        }
        if (this.Z0 != 0) {
            if (this.Q0 != null && org.telegram.ui.ActionBar.k6.I.q()) {
                this.Q0.setTwoSided(true);
            }
            Drawable background = this.f36538u0.getBackground();
            if (background instanceof org.telegram.ui.Components.fc0) {
                fc0Var = (org.telegram.ui.Components.fc0) background;
            } else {
                fc0Var = new org.telegram.ui.Components.fc0();
                fc0Var.r(this.f36538u0);
                if (this.A1) {
                    fc0Var.m(false);
                }
            }
            fc0Var.n(this.W0, this.Y0, this.Z0, this.f36488a1);
            this.f36538u0.setBackground(fc0Var);
            this.f36509g1 = fc0Var.f();
            this.f36512h1 = 754974720;
        } else if (this.Y0 != 0) {
            this.f36538u0.setBackground(new GradientDrawable(org.telegram.ui.Components.o9.d(this.f36502e1), new int[]{this.W0, this.Y0}));
            int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(this.W0, this.Y0));
            this.f36512h1 = patternColor;
            this.f36509g1 = patternColor;
        } else {
            this.f36538u0.setBackgroundColor(this.W0);
            int patternColor2 = AndroidUtilities.getPatternColor(this.W0);
            this.f36512h1 = patternColor2;
            this.f36509g1 = patternColor2;
        }
        int i13 = org.telegram.ui.ActionBar.k6.f21809lc;
        boolean c12 = org.telegram.ui.ActionBar.k6.c1(i13);
        dc1 dc1Var = this.f36486a;
        if (c12 && !(this.f36538u0.getBackground() instanceof org.telegram.ui.Components.fc0)) {
            if (org.telegram.ui.ActionBar.k6.s0() instanceof org.telegram.ui.Components.fc0) {
                getThemedColor(i13);
                dc1Var.b(this.f36538u0.getBackground(), this.f36538u0.getBackground(), Float.valueOf(this.f36514i1));
            }
        } else {
            dc1Var.b(this.f36538u0.getBackground(), this.f36538u0.getBackground(), Float.valueOf(this.f36514i1));
        }
        ImageView imageView = this.C0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.ic), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.D0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.ic), PorterDuff.Mode.MULTIPLY));
        }
        tc1 tc1Var = this.f36538u0;
        if (tc1Var != null) {
            tc1Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f36509g1, this.f36527p1));
            this.f36538u0.getImageReceiver().setAlpha(Math.abs(this.f36514i1));
            this.f36538u0.invalidate();
            if (org.telegram.ui.ActionBar.k6.I.q() && (this.f36538u0.getBackground() instanceof org.telegram.ui.Components.fc0)) {
                org.telegram.ui.Cells.j0 j0Var = this.Q0;
                if (j0Var != null) {
                    j0Var.setTwoSided(true);
                }
                if (this.f36514i1 < 0.0f) {
                    this.f36538u0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.fc0) this.f36538u0.getBackground()).f26879k);
                }
            } else {
                this.f36538u0.getImageReceiver().setGradientBitmap(null);
                org.telegram.ui.Cells.j0 j0Var2 = this.Q0;
                if (j0Var2 != null) {
                    j0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.j0 j0Var3 = this.Q0;
            if (j0Var3 != null) {
                j0Var3.setProgress(this.f36514i1);
            }
        }
        xb1 xb1Var = this.f36531r0;
        if (xb1Var != null) {
            xb1Var.f1();
        }
        FrameLayout frameLayout = this.f36540v0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                this.f36540v0.getChildAt(i14).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.f36543w0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                this.f36543w0.getChildAt(i15).invalidate();
            }
        }
    }

    public final void b1(boolean z4) {
        org.telegram.ui.Components.fc0 fc0Var;
        org.telegram.ui.Components.fc0 fc0Var2;
        int i10;
        int g10;
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.ActionBar.i6 i6Var = this.f36533s;
        int i11 = this.f36489b;
        if (i11 == 0 && i6Var == null) {
            this.f36538u0.setBackground(org.telegram.ui.ActionBar.k6.r0());
        } else {
            TLRPC.PhotoSize photoSize2 = null;
            BitmapDrawable bitmapDrawable = null;
            if (i11 == 2) {
                Object obj = this.f36550y1;
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
                    tc1 tc1Var = this.f36538u0;
                    tc1Var.f29998a.setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.D1, ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    tc1Var.d();
                } else if (obj instanceof pi1) {
                    pi1 pi1Var = (pi1) obj;
                    int i12 = pi1Var.f40060f;
                    int i13 = pi1Var.f40059e;
                    int i14 = pi1Var.d;
                    int i15 = pi1Var.f40058c;
                    int i16 = pi1Var.f40057b;
                    this.f36502e1 = i12;
                    a1(i16, 0, false);
                    if (i15 != 0) {
                        a1(i15, 1, false);
                    }
                    a1(i14, 2, false);
                    a1(i13, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.T0;
                    if (tL_wallPaper2 != null) {
                        tc1 tc1Var2 = this.f36538u0;
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                        String str = this.D1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.T0;
                        tc1Var2.k(forDocument, str, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                    } else if ("d".equals(pi1Var.f40056a)) {
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        Point point2 = AndroidUtilities.displaySize;
                        int max = Math.max(point2.x, point2.y);
                        if (Build.VERSION.SDK_INT >= 29) {
                            g10 = 1459617792;
                        } else {
                            g10 = org.telegram.ui.Components.fc0.g(i16, i15, i14, i13);
                        }
                        this.f36538u0.setImageBitmap(SvgHelper.getBitmap(R.raw.default_pattern, min, max, g10));
                    }
                } else if (obj instanceof qi1) {
                    Bitmap bitmap = this.f36552z1;
                    if (bitmap != null) {
                        this.f36538u0.setImageBitmap(bitmap);
                    } else {
                        qi1 qi1Var = (qi1) obj;
                        File file = qi1Var.f40534e;
                        if (file != null) {
                            this.f36538u0.f(file.getAbsolutePath(), this.D1, null);
                        } else {
                            File file2 = qi1Var.d;
                            if (file2 != null) {
                                this.f36538u0.f(file2.getAbsolutePath(), this.D1, null);
                            } else if ("t".equals(qi1Var.f40531a)) {
                                tc1 tc1Var3 = this.f36538u0;
                                tc1Var3.setImageDrawable(org.telegram.ui.ActionBar.k6.W0(tc1Var3, false));
                            } else {
                                int i17 = qi1Var.f40532b;
                                if (i17 != 0) {
                                    this.f36538u0.setImageResource(i17);
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
                        this.f36538u0.k(ImageLocation.getForPhoto(photoSize2, searchImage.photo), this.D1, ImageLocation.getForPhoto(closestPhotoSizeWithSize, searchImage.photo), "100_100_b", i10, "jpg", searchImage, 1);
                    } else {
                        tc1 tc1Var4 = this.f36538u0;
                        String str2 = searchImage.imageUrl;
                        String str3 = this.D1;
                        String str4 = searchImage.thumbUrl;
                        tc1Var4.getClass();
                        tc1Var4.m(ImageLocation.getForPath(str2), str3, ImageLocation.getForPath(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (i6Var == null) {
                this.f36538u0.setBackground(org.telegram.ui.ActionBar.k6.r0());
            } else {
                org.telegram.ui.Components.j9 j9Var = this.f36532r1;
                if (j9Var != null) {
                    j9Var.dispose();
                    this.f36532r1 = null;
                }
                int B0 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Nd);
                int i18 = (int) i6Var.f21474j;
                if (i18 != 0) {
                    B0 = i18;
                }
                int B02 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Od);
                long j10 = i6Var.f21475k;
                int i19 = (int) j10;
                if (i19 == 0 && j10 != 0) {
                    B02 = 0;
                } else if (i19 != 0) {
                    B02 = i19;
                }
                int B03 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Pd);
                long j11 = i6Var.f21476l;
                int i20 = (int) j11;
                if (i20 == 0 && j11 != 0) {
                    B03 = 0;
                } else if (i20 != 0) {
                    B03 = i20;
                }
                int B04 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Qd);
                long j12 = i6Var.f21477m;
                int i21 = (int) j12;
                if (i21 == 0 && j12 != 0) {
                    B04 = 0;
                } else if (i21 != 0) {
                    B04 = i21;
                }
                if (!TextUtils.isEmpty(i6Var.f21479o) && !org.telegram.ui.ActionBar.k6.Z0()) {
                    if (B03 != 0) {
                        Drawable background = this.f36538u0.getBackground();
                        if (background instanceof org.telegram.ui.Components.fc0) {
                            fc0Var2 = (org.telegram.ui.Components.fc0) background;
                        } else {
                            org.telegram.ui.Components.fc0 fc0Var3 = new org.telegram.ui.Components.fc0();
                            fc0Var3.r(this.f36538u0);
                            fc0Var2 = fc0Var3;
                            if (this.A1) {
                                fc0Var3.m(false);
                                fc0Var2 = fc0Var3;
                            }
                        }
                        fc0Var2.n(B0, B02, B03, B04);
                        fc0Var = fc0Var2;
                    } else if (B02 != 0) {
                        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(org.telegram.ui.Components.o9.d(i6Var.f21478n), new int[]{B0, B02});
                        this.f36532r1 = o9Var.f(org.telegram.ui.Cells.f1.t(0.5f, 3), new mc1(this, 0), 100L);
                        fc0Var = o9Var;
                    } else {
                        fc0Var = new ColorDrawable(B0);
                    }
                    this.f36538u0.setBackground(fc0Var);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.T0;
                    if (tL_wallPaper4 != null) {
                        tc1 tc1Var5 = this.f36538u0;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(tL_wallPaper4.document);
                        String str5 = this.D1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.T0;
                        tc1Var5.k(forDocument2, str5, null, null, tL_wallPaper5.document.size, "jpg", tL_wallPaper5, 1);
                    }
                } else {
                    Drawable s02 = org.telegram.ui.ActionBar.k6.s0();
                    if (s02 != null) {
                        if (s02 instanceof org.telegram.ui.Components.fc0) {
                            ((org.telegram.ui.Components.fc0) s02).r(this.f36538u0);
                        }
                        this.f36538u0.setBackground(s02);
                    }
                }
                if (B02 == 0) {
                    int patternColor = AndroidUtilities.getPatternColor(B0);
                    this.f36512h1 = patternColor;
                    this.f36509g1 = patternColor;
                } else if (B03 != 0) {
                    this.f36509g1 = org.telegram.ui.Components.fc0.g(B0, B02, B03, B04);
                    this.f36512h1 = 754974720;
                } else {
                    int patternColor2 = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(B0, B02));
                    this.f36512h1 = patternColor2;
                    this.f36509g1 = patternColor2;
                }
                tc1 tc1Var6 = this.f36538u0;
                if (tc1Var6 != null) {
                    tc1Var6.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f36509g1, this.f36527p1));
                    this.f36538u0.getImageReceiver().setAlpha(Math.abs(this.f36514i1));
                    this.f36538u0.invalidate();
                    if (org.telegram.ui.ActionBar.k6.I.q() && (this.f36538u0.getBackground() instanceof org.telegram.ui.Components.fc0)) {
                        org.telegram.ui.Cells.j0 j0Var = this.Q0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                        if (this.f36514i1 < 0.0f) {
                            this.f36538u0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.fc0) this.f36538u0.getBackground()).f26879k);
                        }
                    } else {
                        this.f36538u0.getImageReceiver().setGradientBitmap(null);
                        org.telegram.ui.Cells.j0 j0Var2 = this.Q0;
                        if (j0Var2 != null) {
                            j0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.j0 j0Var3 = this.Q0;
                    if (j0Var3 != null) {
                        j0Var3.setProgress(this.f36514i1);
                    }
                }
                if (this.G0 != null) {
                    int i22 = 0;
                    while (true) {
                        org.telegram.ui.Components.n81[] n81VarArr = this.G0;
                        if (i22 >= n81VarArr.length) {
                            break;
                        }
                        n81VarArr[i22].b(0, B0);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ed1.createView(android.content.Context):android.view.View");
    }

    public final void d1(org.telegram.ui.Cells.v0 v0Var) {
        dc1 dc1Var;
        float f10;
        if (this.f36538u0 == null) {
            return;
        }
        Bitmap bitmap = this.f36486a.f36194r;
        float f11 = 0.0f;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f10 = ((this.f36538u0.getMeasuredWidth() - (Math.max(this.f36538u0.getMeasuredWidth() / width, this.f36538u0.getMeasuredHeight() / dc1Var.f36194r.getHeight()) * width)) / 2.0f) + this.U1 + 0.0f;
        } else {
            f10 = this.U1 + 0.0f;
        }
        float y10 = v0Var.getY() - ((-this.f36538u0.G) + 0.0f);
        int measuredHeight = this.f36538u0.getMeasuredHeight();
        if (this.J1) {
            f11 = this.f36518k1 * this.l1;
        }
        v0Var.f24283t0 = true;
        v0Var.f24281s0 = measuredHeight;
        v0Var.f24275q0 = y10;
        v0Var.f24278r0 = f10;
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
            org.telegram.ui.Components.tl0 tl0Var = this.f36517k0;
            if (tl0Var != null) {
                int childCount = tl0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f36517k0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) childAt).b0(0, true);
                    }
                }
            }
        } else if (i10 == NotificationCenter.invalidateMotionBackground) {
            xb1 xb1Var = this.f36531r0;
            if (xb1Var != null) {
                xb1Var.f1();
            }
        } else if (i10 == NotificationCenter.didSetNewWallpapper) {
            if (this.f36528q0 != null) {
                b1(true);
            }
        } else if (i10 == NotificationCenter.wallpapersNeedReload) {
            Object obj = this.f36550y1;
            if (obj instanceof qi1) {
                qi1 qi1Var = (qi1) obj;
                if (qi1Var.f40531a == null) {
                    qi1Var.f40531a = (String) objArr[0];
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
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.f20849id))) {
                            this.R0.add(wallPaper);
                            hashMap.put(Long.valueOf(wallPaper.document.f20849id), wallPaper);
                        }
                        org.telegram.ui.ActionBar.i6 i6Var = this.f36533s;
                        if (i6Var != null && (str = i6Var.f21479o) != null && str.equals(wallPaper.slug)) {
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
                cd1 cd1Var = this.N0;
                if (cd1Var != null) {
                    cd1Var.l();
                }
                int size2 = arrayList.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i14);
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        j10 = MediaDataController.calcHash(j10, wallPaper2.f20995id);
                    }
                }
                TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
                getwallpapers.hash = j10;
                ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new vb1(this, 1)), this.classGuid);
            } else if (i10 == NotificationCenter.wallpaperSettedToUser && this.G1 != 0) {
                finishFragment();
            }
        }
    }

    public final void e1() {
        if (this.f36528q0 != null && this.H0 != null && this.f36533s.f21472g != 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("bganimationhint", false)) {
                if (this.f36546x0 == null) {
                    org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(getParentActivity(), 8);
                    this.f36546x0 = m40Var;
                    m40Var.setShowingDuration(5000L);
                    this.f36546x0.setAlpha(0.0f);
                    this.f36546x0.setVisibility(4);
                    this.f36546x0.setText(LocaleController.getString(R.string.BackgroundAnimateInfo));
                    this.f36546x0.setExtraTranslationY(AndroidUtilities.dp(6.0f));
                    this.f36511h0.addView(this.f36546x0, k7.c6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                }
                AndroidUtilities.runOnUIThread(new w01(18, this, globalMainSettings), 500L);
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
        int i17 = this.f36489b;
        if (z4) {
            if (i10 == 0) {
                if (i17 == 2) {
                    this.X0 = this.W0;
                    int i18 = this.Y0;
                    this.f36491b1 = i18;
                    int i19 = this.Z0;
                    this.f36495c1 = i19;
                    int i20 = this.f36488a1;
                    this.f36498d1 = i20;
                    this.f36506f1 = this.L;
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
                    this.S.e(this.f36488a1, 3);
                    this.S.e(this.Z0, 2);
                    this.S.e(this.Y0, 1);
                    this.S.e(this.W0, 0);
                }
            } else {
                this.U0 = this.T0;
                this.f36516j1 = this.f36514i1;
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
            org.telegram.ui.Components.n81[] n81VarArr = this.G0;
            if (z11) {
                c3 = 2;
            } else {
                c3 = 0;
            }
            n81VarArr[c3].setVisibility(0);
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.j0 j0Var = this.Q0;
            if (!j0Var.I) {
                float f20 = this.f36514i1;
                if (f20 < 0.0f) {
                    float f21 = -f20;
                    this.f36514i1 = f21;
                    j0Var.setProgress(f21);
                }
            }
        }
        int i21 = 58;
        float f22 = 1.0f;
        FrameLayout[] frameLayoutArr = this.I0;
        if (z10) {
            this.f36525o1 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            if (i10 == 0) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            if (z4) {
                frameLayoutArr[i10].setVisibility(0);
                if (i17 == 1) {
                    xb1 xb1Var = this.f36531r0;
                    Property property = View.TRANSLATION_Y;
                    if (i10 == 1) {
                        f17 = -AndroidUtilities.dp(21.0f);
                    } else {
                        f17 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(xb1Var, property, f17));
                    org.telegram.ui.Components.n81 n81Var = this.G0[2];
                    Property property2 = View.ALPHA;
                    if (z11) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(n81Var, property2, f18));
                    org.telegram.ui.Components.n81 n81Var2 = this.G0[0];
                    if (z11) {
                        f19 = 0.0f;
                    } else {
                        f19 = 1.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(n81Var2, property2, f19));
                    if (i10 == 1) {
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property2, 0.0f, 1.0f));
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i12], property2, 0.0f));
                    }
                    AndroidUtilities.hideKeyboard(this.S.B[1]);
                } else if (i17 == 2) {
                    xb1 xb1Var2 = this.f36531r0;
                    Property property3 = View.TRANSLATION_Y;
                    int i22 = -frameLayoutArr[i10].getMeasuredHeight();
                    if (this.f36547x1 == null) {
                        i21 = 0;
                    }
                    int dp = AndroidUtilities.dp(i21 + 72) + i22;
                    if (U0()) {
                        i13 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i13 = 0;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(xb1Var2, property3, dp + i13));
                    org.telegram.ui.Components.n81 n81Var3 = this.G0[2];
                    Property property4 = View.ALPHA;
                    if (z11) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(n81Var3, property4, f16));
                    org.telegram.ui.Components.n81 n81Var4 = this.G0[0];
                    if (z11) {
                        f22 = 0.0f;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(n81Var4, property4, f22));
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
                xb1 xb1Var3 = this.f36531r0;
                Property property5 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(xb1Var3, property5, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], property5, frameLayout2.getMeasuredHeight()));
                org.telegram.ui.Components.n81 n81Var5 = this.G0[0];
                Property property6 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(n81Var5, property6, 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.G0[2], property6, 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.f36538u0, property6, 1.0f));
            }
            this.f36525o1.playTogether(arrayList2);
            this.f36525o1.addListener(new lc1(this, z4, i12, i10, z11));
            this.f36525o1.setInterpolator(org.telegram.ui.Components.pr.f30184g);
            this.f36525o1.setDuration(200L);
            this.f36525o1.start();
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
                xb1 xb1Var4 = this.f36531r0;
                if (i10 == 1) {
                    f13 = -AndroidUtilities.dp(21.0f);
                } else {
                    f13 = 0.0f;
                }
                xb1Var4.setTranslationY(f13);
                org.telegram.ui.Components.n81 n81Var6 = this.G0[2];
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                n81Var6.setAlpha(f14);
                org.telegram.ui.Components.n81 n81Var7 = this.G0[0];
                if (z11) {
                    f15 = 0.0f;
                } else {
                    f15 = 1.0f;
                }
                n81Var7.setAlpha(f15);
                if (i10 == 1) {
                    frameLayoutArr[i10].setAlpha(1.0f);
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    frameLayoutArr[c10].setAlpha(0.0f);
                }
                AndroidUtilities.hideKeyboard(this.S.B[1]);
            } else if (i17 == 2) {
                xb1 xb1Var5 = this.f36531r0;
                if (i10 == 0) {
                    f10 = 343.0f;
                } else {
                    f10 = 316.0f;
                }
                int i23 = -AndroidUtilities.dp(f10);
                if (this.f36547x1 == null) {
                    i21 = 0;
                }
                int dp2 = AndroidUtilities.dp(i21 + 72) + i23;
                if (U0()) {
                    i11 = AndroidUtilities.navigationBarHeight;
                } else {
                    i11 = 0;
                }
                xb1Var5.setTranslationY(dp2 + i11);
                org.telegram.ui.Components.n81 n81Var8 = this.G0[2];
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                n81Var8.setAlpha(f11);
                org.telegram.ui.Components.n81 n81Var9 = this.G0[0];
                if (z11) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                n81Var9.setAlpha(f12);
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
            this.f36531r0.setTranslationY(0.0f);
            frameLayoutArr[i10].setTranslationY(frameLayout.getMeasuredHeight());
            this.G0[0].setAlpha(1.0f);
            this.G0[2].setAlpha(1.0f);
            this.f36538u0.setAlpha(1.0f);
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
        org.telegram.ui.Components.n81[] n81VarArr2 = this.G0;
        if (!z11) {
            c11 = 2;
        }
        n81VarArr2[c11].setVisibility(4);
    }

    public final void g1() {
        Window window;
        if (this.f36503e2 != null) {
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
        kc kcVar = new kc(this, getParentActivity(), canvas, (this.L1.getMeasuredWidth() / 2.0f) + f10, (this.L1.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 2);
        this.f36503e2 = kcVar;
        kcVar.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
        this.f36507f2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f36510g2 = ofFloat;
        ofFloat.addUpdateListener(new lc(this, 2));
        this.f36510g2.addListener(new ic1(this, 4));
        this.f36510g2.setDuration(400L);
        this.f36510g2.setInterpolator(org.telegram.ui.Components.jt.f28199e);
        this.f36510g2.start();
        frameLayout.addView(this.f36503e2, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new pb1(this, 2));
    }

    @Override
    public final int getObserverTag() {
        return this.f36529q1;
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.f36486a;
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
            this.f36544w1.d(LocaleController.getString(R.string.ApplyWallpaperForMe));
        } else if (i10 < 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.G1));
            if (chat != null) {
                this.f36544w1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, chat.title));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.S1;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                    if (this.f36523n1 == null) {
                        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.mini_switch_lock, 0);
                        this.f36523n1 = oqVar;
                        oqVar.setTopOffset(1);
                    }
                    spannableStringBuilder.setSpan(this.f36523n1, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", R0(), new Object[0]));
                    this.f36544w1.c(spannableStringBuilder, z4);
                    return;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.S1;
                if (tL_premium_boostsStatus2 == null) {
                    if (this.G1 < 0 && !this.Q1 && !this.R1 && tL_premium_boostsStatus2 == null) {
                        this.Q1 = true;
                        getMessagesController().getBoostsController().getBoostsStats(this.G1, new ub1(this, 0));
                        return;
                    }
                    return;
                }
                this.f36544w1.c(null, z4);
                return;
            }
            this.f36544w1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, LocaleController.getString(R.string.AccDescrChannel).toLowerCase()));
        } else {
            this.f36544w1.d(LocaleController.getString(R.string.ApplyWallpaper));
        }
    }

    public final void i1() {
        if (this.C1 && this.f36537t1 == null) {
            Bitmap bitmap = this.f36552z1;
            if (bitmap != null) {
                this.f36539u1 = bitmap;
                this.f36537t1 = Utilities.blurWallpaper(bitmap);
            } else {
                ImageReceiver imageReceiver = this.f36538u0.getImageReceiver();
                if (imageReceiver.hasNotThumb() || imageReceiver.hasStaticThumb()) {
                    this.f36539u1 = imageReceiver.getBitmap();
                    this.f36537t1 = Utilities.blurWallpaper(imageReceiver.getBitmap());
                }
            }
        }
        if (this.C1) {
            Bitmap bitmap2 = this.f36537t1;
            if (bitmap2 != null) {
                this.f36538u0.setImageBitmap(bitmap2);
                return;
            }
            return;
        }
        b1(false);
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.f36489b == 2) {
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
            obj = this.f36550y1;
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
            int i11 = this.f36489b;
            if (exists) {
                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                this.f36538u0.invalidate();
                if (i11 == 2) {
                    if (j10 != 0 && this.G1 == 0) {
                        this.f36526p0.setSubtitle(AndroidUtilities.formatFileSize(j10));
                    } else {
                        this.f36526p0.setSubtitle(null);
                    }
                }
            } else {
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(str, null, this);
                if (i11 == 2 && this.G1 == 0) {
                    this.f36526p0.setSubtitle(LocaleController.getString(R.string.LoadingFullImage));
                }
                this.f36538u0.invalidate();
            }
            float f12 = 0.5f;
            if (this.T0 == null && (frameLayout = this.f36540v0) != null) {
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
                this.f36551z0.setEnabled(exists);
                uc1 uc1Var = this.f36544w1;
                if (uc1Var != null) {
                    if (exists) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.5f;
                    }
                    uc1Var.setAlpha(f10);
                }
                uc1 uc1Var2 = this.f36547x1;
                if (uc1Var2 != null) {
                    if (exists) {
                        f12 = 1.0f;
                    }
                    uc1Var2.setAlpha(f12);
                }
            } else {
                this.f36504f.setEnabled(exists);
                org.telegram.ui.ActionBar.w0 w0Var = this.f36504f;
                if (exists) {
                    f12 = 1.0f;
                }
                w0Var.setAlpha(f12);
            }
        }
    }

    public final void k1() {
        this.f36538u0.getImageReceiver().setAlpha(Math.abs(this.f36514i1));
        this.f36538u0.invalidate();
        this.M0.f1();
        if (this.f36514i1 >= 0.0f) {
            this.f36538u0.getImageReceiver().setGradientBitmap(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f36538u0.getImageReceiver().setBlendMode(null);
            }
            if (this.f36538u0.getBackground() instanceof org.telegram.ui.Components.fc0) {
                this.f36538u0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.fc0) this.f36538u0.getBackground()).f26879k);
            }
        }
        this.f36486a.b(this.f36538u0.getBackground(), this.f36538u0.getBackground(), Float.valueOf(this.f36514i1));
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
        int i10 = this.f36489b;
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
            org.telegram.ui.Components.n81 n81Var = this.G0[0];
            if (this.T0 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n81Var.setEnabled(z10);
            if (this.T0 != null) {
                this.G0[0].setVisibility(0);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            int dp = (AndroidUtilities.dp(9.0f) + ((FrameLayout.LayoutParams) this.G0[1].getLayoutParams()).width) / 2;
            org.telegram.ui.Components.n81 n81Var2 = this.G0[0];
            Property property = View.ALPHA;
            if (this.T0 == null) {
                f12 = 0.0f;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(n81Var2, property, f12));
            org.telegram.ui.Components.n81 n81Var3 = this.G0[0];
            Property property2 = View.TRANSLATION_X;
            if (this.T0 != null) {
                f11 = 0.0f;
            } else {
                f11 = dp;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(n81Var3, property2, f11));
            org.telegram.ui.Components.n81 n81Var4 = this.G0[1];
            if (this.T0 == null) {
                f13 = -dp;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(n81Var4, property2, f13));
            animatorSet.setInterpolator(org.telegram.ui.Components.pr.f30184g);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new kc1(this));
            animatorSet.start();
            return;
        }
        if (this.T0 == null && (this.f36550y1 instanceof pi1)) {
            this.G0[2].a(false, true);
        }
        org.telegram.ui.Components.n81[] n81VarArr = this.G0;
        if (this.T0 != null) {
            c3 = 2;
        } else {
            c3 = 0;
        }
        n81VarArr[c3].setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        org.telegram.ui.Components.n81 n81Var5 = this.G0[2];
        Property property3 = View.ALPHA;
        if (this.T0 != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(n81Var5, property3, f10);
        org.telegram.ui.Components.n81 n81Var6 = this.G0[0];
        if (this.T0 != null) {
            f12 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(n81Var6, property3, f12));
        animatorSet2.addListener(new jc1(this));
        animatorSet2.setInterpolator(org.telegram.ui.Components.pr.f30184g);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
    }

    public final void m1(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ed1.m1(boolean):void");
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
            this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.k6.f21731h5));
            if (this.f36489b == 2 && this.G1 != 0) {
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
        int i10 = this.f36489b;
        if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 == 2 || i10 == 1) {
            org.telegram.ui.ActionBar.k6.N = true;
        }
        if (i10 == 0 && this.f36533s == null) {
            this.B1 = org.telegram.ui.ActionBar.k6.f21744i0;
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
            this.f36529q1 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
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
        hc1 hc1Var = this.f36511h0;
        if (hc1Var != null && this.N != null) {
            hc1Var.getViewTreeObserver().removeOnGlobalLayoutListener(this.N);
        }
        int i10 = this.f36489b;
        if ((i10 == 2 || i10 == 1) && this.f36520m1 == null) {
            AndroidUtilities.runOnUIThread(new sj0(6));
        }
        if (i10 == 2) {
            Bitmap bitmap = this.f36537t1;
            if (bitmap != null) {
                bitmap.recycle();
                this.f36537t1 = null;
            }
            this.f36486a.b(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        } else if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 != 0 || this.f36533s != null) {
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
            this.f36535s1.c(false);
        }
        org.telegram.ui.ActionBar.k6.f21616b = false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        wc1 wc1Var = this.f36519l0;
        if (wc1Var != null) {
            wc1Var.l();
        }
        ad1 ad1Var = this.f36534s0;
        if (ad1Var != null) {
            ad1Var.l();
        }
        if (this.B1) {
            this.f36535s1.c(true);
        }
        org.telegram.ui.ActionBar.k6.f21616b = true;
    }

    @Override
    public final void onSuccessDownload(String str) {
        j1();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        super.onTransitionAnimationStart(z4, z10);
        if (!z4 && this.f36489b == 2) {
            this.f36486a.b(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.g6 g6Var) {
        this.f36486a.f36188a = g6Var;
    }

    public ed1(org.telegram.ui.ActionBar.j6 j6Var, boolean z4, int i10, boolean z10, boolean z11) {
        super(null);
        this.f36486a = new dc1(this);
        this.d = true;
        this.f36521n = 1;
        org.telegram.ui.ActionBar.r5 r5Var = new org.telegram.ui.ActionBar.r5(this, 0, false);
        this.O = r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2 = new org.telegram.ui.ActionBar.r5(this, 0, true);
        this.P = r5Var2;
        org.telegram.ui.ActionBar.r5 r5Var3 = new org.telegram.ui.ActionBar.r5(this, 1, false);
        this.Q = r5Var3;
        org.telegram.ui.ActionBar.r5 r5Var4 = new org.telegram.ui.ActionBar.r5(this, 1, true);
        this.R = r5Var4;
        this.U = -1;
        this.V = new pb1(this, 0);
        this.f36536t0 = new tc1[2];
        this.I0 = new FrameLayout[2];
        this.J0 = new TextView[2];
        this.K0 = new TextView[2];
        this.L0 = new FrameLayout[2];
        this.S0 = new HashMap();
        this.f36514i1 = 0.5f;
        this.f36518k1 = 0.0f;
        this.f36527p1 = PorterDuff.Mode.SRC_IN;
        this.f36541v1 = 1.0f;
        this.D1 = "640_360";
        this.E1 = 1920;
        this.H1 = true;
        this.P1 = new org.telegram.ui.Components.l20(getParentActivity(), new fc1(this));
        this.Q1 = false;
        this.R1 = false;
        this.f36489b = i10;
        this.f36494c0 = z11;
        this.f36490b0 = j6Var;
        this.f36501e0 = z4;
        this.f36497d0 = z10;
        if (i10 == 1) {
            org.telegram.ui.ActionBar.i6 k10 = j6Var.k(!z10);
            this.f36533s = k10;
            if (k10 != null) {
                this.d = false;
                this.f36542w = k10.f21469c;
                this.f36545x = k10.d;
                this.f36548y = k10.f21470e;
                this.B = k10.f21471f;
                this.C = k10.f21472g;
                this.D = k10.h;
                this.E = k10.f21473i;
                this.F = k10.f21474j;
                this.G = k10.f21475k;
                this.H = k10.f21476l;
                this.I = k10.f21477m;
                this.J = k10.f21480p;
                this.K = k10.f21479o;
                this.L = k10.f21478n;
            }
        } else {
            if (i10 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.i6 k11 = j6Var.k(false);
            this.f36533s = k11;
            if (k11 != null) {
                this.T0 = k11.f21483s;
            }
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.f36533s;
        if (i6Var != null) {
            this.B1 = i6Var.f21481q;
            if (!TextUtils.isEmpty(i6Var.f21479o)) {
                this.f36514i1 = this.f36533s.f21480p;
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

    public ed1(org.telegram.ui.ActionBar.j6 j6Var) {
        this(j6Var, false, 0, false, false);
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
