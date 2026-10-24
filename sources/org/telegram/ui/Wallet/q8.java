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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.tl;
public final class q8 extends org.telegram.ui.ActionBar.o2 {
    public final ArrayList f35081a;
    public ScrollView f35082b;
    public ImageView f35083c;
    public LinearLayout d;
    public ei.d e;
    public Runnable f35084f;
    public boolean h;

    public q8() {
        super(null);
        this.f35081a = new ArrayList();
    }

    public static void U(q8 q8Var) {
        ArrayList arrayList = q8Var.f35081a;
        if (arrayList.size() != 12 && arrayList.size() != 24) {
            return;
        }
        aa aaVar = new aa(arrayList, new m(q8Var, 12));
        aaVar.setCurrentAccount(q8Var.currentAccount);
        q8Var.presentFragment(aaVar);
    }

    public final void V() {
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            Context context = this.d.getContext();
            ArrayList arrayList = this.f35081a;
            boolean z10 = true;
            int size = (arrayList.size() + 1) / 2;
            this.d.addView(i8.e0(0, size, context, arrayList, this.resourceProvider), w7.z5.o(0, -2, 1.0f, 48));
            this.d.addView(new View(context), w7.z5.n(10, 0));
            this.d.addView(i8.e0(size, arrayList.size(), context, arrayList, this.resourceProvider), w7.z5.o(0, -2, 1.0f, 48));
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
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, frameLayout, this.resourceProvider);
        this.fragmentView = frameLayout;
        ScrollView scrollView = new ScrollView(context);
        this.f35082b = scrollView;
        scrollView.setFillViewport(true);
        this.f35082b.setVerticalScrollBarEnabled(false);
        this.f35082b.setClipToPadding(false);
        this.f35082b.setPadding(0, AndroidUtilities.dp(96.0f), 0, 0);
        frameLayout.addView(this.f35082b, w7.z5.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        this.f35082b.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f35083c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f35083c;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView2, i12, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f35083c.setImageResource(R.drawable.ic_ab_close);
        ImageView imageView3 = this.f35083c;
        int i13 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.ActionBar.r6.S(imageView3, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i13, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.r6.O(i13), this.resourceProvider);
        this.f35083c.setOnClickListener(new View.OnClickListener(this) {
            public final q8 f35052b;

            {
                this.f35052b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35052b.finishFragment();
                        return;
                    default:
                        q8.U(this.f35052b);
                        return;
                }
            }
        });
        frameLayout.addView(this.f35083c, w7.z5.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        u9Var.setAspectFit(true);
        u9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(u9Var, "RestrictedEmoji", "📝", "100_100");
        u9Var.getImageReceiver().setAutoRepeatCount(1);
        linearLayout.addView(u9Var, w7.z5.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        org.telegram.ui.ActionBar.r6.W(textView, i12, this.resourceProvider);
        if (this.h) {
            i10 = R.string.WalletCurrentSecretPhrase;
        } else {
            i10 = R.string.WalletNewSecretPhrase;
        }
        textView.setText(LocaleController.getString(i10));
        TextView f7 = tl.f(linearLayout, textView, w7.z5.t(-1, -2, 1, 32, 0, 32, 10), context);
        f7.setTextSize(1, 14.0f);
        f7.setGravity(1);
        org.telegram.ui.ActionBar.r6.W(f7, org.telegram.ui.ActionBar.k6.f21589z6, this.resourceProvider);
        if (this.h) {
            i11 = R.string.WalletCurrentSecretPhraseInfo;
        } else {
            i11 = R.string.WalletNewSecretPhraseInfo;
        }
        f7.setText(LocaleController.getString(i11));
        linearLayout.addView(f7, w7.z5.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.d = linearLayout2;
        linearLayout2.setOrientation(0);
        this.d.setGravity(1);
        linearLayout.addView(this.d, w7.z5.t(-1, -2, 1, 4, 24, 4, 0));
        linearLayout.addView(new View(context), w7.z5.l(1.0f, -1, 0));
        ei.d dVar = new ei.d(context, this.resourceProvider, true);
        this.e = dVar;
        dVar.f();
        this.e.setText(LocaleController.getString(R.string.WalletContinue));
        this.e.setOnClickListener(new View.OnClickListener(this) {
            public final q8 f35052b;

            {
                this.f35052b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35052b.finishFragment();
                        return;
                    default:
                        q8.U(this.f35052b);
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
        ScrollView scrollView = this.f35082b;
        if (scrollView != null) {
            scrollView.setPadding(i10, AndroidUtilities.dp(96.0f) + i11, i12, i13);
        }
        ImageView imageView = this.f35083c;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = AndroidUtilities.dp(4.0f) + i10;
            layoutParams.topMargin = AndroidUtilities.dp(12.0f) + i11;
            this.f35083c.setLayoutParams(layoutParams);
        }
    }
}
