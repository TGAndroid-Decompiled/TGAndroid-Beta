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
public final class t8 extends org.telegram.ui.ActionBar.f2 {
    public final ArrayList f43122a;
    public ScrollView f43123b;
    public ImageView f43124c;
    public LinearLayout d;
    public fi.d f43125e;
    public Runnable f43126f;
    public boolean h;

    public t8() {
        super(null);
        this.f43122a = new ArrayList();
    }

    public static void Z(t8 t8Var) {
        ArrayList arrayList = t8Var.f43122a;
        if (arrayList.size() != 12 && arrayList.size() != 24) {
            return;
        }
        da daVar = new da(arrayList, new l(t8Var, 12));
        daVar.setCurrentAccount(t8Var.currentAccount);
        t8Var.presentFragment(daVar);
    }

    public final void a0() {
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            Context context = this.d.getContext();
            ArrayList arrayList = this.f43122a;
            boolean z9 = true;
            int size = (arrayList.size() + 1) / 2;
            this.d.addView(m8.j0(0, size, context, arrayList, this.resourceProvider), c8.ha.p(0, -2, 1.0f, 48));
            this.d.addView(new View(context), c8.ha.o(10, 0));
            this.d.addView(m8.j0(size, arrayList.size(), context, arrayList, this.resourceProvider), c8.ha.p(0, -2, 1.0f, 48));
            fi.d dVar = this.f43125e;
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
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, frameLayout, this.resourceProvider);
        this.fragmentView = frameLayout;
        ScrollView scrollView = new ScrollView(context);
        this.f43123b = scrollView;
        scrollView.setFillViewport(true);
        this.f43123b.setVerticalScrollBarEnabled(false);
        this.f43123b.setClipToPadding(false);
        this.f43123b.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        frameLayout.addView(this.f43123b, c8.ha.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.f43123b.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f43124c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f43124c;
        int i11 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.s6.s(imageView2, i11, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f43124c.setImageResource(2131231241);
        ImageView imageView3 = this.f43124c;
        int i12 = org.telegram.ui.ActionBar.l6.f27957i6;
        org.telegram.ui.ActionBar.s6.Q(imageView3, org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i12, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.s6.M(i12), this.resourceProvider);
        this.f43124c.setOnClickListener(new View.OnClickListener(this) {
            public final t8 f43102b;

            {
                this.f43102b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43102b.finishFragment();
                        return;
                    default:
                        t8.Z(this.f43102b);
                        return;
                }
            }
        });
        frameLayout.addView(this.f43124c, c8.ha.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
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
        org.telegram.ui.ActionBar.s6.U(textView, i11, this.resourceProvider);
        if (this.h) {
            i7 = 2131743146;
        } else {
            i7 = 2131743070;
        }
        textView.setText(id.M0(i7, null));
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-1, -2, 1, 32, 0, 32, 10), context);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        org.telegram.ui.ActionBar.s6.U(f10, org.telegram.ui.ActionBar.l6.f28275z6, this.resourceProvider);
        if (this.h) {
            i10 = 2131743145;
        } else {
            i10 = 2131743069;
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
        this.f43125e = dVar;
        dVar.f();
        this.f43125e.setText(id.M0(2131743154, null));
        this.f43125e.setOnClickListener(new View.OnClickListener(this) {
            public final t8 f43102b;

            {
                this.f43102b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43102b.finishFragment();
                        return;
                    default:
                        t8.Z(this.f43102b);
                        return;
                }
            }
        });
        linearLayout.addView(this.f43125e, c8.ha.t(-1, 48, 1, 0, 24, 0, 0));
        a0();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        ScrollView scrollView = this.f43123b;
        if (scrollView != null) {
            scrollView.setPadding(i7, org.telegram.messenger.g0.L(96.0f) + i10, i11, i12);
        }
        ImageView imageView = this.f43124c;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.g0.L(4.0f) + i7;
            layoutParams.topMargin = org.telegram.messenger.g0.L(12.0f) + i10;
            this.f43124c.setLayoutParams(layoutParams);
        }
    }
}
