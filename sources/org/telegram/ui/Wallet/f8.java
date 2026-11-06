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
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.ui;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.d10;
public final class f8 extends org.telegram.ui.ActionBar.f2 {
    public int f42464a;
    public t5 f42465b;
    public LinearLayout f42466c;
    public fi.d d;
    public ImageView f42467e;
    public ScrollView f42468f;
    public w70 h;
    public int f42469n;
    public boolean f42470r;
    public byte[] f42471s;
    public final ArrayList f42472w;

    public f8() {
        super(null);
        this.f42464a = 12;
        this.f42472w = new ArrayList();
    }

    public static void Z(f8 f8Var, String str, n0 n0Var, org.telegram.ui.ActionBar.f2 f2Var, String str2) {
        f8Var.d.setLoading(false);
        if (!"WRONG_CONTRACT".equalsIgnoreCase(str2) && !"INVALID_PHRASE".equalsIgnoreCase(str2)) {
            if (str2 != null) {
                hc.a0(f8Var).e0(str2, false);
                return;
            }
            if (f8Var.f42470r && !TextUtils.isEmpty(str) && !TextUtils.equals(str, n0Var.t())) {
                new r0(f8Var.currentAccount, f8Var.getParentActivity(), str).B();
            }
            org.telegram.messenger.g0.i3(new n(20, f8Var, f2Var), 300L);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f8Var.getParentActivity(), f8Var.getResourceProvider());
        String M0 = hd.M0(2131743084, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.R = M0;
        u1Var.T = hd.M0(2131743083, null);
        jg.g.C(null, 2131743064, alertDialog$Builder, null);
    }

    public static void a0(f8 f8Var) {
        byte[] bArr;
        String str;
        FrameLayout frameLayout;
        byte[] bytes;
        if (!f8Var.d.Q) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = f8Var.f42472w;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                arrayList.add(((oa) obj).getWord().toLowerCase().trim());
            }
            int max = Math.max(0, arrayList.size() - 1);
            ArrayList arrayList3 = new ArrayList();
            try {
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    arrayList3.add(((String) obj2).getBytes(StandardCharsets.UTF_8));
                    long length = max + bytes.length;
                    max = (int) length;
                    if (length != max) {
                        throw new ArithmeticException();
                    }
                }
                byte[] bArr2 = new byte[max];
                int i11 = 0;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    if (i12 > 0) {
                        bArr2[i11] = 32;
                        i11++;
                    }
                    byte[] bArr3 = (byte[]) arrayList3.get(i12);
                    System.arraycopy(bArr3, 0, bArr2, i11, bArr3.length);
                    i11 += bArr3.length;
                }
                k0 k0Var = new k0(bArr2);
                Arrays.fill(bArr2, (byte) 0);
                int size3 = arrayList3.size();
                int i13 = 0;
                while (i13 < size3) {
                    Object obj3 = arrayList3.get(i13);
                    i13++;
                    Arrays.fill((byte[]) obj3, (byte) 0);
                }
                try {
                    f8Var.d.setLoading(true);
                    org.telegram.ui.ActionBar.f2 f2Var = null;
                    if (f8Var.f42471s != null) {
                        try {
                            bArr = WalletEngine2.secretPhraseToPublicKey(k0Var);
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            bArr = null;
                        }
                        if (bArr == null) {
                            f8Var.d.setLoading(false);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f8Var.getParentActivity(), f8Var.getResourceProvider());
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                            u1Var.R = hd.M0(2131743084, null);
                            u1Var.T = hd.M0(2131743083, null);
                            alertDialog$Builder.k(hd.M0(2131743064, null), null);
                            alertDialog$Builder.p();
                        } else if (!Arrays.equals(bArr, f8Var.f42471s)) {
                            try {
                                str = WalletEngine2.secretPhraseToAddress(k0Var);
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                                str = null;
                            }
                            if (!TextUtils.isEmpty(str)) {
                                frameLayout = new FrameLayout(f8Var.getParentActivity());
                                TextView textView = new TextView(f8Var.getParentActivity());
                                textView.setTextSize(1, 14.0f);
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, f8Var.resourceProvider);
                                textView.setText(c0(str));
                                textView.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f));
                                textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                                int L = org.telegram.messenger.g0.L(10.0f);
                                int i14 = org.telegram.ui.ActionBar.k6.f27792a7;
                                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i14, f8Var.resourceProvider));
                                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
                                org.telegram.ui.ActionBar.f6 f6Var = f8Var.resourceProvider;
                                textView.setBackground(d02);
                                org.telegram.ui.ActionBar.r6.k(textView, d02, N, null, f6Var);
                                textView.setGravity(17);
                                frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 7, 16.0f, 0.0f, 16.0f, 0.0f));
                            } else {
                                frameLayout = null;
                            }
                            f8Var.d.setLoading(false);
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, f8Var.getParentActivity(), f8Var.getResourceProvider());
                            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27292a;
                            u1Var2.R = hd.M0(2131742958, null);
                            u1Var2.T = hd.M0(2131742957, null);
                            alertDialog$Builder2.o(frameLayout);
                            alertDialog$Builder2.k(hd.M0(2131747830, null), null);
                            alertDialog$Builder2.p();
                        } else {
                            n0 x10 = n0.x(f8Var.currentAccount);
                            x10.f42770c.p(p10.i(f8Var.currentAccount).e(), bArr, k0Var, new t(9, f8Var, x10));
                        }
                        k0Var.close();
                        return;
                    }
                    f8Var.d.setLoading(true);
                    n0 x11 = n0.x(f8Var.currentAccount);
                    String t6 = x11.t();
                    if (f8Var.getParentLayout() != null && f8Var.getParentLayout().getFragmentStack().size() > 1) {
                        f2Var = (org.telegram.ui.ActionBar.f2) f8Var.getParentLayout().getFragmentStack().get(f8Var.getParentLayout().getFragmentStack().size() - 2);
                    }
                    x11.C(false, true, k0Var, new q(f8Var, t6, x11, f2Var));
                    k0Var.close();
                } catch (Throwable th2) {
                    try {
                        k0Var.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                int size4 = arrayList3.size();
                int i15 = 0;
                while (i15 < size4) {
                    Object obj4 = arrayList3.get(i15);
                    i15++;
                    Arrays.fill((byte[]) obj4, (byte) 0);
                }
                throw th4;
            }
        }
    }

    public static SpannableStringBuilder c0(String str) {
        char c10;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (i11 > 0 && i11 % 4 == 0) {
                int i12 = i11 % 24;
                if (i12 == 0) {
                    c10 = '\n';
                } else {
                    c10 = ' ';
                }
                spannableStringBuilder.append(c10);
                if (i12 == 0) {
                    i10++;
                }
                i7 = spannableStringBuilder.length();
            }
            spannableStringBuilder.append(str.charAt(i11));
            if (i11 % 4 == 3) {
                int i13 = i10 + 1;
                if (i10 % 2 == 1) {
                    org.telegram.messenger.t tVar = new org.telegram.messenger.t(false);
                    tVar.f25553b = (int) 191.25f;
                    spannableStringBuilder.setSpan(tVar, i7, spannableStringBuilder.length(), 33);
                }
                i7 = spannableStringBuilder.length();
                i10 = i13;
            }
        }
        return spannableStringBuilder;
    }

    public final void b0(Context context) {
        boolean z9;
        int i7;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f42472w;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(((oa) obj).getWord());
        }
        this.f42466c.removeAllViews();
        arrayList2.clear();
        for (int i11 = 0; i11 < this.f42464a; i11++) {
            if (i11 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            oa oaVar = new oa(i11, context, this.resourceProvider, z9);
            oaVar.setOnTextChangedListener(new e8(this, 1));
            oaVar.setOnPasteListener(new h2(this, i11, 3));
            oaVar.setOnNextListener(new d10(this, i11, oaVar, 17));
            LinearLayout linearLayout = this.f42466c;
            if (i11 == 0) {
                i7 = 0;
            } else {
                i7 = 12;
            }
            linearLayout.addView(oaVar, c8.ha.t(-1, 50, 1, 0, i7, 0, 0));
            arrayList2.add(oaVar);
        }
        for (int i12 = 0; i12 < arrayList.size() && i12 < arrayList2.size(); i12++) {
            if (!((String) arrayList.get(i12)).isEmpty()) {
                ((oa) arrayList2.get(i12)).setText((String) arrayList.get(i12));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i7;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        rt0 rt0Var = new rt0(context, null);
        this.fragmentView = rt0Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, rt0Var, this.resourceProvider);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setClipToPadding(false);
        scrollView.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        this.f42468f = scrollView;
        scrollView.addOnLayoutChangeListener(new r7(this, 1));
        ((FrameLayout) this.fragmentView).addView(scrollView, c8.ha.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setClipToPadding(false);
        scrollView.addView(linearLayout, c8.ha.o(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f42467e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f42467e;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView2, i10, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f42467e.setImageResource(2131231241);
        ImageView imageView3 = this.f42467e;
        int i11 = org.telegram.ui.ActionBar.k6.f27940i6;
        org.telegram.ui.ActionBar.r6.R(imageView3, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i11, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.r6.N(i11), this.resourceProvider);
        this.f42467e.setOnClickListener(new View.OnClickListener(this) {
            public final f8 f42370b;

            {
                this.f42370b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42370b.finishFragment();
                        return;
                    default:
                        f8.a0(this.f42370b);
                        return;
                }
            }
        });
        ((FrameLayout) this.fragmentView).addView(this.f42467e, c8.ha.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        l9Var.setAspectFit(true);
        l9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        ui.b0(org.telegram.messenger.g0.t0()).c2(l9Var, "RestrictedEmoji", "📝", "100_100");
        l9Var.getImageReceiver().X(1);
        linearLayout.addView(l9Var, c8.ha.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(textView, i10, this.resourceProvider);
        if (this.f42471s != null) {
            i7 = 2131743025;
        } else {
            i7 = 2131743096;
        }
        textView.setText(hd.M0(i7, null));
        linearLayout.addView(textView, c8.ha.t(-1, -2, 1, 32, 0, 32, 10));
        w70 w70Var = new w70(context, null);
        this.h = w70Var;
        w70Var.setTextSize(1, 14.0f);
        this.h.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(this.h, org.telegram.ui.ActionBar.k6.f28258z6, this.resourceProvider);
        org.telegram.ui.ActionBar.r6.H(this.h, org.telegram.ui.ActionBar.k6.Uc, this.resourceProvider);
        if (this.f42471s != null) {
            this.h.setText(org.telegram.messenger.g0.U2(hd.M0(2131743126, null), new e8(this, 0)));
        } else {
            this.h.setText(hd.V(null, null, 2131743092, 12));
        }
        linearLayout.addView(this.h, c8.ha.t(-1, -2, 1, 32, 0, 32, 8));
        t5 t5Var = new t5(context, new CharSequence[]{hd.G(12, "WalletPhraseWords", new Object[0]), hd.G(24, "WalletPhraseWords", new Object[0])}, new k(this, 5), this.resourceProvider);
        this.f42465b = t5Var;
        t5Var.f43140e = true;
        t5Var.updateColors();
        this.f42465b.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.f42465b.setClipToPadding(false);
        linearLayout.addView(this.f42465b, c8.ha.t(-1, -2, 1, 0, 0, 0, 4));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f42466c = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f42466c.setGravity(1);
        this.f42466c.setClipChildren(false);
        linearLayout.addView(this.f42466c, c8.ha.t(-1, -2, 1, 0, 16, 0, 0));
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        this.d = dVar;
        dVar.f();
        this.d.setText(hd.M0(2131743095, null));
        this.d.setEnabled(false);
        this.d.setOnClickListener(new View.OnClickListener(this) {
            public final f8 f42370b;

            {
                this.f42370b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42370b.finishFragment();
                        return;
                    default:
                        f8.a0(this.f42370b);
                        return;
                }
            }
        });
        linearLayout.addView(this.d, c8.ha.t(-1, 48, 1, 0, 24, 0, 0));
        b0(context);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = this.f42472w;
        int size = arrayList.size();
        boolean z9 = false;
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if (((oa) obj).getWord().isEmpty()) {
                    break;
                }
            } else {
                z9 = true;
                break;
            }
        }
        this.d.setEnabled(z9);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        FrameLayout.LayoutParams layoutParams;
        ScrollView scrollView = this.f42468f;
        if (scrollView != null) {
            scrollView.setPadding(i7, org.telegram.messenger.g0.L(96.0f) + i10, i11, 0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f42468f.getLayoutParams();
            int max = Math.max(i12, this.f42469n);
            if (layoutParams2.bottomMargin != max) {
                layoutParams2.bottomMargin = max;
                this.f42468f.setLayoutParams(layoutParams2);
            }
        }
        ImageView imageView = this.f42467e;
        if (imageView != null && (layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams()) != null) {
            layoutParams.topMargin = org.telegram.messenger.g0.L(12.0f) + i10;
            this.f42467e.setLayoutParams(layoutParams);
        }
    }

    @Override
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.f42469n = k1Var.f54084a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }
}
