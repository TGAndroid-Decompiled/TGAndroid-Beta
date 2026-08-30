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
public class m21 extends org.telegram.ui.ActionBar.p2 {
    public static final a0.f O;
    public static List P;
    public static boolean Q;
    public h21 B;
    public org.telegram.ui.Components.jj0 C;
    public ImageView D;
    public Bitmap E;
    public Bitmap F;
    public org.telegram.ui.ActionBar.e4 G;
    public boolean H;
    public long I;
    public long J;
    public int K;
    public int L;
    public boolean M;
    public i0.b N;
    public final n7.qa f36169a;
    public final org.telegram.ui.ActionBar.e4 f36170b;
    public final Rect f36171c;
    public final a0.f d;
    public int[] e;
    public l21 f36172f;
    public org.telegram.ui.Components.dc0 h;
    public org.telegram.ui.Components.dc0 f36173n;
    public org.telegram.ui.Components.dc0 f36174r;
    public ValueAnimator f36175s;
    public ValueAnimator v;
    public gw0 f36176w;
    public ah.d f36177x;
    public org.telegram.ui.Components.p9 f36178y;

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

    public m21(Bundle bundle) {
        super(bundle);
        this.f36169a = new n7.qa(this);
        org.telegram.ui.ActionBar.e4 e4Var = new org.telegram.ui.ActionBar.e4(this.currentAccount);
        e4Var.e = "🏠";
        e4Var.f19665c = sf.b.d("🏠");
        e4Var.d = TLRPC.ChatTheme.ofEmoticon(e4Var.e);
        org.telegram.ui.ActionBar.d4 d4Var = new org.telegram.ui.ActionBar.d4();
        d4Var.f19621a = org.telegram.ui.ActionBar.j6.N0("Blue");
        d4Var.e = 99;
        e4Var.f19666f.add(d4Var);
        org.telegram.ui.ActionBar.d4 d4Var2 = new org.telegram.ui.ActionBar.d4();
        d4Var2.f19621a = org.telegram.ui.ActionBar.j6.N0("Dark Blue");
        d4Var2.e = 0;
        e4Var.f19666f.add(d4Var2);
        this.f36170b = e4Var;
        this.f36171c = new Rect();
        this.d = new a0.k(0);
        this.e = null;
        this.h = new org.telegram.ui.Components.dc0();
        this.G = e4Var;
        this.L = -1;
        this.N = i0.b.e;
    }

    public static void U(m21 m21Var) {
        if (m21Var.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && m21Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            m21Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        } else {
            f0(m21Var);
        }
    }

    public static void V(m21 m21Var) {
        Q = false;
        List list = P;
        if (list != null && !list.isEmpty()) {
            m21Var.c0(P);
        } else {
            ChatThemeController.getInstance(m21Var.currentAccount).requestAllChatThemes(new b21(m21Var), true);
        }
    }

