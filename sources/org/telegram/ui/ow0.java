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
    public final org.telegram.ui.ActionBar.j5 f36264a;
    public final TextView f36265b;
    public final ImageView f36266c;
    public final ImageView d;
    public boolean e;
    public ex0 f36267f;
    public org.telegram.ui.Components.o5 h;
    public Drawable f36268n;

    public ow0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f36264a = j5Var;
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setTextSize(15);
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        linearLayout.addView(j5Var, w7.y5.n(-1, -2));
        TextView textView = new TextView(context);
        this.f36265b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19442y6, e6Var));
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView, w7.y5.p(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, w7.y5.d(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.f36266c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, w7.y5.d(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.M6, e6Var));
        addView(imageView2, w7.y5.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    public final void a(ex0 ex0Var, boolean z10) {
        long longValue;
        boolean isPremium = UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        ImageView imageView = this.d;
        if (isPremium && ex0Var.f33341a == 12 && ex0Var.f33342b == R.drawable.filled_premium_status2) {
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
        this.f36267f = ex0Var;
        this.f36264a.l(ex0Var.f33343c, false);
        this.f36265b.setText(ex0Var.d);
        this.f36266c.setImageResource(ex0Var.f33342b);
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
            if (this.f36268n == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_prolfilestar).mutate();
                this.f36268n = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19390v6, false), PorterDuff.Mode.SRC_IN));
            }
            this.h.g(this.f36268n, z10);
            return;
        }
        this.h.j(j3, z10);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.f26974s) - AndroidUtilities.dp(21.0f), (getHeight() - this.h.f26974s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + this.h.f26974s) / 2);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19390v6, false)));
            this.h.draw(canvas);
        }
        if (this.e) {
            canvas.drawRect(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.i6.f19179k0);
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
