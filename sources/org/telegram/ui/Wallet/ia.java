package org.telegram.ui.Wallet;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ia extends FrameLayout {
    public final Rect E;
    public final int[] F;
    public final int[] G;
    public final o1 H;
    public final n1 I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final TextView[] N;
    public final EditText f34619a;
    public final TextView f34620b;
    public final TextView f34621c;
    public final ImageView d;
    public final org.telegram.ui.ActionBar.g6 e;
    public Runnable f34622f;
    public Runnable h;
    public Runnable f34623n;
    public Runnable f34624r;
    public PopupWindow f34625s;
    public boolean v;
    public LinearLayout f34626w;
    public ImageView f34627x;
    public final Rect f34628y;

    public ia(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context);
        float f7;
        this.f34628y = new Rect();
        this.E = new Rect();
        this.F = new int[2];
        this.G = new int[2];
        this.H = new o1(this, 1);
        this.I = new n1(this, 2);
        this.N = new TextView[3];
        this.e = g6Var;
        int dp = AndroidUtilities.dp(16.0f);
        int i11 = org.telegram.ui.ActionBar.k6.f21125a7;
        Drawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.o1(0.5f, org.telegram.ui.ActionBar.k6.w0(i11, g6Var)));
        org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.5f, i11);
        setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(this, c02, M, null, g6Var);
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(11.0f), 0);
        TextView textView = new TextView(context);
        this.f34620b = textView;
        textView.setTextSize(15.0f);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setText((i10 + 1) + ".");
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.A6, g6Var);
        addView(textView, w7.z5.d(22, -2.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
        setClipChildren(false);
        EditText editText = new EditText(context);
        this.f34619a = editText;
        editText.setTextSize(16.0f);
        editText.setGravity(16);
        editText.setBackground(null);
        editText.setPadding(0, AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f));
        editText.setIncludeFontPadding(false);
        editText.setSingleLine(true);
        editText.setImeOptions(5);
        editText.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.r6.F(editText, org.telegram.ui.ActionBar.k6.f21588z6, g6Var);
        org.telegram.ui.ActionBar.r6.W(editText, org.telegram.ui.ActionBar.k6.G6, g6Var);
        editText.setHint("");
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public final void onFocusChange(View view, boolean z11) {
                ia iaVar = ia.this;
                if (z11) {
                    iaVar.setError(false);
                    iaVar.e();
                    String lowerCase = iaVar.f34619a.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty()) {
                        iaVar.a();
                    } else {
                        iaVar.f(lowerCase);
                    }
                } else {
                    iaVar.a();
                    if (!iaVar.v && !iaVar.b()) {
                        iaVar.setError(true);
                    }
                }
                iaVar.d();
            }
        });
        editText.addTextChangedListener(new ai.u(this, 18));
        if (z10) {
            f7 = 64.0f;
        } else {
            f7 = 8.0f;
        }
        addView(editText, w7.z5.d(-1, -1.0f, 16, 30.0f, 0.0f, f7, 0.0f));
        editText.setOnEditorActionListener(new m8(this, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.z5.e(-2, -2, 21));
        if (z10) {
            TextView textView2 = new TextView(context);
            this.f34621c = textView2;
            textView2.setTextSize(14.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setGravity(17);
            org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.q6, g6Var);
            textView2.setPadding(org.telegram.ui.Cells.b1.e(12.0f, R.string.WalletPaste, textView2), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            int dp2 = AndroidUtilities.dp(28.0f);
            int i12 = org.telegram.ui.ActionBar.k6.f21183d6;
            ShapeDrawable c03 = org.telegram.ui.ActionBar.k6.c0(dp2, org.telegram.ui.ActionBar.k6.w0(i12, g6Var));
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
            textView2.setBackground(c03);
            org.telegram.ui.ActionBar.r6.k(textView2, c03, O, null, g6Var);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final ia f34554b;

                {
                    this.f34554b = this;
                }

                @Override
                public final void onClick(View view) {
                    CharSequence text;
                    switch (r2) {
                        case 0:
                            ia iaVar = this.f34554b;
                            EditText editText2 = iaVar.f34619a;
                            try {
                                ClipboardManager clipboardManager = (ClipboardManager) iaVar.getContext().getSystemService("clipboard");
                                if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                    editText2.setText(text.toString().trim());
                                    editText2.setSelection(editText2.getText().length());
                                    Runnable runnable = iaVar.h;
                                    if (runnable != null) {
                                        runnable.run();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        default:
                            EditText editText3 = this.f34554b.f34619a;
                            editText3.setText("");
                            editText3.setSelection(0);
                            return;
                    }
                }
            });
            frameLayout.addView(textView2, w7.z5.e(-2, -2, 17));
        } else {
            this.f34621c = null;
        }
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f21571y6, g6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(R.drawable.ic_ab_close);
        int i13 = org.telegram.ui.ActionBar.k6.f21272i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i13, g6Var), 3, -1);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i13);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView, g02, null, O2, g6Var);
        imageView.setVisibility(8);
        imageView.setFocusable(false);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ia f34554b;

            {
                this.f34554b = this;
            }

            @Override
            public final void onClick(View view) {
                CharSequence text;
                switch (r2) {
                    case 0:
                        ia iaVar = this.f34554b;
                        EditText editText2 = iaVar.f34619a;
                        try {
                            ClipboardManager clipboardManager = (ClipboardManager) iaVar.getContext().getSystemService("clipboard");
                            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                editText2.setText(text.toString().trim());
                                editText2.setSelection(editText2.getText().length());
                                Runnable runnable = iaVar.h;
                                if (runnable != null) {
                                    runnable.run();
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    default:
                        EditText editText3 = this.f34554b.f34619a;
                        editText3.setText("");
                        editText3.setSelection(0);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, w7.z5.e(28, 28, 17));
        e();
        d();
    }

    public final void a() {
        PopupWindow popupWindow = this.f34625s;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f34625s.dismiss();
        }
    }

    public final boolean b() {
        String lowerCase = this.f34619a.getText().toString().trim().toLowerCase();
        if (lowerCase.isEmpty()) {
            return true;
        }
        for (String str : WalletEngine2.getMnemonicWordlist()) {
            if (str.equals(lowerCase)) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        int i10;
        int height;
        float f7;
        Rect rect = this.f34628y;
        getWindowVisibleDisplayFrame(rect);
        int[] iArr = this.F;
        getLocationOnScreen(iArr);
        int[] iArr2 = this.G;
        getLocationInWindow(iArr2);
        Rect rect2 = this.E;
        if (!getLocalVisibleRect(rect2)) {
            a();
            return;
        }
        rect2.offset(iArr[0], iArr[1]);
        if (!Rect.intersects(rect2, rect)) {
            a();
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.f34625s.getContentView();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(260.0f), rect.width()), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = linearLayout.getMeasuredWidth();
        int measuredHeight = linearLayout.getMeasuredHeight();
        int dp = AndroidUtilities.dp(9.0f);
        if (getHeight() + iArr[1] + dp + measuredHeight > rect.bottom) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (i10 != 0 && (iArr[1] - dp) - measuredHeight < rect.top) {
            a();
            return;
        }
        if (linearLayout.indexOfChild(this.f34627x) != i10) {
            linearLayout.removeView(this.f34627x);
            linearLayout.addView(this.f34627x, i10);
            ImageView imageView = this.f34627x;
            if (i10 != 0) {
                f7 = 180.0f;
            } else {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        int max = Math.max(rect.left, Math.min(((getWidth() - measuredWidth) / 2) + iArr[0], rect.right - measuredWidth));
        if (i10 != 0) {
            height = (iArr[1] - dp) - measuredHeight;
        } else {
            height = getHeight() + iArr[1] + dp;
        }
        int i11 = (max + iArr2[0]) - iArr[0];
        int i12 = (height + iArr2[1]) - iArr[1];
        if (this.f34625s.isShowing()) {
            if (this.J != i11 || this.K != i12 || this.L != measuredWidth || this.M != measuredHeight) {
                this.f34625s.update(i11, i12, measuredWidth, measuredHeight);
            }
        } else {
            this.f34625s.setWidth(measuredWidth);
            this.f34625s.setHeight(measuredHeight);
            this.f34625s.showAtLocation(this, 51, i11, i12);
            getViewTreeObserver().addOnGlobalLayoutListener(this.H);
            getViewTreeObserver().addOnScrollChangedListener(this.I);
        }
        this.J = i11;
        this.K = i12;
        this.L = measuredWidth;
        this.M = measuredHeight;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.ia.d():void");
    }

    public final void e() {
        boolean z10;
        int i10;
        if (!this.v && this.f34619a.getText().length() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.v) {
            i10 = org.telegram.ui.ActionBar.k6.f21421q7;
        } else if (z10) {
            i10 = org.telegram.ui.ActionBar.k6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.A6;
        }
        org.telegram.ui.ActionBar.r6.W(this.f34620b, i10, this.e);
    }

    public final void f(String str) {
        String[] mnemonicWordlist;
        ShapeDrawable shapeDrawable;
        int i10;
        if (this.f34619a.hasFocus() && !TextUtils.isEmpty(str) && str.length() >= 1 && WalletEngine2.getMnemonicWordlist().length != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : WalletEngine2.getMnemonicWordlist()) {
                if (str2.startsWith(str) && !str2.equals(str)) {
                    arrayList.add(str2);
                    if (arrayList.size() >= 3) {
                        break;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                a();
                return;
            }
            Context context = getContext();
            PopupWindow popupWindow = this.f34625s;
            TextView[] textViewArr = this.N;
            if (popupWindow == null) {
                PopupWindow popupWindow2 = new PopupWindow(context);
                this.f34625s = popupWindow2;
                popupWindow2.setOutsideTouchable(false);
                this.f34625s.setFocusable(false);
                this.f34625s.setInputMethodMode(1);
                this.f34625s.setBackgroundDrawable(null);
                this.f34625s.setElevation(AndroidUtilities.dp(8.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setClipToPadding(false);
                ImageView imageView = new ImageView(context);
                this.f34627x = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f34627x.setColorFilter(new PorterDuffColorFilter(-872415232, PorterDuff.Mode.SRC_IN));
                this.f34627x.setImageResource(R.drawable.wallet_tooltip_arrow);
                linearLayout.addView(this.f34627x, w7.z5.t(18, 9, 1, 0, 0, 0, 0));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.f34626w = linearLayout2;
                linearLayout2.setOrientation(0);
                this.f34626w.setGravity(16);
                this.f34626w.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                this.f34626w.setClipToPadding(false);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(-872415232);
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(8.0f));
                this.f34626w.setBackground(gradientDrawable);
                for (int i11 = 0; i11 < 3; i11++) {
                    TextView textView = new TextView(context);
                    textView.setTextSize(14.0f);
                    textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                    textView.setGravity(17);
                    textView.setIncludeFontPadding(false);
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setMaxWidth(AndroidUtilities.dp(140.0f));
                    textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f));
                    textView.setVisibility(8);
                    textView.setOnClickListener(new ai.n1(this, i11, 28));
                    textViewArr[i11] = textView;
                    LinearLayout linearLayout3 = this.f34626w;
                    if (i11 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 12;
                    }
                    linearLayout3.addView(textView, w7.z5.t(-2, -2, 16, i10, 0, 0, 0));
                }
                linearLayout.addView(this.f34626w, w7.z5.n(-2, -2));
                this.f34625s.setContentView(linearLayout);
                this.f34625s.setWidth(-2);
                this.f34625s.setHeight(-2);
                this.f34625s.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public final void onDismiss() {
                        ia iaVar = ia.this;
                        iaVar.getViewTreeObserver().removeOnGlobalLayoutListener(iaVar.H);
                        iaVar.getViewTreeObserver().removeOnScrollChangedListener(iaVar.I);
                    }
                });
            }
            for (int i12 = 0; i12 < 3; i12++) {
                TextView textView2 = textViewArr[i12];
                if (i12 < arrayList.size()) {
                    String str3 = (String) arrayList.get(i12);
                    SpannableString spannableString = new SpannableString(str3);
                    int min = Math.min(str.length(), str3.length());
                    spannableString.setSpan(new ForegroundColorSpan(-4539718), 0, min, 33);
                    spannableString.setSpan(new ForegroundColorSpan(-1), min, str3.length(), 33);
                    textView2.setText(spannableString);
                    if (i12 == 0) {
                        shapeDrawable = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(5.0f), 452984831);
                    } else {
                        shapeDrawable = null;
                    }
                    textView2.setBackground(shapeDrawable);
                    textView2.setVisibility(0);
                } else {
                    textView2.setText("");
                    textView2.setBackground(null);
                    textView2.setVisibility(8);
                }
            }
            c();
            return;
        }
        a();
    }

    public String getWord() {
        return this.f34619a.getText().toString().trim();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(256.0f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)), i11);
    }

    public void setError(boolean z10) {
        if (this.v != z10) {
            this.v = z10;
            ImageView imageView = this.d;
            EditText editText = this.f34619a;
            org.telegram.ui.ActionBar.g6 g6Var = this.e;
            if (z10) {
                int dp = AndroidUtilities.dp(16.0f);
                int i10 = org.telegram.ui.ActionBar.k6.f21441r7;
                ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.o1(0.24f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var)));
                org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.24f, i10);
                setBackground(c02);
                org.telegram.ui.ActionBar.r6.k(this, c02, M, null, g6Var);
                int i11 = org.telegram.ui.ActionBar.k6.f21421q7;
                org.telegram.ui.ActionBar.r6.W(this.f34620b, i11, g6Var);
                org.telegram.ui.ActionBar.r6.W(editText, i11, g6Var);
                if (imageView != null) {
                    org.telegram.ui.ActionBar.r6.t(imageView, i11, g6Var, PorterDuff.Mode.SRC_IN);
                }
                AndroidUtilities.shakeViewSpring(this);
            } else {
                int dp2 = AndroidUtilities.dp(16.0f);
                int i12 = org.telegram.ui.ActionBar.k6.f21125a7;
                ShapeDrawable c03 = org.telegram.ui.ActionBar.k6.c0(dp2, org.telegram.ui.ActionBar.k6.o1(0.5f, org.telegram.ui.ActionBar.k6.w0(i12, g6Var)));
                org.telegram.ui.ActionBar.n6 M2 = org.telegram.ui.ActionBar.r6.M(0.5f, i12);
                setBackground(c03);
                org.telegram.ui.ActionBar.r6.k(this, c03, M2, null, g6Var);
                org.telegram.ui.ActionBar.r6.W(editText, org.telegram.ui.ActionBar.k6.G6, g6Var);
                if (imageView != null) {
                    org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f21571y6, g6Var, PorterDuff.Mode.SRC_IN);
                }
                e();
                d();
            }
            Runnable runnable = this.f34623n;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void setOnErrorClearListener(Runnable runnable) {
        this.f34623n = runnable;
    }

    public void setOnNextListener(Runnable runnable) {
        this.f34624r = runnable;
    }

    public void setOnPasteListener(Runnable runnable) {
        this.h = runnable;
    }

    public void setOnTextChangedListener(Runnable runnable) {
        this.f34622f = runnable;
    }

    public void setText(String str) {
        EditText editText = this.f34619a;
        editText.setText(str);
        editText.setSelection(str.length());
        setError(false);
        e();
        d();
        a();
    }
}
