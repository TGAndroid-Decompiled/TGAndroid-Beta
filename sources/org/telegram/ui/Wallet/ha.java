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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.zv0;
public final class ha extends FrameLayout {
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
    public final EditText f36651a;
    public final TextView f36652b;
    public final TextView f36653c;
    public final ImageView d;
    public final org.telegram.ui.ActionBar.u6 e;
    public Runnable f36654f;
    public Runnable h;
    public Runnable f36655n;
    public Runnable f36656r;
    public PopupWindow f36657s;
    public boolean v;
    public LinearLayout f36658w;
    public ImageView f36659x;
    public final Rect f36660y;

    public ha(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        float f7;
        this.f36660y = new Rect();
        this.E = new Rect();
        this.F = new int[2];
        this.G = new int[2];
        this.H = new o1(this, 1);
        this.I = new n1(this, 2);
        this.N = new TextView[3];
        this.e = u6Var;
        int dp = AndroidUtilities.dp(16.0f);
        int i11 = org.telegram.ui.ActionBar.y6.f23299a7;
        Drawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.w0(i11, u6Var)));
        org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.5f, i11);
        setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(this, c02, L, null, u6Var);
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(11.0f), 0);
        TextView textView = new TextView(context);
        this.f36652b = textView;
        textView.setTextSize(15.0f);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setText((i10 + 1) + ".");
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.A6, u6Var);
        addView(textView, gb1.h(22, -2.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
        setClipChildren(false);
        EditText editText = new EditText(context);
        this.f36651a = editText;
        editText.setTextSize(16.0f);
        editText.setGravity(16);
        editText.setBackground(null);
        editText.setPadding(0, AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f));
        editText.setIncludeFontPadding(false);
        editText.setSingleLine(true);
        editText.setImeOptions(5);
        editText.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.f7.E(editText, org.telegram.ui.ActionBar.y6.f23767z6, u6Var);
        org.telegram.ui.ActionBar.f7.V(editText, org.telegram.ui.ActionBar.y6.G6, u6Var);
        editText.setHint("");
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public final void onFocusChange(View view, boolean z11) {
                ha haVar = ha.this;
                if (z11) {
                    haVar.setError(false);
                    haVar.e();
                    String lowerCase = haVar.f36651a.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty()) {
                        haVar.a();
                    } else {
                        haVar.f(lowerCase);
                    }
                } else {
                    haVar.a();
                    if (!haVar.v && !haVar.b()) {
                        haVar.setError(true);
                    }
                }
                haVar.d();
            }
        });
        editText.addTextChangedListener(new bi.u(this, 18));
        if (z10) {
            f7 = 64.0f;
        } else {
            f7 = 8.0f;
        }
        addView(editText, gb1.h(-1, -1.0f, 16, 30.0f, 0.0f, f7, 0.0f));
        editText.setOnEditorActionListener(new l8(this, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, gb1.i(-2, -2, 21));
        if (z10) {
            TextView textView2 = new TextView(context);
            this.f36653c = textView2;
            textView2.setTextSize(14.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setGravity(17);
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23597q6, u6Var);
            textView2.setPadding(org.telegram.ui.d3.h(12.0f, R.string.WalletPaste, textView2), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            int dp2 = AndroidUtilities.dp(28.0f);
            int i12 = org.telegram.ui.ActionBar.y6.f23356d6;
            ShapeDrawable c03 = org.telegram.ui.ActionBar.y6.c0(dp2, org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
            textView2.setBackground(c03);
            org.telegram.ui.ActionBar.f7.k(textView2, c03, N, null, u6Var);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final ha f36581b;

                {
                    this.f36581b = this;
                }

                @Override
                public final void onClick(View view) {
                    CharSequence text;
                    switch (r2) {
                        case 0:
                            ha haVar = this.f36581b;
                            EditText editText2 = haVar.f36651a;
                            try {
                                ClipboardManager clipboardManager = (ClipboardManager) haVar.getContext().getSystemService("clipboard");
                                if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                    editText2.setText(text.toString().trim());
                                    editText2.setSelection(editText2.getText().length());
                                    Runnable runnable = haVar.h;
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
                            EditText editText3 = this.f36581b.f36651a;
                            editText3.setText("");
                            editText3.setSelection(0);
                            return;
                    }
                }
            });
            frameLayout.addView(textView2, gb1.i(-2, -2, 17));
        } else {
            this.f36653c = null;
        }
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.f23748y6, u6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(R.drawable.ic_ab_close);
        int i13 = org.telegram.ui.ActionBar.y6.f23448i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i13, u6Var), 3, -1);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i13);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N2, u6Var);
        imageView.setVisibility(8);
        imageView.setFocusable(false);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ha f36581b;

            {
                this.f36581b = this;
            }

            @Override
            public final void onClick(View view) {
                CharSequence text;
                switch (r2) {
                    case 0:
                        ha haVar = this.f36581b;
                        EditText editText2 = haVar.f36651a;
                        try {
                            ClipboardManager clipboardManager = (ClipboardManager) haVar.getContext().getSystemService("clipboard");
                            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                editText2.setText(text.toString().trim());
                                editText2.setSelection(editText2.getText().length());
                                Runnable runnable = haVar.h;
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
                        EditText editText3 = this.f36581b.f36651a;
                        editText3.setText("");
                        editText3.setSelection(0);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, gb1.i(28, 28, 17));
        e();
        d();
    }

    public final void a() {
        PopupWindow popupWindow = this.f36657s;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f36657s.dismiss();
        }
    }

    public final boolean b() {
        String lowerCase = this.f36651a.getText().toString().trim().toLowerCase();
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
        Rect rect = this.f36660y;
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
        LinearLayout linearLayout = (LinearLayout) this.f36657s.getContentView();
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
        if (linearLayout.indexOfChild(this.f36659x) != i10) {
            linearLayout.removeView(this.f36659x);
            linearLayout.addView(this.f36659x, i10);
            ImageView imageView = this.f36659x;
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
        if (this.f36657s.isShowing()) {
            if (this.J != i11 || this.K != i12 || this.L != measuredWidth || this.M != measuredHeight) {
                this.f36657s.update(i11, i12, measuredWidth, measuredHeight);
            }
        } else {
            this.f36657s.setWidth(measuredWidth);
            this.f36657s.setHeight(measuredHeight);
            this.f36657s.showAtLocation(this, 51, i11, i12);
            getViewTreeObserver().addOnGlobalLayoutListener(this.H);
            getViewTreeObserver().addOnScrollChangedListener(this.I);
        }
        this.J = i11;
        this.K = i12;
        this.L = measuredWidth;
        this.M = measuredHeight;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.ha.d():void");
    }

    public final void e() {
        boolean z10;
        int i10;
        if (!this.v && this.f36651a.getText().length() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.v) {
            i10 = org.telegram.ui.ActionBar.y6.f23598q7;
        } else if (z10) {
            i10 = org.telegram.ui.ActionBar.y6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.A6;
        }
        org.telegram.ui.ActionBar.f7.V(this.f36652b, i10, this.e);
    }

    public final void f(String str) {
        String[] mnemonicWordlist;
        ShapeDrawable shapeDrawable;
        int i10;
        if (this.f36651a.hasFocus() && !TextUtils.isEmpty(str) && str.length() >= 1 && WalletEngine2.getMnemonicWordlist().length != 0) {
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
            PopupWindow popupWindow = this.f36657s;
            TextView[] textViewArr = this.N;
            if (popupWindow == null) {
                PopupWindow popupWindow2 = new PopupWindow(context);
                this.f36657s = popupWindow2;
                popupWindow2.setOutsideTouchable(false);
                this.f36657s.setFocusable(false);
                this.f36657s.setInputMethodMode(1);
                this.f36657s.setBackgroundDrawable(null);
                this.f36657s.setElevation(AndroidUtilities.dp(8.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setClipToPadding(false);
                ImageView imageView = new ImageView(context);
                this.f36659x = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f36659x.setColorFilter(new PorterDuffColorFilter(-872415232, PorterDuff.Mode.SRC_IN));
                this.f36659x.setImageResource(R.drawable.wallet_tooltip_arrow);
                linearLayout.addView(this.f36659x, gb1.x(18, 9, 1, 0, 0, 0, 0));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.f36658w = linearLayout2;
                linearLayout2.setOrientation(0);
                this.f36658w.setGravity(16);
                this.f36658w.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                this.f36658w.setClipToPadding(false);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(-872415232);
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(8.0f));
                this.f36658w.setBackground(gradientDrawable);
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
                    textView.setOnClickListener(new zv0(this, i11, 3));
                    textViewArr[i11] = textView;
                    LinearLayout linearLayout3 = this.f36658w;
                    if (i11 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 12;
                    }
                    linearLayout3.addView(textView, gb1.x(-2, -2, 16, i10, 0, 0, 0));
                }
                linearLayout.addView(this.f36658w, gb1.r(-2, -2));
                this.f36657s.setContentView(linearLayout);
                this.f36657s.setWidth(-2);
                this.f36657s.setHeight(-2);
                this.f36657s.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public final void onDismiss() {
                        ha haVar = ha.this;
                        haVar.getViewTreeObserver().removeOnGlobalLayoutListener(haVar.H);
                        haVar.getViewTreeObserver().removeOnScrollChangedListener(haVar.I);
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
                        shapeDrawable = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(5.0f), 452984831);
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
        return this.f36651a.getText().toString().trim();
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
            EditText editText = this.f36651a;
            org.telegram.ui.ActionBar.u6 u6Var = this.e;
            if (z10) {
                int dp = AndroidUtilities.dp(16.0f);
                int i10 = org.telegram.ui.ActionBar.y6.f23615r7;
                ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.o1(0.24f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var)));
                org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.24f, i10);
                setBackground(c02);
                org.telegram.ui.ActionBar.f7.k(this, c02, L, null, u6Var);
                int i11 = org.telegram.ui.ActionBar.y6.f23598q7;
                org.telegram.ui.ActionBar.f7.V(this.f36652b, i11, u6Var);
                org.telegram.ui.ActionBar.f7.V(editText, i11, u6Var);
                if (imageView != null) {
                    org.telegram.ui.ActionBar.f7.t(imageView, i11, u6Var, PorterDuff.Mode.SRC_IN);
                }
                AndroidUtilities.shakeViewSpring(this);
            } else {
                int dp2 = AndroidUtilities.dp(16.0f);
                int i12 = org.telegram.ui.ActionBar.y6.f23299a7;
                ShapeDrawable c03 = org.telegram.ui.ActionBar.y6.c0(dp2, org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.w0(i12, u6Var)));
                org.telegram.ui.ActionBar.b7 L2 = org.telegram.ui.ActionBar.f7.L(0.5f, i12);
                setBackground(c03);
                org.telegram.ui.ActionBar.f7.k(this, c03, L2, null, u6Var);
                org.telegram.ui.ActionBar.f7.V(editText, org.telegram.ui.ActionBar.y6.G6, u6Var);
                if (imageView != null) {
                    org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.f23748y6, u6Var, PorterDuff.Mode.SRC_IN);
                }
                e();
                d();
            }
            Runnable runnable = this.f36655n;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void setOnErrorClearListener(Runnable runnable) {
        this.f36655n = runnable;
    }

    public void setOnNextListener(Runnable runnable) {
        this.f36656r = runnable;
    }

    public void setOnPasteListener(Runnable runnable) {
        this.h = runnable;
    }

    public void setOnTextChangedListener(Runnable runnable) {
        this.f36654f = runnable;
    }

    public void setText(String str) {
        EditText editText = this.f36651a;
        editText.setText(str);
        editText.setSelection(str.length());
        setError(false);
        e();
        d();
        a();
    }
}
