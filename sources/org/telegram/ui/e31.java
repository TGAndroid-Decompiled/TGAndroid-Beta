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
public class e31 extends org.telegram.ui.ActionBar.n2 {
    public static final a0.f R;
    public static List S;
    public static boolean T;
    public y21 E;
    public org.telegram.ui.Components.fk0 F;
    public ImageView G;
    public Bitmap H;
    public Bitmap I;
    public org.telegram.ui.ActionBar.c4 J;
    public boolean K;
    public long L;
    public long M;
    public int N;
    public int O;
    public boolean P;
    public i0.b Q;
    public final org.telegram.ui.ActionBar.b5 f37135a;
    public final org.telegram.ui.ActionBar.c4 f37136b;
    public final Rect f37137c;
    public final a0.f d;
    public int[] f37138e;
    public d31 f37139f;
    public org.telegram.ui.Components.cd0 h;
    public org.telegram.ui.Components.cd0 f37140n;
    public org.telegram.ui.Components.cd0 f37141r;
    public ValueAnimator f37142s;
    public ValueAnimator v;
    public q50 f37143w;
    public ci.m6 f37144x;
    public org.telegram.ui.Components.y9 f37145y;

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

    public e31(Bundle bundle) {
        super(bundle);
        this.f37135a = new org.telegram.ui.ActionBar.b5(this);
        org.telegram.ui.ActionBar.c4 c4Var = new org.telegram.ui.ActionBar.c4(this.currentAccount);
        c4Var.f20508e = "🏠";
        c4Var.f20507c = fg.b.d("🏠");
        c4Var.d = TLRPC.ChatTheme.ofEmoticon(c4Var.f20508e);
        org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4();
        b4Var.f20447a = org.telegram.ui.ActionBar.i6.O0("Blue");
        b4Var.f20450e = 99;
        c4Var.f20509f.add(b4Var);
        org.telegram.ui.ActionBar.b4 b4Var2 = new org.telegram.ui.ActionBar.b4();
        b4Var2.f20447a = org.telegram.ui.ActionBar.i6.O0("Dark Blue");
        b4Var2.f20450e = 0;
        c4Var.f20509f.add(b4Var2);
        this.f37136b = c4Var;
        this.f37137c = new Rect();
        this.d = new a0.m(0);
        this.f37138e = null;
        this.h = new org.telegram.ui.Components.cd0();
        this.J = c4Var;
        this.O = -1;
        this.Q = i0.b.f11575e;
    }

    public static void U(e31 e31Var) {
        T = false;
        List list = S;
        if (list != null && !list.isEmpty()) {
            e31Var.b0(S);
        } else {
            ChatThemeController.getInstance(e31Var.currentAccount).requestAllChatThemes(new s21(e31Var), true);
        }
    }

    public static void V(e31 e31Var, boolean z10, org.telegram.ui.ActionBar.c4 c4Var, org.telegram.ui.ActionBar.c5 c5Var) {
        org.telegram.ui.ActionBar.b5 b5Var = e31Var.f37135a;
        if (z10) {
            b5Var.f20461b = c4Var.b(((e31) b5Var.f20462c).currentAccount, e31Var.K ? 1 : 0);
        } else {
            b5Var.f20461b = e31Var.J.b(((e31) b5Var.f20462c).currentAccount, e31Var.K ? 1 : 0);
        }
        c5Var.h = new p21(e31Var, 3);
        ((ActionBarLayout) e31Var.parentLayout).f(c5Var, null);
        LinearLayout linearLayout = e31Var.f37139f.v;
        if (linearLayout != null) {
            linearLayout.setBackground(org.telegram.ui.ActionBar.y5.d(new float[]{6.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.y5.b(e31Var.getThemedColor(org.telegram.ui.ActionBar.i6.Oh)), 25)));
        }
    }

