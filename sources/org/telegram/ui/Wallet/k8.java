package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ui;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.f11;
public final class k8 extends org.telegram.ui.ActionBar.k2 {
    public int f34816a;
    public v5 f34817b;
    public LinearLayout f34818c;
    public vh.d d;
    public ImageView e;
    public ScrollView f34819f;
    public p80 h;
    public int f34820n;
    public boolean f34821r;
    public byte[] f34822s;
    public final ArrayList f34823w;

    public k8() {
        super(null);
        this.f34816a = 12;
        this.f34823w = new ArrayList();
    }

    public static void Y(k8 k8Var, String str, k0 k0Var, org.telegram.ui.ActionBar.k2 k2Var, String str2) {
        k8Var.d.setLoading(false);
        if (!"WRONG_CONTRACT".equalsIgnoreCase(str2) && !"INVALID_PHRASE".equalsIgnoreCase(str2)) {
            if (str2 != null) {
                cc.a0(k8Var).e0(str2, false);
                return;
            }
            if (k8Var.f34821r && !TextUtils.isEmpty(str) && !TextUtils.equals(str, k0Var.t())) {
                new p0(k8Var.currentAccount, k8Var.getParentActivity(), str).B();
            }
            org.telegram.messenger.i0.h3(new k3(k8Var, k2Var), 300L);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k8Var.getParentActivity(), k8Var.getResourceProvider());
        String L0 = cd.L0(2131743109, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        x1Var.T = cd.L0(2131743108, null);
        i0.a.w(null, 2131743089, alertDialog$Builder, null);
    }

    public static void Z(k8 k8Var) {
        byte[] bArr;
        String str;
        FrameLayout frameLayout;
        byte[] bytes;
        if (!k8Var.d.Q) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = k8Var.f34823w;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                arrayList.add(((ra) obj).getWord().toLowerCase().trim());
            }
            int max = Math.max(0, arrayList.size() - 1);
            ArrayList arrayList3 = new ArrayList();
            try {
                int size2 = arrayList.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    arrayList3.add(((String) obj2).getBytes(StandardCharsets.UTF_8));
                    long length = max + bytes.length;
                    max = (int) length;
                    if (length != max) {
                        throw new ArithmeticException();
                    }
                }
                byte[] bArr2 = new byte[max];
                int i12 = 0;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    if (i13 > 0) {
                        bArr2[i12] = 32;
                        i12++;
                    }
                    byte[] bArr3 = (byte[]) arrayList3.get(i13);
                    System.arraycopy(bArr3, 0, bArr2, i12, bArr3.length);
                    i12 += bArr3.length;
                }
                h0 h0Var = new h0(bArr2);
                Arrays.fill(bArr2, (byte) 0);
                int size3 = arrayList3.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj3 = arrayList3.get(i14);
                    i14++;
                    Arrays.fill((byte[]) obj3, (byte) 0);
                }
                try {
                    k8Var.d.setLoading(true);
                    org.telegram.ui.ActionBar.k2 k2Var = null;
                    if (k8Var.f34822s != null) {
                        try {
                            bArr = WalletEngine2.secretPhraseToPublicKey(h0Var);
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                            bArr = null;
                        }
                        if (bArr == null) {
                            k8Var.d.setLoading(false);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k8Var.getParentActivity(), k8Var.getResourceProvider());
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                            x1Var.R = cd.L0(2131743109, null);
                            x1Var.T = cd.L0(2131743108, null);
                            alertDialog$Builder.k(cd.L0(2131743089, null), null);
                            alertDialog$Builder.p();
                        } else if (!Arrays.equals(bArr, k8Var.f34822s)) {
                            try {
                                str = WalletEngine2.secretPhraseToAddress(h0Var);
                            } catch (Exception e7) {
                                org.telegram.messenger.f8.g(e7, true);
                                str = null;
                            }
                            if (!TextUtils.isEmpty(str)) {
                                frameLayout = new FrameLayout(k8Var.getParentActivity());
                                TextView textView = new TextView(k8Var.getParentActivity());
                                textView.setTextSize(1, 14.0f);
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, k8Var.resourceProvider);
                                textView.setText(b0(str));
                                textView.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(12.0f));
                                textView.setTypeface(org.telegram.messenger.i0.o1("fonts/rmono.ttf"));
                                int L = org.telegram.messenger.i0.L(10.0f);
                                int i15 = org.telegram.ui.ActionBar.t6.f20872a7;
                                ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i15, k8Var.resourceProvider));
                                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i15);
                                org.telegram.ui.ActionBar.p6 p6Var = k8Var.resourceProvider;
                                textView.setBackground(d02);
                                org.telegram.ui.ActionBar.a7.k(textView, d02, N, null, p6Var);
                                textView.setGravity(17);
                                frameLayout.addView(textView, w7.b6.d(-1, -2.0f, 7, 16.0f, 0.0f, 16.0f, 0.0f));
                            } else {
                                frameLayout = null;
                            }
                            k8Var.d.setLoading(false);
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, k8Var.getParentActivity(), k8Var.getResourceProvider());
                            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                            x1Var2.R = cd.L0(2131742983, null);
                            x1Var2.T = cd.L0(2131742982, null);
                            alertDialog$Builder2.o(frameLayout);
                            alertDialog$Builder2.k(cd.L0(2131747847, null), null);
                            alertDialog$Builder2.p();
                        } else {
                            k0 x10 = k0.x(k8Var.currentAccount);
                            x10.f34778c.p(d20.i(k8Var.currentAccount).e(), bArr, h0Var, new f11(15, k8Var, x10));
                        }
                        h0Var.close();
                        return;
                    }
                    k8Var.d.setLoading(true);
                    k0 x11 = k0.x(k8Var.currentAccount);
                    String t10 = x11.t();
                    if (k8Var.getParentLayout() != null && k8Var.getParentLayout().getFragmentStack().size() > 1) {
                        k2Var = (org.telegram.ui.ActionBar.k2) k8Var.getParentLayout().getFragmentStack().get(k8Var.getParentLayout().getFragmentStack().size() - 2);
                    }
                    x11.C(false, true, h0Var, new p(k8Var, t10, x11, k2Var));
                    h0Var.close();
                } catch (Throwable th2) {
                    try {
                        h0Var.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                int size4 = arrayList3.size();
                int i16 = 0;
                while (i16 < size4) {
                    Object obj4 = arrayList3.get(i16);
                    i16++;
                    Arrays.fill((byte[]) obj4, (byte) 0);
                }
                throw th4;
            }
        }
    }

    public static SpannableStringBuilder b0(String str) {
        char c10;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            if (i12 > 0 && i12 % 4 == 0) {
                int i13 = i12 % 24;
                if (i13 == 0) {
                    c10 = '\n';
                } else {
                    c10 = ' ';
                }
                spannableStringBuilder.append(c10);
                if (i13 == 0) {
                    i11++;
                }
                i10 = spannableStringBuilder.length();
            }
            spannableStringBuilder.append(str.charAt(i12));
            if (i12 % 4 == 3) {
                int i14 = i11 + 1;
                if (i11 % 2 == 1) {
                    org.telegram.messenger.u uVar = new org.telegram.messenger.u(false);
                    uVar.f18204b = (int) 191.25f;
                    spannableStringBuilder.setSpan(uVar, i10, spannableStringBuilder.length(), 33);
                }
                i10 = spannableStringBuilder.length();
                i11 = i14;
            }
        }
        return spannableStringBuilder;
    }

    public final void a0(Context context) {
        boolean z10;
        int i10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f34823w;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            arrayList.add(((ra) obj).getWord());
        }
        this.f34818c.removeAllViews();
        arrayList2.clear();
        for (int i12 = 0; i12 < this.f34816a; i12++) {
            if (i12 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ra raVar = new ra(i12, context, this.resourceProvider, z10);
            raVar.setOnTextChangedListener(new j8(this, 1));
            raVar.setOnPasteListener(new qq(this, i12, 28));
            raVar.setOnNextListener(new x0(this, i12, raVar, 4));
            LinearLayout linearLayout = this.f34818c;
            if (i12 == 0) {
                i10 = 0;
            } else {
                i10 = 12;
            }
            linearLayout.addView(raVar, w7.b6.t(-1, 50, 1, 0, i10, 0, 0));
            arrayList2.add(raVar);
        }
        for (int i13 = 0; i13 < arrayList.size() && i13 < arrayList2.size(); i13++) {
            if (!((String) arrayList.get(i13)).isEmpty()) {
                ((ra) arrayList2.get(i13)).setText((String) arrayList.get(i13));
            }
        }
    }

    public final void c0() {
        ArrayList arrayList = this.f34823w;
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((ra) obj).getWord().isEmpty()) {
                    break;
                }
            } else {
                z10 = true;
                break;
            }
        }
        this.d.setEnabled(z10);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        uu0 uu0Var = new uu0(context, null);
        this.fragmentView = uu0Var;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, uu0Var, this.resourceProvider);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setClipToPadding(false);
        scrollView.setPadding(0, org.telegram.messenger.i0.L(96.0f), 0, 0);
        this.f34819f = scrollView;
        scrollView.addOnLayoutChangeListener(new w7(this, 1));
        ((FrameLayout) this.fragmentView).addView(scrollView, w7.b6.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.i0.L(36.0f), 0, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(24.0f));
        linearLayout.setClipToPadding(false);
        scrollView.addView(linearLayout, w7.b6.o(-1, -2));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.e;
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.t(imageView2, i11, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.e.setImageResource(2131231242);
        ImageView imageView3 = this.e;
        int i12 = org.telegram.ui.ActionBar.t6.f21020i6;
        org.telegram.ui.ActionBar.a7.R(imageView3, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i12, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.a7.N(i12), this.resourceProvider);
        this.e.setOnClickListener(new View.OnClickListener(this) {
            public final k8 f34720b;

            {
                this.f34720b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f34720b.finishFragment();
                        return;
                    default:
                        k8.Z(this.f34720b);
                        return;
                }
            }
        });
        ((FrameLayout) this.fragmentView).addView(this.e, w7.b6.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        g9Var.setAspectFit(true);
        g9Var.getImageReceiver().d = org.telegram.messenger.i0.t0();
        ui.b0(org.telegram.messenger.i0.t0()).c2(g9Var, "RestrictedEmoji", "📝", "100_100");
        g9Var.getImageReceiver().X(1);
        linearLayout.addView(g9Var, w7.b6.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(1);
        org.telegram.ui.ActionBar.a7.V(textView, i11, this.resourceProvider);
        if (this.f34822s != null) {
            i10 = 2131743050;
        } else {
            i10 = 2131743121;
        }
        textView.setText(cd.L0(i10, null));
        linearLayout.addView(textView, w7.b6.t(-1, -2, 1, 32, 0, 32, 10));
        p80 p80Var = new p80(context, null);
        this.h = p80Var;
        p80Var.setTextSize(1, 14.0f);
        this.h.setGravity(1);
        org.telegram.ui.ActionBar.a7.V(this.h, org.telegram.ui.ActionBar.t6.f21330z6, this.resourceProvider);
        org.telegram.ui.ActionBar.a7.H(this.h, org.telegram.ui.ActionBar.t6.Uc, this.resourceProvider);
        if (this.f34822s != null) {
            this.h.setText(org.telegram.messenger.i0.T2(cd.L0(2131743151, null), new j8(this, 0)));
        } else {
            this.h.setText(cd.V(null, null, 2131743117, 12));
        }
        linearLayout.addView(this.h, w7.b6.t(-1, -2, 1, 32, 0, 32, 8));
        v5 v5Var = new v5(context, new CharSequence[]{cd.G(12, "WalletPhraseWords", new Object[0]), cd.G(24, "WalletPhraseWords", new Object[0])}, new k(this, 5), this.resourceProvider);
        this.f34817b = v5Var;
        v5Var.e = true;
        v5Var.updateColors();
        this.f34817b.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        this.f34817b.setClipToPadding(false);
        linearLayout.addView(this.f34817b, w7.b6.t(-1, -2, 1, 0, 0, 0, 4));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f34818c = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f34818c.setGravity(1);
        this.f34818c.setClipChildren(false);
        linearLayout.addView(this.f34818c, w7.b6.t(-1, -2, 1, 0, 16, 0, 0));
        vh.d dVar = new vh.d(context, this.resourceProvider, true);
        this.d = dVar;
        dVar.f();
        this.d.setText(cd.L0(2131743120, null));
        this.d.setEnabled(false);
        this.d.setOnClickListener(new View.OnClickListener(this) {
            public final k8 f34720b;

            {
                this.f34720b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f34720b.finishFragment();
                        return;
                    default:
                        k8.Z(this.f34720b);
                        return;
                }
            }
        });
        linearLayout.addView(this.d, w7.b6.t(-1, 48, 1, 0, 24, 0, 0));
        a0(context);
        c0();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        FrameLayout.LayoutParams layoutParams;
        ScrollView scrollView = this.f34819f;
        if (scrollView != null) {
            scrollView.setPadding(i10, org.telegram.messenger.i0.L(96.0f) + i11, i12, 0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f34819f.getLayoutParams();
            int max = Math.max(i13, this.f34820n);
            if (layoutParams2.bottomMargin != max) {
                layoutParams2.bottomMargin = max;
                this.f34819f.setLayoutParams(layoutParams2);
            }
        }
        ImageView imageView = this.e;
        if (imageView != null && (layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams()) != null) {
            layoutParams.topMargin = org.telegram.messenger.i0.L(12.0f) + i11;
            this.e.setLayoutParams(layoutParams);
        }
    }

    @Override
    public final r0.j1 onInsetsInternal(View view, r0.j1 j1Var) {
        this.f34820n = j1Var.f46132a.f(8).d;
        return super.onInsetsInternal(view, j1Var);
    }
}
