package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
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
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
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
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserObject;
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

public class nc1 extends org.telegram.ui.ActionBar.n2 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public final int A;
    public kb1 A0;
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
    public mc1 E1;
    public final long F;
    public org.telegram.ui.Components.q71[] F0;
    public long F1;
    public final long G;
    public org.telegram.ui.Components.q71[] G0;
    public boolean G1;
    public final long H;
    public final FrameLayout[] H0;
    public boolean H1;
    public final float I;
    public final TextView[] I0;
    public boolean I1;
    public final String J;
    public final TextView[] J0;
    public org.telegram.ui.Components.oi0 J1;
    public final int K;
    public final FrameLayout[] K0;
    public org.telegram.ui.ActionBar.v0 K1;
    public long L;
    public ta1 L0;
    public ValueAnimator L1;
    public p90 M;
    public lc1 M0;
    public ag.w M1;
    public final org.telegram.ui.ActionBar.n5 N;
    public f2.k0 N0;
    public jb1 N1;
    public final org.telegram.ui.ActionBar.n5 O;
    public org.telegram.ui.Cells.j4 O0;
    public final org.telegram.ui.Components.x10 O1;
    public final org.telegram.ui.ActionBar.n5 P;
    public org.telegram.ui.Cells.j0 P0;
    public boolean P1;
    public final org.telegram.ui.ActionBar.n5 Q;
    public ArrayList Q0;
    public boolean Q1;
    public org.telegram.ui.Components.aq R;
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
    public ag.t0 W;
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

    public final mb1 f40735a;

    public final org.telegram.ui.ActionBar.f6 f40736a0;

    public int f40737a1;
    public TextView a2;

    public final int f40738b;

    public final boolean f40739b0;

    public int f40740b1;

    public WeakReference f40741b2;

    public Scroller f40742c;

    public final boolean f40743c0;

    public int f40744c1;

    public BitmapDrawable f40745c2;
    public final boolean d;

    public final boolean f40746d0;

    public int f40747d1;

    public hc f40748d2;

    public org.telegram.ui.Components.ll f40749e;

    public ArrayList f40750e0;

    public int f40751e1;

    public float f40752e2;

    public org.telegram.ui.ActionBar.v0 f40753f;

    public m2.g f40754f0;

    public int f40755f1;

    public ValueAnimator f40756f2;

    public ag.y1 f40757g0;

    public int f40758g1;
    public TextView h;

    public UndoView f40759h0;

    public float f40760h1;

    public FrameLayout f40761i0;

    public float f40762i1;

    public org.telegram.ui.Components.zk0 f40763j0;

    public float f40764j1;

    public fc1 f40765k0;

    public float f40766k1;

    public org.telegram.ui.Components.m10 f40767l0;
    public ec1 l1;
    public MessageObject m0;

    public org.telegram.ui.Components.cq f40768m1;

    public int f40769n;

    public boolean f40770n0;

    public AnimatorSet f40771n1;

    public org.telegram.ui.ActionBar.k f40772o0;

    public final PorterDuff.Mode f40773o1;

    public org.telegram.ui.ActionBar.q0 f40774p0;

    public int f40775p1;

    public gb1 f40776q0;

    public org.telegram.ui.Components.h9 f40777q1;

    public Drawable f40778r;

    public jc1 f40779r0;

    public org.telegram.ui.Components.s71 f40780r1;

    public final org.telegram.ui.ActionBar.e6 f40781s;

    public final cc1[] f40782s0;

    public Bitmap f40783s1;

    public cc1 f40784t0;

    public Bitmap f40785t1;

    public FrameLayout f40786u0;

    public float f40787u1;
    public boolean v;

    public FrameLayout f40788v0;

    public dc1 f40789v1;

    public final int f40790w;

    public org.telegram.ui.Components.x30 f40791w0;

    public dc1 f40792w1;

    public final int f40793x;

    public AnimatorSet f40794x0;

    public Object f40795x1;

    public final int f40796y;

    public u4 f40797y0;

    public Bitmap f40798y1;

    public kb1 f40799z0;

    public boolean f40800z1;

    public nc1(Object obj, Bitmap bitmap, boolean z10) {
        super(null);
        this.f40735a = new mb1(this);
        this.d = true;
        this.f40769n = 1;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(this, 0, false);
        this.N = n5Var;
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(this, 0, true);
        this.O = n5Var2;
        org.telegram.ui.ActionBar.n5 n5Var3 = new org.telegram.ui.ActionBar.n5(this, 1, false);
        this.P = n5Var3;
        org.telegram.ui.ActionBar.n5 n5Var4 = new org.telegram.ui.ActionBar.n5(this, 1, true);
        this.Q = n5Var4;
        this.T = -1;
        this.U = new ya1(this, 0);
        this.f40782s0 = new cc1[2];
        this.H0 = new FrameLayout[2];
        this.I0 = new TextView[2];
        this.J0 = new TextView[2];
        this.K0 = new FrameLayout[2];
        this.R0 = new HashMap();
        this.f40760h1 = 0.5f;
        this.f40764j1 = 0.0f;
        this.f40773o1 = PorterDuff.Mode.SRC_IN;
        this.f40787u1 = 1.0f;
        this.C1 = "640_360";
        this.D1 = 1920;
        this.G1 = true;
        this.O1 = new org.telegram.ui.Components.x10(getParentActivity(), new ob1(this));
        this.P1 = false;
        this.Q1 = false;
        this.f40738b = 2;
        this.f40795x1 = obj;
        this.f40798y1 = bitmap;
        this.f40800z1 = z10;
        if (obj instanceof wh1) {
            wh1 wh1Var = (wh1) obj;
            this.A1 = wh1Var.f44127j;
            TLRPC.TL_wallPaper tL_wallPaper = wh1Var.f44125g;
            this.S0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f10 = wh1Var.h;
                this.f40760h1 = f10;
                if (f10 < 0.0f && !org.telegram.ui.ActionBar.g6.I.q()) {
                    this.f40760h1 *= -1.0f;
                }
            }
        }
        n5Var.v = true;
        n5Var3.v = true;
        n5Var2.v = true;
        n5Var4.v = true;
    }

    public static void U(nc1 nc1Var) throws Throwable {
        org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.M;
        if (f6Var == null) {
            return;
        }
        int i10 = f6Var.V;
        org.telegram.ui.ActionBar.e6 e6VarK = i10 >= 0 ? (org.telegram.ui.ActionBar.e6) f6Var.W.get(i10) : f6Var.k(false);
        if (nc1Var.f40781s != null) {
            nc1Var.W0();
            org.telegram.ui.ActionBar.g6.t1(nc1Var.f40736a0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.g6.M != null) {
                org.telegram.ui.ActionBar.g6.O = false;
                org.telegram.ui.ActionBar.g6.P = false;
                org.telegram.ui.ActionBar.g6.M = null;
            }
            org.telegram.ui.ActionBar.g6.t(nc1Var.f40736a0, true, nc1Var.f40739b0);
            ((ActionBarLayout) nc1Var.parentLayout).U(false, false);
        } else {
            ((ActionBarLayout) nc1Var.parentLayout).U(false, false);
            File file = new File(nc1Var.f40736a0.f22943b);
            org.telegram.ui.ActionBar.f6 f6Var2 = nc1Var.f40736a0;
            org.telegram.ui.ActionBar.g6.u(file, f6Var2.f22941a, f6Var2.B, false);
            MessagesController.getInstance(nc1Var.f40736a0.A).saveTheme(nc1Var.f40736a0, null, false, false);
            SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            editorEdit.putString("lastDayTheme", nc1Var.f40736a0.m());
            editorEdit.commit();
        }
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) nc1Var.getParentLayout().getFragmentStack().get(Math.max(0, nc1Var.getParentLayout().getFragmentStack().size() - 2));
        nc1Var.finishFragment();
        if (nc1Var.f40738b == 0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didApplyNewTheme, f6Var, e6VarK, Boolean.valueOf(nc1Var.f40746d0));
        }
        org.telegram.ui.ActionBar.g6.F1(n2Var);
    }

    public static void V(nc1 nc1Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        TLRPC.TL_wallPaper tL_wallPaper2;
        String str;
        String str2;
        HashMap map = nc1Var.R0;
        org.telegram.ui.ActionBar.e6 e6Var = nc1Var.f40781s;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            nc1Var.Q0.clear();
            map.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_wallPapers.wallpapers.get(i10) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i10);
                    if (tL_wallPaper3.pattern) {
                        TLRPC.Document document = tL_wallPaper3.document;
                        if (document != null && !map.containsKey(Long.valueOf(document.f22386id))) {
                            nc1Var.Q0.add(tL_wallPaper3);
                            map.put(Long.valueOf(tL_wallPaper3.document.f22386id), tL_wallPaper3);
                        }
                        if (e6Var != null && (str2 = e6Var.f22895o) != null && str2.equals(tL_wallPaper3.slug)) {
                            nc1Var.S0 = tL_wallPaper3;
                            nc1Var.b1(false);
                            nc1Var.j1();
                        } else if (e6Var != null || (tL_wallPaper2 = nc1Var.S0) == null || (str = tL_wallPaper2.slug) == null || !str.equals(tL_wallPaper3.slug)) {
                        }
                        z10 = true;
                    }
                }
            }
            if (!z10 && (tL_wallPaper = nc1Var.S0) != null) {
                nc1Var.Q0.add(0, tL_wallPaper);
            }
            lc1 lc1Var = nc1Var.M0;
            if (lc1Var != null) {
                lc1Var.l();
            }
            MessagesStorage.getInstance(nc1Var.currentAccount).putWallpapers(tL_wallPapers.wallpapers, 1);
        }
        if (nc1Var.S0 != null || e6Var == null || TextUtils.isEmpty(e6Var.f22895o)) {
            return;
        }
        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = e6Var.f22895o;
        getwallpaper.wallpaper = tL_inputWallPaperSlug;
        ConnectionsManager.getInstance(nc1Var.currentAccount).bindRequestToGuid(nc1Var.getConnectionsManager().sendRequest(getwallpaper, new eb1(nc1Var, 0)), nc1Var.classGuid);
    }

    public static void W(nc1 nc1Var) {
        org.telegram.ui.Components.ll llVar = nc1Var.f40749e;
        int i10 = 0;
        if (llVar != null) {
            llVar.B(nc1Var.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
            nc1Var.f40749e.G(nc1Var.getThemedColor(org.telegram.ui.ActionBar.g6.E8), false);
        }
        Drawable drawable = nc1Var.f40778r;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(nc1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6), PorterDuff.Mode.MULTIPLY));
        }
        u4 u4Var = nc1Var.f40797y0;
        if (u4Var != null) {
            u4Var.invalidate();
        }
        if (nc1Var.l1 != null) {
            org.telegram.ui.ActionBar.b5 b5Var = nc1Var.parentLayout;
            if (b5Var == null || b5Var.getBottomSheet() == null) {
                nc1Var.setNavigationBarColor(nc1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
            } else {
                nc1Var.parentLayout.getBottomSheet().fixNavigationBar(nc1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
                if (nc1Var.f40738b == 2 && nc1Var.F1 != 0) {
                    nc1Var.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            }
        }
        if (nc1Var.F0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.q71[] q71VarArr = nc1Var.F0;
                if (i11 >= q71VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.q71 q71Var = q71VarArr[i11];
                if (q71Var != null) {
                    q71Var.invalidate();
                }
                i11++;
            }
        }
        if (nc1Var.G0 != null) {
            while (true) {
                org.telegram.ui.Components.q71[] q71VarArr2 = nc1Var.G0;
                if (i10 >= q71VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.q71 q71Var2 = q71VarArr2[i10];
                if (q71Var2 != null) {
                    q71Var2.invalidate();
                }
                i10++;
            }
        }
        TextView textView = nc1Var.a2;
        if (textView != null) {
            textView.setTextColor(nc1Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
        }
        org.telegram.ui.Components.aq aqVar = nc1Var.R;
        if (aqVar != null) {
            aqVar.invalidate();
        }
        org.telegram.ui.Components.m10 m10Var = nc1Var.f40767l0;
        if (m10Var != null) {
            m10Var.g();
        }
    }

    public static void X(nc1 nc1Var, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (nc1Var.getParentActivity() == null) {
            return;
        }
        ag.i1 i1Var = new ag.i1(23, nc1Var.currentAccount, nc1Var.getParentActivity(), nc1Var, nc1Var.f40735a);
        i1Var.G1(canApplyBoost);
        i1Var.F1(nc1Var.R1, true);
        i1Var.H1(nc1Var.F1);
        if (!nc1Var.U0()) {
            i1Var.M0 = new ya1(nc1Var, 1);
        }
        nc1Var.showDialog(i1Var);
    }

    public final void M0() {
        AnimatorSet animatorSet = this.f40794x0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f40794x0 = animatorSet2;
        int i10 = 1;
        if (this.A1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f40784t0, (Property<cc1, Float>) View.SCALE_X, this.f40787u1), ObjectAnimator.ofFloat(this.f40784t0, (Property<cc1, Float>) View.SCALE_Y, this.f40787u1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f40784t0, (Property<cc1, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f40784t0, (Property<cc1, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f40784t0, (Property<cc1, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f40784t0, (Property<cc1, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.f40794x0.setInterpolator(org.telegram.ui.Components.er.f28123g);
        this.f40794x0.addListener(new qb1(this, i10));
        this.f40794x0.start();
    }

    public final void N0(boolean z10) {
        Object obj;
        Object obj2;
        File file;
        ?? r12;
        Object obj3;
        int i10;
        String str;
        int i11;
        TLRPC.TL_wallPaper tL_wallPaper;
        int i12;
        int i13;
        int i14;
        int i15;
        MediaController.SearchImage searchImage;
        TLRPC.Photo photo;
        File httpFilePath;
        ?? r25;
        ?? r26;
        TLRPC.TL_wallPaper tL_wallPaper2;
        String str2;
        int i16;
        int i17;
        org.telegram.ui.ActionBar.z5 z5Var;
        Object obj4;
        long j10;
        boolean z11;
        TLRPC.TL_wallPaper tL_wallPaper3;
        boolean z12;
        mc1 mc1Var;
        org.telegram.ui.ActionBar.z5 z5Var2;
        mc1 mc1Var2;
        float f10;
        TLRPC.UserFull userFull;
        wh1 wh1Var;
        String str3;
        float f11;
        float f12;
        boolean z13;
        int i18 = 1;
        if (this.F1 < 0) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.R1;
            if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
                getMessagesController().getBoostsController().userCanBoostChannel(this.F1, this.R1, new db1(this, i18));
                return;
            } else if (this.R1 == null) {
                return;
            }
        }
        if (!getUserConfig().isPremium() && z10) {
            showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) this, 22, true));
            return;
        }
        org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
        String strJ = f6Var.j(null, this.B1);
        int i19 = 0;
        String strJ2 = this.B1 ? f6Var.j(null, false) : strJ;
        File file2 = new File(ApplicationLoader.getFilesDirFixed(), strJ);
        Object obj5 = this.f40795x1;
        if (!(obj5 instanceof TLRPC.TL_wallPaper)) {
            boolean z14 = obj5 instanceof wh1;
            if (z14) {
                if (this.S0 != null) {
                    try {
                        Bitmap bitmap = this.f40784t0.getImageReceiver().getBitmap();
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        if (this.Y0 == 0) {
                            if (this.X0 != 0) {
                                GradientDrawable gradientDrawable = new GradientDrawable(org.telegram.ui.Components.m9.d(this.f40747d1), new int[]{this.V0, this.X0});
                                gradientDrawable.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                                gradientDrawable.draw(canvas);
                            } else {
                                canvas.drawColor(this.V0);
                            }
                        }
                        Paint paint = new Paint(2);
                        paint.setColorFilter(new PorterDuffColorFilter(this.f40755f1, this.f40773o1));
                        paint.setAlpha((int) (Math.abs(this.f40760h1) * 255.0f));
                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        if (this.Y0 != 0) {
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        } else {
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        }
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        FileLog.e(th);
                    }
                    r12 = 0;
                } else {
                    obj2 = null;
                    obj = obj2;
                }
            } else if (obj5 instanceof xh1) {
                xh1 xh1Var = (xh1) obj5;
                if (xh1Var.f44468b != 0 || "t".equals(xh1Var.f44467a)) {
                    obj2 = null;
                    obj = obj2;
                } else {
                    try {
                        try {
                            if (!this.W1 || this.T1 == this.U1) {
                                z14 = false;
                                z14 = false;
                                File file3 = xh1Var.f44470e;
                                file = file3 != null ? file3 : xh1Var.d;
                            } else {
                                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap((int) this.V1, this.f40798y1.getHeight(), Bitmap.Config.ARGB_8888);
                                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                                canvas2.translate(-((this.T1 / this.S1) * (this.f40798y1.getWidth() - bitmapCreateBitmap2.getWidth())), 0.0f);
                                z14 = false;
                                canvas2.drawBitmap(this.f40798y1, 0.0f, 0.0f, (Paint) null);
                                xh1Var.d = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                                FileOutputStream fileOutputStream2 = new FileOutputStream(xh1Var.d);
                                bitmapCreateBitmap2.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
                                fileOutputStream2.close();
                                bitmapCreateBitmap2.recycle();
                                file = xh1Var.d;
                            }
                            if (file.equals(file2)) {
                                r12 = z14;
                            } else {
                                try {
                                    AndroidUtilities.copyFile(file, file2);
                                    r12 = z14;
                                } catch (Exception e9) {
                                    e = e9;
                                    FileLog.e(e);
                                    r12 = z14;
                                }
                            }
                        } catch (Exception e10) {
                            e = e10;
                            FileLog.e(e);
                            r12 = z14;
                            if (this.B1) {
                                try {
                                    FileOutputStream fileOutputStream3 = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), strJ2));
                                    this.f40783s1.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream3);
                                    fileOutputStream3.close();
                                } catch (Throwable th2) {
                                    FileLog.e(th2);
                                }
                            }
                            obj3 = this.f40795x1;
                            i10 = 45;
                            if (!(obj3 instanceof TLRPC.TL_wallPaper)) {
                                if (obj3 instanceof wh1) {
                                    if ("d".equals(((wh1) obj3).f44120a)) {
                                        str = "d";
                                        i16 = 0;
                                        i17 = 0;
                                        i15 = 0;
                                    } else {
                                        tL_wallPaper2 = this.S0;
                                        if (tL_wallPaper2 != null) {
                                            str2 = tL_wallPaper2.slug;
                                        } else {
                                            str2 = "c";
                                        }
                                        int i20 = this.V0;
                                        i15 = this.X0;
                                        i16 = this.Y0;
                                        i17 = this.Z0;
                                        i10 = this.f40747d1;
                                        i19 = i20;
                                        str = str2;
                                    }
                                    i11 = i17;
                                    i14 = i16;
                                    i13 = i19;
                                    i12 = i10;
                                    tL_wallPaper = null;
                                } else {
                                    if (obj3 instanceof xh1) {
                                        xh1 xh1Var2 = (xh1) obj3;
                                        str = xh1Var2.f44467a;
                                        httpFilePath = xh1Var2.d;
                                    } else if (obj3 instanceof MediaController.SearchImage) {
                                        searchImage = (MediaController.SearchImage) obj3;
                                        photo = searchImage.photo;
                                        if (photo != null) {
                                            httpFilePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.D1, true), true);
                                        } else {
                                            httpFilePath = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                                        }
                                        str = "";
                                    } else {
                                        str = "d";
                                        i11 = 0;
                                        tL_wallPaper = null;
                                        i12 = 45;
                                        i13 = 0;
                                        i14 = 0;
                                        i15 = 0;
                                    }
                                    r25 = httpFilePath;
                                    i11 = 0;
                                    tL_wallPaper = null;
                                }
                                r26 = 0;
                                z5Var = new org.telegram.ui.ActionBar.z5();
                                z5Var.f24005a = strJ2;
                                z5Var.f24006b = strJ;
                                z5Var.f24007c = str;
                                z5Var.f24011i = this.B1;
                                z5Var.f24012j = this.A1;
                                z5Var.d = i13;
                                z5Var.f24008e = i15;
                                z5Var.f24009f = i14;
                                z5Var.f24010g = i11;
                                z5Var.h = i12;
                                if (this.I1) {
                                    f12 = this.f40764j1;
                                    if (f12 >= 0.0f) {
                                        z5Var.f24013k = f12;
                                    } else {
                                        z5Var.f24013k = this.f40760h1;
                                    }
                                } else {
                                    z5Var.f24013k = this.f40760h1;
                                }
                                obj4 = this.f40795x1;
                                if (obj4 instanceof wh1) {
                                    wh1Var = (wh1) obj4;
                                    if ("c".equals(str)) {
                                        str3 = null;
                                    } else {
                                        str3 = null;
                                    }
                                    f11 = wh1Var.h;
                                    if (f11 < 0.0f) {
                                        f11 *= -1.0f;
                                    }
                                    if (wh1Var.f44129l != null) {
                                        TLRPC.WallPaper wallPaper = wh1Var.f44129l;
                                        z5Var.f24014l = wallPaper.f22532id;
                                        z5Var.f24015m = wallPaper.access_hash;
                                    }
                                }
                                j10 = this.F1;
                                z5Var.f24016n = j10;
                                if (j10 != 0) {
                                    z5Var.f24022t = userFull.wallpaper;
                                }
                                z5Var.f24017o = z10;
                                ?? messagesController = MessagesController.getInstance(this.currentAccount);
                                if (str == null) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                messagesController.saveWallpaperToServer(r26, z5Var, z11, 0L);
                                if (r0 == 0) {
                                    if (this.F1 != 0) {
                                        if (r26 == 0) {
                                            ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.F1, null, z5Var, this.m0, new ag.l3(22));
                                        } else {
                                            ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.F1, null, z5Var, this.m0, new ag.l3(22));
                                        }
                                        this.Z1 = true;
                                        mc1Var2 = this.E1;
                                        if (mc1Var2 != null) {
                                            mc1Var2.a(tL_wallPaper);
                                        }
                                        finishFragment();
                                        tL_wallPaper3 = tL_wallPaper;
                                        z12 = false;
                                    } else {
                                        org.telegram.ui.ActionBar.g6.f23030c0 = getThemedColor(org.telegram.ui.ActionBar.g6.f23203lc);
                                        if ("t".equals(z5Var.f24007c)) {
                                            z5Var2 = null;
                                        } else {
                                            z5Var2 = z5Var;
                                        }
                                        org.telegram.ui.ActionBar.g6.I.v(z5Var2);
                                        org.telegram.ui.ActionBar.g6.o1(true);
                                        if (r3 == 0) {
                                            ImageLoader.getInstance().removeImage(ImageLoader.getHttpFileName(file2.getAbsolutePath()) + "@100_100");
                                        }
                                    }
                                    if (z12) {
                                        mc1Var = this.E1;
                                        if (mc1Var != null) {
                                            mc1Var.a(tL_wallPaper3);
                                        }
                                        finishFragment();
                                    }
                                }
                                tL_wallPaper3 = tL_wallPaper;
                                z12 = true;
                                if (z12) {
                                    mc1Var = this.E1;
                                    if (mc1Var != null) {
                                        mc1Var.a(tL_wallPaper3);
                                    }
                                    finishFragment();
                                }
                            }
                            tL_wallPaper = (TLRPC.TL_wallPaper) obj3;
                            str = tL_wallPaper.slug;
                            r25 = r12;
                            i11 = 0;
                            i12 = 45;
                            i13 = 0;
                            i14 = 0;
                            i15 = 0;
                            r26 = r25;
                            z5Var = new org.telegram.ui.ActionBar.z5();
                            z5Var.f24005a = strJ2;
                            z5Var.f24006b = strJ;
                            z5Var.f24007c = str;
                            z5Var.f24011i = this.B1;
                            z5Var.f24012j = this.A1;
                            z5Var.d = i13;
                            z5Var.f24008e = i15;
                            z5Var.f24009f = i14;
                            z5Var.f24010g = i11;
                            z5Var.h = i12;
                            if (this.I1) {
                                f12 = this.f40764j1;
                                if (f12 >= 0.0f) {
                                    z5Var.f24013k = f12;
                                } else {
                                    z5Var.f24013k = this.f40760h1;
                                }
                            } else {
                                z5Var.f24013k = this.f40760h1;
                            }
                            obj4 = this.f40795x1;
                            if (obj4 instanceof wh1) {
                                wh1Var = (wh1) obj4;
                                if ("c".equals(str)) {
                                    str3 = null;
                                } else {
                                    str3 = null;
                                }
                                f11 = wh1Var.h;
                                if (f11 < 0.0f) {
                                    f11 *= -1.0f;
                                }
                                if (wh1Var.f44129l != null) {
                                    TLRPC.WallPaper wallPaper2 = wh1Var.f44129l;
                                    z5Var.f24014l = wallPaper2.f22532id;
                                    z5Var.f24015m = wallPaper2.access_hash;
                                }
                            }
                            j10 = this.F1;
                            z5Var.f24016n = j10;
                            if (j10 != 0) {
                                z5Var.f24022t = userFull.wallpaper;
                            }
                            z5Var.f24017o = z10;
                            ?? messagesController2 = MessagesController.getInstance(this.currentAccount);
                            if (str == null) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            messagesController2.saveWallpaperToServer(r26, z5Var, z11, 0L);
                            if (r0 == 0) {
                                if (this.F1 != 0) {
                                    if (r26 == 0) {
                                        ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.F1, null, z5Var, this.m0, new ag.l3(22));
                                    } else {
                                        ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.F1, null, z5Var, this.m0, new ag.l3(22));
                                    }
                                    this.Z1 = true;
                                    mc1Var2 = this.E1;
                                    if (mc1Var2 != null) {
                                        mc1Var2.a(tL_wallPaper);
                                    }
                                    finishFragment();
                                    tL_wallPaper3 = tL_wallPaper;
                                    z12 = false;
                                } else {
                                    org.telegram.ui.ActionBar.g6.f23030c0 = getThemedColor(org.telegram.ui.ActionBar.g6.f23203lc);
                                    if ("t".equals(z5Var.f24007c)) {
                                        z5Var2 = null;
                                    } else {
                                        z5Var2 = z5Var;
                                    }
                                    org.telegram.ui.ActionBar.g6.I.v(z5Var2);
                                    org.telegram.ui.ActionBar.g6.o1(true);
                                    if (r3 == 0) {
                                        ImageLoader.getInstance().removeImage(ImageLoader.getHttpFileName(file2.getAbsolutePath()) + "@100_100");
                                    }
                                }
                                if (z12) {
                                    mc1Var = this.E1;
                                    if (mc1Var != null) {
                                        mc1Var.a(tL_wallPaper3);
                                    }
                                    finishFragment();
                                }
                            }
                            tL_wallPaper3 = tL_wallPaper;
                            z12 = true;
                            if (z12) {
                                mc1Var = this.E1;
                                if (mc1Var != null) {
                                    mc1Var.a(tL_wallPaper3);
                                }
                                finishFragment();
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        z14 = false;
                    }
                }
            } else {
                obj = null;
                obj = null;
                if (obj5 instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage2 = (MediaController.SearchImage) obj5;
                    TLRPC.Photo photo2 = searchImage2.photo;
                    try {
                        AndroidUtilities.copyFile(photo2 != null ? FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, this.D1, true), true) : ImageLoader.getHttpFilePath(searchImage2.imageUrl, "jpg"), file2);
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                }
            }
            if (this.B1) {
                FileOutputStream fileOutputStream4 = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), strJ2));
                this.f40783s1.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream4);
                fileOutputStream4.close();
            }
            obj3 = this.f40795x1;
            i10 = 45;
            if (!(obj3 instanceof TLRPC.TL_wallPaper)) {
                if (obj3 instanceof wh1) {
                    if ("d".equals(((wh1) obj3).f44120a)) {
                        str = "d";
                        i16 = 0;
                        i17 = 0;
                        i15 = 0;
                    } else {
                        tL_wallPaper2 = this.S0;
                        if (tL_wallPaper2 != null) {
                            str2 = tL_wallPaper2.slug;
                        } else {
                            str2 = "c";
                        }
                        int i21 = this.V0;
                        i15 = this.X0;
                        i16 = this.Y0;
                        i17 = this.Z0;
                        i10 = this.f40747d1;
                        i19 = i21;
                        str = str2;
                    }
                    i11 = i17;
                    i14 = i16;
                    i13 = i19;
                    i12 = i10;
                    tL_wallPaper = null;
                } else {
                    if (obj3 instanceof xh1) {
                        xh1 xh1Var3 = (xh1) obj3;
                        str = xh1Var3.f44467a;
                        httpFilePath = xh1Var3.d;
                    } else if (obj3 instanceof MediaController.SearchImage) {
                        searchImage = (MediaController.SearchImage) obj3;
                        photo = searchImage.photo;
                        if (photo != null) {
                            httpFilePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.D1, true), true);
                        } else {
                            httpFilePath = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                        }
                        str = "";
                    } else {
                        str = "d";
                        i11 = 0;
                        tL_wallPaper = null;
                        i12 = 45;
                        i13 = 0;
                        i14 = 0;
                        i15 = 0;
                    }
                    r25 = httpFilePath;
                    i11 = 0;
                    tL_wallPaper = null;
                }
                r26 = 0;
                z5Var = new org.telegram.ui.ActionBar.z5();
                z5Var.f24005a = strJ2;
                z5Var.f24006b = strJ;
                z5Var.f24007c = str;
                z5Var.f24011i = this.B1;
                z5Var.f24012j = this.A1;
                z5Var.d = i13;
                z5Var.f24008e = i15;
                z5Var.f24009f = i14;
                z5Var.f24010g = i11;
                z5Var.h = i12;
                if (this.I1) {
                    f12 = this.f40764j1;
                    if (f12 >= 0.0f) {
                        z5Var.f24013k = f12;
                    } else {
                        z5Var.f24013k = this.f40760h1;
                    }
                } else {
                    z5Var.f24013k = this.f40760h1;
                }
                obj4 = this.f40795x1;
                if (obj4 instanceof wh1) {
                    wh1Var = (wh1) obj4;
                    if ("c".equals(str) || "t".equals(str) || "d".equals(str)) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    f11 = wh1Var.h;
                    if (f11 < 0.0f && !org.telegram.ui.ActionBar.g6.I.q()) {
                        f11 *= -1.0f;
                    }
                    if (wh1Var.f44129l != null && wh1Var.f44121b == i13 && wh1Var.f44122c == i15 && wh1Var.d == i14 && wh1Var.f44123e == i11 && TextUtils.equals(wh1Var.f44120a, str3) && wh1Var.f44124f == i12 && (this.S0 == null || Math.abs(f11 - this.f40760h1) < 0.001f)) {
                        TLRPC.WallPaper wallPaper3 = wh1Var.f44129l;
                        z5Var.f24014l = wallPaper3.f22532id;
                        z5Var.f24015m = wallPaper3.access_hash;
                    }
                }
                j10 = this.F1;
                z5Var.f24016n = j10;
                if (j10 != 0 && (userFull = getMessagesController().getUserFull(this.F1)) != null) {
                    z5Var.f24022t = userFull.wallpaper;
                }
                z5Var.f24017o = z10;
                ?? messagesController3 = MessagesController.getInstance(this.currentAccount);
                if (str == null && this.F1 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                messagesController3.saveWallpaperToServer(r26, z5Var, z11, 0L);
                if (r0 == 0) {
                    if (this.F1 != 0) {
                        if (r26 == 0 && getMessagesController().uploadingWallpaperInfo == z5Var) {
                            tL_wallPaper = new TLRPC.TL_wallPaper();
                            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                            tL_wallPaper.settings = tL_wallPaperSettings;
                            tL_wallPaperSettings.intensity = (int) (z5Var.f24013k * 100.0f);
                            tL_wallPaperSettings.blur = z5Var.f24011i;
                            tL_wallPaperSettings.motion = z5Var.f24012j;
                            tL_wallPaper.uploadingImage = r26.getAbsolutePath();
                            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                            Canvas canvas3 = new Canvas(bitmapCreateBitmap3);
                            float fMax = Math.max(50.0f / this.f40784t0.getMeasuredWidth(), 50.0f / this.f40784t0.getMeasuredHeight());
                            canvas3.scale(fMax, fMax);
                            if (this.f40784t0.getMeasuredHeight() > this.f40784t0.getMeasuredWidth()) {
                                f10 = 0.0f;
                                canvas3.translate(0.0f, (-(this.f40784t0.getMeasuredHeight() - this.f40784t0.getMeasuredWidth())) / 2.0f);
                            } else {
                                f10 = 0.0f;
                                canvas3.translate((-(this.f40784t0.getMeasuredWidth() - this.f40784t0.getMeasuredHeight())) / 2.0f, 0.0f);
                            }
                            float f13 = this.f40764j1;
                            this.f40764j1 = f10;
                            this.f40784t0.draw(canvas3);
                            this.f40764j1 = f13;
                            Utilities.blurBitmap(bitmapCreateBitmap3, 3);
                            tL_wallPaper.stripedThumb = bitmapCreateBitmap3;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.random_id = SendMessagesHelper.getInstance(this.currentAccount).getNextRandomId();
                            tL_messageService.dialog_id = this.F1;
                            tL_messageService.unread = true;
                            tL_messageService.out = true;
                            int newMessageId = getUserConfig().getNewMessageId();
                            tL_messageService.f22401id = newMessageId;
                            tL_messageService.local_id = newMessageId;
                            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.F1));
                            if (ChatObject.isChannel(chat)) {
                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                tL_messageService.from_id = tL_peerChannel;
                                tL_peerChannel.channel_id = chat.f22380id;
                                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                tL_messageService.peer_id = tL_peerChannel2;
                                tL_peerChannel2.channel_id = chat.f22380id;
                            } else {
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_messageService.from_id = tL_peerUser;
                                tL_peerUser.user_id = getUserConfig().getClientUserId();
                                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                                tL_messageService.peer_id = tL_peerUser2;
                                tL_peerUser2.user_id = this.F1;
                            }
                            tL_messageService.flags |= 256;
                            tL_messageService.date = getConnectionsManager().getCurrentTime();
                            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = new TLRPC.TL_messageActionSetChatWallPaper();
                            tL_messageService.action = tL_messageActionSetChatWallPaper;
                            tL_messageActionSetChatWallPaper.wallpaper = tL_wallPaper;
                            tL_messageActionSetChatWallPaper.for_both = z10;
                            ArrayList<MessageObject> arrayList = new ArrayList<>();
                            arrayList.add(new MessageObject(this.currentAccount, tL_messageService, false, false));
                            new ArrayList().add(tL_messageService);
                            MessagesController.getInstance(this.currentAccount).updateInterfaceWithMessages(this.F1, arrayList, 0);
                            if (this.F1 >= 0) {
                                TLRPC.UserFull userFull2 = getMessagesController().getUserFull(this.F1);
                                if (userFull2 != null) {
                                    userFull2.wallpaper = tL_wallPaper;
                                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(this.F1), userFull2);
                                }
                            } else {
                                TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.F1);
                                if (chatFull != null) {
                                    chatFull.wallpaper = tL_wallPaper;
                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                                    int i22 = NotificationCenter.chatInfoDidLoad;
                                    Boolean bool = Boolean.FALSE;
                                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i22, chatFull, 0, bool, bool);
                                }
                            }
                        } else {
                            ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.F1, null, z5Var, this.m0, new ag.l3(22));
                        }
                        this.Z1 = true;
                        mc1Var2 = this.E1;
                        if (mc1Var2 != null) {
                            mc1Var2.a(tL_wallPaper);
                        }
                        finishFragment();
                        tL_wallPaper3 = tL_wallPaper;
                        z12 = false;
                    } else {
                        org.telegram.ui.ActionBar.g6.f23030c0 = getThemedColor(org.telegram.ui.ActionBar.g6.f23203lc);
                        if ("t".equals(z5Var.f24007c)) {
                            z5Var2 = null;
                        } else {
                            z5Var2 = z5Var;
                        }
                        org.telegram.ui.ActionBar.g6.I.v(z5Var2);
                        org.telegram.ui.ActionBar.g6.o1(true);
                        if (r3 == 0) {
                            ImageLoader.getInstance().removeImage(ImageLoader.getHttpFileName(file2.getAbsolutePath()) + "@100_100");
                        }
                    }
                    if (z12) {
                        mc1Var = this.E1;
                        if (mc1Var != null) {
                            mc1Var.a(tL_wallPaper3);
                        }
                        finishFragment();
                    }
                }
                tL_wallPaper3 = tL_wallPaper;
                z12 = true;
                if (z12) {
                    mc1Var = this.E1;
                    if (mc1Var != null) {
                        mc1Var.a(tL_wallPaper3);
                    }
                    finishFragment();
                }
            }
            tL_wallPaper = (TLRPC.TL_wallPaper) obj3;
            str = tL_wallPaper.slug;
            r25 = r12;
            i11 = 0;
            i12 = 45;
            i13 = 0;
            i14 = 0;
            i15 = 0;
            r26 = r25;
            z5Var = new org.telegram.ui.ActionBar.z5();
            z5Var.f24005a = strJ2;
            z5Var.f24006b = strJ;
            z5Var.f24007c = str;
            z5Var.f24011i = this.B1;
            z5Var.f24012j = this.A1;
            z5Var.d = i13;
            z5Var.f24008e = i15;
            z5Var.f24009f = i14;
            z5Var.f24010g = i11;
            z5Var.h = i12;
            if (this.I1) {
                f12 = this.f40764j1;
                if (f12 >= 0.0f) {
                    z5Var.f24013k = f12;
                } else {
                    z5Var.f24013k = this.f40760h1;
                }
            } else {
                z5Var.f24013k = this.f40760h1;
            }
            obj4 = this.f40795x1;
            if (obj4 instanceof wh1) {
                wh1Var = (wh1) obj4;
                if ("c".equals(str)) {
                    str3 = null;
                } else {
                    str3 = null;
                }
                f11 = wh1Var.h;
                if (f11 < 0.0f) {
                    f11 *= -1.0f;
                }
                if (wh1Var.f44129l != null) {
                    TLRPC.WallPaper wallPaper4 = wh1Var.f44129l;
                    z5Var.f24014l = wallPaper4.f22532id;
                    z5Var.f24015m = wallPaper4.access_hash;
                }
            }
            j10 = this.F1;
            z5Var.f24016n = j10;
            if (j10 != 0) {
                z5Var.f24022t = userFull.wallpaper;
            }
            z5Var.f24017o = z10;
            ?? messagesController4 = MessagesController.getInstance(this.currentAccount);
            if (str == null) {
                z11 = false;
            } else {
                z11 = false;
            }
            messagesController4.saveWallpaperToServer(r26, z5Var, z11, 0L);
            if (r0 == 0) {
                if (this.F1 != 0) {
                    if (r26 == 0) {
                        ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.F1, null, z5Var, this.m0, new ag.l3(22));
                    } else {
                        ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.F1, null, z5Var, this.m0, new ag.l3(22));
                    }
                    this.Z1 = true;
                    mc1Var2 = this.E1;
                    if (mc1Var2 != null) {
                        mc1Var2.a(tL_wallPaper);
                    }
                    finishFragment();
                    tL_wallPaper3 = tL_wallPaper;
                    z12 = false;
                } else {
                    org.telegram.ui.ActionBar.g6.f23030c0 = getThemedColor(org.telegram.ui.ActionBar.g6.f23203lc);
                    if ("t".equals(z5Var.f24007c)) {
                        z5Var2 = null;
                    } else {
                        z5Var2 = z5Var;
                    }
                    org.telegram.ui.ActionBar.g6.I.v(z5Var2);
                    org.telegram.ui.ActionBar.g6.o1(true);
                    if (r3 == 0) {
                        ImageLoader.getInstance().removeImage(ImageLoader.getHttpFileName(file2.getAbsolutePath()) + "@100_100");
                    }
                }
                if (z12) {
                    mc1Var = this.E1;
                    if (mc1Var != null) {
                        mc1Var.a(tL_wallPaper3);
                    }
                    finishFragment();
                }
            }
            tL_wallPaper3 = tL_wallPaper;
            z12 = true;
            if (z12) {
                mc1Var = this.E1;
                if (mc1Var != null) {
                    mc1Var.a(tL_wallPaper3);
                }
                finishFragment();
            }
        }
        if (this.f40785t1 != null) {
            try {
                FileOutputStream fileOutputStream5 = new FileOutputStream(file2);
                try {
                    this.f40785t1.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream5);
                    fileOutputStream5.close();
                } catch (Exception e13) {
                    e = e13;
                    FileLog.e(e);
                    z13 = false;
                }
            } catch (Exception e14) {
                e = e14;
            }
        } else {
            ImageReceiver imageReceiver = this.f40784t0.getImageReceiver();
            if (imageReceiver.hasNotThumb() || imageReceiver.hasStaticThumb()) {
                Bitmap bitmap2 = imageReceiver.getBitmap();
                try {
                    FileOutputStream fileOutputStream6 = new FileOutputStream(file2);
                    bitmap2.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream6);
                    fileOutputStream6.close();
                } catch (Exception e15) {
                    FileLog.e(e15);
                    z13 = false;
                }
            }
            z13 = false;
            if (!z13) {
                try {
                    AndroidUtilities.copyFile(FileLoader.getInstance(this.currentAccount).getPathToAttach(((TLRPC.TL_wallPaper) this.f40795x1).document, true), file2);
                } catch (Exception e16) {
                    FileLog.e(e16);
                }
            }
            obj = null;
        }
        z13 = true;
        if (!z13) {
            AndroidUtilities.copyFile(FileLoader.getInstance(this.currentAccount).getPathToAttach(((TLRPC.TL_wallPaper) this.f40795x1).document, true), file2);
        }
        obj = null;
        r12 = obj;
        if (this.B1) {
            FileOutputStream fileOutputStream7 = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), strJ2));
            this.f40783s1.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream7);
            fileOutputStream7.close();
        }
        obj3 = this.f40795x1;
        i10 = 45;
        if (!(obj3 instanceof TLRPC.TL_wallPaper)) {
            if (obj3 instanceof wh1) {
                if ("d".equals(((wh1) obj3).f44120a)) {
                    str = "d";
                    i16 = 0;
                    i17 = 0;
                    i15 = 0;
                } else {
                    tL_wallPaper2 = this.S0;
                    if (tL_wallPaper2 != null) {
                        str2 = tL_wallPaper2.slug;
                    } else {
                        str2 = "c";
                    }
                    int i23 = this.V0;
                    i15 = this.X0;
                    i16 = this.Y0;
                    i17 = this.Z0;
                    i10 = this.f40747d1;
                    i19 = i23;
                    str = str2;
                }
                i11 = i17;
                i14 = i16;
                i13 = i19;
                i12 = i10;
                tL_wallPaper = null;
            } else {
                if (obj3 instanceof xh1) {
                    xh1 xh1Var4 = (xh1) obj3;
                    str = xh1Var4.f44467a;
                    httpFilePath = xh1Var4.d;
                } else if (obj3 instanceof MediaController.SearchImage) {
                    searchImage = (MediaController.SearchImage) obj3;
                    photo = searchImage.photo;
                    if (photo != null) {
                        httpFilePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.D1, true), true);
                    } else {
                        httpFilePath = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                    }
                    str = "";
                } else {
                    str = "d";
                    i11 = 0;
                    tL_wallPaper = null;
                    i12 = 45;
                    i13 = 0;
                    i14 = 0;
                    i15 = 0;
                }
                r25 = httpFilePath;
                i11 = 0;
                tL_wallPaper = null;
            }
            r26 = 0;
            z5Var = new org.telegram.ui.ActionBar.z5();
            z5Var.f24005a = strJ2;
            z5Var.f24006b = strJ;
            z5Var.f24007c = str;
            z5Var.f24011i = this.B1;
            z5Var.f24012j = this.A1;
            z5Var.d = i13;
            z5Var.f24008e = i15;
            z5Var.f24009f = i14;
            z5Var.f24010g = i11;
            z5Var.h = i12;
            if (this.I1) {
                f12 = this.f40764j1;
                if (f12 >= 0.0f) {
                    z5Var.f24013k = f12;
                } else {
                    z5Var.f24013k = this.f40760h1;
                }
            } else {
                z5Var.f24013k = this.f40760h1;
            }
            obj4 = this.f40795x1;
            if (obj4 instanceof wh1) {
                wh1Var = (wh1) obj4;
                if ("c".equals(str)) {
                    str3 = null;
                } else {
                    str3 = null;
                }
                f11 = wh1Var.h;
                if (f11 < 0.0f) {
                    f11 *= -1.0f;
                }
                if (wh1Var.f44129l != null) {
                    TLRPC.WallPaper wallPaper5 = wh1Var.f44129l;
                    z5Var.f24014l = wallPaper5.f22532id;
                    z5Var.f24015m = wallPaper5.access_hash;
                }
            }
            j10 = this.F1;
            z5Var.f24016n = j10;
            if (j10 != 0) {
                z5Var.f24022t = userFull.wallpaper;
            }
            z5Var.f24017o = z10;
            ?? messagesController5 = MessagesController.getInstance(this.currentAccount);
            if (str == null) {
                z11 = false;
            } else {
                z11 = false;
            }
            messagesController5.saveWallpaperToServer(r26, z5Var, z11, 0L);
            if (r0 == 0) {
                if (this.F1 != 0) {
                    if (r26 == 0) {
                        ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.F1, null, z5Var, this.m0, new ag.l3(22));
                    } else {
                        ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.F1, null, z5Var, this.m0, new ag.l3(22));
                    }
                    this.Z1 = true;
                    mc1Var2 = this.E1;
                    if (mc1Var2 != null) {
                        mc1Var2.a(tL_wallPaper);
                    }
                    finishFragment();
                    tL_wallPaper3 = tL_wallPaper;
                    z12 = false;
                } else {
                    org.telegram.ui.ActionBar.g6.f23030c0 = getThemedColor(org.telegram.ui.ActionBar.g6.f23203lc);
                    if ("t".equals(z5Var.f24007c)) {
                        z5Var2 = null;
                    } else {
                        z5Var2 = z5Var;
                    }
                    org.telegram.ui.ActionBar.g6.I.v(z5Var2);
                    org.telegram.ui.ActionBar.g6.o1(true);
                    if (r3 == 0) {
                        ImageLoader.getInstance().removeImage(ImageLoader.getHttpFileName(file2.getAbsolutePath()) + "@100_100");
                    }
                }
                if (z12) {
                    mc1Var = this.E1;
                    if (mc1Var != null) {
                        mc1Var.a(tL_wallPaper3);
                    }
                    finishFragment();
                }
            }
            tL_wallPaper3 = tL_wallPaper;
            z12 = true;
            if (z12) {
                mc1Var = this.E1;
                if (mc1Var != null) {
                    mc1Var.a(tL_wallPaper3);
                }
                finishFragment();
            }
        }
        tL_wallPaper = (TLRPC.TL_wallPaper) obj3;
        str = tL_wallPaper.slug;
        r25 = r12;
        i11 = 0;
        i12 = 45;
        i13 = 0;
        i14 = 0;
        i15 = 0;
        r26 = r25;
        z5Var = new org.telegram.ui.ActionBar.z5();
        z5Var.f24005a = strJ2;
        z5Var.f24006b = strJ;
        z5Var.f24007c = str;
        z5Var.f24011i = this.B1;
        z5Var.f24012j = this.A1;
        z5Var.d = i13;
        z5Var.f24008e = i15;
        z5Var.f24009f = i14;
        z5Var.f24010g = i11;
        z5Var.h = i12;
        if (this.I1) {
            f12 = this.f40764j1;
            if (f12 >= 0.0f) {
                z5Var.f24013k = f12;
            } else {
                z5Var.f24013k = this.f40760h1;
            }
        } else {
            z5Var.f24013k = this.f40760h1;
        }
        obj4 = this.f40795x1;
        if (obj4 instanceof wh1) {
            wh1Var = (wh1) obj4;
            if ("c".equals(str)) {
                str3 = null;
            } else {
                str3 = null;
            }
            f11 = wh1Var.h;
            if (f11 < 0.0f) {
                f11 *= -1.0f;
            }
            if (wh1Var.f44129l != null) {
                TLRPC.WallPaper wallPaper6 = wh1Var.f44129l;
                z5Var.f24014l = wallPaper6.f22532id;
                z5Var.f24015m = wallPaper6.access_hash;
            }
        }
        j10 = this.F1;
        z5Var.f24016n = j10;
        if (j10 != 0) {
            z5Var.f24022t = userFull.wallpaper;
        }
        z5Var.f24017o = z10;
        ?? messagesController6 = MessagesController.getInstance(this.currentAccount);
        if (str == null) {
            z11 = false;
        } else {
            z11 = false;
        }
        messagesController6.saveWallpaperToServer(r26, z5Var, z11, 0L);
        if (r0 == 0) {
            if (this.F1 != 0) {
                if (r26 == 0) {
                    ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.F1, null, z5Var, this.m0, new ag.l3(22));
                } else {
                    ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.F1, null, z5Var, this.m0, new ag.l3(22));
                }
                this.Z1 = true;
                mc1Var2 = this.E1;
                if (mc1Var2 != null) {
                    mc1Var2.a(tL_wallPaper);
                }
                finishFragment();
                tL_wallPaper3 = tL_wallPaper;
                z12 = false;
            } else {
                org.telegram.ui.ActionBar.g6.f23030c0 = getThemedColor(org.telegram.ui.ActionBar.g6.f23203lc);
                if ("t".equals(z5Var.f24007c)) {
                    z5Var2 = null;
                } else {
                    z5Var2 = z5Var;
                }
                org.telegram.ui.ActionBar.g6.I.v(z5Var2);
                org.telegram.ui.ActionBar.g6.o1(true);
                if (r3 == 0) {
                    ImageLoader.getInstance().removeImage(ImageLoader.getHttpFileName(file2.getAbsolutePath()) + "@100_100");
                }
            }
            if (z12) {
                mc1Var = this.E1;
                if (mc1Var != null) {
                    mc1Var.a(tL_wallPaper3);
                }
                finishFragment();
            }
        }
        tL_wallPaper3 = tL_wallPaper;
        z12 = true;
        if (z12) {
            mc1Var = this.E1;
            if (mc1Var != null) {
                mc1Var.a(tL_wallPaper3);
            }
            finishFragment();
        }
    }

    public final void O0(boolean z10) throws Throwable {
        int i10 = this.f40738b;
        if (i10 == 2) {
            if (z10) {
                return;
            }
            finishFragment();
            return;
        }
        org.telegram.ui.ActionBar.g6.o();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        org.telegram.ui.ActionBar.e6 e6Var = this.f40781s;
        if (i10 == 1) {
            if (this.f40743c0) {
                e6Var.f22885c = this.f40790w;
                e6Var.d = this.f40793x;
                e6Var.f22886e = this.f40796y;
                e6Var.f22887f = this.A;
                e6Var.f22888g = this.B;
                e6Var.h = this.C;
                e6Var.f22889i = this.D;
                e6Var.f22890j = this.E;
                e6Var.f22891k = this.F;
                e6Var.f22892l = this.G;
                e6Var.f22893m = this.H;
                e6Var.f22894n = this.K;
                e6Var.f22895o = this.J;
                e6Var.f22896p = this.I;
            }
            org.telegram.ui.ActionBar.g6.t1(this.f40736a0, false, true, false, false, false);
        } else {
            if (e6Var != null) {
                org.telegram.ui.ActionBar.g6.t1(this.f40736a0, false, this.f40746d0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).U(false, false);
            if (this.f40746d0) {
                org.telegram.ui.ActionBar.f6 f6Var = this.f40736a0;
                if (f6Var.f22943b != null && org.telegram.ui.ActionBar.g6.H.get(f6Var.m()) == null) {
                    new File(f6Var.f22943b).delete();
                }
            }
        }
        if (z10) {
            return;
        }
        finishFragment();
    }

    public final BitmapDrawable P0(Drawable drawable) {
        WeakReference weakReference = this.f40741b2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.f40745c2;
        }
        WeakReference weakReference2 = this.f40741b2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f40741b2 = null;
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            this.f40745c2 = null;
            return null;
        }
        this.f40741b2 = new WeakReference(drawable);
        int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, intrinsicWidth, 24);
        ColorFilter colorFilter = drawable.getColorFilter();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1.3f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.94f);
        drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setColorFilter(colorFilter);
        Utilities.blurBitmap(bitmapCreateBitmap, 3);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getParentActivity().getResources(), bitmapCreateBitmap);
        this.f40745c2 = bitmapDrawable;
        bitmapDrawable.setFilterBitmap(true);
        return this.f40745c2;
    }

    public final boolean Q0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nc1.Q0(boolean):boolean");
    }

    public final int R0() {
        return ChatObject.isChannelAndNotMegaGroup(-this.F1, this.currentAccount) ? getMessagesController().channelCustomWallpaperLevelMin : getMessagesController().groupCustomWallpaperLevelMin;
    }

    public final ArrayList S0() {
        sx0 sx0Var = new sx0(7, this);
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f40761i0;
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(frameLayout, 1, null, null, null, sx0Var, i10));
        m2.g gVar = this.f40754f0;
        int i11 = org.telegram.ui.ActionBar.g6.f23322s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(gVar, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.g6.f23341t8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 256, null, null, null, null, i12));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.g6.A8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar2, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40772o0, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40772o0, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40772o0, 1024, null, null, null, null, org.telegram.ui.ActionBar.g6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40772o0, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40772o0, Integer.MIN_VALUE, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40772o0, 1073741824, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40763j0, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 32768, null, null, null, null, i11));
        if (!this.d) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.X, 1, null, null, null, null, i10));
            TextView textView = this.Z;
            int i14 = org.telegram.ui.ActionBar.g6.Ae;
            arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 4, null, null, null, null, i14));
        }
        org.telegram.ui.Components.aq aqVar = this.R;
        if (aqVar != null) {
            org.telegram.ui.ActionBar.v0 v0Var = aqVar.E;
            EditTextBoldCursor[] editTextBoldCursorArr = aqVar.A;
            for (int i15 = 0; i15 < editTextBoldCursorArr.length; i15++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.g6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursorArr[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursorArr[i15], 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursorArr[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.g6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursorArr[i15], 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f23181k6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursorArr[i15], 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f23198l6));
            }
            org.telegram.ui.ActionBar.l0 l0Var = aqVar.B;
            int i17 = org.telegram.ui.ActionBar.g6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.i6(l0Var, 8, null, null, null, null, i17));
            org.telegram.ui.ActionBar.l0 l0Var2 = aqVar.B;
            int i18 = org.telegram.ui.ActionBar.g6.I5;
            arrayList.add(new org.telegram.ui.ActionBar.i6(l0Var2, 32, null, null, null, null, i18));
            if (v0Var != null) {
                org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(aqVar, 3);
                arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var, 0, null, null, null, s6Var, i17));
                arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var, 0, null, null, null, s6Var, i18));
                arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.H0;
        if (frameLayoutArr != null) {
            for (int i19 = 0; i19 < frameLayoutArr.length; i19++) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(frameLayoutArr[i19], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23141i3}, null, org.telegram.ui.ActionBar.g6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.i6(frameLayoutArr[i19], 0, null, org.telegram.ui.ActionBar.g6.f23158j2, null, null, org.telegram.ui.ActionBar.g6.Sd));
            }
            int i20 = 0;
            while (true) {
                FrameLayout[] frameLayoutArr2 = this.K0;
                if (i20 >= frameLayoutArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.i6(frameLayoutArr2[i20], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23141i3}, null, org.telegram.ui.ActionBar.g6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.i6(frameLayoutArr2[i20], 0, null, org.telegram.ui.ActionBar.g6.f23158j2, null, null, org.telegram.ui.ActionBar.g6.Sd));
                i20++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40797y0, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23141i3}, null, org.telegram.ui.ActionBar.g6.Td));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40797y0, 0, null, org.telegram.ui.ActionBar.g6.f23158j2, null, null, org.telegram.ui.ActionBar.g6.Sd));
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
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.P0, 0, new Class[]{org.telegram.ui.Components.qn0.class}, new String[]{"innerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Ti));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.P0, 0, new Class[]{org.telegram.ui.Components.qn0.class}, new String[]{"outerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Vi));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.O0, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23212m3, org.telegram.ui.ActionBar.g6.f23281q3}, null, org.telegram.ui.ActionBar.g6.f23305ra));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23231n3, org.telegram.ui.ActionBar.g6.f23298r3}, null, org.telegram.ui.ActionBar.g6.f23059dc));
            Drawable[] drawableArr = org.telegram.ui.ActionBar.g6.f23212m3.f22864y;
            int i23 = org.telegram.ui.ActionBar.g6.f23343ta;
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, drawableArr, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.f23281q3.f22864y, null, i23));
            org.telegram.ui.ActionBar.n5 n5Var = this.N;
            org.telegram.ui.ActionBar.n5 n5Var2 = this.P;
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{n5Var, n5Var2}, null, org.telegram.ui.ActionBar.g6.Aa));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{n5Var, n5Var2}, null, org.telegram.ui.ActionBar.g6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{n5Var, n5Var2}, null, org.telegram.ui.ActionBar.g6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{n5Var, n5Var2}, null, org.telegram.ui.ActionBar.g6.Fa));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23266p3, org.telegram.ui.ActionBar.g6.f23336t3}, null, org.telegram.ui.ActionBar.g6.Ba));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.g6.f23248o3.f22864y;
            int i24 = org.telegram.ui.ActionBar.g6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, drawableArr2, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.f23317s3.f22864y, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23077ec));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.fc));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23420y3}, null, org.telegram.ui.ActionBar.g6.Ja));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23438z3}, null, org.telegram.ui.ActionBar.g6.Ka));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.A3, org.telegram.ui.ActionBar.g6.C3}, null, org.telegram.ui.ActionBar.g6.La));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.B3, org.telegram.ui.ActionBar.g6.D3}, null, org.telegram.ui.ActionBar.g6.Ma));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.F3, org.telegram.ui.ActionBar.g6.G3}, null, org.telegram.ui.ActionBar.g6.f23326sc));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Uc));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23003ab));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Wc));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23040cb));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Yc));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23058db));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23005ad));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23095fb));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23240nd));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23325sb));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.od));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40776q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.nb));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.g6.f23124h5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.g6.f23143i5));
        for (int i25 = 0; i25 < arrayList.size(); i25++) {
            ((org.telegram.ui.ActionBar.i6) arrayList.get(i25)).f23525o = this.f40735a;
        }
        return arrayList;
    }

    public final boolean T0(int i10) {
        int iB0;
        long j10;
        if (this.f40743c0) {
            return false;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f40781s;
        if (i10 == 1 || i10 == 2) {
            long j11 = this.E;
            if (j11 == 0) {
                int iB1 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Nd);
                int i11 = (int) e6Var.f22890j;
                if (i11 == 0) {
                    i11 = iB1;
                }
                if (i11 != iB1) {
                    return true;
                }
            } else if (j11 != e6Var.f22890j) {
                return true;
            }
            long j12 = this.H;
            long j13 = this.G;
            long j14 = this.F;
            if (j14 == 0 && j13 == 0 && j12 == 0) {
                for (int i12 = 0; i12 < 3; i12++) {
                    if (i12 == 0) {
                        iB0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Od);
                        j10 = e6Var.f22891k;
                    } else if (i12 == 1) {
                        iB0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Pd);
                        j10 = e6Var.f22892l;
                    } else {
                        iB0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Qd);
                        j10 = e6Var.f22893m;
                    }
                    int i13 = (int) j10;
                    if (i13 == 0 && j10 != 0) {
                        i13 = 0;
                    } else if (i13 == 0) {
                        i13 = iB0;
                    }
                    if (i13 != iB0) {
                        return true;
                    }
                }
            } else if (j14 != e6Var.f22891k || j13 != e6Var.f22892l || j12 != e6Var.f22893m) {
                return true;
            }
            if (e6Var.f22894n != this.K) {
                return true;
            }
        }
        if (i10 == 1 || i10 == 3) {
            if (this.f40790w != e6Var.d) {
                return true;
            }
            int i14 = this.f40796y;
            if (i14 == 0) {
                int i15 = e6Var.f22886e;
                if (i15 != 0 && i15 != e6Var.f22885c) {
                    return true;
                }
            } else if (i14 != e6Var.f22886e) {
                return true;
            }
            int i16 = this.A;
            if (i16 != 0) {
                if (i16 != e6Var.f22887f) {
                    return true;
                }
            } else if (e6Var.f22887f != 0) {
                return true;
            }
            int i17 = this.B;
            if (i17 != 0) {
                if (i17 != e6Var.f22888g) {
                    return true;
                }
            } else if (e6Var.f22888g != 0) {
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
            if (this.D != e6Var.f22889i) {
                return true;
            }
        }
        return false;
    }

    public boolean U0() {
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        return (b5Var == null || b5Var.getBottomSheet() == null) ? false : true;
    }

    public final void V0() {
        ag.w wVar = this.M1;
        if (wVar != null) {
            wVar.invalidate();
        }
        FrameLayout frameLayout = this.f40786u0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f40786u0.getChildAt(i10).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.f40788v0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                this.f40788v0.getChildAt(i11).invalidate();
            }
        }
        if (this.F0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.q71[] q71VarArr = this.F0;
                if (i12 >= q71VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.q71 q71Var = q71VarArr[i12];
                if (q71Var != null) {
                    q71Var.setDimAmount(this.I1 ? this.f40764j1 * this.f40766k1 : 0.0f);
                    this.F0[i12].invalidate();
                }
                i12++;
            }
        }
        if (this.f40763j0 != null) {
            for (int i13 = 0; i13 < this.f40763j0.getChildCount(); i13++) {
                View childAt = this.f40763j0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.v0) {
                    d1((org.telegram.ui.Cells.v0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.f40776q0 != null) {
            for (int i14 = 0; i14 < this.f40776q0.getChildCount(); i14++) {
                View childAt2 = this.f40776q0.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                    d1((org.telegram.ui.Cells.v0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        dc1 dc1Var = this.f40789v1;
        if (dc1Var != null) {
            dc1Var.invalidate();
        }
        dc1 dc1Var2 = this.f40792w1;
        if (dc1Var2 != null) {
            dc1Var2.invalidate();
        }
        u4 u4Var = this.f40797y0;
        if (u4Var != null) {
            u4Var.invalidate();
        }
    }

    public final void W0() {
        org.telegram.ui.ActionBar.e6 e6Var = this.f40781s;
        if (e6Var == null || TextUtils.isEmpty(e6Var.f22895o)) {
            return;
        }
        try {
            File fileD = e6Var.d();
            Drawable background = this.f40784t0.getBackground();
            Bitmap bitmap = this.f40784t0.getImageReceiver().getBitmap();
            if (background instanceof org.telegram.ui.Components.nb0) {
                FileOutputStream fileOutputStream = new FileOutputStream(fileD);
                bitmap.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                fileOutputStream.close();
                return;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            background.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
            background.draw(canvas);
            Paint paint = new Paint(2);
            paint.setColorFilter(new PorterDuffColorFilter(this.f40755f1, this.f40773o1));
            paint.setAlpha((int) (this.f40760h1 * 255.0f));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileD);
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
            fileOutputStream2.close();
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public final void X0() {
        Y0(2, true);
    }

    public final void Y0(int i10, boolean z10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        int i11;
        int i12;
        if (getParentActivity() == null || this.f40769n == i10 || this.f40771n1 != null || (e6Var = this.f40781s) == null) {
            return;
        }
        if (z10 && i10 == 2 && (org.telegram.ui.ActionBar.g6.Z0() || e6Var.f22890j == 4294967296L)) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ChangeChatBackground);
            if (!org.telegram.ui.ActionBar.g6.Z0() || (org.telegram.ui.ActionBar.g6.Z0() && org.telegram.ui.ActionBar.g6.I.f22949e0.d != 0)) {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ChangeColorToColor);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new ab1(this, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Continue), new ab1(this, 6));
            } else {
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ChangeWallpaperToColor);
                alertDialog$Builder.k(LocaleController.getString(R.string.Change), new ab1(this, 7));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            }
            showDialog(alertDialog$Builder.f22702a);
            return;
        }
        int i13 = this.f40769n;
        this.f40769n = i10;
        if (i10 == 1) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
            int i14 = e6Var.d != 0 ? 2 : 1;
            org.telegram.ui.Components.aq aqVar = this.R;
            T0(1);
            aqVar.f(1, 2, i14, false);
            this.R.e(e6Var.f22885c, 0);
            int i15 = e6Var.d;
            if (i15 != 0) {
                this.R.e(i15, 1);
            }
            if (i13 == 2 || (i13 == 3 && e6Var.f22888g != 0)) {
                this.f40779r0.u(0);
            }
        } else if (i10 == 2) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerBackground));
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.Nd);
            int i16 = org.telegram.ui.ActionBar.g6.Od;
            int themedColor2 = org.telegram.ui.ActionBar.g6.c1(i16) ? getThemedColor(i16) : 0;
            int i17 = org.telegram.ui.ActionBar.g6.Pd;
            int themedColor3 = org.telegram.ui.ActionBar.g6.c1(i17) ? getThemedColor(i17) : 0;
            int i18 = org.telegram.ui.ActionBar.g6.Qd;
            int themedColor4 = org.telegram.ui.ActionBar.g6.c1(i18) ? getThemedColor(i18) : 0;
            long j10 = e6Var.f22891k;
            int i19 = (int) j10;
            if (i19 == 0 && j10 != 0) {
                themedColor2 = 0;
            }
            long j11 = e6Var.f22892l;
            int i20 = (int) j11;
            if (i20 == 0 && j11 != 0) {
                themedColor3 = 0;
            }
            long j12 = e6Var.f22893m;
            int i21 = (int) j12;
            if (i21 == 0 && j12 != 0) {
                themedColor4 = 0;
            }
            int i22 = (int) e6Var.f22890j;
            if (i19 == 0 && themedColor2 == 0) {
                i11 = 1;
            } else if (i21 == 0 && themedColor4 == 0) {
                i11 = (i20 == 0 && themedColor3 == 0) ? 2 : 3;
            } else {
                i11 = 4;
            }
            org.telegram.ui.Components.aq aqVar2 = this.R;
            T0(2);
            aqVar2.f(2, 4, i11, false);
            org.telegram.ui.Components.aq aqVar3 = this.R;
            if (i21 == 0) {
                i21 = themedColor4;
            }
            aqVar3.e(i21, 3);
            org.telegram.ui.Components.aq aqVar4 = this.R;
            if (i20 != 0) {
                themedColor3 = i20;
            }
            aqVar4.e(themedColor3, 2);
            org.telegram.ui.Components.aq aqVar5 = this.R;
            if (i19 == 0) {
                i19 = themedColor2;
            }
            aqVar5.e(i19, 1);
            org.telegram.ui.Components.aq aqVar6 = this.R;
            if (i22 != 0) {
                themedColor = i22;
            }
            aqVar6.e(themedColor, 0);
            if (i13 == 1 || e6Var.f22888g == 0) {
                this.f40779r0.o(0);
            } else {
                this.f40779r0.m(0);
            }
            this.f40776q0.v0(0, AndroidUtilities.dp(60.0f), null);
        } else if (i10 == 3) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerMyMessages));
            if (e6Var.f22887f == 0) {
                i12 = 1;
            } else if (e6Var.h != 0) {
                i12 = 4;
            } else {
                i12 = e6Var.f22888g != 0 ? 3 : 2;
            }
            org.telegram.ui.Components.aq aqVar7 = this.R;
            T0(3);
            aqVar7.f(2, 4, i12, true);
            this.R.e(e6Var.h, 3);
            this.R.e(e6Var.f22888g, 2);
            this.R.e(e6Var.f22887f, 1);
            org.telegram.ui.Components.aq aqVar8 = this.R;
            int i23 = e6Var.f22886e;
            if (i23 == 0) {
                i23 = e6Var.f22885c;
            }
            aqVar8.e(i23, 0);
            this.G0[1].b(0, e6Var.f22886e);
            this.G0[1].b(1, e6Var.f22887f);
            this.G0[1].b(2, e6Var.f22888g);
            this.G0[1].b(3, e6Var.h);
            if (e6Var.f22888g != 0) {
                if (i13 == 1) {
                    this.f40779r0.o(0);
                } else {
                    this.f40779r0.m(0);
                }
            } else if (i13 == 2) {
                this.f40779r0.u(0);
            }
            this.f40776q0.v0(0, AndroidUtilities.dp(60.0f), null);
            e1();
        }
        if (i10 != 1 && i10 != 3) {
            this.R.setMinBrightness(0.0f);
            this.R.setMaxBrightness(1.0f);
            return;
        }
        if (i13 == 2 && this.H0[1].getVisibility() == 0) {
            f1(0, true, true);
        }
        if (i10 != 1) {
            this.R.setMinBrightness(0.0f);
            this.R.setMaxBrightness(1.0f);
        } else if (this.f40736a0.q()) {
            this.R.setMinBrightness(0.2f);
        } else {
            this.R.setMinBrightness(0.05f);
            this.R.setMaxBrightness(0.8f);
        }
    }

    public final void Z0(int i10) {
        TLRPC.TL_wallPaper tL_wallPaper = (i10 < 0 || i10 >= this.Q0.size()) ? this.U0 : (TLRPC.TL_wallPaper) this.Q0.get(i10);
        if (tL_wallPaper == null) {
            return;
        }
        ValueAnimator valueAnimator = this.Y1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.Y1.cancel();
        }
        cc1[] cc1VarArr = this.f40782s0;
        cc1 cc1Var = cc1VarArr[0];
        cc1 cc1Var2 = cc1VarArr[1];
        cc1VarArr[0] = cc1Var2;
        cc1VarArr[1] = cc1Var;
        this.f40774p0.removeView(cc1Var2);
        this.f40774p0.addView(cc1VarArr[0], this.f40774p0.indexOfChild(cc1VarArr[1]) + 1);
        cc1 cc1Var3 = cc1VarArr[0];
        this.f40784t0 = cc1Var3;
        cc1Var3.setBackground(cc1VarArr[1].getBackground());
        k1();
        cc1VarArr[1].setVisibility(0);
        cc1VarArr[1].setAlpha(1.0f);
        this.f40784t0.setVisibility(0);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Y1 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new si(2, this));
        this.Y1.addListener(new qb1(this, 0));
        this.Y1.setInterpolator(org.telegram.ui.Components.er.f28122f);
        this.Y1.setDuration(300L);
        this.Y1.start();
        this.f40784t0.getImageReceiver().setCrossfadeDuration(300);
        this.f40784t0.getImageReceiver().setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.C1, null, null, null, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
        this.f40784t0.d();
        this.S0 = tL_wallPaper;
        this.A1 = this.F0[2].f31827s;
        j1();
    }

    public final void a1(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.nb0 nb0Var;
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
                org.telegram.ui.Components.q71[] q71VarArr = this.F0;
                if (i12 >= q71VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.q71 q71Var = q71VarArr[i12];
                if (q71Var != null) {
                    q71Var.b(i11, i10);
                }
                i12++;
            }
        }
        if (this.Y0 != 0) {
            if (this.P0 != null && org.telegram.ui.ActionBar.g6.I.q()) {
                this.P0.setTwoSided(true);
            }
            Drawable background = this.f40784t0.getBackground();
            if (background instanceof org.telegram.ui.Components.nb0) {
                nb0Var = (org.telegram.ui.Components.nb0) background;
            } else {
                nb0Var = new org.telegram.ui.Components.nb0();
                nb0Var.r(this.f40784t0);
                if (this.f40800z1) {
                    nb0Var.m(false);
                }
            }
            nb0Var.n(this.V0, this.X0, this.Y0, this.Z0);
            this.f40784t0.setBackground(nb0Var);
            this.f40755f1 = nb0Var.f();
            this.f40758g1 = 754974720;
        } else if (this.X0 != 0) {
            this.f40784t0.setBackground(new GradientDrawable(org.telegram.ui.Components.m9.d(this.f40747d1), new int[]{this.V0, this.X0}));
            int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(this.V0, this.X0));
            this.f40758g1 = patternColor;
            this.f40755f1 = patternColor;
        } else {
            this.f40784t0.setBackgroundColor(this.V0);
            int patternColor2 = AndroidUtilities.getPatternColor(this.V0);
            this.f40758g1 = patternColor2;
            this.f40755f1 = patternColor2;
        }
        int i13 = org.telegram.ui.ActionBar.g6.f23203lc;
        boolean zC1 = org.telegram.ui.ActionBar.g6.c1(i13);
        mb1 mb1Var = this.f40735a;
        if (!zC1 || (this.f40784t0.getBackground() instanceof org.telegram.ui.Components.nb0)) {
            mb1Var.b(this.f40784t0.getBackground(), this.f40784t0.getBackground(), Float.valueOf(this.f40760h1));
        } else if (org.telegram.ui.ActionBar.g6.s0() instanceof org.telegram.ui.Components.nb0) {
            getThemedColor(i13);
            mb1Var.b(this.f40784t0.getBackground(), this.f40784t0.getBackground(), Float.valueOf(this.f40760h1));
        }
        ImageView imageView = this.B0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f23150ic), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.C0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f23150ic), PorterDuff.Mode.MULTIPLY));
        }
        cc1 cc1Var = this.f40784t0;
        if (cc1Var != null) {
            cc1Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f40755f1, this.f40773o1));
            this.f40784t0.getImageReceiver().setAlpha(Math.abs(this.f40760h1));
            this.f40784t0.invalidate();
            if (org.telegram.ui.ActionBar.g6.I.q() && (this.f40784t0.getBackground() instanceof org.telegram.ui.Components.nb0)) {
                org.telegram.ui.Cells.j0 j0Var = this.P0;
                if (j0Var != null) {
                    j0Var.setTwoSided(true);
                }
                if (this.f40760h1 < 0.0f) {
                    this.f40784t0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.nb0) this.f40784t0.getBackground()).f30929k);
                }
            } else {
                this.f40784t0.getImageReceiver().setGradientBitmap(null);
                org.telegram.ui.Cells.j0 j0Var2 = this.P0;
                if (j0Var2 != null) {
                    j0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.j0 j0Var3 = this.P0;
            if (j0Var3 != null) {
                j0Var3.setProgress(this.f40760h1);
            }
        }
        gb1 gb1Var = this.f40776q0;
        if (gb1Var != null) {
            gb1Var.f1();
        }
        FrameLayout frameLayout = this.f40786u0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                this.f40786u0.getChildAt(i14).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.f40788v0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                this.f40788v0.getChildAt(i15).invalidate();
            }
        }
    }

    public final void b1(boolean z10) {
        Drawable colorDrawable;
        org.telegram.ui.Components.nb0 nb0Var;
        org.telegram.ui.Components.nb0 nb0Var2;
        org.telegram.ui.ActionBar.e6 e6Var = this.f40781s;
        int i10 = this.f40738b;
        if (i10 == 0 && e6Var == null) {
            this.f40784t0.setBackground(org.telegram.ui.ActionBar.g6.r0());
        } else {
            if (i10 == 2) {
                Object obj = this.f40795x1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = z10 ? FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, 100) : null;
                    BitmapDrawable bitmapDrawable = closestPhotoSizeWithSize instanceof TLRPC.TL_photoStrippedSize ? new BitmapDrawable(ImageLoader.getStrippedPhotoBitmap(closestPhotoSizeWithSize.bytes, "b")) : null;
                    cc1 cc1Var = this.f40784t0;
                    cc1Var.f30898a.setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.C1, ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    cc1Var.d();
                } else if (obj instanceof wh1) {
                    wh1 wh1Var = (wh1) obj;
                    int i11 = wh1Var.f44124f;
                    int i12 = wh1Var.f44123e;
                    int i13 = wh1Var.d;
                    int i14 = wh1Var.f44122c;
                    int i15 = wh1Var.f44121b;
                    this.f40747d1 = i11;
                    a1(i15, 0, false);
                    if (i14 != 0) {
                        a1(i14, 1, false);
                    }
                    a1(i13, 2, false);
                    a1(i12, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.S0;
                    if (tL_wallPaper2 != null) {
                        cc1 cc1Var2 = this.f40784t0;
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                        String str = this.C1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.S0;
                        cc1Var2.k(forDocument, str, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                    } else if ("d".equals(wh1Var.f44120a)) {
                        Point point = AndroidUtilities.displaySize;
                        int iMin = Math.min(point.x, point.y);
                        Point point2 = AndroidUtilities.displaySize;
                        this.f40784t0.setImageBitmap(SvgHelper.getBitmap(R.raw.default_pattern, iMin, Math.max(point2.x, point2.y), Build.VERSION.SDK_INT >= 29 ? 1459617792 : org.telegram.ui.Components.nb0.g(i15, i14, i13, i12)));
                    }
                } else if (obj instanceof xh1) {
                    Bitmap bitmap = this.f40798y1;
                    if (bitmap != null) {
                        this.f40784t0.setImageBitmap(bitmap);
                    } else {
                        xh1 xh1Var = (xh1) obj;
                        File file = xh1Var.f44470e;
                        if (file != null) {
                            this.f40784t0.f(file.getAbsolutePath(), this.C1, null);
                        } else {
                            File file2 = xh1Var.d;
                            if (file2 != null) {
                                this.f40784t0.f(file2.getAbsolutePath(), this.C1, null);
                            } else if ("t".equals(xh1Var.f44467a)) {
                                cc1 cc1Var3 = this.f40784t0;
                                cc1Var3.setImageDrawable(org.telegram.ui.ActionBar.g6.W0(cc1Var3, false));
                            } else {
                                int i16 = xh1Var.f44468b;
                                if (i16 != 0) {
                                    this.f40784t0.setImageResource(i16);
                                }
                            }
                        }
                    }
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    TLRPC.Photo photo = searchImage.photo;
                    if (photo != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, this.D1, true);
                        TLRPC.PhotoSize photoSize = closestPhotoSizeWithSize3 != closestPhotoSizeWithSize2 ? closestPhotoSizeWithSize3 : null;
                        this.f40784t0.k(ImageLocation.getForPhoto(photoSize, searchImage.photo), this.C1, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, searchImage.photo), "100_100_b", photoSize != null ? photoSize.size : 0, "jpg", searchImage, 1);
                    } else {
                        cc1 cc1Var4 = this.f40784t0;
                        String str2 = searchImage.imageUrl;
                        String str3 = this.C1;
                        String str4 = searchImage.thumbUrl;
                        cc1Var4.getClass();
                        cc1Var4.m(ImageLocation.getForPath(str2), str3, ImageLocation.getForPath(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (e6Var == null) {
                this.f40784t0.setBackground(org.telegram.ui.ActionBar.g6.r0());
            } else {
                org.telegram.ui.Components.h9 h9Var = this.f40777q1;
                if (h9Var != null) {
                    h9Var.dispose();
                    this.f40777q1 = null;
                }
                int iB0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Nd);
                int i17 = (int) e6Var.f22890j;
                if (i17 != 0) {
                    iB0 = i17;
                }
                int iB1 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Od);
                long j10 = e6Var.f22891k;
                int i18 = (int) j10;
                if (i18 == 0 && j10 != 0) {
                    iB1 = 0;
                } else if (i18 != 0) {
                    iB1 = i18;
                }
                int iB2 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Pd);
                long j11 = e6Var.f22892l;
                int i19 = (int) j11;
                if (i19 == 0 && j11 != 0) {
                    iB2 = 0;
                } else if (i19 != 0) {
                    iB2 = i19;
                }
                int iB3 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Qd);
                long j12 = e6Var.f22893m;
                int i20 = (int) j12;
                if (i20 == 0 && j12 != 0) {
                    iB3 = 0;
                } else if (i20 != 0) {
                    iB3 = i20;
                }
                if (TextUtils.isEmpty(e6Var.f22895o) || org.telegram.ui.ActionBar.g6.Z0()) {
                    Drawable drawableS0 = org.telegram.ui.ActionBar.g6.s0();
                    if (drawableS0 != null) {
                        if (drawableS0 instanceof org.telegram.ui.Components.nb0) {
                            ((org.telegram.ui.Components.nb0) drawableS0).r(this.f40784t0);
                        }
                        this.f40784t0.setBackground(drawableS0);
                    }
                } else {
                    if (iB2 != 0) {
                        Drawable background = this.f40784t0.getBackground();
                        if (background instanceof org.telegram.ui.Components.nb0) {
                            nb0Var2 = (org.telegram.ui.Components.nb0) background;
                        } else {
                            nb0Var = new org.telegram.ui.Components.nb0();
                            nb0Var.r(this.f40784t0);
                            if (this.f40800z1) {
                                nb0Var2 = nb0Var;
                                nb0Var.m(false);
                                nb0Var2 = nb0Var;
                            }
                        }
                        nb0Var2 = nb0Var;
                        nb0Var2.n(iB0, iB1, iB2, iB3);
                        colorDrawable = nb0Var2;
                    } else if (iB1 != 0) {
                        org.telegram.ui.Components.m9 m9Var = new org.telegram.ui.Components.m9(org.telegram.ui.Components.m9.d(e6Var.f22894n), new int[]{iB0, iB1});
                        this.f40777q1 = m9Var.f(o0.b.h(0.5f, 3), new ub1(this, 0), 100L);
                        colorDrawable = m9Var;
                    } else {
                        colorDrawable = new ColorDrawable(iB0);
                    }
                    this.f40784t0.setBackground(colorDrawable);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.S0;
                    if (tL_wallPaper4 != null) {
                        cc1 cc1Var5 = this.f40784t0;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(tL_wallPaper4.document);
                        String str5 = this.C1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.S0;
                        cc1Var5.k(forDocument2, str5, null, null, tL_wallPaper5.document.size, "jpg", tL_wallPaper5, 1);
                    }
                }
                if (iB1 == 0) {
                    int patternColor = AndroidUtilities.getPatternColor(iB0);
                    this.f40758g1 = patternColor;
                    this.f40755f1 = patternColor;
                } else if (iB2 != 0) {
                    this.f40755f1 = org.telegram.ui.Components.nb0.g(iB0, iB1, iB2, iB3);
                    this.f40758g1 = 754974720;
                } else {
                    int patternColor2 = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(iB0, iB1));
                    this.f40758g1 = patternColor2;
                    this.f40755f1 = patternColor2;
                }
                cc1 cc1Var6 = this.f40784t0;
                if (cc1Var6 != null) {
                    cc1Var6.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f40755f1, this.f40773o1));
                    this.f40784t0.getImageReceiver().setAlpha(Math.abs(this.f40760h1));
                    this.f40784t0.invalidate();
                    if (org.telegram.ui.ActionBar.g6.I.q() && (this.f40784t0.getBackground() instanceof org.telegram.ui.Components.nb0)) {
                        org.telegram.ui.Cells.j0 j0Var = this.P0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                        if (this.f40760h1 < 0.0f) {
                            this.f40784t0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.nb0) this.f40784t0.getBackground()).f30929k);
                        }
                    } else {
                        this.f40784t0.getImageReceiver().setGradientBitmap(null);
                        org.telegram.ui.Cells.j0 j0Var2 = this.P0;
                        if (j0Var2 != null) {
                            j0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.j0 j0Var3 = this.P0;
                    if (j0Var3 != null) {
                        j0Var3.setProgress(this.f40760h1);
                    }
                }
                if (this.F0 != null) {
                    int i21 = 0;
                    while (true) {
                        org.telegram.ui.Components.q71[] q71VarArr = this.F0;
                        if (i21 >= q71VarArr.length) {
                            break;
                        }
                        q71VarArr[i21].b(0, iB0);
                        this.F0[i21].b(1, iB1);
                        this.F0[i21].b(2, iB2);
                        this.F0[i21].b(3, iB3);
                        i21++;
                    }
                }
                ImageView imageView = this.B0;
                if (imageView != null) {
                    imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f23150ic), PorterDuff.Mode.MULTIPLY));
                }
                ImageView imageView2 = this.C0;
                if (imageView2 != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f23150ic), PorterDuff.Mode.MULTIPLY));
                }
                V0();
            }
        }
        this.f40800z1 = false;
    }

    public final void c1(long j10) {
        this.F1 = j10;
        this.G1 = j10 == 0 || j10 == getUserConfig().getClientUserId();
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        cc1[] cc1VarArr;
        int i10;
        int i11;
        float f10;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.e6 e6Var;
        Rect rect;
        TextPaint textPaint;
        Object obj;
        int i14;
        String[] strArr;
        int[] iArr;
        Rect rect2;
        int iMax;
        final int i15;
        mb1 mb1Var;
        final int i16;
        nb1 nb1Var;
        ViewGroup[] viewGroupArr;
        FrameLayout.LayoutParams layoutParamsE;
        float f11;
        int iDp;
        int i17;
        float f12;
        ?? r12;
        int i18;
        int i19;
        int i20;
        int[] iArr2;
        String[] strArr2;
        int i21;
        int iMax2;
        int i22;
        float f13;
        float f14;
        float f15;
        final int i23;
        boolean z11;
        org.telegram.ui.Components.q71 q71Var;
        int iDp2;
        FrameLayout.LayoutParams layoutParams;
        org.telegram.ui.Components.q71 q71Var2;
        int i24;
        boolean z12;
        int iDp3;
        FrameLayout.LayoutParams layoutParams2;
        boolean z13;
        int i25;
        int i26;
        float f16;
        float f17;
        float f18;
        Object obj2;
        int i27;
        ec1 ec1Var;
        int i28;
        float f19;
        float f20;
        float f21;
        final int i29;
        org.telegram.ui.ActionBar.b5 b5Var;
        int i30;
        boolean z14;
        int themedColor;
        int i31;
        int themedColor2;
        int themedColor3;
        int i32;
        int i33;
        this.N.f22856p = (mb1) getResourceProvider();
        this.O.f22856p = (mb1) getResourceProvider();
        this.P.f22856p = (mb1) getResourceProvider();
        this.Q.f22856p = (mb1) getResourceProvider();
        int i34 = 1;
        this.hasOwnBackground = true;
        ec1 ec1Var2 = this.l1;
        int i35 = 0;
        boolean z15 = (ec1Var2 == null || this.F1 == 0) ? false : true;
        this.H1 = z15;
        if (z15) {
            Object obj3 = this.f40795x1;
            if (!(obj3 instanceof xh1)) {
                if (obj3 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj3;
                    if (tL_wallPaper.document == null || tL_wallPaper.pattern) {
                    }
                }
                z10 = false;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        this.I1 = z10;
        if (z10) {
            this.f40766k1 = ec1Var2.a() ? 1.0f : 0.0f;
        }
        org.telegram.ui.ActionBar.b5 b5Var2 = this.parentLayout;
        if (b5Var2 != null && ((ActionBarLayout) b5Var2).z()) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.f40761i0 = new FrameLayout(context);
        int i36 = 3;
        if (this.I1 && SharedConfig.dayNightWallpaperSwitchHint < 3) {
            AndroidUtilities.runOnUIThread(new ya1(this, i36), 2000L);
        }
        org.telegram.ui.ActionBar.v0 v0VarA = this.actionBar.n().a(0, R.drawable.outline_header_search);
        v0VarA.F();
        v0VarA.D = new xb1();
        v0VarA.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c5());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ThemePreview));
        n0 n0Var = new n0(this, context, 24);
        this.f40761i0 = n0Var;
        n0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        this.f40761i0.addView(this.actionBar, h7.z5.c(-2.0f, -1));
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context);
        this.f40763j0 = zk0Var;
        zk0Var.setVerticalScrollBarEnabled(true);
        this.f40763j0.setItemAnimator(null);
        this.f40763j0.setLayoutAnimation(null);
        this.f40763j0.setLayoutManager(new f2.k0(1, false));
        this.f40763j0.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        org.telegram.ui.Components.zk0 zk0Var2 = this.f40763j0;
        int i37 = this.f40738b;
        zk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(i37 != 0 ? 12.0f : 0.0f));
        final int i38 = 4;
        this.f40763j0.setOnItemClickListener(new gh.a(i38));
        this.f40761i0.addView(this.f40763j0, h7.z5.e(-1, -1, 51));
        org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(context, this.resourceProvider);
        this.f40767l0 = m10Var;
        m10Var.setImageResource(R.drawable.floating_pencil);
        this.f40761i0.addView(this.f40767l0, org.telegram.ui.Components.m10.b());
        fc1 fc1Var = new fc1(context);
        this.f40765k0 = fc1Var;
        this.f40763j0.setAdapter(fc1Var);
        this.f40774p0 = new org.telegram.ui.ActionBar.q0(this, context, i36);
        this.f40779r0 = new jc1(context, this);
        this.f40772o0 = createActionBar(context);
        if (AndroidUtilities.isTablet()) {
            this.f40772o0.setOccupyStatusBar(false);
        }
        org.telegram.ui.Cells.pa.x(false, this.f40772o0);
        this.f40772o0.setActionBarMenuOnItemClick(new bc1(this));
        int i39 = 0;
        while (true) {
            cc1VarArr = this.f40782s0;
            if (i39 >= 2) {
                break;
            }
            cc1VarArr[i39] = new cc1(this, (Activity) getContext());
            this.f40774p0.addView(cc1VarArr[i39], h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
            i39++;
        }
        cc1 cc1Var = cc1VarArr[0];
        this.f40784t0 = cc1Var;
        cc1Var.setVisibility(0);
        cc1VarArr[1].setVisibility(8);
        if (i37 == 2) {
            this.f40784t0.getImageReceiver().setDelegate(new ab1(this, i35));
        }
        boolean z16 = this.f40779r0.f39336e;
        org.telegram.ui.ActionBar.f6 f6Var = this.f40736a0;
        if (z16) {
            this.f40772o0.setTitle("Telegram Beta Chat");
            this.f40772o0.setSubtitle(LocaleController.formatPluralString("Members", 505, new Object[0]));
            i10 = i37;
        } else if (i37 == 2) {
            i10 = i37;
            if (this.F1 != 0) {
                this.f40772o0.setTitle(LocaleController.getString(R.string.WallpaperPreview));
            } else {
                this.f40772o0.setTitle(LocaleController.getString(R.string.BackgroundPreview));
            }
            org.telegram.ui.ActionBar.z zVarN = this.f40772o0.n();
            Object obj4 = this.f40795x1;
            if ((obj4 instanceof xh1) && ((xh1) obj4).f44470e != null) {
                zVarN.a(7, R.drawable.msg_header_draw);
            }
            if (this.F1 == 0) {
                if (!BuildVars.DEBUG_PRIVATE_VERSION || org.telegram.ui.ActionBar.g6.m0().k(false) == null) {
                    Object obj5 = this.f40795x1;
                    if (((obj5 instanceof wh1) && !"d".equals(((wh1) obj5).f44120a)) || (this.f40795x1 instanceof TLRPC.TL_wallPaper)) {
                        zVarN.a(5, R.drawable.msg_header_share);
                    }
                } else {
                    zVarN.a(5, R.drawable.msg_header_share);
                }
            }
            if (this.F1 != 0 && this.H1) {
                org.telegram.ui.Components.oi0 oi0Var = new org.telegram.ui.Components.oi0(R.raw.sun, "" + R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
                this.J1 = oi0Var;
                this.K1 = zVarN.d(6, oi0Var);
                this.J1.h = true;
                ec1 ec1Var3 = this.l1;
                if (ec1Var3 == null || ec1Var3.a()) {
                    this.J1.K(35);
                    this.J1.N(36);
                } else {
                    this.J1.N(0);
                    this.J1.K(0);
                }
                this.J1.W = true;
                int iU0 = org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.J9);
                this.J1.O(iU0, "Sunny");
                this.J1.O(iU0, "Path 6");
                this.J1.O(iU0, "Path");
                this.J1.O(iU0, "Path 5");
                this.J1.m();
            }
        } else {
            i10 = i37;
            if (i10 != 1) {
                TLRPC.TL_theme tL_theme = f6Var.B;
                String strN = tL_theme != null ? tL_theme.title : f6Var.n();
                int iLastIndexOf = strN.lastIndexOf(".attheme");
                if (iLastIndexOf >= 0) {
                    strN = strN.substring(0, iLastIndexOf);
                }
                this.f40772o0.setTitle(strN);
                TLRPC.TL_theme tL_theme2 = f6Var.B;
                if (tL_theme2 == null || (i11 = tL_theme2.installs_count) <= 0) {
                    this.f40772o0.setSubtitle(LocaleController.formatDateOnline((System.currentTimeMillis() / 1000) - 3600, null));
                } else {
                    this.f40772o0.setSubtitle(LocaleController.formatPluralString("ThemeInstallCount", i11, new Object[0]));
                }
                this.f40776q0 = new gb1(context, this);
                hb1 hb1Var = new hb1(this);
                hb1Var.S();
                this.f40776q0.setItemAnimator(hb1Var);
                this.f40776q0.setVerticalScrollBarEnabled(true);
                this.f40776q0.setOverScrollMode(2);
                if (i10 == 2) {
                    gb1 gb1Var = this.f40776q0;
                    int iDp4 = AndroidUtilities.dp(4.0f);
                    f10 = 16.0f;
                    if (!this.G1 || this.F1 <= 0) {
                        i32 = 0;
                    } else {
                        i32 = 58;
                    }
                    int iDp5 = AndroidUtilities.dp(72 + i32) - 12;
                    if (U0()) {
                        i33 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i33 = 0;
                    }
                    gb1Var.setPadding(0, iDp4, 0, iDp5 + i33);
                } else {
                    f10 = 16.0f;
                    if (i10 == 1) {
                        this.f40776q0.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(16.0f));
                    } else {
                        this.f40776q0.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                    }
                }
                this.f40776q0.setClipToPadding(false);
                this.f40776q0.setLayoutManager(new f2.k0(1, true));
                gb1 gb1Var2 = this.f40776q0;
                if (LocaleController.isRTL) {
                    i12 = 1;
                } else {
                    i12 = 2;
                }
                gb1Var2.setVerticalScrollbarPosition(i12);
                if (i10 == 1) {
                    this.f40774p0.addView(this.f40776q0, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 273.0f));
                    this.f40776q0.setOnItemClickListener(new ab1(this, i34));
                    i13 = -1;
                } else {
                    i13 = -1;
                    this.f40774p0.addView(this.f40776q0, h7.z5.e(-1, -1, 51));
                }
                this.f40776q0.setOnScrollListener(new ib1(this, i35));
                this.f40774p0.addView(this.f40772o0, h7.z5.c(-2.0f, i13));
                org.telegram.ui.Components.s71 s71Var = new org.telegram.ui.Components.s71(context);
                this.f40780r1 = s71Var;
                s71Var.b(new ab1(this, 2));
                e6Var = this.f40781s;
                if (i10 != 1 || i10 == 2) {
                    if (i10 == 2) {
                        u4 u4Var = new u4(this, context, U0());
                        this.f40797y0 = u4Var;
                        u4Var.setWillNotDraw(false);
                        u4 u4Var2 = this.f40797y0;
                        int iDp6 = AndroidUtilities.dp(12.0f);
                        int iDp7 = AndroidUtilities.dp(12.0f);
                        int iDp8 = AndroidUtilities.dp(12.0f);
                        int iDp9 = AndroidUtilities.dp(12.0f);
                        if (U0()) {
                            i27 = AndroidUtilities.navigationBarHeight;
                        } else {
                            i27 = 0;
                        }
                        u4Var2.setPadding(iDp6, iDp7, iDp8, iDp9 + i27);
                        this.f40774p0.addView(this.f40797y0, h7.z5.e(-1, 0, 81));
                        dc1 dc1Var = new dc1(context, this);
                        this.f40789v1 = dc1Var;
                        h7.b6.b(dc1Var, 0.033f, 1.2f);
                        h1(false);
                        final int i40 = 3;
                        this.f40789v1.setOnClickListener(new View.OnClickListener(this) {

                            public final nc1 f45123b;

                            {
                                this.f45123b = this;
                            }

                            @Override
                            public final void onClick(View view) throws Throwable {
                                switch (i40) {
                                    case 0:
                                        this.f45123b.O0(false);
                                        break;
                                    case 1:
                                        nc1.U(this.f45123b);
                                        break;
                                    case 2:
                                        this.f45123b.f40749e.M(null, null);
                                        break;
                                    case 3:
                                        this.f45123b.N0(false);
                                        break;
                                    default:
                                        this.f45123b.N0(true);
                                        break;
                                }
                            }
                        });
                        if (this.F1 > 0 || this.G1 || this.m0 != null) {
                            this.f40797y0.addView(this.f40789v1, h7.z5.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                        } else {
                            dc1 dc1Var2 = new dc1(context, this);
                            this.f40792w1 = dc1Var2;
                            h7.b6.b(dc1Var2, 0.033f, 1.2f);
                            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.F1));
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
                            if (!getUserConfig().isPremium()) {
                                spannableStringBuilder.append((CharSequence) "l ");
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.cq(R.drawable.msg_mini_lock3), 0, 1, 33);
                            }
                            spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.ApplyWallpaperForMeAndPeer, UserObject.getUserName(user)));
                            this.f40792w1.d(spannableStringBuilder);
                            try {
                                dc1 dc1Var3 = this.f40792w1;
                                dc1Var3.d(Emoji.replaceEmoji(dc1Var3.b(), this.f40792w1.f37353a.i(), false));
                            } catch (Exception unused) {
                            }
                            this.f40792w1.setOnClickListener(new View.OnClickListener(this) {

                                public final nc1 f45123b;

                                {
                                    this.f45123b = this;
                                }

                                @Override
                                public final void onClick(View view) throws Throwable {
                                    switch (i38) {
                                        case 0:
                                            this.f45123b.O0(false);
                                            break;
                                        case 1:
                                            nc1.U(this.f45123b);
                                            break;
                                        case 2:
                                            this.f45123b.f40749e.M(null, null);
                                            break;
                                        case 3:
                                            this.f45123b.N0(false);
                                            break;
                                        default:
                                            this.f45123b.N0(true);
                                            break;
                                    }
                                }
                            });
                            this.f40797y0.addView(this.f40789v1, h7.z5.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 58.0f));
                            this.f40797y0.addView(this.f40792w1, h7.z5.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                        }
                        if (this.I1) {
                            ag.w wVar = new ag.w(this, (Activity) getContext());
                            this.M1 = wVar;
                            wVar.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
                            this.f40774p0.addView(this.M1, h7.z5.e(222, 76, 49));
                            jb1 jb1Var = new jb1((Activity) getContext());
                            this.N1 = jb1Var;
                            jb1Var.d(this.f40764j1);
                            this.N1.b();
                            this.N1.c(new x3(this, 21));
                            this.M1.addView(this.N1);
                            ec1Var = this.l1;
                            if (ec1Var != null) {
                                jb1 jb1Var2 = this.N1;
                                if (ec1Var.a()) {
                                    i28 = 0;
                                } else {
                                    i28 = 8;
                                }
                                jb1Var2.setVisibility(i28);
                                jb1 jb1Var3 = this.N1;
                                if (this.l1.a()) {
                                    f19 = 1.0f;
                                } else {
                                    f19 = 0.0f;
                                }
                                jb1Var3.setAlpha(f19);
                                jb1 jb1Var4 = this.N1;
                                if (this.l1.a()) {
                                    f20 = this.f40764j1;
                                } else {
                                    f20 = 0.0f;
                                }
                                jb1Var4.d(f20);
                            }
                        }
                    }
                    rect = new Rect();
                    Drawable drawableMutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                    this.f40778r = drawableMutate;
                    drawableMutate.getPadding(rect);
                    this.f40778r.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6), PorterDuff.Mode.MULTIPLY));
                    textPaint = new TextPaint(1);
                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    textPaint.setTypeface(AndroidUtilities.bold());
                    obj = this.f40795x1;
                    if (i10 != 1 || (obj instanceof wh1)) {
                        if ((obj instanceof wh1) || !"d".equals(((wh1) obj).f44120a)) {
                            i14 = 3;
                        } else {
                            i14 = 0;
                        }
                    } else if ((obj instanceof xh1) && "t".equals(((xh1) obj).f44467a)) {
                        i14 = 0;
                    } else {
                        i14 = 2;
                    }
                    strArr = new String[i14];
                    iArr = new int[i14];
                    this.F0 = new org.telegram.ui.Components.q71[i14];
                    if (i14 != 0) {
                        this.f40786u0 = new FrameLayout(context);
                        if (i10 != 1 || (this.f40795x1 instanceof wh1)) {
                            strArr[0] = LocaleController.getString(R.string.BackgroundColors);
                            strArr[1] = LocaleController.getString(R.string.BackgroundPattern);
                            strArr[2] = LocaleController.getString(R.string.BackgroundMotion);
                        } else {
                            strArr[0] = LocaleController.getString(R.string.BackgroundBlurred);
                            strArr[1] = LocaleController.getString(R.string.BackgroundMotion);
                        }
                        iMax = 0;
                        i25 = 0;
                        while (i25 < i14) {
                            int iCeil = (int) Math.ceil(textPaint.measureText(strArr[i25]));
                            iArr[i25] = iCeil;
                            iMax = Math.max(iMax, iCeil);
                            i25++;
                            rect = rect;
                        }
                        rect2 = rect;
                        kb1 kb1Var = new kb1(this, context, 0);
                        this.f40799z0 = kb1Var;
                        kb1Var.setWillNotDraw(false);
                        kb1 kb1Var2 = this.f40799z0;
                        if (this.X0 != 0) {
                            i26 = 0;
                        } else {
                            i26 = 4;
                        }
                        kb1Var2.setVisibility(i26);
                        kb1 kb1Var3 = this.f40799z0;
                        if (this.X0 != 0) {
                            f16 = 1.0f;
                        } else {
                            f16 = 0.1f;
                        }
                        kb1Var3.setScaleX(f16);
                        kb1 kb1Var4 = this.f40799z0;
                        if (this.X0 != 0) {
                            f17 = 1.0f;
                        } else {
                            f17 = 0.1f;
                        }
                        kb1Var4.setScaleY(f17);
                        kb1 kb1Var5 = this.f40799z0;
                        if (this.X0 != 0) {
                            f18 = 1.0f;
                        } else {
                            f18 = 0.0f;
                        }
                        kb1Var5.setAlpha(f18);
                        kb1 kb1Var6 = this.f40799z0;
                        if (this.X0 != 0) {
                            obj2 = 1;
                        } else {
                            obj2 = null;
                        }
                        kb1Var6.setTag(obj2);
                        this.f40786u0.addView(this.f40799z0, h7.z5.e(48, 48, 17));
                        this.f40799z0.setOnClickListener(new lb1(this, i35));
                        ImageView imageView = new ImageView(context);
                        this.B0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.B0.setImageResource(R.drawable.bg_rotate_large);
                        this.f40799z0.addView(this.B0, h7.z5.e(-2, -2, 17));
                    } else {
                        rect2 = rect;
                        iMax = 0;
                    }
                    i15 = 0;
                    while (true) {
                        mb1Var = this.f40735a;
                        if (i15 >= i14) {
                            break;
                        }
                        this.F0[i15] = new org.telegram.ui.Components.q71(context, (i10 == 1 && !(this.f40795x1 instanceof wh1)) || i15 != 0, this.f40784t0, mb1Var);
                        this.F0[i15].setBackgroundColor(this.V0);
                        q71Var2 = this.F0[i15];
                        String str = strArr[i15];
                        int i41 = iArr[i15];
                        q71Var2.f31824f = str;
                        q71Var2.h = i41;
                        q71Var2.f31825n = iMax;
                        i24 = 1;
                        if (i10 == 1) {
                            if (i15 == i24) {
                                if (this.S0 == null || !(e6Var == null || TextUtils.isEmpty(e6Var.f22895o))) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                q71Var2.a(z12, false);
                            } else if (i15 == 2) {
                                q71Var2.a(this.A1, false);
                            }
                        } else if (this.f40795x1 instanceof wh1) {
                            i24 = 1;
                            if (i15 == i24) {
                                if (this.S0 == null) {
                                    z12 = true;
                                } else {
                                    z12 = true;
                                }
                                q71Var2.a(z12, false);
                            } else if (i15 == 2) {
                                q71Var2.a(this.A1, false);
                            }
                        } else {
                            if (i15 == 0) {
                                z13 = this.B1;
                            } else {
                                z13 = this.A1;
                            }
                            q71Var2.a(z13, false);
                        }
                        iDp3 = AndroidUtilities.dp(56.0f) + iMax;
                        layoutParams2 = new FrameLayout.LayoutParams(iDp3, -2);
                        layoutParams2.gravity = 17;
                        if (i14 == 3) {
                            if (i15 != 0 || i15 == 2) {
                                layoutParams2.leftMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                            } else {
                                layoutParams2.rightMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                            }
                        } else if (i15 == 1) {
                            layoutParams2.leftMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                        } else {
                            layoutParams2.rightMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                        }
                        this.f40786u0.addView(this.F0[i15], layoutParams2);
                        final org.telegram.ui.Components.q71 q71Var3 = this.F0[i15];
                        final int i42 = 0;
                        q71Var3.setOnClickListener(new View.OnClickListener(this) {

                            public final nc1 f36771b;

                            {
                                this.f36771b = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (i42) {
                                    case 0:
                                        nc1 nc1Var = this.f36771b;
                                        int i43 = nc1Var.f40738b;
                                        FrameLayout[] frameLayoutArr = nc1Var.H0;
                                        if (nc1Var.f40786u0.getAlpha() == 1.0f && nc1Var.f40771n1 == null) {
                                            int i44 = i15;
                                            org.telegram.ui.Components.q71 q71Var4 = q71Var3;
                                            if ((i43 == 1 || (nc1Var.f40795x1 instanceof wh1)) && i44 == 2) {
                                                q71Var4.a(!q71Var4.f31827s, true);
                                                boolean z17 = q71Var4.f31827s;
                                                nc1Var.A1 = z17;
                                                nc1Var.f40780r1.c(z17);
                                                nc1Var.M0();
                                            } else if (i44 == 1 && (i43 == 1 || (nc1Var.f40795x1 instanceof wh1))) {
                                                if (nc1Var.F0[1].f31827s) {
                                                    nc1Var.U0 = nc1Var.S0;
                                                    nc1Var.f40784t0.setImageDrawable(null);
                                                    nc1Var.S0 = null;
                                                    nc1Var.A1 = false;
                                                    nc1Var.j1();
                                                    nc1Var.M0();
                                                    if (frameLayoutArr[1].getVisibility() == 0) {
                                                        if (i43 == 1) {
                                                            nc1Var.f1(0, true, true);
                                                        } else {
                                                            nc1Var.f1(i44, frameLayoutArr[i44].getVisibility() != 0, true);
                                                        }
                                                    }
                                                } else {
                                                    nc1Var.Z0(nc1Var.U0 != null ? -1 : 0);
                                                    if (i43 == 1) {
                                                        nc1Var.f1(1, true, true);
                                                    } else {
                                                        nc1Var.f1(i44, frameLayoutArr[i44].getVisibility() != 0, true);
                                                    }
                                                }
                                                nc1Var.F0[1].a(nc1Var.S0 != null, true);
                                                nc1Var.n1();
                                                nc1Var.L0.f1();
                                                nc1Var.l1();
                                            } else if (nc1Var.f40795x1 instanceof wh1) {
                                                nc1Var.f1(i44, frameLayoutArr[i44].getVisibility() != 0, true);
                                            } else if (i43 != 1) {
                                                q71Var4.a(!q71Var4.f31827s, true);
                                                if (i44 != 0) {
                                                    boolean z18 = q71Var4.f31827s;
                                                    nc1Var.A1 = z18;
                                                    nc1Var.f40780r1.c(z18);
                                                    nc1Var.M0();
                                                } else {
                                                    boolean z19 = q71Var4.f31827s;
                                                    nc1Var.B1 = z19;
                                                    if (z19) {
                                                        nc1Var.f40784t0.getImageReceiver().setForceCrossfade(true);
                                                    }
                                                    nc1Var.i1();
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        nc1 nc1Var2 = this.f36771b;
                                        if (nc1Var2.f40788v0.getAlpha() == 1.0f && i15 == 0) {
                                            org.telegram.ui.Components.q71 q71Var5 = q71Var3;
                                            q71Var5.a(!q71Var5.f31827s, true);
                                            nc1Var2.f40781s.f22889i = q71Var5.f31827s;
                                            org.telegram.ui.ActionBar.g6.n1(true, true);
                                            nc1Var2.f40776q0.f1();
                                        }
                                        break;
                                }
                            }
                        });
                        if (i15 == 2) {
                            this.F0[i15].setAlpha(0.0f);
                            this.F0[i15].setVisibility(4);
                        }
                        i15++;
                    }
                    if (i10 == 1) {
                        iArr2 = new int[2];
                        this.G0 = new org.telegram.ui.Components.q71[2];
                        this.f40788v0 = new FrameLayout(context);
                        strArr2 = new String[]{LocaleController.getString(R.string.BackgroundAnimate), LocaleController.getString(R.string.BackgroundColors)};
                        i21 = 0;
                        iMax2 = 0;
                        for (i20 = 2; i21 < i20; i20 = 2) {
                            int iCeil2 = (int) Math.ceil(textPaint.measureText(strArr2[i21]));
                            iArr2[i21] = iCeil2;
                            iMax2 = Math.max(iMax2, iCeil2);
                            i21++;
                        }
                        if (e6Var != null) {
                            kb1 kb1Var7 = new kb1(this, context, 1);
                            this.A0 = kb1Var7;
                            kb1Var7.setWillNotDraw(false);
                            kb1 kb1Var8 = this.A0;
                            if (e6Var.f22887f != 0) {
                                i22 = 0;
                            } else {
                                i22 = 4;
                            }
                            kb1Var8.setVisibility(i22);
                            kb1 kb1Var9 = this.A0;
                            if (e6Var.f22887f != 0) {
                                f13 = 1.0f;
                            } else {
                                f13 = 0.1f;
                            }
                            kb1Var9.setScaleX(f13);
                            kb1 kb1Var10 = this.A0;
                            if (e6Var.f22887f != 0) {
                                f14 = 1.0f;
                            } else {
                                f14 = 0.1f;
                            }
                            kb1Var10.setScaleY(f14);
                            kb1 kb1Var11 = this.A0;
                            if (e6Var.f22887f != 0) {
                                f15 = 1.0f;
                            } else {
                                f15 = 0.0f;
                            }
                            kb1Var11.setAlpha(f15);
                            this.f40788v0.addView(this.A0, h7.z5.e(48, 48, 17));
                            this.A0.setOnClickListener(new lb1(this, 1));
                            ImageView imageView2 = new ImageView(context);
                            this.C0 = imageView2;
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            this.C0.setImageResource(R.drawable.bg_rotate_large);
                            this.A0.addView(this.C0, h7.z5.e(-2, -2, 17));
                            for (i23 = 0; i23 < 2; i23++) {
                                org.telegram.ui.Components.q71[] q71VarArr = this.G0;
                                if (i23 == 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                q71VarArr[i23] = new org.telegram.ui.Components.q71(context, z11, this.f40784t0, mb1Var);
                                q71Var = this.G0[i23];
                                String str2 = strArr2[i23];
                                int i43 = iArr2[i23];
                                q71Var.f31824f = str2;
                                q71Var.h = i43;
                                q71Var.f31825n = iMax2;
                                if (i23 == 0) {
                                    q71Var.a(e6Var.f22889i, false);
                                }
                                iDp2 = AndroidUtilities.dp(56.0f) + iMax2;
                                layoutParams = new FrameLayout.LayoutParams(iDp2, -2);
                                layoutParams.gravity = 17;
                                if (i23 == 1) {
                                    layoutParams.leftMargin = AndroidUtilities.dp(10.0f) + (iDp2 / 2);
                                } else {
                                    layoutParams.rightMargin = AndroidUtilities.dp(10.0f) + (iDp2 / 2);
                                }
                                this.f40788v0.addView(this.G0[i23], layoutParams);
                                final org.telegram.ui.Components.q71 q71Var4 = this.G0[i23];
                                final int i44 = 1;
                                q71Var4.setOnClickListener(new View.OnClickListener(this) {

                                    public final nc1 f36771b;

                                    {
                                        this.f36771b = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (i44) {
                                            case 0:
                                                nc1 nc1Var = this.f36771b;
                                                int i45 = nc1Var.f40738b;
                                                FrameLayout[] frameLayoutArr = nc1Var.H0;
                                                if (nc1Var.f40786u0.getAlpha() == 1.0f && nc1Var.f40771n1 == null) {
                                                    int i46 = i23;
                                                    org.telegram.ui.Components.q71 q71Var5 = q71Var4;
                                                    if ((i45 == 1 || (nc1Var.f40795x1 instanceof wh1)) && i46 == 2) {
                                                        q71Var5.a(!q71Var5.f31827s, true);
                                                        boolean z17 = q71Var5.f31827s;
                                                        nc1Var.A1 = z17;
                                                        nc1Var.f40780r1.c(z17);
                                                        nc1Var.M0();
                                                    } else if (i46 == 1 && (i45 == 1 || (nc1Var.f40795x1 instanceof wh1))) {
                                                        if (nc1Var.F0[1].f31827s) {
                                                            nc1Var.U0 = nc1Var.S0;
                                                            nc1Var.f40784t0.setImageDrawable(null);
                                                            nc1Var.S0 = null;
                                                            nc1Var.A1 = false;
                                                            nc1Var.j1();
                                                            nc1Var.M0();
                                                            if (frameLayoutArr[1].getVisibility() == 0) {
                                                                if (i45 == 1) {
                                                                    nc1Var.f1(0, true, true);
                                                                } else {
                                                                    nc1Var.f1(i46, frameLayoutArr[i46].getVisibility() != 0, true);
                                                                }
                                                            }
                                                        } else {
                                                            nc1Var.Z0(nc1Var.U0 != null ? -1 : 0);
                                                            if (i45 == 1) {
                                                                nc1Var.f1(1, true, true);
                                                            } else {
                                                                nc1Var.f1(i46, frameLayoutArr[i46].getVisibility() != 0, true);
                                                            }
                                                        }
                                                        nc1Var.F0[1].a(nc1Var.S0 != null, true);
                                                        nc1Var.n1();
                                                        nc1Var.L0.f1();
                                                        nc1Var.l1();
                                                    } else if (nc1Var.f40795x1 instanceof wh1) {
                                                        nc1Var.f1(i46, frameLayoutArr[i46].getVisibility() != 0, true);
                                                    } else if (i45 != 1) {
                                                        q71Var5.a(!q71Var5.f31827s, true);
                                                        if (i46 != 0) {
                                                            boolean z18 = q71Var5.f31827s;
                                                            nc1Var.A1 = z18;
                                                            nc1Var.f40780r1.c(z18);
                                                            nc1Var.M0();
                                                        } else {
                                                            boolean z19 = q71Var5.f31827s;
                                                            nc1Var.B1 = z19;
                                                            if (z19) {
                                                                nc1Var.f40784t0.getImageReceiver().setForceCrossfade(true);
                                                            }
                                                            nc1Var.i1();
                                                        }
                                                    }
                                                    break;
                                                }
                                                break;
                                            default:
                                                nc1 nc1Var2 = this.f36771b;
                                                if (nc1Var2.f40788v0.getAlpha() == 1.0f && i23 == 0) {
                                                    org.telegram.ui.Components.q71 q71Var6 = q71Var4;
                                                    q71Var6.a(!q71Var6.f31827s, true);
                                                    nc1Var2.f40781s.f22889i = q71Var6.f31827s;
                                                    org.telegram.ui.ActionBar.g6.n1(true, true);
                                                    nc1Var2.f40776q0.f1();
                                                }
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                    }
                    if (i10 != 1 || (this.f40795x1 instanceof wh1)) {
                        this.B1 = false;
                        i16 = 0;
                        while (i16 < 2) {
                            rect2 = rect2;
                            nb1Var = new nb1(this, context, i16, rect2);
                            viewGroupArr = this.H0;
                            viewGroupArr[i16] = nb1Var;
                            if (i16 != 1 || i10 == 2) {
                                nb1Var.setVisibility(4);
                            }
                            viewGroupArr[i16].setWillNotDraw(false);
                            layoutParamsE = i10 == 2 ? h7.z5.e(-1, i16 == 0 ? 321 : 316, 83) : h7.z5.e(-1, i16 == 0 ? 273 : 316, 83);
                            if (i16 == 0) {
                                f11 = i10 == 2 ? 321 : 273;
                            } else {
                                f11 = 316.0f;
                            }
                            layoutParamsE.height = AndroidUtilities.dp(f11);
                            if (U0()) {
                                layoutParamsE.height += AndroidUtilities.navigationBarHeight;
                            }
                            if (i16 == 0) {
                                Drawable drawable = this.f40778r;
                                Rect rect3 = AndroidUtilities.rectTmp2;
                                drawable.getPadding(rect3);
                                layoutParamsE.height = AndroidUtilities.dp(12.0f) + rect3.top + layoutParamsE.height;
                            }
                            ViewGroup viewGroup = viewGroupArr[i16];
                            if (i16 == 0) {
                                iDp = AndroidUtilities.dp(12.0f) + rect2.top;
                            } else {
                                iDp = 0;
                            }
                            if (U0()) {
                                i17 = AndroidUtilities.navigationBarHeight;
                            } else {
                                i17 = 0;
                            }
                            viewGroup.setPadding(0, iDp, 0, i17);
                            this.f40774p0.addView(viewGroupArr[i16], layoutParamsE);
                            if (i16 != 1 || i10 == 2) {
                                ag.y1 y1Var = new ag.y1(this, context, 27);
                                ViewGroup[] viewGroupArr2 = this.K0;
                                viewGroupArr2[i16] = y1Var;
                                y1Var.setWillNotDraw(false);
                                viewGroupArr2[i16].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                                viewGroupArr2[i16].setClickable(true);
                                f12 = 21.0f;
                                viewGroupArr[i16].addView(viewGroupArr2[i16], h7.z5.e(-1, 51, 80));
                                TextView textView = new TextView(context);
                                TextView[] textViewArr = this.I0;
                                textViewArr[i16] = textView;
                                textView.setTextSize(1, 15.0f);
                                textViewArr[i16].setTypeface(AndroidUtilities.bold());
                                TextView textView2 = textViewArr[i16];
                                int i45 = org.telegram.ui.ActionBar.g6.Ae;
                                textView2.setTextColor(getThemedColor(i45));
                                textViewArr[i16].setText(LocaleController.getString(R.string.Cancel));
                                textViewArr[i16].setGravity(17);
                                textViewArr[i16].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                                TextView textView3 = textViewArr[i16];
                                int i46 = org.telegram.ui.ActionBar.g6.f23144i6;
                                textView3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(getThemedColor(i46), 0));
                                viewGroupArr2[i16].addView(textViewArr[i16], h7.z5.e(-2, -1, 51));
                                final int i47 = 0;
                                textViewArr[i16].setOnClickListener(new View.OnClickListener(this) {

                                    public final nc1 f38066b;

                                    {
                                        this.f38066b = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (i47) {
                                            case 0:
                                                nc1 nc1Var = this.f38066b;
                                                if (nc1Var.f40771n1 == null) {
                                                    int i48 = i16;
                                                    if (i48 == 0) {
                                                        nc1Var.f40747d1 = nc1Var.f40751e1;
                                                        nc1Var.a1(nc1Var.f40744c1, 3, true);
                                                        nc1Var.a1(nc1Var.f40740b1, 2, true);
                                                        nc1Var.a1(nc1Var.f40737a1, 1, true);
                                                        nc1Var.a1(nc1Var.W0, 0, true);
                                                    } else {
                                                        TLRPC.TL_wallPaper tL_wallPaper2 = nc1Var.T0;
                                                        nc1Var.S0 = tL_wallPaper2;
                                                        if (tL_wallPaper2 == null) {
                                                            nc1Var.f40784t0.setImageDrawable(null);
                                                        } else {
                                                            cc1 cc1Var2 = nc1Var.f40784t0;
                                                            ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                            String str3 = nc1Var.C1;
                                                            TLRPC.TL_wallPaper tL_wallPaper3 = nc1Var.S0;
                                                            cc1Var2.k(forDocument, str3, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                        }
                                                        nc1Var.F0[1].a(nc1Var.S0 != null, false);
                                                        float f22 = nc1Var.f40762i1;
                                                        nc1Var.f40760h1 = f22;
                                                        nc1Var.P0.setProgress(f22);
                                                        nc1Var.f40784t0.getImageReceiver().setAlpha(nc1Var.f40760h1);
                                                        nc1Var.j1();
                                                        nc1Var.n1();
                                                    }
                                                    if (nc1Var.f40738b != 2) {
                                                        if (nc1Var.S0 == null) {
                                                            if (nc1Var.A1) {
                                                                nc1Var.A1 = false;
                                                                nc1Var.F0[0].a(false, true);
                                                                nc1Var.M0();
                                                            }
                                                            nc1Var.l1();
                                                        }
                                                        nc1Var.f1(0, true, true);
                                                    } else {
                                                        nc1Var.f1(i48, false, true);
                                                    }
                                                    break;
                                                }
                                                break;
                                            default:
                                                nc1 nc1Var2 = this.f38066b;
                                                if (nc1Var2.f40771n1 == null) {
                                                    if (nc1Var2.f40738b != 2) {
                                                        nc1Var2.f1(0, true, true);
                                                    } else {
                                                        nc1Var2.f1(i16, false, true);
                                                    }
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                TextView textView4 = new TextView(context);
                                TextView[] textViewArr2 = this.J0;
                                textViewArr2[i16] = textView4;
                                textView4.setTextSize(1, 15.0f);
                                textViewArr2[i16].setTypeface(AndroidUtilities.bold());
                                textViewArr2[i16].setTextColor(getThemedColor(i45));
                                textViewArr2[i16].setText(LocaleController.getString(R.string.ApplyTheme));
                                textViewArr2[i16].setGravity(17);
                                textViewArr2[i16].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                                textViewArr2[i16].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(getThemedColor(i46), 0));
                                viewGroupArr2[i16].addView(textViewArr2[i16], h7.z5.e(-2, -1, 53));
                                TextView textView5 = textViewArr2[i16];
                                r12 = 1;
                                final char c10 = 1 == true ? 1 : 0;
                                textView5.setOnClickListener(new View.OnClickListener(this) {

                                    public final nc1 f38066b;

                                    {
                                        this.f38066b = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (c10) {
                                            case 0:
                                                nc1 nc1Var = this.f38066b;
                                                if (nc1Var.f40771n1 == null) {
                                                    int i48 = i16;
                                                    if (i48 == 0) {
                                                        nc1Var.f40747d1 = nc1Var.f40751e1;
                                                        nc1Var.a1(nc1Var.f40744c1, 3, true);
                                                        nc1Var.a1(nc1Var.f40740b1, 2, true);
                                                        nc1Var.a1(nc1Var.f40737a1, 1, true);
                                                        nc1Var.a1(nc1Var.W0, 0, true);
                                                    } else {
                                                        TLRPC.TL_wallPaper tL_wallPaper2 = nc1Var.T0;
                                                        nc1Var.S0 = tL_wallPaper2;
                                                        if (tL_wallPaper2 == null) {
                                                            nc1Var.f40784t0.setImageDrawable(null);
                                                        } else {
                                                            cc1 cc1Var2 = nc1Var.f40784t0;
                                                            ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                            String str3 = nc1Var.C1;
                                                            TLRPC.TL_wallPaper tL_wallPaper3 = nc1Var.S0;
                                                            cc1Var2.k(forDocument, str3, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                        }
                                                        nc1Var.F0[1].a(nc1Var.S0 != null, false);
                                                        float f22 = nc1Var.f40762i1;
                                                        nc1Var.f40760h1 = f22;
                                                        nc1Var.P0.setProgress(f22);
                                                        nc1Var.f40784t0.getImageReceiver().setAlpha(nc1Var.f40760h1);
                                                        nc1Var.j1();
                                                        nc1Var.n1();
                                                    }
                                                    if (nc1Var.f40738b != 2) {
                                                        if (nc1Var.S0 == null) {
                                                            if (nc1Var.A1) {
                                                                nc1Var.A1 = false;
                                                                nc1Var.F0[0].a(false, true);
                                                                nc1Var.M0();
                                                            }
                                                            nc1Var.l1();
                                                        }
                                                        nc1Var.f1(0, true, true);
                                                    } else {
                                                        nc1Var.f1(i48, false, true);
                                                    }
                                                    break;
                                                }
                                                break;
                                            default:
                                                nc1 nc1Var2 = this.f38066b;
                                                if (nc1Var2.f40771n1 == null) {
                                                    if (nc1Var2.f40738b != 2) {
                                                        nc1Var2.f1(0, true, true);
                                                    } else {
                                                        nc1Var2.f1(i16, false, true);
                                                    }
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                            } else {
                                r12 = 1;
                                f12 = 21.0f;
                            }
                            if (i16 == r12) {
                                TextView textView6 = new TextView(context);
                                this.a2 = textView6;
                                textView6.setLines(r12);
                                this.a2.setSingleLine(r12);
                                this.a2.setText(LocaleController.getString(R.string.BackgroundChoosePattern));
                                this.a2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                                this.a2.setTextSize(r12, 20.0f);
                                this.a2.setTypeface(AndroidUtilities.bold());
                                this.a2.setPadding(AndroidUtilities.dp(f12), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(f12), AndroidUtilities.dp(8.0f));
                                this.a2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                                this.a2.setGravity(16);
                                viewGroupArr[i16].addView(this.a2, h7.z5.d(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                                ta1 ta1Var = new ta1(context);
                                this.L0 = ta1Var;
                                f2.k0 k0Var = new f2.k0(0, false);
                                this.N0 = k0Var;
                                ta1Var.setLayoutManager(k0Var);
                                ta1 ta1Var2 = this.L0;
                                lc1 lc1Var = new lc1(context, this);
                                this.M0 = lc1Var;
                                ta1Var2.setAdapter(lc1Var);
                                this.L0.i(new jh.j(7));
                                viewGroupArr[i16].addView(this.L0, h7.z5.d(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                                this.L0.setOnItemClickListener(new b21(this, 6));
                                org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context);
                                this.O0 = j4Var;
                                j4Var.setText(LocaleController.getString(R.string.BackgroundIntensity));
                                viewGroupArr[i16].addView(this.O0, h7.z5.d(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                                org.telegram.ui.Cells.j0 j0Var = new org.telegram.ui.Cells.j0(context, (mb1) getResourceProvider());
                                this.P0 = j0Var;
                                j0Var.setProgress(this.f40760h1);
                                this.P0.setReportChanges(true);
                                this.P0.setDelegate(new ob1(this));
                                viewGroupArr[i16].addView(this.P0, h7.z5.d(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                            } else {
                                org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(context, this.f40743c0, new pb1(this));
                                this.R = aqVar;
                                aqVar.setResourcesProvider(getResourceProvider());
                                if (i10 == 1) {
                                    viewGroupArr[i16].addView(this.R, h7.z5.e(-1, -1, 1));
                                    if (f6Var.q()) {
                                        this.R.setMinBrightness(0.2f);
                                    } else {
                                        this.R.setMinBrightness(0.05f);
                                        this.R.setMaxBrightness(0.8f);
                                    }
                                    if (e6Var != null) {
                                        if (e6Var.d != 0) {
                                            i18 = 2;
                                        } else {
                                            i18 = 1;
                                        }
                                        org.telegram.ui.Components.aq aqVar2 = this.R;
                                        T0(1);
                                        aqVar2.f(1, 2, i18, false);
                                        this.R.e(e6Var.f22885c, 0);
                                        i19 = e6Var.d;
                                        if (i19 != 0) {
                                            this.R.e(i19, 1);
                                        }
                                    }
                                } else {
                                    viewGroupArr[i16].addView(this.R, h7.z5.d(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                                }
                            }
                            i16++;
                        }
                    }
                    j1();
                    if (!this.f40784t0.getImageReceiver().hasBitmapImage()) {
                        this.f40774p0.setBackgroundColor(-16777216);
                    }
                    if (i10 != 1 && !(this.f40795x1 instanceof wh1)) {
                        this.f40784t0.getImageReceiver().setCrossfadeWithOldImage(true);
                    }
                }
                this.f40776q0.setAdapter(this.f40779r0);
                ag.y1 y1Var2 = new ag.y1(this, context, 28);
                this.f40757g0 = y1Var2;
                y1Var2.setWillNotDraw(false);
                ag.y1 y1Var3 = this.f40757g0;
                this.fragmentView = y1Var3;
                ViewTreeObserver viewTreeObserver = y1Var3.getViewTreeObserver();
                p90 p90Var = new p90(this, 1);
                this.M = p90Var;
                viewTreeObserver.addOnGlobalLayoutListener(p90Var);
                m2.g gVar = new m2.g(context);
                this.f40754f0 = gVar;
                int i48 = 2;
                gVar.b(new q2(this, i48));
                this.f40754f0.setAdapter(new ag.b2(this, i48));
                AndroidUtilities.setViewPagerEdgeEffectColor(this.f40754f0, getThemedColor(org.telegram.ui.ActionBar.g6.f23322s8));
                ag.y1 y1Var4 = this.f40757g0;
                m2.g gVar2 = this.f40754f0;
                if (i10 == 0) {
                    f21 = 48.0f;
                } else {
                    f21 = 0.0f;
                }
                y1Var4.addView(gVar2, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, f21));
                UndoView undoView = new UndoView(context, this);
                this.f40759h0 = undoView;
                undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
                this.f40757g0.addView(this.f40759h0, h7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                if (i10 == 0) {
                    View view = new View(context);
                    view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.V5));
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, 1, 83);
                    layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
                    this.f40757g0.addView(view, layoutParams3);
                    FrameLayout frameLayout = new FrameLayout(context);
                    this.X = frameLayout;
                    i30 = org.telegram.ui.ActionBar.g6.f23053d6;
                    z14 = this.d;
                    if (z14) {
                        themedColor = org.telegram.ui.ActionBar.g6.C0(i30);
                    } else {
                        themedColor = getThemedColor(i30);
                    }
                    frameLayout.setBackgroundColor(themedColor);
                    this.f40757g0.addView(this.X, h7.z5.e(-1, 48, 83));
                    ag.t0 t0Var = new ag.t0(context, this);
                    this.W = t0Var;
                    this.X.addView(t0Var, h7.z5.e(22, 8, 17));
                    TextView textView7 = new TextView(context);
                    this.Z = textView7;
                    textView7.setTextSize(1, 14.0f);
                    TextView textView8 = this.Z;
                    i31 = org.telegram.ui.ActionBar.g6.Ae;
                    if (z14) {
                        themedColor2 = org.telegram.ui.ActionBar.g6.C0(i31);
                    } else {
                        themedColor2 = getThemedColor(i31);
                    }
                    textView8.setTextColor(themedColor2);
                    this.Z.setGravity(17);
                    this.Z.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(251658240, 0));
                    this.Z.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
                    this.Z.setText(LocaleController.getString(R.string.Cancel));
                    this.Z.setTypeface(AndroidUtilities.bold());
                    this.X.addView(this.Z, h7.z5.e(-2, -1, 51));
                    final int i49 = 0;
                    this.Z.setOnClickListener(new View.OnClickListener(this) {

                        public final nc1 f45123b;

                        {
                            this.f45123b = this;
                        }

                        @Override
                        public final void onClick(View view2) throws Throwable {
                            switch (i49) {
                                case 0:
                                    this.f45123b.O0(false);
                                    break;
                                case 1:
                                    nc1.U(this.f45123b);
                                    break;
                                case 2:
                                    this.f45123b.f40749e.M(null, null);
                                    break;
                                case 3:
                                    this.f45123b.N0(false);
                                    break;
                                default:
                                    this.f45123b.N0(true);
                                    break;
                            }
                        }
                    });
                    TextView textView9 = new TextView(context);
                    this.Y = textView9;
                    textView9.setTextSize(1, 14.0f);
                    TextView textView10 = this.Y;
                    if (z14) {
                        themedColor3 = org.telegram.ui.ActionBar.g6.C0(i31);
                    } else {
                        themedColor3 = getThemedColor(i31);
                    }
                    textView10.setTextColor(themedColor3);
                    this.Y.setGravity(17);
                    this.Y.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(251658240, 0));
                    this.Y.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
                    this.Y.setText(LocaleController.getString(R.string.ApplyTheme));
                    this.Y.setTypeface(AndroidUtilities.bold());
                    this.X.addView(this.Y, h7.z5.e(-2, -1, 53));
                    i29 = 1;
                    this.Y.setOnClickListener(new View.OnClickListener(this) {

                        public final nc1 f45123b;

                        {
                            this.f45123b = this;
                        }

                        @Override
                        public final void onClick(View view2) throws Throwable {
                            switch (i29) {
                                case 0:
                                    this.f45123b.O0(false);
                                    break;
                                case 1:
                                    nc1.U(this.f45123b);
                                    break;
                                case 2:
                                    this.f45123b.f40749e.M(null, null);
                                    break;
                                case 3:
                                    this.f45123b.N0(false);
                                    break;
                                default:
                                    this.f45123b.N0(true);
                                    break;
                            }
                        }
                    });
                } else {
                    i29 = 1;
                }
                if (i10 == i29 && !org.telegram.ui.ActionBar.g6.Z0() && e6Var != null && e6Var.f22890j != 4294967296L) {
                    X0();
                }
                this.f40750e0 = S0();
                b1(true);
                m1(false);
                this.f40742c = new Scroller(getContext());
                b5Var = this.parentLayout;
                if (b5Var != null && b5Var.getBottomSheet() != null) {
                    this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
                    if (i10 == 2 && this.F1 != 0) {
                        this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                    }
                }
                return this.fragmentView;
            }
            org.telegram.ui.ActionBar.z zVarN2 = this.f40772o0.n();
            this.f40753f = zVarN2.e(4, LocaleController.getString(R.string.Save));
            org.telegram.ui.Components.ll llVar = new org.telegram.ui.Components.ll(this, context, zVarN2);
            this.f40749e = llVar;
            llVar.setSubMenuOpenSide(1);
            this.f40749e.g(2, LocaleController.getString(R.string.ColorPickerBackground));
            this.f40749e.g(1, LocaleController.getString(R.string.ColorPickerMainColor));
            this.f40749e.g(3, LocaleController.getString(R.string.ColorPickerMyMessages));
            this.f40749e.D();
            this.f40749e.setForceSmoothKeyboard(true);
            this.f40772o0.addView(this.f40749e, h7.z5.d(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
            final int i50 = 2;
            this.f40749e.setOnClickListener(new View.OnClickListener(this) {

                public final nc1 f45123b;

                {
                    this.f45123b = this;
                }

                @Override
                public final void onClick(View view2) throws Throwable {
                    switch (i50) {
                        case 0:
                            this.f45123b.O0(false);
                            break;
                        case 1:
                            nc1.U(this.f45123b);
                            break;
                        case 2:
                            this.f45123b.f40749e.M(null, null);
                            break;
                        case 3:
                            this.f45123b.N0(false);
                            break;
                        default:
                            this.f45123b.N0(true);
                            break;
                    }
                }
            });
            TextView textView11 = new TextView(context);
            this.h = textView11;
            textView11.setImportantForAccessibility(2);
            this.h.setGravity(3);
            this.h.setSingleLine(true);
            this.h.setLines(1);
            this.h.setMaxLines(1);
            this.h.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView12 = this.h;
            int i51 = org.telegram.ui.ActionBar.g6.A8;
            textView12.setTextColor(getThemedColor(i51));
            this.h.setTypeface(AndroidUtilities.bold());
            this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
            Drawable drawableMutate2 = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i51), PorterDuff.Mode.MULTIPLY));
            this.h.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableMutate2, (Drawable) null);
            this.h.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
            this.h.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            this.f40749e.addView(this.h, h7.z5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 1.0f));
        }
        this.f40776q0 = new gb1(context, this);
        hb1 hb1Var2 = new hb1(this);
        hb1Var2.S();
        this.f40776q0.setItemAnimator(hb1Var2);
        this.f40776q0.setVerticalScrollBarEnabled(true);
        this.f40776q0.setOverScrollMode(2);
        if (i10 == 2) {
            gb1 gb1Var3 = this.f40776q0;
            int iDp10 = AndroidUtilities.dp(4.0f);
            f10 = 16.0f;
            if (this.G1) {
                i32 = 0;
            } else {
                i32 = 0;
            }
            int iDp11 = AndroidUtilities.dp(72 + i32) - 12;
            if (U0()) {
                i33 = AndroidUtilities.navigationBarHeight;
            } else {
                i33 = 0;
            }
            gb1Var3.setPadding(0, iDp10, 0, iDp11 + i33);
        } else {
            f10 = 16.0f;
            if (i10 == 1) {
                this.f40776q0.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(16.0f));
            } else {
                this.f40776q0.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
            }
        }
        this.f40776q0.setClipToPadding(false);
        this.f40776q0.setLayoutManager(new f2.k0(1, true));
        gb1 gb1Var4 = this.f40776q0;
        if (LocaleController.isRTL) {
            i12 = 1;
        } else {
            i12 = 2;
        }
        gb1Var4.setVerticalScrollbarPosition(i12);
        if (i10 == 1) {
            this.f40774p0.addView(this.f40776q0, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 273.0f));
            this.f40776q0.setOnItemClickListener(new ab1(this, i34));
            i13 = -1;
        } else {
            i13 = -1;
            this.f40774p0.addView(this.f40776q0, h7.z5.e(-1, -1, 51));
        }
        this.f40776q0.setOnScrollListener(new ib1(this, i35));
        this.f40774p0.addView(this.f40772o0, h7.z5.c(-2.0f, i13));
        org.telegram.ui.Components.s71 s71Var2 = new org.telegram.ui.Components.s71(context);
        this.f40780r1 = s71Var2;
        s71Var2.b(new ab1(this, 2));
        e6Var = this.f40781s;
        if (i10 != 1) {
            if (i10 == 2) {
                u4 u4Var3 = new u4(this, context, U0());
                this.f40797y0 = u4Var3;
                u4Var3.setWillNotDraw(false);
                u4 u4Var4 = this.f40797y0;
                int iDp12 = AndroidUtilities.dp(12.0f);
                int iDp13 = AndroidUtilities.dp(12.0f);
                int iDp14 = AndroidUtilities.dp(12.0f);
                int iDp15 = AndroidUtilities.dp(12.0f);
                if (U0()) {
                    i27 = AndroidUtilities.navigationBarHeight;
                } else {
                    i27 = 0;
                }
                u4Var4.setPadding(iDp12, iDp13, iDp14, iDp15 + i27);
                this.f40774p0.addView(this.f40797y0, h7.z5.e(-1, 0, 81));
                dc1 dc1Var4 = new dc1(context, this);
                this.f40789v1 = dc1Var4;
                h7.b6.b(dc1Var4, 0.033f, 1.2f);
                h1(false);
                final int i410 = 3;
                this.f40789v1.setOnClickListener(new View.OnClickListener(this) {

                    public final nc1 f45123b;

                    {
                        this.f45123b = this;
                    }

                    @Override
                    public final void onClick(View view2) throws Throwable {
                        switch (i410) {
                            case 0:
                                this.f45123b.O0(false);
                                break;
                            case 1:
                                nc1.U(this.f45123b);
                                break;
                            case 2:
                                this.f45123b.f40749e.M(null, null);
                                break;
                            case 3:
                                this.f45123b.N0(false);
                                break;
                            default:
                                this.f45123b.N0(true);
                                break;
                        }
                    }
                });
                if (this.F1 > 0) {
                    this.f40797y0.addView(this.f40789v1, h7.z5.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                } else {
                    this.f40797y0.addView(this.f40789v1, h7.z5.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                }
                if (this.I1) {
                    ag.w wVar2 = new ag.w(this, (Activity) getContext());
                    this.M1 = wVar2;
                    wVar2.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
                    this.f40774p0.addView(this.M1, h7.z5.e(222, 76, 49));
                    jb1 jb1Var5 = new jb1((Activity) getContext());
                    this.N1 = jb1Var5;
                    jb1Var5.d(this.f40764j1);
                    this.N1.b();
                    this.N1.c(new x3(this, 21));
                    this.M1.addView(this.N1);
                    ec1Var = this.l1;
                    if (ec1Var != null) {
                        jb1 jb1Var6 = this.N1;
                        if (ec1Var.a()) {
                            i28 = 0;
                        } else {
                            i28 = 8;
                        }
                        jb1Var6.setVisibility(i28);
                        jb1 jb1Var7 = this.N1;
                        if (this.l1.a()) {
                            f19 = 1.0f;
                        } else {
                            f19 = 0.0f;
                        }
                        jb1Var7.setAlpha(f19);
                        jb1 jb1Var8 = this.N1;
                        if (this.l1.a()) {
                            f20 = this.f40764j1;
                        } else {
                            f20 = 0.0f;
                        }
                        jb1Var8.d(f20);
                    }
                }
            }
            rect = new Rect();
            Drawable drawableMutate3 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            this.f40778r = drawableMutate3;
            drawableMutate3.getPadding(rect);
            this.f40778r.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6), PorterDuff.Mode.MULTIPLY));
            textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            obj = this.f40795x1;
            if (i10 != 1) {
                if (obj instanceof wh1) {
                }
                i14 = 3;
            } else {
                if (obj instanceof wh1) {
                }
                i14 = 3;
            }
            strArr = new String[i14];
            iArr = new int[i14];
            this.F0 = new org.telegram.ui.Components.q71[i14];
            if (i14 != 0) {
                this.f40786u0 = new FrameLayout(context);
                if (i10 != 1) {
                    strArr[0] = LocaleController.getString(R.string.BackgroundColors);
                    strArr[1] = LocaleController.getString(R.string.BackgroundPattern);
                    strArr[2] = LocaleController.getString(R.string.BackgroundMotion);
                } else {
                    strArr[0] = LocaleController.getString(R.string.BackgroundColors);
                    strArr[1] = LocaleController.getString(R.string.BackgroundPattern);
                    strArr[2] = LocaleController.getString(R.string.BackgroundMotion);
                }
                iMax = 0;
                i25 = 0;
                while (i25 < i14) {
                    int iCeil3 = (int) Math.ceil(textPaint.measureText(strArr[i25]));
                    iArr[i25] = iCeil3;
                    iMax = Math.max(iMax, iCeil3);
                    i25++;
                    rect = rect;
                }
                rect2 = rect;
                kb1 kb1Var12 = new kb1(this, context, 0);
                this.f40799z0 = kb1Var12;
                kb1Var12.setWillNotDraw(false);
                kb1 kb1Var13 = this.f40799z0;
                if (this.X0 != 0) {
                    i26 = 0;
                } else {
                    i26 = 4;
                }
                kb1Var13.setVisibility(i26);
                kb1 kb1Var14 = this.f40799z0;
                if (this.X0 != 0) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.1f;
                }
                kb1Var14.setScaleX(f16);
                kb1 kb1Var15 = this.f40799z0;
                if (this.X0 != 0) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.1f;
                }
                kb1Var15.setScaleY(f17);
                kb1 kb1Var16 = this.f40799z0;
                if (this.X0 != 0) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                kb1Var16.setAlpha(f18);
                kb1 kb1Var17 = this.f40799z0;
                if (this.X0 != 0) {
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                kb1Var17.setTag(obj2);
                this.f40786u0.addView(this.f40799z0, h7.z5.e(48, 48, 17));
                this.f40799z0.setOnClickListener(new lb1(this, i35));
                ImageView imageView3 = new ImageView(context);
                this.B0 = imageView3;
                imageView3.setScaleType(ImageView.ScaleType.CENTER);
                this.B0.setImageResource(R.drawable.bg_rotate_large);
                this.f40799z0.addView(this.B0, h7.z5.e(-2, -2, 17));
            } else {
                rect2 = rect;
                iMax = 0;
            }
            i15 = 0;
            while (true) {
                mb1Var = this.f40735a;
                if (i15 >= i14) {
                    break;
                    break;
                }
                this.F0[i15] = new org.telegram.ui.Components.q71(context, (i10 == 1 && !(this.f40795x1 instanceof wh1)) || i15 != 0, this.f40784t0, mb1Var);
                this.F0[i15].setBackgroundColor(this.V0);
                q71Var2 = this.F0[i15];
                String str3 = strArr[i15];
                int i411 = iArr[i15];
                q71Var2.f31824f = str3;
                q71Var2.h = i411;
                q71Var2.f31825n = iMax;
                i24 = 1;
                if (i10 == 1) {
                    if (i15 == i24) {
                        if (this.S0 == null) {
                            z12 = true;
                        } else {
                            z12 = true;
                        }
                        q71Var2.a(z12, false);
                    } else if (i15 == 2) {
                        q71Var2.a(this.A1, false);
                    }
                } else if (this.f40795x1 instanceof wh1) {
                    i24 = 1;
                    if (i15 == i24) {
                        if (this.S0 == null) {
                            z12 = true;
                        } else {
                            z12 = true;
                        }
                        q71Var2.a(z12, false);
                    } else if (i15 == 2) {
                        q71Var2.a(this.A1, false);
                    }
                } else {
                    if (i15 == 0) {
                        z13 = this.B1;
                    } else {
                        z13 = this.A1;
                    }
                    q71Var2.a(z13, false);
                }
                iDp3 = AndroidUtilities.dp(56.0f) + iMax;
                layoutParams2 = new FrameLayout.LayoutParams(iDp3, -2);
                layoutParams2.gravity = 17;
                if (i14 == 3) {
                    if (i15 != 0) {
                        layoutParams2.leftMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                    } else {
                        layoutParams2.leftMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                    }
                } else if (i15 == 1) {
                    layoutParams2.leftMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                } else {
                    layoutParams2.rightMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                }
                this.f40786u0.addView(this.F0[i15], layoutParams2);
                final org.telegram.ui.Components.q71 q71Var5 = this.F0[i15];
                final int i412 = 0;
                q71Var5.setOnClickListener(new View.OnClickListener(this) {

                    public final nc1 f36771b;

                    {
                        this.f36771b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i412) {
                            case 0:
                                nc1 nc1Var = this.f36771b;
                                int i413 = nc1Var.f40738b;
                                FrameLayout[] frameLayoutArr = nc1Var.H0;
                                if (nc1Var.f40786u0.getAlpha() == 1.0f && nc1Var.f40771n1 == null) {
                                    int i414 = i15;
                                    org.telegram.ui.Components.q71 q71Var6 = q71Var5;
                                    if ((i413 == 1 || (nc1Var.f40795x1 instanceof wh1)) && i414 == 2) {
                                        q71Var6.a(!q71Var6.f31827s, true);
                                        boolean z17 = q71Var6.f31827s;
                                        nc1Var.A1 = z17;
                                        nc1Var.f40780r1.c(z17);
                                        nc1Var.M0();
                                    } else if (i414 == 1 && (i413 == 1 || (nc1Var.f40795x1 instanceof wh1))) {
                                        if (nc1Var.F0[1].f31827s) {
                                            nc1Var.U0 = nc1Var.S0;
                                            nc1Var.f40784t0.setImageDrawable(null);
                                            nc1Var.S0 = null;
                                            nc1Var.A1 = false;
                                            nc1Var.j1();
                                            nc1Var.M0();
                                            if (frameLayoutArr[1].getVisibility() == 0) {
                                                if (i413 == 1) {
                                                    nc1Var.f1(0, true, true);
                                                } else {
                                                    nc1Var.f1(i414, frameLayoutArr[i414].getVisibility() != 0, true);
                                                }
                                            }
                                        } else {
                                            nc1Var.Z0(nc1Var.U0 != null ? -1 : 0);
                                            if (i413 == 1) {
                                                nc1Var.f1(1, true, true);
                                            } else {
                                                nc1Var.f1(i414, frameLayoutArr[i414].getVisibility() != 0, true);
                                            }
                                        }
                                        nc1Var.F0[1].a(nc1Var.S0 != null, true);
                                        nc1Var.n1();
                                        nc1Var.L0.f1();
                                        nc1Var.l1();
                                    } else if (nc1Var.f40795x1 instanceof wh1) {
                                        nc1Var.f1(i414, frameLayoutArr[i414].getVisibility() != 0, true);
                                    } else if (i413 != 1) {
                                        q71Var6.a(!q71Var6.f31827s, true);
                                        if (i414 != 0) {
                                            boolean z18 = q71Var6.f31827s;
                                            nc1Var.A1 = z18;
                                            nc1Var.f40780r1.c(z18);
                                            nc1Var.M0();
                                        } else {
                                            boolean z19 = q71Var6.f31827s;
                                            nc1Var.B1 = z19;
                                            if (z19) {
                                                nc1Var.f40784t0.getImageReceiver().setForceCrossfade(true);
                                            }
                                            nc1Var.i1();
                                        }
                                    }
                                    break;
                                }
                                break;
                            default:
                                nc1 nc1Var2 = this.f36771b;
                                if (nc1Var2.f40788v0.getAlpha() == 1.0f && i15 == 0) {
                                    org.telegram.ui.Components.q71 q71Var7 = q71Var5;
                                    q71Var7.a(!q71Var7.f31827s, true);
                                    nc1Var2.f40781s.f22889i = q71Var7.f31827s;
                                    org.telegram.ui.ActionBar.g6.n1(true, true);
                                    nc1Var2.f40776q0.f1();
                                }
                                break;
                        }
                    }
                });
                if (i15 == 2) {
                    this.F0[i15].setAlpha(0.0f);
                    this.F0[i15].setVisibility(4);
                }
                i15++;
            }
            if (i10 == 1) {
                iArr2 = new int[2];
                this.G0 = new org.telegram.ui.Components.q71[2];
                this.f40788v0 = new FrameLayout(context);
                strArr2 = new String[]{LocaleController.getString(R.string.BackgroundAnimate), LocaleController.getString(R.string.BackgroundColors)};
                i21 = 0;
                iMax2 = 0;
                while (i21 < i20) {
                    int iCeil4 = (int) Math.ceil(textPaint.measureText(strArr2[i21]));
                    iArr2[i21] = iCeil4;
                    iMax2 = Math.max(iMax2, iCeil4);
                    i21++;
                }
                if (e6Var != null) {
                    kb1 kb1Var18 = new kb1(this, context, 1);
                    this.A0 = kb1Var18;
                    kb1Var18.setWillNotDraw(false);
                    kb1 kb1Var19 = this.A0;
                    if (e6Var.f22887f != 0) {
                        i22 = 0;
                    } else {
                        i22 = 4;
                    }
                    kb1Var19.setVisibility(i22);
                    kb1 kb1Var20 = this.A0;
                    if (e6Var.f22887f != 0) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.1f;
                    }
                    kb1Var20.setScaleX(f13);
                    kb1 kb1Var110 = this.A0;
                    if (e6Var.f22887f != 0) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.1f;
                    }
                    kb1Var110.setScaleY(f14);
                    kb1 kb1Var111 = this.A0;
                    if (e6Var.f22887f != 0) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    kb1Var111.setAlpha(f15);
                    this.f40788v0.addView(this.A0, h7.z5.e(48, 48, 17));
                    this.A0.setOnClickListener(new lb1(this, 1));
                    ImageView imageView4 = new ImageView(context);
                    this.C0 = imageView4;
                    imageView4.setScaleType(ImageView.ScaleType.CENTER);
                    this.C0.setImageResource(R.drawable.bg_rotate_large);
                    this.A0.addView(this.C0, h7.z5.e(-2, -2, 17));
                    while (i23 < 2) {
                        org.telegram.ui.Components.q71[] q71VarArr2 = this.G0;
                        if (i23 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        q71VarArr2[i23] = new org.telegram.ui.Components.q71(context, z11, this.f40784t0, mb1Var);
                        q71Var = this.G0[i23];
                        String str4 = strArr2[i23];
                        int i413 = iArr2[i23];
                        q71Var.f31824f = str4;
                        q71Var.h = i413;
                        q71Var.f31825n = iMax2;
                        if (i23 == 0) {
                            q71Var.a(e6Var.f22889i, false);
                        }
                        iDp2 = AndroidUtilities.dp(56.0f) + iMax2;
                        layoutParams = new FrameLayout.LayoutParams(iDp2, -2);
                        layoutParams.gravity = 17;
                        if (i23 == 1) {
                            layoutParams.leftMargin = AndroidUtilities.dp(10.0f) + (iDp2 / 2);
                        } else {
                            layoutParams.rightMargin = AndroidUtilities.dp(10.0f) + (iDp2 / 2);
                        }
                        this.f40788v0.addView(this.G0[i23], layoutParams);
                        final org.telegram.ui.Components.q71 q71Var6 = this.G0[i23];
                        final int i414 = 1;
                        q71Var6.setOnClickListener(new View.OnClickListener(this) {

                            public final nc1 f36771b;

                            {
                                this.f36771b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i414) {
                                    case 0:
                                        nc1 nc1Var = this.f36771b;
                                        int i415 = nc1Var.f40738b;
                                        FrameLayout[] frameLayoutArr = nc1Var.H0;
                                        if (nc1Var.f40786u0.getAlpha() == 1.0f && nc1Var.f40771n1 == null) {
                                            int i416 = i23;
                                            org.telegram.ui.Components.q71 q71Var7 = q71Var6;
                                            if ((i415 == 1 || (nc1Var.f40795x1 instanceof wh1)) && i416 == 2) {
                                                q71Var7.a(!q71Var7.f31827s, true);
                                                boolean z17 = q71Var7.f31827s;
                                                nc1Var.A1 = z17;
                                                nc1Var.f40780r1.c(z17);
                                                nc1Var.M0();
                                            } else if (i416 == 1 && (i415 == 1 || (nc1Var.f40795x1 instanceof wh1))) {
                                                if (nc1Var.F0[1].f31827s) {
                                                    nc1Var.U0 = nc1Var.S0;
                                                    nc1Var.f40784t0.setImageDrawable(null);
                                                    nc1Var.S0 = null;
                                                    nc1Var.A1 = false;
                                                    nc1Var.j1();
                                                    nc1Var.M0();
                                                    if (frameLayoutArr[1].getVisibility() == 0) {
                                                        if (i415 == 1) {
                                                            nc1Var.f1(0, true, true);
                                                        } else {
                                                            nc1Var.f1(i416, frameLayoutArr[i416].getVisibility() != 0, true);
                                                        }
                                                    }
                                                } else {
                                                    nc1Var.Z0(nc1Var.U0 != null ? -1 : 0);
                                                    if (i415 == 1) {
                                                        nc1Var.f1(1, true, true);
                                                    } else {
                                                        nc1Var.f1(i416, frameLayoutArr[i416].getVisibility() != 0, true);
                                                    }
                                                }
                                                nc1Var.F0[1].a(nc1Var.S0 != null, true);
                                                nc1Var.n1();
                                                nc1Var.L0.f1();
                                                nc1Var.l1();
                                            } else if (nc1Var.f40795x1 instanceof wh1) {
                                                nc1Var.f1(i416, frameLayoutArr[i416].getVisibility() != 0, true);
                                            } else if (i415 != 1) {
                                                q71Var7.a(!q71Var7.f31827s, true);
                                                if (i416 != 0) {
                                                    boolean z18 = q71Var7.f31827s;
                                                    nc1Var.A1 = z18;
                                                    nc1Var.f40780r1.c(z18);
                                                    nc1Var.M0();
                                                } else {
                                                    boolean z19 = q71Var7.f31827s;
                                                    nc1Var.B1 = z19;
                                                    if (z19) {
                                                        nc1Var.f40784t0.getImageReceiver().setForceCrossfade(true);
                                                    }
                                                    nc1Var.i1();
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        nc1 nc1Var2 = this.f36771b;
                                        if (nc1Var2.f40788v0.getAlpha() == 1.0f && i23 == 0) {
                                            org.telegram.ui.Components.q71 q71Var8 = q71Var6;
                                            q71Var8.a(!q71Var8.f31827s, true);
                                            nc1Var2.f40781s.f22889i = q71Var8.f31827s;
                                            org.telegram.ui.ActionBar.g6.n1(true, true);
                                            nc1Var2.f40776q0.f1();
                                        }
                                        break;
                                }
                            }
                        });
                    }
                }
            }
            if (i10 != 1) {
                this.B1 = false;
                i16 = 0;
                while (i16 < 2) {
                    rect2 = rect2;
                    nb1Var = new nb1(this, context, i16, rect2);
                    viewGroupArr = this.H0;
                    viewGroupArr[i16] = nb1Var;
                    if (i16 != 1) {
                        nb1Var.setVisibility(4);
                    } else {
                        nb1Var.setVisibility(4);
                    }
                    viewGroupArr[i16].setWillNotDraw(false);
                    if (i10 == 2) {
                    }
                    if (i16 == 0) {
                        f11 = i10 == 2 ? 321 : 273;
                    } else {
                        f11 = 316.0f;
                    }
                    layoutParamsE.height = AndroidUtilities.dp(f11);
                    if (U0()) {
                        layoutParamsE.height += AndroidUtilities.navigationBarHeight;
                    }
                    if (i16 == 0) {
                        Drawable drawable2 = this.f40778r;
                        Rect rect4 = AndroidUtilities.rectTmp2;
                        drawable2.getPadding(rect4);
                        layoutParamsE.height = AndroidUtilities.dp(12.0f) + rect4.top + layoutParamsE.height;
                    }
                    ViewGroup viewGroup2 = viewGroupArr[i16];
                    if (i16 == 0) {
                        iDp = AndroidUtilities.dp(12.0f) + rect2.top;
                    } else {
                        iDp = 0;
                    }
                    if (U0()) {
                        i17 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i17 = 0;
                    }
                    viewGroup2.setPadding(0, iDp, 0, i17);
                    this.f40774p0.addView(viewGroupArr[i16], layoutParamsE);
                    if (i16 != 1) {
                        ag.y1 y1Var5 = new ag.y1(this, context, 27);
                        ViewGroup[] viewGroupArr3 = this.K0;
                        viewGroupArr3[i16] = y1Var5;
                        y1Var5.setWillNotDraw(false);
                        viewGroupArr3[i16].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        viewGroupArr3[i16].setClickable(true);
                        f12 = 21.0f;
                        viewGroupArr[i16].addView(viewGroupArr3[i16], h7.z5.e(-1, 51, 80));
                        TextView textView13 = new TextView(context);
                        TextView[] textViewArr3 = this.I0;
                        textViewArr3[i16] = textView13;
                        textView13.setTextSize(1, 15.0f);
                        textViewArr3[i16].setTypeface(AndroidUtilities.bold());
                        TextView textView14 = textViewArr3[i16];
                        int i415 = org.telegram.ui.ActionBar.g6.Ae;
                        textView14.setTextColor(getThemedColor(i415));
                        textViewArr3[i16].setText(LocaleController.getString(R.string.Cancel));
                        textViewArr3[i16].setGravity(17);
                        textViewArr3[i16].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView15 = textViewArr3[i16];
                        int i416 = org.telegram.ui.ActionBar.g6.f23144i6;
                        textView15.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(getThemedColor(i416), 0));
                        viewGroupArr3[i16].addView(textViewArr3[i16], h7.z5.e(-2, -1, 51));
                        final int i417 = 0;
                        textViewArr3[i16].setOnClickListener(new View.OnClickListener(this) {

                            public final nc1 f38066b;

                            {
                                this.f38066b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i417) {
                                    case 0:
                                        nc1 nc1Var = this.f38066b;
                                        if (nc1Var.f40771n1 == null) {
                                            int i418 = i16;
                                            if (i418 == 0) {
                                                nc1Var.f40747d1 = nc1Var.f40751e1;
                                                nc1Var.a1(nc1Var.f40744c1, 3, true);
                                                nc1Var.a1(nc1Var.f40740b1, 2, true);
                                                nc1Var.a1(nc1Var.f40737a1, 1, true);
                                                nc1Var.a1(nc1Var.W0, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = nc1Var.T0;
                                                nc1Var.S0 = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    nc1Var.f40784t0.setImageDrawable(null);
                                                } else {
                                                    cc1 cc1Var2 = nc1Var.f40784t0;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str5 = nc1Var.C1;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = nc1Var.S0;
                                                    cc1Var2.k(forDocument, str5, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                }
                                                nc1Var.F0[1].a(nc1Var.S0 != null, false);
                                                float f22 = nc1Var.f40762i1;
                                                nc1Var.f40760h1 = f22;
                                                nc1Var.P0.setProgress(f22);
                                                nc1Var.f40784t0.getImageReceiver().setAlpha(nc1Var.f40760h1);
                                                nc1Var.j1();
                                                nc1Var.n1();
                                            }
                                            if (nc1Var.f40738b != 2) {
                                                if (nc1Var.S0 == null) {
                                                    if (nc1Var.A1) {
                                                        nc1Var.A1 = false;
                                                        nc1Var.F0[0].a(false, true);
                                                        nc1Var.M0();
                                                    }
                                                    nc1Var.l1();
                                                }
                                                nc1Var.f1(0, true, true);
                                            } else {
                                                nc1Var.f1(i418, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        nc1 nc1Var2 = this.f38066b;
                                        if (nc1Var2.f40771n1 == null) {
                                            if (nc1Var2.f40738b != 2) {
                                                nc1Var2.f1(0, true, true);
                                            } else {
                                                nc1Var2.f1(i16, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        TextView textView16 = new TextView(context);
                        TextView[] textViewArr4 = this.J0;
                        textViewArr4[i16] = textView16;
                        textView16.setTextSize(1, 15.0f);
                        textViewArr4[i16].setTypeface(AndroidUtilities.bold());
                        textViewArr4[i16].setTextColor(getThemedColor(i415));
                        textViewArr4[i16].setText(LocaleController.getString(R.string.ApplyTheme));
                        textViewArr4[i16].setGravity(17);
                        textViewArr4[i16].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        textViewArr4[i16].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(getThemedColor(i416), 0));
                        viewGroupArr3[i16].addView(textViewArr4[i16], h7.z5.e(-2, -1, 53));
                        TextView textView17 = textViewArr4[i16];
                        r12 = 1;
                        final int c11 = 1 == true ? 1 : 0;
                        textView17.setOnClickListener(new View.OnClickListener(this) {

                            public final nc1 f38066b;

                            {
                                this.f38066b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (c11) {
                                    case 0:
                                        nc1 nc1Var = this.f38066b;
                                        if (nc1Var.f40771n1 == null) {
                                            int i418 = i16;
                                            if (i418 == 0) {
                                                nc1Var.f40747d1 = nc1Var.f40751e1;
                                                nc1Var.a1(nc1Var.f40744c1, 3, true);
                                                nc1Var.a1(nc1Var.f40740b1, 2, true);
                                                nc1Var.a1(nc1Var.f40737a1, 1, true);
                                                nc1Var.a1(nc1Var.W0, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = nc1Var.T0;
                                                nc1Var.S0 = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    nc1Var.f40784t0.setImageDrawable(null);
                                                } else {
                                                    cc1 cc1Var2 = nc1Var.f40784t0;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str5 = nc1Var.C1;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = nc1Var.S0;
                                                    cc1Var2.k(forDocument, str5, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                }
                                                nc1Var.F0[1].a(nc1Var.S0 != null, false);
                                                float f22 = nc1Var.f40762i1;
                                                nc1Var.f40760h1 = f22;
                                                nc1Var.P0.setProgress(f22);
                                                nc1Var.f40784t0.getImageReceiver().setAlpha(nc1Var.f40760h1);
                                                nc1Var.j1();
                                                nc1Var.n1();
                                            }
                                            if (nc1Var.f40738b != 2) {
                                                if (nc1Var.S0 == null) {
                                                    if (nc1Var.A1) {
                                                        nc1Var.A1 = false;
                                                        nc1Var.F0[0].a(false, true);
                                                        nc1Var.M0();
                                                    }
                                                    nc1Var.l1();
                                                }
                                                nc1Var.f1(0, true, true);
                                            } else {
                                                nc1Var.f1(i418, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        nc1 nc1Var2 = this.f38066b;
                                        if (nc1Var2.f40771n1 == null) {
                                            if (nc1Var2.f40738b != 2) {
                                                nc1Var2.f1(0, true, true);
                                            } else {
                                                nc1Var2.f1(i16, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        ag.y1 y1Var6 = new ag.y1(this, context, 27);
                        ViewGroup[] viewGroupArr4 = this.K0;
                        viewGroupArr4[i16] = y1Var6;
                        y1Var6.setWillNotDraw(false);
                        viewGroupArr4[i16].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        viewGroupArr4[i16].setClickable(true);
                        f12 = 21.0f;
                        viewGroupArr[i16].addView(viewGroupArr4[i16], h7.z5.e(-1, 51, 80));
                        TextView textView18 = new TextView(context);
                        TextView[] textViewArr5 = this.I0;
                        textViewArr5[i16] = textView18;
                        textView18.setTextSize(1, 15.0f);
                        textViewArr5[i16].setTypeface(AndroidUtilities.bold());
                        TextView textView19 = textViewArr5[i16];
                        int i418 = org.telegram.ui.ActionBar.g6.Ae;
                        textView19.setTextColor(getThemedColor(i418));
                        textViewArr5[i16].setText(LocaleController.getString(R.string.Cancel));
                        textViewArr5[i16].setGravity(17);
                        textViewArr5[i16].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView110 = textViewArr5[i16];
                        int i419 = org.telegram.ui.ActionBar.g6.f23144i6;
                        textView110.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(getThemedColor(i419), 0));
                        viewGroupArr4[i16].addView(textViewArr5[i16], h7.z5.e(-2, -1, 51));
                        final int i4110 = 0;
                        textViewArr5[i16].setOnClickListener(new View.OnClickListener(this) {

                            public final nc1 f38066b;

                            {
                                this.f38066b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i4110) {
                                    case 0:
                                        nc1 nc1Var = this.f38066b;
                                        if (nc1Var.f40771n1 == null) {
                                            int i4111 = i16;
                                            if (i4111 == 0) {
                                                nc1Var.f40747d1 = nc1Var.f40751e1;
                                                nc1Var.a1(nc1Var.f40744c1, 3, true);
                                                nc1Var.a1(nc1Var.f40740b1, 2, true);
                                                nc1Var.a1(nc1Var.f40737a1, 1, true);
                                                nc1Var.a1(nc1Var.W0, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = nc1Var.T0;
                                                nc1Var.S0 = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    nc1Var.f40784t0.setImageDrawable(null);
                                                } else {
                                                    cc1 cc1Var2 = nc1Var.f40784t0;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str5 = nc1Var.C1;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = nc1Var.S0;
                                                    cc1Var2.k(forDocument, str5, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                }
                                                nc1Var.F0[1].a(nc1Var.S0 != null, false);
                                                float f22 = nc1Var.f40762i1;
                                                nc1Var.f40760h1 = f22;
                                                nc1Var.P0.setProgress(f22);
                                                nc1Var.f40784t0.getImageReceiver().setAlpha(nc1Var.f40760h1);
                                                nc1Var.j1();
                                                nc1Var.n1();
                                            }
                                            if (nc1Var.f40738b != 2) {
                                                if (nc1Var.S0 == null) {
                                                    if (nc1Var.A1) {
                                                        nc1Var.A1 = false;
                                                        nc1Var.F0[0].a(false, true);
                                                        nc1Var.M0();
                                                    }
                                                    nc1Var.l1();
                                                }
                                                nc1Var.f1(0, true, true);
                                            } else {
                                                nc1Var.f1(i4111, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        nc1 nc1Var2 = this.f38066b;
                                        if (nc1Var2.f40771n1 == null) {
                                            if (nc1Var2.f40738b != 2) {
                                                nc1Var2.f1(0, true, true);
                                            } else {
                                                nc1Var2.f1(i16, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        TextView textView111 = new TextView(context);
                        TextView[] textViewArr6 = this.J0;
                        textViewArr6[i16] = textView111;
                        textView111.setTextSize(1, 15.0f);
                        textViewArr6[i16].setTypeface(AndroidUtilities.bold());
                        textViewArr6[i16].setTextColor(getThemedColor(i418));
                        textViewArr6[i16].setText(LocaleController.getString(R.string.ApplyTheme));
                        textViewArr6[i16].setGravity(17);
                        textViewArr6[i16].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        textViewArr6[i16].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(getThemedColor(i419), 0));
                        viewGroupArr4[i16].addView(textViewArr6[i16], h7.z5.e(-2, -1, 53));
                        TextView textView112 = textViewArr6[i16];
                        r12 = 1;
                        final int c12 = 1 == true ? 1 : 0;
                        textView112.setOnClickListener(new View.OnClickListener(this) {

                            public final nc1 f38066b;

                            {
                                this.f38066b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (c12) {
                                    case 0:
                                        nc1 nc1Var = this.f38066b;
                                        if (nc1Var.f40771n1 == null) {
                                            int i4111 = i16;
                                            if (i4111 == 0) {
                                                nc1Var.f40747d1 = nc1Var.f40751e1;
                                                nc1Var.a1(nc1Var.f40744c1, 3, true);
                                                nc1Var.a1(nc1Var.f40740b1, 2, true);
                                                nc1Var.a1(nc1Var.f40737a1, 1, true);
                                                nc1Var.a1(nc1Var.W0, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = nc1Var.T0;
                                                nc1Var.S0 = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    nc1Var.f40784t0.setImageDrawable(null);
                                                } else {
                                                    cc1 cc1Var2 = nc1Var.f40784t0;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str5 = nc1Var.C1;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = nc1Var.S0;
                                                    cc1Var2.k(forDocument, str5, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                }
                                                nc1Var.F0[1].a(nc1Var.S0 != null, false);
                                                float f22 = nc1Var.f40762i1;
                                                nc1Var.f40760h1 = f22;
                                                nc1Var.P0.setProgress(f22);
                                                nc1Var.f40784t0.getImageReceiver().setAlpha(nc1Var.f40760h1);
                                                nc1Var.j1();
                                                nc1Var.n1();
                                            }
                                            if (nc1Var.f40738b != 2) {
                                                if (nc1Var.S0 == null) {
                                                    if (nc1Var.A1) {
                                                        nc1Var.A1 = false;
                                                        nc1Var.F0[0].a(false, true);
                                                        nc1Var.M0();
                                                    }
                                                    nc1Var.l1();
                                                }
                                                nc1Var.f1(0, true, true);
                                            } else {
                                                nc1Var.f1(i4111, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        nc1 nc1Var2 = this.f38066b;
                                        if (nc1Var2.f40771n1 == null) {
                                            if (nc1Var2.f40738b != 2) {
                                                nc1Var2.f1(0, true, true);
                                            } else {
                                                nc1Var2.f1(i16, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    if (i16 == r12) {
                        TextView textView20 = new TextView(context);
                        this.a2 = textView20;
                        textView20.setLines(r12);
                        this.a2.setSingleLine(r12);
                        this.a2.setText(LocaleController.getString(R.string.BackgroundChoosePattern));
                        this.a2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                        this.a2.setTextSize(r12, 20.0f);
                        this.a2.setTypeface(AndroidUtilities.bold());
                        this.a2.setPadding(AndroidUtilities.dp(f12), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(f12), AndroidUtilities.dp(8.0f));
                        this.a2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                        this.a2.setGravity(16);
                        viewGroupArr[i16].addView(this.a2, h7.z5.d(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                        ta1 ta1Var3 = new ta1(context);
                        this.L0 = ta1Var3;
                        f2.k0 k0Var2 = new f2.k0(0, false);
                        this.N0 = k0Var2;
                        ta1Var3.setLayoutManager(k0Var2);
                        ta1 ta1Var4 = this.L0;
                        lc1 lc1Var2 = new lc1(context, this);
                        this.M0 = lc1Var2;
                        ta1Var4.setAdapter(lc1Var2);
                        this.L0.i(new jh.j(7));
                        viewGroupArr[i16].addView(this.L0, h7.z5.d(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                        this.L0.setOnItemClickListener(new b21(this, 6));
                        org.telegram.ui.Cells.j4 j4Var2 = new org.telegram.ui.Cells.j4(context);
                        this.O0 = j4Var2;
                        j4Var2.setText(LocaleController.getString(R.string.BackgroundIntensity));
                        viewGroupArr[i16].addView(this.O0, h7.z5.d(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                        org.telegram.ui.Cells.j0 j0Var2 = new org.telegram.ui.Cells.j0(context, (mb1) getResourceProvider());
                        this.P0 = j0Var2;
                        j0Var2.setProgress(this.f40760h1);
                        this.P0.setReportChanges(true);
                        this.P0.setDelegate(new ob1(this));
                        viewGroupArr[i16].addView(this.P0, h7.z5.d(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                    } else {
                        org.telegram.ui.Components.aq aqVar3 = new org.telegram.ui.Components.aq(context, this.f40743c0, new pb1(this));
                        this.R = aqVar3;
                        aqVar3.setResourcesProvider(getResourceProvider());
                        if (i10 == 1) {
                            viewGroupArr[i16].addView(this.R, h7.z5.e(-1, -1, 1));
                            if (f6Var.q()) {
                                this.R.setMinBrightness(0.2f);
                            } else {
                                this.R.setMinBrightness(0.05f);
                                this.R.setMaxBrightness(0.8f);
                            }
                            if (e6Var != null) {
                                if (e6Var.d != 0) {
                                    i18 = 2;
                                } else {
                                    i18 = 1;
                                }
                                org.telegram.ui.Components.aq aqVar4 = this.R;
                                T0(1);
                                aqVar4.f(1, 2, i18, false);
                                this.R.e(e6Var.f22885c, 0);
                                i19 = e6Var.d;
                                if (i19 != 0) {
                                    this.R.e(i19, 1);
                                }
                            }
                        } else {
                            viewGroupArr[i16].addView(this.R, h7.z5.d(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                        }
                    }
                    i16++;
                }
            } else {
                this.B1 = false;
                i16 = 0;
                while (i16 < 2) {
                    rect2 = rect2;
                    nb1Var = new nb1(this, context, i16, rect2);
                    viewGroupArr = this.H0;
                    viewGroupArr[i16] = nb1Var;
                    if (i16 != 1) {
                        nb1Var.setVisibility(4);
                    } else {
                        nb1Var.setVisibility(4);
                    }
                    viewGroupArr[i16].setWillNotDraw(false);
                    if (i10 == 2) {
                    }
                    if (i16 == 0) {
                        f11 = i10 == 2 ? 321 : 273;
                    } else {
                        f11 = 316.0f;
                    }
                    layoutParamsE.height = AndroidUtilities.dp(f11);
                    if (U0()) {
                        layoutParamsE.height += AndroidUtilities.navigationBarHeight;
                    }
                    if (i16 == 0) {
                        Drawable drawable3 = this.f40778r;
                        Rect rect5 = AndroidUtilities.rectTmp2;
                        drawable3.getPadding(rect5);
                        layoutParamsE.height = AndroidUtilities.dp(12.0f) + rect5.top + layoutParamsE.height;
                    }
                    ViewGroup viewGroup3 = viewGroupArr[i16];
                    if (i16 == 0) {
                        iDp = AndroidUtilities.dp(12.0f) + rect2.top;
                    } else {
                        iDp = 0;
                    }
                    if (U0()) {
                        i17 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i17 = 0;
                    }
                    viewGroup3.setPadding(0, iDp, 0, i17);
                    this.f40774p0.addView(viewGroupArr[i16], layoutParamsE);
                    if (i16 != 1) {
                        ag.y1 y1Var7 = new ag.y1(this, context, 27);
                        ViewGroup[] viewGroupArr5 = this.K0;
                        viewGroupArr5[i16] = y1Var7;
                        y1Var7.setWillNotDraw(false);
                        viewGroupArr5[i16].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        viewGroupArr5[i16].setClickable(true);
                        f12 = 21.0f;
                        viewGroupArr[i16].addView(viewGroupArr5[i16], h7.z5.e(-1, 51, 80));
                        TextView textView113 = new TextView(context);
                        TextView[] textViewArr7 = this.I0;
                        textViewArr7[i16] = textView113;
                        textView113.setTextSize(1, 15.0f);
                        textViewArr7[i16].setTypeface(AndroidUtilities.bold());
                        TextView textView114 = textViewArr7[i16];
                        int i4111 = org.telegram.ui.ActionBar.g6.Ae;
                        textView114.setTextColor(getThemedColor(i4111));
                        textViewArr7[i16].setText(LocaleController.getString(R.string.Cancel));
                        textViewArr7[i16].setGravity(17);
                        textViewArr7[i16].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView115 = textViewArr7[i16];
                        int i4112 = org.telegram.ui.ActionBar.g6.f23144i6;
                        textView115.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(getThemedColor(i4112), 0));
                        viewGroupArr5[i16].addView(textViewArr7[i16], h7.z5.e(-2, -1, 51));
                        final int i4113 = 0;
                        textViewArr7[i16].setOnClickListener(new View.OnClickListener(this) {

                            public final nc1 f38066b;

                            {
                                this.f38066b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i4113) {
                                    case 0:
                                        nc1 nc1Var = this.f38066b;
                                        if (nc1Var.f40771n1 == null) {
                                            int i4114 = i16;
                                            if (i4114 == 0) {
                                                nc1Var.f40747d1 = nc1Var.f40751e1;
                                                nc1Var.a1(nc1Var.f40744c1, 3, true);
                                                nc1Var.a1(nc1Var.f40740b1, 2, true);
                                                nc1Var.a1(nc1Var.f40737a1, 1, true);
                                                nc1Var.a1(nc1Var.W0, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = nc1Var.T0;
                                                nc1Var.S0 = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    nc1Var.f40784t0.setImageDrawable(null);
                                                } else {
                                                    cc1 cc1Var2 = nc1Var.f40784t0;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str5 = nc1Var.C1;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = nc1Var.S0;
                                                    cc1Var2.k(forDocument, str5, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                }
                                                nc1Var.F0[1].a(nc1Var.S0 != null, false);
                                                float f22 = nc1Var.f40762i1;
                                                nc1Var.f40760h1 = f22;
                                                nc1Var.P0.setProgress(f22);
                                                nc1Var.f40784t0.getImageReceiver().setAlpha(nc1Var.f40760h1);
                                                nc1Var.j1();
                                                nc1Var.n1();
                                            }
                                            if (nc1Var.f40738b != 2) {
                                                if (nc1Var.S0 == null) {
                                                    if (nc1Var.A1) {
                                                        nc1Var.A1 = false;
                                                        nc1Var.F0[0].a(false, true);
                                                        nc1Var.M0();
                                                    }
                                                    nc1Var.l1();
                                                }
                                                nc1Var.f1(0, true, true);
                                            } else {
                                                nc1Var.f1(i4114, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        nc1 nc1Var2 = this.f38066b;
                                        if (nc1Var2.f40771n1 == null) {
                                            if (nc1Var2.f40738b != 2) {
                                                nc1Var2.f1(0, true, true);
                                            } else {
                                                nc1Var2.f1(i16, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        TextView textView116 = new TextView(context);
                        TextView[] textViewArr8 = this.J0;
                        textViewArr8[i16] = textView116;
                        textView116.setTextSize(1, 15.0f);
                        textViewArr8[i16].setTypeface(AndroidUtilities.bold());
                        textViewArr8[i16].setTextColor(getThemedColor(i4111));
                        textViewArr8[i16].setText(LocaleController.getString(R.string.ApplyTheme));
                        textViewArr8[i16].setGravity(17);
                        textViewArr8[i16].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        textViewArr8[i16].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(getThemedColor(i4112), 0));
                        viewGroupArr5[i16].addView(textViewArr8[i16], h7.z5.e(-2, -1, 53));
                        TextView textView117 = textViewArr8[i16];
                        r12 = 1;
                        final int c13 = 1 == true ? 1 : 0;
                        textView117.setOnClickListener(new View.OnClickListener(this) {

                            public final nc1 f38066b;

                            {
                                this.f38066b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (c13) {
                                    case 0:
                                        nc1 nc1Var = this.f38066b;
                                        if (nc1Var.f40771n1 == null) {
                                            int i4114 = i16;
                                            if (i4114 == 0) {
                                                nc1Var.f40747d1 = nc1Var.f40751e1;
                                                nc1Var.a1(nc1Var.f40744c1, 3, true);
                                                nc1Var.a1(nc1Var.f40740b1, 2, true);
                                                nc1Var.a1(nc1Var.f40737a1, 1, true);
                                                nc1Var.a1(nc1Var.W0, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = nc1Var.T0;
                                                nc1Var.S0 = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    nc1Var.f40784t0.setImageDrawable(null);
                                                } else {
                                                    cc1 cc1Var2 = nc1Var.f40784t0;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str5 = nc1Var.C1;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = nc1Var.S0;
                                                    cc1Var2.k(forDocument, str5, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                }
                                                nc1Var.F0[1].a(nc1Var.S0 != null, false);
                                                float f22 = nc1Var.f40762i1;
                                                nc1Var.f40760h1 = f22;
                                                nc1Var.P0.setProgress(f22);
                                                nc1Var.f40784t0.getImageReceiver().setAlpha(nc1Var.f40760h1);
                                                nc1Var.j1();
                                                nc1Var.n1();
                                            }
                                            if (nc1Var.f40738b != 2) {
                                                if (nc1Var.S0 == null) {
                                                    if (nc1Var.A1) {
                                                        nc1Var.A1 = false;
                                                        nc1Var.F0[0].a(false, true);
                                                        nc1Var.M0();
                                                    }
                                                    nc1Var.l1();
                                                }
                                                nc1Var.f1(0, true, true);
                                            } else {
                                                nc1Var.f1(i4114, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        nc1 nc1Var2 = this.f38066b;
                                        if (nc1Var2.f40771n1 == null) {
                                            if (nc1Var2.f40738b != 2) {
                                                nc1Var2.f1(0, true, true);
                                            } else {
                                                nc1Var2.f1(i16, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        ag.y1 y1Var8 = new ag.y1(this, context, 27);
                        ViewGroup[] viewGroupArr6 = this.K0;
                        viewGroupArr6[i16] = y1Var8;
                        y1Var8.setWillNotDraw(false);
                        viewGroupArr6[i16].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        viewGroupArr6[i16].setClickable(true);
                        f12 = 21.0f;
                        viewGroupArr[i16].addView(viewGroupArr6[i16], h7.z5.e(-1, 51, 80));
                        TextView textView118 = new TextView(context);
                        TextView[] textViewArr9 = this.I0;
                        textViewArr9[i16] = textView118;
                        textView118.setTextSize(1, 15.0f);
                        textViewArr9[i16].setTypeface(AndroidUtilities.bold());
                        TextView textView119 = textViewArr9[i16];
                        int i4114 = org.telegram.ui.ActionBar.g6.Ae;
                        textView119.setTextColor(getThemedColor(i4114));
                        textViewArr9[i16].setText(LocaleController.getString(R.string.Cancel));
                        textViewArr9[i16].setGravity(17);
                        textViewArr9[i16].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView1110 = textViewArr9[i16];
                        int i4115 = org.telegram.ui.ActionBar.g6.f23144i6;
                        textView1110.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(getThemedColor(i4115), 0));
                        viewGroupArr6[i16].addView(textViewArr9[i16], h7.z5.e(-2, -1, 51));
                        final int i4116 = 0;
                        textViewArr9[i16].setOnClickListener(new View.OnClickListener(this) {

                            public final nc1 f38066b;

                            {
                                this.f38066b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i4116) {
                                    case 0:
                                        nc1 nc1Var = this.f38066b;
                                        if (nc1Var.f40771n1 == null) {
                                            int i4117 = i16;
                                            if (i4117 == 0) {
                                                nc1Var.f40747d1 = nc1Var.f40751e1;
                                                nc1Var.a1(nc1Var.f40744c1, 3, true);
                                                nc1Var.a1(nc1Var.f40740b1, 2, true);
                                                nc1Var.a1(nc1Var.f40737a1, 1, true);
                                                nc1Var.a1(nc1Var.W0, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = nc1Var.T0;
                                                nc1Var.S0 = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    nc1Var.f40784t0.setImageDrawable(null);
                                                } else {
                                                    cc1 cc1Var2 = nc1Var.f40784t0;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str5 = nc1Var.C1;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = nc1Var.S0;
                                                    cc1Var2.k(forDocument, str5, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                }
                                                nc1Var.F0[1].a(nc1Var.S0 != null, false);
                                                float f22 = nc1Var.f40762i1;
                                                nc1Var.f40760h1 = f22;
                                                nc1Var.P0.setProgress(f22);
                                                nc1Var.f40784t0.getImageReceiver().setAlpha(nc1Var.f40760h1);
                                                nc1Var.j1();
                                                nc1Var.n1();
                                            }
                                            if (nc1Var.f40738b != 2) {
                                                if (nc1Var.S0 == null) {
                                                    if (nc1Var.A1) {
                                                        nc1Var.A1 = false;
                                                        nc1Var.F0[0].a(false, true);
                                                        nc1Var.M0();
                                                    }
                                                    nc1Var.l1();
                                                }
                                                nc1Var.f1(0, true, true);
                                            } else {
                                                nc1Var.f1(i4117, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        nc1 nc1Var2 = this.f38066b;
                                        if (nc1Var2.f40771n1 == null) {
                                            if (nc1Var2.f40738b != 2) {
                                                nc1Var2.f1(0, true, true);
                                            } else {
                                                nc1Var2.f1(i16, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        TextView textView1111 = new TextView(context);
                        TextView[] textViewArr10 = this.J0;
                        textViewArr10[i16] = textView1111;
                        textView1111.setTextSize(1, 15.0f);
                        textViewArr10[i16].setTypeface(AndroidUtilities.bold());
                        textViewArr10[i16].setTextColor(getThemedColor(i4114));
                        textViewArr10[i16].setText(LocaleController.getString(R.string.ApplyTheme));
                        textViewArr10[i16].setGravity(17);
                        textViewArr10[i16].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        textViewArr10[i16].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(getThemedColor(i4115), 0));
                        viewGroupArr6[i16].addView(textViewArr10[i16], h7.z5.e(-2, -1, 53));
                        TextView textView1112 = textViewArr10[i16];
                        r12 = 1;
                        final int c14 = 1 == true ? 1 : 0;
                        textView1112.setOnClickListener(new View.OnClickListener(this) {

                            public final nc1 f38066b;

                            {
                                this.f38066b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (c14) {
                                    case 0:
                                        nc1 nc1Var = this.f38066b;
                                        if (nc1Var.f40771n1 == null) {
                                            int i4117 = i16;
                                            if (i4117 == 0) {
                                                nc1Var.f40747d1 = nc1Var.f40751e1;
                                                nc1Var.a1(nc1Var.f40744c1, 3, true);
                                                nc1Var.a1(nc1Var.f40740b1, 2, true);
                                                nc1Var.a1(nc1Var.f40737a1, 1, true);
                                                nc1Var.a1(nc1Var.W0, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = nc1Var.T0;
                                                nc1Var.S0 = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    nc1Var.f40784t0.setImageDrawable(null);
                                                } else {
                                                    cc1 cc1Var2 = nc1Var.f40784t0;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str5 = nc1Var.C1;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = nc1Var.S0;
                                                    cc1Var2.k(forDocument, str5, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                }
                                                nc1Var.F0[1].a(nc1Var.S0 != null, false);
                                                float f22 = nc1Var.f40762i1;
                                                nc1Var.f40760h1 = f22;
                                                nc1Var.P0.setProgress(f22);
                                                nc1Var.f40784t0.getImageReceiver().setAlpha(nc1Var.f40760h1);
                                                nc1Var.j1();
                                                nc1Var.n1();
                                            }
                                            if (nc1Var.f40738b != 2) {
                                                if (nc1Var.S0 == null) {
                                                    if (nc1Var.A1) {
                                                        nc1Var.A1 = false;
                                                        nc1Var.F0[0].a(false, true);
                                                        nc1Var.M0();
                                                    }
                                                    nc1Var.l1();
                                                }
                                                nc1Var.f1(0, true, true);
                                            } else {
                                                nc1Var.f1(i4117, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        nc1 nc1Var2 = this.f38066b;
                                        if (nc1Var2.f40771n1 == null) {
                                            if (nc1Var2.f40738b != 2) {
                                                nc1Var2.f1(0, true, true);
                                            } else {
                                                nc1Var2.f1(i16, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    if (i16 == r12) {
                        TextView textView21 = new TextView(context);
                        this.a2 = textView21;
                        textView21.setLines(r12);
                        this.a2.setSingleLine(r12);
                        this.a2.setText(LocaleController.getString(R.string.BackgroundChoosePattern));
                        this.a2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                        this.a2.setTextSize(r12, 20.0f);
                        this.a2.setTypeface(AndroidUtilities.bold());
                        this.a2.setPadding(AndroidUtilities.dp(f12), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(f12), AndroidUtilities.dp(8.0f));
                        this.a2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                        this.a2.setGravity(16);
                        viewGroupArr[i16].addView(this.a2, h7.z5.d(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                        ta1 ta1Var5 = new ta1(context);
                        this.L0 = ta1Var5;
                        f2.k0 k0Var3 = new f2.k0(0, false);
                        this.N0 = k0Var3;
                        ta1Var5.setLayoutManager(k0Var3);
                        ta1 ta1Var6 = this.L0;
                        lc1 lc1Var3 = new lc1(context, this);
                        this.M0 = lc1Var3;
                        ta1Var6.setAdapter(lc1Var3);
                        this.L0.i(new jh.j(7));
                        viewGroupArr[i16].addView(this.L0, h7.z5.d(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                        this.L0.setOnItemClickListener(new b21(this, 6));
                        org.telegram.ui.Cells.j4 j4Var3 = new org.telegram.ui.Cells.j4(context);
                        this.O0 = j4Var3;
                        j4Var3.setText(LocaleController.getString(R.string.BackgroundIntensity));
                        viewGroupArr[i16].addView(this.O0, h7.z5.d(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                        org.telegram.ui.Cells.j0 j0Var3 = new org.telegram.ui.Cells.j0(context, (mb1) getResourceProvider());
                        this.P0 = j0Var3;
                        j0Var3.setProgress(this.f40760h1);
                        this.P0.setReportChanges(true);
                        this.P0.setDelegate(new ob1(this));
                        viewGroupArr[i16].addView(this.P0, h7.z5.d(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                    } else {
                        org.telegram.ui.Components.aq aqVar5 = new org.telegram.ui.Components.aq(context, this.f40743c0, new pb1(this));
                        this.R = aqVar5;
                        aqVar5.setResourcesProvider(getResourceProvider());
                        if (i10 == 1) {
                            viewGroupArr[i16].addView(this.R, h7.z5.e(-1, -1, 1));
                            if (f6Var.q()) {
                                this.R.setMinBrightness(0.2f);
                            } else {
                                this.R.setMinBrightness(0.05f);
                                this.R.setMaxBrightness(0.8f);
                            }
                            if (e6Var != null) {
                                if (e6Var.d != 0) {
                                    i18 = 2;
                                } else {
                                    i18 = 1;
                                }
                                org.telegram.ui.Components.aq aqVar6 = this.R;
                                T0(1);
                                aqVar6.f(1, 2, i18, false);
                                this.R.e(e6Var.f22885c, 0);
                                i19 = e6Var.d;
                                if (i19 != 0) {
                                    this.R.e(i19, 1);
                                }
                            }
                        } else {
                            viewGroupArr[i16].addView(this.R, h7.z5.d(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                        }
                    }
                    i16++;
                }
            }
            j1();
            if (!this.f40784t0.getImageReceiver().hasBitmapImage()) {
                this.f40774p0.setBackgroundColor(-16777216);
            }
            if (i10 != 1) {
                this.f40784t0.getImageReceiver().setCrossfadeWithOldImage(true);
            }
        } else {
            if (i10 == 2) {
                u4 u4Var5 = new u4(this, context, U0());
                this.f40797y0 = u4Var5;
                u4Var5.setWillNotDraw(false);
                u4 u4Var6 = this.f40797y0;
                int iDp16 = AndroidUtilities.dp(12.0f);
                int iDp17 = AndroidUtilities.dp(12.0f);
                int iDp18 = AndroidUtilities.dp(12.0f);
                int iDp19 = AndroidUtilities.dp(12.0f);
                if (U0()) {
                    i27 = AndroidUtilities.navigationBarHeight;
                } else {
                    i27 = 0;
                }
                u4Var6.setPadding(iDp16, iDp17, iDp18, iDp19 + i27);
                this.f40774p0.addView(this.f40797y0, h7.z5.e(-1, 0, 81));
                dc1 dc1Var5 = new dc1(context, this);
                this.f40789v1 = dc1Var5;
                h7.b6.b(dc1Var5, 0.033f, 1.2f);
                h1(false);
                final int i4117 = 3;
                this.f40789v1.setOnClickListener(new View.OnClickListener(this) {

                    public final nc1 f45123b;

                    {
                        this.f45123b = this;
                    }

                    @Override
                    public final void onClick(View view2) throws Throwable {
                        switch (i4117) {
                            case 0:
                                this.f45123b.O0(false);
                                break;
                            case 1:
                                nc1.U(this.f45123b);
                                break;
                            case 2:
                                this.f45123b.f40749e.M(null, null);
                                break;
                            case 3:
                                this.f45123b.N0(false);
                                break;
                            default:
                                this.f45123b.N0(true);
                                break;
                        }
                    }
                });
                if (this.F1 > 0) {
                    this.f40797y0.addView(this.f40789v1, h7.z5.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                } else {
                    this.f40797y0.addView(this.f40789v1, h7.z5.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                }
                if (this.I1) {
                    ag.w wVar3 = new ag.w(this, (Activity) getContext());
                    this.M1 = wVar3;
                    wVar3.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
                    this.f40774p0.addView(this.M1, h7.z5.e(222, 76, 49));
                    jb1 jb1Var9 = new jb1((Activity) getContext());
                    this.N1 = jb1Var9;
                    jb1Var9.d(this.f40764j1);
                    this.N1.b();
                    this.N1.c(new x3(this, 21));
                    this.M1.addView(this.N1);
                    ec1Var = this.l1;
                    if (ec1Var != null) {
                        jb1 jb1Var10 = this.N1;
                        if (ec1Var.a()) {
                            i28 = 0;
                        } else {
                            i28 = 8;
                        }
                        jb1Var10.setVisibility(i28);
                        jb1 jb1Var11 = this.N1;
                        if (this.l1.a()) {
                            f19 = 1.0f;
                        } else {
                            f19 = 0.0f;
                        }
                        jb1Var11.setAlpha(f19);
                        jb1 jb1Var12 = this.N1;
                        if (this.l1.a()) {
                            f20 = this.f40764j1;
                        } else {
                            f20 = 0.0f;
                        }
                        jb1Var12.d(f20);
                    }
                }
            }
            rect = new Rect();
            Drawable drawableMutate4 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            this.f40778r = drawableMutate4;
            drawableMutate4.getPadding(rect);
            this.f40778r.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6), PorterDuff.Mode.MULTIPLY));
            textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            obj = this.f40795x1;
            if (i10 != 1) {
                if (obj instanceof wh1) {
                }
                i14 = 3;
            } else {
                if (obj instanceof wh1) {
                }
                i14 = 3;
            }
            strArr = new String[i14];
            iArr = new int[i14];
            this.F0 = new org.telegram.ui.Components.q71[i14];
            if (i14 != 0) {
                this.f40786u0 = new FrameLayout(context);
                if (i10 != 1) {
                    strArr[0] = LocaleController.getString(R.string.BackgroundColors);
                    strArr[1] = LocaleController.getString(R.string.BackgroundPattern);
                    strArr[2] = LocaleController.getString(R.string.BackgroundMotion);
                } else {
                    strArr[0] = LocaleController.getString(R.string.BackgroundColors);
                    strArr[1] = LocaleController.getString(R.string.BackgroundPattern);
                    strArr[2] = LocaleController.getString(R.string.BackgroundMotion);
                }
                iMax = 0;
                i25 = 0;
                while (i25 < i14) {
                    int iCeil5 = (int) Math.ceil(textPaint.measureText(strArr[i25]));
                    iArr[i25] = iCeil5;
                    iMax = Math.max(iMax, iCeil5);
                    i25++;
                    rect = rect;
                }
                rect2 = rect;
                kb1 kb1Var112 = new kb1(this, context, 0);
                this.f40799z0 = kb1Var112;
                kb1Var112.setWillNotDraw(false);
                kb1 kb1Var113 = this.f40799z0;
                if (this.X0 != 0) {
                    i26 = 0;
                } else {
                    i26 = 4;
                }
                kb1Var113.setVisibility(i26);
                kb1 kb1Var114 = this.f40799z0;
                if (this.X0 != 0) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.1f;
                }
                kb1Var114.setScaleX(f16);
                kb1 kb1Var115 = this.f40799z0;
                if (this.X0 != 0) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.1f;
                }
                kb1Var115.setScaleY(f17);
                kb1 kb1Var116 = this.f40799z0;
                if (this.X0 != 0) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                kb1Var116.setAlpha(f18);
                kb1 kb1Var117 = this.f40799z0;
                if (this.X0 != 0) {
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                kb1Var117.setTag(obj2);
                this.f40786u0.addView(this.f40799z0, h7.z5.e(48, 48, 17));
                this.f40799z0.setOnClickListener(new lb1(this, i35));
                ImageView imageView5 = new ImageView(context);
                this.B0 = imageView5;
                imageView5.setScaleType(ImageView.ScaleType.CENTER);
                this.B0.setImageResource(R.drawable.bg_rotate_large);
                this.f40799z0.addView(this.B0, h7.z5.e(-2, -2, 17));
            } else {
                rect2 = rect;
                iMax = 0;
            }
            i15 = 0;
            while (true) {
                mb1Var = this.f40735a;
                if (i15 >= i14) {
                    break;
                    break;
                }
                this.F0[i15] = new org.telegram.ui.Components.q71(context, (i10 == 1 && !(this.f40795x1 instanceof wh1)) || i15 != 0, this.f40784t0, mb1Var);
                this.F0[i15].setBackgroundColor(this.V0);
                q71Var2 = this.F0[i15];
                String str5 = strArr[i15];
                int i4118 = iArr[i15];
                q71Var2.f31824f = str5;
                q71Var2.h = i4118;
                q71Var2.f31825n = iMax;
                i24 = 1;
                if (i10 == 1) {
                    if (i15 == i24) {
                        if (this.S0 == null) {
                            z12 = true;
                        } else {
                            z12 = true;
                        }
                        q71Var2.a(z12, false);
                    } else if (i15 == 2) {
                        q71Var2.a(this.A1, false);
                    }
                } else if (this.f40795x1 instanceof wh1) {
                    i24 = 1;
                    if (i15 == i24) {
                        if (this.S0 == null) {
                            z12 = true;
                        } else {
                            z12 = true;
                        }
                        q71Var2.a(z12, false);
                    } else if (i15 == 2) {
                        q71Var2.a(this.A1, false);
                    }
                } else {
                    if (i15 == 0) {
                        z13 = this.B1;
                    } else {
                        z13 = this.A1;
                    }
                    q71Var2.a(z13, false);
                }
                iDp3 = AndroidUtilities.dp(56.0f) + iMax;
                layoutParams2 = new FrameLayout.LayoutParams(iDp3, -2);
                layoutParams2.gravity = 17;
                if (i14 == 3) {
                    if (i15 != 0) {
                        layoutParams2.leftMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                    } else {
                        layoutParams2.leftMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                    }
                } else if (i15 == 1) {
                    layoutParams2.leftMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                } else {
                    layoutParams2.rightMargin = AndroidUtilities.dp(10.0f) + (iDp3 / 2);
                }
                this.f40786u0.addView(this.F0[i15], layoutParams2);
                final org.telegram.ui.Components.q71 q71Var7 = this.F0[i15];
                final int i4119 = 0;
                q71Var7.setOnClickListener(new View.OnClickListener(this) {

                    public final nc1 f36771b;

                    {
                        this.f36771b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i4119) {
                            case 0:
                                nc1 nc1Var = this.f36771b;
                                int i4120 = nc1Var.f40738b;
                                FrameLayout[] frameLayoutArr = nc1Var.H0;
                                if (nc1Var.f40786u0.getAlpha() == 1.0f && nc1Var.f40771n1 == null) {
                                    int i4121 = i15;
                                    org.telegram.ui.Components.q71 q71Var8 = q71Var7;
                                    if ((i4120 == 1 || (nc1Var.f40795x1 instanceof wh1)) && i4121 == 2) {
                                        q71Var8.a(!q71Var8.f31827s, true);
                                        boolean z17 = q71Var8.f31827s;
                                        nc1Var.A1 = z17;
                                        nc1Var.f40780r1.c(z17);
                                        nc1Var.M0();
                                    } else if (i4121 == 1 && (i4120 == 1 || (nc1Var.f40795x1 instanceof wh1))) {
                                        if (nc1Var.F0[1].f31827s) {
                                            nc1Var.U0 = nc1Var.S0;
                                            nc1Var.f40784t0.setImageDrawable(null);
                                            nc1Var.S0 = null;
                                            nc1Var.A1 = false;
                                            nc1Var.j1();
                                            nc1Var.M0();
                                            if (frameLayoutArr[1].getVisibility() == 0) {
                                                if (i4120 == 1) {
                                                    nc1Var.f1(0, true, true);
                                                } else {
                                                    nc1Var.f1(i4121, frameLayoutArr[i4121].getVisibility() != 0, true);
                                                }
                                            }
                                        } else {
                                            nc1Var.Z0(nc1Var.U0 != null ? -1 : 0);
                                            if (i4120 == 1) {
                                                nc1Var.f1(1, true, true);
                                            } else {
                                                nc1Var.f1(i4121, frameLayoutArr[i4121].getVisibility() != 0, true);
                                            }
                                        }
                                        nc1Var.F0[1].a(nc1Var.S0 != null, true);
                                        nc1Var.n1();
                                        nc1Var.L0.f1();
                                        nc1Var.l1();
                                    } else if (nc1Var.f40795x1 instanceof wh1) {
                                        nc1Var.f1(i4121, frameLayoutArr[i4121].getVisibility() != 0, true);
                                    } else if (i4120 != 1) {
                                        q71Var8.a(!q71Var8.f31827s, true);
                                        if (i4121 != 0) {
                                            boolean z18 = q71Var8.f31827s;
                                            nc1Var.A1 = z18;
                                            nc1Var.f40780r1.c(z18);
                                            nc1Var.M0();
                                        } else {
                                            boolean z19 = q71Var8.f31827s;
                                            nc1Var.B1 = z19;
                                            if (z19) {
                                                nc1Var.f40784t0.getImageReceiver().setForceCrossfade(true);
                                            }
                                            nc1Var.i1();
                                        }
                                    }
                                    break;
                                }
                                break;
                            default:
                                nc1 nc1Var2 = this.f36771b;
                                if (nc1Var2.f40788v0.getAlpha() == 1.0f && i15 == 0) {
                                    org.telegram.ui.Components.q71 q71Var9 = q71Var7;
                                    q71Var9.a(!q71Var9.f31827s, true);
                                    nc1Var2.f40781s.f22889i = q71Var9.f31827s;
                                    org.telegram.ui.ActionBar.g6.n1(true, true);
                                    nc1Var2.f40776q0.f1();
                                }
                                break;
                        }
                    }
                });
                if (i15 == 2) {
                    this.F0[i15].setAlpha(0.0f);
                    this.F0[i15].setVisibility(4);
                }
                i15++;
            }
            if (i10 == 1) {
                iArr2 = new int[2];
                this.G0 = new org.telegram.ui.Components.q71[2];
                this.f40788v0 = new FrameLayout(context);
                strArr2 = new String[]{LocaleController.getString(R.string.BackgroundAnimate), LocaleController.getString(R.string.BackgroundColors)};
                i21 = 0;
                iMax2 = 0;
                while (i21 < i20) {
                    int iCeil6 = (int) Math.ceil(textPaint.measureText(strArr2[i21]));
                    iArr2[i21] = iCeil6;
                    iMax2 = Math.max(iMax2, iCeil6);
                    i21++;
                }
                if (e6Var != null) {
                    kb1 kb1Var118 = new kb1(this, context, 1);
                    this.A0 = kb1Var118;
                    kb1Var118.setWillNotDraw(false);
                    kb1 kb1Var119 = this.A0;
                    if (e6Var.f22887f != 0) {
                        i22 = 0;
                    } else {
                        i22 = 4;
                    }
                    kb1Var119.setVisibility(i22);
                    kb1 kb1Var21 = this.A0;
                    if (e6Var.f22887f != 0) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.1f;
                    }
                    kb1Var21.setScaleX(f13);
                    kb1 kb1Var1110 = this.A0;
                    if (e6Var.f22887f != 0) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.1f;
                    }
                    kb1Var1110.setScaleY(f14);
                    kb1 kb1Var1111 = this.A0;
                    if (e6Var.f22887f != 0) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    kb1Var1111.setAlpha(f15);
                    this.f40788v0.addView(this.A0, h7.z5.e(48, 48, 17));
                    this.A0.setOnClickListener(new lb1(this, 1));
                    ImageView imageView6 = new ImageView(context);
                    this.C0 = imageView6;
                    imageView6.setScaleType(ImageView.ScaleType.CENTER);
                    this.C0.setImageResource(R.drawable.bg_rotate_large);
                    this.A0.addView(this.C0, h7.z5.e(-2, -2, 17));
                    while (i23 < 2) {
                        org.telegram.ui.Components.q71[] q71VarArr3 = this.G0;
                        if (i23 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        q71VarArr3[i23] = new org.telegram.ui.Components.q71(context, z11, this.f40784t0, mb1Var);
                        q71Var = this.G0[i23];
                        String str6 = strArr2[i23];
                        int i4120 = iArr2[i23];
                        q71Var.f31824f = str6;
                        q71Var.h = i4120;
                        q71Var.f31825n = iMax2;
                        if (i23 == 0) {
                            q71Var.a(e6Var.f22889i, false);
                        }
                        iDp2 = AndroidUtilities.dp(56.0f) + iMax2;
                        layoutParams = new FrameLayout.LayoutParams(iDp2, -2);
                        layoutParams.gravity = 17;
                        if (i23 == 1) {
                            layoutParams.leftMargin = AndroidUtilities.dp(10.0f) + (iDp2 / 2);
                        } else {
                            layoutParams.rightMargin = AndroidUtilities.dp(10.0f) + (iDp2 / 2);
                        }
                        this.f40788v0.addView(this.G0[i23], layoutParams);
                        final org.telegram.ui.Components.q71 q71Var8 = this.G0[i23];
                        final int i4121 = 1;
                        q71Var8.setOnClickListener(new View.OnClickListener(this) {

                            public final nc1 f36771b;

                            {
                                this.f36771b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i4121) {
                                    case 0:
                                        nc1 nc1Var = this.f36771b;
                                        int i4122 = nc1Var.f40738b;
                                        FrameLayout[] frameLayoutArr = nc1Var.H0;
                                        if (nc1Var.f40786u0.getAlpha() == 1.0f && nc1Var.f40771n1 == null) {
                                            int i4123 = i23;
                                            org.telegram.ui.Components.q71 q71Var9 = q71Var8;
                                            if ((i4122 == 1 || (nc1Var.f40795x1 instanceof wh1)) && i4123 == 2) {
                                                q71Var9.a(!q71Var9.f31827s, true);
                                                boolean z17 = q71Var9.f31827s;
                                                nc1Var.A1 = z17;
                                                nc1Var.f40780r1.c(z17);
                                                nc1Var.M0();
                                            } else if (i4123 == 1 && (i4122 == 1 || (nc1Var.f40795x1 instanceof wh1))) {
                                                if (nc1Var.F0[1].f31827s) {
                                                    nc1Var.U0 = nc1Var.S0;
                                                    nc1Var.f40784t0.setImageDrawable(null);
                                                    nc1Var.S0 = null;
                                                    nc1Var.A1 = false;
                                                    nc1Var.j1();
                                                    nc1Var.M0();
                                                    if (frameLayoutArr[1].getVisibility() == 0) {
                                                        if (i4122 == 1) {
                                                            nc1Var.f1(0, true, true);
                                                        } else {
                                                            nc1Var.f1(i4123, frameLayoutArr[i4123].getVisibility() != 0, true);
                                                        }
                                                    }
                                                } else {
                                                    nc1Var.Z0(nc1Var.U0 != null ? -1 : 0);
                                                    if (i4122 == 1) {
                                                        nc1Var.f1(1, true, true);
                                                    } else {
                                                        nc1Var.f1(i4123, frameLayoutArr[i4123].getVisibility() != 0, true);
                                                    }
                                                }
                                                nc1Var.F0[1].a(nc1Var.S0 != null, true);
                                                nc1Var.n1();
                                                nc1Var.L0.f1();
                                                nc1Var.l1();
                                            } else if (nc1Var.f40795x1 instanceof wh1) {
                                                nc1Var.f1(i4123, frameLayoutArr[i4123].getVisibility() != 0, true);
                                            } else if (i4122 != 1) {
                                                q71Var9.a(!q71Var9.f31827s, true);
                                                if (i4123 != 0) {
                                                    boolean z18 = q71Var9.f31827s;
                                                    nc1Var.A1 = z18;
                                                    nc1Var.f40780r1.c(z18);
                                                    nc1Var.M0();
                                                } else {
                                                    boolean z19 = q71Var9.f31827s;
                                                    nc1Var.B1 = z19;
                                                    if (z19) {
                                                        nc1Var.f40784t0.getImageReceiver().setForceCrossfade(true);
                                                    }
                                                    nc1Var.i1();
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        nc1 nc1Var2 = this.f36771b;
                                        if (nc1Var2.f40788v0.getAlpha() == 1.0f && i23 == 0) {
                                            org.telegram.ui.Components.q71 q71Var10 = q71Var8;
                                            q71Var10.a(!q71Var10.f31827s, true);
                                            nc1Var2.f40781s.f22889i = q71Var10.f31827s;
                                            org.telegram.ui.ActionBar.g6.n1(true, true);
                                            nc1Var2.f40776q0.f1();
                                        }
                                        break;
                                }
                            }
                        });
                    }
                }
            }
            if (i10 != 1) {
                this.B1 = false;
                i16 = 0;
                while (i16 < 2) {
                    rect2 = rect2;
                    nb1Var = new nb1(this, context, i16, rect2);
                    viewGroupArr = this.H0;
                    viewGroupArr[i16] = nb1Var;
                    if (i16 != 1) {
                        nb1Var.setVisibility(4);
                    } else {
                        nb1Var.setVisibility(4);
                    }
                    viewGroupArr[i16].setWillNotDraw(false);
                    if (i10 == 2) {
                    }
                    if (i16 == 0) {
                        f11 = i10 == 2 ? 321 : 273;
                    } else {
                        f11 = 316.0f;
                    }
                    layoutParamsE.height = AndroidUtilities.dp(f11);
                    if (U0()) {
                        layoutParamsE.height += AndroidUtilities.navigationBarHeight;
                    }
                    if (i16 == 0) {
                        Drawable drawable4 = this.f40778r;
                        Rect rect6 = AndroidUtilities.rectTmp2;
                        drawable4.getPadding(rect6);
                        layoutParamsE.height = AndroidUtilities.dp(12.0f) + rect6.top + layoutParamsE.height;
                    }
                    ViewGroup viewGroup4 = viewGroupArr[i16];
                    if (i16 == 0) {
                        iDp = AndroidUtilities.dp(12.0f) + rect2.top;
                    } else {
                        iDp = 0;
                    }
                    if (U0()) {
                        i17 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i17 = 0;
                    }
                    viewGroup4.setPadding(0, iDp, 0, i17);
                    this.f40774p0.addView(viewGroupArr[i16], layoutParamsE);
                    if (i16 != 1) {
                        ag.y1 y1Var9 = new ag.y1(this, context, 27);
                        ViewGroup[] viewGroupArr7 = this.K0;
                        viewGroupArr7[i16] = y1Var9;
                        y1Var9.setWillNotDraw(false);
                        viewGroupArr7[i16].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        viewGroupArr7[i16].setClickable(true);
                        f12 = 21.0f;
                        viewGroupArr[i16].addView(viewGroupArr7[i16], h7.z5.e(-1, 51, 80));
                        TextView textView1113 = new TextView(context);
                        TextView[] textViewArr11 = this.I0;
                        textViewArr11[i16] = textView1113;
                        textView1113.setTextSize(1, 15.0f);
                        textViewArr11[i16].setTypeface(AndroidUtilities.bold());
                        TextView textView1114 = textViewArr11[i16];
                        int i41110 = org.telegram.ui.ActionBar.g6.Ae;
                        textView1114.setTextColor(getThemedColor(i41110));
                        textViewArr11[i16].setText(LocaleController.getString(R.string.Cancel));
                        textViewArr11[i16].setGravity(17);
                        textViewArr11[i16].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView1115 = textViewArr11[i16];
                        int i41111 = org.telegram.ui.ActionBar.g6.f23144i6;
                        textView1115.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(getThemedColor(i41111), 0));
                        viewGroupArr7[i16].addView(textViewArr11[i16], h7.z5.e(-2, -1, 51));
                        final int i41112 = 0;
                        textViewArr11[i16].setOnClickListener(new View.OnClickListener(this) {

                            public final nc1 f38066b;

                            {
                                this.f38066b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i41112) {
                                    case 0:
                                        nc1 nc1Var = this.f38066b;
                                        if (nc1Var.f40771n1 == null) {
                                            int i41113 = i16;
                                            if (i41113 == 0) {
                                                nc1Var.f40747d1 = nc1Var.f40751e1;
                                                nc1Var.a1(nc1Var.f40744c1, 3, true);
                                                nc1Var.a1(nc1Var.f40740b1, 2, true);
                                                nc1Var.a1(nc1Var.f40737a1, 1, true);
                                                nc1Var.a1(nc1Var.W0, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = nc1Var.T0;
                                                nc1Var.S0 = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    nc1Var.f40784t0.setImageDrawable(null);
                                                } else {
                                                    cc1 cc1Var2 = nc1Var.f40784t0;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str7 = nc1Var.C1;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = nc1Var.S0;
                                                    cc1Var2.k(forDocument, str7, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                }
                                                nc1Var.F0[1].a(nc1Var.S0 != null, false);
                                                float f22 = nc1Var.f40762i1;
                                                nc1Var.f40760h1 = f22;
                                                nc1Var.P0.setProgress(f22);
                                                nc1Var.f40784t0.getImageReceiver().setAlpha(nc1Var.f40760h1);
                                                nc1Var.j1();
                                                nc1Var.n1();
                                            }
                                            if (nc1Var.f40738b != 2) {
                                                if (nc1Var.S0 == null) {
                                                    if (nc1Var.A1) {
                                                        nc1Var.A1 = false;
                                                        nc1Var.F0[0].a(false, true);
                                                        nc1Var.M0();
                                                    }
                                                    nc1Var.l1();
                                                }
                                                nc1Var.f1(0, true, true);
                                            } else {
                                                nc1Var.f1(i41113, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        nc1 nc1Var2 = this.f38066b;
                                        if (nc1Var2.f40771n1 == null) {
                                            if (nc1Var2.f40738b != 2) {
                                                nc1Var2.f1(0, true, true);
                                            } else {
                                                nc1Var2.f1(i16, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        TextView textView1116 = new TextView(context);
                        TextView[] textViewArr12 = this.J0;
                        textViewArr12[i16] = textView1116;
                        textView1116.setTextSize(1, 15.0f);
                        textViewArr12[i16].setTypeface(AndroidUtilities.bold());
                        textViewArr12[i16].setTextColor(getThemedColor(i41110));
                        textViewArr12[i16].setText(LocaleController.getString(R.string.ApplyTheme));
                        textViewArr12[i16].setGravity(17);
                        textViewArr12[i16].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        textViewArr12[i16].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(getThemedColor(i41111), 0));
                        viewGroupArr7[i16].addView(textViewArr12[i16], h7.z5.e(-2, -1, 53));
                        TextView textView1117 = textViewArr12[i16];
                        r12 = 1;
                        final int c15 = 1 == true ? 1 : 0;
                        textView1117.setOnClickListener(new View.OnClickListener(this) {

                            public final nc1 f38066b;

                            {
                                this.f38066b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (c15) {
                                    case 0:
                                        nc1 nc1Var = this.f38066b;
                                        if (nc1Var.f40771n1 == null) {
                                            int i41113 = i16;
                                            if (i41113 == 0) {
                                                nc1Var.f40747d1 = nc1Var.f40751e1;
                                                nc1Var.a1(nc1Var.f40744c1, 3, true);
                                                nc1Var.a1(nc1Var.f40740b1, 2, true);
                                                nc1Var.a1(nc1Var.f40737a1, 1, true);
                                                nc1Var.a1(nc1Var.W0, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = nc1Var.T0;
                                                nc1Var.S0 = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    nc1Var.f40784t0.setImageDrawable(null);
                                                } else {
                                                    cc1 cc1Var2 = nc1Var.f40784t0;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str7 = nc1Var.C1;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = nc1Var.S0;
                                                    cc1Var2.k(forDocument, str7, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                }
                                                nc1Var.F0[1].a(nc1Var.S0 != null, false);
                                                float f22 = nc1Var.f40762i1;
                                                nc1Var.f40760h1 = f22;
                                                nc1Var.P0.setProgress(f22);
                                                nc1Var.f40784t0.getImageReceiver().setAlpha(nc1Var.f40760h1);
                                                nc1Var.j1();
                                                nc1Var.n1();
                                            }
                                            if (nc1Var.f40738b != 2) {
                                                if (nc1Var.S0 == null) {
                                                    if (nc1Var.A1) {
                                                        nc1Var.A1 = false;
                                                        nc1Var.F0[0].a(false, true);
                                                        nc1Var.M0();
                                                    }
                                                    nc1Var.l1();
                                                }
                                                nc1Var.f1(0, true, true);
                                            } else {
                                                nc1Var.f1(i41113, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        nc1 nc1Var2 = this.f38066b;
                                        if (nc1Var2.f40771n1 == null) {
                                            if (nc1Var2.f40738b != 2) {
                                                nc1Var2.f1(0, true, true);
                                            } else {
                                                nc1Var2.f1(i16, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        ag.y1 y1Var10 = new ag.y1(this, context, 27);
                        ViewGroup[] viewGroupArr8 = this.K0;
                        viewGroupArr8[i16] = y1Var10;
                        y1Var10.setWillNotDraw(false);
                        viewGroupArr8[i16].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        viewGroupArr8[i16].setClickable(true);
                        f12 = 21.0f;
                        viewGroupArr[i16].addView(viewGroupArr8[i16], h7.z5.e(-1, 51, 80));
                        TextView textView1118 = new TextView(context);
                        TextView[] textViewArr13 = this.I0;
                        textViewArr13[i16] = textView1118;
                        textView1118.setTextSize(1, 15.0f);
                        textViewArr13[i16].setTypeface(AndroidUtilities.bold());
                        TextView textView1119 = textViewArr13[i16];
                        int i41113 = org.telegram.ui.ActionBar.g6.Ae;
                        textView1119.setTextColor(getThemedColor(i41113));
                        textViewArr13[i16].setText(LocaleController.getString(R.string.Cancel));
                        textViewArr13[i16].setGravity(17);
                        textViewArr13[i16].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView11110 = textViewArr13[i16];
                        int i41114 = org.telegram.ui.ActionBar.g6.f23144i6;
                        textView11110.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(getThemedColor(i41114), 0));
                        viewGroupArr8[i16].addView(textViewArr13[i16], h7.z5.e(-2, -1, 51));
                        final int i41115 = 0;
                        textViewArr13[i16].setOnClickListener(new View.OnClickListener(this) {

                            public final nc1 f38066b;

                            {
                                this.f38066b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i41115) {
                                    case 0:
                                        nc1 nc1Var = this.f38066b;
                                        if (nc1Var.f40771n1 == null) {
                                            int i41116 = i16;
                                            if (i41116 == 0) {
                                                nc1Var.f40747d1 = nc1Var.f40751e1;
                                                nc1Var.a1(nc1Var.f40744c1, 3, true);
                                                nc1Var.a1(nc1Var.f40740b1, 2, true);
                                                nc1Var.a1(nc1Var.f40737a1, 1, true);
                                                nc1Var.a1(nc1Var.W0, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = nc1Var.T0;
                                                nc1Var.S0 = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    nc1Var.f40784t0.setImageDrawable(null);
                                                } else {
                                                    cc1 cc1Var2 = nc1Var.f40784t0;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str7 = nc1Var.C1;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = nc1Var.S0;
                                                    cc1Var2.k(forDocument, str7, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                }
                                                nc1Var.F0[1].a(nc1Var.S0 != null, false);
                                                float f22 = nc1Var.f40762i1;
                                                nc1Var.f40760h1 = f22;
                                                nc1Var.P0.setProgress(f22);
                                                nc1Var.f40784t0.getImageReceiver().setAlpha(nc1Var.f40760h1);
                                                nc1Var.j1();
                                                nc1Var.n1();
                                            }
                                            if (nc1Var.f40738b != 2) {
                                                if (nc1Var.S0 == null) {
                                                    if (nc1Var.A1) {
                                                        nc1Var.A1 = false;
                                                        nc1Var.F0[0].a(false, true);
                                                        nc1Var.M0();
                                                    }
                                                    nc1Var.l1();
                                                }
                                                nc1Var.f1(0, true, true);
                                            } else {
                                                nc1Var.f1(i41116, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        nc1 nc1Var2 = this.f38066b;
                                        if (nc1Var2.f40771n1 == null) {
                                            if (nc1Var2.f40738b != 2) {
                                                nc1Var2.f1(0, true, true);
                                            } else {
                                                nc1Var2.f1(i16, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        TextView textView11111 = new TextView(context);
                        TextView[] textViewArr14 = this.J0;
                        textViewArr14[i16] = textView11111;
                        textView11111.setTextSize(1, 15.0f);
                        textViewArr14[i16].setTypeface(AndroidUtilities.bold());
                        textViewArr14[i16].setTextColor(getThemedColor(i41113));
                        textViewArr14[i16].setText(LocaleController.getString(R.string.ApplyTheme));
                        textViewArr14[i16].setGravity(17);
                        textViewArr14[i16].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        textViewArr14[i16].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(getThemedColor(i41114), 0));
                        viewGroupArr8[i16].addView(textViewArr14[i16], h7.z5.e(-2, -1, 53));
                        TextView textView11112 = textViewArr14[i16];
                        r12 = 1;
                        final int c16 = 1 == true ? 1 : 0;
                        textView11112.setOnClickListener(new View.OnClickListener(this) {

                            public final nc1 f38066b;

                            {
                                this.f38066b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (c16) {
                                    case 0:
                                        nc1 nc1Var = this.f38066b;
                                        if (nc1Var.f40771n1 == null) {
                                            int i41116 = i16;
                                            if (i41116 == 0) {
                                                nc1Var.f40747d1 = nc1Var.f40751e1;
                                                nc1Var.a1(nc1Var.f40744c1, 3, true);
                                                nc1Var.a1(nc1Var.f40740b1, 2, true);
                                                nc1Var.a1(nc1Var.f40737a1, 1, true);
                                                nc1Var.a1(nc1Var.W0, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = nc1Var.T0;
                                                nc1Var.S0 = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    nc1Var.f40784t0.setImageDrawable(null);
                                                } else {
                                                    cc1 cc1Var2 = nc1Var.f40784t0;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str7 = nc1Var.C1;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = nc1Var.S0;
                                                    cc1Var2.k(forDocument, str7, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                }
                                                nc1Var.F0[1].a(nc1Var.S0 != null, false);
                                                float f22 = nc1Var.f40762i1;
                                                nc1Var.f40760h1 = f22;
                                                nc1Var.P0.setProgress(f22);
                                                nc1Var.f40784t0.getImageReceiver().setAlpha(nc1Var.f40760h1);
                                                nc1Var.j1();
                                                nc1Var.n1();
                                            }
                                            if (nc1Var.f40738b != 2) {
                                                if (nc1Var.S0 == null) {
                                                    if (nc1Var.A1) {
                                                        nc1Var.A1 = false;
                                                        nc1Var.F0[0].a(false, true);
                                                        nc1Var.M0();
                                                    }
                                                    nc1Var.l1();
                                                }
                                                nc1Var.f1(0, true, true);
                                            } else {
                                                nc1Var.f1(i41116, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        nc1 nc1Var2 = this.f38066b;
                                        if (nc1Var2.f40771n1 == null) {
                                            if (nc1Var2.f40738b != 2) {
                                                nc1Var2.f1(0, true, true);
                                            } else {
                                                nc1Var2.f1(i16, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    if (i16 == r12) {
                        TextView textView22 = new TextView(context);
                        this.a2 = textView22;
                        textView22.setLines(r12);
                        this.a2.setSingleLine(r12);
                        this.a2.setText(LocaleController.getString(R.string.BackgroundChoosePattern));
                        this.a2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                        this.a2.setTextSize(r12, 20.0f);
                        this.a2.setTypeface(AndroidUtilities.bold());
                        this.a2.setPadding(AndroidUtilities.dp(f12), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(f12), AndroidUtilities.dp(8.0f));
                        this.a2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                        this.a2.setGravity(16);
                        viewGroupArr[i16].addView(this.a2, h7.z5.d(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                        ta1 ta1Var7 = new ta1(context);
                        this.L0 = ta1Var7;
                        f2.k0 k0Var4 = new f2.k0(0, false);
                        this.N0 = k0Var4;
                        ta1Var7.setLayoutManager(k0Var4);
                        ta1 ta1Var8 = this.L0;
                        lc1 lc1Var4 = new lc1(context, this);
                        this.M0 = lc1Var4;
                        ta1Var8.setAdapter(lc1Var4);
                        this.L0.i(new jh.j(7));
                        viewGroupArr[i16].addView(this.L0, h7.z5.d(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                        this.L0.setOnItemClickListener(new b21(this, 6));
                        org.telegram.ui.Cells.j4 j4Var4 = new org.telegram.ui.Cells.j4(context);
                        this.O0 = j4Var4;
                        j4Var4.setText(LocaleController.getString(R.string.BackgroundIntensity));
                        viewGroupArr[i16].addView(this.O0, h7.z5.d(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                        org.telegram.ui.Cells.j0 j0Var4 = new org.telegram.ui.Cells.j0(context, (mb1) getResourceProvider());
                        this.P0 = j0Var4;
                        j0Var4.setProgress(this.f40760h1);
                        this.P0.setReportChanges(true);
                        this.P0.setDelegate(new ob1(this));
                        viewGroupArr[i16].addView(this.P0, h7.z5.d(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                    } else {
                        org.telegram.ui.Components.aq aqVar7 = new org.telegram.ui.Components.aq(context, this.f40743c0, new pb1(this));
                        this.R = aqVar7;
                        aqVar7.setResourcesProvider(getResourceProvider());
                        if (i10 == 1) {
                            viewGroupArr[i16].addView(this.R, h7.z5.e(-1, -1, 1));
                            if (f6Var.q()) {
                                this.R.setMinBrightness(0.2f);
                            } else {
                                this.R.setMinBrightness(0.05f);
                                this.R.setMaxBrightness(0.8f);
                            }
                            if (e6Var != null) {
                                if (e6Var.d != 0) {
                                    i18 = 2;
                                } else {
                                    i18 = 1;
                                }
                                org.telegram.ui.Components.aq aqVar8 = this.R;
                                T0(1);
                                aqVar8.f(1, 2, i18, false);
                                this.R.e(e6Var.f22885c, 0);
                                i19 = e6Var.d;
                                if (i19 != 0) {
                                    this.R.e(i19, 1);
                                }
                            }
                        } else {
                            viewGroupArr[i16].addView(this.R, h7.z5.d(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                        }
                    }
                    i16++;
                }
            } else {
                this.B1 = false;
                i16 = 0;
                while (i16 < 2) {
                    rect2 = rect2;
                    nb1Var = new nb1(this, context, i16, rect2);
                    viewGroupArr = this.H0;
                    viewGroupArr[i16] = nb1Var;
                    if (i16 != 1) {
                        nb1Var.setVisibility(4);
                    } else {
                        nb1Var.setVisibility(4);
                    }
                    viewGroupArr[i16].setWillNotDraw(false);
                    if (i10 == 2) {
                    }
                    if (i16 == 0) {
                        f11 = i10 == 2 ? 321 : 273;
                    } else {
                        f11 = 316.0f;
                    }
                    layoutParamsE.height = AndroidUtilities.dp(f11);
                    if (U0()) {
                        layoutParamsE.height += AndroidUtilities.navigationBarHeight;
                    }
                    if (i16 == 0) {
                        Drawable drawable5 = this.f40778r;
                        Rect rect7 = AndroidUtilities.rectTmp2;
                        drawable5.getPadding(rect7);
                        layoutParamsE.height = AndroidUtilities.dp(12.0f) + rect7.top + layoutParamsE.height;
                    }
                    ViewGroup viewGroup5 = viewGroupArr[i16];
                    if (i16 == 0) {
                        iDp = AndroidUtilities.dp(12.0f) + rect2.top;
                    } else {
                        iDp = 0;
                    }
                    if (U0()) {
                        i17 = AndroidUtilities.navigationBarHeight;
                    } else {
                        i17 = 0;
                    }
                    viewGroup5.setPadding(0, iDp, 0, i17);
                    this.f40774p0.addView(viewGroupArr[i16], layoutParamsE);
                    if (i16 != 1) {
                        ag.y1 y1Var11 = new ag.y1(this, context, 27);
                        ViewGroup[] viewGroupArr9 = this.K0;
                        viewGroupArr9[i16] = y1Var11;
                        y1Var11.setWillNotDraw(false);
                        viewGroupArr9[i16].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        viewGroupArr9[i16].setClickable(true);
                        f12 = 21.0f;
                        viewGroupArr[i16].addView(viewGroupArr9[i16], h7.z5.e(-1, 51, 80));
                        TextView textView11113 = new TextView(context);
                        TextView[] textViewArr15 = this.I0;
                        textViewArr15[i16] = textView11113;
                        textView11113.setTextSize(1, 15.0f);
                        textViewArr15[i16].setTypeface(AndroidUtilities.bold());
                        TextView textView11114 = textViewArr15[i16];
                        int i41116 = org.telegram.ui.ActionBar.g6.Ae;
                        textView11114.setTextColor(getThemedColor(i41116));
                        textViewArr15[i16].setText(LocaleController.getString(R.string.Cancel));
                        textViewArr15[i16].setGravity(17);
                        textViewArr15[i16].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView11115 = textViewArr15[i16];
                        int i41117 = org.telegram.ui.ActionBar.g6.f23144i6;
                        textView11115.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(getThemedColor(i41117), 0));
                        viewGroupArr9[i16].addView(textViewArr15[i16], h7.z5.e(-2, -1, 51));
                        final int i41118 = 0;
                        textViewArr15[i16].setOnClickListener(new View.OnClickListener(this) {

                            public final nc1 f38066b;

                            {
                                this.f38066b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i41118) {
                                    case 0:
                                        nc1 nc1Var = this.f38066b;
                                        if (nc1Var.f40771n1 == null) {
                                            int i41119 = i16;
                                            if (i41119 == 0) {
                                                nc1Var.f40747d1 = nc1Var.f40751e1;
                                                nc1Var.a1(nc1Var.f40744c1, 3, true);
                                                nc1Var.a1(nc1Var.f40740b1, 2, true);
                                                nc1Var.a1(nc1Var.f40737a1, 1, true);
                                                nc1Var.a1(nc1Var.W0, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = nc1Var.T0;
                                                nc1Var.S0 = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    nc1Var.f40784t0.setImageDrawable(null);
                                                } else {
                                                    cc1 cc1Var2 = nc1Var.f40784t0;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str7 = nc1Var.C1;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = nc1Var.S0;
                                                    cc1Var2.k(forDocument, str7, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                }
                                                nc1Var.F0[1].a(nc1Var.S0 != null, false);
                                                float f22 = nc1Var.f40762i1;
                                                nc1Var.f40760h1 = f22;
                                                nc1Var.P0.setProgress(f22);
                                                nc1Var.f40784t0.getImageReceiver().setAlpha(nc1Var.f40760h1);
                                                nc1Var.j1();
                                                nc1Var.n1();
                                            }
                                            if (nc1Var.f40738b != 2) {
                                                if (nc1Var.S0 == null) {
                                                    if (nc1Var.A1) {
                                                        nc1Var.A1 = false;
                                                        nc1Var.F0[0].a(false, true);
                                                        nc1Var.M0();
                                                    }
                                                    nc1Var.l1();
                                                }
                                                nc1Var.f1(0, true, true);
                                            } else {
                                                nc1Var.f1(i41119, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        nc1 nc1Var2 = this.f38066b;
                                        if (nc1Var2.f40771n1 == null) {
                                            if (nc1Var2.f40738b != 2) {
                                                nc1Var2.f1(0, true, true);
                                            } else {
                                                nc1Var2.f1(i16, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        TextView textView11116 = new TextView(context);
                        TextView[] textViewArr16 = this.J0;
                        textViewArr16[i16] = textView11116;
                        textView11116.setTextSize(1, 15.0f);
                        textViewArr16[i16].setTypeface(AndroidUtilities.bold());
                        textViewArr16[i16].setTextColor(getThemedColor(i41116));
                        textViewArr16[i16].setText(LocaleController.getString(R.string.ApplyTheme));
                        textViewArr16[i16].setGravity(17);
                        textViewArr16[i16].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        textViewArr16[i16].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(getThemedColor(i41117), 0));
                        viewGroupArr9[i16].addView(textViewArr16[i16], h7.z5.e(-2, -1, 53));
                        TextView textView11117 = textViewArr16[i16];
                        r12 = 1;
                        final int c17 = 1 == true ? 1 : 0;
                        textView11117.setOnClickListener(new View.OnClickListener(this) {

                            public final nc1 f38066b;

                            {
                                this.f38066b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (c17) {
                                    case 0:
                                        nc1 nc1Var = this.f38066b;
                                        if (nc1Var.f40771n1 == null) {
                                            int i41119 = i16;
                                            if (i41119 == 0) {
                                                nc1Var.f40747d1 = nc1Var.f40751e1;
                                                nc1Var.a1(nc1Var.f40744c1, 3, true);
                                                nc1Var.a1(nc1Var.f40740b1, 2, true);
                                                nc1Var.a1(nc1Var.f40737a1, 1, true);
                                                nc1Var.a1(nc1Var.W0, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = nc1Var.T0;
                                                nc1Var.S0 = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    nc1Var.f40784t0.setImageDrawable(null);
                                                } else {
                                                    cc1 cc1Var2 = nc1Var.f40784t0;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str7 = nc1Var.C1;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = nc1Var.S0;
                                                    cc1Var2.k(forDocument, str7, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                }
                                                nc1Var.F0[1].a(nc1Var.S0 != null, false);
                                                float f22 = nc1Var.f40762i1;
                                                nc1Var.f40760h1 = f22;
                                                nc1Var.P0.setProgress(f22);
                                                nc1Var.f40784t0.getImageReceiver().setAlpha(nc1Var.f40760h1);
                                                nc1Var.j1();
                                                nc1Var.n1();
                                            }
                                            if (nc1Var.f40738b != 2) {
                                                if (nc1Var.S0 == null) {
                                                    if (nc1Var.A1) {
                                                        nc1Var.A1 = false;
                                                        nc1Var.F0[0].a(false, true);
                                                        nc1Var.M0();
                                                    }
                                                    nc1Var.l1();
                                                }
                                                nc1Var.f1(0, true, true);
                                            } else {
                                                nc1Var.f1(i41119, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        nc1 nc1Var2 = this.f38066b;
                                        if (nc1Var2.f40771n1 == null) {
                                            if (nc1Var2.f40738b != 2) {
                                                nc1Var2.f1(0, true, true);
                                            } else {
                                                nc1Var2.f1(i16, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        ag.y1 y1Var12 = new ag.y1(this, context, 27);
                        ViewGroup[] viewGroupArr10 = this.K0;
                        viewGroupArr10[i16] = y1Var12;
                        y1Var12.setWillNotDraw(false);
                        viewGroupArr10[i16].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                        viewGroupArr10[i16].setClickable(true);
                        f12 = 21.0f;
                        viewGroupArr[i16].addView(viewGroupArr10[i16], h7.z5.e(-1, 51, 80));
                        TextView textView11118 = new TextView(context);
                        TextView[] textViewArr17 = this.I0;
                        textViewArr17[i16] = textView11118;
                        textView11118.setTextSize(1, 15.0f);
                        textViewArr17[i16].setTypeface(AndroidUtilities.bold());
                        TextView textView11119 = textViewArr17[i16];
                        int i41119 = org.telegram.ui.ActionBar.g6.Ae;
                        textView11119.setTextColor(getThemedColor(i41119));
                        textViewArr17[i16].setText(LocaleController.getString(R.string.Cancel));
                        textViewArr17[i16].setGravity(17);
                        textViewArr17[i16].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        TextView textView111110 = textViewArr17[i16];
                        int i411110 = org.telegram.ui.ActionBar.g6.f23144i6;
                        textView111110.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(getThemedColor(i411110), 0));
                        viewGroupArr10[i16].addView(textViewArr17[i16], h7.z5.e(-2, -1, 51));
                        final int i411111 = 0;
                        textViewArr17[i16].setOnClickListener(new View.OnClickListener(this) {

                            public final nc1 f38066b;

                            {
                                this.f38066b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i411111) {
                                    case 0:
                                        nc1 nc1Var = this.f38066b;
                                        if (nc1Var.f40771n1 == null) {
                                            int i411112 = i16;
                                            if (i411112 == 0) {
                                                nc1Var.f40747d1 = nc1Var.f40751e1;
                                                nc1Var.a1(nc1Var.f40744c1, 3, true);
                                                nc1Var.a1(nc1Var.f40740b1, 2, true);
                                                nc1Var.a1(nc1Var.f40737a1, 1, true);
                                                nc1Var.a1(nc1Var.W0, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = nc1Var.T0;
                                                nc1Var.S0 = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    nc1Var.f40784t0.setImageDrawable(null);
                                                } else {
                                                    cc1 cc1Var2 = nc1Var.f40784t0;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str7 = nc1Var.C1;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = nc1Var.S0;
                                                    cc1Var2.k(forDocument, str7, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                }
                                                nc1Var.F0[1].a(nc1Var.S0 != null, false);
                                                float f22 = nc1Var.f40762i1;
                                                nc1Var.f40760h1 = f22;
                                                nc1Var.P0.setProgress(f22);
                                                nc1Var.f40784t0.getImageReceiver().setAlpha(nc1Var.f40760h1);
                                                nc1Var.j1();
                                                nc1Var.n1();
                                            }
                                            if (nc1Var.f40738b != 2) {
                                                if (nc1Var.S0 == null) {
                                                    if (nc1Var.A1) {
                                                        nc1Var.A1 = false;
                                                        nc1Var.F0[0].a(false, true);
                                                        nc1Var.M0();
                                                    }
                                                    nc1Var.l1();
                                                }
                                                nc1Var.f1(0, true, true);
                                            } else {
                                                nc1Var.f1(i411112, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        nc1 nc1Var2 = this.f38066b;
                                        if (nc1Var2.f40771n1 == null) {
                                            if (nc1Var2.f40738b != 2) {
                                                nc1Var2.f1(0, true, true);
                                            } else {
                                                nc1Var2.f1(i16, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        TextView textView111111 = new TextView(context);
                        TextView[] textViewArr18 = this.J0;
                        textViewArr18[i16] = textView111111;
                        textView111111.setTextSize(1, 15.0f);
                        textViewArr18[i16].setTypeface(AndroidUtilities.bold());
                        textViewArr18[i16].setTextColor(getThemedColor(i41119));
                        textViewArr18[i16].setText(LocaleController.getString(R.string.ApplyTheme));
                        textViewArr18[i16].setGravity(17);
                        textViewArr18[i16].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        textViewArr18[i16].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(getThemedColor(i411110), 0));
                        viewGroupArr10[i16].addView(textViewArr18[i16], h7.z5.e(-2, -1, 53));
                        TextView textView111112 = textViewArr18[i16];
                        r12 = 1;
                        final int c18 = 1 == true ? 1 : 0;
                        textView111112.setOnClickListener(new View.OnClickListener(this) {

                            public final nc1 f38066b;

                            {
                                this.f38066b = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (c18) {
                                    case 0:
                                        nc1 nc1Var = this.f38066b;
                                        if (nc1Var.f40771n1 == null) {
                                            int i411112 = i16;
                                            if (i411112 == 0) {
                                                nc1Var.f40747d1 = nc1Var.f40751e1;
                                                nc1Var.a1(nc1Var.f40744c1, 3, true);
                                                nc1Var.a1(nc1Var.f40740b1, 2, true);
                                                nc1Var.a1(nc1Var.f40737a1, 1, true);
                                                nc1Var.a1(nc1Var.W0, 0, true);
                                            } else {
                                                TLRPC.TL_wallPaper tL_wallPaper2 = nc1Var.T0;
                                                nc1Var.S0 = tL_wallPaper2;
                                                if (tL_wallPaper2 == null) {
                                                    nc1Var.f40784t0.setImageDrawable(null);
                                                } else {
                                                    cc1 cc1Var2 = nc1Var.f40784t0;
                                                    ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                    String str7 = nc1Var.C1;
                                                    TLRPC.TL_wallPaper tL_wallPaper3 = nc1Var.S0;
                                                    cc1Var2.k(forDocument, str7, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                }
                                                nc1Var.F0[1].a(nc1Var.S0 != null, false);
                                                float f22 = nc1Var.f40762i1;
                                                nc1Var.f40760h1 = f22;
                                                nc1Var.P0.setProgress(f22);
                                                nc1Var.f40784t0.getImageReceiver().setAlpha(nc1Var.f40760h1);
                                                nc1Var.j1();
                                                nc1Var.n1();
                                            }
                                            if (nc1Var.f40738b != 2) {
                                                if (nc1Var.S0 == null) {
                                                    if (nc1Var.A1) {
                                                        nc1Var.A1 = false;
                                                        nc1Var.F0[0].a(false, true);
                                                        nc1Var.M0();
                                                    }
                                                    nc1Var.l1();
                                                }
                                                nc1Var.f1(0, true, true);
                                            } else {
                                                nc1Var.f1(i411112, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        nc1 nc1Var2 = this.f38066b;
                                        if (nc1Var2.f40771n1 == null) {
                                            if (nc1Var2.f40738b != 2) {
                                                nc1Var2.f1(0, true, true);
                                            } else {
                                                nc1Var2.f1(i16, false, true);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    if (i16 == r12) {
                        TextView textView23 = new TextView(context);
                        this.a2 = textView23;
                        textView23.setLines(r12);
                        this.a2.setSingleLine(r12);
                        this.a2.setText(LocaleController.getString(R.string.BackgroundChoosePattern));
                        this.a2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                        this.a2.setTextSize(r12, 20.0f);
                        this.a2.setTypeface(AndroidUtilities.bold());
                        this.a2.setPadding(AndroidUtilities.dp(f12), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(f12), AndroidUtilities.dp(8.0f));
                        this.a2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                        this.a2.setGravity(16);
                        viewGroupArr[i16].addView(this.a2, h7.z5.d(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                        ta1 ta1Var9 = new ta1(context);
                        this.L0 = ta1Var9;
                        f2.k0 k0Var5 = new f2.k0(0, false);
                        this.N0 = k0Var5;
                        ta1Var9.setLayoutManager(k0Var5);
                        ta1 ta1Var10 = this.L0;
                        lc1 lc1Var5 = new lc1(context, this);
                        this.M0 = lc1Var5;
                        ta1Var10.setAdapter(lc1Var5);
                        this.L0.i(new jh.j(7));
                        viewGroupArr[i16].addView(this.L0, h7.z5.d(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                        this.L0.setOnItemClickListener(new b21(this, 6));
                        org.telegram.ui.Cells.j4 j4Var5 = new org.telegram.ui.Cells.j4(context);
                        this.O0 = j4Var5;
                        j4Var5.setText(LocaleController.getString(R.string.BackgroundIntensity));
                        viewGroupArr[i16].addView(this.O0, h7.z5.d(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                        org.telegram.ui.Cells.j0 j0Var5 = new org.telegram.ui.Cells.j0(context, (mb1) getResourceProvider());
                        this.P0 = j0Var5;
                        j0Var5.setProgress(this.f40760h1);
                        this.P0.setReportChanges(true);
                        this.P0.setDelegate(new ob1(this));
                        viewGroupArr[i16].addView(this.P0, h7.z5.d(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                    } else {
                        org.telegram.ui.Components.aq aqVar9 = new org.telegram.ui.Components.aq(context, this.f40743c0, new pb1(this));
                        this.R = aqVar9;
                        aqVar9.setResourcesProvider(getResourceProvider());
                        if (i10 == 1) {
                            viewGroupArr[i16].addView(this.R, h7.z5.e(-1, -1, 1));
                            if (f6Var.q()) {
                                this.R.setMinBrightness(0.2f);
                            } else {
                                this.R.setMinBrightness(0.05f);
                                this.R.setMaxBrightness(0.8f);
                            }
                            if (e6Var != null) {
                                if (e6Var.d != 0) {
                                    i18 = 2;
                                } else {
                                    i18 = 1;
                                }
                                org.telegram.ui.Components.aq aqVar10 = this.R;
                                T0(1);
                                aqVar10.f(1, 2, i18, false);
                                this.R.e(e6Var.f22885c, 0);
                                i19 = e6Var.d;
                                if (i19 != 0) {
                                    this.R.e(i19, 1);
                                }
                            }
                        } else {
                            viewGroupArr[i16].addView(this.R, h7.z5.d(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                        }
                    }
                    i16++;
                }
            }
            j1();
            if (!this.f40784t0.getImageReceiver().hasBitmapImage()) {
                this.f40774p0.setBackgroundColor(-16777216);
            }
            if (i10 != 1) {
                this.f40784t0.getImageReceiver().setCrossfadeWithOldImage(true);
            }
        }
        this.f40776q0.setAdapter(this.f40779r0);
        ag.y1 y1Var13 = new ag.y1(this, context, 28);
        this.f40757g0 = y1Var13;
        y1Var13.setWillNotDraw(false);
        ag.y1 y1Var14 = this.f40757g0;
        this.fragmentView = y1Var14;
        ViewTreeObserver viewTreeObserver2 = y1Var14.getViewTreeObserver();
        p90 p90Var2 = new p90(this, 1);
        this.M = p90Var2;
        viewTreeObserver2.addOnGlobalLayoutListener(p90Var2);
        m2.g gVar3 = new m2.g(context);
        this.f40754f0 = gVar3;
        int i420 = 2;
        gVar3.b(new q2(this, i420));
        this.f40754f0.setAdapter(new ag.b2(this, i420));
        AndroidUtilities.setViewPagerEdgeEffectColor(this.f40754f0, getThemedColor(org.telegram.ui.ActionBar.g6.f23322s8));
        ag.y1 y1Var15 = this.f40757g0;
        m2.g gVar4 = this.f40754f0;
        if (i10 == 0) {
            f21 = 48.0f;
        } else {
            f21 = 0.0f;
        }
        y1Var15.addView(gVar4, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, f21));
        UndoView undoView2 = new UndoView(context, this);
        this.f40759h0 = undoView2;
        undoView2.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.f40757g0.addView(this.f40759h0, h7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        if (i10 == 0) {
            View view2 = new View(context);
            view2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.V5));
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, 1, 83);
            layoutParams4.bottomMargin = AndroidUtilities.dp(48.0f);
            this.f40757g0.addView(view2, layoutParams4);
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.X = frameLayout2;
            i30 = org.telegram.ui.ActionBar.g6.f23053d6;
            z14 = this.d;
            if (z14) {
                themedColor = org.telegram.ui.ActionBar.g6.C0(i30);
            } else {
                themedColor = getThemedColor(i30);
            }
            frameLayout2.setBackgroundColor(themedColor);
            this.f40757g0.addView(this.X, h7.z5.e(-1, 48, 83));
            ag.t0 t0Var2 = new ag.t0(context, this);
            this.W = t0Var2;
            this.X.addView(t0Var2, h7.z5.e(22, 8, 17));
            TextView textView24 = new TextView(context);
            this.Z = textView24;
            textView24.setTextSize(1, 14.0f);
            TextView textView25 = this.Z;
            i31 = org.telegram.ui.ActionBar.g6.Ae;
            if (z14) {
                themedColor2 = org.telegram.ui.ActionBar.g6.C0(i31);
            } else {
                themedColor2 = getThemedColor(i31);
            }
            textView25.setTextColor(themedColor2);
            this.Z.setGravity(17);
            this.Z.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(251658240, 0));
            this.Z.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
            this.Z.setText(LocaleController.getString(R.string.Cancel));
            this.Z.setTypeface(AndroidUtilities.bold());
            this.X.addView(this.Z, h7.z5.e(-2, -1, 51));
            final int i421 = 0;
            this.Z.setOnClickListener(new View.OnClickListener(this) {

                public final nc1 f45123b;

                {
                    this.f45123b = this;
                }

                @Override
                public final void onClick(View view3) throws Throwable {
                    switch (i421) {
                        case 0:
                            this.f45123b.O0(false);
                            break;
                        case 1:
                            nc1.U(this.f45123b);
                            break;
                        case 2:
                            this.f45123b.f40749e.M(null, null);
                            break;
                        case 3:
                            this.f45123b.N0(false);
                            break;
                        default:
                            this.f45123b.N0(true);
                            break;
                    }
                }
            });
            TextView textView26 = new TextView(context);
            this.Y = textView26;
            textView26.setTextSize(1, 14.0f);
            TextView textView120 = this.Y;
            if (z14) {
                themedColor3 = org.telegram.ui.ActionBar.g6.C0(i31);
            } else {
                themedColor3 = getThemedColor(i31);
            }
            textView120.setTextColor(themedColor3);
            this.Y.setGravity(17);
            this.Y.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(251658240, 0));
            this.Y.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
            this.Y.setText(LocaleController.getString(R.string.ApplyTheme));
            this.Y.setTypeface(AndroidUtilities.bold());
            this.X.addView(this.Y, h7.z5.e(-2, -1, 53));
            i29 = 1;
            this.Y.setOnClickListener(new View.OnClickListener(this) {

                public final nc1 f45123b;

                {
                    this.f45123b = this;
                }

                @Override
                public final void onClick(View view3) throws Throwable {
                    switch (i29) {
                        case 0:
                            this.f45123b.O0(false);
                            break;
                        case 1:
                            nc1.U(this.f45123b);
                            break;
                        case 2:
                            this.f45123b.f40749e.M(null, null);
                            break;
                        case 3:
                            this.f45123b.N0(false);
                            break;
                        default:
                            this.f45123b.N0(true);
                            break;
                    }
                }
            });
        } else {
            i29 = 1;
        }
        if (i10 == i29) {
            X0();
        }
        this.f40750e0 = S0();
        b1(true);
        m1(false);
        this.f40742c = new Scroller(getContext());
        b5Var = this.parentLayout;
        if (b5Var != null) {
            this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
            if (i10 == 2) {
                this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
            }
        }
        return this.fragmentView;
    }

    public final void d1(org.telegram.ui.Cells.v0 v0Var) {
        float measuredWidth;
        if (this.f40784t0 == null) {
            return;
        }
        mb1 mb1Var = this.f40735a;
        Bitmap bitmap = mb1Var.f40435r;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            measuredWidth = ((this.f40784t0.getMeasuredWidth() - (Math.max(this.f40784t0.getMeasuredWidth() / width, this.f40784t0.getMeasuredHeight() / mb1Var.f40435r.getHeight()) * width)) / 2.0f) + this.T1 + 0.0f;
        } else {
            measuredWidth = this.T1 + 0.0f;
        }
        float y10 = v0Var.getY() - ((-this.f40784t0.F) + 0.0f);
        int measuredHeight = this.f40784t0.getMeasuredHeight();
        float f10 = this.I1 ? this.f40764j1 * this.f40766k1 : 0.0f;
        v0Var.f25770s0 = true;
        v0Var.f25767r0 = measuredHeight;
        v0Var.f25762p0 = y10;
        v0Var.f25764q0 = measuredWidth;
        v0Var.O1 = f10;
        v0Var.P1.setColor(i0.b.k(-16777216, (int) (f10 * 255.0f)));
        v0Var.invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        TLRPC.TL_wallPaper tL_wallPaper2;
        String str;
        String str2;
        if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (this.F1 == ((Long) objArr[2]).longValue()) {
                this.R1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                h1(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.zk0 zk0Var = this.f40763j0;
            if (zk0Var == null) {
                return;
            }
            int childCount = zk0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f40763j0.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) childAt).b0(0, true);
                }
            }
            return;
        }
        if (i10 == NotificationCenter.invalidateMotionBackground) {
            gb1 gb1Var = this.f40776q0;
            if (gb1Var != null) {
                gb1Var.f1();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.didSetNewWallpapper) {
            if (this.f40774p0 != null) {
                b1(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.wallpapersNeedReload) {
            Object obj = this.f40795x1;
            if (obj instanceof xh1) {
                xh1 xh1Var = (xh1) obj;
                if (xh1Var.f44467a == null) {
                    xh1Var.f44467a = (String) objArr[0];
                    return;
                }
                return;
            }
            return;
        }
        long jCalcHash = 0;
        if (i10 != NotificationCenter.wallpapersDidLoad) {
            if (i10 != NotificationCenter.wallpaperSettedToUser || this.F1 == 0) {
                return;
            }
            finishFragment();
            return;
        }
        ArrayList arrayList = (ArrayList) objArr[0];
        this.Q0.clear();
        HashMap map = this.R0;
        map.clear();
        int size = arrayList.size();
        boolean z10 = false;
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i13);
            if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                TLRPC.Document document = wallPaper.document;
                if (document != null && !map.containsKey(Long.valueOf(document.f22386id))) {
                    this.Q0.add(wallPaper);
                    map.put(Long.valueOf(wallPaper.document.f22386id), wallPaper);
                }
                org.telegram.ui.ActionBar.e6 e6Var = this.f40781s;
                if (e6Var != null && (str2 = e6Var.f22895o) != null && str2.equals(wallPaper.slug)) {
                    this.S0 = (TLRPC.TL_wallPaper) wallPaper;
                    b1(false);
                    j1();
                } else if (e6Var != null || (tL_wallPaper2 = this.S0) == null || (str = tL_wallPaper2.slug) == null || !str.equals(wallPaper.slug)) {
                }
                z10 = true;
            }
        }
        if (!z10 && (tL_wallPaper = this.S0) != null) {
            this.Q0.add(0, tL_wallPaper);
        }
        lc1 lc1Var = this.M0;
        if (lc1Var != null) {
            lc1Var.l();
        }
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i14);
            if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                jCalcHash = MediaDataController.calcHash(jCalcHash, wallPaper2.f22532id);
            }
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = jCalcHash;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new eb1(this, 1)), this.classGuid);
    }

    public final void e1() {
        if (this.f40774p0 == null || this.G0 == null || this.f40781s.f22888g == 0) {
            return;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("bganimationhint", false)) {
            return;
        }
        if (this.f40791w0 == null) {
            org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(getParentActivity(), 8);
            this.f40791w0 = x30Var;
            x30Var.setShowingDuration(5000L);
            this.f40791w0.setAlpha(0.0f);
            this.f40791w0.setVisibility(4);
            this.f40791w0.setText(LocaleController.getString(R.string.BackgroundAnimateInfo));
            this.f40791w0.setExtraTranslationY(AndroidUtilities.dp(6.0f));
            this.f40757g0.addView(this.f40791w0, h7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        AndroidUtilities.runOnUIThread(new m21(13, this, globalMainSettings), 500L);
    }

    public final void f1(int i10, boolean z10, boolean z11) {
        int iIndexOf;
        int i11;
        boolean z12 = z10 && i10 == 1 && this.S0 != null;
        int i12 = this.f40738b;
        if (z10) {
            if (i10 != 0) {
                this.T0 = this.S0;
                this.f40762i1 = this.f40760h1;
                this.M0.l();
                ArrayList arrayList = this.Q0;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.S0;
                    if (tL_wallPaper == null) {
                        iIndexOf = 0;
                    } else {
                        iIndexOf = arrayList.indexOf(tL_wallPaper) + (i12 == 2 ? 1 : 0);
                    }
                    this.N0.h1(iIndexOf, (this.L0.getMeasuredWidth() - AndroidUtilities.dp(124.0f)) / 2);
                }
            } else if (i12 == 2) {
                this.W0 = this.V0;
                int i13 = this.X0;
                this.f40737a1 = i13;
                int i14 = this.Y0;
                this.f40740b1 = i14;
                int i15 = this.Z0;
                this.f40744c1 = i15;
                this.f40751e1 = this.K;
                if (i15 != 0) {
                    i11 = 4;
                } else if (i14 != 0) {
                    i11 = 3;
                } else {
                    i11 = i13 != 0 ? 2 : 1;
                }
                this.R.f(0, 4, i11, false);
                this.R.e(this.Z0, 3);
                this.R.e(this.Y0, 2);
                this.R.e(this.X0, 1);
                this.R.e(this.V0, 0);
            }
        }
        if (i12 == 1 || i12 == 2) {
            this.F0[z12 ? (char) 2 : (char) 0].setVisibility(0);
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.j0 j0Var = this.P0;
            if (!j0Var.H) {
                float f10 = this.f40760h1;
                if (f10 < 0.0f) {
                    float f11 = -f10;
                    this.f40760h1 = f11;
                    j0Var.setProgress(f11);
                }
            }
        }
        FrameLayout[] frameLayoutArr = this.H0;
        if (!z11) {
            char c10 = i10 == 0 ? (char) 1 : (char) 0;
            if (z10) {
                frameLayoutArr[i10].setVisibility(0);
                if (i12 == 1) {
                    this.f40776q0.setTranslationY(i10 == 1 ? -AndroidUtilities.dp(21.0f) : 0.0f);
                    this.F0[2].setAlpha(z12 ? 1.0f : 0.0f);
                    this.F0[0].setAlpha(z12 ? 0.0f : 1.0f);
                    if (i10 == 1) {
                        frameLayoutArr[i10].setAlpha(1.0f);
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        frameLayoutArr[c10].setAlpha(0.0f);
                    }
                    AndroidUtilities.hideKeyboard(this.R.A[1]);
                } else if (i12 == 2) {
                    this.f40776q0.setTranslationY(AndroidUtilities.dp((this.f40792w1 == null ? 0 : 58) + 72) + (-AndroidUtilities.dp(i10 == 0 ? 343.0f : 316.0f)) + (U0() ? AndroidUtilities.navigationBarHeight : 0));
                    this.F0[2].setAlpha(z12 ? 1.0f : 0.0f);
                    this.F0[0].setAlpha(z12 ? 0.0f : 1.0f);
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
                    AndroidUtilities.hideKeyboard(this.R.A[1]);
                }
            } else {
                this.f40776q0.setTranslationY(0.0f);
                FrameLayout frameLayout = frameLayoutArr[i10];
                frameLayout.setTranslationY(frameLayout.getMeasuredHeight());
                this.F0[0].setAlpha(1.0f);
                this.F0[2].setAlpha(1.0f);
                this.f40784t0.setAlpha(1.0f);
            }
            if (z10 && frameLayoutArr[c10].getVisibility() == 0) {
                frameLayoutArr[c10].setAlpha(1.0f);
                frameLayoutArr[c10].setVisibility(4);
            } else if (!z10) {
                frameLayoutArr[i10].setVisibility(4);
            }
            if (i12 == 1 || i12 == 2) {
                this.F0[z12 ? (char) 0 : (char) 2].setVisibility(4);
                return;
            } else {
                if (i10 == 1) {
                    frameLayoutArr[c10].setAlpha(0.0f);
                    return;
                }
                return;
            }
        }
        this.f40771n1 = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        int i16 = i10 == 0 ? 1 : 0;
        if (z10) {
            frameLayoutArr[i10].setVisibility(0);
            if (i12 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(this.f40776q0, (Property<gb1, Float>) View.TRANSLATION_Y, i10 == 1 ? -AndroidUtilities.dp(21.0f) : 0.0f));
                org.telegram.ui.Components.q71 q71Var = this.F0[2];
                Property property = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(q71Var, (Property<org.telegram.ui.Components.q71, Float>) property, z12 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.F0[0], (Property<org.telegram.ui.Components.q71, Float>) property, z12 ? 0.0f : 1.0f));
                if (i10 == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) property, 0.0f, 1.0f));
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i16], (Property<FrameLayout, Float>) property, 0.0f));
                }
                AndroidUtilities.hideKeyboard(this.R.A[1]);
            } else if (i12 == 2) {
                gb1 gb1Var = this.f40776q0;
                Property property2 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(gb1Var, (Property<gb1, Float>) property2, AndroidUtilities.dp((this.f40792w1 == null ? 0 : 58) + 72) + (-frameLayoutArr[i10].getMeasuredHeight()) + (U0() ? AndroidUtilities.navigationBarHeight : 0)));
                org.telegram.ui.Components.q71 q71Var2 = this.F0[2];
                Property property3 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(q71Var2, (Property<org.telegram.ui.Components.q71, Float>) property3, z12 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.F0[0], (Property<org.telegram.ui.Components.q71, Float>) property3, z12 ? 0.0f : 1.0f));
                if (frameLayoutArr[i16].getVisibility() == 0) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i16], (Property<FrameLayout, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) property3, 0.0f, 1.0f));
                    frameLayoutArr[i10].setTranslationY(0.0f);
                } else {
                    FrameLayout frameLayout2 = frameLayoutArr[i10];
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, frameLayout2.getMeasuredHeight(), 0.0f));
                }
            } else {
                if (i10 == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i16], (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                }
                AndroidUtilities.hideKeyboard(this.R.A[1]);
            }
        } else {
            gb1 gb1Var2 = this.f40776q0;
            Property property4 = View.TRANSLATION_Y;
            arrayList2.add(ObjectAnimator.ofFloat(gb1Var2, (Property<gb1, Float>) property4, 0.0f));
            FrameLayout frameLayout3 = frameLayoutArr[i10];
            arrayList2.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property4, frameLayout3.getMeasuredHeight()));
            org.telegram.ui.Components.q71 q71Var3 = this.F0[0];
            Property property5 = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(q71Var3, (Property<org.telegram.ui.Components.q71, Float>) property5, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.F0[2], (Property<org.telegram.ui.Components.q71, Float>) property5, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.f40784t0, (Property<cc1, Float>) property5, 1.0f));
        }
        this.f40771n1.playTogether(arrayList2);
        this.f40771n1.addListener(new tb1(this, z10, i16, i10, z12));
        this.f40771n1.setInterpolator(org.telegram.ui.Components.er.f28123g);
        this.f40771n1.setDuration(200L);
        this.f40771n1.start();
    }

    public final void g1() {
        if (this.f40748d2 != null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) (U0() ? this.parentLayout.getBottomSheet().getWindow() : getParentActivity().getWindow()).getDecorView();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        this.K1.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.K1.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int i10 = 2;
        int[] iArr = new int[2];
        this.K1.getLocationInWindow(iArr);
        float f10 = iArr[0];
        float f11 = iArr[1];
        float measuredWidth = (this.K1.getMeasuredWidth() / 2.0f) + f10;
        float measuredHeight = (this.K1.getMeasuredHeight() / 2.0f) + f11;
        float fMax = Math.max(bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
        hc hcVar = new hc(this, getParentActivity(), canvas, measuredWidth, measuredHeight, fMax, paint, bitmapCreateBitmap, paint2, f10, f11, 2);
        this.f40748d2 = hcVar;
        hcVar.setOnTouchListener(new kh.e(i10));
        this.f40752e2 = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f40756f2 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new lh.cb(this, 3));
        this.f40756f2.addListener(new qb1(this, 4));
        this.f40756f2.setDuration(400L);
        this.f40756f2.setInterpolator(org.telegram.ui.Components.ws.f34319e);
        this.f40756f2.start();
        frameLayout.addView(this.f40748d2, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new ya1(this, i10));
    }

    @Override
    public final int getObserverTag() {
        return this.f40775p1;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.f40735a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return this.H1 ? S0() : super.getThemeDescriptions();
    }

    public final void h1(boolean z10) {
        long j10 = this.F1;
        if (j10 > 0) {
            this.f40789v1.d(LocaleController.getString(R.string.ApplyWallpaperForMe));
            return;
        }
        if (j10 >= 0) {
            this.f40789v1.d(LocaleController.getString(R.string.ApplyWallpaper));
            return;
        }
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.F1));
        int i10 = 0;
        if (chat == null) {
            this.f40789v1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, LocaleController.getString(R.string.AccDescrChannel).toLowerCase()));
            return;
        }
        this.f40789v1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, chat.title));
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.R1;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
            if (this.f40768m1 == null) {
                org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(R.drawable.mini_switch_lock, 0);
                this.f40768m1 = cqVar;
                cqVar.setTopOffset(1);
            }
            spannableStringBuilder.setSpan(this.f40768m1, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", R0(), new Object[0]));
            this.f40789v1.c(spannableStringBuilder, z10);
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.R1;
        if (tL_premium_boostsStatus2 != null) {
            this.f40789v1.c(null, z10);
            return;
        }
        if (this.F1 >= 0 || this.P1 || this.Q1 || tL_premium_boostsStatus2 != null) {
            return;
        }
        this.P1 = true;
        getMessagesController().getBoostsController().getBoostsStats(this.F1, new db1(this, i10));
    }

    public final void i1() {
        if (this.B1 && this.f40783s1 == null) {
            Bitmap bitmap = this.f40798y1;
            if (bitmap != null) {
                this.f40785t1 = bitmap;
                this.f40783s1 = Utilities.blurWallpaper(bitmap);
            } else {
                ImageReceiver imageReceiver = this.f40784t0.getImageReceiver();
                if (imageReceiver.hasNotThumb() || imageReceiver.hasStaticThumb()) {
                    this.f40785t1 = imageReceiver.getBitmap();
                    this.f40783s1 = Utilities.blurWallpaper(imageReceiver.getBitmap());
                }
            }
        }
        if (!this.B1) {
            b1(false);
            return;
        }
        Bitmap bitmap2 = this.f40783s1;
        if (bitmap2 != null) {
            this.f40784t0.setImageBitmap(bitmap2);
        }
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.f40738b != 2) {
            return false;
        }
        if (!this.W1 || motionEvent == null) {
            return true;
        }
        return motionEvent.getY() <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight));
    }

    public final void j1() {
        File httpFilePath;
        String name;
        int i10;
        long j10;
        File pathToAttach;
        String attachFileName;
        FrameLayout frameLayout;
        Object obj = this.S0;
        if (obj == null) {
            obj = this.f40795x1;
        }
        boolean z10 = obj instanceof TLRPC.TL_wallPaper;
        if (z10 || (obj instanceof MediaController.SearchImage)) {
            if (z10) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                attachFileName = FileLoader.getAttachFileName(tL_wallPaper.document);
                if (TextUtils.isEmpty(attachFileName)) {
                    return;
                }
                pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(tL_wallPaper.document, true);
                j10 = tL_wallPaper.document.size;
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
                String str = name;
                pathToAttach = httpFilePath;
                attachFileName = str;
                if (TextUtils.isEmpty(attachFileName)) {
                    return;
                }
            }
            boolean zExists = pathToAttach.exists();
            int i11 = this.f40738b;
            if (zExists) {
                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                this.f40784t0.invalidate();
                if (i11 == 2) {
                    if (j10 == 0 || this.F1 != 0) {
                        this.f40772o0.setSubtitle(null);
                    } else {
                        this.f40772o0.setSubtitle(AndroidUtilities.formatFileSize(j10));
                    }
                }
            } else {
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(attachFileName, null, this);
                if (i11 == 2 && this.F1 == 0) {
                    this.f40772o0.setSubtitle(LocaleController.getString(R.string.LoadingFullImage));
                }
                this.f40784t0.invalidate();
            }
            if (this.S0 == null && (frameLayout = this.f40786u0) != null) {
                frameLayout.setAlpha(zExists ? 1.0f : 0.5f);
            }
            if (i11 == 0) {
                this.Y.setEnabled(zExists);
                this.Y.setAlpha(zExists ? 1.0f : 0.5f);
                return;
            }
            if (i11 != 2) {
                this.f40753f.setEnabled(zExists);
                this.f40753f.setAlpha(zExists ? 1.0f : 0.5f);
                return;
            }
            this.f40797y0.setEnabled(zExists);
            dc1 dc1Var = this.f40789v1;
            if (dc1Var != null) {
                dc1Var.setAlpha(zExists ? 1.0f : 0.5f);
            }
            dc1 dc1Var2 = this.f40792w1;
            if (dc1Var2 != null) {
                dc1Var2.setAlpha(zExists ? 1.0f : 0.5f);
            }
        }
    }

    public final void k1() {
        this.f40784t0.getImageReceiver().setAlpha(Math.abs(this.f40760h1));
        this.f40784t0.invalidate();
        this.L0.f1();
        if (this.f40760h1 >= 0.0f) {
            this.f40784t0.getImageReceiver().setGradientBitmap(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f40784t0.getImageReceiver().setBlendMode(null);
            }
            if (this.f40784t0.getBackground() instanceof org.telegram.ui.Components.nb0) {
                this.f40784t0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.nb0) this.f40784t0.getBackground()).f30929k);
            }
        }
        this.f40735a.b(this.f40784t0.getBackground(), this.f40784t0.getBackground(), Float.valueOf(this.f40760h1));
        V0();
    }

    public final void l1() {
        int i10 = this.f40738b;
        if (i10 == 1 || i10 == 2) {
            if (this.S0 == null && (this.f40795x1 instanceof wh1)) {
                this.F0[2].a(false, true);
            }
            this.F0[this.S0 != null ? (char) 2 : (char) 0].setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            org.telegram.ui.Components.q71 q71Var = this.F0[2];
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(q71Var, (Property<org.telegram.ui.Components.q71, Float>) property, this.S0 != null ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.F0[0], (Property<org.telegram.ui.Components.q71, Float>) property, this.S0 != null ? 0.0f : 1.0f));
            animatorSet.addListener(new rb1(this));
            animatorSet.setInterpolator(org.telegram.ui.Components.er.f28123g);
            animatorSet.setDuration(200L);
            animatorSet.start();
            return;
        }
        boolean zIsEnabled = this.F0[0].isEnabled();
        TLRPC.TL_wallPaper tL_wallPaper = this.S0;
        if (zIsEnabled == (tL_wallPaper != null)) {
            return;
        }
        if (tL_wallPaper == null) {
            this.F0[0].a(false, true);
        }
        this.F0[0].setEnabled(this.S0 != null);
        if (this.S0 != null) {
            this.F0[0].setVisibility(0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F0[1].getLayoutParams();
        AnimatorSet animatorSet2 = new AnimatorSet();
        int iDp = (AndroidUtilities.dp(9.0f) + layoutParams.width) / 2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.F0[0], (Property<org.telegram.ui.Components.q71, Float>) View.ALPHA, this.S0 == null ? 0.0f : 1.0f));
        org.telegram.ui.Components.q71 q71Var2 = this.F0[0];
        Property property2 = View.TRANSLATION_X;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(q71Var2, (Property<org.telegram.ui.Components.q71, Float>) property2, this.S0 != null ? 0.0f : iDp));
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.F0[1], (Property<org.telegram.ui.Components.q71, Float>) property2, this.S0 == null ? -iDp : 0.0f));
        animatorSet2.setInterpolator(org.telegram.ui.Components.er.f28123g);
        animatorSet2.setDuration(200L);
        animatorSet2.addListener(new sb1(this));
        animatorSet2.start();
    }

    public final void m1(boolean z10) {
        char c10;
        char c11;
        float f10;
        boolean z11;
        int themedColor;
        int i10 = Build.VERSION.SDK_INT;
        int i11 = this.f40738b;
        org.telegram.ui.ActionBar.e6 e6Var = this.f40781s;
        if (i10 >= 29) {
            if (i11 == 0) {
                themedColor = e6Var != null ? (int) e6Var.f22892l : getThemedColor(org.telegram.ui.ActionBar.g6.Pd);
            } else if (i11 == 1) {
                int iB0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Pd);
                long j10 = e6Var.f22892l;
                int i12 = (int) j10;
                if (i12 != 0 || j10 == 0) {
                    if (i12 != 0) {
                        iB0 = i12;
                    }
                    themedColor = iB0;
                } else {
                    themedColor = 0;
                }
            } else if (this.f40795x1 instanceof wh1) {
                themedColor = this.Y0;
            } else {
                themedColor = 0;
            }
            if (themedColor == 0 || this.f40760h1 < 0.0f) {
                this.f40784t0.getImageReceiver().setBlendMode(null);
            } else {
                this.f40784t0.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
            }
        }
        int i13 = 2;
        if (this.f40799z0 == null) {
            c10 = 3;
            c11 = 4;
            f10 = 1.0f;
        } else {
            if (i11 != 2) {
                if (i11 == 1) {
                    int iB1 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Od);
                    long j11 = e6Var.f22891k;
                    int i14 = (int) j11;
                    if (i14 == 0 && j11 != 0) {
                        iB1 = 0;
                    } else if (i14 != 0) {
                        iB1 = i14;
                    }
                    z11 = iB1 != 0;
                }
            } else if (this.X0 != 0) {
            }
            boolean z12 = this.f40799z0.getTag() != null;
            this.f40799z0.setTag(z11 ? 1 : null);
            if (z12 != z11) {
                if (z11) {
                    this.f40799z0.setVisibility(0);
                }
                AnimatorSet animatorSet = this.D0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                if (z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.D0 = animatorSet2;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f40799z0, (Property<kb1, Float>) View.ALPHA, z11 ? 1.0f : 0.0f);
                    c11 = 4;
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f40799z0, (Property<kb1, Float>) View.SCALE_X, z11 ? 1.0f : 0.0f);
                    f10 = 1.0f;
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f40799z0, (Property<kb1, Float>) View.SCALE_Y, z11 ? 1.0f : 0.0f);
                    org.telegram.ui.Components.q71 q71Var = this.F0[0];
                    Property property = View.TRANSLATION_X;
                    c10 = 3;
                    animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, ObjectAnimator.ofFloat(q71Var, (Property<org.telegram.ui.Components.q71, Float>) property, z11 ? AndroidUtilities.dp(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.F0[1], (Property<org.telegram.ui.Components.q71, Float>) property, z11 ? -AndroidUtilities.dp(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.F0[2], (Property<org.telegram.ui.Components.q71, Float>) property, z11 ? AndroidUtilities.dp(34.0f) : 0.0f));
                    this.D0.setDuration(180L);
                    this.D0.addListener(new qb1(this, i13));
                    this.D0.setInterpolator(org.telegram.ui.Components.er.f28123g);
                    this.D0.start();
                } else {
                    c10 = 3;
                    c11 = 4;
                    f10 = 1.0f;
                    this.f40799z0.setAlpha(z11 ? 1.0f : 0.0f);
                    this.f40799z0.setScaleX(z11 ? 1.0f : 0.0f);
                    this.f40799z0.setScaleY(z11 ? 1.0f : 0.0f);
                    this.F0[0].setTranslationX(z11 ? AndroidUtilities.dp(34.0f) : 0.0f);
                    this.F0[1].setTranslationX(z11 ? -AndroidUtilities.dp(34.0f) : 0.0f);
                    this.F0[2].setTranslationX(z11 ? AndroidUtilities.dp(34.0f) : 0.0f);
                }
            } else {
                c10 = 3;
                c11 = 4;
                f10 = 1.0f;
            }
        }
        kb1 kb1Var = this.A0;
        if (kb1Var != null) {
            boolean z13 = kb1Var.getTag() != null;
            this.A0.setTag(1);
            if (!z13) {
                this.A0.setVisibility(0);
                AnimatorSet animatorSet3 = this.E0;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                }
                if (!z10) {
                    this.A0.setAlpha(1.0f);
                    this.A0.setScaleX(1.0f);
                    this.A0.setScaleY(1.0f);
                    this.G0[0].setTranslationX(-AndroidUtilities.dp(34.0f));
                    this.G0[1].setTranslationX(AndroidUtilities.dp(34.0f));
                    return;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.E0 = animatorSet4;
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.A0, (Property<kb1, Float>) View.ALPHA, f10);
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.A0, (Property<kb1, Float>) View.SCALE_X, f10);
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.A0, (Property<kb1, Float>) View.SCALE_Y, f10);
                org.telegram.ui.Components.q71 q71Var2 = this.G0[0];
                Property property2 = View.TRANSLATION_X;
                ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(q71Var2, (Property<org.telegram.ui.Components.q71, Float>) property2, -AndroidUtilities.dp(34.0f));
                ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.G0[1], (Property<org.telegram.ui.Components.q71, Float>) property2, AndroidUtilities.dp(34.0f));
                Animator[] animatorArr = new Animator[5];
                animatorArr[0] = objectAnimatorOfFloat4;
                animatorArr[1] = objectAnimatorOfFloat5;
                animatorArr[2] = objectAnimatorOfFloat6;
                animatorArr[c10] = objectAnimatorOfFloat7;
                animatorArr[c11] = objectAnimatorOfFloat8;
                animatorSet4.playTogether(animatorArr);
                this.E0.setDuration(180L);
                this.E0.addListener(new qb1(this, 3));
                this.E0.setInterpolator(org.telegram.ui.Components.er.f28123g);
                this.E0.start();
            }
        }
    }

    public final void n1() {
        int childCount = this.L0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.L0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.h5) {
                ((org.telegram.ui.Cells.h5) childAt).u(true);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) throws Throwable {
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
        if (b5Var == null || b5Var.getBottomSheet() == null) {
            return;
        }
        this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
        if (this.f40738b != 2 || this.F1 == 0) {
            return;
        }
        this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
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
        int i10 = this.f40738b;
        if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 == 2 || i10 == 1) {
            org.telegram.ui.ActionBar.g6.N = true;
        }
        if (i10 == 0 && this.f40781s == null) {
            this.A1 = org.telegram.ui.ActionBar.g6.f23138i0;
        } else {
            Point point = AndroidUtilities.displaySize;
            int iMin = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            int iMax = Math.max(point2.x, point2.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (iMin / AndroidUtilities.density));
            sb2.append("_");
            this.C1 = a9.p.k((int) (iMax / AndroidUtilities.density), "_f", sb2);
            Point point3 = AndroidUtilities.displaySize;
            this.D1 = Math.max(point3.x, point3.y);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            this.f40775p1 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
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
        ag.y1 y1Var = this.f40757g0;
        if (y1Var != null && this.M != null) {
            y1Var.getViewTreeObserver().removeOnGlobalLayoutListener(this.M);
        }
        int i10 = this.f40738b;
        if ((i10 == 2 || i10 == 1) && this.l1 == null) {
            AndroidUtilities.runOnUIThread(new tq0(5));
        }
        if (i10 == 2) {
            Bitmap bitmap = this.f40783s1;
            if (bitmap != null) {
                bitmap.recycle();
                this.f40783s1 = null;
            }
            this.f40735a.b(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        } else if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 != 0 || this.f40781s != null) {
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
            this.f40780r1.c(false);
        }
        org.telegram.ui.ActionBar.g6.f23010b = false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        fc1 fc1Var = this.f40765k0;
        if (fc1Var != null) {
            fc1Var.l();
        }
        jc1 jc1Var = this.f40779r0;
        if (jc1Var != null) {
            jc1Var.l();
        }
        if (this.A1) {
            this.f40780r1.c(true);
        }
        org.telegram.ui.ActionBar.g6.f23010b = true;
    }

    @Override
    public final void onSuccessDownload(String str) {
        j1();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (z10 || this.f40738b != 2) {
            return;
        }
        this.f40735a.b(null, null, null);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.c6 c6Var) {
        this.f40735a.f40429a = c6Var;
    }

    public nc1(org.telegram.ui.ActionBar.f6 f6Var, boolean z10, int i10, boolean z11, boolean z12) {
        super(null);
        this.f40735a = new mb1(this);
        this.d = true;
        this.f40769n = 1;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(this, 0, false);
        this.N = n5Var;
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(this, 0, true);
        this.O = n5Var2;
        org.telegram.ui.ActionBar.n5 n5Var3 = new org.telegram.ui.ActionBar.n5(this, 1, false);
        this.P = n5Var3;
        org.telegram.ui.ActionBar.n5 n5Var4 = new org.telegram.ui.ActionBar.n5(this, 1, true);
        this.Q = n5Var4;
        this.T = -1;
        this.U = new ya1(this, 0);
        this.f40782s0 = new cc1[2];
        this.H0 = new FrameLayout[2];
        this.I0 = new TextView[2];
        this.J0 = new TextView[2];
        this.K0 = new FrameLayout[2];
        this.R0 = new HashMap();
        this.f40760h1 = 0.5f;
        this.f40764j1 = 0.0f;
        this.f40773o1 = PorterDuff.Mode.SRC_IN;
        this.f40787u1 = 1.0f;
        this.C1 = "640_360";
        this.D1 = 1920;
        this.G1 = true;
        this.O1 = new org.telegram.ui.Components.x10(getParentActivity(), new ob1(this));
        this.P1 = false;
        this.Q1 = false;
        this.f40738b = i10;
        this.f40739b0 = z12;
        this.f40736a0 = f6Var;
        this.f40746d0 = z10;
        this.f40743c0 = z11;
        if (i10 == 1) {
            org.telegram.ui.ActionBar.e6 e6VarK = f6Var.k(!z11);
            this.f40781s = e6VarK;
            if (e6VarK != null) {
                this.d = false;
                this.f40790w = e6VarK.f22885c;
                this.f40793x = e6VarK.d;
                this.f40796y = e6VarK.f22886e;
                this.A = e6VarK.f22887f;
                this.B = e6VarK.f22888g;
                this.C = e6VarK.h;
                this.D = e6VarK.f22889i;
                this.E = e6VarK.f22890j;
                this.F = e6VarK.f22891k;
                this.G = e6VarK.f22892l;
                this.H = e6VarK.f22893m;
                this.I = e6VarK.f22896p;
                this.J = e6VarK.f22895o;
                this.K = e6VarK.f22894n;
            }
        } else {
            if (i10 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.e6 e6VarK2 = f6Var.k(false);
            this.f40781s = e6VarK2;
            if (e6VarK2 != null) {
                this.S0 = e6VarK2.f22899s;
            }
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f40781s;
        if (e6Var != null) {
            this.A1 = e6Var.f22897q;
            if (!TextUtils.isEmpty(e6Var.f22895o)) {
                this.f40760h1 = this.f40781s.f22896p;
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

    public nc1(org.telegram.ui.ActionBar.f6 f6Var) {
        this(f6Var, false, 0, false, false);
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
