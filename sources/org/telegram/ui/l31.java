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
public class l31 extends org.telegram.ui.ActionBar.m2 {
    public static final a0.f R;
    public static List S;
    public static boolean T;
    public g31 E;
    public org.telegram.ui.Components.bk0 F;
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
    public final m4.c f37826a;
    public final org.telegram.ui.ActionBar.b4 f37827b;
    public final Rect f37828c;
    public final a0.f d;
    public int[] e;
    public k31 f37829f;
    public org.telegram.ui.Components.cd0 h;
    public org.telegram.ui.Components.cd0 f37830n;
    public org.telegram.ui.Components.cd0 f37831r;
    public ValueAnimator f37832s;
    public ValueAnimator v;
    public x50 f37833w;
    public ah.v f37834x;
    public org.telegram.ui.Components.z9 f37835y;

    static {
        ?? lVar = new a0.l(0);
        R = lVar;
        lVar.put("🏠d", new int[]{-9324972, -13856649, -6636738, -9915042});
        lVar.put("🐥d", new int[]{-12344463, -7684788, -6442695, -8013488});
        lVar.put("⛄d", new int[]{-10051073, -10897938, -12469550, -7694337});
        lVar.put("💎d", new int[]{-11429643, -11814958, -5408261, -2128185});
        lVar.put("👨\u200d🏫d", new int[]{-6637227, -12015466, -13198627, -10631557});
        lVar.put("🌷d", new int[]{-1146812, -1991901, -1745517, -3443241});
        lVar.put("💜d", new int[]{-1156738, -1876046, -5412366, -28073});
        lVar.put("🎄d", new int[]{-1281978, -551386, -1870308, -742870});
        lVar.put("🎮d", new int[]{-15092782, -2333964, -1684365, -1269214});
        lVar.put("🏠n", new int[]{-15368239, -11899662, -15173939, -13850930});
        lVar.put("🐥n", new int[]{-11033320, -14780848, -9594089, -12604587});
        lVar.put("⛄n", new int[]{-13930790, -13665098, -14833975, -9732865});
        lVar.put("💎n", new int[]{-5089608, -9481473, -14378302, -13337899});
        lVar.put("👨\u200d🏫n", new int[]{-14447768, -9199261, -15356801, -15823723});
        lVar.put("🌷n", new int[]{-2534316, -2984177, -3258783, -5480504});
        lVar.put("💜n", new int[]{-3123030, -2067394, -2599576, -6067757});
        lVar.put("🎄n", new int[]{-2725857, -3242459, -3248848, -3569123});
        lVar.put("🎮n", new int[]{-3718333, -1278154, -16338695, -6076417});
        T = true;
    }

