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
public class o21 extends org.telegram.ui.ActionBar.p2 {
    public static final a0.f O;
    public static List P;
    public static boolean Q;
    public j21 B;
    public org.telegram.ui.Components.lj0 C;
    public ImageView D;
    public Bitmap E;
    public Bitmap F;
    public org.telegram.ui.ActionBar.f4 G;
    public boolean H;
    public long I;
    public long J;
    public int K;
    public int L;
    public boolean M;
    public i0.b N;
    public final n7.qa f39565a;
    public final org.telegram.ui.ActionBar.f4 f39566b;
    public final Rect f39567c;
    public final a0.f d;
    public int[] f39568e;
    public n21 f39569f;
    public org.telegram.ui.Components.fc0 h;
    public org.telegram.ui.Components.fc0 f39570n;
    public org.telegram.ui.Components.fc0 f39571r;
    public ValueAnimator f39572s;
    public ValueAnimator v;
    public iw0 f39573w;
    public ag.l f39574x;
    public org.telegram.ui.Components.p9 f39575y;

    static {
        ?? kVar = new a0.k(0);
        O = kVar;
        kVar.put("🏠d", new int[]{-9324972, -13856649, -6636738, -9915042});
        kVar.put("🐥d", new int[]{-12344463, -7684788, -6442695, -8013488});
        kVar.put("⛄d", new int[]{-10051073, -10897938, -12469550, -7694337});
        kVar.put("💎d", new int[]{-11429643, -11814958, -5408261, -2128185});
        kVar.put("👨\u200d🏫d", new int[]{-6637227, -12015466, -13198627, -10631557});
        kVar.put("🌷d", new int[]{-1146812, -1991901, -1745517, -3443241});
        kVar.put("💜d", new int[]{-1156738, -1876046, -5412366, -28073});
        kVar.put("🎄d", new int[]{-1281978, -551386, -1870308, -742870});
        kVar.put("🎮d", new int[]{-15092782, -2333964, -1684365, -1269214});
        kVar.put("🏠n", new int[]{-15368239, -11899662, -15173939, -13850930});
        kVar.put("🐥n", new int[]{-11033320, -14780848, -9594089, -12604587});
        kVar.put("⛄n", new int[]{-13930790, -13665098, -14833975, -9732865});
        kVar.put("💎n", new int[]{-5089608, -9481473, -14378302, -13337899});
        kVar.put("👨\u200d🏫n", new int[]{-14447768, -9199261, -15356801, -15823723});
        kVar.put("🌷n", new int[]{-2534316, -2984177, -3258783, -5480504});
        kVar.put("💜n", new int[]{-3123030, -2067394, -2599576, -6067757});
        kVar.put("🎄n", new int[]{-2725857, -3242459, -3248848, -3569123});
        kVar.put("🎮n", new int[]{-3718333, -1278154, -16338695, -6076417});
        Q = true;
    }

    public o21(Bundle bundle) {
        super(bundle);
        this.f39565a = new n7.qa(this);
        org.telegram.ui.ActionBar.f4 f4Var = new org.telegram.ui.ActionBar.f4(this.currentAccount);
        f4Var.f21361e = "🏠";
        f4Var.f21360c = tf.b.d("🏠");
        f4Var.d = TLRPC.ChatTheme.ofEmoticon(f4Var.f21361e);
        org.telegram.ui.ActionBar.e4 e4Var = new org.telegram.ui.ActionBar.e4();
        e4Var.f21310a = org.telegram.ui.ActionBar.k6.N0("Blue");
        e4Var.f21313e = 99;
        f4Var.f21362f.add(e4Var);
        org.telegram.ui.ActionBar.e4 e4Var2 = new org.telegram.ui.ActionBar.e4();
        e4Var2.f21310a = org.telegram.ui.ActionBar.k6.N0("Dark Blue");
        e4Var2.f21313e = 0;
        f4Var.f21362f.add(e4Var2);
        this.f39566b = f4Var;
        this.f39567c = new Rect();
        this.d = new a0.k(0);
        this.f39568e = null;
        this.h = new org.telegram.ui.Components.fc0();
        this.G = f4Var;
        this.L = -1;
        this.N = i0.b.f7756e;
    }

