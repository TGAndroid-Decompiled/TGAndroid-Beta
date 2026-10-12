package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ia0;
public final class a3 extends FrameLayout {
    public final LinearLayout f21558a;
    public final LinearLayout f21559b;
    public final org.telegram.ui.Components.a6 f21560c;
    public final ia0 d;
    public final ImageView f21561e;
    public final ImageView f21562f;
    public final org.telegram.ui.Components.y9 h;
    public final org.telegram.ui.Components.m9 f21563n;
    public boolean f21564r;

    public a3(Context context) {
        super(context);
        int i10;
        int dp;
        int i11;
        int i12;
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f));
        org.telegram.ui.Components.m9 m9Var = new org.telegram.ui.Components.m9(context, false);
        this.f21563n = m9Var;
        m9Var.setStepFactor(0.56790125f);
        m9Var.setVisibility(8);
        m9Var.setCount(0);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.h = y9Var;
        y9Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f21559b = linearLayout;
        linearLayout.setOrientation(1);
        if (LocaleController.isRTL) {
            i10 = AndroidUtilities.dp(24.0f);
        } else {
            i10 = 0;
        }
        if (LocaleController.isRTL) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(24.0f);
        }
        linearLayout.setPadding(i10, 0, dp, 0);
        org.telegram.ui.Components.a6 a6Var = new org.telegram.ui.Components.a6(context);
        this.f21560c = a6Var;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        a6Var.setEllipsize(truncateAt);
        a6Var.setTextSize(1, 14.0f);
        a6Var.setTypeface(AndroidUtilities.bold());
        a6Var.setMaxLines(5);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        linearLayout.addView(a6Var, w7.w5.o(-2, -2, 0.0f, i11 | 48));
        ia0 ia0Var = new ia0(context, null);
        this.d = ia0Var;
        ia0Var.setTextSize(1, 13.0f);
        ia0Var.setEllipsize(truncateAt);
        ia0Var.setMaxLines(5);
        linearLayout.addView(ia0Var, w7.w5.o(-1, -2, 0.0f, 48));
        NotificationCenter.listenEmojiLoading(a6Var);
        NotificationCenter.listenEmojiLoading(ia0Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f21558a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (LocaleController.isRTL) {
            linearLayout2.addView(linearLayout, w7.w5.a(-1.0f, 7.0f, 0.0f, 7.0f, 0.0f, -1, 16));
            linearLayout2.addView(m9Var, w7.w5.a(-1.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0, 16));
            linearLayout2.addView(y9Var, w7.w5.a(36.0f, 0.0f, 0.0f, -2.0f, 0.0f, 36, 21));
        } else {
            linearLayout2.addView(y9Var, w7.w5.a(36.0f, -2.0f, 0.0f, 0.0f, 0.0f, 36, 19));
            linearLayout2.addView(m9Var, w7.w5.a(-1.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0, 16));
            linearLayout2.addView(linearLayout, w7.w5.a(-1.0f, 7.0f, 0.0f, 7.0f, 0.0f, -1, 16));
        }
        addView(linearLayout2, w7.w5.d(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.f21561e = imageView;
        imageView.setImageResource(R.drawable.arrow_newchat);
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(imageView, w7.w5.a(16.0f, 4.0f, 0.0f, 4.0f, 0.0f, 16, i12 | 16));
        ImageView imageView2 = new ImageView(context);
        this.f21562f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(imageView2, w7.w5.a(36.0f, -4.0f, 0.0f, -4.0f, 0.0f, 36, (LocaleController.isRTL ? 3 : 5) | 16));
        imageView2.setVisibility(8);
        setClipToPadding(false);
        setClipChildren(false);
        d();
    }

    public final void a(int i10, ArrayList arrayList) {
        int size;
        boolean z10;
        int i11;
        int dp;
        TLObject tLObject;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        int min = Math.min(3, size);
        org.telegram.ui.Components.m9 m9Var = this.f21563n;
        if (min != m9Var.f28440a.f28105n) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (min <= 1) {
            m9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
            m9Var.setSize(AndroidUtilities.dp(36.0f));
        } else {
            m9Var.setAvatarsTextSize(AndroidUtilities.dp(20.0f));
            m9Var.setSize(AndroidUtilities.dp(30.0f));
        }
        m9Var.setCount(min);
        if (min <= 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        m9Var.setVisibility(i11);
        ViewGroup.LayoutParams layoutParams = m9Var.getLayoutParams();
        if (min <= 1) {
            dp = AndroidUtilities.dp(36.0f);
        } else {
            dp = AndroidUtilities.dp(hg.c.g(min, 1, 18, 30));
        }
        layoutParams.width = dp;
        if (z10) {
            this.f21558a.requestLayout();
        }
        if (arrayList != null) {
            for (int i12 = 0; i12 < 3; i12++) {
                if (i12 >= arrayList.size()) {
                    tLObject = null;
                } else {
                    tLObject = (TLObject) arrayList.get(i12);
                }
                m9Var.b(i12, tLObject, i10);
            }
        }
        m9Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.f21564r = z11;
        if (TextUtils.isEmpty(charSequence)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.a6 a6Var = this.f21560c;
        a6Var.setVisibility(i10);
        a6Var.setText(charSequence);
        a6Var.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f21561e.setVisibility(i11);
        this.f21562f.setVisibility(8);
        if (z10) {
            i12 = AndroidUtilities.dp(24.0f);
        } else {
            i12 = 0;
        }
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i13 = i12;
        } else {
            i13 = 0;
        }
        if (z12) {
            i12 = 0;
        }
        this.f21559b.setPadding(i13, 0, i12, 0);
        d();
    }

    public final void d() {
        int i10;
        if (this.f21564r) {
            i10 = org.telegram.ui.ActionBar.h6.f20800q7;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.G6;
        }
        this.f21560c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.h6.f20946y6;
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
        ia0 ia0Var = this.d;
        ia0Var.setTextColor(x02);
        ia0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gc, false));
        int x03 = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f21561e.setColorFilter(x03, mode);
        int x04 = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
        ImageView imageView = this.f21562f;
        imageView.setColorFilter(x04, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.w5.c(null, org.telegram.ui.ActionBar.w5.b(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.w5.f21429a, false))));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        LinearLayout linearLayout = this.f21559b;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight(), 1073741824));
        this.f21562f.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f21563n.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.h.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f21561e.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new z2(this, onClickListener, 0));
    }

    public void setOnCloseListener(View.OnClickListener onClickListener) {
        this.f21561e.setVisibility(4);
        ImageView imageView = this.f21562f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    public void setCompact(boolean z10) {
    }
}
