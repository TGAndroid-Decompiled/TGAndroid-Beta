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
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
public final class l9 extends org.telegram.ui.ActionBar.g2 {
    public final ArrayList f44539a;
    public ScrollView f44540b;
    public ImageView f44541c;
    public LinearLayout d;
    public hi.e f44542e;
    public Runnable f44543f;
    public boolean h;

    public l9() {
        super(null);
        this.f44539a = new ArrayList();
    }

    public static void Z(l9 l9Var) {
        ArrayList arrayList = l9Var.f44539a;
        if (arrayList.size() != 12 && arrayList.size() != 24) {
            return;
        }
        va vaVar = new va(arrayList, new m(l9Var, 12));
        vaVar.setCurrentAccount(l9Var.currentAccount);
        l9Var.presentFragment(vaVar);
    }

    public final void a0() {
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            Context context = this.d.getContext();
            ArrayList arrayList = this.f44539a;
            boolean z10 = true;
            int size = (arrayList.size() + 1) / 2;
            this.d.addView(d9.j0(0, size, context, arrayList, this.resourceProvider), c8.ma.p(0, -2, 1.0f, 48));
            this.d.addView(new View(context), c8.ma.o(10, 0));
            this.d.addView(d9.j0(size, arrayList.size(), context, arrayList, this.resourceProvider), c8.ma.p(0, -2, 1.0f, 48));
            hi.e eVar = this.f44542e;
            if (eVar != null) {
                if (arrayList.size() != 12 && arrayList.size() != 24) {
                    z10 = false;
                }
                eVar.setEnabled(z10);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29378d6, frameLayout, this.resourceProvider);
        this.fragmentView = frameLayout;
        ScrollView scrollView = new ScrollView(context);
        this.f44540b = scrollView;
        scrollView.setFillViewport(true);
        this.f44540b.setVerticalScrollBarEnabled(false);
        this.f44540b.setClipToPadding(false);
        this.f44540b.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        frameLayout.addView(this.f44540b, c8.ma.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.f44540b.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f44541c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f44541c;
        int i11 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.s(imageView2, i11, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f44541c.setImageResource(2131231241);
        ImageView imageView3 = this.f44541c;
        int i12 = org.telegram.ui.ActionBar.m6.f29470i6;
        org.telegram.ui.ActionBar.t6.Q(imageView3, org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.t6.M(i12), this.resourceProvider);
        this.f44541c.setOnClickListener(new View.OnClickListener(this) {
            public final l9 f44494b;

            {
                this.f44494b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44494b.finishFragment();
                        return;
                    default:
                        l9.Z(this.f44494b);
                        return;
                }
            }
        });
        frameLayout.addView(this.f44541c, c8.ma.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        q9Var.setAspectFit(true);
        q9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        ri.d0(org.telegram.messenger.g0.t0()).h2(q9Var, "RestrictedEmoji", "📝", "100_100");
        q9Var.getImageReceiver().X(1);
        linearLayout.addView(q9Var, c8.ma.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        org.telegram.ui.ActionBar.t6.U(textView, i11, this.resourceProvider);
        if (this.h) {
            i7 = 2131742902;
        } else {
            i7 = 2131742825;
        }
        textView.setText(gd.N0(i7, null));
        TextView f10 = n10.f(linearLayout, textView, c8.ma.t(-1, -2, 1, 32, 0, 32, 10), context);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        org.telegram.ui.ActionBar.t6.U(f10, org.telegram.ui.ActionBar.m6.f29789z6, this.resourceProvider);
        if (this.h) {
            i10 = 2131742901;
        } else {
            i10 = 2131742824;
        }
        f10.setText(gd.N0(i10, null));
        linearLayout.addView(f10, c8.ma.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.d = linearLayout2;
        linearLayout2.setOrientation(0);
        this.d.setGravity(1);
        linearLayout.addView(this.d, c8.ma.t(-1, -2, 1, 4, 24, 4, 0));
        linearLayout.addView(new View(context), c8.ma.l(1.0f, -1, 0));
        hi.e eVar = new hi.e(context, this.resourceProvider, true);
        this.f44542e = eVar;
        eVar.f();
        this.f44542e.setText(gd.N0(2131742910, null));
        this.f44542e.setOnClickListener(new View.OnClickListener(this) {
            public final l9 f44494b;

            {
                this.f44494b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44494b.finishFragment();
                        return;
                    default:
                        l9.Z(this.f44494b);
                        return;
                }
            }
        });
        linearLayout.addView(this.f44542e, c8.ma.t(-1, 48, 1, 0, 24, 0, 0));
        a0();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        ScrollView scrollView = this.f44540b;
        if (scrollView != null) {
            scrollView.setPadding(i7, org.telegram.messenger.g0.L(96.0f) + i10, i11, i12);
        }
        ImageView imageView = this.f44541c;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.g0.L(4.0f) + i7;
            layoutParams.topMargin = org.telegram.messenger.g0.L(12.0f) + i10;
            this.f44541c.setLayoutParams(layoutParams);
        }
    }
}
