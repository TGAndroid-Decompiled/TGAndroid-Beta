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
public class nw0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.i5 f35615a;
    public final TextView f35616b;
    public final ImageView f35617c;
    public final ImageView d;
    public boolean e;
    public dx0 f35618f;
    public org.telegram.ui.Components.o5 h;
    public Drawable f35619n;

    public nw0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.f35615a = i5Var;
        i5Var.setTypeface(AndroidUtilities.bold());
        i5Var.setTextSize(15);
        i5Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        linearLayout.addView(i5Var, w7.x5.n(-1, -2));
        TextView textView = new TextView(context);
        this.f35616b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19170y6, d6Var));
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView, w7.x5.p(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, w7.x5.d(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.f35617c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, w7.x5.d(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.M6, d6Var));
        addView(imageView2, w7.x5.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    public final void a(dx0 dx0Var, boolean z10) {
        long longValue;
        boolean isPremium = UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        ImageView imageView = this.d;
        if (isPremium && dx0Var.f32736a == 12 && dx0Var.f32737b == R.drawable.filled_premium_status2) {
            imageView.setVisibility(8);
            if (this.h == null) {
                this.h = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), 13, this, false);
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
            org.telegram.ui.Components.o5 o5Var = this.h;
            if (o5Var != null) {
                o5Var.b();
                this.h = null;
            }
        }
        this.f35618f = dx0Var;
        this.f35615a.l(dx0Var.f32738c, false);
        this.f35616b.setText(dx0Var.d);
        this.f35617c.setImageResource(dx0Var.f32737b);
        this.e = z10;
    }

    public final void b(long j3, boolean z10) {
        if (this.h == null) {
            this.h = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), 13, this, false);
            if (isAttachedToWindow()) {
                this.h.a();
            }
        }
        if (j3 == 0) {
            if (this.f35619n == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_prolfilestar).mutate();
                this.f35619n = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19118v6, false), PorterDuff.Mode.SRC_IN));
            }
            this.h.g(this.f35619n, z10);
            return;
        }
        this.h.j(j3, z10);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.f26598s) - AndroidUtilities.dp(21.0f), (getHeight() - this.h.f26598s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + this.h.f26598s) / 2);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19118v6, false)));
            this.h.draw(canvas);
        }
        if (this.e) {
            canvas.drawRect(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.h6.f18910k0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.Components.o5 o5Var = this.h;
        if (o5Var != null) {
            o5Var.a();
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        org.telegram.ui.Components.o5 o5Var = this.h;
        if (o5Var != null) {
            o5Var.b();
        }
        super.onDetachedFromWindow();
    }
}
