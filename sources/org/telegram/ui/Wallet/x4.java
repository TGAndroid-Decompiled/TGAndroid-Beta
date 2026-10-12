package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.TelegramQRCodeWriter;
import org.telegram.ui.Components.es;
import org.telegram.ui.fi1;
public final class x4 extends FrameLayout {
    public final TextView f33848a;
    public final FrameLayout f33849b;
    public final FrameLayout f33850c;
    public final FrameLayout d;
    public p0 e;
    public boolean f33851f;
    public boolean h;
    public ValueAnimator f33852n;

    public x4(Context context, String str) {
        super(context);
        Bitmap bitmap;
        char c10;
        addView(new o4(context, str), w7.a6.e(-1, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33849b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(20.0f), -1));
        frameLayout.setCameraDistance(AndroidUtilities.dp(8000.0f));
        addView(frameLayout, w7.a6.a(244.0f, 0.0f, 22.0f, 0.0f, 0.0f, 212, 49));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f33850c = frameLayout2;
        frameLayout.addView(frameLayout2, w7.a6.d(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, w7.a6.a(164.0f, 0.0f, 24.0f, 0.0f, 0.0f, 164, 49));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(dc.b.f6465a, ic.c.H);
            hashMap.put(dc.b.f6467c, 0);
            TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
            telegramQRCodeWriter.setCenterDrawable(context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
            bitmap = telegramQRCodeWriter.encode("ton://transfer/".concat(str), 768, 768, hashMap, null);
        } catch (Exception e) {
            FileLog.e(e);
            bitmap = null;
        }
        imageView.setImageBitmap(bitmap);
        frameLayout3.addView(imageView, w7.a6.d(-1.0f, -1));
        TextView textView = new TextView(context);
        this.f33848a = textView;
        textView.setText(LocaleController.getString(R.string.WalletCopyAddress));
        textView.setTextColor(-15556886);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int dp = AndroidUtilities.dp(18.0f);
        textView.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, -984578, -1903620, -1903620));
        Drawable mutate = context.getResources().getDrawable(R.drawable.wallet_copy).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        mutate.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView.setCompoundDrawables(mutate, null, null, null);
        w7.c6.a(textView);
        this.f33850c.addView(textView, w7.a6.a(28.0f, 0.0f, 202.0f, 0.0f, 0.0f, -2, 49));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.d = frameLayout4;
        frameLayout4.setVisibility(4);
        frameLayout4.setRotationY(180.0f);
        this.f33849b.addView(frameLayout4, w7.a6.d(-1.0f, -1));
        TextView textView2 = new TextView(context);
        String replace = str.replace(" ", "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = 0;
        int i11 = 0;
        while (i10 < replace.length()) {
            if (i11 > 0) {
                if (i11 % 3 == 0) {
                    c10 = '\n';
                } else {
                    c10 = ' ';
                }
                spannableStringBuilder.append(c10);
            }
            int length = spannableStringBuilder.length();
            int i12 = i10 + 4;
            spannableStringBuilder.append((CharSequence) replace, i10, Math.min(i12, replace.length()));
            if ((i11 & 1) != 0) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(-7434605), length, spannableStringBuilder.length(), 33);
            }
            i11++;
            i10 = i12;
        }
        textView2.setText(spannableStringBuilder);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(1, 18.0f);
        textView2.setTypeface(z4.h0(context));
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setMaxLines(4);
        textView2.setLineSpacing(0.0f, 1.0f);
        TextView h = org.telegram.ui.Cells.d0.h(this.d, textView2, w7.a6.a(112.0f, 8.0f, 32.0f, 8.0f, 0.0f, -1, 55), context);
        h.setText(LocaleController.getString(R.string.WalletAddressCopiedShort));
        h.setTextColor(-15556886);
        h.setTextSize(1, 14.0f);
        h.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        h.setGravity(17);
        h.setCompoundDrawablePadding(AndroidUtilities.dp(3.0f));
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.msg_text_check).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        mutate2.setBounds(0, 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        h.setCompoundDrawables(mutate2, null, null, null);
        TextView h10 = org.telegram.ui.Cells.d0.h(this.d, h, w7.a6.a(28.0f, 0.0f, 149.0f, 0.0f, 0.0f, -2, 49), context);
        h10.setText(LocaleController.getString(R.string.WalletShowMyQR));
        h10.setTextColor(-15556886);
        h10.setTextSize(1, 14.0f);
        h10.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        h10.setGravity(17);
        h10.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int dp2 = AndroidUtilities.dp(18.0f);
        h10.setBackground(org.telegram.ui.ActionBar.g6.j0(dp2, dp2, dp2, dp2, -984578, -1903620, -1903620));
        w7.c6.a(h10);
        this.d.addView(h10, w7.a6.a(28.0f, 0.0f, 202.0f, 0.0f, 0.0f, -2, 49));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final x4 f33796b;

            {
                this.f33796b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        x4 x4Var = this.f33796b;
                        if (!x4Var.f33851f && !x4Var.h) {
                            p0 p0Var = x4Var.e;
                            if (p0Var != null) {
                                p0Var.run();
                            }
                            x4Var.a(true);
                            return;
                        }
                        return;
                    default:
                        this.f33796b.a(false);
                        return;
                }
            }
        };
        frameLayout3.setOnClickListener(onClickListener);
        this.f33848a.setOnClickListener(onClickListener);
        h10.setOnClickListener(new View.OnClickListener(this) {
            public final x4 f33796b;

            {
                this.f33796b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        x4 x4Var = this.f33796b;
                        if (!x4Var.f33851f && !x4Var.h) {
                            p0 p0Var = x4Var.e;
                            if (p0Var != null) {
                                p0Var.run();
                            }
                            x4Var.a(true);
                            return;
                        }
                        return;
                    default:
                        this.f33796b.a(false);
                        return;
                }
            }
        });
    }

    public final void a(boolean z10) {
        float f7;
        if (this.f33851f != z10 && !this.h) {
            this.h = true;
            this.f33851f = z10;
            FrameLayout frameLayout = this.f33849b;
            frameLayout.setLayerType(2, null);
            float rotationY = frameLayout.getRotationY();
            if (z10) {
                f7 = 180.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(rotationY, f7);
            this.f33852n = ofFloat;
            ofFloat.setDuration(420L);
            this.f33852n.setInterpolator(es.h);
            this.f33852n.addUpdateListener(new s2(this, 3));
            this.f33852n.addListener(new fi1(this, 3));
            this.f33852n.start();
        }
    }
}
