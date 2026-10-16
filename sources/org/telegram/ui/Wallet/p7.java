package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.z9;
public final class p7 extends org.telegram.ui.ActionBar.m2 {
    public final ArrayList f33348a;
    public ScrollView f33349b;
    public ImageView f33350c;
    public LinearLayout d;
    public di.d e;
    public Runnable f33351f;
    public boolean h;

    public p7() {
        super(null);
        this.f33348a = new ArrayList();
    }

    public static void U(p7 p7Var) {
        ArrayList arrayList = p7Var.f33348a;
        if (arrayList.size() != 12 && arrayList.size() != 24) {
            return;
        }
        z8 z8Var = new z8(arrayList, new n(p7Var, 12));
        z8Var.setCurrentAccount(p7Var.currentAccount);
        p7Var.presentFragment(z8Var);
    }

    public final void V() {
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            Context context = this.d.getContext();
            ArrayList arrayList = this.f33348a;
            boolean z10 = true;
            int size = (arrayList.size() + 1) / 2;
            this.d.addView(l7.e0(0, size, context, arrayList, this.resourceProvider), w7.z5.o(0, -2, 1.0f, 48));
            this.d.addView(new View(context), w7.z5.n(10, 0));
            this.d.addView(l7.e0(size, arrayList.size(), context, arrayList, this.resourceProvider), w7.z5.o(0, -2, 1.0f, 48));
            di.d dVar = this.e;
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
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, this.resourceProvider));
        this.fragmentView = frameLayout;
        ScrollView scrollView = new ScrollView(context);
        this.f33349b = scrollView;
        scrollView.setFillViewport(true);
        this.f33349b.setVerticalScrollBarEnabled(false);
        this.f33349b.setClipToPadding(false);
        this.f33349b.setPadding(0, AndroidUtilities.dp(96.0f), 0, 0);
        frameLayout.addView(this.f33349b, w7.z5.d(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        this.f33349b.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f33350c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f33350c;
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i12, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        this.f33350c.setImageResource(R.drawable.ic_ab_close);
        this.f33350c.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19690i6, this.resourceProvider), 3, -1));
        this.f33350c.setOnClickListener(new View.OnClickListener(this) {
            public final p7 f33296b;

            {
                this.f33296b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33296b.finishFragment();
                        return;
                    default:
                        p7.U(this.f33296b);
                        return;
                }
            }
        });
        frameLayout.addView(this.f33350c, w7.z5.a(48.0f, 4.0f, 12.0f, 0.0f, 0.0f, 48, 51));
        z9 z9Var = new z9(context);
        z9Var.setAspectFit(true);
        z9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(z9Var, "RestrictedEmoji", "📝", "100_100");
        z9Var.getImageReceiver().setAutoRepeatCount(1);
        linearLayout.addView(z9Var, w7.z5.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, this.resourceProvider));
        if (this.h) {
            i10 = R.string.WalletCurrentSecretPhrase;
        } else {
            i10 = R.string.WalletNewSecretPhrase;
        }
        textView.setText(LocaleController.getString(i10));
        TextView i13 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.t(-1, -2, 1, 32, 0, 32, 10), context);
        i13.setTextSize(1, 14.0f);
        i13.setGravity(1);
        i13.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20005z6, this.resourceProvider));
        if (this.h) {
            i11 = R.string.WalletCurrentSecretPhraseInfo;
        } else {
            i11 = R.string.WalletNewSecretPhraseInfo;
        }
        i13.setText(LocaleController.getString(i11));
        linearLayout.addView(i13, w7.z5.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.d = linearLayout2;
        linearLayout2.setOrientation(0);
        this.d.setGravity(1);
        linearLayout.addView(this.d, w7.z5.t(-1, -2, 1, 4, 24, 4, 0));
        linearLayout.addView(new View(context), w7.z5.l(1.0f, -1, 0));
        di.d dVar = new di.d(context, this.resourceProvider, true);
        this.e = dVar;
        dVar.e();
        this.e.setText(LocaleController.getString(R.string.WalletContinue));
        this.e.setOnClickListener(new View.OnClickListener(this) {
            public final p7 f33296b;

            {
                this.f33296b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33296b.finishFragment();
                        return;
                    default:
                        p7.U(this.f33296b);
                        return;
                }
            }
        });
        linearLayout.addView(this.e, w7.z5.t(-1, 48, 1, 0, 24, 0, 0));
        V();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        ScrollView scrollView = this.f33349b;
        if (scrollView != null) {
            scrollView.setPadding(i10, AndroidUtilities.dp(96.0f) + i11, i12, i13);
        }
        ImageView imageView = this.f33350c;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = AndroidUtilities.dp(4.0f) + i10;
            layoutParams.topMargin = AndroidUtilities.dp(12.0f) + i11;
            this.f33350c.setLayoutParams(layoutParams);
        }
    }
}
