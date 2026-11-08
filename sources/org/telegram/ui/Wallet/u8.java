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
import org.telegram.messenger.id;
import org.telegram.messenger.ui;
public final class u8 extends org.telegram.ui.ActionBar.f2 {
    public final ArrayList f43204a;
    public ScrollView f43205b;
    public ImageView f43206c;
    public LinearLayout d;
    public fi.d f43207e;
    public Runnable f43208f;
    public boolean h;

    public u8() {
        super(null);
        this.f43204a = new ArrayList();
    }

    public static void Z(u8 u8Var) {
        ArrayList arrayList = u8Var.f43204a;
        if (arrayList.size() != 12 && arrayList.size() != 24) {
            return;
        }
        ea eaVar = new ea(arrayList, new l(u8Var, 12));
        eaVar.setCurrentAccount(u8Var.currentAccount);
        u8Var.presentFragment(eaVar);
    }

    public final void a0() {
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            Context context = this.d.getContext();
            ArrayList arrayList = this.f43204a;
            boolean z9 = true;
            int size = (arrayList.size() + 1) / 2;
            this.d.addView(n8.j0(0, size, context, arrayList, this.resourceProvider), c8.ha.p(0, -2, 1.0f, 48));
            this.d.addView(new View(context), c8.ha.o(10, 0));
            this.d.addView(n8.j0(size, arrayList.size(), context, arrayList, this.resourceProvider), c8.ha.p(0, -2, 1.0f, 48));
            fi.d dVar = this.f43207e;
            if (dVar != null) {
                if (arrayList.size() != 12 && arrayList.size() != 24) {
                    z9 = false;
                }
                dVar.setEnabled(z9);
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
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, frameLayout, this.resourceProvider);
        this.fragmentView = frameLayout;
        ScrollView scrollView = new ScrollView(context);
        this.f43205b = scrollView;
        scrollView.setFillViewport(true);
        this.f43205b.setVerticalScrollBarEnabled(false);
        this.f43205b.setClipToPadding(false);
        this.f43205b.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        frameLayout.addView(this.f43205b, c8.ha.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.f43205b.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f43206c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f43206c;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView2, i11, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f43206c.setImageResource(2131231241);
        ImageView imageView3 = this.f43206c;
        int i12 = org.telegram.ui.ActionBar.k6.f27944i6;
        org.telegram.ui.ActionBar.r6.R(imageView3, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.r6.N(i12), this.resourceProvider);
        this.f43206c.setOnClickListener(new View.OnClickListener(this) {
            public final u8 f43184b;

            {
                this.f43184b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43184b.finishFragment();
                        return;
                    default:
                        u8.Z(this.f43184b);
                        return;
                }
            }
        });
        frameLayout.addView(this.f43206c, c8.ha.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
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
        org.telegram.ui.ActionBar.r6.V(textView, i11, this.resourceProvider);
        if (this.h) {
            i7 = 2131743149;
        } else {
            i7 = 2131743073;
        }
        textView.setText(id.M0(i7, null));
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-1, -2, 1, 32, 0, 32, 10), context);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(f10, org.telegram.ui.ActionBar.k6.f28262z6, this.resourceProvider);
        if (this.h) {
            i10 = 2131743148;
        } else {
            i10 = 2131743072;
        }
        f10.setText(id.M0(i10, null));
        linearLayout.addView(f10, c8.ha.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.d = linearLayout2;
        linearLayout2.setOrientation(0);
        this.d.setGravity(1);
        linearLayout.addView(this.d, c8.ha.t(-1, -2, 1, 4, 24, 4, 0));
        linearLayout.addView(new View(context), c8.ha.l(1.0f, -1, 0));
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        this.f43207e = dVar;
        dVar.f();
        this.f43207e.setText(id.M0(2131743157, null));
        this.f43207e.setOnClickListener(new View.OnClickListener(this) {
            public final u8 f43184b;

            {
                this.f43184b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43184b.finishFragment();
                        return;
                    default:
                        u8.Z(this.f43184b);
                        return;
                }
            }
        });
        linearLayout.addView(this.f43207e, c8.ha.t(-1, 48, 1, 0, 24, 0, 0));
        a0();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        ScrollView scrollView = this.f43205b;
        if (scrollView != null) {
            scrollView.setPadding(i7, org.telegram.messenger.g0.L(96.0f) + i10, i11, i12);
        }
        ImageView imageView = this.f43206c;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.g0.L(4.0f) + i7;
            layoutParams.topMargin = org.telegram.messenger.g0.L(12.0f) + i10;
            this.f43206c.setLayoutParams(layoutParams);
        }
    }
}
