package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
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
    public final org.telegram.ui.ActionBar.b6 f39788a;
    public final TextView f39789b;
    public final ImageView f39790c;
    public final ImageView d;
    public boolean e;
    public ww0 f39791f;
    public org.telegram.ui.Components.r5 h;
    public Drawable f39792n;

    public gw0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.f39788a = b6Var;
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setTextSize(15);
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        linearLayout.addView(b6Var, org.telegram.ui.Components.gb1.r(-1, -2));
        TextView textView = new TextView(context);
        this.f39789b = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23746y6, u6Var);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView, org.telegram.ui.Components.gb1.t(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.f39790c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, org.telegram.ui.Components.gb1.h(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.M6, u6Var, PorterDuff.Mode.SRC_ATOP);
        addView(imageView2, org.telegram.ui.Components.gb1.h(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    public final void a(ww0 ww0Var, boolean z10) {
        long longValue;
        boolean isPremium = UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        ImageView imageView = this.d;
        if (isPremium && ww0Var.f45563a == 12 && ww0Var.f45564b == R.drawable.filled_premium_status2) {
            imageView.setVisibility(8);
            if (this.h == null) {
                this.h = new org.telegram.ui.Components.r5(AndroidUtilities.dp(24.0f), 13, this, false);
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
            org.telegram.ui.Components.r5 r5Var = this.h;
            if (r5Var != null) {
                r5Var.b();
                this.h = null;
            }
        }
        this.f39791f = ww0Var;
        this.f39788a.l(ww0Var.f45565c, false);
        this.f39789b.setText(ww0Var.d);
        this.f39790c.setImageResource(ww0Var.f45564b);
        this.e = z10;
    }

    public final void b(long j10, boolean z10) {
        if (this.h == null) {
            this.h = new org.telegram.ui.Components.r5(AndroidUtilities.dp(24.0f), 13, this, false);
            if (isAttachedToWindow()) {
                this.h.a();
            }
        }
        if (j10 == 0) {
            if (this.f39792n == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_prolfilestar).mutate();
                this.f39792n = mutate;
                org.telegram.ui.ActionBar.f7.y(this, mutate, org.telegram.ui.ActionBar.y6.f23690v6, null, PorterDuff.Mode.SRC_IN);
            }
            this.h.g(this.f39792n, z10);
            return;
        }
        this.h.j(j10, z10);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.f32097s) - AndroidUtilities.dp(21.0f), (getHeight() - this.h.f32097s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + this.h.f32097s) / 2);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23690v6, false)));
            this.h.draw(canvas);
        }
        if (this.e) {
            canvas.drawRect(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.y6.f23476k0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.Components.r5 r5Var = this.h;
        if (r5Var != null) {
            r5Var.a();
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        org.telegram.ui.Components.r5 r5Var = this.h;
        if (r5Var != null) {
            r5Var.b();
        }
        super.onDetachedFromWindow();
    }
}
