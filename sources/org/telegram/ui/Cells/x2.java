package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.p80;

public final class x2 extends FrameLayout {

    public final LinearLayout f25925a;

    public final LinearLayout f25926b;

    public final org.telegram.ui.Components.s5 f25927c;
    public final p80 d;

    public final ImageView f25928e;

    public final ImageView f25929f;
    public final org.telegram.ui.Components.n9 h;

    public final org.telegram.ui.Components.b9 f25930n;

    public boolean f25931r;

    public x2(Context context) {
        super(context);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f));
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9(context, false);
        this.f25930n = b9Var;
        b9Var.setStepFactor(0.56790125f);
        b9Var.setVisibility(8);
        b9Var.setCount(0);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.h = n9Var;
        n9Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f25926b = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), 0);
        org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(context);
        this.f25927c = s5Var;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        s5Var.setEllipsize(truncateAt);
        s5Var.setTextSize(1, 14.0f);
        s5Var.setTypeface(AndroidUtilities.bold());
        s5Var.setMaxLines(5);
        linearLayout.addView(s5Var, h7.z5.o(-2, -2, 0.0f, (LocaleController.isRTL ? 5 : 3) | 48));
        p80 p80Var = new p80(context, null);
        this.d = p80Var;
        p80Var.setTextSize(1, 13.0f);
        p80Var.setEllipsize(truncateAt);
        p80Var.setMaxLines(5);
        linearLayout.addView(p80Var, h7.z5.o(-1, -2, 0.0f, 48));
        NotificationCenter.listenEmojiLoading(s5Var);
        NotificationCenter.listenEmojiLoading(p80Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f25925a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (LocaleController.isRTL) {
            linearLayout2.addView(linearLayout, h7.z5.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(b9Var, h7.z5.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(n9Var, h7.z5.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(n9Var, h7.z5.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(b9Var, h7.z5.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, h7.z5.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, h7.z5.c(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.f25928e = imageView;
        imageView.setImageResource(R.drawable.arrow_newchat);
        addView(imageView, h7.z5.d(16, 16.0f, (LocaleController.isRTL ? 3 : 5) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f25929f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(imageView2, h7.z5.d(36, 36.0f, (LocaleController.isRTL ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
        imageView2.setVisibility(8);
        setClipToPadding(false);
        setClipChildren(false);
        d();
    }

    public final void a(int i10, ArrayList arrayList) {
        int iMin = Math.min(3, arrayList == null ? 0 : arrayList.size());
        org.telegram.ui.Components.b9 b9Var = this.f25930n;
        boolean z10 = iMin != b9Var.f27049a.f26673n;
        if (iMin <= 1) {
            b9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
            b9Var.setSize(AndroidUtilities.dp(36.0f));
        } else {
            b9Var.setAvatarsTextSize(AndroidUtilities.dp(20.0f));
            b9Var.setSize(AndroidUtilities.dp(30.0f));
        }
        b9Var.setCount(iMin);
        b9Var.setVisibility(iMin <= 0 ? 8 : 0);
        b9Var.getLayoutParams().width = iMin <= 1 ? AndroidUtilities.dp(36.0f) : AndroidUtilities.dp(i0.a.e(iMin, 1, 18, 30));
        if (z10) {
            this.f25925a.requestLayout();
        }
        if (arrayList != null) {
            int i11 = 0;
            while (i11 < 3) {
                b9Var.b(i11, i11 >= arrayList.size() ? null : (TLObject) arrayList.get(i11), i10);
                i11++;
            }
        }
        b9Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.f25931r = z11;
        int i10 = TextUtils.isEmpty(charSequence) ? 8 : 0;
        org.telegram.ui.Components.s5 s5Var = this.f25927c;
        s5Var.setVisibility(i10);
        s5Var.setText(charSequence);
        s5Var.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        this.f25928e.setVisibility(z10 ? 0 : 8);
        this.f25929f.setVisibility(8);
        int iDp = z10 ? AndroidUtilities.dp(24.0f) : 0;
        boolean z12 = LocaleController.isRTL;
        int i11 = z12 ? iDp : 0;
        if (z12) {
            iDp = 0;
        }
        this.f25926b.setPadding(i11, 0, iDp, 0);
        d();
    }

    public final void d() {
        this.f25927c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, this.f25931r ? org.telegram.ui.ActionBar.g6.f23284q7 : org.telegram.ui.ActionBar.g6.G6, false));
        int i10 = org.telegram.ui.ActionBar.g6.f23423y6;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        p80 p80Var = this.d;
        p80Var.setTextColor(iW0);
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gc, false));
        int iW1 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f25928e.setColorFilter(iW1, mode);
        int iW2 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        ImageView imageView = this.f25929f;
        imageView.setColorFilter(iW2, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.w5.c(null, org.telegram.ui.ActionBar.w5.b(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.w5.f23936a, false))));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        LinearLayout linearLayout = this.f25926b;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight(), 1073741824));
        this.f25929f.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f25930n.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.h.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f25928e.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
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
        super.setOnClickListener(new w2(this, onClickListener, 0));
    }

    public void setOnCloseListener(View.OnClickListener onClickListener) {
        this.f25928e.setVisibility(4);
        ImageView imageView = this.f25929f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    public void setCompact(boolean z10) {
    }
}
