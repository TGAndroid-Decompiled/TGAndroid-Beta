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
import org.telegram.ui.Components.x90;
public final class z2 extends FrameLayout {
    public final LinearLayout f23862a;
    public final LinearLayout f23863b;
    public final org.telegram.ui.Components.z5 f23864c;
    public final x90 d;
    public final ImageView e;
    public final ImageView f23865f;
    public final org.telegram.ui.Components.w9 h;
    public final org.telegram.ui.Components.k9 f23866n;
    public boolean f23867r;

    public z2(Context context) {
        super(context);
        int i10;
        int dp;
        int i11;
        int i12;
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context, false);
        this.f23866n = k9Var;
        k9Var.setStepFactor(0.56790125f);
        k9Var.setVisibility(8);
        k9Var.setCount(0);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.h = w9Var;
        w9Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f23863b = linearLayout;
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
        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(context);
        this.f23864c = z5Var;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        z5Var.setEllipsize(truncateAt);
        z5Var.setTextSize(1, 14.0f);
        z5Var.setTypeface(AndroidUtilities.bold());
        z5Var.setMaxLines(5);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        linearLayout.addView(z5Var, w7.z5.o(-2, -2, 0.0f, i11 | 48));
        x90 x90Var = new x90(context, null);
        this.d = x90Var;
        x90Var.setTextSize(1, 13.0f);
        x90Var.setEllipsize(truncateAt);
        x90Var.setMaxLines(5);
        linearLayout.addView(x90Var, w7.z5.o(-1, -2, 0.0f, 48));
        NotificationCenter.listenEmojiLoading(z5Var);
        NotificationCenter.listenEmojiLoading(x90Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f23862a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (LocaleController.isRTL) {
            linearLayout2.addView(linearLayout, w7.z5.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(k9Var, w7.z5.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(w9Var, w7.z5.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(w9Var, w7.z5.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(k9Var, w7.z5.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, w7.z5.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, w7.z5.c(-1.0f, -1));
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
        addView(imageView, w7.z5.d(16, 16.0f, i12 | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f23865f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(imageView2, w7.z5.d(36, 36.0f, (LocaleController.isRTL ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
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
        org.telegram.ui.Components.k9 k9Var = this.f23866n;
        if (min != k9Var.f27801a.f27459n) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (min <= 1) {
            k9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
            k9Var.setSize(AndroidUtilities.dp(36.0f));
        } else {
            k9Var.setAvatarsTextSize(AndroidUtilities.dp(20.0f));
            k9Var.setSize(AndroidUtilities.dp(30.0f));
        }
        k9Var.setCount(min);
        if (min <= 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        k9Var.setVisibility(i11);
        ViewGroup.LayoutParams layoutParams = k9Var.getLayoutParams();
        if (min <= 1) {
            dp = AndroidUtilities.dp(36.0f);
        } else {
            dp = AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(min, 1, 18, 30));
        }
        layoutParams.width = dp;
        if (z10) {
            this.f23862a.requestLayout();
        }
        if (arrayList != null) {
            for (int i12 = 0; i12 < 3; i12++) {
                if (i12 >= arrayList.size()) {
                    tLObject = null;
                } else {
                    tLObject = (TLObject) arrayList.get(i12);
                }
                k9Var.b(i12, tLObject, i10);
            }
        }
        k9Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.f23867r = z11;
        if (TextUtils.isEmpty(charSequence)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.z5 z5Var = this.f23864c;
        z5Var.setVisibility(i10);
        z5Var.setText(charSequence);
        z5Var.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.e.setVisibility(i11);
        this.f23865f.setVisibility(8);
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
        this.f23863b.setPadding(i13, 0, i12, 0);
        d();
    }

    public final void d() {
        int i10;
        if (this.f23867r) {
            i10 = org.telegram.ui.ActionBar.h6.f21224q7;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.G6;
        }
        this.f23864c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.h6.f21374y6;
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
        x90 x90Var = this.d;
        x90Var.setTextColor(x02);
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21045gc, false));
        int x03 = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.e.setColorFilter(x03, mode);
        int x04 = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
        ImageView imageView = this.f23865f;
        imageView.setColorFilter(x04, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.x5.c(null, org.telegram.ui.ActionBar.x5.b(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.x5.f21886a, false))));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        LinearLayout linearLayout = this.f23863b;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight(), 1073741824));
        this.f23865f.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f23866n.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
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
        ImageView imageView = this.f23865f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    public void setCompact(boolean z10) {
    }
}
