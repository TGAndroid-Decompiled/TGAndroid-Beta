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
public class k31 extends org.telegram.ui.ActionBar.p2 {
    public static final a0.f R;
    public static List S;
    public static boolean T;
    public e31 E;
    public org.telegram.ui.Components.kj0 F;
    public ImageView G;
    public Bitmap H;
    public Bitmap I;
    public org.telegram.ui.ActionBar.f4 J;
    public boolean K;
    public long L;
    public long M;
    public int N;
    public int O;
    public boolean P;
    public i0.c Q;
    public final n7.a1 f34209a;
    public final org.telegram.ui.ActionBar.f4 f34210b;
    public final Rect f34211c;
    public final a0.f d;
    public int[] e;
    public j31 f34212f;
    public org.telegram.ui.Components.lc0 h;
    public org.telegram.ui.Components.lc0 f34213n;
    public org.telegram.ui.Components.lc0 f34214r;
    public ValueAnimator f34215s;
    public ValueAnimator v;
    public t50 f34216w;
    public bi.n7 f34217x;
    public org.telegram.ui.Components.w9 f34218y;

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

    public k31(Bundle bundle) {
        super(bundle);
        this.f34209a = new n7.a1(this, 10);
        org.telegram.ui.ActionBar.f4 f4Var = new org.telegram.ui.ActionBar.f4(this.currentAccount);
        f4Var.e = "🏠";
        f4Var.f17716c = eg.b.d("🏠");
        f4Var.d = TLRPC.ChatTheme.ofEmoticon(f4Var.e);
        org.telegram.ui.ActionBar.e4 e4Var = new org.telegram.ui.ActionBar.e4();
        e4Var.f17670a = org.telegram.ui.ActionBar.j6.N0("Blue");
        e4Var.e = 99;
        f4Var.f17717f.add(e4Var);
        org.telegram.ui.ActionBar.e4 e4Var2 = new org.telegram.ui.ActionBar.e4();
        e4Var2.f17670a = org.telegram.ui.ActionBar.j6.N0("Dark Blue");
        e4Var2.e = 0;
        f4Var.f17717f.add(e4Var2);
        this.f34210b = f4Var;
        this.f34211c = new Rect();
        this.d = new a0.l(0);
        this.e = null;
        this.h = new org.telegram.ui.Components.lc0();
        this.J = f4Var;
        this.O = -1;
        this.Q = i0.c.e;
    }

    public static void U(k31 k31Var) {
        if (k31Var.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && k31Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            k31Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        } else {
            f0(k31Var);
        }
    }

    public static void V(k31 k31Var) {
        T = false;
        List list = S;
        if (list != null && !list.isEmpty()) {
            k31Var.c0(S);
        } else {
            ChatThemeController.getInstance(k31Var.currentAccount).requestAllChatThemes(new z21(k31Var), true);
        }
    }

