package org.telegram.ui.Wallet;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
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
public final class h9 extends FrameLayout {
    public final Rect E;
    public final int[] F;
    public final int[] G;
    public final n1 H;
    public final m1 I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final TextView[] N;
    public final EditText f35005a;
    public final TextView f35006b;
    public final TextView f35007c;
    public final ImageView d;
    public final org.telegram.ui.ActionBar.e6 f35008e;
    public Runnable f35009f;
    public Runnable h;
    public Runnable f35010n;
    public Runnable f35011r;
    public PopupWindow f35012s;
    public boolean v;
    public LinearLayout f35013w;
    public ImageView f35014x;
    public final Rect f35015y;

    public h9(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        float f7;
        this.f35015y = new Rect();
        this.E = new Rect();
        this.F = new int[2];
        this.G = new int[2];
        this.H = new n1(this, 1);
        this.I = new m1(this, 1);
        this.N = new TextView[3];
        this.f35008e = e6Var;
        setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.i6.m1(0.5f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20741a7, e6Var))));
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(11.0f), 0);
        TextView textView = new TextView(context);
        this.f35006b = textView;
        textView.setTextSize(15.0f);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setText((i10 + 1) + ".");
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.A6, e6Var));
        addView(textView, w7.x5.a(-2.0f, 0.0f, 0.0f, 8.0f, 0.0f, 22, 16));
        setClipChildren(false);
        EditText editText = new EditText(context);
        this.f35005a = editText;
        editText.setTextSize(16.0f);
        editText.setGravity(16);
        editText.setBackground(null);
        editText.setPadding(0, AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f));
        editText.setIncludeFontPadding(false);
        editText.setSingleLine(true);
        editText.setImeOptions(5);
        editText.setTypeface(Typeface.DEFAULT);
        editText.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21199z6, e6Var));
        editText.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        editText.setHint("");
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public final void onFocusChange(View view, boolean z11) {
                h9 h9Var = h9.this;
                if (z11) {
                    h9Var.setError(false);
                    h9Var.e();
                    String lowerCase = h9Var.f35005a.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty()) {
                        h9Var.a();
                    } else {
                        h9Var.f(lowerCase);
                    }
                } else {
                    h9Var.a();
                    if (!h9Var.v && !h9Var.b()) {
                        h9Var.setError(true);
                    }
                }
                h9Var.d();
            }
        });
        editText.addTextChangedListener(new ci.h2(this, 17));
        if (z10) {
            f7 = 64.0f;
        } else {
            f7 = 8.0f;
        }
        addView(editText, w7.x5.a(-1.0f, 30.0f, 0.0f, f7, 0.0f, -1, 16));
        editText.setOnEditorActionListener(new q7(this, 1));
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.x5.e(-2, -2, 21));
        if (z10) {
            TextView textView2 = new TextView(context);
            this.f35007c = textView2;
            textView2.setTextSize(14.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setGravity(17);
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.q6, e6Var));
            textView2.setPadding(org.telegram.ui.Cells.c1.b(12.0f, R.string.WalletPaste, textView2), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            textView2.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, e6Var)));
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final h9 f34943b;

                {
                    this.f34943b = this;
                }

                @Override
                public final void onClick(View view) {
                    CharSequence text;
                    switch (r2) {
                        case 0:
                            h9 h9Var = this.f34943b;
                            EditText editText2 = h9Var.f35005a;
                            try {
                                ClipboardManager clipboardManager = (ClipboardManager) h9Var.getContext().getSystemService("clipboard");
                                if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                    editText2.setText(text.toString().trim());
                                    editText2.setSelection(editText2.getText().length());
                                    Runnable runnable = h9Var.h;
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
                            EditText editText3 = this.f34943b.f35005a;
                            editText3.setText("");
                            editText3.setSelection(0);
                            return;
                    }
                }
            });
            frameLayout.addView(textView2, w7.x5.e(-2, -2, 17));
        } else {
            this.f35007c = null;
        }
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21181y6, e6Var), PorterDuff.Mode.SRC_IN));
        imageView.setImageResource(R.drawable.ic_ab_close);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, e6Var), 3, -1));
        imageView.setVisibility(8);
        imageView.setFocusable(false);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final h9 f34943b;

            {
                this.f34943b = this;
            }

            @Override
            public final void onClick(View view) {
                CharSequence text;
                switch (r2) {
                    case 0:
                        h9 h9Var = this.f34943b;
                        EditText editText2 = h9Var.f35005a;
                        try {
                            ClipboardManager clipboardManager = (ClipboardManager) h9Var.getContext().getSystemService("clipboard");
                            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                editText2.setText(text.toString().trim());
                                editText2.setSelection(editText2.getText().length());
                                Runnable runnable = h9Var.h;
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
                        EditText editText3 = this.f34943b.f35005a;
                        editText3.setText("");
                        editText3.setSelection(0);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, w7.x5.e(28, 28, 17));
        e();
        d();
    }

    public final void a() {
        PopupWindow popupWindow = this.f35012s;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f35012s.dismiss();
        }
    }

    public final boolean b() {
        String lowerCase = this.f35005a.getText().toString().trim().toLowerCase();
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
        Rect rect = this.f35015y;
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
        LinearLayout linearLayout = (LinearLayout) this.f35012s.getContentView();
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
        if (linearLayout.indexOfChild(this.f35014x) != i10) {
            linearLayout.removeView(this.f35014x);
            linearLayout.addView(this.f35014x, i10);
            ImageView imageView = this.f35014x;
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
        if (this.f35012s.isShowing()) {
            if (this.J != i11 || this.K != i12 || this.L != measuredWidth || this.M != measuredHeight) {
                this.f35012s.update(i11, i12, measuredWidth, measuredHeight);
            }
        } else {
            this.f35012s.setWidth(measuredWidth);
            this.f35012s.setHeight(measuredHeight);
            this.f35012s.showAtLocation(this, 51, i11, i12);
            getViewTreeObserver().addOnGlobalLayoutListener(this.H);
            getViewTreeObserver().addOnScrollChangedListener(this.I);
        }
        this.J = i11;
        this.K = i12;
        this.L = measuredWidth;
        this.M = measuredHeight;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.h9.d():void");
    }

    public final void e() {
        boolean z10;
        int w02;
        if (!this.v && this.f35005a.getText().length() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = this.v;
        org.telegram.ui.ActionBar.e6 e6Var = this.f35008e;
        if (z11) {
            w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21037q7, e6Var);
        } else if (z10) {
            w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var);
        } else {
            w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.A6, e6Var);
        }
        this.f35006b.setTextColor(w02);
    }

    public final void f(String str) {
        String[] mnemonicWordlist;
        ShapeDrawable shapeDrawable;
        int i10;
        if (this.f35005a.hasFocus() && !TextUtils.isEmpty(str) && str.length() >= 1 && WalletEngine2.getMnemonicWordlist().length != 0) {
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
            PopupWindow popupWindow = this.f35012s;
            TextView[] textViewArr = this.N;
            if (popupWindow == null) {
                PopupWindow popupWindow2 = new PopupWindow(context);
                this.f35012s = popupWindow2;
                popupWindow2.setOutsideTouchable(false);
                this.f35012s.setFocusable(false);
                this.f35012s.setInputMethodMode(1);
                this.f35012s.setBackgroundDrawable(null);
                this.f35012s.setElevation(AndroidUtilities.dp(8.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setClipToPadding(false);
                ImageView imageView = new ImageView(context);
                this.f35014x = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f35014x.setColorFilter(new PorterDuffColorFilter(-872415232, PorterDuff.Mode.SRC_IN));
                this.f35014x.setImageResource(R.drawable.wallet_tooltip_arrow);
                linearLayout.addView(this.f35014x, w7.x5.t(18, 9, 1, 0, 0, 0, 0));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.f35013w = linearLayout2;
                linearLayout2.setOrientation(0);
                this.f35013w.setGravity(16);
                this.f35013w.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                this.f35013w.setClipToPadding(false);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(-872415232);
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(8.0f));
                this.f35013w.setBackground(gradientDrawable);
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
                    textView.setOnClickListener(new ci.m4(this, i11, 26));
                    textViewArr[i11] = textView;
                    LinearLayout linearLayout3 = this.f35013w;
                    if (i11 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 12;
                    }
                    linearLayout3.addView(textView, w7.x5.t(-2, -2, 16, i10, 0, 0, 0));
                }
                linearLayout.addView(this.f35013w, w7.x5.n(-2, -2));
                this.f35012s.setContentView(linearLayout);
                this.f35012s.setWidth(-2);
                this.f35012s.setHeight(-2);
                this.f35012s.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public final void onDismiss() {
                        h9 h9Var = h9.this;
                        h9Var.getViewTreeObserver().removeOnGlobalLayoutListener(h9Var.H);
                        h9Var.getViewTreeObserver().removeOnScrollChangedListener(h9Var.I);
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
                        shapeDrawable = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(5.0f), 452984831);
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
        return this.f35005a.getText().toString().trim();
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
            EditText editText = this.f35005a;
            org.telegram.ui.ActionBar.e6 e6Var = this.f35008e;
            if (z10) {
                setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.i6.m1(0.24f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21056r7, e6Var))));
                int i10 = org.telegram.ui.ActionBar.i6.f21037q7;
                this.f35006b.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
                editText.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
                if (imageView != null) {
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i10, e6Var), PorterDuff.Mode.SRC_IN));
                }
                AndroidUtilities.shakeViewSpring(this);
            } else {
                setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.i6.m1(0.5f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20741a7, e6Var))));
                editText.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
                if (imageView != null) {
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21181y6, e6Var), PorterDuff.Mode.SRC_IN));
                }
                e();
                d();
            }
            Runnable runnable = this.f35010n;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void setOnErrorClearListener(Runnable runnable) {
        this.f35010n = runnable;
    }

    public void setOnNextListener(Runnable runnable) {
        this.f35011r = runnable;
    }

    public void setOnPasteListener(Runnable runnable) {
        this.h = runnable;
    }

    public void setOnTextChangedListener(Runnable runnable) {
        this.f35009f = runnable;
    }

    public void setText(String str) {
        EditText editText = this.f35005a;
        editText.setText(str);
        editText.setSelection(str.length());
        setError(false);
        e();
        d();
        a();
    }
}