    public static void U(o21 o21Var) {
        if (o21Var.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && o21Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            o21Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        } else {
            f0(o21Var);
        }
    }

    public static void V(o21 o21Var) {
        Q = false;
        List list = P;
        if (list != null && !list.isEmpty()) {
            o21Var.c0(P);
        } else {
            ChatThemeController.getInstance(o21Var.currentAccount).requestAllChatThemes(new e21(o21Var), true);
        }
    }

    public static void W(o21 o21Var, boolean z4, org.telegram.ui.ActionBar.f4 f4Var, org.telegram.ui.ActionBar.e5 e5Var) {
        n7.qa qaVar = o21Var.f39565a;
        if (z4) {
            qaVar.f15699b = f4Var.b(((o21) qaVar.f15700c).currentAccount, o21Var.H ? 1 : 0);
        } else {
            qaVar.f15699b = o21Var.G.b(((o21) qaVar.f15700c).currentAccount, o21Var.H ? 1 : 0);
        }
        e5Var.h = new b21(o21Var, 3);
        ((ActionBarLayout) o21Var.parentLayout).f(e5Var, null);
        LinearLayout linearLayout = o21Var.f39569f.v;
        if (linearLayout != null) {
            linearLayout.setBackground(org.telegram.ui.ActionBar.a6.d(new float[]{6.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.a6.b(o21Var.getThemedColor(org.telegram.ui.ActionBar.k6.Oh)), 25)));
        }
    }

