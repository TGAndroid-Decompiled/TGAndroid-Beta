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
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.si;
public final class w8 extends org.telegram.ui.ActionBar.e2 {
    public final ArrayList f44656a;
    public ScrollView f44657b;
    public ImageView f44658c;
    public LinearLayout d;
    public hi.d f44659e;
    public Runnable f44660f;
    public boolean h;

    public w8() {
        super(null);
        this.f44656a = new ArrayList();
    }

    public static void Z(w8 w8Var) {
        ArrayList arrayList = w8Var.f44656a;
        if (arrayList.size() != 12 && arrayList.size() != 24) {
            return;
        }
        ha haVar = new ha(arrayList, new l(w8Var, 12));
        haVar.setCurrentAccount(w8Var.currentAccount);
        w8Var.presentFragment(haVar);
    }

    public final void a0() {
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            Context context = this.d.getContext();
            ArrayList arrayList = this.f44656a;
            boolean z10 = true;
            int size = (arrayList.size() + 1) / 2;
            this.d.addView(p8.j0(0, size, context, arrayList, this.resourceProvider), c8.ja.p(0, -2, 1.0f, 48));
            this.d.addView(new View(context), c8.ja.o(10, 0));
            this.d.addView(p8.j0(size, arrayList.size(), context, arrayList, this.resourceProvider), c8.ja.p(0, -2, 1.0f, 48));
            hi.d dVar = this.f44659e;
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
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, frameLayout, this.resourceProvider);
        this.fragmentView = frameLayout;
        ScrollView scrollView = new ScrollView(context);
        this.f44657b = scrollView;
        scrollView.setFillViewport(true);
        this.f44657b.setVerticalScrollBarEnabled(false);
        this.f44657b.setClipToPadding(false);
        this.f44657b.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        frameLayout.addView(this.f44657b, c8.ja.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.f44657b.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f44658c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f44658c;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.s(imageView2, i11, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f44658c.setImageResource(2131231241);
        ImageView imageView3 = this.f44658c;
        int i12 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.ActionBar.q6.Q(imageView3, org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i12, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.q6.M(i12), this.resourceProvider);
        this.f44658c.setOnClickListener(new View.OnClickListener(this) {
            public final w8 f44609b;

            {
                this.f44609b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44609b.finishFragment();
                        return;
                    default:
                        w8.Z(this.f44609b);
                        return;
                }
            }
        });
        frameLayout.addView(this.f44658c, c8.ja.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        i9Var.setAspectFit(true);
        i9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        si.b0(org.telegram.messenger.g0.t0()).c2(i9Var, "RestrictedEmoji", "📝", "100_100");
        i9Var.getImageReceiver().X(1);
        linearLayout.addView(i9Var, c8.ja.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        org.telegram.ui.ActionBar.q6.U(textView, i11, this.resourceProvider);
        if (this.h) {
            i7 = 2131743146;
        } else {
            i7 = 2131743070;
        }
        textView.setText(hd.M0(i7, null));
        TextView f10 = i20.f(linearLayout, textView, c8.ja.t(-1, -2, 1, 32, 0, 32, 10), context);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        org.telegram.ui.ActionBar.q6.U(f10, org.telegram.ui.ActionBar.j6.f29260z6, this.resourceProvider);
        if (this.h) {
            i10 = 2131743145;
        } else {
            i10 = 2131743069;
        }
        f10.setText(hd.M0(i10, null));
        linearLayout.addView(f10, c8.ja.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.d = linearLayout2;
        linearLayout2.setOrientation(0);
        this.d.setGravity(1);
        linearLayout.addView(this.d, c8.ja.t(-1, -2, 1, 4, 24, 4, 0));
        linearLayout.addView(new View(context), c8.ja.l(1.0f, -1, 0));
        hi.d dVar = new hi.d(context, this.resourceProvider, true);
        this.f44659e = dVar;
        dVar.f();
        this.f44659e.setText(hd.M0(2131743154, null));
        this.f44659e.setOnClickListener(new View.OnClickListener(this) {
            public final w8 f44609b;

            {
                this.f44609b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44609b.finishFragment();
                        return;
                    default:
                        w8.Z(this.f44609b);
                        return;
                }
            }
        });
        linearLayout.addView(this.f44659e, c8.ja.t(-1, 48, 1, 0, 24, 0, 0));
        a0();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        ScrollView scrollView = this.f44657b;
        if (scrollView != null) {
            scrollView.setPadding(i7, org.telegram.messenger.g0.L(96.0f) + i10, i11, i12);
        }
        ImageView imageView = this.f44658c;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.g0.L(4.0f) + i7;
            layoutParams.topMargin = org.telegram.messenger.g0.L(12.0f) + i10;
            this.f44658c.setLayoutParams(layoutParams);
        }
    }
}
