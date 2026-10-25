package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.vh;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.yx;
public final class z9 extends org.telegram.ui.ActionBar.r2 {
    public final String[] f37570a;
    public final int[] f37571b;
    public final m f37572c;
    public final ArrayList d;
    public ScrollView e;
    public ImageView f37573f;
    public fi.d h;
    public int f37574n;
    public int f37575r;
    public int f37576s;
    public int v;
    public int f37577w;
    public boolean f37578x;

    public z9(ArrayList arrayList, m mVar) {
        super(null);
        this.f37571b = new int[3];
        this.d = new ArrayList();
        int i10 = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f37570a = strArr;
        if (strArr.length != 12 && strArr.length != 24) {
            throw new IllegalArgumentException("Expected a 12- or 24-word recovery phrase");
        }
        this.f37572c = mVar;
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < this.f37570a.length; i11 = c3.h0.i(i11, i11, 1, arrayList2)) {
        }
        Collections.shuffle(arrayList2);
        while (true) {
            int[] iArr = this.f37571b;
            if (i10 < iArr.length) {
                iArr[i10] = ((Integer) arrayList2.get(i10)).intValue();
                i10++;
            } else {
                Arrays.sort(iArr);
                return;
            }
        }
    }

    public final void V() {
        boolean z10;
        int i10;
        if (this.h == null) {
            return;
        }
        ArrayList arrayList = this.d;
        boolean z11 = false;
        if (arrayList.size() == this.f37571b.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            z10 &= !((ha) obj).getWord().isEmpty();
        }
        fi.d dVar = this.h;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        dVar.setVisibility(i10);
        fi.d dVar2 = this.h;
        if (z10 && !this.f37578x) {
            z11 = true;
        }
        dVar2.setEnabled(z11);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        vw0 vw0Var = new vw0(context, null);
        vw0Var.setDelegate(new uw0() {
            @Override
            public final void I(int i11, boolean z10) {
                z9 z9Var = z9.this;
                z9Var.getClass();
                if (i11 <= AndroidUtilities.dp(20.0f)) {
                    i11 = 0;
                }
                z9Var.f37574n = i11;
                z9Var.onInsets(z9Var.f37575r, z9Var.f37576s, z9Var.v, z9Var.f37577w);
            }
        });
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, vw0Var, this.resourceProvider);
        this.fragmentView = vw0Var;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        scrollView.setFillViewport(true);
        this.e.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        this.e.setPadding(0, AndroidUtilities.dp(96.0f), 0, 0);
        vw0Var.addView(this.e, gb1.g(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        this.e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f37573f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f37573f;
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.t(imageView2, i11, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f37573f.setImageResource(R.drawable.ic_ab_close);
        ImageView imageView3 = this.f37573f;
        int i12 = org.telegram.ui.ActionBar.y6.f23446i6;
        org.telegram.ui.ActionBar.f7.R(imageView3, org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i12, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.f7.N(i12), this.resourceProvider);
        this.f37573f.setOnClickListener(new View.OnClickListener(this) {
            public final z9 f37528b;

            {
                this.f37528b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37528b.finishFragment();
                        return;
                    default:
                        z9 z9Var = this.f37528b;
                        int[] iArr = z9Var.f37571b;
                        ArrayList arrayList = z9Var.d;
                        if (!z9Var.f37578x && arrayList.size() == iArr.length) {
                            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                                int size = arrayList.size();
                                int i13 = 0;
                                while (i13 < size) {
                                    Object obj = arrayList.get(i13);
                                    i13++;
                                    if (((ha) obj).getWord().isEmpty()) {
                                        return;
                                    }
                                }
                                boolean z10 = true;
                                for (int i14 = 0; i14 < iArr.length; i14++) {
                                    ha haVar = (ha) arrayList.get(i14);
                                    boolean equalsIgnoreCase = z9Var.f37570a[iArr[i14]].equalsIgnoreCase(haVar.getWord());
                                    if (!equalsIgnoreCase && haVar.v) {
                                        AndroidUtilities.shakeViewSpring(haVar);
                                    }
                                    haVar.setError(!equalsIgnoreCase);
                                    z10 &= equalsIgnoreCase;
                                }
                                if (!z10) {
                                    return;
                                }
                            }
                            z9Var.f37578x = true;
                            z9Var.V();
                            AndroidUtilities.hideKeyboard(z9Var.fragmentView);
                            m mVar = z9Var.f37572c;
                            if (mVar != null) {
                                mVar.run();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        vw0Var.addView(this.f37573f, gb1.h(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        y9Var.setAspectFit(true);
        y9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(y9Var, "RestrictedEmoji", "👨\u200d🏫", "100_100");
        y9Var.getImageReceiver().setAutoRepeatCount(1);
        linearLayout.addView(y9Var, gb1.x(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        org.telegram.ui.ActionBar.f7.V(textView, i11, this.resourceProvider);
        textView.setText(LocaleController.getString(R.string.WalletTestPhrase));
        TextView e = vh.e(linearLayout, textView, gb1.x(-1, -2, 1, 32, 0, 32, 10), context);
        e.setTextSize(1, 14.0f);
        e.setGravity(1);
        org.telegram.ui.ActionBar.f7.V(e, org.telegram.ui.ActionBar.y6.f23765z6, this.resourceProvider);
        int i13 = R.string.WalletTestPhraseInfo;
        int[] iArr = this.f37571b;
        vh.o(i13, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, e);
        linearLayout.addView(e, gb1.x(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        linearLayout2.setClipChildren(false);
        linearLayout.addView(linearLayout2, gb1.x(-1, -2, 1, 0, 16, 0, 0));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList2.get(i14);
            i14++;
            arrayList.add(((ha) obj).getWord());
        }
        arrayList2.clear();
        for (int i15 = 0; i15 < iArr.length; i15++) {
            ha haVar = new ha(iArr[i15], context, this.resourceProvider, false);
            if (i15 < arrayList.size()) {
                haVar.setText((String) arrayList.get(i15));
            }
            haVar.setOnTextChangedListener(new m(this, 14));
            haVar.setOnNextListener(new yx(this, i15, haVar, 19));
            if (i15 == 0) {
                i10 = 0;
            } else {
                i10 = 12;
            }
            linearLayout2.addView(haVar, gb1.x(-1, 50, 1, 0, i10, 0, 0));
            arrayList2.add(haVar);
        }
        linearLayout.addView(new View(context), gb1.p(1.0f, -1, 0));
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        this.h = dVar;
        dVar.f();
        this.h.setText(LocaleController.getString(R.string.WalletContinue));
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final z9 f37528b;

            {
                this.f37528b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37528b.finishFragment();
                        return;
                    default:
                        z9 z9Var = this.f37528b;
                        int[] iArr2 = z9Var.f37571b;
                        ArrayList arrayList3 = z9Var.d;
                        if (!z9Var.f37578x && arrayList3.size() == iArr2.length) {
                            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                                int size2 = arrayList3.size();
                                int i132 = 0;
                                while (i132 < size2) {
                                    Object obj2 = arrayList3.get(i132);
                                    i132++;
                                    if (((ha) obj2).getWord().isEmpty()) {
                                        return;
                                    }
                                }
                                boolean z10 = true;
                                for (int i142 = 0; i142 < iArr2.length; i142++) {
                                    ha haVar2 = (ha) arrayList3.get(i142);
                                    boolean equalsIgnoreCase = z9Var.f37570a[iArr2[i142]].equalsIgnoreCase(haVar2.getWord());
                                    if (!equalsIgnoreCase && haVar2.v) {
                                        AndroidUtilities.shakeViewSpring(haVar2);
                                    }
                                    haVar2.setError(!equalsIgnoreCase);
                                    z10 &= equalsIgnoreCase;
                                }
                                if (!z10) {
                                    return;
                                }
                            }
                            z9Var.f37578x = true;
                            z9Var.V();
                            AndroidUtilities.hideKeyboard(z9Var.fragmentView);
                            m mVar = z9Var.f37572c;
                            if (mVar != null) {
                                mVar.run();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout.addView(this.h, gb1.x(-1, 48, 1, 0, 24, 0, 0));
        V();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f37575r = i10;
        this.f37576s = i11;
        this.v = i12;
        this.f37577w = i13;
        ScrollView scrollView = this.e;
        if (scrollView != null) {
            scrollView.setPadding(i10, AndroidUtilities.dp(96.0f) + i11, i12, i13 + this.f37574n);
        }
        ImageView imageView = this.f37573f;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = AndroidUtilities.dp(4.0f) + i10;
            layoutParams.topMargin = AndroidUtilities.dp(12.0f) + i11;
            this.f37573f.setLayoutParams(layoutParams);
        }
    }
}