    public static void W(e31 e31Var) {
        e31Var.f37136b.n(e31Var.currentAccount);
        View view = e31Var.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new p21(e31Var, 1), 17L);
    }

    public static void e0(org.telegram.ui.ActionBar.n2 n2Var) {
        v9.e0(n2Var.getParentActivity(), false, 1, new u21(n2Var.getCurrentAccount(), n2Var));
    }

    public final Bitmap a0(org.telegram.ui.ActionBar.c4 c4Var, boolean z10) {
        if (z10) {
            String str = c4Var.f20508e;
            a0.f fVar = this.d;
            Bitmap bitmap = (Bitmap) fVar.get(str);
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(this.H.getWidth(), this.H.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                int[] iArr = (int[]) R.get(c4Var.f20508e + "n");
                if (iArr != null) {
                    if (this.f37141r == null) {
                        this.f37141r = new org.telegram.ui.Components.cd0(true, 0, 0, 0, 0);
                    }
                    this.f37141r.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                    this.f37141r.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                    this.f37141r.draw(canvas);
                }
                canvas.drawBitmap(this.H, 0.0f, 0.0f, (Paint) null);
                canvas.setBitmap(null);
                fVar.put(c4Var.f20508e, bitmap);
            }
            return bitmap;
        }
        return this.H;
    }

    public final void b0(List list) {
        if (list != null && !list.isEmpty() && this.f37139f != null) {
            list.set(0, this.f37136b);
            ArrayList arrayList = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) list.get(i10);
                c4Var.n(this.currentAccount);
                org.telegram.ui.Components.bq bqVar = new org.telegram.ui.Components.bq(c4Var);
                boolean z10 = this.K;
                bqVar.f25084c = z10 ? 1 : 0;
                bqVar.f25085e = a0(c4Var, z10);
                arrayList.add(bqVar);
            }
            org.telegram.ui.Components.aq aqVar = this.f37139f.f36823b;
            aqVar.d = arrayList;
            aqVar.l();
            int i11 = 0;
            while (true) {
                if (i11 != arrayList.size()) {
                    if (fg.b.a(((org.telegram.ui.Components.bq) arrayList.get(i11)).f25082a.f20507c, this.J.f20507c)) {
                        this.f37139f.K = (org.telegram.ui.Components.bq) arrayList.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1) {
                this.f37139f.b(i11);
            }
            d31 d31Var = this.f37139f;
            b31 b31Var = d31Var.F;
            b31Var.setAlpha(0.0f);
            b31Var.animate().alpha(1.0f).setDuration(150L).start();
            b31Var.setVisibility(0);
            org.telegram.ui.Components.j10 j10Var = d31Var.f36828r;
            j10Var.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.fa(j10Var)).setDuration(150L).start();
            org.telegram.ui.Components.qm0 qm0Var = d31Var.f36832y;
            qm0Var.setAlpha(0.0f);
            qm0Var.animate().alpha(1.0f).setDuration(150L).start();
        }
    }

    public final void c0(int i10, org.telegram.ui.ActionBar.c4 c4Var, boolean z10) {
        float f7;
        String str;
        org.telegram.ui.ActionBar.h6 B0;
        this.O = i10;
        org.telegram.ui.ActionBar.c4 c4Var2 = this.J;
        final boolean z11 = this.K;
        this.J = c4Var;
        org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) c4Var.f20509f.get(z11 ? 1 : 0);
        ValueAnimator valueAnimator = this.f37142s;
        if (valueAnimator != null) {
            f7 = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.f37142s.cancel();
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.cd0 cd0Var = this.h;
        this.f37140n = cd0Var;
        cd0Var.q(false);
        this.f37140n.setAlpha(255);
        org.telegram.ui.Components.cd0 cd0Var2 = new org.telegram.ui.Components.cd0();
        this.h = cd0Var2;
        cd0Var2.setCallback(this.f37143w);
        this.h.n(b4Var.f20455k, b4Var.f20456l, b4Var.f20457m, b4Var.f20458n);
        this.h.r(this.f37143w);
        this.h.s(1.0f);
        org.telegram.ui.Components.cd0 cd0Var3 = this.h;
        cd0Var3.N = true;
        org.telegram.ui.Components.cd0 cd0Var4 = this.f37140n;
        if (cd0Var4 != null) {
            cd0Var3.h = cd0Var4.h;
        }
        this.E.f44221a.h = cd0Var3.h;
        TLRPC.WallPaper k10 = this.J.k(z11 ? 1 : 0);
        if (k10 != null) {
            org.telegram.ui.Components.cd0 cd0Var5 = this.h;
            cd0Var5.t(cd0Var5.f25351u, k10.settings.intensity);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.J.o(z11 ? 1 : 0, new ResultCallback() {
                @Override
                public final void onComplete(Object obj) {
                    boolean z12;
                    Pair pair = (Pair) obj;
                    e31 e31Var = e31.this;
                    long i11 = e31Var.J.i(z11 ? 1 : 0);
                    if (pair != null && i11 != 0) {
                        long longValue = ((Long) pair.first).longValue();
                        Bitmap bitmap = ((dg.a) pair.second).f8350b;
                        if (longValue == i11 && bitmap != null) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            int i12 = e31Var.h.f25347q;
                            if (elapsedRealtime2 > 150) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            e31Var.d0(i12, bitmap, z12);
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
            Utilities.themeQueue.postRunnable(new p21(this, 2), 35L);
        }
        org.telegram.ui.Components.cd0 cd0Var6 = this.h;
        cd0Var6.u(cd0Var6.f());
        a0.f fVar = R;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c4Var.f20508e);
        if (z11) {
            str = "n";
        } else {
            str = "d";
        }
        sb2.append(str);
        int[] iArr = (int[]) fVar.get(sb2.toString());
        if (z10) {
            if (this.f37138e == null) {
                int[] iArr2 = new int[4];
                this.f37138e = iArr2;
                System.arraycopy(iArr, 0, iArr2, 0, 4);
            }
            this.h.setAlpha(255);
            org.telegram.ui.Components.cd0 cd0Var7 = this.h;
            cd0Var7.K = 0.0f;
            cd0Var7.i();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f37142s = ofFloat;
            ofFloat.addUpdateListener(new ai.x(23, this, iArr));
            this.f37142s.addListener(new org.telegram.ui.Components.ul0(12, this, iArr));
            this.f37142s.setDuration((int) (f7 * 250.0f));
            this.f37142s.start();
        } else {
            if (iArr != null) {
                y21 y21Var = this.E;
                y21Var.f44221a.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                y21Var.invalidate();
                System.arraycopy(iArr, 0, this.f37138e, 0, 4);
            }
            this.f37140n = null;
            this.f37143w.invalidate();
        }
        if (this.K) {
            B0 = org.telegram.ui.ActionBar.i6.J;
        } else {
            B0 = org.telegram.ui.ActionBar.i6.B0();
        }
        org.telegram.ui.ActionBar.c5 c5Var = new org.telegram.ui.ActionBar.c5(null, B0.Y, this.K, !z10);
        c5Var.f20515f = false;
        c5Var.f20514e = true;
        c5Var.f20521m = this.f37135a;
        c5Var.f20520l = (int) (f7 * 250.0f);
        AndroidUtilities.runOnUIThread(new ai.t4(this, z10, c4Var2, c5Var, 28));
    }

    @Override
    public final android.view.View createView(android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e31.createView(android.content.Context):android.view.View");
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
                ofFloat.addUpdateListener(new y11(this, 2));
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
        this.f37144x.setVisibility(8);
        this.G.setVisibility(8);
        this.F.setVisibility(8);
        this.F.getAnimatedDrawable();
        y21 y21Var = this.E;
        if (y21Var != null) {
            y21Var.d(true);
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
        this.f37144x.setVisibility(0);
        this.G.setVisibility(0);
        this.F.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        y21 y21Var2 = this.E;
        if (y21Var2 != null) {
            y21Var2.d(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e7) {
                e7.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new p21(this, 0), 500L);
    }

    @Override
    public final org.telegram.ui.ActionBar.z3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.z3.f21746c;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.f37135a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.k6> themeDescriptions = super.getThemeDescriptions();
        d31 d31Var = this.f37139f;
        d31Var.getClass();
        c31 c31Var = new c31(d31Var);
        ArrayList arrayList = new ArrayList();
        Paint paint = d31Var.f36822a;
        int i10 = org.telegram.ui.ActionBar.i6.f20868h5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 1, null, paint, null, null, i10));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 32, null, null, new Drawable[]{d31Var.f36826f}, c31Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(d31Var.f36827n, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f20905j5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(d31Var.f36832y, 16, new Class[]{org.telegram.ui.Components.z21.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20887i5));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.ActionBar.k6) obj).f21353o = d31Var.d.f37135a;
        }
        themeDescriptions.addAll(arrayList);
        wy0 wy0Var = new wy0(3, this);
        TextView textView = this.f37139f.f36829s;
        int i13 = org.telegram.ui.ActionBar.i6.Oh;
        themeDescriptions.add(new org.telegram.ui.ActionBar.k6(textView, 32, null, null, null, wy0Var, i13));
        themeDescriptions.add(new org.telegram.ui.ActionBar.k6(this.f37139f.f36829s, 65568, null, null, null, null, org.telegram.ui.ActionBar.i6.Qh));
        TextView textView2 = this.f37139f.f36830w;
        if (textView2 != null) {
            themeDescriptions.add(new org.telegram.ui.ActionBar.k6(textView2, 4, null, null, null, wy0Var, i13));
            themeDescriptions.add(new org.telegram.ui.ActionBar.k6(this.f37139f.f36831x, 8, null, null, null, wy0Var, i13));
        }
        int size2 = themeDescriptions.size();
        while (i11 < size2) {
            org.telegram.ui.ActionBar.k6 k6Var = themeDescriptions.get(i11);
            i11++;
            k6Var.f21353o = this.f37135a;
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
        d31 d31Var = this.f37139f;
        d31Var.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(d31Var, NotificationCenter.emojiLoaded);
        this.f37139f = null;
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
            alertDialog$Builder.f20374a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new o21(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.L5, false), null);
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
