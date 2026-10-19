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
public final class p8 extends org.telegram.ui.ActionBar.n2 {
    public final ArrayList f34734a;
    public ScrollView f34735b;
    public ImageView f34736c;
    public LinearLayout d;
    public ei.d e;
    public Runnable f34737f;
    public boolean h;

    public p8() {
        super(null);
        this.f34734a = new ArrayList();
    }

    public static void U(p8 p8Var) {
        ArrayList arrayList = p8Var.f34734a;
        if (arrayList.size() != 12 && arrayList.size() != 24) {
            return;
        }
        z9 z9Var = new z9(arrayList, new n(p8Var, 11));
        z9Var.setCurrentAccount(p8Var.currentAccount);
        p8Var.presentFragment(z9Var);
    }

    public final void V() {
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            Context context = this.d.getContext();
            ArrayList arrayList = this.f34734a;
            boolean z10 = true;
            int size = (arrayList.size() + 1) / 2;
            this.d.addView(h8.e0(0, size, context, arrayList, this.resourceProvider), w7.z5.o(0, -2, 1.0f, 48));
            this.d.addView(new View(context), w7.z5.n(10, 0));
            this.d.addView(h8.e0(size, arrayList.size(), context, arrayList, this.resourceProvider), w7.z5.o(0, -2, 1.0f, 48));
            ei.d dVar = this.e;
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
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20989d6, this.resourceProvider));
        this.fragmentView = frameLayout;
        ScrollView scrollView = new ScrollView(context);
        this.f34735b = scrollView;
        scrollView.setFillViewport(true);
        this.f34735b.setVerticalScrollBarEnabled(false);
        this.f34735b.setClipToPadding(false);
        this.f34735b.setPadding(0, AndroidUtilities.dp(96.0f), 0, 0);
        frameLayout.addView(this.f34735b, w7.z5.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        this.f34735b.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f34736c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f34736c;
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i12, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        this.f34736c.setImageResource(R.drawable.ic_ab_close);
        this.f34736c.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21078i6, this.resourceProvider), 3, -1));
        this.f34736c.setOnClickListener(new View.OnClickListener(this) {
            public final p8 f34669b;

            {
                this.f34669b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f34669b.finishFragment();
                        return;
                    default:
                        p8.U(this.f34669b);
                        return;
                }
            }
        });
        frameLayout.addView(this.f34736c, w7.z5.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        w9Var.setAspectFit(true);
        w9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(w9Var, "RestrictedEmoji", "📝", "100_100");
        w9Var.getImageReceiver().setAutoRepeatCount(1);
        linearLayout.addView(w9Var, w7.z5.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, this.resourceProvider));
        if (this.h) {
            i10 = R.string.WalletCurrentSecretPhrase;
        } else {
            i10 = R.string.WalletNewSecretPhrase;
        }
        textView.setText(LocaleController.getString(i10));
        TextView i13 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.t(-1, -2, 1, 32, 0, 32, 10), context);
        i13.setTextSize(1, 14.0f);
        i13.setGravity(1);
        i13.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21394z6, this.resourceProvider));
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
        ei.d dVar = new ei.d(context, this.resourceProvider, true);
        this.e = dVar;
        dVar.e();
        this.e.setText(LocaleController.getString(R.string.WalletContinue));
        this.e.setOnClickListener(new View.OnClickListener(this) {
            public final p8 f34669b;

            {
                this.f34669b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f34669b.finishFragment();
                        return;
                    default:
                        p8.U(this.f34669b);
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
        ScrollView scrollView = this.f34735b;
        if (scrollView != null) {
            scrollView.setPadding(i10, AndroidUtilities.dp(96.0f) + i11, i12, i13);
        }
        ImageView imageView = this.f34736c;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = AndroidUtilities.dp(4.0f) + i10;
            layoutParams.topMargin = AndroidUtilities.dp(12.0f) + i11;
            this.f34736c.setLayoutParams(layoutParams);
        }
    }
}
