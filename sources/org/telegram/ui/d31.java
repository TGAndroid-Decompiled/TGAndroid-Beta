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
public class d31 extends org.telegram.ui.ActionBar.m2 {
    public static final a0.f R;
    public static List S;
    public static boolean T;
    public x21 E;
    public org.telegram.ui.Components.hk0 F;
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
    public final n7.z0 f36882a;
    public final org.telegram.ui.ActionBar.b4 f36883b;
    public final Rect f36884c;
    public final a0.f d;
    public int[] f36885e;
    public c31 f36886f;
    public org.telegram.ui.Components.dd0 h;
    public org.telegram.ui.Components.dd0 f36887n;
    public org.telegram.ui.Components.dd0 f36888r;
    public ValueAnimator f36889s;
    public ValueAnimator v;
    public q50 f36890w;
    public ci.m6 f36891x;
    public org.telegram.ui.Components.y9 f36892y;

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

    public d31(Bundle bundle) {
        super(bundle);
        this.f36882a = new n7.z0(this);
        org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(this.currentAccount);
        b4Var.f20470e = "🏠";
        b4Var.f20469c = fg.b.d("🏠");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.f20470e);
        org.telegram.ui.ActionBar.a4 a4Var = new org.telegram.ui.ActionBar.a4();
        a4Var.f20417a = org.telegram.ui.ActionBar.h6.O0("Blue");
        a4Var.f20420e = 99;
        b4Var.f20471f.add(a4Var);
        org.telegram.ui.ActionBar.a4 a4Var2 = new org.telegram.ui.ActionBar.a4();
        a4Var2.f20417a = org.telegram.ui.ActionBar.h6.O0("Dark Blue");
        a4Var2.f20420e = 0;
        b4Var.f20471f.add(a4Var2);
        this.f36883b = b4Var;
        this.f36884c = new Rect();
        this.d = new a0.m(0);
        this.f36885e = null;
        this.h = new org.telegram.ui.Components.dd0();
        this.J = b4Var;
        this.O = -1;
        this.Q = i0.b.f11574e;
    }

    public static void U(d31 d31Var) {
        T = false;
        List list = S;
        if (list != null && !list.isEmpty()) {
            d31Var.b0(S);
        } else {
            ChatThemeController.getInstance(d31Var.currentAccount).requestAllChatThemes(new r21(d31Var), true);
        }
    }

    public static void V(d31 d31Var, boolean z10, org.telegram.ui.ActionBar.b4 b4Var, org.telegram.ui.ActionBar.a5 a5Var) {
        n7.z0 z0Var = d31Var.f36882a;
        if (z10) {
            z0Var.f16869b = b4Var.b(((d31) z0Var.f16870c).currentAccount, d31Var.K ? 1 : 0);
        } else {
            z0Var.f16869b = d31Var.J.b(((d31) z0Var.f16870c).currentAccount, d31Var.K ? 1 : 0);
        }
        a5Var.h = new o21(d31Var, 3);
        ((ActionBarLayout) d31Var.parentLayout).f(a5Var, null);
        LinearLayout linearLayout = d31Var.f36886f.v;
        if (linearLayout != null) {
            linearLayout.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{6.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.w5.b(d31Var.getThemedColor(org.telegram.ui.ActionBar.h6.Oh)), 25)));
        }
    }

    public static void W(d31 d31Var) {
        d31Var.f36883b.n(d31Var.currentAccount);
        View view = d31Var.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new o21(d31Var, 1), 17L);
    }

    public static void e0(org.telegram.ui.ActionBar.m2 m2Var) {
        u9.e0(m2Var.getParentActivity(), false, 1, new t21(m2Var.getCurrentAccount(), m2Var));
    }

    public final Bitmap a0(org.telegram.ui.ActionBar.b4 b4Var, boolean z10) {
        if (z10) {
            String str = b4Var.f20470e;
            a0.f fVar = this.d;
            Bitmap bitmap = (Bitmap) fVar.get(str);
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(this.H.getWidth(), this.H.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                int[] iArr = (int[]) R.get(b4Var.f20470e + "n");
                if (iArr != null) {
                    if (this.f36888r == null) {
                        this.f36888r = new org.telegram.ui.Components.dd0(true, 0, 0, 0, 0);
                    }
                    this.f36888r.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                    this.f36888r.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                    this.f36888r.draw(canvas);
                }
                canvas.drawBitmap(this.H, 0.0f, 0.0f, (Paint) null);
                canvas.setBitmap(null);
                fVar.put(b4Var.f20470e, bitmap);
            }
            return bitmap;
        }
        return this.H;
    }

    public final void b0(List list) {
        if (list != null && !list.isEmpty() && this.f36886f != null) {
            list.set(0, this.f36883b);
            ArrayList arrayList = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) list.get(i10);
                b4Var.n(this.currentAccount);
                org.telegram.ui.Components.bq bqVar = new org.telegram.ui.Components.bq(b4Var);
                boolean z10 = this.K;
                bqVar.f25004c = z10 ? 1 : 0;
                bqVar.f25005e = a0(b4Var, z10);
                arrayList.add(bqVar);
            }
            org.telegram.ui.Components.aq aqVar = this.f36886f.f36536b;
            aqVar.d = arrayList;
            aqVar.l();
            int i11 = 0;
            while (true) {
                if (i11 != arrayList.size()) {
                    if (fg.b.a(((org.telegram.ui.Components.bq) arrayList.get(i11)).f25002a.f20469c, this.J.f20469c)) {
                        this.f36886f.K = (org.telegram.ui.Components.bq) arrayList.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1) {
                this.f36886f.b(i11);
            }
            c31 c31Var = this.f36886f;
            a31 a31Var = c31Var.F;
            a31Var.setAlpha(0.0f);
            a31Var.animate().alpha(1.0f).setDuration(150L).start();
            a31Var.setVisibility(0);
            org.telegram.ui.Components.k10 k10Var = c31Var.f36541r;
            k10Var.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.ea(k10Var)).setDuration(150L).start();
            org.telegram.ui.Components.sm0 sm0Var = c31Var.f36545y;
            sm0Var.setAlpha(0.0f);
            sm0Var.animate().alpha(1.0f).setDuration(150L).start();
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
        org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var.f20471f.get(z11 ? 1 : 0);
        ValueAnimator valueAnimator = this.f36889s;
        if (valueAnimator != null) {
            f7 = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.f36889s.cancel();
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.dd0 dd0Var = this.h;
        this.f36887n = dd0Var;
        dd0Var.q(false);
        this.f36887n.setAlpha(255);
        org.telegram.ui.Components.dd0 dd0Var2 = new org.telegram.ui.Components.dd0();
        this.h = dd0Var2;
        dd0Var2.setCallback(this.f36890w);
        this.h.n(a4Var.f20425k, a4Var.f20426l, a4Var.f20427m, a4Var.f20428n);
        this.h.r(this.f36890w);
        this.h.s(1.0f);
        org.telegram.ui.Components.dd0 dd0Var3 = this.h;
        dd0Var3.N = true;
        org.telegram.ui.Components.dd0 dd0Var4 = this.f36887n;
        if (dd0Var4 != null) {
            dd0Var3.h = dd0Var4.h;
        }
        this.E.f43945a.h = dd0Var3.h;
        TLRPC.WallPaper k10 = this.J.k(z11 ? 1 : 0);
        if (k10 != null) {
            org.telegram.ui.Components.dd0 dd0Var5 = this.h;
            dd0Var5.t(dd0Var5.f25566u, k10.settings.intensity);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.J.o(z11 ? 1 : 0, new ResultCallback() {
                @Override
                public final void onComplete(Object obj) {
                    boolean z12;
                    Pair pair = (Pair) obj;
                    d31 d31Var = d31.this;
                    long i11 = d31Var.J.i(z11 ? 1 : 0);
                    if (pair != null && i11 != 0) {
                        long longValue = ((Long) pair.first).longValue();
                        Bitmap bitmap = ((dg.a) pair.second).f8349b;
                        if (longValue == i11 && bitmap != null) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            int i12 = d31Var.h.f25562q;
                            if (elapsedRealtime2 > 150) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            d31Var.d0(i12, bitmap, z12);
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
            Utilities.themeQueue.postRunnable(new o21(this, 2), 35L);
        }
        org.telegram.ui.Components.dd0 dd0Var6 = this.h;
        dd0Var6.u(dd0Var6.f());
        a0.f fVar = R;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b4Var.f20470e);
        if (z11) {
            str = "n";
        } else {
            str = "d";
        }
        sb2.append(str);
        int[] iArr = (int[]) fVar.get(sb2.toString());
        if (z10) {
            if (this.f36885e == null) {
                int[] iArr2 = new int[4];
                this.f36885e = iArr2;
                System.arraycopy(iArr, 0, iArr2, 0, 4);
            }
            this.h.setAlpha(255);
            org.telegram.ui.Components.dd0 dd0Var7 = this.h;
            dd0Var7.K = 0.0f;
            dd0Var7.i();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f36889s = ofFloat;
            ofFloat.addUpdateListener(new ai.x(23, this, iArr));
            this.f36889s.addListener(new org.telegram.ui.Components.wl0(12, this, iArr));
            this.f36889s.setDuration((int) (f7 * 250.0f));
            this.f36889s.start();
        } else {
            if (iArr != null) {
                x21 x21Var = this.E;
                x21Var.f43945a.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                x21Var.invalidate();
                System.arraycopy(iArr, 0, this.f36885e, 0, 4);
            }
            this.f36887n = null;
            this.f36890w.invalidate();
        }
        if (this.K) {
            B0 = org.telegram.ui.ActionBar.h6.J;
        } else {
            B0 = org.telegram.ui.ActionBar.h6.B0();
        }
        org.telegram.ui.ActionBar.a5 a5Var = new org.telegram.ui.ActionBar.a5(null, B0.Y, this.K, !z10);
        a5Var.f20434f = false;
        a5Var.f20433e = true;
        a5Var.f20440m = this.f36882a;
        a5Var.f20439l = (int) (f7 * 250.0f);
        AndroidUtilities.runOnUIThread(new ai.t4(this, z10, b4Var2, a5Var, 28));
    }

    @Override
    public final android.view.View createView(android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d31.createView(android.content.Context):android.view.View");
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
                ofFloat.addUpdateListener(new x11(this, 2));
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
        this.f36891x.setVisibility(8);
        this.G.setVisibility(8);
        this.F.setVisibility(8);
        this.F.getAnimatedDrawable();
        x21 x21Var = this.E;
        if (x21Var != null) {
            x21Var.d(true);
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
        this.f36891x.setVisibility(0);
        this.G.setVisibility(0);
        this.F.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        x21 x21Var2 = this.E;
        if (x21Var2 != null) {
            x21Var2.d(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e7) {
                e7.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new o21(this, 0), 500L);
    }

    @Override
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.f21698c;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.f36882a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.j6> themeDescriptions = super.getThemeDescriptions();
        c31 c31Var = this.f36886f;
        c31Var.getClass();
        b31 b31Var = new b31(c31Var);
        ArrayList arrayList = new ArrayList();
        Paint paint = c31Var.f36535a;
        int i10 = org.telegram.ui.ActionBar.h6.f20857h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 1, null, paint, null, null, i10));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 32, null, null, new Drawable[]{c31Var.f36539f}, b31Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(c31Var.f36540n, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20894j5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(c31Var.f36545y, 16, new Class[]{org.telegram.ui.Components.b31.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20876i5));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.ActionBar.j6) obj).f21255o = c31Var.d.f36882a;
        }
        themeDescriptions.addAll(arrayList);
        vy0 vy0Var = new vy0(3, this);
        TextView textView = this.f36886f.f36542s;
        int i13 = org.telegram.ui.ActionBar.h6.Oh;
        themeDescriptions.add(new org.telegram.ui.ActionBar.j6(textView, 32, null, null, null, vy0Var, i13));
        themeDescriptions.add(new org.telegram.ui.ActionBar.j6(this.f36886f.f36542s, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.Qh));
        TextView textView2 = this.f36886f.f36543w;
        if (textView2 != null) {
            themeDescriptions.add(new org.telegram.ui.ActionBar.j6(textView2, 4, null, null, null, vy0Var, i13));
            themeDescriptions.add(new org.telegram.ui.ActionBar.j6(this.f36886f.f36544x, 8, null, null, null, vy0Var, i13));
        }
        int size2 = themeDescriptions.size();
        while (i11 < size2) {
            org.telegram.ui.ActionBar.j6 j6Var = themeDescriptions.get(i11);
            i11++;
            j6Var.f21255o = this.f36882a;
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
        c31 c31Var = this.f36886f;
        c31Var.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(c31Var, NotificationCenter.emojiLoaded);
        this.f36886f = null;
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
            alertDialog$Builder.f20368a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new n21(this));
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
