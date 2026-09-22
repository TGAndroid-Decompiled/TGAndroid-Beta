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
public class f31 extends org.telegram.ui.ActionBar.n2 {
    public static final a0.f R;
    public static List S;
    public static boolean T;
    public z21 E;
    public org.telegram.ui.Components.nj0 F;
    public ImageView G;
    public Bitmap H;
    public Bitmap I;
    public org.telegram.ui.ActionBar.d4 J;
    public boolean K;
    public long L;
    public long M;
    public int N;
    public int O;
    public boolean P;
    public i0.b Q;
    public final m5.e f33492a;
    public final org.telegram.ui.ActionBar.d4 f33493b;
    public final Rect f33494c;
    public final a0.f d;
    public int[] e;
    public e31 f33495f;
    public org.telegram.ui.Components.nc0 h;
    public org.telegram.ui.Components.nc0 f33496n;
    public org.telegram.ui.Components.nc0 f33497r;
    public ValueAnimator f33498s;
    public ValueAnimator v;
    public s50 f33499w;
    public ci.n6 f33500x;
    public org.telegram.ui.Components.v9 f33501y;

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

    public f31(Bundle bundle) {
        super(bundle);
        this.f33492a = new m5.e(this);
        org.telegram.ui.ActionBar.d4 d4Var = new org.telegram.ui.ActionBar.d4(this.currentAccount);
        d4Var.e = "🏠";
        d4Var.f18824c = fg.b.d("🏠");
        d4Var.d = TLRPC.ChatTheme.ofEmoticon(d4Var.e);
        org.telegram.ui.ActionBar.c4 c4Var = new org.telegram.ui.ActionBar.c4();
        c4Var.f18780a = org.telegram.ui.ActionBar.j6.N0("Blue");
        c4Var.e = 99;
        d4Var.f18825f.add(c4Var);
        org.telegram.ui.ActionBar.c4 c4Var2 = new org.telegram.ui.ActionBar.c4();
        c4Var2.f18780a = org.telegram.ui.ActionBar.j6.N0("Dark Blue");
        c4Var2.e = 0;
        d4Var.f18825f.add(c4Var2);
        this.f33493b = d4Var;
        this.f33494c = new Rect();
        this.d = new a0.m(0);
        this.e = null;
        this.h = new org.telegram.ui.Components.nc0();
        this.J = d4Var;
        this.O = -1;
        this.Q = i0.b.e;
    }

    public static void U(f31 f31Var) {
        if (f31Var.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && f31Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            f31Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        } else {
            f0(f31Var);
        }
    }

    public static void V(f31 f31Var) {
        T = false;
        List list = S;
        if (list != null && !list.isEmpty()) {
            f31Var.c0(S);
        } else {
            ChatThemeController.getInstance(f31Var.currentAccount).requestAllChatThemes(new t21(f31Var), true);
        }
    }

