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
import org.telegram.messenger.vh;
import org.telegram.ui.Components.gb1;
public final class p8 extends org.telegram.ui.ActionBar.r2 {
    public final ArrayList f37106a;
    public ScrollView f37107b;
    public ImageView f37108c;
    public LinearLayout d;
    public fi.d e;
    public Runnable f37109f;
    public boolean h;

    public p8() {
        super(null);
        this.f37106a = new ArrayList();
    }

    public static void V(p8 p8Var) {
        ArrayList arrayList = p8Var.f37106a;
        if (arrayList.size() != 12 && arrayList.size() != 24) {
            return;
        }
        z9 z9Var = new z9(arrayList, new m(p8Var, 12));
        z9Var.setCurrentAccount(p8Var.currentAccount);
        p8Var.presentFragment(z9Var);
    }

    public final void W() {
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            Context context = this.d.getContext();
            ArrayList arrayList = this.f37106a;
            boolean z10 = true;
            int size = (arrayList.size() + 1) / 2;
            this.d.addView(h8.f0(0, size, context, arrayList, this.resourceProvider), gb1.s(0, -2, 1.0f, 48));
            this.d.addView(new View(context), gb1.r(10, 0));
            this.d.addView(h8.f0(size, arrayList.size(), context, arrayList, this.resourceProvider), gb1.s(0, -2, 1.0f, 48));
            fi.d dVar = this.e;
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
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, frameLayout, this.resourceProvider);
        this.fragmentView = frameLayout;
        ScrollView scrollView = new ScrollView(context);
        this.f37107b = scrollView;
        scrollView.setFillViewport(true);
        this.f37107b.setVerticalScrollBarEnabled(false);
        this.f37107b.setClipToPadding(false);
        this.f37107b.setPadding(0, AndroidUtilities.dp(96.0f), 0, 0);
        frameLayout.addView(this.f37107b, gb1.g(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        this.f37107b.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f37108c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f37108c;
        int i12 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.t(imageView2, i12, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f37108c.setImageResource(R.drawable.ic_ab_close);
        ImageView imageView3 = this.f37108c;
        int i13 = org.telegram.ui.ActionBar.y6.f23448i6;
        org.telegram.ui.ActionBar.f7.R(imageView3, org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i13, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.f7.N(i13), this.resourceProvider);
        this.f37108c.setOnClickListener(new View.OnClickListener(this) {
            public final p8 f37069b;

            {
                this.f37069b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37069b.finishFragment();
                        return;
                    default:
                        p8.V(this.f37069b);
                        return;
                }
            }
        });
        frameLayout.addView(this.f37108c, gb1.h(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        y9Var.setAspectFit(true);
        y9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(y9Var, "RestrictedEmoji", "📝", "100_100");
        y9Var.getImageReceiver().setAutoRepeatCount(1);
        linearLayout.addView(y9Var, gb1.x(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        org.telegram.ui.ActionBar.f7.V(textView, i12, this.resourceProvider);
        if (this.h) {
            i10 = R.string.WalletCurrentSecretPhrase;
        } else {
            i10 = R.string.WalletNewSecretPhrase;
        }
        textView.setText(LocaleController.getString(i10));
        TextView e = vh.e(linearLayout, textView, gb1.x(-1, -2, 1, 32, 0, 32, 10), context);
        e.setTextSize(1, 14.0f);
        e.setGravity(1);
        org.telegram.ui.ActionBar.f7.V(e, org.telegram.ui.ActionBar.y6.f23767z6, this.resourceProvider);
        if (this.h) {
            i11 = R.string.WalletCurrentSecretPhraseInfo;
        } else {
            i11 = R.string.WalletNewSecretPhraseInfo;
        }
        e.setText(LocaleController.getString(i11));
        linearLayout.addView(e, gb1.x(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.d = linearLayout2;
        linearLayout2.setOrientation(0);
        this.d.setGravity(1);
        linearLayout.addView(this.d, gb1.x(-1, -2, 1, 4, 24, 4, 0));
        linearLayout.addView(new View(context), gb1.p(1.0f, -1, 0));
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        this.e = dVar;
        dVar.f();
        this.e.setText(LocaleController.getString(R.string.WalletContinue));
        this.e.setOnClickListener(new View.OnClickListener(this) {
            public final p8 f37069b;

            {
                this.f37069b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37069b.finishFragment();
                        return;
                    default:
                        p8.V(this.f37069b);
                        return;
                }
            }
        });
        linearLayout.addView(this.e, gb1.x(-1, 48, 1, 0, 24, 0, 0));
        W();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        ScrollView scrollView = this.f37107b;
        if (scrollView != null) {
            scrollView.setPadding(i10, AndroidUtilities.dp(96.0f) + i11, i12, i13);
        }
        ImageView imageView = this.f37108c;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = AndroidUtilities.dp(4.0f) + i10;
            layoutParams.topMargin = AndroidUtilities.dp(12.0f) + i11;
            this.f37108c.setLayoutParams(layoutParams);
        }
    }
}