    public static void X(o21 o21Var) {
        o21Var.f39566b.n(o21Var.currentAccount);
        View view = o21Var.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new b21(o21Var, 1), 17L);
    }

    public static void f0(org.telegram.ui.ActionBar.p2 p2Var) {
        v9.e0(p2Var.getParentActivity(), 1, new f21(p2Var.getCurrentAccount(), p2Var));
    }

    public final Bitmap b0(org.telegram.ui.ActionBar.f4 f4Var, boolean z4) {
        if (z4) {
            String str = f4Var.f21361e;
            a0.f fVar = this.d;
            Bitmap bitmap = (Bitmap) fVar.get(str);
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(this.E.getWidth(), this.E.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                int[] iArr = (int[]) O.get(f4Var.f21361e + "n");
                if (iArr != null) {
                    if (this.f39571r == null) {
                        this.f39571r = new org.telegram.ui.Components.fc0(true, 0, 0, 0, 0);
                    }
                    this.f39571r.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                    this.f39571r.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                    this.f39571r.draw(canvas);
                }
                canvas.drawBitmap(this.E, 0.0f, 0.0f, (Paint) null);
                canvas.setBitmap(null);
                fVar.put(f4Var.f21361e, bitmap);
            }
            return bitmap;
        }
        return this.E;
    }

    public final void c0(List list) {
        if (list != null && !list.isEmpty() && this.f39569f != null) {
            list.set(0, this.f39566b);
            ArrayList arrayList = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                org.telegram.ui.ActionBar.f4 f4Var = (org.telegram.ui.ActionBar.f4) list.get(i10);
                f4Var.n(this.currentAccount);
                org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(f4Var);
                boolean z4 = this.H;
                lpVar.f28798c = z4 ? 1 : 0;
                lpVar.f28799e = b0(f4Var, z4);
                arrayList.add(lpVar);
            }
            org.telegram.ui.Components.kp kpVar = this.f39569f.f39270b;
            kpVar.d = arrayList;
            kpVar.l();
            int i11 = 0;
            while (true) {
                if (i11 != arrayList.size()) {
                    if (tf.b.a(((org.telegram.ui.Components.lp) arrayList.get(i11)).f28796a.f21360c, this.G.f21360c)) {
                        this.f39569f.H = (org.telegram.ui.Components.lp) arrayList.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1) {
                this.f39569f.b(i11);
            }
            n21 n21Var = this.f39569f;
            l21 l21Var = n21Var.C;
            l21Var.setAlpha(0.0f);
            l21Var.animate().alpha(1.0f).setDuration(150L).start();
            l21Var.setVisibility(0);
            org.telegram.ui.Components.u00 u00Var = n21Var.f39275r;
            u00Var.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.x20(u00Var)).setDuration(150L).start();
            org.telegram.ui.Components.tl0 tl0Var = n21Var.f39279y;
            tl0Var.setAlpha(0.0f);
            tl0Var.animate().alpha(1.0f).setDuration(150L).start();
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o21.createView(android.content.Context):android.view.View");
    }

    public final void d0(int i10, org.telegram.ui.ActionBar.f4 f4Var, boolean z4) {
        float f10;
        String str;
        org.telegram.ui.ActionBar.j6 A0;
        this.L = i10;
        org.telegram.ui.ActionBar.f4 f4Var2 = this.G;
        final boolean z10 = this.H;
        this.G = f4Var;
        org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) f4Var.f21362f.get(z10 ? 1 : 0);
        ValueAnimator valueAnimator = this.f39572s;
        if (valueAnimator != null) {
            f10 = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.f39572s.cancel();
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.fc0 fc0Var = this.h;
        this.f39570n = fc0Var;
        fc0Var.q(false);
        this.f39570n.setAlpha(255);
        org.telegram.ui.Components.fc0 fc0Var2 = new org.telegram.ui.Components.fc0();
        this.h = fc0Var2;
        fc0Var2.setCallback(this.f39573w);
        this.h.n(e4Var.f21318k, e4Var.f21319l, e4Var.f21320m, e4Var.f21321n);
        this.h.r(this.f39573w);
        this.h.s(1.0f);
        org.telegram.ui.Components.fc0 fc0Var3 = this.h;
        fc0Var3.N = true;
        org.telegram.ui.Components.fc0 fc0Var4 = this.f39570n;
        if (fc0Var4 != null) {
            fc0Var3.h = fc0Var4.h;
        }
        this.B.f37992a.h = fc0Var3.h;
        TLRPC.WallPaper k10 = this.G.k(z10 ? 1 : 0);
        if (k10 != null) {
            org.telegram.ui.Components.fc0 fc0Var5 = this.h;
            fc0Var5.t(fc0Var5.f26889u, k10.settings.intensity);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.G.o(z10 ? 1 : 0, new ResultCallback() {
                @Override
                public final void onComplete(Object obj) {
                    boolean z11;
                    Pair pair = (Pair) obj;
                    o21 o21Var = o21.this;
                    long i11 = o21Var.G.i(z10 ? 1 : 0);
                    if (pair != null && i11 != 0) {
                        long longValue = ((Long) pair.first).longValue();
                        Bitmap bitmap = ((qf.a) pair.second).f44831b;
                        if (longValue == i11 && bitmap != null) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            int i12 = o21Var.h.f26885q;
                            if (elapsedRealtime2 > 150) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            o21Var.e0(i12, bitmap, z11);
                        }
                    }
                }

                @Override
                public final void onError(Throwable th2) {
                    org.telegram.tgnet.k.a(this, th2);
                }

                @Override
                public final void onError(TLRPC.TL_error tL_error) {
                    org.telegram.tgnet.k.b(this, tL_error);
                }
            });
        } else {
            Utilities.themeQueue.postRunnable(new b21(this, 2), 35L);
        }
        org.telegram.ui.Components.fc0 fc0Var6 = this.h;
        fc0Var6.u(fc0Var6.f());
        a0.f fVar = O;
        StringBuilder sb = new StringBuilder();
        sb.append(f4Var.f21361e);
        if (z10) {
            str = "n";
        } else {
            str = "d";
        }
        sb.append(str);
        int[] iArr = (int[]) fVar.get(sb.toString());
        if (z4) {
            if (this.f39568e == null) {
                int[] iArr2 = new int[4];
                this.f39568e = iArr2;
                System.arraycopy(iArr, 0, iArr2, 0, 4);
            }
            this.h.setAlpha(255);
            org.telegram.ui.Components.fc0 fc0Var7 = this.h;
            fc0Var7.K = 0.0f;
            fc0Var7.i();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f39572s = ofFloat;
            ofFloat.addUpdateListener(new bg.a(22, this, iArr));
            this.f39572s.addListener(new org.telegram.ui.Components.fx0(9, this, iArr));
            this.f39572s.setDuration((int) (f10 * 250.0f));
            this.f39572s.start();
        } else {
            if (iArr != null) {
                j21 j21Var = this.B;
                j21Var.f37992a.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                j21Var.invalidate();
                System.arraycopy(iArr, 0, this.f39568e, 0, 4);
            }
            this.f39570n = null;
            this.f39573w.invalidate();
        }
        if (this.H) {
            A0 = org.telegram.ui.ActionBar.k6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.k6.A0();
        }
        org.telegram.ui.ActionBar.e5 e5Var = new org.telegram.ui.ActionBar.e5(null, A0.V, this.H, !z4);
        e5Var.f21327f = false;
        e5Var.f21326e = true;
        e5Var.f21333m = this.f39565a;
        e5Var.f21332l = (int) (f10 * 250.0f);
        AndroidUtilities.runOnUIThread(new dg.t0(this, z4, f4Var2, e5Var, 23));
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0(int i10, Bitmap bitmap, boolean z4) {
        if (bitmap != null) {
            this.h.t(bitmap, i10);
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z4) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new j11(this, 2));
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
        float f10 = min;
        if ((max * 1.0f) / f10 > 1.92f) {
            max = (int) (f10 * 1.92f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, max, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.f39574x.setVisibility(8);
        this.D.setVisibility(8);
        this.C.setVisibility(8);
        this.C.getAnimatedDrawable();
        j21 j21Var = this.B;
        if (j21Var != null) {
            j21Var.d(true);
        }
        this.fragmentView.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(max, 1073741824));
        this.fragmentView.layout(0, 0, min, max);
        this.fragmentView.draw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.C.getLeft(), this.C.getTop(), this.C.getRight(), this.C.getBottom());
        if (this.F != null) {
            canvas.drawBitmap(this.F, (Rect) null, rectF, new Paint(2));
        }
        canvas.setBitmap(null);
        this.f39574x.setVisibility(0);
        this.D.setVisibility(0);
        this.C.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        j21 j21Var2 = this.B;
        if (j21Var2 != null) {
            j21Var2.d(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e6) {
                e6.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new b21(this, 0), 500L);
    }

    @Override
    public final org.telegram.ui.ActionBar.a4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.a4.f21182c;
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.f39565a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.m6> themeDescriptions = super.getThemeDescriptions();
        n21 n21Var = this.f39569f;
        n21Var.getClass();
        m21 m21Var = new m21(n21Var);
        ArrayList arrayList = new ArrayList();
        Paint paint = n21Var.f39269a;
        int i10 = org.telegram.ui.ActionBar.k6.f21731h5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 1, null, paint, null, null, i10));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 32, null, null, new Drawable[]{n21Var.f39273f}, m21Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(n21Var.f39274n, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f21766j5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(n21Var.f39279y, 16, new Class[]{org.telegram.ui.Components.x11.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21749i5));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.ActionBar.m6) obj).f22151o = n21Var.d.f39565a;
        }
        themeDescriptions.addAll(arrayList);
        ey0 ey0Var = new ey0(3, this);
        TextView textView = this.f39569f.f39276s;
        int i13 = org.telegram.ui.ActionBar.k6.Oh;
        themeDescriptions.add(new org.telegram.ui.ActionBar.m6(textView, 32, null, null, null, ey0Var, i13));
        themeDescriptions.add(new org.telegram.ui.ActionBar.m6(this.f39569f.f39276s, 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.Qh));
        TextView textView2 = this.f39569f.f39277w;
        if (textView2 != null) {
            themeDescriptions.add(new org.telegram.ui.ActionBar.m6(textView2, 4, null, null, null, ey0Var, i13));
            themeDescriptions.add(new org.telegram.ui.ActionBar.m6(this.f39569f.f39278x, 8, null, null, null, ey0Var, i13));
        }
        int size2 = themeDescriptions.size();
        while (i11 < size2) {
            org.telegram.ui.ActionBar.m6 m6Var = themeDescriptions.get(i11);
            i11++;
            m6Var.f22151o = this.f39565a;
        }
        return themeDescriptions;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.I = this.arguments.getLong("user_id");
        this.J = this.arguments.getLong("chat_id");
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        a0.f fVar;
        n21 n21Var = this.f39569f;
        n21Var.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(n21Var, NotificationCenter.emojiLoaded);
        this.f39569f = null;
        this.E.recycle();
        this.E = null;
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
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.K);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.K);
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
            alertDialog$Builder.f21166a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new a21(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.K | 1028);
        }
    }
}
