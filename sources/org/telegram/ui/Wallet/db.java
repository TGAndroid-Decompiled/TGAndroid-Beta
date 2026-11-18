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
import org.telegram.messenger.n10;
import org.telegram.ui.vm0;
public final class db extends FrameLayout {
    public final Rect E;
    public final Rect F;
    public final int[] G;
    public final int[] H;
    public final t1 I;
    public final s1 J;
    public int K;
    public int L;
    public int M;
    public int N;
    public final TextView[] O;
    public final EditText f44084a;
    public final TextView f44085b;
    public final TextView f44086c;
    public final ImageView d;
    public final org.telegram.ui.ActionBar.i6 f44087e;
    public Runnable f44088f;
    public Runnable h;
    public Runnable f44089n;
    public Runnable f44090r;
    public PopupWindow f44091s;
    public boolean f44092w;
    public LinearLayout f44093x;
    public ImageView f44094y;

    public db(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        float f10;
        this.E = new Rect();
        this.F = new Rect();
        this.G = new int[2];
        this.H = new int[2];
        this.I = new t1(this, 1);
        this.J = new s1(this, 2);
        this.O = new TextView[3];
        this.f44087e = i6Var;
        int L = org.telegram.messenger.g0.L(16.0f);
        int i10 = org.telegram.ui.ActionBar.n6.f29337a7;
        Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.r1(0.5f, org.telegram.ui.ActionBar.n6.w0(i10, i6Var)));
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.5f, i10);
        setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(this, d02, K, null, i6Var);
        setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
        TextView textView = new TextView(context);
        this.f44085b = textView;
        textView.setTextSize(15.0f);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setText((i7 + 1) + ".");
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.A6, i6Var);
        addView(textView, c8.ma.d(22, -2.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
        setClipChildren(false);
        EditText editText = new EditText(context);
        this.f44084a = editText;
        editText.setTextSize(16.0f);
        editText.setGravity(16);
        editText.setBackground(null);
        editText.setPadding(0, org.telegram.messenger.g0.L(15.0f), 0, org.telegram.messenger.g0.L(15.0f));
        editText.setIncludeFontPadding(false);
        editText.setSingleLine(true);
        editText.setImeOptions(5);
        editText.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.u6.D(editText, org.telegram.ui.ActionBar.n6.f29805z6, i6Var);
        org.telegram.ui.ActionBar.u6.U(editText, org.telegram.ui.ActionBar.n6.G6, i6Var);
        editText.setHint("");
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public final void onFocusChange(View view, boolean z11) {
                db dbVar = db.this;
                if (z11) {
                    dbVar.setError(false);
                    dbVar.e();
                    String lowerCase = dbVar.f44084a.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty()) {
                        dbVar.a();
                    } else {
                        dbVar.f(lowerCase);
                    }
                } else {
                    dbVar.a();
                    if (!dbVar.f44092w && !dbVar.b()) {
                        dbVar.setError(true);
                    }
                }
                dbVar.d();
            }
        });
        editText.addTextChangedListener(new i9(this, 3));
        if (z10) {
            f10 = 64.0f;
        } else {
            f10 = 8.0f;
        }
        addView(editText, c8.ma.d(-1, -1.0f, 16, 30.0f, 0.0f, f10, 0.0f));
        editText.setOnEditorActionListener(new h9(this, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, c8.ma.e(-2, -2, 21));
        if (z10) {
            TextView textView2 = new TextView(context);
            this.f44086c = textView2;
            textView2.setTextSize(14.0f);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setGravity(17);
            n10.r(textView2, org.telegram.ui.ActionBar.n6.f29634q6, i6Var, null, 2131742797);
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
            int L2 = org.telegram.messenger.g0.L(28.0f);
            int i11 = org.telegram.ui.ActionBar.n6.f29394d6;
            ShapeDrawable d03 = org.telegram.ui.ActionBar.n6.d0(L2, org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
            textView2.setBackground(d03);
            org.telegram.ui.ActionBar.u6.j(textView2, d03, M, null, i6Var);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final db f43973b;

                {
                    this.f43973b = this;
                }

                @Override
                public final void onClick(View view) {
                    CharSequence text;
                    switch (r2) {
                        case 0:
                            db dbVar = this.f43973b;
                            EditText editText2 = dbVar.f44084a;
                            try {
                                ClipboardManager clipboardManager = (ClipboardManager) dbVar.getContext().getSystemService("clipboard");
                                if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                    editText2.setText(text.toString().trim());
                                    editText2.setSelection(editText2.getText().length());
                                    Runnable runnable = dbVar.h;
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
                            EditText editText3 = this.f43973b.f44084a;
                            editText3.setText("");
                            editText3.setSelection(0);
                            return;
                    }
                }
            });
            frameLayout.addView(textView2, c8.ma.e(-2, -2, 17));
        } else {
            this.f44086c = null;
        }
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.f29786y6, i6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(2131231241);
        int i12 = org.telegram.ui.ActionBar.n6.f29486i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i12, i6Var), 3, -1);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M2, i6Var);
        imageView.setVisibility(8);
        imageView.setFocusable(false);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final db f43973b;

            {
                this.f43973b = this;
            }

            @Override
            public final void onClick(View view) {
                CharSequence text;
                switch (r2) {
                    case 0:
                        db dbVar = this.f43973b;
                        EditText editText2 = dbVar.f44084a;
                        try {
                            ClipboardManager clipboardManager = (ClipboardManager) dbVar.getContext().getSystemService("clipboard");
                            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                editText2.setText(text.toString().trim());
                                editText2.setSelection(editText2.getText().length());
                                Runnable runnable = dbVar.h;
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
                        EditText editText3 = this.f43973b.f44084a;
                        editText3.setText("");
                        editText3.setSelection(0);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, c8.ma.e(28, 28, 17));
        e();
        d();
    }

    public final void a() {
        PopupWindow popupWindow = this.f44091s;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f44091s.dismiss();
        }
    }

    public final boolean b() {
        String lowerCase = this.f44084a.getText().toString().trim().toLowerCase();
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
        Rect rect = this.E;
        getWindowVisibleDisplayFrame(rect);
        int[] iArr = this.G;
        getLocationOnScreen(iArr);
        int[] iArr2 = this.H;
        getLocationInWindow(iArr2);
        Rect rect2 = this.F;
        if (!getLocalVisibleRect(rect2)) {
            a();
            return;
        }
        rect2.offset(iArr[0], iArr[1]);
        if (!Rect.intersects(rect2, rect)) {
            a();
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.f44091s.getContentView();
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
        if (linearLayout.indexOfChild(this.f44094y) != i7) {
            linearLayout.removeView(this.f44094y);
            linearLayout.addView(this.f44094y, i7);
            ImageView imageView = this.f44094y;
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
        if (this.f44091s.isShowing()) {
            if (this.K != i10 || this.L != i11 || this.M != measuredWidth || this.N != measuredHeight) {
                this.f44091s.update(i10, i11, measuredWidth, measuredHeight);
            }
        } else {
            this.f44091s.setWidth(measuredWidth);
            this.f44091s.setHeight(measuredHeight);
            this.f44091s.showAtLocation(this, 51, i10, i11);
            getViewTreeObserver().addOnGlobalLayoutListener(this.I);
            getViewTreeObserver().addOnScrollChangedListener(this.J);
        }
        this.K = i10;
        this.L = i11;
        this.M = measuredWidth;
        this.N = measuredHeight;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.db.d():void");
    }

    public final void e() {
        boolean z10;
        int i7;
        if (!this.f44092w && this.f44084a.getText().length() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f44092w) {
            i7 = org.telegram.ui.ActionBar.n6.f29635q7;
        } else if (z10) {
            i7 = org.telegram.ui.ActionBar.n6.G6;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.A6;
        }
        org.telegram.ui.ActionBar.u6.U(this.f44085b, i7, this.f44087e);
    }

    public final void f(String str) {
        String[] mnemonicWordlist;
        ShapeDrawable shapeDrawable;
        int i7;
        if (this.f44084a.hasFocus() && !TextUtils.isEmpty(str) && str.length() >= 1 && WalletEngine2.getMnemonicWordlist().length != 0) {
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
            PopupWindow popupWindow = this.f44091s;
            TextView[] textViewArr = this.O;
            if (popupWindow == null) {
                PopupWindow popupWindow2 = new PopupWindow(context);
                this.f44091s = popupWindow2;
                popupWindow2.setOutsideTouchable(false);
                this.f44091s.setFocusable(false);
                this.f44091s.setInputMethodMode(1);
                this.f44091s.setBackgroundDrawable(null);
                this.f44091s.setElevation(org.telegram.messenger.g0.L(8.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setClipToPadding(false);
                ImageView imageView = new ImageView(context);
                this.f44094y = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f44094y.setColorFilter(new PorterDuffColorFilter(-872415232, PorterDuff.Mode.SRC_IN));
                this.f44094y.setImageResource(2131232843);
                linearLayout.addView(this.f44094y, c8.ma.t(18, 9, 1, 0, 0, 0, 0));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.f44093x = linearLayout2;
                linearLayout2.setOrientation(0);
                this.f44093x.setGravity(16);
                this.f44093x.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
                this.f44093x.setClipToPadding(false);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(-872415232);
                gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(8.0f));
                this.f44093x.setBackground(gradientDrawable);
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
                    textView.setOnClickListener(new vm0(this, i10, 4));
                    textViewArr[i10] = textView;
                    LinearLayout linearLayout3 = this.f44093x;
                    if (i10 == 0) {
                        i7 = 0;
                    } else {
                        i7 = 12;
                    }
                    linearLayout3.addView(textView, c8.ma.t(-2, -2, 16, i7, 0, 0, 0));
                }
                linearLayout.addView(this.f44093x, c8.ma.o(-2, -2));
                this.f44091s.setContentView(linearLayout);
                this.f44091s.setWidth(-2);
                this.f44091s.setHeight(-2);
                this.f44091s.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public final void onDismiss() {
                        db dbVar = db.this;
                        dbVar.getViewTreeObserver().removeOnGlobalLayoutListener(dbVar.I);
                        dbVar.getViewTreeObserver().removeOnScrollChangedListener(dbVar.J);
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
                        shapeDrawable = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(5.0f), 452984831);
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
        return this.f44084a.getText().toString().trim();
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

    public void setError(boolean z10) {
        if (this.f44092w != z10) {
            this.f44092w = z10;
            ImageView imageView = this.d;
            EditText editText = this.f44084a;
            org.telegram.ui.ActionBar.i6 i6Var = this.f44087e;
            if (z10) {
                int L = org.telegram.messenger.g0.L(16.0f);
                int i7 = org.telegram.ui.ActionBar.n6.f29654r7;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.r1(0.24f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var)));
                org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.24f, i7);
                setBackground(d02);
                org.telegram.ui.ActionBar.u6.j(this, d02, K, null, i6Var);
                int i10 = org.telegram.ui.ActionBar.n6.f29635q7;
                org.telegram.ui.ActionBar.u6.U(this.f44085b, i10, i6Var);
                org.telegram.ui.ActionBar.u6.U(editText, i10, i6Var);
                if (imageView != null) {
                    org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, PorterDuff.Mode.SRC_IN);
                }
                org.telegram.messenger.g0.F3(this);
            } else {
                int L2 = org.telegram.messenger.g0.L(16.0f);
                int i11 = org.telegram.ui.ActionBar.n6.f29337a7;
                ShapeDrawable d03 = org.telegram.ui.ActionBar.n6.d0(L2, org.telegram.ui.ActionBar.n6.r1(0.5f, org.telegram.ui.ActionBar.n6.w0(i11, i6Var)));
                org.telegram.ui.ActionBar.q6 K2 = org.telegram.ui.ActionBar.u6.K(0.5f, i11);
                setBackground(d03);
                org.telegram.ui.ActionBar.u6.j(this, d03, K2, null, i6Var);
                org.telegram.ui.ActionBar.u6.U(editText, org.telegram.ui.ActionBar.n6.G6, i6Var);
                if (imageView != null) {
                    org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.f29786y6, i6Var, PorterDuff.Mode.SRC_IN);
                }
                e();
                d();
            }
            Runnable runnable = this.f44089n;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void setOnErrorClearListener(Runnable runnable) {
        this.f44089n = runnable;
    }

    public void setOnNextListener(Runnable runnable) {
        this.f44090r = runnable;
    }

    public void setOnPasteListener(Runnable runnable) {
        this.h = runnable;
    }

    public void setOnTextChangedListener(Runnable runnable) {
        this.f44088f = runnable;
    }

    public void setText(String str) {
        EditText editText = this.f44084a;
        editText.setText(str);
        editText.setSelection(str.length());
        setError(false);
        e();
        d();
        a();
    }
}
