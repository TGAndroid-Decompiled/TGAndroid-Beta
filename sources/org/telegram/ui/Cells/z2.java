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
import org.telegram.ui.Components.l80;
public final class z2 extends FrameLayout {
    public final LinearLayout f26020a;
    public final LinearLayout f26021b;
    public final org.telegram.ui.Components.s5 f26022c;
    public final l80 d;
    public final ImageView f26023e;
    public final ImageView f26024f;
    public final org.telegram.ui.Components.o9 h;
    public final org.telegram.ui.Components.c9 f26025n;
    public boolean f26026r;

    public z2(Context context) {
        super(context);
        int i9;
        int dp;
        int i10;
        int i11;
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f));
        org.telegram.ui.Components.c9 c9Var = new org.telegram.ui.Components.c9(context, false);
        this.f26025n = c9Var;
        c9Var.setStepFactor(0.56790125f);
        c9Var.setVisibility(8);
        c9Var.setCount(0);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.h = o9Var;
        o9Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f26021b = linearLayout;
        linearLayout.setOrientation(1);
        if (LocaleController.isRTL) {
            i9 = AndroidUtilities.dp(24.0f);
        } else {
            i9 = 0;
        }
        if (LocaleController.isRTL) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(24.0f);
        }
        linearLayout.setPadding(i9, 0, dp, 0);
        org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(context);
        this.f26022c = s5Var;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        s5Var.setEllipsize(truncateAt);
        s5Var.setTextSize(1, 14.0f);
        s5Var.setTypeface(AndroidUtilities.bold());
        s5Var.setMaxLines(5);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        linearLayout.addView(s5Var, g7.e6.o(-2, -2, 0.0f, i10 | 48));
        l80 l80Var = new l80(context, null);
        this.d = l80Var;
        l80Var.setTextSize(1, 13.0f);
        l80Var.setEllipsize(truncateAt);
        l80Var.setMaxLines(5);
        linearLayout.addView(l80Var, g7.e6.o(-1, -2, 0.0f, 48));
        NotificationCenter.listenEmojiLoading(s5Var);
        NotificationCenter.listenEmojiLoading(l80Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f26020a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (LocaleController.isRTL) {
            linearLayout2.addView(linearLayout, g7.e6.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(c9Var, g7.e6.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(o9Var, g7.e6.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(o9Var, g7.e6.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(c9Var, g7.e6.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, g7.e6.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, g7.e6.c(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.f26023e = imageView;
        imageView.setImageResource(R.drawable.arrow_newchat);
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView, g7.e6.d(16, 16.0f, i11 | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f26024f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(imageView2, g7.e6.d(36, 36.0f, (LocaleController.isRTL ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
        imageView2.setVisibility(8);
        setClipToPadding(false);
        setClipChildren(false);
        d();
    }

    public final void a(int i9, ArrayList arrayList) {
        int size;
        boolean z10;
        int i10;
        int dp;
        TLObject tLObject;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        int min = Math.min(3, size);
        org.telegram.ui.Components.c9 c9Var = this.f26025n;
        if (min != c9Var.f27425a.f27085n) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (min <= 1) {
            c9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
            c9Var.setSize(AndroidUtilities.dp(36.0f));
        } else {
            c9Var.setAvatarsTextSize(AndroidUtilities.dp(20.0f));
            c9Var.setSize(AndroidUtilities.dp(30.0f));
        }
        c9Var.setCount(min);
        if (min <= 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        c9Var.setVisibility(i10);
        ViewGroup.LayoutParams layoutParams = c9Var.getLayoutParams();
        if (min <= 1) {
            dp = AndroidUtilities.dp(36.0f);
        } else {
            dp = AndroidUtilities.dp(e2.c.e(min, 1, 18, 30));
        }
        layoutParams.width = dp;
        if (z10) {
            this.f26020a.requestLayout();
        }
        if (arrayList != null) {
            for (int i11 = 0; i11 < 3; i11++) {
                if (i11 >= arrayList.size()) {
                    tLObject = null;
                } else {
                    tLObject = (TLObject) arrayList.get(i11);
                }
                c9Var.b(i11, tLObject, i9);
            }
        }
        c9Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        int i9;
        int i10;
        int i11;
        int i12;
        this.f26026r = z11;
        if (TextUtils.isEmpty(charSequence)) {
            i9 = 8;
        } else {
            i9 = 0;
        }
        org.telegram.ui.Components.s5 s5Var = this.f26022c;
        s5Var.setVisibility(i9);
        s5Var.setText(charSequence);
        s5Var.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f26023e.setVisibility(i10);
        this.f26024f.setVisibility(8);
        if (z10) {
            i11 = AndroidUtilities.dp(24.0f);
        } else {
            i11 = 0;
        }
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i12 = i11;
        } else {
            i12 = 0;
        }
        if (z12) {
            i11 = 0;
        }
        this.f26021b.setPadding(i12, 0, i11, 0);
        d();
    }

    public final void d() {
        int i9;
        if (this.f26026r) {
            i9 = org.telegram.ui.ActionBar.f6.f23230q7;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.G6;
        }
        this.f26022c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        int i10 = org.telegram.ui.ActionBar.f6.f23369y6;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
        l80 l80Var = this.d;
        l80Var.setTextColor(w02);
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23061gc, false));
        int w03 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f26023e.setColorFilter(w03, mode);
        int w04 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
        ImageView imageView = this.f26024f;
        imageView.setColorFilter(w04, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.v5.c(null, org.telegram.ui.ActionBar.v5.b(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.v5.f23886a, false))));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        LinearLayout linearLayout = this.f26021b;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight(), 1073741824));
        this.f26024f.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f26025n.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.h.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f26023e.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
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
        this.f26023e.setVisibility(4);
        ImageView imageView = this.f26024f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    public void setCompact(boolean z10) {
    }
}
