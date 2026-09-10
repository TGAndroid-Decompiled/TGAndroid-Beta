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
import org.telegram.ui.Components.m90;
public final class z2 extends FrameLayout {
    public final LinearLayout f20778a;
    public final LinearLayout f20779b;
    public final org.telegram.ui.Components.x5 f20780c;
    public final m90 d;
    public final ImageView e;
    public final ImageView f20781f;
    public final org.telegram.ui.Components.w9 h;
    public final org.telegram.ui.Components.j9 f20782n;
    public boolean f20783r;

    public z2(Context context) {
        super(context);
        int i10;
        int dp;
        int i11;
        int i12;
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f));
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9(context, false);
        this.f20782n = j9Var;
        j9Var.setStepFactor(0.56790125f);
        j9Var.setVisibility(8);
        j9Var.setCount(0);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.h = w9Var;
        w9Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f20779b = linearLayout;
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
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(context);
        this.f20780c = x5Var;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        x5Var.setEllipsize(truncateAt);
        x5Var.setTextSize(1, 14.0f);
        x5Var.setTypeface(AndroidUtilities.bold());
        x5Var.setMaxLines(5);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        linearLayout.addView(x5Var, w7.a6.o(-2, -2, 0.0f, i11 | 48));
        m90 m90Var = new m90(context, null);
        this.d = m90Var;
        m90Var.setTextSize(1, 13.0f);
        m90Var.setEllipsize(truncateAt);
        m90Var.setMaxLines(5);
        linearLayout.addView(m90Var, w7.a6.o(-1, -2, 0.0f, 48));
        NotificationCenter.listenEmojiLoading(x5Var);
        NotificationCenter.listenEmojiLoading(m90Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f20778a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (LocaleController.isRTL) {
            linearLayout2.addView(linearLayout, w7.a6.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(j9Var, w7.a6.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(w9Var, w7.a6.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(w9Var, w7.a6.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(j9Var, w7.a6.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, w7.a6.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, w7.a6.c(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.arrow_newchat);
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(imageView, w7.a6.d(16, 16.0f, i12 | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f20781f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(imageView2, w7.a6.d(36, 36.0f, (LocaleController.isRTL ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
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
        org.telegram.ui.Components.j9 j9Var = this.f20782n;
        if (min != j9Var.f24315a.f23945n) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (min <= 1) {
            j9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
            j9Var.setSize(AndroidUtilities.dp(36.0f));
        } else {
            j9Var.setAvatarsTextSize(AndroidUtilities.dp(20.0f));
            j9Var.setSize(AndroidUtilities.dp(30.0f));
        }
        j9Var.setCount(min);
        if (min <= 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        j9Var.setVisibility(i11);
        ViewGroup.LayoutParams layoutParams = j9Var.getLayoutParams();
        if (min <= 1) {
            dp = AndroidUtilities.dp(36.0f);
        } else {
            dp = AndroidUtilities.dp(hc.b.B(min, 1, 18, 30));
        }
        layoutParams.width = dp;
        if (z10) {
            this.f20778a.requestLayout();
        }
        if (arrayList != null) {
            for (int i12 = 0; i12 < 3; i12++) {
                if (i12 >= arrayList.size()) {
                    tLObject = null;
                } else {
                    tLObject = (TLObject) arrayList.get(i12);
                }
                j9Var.b(i12, tLObject, i10);
            }
        }
        j9Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.f20783r = z11;
        if (TextUtils.isEmpty(charSequence)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.x5 x5Var = this.f20780c;
        x5Var.setVisibility(i10);
        x5Var.setText(charSequence);
        x5Var.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.e.setVisibility(i11);
        this.f20781f.setVisibility(8);
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
        this.f20779b.setPadding(i13, 0, i12, 0);
        d();
    }

    public final void d() {
        int i10;
        if (this.f20783r) {
            i10 = org.telegram.ui.ActionBar.j6.f18162q7;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.G6;
        }
        this.f20780c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.j6.f18306y6;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        m90 m90Var = this.d;
        m90Var.setTextColor(w02);
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.e.setColorFilter(w03, mode);
        int w04 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        ImageView imageView = this.f20781f;
        imageView.setColorFilter(w04, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.z5.c(null, org.telegram.ui.ActionBar.z5.b(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.z5.f18836a, false))));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        LinearLayout linearLayout = this.f20779b;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight(), 1073741824));
        this.f20781f.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f20782n.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.h.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.e.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
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
        this.e.setVisibility(4);
        ImageView imageView = this.f20781f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    public void setCompact(boolean z10) {
    }
}
