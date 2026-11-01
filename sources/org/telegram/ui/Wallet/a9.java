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
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.vi;
public final class a9 extends org.telegram.ui.ActionBar.k2 {
    public final ArrayList f34214a;
    public ScrollView f34215b;
    public ImageView f34216c;
    public LinearLayout d;
    public vh.d e;
    public Runnable f34217f;
    public boolean h;

    public a9() {
        super(null);
        this.f34214a = new ArrayList();
    }

    public static void Z(a9 a9Var) {
        ArrayList arrayList = a9Var.f34214a;
        if (arrayList.size() != 12 && arrayList.size() != 24) {
            return;
        }
        ja jaVar = new ja(arrayList, new l(a9Var, 12));
        jaVar.setCurrentAccount(a9Var.currentAccount);
        a9Var.presentFragment(jaVar);
    }

    public final void a0() {
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            Context context = this.d.getContext();
            ArrayList arrayList = this.f34214a;
            boolean z10 = true;
            int size = (arrayList.size() + 1) / 2;
            this.d.addView(t8.j0(0, size, context, arrayList, this.resourceProvider), w7.b6.p(0, -2, 1.0f, 48));
            this.d.addView(new View(context), w7.b6.o(10, 0));
            this.d.addView(t8.j0(size, arrayList.size(), context, arrayList, this.resourceProvider), w7.b6.p(0, -2, 1.0f, 48));
            vh.d dVar = this.e;
            if (dVar != null) {
                if (arrayList.size() != 12 && arrayList.size() != 24) {
                    z10 = false;
                }
                dVar.setEnabled(z10);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, frameLayout, this.resourceProvider);
        this.fragmentView = frameLayout;
        ScrollView scrollView = new ScrollView(context);
        this.f34215b = scrollView;
        scrollView.setFillViewport(true);
        this.f34215b.setVerticalScrollBarEnabled(false);
        this.f34215b.setClipToPadding(false);
        this.f34215b.setPadding(0, org.telegram.messenger.i0.L(96.0f), 0, 0);
        frameLayout.addView(this.f34215b, w7.b6.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.i0.L(36.0f), 0, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.f34215b.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f34216c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f34216c;
        int i12 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.t(imageView2, i12, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f34216c.setImageResource(2131231242);
        ImageView imageView3 = this.f34216c;
        int i13 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.ActionBar.a7.R(imageView3, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i13, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.a7.N(i13), this.resourceProvider);
        this.f34216c.setOnClickListener(new View.OnClickListener(this) {
            public final a9 f35474b;

            {
                this.f35474b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35474b.finishFragment();
                        return;
                    default:
                        a9.Z(this.f35474b);
                        return;
                }
            }
        });
        frameLayout.addView(this.f34216c, w7.b6.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        g9Var.setAspectFit(true);
        g9Var.getImageReceiver().d = org.telegram.messenger.i0.t0();
        vi.b0(org.telegram.messenger.i0.t0()).c2(g9Var, "RestrictedEmoji", "📝", "100_100");
        g9Var.getImageReceiver().X(1);
        linearLayout.addView(g9Var, w7.b6.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(1);
        org.telegram.ui.ActionBar.a7.V(textView, i12, this.resourceProvider);
        if (this.h) {
            i10 = 2131743172;
        } else {
            i10 = 2131743096;
        }
        textView.setText(dd.L0(i10, null));
        TextView f7 = a30.f(linearLayout, textView, w7.b6.t(-1, -2, 1, 32, 0, 32, 10), context);
        f7.setTextSize(1, 14.0f);
        f7.setGravity(1);
        org.telegram.ui.ActionBar.a7.V(f7, org.telegram.ui.ActionBar.t6.f21331z6, this.resourceProvider);
        if (this.h) {
            i11 = 2131743171;
        } else {
            i11 = 2131743095;
        }
        f7.setText(dd.L0(i11, null));
        linearLayout.addView(f7, w7.b6.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.d = linearLayout2;
        linearLayout2.setOrientation(0);
        this.d.setGravity(1);
        linearLayout.addView(this.d, w7.b6.t(-1, -2, 1, 4, 24, 4, 0));
        linearLayout.addView(new View(context), w7.b6.l(1.0f, -1, 0));
        vh.d dVar = new vh.d(context, this.resourceProvider, true);
        this.e = dVar;
        dVar.f();
        this.e.setText(dd.L0(2131743180, null));
        this.e.setOnClickListener(new View.OnClickListener(this) {
            public final a9 f35474b;

            {
                this.f35474b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35474b.finishFragment();
                        return;
                    default:
                        a9.Z(this.f35474b);
                        return;
                }
            }
        });
        linearLayout.addView(this.e, w7.b6.t(-1, 48, 1, 0, 24, 0, 0));
        a0();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        ScrollView scrollView = this.f34215b;
        if (scrollView != null) {
            scrollView.setPadding(i10, org.telegram.messenger.i0.L(96.0f) + i11, i12, i13);
        }
        ImageView imageView = this.f34216c;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.i0.L(4.0f) + i10;
            layoutParams.topMargin = org.telegram.messenger.i0.L(12.0f) + i11;
            this.f34216c.setLayoutParams(layoutParams);
        }
    }
}
