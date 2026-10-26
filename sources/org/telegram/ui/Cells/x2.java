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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.z90;
public final class x2 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final LinearLayout f25687a;
    public final LinearLayout f25688b;
    public final org.telegram.ui.Components.b6 f25689c;
    public final z90 d;
    public final ImageView e;
    public final ImageView f25690f;
    public final org.telegram.ui.Components.y9 h;
    public final org.telegram.ui.Components.m9 f25691n;
    public boolean f25692r;

    public x2(Context context) {
        super(context);
        int i10;
        int dp;
        int i11;
        int i12;
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f));
        org.telegram.ui.Components.m9 m9Var = new org.telegram.ui.Components.m9(context, false);
        this.f25691n = m9Var;
        m9Var.setStepFactor(0.56790125f);
        m9Var.setVisibility(8);
        m9Var.setCount(0);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.h = y9Var;
        y9Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f25688b = linearLayout;
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
        org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(context);
        this.f25689c = b6Var;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        b6Var.setEllipsize(truncateAt);
        b6Var.setTextSize(1, 14.0f);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setMaxLines(5);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        linearLayout.addView(b6Var, gb1.s(-2, -2, 0.0f, i11 | 48));
        z90 z90Var = new z90(context, null);
        this.d = z90Var;
        z90Var.setTextSize(1, 13.0f);
        z90Var.setEllipsize(truncateAt);
        z90Var.setMaxLines(5);
        linearLayout.addView(z90Var, gb1.s(-1, -2, 0.0f, 48));
        NotificationCenter.listenEmojiLoading(b6Var);
        NotificationCenter.listenEmojiLoading(z90Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f25687a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (LocaleController.isRTL) {
            linearLayout2.addView(linearLayout, gb1.h(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(m9Var, gb1.h(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(y9Var, gb1.h(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(y9Var, gb1.h(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(m9Var, gb1.h(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, gb1.h(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, gb1.g(-1.0f, -1));
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
        addView(imageView, gb1.h(16, 16.0f, i12 | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f25690f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(imageView2, gb1.h(36, 36.0f, (LocaleController.isRTL ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
        imageView2.setVisibility(8);
        setClipToPadding(false);
        setClipChildren(false);
        updateColors();
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
        org.telegram.ui.Components.m9 m9Var = this.f25691n;
        if (min != m9Var.f30459a.f30119n) {
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
            dp = AndroidUtilities.dp(c3.h0.w(min, 1, 18, 30));
        }
        layoutParams.width = dp;
        if (z10) {
            this.f25687a.requestLayout();
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
        this.f25692r = z11;
        if (TextUtils.isEmpty(charSequence)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.b6 b6Var = this.f25689c;
        b6Var.setVisibility(i10);
        b6Var.setText(charSequence);
        b6Var.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.e.setVisibility(i11);
        this.f25690f.setVisibility(8);
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
        this.f25688b.setPadding(i13, 0, i12, 0);
        updateColors();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        LinearLayout linearLayout = this.f25688b;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight(), 1073741824));
        this.f25690f.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.f25691n.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
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
        super.setOnClickListener(new w2(0, this, onClickListener));
    }

    public void setOnCloseListener(View.OnClickListener onClickListener) {
        this.e.setVisibility(4);
        ImageView imageView = this.f25690f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        int i10;
        if (this.f25692r) {
            i10 = org.telegram.ui.ActionBar.y6.f23598q7;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.G6;
        }
        this.f25689c.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.y6.f23748y6;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
        z90 z90Var = this.d;
        z90Var.setTextColor(x02);
        z90Var.setLinkTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.gc, false));
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.e.setColorFilter(x03, mode);
        int x04 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
        ImageView imageView = this.f25690f;
        imageView.setColorFilter(x04, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.o6.c(null, org.telegram.ui.ActionBar.o6.b(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.o6.f22921a, false))));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCompact(boolean z10) {
    }
}
