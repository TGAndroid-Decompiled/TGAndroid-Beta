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
public final class l9 extends org.telegram.ui.ActionBar.h2 {
    public final ArrayList f44499a;
    public ScrollView f44500b;
    public ImageView f44501c;
    public LinearLayout d;
    public hi.d f44502e;
    public Runnable f44503f;
    public boolean h;

    public l9() {
        super(null);
        this.f44499a = new ArrayList();
    }

    public static void Z(l9 l9Var) {
        ArrayList arrayList = l9Var.f44499a;
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
            ArrayList arrayList = this.f44499a;
            boolean z10 = true;
            int size = (arrayList.size() + 1) / 2;
            this.d.addView(d9.j0(0, size, context, arrayList, this.resourceProvider), c8.ma.p(0, -2, 1.0f, 48));
            this.d.addView(new View(context), c8.ma.o(10, 0));
            this.d.addView(d9.j0(size, arrayList.size(), context, arrayList, this.resourceProvider), c8.ma.p(0, -2, 1.0f, 48));
            hi.d dVar = this.f44502e;
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
        int i7;
        int i10;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, frameLayout, this.resourceProvider);
        this.fragmentView = frameLayout;
        ScrollView scrollView = new ScrollView(context);
        this.f44500b = scrollView;
        scrollView.setFillViewport(true);
        this.f44500b.setVerticalScrollBarEnabled(false);
        this.f44500b.setClipToPadding(false);
        this.f44500b.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        frameLayout.addView(this.f44500b, c8.ma.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.f44500b.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f44501c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f44501c;
        int i11 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.s(imageView2, i11, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f44501c.setImageResource(2131231241);
        ImageView imageView3 = this.f44501c;
        int i12 = org.telegram.ui.ActionBar.n6.f29486i6;
        org.telegram.ui.ActionBar.u6.Q(imageView3, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i12, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.u6.M(i12), this.resourceProvider);
        this.f44501c.setOnClickListener(new View.OnClickListener(this) {
            public final l9 f44454b;

            {
                this.f44454b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44454b.finishFragment();
                        return;
                    default:
                        l9.Z(this.f44454b);
                        return;
                }
            }
        });
        frameLayout.addView(this.f44501c, c8.ma.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
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
        org.telegram.ui.ActionBar.u6.U(textView, i11, this.resourceProvider);
        if (this.h) {
            i7 = 2131742908;
        } else {
            i7 = 2131742831;
        }
        textView.setText(gd.M0(i7, null));
        TextView f10 = n10.f(linearLayout, textView, c8.ma.t(-1, -2, 1, 32, 0, 32, 10), context);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        org.telegram.ui.ActionBar.u6.U(f10, org.telegram.ui.ActionBar.n6.f29805z6, this.resourceProvider);
        if (this.h) {
            i10 = 2131742907;
        } else {
            i10 = 2131742830;
        }
        f10.setText(gd.M0(i10, null));
        linearLayout.addView(f10, c8.ma.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.d = linearLayout2;
        linearLayout2.setOrientation(0);
        this.d.setGravity(1);
        linearLayout.addView(this.d, c8.ma.t(-1, -2, 1, 4, 24, 4, 0));
        linearLayout.addView(new View(context), c8.ma.l(1.0f, -1, 0));
        hi.d dVar = new hi.d(context, this.resourceProvider, true);
        this.f44502e = dVar;
        dVar.f();
        this.f44502e.setText(gd.M0(2131742916, null));
        this.f44502e.setOnClickListener(new View.OnClickListener(this) {
            public final l9 f44454b;

            {
                this.f44454b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44454b.finishFragment();
                        return;
                    default:
                        l9.Z(this.f44454b);
                        return;
                }
            }
        });
        linearLayout.addView(this.f44502e, c8.ma.t(-1, 48, 1, 0, 24, 0, 0));
        a0();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        ScrollView scrollView = this.f44500b;
        if (scrollView != null) {
            scrollView.setPadding(i7, org.telegram.messenger.g0.L(96.0f) + i10, i11, i12);
        }
        ImageView imageView = this.f44501c;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.g0.L(4.0f) + i7;
            layoutParams.topMargin = org.telegram.messenger.g0.L(12.0f) + i10;
            this.f44501c.setLayoutParams(layoutParams);
        }
    }
}
