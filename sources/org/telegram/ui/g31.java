package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class g31 extends org.telegram.ui.ActionBar.o2 {
    public static final a0.f R;
    public static List S;
    public static boolean T;
    public a31 E;
    public org.telegram.ui.Components.bj0 F;
    public ImageView G;
    public Bitmap H;
    public Bitmap I;
    public org.telegram.ui.ActionBar.e4 J;
    public boolean K;
    public long L;
    public long M;
    public int N;
    public int O;
    public boolean P;
    public i0.b Q;
    public final o0.a f33832a;
    public final org.telegram.ui.ActionBar.e4 f33833b;
    public final Rect f33834c;
    public final a0.f d;
    public int[] e;
    public f31 f33835f;
    public org.telegram.ui.Components.cc0 h;
    public org.telegram.ui.Components.cc0 f33836n;
    public org.telegram.ui.Components.cc0 f33837r;
    public ValueAnimator f33838s;
    public ValueAnimator v;
    public u50 f33839w;
    public ci.n6 f33840x;
    public org.telegram.ui.Components.u9 f33841y;

    static {
        ?? mVar = new a0.m(0);
        R = mVar;
        mVar.put("🏠d", new int[]{-9324972, -13856649, -6636738, -9915042});
        mVar.put("🐥d", new int[]{-12344463, -7684788, -6442695, -8013488});
        mVar.put("⛄d", new int[]{-10051073, -10897938, -12469550, -7694337});
        mVar.put("💎d", new int[]{-11429643, -11814958, -5408261, -2128185});
        mVar.put("👨\u200d🏫d", new int[]{-6637227, -12015466, -13198627, -10631557});
        mVar.put("🌷d", new int[]{-1146812, -1991901, -1745517, -3443241});
        mVar.put("💜d", new int[]{-1156738, -1876046, -5412366, -28073});
        mVar.put("🎄d", new int[]{-1281978, -551386, -1870308, -742870});
        mVar.put("🎮d", new int[]{-15092782, -2333964, -1684365, -1269214});
        mVar.put("🏠n", new int[]{-15368239, -11899662, -15173939, -13850930});
        mVar.put("🐥n", new int[]{-11033320, -14780848, -9594089, -12604587});
        mVar.put("⛄n", new int[]{-13930790, -13665098, -14833975, -9732865});
        mVar.put("💎n", new int[]{-5089608, -9481473, -14378302, -13337899});
        mVar.put("👨\u200d🏫n", new int[]{-14447768, -9199261, -15356801, -15823723});
        mVar.put("🌷n", new int[]{-2534316, -2984177, -3258783, -5480504});
        mVar.put("💜n", new int[]{-3123030, -2067394, -2599576, -6067757});
        mVar.put("🎄n", new int[]{-2725857, -3242459, -3248848, -3569123});
        mVar.put("🎮n", new int[]{-3718333, -1278154, -16338695, -6076417});
        T = true;
    }

    public g31(Bundle bundle) {
        super(bundle);
        this.f33832a = new o0.a(this);
        org.telegram.ui.ActionBar.e4 e4Var = new org.telegram.ui.ActionBar.e4(this.currentAccount);
        e4Var.e = "🏠";
        e4Var.f18620c = fg.b.d("🏠");
        e4Var.d = TLRPC.ChatTheme.ofEmoticon(e4Var.e);
        org.telegram.ui.ActionBar.d4 d4Var = new org.telegram.ui.ActionBar.d4();
        d4Var.f18575a = org.telegram.ui.ActionBar.j6.N0("Blue");
        d4Var.e = 99;
        e4Var.f18621f.add(d4Var);
        org.telegram.ui.ActionBar.d4 d4Var2 = new org.telegram.ui.ActionBar.d4();
        d4Var2.f18575a = org.telegram.ui.ActionBar.j6.N0("Dark Blue");
        d4Var2.e = 0;
        e4Var.f18621f.add(d4Var2);
        this.f33833b = e4Var;
        this.f33834c = new Rect();
        this.d = new a0.m(0);
        this.e = null;
        this.h = new org.telegram.ui.Components.cc0();
        this.J = e4Var;
        this.O = -1;
        this.Q = i0.b.e;
    }

    public static void U(g31 g31Var) {
        if (g31Var.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && g31Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            g31Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        } else {
            f0(g31Var);
        }
    }

    public static void V(g31 g31Var) {
        T = false;
        List list = S;
        if (list != null && !list.isEmpty()) {
            g31Var.c0(S);
        } else {
            ChatThemeController.getInstance(g31Var.currentAccount).requestAllChatThemes(new v21(g31Var), true);
        }
    }

    public static void W(g31 g31Var, boolean z10, org.telegram.ui.ActionBar.e4 e4Var, org.telegram.ui.ActionBar.d5 d5Var) {
        o0.a aVar = g31Var.f33832a;
        if (z10) {
            aVar.f15310b = e4Var.b(((g31) aVar.f15311c).currentAccount, g31Var.K ? 1 : 0);
        } else {
            aVar.f15310b = g31Var.J.b(((g31) aVar.f15311c).currentAccount, g31Var.K ? 1 : 0);
        }
        d5Var.h = new s21(g31Var, 3);
        ((ActionBarLayout) g31Var.parentLayout).f(d5Var, null);
        LinearLayout linearLayout = g31Var.f33835f.v;
        if (linearLayout != null) {
            linearLayout.setBackground(org.telegram.ui.ActionBar.z5.d(new float[]{6.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.z5.b(g31Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oh)), 25)));
        }
    }

    public static void X(g31 g31Var) {
        g31Var.f33833b.n(g31Var.currentAccount);
        View view = g31Var.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new s21(g31Var, 1), 17L);
    }

    public static void f0(org.telegram.ui.ActionBar.o2 o2Var) {
        w9.e0(o2Var.getParentActivity(), 1, new w21(o2Var.getCurrentAccount(), o2Var));
    }

    public final Bitmap b0(org.telegram.ui.ActionBar.e4 e4Var, boolean z10) {
        if (z10) {
            String str = e4Var.e;
            a0.f fVar = this.d;
            Bitmap bitmap = (Bitmap) fVar.get(str);
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(this.H.getWidth(), this.H.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                int[] iArr = (int[]) R.get(e4Var.e + "n");
                if (iArr != null) {
                    if (this.f33837r == null) {
                        this.f33837r = new org.telegram.ui.Components.cc0(true, 0, 0, 0, 0);
                    }
                    this.f33837r.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                    this.f33837r.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                    this.f33837r.draw(canvas);
                }
                canvas.drawBitmap(this.H, 0.0f, 0.0f, (Paint) null);
                canvas.setBitmap(null);
                fVar.put(e4Var.e, bitmap);
            }
            return bitmap;
        }
        return this.H;
    }

    public final void c0(List list) {
        if (list != null && !list.isEmpty() && this.f33835f != null) {
            list.set(0, this.f33833b);
            ArrayList arrayList = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) list.get(i10);
                e4Var.n(this.currentAccount);
                org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(e4Var);
                boolean z10 = this.K;
                lpVar.f25959c = z10 ? 1 : 0;
                lpVar.e = b0(e4Var, z10);
                arrayList.add(lpVar);
            }
            org.telegram.ui.Components.kp kpVar = this.f33835f.f33532b;
            kpVar.d = arrayList;
            kpVar.l();
            int i11 = 0;
            while (true) {
                if (i11 != arrayList.size()) {
                    if (fg.b.a(((org.telegram.ui.Components.lp) arrayList.get(i11)).f25957a.f18620c, this.J.f18620c)) {
                        this.f33835f.K = (org.telegram.ui.Components.lp) arrayList.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1) {
                this.f33835f.b(i11);
            }
            f31 f31Var = this.f33835f;
            d31 d31Var = f31Var.F;
            d31Var.setAlpha(0.0f);
            d31Var.animate().alpha(1.0f).setDuration(150L).start();
            d31Var.setVisibility(0);
            org.telegram.ui.Components.t00 t00Var = f31Var.f33536r;
            t00Var.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.aa(t00Var)).setDuration(150L).start();
            org.telegram.ui.Components.ml0 ml0Var = f31Var.f33540y;
            ml0Var.setAlpha(0.0f);
            ml0Var.animate().alpha(1.0f).setDuration(150L).start();
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g31.createView(android.content.Context):android.view.View");
    }

    public final void d0(int i10, org.telegram.ui.ActionBar.e4 e4Var, boolean z10) {
        float f7;
        String str;
        org.telegram.ui.ActionBar.i6 A0;
        this.O = i10;
        org.telegram.ui.ActionBar.e4 e4Var2 = this.J;
        final boolean z11 = this.K;
        this.J = e4Var;
        org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) e4Var.f18621f.get(z11 ? 1 : 0);
        ValueAnimator valueAnimator = this.f33838s;
        if (valueAnimator != null) {
            f7 = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.f33838s.cancel();
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.cc0 cc0Var = this.h;
        this.f33836n = cc0Var;
        cc0Var.q(false);
        this.f33836n.setAlpha(255);
        org.telegram.ui.Components.cc0 cc0Var2 = new org.telegram.ui.Components.cc0();
        this.h = cc0Var2;
        cc0Var2.setCallback(this.f33839w);
        this.h.n(d4Var.f18582k, d4Var.f18583l, d4Var.f18584m, d4Var.f18585n);
        this.h.r(this.f33839w);
        this.h.s(1.0f);
        org.telegram.ui.Components.cc0 cc0Var3 = this.h;
        cc0Var3.N = true;
        org.telegram.ui.Components.cc0 cc0Var4 = this.f33836n;
        if (cc0Var4 != null) {
            cc0Var3.h = cc0Var4.h;
        }
        this.E.f31705a.h = cc0Var3.h;
        TLRPC.WallPaper k10 = this.J.k(z11 ? 1 : 0);
        if (k10 != null) {
            org.telegram.ui.Components.cc0 cc0Var5 = this.h;
            cc0Var5.t(cc0Var5.f23019u, k10.settings.intensity);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.J.o(z11 ? 1 : 0, new ResultCallback() {
                @Override
                public final void onComplete(Object obj) {
                    boolean z12;
                    Pair pair = (Pair) obj;
                    g31 g31Var = g31.this;
                    long i11 = g31Var.J.i(z11 ? 1 : 0);
                    if (pair != null && i11 != 0) {
                        long longValue = ((Long) pair.first).longValue();
                        Bitmap bitmap = ((dg.a) pair.second).f7727b;
                        if (longValue == i11 && bitmap != null) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            int i12 = g31Var.h.f23015q;
                            if (elapsedRealtime2 > 150) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            g31Var.e0(i12, bitmap, z12);
                        }
                    }
                }

                @Override
                public final void onError(Throwable th2) {
                    org.telegram.tgnet.l.a(this, th2);
                }

                @Override
                public final void onError(TLRPC.TL_error tL_error) {
                    org.telegram.tgnet.l.b(this, tL_error);
                }
            });
        } else {
            Utilities.themeQueue.postRunnable(new s21(this, 2), 35L);
        }
        org.telegram.ui.Components.cc0 cc0Var6 = this.h;
        cc0Var6.u(cc0Var6.f());
        a0.f fVar = R;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e4Var.e);
        if (z11) {
            str = "n";
        } else {
            str = "d";
        }
        sb2.append(str);
        int[] iArr = (int[]) fVar.get(sb2.toString());
        if (z10) {
            if (this.e == null) {
                int[] iArr2 = new int[4];
                this.e = iArr2;
                System.arraycopy(iArr, 0, iArr2, 0, 4);
            }
            this.h.setAlpha(255);
            org.telegram.ui.Components.cc0 cc0Var7 = this.h;
            cc0Var7.K = 0.0f;
            cc0Var7.i();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f33838s = ofFloat;
            ofFloat.addUpdateListener(new ai.x(23, this, iArr));
            this.f33838s.addListener(new org.telegram.ui.Components.qk0(12, this, iArr));
            this.f33838s.setDuration((int) (f7 * 250.0f));
            this.f33838s.start();
        } else {
            if (iArr != null) {
                a31 a31Var = this.E;
                a31Var.f31705a.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                a31Var.invalidate();
                System.arraycopy(iArr, 0, this.e, 0, 4);
            }
            this.f33836n = null;
            this.f33839w.invalidate();
        }
        if (this.K) {
            A0 = org.telegram.ui.ActionBar.j6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.j6.A0();
        }
        org.telegram.ui.ActionBar.d5 d5Var = new org.telegram.ui.ActionBar.d5(null, A0.Y, this.K, !z10);
        d5Var.f18590f = false;
        d5Var.e = true;
        d5Var.f18596m = this.f33832a;
        d5Var.f18595l = (int) (f7 * 250.0f);
        AndroidUtilities.runOnUIThread(new ai.s4(this, z10, e4Var2, d5Var, 27));
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0(int i10, Bitmap bitmap, boolean z10) {
        if (bitmap != null) {
            this.h.t(bitmap, i10);
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new k21(this, 1));
                this.v.setDuration(250L);
                this.v.start();
                return;
            }
            this.h.s(1.0f);
        }
    }

    public final void g0() {
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int max = Math.max(point2.x, point2.y);
        float f7 = min;
        if ((max * 1.0f) / f7 > 1.92f) {
            max = (int) (f7 * 1.92f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, max, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.f33840x.setVisibility(8);
        this.G.setVisibility(8);
        this.F.setVisibility(8);
        this.F.getAnimatedDrawable();
        a31 a31Var = this.E;
        if (a31Var != null) {
            a31Var.d(true);
        }
        this.fragmentView.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(max, 1073741824));
        this.fragmentView.layout(0, 0, min, max);
        this.fragmentView.draw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.F.getLeft(), this.F.getTop(), this.F.getRight(), this.F.getBottom());
        if (this.I != null) {
            canvas.drawBitmap(this.I, (Rect) null, rectF, new Paint(2));
        }
        canvas.setBitmap(null);
        this.f33840x.setVisibility(0);
        this.G.setVisibility(0);
        this.F.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        a31 a31Var2 = this.E;
        if (a31Var2 != null) {
            a31Var2.d(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new s21(this, 0), 500L);
    }

    @Override
    public final org.telegram.ui.ActionBar.b4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.b4.f18474c;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.f33832a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> themeDescriptions = super.getThemeDescriptions();
        f31 f31Var = this.f33835f;
        f31Var.getClass();
        e31 e31Var = new e31(f31Var);
        ArrayList arrayList = new ArrayList();
        Paint paint = f31Var.f33531a;
        int i10 = org.telegram.ui.ActionBar.j6.f18934h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 1, null, paint, null, null, i10));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 32, null, null, new Drawable[]{f31Var.f33534f}, e31Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(f31Var.f33535n, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f18970j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(f31Var.f33540y, 16, new Class[]{org.telegram.ui.Components.v11.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18952i5));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.ActionBar.l6) obj).f19392o = f31Var.d.f33832a;
        }
        themeDescriptions.addAll(arrayList);
        yy0 yy0Var = new yy0(3, this);
        TextView textView = this.f33835f.f33537s;
        int i13 = org.telegram.ui.ActionBar.j6.Oh;
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(textView, 32, null, null, null, yy0Var, i13));
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(this.f33835f.f33537s, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.Qh));
        TextView textView2 = this.f33835f.f33538w;
        if (textView2 != null) {
            themeDescriptions.add(new org.telegram.ui.ActionBar.l6(textView2, 4, null, null, null, yy0Var, i13));
            themeDescriptions.add(new org.telegram.ui.ActionBar.l6(this.f33835f.f33539x, 8, null, null, null, yy0Var, i13));
        }
        int size2 = themeDescriptions.size();
        while (i11 < size2) {
            org.telegram.ui.ActionBar.l6 l6Var = themeDescriptions.get(i11);
            i11++;
            l6Var.f19392o = this.f33832a;
        }
        return themeDescriptions;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.L = this.arguments.getLong("user_id");
        this.M = this.arguments.getLong("chat_id");
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        a0.f fVar;
        f31 f31Var = this.f33835f;
        f31Var.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(f31Var, NotificationCenter.emojiLoaded);
        this.f33835f = null;
        this.H.recycle();
        this.H = null;
        int i10 = 0;
        while (true) {
            fVar = this.d;
            if (i10 >= fVar.f30c) {
                break;
            }
            Bitmap bitmap = (Bitmap) fVar.h(i10);
            if (bitmap != null) {
                bitmap.recycle();
            }
            i10++;
        }
        fVar.clear();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.N);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.N);
        }
        super.onPause();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                f0(this);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f18447a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new r21(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.N | 1028);
        }
    }
}