    public static void W(m21 m21Var, boolean z4, org.telegram.ui.ActionBar.e4 e4Var, org.telegram.ui.ActionBar.d5 d5Var) {
        n7.qa qaVar = m21Var.f36169a;
        if (z4) {
            qaVar.f14702b = e4Var.b(((m21) qaVar.f14703c).currentAccount, m21Var.H ? 1 : 0);
        } else {
            qaVar.f14702b = m21Var.G.b(((m21) qaVar.f14703c).currentAccount, m21Var.H ? 1 : 0);
        }
        d5Var.h = new y11(m21Var, 3);
        ((ActionBarLayout) m21Var.parentLayout).f(d5Var, null);
        LinearLayout linearLayout = m21Var.f36172f.v;
        if (linearLayout != null) {
            linearLayout.setBackground(org.telegram.ui.ActionBar.z5.d(new float[]{6.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.z5.b(m21Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oh)), 25)));
        }
    }

    public static void X(m21 m21Var) {
        m21Var.f36170b.n(m21Var.currentAccount);
        View view = m21Var.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new y11(m21Var, 1), 17L);
    }

    public static void f0(org.telegram.ui.ActionBar.p2 p2Var) {
        v9.e0(p2Var.getParentActivity(), 1, new d21(p2Var.getCurrentAccount(), p2Var));
    }

    public final Bitmap b0(org.telegram.ui.ActionBar.e4 e4Var, boolean z4) {
        if (z4) {
            String str = e4Var.e;
            a0.f fVar = this.d;
            Bitmap bitmap = (Bitmap) fVar.get(str);
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(this.E.getWidth(), this.E.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                int[] iArr = (int[]) O.get(e4Var.e + "n");
                if (iArr != null) {
                    if (this.f36174r == null) {
                        this.f36174r = new org.telegram.ui.Components.dc0(true, 0, 0, 0, 0);
                    }
                    this.f36174r.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                    this.f36174r.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                    this.f36174r.draw(canvas);
                }
                canvas.drawBitmap(this.E, 0.0f, 0.0f, (Paint) null);
                canvas.setBitmap(null);
                fVar.put(e4Var.e, bitmap);
            }
            return bitmap;
        }
        return this.E;
    }

    public final void c0(List list) {
        if (list != null && !list.isEmpty() && this.f36172f != null) {
            list.set(0, this.f36170b);
            ArrayList arrayList = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) list.get(i10);
                e4Var.n(this.currentAccount);
                org.telegram.ui.Components.jp jpVar = new org.telegram.ui.Components.jp(e4Var);
                boolean z4 = this.H;
                jpVar.f26017c = z4 ? 1 : 0;
                jpVar.e = b0(e4Var, z4);
                arrayList.add(jpVar);
            }
            org.telegram.ui.Components.ip ipVar = this.f36172f.f35890b;
            ipVar.d = arrayList;
            ipVar.l();
            int i11 = 0;
            while (true) {
                if (i11 != arrayList.size()) {
                    if (sf.b.a(((org.telegram.ui.Components.jp) arrayList.get(i11)).f26015a.f19665c, this.G.f19665c)) {
                        this.f36172f.H = (org.telegram.ui.Components.jp) arrayList.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1) {
                this.f36172f.b(i11);
            }
            l21 l21Var = this.f36172f;
            j21 j21Var = l21Var.C;
            j21Var.setAlpha(0.0f);
            j21Var.animate().alpha(1.0f).setDuration(150L).start();
            j21Var.setVisibility(0);
            org.telegram.ui.Components.t00 t00Var = l21Var.f35894r;
            t00Var.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.l00(t00Var)).setDuration(150L).start();
            org.telegram.ui.Components.sl0 sl0Var = l21Var.f35898y;
            sl0Var.setAlpha(0.0f);
            sl0Var.animate().alpha(1.0f).setDuration(150L).start();
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m21.createView(android.content.Context):android.view.View");
    }

    public final void d0(int i10, org.telegram.ui.ActionBar.e4 e4Var, boolean z4) {
        float f10;
        String str;
        org.telegram.ui.ActionBar.i6 A0;
        this.L = i10;
        org.telegram.ui.ActionBar.e4 e4Var2 = this.G;
        final boolean z10 = this.H;
        this.G = e4Var;
        org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) e4Var.f19666f.get(z10 ? 1 : 0);
        ValueAnimator valueAnimator = this.f36175s;
        if (valueAnimator != null) {
            f10 = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.f36175s.cancel();
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.dc0 dc0Var = this.h;
        this.f36173n = dc0Var;
        dc0Var.q(false);
        this.f36173n.setAlpha(255);
        org.telegram.ui.Components.dc0 dc0Var2 = new org.telegram.ui.Components.dc0();
        this.h = dc0Var2;
        dc0Var2.setCallback(this.f36176w);
        this.h.n(d4Var.f19628k, d4Var.f19629l, d4Var.f19630m, d4Var.f19631n);
        this.h.r(this.f36176w);
        this.h.s(1.0f);
        org.telegram.ui.Components.dc0 dc0Var3 = this.h;
        dc0Var3.N = true;
        org.telegram.ui.Components.dc0 dc0Var4 = this.f36173n;
        if (dc0Var4 != null) {
            dc0Var3.h = dc0Var4.h;
        }
        this.B.f34734a.h = dc0Var3.h;
        TLRPC.WallPaper k10 = this.G.k(z10 ? 1 : 0);
        if (k10 != null) {
            org.telegram.ui.Components.dc0 dc0Var5 = this.h;
            dc0Var5.t(dc0Var5.f24251u, k10.settings.intensity);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.G.o(z10 ? 1 : 0, new ResultCallback() {
                @Override
                public final void onComplete(Object obj) {
                    boolean z11;
                    Pair pair = (Pair) obj;
                    m21 m21Var = m21.this;
                    long i11 = m21Var.G.i(z10 ? 1 : 0);
                    if (pair != null && i11 != 0) {
                        long longValue = ((Long) pair.first).longValue();
                        Bitmap bitmap = ((qf.a) pair.second).f43051b;
                        if (longValue == i11 && bitmap != null) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            int i12 = m21Var.h.f24247q;
                            if (elapsedRealtime2 > 150) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            m21Var.e0(i12, bitmap, z11);
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
            Utilities.themeQueue.postRunnable(new y11(this, 2), 35L);
        }
        org.telegram.ui.Components.dc0 dc0Var6 = this.h;
        dc0Var6.u(dc0Var6.f());
        a0.f fVar = O;
        StringBuilder sb = new StringBuilder();
        sb.append(e4Var.e);
        if (z10) {
            str = "n";
        } else {
            str = "d";
        }
        sb.append(str);
        int[] iArr = (int[]) fVar.get(sb.toString());
        if (z4) {
            if (this.e == null) {
                int[] iArr2 = new int[4];
                this.e = iArr2;
                System.arraycopy(iArr, 0, iArr2, 0, 4);
            }
            this.h.setAlpha(255);
            org.telegram.ui.Components.dc0 dc0Var7 = this.h;
            dc0Var7.K = 0.0f;
            dc0Var7.i();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f36175s = ofFloat;
            ofFloat.addUpdateListener(new ag.a(22, this, iArr));
            this.f36175s.addListener(new org.telegram.ui.Components.ex0(9, this, iArr));
            this.f36175s.setDuration((int) (f10 * 250.0f));
            this.f36175s.start();
        } else {
            if (iArr != null) {
                h21 h21Var = this.B;
                h21Var.f34734a.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                h21Var.invalidate();
                System.arraycopy(iArr, 0, this.e, 0, 4);
            }
            this.f36173n = null;
            this.f36176w.invalidate();
        }
        if (this.H) {
            A0 = org.telegram.ui.ActionBar.j6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.j6.A0();
        }
        org.telegram.ui.ActionBar.d5 d5Var = new org.telegram.ui.ActionBar.d5(null, A0.V, this.H, !z4);
        d5Var.f19636f = false;
        d5Var.e = true;
        d5Var.f19642m = this.f36169a;
        d5Var.f19641l = (int) (f10 * 250.0f);
        AndroidUtilities.runOnUIThread(new cg.u0(this, z4, e4Var2, d5Var, 23));
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
                ofFloat.addUpdateListener(new h11(this, 2));
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
        this.f36177x.setVisibility(8);
        this.D.setVisibility(8);
        this.C.setVisibility(8);
        this.C.getAnimatedDrawable();
        h21 h21Var = this.B;
        if (h21Var != null) {
            h21Var.d(true);
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
        this.f36177x.setVisibility(0);
        this.D.setVisibility(0);
        this.C.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        h21 h21Var2 = this.B;
        if (h21Var2 != null) {
            h21Var2.d(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new y11(this, 0), 500L);
    }

    @Override
    public final org.telegram.ui.ActionBar.z3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.z3.f20784c;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.f36169a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> themeDescriptions = super.getThemeDescriptions();
        l21 l21Var = this.f36172f;
        l21Var.getClass();
        k21 k21Var = new k21(l21Var);
        ArrayList arrayList = new ArrayList();
        Paint paint = l21Var.f35889a;
        int i10 = org.telegram.ui.ActionBar.j6.f19977h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 1, null, paint, null, null, i10));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 32, null, null, new Drawable[]{l21Var.f35892f}, k21Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(l21Var.f35893n, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f20012j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(l21Var.f35898y, 16, new Class[]{org.telegram.ui.Components.w11.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19995i5));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.ActionBar.l6) obj).f20442o = l21Var.d.f36169a;
        }
        themeDescriptions.addAll(arrayList);
        cy0 cy0Var = new cy0(3, this);
        TextView textView = this.f36172f.f35895s;
        int i13 = org.telegram.ui.ActionBar.j6.Oh;
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(textView, 32, null, null, null, cy0Var, i13));
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(this.f36172f.f35895s, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.Qh));
        TextView textView2 = this.f36172f.f35896w;
        if (textView2 != null) {
            themeDescriptions.add(new org.telegram.ui.ActionBar.l6(textView2, 4, null, null, null, cy0Var, i13));
            themeDescriptions.add(new org.telegram.ui.ActionBar.l6(this.f36172f.f35897x, 8, null, null, null, cy0Var, i13));
        }
        int size2 = themeDescriptions.size();
        while (i11 < size2) {
            org.telegram.ui.ActionBar.l6 l6Var = themeDescriptions.get(i11);
            i11++;
            l6Var.f20442o = this.f36169a;
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
        l21 l21Var = this.f36172f;
        l21Var.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(l21Var, NotificationCenter.emojiLoaded);
        this.f36172f = null;
        this.E.recycle();
        this.E = null;
        int i10 = 0;
        while (true) {
            fVar = this.d;
            if (i10 >= fVar.f25c) {
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
            alertDialog$Builder.f19503a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new x11(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
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
