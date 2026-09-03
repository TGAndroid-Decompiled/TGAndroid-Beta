package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
public class gw0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.l5 f37173a;
    public final TextView f37174b;
    public final ImageView f37175c;
    public final ImageView d;
    public boolean f37176e;
    public ww0 f37177f;
    public org.telegram.ui.Components.j5 h;
    public Drawable f37178n;

    public gw0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f37173a = l5Var;
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setTextSize(15);
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        linearLayout.addView(l5Var, k7.c6.n(-1, -2));
        TextView textView = new TextView(context);
        this.f37174b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22038y6, g6Var));
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView, k7.c6.p(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, k7.c6.d(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.f37175c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, k7.c6.d(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.M6, g6Var));
        addView(imageView2, k7.c6.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    public final void a(ww0 ww0Var, boolean z4) {
        long longValue;
        boolean isPremium = UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        ImageView imageView = this.d;
        if (isPremium && ww0Var.f42867a == 12 && ww0Var.f42868b == R.drawable.filled_premium_status2) {
            imageView.setVisibility(8);
            if (this.h == null) {
                this.h = new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), 13, this, false);
                if (isAttachedToWindow()) {
                    this.h.a();
                }
            }
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
            if (emojiStatusDocumentId == null) {
                longValue = 0;
            } else {
                longValue = emojiStatusDocumentId.longValue();
            }
            b(longValue, false);
        } else {
            imageView.setVisibility(0);
            org.telegram.ui.Components.j5 j5Var = this.h;
            if (j5Var != null) {
                j5Var.b();
                this.h = null;
            }
        }
        this.f37177f = ww0Var;
        this.f37173a.l(ww0Var.f42869c, false);
        this.f37174b.setText(ww0Var.d);
        this.f37175c.setImageResource(ww0Var.f42868b);
        this.f37176e = z4;
    }

    public final void b(long j10, boolean z4) {
        if (this.h == null) {
            this.h = new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), 13, this, false);
            if (isAttachedToWindow()) {
                this.h.a();
            }
        }
        if (j10 == 0) {
            if (this.f37178n == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_prolfilestar).mutate();
                this.f37178n = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21981v6, false), PorterDuff.Mode.SRC_IN));
            }
            this.h.g(this.f37178n, z4);
            return;
        }
        this.h.j(j10, z4);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.f27991s) - AndroidUtilities.dp(21.0f), (getHeight() - this.h.f27991s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + this.h.f27991s) / 2);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21981v6, false)));
            this.h.draw(canvas);
        }
        if (this.f37176e) {
            canvas.drawRect(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f21781k0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.Components.j5 j5Var = this.h;
        if (j5Var != null) {
            j5Var.a();
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        org.telegram.ui.Components.j5 j5Var = this.h;
        if (j5Var != null) {
            j5Var.b();
        }
        super.onDetachedFromWindow();
    }
}
