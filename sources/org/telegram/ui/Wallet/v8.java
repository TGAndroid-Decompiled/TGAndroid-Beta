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
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ri;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kc;
import org.telegram.ui.a31;
import org.telegram.ui.ao0;
public final class v8 extends org.telegram.ui.ActionBar.g2 {
    public int f45309a;
    public j6 f45310b;
    public LinearLayout f45311c;
    public hi.e d;
    public ImageView f45312e;
    public ScrollView f45313f;
    public j80 h;
    public int f45314n;
    public boolean f45315r;
    public byte[] f45316s;
    public final ArrayList f45317w;

    public v8() {
        super(null);
        this.f45309a = 12;
        this.f45317w = new ArrayList();
    }

    public static void Z(v8 v8Var, String str, v0 v0Var, org.telegram.ui.ActionBar.g2 g2Var, String str2) {
        v8Var.d.setLoading(false);
        if (!"WRONG_CONTRACT".equalsIgnoreCase(str2) && !"INVALID_PHRASE".equalsIgnoreCase(str2)) {
            if (str2 != null) {
                kc.b0(v8Var).f0(str2, false);
                return;
            }
            if (v8Var.f45315r && !TextUtils.isEmpty(str) && !TextUtils.equals(str, v0Var.y())) {
                new a1(v8Var.currentAccount, v8Var.getParentActivity(), str).C();
            }
            org.telegram.messenger.g0.h3(new r(14, v8Var, g2Var), 300L);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, v8Var.getParentActivity(), v8Var.getResourceProvider());
        String N0 = gd.N0(2131742831, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        t1Var.U = gd.N0(2131742830, null);
        org.telegram.messenger.f3.m(null, 2131742811, alertDialog$Builder, null);
    }

    public static void a0(v8 v8Var) {
        byte[] bArr;
        String str;
        FrameLayout frameLayout;
        byte[] bytes;
        if (!v8Var.d.R) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = v8Var.f45317w;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                arrayList.add(((eb) obj).getWord().toLowerCase().trim());
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
                s0 s0Var = new s0(bArr2);
                Arrays.fill(bArr2, (byte) 0);
                int size3 = arrayList3.size();
                int i13 = 0;
                while (i13 < size3) {
                    Object obj3 = arrayList3.get(i13);
                    i13++;
                    Arrays.fill((byte[]) obj3, (byte) 0);
                }
                try {
                    v8Var.d.setLoading(true);
                    org.telegram.ui.ActionBar.g2 g2Var = null;
                    if (v8Var.f45316s != null) {
                        try {
                            bArr = WalletEngine2.secretPhraseToPublicKey(s0Var);
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            bArr = null;
                        }
                        if (bArr == null) {
                            v8Var.d.setLoading(false);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, v8Var.getParentActivity(), v8Var.getResourceProvider());
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                            t1Var.S = gd.N0(2131742831, null);
                            t1Var.U = gd.N0(2131742830, null);
                            alertDialog$Builder.k(gd.N0(2131742811, null), null);
                            alertDialog$Builder.p();
                        } else if (!Arrays.equals(bArr, v8Var.f45316s)) {
                            try {
                                str = WalletEngine2.secretPhraseToAddress(s0Var);
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                                str = null;
                            }
                            if (!TextUtils.isEmpty(str)) {
                                frameLayout = new FrameLayout(v8Var.getParentActivity());
                                TextView textView = new TextView(v8Var.getParentActivity());
                                textView.setTextSize(1, 14.0f);
                                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, v8Var.resourceProvider);
                                textView.setText(c0(str));
                                textView.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f));
                                textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
                                int L = org.telegram.messenger.g0.L(10.0f);
                                int i14 = org.telegram.ui.ActionBar.n6.f29394a7;
                                ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i14, v8Var.resourceProvider));
                                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i14);
                                org.telegram.ui.ActionBar.i6 i6Var = v8Var.resourceProvider;
                                textView.setBackground(d02);
                                org.telegram.ui.ActionBar.u6.j(textView, d02, M, null, i6Var);
                                textView.setGravity(17);
                                frameLayout.addView(textView, c8.na.d(-1, -2.0f, 7, 16.0f, 0.0f, 16.0f, 0.0f));
                            } else {
                                frameLayout = null;
                            }
                            v8Var.d.setLoading(false);
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, v8Var.getParentActivity(), v8Var.getResourceProvider());
                            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28835a;
                            t1Var2.S = gd.N0(2131742686, null);
                            t1Var2.U = gd.N0(2131742685, null);
                            alertDialog$Builder2.o(frameLayout);
                            alertDialog$Builder2.k(gd.N0(2131747637, null), null);
                            alertDialog$Builder2.p();
                        } else {
                            v0 D = v0.D(v8Var.currentAccount);
                            D.f45257c.q(i10.i(v8Var.currentAccount).e(), bArr, s0Var, new a31(14, v8Var, D));
                        }
                        s0Var.close();
                        return;
                    }
                    v8Var.d.setLoading(true);
                    v0 D2 = v0.D(v8Var.currentAccount);
                    String y10 = D2.y();
                    if (v8Var.getParentLayout() != null && v8Var.getParentLayout().getFragmentStack().size() > 1) {
                        g2Var = (org.telegram.ui.ActionBar.g2) v8Var.getParentLayout().getFragmentStack().get(v8Var.getParentLayout().getFragmentStack().size() - 2);
                    }
                    D2.I(false, true, s0Var, new s(v8Var, y10, D2, g2Var));
                    s0Var.close();
                } catch (Throwable th2) {
                    try {
                        s0Var.close();
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
                    tVar.f27011b = (int) 191.25f;
                    spannableStringBuilder.setSpan(tVar, i7, spannableStringBuilder.length(), 33);
                }
                i7 = spannableStringBuilder.length();
                i10 = i13;
            }
        }
        return spannableStringBuilder;
    }

    public final void b0(Context context) {
        boolean z10;
        int i7;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f45317w;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(((eb) obj).getWord());
        }
        this.f45311c.removeAllViews();
        arrayList2.clear();
        for (int i11 = 0; i11 < this.f45309a; i11++) {
            if (i11 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            eb ebVar = new eb(i11, context, this.resourceProvider, z10);
            ebVar.setOnTextChangedListener(new u8(this, 1));
            ebVar.setOnPasteListener(new ao0(this, i11, 11));
            ebVar.setOnNextListener(new e21(this, i11, ebVar, 20));
            LinearLayout linearLayout = this.f45311c;
            if (i11 == 0) {
                i7 = 0;
            } else {
                i7 = 12;
            }
            linearLayout.addView(ebVar, c8.na.t(-1, 50, 1, 0, i7, 0, 0));
            arrayList2.add(ebVar);
        }
        for (int i12 = 0; i12 < arrayList.size() && i12 < arrayList2.size(); i12++) {
            if (!((String) arrayList.get(i12)).isEmpty()) {
                ((eb) arrayList2.get(i12)).setText((String) arrayList.get(i12));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i7;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        cu0 cu0Var = new cu0(context, null);
        this.fragmentView = cu0Var;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, cu0Var, this.resourceProvider);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setClipToPadding(false);
        scrollView.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        this.f45313f = scrollView;
        scrollView.addOnLayoutChangeListener(new i8(this, 1));
        ((FrameLayout) this.fragmentView).addView(scrollView, c8.na.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setClipToPadding(false);
        scrollView.addView(linearLayout, c8.na.o(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f45312e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f45312e;
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.s(imageView2, i10, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f45312e.setImageResource(2131231244);
        ImageView imageView3 = this.f45312e;
        int i11 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.ActionBar.u6.Q(imageView3, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i11, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.u6.M(i11), this.resourceProvider);
        this.f45312e.setOnClickListener(new View.OnClickListener(this) {
            public final v8 f45195b;

            {
                this.f45195b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f45195b.finishFragment();
                        return;
                    default:
                        v8.a0(this.f45195b);
                        return;
                }
            }
        });
        ((FrameLayout) this.fragmentView).addView(this.f45312e, c8.na.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        p9Var.setAspectFit(true);
        p9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        ri.d0(org.telegram.messenger.g0.t0()).h2(p9Var, "RestrictedEmoji", "📝", "100_100");
        p9Var.getImageReceiver().Y(1);
        linearLayout.addView(p9Var, c8.na.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        org.telegram.ui.ActionBar.u6.U(textView, i10, this.resourceProvider);
        if (this.f45316s != null) {
            i7 = 2131742753;
        } else {
            i7 = 2131742843;
        }
        textView.setText(gd.N0(i7, null));
        linearLayout.addView(textView, c8.na.t(-1, -2, 1, 32, 0, 32, 10));
        j80 j80Var = new j80(context, null);
        this.h = j80Var;
        j80Var.setTextSize(1, 14.0f);
        this.h.setGravity(1);
        org.telegram.ui.ActionBar.u6.U(this.h, org.telegram.ui.ActionBar.n6.f29862z6, this.resourceProvider);
        org.telegram.ui.ActionBar.u6.G(this.h, org.telegram.ui.ActionBar.n6.Xc, this.resourceProvider);
        if (this.f45316s != null) {
            this.h.setText(org.telegram.messenger.g0.T2(gd.N0(2131742874, null), new u8(this, 0)));
        } else {
            this.h.setText(gd.V(null, null, 2131742839, 12));
        }
        linearLayout.addView(this.h, c8.na.t(-1, -2, 1, 32, 0, 32, 8));
        j6 j6Var = new j6(context, new CharSequence[]{gd.G(12, "WalletPhraseWords", new Object[0]), gd.G(24, "WalletPhraseWords", new Object[0])}, new k(this, 4), this.resourceProvider);
        this.f45310b = j6Var;
        j6Var.f44533e = true;
        j6Var.updateColors();
        this.f45310b.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.f45310b.setClipToPadding(false);
        linearLayout.addView(this.f45310b, c8.na.t(-1, -2, 1, 0, 0, 0, 4));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f45311c = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f45311c.setGravity(1);
        this.f45311c.setClipChildren(false);
        linearLayout.addView(this.f45311c, c8.na.t(-1, -2, 1, 0, 16, 0, 0));
        hi.e eVar = new hi.e(context, this.resourceProvider, true);
        this.d = eVar;
        eVar.f();
        this.d.setText(gd.N0(2131742842, null));
        this.d.setEnabled(false);
        this.d.setOnClickListener(new View.OnClickListener(this) {
            public final v8 f45195b;

            {
                this.f45195b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f45195b.finishFragment();
                        return;
                    default:
                        v8.a0(this.f45195b);
                        return;
                }
            }
        });
        linearLayout.addView(this.d, c8.na.t(-1, 48, 1, 0, 24, 0, 0));
        b0(context);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        ArrayList arrayList = this.f45317w;
        int size = arrayList.size();
        boolean z10 = false;
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if (((eb) obj).getWord().isEmpty()) {
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
    public final void onInsets(int i7, int i10, int i11, int i12) {
        FrameLayout.LayoutParams layoutParams;
        ScrollView scrollView = this.f45313f;
        if (scrollView != null) {
            scrollView.setPadding(i7, org.telegram.messenger.g0.L(96.0f) + i10, i11, 0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f45313f.getLayoutParams();
            int max = Math.max(i12, this.f45314n);
            if (layoutParams2.bottomMargin != max) {
                layoutParams2.bottomMargin = max;
                this.f45313f.setLayoutParams(layoutParams2);
            }
        }
        ImageView imageView = this.f45312e;
        if (imageView != null && (layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams()) != null) {
            layoutParams.topMargin = org.telegram.messenger.g0.L(12.0f) + i10;
            this.f45312e.setLayoutParams(layoutParams);
        }
    }

    @Override
    public final r0.l1 onInsetsInternal(View view, r0.l1 l1Var) {
        this.f45314n = l1Var.f56381a.f(8).d;
        return super.onInsetsInternal(view, l1Var);
    }
}
