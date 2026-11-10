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
import org.telegram.ui.ru0;
public final class pa extends FrameLayout {
    public final Rect D;
    public final Rect E;
    public final int[] F;
    public final int[] G;
    public final k1 H;
    public final j1 I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final TextView[] N;
    public final EditText f43024a;
    public final TextView f43025b;
    public final TextView f43026c;
    public final ImageView d;
    public final org.telegram.ui.ActionBar.h6 f43027e;
    public Runnable f43028f;
    public Runnable h;
    public Runnable f43029n;
    public Runnable f43030r;
    public PopupWindow f43031s;
    public boolean f43032w;
    public LinearLayout f43033x;
    public ImageView f43034y;

    public pa(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(context);
        float f10;
        this.D = new Rect();
        this.E = new Rect();
        this.F = new int[2];
        this.G = new int[2];
        this.H = new k1(this, 1);
        this.I = new j1(this, 2);
        this.N = new TextView[3];
        this.f43027e = h6Var;
        int L = org.telegram.messenger.g0.L(16.0f);
        int i10 = org.telegram.ui.ActionBar.m6.f27834a7;
        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(i10, h6Var)));
        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.5f, i10);
        setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(this, d02, K, null, h6Var);
        setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
        TextView textView = new TextView(context);
        this.f43025b = textView;
        textView.setTextSize(15.0f);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setText((i7 + 1) + ".");
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.A6, h6Var);
        addView(textView, c8.ha.d(22, -2.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
        setClipChildren(false);
        EditText editText = new EditText(context);
        this.f43024a = editText;
        editText.setTextSize(16.0f);
        editText.setGravity(16);
        editText.setBackground(null);
        editText.setPadding(0, org.telegram.messenger.g0.L(15.0f), 0, org.telegram.messenger.g0.L(15.0f));
        editText.setIncludeFontPadding(false);
        editText.setSingleLine(true);
        editText.setImeOptions(5);
        editText.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.t6.D(editText, org.telegram.ui.ActionBar.m6.f28300z6, h6Var);
        org.telegram.ui.ActionBar.t6.U(editText, org.telegram.ui.ActionBar.m6.G6, h6Var);
        editText.setHint("");
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public final void onFocusChange(View view, boolean z10) {
                pa paVar = pa.this;
                if (z10) {
                    paVar.setError(false);
                    paVar.e();
                    String lowerCase = paVar.f43024a.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty()) {
                        paVar.a();
                    } else {
                        paVar.f(lowerCase);
                    }
                } else {
                    paVar.a();
                    if (!paVar.f43032w && !paVar.b()) {
                        paVar.setError(true);
                    }
                }
                paVar.d();
            }
        });
        editText.addTextChangedListener(new oa(this, 0));
        if (z9) {
            f10 = 64.0f;
        } else {
            f10 = 8.0f;
        }
        addView(editText, c8.ha.d(-1, -1.0f, 16, 30.0f, 0.0f, f10, 0.0f));
        editText.setOnEditorActionListener(new t8(this, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, c8.ha.e(-2, -2, 21));
        if (z9) {
            TextView textView2 = new TextView(context);
            this.f43026c = textView2;
            textView2.setTextSize(14.0f);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setGravity(17);
            org.telegram.messenger.camera.q.o(textView2, org.telegram.ui.ActionBar.m6.f28130q6, h6Var, null, 2131743055);
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
            int L2 = org.telegram.messenger.g0.L(28.0f);
            int i11 = org.telegram.ui.ActionBar.m6.f27890d6;
            ShapeDrawable d03 = org.telegram.ui.ActionBar.m6.d0(L2, org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
            textView2.setBackground(d03);
            org.telegram.ui.ActionBar.t6.j(textView2, d03, M, null, h6Var);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final pa f42838b;

                {
                    this.f42838b = this;
                }

                @Override
                public final void onClick(View view) {
                    CharSequence text;
                    switch (r2) {
                        case 0:
                            pa paVar = this.f42838b;
                            EditText editText2 = paVar.f43024a;
                            try {
                                ClipboardManager clipboardManager = (ClipboardManager) paVar.getContext().getSystemService("clipboard");
                                if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                    editText2.setText(text.toString().trim());
                                    editText2.setSelection(editText2.getText().length());
                                    Runnable runnable = paVar.h;
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
                            EditText editText3 = this.f42838b.f43024a;
                            editText3.setText("");
                            editText3.setSelection(0);
                            return;
                    }
                }
            });
            frameLayout.addView(textView2, c8.ha.e(-2, -2, 17));
        } else {
            this.f43026c = null;
        }
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.f28282y6, h6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(2131231241);
        int i12 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, h6Var), 3, -1);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M2, h6Var);
        imageView.setVisibility(8);
        imageView.setFocusable(false);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final pa f42838b;

            {
                this.f42838b = this;
            }

            @Override
            public final void onClick(View view) {
                CharSequence text;
                switch (r2) {
                    case 0:
                        pa paVar = this.f42838b;
                        EditText editText2 = paVar.f43024a;
                        try {
                            ClipboardManager clipboardManager = (ClipboardManager) paVar.getContext().getSystemService("clipboard");
                            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                editText2.setText(text.toString().trim());
                                editText2.setSelection(editText2.getText().length());
                                Runnable runnable = paVar.h;
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
                        EditText editText3 = this.f42838b.f43024a;
                        editText3.setText("");
                        editText3.setSelection(0);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, c8.ha.e(28, 28, 17));
        e();
        d();
    }

    public final void a() {
        PopupWindow popupWindow = this.f43031s;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f43031s.dismiss();
        }
    }

    public final boolean b() {
        String lowerCase = this.f43024a.getText().toString().trim().toLowerCase();
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
        int i7;
        int height;
        float f10;
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
        LinearLayout linearLayout = (LinearLayout) this.f43031s.getContentView();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(260.0f), rect.width()), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = linearLayout.getMeasuredWidth();
        int measuredHeight = linearLayout.getMeasuredHeight();
        int L = org.telegram.messenger.g0.L(9.0f);
        if (getHeight() + iArr[1] + L + measuredHeight > rect.bottom) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (i7 != 0 && (iArr[1] - L) - measuredHeight < rect.top) {
            a();
            return;
        }
        if (linearLayout.indexOfChild(this.f43034y) != i7) {
            linearLayout.removeView(this.f43034y);
            linearLayout.addView(this.f43034y, i7);
            ImageView imageView = this.f43034y;
            if (i7 != 0) {
                f10 = 180.0f;
            } else {
                f10 = 0.0f;
            }
            imageView.setRotation(f10);
        }
        int max = Math.max(rect.left, Math.min(((getWidth() - measuredWidth) / 2) + iArr[0], rect.right - measuredWidth));
        if (i7 != 0) {
            height = (iArr[1] - L) - measuredHeight;
        } else {
            height = getHeight() + iArr[1] + L;
        }
        int i10 = (max + iArr2[0]) - iArr[0];
        int i11 = (height + iArr2[1]) - iArr[1];
        if (this.f43031s.isShowing()) {
            if (this.J != i10 || this.K != i11 || this.L != measuredWidth || this.M != measuredHeight) {
                this.f43031s.update(i10, i11, measuredWidth, measuredHeight);
            }
        } else {
            this.f43031s.setWidth(measuredWidth);
            this.f43031s.setHeight(measuredHeight);
            this.f43031s.showAtLocation(this, 51, i10, i11);
            getViewTreeObserver().addOnGlobalLayoutListener(this.H);
            getViewTreeObserver().addOnScrollChangedListener(this.I);
        }
        this.J = i10;
        this.K = i11;
        this.L = measuredWidth;
        this.M = measuredHeight;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.pa.d():void");
    }

    public final void e() {
        boolean z9;
        int i7;
        if (!this.f43032w && this.f43024a.getText().length() <= 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (this.f43032w) {
            i7 = org.telegram.ui.ActionBar.m6.f28131q7;
        } else if (z9) {
            i7 = org.telegram.ui.ActionBar.m6.G6;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.A6;
        }
        org.telegram.ui.ActionBar.t6.U(this.f43025b, i7, this.f43027e);
    }

    public final void f(String str) {
        String[] mnemonicWordlist;
        ShapeDrawable shapeDrawable;
        int i7;
        if (this.f43024a.hasFocus() && !TextUtils.isEmpty(str) && str.length() >= 1 && WalletEngine2.getMnemonicWordlist().length != 0) {
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
            PopupWindow popupWindow = this.f43031s;
            TextView[] textViewArr = this.N;
            if (popupWindow == null) {
                PopupWindow popupWindow2 = new PopupWindow(context);
                this.f43031s = popupWindow2;
                popupWindow2.setOutsideTouchable(false);
                this.f43031s.setFocusable(false);
                this.f43031s.setInputMethodMode(1);
                this.f43031s.setBackgroundDrawable(null);
                this.f43031s.setElevation(org.telegram.messenger.g0.L(8.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setClipToPadding(false);
                ImageView imageView = new ImageView(context);
                this.f43034y = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f43034y.setColorFilter(new PorterDuffColorFilter(-872415232, PorterDuff.Mode.SRC_IN));
                this.f43034y.setImageResource(2131232840);
                linearLayout.addView(this.f43034y, c8.ha.t(18, 9, 1, 0, 0, 0, 0));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.f43033x = linearLayout2;
                linearLayout2.setOrientation(0);
                this.f43033x.setGravity(16);
                this.f43033x.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
                this.f43033x.setClipToPadding(false);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(-872415232);
                gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(8.0f));
                this.f43033x.setBackground(gradientDrawable);
                for (int i10 = 0; i10 < 3; i10++) {
                    TextView textView = new TextView(context);
                    textView.setTextSize(14.0f);
                    textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
                    textView.setGravity(17);
                    textView.setIncludeFontPadding(false);
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setMaxWidth(org.telegram.messenger.g0.L(140.0f));
                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f));
                    textView.setVisibility(8);
                    textView.setOnClickListener(new ru0(this, i10, 2));
                    textViewArr[i10] = textView;
                    LinearLayout linearLayout3 = this.f43033x;
                    if (i10 == 0) {
                        i7 = 0;
                    } else {
                        i7 = 12;
                    }
                    linearLayout3.addView(textView, c8.ha.t(-2, -2, 16, i7, 0, 0, 0));
                }
                linearLayout.addView(this.f43033x, c8.ha.o(-2, -2));
                this.f43031s.setContentView(linearLayout);
                this.f43031s.setWidth(-2);
                this.f43031s.setHeight(-2);
                this.f43031s.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public final void onDismiss() {
                        pa paVar = pa.this;
                        paVar.getViewTreeObserver().removeOnGlobalLayoutListener(paVar.H);
                        paVar.getViewTreeObserver().removeOnScrollChangedListener(paVar.I);
                    }
                });
            }
            for (int i11 = 0; i11 < 3; i11++) {
                TextView textView2 = textViewArr[i11];
                if (i11 < arrayList.size()) {
                    String str3 = (String) arrayList.get(i11);
                    SpannableString spannableString = new SpannableString(str3);
                    int min = Math.min(str.length(), str3.length());
                    spannableString.setSpan(new ForegroundColorSpan(-4539718), 0, min, 33);
                    spannableString.setSpan(new ForegroundColorSpan(-1), min, str3.length(), 33);
                    textView2.setText(spannableString);
                    if (i11 == 0) {
                        shapeDrawable = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(5.0f), 452984831);
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
        return this.f43024a.getText().toString().trim();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(256.0f), View.MeasureSpec.getSize(i7)), View.MeasureSpec.getMode(i7)), i10);
    }

    public void setError(boolean z9) {
        if (this.f43032w != z9) {
            this.f43032w = z9;
            ImageView imageView = this.d;
            EditText editText = this.f43024a;
            org.telegram.ui.ActionBar.h6 h6Var = this.f43027e;
            if (z9) {
                int L = org.telegram.messenger.g0.L(16.0f);
                int i7 = org.telegram.ui.ActionBar.m6.f28150r7;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.r1(0.24f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var)));
                org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.24f, i7);
                setBackground(d02);
                org.telegram.ui.ActionBar.t6.j(this, d02, K, null, h6Var);
                int i10 = org.telegram.ui.ActionBar.m6.f28131q7;
                org.telegram.ui.ActionBar.t6.U(this.f43025b, i10, h6Var);
                org.telegram.ui.ActionBar.t6.U(editText, i10, h6Var);
                if (imageView != null) {
                    org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, PorterDuff.Mode.SRC_IN);
                }
                org.telegram.messenger.g0.H3(this);
            } else {
                int L2 = org.telegram.messenger.g0.L(16.0f);
                int i11 = org.telegram.ui.ActionBar.m6.f27834a7;
                ShapeDrawable d03 = org.telegram.ui.ActionBar.m6.d0(L2, org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(i11, h6Var)));
                org.telegram.ui.ActionBar.p6 K2 = org.telegram.ui.ActionBar.t6.K(0.5f, i11);
                setBackground(d03);
                org.telegram.ui.ActionBar.t6.j(this, d03, K2, null, h6Var);
                org.telegram.ui.ActionBar.t6.U(editText, org.telegram.ui.ActionBar.m6.G6, h6Var);
                if (imageView != null) {
                    org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.f28282y6, h6Var, PorterDuff.Mode.SRC_IN);
                }
                e();
                d();
            }
            Runnable runnable = this.f43029n;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void setOnErrorClearListener(Runnable runnable) {
        this.f43029n = runnable;
    }

    public void setOnNextListener(Runnable runnable) {
        this.f43030r = runnable;
    }

    public void setOnPasteListener(Runnable runnable) {
        this.h = runnable;
    }

    public void setOnTextChangedListener(Runnable runnable) {
        this.f43028f = runnable;
    }

    public void setText(String str) {
        EditText editText = this.f43024a;
        editText.setText(str);
        editText.setSelection(str.length());
        setError(false);
        e();
        d();
        a();
    }
}
