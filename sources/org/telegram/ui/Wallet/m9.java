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
import org.telegram.messenger.m10;
import org.telegram.messenger.ri;
public final class m9 extends org.telegram.ui.ActionBar.g2 {
    public final ArrayList f44670a;
    public ScrollView f44671b;
    public ImageView f44672c;
    public LinearLayout d;
    public hi.e f44673e;
    public Runnable f44674f;
    public boolean h;

    public m9() {
        super(null);
        this.f44670a = new ArrayList();
    }

    public static void Z(m9 m9Var) {
        ArrayList arrayList = m9Var.f44670a;
        if (arrayList.size() != 12 && arrayList.size() != 24) {
            return;
        }
        wa waVar = new wa(arrayList, new m(m9Var, 12));
        waVar.setCurrentAccount(m9Var.currentAccount);
        m9Var.presentFragment(waVar);
    }

    public final void a0() {
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            Context context = this.d.getContext();
            ArrayList arrayList = this.f44670a;
            boolean z10 = true;
            int size = (arrayList.size() + 1) / 2;
            this.d.addView(e9.j0(0, size, context, arrayList, this.resourceProvider), c8.na.p(0, -2, 1.0f, 48));
            this.d.addView(new View(context), c8.na.o(10, 0));
            this.d.addView(e9.j0(size, arrayList.size(), context, arrayList, this.resourceProvider), c8.na.p(0, -2, 1.0f, 48));
            hi.e eVar = this.f44673e;
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
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, frameLayout, this.resourceProvider);
        this.fragmentView = frameLayout;
        ScrollView scrollView = new ScrollView(context);
        this.f44671b = scrollView;
        scrollView.setFillViewport(true);
        this.f44671b.setVerticalScrollBarEnabled(false);
        this.f44671b.setClipToPadding(false);
        this.f44671b.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        frameLayout.addView(this.f44671b, c8.na.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.f44671b.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f44672c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f44672c;
        int i11 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.s(imageView2, i11, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f44672c.setImageResource(2131231244);
        ImageView imageView3 = this.f44672c;
        int i12 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.ActionBar.u6.Q(imageView3, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i12, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.u6.M(i12), this.resourceProvider);
        this.f44672c.setOnClickListener(new View.OnClickListener(this) {
            public final m9 f44623b;

            {
                this.f44623b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44623b.finishFragment();
                        return;
                    default:
                        m9.Z(this.f44623b);
                        return;
                }
            }
        });
        frameLayout.addView(this.f44672c, c8.na.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
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
        org.telegram.ui.ActionBar.u6.U(textView, i11, this.resourceProvider);
        if (this.h) {
            i7 = 2131742895;
        } else {
            i7 = 2131742818;
        }
        textView.setText(gd.N0(i7, null));
        TextView f10 = m10.f(linearLayout, textView, c8.na.t(-1, -2, 1, 32, 0, 32, 10), context);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        org.telegram.ui.ActionBar.u6.U(f10, org.telegram.ui.ActionBar.n6.f29862z6, this.resourceProvider);
        if (this.h) {
            i10 = 2131742894;
        } else {
            i10 = 2131742817;
        }
        f10.setText(gd.N0(i10, null));
        linearLayout.addView(f10, c8.na.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.d = linearLayout2;
        linearLayout2.setOrientation(0);
        this.d.setGravity(1);
        linearLayout.addView(this.d, c8.na.t(-1, -2, 1, 4, 24, 4, 0));
        linearLayout.addView(new View(context), c8.na.l(1.0f, -1, 0));
        hi.e eVar = new hi.e(context, this.resourceProvider, true);
        this.f44673e = eVar;
        eVar.f();
        this.f44673e.setText(gd.N0(2131742903, null));
        this.f44673e.setOnClickListener(new View.OnClickListener(this) {
            public final m9 f44623b;

            {
                this.f44623b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44623b.finishFragment();
                        return;
                    default:
                        m9.Z(this.f44623b);
                        return;
                }
            }
        });
        linearLayout.addView(this.f44673e, c8.na.t(-1, 48, 1, 0, 24, 0, 0));
        a0();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        ScrollView scrollView = this.f44671b;
        if (scrollView != null) {
            scrollView.setPadding(i7, org.telegram.messenger.g0.L(96.0f) + i10, i11, i12);
        }
        ImageView imageView = this.f44672c;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.g0.L(4.0f) + i7;
            layoutParams.topMargin = org.telegram.messenger.g0.L(12.0f) + i10;
            this.f44672c.setLayoutParams(layoutParams);
        }
    }
}
