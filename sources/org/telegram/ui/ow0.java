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
public class ow0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.i5 f39301a;
    public final TextView f39302b;
    public final ImageView f39303c;
    public final ImageView d;
    public boolean f39304e;
    public ex0 f39305f;
    public org.telegram.ui.Components.o5 h;
    public Drawable f39306n;

    public ow0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.f39301a = i5Var;
        i5Var.setTypeface(AndroidUtilities.bold());
        i5Var.setTextSize(15);
        i5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, d6Var));
        linearLayout.addView(i5Var, w7.z5.n(-1, -2));
        TextView textView = new TextView(context);
        this.f39302b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21214y6, d6Var));
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView, w7.z5.p(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, w7.z5.d(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.f39303c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, w7.z5.d(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.M6, d6Var));
        addView(imageView2, w7.z5.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    public final void a(ex0 ex0Var, boolean z10) {
        long longValue;
        boolean isPremium = UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        ImageView imageView = this.d;
        if (isPremium && ex0Var.f36133a == 12 && ex0Var.f36134b == R.drawable.filled_premium_status2) {
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
        this.f39305f = ex0Var;
        this.f39301a.l(ex0Var.f36135c, false);
        this.f39302b.setText(ex0Var.d);
        this.f39303c.setImageResource(ex0Var.f36134b);
        this.f39304e = z10;
    }

    public final void b(long j3, boolean z10) {
        if (this.h == null) {
            this.h = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), 13, this, false);
            if (isAttachedToWindow()) {
                this.h.a();
            }
        }
        if (j3 == 0) {
            if (this.f39306n == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_prolfilestar).mutate();
                this.f39306n = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21162v6, false), PorterDuff.Mode.SRC_IN));
            }
            this.h.g(this.f39306n, z10);
            return;
        }
        this.h.j(j3, z10);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.f29343s) - AndroidUtilities.dp(21.0f), (getHeight() - this.h.f29343s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + this.h.f29343s) / 2);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21162v6, false)));
            this.h.draw(canvas);
        }
        if (this.f39304e) {
            canvas.drawRect(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.i6.f20950k0);
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
