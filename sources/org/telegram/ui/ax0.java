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
public class ax0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.h5 f34112a;
    public final TextView f34113b;
    public final ImageView f34114c;
    public final ImageView d;
    public boolean e;
    public qx0 f34115f;
    public org.telegram.ui.Components.q5 h;
    public Drawable f34116n;

    public ax0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f34112a = h5Var;
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(15);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        linearLayout.addView(h5Var, w7.z5.n(-1, -2));
        TextView textView = new TextView(context);
        this.f34113b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19988y6, c6Var));
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView, w7.z5.p(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, w7.z5.a(-2.0f, 62.0f, 8.0f, 48.0f, 9.0f, -1, 0));
        ImageView imageView = new ImageView(context);
        this.f34114c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, w7.z5.a(28.0f, 18.0f, 12.0f, 0.0f, 0.0f, 28, 0));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.M6, c6Var));
        addView(imageView2, w7.z5.a(24.0f, 0.0f, 0.0f, 18.0f, 0.0f, 24, 21));
    }

    public final void a(qx0 qx0Var, boolean z10) {
        long longValue;
        boolean isPremium = UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        ImageView imageView = this.d;
        if (isPremium && qx0Var.f39234a == 12 && qx0Var.f39235b == R.drawable.filled_premium_status2) {
            imageView.setVisibility(8);
            if (this.h == null) {
                this.h = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), 13, this, false);
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
            org.telegram.ui.Components.q5 q5Var = this.h;
            if (q5Var != null) {
                q5Var.b();
                this.h = null;
            }
        }
        this.f34115f = qx0Var;
        this.f34112a.l(qx0Var.f39236c, false);
        this.f34113b.setText(qx0Var.d);
        this.f34114c.setImageResource(qx0Var.f39235b);
        this.e = z10;
    }

    public final void b(long j10, boolean z10) {
        if (this.h == null) {
            this.h = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), 13, this, false);
            if (isAttachedToWindow()) {
                this.h.a();
            }
        }
        if (j10 == 0) {
            if (this.f34116n == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_prolfilestar).mutate();
                this.f34116n = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19933v6, false), PorterDuff.Mode.SRC_IN));
            }
            this.h.g(this.f34116n, z10);
            return;
        }
        this.h.j(j10, z10);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.f28200s) - AndroidUtilities.dp(21.0f), (getHeight() - this.h.f28200s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + this.h.f28200s) / 2);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19933v6, false)));
            this.h.draw(canvas);
        }
        if (this.e) {
            canvas.drawRect(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.g6.f19722k0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.Components.q5 q5Var = this.h;
        if (q5Var != null) {
            q5Var.a();
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        org.telegram.ui.Components.q5 q5Var = this.h;
        if (q5Var != null) {
            q5Var.b();
        }
        super.onDetachedFromWindow();
    }
}