    public static void W(f31 f31Var, boolean z10, org.telegram.ui.ActionBar.d4 d4Var, org.telegram.ui.ActionBar.c5 c5Var) {
        m5.e eVar = f31Var.f33492a;
        if (z10) {
            eVar.f14968b = d4Var.b(((f31) eVar.f14969c).currentAccount, f31Var.K ? 1 : 0);
        } else {
            eVar.f14968b = f31Var.J.b(((f31) eVar.f14969c).currentAccount, f31Var.K ? 1 : 0);
        }
        c5Var.h = new q21(f31Var, 3);
        ((ActionBarLayout) f31Var.parentLayout).f(c5Var, null);
        LinearLayout linearLayout = f31Var.f33495f.v;
        if (linearLayout != null) {
            linearLayout.setBackground(org.telegram.ui.ActionBar.y5.d(new float[]{6.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.y5.b(f31Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oh)), 25)));
        }
    }

    public static void X(f31 f31Var) {
        f31Var.f33493b.n(f31Var.currentAccount);
        View view = f31Var.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new q21(f31Var, 1), 17L);
    }

    public static void f0(org.telegram.ui.ActionBar.n2 n2Var) {
        v9.e0(n2Var.getParentActivity(), 1, new v21(n2Var.getCurrentAccount(), n2Var));
    }

    public final Bitmap b0(org.telegram.ui.ActionBar.d4 d4Var, boolean z10) {
        if (z10) {
            String str = d4Var.e;
            a0.f fVar = this.d;
            Bitmap bitmap = (Bitmap) fVar.get(str);
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(this.H.getWidth(), this.H.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                int[] iArr = (int[]) R.get(d4Var.e + "n");
                if (iArr != null) {
                    if (this.f33497r == null) {
                        this.f33497r = new org.telegram.ui.Components.nc0(true, 0, 0, 0, 0);
                    }
                    this.f33497r.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                    this.f33497r.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                    this.f33497r.draw(canvas);
                }
                canvas.drawBitmap(this.H, 0.0f, 0.0f, (Paint) null);
                canvas.setBitmap(null);
                fVar.put(d4Var.e, bitmap);
            }
            return bitmap;
        }
        return this.H;
    }

    public final void c0(List list) {
        if (list != null && !list.isEmpty() && this.f33495f != null) {
            list.set(0, this.f33493b);
            ArrayList arrayList = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) list.get(i10);
                d4Var.n(this.currentAccount);
                org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(d4Var);
                boolean z10 = this.K;
                lpVar.f26157c = z10 ? 1 : 0;
                lpVar.e = b0(d4Var, z10);
                arrayList.add(lpVar);
            }
            org.telegram.ui.Components.kp kpVar = this.f33495f.f33230b;
            kpVar.d = arrayList;
            kpVar.l();
            int i11 = 0;
            while (true) {
                if (i11 != arrayList.size()) {
                    if (fg.b.a(((org.telegram.ui.Components.lp) arrayList.get(i11)).f26155a.f18824c, this.J.f18824c)) {
                        this.f33495f.K = (org.telegram.ui.Components.lp) arrayList.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1) {
                this.f33495f.b(i11);
            }
            e31 e31Var = this.f33495f;
            c31 c31Var = e31Var.F;
            c31Var.setAlpha(0.0f);
            c31Var.animate().alpha(1.0f).setDuration(150L).start();
            c31Var.setVisibility(0);
            org.telegram.ui.Components.t00 t00Var = e31Var.f33234r;
            t00Var.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.ba(t00Var)).setDuration(150L).start();
            org.telegram.ui.Components.yl0 yl0Var = e31Var.f33238y;
            yl0Var.setAlpha(0.0f);
            yl0Var.animate().alpha(1.0f).setDuration(150L).start();
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f31.createView(android.content.Context):android.view.View");
    }

    public final void d0(int i10, org.telegram.ui.ActionBar.d4 d4Var, boolean z10) {
        float f7;
        String str;
        org.telegram.ui.ActionBar.i6 A0;
        this.O = i10;
        org.telegram.ui.ActionBar.d4 d4Var2 = this.J;
        final boolean z11 = this.K;
        this.J = d4Var;
        org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) d4Var.f18825f.get(z11 ? 1 : 0);
        ValueAnimator valueAnimator = this.f33498s;
        if (valueAnimator != null) {
            f7 = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.f33498s.cancel();
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.nc0 nc0Var = this.h;
        this.f33496n = nc0Var;
        nc0Var.q(false);
        this.f33496n.setAlpha(255);
        org.telegram.ui.Components.nc0 nc0Var2 = new org.telegram.ui.Components.nc0();
        this.h = nc0Var2;
        nc0Var2.setCallback(this.f33499w);
        this.h.n(c4Var.f18787k, c4Var.f18788l, c4Var.f18789m, c4Var.f18790n);
        this.h.r(this.f33499w);
        this.h.s(1.0f);
        org.telegram.ui.Components.nc0 nc0Var3 = this.h;
        nc0Var3.N = true;
        org.telegram.ui.Components.nc0 nc0Var4 = this.f33496n;
        if (nc0Var4 != null) {
            nc0Var3.h = nc0Var4.h;
        }
        this.E.f40093a.h = nc0Var3.h;
        TLRPC.WallPaper k10 = this.J.k(z11 ? 1 : 0);
        if (k10 != null) {
            org.telegram.ui.Components.nc0 nc0Var5 = this.h;
            nc0Var5.t(nc0Var5.f26746u, k10.settings.intensity);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.J.o(z11 ? 1 : 0, new ResultCallback() {
                @Override
                public final void onComplete(Object obj) {
                    boolean z12;
                    Pair pair = (Pair) obj;
                    f31 f31Var = f31.this;
                    long i11 = f31Var.J.i(z11 ? 1 : 0);
                    if (pair != null && i11 != 0) {
                        long longValue = ((Long) pair.first).longValue();
                        Bitmap bitmap = ((dg.a) pair.second).f7726b;
                        if (longValue == i11 && bitmap != null) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            int i12 = f31Var.h.f26742q;
                            if (elapsedRealtime2 > 150) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            f31Var.e0(i12, bitmap, z12);
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
            Utilities.themeQueue.postRunnable(new q21(this, 2), 35L);
        }
        org.telegram.ui.Components.nc0 nc0Var6 = this.h;
        nc0Var6.u(nc0Var6.f());
        a0.f fVar = R;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d4Var.e);
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
            org.telegram.ui.Components.nc0 nc0Var7 = this.h;
            nc0Var7.K = 0.0f;
            nc0Var7.i();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f33498s = ofFloat;
            ofFloat.addUpdateListener(new ai.x(23, this, iArr));
            this.f33498s.addListener(new org.telegram.ui.Components.cl0(12, this, iArr));
            this.f33498s.setDuration((int) (f7 * 250.0f));
            this.f33498s.start();
        } else {
            if (iArr != null) {
                z21 z21Var = this.E;
                z21Var.f40093a.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                z21Var.invalidate();
                System.arraycopy(iArr, 0, this.e, 0, 4);
            }
            this.f33496n = null;
            this.f33499w.invalidate();
        }
        if (this.K) {
            A0 = org.telegram.ui.ActionBar.j6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.j6.A0();
        }
        org.telegram.ui.ActionBar.c5 c5Var = new org.telegram.ui.ActionBar.c5(null, A0.Y, this.K, !z10);
        c5Var.f18795f = false;
        c5Var.e = true;
        c5Var.f18801m = this.f33492a;
        c5Var.f18800l = (int) (f7 * 250.0f);
        AndroidUtilities.runOnUIThread(new ai.s4(this, z10, d4Var2, c5Var, 28));
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
                ofFloat.addUpdateListener(new i21(this, 1));
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
        this.f33500x.setVisibility(8);
        this.G.setVisibility(8);
        this.F.setVisibility(8);
        this.F.getAnimatedDrawable();
        z21 z21Var = this.E;
        if (z21Var != null) {
            z21Var.d(true);
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
        this.f33500x.setVisibility(0);
        this.G.setVisibility(0);
        this.F.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        z21 z21Var2 = this.E;
        if (z21Var2 != null) {
            z21Var2.d(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new q21(this, 0), 500L);
    }

    @Override
    public final org.telegram.ui.ActionBar.a4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.a4.f18677c;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.f33492a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> themeDescriptions = super.getThemeDescriptions();
        e31 e31Var = this.f33495f;
        e31Var.getClass();
        d31 d31Var = new d31(e31Var);
        ArrayList arrayList = new ArrayList();
        Paint paint = e31Var.f33229a;
        int i10 = org.telegram.ui.ActionBar.j6.f19180h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 1, null, paint, null, null, i10));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 32, null, null, new Drawable[]{e31Var.f33232f}, d31Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e31Var.f33233n, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f19216j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e31Var.f33238y, 16, new Class[]{org.telegram.ui.Components.k21.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19198i5));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.ActionBar.l6) obj).f19632o = e31Var.d.f33492a;
        }
        themeDescriptions.addAll(arrayList);
        wy0 wy0Var = new wy0(3, this);
        TextView textView = this.f33495f.f33235s;
        int i13 = org.telegram.ui.ActionBar.j6.Oh;
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(textView, 32, null, null, null, wy0Var, i13));
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(this.f33495f.f33235s, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.Qh));
        TextView textView2 = this.f33495f.f33236w;
        if (textView2 != null) {
            themeDescriptions.add(new org.telegram.ui.ActionBar.l6(textView2, 4, null, null, null, wy0Var, i13));
            themeDescriptions.add(new org.telegram.ui.ActionBar.l6(this.f33495f.f33237x, 8, null, null, null, wy0Var, i13));
        }
        int size2 = themeDescriptions.size();
        while (i11 < size2) {
            org.telegram.ui.ActionBar.l6 l6Var = themeDescriptions.get(i11);
            i11++;
            l6Var.f19632o = this.f33492a;
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
        e31 e31Var = this.f33495f;
        e31Var.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(e31Var, NotificationCenter.emojiLoaded);
        this.f33495f = null;
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
            alertDialog$Builder.f18669a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new p21(this));
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
