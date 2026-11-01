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
import org.telegram.messenger.a30;
public final class ra extends FrameLayout {
    public final Rect D;
    public final Rect E;
    public final int[] F;
    public final int[] G;
    public final l1 H;
    public final k1 I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final TextView[] N;
    public final EditText f35159a;
    public final TextView f35160b;
    public final TextView f35161c;
    public final ImageView d;
    public final org.telegram.ui.ActionBar.p6 e;
    public Runnable f35162f;
    public Runnable h;
    public Runnable f35163n;
    public Runnable f35164r;
    public PopupWindow f35165s;
    public boolean f35166w;
    public LinearLayout f35167x;
    public ImageView f35168y;

    public ra(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        float f7;
        this.D = new Rect();
        this.E = new Rect();
        this.F = new int[2];
        this.G = new int[2];
        this.H = new l1(this, 1);
        this.I = new k1(this, 2);
        this.N = new TextView[3];
        this.e = p6Var;
        int L = org.telegram.messenger.i0.L(16.0f);
        int i11 = org.telegram.ui.ActionBar.t6.f20873a7;
        Drawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(i11, p6Var)));
        org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.5f, i11);
        setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(this, d02, L2, null, p6Var);
        setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(11.0f), 0);
        TextView textView = new TextView(context);
        this.f35160b = textView;
        textView.setTextSize(15.0f);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setText((i10 + 1) + ".");
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.A6, p6Var);
        addView(textView, w7.b6.d(22, -2.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
        setClipChildren(false);
        EditText editText = new EditText(context);
        this.f35159a = editText;
        editText.setTextSize(16.0f);
        editText.setGravity(16);
        editText.setBackground(null);
        editText.setPadding(0, org.telegram.messenger.i0.L(15.0f), 0, org.telegram.messenger.i0.L(15.0f));
        editText.setIncludeFontPadding(false);
        editText.setSingleLine(true);
        editText.setImeOptions(5);
        editText.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.a7.E(editText, org.telegram.ui.ActionBar.t6.f21331z6, p6Var);
        org.telegram.ui.ActionBar.a7.V(editText, org.telegram.ui.ActionBar.t6.G6, p6Var);
        editText.setHint("");
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public final void onFocusChange(View view, boolean z11) {
                ra raVar = ra.this;
                if (z11) {
                    raVar.setError(false);
                    raVar.e();
                    String lowerCase = raVar.f35159a.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty()) {
                        raVar.a();
                    } else {
                        raVar.f(lowerCase);
                    }
                } else {
                    raVar.a();
                    if (!raVar.f35166w && !raVar.b()) {
                        raVar.setError(true);
                    }
                }
                raVar.d();
            }
        });
        editText.addTextChangedListener(new ag.a1(this, 25));
        if (z10) {
            f7 = 64.0f;
        } else {
            f7 = 8.0f;
        }
        addView(editText, w7.b6.d(-1, -1.0f, 16, 30.0f, 0.0f, f7, 0.0f));
        editText.setOnEditorActionListener(new x8(this, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.b6.e(-2, -2, 21));
        if (z10) {
            TextView textView2 = new TextView(context);
            this.f35161c = textView2;
            textView2.setTextSize(14.0f);
            textView2.setTypeface(org.telegram.messenger.i0.o());
            textView2.setGravity(17);
            a30.p(textView2, org.telegram.ui.ActionBar.t6.q6, p6Var, null, 2131743081);
            textView2.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f));
            int L3 = org.telegram.messenger.i0.L(28.0f);
            int i12 = org.telegram.ui.ActionBar.t6.f20930d6;
            ShapeDrawable d03 = org.telegram.ui.ActionBar.t6.d0(L3, org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
            textView2.setBackground(d03);
            org.telegram.ui.ActionBar.a7.k(textView2, d03, N, null, p6Var);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final ra f35050b;

                {
                    this.f35050b = this;
                }

                @Override
                public final void onClick(View view) {
                    CharSequence text;
                    switch (r2) {
                        case 0:
                            ra raVar = this.f35050b;
                            EditText editText2 = raVar.f35159a;
                            try {
                                ClipboardManager clipboardManager = (ClipboardManager) raVar.getContext().getSystemService("clipboard");
                                if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                    editText2.setText(text.toString().trim());
                                    editText2.setSelection(editText2.getText().length());
                                    Runnable runnable = raVar.h;
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
                            EditText editText3 = this.f35050b.f35159a;
                            editText3.setText("");
                            editText3.setSelection(0);
                            return;
                    }
                }
            });
            frameLayout.addView(textView2, w7.b6.e(-2, -2, 17));
        } else {
            this.f35161c = null;
        }
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.f21312y6, p6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(2131231242);
        int i13 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i13, p6Var), 3, -1);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i13);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N2, p6Var);
        imageView.setVisibility(8);
        imageView.setFocusable(false);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ra f35050b;

            {
                this.f35050b = this;
            }

            @Override
            public final void onClick(View view) {
                CharSequence text;
                switch (r2) {
                    case 0:
                        ra raVar = this.f35050b;
                        EditText editText2 = raVar.f35159a;
                        try {
                            ClipboardManager clipboardManager = (ClipboardManager) raVar.getContext().getSystemService("clipboard");
                            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                editText2.setText(text.toString().trim());
                                editText2.setSelection(editText2.getText().length());
                                Runnable runnable = raVar.h;
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
                        EditText editText3 = this.f35050b.f35159a;
                        editText3.setText("");
                        editText3.setSelection(0);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, w7.b6.e(28, 28, 17));
        e();
        d();
    }

    public final void a() {
        PopupWindow popupWindow = this.f35165s;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f35165s.dismiss();
        }
    }

    public final boolean b() {
        String lowerCase = this.f35159a.getText().toString().trim().toLowerCase();
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
        Rect rect = this.D;
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
        LinearLayout linearLayout = (LinearLayout) this.f35165s.getContentView();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(260.0f), rect.width()), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = linearLayout.getMeasuredWidth();
        int measuredHeight = linearLayout.getMeasuredHeight();
        int L = org.telegram.messenger.i0.L(9.0f);
        if (getHeight() + iArr[1] + L + measuredHeight > rect.bottom) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (i10 != 0 && (iArr[1] - L) - measuredHeight < rect.top) {
            a();
            return;
        }
        if (linearLayout.indexOfChild(this.f35168y) != i10) {
            linearLayout.removeView(this.f35168y);
            linearLayout.addView(this.f35168y, i10);
            ImageView imageView = this.f35168y;
            if (i10 != 0) {
                f7 = 180.0f;
            } else {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        int max = Math.max(rect.left, Math.min(((getWidth() - measuredWidth) / 2) + iArr[0], rect.right - measuredWidth));
        if (i10 != 0) {
            height = (iArr[1] - L) - measuredHeight;
        } else {
            height = getHeight() + iArr[1] + L;
        }
        int i11 = (max + iArr2[0]) - iArr[0];
        int i12 = (height + iArr2[1]) - iArr[1];
        if (this.f35165s.isShowing()) {
            if (this.J != i11 || this.K != i12 || this.L != measuredWidth || this.M != measuredHeight) {
                this.f35165s.update(i11, i12, measuredWidth, measuredHeight);
            }
        } else {
            this.f35165s.setWidth(measuredWidth);
            this.f35165s.setHeight(measuredHeight);
            this.f35165s.showAtLocation(this, 51, i11, i12);
            getViewTreeObserver().addOnGlobalLayoutListener(this.H);
            getViewTreeObserver().addOnScrollChangedListener(this.I);
        }
        this.J = i11;
        this.K = i12;
        this.L = measuredWidth;
        this.M = measuredHeight;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.ra.d():void");
    }

    public final void e() {
        boolean z10;
        int i10;
        if (!this.f35166w && this.f35159a.getText().length() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f35166w) {
            i10 = org.telegram.ui.ActionBar.t6.f21171q7;
        } else if (z10) {
            i10 = org.telegram.ui.ActionBar.t6.G6;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.A6;
        }
        org.telegram.ui.ActionBar.a7.V(this.f35160b, i10, this.e);
    }

    public final void f(String str) {
        String[] mnemonicWordlist;
        ShapeDrawable shapeDrawable;
        int i10;
        if (this.f35159a.hasFocus() && !TextUtils.isEmpty(str) && str.length() >= 1 && WalletEngine2.getMnemonicWordlist().length != 0) {
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
            PopupWindow popupWindow = this.f35165s;
            TextView[] textViewArr = this.N;
            if (popupWindow == null) {
                PopupWindow popupWindow2 = new PopupWindow(context);
                this.f35165s = popupWindow2;
                popupWindow2.setOutsideTouchable(false);
                this.f35165s.setFocusable(false);
                this.f35165s.setInputMethodMode(1);
                this.f35165s.setBackgroundDrawable(null);
                this.f35165s.setElevation(org.telegram.messenger.i0.L(8.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setClipToPadding(false);
                ImageView imageView = new ImageView(context);
                this.f35168y = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f35168y.setColorFilter(new PorterDuffColorFilter(-872415232, PorterDuff.Mode.SRC_IN));
                this.f35168y.setImageResource(2131232838);
                linearLayout.addView(this.f35168y, w7.b6.t(18, 9, 1, 0, 0, 0, 0));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.f35167x = linearLayout2;
                linearLayout2.setOrientation(0);
                this.f35167x.setGravity(16);
                this.f35167x.setPadding(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f));
                this.f35167x.setClipToPadding(false);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(-872415232);
                gradientDrawable.setCornerRadius(org.telegram.messenger.i0.L(8.0f));
                this.f35167x.setBackground(gradientDrawable);
                for (int i11 = 0; i11 < 3; i11++) {
                    TextView textView = new TextView(context);
                    textView.setTextSize(14.0f);
                    textView.setTypeface(org.telegram.messenger.i0.o1("fonts/rmedium.ttf"));
                    textView.setGravity(17);
                    textView.setIncludeFontPadding(false);
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setMaxWidth(org.telegram.messenger.i0.L(140.0f));
                    textView.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(9.0f));
                    textView.setVisibility(8);
                    textView.setOnClickListener(new bh.f(this, i11, 27));
                    textViewArr[i11] = textView;
                    LinearLayout linearLayout3 = this.f35167x;
                    if (i11 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 12;
                    }
                    linearLayout3.addView(textView, w7.b6.t(-2, -2, 16, i10, 0, 0, 0));
                }
                linearLayout.addView(this.f35167x, w7.b6.o(-2, -2));
                this.f35165s.setContentView(linearLayout);
                this.f35165s.setWidth(-2);
                this.f35165s.setHeight(-2);
                this.f35165s.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public final void onDismiss() {
                        ra raVar = ra.this;
                        raVar.getViewTreeObserver().removeOnGlobalLayoutListener(raVar.H);
                        raVar.getViewTreeObserver().removeOnScrollChangedListener(raVar.I);
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
                        shapeDrawable = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(5.0f), 452984831);
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
        return this.f35159a.getText().toString().trim();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(256.0f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)), i11);
    }

    public void setError(boolean z10) {
        if (this.f35166w != z10) {
            this.f35166w = z10;
            ImageView imageView = this.d;
            EditText editText = this.f35159a;
            org.telegram.ui.ActionBar.p6 p6Var = this.e;
            if (z10) {
                int L = org.telegram.messenger.i0.L(16.0f);
                int i10 = org.telegram.ui.ActionBar.t6.f21188r7;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.r1(0.24f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var)));
                org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.24f, i10);
                setBackground(d02);
                org.telegram.ui.ActionBar.a7.k(this, d02, L2, null, p6Var);
                int i11 = org.telegram.ui.ActionBar.t6.f21171q7;
                org.telegram.ui.ActionBar.a7.V(this.f35160b, i11, p6Var);
                org.telegram.ui.ActionBar.a7.V(editText, i11, p6Var);
                if (imageView != null) {
                    org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var, PorterDuff.Mode.SRC_IN);
                }
                org.telegram.messenger.i0.G3(this);
            } else {
                int L3 = org.telegram.messenger.i0.L(16.0f);
                int i12 = org.telegram.ui.ActionBar.t6.f20873a7;
                ShapeDrawable d03 = org.telegram.ui.ActionBar.t6.d0(L3, org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(i12, p6Var)));
                org.telegram.ui.ActionBar.w6 L4 = org.telegram.ui.ActionBar.a7.L(0.5f, i12);
                setBackground(d03);
                org.telegram.ui.ActionBar.a7.k(this, d03, L4, null, p6Var);
                org.telegram.ui.ActionBar.a7.V(editText, org.telegram.ui.ActionBar.t6.G6, p6Var);
                if (imageView != null) {
                    org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.f21312y6, p6Var, PorterDuff.Mode.SRC_IN);
                }
                e();
                d();
            }
            Runnable runnable = this.f35163n;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void setOnErrorClearListener(Runnable runnable) {
        this.f35163n = runnable;
    }

    public void setOnNextListener(Runnable runnable) {
        this.f35164r = runnable;
    }

    public void setOnPasteListener(Runnable runnable) {
        this.h = runnable;
    }

    public void setOnTextChangedListener(Runnable runnable) {
        this.f35162f = runnable;
    }

    public void setText(String str) {
        EditText editText = this.f35159a;
        editText.setText(str);
        editText.setSelection(str.length());
        setError(false);
        e();
        d();
        a();
    }
}
