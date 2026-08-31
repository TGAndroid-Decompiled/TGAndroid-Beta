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
import org.telegram.ui.Components.g90;
public final class z2 extends FrameLayout {
    public final LinearLayout f24481a;
    public final LinearLayout f24482b;
    public final org.telegram.ui.Components.t5 f24483c;
    public final g90 d;
    public final ImageView f24484e;
    public final ImageView f24485f;
    public final org.telegram.ui.Components.p9 h;
    public final org.telegram.ui.Components.d9 f24486n;
    public boolean f24487r;

    public z2(Context context) {
        super(context);
        int i10;
        int dp;
        int i11;
        int i12;
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f));
        org.telegram.ui.Components.d9 d9Var = new org.telegram.ui.Components.d9(context, false);
        this.f24486n = d9Var;
        d9Var.setStepFactor(0.56790125f);
        d9Var.setVisibility(8);
        d9Var.setCount(0);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.h = p9Var;
        p9Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f24482b = linearLayout;
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
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(context);
        this.f24483c = t5Var;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        t5Var.setEllipsize(truncateAt);
        t5Var.setTextSize(1, 14.0f);
        t5Var.setTypeface(AndroidUtilities.bold());
        t5Var.setMaxLines(5);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        linearLayout.addView(t5Var, k7.c6.o(-2, -2, 0.0f, i11 | 48));
        g90 g90Var = new g90(context, null);
        this.d = g90Var;
        g90Var.setTextSize(1, 13.0f);
        g90Var.setEllipsize(truncateAt);
        g90Var.setMaxLines(5);
        linearLayout.addView(g90Var, k7.c6.o(-1, -2, 0.0f, 48));
        NotificationCenter.listenEmojiLoading(t5Var);
        NotificationCenter.listenEmojiLoading(g90Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f24481a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (LocaleController.isRTL) {
            linearLayout2.addView(linearLayout, k7.c6.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(d9Var, k7.c6.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(p9Var, k7.c6.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(p9Var, k7.c6.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(d9Var, k7.c6.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, k7.c6.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, k7.c6.c(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.f24484e = imageView;
        imageView.setImageResource(R.drawable.arrow_newchat);
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(imageView, k7.c6.d(16, 16.0f, i12 | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f24485f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(imageView2, k7.c6.d(36, 36.0f, (LocaleController.isRTL ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
        imageView2.setVisibility(8);
        setClipToPadding(false);
        setClipChildren(false);
        d();
    }

    public final void a(int i10, ArrayList arrayList) {
        int size;
        boolean z4;
        int i11;
        int dp;
        TLObject tLObject;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        int min = Math.min(3, size);
        org.telegram.ui.Components.d9 d9Var = this.f24486n;
        if (min != d9Var.f26228a.f25875n) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (min <= 1) {
            d9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
            d9Var.setSize(AndroidUtilities.dp(36.0f));
        } else {
            d9Var.setAvatarsTextSize(AndroidUtilities.dp(20.0f));
            d9Var.setSize(AndroidUtilities.dp(30.0f));
        }
        d9Var.setCount(min);
        if (min <= 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        d9Var.setVisibility(i11);
        ViewGroup.LayoutParams layoutParams = d9Var.getLayoutParams();
        if (min <= 1) {
            dp = AndroidUtilities.dp(36.0f);
        } else {
            dp = AndroidUtilities.dp(e2.c.e(min, 1, 18, 30));
        }
        layoutParams.width = dp;
        if (z4) {
            this.f24481a.requestLayout();
        }
        if (arrayList != null) {
            for (int i12 = 0; i12 < 3; i12++) {
                if (i12 >= arrayList.size()) {
                    tLObject = null;
                } else {
                    tLObject = (TLObject) arrayList.get(i12);
                }
                d9Var.b(i12, tLObject, i10);
            }
        }
        d9Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z4, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.f24487r = z10;
        if (TextUtils.isEmpty(charSequence)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.t5 t5Var = this.f24483c;
        t5Var.setVisibility(i10);
        t5Var.setText(charSequence);
        t5Var.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        if (z4) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f24484e.setVisibility(i11);
        this.f24485f.setVisibility(8);
        if (z4) {
            i12 = AndroidUtilities.dp(24.0f);
        } else {
            i12 = 0;
        }
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i13 = i12;
        } else {
            i13 = 0;
        }
        if (z11) {
            i12 = 0;
        }
        this.f24482b.setPadding(i13, 0, i12, 0);
        d();
    }

    public final void d() {
        int i10;
        if (this.f24487r) {
            i10 = org.telegram.ui.ActionBar.k6.f21895q7;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.G6;
        }
        this.f24483c.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.k6.f22036y6;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i11, false);
        g90 g90Var = this.d;
        g90Var.setTextColor(w02);
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21720gc, false));
        int w03 = org.telegram.ui.ActionBar.k6.w0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f24484e.setColorFilter(w03, mode);
        int w04 = org.telegram.ui.ActionBar.k6.w0(null, i11, false);
        ImageView imageView = this.f24485f;
        imageView.setColorFilter(w04, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.a6.c(null, org.telegram.ui.ActionBar.a6.b(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.a6.f21184a, false))));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        LinearLayout linearLayout = this.f24482b;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight(), 1073741824));
        this.f24485f.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f24486n.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.h.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f24484e.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
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
        super.setOnClickListener(new y2(this, onClickListener, 0));
    }

    public void setOnCloseListener(View.OnClickListener onClickListener) {
        this.f24484e.setVisibility(4);
        ImageView imageView = this.f24485f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    public void setCompact(boolean z4) {
    }
}
