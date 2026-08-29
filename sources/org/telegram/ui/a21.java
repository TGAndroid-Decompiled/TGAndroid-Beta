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
public class a21 extends org.telegram.ui.ActionBar.o2 {
    public static final a0.f N;
    public static List O;
    public static boolean P;
    public v11 A;
    public org.telegram.ui.Components.aj0 B;
    public ImageView C;
    public Bitmap D;
    public Bitmap E;
    public org.telegram.ui.ActionBar.b4 F;
    public boolean G;
    public long H;
    public long I;
    public int J;
    public int K;
    public boolean L;
    public i0.b M;
    public final oc.i f36403a;
    public final org.telegram.ui.ActionBar.b4 f36404b;
    public final Rect f36405c;
    public final a0.f d;
    public int[] f36406e;
    public z11 f36407f;
    public org.telegram.ui.Components.yb0 h;
    public org.telegram.ui.Components.yb0 f36408n;
    public org.telegram.ui.Components.yb0 f36409r;
    public ValueAnimator f36410s;
    public ValueAnimator v;
    public op0 f36411w;
    public bg.d1 f36412x;
    public org.telegram.ui.Components.t9 f36413y;

    static {
        ?? kVar = new a0.k(0);
        N = kVar;
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
        P = true;
    }

    public a21(Bundle bundle) {
        super(bundle);
        this.f36403a = new oc.i(this);
        org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(this.currentAccount);
        b4Var.f22765e = "🏠";
        b4Var.f22764c = qf.b.d("🏠");
        b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.f22765e);
        org.telegram.ui.ActionBar.a4 a4Var = new org.telegram.ui.ActionBar.a4();
        a4Var.f22730a = org.telegram.ui.ActionBar.g6.N0("Blue");
        a4Var.f22733e = 99;
        b4Var.f22766f.add(a4Var);
        org.telegram.ui.ActionBar.a4 a4Var2 = new org.telegram.ui.ActionBar.a4();
        a4Var2.f22730a = org.telegram.ui.ActionBar.g6.N0("Dark Blue");
        a4Var2.f22733e = 0;
        b4Var.f22766f.add(a4Var2);
        this.f36404b = b4Var;
        this.f36405c = new Rect();
        this.d = new a0.k(0);
        this.f36406e = null;
        this.h = new org.telegram.ui.Components.yb0();
        this.F = b4Var;
        this.K = -1;
        this.M = i0.b.f8185e;
    }

    public static void U(a21 a21Var) {
        if (a21Var.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && a21Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            a21Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        } else {
            f0(a21Var);
        }
    }

    public static void V(a21 a21Var) {
        P = false;
        List list = O;
        if (list != null && !list.isEmpty()) {
            a21Var.c0(O);
        } else {
            ChatThemeController.getInstance(a21Var.currentAccount).requestAllChatThemes(new q11(a21Var), true);
        }
    }

    public static void W(a21 a21Var, boolean z10, org.telegram.ui.ActionBar.b4 b4Var, org.telegram.ui.ActionBar.a5 a5Var) {
        oc.i iVar = a21Var.f36403a;
        if (z10) {
            iVar.f19483b = b4Var.b(((a21) iVar.f19484c).currentAccount, a21Var.G ? 1 : 0);
        } else {
            iVar.f19483b = a21Var.F.b(((a21) iVar.f19484c).currentAccount, a21Var.G ? 1 : 0);
        }
        a5Var.h = new n11(a21Var, 3);
        ((ActionBarLayout) a21Var.parentLayout).f(a5Var, null);
        LinearLayout linearLayout = a21Var.f36407f.v;
        if (linearLayout != null) {
            linearLayout.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{6.0f}, 0, i0.a.k(org.telegram.ui.ActionBar.w5.b(a21Var.getThemedColor(org.telegram.ui.ActionBar.g6.Oh)), 25)));
        }
    }

    public static void X(a21 a21Var) {
        a21Var.f36404b.n(a21Var.currentAccount);
        View view = a21Var.fragmentView;
        if (view == null) {
            return;
        }
        view.postDelayed(new n11(a21Var, 1), 17L);
    }

    public static void f0(org.telegram.ui.ActionBar.o2 o2Var) {
        r9.e0(o2Var.getParentActivity(), 1, new r11(o2Var.getCurrentAccount(), o2Var));
    }

    public final Bitmap b0(org.telegram.ui.ActionBar.b4 b4Var, boolean z10) {
        if (z10) {
            String str = b4Var.f22765e;
            a0.f fVar = this.d;
            Bitmap bitmap = (Bitmap) fVar.get(str);
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(this.D.getWidth(), this.D.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                int[] iArr = (int[]) N.get(b4Var.f22765e + "n");
                if (iArr != null) {
                    if (this.f36409r == null) {
                        this.f36409r = new org.telegram.ui.Components.yb0(true, 0, 0, 0, 0);
                    }
                    this.f36409r.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                    this.f36409r.setBounds(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), canvas.getWidth() - AndroidUtilities.dp(6.0f), canvas.getHeight() - AndroidUtilities.dp(6.0f));
                    this.f36409r.draw(canvas);
                }
                canvas.drawBitmap(this.D, 0.0f, 0.0f, (Paint) null);
                canvas.setBitmap(null);
                fVar.put(b4Var.f22765e, bitmap);
            }
            return bitmap;
        }
        return this.D;
    }

    public final void c0(List list) {
        if (list != null && !list.isEmpty() && this.f36407f != null) {
            list.set(0, this.f36404b);
            ArrayList arrayList = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) list.get(i10);
                b4Var.n(this.currentAccount);
                org.telegram.ui.Components.fp fpVar = new org.telegram.ui.Components.fp(b4Var);
                boolean z10 = this.G;
                fpVar.f28514c = z10 ? 1 : 0;
                fpVar.f28515e = b0(b4Var, z10);
                arrayList.add(fpVar);
            }
            org.telegram.ui.Components.ep epVar = this.f36407f.f45025b;
            epVar.d = arrayList;
            epVar.l();
            int i11 = 0;
            while (true) {
                if (i11 != arrayList.size()) {
                    if (qf.b.a(((org.telegram.ui.Components.fp) arrayList.get(i11)).f28512a.f22764c, this.F.f22764c)) {
                        this.f36407f.G = (org.telegram.ui.Components.fp) arrayList.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1) {
                this.f36407f.b(i11);
            }
            z11 z11Var = this.f36407f;
            x11 x11Var = z11Var.B;
            x11Var.setAlpha(0.0f);
            x11Var.animate().alpha(1.0f).setDuration(150L).start();
            x11Var.setVisibility(0);
            org.telegram.ui.Components.p00 p00Var = z11Var.f45030r;
            p00Var.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.z9(p00Var)).setDuration(150L).start();
            org.telegram.ui.Components.jl0 jl0Var = z11Var.f45034y;
            jl0Var.setAlpha(0.0f);
            jl0Var.animate().alpha(1.0f).setDuration(150L).start();
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a21.createView(android.content.Context):android.view.View");
    }

    public final void d0(int i10, org.telegram.ui.ActionBar.b4 b4Var, boolean z10) {
        float f9;
        String str;
        org.telegram.ui.ActionBar.f6 A0;
        this.K = i10;
        org.telegram.ui.ActionBar.b4 b4Var2 = this.F;
        final boolean z11 = this.G;
        this.F = b4Var;
        org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var.f22766f.get(z11 ? 1 : 0);
        ValueAnimator valueAnimator = this.f36410s;
        if (valueAnimator != null) {
            f9 = Math.max(0.5f, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 1.0f;
            this.f36410s.cancel();
        } else {
            f9 = 1.0f;
        }
        org.telegram.ui.Components.yb0 yb0Var = this.h;
        this.f36408n = yb0Var;
        yb0Var.q(false);
        this.f36408n.setAlpha(255);
        org.telegram.ui.Components.yb0 yb0Var2 = new org.telegram.ui.Components.yb0();
        this.h = yb0Var2;
        yb0Var2.setCallback(this.f36411w);
        this.h.n(a4Var.f22738k, a4Var.f22739l, a4Var.f22740m, a4Var.f22741n);
        this.h.r(this.f36411w);
        this.h.s(1.0f);
        org.telegram.ui.Components.yb0 yb0Var3 = this.h;
        yb0Var3.N = true;
        org.telegram.ui.Components.yb0 yb0Var4 = this.f36408n;
        if (yb0Var4 != null) {
            yb0Var3.h = yb0Var4.h;
        }
        this.A.f43392a.h = yb0Var3.h;
        TLRPC.WallPaper k9 = this.F.k(z11 ? 1 : 0);
        if (k9 != null) {
            org.telegram.ui.Components.yb0 yb0Var5 = this.h;
            yb0Var5.t(yb0Var5.f35036u, k9.settings.intensity);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.F.o(z11 ? 1 : 0, new ResultCallback() {
                @Override
                public final void onComplete(Object obj) {
                    boolean z12;
                    Pair pair = (Pair) obj;
                    a21 a21Var = a21.this;
                    long i11 = a21Var.F.i(z11 ? 1 : 0);
                    if (pair != null && i11 != 0) {
                        long longValue = ((Long) pair.first).longValue();
                        Bitmap bitmap = ((of.a) pair.second).f19547b;
                        if (longValue == i11 && bitmap != null) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            int i12 = a21Var.h.f35032q;
                            if (elapsedRealtime2 > 150) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            a21Var.e0(i12, bitmap, z12);
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
            Utilities.themeQueue.postRunnable(new n11(this, 2), 35L);
        }
        org.telegram.ui.Components.yb0 yb0Var6 = this.h;
        yb0Var6.u(yb0Var6.f());
        a0.f fVar = N;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b4Var.f22765e);
        if (z11) {
            str = "n";
        } else {
            str = "d";
        }
        sb2.append(str);
        int[] iArr = (int[]) fVar.get(sb2.toString());
        if (z10) {
            if (this.f36406e == null) {
                int[] iArr2 = new int[4];
                this.f36406e = iArr2;
                System.arraycopy(iArr, 0, iArr2, 0, 4);
            }
            this.h.setAlpha(255);
            org.telegram.ui.Components.yb0 yb0Var7 = this.h;
            yb0Var7.K = 0.0f;
            yb0Var7.i();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f36410s = ofFloat;
            ofFloat.addUpdateListener(new bg.b3(21, this, iArr));
            this.f36410s.addListener(new org.telegram.ui.Components.ok0(13, this, iArr));
            this.f36410s.setDuration((int) (f9 * 250.0f));
            this.f36410s.start();
        } else {
            if (iArr != null) {
                v11 v11Var = this.A;
                v11Var.f43392a.n(iArr[0], iArr[1], iArr[2], iArr[3]);
                v11Var.invalidate();
                System.arraycopy(iArr, 0, this.f36406e, 0, 4);
            }
            this.f36408n = null;
            this.f36411w.invalidate();
        }
        if (this.G) {
            A0 = org.telegram.ui.ActionBar.g6.J;
        } else {
            A0 = org.telegram.ui.ActionBar.g6.A0();
        }
        org.telegram.ui.ActionBar.a5 a5Var = new org.telegram.ui.ActionBar.a5(null, A0.U, this.G, !z10);
        a5Var.f22747f = false;
        a5Var.f22746e = true;
        a5Var.f22753m = this.f36403a;
        a5Var.f22752l = (int) (f9 * 250.0f);
        AndroidUtilities.runOnUIThread(new ag.w0(this, z10, b4Var2, a5Var, 25));
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
                ofFloat.addUpdateListener(new w01(this, 2));
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
        float f9 = min;
        if ((max * 1.0f) / f9 > 1.92f) {
            max = (int) (f9 * 1.92f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, max, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.f36412x.setVisibility(8);
        this.C.setVisibility(8);
        this.B.setVisibility(8);
        this.B.getAnimatedDrawable();
        v11 v11Var = this.A;
        if (v11Var != null) {
            v11Var.d(true);
        }
        this.fragmentView.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(max, 1073741824));
        this.fragmentView.layout(0, 0, min, max);
        this.fragmentView.draw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.B.getLeft(), this.B.getTop(), this.B.getRight(), this.B.getBottom());
        if (this.E != null) {
            canvas.drawBitmap(this.E, (Rect) null, rectF, new Paint(2));
        }
        canvas.setBitmap(null);
        this.f36412x.setVisibility(0);
        this.C.setVisibility(0);
        this.B.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        this.fragmentView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        v11 v11Var2 = this.A;
        if (v11Var2 != null) {
            v11Var2.d(false);
        }
        Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(createBitmap, "qr_tmp.jpg", Bitmap.CompressFormat.JPEG);
        if (bitmapShareUri != null) {
            try {
                getParentActivity().startActivityForResult(Intent.createChooser(new Intent("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", bitmapShareUri), LocaleController.getString(R.string.InviteByQRCode)), 500);
            } catch (ActivityNotFoundException e10) {
                e10.printStackTrace();
            }
        }
        AndroidUtilities.runOnUIThread(new n11(this, 0), 500L);
    }

    @Override
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.f23984c;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.f36403a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> themeDescriptions = super.getThemeDescriptions();
        z11 z11Var = this.f36407f;
        z11Var.getClass();
        y11 y11Var = new y11(z11Var);
        ArrayList arrayList = new ArrayList();
        Paint paint = z11Var.f45024a;
        int i10 = org.telegram.ui.ActionBar.g6.f23133h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 1, null, paint, null, null, i10));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 32, null, null, new Drawable[]{z11Var.f45028f}, y11Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(z11Var.f45029n, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23169j5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(z11Var.f45034y, 16, new Class[]{org.telegram.ui.Components.l11.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23151i5));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.ActionBar.i6) obj).f23544o = z11Var.d.f36403a;
        }
        themeDescriptions.addAll(arrayList);
        rx0 rx0Var = new rx0(3, this);
        TextView textView = this.f36407f.f45031s;
        int i13 = org.telegram.ui.ActionBar.g6.Oh;
        themeDescriptions.add(new org.telegram.ui.ActionBar.i6(textView, 32, null, null, null, rx0Var, i13));
        themeDescriptions.add(new org.telegram.ui.ActionBar.i6(this.f36407f.f45031s, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.Qh));
        TextView textView2 = this.f36407f.f45032w;
        if (textView2 != null) {
            themeDescriptions.add(new org.telegram.ui.ActionBar.i6(textView2, 4, null, null, null, rx0Var, i13));
            themeDescriptions.add(new org.telegram.ui.ActionBar.i6(this.f36407f.f45033x, 8, null, null, null, rx0Var, i13));
        }
        int size2 = themeDescriptions.size();
        while (i11 < size2) {
            org.telegram.ui.ActionBar.i6 i6Var = themeDescriptions.get(i11);
            i11++;
            i6Var.f23544o = this.f36403a;
        }
        return themeDescriptions;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.H = this.arguments.getLong("user_id");
        this.I = this.arguments.getLong("chat_id");
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        a0.f fVar;
        z11 z11Var = this.f36407f;
        z11Var.getClass();
        NotificationCenter.getGlobalInstance().removeObserver(z11Var, NotificationCenter.emojiLoaded);
        this.f36407f = null;
        this.D.recycle();
        this.D = null;
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
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.J);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.J);
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
            alertDialog$Builder.f22714a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new m11(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (getParentActivity() != null) {
            getParentActivity().getWindow().getDecorView().setSystemUiVisibility(this.J | 1028);
        }
    }
}
