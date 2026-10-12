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
public class g31 extends org.telegram.ui.ActionBar.m2 {
    public static final a0.f R;
    public static List S;
    public static boolean T;
    public b31 E;
    public org.telegram.ui.Components.ik0 F;
    public ImageView G;
    public Bitmap H;
    public Bitmap I;
    public org.telegram.ui.ActionBar.b4 J;
    public boolean K;
    public long L;
    public long M;
    public int N;
    public int O;
    public boolean P;
    public i0.b Q;
    public final n7.z0 f37904a;
    public final org.telegram.ui.ActionBar.b4 f37905b;
    public final Rect f37906c;
    public final a0.f d;
    public int[] f37907e;
    public f31 f37908f;
    public org.telegram.ui.Components.gd0 h;
    public org.telegram.ui.Components.gd0 f37909n;
    public org.telegram.ui.Components.gd0 f37910r;
    public ValueAnimator f37911s;
    public ValueAnimator v;
    public s50 f37912w;
    public ci.m6 f37913x;
    public org.telegram.ui.Components.y9 f37914y;

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
        this.f37904a = new n7.z0(this);
        org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(this.currentAccount);
        b4Var.f20243e = "🏠";
        b4Var.f20242c = fg.b.d("🏠");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.f20243e);
        org.telegram.ui.ActionBar.a4 a4Var = new org.telegram.ui.ActionBar.a4();
        a4Var.f20191a = org.telegram.ui.ActionBar.h6.O0("Blue");
        a4Var.f20194e = 99;
        b4Var.f20244f.add(a4Var);
        org.telegram.ui.ActionBar.a4 a4Var2 = new org.telegram.ui.ActionBar.a4();
        a4Var2.f20191a = org.telegram.ui.ActionBar.h6.O0("Dark Blue");
        a4Var2.f20194e = 0;
        b4Var.f20244f.add(a4Var2);
        this.f37905b = b4Var;
        this.f37906c = new Rect();
        this.d = new a0.m(0);
        this.f37907e = null;
        this.h = new org.telegram.ui.Components.gd0();
        this.J = b4Var;
        this.O = -1;
        this.Q = i0.b.f11573e;
    }

    public static void U(g31 g31Var) {
        T = false;
        List list = S;
        if (list != null && !list.isEmpty()) {
            g31Var.b0(S);
        } else {
            ChatThemeController.getInstance(g31Var.currentAccount).requestAllChatThemes(new v21(g31Var), true);
        }
    }

    public static void V(g31 g31Var, boolean z10, org.telegram.ui.ActionBar.b4 b4Var, org.telegram.ui.ActionBar.a5 a5Var) {
        n7.z0 z0Var = g31Var.f37904a;
        if (z10) {
            z0Var.f16573b = b4Var.b(((g31) z0Var.f16574c).currentAccount, g31Var.K ? 1 : 0);
        } else {
            z0Var.f16573b = g31Var.J.b(((g31) z0Var.f16574c).currentAccount, g31Var.K ? 1 : 0);
        }
        a5Var.h = new s21(g31Var, 3);
        ((ActionBarLayout) g31Var.parentLayout).f(a5Var, null);
        LinearLayout linearLayout = g31Var.f37908f.v;
        if (linearLayout != null) {
            linearLayout.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{6.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.w5.b(g31Var.getThemedColor(org.telegram.ui.ActionBar.h6.Oh)), 25)));
        }
    }

    public static void W(g31 g31Var) {
        g31Var.f37905b.n(g31Var.currentAccount);
        View view = g31Var.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new s21(g31Var, 1), 17L);
    }

    public static void e0(org.telegram.ui.ActionBar.m2 m2Var) {
        y9.e0(m2Var.getParentActivity(), false, 1, new x21(m2Var.getCurrentAccount(), m2Var));
    }

    public final Bitmap a0(org.telegram.ui.ActionBar.b4 b4Var, boolean z10) {
        if (z10) {
            String str = b4Var.f20243e;
            a0.f fVar = this.d;
            Bitmap bitmap = (Bitmap) fVar.get(str);
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(this.H.getWidth(), this.H.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                int[] iArr = (int[]) R.get(b4Var.f20243e + "n");
                if (iArr != null) {
                    if (this.f37910r == null) {
                        this.f37910r = new org.telegram.ui.Components.gd0(true, 0, 0, 0, 0);
                    }
                    this.f37910r.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                    this.f37910r.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                    this.f37910r.draw(canvas);
                }
                canvas.drawBitmap(this.H, 0.0f, 0.0f, (Paint) null);
                canvas.setBitmap(null);
                fVar.put(b4Var.f20243e, bitmap);
            }
            return bitmap;
        }
        return this.H;
    }

    public final void b0(List list) {
        if (list != null && !list.isEmpty() && this.f37908f != null) {
            list.set(0, this.f37905b);
            ArrayList arrayList = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) list.get(i10);
                b4Var.n(this.currentAccount);
                org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(b4Var);
                boolean z10 = this.K;
                dqVar.f25451c = z10 ? 1 : 0;
                dqVar.f25452e = a0(b4Var, z10);
                arrayList.add(dqVar);
            }
            org.telegram.ui.Components.cq cqVar = this.f37908f.f37615b;
            cqVar.d = arrayList;
            cqVar.l();
            int i11 = 0;
            while (true) {
                if (i11 != arrayList.size()) {
                    if (fg.b.a(((org.telegram.ui.Components.dq) arrayList.get(i11)).f25449a.f20242c, this.J.f20242c)) {
                        this.f37908f.K = (org.telegram.ui.Components.dq) arrayList.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1) {
                this.f37908f.b(i11);
            }
            f31 f31Var = this.f37908f;
            d31 d31Var = f31Var.F;
            d31Var.setAlpha(0.0f);
            d31Var.animate().alpha(1.0f).setDuration(150L).start();
            d31Var.setVisibility(0);
            org.telegram.ui.Components.m10 m10Var = f31Var.f37620r;
            m10Var.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.ea(m10Var)).setDuration(150L).start();
            org.telegram.ui.Components.wm0 wm0Var = f31Var.f37624y;
            wm0Var.setAlpha(0.0f);
            wm0Var.animate().alpha(1.0f).setDuration(150L).start();
        }
    }

    public final void c0(int i10, org.telegram.ui.ActionBar.b4 b4Var, boolean z10) {
        float f7;
        String str;
        org.telegram.ui.ActionBar.g6 B0;
        this.O = i10;
        org.telegram.ui.ActionBar.b4 b4Var2 = this.J;
        final boolean z11 = this.K;
        this.J = b4Var;
        org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var.f20244f.get(z11 ? 1 : 0);
        ValueAnimator valueAnimator = this.f37911s;
        if (valueAnimator != null) {
            f7 = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.f37911s.cancel();
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.gd0 gd0Var = this.h;
        this.f37909n = gd0Var;
        gd0Var.q(false);
        this.f37909n.setAlpha(255);
        org.telegram.ui.Components.gd0 gd0Var2 = new org.telegram.ui.Components.gd0();
        this.h = gd0Var2;
        gd0Var2.setCallback(this.f37912w);
        this.h.n(a4Var.f20199k, a4Var.f20200l, a4Var.f20201m, a4Var.f20202n);
        this.h.r(this.f37912w);
        this.h.s(1.0f);
        org.telegram.ui.Components.gd0 gd0Var3 = this.h;
        gd0Var3.N = true;
        org.telegram.ui.Components.gd0 gd0Var4 = this.f37909n;
        if (gd0Var4 != null) {
            gd0Var3.h = gd0Var4.h;
        }
        this.E.f36053a.h = gd0Var3.h;
        TLRPC.WallPaper k10 = this.J.k(z11 ? 1 : 0);
        if (k10 != null) {
            org.telegram.ui.Components.gd0 gd0Var5 = this.h;
            gd0Var5.t(gd0Var5.f26415u, k10.settings.intensity);
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
                        Bitmap bitmap = ((dg.a) pair.second).f8347b;
                        if (longValue == i11 && bitmap != null) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            int i12 = g31Var.h.f26411q;
                            if (elapsedRealtime2 > 150) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            g31Var.d0(i12, bitmap, z12);
                        }
                    }
                }

                @Override
                public final void onError(Throwable th2) {
                    org.telegram.tgnet.m.a(this, th2);
                }

                @Override
                public final void onError(TLRPC.TL_error tL_error) {
                    org.telegram.tgnet.m.b(this, tL_error);
                }
            });
        } else {
            Utilities.themeQueue.postRunnable(new s21(this, 2), 35L);
        }
        org.telegram.ui.Components.gd0 gd0Var6 = this.h;
        gd0Var6.u(gd0Var6.f());
        a0.f fVar = R;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b4Var.f20243e);
        if (z11) {
            str = "n";
        } else {
            str = "d";
        }
        sb2.append(str);
        int[] iArr = (int[]) fVar.get(sb2.toString());
        if (z10) {
            if (this.f37907e == null) {
                int[] iArr2 = new int[4];
                this.f37907e = iArr2;
                System.arraycopy(iArr, 0, iArr2, 0, 4);
            }
            this.h.setAlpha(255);
            org.telegram.ui.Components.gd0 gd0Var7 = this.h;
            gd0Var7.K = 0.0f;
            gd0Var7.i();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f37911s = ofFloat;
            ofFloat.addUpdateListener(new ai.x(23, this, iArr));
            this.f37911s.addListener(new org.telegram.ui.Components.am0(12, this, iArr));
            this.f37911s.setDuration((int) (f7 * 250.0f));
            this.f37911s.start();
        } else {
            if (iArr != null) {
                b31 b31Var = this.E;
                b31Var.f36053a.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                b31Var.invalidate();
                System.arraycopy(iArr, 0, this.f37907e, 0, 4);
            }
            this.f37909n = null;
            this.f37912w.invalidate();
        }
        if (this.K) {
            B0 = org.telegram.ui.ActionBar.h6.J;
        } else {
            B0 = org.telegram.ui.ActionBar.h6.B0();
        }
        org.telegram.ui.ActionBar.a5 a5Var = new org.telegram.ui.ActionBar.a5(null, B0.Y, this.K, !z10);
        a5Var.f20208f = false;
        a5Var.f20207e = true;
        a5Var.f20214m = this.f37904a;
        a5Var.f20213l = (int) (f7 * 250.0f);
        AndroidUtilities.runOnUIThread(new ai.t4(this, z10, b4Var2, a5Var, 27));
    }

    @Override
    public final android.view.View createView(android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g31.createView(android.content.Context):android.view.View");
    }

    public final void d0(int i10, Bitmap bitmap, boolean z10) {
        if (bitmap != null) {
            this.h.t(bitmap, i10);
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new a21(this, 2));
                this.v.setDuration(250L);
                this.v.start();
                return;
            }
            this.h.s(1.0f);
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void f0() {
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
        this.f37913x.setVisibility(8);
        this.G.setVisibility(8);
        this.F.setVisibility(8);
        this.F.getAnimatedDrawable();
        b31 b31Var = this.E;
        if (b31Var != null) {
            b31Var.d(true);
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
        this.f37913x.setVisibility(0);
        this.G.setVisibility(0);
        this.F.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        b31 b31Var2 = this.E;
        if (b31Var2 != null) {
            b31Var2.d(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e7) {
                e7.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new s21(this, 0), 500L);
    }

    @Override
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.f21473c;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.f37904a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> themeDescriptions = super.getThemeDescriptions();
        f31 f31Var = this.f37908f;
        f31Var.getClass();
        e31 e31Var = new e31(f31Var);
        ArrayList arrayList = new ArrayList();
        Paint paint = f31Var.f37614a;
        int i10 = org.telegram.ui.ActionBar.h6.f20631h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 1, null, paint, null, null, i10));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 32, null, null, new Drawable[]{f31Var.f37618f}, e31Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(f31Var.f37619n, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20668j5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(f31Var.f37624y, 16, new Class[]{org.telegram.ui.Components.f31.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20650i5));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.ActionBar.j6) obj).f21030o = f31Var.d.f37904a;
        }
        themeDescriptions.addAll(arrayList);
        yy0 yy0Var = new yy0(3, this);
        TextView textView = this.f37908f.f37621s;
        int i13 = org.telegram.ui.ActionBar.h6.Oh;
        themeDescriptions.add(new org.telegram.ui.ActionBar.j6(textView, 32, null, null, null, yy0Var, i13));
        themeDescriptions.add(new org.telegram.ui.ActionBar.j6(this.f37908f.f37621s, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.Qh));
        TextView textView2 = this.f37908f.f37622w;
        if (textView2 != null) {
            themeDescriptions.add(new org.telegram.ui.ActionBar.j6(textView2, 4, null, null, null, yy0Var, i13));
            themeDescriptions.add(new org.telegram.ui.ActionBar.j6(this.f37908f.f37623x, 8, null, null, null, yy0Var, i13));
        }
        int size2 = themeDescriptions.size();
        while (i11 < size2) {
            org.telegram.ui.ActionBar.j6 j6Var = themeDescriptions.get(i11);
            i11++;
            j6Var.f21030o = this.f37904a;
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
        f31 f31Var = this.f37908f;
        f31Var.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(f31Var, NotificationCenter.emojiLoaded);
        this.f37908f = null;
        this.H.recycle();
        this.H = null;
        int i10 = 0;
        while (true) {
            fVar = this.d;
            if (i10 >= fVar.f33c) {
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
                e0(this);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20142a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new r21(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
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
