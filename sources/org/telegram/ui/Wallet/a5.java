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
import org.telegram.ui.Components.is;
public final class a5 extends FrameLayout {
    public final TextView f34655a;
    public final FrameLayout f34656b;
    public final FrameLayout f34657c;
    public final FrameLayout d;
    public r0 f34658e;
    public boolean f34659f;
    public boolean h;
    public ValueAnimator f34660n;

    public a5(Context context, String str) {
        super(context);
        Bitmap bitmap;
        char c10;
        addView(new q4(context, str), w7.x5.e(-1, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34656b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(20.0f), -1));
        frameLayout.setCameraDistance(AndroidUtilities.dp(8000.0f));
        addView(frameLayout, w7.x5.a(244.0f, 0.0f, 22.0f, 0.0f, 0.0f, 212, 49));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f34657c = frameLayout2;
        frameLayout.addView(frameLayout2, w7.x5.d(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, w7.x5.a(164.0f, 0.0f, 24.0f, 0.0f, 0.0f, 164, 49));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(cc.b.f4581a, hc.c.H);
            hashMap.put(cc.b.f4583c, 0);
            TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
            telegramQRCodeWriter.setCenterDrawable(context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
            bitmap = telegramQRCodeWriter.encode("ton://transfer/".concat(str), 768, 768, hashMap, null);
        } catch (Exception e7) {
            FileLog.e(e7);
            bitmap = null;
        }
        imageView.setImageBitmap(bitmap);
        frameLayout3.addView(imageView, w7.x5.d(-1.0f, -1));
        TextView textView = new TextView(context);
        this.f34655a = textView;
        textView.setText(LocaleController.getString(R.string.WalletCopyAddress));
        textView.setTextColor(-15556886);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int dp = AndroidUtilities.dp(18.0f);
        textView.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, -984578, -1903620, -1903620));
        Drawable mutate = context.getResources().getDrawable(R.drawable.wallet_copy).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        mutate.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView.setCompoundDrawables(mutate, null, null, null);
        w7.z5.a(textView);
        this.f34657c.addView(textView, w7.x5.a(28.0f, 0.0f, 202.0f, 0.0f, 0.0f, -2, 49));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.d = frameLayout4;
        frameLayout4.setVisibility(4);
        frameLayout4.setRotationY(180.0f);
        this.f34656b.addView(frameLayout4, w7.x5.d(-1.0f, -1));
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
        textView2.setTypeface(c5.h0(context));
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setMaxLines(4);
        textView2.setLineSpacing(0.0f, 1.0f);
        TextView g10 = org.telegram.ui.Cells.c1.g(this.d, textView2, w7.x5.a(112.0f, 8.0f, 32.0f, 8.0f, 0.0f, -1, 55), context);
        g10.setText(LocaleController.getString(R.string.WalletAddressCopiedShort));
        g10.setTextColor(-15556886);
        g10.setTextSize(1, 14.0f);
        g10.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        g10.setGravity(17);
        g10.setCompoundDrawablePadding(AndroidUtilities.dp(3.0f));
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.msg_text_check).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        mutate2.setBounds(0, 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        g10.setCompoundDrawables(mutate2, null, null, null);
        TextView g11 = org.telegram.ui.Cells.c1.g(this.d, g10, w7.x5.a(28.0f, 0.0f, 149.0f, 0.0f, 0.0f, -2, 49), context);
        g11.setText(LocaleController.getString(R.string.WalletShowMyQR));
        g11.setTextColor(-15556886);
        g11.setTextSize(1, 14.0f);
        g11.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        g11.setGravity(17);
        g11.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int dp2 = AndroidUtilities.dp(18.0f);
        g11.setBackground(org.telegram.ui.ActionBar.h6.j0(dp2, dp2, dp2, dp2, -984578, -1903620, -1903620));
        w7.z5.a(g11);
        this.d.addView(g11, w7.x5.a(28.0f, 0.0f, 202.0f, 0.0f, 0.0f, -2, 49));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final a5 f35733b;

            {
                this.f35733b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        a5 a5Var = this.f35733b;
                        if (!a5Var.f34659f && !a5Var.h) {
                            r0 r0Var = a5Var.f34658e;
                            if (r0Var != null) {
                                r0Var.run();
                            }
                            a5Var.a(true);
                            return;
                        }
                        return;
                    default:
                        this.f35733b.a(false);
                        return;
                }
            }
        };
        frameLayout3.setOnClickListener(onClickListener);
        this.f34655a.setOnClickListener(onClickListener);
        g11.setOnClickListener(new View.OnClickListener(this) {
            public final a5 f35733b;

            {
                this.f35733b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        a5 a5Var = this.f35733b;
                        if (!a5Var.f34659f && !a5Var.h) {
                            r0 r0Var = a5Var.f34658e;
                            if (r0Var != null) {
                                r0Var.run();
                            }
                            a5Var.a(true);
                            return;
                        }
                        return;
                    default:
                        this.f35733b.a(false);
                        return;
                }
            }
        });
    }

    public final void a(boolean z10) {
        float f7;
        if (this.f34659f != z10 && !this.h) {
            this.h = true;
            this.f34659f = z10;
            FrameLayout frameLayout = this.f34656b;
            frameLayout.setLayerType(2, null);
            float rotationY = frameLayout.getRotationY();
            if (z10) {
                f7 = 180.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(rotationY, f7);
            this.f34660n = ofFloat;
            ofFloat.setDuration(420L);
            this.f34660n.setInterpolator(is.h);
            this.f34660n.addUpdateListener(new u2(this, 3));
            this.f34660n.addListener(new z4(this, 0));
            this.f34660n.start();
        }
    }
}
