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
import b8.mf;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.li;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.e51;
import org.telegram.ui.ma1;
import org.telegram.ui.rw;
public final class e8 extends org.telegram.ui.ActionBar.d2 {
    public int f42479a;
    public r5 f42480b;
    public LinearLayout f42481c;
    public gi.d d;
    public ImageView f42482e;
    public ScrollView f42483f;
    public s70 h;
    public int f42484n;
    public boolean f42485r;
    public byte[] f42486s;
    public final ArrayList f42487w;

    public e8() {
        super(null);
        this.f42479a = 12;
        this.f42487w = new ArrayList();
    }

    public static void Z(e8 e8Var, String str, k0 k0Var, org.telegram.ui.ActionBar.d2 d2Var, String str2) {
        e8Var.d.setLoading(false);
        if (!"WRONG_CONTRACT".equalsIgnoreCase(str2) && !"INVALID_PHRASE".equalsIgnoreCase(str2)) {
            if (str2 != null) {
                fc.a0(e8Var).e0(str2, false);
                return;
            }
            if (e8Var.f42485r && !TextUtils.isEmpty(str) && !TextUtils.equals(str, k0Var.t())) {
                new o0(e8Var.currentAccount, e8Var.getParentActivity(), str).B();
            }
            org.telegram.messenger.g0.i3(new ma1(25, e8Var, d2Var), 300L);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e8Var.getParentActivity(), e8Var.getResourceProvider());
        String M0 = bd.M0(2131743093, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = bd.M0(2131743092, null);
        k2.p1.B(null, 2131743073, alertDialog$Builder, null);
    }

    public static void a0(e8 e8Var) {
        byte[] bArr;
        String str;
        FrameLayout frameLayout;
        byte[] bytes;
        if (!e8Var.d.R) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = e8Var.f42487w;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                arrayList.add(((na) obj).getWord().toLowerCase().trim());
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
                h0 h0Var = new h0(bArr2);
                Arrays.fill(bArr2, (byte) 0);
                int size3 = arrayList3.size();
                int i13 = 0;
                while (i13 < size3) {
                    Object obj3 = arrayList3.get(i13);
                    i13++;
                    Arrays.fill((byte[]) obj3, (byte) 0);
                }
                try {
                    e8Var.d.setLoading(true);
                    org.telegram.ui.ActionBar.d2 d2Var = null;
                    if (e8Var.f42486s != null) {
                        try {
                            bArr = WalletEngine2.secretPhraseToPublicKey(h0Var);
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            bArr = null;
                        }
                        if (bArr == null) {
                            e8Var.d.setLoading(false);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e8Var.getParentActivity(), e8Var.getResourceProvider());
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                            s1Var.S = bd.M0(2131743093, null);
                            s1Var.U = bd.M0(2131743092, null);
                            alertDialog$Builder.k(bd.M0(2131743073, null), null);
                            alertDialog$Builder.p();
                        } else if (!Arrays.equals(bArr, e8Var.f42486s)) {
                            try {
                                str = WalletEngine2.secretPhraseToAddress(h0Var);
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                                str = null;
                            }
                            if (!TextUtils.isEmpty(str)) {
                                frameLayout = new FrameLayout(e8Var.getParentActivity());
                                TextView textView = new TextView(e8Var.getParentActivity());
                                textView.setTextSize(1, 14.0f);
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e8Var.resourceProvider);
                                textView.setText(c0(str));
                                textView.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f));
                                textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                                int L = org.telegram.messenger.g0.L(10.0f);
                                int i14 = org.telegram.ui.ActionBar.k6.f27824a7;
                                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i14, e8Var.resourceProvider));
                                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
                                org.telegram.ui.ActionBar.e6 e6Var = e8Var.resourceProvider;
                                textView.setBackground(d02);
                                org.telegram.ui.ActionBar.r6.k(textView, d02, N, null, e6Var);
                                textView.setGravity(17);
                                frameLayout.addView(textView, mf.d(-1, -2.0f, 7, 16.0f, 0.0f, 16.0f, 0.0f));
                            } else {
                                frameLayout = null;
                            }
                            e8Var.d.setLoading(false);
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, e8Var.getParentActivity(), e8Var.getResourceProvider());
                            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                            s1Var2.S = bd.M0(2131742967, null);
                            s1Var2.U = bd.M0(2131742966, null);
                            alertDialog$Builder2.o(frameLayout);
                            alertDialog$Builder2.k(bd.M0(2131747839, null), null);
                            alertDialog$Builder2.p();
                        } else {
                            k0 x10 = k0.x(e8Var.currentAccount);
                            x10.f42720c.p(h10.i(e8Var.currentAccount).e(), bArr, h0Var, new e51(12, e8Var, x10));
                        }
                        h0Var.close();
                        return;
                    }
                    e8Var.d.setLoading(true);
                    k0 x11 = k0.x(e8Var.currentAccount);
                    String t10 = x11.t();
                    if (e8Var.getParentLayout() != null && e8Var.getParentLayout().getFragmentStack().size() > 1) {
                        d2Var = (org.telegram.ui.ActionBar.d2) e8Var.getParentLayout().getFragmentStack().get(e8Var.getParentLayout().getFragmentStack().size() - 2);
                    }
                    x11.C(false, true, h0Var, new p(e8Var, t10, x11, d2Var));
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
        char c2;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i3 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (i11 > 0 && i11 % 4 == 0) {
                int i12 = i11 % 24;
                if (i12 == 0) {
                    c2 = '\n';
                } else {
                    c2 = ' ';
                }
                spannableStringBuilder.append(c2);
                if (i12 == 0) {
                    i10++;
                }
                i3 = spannableStringBuilder.length();
            }
            spannableStringBuilder.append(str.charAt(i11));
            if (i11 % 4 == 3) {
                int i13 = i10 + 1;
                if (i10 % 2 == 1) {
                    org.telegram.messenger.t tVar = new org.telegram.messenger.t(false);
                    tVar.f25455b = (int) 191.25f;
                    spannableStringBuilder.setSpan(tVar, i3, spannableStringBuilder.length(), 33);
                }
                i3 = spannableStringBuilder.length();
                i10 = i13;
            }
        }
        return spannableStringBuilder;
    }

    public final void b0(Context context) {
        boolean z10;
        int i3;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f42487w;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(((na) obj).getWord());
        }
        this.f42481c.removeAllViews();
        arrayList2.clear();
        for (int i11 = 0; i11 < this.f42479a; i11++) {
            if (i11 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            na naVar = new na(i11, context, this.resourceProvider, z10);
            naVar.setOnTextChangedListener(new d8(this, 1));
            naVar.setOnPasteListener(new f2(this, i11, 3));
            naVar.setOnNextListener(new rw(this, i11, naVar, 18));
            LinearLayout linearLayout = this.f42481c;
            if (i11 == 0) {
                i3 = 0;
            } else {
                i3 = 12;
            }
            linearLayout.addView(naVar, mf.t(-1, 50, 1, 0, i3, 0, 0));
            arrayList2.add(naVar);
        }
        for (int i12 = 0; i12 < arrayList.size() && i12 < arrayList2.size(); i12++) {
            if (!((String) arrayList.get(i12)).isEmpty()) {
                ((na) arrayList2.get(i12)).setText((String) arrayList.get(i12));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i3;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        qt0 qt0Var = new qt0(context, null);
        this.fragmentView = qt0Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, qt0Var, this.resourceProvider);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setClipToPadding(false);
        scrollView.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        this.f42483f = scrollView;
        scrollView.addOnLayoutChangeListener(new q7(this, 1));
        ((FrameLayout) this.fragmentView).addView(scrollView, mf.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setClipToPadding(false);
        scrollView.addView(linearLayout, mf.o(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f42482e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f42482e;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView2, i10, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f42482e.setImageResource(2131231241);
        ImageView imageView3 = this.f42482e;
        int i11 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.ActionBar.r6.R(imageView3, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i11, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.r6.N(i11), this.resourceProvider);
        this.f42482e.setOnClickListener(new View.OnClickListener(this) {
            public final e8 f42397b;

            {
                this.f42397b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42397b.finishFragment();
                        return;
                    default:
                        e8.a0(this.f42397b);
                        return;
                }
            }
        });
        ((FrameLayout) this.fragmentView).addView(this.f42482e, mf.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        k9Var.setAspectFit(true);
        k9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        li.b0(org.telegram.messenger.g0.t0()).c2(k9Var, "RestrictedEmoji", "📝", "100_100");
        k9Var.getImageReceiver().X(1);
        linearLayout.addView(k9Var, mf.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(textView, i10, this.resourceProvider);
        if (this.f42486s != null) {
            i3 = 2131743034;
        } else {
            i3 = 2131743105;
        }
        textView.setText(bd.M0(i3, null));
        linearLayout.addView(textView, mf.t(-1, -2, 1, 32, 0, 32, 10));
        s70 s70Var = new s70(context, null);
        this.h = s70Var;
        s70Var.setTextSize(1, 14.0f);
        this.h.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(this.h, org.telegram.ui.ActionBar.k6.f28290z6, this.resourceProvider);
        org.telegram.ui.ActionBar.r6.H(this.h, org.telegram.ui.ActionBar.k6.Uc, this.resourceProvider);
        if (this.f42486s != null) {
            this.h.setText(org.telegram.messenger.g0.U2(bd.M0(2131743135, null), new d8(this, 0)));
        } else {
            this.h.setText(bd.V(null, null, 2131743101, 12));
        }
        linearLayout.addView(this.h, mf.t(-1, -2, 1, 32, 0, 32, 8));
        r5 r5Var = new r5(context, new CharSequence[]{bd.G(12, "WalletPhraseWords", new Object[0]), bd.G(24, "WalletPhraseWords", new Object[0])}, new k(this, 5), this.resourceProvider);
        this.f42480b = r5Var;
        r5Var.f43126e = true;
        r5Var.updateColors();
        this.f42480b.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.f42480b.setClipToPadding(false);
        linearLayout.addView(this.f42480b, mf.t(-1, -2, 1, 0, 0, 0, 4));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f42481c = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f42481c.setGravity(1);
        this.f42481c.setClipChildren(false);
        linearLayout.addView(this.f42481c, mf.t(-1, -2, 1, 0, 16, 0, 0));
        gi.d dVar = new gi.d(context, this.resourceProvider, true);
        this.d = dVar;
        dVar.f();
        this.d.setText(bd.M0(2131743104, null));
        this.d.setEnabled(false);
        this.d.setOnClickListener(new View.OnClickListener(this) {
            public final e8 f42397b;

            {
                this.f42397b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f42397b.finishFragment();
                        return;
                    default:
                        e8.a0(this.f42397b);
                        return;
                }
            }
        });
        linearLayout.addView(this.d, mf.t(-1, 48, 1, 0, 24, 0, 0));
        b0(context);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = this.f42487w;
        int size = arrayList.size();
        boolean z10 = false;
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                if (((na) obj).getWord().isEmpty()) {
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
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        FrameLayout.LayoutParams layoutParams;
        ScrollView scrollView = this.f42483f;
        if (scrollView != null) {
            scrollView.setPadding(i3, org.telegram.messenger.g0.L(96.0f) + i10, i11, 0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f42483f.getLayoutParams();
            int max = Math.max(i12, this.f42484n);
            if (layoutParams2.bottomMargin != max) {
                layoutParams2.bottomMargin = max;
                this.f42483f.setLayoutParams(layoutParams2);
            }
        }
        ImageView imageView = this.f42482e;
        if (imageView != null && (layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams()) != null) {
            layoutParams.topMargin = org.telegram.messenger.g0.L(12.0f) + i10;
            this.f42482e.setLayoutParams(layoutParams);
        }
    }

    @Override
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.f42484n = k1Var.f54026a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }
}