    public l31(Bundle bundle) {
        super(bundle);
        this.f37826a = new m4.c(this);
        org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(this.currentAccount);
        b4Var.e = "🏠";
        b4Var.f19644c = gg.b.d("🏠");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.e);
        org.telegram.ui.ActionBar.a4 a4Var = new org.telegram.ui.ActionBar.a4();
        a4Var.f19596a = org.telegram.ui.ActionBar.g6.O0("Blue");
        a4Var.e = 99;
        b4Var.f19645f.add(a4Var);
        org.telegram.ui.ActionBar.a4 a4Var2 = new org.telegram.ui.ActionBar.a4();
        a4Var2.f19596a = org.telegram.ui.ActionBar.g6.O0("Dark Blue");
        a4Var2.e = 0;
        b4Var.f19645f.add(a4Var2);
        this.f37827b = b4Var;
        this.f37828c = new Rect();
        this.d = new a0.l(0);
        this.e = null;
        this.h = new org.telegram.ui.Components.cd0();
        this.J = b4Var;
        this.O = -1;
        this.Q = i0.b.e;
    }

    public static void U(l31 l31Var) {
        T = false;
        List list = S;
        if (list != null && !list.isEmpty()) {
            l31Var.b0(S);
        } else {
            ChatThemeController.getInstance(l31Var.currentAccount).requestAllChatThemes(new a31(l31Var), true);
        }
    }

    public static void V(l31 l31Var, boolean z10, org.telegram.ui.ActionBar.b4 b4Var, org.telegram.ui.ActionBar.a5 a5Var) {
        m4.c cVar = l31Var.f37826a;
        if (z10) {
            cVar.f15392b = b4Var.b(((l31) cVar.f15393c).currentAccount, l31Var.K ? 1 : 0);
        } else {
            cVar.f15392b = l31Var.J.b(((l31) cVar.f15393c).currentAccount, l31Var.K ? 1 : 0);
        }
        a5Var.h = new x21(l31Var, 3);
        ((ActionBarLayout) l31Var.parentLayout).f(a5Var, null);
        LinearLayout linearLayout = l31Var.f37829f.v;
        if (linearLayout != null) {
            linearLayout.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{6.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.w5.b(l31Var.getThemedColor(org.telegram.ui.ActionBar.g6.Oh)), 25)));
        }
    }

    public static void W(l31 l31Var) {
        l31Var.f37827b.n(l31Var.currentAccount);
        View view = l31Var.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new x21(l31Var, 1), 17L);
    }

    public static void e0(org.telegram.ui.ActionBar.m2 m2Var) {
        z9.e0(m2Var.getParentActivity(), false, 1, new c31(m2Var.getCurrentAccount(), m2Var));
    }

    public final Bitmap a0(org.telegram.ui.ActionBar.b4 b4Var, boolean z10) {
        if (z10) {
            String str = b4Var.e;
            a0.f fVar = this.d;
            Bitmap bitmap = (Bitmap) fVar.get(str);
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(this.H.getWidth(), this.H.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                int[] iArr = (int[]) R.get(b4Var.e + "n");
                if (iArr != null) {
                    if (this.f37831r == null) {
                        this.f37831r = new org.telegram.ui.Components.cd0(true, 0, 0, 0, 0);
                    }
                    this.f37831r.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                    this.f37831r.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                    this.f37831r.draw(canvas);
                }
                canvas.drawBitmap(this.H, 0.0f, 0.0f, (Paint) null);
                canvas.setBitmap(null);
                fVar.put(b4Var.e, bitmap);
            }
            return bitmap;
        }
        return this.H;
    }

    public final void b0(List list) {
        if (list != null && !list.isEmpty() && this.f37829f != null) {
            list.set(0, this.f37827b);
            ArrayList arrayList = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) list.get(i10);
                b4Var.n(this.currentAccount);
                org.telegram.ui.Components.yp ypVar = new org.telegram.ui.Components.yp(b4Var);
                boolean z10 = this.K;
                ypVar.f31670c = z10 ? 1 : 0;
                ypVar.e = a0(b4Var, z10);
                arrayList.add(ypVar);
            }
            org.telegram.ui.Components.xp xpVar = this.f37829f.f37504b;
            xpVar.d = arrayList;
            xpVar.l();
            int i11 = 0;
            while (true) {
                if (i11 != arrayList.size()) {
                    if (gg.b.a(((org.telegram.ui.Components.yp) arrayList.get(i11)).f31668a.f19644c, this.J.f19644c)) {
                        this.f37829f.K = (org.telegram.ui.Components.yp) arrayList.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1) {
                this.f37829f.b(i11);
            }
            k31 k31Var = this.f37829f;
            i31 i31Var = k31Var.F;
            i31Var.setAlpha(0.0f);
            i31Var.animate().alpha(1.0f).setDuration(150L).start();
            i31Var.setVisibility(0);
            org.telegram.ui.Components.f10 f10Var = k31Var.f37508r;
            f10Var.animate().alpha(0.0f).setListener(new vo(f10Var)).setDuration(150L).start();
            org.telegram.ui.Components.mm0 mm0Var = k31Var.f37512y;
            mm0Var.setAlpha(0.0f);
            mm0Var.animate().alpha(1.0f).setDuration(150L).start();
        }
    }

    public final void c0(int i10, org.telegram.ui.ActionBar.b4 b4Var, boolean z10) {
        float f7;
        String str;
        org.telegram.ui.ActionBar.f6 B0;
        this.O = i10;
        org.telegram.ui.ActionBar.b4 b4Var2 = this.J;
        final boolean z11 = this.K;
        this.J = b4Var;
        org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var.f19645f.get(z11 ? 1 : 0);
        ValueAnimator valueAnimator = this.f37832s;
        if (valueAnimator != null) {
            f7 = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.f37832s.cancel();
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.cd0 cd0Var = this.h;
        this.f37830n = cd0Var;
        cd0Var.q(false);
        this.f37830n.setAlpha(255);
        org.telegram.ui.Components.cd0 cd0Var2 = new org.telegram.ui.Components.cd0();
        this.h = cd0Var2;
        cd0Var2.setCallback(this.f37833w);
        this.h.n(a4Var.f19603k, a4Var.f19604l, a4Var.f19605m, a4Var.f19606n);
        this.h.r(this.f37833w);
        this.h.s(1.0f);
        org.telegram.ui.Components.cd0 cd0Var3 = this.h;
        cd0Var3.N = true;
        org.telegram.ui.Components.cd0 cd0Var4 = this.f37830n;
        if (cd0Var4 != null) {
            cd0Var3.h = cd0Var4.h;
        }
        this.E.f36288a.h = cd0Var3.h;
        TLRPC.WallPaper k10 = this.J.k(z11 ? 1 : 0);
        if (k10 != null) {
            org.telegram.ui.Components.cd0 cd0Var5 = this.h;
            cd0Var5.t(cd0Var5.f24056u, k10.settings.intensity);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.J.o(z11 ? 1 : 0, new ResultCallback() {
                @Override
                public final void onComplete(Object obj) {
                    boolean z12;
                    Pair pair = (Pair) obj;
                    l31 l31Var = l31.this;
                    long i11 = l31Var.J.i(z11 ? 1 : 0);
                    if (pair != null && i11 != 0) {
                        long longValue = ((Long) pair.first).longValue();
                        Bitmap bitmap = ((eg.a) pair.second).f8764b;
                        if (longValue == i11 && bitmap != null) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            int i12 = l31Var.h.f24052q;
                            if (elapsedRealtime2 > 150) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            l31Var.d0(i12, bitmap, z12);
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
            Utilities.themeQueue.postRunnable(new x21(this, 2), 35L);
        }
        org.telegram.ui.Components.cd0 cd0Var6 = this.h;
        cd0Var6.u(cd0Var6.f());
        a0.f fVar = R;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b4Var.e);
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
            org.telegram.ui.Components.cd0 cd0Var7 = this.h;
            cd0Var7.K = 0.0f;
            cd0Var7.i();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f37832s = ofFloat;
            ofFloat.addUpdateListener(new ah.l0(24, this, iArr));
            this.f37832s.addListener(new org.telegram.ui.Components.ql0(12, this, iArr));
            this.f37832s.setDuration((int) (f7 * 250.0f));
            this.f37832s.start();
        } else {
            if (iArr != null) {
                g31 g31Var = this.E;
                g31Var.f36288a.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                g31Var.invalidate();
                System.arraycopy(iArr, 0, this.e, 0, 4);
            }
            this.f37830n = null;
            this.f37833w.invalidate();
        }
        if (this.K) {
            B0 = org.telegram.ui.ActionBar.g6.J;
        } else {
            B0 = org.telegram.ui.ActionBar.g6.B0();
        }
        org.telegram.ui.ActionBar.a5 a5Var = new org.telegram.ui.ActionBar.a5(null, B0.Y, this.K, !z10);
        a5Var.f19611f = false;
        a5Var.e = true;
        a5Var.f19617m = this.f37826a;
        a5Var.f19616l = (int) (f7 * 250.0f);
        AndroidUtilities.runOnUIThread(new bi.h4(this, z10, b4Var2, a5Var, 27));
    }

    @Override
    public final android.view.View createView(android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l31.createView(android.content.Context):android.view.View");
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
                ofFloat.addUpdateListener(new f21(this, 2));
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
        this.f37834x.setVisibility(8);
        this.G.setVisibility(8);
        this.F.setVisibility(8);
        this.F.getAnimatedDrawable();
        g31 g31Var = this.E;
        if (g31Var != null) {
            g31Var.d(true);
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
        this.f37834x.setVisibility(0);
        this.G.setVisibility(0);
        this.F.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        g31 g31Var2 = this.E;
        if (g31Var2 != null) {
            g31Var2.d(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new x21(this, 0), 500L);
    }

    @Override
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.f20828c;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.f37826a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> themeDescriptions = super.getThemeDescriptions();
        k31 k31Var = this.f37829f;
        k31Var.getClass();
        j31 j31Var = new j31(k31Var);
        ArrayList arrayList = new ArrayList();
        Paint paint = k31Var.f37503a;
        int i10 = org.telegram.ui.ActionBar.g6.f19972h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 1, null, paint, null, null, i10));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 32, null, null, new Drawable[]{k31Var.f37506f}, j31Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(k31Var.f37507n, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f20007j5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(k31Var.f37512y, 16, new Class[]{org.telegram.ui.Components.v21.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19989i5));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.ActionBar.i6) obj).f20383o = k31Var.d.f37826a;
        }
        themeDescriptions.addAll(arrayList);
        cz0 cz0Var = new cz0(3, this);
        TextView textView = this.f37829f.f37509s;
        int i13 = org.telegram.ui.ActionBar.g6.Oh;
        themeDescriptions.add(new org.telegram.ui.ActionBar.i6(textView, 32, null, null, null, cz0Var, i13));
        themeDescriptions.add(new org.telegram.ui.ActionBar.i6(this.f37829f.f37509s, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.Qh));
        TextView textView2 = this.f37829f.f37510w;
        if (textView2 != null) {
            themeDescriptions.add(new org.telegram.ui.ActionBar.i6(textView2, 4, null, null, null, cz0Var, i13));
            themeDescriptions.add(new org.telegram.ui.ActionBar.i6(this.f37829f.f37511x, 8, null, null, null, cz0Var, i13));
        }
        int size2 = themeDescriptions.size();
        while (i11 < size2) {
            org.telegram.ui.ActionBar.i6 i6Var = themeDescriptions.get(i11);
            i11++;
            i6Var.f20383o = this.f37826a;
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
        k31 k31Var = this.f37829f;
        k31Var.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(k31Var, NotificationCenter.emojiLoaded);
        this.f37829f = null;
        this.H.recycle();
        this.H = null;
        int i10 = 0;
        while (true) {
            fVar = this.d;
            if (i10 >= fVar.f27c) {
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
            alertDialog$Builder.f19548a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new w21(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
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
