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
import org.telegram.ui.Components.y9;
public final class o7 extends org.telegram.ui.ActionBar.n2 {
    public final ArrayList f35327a;
    public ScrollView f35328b;
    public ImageView f35329c;
    public LinearLayout d;
    public ci.d f35330e;
    public Runnable f35331f;
    public boolean h;

    public o7() {
        super(null);
        this.f35327a = new ArrayList();
    }

    public static void U(o7 o7Var) {
        ArrayList arrayList = o7Var.f35327a;
        if (arrayList.size() != 12 && arrayList.size() != 24) {
            return;
        }
        y8 y8Var = new y8(arrayList, new m(o7Var, 13));
        y8Var.setCurrentAccount(o7Var.currentAccount);
        o7Var.presentFragment(y8Var);
    }

    public final void V() {
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            Context context = this.d.getContext();
            ArrayList arrayList = this.f35327a;
            boolean z10 = true;
            int size = (arrayList.size() + 1) / 2;
            this.d.addView(k7.e0(0, size, context, arrayList, this.resourceProvider), w7.x5.o(0, -2, 1.0f, 48));
            this.d.addView(new View(context), w7.x5.n(10, 0));
            this.d.addView(k7.e0(size, arrayList.size(), context, arrayList, this.resourceProvider), w7.x5.o(0, -2, 1.0f, 48));
            ci.d dVar = this.f35330e;
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
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, this.resourceProvider));
        this.fragmentView = frameLayout;
        ScrollView scrollView = new ScrollView(context);
        this.f35328b = scrollView;
        scrollView.setFillViewport(true);
        this.f35328b.setVerticalScrollBarEnabled(false);
        this.f35328b.setClipToPadding(false);
        this.f35328b.setPadding(0, AndroidUtilities.dp(96.0f), 0, 0);
        frameLayout.addView(this.f35328b, w7.x5.d(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        this.f35328b.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f35329c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f35329c;
        int i12 = org.telegram.ui.ActionBar.i6.G6;
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i12, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        this.f35329c.setImageResource(R.drawable.ic_ab_close);
        this.f35329c.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, this.resourceProvider), 3, -1));
        this.f35329c.setOnClickListener(new View.OnClickListener(this) {
            public final o7 f35288b;

            {
                this.f35288b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35288b.finishFragment();
                        return;
                    default:
                        o7.U(this.f35288b);
                        return;
                }
            }
        });
        frameLayout.addView(this.f35329c, w7.x5.a(48.0f, 4.0f, 12.0f, 0.0f, 0.0f, 48, 51));
        y9 y9Var = new y9(context);
        y9Var.setAspectFit(true);
        y9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(y9Var, "RestrictedEmoji", "📝", "100_100");
        y9Var.getImageReceiver().setAutoRepeatCount(1);
        linearLayout.addView(y9Var, w7.x5.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, this.resourceProvider));
        if (this.h) {
            i10 = R.string.WalletCurrentSecretPhrase;
        } else {
            i10 = R.string.WalletNewSecretPhrase;
        }
        textView.setText(LocaleController.getString(i10));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-1, -2, 1, 32, 0, 32, 10), context);
        h.setTextSize(1, 14.0f);
        h.setGravity(1);
        h.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21199z6, this.resourceProvider));
        if (this.h) {
            i11 = R.string.WalletCurrentSecretPhraseInfo;
        } else {
            i11 = R.string.WalletNewSecretPhraseInfo;
        }
        h.setText(LocaleController.getString(i11));
        linearLayout.addView(h, w7.x5.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.d = linearLayout2;
        linearLayout2.setOrientation(0);
        this.d.setGravity(1);
        linearLayout.addView(this.d, w7.x5.t(-1, -2, 1, 4, 24, 4, 0));
        linearLayout.addView(new View(context), w7.x5.l(1.0f, -1, 0));
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        this.f35330e = dVar;
        dVar.e();
        this.f35330e.setText(LocaleController.getString(R.string.WalletContinue));
        this.f35330e.setOnClickListener(new View.OnClickListener(this) {
            public final o7 f35288b;

            {
                this.f35288b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35288b.finishFragment();
                        return;
                    default:
                        o7.U(this.f35288b);
                        return;
                }
            }
        });
        linearLayout.addView(this.f35330e, w7.x5.t(-1, 48, 1, 0, 24, 0, 0));
        V();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        ScrollView scrollView = this.f35328b;
        if (scrollView != null) {
            scrollView.setPadding(i10, AndroidUtilities.dp(96.0f) + i11, i12, i13);
        }
        ImageView imageView = this.f35329c;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = AndroidUtilities.dp(4.0f) + i10;
            layoutParams.topMargin = AndroidUtilities.dp(12.0f) + i11;
            this.f35329c.setLayoutParams(layoutParams);
        }
    }
}