    public static void W(k31 k31Var, boolean z10, org.telegram.ui.ActionBar.f4 f4Var, org.telegram.ui.ActionBar.e5 e5Var) {
        n7.a1 a1Var = k31Var.f34209a;
        if (z10) {
            a1Var.f13938b = f4Var.b(((k31) a1Var.f13939c).currentAccount, k31Var.K ? 1 : 0);
        } else {
            a1Var.f13938b = k31Var.J.b(((k31) a1Var.f13939c).currentAccount, k31Var.K ? 1 : 0);
        }
        e5Var.h = new w21(k31Var, 3);
        ((ActionBarLayout) k31Var.parentLayout).f(e5Var, null);
        LinearLayout linearLayout = k31Var.f34212f.v;
        if (linearLayout != null) {
            linearLayout.setBackground(org.telegram.ui.ActionBar.z5.d(new float[]{6.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.z5.b(k31Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oh)), 25)));
        }
    }

    public static void X(k31 k31Var) {
        k31Var.f34210b.n(k31Var.currentAccount);
        View view = k31Var.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new w21(k31Var, 1), 17L);
    }

    public static int Z(k31 k31Var) {
        return k31Var.currentAccount;
    }

    public static int a0(k31 k31Var) {
        return k31Var.currentAccount;
    }

    public static void f0(org.telegram.ui.ActionBar.p2 p2Var) {
        u9.e0(p2Var.getParentActivity(), 1, new a31(p2Var.getCurrentAccount(), p2Var));
    }

    public final Bitmap b0(org.telegram.ui.ActionBar.f4 f4Var, boolean z10) {
        if (z10) {
            String str = f4Var.e;
            a0.f fVar = this.d;
            Bitmap bitmap = (Bitmap) fVar.get(str);
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(this.H.getWidth(), this.H.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                int[] iArr = (int[]) R.get(f4Var.e + "n");
                if (iArr != null) {
                    if (this.f34214r == null) {
                        this.f34214r = new org.telegram.ui.Components.lc0(true, 0, 0, 0, 0);
                    }
                    this.f34214r.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                    this.f34214r.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                    this.f34214r.draw(canvas);
                }
                canvas.drawBitmap(this.H, 0.0f, 0.0f, (Paint) null);
                canvas.setBitmap(null);
                fVar.put(f4Var.e, bitmap);
            }
            return bitmap;
        }
        return this.H;
    }

    public final void c0(List list) {
        if (list != null && !list.isEmpty() && this.f34212f != null) {
            list.set(0, this.f34210b);
            ArrayList arrayList = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                org.telegram.ui.ActionBar.f4 f4Var = (org.telegram.ui.ActionBar.f4) list.get(i10);
                f4Var.n(this.currentAccount);
                org.telegram.ui.Components.rp rpVar = new org.telegram.ui.Components.rp(f4Var);
                boolean z10 = this.K;
                rpVar.f26735c = z10 ? 1 : 0;
                rpVar.e = b0(f4Var, z10);
                arrayList.add(rpVar);
            }
            org.telegram.ui.Components.qp qpVar = this.f34212f.f33867b;
            qpVar.d = arrayList;
            qpVar.l();
            int i11 = 0;
            while (true) {
                if (i11 != arrayList.size()) {
                    if (eg.b.a(((org.telegram.ui.Components.rp) arrayList.get(i11)).f26733a.f17716c, this.J.f17716c)) {
                        this.f34212f.K = (org.telegram.ui.Components.rp) arrayList.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1) {
                this.f34212f.b(i11);
            }
            j31 j31Var = this.f34212f;
            h31 h31Var = j31Var.F;
            h31Var.setAlpha(0.0f);
            h31Var.animate().alpha(1.0f).setDuration(150L).start();
            h31Var.setVisibility(0);
            org.telegram.ui.Components.a10 a10Var = j31Var.f33871r;
            a10Var.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.yo(a10Var)).setDuration(150L).start();
            org.telegram.ui.Components.vl0 vl0Var = j31Var.f33875y;
            vl0Var.setAlpha(0.0f);
            vl0Var.animate().alpha(1.0f).setDuration(150L).start();
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k31.createView(android.content.Context):android.view.View");
    }

    public final void d0(int i10, org.telegram.ui.ActionBar.f4 f4Var, boolean z10) {
        float f7;
        String str;
        org.telegram.ui.ActionBar.i6 A0;
        this.O = i10;
        org.telegram.ui.ActionBar.f4 f4Var2 = this.J;
        final boolean z11 = this.K;
        this.J = f4Var;
        org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) f4Var.f17717f.get(z11 ? 1 : 0);
        ValueAnimator valueAnimator = this.f34215s;
        if (valueAnimator != null) {
            f7 = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.f34215s.cancel();
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.lc0 lc0Var = this.h;
        this.f34213n = lc0Var;
        lc0Var.q(false);
        this.f34213n.setAlpha(255);
        org.telegram.ui.Components.lc0 lc0Var2 = new org.telegram.ui.Components.lc0();
        this.h = lc0Var2;
        lc0Var2.setCallback(this.f34216w);
        this.h.n(e4Var.f17677k, e4Var.f17678l, e4Var.f17679m, e4Var.f17680n);
        this.h.r(this.f34216w);
        this.h.s(1.0f);
        org.telegram.ui.Components.lc0 lc0Var3 = this.h;
        lc0Var3.N = true;
        org.telegram.ui.Components.lc0 lc0Var4 = this.f34213n;
        if (lc0Var4 != null) {
            lc0Var3.h = lc0Var4.h;
        }
        this.E.f32047a.h = lc0Var3.h;
        TLRPC.WallPaper k10 = this.J.k(z11 ? 1 : 0);
        if (k10 != null) {
            org.telegram.ui.Components.lc0 lc0Var5 = this.h;
            lc0Var5.t(lc0Var5.f24959u, k10.settings.intensity);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.J.o(z11 ? 1 : 0, new ResultCallback() {
                @Override
                public final void onComplete(Object obj) {
                    boolean z12;
                    Pair pair = (Pair) obj;
                    k31 k31Var = k31.this;
                    long i11 = k31Var.J.i(z11 ? 1 : 0);
                    if (pair != null && i11 != 0) {
                        long longValue = ((Long) pair.first).longValue();
                        Bitmap bitmap = ((cg.a) pair.second).f4676b;
                        if (longValue == i11 && bitmap != null) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            int i12 = k31Var.h.f24955q;
                            if (elapsedRealtime2 > 150) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            k31Var.e0(i12, bitmap, z12);
                        }
                    }
                }

                @Override
                public final void onError(Throwable th2) {
                    org.telegram.tgnet.o.a(this, th2);
                }

                @Override
                public final void onError(TLRPC.TL_error tL_error) {
                    org.telegram.tgnet.o.b(this, tL_error);
                }
            });
        } else {
            Utilities.themeQueue.postRunnable(new w21(this, 2), 35L);
        }
        org.telegram.ui.Components.lc0 lc0Var6 = this.h;
        lc0Var6.u(lc0Var6.f());
        a0.f fVar = R;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f4Var.e);
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
            org.telegram.ui.Components.lc0 lc0Var7 = this.h;
            lc0Var7.K = 0.0f;
            lc0Var7.i();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f34215s = ofFloat;
            ofFloat.addUpdateListener(new gg.t1(21, this, iArr));
            this.f34215s.addListener(new org.telegram.ui.Components.vv0(10, this, iArr));
            this.f34215s.setDuration((int) (f7 * 250.0f));
            this.f34215s.start();
        } else {
            if (iArr != null) {
                e31 e31Var = this.E;
                e31Var.f32047a.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                e31Var.invalidate();
                System.arraycopy(iArr, 0, this.e, 0, 4);
            }
            this.f34213n = null;
            this.f34216w.invalidate();
        }
        if (this.K) {
            A0 = org.telegram.ui.ActionBar.j6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.j6.A0();
        }
        org.telegram.ui.ActionBar.e5 e5Var = new org.telegram.ui.ActionBar.e5(null, A0.Y, this.K, !z10);
        e5Var.f17685f = false;
        e5Var.e = true;
        e5Var.f17691m = this.f34209a;
        e5Var.f17690l = (int) (f7 * 250.0f);
        AndroidUtilities.runOnUIThread(new bi.g2(this, z10, f4Var2, e5Var, 27));
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
                ofFloat.addUpdateListener(new f21(this, 2));
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
        this.f34217x.setVisibility(8);
        this.G.setVisibility(8);
        this.F.setVisibility(8);
        this.F.getAnimatedDrawable();
        e31 e31Var = this.E;
        if (e31Var != null) {
            e31Var.d(true);
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
        this.f34217x.setVisibility(0);
        this.G.setVisibility(0);
        this.F.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        e31 e31Var2 = this.E;
        if (e31Var2 != null) {
            e31Var2.d(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new w21(this, 0), 500L);
    }

    @Override
    public final org.telegram.ui.ActionBar.c4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.c4.f17574c;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.f34209a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> themeDescriptions = super.getThemeDescriptions();
        j31 j31Var = this.f34212f;
        j31Var.getClass();
        i31 i31Var = new i31(j31Var);
        ArrayList arrayList = new ArrayList();
        Paint paint = j31Var.f33866a;
        int i10 = org.telegram.ui.ActionBar.j6.f17998h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 1, null, paint, null, null, i10));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 32, null, null, new Drawable[]{j31Var.f33869f}, i31Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(j31Var.f33870n, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f18034j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(j31Var.f33875y, 16, new Class[]{org.telegram.ui.Components.i21.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18016i5));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.ActionBar.l6) obj).f18465o = j31Var.d.f34209a;
        }
        themeDescriptions.addAll(arrayList);
        zy0 zy0Var = new zy0(3, this);
        TextView textView = this.f34212f.f33872s;
        int i13 = org.telegram.ui.ActionBar.j6.Oh;
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(textView, 32, null, null, null, zy0Var, i13));
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(this.f34212f.f33872s, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.Qh));
        TextView textView2 = this.f34212f.f33873w;
        if (textView2 != null) {
            themeDescriptions.add(new org.telegram.ui.ActionBar.l6(textView2, 4, null, null, null, zy0Var, i13));
            themeDescriptions.add(new org.telegram.ui.ActionBar.l6(this.f34212f.f33874x, 8, null, null, null, zy0Var, i13));
        }
        int size2 = themeDescriptions.size();
        while (i11 < size2) {
            org.telegram.ui.ActionBar.l6 l6Var = themeDescriptions.get(i11);
            i11++;
            l6Var.f18465o = this.f34209a;
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
        j31 j31Var = this.f34212f;
        j31Var.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(j31Var, NotificationCenter.emojiLoaded);
        this.f34212f = null;
        this.H.recycle();
        this.H = null;
        int i10 = 0;
        while (true) {
            fVar = this.d;
            if (i10 >= fVar.f28c) {
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
            alertDialog$Builder.f17528a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new v21(this));
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
